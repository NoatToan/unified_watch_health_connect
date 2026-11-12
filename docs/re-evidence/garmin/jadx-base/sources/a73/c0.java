package a73;

import org.apache.commons.lang3.function.FailableDoubleUnaryOperator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c0 implements FailableDoubleUnaryOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1823a;

    public /* synthetic */ c0(int i14) {
        this.f1823a = i14;
    }

    @Override // org.apache.commons.lang3.function.FailableDoubleUnaryOperator
    public final double applyAsDouble(double d14) {
        switch (this.f1823a) {
            case 0:
                return FailableDoubleUnaryOperator.lambda$identity$1(d14);
            default:
                return FailableDoubleUnaryOperator.lambda$static$0(d14);
        }
    }
}
