package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumArray;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.miui.circulate.device.api.Constant;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.b.e;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0017B\u0007¢\u0006\u0004\b<\u0010=J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\u0007\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0019\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u001c\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R(\u0010\"\u001a\u0004\u0018\u00010\u001d2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010%\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R(\u0010'\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0010\"\u0004\b \u0010\u0012R(\u0010*\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\u0010\"\u0004\b)\u0010\u0012R(\u0010,\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010\u0010\"\u0004\b\u0017\u0010\u0012R(\u0010/\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010\u0010\"\u0004\b.\u0010\u0012R(\u00102\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010\u0010\"\u0004\b1\u0010\u0012R(\u00107\u001a\u0004\u0018\u0001032\b\u0010\u000e\u001a\u0004\u0018\u0001038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b\u0017\u00106R(\u00109\u001a\u0004\u0018\u00010\u001d2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u0010\u001f\"\u0004\b\u0017\u0010!R(\u0010;\u001a\u0004\u0018\u00010\u001d2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010\u001f\"\u0004\b\u0011\u0010!¨\u0006>"}, d2 = {"Lxs;", "Lus;", "Ljava/io/Serializable;", "", "key", "", "keyToString", "groupVersion", "I", "getGroupVersion", "()I", "setGroupVersion", "(I)V", "", "value", "getMuteSwitch", "()Ljava/lang/Boolean;", PluginDeviceInfo.FICONON, "(Ljava/lang/Boolean;)V", "muteSwitch", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "getVolume", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", PluginDeviceInfo.FMODEL, "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;)V", "volume", "getNotificationVibrationSwitch", PluginDeviceInfo.FICONOFF, "notificationVibrationSwitch", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "getNotificationVibrationStrength", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", PluginDeviceInfo.FDESC, "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;)V", "notificationVibrationStrength", "getSystemVibrationSwitch", PluginDeviceInfo.FLOCALIZATIONS, "systemVibrationSwitch", "getCrownVibrationSwitch", "crownVibrationSwitch", "getRemindSwitch", PluginDeviceInfo.FICONOFFLINE, "remindSwitch", "getCoverScreenMutingSwitch", "coverScreenMutingSwitch", "getVibrationFeedbackSwitch", "h", "vibrationFeedbackSwitch", "getSportVoiceReportSwitch", PluginDeviceInfo.FBLUETOOTHPAIR, "sportVoiceReportSwitch", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumArray;", "getBuzzerScenes", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumArray;", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumArray;)V", "buzzerScenes", "getBuzzerVibrateStrength", "buzzerVibrateStrength", "getSystemVibrationStrength", "systemVibrationStrength", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class xs extends us {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;
    public static final int J;
    public static final int K;
    public static final int L;
    private static final long serialVersionUID = 1;

    @NotNull
    public static final a x = new a(null);

    @NotNull
    public static final HashMap<Integer, String> y;
    public static final int z;
    public int w = 2;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0004R\u0014\u0010!\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lxs$a;", "", "", "KEY_MUTE_SWITCH", "I", PluginDeviceInfo.FICONOFFLINE, "()I", "KEY_VOLUME", "m", "KEY_NOTIFICATION_VIBRATION_SWITCH", PluginDeviceInfo.FLOCALIZATIONS, "KEY_NOTIFICATION_VIBRATION_STRENGTH", PluginDeviceInfo.FBLUETOOTHPAIR, "KEY_SYSTEM_VIBRATION_SWITCH", Constant.KeyValue.KEY_COLUMN, "KEY_CROWN_VIBRATION_SWITCH", PluginDeviceInfo.FICONOFF, "KEY_REMIND_SWITCH", "h", "KEY_COVER_SCREEN_MUTING_SWITCH", PluginDeviceInfo.FICONON, "KEY_VIBRATION_FEEDBACK_SWITCH", e.f13808a, "KEY_SPORT_VOICE_REPORT_SWITCH", "i", "KEY_BUZZER_SCENES", PluginDeviceInfo.FMODEL, "KEY_BUZZER_VIBRATE_STRENGTH", PluginDeviceInfo.FDESC, "KEY_SYSTEM_VIBRATION_STRENGTH", "j", "GROUP_VERSION", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return xs.J;
        }

        public final int b() {
            return xs.K;
        }

        public final int c() {
            return xs.G;
        }

        public final int d() {
            return xs.E;
        }

        public final int e() {
            return xs.z;
        }

        public final int f() {
            return xs.C;
        }

        public final int g() {
            return xs.B;
        }

        public final int h() {
            return xs.F;
        }

        public final int i() {
            return xs.I;
        }

        public final int j() {
            return xs.L;
        }

        public final int k() {
            return xs.D;
        }

        public final int l() {
            return xs.H;
        }

        public final int m() {
            return xs.A;
        }
    }

    static {
        HashMap<Integer, String> map = new HashMap<>();
        y = map;
        map.put(1, "静音开关");
        z = 1;
        map.put(2, "音量");
        A = 2;
        map.put(3, "通知振动开关");
        B = 3;
        map.put(4, "通知振动强度");
        C = 4;
        map.put(5, "系统振动开关");
        D = 5;
        map.put(6, "表冠振动开关");
        E = 6;
        map.put(7, "铃声提醒开关");
        F = 7;
        map.put(8, "覆屏静音");
        G = 8;
        map.put(9, "振动反馈 - 除表冠振动外所有的振动效果");
        H = 9;
        map.put(10, "运动语音播报 - 播报功能");
        I = 10;
        map.put(16, "蜂鸣器场景");
        J = 16;
        map.put(17, "蜂鸣器振动强度");
        K = 17;
        map.put(18, "系统全局震动强度");
        L = 18;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    /* JADX INFO: renamed from: getGroupVersion, reason: from getter */
    public int getW() {
        return this.w;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @Nullable
    public String keyToString(int key) {
        return y.get(Integer.valueOf(key));
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public void setGroupVersion(int i) {
        this.w = i;
    }

    public final void a(@Nullable IntData intData) {
        setInt(intData, A);
    }

    public final void b(@Nullable EnumData enumData) {
        setEnum(enumData, C);
    }

    public final void c(@Nullable Boolean bool) {
        setBoolean(bool, z);
    }

    public final void d(@Nullable Boolean bool) {
        setBoolean(bool, B);
    }

    public final void e(@Nullable Boolean bool) {
        setBoolean(bool, F);
    }

    public final void f(@Nullable Boolean bool) {
        setBoolean(bool, I);
    }

    public final void g(@Nullable Boolean bool) {
        setBoolean(bool, D);
    }

    public final void h(@Nullable Boolean bool) {
        setBoolean(bool, H);
    }

    public final void a(@Nullable Boolean bool) {
        setBoolean(bool, G);
    }

    public final void b(@Nullable Boolean bool) {
        setBoolean(bool, E);
    }

    public final void c(@Nullable EnumData enumData) {
        setEnum(enumData, L);
    }

    public final void a(@Nullable EnumArray enumArray) {
        setEnumArray(enumArray, J);
    }

    public final void a(@Nullable EnumData enumData) {
        setEnum(enumData, K);
    }
}
