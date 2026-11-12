package org.apache.commons.lang3.compare;

import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparable f133456b;

    public /* synthetic */ a(Comparable comparable, int i14) {
        this.f133455a = i14;
        this.f133456b = comparable;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f133455a) {
            case 0:
                return ComparableUtils.lambda$ge$2(this.f133456b, (Comparable) obj);
            case 1:
                return ComparableUtils.lambda$gt$3(this.f133456b, (Comparable) obj);
            case 2:
                return ComparableUtils.lambda$lt$5(this.f133456b, (Comparable) obj);
            default:
                return ComparableUtils.lambda$le$4(this.f133456b, (Comparable) obj);
        }
    }
}
