package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.TransportContext;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class d implements SQLiteEventStore.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52860a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f52861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52862c;

    public /* synthetic */ d(TransportContext transportContext, long j8) {
        this.f52861b = j8;
        this.f52862c = transportContext;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        switch (this.f52860a) {
            case 0:
                return SQLiteEventStore.lambda$recordNextCallTime$7(this.f52861b, (TransportContext) this.f52862c, (SQLiteDatabase) obj);
            default:
                return ((SQLiteEventStore) this.f52862c).lambda$cleanUp$12(this.f52861b, (SQLiteDatabase) obj);
        }
    }

    public /* synthetic */ d(SQLiteEventStore sQLiteEventStore, long j8) {
        this.f52862c = sQLiteEventStore;
        this.f52861b = j8;
    }
}
