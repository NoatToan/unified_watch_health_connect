package com.huawei.sim.esim.view;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.sim.R;
import com.huawei.sim.esim.qrcode.QrCodeActivity;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import defpackage.npz;
import defpackage.pxk;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes15.dex */
public class EsimActivationActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f22997a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f22999c;
    private ImageView d;
    private Context f;
    private CustomTitleBar g;
    private HealthButton h;
    private HealthTextView j;
    private View n;
    private int e = 3;
    private PermissionsResultAction m = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBaseResponseCallback f22998b = new IBaseResponseCallback() { // from class: com.huawei.sim.esim.view.EsimActivationActivity.1
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            EsimActivationActivity.this.i.removeMessages(6);
            if (i == 1) {
                LogUtil.d("EsimActivationActivity", "err_code DEVICE_CONNECTING");
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                EsimActivationActivity.this.i.sendMessage(messageObtain);
                return;
            }
            if (i == 2) {
                LogUtil.d("EsimActivationActivity", "err_code DEVICE_CONNECTED");
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 2;
                EsimActivationActivity.this.i.sendMessage(messageObtain2);
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 3;
            EsimActivationActivity.this.i.sendMessage(messageObtain3);
        }
    };
    private Handler i = new Handler() { // from class: com.huawei.sim.esim.view.EsimActivationActivity.5
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            LogUtil.d("EsimActivationActivity", "message ", Integer.valueOf(message.what));
            int i = message.what;
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        EsimActivationActivity.this.e();
                        return;
                    } else if (i != 6) {
                        LogUtil.d("EsimActivationActivity", "handleMessage default");
                        return;
                    }
                }
                EsimActivationActivity.this.d();
                return;
            }
            EsimActivationActivity.this.a();
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LogUtil.a("EsimActivationActivity", "EsimActivationActivity enter");
        super.onCreate(bundle);
        setContentView(R.layout.layout_activate_esim);
        this.f = this;
        b();
        npz.b().b(this.f22998b);
        npz.b().c();
        this.m = new CustomPermissionAction(this.f) { // from class: com.huawei.sim.esim.view.EsimActivationActivity.4
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.a("EsimActivationActivity", "mQrCodeAction onGranted");
                EsimActivationActivity.this.c();
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                LogUtil.a("EsimActivationActivity", "mQrCodeAction onDenied");
                EsimActivationActivity.this.c();
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                LogUtil.a("EsimActivationActivity", "mQrCodeAction onForeverDenied");
                EsimActivationActivity.this.c();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            Intent intent = new Intent();
            intent.setClass(this.f, QrCodeActivity.class);
            intent.putExtra("esim_new_original_key", 0);
            this.f.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("EsimActivationActivity", "onGranted ActivityNotFoundException");
        }
    }

    private void b() {
        this.g = (CustomTitleBar) findViewById(R.id.wirless_manager_title_bar);
        if (LanguageUtil.g(this.f)) {
            this.g.setTitleSize(15.0f);
        }
        this.h = (HealthButton) findViewById(R.id.open_esim_button);
        g();
        this.f22999c = findViewById(R.id.bt_disconnect);
        this.n = findViewById(R.id.set_bt_reconnect);
        if (pxk.i()) {
            this.n.setVisibility(8);
        } else {
            this.n.setVisibility(0);
            this.n.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.sim.esim.view.EsimActivationActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    new Handler().post(new Runnable() { // from class: com.huawei.sim.esim.view.EsimActivationActivity.3.2
                        @Override // java.lang.Runnable
                        public void run() {
                            pxk.n(EsimActivationActivity.this);
                        }
                    });
                }
            });
        }
        this.f22997a = findViewById(R.id.bt_connecting);
        this.d = (ImageView) findViewById(R.id.bt_connecting_imgage);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.launch_tips);
        this.j = healthTextView;
        healthTextView.setText(String.format(Locale.ENGLISH, getString(R.string.IDS_plugin_sim_qrcode_tips), UnitUtil.e(30.0d, 2, 0), UnitUtil.e(1.0d, 1, 0), UnitUtil.e(2.0d, 1, 0)));
    }

    private void g() {
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.sim.esim.view.EsimActivationActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PermissionUtil.d(EsimActivationActivity.this.f, PermissionUtil.PermissionType.CAMERA, EsimActivationActivity.this.m);
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.d("EsimActivationActivity", BaseDialog.LIFE_CYCLE_ON_RESUME);
        int iC = npz.b().c();
        this.e = iC;
        if (iC == 2) {
            LogUtil.d("EsimActivationActivity", "btConnectView()");
            a();
        } else if (iC == 1) {
            LogUtil.d("EsimActivationActivity", "btConnectingView()");
            e();
        } else {
            LogUtil.d("EsimActivationActivity", "btDisconnectView()");
            d();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        npz.b().a(this.f22998b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f22997a.setVisibility(8);
        this.f22999c.setVisibility(0);
        this.h.setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f22997a.setVisibility(8);
        this.f22999c.setVisibility(8);
        this.h.setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.f22997a.setVisibility(0);
        this.f22999c.setVisibility(8);
        this.h.setEnabled(false);
        this.d.startAnimation(AnimationUtils.loadAnimation(this, R.anim.bt_connecting));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
