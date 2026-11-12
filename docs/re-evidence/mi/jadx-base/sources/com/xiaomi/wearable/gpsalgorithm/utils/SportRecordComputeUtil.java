package com.xiaomi.wearable.gpsalgorithm.utils;

import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.util.SportReportComputeUtil;
import com.xiaomi.wearable.gpsalgorithm.utils.SportRecordComputeUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J4\u0010\u000b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0002J\u0016\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0015J3\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0015J3\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0015J\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007Jc\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\"\b\b\u0000\u0010\u001a*\u00020\u001b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\"\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u001a0\u001ej\b\u0012\u0004\u0012\u0002H\u001a`\u001dH\u0002¢\u0006\u0002\u0010\u001fJ$\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010!\u001a\u00020\u0005H\u0002J&\u0010\"\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010#\u001a\u00020$2\u0006\u0010!\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/xiaomi/wearable/gpsalgorithm/utils/SportRecordComputeUtil;", "", "<init>", "()V", "MOVE_MEAN_WINDOW_LENGTH", "", "computeStepLength", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "stepList", "distanceList", "computeAvgStepLen", "startIndex", "endIndex", "computeSum", "", "list", "computeFrequency", "dataList", Constants.KEY_RECHARGE_MAXVALUE, Constants.KEY_RECHARGE_MINVALUE, "(Ljava/util/List;Ljava/lang/Float;Ljava/lang/Float;)Ljava/util/List;", "computePace", "computeSpeed", "computeSpeedByPace", "computeWithWindowSmooth", "T", "", "calAvgValue", "Lcom/xiaomi/wearable/gpsalgorithm/utils/CalAvgValue;", "Lkotlin/Function2;", "(Ljava/util/List;Ljava/lang/Float;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "moveMean", "window", "computeMean", "endTime", "", "fitness-sport-algorithm_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportRecordComputeUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordComputeUtil.kt\ncom/xiaomi/wearable/gpsalgorithm/utils/SportRecordComputeUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n1863#2,2:182\n*S KotlinDebug\n*F\n+ 1 SportRecordComputeUtil.kt\ncom/xiaomi/wearable/gpsalgorithm/utils/SportRecordComputeUtil\n*L\n52#1:182,2\n*E\n"})
public final class SportRecordComputeUtil {

    @NotNull
    public static final SportRecordComputeUtil INSTANCE = new SportRecordComputeUtil();
    private static final int MOVE_MEAN_WINDOW_LENGTH = 10;

    private SportRecordComputeUtil() {
    }

    private final int computeAvgStepLen(List<SportRecordItem> distanceList, List<SportRecordItem> stepList, int startIndex, int endIndex) {
        List<SportRecordItem> listSubList = stepList.subList(startIndex, endIndex);
        List<SportRecordItem> listSubList2 = distanceList.subList(startIndex, endIndex);
        int iComputeSum = (int) computeSum(listSubList);
        return SportReportComputeUtil.INSTANCE.computeAvgStepLengthInCM(computeSum(listSubList2), iComputeSum);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int computeFrequency$lambda$1(float f, int i) {
        return SportReportComputeUtil.INSTANCE.computeCadenceOneMinute(f, i);
    }

    private final float computeMean(List<SportRecordItem> dataList, long endTime, int window) {
        List<SportRecordItem> list = dataList;
        if (list == null || list.isEmpty()) {
            return 0.0f;
        }
        long j = endTime - ((long) window);
        long j2 = 0;
        int iIntValue = 0;
        for (SportRecordItem sportRecordItem : dataList) {
            if (sportRecordItem.getStartTime() >= j) {
                long jAbs = Math.abs(endTime - sportRecordItem.getStartTime());
                if (jAbs > j2) {
                    j2 = jAbs;
                }
                iIntValue += sportRecordItem.getValue().intValue();
            }
        }
        return (iIntValue * 1.0f) / window;
    }

    private final float computeSum(List<SportRecordItem> list) {
        Iterator<T> it = list.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += ((SportRecordItem) it.next()).getValue().floatValue();
        }
        return fFloatValue;
    }

