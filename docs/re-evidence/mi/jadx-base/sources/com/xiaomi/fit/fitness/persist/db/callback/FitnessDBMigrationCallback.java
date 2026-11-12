package com.xiaomi.fit.fitness.persist.db.callback;

import android.content.Context;
import androidx.room.Room;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.di.FitnessDataSingleModuleKt;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConfiguration;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import com.xiaomi.fit.fitness.persist.db.FitnessDatabase;
import com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao;
import com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseEntity;
import com.xiaomi.fit.fitness.persist.db.internal.FDSDataIdDao;
import com.xiaomi.fit.fitness.persist.db.internal.FDSDataIdEntity;
import com.xiaomi.fit.fitness.persist.db.internal.ServerRequestDao;
import com.xiaomi.fit.fitness.persist.db.internal.ServerRequestEntity;
import com.xiaomi.fit.fitness.persist.db.internal.SportReportDao;
import com.xiaomi.fit.fitness.persist.db.internal.SportReportEntity;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoRepo;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import defpackage.el1;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\nJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/callback/FitnessDBMigrationCallback;", "Lel1;", "", "dbName", "", "doFitnessDataMigration", "(Ljava/lang/String;)Z", "Lcom/xiaomi/fit/fitness/persist/db/FitnessDatabase;", "dbInstance", "migrationDailyRecord", "(Lcom/xiaomi/fit/fitness/persist/db/FitnessDatabase;)Z", "migrationSport", "migrationFdsData", "migrationServerRequest", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "getHomeTypeList", "()Ljava/util/List;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "", "onAsyncCreate", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "migrationOnce", "()Z", "TAG", "Ljava/lang/String;", "", "limit", "I", "Landroid/content/Context;", "ctx", "<init>", "(Landroid/content/Context;)V", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFitnessDBMigrationCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessDBMigrationCallback.kt\ncom/xiaomi/fit/fitness/persist/db/callback/FitnessDBMigrationCallback\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,197:1\n37#2:198\n36#2,3:199\n37#2:202\n36#2,3:203\n37#2:206\n36#2,3:207\n37#2:210\n36#2,3:211\n*S KotlinDebug\n*F\n+ 1 FitnessDBMigrationCallback.kt\ncom/xiaomi/fit/fitness/persist/db/callback/FitnessDBMigrationCallback\n*L\n141#1:198\n141#1:199,3\n142#1:202\n142#1:203,3\n156#1:206\n156#1:207,3\n157#1:210\n157#1:211,3\n*E\n"})
public final class FitnessDBMigrationCallback extends el1 {

    @NotNull
    private final String TAG;
    private final int limit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FitnessDBMigrationCallback(@NotNull Context ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.TAG = "DB_Trans";
        this.limit = 400;
    }

