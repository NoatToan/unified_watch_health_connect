package iy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Liy0/k;", "", "Liy0/j;", "distanceRange", "elevationRange", "<init>", "(Liy0/j;Liy0/j;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f95808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f95809b;

    public k(j jVar, j jVar2) {
        jVar.getClass();
        jVar2.getClass();
        this.f95808a = jVar;
        this.f95809b = jVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f95808a.equals(kVar.f95808a) && this.f95809b.equals(kVar.f95809b);
    }

    public final int hashCode() {
        return this.f95809b.hashCode() + (this.f95808a.hashCode() * 31);
    }

    public final String toString() {
        return "ComputedMinMax(distanceRange=" + this.f95808a + ", elevationRange=" + this.f95809b + ")";
    }
}
