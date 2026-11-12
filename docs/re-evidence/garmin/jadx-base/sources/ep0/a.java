package ep0;

import f2.p0;
import f2.r0;
import i3.e5;
import i3.pc;
import java.util.List;
import o4.t0;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.j0;
import p5.k0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64858a;

    public /* synthetic */ a(int i14) {
        this.f64858a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        int i14 = 0;
        switch (this.f64858a) {
            case 0:
                pb2.e.t tVar = (pb2.e.t) obj;
                tVar.getClass();
                Integer num = tVar.f137093a;
                if (num != null) {
                    return Double.valueOf(num.intValue());
                }
                return null;
            case 1:
                pb2.e.t tVar2 = (pb2.e.t) obj;
                tVar2.getClass();
                return tVar2.f137096d;
            case 2:
                pb2.e.t tVar3 = (pb2.e.t) obj;
                tVar3.getClass();
                return tVar3.f137095c;
            case 3:
                pb2.e.t tVar4 = (pb2.e.t) obj;
                tVar4.getClass();
                return tVar4.f137094b;
            case 4:
                oi0.b bVar = (oi0.b) obj;
                bVar.getClass();
                bVar.a();
                return Unit.INSTANCE;
            case 5:
                sn.h hVar = (sn.h) obj;
                hVar.getClass();
                sn.g gVarM = hVar.m();
                if (gVarM != null) {
                    return gVarM.getAvgValue();
                }
                return null;
            case 6:
                oi0.b bVar2 = (oi0.b) obj;
                bVar2.getClass();
                bVar2.a();
                return Unit.INSTANCE;
            case 7:
                Double d14 = (Double) obj;
                if ((d14 != null ? d14.doubleValue() : 0.0d) >= 0.0d) {
                    return d14;
                }
                return null;
            case 8:
                ud.a aVar = (ud.a) obj;
                es2.f.b bVar3 = es2.f.f65227d;
                aVar.getClass();
                ud.c cVarM0 = aVar.M0("delete from wallet_items");
                try {
                    cVarM0.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM0.close();
                }
            case 9:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 10:
                pt1.t tVar5 = (pt1.t) obj;
                tVar5.getClass();
                return Long.valueOf(tVar5.f140967a);
            case 11:
                pc pcVar = (pc) obj;
                pcVar.getClass();
                return Boolean.valueOf(pcVar != pc.Hidden);
            case 12:
                t0 t0Var = (t0) obj;
                t0Var.getClass();
                t0Var.c(0.4f);
                return Unit.INSTANCE;
            case 13:
                q4.f fVar = (q4.f) obj;
                fVar.getClass();
                o4.d0.f128823b.getClass();
                q4.f.A0(fVar, o4.d0.c(0.4f, o4.d0.f128824c, 14), 0L, 0L, 0.0f, null, null, 126);
                return Unit.INSTANCE;
            case 14:
                ((pt1.l) obj).getClass();
                return Unit.INSTANCE;
            case 15:
                pt1.x xVar = (pt1.x) obj;
                xVar.getClass();
                return Long.valueOf(xVar.f141004a);
            case 16:
                eu.c cVar = eu.c.f66055a;
                ((f2.t) obj).getClass();
                return f2.c.a(dh.b.f(2));
            case 17:
                ju0.b bVar4 = (ju0.b) obj;
                int i15 = eu0.c.f66093a;
                bVar4.getClass();
                return bVar4.name();
            case 18:
                ju0.c cVar2 = (ju0.c) obj;
                int i16 = eu0.c.f66093a;
                cVar2.getClass();
                return cVar2.name();
            case 19:
                ((pv0.d) obj).getClass();
                return Unit.INSTANCE;
            case 20:
                Module module = (Module) obj;
                ex.a aVar2 = ex.a.f66909a;
                module.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named(o70.o.BODY_BATTERY.a());
                el1.a aVar3 = new el1.a(22);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                j0 j0Var = j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var2 = s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var2.b(r70.s.class), stringQualifierNamed, aVar3, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var2.b(r70.r.class), stringQualifierNamed, new el1.a(23), kind, j0Var), module));
                StringQualifier stringQualifierNamed2 = QualifierKt.named(o70.t.f130065i.a());
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var2.b(r70.s.class), stringQualifierNamed2, new el1.a(24), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var2.b(r70.r.class), stringQualifierNamed2, new el1.a(25), kind, j0Var), module));
                StringQualifier stringQualifierNamed3 = QualifierKt.named(o70.i.f129999g.a());
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var2.b(r70.s.class), stringQualifierNamed3, new el1.a(26), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var2.b(r70.r.class), stringQualifierNamed3, new el1.a(27), kind, j0Var), module));
                return Unit.INSTANCE;
            case 21:
                Module module2 = (Module) obj;
                ex.c cVar3 = ex.c.f66912a;
                module2.getClass();
                el1.a aVar4 = new el1.a(28);
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                j0 j0Var2 = j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var3 = s0.f105811a;
                new KoinDefinition(module2, e5.n(new BeanDefinition(rootScopeQualifier2, t0Var3.b(zw.a.class), null, aVar4, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var3.b(ax.a.class), null, new el1.a(29), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var3.b(dx.a.class), null, new ex.b(i14), kind2, j0Var2), module2));
                return Unit.INSTANCE;
            case 22:
                n63.e eVar = (n63.e) obj;
                ez0.a aVar5 = ez0.a.f67467a;
                eVar.getClass();
                eVar.f123906e = true;
                eVar.f123905d = true;
                eVar.f123903b = true;
                eVar.f123904c = true;
                eVar.f123902a = true;
                return Unit.INSTANCE;
            case 23:
                return Boolean.valueOf(((b11.v) obj).getF14235b() == 0.0d);
            case 24:
                return ((b11.v) obj).getF14234a();
            case 25:
                ((Integer) obj).getClass();
                ex.b bVar5 = f2.l.f68229d;
                return null;
            case 26:
                return Unit.INSTANCE;
            case 27:
                List list = (List) obj;
                return new p0(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 28:
                ((Integer) obj).intValue();
                return j0.f134944a;
            default:
                ((Integer) obj).getClass();
                f2.z zVar = r0.f68300a;
                return -1;
        }
    }
}
