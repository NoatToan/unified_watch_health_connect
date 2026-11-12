package a73;

import org.apache.commons.lang3.function.FailableBiPredicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements FailableBiPredicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FailableBiPredicate f1887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FailableBiPredicate f1888c;

    public /* synthetic */ u(FailableBiPredicate failableBiPredicate, FailableBiPredicate failableBiPredicate2, int i14) {
        this.f1886a = i14;
        this.f1887b = failableBiPredicate;
        this.f1888c = failableBiPredicate2;
    }

    @Override // org.apache.commons.lang3.function.FailableBiPredicate
    public final boolean test(Object obj, Object obj2) {
        switch (this.f1886a) {
            case 0:
                return this.f1887b.lambda$and$2(this.f1888c, obj, obj2);
            default:
                return this.f1887b.lambda$or$4(this.f1888c, obj, obj2);
        }
    }
}
