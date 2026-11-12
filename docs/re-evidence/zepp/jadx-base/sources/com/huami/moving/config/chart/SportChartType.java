package com.huami.moving.config.chart;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.common.net.HttpHeaders;
import com.huami.ecg.core.model.constant.MeasureContentType;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.moving.ui.utils.SportAnalytics;
import com.xiaomi.hm.health.Constant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lcom/huami/moving/config/chart/SportChartType;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "SPORT_TARGET", "SPEED", "PACE", MeasureContentType.HEART, "HEART_ZONE", "ALTITUDE", "SLOPE", "STEP_STRIDE", "STEP_FREQ", "STROKE_SPEED", HttpHeaders.TE, "ROPE_FREQ", "BODY_STATUS", "STROKE_FREQ", "SPO2", "PRESSURE", "GOLF_BEAT", "GOLF_ANGLE", "GOLF_UP_DOWN_TIME", "POWER_METER", MessengerShareContentUtility.PREVIEW_DEFAULT, "moving_release"}, k = 1, mv = {1, 5, 1})
public enum SportChartType {
    SPORT_TARGET("sportTarget"),
    SPEED("speed"),
    PACE("pace"),
    HEART(Constant.KEY_THIRD_AUTH_GOOGLE_TYPE_HEART),
    HEART_ZONE("heartzone"),
    ALTITUDE("altitude"),
    SLOPE(SportAnalytics.ParamValue.ChartType.CHART_SLOPE),
    STEP_STRIDE("stepStride"),
    STEP_FREQ(Constants.DATA_KEY_STEP_FREQ),
    STROKE_SPEED("strokeSpeed"),
    TE(HttpHeaders.TE),
    ROPE_FREQ("ropeFreq"),
    BODY_STATUS("bodyStatus"),
    STROKE_FREQ("strokeFreq"),
    SPO2("spo2"),
    PRESSURE("pressure"),
    GOLF_BEAT("golfBeat"),
    GOLF_ANGLE("golfAngle"),
    GOLF_UP_DOWN_TIME("golfUpDownTime"),
    POWER_METER("powerMeter"),
    DEFAULT("default");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/moving/config/chart/SportChartType$Companion;", "", "", "value", "Lcom/huami/moving/config/chart/SportChartType;", "getSportChartTypeByValue", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SportChartType getSportChartTypeByValue(@NotNull String value) {
            SportChartType sportChartType = SportChartType.SPEED;
            if (Intrinsics.areEqual(value, sportChartType.getValue())) {
                return sportChartType;
            }
            SportChartType sportChartType2 = SportChartType.PACE;
            if (Intrinsics.areEqual(value, sportChartType2.getValue())) {
                return sportChartType2;
            }
            SportChartType sportChartType3 = SportChartType.HEART;
            if (Intrinsics.areEqual(value, sportChartType3.getValue())) {
                return sportChartType3;
            }
            SportChartType sportChartType4 = SportChartType.HEART_ZONE;
            if (Intrinsics.areEqual(value, sportChartType4.getValue())) {
                return sportChartType4;
            }
            SportChartType sportChartType5 = SportChartType.ALTITUDE;
            if (Intrinsics.areEqual(value, sportChartType5.getValue())) {
                return sportChartType5;
            }
            SportChartType sportChartType6 = SportChartType.SLOPE;
            if (Intrinsics.areEqual(value, sportChartType6.getValue())) {
                return sportChartType6;
            }
            SportChartType sportChartType7 = SportChartType.STEP_STRIDE;
            if (Intrinsics.areEqual(value, sportChartType7.getValue())) {
                return sportChartType7;
            }
            SportChartType sportChartType8 = SportChartType.STEP_FREQ;
            if (Intrinsics.areEqual(value, sportChartType8.getValue())) {
                return sportChartType8;
            }
            SportChartType sportChartType9 = SportChartType.STROKE_SPEED;
            if (Intrinsics.areEqual(value, sportChartType9.getValue())) {
                return sportChartType9;
            }
            SportChartType sportChartType10 = SportChartType.TE;
            if (Intrinsics.areEqual(value, sportChartType10.getValue())) {
                return sportChartType10;
            }
            SportChartType sportChartType11 = SportChartType.ROPE_FREQ;
            if (Intrinsics.areEqual(value, sportChartType11.getValue())) {
                return sportChartType11;
            }
            SportChartType sportChartType12 = SportChartType.BODY_STATUS;
            if (Intrinsics.areEqual(value, sportChartType12.getValue())) {
                return sportChartType12;
            }
            SportChartType sportChartType13 = SportChartType.STROKE_FREQ;
            if (Intrinsics.areEqual(value, sportChartType13.getValue())) {
                return sportChartType13;
            }
            SportChartType sportChartType14 = SportChartType.SPO2;
            if (Intrinsics.areEqual(value, sportChartType14.getValue())) {
                return sportChartType14;
            }
            SportChartType sportChartType15 = SportChartType.PRESSURE;
            if (Intrinsics.areEqual(value, sportChartType15.getValue())) {
                return sportChartType15;
            }
            SportChartType sportChartType16 = SportChartType.GOLF_BEAT;
            if (Intrinsics.areEqual(value, sportChartType16.getValue())) {
                return sportChartType16;
            }
            SportChartType sportChartType17 = SportChartType.GOLF_ANGLE;
            if (Intrinsics.areEqual(value, sportChartType17.getValue())) {
                return sportChartType17;
            }
            SportChartType sportChartType18 = SportChartType.GOLF_UP_DOWN_TIME;
            if (Intrinsics.areEqual(value, sportChartType18.getValue())) {
                return sportChartType18;
            }
            SportChartType sportChartType19 = SportChartType.POWER_METER;
            return Intrinsics.areEqual(value, sportChartType19.getValue()) ? sportChartType19 : SportChartType.DEFAULT;
        }
    }

    SportChartType(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
