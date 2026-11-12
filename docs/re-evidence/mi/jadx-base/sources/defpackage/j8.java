package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.DisplayAndBrightness;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.miui.circulate.device.api.Constant;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001=B\u0007¢\u0006\u0004\b;\u0010<J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\u0007\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0019\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010\"\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR(\u0010(\u001a\u0004\u0018\u00010#2\b\u0010\u000e\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010+\u001a\u0004\u0018\u00010#2\b\u0010\u000e\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R(\u0010.\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010\u001eR(\u00101\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR(\u00104\u001a\u0004\u0018\u00010#2\b\u0010\u000e\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R(\u00107\u001a\u0004\u0018\u00010#2\b\u0010\u000e\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010%\"\u0004\b6\u0010'R(\u0010:\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u0010\u001c\"\u0004\b9\u0010\u001e¨\u0006>"}, d2 = {"Lj8;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;", "Ljava/io/Serializable;", "", "key", "", "keyToString", "groupVersion", "I", "getGroupVersion", "()I", "setGroupVersion", "(I)V", "", "value", "getAutoBrightness", "()Ljava/lang/Boolean;", "setAutoBrightness", "(Ljava/lang/Boolean;)V", "autoBrightness", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "getBrightness", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "setBrightness", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;)V", "brightness", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "getScreenOffTime", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "setScreenOffTime", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;)V", "screenOffTime", "getScreenOffDisplayMode", "setScreenOffDisplayMode", "screenOffDisplayMode", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "getScreenOffDisplayBeginTime", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "setScreenOffDisplayBeginTime", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;)V", "screenOffDisplayBeginTime", "getScreenOffDisplayEndTime", "setScreenOffDisplayEndTime", "screenOffDisplayEndTime", "getScreenOffDialPlateType", "setScreenOffDialPlateType", "screenOffDialPlateType", "getScreenOnByTurningWristMode", "setScreenOnByTurningWristMode", "screenOnByTurningWristMode", "getScreenOnByTurningWristBeginTime", "setScreenOnByTurningWristBeginTime", "screenOnByTurningWristBeginTime", "getScreenOnByTurningWristEndTime", "setScreenOnByTurningWristEndTime", "screenOnByTurningWristEndTime", "getScreenOnByTurningWristActiveSpeed", "setScreenOnByTurningWristActiveSpeed", "screenOnByTurningWristActiveSpeed", "<init>", "()V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class j8 extends DisplayAndBrightness {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    private static final long serialVersionUID = 1;

    @NotNull
    public static final a u = new a(null);

    @NotNull
    public static final HashMap<Integer, String> v;
    public static final int w;
    public static final int x;
    public static final int y;
    public static final int z;
    public int t = 1;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lj8$a;", "", "", "KEY_AUTO_BRIGHTNESS", "I", PluginDeviceInfo.FMODEL, "()I", "KEY_BRIGHTNESS", PluginDeviceInfo.FDESC, "KEY_SCREEN_OFF_TIME", PluginDeviceInfo.FLOCALIZATIONS, "KEY_OFF_DISPLAY_MODE", PluginDeviceInfo.FICONOFFLINE, "KEY_OFF_DISPLAY_BEGIN_TIME", PluginDeviceInfo.FICONON, "KEY_OFF_DISPLAY_END_TIME", PluginDeviceInfo.FICONOFF, "KEY_SCREEN_OFF_DIAL_PLATE_TYPE", PluginDeviceInfo.FBLUETOOTHPAIR, "KEY_SCREEN_ON_BY_TURNING_WRIST_MODE", Constant.KeyValue.KEY_COLUMN, "KEY_SCREEN_ON_BY_TURNING_WRIST_BEGIN_TIME", "i", "KEY_SCREEN_ON_BY_TURNING_WRIST_END_TIME", "j", "KEY_SCREEN_ON_BY_TURNING_WRIST_ACTIVE_SPEED", "h", "GROUP_VERSION", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return j8.w;
        }

        public final int b() {
            return j8.x;
        }

        public final int c() {
            return j8.A;
        }

        public final int d() {
            return j8.B;
        }

        public final int e() {
            return j8.z;
        }

        public final int f() {
            return j8.C;
        }

        public final int g() {
            return j8.y;
        }

        public final int h() {
            return j8.G;
        }

        public final int i() {
            return j8.E;
        }

        public final int j() {
            return j8.F;
        }

        public final int k() {
            return j8.D;
        }
    }

    static {
        HashMap<Integer, String> map = new HashMap<>();
        v = map;
        map.put(1, "自动亮度显示开关");
        w = 1;
        map.put(2, "亮度");
        x = 2;
        map.put(3, "自动息屏时间");
        y = 3;
        map.put(4, "息屏显示方式");
        z = 4;
        map.put(5, "息屏显示定时开启时间");
        A = 5;
        map.put(6, "息屏显示定时结束时间");
        B = 6;
        map.put(7, "息屏显示表盘样式");
        C = 7;
        map.put(8, "抬腕亮屏模式");
        D = 8;
        map.put(9, "抬腕亮屏定时开启时间");
        E = 9;
        map.put(10, "抬腕亮屏定时结束时间");
        F = 10;
        map.put(11, "抬腕亮屏响应速度");
        G = 11;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    /* JADX INFO: renamed from: getGroupVersion, reason: from getter */
    public int getT() {
        return this.t;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @Nullable
    public String keyToString(int key) {
        return v.get(Integer.valueOf(key));
    }

    public final void setAutoBrightness(@Nullable Boolean bool) {
        setBoolean(bool, w);
    }

    public final void setBrightness(@Nullable IntData intData) {
        setInt(intData, x);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public void setGroupVersion(int i) {
        this.t = i;
    }

    public final void setScreenOffDialPlateType(@Nullable EnumData enumData) {
        setEnum(enumData, C);
    }

    public final void setScreenOffDisplayBeginTime(@Nullable Time time) {
        setTime(time, A);
    }

    public final void setScreenOffDisplayEndTime(@Nullable Time time) {
        setTime(time, B);
    }

    public final void setScreenOffDisplayMode(@Nullable EnumData enumData) {
        setEnum(enumData, z);
    }

    public final void setScreenOffTime(@Nullable EnumData enumData) {
        setEnum(enumData, y);
    }

    public final void setScreenOnByTurningWristActiveSpeed(@Nullable EnumData enumData) {
        setEnum(enumData, G);
    }

    public final void setScreenOnByTurningWristBeginTime(@Nullable Time time) {
        setTime(time, E);
    }

    public final void setScreenOnByTurningWristEndTime(@Nullable Time time) {
        setTime(time, F);
    }

    public final void setScreenOnByTurningWristMode(@Nullable EnumData enumData) {
        setEnum(enumData, D);
    }
}
