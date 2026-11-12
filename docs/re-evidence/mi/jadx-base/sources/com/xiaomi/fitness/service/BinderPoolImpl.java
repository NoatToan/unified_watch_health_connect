package com.xiaomi.fitness.service;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/service/BinderPoolImpl;", "Lcom/xiaomi/fitness/service/a$a;", "Lcom/xiaomi/fitness/service/BinderRequest;", "request", "Landroid/os/IBinder;", "queryBinder", "(Lcom/xiaomi/fitness/service/BinderRequest;)Landroid/os/IBinder;", "", "", "getBinders", "()Ljava/util/Map;", "binders", "<init>", "()V", "service_release"}, k = 1, mv = {2, 0, 0})
public abstract class BinderPoolImpl extends a.AbstractBinderC0734a {
    @NotNull
    public abstract Map<Integer, IBinder> getBinders();

    @Override // com.xiaomi.fitness.service.a
    public abstract /* synthetic */ int getVersion() throws RemoteException;

    @Override // com.xiaomi.fitness.service.a
    @Nullable
    public IBinder queryBinder(@NotNull BinderRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return getBinders().get(Integer.valueOf(request.getBinderCode()));
    }
}
