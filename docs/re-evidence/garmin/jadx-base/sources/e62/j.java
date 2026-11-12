package e62;

import e23.p;
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
public final class j {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.multisport.ViewMultisportWorkoutScreenKt$ViewMultisportWorkoutScreen$3$1", f = "ViewMultisportWorkoutScreen.kt", l = {125}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f63208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.details.f f63209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.l<com.garmin.android.apps.connectmobile.workouts.presentation.details.d, Unit> f63210c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f63211d;

        /* JADX INFO: renamed from: e62.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1332a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e23.l<com.garmin.android.apps.connectmobile.workouts.presentation.details.d, Unit> f63212a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e23.a<Unit> f63213b;

            /* JADX WARN: Multi-variable type inference failed */
            public C1332a(e23.l<? super com.garmin.android.apps.connectmobile.workouts.presentation.details.d, Unit> lVar, e23.a<Unit> aVar) {
                this.f63212a = lVar;
                this.f63213b = aVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                v52.c cVar = (v52.c) obj;
                if (cVar instanceof v52.c.C3278c) {
                    this.f63212a.invoke(((v52.c.C3278c) cVar).f175760a);
                } else if (cVar instanceof v52.c.a) {
                    this.f63213b.invoke();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar, e23.l<? super com.garmin.android.apps.connectmobile.workouts.presentation.details.d, Unit> lVar, e23.a<Unit> aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f63209b = fVar;
            this.f63210c = lVar;
            this.f63211d = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f63209b, this.f63210c, this.f63211d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f63208a;
            if (i14 == 0) {
                r.b(obj);
                r53.i<v52.c<com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> iVar = this.f63209b.H0;
                C1332a c1332a = new C1332a(this.f63210c, this.f63211d);
                this.f63208a = 1;
                if (iVar.collect(c1332a, this) == aVar) {
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

    /* JADX WARN: Code duplicated, block: B:47:0x0109  */
    public static final void a(v0 v0Var, com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar, e23.a<Unit> aVar, e23.l<? super Integer, Unit> lVar, e23.l<? super com.garmin.android.apps.connectmobile.workouts.presentation.details.d, Unit> lVar2, e23.a<Unit> aVar2, m mVar, int i14) {
        com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar2 = fVar;
        v0Var.getClass();
        fVar2.getClass();
        aVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(1919890035);
        int i15 = i14 | (o0VarE.B(v0Var) ? 4 : 2) | (o0VarE.r(fVar2) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(lVar2) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (i15 & 74899) != 74898)) {
            x1 x1Var = n.f135158a;
            v52.c cVar = (v52.c) s9.c.c(fVar2.Z, o0VarE).getF182175a();
            com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar = cVar instanceof v52.c.C3278c ? (com.garmin.android.apps.connectmobile.workouts.presentation.details.e) ((v52.c.C3278c) cVar).f175760a : null;
            boolean z14 = cVar instanceof v52.c.b;
            z3.e eVarC = z3.f.c(1191344014, new cq0.p(aVar, 14), o0VarE);
            d50.i iVar = new d50.i(eVar, v0Var, lVar, fVar2, 9);
            fVar2 = fVar2;
            z02.d.a(z14, eVarC, null, null, null, z3.f.c(-470091766, iVar, o0VarE), o0VarE, 196656, 28);
            Unit unit = Unit.INSTANCE;
            boolean zR = ((i15 & 57344) == 16384) | o0VarE.r(fVar2) | ((i15 & 458752) == 131072);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new a(fVar2, lVar2, aVar2, null);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a(fVar2, lVar2, aVar2, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((p) objQ, unit, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.c(v0Var, fVar2, (e23.a) aVar, (e23.l) lVar, (e23.l) lVar2, (e23.a) aVar2, i14);
        }
    }
}
