package com.xiaomi.fitness.device.manager.dao;

import android.app.Application;
import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.SingleHolder;
import com.xiaomi.fitness.database.BaseDatabase;
import com.xiaomi.fitness.device.manager.dao.DeviceRecordDatabase;
import com.xiaomi.fitness.device.manager.export.bean.DeviceRecord;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Database(entities = {DeviceRecord.class}, version = 3)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/device/manager/dao/DeviceRecordDatabase;", "Lcom/xiaomi/fitness/database/BaseDatabase;", "<init>", "()V", "getDeviceRecordDao", "Lcom/xiaomi/fitness/device/manager/dao/DeviceRecordDao;", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceRecordDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceRecordDatabase.kt\ncom/xiaomi/fitness/device/manager/dao/DeviceRecordDatabase\n+ 2 BaseDatabase.kt\ncom/xiaomi/fitness/database/BaseDatabase$Companion\n*L\n1#1,54:1\n20#2,8:55\n*S KotlinDebug\n*F\n+ 1 DeviceRecordDatabase.kt\ncom/xiaomi/fitness/device/manager/dao/DeviceRecordDatabase\n*L\n49#1:55,8\n*E\n"})
public abstract class DeviceRecordDatabase extends BaseDatabase {

    @NotNull
    private static final String DB_NAME = "device_record_db";
    public static final int DB_VERSION = 3;

    @NotNull
    private static final DeviceRecordDatabase instance;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<Migration[]> migrations$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qb6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceRecordDatabase.migrations_delegate$lambda$0();
        }
    });

    @NotNull
    private static final DeviceRecordDatabase$Companion$migration_1_2$1 migration_1_2 = new Migration() { // from class: com.xiaomi.fitness.device.manager.dao.DeviceRecordDatabase$Companion$migration_1_2$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("ALTER TABLE device_record ADD COLUMN did TEXT");
        }
    };

    @NotNull
    private static final DeviceRecordDatabase$Companion$migration_2_3$1 migration_2_3 = new Migration() { // from class: com.xiaomi.fitness.device.manager.dao.DeviceRecordDatabase$Companion$migration_2_3$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("ALTER TABLE device_record ADD COLUMN record_time INTEGER NOT NULL DEFAULT 0");
            database.execSQL("ALTER TABLE device_record ADD COLUMN need_check INTEGER NOT NULL DEFAULT 10");
        }
    };

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0002\u0010\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0010\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/device/manager/dao/DeviceRecordDatabase$Companion;", "", "<init>", "()V", "DB_VERSION", "", "DB_NAME", "", "migrations", "", "Landroidx/room/migration/Migration;", "getMigrations", "()[Landroidx/room/migration/Migration;", "migrations$delegate", "Lkotlin/Lazy;", "migration_1_2", "com/xiaomi/fitness/device/manager/dao/DeviceRecordDatabase$Companion$migration_1_2$1", "Lcom/xiaomi/fitness/device/manager/dao/DeviceRecordDatabase$Companion$migration_1_2$1;", "migration_2_3", "com/xiaomi/fitness/device/manager/dao/DeviceRecordDatabase$Companion$migration_2_3$1", "Lcom/xiaomi/fitness/device/manager/dao/DeviceRecordDatabase$Companion$migration_2_3$1;", "instance", "Lcom/xiaomi/fitness/device/manager/dao/DeviceRecordDatabase;", "getInstance", "()Lcom/xiaomi/fitness/device/manager/dao/DeviceRecordDatabase;", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Migration[] getMigrations() {
            return (Migration[]) DeviceRecordDatabase.migrations$delegate.getValue();
        }

        @NotNull
        public final DeviceRecordDatabase getInstance() {
            return DeviceRecordDatabase.instance;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.xiaomi.fitness.device.manager.dao.DeviceRecordDatabase$Companion$migration_1_2$1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.xiaomi.fitness.device.manager.dao.DeviceRecordDatabase$Companion$migration_2_3$1] */
    static {
        Application application = ApplicationExtKt.getApplication();
        final String str = DB_NAME;
        instance = (DeviceRecordDatabase) ((BaseDatabase) new SingleHolder(new Function1<Context, DeviceRecordDatabase>() { // from class: com.xiaomi.fitness.device.manager.dao.DeviceRecordDatabase$special$$inlined$getInstance$1
            /* JADX WARN: Type inference failed for: r3v5, types: [com.xiaomi.fitness.database.BaseDatabase, com.xiaomi.fitness.device.manager.dao.DeviceRecordDatabase] */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final DeviceRecordDatabase invoke2(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                RoomDatabase.Builder builderDatabaseBuilder = Room.databaseBuilder(ApplicationExtKt.getSafeContext(it), DeviceRecordDatabase.class, str);
                Migration[] migrations = DeviceRecordDatabase.INSTANCE.getMigrations();
                builderDatabaseBuilder.addMigrations((Migration[]) Arrays.copyOf(migrations, migrations.length));
                return (BaseDatabase) builderDatabaseBuilder.allowMainThreadQueries().build();
            }
        }).getInstance(application));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Migration[] migrations_delegate$lambda$0() {
        return new Migration[]{migration_1_2, migration_2_3};
    }

    @NotNull
    public abstract DeviceRecordDao getDeviceRecordDao();
}
