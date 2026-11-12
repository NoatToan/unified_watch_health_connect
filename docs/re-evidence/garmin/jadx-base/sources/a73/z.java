package a73;

import org.apache.commons.lang3.function.FailableDoublePredicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z implements FailableDoublePredicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FailableDoublePredicate f1900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FailableDoublePredicate f1901c;

    public /* synthetic */ z(FailableDoublePredicate failableDoublePredicate, FailableDoublePredicate failableDoublePredicate2, int i14) {
        this.f1899a = i14;
        this.f1900b = failableDoublePredicate;
        this.f1901c = failableDoublePredicate2;
    }

    @Override // org.apache.commons.lang3.function.FailableDoublePredicate
    public final boolean test(double d14) {
        switch (this.f1899a) {
            case 0:
                return this.f1900b.lambda$or$4(this.f1901c, d14);
            default:
                return this.f1900b.lambda$and$2(this.f1901c, d14);
        }
    }
}
