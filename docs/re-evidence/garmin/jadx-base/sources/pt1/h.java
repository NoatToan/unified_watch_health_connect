package pt1;

import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpt1/h;", "", "", "isLoading", "areFiltersApplied", "Lus1/k;", "trailsSortingMethod", "Li53/c;", "Lpt1/t;", "savedTrails", "allTrailsFiltered", "", "searchTerm", "<init>", "(ZZLus1/k;Li53/c;ZLjava/lang/String;)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f140850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f140851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final us1.k f140852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<t> f140853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f140854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f140855f;

    public h(boolean z14, boolean z15, us1.k kVar, i53.c cVar, boolean z16, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? us1.k.MOST_POPULAR : kVar, (i14 & 8) != 0 ? j53.l.b() : cVar, (i14 & 16) != 0 ? false : z16, (i14 & 32) != 0 ? "" : str);
    }

    public static h a(h hVar, boolean z14, boolean z15, us1.k kVar, i53.c cVar, boolean z16, String str, int i14) {
        if ((i14 & 1) != 0) {
            z14 = hVar.f140850a;
        }
        boolean z17 = z14;
        if ((i14 & 2) != 0) {
            z15 = hVar.f140851b;
        }
        boolean z18 = z15;
        if ((i14 & 4) != 0) {
            kVar = hVar.f140852c;
        }
        us1.k kVar2 = kVar;
        if ((i14 & 8) != 0) {
            cVar = hVar.f140853d;
        }
        i53.c cVar2 = cVar;
        if ((i14 & 16) != 0) {
            z16 = hVar.f140854e;
        }
        boolean z19 = z16;
        if ((i14 & 32) != 0) {
            str = hVar.f140855f;
        }
        String str2 = str;
        hVar.getClass();
        kVar2.getClass();
        cVar2.getClass();
        str2.getClass();
        return new h(z17, z18, kVar2, cVar2, z19, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f140850a == hVar.f140850a && this.f140851b == hVar.f140851b && this.f140852c == hVar.f140852c && p005kotlin.jvm.internal.s.g(this.f140853d, hVar.f140853d) && this.f140854e == hVar.f140854e && p005kotlin.jvm.internal.s.g(this.f140855f, hVar.f140855f);
    }

    public final int hashCode() {
        return this.f140855f.hashCode() + q6.f.g(l2.a(this.f140853d, (this.f140852c.hashCode() + q6.f.g(Boolean.hashCode(this.f140850a) * 31, 31, this.f140851b)) * 31, 31), 31, this.f140854e);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("SavedTrailsScreenState(isLoading=", ", areFiltersApplied=", ", trailsSortingMethod=", this.f140850a, this.f140851b);
        sbM.append(this.f140852c);
        sbM.append(", savedTrails=");
        sbM.append(this.f140853d);
        sbM.append(", allTrailsFiltered=");
        sbM.append(this.f140854e);
        sbM.append(", searchTerm=");
        sbM.append(this.f140855f);
        sbM.append(")");
        return sbM.toString();
    }

    public h(boolean z14, boolean z15, us1.k kVar, i53.c<t> cVar, boolean z16, String str) {
        kVar.getClass();
        cVar.getClass();
        str.getClass();
        this.f140850a = z14;
        this.f140851b = z15;
        this.f140852c = kVar;
        this.f140853d = cVar;
        this.f140854e = z16;
        this.f140855f = str;
    }

    public h() {
        this(false, false, null, null, false, null, 63, null);
    }
}
