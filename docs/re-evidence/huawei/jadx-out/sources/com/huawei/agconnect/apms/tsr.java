package com.huawei.agconnect.apms;

import android.os.Looper;
import com.huawei.agconnect.apms.collect.model.CollectData;
import com.huawei.agconnect.apms.collect.model.event.Event;
import com.huawei.agconnect.apms.collect.model.event.Events;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class tsr {
    public static final AgentLog efg = AgentLogManager.getAgentLog();
    public static tsr fgh = new tsr();
    public static final ArrayList ghi = new ArrayList();
    public mlk abc;
    public nml bcd;
    public CollectData cde;
    public rqp def = rqp.abc();

    public static void abc(boolean z) {
        if (abc()) {
            nml nmlVar = fgh.bcd;
            nmlVar.getClass();
            try {
                ScheduledFuture<?> scheduledFutureSchedule = nmlVar.abc.schedule(new nml.abc(nmlVar, z), 0L, TimeUnit.SECONDS);
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    return;
                }
                scheduledFutureSchedule.get();
            } catch (Throwable th) {
                bcd.abc(th, abc.abc("exception occurred while executing tick: "), nml.ghi);
            }
        }
    }

    public static void bcd() {
        tsr tsrVar = fgh;
        if (tsrVar == null) {
            return;
        }
        nml nmlVar = tsrVar.bcd;
        if (nmlVar == null) {
            efg.warn("the collect timer is null, can not stop timer.");
            return;
        }
        if (!vwx.abc().cde.get() && nml.abc()) {
            nml.ghi.debug("collector will start when app in foreground.");
            return;
        }
        if (nmlVar.bcd != null) {
            return;
        }
        if (nmlVar.cde <= 0) {
            nml.ghi.error("refusing to start with period 0 ms.");
            return;
        }
        AgentLog agentLog = nml.ghi;
        StringBuilder sbAbc = abc.abc("starting collector with period ");
        sbAbc.append(nmlVar.cde);
        sbAbc.append("ms.");
        agentLog.debug(sbAbc.toString());
        System.currentTimeMillis();
        try {
            nmlVar.bcd = nmlVar.abc.scheduleAtFixedRate(nmlVar, 0L, nmlVar.cde, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            nml.ghi.error("reporter timer started failed. message: " + th);
        }
        nmlVar.def.fgh();
    }

    public final void abc(hij hijVar) {
        if (this.cde == null) {
            this.cde = new CollectData();
        }
        if (this.abc == null) {
            mlk mlkVar = new mlk();
            this.abc = mlkVar;
            mlkVar.efg = this.cde;
        }
        if (this.bcd == null) {
            this.bcd = new nml(this.abc);
        }
        mlk mlkVar2 = this.abc;
        mlkVar2.cde = hijVar;
        mlkVar2.def = fgh.def;
    }

    public static boolean abc() {
        tsr tsrVar = fgh;
        return (tsrVar == null || tsrVar.abc == null) ? false : true;
    }

    public static void abc(rqp rqpVar) {
        if (!abc()) {
            efg.error("Collector: cannot configure Collector before initialization.");
            return;
        }
        tsr tsrVar = fgh;
        rqp rqpVar2 = tsrVar.def;
        rqpVar2.getClass();
        rqpVar2.abc = rqpVar.abc;
        rqpVar2.bcd = rqpVar.bcd;
        rqpVar2.cde = rqpVar.cde;
        rqpVar2.def = rqpVar.def;
        rqpVar2.efg = rqpVar.efg;
        tsrVar.bcd.cde = TimeUnit.MILLISECONDS.convert(tsrVar.def.abc, TimeUnit.SECONDS);
        tsrVar.abc.def = tsrVar.def;
    }

    public static <T extends Event> void abc(T t, Events<T> events) {
        if (abc() && 4 == fgh.abc.abc) {
            return;
        }
        int i = fgh.def.bcd;
        if (events.count() >= i) {
            efg.debug("Collector: events count limitation " + i + " reached, " + t.getClass().getSimpleName() + " dropped.");
            return;
        }
        events.add(t);
        AgentLog agentLog = efg;
        StringBuilder sbAbc = abc.abc("Collector: now contains [");
        sbAbc.append(events.count());
        sbAbc.append("] ");
        sbAbc.append(t.getClass().getSimpleName());
        agentLog.debug(sbAbc.toString());
    }
}
