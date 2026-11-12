package com.xiaomi.fitness.device.manager.dao;

import android.app.Application;
import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.SingleHolder;
import com.xiaomi.fitness.database.BaseDatabase;
import com.xiaomi.fitness.device.manager.export.bean.LocalDevice;
import com.xiaomi.fitness.device.manager.export.bean.WearableDevice;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Database(entities = {WearableDevice.class, LocalDevice.class}, exportSchema = false, version = 6)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/device/manager/dao/DeviceDatabase;", "Lcom/xiaomi/fitness/database/BaseDatabase;", "<init>", "()V", "getDeviceDao", "Lcom/xiaomi/fitness/device/manager/dao/DeviceDao;", "getLocalDeviceDao", "Lcom/xiaomi/fitness/device/manager/dao/LocalDeviceDao;", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceDatabase.kt\ncom/xiaomi/fitness/device/manager/dao/DeviceDatabase\n+ 2 BaseDatabase.kt\ncom/xiaomi/fitness/database/BaseDatabase$Companion\n*L\n1#1,142:1\n20#2,8:143\n*S KotlinDebug\n*F\n+ 1 DeviceDatabase.kt\ncom/xiaomi/fitness/device/manager/dao/DeviceDatabase\n*L\n126#1:143,8\n*E\n"})
public abstract class DeviceDatabase extends BaseDatabase {

    @NotNull
    private static final String CREATE_LOCAL_DEVICE_TABLE = "CREATE TABLE IF NOT EXISTS local_device('app_device_id' TEXT PRIMARY KEY NOT NULL, 'token' TEXT, 'sn' TEXT,  'oob' TEXT, 'identifier' TEXT NOT NULL DEFAULT 0, 'productId' INTEGER NOT NULL, 'extraValues' TEXT, 'name' TEXT NOT NULL, 'alias' TEXT NOT NULL, 'model' TEXT NOT NULL, 'detail' TEXT, 'did' TEXT NOT NULL, 'status' INTEGER NOT NULL DEFAULT 1)";

    @NotNull
    private static final String DB_NAME = "device_db";

