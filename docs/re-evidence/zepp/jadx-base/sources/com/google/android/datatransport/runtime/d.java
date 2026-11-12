package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory;
import com.google.android.datatransport.runtime.backends.MetadataBackendRegistry_Factory;
import com.google.android.datatransport.runtime.dagger.internal.DoubleCheck;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.InstanceFactory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory;
import com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_PackageNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
final class d extends k {
    private Provider<Executor> a;
    private Provider<Context> b;
    private Provider c;
    private Provider d;
    private Provider e;
    private Provider<String> f;
    private Provider<SQLiteEventStore> g;
    private Provider<SchedulerConfig> h;
    private Provider<WorkScheduler> i;
    private Provider<DefaultScheduler> j;
    private Provider<Uploader> k;
    private Provider<WorkInitializer> l;
    private Provider<TransportRuntime> m;

    public static final class b implements k.a {
        private Context a;

        private b() {
        }

        @Override // com.google.android.datatransport.runtime.k.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(Context context) {
            this.a = (Context) Preconditions.checkNotNull(context);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.k.a
        public k build() {
            Preconditions.checkBuilderRequirement(this.a, Context.class);
            return new d(this.a);
        }
    }

    public static k.a c() {
        return new b();
    }

    private void d(Context context) {
        this.a = DoubleCheck.provider(ExecutionModule_ExecutorFactory.create());
        Factory factoryCreate = InstanceFactory.create(context);
        this.b = factoryCreate;
        CreationContextFactory_Factory creationContextFactory_FactoryCreate = CreationContextFactory_Factory.create(factoryCreate, TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create());
        this.c = creationContextFactory_FactoryCreate;
        this.d = DoubleCheck.provider(MetadataBackendRegistry_Factory.create(this.b, creationContextFactory_FactoryCreate));
        this.e = SchemaManager_Factory.create(this.b, EventStoreModule_DbNameFactory.create(), EventStoreModule_SchemaVersionFactory.create());
        this.f = EventStoreModule_PackageNameFactory.create(this.b);
        this.g = DoubleCheck.provider(SQLiteEventStore_Factory.create(TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), EventStoreModule_StoreConfigFactory.create(), this.e, this.f));
        SchedulingConfigModule_ConfigFactory schedulingConfigModule_ConfigFactoryCreate = SchedulingConfigModule_ConfigFactory.create(TimeModule_EventClockFactory.create());
        this.h = schedulingConfigModule_ConfigFactoryCreate;
        SchedulingModule_WorkSchedulerFactory schedulingModule_WorkSchedulerFactoryCreate = SchedulingModule_WorkSchedulerFactory.create(this.b, this.g, schedulingConfigModule_ConfigFactoryCreate, TimeModule_UptimeClockFactory.create());
        this.i = schedulingModule_WorkSchedulerFactoryCreate;
        Provider<Executor> provider = this.a;
        Provider provider2 = this.d;
        Provider<SQLiteEventStore> provider3 = this.g;
        this.j = DefaultScheduler_Factory.create(provider, provider2, schedulingModule_WorkSchedulerFactoryCreate, provider3, provider3);
        Provider<Context> provider4 = this.b;
        Provider provider5 = this.d;
        Provider<SQLiteEventStore> provider6 = this.g;
        this.k = Uploader_Factory.create(provider4, provider5, provider6, this.i, this.a, provider6, TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), this.g);
        Provider<Executor> provider7 = this.a;
        Provider<SQLiteEventStore> provider8 = this.g;
        this.l = WorkInitializer_Factory.create(provider7, provider8, this.i, provider8);
        this.m = DoubleCheck.provider(TransportRuntime_Factory.create(TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), this.j, this.k, this.l));
    }

    @Override // com.google.android.datatransport.runtime.k
    public EventStore a() {
        return this.g.get();
    }

    @Override // com.google.android.datatransport.runtime.k
    public TransportRuntime b() {
        return this.m.get();
    }

    private d(Context context) {
        d(context);
    }
}
