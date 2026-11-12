package com.xiaomi.smarthome.library.common.threadpool;

import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes2.dex */
public class StatisticalRejectedExecutionPolicy implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        MiJiaLog.writeLogOnAll(LogType.SERIOUS_EXCEPTION, "rejectedExecution", threadPoolExecutor.toString());
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + "\n");
        }
        MiJiaLog.writeLogOnAll(LogType.SERIOUS_EXCEPTION, "发生rejectedExecution任务的堆栈信息", sb.toString());
    }
}
