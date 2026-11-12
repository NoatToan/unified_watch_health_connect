package c63;

import ca0.z1;
import ch.qos.logback.core.CoreConstants;
import i3.e5;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25024a;

    public /* synthetic */ n(int i14) {
        this.f25024a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = 8;
        int i15 = 9;
        switch (this.f25024a) {
            case 0:
                s.c cVar = (s.c) obj;
                m.b bVar = m.b.f25016a;
                cVar.getClass();
                w.f25064b.getClass();
                cVar.l(w.f25065c);
                cVar.q(", ");
                return Unit.INSTANCE;
            case 1:
                s.c cVar2 = (s.c) obj;
                m.b bVar2 = m.b.f25016a;
                cVar2.getClass();
                t.b(cVar2, CoreConstants.COLON_CHAR);
                cVar2.n(r0.ZERO);
                return Unit.INSTANCE;
            case 2:
                s.b bVar3 = (s.b) obj;
                bVar3.getClass();
                t.b(bVar3, 't');
                return Unit.INSTANCE;
            case 3:
                s.b bVar4 = (s.b) obj;
                bVar4.getClass();
                t.b(bVar4, 'T');
                return Unit.INSTANCE;
            case 4:
                ((s.d) obj).getClass();
                return Unit.INSTANCE;
            case 5:
                s.d dVar = (s.d) obj;
                dVar.getClass();
                t.b(dVar, CoreConstants.COLON_CHAR);
                dVar.n(r0.ZERO);
                t.c(dVar, "", new n(6));
                return Unit.INSTANCE;
            case 6:
                s.d dVar2 = (s.d) obj;
                dVar2.getClass();
                t.b(dVar2, '.');
                dVar2.b(1, 9);
                return Unit.INSTANCE;
            case 7:
                ((s) obj).getClass();
                return Unit.INSTANCE;
            case 8:
                s.e eVar = (s.e) obj;
                eVar.getClass();
                t.b(eVar, CoreConstants.COLON_CHAR);
                eVar.u(r0.ZERO);
                return Unit.INSTANCE;
            case 9:
                s.e eVar2 = (s.e) obj;
                eVar2.getClass();
                eVar2.u(r0.ZERO);
                return Unit.INSTANCE;
            case 10:
                s.e eVar3 = (s.e) obj;
                eVar3.getClass();
                t.b(eVar3, 'z');
                return Unit.INSTANCE;
            case 11:
                s.e eVar4 = (s.e) obj;
                eVar4.getClass();
                eVar4.q("z");
                return Unit.INSTANCE;
            case 12:
                s.e eVar5 = (s.e) obj;
                eVar5.getClass();
                t.c(eVar5, "Z", new n(15));
                return Unit.INSTANCE;
            case 13:
                s.e eVar6 = (s.e) obj;
                eVar6.getClass();
                eVar6.q("z");
                return Unit.INSTANCE;
            case 14:
                s.e eVar7 = (s.e) obj;
                eVar7.getClass();
                t.c(eVar7, "Z", new n(16));
                return Unit.INSTANCE;
            case 15:
                s.e eVar8 = (s.e) obj;
                eVar8.getClass();
                eVar8.g(r0.ZERO);
                t.b(eVar8, CoreConstants.COLON_CHAR);
                eVar8.w(r0.ZERO);
                t.c(eVar8, "", new n(i14));
                return Unit.INSTANCE;
            case 16:
                s.e eVar9 = (s.e) obj;
                eVar9.getClass();
                eVar9.g(r0.ZERO);
                t.c(eVar9, "", new n(17));
                return Unit.INSTANCE;
            case 17:
                s.e eVar10 = (s.e) obj;
                eVar10.getClass();
                eVar10.w(r0.ZERO);
                t.c(eVar10, "", new n(i15));
                return Unit.INSTANCE;
            case 18:
                oi0.b bVar5 = (oi0.b) obj;
                int i16 = c70.c.f25219f;
                bVar5.getClass();
                bVar5.V();
                return Unit.INSTANCE;
            case 19:
                oi0.b bVar6 = (oi0.b) obj;
                int i17 = c70.c.f25219f;
                bVar6.getClass();
                bVar6.V();
                return Unit.INSTANCE;
            case 20:
                Module module = (Module) obj;
                c71.a aVar = c71.a.f25251a;
                module.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named(o70.t.J0.a());
                c50.a aVar2 = new c50.a(i14);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                p13.j0 j0Var = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(r70.s.class), stringQualifierNamed, aVar2, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r70.r.class), stringQualifierNamed, new c50.a(i15), kind, j0Var), module));
                StringQualifier stringQualifierNamed2 = QualifierKt.named(o70.t.P.a());
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r70.s.class), stringQualifierNamed2, new c50.a(10), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r70.r.class), stringQualifierNamed2, new c50.a(11), kind, j0Var), module));
                return Unit.INSTANCE;
            case 21:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 22:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 23:
                lc.p0 p0Var = (lc.p0) obj;
                p0Var.getClass();
                p0Var.f111835h = p005kotlin.jvm.internal.s0.f105811a.b(z1.a.class);
                p0Var.f111833f = false;
                lc.y0 y0VarI = kg.f.i(p0Var, -1);
                y0VarI.f111914a = false;
                Unit unit = Unit.INSTANCE;
                p0Var.f111833f = false;
                p0Var.f111834g = y0VarI.f111915b;
                p0Var.f111829b = true;
                return Unit.INSTANCE;
            case 24:
                ((r1.n) obj).getClass();
                return r1.u0.d(null, 3);
            case 25:
                ((r1.n) obj).getClass();
                return r1.u0.e(null, 3);
            case 26:
                ((r1.n) obj).getClass();
                return r1.u0.d(null, 3);
            case 27:
                ((r1.n) obj).getClass();
                return r1.u0.e(null, 3);
            case 28:
                ((r1.n) obj).getClass();
                return r1.u0.e(null, 3);
            default:
                ((r1.n) obj).getClass();
                return r1.u0.d(null, 3);
        }
    }
}
