package com.xiaomi.fitness.repo.hearing;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHearingReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimedValuePair;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.HeadsetItem;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J<\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0016¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/repo/hearing/HearingBiz;", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHearingReport;", "<init>", "()V", "splitDailyReport", "sid", "", CloudContract.COL_VIEW_TAG, "timestamp", "", "itemMap", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHearingBiz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HearingBiz.kt\ncom/xiaomi/fitness/repo/hearing/HearingBiz\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,70:1\n216#2,2:71\n*S KotlinDebug\n*F\n+ 1 HearingBiz.kt\ncom/xiaomi/fitness/repo/hearing/HearingBiz\n*L\n48#1:71,2\n*E\n"})
public final class HearingBiz extends BaseProcessBiz<DailyHearingReport> {
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    public /* bridge */ /* synthetic */ DailyHearingReport splitDailyReport(String str, String str2, long j, Map map) {
        return splitDailyReport(str, str2, j, (Map<String, ? extends List<? extends DailyRecordItem>>) map);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    @NotNull
    public DailyHearingReport splitDailyReport(@Nullable String sid, @NotNull String viewTag, long timestamp, @NotNull Map<String, ? extends List<? extends DailyRecordItem>> itemMap) {
        long j;
        Map mapGroupByHour$default;
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(itemMap, "itemMap");
        if (itemMap.isEmpty()) {
            return new DailyHearingReport(timestamp, viewTag);
        }
        ArrayList<HeadsetItem> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<String, ? extends List<? extends DailyRecordItem>> entry : itemMap.entrySet()) {
            String key = entry.getKey();
            List<? extends DailyRecordItem> value = entry.getValue();
            if (Objects.equals(key, "headset")) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.HeadsetItem>");
                arrayList.addAll(value);
            } else if (Objects.equals(key, FitnessPersistKey.Noise)) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.NoiseItem>");
                arrayList2.addAll(value);
            }
        }
        long duration = 0;
        long duration2 = 0;
        for (HeadsetItem headsetItem : arrayList) {
            duration2 += headsetItem.getDuration();
            if (headsetItem.getHigh()) {
                duration += headsetItem.getDuration();
            }
        }
        if (Intrinsics.areEqual(viewTag, "days")) {
            j = duration;
            mapGroupByHour$default = BaseProcessBiz.groupByHalfHour$default(this, timestamp, arrayList, null, 4, null);
        } else {
            j = duration;
            mapGroupByHour$default = Intrinsics.areEqual(viewTag, "home") ? BaseProcessBiz.groupByHour$default(this, timestamp, arrayList, null, 4, null) : null;
        }
        ArrayList arrayList3 = new ArrayList();
        if (mapGroupByHour$default != null) {
            for (Map.Entry entry2 : mapGroupByHour$default.entrySet()) {
                long jLongValue = ((Number) entry2.getKey()).longValue();
                long j2 = duration2;
                long duration3 = 0;
                long duration4 = 0;
                for (HeadsetItem headsetItem2 : (List) entry2.getValue()) {
                    duration3 += headsetItem2.getDuration();
                    if (headsetItem2.getHigh()) {
                        duration4 += headsetItem2.getDuration();
                    }
                }
                arrayList3.add(new TimedValuePair(jLongValue, Integer.valueOf((int) duration3), Integer.valueOf((int) duration4)));
                duration2 = j2;
            }
        }
        DailyHearingReport dailyHearingReport = new DailyHearingReport(timestamp, viewTag);
        dailyHearingReport.setHearingDurationList(arrayList3);
        dailyHearingReport.setNoiseList(arrayList2);
        dailyHearingReport.setHighDuration((int) j);
        dailyHearingReport.setTotalDuration((int) duration2);
        FitnessLogUtils.i(getTAG(), "DailyHearingReport: " + dailyHearingReport);
        return dailyHearingReport;
    }
}
