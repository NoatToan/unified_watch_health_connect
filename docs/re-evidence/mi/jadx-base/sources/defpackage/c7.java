package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Flag;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.TimeStamp;
import com.miui.circulate.device.api.Constant;
import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.onetrack.b.e;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001aB\u0007¢\u0006\u0004\bM\u0010NJ\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u001c\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\"\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0017\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010'\u001a\u0004\u0018\u00010#2\b\u0010\u0017\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b\u001a\u0010&R(\u0010*\u001a\u0004\u0018\u00010#2\b\u0010\u0017\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010%\"\u0004\b)\u0010&R(\u0010-\u001a\u0004\u0018\u00010#2\b\u0010\u0017\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010%\"\u0004\b,\u0010&R(\u0010/\u001a\u0004\u0018\u00010#2\b\u0010\u0017\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010%\"\u0004\b \u0010&R(\u00102\u001a\u0004\u0018\u00010#2\b\u0010\u0017\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010%\"\u0004\b1\u0010&R(\u00104\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0017\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010\u001f\"\u0004\b\u001a\u0010!R(\u00109\u001a\u0004\u0018\u0001052\b\u0010\u0017\u001a\u0004\u0018\u0001058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b \u00108R(\u0010;\u001a\u0004\u0018\u0001052\b\u0010\u0017\u001a\u0004\u0018\u0001058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u00107\"\u0004\b\u001a\u00108R(\u0010@\u001a\u0004\u0018\u00010<2\b\u0010\u0017\u001a\u0004\u0018\u00010<8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b\u001a\u0010?R(\u0010B\u001a\u0004\u0018\u00010<2\b\u0010\u0017\u001a\u0004\u0018\u00010<8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010>\"\u0004\b \u0010?R(\u0010G\u001a\u0004\u0018\u00010C2\b\u0010\u0017\u001a\u0004\u0018\u00010C8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\b\u001a\u0010FR(\u0010I\u001a\u0004\u0018\u00010<2\b\u0010\u0017\u001a\u0004\u0018\u00010<8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010>\"\u0004\b,\u0010?R(\u0010L\u001a\u0004\u0018\u00010#2\b\u0010\u0017\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010%\"\u0004\bK\u0010&¨\u0006O"}, d2 = {"Lc7;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Ljava/io/Serializable;", "", "key", "", "keyToString", "settingsGroupName", "Ljava/lang/String;", "getSettingsGroupName", "()Ljava/lang/String;", "groupVersion", "I", "getGroupVersion", "()I", "setGroupVersion", "(I)V", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "groupType", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "getGroupType", "()Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "value", "z", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", PluginDeviceInfo.FMODEL, "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;)V", "upgradeOrder", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Flag;", "v", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Flag;", PluginDeviceInfo.FDESC, "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Flag;)V", "languageFamily", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringData;", FitnessFilePathUtils.TimeZoneConstant.POSITIVE, "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringData;", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringData;)V", "baseResourceVersion", "u", PluginDeviceInfo.FICONOFFLINE, "increaseResourceVersion", "s", PluginDeviceInfo.FICONON, "fontVersion", "r", "externalResourceVersion", DeviceTagInterface.CUSTOM_TAG_TYPE, PluginDeviceInfo.FICONOFF, "gpsFirmwareVersion", "n", "aGpsType", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/TimeStamp;", DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER, "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/TimeStamp;", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/TimeStamp;)V", "aGpsUpgradeTime", "m", "aGpsExpirationTime", "", "q", "()Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)V", "differentialPackageOtaMark", "A", "isDomesticProduct", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "y", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;)V", "systemImageStatus", Constants.DEVICE_TYPE_WEAR, "lockStatus", "x", PluginDeviceInfo.FBLUETOOTHPAIR, "offlineVoiceVersion", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class c7 extends Settings {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;

    @JvmField
    public static final int F;

    @JvmField
    public static final int G;

    @JvmField
    public static final int H;
    public static final int I;
    public static final int J;
    public static final int K;
    public static final int L;
    public static final int M;
    private static final long serialVersionUID = 1;

    @NotNull
    public static final a w = new a(null);

    @NotNull
    public static final HashMap<Integer, String> x;
    public static final int y;
    public static final int z;

    @NotNull
    public final String t = "DeviceInformation";
    public int u = 1;

    @NotNull
    public final SettingsGroupType v = SettingsGroupType.DEVICE_INFORMATION;

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0004R\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0004R\u0014\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u0004R0\u0010$\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\"0!j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\"`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lc7$a;", "", "", "KEY_UPGRADE_ORDER", "I", e.f13808a, "()I", "KEY_LANGUAGE_FAMILY", "h", "KEY_BASE_RESOURCE_VERSION", PluginDeviceInfo.FMODEL, "KEY_INCREASE_RESOURCE_VERSION", PluginDeviceInfo.FBLUETOOTHPAIR, "KEY_FONT_VERSION", PluginDeviceInfo.FICONOFF, "KEY_EXTERNAL_RESOURCE_VERSION", PluginDeviceInfo.FICONON, "KEY_GPS_FIRMWARE_VERSION", PluginDeviceInfo.FICONOFFLINE, "KEY_DIFFERENTIAL_PACKAGE_OTA_MARK", PluginDeviceInfo.FDESC, "KEY_IS_DOMESTIC_PRODUCT", PluginDeviceInfo.FLOCALIZATIONS, "KEY_SYSTEM_IMAGE_STATUS", Constant.KeyValue.KEY_COLUMN, "KEY_LOCK_STATUS", "i", "KEY_OFFLINE_VOICE_VERSION", "j", "GROUP_VERSION", "KEY_A_GPS_EXPIRATION_TIME", "KEY_A_GPS_TYPE", "KEY_A_GPS_UPGRADE_TIME", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "hashMap", "Ljava/util/HashMap;", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return c7.A;
        }

        public final int b() {
            return c7.I;
        }

        public final int c() {
            return c7.D;
        }

        public final int d() {
            return c7.C;
        }

        public final int e() {
            return c7.E;
        }

        public final int f() {
            return c7.B;
        }

        public final int g() {
            return c7.J;
        }

        public final int h() {
            return c7.z;
        }

        public final int i() {
            return c7.L;
        }

        public final int j() {
            return c7.M;
        }

        public final int k() {
            return c7.K;
        }

        public final int l() {
            return c7.y;
        }
    }

    static {
        HashMap<Integer, String> map = new HashMap<>();
        x = map;
        map.put(1, "固件升级顺序");
        y = 1;
        map.put(2, "当前固件支持的语系");
        z = 2;
        map.put(3, "基础资源版本号");
        A = 3;
        map.put(4, "（增量）资源版本号");
        B = 4;
        map.put(5, "字体版本号");
        C = 5;
        map.put(6, "扩展资源版本号");
        D = 6;
        map.put(7, "GPS固件版本号");
        E = 7;
        map.put(8, "A-GPS类型");
        F = 8;
        map.put(9, "A-GPS更新时间");
        G = 9;
        map.put(10, "A-GPS过期时间");
        H = 10;
        map.put(11, "差分包升级标记");
        I = 11;
        map.put(12, "是否是国内版产品");
        J = 12;
        map.put(13, "系统镜像状态");
        K = 13;
        map.put(14, "设备锁定状态");
        L = 14;
        map.put(15, "离线语音版本号");
        M = 15;
    }

    @Nullable
    public final Boolean A() {
        return getBoolean(J);
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

    @Nullable
    public final TimeStamp m() {
        return getTimeStamp(H);
    }

    @Nullable
    public final Flag n() {
        return getFlag(F);
    }

    @Nullable
    public final TimeStamp o() {
        return getTimeStamp(G);
    }

    @Nullable
    public final StringData p() {
        return getString(A);
    }

    @Nullable
    public final Boolean q() {
        return getBoolean(I);
    }

    @Nullable
    public final StringData r() {
        return getString(D);
    }

    @Nullable
    public final StringData s() {
        return getString(C);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public void setGroupVersion(int i) {
        this.u = i;
    }

    @Nullable
    public final StringData t() {
        return getString(E);
    }

    @Nullable
    public final StringData u() {
        return getString(B);
    }

    @Nullable
    public final Flag v() {
        return getFlag(z);
    }

    @Nullable
    public final Boolean w() {
        return getBoolean(L);
    }

    @Nullable
    public final StringData x() {
        return getString(M);
    }

    @Nullable
    public final EnumData y() {
        return getEnum(K);
    }

    @Nullable
    public final IntData z() {
        return getInt(y);
    }

    public final void a(@Nullable IntData intData) {
        setInt(intData, y);
    }

    public final void b(@Nullable Flag flag) {
        setFlag(flag, z);
    }

    public final void c(@Nullable StringData stringData) {
        setString(stringData, C);
    }

    public final void d(@Nullable StringData stringData) {
        setString(stringData, E);
    }

    public final void e(@Nullable StringData stringData) {
        setString(stringData, B);
    }

    public final void f(@Nullable StringData stringData) {
        setString(stringData, M);
    }

    public final void a(@Nullable StringData stringData) {
        setString(stringData, A);
    }

    public final void b(@Nullable StringData stringData) {
        setString(stringData, D);
    }

    public final void c(@Nullable Boolean bool) {
        setBoolean(bool, L);
    }

    public final void a(@Nullable Flag flag) {
        setFlag(flag, F);
    }

    public final void b(@Nullable TimeStamp timeStamp) {
        setTimeStamp(timeStamp, G);
    }

    public final void a(@Nullable TimeStamp timeStamp) {
        setTimeStamp(timeStamp, H);
    }

    public final void b(@Nullable Boolean bool) {
        setBoolean(bool, J);
    }

    public final void a(@Nullable Boolean bool) {
        setBoolean(bool, I);
    }

    public final void a(@Nullable EnumData enumData) {
        setEnum(enumData, K);
    }
}
