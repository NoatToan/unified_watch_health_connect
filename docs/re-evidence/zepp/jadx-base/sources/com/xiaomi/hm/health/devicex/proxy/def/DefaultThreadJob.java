package com.xiaomi.hm.health.devicex.proxy.def;

import com.twitter.sdk.android.tweetcomposer.g;
import com.xiaomi.hm.health.devicex.proxy.ThreadJob;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/def/DefaultThreadJob;", "Lcom/xiaomi/hm/health/devicex/proxy/ThreadJob;", "", "start", g.g, "", "getTaskName", "run", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DefaultThreadJob implements ThreadJob {
    @Override // com.xiaomi.hm.health.devicex.proxy.ThreadJob
    public void cancel() {
    }

    @Override // com.xiaomi.hm.health.devicex.proxy.ThreadJob
    @NotNull
    public String getTaskName() {
        return "DefaultThreadJob";
    }

    @Override // java.lang.Runnable
    public void run() {
        throw new IllegalAccessError("访问错误，请确认和修改问题");
    }

    @Override // com.xiaomi.hm.health.devicex.proxy.ThreadJob
    public void start() {
    }
}
