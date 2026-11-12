package a73;

import org.apache.commons.lang3.function.FailableLongUnaryOperator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s0 implements FailableLongUnaryOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1881a;

    public /* synthetic */ s0(int i14) {
        this.f1881a = i14;
    }

    @Override // org.apache.commons.lang3.function.FailableLongUnaryOperator
    public final long applyAsLong(long j8) {
        switch (this.f1881a) {
            case 0:
                return FailableLongUnaryOperator.lambda$identity$1(j8);
            default:
                return FailableLongUnaryOperator.lambda$static$0(j8);
        }
    }
}
