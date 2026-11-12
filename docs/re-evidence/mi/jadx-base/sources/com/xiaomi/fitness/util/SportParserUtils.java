package com.xiaomi.fitness.util;

import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.wearable.gpsalgorithm.utils.FitnessSportDistanceUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007J$\u0010\t\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J&\u0010\u0012\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/util/SportParserUtils;", "", "<init>", "()V", "computeGPSDistance", "", "startLocation", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "endLocation", "computeTheWindowMean", "list", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "endTime", "", "window", "", "moveMean", "computeMean", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportParserUtils {

    @NotNull
    public static final SportParserUtils INSTANCE = new SportParserUtils();

    private SportParserUtils() {
    }

    private final float computeMean(List<SportRecordItem> list, long endTime, int window) {
        long j = endTime - ((long) window);
        long j2 = 0;
        float fFloatValue = 0.0f;
        for (SportRecordItem sportRecordItem : list) {
            long startTime = sportRecordItem.getStartTime();
            Number value = sportRecordItem.getValue();
            if (startTime >= j) {
                long j3 = endTime - startTime;
                if (j3 > j2) {
                    j2 = j3;
                }
                fFloatValue += value.floatValue();
            }
        }
        return fFloatValue / window;
    }

    public final float computeGPSDistance(@Nullable Location startLocation, @Nullable Location endLocation) {
        if (startLocation == null || endLocation == null) {
            return 0.0f;
        }
        endLocation.startTimeStamp = startLocation.timeStamp;
        float fComputeDistance = FitnessSportDistanceUtil.computeDistance(startLocation, endLocation);
        double d = fComputeDistance;
        endLocation.distance = d;
        endLocation.total_distance = startLocation.total_distance + d;
        return fComputeDistance;
    }

    public final float computeTheWindowMean(@NotNull List<SportRecordItem> list, long endTime, int window) {
        Intrinsics.checkNotNullParameter(list, "list");
        return computeMean(list, endTime, window);
    }

    @NotNull
    public final List<SportRecordItem> moveMean(@Nullable List<SportRecordItem> list, int window) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                SportRecordItem sportRecordItem = list.get(i);
                i++;
                sportRecordItem.setValue(Float.valueOf(computeMean(list.subList(i < window ? 0 : i - window, i), sportRecordItem.getEndTime(), window)));
            }
        }
        return arrayList;
    }
}
