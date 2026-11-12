package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.constant.TransferFileReqType;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.health.healthcloudconfig.listener.featureconfig.ConfigFileCallback;
import com.huawei.health.healthcloudconfig.voiceconfig.VoiceConfigCallback;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.hwconfigmgr.FileDataContent;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapWearEngineManager;
import com.huawei.unitedevice.constant.WearEngineModule;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class mru {
    private static volatile mru f;
    private DataReceiveCallback g = new DataReceiveCallback() { // from class: mru.4
        @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
        public void onDataReceived(int i2, DeviceInfo deviceInfo, eec eecVar) {
            LogUtil.a("HwCloudFileConfigManager", "callback onDataReceived");
            if (deviceInfo == null || eecVar == null) {
                LogUtil.a("HwCloudFileConfigManager", "device or message is null.");
            } else if (eecVar instanceof eef) {
                mru.this.c((eef) eecVar, deviceInfo.getDeviceIdentify());
            }
        }
    };
    private Bundle h;
    private int j;
    private int k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f42304c = new Object();
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, DeviceInfo> f42302a = new HashMap(16);
    private static List<mrw> i = new ArrayList(16);
    private static boolean e = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ConfigFileCallback f42303b = new ConfigFileCallback() { // from class: mru.2
        @Override // com.huawei.health.healthcloudconfig.listener.featureconfig.ConfigFileCallback
        public void onFileResponse(List<String> list, String str, String str2) {
            LogUtil.a("HwCloudFileConfigManager", "registe ConfigFileCallback response");
            mru.b(list, str, str2, "");
        }
    };

    public static mru e() {
        synchronized (d) {
            if (f == null) {
                f = new mru();
            }
        }
        return f;
    }

    public void e(DeviceInfo deviceInfo) {
        LogUtil.a("HwCloudFileConfigManager", "onDeviceConnected,deviceName:", deviceInfo.getDeviceName());
        mrr.c();
        f42302a.put(deviceInfo.getDeviceIdentify(), deviceInfo);
        b();
        fec.d().a(deviceInfo.getDeviceIdentify(), f42303b);
    }

    public void c(DeviceInfo deviceInfo) {
        LogUtil.a("HwCloudFileConfigManager", "onDeviceDisconnected,deviceName:", deviceInfo.getDeviceName());
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "HwCloudFileConfigManager");
        if (deviceList == null || deviceList.size() == 0) {
            f42302a.remove(deviceInfo.getDeviceIdentify());
            j();
            fec.d().e(deviceInfo.getDeviceIdentify());
            return;
        }
        for (int i2 = 0; i2 < deviceList.size(); i2++) {
            if (eey.d(deviceList.get(i2), 104)) {
                return;
            }
        }
        f42302a.remove(deviceInfo.getDeviceIdentify());
        j();
        fec.d().e(deviceInfo.getDeviceIdentify());
    }

    private void b() {
        LogUtil.a("HwCloudFileConfigManager", "registerDeviceSampleListener enter");
        edc.e().registerDeviceSampleListener("hw.unitedevice.configManager", this.g);
    }

    private void j() {
        LogUtil.a("HwCloudFileConfigManager", "unRegisterDeviceSampleListener");
        edc.e().unRegisterDeviceSampleListener("hw.unitedevice.configManager");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(eef eefVar, String str) {
        ReleaseLogUtil.d("R_HwCloudFileConfigManager", "enter getResult");
        List<eeg> configInfoList = eefVar.getConfigInfoList();
        if (configInfoList == null || configInfoList.size() == 0) {
            LogUtil.j("HwCloudFileConfigManager", "onDataReceived sampleConfigInfos empty");
            return;
        }
        eeg eegVar = configInfoList.get(0);
        LogUtil.a("HwCloudFileConfigManager", "onDataReceived,action:", Integer.valueOf(eegVar.d()));
        int iD = eegVar.d();
        if (iD == 2) {
            e(eefVar, str);
            return;
        }
        if (iD == 5) {
            a(eefVar, str);
        } else if (iD != 6) {
            LogUtil.j("HwCloudFileConfigManager", "other action");
        } else {
            d(eefVar, str);
        }
    }

    private void d(eef eefVar, String str) {
        if (!mrp.d(eeq.d(mrp.c(eefVar)))) {
            b(eefVar, str);
            return;
        }
        synchronized (f42304c) {
            LogUtil.a("HwCloudFileConfigManager", "addDownloadTask");
            boolean zD = coq.d(i);
            i.add(new mrw(eefVar, str));
            if (zD) {
                d();
            } else {
                LogUtil.j("HwCloudFileConfigManager", "isRunTask is false");
            }
        }
    }

    private void d() {
        LogUtil.a("HwCloudFileConfigManager", "enter runTask");
        synchronized (f42304c) {
            if (i.isEmpty()) {
                LogUtil.j("HwCloudFileConfigManager", "task is completed");
                return;
            }
            eef eefVarD = i.get(0).d();
            String strC = i.get(0).c();
            if (eefVarD != null || !TextUtils.isEmpty(strC)) {
                if (a(strC)) {
                    LogUtil.a("HwCloudFileConfigManager", "task is removed, run next task");
                    d();
                    return;
                }
                b(eefVarD, strC);
            } else {
                LogUtil.j("HwCloudFileConfigManager", "sampleConfig is null");
                i.remove(0);
                d();
            }
        }
    }

    private void e(final eef eefVar, String str) {
        List<eeg> configInfoList = eefVar.getConfigInfoList();
        if (configInfoList == null || configInfoList.size() == 0) {
            LogUtil.j("HwCloudFileConfigManager", "onDataReceived sampleConfigInfos empty");
            return;
        }
        eeg eegVar = configInfoList.get(0);
        LogUtil.a("HwCloudFileConfigManager", "onDataReceived,action:", Integer.valueOf(eegVar.d()));
        if (eegVar.d() == 2) {
            String strE = eeq.e(eegVar.e());
            LogUtil.a("HwCloudFileConfigManager", "hexConfigData:", strE);
            if (fec.d().d(strE)) {
                ReleaseLogUtil.d("R_HwCloudFileConfigManager", "file has update");
                c(2, oqn.b(1), str, eefVar.getSrcPkgName());
                fec.d().b(strE, str, new ConfigFileCallback() { // from class: mru.5
                    @Override // com.huawei.health.healthcloudconfig.listener.featureconfig.ConfigFileCallback
                    public void onFileResponse(List<String> list, String str2, String str3) {
                        LogUtil.a("HwCloudFileConfigManager", "has update file response");
                        mru.b(list, str2, str3, eefVar.getSrcPkgName());
                    }
                });
                return;
            }
            c(2, oqn.b(0), str, eefVar.getSrcPkgName());
        }
    }

    private void a(final eef eefVar, String str) {
        String strC = mrp.c(eefVar);
        final String strD = eeq.d(strC);
        feo.e(str, strC, new VoiceConfigCallback() { // from class: mru.1
            @Override // com.huawei.health.healthcloudconfig.voiceconfig.VoiceConfigCallback
            public void onSuccess(String str2, List<fel> list) {
                if (!coq.d(list)) {
                    List<FileDataContent.FileData> listB = mru.this.b(list);
                    FileDataContent fileDataContentC = mru.this.c(strD);
                    if (fileDataContentC == null) {
                        LogUtil.j("HwCloudFileConfigManager", "checkFileUpdate, fileDataContent is null");
                        return;
                    }
                    ReleaseLogUtil.e("R_HwCloudFileConfigManager", "checkFileUpdate success");
                    fileDataContentC.setFileData(listB);
                    String strD2 = HiJsonUtil.d(fileDataContentC);
                    LogUtil.a("HwCloudFileConfigManager", "checkFileUpdate, data:", strD2);
                    mru.c(5, strD2, str2, eefVar.getSrcPkgName());
                    return;
                }
                ReleaseLogUtil.e("R_HwCloudFileConfigManager", "checkFileUpdate is not update");
            }

            @Override // com.huawei.health.healthcloudconfig.voiceconfig.VoiceConfigCallback
            public void onFailure(String str2, String str3) {
                LogUtil.j("HwCloudFileConfigManager", "checkFileUpdate is fail: ", str3);
            }
        });
    }

    private void b(eef eefVar, String str) {
        ReleaseLogUtil.d("R_HwCloudFileConfigManager", "enter downloadFile");
        String strC = mrp.c(eefVar);
        boolean zD = mrp.d(eeq.d(strC));
        LogUtil.a("HwCloudFileConfigManager", "downloadFile, isNotice: ", Boolean.valueOf(zD));
        Bundle bundleD = d(eeq.d(strC), str, eefVar.getSrcPkgName());
        if (zD) {
            mrr.c().b(bundleD);
        } else {
            c(bundleD, false);
        }
    }

    private Bundle d(String str, String str2, String str3) {
        LogUtil.a("HwCloudFileConfigManager", "getFileBundle, data: ", str, " wearName: ", str3);
        Bundle bundle = new Bundle();
        bundle.putString("hex_data", str);
        bundle.putString("device_id", str2);
        bundle.putString("wear_name", str3);
        return bundle;
    }

    public void c(final Bundle bundle, final boolean z) {
        ReleaseLogUtil.d("R_HwCloudFileConfigManager", "startDownload");
        if (bundle == null) {
            LogUtil.j("HwCloudFileConfigManager", "startDownload,bundle is null");
            return;
        }
        if (z) {
            mrr.c().b(0, false, bundle);
        }
        final String string = bundle.getString("hex_data");
        String strA = eeq.a(string);
        final String string2 = bundle.getString("device_id");
        feo.d(string2, strA, new VoiceConfigCallback() { // from class: mru.3
            @Override // com.huawei.health.healthcloudconfig.voiceconfig.VoiceConfigCallback
            public void onSuccess(String str, List<fel> list) {
                if (z) {
                    mru.this.j = 0;
                }
                FileDataContent fileDataContentC = mru.this.c(string);
                if (fileDataContentC == null) {
                    LogUtil.j("HwCloudFileConfigManager", "startDownload, fileDataContent is null");
                    return;
                }
                ReleaseLogUtil.d("R_HwCloudFileConfigManager", "startDownload success");
                fileDataContentC.setFileData(mru.this.b(list));
                bundle.putString("hex_data", HiJsonUtil.d(fileDataContentC));
                bundle.putStringArrayList("file_list_info", mru.this.d(list));
                mru.this.e(bundle, z);
            }

            @Override // com.huawei.health.healthcloudconfig.voiceconfig.VoiceConfigCallback
            public void onFailure(String str, String str2) {
                ReleaseLogUtil.e("R_HwCloudFileConfigManager", "startDownload is fail: ", CommonUtil.n(str2));
                if (z) {
                    mru.this.j = 0;
                    mrr.c().b(0, true, bundle);
                }
                mru.c(4, string, string2, bundle.getString("wear_name"));
            }

            @Override // com.huawei.health.healthcloudconfig.voiceconfig.VoiceConfigCallback
            public void onProgress(long j, long j2, boolean z2, String str) {
                mru.this.d(j, j2, z, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(long j, long j2, boolean z, Bundle bundle) {
        if (z) {
            if (j2 == 0) {
                LogUtil.j("HwCloudFileConfigManager", "showDownloadProgress, totalBytes is not correct");
                return;
            }
            int i2 = (int) ((j * 100) / j2);
            if (i2 - this.j <= 5) {
                LogUtil.d("HwCloudFileConfigManager", "startDownload, not update progress ");
                return;
            }
            this.j = i2;
            LogUtil.d("HwCloudFileConfigManager", "startDownload, progress is: ", Integer.valueOf(i2));
            mrr.c().b(i2, false, bundle);
        }
    }

    public void e(Bundle bundle, boolean z) {
        LogUtil.a("HwCloudFileConfigManager", "startTransFor");
        if (bundle == null) {
            LogUtil.a("HwCloudFileConfigManager", "startTransFor,bundle is null");
            return;
        }
        if (z) {
            mrr.c().b(0, bundle);
        }
        if (TextUtils.isEmpty(mrp.c(bundle.getString("hex_data")))) {
            LogUtil.a("HwCloudFileConfigManager", "wearName is null");
            a(bundle, z);
        } else {
            b(bundle, z);
        }
    }

    private void a(Bundle bundle, boolean z) {
        ReleaseLogUtil.d("R_HwCloudFileConfigManager", "startTransferFile");
        String string = bundle.getString("wear_name");
        String string2 = bundle.getString("device_id");
        if (z && e(string2)) {
            LogUtil.j("HwCloudFileConfigManager", "startTransferFile, device is not connected");
            mrr.c().e(true, bundle);
            return;
        }
        String string3 = bundle.getString("hex_data");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("file_list_info");
        if (coq.d(stringArrayList)) {
            LogUtil.j("HwCloudFileConfigManager", "startTransferFile is empty");
            c(4, string3, string2, string);
            if (z) {
                mrr.c().e(true, bundle);
                return;
            }
            return;
        }
        a(0, stringArrayList, bundle, z);
    }

    private void a(final int i2, final List<String> list, final Bundle bundle, final boolean z) {
        LogUtil.a("HwCloudFileConfigManager", "startTransferFileIndex: ", Integer.valueOf(i2), Integer.valueOf(list.size()), Boolean.valueOf(z));
        String str = list.get(i2);
        final int size = list.size();
        final mhp mhpVarC = c(str, bundle.getString("device_id"));
        final int i3 = i2 * 100;
        mro.e().e(mhpVarC, new IAppTransferFileResultAIDLCallback.Stub() { // from class: mru.9
            @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
            public void onFileTransferState(int i4, String str2) throws RemoteException {
                mru.this.b(i4, z, i3, size, bundle);
            }

            @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
            public void onUpgradeFailed(int i4, String str2) throws RemoteException {
                LogUtil.a("HwCloudFileConfigManager", "onUpgradeFailed:", Integer.valueOf(i4), ", fileName:", mhpVarC.f());
                mru.this.c(i4, bundle, (List<String>) list, i2);
            }

            @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
            public void onFileRespond(int i4, String str2) throws RemoteException {
                LogUtil.a("HwCloudFileConfigManager", "onFileRespond:", Integer.valueOf(i4), ",fileName:", mhpVarC.f());
                mru.this.c(i4, bundle, (List<String>) list, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i2, Bundle bundle, List<String> list, int i3) {
        String string = bundle.getString("wear_name");
        String string2 = bundle.getString("device_id");
        String string3 = bundle.getString("hex_data");
        int size = list.size();
        boolean zD = mrp.d(string3);
        if (i2 != 1) {
            ReleaseLogUtil.e("R_HwCloudFileConfigManager", "updateTransForResult failed");
            c(zD, true, bundle);
            c(4, string3, string2, string);
        } else {
            if (i3 >= size - 1) {
                ReleaseLogUtil.d("R_HwCloudFileConfigManager", "updateTransForResult success");
                c(zD, false, bundle);
                c(1, string3, string2, string);
                b(list, string3);
                return;
            }
            a(i3 + 1, list, bundle, zD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i2, boolean z, int i3, int i4, Bundle bundle) {
        LogUtil.d("HwCloudFileConfigManager", "showTransProgress", Integer.valueOf(i2));
        if (z) {
            int i5 = (i2 + i3) / i4;
            if (i5 - this.k <= 5) {
                LogUtil.d("HwCloudFileConfigManager", "showTransProgress, progress is not update");
            } else {
                this.k = i5;
                mrr.c().b(i5, bundle);
            }
        }
    }

    private void c(boolean z, boolean z2, Bundle bundle) {
        if (z) {
            this.k = 0;
            mrr.c().e(z2, bundle);
        }
    }

    private boolean e(String str) {
        LogUtil.a("HwCloudFileConfigManager", "isDisconnected: ", cpl.a(str));
        if (f42302a.get(str) == null) {
            LogUtil.j("HwCloudFileConfigManager", "isDisconnected, sDeviceInfoMap is empty");
            return true;
        }
        HwGetDevicesParameter hwGetDevicesParameter = new HwGetDevicesParameter();
        hwGetDevicesParameter.setDeviceIdentify(str);
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.IDENTIFY_DEVICES, hwGetDevicesParameter, "HwCloudFileConfigManager");
        if (coq.d(deviceList)) {
            LogUtil.j("HwCloudFileConfigManager", "isDisconnected, deviceInfoList is empty");
            return true;
        }
        DeviceInfo deviceInfo = deviceList.get(0);
        if (deviceInfo.getDeviceConnectState() == 2) {
            return false;
        }
        LogUtil.a("HwCloudFileConfigManager", "isDisconnected, device name: ", deviceInfo.getDeviceName());
        return true;
    }

    private void c(SendCallback sendCallback, File file, String str, String str2) {
        xiu.c cVar = new xiu.c();
        cVar.a(file);
        xiu xiuVarC = cVar.c();
        xgz xgzVar = new xgz();
        xgzVar.a(WearEngineModule.FEATURE_SOURCE_MODULE);
        xgzVar.i(str);
        xgzVar.h(OfflineMapWearEngineManager.WEAR_FINGERPRINT);
        xgzVar.b(xiuVarC);
        d(xit.e(f42302a.get(str2)), xgzVar, sendCallback);
    }

    private void d(UniteDevice uniteDevice, xgz xgzVar, SendCallback sendCallback) {
        xgt.b().p2pSendForWearEngine(BaseApplication.getContext(), uniteDevice, xgzVar, sendCallback);
    }

    private void b(Bundle bundle, boolean z) {
        ReleaseLogUtil.d("R_HwCloudFileConfigManager", "startTransFileP2p");
        String string = bundle.getString("wear_name");
        String string2 = bundle.getString("device_id");
        if (z && e(string2)) {
            LogUtil.j("HwCloudFileConfigManager", "startTransFileP2p, device is not connected");
            mrr.c().e(true, bundle);
            return;
        }
        String string3 = bundle.getString("hex_data");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("file_list_info");
        if (coq.d(stringArrayList)) {
            LogUtil.j("HwCloudFileConfigManager", "startTransferFile is empty");
            c(4, string3, string2, string);
            if (z) {
                mrr.c().e(true, bundle);
                return;
            }
            return;
        }
        d(0, stringArrayList, bundle, z);
    }

    private void d(final int i2, final List<String> list, final Bundle bundle, final boolean z) {
        LogUtil.a("HwCloudFileConfigManager", "startTransFileP2pIndex: ", Integer.valueOf(i2), Integer.valueOf(list.size()), Boolean.valueOf(z));
        String string = bundle.getString("hex_data");
        String string2 = bundle.getString("device_id");
        String str = list.get(i2);
        final int size = list.size();
        LogUtil.j("HwCloudFileConfigManager", "filePath, filepath: ", str);
        final int i3 = i2 * 100;
        c(new SendCallback() { // from class: mru.10
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i4) {
                LogUtil.j("HwCloudFileConfigManager", "onSendResult, errCode: ", Integer.valueOf(i4));
                mru.this.a(i4, bundle, (List<String>) list, i2);
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                mru.this.b((int) j, z, i3, size, bundle);
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str2) {
                LogUtil.d("HwCloudFileConfigManager", "onFileTransferReport, transferWay: ", str2);
            }
        }, new File(str.trim()), mrp.c(string), string2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, Bundle bundle, List<String> list, int i3) {
        String string = bundle.getString("wear_name");
        String string2 = bundle.getString("device_id");
        String string3 = bundle.getString("hex_data");
        int size = list.size();
        boolean zD = mrp.d(string3);
        if (i2 != 207) {
            ReleaseLogUtil.e("R_HwCloudFileConfigManager", "updateTransForResultP2p is error");
            c(zD, true, bundle);
            c(4, string3, string2, string);
        } else {
            if (i3 >= size - 1) {
                ReleaseLogUtil.d("R_HwCloudFileConfigManager", "updateTransForResultP2p is success");
                c(zD, false, bundle);
                c(1, string3, string2, string);
                b(list, string3);
                return;
            }
            d(i3 + 1, list, bundle, zD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FileDataContent c(String str) {
        LogUtil.a("HwCloudFileConfigManager", "getFileDataContent,hexContent: ", str);
        FileDataContent fileDataContent = null;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwCloudFileConfigManager", "getFileDataContent, hexContent is null");
            return null;
        }
        try {
            FileDataContent fileDataContent2 = (FileDataContent) HiJsonUtil.d(str, FileDataContent.class);
            if (fileDataContent2 != null) {
                return fileDataContent2;
            }
            try {
                LogUtil.j("HwCloudFileConfigManager", "getFileDataContent, fileDataContent is null");
                return fileDataContent2;
            } catch (JsonSyntaxException unused) {
                fileDataContent = fileDataContent2;
                LogUtil.j("HwCloudFileConfigManager", "getFileDataContent is JsonSyntaxException");
                return fileDataContent;
            }
        } catch (JsonSyntaxException unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<FileDataContent.FileData> b(List<fel> list) {
        ArrayList arrayList = new ArrayList(16);
        for (fel felVar : list) {
            FileDataContent.FileData fileData = new FileDataContent.FileData();
            fileData.setFileName(felVar.c());
            fileData.setVersion(felVar.e());
            fileData.setFileSize(felVar.b());
            arrayList.add(fileData);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<String> d(List<fel> list) {
        ArrayList<String> arrayList = new ArrayList<>(16);
        Iterator<fel> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().d());
        }
        return arrayList;
    }

    private void b(List<String> list, String str) {
        if (mrp.b(str)) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                mtt.c(it.next());
            }
        }
    }

    public static void c(int i2, String str, String str2, String str3) {
        LogUtil.a("HwCloudFileConfigManager", "action:", Integer.valueOf(i2), ",data:", str);
        DeviceInfo deviceInfo = f42302a.get(str2);
        eef eefVarC = c(i2, str, str3);
        boolean zSendSampleConfigCommand = edc.e().sendSampleConfigCommand(deviceInfo, eefVarC, "HwCloudFileConfigManager");
        LogUtil.a("HwCloudFileConfigManager", "constructSampleConfig: ", eefVarC);
        if (zSendSampleConfigCommand) {
            return;
        }
        LogUtil.j("HwCloudFileConfigManager", "sendSettingDeviceCommand fail");
    }

    private static eef c(int i2, String str, String str2) {
        eef eefVar = new eef();
        eefVar.setSrcPkgName("hw.unitedevice.configManager");
        if (TextUtils.isEmpty(str2)) {
            eefVar.setWearPkgName("featureManager");
        } else {
            eefVar.setWearPkgName(str2);
        }
        eefVar.setCommandId(1);
        eeg eegVar = new eeg();
        eegVar.b(900100007L);
        eegVar.b(i2);
        eegVar.d(oqn.a(oqn.c(str)));
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
        return eefVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(List<String> list, final String str, final String str2, final String str3) {
        if (list == null || list.size() == 0) {
            LogUtil.j("HwCloudFileConfigManager", "commonTransferFile configFileInfos is empty");
            c(4, str, str2, str3);
            return;
        }
        int i2 = 0;
        while (i2 < list.size()) {
            final mhp mhpVarC = c(list.get(i2), str2);
            LogUtil.a("HwCloudFileConfigManager", "onFileResponse,fileName:", mhpVarC.f(), ",filePath:", mhpVarC.i());
            final boolean z = i2 == list.size() - 1;
            mro.e().e(mhpVarC, new IAppTransferFileResultAIDLCallback.Stub() { // from class: mru.7
                @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
                public void onFileTransferState(int i3, String str4) throws RemoteException {
                }

                @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
                public void onUpgradeFailed(int i3, String str4) throws RemoteException {
                    LogUtil.a("HwCloudFileConfigManager", "onUpgradeFailed:", Integer.valueOf(i3), ", fileName:", mhpVarC.f());
                    boolean unused = mru.e = true;
                    if (z) {
                        LogUtil.a("HwCloudFileConfigManager", "commonTransferFile last one");
                        if (mru.e) {
                            boolean unused2 = mru.e = false;
                            mru.c(4, str, str2, str3);
                        } else {
                            mru.c(1, str, str2, str3);
                        }
                    }
                }

                @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
                public void onFileRespond(int i3, String str4) throws RemoteException {
                    LogUtil.a("HwCloudFileConfigManager", "onFileRespond:", Integer.valueOf(i3), ",fileName:", mhpVarC.f());
                    if (i3 != 1) {
                        boolean unused = mru.e = true;
                    }
                    if (z) {
                        LogUtil.a("HwCloudFileConfigManager", "commonTransferFile last one");
                        if (mru.e) {
                            boolean unused2 = mru.e = false;
                            mru.c(4, str, str2, str3);
                        } else {
                            ReleaseLogUtil.d("R_HwCloudFileConfigManager", "send feature file success");
                            mru.c(1, str, str2, str3);
                        }
                    }
                }
            });
            i2++;
        }
    }

    private static mhp c(String str, String str2) {
        String name = new File(str.trim()).getName();
        LogUtil.a("HwCloudFileConfigManager", "ConstructTransFileInfo,filePath:", str, ",fileName:", name);
        mhp mhpVar = new mhp();
        mhpVar.a(name);
        mhpVar.h(str);
        mhpVar.c(15);
        mhpVar.e(TransferFileReqType.APP_DELIVERY);
        mhpVar.d(str2);
        return mhpVar;
    }

    public void c() {
        LogUtil.a("HwCloudFileConfigManager", "checkTaskStatus");
        synchronized (f42304c) {
            if (coq.d(i)) {
                LogUtil.j("HwCloudFileConfigManager", "checkTaskStatus, all task is run");
            } else {
                i.remove(0);
                d();
            }
        }
    }

    private boolean a(String str) {
        if (!e(str)) {
            return false;
        }
        Iterator<mrw> it = i.iterator();
        while (it.hasNext()) {
            if (it.next().c().equals(str)) {
                it.remove();
            }
        }
        return true;
    }

    public void a(Bundle bundle) {
        this.h = bundle;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    public void d(String str) {
        byte b2;
        LogUtil.a("HwCloudFileConfigManager", "startRunTaskFromUI, message: ", str);
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -986909602) {
            if (iHashCode != -839973947) {
                if (iHashCode == -590900557 && str.equals("task_complete")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("start_download")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("start_transfor")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            mrr.c().b();
            e(this.h, true);
        } else if (b2 == 1) {
            mrr.c().b();
            c(this.h, true);
        } else if (b2 == 2) {
            mrr.c().b();
            c();
        } else {
            LogUtil.j("HwCloudFileConfigManager", "startRunTaskFromUI, other message: ", str);
        }
    }
}
