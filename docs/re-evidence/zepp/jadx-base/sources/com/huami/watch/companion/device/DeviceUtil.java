package com.huami.watch.companion.device;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.device.config.FeatureConfig;
import com.huami.watch.companion.device.config.Features;
import com.huami.watch.companion.device.feasupp.EverestFs;
import com.huami.watch.companion.device.feasupp.HuangHeFs;
import com.huami.watch.companion.device.feasupp.IFeatureSupp;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.Log;
import com.xiaomi.mipush.sdk.Constants;
import java.util.UUID;

/* JADX INFO: loaded from: classes16.dex */
public class DeviceUtil {
    public static final String UNKNOWN_DID = "UnknownDID";
    public static String VER_DEBUG_SUFFIX = "-debug";
    private static final String a = "Util-Device";

    private static IFeatureSupp a(Device device) {
        if (device == null) {
            return null;
        }
        return DeviceSource.isModelEverest(device) ? new EverestFs() : new HuangHeFs();
    }

    public static String addressShort(String str) {
        try {
            return str.substring(str.length() - 5, str.length() - 3) + str.substring(str.length() - 2);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private static boolean b(Device device) {
        return FeatureConfig.get().support(device, Features.SMART_OS) || (device != null && (DeviceSource.isModelQogir(device) || DeviceSource.isSeriesEverest2(device)));
    }

    private static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            if (str.contains(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
                String[] strArrSplit = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                if (strArrSplit.length > 0) {
                    str = strArrSplit[strArrSplit.length - 1];
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            return str.split(" ").length > 0 ? str.split(" ")[0] : str;
        } catch (Exception e2) {
            e2.printStackTrace();
            return str;
        }
    }

    public static String generateUUIDFromCpuId(String str) {
        String string;
        if (TextUtils.isEmpty(str)) {
            string = null;
        } else {
            try {
                string = UUID.nameUUIDFromBytes(str.getBytes()).toString();
            } catch (Exception e) {
                e.printStackTrace();
                Analytics.exception(new Exception("UUID from CPUID Err", e));
                string = null;
            }
        }
        Log.d(a, "UUID from CPUID : " + str + ", " + string, new Object[0]);
        return string;
    }

    public static String getHuamiModel(@NonNull Device device) {
        String huamiModel = device.info().getHuamiModel();
        if (TextUtils.isEmpty(huamiModel)) {
            return isOverseaEdition(device) ? DeviceSource.MODEL_HUANGHE_PACE : DeviceSource.MODEL_HUANGHE;
        }
        return huamiModel;
    }

    public static String getRomVersion(Context context) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        return currentDevice != null ? getRomVersion(currentDevice) : "";
    }

    public static boolean hasEmptyInfo(@NonNull Device device) {
        return TextUtils.isEmpty(device.getSN()) || TextUtils.isEmpty(device.getCpuId()) || TextUtils.isEmpty(device.info().getHuamiModel());
    }

    public static boolean isCurrentOverseaEdition(Context context) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        boolean zIsLocaleOversea = true;
        boolean z = currentDevice != null;
        if (z) {
            boolean zIsOverseaEdition = currentDevice.isOverseaEdition();
            if (zIsOverseaEdition || !DeviceSource.isModelEverest2Oversea(currentDevice)) {
                zIsLocaleOversea = zIsOverseaEdition;
            }
        } else {
            zIsLocaleOversea = Config.isLocaleOversea(context);
        }
        Log.d(a, "Has Bound Device : " + z + ", Is OverseaEdition : " + zIsLocaleOversea, new Object[0]);
        return zIsLocaleOversea;
    }

    public static boolean isCurrentXihuSeries(@NonNull Context context) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        return currentDevice != null && DeviceSource.isSeriesXihu(currentDevice);
    }

