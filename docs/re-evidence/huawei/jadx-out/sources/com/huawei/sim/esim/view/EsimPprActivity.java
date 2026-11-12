package com.huawei.sim.esim.view;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.sim.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.npz;
import defpackage.pxk;

/* JADX INFO: loaded from: classes15.dex */
public class EsimPprActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f23034a;
    private HealthButton d;
    private CustomTitleBar e;
    private LinearLayout g;
    private boolean h;
    private LinearLayout j;
    private byte[] o;
    private CommonDialog21 i = null;
    private boolean f = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IBaseResponseCallback f23036c = new IBaseResponseCallback() { // from class: com.huawei.sim.esim.view.EsimPprActivity.4
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.d("EsimPprActivity", "errorCode ", Integer.valueOf(i));
            Message messageObtain = Message.obtain();
            messageObtain.what = 0;
            messageObtain.arg1 = i;
            if (i != 0 || !EsimPprActivity.this.f) {
                EsimPprActivity.this.f23035b.sendMessage(messageObtain);
            } else {
                EsimPprActivity.this.f23035b.sendMessageDelayed(messageObtain, 5000L);
            }
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f23035b = new Handler() { // from class: com.huawei.sim.esim.view.EsimPprActivity.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("EsimPprActivity", "mHandler message is null");
                return;
            }
            super.handleMessage(message);
            LogUtil.d("EsimPprActivity", "message ", Integer.valueOf(message.what));
            if (message.what == 0) {
                EsimPprActivity.this.c(message.arg1);
            } else {
                LogUtil.j("EsimPprActivity", "handleMessage default");
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_ppr_rules);
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        try {
            this.o = intent.getByteArrayExtra("profile_policy_rules");
        } catch (ArrayIndexOutOfBoundsException unused) {
            LogUtil.e("EsimPprActivity", "onCreate ArrayIndexOutOfBoundsException");
        }
        boolean booleanExtra = intent.getBooleanExtra("confirm_status", false);
        this.h = booleanExtra;
        LogUtil.a("EsimPprActivity", "the mIsNeedConfirm: ", Boolean.valueOf(booleanExtra));
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.ppr_title_bar);
        this.e = customTitleBar;
        customTitleBar.setTitleText(getResources().getString(R.string.IDS_plugin_sim_ppr_title));
        this.e.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.sim.esim.view.EsimPprActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EsimPprActivity.this.finish();
            }
        });
        d();
        HealthButton healthButton = (HealthButton) findViewById(R.id.cancel_button);
        this.f23034a = healthButton;
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.sim.esim.view.EsimPprActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EsimPprActivity.this.finish();
            }
        });
        e();
        this.f = pxk.i();
    }

    private void d() {
        HealthButton healthButton = (HealthButton) findViewById(R.id.confirm_button);
        this.d = healthButton;
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.sim.esim.view.EsimPprActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (EsimPprActivity.this.f) {
                    if (EsimPprActivity.this.h) {
                        EsimPprActivity.this.startActivity(new Intent(EsimPprActivity.this, (Class<?>) ConfirmActivity.class));
                        EsimPprActivity.this.finish();
                        return;
                    } else {
                        npz.b().b(null, 0, null, EsimPprActivity.this.f23036c);
                        EsimPprActivity.this.d(R.string.IDS_plugin_sim_esim_handling);
                        return;
                    }
                }
                if (EsimPprActivity.this.h) {
                    EsimPprActivity.this.startActivity(new Intent(EsimPprActivity.this, (Class<?>) ConfirmActivity.class));
                } else {
                    npz.b().b(null, 0, EsimPprActivity.this.f23036c, null);
                    EsimPprActivity.this.d(R.string.IDS_plugin_sim_esim_handling);
                }
                EsimPprActivity.this.finish();
            }
        });
    }

    private void e() {
        this.j = (LinearLayout) findViewById(R.id.ll_ppr1_info);
        this.g = (LinearLayout) findViewById(R.id.ll_ppr2_info);
        byte[] bArr = this.o;
        if (bArr == null || bArr.length == 0) {
            return;
        }
        byte b2 = bArr[0];
        if (b2 == 64 || b2 == -64) {
            LogUtil.a("EsimPprActivity", "mPprTypes[0] == 0x40 || mPprTypes[0] == 0xC0");
            this.j.setVisibility(0);
            return;
        }
        if (b2 == 32 || b2 == -96) {
            LogUtil.a("EsimPprActivity", "mPprTypes[0] == 0x20 || mPprTypes[0] == 0xA0");
            this.g.setVisibility(0);
        } else {
            if (b2 == 96 || b2 == -32) {
                LogUtil.a("EsimPprActivity", "mPprTypes[0] == 0x60 || mPprTypes[0] == 0xE0");
                this.j.setVisibility(0);
                this.g.setVisibility(0);
                return;
            }
            LogUtil.a("EsimPprActivity", "initPprTypes default");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        if (this.h) {
            LogUtil.d("EsimPprActivity", "commandResult errorcode ", Integer.valueOf(i));
            c();
            return;
        }
        pxk.a(i, true);
        if (i == 0) {
            Intent intent = new Intent(this, (Class<?>) EsimProfileSuccessActivity.class);
            intent.putExtra("confirm_status", false);
            startActivity(intent);
        } else if (npz.b().c() == 2) {
            LogUtil.j("EsimPprActivity", "DeviceConnectState.DEVICE_CONNECTED");
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        CommonDialog21 commonDialog21 = this.i;
        if (commonDialog21 == null) {
            new CommonDialog21(this, R.style.common_dialog21);
            CommonDialog21 commonDialog21B = CommonDialog21.b(this);
            this.i = commonDialog21B;
            commonDialog21B.b(getResources().getString(i));
            this.i.setCancelable(false);
        } else {
            commonDialog21.b(getResources().getString(i));
        }
        this.i.c();
        LogUtil.a("EsimPprActivity", "mLoadingUserInformationDialog.show()");
    }

    private void c() {
        CommonDialog21 commonDialog21;
        LogUtil.a("EsimPprActivity", "enter dismissLoadingDialog()");
        if (isFinishing() || (commonDialog21 = this.i) == null || !commonDialog21.isShowing()) {
            return;
        }
        LogUtil.a("EsimPprActivity", "dismissLoadingDialog()!");
        this.i.cancel();
        this.i = null;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
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
