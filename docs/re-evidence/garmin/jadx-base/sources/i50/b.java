package i50;

import am.x0;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import r1.q2;
import u62.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\r¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Li50/b;", "", "", "courseCreateFlow", "", "isFromTrainingInitiative", "isFromTIForTrainingPlan", "isFromEventDetails", "isFromReviewEntries", "isSharableEvent", "isTriathlonEvent", "Lam/x0;", "activityType", "", "activityTypeList", "garminCoachDistanceInMeters", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/f;", "eventLegDistance", "Lcom/garmin/android/library/mapsdkadapter/f;", "eventLocation", "Lab1/g;", "powerGuideSummaries", "<init>", "(IZZZZZZLam/x0;Ljava/util/List;ILcom/garmin/android/apps/connectmobile/workouts/data/model/f;Lcom/garmin/android/library/mapsdkadapter/f;Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f91695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f91696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f91697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f91698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f91699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f91700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x0 f91701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<x0> f91702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f91703j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.workouts.data.model.f f91704k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.garmin.android.library.mapsdkadapter.f f91705l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<ab1.g> f91706m;

    public b(int i14, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, x0 x0Var, List list, int i15, com.garmin.android.apps.connectmobile.workouts.data.model.f fVar, com.garmin.android.library.mapsdkadapter.f fVar2, List list2, int i16, p005kotlin.jvm.internal.j jVar) {
        this((i16 & 1) != 0 ? -1 : i14, (i16 & 2) != 0 ? false : z14, (i16 & 4) != 0 ? false : z15, (i16 & 8) != 0 ? false : z16, (i16 & 16) != 0 ? false : z17, (i16 & 32) != 0 ? false : z18, (i16 & 64) == 0 ? z19 : false, (i16 & 128) != 0 ? null : x0Var, (i16 & 256) != 0 ? null : list, (i16 & 512) == 0 ? i15 : -1, (i16 & 1024) != 0 ? null : fVar, (i16 & 2048) == 0 ? fVar2 : null, (i16 & 4096) != 0 ? j0.f134944a : list2);
    }

    public final boolean a() {
        List<x0> list = this.f91702i;
        return true ^ (list == null || list.isEmpty());
    }

    public final boolean b() {
        return this.f91694a == 0;
    }

    public final boolean c() {
        return this.f91694a == 1;
    }

    public final boolean d() {
        return this.f91695b && this.f91701h != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f91694a == bVar.f91694a && this.f91695b == bVar.f91695b && this.f91696c == bVar.f91696c && this.f91697d == bVar.f91697d && this.f91698e == bVar.f91698e && this.f91699f == bVar.f91699f && this.f91700g == bVar.f91700g && this.f91701h == bVar.f91701h && s.g(this.f91702i, bVar.f91702i) && this.f91703j == bVar.f91703j && s.g(this.f91704k, bVar.f91704k) && s.g(this.f91705l, bVar.f91705l) && s.g(this.f91706m, bVar.f91706m);
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(Integer.hashCode(this.f91694a) * 31, 31, this.f91695b), 31, this.f91696c), 31, this.f91697d), 31, this.f91698e), 31, this.f91699f), 31, this.f91700g);
        x0 x0Var = this.f91701h;
        int iHashCode = (iG + (x0Var == null ? 0 : x0Var.hashCode())) * 31;
        List<x0> list = this.f91702i;
        int iD = q2.d(this.f91703j, (iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31);
        com.garmin.android.apps.connectmobile.workouts.data.model.f fVar = this.f91704k;
        int iHashCode2 = (iD + (fVar == null ? 0 : fVar.hashCode())) * 31;
        com.garmin.android.library.mapsdkadapter.f fVar2 = this.f91705l;
        return this.f91706m.hashCode() + ((iHashCode2 + (fVar2 != null ? fVar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CoursesConfig(courseCreateFlow=");
        sb3.append(this.f91694a);
        sb3.append(", isFromTrainingInitiative=");
        sb3.append(this.f91695b);
        sb3.append(", isFromTIForTrainingPlan=");
        kg.f.q(", isFromEventDetails=", ", isFromReviewEntries=", sb3, this.f91696c, this.f91697d);
        kg.f.q(", isSharableEvent=", ", isTriathlonEvent=", sb3, this.f91698e, this.f91699f);
        sb3.append(this.f91700g);
        sb3.append(", activityType=");
        sb3.append(this.f91701h);
        sb3.append(", activityTypeList=");
        sb3.append(this.f91702i);
        sb3.append(", garminCoachDistanceInMeters=");
        sb3.append(this.f91703j);
        sb3.append(", eventLegDistance=");
        sb3.append(this.f91704k);
        sb3.append(", eventLocation=");
        sb3.append(this.f91705l);
        sb3.append(", powerGuideSummaries=");
        return z.c(sb3, this.f91706m, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(int i14, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, x0 x0Var, List<? extends x0> list, int i15, com.garmin.android.apps.connectmobile.workouts.data.model.f fVar, com.garmin.android.library.mapsdkadapter.f fVar2, List<ab1.g> list2) {
        list2.getClass();
        this.f91694a = i14;
        this.f91695b = z14;
        this.f91696c = z15;
        this.f91697d = z16;
        this.f91698e = z17;
        this.f91699f = z18;
        this.f91700g = z19;
        this.f91701h = x0Var;
        this.f91702i = list;
        this.f91703j = i15;
        this.f91704k = fVar;
        this.f91705l = fVar2;
        this.f91706m = list2;
    }

    public b() {
        this(0, false, false, false, false, false, false, null, null, 0, null, null, null, 8191, null);
    }
}