    public static boolean isLastBoundByIOS(Device device) {
        if (device == null) {
            Log.w(a, "Device is null, abort!!", new Object[0]);
            return false;
        }
        String lastBindingPlatform = device.getLastBindingPlatform();
        boolean z = !TextUtils.isEmpty(lastBindingPlatform) && lastBindingPlatform.contains("ios");
        Log.d(a, "LastBindingPlatform : " + lastBindingPlatform + ", isFromIOS : " + z, new Object[0]);
        return z;
    }

    public static boolean isOverseaEdition(@NonNull Device device) {
        return device.isOverseaEdition();
    }

    public static boolean isRomSupport(@NonNull Device device, String[] strArr) {
        int i;
        char cCharAt;
        int i2;
        char cCharAt2;
        if (strArr == null) {
            return false;
        }
        try {
            String romVersion = getRomVersion(device);
            Log.d(a, "Rom Version : " + romVersion, new Object[0]);
            if (TextUtils.isEmpty(romVersion)) {
                return false;
            }
            if (romVersion.contains(VER_DEBUG_SUFFIX)) {
                romVersion = romVersion.replace(VER_DEBUG_SUFFIX, "");
            }
            String[] strArrSplit = romVersion.split("\\.");
            int iMax = Math.max(strArrSplit.length, strArr.length);
            for (int i3 = 0; i3 < iMax; i3++) {
                if (iMax == strArr.length && i3 > strArrSplit.length - 1) {
                    return false;
                }
                if (iMax != strArrSplit.length || i3 <= strArr.length - 1) {
                    String str = strArrSplit[i3];
                    String str2 = strArr[i3];
                    if (Character.isDigit(str.charAt(str.length() - 1))) {
                        i = Integer.parseInt(str);
                        cCharAt = 0;
                    } else {
                        i = Integer.parseInt(str.substring(0, str.length() - 1));
                        cCharAt = str.charAt(str.length() - 1);
                    }
                    if (Character.isDigit(str2.charAt(str2.length() - 1))) {
                        i2 = Integer.parseInt(str2);
                        cCharAt2 = 0;
                    } else {
                        i2 = Integer.parseInt(str2.substring(0, str2.length() - 1));
                        cCharAt2 = str2.charAt(str2.length() - 1);
                    }
                    if (i != i2) {
                        if (i <= i2) {
                            return false;
                        }
                    } else if (cCharAt != cCharAt2) {
                        if (cCharAt <= cCharAt2) {
                            return false;
                        }
                    } else if (i3 != iMax - 1) {
                    }
                }
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isRomSupportAutoUpdate(Context context) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (b(currentDevice)) {
            return true;
        }
        IFeatureSupp iFeatureSuppA = a(currentDevice);
        return iFeatureSuppA != null && iFeatureSuppA.isRomSupportAutoUpdate(currentDevice);
    }

    public static boolean isRomSupportFTP(Device device) {
        if (b(device)) {
            return true;
        }
        IFeatureSupp iFeatureSuppA = a(device);
        return iFeatureSuppA != null && iFeatureSuppA.isRomSupportFTP(device);
    }

    public static boolean isRomSupportHRR(Context context) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (b(currentDevice)) {
            return true;
        }
        IFeatureSupp iFeatureSuppA = a(currentDevice);
        return iFeatureSuppA != null && iFeatureSuppA.isRomSupportHRR(currentDevice);
    }

    public static boolean isRomSupportHideSportItem(Device device) {
        if (b(device)) {
            return true;
        }
        IFeatureSupp iFeatureSuppA = a(device);
        return iFeatureSuppA != null && iFeatureSuppA.isRomSupportHideSportItem(device);
    }

    public static boolean isRomSupportIntervalRest(Device device) {
        if (device == null) {
            return false;
        }
        if (DeviceSource.isModelEverest(device)) {
            return isRomSupport(device, isOverseaEdition(device) ? new String[]{"2", "3", "11", "0"} : new String[]{"2", "0", "56", "0"});
        }
        return DeviceSource.isSeriesEverest2(device);
    }

    public static boolean isRomSupportIntervalRun(Device device) {
        if (b(device)) {
            return true;
        }
        IFeatureSupp iFeatureSuppA = a(device);
        return iFeatureSuppA != null && iFeatureSuppA.isRomSupportIntervalRun(device);
    }

    public static boolean isRomSupportLapPace(Context context) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (b(currentDevice)) {
            return true;
        }
        IFeatureSupp iFeatureSuppA = a(currentDevice);
        return iFeatureSuppA != null && iFeatureSuppA.isRomSupportLapPace(currentDevice);
    }

