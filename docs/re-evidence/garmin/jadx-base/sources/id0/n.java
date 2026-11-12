package id0;

import android.content.Context;
import okhttp3.OkHttpClient;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.scope.Scope;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92852a;

    public /* synthetic */ n(int i14) {
        this.f92852a = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f92852a) {
            case 0:
                Scope scope = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                o oVar = o.f92864a;
                scope.getClass();
                parametersHolder.getClass();
                long jLongValue = ((Number) parametersHolder.elementAt(0, p005kotlin.jvm.internal.s0.f105811a.b(Long.class))).longValue();
                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                tv.s sVarB = tv.s.b(ModuleExtKt.androidContext(scope), jLongValue);
                sVarB.getClass();
                return new rd0.a(contextAndroidContext, jLongValue, sVarB);
            case 1:
                Scope scope2 = (Scope) obj;
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                o oVar2 = o.f92864a;
                scope2.getClass();
                parametersHolder2.getClass();
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                return new nd0.c((f12.l) scope2.get((k23.d<?>) t0Var.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), zv.d.a(ModuleExtKt.androidContext(scope2), ((Number) parametersHolder2.elementAt(0, t0Var.b(Long.class))).longValue()));
            case 2:
                o oVar3 = o.f92864a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new nd0.b(pc0.a.C2599a.a(pc0.a.f137177b));
            case 3:
                p pVar = p.f92877a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new kd0.s();
            case 4:
                q qVar = q.f92889a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new kd0.u();
            case 5:
                r rVar = r.f92900a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new kd0.v();
            case 6:
                Scope scope3 = (Scope) obj;
                s sVar = s.f92913a;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                return new kd0.x((c22.o) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(c22.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 7:
                t tVar = t.f92927a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new kd0.b0();
            case 8:
                u uVar = u.f92938a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                bz0.o.f22274a.getClass();
                return bz0.o.c().newBuilder().addInterceptor(new cf2.e()).build();
            case 9:
                u uVar2 = u.f92938a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new kd0.d0();
            case 10:
                Scope scope4 = (Scope) obj;
                u uVar3 = u.f92938a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                c83.b0.b bVar = new c83.b0.b();
                mz2.c.f122004a.getClass();
                bVar.f25769d.add(mz2.c.b.a());
                bVar.a(ez0.d.f67493a);
                bVar.a(h83.k.c());
                bVar.d((OkHttpClient) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(OkHttpClient.class), new StringQualifier("CampaignHttpClient"), (e23.a<? extends ParametersHolder>) null));
                gg1.v0.a aVar = gg1.v0.T;
                String strName = ve2.f.c(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).h()).name();
                aVar.getClass();
                bVar.b(gg1.v0.a.a(strName).a());
                return (cf2.d) bVar.c().b(cf2.d.class);
            case 11:
                v vVar = v.f92951a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new kd0.e0();
            case 12:
                w wVar = w.f92962a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new x();
            case 13:
                Scope scope5 = (Scope) obj;
                y yVar = y.f92990a;
                scope5.getClass();
                ((ParametersHolder) obj2).getClass();
                return new z10.p0(ModuleExtKt.androidContext(scope5));
            case 14:
                y yVar2 = y.f92990a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (a20.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, a20.a.class, new c83.h.a[0], null, null, null, 120);
            case 15:
                Scope scope6 = (Scope) obj;
                y yVar3 = y.f92990a;
                scope6.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                return new aq1.j((a20.a) scope6.get((k23.d<?>) t0Var2.b(a20.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope6.get((k23.d<?>) t0Var2.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 16:
                Scope scope7 = (Scope) obj;
                y yVar4 = y.f92990a;
                scope7.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                return new aq1.w((aq1.i) scope7.get((k23.d<?>) t0Var3.b(aq1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pu.h) scope7.get((k23.d<?>) t0Var3.b(pu.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 17:
                Scope scope8 = (Scope) obj;
                y yVar5 = y.f92990a;
                scope8.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                return new com.garmin.android.apps.connectmobile.startup.e((aq1.i) scope8.get((k23.d<?>) t0Var4.b(aq1.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pu.h) scope8.get((k23.d<?>) t0Var4.b(pu.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
            case 18:
                Scope scope9 = (Scope) obj;
                y yVar6 = y.f92990a;
                scope9.getClass();
                ((ParametersHolder) obj2).getClass();
                gr1.b.f78550d.getClass();
                gr1.b bVarA = gr1.b.a.a();
                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                return new z10.z1(bVarA, (f12.l) scope9.get((k23.d<?>) t0Var5.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope9.get((k23.d<?>) t0Var5.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (zd0.j1) scope9.get((k23.d<?>) t0Var5.b(zd0.j1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (re0.o) scope9.get((k23.d<?>) t0Var5.b(re0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), pc0.j.a.a(pc0.j.f137223i));
            case 19:
                z zVar = z.f93002a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new kd0.n0();
            case 20:
                z zVar2 = z.f93002a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return cw.i.f55930a;
            case 21:
                a0 a0Var = a0.f92655a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new kd0.p0();
            case 22:
                b0 b0Var = b0.f92667a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new a30.e();
            case 23:
                b0 b0Var2 = b0.f92667a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new kd0.s0();
            case 24:
                b0 b0Var3 = b0.f92667a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                t20.h.f161777b.getClass();
                return t20.h.a.a();
            case 25:
                c0 c0Var = c0.f92682a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new kd0.t0();
            case 26:
                d0 d0Var = d0.f92699a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new kd0.u0();
            case 27:
                d0 d0Var2 = d0.f92699a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new t60.m();
            case 28:
                Scope scope10 = (Scope) obj;
                g0 g0Var = g0.f92759a;
                scope10.getClass();
                ((ParametersHolder) obj2).getClass();
                return new kd0.v0((f12.b) scope10.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            default:
                g0 g0Var2 = g0.f92759a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                hj2.n.f84043a.getClass();
                return (hj2.b) ge1.b.W(t13.h.f161748a, new hj2.l(null));
        }
    }
}
