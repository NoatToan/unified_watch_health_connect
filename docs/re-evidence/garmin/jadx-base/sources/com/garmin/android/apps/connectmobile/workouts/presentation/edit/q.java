package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import c62.n2;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.List;
import okhttp3.internal.http2.Http2Connection;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u00015B\u0091\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0018j\u0002`\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0011\u0012\b\u0010 \u001a\u0004\u0018\u00010\n\u0012\u0006\u0010!\u001a\u00020\u0019\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010*\u001a\u00020\u0019\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\u0006\u0010-\u001a\u00020\n\u0012\b\b\u0002\u0010/\u001a\u00020.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\b\b\u0002\u00102\u001a\u00020\u0019¢\u0006\u0004\b3\u00104¨\u00066"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/q;", "Lc62/n2;", "Lr52/h;", "Lm52/k;", "workoutSportType", "Lm52/l;", "workoutSubType", "", "targetDeviceIdToSendWorkoutTo", "workoutId", "", "workoutName", "Ll52/i;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0;", "workoutSteps", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/k0$a;", "stepGenerator", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/v;", "powerCurveTargetDTOList", "Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;", "powerZonesDTO", "", "averageTrainingSpeed", "Lo13/p;", "", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/CriticalSwimSpeed;", "criticalSwimSpeed", "Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "exerciseListDTO", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/b;", "benchmarkList", "workoutNote", "hasTrainingPlan", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/d;", "poolLength", "Lm52/j;", "poolUnitForUnspecifiedPoolSize", "Lf62/o;", "timeDistance", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/g;", "segmentContext", "isAtpWorkout", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/a;", "workoutAudioNote", "audioDirectory", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/q$a;", "reorderState", "Lz52/a;", "biometricsProvider", "isInReorderMode", "<init>", "(Lm52/k;Lm52/l;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ll52/i;Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/k0$a;Ljava/util/List;Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;DLo13/p;Lcom/garmin/android/apps/connectmobile/repcounting/model/c;Ljava/util/List;Ljava/lang/String;ZLcom/garmin/android/apps/connectmobile/workouts/presentation/edit/d;Lm52/j;Lf62/o;Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/g;ZLcom/garmin/android/apps/connectmobile/workouts/data/model/a;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/q$a;Lz52/a;Z)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q implements n2, r52.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m52.k f49245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m52.l f49246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f49247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f49248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f49249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f49250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k0.a f49251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.workouts.data.model.v> f49252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PowerZonesDTO f49253i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final double f49254j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o13.p<Boolean, Double> f49255k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.repcounting.model.c f49256l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.workouts.data.model.b> f49257m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f49258n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f49259o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f49260p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m52.j f49261q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f62.o f49262r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f49263s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f49264t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.workouts.data.model.a f49265u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f49266v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a f49267w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z52.a f49268x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f49269y;

    public q(m52.k kVar, m52.l lVar, Long l14, Long l15, String str, l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVar, k0.a aVar, List<com.garmin.android.apps.connectmobile.workouts.data.model.v> list, PowerZonesDTO powerZonesDTO, double d14, o13.p<Boolean, Double> pVar, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list2, String str2, boolean z14, d dVar, m52.j jVar, f62.o oVar, g gVar, boolean z15, com.garmin.android.apps.connectmobile.workouts.data.model.a aVar2, String str3, a aVar3, z52.a aVar4, boolean z16) {
        kVar.getClass();
        iVar.getClass();
        aVar.getClass();
        pVar.getClass();
        dVar.getClass();
        oVar.getClass();
        gVar.getClass();
        str3.getClass();
        aVar3.getClass();
        this.f49245a = kVar;
        this.f49246b = lVar;
        this.f49247c = l14;
        this.f49248d = l15;
        this.f49249e = str;
        this.f49250f = iVar;
        this.f49251g = aVar;
        this.f49252h = list;
        this.f49253i = powerZonesDTO;
        this.f49254j = d14;
        this.f49255k = pVar;
        this.f49256l = cVar;
        this.f49257m = list2;
        this.f49258n = str2;
        this.f49259o = z14;
        this.f49260p = dVar;
        this.f49261q = jVar;
        this.f49262r = oVar;
        this.f49263s = gVar;
        this.f49264t = z15;
        this.f49265u = aVar2;
        this.f49266v = str3;
        this.f49267w = aVar3;
        this.f49268x = aVar4;
        this.f49269y = z16;
    }

    public static q L(q qVar, l52.i iVar, String str, d dVar, f62.o oVar, com.garmin.android.apps.connectmobile.workouts.data.model.a aVar, a aVar2, boolean z14, int i14) {
        m52.k kVar = qVar.f49245a;
        m52.l lVar = qVar.f49246b;
        Long l14 = qVar.f49247c;
        Long l15 = qVar.f49248d;
        String str2 = qVar.f49249e;
        l52.i iVar2 = (i14 & 32) != 0 ? qVar.f49250f : iVar;
        k0.a aVar3 = qVar.f49251g;
        l52.i iVar3 = iVar2;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.v> list = qVar.f49252h;
        PowerZonesDTO powerZonesDTO = qVar.f49253i;
        double d14 = qVar.f49254j;
        o13.p<Boolean, Double> pVar = qVar.f49255k;
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar = qVar.f49256l;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list2 = qVar.f49257m;
        String str3 = (i14 & 8192) != 0 ? qVar.f49258n : str;
        boolean z15 = qVar.f49259o;
        d dVar2 = (i14 & 32768) != 0 ? qVar.f49260p : dVar;
        m52.j jVar = qVar.f49261q;
        f62.o oVar2 = (i14 & 131072) != 0 ? qVar.f49262r : oVar;
        g gVar = qVar.f49263s;
        boolean z16 = qVar.f49264t;
        com.garmin.android.apps.connectmobile.workouts.data.model.a aVar4 = (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? qVar.f49265u : aVar;
        String str4 = qVar.f49266v;
        a aVar5 = (i14 & 4194304) != 0 ? qVar.f49267w : aVar2;
        z52.a aVar6 = qVar.f49268x;
        boolean z17 = (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? qVar.f49269y : z14;
        qVar.getClass();
        kVar.getClass();
        iVar3.getClass();
        aVar3.getClass();
        pVar.getClass();
        dVar2.getClass();
        oVar2.getClass();
        gVar.getClass();
        str4.getClass();
        aVar5.getClass();
        return new q(kVar, lVar, l14, l15, str2, iVar3, aVar3, list, powerZonesDTO, d14, pVar, cVar, list2, str3, z15, dVar2, jVar, oVar2, gVar, z16, aVar4, str4, aVar5, aVar6, z17);
    }

    @Override // c62.n2
    public final d A() {
        throw null;
    }

    @Override // c62.n2
    public final m52.k B() {
        throw null;
    }

    @Override // c62.n2
    public final String D() {
        throw null;
    }

    @Override // c62.n2
    public final PowerZonesDTO H() {
        throw null;
    }

    @Override // c62.n2
    public final f62.o b() {
        throw null;
    }

    @Override // c62.n2
    public final com.garmin.android.apps.connectmobile.repcounting.model.c c() {
        throw null;
    }

    @Override // c62.n2
    public final List<com.garmin.android.apps.connectmobile.workouts.data.model.v> d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f49245a == qVar.f49245a && this.f49246b == qVar.f49246b && p005kotlin.jvm.internal.s.g(this.f49247c, qVar.f49247c) && p005kotlin.jvm.internal.s.g(this.f49248d, qVar.f49248d) && p005kotlin.jvm.internal.s.g(this.f49249e, qVar.f49249e) && p005kotlin.jvm.internal.s.g(this.f49250f, qVar.f49250f) && p005kotlin.jvm.internal.s.g(this.f49251g, qVar.f49251g) && p005kotlin.jvm.internal.s.g(this.f49252h, qVar.f49252h) && p005kotlin.jvm.internal.s.g(this.f49253i, qVar.f49253i) && Double.compare(this.f49254j, qVar.f49254j) == 0 && p005kotlin.jvm.internal.s.g(this.f49255k, qVar.f49255k) && p005kotlin.jvm.internal.s.g(this.f49256l, qVar.f49256l) && p005kotlin.jvm.internal.s.g(this.f49257m, qVar.f49257m) && p005kotlin.jvm.internal.s.g(this.f49258n, qVar.f49258n) && this.f49259o == qVar.f49259o && p005kotlin.jvm.internal.s.g(this.f49260p, qVar.f49260p) && this.f49261q == qVar.f49261q && p005kotlin.jvm.internal.s.g(this.f49262r, qVar.f49262r) && p005kotlin.jvm.internal.s.g(this.f49263s, qVar.f49263s) && this.f49264t == qVar.f49264t && p005kotlin.jvm.internal.s.g(this.f49265u, qVar.f49265u) && p005kotlin.jvm.internal.s.g(this.f49266v, qVar.f49266v) && p005kotlin.jvm.internal.s.g(this.f49267w, qVar.f49267w) && p005kotlin.jvm.internal.s.g(this.f49268x, qVar.f49268x) && this.f49269y == qVar.f49269y;
    }

    public final int hashCode() {
        int iHashCode = this.f49245a.hashCode() * 31;
        m52.l lVar = this.f49246b;
        int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Long l14 = this.f49247c;
        int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f49248d;
        int iHashCode4 = (iHashCode3 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str = this.f49249e;
        int iHashCode5 = (this.f49251g.hashCode() + ((this.f49250f.hashCode() + ((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.v> list = this.f49252h;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        PowerZonesDTO powerZonesDTO = this.f49253i;
        int iHashCode7 = (this.f49255k.hashCode() + org.apache.commons.lang3.e.b((iHashCode6 + (powerZonesDTO == null ? 0 : powerZonesDTO.hashCode())) * 31, 31, this.f49254j)) * 31;
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar = this.f49256l;
        int iHashCode8 = (iHashCode7 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list2 = this.f49257m;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.f49258n;
        int iHashCode10 = (this.f49260p.hashCode() + q6.f.g((iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f49259o)) * 31;
        m52.j jVar = this.f49261q;
        int iG = q6.f.g((this.f49263s.hashCode() + ((this.f49262r.hashCode() + ((iHashCode10 + (jVar == null ? 0 : jVar.hashCode())) * 31)) * 31)) * 31, 31, this.f49264t);
        com.garmin.android.apps.connectmobile.workouts.data.model.a aVar = this.f49265u;
        int iHashCode11 = (this.f49267w.hashCode() + wr.g.j((iG + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f49266v)) * 31;
        z52.a aVar2 = this.f49268x;
        return Boolean.hashCode(this.f49269y) + ((iHashCode11 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31);
    }

    @Override // c62.n2
    public final g o() {
        throw null;
    }

    @Override // c62.n2
    public final l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> p() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WorkoutEditCreateUIState(workoutSportType=");
        sb3.append(this.f49245a);
        sb3.append(", workoutSubType=");
        sb3.append(this.f49246b);
        sb3.append(", targetDeviceIdToSendWorkoutTo=");
        kg.f.s(sb3, this.f49247c, ", workoutId=", this.f49248d, ", workoutName=");
        sb3.append(this.f49249e);
        sb3.append(", workoutSteps=");
        sb3.append(this.f49250f);
        sb3.append(", stepGenerator=");
        sb3.append(this.f49251g);
        sb3.append(", powerCurveTargetDTOList=");
        sb3.append(this.f49252h);
        sb3.append(", powerZonesDTO=");
        sb3.append(this.f49253i);
        sb3.append(", averageTrainingSpeed=");
        sb3.append(this.f49254j);
        sb3.append(", criticalSwimSpeed=");
        sb3.append(this.f49255k);
        sb3.append(", exerciseListDTO=");
        sb3.append(this.f49256l);
        sb3.append(", benchmarkList=");
        sb3.append(this.f49257m);
        sb3.append(", workoutNote=");
        sb3.append(this.f49258n);
        sb3.append(", hasTrainingPlan=");
        sb3.append(this.f49259o);
        sb3.append(", poolLength=");
        sb3.append(this.f49260p);
        sb3.append(", poolUnitForUnspecifiedPoolSize=");
        sb3.append(this.f49261q);
        sb3.append(", timeDistance=");
        sb3.append(this.f49262r);
        sb3.append(", segmentContext=");
        sb3.append(this.f49263s);
        sb3.append(", isAtpWorkout=");
        sb3.append(this.f49264t);
        sb3.append(", workoutAudioNote=");
        sb3.append(this.f49265u);
        sb3.append(", audioDirectory=");
        sb3.append(this.f49266v);
        sb3.append(", reorderState=");
        sb3.append(this.f49267w);
        sb3.append(", biometricsProvider=");
        sb3.append(this.f49268x);
        return com.airbnb.lottie.animation.keyframe.a.i(sb3, ", isInReorderMode=", this.f49269y, ")");
    }

    @Override // c62.n2
    public final String u() {
        throw null;
    }

    @Override // c62.n2
    public final double y() {
        throw null;
    }

    @Override // c62.n2
    public final o13.p<Boolean, Double> z() {
        throw null;
    }

    public interface a {

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.edit.q$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/q$a$a;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/q$a;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C0967a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0967a f49270a = new C0967a();

            private C0967a() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0967a);
            }

            public final int hashCode() {
                return -150160440;
            }

            public final String toString() {
                return "Idle";
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/q$a$b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/q$a;", "Ll52/i$b;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0;", "currentDraggingNodePath", "", "isLastReorderCompliant", "<init>", "(Ll52/i$b;Z)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f49271a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f49272b;

            public b(l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar, boolean z14) {
                bVar.getClass();
                this.f49271a = bVar;
                this.f49272b = z14;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return p005kotlin.jvm.internal.s.g(this.f49271a, bVar.f49271a) && this.f49272b == bVar.f49272b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f49272b) + (this.f49271a.hashCode() * 31);
            }

            public final String toString() {
                return "InProgress(currentDraggingNodePath=" + this.f49271a + ", isLastReorderCompliant=" + this.f49272b + ")";
            }

            public /* synthetic */ b(l52.i.b bVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
                this(bVar, (i14 & 2) != 0 ? false : z14);
            }
        }
    }

    public /* synthetic */ q(m52.k kVar, m52.l lVar, Long l14, Long l15, String str, l52.i iVar, k0.a aVar, List list, PowerZonesDTO powerZonesDTO, double d14, o13.p pVar, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, List list2, String str2, boolean z14, d dVar, m52.j jVar, f62.o oVar, g gVar, boolean z15, com.garmin.android.apps.connectmobile.workouts.data.model.a aVar2, String str3, a aVar3, z52.a aVar4, boolean z16, int i14, p005kotlin.jvm.internal.j jVar2) {
        this(kVar, lVar, l14, l15, str, iVar, aVar, list, powerZonesDTO, d14, pVar, cVar, list2, str2, z14, dVar, jVar, oVar, gVar, z15, aVar2, str3, (i14 & 4194304) != 0 ? a.C0967a.f49270a : aVar3, (i14 & 8388608) != 0 ? null : aVar4, (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : z16);
    }
}
