package com.huawei.agconnect.apms;

import android.os.FileObserver;
import com.huawei.agconnect.apms.log.AgentLog;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends klm {
    public static h fgh;
    public long efg = 0;

    public final class abc extends FileObserver {
        public abc() {
            super("/data/anr/", 8);
        }

        @Override // android.os.FileObserver
        public final void onEvent(int i, String str) {
            if (str == null) {
                return;
            }
            try {
                if (("/data/anr/" + str).contains("trace")) {
                    h hVar = h.this;
                    hVar.getClass();
                    if (Agent.isDisabled()) {
                        return;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - hVar.efg >= 30000 && hVar.abc()) {
                        hVar.efg = jCurrentTimeMillis;
                    }
                }
            } catch (Exception e) {
                AgentLog agentLog = klm.def;
                StringBuilder sbAbc = com.huawei.agconnect.apms.abc.abc("failed to observer anr file, ");
                sbAbc.append(e.getMessage());
                agentLog.error(sbAbc.toString());
            }
        }
    }

    public h() {
        this.bcd = new HashSet();
    }

    public final void abc(boolean z) {
        if (Agent.isDisabled() || !z) {
            klm.def.warn("APMS agent or anr monitor is disabled, please enable.");
        }
    }
}
