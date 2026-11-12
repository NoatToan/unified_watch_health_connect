package com.huami.tools.crashreport;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import org.acra.config.CoreConfiguration;
import org.acra.sender.ReportSender;
import org.acra.sender.ReportSenderFactory;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/huami/tools/crashreport/HuamiHttpSenderFactory;", "Lorg/acra/sender/ReportSenderFactory;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lorg/acra/config/CoreConfiguration;", "config", "Lorg/acra/sender/ReportSender;", "create", "", Constants.ENABLED, "<init>", "()V", "crash-report_release"}, k = 1, mv = {1, 4, 0})
public final class HuamiHttpSenderFactory implements ReportSenderFactory {
    @Override // org.acra.sender.ReportSenderFactory
    @NotNull
    public ReportSender create(@NotNull Context context, @NotNull CoreConfiguration config) {
        return new HuamiHttpSender(config);
    }

    @Override // org.acra.plugins.Plugin
    public boolean enabled(@NotNull CoreConfiguration config) {
        return true;
    }
}
