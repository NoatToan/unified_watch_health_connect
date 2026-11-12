package com.xiaomi.fitness.aggregation.health.dao;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import com.google.gson.Gson;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.aggregation.db.FitnessSummaryDatabase;
import com.xiaomi.fitness.aggregation.health.dao.RainbowDaoProxy;
import com.xiaomi.fitness.aggregation.health.entity.DailyGoalReportEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015J\u001f\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017\"\u00020\u0018¢\u0006\u0002\u0010\u0019J,\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u0015J\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eJ\u0010\u0010\"\u001a\u0004\u0018\u00010\u00132\u0006\u0010#\u001a\u00020\u001eJ\u0010\u0010$\u001a\u0004\u0018\u00010\u00132\u0006\u0010#\u001a\u00020\u001eJ\u001a\u0010%\u001a\u0004\u0018\u00010\u00132\u0006\u0010&\u001a\u00020\u001e2\b\b\u0002\u0010'\u001a\u00020\u0015J\u0016\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u001b2\u0006\u0010#\u001a\u00020\u001eJ\u001a\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00182\b\b\u0002\u0010'\u001a\u00020\u0015H\u0002J\u000e\u0010+\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u001eJ\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130\u001c2\u0006\u0010-\u001a\u00020.J\u000e\u0010/\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/aggregation/health/dao/RainbowDaoProxy;", "", "<init>", "()V", "TAG", "", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson$delegate", "Lkotlin/Lazy;", "dao", "Lcom/xiaomi/fitness/aggregation/health/dao/RainbowEntityDao;", "getDao", "()Lcom/xiaomi/fitness/aggregation/health/dao/RainbowEntityDao;", "insertRainbows", "", "report", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "forceSave", "", "entities", "", "Lcom/xiaomi/fitness/aggregation/health/entity/RainbowReportEntity;", "([Lcom/xiaomi/fitness/aggregation/health/entity/RainbowReportEntity;)V", "queryRainbowListAsync", "Landroidx/lifecycle/LiveData;", "", "startTime", "", "endTime", "requestNet", "queryRainbowListTimeInZero", "queryLatestRainbowBeforeInZero", "time", "queryLatestRainbowBefore", "queryDailyGoalReport", "timeInZero", "convertTime", "queryLatestRainbowBeforeAsync", "toReport", "entity", "updateRainbowAfterUpcloud", "getRainBowNotUploadData", "limit", "", "updateRainbowFromCloud", "cloudReport", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRainbowDaoProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RainbowDaoProxy.kt\ncom/xiaomi/fitness/aggregation/health/dao/RainbowDaoProxy\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,227:1\n1863#2,2:228\n1863#2,2:230\n1863#2,2:232\n*S KotlinDebug\n*F\n+ 1 RainbowDaoProxy.kt\ncom/xiaomi/fitness/aggregation/health/dao/RainbowDaoProxy\n*L\n92#1:228,2\n173#1:230,2\n72#1:232,2\n*E\n"})
public final class RainbowDaoProxy {

    @NotNull
    private static final String TAG = "RainbowDaoProxy";

    @NotNull
    public static final RainbowDaoProxy INSTANCE = new RainbowDaoProxy();

    /* JADX INFO: renamed from: gson$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy gson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: gaj
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RainbowDaoProxy.gson_delegate$lambda$0();
        }
    });

    private RainbowDaoProxy() {
    }

    private final RainbowEntityDao getDao() {
        return FitnessSummaryDatabase.INSTANCE.getInstance().getDailyGoalReportDao();
    }

    private final Gson getGson() {
        return (Gson) gson.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson gson_delegate$lambda$0() {
        return new Gson();
    }

    public static /* synthetic */ void insertRainbows$default(RainbowDaoProxy rainbowDaoProxy, DailyGoalReport dailyGoalReport, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        rainbowDaoProxy.insertRainbows(dailyGoalReport, z);
    }

