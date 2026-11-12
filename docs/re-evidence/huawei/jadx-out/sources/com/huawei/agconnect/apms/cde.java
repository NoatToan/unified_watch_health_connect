package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.log.AgentLog;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cde {
    public static void abc(IOException iOException, StringBuilder sb, AgentLog agentLog) {
        sb.append(iOException.getMessage());
        agentLog.warn(sb.toString());
    }
}
