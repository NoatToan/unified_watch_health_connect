package ot1;

import gg1.v0;
import i3.e5;
import lc.f0;
import lc.p0;
import lc.y0;
import n70.a0;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.j0;
import p3.u1;
import p5.k0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133823a;

    public /* synthetic */ t(int i14) {
        this.f133823a = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f133823a) {
            case 0:
                u uVar = u.f133824a;
                ((Unit) obj).getClass();
                return Unit.INSTANCE;
            case 1:
                f0 f0Var = (f0) obj;
                u uVar2 = u.f133824a;
                f0Var.getClass();
                v0.T.getClass();
                f0Var.f111765d = v0.a.b().b().concat("/mobile-link/gcm/trail/{countryCode}/{province}/{trailName}");
                f0Var.f111766e = "android.intent.action.VIEW";
                return Unit.INSTANCE;
            case 2:
                u uVar3 = u.f133824a;
                ((Unit) obj).getClass();
                return Unit.INSTANCE;
            case 3:
                f0 f0Var2 = (f0) obj;
                u uVar4 = u.f133824a;
                f0Var2.getClass();
                v0.T.getClass();
                f0Var2.f111765d = v0.a.b().b().concat("/mobile-link/gcm/trail/{countryCode}/{province}/{trailName}/");
                f0Var2.f111766e = "android.intent.action.VIEW";
                return Unit.INSTANCE;
            case 4:
                u uVar5 = u.f133824a;
                ((Unit) obj).getClass();
                return Unit.INSTANCE;
            case 5:
                p0 p0Var = (p0) obj;
                u uVar6 = u.f133824a;
                p0Var.getClass();
                p0Var.c(u.f133824a.d());
                p0Var.b(-1);
                y0 y0Var = new y0();
                y0Var.f111914a = true;
                Unit unit = Unit.INSTANCE;
                p0Var.f111833f = true;
                p0Var.f111834g = y0Var.f111915b;
                return Unit.INSTANCE;
            case 6:
                f0 f0Var3 = (f0) obj;
                u uVar7 = u.f133824a;
                f0Var3.getClass();
                v0.T.getClass();
                f0Var3.f111765d = v0.a.b().b().concat("/mobile-link/gcm/trail/{countryCode}/{province}/{trailName}/{reviewId}");
                f0Var3.f111766e = "android.intent.action.VIEW";
                return Unit.INSTANCE;
            case 7:
                f0 f0Var4 = (f0) obj;
                u uVar8 = u.f133824a;
                f0Var4.getClass();
                v0.T.getClass();
                f0Var4.f111765d = v0.a.b().b().concat("/mobile-link/gcm/trail/{countryCode}/{province}/{trailName}/{reviewId}/");
                f0Var4.f111766e = "android.intent.action.VIEW";
                return Unit.INSTANCE;
            case 8:
                w wVar = w.f133841a;
                ((Unit) obj).getClass();
                return Unit.INSTANCE;
            case 9:
                return (Long) obj;
            case 10:
                Module module = (Module) obj;
                ov.a aVar = ov.a.f134124a;
                module.getClass();
                om1.c cVar = new om1.c(5);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                j0 j0Var = j0.f134944a;
                t0 t0Var = s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(jv.b.class), null, cVar, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(nv.g.class), null, new om1.c(6), kind, j0Var), module));
                return Unit.INSTANCE;
            case 11:
                oi0.b bVar = (oi0.b) obj;
                ov1.j.a aVar2 = ov1.j.f134173d;
                bVar.getClass();
                bVar.y();
                bVar.g();
                return Unit.INSTANCE;
            case 12:
                o13.p pVar = (o13.p) obj;
                pVar.getClass();
                return (kw.c) pVar.f128595b;
            case 13:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 14:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 15:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 16:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 17:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 18:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 19:
                oy0.a aVar3 = oy0.a.f134364a;
                ((oy0.i) obj).getClass();
                return Unit.INSTANCE;
            case 20:
                Module module2 = (Module) obj;
                oy1.a aVar4 = oy1.a.f134419a;
                module2.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named(o70.b.EVENT.a());
                om1.c cVar2 = new om1.c(8);
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                j0 j0Var2 = j0.f134944a;
                t0 t0Var2 = s0.f105811a;
                new KoinDefinition(module2, e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(a0.class), stringQualifierNamed, cVar2, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r70.a.class), stringQualifierNamed, new om1.c(9), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r70.r.class), stringQualifierNamed, new om1.c(10), kind2, j0Var2), module2));
                StringQualifier stringQualifierNamed2 = QualifierKt.named("EventType_" + o70.j.RACE.f130022a);
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r70.s.class), stringQualifierNamed2, new om1.c(11), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r70.r.class), stringQualifierNamed2, new om1.c(12), kind2, j0Var2), module2));
                return Unit.INSTANCE;
            case 21:
                Module module3 = (Module) obj;
                p00.a aVar5 = p00.a.f134649a;
                module3.getClass();
                om1.c cVar3 = new om1.c(13);
                ScopeRegistry.Companion companion3 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier3 = companion3.getRootScopeQualifier();
                Kind kind3 = Kind.Factory;
                j0 j0Var3 = j0.f134944a;
                t0 t0Var3 = s0.f105811a;
                new KoinDefinition(module3, e5.n(new BeanDefinition(rootScopeQualifier3, t0Var3.b(o00.a.class), null, cVar3, kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(o00.b.class), null, new om1.c(14), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(q00.a.class), null, new om1.c(15), kind3, j0Var3), module3));
                return Unit.INSTANCE;
            case 22:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 23:
                e23.a<Unit> aVar6 = ((u1.a) obj).f135324a;
                if (aVar6 != null) {
                    aVar6.invoke();
                }
                return Unit.INSTANCE;
            case 24:
                Module module4 = (Module) obj;
                p31.a aVar7 = p31.a.f135398a;
                module4.getClass();
                new KoinDefinition(module4, e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), s0.f105811a.b(o31.a.class), null, new om1.c(19), Kind.Factory, j0.f134944a), module4));
                return Unit.INSTANCE;
            case 25:
                p40.b bVar2 = p40.b.f135634a;
                ((q40.b) obj).getClass();
                return Unit.INSTANCE;
            case 26:
                p40.i iVar = p40.i.f135676a;
                ((q40.b) obj).getClass();
                return Unit.INSTANCE;
            case 27:
                p40.i iVar2 = p40.i.f135676a;
                ((q40.b) obj).getClass();
                return Unit.INSTANCE;
            case 28:
                p40.i iVar3 = p40.i.f135676a;
                ((q40.b) obj).getClass();
                return Unit.INSTANCE;
            default:
                p40.i iVar4 = p40.i.f135676a;
                ((q40.b) obj).getClass();
                return Unit.INSTANCE;
        }
    }
}
