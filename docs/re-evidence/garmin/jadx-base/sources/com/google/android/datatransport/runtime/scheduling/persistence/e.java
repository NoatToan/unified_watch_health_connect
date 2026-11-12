package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class e implements SQLiteEventStore.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SQLiteEventStore f52864b;

    public /* synthetic */ e(SQLiteEventStore sQLiteEventStore, int i14) {
        this.f52863a = i14;
        this.f52864b = sQLiteEventStore;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        switch (this.f52863a) {
            case 0:
                return this.f52864b.lambda$resetClientMetrics$23((SQLiteDatabase) obj);
            case 1:
                return this.f52864b.lambda$cleanUp$11((Cursor) obj);
            default:
                return this.f52864b.lambda$recordFailure$3((Cursor) obj);
        }
    }
}
