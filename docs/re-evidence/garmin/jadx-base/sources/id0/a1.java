package id0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.error.DefinitionParameterException;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92657a;

    public /* synthetic */ a1(int i14) {
        this.f92657a = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) throws DefinitionParameterException {
        switch (this.f92657a) {
            case 0:
                b1 b1Var = b1.f92669a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (vi0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, vi0.a.class, new c83.h.a[0], null, null, null, 120);
            case 1:
                Scope scope = (Scope) obj;
                b1 b1Var2 = b1.f92669a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                return new xi0.e((vi0.a) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(vi0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 2:
                Scope scope2 = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                b1 b1Var3 = b1.f92669a;
                scope2.getClass();
                parametersHolder.getClass();
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                return new hj0.a(ModuleExtKt.androidContext(scope2), (ui0.b) scope2.get((k23.d<?>) t0Var.b(ui0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (xi0.a) scope2.get((k23.d<?>) t0Var.b(xi0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope2.get((k23.d<?>) t0Var.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (yi0.c) parametersHolder.elementAt(0, t0Var.b(yi0.c.class)));
            case 3:
                Scope scope3 = (Scope) obj;
                c1 c1Var = c1.f92684a;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                return new pu.f(ModuleExtKt.androidContext(scope3));
            case 4:
                Scope scope4 = (Scope) obj;
                c1 c1Var2 = c1.f92684a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                return new pu.b(ModuleExtKt.androidContext(scope4), (pu.c) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pu.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 5:
                Scope scope5 = (Scope) obj;
                c1 c1Var3 = c1.f92684a;
                scope5.getClass();
                ((ParametersHolder) obj2).getClass();
                Context contextAndroidContext = ModuleExtKt.androidContext(scope5);
                f12.l.f68084a.getClass();
                return new pu.i(contextAndroidContext, f12.l.a.a());
            case 6:
                Scope scope6 = (Scope) obj;
                c1 c1Var4 = c1.f92684a;
                scope6.getClass();
                ((ParametersHolder) obj2).getClass();
                return Boolean.valueOf(((f12.b) Scope.get$default(scope6, p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a) null, 6, (Object) null)).f());
            case 7:
                d1 d1Var = d1.f92701a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new kd0.p2();
            case 8:
                d1 d1Var2 = d1.f92701a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new kd0.p2();
            case 9:
                Scope scope7 = (Scope) obj;
                e1 e1Var = e1.f92714a;
                scope7.getClass();
                ((ParametersHolder) obj2).getClass();
                try {
                    Object objNewInstance = Class.forName("ae1.a").getConstructor(Context.class).newInstance(scope7.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
                    objNewInstance.getClass();
                    return (c22.c2) objNewInstance;
                } catch (Exception e4) {
                    com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
                    aVar.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.o(com.garmin.android.apps.connectmobile.a2.GENERAL, "Failed to inject GoogleDynamicDeliveryOnDemandResources, fallback to NullOnDemanResources: " + e4);
                    return new c22.a2();
                }
            case 10:
                f1 f1Var = f1.f92726a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new kd0.v2();
            case 11:
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                f1 f1Var2 = f1.f92726a;
                ((Scope) obj).getClass();
                parametersHolder2.getClass();
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                Object orNull = parametersHolder2.getOrNull(t0Var2.b(Long.class));
                if (orNull != null) {
                    return new in2.f(((Number) orNull).longValue());
                }
                throw new DefinitionParameterException(i3.e5.i(t0Var2, Long.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
            case 12:
                f1 f1Var3 = f1.f92726a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new dr2.a();
            case 13:
                Scope scope8 = (Scope) obj;
                f1 f1Var4 = f1.f92726a;
                scope8.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                return new ar2.b((androidx.lifecycle.j1) scope8.get((k23.d<?>) t0Var3.b(androidx.lifecycle.j1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (dr2.a) scope8.get((k23.d<?>) t0Var3.b(dr2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 14:
                Scope scope9 = (Scope) obj;
                f1 f1Var5 = f1.f92726a;
                scope9.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                return new ar2.e((androidx.lifecycle.j1) scope9.get((k23.d<?>) t0Var4.b(androidx.lifecycle.j1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (dr2.a) scope9.get((k23.d<?>) t0Var4.b(dr2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 15:
                Scope scope10 = (Scope) obj;
                f1 f1Var6 = f1.f92726a;
                scope10.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                return new ar2.g((androidx.lifecycle.j1) scope10.get((k23.d<?>) t0Var5.b(androidx.lifecycle.j1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (dr2.a) scope10.get((k23.d<?>) t0Var5.b(dr2.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 16:
                g1 g1Var = g1.f92761a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new kd0.w2();
            case 17:
                h1 h1Var = h1.f92777a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new kd0.x2();
            case 18:
                Scope scope11 = (Scope) obj;
                h1 h1Var2 = h1.f92777a;
                scope11.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                return new jd0.o((co.h) scope11.get((k23.d<?>) t0Var6.b(co.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ao.d) scope11.get((k23.d<?>) t0Var6.b(ao.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 19:
                Scope scope12 = (Scope) obj;
                h1 h1Var3 = h1.f92777a;
                scope12.getClass();
                ((ParametersHolder) obj2).getClass();
                return new ok0.g((kk0.b) scope12.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(kk0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 20:
                i1 i1Var = i1.f92790a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new kd0.s2();
            case 21:
                j1 j1Var = j1.f92803a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new kd0.y2();
            case 22:
                l1 l1Var = l1.f92831a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new m1();
            case 23:
                n1 n1Var = n1.f92854a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new kd0.d3();
            case 24:
                o1 o1Var = o1.f92868a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new kd0.f3();
            case 25:
                p1 p1Var = p1.f92881a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new kd0.j3();
            case 26:
                q1 q1Var = q1.f92891a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new kd0.k3();
            case 27:
                s1 s1Var = s1.f92917a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new kd0.l3();
            case 28:
                s1 s1Var2 = s1.f92917a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new ro0.x(pc0.j.a.a(pc0.j.f137223i));
            default:
                s1 s1Var3 = s1.f92917a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new ro0.q();
        }
    }
}
