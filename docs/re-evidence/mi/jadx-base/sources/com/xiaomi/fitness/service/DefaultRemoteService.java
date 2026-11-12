package com.xiaomi.fitness.service;

import android.content.Intent;
import android.os.IBinder;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/service/DefaultRemoteService;", "Lcom/xiaomi/fitness/service/BaseRemoteService;", "", "onCreate", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "onUnbind", "(Landroid/content/Intent;)Z", LifecycleConstantKt.ON_DESTROY, "Lcom/xiaomi/fitness/service/a$a;", "getBinder", "()Lcom/xiaomi/fitness/service/a$a;", "binder", "<init>", "Companion", "service_release"}, k = 1, mv = {2, 0, 0})
public final class DefaultRemoteService extends Hilt_DefaultRemoteService {

    @NotNull
    private static final String TAG = "DefaultRemoteService";

    @Override // com.xiaomi.fitness.service.BaseRemoteService
    @NotNull
    public a.AbstractBinderC0734a getBinder() {
        return DefaultBinderPoolKt.getInstance(DefaultBinderPool.INSTANCE);
    }

    @Override // com.xiaomi.fitness.service.BaseRemoteService, android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        Logger.i(TAG, "onBind() called with: intent = " + intent);
        return super.onBind(intent);
    }

    @Override // com.xiaomi.fitness.service.Hilt_DefaultRemoteService, android.app.Service
    public void onCreate() {
        super.onCreate();
        Logger.i(TAG, "onCreate() called");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Logger.i(TAG, "onDestroy() called");
    }

    @Override // android.app.Service
    public boolean onUnbind(@Nullable Intent intent) {
        Logger.i(TAG, "onUnbind() called with: intent = " + intent);
        return super.onUnbind(intent);
    }
}
