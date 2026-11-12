package com.mi.health_provider;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\f\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"Lcom/mi/health_provider/HealthProviderService;", "Landroid/app/Service;", "<init>", "()V", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "", "onUnbind", "", LifecycleConstantKt.ON_DESTROY, "Companion", "health-provider_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthProviderService extends Service {

    @NotNull
    public static final String TAG = "HealthProviderService";

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return new HealthProviderApiImpl();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public boolean onUnbind(@Nullable Intent intent) {
        return super.onUnbind(intent);
    }
}
