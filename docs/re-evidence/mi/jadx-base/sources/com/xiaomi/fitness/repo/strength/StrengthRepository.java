package com.xiaomi.fitness.repo.strength;

import com.xiaomi.fit.fitness.export.api.repository.IStrengthRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.BaseRepository;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0010¢\u0006\u0002\b\nJ0\u0010\u000b\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/repo/strength/StrengthRepository;", "Lcom/xiaomi/fitness/repo/BaseRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyMHStrengthReport;", "Lcom/xiaomi/fit/fitness/export/api/repository/IStrengthRepository;", "<init>", "()V", "strengthBiz", "Lcom/xiaomi/fitness/repo/strength/StrengthBiz;", "getBiz", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "getBiz$fitness_data_core_chinaProductRelease", "mergeTargetReport", "sid", "", CloudContract.COL_VIEW_TAG, "startTimestamp", "", "srcReportList", "", "getDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StrengthRepository extends BaseRepository<DailyMHStrengthReport> implements IStrengthRepository {

    @NotNull
    private final StrengthBiz strengthBiz = new StrengthBiz();

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public BaseProcessBiz<DailyMHStrengthReport> getBiz$fitness_data_core_chinaProductRelease() {
        return this.strengthBiz;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public HomeDataType getDataType() {
        return HomeDataType.MH_STRENGTH;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public /* bridge */ /* synthetic */ DailyBasicReport mergeTargetReport(String str, String str2, long j, List list) {
        return mergeTargetReport(str, str2, j, (List<DailyMHStrengthReport>) list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r8.equals("weeks") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r8.equals("months") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        r4 = new java.util.ArrayList();
        r7 = r11.iterator();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if (r7.hasNext() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        r11 = r7.next();
        r5 = r5 + r11.getDuration();
        r4.add(new com.xiaomi.fit.fitness.export.data.aggregation.record.MHStrengthRecord(r11.getTime(), r11.getDuration()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        return new com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport(r9, r8, r4, r5);
     */
    @Override // com.xiaomi.fitness.repo.BaseRepository
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport mergeTargetReport(@org.jetbrains.annotations.Nullable java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, long r9, @org.jetbrains.annotations.NotNull java.util.List<com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport> r11) {
        /*
            r6 = this;
            java.lang.String r7 = "viewTag"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r7)
            java.lang.String r7 = "srcReportList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r7)
            r7 = r11
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L19
            com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport r7 = new com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport
            r7.<init>(r9, r8)
            return r7
        L19:
            int r7 = r8.hashCode()
            r0 = -1068487181(0xffffffffc0502df3, float:-3.2528045)
            r1 = 0
            if (r7 == r0) goto L46
            r0 = 3076183(0x2ef057, float:4.31065E-39)
            if (r7 == r0) goto L37
            r0 = 113008383(0x6bc5eff, float:7.0857324E-35)
            if (r7 == r0) goto L2e
            goto L4e
        L2e:
            java.lang.String r7 = "weeks"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L54
            goto L4e
        L37:
            java.lang.String r7 = "days"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L4e
            java.lang.Object r7 = r11.get(r1)
            com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport r7 = (com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport) r7
            return r7
        L46:
            java.lang.String r7 = "months"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L54
        L4e:
            com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport r7 = new com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport
            r7.<init>(r9, r8)
            return r7
        L54:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r7 = r11.iterator()
            r5 = r1
        L5e:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L80
            java.lang.Object r11 = r7.next()
            com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport r11 = (com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport) r11
            int r0 = r11.getDuration()
            int r5 = r5 + r0
            com.xiaomi.fit.fitness.export.data.aggregation.record.MHStrengthRecord r0 = new com.xiaomi.fit.fitness.export.data.aggregation.record.MHStrengthRecord
            long r1 = r11.getTime()
            int r11 = r11.getDuration()
            r0.<init>(r1, r11)
            r4.add(r0)
            goto L5e
        L80:
            com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport r7 = new com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport
            r0 = r7
            r1 = r9
            r3 = r8
            r0.<init>(r1, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.repo.strength.StrengthRepository.mergeTargetReport(java.lang.String, java.lang.String, long, java.util.List):com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport");
    }
}
