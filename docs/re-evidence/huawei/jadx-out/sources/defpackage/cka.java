package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.ExternalDeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.LogUtil;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class cka {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f1664c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, DeviceInfo> f1665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, cml> f1666b;
    private ConcurrentHashMap<String, ExternalDeviceCapability> d;
    private ConcurrentHashMap<String, DeviceInfo> e;
    private ConcurrentHashMap<String, Boolean> f;
    private ConcurrentHashMap<String, cmr> i;
    private ConcurrentHashMap<String, cmo> j;

    private cka() {
        this.e = new ConcurrentHashMap<>(10);
        this.f1665a = new ConcurrentHashMap<>(10);
        this.j = new ConcurrentHashMap<>(10);
        this.d = new ConcurrentHashMap<>(10);
        this.f1666b = new ConcurrentHashMap<>(10);
        this.i = new ConcurrentHashMap<>(10);
        this.f = new ConcurrentHashMap<>(10);
    }

    public static cka b() {
        return d.f1667b;
    }

    public void c(String str, DeviceInfo deviceInfo) {
        if (TextUtils.isEmpty(str) || deviceInfo == null) {
            LogUtil.e("DeviceConnectData", "deviceUuid or deviceInfo is incorrect, addDeviceInfo fail");
        } else {
            this.e.put(str, deviceInfo);
        }
    }

    public void d(DeviceInfo deviceInfo) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
            LogUtil.e("DeviceConnectData", "params is invalid, updateUsedDeviceInfo fail.");
            return;
        }
        DeviceInfo deviceInfo2 = this.e.get(deviceInfo.getDeviceMac());
        if (deviceInfo2 == null) {
            LogUtil.e("DeviceConnectData", "not used device.");
            return;
        }
        deviceInfo2.setDeviceConnectState(deviceInfo.getDeviceConnectState());
        deviceInfo2.setUsing(deviceInfo.isUsing());
        LogUtil.b("DeviceConnectData", "updateUsedDeviceInfo success.");
    }

    public DeviceInfo j(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("DeviceConnectData", "deviceUuid is empty, getDeviceInfo fail.");
            return null;
        }
        return this.e.get(str);
    }

    public Map<String, DeviceInfo> d() {
        return this.e;
    }

    public Map<String, DeviceInfo> e() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        concurrentHashMap.putAll(this.e);
        concurrentHashMap.putAll(this.f1665a);
        return concurrentHashMap;
    }

    public void h(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("DeviceConnectData", "deviceUuid is empty, removeDeviceAllData fail.");
            return;
        }
        this.e.remove(str);
        this.d.remove(str);
        synchronized (f1664c) {
            this.j.remove(str);
        }
    }

    public void a(DeviceInfo deviceInfo) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
            LogUtil.e("DeviceConnectData", "device info is invalid, addCacheDeviceInfo fail.");
        } else {
            this.f1665a.put(deviceInfo.getDeviceMac(), deviceInfo);
        }
    }

    public DeviceInfo b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("DeviceConnectData", "deviceUuid is empty, getCacheDeviceInfo fail");
            return null;
        }
        return this.f1665a.get(str);
    }

    public void c(String str, cmo cmoVar) {
        if (TextUtils.isEmpty(str) || cmoVar == null) {
            LogUtil.e("DeviceConnectData", "deviceUuid or deviceStatus is incorrect, addDeviceStatus fail.");
            return;
        }
        synchronized (f1664c) {
            this.j.put(str, cmoVar);
        }
    }

    public cmo g(String str) {
        cmo cmoVar;
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("DeviceConnectData", "deviceUuid is empty, getDeviceStatus fail.");
            return null;
        }
        synchronized (f1664c) {
            cmoVar = this.j.get(str);
        }
        return cmoVar;
    }

    public void a(String str, ExternalDeviceCapability externalDeviceCapability) {
        if (TextUtils.isEmpty(str) || externalDeviceCapability == null) {
            LogUtil.e("DeviceConnectData", "device id or capability is invalid, addDeviceCapability fail.");
        } else {
            this.d.put(str, externalDeviceCapability);
        }
    }

    public Map<String, ExternalDeviceCapability> a() {
        return this.d;
    }

    public cml d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("DeviceConnectData", "deviceUuid is empty, getDeviceExInfo fail.");
            return null;
        }
        return this.f1666b.get(str);
    }

    public void c(String str, cml cmlVar) {
        if (TextUtils.isEmpty(str) || cmlVar == null) {
            LogUtil.e("DeviceConnectData", "deviceUuid or parameter is empty, setDeviceExInfo fail.");
        } else {
            this.f1666b.put(str, cmlVar);
        }
    }

    public void m(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("DeviceConnectData", "device is invalid");
        } else {
            this.f1666b.remove(str);
        }
    }

    public cmr f(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("DeviceConnectData", "deviceUuid is empty, getDevicePreConnectInfo fail.");
            return null;
        }
        return this.i.get(str);
    }

    public void d(String str, cmr cmrVar) {
        if (TextUtils.isEmpty(str) || cmrVar == null) {
            LogUtil.e("DeviceConnectData", "deviceUuid or parameter is empty, setDevicePreConnectInfo fail.");
        } else {
            this.i.put(str, cmrVar);
        }
    }

    public void d(String str, DeviceCapability deviceCapability) {
        if (TextUtils.isEmpty(str) || deviceCapability == null) {
            LogUtil.e("DeviceConnectData", "deviceUuid or capability is invalid, addCompatibleDeviceCapability error.");
            return;
        }
        this.d.putIfAbsent(str, new ExternalDeviceCapability());
        ExternalDeviceCapability externalDeviceCapability = this.d.get(str);
        if (externalDeviceCapability != null) {
            externalDeviceCapability.setCompatibleCapacity(deviceCapability);
        }
    }

    public DeviceCapability c(String str) {
        DeviceCapability deviceCapability = new DeviceCapability();
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("DeviceConnectData", "deviceUuid or capability is invalid, getCompatibleDeviceCapability error.");
            return deviceCapability;
        }
        ExternalDeviceCapability externalDeviceCapability = this.d.get(str);
        return externalDeviceCapability == null ? deviceCapability : externalDeviceCapability.getCompatibleCapacity();
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            LogUtil.e("DeviceConnectData", "device id or capability is invalid, addExtendDeviceCapability error.");
            return;
        }
        this.d.putIfAbsent(str, new ExternalDeviceCapability());
        ExternalDeviceCapability externalDeviceCapability = this.d.get(str);
        LogUtil.b("DeviceConnectData", "addExtendDeviceCapability: capability = ", new Gson().toJson(externalDeviceCapability));
        if (externalDeviceCapability != null) {
            externalDeviceCapability.setCapacity(str2);
        }
    }

    public ExternalDeviceCapability e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("DeviceConnectData", "deviceUuid id is empty, getDeviceCapability error.");
            return null;
        }
        return this.d.get(str);
    }

    public void k(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("DeviceConnectData", "deviceUuid is empty, resetDeviceCapability error.");
            return;
        }
        ExternalDeviceCapability externalDeviceCapability = this.d.get(str);
        if (externalDeviceCapability == null) {
            LogUtil.e("DeviceConnectData", "capability is null, resetDeviceCapability fail.");
            return;
        }
        externalDeviceCapability.setCapacity("");
        externalDeviceCapability.setCompatibleCapacity(new DeviceCapability());
        LogUtil.b("DeviceConnectData", "resetDeviceCapability success.");
    }

    public void b(UniteDevice uniteDevice) {
        if (uniteDevice == null || TextUtils.isEmpty(uniteDevice.getIdentify())) {
            LogUtil.e("DeviceConnectData", "updateDeviceCapability device is invalid.");
            return;
        }
        ExternalDeviceCapability capability = uniteDevice.getCapability();
        if (capability == null) {
            LogUtil.e("DeviceConnectData", "updateDeviceCapability device capability is invalid. capability is null");
            return;
        }
        String identify = uniteDevice.getIdentify();
        ExternalDeviceCapability externalDeviceCapability = new ExternalDeviceCapability();
        ExternalDeviceCapability externalDeviceCapabilityPutIfAbsent = this.d.putIfAbsent(identify, externalDeviceCapability);
        if (externalDeviceCapabilityPutIfAbsent == null) {
            externalDeviceCapabilityPutIfAbsent = this.d.putIfAbsent(identify, externalDeviceCapability);
        }
        if (externalDeviceCapabilityPutIfAbsent == null) {
            LogUtil.e("DeviceConnectData", "updateDeviceCapability externalCapability is null.");
            return;
        }
        if (!TextUtils.isEmpty(capability.getCapacity())) {
            externalDeviceCapabilityPutIfAbsent.setCapacity(capability.getCapacity());
        }
        if (capability.getCompatibleCapacity() != null) {
            externalDeviceCapabilityPutIfAbsent.setCompatibleCapacity(capability.getCompatibleCapacity());
        }
    }

    public void d(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("DeviceConnectData", "deviceUuid is empty, setDeviceSupportCapability fail.");
        } else {
            this.f.put(str, Boolean.valueOf(z));
        }
    }

    public boolean i(String str) {
        Boolean bool;
        if (!TextUtils.isEmpty(str)) {
            return this.f.containsKey(str) && (bool = this.f.get(str)) != null && bool.booleanValue();
        }
        LogUtil.e("DeviceConnectData", "deviceUuid is empty, get isDeviceSupportCapability fail.");
        return false;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("DeviceConnectData", "device is invalid");
        } else {
            this.f1665a.remove(str);
            this.f.remove(str);
        }
    }

    static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static cka f1667b = new cka();
    }
}
