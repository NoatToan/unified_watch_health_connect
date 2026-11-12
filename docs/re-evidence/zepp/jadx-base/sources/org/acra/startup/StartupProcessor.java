package org.acra.startup;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.List;
import org.acra.config.CoreConfiguration;
import org.acra.plugins.Plugin;

/* JADX INFO: loaded from: classes23.dex */
public interface StartupProcessor extends Plugin {
    void processReports(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration, List<Report> list);
}
