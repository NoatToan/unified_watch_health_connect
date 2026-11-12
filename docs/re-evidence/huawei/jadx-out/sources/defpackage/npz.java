package defpackage;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BadParcelableException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.chinatelecom.multisimservice.model.IOpenMultiSimCalbcak;
import com.huawei.callback.BluetoothDataReceiveCallback;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.multisimservice.model.EUICCDeviceInfo;
import com.huawei.multisimservice.model.EUICCInfo;
import com.huawei.multisimservice.model.IAttachedDeviceMultiSimCallback;
import com.huawei.multisimservice.model.MultiSimDeviceInfo;
import com.huawei.multisimservice.model.SimInfo;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.watchface.mvp.model.webview.JsNetwork;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class npz extends HwBaseManager implements BluetoothDataReceiveCallback, DataReceiveCallback {
    private static npz j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f43432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f43433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected oeh f43434c;
    protected int d;
    private IOpenMultiSimCalbcak f;
    private IAttachedDeviceMultiSimCallback k;
    private Handler l;
    private String m;
    private BroadcastReceiver n;
    private List<IBaseResponseCallback> o;
    private com.huawei.multisimservice.model.IOpenMultiSimCalbcak p;
    private lvb q;
    private boolean r;
    private IBaseResponseCallback s;
    private String t;
    private static final Object g = new Object();
    private static final Object e = new Object();
    private static Map<Integer, List<IBaseResponseCallback>> i = new HashMap(16);
    private static String h = "";

    /* JADX INFO: Access modifiers changed from: private */
    public int d(int i2) {
        return i2 == 0 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        this.l.removeMessages(0);
        this.l.removeMessages(1);
        this.l.removeMessages(2);
        this.l.removeMessages(3);
        this.l.removeMessages(9);
        this.l.removeMessages(10);
        d(1, 100001, (Object) (-2));
        d(2, -1, (Object) (-2));
        d(3, 100001, (Object) (-2));
        d(4, -1, (Object) (-2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag() {
        LogUtil.a("HwMultiSimMgr", "startMultiSimAuthPage");
        try {
            Intent intent = new Intent();
            intent.addFlags(268435456);
            intent.setAction("com.huawei.health.MULTI_SIM_AUTH");
            intent.setPackage(BaseApplication.getContext().getPackageName());
            BaseApplication.getContext().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("HwMultiSimMgr", "startMultiSimAuthPage ActivityNotFoundException");
        }
    }

    private npz(Context context) {
        super(context);
        this.k = null;
        this.f = null;
        this.p = null;
        this.m = "";
        this.t = "";
        this.d = 0;
        this.f43432a = 2;
        this.f43433b = 1000;
        this.f43434c = new oeh();
        this.r = false;
        this.o = new ArrayList(16);
        this.n = new BroadcastReceiver() { // from class: npz.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                Parcelable parcelableExtra;
                if (intent == null) {
                    LogUtil.j("HwMultiSimMgr", "mConnectStatus intent is null");
                    xjt.q("mConnectStatus intent is null");
                    return;
                }
                String action = intent.getAction();
                LogUtil.a("HwMultiSimMgr", "onReceive deviceStatusReceiver:", action);
                if (action != null && action.equals("com.huawei.bone.action.CONNECTION_STATE_CHANGED")) {
                    try {
                        parcelableExtra = intent.getParcelableExtra("deviceinfo");
                    } catch (BadParcelableException unused) {
                        LogUtil.e("HwMultiSimMgr", "fuzzy badParcelable exception");
                        parcelableExtra = null;
                    }
                    if (parcelableExtra instanceof DeviceInfo) {
                        DeviceInfo deviceInfo = (DeviceInfo) parcelableExtra;
                        if (deviceInfo.getRelationship() != null && "followed_relationship".equals(deviceInfo.getRelationship())) {
                            LogUtil.a("HwMultiSimMgr", "This device does not have the correspond capability.");
                            xjt.q("This device does not have the correspond capability.");
                            return;
                        }
                        int deviceConnectState = deviceInfo.getDeviceConnectState();
                        ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "device Connect state ", Integer.valueOf(deviceConnectState));
                        if (deviceConnectState != 2) {
                            npz.this.w();
                        } else if (npz.this.l.hasMessages(4)) {
                            LogUtil.a("HwMultiSimMgr", "mHandler.hasMessages MULTI_SIM_WAIT_QUERY_CONN_TIMEOUT_MSG");
                            npz.this.l.removeMessages(4);
                            npz.this.s();
                        }
                        synchronized (npz.g) {
                            Iterator it = npz.this.o.iterator();
                            while (it.hasNext()) {
                                ((IBaseResponseCallback) it.next()).a(deviceConnectState, null);
                            }
                        }
                        return;
                    }
                    LogUtil.j("HwMultiSimMgr", "mConnectStatus() deviceInfo is null");
                    xjt.q("mConnectStatus() deviceInfo is null");
                    return;
                }
                LogUtil.j("HwMultiSimMgr", "action is null or unknown");
                xjt.q("action is null or unknown");
            }
        };
        this.l = new Handler(Looper.getMainLooper()) { // from class: npz.2
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
                LogUtil.a("HwMultiSimMgr", "message.what ", Integer.valueOf(message.what));
                switch (message.what) {
                    case 0:
                        npz.this.d(1, 100001, (Object) null);
                        npz.this.d(2, -1, (Object) null);
                        xjt.q("message.what = OEPN_SIM_TIMEOUT");
                        break;
                    case 1:
                        npz.this.d(2, -1, (Object) null);
                        xjt.q("message.what = OEPN_SIM_AUTH_TIMEOUT");
                        break;
                    case 2:
                        npz.this.d(3, 100001, (Object) null);
                        npz.this.a(-1);
                        xjt.q("message.what = ESIM_SEND_CODE_TIMEOUT");
                        break;
                    case 3:
                        npz.this.d(4, -1, (Object) null);
                        xjt.q("message.what = ESIM_SEND_CODE_AUTH_TIMEOUT");
                        break;
                    case 4:
                        npz.this.s();
                        xjt.q("message.what = MULTI_SIM_WAIT_QUERY_CONN_TIMEOUT_MSG");
                        break;
                    case 5:
                        npz.this.ad();
                        xjt.q("message.what = SIM_INFO_QUERY_TIMEOUT_MSG");
                        break;
                    case 6:
                        npz.this.d(6, -1, (Object) null);
                        xjt.q("message.what = DEVICE_INFO_QUERY_TIMEOUT_MSG");
                        break;
                    case 7:
                        npz.this.d(10, 100009, (Object) null);
                        xjt.q("message.what = BATTERY_THRESHOLD_QUERY_TIMEOUT_MSG");
                        break;
                    case 8:
                        npz.this.ag();
                        break;
                    case 9:
                        npz.this.d(5, -1, (Object) null);
                        xjt.q("message.what = ESIM_OPEN_RET_REPORT_TIMEOUT_MSG");
                        break;
                    case 10:
                        ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "enter delete esim profile time out");
                        npz.this.d(8, 100009, (Object) null);
                        xjt.q("message.what = DELETE_ESIM_PROFILE_TIMEOUT_MSG");
                        break;
                    default:
                        LogUtil.j("HwMultiSimMgr", "message.what ", Integer.valueOf(message.what));
                        break;
                }
            }
        };
        lvb lvbVarE = lvb.e();
        this.q = lvbVarE;
        if (lvbVarE == null) {
            LogUtil.j("HwMultiSimMgr", "mHwDeviceConfigManager is null");
            return;
        }
        lvbVarE.d(29, this);
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.n, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
        ab();
    }

    public static npz b() {
        npz npzVar;
        synchronized (e) {
            if (j == null) {
                j = new npz(BaseApplication.getContext());
            }
            npzVar = j;
        }
        return npzVar;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public void onDestroy() {
        LogUtil.a("HwMultiSimMgr", "onDestroy()");
        super.onDestroy();
        BaseApplication.getContext().unregisterReceiver(this.n);
        this.q.c(29);
        synchronized (v()) {
            i.clear();
        }
        synchronized (g) {
            this.o.clear();
        }
        synchronized (e) {
            j = null;
        }
        LogUtil.a("HwMultiSimMgr", "onDestroy() complete");
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 29;
    }

    private void ab() {
        LogUtil.a("HwMultiSimMgr", "initStorage");
        nqa nqaVar = new nqa();
        nqaVar.e(this);
        String strX = x();
        ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "initStorage updateStatus ", strX);
        if ("STATUSV1".equals(strX)) {
            LogUtil.j("HwMultiSimMgr", "initStorage already update");
            return;
        }
        nqc nqcVar = new nqc();
        List<String> listD = nqcVar.d(this, j());
        ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "initStorage appList", listD);
        if (listD != null && listD.size() > 0) {
            nqaVar.e(this, listD, d(), e());
        }
        nqcVar.b(this);
        e("STATUSV1");
    }

    public static String d() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        h = accountInfo;
        if (accountInfo == null) {
            h = "";
        }
        return h;
    }

    private String x() {
        return getSharedPreference("MULTISIM_STORAGE_STATUS_KEY");
    }

    private void e(String str) {
        setSharedPreference("MULTISIM_STORAGE_STATUS_KEY", str, new StorageParams(2));
    }

    private static Map<Integer, List<IBaseResponseCallback>> v() {
        return i;
    }

    private void b(int i2, IBaseResponseCallback iBaseResponseCallback) {
        synchronized (v()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> arrayList = i.get(Integer.valueOf(i2));
                if (arrayList == null) {
                    arrayList = new ArrayList<>(16);
                    i.put(Integer.valueOf(i2), arrayList);
                }
                arrayList.add(iBaseResponseCallback);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i2, int i3, Object obj) {
        LogUtil.a("HwMultiSimMgr", "processCallback callback");
        synchronized (v()) {
            List<IBaseResponseCallback> list = i.get(Integer.valueOf(i2));
            if (list != null) {
                int i4 = 0;
                while (list.size() > 0) {
                    IBaseResponseCallback iBaseResponseCallback = list.get(i4);
                    if (iBaseResponseCallback != null) {
                        iBaseResponseCallback.a(i3, obj);
                        list.remove(i4);
                        break;
                    } else {
                        list.remove(i4);
                        i4++;
                    }
                }
            }
        }
    }

    public void c(IAttachedDeviceMultiSimCallback iAttachedDeviceMultiSimCallback) {
        LogUtil.a("HwMultiSimMgr", "registerAttachedDeviceMultiSimCallback");
        if (iAttachedDeviceMultiSimCallback == null) {
            LogUtil.j("HwMultiSimMgr", "callback is null.");
            xjt.q("callback is null");
        } else {
            this.k = iAttachedDeviceMultiSimCallback;
        }
    }

    public void e(IAttachedDeviceMultiSimCallback iAttachedDeviceMultiSimCallback) {
        LogUtil.a("HwMultiSimMgr", "unregisterAttachedDeviceMultiSimCallback");
        if (iAttachedDeviceMultiSimCallback != this.k) {
            LogUtil.j("HwMultiSimMgr", "IAttachedDeviceMultiSimCallback not equal");
        }
        this.k = null;
    }

    public void d(com.huawei.multisimservice.model.IOpenMultiSimCalbcak iOpenMultiSimCalbcak) {
        LogUtil.a("HwMultiSimMgr", "registerOpenMultiSimCalbcak");
        if (iOpenMultiSimCalbcak == null) {
            LogUtil.j("HwMultiSimMgr", "callback is null.");
            xjt.q("callback is null.");
        } else {
            this.p = iOpenMultiSimCalbcak;
        }
    }

    public void b(com.huawei.multisimservice.model.IOpenMultiSimCalbcak iOpenMultiSimCalbcak) {
        LogUtil.a("HwMultiSimMgr", "unregisterOpenMultiSimCallback");
        if (iOpenMultiSimCalbcak != this.p) {
            LogUtil.j("HwMultiSimMgr", "mOpenMultiSimCallback not equal");
        }
        this.p = null;
    }

    public void a(IOpenMultiSimCalbcak iOpenMultiSimCalbcak) {
        LogUtil.a("HwMultiSimMgr", "registerCtccOpenMultiSimCallback");
        if (iOpenMultiSimCalbcak == null) {
            LogUtil.j("HwMultiSimMgr", "registerCtccOpenMultiSimCallback failed for callback is null.");
            xjt.q("callback is null.");
        } else {
            this.f = iOpenMultiSimCalbcak;
        }
    }

    public void r() {
        LogUtil.a("HwMultiSimMgr", "unregisterCtccOpenMultiSimCallback");
        this.f = null;
    }

    private void d(byte[] bArr, int i2) {
        LogUtil.a("HwMultiSimMgr", "processSetCmdResult Complete commandId", Integer.valueOf(i2));
        int iC = 201000;
        try {
            if (bArr[2] == 127) {
                iC = nqi.c(bArr);
                LogUtil.a("HwMultiSimMgr", "processSetCmdResult return errorCode:", Integer.valueOf(iC));
            }
        } catch (Exception e2) {
            LogUtil.e("HwMultiSimMgr", "processSetCmdResult Exception");
            xjt.q("processSetCmdResult Exception " + e2.getMessage());
        }
        LogUtil.a("HwMultiSimMgr", "processSetCmdResult return errorCode:", Integer.valueOf(iC));
    }

    private void e(byte[] bArr) {
        if (this.l.hasMessages(10)) {
            LogUtil.a("HwMultiSimMgr", "enter remove message");
            this.l.removeMessages(10);
        }
        try {
            if (bArr[2] == 127) {
                int iC = nqi.c(bArr);
                ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "processDeleteEimProfileCmdResult return errorCode:", Integer.valueOf(iC));
                d(8, iC, (Object) null);
                return;
            }
            d(8, 100001, (Object) null);
        } catch (Exception e2) {
            ReleaseLogUtil.a("DEVMGR_HwMultiSimMgr", "processOpenEsim Exception");
            xjt.q("processOpenEsim Exception : " + e2.getMessage());
            d(8, 100001, (Object) null);
        }
    }

    private void g(byte[] bArr) {
        LogUtil.a("HwMultiSimMgr", "processSimInfoQuery");
        MultiSimDeviceInfo multiSimDeviceInfo = new MultiSimDeviceInfo();
        char c2 = 34470;
        try {
            if (bArr[2] == 127) {
                LogUtil.a("HwMultiSimMgr", "processSimInfoQuery return errorCode:", Integer.valueOf(nqi.c(bArr)));
            } else {
                multiSimDeviceInfo = nqi.j(bArr);
                LogUtil.a("HwMultiSimMgr", "processSimInfoQuery simInfo");
                c2 = 34464;
            }
        } catch (Exception e2) {
            LogUtil.e("HwMultiSimMgr", "processSimInfoQuery Exception");
            xjt.q("processSimInfoQuery Exception : " + e2.getMessage());
        }
        if (multiSimDeviceInfo == null) {
            LogUtil.j("HwMultiSimMgr", "processSimInfoQuery multiSimDeviceInfo is null");
            return;
        }
        if (c2 == 34464) {
            multiSimDeviceInfo.setResultCode(1);
        } else {
            multiSimDeviceInfo.setResultCode(0);
        }
        if (nqi.d()) {
            d(6, 1, multiSimDeviceInfo);
            LogUtil.j("HwMultiSimMgr", "processSimInfoQuery isPowerDownStatus need retry");
        } else {
            d(6, 0, multiSimDeviceInfo);
        }
    }

    private void h(byte[] bArr) {
        int i2;
        LogUtil.a("HwMultiSimMgr", "procRemoveProfileRet");
        int iE = 1;
        try {
            if (bArr[2] == 127) {
                LogUtil.a("HwMultiSimMgr", "procRemoveProfileRet errorCode:", Integer.valueOf(nqi.c(bArr)));
                i2 = 100006;
            } else {
                iE = nqi.e(bArr);
                i2 = 100000;
            }
        } catch (Exception e2) {
            LogUtil.e("HwMultiSimMgr", "processRemoveReportRet Exception");
            xjt.q("processRemoveReportRet Exception : " + e2.getMessage());
        }
        ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "procRemoveProfileRet errorCode:", Integer.valueOf(i2), "defaultProfileResult:", Integer.valueOf(iE));
        nqf.d(9, i2);
        IAttachedDeviceMultiSimCallback iAttachedDeviceMultiSimCallback = this.k;
        if (iAttachedDeviceMultiSimCallback != null) {
            try {
                iAttachedDeviceMultiSimCallback.deleteESimProfileNotify(iE);
            } catch (RemoteException e3) {
                LogUtil.e("HwMultiSimMgr", "processRemoveReportRet exception");
                xjt.q("processRemoveReportRet exception : " + e3.getMessage());
            }
        }
    }

    private void b(byte[] bArr) {
        int iC;
        LogUtil.a("HwMultiSimMgr", "processBatteryThresholdQuery");
        try {
            iC = bArr[2] == 127 ? nqi.c(bArr) : 201000;
            LogUtil.a("HwMultiSimMgr", "processBatteryThresholdQuery return errorCode:", Integer.valueOf(iC));
        } catch (Exception e2) {
            LogUtil.e("HwMultiSimMgr", "processBatteryThresholdQuery Exception");
            xjt.q("processBatteryThresholdQuery Exception : " + e2.getMessage());
            iC = 100006;
        }
        if (iC == 129001 || iC == 0) {
            d(10, iC, Integer.valueOf(nqi.b(bArr)));
        } else {
            d(10, iC, (Object) null);
        }
    }

    public void a(String str) {
        LogUtil.a("HwMultiSimMgr", "downloadEsimProfile save acCode: ", str);
        if (m() && !Utils.o()) {
            a(str, String.valueOf(System.currentTimeMillis()));
        }
        a(str, 1, new IBaseResponseCallback() { // from class: npz.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "downloadEsimProfile first errorCode = ", Integer.valueOf(i2), " objectData:", obj);
                try {
                    if (!npz.this.m.equals("com.ct.client")) {
                        if (npz.this.k != null) {
                            ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "mAttachedDeviceMultiSimCallback != null");
                            npz.this.k.downloadESimProfile(i2, null);
                            return;
                        }
                        return;
                    }
                    ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "Ctcc is opening esim");
                } catch (RemoteException e2) {
                    LogUtil.e("HwMultiSimMgr", "downloadEsimProfile exception");
                    xjt.q("downloadEsimProfile exception : " + e2.getMessage());
                }
            }
        }, new IBaseResponseCallback() { // from class: npz.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "downloadEsimProfile second errorCode = ", Integer.valueOf(i2));
                npz.this.c(i2);
                if (i2 == 0) {
                    npz.this.d(true);
                    pxi.c("true", "unabled_entry", String.valueOf(i2), pxi.e(npz.this.m), "online_APP_start", "one_number_multisim");
                    if (npz.this.m() && !Utils.o()) {
                        npz.this.a("", "0");
                    }
                } else {
                    npz.this.d(false);
                    pxi.c("false", "unabled_entry", String.valueOf(i2), pxi.e(npz.this.m), "online_APP_start", "one_number_multisim");
                }
                try {
                    if (npz.this.m.equals("com.ct.client")) {
                        if (npz.this.f != null) {
                            npz.this.f.getProfileDownloadStatus(npz.this.d(i2));
                        } else {
                            ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "ctccOpenMultiSimCallback is null");
                        }
                    }
                } catch (RemoteException e2) {
                    LogUtil.e("HwMultiSimMgr", "downloadEsimProfile exception");
                    xjt.q("downloadEsimProfile exception : " + e2.getMessage());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i2) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(16);
        linkedHashMap.put("status", String.valueOf(i2));
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_ESIM_MANAGER_60010003.value(), linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MultiSimDeviceInfo multiSimDeviceInfo) {
        if (multiSimDeviceInfo == null) {
            LogUtil.j("HwMultiSimMgr", "inpurt deviceInfo is null");
            return;
        }
        try {
            if (this.m.equals("com.ct.client") && this.f != null) {
                ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "mCurCallingApp is", this.m);
                d(b(multiSimDeviceInfo, 1, (oek) null), multiSimDeviceInfo, e(multiSimDeviceInfo));
                return;
            }
            IAttachedDeviceMultiSimCallback iAttachedDeviceMultiSimCallback = this.k;
            if (iAttachedDeviceMultiSimCallback != null) {
                iAttachedDeviceMultiSimCallback.getAttachedDeviceMultiSimInfo(multiSimDeviceInfo);
                return;
            }
            if (this.p != null) {
                if (!this.m.equals("com.sinovatech.unicom.ui") && !this.m.equals("com.cmic.heduohao")) {
                    this.p.getDeviceMultiSimInfo(multiSimDeviceInfo);
                    return;
                }
                d(b(multiSimDeviceInfo, 1, (oek) null), multiSimDeviceInfo, (com.chinatelecom.multisimservice.model.MultiSimDeviceInfo) null);
                return;
            }
            LogUtil.j("HwMultiSimMgr", "callback is null");
        } catch (RemoteException unused) {
            ReleaseLogUtil.a("DEVMGR_HwMultiSimMgr", "reportDeviceInfo exception");
        }
    }

    public boolean d(MultiSimDeviceInfo multiSimDeviceInfo) {
        if (multiSimDeviceInfo != null && !TextUtils.isEmpty(multiSimDeviceInfo.getEID()) && !TextUtils.isEmpty(multiSimDeviceInfo.getDeviceIMEI())) {
            return false;
        }
        LogUtil.a("HwMultiSimMgr", " setEsimDeviceInfoPostCallBack : deviceInfo invalidation.");
        xjt.q("setEsimDeviceInfoPostCallBack fail: deviceInfo invalidation.");
        return true;
    }

    private void d(final EUICCDeviceInfo eUICCDeviceInfo, final MultiSimDeviceInfo multiSimDeviceInfo, final com.chinatelecom.multisimservice.model.MultiSimDeviceInfo multiSimDeviceInfo2) {
        if (d(multiSimDeviceInfo)) {
            a(eUICCDeviceInfo, multiSimDeviceInfo, multiSimDeviceInfo2);
        } else {
            oef.a(eUICCDeviceInfo, new ResultCallback<String>() { // from class: npz.9
                @Override // com.huawei.networkclient.ResultCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(String str) {
                    if (TextUtils.isEmpty(str)) {
                        LogUtil.a("HwMultiSimMgr", "resp is empty.");
                        xjt.q("resp is empty.");
                        npz.this.a(eUICCDeviceInfo, multiSimDeviceInfo, multiSimDeviceInfo2);
                        return;
                    }
                    LogUtil.a("HwMultiSimMgr", "resp = " + str);
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        int i2 = jSONObject.getInt("resultCode");
                        ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "resultCode = ", Integer.valueOf(i2), "mCurCallingApp = ", npz.this.m);
                        if (i2 == 0) {
                            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("encESimDeviceInfo"));
                            if (!npz.this.m.equals("com.sinovatech.unicom.ui")) {
                                if (!npz.this.m.equals("com.cmic.heduohao")) {
                                    if (npz.this.m.equals("com.ct.client")) {
                                        multiSimDeviceInfo2.setCiphertext(jSONObject2.optString("ciphertext"));
                                        multiSimDeviceInfo2.setCiphertextSign(jSONObject2.optString("ciphertextSign"));
                                    }
                                } else {
                                    multiSimDeviceInfo.setDeviceIMEI(jSONObject2.optString("deviceImei"));
                                    multiSimDeviceInfo.setEID(jSONObject2.optString("eid"));
                                    multiSimDeviceInfo.setApiVersion(jSONObject2.optString("apiVersion"));
                                    multiSimDeviceInfo.setTechVersion(jSONObject2.optString("techVersion"));
                                    multiSimDeviceInfo.setSign(jSONObject2.optString("ciphertextSign"));
                                    multiSimDeviceInfo.setTime(jSONObject2.optLong("timestamp"));
                                }
                            } else {
                                String strOptString = jSONObject2.optString("ciphertext");
                                String strOptString2 = jSONObject2.optString("ciphertextSign");
                                eUICCDeviceInfo.setmCiphertext(strOptString);
                                eUICCDeviceInfo.setmCiphertextSign(strOptString2);
                            }
                        }
                        npz.this.a(eUICCDeviceInfo, multiSimDeviceInfo, multiSimDeviceInfo2);
                    } catch (JSONException e2) {
                        ReleaseLogUtil.a("DEVMGR_HwMultiSimMgr", "getEsimDeviceInfoPost,JSONException", ExceptionUtils.c(e2));
                        npz.this.a(eUICCDeviceInfo, multiSimDeviceInfo, multiSimDeviceInfo2);
                    }
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    LogUtil.j("HwMultiSimMgr", " getESimDeviceInfoPost :", ExceptionUtils.c(th));
                    xjt.q("getESimDeviceInfoPost fail:" + ExceptionUtils.c(th));
                    npz.this.a(eUICCDeviceInfo, multiSimDeviceInfo, multiSimDeviceInfo2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(EUICCDeviceInfo eUICCDeviceInfo, MultiSimDeviceInfo multiSimDeviceInfo, com.chinatelecom.multisimservice.model.MultiSimDeviceInfo multiSimDeviceInfo2) {
        try {
            if (this.m.equals("com.sinovatech.unicom.ui")) {
                com.huawei.multisimservice.model.IOpenMultiSimCalbcak iOpenMultiSimCalbcak = this.p;
                if (iOpenMultiSimCalbcak == null) {
                    ReleaseLogUtil.e("DEVMGR_HwMultiSimMgr", "mOpenMultiSimCallback is null.");
                    xjt.q("mOpenMultiSimCallback is null.");
                    return;
                } else {
                    iOpenMultiSimCalbcak.getDeviceEUICCInfo(eUICCDeviceInfo);
                    return;
                }
            }
            if (this.m.equals("com.cmic.heduohao")) {
                com.huawei.multisimservice.model.IOpenMultiSimCalbcak iOpenMultiSimCalbcak2 = this.p;
                if (iOpenMultiSimCalbcak2 == null) {
                    ReleaseLogUtil.e("DEVMGR_HwMultiSimMgr", "mOpenMultiSimCallback is null.");
                    xjt.q("mOpenMultiSimCallback is null.");
                    return;
                } else {
                    iOpenMultiSimCalbcak2.getDeviceMultiSimInfo(multiSimDeviceInfo);
                    return;
                }
            }
            if (this.m.equals("com.ct.client")) {
                IOpenMultiSimCalbcak iOpenMultiSimCalbcak3 = this.f;
                if (iOpenMultiSimCalbcak3 == null) {
                    ReleaseLogUtil.e("DEVMGR_HwMultiSimMgr", "ctccOpenMultiSimCallback is null.");
                    xjt.q("ctccOpenMultiSimCallback is null.");
                } else {
                    iOpenMultiSimCalbcak3.getDeviceMultiSimInfo(multiSimDeviceInfo2);
                }
            }
        } catch (RemoteException e2) {
            ReleaseLogUtil.a("DEVMGR_HwMultiSimMgr", "getEsimDeviceInfoPost exception");
            xjt.q("getEsimDeviceInfoPost exception." + e2.getMessage());
        }
    }

    public void c(String str, long j2, String str2) {
        oei oeiVarD = d(str, j2, str2);
        LogUtil.a("HwMultiSimMgr", "euiccDownloadSimProfile = ", oeiVarD);
        oef.a(oeiVarD, new ResultCallback<String>() { // from class: npz.10
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str3) {
                if (TextUtils.isEmpty(str3)) {
                    LogUtil.a("HwMultiSimMgr", "onSuccess:", "respProfileInfo is empty.");
                    xjt.q("respProfileInfo is empty.");
                    npz.this.ac();
                    return;
                }
                LogUtil.a("HwMultiSimMgr", "onSuccess:", "respProfileInfo = " + str3);
                try {
                    JSONObject jSONObject = new JSONObject(str3);
                    int i2 = jSONObject.getInt("resultCode");
                    ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "resultCode= ", Integer.valueOf(i2));
                    if (i2 != 0) {
                        npz.this.ac();
                    } else {
                        npz.this.a(new JSONObject(jSONObject.getString("eSimProfileInfo")).getString("decActivationCode"));
                    }
                } catch (JSONException e2) {
                    LogUtil.e("HwMultiSimMgr", LogAnonymous.b(e2));
                    npz.this.ac();
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.j("HwMultiSimMgr", " getESimProfilePost :", ExceptionUtils.c(th));
                xjt.q("getESimProfilePost fail." + ExceptionUtils.c(th));
                npz.this.ac();
            }
        });
    }

    private oei d(String str, long j2, String str2) {
        oei oeiVar = new oei();
        if (this.m.equals("com.sinovatech.unicom.ui")) {
            b(str, oeiVar);
            oeiVar.b(2);
            return oeiVar;
        }
        if (this.m.equals("com.ct.client")) {
            b(str, oeiVar);
            oeiVar.b(3);
            return oeiVar;
        }
        if (this.m.equals("com.cmic.heduohao")) {
            oeiVar.b(1);
            oeiVar.b(str);
            oeiVar.b(j2);
            oeiVar.e(str2);
        }
        return oeiVar;
    }

    private void b(String str, oei oeiVar) {
        oeiVar.b(System.currentTimeMillis());
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("mCiphertext");
            String strOptString2 = jSONObject.optString("mCiphertextSign");
            oeiVar.c(strOptString);
            oeiVar.e(strOptString2);
        } catch (JSONException e2) {
            ReleaseLogUtil.a("DEVMGR_HwMultiSimMgr", "getEncryptEsimProfileInfo exception:", LogAnonymous.b(e2));
        }
    }

    public EUICCDeviceInfo b(MultiSimDeviceInfo multiSimDeviceInfo, int i2, oek oekVar) {
        EUICCDeviceInfo eUICCDeviceInfo = new EUICCDeviceInfo();
        LogUtil.a("HwMultiSimMgr", "mCurCallingApp = ", this.m);
        if (this.m.equals("com.sinovatech.unicom.ui")) {
            eUICCDeviceInfo.setCarrierType(2);
            eUICCDeviceInfo.setmOsVersion(z());
            eUICCDeviceInfo.setmAidlVersion("1.0");
            if (i2 == 2) {
                eUICCDeviceInfo.setActiveType(i2);
                eUICCDeviceInfo.setEsDevInfo(oekVar);
            }
        } else if (this.m.equals("com.cmic.heduohao")) {
            eUICCDeviceInfo.setCarrierType(1);
            eUICCDeviceInfo.setmOsVersion("12");
            eUICCDeviceInfo.setmAidlVersion("107");
        } else if (this.m.equals("com.ct.client")) {
            eUICCDeviceInfo.setSupportEuiccBinding(y());
            eUICCDeviceInfo.setmAidlVersion("1.0");
            eUICCDeviceInfo.setCarrierType(3);
            eUICCDeviceInfo.setActiveType(1);
        }
        eUICCDeviceInfo.setResultCode(multiSimDeviceInfo.getResultCode());
        eUICCDeviceInfo.setDeviceType(multiSimDeviceInfo.getDeviceType());
        eUICCDeviceInfo.setDeviceIMEI(multiSimDeviceInfo.getDeviceIMEI());
        eUICCDeviceInfo.setDeviceSerialNumber(multiSimDeviceInfo.getDeviceSerialNumber());
        eUICCDeviceInfo.setProductName(multiSimDeviceInfo.getProductName());
        eUICCDeviceInfo.setEID(multiSimDeviceInfo.getEID());
        eUICCDeviceInfo.setTimeTemp(System.currentTimeMillis());
        List<EUICCInfo> listC = c(multiSimDeviceInfo.getSimInfoList());
        if (!listC.isEmpty()) {
            eUICCDeviceInfo.setIMSI(listC.get(0).getIMSI());
            eUICCDeviceInfo.setICCID(listC.get(0).getICCID());
        }
        LogUtil.a("HwMultiSimMgr", "euiccDeviceInfo = ", eUICCDeviceInfo);
        return eUICCDeviceInfo;
    }

    private com.chinatelecom.multisimservice.model.MultiSimDeviceInfo e(MultiSimDeviceInfo multiSimDeviceInfo) {
        com.chinatelecom.multisimservice.model.MultiSimDeviceInfo multiSimDeviceInfo2 = new com.chinatelecom.multisimservice.model.MultiSimDeviceInfo();
        multiSimDeviceInfo2.setResultCode(multiSimDeviceInfo.getResultCode());
        multiSimDeviceInfo2.setDeviceType(multiSimDeviceInfo.getDeviceType());
        return multiSimDeviceInfo2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        IOpenMultiSimCalbcak iOpenMultiSimCalbcak;
        ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "processOpenMultiSimFailed enter");
        if (!this.m.equals("com.ct.client") || (iOpenMultiSimCalbcak = this.f) == null) {
            return;
        }
        try {
            iOpenMultiSimCalbcak.getProfileDownloadStatus(0);
        } catch (RemoteException unused) {
            LogUtil.e("HwMultiSimMgr", "CTCCOpenMultiSimFailed for exception");
        }
    }

    private String z() {
        boolean zU = u();
        ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "isSupportBindCard = ", Boolean.valueOf(zU));
        if (zU) {
            return "10";
        }
        return "0";
    }

    private String y() {
        boolean zU = u();
        ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "isSupportBindCard = ", Boolean.valueOf(zU));
        if (zU) {
            return "true";
        }
        return "false";
    }

    private boolean u() {
        boolean zD = eey.d(mgg.c("HwMultiSimMgr"), a.M);
        ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "isSupportBindCard = ", Boolean.valueOf(zD));
        return zD;
    }

    private List<EUICCInfo> c(List<SimInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null || list.isEmpty()) {
            LogUtil.a("HwMultiSimMgr", "simInfoList is empty");
            return arrayList;
        }
        for (SimInfo simInfo : list) {
            EUICCInfo eUICCInfo = new EUICCInfo();
            eUICCInfo.setIMSI(simInfo.getIMSI());
            eUICCInfo.setICCID(simInfo.getICCID());
            arrayList.add(eUICCInfo);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i2) {
        MultiSimDeviceInfo multiSimDeviceInfo = new MultiSimDeviceInfo();
        multiSimDeviceInfo.setResultCode(i2);
        b(multiSimDeviceInfo);
    }

    public void p() {
        LogUtil.a("HwMultiSimMgr", "simInfoQuery");
        if (!k()) {
            this.l.sendEmptyMessageDelayed(4, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
            ReleaseLogUtil.e("DEVMGR_HwMultiSimMgr", "simInfoQuery device not connect wait");
            xjt.q("simInfoQuery device not connect wait.");
            return;
        }
        s();
    }

    public void s() {
        LogUtil.a("HwMultiSimMgr", "simInfoQueryFromDev");
        if (!k()) {
            ReleaseLogUtil.e("DEVMGR_HwMultiSimMgr", "simInfoQuery device not connect report not connect");
            e(-2);
            return;
        }
        if (!o()) {
            ReleaseLogUtil.e("DEVMGR_HwMultiSimMgr", "simInfoQuery device not support multisim");
            e(-3);
            return;
        }
        if (TextUtils.isEmpty(this.m)) {
            ReleaseLogUtil.e("DEVMGR_HwMultiSimMgr", "mCurCallingApp is empty");
            e(0);
        } else if (!this.m.equals("com.huawei.hwmultisim") && !c(this.m)) {
            ReleaseLogUtil.e("DEVMGR_HwMultiSimMgr", "simInfoQueryFromDev app not auth");
            this.l.sendEmptyMessage(8);
        } else {
            this.l.sendEmptyMessageDelayed(5, 30000L);
            j(new IBaseResponseCallback() { // from class: npz.8
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    if (npz.this.l.hasMessages(5)) {
                        npz.this.l.removeMessages(5);
                    }
                    if (i2 != 0) {
                        npz.this.e(0);
                    } else if (obj == null || !(obj instanceof MultiSimDeviceInfo)) {
                        npz.this.e(0);
                    } else {
                        npz.this.b((MultiSimDeviceInfo) obj);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ad() {
        if (!k()) {
            ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "simInfoQueryTimeout device not connect report not connect");
            e(-2);
        } else {
            ReleaseLogUtil.e("DEVMGR_HwMultiSimMgr", "simInfoQueryTimeout device timeout unknown error");
            e(0);
        }
    }

    private void f(final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwMultiSimMgr", "getLocalDeviceInfo");
        j(new IBaseResponseCallback() { // from class: npz.7
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "getLocalDeviceInfo onResponse errCode", Integer.valueOf(i2));
                if (npz.this.l.hasMessages(6)) {
                    npz.this.l.removeMessages(6);
                }
                iBaseResponseCallback.a(i2, obj);
            }
        });
    }

    private void g(final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwMultiSimMgr", "getLocalBatteryThreshold");
        i(new IBaseResponseCallback() { // from class: npz.6
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "getLocalBatteryThreshold onResponse errCode", Integer.valueOf(i2));
                iBaseResponseCallback.a(i2, obj);
                if (npz.this.l.hasMessages(7)) {
                    npz.this.l.removeMessages(7);
                }
            }
        });
    }

    private void j(IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("HwMultiSimMgr", "sendSimInfoQueryCmd");
        this.l.sendEmptyMessageDelayed(6, 30000L);
        b(6, iBaseResponseCallback);
        nqf.e();
    }

    private void i(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwMultiSimMgr", "sendgetBatteryThresholdQueryCmd");
        this.l.sendEmptyMessageDelayed(7, 30000L);
        b(10, iBaseResponseCallback);
        nqf.d();
    }

    public void d(List<SimInfo> list) {
        LogUtil.a("HwMultiSimMgr", "removeEsimProfile");
        nqf.d(list);
    }

    public void a(List<SimInfo> list, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwMultiSimMgr", "removeEsimProfile");
        this.l.sendEmptyMessageDelayed(10, 30000L);
        b(8, iBaseResponseCallback);
        nqf.d(list);
    }

    public void d(int i2, String str) {
        LogUtil.a("HwMultiSimMgr", "simStatusNotify");
        nqf.d(i2, str);
    }

    public boolean c(String str) {
        LogUtil.a("HwMultiSimMgr", "getAppAuthStatus :", str);
        return new nqa().a(this, str, d(), e());
    }

    public void b(boolean z) {
        LogUtil.a("HwMultiSimMgr", "setAppAuthStatus");
        nqa nqaVar = new nqa();
        if (z) {
            nqaVar.b(this, this.m, d(), e());
            p();
        } else {
            e(-1);
        }
    }

    public void b(String str) {
        this.m = str;
    }

    public String g() {
        return this.m;
    }

    public boolean i() {
        return this.r;
    }

    public void d(boolean z) {
        this.r = z;
    }

    public boolean k() {
        boolean z;
        DeviceInfo deviceInfoC = mgg.c("HwMultiSimMgr");
        LogUtil.a("HwMultiSimMgr", "isDeviceConnect");
        if (deviceInfoC == null || deviceInfoC.getDeviceConnectState() != 2) {
            z = false;
        } else {
            LogUtil.a("HwMultiSimMgr", "getAttachedDeviceMultiSimInfo deviceInfo is connect");
            z = true;
        }
        ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "isDeviceConnect : ", Boolean.valueOf(z));
        return z;
    }

    public boolean l() {
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC == null) {
            LogUtil.j("HwMultiSimMgr", "isSupportEsim deviceCapability is null");
            return false;
        }
        if (!deviceCapabilityC.isSupportEsim()) {
            return false;
        }
        LogUtil.a("HwMultiSimMgr", "device support esim");
        return true;
    }

    public boolean m() {
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC == null) {
            LogUtil.j("HwMultiSimMgr", "isSupportNewEsim deviceCapability is null");
            return false;
        }
        if (!deviceCapabilityC.isSupportNewEsim()) {
            return false;
        }
        LogUtil.a("HwMultiSimMgr", "device support esim new ui");
        return true;
    }

    public boolean o() {
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC == null) {
            LogUtil.j("HwMultiSimMgr", "isSupportMultiSim deviceCapability is null");
            return false;
        }
        if (!deviceCapabilityC.isSupportMultiSim()) {
            return false;
        }
        LogUtil.a("HwMultiSimMgr", "device support multiSim");
        return true;
    }

    public String j() {
        DeviceInfo deviceInfoC = mgg.c("HwMultiSimMgr");
        if (deviceInfoC != null) {
            return deviceInfoC.getSecurityDeviceId();
        }
        return "";
    }

    public String e() {
        DeviceInfo deviceInfoC = mgg.c("HwMultiSimMgr");
        if (deviceInfoC != null) {
            return deviceInfoC.getUuid();
        }
        return "";
    }

    public void d(String str, IBaseResponseCallback iBaseResponseCallback, IBaseResponseCallback iBaseResponseCallback2) {
        LogUtil.a("HwMultiSimMgr", "Now it is openEsimWithoutConfirm Esim", str);
        b(1, iBaseResponseCallback);
        b(5, iBaseResponseCallback2);
        nqf.a(str, 1);
        this.l.sendEmptyMessageDelayed(0, 45000L);
    }

    public void e(String str, IBaseResponseCallback iBaseResponseCallback, IBaseResponseCallback iBaseResponseCallback2) {
        LogUtil.a("HwMultiSimMgr", "Now it is openning Esim", str);
        b(1, iBaseResponseCallback);
        b(2, iBaseResponseCallback2);
        nqf.a(str, 0);
        this.l.sendEmptyMessageDelayed(0, 45000L);
    }

    public void a(String str, int i2, IBaseResponseCallback iBaseResponseCallback, IBaseResponseCallback iBaseResponseCallback2) {
        LogUtil.a("HwMultiSimMgr", "Now it is openning Esim", str);
        b(1, iBaseResponseCallback);
        if (m()) {
            b(5, iBaseResponseCallback2);
        } else {
            b(2, iBaseResponseCallback2);
        }
        nqf.a(str, i2);
        this.l.sendEmptyMessageDelayed(0, 45000L);
    }

    public void b(IBaseResponseCallback iBaseResponseCallback) {
        synchronized (g) {
            if (iBaseResponseCallback != null) {
                this.o.add(iBaseResponseCallback);
            }
        }
    }

    public void h(IBaseResponseCallback iBaseResponseCallback) {
        synchronized (v()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = i.get(2);
                if (list != null) {
                    list.remove(iBaseResponseCallback);
                }
            }
        }
    }

    public void a(IBaseResponseCallback iBaseResponseCallback) {
        synchronized (g) {
            if (iBaseResponseCallback != null) {
                this.o.remove(iBaseResponseCallback);
            }
        }
    }

    private void i(byte[] bArr) {
        LogUtil.a("HwMultiSimMgr", "processMateDataAuth");
        this.l.removeMessages(1);
        try {
            lsd lsdVarD = nqi.d(bArr);
            LogUtil.a("HwMultiSimMgr", "processMateDataAuth :", Integer.valueOf(lsdVarD.c()));
            if (lsdVarD.c() == 0) {
                d(2, 0, lsdVarD);
                nqf.e(2, true);
                return;
            }
            d(2, lsdVarD.c(), (Object) null);
            if (lsdVarD.c() == -1) {
                nqf.e(2, false);
            } else {
                nqf.e(2, true);
            }
        } catch (Exception e2) {
            ReleaseLogUtil.a("DEVMGR_HwMultiSimMgr", "processMateDataAuth Exception");
            xjt.q("processMateDataAuth Exception : " + e2.getMessage());
            d(2, -1, (Object) null);
            nqf.e(2, false);
        }
    }

    private void j(byte[] bArr) {
        LogUtil.a("HwMultiSimMgr", "processOpenEsim");
        this.l.removeMessages(0);
        try {
            if (bArr[2] == 127) {
                int iC = nqi.c(bArr);
                ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "processOpenEsim return errorCode:", Integer.valueOf(iC));
                d(1, iC, (Object) null);
                if (iC == 0) {
                    this.l.sendEmptyMessageDelayed(1, 150000L);
                    return;
                } else if (iC == 100005) {
                    d(2, 1000, (Object) null);
                    return;
                } else {
                    d(2, -1, (Object) null);
                    return;
                }
            }
            d(1, 100001, (Object) null);
            d(2, -1, (Object) null);
        } catch (Exception e2) {
            ReleaseLogUtil.a("DEVMGR_HwMultiSimMgr", "processOpenEsim Exception");
            xjt.q("processOpenEsim Exception : " + e2.getMessage());
            d(1, 100001, (Object) null);
            d(2, -1, (Object) null);
        }
    }

    private void a(byte[] bArr) {
        LogUtil.a("HwMultiSimMgr", "processConformCode");
        this.l.removeMessages(2);
        try {
            if (bArr[2] == 127) {
                int iC = nqi.c(bArr);
                ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "procRemoveProfileRet return errorCode:", Integer.valueOf(iC));
                d(3, iC, (Object) null);
                if (iC == 0) {
                    aa();
                    return;
                } else if (iC == 100005) {
                    a(1000);
                    return;
                } else {
                    a(-1);
                    return;
                }
            }
            d(3, 100001, (Object) null);
            a(-1);
        } catch (Exception e2) {
            ReleaseLogUtil.a("DEVMGR_HwMultiSimMgr", "processConformCode Exception");
            xjt.q("processConformCode Exception : " + e2.getMessage());
            d(3, 100001, (Object) null);
            a(-1);
        }
    }

    private void aa() {
        if (m()) {
            this.l.sendEmptyMessageDelayed(9, 150000L);
        } else {
            this.l.sendEmptyMessageDelayed(3, 150000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2) {
        if (m()) {
            d(5, i2, (Object) null);
        } else {
            d(4, i2, (Object) null);
        }
    }

    private void d(byte[] bArr) {
        LogUtil.a("HwMultiSimMgr", "processConformCodeAuth");
        this.l.removeMessages(3);
        try {
            int iA = nqi.a(bArr);
            ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "procRemoveProfileRet return errorCode:", Integer.valueOf(iA));
            d(4, iA, (Object) null);
            if (iA == -1) {
                nqf.e(4, false);
            } else {
                nqf.e(4, true);
            }
        } catch (Exception e2) {
            ReleaseLogUtil.a("DEVMGR_HwMultiSimMgr", "Exception");
            xjt.q("getConformCodeAuthRet Exception : " + e2.getMessage());
            d(4, -1, (Object) null);
            nqf.e(4, false);
        }
    }

    private void c(byte[] bArr) {
        LogUtil.a("HwMultiSimMgr", "processEsimOpenRetReport");
        this.l.removeMessages(9);
        try {
            int iA = nqi.a(bArr);
            d(5, iA, (Object) null);
            ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "processEsimOpenRetReport return result:", Integer.valueOf(iA));
        } catch (Exception e2) {
            d(5, -1, (Object) null);
            ReleaseLogUtil.a("DEVMGR_HwMultiSimMgr", "Exception");
            xjt.q("processEsimOpenRetReport Exception : " + e2.getMessage());
        }
    }

    public int c() {
        DeviceInfo deviceInfoC = mgg.c("HwMultiSimMgr");
        if (deviceInfoC == null) {
            LogUtil.j("HwMultiSimMgr", "syncFitnessTodayData get device info error");
            return 3;
        }
        return deviceInfoC.getDeviceConnectState();
    }

    public void b(String str, int i2, IBaseResponseCallback iBaseResponseCallback, IBaseResponseCallback iBaseResponseCallback2) {
        b(3, iBaseResponseCallback);
        if (m()) {
            b(5, iBaseResponseCallback2);
        } else {
            b(4, iBaseResponseCallback2);
        }
        nqf.c(str, i2);
        this.l.sendEmptyMessageDelayed(2, 45000L);
    }

    public String f() {
        DeviceInfo deviceInfoC = mgg.c("HwMultiSimMgr");
        if (deviceInfoC != null && deviceInfoC.getDeviceConnectState() == 2) {
            return deviceInfoC.getDeviceName();
        }
        return "";
    }

    public void e(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwMultiSimMgr", "enter getMultiSimDevicInfo()");
        f(iBaseResponseCallback);
    }

    public oeh h() {
        return this.f43434c;
    }

    public void c(MultiSimDeviceInfo multiSimDeviceInfo) {
        if (multiSimDeviceInfo == null) {
            LogUtil.e("HwMultiSimMgr", "setMultiSimDeviceInfo is null");
            return;
        }
        this.f43434c.d = multiSimDeviceInfo;
        List<SimInfo> simInfoList = multiSimDeviceInfo.getSimInfoList();
        if (simInfoList.size() == 1) {
            this.f43434c.e = true;
            this.f43434c.f44234c = simInfoList.get(0);
            this.f43434c.f44233b = simInfoList.get(0).getIMSI();
            return;
        }
        this.f43434c.e = false;
        this.f43434c.f44234c = null;
        this.f43434c.f44233b = null;
    }

    public void d(final Handler handler) {
        if (handler == null) {
            LogUtil.e("HwMultiSimMgr", "refreshDeviceEsimInfo handler is null");
            return;
        }
        LogUtil.a("HwMultiSimMgr", "queryEsimStatusFromDevice");
        if (handler.hasMessages(100006)) {
            handler.removeMessages(100006);
        }
        b().e(new IBaseResponseCallback() { // from class: nqb
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                this.e.a(handler, i2, obj);
            }
        });
    }

    /* synthetic */ void a(Handler handler, int i2, Object obj) {
        LogUtil.a("HwMultiSimMgr", "getEsimCardStatus onResponse errorCode = ", Integer.valueOf(i2));
        pxk.a(i2, false);
        if (i2 == 0 && (obj instanceof MultiSimDeviceInfo)) {
            this.f43434c.d = (MultiSimDeviceInfo) obj;
            b(handler);
            return;
        }
        handler.sendEmptyMessage(33005);
    }

    private void b(Handler handler) {
        MultiSimDeviceInfo multiSimDeviceInfo = this.f43434c.d;
        if (multiSimDeviceInfo != null && !TextUtils.isEmpty(multiSimDeviceInfo.getEID())) {
            List<SimInfo> simInfoList = multiSimDeviceInfo.getSimInfoList();
            if (simInfoList == null || simInfoList.isEmpty()) {
                LogUtil.a("HwMultiSimMgr", "getEsimCardStatus no profile found");
                this.f43434c.e = false;
                this.f43434c.f44234c = null;
                this.f43434c.f44233b = null;
                handler.sendEmptyMessage(33003);
                return;
            }
            if (simInfoList.size() == 1) {
                this.f43434c.e = true;
                this.f43434c.f44234c = simInfoList.get(0);
                this.f43434c.f44233b = simInfoList.get(0).getIMSI();
                a(handler);
                return;
            }
            this.f43434c.e = false;
            this.f43434c.f44234c = null;
            this.f43434c.f44233b = null;
            handler.sendEmptyMessage(33006);
            LogUtil.j("HwMultiSimMgr", "There are multiple profile files.");
            xjt.q("There are multiple profile files.");
            return;
        }
        int i2 = this.d;
        if (i2 < 2) {
            this.d = i2 + 1;
            LogUtil.a("HwMultiSimMgr", "retry get device esim status");
            handler.sendEmptyMessageDelayed(33002, 1000L);
        } else {
            this.d = 0;
            handler.sendEmptyMessage(33005);
            xjt.q("MSG_GET_CARD_STATUS_FAIL.");
        }
    }

    private void a(final Handler handler) {
        LogUtil.a("HwMultiSimMgr", " getCardType ");
        DeviceInfo deviceInfoC = mgg.c("HwMultiSimMgr");
        boolean zD = eey.d(deviceInfoC, 148);
        ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "processDeviceInfo isSupportStandaloneNum = ", Boolean.valueOf(zD));
        if (!zD) {
            this.f43434c.f44232a = 1;
            pxk.d = "ShareNumber";
            handler.sendEmptyMessage(33004);
        } else {
            handler.sendEmptyMessageDelayed(33004, 10000L);
            b().b(deviceInfoC, new IBaseResponseCallback() { // from class: nqd
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.f43445c.e(handler, i2, obj);
                }
            });
        }
    }

    /* synthetic */ void e(Handler handler, int i2, Object obj) {
        handler.removeMessages(33004);
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            int iIntValue = num.intValue();
            this.f43434c.f44232a = iIntValue;
            if (pxk.b(iIntValue)) {
                pxk.d = "ShareNumber";
            } else if (pxk.c(iIntValue)) {
                pxk.d = "DiffNumber";
            }
            LogUtil.a("HwMultiSimMgr", "sendGetCardTypeCommand mCardType = ", num);
        } else {
            LogUtil.j("HwMultiSimMgr", "sendGetCardTypeCommand objectData invalid, errorcode: ", Integer.valueOf(i2));
        }
        handler.sendEmptyMessage(33004);
    }

    public void d(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwMultiSimMgr", "enter getMultiSimBatteryThreshold()");
        g(iBaseResponseCallback);
    }

    public void b(IBaseResponseCallback iBaseResponseCallback, IBaseResponseCallback iBaseResponseCallback2) {
        synchronized (v()) {
            List<IBaseResponseCallback> list = i.get(3);
            if (list != null && list.contains(iBaseResponseCallback)) {
                list.remove(iBaseResponseCallback);
            }
            i.put(3, list);
            List<IBaseResponseCallback> list2 = i.get(4);
            if (list2 != null && list2.contains(iBaseResponseCallback2)) {
                list2.remove(iBaseResponseCallback2);
            }
            i.put(4, list2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        SharedPreferenceManager.e(BaseApplication.getContext(), "share_preference_esim_accode", "KEY_ACCODE", str, null);
        SharedPreferenceManager.e(BaseApplication.getContext(), "share_preference_esim_accode", "KEY_ACCODE_SAVE_TIME", str2, null);
    }

    @Override // com.huawei.callback.BluetoothDataReceiveCallback
    public void onDataReceived(int i2, DeviceInfo deviceInfo, byte[] bArr) {
        if (i2 != 0 || bArr == null) {
            return;
        }
        LogUtil.a("HwMultiSimMgr", "onResponse recv bt dataInfos");
        byte b2 = bArr[1];
        switch (b2) {
            case 1:
                j(bArr);
                break;
            case 2:
                i(bArr);
                break;
            case 3:
                a(bArr);
                break;
            case 4:
                d(bArr);
                break;
            case 5:
                c(bArr);
                break;
            case 6:
                g(bArr);
                break;
            case 7:
                d(bArr, 7);
                break;
            case 8:
                e(bArr);
                break;
            case 9:
                h(bArr);
                break;
            case 10:
                b(bArr);
                break;
            default:
                LogUtil.j("HwMultiSimMgr", "unknow command sUserId:", Byte.valueOf(b2));
                break;
        }
    }

    public void t() {
        edc.e().registerDeviceSampleListener("hw.unitedevice.esimcardtype", this);
    }

    public void q() {
        edc.e().unRegisterDeviceSampleListener("hw.unitedevice.esimcardtype");
    }

    public void b(DeviceInfo deviceInfo, IBaseResponseCallback iBaseResponseCallback) {
        if (deviceInfo == null || iBaseResponseCallback == null) {
            ReleaseLogUtil.e("DEVMGR_HwMultiSimMgr", "sendGetCardTypeCommand deviceInfo or callback is null.");
            return;
        }
        ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "callback: ", iBaseResponseCallback);
        this.s = iBaseResponseCallback;
        ReleaseLogUtil.e("DEVMGR_HwMultiSimMgr", "sendSampleConfigCommand result:", Boolean.valueOf(edc.e().sendSampleConfigCommand(deviceInfo, e(2, 0), "HwMultiSimMgr")));
    }

    public void c(IBaseResponseCallback iBaseResponseCallback) {
        this.s = iBaseResponseCallback;
    }

    public void a(DeviceInfo deviceInfo, int i2) {
        if (deviceInfo == null) {
            ReleaseLogUtil.e("DEVMGR_HwMultiSimMgr", "sendGetCardTypeCommand deviceInfo is null.");
        } else {
            edc.e().sendSampleConfigCommand(deviceInfo, e(1, i2), "HwMultiSimMgr");
        }
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i2, DeviceInfo deviceInfo, eec eecVar) {
        ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "onDataReceived");
        if (deviceInfo == null || eecVar == null) {
            ReleaseLogUtil.e("DEVMGR_HwMultiSimMgr", "onDataReceived deviceInfo or message is null.");
            return;
        }
        if (eecVar instanceof eef) {
            int iD = d((eef) eecVar);
            ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "onDataReceived mResponseCallback = ", this.s);
            IBaseResponseCallback iBaseResponseCallback = this.s;
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(i2, Integer.valueOf(iD));
                return;
            }
            return;
        }
        ReleaseLogUtil.e("DEVMGR_HwMultiSimMgr", "onDataReceived message is error.");
    }

    private int d(eef eefVar) {
        String strE;
        if (eefVar == null) {
            ReleaseLogUtil.e("DEVMGR_HwMultiSimMgr", "getResultData sampleConfig is null.");
            return 0;
        }
        List<eeg> configInfoList = eefVar.getConfigInfoList();
        if (njy.e(configInfoList)) {
            ReleaseLogUtil.e("DEVMGR_HwMultiSimMgr", "getResultData sampleConfigList is empty");
            return 0;
        }
        eeg eegVar = configInfoList.get(0);
        if (eegVar == null) {
            strE = "";
        } else {
            strE = eeq.e(eegVar.e());
        }
        ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "getResultData configData = ", strE);
        if (TextUtils.isEmpty(strE)) {
            ReleaseLogUtil.e("DEVMGR_HwMultiSimMgr", "getResultData configData is null.");
            return 0;
        }
        return CommonUtil.v(eeq.d(strE));
    }

    private eef e(int i2, int i3) {
        ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "constructSampleConfig configAction = ", Integer.valueOf(i2));
        eef eefVar = new eef();
        eefVar.setSrcPkgName("hw.unitedevice.esimcardtype");
        eefVar.setWearPkgName("hw.watch.health.esimcardtype");
        eefVar.setCommandId(1);
        ArrayList arrayList = new ArrayList(5);
        eeg eegVar = new eeg();
        eegVar.b(900100016L);
        eegVar.b(i2);
        if (i2 == 1) {
            String strD = eeq.d(i3);
            ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "constructSampleConfig convertedCardType = ", strD);
            eegVar.d(eeq.c(strD));
        }
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
        return eefVar;
    }

    public void b(final MultiSimDeviceInfo multiSimDeviceInfo, String str, final ResultCallback<String> resultCallback) {
        if (multiSimDeviceInfo == null || TextUtils.isEmpty(str) || resultCallback == null) {
            LogUtil.j("HwMultiSimMgr", "getCuccMobile parameter invalid.");
            resultCallback.onFailure(new Throwable("parameter invalid"));
        } else {
            oef.e("5778dec3e5d0a1922582541492240423", str, new ResultCallback<String>() { // from class: npz.3
                @Override // com.huawei.networkclient.ResultCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(String str2) {
                    if (TextUtils.isEmpty(str2)) {
                        LogUtil.a("HwMultiSimMgr", "resp is empty.");
                        xjt.q("resp is empty.");
                        resultCallback.onFailure(new Throwable("cuccGetMobilePost resp is empty."));
                    } else {
                        LogUtil.a("HwMultiSimMgr", "getCuccMobile resp = " + str2);
                        npz.this.a(str2, multiSimDeviceInfo, (ResultCallback<String>) resultCallback);
                    }
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    resultCallback.onFailure(th);
                    LogUtil.j("HwMultiSimMgr", "getCuccMobile :", ExceptionUtils.c(th));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MultiSimDeviceInfo multiSimDeviceInfo, ResultCallback<String> resultCallback) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i2 = jSONObject.getInt("resultCode");
            String string = jSONObject.getString(JsNetwork.NetworkType.MOBILE);
            this.t = string;
            ReleaseLogUtil.d("DEVMGR_HwMultiSimMgr", "resultCode = ", Integer.valueOf(i2));
            if (i2 == 0 && !TextUtils.isEmpty(string)) {
                e(string, multiSimDeviceInfo, resultCallback);
            } else {
                resultCallback.onFailure(new Throwable("getCuccMobile resultCode or mobileNumber invalid."));
            }
        } catch (JSONException e2) {
            ReleaseLogUtil.a("DEVMGR_HwMultiSimMgr", "getCuccMobile,JSONException", ExceptionUtils.c(e2));
            resultCallback.onFailure(e2);
        }
    }

    public String n() {
        return this.t;
    }

    public void e(String str, MultiSimDeviceInfo multiSimDeviceInfo, ResultCallback<String> resultCallback) {
        int iD = qrf.d(2147483646);
        LogUtil.a("HwMultiSimMgr", "mobileNumber = ", str, " requestID :", Integer.valueOf(iD));
        oek oekVar = new oek();
        oekVar.c(str);
        oekVar.c(iD);
        b(b().b(multiSimDeviceInfo, 2, oekVar), multiSimDeviceInfo, resultCallback);
    }

    private void b(EUICCDeviceInfo eUICCDeviceInfo, MultiSimDeviceInfo multiSimDeviceInfo, ResultCallback<String> resultCallback) {
        if (b().d(multiSimDeviceInfo)) {
            LogUtil.a("HwMultiSimMgr", "deviceInfo invalidation.");
            resultCallback.onFailure(new RemoteException());
        } else {
            oef.a(eUICCDeviceInfo, resultCallback);
        }
    }
}
