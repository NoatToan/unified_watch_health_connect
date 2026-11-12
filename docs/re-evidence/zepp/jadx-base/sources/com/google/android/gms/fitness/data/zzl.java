package com.google.android.gms.fitness.data;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.xiaomi.hm.health.bt.model.HMDisplaySetting;
import com.xiaomi.hm.health.bt.profile.milipro.MiLiProProfile;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
public final class zzl {
    private static final Set<DataType> a = Collections.unmodifiableSet(new HashSet(Arrays.asList(DataType.TYPE_MOVE_MINUTES, DataType.AGGREGATE_MOVE_MINUTES, DataType.TYPE_WORKOUT_EXERCISE, DataType.zzmj, DataType.TYPE_ACTIVITY_SEGMENT, DataType.AGGREGATE_ACTIVITY_SUMMARY, HealthDataTypes.TYPE_BLOOD_GLUCOSE, HealthDataTypes.AGGREGATE_BLOOD_GLUCOSE_SUMMARY, HealthDataTypes.TYPE_BLOOD_PRESSURE, HealthDataTypes.AGGREGATE_BLOOD_PRESSURE_SUMMARY, DataType.TYPE_BODY_FAT_PERCENTAGE, DataType.AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY, HealthDataTypes.TYPE_BODY_TEMPERATURE, HealthDataTypes.TYPE_BASAL_BODY_TEMPERATURE, HealthDataTypes.AGGREGATE_BASAL_BODY_TEMPERATURE_SUMMARY, HealthDataTypes.AGGREGATE_BODY_TEMPERATURE_SUMMARY, DataType.TYPE_BASAL_METABOLIC_RATE, DataType.AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY, DataType.zzmk, DataType.zzml, DataType.TYPE_CALORIES_EXPENDED, DataType.AGGREGATE_CALORIES_EXPENDED, HealthDataTypes.TYPE_CERVICAL_MUCUS, HealthDataTypes.TYPE_CERVICAL_POSITION, DataType.TYPE_CYCLING_PEDALING_CADENCE, DataType.TYPE_CYCLING_PEDALING_CUMULATIVE, DataType.TYPE_CYCLING_WHEEL_REVOLUTION, DataType.TYPE_CYCLING_WHEEL_RPM, DataType.zzmh, DataType.zzmg, DataType.TYPE_DISTANCE_DELTA, DataType.AGGREGATE_DISTANCE_DELTA, DataType.TYPE_HEART_POINTS, DataType.AGGREGATE_HEART_POINTS, DataType.TYPE_HEART_RATE_BPM, DataType.AGGREGATE_HEART_RATE_SUMMARY, DataType.TYPE_HEIGHT, DataType.AGGREGATE_HEIGHT_SUMMARY, DataType.TYPE_HYDRATION, DataType.AGGREGATE_HYDRATION, DataType.zzmd, DataType.zzmi, DataType.zzmm, DataType.zzmn, DataType.AGGREGATE_LOCATION_BOUNDING_BOX, DataType.TYPE_LOCATION_SAMPLE, DataType.TYPE_LOCATION_TRACK, HealthDataTypes.TYPE_MENSTRUATION, DataType.TYPE_NUTRITION, DataType.AGGREGATE_NUTRITION_SUMMARY, HealthDataTypes.TYPE_OVULATION_TEST, HealthDataTypes.TYPE_OXYGEN_SATURATION, HealthDataTypes.AGGREGATE_OXYGEN_SATURATION_SUMMARY, DataType.TYPE_POWER_SAMPLE, DataType.AGGREGATE_POWER_SUMMARY, DataType.zzmf, DataType.zzme, DataType.TYPE_SLEEP_SEGMENT, DataType.TYPE_SPEED, DataType.AGGREGATE_SPEED_SUMMARY, DataType.TYPE_STEP_COUNT_CADENCE, DataType.TYPE_STEP_COUNT_CUMULATIVE, DataType.TYPE_STEP_COUNT_DELTA, DataType.AGGREGATE_STEP_COUNT_DELTA, HealthDataTypes.TYPE_VAGINAL_SPOTTING, DataType.TYPE_WEIGHT, DataType.AGGREGATE_WEIGHT_SUMMARY)));

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public static DataType zzb(String str) {
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
            case -2060095039:
                if (str.equals("com.google.cycling.wheel_revolution.rpm")) {
                    b = 0;
                }
                break;
            case -2032495331:
                if (str.equals("com.google.respiratory_rate")) {
                    b = 1;
                }
                break;
            case -2027664088:
                if (str.equals("com.google.calories.consumed")) {
                    b = 2;
                }
                break;
            case -2023954015:
                if (str.equals("com.google.location.bounding_box")) {
                    b = 3;
                }
                break;
            case -1999891138:
                if (str.equals("com.google.heart_minutes")) {
                    b = 4;
                }
                break;
            case -1939429191:
                if (str.equals("com.google.blood_glucose.summary")) {
                    b = 5;
                }
                break;
            case -1757812901:
                if (str.equals("com.google.location.sample")) {
                    b = 6;
                }
                break;
            case -1659958877:
                if (str.equals("com.google.menstruation")) {
                    b = 7;
                }
                break;
            case -1487055015:
                if (str.equals("com.google.body.temperature.basal.summary")) {
                    b = 8;
                }
                break;
            case -1465729060:
                if (str.equals("com.google.internal.primary_device")) {
                    b = 9;
                }
                break;
            case -1431431801:
                if (str.equals("com.google.height.summary")) {
                    b = 10;
                }
                break;
            case -1416335448:
                if (str.equals("com.google.internal.sleep_schedule")) {
                    b = 11;
                }
                break;
            case -1248818137:
                if (str.equals("com.google.distance.delta")) {
                    b = 12;
                }
                break;
            case -1103712522:
                if (str.equals("com.google.heart_minutes.summary")) {
                    b = 13;
                }
                break;
            case -1102520626:
                if (str.equals("com.google.step_count.delta")) {
                    b = 14;
                }
                break;
            case -1091068721:
                if (str.equals("com.google.height")) {
                    b = 15;
                }
                break;
            case -922976890:
                if (str.equals("com.google.cycling.pedaling.cumulative")) {
                    b = 16;
                }
                break;
            case -900592674:
                if (str.equals("com.google.cycling.pedaling.cadence")) {
                    b = 17;
                }
                break;
            case -886569606:
                if (str.equals("com.google.location.track")) {
                    b = 18;
                }
                break;
            case -777285735:
                if (str.equals("com.google.heart_rate.summary")) {
                    b = 19;
                }
                break;
            case -700668164:
                if (str.equals("com.google.internal.goal")) {
                    b = 20;
                }
                break;
            case -661631456:
                if (str.equals("com.google.weight")) {
                    b = 21;
                }
                break;
            case -424876584:
                if (str.equals("com.google.weight.summary")) {
                    b = 22;
                }
                break;
            case -362418992:
                if (str.equals("com.google.body.temperature")) {
                    b = 23;
                }
                break;
            case -316596620:
                if (str.equals("com.google.sleep.segment")) {
                    b = 24;
                }
                break;
            case -217611775:
                if (str.equals("com.google.blood_glucose")) {
                    b = 25;
                }
                break;
            case -185830635:
                if (str.equals("com.google.power.summary")) {
                    b = 26;
                }
                break;
            case -177293656:
                if (str.equals("com.google.nutrition.summary")) {
                    b = 27;
                }
                break;
            case -164586193:
                if (str.equals("com.google.activity.exercise")) {
                    b = 28;
                }
                break;
            case -98150574:
                if (str.equals("com.google.heart_rate.bpm")) {
                    b = 29;
                }
                break;
            case -56824761:
                if (str.equals("com.google.calories.bmr")) {
                    b = 30;
                }
                break;
            case 53773386:
                if (str.equals("com.google.blood_pressure.summary")) {
                    b = 31;
                }
                break;
            case 269180370:
                if (str.equals("com.google.activity.samples")) {
                    b = 32;
                }
                break;
            case 295793957:
                if (str.equals("com.google.sensor.events")) {
                    b = 33;
                }
                break;
            case 296250623:
                if (str.equals("com.google.calories.bmr.summary")) {
                    b = HMDisplaySetting.TYPE_HAWK_SWK;
                }
                break;
            case 324760871:
                if (str.equals("com.google.step_count.cadence")) {
                    b = 35;
                }
                break;
            case 378060028:
                if (str.equals("com.google.activity.segment")) {
                    b = 36;
                }
                break;
            case 529727579:
                if (str.equals("com.google.power.sample")) {
                    b = 37;
                }
                break;
            case 657433501:
                if (str.equals("com.google.step_count.cumulative")) {
                    b = 38;
                }
                break;
            case 682891187:
                if (str.equals("com.google.body.fat.percentage")) {
                    b = 39;
                }
                break;
            case 841663855:
                if (str.equals("com.google.activity.summary")) {
                    b = 40;
                }
                break;
            case 877955159:
                if (str.equals("com.google.speed.summary")) {
                    b = 41;
                }
                break;
            case 899666941:
                if (str.equals("com.google.calories.expended")) {
                    b = 42;
                }
                break;
            case 936279698:
                if (str.equals("com.google.blood_pressure")) {
                    b = 43;
                }
                break;
            case 946706510:
                if (str.equals("com.google.hydration")) {
                    b = 44;
                }
                break;
            case 1029221057:
                if (str.equals("com.google.device_on_body")) {
                    b = 45;
                }
                break;
            case 1111714923:
                if (str.equals("com.google.body.fat.percentage.summary")) {
                    b = 46;
                }
                break;
            case 1214093899:
                if (str.equals("com.google.vaginal_spotting")) {
                    b = 47;
                }
                break;
            case 1404118825:
                if (str.equals("com.google.oxygen_saturation")) {
                    b = 48;
                }
                break;
            case 1439932546:
                if (str.equals("com.google.ovulation_test")) {
                    b = HMDisplaySetting.TYPE_OSPREY_W;
                }
                break;
            case 1483133089:
                if (str.equals("com.google.body.temperature.basal")) {
                    b = 50;
                }
                break;
            case 1498973736:
                if (str.equals("com.google.internal.sleep_attributes")) {
                    b = HMDisplaySetting.TYPE_VENICE;
                }
                break;
            case 1524007137:
                if (str.equals("com.google.cycling.wheel_revolution.cumulative")) {
                    b = 52;
                }
                break;
            case 1532018766:
                if (str.equals("com.google.active_minutes")) {
                    b = 53;
                }
                break;
            case 1633152752:
                if (str.equals("com.google.nutrition")) {
                    b = 54;
                }
                break;
            case 1921738212:
                if (str.equals("com.google.distance.cumulative")) {
                    b = 55;
                }
                break;
            case 1925848149:
                if (str.equals("com.google.cervical_position")) {
                    b = 56;
                }
                break;
            case 1975902189:
                if (str.equals("com.google.cervical_mucus")) {
                    b = 57;
                }
                break;
            case 2051843553:
                if (str.equals("com.google.oxygen_saturation.summary")) {
                    b = 58;
                }
                break;
            case 2053496735:
                if (str.equals("com.google.speed")) {
                    b = MiLiProProfile.ECF_WRITE_PAI_DATA;
                }
                break;
            case 2131809416:
                if (str.equals("com.google.body.temperature.summary")) {
                    b = MiLiProProfile.ECF_COMMAND_SET_BEEP;
                }
                break;
        }
        switch (b) {
            case 0:
                return DataType.TYPE_CYCLING_WHEEL_RPM;
            case 1:
                return DataType.zzmf;
            case 2:
                return DataType.zzmk;
            case 3:
                return DataType.AGGREGATE_LOCATION_BOUNDING_BOX;
            case 4:
                return DataType.TYPE_HEART_POINTS;
            case 5:
                return HealthDataTypes.AGGREGATE_BLOOD_GLUCOSE_SUMMARY;
            case 6:
                return DataType.TYPE_LOCATION_SAMPLE;
            case 7:
                return HealthDataTypes.TYPE_MENSTRUATION;
            case 8:
                return HealthDataTypes.AGGREGATE_BASAL_BODY_TEMPERATURE_SUMMARY;
            case 9:
                return DataType.zzmi;
            case 10:
                return DataType.AGGREGATE_HEIGHT_SUMMARY;
            case 11:
                return DataType.zzmn;
            case 12:
                return DataType.TYPE_DISTANCE_DELTA;
            case 13:
                return DataType.AGGREGATE_HEART_POINTS;
            case 14:
                return DataType.TYPE_STEP_COUNT_DELTA;
            case 15:
                return DataType.TYPE_HEIGHT;
            case 16:
                return DataType.TYPE_CYCLING_PEDALING_CUMULATIVE;
            case 17:
                return DataType.TYPE_CYCLING_PEDALING_CADENCE;
            case 18:
                return DataType.TYPE_LOCATION_TRACK;
            case 19:
                return DataType.AGGREGATE_HEART_RATE_SUMMARY;
            case 20:
                return DataType.zzmd;
            case 21:
                return DataType.TYPE_WEIGHT;
            case 22:
                return DataType.AGGREGATE_WEIGHT_SUMMARY;
            case 23:
                return HealthDataTypes.TYPE_BODY_TEMPERATURE;
            case 24:
                return DataType.TYPE_SLEEP_SEGMENT;
            case 25:
                return HealthDataTypes.TYPE_BLOOD_GLUCOSE;
            case 26:
                return DataType.AGGREGATE_POWER_SUMMARY;
            case 27:
                return DataType.AGGREGATE_NUTRITION_SUMMARY;
            case 28:
                return DataType.TYPE_WORKOUT_EXERCISE;
            case 29:
                return DataType.TYPE_HEART_RATE_BPM;
            case 30:
                return DataType.TYPE_BASAL_METABOLIC_RATE;
            case 31:
                return HealthDataTypes.AGGREGATE_BLOOD_PRESSURE_SUMMARY;
            case 32:
                return DataType.zzmj;
            case 33:
                return DataType.zzme;
            case 34:
                return DataType.AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY;
            case 35:
                return DataType.TYPE_STEP_COUNT_CADENCE;
            case 36:
                return DataType.TYPE_ACTIVITY_SEGMENT;
            case 37:
                return DataType.TYPE_POWER_SAMPLE;
            case 38:
                return DataType.TYPE_STEP_COUNT_CUMULATIVE;
            case 39:
                return DataType.TYPE_BODY_FAT_PERCENTAGE;
            case 40:
                return DataType.AGGREGATE_ACTIVITY_SUMMARY;
            case 41:
                return DataType.AGGREGATE_SPEED_SUMMARY;
            case 42:
                return DataType.TYPE_CALORIES_EXPENDED;
            case 43:
                return HealthDataTypes.TYPE_BLOOD_PRESSURE;
            case 44:
                return DataType.TYPE_HYDRATION;
            case 45:
                return DataType.zzmh;
            case 46:
                return DataType.AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY;
            case 47:
                return HealthDataTypes.TYPE_VAGINAL_SPOTTING;
            case 48:
                return HealthDataTypes.TYPE_OXYGEN_SATURATION;
            case 49:
                return HealthDataTypes.TYPE_OVULATION_TEST;
            case 50:
                return HealthDataTypes.TYPE_BASAL_BODY_TEMPERATURE;
            case 51:
                return DataType.zzmm;
            case 52:
                return DataType.TYPE_CYCLING_WHEEL_REVOLUTION;
            case 53:
                return DataType.TYPE_MOVE_MINUTES;
            case 54:
                return DataType.TYPE_NUTRITION;
            case 55:
                return DataType.zzmg;
            case 56:
                return HealthDataTypes.TYPE_CERVICAL_POSITION;
            case 57:
                return HealthDataTypes.TYPE_CERVICAL_MUCUS;
            case 58:
                return HealthDataTypes.AGGREGATE_OXYGEN_SATURATION_SUMMARY;
            case 59:
                return DataType.TYPE_SPEED;
            case 60:
                return HealthDataTypes.AGGREGATE_BODY_TEMPERATURE_SUMMARY;
            default:
                return null;
        }
    }
}
