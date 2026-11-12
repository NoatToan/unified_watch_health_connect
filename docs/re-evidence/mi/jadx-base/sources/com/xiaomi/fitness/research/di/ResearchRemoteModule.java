package com.xiaomi.fitness.research.di;

import android.os.IBinder;
import com.xiaomi.fitness.research.device.DeviceInfoFetcherImpl;
import com.xiaomi.fitness.research.device.ProductInfoFetcherImpl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH'¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/research/di/ResearchRemoteModule;", "", "<init>", "()V", "bindDeviceManagerBinder", "Landroid/os/IBinder;", "binder", "Lcom/xiaomi/fitness/research/device/DeviceInfoFetcherImpl;", "bindProductInfoFetcher", "fetcher", "Lcom/xiaomi/fitness/research/device/ProductInfoFetcherImpl;", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ResearchRemoteModule {
    @NotNull
    public abstract IBinder bindDeviceManagerBinder(@NotNull DeviceInfoFetcherImpl binder);

    @NotNull
    public abstract IBinder bindProductInfoFetcher(@NotNull ProductInfoFetcherImpl fetcher);
}
