package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.collect.model.event.fps.FpsDropEvent;
import com.huawei.agconnect.apms.collect.model.event.interaction.ActivityLoadEvent;
import com.huawei.agconnect.apms.collect.model.event.interaction.ActivityRenderEvent;
import com.huawei.agconnect.apms.collect.model.event.interaction.AppStartEvent;
import com.huawei.agconnect.apms.collect.model.event.network.HttpEvent;
import com.huawei.agconnect.apms.collect.model.event.webview.WebViewErrorEvent;
import com.huawei.agconnect.apms.collect.model.event.webview.WebViewLoadEvent;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes3.dex */
public final class pon extends srq {
    public static ScheduledFuture def;
    public static final AgentLog abc = AgentLogManager.getAgentLog();
    public static final ScheduledExecutorService bcd = Executors.newSingleThreadScheduledExecutor(new m("CollectQueue"));
    public static final ConcurrentLinkedQueue<Object> cde = new ConcurrentLinkedQueue<>();
    public static final abc efg = new abc();

    public final class abc implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            if (pon.cde.size() == 0) {
                return;
            }
            while (true) {
                ConcurrentLinkedQueue<Object> concurrentLinkedQueue = pon.cde;
                if (concurrentLinkedQueue.isEmpty()) {
                    return;
                }
                try {
                    Object objRemove = concurrentLinkedQueue.remove();
                    if (objRemove instanceof AppStartEvent) {
                        tsr.abc((AppStartEvent) objRemove, tsr.fgh.cde.getAppStartEvents());
                    } else if (objRemove instanceof ActivityLoadEvent) {
                        tsr.abc((ActivityLoadEvent) objRemove, tsr.fgh.cde.getActivityLoadEvents());
                    } else if (objRemove instanceof ActivityRenderEvent) {
                        tsr.abc((ActivityRenderEvent) objRemove, tsr.fgh.cde.getActivityRenderEvents());
                    } else if (objRemove instanceof HttpEvent) {
                        tsr.abc((HttpEvent) objRemove, tsr.fgh.cde.getHttpEvents());
                    } else if (objRemove instanceof WebViewLoadEvent) {
                        tsr.abc((WebViewLoadEvent) objRemove, tsr.fgh.cde.getWebViewLoadEvents());
                    } else if (objRemove instanceof WebViewErrorEvent) {
                        tsr.abc((WebViewErrorEvent) objRemove, tsr.fgh.cde.getWebViewErrorEvents());
                    } else if (objRemove instanceof FpsDropEvent) {
                        tsr.abc((FpsDropEvent) objRemove, tsr.fgh.cde.getFpsDropEvents());
                    }
                } catch (Throwable th) {
                    AgentLog agentLog = pon.abc;
                    StringBuilder sbAbc = com.huawei.agconnect.apms.abc.abc("exception occurred when dequeue events: ");
                    sbAbc.append(th.toString());
                    agentLog.error(sbAbc.toString());
                }
            }
        }
    }

    public static void klm() {
        try {
            bcd.submit(efg).get();
        } catch (InterruptedException e) {
            e = e;
            AgentLog agentLog = abc;
            StringBuilder sbAbc = com.huawei.agconnect.apms.abc.abc("exception occurred when synchronous events: ");
            sbAbc.append(e.toString());
            agentLog.error(sbAbc.toString());
        } catch (ExecutionException e2) {
            e = e2;
            AgentLog agentLog2 = abc;
            StringBuilder sbAbc2 = com.huawei.agconnect.apms.abc.abc("exception occurred when synchronous events: ");
            sbAbc2.append(e.toString());
            agentLog2.error(sbAbc2.toString());
        } catch (Throwable th) {
            AgentLog agentLog3 = abc;
            StringBuilder sbAbc3 = com.huawei.agconnect.apms.abc.abc("exception occurred when synchronous events: ");
            sbAbc3.append(th.toString());
            agentLog3.error(sbAbc3.toString());
        }
    }
}
