package com.xiaomi.xms.wearable.db;

import android.app.Application;
import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.SingleHolder;
import com.xiaomi.fitness.database.BaseDatabase;
import com.xiaomi.xms.wearable.db.dao.WatchAppCapabilityDao;
import com.xiaomi.xms.wearable.db.dao.WatchAppItemDao;
import com.xiaomi.xms.wearable.db.entity.WatchAppCapability;
import com.xiaomi.xms.wearable.db.entity.WatchAppItemEntity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Database(entities = {WatchAppItemEntity.class, WatchAppCapability.class}, version = 2)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/xiaomi/xms/wearable/db/WatchAppItemDatabase;", "Lcom/xiaomi/fitness/database/BaseDatabase;", "<init>", "()V", "watchAppItemDao", "Lcom/xiaomi/xms/wearable/db/dao/WatchAppItemDao;", "watchAppCapabilityDao", "Lcom/xiaomi/xms/wearable/db/dao/WatchAppCapabilityDao;", "Companion", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWatchAppItemDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchAppItemDatabase.kt\ncom/xiaomi/xms/wearable/db/WatchAppItemDatabase\n+ 2 BaseDatabase.kt\ncom/xiaomi/fitness/database/BaseDatabase$Companion\n*L\n1#1,51:1\n20#2,8:52\n*S KotlinDebug\n*F\n+ 1 WatchAppItemDatabase.kt\ncom/xiaomi/xms/wearable/db/WatchAppItemDatabase\n*L\n32#1:52,8\n*E\n"})
public abstract class WatchAppItemDatabase extends BaseDatabase {

    @NotNull
    private static final String CREATE_WATCH_APP_CAPABILITY_SQL = "CREATE TABLE IF NOT EXISTS watch_app_capability('packageName' TEXT PRIMARY KEY,'appName' TEXT NOT NULL,'hasNotificationPermission' INTEGER NOT NULL DEFAULT 0,'hasObserveStatePermission' INTEGER NOT NULL DEFAULT 0)";

    @NotNull
    private static final String DB_NAME = "watch_app_item";

    @NotNull
    private static final WatchAppItemDatabase instance;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final WatchAppItemDatabase$Companion$MIGRATION_V1_V2$1 MIGRATION_V1_V2 = new Migration() { // from class: com.xiaomi.xms.wearable.db.WatchAppItemDatabase$Companion$MIGRATION_V1_V2$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("CREATE TABLE IF NOT EXISTS watch_app_capability('packageName' TEXT PRIMARY KEY,'appName' TEXT NOT NULL,'hasNotificationPermission' INTEGER NOT NULL DEFAULT 0,'hasObserveStatePermission' INTEGER NOT NULL DEFAULT 0)");
        }
    };

    @Metadata(d1 = {"\u0000#\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/xms/wearable/db/WatchAppItemDatabase$Companion;", "", "<init>", "()V", "DB_NAME", "", "CREATE_WATCH_APP_CAPABILITY_SQL", "MIGRATION_V1_V2", "com/xiaomi/xms/wearable/db/WatchAppItemDatabase$Companion$MIGRATION_V1_V2$1", "Lcom/xiaomi/xms/wearable/db/WatchAppItemDatabase$Companion$MIGRATION_V1_V2$1;", "instance", "Lcom/xiaomi/xms/wearable/db/WatchAppItemDatabase;", "getInstance", "()Lcom/xiaomi/xms/wearable/db/WatchAppItemDatabase;", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WatchAppItemDatabase getInstance() {
            return WatchAppItemDatabase.instance;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.xiaomi.xms.wearable.db.WatchAppItemDatabase$Companion$MIGRATION_V1_V2$1] */
    static {
        Application application = ApplicationExtKt.getApplication();
        final String str = DB_NAME;
        instance = (WatchAppItemDatabase) ((BaseDatabase) new SingleHolder(new Function1<Context, WatchAppItemDatabase>() { // from class: com.xiaomi.xms.wearable.db.WatchAppItemDatabase$special$$inlined$getInstance$1
            /* JADX WARN: Type inference failed for: r4v5, types: [com.xiaomi.fitness.database.BaseDatabase, com.xiaomi.xms.wearable.db.WatchAppItemDatabase] */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final WatchAppItemDatabase invoke2(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                RoomDatabase.Builder builderDatabaseBuilder = Room.databaseBuilder(ApplicationExtKt.getSafeContext(it), WatchAppItemDatabase.class, str);
                builderDatabaseBuilder.enableMultiInstanceInvalidation();
                builderDatabaseBuilder.addMigrations(WatchAppItemDatabase.MIGRATION_V1_V2);
                builderDatabaseBuilder.addCallback(new RoomDatabase.Callback() { // from class: com.xiaomi.xms.wearable.db.WatchAppItemDatabase$Companion$instance$1$1
                    @Override // androidx.room.RoomDatabase.Callback
                    public void onCreate(SupportSQLiteDatabase db) {
                        Intrinsics.checkNotNullParameter(db, "db");
                        super.onCreate(db);
                        Logger.i("watch_app_item", "db is created");
                    }

                    @Override // androidx.room.RoomDatabase.Callback
                    public void onOpen(SupportSQLiteDatabase db) {
                        Intrinsics.checkNotNullParameter(db, "db");
                        super.onOpen(db);
                        Logger.i("watch_app_item", "db is opened");
                    }
                });
                return (BaseDatabase) builderDatabaseBuilder.allowMainThreadQueries().build();
            }
        }).getInstance(application));
    }

    @NotNull
    public abstract WatchAppCapabilityDao watchAppCapabilityDao();

    @NotNull
    public abstract WatchAppItemDao watchAppItemDao();
}
