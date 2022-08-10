class Complex:
    def init(self, real=0, imag=0):
        self.real = real
        self.imag = imag

    def add(self, other):
        if isinstance(other, int):
            return Complex(self.real + other, self.imag)
        elif isinstance(other, Complex):
            return Complex(self.real + other.real, self.imag + other.imag)
        else:
            raise TypeError
    
    def sub(self, other):
        if isinstance(other, int):
            return Complex(self.real - other, self.imag)
        elif isinstance(other, Complex):
            return Complex(self.real - other.real, self.imag - other.imag)
        else:
            raise TypeError

    def mul(self, other):
        if isinstance(other, int):
            return Complex(self.real * other, self.imag)
        elif isinstance(other, Complex):
            return Complex(self.real * other.real, self.imag * other.imag)
        else:
            raise TypeError

    def truediv(self, other):
        if isinstance(other, int):
            return Complex(self.real / other, self.imag)
        elif isinstance(other, Complex):
            return Complex(self.real / other.real, self.imag / other.imag)
        else:
            raise TypeError

    def radd(self, other):
        return self + other

    def rsub(self, other):
        return self - other

    def rmul(self, other):
        return self * other

    def rtruediv(self, other):
        return self / other

    
    def str(self):
        return '(%g + %gi)' % (self.real, self.imag)

if name == 'main':

    a = Complex(5, 6)
    b = Complex(-3, 4)
    
    i = 5
    
    print('%s + %s = %s' % (a, b, a + b))
    print('%s - %s = %s' % (a, b, a - b))
    print('%s * %s = %s' % (a, b, a * b))
    print('%s / %s = %s' % (a, b, a / b))

    print('%s + %i = %s' % (a, i, a + i))
    print('%s - %i = %s' % (a, i, a - i))
    print('%s * %i = %s' % (a, i, a * i))
    print('%s / %i = %s' % (a, i, a / i))

    print('%i + %s = %s' % (i, a, i + a))
    print('%i - %s = %s' % (i, a, i - a))
    print('%i * %s = %s' % (i, a, i * a))
    print('%i / %s = %s' % (i, a, i / a))
