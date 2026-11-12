package androidx.health.platform.client.impl.sdkservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.ocp;
import defpackage.xtb;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class HealthDataSdkService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        String action = intent.getAction();
        if ("androidx.health.platform.client.ACTION_BIND_SDK_SERVICE".equals(action)) {
            return new xtb(getApplicationContext(), Executors.newSingleThreadExecutor(new ocp().e("HealthData-HealthDataSdkService-%d").b()));
        }
        String.format("Bind request with an invalid action [%s]", action);
        return null;
    }
}
