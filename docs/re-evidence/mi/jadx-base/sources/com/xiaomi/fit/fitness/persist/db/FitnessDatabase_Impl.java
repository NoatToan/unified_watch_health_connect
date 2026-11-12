package com.xiaomi.fit.fitness.persist.db;

import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.persist.db.internal.AlgoCurseDao;
import com.xiaomi.fit.fitness.persist.db.internal.BPMedicalRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.BloodPressureRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.BloodSugarDao;
import com.xiaomi.fit.fitness.persist.db.internal.CaloriesRecordItemDao;
import com.xiaomi.fit.fitness.persist.db.internal.CurseObserverDao;
import com.xiaomi.fit.fitness.persist.db.internal.EcgMedicalRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.EnergyRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.ExtraDataDao;
import com.xiaomi.fit.fitness.persist.db.internal.FDSDataIdDao;
import com.xiaomi.fit.fitness.persist.db.internal.HealthConnectSyncDao;
import com.xiaomi.fit.fitness.persist.db.internal.HearingHealthRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.HrRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.LactateThresholdDao;
import com.xiaomi.fit.fitness.persist.db.internal.MHStrengthRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.PaiRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.PhysicalStatusDao;
import com.xiaomi.fit.fitness.persist.db.internal.RunAbilityRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.ServerRequestDao;
import com.xiaomi.fit.fitness.persist.db.internal.SleepSegmentDao;
import com.xiaomi.fit.fitness.persist.db.internal.Spo2RecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.SportReportDao;
import com.xiaomi.fit.fitness.persist.db.internal.SportReportObserverDao;
import com.xiaomi.fit.fitness.persist.db.internal.SportReportObserverKt;
import com.xiaomi.fit.fitness.persist.db.internal.StandRecordItemDao;
import com.xiaomi.fit.fitness.persist.db.internal.StepRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.StressRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.SwitchSongDao;
import com.xiaomi.fit.fitness.persist.db.internal.TemperatureCharacterRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.TemperatureRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.TemperatureTrendDao;
import com.xiaomi.fit.fitness.persist.db.internal.TrainingLoadRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.TrainingPlanCurDateDao;
import com.xiaomi.fit.fitness.persist.db.internal.TrainingPlanWeekDao;
import com.xiaomi.fit.fitness.persist.db.internal.VitalityRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.Vo2MaxRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.WeightItemDao;
import com.xiaomi.fit.fitness.persist.db.internal.WeightRecordDaoKt;
import com.xiaomi.fit.fitness.persist.db.internal.WomenHealthRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.a0;
import com.xiaomi.fit.fitness.persist.db.internal.b;
import com.xiaomi.fit.fitness.persist.db.internal.c;
import com.xiaomi.fit.fitness.persist.db.internal.d;
import com.xiaomi.fit.fitness.persist.db.internal.e;
import com.xiaomi.fit.fitness.persist.db.internal.f;
import com.xiaomi.fit.fitness.persist.db.internal.g;
import com.xiaomi.fit.fitness.persist.db.internal.h;
import com.xiaomi.fit.fitness.persist.db.internal.i;
import com.xiaomi.fit.fitness.persist.db.internal.j;
import com.xiaomi.fit.fitness.persist.db.internal.k;
import com.xiaomi.fit.fitness.persist.db.internal.l;
import com.xiaomi.fit.fitness.persist.db.internal.m;
import com.xiaomi.fit.fitness.persist.db.internal.n;
import com.xiaomi.fit.fitness.persist.db.internal.o;
import com.xiaomi.fit.fitness.persist.db.internal.p;
import com.xiaomi.fit.fitness.persist.db.internal.q;
import com.xiaomi.fit.fitness.persist.db.internal.r;
import com.xiaomi.fit.fitness.persist.db.internal.s;
import com.xiaomi.fit.fitness.persist.db.internal.t;
import com.xiaomi.fit.fitness.persist.db.internal.u;
import com.xiaomi.fit.fitness.persist.db.internal.v;
import com.xiaomi.fit.fitness.persist.db.internal.w;
import com.xiaomi.fit.fitness.persist.db.internal.x;
import com.xiaomi.fit.fitness.persist.db.internal.y;
import com.xiaomi.fit.fitness.persist.db.internal.z;
import com.xiaomi.fitness.aggregation.health.entity.CurseRecordDao;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.ga5;
import defpackage.hxl;
import defpackage.p51;
import defpackage.qyn;
import defpackage.s95;
import defpackage.uyn;
import defpackage.vup;
import defpackage.wro;
import defpackage.zl8;
import defpackage.zrb;
import defpackage.zvp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class FitnessDatabase_Impl extends FitnessDatabase {
    public volatile BPMedicalRecordDao A;
    public volatile BloodSugarDao B;
    public volatile PhysicalStatusDao C;
    public volatile LactateThresholdDao D;
    public volatile ExtraDataDao E;
    public volatile SwitchSongDao F;
    public volatile AlgoCurseDao G;
    public volatile TrainingPlanWeekDao H;
    public volatile TrainingPlanCurDateDao I;
    public volatile HealthConnectSyncDao J;
    public volatile TemperatureTrendDao K;
    public volatile TemperatureCharacterRecordDao L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile FDSDataIdDao f11325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile SportReportDao f11326b;
    public volatile SportReportObserverDao c;
    public volatile CurseObserverDao d;
    public volatile ServerRequestDao e;
    public volatile SleepSegmentDao f;
    public volatile HrRecordDao g;
    public volatile StepRecordDao h;
    public volatile CaloriesRecordItemDao i;
    public volatile MHStrengthRecordDao j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile StandRecordItemDao f11327k;
    public volatile EnergyRecordDao l;
    public volatile StressRecordDao m;
    public volatile Spo2RecordDao n;
    public volatile Vo2MaxRecordDao o;
    public volatile BloodPressureRecordDao p;
    public volatile HearingHealthRecordDao q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile WeightItemDao f11328r;
    public volatile WomenHealthRecordDao s;
    public volatile PaiRecordDao t;
    public volatile CurseRecordDao u;
    public volatile TrainingLoadRecordDao v;
    public volatile TemperatureRecordDao w;
    public volatile RunAbilityRecordDao x;
    public volatile VitalityRecordDao y;
    public volatile EcgMedicalRecordDao z;

    public class a extends RoomOpenDelegate {
        public a(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `sport_report` (`sid` TEXT NOT NULL, `key` TEXT NOT NULL, `time` INTEGER NOT NULL, `category` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `value` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, `offlineCounted` INTEGER NOT NULL, PRIMARY KEY(`sid`, `key`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `sleep_segment` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `isComplete` INTEGER NOT NULL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `server_request` (`action` TEXT NOT NULL, `key` TEXT NOT NULL, `watermark` INTEGER NOT NULL, `startTime` INTEGER NOT NULL, `endTime` INTEGER NOT NULL, `nextKey` TEXT, PRIMARY KEY(`action`, `key`, `endTime`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `hr_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `step_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `calorie_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `stand_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `mh_strength_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `energy_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `stress_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `spo2_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `v02max_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `blood_pressure_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `hearing_health_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `menstruation_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `weight_item_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `zeroTimeIn0Tz` INTEGER NOT NULL, `weight` REAL NOT NULL, `bmi` REAL, `bodyFatRate` REAL, `moistureRate` REAL, `boneMass` REAL, `basalMetabolism` INTEGER, `muscleMass` REAL, `proteinRate` REAL, `visceralFat` REAL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `curse_record` (`startSec0TZ` INTEGER NOT NULL, `endSec0TZ` INTEGER NOT NULL, `updateTime` INTEGER NOT NULL, `interval` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
            SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_curse_record_startSec0TZ` ON `curse_record` (`startSec0TZ`)");
            SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_curse_record_endSec0TZ` ON `curse_record` (`endSec0TZ`)");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `curse_observer` (`id` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `pai_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `sport_report_observer` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, PRIMARY KEY(`id`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `fds_data_id` (`sid` TEXT NOT NULL, `idBytes` BLOB NOT NULL, `time` INTEGER NOT NULL, `dailyType` INTEGER NOT NULL, `sportType` INTEGER NOT NULL, `fileType` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `extra` TEXT, PRIMARY KEY(`sid`, `idBytes`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `training_load_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `temperature_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `running_ability_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `vitality_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `blood_sugar_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `ecg_medical_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `analyzedStatus` INTEGER NOT NULL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `blood_pressure_medical_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `physical_fitness_status` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `lactate_threshold` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `extra_data` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `switch_song_dao` (`time` INTEGER NOT NULL, `value` TEXT NOT NULL, `isUpload` INTEGER NOT NULL, `extra` TEXT, PRIMARY KEY(`time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `training_plan_week` (`type` INTEGER NOT NULL, `id` INTEGER NOT NULL, `curWeekPlan` TEXT, `stopped` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `training_plan_cur_date` (`type` INTEGER NOT NULL, `id` INTEGER NOT NULL, `date` INTEGER NOT NULL, `curDatePlan` TEXT, PRIMARY KEY(`id`, `date`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `health_connect_sync_info` (`uid` TEXT NOT NULL, `dataType` INTEGER NOT NULL, `type` TEXT NOT NULL, `sid` TEXT NOT NULL, `key` TEXT NOT NULL, `time` INTEGER NOT NULL, `timeZoneOffset` INTEGER NOT NULL, `value` TEXT, `editedValue` TEXT, `status` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, `recordId` TEXT, `clientRecordId` TEXT, `startTime` INTEGER, `endTime` INTEGER, PRIMARY KEY(`uid`, `dataType`, `type`, `sid`, `key`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `temperature_trend` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `temperature_characteristic_record` (`key` TEXT NOT NULL, `sid` TEXT NOT NULL, `time` INTEGER NOT NULL, `value` TEXT, `zoneOffsetInSec` INTEGER NOT NULL, `zoneName` TEXT, `timeIn0Tz` INTEGER NOT NULL, `isUpload` INTEGER NOT NULL, `isDeleted` INTEGER NOT NULL, PRIMARY KEY(`key`, `sid`, `time`))");
            SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `algo_curse` (`id` INTEGER NOT NULL, `startTime` INTEGER NOT NULL, `endTime` INTEGER NOT NULL, `ovulationTime` INTEGER NOT NULL, `cursePeriod` INTEGER NOT NULL, `menstrualPeriod` INTEGER NOT NULL, `status` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '50bf042530c08ea654905be11982b8c6')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) {
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `sport_report`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `sleep_segment`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `server_request`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `hr_record`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `step_record`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `calorie_record`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `stand_record`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `mh_strength_record`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `energy_record`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `stress_record`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `spo2_record`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `v02max_record`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `blood_pressure_record`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `hearing_health_record`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `menstruation_record`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `weight_item_record`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `curse_record`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `curse_observer`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `pai_record`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `sport_report_observer`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `fds_data_id`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `training_load_record`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `temperature_record`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `running_ability_record`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `vitality_record`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `blood_sugar_record`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `ecg_medical_record`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `blood_pressure_medical_record`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `physical_fitness_status`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `lactate_threshold`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `extra_data`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `switch_song_dao`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `training_plan_week`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `training_plan_cur_date`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `health_connect_sync_info`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `temperature_trend`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `temperature_characteristic_record`");
            SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `algo_curse`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection sQLiteConnection) {
            FitnessDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
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
            HashMap map = new HashMap(11);
            map.put("sid", new TableInfo.Column("sid", "TEXT", true, 1, null, 1));
            map.put("key", new TableInfo.Column("key", "TEXT", true, 2, null, 1));
            map.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map.put("category", new TableInfo.Column("category", "TEXT", false, 0, null, 1));
            map.put("zoneOffsetInSec", new TableInfo.Column("zoneOffsetInSec", "INTEGER", true, 0, null, 1));
            map.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, 1));
            map.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map.put(FitnessDBConstants.COL_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            map.put("offlineCounted", new TableInfo.Column("offlineCounted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("sport_report", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "sport_report");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenDelegate.ValidationResult(false, "sport_report(com.xiaomi.fit.fitness.persist.db.internal.SportReportEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(10);
            map2.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map2.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map2.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map2.put(FitnessDBConstants.COL_IS_SLEEP_COMPLETE, new TableInfo.Column(FitnessDBConstants.COL_IS_SLEEP_COMPLETE, "INTEGER", true, 0, null, 1));
            map2.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map2.put("zoneOffsetInSec", new TableInfo.Column("zoneOffsetInSec", "INTEGER", true, 0, null, 1));
            map2.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, 1));
            map2.put(FitnessDBConstants.COL_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map2.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map2.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo(FitnessDBConstants.TABLE_SLEEP, map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, FitnessDBConstants.TABLE_SLEEP);
            if (!tableInfo3.equals(tableInfo4)) {
                return new RoomOpenDelegate.ValidationResult(false, "sleep_segment(com.xiaomi.fit.fitness.persist.db.internal.SleepSegmentEntity).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
            }
            HashMap map3 = new HashMap(6);
            map3.put("action", new TableInfo.Column("action", "TEXT", true, 1, null, 1));
            map3.put("key", new TableInfo.Column("key", "TEXT", true, 2, null, 1));
            map3.put("watermark", new TableInfo.Column("watermark", "INTEGER", true, 0, null, 1));
            map3.put("startTime", new TableInfo.Column("startTime", "INTEGER", true, 0, null, 1));
            map3.put("endTime", new TableInfo.Column("endTime", "INTEGER", true, 3, null, 1));
            map3.put("nextKey", new TableInfo.Column("nextKey", "TEXT", false, 0, null, 1));
            TableInfo tableInfo5 = new TableInfo("server_request", map3, new HashSet(0), new HashSet(0));
            TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "server_request");
            if (!tableInfo5.equals(tableInfo6)) {
                return new RoomOpenDelegate.ValidationResult(false, "server_request(com.xiaomi.fit.fitness.persist.db.internal.ServerRequestEntity).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
            }
            HashMap map4 = new HashMap(9);
            map4.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map4.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map4.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map4.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map4.put("zoneOffsetInSec", new TableInfo.Column("zoneOffsetInSec", "INTEGER", true, 0, null, 1));
            map4.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, 1));
            map4.put(FitnessDBConstants.COL_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map4.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map4.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo7 = new TableInfo(FitnessDBConstants.TABLE_HEART_RATE, map4, new HashSet(0), new HashSet(0));
            TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, FitnessDBConstants.TABLE_HEART_RATE);
            if (!tableInfo7.equals(tableInfo8)) {
                return new RoomOpenDelegate.ValidationResult(false, "hr_record(com.xiaomi.fit.fitness.persist.db.internal.HrRecordEntity).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfo8);
            }
            HashMap map5 = new HashMap(9);
            map5.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map5.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map5.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map5.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map5.put("zoneOffsetInSec", new TableInfo.Column("zoneOffsetInSec", "INTEGER", true, 0, null, 1));
            map5.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, 1));
            map5.put(FitnessDBConstants.COL_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map5.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map5.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo9 = new TableInfo(FitnessDBConstants.TABLE_STEP, map5, new HashSet(0), new HashSet(0));
            TableInfo tableInfo10 = TableInfo.read(sQLiteConnection, FitnessDBConstants.TABLE_STEP);
            if (!tableInfo9.equals(tableInfo10)) {
                return new RoomOpenDelegate.ValidationResult(false, "step_record(com.xiaomi.fit.fitness.persist.db.internal.StepRecordEntity).\n Expected:\n" + tableInfo9 + "\n Found:\n" + tableInfo10);
            }
            HashMap map6 = new HashMap(9);
            map6.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map6.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map6.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map6.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map6.put("zoneOffsetInSec", new TableInfo.Column("zoneOffsetInSec", "INTEGER", true, 0, null, 1));
            map6.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, 1));
            map6.put(FitnessDBConstants.COL_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map6.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map6.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo11 = new TableInfo(FitnessDBConstants.TABLE_CALORIE, map6, new HashSet(0), new HashSet(0));
            TableInfo tableInfo12 = TableInfo.read(sQLiteConnection, FitnessDBConstants.TABLE_CALORIE);
            if (!tableInfo11.equals(tableInfo12)) {
                return new RoomOpenDelegate.ValidationResult(false, "calorie_record(com.xiaomi.fit.fitness.persist.db.internal.CaloriesRecordEntity).\n Expected:\n" + tableInfo11 + "\n Found:\n" + tableInfo12);
            }
            HashMap map7 = new HashMap(9);
            map7.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map7.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map7.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map7.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map7.put("zoneOffsetInSec", new TableInfo.Column("zoneOffsetInSec", "INTEGER", true, 0, null, 1));
            map7.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, 1));
            map7.put(FitnessDBConstants.COL_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map7.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map7.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo13 = new TableInfo(FitnessDBConstants.TABLE_STAND, map7, new HashSet(0), new HashSet(0));
            TableInfo tableInfo14 = TableInfo.read(sQLiteConnection, FitnessDBConstants.TABLE_STAND);
            if (!tableInfo13.equals(tableInfo14)) {
                return new RoomOpenDelegate.ValidationResult(false, "stand_record(com.xiaomi.fit.fitness.persist.db.internal.StandRecordEntity).\n Expected:\n" + tableInfo13 + "\n Found:\n" + tableInfo14);
            }
            HashMap map8 = new HashMap(9);
            map8.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map8.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map8.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map8.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map8.put("zoneOffsetInSec", new TableInfo.Column("zoneOffsetInSec", "INTEGER", true, 0, null, 1));
            map8.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, 1));
            map8.put(FitnessDBConstants.COL_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map8.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map8.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo15 = new TableInfo(FitnessDBConstants.TABLE_MH_STRENGTH, map8, new HashSet(0), new HashSet(0));
            TableInfo tableInfo16 = TableInfo.read(sQLiteConnection, FitnessDBConstants.TABLE_MH_STRENGTH);
            if (!tableInfo15.equals(tableInfo16)) {
                return new RoomOpenDelegate.ValidationResult(false, "mh_strength_record(com.xiaomi.fit.fitness.persist.db.internal.MHStrengthRecordEntity).\n Expected:\n" + tableInfo15 + "\n Found:\n" + tableInfo16);
            }
            HashMap map9 = new HashMap(9);
            map9.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map9.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map9.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map9.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map9.put("zoneOffsetInSec", new TableInfo.Column("zoneOffsetInSec", "INTEGER", true, 0, null, 1));
            map9.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, 1));
            map9.put(FitnessDBConstants.COL_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map9.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map9.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo17 = new TableInfo(FitnessDBConstants.TABLE_ENERGY, map9, new HashSet(0), new HashSet(0));
            TableInfo tableInfo18 = TableInfo.read(sQLiteConnection, FitnessDBConstants.TABLE_ENERGY);
            if (!tableInfo17.equals(tableInfo18)) {
                return new RoomOpenDelegate.ValidationResult(false, "energy_record(com.xiaomi.fit.fitness.persist.db.internal.EnergyRecordEntity).\n Expected:\n" + tableInfo17 + "\n Found:\n" + tableInfo18);
            }
            HashMap map10 = new HashMap(9);
            map10.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map10.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map10.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map10.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map10.put("zoneOffsetInSec", new TableInfo.Column("zoneOffsetInSec", "INTEGER", true, 0, null, 1));
            map10.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, 1));
            map10.put(FitnessDBConstants.COL_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map10.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map10.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo19 = new TableInfo("stress_record", map10, new HashSet(0), new HashSet(0));
            TableInfo tableInfo20 = TableInfo.read(sQLiteConnection, "stress_record");
            if (!tableInfo19.equals(tableInfo20)) {
                return new RoomOpenDelegate.ValidationResult(false, "stress_record(com.xiaomi.fit.fitness.persist.db.internal.StressRecordEntity).\n Expected:\n" + tableInfo19 + "\n Found:\n" + tableInfo20);
            }
            HashMap map11 = new HashMap(9);
            map11.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map11.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map11.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map11.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map11.put("zoneOffsetInSec", new TableInfo.Column("zoneOffsetInSec", "INTEGER", true, 0, null, 1));
            map11.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, 1));
            map11.put(FitnessDBConstants.COL_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map11.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map11.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo21 = new TableInfo("spo2_record", map11, new HashSet(0), new HashSet(0));
            TableInfo tableInfo22 = TableInfo.read(sQLiteConnection, "spo2_record");
            if (!tableInfo21.equals(tableInfo22)) {
                return new RoomOpenDelegate.ValidationResult(false, "spo2_record(com.xiaomi.fit.fitness.persist.db.internal.Spo2RecordEntity).\n Expected:\n" + tableInfo21 + "\n Found:\n" + tableInfo22);
            }
            HashMap map12 = new HashMap(9);
            map12.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map12.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map12.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map12.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map12.put("zoneOffsetInSec", new TableInfo.Column("zoneOffsetInSec", "INTEGER", true, 0, null, 1));
            map12.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, 1));
            map12.put(FitnessDBConstants.COL_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map12.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map12.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo23 = new TableInfo(FitnessDBConstants.TABLE_VO2_MAX, map12, new HashSet(0), new HashSet(0));
            TableInfo tableInfo24 = TableInfo.read(sQLiteConnection, FitnessDBConstants.TABLE_VO2_MAX);
            if (!tableInfo23.equals(tableInfo24)) {
                return new RoomOpenDelegate.ValidationResult(false, "v02max_record(com.xiaomi.fit.fitness.persist.db.internal.Vo2MaxRecordEntity).\n Expected:\n" + tableInfo23 + "\n Found:\n" + tableInfo24);
            }
            HashMap map13 = new HashMap(9);
            map13.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map13.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map13.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map13.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map13.put("zoneOffsetInSec", new TableInfo.Column("zoneOffsetInSec", "INTEGER", true, 0, null, 1));
            map13.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, 1));
            map13.put(FitnessDBConstants.COL_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map13.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map13.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo25 = new TableInfo(FitnessDBConstants.TABLE_BLOOD_PRESSURE, map13, new HashSet(0), new HashSet(0));
            TableInfo tableInfo26 = TableInfo.read(sQLiteConnection, FitnessDBConstants.TABLE_BLOOD_PRESSURE);
            if (!tableInfo25.equals(tableInfo26)) {
                return new RoomOpenDelegate.ValidationResult(false, "blood_pressure_record(com.xiaomi.fit.fitness.persist.db.internal.BloodPressureRecordEntity).\n Expected:\n" + tableInfo25 + "\n Found:\n" + tableInfo26);
            }
            HashMap map14 = new HashMap(9);
            map14.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map14.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map14.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map14.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map14.put("zoneOffsetInSec", new TableInfo.Column("zoneOffsetInSec", "INTEGER", true, 0, null, 1));
            map14.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, 1));
            map14.put(FitnessDBConstants.COL_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map14.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map14.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo27 = new TableInfo(FitnessDBConstants.TABLE_HEARING, map14, new HashSet(0), new HashSet(0));
            TableInfo tableInfo28 = TableInfo.read(sQLiteConnection, FitnessDBConstants.TABLE_HEARING);
            if (!tableInfo27.equals(tableInfo28)) {
                return new RoomOpenDelegate.ValidationResult(false, "hearing_health_record(com.xiaomi.fit.fitness.persist.db.internal.HearingHealthRecordEntity).\n Expected:\n" + tableInfo27 + "\n Found:\n" + tableInfo28);
            }
            HashMap map15 = new HashMap(9);
            map15.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map15.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map15.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map15.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map15.put("zoneOffsetInSec", new TableInfo.Column("zoneOffsetInSec", "INTEGER", true, 0, null, 1));
            map15.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, 1));
            map15.put(FitnessDBConstants.COL_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map15.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map15.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo29 = new TableInfo(FitnessDBConstants.TABLE_MENSTRUATION, map15, new HashSet(0), new HashSet(0));
            TableInfo tableInfo30 = TableInfo.read(sQLiteConnection, FitnessDBConstants.TABLE_MENSTRUATION);
            if (!tableInfo29.equals(tableInfo30)) {
                return new RoomOpenDelegate.ValidationResult(false, "menstruation_record(com.xiaomi.fit.fitness.persist.db.internal.WomenHealthRecordEntity).\n Expected:\n" + tableInfo29 + "\n Found:\n" + tableInfo30);
            }
            HashMap map16 = new HashMap(19);
            map16.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map16.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map16.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map16.put(FitnessDBConstants.COL_ZERO_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_ZERO_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map16.put("weight", new TableInfo.Column("weight", "REAL", true, 0, null, 1));
            map16.put("bmi", new TableInfo.Column("bmi", "REAL", false, 0, null, 1));
            map16.put(WeightRecordDaoKt.COL_BODY_FAT_RATE, new TableInfo.Column(WeightRecordDaoKt.COL_BODY_FAT_RATE, "REAL", false, 0, null, 1));
            map16.put(WeightRecordDaoKt.COL_MOISTURE_RATE, new TableInfo.Column(WeightRecordDaoKt.COL_MOISTURE_RATE, "REAL", false, 0, null, 1));
            map16.put(WeightRecordDaoKt.COL_BONE_MASS, new TableInfo.Column(WeightRecordDaoKt.COL_BONE_MASS, "REAL", false, 0, null, 1));
            map16.put(WeightRecordDaoKt.COL_BASAL_METABOLISM, new TableInfo.Column(WeightRecordDaoKt.COL_BASAL_METABOLISM, "INTEGER", false, 0, null, 1));
            map16.put(WeightRecordDaoKt.COL_MUSCLE_RATE, new TableInfo.Column(WeightRecordDaoKt.COL_MUSCLE_RATE, "REAL", false, 0, null, 1));
            map16.put(WeightRecordDaoKt.COL_PROTEIN_RATE, new TableInfo.Column(WeightRecordDaoKt.COL_PROTEIN_RATE, "REAL", false, 0, null, 1));
            map16.put(WeightRecordDaoKt.COL_VISCERAL_FAT, new TableInfo.Column(WeightRecordDaoKt.COL_VISCERAL_FAT, "REAL", false, 0, null, 1));
            map16.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map16.put("zoneOffsetInSec", new TableInfo.Column("zoneOffsetInSec", "INTEGER", true, 0, null, 1));
            map16.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, 1));
            map16.put(FitnessDBConstants.COL_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map16.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map16.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo31 = new TableInfo(FitnessDBConstants.TABLE_WEIGHT, map16, new HashSet(0), new HashSet(0));
            TableInfo tableInfo32 = TableInfo.read(sQLiteConnection, FitnessDBConstants.TABLE_WEIGHT);
            if (!tableInfo31.equals(tableInfo32)) {
                return new RoomOpenDelegate.ValidationResult(false, "weight_item_record(com.xiaomi.fit.fitness.persist.db.internal.WeightItemEntity).\n Expected:\n" + tableInfo31 + "\n Found:\n" + tableInfo32);
            }
            HashMap map17 = new HashMap(5);
            map17.put("startSec0TZ", new TableInfo.Column("startSec0TZ", "INTEGER", true, 0, null, 1));
            map17.put("endSec0TZ", new TableInfo.Column("endSec0TZ", "INTEGER", true, 0, null, 1));
            map17.put("updateTime", new TableInfo.Column("updateTime", "INTEGER", true, 0, null, 1));
            map17.put("interval", new TableInfo.Column("interval", "INTEGER", true, 0, null, 1));
            map17.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new TableInfo.Index("index_curse_record_startSec0TZ", true, Arrays.asList("startSec0TZ"), Arrays.asList("ASC")));
            hashSet2.add(new TableInfo.Index("index_curse_record_endSec0TZ", true, Arrays.asList("endSec0TZ"), Arrays.asList("ASC")));
            TableInfo tableInfo33 = new TableInfo("curse_record", map17, hashSet, hashSet2);
            TableInfo tableInfo34 = TableInfo.read(sQLiteConnection, "curse_record");
            if (!tableInfo33.equals(tableInfo34)) {
                return new RoomOpenDelegate.ValidationResult(false, "curse_record(com.xiaomi.fitness.aggregation.health.entity.CurseRecordEntity).\n Expected:\n" + tableInfo33 + "\n Found:\n" + tableInfo34);
            }
            HashMap map18 = new HashMap(1);
            map18.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            TableInfo tableInfo35 = new TableInfo("curse_observer", map18, new HashSet(0), new HashSet(0));
            TableInfo tableInfo36 = TableInfo.read(sQLiteConnection, "curse_observer");
            if (!tableInfo35.equals(tableInfo36)) {
                return new RoomOpenDelegate.ValidationResult(false, "curse_observer(com.xiaomi.fit.fitness.persist.db.internal.CurseObserver).\n Expected:\n" + tableInfo35 + "\n Found:\n" + tableInfo36);
            }
            HashMap map19 = new HashMap(9);
            map19.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map19.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map19.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map19.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map19.put("zoneOffsetInSec", new TableInfo.Column("zoneOffsetInSec", "INTEGER", true, 0, null, 1));
            map19.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, 1));
            map19.put(FitnessDBConstants.COL_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map19.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map19.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo37 = new TableInfo(FitnessDBConstants.TABLE_PAI, map19, new HashSet(0), new HashSet(0));
            TableInfo tableInfo38 = TableInfo.read(sQLiteConnection, FitnessDBConstants.TABLE_PAI);
            if (!tableInfo37.equals(tableInfo38)) {
                return new RoomOpenDelegate.ValidationResult(false, "pai_record(com.xiaomi.fit.fitness.persist.db.internal.PaiRecordEntity).\n Expected:\n" + tableInfo37 + "\n Found:\n" + tableInfo38);
            }
            HashMap map20 = new HashMap(2);
            map20.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map20.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
            TableInfo tableInfo39 = new TableInfo(SportReportObserverKt.TABLE_SPORT_REPORT_OBSERVER, map20, new HashSet(0), new HashSet(0));
            TableInfo tableInfo40 = TableInfo.read(sQLiteConnection, SportReportObserverKt.TABLE_SPORT_REPORT_OBSERVER);
            if (!tableInfo39.equals(tableInfo40)) {
                return new RoomOpenDelegate.ValidationResult(false, "sport_report_observer(com.xiaomi.fit.fitness.persist.db.internal.SportReportObserver).\n Expected:\n" + tableInfo39 + "\n Found:\n" + tableInfo40);
            }
            HashMap map21 = new HashMap(8);
            map21.put("sid", new TableInfo.Column("sid", "TEXT", true, 1, null, 1));
            map21.put("idBytes", new TableInfo.Column("idBytes", "BLOB", true, 2, null, 1));
            map21.put("time", new TableInfo.Column("time", "INTEGER", true, 0, null, 1));
            map21.put("dailyType", new TableInfo.Column("dailyType", "INTEGER", true, 0, null, 1));
            map21.put(DailyRecordKey.sportType, new TableInfo.Column(DailyRecordKey.sportType, "INTEGER", true, 0, null, 1));
            map21.put("fileType", new TableInfo.Column("fileType", "INTEGER", true, 0, null, 1));
            map21.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map21.put("extra", new TableInfo.Column("extra", "TEXT", false, 0, null, 1));
            TableInfo tableInfo41 = new TableInfo("fds_data_id", map21, new HashSet(0), new HashSet(0));
            TableInfo tableInfo42 = TableInfo.read(sQLiteConnection, "fds_data_id");
            if (!tableInfo41.equals(tableInfo42)) {
                return new RoomOpenDelegate.ValidationResult(false, "fds_data_id(com.xiaomi.fit.fitness.persist.db.internal.FDSDataIdEntity).\n Expected:\n" + tableInfo41 + "\n Found:\n" + tableInfo42);
            }
            HashMap map22 = new HashMap(9);
            map22.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map22.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map22.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map22.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map22.put("zoneOffsetInSec", new TableInfo.Column("zoneOffsetInSec", "INTEGER", true, 0, null, 1));
            map22.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, 1));
            map22.put(FitnessDBConstants.COL_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map22.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map22.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo43 = new TableInfo(FitnessDBConstants.TABLE_TRAINING_LOAD, map22, new HashSet(0), new HashSet(0));
            TableInfo tableInfo44 = TableInfo.read(sQLiteConnection, FitnessDBConstants.TABLE_TRAINING_LOAD);
            if (!tableInfo43.equals(tableInfo44)) {
                return new RoomOpenDelegate.ValidationResult(false, "training_load_record(com.xiaomi.fit.fitness.persist.db.internal.TrainingLoadRecordEntity).\n Expected:\n" + tableInfo43 + "\n Found:\n" + tableInfo44);
            }
            HashMap map23 = new HashMap(9);
            map23.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map23.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map23.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map23.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map23.put("zoneOffsetInSec", new TableInfo.Column("zoneOffsetInSec", "INTEGER", true, 0, null, 1));
            map23.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, 1));
            map23.put(FitnessDBConstants.COL_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map23.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map23.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo45 = new TableInfo(FitnessDBConstants.TABLE_TEMPERATURE, map23, new HashSet(0), new HashSet(0));
            TableInfo tableInfo46 = TableInfo.read(sQLiteConnection, FitnessDBConstants.TABLE_TEMPERATURE);
            if (!tableInfo45.equals(tableInfo46)) {
                return new RoomOpenDelegate.ValidationResult(false, "temperature_record(com.xiaomi.fit.fitness.persist.db.internal.TemperatureRecordEntity).\n Expected:\n" + tableInfo45 + "\n Found:\n" + tableInfo46);
            }
            HashMap map24 = new HashMap(9);
            map24.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map24.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map24.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map24.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map24.put("zoneOffsetInSec", new TableInfo.Column("zoneOffsetInSec", "INTEGER", true, 0, null, 1));
            map24.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, 1));
            map24.put(FitnessDBConstants.COL_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map24.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map24.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo47 = new TableInfo(FitnessDBConstants.TABLE_RUN_ABILITY_INDEX, map24, new HashSet(0), new HashSet(0));
            TableInfo tableInfo48 = TableInfo.read(sQLiteConnection, FitnessDBConstants.TABLE_RUN_ABILITY_INDEX);
            if (!tableInfo47.equals(tableInfo48)) {
                return new RoomOpenDelegate.ValidationResult(false, "running_ability_record(com.xiaomi.fit.fitness.persist.db.internal.RunAbilityRecordEntity).\n Expected:\n" + tableInfo47 + "\n Found:\n" + tableInfo48);
            }
            HashMap map25 = new HashMap(9);
            map25.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map25.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map25.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map25.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map25.put("zoneOffsetInSec", new TableInfo.Column("zoneOffsetInSec", "INTEGER", true, 0, null, 1));
            map25.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, 1));
            map25.put(FitnessDBConstants.COL_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map25.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map25.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo49 = new TableInfo(FitnessDBConstants.TABLE_VITALITY, map25, new HashSet(0), new HashSet(0));
            TableInfo tableInfo50 = TableInfo.read(sQLiteConnection, FitnessDBConstants.TABLE_VITALITY);
            if (!tableInfo49.equals(tableInfo50)) {
                return new RoomOpenDelegate.ValidationResult(false, "vitality_record(com.xiaomi.fit.fitness.persist.db.internal.VitalityRecordEntity).\n Expected:\n" + tableInfo49 + "\n Found:\n" + tableInfo50);
            }
            HashMap map26 = new HashMap(9);
            map26.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map26.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map26.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map26.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map26.put("zoneOffsetInSec", new TableInfo.Column("zoneOffsetInSec", "INTEGER", true, 0, null, 1));
            map26.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, 1));
            map26.put(FitnessDBConstants.COL_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map26.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map26.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo51 = new TableInfo(FitnessDBConstants.TABLE_BLOOD_SUGAR, map26, new HashSet(0), new HashSet(0));
            TableInfo tableInfo52 = TableInfo.read(sQLiteConnection, FitnessDBConstants.TABLE_BLOOD_SUGAR);
            if (!tableInfo51.equals(tableInfo52)) {
                return new RoomOpenDelegate.ValidationResult(false, "blood_sugar_record(com.xiaomi.fit.fitness.persist.db.internal.BloodSugarEntity).\n Expected:\n" + tableInfo51 + "\n Found:\n" + tableInfo52);
            }
            HashMap map27 = new HashMap(10);
            map27.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map27.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map27.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map27.put(FitnessDBConstants.COL_ECG_INTERPRET_STATUS, new TableInfo.Column(FitnessDBConstants.COL_ECG_INTERPRET_STATUS, "INTEGER", true, 0, null, 1));
            map27.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map27.put("zoneOffsetInSec", new TableInfo.Column("zoneOffsetInSec", "INTEGER", true, 0, null, 1));
            map27.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, 1));
            map27.put(FitnessDBConstants.COL_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map27.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map27.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo53 = new TableInfo(FitnessDBConstants.TABLE_ECG_MEDICAL_TABLE, map27, new HashSet(0), new HashSet(0));
            TableInfo tableInfo54 = TableInfo.read(sQLiteConnection, FitnessDBConstants.TABLE_ECG_MEDICAL_TABLE);
            if (!tableInfo53.equals(tableInfo54)) {
                return new RoomOpenDelegate.ValidationResult(false, "ecg_medical_record(com.xiaomi.fit.fitness.persist.db.internal.EcgMedicalRecordEntity).\n Expected:\n" + tableInfo53 + "\n Found:\n" + tableInfo54);
            }
            HashMap map28 = new HashMap(9);
            map28.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map28.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map28.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map28.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map28.put("zoneOffsetInSec", new TableInfo.Column("zoneOffsetInSec", "INTEGER", true, 0, null, 1));
            map28.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, 1));
            map28.put(FitnessDBConstants.COL_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map28.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map28.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo55 = new TableInfo(FitnessDBConstants.TABLE_BP_MEDICAL_TABLE, map28, new HashSet(0), new HashSet(0));
            TableInfo tableInfo56 = TableInfo.read(sQLiteConnection, FitnessDBConstants.TABLE_BP_MEDICAL_TABLE);
            if (!tableInfo55.equals(tableInfo56)) {
                return new RoomOpenDelegate.ValidationResult(false, "blood_pressure_medical_record(com.xiaomi.fit.fitness.persist.db.internal.BPMedicalRecordEntity).\n Expected:\n" + tableInfo55 + "\n Found:\n" + tableInfo56);
            }
            HashMap map29 = new HashMap(9);
            map29.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map29.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map29.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map29.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map29.put("zoneOffsetInSec", new TableInfo.Column("zoneOffsetInSec", "INTEGER", true, 0, null, 1));
            map29.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, 1));
            map29.put(FitnessDBConstants.COL_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map29.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map29.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo57 = new TableInfo("physical_fitness_status", map29, new HashSet(0), new HashSet(0));
            TableInfo tableInfo58 = TableInfo.read(sQLiteConnection, "physical_fitness_status");
            if (!tableInfo57.equals(tableInfo58)) {
                return new RoomOpenDelegate.ValidationResult(false, "physical_fitness_status(com.xiaomi.fit.fitness.persist.db.internal.PhysicalStatusEntity).\n Expected:\n" + tableInfo57 + "\n Found:\n" + tableInfo58);
            }
            HashMap map30 = new HashMap(9);
            map30.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map30.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map30.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map30.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map30.put("zoneOffsetInSec", new TableInfo.Column("zoneOffsetInSec", "INTEGER", true, 0, null, 1));
            map30.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, 1));
            map30.put(FitnessDBConstants.COL_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map30.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map30.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo59 = new TableInfo("lactate_threshold", map30, new HashSet(0), new HashSet(0));
            TableInfo tableInfo60 = TableInfo.read(sQLiteConnection, "lactate_threshold");
            if (!tableInfo59.equals(tableInfo60)) {
                return new RoomOpenDelegate.ValidationResult(false, "lactate_threshold(com.xiaomi.fit.fitness.persist.db.internal.LactateThresholdEntity).\n Expected:\n" + tableInfo59 + "\n Found:\n" + tableInfo60);
            }
            HashMap map31 = new HashMap(9);
            map31.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map31.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map31.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map31.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map31.put("zoneOffsetInSec", new TableInfo.Column("zoneOffsetInSec", "INTEGER", true, 0, null, 1));
            map31.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, 1));
            map31.put(FitnessDBConstants.COL_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map31.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map31.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo61 = new TableInfo("extra_data", map31, new HashSet(0), new HashSet(0));
            TableInfo tableInfo62 = TableInfo.read(sQLiteConnection, "extra_data");
            if (!tableInfo61.equals(tableInfo62)) {
                return new RoomOpenDelegate.ValidationResult(false, "extra_data(com.xiaomi.fit.fitness.persist.db.internal.ExtraDataEntity).\n Expected:\n" + tableInfo61 + "\n Found:\n" + tableInfo62);
            }
            HashMap map32 = new HashMap(4);
            map32.put("time", new TableInfo.Column("time", "INTEGER", true, 1, null, 1));
            map32.put("value", new TableInfo.Column("value", "TEXT", true, 0, null, 1));
            map32.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map32.put("extra", new TableInfo.Column("extra", "TEXT", false, 0, null, 1));
            TableInfo tableInfo63 = new TableInfo("switch_song_dao", map32, new HashSet(0), new HashSet(0));
            TableInfo tableInfo64 = TableInfo.read(sQLiteConnection, "switch_song_dao");
            if (!tableInfo63.equals(tableInfo64)) {
                return new RoomOpenDelegate.ValidationResult(false, "switch_song_dao(com.xiaomi.fit.fitness.persist.db.internal.SwitchSongEntity).\n Expected:\n" + tableInfo63 + "\n Found:\n" + tableInfo64);
            }
            HashMap map33 = new HashMap(4);
            map33.put("type", new TableInfo.Column("type", "INTEGER", true, 0, null, 1));
            map33.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map33.put("curWeekPlan", new TableInfo.Column("curWeekPlan", "TEXT", false, 0, null, 1));
            map33.put("stopped", new TableInfo.Column("stopped", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo65 = new TableInfo("training_plan_week", map33, new HashSet(0), new HashSet(0));
            TableInfo tableInfo66 = TableInfo.read(sQLiteConnection, "training_plan_week");
            if (!tableInfo65.equals(tableInfo66)) {
                return new RoomOpenDelegate.ValidationResult(false, "training_plan_week(com.xiaomi.fit.fitness.persist.db.internal.TrainingPlanWeekEntity).\n Expected:\n" + tableInfo65 + "\n Found:\n" + tableInfo66);
            }
            HashMap map34 = new HashMap(4);
            map34.put("type", new TableInfo.Column("type", "INTEGER", true, 0, null, 1));
            map34.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map34.put(DialWidgetType.DATE, new TableInfo.Column(DialWidgetType.DATE, "INTEGER", true, 2, null, 1));
            map34.put("curDatePlan", new TableInfo.Column("curDatePlan", "TEXT", false, 0, null, 1));
            TableInfo tableInfo67 = new TableInfo("training_plan_cur_date", map34, new HashSet(0), new HashSet(0));
            TableInfo tableInfo68 = TableInfo.read(sQLiteConnection, "training_plan_cur_date");
            if (!tableInfo67.equals(tableInfo68)) {
                return new RoomOpenDelegate.ValidationResult(false, "training_plan_cur_date(com.xiaomi.fit.fitness.persist.db.internal.TrainingPlanCurDateEntity).\n Expected:\n" + tableInfo67 + "\n Found:\n" + tableInfo68);
            }
            HashMap map35 = new HashMap(15);
            map35.put("uid", new TableInfo.Column("uid", "TEXT", true, 1, null, 1));
            map35.put("dataType", new TableInfo.Column("dataType", "INTEGER", true, 2, null, 1));
            map35.put("type", new TableInfo.Column("type", "TEXT", true, 3, null, 1));
            map35.put("sid", new TableInfo.Column("sid", "TEXT", true, 4, null, 1));
            map35.put("key", new TableInfo.Column("key", "TEXT", true, 5, null, 1));
            map35.put("time", new TableInfo.Column("time", "INTEGER", true, 6, null, 1));
            map35.put("timeZoneOffset", new TableInfo.Column("timeZoneOffset", "INTEGER", true, 0, null, 1));
            map35.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map35.put("editedValue", new TableInfo.Column("editedValue", "TEXT", false, 0, null, 1));
            map35.put("status", new TableInfo.Column("status", "INTEGER", true, 0, null, 1));
            map35.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            map35.put("recordId", new TableInfo.Column("recordId", "TEXT", false, 0, null, 1));
            map35.put("clientRecordId", new TableInfo.Column("clientRecordId", "TEXT", false, 0, null, 1));
            map35.put("startTime", new TableInfo.Column("startTime", "INTEGER", false, 0, null, 1));
            map35.put("endTime", new TableInfo.Column("endTime", "INTEGER", false, 0, null, 1));
            TableInfo tableInfo69 = new TableInfo("health_connect_sync_info", map35, new HashSet(0), new HashSet(0));
            TableInfo tableInfo70 = TableInfo.read(sQLiteConnection, "health_connect_sync_info");
            if (!tableInfo69.equals(tableInfo70)) {
                return new RoomOpenDelegate.ValidationResult(false, "health_connect_sync_info(com.xiaomi.fit.fitness.persist.db.internal.HealthConnectSyncDaoEntity).\n Expected:\n" + tableInfo69 + "\n Found:\n" + tableInfo70);
            }
            HashMap map36 = new HashMap(9);
            map36.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map36.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map36.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map36.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map36.put("zoneOffsetInSec", new TableInfo.Column("zoneOffsetInSec", "INTEGER", true, 0, null, 1));
            map36.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, 1));
            map36.put(FitnessDBConstants.COL_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map36.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map36.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo71 = new TableInfo("temperature_trend", map36, new HashSet(0), new HashSet(0));
            TableInfo tableInfo72 = TableInfo.read(sQLiteConnection, "temperature_trend");
            if (!tableInfo71.equals(tableInfo72)) {
                return new RoomOpenDelegate.ValidationResult(false, "temperature_trend(com.xiaomi.fit.fitness.persist.db.internal.TemperatureTrendEntity).\n Expected:\n" + tableInfo71 + "\n Found:\n" + tableInfo72);
            }
            HashMap map37 = new HashMap(9);
            map37.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
            map37.put("sid", new TableInfo.Column("sid", "TEXT", true, 2, null, 1));
            map37.put("time", new TableInfo.Column("time", "INTEGER", true, 3, null, 1));
            map37.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
            map37.put("zoneOffsetInSec", new TableInfo.Column("zoneOffsetInSec", "INTEGER", true, 0, null, 1));
            map37.put("zoneName", new TableInfo.Column("zoneName", "TEXT", false, 0, null, 1));
            map37.put(FitnessDBConstants.COL_TIME_0_TZ, new TableInfo.Column(FitnessDBConstants.COL_TIME_0_TZ, "INTEGER", true, 0, null, 1));
            map37.put("isUpload", new TableInfo.Column("isUpload", "INTEGER", true, 0, null, 1));
            map37.put("isDeleted", new TableInfo.Column("isDeleted", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo73 = new TableInfo(FitnessDBConstants.TABLE_TEMPERATURE_CHARACTER_RECORD, map37, new HashSet(0), new HashSet(0));
            TableInfo tableInfo74 = TableInfo.read(sQLiteConnection, FitnessDBConstants.TABLE_TEMPERATURE_CHARACTER_RECORD);
            if (!tableInfo73.equals(tableInfo74)) {
                return new RoomOpenDelegate.ValidationResult(false, "temperature_characteristic_record(com.xiaomi.fit.fitness.persist.db.internal.TemperatureCharacterRecordEntity).\n Expected:\n" + tableInfo73 + "\n Found:\n" + tableInfo74);
            }
            HashMap map38 = new HashMap(7);
            map38.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map38.put("startTime", new TableInfo.Column("startTime", "INTEGER", true, 0, null, 1));
            map38.put("endTime", new TableInfo.Column("endTime", "INTEGER", true, 0, null, 1));
            map38.put("ovulationTime", new TableInfo.Column("ovulationTime", "INTEGER", true, 0, null, 1));
            map38.put("cursePeriod", new TableInfo.Column("cursePeriod", "INTEGER", true, 0, null, 1));
            map38.put("menstrualPeriod", new TableInfo.Column("menstrualPeriod", "INTEGER", true, 0, null, 1));
            map38.put("status", new TableInfo.Column("status", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo75 = new TableInfo("algo_curse", map38, new HashSet(0), new HashSet(0));
            TableInfo tableInfo76 = TableInfo.read(sQLiteConnection, "algo_curse");
            if (tableInfo75.equals(tableInfo76)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "algo_curse(com.xiaomi.fit.fitness.persist.db.internal.AlgoCurseEntity).\n Expected:\n" + tableInfo75 + "\n Found:\n" + tableInfo76);
        }
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public AlgoCurseDao algoCurseDao() {
        AlgoCurseDao algoCurseDao;
        if (this.G != null) {
            return this.G;
        }
        synchronized (this) {
            try {
                if (this.G == null) {
                    this.G = new p51(this);
                }
                algoCurseDao = this.G;
            } catch (Throwable th) {
                throw th;
            }
        }
        return algoCurseDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public BloodPressureRecordDao bloodPressureItemDao() {
        BloodPressureRecordDao bloodPressureRecordDao;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            try {
                if (this.p == null) {
                    this.p = new b(this);
                }
                bloodPressureRecordDao = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bloodPressureRecordDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public BPMedicalRecordDao bloodPressureMedicalDao() {
        BPMedicalRecordDao bPMedicalRecordDao;
        if (this.A != null) {
            return this.A;
        }
        synchronized (this) {
            try {
                if (this.A == null) {
                    this.A = new com.xiaomi.fit.fitness.persist.db.internal.a(this);
                }
                bPMedicalRecordDao = this.A;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bPMedicalRecordDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public BloodSugarDao bloodSugarDao() {
        BloodSugarDao bloodSugarDao;
        if (this.B != null) {
            return this.B;
        }
        synchronized (this) {
            try {
                if (this.B == null) {
                    this.B = new c(this);
                }
                bloodSugarDao = this.B;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bloodSugarDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public CaloriesRecordItemDao calorieRecordItemDao() {
        CaloriesRecordItemDao caloriesRecordItemDao;
        if (this.i != null) {
            return this.i;
        }
        synchronized (this) {
            try {
                if (this.i == null) {
                    this.i = new d(this);
                }
                caloriesRecordItemDao = this.i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return caloriesRecordItemDao;
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "sport_report", FitnessDBConstants.TABLE_SLEEP, "server_request", FitnessDBConstants.TABLE_HEART_RATE, FitnessDBConstants.TABLE_STEP, FitnessDBConstants.TABLE_CALORIE, FitnessDBConstants.TABLE_STAND, FitnessDBConstants.TABLE_MH_STRENGTH, FitnessDBConstants.TABLE_ENERGY, "stress_record", "spo2_record", FitnessDBConstants.TABLE_VO2_MAX, FitnessDBConstants.TABLE_BLOOD_PRESSURE, FitnessDBConstants.TABLE_HEARING, FitnessDBConstants.TABLE_MENSTRUATION, FitnessDBConstants.TABLE_WEIGHT, "curse_record", "curse_observer", FitnessDBConstants.TABLE_PAI, SportReportObserverKt.TABLE_SPORT_REPORT_OBSERVER, "fds_data_id", FitnessDBConstants.TABLE_TRAINING_LOAD, FitnessDBConstants.TABLE_TEMPERATURE, FitnessDBConstants.TABLE_RUN_ABILITY_INDEX, FitnessDBConstants.TABLE_VITALITY, FitnessDBConstants.TABLE_BLOOD_SUGAR, FitnessDBConstants.TABLE_ECG_MEDICAL_TABLE, FitnessDBConstants.TABLE_BP_MEDICAL_TABLE, "physical_fitness_status", "lactate_threshold", "extra_data", "switch_song_dao", "training_plan_week", "training_plan_cur_date", "health_connect_sync_info", "temperature_trend", FitnessDBConstants.TABLE_TEMPERATURE_CHARACTER_RECORD, "algo_curse");
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "sport_report", FitnessDBConstants.TABLE_SLEEP, "server_request", FitnessDBConstants.TABLE_HEART_RATE, FitnessDBConstants.TABLE_STEP, FitnessDBConstants.TABLE_CALORIE, FitnessDBConstants.TABLE_STAND, FitnessDBConstants.TABLE_MH_STRENGTH, FitnessDBConstants.TABLE_ENERGY, "stress_record", "spo2_record", FitnessDBConstants.TABLE_VO2_MAX, FitnessDBConstants.TABLE_BLOOD_PRESSURE, FitnessDBConstants.TABLE_HEARING, FitnessDBConstants.TABLE_MENSTRUATION, FitnessDBConstants.TABLE_WEIGHT, "curse_record", "curse_observer", FitnessDBConstants.TABLE_PAI, SportReportObserverKt.TABLE_SPORT_REPORT_OBSERVER, "fds_data_id", FitnessDBConstants.TABLE_TRAINING_LOAD, FitnessDBConstants.TABLE_TEMPERATURE, FitnessDBConstants.TABLE_RUN_ABILITY_INDEX, FitnessDBConstants.TABLE_VITALITY, FitnessDBConstants.TABLE_BLOOD_SUGAR, FitnessDBConstants.TABLE_ECG_MEDICAL_TABLE, FitnessDBConstants.TABLE_BP_MEDICAL_TABLE, "physical_fitness_status", "lactate_threshold", "extra_data", "switch_song_dao", "training_plan_week", "training_plan_cur_date", "health_connect_sync_info", "temperature_trend", FitnessDBConstants.TABLE_TEMPERATURE_CHARACTER_RECORD, "algo_curse");
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public CurseRecordDao curseRecordDao() {
        CurseRecordDao curseRecordDao;
        if (this.u != null) {
            return this.u;
        }
        synchronized (this) {
            try {
                if (this.u == null) {
                    this.u = new ga5(this);
                }
                curseRecordDao = this.u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return curseRecordDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public CurseObserverDao curseRecordObserverDao() {
        CurseObserverDao curseObserverDao;
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            try {
                if (this.d == null) {
                    this.d = new s95(this);
                }
                curseObserverDao = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return curseObserverDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public EcgMedicalRecordDao ecgMedicalRecordDao() {
        EcgMedicalRecordDao ecgMedicalRecordDao;
        if (this.z != null) {
            return this.z;
        }
        synchronized (this) {
            try {
                if (this.z == null) {
                    this.z = new e(this);
                }
                ecgMedicalRecordDao = this.z;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ecgMedicalRecordDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public EnergyRecordDao energyRecordItemDao() {
        EnergyRecordDao energyRecordDao;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            try {
                if (this.l == null) {
                    this.l = new f(this);
                }
                energyRecordDao = this.l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return energyRecordDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public ExtraDataDao extraDataDao() {
        ExtraDataDao extraDataDao;
        if (this.E != null) {
            return this.E;
        }
        synchronized (this) {
            try {
                if (this.E == null) {
                    this.E = new g(this);
                }
                extraDataDao = this.E;
            } catch (Throwable th) {
                throw th;
            }
        }
        return extraDataDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public FDSDataIdDao fdsDataIdDao() {
        FDSDataIdDao fDSDataIdDao;
        if (this.f11325a != null) {
            return this.f11325a;
        }
        synchronized (this) {
            try {
                if (this.f11325a == null) {
                    this.f11325a = new zl8(this);
                }
                fDSDataIdDao = this.f11325a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fDSDataIdDao;
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
        map.put(FDSDataIdDao.class, zl8.j());
        map.put(SportReportDao.class, qyn.u());
        map.put(SportReportObserverDao.class, uyn.d());
        map.put(CurseObserverDao.class, s95.c());
        map.put(ServerRequestDao.class, hxl.j());
        map.put(SleepSegmentDao.class, o.n());
        map.put(HrRecordDao.class, i.k());
        map.put(StepRecordDao.class, r.k());
        map.put(CaloriesRecordItemDao.class, d.i());
        map.put(MHStrengthRecordDao.class, k.i());
        map.put(StandRecordItemDao.class, q.k());
        map.put(EnergyRecordDao.class, f.i());
        map.put(StressRecordDao.class, s.k());
        map.put(Spo2RecordDao.class, p.k());
        map.put(Vo2MaxRecordDao.class, y.i());
        map.put(BloodPressureRecordDao.class, b.k());
        map.put(HearingHealthRecordDao.class, h.i());
        map.put(WeightItemDao.class, z.l());
        map.put(WomenHealthRecordDao.class, a0.i());
        map.put(PaiRecordDao.class, l.i());
        map.put(CurseRecordDao.class, ga5.n());
        map.put(TrainingLoadRecordDao.class, w.i());
        map.put(TemperatureRecordDao.class, u.i());
        map.put(RunAbilityRecordDao.class, n.i());
        map.put(VitalityRecordDao.class, x.i());
        map.put(EcgMedicalRecordDao.class, e.i());
        map.put(BPMedicalRecordDao.class, com.xiaomi.fit.fitness.persist.db.internal.a.k());
        map.put(BloodSugarDao.class, c.i());
        map.put(PhysicalStatusDao.class, m.i());
        map.put(LactateThresholdDao.class, j.i());
        map.put(ExtraDataDao.class, g.i());
        map.put(SwitchSongDao.class, wro.e());
        map.put(AlgoCurseDao.class, p51.f());
        map.put(TrainingPlanWeekDao.class, zvp.e());
        map.put(TrainingPlanCurDateDao.class, vup.g());
        map.put(HealthConnectSyncDao.class, zrb.j());
        map.put(TemperatureTrendDao.class, v.i());
        map.put(TemperatureCharacterRecordDao.class, t.i());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new a(20, "50bf042530c08ea654905be11982b8c6", "61844065201566742e566555bf730fc7");
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public HealthConnectSyncDao healthConnectSyncDao() {
        HealthConnectSyncDao healthConnectSyncDao;
        if (this.J != null) {
            return this.J;
        }
        synchronized (this) {
            try {
                if (this.J == null) {
                    this.J = new zrb(this);
                }
                healthConnectSyncDao = this.J;
            } catch (Throwable th) {
                throw th;
            }
        }
        return healthConnectSyncDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public HearingHealthRecordDao hearingHealthItemDao() {
        HearingHealthRecordDao hearingHealthRecordDao;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    this.q = new h(this);
                }
                hearingHealthRecordDao = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hearingHealthRecordDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public HrRecordDao hrRecordItemDao() {
        HrRecordDao hrRecordDao;
        if (this.g != null) {
            return this.g;
        }
        synchronized (this) {
            try {
                if (this.g == null) {
                    this.g = new i(this);
                }
                hrRecordDao = this.g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hrRecordDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public LactateThresholdDao lactateThresholdDao() {
        LactateThresholdDao lactateThresholdDao;
        if (this.D != null) {
            return this.D;
        }
        synchronized (this) {
            try {
                if (this.D == null) {
                    this.D = new j(this);
                }
                lactateThresholdDao = this.D;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lactateThresholdDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public WomenHealthRecordDao menstruationItemDao() {
        WomenHealthRecordDao womenHealthRecordDao;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            try {
                if (this.s == null) {
                    this.s = new a0(this);
                }
                womenHealthRecordDao = this.s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return womenHealthRecordDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public MHStrengthRecordDao mhStrengthRecordItemDao() {
        MHStrengthRecordDao mHStrengthRecordDao;
        if (this.j != null) {
            return this.j;
        }
        synchronized (this) {
            try {
                if (this.j == null) {
                    this.j = new k(this);
                }
                mHStrengthRecordDao = this.j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mHStrengthRecordDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public PaiRecordDao paiRecordDao() {
        PaiRecordDao paiRecordDao;
        if (this.t != null) {
            return this.t;
        }
        synchronized (this) {
            try {
                if (this.t == null) {
                    this.t = new l(this);
                }
                paiRecordDao = this.t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return paiRecordDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public PhysicalStatusDao physicalStatusDao() {
        PhysicalStatusDao physicalStatusDao;
        if (this.C != null) {
            return this.C;
        }
        synchronized (this) {
            try {
                if (this.C == null) {
                    this.C = new m(this);
                }
                physicalStatusDao = this.C;
            } catch (Throwable th) {
                throw th;
            }
        }
        return physicalStatusDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public RunAbilityRecordDao runningAbilityIndexDao() {
        RunAbilityRecordDao runAbilityRecordDao;
        if (this.x != null) {
            return this.x;
        }
        synchronized (this) {
            try {
                if (this.x == null) {
                    this.x = new n(this);
                }
                runAbilityRecordDao = this.x;
            } catch (Throwable th) {
                throw th;
            }
        }
        return runAbilityRecordDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public ServerRequestDao serverRequestDao() {
        ServerRequestDao serverRequestDao;
        if (this.e != null) {
            return this.e;
        }
        synchronized (this) {
            try {
                if (this.e == null) {
                    this.e = new hxl(this);
                }
                serverRequestDao = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return serverRequestDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public SleepSegmentDao sleepSegmentDao() {
        SleepSegmentDao sleepSegmentDao;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new o(this);
                }
                sleepSegmentDao = this.f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sleepSegmentDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public Spo2RecordDao spo2RecordItemDao() {
        Spo2RecordDao spo2RecordDao;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            try {
                if (this.n == null) {
                    this.n = new p(this);
                }
                spo2RecordDao = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return spo2RecordDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public SportReportDao sportReportDao() {
        SportReportDao sportReportDao;
        if (this.f11326b != null) {
            return this.f11326b;
        }
        synchronized (this) {
            try {
                if (this.f11326b == null) {
                    this.f11326b = new qyn(this);
                }
                sportReportDao = this.f11326b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sportReportDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public SportReportObserverDao sportReportObserverDao() {
        SportReportObserverDao sportReportObserverDao;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            try {
                if (this.c == null) {
                    this.c = new uyn(this);
                }
                sportReportObserverDao = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sportReportObserverDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public StandRecordItemDao standRecordItemDao() {
        StandRecordItemDao standRecordItemDao;
        if (this.f11327k != null) {
            return this.f11327k;
        }
        synchronized (this) {
            try {
                if (this.f11327k == null) {
                    this.f11327k = new q(this);
                }
                standRecordItemDao = this.f11327k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return standRecordItemDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public StepRecordDao stepRecordItemDao() {
        StepRecordDao stepRecordDao;
        if (this.h != null) {
            return this.h;
        }
        synchronized (this) {
            try {
                if (this.h == null) {
                    this.h = new r(this);
                }
                stepRecordDao = this.h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return stepRecordDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public StressRecordDao stressRecordItemDao() {
        StressRecordDao stressRecordDao;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            try {
                if (this.m == null) {
                    this.m = new s(this);
                }
                stressRecordDao = this.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return stressRecordDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public SwitchSongDao switchSongDao() {
        SwitchSongDao switchSongDao;
        if (this.F != null) {
            return this.F;
        }
        synchronized (this) {
            try {
                if (this.F == null) {
                    this.F = new wro(this);
                }
                switchSongDao = this.F;
            } catch (Throwable th) {
                throw th;
            }
        }
        return switchSongDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public TemperatureCharacterRecordDao temperatureCharacterDao() {
        TemperatureCharacterRecordDao temperatureCharacterRecordDao;
        if (this.L != null) {
            return this.L;
        }
        synchronized (this) {
            try {
                if (this.L == null) {
                    this.L = new t(this);
                }
                temperatureCharacterRecordDao = this.L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return temperatureCharacterRecordDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public TemperatureRecordDao temperatureRecordDao() {
        TemperatureRecordDao temperatureRecordDao;
        if (this.w != null) {
            return this.w;
        }
        synchronized (this) {
            try {
                if (this.w == null) {
                    this.w = new u(this);
                }
                temperatureRecordDao = this.w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return temperatureRecordDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public TemperatureTrendDao temperatureTrendDao() {
        TemperatureTrendDao temperatureTrendDao;
        if (this.K != null) {
            return this.K;
        }
        synchronized (this) {
            try {
                if (this.K == null) {
                    this.K = new v(this);
                }
                temperatureTrendDao = this.K;
            } catch (Throwable th) {
                throw th;
            }
        }
        return temperatureTrendDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public TrainingLoadRecordDao trainingLoadRecordDao() {
        TrainingLoadRecordDao trainingLoadRecordDao;
        if (this.v != null) {
            return this.v;
        }
        synchronized (this) {
            try {
                if (this.v == null) {
                    this.v = new w(this);
                }
                trainingLoadRecordDao = this.v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return trainingLoadRecordDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public TrainingPlanCurDateDao trainingPlanCurDateDao() {
        TrainingPlanCurDateDao trainingPlanCurDateDao;
        if (this.I != null) {
            return this.I;
        }
        synchronized (this) {
            try {
                if (this.I == null) {
                    this.I = new vup(this);
                }
                trainingPlanCurDateDao = this.I;
            } catch (Throwable th) {
                throw th;
            }
        }
        return trainingPlanCurDateDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public TrainingPlanWeekDao trainingPlanWeekDao() {
        TrainingPlanWeekDao trainingPlanWeekDao;
        if (this.H != null) {
            return this.H;
        }
        synchronized (this) {
            try {
                if (this.H == null) {
                    this.H = new zvp(this);
                }
                trainingPlanWeekDao = this.H;
            } catch (Throwable th) {
                throw th;
            }
        }
        return trainingPlanWeekDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public VitalityRecordDao vitalityRecordDao() {
        VitalityRecordDao vitalityRecordDao;
        if (this.y != null) {
            return this.y;
        }
        synchronized (this) {
            try {
                if (this.y == null) {
                    this.y = new x(this);
                }
                vitalityRecordDao = this.y;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vitalityRecordDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public Vo2MaxRecordDao vo2maxItemDao() {
        Vo2MaxRecordDao vo2MaxRecordDao;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new y(this);
                }
                vo2MaxRecordDao = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vo2MaxRecordDao;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.FitnessDatabase
    public WeightItemDao weightRecordDao() {
        WeightItemDao weightItemDao;
        if (this.f11328r != null) {
            return this.f11328r;
        }
        synchronized (this) {
            try {
                if (this.f11328r == null) {
                    this.f11328r = new z(this);
                }
                weightItemDao = this.f11328r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return weightItemDao;
    }
}
