package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;

/* JADX INFO: loaded from: classes2.dex */
public final class EventStoreModule_SchemaVersionFactory implements Factory<Integer> {

    public static final class a {
        private static final EventStoreModule_SchemaVersionFactory a = new EventStoreModule_SchemaVersionFactory();

        private a() {
        }
    }

    public static EventStoreModule_SchemaVersionFactory create() {
        return a.a;
    }

    public static int schemaVersion() {
        return EventStoreModule.e();
    }

    @Override // javax.inject.Provider
    public Integer get() {
        return Integer.valueOf(schemaVersion());
    }
}
