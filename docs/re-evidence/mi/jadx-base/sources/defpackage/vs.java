package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0017B\u0007¢\u0006\u0004\b*\u0010+J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\u0007\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0019\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u001c\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R(\u0010!\u001a\u0004\u0018\u00010\u001d2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b\u0017\u0010 R(\u0010$\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0012R(\u0010&\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0010\"\u0004\b\u0017\u0010\u0012R(\u0010)\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\u0010\"\u0004\b(\u0010\u0012¨\u0006,"}, d2 = {"Lvs;", "Lus;", "Ljava/io/Serializable;", "", "key", "", "keyToString", "groupVersion", "I", "getGroupVersion", "()I", "setGroupVersion", "(I)V", "", "value", "getMuteSwitch", "()Ljava/lang/Boolean;", PluginDeviceInfo.FDESC, "(Ljava/lang/Boolean;)V", "muteSwitch", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "getVolume", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", PluginDeviceInfo.FMODEL, "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;)V", "volume", "getNotificationVibrationSwitch", PluginDeviceInfo.FICONON, "notificationVibrationSwitch", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "getNotificationVibrationStrength", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;)V", "notificationVibrationStrength", "getSystemVibrationSwitch", PluginDeviceInfo.FICONOFFLINE, "systemVibrationSwitch", "getCrownVibrationSwitch", "crownVibrationSwitch", "getRemindSwitch", PluginDeviceInfo.FICONOFF, "remindSwitch", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class vs extends us {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    private static final long serialVersionUID = 1;

    @NotNull
    public static final a x = new a(null);

    @NotNull
    public static final HashMap<Integer, String> y;
    public static final int z;
    public int w = 1;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lvs$a;", "", "", "KEY_MUTE_SWITCH", "I", PluginDeviceInfo.FDESC, "()I", "KEY_VOLUME", PluginDeviceInfo.FLOCALIZATIONS, "KEY_NOTIFICATION_VIBRATION_SWITCH", PluginDeviceInfo.FICONOFF, "KEY_NOTIFICATION_VIBRATION_STRENGTH", PluginDeviceInfo.FICONON, "KEY_SYSTEM_VIBRATION_SWITCH", PluginDeviceInfo.FBLUETOOTHPAIR, "KEY_CROWN_VIBRATION_SWITCH", PluginDeviceInfo.FMODEL, "KEY_REMIND_SWITCH", PluginDeviceInfo.FICONOFFLINE, "GROUP_VERSION", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return vs.E;
        }

        public final int b() {
            return vs.z;
        }

        public final int c() {
            return vs.C;
        }

        public final int d() {
            return vs.B;
        }

        public final int e() {
            return vs.F;
        }

        public final int f() {
            return vs.D;
        }

        public final int g() {
            return vs.A;
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

    public final void b(@Nullable Boolean bool) {
        setBoolean(bool, z);
    }

    public final void c(@Nullable Boolean bool) {
        setBoolean(bool, B);
    }

    public final void d(@Nullable Boolean bool) {
        setBoolean(bool, F);
    }

    public final void e(@Nullable Boolean bool) {
        setBoolean(bool, D);
    }

    public final void a(@Nullable EnumData enumData) {
        setEnum(enumData, C);
    }

    public final void a(@Nullable Boolean bool) {
        setBoolean(bool, E);
    }
}
