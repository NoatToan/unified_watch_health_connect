package com.huawei.haf.common.dfx.process;

import com.huawei.haf.common.dfx.DfxMonitorTask;
import com.huawei.haf.common.utils.CollectionUtils;
import health.compact.a.DfxMonitorCenter;
import health.compact.a.ProcessUtil;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessMonitor implements DfxMonitorTask {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static DfxMonitorTask f5886c;
    private static ProcessStatusMonitor e;

    @Override // com.huawei.haf.common.dfx.DfxMonitorTask
    public long monitorDelayTime() {
        return 120000L;
    }

    private ProcessMonitor() {
    }

    public static void c(List<String> list, ProcessCallback processCallback) {
        if (!CollectionUtils.a(list) && list.contains(ProcessUtil.c()) && e == null) {
            if (processCallback == null) {
                processCallback = new DefaultProcessHandler("HAF_ProcessMonitor");
            }
            e = new ProcessStatusMonitor(list, processCallback);
            ProcessMonitor processMonitor = new ProcessMonitor();
            f5886c = processMonitor;
            DfxMonitorCenter.e(processMonitor);
        }
    }

    public static void a() {
        if (e != null) {
            DfxMonitorTask dfxMonitorTask = f5886c;
            if (dfxMonitorTask != null) {
                DfxMonitorCenter.c(dfxMonitorTask);
                f5886c = null;
            }
            e.close();
            e = null;
        }
    }

    @Override // com.huawei.haf.common.dfx.DfxMonitorTask
    public void onMonitor() {
        ProcessStatusMonitor processStatusMonitor = e;
        if (processStatusMonitor != null) {
            DfxMonitorCenter.e(this);
            processStatusMonitor.a();
        }
    }
}
