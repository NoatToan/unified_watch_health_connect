package pt1;

import ds.e0;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0017\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lpt1/t;", "", "", "curatedCourseId", "connectCourseId", "Lpt1/q;", "trailHeaderState", "Li53/c;", "Lus1/i;", "features", "Lke2/b;", "startLocation", "", "coverImageUrl", "Lo20/a;", "elevationData", "Lpt1/s;", "polylineData", "distanceMeters", "distanceString", "ascentMeters", "ascentString", "descentString", "", "addedToSavedTrails", "", "rating", "", "reviewsCount", "closed", "underReview", "Lcom/garmin/android/library/mapsdkadapter/i$d;", "mapProvider", "<init>", "(JJLpt1/q;Li53/c;Lke2/b;Ljava/lang/String;Li53/c;Lpt1/s;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;ZFIZZLcom/garmin/android/library/mapsdkadapter/i$d;)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f140967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f140968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f140969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<us1.i> f140970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ke2.b f140971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f140972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i53.c<o20.a> f140973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f140974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f140975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f140976j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f140977k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f140978l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f140979m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f140980n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f140981o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f140982p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f140983q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f140984r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.garmin.android.library.mapsdkadapter.i.d f140985s;

    public /* synthetic */ t(long j8, long j14, q qVar, i53.c cVar, ke2.b bVar, String str, i53.c cVar2, s sVar, long j15, String str2, long j16, String str3, String str4, boolean z14, float f14, int i14, boolean z15, boolean z16, com.garmin.android.library.mapsdkadapter.i.d dVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, qVar, (i15 & 8) != 0 ? null : cVar, (i15 & 16) != 0 ? null : bVar, (i15 & 32) != 0 ? null : str, (i15 & 64) != 0 ? null : cVar2, (i15 & 128) != 0 ? null : sVar, j15, str2, j16, str3, str4, (i15 & 8192) != 0 ? false : z14, f14, i14, (65536 & i15) != 0 ? false : z15, (i15 & 131072) != 0 ? false : z16, dVar);
    }

    public static t a(t tVar, i53.c cVar, boolean z14, int i14) {
        long j8 = tVar.f140967a;
        long j14 = tVar.f140968b;
        q qVar = tVar.f140969c;
        i53.c<us1.i> cVar2 = tVar.f140970d;
        ke2.b bVar = tVar.f140971e;
        String str = tVar.f140972f;
        i53.c cVar3 = (i14 & 64) != 0 ? tVar.f140973g : cVar;
        s sVar = tVar.f140974h;
        long j15 = tVar.f140975i;
        String str2 = tVar.f140976j;
        long j16 = tVar.f140977k;
        String str3 = tVar.f140978l;
        i53.c cVar4 = cVar3;
        String str4 = tVar.f140979m;
        boolean z15 = (i14 & 8192) != 0 ? tVar.f140980n : z14;
        float f14 = tVar.f140981o;
        int i15 = tVar.f140982p;
        boolean z16 = tVar.f140983q;
        boolean z17 = tVar.f140984r;
        com.garmin.android.library.mapsdkadapter.i.d dVar = tVar.f140985s;
        tVar.getClass();
        qVar.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        dVar.getClass();
        return new t(j8, j14, qVar, cVar2, bVar, str, cVar4, sVar, j15, str2, j16, str3, str4, z15, f14, i15, z16, z17, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f140967a == tVar.f140967a && this.f140968b == tVar.f140968b && p005kotlin.jvm.internal.s.g(this.f140969c, tVar.f140969c) && p005kotlin.jvm.internal.s.g(this.f140970d, tVar.f140970d) && p005kotlin.jvm.internal.s.g(this.f140971e, tVar.f140971e) && p005kotlin.jvm.internal.s.g(this.f140972f, tVar.f140972f) && p005kotlin.jvm.internal.s.g(this.f140973g, tVar.f140973g) && p005kotlin.jvm.internal.s.g(this.f140974h, tVar.f140974h) && this.f140975i == tVar.f140975i && p005kotlin.jvm.internal.s.g(this.f140976j, tVar.f140976j) && this.f140977k == tVar.f140977k && p005kotlin.jvm.internal.s.g(this.f140978l, tVar.f140978l) && p005kotlin.jvm.internal.s.g(this.f140979m, tVar.f140979m) && this.f140980n == tVar.f140980n && Float.compare(this.f140981o, tVar.f140981o) == 0 && this.f140982p == tVar.f140982p && this.f140983q == tVar.f140983q && this.f140984r == tVar.f140984r && this.f140985s == tVar.f140985s;
    }

    public final int hashCode() {
        int iHashCode = (this.f140969c.hashCode() + q6.f.e(Long.hashCode(this.f140967a) * 31, 31, this.f140968b)) * 31;
        i53.c<us1.i> cVar = this.f140970d;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        ke2.b bVar = this.f140971e;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f140972f;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        i53.c<o20.a> cVar2 = this.f140973g;
        int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        s sVar = this.f140974h;
        return this.f140985s.hashCode() + q6.f.g(q6.f.g(q2.d(this.f140982p, q6.f.d(this.f140981o, q6.f.g(wr.g.j(wr.g.j(q6.f.e(wr.g.j(q6.f.e((iHashCode5 + (sVar != null ? sVar.hashCode() : 0)) * 31, 31, this.f140975i), 31, this.f140976j), 31, this.f140977k), 31, this.f140978l), 31, this.f140979m), 31, this.f140980n), 31), 31), 31, this.f140983q), 31, this.f140984r);
    }

    public final String toString() {
        StringBuilder sbK = e0.k(this.f140967a, "TrailPreviewState(curatedCourseId=", ", connectCourseId=");
        sbK.append(this.f140968b);
        sbK.append(", trailHeaderState=");
        sbK.append(this.f140969c);
        sbK.append(", features=");
        sbK.append(this.f140970d);
        sbK.append(", startLocation=");
        sbK.append(this.f140971e);
        sbK.append(", coverImageUrl=");
        sbK.append(this.f140972f);
        sbK.append(", elevationData=");
        sbK.append(this.f140973g);
        sbK.append(", polylineData=");
        sbK.append(this.f140974h);
        sbK.append(", distanceMeters=");
        p6.b.k(this.f140975i, ", distanceString=", this.f140976j, sbK);
        j20.x.j(this.f140977k, ", ascentMeters=", ", ascentString=", sbK);
        sn.a.t(sbK, this.f140978l, ", descentString=", this.f140979m, ", addedToSavedTrails=");
        sbK.append(this.f140980n);
        sbK.append(", rating=");
        sbK.append(this.f140981o);
        sbK.append(", reviewsCount=");
        fb1.c.x(sbK, this.f140982p, ", closed=", this.f140983q, ", underReview=");
        sbK.append(this.f140984r);
        sbK.append(", mapProvider=");
        sbK.append(this.f140985s);
        sbK.append(")");
        return sbK.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(long j8, long j14, q qVar, i53.c<? extends us1.i> cVar, ke2.b bVar, String str, i53.c<? extends o20.a> cVar2, s sVar, long j15, String str2, long j16, String str3, String str4, boolean z14, float f14, int i14, boolean z15, boolean z16, com.garmin.android.library.mapsdkadapter.i.d dVar) {
        qVar.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        dVar.getClass();
        this.f140967a = j8;
        this.f140968b = j14;
        this.f140969c = qVar;
        this.f140970d = cVar;
        this.f140971e = bVar;
        this.f140972f = str;
        this.f140973g = cVar2;
        this.f140974h = sVar;
        this.f140975i = j15;
        this.f140976j = str2;
        this.f140977k = j16;
        this.f140978l = str3;
        this.f140979m = str4;
        this.f140980n = z14;
        this.f140981o = f14;
        this.f140982p = i14;
        this.f140983q = z15;
        this.f140984r = z16;
        this.f140985s = dVar;
    }
}
