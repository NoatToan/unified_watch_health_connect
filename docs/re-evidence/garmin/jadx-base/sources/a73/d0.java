package a73;

import org.apache.commons.lang3.function.FailableDoubleUnaryOperator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d0 implements FailableDoubleUnaryOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FailableDoubleUnaryOperator f1826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FailableDoubleUnaryOperator f1827c;

    public /* synthetic */ d0(FailableDoubleUnaryOperator failableDoubleUnaryOperator, FailableDoubleUnaryOperator failableDoubleUnaryOperator2, int i14) {
        this.f1825a = i14;
        this.f1826b = failableDoubleUnaryOperator;
        this.f1827c = failableDoubleUnaryOperator2;
    }

    @Override // org.apache.commons.lang3.function.FailableDoubleUnaryOperator
    public final double applyAsDouble(double d14) {
        switch (this.f1825a) {
            case 0:
                return this.f1826b.lambda$compose$3(this.f1827c, d14);
            default:
                return this.f1826b.lambda$andThen$2(this.f1827c, d14);
        }
    }
}
