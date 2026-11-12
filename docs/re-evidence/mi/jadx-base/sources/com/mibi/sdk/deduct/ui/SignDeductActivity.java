package com.mibi.sdk.deduct.ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import com.mibi.sdk.common.LocalBroadcastManager;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.BaseMvpActivity;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.EntryResultUtils;
import com.mibi.sdk.component.ErrorCodes;
import com.mibi.sdk.deduct.c;
import com.mibi.sdk.mvp.IPresenter;
import com.mibi.sdk.widget.SimpleProgressDialog;
import defpackage.ajs;
import defpackage.dxs;
import defpackage.qus;
import defpackage.xrs;

/* JADX INFO: loaded from: classes5.dex */
public class SignDeductActivity extends BaseMvpActivity implements dxs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SimpleProgressDialog f10174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10175b;
    public BroadcastReceiver c = new b();

    public class a implements DialogInterface.OnCancelListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            SignDeductActivity.this.c(ErrorCodes.SIGN_DEDUCT_CANCEL, SignDeductActivity.this.f10175b + " cancelled by user", null);
            SignDeductActivity.this.finish();
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MibiLog.d("SignDeductActivity", "onReceive");
            String stringExtra = intent.getStringExtra("mibi_alipay_status");
            if (TextUtils.equals("9000", stringExtra)) {
                ((qus) SignDeductActivity.this.getPresenter()).b();
            } else if (TextUtils.equals("6001", stringExtra)) {
                SignDeductActivity.this.c(ErrorCodes.SIGN_DEDUCT_CANCEL, context.getResources().getString(com.mibi.sdk.deduct.a.f10137r), null);
            } else {
                SignDeductActivity.this.c(ErrorCodes.SIGN_DEDUCT_FAILED, "alipay sign deduct exception", null);
            }
        }
    }

    private void p(boolean z, String str) {
        if (!z) {
            SimpleProgressDialog simpleProgressDialog = this.f10174a;
            if (simpleProgressDialog == null || !simpleProgressDialog.isShowing()) {
                MibiLog.d("SignDeductActivity", "mProgressDialog is null or not showing");
                return;
            } else {
                this.f10174a.dismiss();
                return;
            }
        }
        if (this.f10174a == null) {
            SimpleProgressDialog simpleProgressDialog2 = new SimpleProgressDialog(this);
            this.f10174a = simpleProgressDialog2;
            simpleProgressDialog2.setCanceledOnTouchOutside(false);
            this.f10174a.setCancelable(true);
            this.f10174a.setOnCancelListener(new a());
        }
        this.f10174a.setMessage(str);
        this.f10174a.show();
    }

    private String q() {
        if (c.a.MIPAY.a().equals(this.f10175b)) {
            return getString(com.mibi.sdk.deduct.a.o, getString(com.mibi.sdk.deduct.a.f10136k));
        }
        if (c.a.ALIPAY.a().equals(this.f10175b)) {
            return getString(com.mibi.sdk.deduct.a.o, getString(com.mibi.sdk.deduct.a.h));
        }
        if (c.a.WXPAY.a().equals(this.f10175b)) {
            return getString(com.mibi.sdk.deduct.a.o, getString(com.mibi.sdk.deduct.a.n));
        }
        if (c.a.UNIONPAY.a().equals(this.f10175b)) {
            return getString(com.mibi.sdk.deduct.a.o, getString(com.mibi.sdk.deduct.a.l));
        }
        throw new IllegalStateException("channelName is " + this.f10175b);
    }

    @Override // defpackage.dxs
    public void b(boolean z) {
        p(z, getResources().getString(com.mibi.sdk.deduct.a.q));
    }

    @Override // defpackage.dxs
    public void c(int i, String str, Bundle bundle) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("returnResult errorCode : ");
        stringBuffer.append(i);
        stringBuffer.append(" ; errorDesc : ");
        stringBuffer.append(str);
        MibiLog.d("SignDeductActivity", stringBuffer.toString());
        p(false, null);
        setResult(i, EntryResultUtils.makeResult(i, str, bundle));
        finish();
    }

    @Override // defpackage.dxs
    public void f(xrs<Activity> xrsVar) {
        xrsVar.a(this);
    }

    @Override // com.mibi.sdk.component.BaseMvpActivity, com.mibi.sdk.mvp.MvpActivity
    public void handleCreate(Bundle bundle) {
        super.handleCreate(bundle);
        LocalBroadcastManager.getInstance(this).registerReceiver(this.c, new IntentFilter("com.mibi.sdk.alipay.result.action"));
        if (bundle == null) {
            this.f10175b = getIntent().getExtras().getString(Constants.KEY_SIGN_DEDUCT_CHANNEL);
        } else {
            this.f10175b = bundle.getString(Constants.KEY_SIGN_DEDUCT_CHANNEL);
        }
        p(true, q());
    }

    @Override // com.mibi.sdk.mvp.IPresenterFactory
    public IPresenter onCreatePresenter() {
        return new ajs().d(this);
    }

    @Override // com.mibi.sdk.mvp.MvpActivity, android.app.Activity
    public void onDestroy() {
        SimpleProgressDialog simpleProgressDialog = this.f10174a;
        if (simpleProgressDialog != null && simpleProgressDialog.isShowing()) {
            this.f10174a.dismiss();
        }
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.c);
        super.onDestroy();
    }

    @Override // com.mibi.sdk.component.BaseMvpActivity, com.mibi.sdk.mvp.MvpActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((ajs) getPresenter()).a();
    }

    @Override // com.mibi.sdk.component.BaseMvpActivity, com.mibi.sdk.mvp.MvpActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString(Constants.KEY_SIGN_DEDUCT_CHANNEL, this.f10175b);
    }
}
