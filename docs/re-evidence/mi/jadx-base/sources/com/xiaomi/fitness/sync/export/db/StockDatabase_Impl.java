package com.xiaomi.fitness.sync.export.db;

import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import defpackage.dgo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class StockDatabase_Impl extends StockDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile StockDao f13240a;

    public class a extends RoomOpenDelegate {
        public a(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `StockInfo` (`symbol` TEXT NOT NULL, `market` TEXT NOT NULL, `nameCN` TEXT NOT NULL, `latestPrice` REAL NOT NULL, `preClose` REAL NOT NULL, `halted` INTEGER NOT NULL, `delay` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `updateTimestamp` INTEGER NOT NULL, PRIMARY KEY(`symbol`))");
            SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f3ae0d4ca0b11a34e45c6e1c6a4f9f0c')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `StockInfo`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection sQLiteConnection) {
            StockDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onPostMigrate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onPreMigrate(SQLiteConnection sQLiteConnection) {
            DBUtil.dropFtsSyncTriggers(sQLiteConnection);
        }

        @Override // androidx.room.RoomOpenDelegate
        public RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection sQLiteConnection) {
            HashMap map = new HashMap(9);
            map.put("symbol", new TableInfo.Column("symbol", "TEXT", true, 1, null, 1));
            map.put("market", new TableInfo.Column("market", "TEXT", true, 0, null, 1));
            map.put("nameCN", new TableInfo.Column("nameCN", "TEXT", true, 0, null, 1));
            map.put("latestPrice", new TableInfo.Column("latestPrice", "REAL", true, 0, null, 1));
            map.put("preClose", new TableInfo.Column("preClose", "REAL", true, 0, null, 1));
            map.put("halted", new TableInfo.Column("halted", "INTEGER", true, 0, null, 1));
            map.put("delay", new TableInfo.Column("delay", "INTEGER", true, 0, null, 1));
            map.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
            map.put("updateTimestamp", new TableInfo.Column("updateTimestamp", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("StockInfo", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "StockInfo");
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "StockInfo(com.xiaomi.fitness.sync.export.db.StockInfoEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "StockInfo");
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "StockInfo");
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(StockDao.class, dgo.h());
        return map;
    }

    @Override // com.xiaomi.fitness.sync.export.db.StockDatabase
    public StockDao getStockDao() {
        StockDao stockDao;
        if (this.f13240a != null) {
            return this.f13240a;
        }
        synchronized (this) {
            try {
                if (this.f13240a == null) {
                    this.f13240a = new dgo(this);
                }
                stockDao = this.f13240a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return stockDao;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new a(1, "f3ae0d4ca0b11a34e45c6e1c6a4f9f0c", "e811dbd9ee5bd43c86e46aef13528c35");
    }
}
