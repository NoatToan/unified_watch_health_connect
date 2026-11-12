package com.huawei.sim.esim.view;

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
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.sim.R;
import com.huawei.sim.esim.qrcode.QrCodeActivity;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.npz;
import defpackage.pxk;
import defpackage.qqs;

/* JADX INFO: loaded from: classes15.dex */
public class EsimProfileBtFailActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f23055b;
    private View d;
    private View e;
    private HealthButton f;
    private HealthTextView g;
    private HealthButton h;
    private ImageView j;
    private HealthTextView k;
    private View l;
    private ImageView n;
    private int o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23056c = 3;
    private Handler i = new Handler() { // from class: com.huawei.sim.esim.view.EsimProfileBtFailActivity.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("EsimProfileBtFailActivity", "message is null");
                return;
            }
            super.handleMessage(message);
            int i = message.what;
            if (i == 2) {
                LogUtil.d("EsimProfileBtFailActivity", "message MESSAGE_BT_CONNECTED");
                EsimProfileBtFailActivity.this.a();
                return;
            }
            if (i == 3) {
                LogUtil.d("EsimProfileBtFailActivity", "message MESSAGE_BT_DISCONNECTED");
                EsimProfileBtFailActivity.this.d();
            } else if (i == 4) {
                LogUtil.d("EsimProfileBtFailActivity", "message MESSAGE_BT_CONNECTING");
                EsimProfileBtFailActivity.this.e();
            } else if (i != 6) {
                LogUtil.j("EsimProfileBtFailActivity", "message default:", Integer.valueOf(message.what));
            } else {
                LogUtil.d("EsimProfileBtFailActivity", "message MESSAGE_BT_RECONNECT_TIMEOUT");
                EsimProfileBtFailActivity.this.d();
            }
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBaseResponseCallback f23054a = new IBaseResponseCallback() { // from class: com.huawei.sim.esim.view.EsimProfileBtFailActivity.3
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            EsimProfileBtFailActivity.this.i.removeMessages(6);
            LogUtil.a("EsimProfileBtFailActivity", "errorCode:", Integer.valueOf(i));
            if (i == 1) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                EsimProfileBtFailActivity.this.i.sendMessage(messageObtain);
            } else if (i == 2) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 2;
                EsimProfileBtFailActivity.this.i.sendMessage(messageObtain2);
            } else {
                LogUtil.a("EsimProfileBtFailActivity", "errorCode other");
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = 3;
                EsimProfileBtFailActivity.this.i.sendMessage(messageObtain3);
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_profile_bt_fail);
        Intent intent = getIntent();
        if (intent != null) {
            this.o = intent.getIntExtra("esim_new_original_key", 0);
        }
        HealthButton healthButton = (HealthButton) findViewById(R.id.esim_profile_cancel);
        this.f = healthButton;
        healthButton.setOnClickListener(this);
        HealthButton healthButton2 = (HealthButton) findViewById(R.id.esim_profile_retry);
        this.h = healthButton2;
        healthButton2.setOnClickListener(this);
        this.g = (HealthTextView) findViewById(R.id.esim_failed_info);
        this.j = (ImageView) findViewById(R.id.esim_image_failed);
        this.k = (HealthTextView) findViewById(R.id.esim_success_info);
        this.n = (ImageView) findViewById(R.id.esim_image_success);
        this.d = findViewById(R.id.bt_disconnect);
        this.l = findViewById(R.id.set_bt_reconnect);
        if (pxk.i()) {
            this.l.setVisibility(8);
        } else {
            this.l.setVisibility(0);
            this.l.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.sim.esim.view.EsimProfileBtFailActivity.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    new Handler().post(new Runnable() { // from class: com.huawei.sim.esim.view.EsimProfileBtFailActivity.5.2
                        @Override // java.lang.Runnable
                        public void run() {
                            pxk.n(EsimProfileBtFailActivity.this);
                        }
                    });
                }
            });
        }
        this.f23055b = (ImageView) findViewById(R.id.bt_connecting_imgage);
        this.e = findViewById(R.id.bt_connecting);
        npz.b().b(this.f23054a);
        f();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        int iC = npz.b().c();
        this.f23056c = iC;
        if (iC == 2) {
            a();
        } else if (iC == 1) {
            LogUtil.a("EsimProfileBtFailActivity", "mBTStatus equals DEVICE_CONNECTING");
            e();
        } else {
            d();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        npz.b().a(this.f23054a);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.esim_profile_cancel) {
            b();
        } else if (view.getId() == R.id.esim_profile_retry) {
            c();
        } else {
            LogUtil.j("EsimProfileBtFailActivity", "onClick other");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.e.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setEnabled(true);
        this.g.setVisibility(8);
        this.j.setVisibility(8);
        this.k.setVisibility(0);
        this.n.setVisibility(0);
        this.h.setBackgroundResource(R.drawable.sim_btn_two);
        this.h.setTextColor(getResources().getColor(R.color.IDS_plugin_sim_next_back_color));
    }

    private void f() {
        if (qqs.e(this)) {
            this.d.setBackground(getResources().getDrawable(R.drawable.bg_error_layout_dark_mode_background));
        } else {
            this.d.setBackground(getResources().getDrawable(R.drawable.bg_error_layout_background));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.e.setVisibility(8);
        this.d.setVisibility(0);
        this.h.setEnabled(false);
        this.g.setVisibility(0);
        this.j.setVisibility(4);
        this.k.setVisibility(8);
        this.n.setVisibility(8);
        this.h.setBackgroundResource(R.drawable.sim_btn_two_disable);
        this.h.setTextColor(getResources().getColor(R.color.IDS_plugin_sim_ext_back_color_20alpha));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.e.setVisibility(0);
        this.d.setVisibility(8);
        this.f23055b.startAnimation(AnimationUtils.loadAnimation(this, R.anim.bt_connecting));
        this.g.setVisibility(0);
        this.j.setVisibility(4);
        this.k.setVisibility(8);
        this.n.setVisibility(8);
        this.h.setEnabled(false);
        this.h.setBackgroundResource(R.drawable.sim_btn_two_disable);
        this.h.setTextColor(getResources().getColor(R.color.IDS_plugin_sim_ext_back_color_20alpha));
    }

    private void b() {
        Intent intent = new Intent();
        if (this.o == 1) {
            intent.setClass(this, EsimManagerActivity.class);
        } else {
            intent.setClass(this, EsimActivationActivity.class);
        }
        startActivity(intent);
        finish();
    }

    private void c() {
        Intent intent = new Intent(this, (Class<?>) QrCodeActivity.class);
        intent.putExtra("esim_new_original_key", this.o);
        startActivity(intent);
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
