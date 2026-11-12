package com.mibi.sdk.basic.auth;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.EditText;
import android.widget.TextView;
import com.mi.fitness.netproxy.NetProxyComponentKt;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.MibiSdkConstants;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.BaseMvpActivity;
import com.mibi.sdk.component.EntryResultUtils;
import com.mibi.sdk.component.ErrorCodes;
import com.mibi.sdk.component.KeyboardManager;
import com.mibi.sdk.mvp.IPresenter;
import com.mibi.sdk.widget.ProgressButton;
import defpackage.des;
import defpackage.p9s;
import defpackage.w2s;

/* JADX INFO: loaded from: classes5.dex */
public class PaymentCheckPasswordActivity extends BaseMvpActivity implements p9s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f10079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EditText f10080b;
    public TextView c;
    public View d;
    public ProgressButton e;
    public KeyboardManager f;
    public ProgressButton.IOnClickListener g = new a();
    public View.OnClickListener h = new b();

    public class a implements ProgressButton.IOnClickListener {
        public a() {
        }

        @Override // com.mibi.sdk.widget.ProgressButton.IOnClickListener
        public void onClick(View view) {
            String string = PaymentCheckPasswordActivity.this.f10080b.getText().toString();
            if (TextUtils.isEmpty(string)) {
                PaymentCheckPasswordActivity paymentCheckPasswordActivity = PaymentCheckPasswordActivity.this;
                paymentCheckPasswordActivity.e(paymentCheckPasswordActivity.getString(com.mibi.sdk.basic.c.f10088a), null);
            } else {
                PaymentCheckPasswordActivity.this.e.startProgress();
                PaymentCheckPasswordActivity.this.f10079a.setVisibility(4);
                ((w2s) PaymentCheckPasswordActivity.this.getPresenter()).a(PaymentCheckPasswordActivity.this, ((BaseMvpActivity) PaymentCheckPasswordActivity.this).mSession.getUserId(), string);
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(CommonConstants.getAccountBaseUrl("/forgetPassword")));
            intent.addFlags(67108864);
            intent.addFlags(268435456);
            intent.addFlags(NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY);
            PaymentCheckPasswordActivity.this.startActivity(intent);
        }
    }

    public class c implements KeyboardManager.IKeyboardChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f10083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10084b;

        public class a implements Animation.AnimationListener {
            public a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                PaymentCheckPasswordActivity.this.d.setVisibility(0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                PaymentCheckPasswordActivity.this.d.setVisibility(4);
            }
        }

        public c() {
        }

        public final void a() {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, -this.f10084b, 0.0f);
            translateAnimation.setDuration(450L);
            translateAnimation.setInterpolator(new AccelerateInterpolator());
            translateAnimation.setFillAfter(false);
            translateAnimation.setAnimationListener(new a());
            PaymentCheckPasswordActivity.this.d.startAnimation(translateAnimation);
        }

        @Override // com.mibi.sdk.component.KeyboardManager.IKeyboardChangedListener
        public void onKeyboardStateChanged(boolean z, int i) {
            if (this.f10084b == 0 && i > 0) {
                this.f10084b = i;
            }
            if (this.f10083a != z) {
                if (!z) {
                    a();
                }
                this.f10083a = z;
            }
        }

        public /* synthetic */ c(PaymentCheckPasswordActivity paymentCheckPasswordActivity, a aVar) {
            this();
        }
    }

    @Override // defpackage.p9s
    public void a(int i, String str) {
        MibiLog.d("PaymentCheckPwd", "showLoginAccountError : " + i);
        this.e.stopProgress();
        if (i == 3) {
            this.c.setVisibility(0);
        } else {
            this.c.setVisibility(8);
        }
    }

    @Override // defpackage.p9s
    public void b() {
        MibiLog.d("PaymentCheckPwd", "showProcessExpired");
        this.e.stopProgress();
    }

    @Override // defpackage.p9s
    public void c() {
        MibiLog.d("PaymentCheckPwd", "showPasswordError");
        this.e.stopProgress();
        this.c.setVisibility(0);
        this.f10079a.setVisibility(0);
        this.f10079a.setText(com.mibi.sdk.basic.c.f10088a);
    }

    @Override // defpackage.p9s
    public void e() {
        MibiLog.d("PaymentCheckPwd", "showAccountFrozen");
        this.e.stopProgress();
        setResult(9, EntryResultUtils.makeResult(9, "account frozen"));
        finish();
    }

    @Override // com.mibi.sdk.component.BaseMvpActivity
    public boolean handleBackPressed() {
        MibiLog.d("PaymentCheckPwd", "onBackPressed");
        setResult(ErrorCodes.USER_CANCEL_INPUT_PWD, EntryResultUtils.makeResult(ErrorCodes.USER_CANCEL_INPUT_PWD, "check password canceled by user"));
        return true;
    }

    @Override // com.mibi.sdk.component.BaseMvpActivity, com.mibi.sdk.mvp.MvpActivity
    public void handleCreate(Bundle bundle) {
        super.handleCreate(bundle);
        setContentView(com.mibi.sdk.basic.b.f10086a);
        this.d = findViewById(com.mibi.sdk.basic.a.d);
        this.f10079a = (TextView) findViewById(com.mibi.sdk.basic.a.f);
        this.f10080b = (EditText) findViewById(com.mibi.sdk.basic.a.g);
        TextView textView = (TextView) findViewById(com.mibi.sdk.basic.a.h);
        this.c = textView;
        textView.setOnClickListener(this.h);
        ProgressButton progressButton = (ProgressButton) findViewById(com.mibi.sdk.basic.a.f10077b);
        this.e = progressButton;
        progressButton.setClickListener(this.g);
        this.f = KeyboardManager.get(getWindow().getDecorView(), new c(this, null));
    }

    @Override // com.mibi.sdk.mvp.IPresenterFactory
    public IPresenter onCreatePresenter() {
        return new des(p9s.class);
    }

    @Override // com.mibi.sdk.mvp.MvpActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        KeyboardManager keyboardManager = this.f;
        if (keyboardManager != null) {
            keyboardManager.release();
        }
    }

    @Override // defpackage.p9s
    public void a(Bundle bundle) {
        MibiLog.d("PaymentCheckPwd", "handleRiskResultReturn");
        this.e.stopProgress();
        Intent intent = new Intent();
        intent.putExtras(bundle);
        setResult(MibiSdkConstants.RESULT_CHECK_RISK_ERROR, intent);
        finish();
    }

    @Override // defpackage.p9s
    public void e(String str, Throwable th) {
        this.f10079a.setVisibility(0);
        this.f10079a.setText(str);
    }

    @Override // defpackage.p9s
    public void a() {
        MibiLog.d("PaymentCheckPwd", "handleCheckAuthSuccess");
        this.e.stopProgress();
        setResult(-1, null);
        finish();
    }
}
