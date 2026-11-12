package jv1;

import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import java.util.List;
import java.util.Map;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p13.j0;
import p13.k0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B³\u0003\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0016\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0014\u0012\b\b\u0002\u0010 \u001a\u00020\u001a\u0012\b\b\u0002\u0010!\u001a\u00020\u001a\u0012\b\b\u0002\u0010\"\u001a\u00020\u001a\u0012\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u0014\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010%\u0012\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0014\u0012\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u0014\u0012\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0014\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\b\u00101\u001a\u0004\u0018\u000100\u0012\b\u00103\u001a\u0004\u0018\u000102\u0012\u000e\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u0014\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000106\u0012\b\b\u0002\u00108\u001a\u00020\u001a\u0012\b\b\u0002\u00109\u001a\u00020\u001a\u0012\b\u0010:\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;\u0012\b\b\u0002\u0010=\u001a\u00020\u001a\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b@\u0010A¨\u0006B"}, d2 = {"Ljv1/n;", "", "Ltw1/m;", "trainingPlanDTO", "Lvt1/o;", "trainingType", "Lvt1/e;", "fbtPlanType", "Ltw1/n;", "workoutActivityType", "Lxu1/a;", "archProgressData", "", "planName", "Lorg/joda/time/DateTime;", "planStartDate", "planEndDate", "pauseDateString", "Lfg0/k;", "eventDTO", "", "supportingEvents", "", "", "Lfg0/t;", "weatherData", "", "hasPhaseData", "Ltw1/a;", "currentPlanPhase", "Liw1/a;", "dashboardWorkoutsAndActivities", "isPlanCompleted", "isPlanPaused", "isImproveFitnessPlan", "Lav1/b;", "dashboardActivities", "", "activityDistanceMeters", "activityDurationSec", "Ljv1/w;", "legActivityDistanceDurationList", "Lav1/d;", "workoutCompletedActivityStats", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "workoutScheduleActivities", "Loz1/b;", "trainingReadinessDTO", "Li71/w;", "trainingStatusCardData", "Lzz1/d;", "intensityMinutesCardData", "Lav1/h;", "trainingPremiumContent", "Lh61/a;", "cyclingAbilityCardData", "isUsingMetric", "shouldShowProgressReport", "hasStrengthTraining", "Lo61/q;", "genericVO2MaxData", "showCyclingSwitchToBeginnerBanner", "Lav1/c;", "bodyBatteryData", "<init>", "(Ltw1/m;Lvt1/o;Lvt1/e;Ltw1/n;Lxu1/a;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Lfg0/k;Ljava/util/List;Ljava/util/Map;ZLtw1/a;Ljava/util/List;ZZZLjava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/util/List;Loz1/b;Li71/w;Lzz1/d;Ljava/util/List;Lh61/a;ZZLjava/lang/Boolean;Lo61/q;ZLav1/c;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n {
    public final zz1.d A;
    public final List<av1.h> B;
    public final h61.a C;
    public final boolean D;
    public final boolean E;
    public final Boolean F;
    public final o61.q G;
    public final boolean H;
    public final av1.c I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tw1.m f101079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt1.o f101080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt1.e f101081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tw1.n f101082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xu1.a f101083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f101084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DateTime f101085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DateTime f101086h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f101087i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fg0.k f101088j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<fg0.k> f101089k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map<Long, fg0.t> f101090l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f101091m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final tw1.a f101092n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<iw1.a> f101093o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f101094p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f101095q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f101096r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<av1.b> f101097s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Double f101098t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Double f101099u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List<w> f101100v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List<av1.d> f101101w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List<ActivityListItemDTO> f101102x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final oz1.b f101103y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final i71.w f101104z;

    /* JADX WARN: Illegal instructions before constructor call */
    public n(tw1.m mVar, vt1.o oVar, vt1.e eVar, tw1.n nVar, xu1.a aVar, String str, DateTime dateTime, DateTime dateTime2, String str2, fg0.k kVar, List list, Map map, boolean z14, tw1.a aVar2, List list2, boolean z15, boolean z16, boolean z17, List list3, Double d14, Double d15, List list4, List list5, List list6, oz1.b bVar, i71.w wVar, zz1.d dVar, List list7, h61.a aVar3, boolean z18, boolean z19, Boolean bool, o61.q qVar, boolean z24, av1.c cVar, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        Map map2;
        vt1.o oVar2 = (i14 & 2) != 0 ? null : oVar;
        vt1.e eVar2 = (i14 & 4) != 0 ? null : eVar;
        tw1.n nVar2 = (i14 & 8) != 0 ? null : nVar;
        fg0.k kVar2 = (i14 & 512) != 0 ? null : kVar;
        List list8 = (i14 & 1024) != 0 ? j0.f134944a : list;
        if ((i14 & 2048) != 0) {
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            map2 = k0Var;
        } else {
            map2 = map;
        }
        this(mVar, oVar2, eVar2, nVar2, aVar, str, dateTime, dateTime2, str2, kVar2, list8, map2, (i14 & 4096) != 0 ? false : z14, (i14 & 8192) != 0 ? null : aVar2, (i14 & 16384) != 0 ? null : list2, (32768 & i14) != 0 ? false : z15, (65536 & i14) != 0 ? false : z16, (131072 & i14) != 0 ? false : z17, (262144 & i14) != 0 ? j0.f134944a : list3, (524288 & i14) != 0 ? null : d14, (1048576 & i14) != 0 ? null : d15, (2097152 & i14) != 0 ? j0.f134944a : list4, list5, (8388608 & i14) != 0 ? j0.f134944a : list6, bVar, wVar, dVar, list7, (268435456 & i14) != 0 ? null : aVar3, (536870912 & i14) != 0 ? false : z18, (i14 & 1073741824) != 0 ? false : z19, bool, (i15 & 1) != 0 ? null : qVar, (i15 & 2) != 0 ? false : z24, (i15 & 4) != 0 ? null : cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return p005kotlin.jvm.internal.s.g(this.f101079a, nVar.f101079a) && this.f101080b == nVar.f101080b && this.f101081c == nVar.f101081c && p005kotlin.jvm.internal.s.g(this.f101082d, nVar.f101082d) && p005kotlin.jvm.internal.s.g(this.f101083e, nVar.f101083e) && p005kotlin.jvm.internal.s.g(this.f101084f, nVar.f101084f) && p005kotlin.jvm.internal.s.g(this.f101085g, nVar.f101085g) && p005kotlin.jvm.internal.s.g(this.f101086h, nVar.f101086h) && p005kotlin.jvm.internal.s.g(this.f101087i, nVar.f101087i) && p005kotlin.jvm.internal.s.g(this.f101088j, nVar.f101088j) && p005kotlin.jvm.internal.s.g(this.f101089k, nVar.f101089k) && p005kotlin.jvm.internal.s.g(this.f101090l, nVar.f101090l) && this.f101091m == nVar.f101091m && p005kotlin.jvm.internal.s.g(this.f101092n, nVar.f101092n) && p005kotlin.jvm.internal.s.g(this.f101093o, nVar.f101093o) && this.f101094p == nVar.f101094p && this.f101095q == nVar.f101095q && this.f101096r == nVar.f101096r && p005kotlin.jvm.internal.s.g(this.f101097s, nVar.f101097s) && p005kotlin.jvm.internal.s.g(this.f101098t, nVar.f101098t) && p005kotlin.jvm.internal.s.g(this.f101099u, nVar.f101099u) && p005kotlin.jvm.internal.s.g(this.f101100v, nVar.f101100v) && p005kotlin.jvm.internal.s.g(this.f101101w, nVar.f101101w) && p005kotlin.jvm.internal.s.g(this.f101102x, nVar.f101102x) && p005kotlin.jvm.internal.s.g(this.f101103y, nVar.f101103y) && p005kotlin.jvm.internal.s.g(this.f101104z, nVar.f101104z) && p005kotlin.jvm.internal.s.g(this.A, nVar.A) && p005kotlin.jvm.internal.s.g(this.B, nVar.B) && p005kotlin.jvm.internal.s.g(this.C, nVar.C) && this.D == nVar.D && this.E == nVar.E && p005kotlin.jvm.internal.s.g(this.F, nVar.F) && p005kotlin.jvm.internal.s.g(this.G, nVar.G) && this.H == nVar.H && p005kotlin.jvm.internal.s.g(this.I, nVar.I);
    }

    public final int hashCode() {
        tw1.m mVar = this.f101079a;
        int iHashCode = (mVar == null ? 0 : mVar.hashCode()) * 31;
        vt1.o oVar = this.f101080b;
        int iHashCode2 = (iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        vt1.e eVar = this.f101081c;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        tw1.n nVar = this.f101082d;
        int iHashCode4 = (iHashCode3 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        xu1.a aVar = this.f101083e;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f101084f;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        DateTime dateTime = this.f101085g;
        int iHashCode7 = (iHashCode6 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.f101086h;
        int iHashCode8 = (iHashCode7 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        String str2 = this.f101087i;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        fg0.k kVar = this.f101088j;
        int iG = q6.f.g(am.j.b(this.f101090l, u0.b((iHashCode9 + (kVar == null ? 0 : kVar.hashCode())) * 31, 31, this.f101089k), 31), 31, this.f101091m);
        tw1.a aVar2 = this.f101092n;
        int iHashCode10 = (iG + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        List<iw1.a> list = this.f101093o;
        int iB = u0.b(q6.f.g(q6.f.g(q6.f.g((iHashCode10 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f101094p), 31, this.f101095q), 31, this.f101096r), 31, this.f101097s);
        Double d14 = this.f101098t;
        int iHashCode11 = (iB + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f101099u;
        int iB2 = u0.b((iHashCode11 + (d15 == null ? 0 : d15.hashCode())) * 31, 31, this.f101100v);
        List<av1.d> list2 = this.f101101w;
        int iB3 = u0.b((iB2 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.f101102x);
        oz1.b bVar = this.f101103y;
        int iHashCode12 = (iB3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        i71.w wVar = this.f101104z;
        int iHashCode13 = (iHashCode12 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        zz1.d dVar = this.A;
        int iHashCode14 = (iHashCode13 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        List<av1.h> list3 = this.B;
        int iHashCode15 = (iHashCode14 + (list3 == null ? 0 : list3.hashCode())) * 31;
        h61.a aVar3 = this.C;
        int iG2 = q6.f.g(q6.f.g((iHashCode15 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31, 31, this.D), 31, this.E);
        Boolean bool = this.F;
        int iHashCode16 = (iG2 + (bool == null ? 0 : bool.hashCode())) * 31;
        o61.q qVar = this.G;
        int iG3 = q6.f.g((iHashCode16 + (qVar == null ? 0 : qVar.hashCode())) * 31, 31, this.H);
        av1.c cVar = this.I;
        return iG3 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FBTDashBoardUiModel(trainingPlanDTO=");
        sb3.append(this.f101079a);
        sb3.append(", trainingType=");
        sb3.append(this.f101080b);
        sb3.append(", fbtPlanType=");
        sb3.append(this.f101081c);
        sb3.append(", workoutActivityType=");
        sb3.append(this.f101082d);
        sb3.append(", archProgressData=");
        sb3.append(this.f101083e);
        sb3.append(", planName=");
        sb3.append(this.f101084f);
        sb3.append(", planStartDate=");
        sb3.append(this.f101085g);
        sb3.append(", planEndDate=");
        sb3.append(this.f101086h);
        sb3.append(", pauseDateString=");
        sb3.append(this.f101087i);
        sb3.append(", eventDTO=");
        sb3.append(this.f101088j);
        sb3.append(", supportingEvents=");
        sb3.append(this.f101089k);
        sb3.append(", weatherData=");
        sb3.append(this.f101090l);
        sb3.append(", hasPhaseData=");
        sb3.append(this.f101091m);
        sb3.append(", currentPlanPhase=");
        sb3.append(this.f101092n);
        sb3.append(", dashboardWorkoutsAndActivities=");
        sb3.append(this.f101093o);
        sb3.append(", isPlanCompleted=");
        sb3.append(this.f101094p);
        sb3.append(", isPlanPaused=");
        kg.f.q(", isImproveFitnessPlan=", ", dashboardActivities=", sb3, this.f101095q, this.f101096r);
        sb3.append(this.f101097s);
        sb3.append(", activityDistanceMeters=");
        sb3.append(this.f101098t);
        sb3.append(", activityDurationSec=");
        sb3.append(this.f101099u);
        sb3.append(", legActivityDistanceDurationList=");
        sb3.append(this.f101100v);
        sb3.append(", workoutCompletedActivityStats=");
        n23.j.z(sb3, this.f101101w, ", workoutScheduleActivities=", this.f101102x, ", trainingReadinessDTO=");
        sb3.append(this.f101103y);
        sb3.append(", trainingStatusCardData=");
        sb3.append(this.f101104z);
        sb3.append(", intensityMinutesCardData=");
        sb3.append(this.A);
        sb3.append(", trainingPremiumContent=");
        sb3.append(this.B);
        sb3.append(", cyclingAbilityCardData=");
        sb3.append(this.C);
        sb3.append(", isUsingMetric=");
        sb3.append(this.D);
        sb3.append(", shouldShowProgressReport=");
        sb3.append(this.E);
        sb3.append(", hasStrengthTraining=");
        sb3.append(this.F);
        sb3.append(", genericVO2MaxData=");
        sb3.append(this.G);
        sb3.append(", showCyclingSwitchToBeginnerBanner=");
        sb3.append(this.H);
        sb3.append(", bodyBatteryData=");
        sb3.append(this.I);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(tw1.m mVar, vt1.o oVar, vt1.e eVar, tw1.n nVar, xu1.a aVar, String str, DateTime dateTime, DateTime dateTime2, String str2, fg0.k kVar, List<fg0.k> list, Map<Long, fg0.t> map, boolean z14, tw1.a aVar2, List<iw1.a> list2, boolean z15, boolean z16, boolean z17, List<av1.b> list3, Double d14, Double d15, List<w> list4, List<av1.d> list5, List<? extends ActivityListItemDTO> list6, oz1.b bVar, i71.w wVar, zz1.d dVar, List<av1.h> list7, h61.a aVar3, boolean z18, boolean z19, Boolean bool, o61.q qVar, boolean z24, av1.c cVar) {
        list.getClass();
        map.getClass();
        list3.getClass();
        list4.getClass();
        list6.getClass();
        this.f101079a = mVar;
        this.f101080b = oVar;
        this.f101081c = eVar;
        this.f101082d = nVar;
        this.f101083e = aVar;
        this.f101084f = str;
        this.f101085g = dateTime;
        this.f101086h = dateTime2;
        this.f101087i = str2;
        this.f101088j = kVar;
        this.f101089k = list;
        this.f101090l = map;
        this.f101091m = z14;
        this.f101092n = aVar2;
        this.f101093o = list2;
        this.f101094p = z15;
        this.f101095q = z16;
        this.f101096r = z17;
        this.f101097s = list3;
        this.f101098t = d14;
        this.f101099u = d15;
        this.f101100v = list4;
        this.f101101w = list5;
        this.f101102x = list6;
        this.f101103y = bVar;
        this.f101104z = wVar;
        this.A = dVar;
        this.B = list7;
        this.C = aVar3;
        this.D = z18;
        this.E = z19;
        this.F = bool;
        this.G = qVar;
        this.H = z24;
        this.I = cVar;
    }
}
