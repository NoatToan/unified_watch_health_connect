package com.xiaomi.fitness.util;

import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodSugarReport;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/util/BloodGlucoseHomeDataUtil;", "", "<init>", "()V", "createDayBloodGlucoseHome", "", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "basicRecord", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodSugarReport;", "roundUpToNextHour", "", "timestamp", "createDayFingerBloodGlucoseHome", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BloodGlucoseHomeDataUtil {

    @NotNull
    public static final BloodGlucoseHomeDataUtil INSTANCE = new BloodGlucoseHomeDataUtil();

    private BloodGlucoseHomeDataUtil() {
    }

    private final long roundUpToNextHour(long timestamp) {
        return (timestamp + TimeDateUtil.TIME_HOUR) - (timestamp % TimeDateUtil.TIME_HOUR);
    }

    @NotNull
    public final List<MaxMinEntry> createDayBloodGlucoseHome(@Nullable DailyBloodSugarReport basicRecord) {
        Map<Long, BloodSugarItem> bloodSugarMap;
        ArrayList arrayList = new ArrayList();
        if (basicRecord == null || (bloodSugarMap = basicRecord.getBloodSugarMap()) == null) {
            return arrayList;
        }
        BloodSugarItem latestItem = basicRecord.getLatestItem();
        long time = latestItem != null ? latestItem.getTime() : System.currentTimeMillis() / ((long) 1000);
        long jRoundUpToNextHour = roundUpToNextHour(time);
        long j = jRoundUpToNextHour - 10800;
        boolean z = false;
        for (long j2 = 0; j2 < 37; j2++) {
            if (jRoundUpToNextHour <= time && !z) {
                jRoundUpToNextHour = time - (time % ((long) 300));
                z = true;
            }
            BloodSugarItem bloodSugarItem = bloodSugarMap.get(Long.valueOf(jRoundUpToNextHour));
            MaxMinEntry maxMinEntry = new MaxMinEntry(37 - j2, (bloodSugarItem != null ? bloodSugarItem.bloodSugar() : -1.0f) < 25.0f ? bloodSugarItem != null ? bloodSugarItem.bloodSugar() : -1.0f : 25.0f, bloodSugarItem != null ? bloodSugarItem.getTime() : jRoundUpToNextHour, 3);
            maxMinEntry.timestamp = bloodSugarItem != null ? bloodSugarItem.getTime() : jRoundUpToNextHour;
            if (j2 == 36) {
                maxMinEntry.timestamp = j;
            }
            arrayList.add(maxMinEntry);
            jRoundUpToNextHour -= (long) 300;
        }
        return arrayList;
    }

    @NotNull
    public final List<RecyclerBarEntry> createDayFingerBloodGlucoseHome(@Nullable DailyBloodSugarReport basicRecord, long timestamp) {
        int[] iArr;
        ArrayList arrayList = new ArrayList();
        if (basicRecord == null) {
            return arrayList;
        }
        BloodSugarItem latestFingerItem = basicRecord.getLatestFingerItem();
        Integer numValueOf = latestFingerItem != null ? Integer.valueOf(BloodSugarItem.getTargetLevel$default(latestFingerItem, null, 1, null)) : null;
        if (numValueOf != null && numValueOf.intValue() == 4) {
            iArr = new int[]{0, 0, 0, 0, 1};
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            iArr = new int[]{0, 0, 0, 1, 0};
        } else if (numValueOf != null && numValueOf.intValue() == 3) {
            iArr = new int[]{0, 1, 0, 0, 0};
        } else if (numValueOf != null && numValueOf.intValue() == 5) {
            iArr = new int[]{1, 0, 0, 0, 0};
        } else {
            iArr = (numValueOf != null && numValueOf.intValue() == 1) ? new int[]{0, 0, 1, 0, 0} : new int[]{0, 0, 0, 0, 0};
        }
        float f = 0.0f;
        for (int i : iArr) {
            arrayList.add(new RecyclerBarEntry(f, i, timestamp, 3));
            f++;
        }
        return arrayList;
    }
}
