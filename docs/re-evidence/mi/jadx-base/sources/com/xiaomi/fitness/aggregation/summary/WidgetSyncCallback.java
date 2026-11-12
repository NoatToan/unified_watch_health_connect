package com.xiaomi.fitness.aggregation.summary;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/aggregation/summary/WidgetSyncCallback;", "Landroidx/room/RoomDatabase$Callback;", "databaseName", "", "connector", "Lcom/xiaomi/fitness/aggregation/summary/SummaryConnector;", "<init>", "(Ljava/lang/String;Lcom/xiaomi/fitness/aggregation/summary/SummaryConnector;)V", "onOpen", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WidgetSyncCallback extends RoomDatabase.Callback {

    @NotNull
    private final SummaryConnector connector;

    @NotNull
    private final String databaseName;

    public WidgetSyncCallback(@NotNull String databaseName, @NotNull SummaryConnector connector) {
        Intrinsics.checkNotNullParameter(databaseName, "databaseName");
        Intrinsics.checkNotNullParameter(connector, "connector");
        this.databaseName = databaseName;
        this.connector = connector;
    }

    @Override // androidx.room.RoomDatabase.Callback
    public void onOpen(@NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        super.onOpen(db);
        SummarySyncManager companion = SummarySyncManager.INSTANCE.getInstance();
        companion.addRegisterDatabase(this.databaseName);
        companion.registerSummaryConnector(this.databaseName, this.connector);
        companion.initSyncTable(this.databaseName, db);
    }
}
