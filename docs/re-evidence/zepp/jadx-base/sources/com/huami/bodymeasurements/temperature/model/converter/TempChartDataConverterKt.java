package com.huami.bodymeasurements.temperature.model.converter;

import com.huami.bodymeasurements.common.chart.ChartDataConverterKt;
import com.huami.bodymeasurements.common.chart.vo.BarChartVo;
import com.huami.bodymeasurements.common.chart.vo.BarDto;
import com.huami.bodymeasurements.common.chart.vo.ChartDataVo;
import com.huami.bodymeasurements.common.utils.TimeUtils;
import com.huami.bodymeasurements.temperature.view.vo.TemperatureVo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004\u001a(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00002\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\bH\u0002¨\u0006\f"}, d2 = {"", "Lcom/huami/bodymeasurements/temperature/view/vo/TemperatureVo;", "Lcom/huami/bodymeasurements/common/chart/vo/ChartDataVo;", "convertToDayChartData", "", "dateMode", "Lcom/huami/bodymeasurements/common/chart/vo/BarChartVo;", "convertToBarChartData", "", "data", "Lcom/huami/bodymeasurements/common/chart/vo/BarDto;", "a", "temperature_release"}, k = 2, mv = {1, 5, 1})
public final class TempChartDataConverterKt {
    private static final List<BarDto> a(Map<String, ? extends List<TemperatureVo>> map) {
        Pair pair;
        Pair pair2;
        Object next;
        Object next2;
        Object next3;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, ? extends List<TemperatureVo>>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            List<TemperatureVo> value = it2.next().getValue();
            Date date = new Date(((TemperatureVo) CollectionsKt.first((List) value)).getTimestamp());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : value) {
                if (((TemperatureVo) obj).isNormal()) {
                    arrayList2.add(obj);
                }
            }
            Pair pair3 = null;
            Object next4 = null;
            if (!arrayList2.isEmpty()) {
                Iterator it3 = arrayList2.iterator();
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (it3.hasNext()) {
                        float temp = ((TemperatureVo) next2).getTemp();
                        do {
                            Object next5 = it3.next();
                            float temp2 = ((TemperatureVo) next5).getTemp();
                            if (Float.compare(temp, temp2) > 0) {
                                next2 = next5;
                                temp = temp2;
                            }
                        } while (it3.hasNext());
                    }
                } else {
                    next2 = null;
                }
                float temp3 = ((TemperatureVo) next2).getTemp();
                Iterator it4 = arrayList2.iterator();
                if (it4.hasNext()) {
                    next3 = it4.next();
                    if (it4.hasNext()) {
                        float temp4 = ((TemperatureVo) next3).getTemp();
                        do {
                            Object next6 = it4.next();
                            float temp5 = ((TemperatureVo) next6).getTemp();
                            if (Float.compare(temp4, temp5) < 0) {
                                next3 = next6;
                                temp4 = temp5;
                            }
                        } while (it4.hasNext());
                    }
                } else {
                    next3 = null;
                }
                pair = new Pair(Float.valueOf(temp3), Float.valueOf(((TemperatureVo) next3).getTemp()));
            } else {
                pair = null;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : value) {
                if (((TemperatureVo) obj2).isAbnormal()) {
                    arrayList3.add(obj2);
                }
            }
            if (!arrayList3.isEmpty()) {
                Iterator it5 = arrayList3.iterator();
                if (it5.hasNext()) {
                    next = it5.next();
                    if (it5.hasNext()) {
                        float temp6 = ((TemperatureVo) next).getTemp();
                        do {
                            Object next7 = it5.next();
                            float temp7 = ((TemperatureVo) next7).getTemp();
                            if (Float.compare(temp6, temp7) > 0) {
                                next = next7;
                                temp6 = temp7;
                            }
                        } while (it5.hasNext());
                    }
                } else {
                    next = null;
                }
                float temp8 = ((TemperatureVo) next).getTemp();
                Iterator it6 = arrayList3.iterator();
                if (it6.hasNext()) {
                    next4 = it6.next();
                    if (it6.hasNext()) {
                        float temp9 = ((TemperatureVo) next4).getTemp();
                        do {
                            Object next8 = it6.next();
                            float temp10 = ((TemperatureVo) next8).getTemp();
                            if (Float.compare(temp9, temp10) < 0) {
                                next4 = next8;
                                temp9 = temp10;
                            }
                        } while (it6.hasNext());
                    }
                }
                pair3 = new Pair(Float.valueOf(temp8), Float.valueOf(((TemperatureVo) next4).getTemp()));
            }
            if (pair == null || pair3 == null) {
                pair2 = pair;
            } else {
                pair2 = new Pair(pair.getFirst(), Float.valueOf(37.2f));
                pair3 = new Pair(Float.valueOf(37.2f), pair3.getSecond());
            }
            arrayList.add(new BarDto(new Pair(Float.valueOf(37.2f), Float.valueOf(42.0f)), pair3, new Pair(Float.valueOf(35.0f), Float.valueOf(37.2f)), pair2, date));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0097  */
    @NotNull
    public static final List<BarChartVo> convertToBarChartData(@NotNull List<TemperatureVo> list, @NotNull String str) {
        List<BarDto> listA;
        int iHashCode = str.hashCode();
        if (iHashCode != 3645428) {
            if (iHashCode != 3704893) {
                if (iHashCode == 104080000 && str.equals("month")) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj : list) {
                        String monthGroupStr = ((TemperatureVo) obj).getMonthGroupStr();
                        Object arrayList = linkedHashMap.get(monthGroupStr);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(monthGroupStr, arrayList);
                        }
                        ((List) arrayList).add(obj);
                    }
                    listA = a(linkedHashMap);
                } else {
                    listA = CollectionsKt__CollectionsKt.emptyList();
                }
            } else if (str.equals("year")) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj2 : list) {
                    String yearGroupStr = ((TemperatureVo) obj2).getYearGroupStr();
                    Object arrayList2 = linkedHashMap2.get(yearGroupStr);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap2.put(yearGroupStr, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
                listA = a(linkedHashMap2);
            } else {
                listA = CollectionsKt__CollectionsKt.emptyList();
            }
        } else if (str.equals("week")) {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object obj3 : list) {
                String weekGroupStr = ((TemperatureVo) obj3).getWeekGroupStr();
                Object arrayList3 = linkedHashMap3.get(weekGroupStr);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap3.put(weekGroupStr, arrayList3);
                }
                ((List) arrayList3).add(obj3);
            }
            listA = a(linkedHashMap3);
        } else {
            listA = CollectionsKt__CollectionsKt.emptyList();
        }
        return CollectionsKt___CollectionsKt.sortedWith(ChartDataConverterKt.convertToBarChartDataList(listA, str, 0.24f), new Comparator() { // from class: com.huami.bodymeasurements.temperature.model.converter.TempChartDataConverterKt$convertToBarChartData$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((BarChartVo) t).getIndex()), Integer.valueOf(((BarChartVo) t2).getIndex()));
            }
        });
    }

    @NotNull
    public static final List<ChartDataVo> convertToDayChartData(@NotNull List<TemperatureVo> list) {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            long jLongValue = TimeUtils.INSTANCE.getTimeRangeByDateMode(((TemperatureVo) CollectionsKt.first((List) list)).getTimestamp(), "day").getFirst().longValue();
            for (TemperatureVo temperatureVo : list) {
                arrayList.add(new ChartDataVo(((int) (temperatureVo.getTimestamp() - jLongValue)) / 1000, String.valueOf(temperatureVo.getTemp()), temperatureVo.getTimestamp()));
            }
        }
        return arrayList;
    }
}
