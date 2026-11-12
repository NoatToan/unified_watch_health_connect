package com.huawei.hms.network.embedded;

import android.os.SystemClock;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PowerUtils;

/* JADX INFO: loaded from: classes34.dex */
public class u4 extends r4<g5, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f15440a = "SystemControlCache";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static u4 f15441b = new u4();

    @Override // com.huawei.hms.network.embedded.r4
    public int obtainNetworkQuality(long j, long j2) {
        Logger.v(f15440a, "the data will not be update,and always default");
        return 0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huawei.hms.network.embedded.r4
    public g5 getPeekLastInfo() {
        return a(SystemClock.elapsedRealtime());
    }

    @Override // com.huawei.hms.network.embedded.r4
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void updateCacheInfo(Boolean bool) {
        a(SystemClock.elapsedRealtime());
    }

    public f5 a(long j) {
        f5 f5Var = new f5();
        f5Var.c(PowerUtils.isDozeIdleMode(ContextHolder.getResourceContext()));
        f5Var.b(PowerUtils.isAppIdleMode(ContextHolder.getResourceContext()));
        f5Var.a(PowerUtils.isWhilteList(ContextHolder.getResourceContext()));
        f5Var.b(PowerUtils.readPowerSaverMode(ContextHolder.getResourceContext()));
        f5Var.a(PowerUtils.readDataSaverMode(ContextHolder.getResourceContext()));
        f5Var.a(j);
        return f5Var;
    }

    public static u4 getInstance() {
        return f15441b;
    }
}
