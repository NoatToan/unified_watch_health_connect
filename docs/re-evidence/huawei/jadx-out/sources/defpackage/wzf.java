package defpackage;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.profile.profile.DeviceProfile;
import com.huawei.ui.thirdpartservice.interactors.callback.SupportDeviceResultCallback;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class wzf {
    private Bitmap b(DeviceInfo deviceInfo, int i) {
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(ecu.d().getDeviceInfoUx(deviceInfo.getProductType(), "DeviceService").aa());
        return ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImageName(pluginInfoByUuid, eep.e(pluginInfoByUuid, i, deviceInfo));
    }

    public Bitmap c(DeviceInfo deviceInfo) {
        return b(deviceInfo, 2);
    }

    public List<DeviceInfo> a() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "DeviceService");
        return deviceList != null ? deviceList : new ArrayList();
    }

    public void d(ICloudOperationResult<List<DeviceInfo>> iCloudOperationResult) {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "DeviceService");
        if (deviceList == null) {
            deviceList = new ArrayList<>();
        }
        List<DeviceInfo> listD = d(deviceList);
        LogUtil.a("DeviceService", "crippledList size :", Integer.valueOf(listD.size()));
        if (listD.isEmpty()) {
            iCloudOperationResult.operationResult(deviceList, "", true);
        } else {
            b(deviceList, iCloudOperationResult);
        }
    }

    private List<DeviceInfo> d(List<DeviceInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (DeviceInfo deviceInfo : list) {
            if (TextUtils.isEmpty(deviceInfo.getHiLinkDeviceId())) {
                arrayList.add(deviceInfo);
            }
        }
        return arrayList;
    }

    private void b(final List<DeviceInfo> list, final ICloudOperationResult<List<DeviceInfo>> iCloudOperationResult) {
        ecu.d().getDevicesFromCloud("DownloadCloudDeviceResource", new IBaseResponseCallback() { // from class: wzk
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f52618a.e(list, iCloudOperationResult, i, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(List list, ICloudOperationResult iCloudOperationResult, int i, Object obj) {
        LogUtil.a("DeviceService", "getDevicesFromCloud: errorCode =", Integer.valueOf(i), " objData = ", obj);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DeviceInfo deviceInfo = (DeviceInfo) it.next();
            if (TextUtils.isEmpty(deviceInfo.getHiLinkDeviceId())) {
                if (i == 0 && njy.b(obj, DeviceProfile.class)) {
                    List<DeviceProfile> list2 = (List) obj;
                    LogUtil.a("DeviceService", "getDevicesFromCloud list size():", Integer.valueOf(list2.size()));
                    for (DeviceProfile deviceProfile : list2) {
                        String strD = d("prodId", deviceProfile.getProfile());
                        String strD2 = d("udid", deviceProfile.getProfile());
                        if (deviceInfo.getDeviceUdid().trim().equalsIgnoreCase(strD2.trim())) {
                            LogUtil.d("DeviceService", "cloud:deviceUdid = ", strD2, " prodId = ", strD);
                            LogUtil.d("DeviceService", "crippled:deviceUdid = ", deviceInfo.getDeviceUdid());
                            LogUtil.d("DeviceService", deviceInfo.getDeviceName(), " supplementsHiLinkDeviceId :setHiLinkDeviceId  prodId = ", strD);
                            deviceInfo.setHiLinkDeviceId(strD);
                        }
                    }
                }
                if (TextUtils.isEmpty(deviceInfo.getHiLinkDeviceId())) {
                    ReleaseLogUtil.d("DeviceService", "deviceInfo name", deviceInfo.getDeviceName());
                    eei.e(deviceInfo);
                }
            }
        }
        iCloudOperationResult.operationResult(list, "", true);
    }

    private String d(String str, Map<String, Object> map) {
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return "";
    }

    public List<DeviceInfo> d() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "DeviceService");
        return deviceList != null ? deviceList : new ArrayList();
    }

    public void d(final SupportDeviceResultCallback supportDeviceResultCallback) {
        LogUtil.a("DeviceService", "enter requestBindDevices ");
        new wzj().b(new ICloudOperationResult() { // from class: wzl
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.f52621c.c(supportDeviceResultCallback, (xcw) obj, str, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(SupportDeviceResultCallback supportDeviceResultCallback, xcw xcwVar, String str, boolean z) {
        if (z) {
            LogUtil.a("DeviceService", "requestBindDevices onSuccess :", str);
            supportDeviceResultCallback.obtainSupportDeviceList(xcwVar.getDevices());
            supportDeviceResultCallback.obtainBindDeviceList(e(xcwVar));
        } else {
            LogUtil.e("DeviceService", "requestBindDevices onFailure :", str);
            supportDeviceResultCallback.onError(-1, str);
        }
    }

    private List<xcp> e(xcw xcwVar) {
        List<DeviceInfo> listA = a();
        List<xcp> bindDevices = xcwVar.getBindDevices();
        if (njy.e(listA)) {
            LogUtil.d("DeviceService", "getBindDevices return original device list because local is empty.");
            return bindDevices;
        }
        for (xcp xcpVar : bindDevices) {
            LogUtil.d("DeviceService", "getBindDevices append device info: [" + xcpVar.getDeviceName() + " , " + xcpVar.getDeviceCode() + "]");
            d(listA, xcpVar);
        }
        return bindDevices;
    }

    private void d(List<DeviceInfo> list, xcp xcpVar) {
        for (DeviceInfo deviceInfo : list) {
            LogUtil.d("DeviceService", "Bind device append info start = [" + xcpVar.getDeviceName() + " , " + xcpVar.getIdentify() + "]");
            if (c(xcpVar, deviceInfo)) {
                xcpVar.setIcon(b(deviceInfo, 1));
                xcpVar.setDeviceName(deviceInfo.getDeviceName());
                xcpVar.setIdentify(deviceInfo.getDeviceIdentify());
            }
            LogUtil.d("DeviceService", "Bind device append info end = [" + xcpVar.getDeviceName() + " , " + xcpVar.getIdentify() + "]");
        }
    }

    private boolean c(xcp xcpVar, DeviceInfo deviceInfo) {
        String uniqueId = xcpVar.getUniqueId();
        StringBuilder sb = new StringBuilder();
        sb.append(deviceInfo.getUnConvertedUdid());
        sb.append("#ANDROID21");
        return (uniqueId.equalsIgnoreCase(sb.toString()) || xcpVar.getUniqueId().equalsIgnoreCase(deviceInfo.getUnConvertedUdid())) && xcpVar.getProductId() == ecu.d().getDeviceInfoUx(deviceInfo.getProductType(), "DeviceService").k();
    }

    public List<xcp> a(List<DeviceInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (DeviceInfo deviceInfo : list) {
            xcp xcpVar = new xcp();
            boolean z = true;
            xcpVar.setIcon(b(deviceInfo, 1));
            xcpVar.setDeviceName(deviceInfo.getDeviceName());
            xcpVar.setIdentify(deviceInfo.getDeviceIdentify());
            if (deviceInfo.getDeviceConnectState() != 2) {
                z = false;
            }
            xcpVar.setConnected(z);
            arrayList.add(xcpVar);
        }
        return arrayList;
    }
}
