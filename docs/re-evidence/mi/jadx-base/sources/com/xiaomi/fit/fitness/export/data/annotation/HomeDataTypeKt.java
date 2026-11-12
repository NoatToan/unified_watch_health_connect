package com.xiaomi.fit.fitness.export.data.annotation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0005"}, d2 = {"needCareSid", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "canDeleteData", "needSaveDailyReport", "fitness-data-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HomeDataTypeKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HomeDataType.values().length];
            try {
                iArr[HomeDataType.ENERGY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeDataType.STRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeDataType.PAI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HomeDataType.TRAINING_LOAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HomeDataType.PHYSICAL_STATUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HomeDataType.VITALITY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HomeDataType.SLEEP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HomeDataType.HR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HomeDataType.SPO2.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[HomeDataType.WEIGHT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[HomeDataType.BLOOD_PRESSURE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[HomeDataType.TEMPERATURE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[HomeDataType.BLOOD_SUGAR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[HomeDataType.RUNNING_INDICATOR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean canDeleteData(@NotNull HomeDataType homeDataType) {
        Intrinsics.checkNotNullParameter(homeDataType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[homeDataType.ordinal()];
        if (i != 2) {
            switch (i) {
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public static final boolean needCareSid(@NotNull HomeDataType homeDataType) {
        Intrinsics.checkNotNullParameter(homeDataType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[homeDataType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    public static final boolean needSaveDailyReport(@NotNull HomeDataType homeDataType) {
        Intrinsics.checkNotNullParameter(homeDataType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[homeDataType.ordinal()];
        return (i == 5 || i == 6 || i == 13 || i == 14) ? false : true;
    }
}
