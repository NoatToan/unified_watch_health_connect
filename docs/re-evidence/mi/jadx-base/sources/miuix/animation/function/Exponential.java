package miuix.animation.function;

/* JADX INFO: loaded from: classes3.dex */
public class Exponential implements Differentiable {
    public static final Exponential EXP = new Exponential();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f26265a;
    private Function derivative;
    private final boolean isExp;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final double f26266k;

    private Exponential() {
        this(1.0d, 2.718281828459045d);
        this.derivative = this;
    }

    @Override // miuix.animation.function.Differentiable, miuix.animation.function.Function
    public double apply(double d) {
        return this.f26266k * (this.isExp ? Math.pow(this.f26265a, d) : Math.exp(d));
    }

    @Override // miuix.animation.function.Differentiable
    public Function derivative() {
        if (this.derivative == null) {
            this.derivative = this.isExp ? new Exponential(this.f26266k, 2.718281828459045d) : new Exponential(this.f26266k * Math.log(this.f26265a), this.f26265a);
        }
        return this.derivative;
    }

    public Exponential(double d) {
        this(1.0d, d);
    }

    public Exponential(double d, double d2) {
        this.f26266k = d;
        this.f26265a = d2;
        this.isExp = d2 == 2.718281828459045d;
    }
}
