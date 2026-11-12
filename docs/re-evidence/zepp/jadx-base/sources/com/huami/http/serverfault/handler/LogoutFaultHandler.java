package com.huami.http.serverfault.handler;

import com.huami.http.serverfault.MonitoringRules;
import com.huami.http.serverfault.MonitoringRulesKt;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/huami/http/serverfault/handler/LogoutFaultHandler;", "Lcom/huami/http/serverfault/handler/ServerFaultHandler;", "", "Lcom/huami/http/serverfault/MonitoringRules;", "getMonitorRules", "()Ljava/util/List;", "monitorRules", "<init>", "()V", "serverfault_release"}, k = 1, mv = {1, 4, 0})
public final class LogoutFaultHandler extends ServerFaultHandler {
    public static final LogoutFaultHandler INSTANCE = new LogoutFaultHandler();

    private LogoutFaultHandler() {
    }

    @Override // com.huami.http.serverfault.handler.ServerFaultHandler
    @NotNull
    public List<MonitoringRules> getMonitorRules() {
        return MonitoringRulesKt.getLogoutUrlRules();
    }
}
