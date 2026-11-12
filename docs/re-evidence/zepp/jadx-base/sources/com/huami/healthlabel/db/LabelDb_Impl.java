package com.huami.healthlabel.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.huami.healthlabel.db.dao.HealthLabelDao;
import com.huami.healthlabel.db.dao.HealthLabelDao_Impl;
import com.huami.healthlabel.db.dao.HomeLabelDao;
import com.huami.healthlabel.db.dao.HomeLabelDao_Impl;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes9.dex */
public final class LabelDb_Impl extends LabelDb {
    private volatile HomeLabelDao a;
    private volatile HealthLabelDao b;

    public class a extends RoomOpenHelper.Delegate {
        public a(int version) {
            super(version);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("CREATE TABLE IF NOT EXISTS `health_table` (`labelId` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `labelText` TEXT NOT NULL, `labelColor` TEXT NOT NULL, PRIMARY KEY(`timestamp`))");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `home_label` (`labelText` TEXT NOT NULL, `labelId` INTEGER NOT NULL, `showInHome` INTEGER NOT NULL, `labelColor` TEXT NOT NULL, `sort` INTEGER NOT NULL, `reason` TEXT NOT NULL, PRIMARY KEY(`labelText`))");
            _db.execSQL(RoomMasterTable.CREATE_QUERY);
            _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '292017acaacf8b92503cbe8560de8d72')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("DROP TABLE IF EXISTS `health_table`");
            _db.execSQL("DROP TABLE IF EXISTS `home_label`");
            if (LabelDb_Impl.this.mCallbacks != null) {
                int size = LabelDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) LabelDb_Impl.this.mCallbacks.get(i)).onDestructiveMigration(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase _db) {
            if (LabelDb_Impl.this.mCallbacks != null) {
                int size = LabelDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) LabelDb_Impl.this.mCallbacks.get(i)).onCreate(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase _db) {
            LabelDb_Impl.this.mDatabase = _db;
            LabelDb_Impl.this.internalInitInvalidationTracker(_db);
            if (LabelDb_Impl.this.mCallbacks != null) {
                int size = LabelDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) LabelDb_Impl.this.mCallbacks.get(i)).onOpen(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPostMigrate(SupportSQLiteDatabase _db) {
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPreMigrate(SupportSQLiteDatabase _db) {
            DBUtil.dropFtsSyncTriggers(_db);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
            HashMap map = new HashMap(4);
            map.put("labelId", new TableInfo.Column("labelId", "INTEGER", true, 0, null, 1));
            map.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 1, null, 1));
            map.put("labelText", new TableInfo.Column("labelText", "TEXT", true, 0, null, 1));
            map.put("labelColor", new TableInfo.Column("labelColor", "TEXT", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("health_table", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(_db, "health_table");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(false, "health_table(com.huami.healthlabel.db.po.HealthLabel).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(6);
            map2.put("labelText", new TableInfo.Column("labelText", "TEXT", true, 1, null, 1));
            map2.put("labelId", new TableInfo.Column("labelId", "INTEGER", true, 0, null, 1));
            map2.put("showInHome", new TableInfo.Column("showInHome", "INTEGER", true, 0, null, 1));
            map2.put("labelColor", new TableInfo.Column("labelColor", "TEXT", true, 0, null, 1));
            map2.put("sort", new TableInfo.Column("sort", "INTEGER", true, 0, null, 1));
            map2.put("reason", new TableInfo.Column("reason", "TEXT", true, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo("home_label", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(_db, "home_label");
            if (tableInfo3.equals(tableInfo4)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "home_label(com.huami.healthlabel.db.po.HomeLabel).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `health_table`");
            writableDatabase.execSQL("DELETE FROM `home_label`");
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
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "health_table", "home_label");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new RoomOpenHelper(configuration, new a(2), "292017acaacf8b92503cbe8560de8d72", "77f873498c7318a5df53ab6de08f6e3d")).build());
    }

    @Override // com.huami.healthlabel.db.LabelDb
    public HealthLabelDao healthLabelDao() {
        HealthLabelDao healthLabelDao;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = new HealthLabelDao_Impl(this);
            }
            healthLabelDao = this.b;
        }
        return healthLabelDao;
    }

    @Override // com.huami.healthlabel.db.LabelDb
    public HomeLabelDao homeLabelDao() {
        HomeLabelDao homeLabelDao;
        if (this.a != null) {
            return this.a;
        }
        synchronized (this) {
            if (this.a == null) {
                this.a = new HomeLabelDao_Impl(this);
            }
            homeLabelDao = this.a;
        }
        return homeLabelDao;
    }
}
