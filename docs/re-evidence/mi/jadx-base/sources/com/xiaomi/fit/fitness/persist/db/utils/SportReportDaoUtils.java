package com.xiaomi.fit.fitness.persist.db.utils;

import android.text.TextUtils;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.SportDBKey;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.SportReportKey;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.persist.db.FitnessDatabase;
import com.xiaomi.fit.fitness.persist.db.internal.SportReportDao;
import com.xiaomi.fit.fitness.persist.db.internal.SportReportEntity;
import com.xiaomi.fit.fitness.persist.server.data.SportReportModel;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fitness.common.log.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u0014\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u0016\u0010\u0014\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012H\u0002J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00122\u0006\u0010\u0019\u001a\u00020\u001aJ\u0014\u0010\u001b\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012J\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00122\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fJ$\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00122\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fJ$\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00122\u0006\u0010$\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fJ6\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00122\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005H\u0002J\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012J!\u0010'\u001a\u0004\u0018\u00010\u001d2\u0006\u0010(\u001a\u00020\u00162\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010*J\u0018\u0010+\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u001aJ\u0014\u0010-\u001a\u00020\u000b2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\r0\u0012J \u0010/\u001a\u0004\u0018\u00010\u001d2\u0006\u00100\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u001fJ \u0010/\u001a\u0004\u0018\u00010\u001d2\u0006\u00100\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u001fJ\u0014\u00102\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012J\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020\u001a042\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u00065"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/utils/SportReportDaoUtils;", "", "<init>", "()V", "TAG", "", "sportReportDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/SportReportDao;", "getSportReportDao", "()Lcom/xiaomi/fit/fitness/persist/db/internal/SportReportDao;", "recordSportReportToDB", "", "sportKey", "Lcom/xiaomi/fit/fitness/SportDBKey;", "value", "recordServerSportReportToDB", "", "sportList", "", "Lcom/xiaomi/fit/fitness/persist/server/data/SportReportModel;", "insertSportReportToDb", "entityList", "Lcom/xiaomi/fit/fitness/persist/db/internal/SportReportEntity;", "getSportNotUploadToServer", "getDeletedSportReport", "limit", "", "markSportReportHasUploaded", "getSportReportBetween", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "startTime", "", "endTime", "getSportReportByKey", DailyRecordKey.sportType, "getSportReportByCategory", "category", "getSportReport", "key", "convertEntityToReport", "entity", "curTzInSec", "(Lcom/xiaomi/fit/fitness/persist/db/internal/SportReportEntity;Ljava/lang/Integer;)Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getRecentOneSport", "zoneOffsetInSec", "softDeleteSportReport", "reportList", "getTheSportReport", "sid", "time", "hardDeleteSportReport", "observerRecentCount", "Lkotlinx/coroutines/flow/Flow;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportReportDaoUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportReportDaoUtils.kt\ncom/xiaomi/fit/fitness/persist/db/utils/SportReportDaoUtils\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,244:1\n37#2:245\n36#2,3:246\n37#2:251\n36#2,3:252\n37#2:257\n36#2,3:258\n37#2:261\n36#2,3:262\n1863#3,2:249\n1863#3,2:255\n*S KotlinDebug\n*F\n+ 1 SportReportDaoUtils.kt\ncom/xiaomi/fit/fitness/persist/db/utils/SportReportDaoUtils\n*L\n83#1:245\n83#1:246,3\n102#1:251\n102#1:252,3\n204#1:257\n204#1:258,3\n237#1:261\n237#1:262,3\n99#1:249,2\n154#1:255,2\n*E\n"})
public final class SportReportDaoUtils {

    @NotNull
    public static final SportReportDaoUtils INSTANCE = new SportReportDaoUtils();

    @NotNull
    private static final String TAG = "SportReportDaoUtils";

    private SportReportDaoUtils() {
    }

    public static /* synthetic */ SportBasicReport convertEntityToReport$default(SportReportDaoUtils sportReportDaoUtils, SportReportEntity sportReportEntity, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return sportReportDaoUtils.convertEntityToReport(sportReportEntity, num);
    }

