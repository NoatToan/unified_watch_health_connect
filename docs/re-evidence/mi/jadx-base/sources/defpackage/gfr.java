package defpackage;

import android.content.Context;
import com.xiaomi.fit.fitness.export.data.aggregation.record.BodyComposition;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.electronic.scale.data.WeightResult;
import com.xiaomi.fitness.electronic.scale.util.WeightInfoUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import org.joda.time.LocalDate;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes8.dex */
public class gfr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Locale f18938a = Locale.getDefault();

    public static List<MaxMinEntry> a(TreeMap<String, WeightResult> treeMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, WeightResult> entry : treeMap.entrySet()) {
            qal.c("createBtpStatisticEntries() date = " + entry.getKey());
            WeightResult value = entry.getValue();
            if (value.getBfp() > 0.0f) {
                LocalDate localDateTimestampToLocalDateInner = TimeDateUtil.timestampToLocalDateInner(value.getTime());
                MaxMinEntry maxMinEntry = new MaxMinEntry(0, value.getBfp(), value.getTime() / 1000, 4);
                maxMinEntry.localDate = localDateTimestampToLocalDateInner;
                arrayList.add(maxMinEntry);
            }
        }
        return arrayList;
    }

    public static List<MaxMinEntry> b(vfe vfeVar, Long l) {
        ArrayList arrayList = new ArrayList();
        vfeVar.c = 24;
        LocalDate localDateTimestampToLocalDateInner = TimeDateUtil.timestampToLocalDateInner(l.longValue());
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDateInner.plusDays(1));
        for (int i = 0; i < 24; i++) {
            jChangZeroOfTheDay -= TimeDateUtil.TIME_HOUR;
            MaxMinEntry maxMinEntry = new MaxMinEntry(i, 0.0f, jChangZeroOfTheDay, 3);
            maxMinEntry.localDate = localDateTimestampToLocalDateInner;
            arrayList.add(maxMinEntry);
        }
        return arrayList;
    }

    public static List<MaxMinEntry> c(vfe vfeVar, List<WeightResult> list, Long l) {
        ArrayList arrayList = new ArrayList();
        if (ArrayUtils.isEmpty(list)) {
            return b(vfeVar, l);
        }
        vfeVar.c = list.size();
        for (int i = 0; i < list.size(); i++) {
            WeightResult weightResult = list.get(i);
            LocalDate localDateTimestampToLocalDateInner = TimeDateUtil.timestampToLocalDateInner(weightResult.getTime());
            MaxMinEntry maxMinEntry = new MaxMinEntry(i, weightResult.getWeight(), weightResult.getTime() / 1000, (list.size() <= 8 || i % 3 == 0) ? 2 : 3);
            maxMinEntry.localDate = localDateTimestampToLocalDateInner;
            arrayList.add(0, maxMinEntry);
        }
        return arrayList;
    }

    public static List<ppo> d(Context context, int i, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (i == 0) {
            String string = context.getString(zzi.W5);
            arrayList.add(new ppo(context.getString(zzi.T3), str, string));
            arrayList.add(new ppo(context.getString(zzi.Y3), str2, string));
        } else if (i == 1) {
            String string2 = context.getString(zzi.I2);
            arrayList.add(new ppo(context.getString(zzi.R1), str, string2));
            arrayList.add(new ppo(context.getString(zzi.T1), str2, string2));
        } else if (i == 2) {
            String string3 = context.getString(zzi.I2);
            arrayList.add(new ppo(context.getString(zzi.S1), str, string3));
            arrayList.add(new ppo(context.getString(zzi.U1), str2, string3));
        }
        return arrayList;
    }

    public static List<MaxMinEntry> e(TreeMap<String, WeightResult> treeMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, WeightResult> entry : treeMap.entrySet()) {
            qal.c("createMuscleRateStatisticEntries() date = " + entry.getKey());
            WeightResult value = entry.getValue();
            if (value.getSlm() > 0.0f) {
                LocalDate localDateTimestampToLocalDateInner = TimeDateUtil.timestampToLocalDateInner(value.getTime());
                MaxMinEntry maxMinEntry = new MaxMinEntry(0, WeightInfoUtil.INSTANCE.getFormatFloat((value.getSlm() * 100.0f) / value.getWeight()), value.getTime() / 1000, 4);
                maxMinEntry.localDate = localDateTimestampToLocalDateInner;
                arrayList.add(maxMinEntry);
            }
        }
        return arrayList;
    }

    public static List<ppo> f(Context context, Map<BodyComposition, List<WeightItem>> map) {
        ArrayList arrayList = new ArrayList();
        String str = LocaleUtil.INSTANCE.isTR() ? "" : "%";
        BodyComposition bodyComposition = BodyComposition.WEIGHT;
        if (map.containsKey(bodyComposition)) {
            List<WeightItem> list = map.get(bodyComposition);
            Logger.i("WeightDataUtil", "weight size:" + list.size());
            if (!ArrayUtils.isEmpty(list) && list.size() > 1) {
                float weight = list.get(0).getWeight() - list.get(1).getWeight();
                String str2 = String.format(f18938a, "%.1f", Float.valueOf(weight));
                if (weight > 0.0f) {
                    str2 = Marker.ANY_NON_NULL_MARKER + str2;
                }
                arrayList.add(new ppo(context.getString(zzi.A2), str2, context.getString(zzi.u3)));
            }
        }
        BodyComposition bodyComposition2 = BodyComposition.BODY_FAT_RATE;
        if (map.containsKey(bodyComposition2)) {
            List<WeightItem> list2 = map.get(bodyComposition2);
            ArrayList arrayList2 = new ArrayList();
            if (list2 != null) {
                for (WeightItem weightItem : list2) {
                    if (weightItem != null && weightItem.getBodyFatRate() != null && weightItem.getBodyFatRate().floatValue() > 0.0f) {
                        arrayList2.add(weightItem);
                    }
                }
            }
            Logger.i("WeightDataUtil", "body fat size:" + arrayList2.size());
            if (!ArrayUtils.isEmpty(arrayList2) && arrayList2.size() > 1) {
                Float bodyFatRate = ((WeightItem) arrayList2.get(0)).getBodyFatRate();
                Float bodyFatRate2 = ((WeightItem) arrayList2.get(1)).getBodyFatRate();
                float fFloatValue = (bodyFatRate == null ? 0.0f : bodyFatRate.floatValue()) - (bodyFatRate2 == null ? 0.0f : bodyFatRate2.floatValue());
                String str3 = String.format(f18938a, "%.1f", Float.valueOf(fFloatValue));
                if (fFloatValue > 0.0f) {
                    str3 = Marker.ANY_NON_NULL_MARKER + str3;
                }
                arrayList.add(new ppo(context.getString(zzi.B1), str3, str));
            }
        }
        BodyComposition bodyComposition3 = BodyComposition.MUSCLE_RATE;
        if (map.containsKey(bodyComposition3)) {
            List<WeightItem> list3 = map.get(bodyComposition3);
            ArrayList arrayList3 = new ArrayList();
            if (list3 != null) {
                for (WeightItem weightItem2 : list3) {
                    if (weightItem2 != null && weightItem2.getMuscleRate() != null && weightItem2.getMuscleRate().floatValue() > 0.0f) {
                        arrayList3.add(weightItem2);
                    }
                }
            }
            Logger.i("WeightDataUtil", "muscle size:" + arrayList3.size());
            if (!ArrayUtils.isEmpty(arrayList3) && arrayList3.size() > 1) {
                Float muscleRate = ((WeightItem) arrayList3.get(0)).getMuscleRate();
                Float muscleRate2 = ((WeightItem) arrayList3.get(1)).getMuscleRate();
                float fFloatValue2 = (muscleRate == null ? 0.0f : muscleRate.floatValue()) - (muscleRate2 == null ? 0.0f : muscleRate2.floatValue());
                String str4 = String.format(f18938a, "%.1f", Float.valueOf(fFloatValue2));
                if (fFloatValue2 > 0.0f) {
                    str4 = Marker.ANY_NON_NULL_MARKER + str4;
                }
                arrayList.add(new ppo(context.getString(zzi.W1), str4, str));
            }
        }
        return arrayList;
    }

    public static List<MaxMinEntry> g(TreeMap<String, WeightResult> treeMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, WeightResult> entry : treeMap.entrySet()) {
            qal.c("createStatisticEntries() date = " + entry.getKey());
            WeightResult value = entry.getValue();
            LocalDate localDateTimestampToLocalDateInner = TimeDateUtil.timestampToLocalDateInner(value.getTime());
            MaxMinEntry maxMinEntry = new MaxMinEntry((float) 0, value.getWeight(), value.getTime() / 1000, 4);
            maxMinEntry.localDate = localDateTimestampToLocalDateInner;
            arrayList.add(maxMinEntry);
        }
        return arrayList;
    }
}
