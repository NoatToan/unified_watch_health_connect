package com.xiaomi.fitness.account.user;

import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import defpackage.gfq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class UserDatabase_Impl extends UserDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile UserDao f11558a;

    public class a extends RoomOpenDelegate {
        public a(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `user_info_profile` (`name` TEXT NOT NULL, `icon` TEXT, `sex` TEXT, `birth` TEXT, `height` REAL NOT NULL, `weight` REAL NOT NULL, `region` TEXT, `vo2_max` INTEGER NOT NULL, `max_hrm` INTEGER NOT NULL, `min_hrm` INTEGER NOT NULL, `record_max_hrm` TEXT, `source` TEXT, `daily_cal_goal` INTEGER NOT NULL, `daily_step_goal` INTEGER NOT NULL, `daily_sleep_goal` INTEGER NOT NULL, `regular_goal_list` TEXT, `special_mark` INTEGER NOT NULL, `initial_weight` REAL NOT NULL, `initial_timestamp` INTEGER NOT NULL, `maximal_met` REAL NOT NULL, `wear_medal` TEXT, `dids` TEXT, PRIMARY KEY(`name`))");
            SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6fad02898a1a7ca0057930f17f224626')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `user_info_profile`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection sQLiteConnection) {
            UserDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
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
            HashMap map = new HashMap(22);
            map.put("name", new TableInfo.Column("name", "TEXT", true, 1, null, 1));
            map.put("icon", new TableInfo.Column("icon", "TEXT", false, 0, null, 1));
            map.put("sex", new TableInfo.Column("sex", "TEXT", false, 0, null, 1));
            map.put(MedicalIdSPContract.PREF_BIRTHDAY, new TableInfo.Column(MedicalIdSPContract.PREF_BIRTHDAY, "TEXT", false, 0, null, 1));
            map.put("height", new TableInfo.Column("height", "REAL", true, 0, null, 1));
            map.put("weight", new TableInfo.Column("weight", "REAL", true, 0, null, 1));
            map.put("region", new TableInfo.Column("region", "TEXT", false, 0, null, 1));
            map.put(FitnessPersistKey.Vo2Max, new TableInfo.Column(FitnessPersistKey.Vo2Max, "INTEGER", true, 0, null, 1));
            map.put("max_hrm", new TableInfo.Column("max_hrm", "INTEGER", true, 0, null, 1));
            map.put("min_hrm", new TableInfo.Column("min_hrm", "INTEGER", true, 0, null, 1));
            map.put("record_max_hrm", new TableInfo.Column("record_max_hrm", "TEXT", false, 0, null, 1));
            map.put("source", new TableInfo.Column("source", "TEXT", false, 0, null, 1));
            map.put("daily_cal_goal", new TableInfo.Column("daily_cal_goal", "INTEGER", true, 0, null, 1));
            map.put("daily_step_goal", new TableInfo.Column("daily_step_goal", "INTEGER", true, 0, null, 1));
            map.put("daily_sleep_goal", new TableInfo.Column("daily_sleep_goal", "INTEGER", true, 0, null, 1));
            map.put("regular_goal_list", new TableInfo.Column("regular_goal_list", "TEXT", false, 0, null, 1));
            map.put("special_mark", new TableInfo.Column("special_mark", "INTEGER", true, 0, null, 1));
            map.put("initial_weight", new TableInfo.Column("initial_weight", "REAL", true, 0, null, 1));
            map.put("initial_timestamp", new TableInfo.Column("initial_timestamp", "INTEGER", true, 0, null, 1));
            map.put("maximal_met", new TableInfo.Column("maximal_met", "REAL", true, 0, null, 1));
            map.put("wear_medal", new TableInfo.Column("wear_medal", "TEXT", false, 0, null, 1));
            map.put("dids", new TableInfo.Column("dids", "TEXT", false, 0, null, 1));
            TableInfo tableInfo = new TableInfo(UserConstant.TAB_USER_PROFILE, map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, UserConstant.TAB_USER_PROFILE);
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "user_info_profile(com.xiaomi.fitness.account.user.UserInfoProfile).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, UserConstant.TAB_USER_PROFILE);
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), UserConstant.TAB_USER_PROFILE);
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
        map.put(UserDao.class, gfq.h());
        return map;
    }

    @Override // com.xiaomi.fitness.account.user.UserDatabase
    public UserDao getUserDao() {
        UserDao userDao;
        if (this.f11558a != null) {
            return this.f11558a;
        }
        synchronized (this) {
            try {
                if (this.f11558a == null) {
                    this.f11558a = new gfq(this);
                }
                userDao = this.f11558a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return userDao;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new a(3, "6fad02898a1a7ca0057930f17f224626", "be23e5125b413f2e0703279679e79039");
    }
}
