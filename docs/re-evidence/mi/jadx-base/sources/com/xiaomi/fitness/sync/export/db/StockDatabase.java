package com.xiaomi.fitness.sync.export.db;

import android.app.Application;
import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.SingleHolder;
import com.xiaomi.fitness.database.BaseDatabase;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Database(entities = {StockInfoEntity.class}, exportSchema = false, version = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/sync/export/db/StockDatabase;", "Lcom/xiaomi/fitness/database/BaseDatabase;", "<init>", "()V", "getStockDao", "Lcom/xiaomi/fitness/sync/export/db/StockDao;", "Companion", "sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStockDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StockDatabase.kt\ncom/xiaomi/fitness/sync/export/db/StockDatabase\n+ 2 BaseDatabase.kt\ncom/xiaomi/fitness/database/BaseDatabase$Companion\n*L\n1#1,31:1\n20#2,8:32\n*S KotlinDebug\n*F\n+ 1 StockDatabase.kt\ncom/xiaomi/fitness/sync/export/db/StockDatabase\n*L\n14#1:32,8\n*E\n"})
public abstract class StockDatabase extends BaseDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String DB_NAME = "stock_db";

    @NotNull
    private static final StockDatabase instance;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sync/export/db/StockDatabase$Companion;", "", "<init>", "()V", "DB_NAME", "", "instance", "Lcom/xiaomi/fitness/sync/export/db/StockDatabase;", "getInstance", "()Lcom/xiaomi/fitness/sync/export/db/StockDatabase;", "sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StockDatabase getInstance() {
            return StockDatabase.instance;
        }
    }

    static {
        Application application = ApplicationExtKt.getApplication();
        final String str = DB_NAME;
        instance = (StockDatabase) ((BaseDatabase) new SingleHolder(new Function1<Context, StockDatabase>() { // from class: com.xiaomi.fitness.sync.export.db.StockDatabase$special$$inlined$getInstance$1
            /* JADX WARN: Type inference failed for: r3v5, types: [com.xiaomi.fitness.database.BaseDatabase, com.xiaomi.fitness.sync.export.db.StockDatabase] */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final StockDatabase invoke2(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                RoomDatabase.Builder builderDatabaseBuilder = Room.databaseBuilder(ApplicationExtKt.getSafeContext(it), StockDatabase.class, str);
                builderDatabaseBuilder.addCallback(new RoomDatabase.Callback() { // from class: com.xiaomi.fitness.sync.export.db.StockDatabase$Companion$instance$1$1
                    @Override // androidx.room.RoomDatabase.Callback
                    public void onCreate(SupportSQLiteDatabase db) {
                        Intrinsics.checkNotNullParameter(db, "db");
                        super.onCreate(db);
                        Logger.i(StockDatabase.DB_NAME, "db is created");
                    }

                    @Override // androidx.room.RoomDatabase.Callback
                    public void onOpen(SupportSQLiteDatabase db) {
                        Intrinsics.checkNotNullParameter(db, "db");
                        super.onOpen(db);
                        Logger.i(StockDatabase.DB_NAME, "db is opened");
                    }
                });
                return (BaseDatabase) builderDatabaseBuilder.allowMainThreadQueries().build();
            }
        }).getInstance(application));
    }

    @NotNull
    public abstract StockDao getStockDao();
}
