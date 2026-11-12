package com.huawei.ui.thirdpartservice.activity.wechatdevice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.core.H5ProWebView;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.columnlayout.HealthColumnLinearLayout;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.thirdpartservice.R;
import com.huawei.ui.thirdpartservice.syncdata.wechatdevice.SdkManager;
import defpackage.ddv;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.wzi;
import defpackage.wzz;
import defpackage.xaf;
import defpackage.xal;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class WeChatDeviceAuthorizeActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f29139b;
    private String f;
    private String g;
    private ImageView h;
    private DeviceInfo i;
    private String k;
    private CustomTitleBar m;
    private final Handler o = new d();
    private CommonDialog21 n = null;
    private CustomViewDialog j = null;
    private WebView l = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f29140c = {R.string.IDS_wx_device_auth_privilege_1, R.string.IDS_wx_device_auth_privilege_2, R.string.IDS_wx_device_auth_privilege_3, R.string.IDS_wx_device_auth_privilege_4};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29138a = "file:///android_asset/silent_login/entry/index.html";
    private final String d = "silentLogin";
    private final BroadcastReceiver e = new BroadcastReceiver() { // from class: com.huawei.ui.thirdpartservice.activity.wechatdevice.WeChatDeviceAuthorizeActivity.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            LogUtil.a("WeChatDeviceAuthorizeActivity", "Receive broadcast action = ", action);
            if (action.equals("com.huawei.ui.thirdpartservice.SILENT_LOGIN_JS_RESPONSE")) {
                WeChatDeviceAuthorizeActivity.this.a(intent.getStringExtra("serverAuthCode"));
            }
            if (action.equals("com.huawei.ui.thirdpartservice.WX_MINIPTOGRAM_LAUNCH")) {
                ReleaseLogUtil.d("R_WeChatDeviceAuthorizeActivity", "mBroadcastReceiver launch wechat app");
                WeChatDeviceAuthorizeActivity.this.o.removeMessages(-1);
                if (CommonUtil.x(WeChatDeviceAuthorizeActivity.this)) {
                    WeChatDeviceAuthorizeActivity.this.finish();
                } else {
                    WeChatDeviceAuthorizeActivity.this.f29139b = true;
                }
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_wechat_device_authorize);
        d(getIntent());
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        a();
        if (this.f29139b) {
            finish();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        WebView webView = this.l;
        if (webView != null) {
            webView.removeAllViews();
            this.l.destroy();
            this.l = null;
        }
        LocalBroadcastManager.getInstance().unregisterReceiver(this.e);
    }

    private void d(Intent intent) {
        if (intent == null) {
            return;
        }
        k();
        String stringExtra = intent.getStringExtra("name");
        this.k = intent.getStringExtra("wxLinkSdkId");
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.device_title_bar);
        this.m = customTitleBar;
        customTitleBar.setTitleText(stringExtra);
        this.h = (ImageView) findViewById(R.id.device_img);
        this.g = intent.getStringExtra("identify");
        b(this.g, intent.getStringExtra("deviceIconUrl"));
        boolean booleanExtra = intent.getBooleanExtra("isLocalBound", true);
        this.i = booleanExtra ? xaf.b(this.g) : null;
        final boolean booleanExtra2 = intent.getBooleanExtra("isAuthorized", false);
        this.f = booleanExtra2 ? intent.getStringExtra("deviceCode") : null;
        ((HealthTextView) findViewById(R.id.device_authorized_tips)).setText(booleanExtra2 ? R.string.IDS_wx_device_cancel_auth_tips : R.string.IDS_wx_device_auth_tips);
        g();
        a(!booleanExtra);
        HealthButton healthButton = (HealthButton) findViewById(R.id.btn_authorize);
        healthButton.setBackgroundResource(booleanExtra2 ? R.drawable.hwbutton_default_emui : R.drawable.button_background_emphasize);
        healthButton.setTextColor(getColor(booleanExtra2 ? R.color.common_colorAccent : R.color.common_color_white));
        healthButton.setText(booleanExtra2 ? R.string.IDS_cancel_authorize : R.string.IDS_hw_authorize);
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: wyj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52597b.d(booleanExtra2, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(boolean z, View view) {
        if (z) {
            c();
        } else {
            h();
        }
    }

    private void k() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.ui.thirdpartservice.SILENT_LOGIN_JS_RESPONSE");
        intentFilter.addAction("com.huawei.ui.thirdpartservice.WX_MINIPTOGRAM_LAUNCH");
        LocalBroadcastManager.getInstance().registerReceiver(this.e, intentFilter);
    }

    private void b(String str, String str2) {
        LogUtil.a("WeChatDeviceAuthorizeActivity", "loadDeviceImg Identify = ", CommonUtil.n(str), " , Url = ", str2);
        Bitmap bitmapB = !TextUtils.isEmpty(str) ? wzz.b(str) : null;
        if (bitmapB != null) {
            this.h.setImageBitmap(bitmapB);
            LogUtil.d("WeChatDeviceAuthorizeActivity", "load device image from local , Identify = ", CommonUtil.n(str));
        } else {
            LogUtil.d("WeChatDeviceAuthorizeActivity", "load device image from network , Url = ", str2);
            qqf.e(str2, RequestOptions.bitmapTransform(new RoundedCorners((int) getResources().getDimension(com.huawei.ui.main.R.dimen.defaultCornerRadiusM))), this.h);
        }
    }

    private void g() {
        HealthColumnLinearLayout healthColumnLinearLayout = (HealthColumnLinearLayout) findViewById(R.id.device_authorized_privilege_layout);
        for (int i : this.f29140c) {
            View viewInflate = LayoutInflater.from(this).inflate(R.layout.item_wechat_device_auth_dot, (ViewGroup) null, false);
            ((HealthTextView) viewInflate.findViewById(R.id.tv_third_party_auth_content)).setText(i);
            healthColumnLinearLayout.addView(viewInflate);
        }
    }

    private void a(boolean z) {
        ((HealthTextView) findViewById(R.id.device_unbound_title)).setVisibility(z ? 0 : 4);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.device_unbound_tip_layout);
        HealthTextView healthTextView = (HealthTextView) relativeLayout.findViewById(R.id.tv_third_party_auth_content);
        relativeLayout.setVisibility(z ? 0 : 8);
        healthTextView.setVisibility(z ? 0 : 8);
        healthTextView.setText(R.string.IDS_wx_device_unbound_tip);
    }

    private void h() {
        if (e() && d()) {
            f();
            wzz.d(this.i, (ICloudOperationResult<String>) new ICloudOperationResult() { // from class: wyh
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                public final void operationResult(Object obj, String str, boolean z) {
                    this.d.a((String) obj, str, z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, boolean z) {
        ReleaseLogUtil.d("R_WeChatDeviceAuthorizeActivity", "getDeviceCodeAsync deviceCode = ", str, " resp = ", str2);
        Message messageObtainMessage = this.o.obtainMessage();
        messageObtainMessage.what = z ? 1 : -1;
        messageObtainMessage.obj = str;
        this.o.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Message message) {
        int i = message.what;
        if (i == -1) {
            a();
            int iIntValue = R.string.IDS_hwh_ali_sport_net_error;
            if (message.obj instanceof Integer) {
                iIntValue = ((Integer) message.obj).intValue();
            }
            qpx.e(BaseApplication.b(), iIntValue);
            return;
        }
        if (i == 1) {
            if (message.obj instanceof String) {
                this.f = (String) message.obj;
            }
            i();
        } else if (i == 2 && (message.obj instanceof String)) {
            a((String) message.obj);
        }
    }

    private void c() {
        if (e() && d()) {
            j();
        }
    }

    private void i() {
        H5ProWebView h5ProWebView = (H5ProWebView) findViewById(R.id.h5_webview);
        boolean z = CommonUtil.z(this);
        LogUtil.a("WeChatDeviceAuthorizeActivity", "performSilentLogin isHmsLiteEnable = ", Boolean.valueOf(z));
        if (!z) {
            ddv.b().initH5Pro();
            H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
            builder.addCustomizeJsModule("silentLogin", xal.class);
            H5ProClient.startH5LightApp("file:///android_asset/silent_login/entry/index.html", h5ProWebView, builder.build());
            return;
        }
        LogUtil.a("WeChatDeviceAuthorizeActivity", "performSilentLogin with HMS Lite");
        if (this.l == null) {
            H5ProInstance h5ProWebView2 = h5ProWebView.getInstance();
            this.l = h5ProWebView2 == null ? null : h5ProWebView2.getWebView();
        }
        if (this.l == null) {
            LogUtil.e("WeChatDeviceAuthorizeActivity", "performSilentLogin mWebView is null");
        } else {
            runOnUiThread(new wzi(this.l, new ICloudOperationResult() { // from class: wym
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                public final void operationResult(Object obj, String str, boolean z2) {
                    this.f52599c.e((String) obj, str, z2);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(String str, String str2, boolean z) {
        LogUtil.a("WeChatDeviceAuthorizeActivity", "HMS Lite auth isSuccess = ", Boolean.valueOf(z), " , response = ", str);
        boolean z2 = z && !TextUtils.isEmpty(str2);
        Message messageObtainMessage = this.o.obtainMessage();
        messageObtainMessage.what = z2 ? 2 : -1;
        if (!z2) {
            str2 = null;
        }
        messageObtainMessage.obj = str2;
        this.o.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        LogUtil.a("WeChatDeviceAuthorizeActivity", "handleAuthorize serverAuthCode = ", str);
        if (TextUtils.isEmpty(this.f) || TextUtils.isEmpty(str)) {
            ReleaseLogUtil.a("R_WeChatDeviceAuthorizeActivity", "handleAuthorize deviceCode or serverAuthCode is empty");
            a();
            qpx.e(BaseApplication.b(), R.string.IDS_hwh_ali_sport_net_error);
            return;
        }
        wzz.d(d(str), (ICloudOperationResult<String>) new ICloudOperationResult() { // from class: wys
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str2, boolean z) {
                this.f52602c.d((String) obj, str2, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    public /* synthetic */ void d(String str, final String str2, boolean z) {
        byte b2;
        LogUtil.a("WeChatDeviceAuthorizeActivity", "handleAuthorize bindDeviceSync isSuccess = ", Boolean.valueOf(z), ", ticket = ", str2);
        if (!z || TextUtils.isEmpty(str2)) {
            ReleaseLogUtil.a("R_WeChatDeviceAuthorizeActivity", "handleAuthorize bindDeviceSync error :", str2);
            a();
            str2.hashCode();
            int iHashCode = str2.hashCode();
            if (iHashCode != -1761149810) {
                if (iHashCode != 436492011) {
                    if (iHashCode == 2113577665 && str2.equals("bind device error")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (str2.equals("server error")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (str2.equals("wechat error")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                qpx.e(BaseApplication.b(), R.string.IDS_wx_device_platform_error_tips);
                return;
            }
            if (b2 == 1) {
                qpx.e(BaseApplication.b(), R.string.IDS_hwh_home_group_server_exception);
                return;
            } else if (b2 == 2) {
                qpx.e(BaseApplication.b(), R.string.IDS_wx_bind_device_error_tips);
                return;
            } else {
                qpx.e(BaseApplication.b(), R.string.IDS_plugin_achievement_network_error_msg_content_2);
                return;
            }
        }
        ReleaseLogUtil.d("R_WeChatDeviceAuthorizeActivity", "handleAuthorize bindDeviceSync success");
        this.o.post(new Runnable() { // from class: wyi
            @Override // java.lang.Runnable
            public final void run() {
                this.f52595a.c(str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        new SdkManager().c(this, str, new SdkManager.launchWechatCallBack() { // from class: wyl
            @Override // com.huawei.ui.thirdpartservice.syncdata.wechatdevice.SdkManager.launchWechatCallBack
            public final void onLaunchFailed() {
                this.f52598b.a();
            }
        });
        Message messageObtain = Message.obtain();
        messageObtain.obj = Integer.valueOf(R.string.IDS_wx_device_platform_error_tips);
        messageObtain.what = -1;
        this.o.sendMessageDelayed(messageObtain, 10000L);
    }

    private Map<String, String> d(String str) {
        HashMap map = new HashMap();
        map.put("deviceCode", this.f);
        map.put("authorizationCode", str);
        map.put("certModel", this.i.getCertModel());
        map.put("deviceName", this.i.getDeviceName());
        map.put("deviceModelName", this.i.getDeviceModel());
        map.put("deviceUdid", this.i.getDeviceUdid());
        return map;
    }

    private boolean d() {
        if (CommonUtil.ab(this)) {
            return true;
        }
        qpx.e(BaseApplication.b(), R.string.IDS_connect_network);
        return false;
    }

    private boolean e() {
        if (SdkManager.e()) {
            return true;
        }
        qpx.e(BaseApplication.b(), R.string.IDS_plugin_socialshare_install_wechat);
        return false;
    }

    private void j() {
        if (this.j != null) {
            return;
        }
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.dialog_oauth_revoke, (ViewGroup) null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.oauth_health_dialog_text);
        if (healthTextView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) healthTextView.getLayoutParams();
            layoutParams.topMargin = (int) TypedValue.applyDimension(1, 24.0f, getResources().getDisplayMetrics());
            healthTextView.setLayoutParams(layoutParams);
        }
        healthTextView.setText(R.string.IDS_wx_device_cancel_auth_dlg);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this);
        builder.b(false);
        builder.d(viewInflate);
        builder.a(getString(R.string.IDS_hw_common_ui_dialog_confirm).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: wyn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(view);
            }
        });
        builder.c(getString(R.string.IDS_hw_common_ui_dialog_cancel).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: wyk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e(view);
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.j = customViewDialogD;
        customViewDialogD.setCanceledOnTouchOutside(false);
        this.j.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        wzz.b(this, this.k, new SdkManager.launchWechatCallBack() { // from class: wye
            @Override // com.huawei.ui.thirdpartservice.syncdata.wechatdevice.SdkManager.launchWechatCallBack
            public final void onLaunchFailed() {
                this.f52593c.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        CustomViewDialog customViewDialog = this.j;
        if (customViewDialog != null) {
            customViewDialog.dismiss();
            this.j = null;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        a();
        b();
    }

    private void f() {
        if (this.n == null && !isFinishing()) {
            CommonDialog21 commonDialog21B = CommonDialog21.b(this);
            this.n = commonDialog21B;
            commonDialog21B.b(getString(R.string.IDS_sns_waiting));
            this.n.setCancelable(false);
            this.n.c();
            this.n.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        CommonDialog21 commonDialog21;
        if (isFinishing() || (commonDialog21 = this.n) == null) {
            return;
        }
        commonDialog21.dismiss();
        this.n = null;
    }

    /* JADX INFO: loaded from: classes20.dex */
    static class d extends BaseHandler<WeChatDeviceAuthorizeActivity> {
        private d(WeChatDeviceAuthorizeActivity weChatDeviceAuthorizeActivity) {
            super(weChatDeviceAuthorizeActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(WeChatDeviceAuthorizeActivity weChatDeviceAuthorizeActivity, Message message) {
            weChatDeviceAuthorizeActivity.e(message);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
