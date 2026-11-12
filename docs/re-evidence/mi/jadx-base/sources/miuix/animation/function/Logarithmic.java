package miuix.animation.function;

/* JADX INFO: loaded from: classes3.dex */
public class Logarithmic implements Differentiable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f26268a;
    private Function derivative;
    private final boolean isLn;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final double f26269k;

    public Logarithmic(double d) {
        this(1.0d, d);
    }

    @Override // miuix.animation.function.Differentiable, miuix.animation.function.Function
    public double apply(double d) {
        return this.isLn ? this.f26269k * Math.log(d) : (this.f26269k * Math.log(d)) / Math.log(this.f26268a);
    }

    @Override // miuix.animation.function.Differentiable
    public Function derivative() {
        if (this.derivative == null) {
            this.derivative = new InverseProportional(this.isLn ? this.f26269k : this.f26269k / Math.log(this.f26268a));
        }
        return this.derivative;
    }

    public Logarithmic(double d, double d2) {
        this.f26269k = d;
        this.f26268a = d2;
        this.isLn = d2 == 2.718281828459045d;
    }
}
