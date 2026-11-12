package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class f implements SQLiteEventStore.Function, SQLiteEventStore.Producer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f52866b;

    public /* synthetic */ f(Object obj, int i14) {
        this.f52865a = i14;
        this.f52866b = obj;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public Object apply(Object obj) {
        return SQLiteEventStore.lambda$loadMetadata$16((HashMap) this.f52866b, (Cursor) obj);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer
    public Object produce() {
        switch (this.f52865a) {
            case 1:
                return SQLiteEventStore.lambda$ensureBeginTransaction$24((SQLiteDatabase) this.f52866b);
            default:
                return ((SchemaManager) this.f52866b).getWritableDatabase();
        }
    }
}
