package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.datatype.NotificationData;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseDeviceUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IBaseCallback;
import com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class mxf extends HwBaseManager implements ParserInterface {
    private static mxf h;
    private int f;
    private Context g;
    private int i;
    private BroadcastReceiver j;
    private ITransferSleepAndDFXFileCallback.Stub k;
    private ITransferSleepAndDFXFileCallback.Stub l;
    private List<Object> m;
    private int n;
    private List<IBaseResponseCallback> o;
    private IBaseResponseCallback p;
    private Gson q;
    private JSONArray r;
    private IBaseResponseCallback s;
    private final HwDeviceMgrInterface t;
    private IBaseResponseCallback w;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f42632a = new Object();
    private static final Object e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<Integer, List<IBaseResponseCallback>> f42634c = new HashMap(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f42633b = new Object();

    private boolean b(int i) {
        return (i & 1) == 1;
    }

    private boolean d(int i) {
        return (i & 2) == 2;
    }

    private mxf(Context context) {
        super(context);
        this.n = 0;
        this.i = 0;
        this.f = 0;
        this.m = new ArrayList(16);
        this.o = new ArrayList(16);
        this.q = new Gson();
        this.r = null;
        this.p = null;
        this.s = new IBaseResponseCallback() { // from class: mxf.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                mxf.this.b();
            }
        };
        this.j = new BroadcastReceiver() { // from class: mxf.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (intent == null) {
                    ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "deviceStatusReceiver intent is null");
                    return;
                }
                String action = intent.getAction();
                if (action == null) {
                    ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "deviceStatusReceiver action is null");
                    return;
                }
                if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(action)) {
                    DeviceInfo deviceInfo = intent.getParcelableExtra("deviceinfo") instanceof DeviceInfo ? (DeviceInfo) intent.getParcelableExtra("deviceinfo") : null;
                    if (deviceInfo == null) {
                        ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "deviceStatusReceiver deviceInfo is null");
                        return;
                    }
                    if (deviceInfo.getRelationship() != null && "followed_relationship".equals(deviceInfo.getRelationship())) {
                        ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "This device does not have the correspond capability.");
                        return;
                    } else {
                        if (deviceInfo.getDeviceConnectState() == 3) {
                            ReleaseLogUtil.d("DEVMGR_HwRriServiceMgr", "Data sync bt bt disconnect.");
                            mxf.this.a(300004, "");
                            synchronized (mxf.e) {
                                mxf.f42634c.clear();
                            }
                            return;
                        }
                        return;
                    }
                }
                LogUtil.a("HwRriServiceMgr", "deviceStatusReceiver other action");
            }
        };
        this.k = new ITransferSleepAndDFXFileCallback.Stub() { // from class: mxf.1
            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onProgress(int i, String str) throws RemoteException {
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onSuccess(int i, String str, String str2) throws Throwable {
                ReleaseLogUtil.d("DEVMGR_HwRriServiceMgr", "mFileCallback onSuccess errorCode: ", Integer.valueOf(i));
                mxh.b(str, new IBaseResponseCallback() { // from class: mxf.1.3
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i2, Object obj) {
                        ReleaseLogUtil.d("DEVMGR_HwRriServiceMgr", "saveEcgFileData errorCode: ", Integer.valueOf(i2));
                        if (i2 != 0) {
                            mxf.this.a(100001);
                            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "save info error.");
                            return;
                        }
                        if (!(obj instanceof Long)) {
                            mxf.this.a(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
                            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "Object Type is error.");
                            return;
                        }
                        long jLongValue = ((Long) obj).longValue();
                        if (jLongValue > 2147483647L) {
                            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "ecg time is over.");
                            mxf.this.a(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
                            return;
                        }
                        mxh.b((int) jLongValue);
                        mxf.this.a(0);
                        NotificationData notificationDataB = miy.b();
                        if (notificationDataB == null) {
                            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "notificationData is null, error, please check code.");
                        } else {
                            miy.e(BaseApplication.getContext()).d(notificationDataB, lsb.a());
                        }
                        qrg.d(true);
                    }
                });
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onFailure(int i, String str) throws RemoteException {
                ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "mFileCallback onFailure: ", Integer.valueOf(i));
                mxf.this.a(i);
            }
        };
        this.l = new ITransferSleepAndDFXFileCallback.Stub() { // from class: mxf.5
            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onSuccess(int i, String str, String str2) throws Throwable {
                ReleaseLogUtil.d("DEVMGR_HwRriServiceMgr", "mEcgAnalysisFileCallback errorCode: ", Integer.valueOf(i));
                mxh.b(str, new IBaseResponseCallback() { // from class: mxf.5.5
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i2, Object obj) {
                        ReleaseLogUtil.d("DEVMGR_HwRriServiceMgr", "mEcgAnalysisFileCallback saveEcgFileData errorCode: ", Integer.valueOf(i2));
                        if (i2 != 0) {
                            mxf.this.a(100001);
                            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "mEcgAnalysisFileCallback save info error.");
                            return;
                        }
                        if (!(obj instanceof Long)) {
                            mxf.this.a(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
                            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "mEcgAnalysisFileCallback Object Type is error.");
                            return;
                        }
                        long jLongValue = ((Long) obj).longValue();
                        if (jLongValue > 2147483647L) {
                            ReleaseLogUtil.d("DEVMGR_HwRriServiceMgr", "mEcgAnalysisFileCallback ecg time is over.");
                            mxf.this.a(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
                            return;
                        }
                        mxh.a((int) jLongValue);
                        mxf.this.a(0);
                        NotificationData notificationDataE = miy.e();
                        if (notificationDataE == null) {
                            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "mEcgAnalysisFileCallback notificationData is null, error, please check code.");
                        } else {
                            miy.e(BaseApplication.getContext()).b(notificationDataE, true, lsb.a());
                        }
                        mxf.this.c();
                    }
                });
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onFailure(int i, String str) throws RemoteException {
                ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "mEcgAnalysisFileCallback onFailure: ", Integer.valueOf(i));
                mxf.this.a(i);
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onProgress(int i, String str) throws RemoteException {
                LogUtil.d("HwRriServiceMgr", "mEcgAnalysisFileCallback onProgress");
            }
        };
        LogUtil.a("HwRriServiceMgr", "HwRriServiceMgr Constructor");
        this.g = context;
        HwDeviceMgrInterface hwDeviceMgrInterfaceE = mkf.e(BaseApplication.getContext());
        this.t = hwDeviceMgrInterfaceE;
        if (hwDeviceMgrInterfaceE == null) {
            LogUtil.j("HwRriServiceMgr", "mHwDeviceMgr is null");
        } else {
            h();
        }
    }

    private void h() {
        BroadcastManagerUtil.c(this.g, this.j, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public void onDestroy() {
        super.onDestroy();
        this.g.unregisterReceiver(this.j);
        List<Object> list = this.m;
        if (list != null) {
            list.clear();
        }
    }

    public static mxf e(Context context) {
        mxf mxfVar;
        synchronized (f42632a) {
            if (h == null) {
                h = new mxf(BaseApplication.getContext());
            }
            mxfVar = h;
        }
        return mxfVar;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 35;
    }

    private void d(int i, int i2, String str) {
        if (i == 6) {
            IBaseResponseCallback iBaseResponseCallback = this.w;
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(i2, str);
                return;
            }
            return;
        }
        if (i == 7) {
            IBaseResponseCallback iBaseResponseCallback2 = this.s;
            if (iBaseResponseCallback2 != null) {
                iBaseResponseCallback2.a(i2, str);
                return;
            }
            return;
        }
        LogUtil.j("HwRriServiceMgr", "procCallback error commandId");
    }

    public void b(String str, IBaseResponseCallback iBaseResponseCallback) {
        synchronized (d) {
            if (iBaseResponseCallback != null) {
                if (this.t != null) {
                    DeviceInfo deviceInfoD = d();
                    if (deviceInfoD == null) {
                        ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "setEcgMeasureAuthAccountCommand get device info error");
                        iBaseResponseCallback.a(300004, null);
                        return;
                    } else {
                        this.w = iBaseResponseCallback;
                        ReleaseLogUtil.d("DEVMGR_HwRriServiceMgr", "setEcgMeasureAuthAccountCommand enter");
                        mxd.e(str, deviceInfoD);
                        return;
                    }
                }
            }
            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "setEcgMeasureAuthAccountCommand callback or mHwDeviceMgr is null");
        }
    }

    private void n(byte[] bArr) {
        int i;
        int iC = 201000;
        String strD = null;
        try {
            i = 0;
            if (e(bArr) && bArr[2] == 127) {
                iC = mxl.c(bArr);
                ReleaseLogUtil.d("DEVMGR_HwRriServiceMgr", "proSetEcgMeasureAuth return errorCode: ", Integer.valueOf(iC));
                i = iC;
            } else {
                strD = mxl.d(bArr);
                try {
                    LogUtil.a("HwRriServiceMgr", "proSetEcgMeasureAuth: ", strD);
                } catch (eeu e2) {
                    e = e2;
                    iC = 0;
                    ReleaseLogUtil.a("DEVMGR_HwRriServiceMgr", "proSetEcgMeasureAuth exception: ", ExceptionUtils.c(e));
                    i = iC;
                }
            }
        } catch (eeu e3) {
            e = e3;
        }
        d(6, i, strD);
    }

    private void e(byte[] bArr, DeviceInfo deviceInfo) {
        eeu e2;
        int i = 0;
        this.f = 0;
        this.n = 0;
        this.i = 0;
        List<Object> list = this.m;
        if (list == null) {
            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "mEcgWholeFrameList is null");
            return;
        }
        list.clear();
        try {
            if (e(bArr) && bArr[2] == 127) {
                int iC = mxl.c(bArr);
                try {
                    ReleaseLogUtil.d("DEVMGR_HwRriServiceMgr", "proGetEcgFrameCount return errCode: ", Integer.valueOf(iC));
                    i = iC;
                } catch (eeu e3) {
                    e2 = e3;
                    i = iC;
                    ReleaseLogUtil.a("DEVMGR_HwRriServiceMgr", "proGetEcgFrameCount exception: ", ExceptionUtils.c(e2));
                }
            } else {
                int iA = mxl.a(bArr);
                this.n = iA;
                try {
                    ReleaseLogUtil.d("DEVMGR_HwRriServiceMgr", "proGetEcgFrameCount get ecg frame count: ", Integer.valueOf(iA));
                    if (this.n > 0) {
                        mxd.c(this.i, deviceInfo);
                        this.i++;
                    } else {
                        i = 600001;
                    }
                } catch (eeu e4) {
                    e2 = e4;
                    ReleaseLogUtil.a("DEVMGR_HwRriServiceMgr", "proGetEcgFrameCount exception: ", ExceptionUtils.c(e2));
                }
            }
        } catch (eeu e5) {
            i = 201000;
            e2 = e5;
        }
        d(7, i, String.valueOf(this.n));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Intent intent = new Intent("com.huawei.bone.action.CORE_ECG_DATA_SYNC_COMPLETED");
        intent.setPackage(BaseApplication.getContext().getPackageName());
        BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.a("HwRriServiceMgr", "notifyNewEcgData");
        BaseApplication.getContext().sendBroadcast(new Intent("com.huawei.bone.action.NEW_ECG_DATA_RECEIVED"), LocalBroadcast.f36595c);
    }

    public void d(int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
        synchronized (d) {
            try {
                if (iBaseResponseCallback == null) {
                    ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "setAtrialSingleMeasure callback is null");
                    return;
                }
                if (this.t == null) {
                    ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "setAtrialSingleMeasure mHwDeviceMgr is null");
                    return;
                }
                DeviceInfo deviceInfoD = d();
                if (deviceInfoD != null && deviceInfoD.getDeviceConnectState() == 2) {
                    ReleaseLogUtil.d("DEVMGR_HwRriServiceMgr", "setAtrialSingleMeasure openOrClose:", Integer.valueOf(i));
                    a(3, iBaseResponseCallback);
                    mxd.c(i, i2, deviceInfoD);
                    return;
                }
                ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "setAtrialSingleMeasure get device info error");
                iBaseResponseCallback.a(300004, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(int i, IBaseResponseCallback iBaseResponseCallback) {
        synchronized (d) {
            try {
                if (iBaseResponseCallback == null) {
                    ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "setAtrialAutoMeasure callback is null");
                    return;
                }
                if (this.t == null) {
                    ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "setAtrialAutoMeasure mHwDeviceMgr is null");
                    return;
                }
                DeviceInfo deviceInfoD = d();
                if (deviceInfoD != null && deviceInfoD.getDeviceConnectState() == 2) {
                    ReleaseLogUtil.d("DEVMGR_HwRriServiceMgr", "setAtrialAutoMeasure send command");
                    a(2, iBaseResponseCallback);
                    mxd.d(i, deviceInfoD);
                    return;
                }
                ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "setAtrialAutoMeasure get device info error");
                iBaseResponseCallback.a(300004, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(IBaseResponseCallback iBaseResponseCallback) {
        DeviceInfo next;
        synchronized (d) {
            try {
                if (iBaseResponseCallback == null) {
                    ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "clearAtrialData callback is null");
                    return;
                }
                if (this.t == null) {
                    ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "clearAtrialData mHwDeviceMgr is null");
                    return;
                }
                List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwRriServiceMgr");
                if (deviceList.size() <= 0) {
                    next = null;
                    break;
                }
                Iterator<DeviceInfo> it = deviceList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (eel.d(next.getProductType()));
                if (next == null) {
                    ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "clearAtrialData get device info error");
                    iBaseResponseCallback.a(300004, null);
                } else {
                    ReleaseLogUtil.d("DEVMGR_HwRriServiceMgr", "clearAtrialData send command");
                    a(4, iBaseResponseCallback);
                    mxd.b(next);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(IBaseResponseCallback iBaseResponseCallback) {
        synchronized (f42633b) {
            try {
                if (iBaseResponseCallback == null) {
                    ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "registerSingleAtrialCallback callback is null");
                    return;
                }
                List<IBaseResponseCallback> list = this.o;
                if (list == null) {
                    ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "mDeviceAtrialReportCallbacks is null");
                } else {
                    if (list.contains(iBaseResponseCallback)) {
                        return;
                    }
                    LogUtil.a("HwRriServiceMgr", "registerSingleAtrialCallback", iBaseResponseCallback);
                    this.o.add(iBaseResponseCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(IBaseResponseCallback iBaseResponseCallback) {
        synchronized (f42633b) {
            List<IBaseResponseCallback> list = this.o;
            if (list != null) {
                if (iBaseResponseCallback == null) {
                    ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "unregisterNotificationAtrialCallback callback is null");
                } else if (list.size() > 0) {
                    this.o.clear();
                    iBaseResponseCallback.a(0, "");
                } else {
                    iBaseResponseCallback.a(-1, "");
                }
            }
        }
    }

    private void j(byte[] bArr) {
        int iC;
        try {
            iC = mxl.c(bArr);
        } catch (eeu e2) {
            ReleaseLogUtil.a("DEVMGR_HwRriServiceMgr", "proSetAtrialSingleMeasureCode exception: ", ExceptionUtils.c(e2));
            iC = 201000;
        }
        c(3, iC, "");
    }

    private void h(byte[] bArr) {
        int iC;
        try {
            iC = mxl.c(bArr);
        } catch (eeu e2) {
            ReleaseLogUtil.a("DEVMGR_HwRriServiceMgr", "proSetAtrialAutoMeasureCode exception: ", ExceptionUtils.c(e2));
            iC = 201000;
        }
        c(2, iC, "");
    }

    private void c(byte[] bArr) {
        int iC;
        try {
            iC = mxl.c(bArr);
        } catch (eeu e2) {
            ReleaseLogUtil.a("DEVMGR_HwRriServiceMgr", "proClearAtrialDataCode exception: ", ExceptionUtils.c(e2));
            iC = 201000;
        }
        c(4, iC, "");
    }

    private void s(byte[] bArr) {
        a(300, eeq.e(bArr));
    }

    private void d(byte[] bArr) {
        int iC;
        if (bArr.length == 8 && bArr[2] == 127) {
            try {
                iC = mxl.c(bArr);
                try {
                    a(iC, "");
                } catch (eeu e2) {
                    e = e2;
                    ReleaseLogUtil.a("DEVMGR_HwRriServiceMgr", "proDeviceReportAtrialDataCode exception: ", ExceptionUtils.c(e));
                    a(iC, "");
                }
            } catch (eeu e3) {
                e = e3;
                iC = 201000;
            }
        } else {
            List<mxi> listB = b(bArr);
            if (listB == null) {
                a(700001, "");
            } else {
                a(0, this.q.toJson(listB));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Object obj) {
        synchronized (f42633b) {
            List<IBaseResponseCallback> list = this.o;
            if (list != null && list.size() != 0) {
                for (IBaseResponseCallback iBaseResponseCallback : this.o) {
                    if (iBaseResponseCallback != null) {
                        iBaseResponseCallback.a(i, obj);
                    }
                }
            }
        }
    }

    private List<mxi> b(byte[] bArr) {
        ArrayList arrayList = new ArrayList(16);
        if (!eet.e(bArr)) {
            String strE = eeq.e(bArr);
            if (strE.length() > 4) {
                try {
                    c(arrayList, new eet().b(strE.substring(4, strE.length())).b());
                    return arrayList;
                } catch (eeu | NumberFormatException e2) {
                    ReleaseLogUtil.a("DEVMGR_HwRriServiceMgr", "createSingleAtrialDataEntity exception: ", ExceptionUtils.c(e2));
                    return Collections.EMPTY_LIST;
                }
            }
        }
        return arrayList;
    }

    private void c(List<mxi> list, List<ees> list2) {
        for (ees eesVar : list2) {
            mxi mxiVar = new mxi();
            List<eew> listE = eesVar.e();
            List<Integer> arrayList = new ArrayList<>(16);
            List<Integer> arrayList2 = new ArrayList<>(16);
            long j = 0;
            for (eew eewVar : listE) {
                int iV = CommonUtil.v(eewVar.e());
                if (iV == 3) {
                    j = Long.parseLong(eewVar.b(), 16);
                } else if (iV != 4) {
                    if (iV == 5) {
                        if (eewVar.b().length() < 8) {
                            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "ppg data error");
                        } else {
                            arrayList2 = e(arrayList2, eewVar);
                        }
                    } else {
                        LogUtil.d("05", 1, "HwRriServiceMgr", "createAtrialData else");
                    }
                } else if (eewVar.b().length() < 4) {
                    ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "acc data error");
                } else {
                    arrayList = b(arrayList, eewVar);
                }
            }
            mxiVar.d(j);
            mxiVar.b(arrayList);
            mxiVar.d(arrayList2);
            list.add(mxiVar);
        }
    }

    private List<Integer> e(List<Integer> list, eew eewVar) {
        int i = 0;
        while (i < eewVar.b().length()) {
            int i2 = i + 8;
            list.add(Integer.valueOf((int) Long.parseLong(eewVar.b().substring(i, i2), 16)));
            i = i2;
        }
        return list;
    }

    private List<Integer> b(List<Integer> list, eew eewVar) {
        int i = 0;
        while (i < eewVar.b().length()) {
            int i2 = i + 4;
            list.add(Integer.valueOf((short) (Long.parseLong(eewVar.b().substring(i, i2), 16) & 65535)));
            i = i2;
        }
        return list;
    }

    private void a(int i, IBaseResponseCallback iBaseResponseCallback) {
        synchronized (e) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> arrayList = f42634c.get(Integer.valueOf(i));
                if (arrayList == null) {
                    arrayList = new ArrayList<>(16);
                    f42634c.put(Integer.valueOf(i), arrayList);
                }
                arrayList.add(iBaseResponseCallback);
            }
        }
    }

    private void c(int i, int i2, Object obj) {
        ReleaseLogUtil.d("DEVMGR_HwRriServiceMgr", "procCallback callback commandId is ", Integer.valueOf(i), " errorCode is ", Integer.valueOf(i2));
        synchronized (e) {
            List<IBaseResponseCallback> list = f42634c.get(Integer.valueOf(i));
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    IBaseResponseCallback iBaseResponseCallback = list.get(size);
                    if (iBaseResponseCallback != null) {
                        iBaseResponseCallback.a(i2, obj);
                        list.remove(size);
                        break;
                    }
                    list.remove(size);
                }
            }
        }
    }

    public void b(IBaseResponseCallback iBaseResponseCallback, JSONObject jSONObject) {
        int i;
        String string;
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "setEcgAuthSwitch callback is null.");
            return;
        }
        if (jSONObject == null) {
            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "setEcgAuthSwitch json is null.");
            iBaseResponseCallback.a(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007, "json is empty.");
            return;
        }
        LogUtil.a("HwRriServiceMgr", "setEcgAuthSwitch json : ", jSONObject.toString());
        try {
            i = jSONObject.getInt("ecg_authorization_switch");
            try {
                string = jSONObject.getString("package_name");
            } catch (JSONException unused) {
                ReleaseLogUtil.a("DEVMGR_HwRriServiceMgr", "checkJson authSwitch JSONException");
                string = "";
            }
        } catch (JSONException unused2) {
            i = -1;
        }
        if (i != -1 && !TextUtils.isEmpty(string)) {
            ReleaseLogUtil.d("DEVMGR_HwRriServiceMgr", "setEcgAuthSwitch enter authSwitch：", Integer.valueOf(i));
            a(11, iBaseResponseCallback);
            mxd.a(i, string);
        } else {
            iBaseResponseCallback.a(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007, "json is error.");
            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "setEcgAuthSwitch json is error.");
        }
    }

    public void a(IBaseResponseCallback iBaseResponseCallback, JSONObject jSONObject) {
        int i;
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "setEcgAuthSwitch callback is null.");
            return;
        }
        if (jSONObject == null) {
            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "setForbiddenSwitch json is null.");
            iBaseResponseCallback.a(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007, "json is null.");
            return;
        }
        LogUtil.a("HwRriServiceMgr", "setForbiddenSwitch json : ", jSONObject.toString());
        try {
            i = jSONObject.getInt("ecg_forbidden_switch");
        } catch (JSONException unused) {
            ReleaseLogUtil.a("DEVMGR_HwRriServiceMgr", "checkJson authSwitch JSONException");
            i = -1;
        }
        if (i == -1) {
            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "setForbiddenSwitch json is error.");
            iBaseResponseCallback.a(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007, "json is error.");
        } else {
            ReleaseLogUtil.d("DEVMGR_HwRriServiceMgr", "setForbiddenSwitch enter");
            a(12, iBaseResponseCallback);
            mxd.e(i);
        }
    }

    public void b(IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "getAuthSwitch callback is null.");
            return;
        }
        ReleaseLogUtil.d("DEVMGR_HwRriServiceMgr", "enter getAuthSwitch");
        a(14, iBaseResponseCallback);
        mxd.d();
    }

    public void a(String str, final IBaseCallback iBaseCallback) {
        if (iBaseCallback == null) {
            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "sendBlockList callback is null.");
            return;
        }
        try {
            a(new JSONObject(str), new IBaseResponseCallback() { // from class: mxf.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    try {
                        if (obj instanceof String) {
                            iBaseCallback.onResponse(i, (String) obj);
                        } else {
                            iBaseCallback.onResponse(i, "");
                        }
                    } catch (RemoteException unused) {
                        ReleaseLogUtil.a("DEVMGR_HwRriServiceMgr", "sendEcgBlockList RemoteException");
                    }
                }
            });
        } catch (JSONException unused) {
            ReleaseLogUtil.a("DEVMGR_HwRriServiceMgr", "sendEcgBlockList json exception.");
            try {
                iBaseCallback.onResponse(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007, "");
            } catch (RemoteException unused2) {
                ReleaseLogUtil.a("DEVMGR_HwRriServiceMgr", "JSONException sendEcgBlockList RemoteException");
            }
        }
    }

    public void a(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwRriServiceMgr", "5.35.15 sendBlockList enter.");
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "callback is null");
            return;
        }
        if (jSONObject == null) {
            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "json object is null.");
            iBaseResponseCallback.a(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007, "");
            return;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("list");
            if (jSONArray != null && jSONArray.length() != 0) {
                this.r = jSONArray;
                a(15, iBaseResponseCallback);
                f();
                return;
            }
            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "readySendList is null or length is 0");
            iBaseResponseCallback.a(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007, "");
        } catch (JSONException unused) {
            ReleaseLogUtil.a("DEVMGR_HwRriServiceMgr", "sendBlockList JSONException");
            iBaseResponseCallback.a(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007, "");
        }
    }

    private void f() {
        ReleaseLogUtil.d("DEVMGR_HwRriServiceMgr", "sendRemainingBlockList enter");
        JSONArray jSONArray = this.r;
        if (jSONArray != null && jSONArray.length() != 0) {
            Object objRemove = jSONArray.remove(0);
            JSONArray jSONArray2 = new JSONArray();
            boolean z = jSONArray.length() == 0;
            jSONArray2.put(objRemove);
            try {
                mxd.a(jSONArray2, z);
                return;
            } catch (JSONException unused) {
                ReleaseLogUtil.a("DEVMGR_HwRriServiceMgr", "sendRemainingBlockList JSONException");
                f();
                return;
            }
        }
        ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "sendRemainingBlockList blockArray is error");
    }

    public void a(IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "getSwitchStatus callback is null");
            return;
        }
        ReleaseLogUtil.d("DEVMGR_HwRriServiceMgr", "enter getSwitchStatus");
        a(9, iBaseResponseCallback);
        mxd.a();
    }

    public void c(IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "getEcgServiceIv callback is null.");
            return;
        }
        ReleaseLogUtil.d("DEVMGR_HwRriServiceMgr", "enter getEcgServiceIv");
        a(17, iBaseResponseCallback);
        mxd.c();
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        if (bArr == null || bArr.length <= 2) {
            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "onResponse error data");
            return;
        }
        cpl.d("HwRriServiceMgr", bArr, "onResponse receive bt dataInfos: ");
        ReleaseLogUtil.d("DEVMGR_HwRriServiceMgr", "getResult commandId:", Byte.valueOf(bArr[1]));
        switch (bArr[1]) {
            case 2:
                h(bArr);
                break;
            case 3:
                j(bArr);
                break;
            case 4:
                c(bArr);
                break;
            case 5:
                d(bArr);
                break;
            case 6:
                n(bArr);
                break;
            case 7:
                e(bArr, deviceInfo);
                break;
            case 8:
            case 9:
            default:
                a(bArr);
                break;
            case 10:
                s(bArr);
                break;
            case 11:
                f(bArr);
                break;
            case 12:
                l(bArr);
                break;
            case 13:
                i(bArr);
                break;
            case 14:
                g(bArr);
                break;
        }
    }

    private void a(byte[] bArr) {
        byte b2 = bArr[1];
        if (b2 == 9) {
            k(bArr);
            return;
        }
        if (b2 == 15) {
            m(bArr);
        } else if (b2 == 17) {
            o(bArr);
        } else {
            LogUtil.j("HwRriServiceMgr", "onResponse recv bt error data");
        }
    }

    private void o(byte[] bArr) {
        String str;
        String strB = "";
        try {
            List<eew> listE = new eet().b(eeq.e(bArr).substring(4)).e();
            if (listE != null && !listE.isEmpty()) {
                String strB2 = "";
                for (eew eewVar : listE) {
                    try {
                        int iV = CommonUtil.v(eewVar.e());
                        if (iV == 1) {
                            strB = eewVar.b();
                        } else if (iV == 2) {
                            strB2 = eewVar.b();
                        } else if (iV != 127) {
                            LogUtil.d("HwRriServiceMgr", "parseEcgIVTlv receive other type", Integer.valueOf(iV));
                        } else {
                            ReleaseLogUtil.d("DEVMGR_HwRriServiceMgr", "processGetEcgServiceIv has error code : ", Integer.valueOf(CommonUtil.v(eewVar.b())));
                            return;
                        }
                    } catch (eeu unused) {
                        str = strB;
                        strB = strB2;
                        LogUtil.e("HwRriServiceMgr", "parseEcgIVTlv TlvException");
                        strB2 = strB;
                        strB = str;
                    }
                }
                LogUtil.a("HwRriServiceMgr", "parseEcgIVTlv ecgIv = ", strB, ", ecgGenerate = ", strB2);
                d(strB, strB2);
                return;
            }
            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "Tlv is error.");
        } catch (eeu unused2) {
            str = "";
        }
    }

    private void d(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                jSONObject.put("ecgServiceIv", str);
                jSONObject.put("ecgServiceIvPsd", str2);
            } catch (JSONException unused) {
                ReleaseLogUtil.a("DEVMGR_HwRriServiceMgr", "processGetSwitchStatus JSONException");
            }
        }
        synchronized (e) {
            List<IBaseResponseCallback> list = f42634c.get(17);
            if (list != null && !list.isEmpty()) {
                if (TextUtils.isEmpty(jSONObject.toString())) {
                    c(17, -1, "json put is error");
                    return;
                } else {
                    c(17, 0, jSONObject.toString());
                    return;
                }
            }
            Intent intent = new Intent("com.huawei.health.action.ecgiv.received");
            intent.putExtra("dataIv", jSONObject.toString());
            BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
            ReleaseLogUtil.d("DEVMGR_HwRriServiceMgr", "processGetEcgServiceIv sendBroadcast");
        }
    }

    private void k(byte[] bArr) {
        int iV;
        try {
            List<eew> listE = new eet().b(eeq.e(bArr).substring(4)).e();
            if (listE != null && listE.size() != 0) {
                iV = -1;
                for (eew eewVar : listE) {
                    try {
                        int iV2 = CommonUtil.v(eewVar.e());
                        if (iV2 == 1) {
                            iV = CommonUtil.v(eewVar.b());
                        } else {
                            if (iV2 == 127) {
                                c(9, CommonUtil.v(eewVar.b()), "5.35.9 tlv send errorCode");
                                return;
                            }
                            LogUtil.d("HwRriServiceMgr", "no support Tag");
                        }
                    } catch (eeu e2) {
                        e = e2;
                        ReleaseLogUtil.a("DEVMGR_HwRriServiceMgr", "processGetSwitchStatus tlv exception: ", ExceptionUtils.c(e));
                    }
                }
                ReleaseLogUtil.d("DEVMGR_HwRriServiceMgr", "processGetSwitchStatus bitmap:", Integer.valueOf(iV));
                if (iV == -1) {
                    c(9, -1, "device send tlv is wrong");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("bitmap", iV);
                } catch (JSONException unused) {
                    ReleaseLogUtil.a("DEVMGR_HwRriServiceMgr", "processGetSwitchStatus JSONException");
                }
                if (TextUtils.isEmpty(jSONObject.toString())) {
                    c(9, -1, "json put is error");
                    return;
                } else {
                    c(9, 0, jSONObject.toString());
                    return;
                }
            }
            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "tlvList is error");
        } catch (eeu e3) {
            e = e3;
            iV = -1;
        }
    }

    private void m(byte[] bArr) {
        try {
            List<eew> listE = new eet().b(eeq.e(bArr).substring(4)).e();
            if (listE != null && listE.size() != 0) {
                for (eew eewVar : listE) {
                    if (CommonUtil.v(eewVar.e()) == 127) {
                        int iV = CommonUtil.v(eewVar.b());
                        LogUtil.d("HwRriServiceMgr", "5.35.15 errorCode is ", Integer.valueOf(iV));
                        c(15, iV, "5.35.15 tlv send errorCode");
                        f();
                        return;
                    }
                    LogUtil.d("HwRriServiceMgr", "no support Tag");
                }
                return;
            }
            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "processSendBlockList tlvList is error");
        } catch (eeu unused) {
            ReleaseLogUtil.a("DEVMGR_HwRriServiceMgr", "processSendBlockList TlvException");
        }
    }

    private boolean e(byte[] bArr) {
        return bArr.length >= 3;
    }

    private void f(byte[] bArr) {
        int iC;
        try {
            iC = mxl.c(bArr);
        } catch (eeu e2) {
            LogUtil.e("HwRriServiceMgr", "proSetEcgAuthSwitch exception: ", e2.getMessage());
            iC = 201000;
        }
        c(11, iC, "");
    }

    private void l(byte[] bArr) {
        int iC;
        try {
            iC = mxl.c(bArr);
        } catch (eeu e2) {
            LogUtil.e("HwRriServiceMgr", "proSetEcgAuthSwitch exception: ", e2.getMessage());
            iC = 201000;
        }
        c(12, iC, "");
    }

    private void i(byte[] bArr) {
        int iV;
        try {
            List<eew> listE = new eet().b(eeq.e(bArr).substring(4)).e();
            if (listE != null && listE.size() != 0) {
                iV = -1;
                for (eew eewVar : listE) {
                    try {
                        int iV2 = CommonUtil.v(eewVar.e());
                        if (iV2 == 1) {
                            iV = CommonUtil.v(eewVar.b());
                        } else if (iV2 != 127) {
                            LogUtil.d("HwRriServiceMgr", "no support tag");
                        } else {
                            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "5.35.13 error code is ", Integer.valueOf(CommonUtil.v(eewVar.b())));
                            return;
                        }
                    } catch (eeu e2) {
                        e = e2;
                        ReleaseLogUtil.a("DEVMGR_HwRriServiceMgr", "proEcgAction tlv exception: ", ExceptionUtils.c(e));
                    }
                }
                ReleaseLogUtil.d("DEVMGR_HwRriServiceMgr", "proEcgAction bitmap:", Integer.valueOf(iV));
                if (iV == -1) {
                    LogUtil.j("HwRriServiceMgr", "5.35.13 tlv is error.");
                    return;
                }
                if (b(iV)) {
                    mzj.b().b("ECG_SYNC_TASK");
                }
                if (d(iV)) {
                    mzj.b().b("ECG_ANALY_SYNC_TASK");
                    return;
                }
                return;
            }
            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "tlv is error.");
        } catch (eeu e3) {
            e = e3;
            iV = -1;
        }
    }

    public void i(IBaseResponseCallback iBaseResponseCallback) {
        DeviceInfo currentDeviceInfo = HwExerciseDeviceUtil.getCurrentDeviceInfo();
        if (currentDeviceInfo == null || currentDeviceInfo.getDeviceConnectState() != 2) {
            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "startFileTask no device connect.");
            iBaseResponseCallback.a(-1, "");
            return;
        }
        int[] iArr = {mxh.e(), (int) (System.currentTimeMillis() / 1000)};
        ReleaseLogUtil.d("DEVMGR_HwRriServiceMgr", "startFileTask last time: ", Integer.valueOf(iArr[0]), ", now time: ", Integer.valueOf(iArr[1]));
        if (iArr[0] > iArr[1]) {
            LogUtil.j("HwRriServiceMgr", "wrong, start time > end time");
            int i = iArr[1] - 61;
            if (i > 0) {
                iArr[0] = i;
            } else {
                iArr[0] = 0;
            }
            mxh.b(iArr[0]);
        }
        this.p = iBaseResponseCallback;
        mhp mhpVar = new mhp();
        mhpVar.a("ecg_data_file");
        mhpVar.c(8);
        mhpVar.e(false);
        mhpVar.c(iArr);
        mhpVar.d(null);
        mrj.e().a(mhpVar, this.k);
    }

    public void g(IBaseResponseCallback iBaseResponseCallback) {
        DeviceInfo currentDeviceInfo = HwExerciseDeviceUtil.getCurrentDeviceInfo();
        if (currentDeviceInfo == null || currentDeviceInfo.getDeviceConnectState() != 2) {
            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "startEcgAnaFileTask no device connect.");
            iBaseResponseCallback.a(-1, "");
            return;
        }
        int[] iArr = {mxh.d(), (int) (System.currentTimeMillis() / 1000)};
        ReleaseLogUtil.d("DEVMGR_HwRriServiceMgr", "startEcgAnaFileTask last time: ", Integer.valueOf(iArr[0]), ", now time: ", Integer.valueOf(iArr[1]));
        if (iArr[0] > iArr[1]) {
            LogUtil.j("HwRriServiceMgr", "wrong, start time > end time");
            int i = iArr[1] - 61;
            if (i > 0) {
                iArr[0] = i;
            } else {
                iArr[0] = 0;
            }
            mxh.a(iArr[0]);
        }
        this.p = iBaseResponseCallback;
        mhp mhpVar = new mhp();
        mhpVar.a("ecg_analysis_data.bin");
        mhpVar.c(24);
        mhpVar.e(false);
        mhpVar.c(iArr);
        mhpVar.d(null);
        mrj.e().a(mhpVar, this.l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        IBaseResponseCallback iBaseResponseCallback = this.p;
        this.p = null;
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(i, "");
        } else {
            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "callback is null.");
        }
    }

    private void g(byte[] bArr) {
        int iV;
        try {
            List<eew> listE = new eet().b(eeq.e(bArr).substring(4)).e();
            if (listE != null && listE.size() != 0) {
                iV = -1;
                for (eew eewVar : listE) {
                    try {
                        int iV2 = CommonUtil.v(eewVar.e());
                        if (iV2 == 1) {
                            iV = CommonUtil.v(eewVar.b());
                        } else {
                            if (iV2 == 127) {
                                c(14, CommonUtil.v(eewVar.b()), "5.35.14 tlv send error code.");
                                return;
                            }
                            LogUtil.d("HwRriServiceMgr", "no support tag");
                        }
                    } catch (eeu e2) {
                        e = e2;
                        ReleaseLogUtil.a("DEVMGR_HwRriServiceMgr", "proEcgAction tlv exception:", ExceptionUtils.c(e));
                    }
                }
                ReleaseLogUtil.d("DEVMGR_HwRriServiceMgr", "proGetEcgAuthSwitch bitmap:", Integer.valueOf(iV));
                if (iV == -1) {
                    c(14, -1, "device send tlv is wrong.");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("bitmap", iV);
                } catch (JSONException unused) {
                    ReleaseLogUtil.a("DEVMGR_HwRriServiceMgr", "proGetEcgAuthSwitch JSONException");
                }
                if (TextUtils.isEmpty(jSONObject.toString())) {
                    c(14, -1, "json put is error.");
                    return;
                } else {
                    c(14, 0, jSONObject.toString());
                    return;
                }
            }
            ReleaseLogUtil.e("DEVMGR_HwRriServiceMgr", "tlv is error.");
        } catch (eeu e3) {
            e = e3;
            iV = -1;
        }
    }

    private DeviceInfo d() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwRriServiceMgr");
        if (deviceList != null && deviceList.size() > 0) {
            for (DeviceInfo deviceInfo : deviceList) {
                if (!eel.d(deviceInfo.getProductType())) {
                    return deviceInfo;
                }
            }
        }
        return null;
    }
}
