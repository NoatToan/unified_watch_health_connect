package com.huawei.appgallery.coreservice.internal.service.installhiapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.appgallery.coreservice.R;
import com.huawei.appgallery.coreservice.api.ConnectConfig;
import com.huawei.appgallery.marketinstallerservice.api.FailResultParam;
import com.huawei.appgallery.marketinstallerservice.api.InstallCallback;
import com.huawei.appgallery.marketinstallerservice.api.InstallParamSpec;
import com.huawei.appgallery.marketinstallerservice.api.InstallerApi;
import com.huawei.appgallery.marketinstallerservice.api.MarketInfo;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.secure.android.common.intent.SafeIntent;
import defpackage.bhl;
import defpackage.bhn;

/* JADX INFO: loaded from: classes23.dex */
public class GuideInstallAppGallery extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConnectConfig f5216a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5217c;
    private AlertDialog d = null;

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        AlertDialog alertDialog = this.d;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        this.d.dismiss();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        bhn.b("GuideInstallAppGallery", "onCreate");
        SafeIntent safeIntent = new SafeIntent(getIntent());
        this.f5217c = safeIntent.getBooleanExtra("is_app_market_exist", false);
        this.f5216a = (ConnectConfig) safeIntent.getSerializableExtra("vendor_app_connect_config");
        int i = this.f5217c ? R.string.coreservicesdk_guide_update_appmarket : R.string.coreservicesdk_guide_download_appmarket;
        int i2 = this.f5217c ? R.string.agdsdk_update : R.string.agdsdk_download;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((CharSequence) null);
        String string = getResources().getString(R.string.coreservicesdk_appmarket_name);
        ConnectConfig connectConfig = this.f5216a;
        if (connectConfig != null) {
            string = connectConfig.getInstallAppName();
        }
        builder.setMessage(getResources().getString(i, string));
        builder.setPositiveButton(getResources().getText(i2), new b());
        builder.setNegativeButton(getResources().getText(R.string.agdsdk_cancel), new e());
        builder.setOnKeyListener(new c());
        AlertDialog alertDialogCreate = builder.create();
        this.d = alertDialogCreate;
        alertDialogCreate.setCanceledOnTouchOutside(false);
        if (isDestroyed() || isFinishing()) {
            return;
        }
        this.d.show();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public Intent getIntent() {
        return new SafeIntent(super.getIntent());
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
            overridePendingTransition(0, 0);
        } catch (Exception e2) {
            bhn.a("GuideInstallAppGallery", "activity finish exception:" + e2.getMessage());
        }
    }

    class a implements InstallCallback {
        @Override // com.huawei.appgallery.marketinstallerservice.api.InstallCallback
        public void onSuccess(MarketInfo marketInfo) {
            bhn.b("GuideInstallAppGallery", "download market succeed!");
            GuideInstallAppGallery.this.setResult(-1);
            GuideInstallAppGallery.this.finish();
        }

        @Override // com.huawei.appgallery.marketinstallerservice.api.InstallCallback
        public void onFailed(FailResultParam failResultParam) {
            if (failResultParam != null) {
                bhn.b("GuideInstallAppGallery", "can not download market: result:" + failResultParam.getResult() + ", reason:" + failResultParam.getReason() + ", responseCode:" + failResultParam.getResponseCode() + ", rtnCode:" + failResultParam.getRtnCode());
                GuideInstallAppGallery.this.setResult(0);
            }
            GuideInstallAppGallery.this.finish();
        }

        a() {
        }
    }

    class b implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            String strA = bhl.a(GuideInstallAppGallery.this, "STORE");
            InstallParamSpec installParamSpec = new InstallParamSpec();
            installParamSpec.setServerUrl(strA);
            installParamSpec.setSubsystem("agdsdk");
            installParamSpec.setFailResultPromptType(2);
            installParamSpec.setUpdate(GuideInstallAppGallery.this.f5217c);
            if (GuideInstallAppGallery.this.f5216a != null) {
                installParamSpec.setMarketPkg(GuideInstallAppGallery.this.f5216a.getConnectAppPkg());
            }
            GuideInstallAppGallery guideInstallAppGallery = GuideInstallAppGallery.this;
            InstallerApi.installMarket(guideInstallAppGallery, installParamSpec, guideInstallAppGallery.new a());
        }

        b() {
        }
    }

    class c implements DialogInterface.OnKeyListener {
        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (4 != i || keyEvent.getAction() != 1) {
                return false;
            }
            bhn.b("GuideInstallAppGallery", "use cancel download market by KEYCODE_BACK!");
            GuideInstallAppGallery.this.setResult(0);
            GuideInstallAppGallery.this.finish();
            return true;
        }

        c() {
        }
    }

    class e implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            bhn.b("GuideInstallAppGallery", "use cancel download market by NegativeButton!");
            GuideInstallAppGallery.this.setResult(0);
            GuideInstallAppGallery.this.finish();
        }

        e() {
        }
    }

    public static PendingIntent c(Context context, ConnectConfig connectConfig, String str) {
        if (context == null) {
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) GuideInstallAppGallery.class);
        intent.putExtra("is_app_market_exist", !TextUtils.isEmpty(str));
        intent.putExtra("vendor_app_connect_config", connectConfig);
        return PendingIntent.getActivity(context, SmartMsgConstant.MSG_TYPE_TRACK_RECOVER_TIME_RECOMMEND, intent, Build.VERSION.SDK_INT >= 30 ? 1140850688 : 1073741824);
    }

    public static PendingIntent a(Context context) {
        if (context == null) {
            return null;
        }
        String strB = com.huawei.appgallery.coreservice.e.b(context);
        Intent intent = new Intent(context, (Class<?>) GuideInstallAppGallery.class);
        intent.putExtra("is_app_market_exist", !TextUtils.isEmpty(strB));
        return PendingIntent.getActivity(context, SmartMsgConstant.MSG_TYPE_TRACK_RECOVER_TIME_RECOMMEND, intent, Build.VERSION.SDK_INT >= 30 ? 1140850688 : 1073741824);
    }
}
