package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class EventStoreModule_DbNameFactory implements Factory<String> {

    public static final class a {
        private static final EventStoreModule_DbNameFactory a = new EventStoreModule_DbNameFactory();

        private a() {
        }
    }

    public static EventStoreModule_DbNameFactory create() {
        return a.a;
    }

    public static String dbName() {
        return (String) Preconditions.checkNotNull(EventStoreModule.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public String get() {
        return dbName();
    }
}
