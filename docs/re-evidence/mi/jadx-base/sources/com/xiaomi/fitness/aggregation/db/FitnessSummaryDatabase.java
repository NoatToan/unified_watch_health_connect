package com.xiaomi.fitness.aggregation.db;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.room.migration.Migration;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConfiguration;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import com.xiaomi.fit.fitness.persist.db.internal.SportSummaryDao;
import com.xiaomi.fit.fitness.persist.db.internal.SportSummaryEntity;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDao;
import com.xiaomi.fitness.aggregation.health.dao.FitnessDeviceListDao;
import com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDao;
import com.xiaomi.fitness.aggregation.health.dao.RainbowEntityDao;
import com.xiaomi.fitness.aggregation.health.dao.RedDotDao;
import com.xiaomi.fitness.aggregation.health.dao.StatEntityDao;
import com.xiaomi.fitness.aggregation.health.entity.DailyGoalReportEntity;
import com.xiaomi.fitness.aggregation.health.entity.FitnessDailyReportEntity;
import com.xiaomi.fitness.aggregation.health.entity.FitnessDeviceItemEntity;
import com.xiaomi.fitness.aggregation.health.entity.ProjectEntity;
import com.xiaomi.fitness.aggregation.health.entity.RedDotEntity;
import com.xiaomi.fitness.aggregation.health.entity.StatDataEntity;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.database.BaseDatabase;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@TypeConverters({HomeDataTypeConvert.class})
@Database(entities = {DailyGoalReportEntity.class, FitnessDailyReportEntity.class, FitnessDeviceItemEntity.class, SportSummaryEntity.class, RedDotEntity.class, StatDataEntity.class, ProjectEntity.class}, version = 6)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/aggregation/db/FitnessSummaryDatabase;", "Lcom/xiaomi/fitness/database/BaseDatabase;", "<init>", "()V", "getDailyGoalReportDao", "Lcom/xiaomi/fitness/aggregation/health/dao/RainbowEntityDao;", "getFitnessDailyReportDao", "Lcom/xiaomi/fitness/aggregation/health/dao/FitnessDailyReportDao;", "getDevicesListDao", "Lcom/xiaomi/fitness/aggregation/health/dao/FitnessDeviceListDao;", "getRedDotDao", "Lcom/xiaomi/fitness/aggregation/health/dao/RedDotDao;", "sportSummaryDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/SportSummaryDao;", "statEntityDao", "Lcom/xiaomi/fitness/aggregation/health/dao/StatEntityDao;", "sleepProjectEntityDao", "Lcom/xiaomi/fitness/aggregation/health/dao/ProjectEntityDao;", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FitnessSummaryDatabase extends BaseDatabase {

    @NotNull
    public static final String DB_NAME = "fitness_summary";

    @NotNull
    private static final String TAG = "FitnessSummaryDatabase";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ConcurrentHashMap<String, ConcurrentHashMap<String, FitnessSummaryDatabase>> dbInstanceMap = new ConcurrentHashMap<>();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/aggregation/db/FitnessSummaryDatabase$Companion;", "", "<init>", "()V", "TAG", "", "DB_NAME", "dbInstanceMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/xiaomi/fitness/aggregation/db/FitnessSummaryDatabase;", "instance", "getInstance", "()Lcom/xiaomi/fitness/aggregation/db/FitnessSummaryDatabase;", "getDBInstance", "account", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final FitnessSummaryDatabase getDBInstance(String account) {
            FitnessSummaryDatabase fitnessSummaryDatabase;
            String currentRegion = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion();
            String str = FitnessDBConfiguration.INSTANCE.makeDatabasePath(ApplicationExtKt.getApplication(), account, currentRegion) + "/fitness_summary";
            FitnessLogUtils.d(FitnessSummaryDatabase.TAG, "getDBInstance: region = " + currentRegion + ", dbName = fitness_summary");
            synchronized (FitnessSummaryDatabase.class) {
                try {
                    RoomDatabase.Builder builderDatabaseBuilder = Room.databaseBuilder(ApplicationExtKt.getApplication(), FitnessSummaryDatabase.class, str);
                    RoomDatabase.Builder builderAllowMainThreadQueries = builderDatabaseBuilder.setQueryExecutor(ExecutorHelper.getBackgroundPool()).allowMainThreadQueries();
                    builderAllowMainThreadQueries.enableMultiInstanceInvalidation();
                    Migration[] migrations = new FitnessSummaryDbMigration().getMigrations();
                    builderAllowMainThreadQueries.addMigrations((Migration[]) Arrays.copyOf(migrations, migrations.length));
                    if (ApplicationExtKt.isSameProcess(ApplicationExtKt.getApplication(), ":device")) {
                        builderAllowMainThreadQueries.addCallback(new FitnessSummaryCallback(ApplicationExtKt.getApplication()));
                    }
                    fitnessSummaryDatabase = (FitnessSummaryDatabase) builderDatabaseBuilder.build();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return fitnessSummaryDatabase;
        }

        @NotNull
        public final FitnessSummaryDatabase getInstance() {
            FitnessSummaryDatabase fitnessSummaryDatabase;
            synchronized (FitnessSummaryDatabase.class) {
                try {
                    String userId = AccountManagerExtKt.getInstance(AccountManager.INSTANCE).getUserId();
                    if (userId == null) {
                        userId = FitnessDBConstants.PATH_NO_ACCOUNT;
                    }
                    String currentRegion = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion();
                    if (currentRegion == null || currentRegion.length() == 0) {
                        throw new IllegalStateException("account , region is " + currentRegion + ", database instance initialization need be after region has be selected");
                    }
                    Object concurrentHashMap = FitnessSummaryDatabase.dbInstanceMap.get(userId);
                    if (concurrentHashMap == null) {
                        synchronized (FitnessSummaryDatabase.class) {
                            try {
                                if (FitnessSummaryDatabase.dbInstanceMap.get(userId) == null) {
                                    FitnessLogUtils.i(FitnessSummaryDatabase.TAG, "getInstance: make dbRegionMap");
                                    concurrentHashMap = new ConcurrentHashMap();
                                    FitnessSummaryDatabase.dbInstanceMap.put(userId, concurrentHashMap);
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
                        synchronized (FitnessSummaryDatabase.class) {
                            try {
                                if (((ConcurrentHashMap) concurrentHashMap).get(currentRegion) == null) {
                                    ((ConcurrentHashMap) concurrentHashMap).clear();
                                    dBInstance = FitnessSummaryDatabase.INSTANCE.getDBInstance(userId);
                                    Intrinsics.checkNotNull(dBInstance);
                                    ((Map) concurrentHashMap).put(currentRegion, dBInstance);
                                    FitnessLogUtils.d(FitnessSummaryDatabase.TAG, "getInstance: dbInstance = " + dBInstance);
                                }
                                Unit unit2 = Unit.INSTANCE;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    Intrinsics.checkNotNull(dBInstance);
                    fitnessSummaryDatabase = (FitnessSummaryDatabase) dBInstance;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return fitnessSummaryDatabase;
        }
    }

    @NotNull
    public abstract RainbowEntityDao getDailyGoalReportDao();

    @NotNull
    public abstract FitnessDeviceListDao getDevicesListDao();

    @NotNull
    public abstract FitnessDailyReportDao getFitnessDailyReportDao();

    @NotNull
    public abstract RedDotDao getRedDotDao();

    @NotNull
    public abstract ProjectEntityDao sleepProjectEntityDao();

    @NotNull
    public abstract SportSummaryDao sportSummaryDao();

    @NotNull
    public abstract StatEntityDao statEntityDao();
}
