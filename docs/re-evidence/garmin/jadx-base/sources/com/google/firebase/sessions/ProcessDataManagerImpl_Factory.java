package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
public final class ProcessDataManagerImpl_Factory implements Factory<ProcessDataManagerImpl> {
    private final n13.a<Context> appContextProvider;
    private final n13.a<UuidGenerator> uuidGeneratorProvider;

    public ProcessDataManagerImpl_Factory(n13.a<Context> aVar, n13.a<UuidGenerator> aVar2) {
        this.appContextProvider = aVar;
        this.uuidGeneratorProvider = aVar2;
    }

    public static ProcessDataManagerImpl_Factory create(n13.a<Context> aVar, n13.a<UuidGenerator> aVar2) {
        return new ProcessDataManagerImpl_Factory(aVar, aVar2);
    }

    public static ProcessDataManagerImpl newInstance(Context context, UuidGenerator uuidGenerator) {
        return new ProcessDataManagerImpl(context, uuidGenerator);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, n13.a
    public ProcessDataManagerImpl get() {
        return newInstance(this.appContextProvider.get(), this.uuidGeneratorProvider.get());
    }
}
