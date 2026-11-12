package com.huawei.updatesdk.service.otaupdate;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.text.style.TextAppearanceSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hms.update.UpdateConstants;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import java.io.Serializable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes20.dex */
public class AppUpdateActivity extends Activity implements com.huawei.updatesdk.service.otaupdate.b, com.huawei.updatesdk.service.observer.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f29967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AlertDialog f29968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.huawei.updatesdk.service.widget.a f29969c;
    private com.huawei.updatesdk.service.widget.a d;
    private ProgressBar e;
    private TextView f;
    private com.huawei.updatesdk.service.download.c l;
    private q p;
    private boolean g = false;
    private boolean h = false;
    private ApkUpgradeInfo i = null;
    private boolean j = false;
    private boolean k = false;
    private int m = -99;
    private int n = -99;
    private int o = -99;
    private boolean q = false;

    @Override // android.app.Activity
    protected void onDestroy() {
        com.huawei.updatesdk.service.widget.a aVar = this.f29969c;
        if (aVar != null) {
            aVar.a();
            this.f29969c = null;
        }
        com.huawei.updatesdk.service.widget.a aVar2 = this.d;
        if (aVar2 != null) {
            aVar2.a();
            this.d = null;
        }
        a();
        f();
        super.onDestroy();
        finishActivity(1002);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        Serializable serializable;
        requestWindowFeature(1);
        com.huawei.updatesdk.sdk.foundation.utils.device.c.c().a(getWindow());
        super.onCreate(bundle);
        Bundle bundleB = com.huawei.updatesdk.sdk.service.secure.b.a(getIntent()).b();
        com.huawei.updatesdk.sdk.service.app.a.a(this);
        if (bundleB != null) {
            try {
                serializable = bundleB.getSerializable("app_update_parm");
                this.q = bundleB.getBoolean("is_apptouch", false);
                this.k = bundleB.getBoolean("app_must_btn", false);
            } catch (Throwable th) {
                com.huawei.updatesdk.sdk.foundation.a.a("AppUpdateActivity", "Type Conversion Error: " + th.getMessage());
                super.finish();
                return;
            }
        } else {
            serializable = null;
        }
        String strB = com.huawei.updatesdk.service.global.e.a(this.q).b();
        this.f29967a = strB;
        if (TextUtils.isEmpty(strB)) {
            com.huawei.updatesdk.sdk.foundation.a.a("AppUpdateActivity", "finish activity and appStorePkgName is: " + this.f29967a);
            super.finish();
            return;
        }
        if (!(serializable instanceof ApkUpgradeInfo)) {
            this.m = 3;
            finish();
            return;
        }
        ApkUpgradeInfo apkUpgradeInfo = (ApkUpgradeInfo) serializable;
        this.i = apkUpgradeInfo;
        if (apkUpgradeInfo.getIsCompulsoryUpdate_() == 1) {
            this.j = true;
        }
        if (1 == this.i.getDevType_() && com.huawei.updatesdk.service.util.b.i(this, this.f29967a)) {
            b(this.i);
        } else if (2 == this.i.getDevType_() && com.huawei.updatesdk.service.util.b.h(this, this.f29967a)) {
            com.huawei.updatesdk.service.store.c.f30006b.execute(new e());
        } else {
            c(this.i);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        com.huawei.updatesdk.sdk.foundation.a.b("AppUpdateActivity", "get from market requestCode: " + i2 + ", resultCode: " + i3);
        if (i2 == 1002) {
            if (intent != null) {
                this.m = i3;
                a(intent);
            }
            this.o = i3 == 4 ? 100 : 101;
            if (this.h) {
                return;
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public void finish() {
        if (this.g) {
            overridePendingTransition(0, 0);
        }
        Intent intent = new Intent();
        intent.putExtra("status", this.m);
        intent.putExtra(UpdateKey.FAIL_CODE, this.n);
        intent.putExtra(UpdateKey.MUST_UPDATE, this.g);
        intent.putExtra(UpdateKey.BUTTON_STATUS, this.o);
        com.huawei.updatesdk.service.otaupdate.d.a().b(intent);
        super.finish();
    }

    @Override // com.huawei.updatesdk.service.otaupdate.b
    public void b(int i2) {
        Toast.makeText(this, getString(com.huawei.updatesdk.service.util.c.c(this, "upsdk_getting_message_fail_prompt_toast")), 0).show();
        com.huawei.updatesdk.service.otaupdate.d.a().a(i2);
        finish();
    }

    @Override // com.huawei.updatesdk.service.otaupdate.b
    public void a(com.huawei.updatesdk.service.appmgr.bean.c cVar) {
        if (cVar == null || !cVar.f()) {
            Toast.makeText(this, getString(com.huawei.updatesdk.service.util.c.c(this, "upsdk_getting_message_fail_prompt_toast")), 0).show();
            finish();
        } else {
            com.huawei.updatesdk.service.observer.c.a().a(this);
            this.f29967a = cVar.d();
            b(cVar);
        }
    }

    @Override // com.huawei.updatesdk.service.observer.b
    public void a(int i2, com.huawei.updatesdk.sdk.service.secure.b bVar) {
        if (bVar == null) {
            return;
        }
        if (i2 == 0) {
            a(bVar);
        } else if (1 == i2) {
            b(bVar);
        } else {
            c(bVar);
        }
    }

    @Override // com.huawei.updatesdk.service.otaupdate.b
    public void a(int i2) {
        Toast.makeText(this, getString(com.huawei.updatesdk.service.util.c.c(this, "upsdk_getting_message_fail_prompt_toast")), 0).show();
        com.huawei.updatesdk.service.otaupdate.d.a().a(i2);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (com.huawei.updatesdk.service.util.b.g(this, this.f29967a)) {
            a(this.i.getPackage_(), this.i.getDetailId_());
            return;
        }
        com.huawei.updatesdk.service.download.f.a(this);
        com.huawei.updatesdk.service.download.f.a(this.q);
        this.d.a();
    }

    private void f() {
        com.huawei.updatesdk.service.otaupdate.a.a(this, this.p);
        com.huawei.updatesdk.service.observer.c.a().b(this);
        com.huawei.updatesdk.service.download.c cVar = this.l;
        if (cVar != null) {
            cVar.c();
        }
        com.huawei.updatesdk.service.download.f.a((com.huawei.updatesdk.service.otaupdate.b) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        com.huawei.updatesdk.service.widget.a aVarA = com.huawei.updatesdk.service.widget.a.a(this, null, getString(com.huawei.updatesdk.service.util.c.c(this, "upsdk_third_app_dl_cancel_download_prompt_ex")));
        this.f29969c = aVarA;
        aVarA.a(new h());
        String string = getString(com.huawei.updatesdk.service.util.c.c(this, "upsdk_third_app_dl_sure_cancel_download"));
        this.f29969c.a(new i());
        this.f29969c.a(-1, string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(com.huawei.updatesdk.service.appmgr.bean.c cVar) {
        c();
        b(cVar.a());
        com.huawei.updatesdk.service.download.b bVar = new com.huawei.updatesdk.service.download.b(cVar.b(), cVar.c(), cVar.e());
        bVar.a(cVar.d());
        com.huawei.updatesdk.service.download.c cVar2 = new com.huawei.updatesdk.service.download.c(bVar);
        this.l = cVar2;
        cVar2.executeOnExecutor(com.huawei.updatesdk.service.store.c.f30005a, new Void[0]);
    }

    private void d() {
        com.huawei.updatesdk.service.widget.a aVar = this.d;
        if (aVar != null) {
            e eVar = null;
            aVar.a(new o(eVar));
            this.d.a(new p(eVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.huawei.updatesdk.service.appmgr.bean.c cVar) {
        com.huawei.updatesdk.service.widget.a aVarA = com.huawei.updatesdk.service.widget.a.a(this, null, getString(com.huawei.updatesdk.service.util.c.c(this, "upsdk_mobile_dld_warn"), new Object[]{com.huawei.updatesdk.service.util.d.a(this, cVar.c())}));
        aVarA.a(new c(cVar, aVarA));
        String string = getString(com.huawei.updatesdk.service.util.c.c(this, "upsdk_app_download_info_new"));
        aVarA.a(new d());
        aVarA.a(-1, string);
        aVarA.a(new r(this, aVarA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(ApkUpgradeInfo apkUpgradeInfo) {
        com.huawei.updatesdk.sdk.foundation.a.b("AppUpdateActivity", "showOtaDialog");
        if (apkUpgradeInfo == null) {
            finish();
            return;
        }
        String string = getString(com.huawei.updatesdk.service.util.c.c(this, "upsdk_ota_title"));
        String string2 = getString(com.huawei.updatesdk.service.util.c.c(this, "upsdk_ota_notify_updatebtn"));
        String string3 = getString(com.huawei.updatesdk.service.util.c.c(this, "upsdk_ota_cancel"));
        if (!a(string)) {
            com.huawei.updatesdk.sdk.foundation.a.a("AppUpdateActivity", "UpdateSDK show update dialog error and resource is proguard, please add ignore proguard rules!");
            finish();
            return;
        }
        if (1 == apkUpgradeInfo.getIsCompulsoryUpdate_()) {
            string3 = getString(com.huawei.updatesdk.service.util.c.c(this, "upsdk_ota_force_cancel_new"));
            if (this.k) {
                this.d.c();
            }
            this.g = true;
        }
        this.d.a(new m());
        d();
        this.d.a(new a());
        if (this.g) {
            this.d.a(false);
        } else {
            this.d.a(new b());
        }
        this.d.a(-1, string2);
        this.d.a(-2, string3);
    }

    private void c(com.huawei.updatesdk.sdk.service.secure.b bVar) {
        new Handler(Looper.getMainLooper()).post(new g(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i2) {
        if (i2 == 5 || i2 == 4) {
            Toast.makeText(this, getString(com.huawei.updatesdk.service.util.c.c(this, "upsdk_third_app_dl_install_failed")), 0).show();
            com.huawei.updatesdk.service.util.b.a();
            finish();
        }
        if (i2 == 7) {
            com.huawei.updatesdk.service.util.b.a();
            if (this.g) {
                c(this.i);
            } else {
                finish();
            }
        }
    }

    private void c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        q qVar = new q(this, null);
        this.p = qVar;
        com.huawei.updatesdk.service.otaupdate.a.a(this, intentFilter, qVar);
    }

    private void b(String str) {
        AlertDialog.Builder builder;
        AlertDialog alertDialog = this.f29968b;
        if (alertDialog == null || !alertDialog.isShowing()) {
            if (com.huawei.updatesdk.sdk.foundation.utils.device.c.n()) {
                builder = new AlertDialog.Builder(this);
            } else {
                builder = ((getResources().getConfiguration().uiMode & 48) != 32 || Build.VERSION.SDK_INT < 29) ? new AlertDialog.Builder(this, R.style.Theme.DeviceDefault.Light.Dialog.Alert) : new AlertDialog.Builder(this, R.style.Theme.DeviceDefault.Dialog.Alert);
            }
            this.f29968b = builder.create();
            com.huawei.updatesdk.sdk.foundation.utils.device.c.c().a(this.f29968b.getWindow());
            View viewInflate = LayoutInflater.from(this).inflate(com.huawei.updatesdk.service.util.c.b(this, "upsdk_app_dl_progress_dialog"), (ViewGroup) null);
            ((TextView) viewInflate.findViewById(com.huawei.updatesdk.service.util.c.a(this, "third_app_warn_text"))).setText(getString(com.huawei.updatesdk.service.util.c.c(this, "upsdk_app_download_installing"), new Object[]{str}));
            ProgressBar progressBar = (ProgressBar) viewInflate.findViewById(com.huawei.updatesdk.service.util.c.a(this, "third_app_dl_progressbar"));
            this.e = progressBar;
            progressBar.setMax(100);
            this.f = (TextView) viewInflate.findViewById(com.huawei.updatesdk.service.util.c.a(this, "third_app_dl_progress_text"));
            viewInflate.findViewById(com.huawei.updatesdk.service.util.c.a(this, "cancel_bg")).setOnClickListener(new j());
            this.f29968b.setView(viewInflate);
            this.f29968b.setCancelable(false);
            this.f29968b.setCanceledOnTouchOutside(false);
            if (!com.huawei.updatesdk.service.otaupdate.a.a(this)) {
                this.f29968b.show();
            }
            this.f.setText(com.huawei.updatesdk.service.util.d.a(0));
        }
    }

    private void b(com.huawei.updatesdk.service.appmgr.bean.c cVar) {
        com.huawei.updatesdk.service.widget.a aVarA = com.huawei.updatesdk.service.widget.a.a(this, null, getString(com.huawei.updatesdk.service.util.c.c(this, "upsdk_appstore_install"), new Object[]{cVar.a()}));
        aVarA.a(new k(cVar, aVarA));
        String string = getString(com.huawei.updatesdk.service.util.c.c(this, "upsdk_app_download_info_new"));
        aVarA.a(new l());
        aVarA.a(-1, string);
        aVarA.a(new r(this, aVarA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ApkUpgradeInfo apkUpgradeInfo) {
        com.huawei.updatesdk.sdk.foundation.a.b("AppUpdateActivity", "goHiAppUpgrade");
        Intent intent = new Intent(UpdateConstants.ACTION_NAME_HIAPP_SILENT_DOWNLOAD);
        intent.setPackage(this.f29967a);
        intent.putExtra("APP_PACKAGENAME", apkUpgradeInfo.getPackage_());
        intent.putExtra("devType", apkUpgradeInfo.getDevType_());
        intent.putExtra("version", apkUpgradeInfo.getVersion_());
        intent.putExtra("longSize", apkUpgradeInfo.getLongSize_());
        intent.putExtra("newFeature", apkUpgradeInfo.getNewFeatures_());
        intent.putExtra("IsCompulsoryUpdate", apkUpgradeInfo.getIsCompulsoryUpdate_());
        intent.putExtra("APP_MUST_UPDATE_BTN", this.k);
        intent.putExtra("VersionCode", apkUpgradeInfo.getVersionCode_());
        intent.putExtra("detailId", apkUpgradeInfo.getDetailId_());
        intent.putExtra("name", apkUpgradeInfo.getName_());
        try {
            this.h = false;
            startActivityForResult(intent, 1002);
        } catch (ActivityNotFoundException unused) {
            com.huawei.updatesdk.sdk.foundation.a.a("AppUpdateActivity", "goHiappUpgrade error: ActivityNotFoundException");
            this.h = true;
            Intent intent2 = new Intent();
            intent2.putExtra("status", 8);
            com.huawei.updatesdk.service.otaupdate.d.a().b(intent2);
            c(apkUpgradeInfo);
        }
    }

    private void b(com.huawei.updatesdk.sdk.service.secure.b bVar) {
        if (this.e == null) {
            return;
        }
        this.e.setProgress(com.huawei.updatesdk.service.util.d.a(bVar.b("download_apk_already", 0), bVar.b("download_apk_size", 0)));
        this.f.setText(com.huawei.updatesdk.service.util.d.a((int) ((this.e.getProgress() / this.e.getMax()) * 100.0f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        com.huawei.updatesdk.sdk.foundation.a.b("AppUpdateActivity", "getAgreeProtocolStatus");
        runOnUiThread(new f(com.huawei.updatesdk.service.util.b.a(this.f29967a)));
    }

    private boolean a(String str) {
        TextView textView;
        View viewInflate = LayoutInflater.from(this).inflate(com.huawei.updatesdk.service.util.c.b(this, "upsdk_ota_update_view"), (ViewGroup) null);
        String string = TextUtils.isEmpty(this.i.getNewFeatures_()) ? getString(com.huawei.updatesdk.service.util.c.c(this, "upsdk_choice_update")) : this.i.getNewFeatures_();
        if (viewInflate == null || (textView = (TextView) viewInflate.findViewById(com.huawei.updatesdk.service.util.c.a(this, "content_textview"))) == null) {
            return false;
        }
        textView.setText(string);
        String version_ = this.i.getVersion_();
        TextView textView2 = (TextView) viewInflate.findViewById(com.huawei.updatesdk.service.util.c.a(this, "version_textview"));
        if (textView2 == null) {
            return false;
        }
        textView2.setText(version_);
        com.huawei.updatesdk.service.util.d.a(textView2);
        String strA = com.huawei.updatesdk.service.util.d.a(this, a(this.i));
        TextView textView3 = (TextView) viewInflate.findViewById(com.huawei.updatesdk.service.util.c.a(this, "appsize_textview"));
        textView3.setText(strA);
        com.huawei.updatesdk.service.util.d.a(textView3);
        TextView textView4 = (TextView) viewInflate.findViewById(com.huawei.updatesdk.service.util.c.a(this, "name_textview"));
        textView4.setText(this.i.getName_());
        com.huawei.updatesdk.service.util.d.a(textView4);
        TextView textView5 = (TextView) viewInflate.findViewById(com.huawei.updatesdk.service.util.c.a(this, "allsize_textview"));
        a(this.i, textView5);
        com.huawei.updatesdk.service.util.d.a(textView5);
        ((TextView) viewInflate.findViewById(com.huawei.updatesdk.service.util.c.a(this, "download_install_textview"))).setVisibility(TextUtils.equals("CN", com.huawei.updatesdk.service.otaupdate.f.c().a()) ? 0 : 8);
        a(viewInflate);
        com.huawei.updatesdk.service.widget.a aVarA = com.huawei.updatesdk.service.widget.a.a(this, str, null);
        this.d = aVarA;
        aVarA.a(viewInflate);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            this.m = 1;
            finish();
            return;
        }
        Intent intent = new Intent("com.huawei.appmarket.appmarket.intent.action.AppDetail.withdetailId");
        intent.setPackage(this.f29967a);
        intent.putExtra("appDetailId", str2);
        intent.putExtra("thirdId", str);
        intent.addFlags(268468224);
        try {
            startActivity(intent);
            if (this.j) {
                return;
            }
            finish();
        } catch (Exception e2) {
            com.huawei.updatesdk.sdk.foundation.a.a("AppUpdateActivity", "openMarketUpdateDetail error: " + e2.getMessage());
            com.huawei.updatesdk.service.download.f.a(this);
            com.huawei.updatesdk.service.download.f.a(this.q);
            Intent intent2 = new Intent();
            intent2.putExtra("status", 8);
            com.huawei.updatesdk.service.otaupdate.d.a().b(intent2);
            if (this.d != null) {
                this.d.a();
            }
        }
    }

    private void a(ApkUpgradeInfo apkUpgradeInfo, TextView textView) {
        if (textView == null) {
            return;
        }
        if (apkUpgradeInfo.getDiffSize_() <= 0) {
            textView.setVisibility(8);
            return;
        }
        String strA = com.huawei.updatesdk.service.util.d.a(this, (apkUpgradeInfo.getPackingType_() != 3 || apkUpgradeInfo.getObbSize_() <= 0) ? apkUpgradeInfo.getLongSize_() : apkUpgradeInfo.getLongSize_() + apkUpgradeInfo.getObbSize_());
        SpannableString spannableString = new SpannableString(strA);
        spannableString.setSpan(new StrikethroughSpan(), 0, strA.length(), 33);
        spannableString.setSpan(new TextAppearanceSpan(com.huawei.updatesdk.service.util.a.d().e() > 0 ? "HnChinese-medium" : Constants.FONT, 0, (int) textView.getTextSize(), null, null), 0, spannableString.length(), 33);
        textView.setText(spannableString);
    }

    private void a(com.huawei.updatesdk.sdk.service.secure.b bVar) {
        Bundle bundleB = bVar.b();
        if (bundleB != null) {
            int i2 = bundleB.getInt("download_status_param", -1);
            com.huawei.updatesdk.service.otaupdate.d.a().a(a(-1, -1, i2));
            if (com.huawei.updatesdk.service.download.a.a(i2)) {
                return;
            }
            a();
            if (com.huawei.updatesdk.service.download.a.b(i2)) {
                Toast.makeText(this, getString(com.huawei.updatesdk.service.util.c.c(this, "upsdk_third_app_dl_install_failed")), 0).show();
                finish();
            }
        }
    }

    private void a(View view) {
        if (com.huawei.updatesdk.sdk.foundation.utils.device.c.n()) {
            try {
                ScrollView scrollView = (ScrollView) view.findViewById(com.huawei.updatesdk.service.util.c.a(this, "scroll_layout"));
                TypedValue typedValue = new TypedValue();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getTheme().resolveAttribute(R.attr.dialogPreferredPadding, typedValue, true);
                ((WindowManager) getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay().getMetrics(displayMetrics);
                int iComplexToDimensionPixelSize = TypedValue.complexToDimensionPixelSize(typedValue.data, displayMetrics);
                scrollView.setPadding(iComplexToDimensionPixelSize, 0, iComplexToDimensionPixelSize, 0);
            } catch (Exception e2) {
                com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.b("AppUpdateActivity", e2.toString());
            }
        }
    }

    private void a(Intent intent) {
        try {
            com.huawei.updatesdk.sdk.service.secure.b bVarA = com.huawei.updatesdk.sdk.service.secure.b.a(intent);
            this.n = bVarA.a("installResultCode", -99);
            this.g = bVarA.a(UpdateKey.MUST_UPDATE, false);
        } catch (Throwable th) {
            this.n = -99;
            this.g = false;
            com.huawei.updatesdk.sdk.foundation.a.a("AppUpdateActivity", "get result error, e: " + th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            AlertDialog alertDialog = this.f29968b;
            if (alertDialog == null || !alertDialog.isShowing()) {
                return;
            }
            this.f29968b.dismiss();
            this.f29968b = null;
        } catch (IllegalArgumentException unused) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("AppUpdateActivity", "progressDialog dismiss IllegalArgumentException");
        }
    }

    class c implements com.huawei.updatesdk.service.widget.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.huawei.updatesdk.service.appmgr.bean.c f29972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.huawei.updatesdk.service.widget.a f29973b;

        @Override // com.huawei.updatesdk.service.widget.b
        public void b() {
            this.f29973b.a();
            if (AppUpdateActivity.this.j) {
                AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                appUpdateActivity.c(appUpdateActivity.i);
            } else {
                AppUpdateActivity.this.m = 4;
                AppUpdateActivity.this.finish();
            }
        }

        @Override // com.huawei.updatesdk.service.widget.b
        public void a() {
            AppUpdateActivity.this.d(this.f29972a);
            this.f29973b.a();
        }

        c(com.huawei.updatesdk.service.appmgr.bean.c cVar, com.huawei.updatesdk.service.widget.a aVar) {
            this.f29972a = cVar;
            this.f29973b = aVar;
        }
    }

    class h implements com.huawei.updatesdk.service.widget.b {
        @Override // com.huawei.updatesdk.service.widget.b
        public void b() {
            AppUpdateActivity.this.f29969c.a();
        }

        @Override // com.huawei.updatesdk.service.widget.b
        public void a() {
            AppUpdateActivity.this.e.setProgress(0);
            AppUpdateActivity.this.e.setMax(0);
            AppUpdateActivity.this.f.setText("");
            AppUpdateActivity.this.a();
            if (AppUpdateActivity.this.l != null) {
                AppUpdateActivity.this.l.a();
            }
            AppUpdateActivity.this.f29969c.a();
            if (AppUpdateActivity.this.j) {
                AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                appUpdateActivity.c(appUpdateActivity.i);
            } else {
                AppUpdateActivity.this.m = 4;
                AppUpdateActivity.this.finish();
            }
        }

        h() {
        }
    }

    class k implements com.huawei.updatesdk.service.widget.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.huawei.updatesdk.service.appmgr.bean.c f29984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.huawei.updatesdk.service.widget.a f29985b;

        @Override // com.huawei.updatesdk.service.widget.b
        public void b() {
            this.f29985b.a();
            if (AppUpdateActivity.this.j) {
                AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                appUpdateActivity.c(appUpdateActivity.i);
            } else {
                AppUpdateActivity.this.m = 4;
                AppUpdateActivity.this.finish();
            }
        }

        @Override // com.huawei.updatesdk.service.widget.b
        public void a() {
            if (!com.huawei.updatesdk.sdk.foundation.utils.network.a.d(AppUpdateActivity.this)) {
                AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                Toast.makeText(appUpdateActivity, com.huawei.updatesdk.service.util.c.c(appUpdateActivity, "upsdk_no_available_network_prompt_toast"), 0).show();
                AppUpdateActivity.this.finish();
            } else if (com.huawei.updatesdk.sdk.foundation.utils.network.a.c(AppUpdateActivity.this) == 1) {
                AppUpdateActivity.this.d(this.f29984a);
                this.f29985b.a();
            } else {
                AppUpdateActivity.this.c(this.f29984a);
            }
        }

        k(com.huawei.updatesdk.service.appmgr.bean.c cVar, com.huawei.updatesdk.service.widget.a aVar) {
            this.f29984a = cVar;
            this.f29985b = aVar;
        }
    }

    class m implements com.huawei.updatesdk.service.widget.b {
        @Override // com.huawei.updatesdk.service.widget.b
        public void b() {
            com.huawei.updatesdk.sdk.foundation.a.b("AppUpdateActivity", "performCancel");
            AppUpdateActivity.this.d.a();
            AppUpdateActivity.this.m = 4;
            AppUpdateActivity.this.o = 100;
            if (AppUpdateActivity.this.j) {
                AppUpdateActivity.this.finish();
                return;
            }
            com.huawei.updatesdk.service.otaupdate.c cVar = new com.huawei.updatesdk.service.otaupdate.c();
            AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
            cVar.a(appUpdateActivity, appUpdateActivity.f29967a, AppUpdateActivity.this.new n(), AppUpdateActivity.this.q);
        }

        @Override // com.huawei.updatesdk.service.widget.b
        public void a() {
            com.huawei.updatesdk.sdk.foundation.a.b("AppUpdateActivity", "performConfirm");
            AppUpdateActivity.this.o = 101;
            if (com.huawei.updatesdk.sdk.foundation.utils.network.a.d(AppUpdateActivity.this)) {
                AppUpdateActivity.this.g();
                return;
            }
            AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
            Toast.makeText(appUpdateActivity, com.huawei.updatesdk.service.util.c.c(appUpdateActivity, "upsdk_no_available_network_prompt_toast"), 0).show();
            AppUpdateActivity.this.m = 2;
            AppUpdateActivity.this.finish();
        }

        m() {
        }
    }

    static class o implements DialogInterface.OnDismissListener {
        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            Intent intent = new Intent();
            intent.putExtra(UpdateKey.DIALOG_STATUS, 10001);
            com.huawei.updatesdk.service.otaupdate.d.a().b(intent);
        }

        /* synthetic */ o(e eVar) {
            this();
        }

        private o() {
        }
    }

    static class p implements DialogInterface.OnShowListener {
        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            Intent intent = new Intent();
            intent.putExtra(UpdateKey.DIALOG_STATUS, 10002);
            com.huawei.updatesdk.service.otaupdate.d.a().b(intent);
        }

        /* synthetic */ p(e eVar) {
            this();
        }

        private p() {
        }
    }

    class q extends com.huawei.updatesdk.sdk.service.secure.a {
        @Override // com.huawei.updatesdk.sdk.service.secure.a
        public void a(Context context, com.huawei.updatesdk.sdk.service.secure.b bVar) {
            if (bVar.d()) {
                if (AppUpdateActivity.this.f29969c != null) {
                    AppUpdateActivity.this.f29969c.a();
                }
                AppUpdateActivity.this.a();
                String strA = bVar.a();
                String dataString = bVar.c().getDataString();
                if (dataString == null || dataString.length() < 9) {
                    return;
                }
                String strSubstring = dataString.substring(8);
                if ("android.intent.action.PACKAGE_ADDED".equals(strA) && TextUtils.equals(AppUpdateActivity.this.f29967a, strSubstring)) {
                    com.huawei.updatesdk.service.otaupdate.d.a().a(AppUpdateActivity.this.a(6, 0, -1));
                    com.huawei.updatesdk.service.util.b.a();
                    AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                    appUpdateActivity.a(appUpdateActivity.i.getPackage_(), AppUpdateActivity.this.i.getDetailId_());
                    if (AppUpdateActivity.this.j) {
                        AppUpdateActivity appUpdateActivity2 = AppUpdateActivity.this;
                        appUpdateActivity2.c(appUpdateActivity2.i);
                    }
                }
            }
        }

        /* synthetic */ q(AppUpdateActivity appUpdateActivity, e eVar) {
            this();
        }

        private q() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Intent a(int i2, int i3, int i4) {
        Intent intent = new Intent();
        intent.putExtra(UpdateKey.MARKET_DLD_STATUS, i4);
        intent.putExtra(UpdateKey.MARKET_INSTALL_STATE, i2);
        intent.putExtra(UpdateKey.MARKET_INSTALL_TYPE, i3);
        return intent;
    }

    class a implements com.huawei.updatesdk.service.widget.a.e {
        @Override // com.huawei.updatesdk.service.widget.a.e
        public void a() {
            AppUpdateActivity.this.finish();
        }

        a() {
        }
    }

    class b implements DialogInterface.OnKeyListener {
        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            com.huawei.updatesdk.sdk.foundation.a.b("AppUpdateActivity", "onKeyBack");
            if (i != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            AppUpdateActivity.this.m = 4;
            AppUpdateActivity.this.finish();
            return true;
        }

        b() {
        }
    }

    class d implements com.huawei.updatesdk.service.widget.a.e {
        @Override // com.huawei.updatesdk.service.widget.a.e
        public void a() {
            AppUpdateActivity.this.finish();
        }

        d() {
        }
    }

    class e implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            AppUpdateActivity.this.b();
        }

        e() {
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f29977a;

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f29977a) {
                AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                appUpdateActivity.c(appUpdateActivity.i);
            } else {
                AppUpdateActivity appUpdateActivity2 = AppUpdateActivity.this;
                appUpdateActivity2.b(appUpdateActivity2.i);
            }
        }

        f(boolean z) {
            this.f29977a = z;
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.huawei.updatesdk.sdk.service.secure.b f29979a;

        @Override // java.lang.Runnable
        public void run() {
            Bundle bundleB = this.f29979a.b();
            if (bundleB == null) {
                return;
            }
            int i = bundleB.getInt("INSTALL_STATE");
            com.huawei.updatesdk.service.otaupdate.d.a().a(AppUpdateActivity.this.a(i, bundleB.getInt("INSTALL_TYPE"), -1));
            AppUpdateActivity.this.c(i);
        }

        g(com.huawei.updatesdk.sdk.service.secure.b bVar) {
            this.f29979a = bVar;
        }
    }

    class i implements com.huawei.updatesdk.service.widget.a.e {
        @Override // com.huawei.updatesdk.service.widget.a.e
        public void a() {
            AppUpdateActivity.this.finish();
        }

        i() {
        }
    }

    class j implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AppUpdateActivity.this.e();
        }

        j() {
        }
    }

    class l implements com.huawei.updatesdk.service.widget.a.e {
        @Override // com.huawei.updatesdk.service.widget.a.e
        public void a() {
            AppUpdateActivity.this.finish();
        }

        l() {
        }
    }

    public class n implements com.huawei.updatesdk.service.otaupdate.c.a {
        @Override // com.huawei.updatesdk.service.otaupdate.c.a
        public void a(Boolean bool) {
            if (bool.booleanValue()) {
                try {
                    Intent intent = new Intent("com.huawei.appmarket.intent.action.ThirdUpdateRemindAction");
                    intent.setPackage(AppUpdateActivity.this.f29967a);
                    AppUpdateActivity.this.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.b("AppUpdateActivity", "goHiappUpgrade error: " + e.getMessage());
                }
            }
            AppUpdateActivity.this.finish();
        }

        public n() {
        }
    }

    static class r implements DialogInterface.OnKeyListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<AppUpdateActivity> f29991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.huawei.updatesdk.service.widget.a f29992b;

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            AppUpdateActivity appUpdateActivity = this.f29991a.get();
            if (appUpdateActivity == null || i != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            com.huawei.updatesdk.sdk.foundation.a.b("AppUpdateActivity", "press back");
            if (appUpdateActivity.j) {
                this.f29992b.a();
                appUpdateActivity.c(appUpdateActivity.i);
                return true;
            }
            appUpdateActivity.m = 4;
            appUpdateActivity.finish();
            return true;
        }

        public r(AppUpdateActivity appUpdateActivity, com.huawei.updatesdk.service.widget.a aVar) {
            this.f29991a = new WeakReference<>(appUpdateActivity);
            this.f29992b = aVar;
        }
    }

    private long a(ApkUpgradeInfo apkUpgradeInfo) {
        long longSize_ = apkUpgradeInfo.getLongSize_();
        if (apkUpgradeInfo.getPackingType_() == 1 && apkUpgradeInfo.getBundleSize_() > 0) {
            return apkUpgradeInfo.getBundleSize_();
        }
        if (apkUpgradeInfo.getPackingType_() == 3 && apkUpgradeInfo.getObbSize_() > 0) {
            longSize_ += apkUpgradeInfo.getObbSize_();
        }
        if (apkUpgradeInfo.getDiffSize_() <= 0) {
            return longSize_;
        }
        long diffSize_ = apkUpgradeInfo.getDiffSize_();
        return (apkUpgradeInfo.getPackingType_() != 3 || apkUpgradeInfo.getObbSize_() <= 0) ? diffSize_ : diffSize_ + apkUpgradeInfo.getObbSize_();
    }
}
