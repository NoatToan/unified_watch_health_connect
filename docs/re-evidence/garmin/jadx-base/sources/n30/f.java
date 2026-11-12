package n30;

import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ln30/f;", "", "", "isLoading", "Ln50/a;", "operationInProgress", "shouldHideBackButtonFromAccessibility", "Lw20/a;", "courseData", "hasCourseDetailsChanges", "", "Ln30/g;", "courseRouteStackEntries", "Ln30/h;", "courseTutorialData", "", "climbExploresCount", "isUsingMetricForLapByCoursePoint", "Ll40/d;", "courseMapOptions", "Lr30/a;", "selChartOverlayType", "<init>", "(ZLn50/a;ZLw20/a;ZLjava/util/List;Ln30/h;IZLl40/d;Lr30/a;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f123453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n50.a f123454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f123455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w20.a f123456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f123457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<g> f123458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f123459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f123460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f123461i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l40.d f123462j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r30.a f123463k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f123464l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f123465m;

    /* JADX WARN: Illegal instructions before constructor call */
    public f(boolean z14, n50.a aVar, boolean z15, w20.a aVar2, boolean z16, List list, h hVar, int i14, boolean z17, l40.d dVar, r30.a aVar3, int i15, p005kotlin.jvm.internal.j jVar) {
        l40.d dVarA;
        boolean z18 = (i15 & 1) != 0 ? false : z14;
        n50.a aVar4 = (i15 & 2) != 0 ? null : aVar;
        boolean z19 = (i15 & 4) != 0 ? false : z15;
        w20.a aVar5 = (i15 & 8) != 0 ? null : aVar2;
        boolean z24 = (i15 & 16) != 0 ? false : z16;
        List list2 = (i15 & 32) != 0 ? j0.f134944a : list;
        h hVar2 = (i15 & 64) != 0 ? new h(false, false, false, 7, null) : hVar;
        int i16 = (i15 & 128) == 0 ? i14 : 0;
        boolean z25 = (i15 & 256) != 0 ? true : z17;
        if ((i15 & 512) != 0) {
            l40.d.f109892n.getClass();
            dVarA = l40.d.a.a();
        } else {
            dVarA = dVar;
        }
        this(z18, aVar4, z19, aVar5, z24, list2, hVar2, i16, z25, dVarA, (i15 & 1024) != 0 ? null : aVar3);
    }

    public static f a(f fVar, boolean z14, n50.a aVar, boolean z15, w20.a aVar2, List list, h hVar, int i14, boolean z16, l40.d dVar, r30.a aVar3, int i15) {
        if ((i15 & 1) != 0) {
            z14 = fVar.f123453a;
        }
        boolean z17 = z14;
        if ((i15 & 2) != 0) {
            aVar = fVar.f123454b;
        }
        n50.a aVar4 = aVar;
        if ((i15 & 4) != 0) {
            z15 = fVar.f123455c;
        }
        boolean z18 = z15;
        w20.a aVar5 = (i15 & 8) != 0 ? fVar.f123456d : aVar2;
        boolean z19 = (i15 & 16) != 0 ? fVar.f123457e : true;
        List list2 = (i15 & 32) != 0 ? fVar.f123458f : list;
        h hVar2 = (i15 & 64) != 0 ? fVar.f123459g : hVar;
        int i16 = (i15 & 128) != 0 ? fVar.f123460h : i14;
        boolean z24 = (i15 & 256) != 0 ? fVar.f123461i : z16;
        l40.d dVar2 = (i15 & 512) != 0 ? fVar.f123462j : dVar;
        r30.a aVar6 = (i15 & 1024) != 0 ? fVar.f123463k : aVar3;
        fVar.getClass();
        list2.getClass();
        hVar2.getClass();
        dVar2.getClass();
        return new f(z17, aVar4, z18, aVar5, z19, list2, hVar2, i16, z24, dVar2, aVar6);
    }

    public final g b() {
        return (g) h0.n0(this.f123458f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f123453a == fVar.f123453a && this.f123454b == fVar.f123454b && this.f123455c == fVar.f123455c && s.g(this.f123456d, fVar.f123456d) && this.f123457e == fVar.f123457e && s.g(this.f123458f, fVar.f123458f) && s.g(this.f123459g, fVar.f123459g) && this.f123460h == fVar.f123460h && this.f123461i == fVar.f123461i && s.g(this.f123462j, fVar.f123462j) && this.f123463k == fVar.f123463k;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f123453a) * 31;
        n50.a aVar = this.f123454b;
        int iG = q6.f.g((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f123455c);
        w20.a aVar2 = this.f123456d;
        int iHashCode2 = (this.f123462j.hashCode() + q6.f.g(q2.d(this.f123460h, (this.f123459g.hashCode() + u0.b(q6.f.g((iG + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31, this.f123457e), 31, this.f123458f)) * 31, 31), 31, this.f123461i)) * 31;
        r30.a aVar3 = this.f123463k;
        return iHashCode2 + (aVar3 != null ? aVar3.hashCode() : 0);
    }

    public final String toString() {
        return "AutomaticCourseState(isLoading=" + this.f123453a + ", operationInProgress=" + this.f123454b + ", shouldHideBackButtonFromAccessibility=" + this.f123455c + ", courseData=" + this.f123456d + ", hasCourseDetailsChanges=" + this.f123457e + ", courseRouteStackEntries=" + this.f123458f + ", courseTutorialData=" + this.f123459g + ", climbExploresCount=" + this.f123460h + ", isUsingMetricForLapByCoursePoint=" + this.f123461i + ", courseMapOptions=" + this.f123462j + ", selChartOverlayType=" + this.f123463k + ")";
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    public f(boolean z14, n50.a aVar, boolean z15, w20.a aVar2, boolean z16, List<g> list, h hVar, int i14, boolean z17, l40.d dVar, r30.a aVar3) {
        boolean z18;
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        com.garmin.android.apps.connectmobile.courses.model.e eVar2;
        list.getClass();
        hVar.getClass();
        dVar.getClass();
        this.f123453a = z14;
        this.f123454b = aVar;
        this.f123455c = z15;
        this.f123456d = aVar2;
        this.f123457e = z16;
        this.f123458f = list;
        this.f123459g = hVar;
        this.f123460h = i14;
        this.f123461i = z17;
        this.f123462j = dVar;
        this.f123463k = aVar3;
        boolean z19 = false;
        Double dValueOf = null;
        if (z16 || list.size() > 1) {
            z18 = true;
        } else {
            String str = (aVar2 == null || (eVar2 = aVar2.f181476a) == null) ? null : eVar2.courseId;
            if (str == null || str.length() == 0) {
                z18 = true;
            } else {
                z18 = false;
            }
        }
        this.f123464l = z18;
        if (aVar2 != null && (eVar = aVar2.f181476a) != null) {
            dValueOf = Double.valueOf(eVar.q());
        }
        if (zf.b.D(dValueOf) && aVar2.f181476a.q() > 0.0d) {
            z19 = true;
        }
        this.f123465m = z19;
    }

    public f() {
        this(false, null, false, null, false, null, null, 0, false, null, null, 2047, null);
    }
}
