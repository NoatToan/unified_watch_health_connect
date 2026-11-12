package androidx.work.impl;

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
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.PreferenceDao;
import androidx.work.impl.model.RawWorkInfoDao;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.gnr;
import defpackage.gz5;
import defpackage.hnr;
import defpackage.n6i;
import defpackage.nnr;
import defpackage.rmr;
import defpackage.smr;
import defpackage.tmr;
import defpackage.umr;
import defpackage.vmr;
import defpackage.wmr;
import defpackage.xmr;
import defpackage.ymr;
import defpackage.zvo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile WorkSpecDao f3189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile DependencyDao f3190b;
    public volatile WorkTagDao c;
    public volatile SystemIdInfoDao d;
    public volatile WorkNameDao e;
    public volatile WorkProgressDao f;
    public volatile PreferenceDao g;
    public volatile RawWorkInfoDao h;

    public class a extends RoomOpenHelper.Delegate {
        public a(int i) {
            super(i);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Dependency`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkTag`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkName`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Preference`");
            List list = ((RoomDatabase) WorkDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.Callback) it.next()).onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            List list = ((RoomDatabase) WorkDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.Callback) it.next()).onCreate(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            ((RoomDatabase) WorkDatabase_Impl.this).mDatabase = supportSQLiteDatabase;
            supportSQLiteDatabase.execSQL("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            List list = ((RoomDatabase) WorkDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.Callback) it.next()).onOpen(supportSQLiteDatabase);
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
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new TableInfo.Column("work_spec_id", "TEXT", true, 1, null, 1));
            map.put("prerequisite_id", new TableInfo.Column("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new TableInfo.Index("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet2.add(new TableInfo.Index("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            TableInfo tableInfo = new TableInfo("Dependency", map, hashSet, hashSet2);
            TableInfo tableInfo2 = TableInfo.read(supportSQLiteDatabase, "Dependency");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(32);
            map2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
            map2.put("state", new TableInfo.Column("state", "INTEGER", true, 0, null, 1));
            map2.put("worker_class_name", new TableInfo.Column("worker_class_name", "TEXT", true, 0, null, 1));
            map2.put("input_merger_class_name", new TableInfo.Column("input_merger_class_name", "TEXT", true, 0, null, 1));
            map2.put("input", new TableInfo.Column("input", "BLOB", true, 0, null, 1));
            map2.put("output", new TableInfo.Column("output", "BLOB", true, 0, null, 1));
            map2.put("initial_delay", new TableInfo.Column("initial_delay", "INTEGER", true, 0, null, 1));
            map2.put("interval_duration", new TableInfo.Column("interval_duration", "INTEGER", true, 0, null, 1));
            map2.put("flex_duration", new TableInfo.Column("flex_duration", "INTEGER", true, 0, null, 1));
            map2.put("run_attempt_count", new TableInfo.Column("run_attempt_count", "INTEGER", true, 0, null, 1));
            map2.put("backoff_policy", new TableInfo.Column("backoff_policy", "INTEGER", true, 0, null, 1));
            map2.put("backoff_delay_duration", new TableInfo.Column("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            map2.put("last_enqueue_time", new TableInfo.Column("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
            map2.put("minimum_retention_duration", new TableInfo.Column("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            map2.put("schedule_requested_at", new TableInfo.Column("schedule_requested_at", "INTEGER", true, 0, null, 1));
            map2.put("run_in_foreground", new TableInfo.Column("run_in_foreground", "INTEGER", true, 0, null, 1));
            map2.put("out_of_quota_policy", new TableInfo.Column("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            map2.put("period_count", new TableInfo.Column("period_count", "INTEGER", true, 0, "0", 1));
            map2.put("generation", new TableInfo.Column("generation", "INTEGER", true, 0, "0", 1));
            map2.put("next_schedule_time_override", new TableInfo.Column("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
            map2.put("next_schedule_time_override_generation", new TableInfo.Column("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
            map2.put("stop_reason", new TableInfo.Column("stop_reason", "INTEGER", true, 0, "-256", 1));
            map2.put("trace_tag", new TableInfo.Column("trace_tag", "TEXT", false, 0, null, 1));
            map2.put("required_network_type", new TableInfo.Column("required_network_type", "INTEGER", true, 0, null, 1));
            map2.put("required_network_request", new TableInfo.Column("required_network_request", "BLOB", true, 0, "x''", 1));
            map2.put("requires_charging", new TableInfo.Column("requires_charging", "INTEGER", true, 0, null, 1));
            map2.put("requires_device_idle", new TableInfo.Column("requires_device_idle", "INTEGER", true, 0, null, 1));
            map2.put("requires_battery_not_low", new TableInfo.Column("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            map2.put("requires_storage_not_low", new TableInfo.Column("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            map2.put("trigger_content_update_delay", new TableInfo.Column("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            map2.put("trigger_max_content_delay", new TableInfo.Column("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            map2.put("content_uri_triggers", new TableInfo.Column("content_uri_triggers", "BLOB", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new TableInfo.Index("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet4.add(new TableInfo.Index("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            TableInfo tableInfo3 = new TableInfo("WorkSpec", map2, hashSet3, hashSet4);
            TableInfo tableInfo4 = TableInfo.read(supportSQLiteDatabase, "WorkSpec");
            if (!tableInfo3.equals(tableInfo4)) {
                return new RoomOpenHelper.ValidationResult(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new TableInfo.Column("tag", "TEXT", true, 1, null, 1));
            map3.put("work_spec_id", new TableInfo.Column("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new TableInfo.Index("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            TableInfo tableInfo5 = new TableInfo("WorkTag", map3, hashSet5, hashSet6);
            TableInfo tableInfo6 = TableInfo.read(supportSQLiteDatabase, "WorkTag");
            if (!tableInfo5.equals(tableInfo6)) {
                return new RoomOpenHelper.ValidationResult(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
            }
            HashMap map4 = new HashMap(3);
            map4.put("work_spec_id", new TableInfo.Column("work_spec_id", "TEXT", true, 1, null, 1));
            map4.put("generation", new TableInfo.Column("generation", "INTEGER", true, 2, "0", 1));
            map4.put("system_id", new TableInfo.Column("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            TableInfo tableInfo7 = new TableInfo("SystemIdInfo", map4, hashSet7, new HashSet(0));
            TableInfo tableInfo8 = TableInfo.read(supportSQLiteDatabase, "SystemIdInfo");
            if (!tableInfo7.equals(tableInfo8)) {
                return new RoomOpenHelper.ValidationResult(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfo8);
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new TableInfo.Column("name", "TEXT", true, 1, null, 1));
            map5.put("work_spec_id", new TableInfo.Column("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new TableInfo.Index("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            TableInfo tableInfo9 = new TableInfo("WorkName", map5, hashSet8, hashSet9);
            TableInfo tableInfo10 = TableInfo.read(supportSQLiteDatabase, "WorkName");
            if (!tableInfo9.equals(tableInfo10)) {
                return new RoomOpenHelper.ValidationResult(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + tableInfo9 + "\n Found:\n" + tableInfo10);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new TableInfo.Column("work_spec_id", "TEXT", true, 1, null, 1));
            map6.put(BroadcastsKt.SILENT_PUSHING_PROGRESS, new TableInfo.Column(BroadcastsKt.SILENT_PUSHING_PROGRESS, "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            TableInfo tableInfo11 = new TableInfo("WorkProgress", map6, hashSet10, new HashSet(0));
            TableInfo tableInfo12 = TableInfo.read(supportSQLiteDatabase, "WorkProgress");
            if (!tableInfo11.equals(tableInfo12)) {
                return new RoomOpenHelper.ValidationResult(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + tableInfo11 + "\n Found:\n" + tableInfo12);
            }
            HashMap map7 = new HashMap(2);
            map7.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map7.put("long_value", new TableInfo.Column("long_value", "INTEGER", false, 0, null, 1));
            TableInfo tableInfo13 = new TableInfo("Preference", map7, new HashSet(0), new HashSet(0));
            TableInfo tableInfo14 = TableInfo.read(supportSQLiteDatabase, "Preference");
            if (tableInfo13.equals(tableInfo14)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + tableInfo13 + "\n Found:\n" + tableInfo14);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("PRAGMA defer_foreign_keys = TRUE");
            writableDatabase.execSQL("DELETE FROM `Dependency`");
            writableDatabase.execSQL("DELETE FROM `WorkSpec`");
            writableDatabase.execSQL("DELETE FROM `WorkTag`");
            writableDatabase.execSQL("DELETE FROM `SystemIdInfo`");
            writableDatabase.execSQL("DELETE FROM `WorkName`");
            writableDatabase.execSQL("DELETE FROM `WorkProgress`");
            writableDatabase.execSQL("DELETE FROM `Preference`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new a(23), "86254750241babac4b8d52996a675549", "1cbd3130fa23b59692c061c594c16cc0")).build());
    }

    @Override // androidx.work.impl.WorkDatabase
    public DependencyDao dependencyDao() {
        DependencyDao dependencyDao;
        if (this.f3190b != null) {
            return this.f3190b;
        }
        synchronized (this) {
            try {
                if (this.f3190b == null) {
                    this.f3190b = new gz5(this);
                }
                dependencyDao = this.f3190b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dependencyDao;
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new rmr());
        arrayList.add(new smr());
        arrayList.add(new tmr());
        arrayList.add(new umr());
        arrayList.add(new vmr());
        arrayList.add(new wmr());
        arrayList.add(new xmr());
        arrayList.add(new ymr());
        return arrayList;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(WorkSpecDao.class, androidx.work.impl.model.b.h());
        map.put(DependencyDao.class, gz5.a());
        map.put(WorkTagDao.class, nnr.a());
        map.put(SystemIdInfoDao.class, zvo.a());
        map.put(WorkNameDao.class, gnr.a());
        map.put(WorkProgressDao.class, hnr.a());
        map.put(PreferenceDao.class, n6i.b());
        map.put(RawWorkInfoDao.class, androidx.work.impl.model.a.h());
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    public PreferenceDao preferenceDao() {
        PreferenceDao preferenceDao;
        if (this.g != null) {
            return this.g;
        }
        synchronized (this) {
            try {
                if (this.g == null) {
                    this.g = new n6i(this);
                }
                preferenceDao = this.g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return preferenceDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    public RawWorkInfoDao rawWorkInfoDao() {
        RawWorkInfoDao rawWorkInfoDao;
        if (this.h != null) {
            return this.h;
        }
        synchronized (this) {
            try {
                if (this.h == null) {
                    this.h = new androidx.work.impl.model.a(this);
                }
                rawWorkInfoDao = this.h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rawWorkInfoDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    public SystemIdInfoDao systemIdInfoDao() {
        SystemIdInfoDao systemIdInfoDao;
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            try {
                if (this.d == null) {
                    this.d = new zvo(this);
                }
                systemIdInfoDao = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return systemIdInfoDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    public WorkNameDao workNameDao() {
        WorkNameDao workNameDao;
        if (this.e != null) {
            return this.e;
        }
        synchronized (this) {
            try {
                if (this.e == null) {
                    this.e = new gnr(this);
                }
                workNameDao = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return workNameDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    public WorkProgressDao workProgressDao() {
        WorkProgressDao workProgressDao;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new hnr(this);
                }
                workProgressDao = this.f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return workProgressDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    public WorkSpecDao workSpecDao() {
        WorkSpecDao workSpecDao;
        if (this.f3189a != null) {
            return this.f3189a;
        }
        synchronized (this) {
            try {
                if (this.f3189a == null) {
                    this.f3189a = new androidx.work.impl.model.b(this);
                }
                workSpecDao = this.f3189a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return workSpecDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    public WorkTagDao workTagDao() {
        WorkTagDao workTagDao;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            try {
                if (this.c == null) {
                    this.c = new nnr(this);
                }
                workTagDao = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return workTagDao;
    }
}
