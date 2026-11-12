package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.collect.model.event.network.HttpEvent;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public static ScheduledFuture def;
    public static final AgentLog abc = AgentLogManager.getAgentLog();
    public static final ScheduledExecutorService bcd = Executors.newSingleThreadScheduledExecutor(new m("HttpEventWaitReportQueue"));
    public static final ConcurrentLinkedQueue<Object> cde = new ConcurrentLinkedQueue<>();
    public static final abc efg = new abc();

    public final class abc implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            a aVarN;
            long jCurrentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            for (Object obj : d.cde) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (jCurrentTimeMillis - bVar.lmn > 10000) {
                        arrayList.add(obj);
                        if (!bVar.fed() && (aVarN = bVar.n()) != null) {
                            bVar.l();
                            pon.cde.add(new HttpEvent(aVarN, ""));
                        }
                    }
                } else {
                    d.abc.warn("object is not a state of Http.");
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            d.cde.removeAll(arrayList);
        }
    }

    public static void abc(Object obj) {
        cde.add(obj);
    }

    public static void abc(b bVar) {
        cde.remove(bVar);
    }
}
