package com.huawei.hwarkuix.oHBrigdePlugin.device.capability;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.eej;
import defpackage.eey;
import defpackage.lvb;
import defpackage.njy;
import health.compact.a.CommonUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes37.dex */
public class CapabilityFactory {
    private static final String TAG = "CapabilityFactory";
    private static final int WEAR_CAPABILITY = 0;
    private static final int WEAR_CAPABILITY_EX = 1;
    private static final int WEAR_CAPABILITY_SPECIAL = 2;
    private static Map<Integer, ICapabilitySource> capabilitySources = new HashMap();
    private static final Object LOCK = new Object();
    private static Gson gson = new Gson();

    public interface ICapabilitySource {
        boolean[] isSupportCapability(DeviceInfo deviceInfo, Object obj);
    }

    public static ICapabilitySource getCapabilitySource(int i) {
        ICapabilitySource iCapabilitySourceGeneratedCapabilitySource;
        synchronized (CapabilityFactory.class) {
            iCapabilitySourceGeneratedCapabilitySource = capabilitySources.get(Integer.valueOf(i));
            if (iCapabilitySourceGeneratedCapabilitySource == null) {
                iCapabilitySourceGeneratedCapabilitySource = generatedCapabilitySource(i);
            }
            if (iCapabilitySourceGeneratedCapabilitySource != null) {
                capabilitySources.put(Integer.valueOf(i), iCapabilitySourceGeneratedCapabilitySource);
            }
        }
        return iCapabilitySourceGeneratedCapabilitySource;
    }

    private static ICapabilitySource generatedCapabilitySource(int i) {
        if (i == 0) {
            return new WearCapability();
        }
        if (i == 1) {
            return new WearCapabilityEx();
        }
        if (i != 2) {
            return null;
        }
        return new WearCapabilitySpecial();
    }

    static class WearCapability implements ICapabilitySource {
        WearCapability() {
        }

        @Override // com.huawei.hwarkuix.oHBrigdePlugin.device.capability.CapabilityFactory.ICapabilitySource
        public boolean[] isSupportCapability(DeviceInfo deviceInfo, Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            List list = (List) CapabilityFactory.gson.fromJson((String) obj, new TypeToken<List<List<Integer>>>() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.device.capability.CapabilityFactory.WearCapability.1
            }.getType());
            if (njy.e(list)) {
                return null;
            }
            boolean[] zArr = new boolean[list.size()];
            DeviceCapability negotiationDeviceCapability = CapabilityFactory.getNegotiationDeviceCapability(deviceInfo.getDeviceIdentify());
            for (int i = 0; i < list.size(); i++) {
                List list2 = (List) list.get(i);
                if (list2 != null && list2.size() == 2) {
                    String str = String.format("%s.%s.%s", 5, list2.get(0), list2.get(1));
                    LogUtil.a(CapabilityFactory.TAG, "commanId:", str);
                    boolean wearCapability = WearOldCapability.getWearCapability(str, negotiationDeviceCapability);
                    zArr[i] = wearCapability;
                    LogUtil.a(CapabilityFactory.TAG, "isSupport:", Boolean.valueOf(wearCapability));
                } else {
                    zArr[i] = false;
                }
            }
            return zArr;
        }
    }

    static class WearCapabilityEx implements ICapabilitySource {
        WearCapabilityEx() {
        }

        @Override // com.huawei.hwarkuix.oHBrigdePlugin.device.capability.CapabilityFactory.ICapabilitySource
        public boolean[] isSupportCapability(DeviceInfo deviceInfo, Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            List list = (List) CapabilityFactory.gson.fromJson((String) obj, new TypeToken<List<Integer>>() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.device.capability.CapabilityFactory.WearCapabilityEx.1
            }.getType());
            if (njy.e(list)) {
                return null;
            }
            boolean[] zArr = new boolean[list.size()];
            for (int i = 0; i < list.size(); i++) {
                Integer num = (Integer) list.get(i);
                boolean zD = eey.d(deviceInfo, num.intValue());
                LogUtil.a(CapabilityFactory.TAG, "WearCapabilityEx bitIndex :", num, " ,isSupport:", Boolean.valueOf(zD));
                zArr[i] = zD;
            }
            return zArr;
        }
    }

    static class WearCapabilitySpecial implements ICapabilitySource {
        WearCapabilitySpecial() {
        }

        @Override // com.huawei.hwarkuix.oHBrigdePlugin.device.capability.CapabilityFactory.ICapabilitySource
        public boolean[] isSupportCapability(DeviceInfo deviceInfo, Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            List list = (List) CapabilityFactory.gson.fromJson((String) obj, new TypeToken<List<Integer>>() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.device.capability.CapabilityFactory.WearCapabilitySpecial.1
            }.getType());
            boolean[] zArr = new boolean[list.size()];
            DeviceCapability negotiationDeviceCapability = CapabilityFactory.getNegotiationDeviceCapability(deviceInfo.getDeviceIdentify());
            for (int i = 0; i < list.size(); i++) {
                zArr[i] = WearSpecialCapability.getWearCapability(((Integer) list.get(i)).intValue(), negotiationDeviceCapability);
            }
            return zArr;
        }
    }

    public static DeviceCapability getNegotiationDeviceCapability(String str) {
        DeviceCapability deviceCapability;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "capabilityNegotiation id is empty");
            return null;
        }
        LogUtil.a(TAG, "capabilityNegotiation:", CommonUtil.n(str));
        DeviceCapability deviceCapabilityA = eej.a(str);
        if (deviceCapabilityA != null) {
            return deviceCapabilityA;
        }
        Map<String, DeviceCapability> mapD = lvb.e().d(1, str, TAG);
        if (mapD == null || (deviceCapability = mapD.get(str)) == null) {
            return null;
        }
        eej.a(str, deviceCapability);
        return deviceCapability;
    }
}
