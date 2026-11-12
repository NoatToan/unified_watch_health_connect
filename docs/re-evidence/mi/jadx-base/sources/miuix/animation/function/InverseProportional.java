package miuix.animation.function;

/* JADX INFO: loaded from: classes3.dex */
public class InverseProportional implements Differentiable {
    private Function derivative;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final double f26267k;

    public InverseProportional(double d) {
        this.f26267k = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ double lambda$derivative$0(double d) {
        return ((-this.f26267k) / d) / d;
    }

    @Override // miuix.animation.function.Differentiable, miuix.animation.function.Function
    public double apply(double d) {
        return this.f26267k / d;
    }

    @Override // miuix.animation.function.Differentiable
    public Function derivative() {
        if (this.derivative == null) {
            this.derivative = new Function() { // from class: jhd
                @Override // miuix.animation.function.Function
                public final double apply(double d) {
                    return this.f22807a.lambda$derivative$0(d);
                }
            };
        }
        return this.derivative;
    }
}
