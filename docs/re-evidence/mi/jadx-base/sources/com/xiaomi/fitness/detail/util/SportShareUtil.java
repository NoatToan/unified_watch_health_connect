package com.xiaomi.fitness.detail.util;

import android.content.Context;
import android.content.res.Resources;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SwimmingPosture;
import com.xiaomi.fit.data.common.data.sport.util.SportReportComputeUtil;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import defpackage.byi;
import defpackage.j1j;
import defpackage.rz5;
import defpackage.xr5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ5\u0010\f\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\t2\b\b\u0001\u0010\u0011\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0010J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/detail/util/SportShareUtil;", "", "", "Lrz5;", "mDetailList", "Landroid/content/Context;", "context", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportValues", "", "sportTypeInt", "", "createShareDataList", "(Ljava/util/List;Landroid/content/Context;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;I)V", DailyRecordKey.sportType, "getShareSportTypeInt2", "(I)I", FitnessReportKey.mainPosture, "getSwimmingPostureStr", "getShareSportTypeInt", "sportDataType", "sportBasicReport", "", "isShareCalorieType", "(ILcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)Z", "", "getPostureStr", "(I)Ljava/lang/String;", "<init>", "()V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportShareUtil {

    @NotNull
    public static final SportShareUtil INSTANCE = new SportShareUtil();

    private SportShareUtil() {
    }

    @JvmStatic
    public static final void createShareDataList(@NotNull List<rz5> mDetailList, @NotNull Context context, @NotNull SportBasicReport sportValues, int sportTypeInt) {
        Integer avgPace;
        Float avgSpeed;
        Intrinsics.checkNotNullParameter(mDetailList, "mDetailList");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        if ((sportTypeInt & 1) == 1) {
            mDetailList.add(new rz5(context.getString(j1j.ka), TimeDateUtil.getTimeStrWithSecDef(sportValues.getDuration())));
        }
        if ((sportTypeInt & 2) == 2 && sportValues.getDistance() != null && (avgSpeed = SportReportComputeUtil.INSTANCE.getAvgSpeed(sportValues)) != null) {
            mDetailList.add(new rz5(context.getString(j1j.t3), xr5.g(2, avgSpeed.floatValue())));
        }
        if ((sportTypeInt & 4) == 4 && sportValues.getDistance() != null && (avgPace = SportReportComputeUtil.INSTANCE.getAvgPace(sportValues)) != null) {
            rz5 rz5Var = new rz5(context.getString(j1j.K3), TimeDateUtil.getSportPaceStrWithSecDef(avgPace.intValue()));
            rz5Var.g(1);
            mDetailList.add(rz5Var);
        }
        if ((sportTypeInt & 8) == 8 && sportValues.getCalories() != null) {
            mDetailList.add(new rz5(context.getString(j1j.o2), String.valueOf(sportValues.getCalories())));
        }
        if ((sportTypeInt & 16) == 16) {
            rz5 rz5Var2 = new rz5();
            rz5Var2.g(-1);
            mDetailList.add(rz5Var2);
        }
        int i = sportTypeInt & 2048;
        if (i == 2048 && sportTypeInt != 2113) {
            int duration = sportValues.getDuration();
            Integer totalRestDuration = sportValues.getTotalRestDuration();
            Intrinsics.checkNotNull(totalRestDuration);
            mDetailList.add(new rz5(context.getString(j1j.p4), TimeDateUtil.getTimeStrWithSecDef(duration - totalRestDuration.intValue())));
            if (sportValues.getTotalRestDuration() != null) {
                String string = context.getString(j1j.R6);
                Integer totalRestDuration2 = sportValues.getTotalRestDuration();
                Intrinsics.checkNotNull(totalRestDuration2);
                mDetailList.add(new rz5(string, TimeDateUtil.getTimeStrWithSecDef(totalRestDuration2.intValue())));
            }
        }
        if ((sportTypeInt & 32) == 32) {
            if (sportValues.getRiseHeight() != null) {
                String string2 = context.getString(j1j.R7);
                Float riseHeight = sportValues.getRiseHeight();
                Intrinsics.checkNotNull(riseHeight);
                mDetailList.add(new rz5(string2, xr5.g(2, riseHeight.floatValue())));
            }
            if (sportValues.getFallHeight() != null) {
                String string3 = context.getString(j1j.D7);
                Float fallHeight = sportValues.getFallHeight();
                Intrinsics.checkNotNull(fallHeight);
                mDetailList.add(new rz5(string3, xr5.g(2, fallHeight.floatValue())));
            }
        }
        if ((sportTypeInt & 64) == 64) {
            if (sportValues.getAvgHr() != null) {
                mDetailList.add(new rz5(context.getString(j1j.x7), String.valueOf(sportValues.getAvgHr())));
            }
            if (sportValues.getMaxHr() != null && sportTypeInt != 2113) {
                mDetailList.add(new rz5(context.getString(j1j.P7), String.valueOf(sportValues.getMaxHr())));
            }
        }
        if ((sportTypeInt & 128) == 128 && sportValues.getSteps() != null) {
            mDetailList.add(new rz5(context.getString(j1j.t8), String.valueOf(sportValues.getSteps())));
            Integer avgCadence = SportReportComputeUtil.getAvgCadence(sportValues);
            if (avgCadence != null) {
                mDetailList.add(new rz5(context.getString(j1j.z7), avgCadence.toString()));
            }
        }
        if ((sportTypeInt & 256) == 256) {
            if (sportValues.getMainPosture() != null) {
                String string4 = context.getString(j1j.Y9);
                SportShareUtil sportShareUtil = INSTANCE;
                Integer mainPosture = sportValues.getMainPosture();
                Intrinsics.checkNotNull(mainPosture);
                mDetailList.add(new rz5(string4, sportShareUtil.getPostureStr(mainPosture.intValue())));
            }
            if (sportValues.getAvgSwolf() != null) {
                String string5 = context.getString(j1j.M9);
                Integer avgSwolf = sportValues.getAvgSwolf();
                Intrinsics.checkNotNull(avgSwolf);
                mDetailList.add(new rz5(string5, Integer.toString(avgSwolf.intValue())));
            }
            if (sportValues.getStrokeCount() != null) {
                String string6 = context.getString(j1j.V9);
                Integer strokeCount = sportValues.getStrokeCount();
                Intrinsics.checkNotNull(strokeCount);
                mDetailList.add(new rz5(string6, Integer.toString(strokeCount.intValue())));
            }
            if (sportValues.getMaxStrokeFreq() != null) {
                String string7 = context.getString(j1j.O9);
                Integer maxStrokeFreq = sportValues.getMaxStrokeFreq();
                Intrinsics.checkNotNull(maxStrokeFreq);
                mDetailList.add(new rz5(string7, Integer.toString(maxStrokeFreq.intValue())));
            }
        }
        if ((sportTypeInt & 512) == 512) {
            if (sportValues.getRowCount() != null) {
                String string8 = context.getString(j1j.D0);
                Integer rowCount = sportValues.getRowCount();
                Intrinsics.checkNotNull(rowCount);
                mDetailList.add(new rz5(string8, Integer.toString(rowCount.intValue())));
            }
            if (sportValues.getAvgRowFreq() != null) {
                String string9 = context.getString(j1j.E0);
                Integer avgRowFreq = sportValues.getAvgRowFreq();
                Intrinsics.checkNotNull(avgRowFreq);
                mDetailList.add(new rz5(string9, Integer.toString(avgRowFreq.intValue())));
            }
        }
        if ((sportTypeInt & 1024) == 1024) {
            if (sportValues.getSkipCount() != null) {
                String string10 = context.getString(j1j.H0);
                Integer skipCount = sportValues.getSkipCount();
                Intrinsics.checkNotNull(skipCount);
                mDetailList.add(new rz5(string10, Integer.toString(skipCount.intValue())));
            }
            if (sportValues.getAvgSkipFreq() != null) {
                String string11 = context.getString(j1j.A0);
                Integer avgSkipFreq = sportValues.getAvgSkipFreq();
                Intrinsics.checkNotNull(avgSkipFreq);
                mDetailList.add(new rz5(string11, Integer.toString(avgSkipFreq.intValue())));
            }
        }
        if (i == 2048) {
            if (sportTypeInt != 2113 && sportValues.getGroupCount() != null) {
                Resources resources = context.getResources();
                int i2 = byi.A;
                Integer groupCount = sportValues.getGroupCount();
                Intrinsics.checkNotNull(groupCount);
                String quantityString = resources.getQuantityString(i2, groupCount.intValue());
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                Integer groupCount2 = sportValues.getGroupCount();
                Intrinsics.checkNotNull(groupCount2);
                mDetailList.add(new rz5(quantityString, Integer.toString(groupCount2.intValue())));
            }
            if (sportValues.getHrRecoveryRate() != null) {
                String string12 = context.getString(j1j.c6);
                Float hrRecoveryRate = sportValues.getHrRecoveryRate();
                Intrinsics.checkNotNull(hrRecoveryRate);
                mDetailList.add(new rz5(string12, xr5.f(hrRecoveryRate.floatValue())));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0020  */
    /* JADX WARN: Code duplicated, block: B:6:0x000a  */
    @JvmStatic
    public static final int getShareSportTypeInt2(int sportType) {
        int i;
        if (sportType != 28) {
            switch (sportType) {
                case 21:
                case 22:
                case 23:
                case 24:
                    i = 13;
                    break;
                default:
                    i = 255;
                    break;
            }
        } else {
            i = 13;
        }
        if (sportType != 20 && sportType != 34 && sportType != 26 && sportType != 27) {
            switch (sportType) {
                case 144:
                case 145:
                case 146:
                    i = 11;
                    break;
            }
        } else {
            i = 11;
        }
        if (sportType == 25 || sportType == 32 || sportType == 29 || sportType == 30) {
            i = 65;
        }
        if (sportType == 33) {
            i = SportSummary.VRESION_201;
        }
        if (sportType == 31) {
            i = 1025;
        }
        if (sportType == 35) {
            i = 2113;
        }
        if (sportType == 36) {
            return 73;
        }
        return i;
    }

    private final int getSwimmingPostureStr(@SwimmingPosture int mainPosture) {
        if (mainPosture == 0) {
            return j1j.da;
        }
        if (mainPosture == 1) {
            return j1j.aa;
        }
        if (mainPosture != 2) {
            return mainPosture != 3 ? j1j.ba : j1j.Z9;
        }
        return j1j.ca;
    }

    @NotNull
    public final String getPostureStr(int mainPosture) {
        String string = AppUtil.getApp().getString(getSwimmingPostureStr(mainPosture));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public final int getShareSportTypeInt(int sportType) {
        int i = (sportType == 20 || sportType == 27 || sportType == 34) ? VibrateModeSetViewModel.DEFAULT_BBJI : 255;
        if (sportType == 22 || sportType == 28) {
            i = 253;
        }
        if (sportType == 22) {
            i = 221;
        }
        if (sportType == 25 || sportType == 32 || sportType == 29 || sportType == 30) {
            i = 81;
        }
        if (sportType == 36) {
            i = 73;
        }
        if (sportType == 26) {
            i = 123;
        }
        int i2 = sportType != 21 ? i : 221;
        if (sportType == 23 || sportType == 24) {
            i2 = 285;
        }
        if (sportType == 33) {
            i2 = 593;
        }
        if (sportType == 31) {
            i2 = 1105;
        }
        if (sportType == 35) {
            return 2129;
        }
        return i2;
    }

    public final boolean isShareCalorieType(int sportDataType, @Nullable SportBasicReport sportBasicReport) {
        return (sportBasicReport != null && sportBasicReport.isHundredSport()) || sportDataType == 29 || sportDataType == 25 || sportDataType == 30 || sportDataType == 31 || sportDataType == 32 || sportDataType == 33 || sportDataType == 35 || sportDataType == 109;
    }
}
