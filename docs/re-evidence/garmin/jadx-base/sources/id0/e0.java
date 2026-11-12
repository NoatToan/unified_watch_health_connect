package id0;

import android.content.Context;
import com.garmin.feature.garminpay.devicedrivensocket.NativeDeviceDrivenSocketApi;
import n70.g7;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92713a;

    public /* synthetic */ e0(int i14) {
        this.f92713a = i14;
    }

    private final Object a(Object obj) {
        Module module = (Module) obj;
        k1 k1Var = k1.f92818a;
        module.getClass();
        cm0.a.f27958a.getClass();
        module.includes(cm0.a.f27959b);
        return Unit.INSTANCE;
    }

    private final Object b(Object obj) {
        Module module = (Module) obj;
        l1 l1Var = l1.f92831a;
        module.getClass();
        a1 a1Var = new a1(22);
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(im0.a.class), null, a1Var, Kind.Factory, p13.j0.f134944a), module));
        return Unit.INSTANCE;
    }

    private final Object c(Object obj) {
        Module module = (Module) obj;
        n1 n1Var = n1.f92854a;
        module.getClass();
        a1 a1Var = new a1(23);
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(jm0.b.class), null, a1Var, Kind.Factory, p13.j0.f134944a), module));
        return Unit.INSTANCE;
    }

    private final Object d(Object obj) {
        Module module = (Module) obj;
        o1 o1Var = o1.f92868a;
        module.getClass();
        a1 a1Var = new a1(24);
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(bn0.d.class), null, a1Var, Kind.Factory, p13.j0.f134944a), module));
        return Unit.INSTANCE;
    }

    private final Object e(Object obj) {
        Module module = (Module) obj;
        p1 p1Var = p1.f92881a;
        module.getClass();
        a1 a1Var = new a1(25);
        new KoinDefinition(module, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(mn0.p.class), null, a1Var, Kind.Factory, p13.j0.f134944a), module));
        ln0.c.f113647a.getClass();
        module.includes(ln0.c.f113648b);
        return Unit.INSTANCE;
    }

    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        final int i14 = 9;
        final int i15 = 15;
        final int i16 = 14;
        final int i17 = 13;
        final int i18 = 12;
        final int i19 = 11;
        final int i24 = 10;
        final int i25 = 16;
        final int i26 = 19;
        final int i27 = 18;
        final int i28 = 17;
        final int i29 = 20;
        final int i30 = 21;
        final int i34 = 26;
        switch (this.f92713a) {
            case 0:
                Module module = (Module) obj;
                g0 g0Var = g0.f92759a;
                module.getClass();
                n nVar = new n(28);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                p13.j0 j0Var = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module, i3.e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(ij2.a.class), null, nVar, kind, j0Var), module));
                new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(hj2.b.class), null, new n(29), kind, j0Var), module));
                final int i35 = 0;
                new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(hj2.a.class), null, new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i35) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var2.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var2.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var2.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var2 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var3 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var5 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var3.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var3.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var3.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var2 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var4.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var4.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var4.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var3 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var4 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var5.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var5.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var6.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var6.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var6.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var3 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var4 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var7.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var7.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var7.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var7.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var7.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var8.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var8.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var9.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var9.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var9 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var10 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var10.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var10.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var10.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var10.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var10.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var11 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var12 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var11.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var11.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var11.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                }, kind, j0Var), module));
                final int i36 = 1;
                new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(hj2.e.class), null, new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i36) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var2.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var2.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var2.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var2 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var3 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var5 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var3.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var3.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var3.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var2 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var4.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var4.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var4.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var3 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var4 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var5.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var5.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var6.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var6.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var6.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var3 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var4 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var7.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var7.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var7.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var7.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var7.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var8.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var8.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var9.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var9.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var9 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var10 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var10.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var10.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var10.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var10.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var10.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var11 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var12 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var11.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var11.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var11.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                }, kind, j0Var), module));
                final int i37 = 2;
                new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(dj2.a.class), null, new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i37) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var2.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var2.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var2.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var2 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var3 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var5 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var3.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var3.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var3.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var2 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var4.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var4.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var4.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var3 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var4 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var5.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var5.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var6.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var6.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var6.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var3 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var4 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var7.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var7.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var7.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var7.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var7.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var8.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var8.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var9.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var9.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var9 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var10 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var10.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var10.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var10.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var10.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var10.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var11 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var12 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var11.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var11.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var11.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                }, kind, j0Var), module));
                final int i38 = 3;
                new KoinDefinition(module, i3.e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(nj2.a.class), null, new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i38) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var2.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var2.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var2.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var2 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var3 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var5 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var3.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var3.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var3.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var2 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var4.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var4.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var4.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var3 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var4 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var5.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var5.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var6.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var6.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var6.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var3 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var4 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var7.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var7.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var7.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var7.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var7.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var8.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var8.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var9.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var9.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var9 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var10 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var10.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var10.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var10.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var10.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var10.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var11 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var12 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var11.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var11.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var11.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                }, kind, j0Var), module));
                return Unit.INSTANCE;
            case 1:
                Module module2 = (Module) obj;
                h0 h0Var = h0.f92775a;
                module2.getClass();
                final int i39 = 4;
                e23.p pVar = new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i39) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var2.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var2.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var2.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var2 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var3 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var5 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var6 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var3.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var3.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var3.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var2 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var4.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var4.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var4.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var3 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var4 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var5.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var5.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var6.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var6.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var6.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var3 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var4 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var7.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var7.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var7.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var7.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var7.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var8.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var8.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var9.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var9.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var9 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var10 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var10.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var10.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var10.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var10.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var10.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var11 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var12 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var11.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var11.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var11.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                };
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                p13.j0 j0Var2 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module2, i3.e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(x60.a.class), null, pVar, kind2, j0Var2), module2));
                final int i44 = 5;
                new KoinDefinition(module2, i3.e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(y60.a.class), null, new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i44) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var3.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var3.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var3.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var2 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var3 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var5 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var6 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var4.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var4.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var4.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var3 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var5.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var5.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var5.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var4 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var5 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var6.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var6.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var7.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var7.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var7.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var3 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var4 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var8.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var8.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var8.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var8.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var9.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var9.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var10.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var10.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var9 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var10 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var11.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var11.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var11.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var11.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var11.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var11 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var12 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var12.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var12.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var12.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                }, kind2, j0Var2), module2));
                final int i45 = 6;
                new KoinDefinition(module2, i3.e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(zf0.d.class), null, new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i45) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var3.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var3.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var3.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var2 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var3 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var5 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var6 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var4.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var4.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var4.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var3 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var5.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var5.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var5.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var4 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var5 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var6.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var6.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var7.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var7.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var7.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var3 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var4 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var8.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var8.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var8.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var8.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var9.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var9.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var10.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var10.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var9 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var10 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var11.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var11.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var11.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var11.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var11.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var11 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var12 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var12.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var12.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var12.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                }, kind2, j0Var2), module2));
                final int i46 = 7;
                new KoinDefinition(module2, i3.e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(ax1.i.class), null, new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i46) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var3.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var3.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var3.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var2 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var3 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var5 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var6 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var4.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var4.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var4.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var3 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var5.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var5.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var5.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var4 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var5 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var6.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var6.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var7.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var7.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var7.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var3 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var4 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var8.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var8.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var8.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var8.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var9.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var9.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var10.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var10.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var9 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var10 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var11.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var11.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var11.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var11.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var11.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var11 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var12 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var12.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var12.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var12.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                }, kind2, j0Var2), module2));
                final int i47 = 8;
                new KoinDefinition(module2, i3.e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(c70.i.class), null, new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i47) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var3.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var3.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var3.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var2 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var3 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var5 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var6 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var4.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var4.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var4.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var3 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var5.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var5.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var5.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var4 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var5 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var6.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var6.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var7.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var7.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var7.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var3 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var4 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var8.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var8.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var8.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var8.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var9.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var9.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var10.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var10.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var9 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var10 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var11.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var11.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var11.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var11.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var11.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var11 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var12 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var12.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var12.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var12.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                }, kind2, j0Var2), module2));
                return Unit.INSTANCE;
            case 2:
                Module module3 = (Module) obj;
                i0 i0Var = i0.f92788a;
                module3.getClass();
                m70.e.f117065a.getClass();
                Module module4 = m70.e.f117066b;
                j0.f92801a.getClass();
                Module module5 = j0.f92802b;
                k0.f92816a.getClass();
                Module module6 = k0.f92817b;
                m70.l.f117076a.getClass();
                Module module7 = m70.l.f117077b;
                m70.p.f117084a.getClass();
                Module module8 = m70.p.f117085b;
                h31.a.f81290a.getClass();
                Module module9 = h31.a.f81291b;
                m70.o.f117082a.getClass();
                Module module10 = m70.o.f117083b;
                m70.i.f117071a.getClass();
                Module module11 = m70.i.f117072b;
                fn.e.f72142a.getClass();
                Module module12 = fn.e.f72143b;
                m70.m.f117078a.getClass();
                Module module13 = m70.m.f117079b;
                m70.j.f117073a.getClass();
                Module module14 = m70.j.f117074b;
                m70.h.f117069a.getClass();
                Module module15 = m70.h.f117070b;
                m70.n.f117080a.getClass();
                Module module16 = m70.n.f117081b;
                st0.a.f160843a.getClass();
                Module module17 = st0.a.f160844b;
                il.a.f93936a.getClass();
                Module module18 = il.a.f93937b;
                m70.a.f117060a.getClass();
                Module module19 = m70.a.f117061b;
                tl0.a.f165270a.getClass();
                Module module20 = tl0.a.f165271b;
                fn.c.f72138a.getClass();
                Module module21 = fn.c.f72139b;
                mw.a.f121241a.getClass();
                Module module22 = mw.a.f121242b;
                ex.a.f66909a.getClass();
                Module module23 = ex.a.f66910b;
                py.a.f141871a.getClass();
                Module module24 = py.a.f141872b;
                ef2.a.f63969a.getClass();
                Module module25 = ef2.a.f63970b;
                l60.a.f110526a.getClass();
                Module module26 = l60.a.f110527b;
                w71.a.f183510a.getClass();
                Module module27 = w71.a.f183511b;
                if0.a.f93177a.getClass();
                Module module28 = if0.a.f93178b;
                fh0.a.f71578a.getClass();
                Module module29 = fh0.a.f71579b;
                vh0.a.f178404a.getClass();
                Module module30 = vh0.a.f178405b;
                ui0.a.f171176a.getClass();
                Module module31 = ui0.a.f171177b;
                eo0.a.f64782a.getClass();
                Module module32 = eo0.a.f64783b;
                m81.a.f117163a.getClass();
                Module module33 = m81.a.f117164b;
                lp0.a.f114124a.getClass();
                Module module34 = lp0.a.f114125b;
                f41.a.f68858a.getClass();
                Module module35 = f41.a.f68859b;
                kr0.a.f106223a.getClass();
                Module module36 = kr0.a.f106224b;
                ts0.a.f166190a.getClass();
                Module module37 = ts0.a.f166191b;
                sv0.a.f161025a.getClass();
                Module module38 = sv0.a.f161026b;
                o01.b.f128484a.getClass();
                Module module39 = o01.b.f128485b;
                ec1.a.f63788a.getClass();
                Module module40 = ec1.a.f63789b;
                ce1.a.f26890a.getClass();
                Module module41 = ce1.a.f26891b;
                gf1.a.f77073a.getClass();
                Module module42 = gf1.a.f77074b;
                se1.a.f158744a.getClass();
                Module module43 = se1.a.f158745b;
                om1.b.f132970a.getClass();
                Module module44 = om1.b.f132971b;
                lq1.b.f114333a.getClass();
                Module module45 = lq1.b.f114334b;
                mr1.a.f120350a.getClass();
                Module module46 = mr1.a.f120351b;
                c71.a.f25251a.getClass();
                Module module47 = c71.a.f25252b;
                nu1.c.f127918a.getClass();
                Module module48 = nu1.c.f127919b;
                h71.a.f82332a.getClass();
                Module module49 = h71.a.f82333b;
                qz1.b.f148630a.getClass();
                Module module50 = qz1.b.f148631b;
                n32.b.f123533a.getClass();
                Module module51 = n32.b.f123534b;
                n42.a.f123612a.getClass();
                Module module52 = n42.a.f123613b;
                fn.h.f72147a.getClass();
                Module module53 = fn.h.f72148b;
                zw0.b.f207203a.getClass();
                Module module54 = zw0.b.f207204b;
                n52.a.f123783a.getClass();
                Module module55 = n52.a.f123784b;
                oy1.a.f134419a.getClass();
                Module module56 = oy1.a.f134420b;
                as0.a.f12677a.getClass();
                Module module57 = as0.a.f12678b;
                om1.a.f132968a.getClass();
                Module module58 = om1.a.f132969b;
                z60.a.f202752a.getClass();
                Module module59 = z60.a.f202753b;
                dp0.b.f60636a.getClass();
                Module module60 = dp0.b.f60637b;
                dp0.a.f60634a.getClass();
                Module module61 = dp0.a.f60635b;
                pg0.a.f137594a.getClass();
                Module module62 = pg0.a.f137595b;
                fn.g.f72145a.getClass();
                Module module63 = fn.g.f72146b;
                e91.a.f63486a.getClass();
                Module module64 = e91.a.f63487b;
                ln0.a.f113644a.getClass();
                Module module65 = ln0.a.f113645b;
                c20.a.f22965a.getClass();
                Module module66 = c20.a.f22966b;
                t51.b.f162548a.getClass();
                Module module67 = t51.b.f162549b;
                t51.a.f162546a.getClass();
                Module module68 = t51.a.f162547b;
                m70.g.f117067a.getClass();
                module3.includes(module4, module5, module6, module7, module8, module9, module10, module11, module12, module13, module14, module15, module16, module17, module18, module19, module20, module21, module22, module23, module24, module25, module26, module27, module28, module29, module30, module31, module32, module33, module34, module35, module36, module37, module38, module39, module40, module41, module42, module43, module44, module45, module46, module47, module48, module49, module50, module51, module52, module53, module54, module55, module56, module57, module58, module59, module60, module61, module62, module63, module64, module65, module66, module67, module68, m70.g.f117068b);
                return Unit.INSTANCE;
            case 3:
                Module module69 = (Module) obj;
                j0 j0Var3 = j0.f92801a;
                module69.getClass();
                e23.p pVar2 = new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i14) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var3.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var3.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var3.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var2 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var3 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var5 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var6 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var4.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var4.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var4.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var4 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var5.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var5.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var5.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var5 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var6 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var6.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var6.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var7.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var7.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var7.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var3 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var4 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var8.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var8.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var8.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var8.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var9.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var9.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var10.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var10.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var9 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var10 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var11.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var11.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var11.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var11.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var11.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var11 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var12 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var12.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var12.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var12.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                };
                ScopeRegistry.Companion companion3 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier3 = companion3.getRootScopeQualifier();
                Kind kind3 = Kind.Factory;
                p13.j0 j0Var4 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module69, i3.e5.n(new BeanDefinition(rootScopeQualifier3, t0Var3.b(n70.g.class), null, pVar2, kind3, j0Var4), module69));
                new KoinDefinition(module69, i3.e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(ae0.f.class), null, new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i24) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var4.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var4.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var4.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var2 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var3 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var5 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var6 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var5.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var5.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var5.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var5 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var6.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var6.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var6.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var6 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var7 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var7.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var7.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var8.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var8.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var3 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var4 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var9.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var9.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var9.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var9.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var9.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var10.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var10.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var11.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var11.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var9 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var10 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var12.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var12.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var12.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var12.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var12.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var11 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var12 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var13.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var13.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var13.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                }, kind3, j0Var4), module69));
                new KoinDefinition(module69, i3.e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(he0.a.class), null, new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i19) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var4.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var4.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var4.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var2 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var3 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var5 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var6 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var5.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var5.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var5.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var5 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var6.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var6.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var6.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var6 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var7 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var7.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var7.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var8.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var8.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var3 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var4 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var9.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var9.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var9.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var9.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var9.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var10.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var10.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var11.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var11.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var9 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var10 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var12.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var12.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var12.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var12.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var12.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var11 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var12 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var13.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var13.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var13.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                }, kind3, j0Var4), module69));
                return Unit.INSTANCE;
            case 4:
                Module module70 = (Module) obj;
                k0 k0Var = k0.f92816a;
                module70.getClass();
                e23.p pVar3 = new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i18) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var4.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var4.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var4.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var2 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var3 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var5 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var6 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var5.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var5.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var5.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var5 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var6.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var6.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var6.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var6 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var7 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var7.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var7.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var4 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var8.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var8.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var3 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var4 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var9.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var9.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var9.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var9.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var9.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var10.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var10.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var11.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var11.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var9 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var10 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var12.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var12.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var12.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var12.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var12.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var11 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var12 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var13.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var13.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var13.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                };
                ScopeRegistry.Companion companion4 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier4 = companion4.getRootScopeQualifier();
                Kind kind4 = Kind.Factory;
                p13.j0 j0Var5 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module70, i3.e5.n(new BeanDefinition(rootScopeQualifier4, t0Var4.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), null, pVar3, kind4, j0Var5), module70));
                new KoinDefinition(module70, i3.e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(w70.g.class), null, new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i17) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var5.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var5.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var5.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var2 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var3 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var5 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var6 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var6.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var6.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var6.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var6 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var7.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var7.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var7.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var7 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var8 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var8.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var8.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var4 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var9.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var9.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var9.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var3 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var4 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var10.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var10.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var10.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var10.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var10.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var11.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var11.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var12.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var12.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var9 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var10 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var13.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var13.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var13.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var13.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var13.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var11 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var12 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var14 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var14.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var14.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var14.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                }, kind4, j0Var5), module70));
                new KoinDefinition(module70, i3.e5.n(new BeanDefinition(companion4.getRootScopeQualifier(), t0Var4.b(u70.i.class), null, new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i16) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var5.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var5.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var5.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var2 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var3 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var5 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var6 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var6.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var6.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var6.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var6 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var7.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var7.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var7.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var7 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var8 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var8.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var8.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var4 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var9.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var9.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var9.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var3 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var4 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var10.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var10.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var10.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var10.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var10.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var11.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var11.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var12.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var12.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var9 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var10 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var13.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var13.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var13.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var13.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var13.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var11 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var12 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var14 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var14.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var14.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var14.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                }, kind4, j0Var5), module70));
                return Unit.INSTANCE;
            case 5:
                Module module71 = (Module) obj;
                l0 l0Var = l0.f92829a;
                module71.getClass();
                e23.p pVar4 = new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i15) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var5.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var5.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var5.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var2 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var3 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var5 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var6 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var6.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var6.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var6.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var6 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var7.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var7.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var7.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var7 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var8 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var8.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var8.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var4 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var9.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var9.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var9.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var2 = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var3 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var4 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var10.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var10.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var10.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var10.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var10.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var11.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var11.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var12.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var12.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var9 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var10 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var13.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var13.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var13.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var13.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var13.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var11 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var12 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var14 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var14.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var14.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var14.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                };
                SingleInstanceFactory<?> singleInstanceFactoryP = lc.u0.p(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(e80.a.class), null, pVar4, Kind.Singleton, p13.j0.f134944a), module71);
                if (module71.get_createdAtStart()) {
                    module71.prepareForCreationAtStart(singleInstanceFactoryP);
                }
                new KoinDefinition(module71, singleInstanceFactoryP);
                return Unit.INSTANCE;
            case 6:
                Module module72 = (Module) obj;
                m0 m0Var = m0.f92842a;
                module72.getClass();
                e23.p pVar5 = new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i25) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var5.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var5.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var5.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var2 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var3 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var5 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var6 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var6.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var6.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var6.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var6 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var7.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var7.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var7.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var7 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var8 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var8.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var8.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var4 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var9.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var9.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var9.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var2 = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var3 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var3 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var4 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var10.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var10.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var10.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var10.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var10.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var11.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var11.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var12.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var12.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var9 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var10 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var13.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var13.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var13.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var13.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var13.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var11 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var12 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var14 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var14.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var14.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var14.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                };
                ScopeRegistry.Companion companion5 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier5 = companion5.getRootScopeQualifier();
                Kind kind5 = Kind.Factory;
                p13.j0 j0Var6 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module72, i3.e5.n(new BeanDefinition(rootScopeQualifier5, t0Var5.b(g80.c.class), null, pVar5, kind5, j0Var6), module72));
                new KoinDefinition(module72, i3.e5.n(new BeanDefinition(companion5.getRootScopeQualifier(), t0Var5.b(m72.i.class), null, new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i28) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var6.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var6.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var6.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var2 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var3 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var5 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var6 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var7.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var7.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var7.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var7 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var8.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var8.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var8.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var8 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var9 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var9.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var9.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var4 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var10.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var10.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var10.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var2 = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var3 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var3 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var4 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var11.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var11.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var11.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var11.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var11.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var12.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var12.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var13.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var13.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var9 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var10 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var14 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var14.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var14.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var14.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var14.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var14.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var11 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var12 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var15 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var15.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var15.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var15.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                }, kind5, j0Var6), module72));
                return Unit.INSTANCE;
            case 7:
                Module module73 = (Module) obj;
                o0 o0Var = o0.f92866a;
                module73.getClass();
                final int i48 = 28;
                e23.p pVar6 = new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i48) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var6.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var6.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var6.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var2 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var3 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var5 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var6 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var7.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var7.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var7.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var7 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var8.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var8.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var8.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var8 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var9 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var9.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var9.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var4 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var10.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var10.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var10.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var2 = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var3 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var3 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var4 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var11.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var11.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var11.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var11.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var11.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var12.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var12.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var13.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var13.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var9 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var10 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var11 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var14 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var14.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var14.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var14.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var14.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var14.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var12 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var13 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var15 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var15.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var15.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var15.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                };
                ScopeRegistry.Companion companion6 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier6 = companion6.getRootScopeQualifier();
                Kind kind6 = Kind.Factory;
                p13.j0 j0Var7 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module73, i3.e5.n(new BeanDefinition(rootScopeQualifier6, t0Var6.b(zb0.d0.class), null, pVar6, kind6, j0Var7), module73));
                new KoinDefinition(module73, i3.e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(l80.a.class), null, new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i29) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var7.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var7.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var7.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var2 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var3 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var5 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var6 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var8.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var8.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var8.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var8 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var9.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var9.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var9.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var9 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var10 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var10.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var10.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var4 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var11.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var11.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var11.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var2 = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var3 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var3 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var4 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var12.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var12.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var12.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var12.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var12.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var13.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var13.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var14 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var14.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var14.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var9 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var10 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var11 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var15 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var15.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var15.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var15.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var15.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var15.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var12 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var13 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var16 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var16.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var16.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var16.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                }, kind6, j0Var7), module73));
                final int i49 = 29;
                new KoinDefinition(module73, i3.e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(ic0.a.class), null, new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i49) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var7.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var7.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var7.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var2 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var3 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var5 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var6 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var8.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var8.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var8.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var8 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var9.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var9.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var9.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var9 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var10 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var10.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var10.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var4 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var11.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var11.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var11.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var2 = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var3 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var3 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var4 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var12.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var12.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var12.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var12.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var12.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var13.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var13.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var14 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var14.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var14.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var9 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var10 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var11 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var15 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var15.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var15.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var15.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var15.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var15.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var12 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var13 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var16 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var16.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var16.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var16.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                }, kind6, j0Var7), module73));
                final int i54 = 0;
                new KoinDefinition(module73, i3.e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(pc0.i.class), null, new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i54) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var7.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var7.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var8.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var8.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var8.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var9 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var10.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var10.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var10.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var11.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var11.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                }, kind6, j0Var7), module73));
                final int i55 = 1;
                new KoinDefinition(module73, i3.e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(pc0.j.class), null, new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i55) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var7.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var7.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var8.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var8.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var8.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var9 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var10.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var10.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var10.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var11.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var11.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                }, kind6, j0Var7), module73));
                final int i56 = 2;
                e23.p pVar7 = new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i56) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var7.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var7.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var8.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var8.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var8.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var9 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var10.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var10.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var10.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var11.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var11.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                };
                StringQualifier rootScopeQualifier7 = companion6.getRootScopeQualifier();
                Kind kind7 = Kind.Singleton;
                SingleInstanceFactory<?> singleInstanceFactoryP2 = lc.u0.p(new BeanDefinition(rootScopeQualifier7, t0Var6.b(ic0.b.class), null, pVar7, kind7, j0Var7), module73);
                if (module73.get_createdAtStart()) {
                    module73.prepareForCreationAtStart(singleInstanceFactoryP2);
                }
                new KoinDefinition(module73, singleInstanceFactoryP2);
                final int i57 = 3;
                SingleInstanceFactory<?> singleInstanceFactoryP3 = lc.u0.p(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(bc0.b.class), null, new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i57) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var7.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var7.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var8.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var8.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var8.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var9 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var10.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var10.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var10.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var11.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var11.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                }, kind7, j0Var7), module73);
                if (module73.get_createdAtStart()) {
                    module73.prepareForCreationAtStart(singleInstanceFactoryP3);
                }
                new KoinDefinition(module73, singleInstanceFactoryP3);
                final int i58 = 4;
                SingleInstanceFactory<?> singleInstanceFactoryP4 = lc.u0.p(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(cc0.b.class), null, new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i58) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var7.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var7.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var8.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var8.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var8.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var9 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var10.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var10.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var10.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var11.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var11.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                }, kind7, j0Var7), module73);
                if (module73.get_createdAtStart()) {
                    module73.prepareForCreationAtStart(singleInstanceFactoryP4);
                }
                new KoinDefinition(module73, singleInstanceFactoryP4);
                final int i59 = 5;
                SingleInstanceFactory<?> singleInstanceFactoryP5 = lc.u0.p(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(zb0.e.class), null, new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i59) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var7.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var7.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var8.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var8.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var8.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var9 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var10.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var10.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var10.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var11.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var11.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                }, kind7, j0Var7), module73);
                if (module73.get_createdAtStart()) {
                    module73.prepareForCreationAtStart(singleInstanceFactoryP5);
                }
                new KoinDefinition(module73, singleInstanceFactoryP5);
                final int i64 = 6;
                new KoinDefinition(module73, i3.e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(wn1.k0.class), null, new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i64) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var7.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var7.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var8.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var8.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var8.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var9 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var10.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var10.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var10.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var11.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var11.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                }, kind6, j0Var7), module73));
                final int i65 = 7;
                new KoinDefinition(module73, i3.e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(wn1.j0.class), null, new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i65) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var7.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var7.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var8.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var8.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var8.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var9 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var10.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var10.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var10.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var11.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var11.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                }, kind6, j0Var7), module73));
                final int i66 = 8;
                new KoinDefinition(module73, i3.e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(lc0.f.class), null, new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i66) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var7.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var7.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var8.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var8.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var8.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var9 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var10.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var10.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var10.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var11.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var11.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                }, kind6, j0Var7), module73));
                new KoinDefinition(module73, i3.e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(lc0.k.class), null, new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i14) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var7.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var7.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var8.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var8.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var8.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var9 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var10.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var10.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var10.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var11.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var11.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                }, kind6, j0Var7), module73));
                new KoinDefinition(module73, i3.e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(lc0.d.class), null, new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i24) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var7.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var7.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var8.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var8.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var8.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var9 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var10.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var10.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var10.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var11.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var11.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                }, kind6, j0Var7), module73));
                new KoinDefinition(module73, i3.e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(lc0.a.class), null, new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i19) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var7.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var7.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var8.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var8.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var8.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var9 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var10.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var10.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var10.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var11.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var11.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                }, kind6, j0Var7), module73));
                new KoinDefinition(module73, i3.e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(lc0.g.class), null, new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i18) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var7.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var7.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var8.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var8.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var8.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var9 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var10.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var10.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var10.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var11.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var11.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                }, kind6, j0Var7), module73));
                new KoinDefinition(module73, i3.e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(lc0.i.class), null, new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i17) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var7.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var7.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var8.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var8.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var8.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var9 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var10.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var10.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var10.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var11.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var11.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                }, kind6, j0Var7), module73));
                new KoinDefinition(module73, i3.e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(lc0.h.class), null, new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i16) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var7.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var7.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var8.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var8.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var8.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var9 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var10.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var10.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var10.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var11.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var11.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                }, kind6, j0Var7), module73));
                new KoinDefinition(module73, i3.e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(zd0.b0.class), null, new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i27) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var7.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var7.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var7.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var2 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var3 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var5 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var6 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var8.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var8.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var8.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var8 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var9.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var9.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var9.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var9 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var10 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var10.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var10.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var4 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var11.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var11.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var11.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var2 = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var3 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var3 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var4 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var12.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var12.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var12.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var12.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var12.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var13.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var13.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var14 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var14.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var14.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var9 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var10 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var11 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var15 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var15.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var15.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var15.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var15.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var15.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var12 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var13 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var16 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var16.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var16.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var16.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                }, kind6, j0Var7), module73));
                new KoinDefinition(module73, i3.e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(zd0.c0.class), null, new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i26) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var7.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var7.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var7.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var2 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var3 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var5 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var6 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var8.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var8.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var8.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var8 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var9.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var9.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var9.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var9 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var10 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var10.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var10.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var4 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var11.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var11.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var11.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var2 = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var3 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var3 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var4 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var12.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var12.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var12.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var12.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var12.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var13.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var13.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var14 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var14.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var14.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var9 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var10 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var11 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var15 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var15.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var15.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var15.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var15.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var15.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var12 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var13 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var16 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var16.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var16.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var16.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                }, kind6, j0Var7), module73));
                new KoinDefinition(module73, i3.e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(zd0.o.class), null, new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i30) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var7.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var7.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var7.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var2 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var3 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var5 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var6 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var8.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var8.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var8.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var8 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var9.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var9.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var9.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var9 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var10 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var10.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var10.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var4 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var11.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var11.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var11.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var2 = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var3 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var3 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var4 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var12.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var12.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var12.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var12.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var12.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var13.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var13.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var14 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var14.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var14.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var9 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var10 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var11 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var15 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var15.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var15.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var15.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var15.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var15.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var12 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var13 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var16 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var16.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var16.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var16.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                }, kind6, j0Var7), module73));
                final int i67 = 22;
                new KoinDefinition(module73, i3.e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(pk1.f.class), null, new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i67) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var7.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var7.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var7.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var2 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var3 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var5 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var6 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var8.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var8.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var8.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var8 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var9.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var9.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var9.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var9 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var10 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var10.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var10.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var4 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var11.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var11.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var11.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var2 = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var3 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var3 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var4 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var12.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var12.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var12.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var12.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var12.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var13.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var13.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var14 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var14.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var14.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var9 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var10 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var11 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var15 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var15.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var15.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var15.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var15.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var15.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var12 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var13 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var16 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var16.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var16.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var16.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                }, kind6, j0Var7), module73));
                final int i68 = 23;
                new KoinDefinition(module73, i3.e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(zd0.n.class), null, new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i68) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var7.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var7.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var7.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var2 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var3 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var5 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var6 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var8.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var8.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var8.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var8 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var9.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var9.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var9.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var9 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var10 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var10.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var10.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var4 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var11.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var11.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var11.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var2 = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var3 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var3 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var4 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var12.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var12.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var12.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var12.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var12.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var13.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var13.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var14 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var14.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var14.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var9 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var10 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var11 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var15 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var15.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var15.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var15.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var15.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var15.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var12 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var13 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var16 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var16.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var16.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var16.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                }, kind6, j0Var7), module73));
                final int i69 = 24;
                new KoinDefinition(module73, i3.e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(zd0.k.class), null, new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i69) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var7.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var7.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var7.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var2 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var3 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var5 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var6 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var8.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var8.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var8.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var8 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var9.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var9.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var9.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var9 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var10 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var10.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var10.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var4 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var11.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var11.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var11.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var2 = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var3 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var3 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var4 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var12.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var12.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var12.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var12.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var12.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var13.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var13.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var14 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var14.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var14.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var9 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var10 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var11 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var15 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var15.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var15.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var15.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var15.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var15.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var12 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var13 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var16 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var16.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var16.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var16.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                }, kind6, j0Var7), module73));
                final int i74 = 25;
                new KoinDefinition(module73, i3.e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(zd0.x.class), null, new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i74) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var7.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var7.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var7.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var2 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var3 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var5 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var6 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var8.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var8.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var8.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var8 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var9.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var9.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var9.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var9 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var10 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var10.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var10.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var4 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var11.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var11.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var11.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var2 = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var3 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var3 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var4 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var12.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var12.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var12.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var12.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var12.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var13.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var13.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var14 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var14.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var14.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var9 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var10 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var11 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var15 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var15.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var15.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var15.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var15.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var15.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var12 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var13 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var16 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var16.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var16.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var16.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                }, kind6, j0Var7), module73));
                final int i75 = 26;
                new KoinDefinition(module73, i3.e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(bv.e.class), null, new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i75) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var7.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var7.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var7.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var2 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var3 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var5 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var6 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var8.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var8.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var8.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var8 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var9.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var9.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var9.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var9 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var10 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var10.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var10.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var4 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var11.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var11.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var11.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var2 = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var3 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var3 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var4 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var12.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var12.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var12.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var12.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var12.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var13.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var13.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var14 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var14.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var14.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var9 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var10 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var11 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var15 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var15.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var15.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var15.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var15.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var15.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var12 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var13 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var16 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var16.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var16.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var16.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                }, kind6, j0Var7), module73));
                final int i76 = 27;
                new KoinDefinition(module73, i3.e5.n(new BeanDefinition(companion6.getRootScopeQualifier(), t0Var6.b(zc0.c.class), null, new e23.p() { // from class: id0.f0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i76) {
                            case 0:
                                g0 g0Var2 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.a) ge1.b.W(t13.h.f161748a, new hj2.k(null));
                            case 1:
                                g0 g0Var3 = g0.f92759a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                hj2.n.f84043a.getClass();
                                return (hj2.e) ge1.b.W(t13.h.f161748a, new hj2.m(null));
                            case 2:
                                Scope scope = (Scope) obj2;
                                g0 g0Var4 = g0.f92759a;
                                scope.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new dj2.a((hj2.b) scope.get((k23.d<?>) t0Var7.b(hj2.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.a) scope.get((k23.d<?>) t0Var7.b(hj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hj2.e) scope.get((k23.d<?>) t0Var7.b(hj2.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 3:
                                Scope scope2 = (Scope) obj2;
                                g0 g0Var5 = g0.f92759a;
                                scope2.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new nj2.a((dj2.a) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(dj2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                h0 h0Var2 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return (x60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, x60.a.class, new c83.h.a[0], null, null, null, 88);
                            case 5:
                                Scope scope3 = (Scope) obj2;
                                h0 h0Var3 = h0.f92775a;
                                scope3.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new y60.d((x60.a) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(x60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 6:
                                h0 h0Var4 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return zf0.d.a.a(zf0.d.f204343b);
                            case 7:
                                h0 h0Var5 = h0.f92775a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return ax1.i.a.a(ax1.i.f13633b);
                            case 8:
                                Scope scope4 = (Scope) obj2;
                                h0 h0Var6 = h0.f92775a;
                                scope4.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new c70.i((y60.a) scope4.get((k23.d<?>) t0Var8.b(y60.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zf0.d) scope4.get((k23.d<?>) t0Var8.b(zf0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ax1.i) scope4.get((k23.d<?>) t0Var8.b(ax1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 9:
                                Scope scope5 = (Scope) obj2;
                                j0 j0Var8 = j0.f92801a;
                                scope5.getClass();
                                ((ParametersHolder) obj3).getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new kd0.x0(contextAndroidContext, (uu0.a) Scope.get$default(scope5, t0Var9.b(uu0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (l80.a) Scope.get$default(scope5, t0Var9.b(l80.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (pc0.n0) Scope.get$default(scope5, t0Var9.b(pc0.n0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 10:
                                j0 j0Var9 = j0.f92801a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.r3();
                            case 11:
                                Scope scope6 = (Scope) obj2;
                                j0 j0Var10 = j0.f92801a;
                                scope6.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.w0((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
                            case 12:
                                Scope scope7 = (Scope) obj2;
                                k0 k0Var2 = k0.f92816a;
                                scope7.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.t0((f12.l) scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 13:
                                Scope scope8 = (Scope) obj2;
                                k0 k0Var3 = k0.f92816a;
                                scope8.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new w70.g((l70.c) scope8.get((k23.d<?>) t0Var10.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.a0) scope8.get((k23.d<?>) t0Var10.b(zd0.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                Scope scope9 = (Scope) obj2;
                                k0 k0Var4 = k0.f92816a;
                                scope9.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new u70.i((f12.l) scope9.get((k23.d<?>) t0Var11.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l70.c) scope9.get((k23.d<?>) t0Var11.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g7) scope9.get((k23.d<?>) t0Var11.b(g7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                l0 l0Var2 = l0.f92829a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new e80.b();
                            case 16:
                                m0 m0Var2 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.f1();
                            case 17:
                                m0 m0Var3 = m0.f92842a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new md0.d();
                            case 18:
                                Scope scope10 = (Scope) obj2;
                                o0 o0Var2 = o0.f92866a;
                                scope10.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.b0((kg1.a) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 19:
                                Scope scope11 = (Scope) obj2;
                                o0 o0Var3 = o0.f92866a;
                                scope11.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.c0((kg1.a) scope11.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 20:
                                o0 o0Var4 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.l1((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null));
                            case 21:
                                Scope scope12 = (Scope) obj2;
                                o0 o0Var5 = o0.f92866a;
                                scope12.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.o((pc0.j) scope12.get((k23.d<?>) t0Var12.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope12.get((k23.d<?>) t0Var12.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope12.get((k23.d<?>) t0Var12.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.b0) scope12.get((k23.d<?>) t0Var12.b(zd0.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope12.get((k23.d<?>) t0Var12.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 22:
                                Scope scope13 = (Scope) obj2;
                                o0 o0Var6 = o0.f92866a;
                                scope13.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new pk1.f((pk1.n) scope13.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pk1.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 23:
                                Scope scope14 = (Scope) obj2;
                                o0 o0Var7 = o0.f92866a;
                                scope14.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.n((pc0.j) scope14.get((k23.d<?>) t0Var13.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kg1.a) scope14.get((k23.d<?>) t0Var13.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 24:
                                Scope scope15 = (Scope) obj2;
                                o0 o0Var8 = o0.f92866a;
                                scope15.getClass();
                                ((ParametersHolder) obj3).getClass();
                                p005kotlin.jvm.internal.t0 t0Var14 = p005kotlin.jvm.internal.s0.f105811a;
                                return new zd0.k((l80.b) scope15.get((k23.d<?>) t0Var14.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.i) scope15.get((k23.d<?>) t0Var14.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 25:
                                Scope scope16 = (Scope) obj2;
                                o0 o0Var9 = o0.f92866a;
                                scope16.getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new zd0.x((zd0.i) scope16.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(zd0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                o0 o0Var10 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.y1();
                            case 27:
                                Scope scope17 = (Scope) obj2;
                                ParametersHolder parametersHolder = (ParametersHolder) obj3;
                                o0 o0Var11 = o0.f92866a;
                                scope17.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var15 = p005kotlin.jvm.internal.s0.f105811a;
                                String str = (String) parametersHolder.elementAt(0, t0Var15.b(String.class));
                                String str2 = (String) parametersHolder.elementAt(1, t0Var15.b(String.class));
                                String str3 = (String) parametersHolder.elementAt(2, t0Var15.b(String.class));
                                o90.a aVar = (o90.a) parametersHolder.elementAt(3, t0Var15.b(o90.a.class));
                                zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
                                if (u0Var == null) {
                                    u0Var = zb0.u0.f203733h;
                                }
                                return new zc0.c(new aa0.e(u0Var, str3, str2, aVar == null ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, new k22.b(ModuleExtKt.androidContext(scope17)), (y80.b0) scope17.get((k23.d<?>) t0Var15.b(y80.b0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
                            case 28:
                                o0 o0Var12 = o0.f92866a;
                                ((Scope) obj2).getClass();
                                ((ParametersHolder) obj3).getClass();
                                return new kd0.p1();
                            default:
                                Scope scope18 = (Scope) obj2;
                                ParametersHolder parametersHolder2 = (ParametersHolder) obj3;
                                o0 o0Var13 = o0.f92866a;
                                scope18.getClass();
                                parametersHolder2.getClass();
                                p005kotlin.jvm.internal.t0 t0Var16 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ic0.c((o53.b0) parametersHolder2.elementAt(0, t0Var16.b(o53.b0.class)), (bc0.b) scope18.get((k23.d<?>) t0Var16.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (lc0.h) scope18.get((k23.d<?>) t0Var16.b(lc0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, null, 24, null);
                        }
                    }
                }, kind6, j0Var7), module73));
                return Unit.INSTANCE;
            case 8:
                Module module74 = (Module) obj;
                p0 p0Var = p0.f92879a;
                module74.getClass();
                e23.p pVar8 = new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i15) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var7.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var7.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var8.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var8.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var8.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var2 = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var9 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var10.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var10.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var10.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var11.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var11.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                };
                new KoinDefinition(module74, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(c22.o0.class), null, pVar8, Kind.Factory, p13.j0.f134944a), module74));
                return Unit.INSTANCE;
            case 9:
                Module module75 = (Module) obj;
                r0 r0Var = r0.f92902a;
                module75.getClass();
                e23.p pVar9 = new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i25) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var7.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var7.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var8.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var8.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var8.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var2 = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var2 = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var9 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var10.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var10.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var10.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var11.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var11.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                };
                new KoinDefinition(module75, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(oe0.g.class), null, pVar9, Kind.Factory, p13.j0.f134944a), module75));
                return Unit.INSTANCE;
            case 10:
                Module module76 = (Module) obj;
                s0 s0Var = s0.f92915a;
                module76.getClass();
                e23.p pVar10 = new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i28) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var7 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var7.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var7.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var8.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var8.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var8.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var8.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var2 = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var2 = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var2 = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var9 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var10.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var10.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var10.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var11.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var11.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                };
                new KoinDefinition(module76, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(jf0.a.class), null, pVar10, Kind.Factory, p13.j0.f134944a), module76));
                if0.b.f93179a.getClass();
                module76.includes(if0.b.f93180b);
                return Unit.INSTANCE;
            case 11:
                Module module77 = (Module) obj;
                t0 t0Var7 = t0.f92929a;
                module77.getClass();
                e23.p pVar11 = new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i27) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var8.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var8.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var9.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var9.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var9.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var9.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var2 = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var2 = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var2 = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var10 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var11.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var11.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var11.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var12.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var12.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                };
                new KoinDefinition(module77, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(zf0.c.class), null, pVar11, Kind.Factory, p13.j0.f134944a), module77));
                return Unit.INSTANCE;
            case 12:
                Module module78 = (Module) obj;
                u0 u0Var = u0.f92940a;
                module78.getClass();
                e23.p pVar12 = new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i26) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var8.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var8.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var9.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var9.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var9.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var9.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var2 = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var2 = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var2 = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var10 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var2 = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var11.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var11.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var11.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var12.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var12.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                };
                new KoinDefinition(module78, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(ve0.b.class), null, pVar12, Kind.Factory, p13.j0.f134944a), module78));
                return Unit.INSTANCE;
            case 13:
                Module module79 = (Module) obj;
                y0 y0Var = y0.f92992a;
                module79.getClass();
                e23.p pVar13 = new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i29) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var8.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var8.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var9.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var9.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var9.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var9.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var2 = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var2 = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var2 = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var10 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var2 = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var2 = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var11.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var11.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var11.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var12.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var12.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                };
                new KoinDefinition(module79, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(gh0.a.class), null, pVar13, Kind.Factory, p13.j0.f134944a), module79));
                fh0.c.f71581a.getClass();
                module79.includes(fh0.c.f71582b);
                return Unit.INSTANCE;
            case 14:
                Module module80 = (Module) obj;
                z0 z0Var = z0.f93004a;
                module80.getClass();
                e23.p pVar14 = new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i30) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var8.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var8.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var9.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var9.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var9.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var9.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var2 = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var2 = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var2 = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var10 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var2 = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var2 = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var11.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var11.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var11.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var12.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var12.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var9 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                };
                ScopeRegistry.Companion companion7 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier8 = companion7.getRootScopeQualifier();
                Kind kind8 = Kind.Factory;
                p13.j0 j0Var8 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var8 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module80, i3.e5.n(new BeanDefinition(rootScopeQualifier8, t0Var8.b(pz0.d.class), null, pVar14, kind8, j0Var8), module80));
                final int i77 = 22;
                new KoinDefinition(module80, i3.e5.n(new BeanDefinition(companion7.getRootScopeQualifier(), t0Var8.b(ei0.c.class), null, new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i77) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var9.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var9.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var10.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var10.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var10.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var10.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var2 = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var2 = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var2 = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var11 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var2 = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var2 = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var12.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var12.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var12.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var13.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var13.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var9 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                }, kind8, j0Var8), module80));
                final int i78 = 23;
                new KoinDefinition(module80, i3.e5.n(new BeanDefinition(companion7.getRootScopeQualifier(), t0Var8.b(ei0.w0.class), null, new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i78) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var9.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var9.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var10.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var10.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var10.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var10.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var2 = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var2 = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var2 = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var11 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var2 = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var2 = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var12.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var12.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var12.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var13.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var13.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var9 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                }, kind8, j0Var8), module80));
                final int i79 = 24;
                new KoinDefinition(module80, i3.e5.n(new BeanDefinition(companion7.getRootScopeQualifier(), t0Var8.b(mj1.a.class), null, new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i79) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var9.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var9.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var10.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var10.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var10.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var10.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var2 = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var2 = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var2 = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var11 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var2 = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var2 = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var12.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var12.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var12.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var13.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var13.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var9 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                }, kind8, j0Var8), module80));
                final int i84 = 25;
                new KoinDefinition(module80, i3.e5.n(new BeanDefinition(companion7.getRootScopeQualifier(), t0Var8.b(ei0.d.class), null, new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i84) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var9.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var9.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var10.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var10.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var10.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var10.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var2 = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var2 = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var2 = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var11 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var2 = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var2 = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var12.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var12.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var12.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var13.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var13.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var9 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                }, kind8, j0Var8), module80));
                new KoinDefinition(module80, i3.e5.n(new BeanDefinition(companion7.getRootScopeQualifier(), t0Var8.b(ei0.x0.class), null, new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i34) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var9.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var9.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var10.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var10.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var10.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var10.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var2 = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var2 = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var2 = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var11 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var2 = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var2 = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var12.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var12.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var12.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var13.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var13.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var9 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                }, kind8, j0Var8), module80));
                final int i85 = 27;
                new KoinDefinition(module80, i3.e5.n(new BeanDefinition(companion7.getRootScopeQualifier(), t0Var8.b(li0.q0.class), null, new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i85) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var9.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var9.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var10.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var10.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var10.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var10.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var2 = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var2 = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var2 = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var11 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var2 = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var2 = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var12.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var12.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var12.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var13.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var13.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var9 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                }, kind8, j0Var8), module80));
                final int i86 = 28;
                new KoinDefinition(module80, i3.e5.n(new BeanDefinition(companion7.getRootScopeQualifier(), t0Var8.b(gi0.a.class), null, new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i86) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var9.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var9.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var10.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var10.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var10.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var10.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var2 = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var2 = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var2 = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var11 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var2 = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var2 = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var12.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var12.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var12.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var13.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var13.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var9 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                }, kind8, j0Var8), module80));
                return Unit.INSTANCE;
            case 15:
                Module module81 = (Module) obj;
                b1 b1Var = b1.f92669a;
                module81.getClass();
                final int i87 = 29;
                e23.p pVar15 = new e23.p() { // from class: id0.n0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Scope scope = (Scope) obj2;
                        ParametersHolder parametersHolder = (ParametersHolder) obj3;
                        switch (i87) {
                            case 0:
                                o0 o0Var2 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new pc0.m0((f12.l) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 1:
                                o0 o0Var3 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return pc0.j.a.a(pc0.j.f137223i);
                            case 2:
                                o0 o0Var4 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new ic0.f(null, 1, null);
                            case 3:
                                o0 o0Var5 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new bc0.c((com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 4:
                                o0 o0Var6 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new cc0.b();
                            case 5:
                                o0 o0Var7 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                zb0.d dVarM = zb0.d.M();
                                dVarM.getClass();
                                return dVarM;
                            case 6:
                                o0 o0Var8 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.u5();
                            case 7:
                                o0 o0Var9 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.t5();
                            case 8:
                                o0 o0Var10 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.f(ModuleExtKt.androidContext(scope));
                            case 9:
                                o0 o0Var11 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.k((l80.a) scope.get((k23.d<?>) t0Var9.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bc0.b) scope.get((k23.d<?>) t0Var9.b(bc0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
                            case 10:
                                o0 o0Var12 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.d((c22.k) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 11:
                                o0 o0Var13 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                lm2.i iVarF = lm2.h.f();
                                lm2.g gVarC = lm2.h.c();
                                lm2.f fVarE = lm2.h.e();
                                rd2.j jVar = rd2.f.a().f152045a;
                                jVar.getClass();
                                return new lc0.a(iVarF, gVarC, fVarE, jVar, (lc0.d) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(lc0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 12:
                                o0 o0Var14 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                da2.b bVar = da2.d.c(ModuleExtKt.androidContext(scope)).f58886a.f111646e;
                                bVar.getClass();
                                return new lc0.g(bVar);
                            case 13:
                                o0 o0Var15 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                                return new lc0.i(contextAndroidContext, (f12.l) scope.get((k23.d<?>) t0Var10.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.n0) scope.get((k23.d<?>) t0Var10.b(pc0.n0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((k23.d<?>) t0Var10.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (m80.a) scope.get((k23.d<?>) t0Var10.b(m80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 14:
                                o0 o0Var16 = o0.f92866a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new lc0.h((kg1.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 15:
                                p0 p0Var2 = p0.f92879a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new q0();
                            case 16:
                                r0 r0Var2 = r0.f92902a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new jd0.m();
                            case 17:
                                s0 s0Var2 = s0.f92915a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.c2();
                            case 18:
                                t0 t0Var11 = t0.f92929a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.h2();
                            case 19:
                                u0 u0Var2 = u0.f92940a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new v0();
                            case 20:
                                y0 y0Var2 = y0.f92992a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.i2();
                            case 21:
                                z0 z0Var2 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (pz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pz0.d.class, new c83.h.a[0], null, null, null, 120);
                            case 22:
                                z0 z0Var3 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.c.class, new c83.h.a[0], null, null, null, 120);
                            case 23:
                                z0 z0Var4 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (ei0.w0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ei0.w0.class, new c83.h.a[0], null, null, null, 120);
                            case 24:
                                z0 z0Var5 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return (mj1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, mj1.a.class, new c83.h.a[0], null, null, null, 120);
                            case 25:
                                z0 z0Var6 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.e((ei0.c) scope.get((k23.d<?>) t0Var12.b(ei0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ei0.w0) scope.get((k23.d<?>) t0Var12.b(ei0.w0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pz0.d) scope.get((k23.d<?>) t0Var12.b(pz0.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 26:
                                z0 z0Var7 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                                return new ei0.x0((eo1.a) scope.get((k23.d<?>) t0Var13.b(eo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mj1.a) scope.get((k23.d<?>) t0Var13.b(mj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                            case 27:
                                z0 z0Var8 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new gi0.b();
                            case 28:
                                z0 z0Var9 = z0.f93004a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.j2();
                            default:
                                b1 b1Var2 = b1.f92669a;
                                scope.getClass();
                                parametersHolder.getClass();
                                return new kd0.o2();
                        }
                    }
                };
                ScopeRegistry.Companion companion8 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier9 = companion8.getRootScopeQualifier();
                Kind kind9 = Kind.Factory;
                p13.j0 j0Var9 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var9 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module81, i3.e5.n(new BeanDefinition(rootScopeQualifier9, t0Var9.b(ui0.b.class), null, pVar15, kind9, j0Var9), module81));
                new KoinDefinition(module81, i3.e5.n(new BeanDefinition(companion8.getRootScopeQualifier(), t0Var9.b(vi0.a.class), null, new a1(0), kind9, j0Var9), module81));
                new KoinDefinition(module81, i3.e5.n(new BeanDefinition(companion8.getRootScopeQualifier(), t0Var9.b(xi0.a.class), null, new a1(1), kind9, j0Var9), module81));
                new KoinDefinition(module81, i3.e5.n(new BeanDefinition(companion8.getRootScopeQualifier(), t0Var9.b(hj0.a.class), null, new a1(2), kind9, j0Var9), module81));
                return Unit.INSTANCE;
            case 16:
                Module module82 = (Module) obj;
                c1 c1Var = c1.f92684a;
                module82.getClass();
                a1 a1Var = new a1(3);
                ScopeRegistry.Companion companion9 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier10 = companion9.getRootScopeQualifier();
                Kind kind10 = Kind.Factory;
                p13.j0 j0Var10 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var10 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module82, i3.e5.n(new BeanDefinition(rootScopeQualifier10, t0Var10.b(pu.c.class), null, a1Var, kind10, j0Var10), module82));
                new KoinDefinition(module82, i3.e5.n(new BeanDefinition(companion9.getRootScopeQualifier(), t0Var10.b(pu.a.class), null, new a1(4), kind10, j0Var10), module82));
                new KoinDefinition(module82, i3.e5.n(new BeanDefinition(companion9.getRootScopeQualifier(), t0Var10.b(pu.h.class), null, new a1(5), kind10, j0Var10), module82));
                new KoinDefinition(module82, i3.e5.n(new BeanDefinition(companion9.getRootScopeQualifier(), t0Var10.b(Boolean.class), QualifierKt.named("IsChinaEnvironment"), new a1(6), kind10, j0Var10), module82));
                return Unit.INSTANCE;
            case 17:
                Module module83 = (Module) obj;
                d1 d1Var = d1.f92701a;
                module83.getClass();
                a1 a1Var2 = new a1(7);
                ScopeRegistry.Companion companion10 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier11 = companion10.getRootScopeQualifier();
                Kind kind11 = Kind.Factory;
                p13.j0 j0Var11 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var11 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module83, i3.e5.n(new BeanDefinition(rootScopeQualifier11, t0Var11.b(ak0.a.class), null, a1Var2, kind11, j0Var11), module83));
                new KoinDefinition(module83, i3.e5.n(new BeanDefinition(companion10.getRootScopeQualifier(), t0Var11.b(zd0.d0.class), null, new a1(8), kind11, j0Var11), module83));
                return Unit.INSTANCE;
            case 18:
                Module module84 = (Module) obj;
                e1 e1Var = e1.f92714a;
                module84.getClass();
                a1 a1Var3 = new a1(i14);
                SingleInstanceFactory<?> singleInstanceFactoryP6 = lc.u0.p(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(c22.c2.class), null, a1Var3, Kind.Singleton, p13.j0.f134944a), module84);
                if (module84.get_createdAtStart()) {
                    module84.prepareForCreationAtStart(singleInstanceFactoryP6);
                }
                new KoinDefinition(module84, singleInstanceFactoryP6);
                return Unit.INSTANCE;
            case 19:
                Module module85 = (Module) obj;
                f1 f1Var = f1.f92726a;
                module85.getClass();
                a1 a1Var4 = new a1(i24);
                ScopeRegistry.Companion companion11 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier12 = companion11.getRootScopeQualifier();
                Kind kind12 = Kind.Factory;
                p13.j0 j0Var12 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var12 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module85, i3.e5.n(new BeanDefinition(rootScopeQualifier12, t0Var12.b(hn2.a.class), null, a1Var4, kind12, j0Var12), module85));
                NativeDeviceDrivenSocketApi.f50945a.getClass();
                NativeDeviceDrivenSocketApi.f50946b.invoke(module85);
                new KoinDefinition(module85, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var12.b(in2.f.class), null, new a1(i19), kind12, j0Var12), module85));
                new KoinDefinition(module85, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var12.b(dr2.a.class), null, new a1(i18), kind12, j0Var12), module85));
                new KoinDefinition(module85, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var12.b(ar2.b.class), null, new a1(i17), kind12, j0Var12), module85));
                new KoinDefinition(module85, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var12.b(ar2.e.class), null, new a1(i16), kind12, j0Var12), module85));
                new KoinDefinition(module85, i3.e5.n(new BeanDefinition(companion11.getRootScopeQualifier(), t0Var12.b(ar2.g.class), null, new a1(i15), kind12, j0Var12), module85));
                return Unit.INSTANCE;
            case 20:
                Module module86 = (Module) obj;
                g1 g1Var = g1.f92761a;
                module86.getClass();
                a1 a1Var5 = new a1(i25);
                new KoinDefinition(module86, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(gk0.d.class), null, a1Var5, Kind.Factory, p13.j0.f134944a), module86));
                return Unit.INSTANCE;
            case 21:
                Module module87 = (Module) obj;
                h1 h1Var = h1.f92777a;
                module87.getClass();
                a1 a1Var6 = new a1(i28);
                ScopeRegistry.Companion companion12 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier13 = companion12.getRootScopeQualifier();
                Kind kind13 = Kind.Factory;
                p13.j0 j0Var13 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var13 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module87, i3.e5.n(new BeanDefinition(rootScopeQualifier13, t0Var13.b(mk0.e.class), null, a1Var6, kind13, j0Var13), module87));
                new KoinDefinition(module87, i3.e5.n(new BeanDefinition(companion12.getRootScopeQualifier(), t0Var13.b(mk0.h.class), null, new a1(i27), kind13, j0Var13), module87));
                new KoinDefinition(module87, i3.e5.n(new BeanDefinition(companion12.getRootScopeQualifier(), t0Var13.b(ok0.g.class), null, new a1(i26), kind13, j0Var13), module87));
                return Unit.INSTANCE;
            case 22:
                Module module88 = (Module) obj;
                i1 i1Var = i1.f92790a;
                module88.getClass();
                a1 a1Var7 = new a1(i29);
                new KoinDefinition(module88, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(l80.b.class), null, a1Var7, Kind.Factory, p13.j0.f134944a), module88));
                return Unit.INSTANCE;
            case 23:
                Module module89 = (Module) obj;
                j1 j1Var = j1.f92803a;
                module89.getClass();
                a1 a1Var8 = new a1(i30);
                new KoinDefinition(module89, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(cl0.b.class), null, a1Var8, Kind.Factory, p13.j0.f134944a), module89));
                return Unit.INSTANCE;
            case 24:
                return a(obj);
            case 25:
                return b(obj);
            case 26:
                return c(obj);
            case 27:
                return d(obj);
            case 28:
                return e(obj);
            default:
                Module module90 = (Module) obj;
                q1 q1Var = q1.f92891a;
                module90.getClass();
                a1 a1Var9 = new a1(i34);
                new KoinDefinition(module90, i3.e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), p005kotlin.jvm.internal.s0.f105811a.b(fo0.a.class), null, a1Var9, Kind.Factory, p13.j0.f134944a), module90));
                eo0.b.f64784a.getClass();
                module90.includes(eo0.b.f64785b);
                return Unit.INSTANCE;
        }
    }
}
