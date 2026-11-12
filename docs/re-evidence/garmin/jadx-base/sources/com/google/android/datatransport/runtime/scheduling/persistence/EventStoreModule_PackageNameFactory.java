package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: classes13.dex */
@QualifierMetadata({"javax.inject.Named"})
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
public final class EventStoreModule_PackageNameFactory implements Factory<String> {
    private final n13.a<Context> contextProvider;

    public EventStoreModule_PackageNameFactory(n13.a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static EventStoreModule_PackageNameFactory create(n13.a<Context> aVar) {
        return new EventStoreModule_PackageNameFactory(aVar);
    }

    public static String packageName(Context context) {
        return (String) Preconditions.checkNotNullFromProvides(EventStoreModule.packageName(context));
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, n13.a
    public String get() {
        return packageName(this.contextProvider.get());
    }
}
