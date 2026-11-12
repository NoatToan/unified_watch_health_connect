package com.xiaomi.fitness.chart.util;

import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.data.common.data.sport.util.FitnessSportTypeUtils;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ+\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bJ\u000e\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bJ\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bJ\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bJ\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bJ\u0016\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\nJ \u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\rH\u0002¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/chart/util/SportRecordChatUtil;", "", "<init>", "()V", "getYMaxValueByKey", "Lkotlin/Pair;", "", "sportRecordKey", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", Constants.KEY_RECHARGE_MAXVALUE, "", Constants.KEY_RECHARGE_MINVALUE, "chartSportLineKey", "", "key", "type", "mSportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "(Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;Ljava/lang/Integer;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)Z", "chartSportLineFillKey", "chartSportPaceKey", "chartSportRevertChartKey", "chartSportPointKey", "checkFloatValidByKey", "checkZeroNotValidByKey", "value", "roundNumber", RealNameWebViewActivity.NUMBER, "roundTo", "roundUp", "chart_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportRecordChatUtil {

    @NotNull
    public static final SportRecordChatUtil INSTANCE = new SportRecordChatUtil();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportRecordKey.values().length];
            try {
                iArr[SportRecordKey.Hr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SportRecordKey.Speed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SportRecordKey.EqualIntensityPace.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SportRecordKey.SwimPace.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SportRecordKey.Pace.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SportRecordKey.Stress.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SportRecordKey.Power.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SportRecordKey.Height.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SportRecordKey.SkippingHeight.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SportRecordKey.StepsLength.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SportRecordKey.StepsFrequency.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SportRecordKey.SwimStrokeFreq.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SportRecordKey.Frequency.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SportRecordKey.FreePitchAngle.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SportRecordKey.FreeBreathAngle.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[SportRecordKey.FrogBreathAngle.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[SportRecordKey.FrogSkiDuration.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[SportRecordKey.SwimSwolf.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[SportRecordKey.Resistance.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[SportRecordKey.VerticalAmplitude.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[SportRecordKey.VerticalStrideRatio.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[SportRecordKey.LandingImpact.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[SportRecordKey.TouchdownTime.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[SportRecordKey.InTheAirTime.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[SportRecordKey.TouchAirRatio.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[SportRecordKey.DivingDepth.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[SportRecordKey.DivingTemperature.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[SportRecordKey.RunningPower.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SportRecordChatUtil() {
    }

    public static /* synthetic */ boolean chartSportLineKey$default(SportRecordChatUtil sportRecordChatUtil, SportRecordKey sportRecordKey, Integer num, SportBasicReport sportBasicReport, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            sportBasicReport = null;
        }
        return sportRecordChatUtil.chartSportLineKey(sportRecordKey, num, sportBasicReport);
    }

    private final float roundNumber(float number, int roundTo, boolean roundUp) {
        double d;
        double dFloor;
        if (roundTo <= 0) {
            return number;
        }
        if (roundUp) {
            double d2 = number;
            d = roundTo;
            dFloor = Math.ceil(d2 / d);
        } else {
            double d3 = number;
            d = roundTo;
            dFloor = Math.floor(d3 / d);
        }
        return (float) (dFloor * d);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c A[FALL_THROUGH, ORIG_RETURN, RETURN] */
    public final boolean chartSportLineFillKey(@NotNull SportRecordKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int i = WhenMappings.$EnumSwitchMapping$0[key.ordinal()];
        if (i != 12) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                case 26:
                                case 27:
                                case 28:
                                    break;
                                default:
                                    return false;
                            }
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            return true;
                    }
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    return true;
            }
        }
        return true;
    }

    public final boolean chartSportLineKey(@NotNull SportRecordKey key, @Nullable Integer type, @Nullable SportBasicReport mSportReport) {
        Intrinsics.checkNotNullParameter(key, "key");
        int i = WhenMappings.$EnumSwitchMapping$0[key.ordinal()];
        if (i == 12) {
            return true;
        }
        switch (i) {
            case 1:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
                return true;
            case 2:
                if (type == null || mSportReport == null || type.intValue() == 7) {
                    return true;
                }
                return FitnessSportTypeUtils.INSTANCE.supportSpeedSport(type.intValue(), mSportReport);
            case 5:
                if (type == null || mSportReport == null) {
                    return true;
                }
                return FitnessSportTypeUtils.INSTANCE.supportPaceSport(type.intValue(), mSportReport);
            default:
                switch (i) {
                    case 14:
                        if (mSportReport == null) {
                            return true;
                        }
                        if (mSportReport.getAvgFreePitchAngle() == null) {
                            return false;
                        }
                        Integer avgFreePitchAngle = mSportReport.getAvgFreePitchAngle();
                        Intrinsics.checkNotNull(avgFreePitchAngle);
                        return avgFreePitchAngle.intValue() != 0;
                    case 15:
                        if (mSportReport == null) {
                            return true;
                        }
                        if (mSportReport.getAvgFreeBreathAngle() == null) {
                            return false;
                        }
                        Integer avgFreeBreathAngle = mSportReport.getAvgFreeBreathAngle();
                        Intrinsics.checkNotNull(avgFreeBreathAngle);
                        return avgFreeBreathAngle.intValue() != 0;
                    case 16:
                        if (mSportReport == null) {
                            return true;
                        }
                        if (mSportReport.getAvgFrogBreathAngle() == null) {
                            return false;
                        }
                        Integer avgFrogBreathAngle = mSportReport.getAvgFrogBreathAngle();
                        Intrinsics.checkNotNull(avgFrogBreathAngle);
                        return avgFrogBreathAngle.intValue() != 0;
                    case 17:
                        if (mSportReport == null) {
                            return true;
                        }
                        if (mSportReport.getAvgFrogSkiDuration() == null) {
                            return false;
                        }
                        Integer avgFrogSkiDuration = mSportReport.getAvgFrogSkiDuration();
                        Intrinsics.checkNotNull(avgFrogSkiDuration);
                        return avgFrogSkiDuration.intValue() != 0;
                    case 18:
                    case 19:
                        return true;
                    default:
                        switch (i) {
                            case 26:
                            case 27:
                            case 28:
                                return true;
                            default:
                                return false;
                        }
                }
        }
    }

    public final boolean chartSportPaceKey(@NotNull SportRecordKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int i = WhenMappings.$EnumSwitchMapping$0[key.ordinal()];
        return i == 3 || i == 4 || i == 5;
    }

    public final boolean chartSportPointKey(@NotNull SportRecordKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int i = WhenMappings.$EnumSwitchMapping$0[key.ordinal()];
        if (i != 13) {
            switch (i) {
                default:
                    switch (i) {
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            return false;
                    }
                case 9:
                case 10:
                case 11:
                    return true;
            }
        }
        return true;
    }

    public final boolean chartSportRevertChartKey(@NotNull SportRecordKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return chartSportPaceKey(key) || WhenMappings.$EnumSwitchMapping$0[key.ordinal()] == 26;
    }

    public final boolean checkFloatValidByKey(@NotNull SportRecordKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int i = WhenMappings.$EnumSwitchMapping$0[key.ordinal()];
        if (i != 2 && i != 8) {
            switch (i) {
                default:
                    switch (i) {
                        case 25:
                        case 26:
                        case 27:
                            break;
                        default:
                            return false;
                    }
                case 20:
                case 21:
                case 22:
                    return true;
            }
        }
        return true;
    }

    public final boolean checkZeroNotValidByKey(@NotNull SportRecordKey key, float value) {
        Intrinsics.checkNotNullParameter(key, "key");
        switch (WhenMappings.$EnumSwitchMapping$0[key.ordinal()]) {
            case 1:
            case 4:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                return value == 0.0f;
            case 2:
            case 6:
            case 7:
            case 8:
            case 12:
            case 18:
            case 19:
            default:
                return false;
            case 3:
            case 5:
                return value == 0.0f || value > 1800.0f;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        if (r11 > 9.0f) goto L12;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> getYMaxValueByKey(@org.jetbrains.annotations.Nullable com.xiaomi.fit.data.common.data.sport.SportRecordKey r10, float r11, float r12) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.chart.util.SportRecordChatUtil.getYMaxValueByKey(com.xiaomi.fit.data.common.data.sport.SportRecordKey, float, float):kotlin.Pair");
    }
}
