package com.xiaomi.fitness.watch.face.edit.utils;

import com.autonavi.base.amap.mapcore.tools.GLMapStaticValue;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import com.xiaomi.fitness.watch.face.edit.entity.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0010\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u001a9\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\f\u001a\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002\u001a\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u0013\u001a\u00020\u0007\u001a;\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0019\u001a\u0010\u0010\u001a\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u001a\u0010\u0010\u001b\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"TAG", "", "getSourceDefaultValue", "", "source", "getImageNumberDefaultArray", "", "", "totalDigits", "leadingZero", "", "trailingZero", "(Ljava/lang/String;IZZ)[Ljava/lang/Integer;", "numberValueAnyList", "", "", "defaultNumber", "intArray", "", RealNameWebViewActivity.NUMBER, "getImageNumberFileList", "Lcom/xiaomi/fitness/watch/face/edit/entity/Image;", "indexArray", "listImage", "unitIcon", "([Ljava/lang/Integer;Ljava/util/List;Lcom/xiaomi/fitness/watch/face/edit/entity/Image;)Ljava/util/List;", "getDataItemPointerValueDefault", "getTextDefaultString", "watch-face_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDialSourceUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialSourceUtils.kt\ncom/xiaomi/fitness/watch/face/edit/utils/DialSourceUtilsKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,418:1\n37#2:419\n36#2,3:420\n13402#3,2:423\n*S KotlinDebug\n*F\n+ 1 DialSourceUtils.kt\ncom/xiaomi/fitness/watch/face/edit/utils/DialSourceUtilsKt\n*L\n175#1:419\n175#1:420,3\n210#1:423,2\n*E\n"})
public final class DialSourceUtilsKt {

    @NotNull
    public static final String TAG = "DialSource";

