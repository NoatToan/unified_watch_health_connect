package com.xiaomi.fitness.service;

import android.content.Intent;
import android.os.IBinder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078$X¤\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/service/BaseRemoteService;", "Lcom/xiaomi/fitness/service/BaseService;", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "Lcom/xiaomi/fitness/service/a$a;", "getBinder", "()Lcom/xiaomi/fitness/service/a$a;", "binder", "<init>", "()V", "Companion", "service_release"}, k = 1, mv = {2, 0, 0})
public abstract class BaseRemoteService extends BaseService {

    @NotNull
    private static final String TAG = "RemoteService";

    @NotNull
    public abstract a.AbstractBinderC0734a getBinder();

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return getBinder();
    }
}
