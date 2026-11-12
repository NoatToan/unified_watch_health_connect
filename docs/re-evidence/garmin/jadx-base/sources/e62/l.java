package e62;

import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.h0;
import e23.p;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import w52.v0;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.multisport.ViewMultisportWorkoutSegmentScreenKt$ViewMultisportWorkoutSegmentScreen$3$1", f = "ViewMultisportWorkoutSegmentScreen.kt", l = {91}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f63216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.details.f f63217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.l<com.garmin.android.apps.connectmobile.workouts.presentation.details.d, Unit> f63218c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f63219d;

        /* JADX INFO: renamed from: e62.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1333a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e23.l<com.garmin.android.apps.connectmobile.workouts.presentation.details.d, Unit> f63220a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e23.a<Unit> f63221b;

            /* JADX WARN: Multi-variable type inference failed */
            public C1333a(e23.l<? super com.garmin.android.apps.connectmobile.workouts.presentation.details.d, Unit> lVar, e23.a<Unit> aVar) {
                this.f63220a = lVar;
                this.f63221b = aVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                v52.c cVar = (v52.c) obj;
                if (cVar instanceof v52.c.C3278c) {
                    this.f63220a.invoke(((v52.c.C3278c) cVar).f175760a);
                } else if (cVar instanceof v52.c.a) {
                    this.f63221b.invoke();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar, e23.l<? super com.garmin.android.apps.connectmobile.workouts.presentation.details.d, Unit> lVar, e23.a<Unit> aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f63217b = fVar;
            this.f63218c = lVar;
            this.f63219d = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f63217b, this.f63218c, this.f63219d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f63216a;
            if (i14 == 0) {
                r.b(obj);
                r53.i<v52.c<com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> iVar = this.f63217b.H0;
                C1333a c1333a = new C1333a(this.f63218c, this.f63219d);
                this.f63216a = 1;
                if (iVar.collect(c1333a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f63222a = new b();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f63223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f63224b;

        public c(e23.l lVar, List list) {
            this.f63223a = lVar;
            this.f63224b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f63223a.invoke(this.f63224b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.r<e2.d, Integer, m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f63225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.details.f f63226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.details.e f63227c;

        public d(List list, com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar, com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar) {
            this.f63225a = list;
            this.f63226b = fVar;
            this.f63227c = eVar;
        }

        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, m mVar, Integer num2) {
            int i14;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = n.f135158a;
                Object obj = this.f63225a.get(iIntValue);
                mVar2.C(1756323949);
                mVar2.C(-1190270378);
                ((r52.b) obj).a(this.f63226b, this.f63227c, mVar2, 0);
                mVar2.f();
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0121  */
    public static final void a(v0 v0Var, com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar, int i14, e23.l<? super com.garmin.android.apps.connectmobile.workouts.presentation.details.d, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i15) {
        h0 h0Var;
        WorkoutDetailsDTO f48577a;
        List<h0> list;
        Object next;
        com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar2 = fVar;
        v0Var.getClass();
        fVar2.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-8599033);
        int i16 = i15 | (o0VarE.B(v0Var) ? 4 : 2) | (o0VarE.r(fVar2) ? 32 : 16) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536);
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = n.f135158a;
            v52.c cVar = (v52.c) s9.c.c(fVar2.Z, o0VarE).getF182175a();
            com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar = cVar instanceof v52.c.C3278c ? (com.garmin.android.apps.connectmobile.workouts.presentation.details.e) ((v52.c.C3278c) cVar).f175760a : null;
            if (eVar == null || (f48577a = eVar.getF48577a()) == null || (list = f48577a.Q0) == null) {
                h0Var = null;
            } else {
                Iterator<T> it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((h0) next).getSegmentOrder() != i14);
                h0Var = (h0) next;
            }
            fVar2 = fVar;
            z02.d.a(false, z3.f.c(-1506622430, new d81.h(16, h0Var, aVar2), o0VarE), null, null, null, z3.f.c(-741275490, new d50.i(eVar, h0Var, v0Var, fVar, 10), o0VarE), o0VarE, 196656, 29);
            Unit unit = Unit.INSTANCE;
            boolean zR = ((i16 & 7168) == 2048) | o0VarE.r(fVar2) | ((i16 & 57344) == 16384);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new a(fVar2, lVar, aVar, null);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a(fVar2, lVar, aVar, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((p) objQ, unit, o0VarE);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.n(v0Var, fVar2, i14, (e23.l) lVar, (e23.a) aVar, (e23.a) aVar2, i15);
        }
    }
}
