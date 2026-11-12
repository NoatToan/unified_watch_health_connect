package a73;

import org.apache.commons.lang3.function.FailableIntUnaryOperator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m0 implements FailableIntUnaryOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FailableIntUnaryOperator f1863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FailableIntUnaryOperator f1864c;

    public /* synthetic */ m0(FailableIntUnaryOperator failableIntUnaryOperator, FailableIntUnaryOperator failableIntUnaryOperator2, int i14) {
        this.f1862a = i14;
        this.f1863b = failableIntUnaryOperator;
        this.f1864c = failableIntUnaryOperator2;
    }

    @Override // org.apache.commons.lang3.function.FailableIntUnaryOperator
    public final int applyAsInt(int i14) {
        switch (this.f1862a) {
            case 0:
                return this.f1863b.lambda$compose$3(this.f1864c, i14);
            default:
                return this.f1863b.lambda$andThen$2(this.f1864c, i14);
        }
    }
}
