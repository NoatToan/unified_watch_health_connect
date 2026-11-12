package a73;

import org.apache.commons.lang3.function.FailablePredicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u0 implements FailablePredicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FailablePredicate f1890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FailablePredicate f1891c;

    public /* synthetic */ u0(FailablePredicate failablePredicate, FailablePredicate failablePredicate2, int i14) {
        this.f1889a = i14;
        this.f1890b = failablePredicate;
        this.f1891c = failablePredicate2;
    }

    @Override // org.apache.commons.lang3.function.FailablePredicate
    public final boolean test(Object obj) {
        switch (this.f1889a) {
            case 0:
                return this.f1890b.lambda$or$4(this.f1891c, obj);
            default:
                return this.f1890b.lambda$and$2(this.f1891c, obj);
        }
    }
}
