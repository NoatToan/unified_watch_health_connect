package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: classes13.dex */
@QualifierMetadata({"javax.inject.Named"})
@ScopeMetadata
@DaggerGenerated
public final class SchemaManager_Factory implements Factory<SchemaManager> {
    private final n13.a<Context> contextProvider;
    private final n13.a<String> dbNameProvider;
    private final n13.a<Integer> schemaVersionProvider;

    public SchemaManager_Factory(n13.a<Context> aVar, n13.a<String> aVar2, n13.a<Integer> aVar3) {
        this.contextProvider = aVar;
        this.dbNameProvider = aVar2;
        this.schemaVersionProvider = aVar3;
    }

    public static SchemaManager_Factory create(n13.a<Context> aVar, n13.a<String> aVar2, n13.a<Integer> aVar3) {
        return new SchemaManager_Factory(aVar, aVar2, aVar3);
    }

    public static SchemaManager newInstance(Context context, String str, int i14) {
        return new SchemaManager(context, str, i14);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, n13.a
    public SchemaManager get() {
        return newInstance(this.contextProvider.get(), this.dbNameProvider.get(), this.schemaVersionProvider.get().intValue());
    }
}