    private final <T extends Number> List<SportRecordItem> computeWithWindowSmooth(List<SportRecordItem> dataList, Float maxValue, Float minValue, Function2<? super Float, ? super Integer, ? extends T> calAvgValue) {
        if (dataList.isEmpty()) {
            List<SportRecordItem> listEmptyList = Collections.emptyList();
            Intrinsics.checkNotNullExpressionValue(listEmptyList, "emptyList(...)");
            return listEmptyList;
        }
        List<SportRecordItem> listMoveMean = moveMean(dataList, 10);
        List<SportRecordItem> list = listMoveMean;
        if (list == null || list.isEmpty()) {
            List<SportRecordItem> listEmptyList2 = Collections.emptyList();
            Intrinsics.checkNotNullExpressionValue(listEmptyList2, "emptyList(...)");
            return listEmptyList2;
        }
        float fFloatValue = minValue != null ? minValue.floatValue() : 0.0f;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (SportRecordItem sportRecordItem : listMoveMean) {
            int i3 = i + 1;
            long startTime = sportRecordItem.getStartTime();
            long endTime = sportRecordItem.getEndTime();
            long j = endTime - startTime;
            float fFloatValue2 = sportRecordItem.getValue().floatValue();
            if (fFloatValue2 > fFloatValue) {
                i2 = i;
                fFloatValue = fFloatValue2;
            }
            arrayList.add(new SportRecordItem(startTime, endTime, calAvgValue.invoke(Float.valueOf(fFloatValue2), Integer.valueOf((int) j)), 0, 0, 24, null));
            i = i3;
        }
        if (fFloatValue < (maxValue != null ? maxValue.floatValue() : 0.0f)) {
            ((SportRecordItem) arrayList.get(i2)).setValue(maxValue != null ? maxValue : Float.valueOf(0.0f));
        }
        return arrayList;
    }

    private final List<SportRecordItem> moveMean(List<SportRecordItem> list, int window) {
        if (list.isEmpty()) {
            List<SportRecordItem> listEmptyList = Collections.emptyList();
            Intrinsics.checkNotNullExpressionValue(listEmptyList, "emptyList(...)");
            return listEmptyList;
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        while (i < size) {
            SportRecordItem sportRecordItem = list.get(i);
            i++;
            arrayList.add(new SportRecordItem(sportRecordItem.getStartTime(), sportRecordItem.getEndTime(), Float.valueOf(computeMean(list.subList(i < window ? 0 : i - window, i), sportRecordItem.getEndTime(), window)), 0, 0, 24, null));
        }
        return arrayList;
    }

    @NotNull
    public final List<SportRecordItem> computeFrequency(@NotNull List<SportRecordItem> dataList, @Nullable Float maxValue, @Nullable Float minValue) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        return computeWithWindowSmooth(dataList, maxValue, minValue, new Function2() { // from class: htn
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(SportRecordComputeUtil.computeFrequency$lambda$1(((Float) obj).floatValue(), ((Integer) obj2).intValue()));
            }
        });
    }

    @NotNull
    public final List<SportRecordItem> computePace(@NotNull List<SportRecordItem> dataList, @Nullable Float maxValue, @Nullable Float minValue) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        return computeWithWindowSmooth(dataList, maxValue, minValue, new Function2() { // from class: ftn
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(SportReportComputeUtil.computeAvgPace(((Float) obj).floatValue(), ((Integer) obj2).intValue()));
            }
        });
    }

    @NotNull
    public final List<SportRecordItem> computeSpeed(@NotNull List<SportRecordItem> dataList, @Nullable Float maxValue, @Nullable Float minValue) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        return computeWithWindowSmooth(dataList, maxValue, minValue, new Function2() { // from class: gtn
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Float.valueOf(SportReportComputeUtil.computeAvgSpeed(((Float) obj).floatValue(), ((Integer) obj2).intValue()));
            }
        });
    }

    @NotNull
    public final List<SportRecordItem> computeSpeedByPace(@NotNull List<SportRecordItem> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        ArrayList arrayList = new ArrayList();
        for (SportRecordItem sportRecordItem : dataList) {
            long startTime = sportRecordItem.getStartTime();
            long endTime = sportRecordItem.getEndTime();
            float fFloatValue = sportRecordItem.getValue().floatValue();
            float f = 0.0f;
            if (fFloatValue != 0.0f) {
                f = 3600 / fFloatValue;
            }
            arrayList.add(new SportRecordItem(startTime, endTime, Float.valueOf(f), 0, 0, 24, null));
        }
        return arrayList;
    }

    @Deprecated(message = "gps漂移，或者步数输出不规律导致步幅计算不正确，由设备自己打点")
    @Nullable
    public final List<SportRecordItem> computeStepLength(@NotNull List<SportRecordItem> stepList, @NotNull List<SportRecordItem> distanceList) {
        Intrinsics.checkNotNullParameter(stepList, "stepList");
        Intrinsics.checkNotNullParameter(distanceList, "distanceList");
        if (stepList.isEmpty() || distanceList.isEmpty()) {
            return null;
        }
        if (stepList.size() != distanceList.size()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = stepList.size();
        int i = 1;
        while (i < size) {
            int i2 = i + 1;
            int i3 = i - 9;
            if (i3 < 0) {
                i3 = 0;
            }
            arrayList.add(new SportRecordItem(stepList.get(i).getStartTime(), stepList.get(i).getEndTime(), Integer.valueOf(computeAvgStepLen(distanceList, stepList, i3, i2)), 0, 0, 24, null));
            i = i2;
        }
        return arrayList;
    }
}
