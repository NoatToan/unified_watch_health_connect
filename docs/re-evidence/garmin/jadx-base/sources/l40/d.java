package l40;

import c22.k;
import com.garmin.android.apps.connectmobile.courses.model.h;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import o13.q;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import q6.f;
import r1.q2;
import s20.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0095\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ll40/d;", "", "", "mapType", "", "areDistanceMarkersVisible", "isPopularityHeatmapVisible", "areHighTrafficRoadsVisible", "areUnpavedRoadsVisible", "arePointsOfInterestVisible", "", "Lcom/garmin/android/apps/connectmobile/courses/model/h;", "pointOfInterestTypes", "areHazardsVisible", "Lfn0/c;", "hazardTypes", "areHazardsOnCourseVisible", "areClimbsVisible", "climbsMinDifficulty", "climbsMaxDifficulty", "<init>", "(IZZZZZLjava/util/List;ZLjava/util/List;ZZII)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f109892n = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f109893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f109894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f109895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f109896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f109897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f109898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<h> f109899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f109900h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<fn0.c> f109901i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f109902j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f109903k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f109904l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f109905m;

    public d(int i14, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, List list, boolean z19, List list2, boolean z24, boolean z25, int i15, int i16, int i17, j jVar) {
        this((i17 & 1) != 0 ? 1 : i14, (i17 & 2) != 0 ? false : z14, (i17 & 4) != 0 ? false : z15, (i17 & 8) != 0 ? false : z16, (i17 & 16) != 0 ? false : z17, (i17 & 32) == 0 ? z18 : true, (i17 & 64) != 0 ? j0.f134944a : list, (i17 & 128) != 0 ? false : z19, (i17 & 256) != 0 ? j0.f134944a : list2, (i17 & 512) != 0 ? false : z24, (i17 & 1024) != 0 ? false : z25, (i17 & 2048) == 0 ? i15 : 0, (i17 & 4096) != 0 ? 5 : i16);
    }

    public static d a(d dVar, int i14, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, List list, boolean z19, ArrayList arrayList, boolean z24, boolean z25, int i15, int i16, int i17) {
        if ((i17 & 1) != 0) {
            i14 = dVar.f109893a;
        }
        int i18 = i14;
        boolean z26 = (i17 & 2) != 0 ? dVar.f109894b : z14;
        boolean z27 = (i17 & 4) != 0 ? dVar.f109895c : z15;
        boolean z28 = (i17 & 8) != 0 ? dVar.f109896d : z16;
        boolean z29 = (i17 & 16) != 0 ? dVar.f109897e : z17;
        boolean z34 = (i17 & 32) != 0 ? dVar.f109898f : z18;
        List list2 = (i17 & 64) != 0 ? dVar.f109899g : list;
        boolean z35 = (i17 & 128) != 0 ? dVar.f109900h : z19;
        List<fn0.c> list3 = (i17 & 256) != 0 ? dVar.f109901i : arrayList;
        boolean z36 = (i17 & 512) != 0 ? dVar.f109902j : z24;
        boolean z37 = (i17 & 1024) != 0 ? dVar.f109903k : z25;
        int i19 = (i17 & 2048) != 0 ? dVar.f109904l : i15;
        int i24 = (i17 & 4096) != 0 ? dVar.f109905m : i16;
        dVar.getClass();
        list2.getClass();
        list3.getClass();
        return new d(i18, z26, z27, z28, z29, z34, list2, z35, list3, z36, z37, i19, i24);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f109893a == dVar.f109893a && this.f109894b == dVar.f109894b && this.f109895c == dVar.f109895c && this.f109896d == dVar.f109896d && this.f109897e == dVar.f109897e && this.f109898f == dVar.f109898f && s.g(this.f109899g, dVar.f109899g) && this.f109900h == dVar.f109900h && s.g(this.f109901i, dVar.f109901i) && this.f109902j == dVar.f109902j && this.f109903k == dVar.f109903k && this.f109904l == dVar.f109904l && this.f109905m == dVar.f109905m;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f109905m) + q2.d(this.f109904l, f.g(f.g(u0.b(f.g(u0.b(f.g(f.g(f.g(f.g(f.g(Integer.hashCode(this.f109893a) * 31, 31, this.f109894b), 31, this.f109895c), 31, this.f109896d), 31, this.f109897e), 31, this.f109898f), 31, this.f109899g), 31, this.f109900h), 31, this.f109901i), 31, this.f109902j), 31, this.f109903k), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CourseMapOptionsState(mapType=");
        sb3.append(this.f109893a);
        sb3.append(", areDistanceMarkersVisible=");
        sb3.append(this.f109894b);
        sb3.append(", isPopularityHeatmapVisible=");
        kg.f.q(", areHighTrafficRoadsVisible=", ", areUnpavedRoadsVisible=", sb3, this.f109895c, this.f109896d);
        kg.f.q(", arePointsOfInterestVisible=", ", pointOfInterestTypes=", sb3, this.f109897e, this.f109898f);
        sb3.append(this.f109899g);
        sb3.append(", areHazardsVisible=");
        sb3.append(this.f109900h);
        sb3.append(", hazardTypes=");
        sb3.append(this.f109901i);
        sb3.append(", areHazardsOnCourseVisible=");
        sb3.append(this.f109902j);
        sb3.append(", areClimbsVisible=");
        sb3.append(this.f109903k);
        sb3.append(", climbsMinDifficulty=");
        sb3.append(this.f109904l);
        sb3.append(", climbsMaxDifficulty=");
        return am.j.q(sb3, this.f109905m, ")");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ll40/d$a;", "", "<init>", "()V", "", "CLIMB_CATEGORY_MAX_DIFFICULTY_ORDINAL", "I", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static d a() {
            Object bVar;
            try {
                int i14 = q.f128596b;
                l.f156021a.getClass();
                int iC1 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).c1();
                boolean zW2 = l.a().f156020a.W2("KeyMapMileMarkerOption", false);
                f12.l lVar = l.a().f156020a;
                bVar = new d(iC1, zW2, lVar.m3("KeyHeatMapOption") ? lVar.W2("KeyHeatMapOption", false) : ((k) KoinJavaComponent.get$default(k.class, null, null, 6, null)).c("popularity_heatmap_enabled"), l.a().f156020a.W2("KeyHighTrafficRoadsOption", false), l.a().f156020a.W2("KeyUnpavedRoadsOption", false), l.a().f156020a.W2("KeyPointsOfInterestOption", true), l.c(), l.a().f156020a.W2("KeyHazardsOption", false), l.b(), l.a().f156020a.W2("KeyHazardsOnCourseOption", false), l.a().f156020a.W2("KeyClimbsOption", false), l.a().f156020a.i2(0, "keyClimbsMinDifficulty"), l.a().f156020a.i2(5, "keyClimbsMaxDifficulty"));
            } catch (Throwable th3) {
                int i15 = q.f128596b;
                bVar = new q.b(th3);
            }
            Object dVar = new d(0, false, false, false, false, false, null, false, null, false, false, 0, 0, 8191, null);
            if (bVar instanceof q.b) {
                bVar = dVar;
            }
            return (d) bVar;
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(int i14, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, List<? extends h> list, boolean z19, List<? extends fn0.c> list2, boolean z24, boolean z25, int i15, int i16) {
        list.getClass();
        list2.getClass();
        this.f109893a = i14;
        this.f109894b = z14;
        this.f109895c = z15;
        this.f109896d = z16;
        this.f109897e = z17;
        this.f109898f = z18;
        this.f109899g = list;
        this.f109900h = z19;
        this.f109901i = list2;
        this.f109902j = z24;
        this.f109903k = z25;
        this.f109904l = i15;
        this.f109905m = i16;
    }

    public d() {
        this(0, false, false, false, false, false, null, false, null, false, false, 0, 0, 8191, null);
    }
}
