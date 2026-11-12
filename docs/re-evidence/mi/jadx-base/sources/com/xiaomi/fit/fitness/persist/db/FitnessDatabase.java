package com.xiaomi.fit.fitness.persist.db;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.persist.db.callback.FitnessDBMigrationCallback;
import com.xiaomi.fit.fitness.persist.db.internal.AlgoCurseDao;
import com.xiaomi.fit.fitness.persist.db.internal.AlgoCurseEntity;
import com.xiaomi.fit.fitness.persist.db.internal.BPMedicalRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.BPMedicalRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.BloodPressureRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.BloodPressureRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.BloodSugarDao;
import com.xiaomi.fit.fitness.persist.db.internal.BloodSugarEntity;
import com.xiaomi.fit.fitness.persist.db.internal.CaloriesRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.CaloriesRecordItemDao;
import com.xiaomi.fit.fitness.persist.db.internal.CurseObserver;
import com.xiaomi.fit.fitness.persist.db.internal.CurseObserverDao;
import com.xiaomi.fit.fitness.persist.db.internal.EcgMedicalRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.EcgMedicalRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.EnergyRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.EnergyRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.ExtraDataDao;
import com.xiaomi.fit.fitness.persist.db.internal.ExtraDataEntity;
import com.xiaomi.fit.fitness.persist.db.internal.FDSDataIdDao;
import com.xiaomi.fit.fitness.persist.db.internal.FDSDataIdEntity;
import com.xiaomi.fit.fitness.persist.db.internal.HealthConnectSyncDao;
import com.xiaomi.fit.fitness.persist.db.internal.HealthConnectSyncDaoEntity;
import com.xiaomi.fit.fitness.persist.db.internal.HearingHealthRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.HearingHealthRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.HrRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.HrRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.LactateThresholdDao;
import com.xiaomi.fit.fitness.persist.db.internal.LactateThresholdEntity;
import com.xiaomi.fit.fitness.persist.db.internal.MHStrengthRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.MHStrengthRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.PaiRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.PaiRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.PhysicalStatusDao;
import com.xiaomi.fit.fitness.persist.db.internal.PhysicalStatusEntity;
import com.xiaomi.fit.fitness.persist.db.internal.RunAbilityRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.RunAbilityRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.ServerRequestDao;
import com.xiaomi.fit.fitness.persist.db.internal.ServerRequestEntity;
import com.xiaomi.fit.fitness.persist.db.internal.SleepSegmentDao;
import com.xiaomi.fit.fitness.persist.db.internal.SleepSegmentEntity;
import com.xiaomi.fit.fitness.persist.db.internal.Spo2RecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.Spo2RecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.SportReportDao;
import com.xiaomi.fit.fitness.persist.db.internal.SportReportEntity;
import com.xiaomi.fit.fitness.persist.db.internal.SportReportObserver;
import com.xiaomi.fit.fitness.persist.db.internal.SportReportObserverDao;
import com.xiaomi.fit.fitness.persist.db.internal.StandRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.StandRecordItemDao;
import com.xiaomi.fit.fitness.persist.db.internal.StepRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.StepRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.StressRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.StressRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.SwitchSongDao;
import com.xiaomi.fit.fitness.persist.db.internal.SwitchSongEntity;
import com.xiaomi.fit.fitness.persist.db.internal.TemperatureCharacterRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.TemperatureCharacterRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.TemperatureRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.TemperatureRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.TemperatureTrendDao;
import com.xiaomi.fit.fitness.persist.db.internal.TemperatureTrendEntity;
import com.xiaomi.fit.fitness.persist.db.internal.TrainingLoadRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.TrainingLoadRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.TrainingPlanCurDateDao;
import com.xiaomi.fit.fitness.persist.db.internal.TrainingPlanCurDateEntity;
import com.xiaomi.fit.fitness.persist.db.internal.TrainingPlanWeekDao;
import com.xiaomi.fit.fitness.persist.db.internal.TrainingPlanWeekEntity;
import com.xiaomi.fit.fitness.persist.db.internal.VitalityRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.VitalityRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.Vo2MaxRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.Vo2MaxRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.WeightItemDao;
import com.xiaomi.fit.fitness.persist.db.internal.WeightItemEntity;
import com.xiaomi.fit.fitness.persist.db.internal.WomenHealthRecordDao;
import com.xiaomi.fit.fitness.persist.db.internal.WomenHealthRecordEntity;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.aggregation.health.entity.CurseRecordDao;
import com.xiaomi.fitness.aggregation.health.entity.CurseRecordEntity;
import com.xiaomi.fitness.aggregation.summary.SummarySyncCallback;
import com.xiaomi.fitness.aggregation.summary.WidgetSyncCallback;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.database.BaseDatabase;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.migration.MiHealthMigrationCallback;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Database(entities = {SportReportEntity.class, SleepSegmentEntity.class, ServerRequestEntity.class, HrRecordEntity.class, StepRecordEntity.class, CaloriesRecordEntity.class, StandRecordEntity.class, MHStrengthRecordEntity.class, EnergyRecordEntity.class, StressRecordEntity.class, Spo2RecordEntity.class, Vo2MaxRecordEntity.class, BloodPressureRecordEntity.class, HearingHealthRecordEntity.class, WomenHealthRecordEntity.class, WeightItemEntity.class, CurseRecordEntity.class, CurseObserver.class, PaiRecordEntity.class, SportReportObserver.class, FDSDataIdEntity.class, TrainingLoadRecordEntity.class, TemperatureRecordEntity.class, RunAbilityRecordEntity.class, VitalityRecordEntity.class, BloodSugarEntity.class, EcgMedicalRecordEntity.class, BPMedicalRecordEntity.class, PhysicalStatusEntity.class, LactateThresholdEntity.class, ExtraDataEntity.class, SwitchSongEntity.class, TrainingPlanWeekEntity.class, TrainingPlanCurDateEntity.class, HealthConnectSyncDaoEntity.class, TemperatureTrendEntity.class, TemperatureCharacterRecordEntity.class, AlgoCurseEntity.class}, version = 20)
@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u0000 P2\u00020\u0001:\u0001PB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001a\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u001fH&J\b\u0010 \u001a\u00020!H&J\b\u0010\"\u001a\u00020#H&J\b\u0010$\u001a\u00020%H&J\b\u0010&\u001a\u00020'H&J\b\u0010(\u001a\u00020)H&J\b\u0010*\u001a\u00020+H&J\b\u0010,\u001a\u00020-H&J\b\u0010.\u001a\u00020/H&J\b\u00100\u001a\u000201H&J\b\u00102\u001a\u000203H&J\b\u00104\u001a\u000205H&J\b\u00106\u001a\u000207H&J\b\u00108\u001a\u000209H&J\b\u0010:\u001a\u00020;H&J\b\u0010<\u001a\u00020=H&J\b\u0010>\u001a\u00020?H&J\b\u0010@\u001a\u00020AH&J\b\u0010B\u001a\u00020CH&J\b\u0010D\u001a\u00020EH&J\b\u0010F\u001a\u00020GH&J\b\u0010H\u001a\u00020IH&J\b\u0010J\u001a\u00020KH&J\b\u0010L\u001a\u00020MH&J\b\u0010N\u001a\u00020OH&¨\u0006Q"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/FitnessDatabase;", "Lcom/xiaomi/fitness/database/BaseDatabase;", "<init>", "()V", "fdsDataIdDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/FDSDataIdDao;", "sportReportDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/SportReportDao;", "sportReportObserverDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/SportReportObserverDao;", "curseRecordObserverDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/CurseObserverDao;", "serverRequestDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/ServerRequestDao;", "sleepSegmentDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/SleepSegmentDao;", "hrRecordItemDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/HrRecordDao;", "stepRecordItemDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/StepRecordDao;", "calorieRecordItemDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/CaloriesRecordItemDao;", "mhStrengthRecordItemDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/MHStrengthRecordDao;", "standRecordItemDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/StandRecordItemDao;", "energyRecordItemDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/EnergyRecordDao;", "stressRecordItemDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/StressRecordDao;", "spo2RecordItemDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/Spo2RecordDao;", "vo2maxItemDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/Vo2MaxRecordDao;", "bloodPressureItemDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/BloodPressureRecordDao;", "hearingHealthItemDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/HearingHealthRecordDao;", "weightRecordDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/WeightItemDao;", "menstruationItemDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/WomenHealthRecordDao;", "paiRecordDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/PaiRecordDao;", "curseRecordDao", "Lcom/xiaomi/fitness/aggregation/health/entity/CurseRecordDao;", "trainingLoadRecordDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/TrainingLoadRecordDao;", "temperatureRecordDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/TemperatureRecordDao;", "runningAbilityIndexDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/RunAbilityRecordDao;", "vitalityRecordDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/VitalityRecordDao;", "ecgMedicalRecordDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/EcgMedicalRecordDao;", "bloodPressureMedicalDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/BPMedicalRecordDao;", "bloodSugarDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/BloodSugarDao;", "physicalStatusDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/PhysicalStatusDao;", "lactateThresholdDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/LactateThresholdDao;", "extraDataDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/ExtraDataDao;", "switchSongDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/SwitchSongDao;", "algoCurseDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/AlgoCurseDao;", "trainingPlanWeekDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/TrainingPlanWeekDao;", "trainingPlanCurDateDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/TrainingPlanCurDateDao;", "healthConnectSyncDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/HealthConnectSyncDao;", "temperatureTrendDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/TemperatureTrendDao;", "temperatureCharacterDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/TemperatureCharacterRecordDao;", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FitnessDatabase extends BaseDatabase {

    @NotNull
    private static final String DB_NAME = "fitness_data";

    @NotNull
    private static final String TAG = "FitnessDatabase";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ConcurrentHashMap<String, ConcurrentHashMap<String, FitnessDatabase>> dbInstanceMap = new ConcurrentHashMap<>();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R&\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/FitnessDatabase$Companion;", "", "<init>", "()V", "TAG", "", "dbInstanceMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/xiaomi/fit/fitness/persist/db/FitnessDatabase;", "DB_NAME", "instance", "getInstance", "()Lcom/xiaomi/fit/fitness/persist/db/FitnessDatabase;", "getDBInstance", "account", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final FitnessDatabase getDBInstance(String account) {
            FitnessDatabase fitnessDatabase;
            String currentRegion = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion();
            String str = FitnessDBConfiguration.INSTANCE.makeDatabasePath(ApplicationExtKt.getApplication(), account, currentRegion) + "/fitness_data";
            FitnessLogUtils.d(FitnessDatabase.TAG, "getDBInstance: region = " + currentRegion + ", dbName = fitness_data");
            synchronized (FitnessDatabase.class) {
                try {
                    RoomDatabase.Builder builderDatabaseBuilder = Room.databaseBuilder(ApplicationExtKt.getApplication(), FitnessDatabase.class, str);
                    RoomDatabase.Builder builderAllowMainThreadQueries = builderDatabaseBuilder.setQueryExecutor(ExecutorHelper.getBackgroundPool()).allowMainThreadQueries();
                    Migration[] migrations = new FitnessDBMigration().getMigrations();
                    RoomDatabase.Builder builderAddMigrations = builderAllowMainThreadQueries.addMigrations((Migration[]) Arrays.copyOf(migrations, migrations.length));
                    builderAddMigrations.enableMultiInstanceInvalidation();
                    if (ApplicationExtKt.isSameProcess(ApplicationExtKt.getApplication(), ":device")) {
                        builderAddMigrations.addCallback(new SummarySyncCallback("fitness_data", new FitnessSummaryConnector()));
                        builderAddMigrations.addCallback(new FitnessDBMigrationCallback(ApplicationExtKt.getApplication()));
                        builderAddMigrations.addCallback(new MiHealthMigrationCallback(ApplicationExtKt.getApplication()));
                    } else if (ApplicationExtKt.isSameProcess(ApplicationExtKt.getApplication(), ":widgetProvider")) {
                        FitnessLogUtils.i(FitnessDatabase.TAG, "widgetProvider, db callback");
                        builderAddMigrations.addCallback(new WidgetSyncCallback("fitness_data", new FitnessSummaryConnector()));
                    }
                    fitnessDatabase = (FitnessDatabase) builderDatabaseBuilder.build();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return fitnessDatabase;
        }

        @NotNull
        public final FitnessDatabase getInstance() {
            FitnessDatabase fitnessDatabase;
            synchronized (FitnessDatabase.class) {
                try {
                    String userId = AccountManagerExtKt.getInstance(AccountManager.INSTANCE).getUserId();
                    if (userId == null) {
                        userId = FitnessDBConstants.PATH_NO_ACCOUNT;
                    }
                    String currentRegion = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion();
                    if (currentRegion == null || currentRegion.length() == 0) {
                        throw new IllegalStateException("account, region is " + currentRegion + ", database instance initialization need be after region has be selected");
                    }
                    Object concurrentHashMap = FitnessDatabase.dbInstanceMap.get(userId);
                    if (concurrentHashMap == null) {
                        synchronized (FitnessDatabase.class) {
                            try {
                                if (FitnessDatabase.dbInstanceMap.get(userId) == null) {
                                    concurrentHashMap = new ConcurrentHashMap();
                                    FitnessDatabase.dbInstanceMap.put(userId, concurrentHashMap);
                                }
                                Unit unit = Unit.INSTANCE;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    Intrinsics.checkNotNull(concurrentHashMap);
                    Object dBInstance = ((ConcurrentHashMap) concurrentHashMap).get(currentRegion);
                    if (dBInstance == null) {
                        synchronized (FitnessDatabase.class) {
                            try {
                                if (((ConcurrentHashMap) concurrentHashMap).get(currentRegion) == null) {
                                    ((ConcurrentHashMap) concurrentHashMap).clear();
                                    dBInstance = FitnessDatabase.INSTANCE.getDBInstance(userId);
                                    Intrinsics.checkNotNull(dBInstance);
                                    ((Map) concurrentHashMap).put(currentRegion, dBInstance);
                                    FitnessLogUtils.d(FitnessDatabase.TAG, "getInstance: dbInstance = " + dBInstance);
                                }
                                Unit unit2 = Unit.INSTANCE;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    Intrinsics.checkNotNull(dBInstance);
                    fitnessDatabase = (FitnessDatabase) dBInstance;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return fitnessDatabase;
        }
    }

    @NotNull
    public abstract AlgoCurseDao algoCurseDao();

    @NotNull
    public abstract BloodPressureRecordDao bloodPressureItemDao();

    @NotNull
    public abstract BPMedicalRecordDao bloodPressureMedicalDao();

    @NotNull
    public abstract BloodSugarDao bloodSugarDao();

    @NotNull
    public abstract CaloriesRecordItemDao calorieRecordItemDao();

    @NotNull
    public abstract CurseRecordDao curseRecordDao();

    @NotNull
    public abstract CurseObserverDao curseRecordObserverDao();

    @NotNull
    public abstract EcgMedicalRecordDao ecgMedicalRecordDao();

    @NotNull
    public abstract EnergyRecordDao energyRecordItemDao();

    @NotNull
    public abstract ExtraDataDao extraDataDao();

    @NotNull
    public abstract FDSDataIdDao fdsDataIdDao();

    @NotNull
    public abstract HealthConnectSyncDao healthConnectSyncDao();

    @NotNull
    public abstract HearingHealthRecordDao hearingHealthItemDao();

    @NotNull
    public abstract HrRecordDao hrRecordItemDao();

    @NotNull
    public abstract LactateThresholdDao lactateThresholdDao();

    @NotNull
    public abstract WomenHealthRecordDao menstruationItemDao();

    @NotNull
    public abstract MHStrengthRecordDao mhStrengthRecordItemDao();

    @NotNull
    public abstract PaiRecordDao paiRecordDao();

    @NotNull
    public abstract PhysicalStatusDao physicalStatusDao();

    @NotNull
    public abstract RunAbilityRecordDao runningAbilityIndexDao();

    @NotNull
    public abstract ServerRequestDao serverRequestDao();

    @NotNull
    public abstract SleepSegmentDao sleepSegmentDao();

    @NotNull
    public abstract Spo2RecordDao spo2RecordItemDao();

    @NotNull
    public abstract SportReportDao sportReportDao();

    @NotNull
    public abstract SportReportObserverDao sportReportObserverDao();

    @NotNull
    public abstract StandRecordItemDao standRecordItemDao();

    @NotNull
    public abstract StepRecordDao stepRecordItemDao();

    @NotNull
    public abstract StressRecordDao stressRecordItemDao();

    @NotNull
    public abstract SwitchSongDao switchSongDao();

    @NotNull
    public abstract TemperatureCharacterRecordDao temperatureCharacterDao();

    @NotNull
    public abstract TemperatureRecordDao temperatureRecordDao();

    @NotNull
    public abstract TemperatureTrendDao temperatureTrendDao();

    @NotNull
    public abstract TrainingLoadRecordDao trainingLoadRecordDao();

    @NotNull
    public abstract TrainingPlanCurDateDao trainingPlanCurDateDao();

    @NotNull
    public abstract TrainingPlanWeekDao trainingPlanWeekDao();

    @NotNull
    public abstract VitalityRecordDao vitalityRecordDao();

    @NotNull
    public abstract Vo2MaxRecordDao vo2maxItemDao();

    @NotNull
    public abstract WeightItemDao weightRecordDao();
}
