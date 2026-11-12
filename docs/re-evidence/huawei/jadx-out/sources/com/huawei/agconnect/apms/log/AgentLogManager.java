package com.huawei.agconnect.apms.log;

import com.huawei.agconnect.apms.kji;

/* JADX INFO: loaded from: classes2.dex */
public class AgentLogManager {
    private static kji instance = new kji();

    public static AgentLog getAgentLog() {
        return instance;
    }
}
