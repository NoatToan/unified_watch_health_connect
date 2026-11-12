package com.xiaomi.fitness.repo.step;

import android.text.TextUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.repository.IStepRepository;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.ActiveStageItem;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.StepItem;
import com.xiaomi.fit.fitness.persist.db.internal.StepRecordEntity;
import com.xiaomi.fit.fitness.persist.db.utils.ItemEntityUtil;
import com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDaoProxy;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.BaseRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0010¢\u0006\u0002\b\nJ\b\u0010\u000b\u001a\u00020\fH\u0016JI\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0010¢\u0006\u0002\b\u0019J0\u0010\u001a\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00102\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0015H\u0016J\u001c\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010$\u001a\u00020\u0015H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/repo/step/StepRepository;", "Lcom/xiaomi/fitness/repo/BaseRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStepReport;", "Lcom/xiaomi/fit/fitness/export/api/repository/IStepRepository;", "<init>", "()V", "stepBiz", "Lcom/xiaomi/fitness/repo/step/StepBiz;", "getBiz", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "getBiz$fitness_data_core_chinaProductRelease", "dumpStepRecord", "", "queryDataItems", "", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "sid", CloudContract.COL_VIEW_TAG, "beginInSecond", "", "endInSecond", "zoneOffsetInSec", "", "queryDataItems$fitness_data_core_chinaProductRelease", "mergeTargetReport", "startTimestamp", "srcReportList", "getDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "queryStepRecordsSync", "Lcom/xiaomi/fit/fitness/export/data/item/StepItem;", "startTime", "endTime", "getReport", "time", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StepRepository extends BaseRepository<DailyStepReport> implements IStepRepository {

    @NotNull
    private final StepBiz stepBiz = new StepBiz();

    @Override // com.xiaomi.fit.fitness.export.api.repository.IStepRepository
    public void dumpStepRecord() {
        List<StepRecordEntity> listDumpStepRecord = getDbInstance$fitness_data_core_chinaProductRelease().stepRecordItemDao().dumpStepRecord(1000);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (StepRecordEntity stepRecordEntity : listDumpStepRecord) {
            if (TextUtils.equals(stepRecordEntity.getKey(), "steps")) {
                arrayList.add(stepRecordEntity);
            } else if (TextUtils.equals(stepRecordEntity.getKey(), FitnessPersistKey.ActiveStage)) {
                arrayList2.add(stepRecordEntity);
            }
        }
        List listConvertEntityToItemList$default = ItemEntityUtil.convertEntityToItemList$default(ItemEntityUtil.INSTANCE, arrayList, StepItem.class, null, 4, null);
        FitnessLogUtils.w(getTAG(), "dumpStepRecord: step item list >>> ");
        Iterator it = listConvertEntityToItemList$default.iterator();
        while (it.hasNext()) {
            FitnessLogUtils.i(getTAG(), String.valueOf((StepItem) it.next()));
        }
        List listConvertEntityToItemList$default2 = ItemEntityUtil.convertEntityToItemList$default(ItemEntityUtil.INSTANCE, arrayList2, ActiveStageItem.class, null, 4, null);
        FitnessLogUtils.i(getTAG(), "dumpStepRecord: active stage item list >>");
        Iterator it2 = listConvertEntityToItemList$default2.iterator();
        while (it2.hasNext()) {
            FitnessLogUtils.i(getTAG(), String.valueOf((ActiveStageItem) it2.next()));
        }
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public BaseProcessBiz<DailyStepReport> getBiz$fitness_data_core_chinaProductRelease() {
        return this.stepBiz;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public HomeDataType getDataType() {
        return HomeDataType.STEP;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public /* bridge */ /* synthetic */ DailyBasicReport mergeTargetReport(String str, String str2, long j, List list) {
        return mergeTargetReport(str, str2, j, (List<DailyStepReport>) list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r10.equals("weeks") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r10.equals("months") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        return getDbGetter().getTheDailyItems(null, r11, r13, r15, "steps");
     */
    @Override // com.xiaomi.fitness.repo.BaseRepository
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.util.List<com.xiaomi.fit.fitness.export.data.item.DailyRecordItem>> queryDataItems$fitness_data_core_chinaProductRelease(@org.jetbrains.annotations.Nullable java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10, long r11, long r13, int r15) {
        /*
            r8 = this;
            java.lang.String r0 = "viewTag"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = r10.hashCode()
            r1 = -1068487181(0xffffffffc0502df3, float:-3.2528045)
            if (r0 == r1) goto L39
            r1 = 3076183(0x2ef057, float:4.31065E-39)
            if (r0 == r1) goto L22
            r9 = 113008383(0x6bc5eff, float:7.0857324E-35)
            if (r0 == r9) goto L19
            goto L41
        L19:
            java.lang.String r9 = "weeks"
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L4b
            goto L41
        L22:
            java.lang.String r0 = "days"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L41
            com.xiaomi.fit.fitness.export.api.FitnessDataGetter r0 = r8.getDbGetter()
            com.xiaomi.fit.fitness.export.data.annotation.HomeDataType r1 = com.xiaomi.fit.fitness.export.data.annotation.HomeDataType.STEP
            r2 = r9
            r3 = r11
            r5 = r13
            r7 = r15
            java.util.Map r9 = r0.getAllDailyRecord(r1, r2, r3, r5, r7)
            return r9
        L39:
            java.lang.String r9 = "months"
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L4b
        L41:
            java.util.Map r9 = java.util.Collections.emptyMap()
            java.lang.String r10 = "emptyMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)
            return r9
        L4b:
            com.xiaomi.fit.fitness.export.api.FitnessDataGetter r0 = r8.getDbGetter()
            java.lang.String r9 = "steps"
            java.lang.String[] r7 = new java.lang.String[]{r9}
            r1 = 0
            r2 = r11
            r4 = r13
            r6 = r15
            java.util.Map r9 = r0.getTheDailyItems(r1, r2, r4, r6, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.repo.step.StepRepository.queryDataItems$fitness_data_core_chinaProductRelease(java.lang.String, java.lang.String, long, long, int):java.util.Map");
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IStepRepository
    @NotNull
    public List<StepItem> queryStepRecordsSync(long startTime, long endTime) {
        Map<String, List<DailyRecordItem>> allDailyRecord = getDbGetter().getAllDailyRecord(HomeDataType.STEP, null, startTime, endTime, FitnessDateUtils.getCurrentTZOffsetInSec());
        ArrayList arrayList = new ArrayList();
        List<DailyRecordItem> list = allDailyRecord.get("steps");
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository, com.xiaomi.fit.fitness.export.api.repository.IRepository
    @Nullable
    public DailyStepReport getReport(@Nullable String sid, long time) {
        return (DailyStepReport) FitnessDailyReportDaoProxy.INSTANCE.queryDailyReportEntitySync(getDataType(), time);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r18.equals("weeks") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r18.equals("months") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        r7 = new java.util.ArrayList();
        r0 = r21.iterator();
        r4 = 0;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r0.hasNext() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        r8 = r0.next();
        r4 = r4 + r8.getSteps();
        r5 = r5 + r8.getDistance();
        r6 = r6 + r8.getCalories();
        r7.add(new com.xiaomi.fit.fitness.export.data.aggregation.record.StepRecord(r8.getTime(), r8.getSteps(), r8.getDistance(), r8.getCalories()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
    
        return new com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport(r19, r18, r4, r5, r6, r7);
     */
    @Override // com.xiaomi.fitness.repo.BaseRepository
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport mergeTargetReport(@org.jetbrains.annotations.Nullable java.lang.String r17, @org.jetbrains.annotations.NotNull java.lang.String r18, long r19, @org.jetbrains.annotations.NotNull java.util.List<com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport> r21) {
        /*
            r16 = this;
            r3 = r18
            r1 = r19
            r0 = r21
            java.lang.String r4 = "viewTag"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            java.lang.String r4 = "srcReportList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L1f
            com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport r0 = new com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport
            r0.<init>(r1, r3)
            return r0
        L1f:
            int r4 = r18.hashCode()
            r5 = -1068487181(0xffffffffc0502df3, float:-3.2528045)
            r6 = 0
            if (r4 == r5) goto L4c
            r5 = 3076183(0x2ef057, float:4.31065E-39)
            if (r4 == r5) goto L3d
            r5 = 113008383(0x6bc5eff, float:7.0857324E-35)
            if (r4 == r5) goto L34
            goto L54
        L34:
            java.lang.String r4 = "weeks"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L5a
            goto L54
        L3d:
            java.lang.String r4 = "days"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L54
            java.lang.Object r0 = r0.get(r6)
            com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport r0 = (com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport) r0
            return r0
        L4c:
            java.lang.String r4 = "months"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L5a
        L54:
            com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport r0 = new com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport
            r0.<init>(r1, r3)
            return r0
        L5a:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r0 = r21.iterator()
            r4 = r6
            r5 = r4
        L65:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L9a
            java.lang.Object r8 = r0.next()
            com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport r8 = (com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport) r8
            int r9 = r8.getSteps()
            int r4 = r4 + r9
            int r9 = r8.getDistance()
            int r5 = r5 + r9
            int r9 = r8.getCalories()
            int r6 = r6 + r9
            com.xiaomi.fit.fitness.export.data.aggregation.record.StepRecord r15 = new com.xiaomi.fit.fitness.export.data.aggregation.record.StepRecord
            long r10 = r8.getTime()
            int r12 = r8.getSteps()
            int r13 = r8.getDistance()
            int r14 = r8.getCalories()
            r9 = r15
            r9.<init>(r10, r12, r13, r14)
            r7.add(r15)
            goto L65
        L9a:
            com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport r8 = new com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport
            r0 = r8
            r1 = r19
            r3 = r18
            r0.<init>(r1, r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.repo.step.StepRepository.mergeTargetReport(java.lang.String, java.lang.String, long, java.util.List):com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport");
    }
}
