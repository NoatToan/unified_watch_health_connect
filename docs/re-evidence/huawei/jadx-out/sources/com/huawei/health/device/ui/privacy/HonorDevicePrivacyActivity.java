package com.huawei.health.device.ui.privacy;

import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.device.api.DeviceGeneralSettingApi;
import com.huawei.health.device.callback.DeleteDeviceCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.webview.WebViewActivity;
import defpackage.dmp;
import defpackage.dwq;
import defpackage.lon;
import defpackage.qqz;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class HonorDevicePrivacyActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f6415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6417c = false;
    private CustomTextAlertDialog d;
    private Context e;
    private CustomTitleBar f;
    private LinearLayout g;
    private LinearLayout i;
    private String j;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.honor_device_privacy_layout);
        d();
        ArrayList<ContentValues> arrayListC = dmp.d().c("25c6df38-ca23-11e9-a32f-2a2ae2dbcce4");
        LogUtil.a("DevicePrivacyActivity", "isMultipleDevices bondedDeviceCount ", Integer.valueOf(arrayListC.size()));
        int size = arrayListC.size();
        int iB = SharedPreferenceManager.b(this.e);
        LogUtil.a("DevicePrivacyActivity", "isMultipleDevices wearDeviceCount ", Integer.valueOf(iB));
        if (iB + size > 1) {
            this.f6417c = true;
        }
        this.f6416b = GRSManager.c(BaseApplication.getContext()).getCommonCountryCode();
    }

    private void d() {
        this.e = this;
        this.f = (CustomTitleBar) qsp.a(this, R.id.titlebar);
        this.i = (LinearLayout) qsp.a(this, R.id.rela_revoked);
        this.g = (LinearLayout) qsp.a(this, R.id.ll_license_agreement);
        this.f6415a = (LinearLayout) qsp.a(this, R.id.rela_about);
        this.i.setOnClickListener(this);
        this.g.setOnClickListener(this);
        this.f6415a.setOnClickListener(this);
        ImageView imageView = (ImageView) qsp.a(this, R.id.iv_privacy_arrow_about);
        ImageView imageView2 = (ImageView) qsp.a(this, R.id.iv_privacy_arrow_license_agreement);
        ImageView imageView3 = (ImageView) qsp.a(this, R.id.iv_privacy_arrow_revoked);
        if (LanguageUtil.ba(this.e)) {
            Context context = this.e;
            BitmapDrawable bitmapDrawableE = qqz.e(context, context.getResources().getDrawable(com.huawei.ui.commonui.R.drawable.common_ui_arrow_right));
            imageView.setImageDrawable(bitmapDrawableE);
            imageView3.setImageDrawable(bitmapDrawableE);
            imageView2.setImageDrawable(bitmapDrawableE);
        }
        this.f.setTitleTextColor(getResources().getColor(R.color.emui_color_text_primary));
        this.f.setTitleBarBackgroundColor(getResources().getColor(R.color.colorSubBackground));
        this.f.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: dws
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.a(view);
            }
        });
    }

    public /* synthetic */ void a(View view) {
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.rela_revoked) {
            LogUtil.a("DevicePrivacyActivity", "click revoked");
            if (this.f6417c) {
                c();
                return;
            } else {
                g();
                return;
            }
        }
        if (id == R.id.rela_about) {
            LogUtil.a("DevicePrivacyActivity", "click about");
            this.j = this.e.getResources().getString(R.string.IDS_honor_about_privacy);
            if (!qrs.r()) {
                a(1);
                return;
            } else {
                LogUtil.j("DevicePrivacyActivity", "click too fast");
                return;
            }
        }
        if (id == R.id.ll_license_agreement) {
            LogUtil.j("DevicePrivacyActivity", "click License agreement");
            this.j = this.e.getResources().getString(R.string.IDS_honor_license_agreement);
            if (!qrs.r()) {
                a(2);
                return;
            } else {
                LogUtil.j("DevicePrivacyActivity", "click too fast");
                return;
            }
        }
        LogUtil.j("DevicePrivacyActivity", "click other");
    }

    private void a(int i) {
        LogUtil.a("DevicePrivacyActivity", "jump to HonorDevicePrivacyWebViewActivity");
        Intent intent = new Intent(this.e, (Class<?>) WebViewActivity.class);
        intent.putExtra("WebViewActivity.REQUEST_URL_KEY", b(i));
        intent.putExtra(Constants.JUMP_MODE_KEY, 10);
        intent.putExtra("WebViewActivity.TITLE", this.j);
        try {
            this.e.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("DevicePrivacyActivity", "goBackToLastPage ActivityNotFoundException");
        }
    }

    private void g() {
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.e).a(R.string.IDS_honor_cancel_services).b(R.string.IDS_honor_cancel_privacy).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: dwo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f32461c.d(view);
            }
        }).a(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: dwt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.b(view);
            }
        }).b();
        this.d = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        if (isFinishing()) {
            return;
        }
        this.d.show();
    }

    public /* synthetic */ void d(View view) {
        LogUtil.a("DevicePrivacyActivity", "showSwitchDeviceDialog click cancel");
        CustomTextAlertDialog customTextAlertDialog = this.d;
        if (customTextAlertDialog != null) {
            customTextAlertDialog.dismiss();
        }
        this.d = null;
    }

    public /* synthetic */ void b(View view) {
        LogUtil.a("DevicePrivacyActivity", "showSwitchDeviceDialog click ok.");
        a();
        CustomTextAlertDialog customTextAlertDialog = this.d;
        if (customTextAlertDialog != null) {
            customTextAlertDialog.dismiss();
        }
        this.d = null;
    }

    private void c() {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this);
        builder.e(this.e.getResources().getString(R.string.IDS_hw_health_show_common_dialog_title)).a(this.e.getResources().getString(R.string.IDS_honor_privacy_tips)).b(this.e.getResources().getString(R.string.IDS_hw_pressure_known), new View.OnClickListener() { // from class: dwn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.j("DevicePrivacyActivity", "onClick");
            }
        });
        builder.b().show();
    }

    private void a() {
        if ("ARKUIX".equals(getIntent().getStringExtra("wear_legal_come_from"))) {
            e();
        } else {
            b();
        }
    }

    private void e() {
        String stringExtra = getIntent().getStringExtra("device_id");
        if (TextUtils.isEmpty(stringExtra)) {
            LogUtil.a("DevicePrivacyActivity", "arkuiHandlerCancel deviceId isEmpty");
            return;
        }
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j("DevicePrivacyActivity", "arkuiHandlerCancel DeviceGeneralSettingApi == null");
        } else {
            deviceGeneralSettingApi.deleteDevice(stringExtra, "", false, new AnonymousClass4());
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.device.ui.privacy.HonorDevicePrivacyActivity$4, reason: invalid class name */
    public class AnonymousClass4 implements DeleteDeviceCallback {
        AnonymousClass4() {
        }

        @Override // com.huawei.health.device.callback.DeleteDeviceCallback
        public void onSuccess() {
            LogUtil.a("DevicePrivacyActivity", "arkuiHandlerCancel deleteDevice onSuccess");
            dwq.c(false);
            HonorDevicePrivacyActivity.this.finish();
            HandlerExecutor.c(new Runnable() { // from class: dwr
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.c();
                }
            });
        }

        public /* synthetic */ void c() {
            HonorDevicePrivacyActivity honorDevicePrivacyActivity = HonorDevicePrivacyActivity.this;
            honorDevicePrivacyActivity.e(honorDevicePrivacyActivity.e);
        }

        @Override // com.huawei.health.device.callback.DeleteDeviceCallback
        public void onFail(String str) {
            LogUtil.a("DevicePrivacyActivity", "arkuiHandlerCancel deleteDevice onFail");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        if (context == null) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.health.MainActivity");
            intent.setFlags(67108864);
            intent.putExtra(Constants.HOME_TAB_NAME, Constants.HOME_TAB_DEVICE);
            intent.putExtra("SHORTCUT", "SC_DEVICE");
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("DevicePrivacyActivity", "ActivityNotFoundException e：", e.getMessage());
        }
    }

    private void b() {
        Intent intent = new Intent();
        intent.putExtra("revoke_honor_privacy", true);
        setResult(10005, intent);
        finish();
    }

    private String b(int i) {
        String str;
        String strA = LanguageUtil.a(Locale.getDefault());
        String script = Locale.getDefault().getScript();
        if (TextUtils.isEmpty(this.f6416b)) {
            String strE = SharedPreferenceManager.e(this.e, Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "select_country");
            this.f6416b = strE;
            if (TextUtils.isEmpty(strE)) {
                this.f6416b = "GB";
            }
        }
        String country = Locale.getDefault().getCountry();
        if (TextUtils.isEmpty(script)) {
            str = strA + "_" + country;
        } else {
            str = strA + "_" + script + "_" + country;
        }
        String strD = lon.c().d("domain_honor");
        if (i == 1) {
            return strD + "/minisite/cloudservice/Health/privacy-statement.htm?country=" + this.f6416b + com.huawei.openalliance.ad.constant.Constants.LANGUAGE + str;
        }
        if (i == 2) {
            return strD + "/minisite/cloudservice/Health/terms.htm?country=" + this.f6416b + com.huawei.openalliance.ad.constant.Constants.LANGUAGE + str;
        }
        LogUtil.j("DevicePrivacyActivity", "getUrl error type");
        return "";
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
