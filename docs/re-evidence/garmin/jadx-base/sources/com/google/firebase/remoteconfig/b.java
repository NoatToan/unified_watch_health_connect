package com.google.firebase.remoteconfig;

import cf.t;
import cf.u;
import com.garmin.android.apps.connectmobile.settings.GCMActivityAppDiagnostics;
import com.garmin.feature.garminpay.providers.felica.exception.DeviceNotConnectedException;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import e13.k;
import e23.l;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import lc.u0;
import org.apache.commons.lang3.concurrent.Memoizer;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import p005kotlin.jvm.internal.s;
import p13.y;
import ps2.n;
import rn2.o;
import sy.i;
import tn2.m;
import tn2.r0;
import tn2.w;
import tn2.y0;
import ue.h0;
import ve.d1;
import vn2.c1;
import vn2.k0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f53817c;

    public /* synthetic */ b(int i14, Object obj, Object obj2) {
        this.f53815a = i14;
        this.f53816b = obj;
        this.f53817c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008d  */
    @Override // java.util.concurrent.Callable
    public final Object call() throws JSONException, DeviceNotConnectedException {
        int i14 = this.f53815a;
        Object obj = this.f53817c;
        Object obj2 = this.f53816b;
        switch (i14) {
            case 0:
                return ((FirebaseRemoteConfig) obj2).lambda$setCustomSignals$8((CustomSignals) obj);
            case 1:
                return ((FirebaseRemoteConfig) obj2).lambda$setConfigSettingsAsync$5((FirebaseRemoteConfigSettings) obj);
            case 2:
                return ((ConfigCacheClient) obj2).lambda$put$0((ConfigContainer) obj);
            case 3:
                return GCMActivityAppDiagnostics.createZipFile$lambda$0((File) obj2, (GCMActivityAppDiagnostics) obj);
            case 4:
                return ((Memoizer) obj2).lambda$compute$0(obj);
            case 5:
                Logger logger = w.f165679d;
                ps2.w wVar = ps2.w.f140538a;
                long j8 = ((w) obj2).f165682c;
                wVar.getClass();
                n nVarI = ps2.w.i(j8);
                nVarI.getClass();
                e13.b bVarA = nVarI.a();
                tn2.n nVar = new tn2.n(new i(17, (String) obj, nVarI), 4);
                int i15 = w03.b.f181178a;
                return new k(bVarA, nVar);
            case 6:
                List<o> list = (List) obj2;
                y0 y0Var = (y0) obj;
                Logger logger2 = y0.f165733f;
                if (list.isEmpty()) {
                    logger2.trace("Empty deleteCardList");
                    return z03.f.f200765a;
                }
                ArrayList arrayList = new ArrayList(y.r(list, 10));
                for (o oVar : list) {
                    logger2.trace("Delete the card from deleteCardList: " + oVar);
                    r0 r0Var = y0Var.f165735a;
                    String strB = oVar.getCid();
                    Logger logger3 = r0.f165631n;
                    arrayList.add(r0Var.b(new m(28), strB));
                }
                int i16 = w03.b.f181178a;
                return new z03.b(arrayList);
            case 7:
                ve.y0.b bVar = (ve.y0.b) obj2;
                ve.y0 y0Var2 = (ve.y0) obj;
                boolean z14 = true;
                boolean z15 = false;
                if (bVar instanceof ve.y0.b.C3318b) {
                    androidx.work.d.a c0165a = ((ve.y0.b.C3318b) bVar).f177656a;
                    u uVar = y0Var2.f177642j;
                    String str = y0Var2.f177635c;
                    h0.c cVarC = uVar.c(str);
                    y0Var2.f177641i.i().a(str);
                    if (cVarC == null) {
                        z14 = false;
                    } else if (cVarC == h0.c.RUNNING) {
                        t tVar = y0Var2.f177633a;
                        if (c0165a instanceof androidx.work.d.a.c) {
                            int i17 = d1.f177564a;
                            ue.u.a().getClass();
                            if (tVar.c()) {
                                y0Var2.c();
                            } else {
                                uVar.h(str, h0.c.SUCCEEDED);
                                androidx.work.c cVar = ((androidx.work.d.a.c) c0165a).f11474a;
                                cVar.getClass();
                                uVar.k(str, cVar);
                                long jCurrentTimeMillis = y0Var2.f177639g.currentTimeMillis();
                                cf.b bVar2 = y0Var2.f177643k;
                                for (String str2 : bVar2.a(str)) {
                                    if (uVar.c(str2) == h0.c.BLOCKED && bVar2.b(str2)) {
                                        int i18 = d1.f177564a;
                                        ue.u.a().getClass();
                                        uVar.h(str2, h0.c.ENQUEUED);
                                        uVar.p(jCurrentTimeMillis, str2);
                                    }
                                }
                            }
                        } else if (c0165a instanceof androidx.work.d.a.b) {
                            int i19 = d1.f177564a;
                            ue.u.a().getClass();
                            y0Var2.b(-256);
                        } else {
                            int i24 = d1.f177564a;
                            ue.u.a().getClass();
                            if (tVar.c()) {
                                y0Var2.c();
                            } else {
                                if (c0165a == null) {
                                    c0165a = new androidx.work.d.a.C0165a();
                                }
                                y0Var2.d(c0165a);
                            }
                        }
                        z14 = false;
                    } else if (cVarC.a()) {
                        z14 = false;
                    } else {
                        y0Var2.b(-512);
                    }
                    z15 = z14;
                } else if (bVar instanceof ve.y0.b.a) {
                    y0Var2.d(((ve.y0.b.a) bVar).f177655a);
                } else {
                    if (!(bVar instanceof ve.y0.b.c)) {
                        u0.r();
                        return null;
                    }
                    int i25 = ((ve.y0.b.c) bVar).f177657a;
                    u uVar2 = y0Var2.f177642j;
                    String str3 = y0Var2.f177635c;
                    if (s.g(y0Var2.f177633a.f26965y, Boolean.TRUE)) {
                        int i26 = d1.f177564a;
                        ue.u.a().getClass();
                        y0Var2.b(i25);
                    } else {
                        h0.c cVarC2 = uVar2.c(str3);
                        if (cVarC2 == null || cVarC2.a()) {
                            int i27 = d1.f177564a;
                            ue.u uVarA = ue.u.a();
                            Objects.toString(cVarC2);
                            uVarA.getClass();
                            z14 = false;
                        } else {
                            int i28 = d1.f177564a;
                            ue.u uVarA2 = ue.u.a();
                            cVarC2.toString();
                            uVarA2.getClass();
                            uVar2.h(str3, h0.c.ENQUEUED);
                            uVar2.setStopReason(str3, i25);
                            uVar2.u(-1L, str3);
                        }
                    }
                    z15 = z14;
                }
                return Boolean.valueOf(z15);
            case 8:
                return vn2.s.c2((vn2.s) obj2, (l) obj);
            default:
                k0 k0Var = (k0) obj2;
                JSONObject jSONObject = (JSONObject) obj;
                Logger logger4 = k0.f178905d;
                if (!k0Var.f0().c()) {
                    throw new DeviceNotConnectedException();
                }
                String string = jSONObject.getJSONObject("paymentMethodData").getJSONObject("tokenizationData").getString("token");
                c1 c1VarF0 = k0Var.f0();
                string.getClass();
                return c1VarF0.Q(string, new k0.b(k0Var));
        }
    }
}
