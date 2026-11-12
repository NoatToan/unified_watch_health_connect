package com.huawei.haf.common.dfx.memory;

import android.content.SharedPreferences;
import android.os.Debug;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.dfx.DfxBaseHandler;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.haf.common.os.MemoryUtils;
import health.compact.a.DfxMonitorCenter;
import health.compact.a.LogUtil;
import health.compact.a.ProcessUtil;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractMemoryHandler extends DfxBaseHandler implements MemoryCallback {
    private static final long FIVE_MINUTE_DURATION = 300000;
    private static final String LAST_KILL_PROCESS_TIME = "last_kill_process_time";
    private static final int LOG_PRINT_COUNT_THRESHOLD = 5;
    private static final String MEMORY_LOG_FORMAT = "_memoryLog_%d";
    private static final int SHIFT_OPERATION_BITS = 10;
    private static final long TEN_MINUTE_DURATION = 600000;
    private long mLastEnterCheckTime;
    private final MemoryCallback mMemoryCallback;
    private final ProcessMonitorInfo mProcessMonitorInfo;

    protected void onSendLeakInfo(String str, String str2) {
    }

    protected void onSendMemoryInfo(String str, String str2) {
    }

    public AbstractMemoryHandler(String str) {
        super(str, MEMORY_LOG_FORMAT);
        this.mMemoryCallback = this;
        MemoryMonitorConfig monitorConfig = getMonitorConfig();
        if (monitorConfig != null && monitorConfig.e() > 0) {
            this.mProcessMonitorInfo = new ProcessMonitorInfo(monitorConfig);
        } else {
            this.mProcessMonitorInfo = null;
        }
    }

    @Override // com.huawei.haf.common.dfx.memory.MemoryCallback
    public void check(boolean z) {
        if (this.mProcessMonitorInfo == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.mLastEnterCheckTime < 60000) {
            return;
        }
        this.mLastEnterCheckTime = jCurrentTimeMillis;
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        long totalPss = memoryInfo.getTotalPss() >> 10;
        ProcessMonitorInfo processMonitorInfo = this.mProcessMonitorInfo;
        if (isReachKillThreshold(totalPss, processMonitorInfo, memoryInfo)) {
            if (processKillThreshold(jCurrentTimeMillis, totalPss, z, memoryInfo)) {
                return;
            }
        } else {
            processBaseThreshold(jCurrentTimeMillis, totalPss, processMonitorInfo);
            processMonitorInfo.d();
        }
        processMonitorInfo.h++;
        if (processMonitorInfo.h > 5 || Math.abs(totalPss - processMonitorInfo.g) >= 5) {
            LogUtil.c(this.mTag, "pssSizeMB from ", Long.valueOf(processMonitorInfo.g), " to ", Long.valueOf(totalPss));
            MemoryUtils.a(memoryInfo, true);
            processMonitorInfo.g = totalPss;
            processMonitorInfo.h = 0;
        }
    }

    @Override // com.huawei.haf.common.dfx.memory.MemoryCallback
    public void reportLeak(String str, String str2, String str3, long j) {
        StringBuilder sb = new StringBuilder(256);
        fillSaveBaseInfo(sb, null, null, j, str2);
        sb.append(str3);
        sb.append(System.lineSeparator());
        String string = sb.toString();
        onSendLeakInfo(str, string);
        saveMemoryInfo(string);
    }

    private boolean isReachKillThreshold(long j, ProcessMonitorInfo processMonitorInfo, Debug.MemoryInfo memoryInfo) {
        boolean z = j > ((long) processMonitorInfo.i.a());
        int iMinKillDexThresholdSize = this.mMemoryCallback.minKillDexThresholdSize();
        if (iMinKillDexThresholdSize > 0) {
            processMonitorInfo.d = ((long) (MemoryUtils.b(memoryInfo, 10) >> 10)) + ((long) (MemoryUtils.a(memoryInfo, 10) >> 10));
            if (processMonitorInfo.d > iMinKillDexThresholdSize) {
                this.mMemoryCallback.reportDexOverThresholdSize(processMonitorInfo.d);
                return true;
            }
        }
        return z;
    }

    private void processBaseThreshold(long j, long j2, ProcessMonitorInfo processMonitorInfo) {
        if (j2 > processMonitorInfo.i.e()) {
            handleBaseThreshold(j, j2, processMonitorInfo);
        } else {
            processMonitorInfo.b();
        }
    }

    private void handleBaseThreshold(long j, long j2, ProcessMonitorInfo processMonitorInfo) {
        if (processMonitorInfo.j == 0) {
            processMonitorInfo.j = j;
            processMonitorInfo.f5877a = false;
        } else {
            if (processMonitorInfo.f5877a || j2 <= processMonitorInfo.i.b() || j - processMonitorInfo.j <= 300000) {
                return;
            }
            processMonitorInfo.f5877a = true;
            ReleaseLogUtil.c(this.mTag, "memory over base threshold need run gc, pss = ", Long.valueOf(j2));
            DfxMonitorCenter.c();
        }
    }

    private boolean processKillThreshold(long j, long j2, boolean z, Debug.MemoryInfo memoryInfo) {
        ProcessMonitorInfo processMonitorInfo = this.mProcessMonitorInfo;
        if (handleKillThreshold(j, j2, processMonitorInfo, memoryInfo) && z && j - processMonitorInfo.f > 600000) {
            long jMinKillTimeInterval = this.mMemoryCallback.minKillTimeInterval();
            if (jMinKillTimeInterval <= 0 || j - processMonitorInfo.e > jMinKillTimeInterval) {
                ReleaseLogUtil.d(this.mTag, "memory over kill threshold, begin kill", " ", ProcessUtil.c(), ", pss=", Long.valueOf(j2), ", minKillTimeInterval=", Long.valueOf(jMinKillTimeInterval));
                saveDumpMemoryInfo(memoryInfo, j, "memory over kill threshold, begin kill", true);
                setLastKillProcessTime(j);
                processMonitorInfo.e = j;
                Process.killProcess(Process.myPid());
                return true;
            }
        }
        return false;
    }

    private void saveDumpMemoryInfo(Debug.MemoryInfo memoryInfo, long j, String str, boolean z) {
        StringBuilder sb = new StringBuilder(4096);
        fillSaveBaseInfo(sb, null, null, j, str);
        fillMemoryInfo(sb, memoryInfo);
        String string = sb.toString();
        if (z) {
            onSendMemoryInfo("memory over baseline self kill process", string);
        }
        saveMemoryInfo(string);
    }

    private void saveMemoryInfo(String str) {
        if (saveInfo(str, getSaveFile())) {
            return;
        }
        LogUtil.e(this.mTag, "saveMemoryInfo fail.");
    }

    private void fillMemoryInfo(StringBuilder sb, Debug.MemoryInfo memoryInfo) {
        ProcessMonitorInfo processMonitorInfo = this.mProcessMonitorInfo;
        if (processMonitorInfo != null) {
            sb.append("BasePssThreshold(MB):");
            sb.append(processMonitorInfo.i.e());
            sb.append(", ReachBaseThresholdStartTime:");
            sb.append(DfxUtils.e(processMonitorInfo.j));
            sb.append(System.lineSeparator());
            sb.append("KillPssThreshold(MB):");
            sb.append(processMonitorInfo.i.a());
            sb.append(", ReachKillThresholdStartTime:");
            sb.append(DfxUtils.e(processMonitorInfo.f));
            sb.append(System.lineSeparator());
            if (processMonitorInfo.d > 0) {
                sb.append("KillDexThresholdSize(MB):");
                sb.append(this.mMemoryCallback.minKillDexThresholdSize());
                sb.append(", CurrentDexSize(MB):");
                sb.append(processMonitorInfo.d);
                sb.append(System.lineSeparator());
            }
        }
        String strE = MemoryUtils.e(false);
        if (!TextUtils.isEmpty(strE)) {
            sb.append(strE);
            sb.append(System.lineSeparator());
        }
        sb.append(MemoryUtils.a(memoryInfo, true));
        sb.append(System.lineSeparator());
        if (memoryInfo != null) {
            sb.append("--------------------------------");
            sb.append(System.lineSeparator());
            sb.append(MemoryUtils.e(memoryInfo));
            sb.append(System.lineSeparator());
        }
    }

    private boolean handleKillThreshold(long j, long j2, ProcessMonitorInfo processMonitorInfo, Debug.MemoryInfo memoryInfo) {
        if (processMonitorInfo.e == 0) {
            processMonitorInfo.e = getLastKillProcessTime();
            DfxMonitorCenter.c();
            return false;
        }
        if (processMonitorInfo.f == 0) {
            processMonitorInfo.f = j;
            processMonitorInfo.f5878b = false;
            return false;
        }
        if (!processMonitorInfo.f5878b && (j2 > processMonitorInfo.i.d() || j - processMonitorInfo.f > 300000)) {
            processMonitorInfo.f5878b = true;
            ReleaseLogUtil.c(this.mTag, "memory over kill threshold need run gc, pss = ", Long.valueOf(j2));
            DfxMonitorCenter.c();
            return false;
        }
        if (BaseApplication.h()) {
            return false;
        }
        if (processMonitorInfo.f5879c) {
            return true;
        }
        processMonitorInfo.f5879c = true;
        ReleaseLogUtil.c(this.mTag, "memory over kill threshold need dump hprof data", ", pss = ", Long.valueOf(j2));
        saveDumpMemoryInfo(memoryInfo, j, "memory over kill threshold need dump hprof data", false);
        DfxBaseHandler.dumpHprofData(this.mTag, null);
        return false;
    }

    protected final long getLastKillProcessTime() {
        SharedPreferences sharedPreferences = BaseApplication.b().getSharedPreferences(getSaveFileName(), 0);
        long j = sharedPreferences != null ? sharedPreferences.getLong(LAST_KILL_PROCESS_TIME, -1L) : -1L;
        ReleaseLogUtil.c(this.mTag, " getLastKillProcessTime = ", Long.valueOf(j));
        return j;
    }

    protected final void setLastKillProcessTime(long j) {
        ReleaseLogUtil.c(this.mTag, "setLastKillProcessTime = ", Long.valueOf(j));
        SharedPreferences.Editor editorEdit = BaseApplication.b().getSharedPreferences(getSaveFileName(), 0).edit();
        if (editorEdit != null) {
            editorEdit.putLong(LAST_KILL_PROCESS_TIME, j);
            editorEdit.commit();
        }
    }

    private String getSaveFileName() {
        return DfxUtils.d("_crash");
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class ProcessMonitorInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f5877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f5878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f5879c;
        long d;
        long e;
        long f;
        long g;
        int h;
        final MemoryMonitorConfig i;
        long j;

        ProcessMonitorInfo(MemoryMonitorConfig memoryMonitorConfig) {
            this.i = memoryMonitorConfig;
        }

        void b() {
            this.j = 0L;
            this.f5879c = false;
        }

        void d() {
            this.f = 0L;
            this.f5879c = false;
        }
    }
}
