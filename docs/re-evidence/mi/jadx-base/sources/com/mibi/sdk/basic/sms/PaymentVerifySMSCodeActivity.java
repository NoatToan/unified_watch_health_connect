package com.mibi.sdk.basic.sms;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.timepicker.TimeModel;
import com.mibi.sdk.basic.c;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.MibiSdkConstants;
import com.mibi.sdk.component.BaseMvpActivity;
import com.mibi.sdk.component.EntryResultUtils;
import com.mibi.sdk.mvp.IPresenter;
import com.mibi.sdk.widget.ProgressButton;
import defpackage.mes;
import defpackage.q9s;
import defpackage.x2s;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class PaymentVerifySMSCodeActivity extends BaseMvpActivity implements q9s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ProgressButton f10090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ProgressButton f10091b;
    public EditText c;
    public TextView d;
    public TextView e;
    public ProgressButton.IOnClickListener f = new a();
    public ProgressButton.IOnClickListener g = new b();

    public class a implements ProgressButton.IOnClickListener {
        public a() {
        }

        @Override // com.mibi.sdk.widget.ProgressButton.IOnClickListener
        public void onClick(View view) {
            PaymentVerifySMSCodeActivity.this.f10090a.setVisibility(0);
            PaymentVerifySMSCodeActivity.this.f10090a.startProgress();
            ((x2s) PaymentVerifySMSCodeActivity.this.getPresenter()).a();
        }
    }

    public class b implements ProgressButton.IOnClickListener {
        public b() {
        }

        @Override // com.mibi.sdk.widget.ProgressButton.IOnClickListener
        public void onClick(View view) {
            String string = PaymentVerifySMSCodeActivity.this.c.getText().toString();
            if (TextUtils.isEmpty(string)) {
                PaymentVerifySMSCodeActivity.this.d.setVisibility(0);
                PaymentVerifySMSCodeActivity.this.d.setText(PaymentVerifySMSCodeActivity.this.getString(c.f10089b));
            } else {
                PaymentVerifySMSCodeActivity.this.d.setVisibility(8);
                ((x2s) PaymentVerifySMSCodeActivity.this.getPresenter()).a(string);
            }
        }
    }

    @Override // defpackage.q9s
    public void a(int i) {
        if (i > 0) {
            this.e.setVisibility(0);
            this.f10090a.setVisibility(8);
            this.e.setText(String.format(Locale.ENGLISH, TimeModel.NUMBER_FORMAT, Integer.valueOf(i)));
        } else {
            this.e.setVisibility(8);
            this.f10090a.setVisibility(0);
            this.f10090a.stopProgress();
        }
    }

    @Override // defpackage.q9s
    public void d() {
        setResult(MibiSdkConstants.RESULT_CHECK_RISK_ERROR, EntryResultUtils.makeResult(CommonConstants.Mgc.NEED_AUTH_ERROR, "need re-login"));
        finish();
    }

    @Override // defpackage.q9s
    public void e(String str, Throwable th) {
        if (!TextUtils.isEmpty(str)) {
            this.d.setVisibility(0);
            this.d.setText(str);
        }
        this.f10091b.stopProgress();
    }

    @Override // com.mibi.sdk.component.BaseMvpActivity, com.mibi.sdk.mvp.MvpActivity
    public void handleCreate(Bundle bundle) {
        super.handleCreate(bundle);
        setContentView(com.mibi.sdk.basic.b.f10087b);
        ProgressButton progressButton = (ProgressButton) findViewById(com.mibi.sdk.basic.a.c);
        this.f10090a = progressButton;
        progressButton.setClickListener(this.f);
        ProgressButton progressButton2 = (ProgressButton) findViewById(com.mibi.sdk.basic.a.f10076a);
        this.f10091b = progressButton2;
        progressButton2.setClickListener(this.g);
        this.c = (EditText) findViewById(com.mibi.sdk.basic.a.e);
        this.d = (TextView) findViewById(com.mibi.sdk.basic.a.j);
        this.e = (TextView) findViewById(com.mibi.sdk.basic.a.i);
        TextView textView = (TextView) findViewById(com.mibi.sdk.basic.a.f10078k);
        String stringExtra = getIntent().getStringExtra(CommonConstants.KEY_PHONE_NUM);
        if (TextUtils.isEmpty(stringExtra)) {
            throw new IllegalArgumentException("PhoneNum should not be null in PaymentVerifySMSCodeFragment");
        }
        int length = stringExtra.length();
        if (length > 4) {
            stringExtra = stringExtra.substring(length - 4);
        }
        textView.setText(getString(c.c, stringExtra));
    }

    @Override // defpackage.q9s
    public void l(int i, String str) {
        setResult(i, EntryResultUtils.makeResult(i, str));
        finish();
    }

    @Override // com.mibi.sdk.mvp.IPresenterFactory
    public IPresenter onCreatePresenter() {
        return new mes(q9s.class);
    }

    @Override // defpackage.q9s
    public void a() {
        setResult(-1);
        finish();
    }

    @Override // defpackage.q9s
    public void a(Bundle bundle) {
        this.f10091b.stopProgress();
        Intent intent = new Intent();
        intent.putExtras(bundle);
        setResult(MibiSdkConstants.RESULT_CHECK_RISK_ERROR, intent);
        finish();
    }
}
