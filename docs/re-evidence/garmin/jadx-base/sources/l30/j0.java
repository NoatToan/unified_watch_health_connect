package l30;

import androidx.lifecycle.v1;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.c2;
import r53.m1;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln30/f;", "data", "", "<anonymous>", "(Ln30/f;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseViewModel$saveCourse$2", f = "CreateCourseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j0 extends v13.i implements e23.p<n30.f, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f109592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f109593b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(z zVar, t13.d<? super j0> dVar) {
        super(2, dVar);
        this.f109593b = zVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j0 j0Var = new j0(this.f109593b, dVar);
        j0Var.f109592a = obj;
        return j0Var;
    }

    @Override // e23.p
    public final Object invoke(n30.f fVar, t13.d<? super Unit> dVar) {
        return ((j0) create(fVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0142  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        w20.a aVar;
        com.garmin.android.apps.connectmobile.courses.model.e eVar2;
        n30.f fVar = (n30.f) this.f109592a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        z zVar = this.f109593b;
        if (fVar == null || fVar.f123456d == null) {
            zVar.z4(n30.c.f0.f123412a);
        } else {
            int i14 = 0;
            i0 i0Var = new i0(i14, zVar, fVar);
            List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> list = zVar.f109649b;
            p2 p2Var = zVar.f109668w;
            if (list == null || list.isEmpty()) {
                ab1.g gVar = zVar.f109650c;
                if (gVar != null) {
                    w20.a aVar3 = ((n30.f) p2Var.getValue()).f123456d;
                    if (aVar3 != null && (eVar = aVar3.f181476a) != null) {
                        double dQ = eVar.q();
                        if (sa1.h.e(dQ)) {
                            z20.g gVar2 = zVar.f109664q;
                            String str = eVar.courseId;
                            gVar2.getClass();
                            r53.u uVar = new r53.u(new m1(new r53.v(new t(zVar, null), new c2(new z20.f(gVar2, str, null))), new u(i0Var, zVar, null)), new v(zVar, null));
                            x53.c cVar = o53.s0.f129406a;
                            r53.s.C(r53.s.A(uVar, x53.b.f189152a), v1.a(zVar));
                        } else {
                            Long l14 = gVar.f2585r;
                            long j8 = (long) dQ;
                            if (l14 != null && l14.longValue() == j8) {
                                ab1.p pVar = gVar.f2587v;
                                ab1.p.a aVar4 = ab1.p.f2628e;
                                com.garmin.android.apps.connectmobile.courses.model.i iVarM = eVar.m();
                                aVar4.getClass();
                                if (pVar != ab1.p.a.a(iVarM)) {
                                    z20.c0 c0Var = zVar.f109665r;
                                    c0Var.getClass();
                                    r53.u uVar2 = new r53.u(new m1(new r53.v(new w(zVar, null), new c2(new z20.b0(gVar, eVar, c0Var, null))), new x(i0Var, zVar, null)), new y(zVar, null));
                                    x53.c cVar2 = o53.s0.f129406a;
                                    r53.s.C(r53.s.A(uVar2, x53.b.f189152a), v1.a(zVar));
                                } else {
                                    i0Var.invoke();
                                    Unit unit = Unit.INSTANCE;
                                }
                            } else {
                                z20.c0 c0Var2 = zVar.f109665r;
                                c0Var2.getClass();
                                r53.u uVar3 = new r53.u(new m1(new r53.v(new w(zVar, null), new c2(new z20.b0(gVar, eVar, c0Var2, null))), new x(i0Var, zVar, null)), new y(zVar, null));
                                x53.c cVar3 = o53.s0.f129406a;
                                r53.s.C(r53.s.A(uVar3, x53.b.f189152a), v1.a(zVar));
                            }
                        }
                    }
                } else {
                    i0Var.invoke();
                }
            } else {
                List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> list2 = zVar.f109649b;
                if (list2 != null && !list2.isEmpty() && (aVar = ((n30.f) p2Var.getValue()).f123456d) != null && (eVar2 = aVar.f181476a) != null) {
                    for (Object obj2 : list2) {
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        list2.set(i14, com.garmin.android.apps.connectmobile.pacepro.data.dto.b.b((com.garmin.android.apps.connectmobile.pacepro.data.dto.b) obj2, null, null, null, null, 0.0d, null, null, 0L, 0.0d, false, null, null, null, 245759));
                        i14 = i15;
                    }
                    z20.a0 a0Var = zVar.f109663p;
                    a0Var.getClass();
                    r53.u uVar4 = new r53.u(new m1(new r53.v(new q(zVar, null), new c2(new z20.z(list2, a0Var, eVar2, null))), new r(zVar, i0Var, null)), new s(zVar, null));
                    x53.c cVar4 = o53.s0.f129406a;
                    r53.s.C(r53.s.A(uVar4, x53.b.f189152a), v1.a(zVar));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