    public static boolean isRomSupportLoadBg(Context context) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (currentDevice == null) {
            return false;
        }
        if (DeviceSource.isSeriesEverest2(currentDevice)) {
            return true;
        }
        if (!b(currentDevice)) {
            IFeatureSupp iFeatureSuppA = a(currentDevice);
            return iFeatureSuppA != null && iFeatureSuppA.isRomSupportLoadBg(currentDevice);
        }
        if (isOverseaEdition(currentDevice)) {
            return false;
        }
        return isRomSupport(currentDevice, new String[]{"3", "0", "13", "2"});
    }

    public static boolean isRomSupportMiAI(Context context) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (b(currentDevice)) {
            return true;
        }
        IFeatureSupp iFeatureSuppA = a(currentDevice);
        return iFeatureSuppA != null && iFeatureSuppA.isRomSupportMiAI(currentDevice);
    }

    public static boolean isRomSupportMiotToken(Context context) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (b(currentDevice)) {
            return true;
        }
        IFeatureSupp iFeatureSuppA = a(currentDevice);
        return iFeatureSuppA != null && iFeatureSuppA.isRomSupportMiotToken(currentDevice);
    }

    public static boolean isRomSupportNewSportHealthChannel(Context context) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (b(currentDevice)) {
            return true;
        }
        IFeatureSupp iFeatureSuppA = a(currentDevice);
        boolean z = iFeatureSuppA != null && iFeatureSuppA.isRomSupportNewSportHealthChannel(currentDevice);
        Log.d(a, "Is Support New SportHealthDataChannel " + currentDevice + " : " + z, new Object[0]);
        return z;
    }

    public static boolean isRomSupportOutRidingCEL(Context context) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (b(currentDevice)) {
            return true;
        }
        IFeatureSupp iFeatureSuppA = a(currentDevice);
        return iFeatureSuppA != null && iFeatureSuppA.isRomSupportOutRidingCEL(currentDevice);
    }

    public static boolean isRomSupportShowQR(Context context) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (b(currentDevice)) {
            return true;
        }
        IFeatureSupp iFeatureSuppA = a(currentDevice);
        return iFeatureSuppA != null && iFeatureSuppA.isRomSupportShowQR(currentDevice);
    }

    public static boolean isRomSupportThirdWatchFace(Device device) {
        return false;
    }

    public static boolean isRomSupportUnlock(Context context) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (b(currentDevice)) {
            return true;
        }
        IFeatureSupp iFeatureSuppA = a(currentDevice);
        return iFeatureSuppA != null && iFeatureSuppA.isRomSupportUnlock(currentDevice);
    }

    public static boolean isRomSupportWalkingStep(Context context) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (b(currentDevice)) {
            return true;
        }
        IFeatureSupp iFeatureSuppA = a(currentDevice);
        return iFeatureSuppA != null && iFeatureSuppA.isRomSupportWalkingStep(currentDevice);
    }

    public static boolean isRomSupportWatchFaceShop(Device device) {
        return !DeviceSource.isSeriesXihu(device);
    }

    public static boolean isRomSupportWatchFaceStore(Device device) {
        IFeatureSupp iFeatureSuppA;
        return (DeviceSource.isModelQogir(device) || DeviceSource.isSeriesEverest2(device) || (iFeatureSuppA = a(device)) == null || !iFeatureSuppA.isRomSupportWatchFaceStore(device)) ? false : true;
    }

    public static boolean isRomSupportWorldCup(Context context) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (b(currentDevice)) {
            return true;
        }
        IFeatureSupp iFeatureSuppA = a(currentDevice);
        return iFeatureSuppA != null && iFeatureSuppA.isRomSupportWorldCup(currentDevice);
    }

    public static boolean isRomWOS2(Context context) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        return currentDevice != null && isRomWOS2(currentDevice);
    }

    public static boolean isRomWidgetSupportHidden(Context context) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (b(currentDevice)) {
            return true;
        }
        IFeatureSupp iFeatureSuppA = a(currentDevice);
        return iFeatureSuppA != null && iFeatureSuppA.isRomWidgetSupportHidden(currentDevice);
    }

    public static boolean isSmartOS(Device device) {
        return FeatureConfig.get().support(device, Features.SMART_OS) || DeviceSource.isModelXihu(device);
    }

    public static boolean isSupportAlarm(Context context) {
        return isSupportAlarm(DeviceManager.getManager(context).getCurrentDevice());
    }

    public static boolean isSupportAlexa(Context context) {
        boolean zSupport = FeatureConfig.get().support(context, Features.ALEXA);
        Log.d(a, "alexa support: " + zSupport, new Object[0]);
        return zSupport;
    }

    public static boolean isSupportAssistant(Context context) {
        return FeatureConfig.get().support(context, Features.ASSISTANT);
    }

    public static boolean isSupportAssistantFlight(Context context) {
        return FeatureConfig.get().support(context, Features.ASSISTANT_FLIGHT);
    }

    public static boolean isSupportAssistantUpdates(Context context) {
        return FeatureConfig.get().support(context, Features.ASSISTANT_UPDATES);
    }

    public static boolean isSupportAtrialFibrillation(@NonNull Device device) {
        if (DeviceSource.isModelXihuE(device)) {
            return true;
        }
        if (DeviceSource.isModelXihuDisney(device)) {
            return isRomSupport(device, new String[]{"1", "3", com.tencent.connect.common.Constants.VIA_REPORT_TYPE_START_WAP, "8"});
        }
        if (DeviceSource.isModelXihu(device)) {
            return isRomSupport(device, new String[]{"1", "0", com.tencent.connect.common.Constants.VIA_REPORT_TYPE_START_WAP, "8"});
        }
        if (DeviceSource.isModelQogirMainland(device)) {
            return isRomSupport(device, new String[]{"3", "0", "48", "0"});
        }
        return false;
    }

    public static boolean isSupportESim(Device device) {
        return FeatureConfig.get().support(device, Features.E_SIM) || DeviceSource.isModelXihu(device);
    }

    public static boolean isSupportFindWatch(@NonNull Device device) {
        return (DeviceSource.isModelQogirMainland(device) && isRomSupport(device, new String[]{"3", "0", com.tencent.connect.common.Constants.VIA_REPORT_TYPE_START_WAP, "0"})) || (DeviceSource.isModelQogir(device) && isRomSupport(device, new String[]{"3", "2", "0", "20"})) || DeviceSource.isSeriesEverest2(device);
    }

    public static boolean isSupportHRRestingStatistic(Context context) {
        return true;
    }

    public static boolean isSupportHeartRateSetting(@NonNull Device device) {
        if (DeviceSource.isSeriesEverest2(device)) {
            return true;
        }
        if (DeviceSource.isModelQogirMainland(device)) {
            return isRomSupport(device, new String[]{"3", "0", "50", "0"});
        }
        return false;
    }

    public static boolean isSupportHiking(Context context) {
        IFeatureSupp iFeatureSuppA;
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        boolean z = (b(currentDevice) || (iFeatureSuppA = a(currentDevice)) == null || !iFeatureSuppA.isSupportHiking(currentDevice)) ? false : true;
        Log.d(a, "Is Support Hiking ：" + currentDevice + " : " + z, new Object[0]);
        return z;
    }

    public static boolean isSupportLvMi(Device device) {
        return FeatureConfig.get().support(device, "LvMi");
    }

    public static boolean isSupportMiAi2_2(Context context) {
        return FeatureConfig.get().support(context, Features.MIAI2_2);
    }

    public static boolean isSupportMiAiTts(Context context) {
        return FeatureConfig.get().support(context, Features.MIAI_TTS);
    }

    public static boolean isSupportNFC(Device device) {
        return FeatureConfig.get().support(device, Features.NFC) || (device != null && (DeviceSource.isModelQogirMainland(device) || DeviceSource.isModelEverest2(device)));
    }

    public static boolean isSupportNFCDoor(Device device) {
        if (device == null || !DeviceSource.isModelEverest2(device)) {
            return FeatureConfig.get().support(device, Features.NFC_DOOR);
        }
        return true;
    }

    public static boolean isSupportNFCUnionPay(Context context) {
        return FeatureConfig.get().support(context, Features.NFC_UNION_PAY);
    }

    public static boolean isSupportNewLap(Context context) {
        IFeatureSupp iFeatureSuppA;
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (currentDevice != null && DeviceSource.isSeriesEverest2(currentDevice)) {
            return true;
        }
        boolean z = (b(currentDevice) || (iFeatureSuppA = a(currentDevice)) == null || !iFeatureSuppA.isSupportNewLap(currentDevice)) ? false : true;
        Log.d(a, "Is Support NewLap ：" + currentDevice + " : " + z, new Object[0]);
        return z;
    }

    public static boolean isSupportSettingHealth(@NonNull Device device) {
        if (DeviceSource.isModelXihuDisney(device)) {
            return isRomSupport(device, new String[]{"1", "3", "5", "0"});
        }
        return (DeviceSource.isModelXihu(device) && isRomSupport(device, new String[]{"1", "0", "12", "0"})) || (DeviceSource.isModelXihuE(device) && isRomSupport(device, new String[]{"1", "1", "6", "0"})) || ((DeviceSource.isModelXihuEA(device) && isRomSupport(device, new String[]{"1", "2", "3", "0"})) || (DeviceSource.isSeriesEverest2(device) && isRomSupport(device, new String[]{"4", "0", "2", "0"})));
    }

    public static boolean isSupportStepGoalSet(Context context) {
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (FeatureConfig.get().support(currentDevice, Features.STEP_TARGET_SET) || b(currentDevice)) {
            return true;
        }
        IFeatureSupp iFeatureSuppA = a(currentDevice);
        boolean z = iFeatureSuppA != null && iFeatureSuppA.isRomSupportStepGoalSet(currentDevice);
        Log.d(a, "Is Support Step Goal Set, " + currentDevice + ": " + z, new Object[0]);
        return z;
    }

    public static boolean isSupportSyncBLEPb(Context context) {
        boolean zIsRomSupport;
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (currentDevice != null) {
            String[] strArr = null;
            if (DeviceSource.isModelEverest2(currentDevice)) {
                strArr = new String[]{"4", "0", "3", "0"};
            } else if (DeviceSource.isModelEverest2Oversea(currentDevice)) {
                strArr = new String[]{"4", "2", "1", "0"};
            }
            zIsRomSupport = isRomSupport(currentDevice, strArr);
        } else {
            zIsRomSupport = false;
        }
        Log.d(a, "Is Support BLE PB: " + currentDevice + ", " + zIsRomSupport, new Object[0]);
        return zIsRomSupport;
    }

    public static boolean isSupportSyncBLESingleHR(Device device) {
        boolean z = (device != null && DeviceSource.isModelEverest2(device) && isRomSupport(device, new String[]{"4", "0", "3", "0"})) | (device != null && DeviceSource.isModelEverest2Oversea(device) && isRomSupport(device, new String[]{"4", "2", "1", "0"}));
        Log.d(a, "Is Support BLE Single HR: " + device + ", " + z, new Object[0]);
        return z;
    }

    public static boolean isSupportSyncHeartRate(Device device) {
        return FeatureConfig.get().support(device, Features.SYNC_HEART_RATE);
    }

    public static boolean isSupportWidgetManager2(Device device) {
        return b(device) || FeatureConfig.get().support(device, Features.WIDGET_MANAGER_2);
    }

    public static boolean isSupportWorkout(Context context) {
        boolean zIsRomSupport;
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (currentDevice != null) {
            String[] strArr = null;
            if (DeviceSource.isModelQogir(currentDevice)) {
                strArr = isOverseaEdition(currentDevice) ? new String[]{"3", "2", "6", "0"} : new String[]{"3", "0", "43", "0"};
            } else if (DeviceSource.isSeriesXihu(currentDevice)) {
                if (DeviceSource.isModelXihuDisney(currentDevice)) {
                    strArr = new String[]{"1", "3", "3", "0"};
                } else if (DeviceSource.isModelXihu(currentDevice)) {
                    strArr = new String[]{"1", "0", "10", "0"};
                } else if (DeviceSource.isModelXihuE(currentDevice)) {
                    strArr = new String[]{"1", "1", "4", "0"};
                } else if (DeviceSource.isModelXihuEA(currentDevice)) {
                    strArr = new String[]{"1", "2", "2", "0"};
                }
            }
            zIsRomSupport = isRomSupport(currentDevice, strArr);
        } else {
            zIsRomSupport = false;
        }
        Log.d(a, "Is Support Workout ：" + currentDevice + " : " + zIsRomSupport, new Object[0]);
        return zIsRomSupport;
    }

    public static void saveStorageInfo(Context context, Device device, DataBundle dataBundle) {
        device.info().setStorageAvailable(dataBundle.getLong("available"));
        device.info().setStorageTotal(dataBundle.getLong("total"));
        DeviceManager.getManager(context).save(device);
    }

    public static boolean isSupportLvMi(Context context) {
        return FeatureConfig.get().support(context, "LvMi");
    }

    public static boolean isSupportNFCUnionPay(Device device) {
        return FeatureConfig.get().support(device, Features.NFC_UNION_PAY);
    }

    public static String getRomVersion(@NonNull Device device) {
        String strBuildNumber = device.info().buildNumber();
        String strC = c(strBuildNumber);
        if (strBuildNumber != null && strBuildNumber.contains("debug")) {
            strC = strC + VER_DEBUG_SUFFIX;
        }
        Log.d(a, "Device : " + device + ", ROM Ver : " + strC, new Object[0]);
        return strC;
    }

    public static boolean isRomWOS2(@NonNull Device device) {
        if (b(device)) {
            return true;
        }
        IFeatureSupp iFeatureSuppA = a(device);
        return iFeatureSuppA != null && iFeatureSuppA.isRomWOS2(device);
    }

    public static boolean isSupportAlarm(Device device) {
        return b(device) || FeatureConfig.get().support(device, Features.ALARM);
    }

    public static boolean isRomSupportHRR(Context context, String str) {
        if (DeviceSource.isSeriesEverest2(DeviceSource.getDeviceSourceByDataSource(str))) {
            return true;
        }
        Device deviceFindDeviceByDataSource = DeviceManager.getManager(context).findDeviceByDataSource(str);
        if (b(deviceFindDeviceByDataSource)) {
            return true;
        }
        IFeatureSupp iFeatureSuppA = a(deviceFindDeviceByDataSource);
        return iFeatureSuppA != null && iFeatureSuppA.isRomSupportHRR(deviceFindDeviceByDataSource);
    }
}
