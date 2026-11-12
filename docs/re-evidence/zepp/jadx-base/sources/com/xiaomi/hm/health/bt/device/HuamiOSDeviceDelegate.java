package com.xiaomi.hm.health.bt.device;

import androidx.exifinterface.media.ExifInterface;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.ChannelModuleProvider;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u0014\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fR\u0019\u0010\u0016\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HuamiOSDeviceDelegate;", "", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "moduleClass", "getChannelModule", "(Ljava/lang/Class;)Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "", "moduleId", "", "supportModule", "", "Lcom/xiaomi/hm/health/bt/profile/milipro/model/AlarmClockExt;", "clocks", "resetAlarms", "getAlarms", "Lcom/xiaomi/hm/health/bt/device/HMBaseBleDevice;", "a", "Lcom/xiaomi/hm/health/bt/device/HMBaseBleDevice;", "getBleDevice", "()Lcom/xiaomi/hm/health/bt/device/HMBaseBleDevice;", "bleDevice", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseBleDevice;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HuamiOSDeviceDelegate {

    @NotNull
    private static final String b = "HuamiOSDeviceDelegate";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMBaseBleDevice bleDevice;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "setAlarms getChannelModule null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "clear alarm failed";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "add alarm failed";
        }
    }

    public HuamiOSDeviceDelegate(@NotNull HMBaseBleDevice hMBaseBleDevice) {
        this.bleDevice = hMBaseBleDevice;
    }

    @Nullable
    public final List<AlarmClockExt> getAlarms() {
        AlarmModule alarmModule = (AlarmModule) getChannelModule(AlarmModule.class);
        if (alarmModule == null) {
            return null;
        }
        return alarmModule.inquireAlarmSync();
    }

    @NotNull
    public final HMBaseBleDevice getBleDevice() {
        return this.bleDevice;
    }

    @Nullable
    public final <T extends BaseModule> T getChannelModule(@NotNull Class<T> moduleClass) {
        return (T) ChannelModuleProvider.INSTANCE.of(this.bleDevice).get(moduleClass);
    }

    public final boolean resetAlarms(@NotNull List<? extends AlarmClockExt> clocks) {
        AlarmModule alarmModule = (AlarmModule) getChannelModule(AlarmModule.class);
        if (alarmModule == null) {
            HMLog.info(b, a.a);
            return false;
        }
        if (!alarmModule.clearAlarmSync()) {
            HMLog.info(b, b.a);
            return false;
        }
        boolean zAddAlarmsSync = alarmModule.addAlarmsSync(clocks);
        if (!zAddAlarmsSync) {
            HMLog.info(b, c.a);
        }
        return zAddAlarmsSync;
    }

    public final boolean supportModule(int moduleId) {
        return this.bleDevice.supportModule(moduleId);
    }
}
