package com.huawei.hwappdfxmgr.crashmgr;

import com.huawei.haf.common.dfx.memory.AbstractMemoryHandler;
import com.huawei.haf.common.dfx.memory.MemoryMonitorConfig;
import com.huawei.haf.common.os.MemoryUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import defpackage.npr;
import health.compact.a.EnvironmentInfo;
import health.compact.a.EnvironmentUtils;
import health.compact.a.ProcessUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class HealthMemoryHandler extends AbstractMemoryHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f16999b;
    private final long e;

    @Override // com.huawei.haf.common.dfx.memory.MemoryCallback
    public int minKillDexThresholdSize() {
        return 40;
    }

    public HealthMemoryHandler() {
        super("TimeEat_MemoryMonitor");
        if (EnvironmentUtils.b()) {
            this.e = 86400000L;
        } else {
            this.e = 0L;
        }
        this.f16999b = false;
    }

    @Override // com.huawei.haf.common.dfx.memory.MemoryCallback
    public MemoryMonitorConfig getMonitorConfig() {
        if (EnvironmentUtils.b()) {
            return a();
        }
        if (EnvironmentUtils.e()) {
            return c();
        }
        return null;
    }

    private MemoryMonitorConfig a() {
        if (MemoryUtils.d() > 3072) {
            return new MemoryMonitorConfig(86, 102);
        }
        return new MemoryMonitorConfig(60, 72);
    }

    private MemoryMonitorConfig c() {
        if (MemoryUtils.d() > 3072) {
            return new MemoryMonitorConfig(92, 110);
        }
        return new MemoryMonitorConfig(70, 85);
    }

    @Override // com.huawei.haf.common.dfx.memory.MemoryCallback
    public boolean isAutoCheck() {
        return this.f16999b;
    }

    @Override // com.huawei.haf.common.dfx.memory.MemoryCallback
    public long minKillTimeInterval() {
        return this.e;
    }

    @Override // com.huawei.haf.common.dfx.memory.MemoryCallback
    public void reportDexOverThresholdSize(long j) {
        npr.c(2);
    }

    @Override // com.huawei.haf.common.dfx.memory.AbstractMemoryHandler, com.huawei.haf.common.dfx.memory.MemoryCallback
    public void reportLeak(String str, String str2, String str3, long j) {
        if ("CloseGuard".equals(str)) {
            ReleaseLogUtil.d("TimeEat_MemoryMonitor", "leakInfo: ", LogUtil.e() ? str2 : str3);
        }
        super.reportLeak(str, str2, str3, j);
    }

    @Override // com.huawei.haf.common.dfx.memory.AbstractMemoryHandler
    public void onSendLeakInfo(String str, String str2) {
        b(str, str2, OperationKey.HEALTH_APP_LEAK_90030005.value());
    }

    @Override // com.huawei.haf.common.dfx.memory.AbstractMemoryHandler
    public void onSendMemoryInfo(String str, String str2) {
        b(str, str2, OperationKey.HEALTH_APP_MEMORY_90030004.value());
    }

    private void b(String str, String str2, String str3) {
        boolean zD = EnvironmentInfo.d(getContext());
        LogUtil.d("TimeEat_MemoryMonitor", "reportMemoryInfo isAppSigned=", Boolean.valueOf(!zD));
        if (zD) {
            return;
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(OpAnalyticsConstants.MONITOR_KEY, str);
        linkedHashMap.put(OpAnalyticsConstants.MONITOR_INFO, str2);
        linkedHashMap.put(OpAnalyticsConstants.PROC_NAME, ProcessUtil.c());
        OpAnalyticsUtil.getInstance().setEvent2nd(str3, linkedHashMap);
    }
}
