package defpackage;

import android.text.TextUtils;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.devicesdk.entity.ExternalDeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.KeyValDbManager;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes4.dex */
public class cox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, String> f31232a = new HashMap(5);
    private static final Map<String, String> e = new HashMap(5);
    private static Map<String, DeviceCapability> d = new ConcurrentHashMap(5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Boolean f31233b = null;

    public static DeviceInfo c(com.huawei.devicesdk.entity.DeviceInfo deviceInfo) {
        UniteDevice uniteDevice = new UniteDevice();
        uniteDevice.setDeviceInfo(deviceInfo);
        return c(uniteDevice);
    }

    public static DeviceInfo c(UniteDevice uniteDevice) {
        if (uniteDevice == null || uniteDevice.getDeviceInfo() == null) {
            LogUtil.e("DeviceConvertUtil", "deviceInfo or getDeviceInfo is null.");
            return null;
        }
        com.huawei.devicesdk.entity.DeviceInfo deviceInfo = uniteDevice.getDeviceInfo();
        DeviceInfo deviceInfo2 = new DeviceInfo();
        deviceInfo2.setmDeviceId("");
        deviceInfo2.setDeviceName(deviceInfo.getDeviceName());
        deviceInfo2.setProductId("");
        deviceInfo2.setDeviceIdentify(deviceInfo.getDeviceMac());
        deviceInfo2.setDeviceProtocol(2);
        deviceInfo2.setProductType(deviceInfo.getDeviceType());
        deviceInfo2.setDeviceActiveState(deviceInfo.isUsing() ? 1 : 0);
        deviceInfo2.setDeviceConnectState(deviceInfo.getDeviceConnectState());
        deviceInfo2.setEncryptType(1);
        deviceInfo2.setDeviceBluetoothType(deviceInfo.getDeviceBtType());
        deviceInfo2.setUuid(deviceInfo.getDeviceSn());
        deviceInfo2.setDeviceModel(deviceInfo.getDeviceMode());
        deviceInfo2.setDeviceIdType(deviceInfo.getIdToServerType());
        deviceInfo2.setAuthVersion(2);
        deviceInfo2.setAutoDetectSwitchStatus(deviceInfo.getAutoDetectSwitchStatus());
        deviceInfo2.setFootWearPosition(deviceInfo.getFootWearPosition());
        deviceInfo2.setBluetoothVersion(deviceInfo.getBtVersion());
        deviceInfo2.setSoftVersion(deviceInfo.getDeviceSoftVersion());
        deviceInfo2.setDeviceVersion(deviceInfo.getDeviceVersion());
        deviceInfo2.setNodeId(null);
        deviceInfo2.setCertModel(deviceInfo.getCertMode());
        deviceInfo2.setManufacture(deviceInfo.getDeviceBtMode());
        deviceInfo2.setDeviceUdid(e(deviceInfo2, deviceInfo2.getProductType()));
        deviceInfo2.setLastConnectedTime(deviceInfo.getLastConnectedTime());
        deviceInfo2.setVersionType(deviceInfo.getDeviceVersionType());
        deviceInfo2.setDeviceOtaPackageName(deviceInfo.getDeviceOtaPackageName());
        deviceInfo2.setHiLinkDeviceId(deviceInfo.getDeviceHilinkId());
        deviceInfo2.setPowerSaveModel(deviceInfo.getPowerSaveMode());
        deviceInfo2.setUdidFromDevice(deviceInfo.getDfxDeviceUdid());
        deviceInfo2.setUnConvertedUdid(deviceInfo.getDfxDeviceUdidParameter());
        deviceInfo2.setDeviceFactoryReset(deviceInfo.getDeviceFactoryReset());
        deviceInfo2.setExpandCapability(a(uniteDevice));
        deviceInfo2.setWearEngineDeviceId(deviceInfo.getWearEngineDeviceId());
        deviceInfo2.setSupportAccountSwitch(d(uniteDevice) ? 1 : 0);
        a(deviceInfo2, deviceInfo);
        return deviceInfo2;
    }

    private static void a(DeviceInfo deviceInfo, com.huawei.devicesdk.entity.DeviceInfo deviceInfo2) {
        deviceInfo.setCountryCode(deviceInfo2.getCountryCode());
        deviceInfo.setEmuiVersion(deviceInfo2.getEmuiVersion());
        deviceInfo.setMultiLinkBleMac(deviceInfo2.getMultiLinkBleMac());
        deviceInfo.setMultiLink(deviceInfo2.isMultiLink());
        deviceInfo.setDeviceEnterpriseVersion(deviceInfo2.getDeviceEnterpriseVersion());
        deviceInfo.setDeviceSplicingProductVersion(deviceInfo2.getDeviceSplicingProductVersion());
        deviceInfo.setDeviceOStVersion(deviceInfo2.getDeviceOStVersion());
        deviceInfo.setDeviceOtaSignatureLength(deviceInfo2.getDeviceOtaSignatureLength());
        deviceInfo.setFieldList(deviceInfo2.getFieldList());
        deviceInfo.setDeviceOtaAreaType(deviceInfo2.getDeviceOtaAreaType());
        deviceInfo.setSportVersion(deviceInfo2.getSportVersion());
        deviceInfo.setSaleInfo(deviceInfo2.getSaleInfo());
        deviceInfo.setPsiSignature(deviceInfo2.getPsiSignature());
        deviceInfo.setDeviceSubModelId(deviceInfo2.getDeviceSubProdId());
        deviceInfo.setIsDemoWatch(deviceInfo2.getIsDemoWatch());
        deviceInfo.setSingleFrameDevice(deviceInfo2.getSingleFrameDevice());
        deviceInfo.setDeviceFid(deviceInfo2.getDeviceFid());
        deviceInfo.setOsType(deviceInfo2.getOsType());
        deviceInfo.setApiVersion(deviceInfo2.getApiVersion());
        deviceInfo.setAbi(deviceInfo2.getAbi());
        deviceInfo.setHwUdid(deviceInfo2.getHwUdid());
    }

    private static String a(UniteDevice uniteDevice) {
        ExternalDeviceCapability capability;
        if (uniteDevice == null || (capability = uniteDevice.getCapability()) == null) {
            return null;
        }
        return capability.getCapacity();
    }

    private static boolean d(UniteDevice uniteDevice) {
        DeviceCapability deviceCapabilityE;
        if (uniteDevice == null || (deviceCapabilityE = e(uniteDevice)) == null) {
            return false;
        }
        return deviceCapabilityE.isSupportAccountSwitch();
    }

    public static DeviceCapability e(UniteDevice uniteDevice) {
        DeviceCapability compatibleCapacity = null;
        if (uniteDevice == null) {
            return null;
        }
        ExternalDeviceCapability capability = uniteDevice.getCapability();
        if (capability != null) {
            compatibleCapacity = capability.getCompatibleCapacity();
            compatibleCapacity.configureIsSupportHelp(true);
        }
        return compatibleCapacity == null ? a(uniteDevice.getIdentify()) : compatibleCapacity;
    }

    public static void a(String str, DeviceCapability deviceCapability) {
        if (TextUtils.isEmpty(str) || deviceCapability == null) {
            return;
        }
        d.put(str, deviceCapability);
    }

    private static DeviceCapability a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return d.get(str);
    }

    public static Map<String, DeviceCapability> d() {
        return d;
    }

    public static String e(DeviceInfo deviceInfo, int i) {
        String str;
        String strB;
        if (deviceInfo == null) {
            return null;
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (deviceIdentify == null) {
            return deviceIdentify;
        }
        String securityDeviceId = deviceInfo.getSecurityDeviceId();
        Map<String, String> map = e;
        if (!map.containsKey(deviceIdentify)) {
            str = "";
        } else {
            str = map.get(deviceIdentify);
        }
        if (!TextUtils.isEmpty(str) && str.equals(securityDeviceId)) {
            Map<String, String> map2 = f31232a;
            if (map2.containsKey(deviceIdentify)) {
                return map2.get(deviceIdentify);
            }
        }
        c();
        String str2 = securityDeviceId + deviceIdentify;
        if (deviceIdentify.equals(securityDeviceId)) {
            str2 = deviceIdentify;
        }
        if (i >= 34 && !xgx.d().noCloudVersion()) {
            strB = cqm.c(str2);
        } else {
            strB = b(securityDeviceId);
        }
        map.put(deviceIdentify, securityDeviceId);
        f31232a.put(deviceIdentify, strB);
        return strB;
    }

    private static void c() {
        if (f31233b == null) {
            f31233b = Boolean.valueOf(SharedPreferenceManager.b(String.valueOf(PrebakedEffectId.RT_FLY), "DeviceConvertIsNoCloudVersion", xgx.d().noCloudVersion()));
            SharedPreferenceManager.a(String.valueOf(PrebakedEffectId.RT_FLY), "DeviceConvertIsNoCloudVersion", f31233b.booleanValue());
            SharedPreferenceManager.c(String.valueOf(PrebakedEffectId.RT_FLY), "DeviceConvertUserId", SharedPreferenceManager.b(String.valueOf(PrebakedEffectId.RT_FLY), "DeviceConvertUserId", cqm.c(KeyValDbManager.d(BaseApplication.getContext()).c("user_id"))));
        }
        if (f31233b.booleanValue() != xgx.d().noCloudVersion()) {
            f31233b = Boolean.valueOf(xgx.d().noCloudVersion());
            SharedPreferenceManager.a(String.valueOf(PrebakedEffectId.RT_FLY), "DeviceConvertIsNoCloudVersion", f31233b.booleanValue());
            String strC = cqm.c(KeyValDbManager.d(BaseApplication.getContext()).c("user_id"));
            if (!Objects.equals(strC, SharedPreferenceManager.b(String.valueOf(PrebakedEffectId.RT_FLY), "DeviceConvertUserId", ""))) {
                SharedPreferenceManager.c(String.valueOf(PrebakedEffectId.RT_FLY), "DeviceConvertUserId", strC);
                return;
            }
            String str = "getDeviceUdid isNoCloudVersion change: " + f31233b;
            ReleaseLogUtil.d("A", str);
            lng.c("ConnectMessage", str);
        }
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("DeviceConvertUtil", "setDeviceMac deviceMac is null");
            return null;
        }
        if (!xgx.d().noCloudVersion() && (str.contains(":") || str.length() <= 12)) {
            return str.replace(":", "");
        }
        String strB = cqm.b(str);
        return strB.length() >= 24 ? strB.replace(Marker.ANY_NON_NULL_MARKER, "A").replace("/", "A").replace("=", "A").substring(0, 24) : strB;
    }

    public static boolean e(DeviceInfo deviceInfo) {
        ExternalDeviceCapability externalDeviceCapabilityB;
        DeviceCapability compatibleCapacity;
        if (deviceInfo == null) {
            return false;
        }
        if (deviceInfo.getSportVersion() == 1) {
            return true;
        }
        return (deviceInfo.getSportVersion() == 0 || (externalDeviceCapabilityB = cnk.c().b(deviceInfo.getDeviceIdentify())) == null || (compatibleCapacity = externalDeviceCapabilityB.getCompatibleCapacity()) == null || !compatibleCapacity.isSupportSmartWatchVersionStatus()) ? false : true;
    }
}
