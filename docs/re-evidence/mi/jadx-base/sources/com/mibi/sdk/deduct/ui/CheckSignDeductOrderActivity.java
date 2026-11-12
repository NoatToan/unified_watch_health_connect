package com.mibi.sdk.deduct.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.BaseMvpActivity;
import com.mibi.sdk.component.EntryResultUtils;
import com.mibi.sdk.component.ErrorCodes;
import com.mibi.sdk.deduct.a;
import com.mibi.sdk.mvp.IPresenter;
import com.mibi.sdk.widget.SimpleProgressDialog;
import defpackage.b9s;
import defpackage.s9s;

/* JADX INFO: loaded from: classes5.dex */
public class CheckSignDeductOrderActivity extends BaseMvpActivity implements s9s, DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SimpleProgressDialog f10168a;

    private void b() {
        this.f10168a = new SimpleProgressDialog(this);
        this.f10168a.setMessage(getResources().getString(a.p));
        this.f10168a.setOnCancelListener(this);
    }

    @Override // defpackage.s9s
    public void a(Bundle bundle) {
        MibiLog.d("CheckSignDeductOrderAct", "goDeduct");
        Intent intent = new Intent(this, (Class<?>) SignDeductActivity.class);
        intent.putExtras(bundle);
        startActivityForResult(intent, 120);
        a(false);
    }

    @Override // defpackage.s9s
    public void c(int i, String str, Bundle bundle) {
        MibiLog.d("CheckSignDeductOrderAct", "returnResult code : " + i + " ; msg : " + str);
        Intent intent = new Intent();
        intent.putExtra("message", str);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        setResult(i, intent);
        a(false);
        finish();
    }

    @Override // com.mibi.sdk.component.BaseMvpActivity, com.mibi.sdk.mvp.MvpActivity
    public void handleCreate(Bundle bundle) {
        super.handleCreate(bundle);
        b();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        c(ErrorCodes.USER_CANCEL_CHECK_SIGN_DEDUCT_ORDER, getBaseContext().getResources().getString(a.d), null);
        finish();
    }

    @Override // com.mibi.sdk.mvp.IPresenterFactory
    public IPresenter onCreatePresenter() {
        return new b9s();
    }

    @Override // defpackage.s9s
    public void a(boolean z) {
        if (z) {
            this.f10168a.show();
            return;
        }
        SimpleProgressDialog simpleProgressDialog = this.f10168a;
        if (simpleProgressDialog == null || !simpleProgressDialog.isShowing()) {
            return;
        }
        this.f10168a.dismiss();
    }

    @Override // defpackage.s9s
    public void a() {
        MibiLog.d("CheckSignDeductOrderAct", "account frozen");
        Toast.makeText(this, getResources().getString(a.f10135b), 0).show();
        setResult(ErrorCodes.ACCOUNT_FROZEN, EntryResultUtils.makeResult(ErrorCodes.ACCOUNT_FROZEN, "account frozen"));
        finish();
    }
}
