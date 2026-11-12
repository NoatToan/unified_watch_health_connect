package pv1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import gg1.o0;
import java.util.Iterator;
import java.util.List;
import jv1.a0;
import jv1.e0;
import kv1.y;
import kv1.z;
import o13.r;
import o53.b0;
import o53.j0;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$getRunOrCyclingDSWPreferencesData$1", f = "FBTEditPreferencesViewModel.kt", l = {596, 597, 598, 599}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2 f141514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v2 f141515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v2 f141516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f141517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f141518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pv1.b f141519f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lfg0/k;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$getRunOrCyclingDSWPreferencesData$1$eventResult$1", f = "FBTEditPreferencesViewModel.kt", l = {598}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super v2<? extends List<? extends fg0.k>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pv1.b f141521b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pv1.b bVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f141521b = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f141521b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends fg0.k>>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141520a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            pv1.b bVar = this.f141521b;
            zf0.d dVar = bVar.f204384a;
            long j8 = bVar.T;
            this.f141520a = 1;
            Object objC = dVar.c(j8, this);
            return objC == aVar ? aVar : objC;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ltw1/m;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$getRunOrCyclingDSWPreferencesData$1$fbtPlanResult$1", f = "FBTEditPreferencesViewModel.kt", l = {599}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super v2<? extends tw1.m>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pv1.b f141523b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(pv1.b bVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f141523b = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f141523b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends tw1.m>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141522a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            int i15 = pv1.b.f141488i1;
            pv1.b bVar = this.f141523b;
            kv1.b bVarD5 = bVar.d5();
            long j8 = bVar.T;
            this.f141522a = 1;
            Object objC = bVarD5.c(j8, this);
            return objC == aVar ? aVar : objC;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ljv1/e0;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$getRunOrCyclingDSWPreferencesData$1$userSettingsResult$1", f = "FBTEditPreferencesViewModel.kt", l = {596}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super v2<? extends e0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pv1.b f141525b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(pv1.b bVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f141525b = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f141525b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends e0>> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141524a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            y yVarZ4 = pv1.b.Z4(this.f141525b);
            this.f141524a = 1;
            Object objA = yVarZ4.a(this);
            return objA == aVar ? aVar : objA;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Ljv1/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$getRunOrCyclingDSWPreferencesData$1$workoutsResult$1", f = "FBTEditPreferencesViewModel.kt", l = {597}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super v2<? extends List<? extends jv1.b>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pv1.b f141527b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(pv1.b bVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f141527b = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f141527b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends jv1.b>>> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141526a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            y yVarZ4 = pv1.b.Z4(this.f141527b);
            this.f141526a = 1;
            yVarZ4.getClass();
            Object objJ = f0.J(yVarZ4, new z(yVarZ4, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(pv1.b bVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f141519f = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f141519f, dVar);
        fVar.f141518e = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0098  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:49:0x011c  */
    /* JADX WARN: Code duplicated, block: B:88:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:90:0x0202  */
    /* JADX WARN: Code duplicated, block: B:91:0x0217  */
    /* JADX WARN: Code duplicated, block: B:93:0x021b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0230  */
    /* JADX WARN: Code duplicated, block: B:96:0x0234  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        v2 v2Var;
        Object objC2;
        v2 v2Var2;
        Object objC3;
        v2 v2Var3;
        v2 v2Var4;
        v2 v2Var5;
        Object objC4;
        v2 v2Var6;
        v2 v2Var7;
        Object next;
        jv1.c adaptiveCoachingWorkoutType;
        jv1.c cVar;
        List listA;
        j61.f courseProfileDTO;
        j61.f courseProfileDTO2;
        Object next2;
        b0 b0Var = (b0) this.f141518e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f141517d;
        pv1.b bVar = this.f141519f;
        if (i14 == 0) {
            r.b(obj);
            bVar.L0.k(null, Boolean.TRUE);
            j0 j0VarJ = ge1.b.j(b0Var, null, null, new c(bVar, null), 3);
            this.f141518e = b0Var;
            this.f141517d = 1;
            objC = j0VarJ.C(this);
            if (objC != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
            objC = obj;
        } else {
            if (i14 == 2) {
                v2Var = this.f141514a;
                r.b(obj);
                objC2 = obj;
                v2Var2 = (v2) objC2;
                j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new a(bVar, null), 3);
                this.f141518e = b0Var;
                this.f141514a = v2Var;
                this.f141515b = v2Var2;
                this.f141517d = 3;
                objC3 = j0VarJ2.C(this);
                if (objC3 != aVar) {
                    v2Var3 = v2Var;
                    v2Var4 = v2Var2;
                    v2Var5 = (v2) objC3;
                    j0 j0VarJ3 = ge1.b.j(b0Var, null, null, new b(bVar, null), 3);
                    this.f141518e = b0Var;
                    this.f141514a = v2Var3;
                    this.f141515b = v2Var4;
                    this.f141516c = v2Var5;
                    this.f141517d = 4;
                    objC4 = j0VarJ3.C(this);
                    if (objC4 != aVar) {
                        v2Var6 = v2Var4;
                        v2Var7 = v2Var3;
                    }
                }
                return aVar;
            }
            if (i14 == 3) {
                v2Var4 = this.f141515b;
                v2Var3 = this.f141514a;
                r.b(obj);
                objC3 = obj;
                v2Var5 = (v2) objC3;
                j0 j0VarJ4 = ge1.b.j(b0Var, null, null, new b(bVar, null), 3);
                this.f141518e = b0Var;
                this.f141514a = v2Var3;
                this.f141515b = v2Var4;
                this.f141516c = v2Var5;
                this.f141517d = 4;
                objC4 = j0VarJ4.C(this);
                if (objC4 != aVar) {
                    v2Var6 = v2Var4;
                    v2Var7 = v2Var3;
                }
                return aVar;
            }
            if (i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2 v2Var8 = this.f141516c;
            v2Var6 = this.f141515b;
            v2Var7 = this.f141514a;
            r.b(obj);
            v2Var5 = v2Var8;
            objC4 = obj;
        }
        v2 v2Var9 = (v2) objC4;
        if (!(v2Var7 instanceof v2.b) && (v2Var6 instanceof v2.b) && (v2Var5 instanceof v2.b) && (v2Var9 instanceof v2.b)) {
            e0 e0Var = (e0) ((v2.b) v2Var7).f47386a;
            bVar.getClass();
            e0Var.getClass();
            bVar.f141497k0 = e0Var;
            List<String> listD = e0Var.d();
            List<String> listB = bVar.f141497k0.b();
            List listX4 = pv1.b.X4(bVar, listD, listB);
            if (bVar.l5()) {
                Iterator it = ((Iterable) ((v2.b) v2Var6).f47386a).iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (((jv1.b) next2).getSport() != a0.CYCLING);
                jv1.b bVar2 = (jv1.b) next2;
                if (bVar2 != null) {
                    adaptiveCoachingWorkoutType = bVar2.getAdaptiveCoachingWorkoutType();
                    cVar = adaptiveCoachingWorkoutType;
                } else {
                    cVar = null;
                }
            } else {
                Iterator it3 = ((Iterable) ((v2.b) v2Var6).f47386a).iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (((jv1.b) next).getSport() != a0.RUNNING);
                jv1.b bVar3 = (jv1.b) next;
                if (bVar3 != null) {
                    adaptiveCoachingWorkoutType = bVar3.getAdaptiveCoachingWorkoutType();
                    cVar = adaptiveCoachingWorkoutType;
                } else {
                    cVar = null;
                }
            }
            bVar.X = ((jv1.b) h0.b0((List) ((v2.b) v2Var6).f47386a)).getUserProfilePk();
            fg0.k kVar = (fg0.k) h0.d0((List) ((v2.b) v2Var5).f47386a);
            fg0.d completionTarget = kVar != null ? kVar.getCompletionTarget() : null;
            tw1.m mVar = (tw1.m) ((v2.b) v2Var9).f47386a;
            List<tw1.h> listS = mVar.s();
            String elevationProfileType = (kVar == null || (courseProfileDTO2 = kVar.getCourseProfileDTO()) == null) ? null : courseProfileDTO2.getElevationProfileType();
            Double elevationGainMeter = (kVar == null || (courseProfileDTO = kVar.getCourseProfileDTO()) == null) ? null : courseProfileDTO.getElevationGainMeter();
            if ((elevationProfileType == null && elevationGainMeter == null) || completionTarget == null || !completionTarget.m()) {
                listA = null;
            } else {
                Double dB = completionTarget.b();
                o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                new dv1.a();
                listA = dv1.a.a(dB, o0VarG);
            }
            tw1.l trainingLevel = mVar.getTrainingLevel();
            tw1.k kVarB = trainingLevel != null ? trainingLevel.b() : null;
            boolean zL5 = bVar.l5();
            boolean zG0 = mVar.g0();
            tu1.i.f166483a.getClass();
            mv1.a aVar2 = new mv1.a(kVarB, zL5, zG0, tu1.i.a.l(listB), tu1.i.a.l(listX4), cVar, kVar, listS, listA);
            bVar.P0 = aVar2;
            bVar.N0.k(null, aVar2);
            bVar.L0.k(null, Boolean.FALSE);
        } else {
            if (v2Var7 instanceof v2.a) {
                String strH = f3.h(((v2.a) v2Var7).f47383a, "Error getting user settings: ", StringUtils.SPACE);
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var, "EventBaseViewModel", strH);
            } else if (v2Var6 instanceof v2.a) {
                String strH2 = f3.h(((v2.a) v2Var6).f47383a, "Error getting adaptive coaching workouts: ", StringUtils.SPACE);
                i2.a aVar4 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar4.getClass();
                i2.a.f(a2Var2, "EventBaseViewModel", strH2);
            } else if (v2Var5 instanceof v2.a) {
                String strH3 = f3.h(((v2.a) v2Var5).f47383a, "Error getting event: ", StringUtils.SPACE);
                i2.a aVar5 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar5.getClass();
                i2.a.f(a2Var3, "EventBaseViewModel", strH3);
            }
            bVar.L0.k(null, Boolean.FALSE);
        }
        return Unit.INSTANCE;
        v2Var = (v2) objC;
        j0 j0VarJ5 = ge1.b.j(b0Var, null, null, new d(bVar, null), 3);
        this.f141518e = b0Var;
        this.f141514a = v2Var;
        this.f141517d = 2;
        objC2 = j0VarJ5.C(this);
        if (objC2 != aVar) {
            v2Var2 = (v2) objC2;
            j0 j0VarJ6 = ge1.b.j(b0Var, null, null, new a(bVar, null), 3);
            this.f141518e = b0Var;
            this.f141514a = v2Var;
            this.f141515b = v2Var2;
            this.f141517d = 3;
            objC3 = j0VarJ6.C(this);
            if (objC3 != aVar) {
                v2Var3 = v2Var;
                v2Var4 = v2Var2;
                v2Var5 = (v2) objC3;
                j0 j0VarJ7 = ge1.b.j(b0Var, null, null, new b(bVar, null), 3);
                this.f141518e = b0Var;
                this.f141514a = v2Var3;
                this.f141515b = v2Var4;
                this.f141516c = v2Var5;
                this.f141517d = 4;
                objC4 = j0VarJ7.C(this);
                if (objC4 != aVar) {
                    v2Var6 = v2Var4;
                    v2Var7 = v2Var3;
                    v2 v2Var10 = (v2) objC4;
                    if (!(v2Var7 instanceof v2.b)) {
                        if (v2Var7 instanceof v2.a) {
                            String strH4 = f3.h(((v2.a) v2Var7).f47383a, "Error getting user settings: ", StringUtils.SPACE);
                            i2.a aVar6 = i2.f36769a;
                            a2 a2Var4 = a2.GENERAL;
                            aVar6.getClass();
                            i2.a.f(a2Var4, "EventBaseViewModel", strH4);
                        } else if (v2Var6 instanceof v2.a) {
                            String strH5 = f3.h(((v2.a) v2Var6).f47383a, "Error getting adaptive coaching workouts: ", StringUtils.SPACE);
                            i2.a aVar7 = i2.f36769a;
                            a2 a2Var5 = a2.GENERAL;
                            aVar7.getClass();
                            i2.a.f(a2Var5, "EventBaseViewModel", strH5);
                        } else if (v2Var5 instanceof v2.a) {
                            String strH6 = f3.h(((v2.a) v2Var5).f47383a, "Error getting event: ", StringUtils.SPACE);
                            i2.a aVar8 = i2.f36769a;
                            a2 a2Var6 = a2.GENERAL;
                            aVar8.getClass();
                            i2.a.f(a2Var6, "EventBaseViewModel", strH6);
                        }
                        bVar.L0.k(null, Boolean.FALSE);
                    } else {
                        if (v2Var7 instanceof v2.a) {
                            String strH7 = f3.h(((v2.a) v2Var7).f47383a, "Error getting user settings: ", StringUtils.SPACE);
                            i2.a aVar9 = i2.f36769a;
                            a2 a2Var7 = a2.GENERAL;
                            aVar9.getClass();
                            i2.a.f(a2Var7, "EventBaseViewModel", strH7);
                        } else if (v2Var6 instanceof v2.a) {
                            String strH8 = f3.h(((v2.a) v2Var6).f47383a, "Error getting adaptive coaching workouts: ", StringUtils.SPACE);
                            i2.a aVar10 = i2.f36769a;
                            a2 a2Var8 = a2.GENERAL;
                            aVar10.getClass();
                            i2.a.f(a2Var8, "EventBaseViewModel", strH8);
                        } else if (v2Var5 instanceof v2.a) {
                            String strH9 = f3.h(((v2.a) v2Var5).f47383a, "Error getting event: ", StringUtils.SPACE);
                            i2.a aVar11 = i2.f36769a;
                            a2 a2Var9 = a2.GENERAL;
                            aVar11.getClass();
                            i2.a.f(a2Var9, "EventBaseViewModel", strH9);
                        }
                        bVar.L0.k(null, Boolean.FALSE);
                    }
                    return Unit.INSTANCE;
                }
            }
        }
        return aVar;
    }
}
