package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class EventStoreModule_StoreConfigFactory implements Factory<c> {

    public static final class a {
        private static final EventStoreModule_StoreConfigFactory a = new EventStoreModule_StoreConfigFactory();

        private a() {
        }
    }

    public static EventStoreModule_StoreConfigFactory create() {
        return a.a;
    }

    public static c storeConfig() {
        return (c) Preconditions.checkNotNull(EventStoreModule.f(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public c get() {
        return storeConfig();
    }
}
