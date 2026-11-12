package pt1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpt1/w;", "", "", "firstPageLoading", "isLoading", "Lus1/e;", "sortType", "Li53/c;", "Lpt1/x;", "reviews", "endOfLoading", "reviewOperationInProgress", "isError", "<init>", "(ZZLus1/e;Li53/c;ZZZ)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f140997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f140998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final us1.e f140999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<x> f141000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f141001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f141002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f141003g;

    public /* synthetic */ w(boolean z14, boolean z15, us1.e eVar, i53.c cVar, boolean z16, boolean z17, boolean z18, int i14, p005kotlin.jvm.internal.j jVar) {
        this(z14, z15, eVar, (i14 & 8) != 0 ? null : cVar, (i14 & 16) != 0 ? false : z16, (i14 & 32) != 0 ? false : z17, (i14 & 64) != 0 ? false : z18);
    }

    public static w a(w wVar, boolean z14, boolean z15, i53.c cVar, boolean z16, boolean z17, boolean z18, int i14) {
        if ((i14 & 1) != 0) {
            z14 = wVar.f140997a;
        }
        boolean z19 = z14;
        if ((i14 & 2) != 0) {
            z15 = wVar.f140998b;
        }
        boolean z24 = z15;
        us1.e eVar = wVar.f140999c;
        if ((i14 & 8) != 0) {
            cVar = wVar.f141000d;
        }
        i53.c cVar2 = cVar;
        if ((i14 & 16) != 0) {
            z16 = wVar.f141001e;
        }
        boolean z25 = z16;
        if ((i14 & 32) != 0) {
            z17 = wVar.f141002f;
        }
        boolean z26 = z17;
        if ((i14 & 64) != 0) {
            z18 = wVar.f141003g;
        }
        wVar.getClass();
        eVar.getClass();
        return new w(z19, z24, eVar, cVar2, z25, z26, z18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f140997a == wVar.f140997a && this.f140998b == wVar.f140998b && this.f140999c == wVar.f140999c && p005kotlin.jvm.internal.s.g(this.f141000d, wVar.f141000d) && this.f141001e == wVar.f141001e && this.f141002f == wVar.f141002f && this.f141003g == wVar.f141003g;
    }

    public final int hashCode() {
        int iHashCode = (this.f140999c.hashCode() + q6.f.g(Boolean.hashCode(this.f140997a) * 31, 31, this.f140998b)) * 31;
        i53.c<x> cVar = this.f141000d;
        return Boolean.hashCode(this.f141003g) + q6.f.g(q6.f.g((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.f141001e), 31, this.f141002f);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("TrailReviewSectionState(firstPageLoading=", ", isLoading=", ", sortType=", this.f140997a, this.f140998b);
        sbM.append(this.f140999c);
        sbM.append(", reviews=");
        sbM.append(this.f141000d);
        sbM.append(", endOfLoading=");
        kg.f.q(", reviewOperationInProgress=", ", isError=", sbM, this.f141001e, this.f141002f);
        return hb.a.k(sbM, this.f141003g, ")");
    }

    public w(boolean z14, boolean z15, us1.e eVar, i53.c<x> cVar, boolean z16, boolean z17, boolean z18) {
        eVar.getClass();
        this.f140997a = z14;
        this.f140998b = z15;
        this.f140999c = eVar;
        this.f141000d = cVar;
        this.f141001e = z16;
        this.f141002f = z17;
        this.f141003g = z18;
    }
}
