package com.huawei.sim.multisim;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.sim.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.npz;
import java.util.Locale;

/* JADX INFO: loaded from: classes42.dex */
public class MultiSimAuth extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f23091a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomTitleBar f23092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthButton f23093c;
    private HealthButton d;
    private HealthTextView e;
    private HealthTextView j;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("MultiSimAuth", "onCreate");
        this.f23091a = this;
        setContentView(R.layout.activity_multi_sim_auth);
        d();
        a();
    }

    private void d() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.multi_sim_auth_title_bar);
        this.f23092b = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(getResources().getColor(R.color.colorSubBackground));
        this.e = (HealthTextView) findViewById(R.id.multi_sim_auth_notice);
        this.j = (HealthTextView) findViewById(R.id.multi_sim_auth_tip);
        HealthButton healthButton = (HealthButton) findViewById(R.id.multi_sim_auth_agree);
        this.f23093c = healthButton;
        healthButton.setOnClickListener(this);
        HealthButton healthButton2 = (HealthButton) findViewById(R.id.multi_sim_auth_cancel);
        this.d = healthButton2;
        healthButton2.setOnClickListener(this);
    }

    public static String b(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128)).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("MultiSimAuth", "getAppName NameNotFoundException");
            return "";
        }
    }

    private void a() {
        LogUtil.a("MultiSimAuth", "initAuthRequestView()");
        String str = String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_plugin_multi_sim_get_device_info), b(this.f23091a, npz.b().g()), npz.b().f());
        String str2 = String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_plugin_multi_sim_get_device_tip), getResources().getString(R.string.IDS_plugin_multi_sim_auth_agree), b(this.f23091a, npz.b().g()));
        this.e.setText(str);
        this.j.setText(str2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        LogUtil.a("MultiSimAuth", "onClick enter");
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("MultiSimAuth", "onClick intent is null");
            return;
        }
        LogUtil.a("MultiSimAuth", intent.getAction());
        if (view.getId() == R.id.multi_sim_auth_agree) {
            LogUtil.a("MultiSimAuth", "onClick agree");
            npz.b().b(true);
            if ("com.huawei.sim.multisim.MultiSimAuth".equals(intent.getAction())) {
                c();
                return;
            } else {
                finish();
                return;
            }
        }
        if (view.getId() == R.id.multi_sim_auth_cancel) {
            LogUtil.a("MultiSimAuth", "onClick cancel");
            if ("com.huawei.sim.multisim.MultiSimAuth".equals(intent.getAction())) {
                npz.b().b(false);
                c();
                return;
            } else {
                e();
                return;
            }
        }
        LogUtil.j("MultiSimAuth", "onClick");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        LogUtil.a("MultiSimAuth", "onClick back button");
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("MultiSimAuth", "onBackPressed intent is null");
            return;
        }
        LogUtil.a("MultiSimAuth", "inEsim :", intent.getAction());
        if ("com.huawei.sim.multisim.MultiSimAuth".equals(intent.getAction())) {
            npz.b().b(false);
            c();
        } else {
            e();
        }
    }

    private void c() {
        Intent intent = new Intent();
        intent.setAction("com.huawei.commonui.CLEAN_ACTIVITY");
        if (LocalBroadcastManager.getInstance() != null) {
            LocalBroadcastManager.getInstance().sendBroadcast(intent);
        }
    }

    private void e() {
        npz.b().b(false);
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
