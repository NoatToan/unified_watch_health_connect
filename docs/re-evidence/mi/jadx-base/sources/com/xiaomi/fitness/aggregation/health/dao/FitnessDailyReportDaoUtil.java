package com.xiaomi.fitness.aggregation.health.dao;

import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fitness.aggregation.db.FitnessSummaryDatabase;
import com.xiaomi.fitness.aggregation.health.dao.convert.ReportConvertor;
import com.xiaomi.fitness.aggregation.health.entity.FitnessDailyReportEntity;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012J%\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/aggregation/health/dao/FitnessDailyReportDaoUtil;", "", "<init>", "()V", "dao", "Lcom/xiaomi/fitness/aggregation/health/dao/FitnessDailyReportDao;", "getDao", "()Lcom/xiaomi/fitness/aggregation/health/dao/FitnessDailyReportDao;", "queryDailyReportListNotUpload", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "limit", "", "toReport", "dataType", "entity", "Lcom/xiaomi/fitness/aggregation/health/entity/FitnessDailyReportEntity;", "update", "", "timestamp", "", "updateTime", "(Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;JLjava/lang/Long;)V", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FitnessDailyReportDaoUtil {

    @NotNull
    public static final FitnessDailyReportDaoUtil INSTANCE = new FitnessDailyReportDaoUtil();

    private FitnessDailyReportDaoUtil() {
    }

    private final FitnessDailyReportDao getDao() {
        return FitnessSummaryDatabase.INSTANCE.getInstance().getFitnessDailyReportDao();
    }

    @NotNull
    public final Map<HomeDataType, List<DailyBasicReport>> queryDailyReportListNotUpload(int limit) {
        List<FitnessDailyReportEntity> listQueryDailyReportEntityListNotUpload = getDao().queryDailyReportEntityListNotUpload(limit, TimeZoneUtil.INSTANCE.normalizeTime(TimeDateUtil.changZeroOfTheDay(System.currentTimeMillis() / ((long) 1000)) - TimeUnit.DAYS.toSeconds(90L)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (FitnessDailyReportEntity fitnessDailyReportEntity : listQueryDailyReportEntityListNotUpload) {
            List arrayList = (List) linkedHashMap.get(fitnessDailyReportEntity.getDataType());
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(fitnessDailyReportEntity.getDataType(), arrayList);
            }
            ListExtKt.add(arrayList, fitnessDailyReportEntity);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            HomeDataType homeDataType = (HomeDataType) entry.getKey();
            for (FitnessDailyReportEntity fitnessDailyReportEntity2 : (List) entry.getValue()) {
                Object objFromJson = FitnessPersistUtils.INSTANCE.fromJson(fitnessDailyReportEntity2.getValue(), FitnessDailyUtil.INSTANCE.getReportClass(homeDataType));
                Intrinsics.checkNotNull(objFromJson, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport");
                DailyBasicReport dailyBasicReport = (DailyBasicReport) objFromJson;
                dailyBasicReport.setTimeInZero(Long.valueOf(fitnessDailyReportEntity2.getTimeInZero()));
                dailyBasicReport.setUpdateTime(Long.valueOf(fitnessDailyReportEntity2.getUpdateTime()));
                List arrayList2 = (List) linkedHashMap2.get(homeDataType);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(homeDataType, arrayList2);
                }
                if (!dailyBasicReport.isEmpty()) {
                    ListExtKt.add(arrayList2, dailyBasicReport);
                }
            }
        }
        return linkedHashMap2;
    }

    @NotNull
    public final DailyBasicReport toReport(@NotNull HomeDataType dataType, @NotNull FitnessDailyReportEntity entity) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(entity, "entity");
        Object objFromJson = FitnessPersistUtils.INSTANCE.fromJson(entity.getValue(), FitnessDailyUtil.INSTANCE.getReportClass(dataType));
        Intrinsics.checkNotNull(objFromJson, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport");
        DailyBasicReport dailyBasicReport = (DailyBasicReport) objFromJson;
        dailyBasicReport.setTimeInZero(Long.valueOf(entity.getTimeInZero()));
        DailyBasicReport dailyBasicReportConvertReport = ReportConvertor.INSTANCE.convertReport(dataType, dailyBasicReport, entity.getTimeInZero());
        dailyBasicReportConvertReport.setSid(entity.getSid());
        return dailyBasicReportConvertReport;
    }

    public final void update(@NotNull HomeDataType dataType, long timestamp, @Nullable Long updateTime) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        if (updateTime == null) {
            getDao().update(dataType, timestamp);
        } else {
            getDao().update(dataType, timestamp, updateTime.longValue());
        }
    }
}
