package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.callback.BluetoothDataReceiveCallback;
import com.huawei.datatype.DataDeviceInfo;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.TransferFileInfo;
import com.huawei.hwdevice.mainprocess.callback.NotifyPhoneServiceCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback;
import com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class lws extends HwBaseManager implements BluetoothDataReceiveCallback, NotifyPhoneServiceCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static lws f40981b;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBaseResponseCallback f40982a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40983c;
    private Context d;
    private String f;
    private WeakReference<DeviceDfxBaseResponseCallback> g;
    private ITransferSleepAndDFXFileCallback.Stub h;
    private int i;
    private String j;
    private String k;
    private String l;
    private ITransferSleepAndDFXFileCallback.Stub m;
    private int n;
    private IBaseResponseCallback o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean s;
    private lvb t;
    private int u;
    private DeviceDfxBaseResponseCallback v;
    private int w;
    private MaintenaceInterface x;
    private int y;

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, String str) {
        LogUtil.a("HwDeviceDfxManager", "uiCallbackOnSuccess, onSuccess. successMsg = ", str);
        WeakReference<DeviceDfxBaseResponseCallback> weakReference = this.g;
        if (weakReference != null) {
            DeviceDfxBaseResponseCallback deviceDfxBaseResponseCallback = weakReference.get();
            if (deviceDfxBaseResponseCallback != null) {
                deviceDfxBaseResponseCallback.onSuccess(i, str);
                return;
            } else {
                LogUtil.a("HwDeviceDfxManager", "uiCallbackOnSuccess, onSuccess mMaintenanceCallback is null.");
                return;
            }
        }
        LogUtil.a("HwDeviceDfxManager", "uiCallbackOnSuccess, onSuccess mDfxResponseCallBack is null.");
    }

    private lws(Context context) {
        super(context);
        this.x = null;
        this.y = 1;
        this.j = "";
        this.f = "";
        this.i = -1;
        this.q = false;
        this.r = 0;
        this.n = 2;
        this.u = 0;
        this.o = new IBaseResponseCallback() { // from class: lws.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.d("HwDeviceDfxManager", "mFirmwareVersionCallback, err_code = " + i + ", objData = " + obj);
                if (i == 0 && (obj instanceof DataDeviceInfo)) {
                    lws lwsVar = lws.this;
                    lwsVar.a((DataDeviceInfo) obj, lwsVar.m);
                }
            }
        };
        this.m = new ITransferSleepAndDFXFileCallback.Stub() { // from class: lws.5
            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onProgress(int i, String str) throws RemoteException {
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onSuccess(int i, String str, String str2) throws RemoteException {
                ReleaseLogUtil.d("Dfx_HwDeviceDfxManager", "mDfxTransferSleepAndDfxFileCallback, onSuccess.");
                String strF = mjh.f(str);
                LogUtil.a("HwDeviceDfxManager", "mDfxTransferSleepAndDfxFileCallback identify size:", BTDeviceMgrUtil.c().e(strF));
                if (lws.this.v != null) {
                    lws.this.v.onSuccess(i, strF);
                    return;
                }
                ReleaseLogUtil.d("Dfx_HwDeviceDfxManager", "mDfxTransferSleepAndDfxFileCallback, onSuccess mMaintenanceCallback is null.");
                if (lws.this.g != null) {
                    DeviceDfxBaseResponseCallback deviceDfxBaseResponseCallback = (DeviceDfxBaseResponseCallback) lws.this.g.get();
                    if (deviceDfxBaseResponseCallback == null) {
                        LogUtil.e("HwDeviceDfxManager", "mDfxTransferSleepAndDfxFileCallback, onSuccess mDfxTransferSleepAndDfxFileCallback DeviceDfxBaseResponseCallback is null.");
                        return;
                    } else {
                        deviceDfxBaseResponseCallback.onSuccess(i, "");
                        return;
                    }
                }
                LogUtil.e("HwDeviceDfxManager", "mDfxTransferSleepAndDfxFileCallback, onFailure mMaintenanceCallback is null.");
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onFailure(int i, String str) throws RemoteException {
                ReleaseLogUtil.a("Dfx_HwDeviceDfxManager", "mDfxTransferSleepAndDfxFileCallback, onFailure errCode = ", Integer.valueOf(i), ", errMsg = ", str);
                if (lws.this.v != null) {
                    lws.this.v.onFailure(i, str);
                    return;
                }
                ReleaseLogUtil.a("Dfx_HwDeviceDfxManager", "mDfxTransferSleepAndDfxFileCallback, onFailure mDfxTransferSleepAndDfxFileCallback is null.");
                if (lws.this.g != null) {
                    DeviceDfxBaseResponseCallback deviceDfxBaseResponseCallback = (DeviceDfxBaseResponseCallback) lws.this.g.get();
                    if (deviceDfxBaseResponseCallback != null) {
                        deviceDfxBaseResponseCallback.onFailure(i, str);
                        return;
                    } else {
                        LogUtil.e("HwDeviceDfxManager", "mDfxTransferSleepAndDfxFileCallback, onFailure mDfxTransferSleepAndDfxFileCallback DeviceDfxBaseResponseCallback is null.");
                        return;
                    }
                }
                LogUtil.e("HwDeviceDfxManager", "mDfxTransferSleepAndDfxFileCallback, onFailure mMaintenanceCallback is null.");
            }
        };
        this.h = new ITransferSleepAndDFXFileCallback.Stub() { // from class: lws.3
            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onSuccess(int i, String str, String str2) throws RemoteException {
                LogUtil.a("HwDeviceDfxManager", "mDfxTransferDfxFileUiCallback, onSuccess.");
                if (TextUtils.equals(str2, "5.10.12 cancel timeout 7 minutes")) {
                    lws.this.c(i, str2);
                    return;
                }
                mjh.e(false);
                LogUtil.a("HwDeviceDfxManager", "mDfxTransferDfxFileUiCallback identify size:", BTDeviceMgrUtil.c().e(mjh.f(str)));
                lws.this.c(i, "");
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onFailure(int i, String str) throws RemoteException {
                LogUtil.a("HwDeviceDfxManager", "mDfxTransferDfxFileUiCallback, onFailure errCode = ", Integer.valueOf(i), ", errMsg = ", str);
                mjh.e(false);
                if (lws.this.g != null) {
                    DeviceDfxBaseResponseCallback deviceDfxBaseResponseCallback = (DeviceDfxBaseResponseCallback) lws.this.g.get();
                    if (deviceDfxBaseResponseCallback != null) {
                        deviceDfxBaseResponseCallback.onFailure(i, str);
                        return;
                    } else {
                        LogUtil.a("HwDeviceDfxManager", "mDfxTransferDfxFileUiCallback, onFailure mMaintenanceCallback is null.");
                        return;
                    }
                }
                LogUtil.e("HwDeviceDfxManager", "mDfxTransferDfxFileUiCallback, onFailure mDfxResponseCallBack is null.");
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onProgress(int i, String str) throws RemoteException {
                DeviceDfxBaseResponseCallback deviceDfxBaseResponseCallback;
                if (lws.this.g == null || (deviceDfxBaseResponseCallback = (DeviceDfxBaseResponseCallback) lws.this.g.get()) == null) {
                    return;
                }
                deviceDfxBaseResponseCallback.onProgress(i, str);
            }
        };
        this.d = context;
        lvb lvbVarE = lvb.e();
        this.t = lvbVarE;
        if (lvbVarE == null) {
            LogUtil.e("HwDeviceDfxManager", "mHwDeviceConfigManager is null.");
            return;
        }
        mjh.e(false);
        this.t.d(10, this);
        LogUtil.d("HwDeviceDfxManager", "HwDeviceDfxManager new object!");
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 10;
    }

    public static lws c(Context context) {
        lws lwsVar;
        synchronized (e) {
            if (f40981b == null && context != null) {
                LogUtil.d("HwDeviceDfxManager", "getInstance(), context = " + context);
                f40981b = new lws(BaseApplication.getContext());
            }
            lwsVar = f40981b;
        }
        return lwsVar;
    }

    private void c(DeviceInfo deviceInfo, ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback, boolean z, String str) {
        if (deviceInfo != null) {
            String softVersion = deviceInfo.getSoftVersion();
            this.f = softVersion;
            ReleaseLogUtil.d("Dfx_HwDeviceDfxManager", "startDfxFileTransferTask() handlerFirmwareVersion(), mDeviceVersion = ", softVersion);
            LogUtil.a("HwDeviceDfxManager", "startDfxFileTransferTask identify size:", BTDeviceMgrUtil.c().e(deviceInfo.getDeviceIdentify()));
            TransferFileInfo transferFileInfoB = b(deviceInfo);
            transferFileInfoB.setFileLogId(this.l);
            transferFileInfoB.setBugTypeId(this.f40983c);
            LogUtil.a("HwDeviceDfxManager", "startDfxFileTransferTask, CommonUtil.isReleaseVersion() = " + CommonUtil.bu());
            if (CommonUtil.bu()) {
                i();
            }
            if (z) {
                transferFileInfoB.setLogPreExport(1);
                if ("2".equals(str)) {
                    transferFileInfoB.setLogPreExportKind("2");
                } else if (!"3".equals(str)) {
                    LogUtil.a("HwDeviceDfxManager", "startDfxFileTransferTask others");
                } else {
                    transferFileInfoB.setLogPreExportKind("3");
                }
            }
            this.w = 0;
            a(transferFileInfoB);
            if (mjh.k(deviceInfo.getDeviceIdentify())) {
                a(deviceInfo, eey.d(deviceInfo, 217));
                return;
            }
            if (!CommonUtil.bu()) {
                i();
            }
            lvb.e().a(transferFileInfoB, iTransferSleepAndDFXFileCallback);
        }
    }

    private void e(int i, DeviceInfo deviceInfo) {
        try {
            if (b(deviceInfo).getIsFromAbout() == 1) {
                this.h.onSuccess(10000, null, "5.10.12 cancel timeout 7 minutes");
            } else {
                LogUtil.a("HwDeviceDfxManager", "5.10.12 timeout, callback cancel errorCode = ", Integer.valueOf(i));
            }
        } catch (RemoteException e2) {
            ExceptionUtils.c(e2);
        }
    }

    private void c(int i, DeviceInfo deviceInfo) {
        try {
            if (b(deviceInfo).getIsFromAbout() == 1) {
                this.h.onFailure(i, "5.10.12 default failure");
            } else {
                this.m.onFailure(i, "5.10.12 default failure");
            }
        } catch (RemoteException e2) {
            ExceptionUtils.c(e2);
        }
    }

    private void i() {
        ReleaseLogUtil.a("Dfx_HwDeviceDfxManager", "resetBugTypeIdFileLogId mFileLogId = " + this.l + ", mBugTypeId = " + this.f40983c);
        this.f40983c = 0;
        this.l = "";
        ReleaseLogUtil.a("Dfx_HwDeviceDfxManager", "resetBugTypeIdFileLogId after mFileLogId = " + this.l + ", mBugTypeId = " + this.f40983c);
    }

    private TransferFileInfo b(DeviceInfo deviceInfo) {
        TransferFileInfo transferFileInfo = new TransferFileInfo();
        if (this.q) {
            transferFileInfo.setIsFromAbout(1);
        } else {
            transferFileInfo.setIsFromAbout(0);
        }
        transferFileInfo.setIsUploadAppLog(this.r);
        transferFileInfo.setType(0);
        transferFileInfo.setRecordId(new ArrayList(16));
        transferFileInfo.setLevel(this.y);
        transferFileInfo.setPriority(this.n);
        transferFileInfo.setSuspend(0);
        transferFileInfo.setTaskType(this.u);
        int productType = deviceInfo.getProductType();
        transferFileInfo.setDeviceMac(deviceInfo.getSecurityDeviceId());
        transferFileInfo.setDeviceSn(deviceInfo.getDeviceIdentify());
        transferFileInfo.setDeviceModel(deviceInfo.getDeviceModel());
        transferFileInfo.setDeviceType(productType);
        transferFileInfo.setDeviceVersion(this.f);
        transferFileInfo.setUdidFromDevice(deviceInfo.getUdidFromDevice());
        transferFileInfo.setSelectedFlag(this.w);
        boolean zIsEmpty = TextUtils.isEmpty(this.j);
        LogUtil.a("HwDeviceDfxManager", "getTransferFileInfo, isMacEmpty = ", Boolean.valueOf(zIsEmpty), ", transferFileInfo.getDeviceVersion = ", transferFileInfo.getDeviceVersion(), ", deviceInfo.getSoftVersion = ", deviceInfo.getSoftVersion());
        return transferFileInfo;
    }

    private List<DeviceInfo> c() {
        LogUtil.a("HwDeviceDfxManager", "enter getConnectedDeviceList");
        ArrayList arrayList = new ArrayList(16);
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_MAIN_DEVICES, null, "HwDeviceDfxManager");
        List<DeviceInfo> deviceList2 = ecu.d().getDeviceList(HwGetDevicesMode.FOLLOWED_DEVICES, null, "HwDeviceDfxManager");
        if (deviceList != null && !deviceList.isEmpty()) {
            arrayList.addAll(deviceList);
        }
        if (deviceList2 != null && !deviceList2.isEmpty()) {
            arrayList.addAll(deviceList2);
        }
        return arrayList;
    }

    public void a(int i, DeviceDfxBaseResponseCallback deviceDfxBaseResponseCallback, boolean z) {
        a();
        List<DeviceInfo> listC = c();
        if (b(listC)) {
            LogUtil.a("HwDeviceDfxManager", "getMaintenanceFileNoRestrict(), level = " + i);
            this.x = mjj.c();
            this.y = 0;
            this.v = deviceDfxBaseResponseCallback;
            this.p = z;
            if (z) {
                String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "beta_club_fault_code");
                this.f40983c = CommonUtil.n(BaseApplication.getContext(), strE);
                String strE2 = SharedPreferenceManager.e(BaseApplication.getContext());
                this.k = strE2;
                LogUtil.a("HwDeviceDfxManager", "faultCode: ", strE, ", mBugTypeId: ", Integer.valueOf(this.f40983c), ", mDtsNumber: ", strE2);
                this.s = false;
                this.u = 1;
            } else {
                j();
                this.s = true;
                this.u = 2;
            }
            e(false);
            this.r = 1;
            this.n = 1;
            for (int i2 = 0; i2 < listC.size(); i2++) {
                DeviceInfo deviceInfo = listC.get(i2);
                if (!c(deviceInfo)) {
                    ReleaseLogUtil.a("Dfx_HwDeviceDfxManager", "getMaintenanceFileNoRestrict(), not support!");
                } else if (!a(deviceInfo) && !z) {
                    if (deviceDfxBaseResponseCallback != null) {
                        deviceDfxBaseResponseCallback.onFailure(2, "time is not ok!!!");
                    }
                    ReleaseLogUtil.d("Dfx_HwDeviceDfxManager", "getMaintenanceFileNoRestrict(), time is not ok.");
                } else {
                    d(z, deviceInfo);
                }
            }
        }
    }

    private void d(boolean z, DeviceInfo deviceInfo) {
        boolean zD = eey.d(deviceInfo, 134);
        LogUtil.a("HwDeviceDfxManager", "handlerGetDeviceLog isSupportGet earPhone log isSupport: ", Boolean.valueOf(zD));
        if (z && zD && deviceInfo != null) {
            c(deviceInfo, this.m, true, "3");
        } else {
            c(deviceInfo, this.m, false, "");
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.callback.NotifyPhoneServiceCallback
    public void executeResponse(int i, DeviceInfo deviceInfo, int i2, String str) {
        if (i == 0) {
            LogUtil.a("HwDeviceDfxManager", "executeResponse progress reserve: ", Integer.valueOf(i2));
            if (i2 == 100) {
                c(deviceInfo, this.m, false, "");
                lvb.e().e("earphoneLogPre");
                return;
            }
            return;
        }
        if (i == 1) {
            LogUtil.a("HwDeviceDfxManager", "executeResponse timeout");
            c(deviceInfo, this.m, false, "");
            lvb.e().e("earphoneLogPre");
            return;
        }
        LogUtil.a("HwDeviceDfxManager", "others");
    }

    private boolean b(List<DeviceInfo> list) {
        boolean z;
        if (list.isEmpty()) {
            LogUtil.j("HwDeviceDfxManager", "connectedDeviceList is empty");
            z = false;
        } else {
            z = true;
        }
        if (!CompileParameterUtil.d("SUPPORT_LOG_FEEDBACK")) {
            ReleaseLogUtil.a("Dfx_HwDeviceDfxManager", "getMaintenanceFileNoRestrict(), the version do not support.");
            z = false;
        }
        if (!mjh.e()) {
            return z;
        }
        ReleaseLogUtil.d("Dfx_HwDeviceDfxManager", "getMaintenanceFileNoRestrict(), collecting device log manually.");
        return false;
    }

    private void a() {
        for (int i = 0; i < 10; i++) {
            if (lug.c() == null) {
                LogUtil.j("HwDeviceDfxManager", "phoneService binder is null,init PhoneService binder");
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused) {
                    LogUtil.e("HwDeviceDfxManager", "Exception is InterruptedException");
                }
            } else {
                LogUtil.a("HwDeviceDfxManager", "phoneService binder is not null");
                return;
            }
        }
    }

    public void c(int i, DeviceDfxBaseResponseCallback deviceDfxBaseResponseCallback) {
        if (mjh.e()) {
            LogUtil.a("HwDeviceDfxManager", "getCrowdTestAndMaintenance(), collecting device log manually.");
            return;
        }
        this.y = 0;
        this.v = deviceDfxBaseResponseCallback;
        this.x = mjj.c();
        this.s = false;
        e(false);
        this.r = 0;
        this.n = 1;
        this.u = 1;
        new Thread(new Runnable() { // from class: lws.4
            @Override // java.lang.Runnable
            public void run() {
                mfe.d().a(lws.this.o);
            }
        }).start();
    }

    public void b(int i, String str, DeviceDfxBaseResponseCallback deviceDfxBaseResponseCallback) {
        if (mjh.e()) {
            LogUtil.a("HwDeviceDfxManager", "getDfxBetaQuestion(), collecting device log manually.");
            return;
        }
        LogUtil.a("HwDeviceDfxManager", "getDfxBetaQuestion(), level = ", Integer.valueOf(i), ", callback = ", deviceDfxBaseResponseCallback);
        this.y = 0;
        this.v = deviceDfxBaseResponseCallback;
        this.x = mjj.c();
        this.s = false;
        e(false);
        this.r = 0;
        this.n = 1;
        this.u = 1;
        DeviceInfo deviceInfoB = mgg.b(str, "HwDeviceDfxManager");
        boolean zD = eey.d(deviceInfoB, 134);
        LogUtil.a("HwDeviceDfxManager", "goBetaFeedBack handlerGetDeviceLog isSupportGet earPhone log isSupport: ", Boolean.valueOf(zD));
        if (zD) {
            c(deviceInfoB, this.m, true, "2");
        } else {
            c(deviceInfoB, this.m, false, "");
        }
    }

    public boolean c(DeviceInfo deviceInfo) {
        boolean zO = Utils.o();
        boolean zC = niz.c();
        LogUtil.a("HwDeviceDfxManager", "isDeviceSupport(), BuildConfig.SUPPORT_LOG_FEEDBACK = " + CompileParameterUtil.d("SUPPORT_LOG_FEEDBACK") + ", isExperience = " + zC + ",isOversea: " + zO);
        if (deviceInfo != null) {
            this.i = deviceInfo.getProductType();
            LogUtil.d("HwDeviceDfxManager", "isDeviceSupport(), mDeviceType = " + this.i);
            if (lvi.g(this.i)) {
                boolean z = CompileParameterUtil.d("SUPPORT_LOG_FEEDBACK") || CompileParameterUtil.d("RELEASE_EVENT_LOG_UPLOAD");
                boolean z2 = loj.c(48) && zC;
                if (z && z2 && !zO) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005c  */
    public boolean d(String str) {
        boolean z;
        boolean zC = niz.c();
        ReleaseLogUtil.d("Dfx_HwDeviceDfxManager", "isOverseaDeviceSupport(), BuildConfig.SUPPORT_LOG_FEEDBACK = ", Boolean.valueOf(CompileParameterUtil.d("SUPPORT_LOG_FEEDBACK")), " isExperience = ", Boolean.valueOf(zC));
        DeviceInfo deviceInfoJ = mjh.j(str);
        if (deviceInfoJ != null) {
            this.i = deviceInfoJ.getProductType();
            ReleaseLogUtil.d("Dfx_HwDeviceDfxManager", "isOverseaDeviceSupport(), mDeviceType = " + this.i);
            if (lvi.g(this.i) && ((CompileParameterUtil.d("SUPPORT_LOG_FEEDBACK") || CompileParameterUtil.d("RELEASE_EVENT_LOG_UPLOAD")) && zC)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        ReleaseLogUtil.d("Dfx_HwDeviceDfxManager", "isOverseaDeviceSupport = ", Boolean.valueOf(z));
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DataDeviceInfo dataDeviceInfo, ITransferSleepAndDFXFileCallback iTransferSleepAndDFXFileCallback) {
        if (dataDeviceInfo != null) {
            String deviceSoftVersion = dataDeviceInfo.getDeviceSoftVersion();
            this.f = deviceSoftVersion;
            ReleaseLogUtil.d("Dfx_HwDeviceDfxManager", "handlerFirmwareVersion(), mDeviceVersion = ", deviceSoftVersion);
            this.j = dataDeviceInfo.getDeviceBtMac();
            LogUtil.a("HwDeviceDfxManager", "handlerFirmwareVersion() identify size:", BTDeviceMgrUtil.c().e(this.j));
            DeviceInfo deviceInfoB = mgg.b(this.j, "HwDeviceDfxManager");
            if (deviceInfoB == null) {
                ReleaseLogUtil.a("Dfx_HwDeviceDfxManager", "handlerFirmwareVersion(), deviceInfo is null.");
                return;
            }
            TransferFileInfo transferFileInfo = new TransferFileInfo();
            b(transferFileInfo, dataDeviceInfo, deviceInfoB);
            this.w = 0;
            a(transferFileInfo);
            if (mjh.k(this.j)) {
                a(deviceInfoB, eey.d(deviceInfoB, 217));
            } else {
                lvb.e().a(transferFileInfo, iTransferSleepAndDFXFileCallback);
            }
        }
    }

    private void a(TransferFileInfo transferFileInfo) {
        ReleaseLogUtil.d("Dfx_HwDeviceDfxManager", "printTransferInfo transferFileInfo.getType() = " + transferFileInfo.getType() + ", getTaskType() = " + transferFileInfo.getTaskType() + ", mBugTypeId = " + this.f40983c + ", mTaskType = " + this.u + ", mDtsNumber = " + this.k + ", mFileLogId = " + this.l);
    }

    private void a(DeviceInfo deviceInfo, boolean z) {
        DeviceDfxBaseResponseCallback deviceDfxBaseResponseCallback;
        LogUtil.a("HwDeviceDfxManager", "postSmartWatchLadingBill(). taskType = " + this.u + ", bugTypeId = " + this.f40983c + ", dtsNumber = " + this.k + ", isSupportSmartWifiLog = " + z + ", CommonUtil.isReleaseVersion() = " + CommonUtil.bu());
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                LogUtil.j("HwDeviceDfxManager", "enter else");
                return;
            }
            a(this.f40983c, this.k, deviceInfo);
            if (!CommonUtil.bu()) {
                if (z) {
                    LogUtil.a("HwDeviceDfxManager", "postSmartWatchLadingBill ADVICE_TASK isSupportSmartWifiLog is true");
                    return;
                }
                i();
            }
            c(this.s, deviceInfo.getDeviceIdentify());
            return;
        }
        a(this.f40983c, this.k, deviceInfo);
        if (!CommonUtil.bu()) {
            if (z) {
                LogUtil.a("HwDeviceDfxManager", "postSmartWatchLadingBill COMMON_TASK isSupportSmartWifiLog is true");
                return;
            }
            i();
        }
        mjh.e(false);
        WeakReference<DeviceDfxBaseResponseCallback> weakReference = this.g;
        if (weakReference == null || (deviceDfxBaseResponseCallback = weakReference.get()) == null) {
            return;
        }
        deviceDfxBaseResponseCallback.onSuccess(0, null);
    }

    public static void a(int i, String str, DeviceInfo deviceInfo) {
        if (str == null) {
            LogUtil.e("HwDeviceDfxManager", "sendToSmartWatch(), dtsNumber is null.");
            return;
        }
        ReleaseLogUtil.d("Dfx_HwDeviceDfxManager", "5.10.12 sendToSmartWatch(), bugTypeId = ", Integer.valueOf(i), ", dtsNumber = ", str);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(10);
        deviceCommand.setCommandID(12);
        if (str.isEmpty()) {
            str = "00000000";
        }
        String strA = eeq.a(str);
        String str2 = (eeq.d(1) + eeq.d(strA.length() / 2) + strA) + (eeq.d(2) + eeq.d(4) + eeq.c(i));
        deviceCommand.setDataContent(eeq.c(str2));
        deviceCommand.setDataLen(eeq.c(str2).length);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        lvb.e().c(deviceCommand);
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public void onDestroy() {
        super.onDestroy();
        mjh.e(false);
        e(false);
    }

    public void a(String str, DeviceDfxBaseResponseCallback deviceDfxBaseResponseCallback, int i) {
        this.w = i;
        d(str, deviceDfxBaseResponseCallback);
    }

    public void d(String str, DeviceDfxBaseResponseCallback deviceDfxBaseResponseCallback) {
        long jCurrentTimeMillis = System.currentTimeMillis() - SharedPreferenceManager.b(BaseApplication.getContext(), "BETA_CLUB_QUESTION_NUMBER_TIME");
        if (jCurrentTimeMillis > 43200000) {
            LogUtil.a("HwDeviceDfxManager", "getDeviceLog more than twelve hours, timeDifference: ", Long.valueOf(jCurrentTimeMillis));
            j();
        } else {
            this.f40983c = 0;
            String strE = SharedPreferenceManager.e(BaseApplication.getContext());
            this.k = strE;
            LogUtil.a("HwDeviceDfxManager", "getDeviceLog mDtsNumber: ", strE, ", timeDifference: ", Long.valueOf(jCurrentTimeMillis));
        }
        this.s = false;
        mjh.e(true);
        e(true);
        this.r = 0;
        this.n = 3;
        this.u = 0;
        this.x = mjj.c();
        this.y = 0;
        this.g = new WeakReference<>(deviceDfxBaseResponseCallback);
        DeviceInfo deviceInfoB = mgg.b(str, "HwDeviceDfxManager");
        LogUtil.a("HwDeviceDfxManager", "getDeviceLog mDfxTransferDfxFileUiCallback");
        c(deviceInfoB, this.h, false, "");
    }

    public void c(final boolean z, final String str) {
        LogUtil.d("HwDeviceDfxManager", "startUploadLogFile().");
        ThreadPoolManager.c().b("HwDeviceDfxManager", new Runnable() { // from class: lws.2
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                LogUtil.d("HwDeviceDfxManager", "BuildConfig.RELEASE_EVENT_LOG_UPLOAD: " + CompileParameterUtil.d("RELEASE_EVENT_LOG_UPLOAD"));
                if (CompileParameterUtil.d("RELEASE_EVENT_LOG_UPLOAD")) {
                    mjh.e(lws.this.d, str);
                    return;
                }
                if (Utils.o()) {
                    ltr.b().setProductType(20);
                } else {
                    ltr.b().setProductType(1);
                }
                mjh.e(lws.this.d, z, str);
            }
        });
    }

    public boolean a(DeviceInfo deviceInfo) {
        if (deviceInfo != null && deviceInfo.getProductType() == 34) {
            ReleaseLogUtil.d("Dfx_HwDeviceDfxManager", "current device is Latona");
            return true;
        }
        int i = Calendar.getInstance().get(11);
        LogUtil.a("HwDeviceDfxManager", "isLimitCollectLog(), localHour = " + i);
        if (i >= 6 && i < 10) {
            ReleaseLogUtil.d("Dfx_HwDeviceDfxManager", "isLimitCollectLog(), ", 6, " < localHour < ", 10, " return !!!");
            return false;
        }
        if (i < 17 || i >= 22) {
            return true;
        }
        ReleaseLogUtil.d("Dfx_HwDeviceDfxManager", "isLimitCollectLog(), ", 17, " < localHour < ", 22, " return !!!");
        return false;
    }

    private void b(TransferFileInfo transferFileInfo, DataDeviceInfo dataDeviceInfo, DeviceInfo deviceInfo) {
        if (this.q) {
            transferFileInfo.setIsFromAbout(1);
        } else {
            transferFileInfo.setIsFromAbout(0);
        }
        transferFileInfo.setIsUploadAppLog(this.r);
        transferFileInfo.setType(0);
        transferFileInfo.setRecordId(new ArrayList(16));
        transferFileInfo.setLevel(this.y);
        transferFileInfo.setPriority(this.n);
        transferFileInfo.setSuspend(0);
        transferFileInfo.setTaskType(this.u);
        int deviceType = dataDeviceInfo.getDeviceType();
        if (deviceType == 10) {
            transferFileInfo.setDeviceMac(dataDeviceInfo.getDeviceSn());
        } else {
            transferFileInfo.setDeviceMac(deviceInfo.getSecurityDeviceId());
        }
        transferFileInfo.setDeviceSn(deviceInfo.getDeviceIdentify());
        transferFileInfo.setDeviceModel(deviceInfo.getDeviceModel());
        transferFileInfo.setDeviceType(deviceType);
        transferFileInfo.setDeviceVersion(this.f);
        transferFileInfo.setUdidFromDevice(deviceInfo.getUdidFromDevice());
        transferFileInfo.setSelectedFlag(this.w);
        boolean zIsEmpty = TextUtils.isEmpty(this.j);
        LogUtil.a("HwDeviceDfxManager", "iniTransferFileInfo, isMacEmpty = ", Boolean.valueOf(zIsEmpty), ", transferFileInfo.getDeviceVersion = ", transferFileInfo.getDeviceVersion(), ", dataDeviceInfo.getDeviceSoftVersion = ", dataDeviceInfo.getDeviceSoftVersion(), ", deviceInfo.getSoftVersion = ", deviceInfo.getSoftVersion());
    }

    public void b(int i, String str, String str2) {
        this.f40983c = i;
        this.k = str;
        this.l = str2;
    }

    private void j() {
        this.f40983c = 0;
        this.k = "00000000";
    }

    public void e() {
        synchronized (e) {
            this.f40982a = null;
        }
    }

    public void b(DeviceInfo deviceInfo, IBaseResponseCallback iBaseResponseCallback) {
        this.f40982a = iBaseResponseCallback;
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(10);
        deviceCommand.setCommandID(15);
        String str = eeq.d(1) + eeq.d(1) + eeq.d(0);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        lvb lvbVar = this.t;
        if (lvbVar != null) {
            lvbVar.c(deviceCommand);
        }
    }

    @Override // com.huawei.callback.BluetoothDataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, byte[] bArr) {
        LogUtil.a("HwDeviceDfxManager", "onDataReceived errorCode: ", Integer.valueOf(i), ", deviceInfo = ", deviceInfo);
        if (bArr == null) {
            LogUtil.j("HwDeviceDfxManager", "onDataReceived, data is null");
            return;
        }
        if (bArr.length < 1) {
            LogUtil.j("HwDeviceDfxManager", "onDataReceived data length less than 1");
            return;
        }
        byte b2 = bArr[1];
        if (b2 != 12) {
            if (b2 == 15) {
                if (this.f40982a != null) {
                    LogUtil.a("HwDeviceDfxManager", "device capture response");
                    this.f40982a.a(i, bArr);
                    return;
                }
                return;
            }
            LogUtil.j("HwDeviceDfxManager", "onDataReceived, default");
            return;
        }
        ReleaseLogUtil.d("Dfx_HwDeviceDfxManager", "onDataReceived 5.10.12, CommonUtil.isReleaseVersion() = " + CommonUtil.bu());
        if (CommonUtil.bu()) {
            return;
        }
        HwGetDevicesParameter hwGetDevicesParameter = new HwGetDevicesParameter();
        hwGetDevicesParameter.setDeviceIdentify(deviceInfo.getDeviceIdentify());
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.IDENTIFY_DEVICES, hwGetDevicesParameter, "HwDeviceDfxManager");
        if (deviceList == null || deviceList.isEmpty()) {
            LogUtil.j("HwDeviceDfxManager", "onDataReceived 5.10.12 list = null or empty");
            return;
        }
        DeviceInfo deviceInfo2 = deviceList.get(0);
        boolean zD = eey.d(deviceInfo2, 217);
        int iC = c(bArr);
        LogUtil.a("HwDeviceDfxManager", "onDataReceived isSupportSmartWifiLog = ", Boolean.valueOf(zD), ", 5.10.12 errorCode = ", Integer.valueOf(iC));
        if (zD) {
            e(iC, deviceInfo2);
            if (iC == 100000) {
                d(deviceInfo2);
            } else {
                c(iC, deviceInfo2);
            }
        }
    }

    private int c(byte[] bArr) {
        int i = 0;
        if (bArr != null && bArr.length == 8 && bArr[2] == 127) {
            String strE = eeq.e(bArr);
            LogUtil.a("HwDeviceDfxManager", "parseResultCode Cassini messageHex = ", strE);
            if (strE != null) {
                try {
                    if (strE.length() >= 9) {
                        i = Integer.parseInt(strE.substring(8, strE.length()), 16);
                    }
                } catch (NumberFormatException unused) {
                    LogUtil.e("HwDeviceDfxManager", "parseResultCode mDeviceResponseCallback NumberFormatException");
                }
                LogUtil.a("HwDeviceDfxManager", "parseResultCode Cassini messageHex errorCode =", Integer.valueOf(i));
            }
            return 0;
        }
        LogUtil.a("HwDeviceDfxManager", "parseResultCode Cassini messageHex errorCode =", Integer.valueOf(i));
        return i;
    }

    private void d(DeviceInfo deviceInfo) {
        LogUtil.a("HwDeviceDfxManager", "startDfxFileSmartTask 5.10.12 startDfxFileSmartTask, deviceInfo = ", deviceInfo);
        if (deviceInfo == null) {
            ReleaseLogUtil.d("Dfx_HwDeviceDfxManager", "startDfxFileSmartTask deviceInfo == null");
            return;
        }
        LogUtil.a("HwDeviceDfxManager", "startDfxFileSmartTask mFileLogId: ", this.l, " ,mBugTypeId: ", Integer.valueOf(this.f40983c));
        TransferFileInfo transferFileInfoB = b(deviceInfo);
        transferFileInfoB.setFileLogId(this.l);
        transferFileInfoB.setBugTypeId(this.f40983c);
        LogUtil.a("HwDeviceDfxManager", "startDfxFileSmartTask transferFileInfo mFileLogId: ", transferFileInfoB.getFileLogId(), " ,mBugTypeId: ", Integer.valueOf(transferFileInfoB.getBugTypeId()));
        i();
        LogUtil.a("HwDeviceDfxManager", "startDfxFileSmartTask 5.10.12 startDfxFileSmartTask 5.10.1");
        if (transferFileInfoB.getIsFromAbout() == 1) {
            lvb.e().a(transferFileInfoB, this.h);
        } else {
            lvb.e().a(transferFileInfoB, this.m);
        }
    }

    public boolean d() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "HwDeviceDfxManager");
        if (deviceList != null && deviceList.size() != 0) {
            for (DeviceInfo deviceInfo : deviceList) {
                if (!eei.d(deviceInfo)) {
                    int versionType = deviceInfo.getVersionType();
                    ReleaseLogUtil.d("Dfx_HwDeviceDfxManager", "Device version type is ", Integer.valueOf(versionType));
                    boolean z = CompileParameterUtil.d("IS_RELEASE_VERSION") && (versionType == 0);
                    boolean zH = Utils.h();
                    boolean zF = f();
                    boolean zO = Utils.o();
                    boolean z2 = (!z || Build.BRAND.toLowerCase(Locale.ENGLISH).contains("nubia") || mjh.k(deviceInfo.getDeviceIdentify())) ? false : true;
                    boolean z3 = (zO || !z2 || b()) ? false : true;
                    boolean z4 = zO && z2 && zF && zH;
                    ReleaseLogUtil.d("Dfx_HwDeviceDfxManager", "isAllowLogin: ", Boolean.valueOf(zH), ", isOpen: ", Boolean.valueOf(zF), ", isOverSea: ", Boolean.valueOf(zO));
                    if (z3 || z4) {
                        ReleaseLogUtil.d("Dfx_HwDeviceDfxManager", "show setting_about_release_question.");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean f() {
        String strD = lon.c().d("common_config_feedbacksdk_switch");
        LogUtil.a("HwDeviceDfxManager", "isFeedbackSwitchOpen , COMMON_CONFIG_FEEDBACKSDK_SWITCH = ", strD);
        return "on".equalsIgnoreCase(strD);
    }

    private static boolean b() {
        String strD = lon.c().d("common_config_feedbacksdk_switch");
        LogUtil.a("HwDeviceDfxManager", "isFeedbackSwitchClose , COMMON_CONFIG_FEEDBACKSDK_SWITCH = ", strD);
        return "off".equalsIgnoreCase(strD);
    }

    private void e(boolean z) {
        this.q = z;
        SharedPreferenceManager.a(String.valueOf(10), "KEY_IS_CLICKED_BETA_FEEDBACK", z);
    }
}
