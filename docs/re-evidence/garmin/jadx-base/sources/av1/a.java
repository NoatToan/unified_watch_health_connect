package av1;

import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import fg0.k;
import fg0.t;
import i71.w;
import java.util.List;
import java.util.Map;
import jv1.e0;
import lc.u0;
import o61.q;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.k0;
import ps.r;
import tw1.m;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bù\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0006\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lav1/a;", "", "Ltw1/m;", "trainingPlanDTO", "Lfg0/k;", "eventDTO", "", "supportingEvents", "Ljv1/e0;", "userSettingsData", "", "", "Lfg0/t;", "weatherData", "Lav1/b;", "dashboardActivities", "Lav1/d;", "workoutCompletedActivityStats", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "workoutScheduleActivities", "Lps/r;", "activitySummaryDTO", "legActivityList", "Loz1/b;", "trainingReadinessDTO", "Li71/w;", "trainingStatusCardData", "Lh61/a;", "cyclingAbilityCardData", "Lzz1/d;", "intensityMinutesCardData", "Lav1/h;", "trainingPremiumContent", "Lo61/q;", "genericVO2MaxData", "Lav1/c;", "bodyBatteryData", "<init>", "(Ltw1/m;Lfg0/k;Ljava/util/List;Ljv1/e0;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lps/r;Ljava/util/List;Loz1/b;Li71/w;Lh61/a;Lzz1/d;Ljava/util/List;Lo61/q;Lav1/c;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f13226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f13227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<k> f13228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e0 f13229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<Long, t> f13230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<b> f13231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<d> f13232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<ActivityListItemDTO> f13233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r f13234i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<r> f13235j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final oz1.b f13236k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w f13237l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h61.a f13238m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zz1.d f13239n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<h> f13240o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q f13241p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f13242q;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(m mVar, k kVar, List list, e0 e0Var, Map map, List list2, List list3, List list4, r rVar, List list5, oz1.b bVar, w wVar, h61.a aVar, zz1.d dVar, List list6, q qVar, c cVar, int i14, j jVar) {
        Map map2;
        m mVar2 = (i14 & 1) != 0 ? null : mVar;
        k kVar2 = (i14 & 2) != 0 ? null : kVar;
        List list7 = (i14 & 4) != 0 ? j0.f134944a : list;
        if ((i14 & 16) != 0) {
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            map2 = k0Var;
        } else {
            map2 = map;
        }
        this(mVar2, kVar2, list7, e0Var, map2, (i14 & 32) != 0 ? j0.f134944a : list2, (i14 & 64) != 0 ? null : list3, (i14 & 128) != 0 ? j0.f134944a : list4, (i14 & 256) != 0 ? null : rVar, (i14 & 512) != 0 ? j0.f134944a : list5, (i14 & 1024) != 0 ? null : bVar, (i14 & 2048) != 0 ? null : wVar, (i14 & 4096) != 0 ? null : aVar, (i14 & 8192) != 0 ? null : dVar, (i14 & 16384) != 0 ? null : list6, (32768 & i14) != 0 ? null : qVar, (i14 & 65536) != 0 ? null : cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f13226a, aVar.f13226a) && s.g(this.f13227b, aVar.f13227b) && s.g(this.f13228c, aVar.f13228c) && s.g(this.f13229d, aVar.f13229d) && s.g(this.f13230e, aVar.f13230e) && s.g(this.f13231f, aVar.f13231f) && s.g(this.f13232g, aVar.f13232g) && s.g(this.f13233h, aVar.f13233h) && s.g(this.f13234i, aVar.f13234i) && s.g(this.f13235j, aVar.f13235j) && s.g(this.f13236k, aVar.f13236k) && s.g(this.f13237l, aVar.f13237l) && s.g(this.f13238m, aVar.f13238m) && s.g(this.f13239n, aVar.f13239n) && s.g(this.f13240o, aVar.f13240o) && s.g(this.f13241p, aVar.f13241p) && s.g(this.f13242q, aVar.f13242q);
    }

    public final int hashCode() {
        m mVar = this.f13226a;
        int iHashCode = (mVar == null ? 0 : mVar.hashCode()) * 31;
        k kVar = this.f13227b;
        int iB = u0.b((iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31, 31, this.f13228c);
        e0 e0Var = this.f13229d;
        int iB2 = u0.b(am.j.b(this.f13230e, (iB + (e0Var == null ? 0 : e0Var.hashCode())) * 31, 31), 31, this.f13231f);
        List<d> list = this.f13232g;
        int iB3 = u0.b((iB2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f13233h);
        r rVar = this.f13234i;
        int iB4 = u0.b((iB3 + (rVar == null ? 0 : rVar.hashCode())) * 31, 31, this.f13235j);
        oz1.b bVar = this.f13236k;
        int iHashCode2 = (iB4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        w wVar = this.f13237l;
        int iHashCode3 = (iHashCode2 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        h61.a aVar = this.f13238m;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        zz1.d dVar = this.f13239n;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        List<h> list2 = this.f13240o;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        q qVar = this.f13241p;
        int iHashCode7 = (iHashCode6 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        c cVar = this.f13242q;
        return iHashCode7 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FBTDashBoardDTO(trainingPlanDTO=");
        sb3.append(this.f13226a);
        sb3.append(", eventDTO=");
        sb3.append(this.f13227b);
        sb3.append(", supportingEvents=");
        sb3.append(this.f13228c);
        sb3.append(", userSettingsData=");
        sb3.append(this.f13229d);
        sb3.append(", weatherData=");
        sb3.append(this.f13230e);
        sb3.append(", dashboardActivities=");
        sb3.append(this.f13231f);
        sb3.append(", workoutCompletedActivityStats=");
        n23.j.z(sb3, this.f13232g, ", workoutScheduleActivities=", this.f13233h, ", activitySummaryDTO=");
        sb3.append(this.f13234i);
        sb3.append(", legActivityList=");
        sb3.append(this.f13235j);
        sb3.append(", trainingReadinessDTO=");
        sb3.append(this.f13236k);
        sb3.append(", trainingStatusCardData=");
        sb3.append(this.f13237l);
        sb3.append(", cyclingAbilityCardData=");
        sb3.append(this.f13238m);
        sb3.append(", intensityMinutesCardData=");
        sb3.append(this.f13239n);
        sb3.append(", trainingPremiumContent=");
        sb3.append(this.f13240o);
        sb3.append(", genericVO2MaxData=");
        sb3.append(this.f13241p);
        sb3.append(", bodyBatteryData=");
        sb3.append(this.f13242q);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(m mVar, k kVar, List<k> list, e0 e0Var, Map<Long, t> map, List<b> list2, List<d> list3, List<? extends ActivityListItemDTO> list4, r rVar, List<r> list5, oz1.b bVar, w wVar, h61.a aVar, zz1.d dVar, List<h> list6, q qVar, c cVar) {
        list.getClass();
        map.getClass();
        list2.getClass();
        list4.getClass();
        list5.getClass();
        this.f13226a = mVar;
        this.f13227b = kVar;
        this.f13228c = list;
        this.f13229d = e0Var;
        this.f13230e = map;
        this.f13231f = list2;
        this.f13232g = list3;
        this.f13233h = list4;
        this.f13234i = rVar;
        this.f13235j = list5;
        this.f13236k = bVar;
        this.f13237l = wVar;
        this.f13238m = aVar;
        this.f13239n = dVar;
        this.f13240o = list6;
        this.f13241p = qVar;
        this.f13242q = cVar;
    }
}
