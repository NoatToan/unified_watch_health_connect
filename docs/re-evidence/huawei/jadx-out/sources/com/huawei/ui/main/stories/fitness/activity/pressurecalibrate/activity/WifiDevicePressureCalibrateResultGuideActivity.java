package com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.wifi.lib.handler.StaticHandler;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.DeviceServiceInfo;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceControlDataModelReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceServiceInfoReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceServiceInfoRsp;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.activity.WifiDevicePressureCalibrateResultGuideActivity;
import defpackage.dne;
import defpackage.dnj;
import defpackage.dor;
import defpackage.dxm;
import defpackage.eby;
import defpackage.ece;
import defpackage.ecf;
import defpackage.iov;
import defpackage.lqo;
import defpackage.uey;
import defpackage.ugb;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class WifiDevicePressureCalibrateResultGuideActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomTextAlertDialog f26965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NoTitleCustomAlertDialog f26967c;
    private HealthTextView d;
    private c g;
    private Context j;
    private CustomTitleBar p;
    private String s = "";
    private String q = "";
    private String k = "";
    private String r = "";
    private String l = "";
    private String o = "";
    private String t = "";
    private String n = "";
    private String h = "";
    private List<String> i = new ArrayList(16);
    private long f = 0;
    private long e = 0;
    private String m = "";

    static class c extends StaticHandler<WifiDevicePressureCalibrateResultGuideActivity> {
        c(WifiDevicePressureCalibrateResultGuideActivity wifiDevicePressureCalibrateResultGuideActivity) {
            super(wifiDevicePressureCalibrateResultGuideActivity);
        }

        @Override // com.huawei.health.device.wifi.lib.handler.StaticHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessage(WifiDevicePressureCalibrateResultGuideActivity wifiDevicePressureCalibrateResultGuideActivity, Message message) throws Throwable {
            if (wifiDevicePressureCalibrateResultGuideActivity.a()) {
                LogUtil.d("WifiDevicePressureCalibrateResultGuideActivity", "mCurrentt activity is finished...");
                return;
            }
            LogUtil.d("WifiDevicePressureCalibrateResultGuideActivity", "msg = ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 1) {
                wifiDevicePressureCalibrateResultGuideActivity.g.removeMessages(2);
                wifiDevicePressureCalibrateResultGuideActivity.c(false);
                return;
            }
            if (i == 2) {
                wifiDevicePressureCalibrateResultGuideActivity.c();
                wifiDevicePressureCalibrateResultGuideActivity.g.sendEmptyMessageDelayed(2, 5000L);
                return;
            }
            if (i == 3) {
                wifiDevicePressureCalibrateResultGuideActivity.g.removeMessages(2);
                wifiDevicePressureCalibrateResultGuideActivity.g.removeMessages(1);
                wifiDevicePressureCalibrateResultGuideActivity.c(false);
            } else if (i == 4) {
                wifiDevicePressureCalibrateResultGuideActivity.g.removeMessages(2);
                wifiDevicePressureCalibrateResultGuideActivity.g.removeMessages(1);
                wifiDevicePressureCalibrateResultGuideActivity.c(true);
            } else {
                if (i != 5) {
                    return;
                }
                wifiDevicePressureCalibrateResultGuideActivity.g.removeMessages(2);
                wifiDevicePressureCalibrateResultGuideActivity.g.removeMessages(1);
                wifiDevicePressureCalibrateResultGuideActivity.g();
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        setContentView(R.layout.activity_wifi_device_pressure_calibrate_result_guide);
        this.j = this;
        this.g = new c(this);
        this.f = System.currentTimeMillis();
        uey.a().e(true);
        Intent intent = getIntent();
        if (intent != null) {
            this.f26966b = intent.getIntExtra("wifi_device_calibrate_score", -1);
            this.s = intent.getStringExtra("health_wifi_device_userId");
            this.m = intent.getStringExtra("health_wifi_device_productId");
        }
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.hw_wifi_device_pressure_calibrate_title_layout);
        this.p = customTitleBar;
        customTitleBar.setLeftButtonClickable(true);
        this.p.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: uff
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50030c.e(view);
            }
        });
        this.d = (HealthTextView) findViewById(R.id.hw_wifi_device_pressure_calibrate_prompt);
        this.d.setText(this.j.getResources().getString(R.string.IDS_device_wifi_pressure_calibrate_two_step_msg));
        f();
        d();
    }

    public /* synthetic */ void e(View view) {
        j();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (4 == i) {
            j();
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        if (!isFinishing() && !isDestroyed()) {
            return false;
        }
        LogUtil.e("WifiDevicePressureCalibrateResultGuideActivity", "Activity is Destroyed");
        return true;
    }

    private void j() {
        String string = this.j.getResources().getString(R.string.IDS_hw_show_card_pressure_calibrate_dialog_notify);
        String string2 = this.j.getResources().getString(R.string.IDS_hw_show_card_pressure_calibrate_dialog_text);
        String string3 = this.j.getResources().getString(R.string.IDS_hw_common_ui_dialog_cancel);
        String string4 = this.j.getResources().getString(R.string.IDS_hw_common_ui_dialog_confirm);
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.j);
        builder.e(string).a(string2).b(string4, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.activity.WifiDevicePressureCalibrateResultGuideActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("WifiDevicePressureCalibrateResultGuideActivity", "button click stop");
                WifiDevicePressureCalibrateResultGuideActivity.this.finish();
            }
        }).a(string3, new View.OnClickListener() { // from class: ufl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("WifiDevicePressureCalibrateResultGuideActivity", "button click cancel");
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        this.f26965a = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        this.f26965a.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.f26967c;
        if (noTitleCustomAlertDialog == null || !noTitleCustomAlertDialog.isShowing()) {
            String string = this.j.getResources().getString(R.string.IDS_device_wifi_pressure_calibrate_fail_msg);
            String string2 = this.j.getResources().getString(R.string.IDS_hw_common_ui_dialog_cancel);
            String string3 = this.j.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_again);
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.j);
            builder.a(string).a(string3, new View.OnClickListener() { // from class: ufg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Throwable {
                    this.f50031b.d(view);
                }
            }).d(string2, new View.OnClickListener() { // from class: ufj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.c(view);
                }
            });
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
            this.f26967c = noTitleCustomAlertDialogC;
            noTitleCustomAlertDialogC.setCancelable(false);
            this.f26967c.show();
        }
    }

    public /* synthetic */ void d(View view) throws Throwable {
        LogUtil.a("WifiDevicePressureCalibrateResultGuideActivity", "button click retry");
        e();
    }

    public /* synthetic */ void c(View view) {
        LogUtil.a("WifiDevicePressureCalibrateResultGuideActivity", "button click cancel");
        finish();
    }

    private void d() {
        this.g.removeMessages(1);
        this.g.removeMessages(2);
        this.g.sendEmptyMessageDelayed(1, 300000L);
        this.g.sendEmptyMessageDelayed(2, 5000L);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c cVar = this.g;
        if (cVar != null) {
            cVar.removeMessages(1);
            this.g.removeMessages(2);
        }
        CustomTextAlertDialog customTextAlertDialog = this.f26965a;
        if (customTextAlertDialog != null) {
            if (customTextAlertDialog.isShowing()) {
                this.f26965a.dismiss();
            }
            this.f26965a = null;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.f26967c;
        if (noTitleCustomAlertDialog != null) {
            if (noTitleCustomAlertDialog.isShowing()) {
                this.f26967c.dismiss();
            }
            this.f26967c = null;
        }
        uey.a().u();
        ugb.b().w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        b();
        Intent intent = new Intent(this.j, (Class<?>) WifiDevicePressureCalibrateResultActivity.class);
        intent.putExtra("health_wifi_device_userId", this.s);
        intent.putExtra("health_wifi_device_productId", this.m);
        intent.putExtra("pressure_is_have_datas", z);
        if (z) {
            intent.putExtra("mResultHrv", this.o);
        }
        iov.d(this.j, intent);
        finish();
    }

    private void e() throws Throwable {
        long j = this.f;
        String str = this.n;
        LogUtil.d("WifiDevicePressureCalibrateResultGuideActivity", "mCurrentTime = ", Long.valueOf(j), "mResultHrvCalibDateTime = ", str, "(Long.valueOf(mResultHrvCalibDateTime) - mCurrentTime)  = ", Long.valueOf(CommonUtil.m(this.j, str) - this.f));
        if (((int) (CommonUtil.i(this.n) - this.f)) <= 300000) {
            LogUtil.e("WifiDevicePressureCalibrateResultGuideActivity", "retry call setPressureAdjustScore");
            f();
            this.g.sendEmptyMessage(2);
            this.g.sendEmptyMessageDelayed(1, 300000L);
            return;
        }
        Intent intent = new Intent(this.j, (Class<?>) WifiDevicePressureCalibrateGuideActivity.class);
        intent.putExtra("pressure_is_have_datas", false);
        intent.putExtra("health_wifi_device_userId", this.s);
        intent.putExtra("health_device_type", "wifi_device");
        intent.putExtra("health_wifi_device_productId", this.m);
        iov.d(this.j, intent);
        finish();
    }

    private void f() throws Throwable {
        WifiDeviceControlDataModelReq wifiDeviceControlDataModelReq = new WifiDeviceControlDataModelReq();
        ArrayList arrayList = new ArrayList(16);
        DeviceServiceInfo deviceServiceInfo = new DeviceServiceInfo();
        HashMap map = new HashMap(4);
        map.put("id", String.valueOf(LoginInit.getInstance(this.j).getAccountInfo(1011)));
        dnj singleUserById = MultiUsersManager.INSTANCE.getSingleUserById(this.s);
        dnj mainUser = MultiUsersManager.INSTANCE.getMainUser();
        if (singleUserById == null) {
            LogUtil.d("WifiDevicePressureCalibrateResultGuideActivity", "user is null");
            return;
        }
        eby ebyVarE = ecf.e(this.m);
        if (ebyVarE == null || TextUtils.isEmpty(ebyVarE.a().c())) {
            LogUtil.e("WifiDevicePressureCalibrateResultGuideActivity", "device is null or deviceId is null");
            return;
        }
        wifiDeviceControlDataModelReq.setDevId(ebyVarE.a().c());
        if (singleUserById.i().equals(mainUser.i())) {
            map.put("uid", String.valueOf(0));
        } else {
            map.put("uid", this.s);
        }
        map.put(CommonConstant.KEY_GENDER, String.valueOf((int) dne.a(singleUserById.d())));
        map.put("age", String.valueOf(singleUserById.c()));
        map.put("height", String.valueOf(singleUserById.e()));
        map.put("hrvparam", String.valueOf(this.f26966b));
        if (dor.b(dxm.f(ebyVarE.getSerialNumber()))) {
            map.put("month", String.valueOf(dor.e(singleUserById.j())));
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.e = jCurrentTimeMillis;
        LogUtil.d("WifiDevicePressureCalibrateResultGuideActivity", "mCalibrateStartTime = " + this.e);
        map.put("hrvCalibDateTime", String.valueOf(jCurrentTimeMillis));
        map.put("isDelete", String.valueOf(0));
        deviceServiceInfo.setData(map);
        if ("0".equals(a(singleUserById))) {
            deviceServiceInfo.setSid(ece.f32732a);
        } else {
            deviceServiceInfo.setSid(singleUserById.g());
        }
        DeviceServiceInfo deviceServiceInfoE = e(deviceServiceInfo, ebyVarE);
        LogUtil.a("WifiDevicePressureCalibrateResultGuideActivity", "Sid = ", deviceServiceInfoE.getSid());
        arrayList.add(deviceServiceInfoE);
        wifiDeviceControlDataModelReq.setDeviceServiceInfo(arrayList);
        a(wifiDeviceControlDataModelReq);
    }

    private DeviceServiceInfo e(DeviceServiceInfo deviceServiceInfo, eby ebyVar) {
        String sid = deviceServiceInfo.getSid();
        if (sid.indexOf("_") >= 0) {
            if (ebyVar.a().m() != 2) {
                deviceServiceInfo.setSid(sid.substring(0, sid.indexOf("_")));
                return deviceServiceInfo;
            }
        } else if (ebyVar.a().m() == 2) {
            deviceServiceInfo.setSid(sid + "_" + LoginInit.getInstance(this.j).getAccountInfo(1011));
        }
        return deviceServiceInfo;
    }

    private void a(WifiDeviceControlDataModelReq wifiDeviceControlDataModelReq) {
        lqo.b(this.j).e(wifiDeviceControlDataModelReq, new ICloudOperationResult() { // from class: ufi
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                WifiDevicePressureCalibrateResultGuideActivity.d((CloudCommonReponse) obj, str, z);
            }
        });
    }

    public static /* synthetic */ void d(CloudCommonReponse cloudCommonReponse, String str, boolean z) {
        int iIntValue;
        String resultDesc;
        if (z) {
            LogUtil.a("WifiDevicePressureCalibrateResultGuideActivity", "setPressureAdjustScore success ");
            return;
        }
        if (cloudCommonReponse == null) {
            iIntValue = Constants.CODE_UNKNOWN_ERROR;
            resultDesc = "unknown error";
        } else {
            iIntValue = cloudCommonReponse.getResultCode().intValue();
            resultDesc = cloudCommonReponse.getResultDesc();
        }
        LogUtil.a("WifiDevicePressureCalibrateResultGuideActivity", "clear error: ", Integer.valueOf(iIntValue), ", resultDesc: ", resultDesc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() throws Throwable {
        WifiDeviceServiceInfoReq wifiDeviceServiceInfoReq = new WifiDeviceServiceInfoReq();
        eby ebyVarE = ecf.e(this.m);
        if (ebyVarE == null || TextUtils.isEmpty(ebyVarE.a().c())) {
            LogUtil.e("WifiDevicePressureCalibrateResultGuideActivity", "device is null or deviceId is null");
            return;
        }
        wifiDeviceServiceInfoReq.setDevId(ebyVarE.a().c());
        wifiDeviceServiceInfoReq.setSid("devResult");
        lqo.b(this.j).d(wifiDeviceServiceInfoReq, new ICloudOperationResult() { // from class: ufk
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.f50033a.d((WifiDeviceServiceInfoRsp) obj, str, z);
            }
        });
    }

    public /* synthetic */ void d(WifiDeviceServiceInfoRsp wifiDeviceServiceInfoRsp, String str, boolean z) {
        Message messageObtain = Message.obtain();
        if (!z) {
            LogUtil.a("WifiDevicePressureCalibrateResultGuideActivity", "get device info fail");
            return;
        }
        if (wifiDeviceServiceInfoRsp == null || wifiDeviceServiceInfoRsp.getDeviceServiceInfo() == null || wifiDeviceServiceInfoRsp.getDeviceServiceInfo().isEmpty()) {
            LogUtil.a("WifiDevicePressureCalibrateResultGuideActivity", "get device info is empty");
        } else {
            Iterator<DeviceServiceInfo> it = wifiDeviceServiceInfoRsp.getDeviceServiceInfo().iterator();
            while (it.hasNext()) {
                c(it.next());
                if (TextUtils.isEmpty(this.t) || "3".equals(this.l)) {
                    LogUtil.a("WifiDevicePressureCalibrateResultGuideActivity", "StartHrvCalibDateTime is null or mResultCode is invalid");
                    return;
                }
                if (!TextUtils.isEmpty(this.t) && this.e - CommonUtil.i(this.t) != 0) {
                    LogUtil.a("WifiDevicePressureCalibrateResultGuideActivity", "mResultStartHrvCalibDateTime not match");
                    return;
                }
                if ("0".equals(this.l) && !TextUtils.isEmpty(this.o)) {
                    messageObtain.what = 4;
                } else if ("1".equals(this.l)) {
                    messageObtain.what = 3;
                } else if (!"2".equals(this.l)) {
                    LogUtil.a("WifiDevicePressureCalibrateResultGuideActivity", "mResultStartHrvCalibDateTime err");
                } else {
                    messageObtain.what = 5;
                }
            }
        }
        this.g.sendMessage(messageObtain);
    }

    private void c(DeviceServiceInfo deviceServiceInfo) {
        Map<String, String> data = deviceServiceInfo.getData();
        if (data != null) {
            for (Map.Entry<String, String> entry : data.entrySet()) {
                String key = entry.getKey();
                if (TextUtils.equals(key, "code")) {
                    this.l = entry.getValue();
                }
                if (TextUtils.equals(key, "type")) {
                    this.q = entry.getValue();
                }
                if (TextUtils.equals(key, "uid")) {
                    this.r = entry.getValue();
                }
                if (TextUtils.equals(key, "id")) {
                    this.k = entry.getValue();
                }
                if (TextUtils.equals(key, "hrv")) {
                    this.o = entry.getValue();
                }
                if (TextUtils.equals(key, "hrvCalibDateTime")) {
                    this.n = entry.getValue();
                }
                if (TextUtils.equals(key, "hrvStartCalibDateTime")) {
                    this.t = entry.getValue();
                }
                if (TextUtils.equals(key, "hrvUserInfo")) {
                    this.h = entry.getValue();
                }
                if (TextUtils.equals(key, "hrvUserInfo1")) {
                    c(entry.getValue());
                }
                if (TextUtils.equals(key, "hrvUserInfo2")) {
                    c(entry.getValue());
                }
                if (TextUtils.equals(key, "hrvUserInfo3")) {
                    c(entry.getValue());
                }
                if (TextUtils.equals(key, "hrvUserInfo4")) {
                    c(entry.getValue());
                }
            }
        }
    }

    private void b() {
        String strValueOf = String.valueOf(LoginInit.getInstance(this.j).getAccountInfo(1011));
        if (TextUtils.isEmpty(strValueOf)) {
            LogUtil.a("WifiDevicePressureCalibrateResultGuideActivity", "huid is empty");
            return;
        }
        if (TextUtils.isEmpty(this.h)) {
            LogUtil.a("WifiDevicePressureCalibrateResultGuideActivity", "main user hrvInfo is empty");
            return;
        }
        if (this.h.contains(":")) {
            int iIndexOf = this.h.indexOf(":");
            if (iIndexOf > 0 && strValueOf.equals(this.h.substring(0, iIndexOf).trim())) {
                String str = this.h;
                b(str.substring(str.indexOf(":") + 1, this.h.length()));
                return;
            }
            List<String> list = this.i;
            if (list != null && list.size() > 0) {
                for (String str2 : this.i) {
                    if (!str2.contains(":")) {
                        LogUtil.a("WifiDevicePressureCalibrateResultGuideActivity", "sub user hrvInfo is format error");
                        return;
                    }
                    int iIndexOf2 = str2.indexOf(":");
                    if (iIndexOf2 > 0 && strValueOf.equals(str2.substring(0, iIndexOf2).trim())) {
                        b(str2.substring(str2.indexOf(":") + 1, str2.length()));
                        return;
                    }
                }
                return;
            }
            LogUtil.a("WifiDevicePressureCalibrateResultGuideActivity", "sub user hrvInfo is empty");
            return;
        }
        LogUtil.a("WifiDevicePressureCalibrateResultGuideActivity", "mHrvUserInfo is not contains");
        b(this.h);
    }

    private void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LogUtil.a("WifiDevicePressureCalibrateResultGuideActivity", "storage mHrvUserInfo = ", str);
        SharedPreferenceManager.e(this.j, String.valueOf(10000), "pressure_calibrate_hrv_userinfo_" + this.m, str, null);
    }

    private String a(dnj dnjVar) {
        if (dnjVar == null || dnjVar.i() == null || "0".equals(dnjVar.i())) {
            return "0";
        }
        String strI = MultiUsersManager.INSTANCE.getMainUser().i();
        if (strI != null && strI.equals(dnjVar.i())) {
            return "0";
        }
        return dnjVar.i();
    }

    private void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.i.add(str);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
