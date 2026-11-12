package com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v2;

import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.DisplayAndBrightness;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringEnum;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.miui.circulate.device.api.Constant;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.onetrack.b.e;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0001SB\u0007¢\u0006\u0004\bP\u0010QJ\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\u0007\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0019\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010\"\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR(\u0010(\u001a\u0004\u0018\u00010#2\b\u0010\u000e\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010+\u001a\u0004\u0018\u00010#2\b\u0010\u000e\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R(\u0010.\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010\u001eR(\u00101\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR(\u00104\u001a\u0004\u0018\u00010#2\b\u0010\u000e\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R(\u00107\u001a\u0004\u0018\u00010#2\b\u0010\u000e\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010%\"\u0004\b6\u0010'R(\u0010:\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u0010\u001c\"\u0004\b9\u0010\u001eR(\u0010=\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010\u0010\"\u0004\b<\u0010\u0012R(\u0010@\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010\u0010\"\u0004\b?\u0010\u0012R(\u0010C\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010\u0010\"\u0004\bB\u0010\u0012R(\u0010I\u001a\u0004\u0018\u00010D2\b\u0010\u000e\u001a\u0004\u0018\u00010D8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR(\u0010L\u001a\u0004\u0018\u00010D2\b\u0010\u000e\u001a\u0004\u0018\u00010D8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010HR(\u0010O\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010\u001c\"\u0004\bN\u0010\u001e¨\u0006T"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;", "Ljava/io/Serializable;", "", "key", "", "keyToString", "groupVersion", "I", "getGroupVersion", "()I", "setGroupVersion", "(I)V", "", "value", "getAutoBrightness", "()Ljava/lang/Boolean;", "setAutoBrightness", "(Ljava/lang/Boolean;)V", "autoBrightness", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "getBrightness", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "setBrightness", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;)V", "brightness", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "getScreenOffTime", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "setScreenOffTime", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;)V", "screenOffTime", "getScreenOffDisplayMode", "setScreenOffDisplayMode", "screenOffDisplayMode", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "getScreenOffDisplayBeginTime", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "setScreenOffDisplayBeginTime", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;)V", "screenOffDisplayBeginTime", "getScreenOffDisplayEndTime", "setScreenOffDisplayEndTime", "screenOffDisplayEndTime", "getScreenOffDialPlateType", "setScreenOffDialPlateType", "screenOffDialPlateType", "getScreenOnByTurningWristMode", "setScreenOnByTurningWristMode", "screenOnByTurningWristMode", "getScreenOnByTurningWristBeginTime", "setScreenOnByTurningWristBeginTime", "screenOnByTurningWristBeginTime", "getScreenOnByTurningWristEndTime", "setScreenOnByTurningWristEndTime", "screenOnByTurningWristEndTime", "getScreenOnByTurningWristActiveSpeed", "setScreenOnByTurningWristActiveSpeed", "screenOnByTurningWristActiveSpeed", "getScreenOnByNewNotificationSwitch", "setScreenOnByNewNotificationSwitch", "screenOnByNewNotificationSwitch", "getScreenOnDuringSportSwitch", "setScreenOnDuringSportSwitch", "screenOnDuringSportSwitch", "getScreenOffFollowCurrentDialSwitch", "setScreenOffFollowCurrentDialSwitch", "screenOffFollowCurrentDialSwitch", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringEnum;", "getScreenOffDialId", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringEnum;", "setScreenOffDialId", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringEnum;)V", "screenOffDialId", "getHomeScreenStyle", "setHomeScreenStyle", "homeScreenStyle", "getScreenColorStyle", "setScreenColorStyle", "screenColorStyle", "<init>", "()V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class DisplayAndBrightnessV2 extends DisplayAndBrightness {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int GROUP_VERSION = 2;
    private static final int KEY_AUTO_BRIGHTNESS;
    private static final int KEY_BRIGHTNESS;
    private static final int KEY_HOME_SCREEN_STYLE;
    private static final int KEY_OFF_DISPLAY_BEGIN_TIME;
    private static final int KEY_OFF_DISPLAY_END_TIME;
    private static final int KEY_OFF_DISPLAY_MODE;
    private static final int KEY_SCREEN_COLOR_STYLE;
    private static final int KEY_SCREEN_OFF_DIAL_ID;
    private static final int KEY_SCREEN_OFF_DIAL_PLATE_TYPE;
    private static final int KEY_SCREEN_OFF_FOLLOW_CURRENT_DIAL_SWITCH;
    private static final int KEY_SCREEN_OFF_TIME;
    private static final int KEY_SCREEN_ON_BY_NEW_NOTIFICATION_SWITCH;
    private static final int KEY_SCREEN_ON_BY_TURNING_WRIST_ACTIVE_SPEED;
    private static final int KEY_SCREEN_ON_BY_TURNING_WRIST_BEGIN_TIME;
    private static final int KEY_SCREEN_ON_BY_TURNING_WRIST_END_TIME;
    private static final int KEY_SCREEN_ON_BY_TURNING_WRIST_MODE;
    private static final int KEY_SCREEN_ON_DURING_SPORT_SWITCH;

    @NotNull
    private static final HashMap<Integer, String> hashMap;
    private static final long serialVersionUID = 1;
    private int groupVersion = 2;

    /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v2.DisplayAndBrightnessV2$a, reason: from kotlin metadata */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006R\u0014\u0010'\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0004R\u0014\u0010)\u001a\u00020(8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2$a;", "", "", "KEY_AUTO_BRIGHTNESS", "I", PluginDeviceInfo.FMODEL, "()I", "KEY_BRIGHTNESS", PluginDeviceInfo.FDESC, "KEY_SCREEN_OFF_TIME", Constant.KeyValue.KEY_COLUMN, "KEY_OFF_DISPLAY_MODE", PluginDeviceInfo.FBLUETOOTHPAIR, "KEY_OFF_DISPLAY_BEGIN_TIME", PluginDeviceInfo.FICONOFF, "KEY_OFF_DISPLAY_END_TIME", PluginDeviceInfo.FICONOFFLINE, "KEY_SCREEN_OFF_DIAL_PLATE_TYPE", "i", "KEY_SCREEN_ON_BY_TURNING_WRIST_MODE", FitnessFilePathUtils.TimeZoneConstant.POSITIVE, "KEY_SCREEN_ON_BY_TURNING_WRIST_BEGIN_TIME", "n", "KEY_SCREEN_ON_BY_TURNING_WRIST_END_TIME", DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER, "KEY_SCREEN_ON_BY_TURNING_WRIST_ACTIVE_SPEED", "m", "KEY_SCREEN_ON_BY_NEW_NOTIFICATION_SWITCH", e.f13808a, "KEY_SCREEN_ON_DURING_SPORT_SWITCH", "q", "KEY_SCREEN_OFF_FOLLOW_CURRENT_DIAL_SWITCH", "j", "KEY_SCREEN_OFF_DIAL_ID", "h", "KEY_HOME_SCREEN_STYLE", PluginDeviceInfo.FICONON, "KEY_SCREEN_COLOR_STYLE", PluginDeviceInfo.FLOCALIZATIONS, "GROUP_VERSION", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return DisplayAndBrightnessV2.KEY_AUTO_BRIGHTNESS;
        }

        public final int b() {
            return DisplayAndBrightnessV2.KEY_BRIGHTNESS;
        }

        public final int c() {
            return DisplayAndBrightnessV2.KEY_HOME_SCREEN_STYLE;
        }

        public final int d() {
            return DisplayAndBrightnessV2.KEY_OFF_DISPLAY_BEGIN_TIME;
        }

        public final int e() {
            return DisplayAndBrightnessV2.KEY_OFF_DISPLAY_END_TIME;
        }

        public final int f() {
            return DisplayAndBrightnessV2.KEY_OFF_DISPLAY_MODE;
        }

        public final int g() {
            return DisplayAndBrightnessV2.KEY_SCREEN_COLOR_STYLE;
        }

        public final int h() {
            return DisplayAndBrightnessV2.KEY_SCREEN_OFF_DIAL_ID;
        }

        public final int i() {
            return DisplayAndBrightnessV2.KEY_SCREEN_OFF_DIAL_PLATE_TYPE;
        }

        public final int j() {
            return DisplayAndBrightnessV2.KEY_SCREEN_OFF_FOLLOW_CURRENT_DIAL_SWITCH;
        }

        public final int k() {
            return DisplayAndBrightnessV2.KEY_SCREEN_OFF_TIME;
        }

        public final int l() {
            return DisplayAndBrightnessV2.KEY_SCREEN_ON_BY_NEW_NOTIFICATION_SWITCH;
        }

        public final int m() {
            return DisplayAndBrightnessV2.KEY_SCREEN_ON_BY_TURNING_WRIST_ACTIVE_SPEED;
        }

        public final int n() {
            return DisplayAndBrightnessV2.KEY_SCREEN_ON_BY_TURNING_WRIST_BEGIN_TIME;
        }

        public final int o() {
            return DisplayAndBrightnessV2.KEY_SCREEN_ON_BY_TURNING_WRIST_END_TIME;
        }

        public final int p() {
            return DisplayAndBrightnessV2.KEY_SCREEN_ON_BY_TURNING_WRIST_MODE;
        }

        public final int q() {
            return DisplayAndBrightnessV2.KEY_SCREEN_ON_DURING_SPORT_SWITCH;
        }
    }

    static {
        HashMap<Integer, String> map = new HashMap<>();
        hashMap = map;
        map.put(1, "自动亮度显示开关");
        KEY_AUTO_BRIGHTNESS = 1;
        map.put(2, "亮度");
        KEY_BRIGHTNESS = 2;
        map.put(3, "自动息屏时间");
        KEY_SCREEN_OFF_TIME = 3;
        map.put(4, "息屏显示方式");
        KEY_OFF_DISPLAY_MODE = 4;
        map.put(5, "息屏显示定时开启时间");
        KEY_OFF_DISPLAY_BEGIN_TIME = 5;
        map.put(6, "息屏显示定时结束时间");
        KEY_OFF_DISPLAY_END_TIME = 6;
        map.put(7, "息屏显示表盘样式");
        KEY_SCREEN_OFF_DIAL_PLATE_TYPE = 7;
        map.put(8, "抬腕亮屏模式");
        KEY_SCREEN_ON_BY_TURNING_WRIST_MODE = 8;
        map.put(9, "抬腕亮屏定时开启时间");
        KEY_SCREEN_ON_BY_TURNING_WRIST_BEGIN_TIME = 9;
        map.put(10, "抬腕亮屏定时结束时间");
        KEY_SCREEN_ON_BY_TURNING_WRIST_END_TIME = 10;
        map.put(11, "抬腕亮屏响应速度");
        KEY_SCREEN_ON_BY_TURNING_WRIST_ACTIVE_SPEED = 11;
        map.put(12, "通知亮屏");
        KEY_SCREEN_ON_BY_NEW_NOTIFICATION_SWITCH = 12;
        map.put(13, "运动中亮屏");
        KEY_SCREEN_ON_DURING_SPORT_SWITCH = 13;
        map.put(14, "息屏跟随当前表盘开关");
        KEY_SCREEN_OFF_FOLLOW_CURRENT_DIAL_SWITCH = 14;
        map.put(15, "息屏表盘ID");
        KEY_SCREEN_OFF_DIAL_ID = 15;
        map.put(16, "主界面风格");
        KEY_HOME_SCREEN_STYLE = 16;
        map.put(17, "屏幕色彩风格");
        KEY_SCREEN_COLOR_STYLE = 17;
    }

    @Nullable
    public final Boolean getAutoBrightness() {
        return getBoolean(KEY_AUTO_BRIGHTNESS);
    }

    @Nullable
    public final IntData getBrightness() {
        return getInt(KEY_BRIGHTNESS);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public int getGroupVersion() {
        return this.groupVersion;
    }

    @Nullable
    public final StringEnum getHomeScreenStyle() {
        return getStringEnum(KEY_HOME_SCREEN_STYLE);
    }

    @Nullable
    public final EnumData getScreenColorStyle() {
        return getEnum(KEY_SCREEN_COLOR_STYLE);
    }

    @Nullable
    public final StringEnum getScreenOffDialId() {
        return getStringEnum(KEY_SCREEN_OFF_DIAL_ID);
    }

    @Nullable
    public final EnumData getScreenOffDialPlateType() {
        return getEnum(KEY_SCREEN_OFF_DIAL_PLATE_TYPE);
    }

    @Nullable
    public final Time getScreenOffDisplayBeginTime() {
        return getTime(KEY_OFF_DISPLAY_BEGIN_TIME);
    }

    @Nullable
    public final Time getScreenOffDisplayEndTime() {
        return getTime(KEY_OFF_DISPLAY_END_TIME);
    }

    @Nullable
    public final EnumData getScreenOffDisplayMode() {
        return getEnum(KEY_OFF_DISPLAY_MODE);
    }

    @Nullable
    public final Boolean getScreenOffFollowCurrentDialSwitch() {
        return getBoolean(KEY_SCREEN_OFF_FOLLOW_CURRENT_DIAL_SWITCH);
    }

    @Nullable
    public final EnumData getScreenOffTime() {
        return getEnum(KEY_SCREEN_OFF_TIME);
    }

    @Nullable
    public final Boolean getScreenOnByNewNotificationSwitch() {
        return getBoolean(KEY_SCREEN_ON_BY_NEW_NOTIFICATION_SWITCH);
    }

    @Nullable
    public final EnumData getScreenOnByTurningWristActiveSpeed() {
        return getEnum(KEY_SCREEN_ON_BY_TURNING_WRIST_ACTIVE_SPEED);
    }

    @Nullable
    public final Time getScreenOnByTurningWristBeginTime() {
        return getTime(KEY_SCREEN_ON_BY_TURNING_WRIST_BEGIN_TIME);
    }

    @Nullable
    public final Time getScreenOnByTurningWristEndTime() {
        return getTime(KEY_SCREEN_ON_BY_TURNING_WRIST_END_TIME);
    }

    @Nullable
    public final EnumData getScreenOnByTurningWristMode() {
        return getEnum(KEY_SCREEN_ON_BY_TURNING_WRIST_MODE);
    }

    @Nullable
    public final Boolean getScreenOnDuringSportSwitch() {
        return getBoolean(KEY_SCREEN_ON_DURING_SPORT_SWITCH);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @Nullable
    public String keyToString(int key) {
        return hashMap.get(Integer.valueOf(key));
    }

    public final void setAutoBrightness(@Nullable Boolean bool) {
        setBoolean(bool, KEY_AUTO_BRIGHTNESS);
    }

    public final void setBrightness(@Nullable IntData intData) {
        setInt(intData, KEY_BRIGHTNESS);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public void setGroupVersion(int i) {
        this.groupVersion = i;
    }

    public final void setHomeScreenStyle(@Nullable StringEnum stringEnum) {
        setStringEnum(stringEnum, KEY_HOME_SCREEN_STYLE);
    }

    public final void setScreenColorStyle(@Nullable EnumData enumData) {
        setEnum(enumData, KEY_SCREEN_COLOR_STYLE);
    }

    public final void setScreenOffDialId(@Nullable StringEnum stringEnum) {
        setStringEnum(stringEnum, KEY_SCREEN_OFF_DIAL_ID);
    }

    public final void setScreenOffDialPlateType(@Nullable EnumData enumData) {
        setEnum(enumData, KEY_SCREEN_OFF_DIAL_PLATE_TYPE);
    }

    public final void setScreenOffDisplayBeginTime(@Nullable Time time) {
        setTime(time, KEY_OFF_DISPLAY_BEGIN_TIME);
    }

    public final void setScreenOffDisplayEndTime(@Nullable Time time) {
        setTime(time, KEY_OFF_DISPLAY_END_TIME);
    }

    public final void setScreenOffDisplayMode(@Nullable EnumData enumData) {
        setEnum(enumData, KEY_OFF_DISPLAY_MODE);
    }

    public final void setScreenOffFollowCurrentDialSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_SCREEN_OFF_FOLLOW_CURRENT_DIAL_SWITCH);
    }

    public final void setScreenOffTime(@Nullable EnumData enumData) {
        setEnum(enumData, KEY_SCREEN_OFF_TIME);
    }

    public final void setScreenOnByNewNotificationSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_SCREEN_ON_BY_NEW_NOTIFICATION_SWITCH);
    }

    public final void setScreenOnByTurningWristActiveSpeed(@Nullable EnumData enumData) {
        setEnum(enumData, KEY_SCREEN_ON_BY_TURNING_WRIST_ACTIVE_SPEED);
    }

    public final void setScreenOnByTurningWristBeginTime(@Nullable Time time) {
        setTime(time, KEY_SCREEN_ON_BY_TURNING_WRIST_BEGIN_TIME);
    }

    public final void setScreenOnByTurningWristEndTime(@Nullable Time time) {
        setTime(time, KEY_SCREEN_ON_BY_TURNING_WRIST_END_TIME);
    }

    public final void setScreenOnByTurningWristMode(@Nullable EnumData enumData) {
        setEnum(enumData, KEY_SCREEN_ON_BY_TURNING_WRIST_MODE);
    }

    public final void setScreenOnDuringSportSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_SCREEN_ON_DURING_SPORT_SWITCH);
    }
}
