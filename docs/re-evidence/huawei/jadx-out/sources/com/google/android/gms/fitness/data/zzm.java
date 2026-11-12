package com.google.android.gms.fitness.data;

import com.google.common.base.Ascii;
import com.huawei.hms.network.okhttp.PublicSuffixDatabase;
import okio.Utf8;

/* JADX INFO: loaded from: classes4.dex */
public final class zzm {
    private static final DataType[] zzbx = {DataType.zzbi, DataType.TYPE_WORKOUT_EXERCISE, DataType.TYPE_MOVE_MINUTES, DataType.TYPE_ACTIVITY_SAMPLE, DataType.TYPE_ACTIVITY_SAMPLES, DataType.TYPE_ACTIVITY_SEGMENT, DataType.AGGREGATE_ACTIVITY_SUMMARY, HealthDataTypes.TYPE_BASAL_BODY_TEMPERATURE, HealthDataTypes.AGGREGATE_BASAL_BODY_TEMPERATURE_SUMMARY, HealthDataTypes.TYPE_BLOOD_GLUCOSE, HealthDataTypes.AGGREGATE_BLOOD_GLUCOSE_SUMMARY, HealthDataTypes.TYPE_BLOOD_PRESSURE, HealthDataTypes.AGGREGATE_BLOOD_PRESSURE_SUMMARY, DataType.TYPE_BODY_FAT_PERCENTAGE, DataType.AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY, DataType.zzbm, DataType.zzbq, HealthDataTypes.TYPE_BODY_TEMPERATURE, HealthDataTypes.AGGREGATE_BODY_TEMPERATURE_SUMMARY, DataType.zzbl, DataType.zzbr, DataType.TYPE_BASAL_METABOLIC_RATE, DataType.AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY, DataType.TYPE_CALORIES_CONSUMED, DataType.TYPE_CALORIES_EXPENDED, HealthDataTypes.TYPE_CERVICAL_MUCUS, HealthDataTypes.TYPE_CERVICAL_POSITION, DataType.TYPE_CYCLING_PEDALING_CADENCE, DataType.TYPE_CYCLING_PEDALING_CUMULATIVE, DataType.TYPE_CYCLING_WHEEL_REVOLUTION, DataType.TYPE_CYCLING_WHEEL_RPM, DataType.TYPE_DISTANCE_CUMULATIVE, DataType.TYPE_DISTANCE_DELTA, DataType.zzbh, DataType.zzbp, DataType.zzbd, DataType.zzbe, DataType.zzbf, DataType.TYPE_HEART_POINTS, DataType.AGGREGATE_HEART_POINTS, DataType.TYPE_HEART_RATE_BPM, DataType.AGGREGATE_HEART_RATE_SUMMARY, DataType.TYPE_HEIGHT, DataType.AGGREGATE_HEIGHT_SUMMARY, DataType.AGGREGATE_LOCATION_BOUNDING_BOX, DataType.TYPE_LOCATION_SAMPLE, DataType.TYPE_LOCATION_TRACK, HealthDataTypes.TYPE_MENSTRUATION, DataType.TYPE_NUTRITION, DataType.TYPE_HYDRATION, DataType.AGGREGATE_NUTRITION_SUMMARY, HealthDataTypes.TYPE_OVULATION_TEST, HealthDataTypes.TYPE_OXYGEN_SATURATION, HealthDataTypes.AGGREGATE_OXYGEN_SATURATION_SUMMARY, DataType.TYPE_POWER_SAMPLE, DataType.AGGREGATE_POWER_SUMMARY, DataType.zzbk, DataType.zzbj, DataType.TYPE_SPEED, DataType.AGGREGATE_SPEED_SUMMARY, DataType.TYPE_STEP_COUNT_CADENCE, DataType.zzbg, DataType.TYPE_STEP_COUNT_CUMULATIVE, DataType.TYPE_STEP_COUNT_DELTA, DataType.zzbc, HealthDataTypes.TYPE_VAGINAL_SPOTTING, DataType.TYPE_WEIGHT, DataType.AGGREGATE_WEIGHT_SUMMARY, DataType.zzbn, DataType.zzbo};
    private static final DataType[] zzby = {HealthDataTypes.TYPE_BASAL_BODY_TEMPERATURE, HealthDataTypes.AGGREGATE_BASAL_BODY_TEMPERATURE_SUMMARY, HealthDataTypes.TYPE_BLOOD_GLUCOSE, HealthDataTypes.AGGREGATE_BLOOD_GLUCOSE_SUMMARY, HealthDataTypes.TYPE_BLOOD_PRESSURE, HealthDataTypes.AGGREGATE_BLOOD_PRESSURE_SUMMARY, HealthDataTypes.TYPE_BODY_TEMPERATURE, HealthDataTypes.AGGREGATE_BODY_TEMPERATURE_SUMMARY, HealthDataTypes.TYPE_CERVICAL_MUCUS, HealthDataTypes.TYPE_CERVICAL_POSITION, HealthDataTypes.TYPE_MENSTRUATION, HealthDataTypes.TYPE_OVULATION_TEST, HealthDataTypes.TYPE_OXYGEN_SATURATION, HealthDataTypes.AGGREGATE_OXYGEN_SATURATION_SUMMARY, HealthDataTypes.TYPE_VAGINAL_SPOTTING};

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:293:0x03e4  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static DataType zzc(String str) {
        byte b2;
        str.hashCode();
        switch (str.hashCode()) {
            case -2060095039:
                if (!str.equals("com.google.cycling.wheel_revolution.rpm")) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case -2027664088:
                if (!str.equals("com.google.calories.consumed")) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case -2023954015:
                if (!str.equals("com.google.location.bounding_box")) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case -2001464928:
                if (!str.equals("com.google.internal.symptom")) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case -1999891138:
                if (!str.equals("com.google.heart_minutes")) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
            case -1939429191:
                if (!str.equals("com.google.blood_glucose.summary")) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            case -1783842905:
                if (!str.equals("com.google.accelerometer")) {
                    b2 = -1;
                } else {
                    b2 = 6;
                }
                break;
            case -1757812901:
                if (!str.equals("com.google.location.sample")) {
                    b2 = -1;
                } else {
                    b2 = 7;
                }
                break;
            case -1738991010:
                if (!str.equals("com.google.internal.prescription_event")) {
                    b2 = -1;
                } else {
                    b2 = 8;
                }
                break;
            case -1659958877:
                if (!str.equals("com.google.menstruation")) {
                    b2 = -1;
                } else {
                    b2 = 9;
                }
                break;
            case -1487055015:
                if (!str.equals("com.google.body.temperature.basal.summary")) {
                    b2 = -1;
                } else {
                    b2 = 10;
                }
                break;
            case -1466904157:
                if (!str.equals("com.google.floor_change.summary")) {
                    b2 = -1;
                } else {
                    b2 = 11;
                }
                break;
            case -1465729060:
                if (!str.equals("com.google.internal.primary_device")) {
                    b2 = -1;
                } else {
                    b2 = 12;
                }
                break;
            case -1431431801:
                if (!str.equals("com.google.height.summary")) {
                    b2 = -1;
                } else {
                    b2 = 13;
                }
                break;
            case -1248818137:
                if (!str.equals("com.google.distance.delta")) {
                    b2 = -1;
                } else {
                    b2 = 14;
                }
                break;
            case -1196687875:
                if (!str.equals("com.google.internal.session.v2")) {
                    b2 = -1;
                } else {
                    b2 = 15;
                }
                break;
            case -1103712522:
                if (!str.equals("com.google.heart_minutes.summary")) {
                    b2 = -1;
                } else {
                    b2 = 16;
                }
                break;
            case -1102520626:
                if (!str.equals("com.google.step_count.delta")) {
                    b2 = -1;
                } else {
                    b2 = 17;
                }
                break;
            case -1099695423:
                if (!str.equals("com.google.activity.sample")) {
                    b2 = -1;
                } else {
                    b2 = 18;
                }
                break;
            case -1091068721:
                if (!str.equals("com.google.height")) {
                    b2 = -1;
                } else {
                    b2 = 19;
                }
                break;
            case -1063046895:
                if (!str.equals("com.google.step_length")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.DC4;
                }
                break;
            case -922976890:
                if (!str.equals("com.google.cycling.pedaling.cumulative")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.NAK;
                }
                break;
            case -900592674:
                if (!str.equals("com.google.cycling.pedaling.cadence")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.SYN;
                }
                break;
            case -886569606:
                if (!str.equals("com.google.location.track")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.ETB;
                }
                break;
            case -777285735:
                if (!str.equals("com.google.heart_rate.summary")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.CAN;
                }
                break;
            case -700668164:
                if (!str.equals("com.google.internal.goal")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.EM;
                }
                break;
            case -661631456:
                if (!str.equals("com.google.weight")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.SUB;
                }
                break;
            case -424876584:
                if (!str.equals("com.google.weight.summary")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.ESC;
                }
                break;
            case -362418992:
                if (!str.equals("com.google.body.temperature")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.FS;
                }
                break;
            case -217611775:
                if (!str.equals("com.google.blood_glucose")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.GS;
                }
                break;
            case -185830635:
                if (!str.equals("com.google.power.summary")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.RS;
                }
                break;
            case -177293656:
                if (!str.equals("com.google.nutrition.summary")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.US;
                }
                break;
            case -164586193:
                if (!str.equals("com.google.activity.exercise")) {
                    b2 = -1;
                } else {
                    b2 = 32;
                }
                break;
            case -98150574:
                if (!str.equals("com.google.heart_rate.bpm")) {
                    b2 = -1;
                } else {
                    b2 = PublicSuffixDatabase.i;
                }
                break;
            case -56824761:
                if (!str.equals("com.google.calories.bmr")) {
                    b2 = -1;
                } else {
                    b2 = 34;
                }
                break;
            case -43729332:
                if (!str.equals("com.google.body.hip.circumference")) {
                    b2 = -1;
                } else {
                    b2 = 35;
                }
                break;
            case 2484093:
                if (!str.equals("com.google.body.waist.circumference")) {
                    b2 = -1;
                } else {
                    b2 = 36;
                }
                break;
            case 53773386:
                if (!str.equals("com.google.blood_pressure.summary")) {
                    b2 = -1;
                } else {
                    b2 = 37;
                }
                break;
            case 269180370:
                if (!str.equals("com.google.activity.samples")) {
                    b2 = -1;
                } else {
                    b2 = 38;
                }
                break;
            case 295793957:
                if (!str.equals("com.google.sensor.events")) {
                    b2 = -1;
                } else {
                    b2 = 39;
                }
                break;
            case 296250623:
                if (!str.equals("com.google.calories.bmr.summary")) {
                    b2 = -1;
                } else {
                    b2 = 40;
                }
                break;
            case 324760871:
                if (!str.equals("com.google.step_count.cadence")) {
                    b2 = -1;
                } else {
                    b2 = 41;
                }
                break;
            case 378060028:
                if (!str.equals("com.google.activity.segment")) {
                    b2 = -1;
                } else {
                    b2 = 42;
                }
                break;
            case 529727579:
                if (!str.equals("com.google.power.sample")) {
                    b2 = -1;
                } else {
                    b2 = 43;
                }
                break;
            case 634821360:
                if (!str.equals("com.google.sensor.const_rate_events")) {
                    b2 = -1;
                } else {
                    b2 = 44;
                }
                break;
            case 657433501:
                if (!str.equals("com.google.step_count.cumulative")) {
                    b2 = -1;
                } else {
                    b2 = 45;
                }
                break;
            case 682891187:
                if (!str.equals("com.google.body.fat.percentage")) {
                    b2 = -1;
                } else {
                    b2 = 46;
                }
                break;
            case 841663855:
                if (!str.equals("com.google.activity.summary")) {
                    b2 = -1;
                } else {
                    b2 = 47;
                }
                break;
            case 877955159:
                if (!str.equals("com.google.speed.summary")) {
                    b2 = -1;
                } else {
                    b2 = 48;
                }
                break;
            case 899666941:
                if (!str.equals("com.google.calories.expended")) {
                    b2 = -1;
                } else {
                    b2 = 49;
                }
                break;
            case 936279698:
                if (!str.equals("com.google.blood_pressure")) {
                    b2 = -1;
                } else {
                    b2 = 50;
                }
                break;
            case 946706510:
                if (!str.equals("com.google.hydration")) {
                    b2 = -1;
                } else {
                    b2 = 51;
                }
                break;
            case 946938859:
                if (!str.equals("com.google.stride_model")) {
                    b2 = -1;
                } else {
                    b2 = 52;
                }
                break;
            case 1029221057:
                if (!str.equals("com.google.device_on_body")) {
                    b2 = -1;
                } else {
                    b2 = 53;
                }
                break;
            case 1098265835:
                if (!str.equals("com.google.floor_change")) {
                    b2 = -1;
                } else {
                    b2 = 54;
                }
                break;
            case 1111714923:
                if (!str.equals("com.google.body.fat.percentage.summary")) {
                    b2 = -1;
                } else {
                    b2 = 55;
                }
                break;
            case 1214093899:
                if (!str.equals("com.google.vaginal_spotting")) {
                    b2 = -1;
                } else {
                    b2 = 56;
                }
                break;
            case 1404118825:
                if (!str.equals("com.google.oxygen_saturation")) {
                    b2 = -1;
                } else {
                    b2 = 57;
                }
                break;
            case 1439932546:
                if (!str.equals("com.google.ovulation_test")) {
                    b2 = -1;
                } else {
                    b2 = 58;
                }
                break;
            case 1483133089:
                if (!str.equals("com.google.body.temperature.basal")) {
                    b2 = -1;
                } else {
                    b2 = 59;
                }
                break;
            case 1524007137:
                if (!str.equals("com.google.cycling.wheel_revolution.cumulative")) {
                    b2 = -1;
                } else {
                    b2 = 60;
                }
                break;
            case 1532018766:
                if (!str.equals("com.google.active_minutes")) {
                    b2 = -1;
                } else {
                    b2 = 61;
                }
                break;
            case 1633152752:
                if (!str.equals("com.google.nutrition")) {
                    b2 = -1;
                } else {
                    b2 = 62;
                }
                break;
            case 1674865156:
                if (!str.equals("com.google.body.hip.circumference.summary")) {
                    b2 = -1;
                } else {
                    b2 = Utf8.REPLACEMENT_BYTE;
                }
                break;
            case 1819660853:
                if (!str.equals("com.google.body.waist.circumference.summary")) {
                    b2 = -1;
                } else {
                    b2 = 64;
                }
                break;
            case 1921738212:
                if (!str.equals("com.google.distance.cumulative")) {
                    b2 = -1;
                } else {
                    b2 = 65;
                }
                break;
            case 1925848149:
                if (!str.equals("com.google.cervical_position")) {
                    b2 = -1;
                } else {
                    b2 = 66;
                }
                break;
            case 1975902189:
                if (!str.equals("com.google.cervical_mucus")) {
                    b2 = -1;
                } else {
                    b2 = 67;
                }
                break;
            case 1980033842:
                if (!str.equals("com.google.internal.session.debug")) {
                    b2 = -1;
                } else {
                    b2 = 68;
                }
                break;
            case 2051843553:
                if (!str.equals("com.google.oxygen_saturation.summary")) {
                    b2 = -1;
                } else {
                    b2 = 69;
                }
                break;
            case 2053496735:
                if (!str.equals("com.google.speed")) {
                    b2 = -1;
                } else {
                    b2 = 70;
                }
                break;
            case 2131809416:
                if (!str.equals("com.google.body.temperature.summary")) {
                    b2 = -1;
                } else {
                    b2 = 71;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                return DataType.TYPE_CYCLING_WHEEL_RPM;
            case 1:
                return DataType.TYPE_CALORIES_CONSUMED;
            case 2:
                return DataType.AGGREGATE_LOCATION_BOUNDING_BOX;
            case 3:
                return DataType.zzbf;
            case 4:
                return DataType.TYPE_HEART_POINTS;
            case 5:
                return HealthDataTypes.AGGREGATE_BLOOD_GLUCOSE_SUMMARY;
            case 6:
                return DataType.zzbi;
            case 7:
                return DataType.TYPE_LOCATION_SAMPLE;
            case 8:
                return DataType.zzbe;
            case 9:
                return HealthDataTypes.TYPE_MENSTRUATION;
            case 10:
                return HealthDataTypes.AGGREGATE_BASAL_BODY_TEMPERATURE_SUMMARY;
            case 11:
                return DataType.zzbp;
            case 12:
                return DataType.zzbo;
            case 13:
                return DataType.AGGREGATE_HEIGHT_SUMMARY;
            case 14:
                return DataType.TYPE_DISTANCE_DELTA;
            case 15:
                return DataType.zza.zzbw;
            case 16:
                return DataType.AGGREGATE_HEART_POINTS;
            case 17:
                return DataType.TYPE_STEP_COUNT_DELTA;
            case 18:
                return DataType.TYPE_ACTIVITY_SAMPLE;
            case 19:
                return DataType.TYPE_HEIGHT;
            case 20:
                return DataType.zzbc;
            case 21:
                return DataType.TYPE_CYCLING_PEDALING_CUMULATIVE;
            case 22:
                return DataType.TYPE_CYCLING_PEDALING_CADENCE;
            case 23:
                return DataType.TYPE_LOCATION_TRACK;
            case 24:
                return DataType.AGGREGATE_HEART_RATE_SUMMARY;
            case 25:
                return DataType.zzbd;
            case 26:
                return DataType.TYPE_WEIGHT;
            case 27:
                return DataType.AGGREGATE_WEIGHT_SUMMARY;
            case 28:
                return HealthDataTypes.TYPE_BODY_TEMPERATURE;
            case 29:
                return HealthDataTypes.TYPE_BLOOD_GLUCOSE;
            case 30:
                return DataType.AGGREGATE_POWER_SUMMARY;
            case 31:
                return DataType.AGGREGATE_NUTRITION_SUMMARY;
            case 32:
                return DataType.TYPE_WORKOUT_EXERCISE;
            case 33:
                return DataType.TYPE_HEART_RATE_BPM;
            case 34:
                return DataType.TYPE_BASAL_METABOLIC_RATE;
            case 35:
                return DataType.zzbm;
            case 36:
                return DataType.zzbl;
            case 37:
                return HealthDataTypes.AGGREGATE_BLOOD_PRESSURE_SUMMARY;
            case 38:
                return DataType.TYPE_ACTIVITY_SAMPLES;
            case 39:
                return DataType.zzbj;
            case 40:
                return DataType.AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY;
            case 41:
                return DataType.TYPE_STEP_COUNT_CADENCE;
            case 42:
                return DataType.TYPE_ACTIVITY_SEGMENT;
            case 43:
                return DataType.TYPE_POWER_SAMPLE;
            case 44:
                return DataType.zzbk;
            case 45:
                return DataType.TYPE_STEP_COUNT_CUMULATIVE;
            case 46:
                return DataType.TYPE_BODY_FAT_PERCENTAGE;
            case 47:
                return DataType.AGGREGATE_ACTIVITY_SUMMARY;
            case 48:
                return DataType.AGGREGATE_SPEED_SUMMARY;
            case 49:
                return DataType.TYPE_CALORIES_EXPENDED;
            case 50:
                return HealthDataTypes.TYPE_BLOOD_PRESSURE;
            case 51:
                return DataType.TYPE_HYDRATION;
            case 52:
                return DataType.zzbg;
            case 53:
                return DataType.zzbn;
            case 54:
                return DataType.zzbh;
            case 55:
                return DataType.AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY;
            case 56:
                return HealthDataTypes.TYPE_VAGINAL_SPOTTING;
            case 57:
                return HealthDataTypes.TYPE_OXYGEN_SATURATION;
            case 58:
                return HealthDataTypes.TYPE_OVULATION_TEST;
            case 59:
                return HealthDataTypes.TYPE_BASAL_BODY_TEMPERATURE;
            case 60:
                return DataType.TYPE_CYCLING_WHEEL_REVOLUTION;
            case 61:
                return DataType.TYPE_MOVE_MINUTES;
            case 62:
                return DataType.TYPE_NUTRITION;
            case 63:
                return DataType.zzbq;
            case 64:
                return DataType.zzbr;
            case 65:
                return DataType.TYPE_DISTANCE_CUMULATIVE;
            case 66:
                return HealthDataTypes.TYPE_CERVICAL_POSITION;
            case 67:
                return HealthDataTypes.TYPE_CERVICAL_MUCUS;
            case 68:
                return DataType.zza.zzbv;
            case 69:
                return HealthDataTypes.AGGREGATE_OXYGEN_SATURATION_SUMMARY;
            case 70:
                return DataType.TYPE_SPEED;
            case 71:
                return HealthDataTypes.AGGREGATE_BODY_TEMPERATURE_SUMMARY;
            default:
                return null;
        }
    }
}
