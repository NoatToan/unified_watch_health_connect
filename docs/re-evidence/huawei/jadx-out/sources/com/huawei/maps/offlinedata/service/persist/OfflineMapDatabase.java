package com.huawei.maps.offlinedata.service.persist;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.huawei.maps.offlinedata.service.persist.dao.e;

/* JADX INFO: loaded from: classes12.dex */
public abstract class OfflineMapDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile OfflineMapDatabase f17990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Migration f17991b = new a(1, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Migration f17992c = new b(2, 3);
    private static final Migration d = new c(3, 4);
    private static final Migration e = new d(4, 5);

    class a extends Migration {
        a(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE offline_data_task ADD COLUMN lastModifyTime TEXT");
        }
    }

    class b extends Migration {
        b(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE offline_data_task ADD COLUMN downloadType INTEGER");
            supportSQLiteDatabase.execSQL("ALTER TABLE offline_data_task ADD COLUMN manualPause INTEGER NOT NULL DEFAULT 0");
        }
    }

    class c extends Migration {
        c(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE offline_data_task_new (id TEXT PRIMARY KEY NOT NULL, dataType TEXT, countryId TEXT, countryName TEXT, regionId TEXT, regionName TEXT, cityId TEXT, cityName TEXT, political TEXT, version TEXT, taskId TEXT, taskState TEXT, itemState TEXT, downloadProgress INTEGER, transmitProgress INTEGER, lastModifyTime TEXT, downloadType INTEGER, manualPause INTEGER NOT NULL DEFAULT 0)");
            supportSQLiteDatabase.execSQL("INSERT INTO offline_data_task_new (id, dataType, countryId, countryName, regionId, regionName, cityId, cityName, political, version, taskId, taskState, itemState, downloadProgress, transmitProgress, lastModifyTime, downloadType, manualPause) SELECT id, dataType, countryId, countryName, regionId, regionName, cityId, cityName, political, version, taskId, taskState, itemState, downloadProgress, transmitProgress, lastModifyTime, downloadType, manualPause FROM offline_data_task");
            supportSQLiteDatabase.execSQL("DROP TABLE offline_data_task");
            supportSQLiteDatabase.execSQL("ALTER TABLE offline_data_task_new RENAME TO offline_data_task");
        }
    }

    class d extends Migration {
        d(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE world_map_offline_data_item ADD COLUMN dataType TEXT");
        }
    }

    private static OfflineMapDatabase a(Context context) {
        return (OfflineMapDatabase) Room.databaseBuilder(context, OfflineMapDatabase.class, "offline_data_map.db").addMigrations(f17991b, f17992c, d, e).build();
    }

    public static OfflineMapDatabase b(Context context) {
        if (f17990a == null) {
            synchronized (OfflineMapDatabase.class) {
                if (f17990a == null) {
                    f17990a = a(context);
                }
            }
        }
        return f17990a;
    }

    public abstract com.huawei.maps.offlinedata.service.persist.dao.a a();

    public abstract com.huawei.maps.offlinedata.service.persist.dao.c b();

    public abstract e c();
}
