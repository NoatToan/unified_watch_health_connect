package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyWeightReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.BodyComposition;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.adapter.CommonRecordDetailAdapter;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.health.weight.util.WeightEvaluationHelper;
import com.xiaomi.fitness.health.weight.util.WeightParamUtil;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.RNDeviceModel;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.HealthUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import org.joda.time.LocalDate;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes10.dex */
public class ffr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Locale f17748a = Locale.getDefault();

    public class a implements Comparator<WeightItem> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(WeightItem weightItem, WeightItem weightItem2) {
            return (int) (weightItem.getTime() - weightItem2.getTime());
        }
    }

    public class b implements Comparator<WeightItem> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(WeightItem weightItem, WeightItem weightItem2) {
            return (int) (weightItem.getTime() - weightItem2.getTime());
        }
    }

    public static boolean a(WeightItem weightItem) {
        Float bodyFatRate = weightItem.getBodyFatRate();
        return (bodyFatRate == null || bodyFatRate.floatValue() == 0.0f) ? false : true;
    }

    public static List<MaxMinEntry> b(vfe vfeVar, DailyWeightReport dailyWeightReport) {
        ArrayList arrayList = new ArrayList();
        vfeVar.c = 24;
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(dailyWeightReport.getTime());
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate.plusDays(1));
        for (int i = 0; i < 24; i++) {
            jChangZeroOfTheDay -= TimeDateUtil.TIME_HOUR;
            MaxMinEntry maxMinEntry = new MaxMinEntry(i, 0.0f, jChangZeroOfTheDay, 3);
            maxMinEntry.localDate = localDateTimestampToLocalDate;
            arrayList.add(maxMinEntry);
        }
        return arrayList;
    }

    public static List<MaxMinEntry> c(vfe vfeVar, DailyWeightReport dailyWeightReport) {
        int i;
        ArrayList arrayList = new ArrayList();
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(dailyWeightReport.getTime());
        List<WeightItem> weightRecordList = dailyWeightReport.getWeightRecordList();
        if (ArrayUtils.isEmpty(weightRecordList)) {
            return b(vfeVar, dailyWeightReport);
        }
        vfeVar.c = weightRecordList.size();
        int size = weightRecordList.size() / 4;
        int i2 = 0;
        int i3 = 0;
        while (i2 < weightRecordList.size()) {
            WeightItem weightItem = weightRecordList.get(i2);
            if (weightRecordList.size() < 5) {
                i = 2;
            } else if (i2 != i3 * size || i3 >= 4) {
                i = 3;
            } else {
                i3++;
                i = 2;
            }
            MaxMinEntry maxMinEntry = new MaxMinEntry(i2, weightItem.getWeight(), weightItem.getTime(), i2 == weightRecordList.size() + (-1) ? 2 : i);
            maxMinEntry.localDate = localDateTimestampToLocalDate;
            arrayList.add(maxMinEntry);
            i2++;
        }
        return arrayList;
    }

    public static List<MaxMinEntry> d(DailyWeightReport dailyWeightReport, int i) {
        ArrayList arrayList = new ArrayList();
        List<WeightItem> weightRecordList = dailyWeightReport.getWeightRecordList();
        if (weightRecordList == null) {
            weightRecordList = new ArrayList<>();
        }
        if (weightRecordList.isEmpty()) {
            LocalDate localDateNow = LocalDate.now();
            for (int i2 = 0; i2 < i; i2++) {
                weightRecordList.add(new WeightItem(TimeDateUtil.changZeroOfTheDay(localDateNow.minusDays(i2)), 0.0f, Float.valueOf(0.0f)));
            }
        } else if (weightRecordList.size() < i) {
            Collections.sort(weightRecordList, new a());
            LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(weightRecordList.get(0).getTime());
            int i3 = 1;
            for (int size = weightRecordList.size(); size < i; size++) {
                weightRecordList.add(new WeightItem(TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate.minusDays(i3)), 0.0f, Float.valueOf(0.0f)));
                i3++;
            }
        }
        Collections.sort(weightRecordList, new b());
        for (int i4 = 0; i4 < i; i4++) {
            WeightItem weightItem = weightRecordList.get(i4);
            MaxMinEntry maxMinEntry = new MaxMinEntry(i4, weightItem.getWeight(), weightItem.getTime(), 3);
            maxMinEntry.localDate = TimeDateUtil.timestampToLocalDate(weightItem.getTime());
            arrayList.add(maxMinEntry);
        }
        return arrayList;
    }

    public static List<qpo> e(Context context, int i, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        String str3 = LocaleUtil.INSTANCE.isTR() ? "" : "%";
        String string = context.getString(c0j.zp);
        if (i == 0) {
            arrayList.add(new qpo(context.getString(c0j.o3), str, string));
            arrayList.add(new qpo(context.getString(c0j.r3), str2, string));
        } else if (i == 1) {
            arrayList.add(new qpo(context.getString(c0j.m3), str, str3));
            arrayList.add(new qpo(context.getString(c0j.p3), str2, str3));
        } else if (i == 2) {
            arrayList.add(new qpo(context.getString(c0j.n3), str, str3));
            arrayList.add(new qpo(context.getString(c0j.q3), str2, str3));
        }
        return arrayList;
    }

    public static List<MaxMinEntry> f(TreeMap<Long, WeightItem> treeMap, BodyComposition bodyComposition) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Long, WeightItem> entry : treeMap.entrySet()) {
            Float muscleRate = bodyComposition == BodyComposition.MUSCLE_RATE ? entry.getValue().getMuscleRate() : bodyComposition == BodyComposition.BODY_FAT_RATE ? entry.getValue().getBodyFatRate() : Float.valueOf(entry.getValue().getWeight());
            MaxMinEntry maxMinEntry = new MaxMinEntry(0, muscleRate == null ? 0.0f : muscleRate.floatValue(), entry.getKey().longValue(), 4);
            maxMinEntry.localDate = TimeDateUtil.timestampToLocalDate(entry.getKey().longValue());
            arrayList.add(maxMinEntry);
        }
        return arrayList;
    }

    public static List<qpo> g(Context context, Map<BodyComposition, List<WeightItem>> map) {
        ArrayList arrayList = new ArrayList();
        String str = LocaleUtil.INSTANCE.isTR() ? "" : "%";
        BodyComposition bodyComposition = BodyComposition.WEIGHT;
        if (map.containsKey(bodyComposition)) {
            List<WeightItem> list = map.get(bodyComposition);
            Logger.i("WeightDataUtil", "weight size:" + list.size());
            if (!ArrayUtils.isEmpty(list) && list.size() > 1) {
                float weight = list.get(0).getWeight() - list.get(1).getWeight();
                String str2 = String.format(f17748a, "%.2f", Float.valueOf(weight));
                if (weight > 0.0f) {
                    str2 = Marker.ANY_NON_NULL_MARKER + str2;
                }
                arrayList.add(new qpo(context.getString(c0j.m4), str2, context.getString(c0j.zp)));
            }
        }
        BodyComposition bodyComposition2 = BodyComposition.BODY_FAT_RATE;
        if (map.containsKey(bodyComposition2)) {
            List<WeightItem> list2 = map.get(bodyComposition2);
            Logger.i("WeightDataUtil", "body fat size:" + list2.size());
            if (!ArrayUtils.isEmpty(list2) && list2.size() > 1) {
                Float bodyFatRate = list2.get(0).getBodyFatRate();
                Float bodyFatRate2 = list2.get(1).getBodyFatRate();
                float fFloatValue = (bodyFatRate == null ? 0.0f : bodyFatRate.floatValue()) - (bodyFatRate2 == null ? 0.0f : bodyFatRate2.floatValue());
                String str3 = String.format(f17748a, "%.1f", Float.valueOf(fFloatValue));
                if (fFloatValue > 0.0f) {
                    str3 = Marker.ANY_NON_NULL_MARKER + str3;
                }
                arrayList.add(new qpo(context.getString(c0j.W2), str3, str));
            }
        }
        BodyComposition bodyComposition3 = BodyComposition.MUSCLE_RATE;
        if (map.containsKey(bodyComposition3)) {
            List<WeightItem> list3 = map.get(bodyComposition3);
            Logger.i("WeightDataUtil", "muscle size:" + list3.size());
            if (!ArrayUtils.isEmpty(list3) && list3.size() > 1) {
                Float muscleRate = list3.get(0).getMuscleRate();
                Float muscleRate2 = list3.get(1).getMuscleRate();
                float fFloatValue2 = (muscleRate == null ? 0.0f : muscleRate.floatValue()) - (muscleRate2 == null ? 0.0f : muscleRate2.floatValue());
                String str4 = String.format(f17748a, "%.1f", Float.valueOf(fFloatValue2));
                if (fFloatValue2 > 0.0f) {
                    str4 = Marker.ANY_NON_NULL_MARKER + str4;
                }
                arrayList.add(new qpo(context.getString(c0j.t3), str4, str));
            }
        }
        return arrayList;
    }

    public static <T extends RecyclerBarEntry> float h(List<T> list) {
        T t;
        Collections.sort(list);
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return 0.0f;
            }
            t = list.get(size);
        } while (t.getY() <= 0.0f);
        return xr5.e(2, t.getY());
    }

    public static List<CommonRecordDetailAdapter.DetailItem> i(Context context, WeightItem weightItem) {
        Float weightControl;
        String name;
        RNDeviceModel rNDeviceModel;
        String string;
        StringBuilder sb;
        StringBuilder sb2;
        StringBuilder sb3;
        StringBuilder sb4;
        ArrayList arrayList = new ArrayList();
        if (weightItem == null) {
            return arrayList;
        }
        boolean zIsTR = LocaleUtil.INSTANCE.isTR();
        if (weightItem.getTime() > 0) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.pp), TimeUtils.formatDate(context.getString(c0j.p), Long.valueOf(weightItem.getTime() * 1000))));
        }
        if (weightItem.getWeight() > 0.0f) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.m4), context.getString(c0j.u4, String.format(Locale.getDefault(), "%1$.2f", Float.valueOf(weightItem.getWeight())))));
        }
        float fCalculateBmi = (weightItem.getBmi() == null || weightItem.getBmi().floatValue() <= 0.0f) ? WeightEvaluationHelper.INSTANCE.calculateBmi(weightItem.getWeight(), HealthUtil.getHeight()) : weightItem.getBmi().floatValue();
        arrayList.add(new CommonRecordDetailAdapter.DetailItem(1));
        arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.L2), String.format(f17748a, "%.1f", Float.valueOf(fCalculateBmi))));
        if (weightItem.getBodyFatRate() != null && weightItem.getBodyFatRate().floatValue() != 0.0f) {
            String str = String.format(f17748a, "%.1f", weightItem.getBodyFatRate());
            String string2 = context.getString(c0j.W2);
            if (zIsTR) {
                sb4 = new StringBuilder();
                sb4.append("%");
                sb4.append(str);
            } else {
                sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append("%");
            }
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(string2, sb4.toString()));
        }
        if (weightItem.getMuscleRate() != null && weightItem.getMuscleRate().floatValue() != 0.0f) {
            String str2 = String.format(f17748a, "%.1f", weightItem.getMuscleRate());
            String string3 = context.getString(c0j.t3);
            if (zIsTR) {
                sb3 = new StringBuilder();
                sb3.append("%");
                sb3.append(str2);
            } else {
                sb3 = new StringBuilder();
                sb3.append(str2);
                sb3.append("%");
            }
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(string3, sb3.toString()));
        }
        if (weightItem.getMoistureRate() != null && weightItem.getMoistureRate().floatValue() != 0.0f) {
            String str3 = String.format(f17748a, "%.1f", weightItem.getMoistureRate());
            String string4 = context.getString(c0j.h4);
            if (zIsTR) {
                sb2 = new StringBuilder();
                sb2.append("%");
                sb2.append(str3);
            } else {
                sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append("%");
            }
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(string4, sb2.toString()));
        }
        if (weightItem.getProteinRate() != null && weightItem.getProteinRate().floatValue() != 0.0f) {
            String str4 = String.format(f17748a, "%.1f", weightItem.getProteinRate());
            String string5 = context.getString(c0j.u3);
            if (zIsTR) {
                sb = new StringBuilder();
                sb.append("%");
                sb.append(str4);
            } else {
                sb = new StringBuilder();
                sb.append(str4);
                sb.append("%");
            }
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(string5, sb.toString()));
        }
        if (weightItem.getVisceralFat() != null && weightItem.getVisceralFat().floatValue() != 0.0f) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.a4), String.format(f17748a, "%.1f", weightItem.getVisceralFat())));
        }
        if (weightItem.getBoneSaltMass() != null && weightItem.getBoneSaltMass().floatValue() != 0.0f) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.M2), context.getString(c0j.o4, weightItem.getBoneSaltMass())));
        }
        if (weightItem.getBoneSaltRate() != null && weightItem.getBoneSaltRate().floatValue() != 0.0f) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.v4), context.getString(c0j.F8, Float.valueOf(xr5.e(1, weightItem.getBoneSaltRate().floatValue())))));
        }
        if (weightItem.getBasalMetabolism() != null && weightItem.getBasalMetabolism().intValue() != 0) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.K2), context.getResources().getQuantityString(qxi.common_unit_calorie_desc, weightItem.getBasalMetabolism().intValue(), weightItem.getBasalMetabolism())));
        }
        if (weightItem.getBodyMoistureMass() != null && weightItem.getBodyMoistureMass().floatValue() != 0.0f) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.s3), context.getString(c0j.n4, weightItem.getBodyMoistureMass())));
        }
        if (weightItem.getProteinMass() != null && weightItem.getProteinMass().floatValue() != 0.0f) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.Bb), context.getString(c0j.n4, weightItem.getProteinMass())));
        }
        if (weightItem.getFatMass() != null && weightItem.getFatMass().floatValue() != 0.0f) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.t8), context.getString(c0j.n4, weightItem.getFatMass())));
        }
        if (weightItem.getMuscleMass() != null && weightItem.getMuscleMass().floatValue() != 0.0f) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.Z9), context.getString(c0j.n4, weightItem.getMuscleMass())));
        }
        if (weightItem.getSkeletalMuscleMass() != null && weightItem.getSkeletalMuscleMass().floatValue() != 0.0f) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.wp), context.getString(c0j.n4, weightItem.getSkeletalMuscleMass())));
        }
        if (weightItem.getFatFreeBody() != null && weightItem.getFatFreeBody().floatValue() != 0.0f) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.kp), context.getString(c0j.n4, weightItem.getFatFreeBody())));
        }
        if (weightItem.getLimbsSkeletalMuscleIndex() != null && weightItem.getLimbsSkeletalMuscleIndex().floatValue() != 0.0f) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.A9), context.getString(c0j.D8, weightItem.getLimbsSkeletalMuscleIndex())));
        }
        if (weightItem.getLeftUpperLimbMuscleMass() != null && weightItem.getLeftUpperLimbMuscleMass().floatValue() != 0.0f) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.t9), context.getString(c0j.n4, weightItem.getLeftUpperLimbMuscleMass())));
        }
        if (weightItem.getRightUpperLimbMuscleMass() != null && weightItem.getRightUpperLimbMuscleMass().floatValue() != 0.0f) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.ic), context.getString(c0j.n4, weightItem.getRightUpperLimbMuscleMass())));
        }
        if (weightItem.getTrunkMuscleMass() != null && weightItem.getTrunkMuscleMass().floatValue() != 0.0f) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.jo), context.getString(c0j.n4, weightItem.getTrunkMuscleMass())));
        }
        if (weightItem.getLeftLowerLimbMuscleMass() != null && weightItem.getLeftLowerLimbMuscleMass().floatValue() != 0.0f) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.q9), context.getString(c0j.n4, weightItem.getLeftLowerLimbMuscleMass())));
        }
        if (weightItem.getRightLowerLimbMuscleMass() != null && weightItem.getRightLowerLimbMuscleMass().floatValue() != 0.0f) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.fc), context.getString(c0j.n4, weightItem.getRightLowerLimbMuscleMass())));
        }
        if (a(weightItem) && weightItem.getUpperLimbMuscleBalance() != null) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.f4800no), WeightParamUtil.INSTANCE.getWeightBalanceLevelName(weightItem.getUpperLimbMuscleBalance())));
        }
        if (a(weightItem) && weightItem.getLowerLimbMuscleBalance() != null) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.H9), WeightParamUtil.INSTANCE.getWeightBalanceLevelName(weightItem.getLowerLimbMuscleBalance())));
        }
        if (a(weightItem) && weightItem.getLimbsMuscleBalance() != null) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.z9), WeightParamUtil.INSTANCE.getWeightBalanceLevelName(weightItem.getLimbsMuscleBalance())));
        }
        if (weightItem.getLeftUpperLimbFatMass() != null && weightItem.getLeftUpperLimbFatMass().floatValue() != 0.0f) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.s9), context.getString(c0j.n4, weightItem.getLeftUpperLimbFatMass())));
        }
        if (weightItem.getRightUpperLimbFatMass() != null && weightItem.getRightUpperLimbFatMass().floatValue() != 0.0f) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.hc), context.getString(c0j.n4, weightItem.getRightUpperLimbFatMass())));
        }
        if (weightItem.getTrunkFatMass() != null && weightItem.getTrunkFatMass().floatValue() != 0.0f) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.f4798io), context.getString(c0j.n4, weightItem.getTrunkFatMass())));
        }
        if (weightItem.getLeftLowerLimbFatMass() != null && weightItem.getLeftLowerLimbFatMass().floatValue() != 0.0f) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.p9), context.getString(c0j.n4, weightItem.getLeftLowerLimbFatMass())));
        }
        if (weightItem.getRightLowerLimbFatMass() != null && weightItem.getRightLowerLimbFatMass().floatValue() != 0.0f) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.ec), context.getString(c0j.n4, weightItem.getRightLowerLimbFatMass())));
        }
        if (a(weightItem) && weightItem.getUpperLimbFatBalance() != null) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.mo), WeightParamUtil.INSTANCE.getWeightBalanceLevelName(weightItem.getUpperLimbFatBalance())));
        }
        if (a(weightItem) && weightItem.getLowerLimbFatBalance() != null) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.G9), WeightParamUtil.INSTANCE.getWeightBalanceLevelName(weightItem.getLowerLimbFatBalance())));
        }
        if (a(weightItem) && weightItem.getLimbsFatBalance() != null) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.y9), WeightParamUtil.INSTANCE.getWeightBalanceLevelName(weightItem.getLimbsFatBalance())));
        }
        if (a(weightItem) && weightItem.getSomatotype() != null) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.Jk), WeightParamUtil.INSTANCE.getSomatotypeName(weightItem.getSomatotype())));
        }
        if (a(weightItem) && weightItem.getBodyShape() != null && weightItem.getBodyShape().intValue() != 0) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.z3), WeightParamUtil.INSTANCE.getBodyShape(weightItem.getBodyShape())));
        }
        if (weightItem.getWhr() != null && weightItem.getWhr().floatValue() != 0.0f) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.Ap), String.format(f17748a, "%.1f", weightItem.getWhr())));
        }
        if (weightItem.getBmp() != null && weightItem.getBmp().intValue() != 0) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.I2), context.getString(c0j.E8, weightItem.getBmp())));
        }
        if (weightItem.getBodyScore() != null && weightItem.getBodyScore().intValue() != 0) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.y3), context.getResources().getQuantityString(qxi.j, weightItem.getBodyScore().intValue(), weightItem.getBodyScore())));
        }
        if (weightItem.getBodyAge() != null && weightItem.getBodyAge().intValue() != 0) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.J2), context.getResources().getQuantityString(qxi.i, weightItem.getBodyAge().intValue(), weightItem.getBodyAge())));
        }
        Float realStandardWeight = weightItem.getRealStandardWeight();
        if (realStandardWeight != null && realStandardWeight.floatValue() != 0.0f) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.pl), context.getString(c0j.o4, realStandardWeight)));
        }
        boolean z = false;
        boolean z2 = (weightItem.getBodyFatRate() == null || weightItem.getBodyFatRate().floatValue() == 0.0f) ? false : true;
        if (weightItem.getScoreStandardType() != null && weightItem.getScoreStandardType().intValue() == 2) {
            z = true;
        }
        String name2 = "";
        if ((z2 || z) && (weightControl = weightItem.getWeightControl()) != null) {
            if (weightControl.floatValue() == 0.0f) {
                arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.hp), context.getString(c0j.jp)));
            } else {
                String str5 = weightControl.floatValue() > 0.0f ? Marker.ANY_NON_NULL_MARKER : "";
                arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.hp), str5 + context.getString(c0j.o4, weightControl)));
            }
        }
        if (z2) {
            Float muscleControl = weightItem.getMuscleControl();
            if (muscleControl != null) {
                if (muscleControl.floatValue() <= 0.0f) {
                    string = ExtUtilKt.getString(c0j.jp);
                } else {
                    string = Marker.ANY_NON_NULL_MARKER + context.getString(c0j.o4, muscleControl);
                }
                arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.Y9), string));
            }
            Float fatControl = weightItem.getFatControl();
            if (fatControl != null) {
                arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.s8), fatControl.floatValue() >= 0.0f ? ExtUtilKt.getString(c0j.jp) : context.getString(c0j.o4, fatControl)));
            }
        }
        if (weightItem.getRecommendedCaloriesIntake() != null && weightItem.getRecommendedCaloriesIntake().intValue() != 0) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.Mb), context.getResources().getQuantityString(qxi.s, weightItem.getRecommendedCaloriesIntake().intValue(), weightItem.getRecommendedCaloriesIntake())));
        }
        Logger.i("Weight", "record detail sid:" + weightItem.getSid());
        if (!TextUtils.isEmpty(weightItem.getSid())) {
            if ("xiaomiwear_app_manually".equalsIgnoreCase(weightItem.getSid())) {
                name = context.getString(c0j.o5);
            } else {
                DeviceInfo<? extends Device> deviceInfoInAll = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceInfoInAll(weightItem.getSid());
                if (deviceInfoInAll != null && !deviceInfoInAll.getName().isEmpty()) {
                    name2 = deviceInfoInAll.getName();
                    Logger.i("Weight", "WearableDeviceManager sid device name:" + name2);
                }
                if (!name2.isEmpty() || (rNDeviceModel = (RNDeviceModel) RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).getDeviceModel(weightItem.getSid())) == null || rNDeviceModel.getDeviceInfo().getName().isEmpty()) {
                    name = name2;
                } else {
                    name = rNDeviceModel.getDeviceInfo().getName();
                    Logger.i("Weight", "RNDeviceManager sid device name:" + name);
                }
            }
            if (!TextUtils.isEmpty(name)) {
                arrayList.add(new CommonRecordDetailAdapter.DetailItem(1));
                arrayList.add(new CommonRecordDetailAdapter.DetailItem(context.getString(c0j.i5), name));
            }
        }
        return arrayList;
    }
}
