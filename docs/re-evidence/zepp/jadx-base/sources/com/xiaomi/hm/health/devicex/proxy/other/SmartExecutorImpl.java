package com.xiaomi.hm.health.devicex.proxy.other;

import com.huami.devicex.injection.other.SmartExecutorApi;
import com.xiaomi.hm.health.common.SmartExecutor;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/other/SmartExecutorImpl;", "Lcom/huami/devicex/injection/other/SmartExecutorApi;", "Ljava/util/concurrent/Executor;", "getSerialExecutor", "getExecutor", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SmartExecutorImpl implements SmartExecutorApi {
    @Override // com.huami.devicex.injection.other.SmartExecutorApi
    @NotNull
    public Executor getExecutor() {
        return SmartExecutor.getExecutor();
    }

    @Override // com.huami.devicex.injection.other.SmartExecutorApi
    @NotNull
    public Executor getSerialExecutor() {
        return SmartExecutor.getSerialExecutor();
    }
}
