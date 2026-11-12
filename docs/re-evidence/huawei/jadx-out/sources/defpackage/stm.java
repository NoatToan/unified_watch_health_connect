package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.wifi.interfaces.CommBaseCallbackInterface;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.wifi.lib.db.dbtable.DeviceListManager;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.DeviceDetailInfo;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceAddAuthorizeForSubUserReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetAllDeviceRsp;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginmgr.filedownload.PullListener;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.qrcode.activity.QrCodeSchemeActivity;
import com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler;
import com.huawei.ui.homehealth.qrcode.util.QrCodeDataBase;
import com.huawei.up.api.UpApi;
import com.huawei.up.model.UserInfomation;
import health.compact.a.CommonUtil;
import health.compact.a.EzPluginManager;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes17.dex */
public class stm extends QrCodeBaseHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f48677b = new ArrayList<String>() { // from class: stm.4
        {
            add("007B");
            add("M00D");
            add("M00F");
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f48678c;
    private String d;
    private CommonDialog21 e;

    public stm(Activity activity, CommBaseCallbackInterface commBaseCallbackInterface, Bundle bundle) {
        super(activity, commBaseCallbackInterface, bundle);
        this.f48678c = false;
        initHandlerThread("WifiQrCodeHandler");
    }

    private String c(String str, String str2) {
        try {
            LogUtil.d("WifiQrCodeHandler", "getQrContent qrResult = ", str2);
            String str3 = str2.split("&")[1];
            if (str3.length() < 2) {
                LogUtil.j("WifiQrCodeHandler", "getQrContent qrContent sub string fail");
                return null;
            }
            return str3.substring(2);
        } catch (IndexOutOfBoundsException | PatternSyntaxException e) {
            LogUtil.e("R_QrCode_WifiQrCodeHandler", "getQrContent exception = ", e.getMessage());
            sendCallBack(-4, str, null);
            return null;
        }
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public QrCodeDataBase parser(String str, Object obj) {
        if (this.mExtraValues != null && (this.mExtraValues.get("sschemeQrCode") instanceof Boolean) && ((Boolean) this.mExtraValues.get("sschemeQrCode")).booleanValue()) {
            str = str + "schemeQrCode";
            this.f48678c = true;
            this.mMainThreadHandler.sendEmptyMessage(10015);
        }
        LogUtil.a("WifiQrCodeHandler", "parser mIsScheme = ", Boolean.valueOf(this.f48678c));
        if (!(obj instanceof String)) {
            sendCallBack(-4, str, null);
            LogUtil.e("WifiQrCodeHandler", "parser data is not a string type");
            return null;
        }
        String strC = c(str, (String) obj);
        LogUtil.d("WifiQrCodeHandler", "parser newAction = ", str, "qrContent = ", strC);
        if ("s".equals(str) || "sschemeQrCode".equals(str)) {
            stj stjVar = new stj(str);
            int rVar = stjVar.parser(strC);
            if (rVar == 0) {
                return stjVar;
            }
            sendCallBack(rVar, str, null);
        } else {
            LogUtil.j("R_QrCode_WifiQrCodeHandler", "parser newAction is error");
            sendCallBack(-4, str, null);
        }
        return null;
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public boolean verify(QrCodeDataBase qrCodeDataBase) {
        if (qrCodeDataBase == null) {
            LogUtil.e("R_QrCode_WifiQrCodeHandler", " qrcodeData is null");
            return false;
        }
        if (qrCodeDataBase instanceof stj) {
            stj stjVar = (stj) qrCodeDataBase;
            if (!stjVar.d()) {
                return c(stjVar);
            }
            sendCallBack(-3, qrCodeDataBase.getAction(), null);
            return false;
        }
        sendCallBack(-4, qrCodeDataBase.getAction(), null);
        LogUtil.e("R_QrCode_WifiQrCodeHandler", " qrcodeData type is error,");
        return false;
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void execute() {
        this.mMainThreadHandler.sendEmptyMessage(10011);
        this.mHandler.sendEmptyMessage(1005);
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void handleMessage(Message message) {
        switch (message.what) {
            case 1001:
                d();
                break;
            case 1002:
                f();
                break;
            case 1003:
                c(message.arg1);
                break;
            case 1004:
                b(message);
                break;
            case 1005:
                c();
                break;
            default:
                LogUtil.j("R_QrCode_WifiQrCodeHandler", "type not match ");
                break;
        }
    }

    private void i(final Activity activity) {
        if (activity instanceof QrCodeSchemeActivity) {
            activity.runOnUiThread(new Runnable() { // from class: stk
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48675b.a(activity);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void a(Activity activity) {
        LogUtil.d("WifiQrCodeHandler", "initScaleView");
        final QrCodeSchemeActivity qrCodeSchemeActivity = (QrCodeSchemeActivity) activity;
        qrCodeSchemeActivity.setContentView(R.layout.activity_qrcode_scanning);
        ((CustomTitleBar) qrCodeSchemeActivity.findViewById(R.id.qrcode_scanning_title_bar)).setLeftButtonOnClickListener(new View.OnClickListener() { // from class: stu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                stm.e(qrCodeSchemeActivity, view);
            }
        });
        ((HealthButton) activity.findViewById(R.id.qrcode_scanning_scheme_bind_btn)).setOnClickListener(new View.OnClickListener() { // from class: stw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qrCodeSchemeActivity.c();
            }
        });
    }

    static /* synthetic */ void e(QrCodeSchemeActivity qrCodeSchemeActivity, View view) {
        LogUtil.d("WifiQrCodeHandler", "setLeftButtonOnClickListener finish");
        qrCodeSchemeActivity.finish();
    }

    private void b(Message message) {
        eby ebyVar;
        boolean zE;
        if (message.obj != null && (message.obj instanceof eby)) {
            ebyVar = (eby) message.obj;
            zE = e(ebyVar);
        } else {
            LogUtil.e("R_QrCode_WifiQrCodeHandler", "saveWiFiDevice msg obj is error ");
            ebyVar = null;
            zE = false;
        }
        LogUtil.a("R_QrCode_WifiQrCodeHandler", "saveDevice isSave ", Boolean.valueOf(zE));
        if (zE && ebyVar != null) {
            sendCallBack(0, this.mQrCodeDataBase.getAction(), ebyVar);
        } else {
            sendCallBack(-1, this.mQrCodeDataBase.getAction(), null);
        }
    }

    private boolean a(List<DeviceDetailInfo> list) {
        return njy.b(list);
    }

    private void c(List<DeviceDetailInfo> list, int i) {
        for (DeviceDetailInfo deviceDetailInfo : list) {
            if (ecb.e(deviceDetailInfo.getDevInfo().getProdId())) {
                ecb.a(deviceDetailInfo, "WifiQrCodeHandler");
                String sn = deviceDetailInfo.getDevInfo() != null ? deviceDetailInfo.getDevInfo().getSn() : "";
                if (!TextUtils.isEmpty(sn) && dmp.d().a(sn, false) == null) {
                    eby ebyVar = new eby();
                    ebyVar.c(deviceDetailInfo);
                    ebyVar.setAutoDevice(false);
                    ebyVar.a().b(i);
                    e(ebyVar);
                }
            }
        }
    }

    private boolean e(eby ebyVar) {
        elh elhVarB = b(ebyVar.a().h());
        if (elhVarB != null) {
            boolean z = dmp.d().a(ebyVar.getSerialNumber(), false) != null;
            ebyVar.setProductId(elhVarB.t());
            ebyVar.setKind(HealthDevice.HealthDeviceKind.HDK_WEIGHT);
            ebyVar.setAutoDevice(false);
            if (z) {
                return e(ebyVar, elhVarB);
            }
            return c(ebyVar, elhVarB);
        }
        LogUtil.j("R_QrCode_WifiQrCodeHandler", "saveDevice productInfo is null");
        return false;
    }

    private boolean c(eby ebyVar, elh elhVar) {
        return drw.e().a(ebyVar.getProductId(), elhVar.q(), ebyVar, new IDeviceEventHandler() { // from class: stm.5
            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onDeviceFound(HealthDevice healthDevice) {
            }

            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onScanFailed(int i) {
            }

            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onStateChanged(int i) {
                LogUtil.a("WifiQrCodeHandler", "saveDevice code ", Integer.valueOf(i));
            }
        });
    }

    private boolean e(eby ebyVar, elh elhVar) {
        return drw.e().c(ebyVar.getProductId(), elhVar.q(), ebyVar, new IDeviceEventHandler() { // from class: stm.3
            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onDeviceFound(HealthDevice healthDevice) {
            }

            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onScanFailed(int i) {
            }

            @Override // com.huawei.health.device.callback.IDeviceEventHandler
            public void onStateChanged(int i) {
                LogUtil.a("WifiQrCodeHandler", "updataDevice code ", Integer.valueOf(i));
            }
        });
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void sendCallBack(int i, String str, Object obj) {
        a(i, obj);
        super.sendCallBack(i, str, obj);
    }

    private boolean c(List<DeviceDetailInfo> list) {
        stj stjVar;
        if (!njy.e(list) && (stjVar = (stj) this.mQrCodeDataBase) != null) {
            Iterator<DeviceDetailInfo> it = list.iterator();
            while (it.hasNext()) {
                if (stjVar.b().equals(it.next().getDevId())) {
                    return true;
                }
            }
        }
        return false;
    }

    private List<DeviceDetailInfo> d(List<DeviceDetailInfo> list) {
        if (njy.e(list)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (DeviceDetailInfo deviceDetailInfo : list) {
            if (b(deviceDetailInfo)) {
                arrayList.add(deviceDetailInfo);
            }
        }
        return arrayList;
    }

    private void a(WifiDeviceGetAllDeviceRsp wifiDeviceGetAllDeviceRsp) {
        wifiDeviceGetAllDeviceRsp.setDeviceDetailInfoList(d(wifiDeviceGetAllDeviceRsp.getDeviceDetailInfoList()));
        wifiDeviceGetAllDeviceRsp.setAuthorizedDeviceDetailInfoList(d(wifiDeviceGetAllDeviceRsp.getAuthorizedDeviceDetailInfoList()));
    }

    private boolean b(DeviceDetailInfo deviceDetailInfo) {
        if (deviceDetailInfo == null || deviceDetailInfo.getDevInfo() == null || TextUtils.isEmpty(deviceDetailInfo.getDevId())) {
            return false;
        }
        String prodId = deviceDetailInfo.getDevInfo().getProdId();
        if (TextUtils.isEmpty(prodId)) {
            return false;
        }
        return (f48677b.contains(prodId) && njy.e(deviceDetailInfo.getServices())) ? false : true;
    }

    private void f() {
        LogUtil.a("WifiQrCodeHandler", "verifyDevice in");
        if (!ecj.b(dxw.d())) {
            sendCallBack(-5, this.mQrCodeDataBase.getAction(), null);
        } else {
            lqo.b(dxw.d()).d(new ICloudOperationResult() { // from class: sti
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                public final void operationResult(Object obj, String str, boolean z) {
                    this.e.d((WifiDeviceGetAllDeviceRsp) obj, str, z);
                }
            });
            ResourceManager.c().d();
        }
    }

    /* synthetic */ void d(WifiDeviceGetAllDeviceRsp wifiDeviceGetAllDeviceRsp, String str, boolean z) {
        int iIntValue;
        String resultDesc;
        if (z) {
            LogUtil.a("WifiQrCodeHandler", "verifyDevice reg device success :", wifiDeviceGetAllDeviceRsp.toString());
            List<DeviceDetailInfo> listD = d(wifiDeviceGetAllDeviceRsp.getDeviceDetailInfoList());
            List<DeviceDetailInfo> listD2 = d(wifiDeviceGetAllDeviceRsp.getAuthorizedDeviceDetailInfoList());
            if (a(listD)) {
                c(listD, 1);
            }
            if (a(listD2)) {
                c(listD2, 2);
            }
            if (c(listD2) || c(listD)) {
                LogUtil.j("R_QrCode_WifiQrCodeHandler", "verifyDevice() authorize same device");
                sendCallBack(-13, this.mQrCodeDataBase.getAction(), null);
                return;
            } else {
                e(listD);
                this.mMainThreadHandler.sendEmptyMessage(10001);
                return;
            }
        }
        if (wifiDeviceGetAllDeviceRsp == null) {
            iIntValue = Constants.CODE_UNKNOWN_ERROR;
            resultDesc = "unknown error";
        } else {
            iIntValue = wifiDeviceGetAllDeviceRsp.getResultCode().intValue();
            resultDesc = wifiDeviceGetAllDeviceRsp.getResultDesc();
        }
        if (iIntValue == 1003) {
            sendCallBack(-17, this.mQrCodeDataBase.getAction(), null);
        } else {
            sendCallBack(-12, this.mQrCodeDataBase.getAction(), null);
        }
        LogUtil.j("WifiQrCodeHandler", "verifyDevice() errCode = ", Integer.valueOf(iIntValue), ",resultDesc:", resultDesc);
    }

    private void e(List<DeviceDetailInfo> list) {
        String strA = a();
        if (list == null || strA == null) {
            return;
        }
        for (DeviceDetailInfo deviceDetailInfo : list) {
            if (dxm.t(deviceDetailInfo.getDevInfo().getProdId()).equals(strA) && deviceDetailInfo.getServices() == null) {
                LogUtil.a("WifiQrCodeHandler", "start to delete bluetooth device, deviceID = ", deviceDetailInfo.getDevId());
                ean.g(deviceDetailInfo.getDevId());
            }
        }
    }

    private void c(final int i) {
        LogUtil.a("WifiQrCodeHandler", "queryDevice in");
        if (e() == null) {
            LogUtil.j("R_QrCode_WifiQrCodeHandler", "queryDevice() activity is null ");
            sendCallBack(-1, this.mQrCodeDataBase.getAction(), null);
        } else {
            lqo.b(dxw.d()).d(new ICloudOperationResult() { // from class: stv
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                public final void operationResult(Object obj, String str, boolean z) {
                    this.d.b(i, (WifiDeviceGetAllDeviceRsp) obj, str, z);
                }
            });
        }
    }

    /* synthetic */ void b(int i, WifiDeviceGetAllDeviceRsp wifiDeviceGetAllDeviceRsp, String str, boolean z) {
        c(wifiDeviceGetAllDeviceRsp, z, i);
    }

    private Activity e() {
        if (this.mActivity != null) {
            return this.mActivity.get();
        }
        return null;
    }

    private eby c(List<DeviceDetailInfo> list, String str) {
        for (DeviceDetailInfo deviceDetailInfo : list) {
            if (str.equals(deviceDetailInfo.getDevId())) {
                ecb.a(deviceDetailInfo, "WifiQrCodeHandler");
                eby ebyVar = new eby();
                ebyVar.c(deviceDetailInfo);
                ebyVar.a().b(2);
                return ebyVar;
            }
        }
        LogUtil.e("R_QrCode_WifiQrCodeHandler", "getAuthDeviceInfo() get device is null");
        return null;
    }

    private void c(WifiDeviceGetAllDeviceRsp wifiDeviceGetAllDeviceRsp, boolean z, int i) {
        int iIntValue;
        String resultDesc;
        LogUtil.a("WifiQrCodeHandler", "processDeviceFromCloud in");
        if (!z) {
            if (wifiDeviceGetAllDeviceRsp == null) {
                iIntValue = Constants.CODE_UNKNOWN_ERROR;
                resultDesc = "unknown error";
            } else {
                iIntValue = wifiDeviceGetAllDeviceRsp.getResultCode().intValue();
                resultDesc = wifiDeviceGetAllDeviceRsp.getResultDesc();
            }
            b(i);
            LogUtil.a("WifiQrCodeHandler", "processDeviceFromCloud() errCode = ", Integer.valueOf(iIntValue), ",resultDesc:", resultDesc);
            return;
        }
        if (wifiDeviceGetAllDeviceRsp == null) {
            LogUtil.e("R_QrCode_WifiQrCodeHandler", "processDeviceFromCloud reg device success but rsp is null");
            b(i);
            return;
        }
        a(wifiDeviceGetAllDeviceRsp);
        if (wifiDeviceGetAllDeviceRsp.getAuthorizedDeviceDetailInfoList() == null || wifiDeviceGetAllDeviceRsp.getAuthorizedDeviceDetailInfoList().size() == 0) {
            LogUtil.e("R_QrCode_WifiQrCodeHandler", "processDeviceFromCloud reg device success but rsp.getDeviceDetailInfo is null");
            b(i);
            return;
        }
        if (this.mHandler == null) {
            LogUtil.e("R_QrCode_WifiQrCodeHandler", "processDeviceFromCloud() mHandler is null");
            return;
        }
        eby ebyVarC = c(wifiDeviceGetAllDeviceRsp.getAuthorizedDeviceDetailInfoList(), ((stj) this.mQrCodeDataBase).b());
        if (ebyVarC != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = ebyVarC;
            messageObtain.what = 1004;
            this.mHandler.sendMessage(messageObtain);
            return;
        }
        b(i);
    }

    private boolean b(eby ebyVar, eby ebyVar2) {
        if (ebyVar == null || ebyVar2 == null) {
            LogUtil.j("R_QrCode_WifiQrCodeHandler", "checkDeviceProdId device or authDevice is null");
            return false;
        }
        if (!ebyVar.a().h().equals(ebyVar2.a().h())) {
            return false;
        }
        LogUtil.a("R_QrCode_WifiQrCodeHandler", "checkDeviceProdId has same device");
        return true;
    }

    private void b(int i) {
        LogUtil.a("WifiQrCodeHandler", "queryNum is:", Integer.valueOf(i));
        if (i < 3) {
            Message messageObtain = Message.obtain();
            messageObtain.arg1 = i + 1;
            messageObtain.what = 1003;
            this.mHandler.sendMessage(messageObtain);
            return;
        }
        sendCallBack(-16, this.mQrCodeDataBase.getAction(), null);
    }

    private void d() {
        String accountInfo;
        LogUtil.a("WifiQrCodeHandler", "deviceAuth in");
        Activity activityE = e();
        if (activityE == null) {
            LogUtil.j("R_QrCode_WifiQrCodeHandler", "deviceAuth() activity is null ");
            sendCallBack(-1, this.mQrCodeDataBase.getAction(), null);
            return;
        }
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        if (userInfo != null) {
            accountInfo = userInfo.getName();
            LogUtil.a("R_QrCode_WifiQrCodeHandler", "deviceAuth HWUserProfileMgr in");
        } else {
            accountInfo = null;
        }
        if (TextUtils.isEmpty(accountInfo)) {
            accountInfo = new UpApi(activityE).getLegalAccountName();
            LogUtil.a("R_QrCode_WifiQrCodeHandler", "deviceAuth UpApi in");
        }
        if (TextUtils.isEmpty(accountInfo)) {
            accountInfo = LoginInit.getInstance(activityE).getAccountInfo(1000);
            LogUtil.a("R_QrCode_WifiQrCodeHandler", "deviceAuth SharedPreferenceUtil in");
        }
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.j("WifiQrCodeHandler", "SharedPreferenceUtil.getInstance(activity).getAccountName is null");
            accountInfo = LoginInit.getInstance(activityE).getAccountInfo(1002);
        }
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.j("R_QrCode_WifiQrCodeHandler", "get subNickName is null");
            sendCallBack(-15, this.mQrCodeDataBase.getAction(), null);
        } else {
            a(accountInfo, activityE);
        }
    }

    private void a(String str, Activity activity) {
        int length = str.length();
        if (length > 20) {
            str = str.substring(0, 10) + str.substring(length - 10, length);
        }
        stj stjVar = (stj) this.mQrCodeDataBase;
        if (e(stjVar.b())) {
            LogUtil.j("WifiQrCodeHandler", "shareToSubUser is wifi subUser");
            b(R.string.IDS_device_hygride_auth_user, (Context) activity);
            return;
        }
        LogUtil.j("WifiQrCodeHandler", "shareToSubUser is not wifi subUser");
        WifiDeviceAddAuthorizeForSubUserReq wifiDeviceAddAuthorizeForSubUserReq = new WifiDeviceAddAuthorizeForSubUserReq();
        wifiDeviceAddAuthorizeForSubUserReq.setDevId(stjVar.b());
        wifiDeviceAddAuthorizeForSubUserReq.setNickName(str);
        wifiDeviceAddAuthorizeForSubUserReq.setMainHuid(stjVar.c());
        wifiDeviceAddAuthorizeForSubUserReq.setVerifyCode(stjVar.a());
        lqo.b(activity).b(wifiDeviceAddAuthorizeForSubUserReq, new ICloudOperationResult() { // from class: stq
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str2, boolean z) {
                this.f48685b.a((CloudCommonReponse) obj, str2, z);
            }
        });
    }

    /* synthetic */ void a(CloudCommonReponse cloudCommonReponse, String str, boolean z) {
        if (z) {
            LogUtil.a("R_QrCode_WifiQrCodeHandler", "add deviceAuth Success.");
            b(0);
        } else {
            e(cloudCommonReponse);
        }
    }

    private boolean e(String str) throws Throwable {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        LogUtil.j("WifiQrCodeHandler", "checkCurrentUserIsSubUser currentUserHuid： ", accountInfo);
        eal ealVarA = ecf.a(str);
        ArrayList<eaj> arrayList = new ArrayList<>();
        if (ealVarA != null) {
            arrayList = ealVarA.e();
        } else {
            LogUtil.j("WifiQrCodeHandler", "deviceUserInfo is null.");
        }
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (eaj eajVar : arrayList) {
                LogUtil.j("WifiQrCodeHandler", "checkCurrentUserIsSubUser subUser.getNickName() = ", eajVar.c());
                arrayList2.add(eajVar.a());
            }
            if (arrayList2.contains(accountInfo)) {
                LogUtil.j("WifiQrCodeHandler", "checkCurrentUserIsSubUser have auth user > ", Integer.valueOf(R.string.IDS_device_hygride_auth_user));
                return true;
            }
            LogUtil.j("WifiQrCodeHandler", "checkCurrentUserIsSubUser current user is not subUser");
            return false;
        }
        LogUtil.j("WifiQrCodeHandler", "checkCurrentUserIsSubUser current device have none subUser");
        return false;
    }

    private void e(CloudCommonReponse cloudCommonReponse) {
        if (cloudCommonReponse == null) {
            sendCallBack(-15, this.mQrCodeDataBase.getAction(), null);
            return;
        }
        Integer resultCode = cloudCommonReponse.getResultCode();
        int iIntValue = resultCode.intValue();
        String resultDesc = cloudCommonReponse.getResultDesc();
        if (iIntValue == 112000020) {
            sendCallBack(-13, this.mQrCodeDataBase.getAction(), null);
        } else if (iIntValue == 112000060) {
            sendCallBack(-14, this.mQrCodeDataBase.getAction(), null);
        } else if (iIntValue == 112000070) {
            sendCallBack(-17, this.mQrCodeDataBase.getAction(), null);
        } else if (iIntValue == 112000010) {
            sendCallBack(-18, this.mQrCodeDataBase.getAction(), null);
        } else {
            sendCallBack(-15, this.mQrCodeDataBase.getAction(), null);
        }
        LogUtil.e("WifiQrCodeHandler", "deviceAuth error: ", resultCode, ", resultDesc: ", resultDesc);
    }

    private boolean c(stj stjVar) {
        this.mQrCodeDataBase = stjVar;
        return true;
    }

    private elh a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("R_QrCode_WifiQrCodeHandler", "getProduct productId is null");
            return null;
        }
        return ResourceManager.c().d(str);
    }

    private elh b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("R_QrCode_WifiQrCodeHandler", "getProductInfo prodId is null");
            return null;
        }
        LogUtil.a("WifiQrCodeHandler", "getProductInfo prodId is ", str);
        eto etoVarA = DeviceListManager.c(dxw.d()).a(str);
        elh elhVarA = etoVarA != null ? a(etoVarA.d) : null;
        if (elhVarA != null) {
            return elhVarA;
        }
        LogUtil.j("R_QrCode_WifiQrCodeHandler", "getProductInfo The product obtained from Table is empty");
        String strT = dxm.t(str);
        if (TextUtils.isEmpty(strT)) {
            LogUtil.j("R_QrCode_WifiQrCodeHandler", "getProductInfo productId is null");
            return elhVarA;
        }
        return a(strT);
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeBaseHandler
    public void mainHandleMessage(Message message, Activity activity) {
        LogUtil.a("WifiQrCodeHandler", "updateResourceFile: isPluginAvaiable is true and msg.what = ", Integer.valueOf(message.what));
        int i = message.what;
        if (i == 1016) {
            b(R.string.IDS_device_wifi_my_qrcode_error_qrcode, (Context) activity);
            b();
            d(activity);
            return;
        }
        if (i != 10015) {
            switch (i) {
                case 10001:
                    f(activity);
                    break;
                case 10002:
                    g(activity);
                    e(activity, message.obj);
                    break;
                case 10003:
                    b(activity);
                    break;
                case 10004:
                    b(R.string.IDS_network_connect_error, (Context) activity);
                    b();
                    d(activity);
                    break;
                case 10005:
                    b(R.string.IDS_device_wifi_my_qrcode_overdue, (Context) activity);
                    b();
                    d(activity);
                    break;
                case 10006:
                    c(message, activity);
                    break;
                case 10007:
                    b(R.string.IDS_hwh_ali_sport_auth_failed, (Context) activity);
                    b();
                    d(activity);
                    break;
                case 10008:
                    b(activity, activity.getString(R.string.IDS_device_wifi_my_qrcode_add_member_duplicate_msg));
                    break;
                default:
                    a(message, activity);
                    break;
            }
            return;
        }
        LogUtil.a("WifiQrCodeHandler", "mainHandleMessage MSG_INIT_SCALE_VIEW");
        i(activity);
    }

    private void b(Activity activity) {
        if (this.f48678c) {
            b(R.string.IDS_device_wifi_scheme_link_error, (Context) activity);
        } else {
            b(R.string.IDS_device_wifi_my_qrcode_error_qrcode, (Context) activity);
        }
        b();
        d(activity);
    }

    private void f(Activity activity) {
        if (this.d != null && EzPluginManager.b().j(this.d) && dxm.ad(this.d) && !dzu.e(this.d, "HDK_WEIGHT")) {
            LogUtil.a("WifiQrCodeHandler", "updateResourceFile: isPluginAvaiable is true and mProductId = ", CommonUtil.n(this.d));
            dzu.e(BaseApplication.getContext(), activity);
        } else {
            c(activity);
        }
    }

    private void c(Message message, Activity activity) {
        if (message.obj != null && (message.obj instanceof eby)) {
            d(activity, (eby) message.obj);
        } else {
            LogUtil.j("R_QrCode_WifiQrCodeHandler", "main Handler device is null or class error");
        }
    }

    private void a(Message message, Activity activity) {
        switch (message.what) {
            case 10009:
                b(R.string.IDS_device_wifi_my_qrcode_error_qrcode, (Context) activity);
                b();
                d(activity);
                break;
            case 10010:
                b();
                d(activity);
                break;
            case 10011:
                if (this.f48678c) {
                    b(R.string.IDS_device_wifi_scheme_link_scanning_loading, activity);
                } else {
                    b(R.string.IDS_device_wifi_my_qrcode_add_member_loading, activity);
                }
                break;
            case 10012:
                b(R.string.IDS_device_wifi_my_qrcode_auth_loadding_message, activity);
                break;
            case 10013:
                if (this.f48678c) {
                    b(R.string.IDS_device_wifi_scheme_link_expired, (Context) activity);
                } else {
                    b(R.string.IDS_device_wifi_my_qrcode_overdue, (Context) activity);
                }
                b();
                d(activity);
                break;
            case PrebakedEffectId.RT_CALENDAR_DATE /* 10014 */:
                b(activity, activity.getString(R.string.IDS_device_wifi_my_qrcode_add_member_exceeding_limit));
                break;
            default:
                LogUtil.a("WifiQrCodeHandler", "mainHandleMessage what is error:", Integer.valueOf(message.what));
                break;
        }
    }

    private void e(Activity activity) {
        b();
        activity.finish();
    }

    private void a(int i, Object obj) {
        LogUtil.a("R_QrCode_WifiQrCodeHandler", "handleErrorEvent errorCode:", Integer.valueOf(i));
        Message messageObtain = Message.obtain();
        switch (i) {
            case com.tencent.connect.common.Constants.ERROR_PROXY_LOGIN_AND_QQ_VERSION_LOWER /* -18 */:
                messageObtain.what = PrebakedEffectId.RT_CALENDAR_DATE;
                break;
            case -17:
                messageObtain.what = 10013;
                break;
            case com.tencent.connect.common.Constants.ERROR_IMAGE_TOO_LARGE /* -16 */:
            case -15:
            case -12:
                messageObtain.what = 10007;
                break;
            case -14:
                messageObtain.what = 10009;
                break;
            case -13:
                messageObtain.what = 10008;
                break;
            case -11:
                messageObtain.obj = obj;
                messageObtain.what = 10006;
                break;
            case -10:
            case -9:
            case -8:
            case -7:
            default:
                LogUtil.a("WifiQrCodeHandler", "handleErrorEvent other errorCode ,", Integer.valueOf(i));
                return;
            case -6:
                messageObtain.what = 10005;
                break;
            case -5:
                messageObtain.what = 10004;
                break;
            case -4:
            case -3:
            case -2:
                messageObtain.what = 10003;
                break;
            case -1:
                messageObtain.what = 10010;
                break;
            case 0:
                messageObtain.what = 10002;
                messageObtain.obj = obj;
                break;
        }
        this.mMainThreadHandler.sendMessage(messageObtain);
    }

    private void b(int i, Context context) {
        if (context != null) {
            qpx.e(context.getApplicationContext(), i);
        }
    }

    private void b(int i, Activity activity) {
        String string = activity.getString(i);
        if (this.e == null) {
            new CommonDialog21(activity, R.style.app_update_dialogActivity);
            this.e = CommonDialog21.b(activity);
        }
        this.e.setCancelable(false);
        this.e.b(string);
        this.e.c();
    }

    private void b() {
        CommonDialog21 commonDialog21 = this.e;
        if (commonDialog21 == null || !commonDialog21.isShowing()) {
            return;
        }
        this.e.dismiss();
        this.e = null;
    }

    private void d(Activity activity) {
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    private void b(final Activity activity, String str) {
        b();
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(activity);
        builder.a(str).c(R.string.IDS_user_permission_know, new View.OnClickListener() { // from class: str
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48686c.d(activity, view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCanceledOnTouchOutside(false);
        noTitleCustomAlertDialogC.show();
    }

    /* synthetic */ void d(Activity activity, View view) {
        d(activity);
    }

    private void d(final Activity activity, final eby ebyVar) {
        b();
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(activity);
        String string = activity.getString(R.string.IDS_device_wifi_my_qrcode_add_member_failed_title);
        builder.e(string).a(activity.getString(R.string.IDS_device_wifi_my_qrcode_add_member_has_other_scales_msg)).a(R.string.IDS_hw_weight_wifi_outh_dialog_unbind_buttom, new View.OnClickListener() { // from class: stt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48688b.e(activity, ebyVar, view);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: stl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48676b.b(activity, view);
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCanceledOnTouchOutside(false);
        customTextAlertDialogB.show();
    }

    /* synthetic */ void e(Activity activity, eby ebyVar, View view) {
        b(activity, ebyVar);
    }

    /* synthetic */ void b(Activity activity, View view) {
        d(activity);
    }

    private void b(Activity activity, eby ebyVar) {
        String productId;
        LogUtil.a("WifiQrCodeHandler", "gotoDeviceControl in");
        e(activity);
        ArrayList<eby> arrayListD = drw.e().d();
        if (arrayListD == null || arrayListD.size() == 0) {
            LogUtil.e("R_QrCode_WifiQrCodeHandler", "gotoDeviceControl local devices is null");
            return;
        }
        Iterator<eby> it = arrayListD.iterator();
        while (true) {
            if (!it.hasNext()) {
                productId = null;
                break;
            }
            eby next = it.next();
            if (b(next, ebyVar)) {
                productId = next.getProductId();
                break;
            }
        }
        if (TextUtils.isEmpty(productId)) {
            LogUtil.e("R_QrCode_WifiQrCodeHandler", "gotoDeviceControl productId is null");
        } else {
            a(activity, productId);
            LogUtil.a("R_QrCode_WifiQrCodeHandler", "gotoDeviceControl out");
        }
    }

    private void a(Activity activity, String str) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        intent.setAction("SWITCH_PLUGINDEVICE");
        bundle.putString("arg1", "DeviceInfoList");
        bundle.putString("productId", str);
        intent.setPackage(com.huawei.haf.application.BaseApplication.d());
        intent.setClassName(com.huawei.haf.application.BaseApplication.d(), "com.huawei.health.device.ui.DeviceMainActivity");
        intent.putExtras(bundle);
        try {
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("WifiQrCodeHandler", "startWifiFragment startActivity ActivityNotFoundException.");
        }
    }

    private void g(Activity activity) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        lmf.d().c(activity, AnalyticsValue.HEALTH_PLUGIN_DEVICE_WIFI_DEVICE_MULTIACCOUNT_ADD_SUCCESS_2060034.value(), map, 0);
    }

    private void e(Activity activity, Object obj) {
        LogUtil.a("WifiQrCodeHandler", "gotoUserActivity in");
        b();
        if (obj != null && (obj instanceof eby)) {
            eby ebyVar = (eby) obj;
            Intent intent = new Intent();
            intent.putExtra("device", "wifi");
            intent.putExtra("auth_device_id", ebyVar.e());
            intent.putExtra("productId", ebyVar.getProductId());
            ContentValues contentValues = new ContentValues();
            contentValues.put("productId", ebyVar.getProductId());
            MeasurableDevice measurableDeviceA = dmp.d().a(ebyVar.getSerialNumber(), false);
            if (measurableDeviceA != null) {
                contentValues.put("uniqueId", measurableDeviceA.getUniqueId());
            } else {
                contentValues.put("uniqueId", ebyVar.getUniqueId());
            }
            intent.putExtra("commonDeviceInfo", contentValues);
            intent.setClassName(com.huawei.haf.application.BaseApplication.d(), "com.huawei.ui.main.stories.me.activity.BindUserInfoActivity");
            try {
                activity.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("WifiQrCodeHandler", "gotoUserActivity startActivity ActivityNotFoundException.");
            }
            activity.finish();
            return;
        }
        LogUtil.e("R_QrCode_WifiQrCodeHandler", "gotoUserActivity object is not wifi device or object is null");
    }

    private void c(int i, View view) {
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.hw_privacy_auth_item_two);
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.hw_privacy_auth_cancel_by_setting);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.hw_privacy_auth_layout_healthdata);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.hw_privacy_auth_layout_userinfo);
        if (i == 1) {
            healthTextView.setVisibility(8);
            healthTextView2.setVisibility(8);
            linearLayout.setVisibility(8);
            linearLayout2.setVisibility(8);
            return;
        }
        if (i == 2) {
            healthTextView.setVisibility(0);
            healthTextView2.setVisibility(0);
            linearLayout.setVisibility(0);
            linearLayout2.setVisibility(8);
            return;
        }
        if (i == 3) {
            healthTextView.setVisibility(0);
            healthTextView2.setVisibility(0);
            linearLayout.setVisibility(8);
            linearLayout2.setVisibility(0);
            return;
        }
        if (i == 4) {
            healthTextView.setVisibility(0);
            healthTextView2.setVisibility(0);
            linearLayout.setVisibility(0);
            linearLayout2.setVisibility(0);
            return;
        }
        LogUtil.a("WifiQrCodeHandler", "setDialogView status is error", Integer.valueOf(i));
    }

    private void e(int i, final Activity activity) {
        final wmq wmqVarA = wmq.a(activity);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(activity);
        View viewInflate = View.inflate(activity, R.layout.dialog_show_privacy_auth, null);
        c(i, viewInflate);
        final boolean z = i == 1;
        builder.b(R.string.IDS_device_wifi_privacy_auth).d(viewInflate).c(R.string.IDS_hw_show_cancel, new View.OnClickListener() { // from class: stn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48681a.a(activity, view);
            }
        }).d(R.string.IDS_hw_show_agree, new View.OnClickListener() { // from class: stp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48684c.e(z, wmqVarA, view);
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        customViewDialogD.setCanceledOnTouchOutside(false);
        customViewDialogD.show();
    }

    /* synthetic */ void a(Activity activity, View view) {
        if (this.f48678c) {
            return;
        }
        d(activity);
    }

    /* synthetic */ void e(boolean z, wmq wmqVar, View view) {
        if (!z) {
            wmqVar.a(2, true);
            wmqVar.a(300, true);
            wmqVar.a(7, true);
            wmqVar.a(301, true);
        }
        this.mHandler.sendEmptyMessage(1001);
        this.mMainThreadHandler.sendEmptyMessage(10012);
    }

    private void c(Activity activity) {
        LogUtil.a("R_QrCode_WifiQrCodeHandler", "getPrivacyAuthSwitchStatus in");
        b();
        wmq wmqVarA = wmq.a(activity);
        String strC = wmqVarA.c(2);
        String strC2 = wmqVarA.c(7);
        if ("true".equals(strC) && "true".equals(strC2)) {
            e(1, activity);
            return;
        }
        if ("true".equals(strC) && !"true".equals(strC2)) {
            e(2, activity);
            return;
        }
        if (!"true".equals(strC) && "true".equals(strC2)) {
            e(3, activity);
        } else if (!"true".equals(strC) && !"true".equals(strC2)) {
            e(4, activity);
        } else {
            LogUtil.e("R_QrCode_WifiQrCodeHandler", "switch status is error");
        }
    }

    private void c() {
        e(3);
    }

    private void e(final int i) {
        LogUtil.a("R_QrCode_WifiQrCodeHandler", "updateResourceFileWithRetry ", Integer.valueOf(i));
        if (!ecj.b(dxw.d())) {
            LogUtil.e("R_QrCode_WifiQrCodeHandler", "updateResourceFileWithRetry fail: no network");
            sendCallBack(-5, this.mQrCodeDataBase.getAction(), null);
            return;
        }
        String strA = a();
        if (TextUtils.isEmpty(strA)) {
            LogUtil.a("R_QrCode_WifiQrCodeHandler", "updateResourceFile: product id is null");
            this.mHandler.sendEmptyMessage(1002);
            return;
        }
        this.d = strA;
        if (EzPluginManager.b().j(strA)) {
            LogUtil.a("R_QrCode_WifiQrCodeHandler", "updateResourceFile: isPluginAvaiable is true");
            if (!d(((stj) this.mQrCodeDataBase).e())) {
                this.mMainThreadHandler.sendEmptyMessage(1016);
                return;
            } else {
                this.mHandler.sendEmptyMessage(1002);
                return;
            }
        }
        if (i <= 0) {
            LogUtil.e("R_QrCode_WifiQrCodeHandler", "updateResourceFileWithRetry fail");
            sendCallBack(-1, this.mQrCodeDataBase.getAction(), null);
        } else {
            dxp.b(strA, new PullListener() { // from class: sto
                @Override // com.huawei.pluginmgr.filedownload.PullListener
                public final void onPullingChange(pis pisVar, pit pitVar) {
                    this.e.e(i, pisVar, pitVar);
                }
            });
        }
    }

    /* synthetic */ void e(int i, pis pisVar, pit pitVar) {
        if (pitVar == null || pitVar.f() == 0) {
            return;
        }
        LogUtil.a("WifiQrCodeHandler", "updateResourceFile onPullingChange ", Integer.valueOf(pitVar.f()));
        e(i - 1);
    }

    private String a() {
        return dxm.t(((stj) this.mQrCodeDataBase).e());
    }

    private boolean d(String str) {
        elh elhVarB = b(str);
        if (elhVarB == null) {
            LogUtil.a("WifiQrCodeHandler", "isDeviceResourceCanUsing productInfo is null");
            return false;
        }
        int iE = CommonUtil.e(BaseApplication.getContext());
        LogUtil.a("WifiQrCodeHandler", "isDeviceResourceCanUsing currentVersion =", Integer.valueOf(iE));
        String strA = elhVarB.a();
        try {
            return TextUtils.isEmpty(strA) || ((long) iE) >= Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            LogUtil.e("WifiQrCodeHandler", "isDeviceResourceCanUsing NumberFormatException");
        }
    }
}
