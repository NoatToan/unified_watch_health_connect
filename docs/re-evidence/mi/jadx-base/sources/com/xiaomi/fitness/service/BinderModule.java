package com.xiaomi.fitness.service;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/service/BinderModule;", "", "Lcom/xiaomi/fitness/service/DefaultBinderPool;", "pool", "Lcom/xiaomi/fitness/service/a;", "bindDeviceBinderPool", "(Lcom/xiaomi/fitness/service/DefaultBinderPool;)Lcom/xiaomi/fitness/service/a;", "<init>", "()V", "service_release"}, k = 1, mv = {2, 0, 0})
public abstract class BinderModule {
    @NotNull
    public abstract a bindDeviceBinderPool(@NotNull DefaultBinderPool pool);
}
