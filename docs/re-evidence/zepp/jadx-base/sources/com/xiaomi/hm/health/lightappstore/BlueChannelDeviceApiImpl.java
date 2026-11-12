package com.xiaomi.hm.health.lightappstore;

import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.devicex.injection.basic.InstallValidState;
import com.huami.flutter.bluechannelplugin.BlueChannelDeviceApi;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.devicex.JsAppInstallValidApiImpl;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/lightappstore/BlueChannelDeviceApiImpl;", "Lcom/huami/flutter/bluechannelplugin/BlueChannelDeviceApi;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getConnectedDevice", "", "supportLowVersion", "", "obtainOtaStatus", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BlueChannelDeviceApiImpl implements BlueChannelDeviceApi {
    private static final long a = 0;
    private static final long b = 1;
    private static final long c = 2;
    private static final long d = 3;
    private static final long e = 4;
    private static final long f = 5;
    private static final long g = 6;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InstallValidState.values().length];
            iArr[InstallValidState.OHTER.ordinal()] = 1;
            iArr[InstallValidState.AVAILABLE.ordinal()] = 2;
            iArr[InstallValidState.DFU_BUSY.ordinal()] = 3;
            iArr[InstallValidState.DATA_SYNC.ordinal()] = 4;
            iArr[InstallValidState.DISCONNECT.ordinal()] = 5;
            iArr[InstallValidState.LOW_BATTERY.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Object> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "Obtain ota status, firmware version is low";
        }
    }

    @Override // com.huami.flutter.bluechannelplugin.BlueChannelDeviceApi
    @Nullable
    public HMBaseDevice getConnectedDevice() {
        return HMDeviceManager.getInstance().getDevice();
    }

    @Override // com.huami.flutter.bluechannelplugin.BlueChannelDeviceApi
    public long obtainOtaStatus(@NotNull String supportLowVersion) {
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        if (ProfileUtils.getVersionCodeFromVersionName(supportLowVersion) > ProfileUtils.getVersionCodeFromVersionName(hMDeviceManager.getBoundDeviceFirmwareVersion(hMDeviceType))) {
            LogcatKt.error$default(Logcat.INSTANCE, null, a.a, 1, null);
            return 6L;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[new JsAppInstallValidApiImpl().valid(hMDeviceType).ordinal()]) {
            case 1:
                return 0L;
            case 2:
                return 1L;
            case 3:
                return 2L;
            case 4:
                return 3L;
            case 5:
                return 4L;
            case 6:
                return 5L;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
