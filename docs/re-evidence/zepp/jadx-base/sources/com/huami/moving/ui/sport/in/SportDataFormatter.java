package com.huami.moving.ui.sport.in;

import android.content.Context;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.mifit.sportlib.utils.RunDataConversion;
import com.huami.moving.R;
import com.huami.moving.datacenter.SportDataType;
import com.huami.moving.ui.utils.DataFormatter;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.huami.watch.companion.dataflow.Constant;
import com.xiaomi.hm.health.watermarkcamera.web.GetWatermarkAPI;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 +2\u00020\u0001:\u0001+B!\u0012\u0006\u0010\u001f\u001a\u00020\u001b\u0012\u0006\u0010#\u001a\u00020\u000f\u0012\b\b\u0002\u0010%\u001a\u00020\f¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J\u0016\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018R\u0019\u0010\u001f\u001a\u00020\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010#\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\"\u0010%\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/huami/moving/ui/sport/in/SportDataFormatter;", "", "", "second", "", "b", "", "altitude", "a", "distance", "c", "pace", "", "toSpeed", "e", "", Constant.KEY_HR_VALUE, GoogleApiAvailabilityLight.a, GetWatermarkAPI.KEY_NAME_STEPS, "g", Constants.DATA_KEY_STEP_FREQ, "f", "Lcom/huami/moving/datacenter/SportDataType;", "dataType", "Lcom/huami/moving/ui/sport/in/SportDataCenter;", "dataCenter", "getFormatData", "Landroid/content/Context;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, LogUtil.I, "getSportType", "()I", "sportType", "Z", TdmillHmFragment.ARG_IS_METRIC, "()Z", "setMetric", "(Z)V", "<init>", "(Landroid/content/Context;IZ)V", "Companion", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportDataFormatter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static boolean d = false;
    private static final int e = 100;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int sportType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isMetric;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\nR(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/huami/moving/ui/sport/in/SportDataFormatter$Companion;", "", "", "testBigData", "Z", "getTestBigData", "()Z", "setTestBigData", "(Z)V", "getTestBigData$annotations", "()V", "", "HOUR_DIS_SECONDS", LogUtil.I, "<init>", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getTestBigData$annotations() {
        }

        public final boolean getTestBigData() {
            return SportDataFormatter.d;
        }

        public final void setTestBigData(boolean z) {
            SportDataFormatter.d = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportDataType.values().length];
            iArr[SportDataType.ALTITUDE.ordinal()] = 1;
            iArr[SportDataType.CALORY.ordinal()] = 2;
            iArr[SportDataType.CLIMB.ordinal()] = 3;
            iArr[SportDataType.DISTANCE.ordinal()] = 4;
            iArr[SportDataType.HEART_RATE.ordinal()] = 5;
            iArr[SportDataType.PACE.ordinal()] = 6;
            iArr[SportDataType.AVG_PACE.ordinal()] = 7;
            iArr[SportDataType.STEP_FREQ.ordinal()] = 8;
            iArr[SportDataType.STEPS.ordinal()] = 9;
            iArr[SportDataType.TIME.ordinal()] = 10;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SportDataFormatter(@NotNull Context context, int i, boolean z) {
        this.context = context;
        this.sportType = i;
        this.isMetric = z;
    }

    private final String a(float altitude) {
        return altitude > 0.0f ? RunDataConversion.parseAltitude(altitude, this.isMetric) : SportDataType.ALTITUDE.getDefaultValue();
    }

    private final String b(long second) {
        if (second <= 0) {
            return SportDataType.TIME.getDefaultValue();
        }
        if (d) {
            second += TimeUnit.HOURS.toSeconds(100L);
        }
        return DataFormatter.getConsumeTime(second, 100);
    }

    private final String c(float distance) {
        if (distance <= 0.0f) {
            return SportDataType.DISTANCE.getDefaultValue();
        }
        float fConvertMeterToKmOrMile = RunDataConversion.convertMeterToKmOrMile(distance, this.isMetric);
        if (d) {
            fConvertMeterToKmOrMile += 100;
        }
        return DataFormatter.parseRawKilometerToFormatKilometer(fConvertMeterToKmOrMile);
    }

    private final String d(int heartRate) {
        return heartRate > 0 ? String.valueOf(heartRate) : SportDataType.HEART_RATE.getDefaultValue();
    }

    private final String e(float pace, boolean toSpeed) {
        if (toSpeed) {
            return RunDataConversion.paceConvertToSpeed(pace, this.isMetric);
        }
        if (pace > RunDataConversion.getMaxValidPace(this.sportType)) {
            pace = 0.0f;
        }
        return DataFormatter.formatTimeInSportFormForPace((long) RunDataConversion.paceMultiplyKilo(pace, this.isMetric));
    }

    private final String f(float stepFreq) {
        return stepFreq > 0.0f ? String.valueOf((int) (stepFreq * 60)) : SportDataType.STEP_FREQ.getDefaultValue();
    }

    private final String g(int steps) {
        return steps > 0 ? String.valueOf(steps) : SportDataType.STEPS.getDefaultValue();
    }

    public static final boolean getTestBigData() {
        return INSTANCE.getTestBigData();
    }

    public static final void setTestBigData(boolean z) {
        INSTANCE.setTestBigData(z);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final String getFormatData(@NotNull SportDataType dataType, @NotNull SportDataCenter dataCenter) {
        switch (WhenMappings.$EnumSwitchMapping$0[dataType.ordinal()]) {
            case 1:
                return a(dataCenter.getAltitude());
            case 2:
                return String.valueOf((int) dataCenter.getCalorie());
            case 3:
                return a(dataCenter.getCom.huami.watch.companion.ui.activity.PBTabActivity.APP_GOTO_CLIMB java.lang.String());
            case 4:
                return c(dataCenter.getDistance());
            case 5:
                return d(dataCenter.getCom.huami.watch.companion.dataflow.Constant.KEY_HR_VALUE java.lang.String().getHeartRate());
            case 6:
                return e(dataCenter.getPace(), this.sportType == 9);
            case 7:
                return e(dataCenter.getCom.huami.mifit.sportlib.common.Constants.DATA_KEY_AVG_PACE java.lang.String(), this.sportType == 9);
            case 8:
                return f(dataCenter.getCom.huami.mifit.sportlib.common.Constants.DATA_KEY_STEP_FREQ java.lang.String());
            case 9:
                return g(dataCenter.getSteps());
            case 10:
                return b(dataCenter.getTime());
            default:
                return this.context.getString(R.string.running_num_unknown);
        }
    }

    public final int getSportType() {
        return this.sportType;
    }

    /* JADX INFO: renamed from: isMetric, reason: from getter */
    public final boolean getIsMetric() {
        return this.isMetric;
    }

    public final void setMetric(boolean z) {
        this.isMetric = z;
    }

    public /* synthetic */ SportDataFormatter(Context context, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, (i2 & 4) != 0 ? true : z);
    }
}
