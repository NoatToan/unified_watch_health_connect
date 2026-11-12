package org.acra.sender;

import android.content.Context;
import androidx.annotation.NonNull;
import org.acra.config.CoreConfiguration;
import org.acra.config.HttpSenderConfiguration;
import org.acra.plugins.HasConfigPlugin;

/* JADX INFO: loaded from: classes23.dex */
public final class HttpSenderFactory extends HasConfigPlugin implements ReportSenderFactory {
    public HttpSenderFactory() {
        super(HttpSenderConfiguration.class);
    }

    @Override // org.acra.sender.ReportSenderFactory
    @NonNull
    public ReportSender create(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration) {
        return new HttpSender(coreConfiguration, null, null);
    }
}
