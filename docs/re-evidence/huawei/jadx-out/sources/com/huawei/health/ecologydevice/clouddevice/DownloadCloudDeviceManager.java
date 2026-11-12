package com.huawei.health.ecologydevice.clouddevice;

import android.text.TextUtils;
import com.huawei.health.ecologydevice.callback.DownloadCallback;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.profile.profile.DeviceProfile;
import defpackage.ecu;
import defpackage.efi;
import defpackage.efk;
import defpackage.efl;
import defpackage.njy;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class DownloadCloudDeviceManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeviceDataCallback f6475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final efi f6476b = new efi();
    private List<CloudSwatchDeviceInfo> d;

    public interface DeviceDataCallback {
        void deviceResourceCallbackResult(boolean z);
    }

    public void b(DeviceDataCallback deviceDataCallback) {
        LogUtil.a("DownloadCloudDeviceManager", "syncDeviceInfoFromProfileCloud");
        if (deviceDataCallback == null) {
            LogUtil.j("DownloadCloudDeviceManager", "syncDeviceInfoFromProfileCloud: deviceId or deviceStateCallback is null");
            return;
        }
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode() || Utils.o()) {
            e(false);
            return;
        }
        this.f6475a = deviceDataCallback;
        this.d = new ArrayList(16);
        e();
    }

    private void e() {
        LogUtil.a("DownloadCloudDeviceManager", "getCloudDeviceList");
        ecu.d().getDevicesFromCloud("DownloadCloudDeviceManager", new IBaseResponseCallback() { // from class: efg
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.d.c(i, obj);
            }
        });
    }

    public /* synthetic */ void c(int i, Object obj) {
        LogUtil.a("DownloadCloudDeviceManager", "getDevicesFromCloud: errorCode = ", Integer.valueOf(i));
        if (i == 0) {
            if (njy.b(obj, DeviceProfile.class) && (obj instanceof List)) {
                final List list = (List) obj;
                if (njy.e(list)) {
                    LogUtil.a("DownloadCloudDeviceManager", "getDevicesFromCloud: empty list");
                    e(true);
                    return;
                } else {
                    this.f6476b.d(new DownloadCallback() { // from class: com.huawei.health.ecologydevice.clouddevice.DownloadCloudDeviceManager.3
                        @Override // com.huawei.health.ecologydevice.callback.DownloadCallback
                        public void onSuccess() {
                            LogUtil.a("DownloadCloudDeviceManager", "mapCallback onSuccess");
                            DownloadCloudDeviceManager.this.c(list);
                        }

                        @Override // com.huawei.health.ecologydevice.callback.DownloadCallback
                        public void onFailure(int i2) {
                            LogUtil.j("DownloadCloudDeviceManager", "mapCallback onFailure, errorCode is:", Integer.valueOf(i2));
                            DownloadCloudDeviceManager.this.e(false);
                        }
                    });
                    return;
                }
            }
            LogUtil.j("DownloadCloudDeviceManager", "getDevicesFromCloud: type not match");
            e(false);
            return;
        }
        LogUtil.j("DownloadCloudDeviceManager", "getDevicesFromCloud: get data failed");
        e(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        if (z) {
            efl.e(this.d);
        }
        efl.d();
        DeviceDataCallback deviceDataCallback = this.f6475a;
        if (deviceDataCallback != null) {
            deviceDataCallback.deviceResourceCallbackResult(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<DeviceProfile> list) {
        LogUtil.a("DownloadCloudDeviceManager", "configDeviceProfiles: list.size = ", Integer.valueOf(list.size()));
        if (a("ZAA6", list)) {
            this.f6476b.a(e(list));
        }
        if (a("H001", list)) {
            Iterator<DeviceProfile> it = list.iterator();
            while (it.hasNext()) {
                Map<String, Object> profile = it.next().getProfile();
                if (profile != null && "H001".equals(a("prodId", profile))) {
                    b(profile, "H001");
                    e(profile, "HDK_SMART_WATCH", false);
                }
            }
        }
    }

    private DownloadCallback e(final List<DeviceProfile> list) {
        return new DownloadCallback() { // from class: com.huawei.health.ecologydevice.clouddevice.DownloadCloudDeviceManager.4
            @Override // com.huawei.health.ecologydevice.callback.DownloadCallback
            public void onSuccess() {
                LogUtil.a("DownloadCloudDeviceManager", "There is no local resource package.");
                DownloadCloudDeviceManager.this.f6476b.d("SMART_HEADPHONES", "ZAA6", true, new DownloadCallback() { // from class: com.huawei.health.ecologydevice.clouddevice.DownloadCloudDeviceManager.4.3
                    @Override // com.huawei.health.ecologydevice.callback.DownloadCallback
                    public void onSuccess() {
                        LogUtil.a("DownloadCloudDeviceManager", "save cloud device to db.");
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Map<String, Object> profile = ((DeviceProfile) it.next()).getProfile();
                            if (profile != null && "ZAA6".equals(DownloadCloudDeviceManager.this.a("prodId", profile))) {
                                new efk().a(DownloadCloudDeviceManager.this.a("mac", profile), DownloadCloudDeviceManager.this.a("deviceName", profile), DownloadCloudDeviceManager.this.a("sn", profile), "4bfc5a27-f2b9-4c41-bd9b-a4a2a18f752c", DownloadCloudDeviceManager.this.a("wiseDeviceId", profile), "0");
                            }
                        }
                        DownloadCloudDeviceManager.this.e(true);
                    }

                    @Override // com.huawei.health.ecologydevice.callback.DownloadCallback
                    public void onFailure(int i) {
                        LogUtil.j("DownloadCloudDeviceManager", "device resource is err, errorCode is ", Integer.valueOf(i));
                        DownloadCloudDeviceManager.this.e(false);
                    }
                });
            }

            @Override // com.huawei.health.ecologydevice.callback.DownloadCallback
            public void onFailure(int i) {
                LogUtil.j("DownloadCloudDeviceManager", "index_all is err, errorCode is ", Integer.valueOf(i));
                DownloadCloudDeviceManager.this.e(false);
            }
        };
    }

    private boolean a(String str, List<DeviceProfile> list) {
        if (njy.e(list)) {
            return false;
        }
        Iterator<DeviceProfile> it = list.iterator();
        while (it.hasNext()) {
            Map<String, Object> profile = it.next().getProfile();
            if (profile != null && str.equals(a("prodId", profile))) {
                return true;
            }
        }
        return false;
    }

    private void e(Map<String, Object> map, String str, boolean z) {
        String strA = a("prodId", map);
        a("mac", map);
        a("deviceName", map);
        this.f6476b.d(str, strA, z, new DownloadCallback() { // from class: com.huawei.health.ecologydevice.clouddevice.DownloadCloudDeviceManager.1
            @Override // com.huawei.health.ecologydevice.callback.DownloadCallback
            public void onSuccess() {
                LogUtil.a("DownloadCloudDeviceManager", "downloadSingleDeviceResource onSuccess");
                DownloadCloudDeviceManager.this.e(true);
            }

            @Override // com.huawei.health.ecologydevice.callback.DownloadCallback
            public void onFailure(int i) {
                LogUtil.j("DownloadCloudDeviceManager", "downloadSingleDeviceResource onFailure : errorCode is ", Integer.valueOf(i));
                DownloadCloudDeviceManager.this.e(false);
            }
        });
    }

    private void b(Map<String, Object> map, String str) {
        ProductMapInfo productMapInfoD = ProductMap.d(str);
        if (productMapInfoD == null) {
            LogUtil.j("DownloadCloudDeviceManager", "productInfo is null");
            return;
        }
        String strF = productMapInfoD.f();
        if (TextUtils.isEmpty(strF)) {
            LogUtil.j("DownloadCloudDeviceManager", "productId is error");
            return;
        }
        CloudSwatchDeviceInfo cloudSwatchDeviceInfo = new CloudSwatchDeviceInfo();
        cloudSwatchDeviceInfo.setHiLinkDeviceId(str);
        String strA = a("sn", map);
        String strA2 = a(ProfileRequestConstants.FWV, map);
        String strA3 = a("model", map);
        String strA4 = a("deviceName", map);
        cloudSwatchDeviceInfo.setDeviceSn(strA);
        cloudSwatchDeviceInfo.setSoftVersion(strA2);
        cloudSwatchDeviceInfo.setDeviceModel(strA3);
        cloudSwatchDeviceInfo.setDeviceName(strA4);
        cloudSwatchDeviceInfo.setProductId(strF);
        List<CloudSwatchDeviceInfo> list = this.d;
        if (list != null) {
            list.add(cloudSwatchDeviceInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, Map<String, Object> map) {
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return "";
    }

    public void b() {
        this.f6475a = null;
        List<CloudSwatchDeviceInfo> list = this.d;
        if (list != null) {
            list.clear();
            this.d = null;
        }
    }
}
