package j31;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDIConnectIQInstalledApps;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lj31/l;", "Lj31/z0;", "Lb31/f;", "onboardingChecksRepository", "<init>", "(Lb31/f;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b31.f f96905b;

    static {
        new a(null);
    }

    public l(b31.f fVar) {
        fVar.getClass();
        this.f96905b = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // j31.z0
    public final Object c(long j8, v13.c cVar) throws Throwable {
        n nVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f96915d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f96915d = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objP = nVar.f96913b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f96915d;
        if (i15 == 0) {
            o13.r.b(objP);
            boolean zK = hk0.p.k(j8);
            a2 a2Var = a2.ONBOARDING;
            String strH = com.airbnb.lottie.animation.keyframe.a.h("onRefresh - device connected = ", zK);
            i2.f36769a.getClass();
            i2.a.b(a2Var, "CiqAppsFeatureHandler", strH);
            if (!zK) {
                return Unit.INSTANCE;
            }
            com.garmin.android.apps.connectmobile.connectiq.b0 b0Var = new com.garmin.android.apps.connectmobile.connectiq.b0(j8);
            nVar.f96912a = j8;
            nVar.f96915d = 1;
            o53.k kVar = new o53.k(u13.f.b(nVar), 1);
            kVar.q();
            b0Var.d(GDIConnectIQInstalledApps.AppType.ALL, new m(kVar));
            objP = kVar.p();
            if (objP == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = nVar.f96912a;
            o13.r.b(objP);
        }
        List list = (List) objP;
        if (list == null) {
            a2 a2Var2 = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "CiqAppsFeatureHandler", "Get Connect IQ Apps fetch failed or returned null");
            return Unit.INSTANCE;
        }
        a2 a2Var3 = a2.ONBOARDING;
        String strH2 = am.j.h(list.size(), "Get Connect IQ Apps, installed apps ");
        i2.f36769a.getClass();
        i2.a.b(a2Var3, "CiqAppsFeatureHandler", strH2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((com.garmin.android.apps.connectmobile.connectiq.e) obj).f31858b == -1) {
                arrayList.add(obj);
            }
        }
        a2 a2Var4 = a2.ONBOARDING;
        String strH3 = am.j.h(arrayList.size(), "Get Connect IQ Apps, installed apps from Connect IQ store ");
        i2.f36769a.getClass();
        i2.a.b(a2Var4, "CiqAppsFeatureHandler", strH3);
        if (!arrayList.isEmpty()) {
            this.f96905b.a(j8, e31.a.HAS_CONNECT_IQ_APP_INSTALLED);
        }
        return Unit.INSTANCE;
    }

    @Override // j31.z0
    public final void d(Context context, long j8, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        new en.b(context, Long.valueOf(j8)).execute();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lj31/l$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
