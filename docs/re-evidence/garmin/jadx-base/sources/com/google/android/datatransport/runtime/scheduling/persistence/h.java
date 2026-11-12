package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class h implements SQLiteEventStore.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f52871b;

    public /* synthetic */ h(long j8, int i14) {
        this.f52870a = i14;
        this.f52871b = j8;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        switch (this.f52870a) {
            case 0:
                return SQLiteEventStore.lambda$getTimeWindow$22(this.f52871b, (SQLiteDatabase) obj);
            default:
                return SQLiteEventStore.lambda$getTimeWindow$21(this.f52871b, (Cursor) obj);
        }
    }
}
