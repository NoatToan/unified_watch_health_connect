package defpackage;

import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.huawei.haf.handler.BaseHandlerCallback;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.wifi.lib.db.dbtable.DeviceListManager;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.unite.AuthorizeSubUserInfo;
import com.huawei.hwcloudmodel.model.unite.DevInfo;
import com.huawei.hwcloudmodel.model.unite.DeviceDetailInfo;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetAllDeviceRsp;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetAuthorizeSubUserReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetAuthorizeSubUserRsp;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginmgr.filedownload.PullListener;
import health.compact.a.CompileParameterUtil;
import health.compact.a.EzPluginManager;
import health.compact.a.LocalBroadcast;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class eam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile eam f32580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f32581b;
    private static final Object d = new Object();
    private List<DeviceDetailInfo> g;
    private List<DeviceDetailInfo> j;
    private List<DeviceDetailInfo> h = new ArrayList(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f32582c = false;
    private boolean e = false;
    private int i = 0;
    private ArrayList<eal> f = new ArrayList<>(16);
    private ExtendHandler k = HandlerCenter.b(new e(this), "update_device");

    static /* synthetic */ int a(eam eamVar) {
        int i = eamVar.i;
        eamVar.i = i + 1;
        return i;
    }

    private eam() {
    }

    public static eam d() {
        if (f32580a == null) {
            synchronized (d) {
                if (f32580a == null) {
                    f32580a = new eam();
                }
            }
        }
        return f32580a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        dyg.a(false, "UpdateDeviceControl", "isSync sNextSyncTime:", Long.valueOf(f32581b), " mCurrentTime ,", Long.valueOf(jCurrentTimeMillis));
        if (f32581b >= jCurrentTimeMillis - 60000) {
            return false;
        }
        f32581b = jCurrentTimeMillis;
        return true;
    }

    static class e extends BaseHandlerCallback<eam> {
        e(eam eamVar) {
            super(eamVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandlerCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean handleMessageWhenReferenceNotNull(eam eamVar, Message message) {
            return e(eamVar, message);
        }

        private boolean e(eam eamVar, Message message) throws Throwable {
            LogUtil.a("UpdateDeviceControl", "msg.what: ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 265) {
                if (eamVar.n()) {
                    eamVar.t();
                    return true;
                }
                eamVar.g();
                return true;
            }
            if (i == 272) {
                if (!(message.obj instanceof String)) {
                    return true;
                }
                eamVar.i((String) message.obj);
                return true;
            }
            if (i != 273) {
                switch (i) {
                    case 256:
                        eamVar.p();
                        return true;
                    case 257:
                        if (!eamVar.m()) {
                            return true;
                        }
                        eamVar.p();
                        return true;
                    case 258:
                        eamVar.q();
                        return true;
                    case 259:
                        eamVar.o();
                        return true;
                    case 260:
                        eamVar.l();
                        return true;
                    case 261:
                        eamVar.i();
                        return true;
                    case 262:
                        if (!(message.obj instanceof List)) {
                            return true;
                        }
                        eamVar.a((List<DeviceDetailInfo>) message.obj);
                        return true;
                    case 263:
                        eamVar.k();
                        return true;
                    default:
                        dyg.a(false, "UpdateDeviceControl", "unknown Message");
                        return false;
                }
            }
            ebh.a(dxw.d());
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        j();
        ArrayList<eal> arrayList = this.f;
        if (arrayList == null || arrayList.size() <= 0) {
            dyg.d(false, "UpdateDeviceControl", "saveSubUser() mSubUsers is null:");
            return;
        }
        Iterator<eal> it = this.f.iterator();
        while (it.hasNext()) {
            ecf.c(it.next());
        }
    }

    private void j() {
        dyg.a(false, "UpdateDeviceControl", "deleteSubUser");
        ecf.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        List<DeviceDetailInfo> list = this.g;
        if (list == null || list.size() <= 0) {
            j();
            dyg.d(false, "UpdateDeviceControl", "downloadSubUser() mDeviceInfoList is null");
            return;
        }
        this.f.clear();
        this.i = 0;
        Message messageObtain = Message.obtain();
        messageObtain.obj = this.g;
        messageObtain.what = 262;
        this.k.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(WifiDeviceGetAuthorizeSubUserRsp wifiDeviceGetAuthorizeSubUserRsp, String str) {
        List<AuthorizeSubUserInfo> authorizeSubUserList = wifiDeviceGetAuthorizeSubUserRsp.getAuthorizeSubUserList();
        if (authorizeSubUserList == null || authorizeSubUserList.size() <= 0) {
            return;
        }
        eal ealVar = new eal();
        for (AuthorizeSubUserInfo authorizeSubUserInfo : authorizeSubUserList) {
            ealVar.e(authorizeSubUserInfo.getSubHuid(), authorizeSubUserInfo.getNickName(), authorizeSubUserInfo.getUserAccount());
        }
        ealVar.c(str);
        this.f.add(ealVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final List<DeviceDetailInfo> list) {
        if (this.i >= list.size()) {
            this.k.sendEmptyMessage(263);
            return;
        }
        final String devId = list.get(this.i).getDevId();
        if (TextUtils.isEmpty(devId)) {
            this.i++;
            Message messageObtain = Message.obtain();
            messageObtain.obj = list;
            messageObtain.what = 262;
            this.k.sendMessage(messageObtain);
            dyg.d(false, "UpdateDeviceControl", "downloadSingDeviceUser() deviceId is null");
            return;
        }
        dyg.a(false, "UpdateDeviceControl", "downloadSingDeviceUser() deviceId:", dyg.b(devId));
        WifiDeviceGetAuthorizeSubUserReq wifiDeviceGetAuthorizeSubUserReq = new WifiDeviceGetAuthorizeSubUserReq();
        wifiDeviceGetAuthorizeSubUserReq.setDevId(devId);
        lqo.b(dxw.d()).b(wifiDeviceGetAuthorizeSubUserReq, new ICloudOperationResult<WifiDeviceGetAuthorizeSubUserRsp>() { // from class: eam.5
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void operationResult(WifiDeviceGetAuthorizeSubUserRsp wifiDeviceGetAuthorizeSubUserRsp, String str, boolean z) {
                int iIntValue;
                String resultDesc;
                if (!z) {
                    if (wifiDeviceGetAuthorizeSubUserRsp == null) {
                        iIntValue = Constants.CODE_UNKNOWN_ERROR;
                        resultDesc = "downloadSingDeviceUser() unknown error";
                    } else {
                        iIntValue = wifiDeviceGetAuthorizeSubUserRsp.getResultCode().intValue();
                        resultDesc = wifiDeviceGetAuthorizeSubUserRsp.getResultDesc();
                    }
                    dyg.d(false, "UpdateDeviceControl", "downloadSingDeviceUser() errCode = ", Integer.valueOf(iIntValue), ", downloadSingDeviceUser() resultDesc:", resultDesc);
                } else if (wifiDeviceGetAuthorizeSubUserRsp != null) {
                    eam.this.c(wifiDeviceGetAuthorizeSubUserRsp, devId);
                } else {
                    dyg.d(false, "UpdateDeviceControl", "downloadSingDeviceUser() get Sub User is null ,deviceId:", dyg.b(devId));
                }
                eam.a(eam.this);
                Message messageObtain2 = Message.obtain();
                messageObtain2.obj = list;
                messageObtain2.what = 262;
                eam.this.k.sendMessage(messageObtain2);
            }
        });
    }

    public static boolean a() {
        return CompileParameterUtil.c("SUPPORT_WIFI_WEIGHT_DEVICE", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (ResourceManager.c().d("a8ba095d-4123-43c4-a30a-0240011c58de") == null) {
            ResourceManager.c().f("a8ba095d-4123-43c4-a30a-0240011c58de");
        }
        if (ResourceManager.c().d("e4b0b1d5-2003-4d88-8b5f-c4f64542040b") == null) {
            ResourceManager.c().f("e4b0b1d5-2003-4d88-8b5f-c4f64542040b");
        }
        if (ResourceManager.c().d("8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4") == null) {
            ResourceManager.c().f("8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4");
        }
        if (ResourceManager.c().d("b29df4e3-b1f7-4e40-960d-4cfb63ccca05") == null) {
            ResourceManager.c().f("b29df4e3-b1f7-4e40-960d-4cfb63ccca05");
        }
        if (ResourceManager.c().d("e835d102-af95-48a6-ae13-2983bc06f5c0") == null) {
            ResourceManager.c().f("e835d102-af95-48a6-ae13-2983bc06f5c0");
        }
    }

    public void b() {
        dyg.a(false, "UpdateDeviceControl", "syncDelayedDevice in");
        this.k.sendEmptyMessage(OldToNewMotionPath.SPORT_TYPE_CROSS_TRAINER);
        this.k.sendEmptyMessage(260);
        this.k.sendEmptyMessage(257, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    public void c() {
        if (a()) {
            dyg.a(false, "UpdateDeviceControl", "syncDevice in");
            this.k.sendEmptyMessage(257);
        }
    }

    public void h() {
        if (a()) {
            dyg.a(false, "UpdateDeviceControl", "syncNowDevice in");
            this.k.sendEmptyMessage(256);
        }
    }

    public void a(String str) {
        if (a()) {
            dyg.a(false, "UpdateDeviceControl", "syncNowDevice in and remove duplicate device");
            Message messageObtain = Message.obtain();
            messageObtain.obj = str;
            messageObtain.what = 272;
            this.k.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        dyg.a(false, "UpdateDeviceControl", "syncWiFiDevice in");
        synchronized (d) {
            this.g = null;
            this.j = null;
        }
        lqo.b(dxw.d()).d(new ICloudOperationResult<WifiDeviceGetAllDeviceRsp>() { // from class: eam.3
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void operationResult(WifiDeviceGetAllDeviceRsp wifiDeviceGetAllDeviceRsp, String str, boolean z) {
                String resultDesc;
                int iIntValue;
                if (z) {
                    dyg.a(false, "UpdateDeviceControl", "syncWiFiDevice reg device success :", wifiDeviceGetAllDeviceRsp.toString());
                    synchronized (eam.d) {
                        eam.this.g = wifiDeviceGetAllDeviceRsp.getDeviceDetailInfoList();
                        eam.this.j = wifiDeviceGetAllDeviceRsp.getAuthorizedDeviceDetailInfoList();
                    }
                    ReleaseLogUtil.d("R_UpdateDeviceControl", "syncWiFiDevice mDeviceInfoList.size:", Integer.valueOf(njy.a(eam.this.g)), " mSubUserInfoList.size:", Integer.valueOf(njy.a(eam.this.j)));
                    eam.this.k.sendEmptyMessage(261);
                    eam.this.k.sendEmptyMessage(258);
                    return;
                }
                ArrayList<String> arrayListE = ecf.e();
                if (arrayListE != null) {
                    Iterator<String> it = arrayListE.iterator();
                    while (it.hasNext()) {
                        eam.this.c(it.next());
                    }
                }
                if (wifiDeviceGetAllDeviceRsp != null) {
                    iIntValue = wifiDeviceGetAllDeviceRsp.getResultCode().intValue();
                    resultDesc = wifiDeviceGetAllDeviceRsp.getResultDesc();
                } else {
                    resultDesc = "syncWiFiDevice() unknown error";
                    iIntValue = Constants.CODE_UNKNOWN_ERROR;
                }
                dyg.d(false, "UpdateDeviceControl", "syncWiFiDevice() errCode = ", Integer.valueOf(iIntValue), ", syncWiFiDevice() resultDesc:", resultDesc);
            }
        });
    }

    public void a(final String str, String str2, final IBaseResponseCallback iBaseResponseCallback) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("UpdateDeviceControl", "syncWiFiDevice product is null");
            iBaseResponseCallback.a(-1, "illegal productId");
        } else {
            MeasurableDevice measurableDeviceB = dmp.d().b(str2, false);
            final String serialNumber = measurableDeviceB != null ? measurableDeviceB.getSerialNumber() : "";
            lqo.b(dxw.d()).d(new ICloudOperationResult<WifiDeviceGetAllDeviceRsp>() { // from class: eam.4
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void operationResult(WifiDeviceGetAllDeviceRsp wifiDeviceGetAllDeviceRsp, String str3, boolean z) {
                    String resultDesc;
                    int iIntValue;
                    if (z) {
                        dyg.a(false, "UpdateDeviceControl", "syncWiFiDevice with callBack success :", wifiDeviceGetAllDeviceRsp.toString());
                        synchronized (eam.d) {
                            eam.this.g = wifiDeviceGetAllDeviceRsp.getDeviceDetailInfoList();
                            eam.this.j = wifiDeviceGetAllDeviceRsp.getAuthorizedDeviceDetailInfoList();
                        }
                        eam.this.k.sendEmptyMessage(261);
                        eam.this.k.sendEmptyMessage(OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE);
                        eam eamVar = eam.this;
                        if (!eamVar.c((List<DeviceDetailInfo>) eamVar.g, serialNumber)) {
                            eam eamVar2 = eam.this;
                            if (!eamVar2.c((List<DeviceDetailInfo>) eamVar2.j, serialNumber)) {
                                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                                if (iBaseResponseCallback2 != null) {
                                    iBaseResponseCallback2.a(-1, "no such product");
                                    return;
                                } else {
                                    LogUtil.j("UpdateDeviceControl", "syncWiFiDevice success callback is null");
                                    return;
                                }
                            }
                        }
                        if (ResourceManager.c().d(str) == null) {
                            eam.this.c(3, str, iBaseResponseCallback);
                            return;
                        } else {
                            iBaseResponseCallback.a(0, "");
                            return;
                        }
                    }
                    if (wifiDeviceGetAllDeviceRsp != null) {
                        iIntValue = wifiDeviceGetAllDeviceRsp.getResultCode().intValue();
                        resultDesc = wifiDeviceGetAllDeviceRsp.getResultDesc();
                    } else {
                        resultDesc = "syncWiFiDevice() unknown error";
                        iIntValue = Constants.CODE_UNKNOWN_ERROR;
                    }
                    IBaseResponseCallback iBaseResponseCallback3 = iBaseResponseCallback;
                    if (iBaseResponseCallback3 != null) {
                        iBaseResponseCallback3.a(iIntValue, resultDesc);
                    } else {
                        LogUtil.j("UpdateDeviceControl", "syncWiFiDevice with callback fail, callback is null");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(final String str) {
        dyg.a(false, "UpdateDeviceControl", "syncWiFiDevice in");
        synchronized (d) {
            this.g = null;
            this.j = null;
        }
        lqo.b(dxw.d()).d(new ICloudOperationResult<WifiDeviceGetAllDeviceRsp>() { // from class: eam.2
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void operationResult(WifiDeviceGetAllDeviceRsp wifiDeviceGetAllDeviceRsp, String str2, boolean z) {
                String resultDesc;
                int iIntValue;
                if (z) {
                    dyg.a(false, "UpdateDeviceControl", "syncWiFiDevice reg device success :", wifiDeviceGetAllDeviceRsp.toString());
                    synchronized (eam.d) {
                        eam.this.g = wifiDeviceGetAllDeviceRsp.getDeviceDetailInfoList();
                        eam.this.j = wifiDeviceGetAllDeviceRsp.getAuthorizedDeviceDetailInfoList();
                    }
                    ReleaseLogUtil.d("R_UpdateDeviceControl", "syncWiFiDevice mDeviceInfoList.size:", Integer.valueOf(njy.a(eam.this.g)), " mSubUserInfoList.size:", Integer.valueOf(njy.a(eam.this.j)));
                    eam.this.k.sendEmptyMessage(261);
                    eam.this.k.sendEmptyMessage(258);
                    eam.this.e(str);
                    return;
                }
                ArrayList<String> arrayListE = ecf.e();
                if (arrayListE != null) {
                    Iterator<String> it = arrayListE.iterator();
                    while (it.hasNext()) {
                        eam.this.c(it.next());
                    }
                }
                if (wifiDeviceGetAllDeviceRsp != null) {
                    iIntValue = wifiDeviceGetAllDeviceRsp.getResultCode().intValue();
                    resultDesc = wifiDeviceGetAllDeviceRsp.getResultDesc();
                } else {
                    resultDesc = "syncWiFiDeviceDeleteDuplicateDeviceId() unknown error";
                    iIntValue = Constants.CODE_UNKNOWN_ERROR;
                }
                dyg.d(false, "UpdateDeviceControl", "syncWiFiDevice() errCode = ", Integer.valueOf(iIntValue), ", syncWiFiDeviceDeleteDuplicateDeviceId() resultDesc:", resultDesc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        List<DeviceDetailInfo> list = this.g;
        if (list == null) {
            return;
        }
        for (DeviceDetailInfo deviceDetailInfo : list) {
            if (dxm.t(deviceDetailInfo.getDevInfo().getProdId()).equals(str) && deviceDetailInfo.getServices() == null) {
                dyg.a(false, "UpdateDeviceControl", "start to delete bluetooth device, deviceID = ", deviceDetailInfo.getDevId());
                ean.g(deviceDetailInfo.getDevId());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        synchronized (d) {
            List<DeviceDetailInfo> list = this.j;
            if (list != null && list.size() > 0) {
                return true;
            }
            List<DeviceDetailInfo> list2 = this.g;
            return list2 != null && list2.size() > 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        this.k.sendEmptyMessage(259);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        LogUtil.a("UpdateDeviceControl", "updateResourceFile");
        synchronized (d) {
            if (njy.e(this.g) && njy.e(this.j)) {
                this.k.sendEmptyMessage(OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE);
            } else {
                this.h.clear();
                List<DeviceDetailInfo> list = this.g;
                if (list != null) {
                    this.h.addAll(list);
                } else {
                    LogUtil.j("UpdateDeviceControl", "updateResourceFile mDeviceInfoList is null");
                }
                List<DeviceDetailInfo> list2 = this.j;
                if (list2 != null) {
                    this.h.addAll(list2);
                } else {
                    LogUtil.j("UpdateDeviceControl", "updateResourceFile mSubUserInfoList is null");
                }
                b(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i) {
        if (njy.e(this.h)) {
            return;
        }
        LogUtil.a("UpdateDeviceControl", "updateResourceFileByList, infos size:", Integer.valueOf(this.h.size()), "index is:", Integer.valueOf(i));
        DevInfo devInfo = this.h.get(i).getDevInfo();
        if (devInfo == null || TextUtils.isEmpty(devInfo.getProdId())) {
            return;
        }
        c(3, dxm.t(devInfo.getProdId()), new IBaseResponseCallback() { // from class: eam.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                LogUtil.d("UpdateDeviceControl", "updateResourceFileByList");
                if (i2 == 0 && i + 1 < eam.this.h.size()) {
                    eam.this.b(i + 1);
                } else {
                    LogUtil.j("UpdateDeviceControl", "updateResourceFileWithRetry not success");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final int i, final String str, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("UpdateDeviceControl", "updateResourceFileWithRetry ", Integer.valueOf(i), " productId:", str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("UpdateDeviceControl", "updateResourceFile: product id is null");
            return;
        }
        if (EzPluginManager.b().j(str)) {
            this.k.sendEmptyMessage(OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE);
            LogUtil.a("UpdateDeviceControl", "updateResourceFile: isPluginAvaiable is true");
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(0, "");
                return;
            }
            return;
        }
        if (i <= 0) {
            this.k.sendEmptyMessage(OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE);
            LogUtil.e("UpdateDeviceControl", "updateResourceFileWithRetry fail");
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(-1, "load resource fail");
                return;
            }
            return;
        }
        dxp.b(str, new PullListener() { // from class: eam.7
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public void onPullingChange(pis pisVar, pit pitVar) {
                if (pitVar == null) {
                    LogUtil.j("UpdateDeviceControl", "onPullingChange result is null");
                    return;
                }
                LogUtil.a("UpdateDeviceControl", "pull resource status, ", Integer.valueOf(pitVar.f()));
                int iF = pitVar.f();
                if (iF == 1 && iBaseResponseCallback != null) {
                    eam.this.k.sendEmptyMessage(OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE);
                    iBaseResponseCallback.a(0, "");
                } else if (iF != 0) {
                    eam.this.c(i - 1, str, iBaseResponseCallback);
                } else {
                    LogUtil.d("UpdateDeviceControl", "pull resource processing");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        dyg.a(false, "UpdateDeviceControl", "replaceDevice in");
        ArrayList arrayList = new ArrayList();
        List<DeviceDetailInfo> list = this.g;
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(this.g);
        }
        List<DeviceDetailInfo> list2 = this.j;
        if (list2 != null && !list2.isEmpty()) {
            arrayList.addAll(this.j);
        }
        c(arrayList);
        synchronized (d) {
            a(this.g, 1);
            a(this.j, 2);
        }
        EventBus.a(new EventBus.d("wifi_scale_auth_refresh"));
        s();
        r();
    }

    private void s() {
        LogUtil.a("UpdateDeviceControl", "sendUserInfoAfterUpdateLocalDb in");
        if (njy.b(this.j)) {
            for (DeviceDetailInfo deviceDetailInfo : this.j) {
                if (deviceDetailInfo != null && deviceDetailInfo.getDevInfo() != null) {
                    ean.b(deviceDetailInfo.getDevId(), dxm.w(deviceDetailInfo.getDevInfo().getProdId()));
                }
            }
        }
    }

    private void c(List<DeviceDetailInfo> list) {
        boolean z;
        dyg.a(false, "UpdateDeviceControl", "deleteLocalDevice DeviceDetailInfo size ", Integer.valueOf(list.size()));
        ArrayList<eby> arrayListA = ecf.a();
        if (arrayListA == null || arrayListA.size() <= 0) {
            return;
        }
        dyg.a(false, "UpdateDeviceControl", "deleteLocalDevice WiFiDevice size ", Integer.valueOf(arrayListA.size()));
        for (eby ebyVar : arrayListA) {
            dyg.a(false, "UpdateDeviceControl", "deleteLocalDevice WiFiDevice productId ", dyg.b(ebyVar.getProductId()));
            Iterator<DeviceDetailInfo> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (ebyVar.e().equals(it.next().getDevId())) {
                    dyg.a(false, "UpdateDeviceControl", "deleteLocalDevice getProductId = ", ebyVar.getDeviceName());
                    z = true;
                    break;
                }
            }
            boolean zB = b(ebyVar);
            if (!z && !zB) {
                boolean zF = drw.e().f(ebyVar.e());
                dyg.a(false, "UpdateDeviceControl", "deleteDevice deviceId:", dyg.b(ebyVar.e()), "deleteLocalDevice isSuccess:", Boolean.valueOf(zF));
                if (!zF) {
                    dyg.a(false, "UpdateDeviceControl", "deleteDevice ProductId:", dyg.b(ebyVar.getProductId()), "deleteLocalDevice isSuccess:", Boolean.valueOf(drw.e().m(ebyVar.getProductId())));
                }
            }
        }
    }

    private void f() throws Throwable {
        ArrayList<String> arrayListA = drw.e().a();
        if (arrayListA == null || arrayListA.size() <= 0) {
            dyg.a(false, "UpdateDeviceControl", "deleteDevice device is null ");
        } else {
            dyg.a(true, "UpdateDeviceControl", "deleteDevice deviceIds ", arrayListA.toString());
            Iterator<String> it = arrayListA.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        }
        HealthDevice healthDeviceB = drw.e().b("e4b0b1d5-2003-4d88-8b5f-c4f64542040b");
        String uniqueId = "is null";
        dyg.a(false, "UpdateDeviceControl", "deleteDevice check huawei device ", healthDeviceB == null ? "is null" : healthDeviceB.getUniqueId());
        if (healthDeviceB != null) {
            drw.e().m("e4b0b1d5-2003-4d88-8b5f-c4f64542040b");
        }
        HealthDevice healthDeviceB2 = drw.e().b("a8ba095d-4123-43c4-a30a-0240011c58de");
        if (healthDeviceB2 != null) {
            uniqueId = healthDeviceB2.getUniqueId();
        }
        dyg.a(false, "UpdateDeviceControl", "deleteDevice check honor device ", uniqueId);
        if (healthDeviceB2 != null) {
            drw.e().m("a8ba095d-4123-43c4-a30a-0240011c58de");
        }
    }

    private void b(String str) throws Throwable {
        eby ebyVarD = ecf.d(str);
        if (ebyVarD == null) {
            dyg.d(false, "UpdateDeviceControl", "current device is null");
            return;
        }
        dyg.a(true, "UpdateDeviceControl", "deleteDevice productId ", dyg.b(ebyVarD.getProductId()));
        if (b(ebyVarD)) {
            return;
        }
        drw.e().o(ebyVarD.getSerialNumber());
        dyg.a(false, "UpdateDeviceControl", "deleteDevice deviceId:", dyg.b(str), " isSuccess:", Boolean.valueOf(drw.e().f(str)));
    }

    private boolean b(eby ebyVar) {
        boolean z = ebyVar.a().m() == 1;
        dyg.a(false, "UpdateDeviceControl", "isMainUser is ", Boolean.valueOf(z));
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() throws Throwable {
        dyg.a(false, "UpdateDeviceControl", "deleteAllDevice in ");
        f();
        w();
    }

    private void a(List<DeviceDetailInfo> list, int i) {
        ArrayList<DeviceDetailInfo> arrayList = new ArrayList(16);
        if (list == null || list.size() <= 0) {
            dyg.a(false, "UpdateDeviceControl", "updateLocalDevice detailInfoList is null source:", Integer.valueOf(i));
        } else {
            dyg.a(false, "UpdateDeviceControl", "updateLocalDevice detailInfoList size ", Integer.valueOf(list.size()));
            for (int size = list.size() - 1; size >= 0; size--) {
                DeviceDetailInfo deviceDetailInfo = list.get(size);
                if (deviceDetailInfo == null) {
                    dyg.d(false, "UpdateDeviceControl", "updateLocalDevice deviceDetailInfo is null");
                } else if (!dxm.w(deviceDetailInfo.getDevInfo().getProdId()) || a(deviceDetailInfo)) {
                    dyg.a(false, "UpdateDeviceControl", "updateLocalDevice deviceId", dyg.b(deviceDetailInfo.getDevId()));
                    b(deviceDetailInfo, i);
                } else {
                    dyg.a(false, "UpdateDeviceControl", "updateLocalDevice hagrid device illegal device detail info： ", dyg.b(deviceDetailInfo.getDevId()));
                    arrayList.add(deviceDetailInfo);
                }
            }
        }
        dyg.a(false, "UpdateDeviceControl", "updateLocalDevice dirtyDataList.size()： ", Integer.valueOf(arrayList.size()));
        if (njy.b(arrayList)) {
            for (DeviceDetailInfo deviceDetailInfo2 : arrayList) {
                if (deviceDetailInfo2 != null) {
                    String devId = deviceDetailInfo2.getDevId();
                    if (i == 1) {
                        dyg.a(false, "UpdateDeviceControl", "updateLocalDevice unBindDevice devId： ", dyg.b(devId));
                        ean.g(devId);
                    } else {
                        ean.c(devId);
                    }
                }
            }
        }
        if (i == 1) {
            this.f32582c = true;
        }
        if (i == 2) {
            this.e = true;
        }
        if (this.f32582c && this.e) {
            w();
        }
    }

    private void w() {
        dyg.a(false, "UpdateDeviceControl", "workFinish");
        Intent intent = new Intent();
        intent.setAction("com.huawei.bone.action.DEVICE_THIRD_DELETE");
        dxw.d().sendBroadcast(intent, LocalBroadcast.f36595c);
        ean.a();
        this.e = false;
        this.f32582c = false;
    }

    private elh d(String str) {
        if (TextUtils.isEmpty(str)) {
            dyg.a(false, "UpdateDeviceControl", "getProduct productId is null");
            return null;
        }
        return ResourceManager.c().d(str);
    }

    public void b(DeviceDetailInfo deviceDetailInfo, int i) {
        elh elhVarD;
        if (deviceDetailInfo == null) {
            LogUtil.j("UpdateDeviceControl", "saveWiFiDevice info is null");
            return;
        }
        if (!ecb.e(deviceDetailInfo.getDevInfo().getProdId())) {
            LogUtil.j("UpdateDeviceControl", "saveWiFiDevice not wifi device");
            return;
        }
        dyg.a(false, "UpdateDeviceControl", "saveWiFiDevice deviceId", dyg.b(deviceDetailInfo.getDevId()));
        eto etoVarA = DeviceListManager.c(dxw.d()).a(deviceDetailInfo.getDevInfo().getProdId());
        if (etoVarA == null) {
            LogUtil.a("UpdateDeviceControl", "saveWiFiDevice table is null and ProdId:", deviceDetailInfo.getDevInfo().getProdId());
            String strT = dxm.t(deviceDetailInfo.getDevInfo().getProdId());
            if (TextUtils.isEmpty(strT)) {
                LogUtil.j("UpdateDeviceControl", "saveWiFiDevice productId is null");
                elhVarD = null;
            } else {
                elhVarD = d(strT);
            }
        } else {
            elhVarD = d(etoVarA.d);
        }
        c(elhVarD, deviceDetailInfo, i);
    }

    private void c(elh elhVar, final DeviceDetailInfo deviceDetailInfo, final int i) {
        if (elhVar == null || deviceDetailInfo == null) {
            LogUtil.j("UpdateDeviceControl", "bindDevice product or info is null");
            return;
        }
        ecb.a(deviceDetailInfo, "UpdateDeviceControl");
        boolean z = dmp.d().a(deviceDetailInfo.getDevInfo() != null ? deviceDetailInfo.getDevInfo().getSn() : "", false) != null;
        LogUtil.a("UpdateDeviceControl", "bindDevice isExist ", Boolean.valueOf(z));
        eby ebyVar = new eby();
        if (deviceDetailInfo.getDevInfo() != null) {
            deviceDetailInfo.getDevInfo().setMac("");
        }
        ebyVar.c(deviceDetailInfo);
        ebyVar.setAutoDevice(false);
        ebyVar.setKind(HealthDevice.HealthDeviceKind.HDK_WEIGHT);
        ebyVar.setProductId(elhVar.t());
        ebyVar.a().b(i);
        LogUtil.a("UpdateDeviceControl", "bindDevice source ", Integer.valueOf(ebyVar.a().m()));
        IDeviceEventHandler iDeviceEventHandler = new IDeviceEventHandler() { // from class: eam.8
            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onDeviceFound(HealthDevice healthDevice) {
            }

            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onScanFailed(int i2) {
            }

            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onStateChanged(int i2) {
                LogUtil.a("UpdateDeviceControl", "onStateChanged code ", Integer.valueOf(i2));
                if (i == 1) {
                    eam.this.c(deviceDetailInfo.getDevId());
                }
            }
        };
        if (z) {
            LogUtil.a("UpdateDeviceControl", "bindDevice isSuccess ", Boolean.valueOf(drw.e().c(elhVar.t(), elhVar.q(), ebyVar, iDeviceEventHandler)));
        } else {
            LogUtil.a("UpdateDeviceControl", "bindDevice isSuccess ", Boolean.valueOf(drw.e().a(elhVar.t(), elhVar.q(), ebyVar, iDeviceEventHandler)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        HealthDevice healthDeviceC = drw.e().c(str);
        boolean zB = ecj.b(BaseApplication.getContext());
        dyg.e(false, "UpdateDeviceControl", "wifi: device: ", healthDeviceC, ", network connect: ", Boolean.valueOf(zB));
        if (healthDeviceC != null && (healthDeviceC instanceof eby) && zB) {
            eas.b().b(str);
            ean.e(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(List<DeviceDetailInfo> list, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("UpdateDeviceControl", "isNeedDownloadResource illegal uniqueId true");
            return true;
        }
        if (njy.e(list)) {
            return false;
        }
        LogUtil.a("UpdateDeviceControl", "isNeedDownloadResource, infos size:", Integer.valueOf(list.size()));
        Iterator<DeviceDetailInfo> it = list.iterator();
        while (it.hasNext()) {
            DevInfo devInfo = it.next().getDevInfo();
            if (devInfo != null && !TextUtils.isEmpty(devInfo.getProdId()) && str.equals(devInfo.getSn())) {
                return true;
            }
        }
        return false;
    }

    private boolean a(DeviceDetailInfo deviceDetailInfo) {
        if (deviceDetailInfo == null || deviceDetailInfo.getDevInfo() == null) {
            LogUtil.j("UpdateDeviceControl", "isValidWiFiDeviceInfo deviceDetailInfo is null");
            return false;
        }
        if (TextUtils.isEmpty(deviceDetailInfo.getDevId()) || njy.e(deviceDetailInfo.getServices())) {
            LogUtil.j("UpdateDeviceControl", "isValidWiFiDeviceInfo devceId or service is null or empty");
            return false;
        }
        DevInfo devInfo = deviceDetailInfo.getDevInfo();
        if (TextUtils.isEmpty(devInfo.getSn()) || TextUtils.isEmpty(devInfo.getModel()) || TextUtils.isEmpty(devInfo.getDevType())) {
            LogUtil.j("UpdateDeviceControl", "isValidWiFiDeviceInfo illegal device info");
            return false;
        }
        if (!TextUtils.isEmpty(devInfo.getManu()) && !TextUtils.isEmpty(devInfo.getProdId()) && !TextUtils.isEmpty(devInfo.getHiv())) {
            return true;
        }
        LogUtil.j("UpdateDeviceControl", "isValidWiFiDeviceInfo illegal device info");
        return false;
    }

    private void r() {
        if (this.g == null) {
            LogUtil.j("UpdateDeviceControl", "sendOtaUrlWithWifiProfile mDeviceInfoList is null");
            return;
        }
        LogUtil.a("UpdateDeviceControl", "[grs][syncOtaUrl] is not same user.begin check grs");
        for (DeviceDetailInfo deviceDetailInfo : this.g) {
            String prodId = deviceDetailInfo.getDevInfo().getProdId();
            if (TextUtils.isEmpty(prodId)) {
                LogUtil.a("UpdateDeviceControl", "[grs][syncOtaUrl] productId is null.");
                return;
            } else if (!TextUtils.equals("M00D", prodId)) {
                LogUtil.a("UpdateDeviceControl", "[grs][syncOtaUrl] is not a herm.");
                return;
            } else {
                String devId = deviceDetailInfo.getDevId();
                LogUtil.a("UpdateDeviceControl", "[grs][syncOtaUrl] begin sendOtaUrlWithWifi:", devId);
                ean.a(devId, new ICloudOperationResult<Object>() { // from class: eam.6
                    @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                    public void operationResult(Object obj, String str, boolean z) {
                        if (z) {
                            LogUtil.a("UpdateDeviceControl", "[grs][syncOtaUrl] syncGrsUrlSuccess.", str);
                        } else {
                            LogUtil.a("UpdateDeviceControl", "[grs][syncOtaUrl] syncGrsUrlFailed.", str);
                        }
                    }
                });
            }
        }
    }
}
