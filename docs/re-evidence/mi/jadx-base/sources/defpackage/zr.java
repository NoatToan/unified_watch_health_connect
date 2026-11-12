package defpackage;

import com.huami.bluetooth.profile.ecf.data.HidStatus;
import com.huami.bluetooth.profile.ecf.data.StandAlertConfig;
import com.miui.circulate.device.api.Constant;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.model.HMAutoBacklightInfo;
import com.xiaomi.hm.health.bt.model.HMHrReminder;
import com.xiaomi.hm.health.bt.model.HMTarget;
import com.xiaomi.hm.health.bt.profile.base.a;
import com.xiaomi.onetrack.b.e;
import com.xiaomi.onetrack.c.q;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H&J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H&J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H&J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H&J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H&J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H&J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0015\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H&J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H&J\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0010\u0010\u0017J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH&J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u001aH&¢\u0006\u0004\b\u0016\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH&J\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001aH&¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H&J\u0011\u0010 \u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b \u0010\u0017J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H&J\u0011\u0010\"\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\"\u0010\u0017J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H&J\u0011\u0010$\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b$\u0010\u0017J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H&J\u0011\u0010%\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b%\u0010\u0017J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H&J\u0011\u0010'\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b'\u0010\u0017J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H&J\n\u0010\u000e\u001a\u0004\u0018\u00010(H&J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H&J\n\u0010+\u001a\u0004\u0018\u00010(H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H&J!\u0010\u0006\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.2\b\u00100\u001a\u0004\u0018\u00010\u001aH&¢\u0006\u0004\b\u0006\u00101J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u001aH&J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u001aH&¢\u0006\u0004\b\u0014\u0010\u001cJ\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u001aH&J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0006\u0010\u0017J\u0011\u0010#\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b#\u0010\u0017J\u0011\u00103\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b3\u0010\u0017J\u0010\u00104\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u00106\u001a\u000205H&J\u0010\u00107\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H&J\u0011\u00107\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b7\u0010\u0017J\u0010\u00103\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0004H&¨\u00069"}, d2 = {"Lzr;", "", "Lfd;", "mode", "", "show", PluginDeviceInfo.FMODEL, "Lqd;", "source", "Lcom/xiaomi/hm/health/bt/profile/base/a;", "enable", "m", "Lcom/huami/bluetooth/profile/ecf/data/HidStatus;", "hidStatus", PluginDeviceInfo.FLOCALIZATIONS, "disable", "i", "is12Hour", Constant.KeyValue.KEY_COLUMN, "isMetric", PluginDeviceInfo.FDESC, PluginDeviceInfo.FBLUETOOTHPAIR, PluginDeviceInfo.FICONON, "()Ljava/lang/Boolean;", "enableOsa", "getOsaEnable", "", "value", "()Ljava/lang/Integer;", "setHrMaxValue", "getHrMaxValue", "enablePressure", "getPressureEnable", "enablePressureAlert", "getPressureAlertEnable", PluginDeviceInfo.FICONOFFLINE, "j", "getAtrialFibEnable", "enableAtrialAlertSleepNotDisturb", "getAtrialAlertSleepNotDisturbEnable", "Lcom/xiaomi/hm/health/bt/model/HMHrReminder;", "hrReminder", "setLowHrReminder", "getLowHrReminder", "Lcom/huami/bluetooth/profile/ecf/data/StandAlertConfig;", q.f13857a, "Lcom/xiaomi/hm/health/bt/model/HMTarget;", "target", "settingsVersion", "(Lcom/xiaomi/hm/health/bt/model/HMTarget;Ljava/lang/Integer;)Z", "interval", "h", e.f13808a, "Lcom/xiaomi/hm/health/bt/model/HMAutoBacklightInfo;", "info", PluginDeviceInfo.FICONOFF, "open", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface zr {
    @Nullable
    a a(@NotNull qd source);

    @Nullable
    Boolean a();

    boolean a(int mode);

    boolean a(@NotNull HidStatus hidStatus);

    boolean a(@NotNull StandAlertConfig config);

    boolean a(@NotNull HMAutoBacklightInfo info);

    boolean a(@NotNull HMHrReminder hrReminder);

    boolean a(@NotNull HMTarget target, @Nullable Integer settingsVersion);

    boolean a(@NotNull fd mode, boolean show);

    boolean a(boolean enable);

    boolean a(boolean enable, int interval);

    @Nullable
    Integer b();

    boolean b(int value);

    boolean b(boolean isMetric);

    @Nullable
    Integer c();

    boolean c(boolean enable);

    @Nullable
    Boolean d();

    boolean d(boolean disable);

    @Nullable
    Boolean e();

    boolean e(boolean enable);

    boolean enableAtrialAlertSleepNotDisturb(boolean enable);

    boolean enableOsa(boolean enable);

    boolean enablePressure(boolean enable);

    boolean enablePressureAlert(boolean enable);

    @Nullable
    Boolean f();

    boolean f(boolean enable);

    @Nullable
    HMHrReminder g();

    boolean g(boolean enable);

    @Nullable
    Boolean getAtrialAlertSleepNotDisturbEnable();

    @Nullable
    Boolean getAtrialFibEnable();

    @Nullable
    Integer getHrMaxValue();

    @Nullable
    HMHrReminder getLowHrReminder();

    @Nullable
    Boolean getOsaEnable();

    @Nullable
    Boolean getPressureAlertEnable();

    @Nullable
    Boolean getPressureEnable();

    @Nullable
    Boolean h();

    boolean h(boolean open);

    @Nullable
    Boolean i();

    boolean i(boolean disable);

    @Nullable
    Boolean j();

    boolean j(boolean enable);

    boolean k(boolean is12Hour);

    boolean l(boolean enable);

    boolean m(boolean enable);

    boolean setHrMaxValue(int value);

    boolean setLowHrReminder(@NotNull HMHrReminder hrReminder);
}
