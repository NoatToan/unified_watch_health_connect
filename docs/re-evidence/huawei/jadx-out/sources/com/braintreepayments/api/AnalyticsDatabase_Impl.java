package com.braintreepayments.api;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import defpackage.rn;
import defpackage.rq;
import defpackage.rs;
import defpackage.rt;
import defpackage.ru;
import defpackage.rv;
import defpackage.ry;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class AnalyticsDatabase_Impl extends AnalyticsDatabase {
    private volatile AnalyticsEventBlobDao e;

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate(7) { // from class: com.braintreepayments.api.AnalyticsDatabase_Impl.5
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `analytics_event_blob` (`json_string` TEXT NOT NULL, `_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
                supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '065b039e1e06945e854870d014261016')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `analytics_event_blob`");
                if (AnalyticsDatabase_Impl.this.mCallbacks != null) {
                    int size = AnalyticsDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) AnalyticsDatabase_Impl.this.mCallbacks.get(i)).onDestructiveMigration(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (AnalyticsDatabase_Impl.this.mCallbacks != null) {
                    int size = AnalyticsDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) AnalyticsDatabase_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                AnalyticsDatabase_Impl.this.mDatabase = supportSQLiteDatabase;
                AnalyticsDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                if (AnalyticsDatabase_Impl.this.mCallbacks != null) {
                    int size = AnalyticsDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) AnalyticsDatabase_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) throws IOException {
                DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
                HashMap map = new HashMap(2);
                map.put("json_string", new TableInfo.Column("json_string", "TEXT", true, 0, null, 1));
                map.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1, null, 1));
                TableInfo tableInfo = new TableInfo("analytics_event_blob", map, new HashSet(0), new HashSet(0));
                TableInfo tableInfo2 = TableInfo.read(supportSQLiteDatabase, "analytics_event_blob");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenHelper.ValidationResult(false, "analytics_event_blob(com.braintreepayments.api.AnalyticsEventBlob).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                return new RoomOpenHelper.ValidationResult(true, null);
            }
        }, "065b039e1e06945e854870d014261016", "56c8ea595c439f4f70d21d9755ea39fc")).build());
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "analytics_event_blob");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `analytics_event_blob`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(AnalyticsEventBlobDao.class, ry.a());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return Arrays.asList(new rn(), new rq(), new ru(), new rv(), new rt(), new rs());
    }

    @Override // com.braintreepayments.api.AnalyticsDatabase
    public AnalyticsEventBlobDao analyticsEventBlobDao() {
        AnalyticsEventBlobDao analyticsEventBlobDao;
        if (this.e != null) {
            return this.e;
        }
        synchronized (this) {
            if (this.e == null) {
                this.e = new ry(this);
            }
            analyticsEventBlobDao = this.e;
        }
        return analyticsEventBlobDao;
    }
}
