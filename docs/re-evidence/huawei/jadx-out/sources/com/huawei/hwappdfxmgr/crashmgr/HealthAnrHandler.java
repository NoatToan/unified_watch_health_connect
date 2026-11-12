package com.huawei.hwappdfxmgr.crashmgr;

import com.huawei.haf.common.dfx.block.MainThreadMonitor;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import defpackage.llp;
import health.compact.a.EnvironmentInfo;
import health.compact.a.ProcessUtil;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public class HealthAnrHandler extends MainThreadMonitor.UiThreadMonitorHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f16991a;

    public HealthAnrHandler() {
        super("TimeEat_BlockMonitor");
    }

    @Override // com.huawei.haf.common.dfx.block.MainThreadMonitor.UiThreadMonitorHandler, com.huawei.haf.common.dfx.block.AbstractMonitorHandler, com.huawei.haf.common.dfx.block.MonitorCallback
    public void begin(Thread thread, String str, long j) {
        super.begin(thread, str, j);
        this.f16991a = false;
    }

    @Override // com.huawei.haf.common.dfx.block.AbstractMonitorHandler
    public void onSendBlockInfo(String str, String str2) {
        boolean zD = EnvironmentInfo.d(getContext());
        LogUtil.d("TimeEat_BlockMonitor", "onSendBlockInfo isAppSigned=", Boolean.valueOf(!zD));
        if (zD || this.f16991a) {
            return;
        }
        this.f16991a = true;
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(OpAnalyticsConstants.MONITOR_KEY, str);
        linkedHashMap.put(OpAnalyticsConstants.MONITOR_INFO, str2);
        linkedHashMap.put(OpAnalyticsConstants.PROC_NAME, ProcessUtil.c());
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_ANR_90030002.value(), linkedHashMap);
    }

    @Override // com.huawei.haf.common.dfx.block.MainThreadMonitor.UiThreadMonitorHandler, com.huawei.haf.common.dfx.block.MonitorCallback
    public boolean check(Thread thread, long j, long j2) {
        llp.d("TimeEat_BlockMonitor", j);
        return super.check(thread, j, j2);
    }
}
