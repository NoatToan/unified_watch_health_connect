package com.huawei.sim.esim.view;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.sim.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.edittext.HealthEditText;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.npz;
import defpackage.pxk;
import defpackage.qrs;
import defpackage.xjt;
import health.compact.a.LanguageUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes15.dex */
public class ConfirmActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f22991b;
    private ImageView e;
    private HealthEditText f;
    private HealthTextView g;
    private CustomTitleBar h;
    private String j;
    private HealthTextView m;
    private int n;
    private ImageView o;
    private CommonDialog21 k = null;
    private boolean l = false;
    private Handler i = new a(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IBaseResponseCallback f22992c = new IBaseResponseCallback() { // from class: com.huawei.sim.esim.view.ConfirmActivity.2
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("ConfirmActivity", "errorCode ", Integer.valueOf(i));
            if (i == 3) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 3;
                ConfirmActivity.this.i.sendMessage(messageObtain);
            }
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBaseResponseCallback f22990a = new IBaseResponseCallback() { // from class: com.huawei.sim.esim.view.ConfirmActivity.5
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("ConfirmActivity", "mCodeBaseResponseCallback errorCode ", Integer.valueOf(i));
        }
    };
    private IBaseResponseCallback d = new IBaseResponseCallback() { // from class: com.huawei.sim.esim.view.ConfirmActivity.3
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("ConfirmActivity", "mAuthBaseResponseCallback errorCode ", Integer.valueOf(i));
            Message messageObtain = Message.obtain();
            messageObtain.what = 10001;
            messageObtain.arg1 = i;
            messageObtain.obj = obj;
            if (i != 0 || !ConfirmActivity.this.l) {
                ConfirmActivity.this.i.sendMessage(messageObtain);
            } else {
                ConfirmActivity.this.i.sendMessageDelayed(messageObtain, 5000L);
            }
        }
    };
    private TextWatcher p = new TextWatcher() { // from class: com.huawei.sim.esim.view.ConfirmActivity.1
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            LogUtil.a("ConfirmActivity", "CharSequence ", charSequence.toString(), "; length ", Integer.valueOf(charSequence.length()));
            if (charSequence.length() > 255) {
                ConfirmActivity.this.g.setVisibility(0);
                ConfirmActivity.this.g.setText(R.string.IDS_plugin_sim_esim_conform_code_error);
                ConfirmActivity.this.m.setEnabled(false);
                ConfirmActivity.this.m.setTextColor(ConfirmActivity.this.getResources().getColor(R.color.IDS_plugin_sim_ext_back_color_20alpha));
                if (LanguageUtil.ba(ConfirmActivity.this)) {
                    ConfirmActivity.this.o.setImageResource(R.drawable.sim_back_arrow_disable);
                } else {
                    ConfirmActivity.this.o.setImageResource(R.drawable.sim_next_arrow_disable);
                }
                ConfirmActivity.this.f.setBackgroundResource(R.drawable.sim_edit_input_error);
                return;
            }
            if (charSequence.length() != 0) {
                ConfirmActivity.this.m.setEnabled(true);
                ConfirmActivity.this.m.setTextColor(ConfirmActivity.this.getResources().getColor(R.color.IDS_plugin_sim_next_back_color));
                if (LanguageUtil.ba(ConfirmActivity.this)) {
                    ConfirmActivity.this.o.setImageResource(R.drawable.sim_back_arrow);
                } else {
                    ConfirmActivity.this.o.setImageResource(R.drawable.sim_next_arrow);
                }
            } else {
                ConfirmActivity.this.m.setEnabled(false);
                ConfirmActivity.this.m.setTextColor(ConfirmActivity.this.getResources().getColor(R.color.IDS_plugin_sim_ext_back_color_20alpha));
                if (LanguageUtil.ba(ConfirmActivity.this)) {
                    ConfirmActivity.this.o.setImageResource(R.drawable.sim_back_arrow_disable);
                } else {
                    ConfirmActivity.this.o.setImageResource(R.drawable.sim_next_arrow_disable);
                }
            }
            ConfirmActivity.this.g.setVisibility(4);
            ConfirmActivity.this.f.setBackgroundResource(R.drawable.sim_edit_input);
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("ConfirmActivity", "onCreate()");
        qrs.a((Activity) this);
        setContentView(R.layout.activity_confirm);
        Intent intent = getIntent();
        if (intent != null) {
            this.j = intent.getStringExtra("confirm_code");
        }
        c();
        npz.b().b(this.f22992c);
        this.l = pxk.i();
    }

    private void c() {
        this.g = (HealthTextView) findViewById(R.id.confirm_invilid_tips);
        this.f = (HealthEditText) findViewById(R.id.confirm_code);
        this.h = (CustomTitleBar) findViewById(R.id.wirless_manager_title_bar);
        this.f22991b = findViewById(R.id.back_button_text);
        this.m = (HealthTextView) findViewById(R.id.next_button_text);
        this.o = (ImageView) findViewById(R.id.next_button);
        this.e = (ImageView) findViewById(R.id.back_button);
        if (LanguageUtil.ba(this)) {
            this.o.setImageResource(R.drawable.sim_back_arrow);
            this.e.setImageResource(R.drawable.sim_next_arrow);
        }
        e();
    }

    private void e() {
        this.h.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.sim.esim.view.ConfirmActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("ConfirmActivity", "mCustomTitleBar.setLeftButtonOnClickListener");
                npz.b().b(null, 1, ConfirmActivity.this.f22990a, null);
                ConfirmActivity.this.startActivity(new Intent(ConfirmActivity.this, (Class<?>) EsimActivationActivity.class));
                ConfirmActivity.this.finish();
            }
        });
        this.f22991b.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.sim.esim.view.ConfirmActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("ConfirmActivity", "mBackButton.setOnClickListener");
                npz.b().b(null, 1, ConfirmActivity.this.f22990a, null);
                ConfirmActivity.this.startActivity(new Intent(ConfirmActivity.this, (Class<?>) EsimActivationActivity.class));
                ConfirmActivity.this.finish();
            }
        });
        this.m.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.sim.esim.view.ConfirmActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ConfirmActivity confirmActivity = ConfirmActivity.this;
                confirmActivity.j = confirmActivity.f.getText().toString();
                LogUtil.a("ConfirmActivity", "mConfirmCode: ", ConfirmActivity.this.j);
                if (npz.b().c() == 2) {
                    ConfirmActivity.this.c(R.string.IDS_plugin_sim_esim_conform_code_auth);
                    npz.b().b(ConfirmActivity.this.j, 0, ConfirmActivity.this.f22990a, ConfirmActivity.this.d);
                } else {
                    Intent intent = new Intent(ConfirmActivity.this, (Class<?>) EsimConfirmBtFailActivity.class);
                    intent.putExtra("confirm_code", ConfirmActivity.this.j);
                    ConfirmActivity.this.startActivityForResult(intent, 0);
                }
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f.addTextChangedListener(this.p);
        LogUtil.a("ConfirmActivity", "onResume mConfirmCode ", this.j);
        String str = this.j;
        if (str != null) {
            this.f.setText(str);
            HealthEditText healthEditText = this.f;
            healthEditText.setSelection(healthEditText.getText().length());
        }
        LogUtil.a("ConfirmActivity", "CharSequence ", Integer.valueOf(this.n));
        if (this.n != 0) {
            this.m.setEnabled(false);
            this.m.setTextColor(getResources().getColor(R.color.IDS_plugin_sim_ext_back_color_20alpha));
            if (LanguageUtil.ba(this)) {
                this.o.setImageResource(R.drawable.sim_back_arrow_disable);
            } else {
                this.o.setImageResource(R.drawable.sim_next_arrow_disable);
            }
            this.f.setBackgroundResource(R.drawable.sim_edit_input_error);
            this.g.setVisibility(0);
            this.g.setText(R.string.IDS_plugin_sim_esim_conform_code_auth_error_new);
            return;
        }
        if (this.f.getText().length() == 0) {
            this.m.setEnabled(false);
            this.m.setTextColor(getResources().getColor(R.color.IDS_plugin_sim_ext_back_color_20alpha));
            if (LanguageUtil.ba(this)) {
                this.o.setImageResource(R.drawable.sim_back_arrow_disable);
            } else {
                this.o.setImageResource(R.drawable.sim_next_arrow_disable);
            }
        } else {
            this.m.setEnabled(true);
            this.m.setTextColor(getResources().getColor(R.color.IDS_plugin_sim_next_back_color));
            if (LanguageUtil.ba(this)) {
                this.o.setImageResource(R.drawable.sim_back_arrow);
            } else {
                this.o.setImageResource(R.drawable.sim_next_arrow);
            }
        }
        this.g.setVisibility(4);
        this.f.setBackgroundResource(R.drawable.sim_edit_input);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LogUtil.a("ConfirmActivity", "onDestroy()");
        a();
        super.onDestroy();
        npz.b().a(this.f22992c);
        npz.b().b(this.f22990a, this.d);
        HealthEditText healthEditText = this.f;
        if (healthEditText != null) {
            healthEditText.removeTextChangedListener(this.p);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    private void b(int i) {
        LogUtil.a("ConfirmActivity", "the error code is: ", Integer.valueOf(i));
        Intent intent = new Intent(this, (Class<?>) EsimConfirmInvailActivity.class);
        intent.putExtra("confirm_error", i);
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        CommonDialog21 commonDialog21 = this.k;
        if (commonDialog21 == null) {
            LogUtil.a("ConfirmActivity", "mLoadingUserInformationDialog is null");
            new CommonDialog21(this, R.style.common_dialog21);
            CommonDialog21 commonDialog21B = CommonDialog21.b(this);
            this.k = commonDialog21B;
            commonDialog21B.b(getResources().getString(i));
            this.k.setCancelable(false);
        } else {
            commonDialog21.b(getResources().getString(i));
        }
        this.k.c();
        LogUtil.a("ConfirmActivity", "mLoadingUserInformationDialog show");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(int i) {
        CommonDialog21 commonDialog21;
        if (i != -2 || (commonDialog21 = this.k) == null || !commonDialog21.isShowing()) {
            return false;
        }
        Intent intent = new Intent(this, (Class<?>) EsimConfirmBtFailActivity.class);
        intent.putExtra("confirm_code", this.j);
        startActivityForResult(intent, 0);
        LogUtil.a("ConfirmActivity", "ERROR_BT_DISCONNECTED mConfirmCode = ", this.j);
        a();
        return true;
    }

    private void a() {
        LogUtil.a("ConfirmActivity", "enter dismissLoadingDialog()");
        CommonDialog21 commonDialog21 = this.k;
        if (commonDialog21 == null || !commonDialog21.isShowing()) {
            return;
        }
        LogUtil.a("ConfirmActivity", "dismissLoadingDialog!");
        this.k.cancel();
        this.k = null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        LogUtil.a("ConfirmActivity", "requestCode:", Integer.valueOf(i), "; resultCode:", Integer.valueOf(i2));
        super.onActivityResult(i, i2, intent);
        if (i2 != 1 || intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("confirm_report", 1);
        this.n = intExtra;
        if (intExtra != 0) {
            this.m.setEnabled(false);
            this.m.setTextColor(getResources().getColor(R.color.IDS_plugin_sim_ext_back_color_20alpha));
            if (LanguageUtil.ba(this)) {
                this.o.setImageResource(R.drawable.sim_back_arrow_disable);
            } else {
                this.o.setImageResource(R.drawable.sim_next_arrow_disable);
            }
            this.f.setBackgroundResource(R.drawable.sim_edit_input_error);
            this.g.setVisibility(0);
            this.g.setText(R.string.IDS_plugin_sim_esim_conform_code_auth_error_new);
            return;
        }
        this.m.setEnabled(true);
        this.m.setTextColor(getResources().getColor(R.color.IDS_plugin_sim_next_back_color));
        if (LanguageUtil.ba(this)) {
            this.o.setImageResource(R.drawable.sim_back_arrow);
        } else {
            this.o.setImageResource(R.drawable.sim_next_arrow);
        }
        this.g.setVisibility(4);
        this.f.setBackgroundResource(R.drawable.sim_edit_input);
    }

    private void b() {
        this.g.setVisibility(0);
        this.g.setText(R.string.IDS_plugin_sim_esim_conform_code_auth_error_new);
        this.f.setBackgroundResource(R.drawable.sim_edit_input_error);
        this.m.setEnabled(false);
        this.m.setTextColor(getResources().getColor(R.color.IDS_plugin_sim_ext_back_color_20alpha));
        if (LanguageUtil.ba(this)) {
            this.o.setImageResource(R.drawable.sim_back_arrow_disable);
        } else {
            this.o.setImageResource(R.drawable.sim_next_arrow_disable);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        LogUtil.a("ConfirmActivity", "ConfirmActivity onKeyDown");
        if (i == 4) {
            npz.b().b(null, 1, this.f22990a, null);
            startActivity(new Intent(this, (Class<?>) EsimActivationActivity.class));
            finish();
        }
        return super.onKeyDown(i, keyEvent);
    }

    static class a extends Handler {
        private WeakReference<ConfirmActivity> d;

        a(ConfirmActivity confirmActivity) {
            this.d = new WeakReference<>(confirmActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("ConfirmActivity", "ConfirmActivityHandler handleMessageWhenReferenceNotNull msg is null");
                return;
            }
            super.handleMessage(message);
            WeakReference<ConfirmActivity> weakReference = this.d;
            if (weakReference == null || weakReference.get() == null) {
                LogUtil.a("ConfirmActivity", "mWeakActivity is null");
                return;
            }
            ConfirmActivity confirmActivity = this.d.get();
            LogUtil.a("ConfirmActivity", "mActivity :", confirmActivity, "message.what ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 3) {
                confirmActivity.d(-2);
            } else if (i == 10001) {
                confirmActivity.a(message.arg1, message.obj);
            } else {
                LogUtil.j("ConfirmActivity", "ConfirmActivityHandler handleMessageWhenReferenceNotNull is default");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Object obj) {
        pxk.a(i, true);
        if (i == 0) {
            Intent intent = new Intent(this, (Class<?>) EsimProfileSuccessActivity.class);
            intent.putExtra("confirm_status", true);
            startActivity(intent);
        } else if (i == 4) {
            Intent intent2 = new Intent(this, (Class<?>) EsimConfirmBtFailActivity.class);
            intent2.putExtra("confirm_error", "network_failed");
            intent2.putExtra("confirm_code", this.j);
            startActivityForResult(intent2, 0);
        } else if (i == 1 || i == 2) {
            this.n = 1;
            b();
        } else {
            if ((obj instanceof Integer) && d(((Integer) obj).intValue())) {
                return;
            }
            xjt.q("parseAuthCallback Invail errorCode: " + i);
            b(i);
        }
        a();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
