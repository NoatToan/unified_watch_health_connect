package mz1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.Iterator;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.EventDetailsViewModel$getAtpPlanDetails$1", f = "EventDetailsViewModel.kt", l = {1442, 1457, 1473, 1494}, m = "invokeSuspend", v = 2)
public final class n0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f121858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v2 f121859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xw1.d f121860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f121861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f121862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f121863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e0 f121864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f121865h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.EventDetailsViewModel$getAtpPlanDetails$1$1", f = "EventDetailsViewModel.kt", l = {1458}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f121866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f121867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e0 f121868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f121869d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f121870e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Integer f121871f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f121872g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ xw1.d f121873h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e0 e0Var, long j8, String str, Integer num, String str2, xw1.d dVar, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f121868c = e0Var;
            this.f121869d = j8;
            this.f121870e = str;
            this.f121871f = num;
            this.f121872g = str2;
            this.f121873h = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f121868c, this.f121869d, this.f121870e, this.f121871f, this.f121872g, this.f121873h, dVar);
            aVar.f121867b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            fg0.x xVarB;
            Object next;
            DateTime dateTime;
            String onChangeRaceEndDate;
            String onChangeRaceStartDate;
            Long coachId;
            xw1.e coach;
            o53.b0 b0Var = (o53.b0) this.f121867b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f121866a;
            e0 e0Var = this.f121868c;
            if (i14 == 0) {
                o13.r.b(obj);
                ax1.b bVarD4 = e0Var.D4();
                String str = this.f121870e;
                str.getClass();
                this.f121867b = b0Var;
                this.f121866a = 1;
                bVarD4.getClass();
                obj = com.garmin.android.apps.connectmobile.f0.J(bVarD4, new ax1.e(bVarD4, this.f121869d, str, this.f121871f, this.f121872g, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                Iterator it = ((Iterable) ((v2.b) v2Var).f47386a).iterator();
                do {
                    xVarB = null;
                    dateTime = null;
                    dateTime = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    xw1.f coach2 = ((xw1.h) next).getCoach();
                    coachId = coach2 != null ? coach2.getCoachId() : null;
                    coach = this.f121873h.getCoach();
                } while (!p005kotlin.jvm.internal.s.g(coachId, coach != null ? coach.getCoachId() : null));
                xw1.h hVar = (xw1.h) next;
                fg0.x xVar = e0Var.f204394k;
                if (xVar != null) {
                    DateTime dateTime2 = (hVar == null || (onChangeRaceStartDate = hVar.getOnChangeRaceStartDate()) == null) ? null : new DateTime(onChangeRaceStartDate);
                    if (hVar != null && (onChangeRaceEndDate = hVar.getOnChangeRaceEndDate()) != null) {
                        dateTime = new DateTime(onChangeRaceEndDate);
                    }
                    xVarB = fg0.x.b(xVar, null, null, null, dateTime2, dateTime, null, null, null, 927);
                }
                e0Var.f204394k = xVarB;
            } else {
                if (!(v2Var instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                String strH = f3.h(((v2.a) v2Var).f47383a, "Error fetching coach plan details ", StringUtils.SPACE);
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "EventDetailsViewModel", strH);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.EventDetailsViewModel$getAtpPlanDetails$1$2", f = "EventDetailsViewModel.kt", l = {1474}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f121874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f121875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e0 f121876c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f121877d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ v2<xw1.d> f121878e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ xw1.d f121879f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f121880g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e0 e0Var, String str, v2<xw1.d> v2Var, xw1.d dVar, int i14, t13.d<? super b> dVar2) {
            super(2, dVar2);
            this.f121876c = e0Var;
            this.f121877d = str;
            this.f121878e = v2Var;
            this.f121879f = dVar;
            this.f121880g = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(this.f121876c, this.f121877d, this.f121878e, this.f121879f, this.f121880g, dVar);
            bVar.f121875b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objJ;
            Object next;
            o53.b0 b0Var = (o53.b0) this.f121875b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f121874a;
            e0 e0Var = this.f121876c;
            fg0.x xVarB = null;
            if (i14 == 0) {
                o13.r.b(obj);
                ax1.b bVarD4 = e0Var.D4();
                this.f121875b = b0Var;
                this.f121874a = 1;
                bVarD4.getClass();
                objJ = com.garmin.android.apps.connectmobile.f0.J(bVarD4, new ax1.f(bVarD4, this.f121877d, null), this);
                if (objJ == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objJ = obj;
            }
            v2 v2Var = (v2) objJ;
            if (v2Var instanceof v2.b) {
                Iterator it = ((Iterable) ((v2.b) v2Var).f47386a).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Integer workoutPlanTypeId = ((xw1.p) next).getWorkoutPlanTypeId();
                    if (workoutPlanTypeId != null && workoutPlanTypeId.intValue() == this.f121880g) {
                        break;
                    }
                }
                xw1.p pVar = (xw1.p) next;
                fg0.x xVar = e0Var.f204394k;
                if (xVar != null) {
                    xw1.d dVar = (xw1.d) ((v2.b) this.f121878e).f47386a;
                    vt1.a.C3360a c3360a = vt1.a.f180073b;
                    xw1.d dVar2 = this.f121879f;
                    int workoutPlanId = dVar2 != null ? (int) dVar2.getWorkoutPlanId() : 0;
                    c3360a.getClass();
                    xVarB = fg0.x.b(xVar, vt1.a.C3360a.a(workoutPlanId), null, pVar != null ? pVar.getPlanDistanceMeters() : null, null, null, dVar, null, null, 885);
                }
                e0Var.f204394k = xVarB;
            } else {
                if (!(v2Var instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                String strH = f3.h(((v2.a) v2Var).f47383a, "Error fetching coach plan details ", StringUtils.SPACE);
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "EventDetailsViewModel", strH);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(e0 e0Var, long j8, t13.d<? super n0> dVar) {
        super(2, dVar);
        this.f121864g = e0Var;
        this.f121865h = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n0 n0Var = new n0(this.f121864g, this.f121865h, dVar);
        n0Var.f121863f = obj;
        return n0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x013b, code lost:
    
        if (ge1.b.e0(r1, r15, r27) == r2) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        String str;
        v2 v2Var;
        int workoutPlanTypeId;
        fg0.x xVarB;
        v2 v2Var2;
        xw1.d dVar;
        String str2;
        o53.b0 b0Var = (o53.b0) this.f121863f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121862e;
        e0 e0Var = this.f121864g;
        if (i14 == 0) {
            o13.r.b(obj);
            e0Var.f204394k = new fg0.x(null, null, null, null, null, null, null, null, null, null, 1023, null);
            fy1.i.f73924a.getClass();
            String strF = fy1.i.a.f();
            ax1.b bVarD4 = e0Var.D4();
            this.f121863f = b0Var;
            this.f121858a = strF;
            this.f121862e = 1;
            bVarD4.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(bVarD4, new ax1.d(bVarD4, this.f121865h, strF, null), this);
            if (objJ != aVar) {
                str = strF;
            }
            return aVar;
        }
        if (i14 != 1) {
            if (i14 == 2) {
                workoutPlanTypeId = this.f121861d;
                xw1.d dVar2 = this.f121860c;
                v2 v2Var3 = this.f121859b;
                String str3 = this.f121858a;
                o13.r.b(obj);
                dVar = dVar2;
                v2Var2 = v2Var3;
                str2 = str3;
                int i15 = workoutPlanTypeId;
                x53.c cVar = o53.s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                b bVar2 = new b(this.f121864g, str2, v2Var2, dVar, i15, null);
                this.f121863f = null;
                this.f121858a = null;
                this.f121859b = null;
                this.f121860c = null;
                this.f121861d = i15;
                this.f121862e = 3;
            } else {
                if (i14 != 3) {
                    if (i14 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v2Var = this.f121859b;
                    o13.r.b(obj);
                    String strH = f3.h(((v2.a) v2Var).f47383a, "Error fetching atp plan details ", StringUtils.SPACE);
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.f(a2Var, "EventDetailsViewModel", strH);
                    return Unit.INSTANCE;
                }
                o13.r.b(obj);
            }
            int i16 = e0.K1;
            androidx.lifecycle.y0 y0Var = (androidx.lifecycle.y0) e0Var.f121705z1.getValue();
            fg0.x xVar = e0Var.f204394k;
            y0Var.m(new o13.p(xVar != null ? xVar.f71366b : null, xVar != null ? xVar.f71372h : null));
            return Unit.INSTANCE;
        }
        String str4 = this.f121858a;
        o13.r.b(obj);
        str = str4;
        objJ = obj;
        v2 v2Var4 = (v2) objJ;
        if (v2Var4 instanceof v2.b) {
            xw1.d dVar3 = (xw1.d) ((v2.b) v2Var4).f47386a;
            workoutPlanTypeId = dVar3.getWorkoutPlanTypeId();
            fg0.x xVar2 = e0Var.f204394k;
            if (xVar2 != null) {
                ww1.h athleteRace = dVar3.getAthleteRace();
                xVarB = fg0.x.b(xVar2, null, new DateTime(dVar3.getRegistrationDate()), null, null, null, dVar3, athleteRace != null ? athleteRace.j() : null, null, 635);
                dVar3 = dVar3;
            } else {
                xVarB = null;
            }
            e0Var.f204394k = xVarB;
            xw1.m athletePlanGoal = dVar3.getAthletePlanGoal();
            String goal = athletePlanGoal != null ? athletePlanGoal.getGoal() : null;
            Integer goalTimeSeconds = dVar3.getGoalTimeSeconds();
            x53.c cVar2 = o53.s0.f129406a;
            x53.b bVar3 = x53.b.f189152a;
            a aVar3 = new a(this.f121864g, this.f121865h, goal, goalTimeSeconds, str, dVar3, null);
            String str5 = str;
            xw1.d dVar4 = dVar3;
            this.f121863f = null;
            this.f121858a = str5;
            this.f121859b = v2Var4;
            this.f121860c = dVar4;
            this.f121861d = workoutPlanTypeId;
            this.f121862e = 2;
            if (ge1.b.e0(bVar3, aVar3, this) != aVar) {
                v2Var2 = v2Var4;
                dVar = dVar4;
                str2 = str5;
                int i17 = workoutPlanTypeId;
                x53.c cVar3 = o53.s0.f129406a;
                x53.b bVar4 = x53.b.f189152a;
                b bVar5 = new b(this.f121864g, str2, v2Var2, dVar, i17, null);
                this.f121863f = null;
                this.f121858a = null;
                this.f121859b = null;
                this.f121860c = null;
                this.f121861d = i17;
                this.f121862e = 3;
            }
        } else {
            if (!(v2Var4 instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            Integer num = ((v2.a) v2Var4).f47384b;
            this.f121863f = b0Var;
            this.f121858a = null;
            this.f121859b = v2Var4;
            this.f121862e = 4;
            if (e0.X4(e0Var, num, this) != aVar) {
                v2Var = v2Var4;
                String strH2 = f3.h(((v2.a) v2Var).f47383a, "Error fetching atp plan details ", StringUtils.SPACE);
                i2.a aVar4 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar4.getClass();
                i2.a.f(a2Var2, "EventDetailsViewModel", strH2);
                return Unit.INSTANCE;
            }
        }
        return aVar;
    }
}
