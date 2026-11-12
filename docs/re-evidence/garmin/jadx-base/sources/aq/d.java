package aq;

import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.devices.model.DeviceAppInfoDTO;
import com.garmin.android.apps.connectmobile.repcounting.model.ExerciseSetsDTO;
import com.garmin.proto.generated.GDIInReachMessaging;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Laq/d;", "", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/h;", "activitySummary", "Lcom/garmin/android/apps/connectmobile/repcounting/model/ExerciseSetsDTO;", "exerciseSets", "Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "exerciseList", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/f;", "activityRounds", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceAppInfoDTO;", "deviceAppInfo", "Lps/b0;", "connectIqDisplayInfo", "", "Lps/w0;", "jumpMetrics", "Lps/r1;", "timeInZones", "timeInPowerZones", "Lmo1/d;", "conversation", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;", "chartDetails", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/j;", "activityWorkouts", "Lps/p;", "activitySplits", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/l0;", "tankPressureDTO", "Lto/c;", "bottomTimePreferenceDTO", "", "isPersonalRecordCandidate", "", "userWeightInKg", "multisportLegs", "Lto/f;", "fullResolutionPolyline", "<init>", "(Lcom/garmin/android/apps/connectmobile/activities/newmodel/h;Lcom/garmin/android/apps/connectmobile/repcounting/model/ExerciseSetsDTO;Lcom/garmin/android/apps/connectmobile/repcounting/model/c;Lcom/garmin/android/apps/connectmobile/activities/newmodel/f;Lcom/garmin/android/apps/connectmobile/devices/model/DeviceAppInfoDTO;Lps/b0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lmo1/d;Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;Ljava/util/List;Lps/p;Lcom/garmin/android/apps/connectmobile/activities/newmodel/l0;Lto/c;ZDLjava/util/List;Lto/f;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.activities.newmodel.h f11879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ExerciseSetsDTO f11880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.repcounting.model.c f11881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.activities.newmodel.f f11882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DeviceAppInfoDTO f11883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ps.b0 f11884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<ps.w0> f11885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<ps.r1> f11886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<ps.r1> f11887i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public mo1.d f11888j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ActivityDetailChartDTO f11889k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.j> f11890l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ps.p f11891m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.activities.newmodel.l0 f11892n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public to.c f11893o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f11894p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double f11895q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.h> f11896r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public to.f f11897s;

    public /* synthetic */ d(com.garmin.android.apps.connectmobile.activities.newmodel.h hVar, ExerciseSetsDTO exerciseSetsDTO, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, com.garmin.android.apps.connectmobile.activities.newmodel.f fVar, DeviceAppInfoDTO deviceAppInfoDTO, ps.b0 b0Var, List list, List list2, List list3, mo1.d dVar, ActivityDetailChartDTO activityDetailChartDTO, List list4, ps.p pVar, com.garmin.android.apps.connectmobile.activities.newmodel.l0 l0Var, to.c cVar2, boolean z14, double d14, List list5, to.f fVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : hVar, (i14 & 2) != 0 ? null : exerciseSetsDTO, (i14 & 4) != 0 ? null : cVar, (i14 & 8) != 0 ? null : fVar, (i14 & 16) != 0 ? null : deviceAppInfoDTO, (i14 & 32) != 0 ? null : b0Var, (i14 & 64) != 0 ? null : list, (i14 & 128) != 0 ? null : list2, (i14 & 256) != 0 ? null : list3, (i14 & 512) != 0 ? null : dVar, (i14 & 1024) != 0 ? null : activityDetailChartDTO, (i14 & 2048) != 0 ? null : list4, (i14 & 4096) != 0 ? new ps.p(0L, null, null, null, null, 31, null) : pVar, (i14 & 8192) != 0 ? null : l0Var, (i14 & 16384) != 0 ? null : cVar2, (i14 & 32768) != 0 ? false : z14, (i14 & 65536) != 0 ? Double.NaN : d14, (i14 & 131072) != 0 ? null : list5, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : fVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p005kotlin.jvm.internal.s.g(this.f11879a, dVar.f11879a) && p005kotlin.jvm.internal.s.g(this.f11880b, dVar.f11880b) && p005kotlin.jvm.internal.s.g(this.f11881c, dVar.f11881c) && p005kotlin.jvm.internal.s.g(this.f11882d, dVar.f11882d) && p005kotlin.jvm.internal.s.g(this.f11883e, dVar.f11883e) && p005kotlin.jvm.internal.s.g(this.f11884f, dVar.f11884f) && p005kotlin.jvm.internal.s.g(this.f11885g, dVar.f11885g) && p005kotlin.jvm.internal.s.g(this.f11886h, dVar.f11886h) && p005kotlin.jvm.internal.s.g(this.f11887i, dVar.f11887i) && p005kotlin.jvm.internal.s.g(this.f11888j, dVar.f11888j) && p005kotlin.jvm.internal.s.g(this.f11889k, dVar.f11889k) && p005kotlin.jvm.internal.s.g(this.f11890l, dVar.f11890l) && p005kotlin.jvm.internal.s.g(this.f11891m, dVar.f11891m) && p005kotlin.jvm.internal.s.g(this.f11892n, dVar.f11892n) && p005kotlin.jvm.internal.s.g(this.f11893o, dVar.f11893o) && this.f11894p == dVar.f11894p && Double.compare(this.f11895q, dVar.f11895q) == 0 && p005kotlin.jvm.internal.s.g(this.f11896r, dVar.f11896r) && p005kotlin.jvm.internal.s.g(this.f11897s, dVar.f11897s);
    }

    public final int hashCode() {
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = this.f11879a;
        int iHashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        ExerciseSetsDTO exerciseSetsDTO = this.f11880b;
        int iHashCode2 = (iHashCode + (exerciseSetsDTO == null ? 0 : exerciseSetsDTO.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar = this.f11881c;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.activities.newmodel.f fVar = this.f11882d;
        int iHashCode4 = (iHashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        DeviceAppInfoDTO deviceAppInfoDTO = this.f11883e;
        int iHashCode5 = (iHashCode4 + (deviceAppInfoDTO == null ? 0 : deviceAppInfoDTO.hashCode())) * 31;
        ps.b0 b0Var = this.f11884f;
        int iHashCode6 = (iHashCode5 + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        List<ps.w0> list = this.f11885g;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<ps.r1> list2 = this.f11886h;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ps.r1> list3 = this.f11887i;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        mo1.d dVar = this.f11888j;
        int iHashCode10 = (iHashCode9 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        ActivityDetailChartDTO activityDetailChartDTO = this.f11889k;
        int iHashCode11 = (iHashCode10 + (activityDetailChartDTO == null ? 0 : activityDetailChartDTO.hashCode())) * 31;
        List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.j> list4 = this.f11890l;
        int iHashCode12 = (this.f11891m.hashCode() + ((iHashCode11 + (list4 == null ? 0 : list4.hashCode())) * 31)) * 31;
        com.garmin.android.apps.connectmobile.activities.newmodel.l0 l0Var = this.f11892n;
        int iHashCode13 = (iHashCode12 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        to.c cVar2 = this.f11893o;
        int iB = org.apache.commons.lang3.e.b(q6.f.g((iHashCode13 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31, 31, this.f11894p), 31, this.f11895q);
        List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.h> list5 = this.f11896r;
        int iHashCode14 = (iB + (list5 == null ? 0 : list5.hashCode())) * 31;
        to.f fVar2 = this.f11897s;
        return iHashCode14 + (fVar2 != null ? fVar2.hashCode() : 0);
    }

    public final String toString() {
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = this.f11879a;
        ExerciseSetsDTO exerciseSetsDTO = this.f11880b;
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar = this.f11881c;
        com.garmin.android.apps.connectmobile.activities.newmodel.f fVar = this.f11882d;
        DeviceAppInfoDTO deviceAppInfoDTO = this.f11883e;
        ps.b0 b0Var = this.f11884f;
        List<ps.w0> list = this.f11885g;
        List<ps.r1> list2 = this.f11886h;
        List<ps.r1> list3 = this.f11887i;
        mo1.d dVar = this.f11888j;
        ActivityDetailChartDTO activityDetailChartDTO = this.f11889k;
        List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.j> list4 = this.f11890l;
        ps.p pVar = this.f11891m;
        com.garmin.android.apps.connectmobile.activities.newmodel.l0 l0Var = this.f11892n;
        to.c cVar2 = this.f11893o;
        boolean z14 = this.f11894p;
        double d14 = this.f11895q;
        List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.h> list5 = this.f11896r;
        to.f fVar2 = this.f11897s;
        StringBuilder sb3 = new StringBuilder("ActivitySummaryStats(activitySummary=");
        sb3.append(hVar);
        sb3.append(", exerciseSets=");
        sb3.append(exerciseSetsDTO);
        sb3.append(", exerciseList=");
        sb3.append(cVar);
        sb3.append(", activityRounds=");
        sb3.append(fVar);
        sb3.append(", deviceAppInfo=");
        sb3.append(deviceAppInfoDTO);
        sb3.append(", connectIqDisplayInfo=");
        sb3.append(b0Var);
        sb3.append(", jumpMetrics=");
        n23.j.z(sb3, list, ", timeInZones=", list2, ", timeInPowerZones=");
        sb3.append(list3);
        sb3.append(", conversation=");
        sb3.append(dVar);
        sb3.append(", chartDetails=");
        sb3.append(activityDetailChartDTO);
        sb3.append(", activityWorkouts=");
        sb3.append(list4);
        sb3.append(", activitySplits=");
        sb3.append(pVar);
        sb3.append(", tankPressureDTO=");
        sb3.append(l0Var);
        sb3.append(", bottomTimePreferenceDTO=");
        sb3.append(cVar2);
        sb3.append(", isPersonalRecordCandidate=");
        sb3.append(z14);
        sb3.append(", userWeightInKg=");
        sb3.append(d14);
        sb3.append(", multisportLegs=");
        sb3.append(list5);
        sb3.append(", fullResolutionPolyline=");
        sb3.append(fVar2);
        sb3.append(")");
        return sb3.toString();
    }

    public d(com.garmin.android.apps.connectmobile.activities.newmodel.h hVar, ExerciseSetsDTO exerciseSetsDTO, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, com.garmin.android.apps.connectmobile.activities.newmodel.f fVar, DeviceAppInfoDTO deviceAppInfoDTO, ps.b0 b0Var, List<ps.w0> list, List<ps.r1> list2, List<ps.r1> list3, mo1.d dVar, ActivityDetailChartDTO activityDetailChartDTO, List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.j> list4, ps.p pVar, com.garmin.android.apps.connectmobile.activities.newmodel.l0 l0Var, to.c cVar2, boolean z14, double d14, List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.h> list5, to.f fVar2) {
        pVar.getClass();
        this.f11879a = hVar;
        this.f11880b = exerciseSetsDTO;
        this.f11881c = cVar;
        this.f11882d = fVar;
        this.f11883e = deviceAppInfoDTO;
        this.f11884f = b0Var;
        this.f11885g = list;
        this.f11886h = list2;
        this.f11887i = list3;
        this.f11888j = dVar;
        this.f11889k = activityDetailChartDTO;
        this.f11890l = list4;
        this.f11891m = pVar;
        this.f11892n = l0Var;
        this.f11893o = cVar2;
        this.f11894p = z14;
        this.f11895q = d14;
        this.f11896r = list5;
        this.f11897s = fVar2;
    }

    public d() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0.0d, null, null, 524287, null);
    }
}
