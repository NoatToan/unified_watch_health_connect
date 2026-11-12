package a73;

import org.apache.commons.lang3.function.FailableIntUnaryOperator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l0 implements FailableIntUnaryOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1858a;

    public /* synthetic */ l0(int i14) {
        this.f1858a = i14;
    }

    @Override // org.apache.commons.lang3.function.FailableIntUnaryOperator
    public final int applyAsInt(int i14) {
        switch (this.f1858a) {
            case 0:
                return FailableIntUnaryOperator.lambda$static$0(i14);
            default:
                return FailableIntUnaryOperator.lambda$identity$1(i14);
        }
    }
}
