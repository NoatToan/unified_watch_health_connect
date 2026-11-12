package com.google.firebase.sessions;

import com.google.android.datatransport.TransportFactory;
import com.google.firebase.inject.Provider;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
public final class EventGDTLogger_Factory implements Factory<EventGDTLogger> {
    private final n13.a<Provider<TransportFactory>> transportFactoryProvider;

    public EventGDTLogger_Factory(n13.a<Provider<TransportFactory>> aVar) {
        this.transportFactoryProvider = aVar;
    }

    public static EventGDTLogger_Factory create(n13.a<Provider<TransportFactory>> aVar) {
        return new EventGDTLogger_Factory(aVar);
    }

    public static EventGDTLogger newInstance(Provider<TransportFactory> provider) {
        return new EventGDTLogger(provider);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, n13.a
    public EventGDTLogger get() {
        return newInstance(this.transportFactoryProvider.get());
    }
}
