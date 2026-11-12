package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.Lazy;
import com.google.android.datatransport.runtime.dagger.internal.DoubleCheck;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteEventStore_Factory implements Factory<SQLiteEventStore> {
    private final Provider<Clock> a;
    private final Provider<Clock> b;
    private final Provider<c> c;
    private final Provider<SchemaManager> d;
    private final Provider<String> e;

    public SQLiteEventStore_Factory(Provider<Clock> provider, Provider<Clock> provider2, Provider<c> provider3, Provider<SchemaManager> provider4, Provider<String> provider5) {
        this.a = provider;
        this.b = provider2;
        this.c = provider3;
        this.d = provider4;
        this.e = provider5;
    }

    public static SQLiteEventStore_Factory create(Provider<Clock> provider, Provider<Clock> provider2, Provider<c> provider3, Provider<SchemaManager> provider4, Provider<String> provider5) {
        return new SQLiteEventStore_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static SQLiteEventStore newInstance(Clock clock, Clock clock2, Object obj, Object obj2, Lazy<String> lazy) {
        return new SQLiteEventStore(clock, clock2, (c) obj, (SchemaManager) obj2, lazy);
    }

    @Override // javax.inject.Provider
    public SQLiteEventStore get() {
        return newInstance(this.a.get(), this.b.get(), this.c.get(), this.d.get(), DoubleCheck.lazy(this.e));
    }
}
