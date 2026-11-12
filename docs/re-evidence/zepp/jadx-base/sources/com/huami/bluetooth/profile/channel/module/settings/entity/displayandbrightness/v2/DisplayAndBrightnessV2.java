package com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v2;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.DisplayAndBrightness;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringEnum;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 S2\u00020\u00012\u00020\u0002:\u0001SB\u0007¢\u0006\u0004\bQ\u0010RJ\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\r\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u001a\u001a\u0004\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010 \u001a\u0004\u0018\u00010\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010#\u001a\u0004\u0018\u00010\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR(\u0010)\u001a\u0004\u0018\u00010$2\b\u0010\u000f\u001a\u0004\u0018\u00010$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010,\u001a\u0004\u0018\u00010$2\b\u0010\u000f\u001a\u0004\u0018\u00010$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R(\u0010/\u001a\u0004\u0018\u00010\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010\u001fR(\u00102\u001a\u0004\u0018\u00010\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010\u001d\"\u0004\b1\u0010\u001fR(\u00105\u001a\u0004\u0018\u00010$2\b\u0010\u000f\u001a\u0004\u0018\u00010$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(R(\u00108\u001a\u0004\u0018\u00010$2\b\u0010\u000f\u001a\u0004\u0018\u00010$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u0010&\"\u0004\b7\u0010(R(\u0010;\u001a\u0004\u0018\u00010\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010\u001d\"\u0004\b:\u0010\u001fR(\u0010>\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010\u0011\"\u0004\b=\u0010\u0013R(\u0010A\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010\u0011\"\u0004\b@\u0010\u0013R(\u0010D\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010\u0011\"\u0004\bC\u0010\u0013R(\u0010J\u001a\u0004\u0018\u00010E2\b\u0010\u000f\u001a\u0004\u0018\u00010E8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR(\u0010M\u001a\u0004\u0018\u00010E2\b\u0010\u000f\u001a\u0004\u0018\u00010E8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010G\"\u0004\bL\u0010IR(\u0010P\u001a\u0004\u0018\u00010\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010\u001d\"\u0004\bO\u0010\u001f¨\u0006T"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;", "Ljava/io/Serializable;", "", "key", "", "keyToString", "e", LogUtil.I, "getGroupVersion", "()I", "setGroupVersion", "(I)V", "groupVersion", "", "value", "getAutoBrightness", "()Ljava/lang/Boolean;", "setAutoBrightness", "(Ljava/lang/Boolean;)V", "autoBrightness", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "getBrightness", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "setBrightness", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;)V", "brightness", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "getScreenOffTime", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "setScreenOffTime", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;)V", "screenOffTime", "getScreenOffDisplayMode", "setScreenOffDisplayMode", "screenOffDisplayMode", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "getScreenOffDisplayBeginTime", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "setScreenOffDisplayBeginTime", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;)V", "screenOffDisplayBeginTime", "getScreenOffDisplayEndTime", "setScreenOffDisplayEndTime", "screenOffDisplayEndTime", "getScreenOffDialPlateType", "setScreenOffDialPlateType", "screenOffDialPlateType", "getScreenOnByTurningWristMode", "setScreenOnByTurningWristMode", "screenOnByTurningWristMode", "getScreenOnByTurningWristBeginTime", "setScreenOnByTurningWristBeginTime", "screenOnByTurningWristBeginTime", "getScreenOnByTurningWristEndTime", "setScreenOnByTurningWristEndTime", "screenOnByTurningWristEndTime", "getScreenOnByTurningWristActiveSpeed", "setScreenOnByTurningWristActiveSpeed", "screenOnByTurningWristActiveSpeed", "getScreenOnByNewNotificationSwitch", "setScreenOnByNewNotificationSwitch", "screenOnByNewNotificationSwitch", "getScreenOnDuringSportSwitch", "setScreenOnDuringSportSwitch", "screenOnDuringSportSwitch", "getScreenOffFollowCurrentDialSwitch", "setScreenOffFollowCurrentDialSwitch", "screenOffFollowCurrentDialSwitch", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringEnum;", "getScreenOffDialId", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringEnum;", "setScreenOffDialId", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringEnum;)V", "screenOffDialId", "getHomeScreenStyle", "setHomeScreenStyle", "homeScreenStyle", "getScreenColorStyle", "setScreenColorStyle", "screenColorStyle", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DisplayAndBrightnessV2 extends DisplayAndBrightness implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int GROUP_VERSION = 2;

    @NotNull
    private static final HashMap<Integer, String> f;
    private static final int g;
    private static final int h;
    private static final int i;
    private static final int j;
    private static final int k;
    private static final int l;
    private static final int m;
    private static final int n;
    private static final int o;
    private static final int p;
    private static final int q;
    private static final int r;
    private static final int s;
    private static final long serialVersionUID = 1;
    private static final int t;
    private static final int u;
    private static final int v;
    private static final int w;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int groupVersion = 2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b2\u00103R5\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0010\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0019\u0010\u0012\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u0019\u0010\u0014\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\u0016\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\rR\u0019\u0010\u0018\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u001a\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\u001c\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\rR\u0019\u0010\u001e\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u001f\u0010\rR\u0019\u0010 \u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\rR\u0019\u0010\"\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b#\u0010\rR\u0019\u0010$\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u000b\u001a\u0004\b%\u0010\rR\u0019\u0010&\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010\u000b\u001a\u0004\b'\u0010\rR\u0019\u0010(\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010\u000b\u001a\u0004\b)\u0010\rR\u0019\u0010*\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010\u000b\u001a\u0004\b+\u0010\rR\u0019\u0010,\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010\u000b\u001a\u0004\b-\u0010\rR\u0016\u0010.\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u000bR\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2$Companion;", "", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "hashMap", "Ljava/util/HashMap;", "getHashMap", "()Ljava/util/HashMap;", "KEY_AUTO_BRIGHTNESS", LogUtil.I, "getKEY_AUTO_BRIGHTNESS", "()I", "KEY_BRIGHTNESS", "getKEY_BRIGHTNESS", "KEY_SCREEN_OFF_TIME", "getKEY_SCREEN_OFF_TIME", "KEY_OFF_DISPLAY_MODE", "getKEY_OFF_DISPLAY_MODE", "KEY_OFF_DISPLAY_BEGIN_TIME", "getKEY_OFF_DISPLAY_BEGIN_TIME", "KEY_OFF_DISPLAY_END_TIME", "getKEY_OFF_DISPLAY_END_TIME", "KEY_SCREEN_OFF_DIAL_PLATE_TYPE", "getKEY_SCREEN_OFF_DIAL_PLATE_TYPE", "KEY_SCREEN_ON_BY_TURNING_WRIST_MODE", "getKEY_SCREEN_ON_BY_TURNING_WRIST_MODE", "KEY_SCREEN_ON_BY_TURNING_WRIST_BEGIN_TIME", "getKEY_SCREEN_ON_BY_TURNING_WRIST_BEGIN_TIME", "KEY_SCREEN_ON_BY_TURNING_WRIST_END_TIME", "getKEY_SCREEN_ON_BY_TURNING_WRIST_END_TIME", "KEY_SCREEN_ON_BY_TURNING_WRIST_ACTIVE_SPEED", "getKEY_SCREEN_ON_BY_TURNING_WRIST_ACTIVE_SPEED", "KEY_SCREEN_ON_BY_NEW_NOTIFICATION_SWITCH", "getKEY_SCREEN_ON_BY_NEW_NOTIFICATION_SWITCH", "KEY_SCREEN_ON_DURING_SPORT_SWITCH", "getKEY_SCREEN_ON_DURING_SPORT_SWITCH", "KEY_SCREEN_OFF_FOLLOW_CURRENT_DIAL_SWITCH", "getKEY_SCREEN_OFF_FOLLOW_CURRENT_DIAL_SWITCH", "KEY_SCREEN_OFF_DIAL_ID", "getKEY_SCREEN_OFF_DIAL_ID", "KEY_HOME_SCREEN_STYLE", "getKEY_HOME_SCREEN_STYLE", "KEY_SCREEN_COLOR_STYLE", "getKEY_SCREEN_COLOR_STYLE", "GROUP_VERSION", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HashMap<Integer, String> getHashMap() {
            return DisplayAndBrightnessV2.f;
        }

        public final int getKEY_AUTO_BRIGHTNESS() {
            return DisplayAndBrightnessV2.g;
        }

        public final int getKEY_BRIGHTNESS() {
            return DisplayAndBrightnessV2.h;
        }

        public final int getKEY_HOME_SCREEN_STYLE() {
            return DisplayAndBrightnessV2.v;
        }

        public final int getKEY_OFF_DISPLAY_BEGIN_TIME() {
            return DisplayAndBrightnessV2.k;
        }

        public final int getKEY_OFF_DISPLAY_END_TIME() {
            return DisplayAndBrightnessV2.l;
        }

        public final int getKEY_OFF_DISPLAY_MODE() {
            return DisplayAndBrightnessV2.j;
        }

        public final int getKEY_SCREEN_COLOR_STYLE() {
            return DisplayAndBrightnessV2.w;
        }

        public final int getKEY_SCREEN_OFF_DIAL_ID() {
            return DisplayAndBrightnessV2.u;
        }

        public final int getKEY_SCREEN_OFF_DIAL_PLATE_TYPE() {
            return DisplayAndBrightnessV2.m;
        }

        public final int getKEY_SCREEN_OFF_FOLLOW_CURRENT_DIAL_SWITCH() {
            return DisplayAndBrightnessV2.t;
        }

        public final int getKEY_SCREEN_OFF_TIME() {
            return DisplayAndBrightnessV2.i;
        }

        public final int getKEY_SCREEN_ON_BY_NEW_NOTIFICATION_SWITCH() {
            return DisplayAndBrightnessV2.r;
        }

        public final int getKEY_SCREEN_ON_BY_TURNING_WRIST_ACTIVE_SPEED() {
            return DisplayAndBrightnessV2.q;
        }

        public final int getKEY_SCREEN_ON_BY_TURNING_WRIST_BEGIN_TIME() {
            return DisplayAndBrightnessV2.o;
        }

        public final int getKEY_SCREEN_ON_BY_TURNING_WRIST_END_TIME() {
            return DisplayAndBrightnessV2.p;
        }

        public final int getKEY_SCREEN_ON_BY_TURNING_WRIST_MODE() {
            return DisplayAndBrightnessV2.n;
        }

        public final int getKEY_SCREEN_ON_DURING_SPORT_SWITCH() {
            return DisplayAndBrightnessV2.s;
        }
    }

    static {
        HashMap<Integer, String> map = new HashMap<>();
        f = map;
        map.put(1, "自动亮度显示开关");
        g = 1;
        map.put(2, "亮度");
        h = 2;
        map.put(3, "自动息屏时间");
        i = 3;
        map.put(4, "息屏显示方式");
        j = 4;
        map.put(5, "息屏显示定时开启时间");
        k = 5;
        map.put(6, "息屏显示定时结束时间");
        l = 6;
        map.put(7, "息屏显示表盘样式");
        m = 7;
        map.put(8, "抬腕亮屏模式");
        n = 8;
        map.put(9, "抬腕亮屏定时开启时间");
        o = 9;
        map.put(10, "抬腕亮屏定时结束时间");
        p = 10;
        map.put(11, "抬腕亮屏响应速度");
        q = 11;
        map.put(12, "通知亮屏");
        r = 12;
        map.put(13, "运动中亮屏");
        s = 13;
        map.put(14, "息屏跟随当前表盘开关");
        t = 14;
        map.put(15, "息屏表盘ID");
        u = 15;
        map.put(16, "主界面风格");
        v = 16;
        map.put(17, "屏幕色彩风格");
        w = 17;
    }

    @Nullable
    public final Boolean getAutoBrightness() {
        return getBoolean(g);
    }

    @Nullable
    public final IntData getBrightness() {
        return getInt(h);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public int getGroupVersion() {
        return this.groupVersion;
    }

    @Nullable
    public final StringEnum getHomeScreenStyle() {
        return getStringEnum(v);
    }

    @Nullable
    public final EnumData getScreenColorStyle() {
        return getEnum(w);
    }

    @Nullable
    public final StringEnum getScreenOffDialId() {
        return getStringEnum(u);
    }

    @Nullable
    public final EnumData getScreenOffDialPlateType() {
        return getEnum(m);
    }

    @Nullable
    public final Time getScreenOffDisplayBeginTime() {
        return getTime(k);
    }

    @Nullable
    public final Time getScreenOffDisplayEndTime() {
        return getTime(l);
    }

    @Nullable
    public final EnumData getScreenOffDisplayMode() {
        return getEnum(j);
    }

    @Nullable
    public final Boolean getScreenOffFollowCurrentDialSwitch() {
        return getBoolean(t);
    }

    @Nullable
    public final EnumData getScreenOffTime() {
        return getEnum(i);
    }

    @Nullable
    public final Boolean getScreenOnByNewNotificationSwitch() {
        return getBoolean(r);
    }

    @Nullable
    public final EnumData getScreenOnByTurningWristActiveSpeed() {
        return getEnum(q);
    }

    @Nullable
    public final Time getScreenOnByTurningWristBeginTime() {
        return getTime(o);
    }

    @Nullable
    public final Time getScreenOnByTurningWristEndTime() {
        return getTime(p);
    }

    @Nullable
    public final EnumData getScreenOnByTurningWristMode() {
        return getEnum(n);
    }

    @Nullable
    public final Boolean getScreenOnDuringSportSwitch() {
        return getBoolean(s);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @Nullable
    public String keyToString(int key) {
        return f.get(Integer.valueOf(key));
    }

    public final void setAutoBrightness(@Nullable Boolean bool) {
        setBoolean(bool, g);
    }

    public final void setBrightness(@Nullable IntData intData) {
        setInt(intData, h);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public void setGroupVersion(int i2) {
        this.groupVersion = i2;
    }

    public final void setHomeScreenStyle(@Nullable StringEnum stringEnum) {
        setStringEnum(stringEnum, v);
    }

    public final void setScreenColorStyle(@Nullable EnumData enumData) {
        setEnum(enumData, w);
    }

    public final void setScreenOffDialId(@Nullable StringEnum stringEnum) {
        setStringEnum(stringEnum, u);
    }

    public final void setScreenOffDialPlateType(@Nullable EnumData enumData) {
        setEnum(enumData, m);
    }

    public final void setScreenOffDisplayBeginTime(@Nullable Time time) {
        setTime(time, k);
    }

    public final void setScreenOffDisplayEndTime(@Nullable Time time) {
        setTime(time, l);
    }

    public final void setScreenOffDisplayMode(@Nullable EnumData enumData) {
        setEnum(enumData, j);
    }

    public final void setScreenOffFollowCurrentDialSwitch(@Nullable Boolean bool) {
        setBoolean(bool, t);
    }

    public final void setScreenOffTime(@Nullable EnumData enumData) {
        setEnum(enumData, i);
    }

    public final void setScreenOnByNewNotificationSwitch(@Nullable Boolean bool) {
        setBoolean(bool, r);
    }

    public final void setScreenOnByTurningWristActiveSpeed(@Nullable EnumData enumData) {
        setEnum(enumData, q);
    }

    public final void setScreenOnByTurningWristBeginTime(@Nullable Time time) {
        setTime(time, o);
    }

    public final void setScreenOnByTurningWristEndTime(@Nullable Time time) {
        setTime(time, p);
    }

    public final void setScreenOnByTurningWristMode(@Nullable EnumData enumData) {
        setEnum(enumData, n);
    }

    public final void setScreenOnDuringSportSwitch(@Nullable Boolean bool) {
        setBoolean(bool, s);
    }
}
