package com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouterUtils;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.wifi.lib.handler.StaticHandler;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetWifiDeviceInfoReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetWifiDeviceInfoRsp;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.fragment.PressureCalibrateQuestionActivity;
import defpackage.ean;
import defpackage.eby;
import defpackage.ecf;
import defpackage.elk;
import defpackage.etn;
import defpackage.lqo;
import defpackage.uey;
import defpackage.vlt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class WifiDevicePressureCalibrateGuideActivity extends BaseActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f26961c;
    private HealthButton d;
    private CustomTitleBar e;
    private d i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f26959a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f26960b = "";
    private View.OnClickListener h = new View.OnClickListener() { // from class: ufe
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f50029b.a(view);
        }
    };
    private View.OnClickListener f = new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.activity.WifiDevicePressureCalibrateGuideActivity.3
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (WifiDevicePressureCalibrateGuideActivity.this.c(ResourceManager.c().b().d(), HealthDevice.HealthDeviceKind.HDK_WEIGHT.name()) != null) {
                vlt.b();
                etn.a(WifiDevicePressureCalibrateGuideActivity.this.f26961c, "HDK_WEIGHT");
                WifiDevicePressureCalibrateGuideActivity.this.finish();
                return;
            }
            LogUtil.a("WifiDevicePressureCalibrateGuideActivity", "WEIGHT ProductGroup is error ");
        }
    };

    /* JADX INFO: loaded from: classes19.dex */
    static class d extends StaticHandler<WifiDevicePressureCalibrateGuideActivity> {
        d(WifiDevicePressureCalibrateGuideActivity wifiDevicePressureCalibrateGuideActivity) {
            super(wifiDevicePressureCalibrateGuideActivity);
        }

        @Override // com.huawei.health.device.wifi.lib.handler.StaticHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessage(WifiDevicePressureCalibrateGuideActivity wifiDevicePressureCalibrateGuideActivity, Message message) {
            if (wifiDevicePressureCalibrateGuideActivity.isFinishing() || wifiDevicePressureCalibrateGuideActivity.isDestroyed()) {
                LogUtil.e("WifiDevicePressureCalibrateGuideActivity", "WifiDevicePressureCalibrateGuideActivity is Destroyed");
                return;
            }
            LogUtil.a("WifiDevicePressureCalibrateGuideActivity", "MyHandler what:", Integer.valueOf(message.what));
            if (message.what == 104) {
                if (message.obj == null) {
                    wifiDevicePressureCalibrateGuideActivity.e((String) null);
                    return;
                } else {
                    wifiDevicePressureCalibrateGuideActivity.e(String.valueOf(message.obj));
                    return;
                }
            }
            LogUtil.j("WifiDevicePressureCalibrateGuideActivity", "MyHandler what is other");
        }
    }

    public /* synthetic */ void a(View view) {
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        setContentView(R.layout.activity_wifi_device_pressure_calibrate_guide);
        this.f26961c = this;
        this.i = new d(this);
        uey.a().e(true);
        Intent intent = getIntent();
        if (intent != null) {
            this.f26959a = intent.getStringExtra("health_wifi_device_userId");
            this.f26960b = intent.getStringExtra("health_wifi_device_productId");
            a(intent);
        }
        this.e = (CustomTitleBar) findViewById(R.id.hw_wifi_device_pressure_calibrate_title_bar);
        this.d = (HealthButton) findViewById(R.id.hw_wifi_device_pressure_calibrate_start_btn);
        a();
        e();
    }

    private void a(Intent intent) {
        Uri uriB;
        if (!TextUtils.isEmpty(this.f26960b) || (uriB = AppRouterUtils.b(intent)) == null) {
            return;
        }
        this.f26960b = uriB.getQueryParameter("productId");
        this.f26959a = uriB.getQueryParameter("useId");
        LogUtil.a("WifiDevicePressureCalibrateGuideActivity", "init from uri");
    }

    private void a() {
        this.e.setLeftButtonClickable(true);
        this.e.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: ufa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(view);
            }
        });
        this.d.setOnClickListener(new View.OnClickListener() { // from class: ufd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50028c.e(view);
            }
        });
    }

    public /* synthetic */ void d(View view) {
        finish();
    }

    public /* synthetic */ void e(View view) {
        LogUtil.a("WifiDevicePressureCalibrateGuideActivity", "TO PressureCalibrateQuestionActivity time = ", Long.valueOf(System.currentTimeMillis()));
        c(PressureCalibrateQuestionActivity.class);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        LogUtil.a("WifiDevicePressureCalibrateGuideActivity", "keyCode = ", Integer.valueOf(i));
        if (i == 4) {
            finish();
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }

    private void c(Class cls) {
        Intent intent = new Intent(this.f26961c, (Class<?>) cls);
        intent.putExtra("health_device_type", "wifi_device");
        intent.putExtra("health_wifi_device_userId", this.f26959a);
        intent.putExtra("health_wifi_device_productId", this.f26960b);
        startActivity(intent);
        finish();
    }

    private void e() throws Throwable {
        LogUtil.a("WifiDevicePressureCalibrateGuideActivity", "checkDevice() checkDevice mProductId:", this.f26960b);
        final eby ebyVarE = ecf.e(this.f26960b);
        if (ebyVarE == null) {
            LogUtil.a("WifiDevicePressureCalibrateGuideActivity", "checkDevice() mWiFiDevice is null");
            Message messageObtain = Message.obtain();
            messageObtain.what = 104;
            this.i.sendMessage(messageObtain);
            return;
        }
        WifiDeviceGetWifiDeviceInfoReq wifiDeviceGetWifiDeviceInfoReq = new WifiDeviceGetWifiDeviceInfoReq();
        wifiDeviceGetWifiDeviceInfoReq.setDevId(ebyVarE.a().c());
        lqo.b(this.f26961c).b(wifiDeviceGetWifiDeviceInfoReq, new ICloudOperationResult() { // from class: ufc
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.f50027b.e(ebyVarE, (WifiDeviceGetWifiDeviceInfoRsp) obj, str, z);
            }
        });
    }

    public /* synthetic */ void e(eby ebyVar, WifiDeviceGetWifiDeviceInfoRsp wifiDeviceGetWifiDeviceInfoRsp, String str, boolean z) {
        int iIntValue;
        String resultDesc;
        if (!z) {
            if (wifiDeviceGetWifiDeviceInfoRsp == null) {
                iIntValue = Constants.CODE_UNKNOWN_ERROR;
                resultDesc = "unknown error";
            } else {
                iIntValue = wifiDeviceGetWifiDeviceInfoRsp.getResultCode().intValue();
                resultDesc = wifiDeviceGetWifiDeviceInfoRsp.getResultDesc();
                if (iIntValue == 112000000) {
                    LogUtil.a("WifiDevicePressureCalibrateGuideActivity", "device already not exists");
                    Message messageObtain = Message.obtain();
                    messageObtain.obj = ebyVar.e();
                    messageObtain.what = 104;
                    this.i.sendMessage(messageObtain);
                }
            }
            LogUtil.a("WifiDevicePressureCalibrateGuideActivity", "checkDevice() errCode = ", Integer.valueOf(iIntValue), ",resultDesc:", resultDesc);
            return;
        }
        if (wifiDeviceGetWifiDeviceInfoRsp == null || wifiDeviceGetWifiDeviceInfoRsp.getDeviceDetailInfo() != null) {
            LogUtil.a("WifiDevicePressureCalibrateGuideActivity", "checkDevice() device already exists");
            return;
        }
        LogUtil.a("WifiDevicePressureCalibrateGuideActivity", "checkDevice() device already not exists");
        Message messageObtain2 = Message.obtain();
        messageObtain2.obj = ebyVar.e();
        messageObtain2.what = 104;
        this.i.sendMessage(messageObtain2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public elk c(ArrayList<elk> arrayList, String str) {
        elk elkVar = null;
        for (elk elkVar2 : arrayList) {
            LogUtil.a("WifiDevicePressureCalibrateGuideActivity", " item.kind.name() = ", elkVar2.e().name(), " deviceType = ", str);
            if (elkVar2.e().name().equals(str)) {
                elkVar = elkVar2;
            }
        }
        return elkVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        this.i.removeCallbacksAndMessages(null);
        ean.c(this.f26961c, str, this.h, this.f);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
