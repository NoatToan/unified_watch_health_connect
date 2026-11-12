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
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.npz;
import defpackage.pxk;
import defpackage.xjt;

/* JADX INFO: loaded from: classes15.dex */
public class EsimConfirmBtFailActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f23005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f23006c;
    private View e;
    private CustomTitleBar f;
    private String i;
    private HealthButton j;
    private ImageView k;
    private HealthTextView m;
    private String o;
    private View p;
    private HealthButton r;
    private HealthTextView s;
    private ImageView t;
    private int d = 3;
    private CommonDialog21 l = null;
    private IBaseResponseCallback h = new IBaseResponseCallback() { // from class: com.huawei.sim.esim.view.EsimConfirmBtFailActivity.4
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("EsimConfirmBtFailActivity", "the errorCode ", Integer.valueOf(i));
        }
    };
    private Handler n = new Handler() { // from class: com.huawei.sim.esim.view.EsimConfirmBtFailActivity.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("EsimConfirmBtFailActivity", "mHandler msg is null");
                return;
            }
            super.handleMessage(message);
            LogUtil.a("EsimConfirmBtFailActivity", "message ", Integer.valueOf(message.what));
            int i = message.what;
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        EsimConfirmBtFailActivity.this.c();
                        return;
                    } else if (i != 6) {
                        LogUtil.j("EsimConfirmBtFailActivity", "mHandler default");
                        return;
                    }
                }
                EsimConfirmBtFailActivity.this.d();
                return;
            }
            EsimConfirmBtFailActivity.this.o = null;
            EsimConfirmBtFailActivity.this.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBaseResponseCallback f23004a = new IBaseResponseCallback() { // from class: com.huawei.sim.esim.view.EsimConfirmBtFailActivity.5
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(final int i, final Object obj) {
            LogUtil.a("EsimConfirmBtFailActivity", "errorCode ", Integer.valueOf(i));
            EsimConfirmBtFailActivity.this.n.post(new Runnable() { // from class: com.huawei.sim.esim.view.EsimConfirmBtFailActivity.5.5
                @Override // java.lang.Runnable
                public void run() {
                    pxk.a(i, true);
                    int i2 = i;
                    if (i2 == 0) {
                        Intent intent = new Intent(EsimConfirmBtFailActivity.this, (Class<?>) EsimProfileSuccessActivity.class);
                        intent.putExtra("confirm_status", true);
                        EsimConfirmBtFailActivity.this.startActivity(intent);
                        EsimConfirmBtFailActivity.this.finish();
                    } else if (i2 == 1) {
                        EsimConfirmBtFailActivity.this.o = "network_failed";
                    } else if (i2 == 1 || i2 == 2) {
                        Intent intent2 = new Intent();
                        intent2.putExtra("confirm_report", 1);
                        EsimConfirmBtFailActivity.this.setResult(1, intent2);
                        EsimConfirmBtFailActivity.this.finish();
                    } else {
                        Object obj2 = obj;
                        if (obj2 != null && (obj2 instanceof Integer) && ((Integer) obj2).intValue() == -2) {
                            EsimConfirmBtFailActivity.this.a();
                            return;
                        }
                        xjt.q("mAuthBaseResponseCallback errorCode: " + i);
                        EsimConfirmBtFailActivity.this.b(i);
                    }
                    EsimConfirmBtFailActivity.this.a();
                }
            });
        }
    };
    private IBaseResponseCallback g = new IBaseResponseCallback() { // from class: com.huawei.sim.esim.view.EsimConfirmBtFailActivity.3
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("EsimConfirmBtFailActivity", "errorCode ", Integer.valueOf(i));
            EsimConfirmBtFailActivity.this.n.removeMessages(6);
            if (i == 1) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                EsimConfirmBtFailActivity.this.n.sendMessage(messageObtain);
            } else if (i == 2) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 2;
                EsimConfirmBtFailActivity.this.n.sendMessage(messageObtain2);
            } else {
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = 3;
                EsimConfirmBtFailActivity.this.n.sendMessage(messageObtain3);
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_confirm_bt_fail);
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("confirm_error");
        this.o = stringExtra;
        LogUtil.a("EsimConfirmBtFailActivity", "mErrorCode: ", stringExtra);
        this.i = intent.getStringExtra("confirm_code");
        HealthButton healthButton = (HealthButton) findViewById(R.id.esim_profile_cancel);
        this.j = healthButton;
        healthButton.setOnClickListener(this);
        HealthButton healthButton2 = (HealthButton) findViewById(R.id.esim_profile_retry);
        this.r = healthButton2;
        healthButton2.setText(R.string.IDS_plugin_sim_esim_button_retry);
        this.r.setOnClickListener(this);
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.profile_BT_fail_title_bar);
        this.f = customTitleBar;
        customTitleBar.setLeftButtonClickable(true);
        this.m = (HealthTextView) findViewById(R.id.esim_failed_info);
        this.s = (HealthTextView) findViewById(R.id.esim_success_info);
        this.t = (ImageView) findViewById(R.id.esim_status_success_image);
        this.k = (ImageView) findViewById(R.id.esim_status_image);
        this.e = findViewById(R.id.bt_disconnect);
        this.p = findViewById(R.id.set_bt_reconnect);
        if (pxk.i()) {
            this.p.setVisibility(8);
        } else {
            this.p.setVisibility(0);
            this.p.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.sim.esim.view.EsimConfirmBtFailActivity.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    new Handler().post(new Runnable() { // from class: com.huawei.sim.esim.view.EsimConfirmBtFailActivity.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            pxk.n(EsimConfirmBtFailActivity.this);
                        }
                    });
                }
            });
        }
        this.f23006c = (ImageView) findViewById(R.id.bt_connecting_imgage);
        this.f23005b = findViewById(R.id.bt_connecting);
        npz.b().b(this.g);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        int iC = npz.b().c();
        this.d = iC;
        if (iC == 2) {
            b();
        } else if (iC == 1) {
            c();
        } else {
            d();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        a();
        super.onDestroy();
        npz.b().a(this.g);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.esim_profile_cancel) {
            startActivity(new Intent(this, (Class<?>) ConfirmActivity.class));
            finish();
        } else if (view.getId() == R.id.esim_profile_retry) {
            e(R.string.IDS_plugin_sim_esim_conform_code_auth);
            npz.b().b(this.i, 0, this.h, this.f23004a);
        } else {
            LogUtil.j("EsimConfirmBtFailActivity", "onClick default");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        LogUtil.a("EsimConfirmBtFailActivity", "the error code is: ", Integer.valueOf(i));
        Intent intent = new Intent(this, (Class<?>) EsimConfirmInvailActivity.class);
        intent.putExtra("confirm_error", i);
        startActivity(intent);
        finish();
    }

    private void e(int i) {
        CommonDialog21 commonDialog21 = this.l;
        if (commonDialog21 == null) {
            new CommonDialog21(this, R.style.common_dialog21);
            CommonDialog21 commonDialog21B = CommonDialog21.b(this);
            this.l = commonDialog21B;
            commonDialog21B.b(getResources().getString(i));
            this.l.setCancelable(false);
        } else {
            commonDialog21.b(getResources().getString(i));
        }
        this.l.c();
        LogUtil.a("EsimConfirmBtFailActivity", "mLoadingUserInformationDialog.show()");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f23005b.setVisibility(8);
        this.e.setVisibility(0);
        this.r.setEnabled(false);
        this.m.setVisibility(0);
        this.m.setText(R.string.IDS_plugin_sim_esim_conform_fail_tips);
        this.k.setVisibility(0);
        this.s.setVisibility(8);
        this.t.setVisibility(8);
        this.r.setBackgroundResource(R.drawable.sim_btn_two_disable);
        this.r.setTextColor(getResources().getColor(R.color.IDS_plugin_sim_ext_back_color_20alpha));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.a("EsimConfirmBtFailActivity", "enter dismissLoadingDialog()");
        if (isFinishing()) {
            LogUtil.j("EsimConfirmBtFailActivity", "dismissLoadingDialog isFinishing");
            return;
        }
        CommonDialog21 commonDialog21 = this.l;
        if (commonDialog21 == null || !commonDialog21.isShowing()) {
            return;
        }
        this.l.cancel();
        this.l = null;
        LogUtil.a("EsimConfirmBtFailActivity", "dismissLoadingDialog()!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f23005b.setVisibility(8);
        this.e.setVisibility(8);
        this.r.setEnabled(true);
        String str = this.o;
        if (str != null && "network_failed".equals(str)) {
            this.m.setVisibility(0);
            this.m.setText(R.string.IDS_plugin_esim_conform_network_failed_new);
            this.k.setVisibility(0);
            this.s.setVisibility(8);
            this.t.setVisibility(8);
        } else {
            this.m.setVisibility(8);
            this.k.setVisibility(8);
            this.s.setVisibility(0);
            this.t.setVisibility(0);
        }
        this.r.setBackgroundResource(R.drawable.sim_btn_two);
        this.r.setTextColor(getResources().getColor(R.color.IDS_plugin_sim_next_back_color));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f23005b.setVisibility(0);
        this.e.setVisibility(8);
        this.f23006c.startAnimation(AnimationUtils.loadAnimation(this, R.anim.bt_connecting));
        this.m.setVisibility(0);
        this.m.setText(R.string.IDS_plugin_sim_esim_conform_fail_tips);
        this.k.setVisibility(0);
        this.s.setVisibility(8);
        this.t.setVisibility(8);
        this.r.setEnabled(false);
        this.r.setBackgroundResource(R.drawable.sim_btn_two_disable);
        this.r.setTextColor(getResources().getColor(R.color.IDS_plugin_sim_ext_back_color_20alpha));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
