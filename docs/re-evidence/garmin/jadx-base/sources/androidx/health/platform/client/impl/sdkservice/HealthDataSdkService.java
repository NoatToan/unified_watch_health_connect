package androidx.health.platform.client.impl.sdkservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.concurrent.Executors;
import m9.b;

/* JADX INFO: loaded from: classes.dex */
public final class HealthDataSdkService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        String action = intent.getAction();
        if ("androidx.health.platform.client.ACTION_BIND_SDK_SERVICE".equals(action)) {
            return new b(getApplicationContext(), Executors.newSingleThreadExecutor(new ThreadFactoryBuilder().setNameFormat("HealthData-HealthDataSdkService-%d").build()));
        }
        StringBuilder sb3 = new StringBuilder("Bind request with an invalid action [");
        sb3.append(action);
        sb3.append("]");
        return null;
    }
}
