package w40;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.widget.ProgressBar;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import e23.l;
import hf.m;
import i3.e5;
import lc.p0;
import lc.u0;
import o70.t;
import of2.c0;
import of2.z0;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.j0;
import p5.k0;
import r70.r;
import r70.s;
import uf2.l0;
import uf2.q0;
import uf2.u;
import uf2.y0;
import vf2.q;
import w5.e0;
import w52.k;
import w91.y;
import z51.h;
import zg2.i;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181931a;

    public /* synthetic */ d(g6.e eVar) {
        this.f181931a = 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = 13;
        int i15 = 12;
        int i16 = 11;
        int i17 = 10;
        int i18 = 2;
        int i19 = 1;
        int i24 = 0;
        int i25 = 9;
        int i26 = 8;
        switch (this.f181931a) {
            case 0:
                e.a aVar = e.f181932h;
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 1:
                e.a aVar2 = e.f181932h;
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 2:
                e.a aVar3 = e.f181932h;
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 3:
                e0.a aVar4 = (e0.a) obj;
                return "'" + aVar4.getF182091a() + "' " + aVar4.getF182090b();
            case 4:
                h hVar = (h) obj;
                hVar.getClass();
                return hVar.f202505a;
            case 5:
                Context context = (Context) obj;
                context.getClass();
                return new ProgressBar(context);
            case 6:
                w52.d dVar = (w52.d) obj;
                dVar.getClass();
                dVar.f182488a.f();
                return Unit.INSTANCE;
            case 7:
                Context context2 = (Context) obj;
                context2.getClass();
                return new zw1.g(context2, null, 0, 6, null);
            case 8:
                oi0.b bVar = (oi0.b) obj;
                w61.a aVar5 = w61.a.f183133a;
                bVar.getClass();
                bVar.V();
                return Unit.INSTANCE;
            case 9:
                oi0.b bVar2 = (oi0.b) obj;
                w61.a aVar6 = w61.a.f183133a;
                bVar2.getClass();
                bVar2.p();
                return Unit.INSTANCE;
            case 10:
                oi0.b bVar3 = (oi0.b) obj;
                com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                bVar3.getClass();
                bVar3.V();
                return Unit.INSTANCE;
            case 11:
                oi0.b bVar4 = (oi0.b) obj;
                com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a2 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                bVar4.getClass();
                bVar4.V();
                return Unit.INSTANCE;
            case 12:
                oi0.b bVar5 = (oi0.b) obj;
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar7 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                bVar5.getClass();
                bVar5.V();
                return Unit.INSTANCE;
            case 13:
                oi0.b bVar6 = (oi0.b) obj;
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar8 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                bVar6.getClass();
                bVar6.V();
                return Unit.INSTANCE;
            case 14:
                oi0.b bVar7 = (oi0.b) obj;
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar9 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                bVar7.getClass();
                bVar7.V();
                return Unit.INSTANCE;
            case 15:
                oi0.b bVar8 = (oi0.b) obj;
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar10 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                bVar8.getClass();
                bVar8.V();
                return Unit.INSTANCE;
            case 16:
                oi0.b bVar9 = (oi0.b) obj;
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar11 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                bVar9.getClass();
                bVar9.V();
                return Unit.INSTANCE;
            case 17:
                oi0.b bVar10 = (oi0.b) obj;
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar12 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                bVar10.getClass();
                bVar10.V();
                return Unit.INSTANCE;
            case 18:
                Module module = (Module) obj;
                w71.a aVar13 = w71.a.f183510a;
                module.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named(t.f130070m.a());
                k kVar = new k(i26);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                j0 j0Var = j0.f134944a;
                t0 t0Var = s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(s.class), stringQualifierNamed, kVar, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r.class), stringQualifierNamed, new k(i25), kind, j0Var), module));
                return Unit.INSTANCE;
            case 19:
                Module module2 = (Module) obj;
                w71.b bVar11 = w71.b.f183512a;
                module2.getClass();
                k kVar2 = new k(i17);
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                j0 j0Var2 = j0.f134944a;
                t0 t0Var2 = s0.f105811a;
                new KoinDefinition(module2, e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(u71.a.class), null, kVar2, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(u71.b.class), null, new k(i16), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(v71.a.class), null, new k(i15), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(v71.k.class), null, new k(i14), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(y71.b.class), null, new k(14), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(i81.a.class), null, new k(15), kind2, j0Var2), module2));
                return Unit.INSTANCE;
            case 20:
                p0 p0Var = (p0) obj;
                p0Var.getClass();
                p0.a(p0Var, y.f.INSTANCE);
                return Unit.INSTANCE;
            case 21:
                p0 p0Var2 = (p0) obj;
                p0Var2.getClass();
                p0.a(p0Var2, y.f.INSTANCE);
                return Unit.INSTANCE;
            case 22:
                p0 p0Var3 = (p0) obj;
                p0Var3.getClass();
                p0.a(p0Var3, y.f.INSTANCE);
                return Unit.INSTANCE;
            case 23:
                g3 g3Var = (g3) obj;
                t60.a aVar14 = we1.d.f184775p;
                g3Var.getClass();
                int i27 = we1.d.e.f184798a[g3Var.f35300a.ordinal()];
                if (i27 == 1) {
                    v60.a aVar15 = (v60.a) g3Var.f35301b;
                    return aVar15 == null ? new v60.a(false, null) : aVar15;
                }
                if (i27 != 2) {
                    return new v60.a(false, null);
                }
                i2.a aVar16 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                Exception exc = g3Var.f35303d;
                aVar16.getClass();
                i2.a.g(a2Var, "HermesCrossSellingItem", exc);
                return new v60.a(false, null);
            case 24:
                Drawable drawableA = j.a.a(((wf.f) obj).f184902a, 2131231969);
                if (drawableA != null) {
                    return m.b(drawableA);
                }
                v.e0.n("Invalid resource ID: 2131231969");
                return null;
            case 25:
                Module module3 = (Module) obj;
                module3.getClass();
                k kVar3 = new k(18);
                ScopeRegistry.Companion companion3 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier3 = companion3.getRootScopeQualifier();
                Kind kind3 = Kind.Singleton;
                j0 j0Var3 = j0.f134944a;
                t0 t0Var3 = s0.f105811a;
                SingleInstanceFactory<?> singleInstanceFactoryP = u0.p(new BeanDefinition(rootScopeQualifier3, t0Var3.b(uf2.s.class), null, kVar3, kind3, j0Var3), module3);
                if (module3.get_createdAtStart()) {
                    module3.prepareForCreationAtStart(singleInstanceFactoryP);
                }
                new KoinDefinition(module3, singleInstanceFactoryP);
                SingleInstanceFactory<?> singleInstanceFactoryP2 = u0.p(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(q.class), null, new k(19), kind3, j0Var3), module3);
                if (module3.get_createdAtStart()) {
                    module3.prepareForCreationAtStart(singleInstanceFactoryP2);
                }
                new KoinDefinition(module3, singleInstanceFactoryP2);
                return Unit.INSTANCE;
            case 26:
                Module module4 = (Module) obj;
                wf2.c cVar = wf2.c.f185026a;
                module4.getClass();
                wf2.b bVar12 = new wf2.b(i25);
                ScopeRegistry.Companion companion4 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier4 = companion4.getRootScopeQualifier();
                Kind kind4 = Kind.Singleton;
                j0 j0Var4 = j0.f134944a;
                t0 t0Var4 = s0.f105811a;
                SingleInstanceFactory<?> singleInstanceFactoryP3 = u0.p(new BeanDefinition(rootScopeQualifier4, t0Var4.b(mf2.c.class), null, bVar12, kind4, j0Var4), module4);
                if (module4.get_createdAtStart()) {
                    module4.prepareForCreationAtStart(singleInstanceFactoryP3);
                }
                new KoinDefinition(module4, singleInstanceFactoryP3);
                k kVar4 = new k(26);
                StringQualifier rootScopeQualifier5 = companion4.getRootScopeQualifier();
                Kind kind5 = Kind.Factory;
                new KoinDefinition(module4, e5.n(new BeanDefinition(rootScopeQualifier5, t0Var4.b(fg2.y.class), null, kVar4, kind5, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(i.class), null, new k(29), kind5, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(uf2.a.class), null, new wf2.b(i24), kind5, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(vf2.k.class), null, new wf2.b(i19), kind5, j0Var4), module4));
                SingleInstanceFactory<?> singleInstanceFactoryP4 = u0.p(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(y0.class), null, new wf2.b(i18), kind4, j0Var4), module4);
                if (module4.get_createdAtStart()) {
                    module4.prepareForCreationAtStart(singleInstanceFactoryP4);
                }
                new KoinDefinition(module4, singleInstanceFactoryP4);
                SingleInstanceFactory<?> singleInstanceFactoryP5 = u0.p(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(l0.class), null, new wf2.b(3), kind4, j0Var4), module4);
                if (module4.get_createdAtStart()) {
                    module4.prepareForCreationAtStart(singleInstanceFactoryP5);
                }
                new KoinDefinition(module4, singleInstanceFactoryP5);
                SingleInstanceFactory<?> singleInstanceFactoryP6 = u0.p(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(u.class), null, new wf2.b(4), kind4, j0Var4), module4);
                if (module4.get_createdAtStart()) {
                    module4.prepareForCreationAtStart(singleInstanceFactoryP6);
                }
                new KoinDefinition(module4, singleInstanceFactoryP6);
                SingleInstanceFactory<?> singleInstanceFactoryP7 = u0.p(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(q0.class), null, new wf2.b(5), kind4, j0Var4), module4);
                if (module4.get_createdAtStart()) {
                    module4.prepareForCreationAtStart(singleInstanceFactoryP7);
                }
                new KoinDefinition(module4, singleInstanceFactoryP7);
                SingleInstanceFactory<?> singleInstanceFactoryP8 = u0.p(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(c0.class), null, new wf2.b(6), kind4, j0Var4), module4);
                if (module4.get_createdAtStart()) {
                    module4.prepareForCreationAtStart(singleInstanceFactoryP8);
                }
                new KoinDefinition(module4, singleInstanceFactoryP8);
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(gg2.e.class), null, new wf2.b(i17), kind5, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(z0.class), null, new wf2.b(i16), kind5, j0Var4), module4));
                SingleInstanceFactory<?> singleInstanceFactoryP9 = u0.p(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(uf2.d.class), null, new wf2.b(i15), kind4, j0Var4), module4);
                if (module4.get_createdAtStart()) {
                    module4.prepareForCreationAtStart(singleInstanceFactoryP9);
                }
                new KoinDefinition(module4, singleInstanceFactoryP9);
                SingleInstanceFactory<?> singleInstanceFactoryP10 = u0.p(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(fg2.f.class), null, new wf2.b(i14), kind4, j0Var4), module4);
                if (module4.get_createdAtStart()) {
                    module4.prepareForCreationAtStart(singleInstanceFactoryP10);
                }
                new KoinDefinition(module4, singleInstanceFactoryP10);
                SingleInstanceFactory<?> singleInstanceFactoryP11 = u0.p(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(nf2.a.class), null, new k(20), kind4, j0Var4), module4);
                if (module4.get_createdAtStart()) {
                    module4.prepareForCreationAtStart(singleInstanceFactoryP11);
                }
                new KoinDefinition(module4, singleInstanceFactoryP11);
                SingleInstanceFactory<?> singleInstanceFactoryP12 = u0.p(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(dg2.a.class), null, new k(21), kind4, j0Var4), module4);
                if (module4.get_createdAtStart()) {
                    module4.prepareForCreationAtStart(singleInstanceFactoryP12);
                }
                new KoinDefinition(module4, singleInstanceFactoryP12);
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(fg2.b.class), null, new k(22), kind5, j0Var4), module4));
                SingleInstanceFactory<?> singleInstanceFactoryP13 = u0.p(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(bg2.i.class), null, new k(23), kind4, j0Var4), module4);
                if (module4.get_createdAtStart()) {
                    module4.prepareForCreationAtStart(singleInstanceFactoryP13);
                }
                new KoinDefinition(module4, singleInstanceFactoryP13);
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(com.garmin.android.livesessionview.a.class), null, new k(24), kind5, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(bh2.d.class), null, new k(25), kind5, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(bh2.c.class), null, new k(27), kind5, j0Var4), module4));
                new KoinDefinition(module4, e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(bh2.b.class), null, new k(28), kind5, j0Var4), module4));
                return Unit.INSTANCE;
            case 27:
                Module module5 = (Module) obj;
                wf2.c cVar2 = wf2.c.f185026a;
                module5.getClass();
                wf2.b bVar13 = new wf2.b(7);
                ScopeRegistry.Companion companion5 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier6 = companion5.getRootScopeQualifier();
                Kind kind6 = Kind.Singleton;
                j0 j0Var5 = j0.f134944a;
                t0 t0Var5 = s0.f105811a;
                SingleInstanceFactory<?> singleInstanceFactoryP14 = u0.p(new BeanDefinition(rootScopeQualifier6, t0Var5.b(uf2.s.class), null, bVar13, kind6, j0Var5), module5);
                if (module5.get_createdAtStart()) {
                    module5.prepareForCreationAtStart(singleInstanceFactoryP14);
                }
                new KoinDefinition(module5, singleInstanceFactoryP14);
                SingleInstanceFactory<?> singleInstanceFactoryP15 = u0.p(new BeanDefinition(companion5.getRootScopeQualifier(), t0Var5.b(q.class), null, new wf2.b(i26), kind6, j0Var5), module5);
                if (module5.get_createdAtStart()) {
                    module5.prepareForCreationAtStart(singleInstanceFactoryP15);
                }
                new KoinDefinition(module5, singleInstanceFactoryP15);
                return Unit.INSTANCE;
            case 28:
                Module module6 = (Module) obj;
                wf2.c cVar3 = wf2.c.f185026a;
                module6.getClass();
                wf2.c.f185026a.getClass();
                module6.includes(wf2.c.f185028c, wf2.c.f185027b);
                return Unit.INSTANCE;
            default:
                wi1.l lVar = (wi1.l) obj;
                Parcelable.Creator<UserSettingsDTO> creator = UserSettingsDTO.CREATOR;
                lVar.getClass();
                return lVar.b();
        }
    }

    public /* synthetic */ d(int i14) {
        this.f181931a = i14;
    }
}
