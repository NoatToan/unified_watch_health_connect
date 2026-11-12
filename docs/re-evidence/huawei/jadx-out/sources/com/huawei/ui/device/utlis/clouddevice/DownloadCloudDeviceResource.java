package com.huawei.ui.device.utlis.clouddevice;

import android.os.Looper;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import com.huawei.hwdevice.outofprocess.mgr.device.ProfileAgent;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import com.huawei.profile.client.profile.ProfileClient;
import com.huawei.profile.profile.DeviceProfile;
import com.huawei.profile.profile.ServiceCharacteristicProfile;
import com.huawei.profile.profile.ServiceProfile;
import com.huawei.ui.device.utlis.clouddevice.DownloadCloudDeviceResource;
import defpackage.edl;
import defpackage.eds;
import defpackage.edx;
import defpackage.edz;
import defpackage.lvl;
import defpackage.mel;
import defpackage.mgz;
import defpackage.njy;
import defpackage.phz;
import defpackage.qtk;
import health.compact.a.CommonUtil;
import health.compact.a.EzPluginManager;
import health.compact.a.Services;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class DownloadCloudDeviceResource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<DeviceProfile> f24961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExecutorService f24962b;
    private long d;

    public interface DeviceResourceCallback {
        void deviceResourceCallbackResultDeviceList(List<CloudDeviceInfo> list);
    }

    public boolean e() {
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode() || Utils.o()) {
            return false;
        }
        lvl.b(-1, "default", false);
        return true;
    }

    private void d() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: rfm
            @Override // java.lang.Runnable
            public final void run() {
                DownloadCloudDeviceResource.c();
            }
        });
    }

    public static /* synthetic */ void c() {
        List<eds> deviceList = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getDeviceList();
        if (deviceList == null || deviceList.size() <= 0) {
            LogUtil.a("DownloadCloudDeviceResource", "checkDownloadIndexAll ---downloadIndexAll");
            ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).downloadIndexAll();
        }
    }

    public void e(BaseResponseCallback<Boolean> baseResponseCallback) {
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode() || Utils.o() || CommonUtil.ca()) {
            ReleaseLogUtil.e("R_DownloadCloudDeviceResource", "isStoreDemoVersion:", Boolean.valueOf(CommonUtil.ca()));
            baseResponseCallback.onResponse(0, false);
        } else {
            a(baseResponseCallback);
        }
    }

    private void a(final BaseResponseCallback<Boolean> baseResponseCallback) {
        if (System.currentTimeMillis() - this.d < 60000) {
            LogUtil.j("DownloadCloudDeviceResource", "configDownloadDeviceUuid subTime < 60s");
        } else {
            this.d = System.currentTimeMillis();
            mel.e().d("DownloadCloudDeviceResource", new IBaseResponseCallback() { // from class: rff
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f47256b.e(baseResponseCallback, i, obj);
                }
            });
        }
    }

    public /* synthetic */ void e(final BaseResponseCallback baseResponseCallback, int i, Object obj) {
        if (i != 0 || !njy.b(obj, DeviceProfile.class)) {
            this.d = 0L;
            LogUtil.j("DownloadCloudDeviceResource", "getCloudDeviceList errorCode:", Integer.valueOf(i));
        } else {
            final List<String> listD = mgz.d();
            List<DeviceProfile> list = (List) obj;
            LogUtil.a("DownloadCloudDeviceResource", "getCloudDeviceList deviceCloudProfiles:", Integer.valueOf(list.size()));
            a(list, new DeviceResourceCallback() { // from class: com.huawei.ui.device.utlis.clouddevice.DownloadCloudDeviceResource.4
                @Override // com.huawei.ui.device.utlis.clouddevice.DownloadCloudDeviceResource.DeviceResourceCallback
                public void deviceResourceCallbackResultDeviceList(List<CloudDeviceInfo> list2) {
                    LogUtil.a("DownloadCloudDeviceResource", "getCloudDeviceList firstDeviceResult deviceInfos:", list2 == null ? Constants.NULL : Integer.valueOf(list2.size()));
                    DownloadCloudDeviceResource.this.d(list2, (List<String>) listD, (BaseResponseCallback<Boolean>) baseResponseCallback);
                }
            }, new DeviceResourceCallback() { // from class: com.huawei.ui.device.utlis.clouddevice.DownloadCloudDeviceResource.5
                @Override // com.huawei.ui.device.utlis.clouddevice.DownloadCloudDeviceResource.DeviceResourceCallback
                public void deviceResourceCallbackResultDeviceList(List<CloudDeviceInfo> list2) {
                    LogUtil.a("DownloadCloudDeviceResource", "getCloudDeviceList deviceResourceCallbackResultDeviceList deviceInfos:", list2 == null ? Constants.NULL : Integer.valueOf(list2.size()));
                    DownloadCloudDeviceResource.this.d(list2, (List<String>) listD, (BaseResponseCallback<Boolean>) baseResponseCallback);
                    DownloadCloudDeviceResource.this.d = 0L;
                    mgz.a((List<String>) listD);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<CloudDeviceInfo> list, List<String> list2, BaseResponseCallback<Boolean> baseResponseCallback) {
        if (njy.b(list)) {
            a(list, list2);
            lvl.b(list);
            baseResponseCallback.onResponse(0, true);
        }
    }

    private void a(List<CloudDeviceInfo> list, List<String> list2) {
        LogUtil.a("DownloadCloudDeviceResource", "fillerDeleteCloudDevice begin deviceInfos deviceInfos:", Integer.valueOf(list.size()), "  deleteContainer:", Integer.valueOf(list2.size()));
        if (njy.e(list2)) {
            return;
        }
        Iterator<CloudDeviceInfo> it = list.iterator();
        while (it.hasNext()) {
            CloudDeviceInfo next = it.next();
            if (list2.contains(next.getDeviceProfileId())) {
                LogUtil.a("DownloadCloudDeviceResource", "fillerDeleteCloudDevice remove: ", next.getDeviceName());
                it.remove();
            }
        }
        LogUtil.a("DownloadCloudDeviceResource", "fillerDeleteCloudDevice end deviceInfos deviceInfos:", Integer.valueOf(list.size()), "  deleteContainer:", Integer.valueOf(list2.size()));
    }

    public void b() {
        ExecutorService executorService = this.f24962b;
        if (executorService != null) {
            if (!executorService.isShutdown()) {
                this.f24962b.shutdown();
            }
            this.f24962b = null;
        }
    }

    private void a(List<DeviceProfile> list, final DeviceResourceCallback deviceResourceCallback, final DeviceResourceCallback deviceResourceCallback2) {
        if (list.isEmpty()) {
            deviceResourceCallback2.deviceResourceCallbackResultDeviceList(null);
            return;
        }
        d();
        final List<CloudDeviceInfo> listB = b(list);
        if (listB.isEmpty()) {
            deviceResourceCallback2.deviceResourceCallbackResultDeviceList(null);
            return;
        }
        int iA = lvl.a();
        LogUtil.a("DownloadCloudDeviceResource", "configDeviceProfiles deviceInfoList size:", Integer.valueOf(listB.size()), " storageCloudDevices:", Integer.valueOf(lvl.a()));
        if (iA > 0) {
            d(listB, deviceResourceCallback2);
        } else {
            listB.sort(new Comparator() { // from class: rfd
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((CloudDeviceInfo) obj2).getLastConnectedTime(), ((CloudDeviceInfo) obj).getLastConnectedTime());
                }
            });
            SimpleChain.b("DownloadCloudDeviceResource").e(new SimpleChain.INext() { // from class: com.huawei.ui.device.utlis.clouddevice.DownloadCloudDeviceResource.2
                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
                public void onNext(SimpleChain.Emitter emitter, Object... objArr) {
                    DownloadCloudDeviceResource.this.a((CloudDeviceInfo) listB.get(0), deviceResourceCallback, emitter);
                }
            }).d(new SimpleChain.Emitter() { // from class: com.huawei.ui.device.utlis.clouddevice.DownloadCloudDeviceResource.3
                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
                public void onSuccess(Object... objArr) {
                    DownloadCloudDeviceResource.this.d((List<CloudDeviceInfo>) listB, deviceResourceCallback2);
                }
            }, new Object[0]);
        }
    }

    private List<CloudDeviceInfo> b(List<DeviceProfile> list) {
        String str;
        LogUtil.a("DownloadCloudDeviceResource", "generateCloudDeviceInfos size:", Integer.valueOf(list.size()));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (DeviceProfile deviceProfile : list) {
            Map<String, Object> profile = deviceProfile.getProfile();
            CloudDeviceInfo cloudDeviceInfo = new CloudDeviceInfo();
            try {
                if (!b(profile, cloudDeviceInfo)) {
                    if (!(profile.get("sn") instanceof String)) {
                        str = "";
                    } else {
                        str = (String) profile.get("sn");
                        LogUtil.a("DownloadCloudDeviceResource", "serial string:", CommonUtil.n(str));
                    }
                    final String id = deviceProfile.getId();
                    LogUtil.a("DownloadCloudDeviceResource", "deviceProfileId string:", CommonUtil.n(id));
                    if (!TextUtils.isEmpty(id) && (id.contains("ANDROID21") || (str != null && str.contains("ANDROID21")))) {
                        FutureTask futureTask = new FutureTask(new Callable<Object>() { // from class: com.huawei.ui.device.utlis.clouddevice.DownloadCloudDeviceResource.1
                            @Override // java.util.concurrent.Callable
                            public Object call() throws Exception {
                                return DownloadCloudDeviceResource.this.b(id);
                            }
                        });
                        try {
                            ExecutorService executorService = this.f24962b;
                            if (executorService == null || executorService.isShutdown()) {
                                this.f24962b = Executors.newCachedThreadPool();
                            }
                            this.f24962b.execute(futureTask);
                        } catch (RejectedExecutionException unused) {
                            LogUtil.e("DownloadCloudDeviceResource", "configDeviceProfiles RejectedExecutionException!");
                        }
                        cloudDeviceInfo.setDeviceProfileId(id);
                        linkedHashMap.put(cloudDeviceInfo, futureTask);
                    }
                }
            } catch (ClassCastException unused2) {
                LogUtil.e("DownloadCloudDeviceResource", "ClassCastException");
            } catch (NumberFormatException unused3) {
                LogUtil.e("DownloadCloudDeviceResource", "NumberFormatException");
            }
        }
        ArrayList arrayList = new ArrayList(0);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            d((CloudDeviceInfo) entry.getKey(), (FutureTask<Object>) entry.getValue(), arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CloudDeviceInfo cloudDeviceInfo, final DeviceResourceCallback deviceResourceCallback, final SimpleChain.Emitter emitter) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(cloudDeviceInfo);
        d(arrayList, new DeviceResourceCallback() { // from class: rfh
            @Override // com.huawei.ui.device.utlis.clouddevice.DownloadCloudDeviceResource.DeviceResourceCallback
            public final void deviceResourceCallbackResultDeviceList(List list) {
                DownloadCloudDeviceResource.d(deviceResourceCallback, emitter, list);
            }
        });
    }

    public static /* synthetic */ void d(DeviceResourceCallback deviceResourceCallback, SimpleChain.Emitter emitter, List list) {
        deviceResourceCallback.deviceResourceCallbackResultDeviceList(list);
        if (list == null) {
            emitter.onError("handleFirstDevice deviceResourceCallbackResultDeviceList deviceInfos == null");
        } else {
            emitter.onSuccess(new Object[0]);
        }
    }

    private boolean b(Map<String, Object> map, CloudDeviceInfo cloudDeviceInfo) {
        String str;
        String str2 = map.get("devType") instanceof String ? (String) map.get("devType") : null;
        if (str2 == null) {
            LogUtil.j("DownloadCloudDeviceResource", "cloudDevice type is null");
            return true;
        }
        LogUtil.j("DownloadCloudDeviceResource", "configDeviceProfiles type:", str2);
        if (!str2.equals("06E") && !str2.equals("06D") && !str2.equals("A12")) {
            LogUtil.j("DownloadCloudDeviceResource", "cloudDevice type not is watch or band");
            return true;
        }
        if (!(map.get("prodId") instanceof String)) {
            str = "";
        } else {
            str = (String) map.get("prodId");
            if ("004Q".equals(str) || "004U".equals(str)) {
                LogUtil.j("DownloadCloudDeviceResource", "leo is not support");
                return true;
            }
        }
        LogUtil.j("DownloadCloudDeviceResource", "smartProductId:", str);
        cloudDeviceInfo.setHiLinkDeviceId(str);
        if (!TextUtils.isEmpty(str)) {
            return d(map, cloudDeviceInfo);
        }
        LogUtil.j("DownloadCloudDeviceResource", "smartProductId or subMac or deviceName or deviceUdid is null.");
        return true;
    }

    private boolean d(Map<String, Object> map, CloudDeviceInfo cloudDeviceInfo) {
        String str;
        String str2;
        String str3;
        String str4 = "";
        if (map.get("deviceName") instanceof String) {
            str = (String) map.get("deviceName");
            LogUtil.a("DownloadCloudDeviceResource", "deviceName:", str);
        } else {
            str = "";
        }
        cloudDeviceInfo.setDeviceName(str);
        if (map.get("mac") instanceof String) {
            str2 = (String) map.get("mac");
            LogUtil.a("DownloadCloudDeviceResource", "subMac:", str2);
        } else {
            str2 = "";
        }
        if (TextUtils.isEmpty(str2) || str2.trim().length() <= 3) {
            ReleaseLogUtil.d("R_DownloadCloudDeviceResource", "isSkipCheckBasicInfo deviceName:", cloudDeviceInfo, " subMac:", str2);
            return true;
        }
        cloudDeviceInfo.setDeviceIdentify(str2);
        if (map.get("udid") instanceof String) {
            str3 = (String) map.get("udid");
            LogUtil.a("DownloadCloudDeviceResource", "device id string:", CommonUtil.n(str3));
        } else {
            str3 = "";
        }
        cloudDeviceInfo.setSmartDeviceUdid(str3);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            LogUtil.j("DownloadCloudDeviceResource", "deviceName or deviceUdid is null.");
            return true;
        }
        if (map.get("model") instanceof String) {
            str4 = (String) map.get("model");
            LogUtil.a("DownloadCloudDeviceResource", "device model:", str4);
        }
        cloudDeviceInfo.setDeviceModel(str4);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str) {
        ProfileClient clientAgent = ProfileAgent.PROFILE_AGENT.getClientAgent();
        List<ServiceProfile> servicesOfDevice = clientAgent.getServicesOfDevice(str, true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        String str2 = "";
        if (servicesOfDevice == null) {
            return "";
        }
        Iterator<ServiceProfile> it = servicesOfDevice.iterator();
        while (it.hasNext()) {
            String id = it.next().getId();
            LogUtil.a("DownloadCloudDeviceResource", "ServiceProfile serviceId:", id);
            if (!TextUtils.isEmpty(id) && BleConstants.DEV_INFO.equals(id)) {
                ServiceCharacteristicProfile serviceCharacteristics = clientAgent.getServiceCharacteristics(str, id, true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
                if (serviceCharacteristics == null) {
                    LogUtil.j("DownloadCloudDeviceResource", "characteristicProfile is null");
                } else {
                    for (Map.Entry<String, Object> entry : serviceCharacteristics.getProfile().entrySet()) {
                        String key = entry.getKey();
                        String string = entry.getValue().toString();
                        LogUtil.a("DownloadCloudDeviceResource", "profileMap character key:", key, "characterValue:", string);
                        if ("timestamp".equals(key)) {
                            str2 = string;
                            break;
                        }
                    }
                }
            }
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final List<CloudDeviceInfo> list, final DeviceResourceCallback deviceResourceCallback) {
        if (list.isEmpty()) {
            deviceResourceCallback.deviceResourceCallbackResultDeviceList(null);
            return;
        }
        List<eds> deviceList = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getDeviceList();
        LogUtil.a("DownloadCloudDeviceResource", "devicePluginConfig ---:", Boolean.valueOf(njy.b(deviceList)));
        if (njy.b(deviceList)) {
            LogUtil.a("DownloadCloudDeviceResource", "getAllDeviceList have data");
            c(list, deviceResourceCallback);
        } else {
            LogUtil.a("DownloadCloudDeviceResource", "devicePluginConfig getAllDeviceList null ---downloadIndexAll");
            ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).addDownloadIndexAllCallBack(new DownloadResultCallBack() { // from class: rfe
                @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadResultCallBack
                public final void setDownloadStatus(int i, int i2) {
                    this.d.c(list, deviceResourceCallback, i, i2);
                }
            });
            ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).downloadIndexAll();
        }
    }

    public /* synthetic */ void c(List list, DeviceResourceCallback deviceResourceCallback, int i, int i2) {
        LogUtil.a("DownloadCloudDeviceResource", "devicePluginConfig downloadStatus:", Integer.valueOf(i));
        if (i != 1) {
            if (i == -1 || i == -2) {
                deviceResourceCallback.deviceResourceCallbackResultDeviceList(null);
                ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).onDownloadIndexAllDestroy();
                return;
            }
            return;
        }
        List<eds> deviceList = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getDeviceList();
        LogUtil.a("DownloadCloudDeviceResource", "devicePluginConfig addDownloadIndexAllCallBack---:", Boolean.valueOf(njy.b(deviceList)));
        if (njy.b(deviceList)) {
            LogUtil.a("DownloadCloudDeviceResource", "getAllDeviceList have data");
            c((List<CloudDeviceInfo>) list, deviceResourceCallback);
        } else {
            deviceResourceCallback.deviceResourceCallbackResultDeviceList(null);
            ReleaseLogUtil.e("R_DownloadCloudDeviceResource", "devicePluginConfig downloadIndexAll SUCCESS, but getDeviceList is empty");
        }
        ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).onDownloadIndexAllDestroy();
    }

    private void d(CloudDeviceInfo cloudDeviceInfo, FutureTask<Object> futureTask, List<CloudDeviceInfo> list) {
        String str = null;
        try {
            Object obj = futureTask.get();
            if (obj instanceof String) {
                String str2 = (String) obj;
                try {
                    LogUtil.a("DownloadCloudDeviceResource", "timestamp", str2);
                    str = str2;
                } catch (InterruptedException unused) {
                    str = str2;
                    LogUtil.e("DownloadCloudDeviceResource", "futureTask InterruptedException!");
                } catch (ExecutionException unused2) {
                    str = str2;
                    LogUtil.e("DownloadCloudDeviceResource", "futureTask ExecutionException!");
                }
            }
        } catch (InterruptedException unused3) {
        } catch (ExecutionException unused4) {
        }
        if (!TextUtils.isEmpty(str)) {
            cloudDeviceInfo.setLastConnectedTime(CommonUtil.i(str));
        }
        cloudDeviceInfo.setIsCloudDevice(true);
        list.add(cloudDeviceInfo);
    }

    private void c(List<CloudDeviceInfo> list, DeviceResourceCallback deviceResourceCallback) {
        LogUtil.a("DownloadCloudDeviceResource", "configDownloadDeviceUuid deviceInfoList.size:", Integer.valueOf(list.size()));
        ArrayList arrayList = new ArrayList(0);
        for (CloudDeviceInfo cloudDeviceInfo : list) {
            Iterator<eds> it = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getDeviceInfoByBluetooth(cloudDeviceInfo.getDeviceName()).iterator();
            while (it.hasNext()) {
                e(it.next(), arrayList);
            }
            LogUtil.a("DownloadCloudDeviceResource", "configDownloadDeviceUuid deviceInfo getDeviceName:", CommonUtil.n(cloudDeviceInfo.getDeviceName()));
        }
        LogUtil.a("DownloadCloudDeviceResource", "configDownloadDeviceUuid uuidList.size:", Integer.valueOf(arrayList.size()));
        if (arrayList.isEmpty()) {
            e(list, deviceResourceCallback);
            LogUtil.a("DownloadCloudDeviceResource", "uuidList size is 0");
        } else {
            LogUtil.a("DownloadCloudDeviceResource", "uuidList.size():", Integer.valueOf(arrayList.size()));
            b(arrayList, list, deviceResourceCallback);
        }
    }

    private void e(eds edsVar, List<String> list) {
        if (edsVar == null || edsVar.aa().size() <= 0) {
            return;
        }
        LogUtil.a("DownloadCloudDeviceResource", "configDownloadDeviceUuid pluginInfoBean.getUuidList().size():", Integer.valueOf(edsVar.aa().size()));
        for (int i = 0; i < edsVar.aa().size(); i++) {
            String str = edsVar.aa().get(i);
            if (!((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(str) && !list.contains(str)) {
                list.add(str);
            }
        }
    }

    private void b(List<String> list, final List<CloudDeviceInfo> list2, final DeviceResourceCallback deviceResourceCallback) {
        LogUtil.a("DownloadCloudDeviceResource", "downloadDeviceInfoWithUuid uuidList.size:", Integer.valueOf(list.size()));
        ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).downloadIndexByUuidList(list, new DownloadDeviceInfoCallBack() { // from class: com.huawei.ui.device.utlis.clouddevice.DownloadCloudDeviceResource.10
            @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack
            public void onSuccess() {
                LogUtil.a("DownloadCloudDeviceResource", "downloadDeviceInfoWithUuid downloadIndexByUuidList onSuccess");
                DownloadCloudDeviceResource.this.e((List<CloudDeviceInfo>) list2, deviceResourceCallback);
            }

            @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack
            public void onFailure(int i) {
                LogUtil.a("DownloadCloudDeviceResource", "downloadDeviceInfoWithUuid downloadIndexByUuidList onFailure");
                deviceResourceCallback.deviceResourceCallbackResultDeviceList(null);
            }

            @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack
            public void netWorkError() {
                LogUtil.a("DownloadCloudDeviceResource", "downloadDeviceInfoWithUuid downloadIndexByUuidList netWorkError");
                deviceResourceCallback.deviceResourceCallbackResultDeviceList(null);
            }

            @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack
            public void onDownload(int i) {
                LogUtil.d("DownloadCloudDeviceResource", "progressBar:", Integer.valueOf(i));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final List<CloudDeviceInfo> list, final DeviceResourceCallback deviceResourceCallback) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: rfj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47258c.b(list, deviceResourceCallback);
                }
            });
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        for (CloudDeviceInfo cloudDeviceInfo : list) {
            int iA = a(cloudDeviceInfo.getHiLinkDeviceId());
            LogUtil.a("DownloadCloudDeviceResource", "getDeviceType:", Integer.valueOf(iA), "deviceName:", CommonUtil.n(cloudDeviceInfo.getDeviceName()));
            if (iA != -1) {
                cloudDeviceInfo.setProductType(iA);
                arrayList.add(cloudDeviceInfo);
            }
        }
        LogUtil.a("DownloadCloudDeviceResource", "deviceList:", Integer.valueOf(arrayList.size()));
        deviceResourceCallback.deviceResourceCallbackResultDeviceList(arrayList);
    }

    public /* synthetic */ void b(List list, DeviceResourceCallback deviceResourceCallback) {
        e((List<CloudDeviceInfo>) list, deviceResourceCallback);
    }

    public boolean b(String str, boolean z) {
        FutureTask futureTask = new FutureTask(a(str, z));
        boolean z2 = false;
        try {
            ExecutorService executorService = this.f24962b;
            if (executorService == null || executorService.isShutdown()) {
                this.f24962b = Executors.newCachedThreadPool();
            }
            this.f24962b.execute(futureTask);
            try {
                Object obj = futureTask.get();
                if (!(obj instanceof Boolean)) {
                    return false;
                }
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                try {
                    LogUtil.a("DownloadCloudDeviceResource", "isSupportPush", bool);
                    return zBooleanValue;
                } catch (InterruptedException unused) {
                    z2 = zBooleanValue;
                } catch (ExecutionException unused2) {
                    z2 = zBooleanValue;
                    LogUtil.e("DownloadCloudDeviceResource", "futureTask ExecutionException!");
                    return z2;
                }
            } catch (InterruptedException unused3) {
            } catch (ExecutionException unused4) {
            }
            LogUtil.e("DownloadCloudDeviceResource", "futureTask InterruptedException!");
            return z2;
        } catch (RejectedExecutionException unused5) {
            LogUtil.e("DownloadCloudDeviceResource", "getDeviceCapDeviceIsSupport RejectedExecutionException!");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(String str) {
        String str2;
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        mel.e().d("DownloadCloudDeviceResource", new IBaseResponseCallback() { // from class: com.huawei.ui.device.utlis.clouddevice.DownloadCloudDeviceResource.9
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0 && njy.b(obj, DeviceProfile.class)) {
                    DownloadCloudDeviceResource.this.f24961a = (List) obj;
                } else {
                    LogUtil.j("DownloadCloudDeviceResource", "getDeviceProfileId errorCode:", Integer.valueOf(i));
                }
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS);
            List<DeviceProfile> list = this.f24961a;
            if (list == null) {
                LogUtil.j("DownloadCloudDeviceResource", "getDeviceProfileId deviceProfiles is null");
                return "";
            }
            for (DeviceProfile deviceProfile : list) {
                String id = deviceProfile.getId();
                Map<String, Object> profile = deviceProfile.getProfile();
                if (profile.get("sn") instanceof String) {
                    str2 = (String) profile.get("sn");
                    LogUtil.a("DownloadCloudDeviceResource", "getDeviceProfileId serial string:", CommonUtil.n(str2));
                } else {
                    str2 = null;
                }
                if (str.equals(id) || (!TextUtils.isEmpty(str2) && str.equals(str2))) {
                    return id;
                }
            }
            return str;
        } catch (InterruptedException unused) {
            LogUtil.e("DownloadCloudDeviceResource", "getDeviceProfileId InterruptedException");
            return "";
        }
    }

    private Callable<Object> a(final String str, final boolean z) {
        return new Callable<Object>() { // from class: com.huawei.ui.device.utlis.clouddevice.DownloadCloudDeviceResource.7
            @Override // java.util.concurrent.Callable
            public Object call() throws Exception {
                List<ServiceProfile> servicesOfDevice;
                ProfileClient clientAgent = ProfileAgent.PROFILE_AGENT.getClientAgent();
                String strC = DownloadCloudDeviceResource.this.c(str);
                if (TextUtils.isEmpty(strC) || (servicesOfDevice = clientAgent.getServicesOfDevice(strC, true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN))) == null) {
                    return false;
                }
                Iterator<ServiceProfile> it = servicesOfDevice.iterator();
                while (it.hasNext()) {
                    String id = it.next().getId();
                    LogUtil.a("DownloadCloudDeviceResource", "ServiceProfile serviceId:", id);
                    if (!TextUtils.isEmpty(id) && ("WEARisSupportMultiLink".equals(id) || "WEARisSupportSingleLink".equals(id))) {
                        ServiceCharacteristicProfile serviceCharacteristics = clientAgent.getServiceCharacteristics(strC, id, z, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
                        if (serviceCharacteristics == null) {
                            LogUtil.j("DownloadCloudDeviceResource", "getDeviceCapDeviceIsSupport characteristicProfile is null");
                        } else {
                            for (Map.Entry<String, Object> entry : serviceCharacteristics.getProfile().entrySet()) {
                                String key = entry.getKey();
                                String string = entry.getValue().toString();
                                LogUtil.a("DownloadCloudDeviceResource", "profileMap character key:", key, "characterValue:", string);
                                if ("ability".equals(key) && CommonUtil.j(string) == 1) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            }
        };
    }

    private int a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DownloadCloudDeviceResource", "getDeviceInfoBySubMac() subMac or smartProductId is isEmpty");
            return -1;
        }
        LogUtil.a("DownloadCloudDeviceResource", "getDeviceInfoBySubMac smartProductId is ", str);
        int iE = e(str);
        if (iE != -1) {
            LogUtil.a("DownloadCloudDeviceResource", "getDeviceInfoBySubMac localDeviceType is ", Integer.valueOf(iE));
            return iE;
        }
        edl edlVarD = d(str);
        if (edlVarD == null) {
            return -1;
        }
        LogUtil.a("DownloadCloudDeviceResource", "getDeviceInfoBySubMac() ezPluginInfo not null");
        return qtk.a(edlVarD);
    }

    private int e(String str) {
        HashMap map = new HashMap(16);
        map.put("004Q", 10);
        map.put("004U", 10);
        map.put("004W", 8);
        map.put("0050", 14);
        map.put("0051", 15);
        map.put("004Z", 7);
        map.put("0054", 13);
        map.put("0056", 12);
        if (map.containsKey(str)) {
            return ((Integer) map.get(str)).intValue();
        }
        return -1;
    }

    private edl d(String str) {
        List<phz> listC = EzPluginManager.b().c();
        if (listC == null || listC.isEmpty()) {
            LogUtil.j("DownloadCloudDeviceResource", "bindWearDevice hiLinkDeviceList is null or hiLinkDeviceList is empty");
            return i(str);
        }
        Iterator<phz> it = listC.iterator();
        edl edlVarB = null;
        while (it.hasNext()) {
            String strA = it.next().a();
            if (((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(strA) && (edlVarB = b(strA, str)) != null) {
                LogUtil.a("DownloadCloudDeviceResource", "bindWearDevice ezPluginInfo not null");
                break;
            }
        }
        return edlVarB != null ? edlVarB : i(str);
    }

    private edl i(String str) {
        List<edx> indexList = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getIndexList();
        edl edlVarB = null;
        if (indexList == null || indexList.isEmpty()) {
            LogUtil.j("DownloadCloudDeviceResource", "bindWearDevice hiLinkDeviceList is null or hiLinkDeviceList is empty");
            return null;
        }
        Iterator<edx> it = indexList.iterator();
        while (it.hasNext()) {
            String strB = it.next().b();
            if (((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(strB) && (edlVarB = b(strB, str)) != null) {
                LogUtil.a("DownloadCloudDeviceResource", "bindWearDevice ezPluginInfo not null");
                break;
            }
        }
        return edlVarB;
    }

    private edl b(String str, String str2) {
        LogUtil.a("DownloadCloudDeviceResource", "gePluginInfo product is ", str, " productId is ", str2);
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(str);
        if (pluginInfoByUuid == null) {
            LogUtil.j("DownloadCloudDeviceResource", "gePluginInfo pluginInfo is null");
            return null;
        }
        edz edzVarI = pluginInfoByUuid.i();
        if (edzVarI == null) {
            LogUtil.j("DownloadCloudDeviceResource", "gePluginInfo pluginInfoForWear is empty");
            return null;
        }
        if (TextUtils.isEmpty(edzVarI.e())) {
            LogUtil.j("DownloadCloudDeviceResource", "gePluginInfo AiTipsProduct is empty");
            return null;
        }
        LogUtil.d("DownloadCloudDeviceResource", "gePluginInfo AiTipsProduct is", edzVarI.e());
        try {
            if (new JSONObject(edzVarI.e()).has("ai_tips_product_" + str2)) {
                return pluginInfoByUuid;
            }
            return null;
        } catch (JSONException unused) {
            LogUtil.e("DownloadCloudDeviceResource", "getPluginInfo JSONException");
        }
    }
}
