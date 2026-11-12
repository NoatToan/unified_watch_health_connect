package com.garmin.android.apps.connectmobile.startup.init;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gfdi.configuration.GdiClientConfigurationUtil;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import da2.d;
import da2.e;
import hk0.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import la2.k;
import oa2.c;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import zd.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/init/GdiDeviceConnectionInitializer;", "Lzd/b;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GdiDeviceConnectionInitializer implements b<Unit> {
    @Override // zd.b
    public final Unit create(Context context) throws Throwable {
        d dVarC;
        k kVar;
        context.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "GdiDeviceConnectionInitializer", "initialize");
        Set<SupportedCapability> setLoadAppCapabilities = SupportedCapability.loadAppCapabilities(context);
        setLoadAppCapabilities.getClass();
        f fVar = new f(context, setLoadAppCapabilities);
        Logger logger = d.f58880c;
        e eVarFromClientConfig = GdiClientConfigurationUtil.fromClientConfig(context);
        synchronized (d.f58883f) {
            try {
                if (d.f58884g == null && eVarFromClientConfig != null) {
                    d.f58885h = eVarFromClientConfig;
                    c.a(eVarFromClientConfig);
                }
                dVarC = d.c(context);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        Logger logger2 = d.f58880c;
        if (dVarC.f58887b != null) {
            logger2.warn("Overwriting non-null HostConfiguration");
        }
        dVarC.f58887b = fVar;
        la2.e eVar = d.b().f58886a;
        k.f111700b.getClass();
        synchronized (s0.f105811a.b(k.class)) {
            try {
                if (k.f111701c == null) {
                    k.f111701c = new k(context, null);
                }
                kVar = k.f111701c;
                kVar.getClass();
            } catch (Throwable th4) {
                throw th4;
            }
        }
        eVar.b(kVar);
        return Unit.INSTANCE;
    }

    @Override // zd.b
    public final List<Class<? extends b<?>>> dependencies() {
        return new ArrayList();
    }
}
