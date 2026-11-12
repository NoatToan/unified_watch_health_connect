package se0;

import c80.u;
import c80.w;
import e23.l;
import i3.e5;
import java.util.List;
import jk0.x;
import o70.t;
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
import p3.p0;
import p5.k0;
import p63.f;
import r1.u0;
import r70.r;
import r70.s;
import re0.n;
import re0.o;
import rk0.f0;
import s70.v;
import sk0.h0;
import te0.d;
import te0.e;
import te0.h;
import te0.j;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158741a;

    public /* synthetic */ a(int i14) {
        this.f158741a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        String strName;
        String strName2;
        switch (this.f158741a) {
            case 0:
                Module module = (Module) obj;
                b bVar = b.f158742a;
                module.getClass();
                v vVar = new v(12);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                j0 j0Var = j0.f134944a;
                t0 t0Var = s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(n.class), null, vVar, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(o.class), null, new v(13), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(te0.b.class), null, new v(14), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(j.class), null, new v(15), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(e.class), null, new v(16), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(d.class), null, new v(17), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(h.class), null, new v(18), kind, j0Var), module));
                return Unit.INSTANCE;
            case 1:
                Module module2 = (Module) obj;
                se1.a aVar = se1.a.f158744a;
                module2.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named(t.f130079x.a());
                v vVar2 = new v(19);
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                j0 j0Var2 = j0.f134944a;
                t0 t0Var2 = s0.f105811a;
                new KoinDefinition(module2, e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(s.class), stringQualifierNamed, vVar2, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r.class), stringQualifierNamed, new v(20), kind2, j0Var2), module2));
                return Unit.INSTANCE;
            case 2:
                Module module3 = (Module) obj;
                se1.b bVar2 = se1.b.f158746a;
                module3.getClass();
                v vVar3 = new v(21);
                ScopeRegistry.Companion companion3 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier3 = companion3.getRootScopeQualifier();
                Kind kind3 = Kind.Factory;
                j0 j0Var3 = j0.f134944a;
                t0 t0Var3 = s0.f105811a;
                new KoinDefinition(module3, e5.n(new BeanDefinition(rootScopeQualifier3, t0Var3.b(pe1.a.class), null, vVar3, kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(re1.a.class), null, new v(22), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(rc0.a.class), null, new v(23), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(tc0.a.class), null, new v(24), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(we1.d.class), null, new v(25), kind3, j0Var3), module3));
                return Unit.INSTANCE;
            case 3:
                ((r1.n) obj).getClass();
                return r1.b.c(u0.d(s1.l.d(600, 0, null, 4), 2), u0.e(s1.l.d(600, 0, null, 6), 2));
            case 4:
                o4.t0 t0Var4 = (o4.t0) obj;
                t0Var4.getClass();
                t0Var4.g(false);
                return Unit.INSTANCE;
            case 5:
                oi0.b bVar3 = (oi0.b) obj;
                bVar3.getClass();
                bVar3.X();
                bVar3.Y();
                return Unit.INSTANCE;
            case 6:
                ((Unit) obj).getClass();
                return Unit.INSTANCE;
            case 7:
                ((Unit) obj).getClass();
                return Unit.INSTANCE;
            case 8:
                ((Unit) obj).getClass();
                return Unit.INSTANCE;
            case 9:
                ((Unit) obj).getClass();
                return Unit.INSTANCE;
            case 10:
                n63.e eVar = (n63.e) obj;
                eVar.getClass();
                f fVar = new f();
                eVar.f123906e = true;
                eVar.f123902a = true;
                eVar.f123904c = true;
                eVar.f123908g = true;
                t0 t0Var5 = s0.f105811a;
                p63.b bVar4 = new p63.b(t0Var5.b(ti2.j.class), null);
                bVar4.b(t0Var5.b(ti2.j.a.class), ti2.j.a.INSTANCE.serializer());
                bVar4.b(t0Var5.b(ti2.j.b.class), ti2.j.b.INSTANCE.serializer());
                bVar4.b(t0Var5.b(ti2.j.f.class), ti2.j.f.INSTANCE.serializer());
                bVar4.b(t0Var5.b(ti2.j.d.class), ti2.j.d.INSTANCE.serializer());
                a aVar2 = new a(11);
                if (bVar4.f136251d == null) {
                    bVar4.f136251d = aVar2;
                    bVar4.a(fVar);
                    eVar.f123918q = fVar.f();
                    return Unit.INSTANCE;
                }
                StringBuilder sb3 = new StringBuilder("Default deserializer provider is already registered for class ");
                sb3.append(bVar4.f136248a);
                kg.f.w(sb3, ": ", bVar4.f136251d);
                return null;
            case 11:
                return ti2.j.e.INSTANCE.serializer();
            case 12:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
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
                w wVar = (w) obj;
                wVar.getClass();
                return wVar.name();
            case 17:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 18:
                u uVar = (u) obj;
                uVar.getClass();
                return uVar.name();
            case 19:
                h0 h0Var = h0.f159674a;
                ((l) obj).getClass();
                return Unit.INSTANCE;
            case 20:
                h0 h0Var2 = h0.f159674a;
                ((l) obj).getClass();
                return Unit.INSTANCE;
            case 21:
                h0 h0Var3 = h0.f159674a;
                ((x) obj).getClass();
                return Unit.INSTANCE;
            case 22:
                sk0.j0 j0Var4 = sk0.j0.f159697a;
                ((f0) obj).getClass();
                return Unit.INSTANCE;
            case 23:
                sk0.j0 j0Var5 = sk0.j0.f159697a;
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 24:
                u uVar2 = (u) obj;
                return (uVar2 == null || (strName = uVar2.name()) == null) ? "" : strName;
            case 25:
                u uVar3 = (u) obj;
                return (uVar3 == null || (strName2 = uVar3.name()) == null) ? "" : strName2;
            case 26:
                jk0.o oVar = (jk0.o) obj;
                oVar.getClass();
                return oVar.name();
            case 27:
                uk0.e eVar2 = (uk0.e) obj;
                eVar2.getClass();
                return eVar2.getF171812a();
            case 28:
                List list = (List) obj;
                list.getClass();
                return p0.n(i53.a.h(list));
            default:
                uk0.a aVar3 = (uk0.a) obj;
                aVar3.getClass();
                return aVar3.f171795a;
        }
    }
}
