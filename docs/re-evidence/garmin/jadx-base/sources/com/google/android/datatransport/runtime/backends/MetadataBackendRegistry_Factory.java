package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import n13.a;

/* JADX INFO: loaded from: classes13.dex */
@QualifierMetadata
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
public final class MetadataBackendRegistry_Factory implements Factory<MetadataBackendRegistry> {
    private final a<Context> applicationContextProvider;
    private final a<CreationContextFactory> creationContextFactoryProvider;

    public MetadataBackendRegistry_Factory(a<Context> aVar, a<CreationContextFactory> aVar2) {
        this.applicationContextProvider = aVar;
        this.creationContextFactoryProvider = aVar2;
    }

    public static MetadataBackendRegistry_Factory create(a<Context> aVar, a<CreationContextFactory> aVar2) {
        return new MetadataBackendRegistry_Factory(aVar, aVar2);
    }

    public static MetadataBackendRegistry newInstance(Context context, Object obj) {
        return new MetadataBackendRegistry(context, (CreationContextFactory) obj);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, n13.a
    public MetadataBackendRegistry get() {
        return newInstance(this.applicationContextProvider.get(), this.creationContextFactoryProvider.get());
    }
}
