package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements ThreadFactory {
    public static final AgentLog def = AgentLogManager.getAgentLog();
    public static abc efg = new abc();
    public ThreadGroup abc;
    public String bcd;
    public AtomicInteger cde = new AtomicInteger(1);

    public final class abc implements Thread.UncaughtExceptionHandler {
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            AgentLog agentLog = m.def;
            StringBuilder sbAbc = com.huawei.agconnect.apms.abc.abc("uncaught exception ");
            sbAbc.append(th.getMessage());
            sbAbc.append(" occurred in thread [");
            sbAbc.append(thread.getName());
            sbAbc.append("].");
            agentLog.error(sbAbc.toString());
        }
    }

    public m(String str) {
        SecurityManager securityManager = System.getSecurityManager();
        this.abc = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        this.bcd = "APMS_" + str + Constants.LINK;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.abc, runnable, this.bcd + this.cde.getAndIncrement(), 0L);
        thread.setUncaughtExceptionHandler(efg);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
