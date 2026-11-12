package com.huami.stress.domain.data.local;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.huami.stress.domain.data.local.dao.AllDayStressDao;
import com.huami.stress.domain.data.local.dao.AllDayStressDao_Impl;
import com.huami.stress.domain.data.local.dao.SingleStressDao;
import com.huami.stress.domain.data.local.dao.SingleStressDao_Impl;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class StressDatabase_Impl extends StressDatabase {
    private volatile AllDayStressDao a;
    private volatile SingleStressDao b;

    public class a extends RoomOpenHelper.Delegate {
        public a(int i) {
            super(i);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `AllDayStress` (`timestamp` INTEGER NOT NULL, `userId` TEXT NOT NULL, `deviceSource` INTEGER NOT NULL, `deviceType` INTEGER NOT NULL, `deviceId` TEXT NOT NULL, `deviceMac` TEXT NOT NULL, `deviceSn` TEXT NOT NULL, `maxStress` INTEGER NOT NULL, `minStress` INTEGER NOT NULL, `avgStress` INTEGER NOT NULL, `relaxProportion` INTEGER NOT NULL, `normalProportion` INTEGER NOT NULL, `mediumProportion` INTEGER NOT NULL, `highProportion` INTEGER NOT NULL, `data` TEXT NOT NULL, `syncStatus` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SingleStress` (`timestamp` INTEGER NOT NULL, `userId` TEXT NOT NULL, `value` INTEGER NOT NULL, `deviceSource` INTEGER NOT NULL, `deviceType` INTEGER NOT NULL, `deviceId` TEXT NOT NULL, `deviceMac` TEXT NOT NULL, `deviceSn` TEXT NOT NULL, `syncStatus` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))");
            supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '445804459b475e8a57a3039538cb9659')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `AllDayStress`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `SingleStress`");
            if (StressDatabase_Impl.this.mCallbacks != null) {
                int size = StressDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) StressDatabase_Impl.this.mCallbacks.get(i)).onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (StressDatabase_Impl.this.mCallbacks != null) {
                int size = StressDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) StressDatabase_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            StressDatabase_Impl.this.mDatabase = supportSQLiteDatabase;
            StressDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            if (StressDatabase_Impl.this.mCallbacks != null) {
                int size = StressDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) StressDatabase_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap map = new HashMap(16);
            map.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 1, null, 1));
            map.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
            map.put("deviceSource", new TableInfo.Column("deviceSource", "INTEGER", true, 0, null, 1));
            map.put("deviceType", new TableInfo.Column("deviceType", "INTEGER", true, 0, null, 1));
            map.put("deviceId", new TableInfo.Column("deviceId", "TEXT", true, 0, null, 1));
            map.put(ParamKey.deviceMac, new TableInfo.Column(ParamKey.deviceMac, "TEXT", true, 0, null, 1));
            map.put(ParamKey.deviceSn, new TableInfo.Column(ParamKey.deviceSn, "TEXT", true, 0, null, 1));
            map.put("maxStress", new TableInfo.Column("maxStress", "INTEGER", true, 0, null, 1));
            map.put("minStress", new TableInfo.Column("minStress", "INTEGER", true, 0, null, 1));
            map.put("avgStress", new TableInfo.Column("avgStress", "INTEGER", true, 0, null, 1));
            map.put("relaxProportion", new TableInfo.Column("relaxProportion", "INTEGER", true, 0, null, 1));
            map.put("normalProportion", new TableInfo.Column("normalProportion", "INTEGER", true, 0, null, 1));
            map.put("mediumProportion", new TableInfo.Column("mediumProportion", "INTEGER", true, 0, null, 1));
            map.put("highProportion", new TableInfo.Column("highProportion", "INTEGER", true, 0, null, 1));
            map.put("data", new TableInfo.Column("data", "TEXT", true, 0, null, 1));
            map.put("syncStatus", new TableInfo.Column("syncStatus", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("AllDayStress", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(supportSQLiteDatabase, "AllDayStress");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(false, "AllDayStress(com.huami.stress.domain.data.local.bean.AllDayStressDaoBean).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(9);
            map2.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 1, null, 1));
            map2.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
            map2.put("value", new TableInfo.Column("value", "INTEGER", true, 0, null, 1));
            map2.put("deviceSource", new TableInfo.Column("deviceSource", "INTEGER", true, 0, null, 1));
            map2.put("deviceType", new TableInfo.Column("deviceType", "INTEGER", true, 0, null, 1));
            map2.put("deviceId", new TableInfo.Column("deviceId", "TEXT", true, 0, null, 1));
            map2.put(ParamKey.deviceMac, new TableInfo.Column(ParamKey.deviceMac, "TEXT", true, 0, null, 1));
            map2.put(ParamKey.deviceSn, new TableInfo.Column(ParamKey.deviceSn, "TEXT", true, 0, null, 1));
            map2.put("syncStatus", new TableInfo.Column("syncStatus", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo("SingleStress", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(supportSQLiteDatabase, "SingleStress");
            if (tableInfo3.equals(tableInfo4)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "SingleStress(com.huami.stress.domain.data.local.bean.SingleStressDaoBean).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
        }
    }

    @Override // com.huami.stress.domain.data.local.StressDatabase
    public AllDayStressDao allDayStressDao() {
        AllDayStressDao allDayStressDao;
        if (this.a != null) {
            return this.a;
        }
        synchronized (this) {
            if (this.a == null) {
                this.a = new AllDayStressDao_Impl(this);
            }
            allDayStressDao = this.a;
        }
        return allDayStressDao;
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `AllDayStress`");
            writableDatabase.execSQL("DELETE FROM `SingleStress`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "AllDayStress", "SingleStress");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new a(1), "445804459b475e8a57a3039538cb9659", "3ebd9d3451b27c74e9df51458d1ffbb9")).build());
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(AllDayStressDao.class, AllDayStressDao_Impl.getRequiredConverters());
        map.put(SingleStressDao.class, SingleStressDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // com.huami.stress.domain.data.local.StressDatabase
    public SingleStressDao singleStressDao() {
        SingleStressDao singleStressDao;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = new SingleStressDao_Impl(this);
            }
            singleStressDao = this.b;
        }
        return singleStressDao;
    }
}
