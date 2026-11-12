package c2;

import ch.qos.logback.core.CoreConstants;
import i3.e5;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.TimeZones;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o3 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22805a;

    public /* synthetic */ o3(int i14) {
        this.f22805a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        int i14 = 28;
        int i15 = 27;
        int i16 = 26;
        char c14 = 1;
        byte b14 = 0;
        switch (this.f22805a) {
            case 0:
                return ((m3) obj).f22759e;
            case 1:
                return ((m3) obj).f22756b;
            case 2:
                return ((m3) obj).f22757c;
            case 3:
                return ((m3) obj).f22766l;
            case 4:
                return ((m3) obj).f22760f;
            case 5:
                Module module = (Module) obj;
                c20.a aVar = c20.a.f22965a;
                module.getClass();
                bb1.a aVar2 = new bb1.a(b14, i16);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                p13.j0 j0Var = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(z10.j.class), null, aVar2, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(z10.b0.class), null, new bb1.a(b14, i15), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(z10.p2.class), null, new bb1.a(b14, i14), kind, j0Var), module));
                return Unit.INSTANCE;
            case 6:
                ud.a aVar3 = (ud.a) obj;
                com.garmin.android.apps.connectmobile.onboarding.data.local.a.b bVar = com.garmin.android.apps.connectmobile.onboarding.data.local.a.f39662d;
                aVar3.getClass();
                ud.c cVarM0 = aVar3.M0("DELETE FROM device_onboarding_items");
                try {
                    cVarM0.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM0.close();
                }
            case 7:
                ud.a aVar4 = (ud.a) obj;
                com.garmin.android.apps.connectmobile.onboarding.data.local.b.C0713b c0713b = com.garmin.android.apps.connectmobile.onboarding.data.local.b.f39667d;
                aVar4.getClass();
                ud.c cVarM1 = aVar4.M0("DELETE FROM prompt_onboarding_items");
                try {
                    cVarM1.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM1.close();
                }
            case 8:
                oi0.b bVar2 = (oi0.b) obj;
                bVar2.getClass();
                bVar2.s();
                bVar2.B();
                return Unit.INSTANCE;
            case 9:
                lc.p0 p0Var = (lc.p0) obj;
                p0Var.getClass();
                c42.n.b bVar3 = c42.n.b.INSTANCE;
                bVar3.getClass();
                p0Var.f111836i = bVar3;
                p0Var.f111833f = false;
                lc.y0 y0VarI = kg.f.i(p0Var, -1);
                y0VarI.f111914a = true;
                Unit unit = Unit.INSTANCE;
                p0Var.f111833f = true;
                p0Var.f111834g = y0VarI.f111915b;
                return Unit.INSTANCE;
            case 10:
                p5.k0 k0Var = (p5.k0) obj;
                k0Var.getClass();
                p5.h0.g(k0Var);
                return Unit.INSTANCE;
            case 11:
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 12:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 13:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 14:
                x5.l0 l0Var = (x5.l0) obj;
                l0Var.getClass();
                return l0Var;
            case 15:
                c53.j jVar = (c53.j) obj;
                jVar.getClass();
                return jVar.iterator();
            case 16:
                Iterable iterable = (Iterable) obj;
                iterable.getClass();
                return iterable.iterator();
            case 17:
                return Boolean.valueOf(obj == null);
            case 18:
                c63.s.c cVar = (c63.s.c) obj;
                c63.m.b bVar4 = c63.m.b.f25016a;
                cVar.getClass();
                cVar.k(c63.h0.a());
                c63.t.a(cVar, new e23.l[]{new o3(24)}, new o3(25));
                cVar.e(c63.r0.ZERO);
                c63.t.b(cVar, CoreConstants.COLON_CHAR);
                cVar.m(c63.r0.ZERO);
                c63.t.b(cVar, CoreConstants.COLON_CHAR);
                cVar.n(c63.r0.ZERO);
                c63.t.c(cVar, "", new o3(i16));
                c63.t.a(cVar, new e23.l[]{new o3(i15)}, new o3(i14));
                return Unit.INSTANCE;
            case 19:
                c63.s.c cVar2 = (c63.s.c) obj;
                c63.m.b bVar5 = c63.m.b.f25016a;
                cVar2.getClass();
                cVar2.q("UT");
                return Unit.INSTANCE;
            case 20:
                c63.s.c cVar3 = (c63.s.c) obj;
                c63.m.b bVar6 = c63.m.b.f25016a;
                cVar3.getClass();
                cVar3.q("Z");
                return Unit.INSTANCE;
            case 21:
                c63.s.c cVar4 = (c63.s.c) obj;
                c63.m.b bVar7 = c63.m.b.f25016a;
                cVar4.getClass();
                c63.t.c(cVar4, TimeZones.GMT_ID, new o3(22));
                return Unit.INSTANCE;
            case 22:
                c63.s.c cVar5 = (c63.s.c) obj;
                c63.m.b bVar8 = c63.m.b.f25016a;
                cVar5.getClass();
                b63.a0.b.f16174a.getClass();
                cVar5.a((c63.d1) c63.f1.f24974c.getValue());
                return Unit.INSTANCE;
            case 23:
                c63.s.c cVar6 = (c63.s.c) obj;
                c63.m.b bVar9 = c63.m.b.f25016a;
                cVar6.getClass();
                c63.t.a(cVar6, new e23.l[]{new o3(29)}, new c63.n(b14));
                cVar6.h(c63.r0.NONE);
                c63.t.b(cVar6, ' ');
                c63.p0.f25038b.getClass();
                cVar6.t(c63.p0.f25039c);
                c63.t.b(cVar6, ' ');
                cVar6.o(c63.r0.ZERO);
                c63.t.b(cVar6, ' ');
                cVar6.e(c63.r0.ZERO);
                c63.t.b(cVar6, CoreConstants.COLON_CHAR);
                cVar6.m(c63.r0.ZERO);
                c63.t.c(cVar6, "", new c63.n(c14 == true ? 1 : 0));
                cVar6.q(StringUtils.SPACE);
                c63.t.a(cVar6, new e23.l[]{new o3(19), new o3(20)}, new o3(21));
                return Unit.INSTANCE;
            case 24:
                c63.s.c cVar7 = (c63.s.c) obj;
                c63.m.b bVar10 = c63.m.b.f25016a;
                cVar7.getClass();
                c63.t.b(cVar7, 't');
                return Unit.INSTANCE;
            case 25:
                c63.s.c cVar8 = (c63.s.c) obj;
                c63.m.b bVar11 = c63.m.b.f25016a;
                cVar8.getClass();
                c63.t.b(cVar8, 'T');
                return Unit.INSTANCE;
            case 26:
                c63.s.c cVar9 = (c63.s.c) obj;
                c63.m.b bVar12 = c63.m.b.f25016a;
                cVar9.getClass();
                c63.t.b(cVar9, '.');
                cVar9.b(1, 9);
                return Unit.INSTANCE;
            case 27:
                c63.s.c cVar10 = (c63.s.c) obj;
                c63.m.b bVar13 = c63.m.b.f25016a;
                cVar10.getClass();
                cVar10.g(c63.r0.ZERO);
                return Unit.INSTANCE;
            case 28:
                c63.s.c cVar11 = (c63.s.c) obj;
                c63.m.b bVar14 = c63.m.b.f25016a;
                cVar11.getClass();
                b63.a0.b.f16174a.getClass();
                cVar11.a((c63.d1) c63.f1.f24972a.getValue());
                return Unit.INSTANCE;
            default:
                c63.m.b bVar15 = c63.m.b.f25016a;
                ((c63.s.c) obj).getClass();
                return Unit.INSTANCE;
        }
    }
}
