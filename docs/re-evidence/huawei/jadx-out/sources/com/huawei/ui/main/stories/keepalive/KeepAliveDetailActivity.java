package com.huawei.ui.main.stories.keepalive;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.core.H5ProWebView;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.openalliance.ad.db.bean.EventMonitorRecord;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import defpackage.nzz;
import defpackage.qre;
import defpackage.vrw;
import defpackage.vsb;
import health.compact.a.util.LogUtil;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class KeepAliveDetailActivity extends BaseActivity {
    private vrw d;
    private NoTitleCustomAlertDialog e;
    private String j = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28370a = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f28372c = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f28371b = false;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.keep_alive_detail);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("KeepAliveBean");
        this.f28372c = intent.getStringExtra("cid");
        this.j = intent.getStringExtra("url");
        this.f28370a = intent.getStringExtra("currentBrand");
        this.d = (vrw) HiJsonUtil.d(stringExtra, vrw.class);
        LogUtil.a("KeepAliveDetailActivity", ", currentBrand=", this.f28370a);
        b();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.e;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
        }
    }

    public void b() {
        String strF;
        LogUtil.a("KeepAliveDetailActivity", "initView");
        if (this.d == null) {
            LogUtil.c("KeepAliveDetailActivity", "Failed to initView, keepAliveBean is null");
            return;
        }
        ((CustomTitleBar) findViewById(R.id.settings_keepalive_detail_bar)).setTitleText(vsb.d(this.d.h(), true));
        HealthButton healthButton = (HealthButton) findViewById(R.id.keep_alive_button);
        boolean zEquals = "setup".equals(this.d.d());
        this.f28371b = zEquals;
        if (zEquals) {
            strF = qre.f(R.string.IDS_keepalive_quick_setup);
        } else {
            strF = qre.f(R.string.IDS_keepalive_got_it);
        }
        healthButton.setText(strF);
        H5ProWebView h5ProWebView = (H5ProWebView) findViewById(R.id.keepalive_uri_webview);
        H5proUtil.initH5pro("");
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.setForceDarkMode(1);
        H5ProClient.startH5LightApp(this.j, h5ProWebView, builder.build());
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: vrx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e(view);
            }
        });
        HashMap map = new HashMap();
        map.put("brand", this.f28370a);
        map.put("cid", this.f28372c);
        map.put("title", this.d.b());
        vsb.d(map, this.d.h());
    }

    public /* synthetic */ void e(View view) {
        c();
    }

    private void c() {
        if (this.d == null) {
            LogUtil.c("KeepAliveDetailActivity", "Failed to jumpToSetupOrBack, keepAliveBean is null");
            return;
        }
        if (this.f28371b) {
            d();
            return;
        }
        HashMap map = new HashMap();
        map.put("brand", this.f28370a);
        map.put("cid", this.f28372c);
        map.put(EventMonitorRecord.EVENT_ID, "04");
        map.put("title", this.d.b());
        vsb.d(map, this.d.h());
        finish();
    }

    private void d() {
        if ("ignore".equals(this.d.h())) {
            e();
            return;
        }
        HashMap map = new HashMap();
        map.put("brand", this.f28370a);
        map.put("cid", this.f28372c);
        map.put(EventMonitorRecord.EVENT_ID, "setup".equals(this.d.d()) ? "03" : "04");
        map.put("title", this.d.b());
        vsb.d(map, this.d.h());
        List<String> listC = this.d.c();
        if (CollectionUtils.a(listC) || !listC.contains(this.f28370a)) {
            LogUtil.a("KeepAliveDetailActivity", "goSetup jumpToSystemSetup");
            vsb.d(this);
            return;
        }
        String strH = this.d.h();
        strH.hashCode();
        if (strH.equals("relate")) {
            LogUtil.a("KeepAliveDetailActivity", "goSetup jumpToStartAssociationStart");
            vsb.a(this);
        } else if (strH.equals("allow")) {
            LogUtil.a("KeepAliveDetailActivity", "goSetup jumpToSettingBackRun");
            vsb.c(this);
        } else {
            LogUtil.a("KeepAliveDetailActivity", "goSetup jumpToSettingSelfStart");
            vsb.e(this);
        }
    }

    private void e() {
        if (nzz.c(this)) {
            LogUtil.a("KeepAliveDetailActivity", "show detailLog");
            g();
            return;
        }
        LogUtil.a("KeepAliveDetailActivity", "agreeWhite= false, requestWhiteSet");
        com.huawei.hwlogsmodel.LogUtil.a("KeepAliveDetailActivity", "agreeWhite= false, requestWhiteSet");
        HashMap map = new HashMap();
        map.put("brand", this.f28370a);
        map.put("cid", this.f28372c);
        map.put(EventMonitorRecord.EVENT_ID, "03");
        map.put("title", this.d.b());
        vsb.d(map, this.d.h());
        nzz.b(this, 10002);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 10002 || i2 < 0) {
            return;
        }
        boolean zC = nzz.c(this);
        HashMap map = new HashMap();
        map.put("brand", this.f28370a);
        map.put("cid", this.f28372c);
        map.put(EventMonitorRecord.EVENT_ID, "04");
        map.put("isAgreeWhite", Boolean.valueOf(zC));
        map.put("title", this.d.b());
        vsb.d(map, this.d.h());
        com.huawei.hwlogsmodel.LogUtil.a("KeepAliveDetailActivity", "onActivityResult requestCode: " + i, ", resultCode: ", Integer.valueOf(i2), ", isAgreeWhite: ", Boolean.valueOf(zC));
    }

    private void g() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
        builder.a(qre.f(R.string.IDS_keepalive_disable_battery_optimisation));
        builder.d(qre.f(R.string.IDS_keepalive_got_it), new View.OnClickListener() { // from class: vry
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51542b.d(view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        this.e = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        if (this.e.isShowing()) {
            return;
        }
        this.e.show();
    }

    public /* synthetic */ void d(View view) {
        a();
    }

    private void a() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.e;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
            this.e = null;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
