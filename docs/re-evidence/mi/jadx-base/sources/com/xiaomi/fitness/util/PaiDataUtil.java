package com.xiaomi.fitness.util;

import android.util.LongSparseArray;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyPaiReport;
import com.xiaomi.fit.fitness.export.data.item.OneDayPaiReport;
import com.xiaomi.fit.fitness.sync.export.api.PaiDataInterface;
import com.xiaomi.fit.fitness.sync.export.di.PaiDataExtKt;
import com.xiaomi.fitness.chart.entrys.PaiEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.util.PaiDataUtil;
import com.xiaomi.hm.health.bt.sdk.pai.PaiGoalData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\fJ\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/util/PaiDataUtil;", "", "<init>", "()V", "LENGTH", "", "getPaiGoal", "Lcom/xiaomi/hm/health/bt/sdk/pai/PaiGoalData;", "createEmptyList", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "localDate", "Lorg/joda/time/LocalDate;", "createPaiOf7Days", "Lcom/xiaomi/fitness/chart/entrys/PaiEntry;", "report", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyPaiReport;", "selectDate", "createEntryList", "", "sparseArray", "Landroid/util/LongSparseArray;", "Lcom/xiaomi/fit/fitness/export/data/item/OneDayPaiReport;", "zeroTimeOfSelectDay", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PaiDataUtil {

    @NotNull
    public static final PaiDataUtil INSTANCE = new PaiDataUtil();
    private static final int LENGTH = 7;

    private PaiDataUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int createEntryList$lambda$0(PaiEntry o1, PaiEntry o2) {
        Intrinsics.checkNotNullParameter(o1, "o1");
        Intrinsics.checkNotNullParameter(o2, "o2");
        return (int) (o2.timestamp - o1.timestamp);
    }

    @NotNull
    public final List<RecyclerBarEntry> createEmptyList(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        ArrayList arrayList = new ArrayList();
        LocalDate localDatePlusDays = localDate.plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        for (int i = 0; i < 7; i++) {
            jChangZeroOfTheDay -= 86400;
            RecyclerBarEntry recyclerBarEntry = new RecyclerBarEntry(i, 0.0f, jChangZeroOfTheDay, 3);
            recyclerBarEntry.localDate = localDate;
            arrayList.add(recyclerBarEntry);
        }
        return arrayList;
    }

    @NotNull
    public final List<PaiEntry> createEntryList(@NotNull LongSparseArray<OneDayPaiReport> sparseArray, long zeroTimeOfSelectDay) {
        PaiEntry paiEntry;
        Intrinsics.checkNotNullParameter(sparseArray, "sparseArray");
        ArrayList arrayList = new ArrayList(7);
        for (int i = 0; i < 7; i++) {
            long j = zeroTimeOfSelectDay - (((long) i) * 86400);
            OneDayPaiReport oneDayPaiReport = sparseArray.get(j);
            if (oneDayPaiReport == null) {
                paiEntry = new PaiEntry(i, 0.0f, j, 4);
                paiEntry.c = 0.0f;
                paiEntry.e = 0.0f;
                paiEntry.d = 0.0f;
                paiEntry.f11759b = 0.0f;
                paiEntry.f11758a = 0.0f;
            } else {
                float totalPai = oneDayPaiReport.getTotalPai();
                PaiEntry paiEntry2 = new PaiEntry(i, totalPai, j, 4);
                paiEntry2.f11759b = totalPai;
                paiEntry2.f11758a = oneDayPaiReport.getPai();
                paiEntry = paiEntry2;
            }
            arrayList.add(paiEntry);
        }
        CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: nih
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return PaiDataUtil.createEntryList$lambda$0((PaiEntry) obj, (PaiEntry) obj2);
            }
        });
        return arrayList;
    }

    @NotNull
    public final List<PaiEntry> createPaiOf7Days(@Nullable DailyPaiReport report, @Nullable LocalDate selectDate) {
        LongSparseArray<OneDayPaiReport> longSparseArray = new LongSparseArray<>();
        long jMax = 0;
        if (report != null && !ArrayUtils.isEmpty(report.getPaiList())) {
            List<OneDayPaiReport> paiList = report.getPaiList();
            Intrinsics.checkNotNull(paiList);
            for (OneDayPaiReport oneDayPaiReport : paiList) {
                longSparseArray.append(TimeDateUtil.changZeroOfTheDay(oneDayPaiReport.getTime()), oneDayPaiReport);
                jMax = Math.max(jMax, oneDayPaiReport.getTime());
            }
        }
        return createEntryList(longSparseArray, selectDate == null ? TimeDateUtil.changZeroOfTheDay(TimeDateUtil.timestampToLocalDate(jMax)) : TimeDateUtil.changZeroOfTheDay(selectDate));
    }

    @NotNull
    public final PaiGoalData getPaiGoal() {
        PaiDataInterface paiDataExtKt = PaiDataExtKt.getInstance(PaiDataInterface.INSTANCE);
        int paiSuggestHr = paiDataExtKt.getPaiSuggestHr();
        int paiSuggestTime = paiDataExtKt.getPaiSuggestTime();
        int paiTargetDisparity = paiDataExtKt.getPaiTargetDisparity();
        Logger.i("MiHealth", "getPaiGoal targetDisparity:" + paiTargetDisparity + "-paiSuggestTime:" + paiSuggestTime + "-paiSuggestHr:" + paiSuggestHr);
        return new PaiGoalData(paiTargetDisparity, paiSuggestHr, paiSuggestTime);
    }
}
