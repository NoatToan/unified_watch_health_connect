package oe2;

import c22.l3;
import c63.h0;
import c63.l0;
import com.mapbox.maps.extension.compose.MapState;
import gg1.v0;
import i3.e5;
import java.util.List;
import o72.o3;
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

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131487a;

    public /* synthetic */ g(int i14) {
        this.f131487a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        boolean z14 = true;
        z = true;
        boolean z15 = true;
        z14 = true;
        int i14 = 0;
        switch (this.f131487a) {
            case 0:
                ((MapState) obj).getClass();
                return Unit.INSTANCE;
            case 1:
                ((MapState) obj).getClass();
                return Unit.INSTANCE;
            case 2:
                sf2.d dVar = (sf2.d) obj;
                int i15 = of2.c0.f131771p;
                dVar.getClass();
                if (!(dVar instanceof sf2.d.h) && !(dVar instanceof sf2.d.C3004d)) {
                    z14 = false;
                }
                return Boolean.valueOf(z14);
            case 3:
                sf2.d dVar2 = (sf2.d) obj;
                int i16 = of2.c0.f131771p;
                dVar2.getClass();
                if (!(dVar2 instanceof sf2.d.e) && !(dVar2 instanceof sf2.d.C3004d)) {
                    z15 = false;
                }
                return Boolean.valueOf(z15);
            case 4:
                ok0.t.b bVar = (ok0.t.b) obj;
                bVar.getClass();
                return "collection-".concat(bVar.f132555a);
            case 5:
                List list = (List) obj;
                list.getClass();
                return p0.n(i53.a.h(list));
            case 6:
                uk0.a aVar = (uk0.a) obj;
                aVar.getClass();
                return fb1.c.n("gear-", aVar.f171795a);
            case 7:
                ok2.d.b bVar2 = ok2.d.f132618i;
                ((wk2.f) obj).getClass();
                return Boolean.TRUE;
            case 8:
                wk2.i iVar = (wk2.i) obj;
                ok2.g.b bVar3 = ok2.g.f132677s;
                iVar.getClass();
                return Boolean.valueOf(ok2.g.f132680v.contains(iVar.getF205155e()));
            case 9:
                ok2.a0 a0Var = (ok2.a0) obj;
                ok2.a0.a aVar2 = ok2.a0.f132585h;
                a0Var.getClass();
                return new yk2.a(a0Var);
            case 10:
                Module module = (Module) obj;
                om1.a aVar3 = om1.a.f132968a;
                module.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named(o70.y.SLEEP_COACH.a());
                o3 o3Var = new o3(19);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                j0 j0Var = j0.f134944a;
                t0 t0Var = s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(r70.s.class), stringQualifierNamed, o3Var, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r70.r.class), stringQualifierNamed, new o3(20), kind, j0Var), module));
                return Unit.INSTANCE;
            case 11:
                Module module2 = (Module) obj;
                om1.b bVar4 = om1.b.f132970a;
                module2.getClass();
                StringQualifier stringQualifierNamed2 = QualifierKt.named(o70.o.SLEEP.a());
                o3 o3Var2 = new o3(21);
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                j0 j0Var2 = j0.f134944a;
                t0 t0Var2 = s0.f105811a;
                new KoinDefinition(module2, e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(r70.s.class), stringQualifierNamed2, o3Var2, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r70.r.class), stringQualifierNamed2, new o3(22), kind2, j0Var2), module2));
                StringQualifier stringQualifierNamed3 = QualifierKt.named(o70.t.Z.a());
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r70.s.class), stringQualifierNamed3, new o3(23), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r70.r.class), stringQualifierNamed3, new o3(24), kind2, j0Var2), module2));
                StringQualifier stringQualifierNamed4 = QualifierKt.named(o70.i.f130001i.a());
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r70.s.class), stringQualifierNamed4, new o3(25), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r70.r.class), stringQualifierNamed4, new o3(26), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(sm1.s.class), null, new o3(27), kind2, j0Var2), module2));
                return Unit.INSTANCE;
            case 12:
                Module module3 = (Module) obj;
                om1.d dVar3 = om1.d.f132973a;
                module3.getClass();
                o3 o3Var3 = new o3(28);
                ScopeRegistry.Companion companion3 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier3 = companion3.getRootScopeQualifier();
                Kind kind3 = Kind.Factory;
                j0 j0Var3 = j0.f134944a;
                t0 t0Var3 = s0.f105811a;
                new KoinDefinition(module3, e5.n(new BeanDefinition(rootScopeQualifier3, t0Var3.b(im1.a.class), null, o3Var3, kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(nm1.a.class), null, new o3(29), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(pm1.g.class), null, new om1.c(i14), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(pm1.a.class), null, new om1.c(z14 ? 1 : 0), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(ql1.b.class), null, new om1.c(2), kind3, j0Var3), module3));
                return Unit.INSTANCE;
            case 13:
                c63.s.c cVar = (c63.s.c) obj;
                cVar.getClass();
                c63.m.b.f25016a.getClass();
                cVar.N(c63.m.b.f25017b);
                return Unit.INSTANCE;
            case 14:
                c63.s.c cVar2 = (c63.s.c) obj;
                cVar2.getClass();
                b63.o.b.f16207a.getClass();
                cVar2.k(h0.a());
                cVar2.q("T");
                b63.v.b.f16220a.getClass();
                cVar2.s(l0.a());
                return Unit.INSTANCE;
            case 15:
                oi0.b bVar5 = (oi0.b) obj;
                bVar5.getClass();
                bVar5.b();
                return Unit.INSTANCE;
            case 16:
                or0.j.a aVar4 = or0.j.f133348g;
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 17:
                or0.j.a aVar5 = or0.j.f133348g;
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 18:
                String str = (String) obj;
                str.getClass();
                return new ir0.f(str, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, (String) null, (String) null, (List) null, 1022, (p005kotlin.jvm.internal.j) null);
            case 19:
                Number number = (Number) obj;
                int i17 = ot.j.f133606w;
                number.getClass();
                l3.f23124b.getClass();
                String str2 = l3.f23131i.format(number);
                str2.getClass();
                return str2;
            case 20:
                ((Boolean) obj).booleanValue();
                ot1.e eVar = ot1.e.f133785a;
                return Unit.INSTANCE;
            case 21:
                ot1.l lVar = ot1.l.f133804a;
                ((Unit) obj).getClass();
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj).intValue();
                ot1.l lVar2 = ot1.l.f133804a;
                return Unit.INSTANCE;
            case 23:
                lc.f0 f0Var = (lc.f0) obj;
                ot1.u uVar = ot1.u.f133824a;
                f0Var.getClass();
                ot1.u.f133824a.getClass();
                f0Var.f111765d = ot1.u.e("{trailId}", "{activityId}", "{activityDateMs}", "{reviewRating}", "{reviewId}");
                f0Var.f111766e = "android.intent.action.VIEW";
                return Unit.INSTANCE;
            case 24:
                ot1.u uVar2 = ot1.u.f133824a;
                ((Unit) obj).getClass();
                return Unit.INSTANCE;
            case 25:
                ot1.u uVar3 = ot1.u.f133824a;
                ((Unit) obj).getClass();
                return Unit.INSTANCE;
            case 26:
                lc.f0 f0Var2 = (lc.f0) obj;
                ot1.u uVar4 = ot1.u.f133824a;
                f0Var2.getClass();
                v0.T.getClass();
                f0Var2.f111765d = v0.a.b().b().concat("/modern/trails/{countryCode}/{province}/{trailName}");
                f0Var2.f111766e = "android.intent.action.VIEW";
                return Unit.INSTANCE;
            case 27:
                lc.f0 f0Var3 = (lc.f0) obj;
                ot1.u uVar5 = ot1.u.f133824a;
                f0Var3.getClass();
                v0.T.getClass();
                f0Var3.f111765d = v0.a.b().b().concat("/modern/trails/{countryCode}/{province}/{trailName}/");
                f0Var3.f111766e = "android.intent.action.VIEW";
                return Unit.INSTANCE;
            case 28:
                lc.f0 f0Var4 = (lc.f0) obj;
                ot1.u uVar6 = ot1.u.f133824a;
                f0Var4.getClass();
                v0.T.getClass();
                f0Var4.f111765d = v0.a.b().b().concat("/modern/trails/{countryCode}/{province}/{trailName}/{reviewId}");
                f0Var4.f111766e = "android.intent.action.VIEW";
                return Unit.INSTANCE;
            default:
                lc.f0 f0Var5 = (lc.f0) obj;
                ot1.u uVar7 = ot1.u.f133824a;
                f0Var5.getClass();
                v0.T.getClass();
                f0Var5.f111765d = v0.a.b().b().concat("/modern/trails/{countryCode}/{province}/{trailName}/{reviewId}/");
                f0Var5.f111766e = "android.intent.action.VIEW";
                return Unit.INSTANCE;
        }
    }
}