    @NotNull
    private static final DeviceDatabase instance;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Migration MIGRATION_V1_V2 = new Migration() { // from class: com.xiaomi.fitness.device.manager.dao.DeviceDatabase$Companion$MIGRATION_V1_V2$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("CREATE TABLE IF NOT EXISTS local_device('app_device_id' TEXT PRIMARY KEY NOT NULL, 'token' TEXT, 'sn' TEXT,  'oob' TEXT, 'identifier' TEXT NOT NULL DEFAULT 0, 'productId' INTEGER NOT NULL, 'extraValues' TEXT, 'name' TEXT NOT NULL, 'alias' TEXT NOT NULL, 'model' TEXT NOT NULL, 'detail' TEXT, 'did' TEXT NOT NULL, 'status' INTEGER NOT NULL DEFAULT 1)");
        }
    };

    @NotNull
    private static final Migration MIGRATION_V2_V3 = new Migration() { // from class: com.xiaomi.fitness.device.manager.dao.DeviceDatabase$Companion$MIGRATION_V2_V3$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("ALTER TABLE device ADD COLUMN deviceType INTEGER not null default 0");
            database.execSQL("ALTER TABLE device ADD COLUMN isOwner INTEGER not null default 1");
            database.execSQL("ALTER TABLE device ADD COLUMN userId TEXT");
            database.execSQL("ALTER TABLE device ADD COLUMN shareUserId TEXT");
            database.execSQL("ALTER TABLE device ADD COLUMN shareId TEXT");
            database.execSQL("ALTER TABLE local_device ADD COLUMN deviceType INTEGER not null default 0");
            database.execSQL("ALTER TABLE local_device ADD COLUMN isOwner INTEGER not null default 1");
            database.execSQL("ALTER TABLE local_device ADD COLUMN userId TEXT");
            database.execSQL("ALTER TABLE local_device ADD COLUMN shareUserId TEXT");
            database.execSQL("ALTER TABLE local_device ADD COLUMN shareId TEXT");
        }
    };

    @NotNull
    private static final Migration MIGRATION_V3_V4 = new Migration() { // from class: com.xiaomi.fitness.device.manager.dao.DeviceDatabase$Companion$MIGRATION_V3_V4$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("CREATE TABLE device_temp('did' TEXT PRIMARY KEY NOT NULL,'productId' INTEGER NOT NULL,'model' TEXT NOT NULL,'name' TEXT NOT NULL,'extraValues' TEXT,'identifier' TEXT NOT NULL,'alias' TEXT NOT NULL,'status' INTEGER NOT NULL,'detail' TEXT)");
            database.execSQL("INSERT INTO device_temp (did,productId,model,name,extraValues,identifier,alias,status,detail)SELECT did,productId,model,name,extraValues,identifier,alias,status,detail FROM device");
            database.execSQL("DROP TABLE device");
            database.execSQL("ALTER TABLE device_temp RENAME to device");
            database.execSQL("CREATE TABLE local_device_temp('app_device_id' TEXT PRIMARY KEY NOT NULL, 'token' TEXT, 'sn' TEXT,  'oob' TEXT, 'identifier' TEXT NOT NULL DEFAULT 0, 'productId' INTEGER NOT NULL, 'extraValues' TEXT, 'name' TEXT NOT NULL, 'alias' TEXT NOT NULL, 'model' TEXT NOT NULL, 'detail' TEXT, 'did' TEXT NOT NULL, 'status' INTEGER NOT NULL DEFAULT 1)");
            database.execSQL("INSERT INTO local_device_temp (app_device_id,token,sn,oob,identifier,productId,extraValues,name,alias,model,detail,did,status)SELECT app_device_id,token,oob,sn,identifier,productId,extraValues,name,alias,model,detail,did,status FROM local_device");
            database.execSQL("DROP TABLE local_device");
            database.execSQL("ALTER TABLE local_device_temp RENAME to local_device");
        }
    };

    @NotNull
    private static final Migration MIGRATION_V4_V5 = new Migration() { // from class: com.xiaomi.fitness.device.manager.dao.DeviceDatabase$Companion$MIGRATION_V4_V5$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            try {
                database.execSQL("ALTER TABLE device ADD COLUMN  uploaded INTEGER not null default 1");
                database.execSQL("ALTER TABLE local_device ADD COLUMN uploaded INTEGER not null default 1");
            } catch (Exception e) {
                DeviceModelExtKt.loge("migrate v4 to v5 " + e.getMessage());
            }
        }
    };

    @NotNull
    private static final Migration MIGRATION_V5_V6 = new Migration() { // from class: com.xiaomi.fitness.device.manager.dao.DeviceDatabase$Companion$MIGRATION_V5_V6$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
        }
    };

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/device/manager/dao/DeviceDatabase$Companion;", "", "<init>", "()V", "DB_NAME", "", "CREATE_LOCAL_DEVICE_TABLE", "MIGRATION_V1_V2", "Landroidx/room/migration/Migration;", "MIGRATION_V2_V3", "MIGRATION_V3_V4", "MIGRATION_V4_V5", "MIGRATION_V5_V6", "instance", "Lcom/xiaomi/fitness/device/manager/dao/DeviceDatabase;", "getInstance", "()Lcom/xiaomi/fitness/device/manager/dao/DeviceDatabase;", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DeviceDatabase getInstance() {
            return DeviceDatabase.instance;
        }
    }

    static {
        Application application = ApplicationExtKt.getApplication();
        final String str = DB_NAME;
        instance = (DeviceDatabase) ((BaseDatabase) new SingleHolder(new Function1<Context, DeviceDatabase>() { // from class: com.xiaomi.fitness.device.manager.dao.DeviceDatabase$special$$inlined$getInstance$1
            /* JADX WARN: Type inference failed for: r6v5, types: [com.xiaomi.fitness.database.BaseDatabase, com.xiaomi.fitness.device.manager.dao.DeviceDatabase] */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final DeviceDatabase invoke2(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                RoomDatabase.Builder builderDatabaseBuilder = Room.databaseBuilder(ApplicationExtKt.getSafeContext(it), DeviceDatabase.class, str);
                builderDatabaseBuilder.addMigrations(DeviceDatabase.MIGRATION_V1_V2, DeviceDatabase.MIGRATION_V2_V3, DeviceDatabase.MIGRATION_V3_V4, DeviceDatabase.MIGRATION_V4_V5, DeviceDatabase.MIGRATION_V5_V6);
                return (BaseDatabase) builderDatabaseBuilder.allowMainThreadQueries().build();
            }
        }).getInstance(application));
    }

    @NotNull
    public abstract DeviceDao getDeviceDao();

    @NotNull
    public abstract LocalDeviceDao getLocalDeviceDao();
}
