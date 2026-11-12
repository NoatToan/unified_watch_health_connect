package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001eB\u0007¢\u0006\u0004\b&\u0010'J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u001c\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u001f\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR(\u0010\"\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR(\u0010%\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001b¨\u0006("}, d2 = {"Li5;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Ljava/io/Serializable;", "", "key", "", "keyToString", "settingsGroupName", "Ljava/lang/String;", "getSettingsGroupName", "()Ljava/lang/String;", "groupVersion", "I", "getGroupVersion", "()I", "setGroupVersion", "(I)V", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "groupType", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "getGroupType", "()Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "", "value", "getMultiLinkSwitch", "()Ljava/lang/Boolean;", PluginDeviceInfo.FICONON, "(Ljava/lang/Boolean;)V", "multiLinkSwitch", "getConnectedAdvSwitch", PluginDeviceInfo.FMODEL, "connectedAdvSwitch", "getRestrictedBindingSwitch", PluginDeviceInfo.FICONOFF, "restrictedBindingSwitch", "getHidSwitch", PluginDeviceInfo.FDESC, "hidSwitch", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class i5 extends Settings {
    public static final int A;
    public static final int B;
    private static final long serialVersionUID = 1;

    @NotNull
    public static final a w = new a(null);

    @NotNull
    public static final HashMap<Integer, String> x;
    public static final int y;
    public static final int z;

    @NotNull
    public final String t = HTTP.CONN_DIRECTIVE;
    public int u = 1;

    @NotNull
    public final SettingsGroupType v = SettingsGroupType.CONNECTION;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Li5$a;", "", "", "KEY_MULTI_LINK_SWITCH", "I", PluginDeviceInfo.FICONON, "()I", "KEY_CONNECTED_ADV_SWITCH", PluginDeviceInfo.FMODEL, "KEY_RESTRICTED_BINDING_SWITCH", PluginDeviceInfo.FICONOFF, "KEY_HID_SWITCH", PluginDeviceInfo.FDESC, "GROUP_VERSION", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return i5.z;
        }

        public final int b() {
            return i5.B;
        }

        public final int c() {
            return i5.y;
        }

        public final int d() {
            return i5.A;
        }
    }

    static {
        HashMap<Integer, String> map = new HashMap<>();
        x = map;
        map.put(1, "多连接开关");
        y = 1;
        map.put(2, "连接中广播开关");
        z = 2;
        map.put(3, "限制绑定开关");
        A = 3;
        map.put(4, "HID连接开关");
        B = 4;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @NotNull
    /* JADX INFO: renamed from: getGroupType, reason: from getter */
    public SettingsGroupType getV() {
        return this.v;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    /* JADX INFO: renamed from: getGroupVersion, reason: from getter */
    public int getU() {
        return this.u;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @NotNull
    /* JADX INFO: renamed from: getSettingsGroupName, reason: from getter */
    public String getT() {
        return this.t;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @Nullable
    public String keyToString(int key) {
        return x.get(Integer.valueOf(key));
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public void setGroupVersion(int i) {
        this.u = i;
    }

    public final void a(@Nullable Boolean bool) {
        setBoolean(bool, z);
    }

    public final void b(@Nullable Boolean bool) {
        setBoolean(bool, B);
    }

    public final void c(@Nullable Boolean bool) {
        setBoolean(bool, y);
    }

    public final void d(@Nullable Boolean bool) {
        setBoolean(bool, A);
    }
}
