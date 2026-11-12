package com.xiaomi.fitness.repo.hearing;

import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.api.repository.IHearingRepository;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHearingReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.HeadsetItem;
import com.xiaomi.fit.fitness.export.data.item.NoiseItem;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.BaseRepository;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016J\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0010¢\u0006\u0002\b\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f2\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/repo/hearing/HearingRepository;", "Lcom/xiaomi/fitness/repo/BaseRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHearingReport;", "Lcom/xiaomi/fit/fitness/export/api/repository/IHearingRepository;", "<init>", "()V", "biz", "Lcom/xiaomi/fitness/repo/hearing/HearingBiz;", "mergeTargetReport", "sid", "", CloudContract.COL_VIEW_TAG, "startTimestamp", "", "srcReportList", "", "getBiz", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "getBiz$fitness_data_core_chinaProductRelease", "getDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "getNoiseItemList", "Lcom/xiaomi/fit/fitness/export/data/item/NoiseItem;", "timestamp", "doRecordAdd", "", "record", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHearingRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HearingRepository.kt\ncom/xiaomi/fitness/repo/hearing/HearingRepository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,99:1\n1#2:100\n1863#3,2:101\n*S KotlinDebug\n*F\n+ 1 HearingRepository.kt\ncom/xiaomi/fitness/repo/hearing/HearingRepository\n*L\n49#1:101,2\n*E\n"})
public final class HearingRepository extends BaseRepository<DailyHearingReport> implements IHearingRepository {

    @NotNull
    private final HearingBiz biz = new HearingBiz();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.repo.BaseRepository
    public void doRecordAdd(@NotNull DailyRecordItem record) {
        Intrinsics.checkNotNullParameter(record, "record");
        if (record instanceof HeadsetItem) {
            FitnessDataRecorder dbWriter = getDbWriter();
            String sid = record.getSid();
            Intrinsics.checkNotNull(sid);
            dbWriter.recordHeadset(sid, getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond(), record);
            return;
        }
        if (record instanceof NoiseItem) {
            FitnessDataRecorder dbWriter2 = getDbWriter();
            String sid2 = record.getSid();
            Intrinsics.checkNotNull(sid2);
            dbWriter2.recordHeadsetNoise(sid2, getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond(), record);
        }
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public BaseProcessBiz<DailyHearingReport> getBiz$fitness_data_core_chinaProductRelease() {
        return this.biz;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public HomeDataType getDataType() {
        return HomeDataType.HEARING_HEALTH;
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IHearingRepository
    @NotNull
    public List<NoiseItem> getNoiseItemList(long timestamp) {
        Collection collection = getDbGetter().getTheDailyItems(null, timestamp, timestamp + TimeUnit.DAYS.toSeconds(1L), FitnessDateUtils.getCurrentTZOffsetInSec(), FitnessPersistKey.Noise).get(FitnessPersistKey.Noise);
        List<NoiseItem> list = collection instanceof List ? (List) collection : null;
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public /* bridge */ /* synthetic */ DailyBasicReport mergeTargetReport(String str, String str2, long j, List list) {
        return mergeTargetReport(str, str2, j, (List<DailyHearingReport>) list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r27.equals("weeks") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r27.equals("months") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        r4 = new java.util.ArrayList();
        r5 = new java.util.ArrayList();
        r3 = r30.iterator();
        r9 = 0;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r3.hasNext() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        r13 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (r13.isEmpty() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        r6 = r6 + 1;
        r9 = r9 + ((long) r13.getTotalDuration());
        r11 = r11 + ((long) r13.getHighDuration());
        r14 = r13.getNoiseList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r14 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
    
        r5.addAll(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        r14 = r13.getTime();
        r13 = r13.getHearingDurationList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        if (r13 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
    
        r13 = r13.iterator();
        r16 = 0;
        r18 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
    
        if (r13.hasNext() == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b2, code lost:
    
        r20 = (com.xiaomi.fit.fitness.export.data.aggregation.record.TimedValuePair) r13.next();
        r16 = r16 + ((java.lang.Number) r20.getFirst()).longValue();
        r18 = r18 + ((java.lang.Number) r20.getSecond()).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d1, code lost:
    
        r7 = r16;
        r9 = r18;
        r18 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
    
        r18 = r9;
        r7 = 0;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e0, code lost:
    
        r4.add(new com.xiaomi.fit.fitness.export.data.aggregation.record.TimedValuePair(r14, java.lang.Integer.valueOf((int) r7), java.lang.Integer.valueOf((int) r9)));
        r9 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f6, code lost:
    
        if (r6 <= 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f8, code lost:
    
        r6 = r6;
        r9 = r9 / r6;
        r11 = r11 / r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fb, code lost:
    
        r3 = new com.xiaomi.fit.fitness.export.data.aggregation.DailyHearingReport(r28, r27);
        r3.setTotalDuration((int) r9);
        r3.setHighDuration((int) r11);
        r3.setNoiseList(r5);
        r3.setHearingDurationList(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010e, code lost:
    
        return r3;
     */
    @Override // com.xiaomi.fitness.repo.BaseRepository
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xiaomi.fit.fitness.export.data.aggregation.DailyHearingReport mergeTargetReport(@org.jetbrains.annotations.Nullable java.lang.String r26, @org.jetbrains.annotations.NotNull java.lang.String r27, long r28, @org.jetbrains.annotations.NotNull java.util.List<com.xiaomi.fit.fitness.export.data.aggregation.DailyHearingReport> r30) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.repo.hearing.HearingRepository.mergeTargetReport(java.lang.String, java.lang.String, long, java.util.List):com.xiaomi.fit.fitness.export.data.aggregation.DailyHearingReport");
    }
}
