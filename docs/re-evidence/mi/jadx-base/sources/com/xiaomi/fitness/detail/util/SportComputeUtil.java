package com.xiaomi.fitness.detail.util;

import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.chart.util.SportRecordChatUtil;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sample.SamplingStrategyType;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.l9l;
import defpackage.q9l;
import defpackage.vxc;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0006\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bE\u0010FJ2\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0087@¢\u0006\u0004\b\t\u0010\nJ2\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000bH\u0087@¢\u0006\u0004\b\t\u0010\fJ,\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0087@¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0087@¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001f\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001f\u0010 JB\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030&2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0087@¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b)\u0010\u001bJO\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030&2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0005H\u0002¢\u0006\u0004\b0\u00101J3\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030&2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*H\u0002¢\u0006\u0004\b2\u00103J#\u00104\u001a\b\u0012\u0004\u0012\u00020\u00030&2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030&H\u0002¢\u0006\u0004\b4\u00105JE\u0010:\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u00106\u001a\u00020*2\u0006\u00107\u001a\u00020*2\u0006\u0010.\u001a\u00020-2\u0006\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0002¢\u0006\u0004\b:\u0010;JE\u0010<\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u00106\u001a\u00020*2\u0006\u00107\u001a\u00020*2\u0006\u0010.\u001a\u00020-2\u0006\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0002¢\u0006\u0004\b<\u0010;J#\u0010\u001f\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c2\u0006\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010=J!\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082T¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lcom/xiaomi/fitness/detail/util/SportComputeUtil;", "", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "valueList", "", "minReplaceValue", "maxReplaceValue", "", "replaceMinMaxValue", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/util/List;Ljava/lang/Float;Ljava/lang/Float;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "type", "Lcom/xiaomi/fitness/detail/util/StatisticData;", "computeMinMaxValue", "(Ljava/util/List;Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", DailyRecordKey.sportType, "", "computeAbnormalState", "(Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "validCount", "getAbnormalValid", "(Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;FI)Z", "getAbnormalTimes", "(Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;)I", "", "sportItemValue", "windowLength", "computeSlideWindowAverage", "(Ljava/util/List;Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;I)V", "key", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "report", "Lcom/xiaomi/fitness/sample/SamplingStrategyType;", "strategyType", "Ljava/util/ArrayList;", "getSamplingList", "(Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;Ljava/util/List;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Lcom/xiaomi/fitness/sample/SamplingStrategyType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCountAsSportKey", "", "sportStartTime", "sportEndTime", "Lvxc;", "samplingStrategy", "duration", "getCommonSimpleList", "(Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;Ljava/util/List;JJLvxc;I)Ljava/util/ArrayList;", "getSwimSimpleList", "(Ljava/util/List;JJ)Ljava/util/ArrayList;", "smoothSwimmingList", "(Ljava/util/ArrayList;)Ljava/util/ArrayList;", "endTime", "startTime", MediaStoreUtil.MediaInfo.SIZE, "i", "getSportLastItemValue", "(Ljava/util/List;JJLvxc;II)Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "getSportItemValue", "(Ljava/util/List;I)V", "computeBlur", "(Ljava/util/List;)Ljava/util/List;", "GOLDEN_SECTION", "F", "", "K", "D", "<init>", "()V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportComputeUtil {
    private static final float GOLDEN_SECTION = 0.618f;

    @NotNull
    public static final SportComputeUtil INSTANCE = new SportComputeUtil();
    private static final double K = 0.017453292519444445d;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportRecordKey.values().length];
            try {
                iArr[SportRecordKey.Pace.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SportRecordKey.Hr.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SportRecordKey.StepsFrequency.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SportRecordKey.StepsLength.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SportComputeUtil() {
    }

    @JvmStatic
    @Nullable
    public static final Object computeAbnormalState(@NotNull SportRecordKey sportRecordKey, @NotNull List<SportRecordItem> list, @NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(false);
    }

    @JvmStatic
    @Nullable
    public static final Object computeMinMaxValue(@NotNull List<SportRecordItem> list, @Nullable SportRecordKey sportRecordKey, @NotNull Continuation<? super StatisticData> continuation) {
        if (list.isEmpty()) {
            return null;
        }
        int size = list.size();
        SportRecordItem sportRecordItem = list.get(0);
        float f = (sportRecordKey == null || !SportRecordChatUtil.INSTANCE.chartSportPaceKey(sportRecordKey)) ? 0.0f : 30.0f;
        float f2 = 0.0f;
        float f3 = 2.14748365E9f;
        float f4 = -2.14748365E9f;
        SportRecordItem sportRecordItem2 = sportRecordItem;
        SportRecordItem sportRecordItem3 = sportRecordItem2;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            SportRecordItem sportRecordItem4 = list.get(i2);
            float fFloatValue = sportRecordItem4.getValue().floatValue();
            if (fFloatValue != 0.0f && fFloatValue < f3) {
                if (f != 0.0f) {
                    int i3 = (fFloatValue > f ? 1 : (fFloatValue == f ? 0 : -1));
                }
                sportRecordItem2 = sportRecordItem4;
                f3 = fFloatValue;
            }
            if (fFloatValue > f4) {
                sportRecordItem3 = sportRecordItem4;
                f4 = fFloatValue;
            }
            if (fFloatValue > f) {
                i++;
                f2 += fFloatValue;
            }
        }
        sportRecordItem2.setMinMaxType(-1);
        sportRecordItem3.setMinMaxType(1);
        return new StatisticData(i != 0 ? f2 / i : 0.0f, sportRecordItem2, sportRecordItem3);
    }

    public static /* synthetic */ Object computeMinMaxValue$default(List list, SportRecordKey sportRecordKey, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            sportRecordKey = null;
        }
        return computeMinMaxValue(list, sportRecordKey, continuation);
    }

    private final int getAbnormalTimes(SportRecordKey sportType) {
        int i = WhenMappings.$EnumSwitchMapping$0[sportType.ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4) ? 30 : 0;
        }
        return 100;
    }

    private final boolean getAbnormalValid(SportRecordKey sportType, float value, int validCount) {
        int i = WhenMappings.$EnumSwitchMapping$0[sportType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 || value <= 260.0f) {
                        return false;
                    }
                } else if (value <= 240.0f) {
                    return false;
                }
            } else if (value >= 30.0f || validCount <= 0) {
                return false;
            }
        } else if (value <= 0.0f || value >= 120.0f) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList<SportRecordItem> getCommonSimpleList(SportRecordKey key, List<SportRecordItem> valueList, long sportStartTime, long sportEndTime, vxc samplingStrategy, int duration) {
        int i;
        SportRecordItem sportItemValue;
        ArrayList<SportRecordItem> arrayList = new ArrayList<>();
        int size = valueList.size();
        int countAsSportKey = getCountAsSportKey(key);
        if (size < countAsSportKey) {
            int size2 = valueList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                SportRecordItem sportRecordItem = valueList.get(i2);
                sportRecordItem.setIndex(i2);
                arrayList.add(sportRecordItem);
            }
            if (size < duration + 1 && (!arrayList.isEmpty())) {
                SportRecordItem sportRecordItem2 = (SportRecordItem) CollectionsKt___CollectionsKt.last((List) arrayList);
                arrayList.add(new SportRecordItem(sportRecordItem2.getStartTime() + 1, sportRecordItem2.getEndTime() + 1, sportRecordItem2.getValue(), sportRecordItem2.getIndex() + 1, sportRecordItem2.getMinMaxType()));
            }
            return arrayList;
        }
        double d = size;
        double dCeil = Math.ceil(d / ((double) countAsSportKey));
        int i3 = (int) dCeil;
        int i4 = 0;
        for (int iCeil = (int) Math.ceil(d / dCeil); i4 < iCeil; iCeil = iCeil) {
            if (i4 == iCeil - 1) {
                i = i4;
                sportItemValue = getSportLastItemValue(valueList, sportEndTime, sportStartTime, samplingStrategy, i3, i);
            } else {
                i = i4;
                sportItemValue = getSportItemValue(valueList, sportEndTime, sportStartTime, samplingStrategy, i3, i);
            }
            arrayList.add(sportItemValue);
            if (i == 0) {
                SportRecordItem sportRecordItem3 = valueList.get(0);
                sportRecordItem3.setIndex(0);
                arrayList.add(0, sportRecordItem3);
            }
            i4 = i + 1;
        }
        if (size < duration + 1 && (!arrayList.isEmpty())) {
            SportRecordItem sportRecordItem4 = (SportRecordItem) CollectionsKt___CollectionsKt.last((List) arrayList);
            arrayList.add(new SportRecordItem(sportRecordItem4.getStartTime() + 1, sportRecordItem4.getEndTime() + 1, sportRecordItem4.getValue(), sportRecordItem4.getIndex() + 1, sportRecordItem4.getMinMaxType()));
        }
        CollectionsKt__MutableCollectionsJVMKt.sort(arrayList);
        return arrayList;
    }

    private final int getCountAsSportKey(SportRecordKey key) {
        if (key == SportRecordKey.StepsFrequency) {
            return 260;
        }
        SportRecordKey sportRecordKey = SportRecordKey.Gps;
        return 260;
    }

    public static /* synthetic */ int getCountAsSportKey$default(SportComputeUtil sportComputeUtil, SportRecordKey sportRecordKey, int i, Object obj) {
        if ((i & 1) != 0) {
            sportRecordKey = null;
        }
        return sportComputeUtil.getCountAsSportKey(sportRecordKey);
    }

    @JvmStatic
    @Nullable
    public static final Object getSamplingList(@Nullable SportRecordKey sportRecordKey, @NotNull List<SportRecordItem> list, @NotNull SportBasicReport sportBasicReport, @Nullable SamplingStrategyType samplingStrategyType, @NotNull Continuation<? super ArrayList<SportRecordItem>> continuation) {
        vxc vxcVarB = q9l.a().b(samplingStrategyType);
        if (list.isEmpty()) {
            return new ArrayList();
        }
        long startTime = sportBasicReport.getStartTime();
        long endTime = sportBasicReport.getEndTime();
        Logger.d("SportCompute startTime:" + startTime + " endTime:" + endTime, new Object[0]);
        if (vxcVarB instanceof l9l) {
            return INSTANCE.getSwimSimpleList(list, startTime, endTime);
        }
        SportComputeUtil sportComputeUtil = INSTANCE;
        Intrinsics.checkNotNull(vxcVarB);
        return sportComputeUtil.getCommonSimpleList(sportRecordKey, list, startTime, endTime, vxcVarB, sportBasicReport.getDuration());
    }

    public static /* synthetic */ Object getSamplingList$default(SportRecordKey sportRecordKey, List list, SportBasicReport sportBasicReport, SamplingStrategyType samplingStrategyType, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            sportRecordKey = null;
        }
        return getSamplingList(sportRecordKey, list, sportBasicReport, samplingStrategyType, continuation);
    }

    private final SportRecordItem getSportItemValue(List<SportRecordItem> valueList, long endTime, long startTime, vxc samplingStrategy, int size, int i) {
        int i2 = i * size;
        long j = startTime + ((long) i2);
        int size2 = (i + 1) * size;
        long j2 = startTime + ((long) size2);
        long j3 = j2 > endTime ? endTime : j2;
        if (size2 >= valueList.size()) {
            size2 = valueList.size();
        }
        int i3 = size2;
        return new SportRecordItem(j, j3, Float.valueOf(samplingStrategy.getValue(valueList, i2, i3)), i3, 0, 16, null);
    }

    private final SportRecordItem getSportLastItemValue(List<SportRecordItem> valueList, long endTime, long startTime, vxc samplingStrategy, int size, int i) {
        int i2 = i * size;
        long j = startTime + ((long) i2);
        long endTime2 = valueList.get(valueList.size() - 1).getEndTime();
        int size2 = valueList.size() - 1;
        if (size2 >= valueList.size()) {
            size2 = valueList.size();
        }
        int i3 = size2;
        return new SportRecordItem(j, endTime2, Float.valueOf(samplingStrategy.getValue(valueList, i2, i3)), i3, 0, 16, null);
    }

    private final ArrayList<SportRecordItem> getSwimSimpleList(List<SportRecordItem> valueList, long sportStartTime, long sportEndTime) {
        ArrayList<SportRecordItem> arrayList = new ArrayList<>();
        long j = sportEndTime - sportStartTime;
        int size = valueList.size();
        int endTime = 0;
        for (int i = 0; i < size; i++) {
            if (arrayList.size() == 0) {
                SportRecordItem sportRecordItem = valueList.get(0);
                SportRecordItem sportRecordItem2 = new SportRecordItem(sportRecordItem.getStartTime(), sportRecordItem.getStartTime() + 1, sportRecordItem.getValue(), 0, 0, 24, null);
                sportRecordItem2.setIndex(0);
                arrayList.add(sportRecordItem2);
                SportRecordItem sportRecordItem3 = new SportRecordItem(sportRecordItem.getEndTime() - 1, sportRecordItem.getEndTime(), sportRecordItem.getValue(), 0, 0, 24, null);
                endTime = (int) (sportRecordItem.getEndTime() - sportRecordItem.getStartTime());
                sportRecordItem3.setIndex(endTime);
                arrayList.add(sportRecordItem3);
            } else {
                SportRecordItem sportRecordItem4 = valueList.get(i);
                long endTime2 = ((SportRecordItem) CollectionsKt___CollectionsKt.last((List) arrayList)).getEndTime();
                SportRecordItem sportRecordItem5 = new SportRecordItem(endTime2, endTime2 + 1, sportRecordItem4.getValue(), 0, 0, 24, null);
                int i2 = endTime + 1;
                sportRecordItem5.setIndex(i2);
                endTime = i2 + ((int) (sportRecordItem4.getEndTime() - sportRecordItem4.getStartTime()));
                arrayList.add(sportRecordItem5);
                SportRecordItem sportRecordItem6 = new SportRecordItem(sportRecordItem4.getEndTime(), sportRecordItem4.getEndTime() + 1, sportRecordItem4.getValue(), 0, 0, 24, null);
                sportRecordItem6.setIndex(endTime);
                arrayList.add(sportRecordItem6);
            }
        }
        if (((SportRecordItem) CollectionsKt___CollectionsKt.last((List) arrayList)).getIndex() < j - 1) {
            long endTime3 = ((SportRecordItem) CollectionsKt___CollectionsKt.last((List) valueList)).getEndTime();
            SportRecordItem sportRecordItem7 = new SportRecordItem(endTime3, endTime3 + 1, 0, 0, 0, 24, null);
            sportRecordItem7.setIndex(((SportRecordItem) CollectionsKt___CollectionsKt.last((List) arrayList)).getIndex() + 1);
            arrayList.add(sportRecordItem7);
            SportRecordItem sportRecordItem8 = new SportRecordItem(sportEndTime - 1, sportEndTime, 0, 0, 0, 24, null);
            sportRecordItem8.setIndex((int) j);
            arrayList.add(sportRecordItem8);
        }
        return valueList.size() > 260 ? smoothSwimmingList(arrayList) : arrayList;
    }

    @JvmStatic
    @Nullable
    public static final Object replaceMinMaxValue(@NotNull List<SportRecordItem> list, @Nullable Integer num, @Nullable Integer num2, @NotNull Continuation<? super Unit> continuation) {
        if (list.isEmpty()) {
            return Unit.INSTANCE;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            SportRecordItem sportRecordItem = list.get(i2);
            if (sportRecordItem.getMinMaxType() == 1) {
                if (num2 != null) {
                    sportRecordItem.setValue(Boxing.boxFloat(num2.intValue()));
                    list.get(i2).setValue(Boxing.boxFloat(num2.intValue()));
                    Boxing.boxInt(i);
                    i++;
                } else {
                    sportRecordItem.setMinMaxType(0);
                }
            }
            if (i == 2) {
                break;
            }
        }
        return Unit.INSTANCE;
    }

    private final ArrayList<SportRecordItem> smoothSwimmingList(ArrayList<SportRecordItem> valueList) {
        ArrayList<SportRecordItem> arrayList = new ArrayList<>();
        int size = valueList.size();
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                arrayList.add(valueList.get(i));
            } else {
                int i2 = i - 1;
                if (!Intrinsics.areEqual(valueList.get(i), valueList.get(i2))) {
                    arrayList.add(valueList.get(i2));
                    arrayList.add(valueList.get(i));
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<SportRecordItem> computeBlur(@NotNull List<SportRecordItem> valueList) {
        Intrinsics.checkNotNullParameter(valueList, "valueList");
        if (valueList.size() < 1) {
            return valueList;
        }
        int size = valueList.size();
        for (int i = 1; i < size; i++) {
            SportRecordItem sportRecordItem = valueList.get(i - 1);
            SportRecordItem sportRecordItem2 = valueList.get(i);
            sportRecordItem2.setValue(Float.valueOf((sportRecordItem2.getValue().floatValue() * GOLDEN_SECTION) + (sportRecordItem.getValue().floatValue() * 0.38200003f)));
            valueList.set(i, sportRecordItem2);
        }
        return valueList;
    }

    public final void computeSlideWindowAverage(@NotNull List<SportRecordItem> valueList, int windowLength) {
        Intrinsics.checkNotNullParameter(valueList, "valueList");
        int size = valueList.size();
        int i = 1;
        while (i < size) {
            SportRecordItem sportRecordItem = valueList.get(i);
            computeSlideWindowAverage(i < windowLength ? valueList.subList(0, i) : valueList.subList(i - windowLength, i), sportRecordItem, windowLength);
            valueList.set(i, sportRecordItem);
            i++;
        }
    }

    private final void computeSlideWindowAverage(List<SportRecordItem> valueList, SportRecordItem sportItemValue, int windowLength) {
        if (valueList.size() == 0) {
            valueList.add(sportItemValue);
            return;
        }
        if (valueList.size() >= windowLength) {
            int size = valueList.size();
            valueList = valueList.subList(size - windowLength, size);
        }
        valueList.add(sportItemValue);
        int size2 = valueList.size();
        float fFloatValue = 0.0f;
        for (int i = 0; i < size2; i++) {
            fFloatValue += valueList.get(i).getValue().floatValue();
        }
        sportItemValue.setValue(Float.valueOf(fFloatValue / size2));
    }

    @JvmStatic
    @Nullable
    public static final Object replaceMinMaxValue(@NotNull List<SportRecordItem> list, @Nullable Float f, @Nullable Float f2, @NotNull Continuation<? super Unit> continuation) {
        if (list.isEmpty()) {
            return Unit.INSTANCE;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            SportRecordItem sportRecordItem = list.get(i2);
            if (sportRecordItem.getMinMaxType() == -1) {
                if (f != null) {
                    sportRecordItem.setValue(f);
                    list.get(i2).setValue(f);
                    Boxing.boxInt(i);
                    i++;
                } else {
                    sportRecordItem.setMinMaxType(0);
                }
            }
            if (sportRecordItem.getMinMaxType() == 1) {
                if (f2 != null) {
                    sportRecordItem.setValue(f2);
                    list.get(i2).setValue(f2);
                    Boxing.boxInt(i);
                    i++;
                } else {
                    sportRecordItem.setMinMaxType(0);
                }
            }
            if (i == 2) {
                break;
            }
        }
        return Unit.INSTANCE;
    }
}
