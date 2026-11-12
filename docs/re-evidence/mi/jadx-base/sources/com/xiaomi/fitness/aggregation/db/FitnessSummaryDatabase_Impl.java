package com.xiaomi.fitness.aggregation.db;

import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.xiaomi.fit.fitness.persist.db.internal.SportSummaryDao;
import com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDao;
import com.xiaomi.fitness.aggregation.health.dao.FitnessDeviceListDao;
import com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDao;
import com.xiaomi.fitness.aggregation.health.dao.RainbowEntityDao;
import com.xiaomi.fitness.aggregation.health.dao.RedDotDao;
import com.xiaomi.fitness.aggregation.health.dao.StatEntityDao;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import defpackage.bdi;
import defpackage.cco;
import defpackage.l3o;
import defpackage.lq9;
import defpackage.np9;
import defpackage.qaj;
import defpackage.tak;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class FitnessSummaryDatabase_Impl extends FitnessSummaryDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile RainbowEntityDao f11571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile FitnessDailyReportDao f11572b;
    public volatile FitnessDeviceListDao c;
    public volatile RedDotDao d;
    public volatile SportSummaryDao e;
    public volatile StatEntityDao f;
    public volatile ProjectEntityDao g;

    public class a extends RoomOpenDelegate {
        public a(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `rainbow` (`timeInZero` INTEGER NOT NULL, `value` TEXT NOT NULL, `isUpload` INTEGER NOT NULL, PRIMARY KEY(`timeInZero`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `daily_report` (`sid` TEXT NOT NULL, `dataType` TEXT NOT NULL, `updateTime` INTEGER NOT NULL, `timeInZero` INTEGER NOT NULL, `viewTag` TEXT NOT NULL, `value` TEXT NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`dataType`, `sid`, `timeInZero`, `viewTag`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `device_list` (`sid` TEXT NOT NULL, `dataType` TEXT NOT NULL, `updateTime` INTEGER NOT NULL, `timeInZero` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`dataType`, `sid`, `timeInZero`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `sport_summary` (`category` TEXT NOT NULL, `dimen` TEXT NOT NULL, `timeIn0TZ` INTEGER NOT NULL, `zoneOffsetSec` INTEGER NOT NULL, `summary` TEXT NOT NULL, PRIMARY KEY(`category`, `dimen`, `timeIn0TZ`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `red_dot` (`sid` TEXT NOT NULL, `dataType` TEXT NOT NULL, `updateTime` INTEGER NOT NULL, `timeInZero` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`dataType`, `timeInZero`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `stat_data` (`tag` TEXT NOT NULL, `key` TEXT NOT NULL, `time` INTEGER NOT NULL, `zoneOffset` INTEGER NOT NULL, `timeInZero` INTEGER NOT NULL, `value` TEXT NOT NULL, `updateTime` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`tag`, `key`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `data_project` (`sid` TEXT NOT NULL, `key` TEXT NOT NULL, `projectId` INTEGER NOT NULL, `time` INTEGER NOT NULL, `zoneOffset` INTEGER NOT NULL, `timeInZero` INTEGER NOT NULL, `value` TEXT NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `time`, `sid`, `projectId`))");
            SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'afc424dc1960a9a47deeb2771e15abc2')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `rainbow`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `daily_report`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `device_list`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `sport_summary`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `red_dot`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `stat_data`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `data_project`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection sQLiteConnection) {
            FitnessSummaryDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
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
            HashMap map = new HashMap(3);
            map.put("timeInZero", new TableInfo.Column("timeInZero", "INTEGER", true, 1, null, 1));
            map.put("value", new TableInfo.Column("value", "TEXT", true, 0, null, 1));
            map.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("rainbow", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "rainbow");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenDelegate.ValidationResult(false, "rainbow(com.xiaomi.fitness.aggregation.health.entity.RainbowReportEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(8);
            map2.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map2.put("dataType", new TableInfo.Column("dataType", "TEXT", true, 1, null, 1));
            map2.put("updateTime", new TableInfo.Column("updateTime", "INTEGER", true, 0, null, 1));
            map2.put("timeInZero", new TableInfo.Column("timeInZero", "INTEGER", true, 3, null, 1));
            map2.put(CloudContract.COL_VIEW_TAG, new TableInfo.Column(CloudContract.COL_VIEW_TAG, "TEXT", true, 4, null, 1));
            map2.put("value", new TableInfo.Column("value", "TEXT", true, 0, null, 1));
            map2.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map2.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo("daily_report", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "daily_report");
            if (!tableInfo3.equals(tableInfo4)) {
                return new RoomOpenDelegate.ValidationResult(false, "daily_report(com.xiaomi.fitness.aggregation.health.entity.FitnessDailyReportEntity).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
            }
            HashMap map3 = new HashMap(6);
            map3.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map3.put("dataType", new TableInfo.Column("dataType", "TEXT", true, 1, null, 1));
            map3.put("updateTime", new TableInfo.Column("updateTime", "INTEGER", true, 0, null, 1));
            map3.put("timeInZero", new TableInfo.Column("timeInZero", "INTEGER", true, 3, null, 1));
            map3.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map3.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo5 = new TableInfo(CloudContract.TABLE_DEVICE_LIST, map3, new HashSet(0), new HashSet(0));
            TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, CloudContract.TABLE_DEVICE_LIST);
            if (!tableInfo5.equals(tableInfo6)) {
                return new RoomOpenDelegate.ValidationResult(false, "device_list(com.xiaomi.fitness.aggregation.health.entity.FitnessDeviceItemEntity).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
            }
            HashMap map4 = new HashMap(5);
            map4.put("category", new TableInfo.Column("category", "TEXT", true, 1, null, 1));
            map4.put("dimen", new TableInfo.Column("dimen", "TEXT", true, 2, null, 1));
            map4.put("timeIn0TZ", new TableInfo.Column("timeIn0TZ", "INTEGER", true, 3, null, 1));
            map4.put("zoneOffsetSec", new TableInfo.Column("zoneOffsetSec", "INTEGER", true, 0, null, 1));
            map4.put("summary", new TableInfo.Column("summary", "TEXT", true, 0, null, 1));
            TableInfo tableInfo7 = new TableInfo("sport_summary", map4, new HashSet(0), new HashSet(0));
            TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "sport_summary");
            if (!tableInfo7.equals(tableInfo8)) {
                return new RoomOpenDelegate.ValidationResult(false, "sport_summary(com.xiaomi.fit.fitness.persist.db.internal.SportSummaryEntity).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfo8);
            }
            HashMap map5 = new HashMap(6);
            map5.put("sid", new TableInfo.Column("sid", "TEXT", true, 0, null, 1));
            map5.put("dataType", new TableInfo.Column("dataType", "TEXT", true, 1, null, 1));
            map5.put("updateTime", new TableInfo.Column("updateTime", "INTEGER", true, 0, null, 1));
            map5.put("timeInZero", new TableInfo.Column("timeInZero", "INTEGER", true, 2, null, 1));
            map5.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map5.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo9 = new TableInfo("red_dot", map5, new HashSet(0), new HashSet(0));
            TableInfo tableInfo10 = TableInfo.read(sQLiteConnection, "red_dot");
            if (!tableInfo9.equals(tableInfo10)) {
                return new RoomOpenDelegate.ValidationResult(false, "red_dot(com.xiaomi.fitness.aggregation.health.entity.RedDotEntity).\n Expected:\n" + tableInfo9 + "\n Found:\n" + tableInfo10);
            }
            HashMap map6 = new HashMap(9);
            map6.put("tag", new TableInfo.Column("tag", "TEXT", true, 1, null, 1));
            map6.put("key", new TableInfo.Column("key", "TEXT", true, 2, null, 1));
            map6.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map6.put(CloudContract.COL_ZONE_OFFSET, new TableInfo.Column(CloudContract.COL_ZONE_OFFSET, "INTEGER", true, 0, null, 1));
            map6.put("timeInZero", new TableInfo.Column("timeInZero", "INTEGER", true, 0, null, 1));
            map6.put("value", new TableInfo.Column("value", "TEXT", true, 0, null, 1));
            map6.put("updateTime", new TableInfo.Column("updateTime", "INTEGER", true, 0, null, 1));
            map6.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map6.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo11 = new TableInfo(CloudContract.TABLE_STAT, map6, new HashSet(0), new HashSet(0));
            TableInfo tableInfo12 = TableInfo.read(sQLiteConnection, CloudContract.TABLE_STAT);
            if (!tableInfo11.equals(tableInfo12)) {
                return new RoomOpenDelegate.ValidationResult(false, "stat_data(com.xiaomi.fitness.aggregation.health.entity.StatDataEntity).\n Expected:\n" + tableInfo11 + "\n Found:\n" + tableInfo12);
            }
            HashMap map7 = new HashMap(9);
            map7.put("sid", new TableInfo.Column("sid", "TEXT", true, 3, null, 1));
            map7.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map7.put(CloudContract.COL_PROJECT_ID, new TableInfo.Column(CloudContract.COL_PROJECT_ID, "INTEGER", true, 4, null, 1));
            map7.put("time", new TableInfo.Column("time", "INTEGER", true, 2, null, 1));
            map7.put(CloudContract.COL_ZONE_OFFSET, new TableInfo.Column(CloudContract.COL_ZONE_OFFSET, "INTEGER", true, 0, null, 1));
            map7.put("timeInZero", new TableInfo.Column("timeInZero", "INTEGER", true, 0, null, 1));
            map7.put("value", new TableInfo.Column("value", "TEXT", true, 0, null, 1));
            map7.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map7.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo13 = new TableInfo(CloudContract.TABLE_DATA_PROJECT, map7, new HashSet(0), new HashSet(0));
            TableInfo tableInfo14 = TableInfo.read(sQLiteConnection, CloudContract.TABLE_DATA_PROJECT);
            if (tableInfo13.equals(tableInfo14)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "data_project(com.xiaomi.fitness.aggregation.health.entity.ProjectEntity).\n Expected:\n" + tableInfo13 + "\n Found:\n" + tableInfo14);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "rainbow", "daily_report", CloudContract.TABLE_DEVICE_LIST, "sport_summary", "red_dot", CloudContract.TABLE_STAT, CloudContract.TABLE_DATA_PROJECT);
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "rainbow", "daily_report", CloudContract.TABLE_DEVICE_LIST, "sport_summary", "red_dot", CloudContract.TABLE_STAT, CloudContract.TABLE_DATA_PROJECT);
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return new ArrayList();
    }

    @Override // com.xiaomi.fitness.aggregation.db.FitnessSummaryDatabase
    public RainbowEntityDao getDailyGoalReportDao() {
        RainbowEntityDao rainbowEntityDao;
        if (this.f11571a != null) {
            return this.f11571a;
        }
        synchronized (this) {
            try {
                if (this.f11571a == null) {
                    this.f11571a = new qaj(this);
                }
                rainbowEntityDao = this.f11571a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rainbowEntityDao;
    }

    @Override // com.xiaomi.fitness.aggregation.db.FitnessSummaryDatabase
    public FitnessDeviceListDao getDevicesListDao() {
        FitnessDeviceListDao fitnessDeviceListDao;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            try {
                if (this.c == null) {
                    this.c = new lq9(this);
                }
                fitnessDeviceListDao = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fitnessDeviceListDao;
    }

    @Override // com.xiaomi.fitness.aggregation.db.FitnessSummaryDatabase
    public FitnessDailyReportDao getFitnessDailyReportDao() {
        FitnessDailyReportDao fitnessDailyReportDao;
        if (this.f11572b != null) {
            return this.f11572b;
        }
        synchronized (this) {
            try {
                if (this.f11572b == null) {
                    this.f11572b = new np9(this);
                }
                fitnessDailyReportDao = this.f11572b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fitnessDailyReportDao;
    }

    @Override // com.xiaomi.fitness.aggregation.db.FitnessSummaryDatabase
    public RedDotDao getRedDotDao() {
        RedDotDao redDotDao;
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            try {
                if (this.d == null) {
                    this.d = new tak(this);
                }
                redDotDao = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return redDotDao;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(RainbowEntityDao.class, qaj.j());
        map.put(FitnessDailyReportDao.class, np9.n());
        map.put(FitnessDeviceListDao.class, lq9.f());
        map.put(RedDotDao.class, tak.k());
        map.put(SportSummaryDao.class, l3o.l());
        map.put(StatEntityDao.class, cco.i());
        map.put(ProjectEntityDao.class, bdi.l());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new a(6, "afc424dc1960a9a47deeb2771e15abc2", "69f2efc3bbebec6e3e78cf10575ade25");
    }

    @Override // com.xiaomi.fitness.aggregation.db.FitnessSummaryDatabase
    public ProjectEntityDao sleepProjectEntityDao() {
        ProjectEntityDao projectEntityDao;
        if (this.g != null) {
            return this.g;
        }
        synchronized (this) {
            try {
                if (this.g == null) {
                    this.g = new bdi(this);
                }
                projectEntityDao = this.g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return projectEntityDao;
    }

    @Override // com.xiaomi.fitness.aggregation.db.FitnessSummaryDatabase
    public SportSummaryDao sportSummaryDao() {
        SportSummaryDao sportSummaryDao;
        if (this.e != null) {
            return this.e;
        }
        synchronized (this) {
            try {
                if (this.e == null) {
                    this.e = new l3o(this);
                }
                sportSummaryDao = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sportSummaryDao;
    }

    @Override // com.xiaomi.fitness.aggregation.db.FitnessSummaryDatabase
    public StatEntityDao statEntityDao() {
        StatEntityDao statEntityDao;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new cco(this);
                }
                statEntityDao = this.f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return statEntityDao;
    }
}
