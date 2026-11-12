package com.huami.watch.companion.device.config;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.util.Log;
import com.tencent.connect.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/huami/watch/companion/device/config/DeviceFeature;", "", "Lcom/huami/watch/companion/device/Device;", "device", "", "isSupportWatchFaceSetting", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "isSupportWatchFaceCustomBg", "isSupportAllDayStress", "isSupportNFC", "isSupportAGpsSonyLLE", "isSupportCloudWatchFaceList", "isSupportRrPeak", "", "Ljava/lang/String;", "TAG", "MUSIC_CONTROL", "<init>", "()V", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceFeature {

    @NotNull
    public static final DeviceFeature INSTANCE = new DeviceFeature();

    @NotNull
    public static final String MUSIC_CONTROL = "MusicControl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "Device-Feature";

    private DeviceFeature() {
    }

    private final boolean a(Device device) {
        boolean zIsRomSupport = DeviceUtil.isRomSupport(device, DeviceSource.isModelEverest2Oversea(device) ? new String[]{"4", "2", "5", "0"} : new String[]{"4", "0", "14", "5"});
        Log.d(TAG, "IsSupport Everest2 MCU WatchFace Setting: " + zIsRomSupport, new Object[0]);
        return zIsRomSupport;
    }

    @JvmStatic
    public static final boolean isSupportAGpsSonyLLE(@NotNull Device device) {
        boolean zIsRomSupport;
        if (DeviceSource.isSeriesEverest2(device)) {
            zIsRomSupport = DeviceUtil.isRomSupport(device, DeviceSource.isModelEverest2Oversea(device) ? new String[]{"4", "2", "7", "0"} : new String[]{"4", "0", "18", "0"});
        } else {
            zIsRomSupport = false;
        }
        Log.d(TAG, "IsSupport AGps Sony LLE: " + zIsRomSupport, new Object[0]);
        return zIsRomSupport;
    }

    @JvmStatic
    public static final boolean isSupportAllDayStress(@NotNull Device device) {
        boolean zIsRomSupport = !DeviceSource.isModelEverest2Oversea(device);
        if (zIsRomSupport) {
            zIsRomSupport = DeviceUtil.isRomSupport(device, new String[]{"4", "0", Constants.VIA_REPORT_TYPE_WPA_STATE, "0"});
        }
        Log.d(TAG, "IsSupport AllDay Stress: " + zIsRomSupport, new Object[0]);
        return zIsRomSupport;
    }

    @JvmStatic
    public static final boolean isSupportCloudWatchFaceList(@NotNull Device device) {
        boolean zIsRomSupport = DeviceSource.isModelQogirMainland(device) ? DeviceUtil.isRomSupport(device, new String[]{"3", "0", "52", "0"}) : DeviceSource.isSeriesEverest2(device);
        Log.d(TAG, "IsSupport Cloud WatchFace : " + zIsRomSupport, new Object[0]);
        return zIsRomSupport;
    }

    @JvmStatic
    public static final boolean isSupportNFC(@NotNull Device device) {
        return !DeviceSource.isModelXihuEA(device) && DeviceUtil.isSupportNFC(device);
    }

    @JvmStatic
    public static final boolean isSupportRrPeak(@NotNull Device device) {
        String[] strArr;
        if (!DeviceUtil.isSupportAtrialFibrillation(device)) {
            return false;
        }
        if (DeviceSource.isModelXihuE(device)) {
            strArr = new String[]{"1", "1", "18", "0"};
        } else if (DeviceSource.isModelXihuDisney(device)) {
            strArr = new String[]{"1", "3", "18", "0"};
        } else if (DeviceSource.isModelXihu(device)) {
            strArr = new String[]{"1", "0", "18", "0"};
        } else {
            strArr = DeviceSource.isModelQogirMainland(device) ? new String[]{"3", "0", "52", "0"} : null;
        }
        boolean zIsRomSupport = DeviceUtil.isRomSupport(device, strArr);
        Log.d(TAG, "IsSupport RrPeak: " + zIsRomSupport, new Object[0]);
        return zIsRomSupport;
    }

    @JvmStatic
    public static final boolean isSupportWatchFaceCustomBg(@Nullable Context context) {
        boolean zIsRomSupportLoadBg = DeviceUtil.isRomSupportLoadBg(context);
        if (zIsRomSupportLoadBg) {
            Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
            zIsRomSupportLoadBg = (currentDevice == null || currentDevice.isMcuMode()) ? false : true;
        }
        Log.d(TAG, "IsSupport WatchFace Custom Background: " + zIsRomSupportLoadBg, new Object[0]);
        return zIsRomSupportLoadBg;
    }

    @JvmStatic
    public static final boolean isSupportWatchFaceSetting(@NotNull Device device) {
        boolean zA = (DeviceSource.isSeriesEverest2(device) && device.isMcuMode()) ? INSTANCE.a(device) : true;
        Log.d(TAG, "IsSupport WatchFace Setting: " + zA, new Object[0]);
        return zA;
    }
}
