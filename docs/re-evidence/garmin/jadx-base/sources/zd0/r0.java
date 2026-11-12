package zd0;

import com.garmin.feature.garminpay.providers.gpay.ui.updatedevice.NewFitPayUpdateDeviceActivity;
import com.google.gson.Gson;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import okhttp3.OkHttpClient;
import p005kotlin.Unit;
import zn2.t3;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class r0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204121a;

    public /* synthetic */ r0(int i14) {
        this.f204121a = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        zf0.d dVar = null;
        Object[] objArr = 0;
        switch (this.f204121a) {
            case 0:
                int i14 = u0.f204141p;
                return Unit.INSTANCE;
            case 1:
                int i15 = zf0.j0.F;
                return hg0.b.a.a(hg0.b.f83652b);
            case 2:
                int i16 = zf0.j0.F;
                return lc.u0.g(d60.b.f57806c);
            case 3:
                int i17 = zf0.j0.F;
                return sa1.m.a.a(sa1.m.f158284b);
            case 4:
                int i18 = zf0.j0.F;
                ax1.b.a aVar = ax1.b.f13613b;
                ax1.a aVar2 = (ax1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ax1.a.class, new c83.h.a[0], null, null, null, 120);
                aVar.getClass();
                aVar2.getClass();
                return new ax1.b(aVar2);
            case 5:
                int i19 = zf0.j0.F;
                return ax1.i.a.a(ax1.i.f13633b);
            case 6:
                int i24 = zf0.j0.F;
                return new cg0.a(dVar, 1, objArr == true ? 1 : 0);
            case 7:
                int i25 = zf0.j0.F;
                return new androidx.lifecycle.y0();
            case 8:
                int i26 = zf0.j0.F;
                return new androidx.lifecycle.y0();
            case 9:
                int i27 = zf0.j0.F;
                return new androidx.lifecycle.y0();
            case 10:
                int i28 = zf0.j0.F;
                return new androidx.lifecycle.y0();
            case 11:
                int i29 = zf0.j0.F;
                return f42.b.a.a(f42.b.f68862b);
            case 12:
                int i30 = zf0.j0.F;
                return ig0.b.a.a(ig0.b.f93237b);
            case 13:
                zn2.q.a aVar3 = zn2.q.f205734b;
                int i34 = gt2.c.f79010a;
                return gt2.b.f79005a.h("PAY#NEW_FITPAY#NewFitPayCardProductCatalogProvider");
            case 14:
                zn2.u0 u0Var = zn2.u0.f205864a;
                int i35 = gt2.c.f79010a;
                return gt2.b.f79005a.h("PAY#NEW_FITPAY#NewFitPayNetworkManager");
            case 15:
                zn2.u0 u0Var2 = zn2.u0.f205864a;
                ln2.e eVar = ln2.e.f113687a;
                aq2.j jVar = aq2.j.f12491a;
                kj0.b.f104940a.getClass();
                zi2.a aVarA = kj0.b.a();
                jVar.getClass();
                aVarA.getClass();
                String f12509f = aq2.j.a(aVarA).getF12509f();
                Gson gsonD = aq2.j.d();
                eVar.getClass();
                f12509f.getClass();
                OkHttpClient okHttpClient = ln2.e.f113691e;
                if (okHttpClient == null) {
                    vb.h.z("Can not make FitPay platform call without configuring it");
                    return null;
                }
                Object objB = ln2.e.e(okHttpClient, f12509f, gsonD).b(ao2.a.class);
                objB.getClass();
                return (ao2.a) objB;
            case 16:
                zn2.u0 u0Var3 = zn2.u0.f205864a;
                ln2.e eVar2 = ln2.e.f113687a;
                aq2.j jVar2 = aq2.j.f12491a;
                kj0.b.f104940a.getClass();
                zi2.a aVarA2 = kj0.b.a();
                jVar2.getClass();
                aVarA2.getClass();
                String f12509f2 = aq2.j.a(aVarA2).getF12509f();
                Gson gsonD2 = aq2.j.d();
                eVar2.getClass();
                f12509f2.getClass();
                OkHttpClient okHttpClient2 = ln2.e.f113690d;
                if (okHttpClient2 == null) {
                    vb.h.z("Can not make FitPay platform call without configuring it");
                    return null;
                }
                Object objB2 = ln2.e.e(okHttpClient2, f12509f2, gsonD2).b(ao2.a.class);
                objB2.getClass();
                return (ao2.a) objB2;
            case 17:
                zn2.u0 u0Var4 = zn2.u0.f205864a;
                ln2.e.f113687a.getClass();
                Object objB3 = ln2.e.a().b(mn2.k.class);
                objB3.getClass();
                return (mn2.k) objB3;
            case 18:
                zn2.u0 u0Var5 = zn2.u0.f205864a;
                ln2.e eVar3 = ln2.e.f113687a;
                aq2.j jVar3 = aq2.j.f12491a;
                kj0.b.f104940a.getClass();
                zi2.a aVarA3 = kj0.b.a();
                jVar3.getClass();
                aVarA3.getClass();
                String f12509f3 = aq2.j.a(aVarA3).getF12509f();
                Gson gsonD3 = aq2.j.d();
                eVar3.getClass();
                f12509f3.getClass();
                Object objB4 = ln2.e.e(ln2.e.d(eVar3, null, 7), f12509f3, gsonD3).b(ao2.a.class);
                objB4.getClass();
                return (ao2.a) objB4;
            case 19:
                int i36 = gt2.c.f79010a;
                return gt2.b.f79005a.h("PAY#NEW_FITPAY#PushProvisionDataManager");
            case 20:
                t3.a aVar4 = t3.f205847j;
                int i37 = gt2.c.f79010a;
                return gt2.b.f79005a.h("ServerBasedOperator");
            case 21:
                t3.a aVar5 = t3.f205847j;
                Iterator<T> it = qs2.a.A.iterator();
                if (!it.hasNext()) {
                    c22.t.g();
                    return null;
                }
                int iA = ((qs2.a) it.next()).a();
                while (it.hasNext()) {
                    int iA2 = ((qs2.a) it.next()).a();
                    if (iA < iA2) {
                        iA = iA2;
                    }
                }
                return Integer.valueOf(iA);
            case 22:
                return new qs2.e[]{qs2.e.TRANSIT};
            case 23:
                NewFitPayUpdateDeviceActivity.a aVar6 = NewFitPayUpdateDeviceActivity.f51718o;
                int i38 = gt2.c.f79010a;
                return gt2.b.f79005a.h("PAY#NEW_FITPAY#NewFitPayUpdateDeviceActivity");
            case 24:
                return new m63.f1("com.garmin.android.apps.connectmobile.insights.presentation.navigation.DemographicsHelpRoute", zq0.a.INSTANCE, new Annotation[0]);
            case 25:
                zq0.b.Companion c3850b = zq0.b.INSTANCE;
                return new m63.e(tq0.f.a.f166058a);
            case 26:
                zq0.b.Companion c3850b2 = zq0.b.INSTANCE;
                return new m63.e(tq0.a.C3122a.f166039a);
            case 27:
                return new m63.f1("com.garmin.android.apps.connectmobile.insights.presentation.navigation.HomeRoute", zq0.c.INSTANCE, new Annotation[0]);
            case 28:
                com.garmin.feature.garminpay.ui.addcard.b.C1079b c1079b = com.garmin.feature.garminpay.ui.addcard.b.f51838f;
                return Unit.INSTANCE;
            default:
                return new je2.a(null, 0.0f, 0.0f, 0.0f, 15, null);
        }
    }
}
