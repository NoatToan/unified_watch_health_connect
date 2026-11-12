package com.xiaomi.fitness.habit.persist;

import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.xiaomi.fitness.habit.persist.dao.HabitDao;
import com.xiaomi.fitness.habit.ui.HabitShareActivity;
import defpackage.web;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class HabitDatabase_Impl extends HabitDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile HabitDao f12185a;

    public class a extends RoomOpenDelegate {
        public a(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `habit` (`type` INTEGER NOT NULL, `clockMode` INTEGER NOT NULL, `weekDays` INTEGER NOT NULL, `isSyncWatch` INTEGER NOT NULL, `times` TEXT, `updateTime` INTEGER NOT NULL, `isEnable` INTEGER NOT NULL, `name` TEXT, `smallIcon` TEXT, `middleIcon` TEXT, `bigIcon` TEXT, `deviceBref` TEXT, `appBref` TEXT, `syncCalendar` INTEGER NOT NULL, `typeId` INTEGER NOT NULL, PRIMARY KEY(`type`))");
            SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b08fa68ad7039ae992e5500ee5ef4292')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `habit`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection sQLiteConnection) {
            HabitDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
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
            HashMap map = new HashMap(15);
            map.put("type", new TableInfo.Column("type", "INTEGER", true, 1, null, 1));
            map.put("clockMode", new TableInfo.Column("clockMode", "INTEGER", true, 0, null, 1));
            map.put("weekDays", new TableInfo.Column("weekDays", "INTEGER", true, 0, null, 1));
            map.put("isSyncWatch", new TableInfo.Column("isSyncWatch", "INTEGER", true, 0, null, 1));
            map.put("times", new TableInfo.Column("times", "TEXT", false, 0, null, 1));
            map.put("updateTime", new TableInfo.Column("updateTime", "INTEGER", true, 0, null, 1));
            map.put("isEnable", new TableInfo.Column("isEnable", "INTEGER", true, 0, null, 1));
            map.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, 1));
            map.put("smallIcon", new TableInfo.Column("smallIcon", "TEXT", false, 0, null, 1));
            map.put("middleIcon", new TableInfo.Column("middleIcon", "TEXT", false, 0, null, 1));
            map.put(HabitShareActivity.KEY_BIG_ICON, new TableInfo.Column(HabitShareActivity.KEY_BIG_ICON, "TEXT", false, 0, null, 1));
            map.put("deviceBref", new TableInfo.Column("deviceBref", "TEXT", false, 0, null, 1));
            map.put("appBref", new TableInfo.Column("appBref", "TEXT", false, 0, null, 1));
            map.put("syncCalendar", new TableInfo.Column("syncCalendar", "INTEGER", true, 0, null, 1));
            map.put("typeId", new TableInfo.Column("typeId", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("habit", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "habit");
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "habit(com.example.habit.export.Habit).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "habit");
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "habit");
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return new ArrayList();
    }

    @Override // com.xiaomi.fitness.habit.persist.HabitDatabase
    public HabitDao getHabitDao() {
        HabitDao habitDao;
        if (this.f12185a != null) {
            return this.f12185a;
        }
        synchronized (this) {
            try {
                if (this.f12185a == null) {
                    this.f12185a = new web(this);
                }
                habitDao = this.f12185a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return habitDao;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(HabitDao.class, web.i());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new a(1, "b08fa68ad7039ae992e5500ee5ef4292", "0ec7d7d570961620c23af1952aad5302");
    }
}
