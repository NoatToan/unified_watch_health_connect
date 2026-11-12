package i50;

import fg0.k;
import java.util.List;
import k30.n;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Li50/h;", "", "Li50/b;", "config", "", "userProfilePk", "Lk30/n;", "sortFilter", "", "isLoading", "isRefreshing", "loadError", "", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "allCourses", "Lfg0/k;", "eventsWithCourse", "Li50/i;", "selectedTab", "isMultipleSports", "genesisState", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/f;", "eventLegDistance", "revision", "showWhatsNew", "<init>", "(Li50/b;ILk30/n;ZZZLjava/util/List;Ljava/util/List;Li50/i;ZZLcom/garmin/android/apps/connectmobile/workouts/data/model/f;IZ)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f91762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f91764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f91765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f91766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f91767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.courses.model.d> f91768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<k> f91769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i f91770i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f91771j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f91772k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.workouts.data.model.f f91773l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f91774m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f91775n;

    public h(b bVar, int i14, n nVar, boolean z14, boolean z15, boolean z16, List list, List list2, i iVar, boolean z17, boolean z18, com.garmin.android.apps.connectmobile.workouts.data.model.f fVar, int i15, boolean z19, int i16, p005kotlin.jvm.internal.j jVar) {
        this(bVar, i14, nVar, (i16 & 8) != 0 ? true : z14, (i16 & 16) != 0 ? false : z15, (i16 & 32) != 0 ? false : z16, (i16 & 64) != 0 ? j0.f134944a : list, (i16 & 128) != 0 ? j0.f134944a : list2, (i16 & 256) != 0 ? i.CREATED_BY_YOU : iVar, (i16 & 512) != 0 ? false : z17, (i16 & 1024) != 0 ? false : z18, (i16 & 2048) != 0 ? bVar.f91704k : fVar, (i16 & 4096) != 0 ? 0 : i15, (i16 & 8192) != 0 ? false : z19);
    }

    public static h a(h hVar, n nVar, boolean z14, boolean z15, boolean z16, List list, List list2, i iVar, boolean z17, com.garmin.android.apps.connectmobile.workouts.data.model.f fVar, int i14, boolean z18, int i15) {
        b bVar = hVar.f91762a;
        int i16 = hVar.f91763b;
        n nVar2 = (i15 & 4) != 0 ? hVar.f91764c : nVar;
        boolean z19 = (i15 & 8) != 0 ? hVar.f91765d : z14;
        boolean z24 = (i15 & 16) != 0 ? hVar.f91766e : z15;
        boolean z25 = (i15 & 32) != 0 ? hVar.f91767f : z16;
        List list3 = (i15 & 64) != 0 ? hVar.f91768g : list;
        List list4 = (i15 & 128) != 0 ? hVar.f91769h : list2;
        i iVar2 = (i15 & 256) != 0 ? hVar.f91770i : iVar;
        boolean z26 = hVar.f91771j;
        boolean z27 = (i15 & 1024) != 0 ? hVar.f91772k : z17;
        com.garmin.android.apps.connectmobile.workouts.data.model.f fVar2 = (i15 & 2048) != 0 ? hVar.f91773l : fVar;
        int i17 = (i15 & 4096) != 0 ? hVar.f91774m : i14;
        boolean z28 = (i15 & 8192) != 0 ? hVar.f91775n : z18;
        hVar.getClass();
        bVar.getClass();
        nVar2.getClass();
        list3.getClass();
        list4.getClass();
        iVar2.getClass();
        return new h(bVar, i16, nVar2, z19, z24, z25, list3, list4, iVar2, z26, z27, fVar2, i17, z28);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.f91762a, hVar.f91762a) && this.f91763b == hVar.f91763b && s.g(this.f91764c, hVar.f91764c) && this.f91765d == hVar.f91765d && this.f91766e == hVar.f91766e && this.f91767f == hVar.f91767f && s.g(this.f91768g, hVar.f91768g) && s.g(this.f91769h, hVar.f91769h) && this.f91770i == hVar.f91770i && this.f91771j == hVar.f91771j && this.f91772k == hVar.f91772k && s.g(this.f91773l, hVar.f91773l) && this.f91774m == hVar.f91774m && this.f91775n == hVar.f91775n;
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.g((this.f91770i.hashCode() + u0.b(u0.b(q6.f.g(q6.f.g(q6.f.g((this.f91764c.hashCode() + q2.d(this.f91763b, this.f91762a.hashCode() * 31, 31)) * 31, 31, this.f91765d), 31, this.f91766e), 31, this.f91767f), 31, this.f91768g), 31, this.f91769h)) * 31, 31, this.f91771j), 31, this.f91772k);
        com.garmin.android.apps.connectmobile.workouts.data.model.f fVar = this.f91773l;
        return Boolean.hashCode(this.f91775n) + q2.d(this.f91774m, (iG + (fVar == null ? 0 : fVar.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CoursesState(config=");
        sb3.append(this.f91762a);
        sb3.append(", userProfilePk=");
        sb3.append(this.f91763b);
        sb3.append(", sortFilter=");
        sb3.append(this.f91764c);
        sb3.append(", isLoading=");
        sb3.append(this.f91765d);
        sb3.append(", isRefreshing=");
        kg.f.q(", loadError=", ", allCourses=", sb3, this.f91766e, this.f91767f);
        n23.j.z(sb3, this.f91768g, ", eventsWithCourse=", this.f91769h, ", selectedTab=");
        sb3.append(this.f91770i);
        sb3.append(", isMultipleSports=");
        sb3.append(this.f91771j);
        sb3.append(", genesisState=");
        sb3.append(this.f91772k);
        sb3.append(", eventLegDistance=");
        sb3.append(this.f91773l);
        sb3.append(", revision=");
        sb3.append(this.f91774m);
        sb3.append(", showWhatsNew=");
        sb3.append(this.f91775n);
        sb3.append(")");
        return sb3.toString();
    }

    public h(b bVar, int i14, n nVar, boolean z14, boolean z15, boolean z16, List<com.garmin.android.apps.connectmobile.courses.model.d> list, List<k> list2, i iVar, boolean z17, boolean z18, com.garmin.android.apps.connectmobile.workouts.data.model.f fVar, int i15, boolean z19) {
        bVar.getClass();
        nVar.getClass();
        list.getClass();
        list2.getClass();
        iVar.getClass();
        this.f91762a = bVar;
        this.f91763b = i14;
        this.f91764c = nVar;
        this.f91765d = z14;
        this.f91766e = z15;
        this.f91767f = z16;
        this.f91768g = list;
        this.f91769h = list2;
        this.f91770i = iVar;
        this.f91771j = z17;
        this.f91772k = z18;
        this.f91773l = fVar;
        this.f91774m = i15;
        this.f91775n = z19;
    }
}
