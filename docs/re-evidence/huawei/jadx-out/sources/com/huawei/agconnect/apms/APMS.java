package com.huawei.agconnect.apms;

import android.content.Context;
import android.os.Bundle;
import com.huawei.agconnect.apms.collect.HiAnalyticsManager;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class APMS {
    private static volatile APMS apmsInstance;
    private static final AgentLog LOG = AgentLogManager.getAgentLog();
    private static final hij AGENT_CONFIGURATION = new hij();
    private static boolean hasInit = false;

    private APMS() {
    }

    public static APMS getInstance() {
        if (apmsInstance == null) {
            synchronized (APMS.class) {
                if (apmsInstance == null) {
                    apmsInstance = new APMS();
                }
            }
        }
        return apmsInstance;
    }

    private boolean isInstrumented() {
        return false;
    }

    public void disableAppVersions(String str) {
        Agent.disableAppVersions(str);
    }

    public void enableAnrMonitor(boolean z) {
        Agent.enableAnrMonitor(z);
    }

    public void enableCollection(boolean z) {
        Agent.enableCollection(z);
    }

    public void enableCollectionByUser(boolean z) {
        Agent.enableCollectionByUser(z);
    }

    public void enableFpsDropTracer(boolean z) {
        Agent.enableFpsDropTracer(z);
    }

    public void enableNuwaTracer(boolean z) {
        Agent.enableNuwaTracer(z);
    }

    public void enableWebViewMonitor(boolean z) {
        Agent.enableWebViewMonitor(z);
    }

    public void onEvent(String str, Map<String, String> map) {
        Agent.onEvent(str, map);
    }

    public void onReport() {
        Agent.onReport();
    }

    public void setCollectionUrl(String str) {
        setCollectionUrlAndEnableUUID(str, true);
    }

    public void setCollectionUrlAndEnableUUID(String str, boolean z) {
        HiAnalyticsManager.getInstance().setCollectionUrlAndEnableUUID(str, z);
    }

    public void setFpsDropThreshold(int i) {
        Agent.setFpsDropCount(i);
    }

    public void setUserIdentifier(String str) {
        Agent.setUserIdentifier(str);
    }

    public void start(Context context) {
        l lVar;
        l lVar2;
        if (hasInit) {
            LOG.debug("APMS has already been initialized.");
            return;
        }
        synchronized (l.class) {
            if (l.cde == null) {
                l.cde = new l();
            }
            lVar = l.cde;
        }
        lVar.getClass();
        Bundle bundle = new Bundle();
        if (context != null) {
            try {
                bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            } catch (Throwable th) {
                l.bcd.warn(String.format(Locale.ENGLISH, "failed to load meta data: %s", th.getMessage()));
            }
        }
        lVar.abc = bundle;
        try {
            synchronized (l.class) {
                if (l.cde == null) {
                    l.cde = new l();
                }
                lVar2 = l.cde;
            }
            Bundle bundle2 = lVar2.abc;
            boolean z = false;
            if (bundle2 != null) {
                try {
                    z = bundle2.getBoolean("apms_debug_log_enabled", false);
                } catch (Throwable th2) {
                    l.bcd.error(th2.getMessage());
                }
            }
            LOG.setLevel(z ? 3 : 4);
            hij hijVar = AGENT_CONFIGURATION;
            AgentLog agentLog = fgh.klm;
            HiAnalyticsManager.getInstance().setContext(context);
            Agent.getExecutor().execute(new efg(context, hijVar));
            hasInit = true;
        } catch (Throwable th3) {
            bcd.abc(th3, abc.abc("error occurred while initialize APMS: "), LOG);
        }
    }

    public void startCollectCpuAndMemoryData(int i) {
        Agent.startCollectCpuAndMemoryData(i);
    }

    public String stopCollectCpuAndMemoryData() {
        return Agent.stopCollectCpuAndMemoryData();
    }
}
