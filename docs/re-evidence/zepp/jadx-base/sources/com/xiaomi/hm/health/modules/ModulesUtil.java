package com.xiaomi.hm.health.modules;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\b\u0010\n\u001a\u00020\bH\u0007J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007J\n\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/modules/ModulesUtil;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getCurrentDeviceSource", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getCurrentDevice", "deviceSource", "getDevice", "", "isCurrentDeviceConnected", "isCurrentDeviceMili", "getCurrentDeviceMili", "getCurrentDeviceWatch", "", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ModulesUtil {

    @NotNull
    public static final ModulesUtil INSTANCE = new ModulesUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "Modules-Util";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ HMBaseDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMBaseDevice hMBaseDevice) {
            super(0);
            this.a = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "CurrentDevice: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ HMBaseDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HMBaseDevice hMBaseDevice) {
            super(0);
            this.a = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "CurrentDevice MILI: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceSource a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HMDeviceSource hMDeviceSource) {
            super(0);
            this.a = hMDeviceSource;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "CurrentDeviceSource: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ HMBaseDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HMBaseDevice hMBaseDevice) {
            super(0);
            this.a = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "CurrentDevice Watch: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "CurrentDevice is Connected: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "CurrentDevice is MILI: " + this.a;
        }
    }

    private ModulesUtil() {
    }

    @JvmStatic
    @Nullable
    public static final HMBaseDevice getCurrentDevice() {
        HMDeviceSource currentDeviceSource = getCurrentDeviceSource();
        HMBaseDevice device = currentDeviceSource == null ? null : getDevice(currentDeviceSource);
        HMLog.info(TAG, new a(device));
        return device;
    }

    @JvmStatic
    @Nullable
    public static final HMBaseDevice getCurrentDeviceMili() {
        HMDeviceSource currentDeviceSource = getCurrentDeviceSource();
        HMBaseDevice device = null;
        if (currentDeviceSource != null) {
            if (!ModulesUtilKt.isMili(currentDeviceSource)) {
                currentDeviceSource = null;
            }
            if (currentDeviceSource != null) {
                device = getDevice(currentDeviceSource);
            }
        }
        HMLog.info(TAG, new b(device));
        return device;
    }

    @JvmStatic
    @Nullable
    public static final HMDeviceSource getCurrentDeviceSource() {
        HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI);
        if (boundDeviceSource == HMDeviceSource.VDEVICE) {
            boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.WATCH);
        }
        HMLog.info(TAG, new c(boundDeviceSource));
        return boundDeviceSource;
    }

    @JvmStatic
    @Nullable
    public static final HMBaseDevice getCurrentDeviceWatch() {
        HMDeviceSource currentDeviceSource = getCurrentDeviceSource();
        HMBaseDevice device = null;
        if (currentDeviceSource != null) {
            if (!ModulesUtilKt.isWatch(currentDeviceSource)) {
                currentDeviceSource = null;
            }
            if (currentDeviceSource != null) {
                device = getDevice(currentDeviceSource);
            }
        }
        HMLog.info(TAG, new d(device));
        return device;
    }

    @JvmStatic
    @Nullable
    public static final HMBaseDevice getDevice(@NotNull HMDeviceSource deviceSource) {
        return HMDeviceManager.getInstance().getDevice(deviceSource.getType());
    }

    @JvmStatic
    public static final boolean isCurrentDeviceConnected() {
        HMBaseDevice currentDevice = getCurrentDevice();
        boolean zIsConnected = currentDevice == null ? false : currentDevice.isConnected();
        HMLog.info(TAG, new e(zIsConnected));
        return zIsConnected;
    }

    @JvmStatic
    public static final boolean isCurrentDeviceMili() {
        HMDeviceSource currentDeviceSource = getCurrentDeviceSource();
        boolean zIsMili = currentDeviceSource == null ? false : ModulesUtilKt.isMili(currentDeviceSource);
        HMLog.info(TAG, new f(zIsMili));
        return zIsMili;
    }
}
