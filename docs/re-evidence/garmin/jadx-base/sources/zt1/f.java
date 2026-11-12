package zt1;

import am.j;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import fy1.i;
import j23.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import rt1.r;
import wt1.u;
import xw1.k;
import xw1.m;
import xw1.n;
import zf0.y0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzt1/f;", "", "Lzt1/d;", "view", "", "athletePlanId", "Lxw1/c;", "trainingPlan", "<init>", "(Lzt1/d;JLxw1/c;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class f implements yt1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zt1.d f206968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f206969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xw1.c f206970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public xw1.h f206971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zt1.g f206972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<Long> f206973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u f206974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<xw1.h> f206975h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f206976i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f206977j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f206978k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f206979l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f206980m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C3858f f206981n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d f206982o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f206983p;

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"zt1/f$a", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "Lxw1/h;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<List<? extends xw1.h>> {
        public a() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            f fVar = f.this;
            fVar.f206973f.remove(Long.valueOf(j8));
            zt1.d dVar = fVar.f206968a;
            dVar.t();
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                dVar.S4(2);
            } else {
                dVar.L0(2);
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, List<? extends xw1.h> list) {
            Object obj;
            Object next;
            xw1.f coach;
            List<? extends xw1.h> list2 = list;
            eVar.getClass();
            list2.getClass();
            if (list2.isEmpty()) {
                return;
            }
            f fVar = f.this;
            zt1.g.b bVarA = zt1.g.b.a(fVar.f206972e.d());
            xw1.c cVar = bVarA.f206993a;
            Iterator<T> it = list2.iterator();
            do {
                obj = null;
                if (it.hasNext()) {
                    next = it.next();
                    coach = ((xw1.h) next).getCoach();
                }
                bVarA.f206994b = (xw1.h) obj;
                fVar.f206972e.b(bVarA);
                fVar.r();
            } while (!s.g(coach != null ? coach.getCoachId() : null, cVar.getCoachId()));
            obj = next;
            bVarA.f206994b = (xw1.h) obj;
            fVar.f206972e.b(bVarA);
            fVar.r();
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"zt1/f$b", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "Lxw1/h;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<List<? extends xw1.h>> {
        public b() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            f fVar = f.this;
            fVar.f206973f.remove(Long.valueOf(j8));
            zt1.d dVar = fVar.f206968a;
            dVar.t();
            if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                dVar.L0(4);
                return;
            }
            dVar.S4(4);
            zt1.g.b bVarD = fVar.f206972e.d();
            List<xw1.h> list = bVarD.f206995c;
            if (list != null) {
                dVar.X3(bVarD.f206993a, null, list);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, List<? extends xw1.h> list) {
            List<? extends xw1.h> list2 = list;
            eVar.getClass();
            list2.getClass();
            f fVar = f.this;
            zt1.g.b bVarA = zt1.g.b.a(fVar.f206972e.d());
            bVarA.f206995c = list2;
            fVar.f206972e.b(bVarA);
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"zt1/f$c", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "Lxw1/h;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<List<? extends xw1.h>> {
        public c() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            f fVar = f.this;
            ArrayList<Long> arrayList = fVar.f206973f;
            zt1.g gVar = fVar.f206972e;
            arrayList.remove(Long.valueOf(j8));
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            zt1.d dVar = fVar.f206968a;
            if (cVar != cVar2) {
                dVar.L0(2);
                return;
            }
            dVar.S4(2);
            List<xw1.h> list = gVar.d().f206995c;
            xw1.c cVar3 = gVar.d().f206993a;
            xw1.h hVar = null;
            Object obj = null;
            if (list != null) {
                for (Object obj2 : list) {
                    xw1.f coach = ((xw1.h) obj2).getCoach();
                    if (s.g(coach != null ? coach.getCoachId() : null, cVar3.getCoachId())) {
                        obj = obj2;
                        break;
                    }
                }
                hVar = (xw1.h) obj;
            }
            if (hVar != null) {
                dVar.e0(cVar3, hVar.A(), hVar.y());
            } else {
                dVar.t();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, List<? extends xw1.h> list) {
            List<? extends xw1.h> list2 = list;
            eVar.getClass();
            list2.getClass();
            f fVar = f.this;
            zt1.g.b bVarA = zt1.g.b.a(fVar.f206972e.d());
            bVarA.f206995c = list2;
            fVar.f206972e.b(bVarA);
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"zt1/f$d", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "Lxw1/h;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<List<? extends xw1.h>> {
        public d() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            f fVar = f.this;
            fVar.f206973f.remove(Long.valueOf(j8));
            zt1.d dVar = fVar.f206968a;
            dVar.t();
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                dVar.S4(2);
            } else {
                dVar.L0(2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, List<? extends xw1.h> list) {
            Object next;
            String localizedGoal;
            xw1.f coach;
            List<? extends xw1.h> list2 = list;
            eVar.getClass();
            list2.getClass();
            if (list2.isEmpty()) {
                return;
            }
            f fVar = f.this;
            zt1.g gVar = fVar.f206972e;
            zt1.d dVar = fVar.f206968a;
            zt1.g.b bVarA = zt1.g.b.a(gVar.d());
            xw1.c cVar = bVarA.f206993a;
            Iterator<T> it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    coach = ((xw1.h) next).getCoach();
                }
            } while (!s.g(coach != null ? coach.getCoachId() : null, cVar.getCoachId()));
            xw1.h hVar = (xw1.h) next;
            if (hVar != null) {
                cVar.f0(bVarA.f206996d);
                xw1.f coach2 = hVar.getCoach();
                xw1.c cVarB = xw1.c.b(cVar, null, null, hVar.getWorkoutPlanId(), hVar.getMinWeeksPerPlan(), hVar.getMaxWeeksPerPlan(), hVar.getMinWorkoutsPerWeek(), hVar.getMaxWorkoutsPerWeek(), coach2 != null ? coach2.getCoachId() : null, hVar.g(), 0, 0, null, 33326847);
                m mVar = bVarA.f206996d;
                if (mVar != null ? mVar.f() : false) {
                    bVarA.f206994b = hVar;
                    bVarA.f206993a = cVarB;
                    gVar.b(bVarA);
                    dVar.I6(bVarA.f206993a, false);
                    return;
                }
                gVar.d().f206994b = hVar;
                gVar.d().f206993a = cVarB;
                fVar.f206976i = Boolean.valueOf(hVar.getRequiresRaceChange());
                if (hVar.getRequiresRaceChange()) {
                    dVar.G7(new zt1.e(fVar, 3));
                    return;
                } else {
                    fVar.s();
                    return;
                }
            }
            gVar.d().f206995c = list2;
            String localizedGoal2 = cVar.getLocalizedGoal();
            String strC0 = "";
            if (localizedGoal2 == null) {
                localizedGoal2 = "";
            }
            m mVar2 = bVarA.f206996d;
            if (mVar2 == null || (localizedGoal = mVar2.getLocalizedGoal()) == null) {
                localizedGoal = "";
            }
            Integer planType = fVar.f206970c.getPlanType();
            int i14 = r.FIVE_K.f154560a;
            if (planType != null && planType.intValue() == i14) {
                strC0 = dVar.C0(R.string.msg_edit_5k_goal);
            } else {
                int i15 = r.TEN_K.f154560a;
                if (planType != null && planType.intValue() == i15) {
                    strC0 = dVar.C0(R.string.atp_msg_edit_10k_goal);
                } else {
                    int i16 = r.HALF_MARATHON.f154560a;
                    if (planType != null && planType.intValue() == i16) {
                        strC0 = dVar.C0(R.string.atp_msg_edit_half_marathon_goal);
                    }
                }
            }
            x0 x0Var = x0.f105818a;
            dVar.p2(strC0, String.format(dVar.C0(R.string.msg_edit_5k_goal_info), Arrays.copyOf(new Object[]{localizedGoal2, localizedGoal}, 2)));
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"zt1/f$e", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "Lxw1/h;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<xw1.h> {
        public e() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            f fVar = f.this;
            fVar.f206973f.remove(Long.valueOf(j8));
            zt1.d dVar = fVar.f206968a;
            dVar.t();
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                dVar.S4(1);
            } else {
                dVar.L0(1);
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, xw1.h hVar) {
            xw1.h hVar2 = hVar;
            eVar.getClass();
            hVar2.getClass();
            f fVar = f.this;
            fVar.f206971d = hVar2;
            xw1.c cVar = fVar.f206970c;
            i.f73924a.getClass();
            cVar.G(i.a.f());
            fVar.f206970c.Z(hVar2.getMinWeeksPerPlan());
            fVar.f206970c.I(hVar2.getMaxWeeksPerPlan());
            fVar.f206970c.a0(hVar2.getMinWorkoutsPerWeek());
            fVar.f206970c.M(hVar2.getMaxWorkoutsPerWeek());
            fVar.f206972e.e(xw1.c.b(fVar.f206970c, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431));
            fVar.l();
        }
    }

    /* JADX INFO: renamed from: zt1.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"zt1/f$f", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "Lxw1/h;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3858f implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<List<? extends xw1.h>> {
        public C3858f() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            xw1.h hVar;
            Object next;
            xw1.f coach;
            cVar.getClass();
            f fVar = f.this;
            fVar.f206973f.remove(Long.valueOf(j8));
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            zt1.d dVar = fVar.f206968a;
            if (cVar == cVar2) {
                dVar.S4(2);
            } else {
                dVar.L0(2);
            }
            xw1.c cVar3 = fVar.f206972e.d().f206993a;
            List<xw1.h> list = fVar.f206975h;
            if (list != null) {
                Iterator<T> it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        coach = ((xw1.h) next).getCoach();
                    }
                } while (!s.g(coach != null ? coach.getCoachId() : null, cVar3.getCoachId()));
                hVar = (xw1.h) next;
            } else {
                hVar = null;
            }
            if (hVar != null) {
                dVar.w3(cVar3, hVar.A(), hVar.y());
            } else {
                dVar.t();
            }
            fVar.f206975h = null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, List<? extends xw1.h> list) {
            List<? extends xw1.h> list2 = list;
            eVar.getClass();
            list2.getClass();
            f.this.f206975h = list2;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"zt1/f$g", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "Lxw1/d;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<xw1.d> {
        public g() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            f fVar = f.this;
            fVar.f206973f.remove(Long.valueOf(j8));
            zt1.d dVar = fVar.f206968a;
            dVar.t();
            if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                dVar.L0(0);
            } else {
                dVar.j2();
                dVar.S4(0);
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, xw1.d dVar) {
            eVar.getClass();
            dVar.getClass();
        }
    }

    public f(zt1.d dVar, long j8, xw1.c cVar) {
        dVar.getClass();
        cVar.getClass();
        this.f206968a = dVar;
        this.f206969b = j8;
        this.f206970c = cVar;
        zt1.g gVar = new zt1.g(this.f206970c);
        this.f206972e = gVar;
        this.f206973f = new ArrayList<>();
        this.f206974g = (u) KoinJavaComponent.get$default(u.class, null, null, 6, null);
        gVar.e(xw1.c.b(this.f206970c, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431));
        this.f206977j = new g();
        this.f206978k = new e();
        this.f206979l = new b();
        this.f206980m = new c();
        this.f206981n = new C3858f();
        this.f206982o = new d();
        this.f206983p = new a();
    }

    @Override // yt1.c
    public final void a(int i14) {
        xw1.h hVar;
        zt1.g gVar = this.f206972e;
        zt1.g.b bVarA = zt1.g.b.a(gVar.d());
        xw1.c cVar = bVarA.f206993a;
        cVar.c0(i14);
        List<xw1.h> list = bVarA.f206995c;
        if (list != null) {
            gVar.d().f206993a = cVar;
            o();
            return;
        }
        boolean z14 = true;
        if (list != null || (hVar = bVarA.f206994b) == null) {
            gVar.e(cVar);
            q(cVar, true);
            return;
        }
        if (hVar != null) {
            gVar.d().f206993a = cVar;
            k selectedRace = bVarA.f206993a.getSelectedRace();
            Boolean boolValueOf = null;
            DateTime dateTimeB = selectedRace != null ? selectedRace.b() : null;
            if (!hVar.getRequiresRaceChange()) {
                fy1.a.C1500a c1500a = fy1.a.f73883a;
                DateTime dateTimeA = hVar.A();
                DateTime dateTimeY = hVar.y();
                c1500a.getClass();
                if (dateTimeA != null && dateTimeY != null && dateTimeB != null) {
                    boolValueOf = Boolean.valueOf((dateTimeB.isBefore(dateTimeA) || dateTimeB.isAfter(dateTimeY)) ? false : true);
                }
                if (!s.g(boolValueOf, Boolean.FALSE)) {
                    z14 = false;
                }
            }
            Boolean boolValueOf2 = Boolean.valueOf(z14);
            this.f206976i = boolValueOf2;
            if (boolValueOf2.equals(Boolean.TRUE)) {
                this.f206968a.G7(new zt1.e(this, 2));
            } else {
                s();
            }
        }
    }

    @Override // yt1.c
    public final void b() {
        this.f206968a.s0();
    }

    @Override // yt1.c
    public final void c(m mVar) {
        mVar.getClass();
        zt1.g gVar = this.f206972e;
        xw1.c cVarB = xw1.c.b(gVar.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
        String goal = mVar.getGoal();
        zt1.d dVar = this.f206968a;
        if (goal == null) {
            dVar.B8(com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA);
            p();
            q(gVar.d().f206993a, true);
        } else {
            if (goal.equals(cVarB.getSelectedGoal()) && (!cVarB.F() || cVarB.getSelectedPaceGoalTime() != 0)) {
                gVar.e(cVarB);
                q(cVarB, true);
                return;
            }
            gVar.d().f206996d = mVar;
            dVar.G1();
            this.f206974g.K((int) this.f206969b, goal, Integer.valueOf(cVarB.getSelectedPaceGoalTime()), this.f206982o);
        }
    }

    @Override // yt1.c
    public final void d(xw1.h hVar) {
        zt1.g gVar = this.f206972e;
        xw1.c cVar = zt1.g.b.a(gVar.d()).f206993a;
        xw1.f coach = hVar.getCoach();
        Long coachId = coach != null ? coach.getCoachId() : null;
        xw1.c cVarB = xw1.c.b(cVar, null, null, hVar.getWorkoutPlanId(), hVar.getMinWeeksPerPlan(), hVar.getMaxWeeksPerPlan(), hVar.getMinWorkoutsPerWeek(), hVar.getMaxWorkoutsPerWeek(), coachId, hVar.g(), 0, 0, null, 33326847);
        gVar.d().f206994b = hVar;
        gVar.d().f206993a = cVarB;
        this.f206976i = Boolean.valueOf(hVar.getRequiresRaceChange());
        if (hVar.getRequiresRaceChange()) {
            this.f206968a.G7(new zt1.e(this, 1));
        } else {
            s();
        }
    }

    @Override // yt1.c
    public final void e(LocalDate localDate) {
        fg0.k kVar;
        localDate.getClass();
        zt1.g gVar = this.f206972e;
        xw1.c cVarB = xw1.c.b(gVar.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
        n tiEventDTO = cVarB.getTiEventDTO();
        if (tiEventDTO == null || (kVar = tiEventDTO.f192426b) == null) {
            return;
        }
        if (localDate.equals(kVar.getDate())) {
            gVar.e(cVarB);
            q(cVarB, false);
            return;
        }
        fg0.k kVarD = fg0.k.d(kVar, null, localDate, null, null, null, null, null, -33);
        n tiEventDTO2 = cVarB.getTiEventDTO();
        cVarB.h0(tiEventDTO2 != null ? n.b(tiEventDTO2, y0.EDIT_DATE, kVarD, null, 12) : null);
        gVar.d().f206993a = cVarB;
        q(cVarB, false);
    }

    @Override // yt1.c
    public final void f(com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        zt1.d dVar = this.f206968a;
        dVar.t();
        dVar.B8(cVar);
    }

    @Override // yt1.c
    public final void g(int i14) {
        zt1.g gVar = this.f206972e;
        zt1.g.b bVarA = zt1.g.b.a(gVar.d());
        xw1.c cVar = bVarA.f206993a;
        List<String> listY = cVar.y();
        if (i14 <= (listY != null ? listY.size() : 0)) {
            cVar.g0(Integer.valueOf(i14));
            gVar.e(cVar);
            q(cVar, true);
            return;
        }
        Integer selectedWorkoutsPerWeek = cVar.getSelectedWorkoutsPerWeek();
        cVar.g0(Integer.valueOf(i14));
        gVar.d().f206993a = cVar;
        List<xw1.h> list = bVarA.f206995c;
        if (list != null || (list == null && bVarA.f206994b != null)) {
            cVar.g0(Integer.valueOf(i14));
            gVar.d().f206993a = cVar;
            v(true);
        } else {
            zt1.d dVar = this.f206968a;
            String strC0 = dVar.C0(R.string.msg_edit_5k_workouts_per_week);
            x0 x0Var = x0.f105818a;
            dVar.s9(strC0, String.format(dVar.C0(R.string.msg_edit_5k_workouts_info), Arrays.copyOf(new Object[]{selectedWorkoutsPerWeek, Integer.valueOf(i14)}, 2)));
        }
    }

    @Override // yt1.c
    public final void h(String str) {
        zt1.g gVar = this.f206972e;
        xw1.c cVar = zt1.g.b.a(gVar.d()).f206993a;
        cVar.H(str);
        gVar.e(cVar);
        q(cVar, true);
    }

    @Override // yt1.c
    public final void i(ArrayList arrayList) {
        zt1.g gVar = this.f206972e;
        xw1.c cVarB = xw1.c.b(gVar.d().f206993a, null, arrayList, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554303);
        String longRunDay = cVarB.getLongRunDay();
        if (longRunDay == null || !arrayList.contains(longRunDay)) {
            gVar.d().f206993a = cVarB;
            this.f206968a.r6(cVarB);
        } else {
            gVar.e(cVarB);
            q(cVarB, true);
        }
    }

    @Override // yt1.c
    public final void j() {
        this.f206968a.G1();
    }

    @Override // yt1.c
    public final void k() {
        this.f206968a.t();
    }

    public void l() {
        this.f206968a.S6(this.f206972e.d().f206993a);
    }

    public final void m() {
        Long selectedWorkoutPlanId = this.f206970c.getSelectedWorkoutPlanId();
        if (selectedWorkoutPlanId != null) {
            this.f206968a.G1();
            this.f206973f.add(Long.valueOf(this.f206974g.m(selectedWorkoutPlanId.longValue(), this.f206978k)));
        }
    }

    public com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<xw1.d> n() {
        return this.f206977j;
    }

    public final void o() {
        xw1.h hVar = this.f206971d;
        zt1.g gVar = this.f206972e;
        zt1.g.b bVarA = zt1.g.b.a(gVar.d());
        List<xw1.h> list = bVarA.f206995c;
        zt1.d dVar = this.f206968a;
        if (hVar != null && list != null) {
            gVar.b(bVarA);
            dVar.X3(bVarA.f206993a, hVar, list);
        } else {
            dVar.B8(com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA);
            p();
            q(gVar.d().f206993a, true);
        }
    }

    public final void p() {
        zt1.g gVar = this.f206972e;
        Stack<zt1.g.b> stack = gVar.f206992b;
        if (stack.isEmpty()) {
            stack.push(new zt1.g.b(gVar.f206991a, null, null, null, 14, null));
        } else {
            zt1.g.b bVarElementAt = stack.elementAt(0);
            stack.clear();
            stack.push(bVarElementAt);
        }
        String strH = j.h(stack.size(), "resetBaseEditStep() ");
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "athletePlanId", strH);
    }

    public void q(xw1.c cVar, boolean z14) {
        cVar.getClass();
        this.f206968a.l9(cVar, z14);
    }

    public final void r() {
        zt1.g gVar = this.f206972e;
        zt1.g.b bVarD = gVar.d();
        xw1.h hVar = bVarD.f206994b;
        xw1.c cVar = bVarD.f206993a;
        zt1.d dVar = this.f206968a;
        if (hVar != null) {
            bVarD.f206993a = xw1.c.b(cVar, null, null, null, 0, 0, 0, 0, null, null, hVar.getOnChangeMaxWeeks(), hVar.getOnChangeMinWeeks(), null, 32767999);
            gVar.b(bVarD);
            dVar.w3(cVar, hVar.A(), hVar.y());
        } else {
            dVar.B8(com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA);
            p();
            q(gVar.d().f206993a, true);
        }
    }

    public final void s() {
        zt1.g gVar = this.f206972e;
        zt1.g.b bVarA = zt1.g.b.a(gVar.d());
        xw1.c cVar = bVarA.f206993a;
        int minWorkoutsPerWeek = cVar.getMinWorkoutsPerWeek();
        int maxWorkoutsPerWeek = cVar.getMaxWorkoutsPerWeek();
        if (cVar.D()) {
            cVar.g0(Integer.valueOf(minWorkoutsPerWeek));
            gVar.d().f206993a = cVar;
            Integer selectedWorkoutsPerWeek = cVar.getSelectedWorkoutsPerWeek();
            g(selectedWorkoutsPerWeek != null ? selectedWorkoutsPerWeek.intValue() : 0);
            return;
        }
        l lVar = new l(minWorkoutsPerWeek, maxWorkoutsPerWeek);
        Integer selectedWorkoutsPerWeek2 = cVar.getSelectedWorkoutsPerWeek();
        if (selectedWorkoutsPerWeek2 != null && lVar.d(selectedWorkoutsPerWeek2.intValue())) {
            Integer selectedWorkoutsPerWeek3 = cVar.getSelectedWorkoutsPerWeek();
            g(selectedWorkoutsPerWeek3 != null ? selectedWorkoutsPerWeek3.intValue() : 0);
            return;
        }
        xw1.h hVar = bVarA.f206994b;
        zt1.d dVar = this.f206968a;
        if (hVar != null) {
            gVar.b(bVarA);
            dVar.D7(cVar, hVar);
        } else {
            dVar.B8(com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA);
            p();
            q(gVar.d().f206993a, true);
        }
    }

    public final void t(boolean z14) {
        if (z14) {
            zt1.g gVar = this.f206972e;
            zt1.g.b bVarA = zt1.g.b.a(gVar.d());
            xw1.c cVar = bVarA.f206993a;
            cVar.f0(bVarA.f206996d);
            gVar.d().f206993a = cVar;
            m mVar = bVarA.f206996d;
            if (!(mVar != null ? mVar.f() : false)) {
                o();
            } else {
                gVar.b(bVarA);
                this.f206968a.I6(cVar, true);
            }
        }
    }

    public void u(n nVar) {
        boolean z14 = nVar.f192428d;
        zt1.g gVar = this.f206972e;
        if (z14) {
            gVar.a(xw1.c.b(gVar.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431));
        }
        if (s.g(this.f206976i, Boolean.TRUE)) {
            this.f206976i = null;
            gVar.c();
        }
        zt1.g.b bVarA = zt1.g.b.a(gVar.d());
        xw1.c cVar = bVarA.f206993a;
        cVar.e0(nVar.d());
        cVar.h0(nVar);
        gVar.d().f206993a = cVar;
        this.f206968a.t();
        List<xw1.h> list = bVarA.f206995c;
        if (list != null || (list == null && bVarA.f206994b != null)) {
            s();
        } else {
            gVar.e(cVar);
            q(cVar, true);
        }
    }

    public final void v(boolean z14) {
        if (z14) {
            zt1.g gVar = this.f206972e;
            zt1.g.b bVarA = zt1.g.b.a(gVar.d());
            xw1.c cVar = bVarA.f206993a;
            gVar.b(bVarA);
            this.f206968a.F8(cVar);
        }
    }

    public final void w() {
        xw1.c cVarB = xw1.c.b(this.f206972e.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
        String selectedGoal = cVarB.getSelectedGoal();
        if (selectedGoal != null) {
            this.f206968a.G1();
            this.f206974g.K((int) this.f206969b, selectedGoal, Integer.valueOf(cVarB.getSelectedPaceGoalTime()), this.f206979l);
        }
    }

    public final void x() {
        zt1.g gVar = this.f206972e;
        xw1.c cVarB = xw1.c.b(gVar.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
        gVar.a(cVarB);
        String selectedGoal = cVarB.getSelectedGoal();
        if (selectedGoal != null) {
            this.f206968a.G1();
            this.f206974g.K((int) this.f206969b, selectedGoal, Integer.valueOf(cVarB.getSelectedPaceGoalTime()), this.f206981n);
        }
    }

    public void y(int i14) {
        if (i14 == 0) {
            z();
        } else if (i14 == 1) {
            m();
        } else {
            if (i14 != 4) {
                return;
            }
            w();
        }
    }

    public void z() {
        this.f206968a.G4();
        xw1.c cVar = this.f206972e.d().f206993a;
        this.f206973f.add(Long.valueOf(this.f206974g.B(this.f206969b, cVar, n())));
    }
}