    private final List<SportBasicReport> getSportReport(long startTime, long endTime, String key, String category) {
        List<SportReportEntity> byKey;
        long currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        long j = startTime + currentTZOffsetInSec;
        long j2 = endTime + currentTZOffsetInSec;
        FitnessLogUtils.i(TAG, "getSportReport: startTime = " + j + ", endTime = " + j2);
        if (category != null) {
            byKey = getSportReportDao().getByCategory(category, j, j2);
        } else {
            byKey = key != null ? getSportReportDao().getByKey(key, j, j2) : getSportReportDao().getByTime(j, j2);
        }
        return convertEntityToReport(byKey);
    }

    public static /* synthetic */ List getSportReport$default(SportReportDaoUtils sportReportDaoUtils, long j, long j2, String str, String str2, int i, Object obj) {
        return sportReportDaoUtils.getSportReport(j, j2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }

    private final SportReportDao getSportReportDao() {
        return FitnessDatabase.INSTANCE.getInstance().sportReportDao();
    }

    private final void insertSportReportToDb(List<SportReportEntity> entityList) {
        if (entityList.isEmpty()) {
            FitnessLogUtils.i(TAG, "insertSportReportToDb: no report");
            return;
        }
        FitnessLogUtils.i(TAG, "insertSportReportToDb: has report");
        SportReportDao sportReportDao = getSportReportDao();
        SportReportEntity[] sportReportEntityArr = (SportReportEntity[]) entityList.toArray(new SportReportEntity[0]);
        sportReportDao.insertAll((SportReportEntity[]) Arrays.copyOf(sportReportEntityArr, sportReportEntityArr.length));
    }

    @NotNull
    public final List<SportBasicReport> convertEntityToReport(@NotNull List<SportReportEntity> entityList) {
        Intrinsics.checkNotNullParameter(entityList, "entityList");
        ArrayList arrayList = new ArrayList();
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        Iterator<T> it = entityList.iterator();
        while (it.hasNext()) {
            SportBasicReport sportBasicReportConvertEntityToReport = INSTANCE.convertEntityToReport((SportReportEntity) it.next(), Integer.valueOf(currentTZOffsetInSec));
            if (sportBasicReportConvertEntityToReport != null) {
                arrayList.add(sportBasicReportConvertEntityToReport);
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<SportReportEntity> getDeletedSportReport(int limit) {
        return getSportReportDao().getDeletedReportList(limit);
    }

    @Nullable
    public final SportBasicReport getRecentOneSport(long endTime, int zoneOffsetInSec) {
        try {
            SportReportEntity recentOneData = getSportReportDao().getRecentOneData(endTime);
            if (recentOneData == null) {
                return null;
            }
            return convertEntityToReport(recentOneData, Integer.valueOf(zoneOffsetInSec));
        } catch (Exception e) {
            Logger.i("getRecentOneSport error " + e, new Object[0]);
            return null;
        }
    }

    @NotNull
    public final List<SportReportEntity> getSportNotUploadToServer() {
        return getSportReportDao().getNotUploadRecord();
    }

    @NotNull
    public final List<SportBasicReport> getSportReportBetween(long startTime, long endTime) {
        return getSportReport$default(this, startTime, endTime, null, null, 12, null);
    }

    @NotNull
    public final List<SportBasicReport> getSportReportByCategory(@NotNull String category, long startTime, long endTime) {
        Intrinsics.checkNotNullParameter(category, "category");
        return getSportReport(startTime, endTime, null, category);
    }

    @NotNull
    public final List<SportBasicReport> getSportReportByKey(int sportType, long startTime, long endTime) {
        SportReportKey sportReportKey = FitnessPersistKey.INSTANCE.getSportReportKey(sportType);
        if (sportReportKey != null) {
            return getSportReport$default(this, startTime, endTime, sportReportKey.getKey(), null, 8, null);
        }
        FitnessLogUtils.w(TAG, sportType + " no sport key");
        return new ArrayList();
    }

    @Nullable
    public final SportBasicReport getTheSportReport(@NotNull String sid, int sportType, long time) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        SportReportKey sportReportKey = FitnessPersistKey.INSTANCE.getSportReportKey(sportType);
        if (sportReportKey != null) {
            SportReportEntity specialSportReport = getSportReportDao().getSpecialSportReport(sid, sportReportKey.getKey(), time);
            if (specialSportReport == null) {
                return null;
            }
            return convertEntityToReport$default(this, specialSportReport, null, 2, null);
        }
        FitnessLogUtils.w(TAG, "sportType = " + sportType + ", not support key");
        return null;
    }

    public final void hardDeleteSportReport(@NotNull List<SportReportEntity> entityList) {
        Intrinsics.checkNotNullParameter(entityList, "entityList");
        if (entityList.isEmpty()) {
            FitnessLogUtils.i(TAG, "hardDeleteSportReport: no report");
            return;
        }
        SportReportDao sportReportDao = getSportReportDao();
        SportReportEntity[] sportReportEntityArr = (SportReportEntity[]) entityList.toArray(new SportReportEntity[0]);
        sportReportDao.deleteAll((SportReportEntity[]) Arrays.copyOf(sportReportEntityArr, sportReportEntityArr.length));
    }

    public final void markSportReportHasUploaded(@NotNull List<SportReportEntity> entityList) {
        Intrinsics.checkNotNullParameter(entityList, "entityList");
        if (entityList.isEmpty()) {
            FitnessLogUtils.i(TAG, "markSportReportHasUploaded: no record to update");
            return;
        }
        Iterator<T> it = entityList.iterator();
        while (it.hasNext()) {
            ((SportReportEntity) it.next()).setUpload(true);
        }
        SportReportDao sportReportDao = getSportReportDao();
        SportReportEntity[] sportReportEntityArr = (SportReportEntity[]) entityList.toArray(new SportReportEntity[0]);
        sportReportDao.updateAll((SportReportEntity[]) Arrays.copyOf(sportReportEntityArr, sportReportEntityArr.length));
    }

    @NotNull
    public final Flow<Integer> observerRecentCount(long startTime) {
        return getSportReportDao().observerRecentCount(startTime + ((long) FitnessDateUtils.getCurrentTZOffsetInSec()));
    }

    public final void recordServerSportReportToDB(@NotNull List<SportReportModel> sportList) {
        boolean zBooleanValue;
        Intrinsics.checkNotNullParameter(sportList, "sportList");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (SportReportModel sportReportModel : sportList) {
            if (sportReportModel.getTime() > 0 && !TextUtils.isEmpty(sportReportModel.getSid()) && !TextUtils.isEmpty(sportReportModel.getKey())) {
                SportReportEntity sportReportEntity = new SportReportEntity(sportReportModel.getSid(), sportReportModel.getKey(), sportReportModel.getTime());
                int iIntValue = 0;
                if (sportReportModel.getIsDeleted() == null) {
                    zBooleanValue = false;
                } else {
                    Boolean isDeleted = sportReportModel.getIsDeleted();
                    Intrinsics.checkNotNull(isDeleted);
                    zBooleanValue = isDeleted.booleanValue();
                }
                if (zBooleanValue) {
                    arrayList2.add(sportReportEntity);
                } else {
                    String category = sportReportModel.getCategory();
                    Intrinsics.checkNotNull(category);
                    sportReportEntity.setCategory(category);
                    if (sportReportModel.getZoneOffsetInSec() != null) {
                        Integer zoneOffsetInSec = sportReportModel.getZoneOffsetInSec();
                        Intrinsics.checkNotNull(zoneOffsetInSec);
                        iIntValue = zoneOffsetInSec.intValue();
                    }
                    sportReportEntity.setZoneOffsetInSec(iIntValue);
                    sportReportEntity.setZoneName(sportReportModel.getZoneName());
                    String value = sportReportModel.getValue();
                    Intrinsics.checkNotNull(value);
                    sportReportEntity.setValue(value);
                    sportReportEntity.setTimeIn0Tz(sportReportEntity.getTime() + ((long) sportReportEntity.getZoneOffsetInSec()));
                    sportReportEntity.setUpload(true);
                    sportReportEntity.setDeleted(zBooleanValue);
                    arrayList.add(sportReportEntity);
                }
            }
        }
        insertSportReportToDb(arrayList);
        hardDeleteSportReport(arrayList2);
    }

    public final boolean recordSportReportToDB(@NotNull SportDBKey sportKey, @NotNull String value) {
        Intrinsics.checkNotNullParameter(sportKey, "sportKey");
        Intrinsics.checkNotNullParameter(value, "value");
        SportReportEntity sportReportEntity = new SportReportEntity(sportKey.getSid(), sportKey.getKey(), sportKey.getTime());
        sportReportEntity.setCategory(sportKey.getCategory());
        sportReportEntity.setZoneOffsetInSec(sportKey.getZoneOffsetInSec());
        sportReportEntity.setZoneName(FitnessPersistUtils.INSTANCE.getZoneName(sportKey.getZoneOffsetInSec()));
        sportReportEntity.setValue(value);
        sportReportEntity.setTimeIn0Tz(sportReportEntity.getTime() + ((long) sportReportEntity.getZoneOffsetInSec()));
        sportReportEntity.setUpload(false);
        sportReportEntity.setDeleted(false);
        FitnessLogUtils.i(TAG, "recordSportReportToDB: (" + sportKey + ")");
        List<SportReportEntity> listSingletonList = Collections.singletonList(sportReportEntity);
        Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
        insertSportReportToDb(listSingletonList);
        TrainingPlanCurDateDaoUtils.INSTANCE.notifyInsertSportReport(sportReportEntity);
        return true;
    }

    public final boolean softDeleteSportReport(@NotNull List<SportDBKey> reportList) {
        Intrinsics.checkNotNullParameter(reportList, "reportList");
        ArrayList arrayList = new ArrayList();
        for (SportDBKey sportDBKey : reportList) {
            SportReportEntity specialSportReport = getSportReportDao().getSpecialSportReport(sportDBKey.getSid(), sportDBKey.getKey(), sportDBKey.getTime());
            if (specialSportReport != null) {
                specialSportReport.setOfflineCounted(false);
                specialSportReport.setDeleted(true);
                arrayList.add(specialSportReport);
            }
        }
        if (!(!arrayList.isEmpty())) {
            return false;
        }
        SportReportDao sportReportDao = getSportReportDao();
        SportReportEntity[] sportReportEntityArr = (SportReportEntity[]) arrayList.toArray(new SportReportEntity[0]);
        sportReportDao.updateAll((SportReportEntity[]) Arrays.copyOf(sportReportEntityArr, sportReportEntityArr.length));
        return true;
    }

    @Nullable
    public final SportBasicReport getTheSportReport(@NotNull String sid, @NotNull String key, long time) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(key, "key");
        SportReportEntity specialSportReport = getSportReportDao().getSpecialSportReport(sid, key, time);
        if (specialSportReport == null || specialSportReport.getIsDeleted()) {
            return null;
        }
        return convertEntityToReport$default(this, specialSportReport, null, 2, null);
    }

    @Nullable
    public final SportBasicReport convertEntityToReport(@NotNull SportReportEntity entity, @Nullable Integer curTzInSec) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        SportBasicReport sportBasicReport = (SportBasicReport) FitnessPersistUtils.INSTANCE.fromJson(entity.getValue(), SportBasicReport.class);
        if (sportBasicReport == null) {
            return null;
        }
        sportBasicReport.setSid(entity.getSid());
        sportBasicReport.setDbKeyTime(Long.valueOf(entity.getTime()));
        sportBasicReport.setEntityStartTime(Long.valueOf(sportBasicReport.getStartTime()));
        sportBasicReport.setEntityEndTime(Long.valueOf(sportBasicReport.getEndTime()));
        sportBasicReport.setEntityOffsetTime(Integer.valueOf(entity.getZoneOffsetInSec()));
        if (curTzInSec != null) {
            long zoneOffsetInSec = entity.getZoneOffsetInSec() - curTzInSec.intValue();
            sportBasicReport.setStartTime(sportBasicReport.getStartTime() + zoneOffsetInSec);
            sportBasicReport.setEndTime(sportBasicReport.getEndTime() + zoneOffsetInSec);
        }
        return sportBasicReport;
    }
}
