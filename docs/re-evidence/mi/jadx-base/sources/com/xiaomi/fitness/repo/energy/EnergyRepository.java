package com.xiaomi.fitness.repo.energy;

import com.xiaomi.fit.fitness.export.api.repository.IEnergyRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyEnergyReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.BaseRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0010¢\u0006\u0002\b\nJ0\u0010\u000b\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/repo/energy/EnergyRepository;", "Lcom/xiaomi/fitness/repo/BaseRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyEnergyReport;", "Lcom/xiaomi/fit/fitness/export/api/repository/IEnergyRepository;", "<init>", "()V", "biz", "Lcom/xiaomi/fitness/repo/energy/EnergyBiz;", "getBiz", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "getBiz$fitness_data_core_chinaProductRelease", "mergeTargetReport", "sid", "", CloudContract.COL_VIEW_TAG, "startTimestamp", "", "srcReportList", "", "getDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EnergyRepository extends BaseRepository<DailyEnergyReport> implements IEnergyRepository {

    @NotNull
    private final EnergyBiz biz = new EnergyBiz();

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mergeTargetReport$lambda$0(DailyEnergyReport it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getMaxEnergy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mergeTargetReport$lambda$1(DailyEnergyReport it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getMinEnergy();
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public BaseProcessBiz<DailyEnergyReport> getBiz$fitness_data_core_chinaProductRelease() {
        return this.biz;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public HomeDataType getDataType() {
        return HomeDataType.ENERGY;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public /* bridge */ /* synthetic */ DailyBasicReport mergeTargetReport(String str, String str2, long j, List list) {
        return mergeTargetReport(str, str2, j, (List<DailyEnergyReport>) list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r19.equals("weeks") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r19.equals("months") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        r5 = (java.lang.Integer) com.xiaomi.fitness.common.extensions.ListExtKt.maxOfOrDefault(r22, 0, new defpackage.za8());
        r6 = (java.lang.Integer) com.xiaomi.fitness.common.extensions.ListExtKt.minOfOrDefault(r22, 0, new defpackage.ab8());
        r11 = new java.util.ArrayList();
        r0 = r22.iterator();
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r12 = 0;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (r0.hasNext() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        r14 = r0.next();
        r12 = r12 + 1;
        r13 = r13 + r14.getAvgEnergy();
        r8 = r8 + r14.getDurationActivityEnergy();
        r9 = r9 + r14.getDurationRecoveryEnergy();
        r10 = r10 + r14.getDurationStressEnergy();
        r15 = new java.util.ArrayList();
        r15.add(java.lang.Integer.valueOf(r14.getMaxEnergy()));
        r15.add(java.lang.Integer.valueOf(r14.getMinEnergy()));
        r11.add(new com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt(r14.getTime(), kotlin.collections.CollectionsKt___CollectionsKt.toIntArray(r15)));
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e3, code lost:
    
        if (r12 <= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e5, code lost:
    
        r13 = r13 / r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e7, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e8, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r18);
        kotlin.jvm.internal.Intrinsics.checkNotNull(r5);
        r7 = r5.intValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010d, code lost:
    
        return new com.xiaomi.fit.fitness.export.data.aggregation.DailyEnergyReport(r20, r19, r18, r13, r7, r6.intValue(), r8, r9, r10, r11, kotlin.collections.CollectionsKt__CollectionsKt.emptyList());
     */
    @Override // com.xiaomi.fitness.repo.BaseRepository
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xiaomi.fit.fitness.export.data.aggregation.DailyEnergyReport mergeTargetReport(@org.jetbrains.annotations.Nullable java.lang.String r18, @org.jetbrains.annotations.NotNull java.lang.String r19, long r20, @org.jetbrains.annotations.NotNull java.util.List<com.xiaomi.fit.fitness.export.data.aggregation.DailyEnergyReport> r22) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.repo.energy.EnergyRepository.mergeTargetReport(java.lang.String, java.lang.String, long, java.util.List):com.xiaomi.fit.fitness.export.data.aggregation.DailyEnergyReport");
    }
}
