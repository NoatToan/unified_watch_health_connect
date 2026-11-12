package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.Binds;
import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import javax.inject.Named;

/* JADX INFO: loaded from: classes2.dex */
@Module
public abstract class EventStoreModule {
    @Provides
    @Named("SQLITE_DB_NAME")
    public static String b() {
        return SchemaManager.c;
    }

    @Provides
    @Named("PACKAGE_NAME")
    public static String d(Context context) {
        return context.getPackageName();
    }

    @Provides
    @Named("SCHEMA_VERSION")
    public static int e() {
        return SchemaManager.s;
    }

    @Provides
    public static c f() {
        return c.f;
    }

    @Binds
    public abstract ClientHealthMetricsStore a(SQLiteEventStore sQLiteEventStore);

    @Binds
    public abstract EventStore c(SQLiteEventStore sQLiteEventStore);

    @Binds
    public abstract SynchronizationGuard g(SQLiteEventStore sQLiteEventStore);
}
