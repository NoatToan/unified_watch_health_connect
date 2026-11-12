package a50;

import com.garmin.android.apps.connectmobile.courses.model.CourseSegmentDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import java.util.List;
import k30.k;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB³\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"La50/g;", "", "", "isLoading", "Ln50/a;", "operationInProgress", "shouldHideBackButtonFromAccessibility", "Lw20/a;", "courseData", "hasCourseDetailsChanges", "courseNameEdited", "", "La50/a;", "courseRouteStates", "Lk30/k;", "currentRoutingType", "La50/b;", "courseTutorialData", "", "climbExploresCount", "isUsingMetricForLapByCoursePoint", "shouldAvoidHighTraffic", "shouldAvoidClosedRoads", "shouldAvoidUnpavedRoads", "Ll40/d;", "courseMapOptions", "Lr30/a;", "selChartOverlayType", "<init>", "(ZLn50/a;ZLw20/a;ZZLjava/util/List;Lk30/k;La50/b;IZZZZLl40/d;Lr30/a;)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f1388s = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final k f1389t = k.POPULARITY;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n50.a f1391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w20.a f1393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<a50.a> f1396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f1397h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f1398i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f1399j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f1400k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f1401l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f1402m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f1403n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l40.d f1404o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r30.a f1405p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f1406q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f1407r;

    /* JADX WARN: Illegal instructions before constructor call */
    public g(boolean z14, n50.a aVar, boolean z15, w20.a aVar2, boolean z16, boolean z17, List list, k kVar, b bVar, int i14, boolean z18, boolean z19, boolean z24, boolean z25, l40.d dVar, r30.a aVar3, int i15, j jVar) {
        l40.d dVarA;
        boolean z26 = (i15 & 1) != 0 ? false : z14;
        n50.a aVar4 = (i15 & 2) != 0 ? null : aVar;
        boolean z27 = (i15 & 4) != 0 ? false : z15;
        w20.a aVar5 = (i15 & 8) != 0 ? null : aVar2;
        boolean z28 = (i15 & 16) != 0 ? false : z16;
        boolean z29 = (i15 & 32) != 0 ? false : z17;
        List list2 = (i15 & 64) != 0 ? j0.f134944a : list;
        k kVar2 = (i15 & 128) != 0 ? k.POPULARITY : kVar;
        b bVar2 = (i15 & 256) != 0 ? new b(false, false, false, false, 15, null) : bVar;
        int i16 = (i15 & 512) != 0 ? 0 : i14;
        boolean z34 = (i15 & 1024) != 0 ? true : z18;
        boolean z35 = (i15 & 2048) != 0 ? false : z19;
        boolean z36 = (i15 & 4096) != 0 ? false : z24;
        boolean z37 = (i15 & 8192) != 0 ? false : z25;
        if ((i15 & 16384) != 0) {
            l40.d.f109892n.getClass();
            dVarA = l40.d.a.a();
        } else {
            dVarA = dVar;
        }
        this(z26, aVar4, z27, aVar5, z28, z29, list2, kVar2, bVar2, i16, z34, z35, z36, z37, dVarA, (i15 & 32768) != 0 ? null : aVar3);
    }

    public static g a(g gVar, boolean z14, n50.a aVar, boolean z15, w20.a aVar2, boolean z16, List list, k kVar, b bVar, int i14, boolean z17, boolean z18, boolean z19, boolean z24, l40.d dVar, r30.a aVar3, int i15) {
        boolean z25 = (i15 & 1) != 0 ? gVar.f1390a : z14;
        n50.a aVar4 = (i15 & 2) != 0 ? gVar.f1391b : aVar;
        boolean z26 = (i15 & 4) != 0 ? gVar.f1392c : z15;
        w20.a aVar5 = (i15 & 8) != 0 ? gVar.f1393d : aVar2;
        boolean z27 = (i15 & 16) != 0 ? gVar.f1394e : true;
        boolean z28 = (i15 & 32) != 0 ? gVar.f1395f : z16;
        List list2 = (i15 & 64) != 0 ? gVar.f1396g : list;
        k kVar2 = (i15 & 128) != 0 ? gVar.f1397h : kVar;
        b bVar2 = (i15 & 256) != 0 ? gVar.f1398i : bVar;
        int i16 = (i15 & 512) != 0 ? gVar.f1399j : i14;
        boolean z29 = (i15 & 1024) != 0 ? gVar.f1400k : z17;
        boolean z34 = (i15 & 2048) != 0 ? gVar.f1401l : z18;
        boolean z35 = (i15 & 4096) != 0 ? gVar.f1402m : z19;
        boolean z36 = (i15 & 8192) != 0 ? gVar.f1403n : z24;
        boolean z37 = z25;
        l40.d dVar2 = (i15 & 16384) != 0 ? gVar.f1404o : dVar;
        r30.a aVar6 = (i15 & 32768) != 0 ? gVar.f1405p : aVar3;
        gVar.getClass();
        list2.getClass();
        kVar2.getClass();
        bVar2.getClass();
        dVar2.getClass();
        return new g(z37, aVar4, z26, aVar5, z27, z28, list2, kVar2, bVar2, i16, z29, z34, z35, z36, dVar2, aVar6);
    }

    public final List<List<GeoPointDTO>> b() {
        a50.a aVarE = e();
        List<List<GeoPointDTO>> list = aVarE != null ? aVarE.f1241b : null;
        return list == null ? j0.f134944a : list;
    }

    public final List<CourseSegmentDTO> c() {
        a50.a aVarE = e();
        List<CourseSegmentDTO> list = aVarE != null ? aVarE.f1242c : null;
        return list == null ? j0.f134944a : list;
    }

    public final List<com.garmin.android.library.mapsdkadapter.f> d() {
        a50.a aVarE = e();
        List<com.garmin.android.library.mapsdkadapter.f> list = aVarE != null ? aVarE.f1240a : null;
        return list == null ? j0.f134944a : list;
    }

    public final a50.a e() {
        return (a50.a) h0.n0(this.f1396g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f1390a == gVar.f1390a && this.f1391b == gVar.f1391b && this.f1392c == gVar.f1392c && s.g(this.f1393d, gVar.f1393d) && this.f1394e == gVar.f1394e && this.f1395f == gVar.f1395f && s.g(this.f1396g, gVar.f1396g) && this.f1397h == gVar.f1397h && s.g(this.f1398i, gVar.f1398i) && this.f1399j == gVar.f1399j && this.f1400k == gVar.f1400k && this.f1401l == gVar.f1401l && this.f1402m == gVar.f1402m && this.f1403n == gVar.f1403n && s.g(this.f1404o, gVar.f1404o) && this.f1405p == gVar.f1405p;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f1390a) * 31;
        n50.a aVar = this.f1391b;
        int iG = q6.f.g((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f1392c);
        w20.a aVar2 = this.f1393d;
        int iHashCode2 = (this.f1404o.hashCode() + q6.f.g(q6.f.g(q6.f.g(q6.f.g(q2.d(this.f1399j, (this.f1398i.hashCode() + ((this.f1397h.hashCode() + u0.b(q6.f.g(q6.f.g((iG + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31, this.f1394e), 31, this.f1395f), 31, this.f1396g)) * 31)) * 31, 31), 31, this.f1400k), 31, this.f1401l), 31, this.f1402m), 31, this.f1403n)) * 31;
        r30.a aVar3 = this.f1405p;
        return iHashCode2 + (aVar3 != null ? aVar3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CustomCourseState(isLoading=");
        sb3.append(this.f1390a);
        sb3.append(", operationInProgress=");
        sb3.append(this.f1391b);
        sb3.append(", shouldHideBackButtonFromAccessibility=");
        sb3.append(this.f1392c);
        sb3.append(", courseData=");
        sb3.append(this.f1393d);
        sb3.append(", hasCourseDetailsChanges=");
        kg.f.q(", courseNameEdited=", ", courseRouteStates=", sb3, this.f1394e, this.f1395f);
        sb3.append(this.f1396g);
        sb3.append(", currentRoutingType=");
        sb3.append(this.f1397h);
        sb3.append(", courseTutorialData=");
        sb3.append(this.f1398i);
        sb3.append(", climbExploresCount=");
        sb3.append(this.f1399j);
        sb3.append(", isUsingMetricForLapByCoursePoint=");
        kg.f.q(", shouldAvoidHighTraffic=", ", shouldAvoidClosedRoads=", sb3, this.f1400k, this.f1401l);
        kg.f.q(", shouldAvoidUnpavedRoads=", ", courseMapOptions=", sb3, this.f1402m, this.f1403n);
        sb3.append(this.f1404o);
        sb3.append(", selChartOverlayType=");
        sb3.append(this.f1405p);
        sb3.append(")");
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/g$a;", "", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public g(boolean z14, n50.a aVar, boolean z15, w20.a aVar2, boolean z16, boolean z17, List<a50.a> list, k kVar, b bVar, int i14, boolean z18, boolean z19, boolean z24, boolean z25, l40.d dVar, r30.a aVar3) {
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        list.getClass();
        kVar.getClass();
        bVar.getClass();
        dVar.getClass();
        this.f1390a = z14;
        this.f1391b = aVar;
        this.f1392c = z15;
        this.f1393d = aVar2;
        this.f1394e = z16;
        this.f1395f = z17;
        this.f1396g = list;
        this.f1397h = kVar;
        this.f1398i = bVar;
        this.f1399j = i14;
        this.f1400k = z18;
        this.f1401l = z19;
        this.f1402m = z24;
        this.f1403n = z25;
        this.f1404o = dVar;
        this.f1405p = aVar3;
        boolean z26 = false;
        this.f1406q = z16 || list.size() > 1;
        if (d().size() > 1) {
            if (zf.b.D((aVar2 == null || (eVar = aVar2.f181476a) == null) ? null : Double.valueOf(eVar.q())) && aVar2.f181476a.q() > 0.0d) {
                z26 = true;
            }
        }
        this.f1407r = z26;
    }

    public g() {
        this(false, null, false, null, false, false, null, null, null, 0, false, false, false, false, null, null, 65535, null);
    }
}
