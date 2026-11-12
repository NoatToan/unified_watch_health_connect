package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.TransferFileInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback;
import com.huawei.hwdevice.mainprocess.receiver.hwdfx.DeviceTriggerDfxReceiver;
import com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class mni extends HwBaseManager {
    private static final Object d = new Object();
    private static mni e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ITransferSleepAndDFXFileCallback.Stub f41989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f41990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41991c;
    private ITransferSleepAndDFXFileCallback.Stub f;
    private DeviceDfxBaseResponseCallback g;
    private MaintenaceInterface i;

    private mni(Context context) {
        super(context);
        this.f41991c = -1;
        this.i = null;
        this.f41989a = new ITransferSleepAndDFXFileCallback.Stub() { // from class: mni.1
            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onSuccess(int i, String str, String str2) throws RemoteException {
                LogUtil.a("HwFileDeviceDfxManager", "mDfxTransferSleepAndDfxFileCallback, onSuccess.");
                String strF = mjh.f(str);
                LogUtil.a("HwFileDeviceDfxManager", "mDfxTransferSleepAndDfxFileCallback identify size:", BTDeviceMgrUtil.c().e(strF));
                mfz.d(7, false);
                mni mniVar = mni.this;
                if (!mniVar.d(mniVar.f41990b)) {
                    if (mni.j(strF)) {
                        mni.this.g(strF);
                    }
                } else {
                    LogUtil.a("HwFileDeviceDfxManager", "isMainProcess is true");
                    mni.this.g(strF);
                }
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onFailure(int i, String str) throws RemoteException {
                ReleaseLogUtil.a("Dfx_HwFileDeviceDfxManager", "mDfxTransferSleepAndDfxFileCallback, onFailure errCode: ", Integer.valueOf(i), ", errMsg = ", str);
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onProgress(int i, String str) throws RemoteException {
                LogUtil.a("HwFileDeviceDfxManager", "mDfxTransferSleepAndDfxFileCallback, onProgress");
            }
        };
        this.f = new ITransferSleepAndDFXFileCallback.Stub() { // from class: mni.2
            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onProgress(int i, String str) throws RemoteException {
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onSuccess(int i, String str, String str2) throws RemoteException {
                ReleaseLogUtil.d("Dfx_HwFileDeviceDfxManager", "mDfxTransferSleepAndDfxFileCallback, onSuccess.");
                String strF = mjh.f(str);
                LogUtil.a("HwFileDeviceDfxManager", "mDfxTransferSleepAndDfxFileCallback identify size:", BTDeviceMgrUtil.c().e(strF));
                mni.this.a(nio.e(strF), true);
                if (mni.this.g != null) {
                    mni.this.g.onSuccess(i, strF);
                } else {
                    ReleaseLogUtil.d("Dfx_HwFileDeviceDfxManager", "mDfxTransferSleepAndDfxFileCallback, onSuccess mMaintenanceCallback is null.");
                }
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onFailure(int i, String str) throws RemoteException {
                ReleaseLogUtil.a("Dfx_HwFileDeviceDfxManager", "mDfxTransferSleepAndDfxFileCallback, onFailure errCode = ", Integer.valueOf(i), ", errMsg = ", str);
                if (mni.this.g != null) {
                    mni.this.g.onFailure(i, str);
                } else {
                    ReleaseLogUtil.a("Dfx_HwFileDeviceDfxManager", "mDfxTransferSleepAndDfxFileCallback, onFailure mMaintenanceCallback is null.");
                }
            }
        };
        this.f41990b = context;
        LogUtil.d("HwFileDeviceDfxManager", "HwFileDeviceDfxManager new object!");
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(Context context) {
        return BaseApplication.isRunningForeground() || CommonUtil.x(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(String str) {
        Intent intent = new Intent("com.huawei.bone.dfx.device_trigger_upload_log");
        intent.setPackage(BaseApplication.getAppPackage());
        intent.putExtra("pre_log_export_mac", str);
        intent.putExtra("isAuto", true);
        intent.setClass(BaseApplication.getContext(), DeviceTriggerDfxReceiver.class);
        BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    public static mni e(Context context) {
        mni mniVar;
        synchronized (d) {
            if (e == null && context != null) {
                LogUtil.d("HwFileDeviceDfxManager", "getInstance(), context: ", context);
                e = new mni(context);
            }
            mniVar = e;
        }
        return mniVar;
    }

    public void c() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "HwFileDeviceDfxManager");
        if (deviceList == null || deviceList.isEmpty()) {
            LogUtil.j("HwFileDeviceDfxManager", "connectedDeviceList is empty");
            return;
        }
        if (!CompileParameterUtil.d("SUPPORT_LOG_FEEDBACK")) {
            LogUtil.j("HwFileDeviceDfxManager", "getLogFileReportedByDevice(), the version do not support.");
            return;
        }
        LogUtil.a("HwFileDeviceDfxManager", "enter getLogFileReportedByDevice()");
        for (int i = 0; i < deviceList.size(); i++) {
            DeviceInfo deviceInfo = deviceList.get(i);
            if (!b(deviceInfo)) {
                LogUtil.e("HwFileDeviceDfxManager", "getLogFileReportedByDevice(), not support!");
            } else if (!c(deviceInfo)) {
                LogUtil.a("HwFileDeviceDfxManager", "getLogFileReportedByDevice(), time is not ok.");
            } else {
                c(deviceInfo, this.f41989a);
            }
        }
    }

    private TransferFileInfo e(DeviceInfo deviceInfo) {
        TransferFileInfo transferFileInfo = new TransferFileInfo();
        transferFileInfo.setIsFromAbout(0);
        transferFileInfo.setIsUploadAppLog(1);
        transferFileInfo.setType(0);
        transferFileInfo.setRecordId(new ArrayList(16));
        transferFileInfo.setLevel(0);
        transferFileInfo.setPriority(1);
        transferFileInfo.setSuspend(0);
        transferFileInfo.setTaskType(2);
        int productType = deviceInfo.getProductType();
        transferFileInfo.setDeviceMac(deviceInfo.getSecurityDeviceId());
        transferFileInfo.setDeviceSn(deviceInfo.getDeviceIdentify());
        transferFileInfo.setDeviceModel(deviceInfo.getDeviceModel());
        transferFileInfo.setDeviceType(productType);
        transferFileInfo.setDeviceVersion(deviceInfo.getSoftVersion());
        transferFileInfo.setUdidFromDevice(deviceInfo.getUdidFromDevice());
        transferFileInfo.setSelectedFlag(0);
        return transferFileInfo;
    }

    private boolean b(DeviceInfo deviceInfo) {
        if (deviceInfo != null) {
            boolean zO = Utils.o();
            boolean zC = niz.c();
            this.f41991c = deviceInfo.getProductType();
            LogUtil.a("HwFileDeviceDfxManager", "isDeviceSupport(), BuildConfig.SUPPORT_LOG_FEEDBACK: ", Boolean.valueOf(CompileParameterUtil.d("SUPPORT_LOG_FEEDBACK")), ", isExperience: ", Boolean.valueOf(zC), ",isOversea: ", Boolean.valueOf(zO));
            LogUtil.d("HwFileDeviceDfxManager", "isDeviceSupport(), mDeviceType: ", Integer.valueOf(this.f41991c));
            if (mmx.i(this.f41991c)) {
                boolean z = CompileParameterUtil.d("SUPPORT_LOG_FEEDBACK") || CompileParameterUtil.d("RELEASE_EVENT_LOG_UPLOAD");
                boolean z2 = loj.c(48) && zC;
                if (z && z2 && !zO) {
                    return true;
                }
            }
        }
        return false;
    }

    private void c(DeviceInfo deviceInfo, ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback) {
        if (deviceInfo != null) {
            LogUtil.a("HwFileDeviceDfxManager", "handlerFirmwareVersion(), mDeviceVersion: ", deviceInfo.getSoftVersion());
            LogUtil.a("HwFileDeviceDfxManager", "startDfxFileTransferTask identify size: ", BTDeviceMgrUtil.c().e(deviceInfo.getDeviceIdentify()));
            a(nio.e(deviceInfo.getDeviceIdentify()), false);
            TransferFileInfo transferFileInfoE = e(deviceInfo);
            if (mjh.b(deviceInfo)) {
                ReleaseLogUtil.d("Dfx_HwFileDeviceDfxManager", "isSupportSmartMcuDeviceLog is true");
                mnn.a().e(transferFileInfoE, iTransferSleepAndDFXFileCallback);
            } else if (!h(deviceInfo.getDeviceIdentify())) {
                ReleaseLogUtil.d("Dfx_HwFileDeviceDfxManager", "not isSelfUploadDeviceLog");
                mnn.a().e(transferFileInfoE, iTransferSleepAndDFXFileCallback);
            } else {
                ReleaseLogUtil.d("Dfx_HwFileDeviceDfxManager", "isSelfUploadDeviceLog");
            }
        }
    }

    private boolean h(String str) {
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(this.f41990b).queryDeviceCapability(1, str, "HwFileDeviceDfxManager");
        boolean z = false;
        if (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) {
            LogUtil.j("HwFileDeviceDfxManager", "isSelfUploadDeviceLog queryDeviceCapability is null");
        } else {
            DeviceCapability deviceCapability = mapQueryDeviceCapability.get(str);
            z = deviceCapability != null && deviceCapability.isSupportSelfUploadDeviceLog();
        }
        ReleaseLogUtil.d("Dfx_HwFileDeviceDfxManager", "isSelfUploadDeviceLog: ", Boolean.valueOf(z));
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String dayDateTime = new mjj().getDayDateTime();
        LogUtil.a("HwFileDeviceDfxManager", "strCurrentTime: ", dayDateTime);
        if (b(str, dayDateTime)) {
            d(str, dayDateTime, "1");
            LogUtil.a("HwFileDeviceDfxManager", "isCanUploadLog isMoreThanOneDay");
            return true;
        }
        int iB = b(str);
        LogUtil.a("HwFileDeviceDfxManager", "needUpload(), retryNumber: ", Integer.valueOf(iB));
        if (iB < 2) {
            d(str, dayDateTime, String.valueOf(iB + 1));
            return true;
        }
        LogUtil.a("HwFileDeviceDfxManager", "needUpload(), but Uploaded 2 times today");
        return false;
    }

    private static boolean b(String str, String str2) {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), str + "_maintenance_start_time");
        LogUtil.a("HwFileDeviceDfxManager", "isMoreThanOneDay, strLastTime: ", strE);
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("HwFileDeviceDfxManager", "strLastTime is isEmpty");
            return true;
        }
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("HwFileDeviceDfxManager", "strCurrentTime is isEmpty");
            return false;
        }
        LogUtil.a("HwFileDeviceDfxManager", "delayedOneDay(), strLastTime: ", strE, ", strCurTime: ", str2);
        return CommonUtil.m(BaseApplication.getContext(), str2) - CommonUtil.m(BaseApplication.getContext(), strE) >= 86400000;
    }

    private static int b(String str) {
        LogUtil.a("HwFileDeviceDfxManager", "enter getRetryNumber");
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), str + "_maintenance_start_retry_number");
        if (!qrs.b(strE)) {
            return 0;
        }
        int iN = CommonUtil.n(BaseApplication.getContext(), strE);
        LogUtil.a("HwFileDeviceDfxManager", "getRetryNumber, retryNumber: ", Integer.valueOf(iN));
        return iN;
    }

    private static void d(String str, String str2, String str3) {
        LogUtil.a("HwFileDeviceDfxManager", "enter setMaintenanceData strCurrentTime:", str2, ",retryNum: ", str3);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), str + "_maintenance_start_time", str2, null);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), str + "_maintenance_start_retry_number", str3, null);
    }

    public void e(int i, DeviceDfxBaseResponseCallback deviceDfxBaseResponseCallback) {
        List<DeviceInfo> listD = d();
        if (listD.isEmpty()) {
            LogUtil.j("HwFileDeviceDfxManager", "connectedDeviceList is empty");
            return;
        }
        for (int i2 = 0; i2 < listD.size(); i2++) {
            DeviceInfo deviceInfo = listD.get(i2);
            if (deviceInfo != null) {
                if (eei.d(deviceInfo) && Utils.o()) {
                    ReleaseLogUtil.d("Dfx_HwFileDeviceDfxManager", "honor device is not support oversea");
                } else if (!mjh.b(deviceInfo) && h(deviceInfo.getDeviceIdentify())) {
                    ReleaseLogUtil.d("Dfx_HwFileDeviceDfxManager", "dfx doing nothing.");
                } else if (c(deviceInfo)) {
                    if (mjh.e()) {
                        ReleaseLogUtil.d("Dfx_HwFileDeviceDfxManager", "getMaintenanceFile(), collecting device log manually.");
                    } else {
                        ReleaseLogUtil.d("HwFileDeviceDfxManager", "getMaintenanceFile(), level = ", Integer.valueOf(i), ", callback = ", deviceDfxBaseResponseCallback);
                        if (!a(deviceInfo)) {
                            ReleaseLogUtil.d("Dfx_HwFileDeviceDfxManager", "getMaintenanceFile(), check device not support!");
                        } else {
                            this.i = mjj.c();
                            boolean zF = f(nio.e(deviceInfo.getDeviceIdentify()));
                            ReleaseLogUtil.d("Dfx_HwFileDeviceDfxManager", "getMaintenanceFile(), isCanMaintenance = ", Boolean.valueOf(zF));
                            if (!zF) {
                                ReleaseLogUtil.d("Dfx_HwFileDeviceDfxManager", "getMaintenanceFile(), today has maintenance or retry > 3.");
                            } else {
                                this.g = deviceDfxBaseResponseCallback;
                                c(deviceInfo, this.f);
                            }
                        }
                    }
                }
            }
        }
    }

    public void c(final String str) {
        LogUtil.d("HwFileDeviceDfxManager", "startUploadLogFile().");
        ThreadPoolManager.c().b("HwFileDeviceDfxManager", new Runnable() { // from class: mni.5
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                LogUtil.d("HwFileDeviceDfxManager", "BuildConfig.RELEASE_EVENT_LOG_UPLOAD: " + CompileParameterUtil.d("RELEASE_EVENT_LOG_UPLOAD"));
                if (CompileParameterUtil.d("RELEASE_EVENT_LOG_UPLOAD")) {
                    ReleaseLogUtil.d("Dfx_HwFileDeviceDfxManager", "startUploadLogFile(), use release version upload method!");
                    mjh.e(mni.this.f41990b, str);
                    return;
                }
                ReleaseLogUtil.d("Dfx_HwFileDeviceDfxManager", "startUploadLogFile(), use beta version upload method!");
                if (Utils.o()) {
                    ltr.b().setProductType(20);
                } else {
                    ltr.b().setProductType(1);
                }
                mni.this.g(str);
            }
        });
    }

    private boolean a(DeviceInfo deviceInfo) {
        boolean zC = niz.c();
        ReleaseLogUtil.d("Dfx_HwFileDeviceDfxManager", "isDeviceSupport(), BuildConfig.SUPPORT_LOG_FEEDBACK = " + CompileParameterUtil.d("SUPPORT_LOG_FEEDBACK") + ", isExperience = " + zC);
        if (deviceInfo != null) {
            this.f41991c = deviceInfo.getProductType();
            ReleaseLogUtil.d("Dfx_HwFileDeviceDfxManager", "isDeviceSupport(), mDeviceType = " + this.f41991c);
            if (neu.b(this.f41991c)) {
                boolean z = CompileParameterUtil.d("SUPPORT_LOG_FEEDBACK") || CompileParameterUtil.d("RELEASE_EVENT_LOG_UPLOAD");
                boolean z2 = loj.c(48) && zC;
                if (z && (z2 || Utils.o())) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean f(String str) {
        String dayDateTime = this.i.getDayDateTime();
        LogUtil.a("HwFileDeviceDfxManager", "strCurrentTime:", dayDateTime);
        if (a(str, dayDateTime)) {
            a(str, dayDateTime, "1");
            return true;
        }
        int iE = e(str);
        boolean zD = d(str);
        ReleaseLogUtil.d("Dfx_HwFileDeviceDfxManager", "needMaintenance(), retryNumber = ", Integer.valueOf(iE), ", isSuccess = ", Boolean.valueOf(zD));
        if (iE >= 3 || zD) {
            ReleaseLogUtil.d("Dfx_HwFileDeviceDfxManager", "needMaintenance(), today has no success maintenance, but retry > 3.");
            return false;
        }
        a(str, dayDateTime, String.valueOf(iE + 1));
        return true;
    }

    private boolean d(String str) {
        LogUtil.a("HwFileDeviceDfxManager", "enter getMaintenanceResult");
        Context context = BaseApplication.getContext();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_result");
        return "true".equals(SharedPreferenceManager.e(context, String.valueOf(10), sb.toString()));
    }

    private List<DeviceInfo> d() {
        LogUtil.a("HwFileDeviceDfxManager", "enter getConnectedDeviceList");
        ArrayList arrayList = new ArrayList(16);
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_MAIN_DEVICES, null, "HwFileDeviceDfxManager");
        List<DeviceInfo> deviceList2 = ecu.d().getDeviceList(HwGetDevicesMode.FOLLOWED_DEVICES, null, "HwFileDeviceDfxManager");
        if (deviceList != null && !deviceList.isEmpty()) {
            arrayList.addAll(deviceList);
        }
        if (deviceList2 != null && !deviceList2.isEmpty()) {
            arrayList.addAll(deviceList2);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z) {
        LogUtil.a("HwFileDeviceDfxManager", "enter setMaintenanceResult");
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), str + "_result", String.valueOf(z), null);
    }

    private int e(String str) {
        LogUtil.a("HwFileDeviceDfxManager", "enter getRetryNumber");
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), str + "_RETRY_NUMBER");
        if (qrs.b(strE)) {
            try {
                int i = Integer.parseInt(strE);
                LogUtil.a("HwFileDeviceDfxManager", "getRetryNumber, retryNumber: ", Integer.valueOf(i));
                return i;
            } catch (NumberFormatException unused) {
                LogUtil.e("HwFileDeviceDfxManager", "getRetryNumber has exception ");
            }
        }
        return 0;
    }

    private void a(String str, String str2, String str3) {
        LogUtil.a("HwFileDeviceDfxManager", "enter setMaintenanceData strCurrentTime:", str2, ",retryNum:", str3);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), str + "_time", str2, null);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), str + "_RETRY_NUMBER", str3, null);
    }

    private boolean a(String str, String str2) {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), str + "_time");
        LogUtil.a("HwFileDeviceDfxManager", "isMoreThanOneDay, strLastTime:", strE);
        if (TextUtils.isEmpty(strE)) {
            LogUtil.a("HwFileDeviceDfxManager", "strLastTime is isEmpty");
            return true;
        }
        if (TextUtils.isEmpty(str2)) {
            LogUtil.a("HwFileDeviceDfxManager", "strCurrentTime is isEmpty");
            return false;
        }
        ReleaseLogUtil.d("Dfx_HwFileDeviceDfxManager", "delayedOneDay(), strLastTime = ", strE, ", strCurTime = ", str2);
        try {
            return Long.parseLong(str2) - Long.parseLong(strE) >= 86400000;
        } catch (NumberFormatException unused) {
            ReleaseLogUtil.a("Dfx_HwFileDeviceDfxManager", "delayedOneDay(), delayedEightHour exception.");
        }
    }

    private boolean c(DeviceInfo deviceInfo) {
        if (deviceInfo != null && deviceInfo.getProductType() == 34) {
            ReleaseLogUtil.d("Dfx_HwFileDeviceDfxManager", "current device is Latona");
            return true;
        }
        int i = Calendar.getInstance().get(11);
        LogUtil.a("HwFileDeviceDfxManager", "isLimitCollectLog(), localHour = " + i);
        if (i >= 6 && i < 10) {
            ReleaseLogUtil.d("Dfx_HwFileDeviceDfxManager", "isLimitCollectLog(), ", 6, " < localHour < ", 10, " return !!!");
            return false;
        }
        if (i < 17 || i >= 22) {
            return true;
        }
        ReleaseLogUtil.d("Dfx_HwFileDeviceDfxManager", "isLimitCollectLog(), ", 17, " < localHour < ", 22, " return !!!");
        return false;
    }
}
