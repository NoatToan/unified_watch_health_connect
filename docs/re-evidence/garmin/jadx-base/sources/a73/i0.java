package a73;

import org.apache.commons.lang3.function.FailableIntPredicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i0 implements FailableIntPredicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FailableIntPredicate f1848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FailableIntPredicate f1849c;

    public /* synthetic */ i0(FailableIntPredicate failableIntPredicate, FailableIntPredicate failableIntPredicate2, int i14) {
        this.f1847a = i14;
        this.f1848b = failableIntPredicate;
        this.f1849c = failableIntPredicate2;
    }

    @Override // org.apache.commons.lang3.function.FailableIntPredicate
    public final boolean test(int i14) {
        switch (this.f1847a) {
            case 0:
                return this.f1848b.lambda$and$2(this.f1849c, i14);
            default:
                return this.f1848b.lambda$or$4(this.f1849c, i14);
        }
    }
}
