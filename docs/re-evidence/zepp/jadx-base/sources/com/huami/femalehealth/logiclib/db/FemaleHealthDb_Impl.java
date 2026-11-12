package com.huami.femalehealth.logiclib.db;

import android.os.Build;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.femalehealth.logiclib.db.dao.DeleteHistoryDao;
import com.huami.femalehealth.logiclib.db.dao.DeleteHistoryDao_Impl;
import com.huami.femalehealth.logiclib.db.dao.HistoryDao;
import com.huami.femalehealth.logiclib.db.dao.HistoryDao_Impl;
import com.huami.femalehealth.logiclib.db.dao.HistoryItemDao;
import com.huami.femalehealth.logiclib.db.dao.HistoryItemDao_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes8.dex */
public final class FemaleHealthDb_Impl extends FemaleHealthDb {
    private volatile HistoryDao a;
    private volatile DeleteHistoryDao b;
    private volatile HistoryItemDao c;

    public class a extends RoomOpenHelper.Delegate {
        public a(int version) {
            super(version);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("CREATE TABLE IF NOT EXISTS `MenstruationRecord` (`date` INTEGER NOT NULL, `inPeriod` INTEGER NOT NULL, `sId` TEXT, `isSyncServer` INTEGER NOT NULL, `updateTime` INTEGER, `isEnd` INTEGER, PRIMARY KEY(`date`))");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `Symptom` (`date` INTEGER NOT NULL, `type` TEXT NOT NULL, `degree` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, FOREIGN KEY(`date`) REFERENCES `MenstruationRecord`(`date`) ON UPDATE CASCADE ON DELETE CASCADE )");
            _db.execSQL("CREATE INDEX IF NOT EXISTS `index_Symptom_date` ON `Symptom` (`date`)");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `MenstruationHistory` (`id` TEXT NOT NULL, `cycle` INTEGER NOT NULL, `menstrualPeriod` INTEGER NOT NULL, `menstrualEndTime` INTEGER NOT NULL, `month` INTEGER NOT NULL, `userId` TEXT NOT NULL, `isEnd` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `DeletedMenstruationSection` (`serverId` TEXT NOT NULL, `startTime` INTEGER NOT NULL, `endTime` INTEGER NOT NULL, `updateTime` INTEGER, PRIMARY KEY(`serverId`))");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `HistoryItemBean` (`id` TEXT NOT NULL, `cycle` INTEGER NOT NULL, `menstrualPeriod` INTEGER NOT NULL, `menstrualEndTime` INTEGER, `month` INTEGER NOT NULL, `userId` TEXT NOT NULL, `updateTime` INTEGER, `end` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            _db.execSQL(RoomMasterTable.CREATE_QUERY);
            _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '64bb1e401991bff3d719057eef2be89b')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("DROP TABLE IF EXISTS `MenstruationRecord`");
            _db.execSQL("DROP TABLE IF EXISTS `Symptom`");
            _db.execSQL("DROP TABLE IF EXISTS `MenstruationHistory`");
            _db.execSQL("DROP TABLE IF EXISTS `DeletedMenstruationSection`");
            _db.execSQL("DROP TABLE IF EXISTS `HistoryItemBean`");
            if (FemaleHealthDb_Impl.this.mCallbacks != null) {
                int size = FemaleHealthDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) FemaleHealthDb_Impl.this.mCallbacks.get(i)).onDestructiveMigration(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase _db) {
            if (FemaleHealthDb_Impl.this.mCallbacks != null) {
                int size = FemaleHealthDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) FemaleHealthDb_Impl.this.mCallbacks.get(i)).onCreate(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase _db) {
            FemaleHealthDb_Impl.this.mDatabase = _db;
            _db.execSQL("PRAGMA foreign_keys = ON");
            FemaleHealthDb_Impl.this.internalInitInvalidationTracker(_db);
            if (FemaleHealthDb_Impl.this.mCallbacks != null) {
                int size = FemaleHealthDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) FemaleHealthDb_Impl.this.mCallbacks.get(i)).onOpen(_db);
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
            HashMap map = new HashMap(6);
            map.put("date", new TableInfo.Column("date", "INTEGER", true, 1, null, 1));
            map.put("inPeriod", new TableInfo.Column("inPeriod", "INTEGER", true, 0, null, 1));
            map.put("sId", new TableInfo.Column("sId", "TEXT", false, 0, null, 1));
            map.put("isSyncServer", new TableInfo.Column("isSyncServer", "INTEGER", true, 0, null, 1));
            map.put(EcgData.TIMESTAMP_SERVER_UPDATED, new TableInfo.Column(EcgData.TIMESTAMP_SERVER_UPDATED, "INTEGER", false, 0, null, 1));
            map.put("isEnd", new TableInfo.Column("isEnd", "INTEGER", false, 0, null, 1));
            TableInfo tableInfo = new TableInfo("MenstruationRecord", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(_db, "MenstruationRecord");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(false, "MenstruationRecord(com.huami.femalehealth.logiclib.db.po.MenstruationRecord).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(4);
            map2.put("date", new TableInfo.Column("date", "INTEGER", true, 0, null, 1));
            map2.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
            map2.put("degree", new TableInfo.Column("degree", "INTEGER", true, 0, null, 1));
            map2.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            HashSet hashSet = new HashSet(1);
            hashSet.add(new TableInfo.ForeignKey("MenstruationRecord", "CASCADE", "CASCADE", Arrays.asList("date"), Arrays.asList("date")));
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new TableInfo.Index("index_Symptom_date", false, Arrays.asList("date")));
            TableInfo tableInfo3 = new TableInfo("Symptom", map2, hashSet, hashSet2);
            TableInfo tableInfo4 = TableInfo.read(_db, "Symptom");
            if (!tableInfo3.equals(tableInfo4)) {
                return new RoomOpenHelper.ValidationResult(false, "Symptom(com.huami.femalehealth.logiclib.db.po.Symptom).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
            }
            HashMap map3 = new HashMap(7);
            map3.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
            map3.put("cycle", new TableInfo.Column("cycle", "INTEGER", true, 0, null, 1));
            map3.put("menstrualPeriod", new TableInfo.Column("menstrualPeriod", "INTEGER", true, 0, null, 1));
            map3.put("menstrualEndTime", new TableInfo.Column("menstrualEndTime", "INTEGER", true, 0, null, 1));
            map3.put("month", new TableInfo.Column("month", "INTEGER", true, 0, null, 1));
            map3.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
            map3.put("isEnd", new TableInfo.Column("isEnd", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo5 = new TableInfo("MenstruationHistory", map3, new HashSet(0), new HashSet(0));
            TableInfo tableInfo6 = TableInfo.read(_db, "MenstruationHistory");
            if (!tableInfo5.equals(tableInfo6)) {
                return new RoomOpenHelper.ValidationResult(false, "MenstruationHistory(com.huami.femalehealth.logiclib.db.po.MenstruationHistory).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
            }
            HashMap map4 = new HashMap(4);
            map4.put("serverId", new TableInfo.Column("serverId", "TEXT", true, 1, null, 1));
            map4.put("startTime", new TableInfo.Column("startTime", "INTEGER", true, 0, null, 1));
            map4.put("endTime", new TableInfo.Column("endTime", "INTEGER", true, 0, null, 1));
            map4.put(EcgData.TIMESTAMP_SERVER_UPDATED, new TableInfo.Column(EcgData.TIMESTAMP_SERVER_UPDATED, "INTEGER", false, 0, null, 1));
            TableInfo tableInfo7 = new TableInfo("DeletedMenstruationSection", map4, new HashSet(0), new HashSet(0));
            TableInfo tableInfo8 = TableInfo.read(_db, "DeletedMenstruationSection");
            if (!tableInfo7.equals(tableInfo8)) {
                return new RoomOpenHelper.ValidationResult(false, "DeletedMenstruationSection(com.huami.femalehealth.logiclib.db.po.DeletedMenstruationSection).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfo8);
            }
            HashMap map5 = new HashMap(8);
            map5.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
            map5.put("cycle", new TableInfo.Column("cycle", "INTEGER", true, 0, null, 1));
            map5.put("menstrualPeriod", new TableInfo.Column("menstrualPeriod", "INTEGER", true, 0, null, 1));
            map5.put("menstrualEndTime", new TableInfo.Column("menstrualEndTime", "INTEGER", false, 0, null, 1));
            map5.put("month", new TableInfo.Column("month", "INTEGER", true, 0, null, 1));
            map5.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
            map5.put(EcgData.TIMESTAMP_SERVER_UPDATED, new TableInfo.Column(EcgData.TIMESTAMP_SERVER_UPDATED, "INTEGER", false, 0, null, 1));
            map5.put("end", new TableInfo.Column("end", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo9 = new TableInfo("HistoryItemBean", map5, new HashSet(0), new HashSet(0));
            TableInfo tableInfo10 = TableInfo.read(_db, "HistoryItemBean");
            if (tableInfo9.equals(tableInfo10)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "HistoryItemBean(com.huami.femalehealth.logiclib.api.pojo.HistoryItemBean).\n Expected:\n" + tableInfo9 + "\n Found:\n" + tableInfo10);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        boolean z = Build.VERSION.SDK_INT >= 21;
        if (!z) {
            try {
                writableDatabase.execSQL("PRAGMA foreign_keys = FALSE");
            } finally {
                super.endTransaction();
                if (!z) {
                    writableDatabase.execSQL("PRAGMA foreign_keys = TRUE");
                }
                writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
                if (!writableDatabase.inTransaction()) {
                    writableDatabase.execSQL("VACUUM");
                }
            }
        }
        super.beginTransaction();
        if (z) {
            writableDatabase.execSQL("PRAGMA defer_foreign_keys = TRUE");
        }
        writableDatabase.execSQL("DELETE FROM `MenstruationRecord`");
        writableDatabase.execSQL("DELETE FROM `Symptom`");
        writableDatabase.execSQL("DELETE FROM `MenstruationHistory`");
        writableDatabase.execSQL("DELETE FROM `DeletedMenstruationSection`");
        writableDatabase.execSQL("DELETE FROM `HistoryItemBean`");
        super.setTransactionSuccessful();
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "MenstruationRecord", "Symptom", "MenstruationHistory", "DeletedMenstruationSection", "HistoryItemBean");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new RoomOpenHelper(configuration, new a(15), "64bb1e401991bff3d719057eef2be89b", "e0fa952df5d3d43bc671411379462222")).build());
    }

    @Override // com.huami.femalehealth.logiclib.db.FemaleHealthDb
    public DeleteHistoryDao deleteHistoryDao() {
        DeleteHistoryDao deleteHistoryDao;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = new DeleteHistoryDao_Impl(this);
            }
            deleteHistoryDao = this.b;
        }
        return deleteHistoryDao;
    }

    @Override // com.huami.femalehealth.logiclib.db.FemaleHealthDb
    public HistoryDao historyDao() {
        HistoryDao historyDao;
        if (this.a != null) {
            return this.a;
        }
        synchronized (this) {
            if (this.a == null) {
                this.a = new HistoryDao_Impl(this);
            }
            historyDao = this.a;
        }
        return historyDao;
    }

    @Override // com.huami.femalehealth.logiclib.db.FemaleHealthDb
    public HistoryItemDao historyItemDao() {
        HistoryItemDao historyItemDao;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c == null) {
                this.c = new HistoryItemDao_Impl(this);
            }
            historyItemDao = this.c;
        }
        return historyItemDao;
    }
}
