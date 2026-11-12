package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes22.dex */
public final class k {
    public static final AgentLog fgh = AgentLogManager.getAgentLog();
    public static k ghi;
    public ScheduledExecutorService abc;
    public Runtime bcd;
    public ScheduledFuture cde = null;
    public long def = -1;
    public ConcurrentLinkedQueue<opq> efg = new ConcurrentLinkedQueue<>();

    public k(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.abc = scheduledExecutorService;
        this.bcd = runtime;
    }

    public static k abc() {
        if (ghi == null) {
            ghi = new k(Executors.newSingleThreadScheduledExecutor(new m("MemoryCollector")), Runtime.getRuntime());
        }
        return ghi;
    }
}
