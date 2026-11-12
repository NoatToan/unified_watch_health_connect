package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;

/* JADX INFO: loaded from: classes3.dex */
public final class cba {
    public static final AgentLog cde = AgentLogManager.getAgentLog();
    public dcb abc = new dcb();
    public boolean bcd;

    public static final class abc {
        public static final cba abc = new cba();
    }

    public cba() {
        cde.debug("init FrameTraceManager");
    }
}
