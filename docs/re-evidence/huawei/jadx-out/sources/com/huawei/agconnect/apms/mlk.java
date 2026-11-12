package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.anr.NativeHandler;
import com.huawei.agconnect.apms.collect.HiAnalyticsManager;
import com.huawei.agconnect.apms.collect.model.CollectData;
import com.huawei.agconnect.apms.collect.model.EventType;
import com.huawei.agconnect.apms.collect.model.HeaderType;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes3.dex */
public final class mlk {
    public static final AgentLog hij = AgentLogManager.getAgentLog();
    public boolean bcd;
    public hij cde;
    public CollectData efg;
    public abc ghi;
    public int abc = 1;
    public rqp def = rqp.abc();
    public final ArrayList fgh = new ArrayList();

    public final class abc implements lmn {
        public abc() {
        }

        @Override // com.huawei.agconnect.apms.lmn
        public final void abc() {
            mlk.this.bcd();
        }
    }

    public final void abc() {
        if (Agent.isDisabled()) {
            hij.info("Collector: APMS has been disabled, skipping data collection.");
        } else {
            AgentLog agentLog = hij;
            StringBuilder sbAbc = com.huawei.agconnect.apms.abc.abc("Collector: sending [");
            sbAbc.append(this.efg.getAppStartEvents().count());
            sbAbc.append("] AppStart events.");
            agentLog.debug(sbAbc.toString());
            agentLog.debug("Collector: sending [" + this.efg.getActivityLoadEvents().count() + "] ActivityLoad events.");
            agentLog.debug("Collector: sending [" + this.efg.getActivityRenderEvents().count() + "] ActivityRender events.");
            agentLog.debug("Collector: sending [" + this.efg.getHttpEvents().count() + "] Http events.");
            agentLog.debug("Collector: sending [" + this.efg.getWebViewLoadEvents().count() + "] WebViewLoad events.");
            agentLog.debug("Collector: sending [" + this.efg.getWebViewErrorEvents().count() + "] WebViewError events.");
            agentLog.debug("Collector: sending [" + this.efg.getFpsDropEvents().count() + "] FpsDrop events.");
            if (this.efg.getEventCount() > 0) {
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                linkedHashMap.put(HeaderType.AGENT_VERSION, Agent.getVersion());
                linkedHashMap.put("type", Agent.NAME);
                linkedHashMap.put(HeaderType.USER_IDENTIFIER, Agent.getUserIdentifier());
                if (this.efg.getDeviceInformation() != null) {
                    linkedHashMap.put("device", this.efg.getDeviceInformation().toJsonString());
                }
                if (this.efg.getPlatformInformation() != null) {
                    linkedHashMap.put("platform", this.efg.getPlatformInformation().toJsonString());
                }
                if (this.efg.getUserSettingsInformation() != null) {
                    linkedHashMap.put(EventType.USER_SETTINGS, this.efg.getUserSettingsInformation().toJsonString());
                }
                if (this.efg.getApplicationInformation() != null) {
                    linkedHashMap.put("app", this.efg.getApplicationInformation().toJsonString());
                }
                linkedHashMap.put(EventType.APP_START, this.efg.getAppStartEvents().toJsonString());
                linkedHashMap.put(EventType.ACTIVITY_LOAD, this.efg.getActivityLoadEvents().toJsonString());
                linkedHashMap.put(EventType.ACTIVITY_RENDER, this.efg.getActivityRenderEvents().toJsonString());
                linkedHashMap.put(EventType.NATIVE_HTTP, this.efg.getHttpEvents().toJsonString());
                linkedHashMap.put(EventType.WEB_VIEW_LOAD, this.efg.getWebViewLoadEvents().toJsonString());
                linkedHashMap.put(EventType.WEB_VIEW_ERROR, this.efg.getWebViewErrorEvents().toJsonString());
                linkedHashMap.put(EventType.FPS_DROP, this.efg.getFpsDropEvents().toJsonString());
                HiAnalyticsManager.getInstance().onEvent(HiAnalyticsManager.APM_EVENT_ID, linkedHashMap);
            }
        }
        try {
            Iterator it = cde().iterator();
            while (it.hasNext()) {
                ((qpo) it.next()).abc();
            }
        } catch (Throwable th) {
            bcd.abc(th, com.huawei.agconnect.apms.abc.abc("exception occurred while notifying onCollectComplete: "), hij);
        }
        this.efg.reset();
    }

