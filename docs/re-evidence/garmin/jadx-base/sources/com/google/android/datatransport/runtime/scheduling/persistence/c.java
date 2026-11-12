package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.TransportContext;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class c implements SQLiteEventStore.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SQLiteEventStore f52858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52859c;

    public /* synthetic */ c(SQLiteEventStore sQLiteEventStore, Object obj, int i14) {
        this.f52857a = i14;
        this.f52858b = sQLiteEventStore;
        this.f52859c = obj;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        switch (this.f52857a) {
            case 0:
                return this.f52858b.lambda$hasPendingEventsFor$6((TransportContext) this.f52859c, (SQLiteDatabase) obj);
            case 1:
                return this.f52858b.lambda$loadBatch$8((TransportContext) this.f52859c, (SQLiteDatabase) obj);
            default:
                return this.f52858b.lambda$recordFailure$4((String) this.f52859c, "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", (SQLiteDatabase) obj);
        }
    }
}
