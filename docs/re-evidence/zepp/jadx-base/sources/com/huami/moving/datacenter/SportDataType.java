package com.huami.moving.datacenter;

import android.content.Context;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.moving.R;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.huami.watch.companion.dataflow.Constant;
import com.xiaomi.hm.health.watermarkcamera.web.GetWatermarkAPI;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ALTITUDE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\b\u0086\u0001\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B1\b\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0019\u0010\t\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u000f\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0019\u0010\u0010\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$¨\u0006%"}, d2 = {"Lcom/huami/moving/datacenter/SportDataType;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", TdmillHmFragment.ARG_IS_METRIC, "", "unit", "", "iconResId", LogUtil.I, "getIconResId", "()I", "nameResId", "getNameResId", "unitResId", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "defaultValue", "getDefaultValue", "<init>", "(Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;)V", "Companion", "ALTITUDE", "AVG_PACE", "AVG_SPEED", "CALORY", "CLIMB", "DISTANCE", "HEART_RATE", "PACE", "SPEED", "STEP_FREQ", "STEPS", "TIME", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportDataType {
    private static final /* synthetic */ SportDataType[] $VALUES;
    public static final SportDataType ALTITUDE;
    public static final SportDataType AVG_PACE;
    public static final SportDataType AVG_SPEED;
    public static final SportDataType CALORY;
    public static final SportDataType CLIMB;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final SportDataType DISTANCE;
    public static final SportDataType HEART_RATE;
    public static final SportDataType PACE;
    public static final SportDataType SPEED;
    public static final SportDataType STEPS;
    public static final SportDataType STEP_FREQ;
    public static final SportDataType TIME;

    @NotNull
    private final String defaultValue;
    private final int iconResId;

    @NotNull
    private final String id;
    private final int nameResId;
    private final int unitResId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/huami/moving/datacenter/SportDataType$Companion;", "", "", "id", "Lcom/huami/moving/datacenter/SportDataType;", "valueOfID", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final SportDataType valueOfID(@NotNull String id) {
            for (SportDataType sportDataType : SportDataType.values()) {
                if (Intrinsics.areEqual(sportDataType.getId(), id)) {
                    return sportDataType;
                }
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportDataType.values().length];
            iArr[SportDataType.DISTANCE.ordinal()] = 1;
            iArr[SportDataType.SPEED.ordinal()] = 2;
            iArr[SportDataType.AVG_SPEED.ordinal()] = 3;
            iArr[SportDataType.PACE.ordinal()] = 4;
            iArr[SportDataType.AVG_PACE.ordinal()] = 5;
            iArr[SportDataType.ALTITUDE.ordinal()] = 6;
            iArr[SportDataType.CLIMB.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        int i = R.drawable.ic_sporting_altitude;
        int i2 = R.string.running_altitude;
        int i3 = R.string.unit_m;
        ALTITUDE = new SportDataType("ALTITUDE", 0, i, i2, i3, "altitude", "--");
        int i4 = R.drawable.ic_sporting_avg_pace;
        int i5 = R.string.running_avg_speed_pace;
        int i6 = R.string.running_detail_pace1;
        AVG_PACE = new SportDataType("AVG_PACE", 1, i4, i5, i6, Constants.DATA_KEY_AVG_PACE, "00'00\"");
        int i7 = R.string.running_avg_speed;
        int i8 = R.string.running_detail_speed;
        AVG_SPEED = new SportDataType("AVG_SPEED", 2, i4, i7, i8, "avgSpeed", "00.00");
        CALORY = new SportDataType("CALORY", 3, R.drawable.ic_sporting_calory, R.string.sporting_calorie, R.string.running_cal_unit, "calory", IdManager.DEFAULT_VERSION_NAME);
        CLIMB = new SportDataType("CLIMB", 4, R.drawable.ic_sporting_climb, R.string.sporting_total_rise, i3, "climbDisAscend", "--");
        int i9 = R.drawable.ic_sporting_distance;
        int i10 = R.string.running_distance;
        int i11 = R.string.running_kilometer;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        DISTANCE = new SportDataType("DISTANCE", 5, i9, i10, i11, "distance", String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(0.0f)}, 1)));
        HEART_RATE = new SportDataType("HEART_RATE", 6, R.drawable.ic_sporting_heart_rate, R.string.running_hr, R.string.sport_heart_rate_unit, Constant.KEY_HR_VALUE, "--");
        int i12 = R.drawable.ic_sporting_pace;
        PACE = new SportDataType("PACE", 7, i12, R.string.runningdetail_tab_pace, i6, "pace", "00'00\"");
        SPEED = new SportDataType("SPEED", 8, i12, R.string.runningdetail_tab_speed, i8, "speed", "00.00");
        STEP_FREQ = new SportDataType("STEP_FREQ", 9, R.drawable.ic_sporting_step_freq, R.string.running_help_pace_freq, R.string.unit_pace_freq, Constants.DATA_KEY_STEP_FREQ, "--");
        STEPS = new SportDataType("STEPS", 10, R.drawable.ic_sporting_steps, R.string.running_step, R.plurals.sporting_data_unit_steps, GetWatermarkAPI.KEY_NAME_STEPS, "--");
        TIME = new SportDataType("TIME", 11, R.drawable.ic_sporting_time, R.string.sporting_duration, R.string.sporting_data_unit_duration, "time", "00:00:00");
        $VALUES = a();
        INSTANCE = new Companion(null);
    }

    private SportDataType(String str, int i, int i2, int i3, int i4, String str2, String str3) {
        super(str, i);
        this.iconResId = i2;
        this.nameResId = i3;
        this.unitResId = i4;
        this.id = str2;
        this.defaultValue = str3;
    }

    private static final /* synthetic */ SportDataType[] a() {
        return new SportDataType[]{ALTITUDE, AVG_PACE, AVG_SPEED, CALORY, CLIMB, DISTANCE, HEART_RATE, PACE, SPEED, STEP_FREQ, STEPS, TIME};
    }

    public static SportDataType valueOf(String str) {
        return (SportDataType) Enum.valueOf(SportDataType.class, str);
    }

    @JvmStatic
    @Nullable
    public static final SportDataType valueOfID(@NotNull String str) {
        return INSTANCE.valueOfID(str);
    }

    public static SportDataType[] values() {
        return (SportDataType[]) $VALUES.clone();
    }

    @NotNull
    public final String getDefaultValue() {
        return this.defaultValue;
    }

    public final int getIconResId() {
        return this.iconResId;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final int getNameResId() {
        return this.nameResId;
    }

    @NotNull
    public final String unit(@NotNull Context context, boolean isMetric) {
        int i;
        if (this == STEPS) {
            return context.getResources().getQuantityString(this.unitResId, 1);
        }
        if (!isMetric) {
            switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                    i = R.string.running_mile;
                    break;
                case 2:
                case 3:
                    i = R.string.running_detail_speed_br;
                    break;
                case 4:
                case 5:
                    i = R.string.running_detail_pace_br1;
                    break;
                case 6:
                case 7:
                    i = R.string.unit_foot;
                    break;
                default:
                    i = this.unitResId;
                    break;
            }
        } else {
            i = this.unitResId;
        }
        return context.getString(i);
    }
}