    @NotNull
    public static final Number getDataItemPointerValueDefault(@Nullable String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -2077716911) {
                if (iHashCode != 611243841) {
                    if (iHashCode == 778991009 && str.equals(Source.TIME_SECOND)) {
                        return 24;
                    }
                } else if (str.equals(Source.TIME_MINUTE)) {
                    return 9;
                }
            } else if (str.equals(Source.TIME_HOUR)) {
                return Double.valueOf(10.15d);
            }
        }
        try {
            return getSourceDefaultValue(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    @NotNull
    public static final Integer[] getImageNumberDefaultArray(@Nullable String str, int i, boolean z, boolean z2) {
        Number sourceDefaultValue = getSourceDefaultValue(str);
        List<Object> listNumberValueAnyList = numberValueAnyList(sourceDefaultValue);
        int size = (i <= 0 ? 1 : i) - listNumberValueAnyList.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                if (z) {
                    listNumberValueAnyList.add(Intrinsics.areEqual(CollectionsKt___CollectionsKt.first((List) listNumberValueAnyList), "-") ? 1 : 0, 0);
                } else if (z2) {
                    listNumberValueAnyList.add(0);
                }
            }
        } else if (size < 0) {
            List listSubList = CollectionsKt___CollectionsKt.toList(listNumberValueAnyList).subList(0, i);
            listNumberValueAnyList.clear();
            listNumberValueAnyList.addAll(listSubList);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listNumberValueAnyList) {
            if (obj instanceof Integer) {
                arrayList.add(obj);
            } else if (Intrinsics.areEqual(obj, "-")) {
                arrayList.add(10);
            } else if (Intrinsics.areEqual(obj, ".")) {
                arrayList.add(11);
            }
        }
        Logger.d(TAG, "getImageNumberDefaultArray source " + str + ";value " + sourceDefaultValue + ";list " + arrayList);
        return (Integer[]) arrayList.toArray(new Integer[0]);
    }

    public static /* synthetic */ Integer[] getImageNumberDefaultArray$default(String str, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        return getImageNumberDefaultArray(str, i, z, z2);
    }

    @Nullable
    public static final List<Image> getImageNumberFileList(@NotNull Integer[] indexArray, @Nullable List<Image> list, @Nullable Image image) {
        Intrinsics.checkNotNullParameter(indexArray, "indexArray");
        List<Image> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : indexArray) {
            int iIntValue = num.intValue();
            if (iIntValue < 0 || iIntValue >= list2.size()) {
                arrayList.add(list.get(0));
            } else {
                arrayList.add(list.get(iIntValue));
            }
        }
        if (image != null) {
            arrayList.add(image);
        }
        return arrayList;
    }

    @NotNull
    public static final Number getSourceDefaultValue(@Nullable String str) {
        String str2;
        String str3;
        if (str == null) {
            return 0;
        }
        int iHashCode = str.hashCode();
        switch (iHashCode) {
            case -2077716911:
                return !str.equals(Source.TIME_HOUR) ? 0 : 9;
            case -2062506835:
                str2 = Source.SYSTEM_STATUS_BLUETOOTH;
                str.equals(str2);
                return 0;
            case -1991092535:
                return !str.equals(Source.WEATHER_TOMORROW_TEMPERATURE_MAX) ? 0 : 28;
            case -1991092297:
                return !str.equals(Source.WEATHER_TOMORROW_TEMPERATURE_MIN) ? 0 : 23;
            case -1926644094:
                return !str.equals(Source.DATE_MONTH_LOW) ? 0 : 8;
            case -1900963563:
                str2 = Source.SYSTEM_STATUS_CHARGE;
                str.equals(str2);
                return 0;
            case -1838949457:
                return !str.equals(Source.WEATHER_CURRENT_SUN_SET_MINUTE) ? 0 : 14;
            case -1827839112:
                if (!str.equals(Source.DATE_LUNA_MONTH)) {
                    return 0;
                }
                return 8;
            case -1776760758:
                return !str.equals(Source.WEATHER_CURRENT_PRESSURE) ? 0 : 1013;
            case -1742578172:
                return !str.equals(Source.MISC_DATE_YESTERDAY) ? 0 : 15;
            case -1675367782:
                return !str.equals(Source.HEALTH_HEART_RATE_MAX) ? 0 : 100;
            case -1675367544:
                return !str.equals(Source.HEALTH_HEART_RATE_MIN) ? 0 : 60;
            case -1658255552:
                return !str.equals(Source.HEALTH_BLOOD_PRESSURE_SYSTOLIC) ? 0 : 120;
            case -1652822064:
                return !str.equals(Source.DATE_DAY_HIGH) ? 0 : 1;
            case -1547409033:
                return !str.equals(Source.HEALTH_SLEEP_SCORE) ? 0 : 80;
            case -1463973148:
                return !str.equals(Source.APP_ALARM_MINUTE) ? 0 : 30;
            case -1286557361:
                return !str.equals(Source.WEATHER_CURRENT_WEATHER) ? 0 : 1;
            case -1282425447:
                return !str.equals(Source.HEALTH_SLEEP_TARGET_PROGRESS) ? 0 : 90;
            case -1272128720:
                return !str.equals(Source.HEALTH_MISC_RUN_POWER_INDEX) ? 0 : 63;
            case -1257559553:
                if (str.equals(Source.WEATHER_TOMORROW_TEMPERATURE_FAHRENHEIT_MAX)) {
                    return Double.valueOf(82.4d);
                }
                return 0;
            case -1222527518:
                return !str.equals(Source.MISC_IS_AM) ? 0 : 1;
            case -1222527053:
                str3 = Source.MISC_IS_PM;
                str.equals(str3);
                return 0;
            case -1211973977:
                return !str.equals(Source.HEALTH_STEP_COUNT) ? 0 : 2560;
            case -1200530472:
                return !str.equals(Source.WEATHER_CURRENT_AIR_QUALITY_INDEX) ? 0 : 24;
            case -1198010742:
                str3 = Source.WEATHER_CURRENT_AIR_QUALITY_LEVEL;
                str.equals(str3);
                return 0;
            case -1180854560:
                if (!str.equals(Source.HEALTH_CALORIE_VALUE)) {
                    return 0;
                }
                return 162;
            case -1095991213:
                return !str.equals(Source.TIME_MINUTE_LOW) ? 0 : 8;
            case -1094245905:
                return !str.equals(Source.SYSTEM_SENSOR_FUSION_ALTITUDE) ? 0 : 83;
            case -1054142749:
                str2 = Source.TIME_SECOND_HIGH;
                str.equals(str2);
                return 0;
            case -836615784:
                str2 = Source.SYSTEM_STATUS_SCREEN_LOCK;
                str.equals(str2);
                return 0;
            case -751351739:
                if (!str.equals(Source.DATE_LUNA_YEAR)) {
                    return 0;
                }
                return Integer.valueOf(GLMapStaticValue.MAP_PARAMETERNAME_CLEAR_INDOORBUILDING_LAST);
            case -676965756:
                str3 = Source.WEATHER_CURRENT_TEMPERATURE_UNIT;
                str.equals(str3);
                return 0;
            case -605530560:
                if (str.equals(Source.HEALTH_STEP_KILO_METER)) {
                    return Double.valueOf(1.6d);
                }
                return 0;
            case -585369116:
                return !str.equals(Source.WEATHER_CURRENT_CHANCE_OF_RAIN) ? 0 : 30;
            case -476308731:
                return !str.equals(Source.HEALTH_EXERCISE_TARGET) ? 0 : 10;
            case -430573174:
                return !str.equals(Source.HEALTH_MISC_RECOVERY_TIME) ? 0 : 1;
            case -396393162:
                return !str.equals(Source.HEALTH_HEART_RATE_ZONE) ? 0 : 3;
            case -280970406:
                return !str.equals(Source.HEALTH_BLOOD_PRESSURE_DIASTOLIC) ? 0 : 80;
            case -265625742:
                if (!str.equals(Source.DATE_MONTH)) {
                    return 0;
                }
                return 8;
            case -72544112:
                return !str.equals(Source.WEATHER_CURRENT_SUN_RISE) ? 0 : 5;
            case -71112769:
                return !str.equals(Source.MISC_DATE_TOMORROW) ? 0 : 17;
            case -47661664:
                str3 = Source.WEATHER_CURRENT_DRESS_INDEX;
                str.equals(str3);
                return 0;
            case -19933633:
                return !str.equals(Source.WEATHER_CURRENT_SUN_SET_HOUR) ? 0 : 19;
            case 26410245:
                return !str.equals(Source.WEATHER_CURRENT_TEMPERATURE_FAHRENHEIT) ? 0 : 77;
            case 47509176:
                return !str.equals(Source.WEATHER_CURRENT_HUMIDITY) ? 0 : 50;
            case 85234534:
                return !str.equals(Source.DATE_DAY_LOW) ? 0 : 6;
            case 97079187:
                str3 = Source.TIME_HOUR_HIGH;
                str.equals(str3);
                return 0;
            case 129369036:
                return !str.equals(Source.SYSTEM_STATUS_BATTERY) ? 0 : 80;
            case 129952460:
                return !str.equals(Source.MISC_TIME_SECTION) ? 0 : 3;
            case 278751752:
                return !str.equals(Source.HEALTH_EXERCISE_DURATION) ? 0 : 8;
            case 285775507:
                return !str.equals(Source.WEATHER_TODAY_TEMPERATURE_FAHRENHEIT_MAX) ? 0 : 77;
            case 322447505:
                return !str.equals(Source.HEALTH_PRESSURE_INDEX) ? 0 : 60;
            case 383885443:
                return !str.equals(Source.TIME_MINUTE_HIGH) ? 0 : 2;
            case 403449908:
                str3 = Source.DATE_MONTH_HIGH;
                str.equals(str3);
                return 0;
            case 404778375:
                str3 = Source.HEALTH_BLOOD_PRESSURE_UNIT;
                str.equals(str3);
                return 0;
            case 469496748:
                str2 = Source.TIME_CENTI_SECOND_LOW;
                str.equals(str2);
                return 0;
            case 499526454:
                return !str.equals(Source.HEALTH_MISC_TODAY_VITALITY) ? 0 : 72;
            case 564746605:
                if (str.equals(Source.WEATHER_TOMORROW_TEMPERATURE_FAHRENHEIT_MIN)) {
                    return Double.valueOf(73.4d);
                }
                return 0;
            case 611243841:
                return !str.equals(Source.TIME_MINUTE) ? 0 : 28;
            case 756337488:
                return !str.equals(Source.MISC_IS_24) ? 0 : 1;
            case 778991009:
                str2 = Source.TIME_SECOND;
                str.equals(str2);
                return 0;
            case 781618220:
                return !str.equals(Source.WEATHER_CURRENT_UV_INDEX) ? 0 : 10;
            case 784137950:
                str3 = Source.WEATHER_CURRENT_UV_LEVEL;
                str.equals(str3);
                return 0;
            case 877500199:
                return !str.equals(Source.HEALTH_STAND_PROGRESS) ? 0 : 80;
            case 916337371:
                return !str.equals(Source.HEALTH_BLOOD_PRESSURE_SYSTOLIC_KPA) ? 0 : 16;
            case 952020061:
                return !str.equals(Source.WEATHER_TODAY_TEMPERATURE_MAX) ? 0 : 28;
            case 952020299:
                return !str.equals(Source.WEATHER_TODAY_TEMPERATURE_MIN) ? 0 : 20;
            case 967492027:
                return !str.equals(Source.WEATHER_CURRENT_SUN_SET) ? 0 : 17;
            case 986042036:
                return !str.equals(Source.APP_ALARM_HOUR) ? 0 : 7;
            case 1005041180:
                return !str.equals(Source.HEALTH_OXYGEN_SPO2) ? 0 : 98;
            case 1186247316:
                return !str.equals(Source.WEATHER_CURRENT_SUN_RISE_HOUR) ? 0 : 6;
            case 1212925427:
                str2 = Source.TIME_SECOND_LOW;
                str.equals(str2);
                return 0;
            case 1244351893:
                return !str.equals(Source.HEALTH_STEP_PROGRESS) ? 0 : 80;
            case 1263421878:
                str2 = Source.SYSTEM_STATUS_WIFI;
                str.equals(str2);
                return 0;
            case 1269685921:
                return !str.equals(Source.HEALTH_EXERCISE_PROGRESS) ? 0 : 80;
            case 1314819345:
                if (!str.equals(Source.HEALTH_CALORIE)) {
                    return 0;
                }
                return 162;
            case 1324692373:
                return !str.equals(Source.WEATHER_CURRENT_TEMPERATURE_FEEL) ? 0 : 25;
            case 1404054598:
                str3 = Source.WEATHER_CURRENT_WIND_ANGLE;
                str.equals(str3);
                return 0;
            case 1404845323:
                return !str.equals(Source.HEALTH_STAND_TARGET) ? 0 : 10;
            case 1413959415:
                return !str.equals(Source.WEATHER_CURRENT_WIND_LEVEL) ? 0 : 2;
            case 1420735418:
                if (str.equals(Source.WEATHER_CURRENT_WIND_SPEED)) {
                    return Double.valueOf(3.6d);
                }
                return 0;
            case 1443288334:
                if (!str.equals(Source.DATE_DAY)) {
                    return 0;
                }
                return 16;
            case 1482082952:
                str2 = Source.TIME_CENTI_SECOND;
                str.equals(str2);
                return 0;
            case 1504647503:
                return !str.equals(Source.WEATHER_CURRENT_TEMPERATURE) ? 0 : 25;
            case 1527302514:
                return !str.equals(Source.WEATHER_CURRENT_WIND_DIRECTION) ? 0 : 2;
            case 1557182201:
                return !str.equals(Source.HEALTH_STEP_TARGET) ? 0 : 3200;
            case 1638310548:
                if (!str.equals(Source.DATE_LUNA_DAY)) {
                    return 0;
                }
                return 16;
            case 1648104030:
                return !str.equals(Source.HEALTH_CALORIE_PROGRESS) ? 0 : 80;
            case 1669219667:
                return !str.equals(Source.HEALTH_MISC_SEVEN_DAYS_VITALITY) ? 0 : 490;
            case 1669371978:
                str2 = Source.TIME_CENTI_SECOND_HIGH;
                str.equals(str2);
                return 0;
            case 1792834754:
                return !str.equals(Source.DATE_WEEK) ? 0 : 2;
            case 1792894219:
                if (!str.equals(Source.DATE_YEAR)) {
                    return 0;
                }
                return Integer.valueOf(GLMapStaticValue.MAP_PARAMETERNAME_CLEAR_INDOORBUILDING_LAST);
            case 1804223062:
                return !str.equals(Source.TIME_HOUR_12H) ? 0 : 9;
            case 1804250947:
                return !str.equals(Source.TIME_HOUR_LOW) ? 0 : 9;
            case 1810037903:
                if (str.equals(Source.HEALTH_SLEEP_DURATION)) {
                    return Double.valueOf(7.2d);
                }
                return 0;
            case 1831153237:
                return !str.equals(Source.HEALTH_STAND_COUNT) ? 0 : 8;
            case 1930597249:
                return !str.equals(Source.HEALTH_BLOOD_PRESSURE_DIASTOLIC_KPA) ? 0 : 10;
            case 1954739908:
                return !str.equals(Source.WEATHER_CURRENT_SUN_RISE_MINUTE) ? 0 : 1;
            case 1964385098:
                return !str.equals(Source.HEALTH_HEART_RATE) ? 0 : 78;
            case 1979492311:
                return !str.equals(Source.WEATHER_CURRENT_VISIBILITY) ? 0 : 15;
            case 1991121410:
                return !str.equals(Source.HEALTH_CALORIE_TARGET) ? 0 : 203;
            case 2108081665:
                return !str.equals(Source.WEATHER_TODAY_TEMPERATURE_FAHRENHEIT_MIN) ? 0 : 68;
            case 2132501438:
                str2 = Source.SYSTEM_STATUS_DISTURB;
                str.equals(str2);
                return 0;
            case 2147436921:
                if (str.equals(Source.HEALTH_BLOOD_SUGAR_VALUE)) {
                    return Double.valueOf(6.1d);
                }
                return 0;
            default:
                switch (iHashCode) {
                    case -1503409777:
                        if (!str.equals(Source.DATE_YEAR_DIGIT1)) {
                            return 0;
                        }
                        return 2;
                    case -1503409776:
                        if (!str.equals(Source.DATE_YEAR_DIGIT2)) {
                            return 0;
                        }
                        return 2;
                    case -1503409775:
                        str3 = Source.DATE_YEAR_DIGIT3;
                        str.equals(str3);
                        return 0;
                    case -1503409774:
                        if (!str.equals(Source.DATE_YEAR_DIGIT4)) {
                            return 0;
                        }
                        return 2;
                    default:
                        switch (iHashCode) {
                            case 980319787:
                                str3 = Source.HEALTH_STEP_COUNT_DIGIT1;
                                break;
                            case 980319788:
                                return !str.equals(Source.HEALTH_STEP_COUNT_DIGIT2) ? 0 : 6;
                            case 980319789:
                                return !str.equals(Source.HEALTH_STEP_COUNT_DIGIT3) ? 0 : 5;
                            case 980319790:
                                return !str.equals(Source.HEALTH_STEP_COUNT_DIGIT4) ? 0 : 2;
                            case 980319791:
                                str3 = Source.HEALTH_STEP_COUNT_DIGIT5;
                                break;
                            default:
                                return 0;
                        }
                        str.equals(str3);
                        return 0;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public static final String getTextDefaultString(@Nullable String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1810107464:
                    if (str.equals("dateMonthStringFullLowerEN")) {
                        return "august";
                    }
                    break;
                case -1764843416:
                    if (str.equals("dateWeekStringFullLowerEN")) {
                        return "tuesday";
                    }
                    break;
                case -1680078268:
                    if (str.equals("dateMonthStringShortCN")) {
                        return "8月";
                    }
                    break;
                case -1554432249:
                    if (str.equals("dateMonthStringFullPascalEN")) {
                        return "August";
                    }
                    break;
                case -357394830:
                    if (str.equals("dateMonthStringShortUpperEN")) {
                        return "AUG";
                    }
                    break;
                case -334179247:
                    if (str.equals("healthBloodSugarUpdateTsString")) {
                        return "5分钟";
                    }
                    break;
                case -151246761:
                    if (str.equals("dateWeekStringFullPascalEN")) {
                        return "Tuesday";
                    }
                    break;
                case 222842129:
                    if (str.equals("dateMonthStringShortLowerEN")) {
                        return "aug";
                    }
                    break;
                case 801553549:
                    if (str.equals("dateWeekStringFullCN")) {
                        return "星期二";
                    }
                    break;
                case 1045790658:
                    if (str.equals("dateWeekStringShortUpperEN")) {
                        return "TUE";
                    }
                    break;
                case 1337462990:
                    if (str.equals("dateMonthStringShortPascalEN")) {
                        return "Aug";
                    }
                    break;
                case 1626027617:
                    if (str.equals("dateWeekStringShortLowerEN")) {
                        return "tue";
                    }
                    break;
                case 1656786676:
                    if (str.equals("dateWeekStringShortCN")) {
                        return "周二";
                    }
                    break;
                case 1886540158:
                    if (str.equals("dateWeekStringShortPascalEN")) {
                        return "Tue";
                    }
                    break;
                case 1904622873:
                    if (str.equals("dateMonthStringFullUpperEN")) {
                        return "AUGUST";
                    }
                    break;
                case 1949886921:
                    if (str.equals("dateWeekStringFullUpperEN")) {
                        return "TUESDAY";
                    }
                    break;
            }
        }
        return "";
    }

    @NotNull
    public static final List<Integer> intArray(int i) {
        char[] charArray = String.valueOf(i).toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        int length = charArray.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = Integer.parseInt(String.valueOf(charArray[i2]));
        }
        return ArraysKt___ArraysKt.toList(iArr);
    }

    private static final List<Object> numberValueAnyList(Number number) {
        Object objValueOf;
        char[] charArray = number.toString().toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        ArrayList arrayList = new ArrayList();
        for (char c : charArray) {
            try {
                objValueOf = Integer.valueOf(Integer.parseInt(String.valueOf(c)));
            } catch (Exception e) {
                Logger.d(TAG, "exception " + e);
                objValueOf = null;
            }
            if (objValueOf == null) {
                objValueOf = String.valueOf(c);
            }
            arrayList.add(objValueOf);
        }
        return arrayList;
    }
}
