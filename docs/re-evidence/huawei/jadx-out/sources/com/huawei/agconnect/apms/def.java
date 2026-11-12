package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.log.AgentLog;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class def {
    public static void abc(Throwable th, StringBuilder sb, AgentLog agentLog) {
        sb.append(th.getMessage());
        agentLog.warn(sb.toString());
    }
}
