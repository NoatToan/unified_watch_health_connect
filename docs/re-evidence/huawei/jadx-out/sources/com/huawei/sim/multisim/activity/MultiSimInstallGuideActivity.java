package com.huawei.sim.multisim.activity;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.sim.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.lsj;
import defpackage.pxk;
import defpackage.qpx;
import defpackage.qqp;
import defpackage.qrs;
import defpackage.xjt;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.Locale;

/* JADX INFO: loaded from: classes15.dex */
public class MultiSimInstallGuideActivity extends BaseActivity implements View.OnClickListener {
    private HealthTextView d;
    private HealthButton e;
    private CustomTitleBar f;
    private HealthTextView g;
    private HealthTextView h;
    private ImageView i;
    private RelativeLayout j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f23143a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f23145c = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23144b = 1;
    private boolean m = true;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("MultiSimInstallGuideActivity", "onCreate");
        this.f23143a = this;
        setContentView(R.layout.activity_multi_sim_install_guide);
        Intent intent = getIntent();
        if (intent != null) {
            this.f23145c = intent.getStringExtra("simImsi");
            this.f23144b = intent.getIntExtra("cardType", 1);
        }
        c();
        e();
    }

    private void c() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.multi_sim_install_guide_title_bar);
        this.f = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(getResources().getColor(R.color.colorSubBackground));
        this.j = (RelativeLayout) findViewById(R.id.multi_sim_install_guide_image_layout);
        this.i = (ImageView) findViewById(R.id.multi_sim_install_guide_image);
        this.g = (HealthTextView) findViewById(R.id.multi_sim_install_guide_title);
        this.d = (HealthTextView) findViewById(R.id.multi_sim_install_guide_content);
        this.h = (HealthTextView) findViewById(R.id.multi_sim_install_guide_page_num);
        HealthButton healthButton = (HealthButton) findViewById(R.id.multi_sim_install_guide_download);
        this.e = healthButton;
        healthButton.setOnClickListener(this);
        if (qrs.m() - qrs.s(this.f23143a) < qqp.a(this.f23143a, 640.0f)) {
            LogUtil.a("MultiSimInstallGuideActivity", "initView low phone");
            this.i.getLayoutParams().width = qqp.a(this.f23143a, 212.0f);
            this.i.getLayoutParams().height = qqp.a(this.f23143a, 212.0f);
            this.j.getLayoutParams().height = qqp.a(this.f23143a, 248.0f);
        }
    }

    private void e() {
        LogUtil.a("MultiSimInstallGuideActivity", "setViewData()");
        Bitmap bitmapB = pxk.b(false, this.f23145c, this.f23144b);
        if (bitmapB != null) {
            this.i.setImageBitmap(bitmapB);
        } else {
            LogUtil.j("MultiSimInstallGuideActivity", "install guide image is default");
            this.i.setImageResource(R.drawable.operator_default_img);
        }
        String str = String.format(Locale.ENGLISH, this.f23143a.getString(R.string.IDS_guide_page_num), UnitUtil.e(1.0d, 1, 0), UnitUtil.e(2.0d, 1, 0));
        String strB = pxk.b(this.f23143a, this.f23145c, this.f23144b);
        this.g.setText(String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_guide_install_title), strB));
        String string = getResources().getString(R.string.IDS_guide_install_content_standalone);
        if (this.f23144b == 1) {
            string = getResources().getString(R.string.IDS_guide_install_content);
        }
        this.d.setText(String.format(Locale.ENGLISH, string, strB, strB));
        this.h.setText(str);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        String strD = pxk.d(this.f23145c, this.f23144b);
        boolean zB = Utils.b(this.f23143a, strD);
        boolean zE = pxk.e(this.f23143a, strD);
        if (!zB) {
            this.m = false;
            this.e.setText(getResources().getString(R.string.IDS_device_to_intelligent_home_linkage_go_to_download));
        } else if (zE) {
            this.m = true;
            this.e.setText(getResources().getString(R.string.IDS_plugin_sim_next));
        } else {
            this.m = false;
            this.e.setText(getResources().getString(R.string.IDS_update_new_version_to_upgrade_app));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.multi_sim_install_guide_download) {
            LogUtil.a("MultiSimInstallGuideActivity", "onClick download button");
            a();
        } else {
            LogUtil.j("MultiSimInstallGuideActivity", "onClick other");
        }
    }

    private void a() {
        if (this.m) {
            try {
                Intent intent = new Intent(this.f23143a, (Class<?>) MultiSimOpenGuideActivity.class);
                intent.putExtra("simImsi", this.f23145c);
                intent.putExtra("cardType", this.f23144b);
                this.f23143a.startActivity(intent);
                return;
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("MultiSimInstallGuideActivity", "clickDownload ActivityNotFoundException");
                return;
            }
        }
        if (CommonUtil.bg()) {
            b();
        } else {
            d();
        }
    }

    private void b() {
        String strD = pxk.d(this.f23145c, this.f23144b);
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j("MultiSimInstallGuideActivity", "operatorPackageName is null");
            xjt.q("operatorPackageName is null");
            return;
        }
        try {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=" + strD));
            intent.addFlags(268435456);
            if (lsj.c(this.f23143a, "com.huawei.appmarket")) {
                intent.setPackage("com.huawei.appmarket");
                qrs.c(intent, "com.huawei.appmarket", this, getString(R.string.IDS_device_fragment_application_market));
            } else {
                LogUtil.j("MultiSimInstallGuideActivity", "Not installed Market");
                qpx.e(this, this.f23143a.getResources().getString(R.string.IDS_main_sns_app_store_content));
            }
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("MultiSimInstallGuideActivity", "jumpToMarket Exception");
        }
    }

    private void d() {
        final String strA = pxk.a(this.f23145c, this.f23144b);
        if (TextUtils.isEmpty(strA)) {
            LogUtil.j("MultiSimInstallGuideActivity", "operatorAppId is null");
            xjt.q("operatorAppId is null");
        } else {
            ThreadPoolManager.c().a("MultiSimInstallGuideActivity", new Runnable() { // from class: com.huawei.sim.multisim.activity.MultiSimInstallGuideActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    String url = GRSManager.c(BaseApplication.getContext()).getUrl("domainAppgalleryCloudHuawei");
                    final Intent intent = new Intent();
                    intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
                    intent.setData(Uri.parse(url + strA));
                    PackageManager packageManager = MultiSimInstallGuideActivity.this.f23143a.getPackageManager();
                    if (packageManager != null) {
                        LogUtil.a("MultiSimInstallGuideActivity", "jumpToBrowserDownload packageManager is not null");
                        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                        if (resolveInfoResolveActivity != null) {
                            LogUtil.a("MultiSimInstallGuideActivity", "jumpToBrowserDownload resolveInfo is not null");
                            ComponentName componentName = new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name);
                            intent.setComponent(componentName);
                            final String packageName = componentName.getPackageName();
                            MultiSimInstallGuideActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.sim.multisim.activity.MultiSimInstallGuideActivity.2.5
                                @Override // java.lang.Runnable
                                public void run() {
                                    qrs.c(intent, packageName, MultiSimInstallGuideActivity.this.f23143a, MultiSimInstallGuideActivity.this.f23143a.getString(R.string.IDS_browser_app_name));
                                }
                            });
                        }
                    }
                }
            });
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
