package org.acra.config;

import android.content.Context;
import androidx.annotation.NonNull;
import defpackage.l16;

/* JADX INFO: loaded from: classes23.dex */
public class HttpSenderConfigurationBuilderFactory implements ConfigurationBuilderFactory {
    @Override // org.acra.config.ConfigurationBuilderFactory
    @NonNull
    public ConfigurationBuilder create(@NonNull Context context) {
        return new a(context);
    }

    @Override // org.acra.plugins.Plugin
    public /* synthetic */ boolean enabled(CoreConfiguration coreConfiguration) {
        return l16.a(this, coreConfiguration);
    }
}
