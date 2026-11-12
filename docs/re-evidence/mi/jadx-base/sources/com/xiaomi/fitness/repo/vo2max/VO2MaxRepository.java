package com.xiaomi.fitness.repo.vo2max;

import com.xiaomi.fit.fitness.export.api.repository.IVO2MaxRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyVo2MaxReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.BaseRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0010¢\u0006\u0002\b\nJ0\u0010\u000b\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/repo/vo2max/VO2MaxRepository;", "Lcom/xiaomi/fitness/repo/BaseRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyVo2MaxReport;", "Lcom/xiaomi/fit/fitness/export/api/repository/IVO2MaxRepository;", "<init>", "()V", "biz", "Lcom/xiaomi/fitness/repo/vo2max/VO2MaxBiz;", "getBiz", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "getBiz$fitness_data_core_chinaProductRelease", "mergeTargetReport", "sid", "", CloudContract.COL_VIEW_TAG, "startTimestamp", "", "srcReportList", "", "getDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VO2MaxRepository extends BaseRepository<DailyVo2MaxReport> implements IVO2MaxRepository {

    @NotNull
    private final VO2MaxBiz biz = new VO2MaxBiz();

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mergeTargetReport$lambda$0(DailyVo2MaxReport it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getMaxVo2Max();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mergeTargetReport$lambda$1(DailyVo2MaxReport it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getMinVo2Max();
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public BaseProcessBiz<DailyVo2MaxReport> getBiz$fitness_data_core_chinaProductRelease() {
        return this.biz;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public HomeDataType getDataType() {
        return HomeDataType.V02_MAX;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public /* bridge */ /* synthetic */ DailyBasicReport mergeTargetReport(String str, String str2, long j, List list) {
        return mergeTargetReport(str, str2, j, (List<DailyVo2MaxReport>) list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r19.equals("weeks") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r19.equals("months") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        r4 = (java.lang.Integer) com.xiaomi.fitness.common.extensions.ListExtKt.maxOfOrDefault(r22, 0, new defpackage.vmq());
        r5 = (java.lang.Integer) com.xiaomi.fitness.common.extensions.ListExtKt.minOfOrDefault(r22, 0, new defpackage.wmq());
        r7 = new java.util.ArrayList();
        r3 = r22.iterator();
        r8 = Long.MIN_VALUE;
        r10 = null;
        r11 = 0;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        if (r3.hasNext() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
    
        r13 = r3.next();
        r12 = r12 + r13.getAvgVoxMax();
        r11 = r11 + 1;
        r14 = r13.getLatestItem();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
    
        if (r14 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        r16 = r7;
        r16.add(new com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt(r13.getTime(), new int[]{r14.getVo2Max()}));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        if (r8 >= r14.getTime()) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bf, code lost:
    
        r8 = r14.getTime();
        r10 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        r7 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c8, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c9, code lost:
    
        if (r11 <= 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cb, code lost:
    
        r3 = r12 / r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ce, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cf, code lost:
    
        r7 = new com.xiaomi.fit.fitness.export.data.aggregation.DailyVo2MaxReport(r20, r19);
        kotlin.jvm.internal.Intrinsics.checkNotNull(r4);
        r7.setMaxVo2Max(r4.intValue());
        kotlin.jvm.internal.Intrinsics.checkNotNull(r5);
        r7.setMinVo2Max(r5.intValue());
        r7.setAvgVoxMax(r3);
        r7.setVo2MaxList(r6);
        r7.setLatestItem(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f1, code lost:
    
        return r7;
     */
    @Override // com.xiaomi.fitness.repo.BaseRepository
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xiaomi.fit.fitness.export.data.aggregation.DailyVo2MaxReport mergeTargetReport(@org.jetbrains.annotations.Nullable java.lang.String r18, @org.jetbrains.annotations.NotNull java.lang.String r19, long r20, @org.jetbrains.annotations.NotNull java.util.List<com.xiaomi.fit.fitness.export.data.aggregation.DailyVo2MaxReport> r22) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.repo.vo2max.VO2MaxRepository.mergeTargetReport(java.lang.String, java.lang.String, long, java.util.List):com.xiaomi.fit.fitness.export.data.aggregation.DailyVo2MaxReport");
    }
}
