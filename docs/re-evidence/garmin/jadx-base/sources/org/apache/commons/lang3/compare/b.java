package org.apache.commons.lang3.compare;

import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparable f133458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Comparable f133459c;

    public /* synthetic */ b(Comparable comparable, Comparable comparable2, int i14) {
        this.f133457a = i14;
        this.f133458b = comparable;
        this.f133459c = comparable2;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f133457a) {
            case 0:
                return ComparableUtils.lambda$between$0(this.f133458b, this.f133459c, (Comparable) obj);
            default:
                return ComparableUtils.lambda$betweenExclusive$1(this.f133458b, this.f133459c, (Comparable) obj);
        }
    }
}
