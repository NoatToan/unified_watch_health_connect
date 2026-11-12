package com.xiaomi.fitness.detail.model;

import android.app.Application;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.util.SportReportComputeUtil;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.byi;
import defpackage.j1j;
import defpackage.pz6;
import defpackage.xr5;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u001c\u0018\u0000 22\u00020\u0001:\u00012B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\r\u0010 \u001a\u00020\u0017H\u0007¢\u0006\u0002\b+J\r\u0010#\u001a\u00020\u0017H\u0007¢\u0006\u0002\b,J\r\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0002\b-J\r\u0010\u001d\u001a\u00020\u0017H\u0007¢\u0006\u0002\b.J\r\u0010&\u001a\u00020\u0017H\u0007¢\u0006\u0002\b/J\r\u0010)\u001a\u00020\u0017H\u0007¢\u0006\u0002\b0J\u0006\u00101\u001a\u00020\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001a\u0010\"\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR\u001a\u0010%\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR\u001a\u0010(\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001b¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/detail/model/SportTargetModel;", "", "type", "", "targetValue", "", "actualValue", DailyRecordKey.sportType, "<init>", "(ILjava/lang/Number;Ljava/lang/Number;I)V", "getType", "()I", "setType", "(I)V", "getTargetValue", "()Ljava/lang/Number;", "setTargetValue", "(Ljava/lang/Number;)V", "getActualValue", "setActualValue", "getSportType", "setSportType", "targetName", "", "getTargetName", "()Ljava/lang/String;", "setTargetName", "(Ljava/lang/String;)V", "actualName", "getActualName", "setActualName", "targetValueStr", "getTargetValueStr", "setTargetValueStr", "actualValueStr", "getActualValueStr", "setActualValueStr", "targetUnit", "getTargetUnit", "setTargetUnit", "actualUnit", "getActualUnit", "setActualUnit", "getTargetValueStr1", "getActualValueStr1", "getTargetName1", "getActualName1", "getTargetUnit1", "getActualUnit1", "obtainPercentage", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportTargetModel {
    public static final int CADENCE_TARGET = 7;
    public static final int CALORIES_TARGET = 4;
    public static final int COUNT_TARGET = 6;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int DISTANCE_TARGET = 3;
    public static final int DURATION_TARGET = 2;
    public static final int PACE_TARGET = 1;
    public static final int ROUND_TRIP_TARGET = 5;
    public static final int SPEED_TARGET = 8;

    @NotNull
    private String actualName;

    @NotNull
    private String actualUnit;

    @NotNull
    private Number actualValue;

    @NotNull
    private String actualValueStr;
    private int sportType;

    @NotNull
    private String targetName;

    @NotNull
    private String targetUnit;

    @NotNull
    private Number targetValue;

    @NotNull
    private String targetValueStr;
    private int type;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/detail/model/SportTargetModel$Companion;", "", "<init>", "()V", "PACE_TARGET", "", "DURATION_TARGET", "DISTANCE_TARGET", "CALORIES_TARGET", "ROUND_TRIP_TARGET", "COUNT_TARGET", "CADENCE_TARGET", "SPEED_TARGET", "getActualValue", "", "type", "basicReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:7:0x001d  */
        @JvmStatic
        @NotNull
        public final Number getActualValue(int type, @NotNull SportBasicReport basicReport) {
            Integer distance;
            int duration;
            Intrinsics.checkNotNullParameter(basicReport, "basicReport");
            if (basicReport.getCorrectedDistance() != null) {
                Integer correctedDistance = basicReport.getCorrectedDistance();
                Intrinsics.checkNotNull(correctedDistance);
                if (correctedDistance.intValue() > 0) {
                    distance = basicReport.getCorrectedDistance();
                } else {
                    distance = basicReport.getDistance();
                }
            } else {
                distance = basicReport.getDistance();
            }
            switch (type) {
                case 1:
                    Integer avgPace = basicReport.getAvgPace();
                    return Integer.valueOf(avgPace != null ? avgPace.intValue() : 0);
                case 2:
                    if (basicReport.getProtoType() != 21 || basicReport.getValidDuration() == null) {
                        duration = basicReport.getDuration();
                    } else {
                        Integer validDuration = basicReport.getValidDuration();
                        Intrinsics.checkNotNull(validDuration);
                        if (validDuration.intValue() > 0) {
                            Integer validDuration2 = basicReport.getValidDuration();
                            Intrinsics.checkNotNull(validDuration2);
                            duration = validDuration2.intValue();
                        } else {
                            duration = basicReport.getDuration();
                        }
                    }
                    return Integer.valueOf(duration);
                case 3:
                    return Integer.valueOf(distance != null ? distance.intValue() : 0);
                case 4:
                    Integer calories = basicReport.getCalories();
                    return Integer.valueOf(calories != null ? calories.intValue() : 0);
                case 5:
                    Integer turnCount = basicReport.getTurnCount();
                    return Integer.valueOf(turnCount != null ? turnCount.intValue() : 0);
                case 6:
                    return Integer.valueOf(basicReport.getSportCount());
                case 7:
                    Integer avgCadence = SportReportComputeUtil.getAvgCadence(basicReport);
                    return Integer.valueOf(avgCadence != null ? avgCadence.intValue() : 0);
                case 8:
                    Float avgSpeed = SportReportComputeUtil.INSTANCE.getAvgSpeed(basicReport);
                    if (avgSpeed == null) {
                        return 0;
                    }
                    return avgSpeed;
                default:
                    return 0;
            }
        }
    }

    public SportTargetModel(int i, @NotNull Number targetValue, @NotNull Number actualValue, int i2) {
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(actualValue, "actualValue");
        this.type = i;
        this.targetValue = targetValue;
        this.actualValue = actualValue;
        this.sportType = i2;
        this.targetName = getTargetName1();
        this.actualName = getActualName1();
        this.targetValueStr = getTargetValueStr1();
        this.actualValueStr = getActualValueStr1();
        this.targetUnit = getTargetUnit1();
        this.actualUnit = getActualUnit1();
    }

    @JvmStatic
    @NotNull
    public static final Number getActualValue(int i, @NotNull SportBasicReport sportBasicReport) {
        return INSTANCE.getActualValue(i, sportBasicReport);
    }

    @NotNull
    public final String getActualName() {
        return this.actualName;
    }

    @JvmName(name = "getActualName1")
    @NotNull
    public final String getActualName1() {
        String string;
        Application app = AppUtil.getApp();
        switch (this.type) {
            case 1:
                String string2 = app.getString(j1j.N8);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            case 2:
                String string3 = app.getString(j1j.a9);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            case 3:
                String string4 = app.getString(j1j.W8);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return string4;
            case 4:
                String string5 = app.getString(j1j.Q8);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            case 5:
                String string6 = app.getString(j1j.c9);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                return string6;
            case 6:
                int i = this.sportType;
                if (i != 33) {
                    switch (i) {
                        case 144:
                        case 145:
                        case 146:
                            string = app.getString(j1j.c9);
                            break;
                        default:
                            string = app.getString(j1j.T8);
                            break;
                    }
                } else {
                    string = app.getString(j1j.U8);
                }
                Intrinsics.checkNotNull(string);
                return string;
            case 7:
                String string7 = app.getString(j1j.N8);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                return string7;
            case 8:
                String string8 = app.getString(j1j.N8);
                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                return string8;
            default:
                String string9 = app.getString(j1j.N8);
                Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                return string9;
        }
    }

    @NotNull
    public final String getActualUnit() {
        return this.actualUnit;
    }

    @JvmName(name = "getActualUnit1")
    @NotNull
    public final String getActualUnit1() {
        Application app = AppUtil.getApp();
        int i = this.type;
        if (i == 3) {
            String strI = pz6.i(this.actualValue.intValue());
            Intrinsics.checkNotNull(strI);
            return strI;
        }
        if (i == 4) {
            String quantityString = app.getResources().getQuantityString(byi.common_unit_calorie, this.actualValue.intValue());
            Intrinsics.checkNotNull(quantityString);
            return quantityString;
        }
        if (i == 5) {
            String quantityString2 = app.getResources().getQuantityString(byi.common_unit_swim_count, this.actualValue.intValue());
            Intrinsics.checkNotNull(quantityString2);
            return quantityString2;
        }
        if (i != 6) {
            return "";
        }
        String quantityString3 = this.sportType == 33 ? app.getResources().getQuantityString(byi.common_unit_rowing_machine_count, this.actualValue.intValue()) : app.getResources().getQuantityString(byi.common_unit_rope_count, this.actualValue.intValue());
        Intrinsics.checkNotNull(quantityString3);
        return quantityString3;
    }

    @NotNull
    public final String getActualValueStr() {
        return this.actualValueStr;
    }

    @JvmName(name = "getActualValueStr1")
    @NotNull
    public final String getActualValueStr1() {
        switch (this.type) {
            case 1:
                return TimeDateUtil.getSportPaceStrWithSecDef(this.actualValue.intValue());
            case 2:
                return TimeDateUtil.getTimeStrWithSecDef(this.actualValue.intValue());
            case 3:
                String strF = pz6.f(this.actualValue.intValue(), 2);
                Intrinsics.checkNotNullExpressionValue(strF, "getDistanceStrWithoutUnit(...)");
                return strF;
            case 4:
            case 5:
            case 6:
            case 7:
                return this.actualValue.toString();
            default:
                return this.actualValue.toString();
        }
    }

    public final int getSportType() {
        return this.sportType;
    }

    @NotNull
    public final String getTargetName() {
        return this.targetName;
    }

    @JvmName(name = "getTargetName1")
    @NotNull
    public final String getTargetName1() {
        String string;
        Application app = AppUtil.getApp();
        switch (this.type) {
            case 1:
                String string2 = app.getString(j1j.X8);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            case 2:
                String string3 = app.getString(j1j.Z8);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            case 3:
                String string4 = app.getString(j1j.V8);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return string4;
            case 4:
                String string5 = app.getString(j1j.P8);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            case 5:
                String string6 = app.getString(j1j.b9);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                return string6;
            case 6:
                int i = this.sportType;
                if (i != 33) {
                    switch (i) {
                        case 144:
                        case 145:
                        case 146:
                            string = app.getString(j1j.b9);
                            break;
                        default:
                            string = app.getString(j1j.R8);
                            break;
                    }
                } else {
                    string = app.getString(j1j.S8);
                }
                Intrinsics.checkNotNull(string);
                return string;
            case 7:
                String string7 = app.getString(j1j.O8);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                return string7;
            case 8:
                String string8 = app.getString(j1j.Y8);
                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                return string8;
            default:
                String string9 = app.getString(j1j.R8);
                Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                return string9;
        }
    }

    @NotNull
    public final String getTargetUnit() {
        return this.targetUnit;
    }

    @JvmName(name = "getTargetUnit1")
    @NotNull
    public final String getTargetUnit1() {
        String quantityString;
        Application app = AppUtil.getApp();
        int i = this.type;
        if (i == 3) {
            String strI = pz6.i(this.targetValue.intValue());
            Intrinsics.checkNotNull(strI);
            return strI;
        }
        if (i == 4) {
            String quantityString2 = app.getResources().getQuantityString(byi.common_unit_calorie, this.targetValue.intValue());
            Intrinsics.checkNotNull(quantityString2);
            return quantityString2;
        }
        if (i == 5) {
            String quantityString3 = app.getResources().getQuantityString(byi.common_unit_swim_count, this.targetValue.intValue());
            Intrinsics.checkNotNull(quantityString3);
            return quantityString3;
        }
        if (i != 6) {
            return "";
        }
        int i2 = this.sportType;
        if (i2 != 33) {
            switch (i2) {
                case 144:
                case 145:
                case 146:
                    quantityString = app.getResources().getQuantityString(byi.common_unit_swim_count, this.targetValue.intValue());
                    break;
                default:
                    quantityString = app.getResources().getQuantityString(byi.common_unit_rope_count, this.targetValue.intValue());
                    break;
            }
        } else {
            quantityString = app.getResources().getQuantityString(byi.common_unit_rowing_machine_count, this.targetValue.intValue());
        }
        Intrinsics.checkNotNull(quantityString);
        return quantityString;
    }

    @NotNull
    public final Number getTargetValue() {
        return this.targetValue;
    }

    @NotNull
    public final String getTargetValueStr() {
        return this.targetValueStr;
    }

    @JvmName(name = "getTargetValueStr1")
    @NotNull
    public final String getTargetValueStr1() {
        switch (this.type) {
            case 1:
                return TimeDateUtil.getSportPaceStrWithSecDef(this.targetValue.intValue());
            case 2:
                return TimeDateUtil.getTimeStrWithSecDef(this.targetValue.intValue());
            case 3:
                String strF = pz6.f(this.targetValue.intValue(), 2);
                Intrinsics.checkNotNullExpressionValue(strF, "getDistanceStrWithoutUnit(...)");
                return strF;
            case 4:
            case 5:
            case 6:
            case 7:
                return this.targetValue.toString();
            default:
                return this.targetValue.toString();
        }
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final String obtainPercentage() {
        int i = this.type;
        if (i == 8) {
            float f = 100;
            String strI = xr5.i(MathKt__MathJVMKt.roundToInt(this.actualValue.floatValue() * f), MathKt__MathJVMKt.roundToInt(this.targetValue.floatValue() * f), 1);
            Intrinsics.checkNotNullExpressionValue(strI, "getPercentageStr(...)");
            return strI;
        }
        if (i != 3 || this.actualValue.intValue() <= 1000.0f) {
            String strI2 = xr5.i(this.actualValue.intValue(), this.targetValue.intValue(), 1);
            Intrinsics.checkNotNullExpressionValue(strI2, "getPercentageStr(...)");
            return strI2;
        }
        String strI3 = xr5.i(MathKt__MathJVMKt.roundToInt(this.actualValue.floatValue() / 10) * 10, this.targetValue.intValue(), 1);
        Intrinsics.checkNotNullExpressionValue(strI3, "getPercentageStr(...)");
        return strI3;
    }

    public final void setActualName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.actualName = str;
    }

    public final void setActualUnit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.actualUnit = str;
    }

    public final void setActualValue(@NotNull Number number) {
        Intrinsics.checkNotNullParameter(number, "<set-?>");
        this.actualValue = number;
    }

    public final void setActualValueStr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.actualValueStr = str;
    }

    public final void setSportType(int i) {
        this.sportType = i;
    }

    public final void setTargetName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.targetName = str;
    }

    public final void setTargetUnit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.targetUnit = str;
    }

    public final void setTargetValue(@NotNull Number number) {
        Intrinsics.checkNotNullParameter(number, "<set-?>");
        this.targetValue = number;
    }

    public final void setTargetValueStr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.targetValueStr = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public final Number getActualValue() {
        return this.actualValue;
    }
}
