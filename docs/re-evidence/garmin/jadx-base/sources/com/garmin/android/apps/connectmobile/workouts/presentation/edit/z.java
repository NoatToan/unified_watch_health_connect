package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel$refreshForEditedStep$1", f = "WorkoutEditCreateViewModel.kt", l = {1389, 1390}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f49410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.data.model.j0 f49411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f49412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Boolean f49413e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, r rVar, Boolean bool, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f49411c = j0Var;
        this.f49412d = rVar;
        this.f49413e = bool;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        z zVar = new z(this.f49411c, this.f49412d, this.f49413e, dVar);
        zVar.f49410b = obj;
        return zVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0139, code lost:
    
        if (r5.N4(r43) == r2) goto L73;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f49409a;
        r rVar = this.f49412d;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = this.f49411c;
        if (j0Var == null) {
            return Unit.INSTANCE;
        }
        q qVar = (q) v52.d.c(rVar.f49286m);
        String str2 = j0Var.H0;
        String strG = j0Var.g();
        if (g22.n.d(str2) && g22.n.d(strG)) {
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar = qVar.f49256l;
            com.garmin.android.apps.connectmobile.repcounting.model.d dVarD = cVar != null ? cVar.D(str2, strG) : null;
            if (dVarD != null && !dVarD.f41105d && j0Var.J0 < 0.0d) {
                j0Var.I0 = dVarD.f41104c;
                j0Var.H0 = dVarD.f41102a;
                j0Var.J0 = -2.0d;
            }
        }
        l52.e<com.garmin.android.apps.connectmobile.workouts.data.model.j0> eVarB = l52.w.b(qVar.f49250f);
        try {
            l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar = rVar.f49279f;
            if (bVar == null) {
                return Unit.INSTANCE;
            }
            rVar.f49279f = null;
            l52.e.b bVarN3 = ((l52.m) eVarB).n3(bVar);
            if (bVarN3 == null) {
                return Unit.INSTANCE;
            }
            bVarN3.h(com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(this.f49411c, 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0, 0, 0, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -1, 16383));
            if (p005kotlin.jvm.internal.s.g(this.f49413e, Boolean.TRUE) && (str = j0Var.O0) != null) {
                rVar.f49281h.add(str);
            }
            if (qVar.f49245a == m52.k.f116758r && (qVar.f49260p instanceof d.c)) {
                if (j0Var.f48227l == m52.a.f116656l) {
                    m52.j jVar = j0Var.f48231p;
                    if (jVar == null) {
                        jVar = rVar.f49278e;
                    }
                    r.C4(rVar, eVarB, jVar);
                }
                if (j0Var.E == m52.g.PACE) {
                    Enum r14 = j0Var.P;
                    if (r14 == null) {
                        r14 = rVar.f49278e;
                    }
                    r.C4(rVar, eVarB, r14 == m52.h.YARD ? m52.j.f116748h : m52.j.f116747g);
                }
            }
            r53.j<v52.c<q>> jVar2 = rVar.f49285l;
            q qVarL = q.L(qVar, eVarB, null, null, null, null, null, false, 33554399);
            this.f49410b = null;
            this.f49409a = 1;
            if (v52.d.a(jVar2, qVarL, this) != aVar) {
            }
            return aVar;
        } catch (Exception e4) {
            a2 a2Var = a2.WORKOUTS;
            i2.f36769a.getClass();
            i2.a.d(a2Var, e4);
        }
        this.f49410b = null;
        this.f49409a = 2;
        m52.j jVar3 = r.f49273q;
    }
}
