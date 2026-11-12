package com.xiaomi.hm.health.healthdata.utils.temperature;

import android.graphics.Color;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.RangeIndex;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.xiaomi.hm.health.healthdata.core.converter.DataTypeConverter;
import com.xiaomi.hm.health.healthdata.core.dto.BarDto;
import com.xiaomi.hm.health.healthdata.dto.TemperatureDataType;
import com.xiaomi.hm.health.healthdata.dto.TimeMode;
import com.xiaomi.hm.health.healthdata.ext.DataExKt;
import com.xiaomi.hm.health.healthdata.ui.vo.HealthChartDataVo;
import com.xiaomi.hm.health.healthdata.ui.vo.converter.DataConverterKt;
import com.xiaomi.hm.health.healthdata.ui.vo.temperature.DayTempDetailData;
import com.xiaomi.hm.health.healthdata.ui.vo.temperature.StatisticsTempDetailData;
import com.xiaomi.hm.health.healthdata.ui.vo.temperature.TempMixLineChartBuilderData;
import com.xiaomi.hm.health.healthdata.ui.vo.temperature.TempStatisticsInfo;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import com.xiaomi.hm.health.healthdata.utils.HealthDataUtils;
import com.xiaomi.hm.health.temperature.model.Temperature;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.g;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002JB\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0016\u0010\u001a\u001a\u00020\u00192\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J.\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001d0\u00042\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u001bH\u0002J\u001c\u0010 \u001a\u00020\u001f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J$\u0010%\u001a\u00020$2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u0016\u0010*\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010)R\u0016\u0010+\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010)¨\u0006."}, d2 = {"Lcom/xiaomi/hm/health/healthdata/utils/temperature/TemperatureDataHelper;", "", "Ljava/util/Date;", "startDate", "", "Lcom/xiaomi/hm/health/temperature/model/Temperature;", "rawData", "Lcom/xiaomi/hm/health/healthdata/ui/vo/temperature/TempMixLineChartBuilderData;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "chartData", "", "dividerValue", "Ljava/util/ArrayList;", "Lcom/huami/chart/data/RangeIndex;", "b", "subIndex", "interruptValue", "", "interruptSubIndexColor", "normalSubIndexColor", "", "c", "dataList", "f", "Lcom/xiaomi/hm/health/healthdata/ui/vo/temperature/TempStatisticsInfo;", "a", "", "data", "Lcom/xiaomi/hm/health/healthdata/core/dto/BarDto;", "e", "Lcom/xiaomi/hm/health/healthdata/ui/vo/temperature/DayTempDetailData;", "getDayTempDetailData", "date", "Lcom/xiaomi/hm/health/healthdata/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "Lcom/xiaomi/hm/health/healthdata/ui/vo/temperature/StatisticsTempDetailData;", "getStatisticsTempDetailData", "", "Ljava/lang/String;", "TAG", LogUtil.I, "MILLI_SECONDS_IN_MINUTE", "ALL_DAY_PIECE_DURATION", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class TemperatureDataHelper {

    @NotNull
    public static final TemperatureDataHelper INSTANCE = new TemperatureDataHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "TemperatureDataHelper";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int MILLI_SECONDS_IN_MINUTE = 60000;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int ALL_DAY_PIECE_DURATION = 300000;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeMode.values().length];
            iArr[TimeMode.WEEK.ordinal()] = 1;
            iArr[TimeMode.MONTH.ordinal()] = 2;
            iArr[TimeMode.YEAR.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TemperatureDataHelper() {
    }

    private final TempStatisticsInfo a(List<Temperature> rawData) {
        Object next;
        if (rawData.isEmpty()) {
            return new TempStatisticsInfo(0.0f, 0.0f, 0.0f, 7, null);
        }
        Iterator<T> it2 = rawData.iterator();
        Object next2 = null;
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                float temp = ((Temperature) next).getTemp();
                do {
                    Object next3 = it2.next();
                    float temp2 = ((Temperature) next3).getTemp();
                    if (Float.compare(temp, temp2) < 0) {
                        next = next3;
                        temp = temp2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        float temp3 = ((Temperature) next).getTemp();
        Iterator<T> it3 = rawData.iterator();
        if (it3.hasNext()) {
            next2 = it3.next();
            if (it3.hasNext()) {
                float temp4 = ((Temperature) next2).getTemp();
                do {
                    Object next4 = it3.next();
                    float temp5 = ((Temperature) next4).getTemp();
                    if (Float.compare(temp4, temp5) > 0) {
                        next2 = next4;
                        temp4 = temp5;
                    }
                } while (it3.hasNext());
            }
        }
        float temp6 = ((Temperature) next2).getTemp();
        double temp7 = 0.0d;
        Iterator<T> it4 = rawData.iterator();
        while (it4.hasNext()) {
            temp7 += (double) ((Temperature) it4.next()).getTemp();
        }
        return new TempStatisticsInfo(DataExKt.formatWithDecimalFloat(Float.valueOf(temp3), 1), DataExKt.formatWithDecimalFloat(Float.valueOf(temp6), 1), DataExKt.formatWithDecimalFloat(Float.valueOf((float) (temp7 / ((double) rawData.size()))), 1));
    }

    private final ArrayList<RangeIndex> b(List<HealthChartDataVo> chartData, float dividerValue) {
        int i;
        ArrayList<RangeIndex> arrayList = new ArrayList<>();
        int size = chartData.size() - 1;
        boolean z = false;
        if (size >= 0) {
            int i2 = 0;
            boolean z2 = false;
            i = 0;
            while (true) {
                int i3 = i2 + 1;
                if (Float.parseFloat(chartData.get(i2).getValue()) < dividerValue) {
                    if (!z2) {
                        i = i2;
                        z2 = true;
                    }
                } else if (z2) {
                    arrayList.add(new RangeIndex(chartData.get(i).getIndex(), chartData.get(i2 - 1).getIndex()));
                    z2 = false;
                }
                if (i3 > size) {
                    break;
                }
                i2 = i3;
            }
            z = z2;
        } else {
            i = 0;
        }
        if (z) {
            arrayList.add(new RangeIndex(chartData.get(i).getIndex(), chartData.get(chartData.size() - 1).getIndex()));
        }
        return arrayList;
    }

    private final ArrayList<int[]> c(List<HealthChartDataVo> chartData, List<? extends RangeIndex> subIndex, float interruptValue, int interruptSubIndexColor, int normalSubIndexColor) {
        boolean z;
        ArrayList<int[]> arrayList = new ArrayList<>();
        for (RangeIndex rangeIndex : subIndex) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = chartData.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                int i = rangeIndex.start;
                int i2 = rangeIndex.end;
                int index = ((HealthChartDataVo) next).getIndex();
                if (i <= index && index <= i2) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Float.valueOf(Float.parseFloat(((HealthChartDataVo) it3.next()).getValue())));
            }
            if (arrayList3.isEmpty()) {
                z = true;
                break;
            }
            Iterator it4 = arrayList3.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    z = true;
                    break;
                }
                if (!(((Number) it4.next()).floatValue() == interruptValue)) {
                    z = false;
                    break;
                }
            }
            arrayList.add(new int[]{z ? interruptSubIndexColor : normalSubIndexColor, 0});
        }
        return arrayList;
    }

    private final TempMixLineChartBuilderData d(Date startDate, List<Temperature> rawData) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = rawData.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((Temperature) next).getType() != TemperatureDataType.ALL_DAY) {
                arrayList2.add(next);
            }
        }
        List<HealthChartDataVo> chartDataList = DataConverterKt.toChartDataList(DataTypeConverter.INSTANCE.convertTempToDataItemList(arrayList2), startDate);
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : rawData) {
            if (((Temperature) obj).getType() == TemperatureDataType.ALL_DAY) {
                arrayList3.add(obj);
            }
        }
        List<Temperature> listF = f(arrayList3);
        DataTypeConverter dataTypeConverter = DataTypeConverter.INSTANCE;
        List<HealthChartDataVo> chartDataList2 = DataConverterKt.toChartDataList(dataTypeConverter.convertTempToDataItemList(listF), startDate);
        arrayList.addAll(listF);
        if (arrayList.size() > 1) {
            g.sortWith(arrayList, new Comparator() { // from class: com.xiaomi.hm.health.healthdata.utils.temperature.TemperatureDataHelper$getTempMixLineChartBuilderData$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((Temperature) t).getTimestamp()), Long.valueOf(((Temperature) t2).getTimestamp()));
                }
            });
        }
        TempMixLineChartBuilderData tempMixLineChartBuilderData = new TempMixLineChartBuilderData(startDate, dataTypeConverter.convertTempToDataItemList(rawData));
        tempMixLineChartBuilderData.setChartData(DataConverterKt.toChartDataList(dataTypeConverter.convertTempToDataItemList(arrayList), startDate));
        TemperatureDataHelper temperatureDataHelper = INSTANCE;
        tempMixLineChartBuilderData.setSubIndex(temperatureDataHelper.b(chartDataList2, 37.2f));
        tempMixLineChartBuilderData.setSubIndexShadowColors(temperatureDataHelper.c(chartDataList2, tempMixLineChartBuilderData.getSubIndex(), 37.2f, -1, Color.parseColor("#1AAF4C")));
        ArrayList<Integer> arrayList4 = new ArrayList<>();
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(chartDataList, 10));
        Iterator<T> it3 = chartDataList.iterator();
        while (it3.hasNext()) {
            arrayList5.add(Integer.valueOf(((HealthChartDataVo) it3.next()).getIndex()));
        }
        arrayList4.addAll(arrayList5);
        Unit unit = Unit.INSTANCE;
        tempMixLineChartBuilderData.setSubPointIndex(arrayList4);
        return tempMixLineChartBuilderData;
    }

    private final List<BarDto<Float>> e(Map<Object, ? extends List<Temperature>> data) {
        Pair pair;
        Pair pair2;
        Pair pair3;
        Object next;
        Object next2;
        Object next3;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Object, ? extends List<Temperature>> entry : data.entrySet()) {
            List<Temperature> value = entry.getValue();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = value.iterator();
            while (true) {
                boolean z = false;
                if (!it2.hasNext()) {
                    break;
                }
                Object next4 = it2.next();
                float temp = ((Temperature) next4).getTemp();
                if (35.0f <= temp && temp <= 37.2f) {
                    z = true;
                }
                if (z) {
                    arrayList2.add(next4);
                }
            }
            Pair pair4 = null;
            Object next5 = null;
            if (!arrayList2.isEmpty()) {
                Iterator it3 = arrayList2.iterator();
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (it3.hasNext()) {
                        float temp2 = ((Temperature) next2).getTemp();
                        do {
                            Object next6 = it3.next();
                            float temp3 = ((Temperature) next6).getTemp();
                            if (Float.compare(temp2, temp3) > 0) {
                                next2 = next6;
                                temp2 = temp3;
                            }
                        } while (it3.hasNext());
                    }
                } else {
                    next2 = null;
                }
                Temperature temperature = (Temperature) next2;
                float temp4 = temperature == null ? 35.0f : temperature.getTemp();
                Iterator it4 = arrayList2.iterator();
                if (it4.hasNext()) {
                    next3 = it4.next();
                    if (it4.hasNext()) {
                        float temp5 = ((Temperature) next3).getTemp();
                        do {
                            Object next7 = it4.next();
                            float temp6 = ((Temperature) next7).getTemp();
                            if (Float.compare(temp5, temp6) < 0) {
                                next3 = next7;
                                temp5 = temp6;
                            }
                        } while (it4.hasNext());
                    }
                } else {
                    next3 = null;
                }
                Temperature temperature2 = (Temperature) next3;
                pair = new Pair(Float.valueOf(temp4), Float.valueOf(temperature2 == null ? 35.0f : temperature2.getTemp()));
            } else {
                pair = null;
            }
            List<Temperature> value2 = entry.getValue();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : value2) {
                if (((Temperature) obj).getTemp() > 37.2f) {
                    arrayList3.add(obj);
                }
            }
            if (!arrayList3.isEmpty()) {
                Iterator it5 = arrayList3.iterator();
                if (it5.hasNext()) {
                    next = it5.next();
                    if (it5.hasNext()) {
                        float temp7 = ((Temperature) next).getTemp();
                        do {
                            Object next8 = it5.next();
                            float temp8 = ((Temperature) next8).getTemp();
                            if (Float.compare(temp7, temp8) > 0) {
                                next = next8;
                                temp7 = temp8;
                            }
                        } while (it5.hasNext());
                    }
                } else {
                    next = null;
                }
                Temperature temperature3 = (Temperature) next;
                float temp9 = temperature3 == null ? 37.2f : temperature3.getTemp();
                Iterator it6 = arrayList3.iterator();
                if (it6.hasNext()) {
                    next5 = it6.next();
                    if (it6.hasNext()) {
                        float temp10 = ((Temperature) next5).getTemp();
                        do {
                            Object next9 = it6.next();
                            float temp11 = ((Temperature) next9).getTemp();
                            if (Float.compare(temp10, temp11) < 0) {
                                next5 = next9;
                                temp10 = temp11;
                            }
                        } while (it6.hasNext());
                    }
                }
                Temperature temperature4 = (Temperature) next5;
                pair4 = new Pair(Float.valueOf(temp9), Float.valueOf(temperature4 == null ? 37.2f : temperature4.getTemp()));
            }
            if (pair == null || pair4 == null) {
                pair2 = pair;
                pair3 = pair4;
            } else {
                pair2 = new Pair(pair.getFirst(), Float.valueOf(37.2f));
                pair3 = new Pair(Float.valueOf(37.2f), pair4.getSecond());
            }
            arrayList.add(new BarDto(new Pair(Float.valueOf(37.2f), Float.valueOf(42.0f)), pair3, new Pair(Float.valueOf(35.0f), Float.valueOf(37.2f)), pair2, ((Temperature) CollectionsKt.first((List) entry.getValue())).getTimestamp()));
        }
        return arrayList;
    }

    private final List<Temperature> f(List<Temperature> dataList) {
        Object next;
        long j;
        double size;
        float temp;
        if (dataList.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Pair<Long, Long> timeRangeByTimeMode = HealthDataTimeUtils.INSTANCE.getTimeRangeByTimeMode(new Date(((Temperature) CollectionsKt.first((List) dataList)).getTimestamp()), TimeMode.DAY);
        long jLongValue = timeRangeByTimeMode.getFirst().longValue();
        long jLongValue2 = timeRangeByTimeMode.getSecond().longValue();
        int i = 300000;
        Iterator<T> it2 = dataList.iterator();
        Object next2 = null;
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                float temp2 = ((Temperature) next).getTemp();
                do {
                    Object next3 = it2.next();
                    float temp3 = ((Temperature) next3).getTemp();
                    if (Float.compare(temp2, temp3) > 0) {
                        next = next3;
                        temp2 = temp3;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        Temperature temperature = (Temperature) next;
        Iterator<T> it3 = dataList.iterator();
        if (it3.hasNext()) {
            next2 = it3.next();
            if (it3.hasNext()) {
                float temp4 = ((Temperature) next2).getTemp();
                do {
                    Object next4 = it3.next();
                    float temp5 = ((Temperature) next4).getTemp();
                    if (Float.compare(temp4, temp5) < 0) {
                        next2 = next4;
                        temp4 = temp5;
                    }
                } while (it3.hasNext());
            }
        }
        Temperature temperature2 = (Temperature) next2;
        long j2 = jLongValue;
        while (jLongValue <= jLongValue2) {
            long j3 = i;
            j2 += j3;
            try {
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it4 = dataList.iterator();
                while (true) {
                    boolean z = true;
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next5 = it4.next();
                    long timestamp = ((Temperature) next5).getTimestamp();
                    if (jLongValue > timestamp || timestamp > j2) {
                        z = false;
                    }
                    if (z) {
                        arrayList2.add(next5);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    if (arrayList2.contains(temperature)) {
                        temp = temperature.getTemp();
                    } else {
                        if (arrayList2.contains(temperature2)) {
                            temp = temperature2.getTemp();
                        } else {
                            double temp6 = 0.0d;
                            Iterator it5 = arrayList2.iterator();
                            while (it5.hasNext()) {
                                temp6 += (double) ((Temperature) it5.next()).getTemp();
                                jLongValue2 = jLongValue2;
                            }
                            j = jLongValue2;
                            size = temp6 / ((double) arrayList2.size());
                        }
                        arrayList.add(new Temperature(jLongValue, DataExKt.formatWithDecimalFloat(Float.valueOf((float) size), 1), TemperatureDataType.ALL_DAY));
                    }
                    size = temp;
                    j = jLongValue2;
                    arrayList.add(new Temperature(jLongValue, DataExKt.formatWithDecimalFloat(Float.valueOf((float) size), 1), TemperatureDataType.ALL_DAY));
                } else {
                    j = jLongValue2;
                }
                jLongValue += j3;
                jLongValue2 = j;
                i = 300000;
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    @NotNull
    public final DayTempDetailData getDayTempDetailData(@NotNull List<Temperature> rawData, @NotNull Date startDate) {
        return new DayTempDetailData(d(startDate, rawData), a(rawData));
    }

    @NotNull
    public final StatisticsTempDetailData getStatisticsTempDetailData(@NotNull List<Temperature> rawData, @NotNull Date date, @NotNull TimeMode timeMode) {
        List<BarDto<Float>> listE;
        int i = WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
        if (i == 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : rawData) {
                String dateStr = ((Temperature) obj).getDateStr();
                Object arrayList = linkedHashMap.get(dateStr);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(dateStr, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            listE = e(linkedHashMap);
        } else if (i == 2) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : rawData) {
                String dateStr2 = ((Temperature) obj2).getDateStr();
                Object arrayList2 = linkedHashMap2.get(dateStr2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(dateStr2, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            listE = e(linkedHashMap2);
        } else if (i != 3) {
            listE = CollectionsKt__CollectionsKt.emptyList();
        } else {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object obj3 : rawData) {
                CharSequence charSequenceSubSequence = ((Temperature) obj3).getDateStr().subSequence(0, 7);
                Object arrayList3 = linkedHashMap3.get(charSequenceSubSequence);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap3.put(charSequenceSubSequence, arrayList3);
                }
                ((List) arrayList3).add(obj3);
            }
            listE = e(linkedHashMap3);
        }
        return new StatisticsTempDetailData(DataConverterKt.toBarChartDataList$default(listE, date, timeMode, HealthDataUtils.INSTANCE.getBarChartOffset(TemperatureDataType.ALL_DAY), 0, 8, null), a(rawData));
    }
}
