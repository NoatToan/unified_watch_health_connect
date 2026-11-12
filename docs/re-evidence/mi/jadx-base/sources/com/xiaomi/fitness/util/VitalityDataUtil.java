package com.xiaomi.fitness.util;

import android.util.LongSparseArray;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyVitalityReport;
import com.xiaomi.fit.fitness.export.data.item.VitalityItem;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.vitality.VitalityEntry;
import com.xiaomi.fitness.util.VitalityDataUtil;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\nJ$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/util/VitalityDataUtil;", "", "<init>", "()V", "LENGTH", "", "createEmptyList", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "localDate", "Lorg/joda/time/LocalDate;", "createVitalityOf7Days", "Lcom/xiaomi/fitness/health/vitality/VitalityEntry;", "report", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyVitalityReport;", "selectDate", "createEntryList", "", "sparseArray", "Landroid/util/LongSparseArray;", "Lcom/xiaomi/fit/fitness/export/data/item/VitalityItem;", "zeroTimeOfSelectDay", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VitalityDataUtil {

    @NotNull
    public static final VitalityDataUtil INSTANCE = new VitalityDataUtil();
    private static final int LENGTH = 7;

    private VitalityDataUtil() {
    }

    private final List<VitalityEntry> createEntryList(LongSparseArray<VitalityItem> sparseArray, long zeroTimeOfSelectDay) {
        VitalityEntry vitalityEntry;
        ArrayList arrayList = new ArrayList(7);
        for (int i = 0; i < 7; i++) {
            long j = zeroTimeOfSelectDay - (((long) i) * 86400);
            VitalityItem vitalityItem = sparseArray.get(j);
            if (vitalityItem == null) {
                vitalityEntry = new VitalityEntry(i, 0.0f, j, 4);
                vitalityEntry.setHighZoneVitality(0);
                vitalityEntry.setLowZoneVitality(0);
                vitalityEntry.setMediumZoneVitality(0);
                vitalityEntry.setTotalVitality(0);
                vitalityEntry.setDailyVitality(0);
            } else {
                int total7daysVitality = vitalityItem.getTotal7daysVitality();
                VitalityEntry vitalityEntry2 = new VitalityEntry(i, total7daysVitality, j, 4);
                vitalityEntry2.setTotalVitality(total7daysVitality);
                vitalityEntry2.setDailyVitality(vitalityItem.getDayTotalVitality());
                vitalityEntry2.setHighZoneVitality(vitalityItem.getDayHighIntensityVitality());
                vitalityEntry2.setMediumZoneVitality(vitalityItem.getDayMediumIntensityVitality());
                vitalityEntry2.setLowZoneVitality(vitalityItem.getDayLowIntensityVitality());
                Integer suggestActivityDuration = vitalityItem.getSuggestActivityDuration();
                vitalityEntry2.setSuggestVitality(suggestActivityDuration != null ? suggestActivityDuration.intValue() : 0);
                Integer suggestActivityType = vitalityItem.getSuggestActivityType();
                vitalityEntry2.setSuggestSportType(suggestActivityType != null ? suggestActivityType.intValue() : 0);
                vitalityEntry = vitalityEntry2;
            }
            arrayList.add(vitalityEntry);
        }
        CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: i1r
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return VitalityDataUtil.createEntryList$lambda$0((VitalityEntry) obj, (VitalityEntry) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int createEntryList$lambda$0(VitalityEntry o1, VitalityEntry o2) {
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
    public final List<VitalityEntry> createVitalityOf7Days(@Nullable DailyVitalityReport report, @Nullable LocalDate selectDate) {
        LongSparseArray<VitalityItem> longSparseArray = new LongSparseArray<>();
        long jMax = 0;
        if (report != null && !ArrayUtils.isEmpty(report.getVitalityItemList())) {
            List<VitalityItem> vitalityItemList = report.getVitalityItemList();
            Intrinsics.checkNotNull(vitalityItemList);
            for (VitalityItem vitalityItem : vitalityItemList) {
                longSparseArray.append(TimeDateUtil.changZeroOfTheDay(vitalityItem.getTime()), vitalityItem);
                jMax = Math.max(jMax, vitalityItem.getTime());
            }
        }
        return createEntryList(longSparseArray, selectDate == null ? TimeDateUtil.changZeroOfTheDay(TimeDateUtil.timestampToLocalDate(jMax)) : TimeDateUtil.changZeroOfTheDay(selectDate));
    }
}
