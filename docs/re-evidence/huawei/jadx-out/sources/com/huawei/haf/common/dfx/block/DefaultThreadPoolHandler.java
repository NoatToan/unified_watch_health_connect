package com.huawei.haf.common.dfx.block;

import androidx.media3.common.C;
import com.huawei.haf.common.dfx.DfxBaseHandler;
import com.huawei.haf.threadpool.ThreadPoolCallback;
import com.huawei.haf.threadpool.ThreadPoolStateInfo;
import com.huawei.operation.utils.Constants;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class DefaultThreadPoolHandler extends DfxBaseHandler implements ThreadPoolCallback {
    private static volatile int e;

    protected void b(String str, String str2) {
    }

    @Override // com.huawei.haf.threadpool.ThreadPoolCallback
    public boolean isMonitorTask() {
        return true;
    }

    @Override // com.huawei.haf.threadpool.ThreadPoolCallback
    public long minStatisticsTimeInterval() {
        return 5000L;
    }

    @Override // com.huawei.haf.threadpool.ThreadPoolCallback
    public long statisticsTimeInterval() {
        return 120000L;
    }

    static /* synthetic */ int e() {
        int i = e + 1;
        e = i;
        return i;
    }

    public DefaultThreadPoolHandler(String str) {
        super(str, "_threadpoolLog_%d");
    }

    @Override // com.huawei.haf.threadpool.ThreadPoolCallback
    public ThreadMonitorTask createBlockMonitorTask(Thread thread) {
        return new ThreadMonitorTask(thread, new ThreadTaskMonitorHandler(this.mTag));
    }

    @Override // com.huawei.haf.threadpool.ThreadPoolCallback
    public void threadPoolStateInfo(String str, ThreadPoolStateInfo threadPoolStateInfo, long j) {
        String strA = a(str, threadPoolStateInfo);
        ReleaseLogUtil.c(this.mTag, strA);
        if (threadPoolStateInfo.d() < threadPoolStateInfo.j()) {
            return;
        }
        StringBuilder sb = new StringBuilder(512);
        fillSaveBaseInfo(sb, null, null, j, null);
        sb.append(strA);
        sb.append(System.lineSeparator());
        String string = sb.toString();
        b(str, string);
        d(string);
    }

    private void d(String str) {
        if (saveInfo(str, getSaveFile())) {
            return;
        }
        LogUtil.e(this.mTag, "saveThreadPoolInfo fail.");
    }

    private String a(String str, ThreadPoolStateInfo threadPoolStateInfo) {
        StringBuilder sb = new StringBuilder(256);
        sb.append(str);
        sb.append(", state{[");
        sb.append(threadPoolStateInfo.j());
        sb.append(", ");
        sb.append(threadPoolStateInfo.e());
        sb.append(", ");
        sb.append(threadPoolStateInfo.c());
        sb.append("], poolSize=");
        sb.append(threadPoolStateInfo.h());
        sb.append(", activeCount=");
        sb.append(threadPoolStateInfo.d());
        sb.append(", runNum=");
        sb.append(threadPoolStateInfo.m());
        sb.append(", waitNum=(");
        sb.append(threadPoolStateInfo.o());
        sb.append(", ");
        sb.append(threadPoolStateInfo.b());
        sb.append(", ");
        sb.append(threadPoolStateInfo.g());
        sb.append(Constants.RIGHT_BRACKET_ONLY);
        if (threadPoolStateInfo.i() > 0) {
            sb.append("}, stage{interval=");
            sb.append(threadPoolStateInfo.k());
            sb.append(", cmpNum=");
            sb.append(threadPoolStateInfo.i());
            sb.append(", avgRunTime=");
            sb.append(threadPoolStateInfo.f() / threadPoolStateInfo.i());
            sb.append(", maxRunTime=");
            sb.append(threadPoolStateInfo.n());
        }
        if (threadPoolStateInfo.l() > 0) {
            sb.append("}, total{taskCmpNum=");
            sb.append(threadPoolStateInfo.l());
            sb.append(", avgRunTime=");
            sb.append(threadPoolStateInfo.q() / threadPoolStateInfo.l());
            sb.append(", maxRunTime=");
            sb.append(threadPoolStateInfo.a());
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ThreadTaskMonitorHandler extends AbstractMonitorHandler {
        private boolean d;

        protected long e() {
            return 5000L;
        }

        public ThreadTaskMonitorHandler(String str) {
            super(str, "_threadpoolLog_%d");
        }

        @Override // com.huawei.haf.common.dfx.DfxBaseHandler
        public File getSaveFile() {
            return DefaultThreadPoolHandler.this.getSaveFile();
        }

        @Override // com.huawei.haf.common.dfx.block.AbstractMonitorHandler, com.huawei.haf.common.dfx.block.MonitorCallback
        public long monitorTimeInterval() {
            return this.d ? 300000L : 5000L;
        }

        @Override // com.huawei.haf.common.dfx.block.AbstractMonitorHandler, com.huawei.haf.common.dfx.block.MonitorCallback
        public void begin(Thread thread, String str, long j) {
            super.begin(thread, str, j);
            this.d = false;
        }

        @Override // com.huawei.haf.common.dfx.block.MonitorCallback
        public boolean check(Thread thread, long j, long j2) {
            if (j2 <= 0) {
                return false;
            }
            if (!this.d) {
                if (DefaultThreadPoolHandler.e < 10 && j - getBeginTime() >= e()) {
                    saveDumpStackTraceInfo(thread, true);
                    DefaultThreadPoolHandler.e();
                }
                this.d = true;
                return true;
            }
            saveDumpStackTraceInfo(thread, true);
            return false;
        }

        @Override // com.huawei.haf.common.dfx.block.MonitorCallback
        public void end(Thread thread, Throwable th, long j, long j2) {
            long beginTime = j - getBeginTime();
            if (th != null) {
                ReleaseLogUtil.d(this.mTag, e(getMessageInfo(), thread, th, beginTime));
                return;
            }
            if (beginTime < C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS || j2 <= 0) {
                return;
            }
            if (beginTime >= 10000) {
                ReleaseLogUtil.d(this.mTag, e(getMessageInfo(), thread, null, beginTime));
            } else if (beginTime >= 5000) {
                ReleaseLogUtil.c(this.mTag, e(getMessageInfo(), thread, null, beginTime));
            } else if (LogUtil.d()) {
                LogUtil.c(this.mTag, e(getMessageInfo(), thread, null, beginTime));
            }
        }

        private String e(String str, Thread thread, Throwable th, long j) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Time-consuming task(");
            sb.append(j);
            sb.append("ms): thread(");
            sb.append(thread.getName());
            sb.append(", ");
            sb.append(thread.getId());
            sb.append("), ");
            sb.append(str);
            if (th != null) {
                sb.append(", throwable=");
                sb.append(LogUtil.c(th));
            }
            return sb.toString();
        }
    }
}
