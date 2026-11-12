package miuix.animation.function;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class CriticalDamping implements Damping {
    private final double c1;
    private final double c2;
    private Function derivative;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final double f26264r;
    private final double xStar;

    public CriticalDamping(double d, double d2, double d3, double d4) {
        this.c1 = d;
        this.c2 = d2;
        this.f26264r = d3;
        this.xStar = d4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ double lambda$derivative$0(double d) {
        double d2 = this.c1;
        double d3 = this.f26264r;
        return ((d2 * d3) + (this.c2 * ((d3 * d) + 1.0d))) * Math.exp(d3 * d);
    }

    @Override // miuix.animation.function.Damping, miuix.animation.function.Differentiable, miuix.animation.function.Function
    public double apply(double d) {
        return ((this.c1 + (this.c2 * d)) * Math.exp(this.f26264r * d)) + this.xStar;
    }

    @Override // miuix.animation.function.Damping, miuix.animation.function.Differentiable
    public Function derivative() {
        if (this.derivative == null) {
            this.derivative = new Function() { // from class: m45
                @Override // miuix.animation.function.Function
                public final double apply(double d) {
                    return this.f25733a.lambda$derivative$0(d);
                }
            };
        }
        return this.derivative;
    }

    public String toString() {
        return String.format(Locale.getDefault(), "CriticalDamping{c1=%.3f c2=%.3f r=%.3f x*=%.3f}", Double.valueOf(this.c1), Double.valueOf(this.c2), Double.valueOf(this.f26264r), Double.valueOf(this.xStar));
    }
}
