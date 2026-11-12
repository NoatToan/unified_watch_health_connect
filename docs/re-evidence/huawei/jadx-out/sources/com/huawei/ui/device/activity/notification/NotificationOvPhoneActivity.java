package com.huawei.ui.device.activity.notification;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.R;
import defpackage.qrs;
import defpackage.qsp;
import java.util.Locale;

/* JADX INFO: loaded from: classes43.dex */
public class NotificationOvPhoneActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomTitleBar f24533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f24534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f24535c;
    private HealthTextView d;
    private HealthTextView f;
    private LinearLayout h;
    private HealthTextView i;
    private HealthTextView j;
    private RelativeLayout k;
    private RelativeLayout l;
    private HealthTextView n;
    private HealthTextView o;
    private HealthTextView s;
    private String e = "";
    private boolean g = false;
    private String m = "";

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.notification_ovphone_setting_layout);
        this.f24534b = this;
        Intent intent = getIntent();
        if (intent != null) {
            this.e = intent.getStringExtra("device_id");
            this.g = intent.getBooleanExtra("isFromWear", false);
        }
        this.m = Build.BRAND;
        e();
    }

    private void e() {
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.notification_open_title);
        this.f24533a = customTitleBar;
        customTitleBar.setLeftButtonVisibility(8);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.open_management_title);
        this.i = healthTextView;
        healthTextView.getPaint().setFakeBoldText(true);
        this.j = (HealthTextView) findViewById(R.id.open_management_content);
        this.f = (HealthTextView) findViewById(R.id.open_management_attention);
        this.i.setText(R.string.IDS_device_msgnotif_open_manager);
        this.j.setText(R.string.IDS_device_msgnotif_open_manager_content);
        this.f.setText(R.string.IDS_device_msgnotif_open_manager_attention);
        this.f.setAlpha(0.5f);
        this.d = (HealthTextView) findViewById(R.id.open_management_phone_brand);
        String string = this.f24534b.getResources().getString(R.string.IDS_device_msgnotif_open_manager_phone_brand) + this.m.toUpperCase(Locale.ENGLISH);
        if (qrs.ah(BaseApplication.getContext())) {
            string = this.f24534b.getString(R.string.IDS_pad_device_phone_brand, this.m.toUpperCase(Locale.ENGLISH));
        }
        this.d.setText(string);
        this.f24535c = (ImageView) findViewById(R.id.open_management_instraction_pictrue);
        this.o = (HealthTextView) findViewById(R.id.open_management_step_one);
        this.s = (HealthTextView) findViewById(R.id.open_management_step_two);
        this.n = (HealthTextView) findViewById(R.id.open_management_step_three);
        e(a());
        LinearLayout linearLayout = (LinearLayout) qsp.a(this, R.id.notification_last_layout);
        this.h = linearLayout;
        linearLayout.setOnClickListener(this);
        RelativeLayout relativeLayout = (RelativeLayout) qsp.a(this, R.id.notification_next_layout);
        this.k = relativeLayout;
        relativeLayout.setOnClickListener(this);
        RelativeLayout relativeLayout2 = (RelativeLayout) qsp.a(this, R.id.notification_next_layout_twice);
        this.l = relativeLayout2;
        relativeLayout2.setOnClickListener(this);
    }

    private void e(boolean z) {
        if (z) {
            this.f24535c.setImageResource(R.drawable.ic_paring_oppo_step_one);
            String string = this.f24534b.getString(R.string.IDS_device_msgnotif_open_manager_oppo_step_one);
            if (qrs.ah(BaseApplication.getContext())) {
                string = String.format(Locale.ENGLISH, this.f24534b.getString(R.string.IDS_pad_device_oppo_step_one), 1);
            }
            this.o.setText(string);
            this.s.setText(R.string.IDS_device_msgnotif_open_manager_oppo_step_two);
            this.n.setText(R.string.IDS_device_msgnotif_open_manager_oppo_step_three);
            return;
        }
        this.f24535c.setImageResource(R.drawable.ic_paring_vivo_step_one);
        this.o.setText(R.string.IDS_device_msgnotif_open_manager_vivo_step_one);
        this.s.setText(R.string.IDS_device_msgnotif_open_manager_vivo_step_two);
        this.n.setText(R.string.IDS_device_msgnotif_open_manager_vivo_step_three);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == this.k.getId()) {
            this.i.setText(R.string.IDS_device_msgnotif_battery_manager);
            int i = R.string.IDS_device_msgnotif_battery_manager_content;
            if (qrs.ah(BaseApplication.getContext())) {
                i = R.string.IDS_pad_device_manager_content;
            }
            this.j.setText(i);
            this.f.setVisibility(4);
            if (a()) {
                this.f24535c.setImageResource(R.drawable.ic_paring_oppo_step_two);
                this.o.setText(R.string.IDS_device_msgnotif_battery_manager_oppo_step_one);
                this.s.setText(R.string.IDS_device_msgnotif_battery_manager_oppo_step_two);
                this.n.setText(R.string.IDS_device_msgnotif_battery_manager_oppo_step_three);
            } else {
                this.f24535c.setImageResource(R.drawable.ic_paring_vivo_step_two);
                this.o.setText(R.string.IDS_device_msgnotif_battery_manager_vivo_step_one);
                this.s.setText(R.string.IDS_device_msgnotif_battery_manager_vivo_step_two);
                this.n.setText(R.string.IDS_device_msgnotif_battery_manager_vivo_step_three);
            }
            this.h.setVisibility(0);
            this.k.setVisibility(8);
            this.l.setVisibility(0);
        }
        if (view.getId() == this.h.getId()) {
            this.i.setText(R.string.IDS_device_msgnotif_open_manager);
            this.j.setText(R.string.IDS_device_msgnotif_open_manager_content);
            this.f.setVisibility(0);
            String string = this.f24534b.getResources().getString(R.string.IDS_device_msgnotif_open_manager_phone_brand) + this.m.toUpperCase(Locale.ENGLISH);
            if (qrs.ah(BaseApplication.getContext())) {
                string = this.f24534b.getResources().getString(R.string.IDS_pad_device_phone_brand, this.m.toUpperCase(Locale.ENGLISH));
            }
            this.d.setText(string);
            e(a());
            this.h.setVisibility(4);
            this.k.setVisibility(0);
            this.l.setVisibility(8);
        }
        if (view.getId() == this.l.getId()) {
            c();
        }
    }

    private void c() {
        NoTitleCustomAlertDialog.Builder builderA = new NoTitleCustomAlertDialog.Builder(this.f24534b).c(R.string.IDS_apphelp_pwindows_continue_button, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.notification.NotificationOvPhoneActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("NotificationOvPhoneActivity", "continue click");
                Intent intent = new Intent();
                intent.setClassName(NotificationOvPhoneActivity.this.f24534b, "com.huawei.ui.device.activity.notification.NotificationOpenActivity");
                intent.putExtra("isFromWear", NotificationOvPhoneActivity.this.g);
                intent.putExtra("device_id", NotificationOvPhoneActivity.this.e);
                NotificationOvPhoneActivity.this.startActivity(intent);
                NotificationOvPhoneActivity.this.finish();
            }
        }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.notification.NotificationOvPhoneActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("NotificationOvPhoneActivity", "notification cancel click");
            }
        });
        builderA.a(this.f24534b.getString(R.string.IDS_device_msgnotif_next_step_dialog));
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builderA.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        if (noTitleCustomAlertDialogC.isShowing()) {
            return;
        }
        noTitleCustomAlertDialogC.show();
    }

    private boolean a() {
        return (d() == null || d().toLowerCase(Locale.ENGLISH).indexOf("oppo") == -1) ? false : true;
    }

    private static String d() {
        return Build.BRAND;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