    public static /* synthetic */ DailyGoalReport queryDailyGoalReport$default(RainbowDaoProxy rainbowDaoProxy, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return rainbowDaoProxy.queryDailyGoalReport(j, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DailyGoalReport queryLatestRainbowBeforeAsync$lambda$4(DailyGoalReportEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        String value = entity.getValue();
        if (value == null || value.length() == 0) {
            return null;
        }
        return toReport$default(INSTANCE, entity, false, 2, null);
    }

    public static /* synthetic */ LiveData queryRainbowListAsync$default(RainbowDaoProxy rainbowDaoProxy, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return rainbowDaoProxy.queryRainbowListAsync(j, j2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List queryRainbowListAsync$lambda$2(long j, long j2, List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        FitnessLogUtils.i(TAG, "queryRainbowListAsync:startTime = " + j + ", endTime = " + j2 + ",list = " + list);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toReport$default(INSTANCE, (DailyGoalReportEntity) it.next(), false, 2, null));
        }
        return arrayList;
    }

    private final DailyGoalReport toReport(DailyGoalReportEntity entity, boolean convertTime) {
        DailyGoalReport dailyGoalReport = (DailyGoalReport) getGson().fromJson(entity.getValue(), DailyGoalReport.class);
        if (!convertTime) {
            Intrinsics.checkNotNull(dailyGoalReport);
            return dailyGoalReport;
        }
        long timeInZero = entity.getTimeInZero();
        dailyGoalReport.setTime(FitnessDateUtils.INSTANCE.changeToCurrentTzZeroTimeOneDay(timeInZero, 0));
        dailyGoalReport.setTimeInZero(Long.valueOf(timeInZero));
        Intrinsics.checkNotNull(dailyGoalReport);
        return dailyGoalReport;
    }

    public static /* synthetic */ DailyGoalReport toReport$default(RainbowDaoProxy rainbowDaoProxy, DailyGoalReportEntity rainbowReportEntity, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return rainbowDaoProxy.toReport(rainbowReportEntity, z);
    }

    @NotNull
    public final List<DailyGoalReport> getRainBowNotUploadData(int limit) {
        List<DailyGoalReportEntity> listQueryDailyGoalNotUploadReport = getDao().queryDailyGoalNotUploadReport(limit);
        ArrayList arrayList = new ArrayList();
        for (DailyGoalReportEntity rainbowReportEntity : listQueryDailyGoalNotUploadReport) {
            DailyGoalReport dailyGoalReport = (DailyGoalReport) INSTANCE.getGson().fromJson(rainbowReportEntity.getValue(), DailyGoalReport.class);
            dailyGoalReport.setTimeInZero(Long.valueOf(rainbowReportEntity.getTimeInZero()));
            Intrinsics.checkNotNull(dailyGoalReport);
            arrayList.add(dailyGoalReport);
        }
        return arrayList;
    }

    public final void insertRainbows(@NotNull DailyGoalReport report, boolean forceSave) {
        Intrinsics.checkNotNullParameter(report, "report");
        if (report.validate() || forceSave) {
            long timeStamp = report.getTimeStamp();
            report.setTimeInZero(Long.valueOf(timeStamp));
            String json = getGson().toJson(report, DailyGoalReport.class);
            Intrinsics.checkNotNull(json);
            DailyGoalReportEntity rainbowReportEntity = new DailyGoalReportEntity(timeStamp, json);
            getDao().insert(rainbowReportEntity);
            FitnessLogUtils.i(TAG, "insertRainbows: " + rainbowReportEntity);
        }
    }

    @Nullable
    public final DailyGoalReport queryDailyGoalReport(long timeInZero, boolean convertTime) {
        String value;
        DailyGoalReportEntity rainbowReportEntityQueryDailyGoalReport = getDao().queryDailyGoalReport(timeInZero);
        if (rainbowReportEntityQueryDailyGoalReport == null || (value = rainbowReportEntityQueryDailyGoalReport.getValue()) == null || value.length() == 0) {
            return null;
        }
        return toReport(rainbowReportEntityQueryDailyGoalReport, convertTime);
    }

    @Nullable
    public final DailyGoalReport queryLatestRainbowBefore(long time) {
        String value;
        DailyGoalReportEntity rainbowReportEntityQueryLatestDailyGoalReportBefore = getDao().queryLatestDailyGoalReportBefore(TimeZoneUtil.INSTANCE.normalizeTime(time, time).getFirst().longValue());
        if (rainbowReportEntityQueryLatestDailyGoalReportBefore == null || (value = rainbowReportEntityQueryLatestDailyGoalReportBefore.getValue()) == null || value.length() == 0) {
            return null;
        }
        return toReport$default(this, rainbowReportEntityQueryLatestDailyGoalReportBefore, false, 2, null);
    }

    @NotNull
    public final LiveData<DailyGoalReport> queryLatestRainbowBeforeAsync(long time) {
        return Transformations.map(getDao().queryLatestDailyGoalReportAsync(TimeZoneUtil.INSTANCE.normalizeTime(time, time).getFirst().longValue()), new Function1() { // from class: eaj
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RainbowDaoProxy.queryLatestRainbowBeforeAsync$lambda$4((DailyGoalReportEntity) obj);
            }
        });
    }

    @Nullable
    public final DailyGoalReport queryLatestRainbowBeforeInZero(long time) {
        String value;
        DailyGoalReportEntity rainbowReportEntityQueryLatestDailyGoalReportBefore = getDao().queryLatestDailyGoalReportBefore(time);
        if (rainbowReportEntityQueryLatestDailyGoalReportBefore == null || (value = rainbowReportEntityQueryLatestDailyGoalReportBefore.getValue()) == null || value.length() == 0) {
            return null;
        }
        return (DailyGoalReport) getGson().fromJson(rainbowReportEntityQueryLatestDailyGoalReportBefore.getValue(), DailyGoalReport.class);
    }

    @NotNull
    public final LiveData<List<DailyGoalReport>> queryRainbowListAsync(final long startTime, final long endTime, boolean requestNet) {
        Pair<Long, Long> pairNormalizeTime = TimeZoneUtil.INSTANCE.normalizeTime(startTime, endTime);
        long jLongValue = pairNormalizeTime.getFirst().longValue();
        long jLongValue2 = pairNormalizeTime.getSecond().longValue();
        FitnessLogUtils.i(TAG, "queryRainbowListAsync: startTime = " + startTime + ", endTime = " + endTime + ",real = [" + jLongValue + ", " + jLongValue2 + ")");
        if (requestNet) {
            FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE).pullAndPushRainbowData();
        }
        return Transformations.map(getDao().queryDailyGoalReportAsync(jLongValue, jLongValue2), new Function1() { // from class: faj
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RainbowDaoProxy.queryRainbowListAsync$lambda$2(startTime, endTime, (List) obj);
            }
        });
    }

    @NotNull
    public final List<DailyGoalReport> queryRainbowListTimeInZero(long startTime, long endTime) {
        List<DailyGoalReportEntity> listQueryDailyGoalReport = getDao().queryDailyGoalReport(startTime, endTime);
        FitnessLogUtils.d(TAG, "queryRainbowListTimeInZero: startTime = " + startTime + ", endTime = " + endTime + ", list = " + listQueryDailyGoalReport);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listQueryDailyGoalReport.iterator();
        while (it.hasNext()) {
            Object objFromJson = INSTANCE.getGson().fromJson(((DailyGoalReportEntity) it.next()).getValue(), (Class<Object>) DailyGoalReport.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            arrayList.add(objFromJson);
        }
        return arrayList;
    }

    public final void updateRainbowAfterUpcloud(long timeInZero) {
        getDao().updateRainBowDataAfterCloud(timeInZero);
    }

    public final boolean updateRainbowFromCloud(@NotNull DailyGoalReport cloudReport) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(cloudReport, "cloudReport");
        long time = cloudReport.getTime();
        FitnessLogUtils.i(TAG, "time:" + time);
        DailyGoalReport dailyGoalReportQueryDailyGoalReport$default = queryDailyGoalReport$default(this, time, false, 2, null);
        boolean z = false;
        if (dailyGoalReportQueryDailyGoalReport$default == null || !dailyGoalReportQueryDailyGoalReport$default.validate()) {
            FitnessLogUtils.i(TAG, "updateRainbowFromCloud: oldReport is null or invalidate");
            return false;
        }
        FitnessLogUtils.d(TAG, "updateRainbowFromCloud: dbReport = " + dailyGoalReportQueryDailyGoalReport$default);
        Map<Integer, Pair<Integer, Integer>> itemTypeGoalAndValue = dailyGoalReportQueryDailyGoalReport$default.getItemTypeGoalAndValue();
        Map<Integer, Pair<Integer, Integer>> itemTypeGoalAndValue2 = cloudReport.getItemTypeGoalAndValue();
        for (Map.Entry<Integer, Pair<Integer, Integer>> entry : itemTypeGoalAndValue.entrySet()) {
            int iIntValue2 = entry.getKey().intValue();
            Pair<Integer, Integer> value = entry.getValue();
            if (itemTypeGoalAndValue2.containsKey(Integer.valueOf(iIntValue2))) {
                Pair<Integer, Integer> pair = itemTypeGoalAndValue2.get(Integer.valueOf(iIntValue2));
                Intrinsics.checkNotNull(pair);
                Pair<Integer, Integer> pair2 = pair;
                int iIntValue3 = pair2.getFirst().intValue();
                int iIntValue4 = pair2.getSecond().intValue();
                int iIntValue5 = value.getSecond().intValue();
                if (iIntValue5 > iIntValue4) {
                    cloudReport.updateItem(iIntValue2, iIntValue5, Integer.valueOf(iIntValue3));
                    z = true;
                }
            }
        }
        Map<Integer, Integer> itemTypeAndGoal = dailyGoalReportQueryDailyGoalReport$default.getItemTypeAndGoal();
        Map<Integer, Integer> itemTypeAndGoal2 = cloudReport.getItemTypeAndGoal();
        Iterator<Map.Entry<Integer, Integer>> it = itemTypeAndGoal2.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                iIntValue = -1;
                break;
            }
            iIntValue = it.next().getKey().intValue();
        } while (itemTypeAndGoal.containsKey(Integer.valueOf(iIntValue)));
        Iterator<Map.Entry<Integer, Integer>> it2 = itemTypeAndGoal.entrySet().iterator();
        while (it2.hasNext()) {
            int iIntValue6 = it2.next().getKey().intValue();
            if (!itemTypeAndGoal2.containsKey(Integer.valueOf(iIntValue6))) {
                if (iIntValue6 <= 0 || iIntValue <= 0) {
                    break;
                    break;
                }
                z = true;
                break;
            }
        }
        FitnessLogUtils.i(TAG, "updateRainbowFromCloud: update = " + z);
        return z;
    }

    public final void insertRainbows(@NotNull DailyGoalReportEntity... entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        getDao().insert((DailyGoalReportEntity[]) Arrays.copyOf(entities, entities.length));
    }
}