    private final boolean doFitnessDataMigration(String dbName) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        FitnessDatabase fitnessDatabase = (FitnessDatabase) Room.databaseBuilder(context, FitnessDatabase.class, dbName).build();
        String path = fitnessDatabase.getOpenHelper().getReadableDatabase().getPath();
        FitnessLogUtils.i(this.TAG, "doFitnessDataMigration: >>>> dbName = " + dbName + ", oldDbPath = " + path);
        boolean z = migrationFdsData(fitnessDatabase) && migrationSport(fitnessDatabase) && migrationDailyRecord(fitnessDatabase);
        FitnessLogUtils.i(this.TAG, "doFitnessDataMigration: " + path + " migration finished <<<<<<");
        return z;
    }

    private final List<HomeDataType> getHomeTypeList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(HomeDataType.STEP);
        arrayList.add(HomeDataType.CALORIE);
        arrayList.add(HomeDataType.VALID_STAND);
        arrayList.add(HomeDataType.MH_STRENGTH);
        arrayList.add(HomeDataType.BLOOD_PRESSURE);
        arrayList.add(HomeDataType.SLEEP);
        arrayList.add(HomeDataType.HR);
        arrayList.add(HomeDataType.STRESS);
        arrayList.add(HomeDataType.SPO2);
        arrayList.add(HomeDataType.PAI);
        arrayList.add(HomeDataType.ENERGY);
        arrayList.add(HomeDataType.V02_MAX);
        arrayList.add(HomeDataType.WEIGHT);
        arrayList.add(HomeDataType.HEARING_HEALTH);
        arrayList.add(HomeDataType.WOMEN_HEALTH);
        arrayList.add(HomeDataType.VITALITY);
        arrayList.add(HomeDataType.PHYSICAL_STATUS);
        return arrayList;
    }

    private final boolean migrationDailyRecord(FitnessDatabase dbInstance) {
        FitnessDatabase companion = FitnessDatabase.INSTANCE.getInstance();
        for (HomeDataType homeDataType : getHomeTypeList()) {
            FitnessLogUtils.i(this.TAG, "migrationDailyRecord: " + homeDataType + " start");
            DailyRecordDaoRepo dailyRecordDaoRepo = DailyRecordDaoRepo.INSTANCE;
            DailyRecordBaseDao<? extends DailyRecordBaseEntity> dailyRecordDao = dailyRecordDaoRepo.getDailyRecordDao(homeDataType, companion);
            DailyRecordBaseDao<? extends DailyRecordBaseEntity> dailyRecordDao2 = dailyRecordDaoRepo.getDailyRecordDao(homeDataType, dbInstance);
            List<? extends DailyRecordBaseEntity> listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            int i = 0;
            do {
                int size = i;
                if (dailyRecordDao != null && dailyRecordDao2 != null) {
                    listEmptyList = DailyRecordDaoUtils.queryAllItemEntity$default(DailyRecordDaoUtils.INSTANCE, dailyRecordDao2, Long.MAX_VALUE, this.limit, false, 8, null);
                    if (!listEmptyList.isEmpty()) {
                        dailyRecordDao.insertAll(listEmptyList);
                        dailyRecordDao2.deleteAll(listEmptyList);
                        size += listEmptyList.size();
                    }
                }
                i = size;
            } while (!listEmptyList.isEmpty());
            if (HomeDataType.WOMEN_HEALTH == homeDataType) {
                FitnessDataSingleModuleKt.getCurseRepo().aggregateData(true);
            }
            FitnessLogUtils.i(this.TAG, "migrationDailyRecord: " + homeDataType + " finished, count = " + i);
        }
        FitnessLogUtils.i(this.TAG, "migrationDailyRecord: all finished");
        return true;
    }

    private final boolean migrationFdsData(FitnessDatabase dbInstance) {
        FitnessLogUtils.i(this.TAG, "migrationFdsData: in");
        FDSDataIdDao fdsDataIdDao = FitnessDatabase.INSTANCE.getInstance().fdsDataIdDao();
        FDSDataIdDao fdsDataIdDao2 = dbInstance.fdsDataIdDao();
        List<FDSDataIdEntity> listQueryAllIds = fdsDataIdDao2.queryAllIds();
        List<FDSDataIdEntity> list = listQueryAllIds;
        FDSDataIdEntity[] fDSDataIdEntityArr = (FDSDataIdEntity[]) list.toArray(new FDSDataIdEntity[0]);
        fdsDataIdDao.insert((FDSDataIdEntity[]) Arrays.copyOf(fDSDataIdEntityArr, fDSDataIdEntityArr.length));
        FDSDataIdEntity[] fDSDataIdEntityArr2 = (FDSDataIdEntity[]) list.toArray(new FDSDataIdEntity[0]);
        fdsDataIdDao2.delete((FDSDataIdEntity[]) Arrays.copyOf(fDSDataIdEntityArr2, fDSDataIdEntityArr2.length));
        FitnessLogUtils.i(this.TAG, "migrationFdsData: finished, size = " + listQueryAllIds.size());
        return true;
    }

    private final boolean migrationServerRequest(FitnessDatabase dbInstance) {
        FitnessLogUtils.i(this.TAG, "migrationServerRequest: in");
        ServerRequestDao serverRequestDao = FitnessDatabase.INSTANCE.getInstance().serverRequestDao();
        ServerRequestDao serverRequestDao2 = dbInstance.serverRequestDao();
        List<ServerRequestEntity> listQueryAllEntity = serverRequestDao2.queryAllEntity();
        serverRequestDao.insertAll(listQueryAllEntity);
        serverRequestDao2.deleteAll(listQueryAllEntity);
        FitnessLogUtils.i(this.TAG, "migrationServerRequest: finished, size = " + listQueryAllEntity.size());
        return true;
    }

    private final boolean migrationSport(FitnessDatabase dbInstance) {
        List<SportReportEntity> list;
        FitnessLogUtils.i(this.TAG, "migrationSport: in");
        SportReportDao sportReportDao = FitnessDatabase.INSTANCE.getInstance().sportReportDao();
        SportReportDao sportReportDao2 = dbInstance.sportReportDao();
        CollectionsKt__CollectionsKt.emptyList();
        int size = 0;
        do {
            List<SportReportEntity> listQueryPagedSportEntity = sportReportDao2.queryPagedSportEntity(Long.MAX_VALUE, this.limit);
            list = listQueryPagedSportEntity;
            if (!list.isEmpty()) {
                SportReportEntity[] sportReportEntityArr = (SportReportEntity[]) list.toArray(new SportReportEntity[0]);
                sportReportDao.insertAll((SportReportEntity[]) Arrays.copyOf(sportReportEntityArr, sportReportEntityArr.length));
                SportReportEntity[] sportReportEntityArr2 = (SportReportEntity[]) list.toArray(new SportReportEntity[0]);
                sportReportDao2.deleteAll((SportReportEntity[]) Arrays.copyOf(sportReportEntityArr2, sportReportEntityArr2.length));
                size += listQueryPagedSportEntity.size();
            }
        } while (!list.isEmpty());
        FitnessLogUtils.i(this.TAG, "migrationSport: finished, size = " + size);
        return true;
    }

    @Override // defpackage.el1
    public boolean migrationOnce() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0052  */
    @Override // defpackage.el1
    public void onAsyncCreate(@NotNull SupportSQLiteDatabase db) {
        boolean z;
        String path;
        Intrinsics.checkNotNullParameter(db, "db");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (new File(FileUtils.getDatabaseDir(context), "fitness_data").exists()) {
            FitnessLogUtils.i(this.TAG, "onAsyncCreate: defaultDb exists");
            if (doFitnessDataMigration("fitness_data")) {
                FitnessLogUtils.i(this.TAG, "default fitness_data migration success");
                getContext().deleteDatabase("fitness_data");
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            FitnessDBConfiguration fitnessDBConfiguration = FitnessDBConfiguration.INSTANCE;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            File file = new File(fitnessDBConfiguration.makeDatabasePath(context2, FitnessDBConstants.PATH_NO_ACCOUNT, RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion()), "fitness_data");
            FitnessLogUtils.i(this.TAG, "not login db = " + file);
            if (file.exists() && (path = db.getPath()) != null && !StringsKt__StringsKt.contains$default((CharSequence) path, (CharSequence) FitnessDBConstants.PATH_NO_ACCOUNT, false, 2, (Object) null)) {
                FitnessLogUtils.i(this.TAG, "not login db exists, " + file);
                String absolutePath = file.getAbsolutePath();
                Intrinsics.checkNotNull(absolutePath);
                if (doFitnessDataMigration(absolutePath)) {
                    FitnessLogUtils.i(this.TAG, "not login fitness_data migration success");
                    getContext().deleteDatabase(absolutePath);
                } else if (!z) {
                    return;
                }
            } else if (!z) {
                return;
            }
        } else if (!z) {
            return;
        }
        FitnessLogUtils.w(this.TAG, "fitness_data migration finished");
        FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE).syncWithServer(true, "migration_fitness_db", null);
    }
}
