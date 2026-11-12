package com.xiaomi.fit.fitness.impl.internal.utils;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.data.aggregation.record.EnergyState;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.EnergyItem;
import com.xiaomi.fit.fitness.export.data.item.StressItem;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fitness.repo.RepositoryManager;
import com.xiaomi.fitness.repo.energy.EnergyDistribute;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007H\u0002J\u001a\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH\u0002J:\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\u00172\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fit/fitness/impl/internal/utils/StressComputeUtils;", "", "<init>", "()V", "TAG", "", "computeTheDayStress", "", "Lcom/xiaomi/fit/fitness/export/data/item/StressItem;", "sid", "time", "", "zoneOffsetInSec", "", "computeStressByEnergyState", "beginDayInSecond", "list", "Lcom/xiaomi/fit/fitness/export/data/item/EnergyItem;", "computeFriendlyStress", "", "energyState", "value", "groupDataByGap", "", "gap", "itemList", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStressComputeUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StressComputeUtils.kt\ncom/xiaomi/fit/fitness/impl/internal/utils/StressComputeUtils\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,119:1\n216#2:120\n216#2,2:121\n217#2:123\n*S KotlinDebug\n*F\n+ 1 StressComputeUtils.kt\ncom/xiaomi/fit/fitness/impl/internal/utils/StressComputeUtils\n*L\n46#1:120\n54#1:121,2\n46#1:123\n*E\n"})
public final class StressComputeUtils {

    @NotNull
    public static final StressComputeUtils INSTANCE = new StressComputeUtils();

    @NotNull
    private static final String TAG = "StressComputeUtils";

    private StressComputeUtils() {
    }

    private final float computeFriendlyStress(@EnergyState int energyState, int value) {
        float f;
        float f2;
        float f3;
        if (energyState != 2 && energyState != 3) {
            return 0.0f;
        }
        if (value == 0) {
            f = 25.0f;
        } else {
            float f4 = value;
            f = 25.0f - (f4 * (f4 > 0.0f ? 0.25f : 0.75f));
        }
        if (f == 25.0f) {
            return 25.0f;
        }
        if (f > 0.0f && f < 25.0f) {
            f3 = f * 0.6f;
            f2 = 10;
        } else {
            if (f <= 25.0f || f >= 100.0f) {
                return 0.0f;
            }
            f2 = 25;
            f3 = ((f - f2) * 65) / 75;
        }
        return f3 + f2;
    }

    private final List<StressItem> computeStressByEnergyState(long beginDayInSecond, List<EnergyItem> list) {
        Map<Long, List<EnergyItem>> mapGroupDataByGap = groupDataByGap(beginDayInSecond, RepositoryManager.GAP_X_MINUTE, list);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Long, List<EnergyItem>> entry : mapGroupDataByGap.entrySet()) {
            long jLongValue = entry.getKey().longValue();
            List<EnergyItem> value = entry.getValue();
            FitnessLogUtils.d(TAG, "computeStressByEnergyState time=" + jLongValue + "**length=" + value.size());
            for (Map.Entry<Integer, Integer> entry2 : EnergyDistribute.INSTANCE.calcHalfHourStateValue(value).entrySet()) {
                if (entry2.getValue().intValue() != 0) {
                    FitnessLogUtils.d(TAG, "computeStressByEnergyState: time=" + jLongValue + "**state=" + entry2.getKey() + "**value=" + entry2.getValue());
                    int iComputeFriendlyStress = (int) INSTANCE.computeFriendlyStress(entry2.getKey().intValue(), entry2.getValue().intValue());
                    StringBuilder sb = new StringBuilder();
                    sb.append("computeStressByEnergyState: time=");
                    sb.append(jLongValue);
                    sb.append("**stress=");
                    sb.append(iComputeFriendlyStress);
                    FitnessLogUtils.d(TAG, sb.toString());
                    if (iComputeFriendlyStress > 0) {
                        arrayList.add(new StressItem(entry.getKey().longValue(), iComputeFriendlyStress));
                    }
                }
            }
        }
        return arrayList;
    }

    private final Map<Long, List<EnergyItem>> groupDataByGap(long beginDayInSecond, long gap, List<EnergyItem> itemList) {
        List<EnergyItem> list = itemList;
        if (list == null || list.isEmpty()) {
            Map<Long, List<EnergyItem>> mapEmptyMap = Collections.emptyMap();
            Intrinsics.checkNotNullExpressionValue(mapEmptyMap, "emptyMap(...)");
            return mapEmptyMap;
        }
        HashMap map = new HashMap();
        for (EnergyItem energyItem : itemList) {
            long timestamp = energyItem.getTimestamp();
            if (timestamp >= beginDayInSecond) {
                long j = (((timestamp - beginDayInSecond) / gap) * gap) + beginDayInSecond;
                List arrayList = (List) map.get(Long.valueOf(j));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Long.valueOf(j), arrayList);
                }
                arrayList.add(energyItem);
            }
        }
        return map;
    }

    @NotNull
    public final List<StressItem> computeTheDayStress(@NotNull String sid, long time, int zoneOffsetInSec) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        long jChangeZeroOfTheDay = FitnessDateUtils.changeZeroOfTheDay(time, zoneOffsetInSec);
        List<EnergyItem> list = (List) DailyRecordDaoUtils.INSTANCE.getAllDailyRecord(HomeDataType.ENERGY, sid, jChangeZeroOfTheDay, jChangeZeroOfTheDay + TimeUnit.DAYS.toSeconds(1L), zoneOffsetInSec).get("energy");
        List<EnergyItem> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.EnergyItem>");
        return computeStressByEnergyState(jChangeZeroOfTheDay, list);
    }
}
