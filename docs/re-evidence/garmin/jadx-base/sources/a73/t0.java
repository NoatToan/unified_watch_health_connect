package a73;

import org.apache.commons.lang3.function.FailableLongUnaryOperator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t0 implements FailableLongUnaryOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FailableLongUnaryOperator f1884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FailableLongUnaryOperator f1885c;

    public /* synthetic */ t0(FailableLongUnaryOperator failableLongUnaryOperator, FailableLongUnaryOperator failableLongUnaryOperator2, int i14) {
        this.f1883a = i14;
        this.f1884b = failableLongUnaryOperator;
        this.f1885c = failableLongUnaryOperator2;
    }

    @Override // org.apache.commons.lang3.function.FailableLongUnaryOperator
    public final long applyAsLong(long j8) {
        switch (this.f1883a) {
            case 0:
                return this.f1884b.lambda$andThen$2(this.f1885c, j8);
            default:
                return this.f1884b.lambda$compose$3(this.f1885c, j8);
        }
    }
}
