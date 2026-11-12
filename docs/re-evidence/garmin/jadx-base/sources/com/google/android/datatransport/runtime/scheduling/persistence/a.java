package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements SQLiteEventStore.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SQLiteEventStore f52853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f52855d;

    public /* synthetic */ a(SQLiteEventStore sQLiteEventStore, Object obj, Object obj2, int i14) {
        this.f52852a = i14;
        this.f52853b = sQLiteEventStore;
        this.f52854c = obj;
        this.f52855d = obj2;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        switch (this.f52852a) {
            case 0:
                return this.f52853b.lambda$loadClientMetrics$20("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", (HashMap) this.f52854c, (ClientMetrics.Builder) this.f52855d, (SQLiteDatabase) obj);
            case 1:
                return this.f52853b.lambda$loadEvents$14((ArrayList) this.f52854c, (TransportContext) this.f52855d, (Cursor) obj);
            case 2:
                return this.f52853b.lambda$persist$1((EventInternal) this.f52854c, (TransportContext) this.f52855d, (SQLiteDatabase) obj);
            default:
                return this.f52853b.lambda$loadClientMetrics$19((Map) this.f52854c, (ClientMetrics.Builder) this.f52855d, (Cursor) obj);
        }
    }
}
