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
import defpackage.c2s;
import defpackage.z2s;

/* JADX INFO: loaded from: classes5.dex */
public class CheckDeductOrderActivity extends BaseMvpActivity implements z2s, DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SimpleProgressDialog f10167a;

    private void b() {
        this.f10167a = new SimpleProgressDialog(this);
        this.f10167a.setMessage(getResources().getString(a.p));
        this.f10167a.setOnCancelListener(this);
    }

    @Override // defpackage.z2s
    public void a(int i, String str) {
        MibiLog.d("CheckDeductOrderAct", "return result code : " + i + " ; msg : " + str);
        Intent intent = new Intent();
        intent.putExtra("message", str);
        setResult(i, intent);
        a(false);
        finish();
    }

    @Override // defpackage.z2s
    public void g(Bundle bundle) {
        MibiLog.d("CheckDeductOrderAct", "goDeduct");
        Intent intent = new Intent(this, (Class<?>) DeductActivity.class);
        intent.putExtras(bundle);
        startActivityForResult(intent, 120);
        a(false);
    }

    @Override // com.mibi.sdk.component.BaseMvpActivity, com.mibi.sdk.mvp.MvpActivity
    public void handleCreate(Bundle bundle) {
        super.handleCreate(bundle);
        b();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        MibiLog.d("CheckDeductOrderAct", "dialog cancel");
        a(ErrorCodes.USER_CANCEL_CHECK_DEDUCT_ORDER, getBaseContext().getResources().getString(a.c));
        finish();
    }

    @Override // com.mibi.sdk.mvp.IPresenterFactory
    public IPresenter onCreatePresenter() {
        return new c2s();
    }

    @Override // defpackage.z2s
    public void a(boolean z) {
        if (z) {
            this.f10167a.show();
            return;
        }
        SimpleProgressDialog simpleProgressDialog = this.f10167a;
        if (simpleProgressDialog == null || !simpleProgressDialog.isShowing()) {
            return;
        }
        this.f10167a.dismiss();
    }

    @Override // defpackage.z2s
    public void a() {
        MibiLog.d("CheckDeductOrderAct", "account frozen");
        Toast.makeText(this, getResources().getString(a.f10135b), 0).show();
        setResult(ErrorCodes.ACCOUNT_FROZEN, EntryResultUtils.makeResult(ErrorCodes.ACCOUNT_FROZEN, "account frozen"));
        finish();
    }
}
