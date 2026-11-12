package com.mibi.sdk.deduct.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.BaseMvpActivity;
import com.mibi.sdk.component.EntryResultUtils;
import com.mibi.sdk.component.ErrorCodes;
import com.mibi.sdk.deduct.c;
import com.mibi.sdk.mvp.IPresenter;
import com.mibi.sdk.widget.SimpleProgressDialog;
import defpackage.lns;
import defpackage.nes;
import defpackage.pes;
import defpackage.yis;

/* JADX INFO: loaded from: classes5.dex */
public class DeductActivity extends BaseMvpActivity implements lns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SimpleProgressDialog f10169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10170b;

    public class a implements DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f10171a;

        public a(boolean z) {
            this.f10171a = z;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (this.f10171a) {
                DeductActivity.this.c(ErrorCodes.DEDUCT_CANCEL, DeductActivity.this.f10170b + " cancelled by user", null);
                DeductActivity.this.finish();
            }
        }
    }

    @Override // defpackage.lns
    public void b(boolean z) {
        p(z, getResources().getString(com.mibi.sdk.deduct.a.q));
    }

    @Override // defpackage.lns
    public void c(int i, String str, Bundle bundle) {
        MibiLog.d("DeductActivity", "return result code : " + i + " ; msg : " + str);
        q(false, null, false);
        setResult(i, EntryResultUtils.makeResult(i, str));
        finish();
    }

    @Override // defpackage.lns
    public void d(nes<Activity> nesVar) {
        nesVar.a(this);
    }

    @Override // com.mibi.sdk.component.BaseMvpActivity, com.mibi.sdk.mvp.MvpActivity
    public void handleCreate(Bundle bundle) {
        super.handleCreate(bundle);
        if (bundle == null) {
            this.f10170b = getIntent().getExtras().getString("deductChannel");
        } else {
            this.f10170b = bundle.getString("deductChannel");
        }
        p(true, r());
    }

    @Override // com.mibi.sdk.mvp.IPresenterFactory
    public IPresenter onCreatePresenter() {
        return new pes();
    }

    @Override // com.mibi.sdk.mvp.MvpActivity, android.app.Activity
    public void onDestroy() {
        SimpleProgressDialog simpleProgressDialog = this.f10169a;
        if (simpleProgressDialog != null && simpleProgressDialog.isShowing()) {
            this.f10169a.dismiss();
        }
        super.onDestroy();
    }

    @Override // com.mibi.sdk.component.BaseMvpActivity, com.mibi.sdk.mvp.MvpActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((yis) getPresenter()).a();
    }

    @Override // com.mibi.sdk.component.BaseMvpActivity, com.mibi.sdk.mvp.MvpActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("deductChannel", this.f10170b);
    }

    public final void p(boolean z, String str) {
        q(z, str, true);
    }

    public final void q(boolean z, String str, boolean z2) {
        if (!z) {
            SimpleProgressDialog simpleProgressDialog = this.f10169a;
            if (simpleProgressDialog == null || !simpleProgressDialog.isShowing()) {
                return;
            }
            this.f10169a.dismiss();
            return;
        }
        if (this.f10169a == null) {
            SimpleProgressDialog simpleProgressDialog2 = new SimpleProgressDialog(this);
            this.f10169a = simpleProgressDialog2;
            simpleProgressDialog2.setCanceledOnTouchOutside(false);
            this.f10169a.setCancelable(true);
            this.f10169a.setOnCancelListener(new a(z2));
        }
        this.f10169a.setMessage(str);
        this.f10169a.show();
    }

    public final String r() {
        if (c.a.MIPAY.a().equals(this.f10170b)) {
            return getString(com.mibi.sdk.deduct.a.o, getString(com.mibi.sdk.deduct.a.f10136k));
        }
        if (c.a.ALIPAY.a().equals(this.f10170b)) {
            return getString(com.mibi.sdk.deduct.a.o, getString(com.mibi.sdk.deduct.a.h));
        }
        if (c.a.WXPAY.a().equals(this.f10170b)) {
            return getString(com.mibi.sdk.deduct.a.o, getString(com.mibi.sdk.deduct.a.n));
        }
        if (c.a.UNIONPAY.a().equals(this.f10170b)) {
            return getString(com.mibi.sdk.deduct.a.o, getString(com.mibi.sdk.deduct.a.l));
        }
        throw new IllegalStateException("channelName is " + this.f10170b);
    }
}