    public final void bcd() {
        this.bcd = false;
        try {
            int i = this.abc;
            if (i == 1) {
                if (this.cde == null) {
                    hij.error("APMS configuration is unavailable.");
                    return;
                } else {
                    abc(2);
                    bcd();
                    return;
                }
            }
            if (i == 2) {
                try {
                    Iterator it = cde().iterator();
                    while (it.hasNext()) {
                        ((qpo) it.next()).cde();
                    }
                } catch (Throwable th) {
                    hij.error("exception occurred while notifying onCollectBefore: " + th.getMessage());
                }
                if (this.def == null) {
                    rqp rqpVarAbc = rqp.abc();
                    this.def = rqpVarAbc;
                    tsr.abc(rqpVarAbc);
                }
                if (this.efg.isValid()) {
                    try {
                        Iterator it2 = cde().iterator();
                        while (it2.hasNext()) {
                            ((qpo) it2.next()).bcd();
                        }
                    } catch (Throwable th2) {
                        hij.error("exception occurred while notifying onCollectConnected: " + th2.getMessage());
                    }
                    abc(3);
                    bcd();
                    return;
                }
                this.efg.setValid(true);
                try {
                    Iterator it3 = cde().iterator();
                    while (it3.hasNext()) {
                        ((qpo) it3.next()).bcd();
                    }
                } catch (Throwable th3) {
                    hij.error("exception occurred while notifying onCollectConnected: " + th3.getMessage());
                }
                abc(3);
                return;
            }
            if (i == 3) {
                pon.klm();
                try {
                    Iterator it4 = cde().iterator();
                    while (it4.hasNext()) {
                        ((qpo) it4.next()).cde();
                    }
                } catch (Throwable th4) {
                    hij.error("exception occurred while notifying onCollectBefore: " + th4.getMessage());
                }
                def();
                efg();
                abc();
                return;
            }
            if (i != 4) {
                throw new IllegalStateException();
            }
            tsr tsrVar = tsr.fgh;
            if (tsrVar != null) {
                nml nmlVar = tsrVar.bcd;
                if (nmlVar == null) {
                    tsr.efg.warn("the collect timer is null, can not stop timer.");
                } else if (nmlVar.bcd != null) {
                    try {
                        nmlVar.fgh.lock();
                        ScheduledFuture scheduledFuture = nmlVar.bcd;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(true);
                            nmlVar.bcd = null;
                        }
                        nmlVar.fgh.unlock();
                        nml.ghi.debug("collector stopped.");
                        nmlVar.def.ghi();
                    } catch (Throwable th5) {
                        nmlVar.fgh.unlock();
                        throw th5;
                    }
                }
            }
            try {
                Iterator it5 = cde().iterator();
                while (it5.hasNext()) {
                    ((qpo) it5.next()).fgh();
                }
                return;
            } catch (Throwable th6) {
                hij.error("exception occurred while notifying onCollectDisabled: " + th6.getMessage());
                return;
            }
            bcd.abc(th, com.huawei.agconnect.apms.abc.abc("exception occurred while collecting: "), hij);
        } catch (Throwable th7) {
            bcd.abc(th7, com.huawei.agconnect.apms.abc.abc("exception occurred while collecting: "), hij);
        }
    }

    public final ArrayList cde() {
        return new ArrayList(this.fgh);
    }

    public final void def() {
        try {
            Iterator it = cde().iterator();
            while (it.hasNext()) {
                ((qpo) it.next()).ghi();
            }
        } catch (Throwable th) {
            bcd.abc(th, com.huawei.agconnect.apms.abc.abc("exception occurred while notifying onCollect: "), hij);
        }
    }

    public final void efg() {
        try {
            Iterator it = cde().iterator();
            while (it.hasNext()) {
                ((qpo) it.next()).efg();
            }
        } catch (Throwable th) {
            bcd.abc(th, com.huawei.agconnect.apms.abc.abc("exception occurred while notifying onCollectFinalize: "), hij);
        }
    }

    public final void fgh() {
        try {
            Iterator it = cde().iterator();
            while (it.hasNext()) {
                ((qpo) it.next()).hij();
            }
        } catch (Throwable th) {
            bcd.abc(th, com.huawei.agconnect.apms.abc.abc("exception occurred while notifying onCollectStart: "), hij);
        }
        if (this.ghi == null) {
            this.ghi = new abc();
            if (NativeHandler.efg == null) {
                NativeHandler.efg = new NativeHandler();
            }
            NativeHandler nativeHandler = NativeHandler.efg;
            abc abcVar = this.ghi;
            synchronized (nativeHandler.abc) {
                HashSet hashSet = nativeHandler.bcd;
                if (hashSet != null) {
                    hashSet.add(abcVar);
                }
            }
        }
    }

    public final void ghi() {
        try {
            Iterator it = cde().iterator();
            while (it.hasNext()) {
                ((qpo) it.next()).def();
            }
        } catch (Throwable th) {
            bcd.abc(th, com.huawei.agconnect.apms.abc.abc("exception occurred while notifying onCollectStop: "), hij);
        }
        if (this.ghi != null) {
            if (NativeHandler.efg == null) {
                NativeHandler.efg = new NativeHandler();
            }
            NativeHandler nativeHandler = NativeHandler.efg;
            abc abcVar = this.ghi;
            synchronized (nativeHandler.abc) {
                HashSet hashSet = nativeHandler.bcd;
                if (hashSet != null) {
                    hashSet.remove(abcVar);
                }
            }
            this.ghi = null;
        }
    }

    public final void abc(int i) {
        int i2;
        if (this.bcd || (i2 = this.abc) == i) {
            return;
        }
        int i3 = 0;
        if (i2 == 1) {
            int[] iArr = {2, i, 3, 4};
            while (true) {
                if (i3 < 4) {
                    if (i == iArr[i3]) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } else if (i2 == 2) {
            int[] iArr2 = {1, 3, 4};
            while (true) {
                if (i3 < 3) {
                    if (i == iArr2[i3]) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } else if (i2 == 3) {
            int[] iArr3 = {2, 4};
            while (true) {
                if (i3 < 2) {
                    if (i == iArr3[i3]) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } else {
            throw new IllegalStateException();
        }
        if (this.abc == 3) {
            if (i == 2) {
                try {
                    Iterator it = cde().iterator();
                    while (it.hasNext()) {
                        ((qpo) it.next()).ijk();
                    }
                } catch (Throwable th) {
                    bcd.abc(th, com.huawei.agconnect.apms.abc.abc("exception occurred while notifying onCollectDisconnected: "), hij);
                }
            } else if (i == 4) {
                try {
                    Iterator it2 = cde().iterator();
                    while (it2.hasNext()) {
                        ((qpo) it2.next()).fgh();
                    }
                } catch (Throwable th2) {
                    bcd.abc(th2, com.huawei.agconnect.apms.abc.abc("exception occurred while notifying onCollectDisabled: "), hij);
                }
            }
        }
        this.abc = i;
        this.bcd = true;
    }
}
