package us1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lus1/n;", "", "Li53/c;", "Lus1/i;", "trailFeatures", "Lus1/m;", "trailTypes", "", "noRatingTrailsAllowed", "Lus1/j;", "trailRatings", "Lus1/h;", "trailDifficulties", "Lqs1/n;", "distanceSearchRange", "elevationSearchRange", "<init>", "(Li53/c;Li53/c;ZLi53/c;Li53/c;Lqs1/n;Lqs1/n;)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<i> f172443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<m> f172444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f172445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<j> f172446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i53.c<h> f172447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qs1.n f172448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qs1.n f172449g;

    public /* synthetic */ n(i53.c cVar, i53.c cVar2, boolean z14, i53.c cVar3, i53.c cVar4, qs1.n nVar, qs1.n nVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : cVar, (i14 & 2) != 0 ? null : cVar2, (i14 & 4) != 0 ? true : z14, (i14 & 8) != 0 ? null : cVar3, (i14 & 16) != 0 ? null : cVar4, (i14 & 32) != 0 ? null : nVar, (i14 & 64) != 0 ? null : nVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return s.g(this.f172443a, nVar.f172443a) && s.g(this.f172444b, nVar.f172444b) && this.f172445c == nVar.f172445c && s.g(this.f172446d, nVar.f172446d) && s.g(this.f172447e, nVar.f172447e) && s.g(this.f172448f, nVar.f172448f) && s.g(this.f172449g, nVar.f172449g);
    }

    public final int hashCode() {
        i53.c<i> cVar = this.f172443a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        i53.c<m> cVar2 = this.f172444b;
        int iG = q6.f.g((iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31, 31, this.f172445c);
        i53.c<j> cVar3 = this.f172446d;
        int iHashCode2 = (iG + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        i53.c<h> cVar4 = this.f172447e;
        int iHashCode3 = (iHashCode2 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31;
        qs1.n nVar = this.f172448f;
        int iHashCode4 = (iHashCode3 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        qs1.n nVar2 = this.f172449g;
        return iHashCode4 + (nVar2 != null ? nVar2.hashCode() : 0);
    }

    public final String toString() {
        return "TrailsFilters(trailFeatures=" + this.f172443a + ", trailTypes=" + this.f172444b + ", noRatingTrailsAllowed=" + this.f172445c + ", trailRatings=" + this.f172446d + ", trailDifficulties=" + this.f172447e + ", distanceSearchRange=" + this.f172448f + ", elevationSearchRange=" + this.f172449g + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(i53.c<? extends i> cVar, i53.c<? extends m> cVar2, boolean z14, i53.c<? extends j> cVar3, i53.c<? extends h> cVar4, qs1.n nVar, qs1.n nVar2) {
        this.f172443a = cVar;
        this.f172444b = cVar2;
        this.f172445c = z14;
        this.f172446d = cVar3;
        this.f172447e = cVar4;
        this.f172448f = nVar;
        this.f172449g = nVar2;
    }

    public n() {
        this(null, null, false, null, null, null, null, 127, null);
    }
}
