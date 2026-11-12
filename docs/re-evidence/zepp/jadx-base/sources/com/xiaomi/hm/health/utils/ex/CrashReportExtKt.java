package com.xiaomi.hm.health.utils.ex;

import com.huami.tools.crashreport.HuamiCrashReport;
import kotlin.Metadata;
import org.acra.ACRA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0006"}, d2 = {"Lcom/huami/tools/crashreport/HuamiCrashReport;", "", "error", "", "reportError", "reportManual", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class CrashReportExtKt {
    public static final void reportError(@NotNull HuamiCrashReport huamiCrashReport, @NotNull Throwable th) {
        reportManual(th);
    }

    public static final synchronized void reportManual(@NotNull Throwable th) {
        if (ACRA.isInitialised()) {
            HuamiCrashReport huamiCrashReport = HuamiCrashReport.INSTANCE;
            huamiCrashReport.setEnable(true);
            ACRA.getErrorReporter().putCustomData("IS_MANUAL", "true");
            ACRA.getErrorReporter().handleSilentException(th);
            ACRA.getErrorReporter().removeCustomData("IS_MANUAL");
            huamiCrashReport.setEnable(false);
        }
    }
}
