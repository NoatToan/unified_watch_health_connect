package com.huami.moving.ui.utils;

import android.content.Context;
import com.google.android.material.timepicker.TimeModel;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.mifit.sportlib.utils.NumberFormatter;
import com.huami.mifit.sportlib.utils.RunDataConversion;
import com.huami.moving.R;
import com.huami.sport.service.model.HistoryRecord;
import com.huami.tools.analytics.DbUtils;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\"\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\tJ\u001e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0004J\u001e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004¨\u0006\u001a"}, d2 = {"Lcom/huami/moving/ui/utils/SportRecordAssembleUtil;", "", "", "distance", "", "unit", "Lkotlin/Pair;", "", "a", "Lcom/huami/sport/service/model/HistoryRecord;", "item", "", "setTitleDataAndSubDataToRecord", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "historyRecord", "setSportIconAndNameToRecord", "sportNameResId", "createSportTitle", "sportType", "deviceSource", "sportMode", "", "getSportIconColorAndName", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportRecordAssembleUtil {

    @NotNull
    public static final SportRecordAssembleUtil INSTANCE = new SportRecordAssembleUtil();

    private SportRecordAssembleUtil() {
    }

    private final Pair<String, Integer> a(float distance, int unit) {
        int i;
        String float2StringByLocale;
        float f = unit == 0 ? distance / 1000.0f : distance / 1760.0f;
        if (unit == 0) {
            i = f <= 10.0f ? R.string.unit_m : R.string.running_kilometers;
        } else {
            i = f <= 10.0f ? R.string.unit_yard : R.string.running_miles;
        }
        if (f <= 10.0f) {
            float2StringByLocale = NumberFormatter.formatFloat2StringByLocale(distance, 0, new int[0]);
        } else if (f < 100.0f) {
            float2StringByLocale = NumberFormatter.formatFloat2StringByLocale(f, 2, new int[0]);
        } else if (f < 1000.0f) {
            float2StringByLocale = NumberFormatter.formatFloat2StringByLocale(f, 1, new int[0]);
        } else {
            float2StringByLocale = f < 10000.0f ? NumberFormatter.formatFloat2StringByLocale(f, 0, new int[0]) : String.valueOf((int) f);
        }
        return new Pair<>(float2StringByLocale, Integer.valueOf(i));
    }

    @NotNull
    public final String createSportTitle(@NotNull Context context, @NotNull HistoryRecord historyRecord, int sportNameResId) {
        int sportMode = historyRecord.getSportMode();
        if (sportMode == 2) {
            return historyRecord.getCourseTitle();
        }
        if (sportMode == 3) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format("%s·%s", Arrays.copyOf(new Object[]{context.getString(sportNameResId), historyRecord.getCourseTitle()}, 2));
        }
        if (sportMode == 4) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            return String.format(context.getString(R.string.sport_title_interval_training), Arrays.copyOf(new Object[]{context.getString(sportNameResId)}, 1));
        }
        if (!historyRecord.getAutoRecognition().booleanValue()) {
            return context.getString(sportNameResId);
        }
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        return String.format("%s%s", Arrays.copyOf(new Object[]{context.getString(sportNameResId), context.getString(R.string.exercise_list_auto_recognition)}, 2));
    }

    @NotNull
    public final int[] getSportIconColorAndName(int sportType, int deviceSource, int sportMode) {
        int iconId = R.drawable.ic_run_30;
        int bgColorId = R.color.p3;
        int nameId = R.string.running_sports_type_running;
        SportTypeDescription.Companion companion = SportTypeDescription.INSTANCE;
        if (SportTypeIdentifier.isChildSportType(sportType)) {
            sportType -= 1000;
        }
        SportTypeDescription sportTypeDescriptionFindSportTypeDescription = companion.findSportTypeDescription(sportType, deviceSource, sportMode);
        if (sportTypeDescriptionFindSportTypeDescription != null) {
            iconId = sportTypeDescriptionFindSportTypeDescription.getIconId();
            bgColorId = sportTypeDescriptionFindSportTypeDescription.getBgColorId();
            nameId = sportTypeDescriptionFindSportTypeDescription.getNameId();
        }
        return new int[]{iconId, bgColorId, nameId};
    }

    @NotNull
    public final Pair<Integer, Integer> setSportIconAndNameToRecord(@NotNull Context context, @NotNull HistoryRecord historyRecord) {
        if (!historyRecord.isTraining()) {
            int[] sportIconColorAndName = getSportIconColorAndName(historyRecord.getType().intValue(), historyRecord.getSource().intValue(), historyRecord.getSportMode());
            historyRecord.setIconResId(sportIconColorAndName[0]);
            historyRecord.setIconColorId(sportIconColorAndName[1]);
            historyRecord.setNameResString(createSportTitle(context, historyRecord, sportIconColorAndName[2]));
            return new Pair<>(Integer.valueOf(sportIconColorAndName[0]), Integer.valueOf(sportIconColorAndName[2]));
        }
        int i = R.drawable.ic_train_30_s20;
        historyRecord.setIconResId(i);
        historyRecord.setIconColorId(R.color.s20);
        int i2 = R.string.sport_training_group_training;
        historyRecord.setNameResString(context.getString(i2));
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public final void setTitleDataAndSubDataToRecord(@NotNull HistoryRecord item) {
        boolean zIsMetric;
        String timeInSportFormForPace;
        int i;
        int i2 = 0;
        if (item.isTraining()) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(item.getConsumeCal())}, 1));
            int i3 = R.drawable.ic_calories_14_s2;
            String strValueOf = String.valueOf(item.getTrainingNo());
            int i4 = R.plurals.how_many_times;
            item.setTitleDataValue(strValueOf);
            item.setTitleDataUnitResId(i4);
            item.setSubDataValue(str);
            item.setSubDataIconResId(i3);
            return;
        }
        Integer type = item.getType();
        float fIntValue = (((type != null && type.intValue() == 11) || (type != null && type.intValue() == 42)) || (type != null && type.intValue() == 43)) || (type != null && type.intValue() == 105) ? item.getClimbDisDescend().intValue() : item.getDistance().intValue();
        Integer type2 = item.getType();
        if (type2 != null && type2.intValue() == 14) {
            zIsMetric = item.getUnit() == 0;
        } else {
            zIsMetric = RunnerData.getRunner().isMetric();
        }
        String[] formatDisAndUnit = DataFormatter.getFormatDisAndUnit(fIntValue, item.getType().intValue(), zIsMetric, false);
        int i5 = Integer.parseInt(formatDisAndUnit[1]);
        String string = formatDisAndUnit[0].toString();
        Integer type3 = item.getType();
        if (!((((type3 != null && type3.intValue() == 11) || (type3 != null && type3.intValue() == 105)) || (type3 != null && type3.intValue() == 42)) || (type3 != null && type3.intValue() == 43))) {
            if (type3 != null && type3.intValue() == 21) {
                string = String.valueOf(item.getRopeSkippingCount());
                int i6 = R.string.rope_skipping_unit;
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                i2 = i6;
                timeInSportFormForPace = String.format(Locale.US, TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(item.getConsumeCal())}, 1));
                i = R.drawable.ic_calories_14_s2;
            } else {
                if (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((type3 != null && type3.intValue() == 10) || (type3 != null && type3.intValue() == 12)) || (type3 != null && type3.intValue() == 16)) || (type3 != null && type3.intValue() == 17)) || (type3 != null && type3.intValue() == 18)) || (type3 != null && type3.intValue() == 23)) || (type3 != null && type3.intValue() == 24)) || (type3 != null && type3.intValue() == 41)) || (type3 != null && type3.intValue() == 45)) || (type3 != null && type3.intValue() == 49)) || (type3 != null && type3.intValue() == 50)) || (type3 != null && type3.intValue() == 51)) || (type3 != null && type3.intValue() == 52)) || (type3 != null && type3.intValue() == 53)) || (type3 != null && type3.intValue() == 54)) || (type3 != null && type3.intValue() == 55)) || (type3 != null && type3.intValue() == 57)) || (type3 != null && type3.intValue() == 58)) || (type3 != null && type3.intValue() == 59)) || (type3 != null && type3.intValue() == 60)) || (type3 != null && type3.intValue() == 61)) || (type3 != null && type3.intValue() == 64)) || (type3 != null && type3.intValue() == 70)) || (type3 != null && type3.intValue() == 71)) || (type3 != null && type3.intValue() == 72)) || (type3 != null && type3.intValue() == 73)) || (type3 != null && type3.intValue() == 74)) || (type3 != null && type3.intValue() == 75)) || (type3 != null && type3.intValue() == 76)) || (type3 != null && type3.intValue() == 77)) || (type3 != null && type3.intValue() == 78)) || (type3 != null && type3.intValue() == 79)) || (type3 != null && type3.intValue() == 80)) || (type3 != null && type3.intValue() == 81)) || (type3 != null && type3.intValue() == 82)) || (type3 != null && type3.intValue() == 83)) || (type3 != null && type3.intValue() == 84)) || (type3 != null && type3.intValue() == 85)) || (type3 != null && type3.intValue() == 86)) || (type3 != null && type3.intValue() == 87)) || (type3 != null && type3.intValue() == 88)) || (type3 != null && type3.intValue() == 89)) || (type3 != null && type3.intValue() == 90)) || (type3 != null && type3.intValue() == 91)) || (type3 != null && type3.intValue() == 92)) || (type3 != null && type3.intValue() == 93)) || (type3 != null && type3.intValue() == 95)) || (type3 != null && type3.intValue() == 96)) || (type3 != null && type3.intValue() == 97)) || (type3 != null && type3.intValue() == 98)) || (type3 != null && type3.intValue() == 99)) || (type3 != null && type3.intValue() == 100)) || (type3 != null && type3.intValue() == 101)) || (type3 != null && type3.intValue() == 102)) || (type3 != null && type3.intValue() == 103)) || (type3 != null && type3.intValue() == 104)) || (type3 != null && type3.intValue() == 108)) || (type3 != null && type3.intValue() == 109)) || (type3 != null && type3.intValue() == 111)) || (type3 != null && type3.intValue() == 112)) || (type3 != null && type3.intValue() == 113)) || (type3 != null && type3.intValue() == 114)) || (type3 != null && type3.intValue() == 115)) || (type3 != null && type3.intValue() == 116)) || (type3 != null && type3.intValue() == 117)) || (type3 != null && type3.intValue() == 118)) || (type3 != null && type3.intValue() == 119)) || (type3 != null && type3.intValue() == 120)) || (type3 != null && type3.intValue() == 122)) || (type3 != null && type3.intValue() == 129)) || (type3 != null && type3.intValue() == 130)) || (type3 != null && type3.intValue() == 121)) || (type3 != null && type3.intValue() == 189)) || (type3 != null && type3.intValue() == 143)) || (type3 != null && type3.intValue() == 144)) || (type3 != null && type3.intValue() == 145)) || (type3 != null && type3.intValue() == 146)) || (type3 != null && type3.intValue() == 147)) || (type3 != null && type3.intValue() == 148)) || (type3 != null && type3.intValue() == 149)) || (type3 != null && type3.intValue() == 150)) || (type3 != null && type3.intValue() == 151)) || (type3 != null && type3.intValue() == 152)) || (type3 != null && type3.intValue() == 153)) || (type3 != null && type3.intValue() == 154)) || (type3 != null && type3.intValue() == 155)) || (type3 != null && type3.intValue() == 156)) || (type3 != null && type3.intValue() == 157)) || (type3 != null && type3.intValue() == 158)) || (type3 != null && type3.intValue() == 159)) || (type3 != null && type3.intValue() == 160)) || (type3 != null && type3.intValue() == 161)) || (type3 != null && type3.intValue() == 162)) || (type3 != null && type3.intValue() == 163)) || (type3 != null && type3.intValue() == 164)) || (type3 != null && type3.intValue() == 165)) || (type3 != null && type3.intValue() == 166)) || (type3 != null && type3.intValue() == 167)) || (type3 != null && type3.intValue() == 168)) || (type3 != null && type3.intValue() == 169)) || (type3 != null && type3.intValue() == 170)) || (type3 != null && type3.intValue() == 171)) || (type3 != null && type3.intValue() == 172)) || (type3 != null && type3.intValue() == 173)) || (type3 != null && type3.intValue() == 174)) || (type3 != null && type3.intValue() == 175)) || (type3 != null && type3.intValue() == 176)) || (type3 != null && type3.intValue() == 177)) || (type3 != null && type3.intValue() == 179)) || (type3 != null && type3.intValue() == 180)) || (type3 != null && type3.intValue() == 181)) || (type3 != null && type3.intValue() == 182)) || (type3 != null && type3.intValue() == 183)) || (type3 != null && type3.intValue() == 184)) || (type3 != null && type3.intValue() == 185)) || (type3 != null && type3.intValue() == 186)) || (type3 != null && type3.intValue() == 187)) || (type3 != null && type3.intValue() == 191)) || (type3 != null && type3.intValue() == 188)) {
                    StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                    timeInSportFormForPace = String.format(Locale.US, TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(item.getConsumeCal())}, 1));
                    i = R.drawable.ic_calories_14_s2;
                    string = "";
                } else {
                    if ((((((((((((((((((((((((((((((((type3 != null && type3.intValue() == 6) || (type3 != null && type3.intValue() == 9)) || (type3 != null && type3.intValue() == 13)) || (type3 != null && type3.intValue() == 47)) || (type3 != null && type3.intValue() == 48)) || (type3 != null && type3.intValue() == 44)) || (type3 != null && type3.intValue() == 62)) || (type3 != null && type3.intValue() == 63)) || (type3 != null && type3.intValue() == 65)) || (type3 != null && type3.intValue() == 67)) || (type3 != null && type3.intValue() == 68)) || (type3 != null && type3.intValue() == 69)) || (type3 != null && type3.intValue() == 94)) || (type3 != null && type3.intValue() == 66)) || (type3 != null && type3.intValue() == 123)) || (type3 != null && type3.intValue() == 124)) || (type3 != null && type3.intValue() == 125)) || (type3 != null && type3.intValue() == 126)) || (type3 != null && type3.intValue() == 127)) || (type3 != null && type3.intValue() == 128)) || (type3 != null && type3.intValue() == 132)) || (type3 != null && type3.intValue() == 40)) || (type3 != null && type3.intValue() == 106)) || (type3 != null && type3.intValue() == 178)) || (type3 != null && type3.intValue() == 138)) || (type3 != null && type3.intValue() == 139)) || (type3 != null && type3.intValue() == 140)) || (type3 != null && type3.intValue() == 141)) || (type3 != null && type3.intValue() == 142)) || (type3 != null && type3.intValue() == 190)) || (type3 != null && type3.intValue() == 137)) || (type3 != null && type3.intValue() == 136)) {
                        timeInSportFormForPace = RunDataConversion.paceConvertToSpeed(item.getPace().floatValue(), zIsMetric);
                        i = R.drawable.ic_speed_14_s2;
                    } else if (type3 != null && type3.intValue() == 14) {
                        Pair<String, Integer> pairA = a(fIntValue, item.getUnit());
                        int iIntValue = pairA.getSecond().intValue();
                        string = pairA.getFirst();
                        StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                        timeInSportFormForPace = String.format(Locale.US, TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(item.getConsumeCal())}, 1));
                        i = R.drawable.ic_calories_14_s2;
                        i2 = iIntValue;
                    } else {
                        if ((((type3 != null && type3.intValue() == 15) || (type3 != null && type3.intValue() == 2001)) || (type3 != null && type3.intValue() == 2002)) || (type3 != null && type3.intValue() == 46)) {
                            StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
                            timeInSportFormForPace = String.format(Locale.US, TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(item.getConsumeCal())}, 1));
                            i = R.drawable.ic_calories_14_s2;
                        } else {
                            timeInSportFormForPace = (item.getPace().floatValue() <= 1.0E-4f || item.getPace().floatValue() >= 1.8f) ? "--" : DataFormatter.formatTimeInSportFormForPace((long) RunDataConversion.paceMultiplyKilo(item.getPace().floatValue(), zIsMetric));
                            i = R.drawable.ic_pace_14_s2;
                        }
                        i2 = i5;
                    }
                }
            }
            item.setTitleDataValue(string);
            item.setTitleDataUnitResId(i2);
            item.setSubDataValue(timeInSportFormForPace);
            item.setSubDataIconResId(i);
        }
        timeInSportFormForPace = String.valueOf(item.getAccumulatedGap());
        i = R.drawable.ic_drop_14_s2;
        i2 = i5;
        item.setTitleDataValue(string);
        item.setTitleDataUnitResId(i2);
        item.setSubDataValue(timeInSportFormForPace);
        item.setSubDataIconResId(i);
    }
}
