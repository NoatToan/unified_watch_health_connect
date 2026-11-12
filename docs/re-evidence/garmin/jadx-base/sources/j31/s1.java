package j31;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.GCMWiFiNetworksActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lj31/s1;", "Lj31/z0;", "Lb31/f;", "onboardingChecksRepository", "<init>", "(Lb31/f;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s1 implements z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b31.f f96926b;

    static {
        new a(null);
    }

    public s1(b31.f fVar) {
        fVar.getClass();
        this.f96926b = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // j31.z0
    public final Object c(long j8, v13.c cVar) {
        t1 t1Var;
        boolean zK;
        Object bVar;
        gn2.c cVar2;
        Object objP;
        a2 a2Var;
        if (cVar instanceof t1) {
            t1Var = (t1) cVar;
            int i14 = t1Var.f96935h;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                t1Var.f96935h = i14 - Integer.MIN_VALUE;
            } else {
                t1Var = new t1(this, cVar);
            }
        } else {
            t1Var = new t1(this, cVar);
        }
        Object objP2 = t1Var.f96933f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = t1Var.f96935h;
        String str = "WiFiFeatureHandler";
        if (i15 != 0) {
            if (i15 == 1) {
                boolean z14 = t1Var.f96929b;
                long j14 = t1Var.f96928a;
                gn2.c cVar3 = t1Var.f96930c;
                o13.r.b(objP2);
                cVar2 = cVar3;
                objP = objP2;
                zK = z14;
                j8 = j14;
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j8 = t1Var.f96928a;
                str = t1Var.f96932e;
                a2Var = t1Var.f96931d;
                o13.r.b(objP2);
            }
            String str2 = "Stored Wifi fetch Success - stored networks = " + ((gn2.c.d) objP2).f78108c;
            i2.f36769a.getClass();
            i2.a.b(a2Var, str, str2);
            this.f96926b.a(j8, e31.a.STORED_WIFI_NETWORK);
            return Unit.INSTANCE;
        }
        o13.r.b(objP2);
        zK = hk0.p.k(j8);
        a2 a2Var2 = a2.ONBOARDING;
        String strH = com.airbnb.lottie.animation.keyframe.a.h("onRefresh - device connected = ", zK);
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "WiFiFeatureHandler", strH);
        if (zK) {
            try {
                int i16 = o13.q.f128596b;
                bVar = (gn2.c) zb0.k.b(gn2.c.class, j8);
            } catch (Throwable th3) {
                int i17 = o13.q.f128596b;
                bVar = new o13.q.b(th3);
            }
            Throwable thB = o13.q.b(bVar);
            if (thB != null) {
                i2.f36769a.getClass();
                i2.a.f(a2.DEVICES, "WiFiFeatureHandler", "retrieveNetworks FAILED deviceId[" + j8 + "] " + thB);
            }
            if (bVar instanceof o13.q.b) {
                bVar = null;
            }
            cVar2 = (gn2.c) bVar;
            if (cVar2 != null) {
                t1Var.f96930c = cVar2;
                t1Var.f96928a = j8;
                t1Var.f96929b = zK;
                t1Var.f96935h = 1;
                objP = cVar2.p(t1Var);
                if (objP != aVar) {
                }
                return aVar;
            }
        }
        return Unit.INSTANCE;
        if (!((gn2.c.d) objP).f78108c.isEmpty()) {
            a2 a2Var3 = a2.ONBOARDING;
            t1Var.f96930c = null;
            t1Var.f96931d = a2Var3;
            t1Var.f96932e = "WiFiFeatureHandler";
            t1Var.f96928a = j8;
            t1Var.f96929b = zK;
            t1Var.f96935h = 2;
            objP2 = cVar2.p(t1Var);
            if (objP2 != aVar) {
                a2Var = a2Var3;
                String str3 = "Stored Wifi fetch Success - stored networks = " + ((gn2.c.d) objP2).f78108c;
                i2.f36769a.getClass();
                i2.a.b(a2Var, str, str3);
                this.f96926b.a(j8, e31.a.STORED_WIFI_NETWORK);
            }
            return aVar;
        }
        return Unit.INSTANCE;
    }

    @Override // j31.z0
    public final void d(Context context, long j8, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        rd2.f.a().f152045a.getClass();
        sd2.f fVarI = rd2.j.i(j8, null);
        String strD = fVarI != null ? zb0.t.d(fVarI) : null;
        GCMWiFiNetworksActivity.f43245f.getClass();
        context.startActivity(GCMWiFiNetworksActivity.a.b(context, j8, str2, str, strD, false));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lj31/s1$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
