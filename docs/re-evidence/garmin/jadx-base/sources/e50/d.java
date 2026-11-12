package e50;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Le50/d;", "", "", "isLoading", "Le50/g;", "operationInProgress", "shouldHideBackButtonFromAccessibility", "Lw20/a;", "courseData", "Lw20/c;", "eventsData", "Lw20/d;", "paceProData", "Lw20/e;", "powerGuideData", "isCourseRepositionable", "showCourseActions", "isUsingMetricForLapByCoursePoint", "Ll40/d;", "courseMapOptions", "Lr30/a;", "selChartOverlayType", "<init>", "(ZLe50/g;ZLw20/a;Lw20/c;Lw20/d;Lw20/e;ZZZLl40/d;Lr30/a;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f62989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f62990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f62991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w20.a f62992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w20.c f62993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w20.d f62994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w20.e f62995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f62996h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f62997i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f62998j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l40.d f62999k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r30.a f63000l;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ d(boolean z14, g gVar, boolean z15, w20.a aVar, w20.c cVar, w20.d dVar, w20.e eVar, boolean z16, boolean z17, boolean z18, l40.d dVar2, r30.a aVar2, int i14, j jVar) {
        l40.d dVarA;
        z14 = (i14 & 1) != 0 ? false : z14;
        gVar = (i14 & 2) != 0 ? null : gVar;
        boolean z19 = (i14 & 4) != 0 ? false : z15;
        w20.a aVar3 = (i14 & 8) != 0 ? null : aVar;
        w20.c cVar2 = (i14 & 16) != 0 ? null : cVar;
        w20.d dVar3 = (i14 & 32) != 0 ? null : dVar;
        w20.e eVar2 = (i14 & 64) != 0 ? null : eVar;
        boolean z24 = (i14 & 128) == 0 ? z16 : false;
        boolean z25 = (i14 & 256) != 0 ? true : z17;
        boolean z26 = (i14 & 512) == 0 ? z18 : true;
        if ((i14 & 1024) != 0) {
            l40.d.f109892n.getClass();
            dVarA = l40.d.a.a();
        } else {
            dVarA = dVar2;
        }
        this(z14, gVar, z19, aVar3, cVar2, dVar3, eVar2, z24, z25, z26, dVarA, (i14 & 2048) != 0 ? null : aVar2);
    }

    public static d a(d dVar, boolean z14, g gVar, boolean z15, w20.a aVar, w20.c cVar, w20.d dVar2, w20.e eVar, boolean z16, boolean z17, boolean z18, l40.d dVar3, r30.a aVar2, int i14) {
        if ((i14 & 1) != 0) {
            z14 = dVar.f62989a;
        }
        boolean z19 = z14;
        if ((i14 & 2) != 0) {
            gVar = dVar.f62990b;
        }
        g gVar2 = gVar;
        boolean z24 = (i14 & 4) != 0 ? dVar.f62991c : z15;
        w20.a aVar3 = (i14 & 8) != 0 ? dVar.f62992d : aVar;
        w20.c cVar2 = (i14 & 16) != 0 ? dVar.f62993e : cVar;
        w20.d dVar4 = (i14 & 32) != 0 ? dVar.f62994f : dVar2;
        w20.e eVar2 = (i14 & 64) != 0 ? dVar.f62995g : eVar;
        boolean z25 = (i14 & 128) != 0 ? dVar.f62996h : z16;
        boolean z26 = (i14 & 256) != 0 ? dVar.f62997i : z17;
        boolean z27 = (i14 & 512) != 0 ? dVar.f62998j : z18;
        l40.d dVar5 = (i14 & 1024) != 0 ? dVar.f62999k : dVar3;
        r30.a aVar4 = (i14 & 2048) != 0 ? dVar.f63000l : aVar2;
        dVar.getClass();
        dVar5.getClass();
        return new d(z19, gVar2, z24, aVar3, cVar2, dVar4, eVar2, z25, z26, z27, dVar5, aVar4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f62989a == dVar.f62989a && this.f62990b == dVar.f62990b && this.f62991c == dVar.f62991c && s.g(this.f62992d, dVar.f62992d) && s.g(this.f62993e, dVar.f62993e) && s.g(this.f62994f, dVar.f62994f) && s.g(this.f62995g, dVar.f62995g) && this.f62996h == dVar.f62996h && this.f62997i == dVar.f62997i && this.f62998j == dVar.f62998j && s.g(this.f62999k, dVar.f62999k) && this.f63000l == dVar.f63000l;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f62989a) * 31;
        g gVar = this.f62990b;
        int iG = q6.f.g((iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31, 31, this.f62991c);
        w20.a aVar = this.f62992d;
        int iHashCode2 = (iG + (aVar == null ? 0 : aVar.hashCode())) * 31;
        w20.c cVar = this.f62993e;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.f181492a.hashCode())) * 31;
        w20.d dVar = this.f62994f;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.f181493a.hashCode())) * 31;
        w20.e eVar = this.f62995g;
        int iHashCode5 = (this.f62999k.hashCode() + q6.f.g(q6.f.g(q6.f.g((iHashCode4 + (eVar == null ? 0 : eVar.hashCode())) * 31, 31, this.f62996h), 31, this.f62997i), 31, this.f62998j)) * 31;
        r30.a aVar2 = this.f63000l;
        return iHashCode5 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CourseDetailsState(isLoading=");
        sb3.append(this.f62989a);
        sb3.append(", operationInProgress=");
        sb3.append(this.f62990b);
        sb3.append(", shouldHideBackButtonFromAccessibility=");
        sb3.append(this.f62991c);
        sb3.append(", courseData=");
        sb3.append(this.f62992d);
        sb3.append(", eventsData=");
        sb3.append(this.f62993e);
        sb3.append(", paceProData=");
        sb3.append(this.f62994f);
        sb3.append(", powerGuideData=");
        sb3.append(this.f62995g);
        sb3.append(", isCourseRepositionable=");
        sb3.append(this.f62996h);
        sb3.append(", showCourseActions=");
        kg.f.q(", isUsingMetricForLapByCoursePoint=", ", courseMapOptions=", sb3, this.f62997i, this.f62998j);
        sb3.append(this.f62999k);
        sb3.append(", selChartOverlayType=");
        sb3.append(this.f63000l);
        sb3.append(")");
        return sb3.toString();
    }

    public d(boolean z14, g gVar, boolean z15, w20.a aVar, w20.c cVar, w20.d dVar, w20.e eVar, boolean z16, boolean z17, boolean z18, l40.d dVar2, r30.a aVar2) {
        dVar2.getClass();
        this.f62989a = z14;
        this.f62990b = gVar;
        this.f62991c = z15;
        this.f62992d = aVar;
        this.f62993e = cVar;
        this.f62994f = dVar;
        this.f62995g = eVar;
        this.f62996h = z16;
        this.f62997i = z17;
        this.f62998j = z18;
        this.f62999k = dVar2;
        this.f63000l = aVar2;
    }

    public d() {
        this(false, null, false, null, null, null, null, false, false, false, null, null, 4095, null);
    }
}
