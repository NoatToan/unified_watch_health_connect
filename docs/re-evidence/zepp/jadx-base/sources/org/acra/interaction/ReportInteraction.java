package org.acra.interaction;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.File;
import org.acra.config.CoreConfiguration;
import org.acra.plugins.Plugin;

/* JADX INFO: loaded from: classes23.dex */
public interface ReportInteraction extends Plugin {
    boolean performInteraction(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull File file);
}
