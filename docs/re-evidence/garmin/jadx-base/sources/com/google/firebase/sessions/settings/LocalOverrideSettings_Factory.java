package com.google.firebase.sessions.settings;

import android.content.Context;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import n13.a;

/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
public final class LocalOverrideSettings_Factory implements Factory<LocalOverrideSettings> {
    private final a<Context> appContextProvider;

    public LocalOverrideSettings_Factory(a<Context> aVar) {
        this.appContextProvider = aVar;
    }

    public static LocalOverrideSettings_Factory create(a<Context> aVar) {
        return new LocalOverrideSettings_Factory(aVar);
    }

    public static LocalOverrideSettings newInstance(Context context) {
        return new LocalOverrideSettings(context);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, n13.a
    public LocalOverrideSettings get() {
        return newInstance(this.appContextProvider.get());
    }
}
