package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.log.AgentLog;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bcd {
    public static void abc(Throwable th, StringBuilder sb, AgentLog agentLog) {
        sb.append(th.getMessage());
        agentLog.error(sb.toString());
    }
}
