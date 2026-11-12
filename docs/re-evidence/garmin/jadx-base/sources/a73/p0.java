package a73;

import org.apache.commons.lang3.function.FailableLongPredicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p0 implements FailableLongPredicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FailableLongPredicate f1873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FailableLongPredicate f1874c;

    public /* synthetic */ p0(FailableLongPredicate failableLongPredicate, FailableLongPredicate failableLongPredicate2, int i14) {
        this.f1872a = i14;
        this.f1873b = failableLongPredicate;
        this.f1874c = failableLongPredicate2;
    }

    @Override // org.apache.commons.lang3.function.FailableLongPredicate
    public final boolean test(long j8) {
        switch (this.f1872a) {
            case 0:
                return this.f1873b.lambda$and$2(this.f1874c, j8);
            default:
                return this.f1873b.lambda$or$4(this.f1874c, j8);
        }
    }
}
