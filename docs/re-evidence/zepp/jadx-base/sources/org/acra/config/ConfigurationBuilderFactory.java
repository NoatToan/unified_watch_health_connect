package org.acra.config;

import android.content.Context;
import androidx.annotation.NonNull;
import org.acra.plugins.Plugin;

/* JADX INFO: loaded from: classes23.dex */
public interface ConfigurationBuilderFactory extends Plugin {
    @NonNull
    ConfigurationBuilder create(@NonNull Context context);
}
