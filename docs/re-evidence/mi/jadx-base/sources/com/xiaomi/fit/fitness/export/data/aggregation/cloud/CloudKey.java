package com.xiaomi.fit.fitness.export.data.aggregation.cloud;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007J\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/cloud/CloudKey;", "", "<init>", "()V", "TAG", "", "convertToCloudDataKeys", "", "types", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "convertToHomeDataTypes", "keys", "getCloudRequestKey", "type", "getHomeDataType", "cloudKey", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCloudKey.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudKey.kt\ncom/xiaomi/fit/fitness/export/data/aggregation/cloud/CloudKey\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1863#2,2:83\n1863#2,2:85\n*S KotlinDebug\n*F\n+ 1 CloudKey.kt\ncom/xiaomi/fit/fitness/export/data/aggregation/cloud/CloudKey\n*L\n18#1:83,2\n32#1:85,2\n*E\n"})
public final class CloudKey {

    @NotNull
    public static final CloudKey INSTANCE = new CloudKey();

    @NotNull
    private static final String TAG = "CloudKey";

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HomeDataType.values().length];
            try {
                iArr[HomeDataType.STEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeDataType.CALORIE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeDataType.SLEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HomeDataType.HR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HomeDataType.STRESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HomeDataType.SPO2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HomeDataType.MH_STRENGTH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HomeDataType.VALID_STAND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HomeDataType.ENERGY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[HomeDataType.RAINBOW.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[HomeDataType.PAI.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[HomeDataType.BLOOD_PRESSURE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[HomeDataType.HEARING_HEALTH.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[HomeDataType.WEIGHT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[HomeDataType.V02_MAX.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[HomeDataType.WOMEN_HEALTH.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private CloudKey() {
    }

    @Nullable
    public final List<String> convertToCloudDataKeys(@Nullable List<? extends HomeDataType> types) {
        List<? extends HomeDataType> list = types;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (HomeDataType homeDataType : types) {
            String cloudRequestKey = INSTANCE.getCloudRequestKey(homeDataType);
            if (cloudRequestKey == null || cloudRequestKey.length() == 0) {
                FitnessLogUtils.i(TAG, "convertToCloudDataKey(" + homeDataType + " key is null)");
            }
            arrayList.add(cloudRequestKey);
        }
        return arrayList;
    }

    @Nullable
    public final List<HomeDataType> convertToHomeDataTypes(@Nullable List<String> keys) {
        List<String> list = keys;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : keys) {
            HomeDataType homeDataType = INSTANCE.getHomeDataType(str);
            if (homeDataType == HomeDataType.UNKNOWN) {
                FitnessLogUtils.i(TAG, "convertToCloudDataKey(" + str + " unknown home type)");
            }
            arrayList.add(homeDataType);
        }
        return arrayList;
    }

    @NotNull
    public final String getCloudRequestKey(@NotNull HomeDataType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return "steps";
            case 2:
                return "calories";
            case 3:
                return "sleep";
            case 4:
                return "heart_rate";
            case 5:
                return "stress";
            case 6:
                return "spo2";
            case 7:
                return "intensity";
            case 8:
                return FitnessPersistKey.ValidStand;
            case 9:
                return "energy";
            case 10:
                return FitnessPersistKey.Rainbow;
            case 11:
                return "pai";
            case 12:
                return "blood_pressure";
            case 13:
                return "headset";
            case 14:
                return "weight";
            case 15:
                return FitnessPersistKey.Vo2Max;
            case 16:
                return FitnessPersistKey.WomenHealthStatus;
            default:
                return "";
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public final HomeDataType getHomeDataType(@NotNull String cloudKey) {
        Intrinsics.checkNotNullParameter(cloudKey, "cloudKey");
        switch (cloudKey.hashCode()) {
            case -1408316973:
                if (cloudKey.equals(FitnessPersistKey.ValidStand)) {
                    return HomeDataType.VALID_STAND;
                }
                break;
            case -1298713976:
                if (cloudKey.equals("energy")) {
                    return HomeDataType.ENERGY;
                }
                break;
            case -891989580:
                if (cloudKey.equals("stress")) {
                    return HomeDataType.STRESS;
                }
                break;
            case -791592328:
                if (cloudKey.equals("weight")) {
                    return HomeDataType.WEIGHT;
                }
                break;
            case -168965370:
                if (cloudKey.equals("calories")) {
                    return HomeDataType.CALORIE;
                }
                break;
            case 110744:
                if (cloudKey.equals("pai")) {
                    return HomeDataType.PAI;
                }
                break;
            case 3178259:
                if (cloudKey.equals(FitnessPersistKey.Rainbow)) {
                    return HomeDataType.RAINBOW;
                }
                break;
            case 3537088:
                if (cloudKey.equals("spo2")) {
                    return HomeDataType.SPO2;
                }
                break;
            case 82664443:
                if (cloudKey.equals(FitnessPersistKey.WomenHealthStatus)) {
                    return HomeDataType.WOMEN_HEALTH;
                }
                break;
            case 109522647:
                if (cloudKey.equals("sleep")) {
                    return HomeDataType.SLEEP;
                }
                break;
            case 109761319:
                if (cloudKey.equals("steps")) {
                    return HomeDataType.STEP;
                }
                break;
            case 499324979:
                if (cloudKey.equals("intensity")) {
                    return HomeDataType.MH_STRENGTH;
                }
                break;
            case 560044778:
                if (cloudKey.equals("blood_pressure")) {
                    return HomeDataType.BLOOD_PRESSURE;
                }
                break;
            case 578201790:
                if (cloudKey.equals(FitnessPersistKey.Vo2Max)) {
                    return HomeDataType.V02_MAX;
                }
                break;
            case 795320962:
                if (cloudKey.equals("headset")) {
                    return HomeDataType.HEARING_HEALTH;
                }
                break;
            case 1930449209:
                if (cloudKey.equals("heart_rate")) {
                    return HomeDataType.HR;
                }
                break;
        }
        return HomeDataType.UNKNOWN;
    }
}
