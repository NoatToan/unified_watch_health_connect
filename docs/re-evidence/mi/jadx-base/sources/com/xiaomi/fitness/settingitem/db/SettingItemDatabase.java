package com.xiaomi.fitness.settingitem.db;

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
import com.xiaomi.fitness.settingitem.db.dao.SettingDeviceDao;
import com.xiaomi.fitness.settingitem.db.dao.SettingItemDao;
import com.xiaomi.fitness.settingitem.db.entity.SettingDeviceEntity;
import com.xiaomi.fitness.settingitem.db.entity.SettingItemEntity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Database(entities = {SettingItemEntity.class, SettingDeviceEntity.class}, version = 2)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/settingitem/db/SettingItemDatabase;", "Lcom/xiaomi/fitness/database/BaseDatabase;", "<init>", "()V", "settingItemDao", "Lcom/xiaomi/fitness/settingitem/db/dao/SettingItemDao;", "settingDeviceDao", "Lcom/xiaomi/fitness/settingitem/db/dao/SettingDeviceDao;", "Companion", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSettingItemDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingItemDatabase.kt\ncom/xiaomi/fitness/settingitem/db/SettingItemDatabase\n+ 2 BaseDatabase.kt\ncom/xiaomi/fitness/database/BaseDatabase$Companion\n*L\n1#1,54:1\n20#2,8:55\n*S KotlinDebug\n*F\n+ 1 SettingItemDatabase.kt\ncom/xiaomi/fitness/settingitem/db/SettingItemDatabase\n*L\n33#1:55,8\n*E\n"})
public abstract class SettingItemDatabase extends BaseDatabase {

    @NotNull
    private static final String DB_NAME = "setting_item";

    @NotNull
    private static final SettingItemDatabase instance;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SettingItemDatabase$Companion$migration_1_2$1 migration_1_2 = new Migration() { // from class: com.xiaomi.fitness.settingitem.db.SettingItemDatabase$Companion$migration_1_2$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("alter table settingitem add column modifyTime integer not null default 0");
        }
    };

    @Metadata(d1 = {"\u0000!\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/settingitem/db/SettingItemDatabase$Companion;", "", "<init>", "()V", "DB_NAME", "", "migration_1_2", "com/xiaomi/fitness/settingitem/db/SettingItemDatabase$Companion$migration_1_2$1", "Lcom/xiaomi/fitness/settingitem/db/SettingItemDatabase$Companion$migration_1_2$1;", "instance", "Lcom/xiaomi/fitness/settingitem/db/SettingItemDatabase;", "getInstance", "()Lcom/xiaomi/fitness/settingitem/db/SettingItemDatabase;", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SettingItemDatabase getInstance() {
            return SettingItemDatabase.instance;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.xiaomi.fitness.settingitem.db.SettingItemDatabase$Companion$migration_1_2$1] */
    static {
        Application application = ApplicationExtKt.getApplication();
        final String str = DB_NAME;
        instance = (SettingItemDatabase) ((BaseDatabase) new SingleHolder(new Function1<Context, SettingItemDatabase>() { // from class: com.xiaomi.fitness.settingitem.db.SettingItemDatabase$special$$inlined$getInstance$1
            /* JADX WARN: Type inference failed for: r4v5, types: [com.xiaomi.fitness.database.BaseDatabase, com.xiaomi.fitness.settingitem.db.SettingItemDatabase] */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final SettingItemDatabase invoke2(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                RoomDatabase.Builder builderDatabaseBuilder = Room.databaseBuilder(ApplicationExtKt.getSafeContext(it), SettingItemDatabase.class, str);
                builderDatabaseBuilder.enableMultiInstanceInvalidation();
                builderDatabaseBuilder.addMigrations(SettingItemDatabase.migration_1_2);
                builderDatabaseBuilder.addCallback(new RoomDatabase.Callback() { // from class: com.xiaomi.fitness.settingitem.db.SettingItemDatabase$Companion$instance$1$1
                    @Override // androidx.room.RoomDatabase.Callback
                    public void onCreate(SupportSQLiteDatabase db) {
                        Intrinsics.checkNotNullParameter(db, "db");
                        super.onCreate(db);
                        Logger.i("setting_item", "db is created");
                    }

                    @Override // androidx.room.RoomDatabase.Callback
                    public void onOpen(SupportSQLiteDatabase db) {
                        Intrinsics.checkNotNullParameter(db, "db");
                        super.onOpen(db);
                        Logger.i("setting_item", "db is opened");
                    }
                });
                return (BaseDatabase) builderDatabaseBuilder.allowMainThreadQueries().build();
            }
        }).getInstance(application));
    }

    @NotNull
    public abstract SettingDeviceDao settingDeviceDao();

    @NotNull
    public abstract SettingItemDao settingItemDao();
}
