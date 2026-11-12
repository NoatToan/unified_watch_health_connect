package x40;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.c2;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La50/g;", "data", "", "<anonymous>", "(La50/g;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseViewModel$saveCourse$2", f = "CreateCustomCourseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g1 extends v13.i implements e23.p<a50.g, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f188690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f188691b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(l0 l0Var, t13.d<? super g1> dVar) {
        super(2, dVar);
        this.f188691b = l0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g1 g1Var = new g1(this.f188691b, dVar);
        g1Var.f188690a = obj;
        return g1Var;
    }

    @Override // e23.p
    public final Object invoke(a50.g gVar, t13.d<? super Unit> dVar) {
        return ((g1) create(gVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0153  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        w20.a aVar;
        com.garmin.android.apps.connectmobile.courses.model.e eVar2;
        a50.g gVar = (a50.g) this.f188690a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        l0 l0Var = this.f188691b;
        if (gVar == null || gVar.f1393d == null) {
            l0Var.D4(a50.e.m0.f1357a);
        } else {
            wz1.c cVar = new wz1.c(6, l0Var, gVar);
            p2 p2Var = l0Var.F;
            p2 p2Var2 = l0Var.F;
            List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> list = l0Var.f188715b;
            if (((a50.g) p2Var.getValue()).f1396g.size() <= 1) {
                cVar.invoke();
            } else if (list == null || list.isEmpty()) {
                ab1.g gVar2 = l0Var.f188716c;
                if (gVar2 != null) {
                    w20.a aVar3 = ((a50.g) p2Var2.getValue()).f1393d;
                    if (aVar3 != null && (eVar = aVar3.f181476a) != null) {
                        double dQ = eVar.q();
                        if (sa1.h.e(dQ)) {
                            z20.g gVar3 = l0Var.C;
                            String str = eVar.courseId;
                            gVar3.getClass();
                            r53.u uVar = new r53.u(new r53.m1(new r53.v(new f0(l0Var, null), new c2(new z20.f(gVar3, str, null))), new g0(cVar, l0Var, null)), new h0(l0Var, null));
                            x53.c cVar2 = o53.s0.f129406a;
                            r53.s.C(r53.s.A(uVar, x53.b.f189152a), androidx.lifecycle.v1.a(l0Var));
                        } else {
                            Long l14 = gVar2.f2585r;
                            long j8 = (long) dQ;
                            if (l14 != null && l14.longValue() == j8) {
                                ab1.p pVar = gVar2.f2587v;
                                ab1.p.a aVar4 = ab1.p.f2628e;
                                com.garmin.android.apps.connectmobile.courses.model.i iVarM = eVar.m();
                                aVar4.getClass();
                                if (pVar != ab1.p.a.a(iVarM)) {
                                    z20.c0 c0Var = l0Var.D;
                                    c0Var.getClass();
                                    r53.u uVar2 = new r53.u(new r53.m1(new r53.v(new i0(l0Var, null), new c2(new z20.b0(gVar2, eVar, c0Var, null))), new j0(cVar, l0Var, null)), new k0(l0Var, null));
                                    x53.c cVar3 = o53.s0.f129406a;
                                    r53.s.C(r53.s.A(uVar2, x53.b.f189152a), androidx.lifecycle.v1.a(l0Var));
                                } else {
                                    cVar.invoke();
                                    Unit unit = Unit.INSTANCE;
                                }
                            } else {
                                z20.c0 c0Var2 = l0Var.D;
                                c0Var2.getClass();
                                r53.u uVar3 = new r53.u(new r53.m1(new r53.v(new i0(l0Var, null), new c2(new z20.b0(gVar2, eVar, c0Var2, null))), new j0(cVar, l0Var, null)), new k0(l0Var, null));
                                x53.c cVar4 = o53.s0.f129406a;
                                r53.s.C(r53.s.A(uVar3, x53.b.f189152a), androidx.lifecycle.v1.a(l0Var));
                            }
                        }
                    }
                } else {
                    cVar.invoke();
                }
            } else if (list != null && !list.isEmpty() && (aVar = ((a50.g) p2Var2.getValue()).f1393d) != null && (eVar2 = aVar.f181476a) != null) {
                int i14 = 0;
                for (Object obj2 : list) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    list.set(i14, com.garmin.android.apps.connectmobile.pacepro.data.dto.b.b((com.garmin.android.apps.connectmobile.pacepro.data.dto.b) obj2, null, null, null, null, 0.0d, null, null, 0L, 0.0d, false, null, null, null, 245759));
                    i14 = i15;
                }
                z20.a0 a0Var = l0Var.B;
                a0Var.getClass();
                r53.u uVar4 = new r53.u(new r53.m1(new r53.v(new c0(l0Var, null), new c2(new z20.z(list, a0Var, eVar2, null))), new d0(l0Var, cVar, null)), new e0(l0Var, null));
                x53.c cVar5 = o53.s0.f129406a;
                r53.s.C(r53.s.A(uVar4, x53.b.f189152a), androidx.lifecycle.v1.a(l0Var));
            }
        }
        return Unit.INSTANCE;
    }
}
