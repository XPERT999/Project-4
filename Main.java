public class Main
{
    private double r;
    private double i;
    
    public static void main(String[] args)
    {
        Complex a = new Complex(5.0, 6.0);
        Complex b = new Complex(-3.0, 4.0);
        int i =5;
        
        System.out.println("(" + a + ")" + " + " + "(" + b + ")" + " = " + "(" + a.plus(b) + ")");
        System.out.println("(" + a + ")" + " - " + "(" + b + ")" + " = " + "(" + a.minus(b) + ")");
        System.out.println("(" + a + ")" + " * " + "(" + b + ")" + " = "  + "(" + a.times(b) + ")");
        System.out.println("(" + a + ")" +  " / " + "(" + b + ")" + " = "  + "(" + a.divides(b) + ")");

        System.out.println("(" + a + ")" + " + " + i + " = "  + "(" + a.plus(i) + ")");
        System.out.println("(" + a + ")" + " - " + i + " = "  + "(" + a.minus(i) + ")");
        System.out.println("(" + a + ")" + " * " + i + " = "  + "(" + a.times(i) + ")");
        System.out.println("(" + a + ")" + " / " + i + " = "  + "(" + a.divides(i) + ")");

    }
    
    public double abs()
    {
        return Math.hypot(r, i);
    }
    
    public double phase()
    {
        return Math.atan2(i, r);
    }
 
    public Complex(double real, double imag)
    {
        r = real;
        i = imag;
    }
 
    public String toString()
    {
        if (i == 0) return r + "";
        if (r == 0) return i + "i";
        if (i <  0) return r + " - " + (-i) + "i";
        return r + " + " + i + "i";
    }
 
    public Complex plus(Complex b)
    {
        Complex a = this;
        double real = a.r + b.r;
        double imag = a.i + b.i;
        return new Complex(real, imag);
    }
    
    public Complex plus(int i)
    {
        return new Complex(re() + i, im());
    }
    
    public Complex minus(int i)
    {
        return new Complex(re() - i, im());
    }
    
    public Complex times(int i)
    {
        return new Complex(re() * i, im());
    }
    
    public Complex divides(int i)
    {
        return new Complex(Math.round(re() / i), im());
    }
 
    public Complex minus(Complex b)
    {
        Complex a = this;
        double real = a.r - b.r;
        double imag = a.i - b.i;
        return new Complex(real, imag);
    }
 
    public Complex times(Complex b)
    {
        Complex a = this;
        double real = a.r * b.r - a.i * b.i;
        double imag = a.r * b.i + a.i * b.r;
        return new Complex(real, imag);
    }
 
    public Complex times(double alpha)
    {
        return new Complex(alpha * r, alpha * i);
    }
 
    public Complex conjugate()
    {
    return new Complex(r, -i);
    
    }
 
    public Complex reciprocal()
    {
        double scale = r*r + i*i;
        return new Complex(r / scale, -i / scale);
    }
 
    public double re()
    {
        return r;
    }
    
    public double im()
    {
    return i;
    }
 
    public Complex divides(Complex b)
    {
        Complex a = this;
        return a.times(b.reciprocal());
    }
 
    public static Complex plus(Complex a, Complex b)
    {
        double real = a.r + b.r;
        double imag = a.i + b.i;
        Complex sum = new Complex(real, imag);
        return sum;
    }

}
