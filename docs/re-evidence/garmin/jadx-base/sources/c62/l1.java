package c62;

import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001Bõ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001cj\u0002`\u001e\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 \u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u0006\u0010%\u001a\u00020\u001d\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\u0006\u0010(\u001a\u00020\u0004\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010+\u001a\u00020\u0004\u0012\u0006\u0010,\u001a\u00020\u0004\u0012\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010 ¢\u0006\u0004\b/\u00100¨\u00061"}, d2 = {"Lc62/l1;", "Lc62/k1;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/c;", "requestOption", "", "isCompletedWorkout", "isProtectedWorkout", "isRaceWorkout", "Lm52/k;", "workoutSportType", "", "audioDirectory", "Lf62/o;", "timeDistance", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/d;", "poolLength", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/g;", "segmentContext", "Ll52/i;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0;", "workoutSteps", "workoutNote", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/a;", "workoutAudioNote", "Lc62/c;", "msnWorkoutInfo", "Lf62/p;", "trainingEffectContext", "Lo13/p;", "", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/CriticalSwimSpeed;", "criticalSwimSpeed", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/v;", "powerCurveTargetDTOList", "Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;", "powerZonesDTO", "averageTrainingSpeed", "Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "exerciseListDTO", "isFBTWorkout", "", "trainingPlanId", "isStpWorkoutCompleted", "isStpPlanCompleted", "Lww1/i0;", "fbtWorkoutCompatibleActivityList", "<init>", "(Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/c;ZZZLm52/k;Ljava/lang/String;Lf62/o;Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/d;Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/g;Ll52/i;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/workouts/data/model/a;Lc62/c;Lf62/p;Lo13/p;Ljava/util/List;Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;DLcom/garmin/android/apps/connectmobile/repcounting/model/c;ZJZZLjava/util/List;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l1 implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.workouts.presentation.details.c f24778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m52.k f24782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f24783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f62.o f24784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.workouts.presentation.edit.d f24785h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.workouts.presentation.edit.g f24786i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f24787j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f24788k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.workouts.data.model.a f24789l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f24790m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f62.p f24791n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o13.p<Boolean, Double> f24792o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.workouts.data.model.v> f24793p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final PowerZonesDTO f24794q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final double f24795r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.repcounting.model.c f24796s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f24797t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f24798u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f24799v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f24800w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List<ww1.i0> f24801x;

    public l1(com.garmin.android.apps.connectmobile.workouts.presentation.details.c cVar, boolean z14, boolean z15, boolean z16, m52.k kVar, String str, f62.o oVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.d dVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.g gVar, l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVar, String str2, com.garmin.android.apps.connectmobile.workouts.data.model.a aVar, c cVar2, f62.p pVar, o13.p<Boolean, Double> pVar2, List<com.garmin.android.apps.connectmobile.workouts.data.model.v> list, PowerZonesDTO powerZonesDTO, double d14, com.garmin.android.apps.connectmobile.repcounting.model.c cVar3, boolean z17, long j8, boolean z18, boolean z19, List<ww1.i0> list2) {
        cVar.getClass();
        kVar.getClass();
        str.getClass();
        oVar.getClass();
        dVar.getClass();
        gVar.getClass();
        iVar.getClass();
        aVar.getClass();
        cVar2.getClass();
        pVar.getClass();
        pVar2.getClass();
        this.f24778a = cVar;
        this.f24779b = z14;
        this.f24780c = z15;
        this.f24781d = z16;
        this.f24782e = kVar;
        this.f24783f = str;
        this.f24784g = oVar;
        this.f24785h = dVar;
        this.f24786i = gVar;
        this.f24787j = iVar;
        this.f24788k = str2;
        this.f24789l = aVar;
        this.f24790m = cVar2;
        this.f24791n = pVar;
        this.f24792o = pVar2;
        this.f24793p = list;
        this.f24794q = powerZonesDTO;
        this.f24795r = d14;
        this.f24796s = cVar3;
        this.f24797t = z17;
        this.f24798u = j8;
        this.f24799v = z18;
        this.f24800w = z19;
        this.f24801x = list2;
    }

    @Override // c62.n2
    /* JADX INFO: renamed from: A, reason: from getter */
    public final com.garmin.android.apps.connectmobile.workouts.presentation.edit.d getF24785h() {
        return this.f24785h;
    }

    @Override // c62.n2
    /* JADX INFO: renamed from: B, reason: from getter */
    public final m52.k getF24782e() {
        return this.f24782e;
    }

    @Override // c62.n2
    /* JADX INFO: renamed from: D, reason: from getter */
    public final String getF24788k() {
        return this.f24788k;
    }

    @Override // c62.k1
    public final List<ww1.i0> E() {
        return this.f24801x;
    }

    @Override // c62.k1
    /* JADX INFO: renamed from: F, reason: from getter */
    public final com.garmin.android.apps.connectmobile.workouts.data.model.a getF24789l() {
        return this.f24789l;
    }

    @Override // c62.n2
    /* JADX INFO: renamed from: H, reason: from getter */
    public final PowerZonesDTO getF24794q() {
        return this.f24794q;
    }

    @Override // c62.k1
    /* JADX INFO: renamed from: I, reason: from getter */
    public final f62.p getF24791n() {
        return this.f24791n;
    }

    @Override // c62.k1
    public final k1 J(c cVar) {
        return new l1(this.f24778a, this.f24779b, this.f24780c, this.f24781d, this.f24782e, this.f24783f, this.f24784g, this.f24785h, this.f24786i, this.f24787j, this.f24788k, this.f24789l, cVar, this.f24791n, this.f24792o, this.f24793p, this.f24794q, this.f24795r, this.f24796s, this.f24797t, this.f24798u, this.f24799v, this.f24800w, this.f24801x);
    }

    @Override // c62.k1
    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getF24798u() {
        return this.f24798u;
    }

    @Override // c62.n2
    /* JADX INFO: renamed from: b, reason: from getter */
    public final f62.o getF24784g() {
        return this.f24784g;
    }

    @Override // c62.n2
    /* JADX INFO: renamed from: c, reason: from getter */
    public final com.garmin.android.apps.connectmobile.repcounting.model.c getF24796s() {
        return this.f24796s;
    }

    @Override // c62.n2
    public final List<com.garmin.android.apps.connectmobile.workouts.data.model.v> d() {
        return this.f24793p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return this.f24778a == l1Var.f24778a && this.f24779b == l1Var.f24779b && this.f24780c == l1Var.f24780c && this.f24781d == l1Var.f24781d && this.f24782e == l1Var.f24782e && this.f24783f.equals(l1Var.f24783f) && this.f24784g.equals(l1Var.f24784g) && this.f24785h.equals(l1Var.f24785h) && this.f24786i.equals(l1Var.f24786i) && this.f24787j.equals(l1Var.f24787j) && p005kotlin.jvm.internal.s.g(this.f24788k, l1Var.f24788k) && this.f24789l.equals(l1Var.f24789l) && this.f24790m.equals(l1Var.f24790m) && this.f24791n.equals(l1Var.f24791n) && this.f24792o.equals(l1Var.f24792o) && p005kotlin.jvm.internal.s.g(this.f24793p, l1Var.f24793p) && p005kotlin.jvm.internal.s.g(this.f24794q, l1Var.f24794q) && Double.compare(this.f24795r, l1Var.f24795r) == 0 && p005kotlin.jvm.internal.s.g(this.f24796s, l1Var.f24796s) && this.f24797t == l1Var.f24797t && this.f24798u == l1Var.f24798u && this.f24799v == l1Var.f24799v && this.f24800w == l1Var.f24800w && p005kotlin.jvm.internal.s.g(this.f24801x, l1Var.f24801x);
    }

    @Override // c62.k1
    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getF24799v() {
        return this.f24799v;
    }

    @Override // c62.k1
    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getF24800w() {
        return this.f24800w;
    }

    @Override // c62.k1
    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getF24797t() {
        return this.f24797t;
    }

    public final int hashCode() {
        int iHashCode = (this.f24787j.hashCode() + ((this.f24786i.hashCode() + ((this.f24785h.hashCode() + ((this.f24784g.hashCode() + wr.g.j((this.f24782e.hashCode() + q6.f.g(q6.f.g(q6.f.g(this.f24778a.hashCode() * 31, 31, this.f24779b), 31, this.f24780c), 31, this.f24781d)) * 31, 31, this.f24783f)) * 31)) * 31)) * 31)) * 31;
        String str = this.f24788k;
        int iHashCode2 = (this.f24792o.hashCode() + ((this.f24791n.hashCode() + ((this.f24790m.hashCode() + ((this.f24789l.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.v> list = this.f24793p;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        PowerZonesDTO powerZonesDTO = this.f24794q;
        int iB = org.apache.commons.lang3.e.b((iHashCode3 + (powerZonesDTO == null ? 0 : powerZonesDTO.hashCode())) * 31, 31, this.f24795r);
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar = this.f24796s;
        int iG = q6.f.g(q6.f.g(q6.f.e(q6.f.g((iB + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.f24797t), 31, this.f24798u), 31, this.f24799v), 31, this.f24800w);
        List<ww1.i0> list2 = this.f24801x;
        return iG + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // c62.k1
    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getF24779b() {
        return this.f24779b;
    }

    @Override // c62.k1
    /* JADX INFO: renamed from: l, reason: from getter */
    public final c getF24790m() {
        return this.f24790m;
    }

    @Override // c62.n2
    /* JADX INFO: renamed from: o, reason: from getter */
    public final com.garmin.android.apps.connectmobile.workouts.presentation.edit.g getF24786i() {
        return this.f24786i;
    }

    @Override // c62.n2
    public final l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> p() {
        return this.f24787j;
    }

    @Override // c62.k1
    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getF24781d() {
        return this.f24781d;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WorkoutDetailsUIInfoImpl(requestOption=");
        sb3.append(this.f24778a);
        sb3.append(", isCompletedWorkout=");
        sb3.append(this.f24779b);
        sb3.append(", isProtectedWorkout=");
        kg.f.q(", isRaceWorkout=", ", workoutSportType=", sb3, this.f24780c, this.f24781d);
        sb3.append(this.f24782e);
        sb3.append(", audioDirectory=");
        sb3.append(this.f24783f);
        sb3.append(", timeDistance=");
        sb3.append(this.f24784g);
        sb3.append(", poolLength=");
        sb3.append(this.f24785h);
        sb3.append(", segmentContext=");
        sb3.append(this.f24786i);
        sb3.append(", workoutSteps=");
        sb3.append(this.f24787j);
        sb3.append(", workoutNote=");
        sb3.append(this.f24788k);
        sb3.append(", workoutAudioNote=");
        sb3.append(this.f24789l);
        sb3.append(", msnWorkoutInfo=");
        sb3.append(this.f24790m);
        sb3.append(", trainingEffectContext=");
        sb3.append(this.f24791n);
        sb3.append(", criticalSwimSpeed=");
        sb3.append(this.f24792o);
        sb3.append(", powerCurveTargetDTOList=");
        sb3.append(this.f24793p);
        sb3.append(", powerZonesDTO=");
        sb3.append(this.f24794q);
        sb3.append(", averageTrainingSpeed=");
        sb3.append(this.f24795r);
        sb3.append(", exerciseListDTO=");
        sb3.append(this.f24796s);
        sb3.append(", isFBTWorkout=");
        sb3.append(this.f24797t);
        j20.x.j(this.f24798u, ", trainingPlanId=", ", isStpWorkoutCompleted=", sb3);
        kg.f.q(", isStpPlanCompleted=", ", fbtWorkoutCompatibleActivityList=", sb3, this.f24799v, this.f24800w);
        return u62.z.c(sb3, this.f24801x, ")");
    }

    @Override // c62.n2
    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getF24783f() {
        return this.f24783f;
    }

    @Override // c62.k1
    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getF24780c() {
        return this.f24780c;
    }

    @Override // c62.k1
    /* JADX INFO: renamed from: x, reason: from getter */
    public final com.garmin.android.apps.connectmobile.workouts.presentation.details.c getF24778a() {
        return this.f24778a;
    }

    @Override // c62.n2
    /* JADX INFO: renamed from: y, reason: from getter */
    public final double getF24795r() {
        return this.f24795r;
    }

    @Override // c62.n2
    public final o13.p<Boolean, Double> z() {
        return this.f24792o;
    }
}
