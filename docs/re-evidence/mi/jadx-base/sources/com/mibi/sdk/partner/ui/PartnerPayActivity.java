package com.mibi.sdk.partner.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.mibi.sdk.common.Client;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.BaseMvpActivity;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.EntryResultUtils;
import com.mibi.sdk.component.recharge.Recharge;
import com.mibi.sdk.mvp.IPresenter;
import com.mibi.sdk.partner.a;
import com.mibi.sdk.partner.task.RxCheckPartnerPayOrderTask;
import com.mibi.sdk.partner.task.RxGetPartnerRechargeTypeTask;
import com.mibi.sdk.widget.SimpleProgressDialog;
import defpackage.i9s;
import defpackage.j2s;
import defpackage.l2s;

/* JADX INFO: loaded from: classes5.dex */
public class PartnerPayActivity extends BaseMvpActivity implements i9s, DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SimpleProgressDialog f10187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10188b;

    @Override // defpackage.i9s
    public void a(boolean z) {
        MibiLog.d("PartnerPayEntryAct", "show progress : " + z);
        if (!z) {
            if (this.f10187a.isShowing()) {
                this.f10187a.dismiss();
            }
        } else {
            if (this.f10187a.isShowing()) {
                return;
            }
            this.f10187a.setMessage(getString(a.f10183b));
            this.f10187a.show();
        }
    }

    public final void b() {
        SimpleProgressDialog simpleProgressDialog = new SimpleProgressDialog(this);
        this.f10187a = simpleProgressDialog;
        simpleProgressDialog.setOnCancelListener(this);
    }

    @Override // defpackage.i9s
    public void c(int i, String str, Bundle bundle) {
        MibiLog.d("PartnerPayEntryAct", "return code : " + i + " ; msg : " + str);
        setResult(i, EntryResultUtils.makeResultWithOriginalArgs(i, str, bundle));
        finish();
    }

    @Override // com.mibi.sdk.component.BaseMvpActivity, com.mibi.sdk.mvp.MvpActivity
    public void handleCreate(Bundle bundle) {
        super.handleCreate(bundle);
        if (bundle != null) {
            this.f10188b = bundle.getBoolean("needShowDialog", true);
        }
        b();
    }

    @Override // defpackage.i9s
    public void k(Recharge recharge) {
        MibiLog.d("PartnerPayEntryAct", "do channel pay : " + recharge.getChannel());
        Intent entryIntent = recharge.getEntryIntent(true);
        entryIntent.putExtra(CommonConstants.KEY_PROCESS_ID, ((j2s) getPresenter()).a());
        entryIntent.setPackage(Client.getAppInfo().getPackage());
        startActivityForResult(entryIntent, 17);
    }

    @Override // defpackage.i9s
    public void m(RxCheckPartnerPayOrderTask.Result result, RxGetPartnerRechargeTypeTask.Result result2) {
        MibiLog.d("PartnerPayEntryAct", "go to ui");
        Intent intent = new Intent("com.mibi.sdk.action.PARTNER_ORDER_UI");
        intent.setPackage(getPackageName());
        intent.putExtra(CommonConstants.KEY_PROCESS_ID, ((j2s) getPresenter()).a());
        intent.putExtra(Constants.KEY_PAY_TYPE_RESULT, result);
        intent.putExtra(Constants.KEY_RECHARGE_TYPE_RESULT, result2);
        startActivityForResult(intent, 16);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        MibiLog.d("PartnerPayEntryAct", "process dialog cancel");
        onBackPressed();
    }

    @Override // com.mibi.sdk.mvp.IPresenterFactory
    public IPresenter onCreatePresenter() {
        return new l2s();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f10188b = this.f10187a.isShowing();
        a(false);
    }

    @Override // com.mibi.sdk.component.BaseMvpActivity, com.mibi.sdk.mvp.MvpActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f10188b) {
            this.f10187a.show();
        }
    }

    @Override // com.mibi.sdk.component.BaseMvpActivity, com.mibi.sdk.mvp.MvpActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("needShowDialog", this.f10188b);
    }

    @Override // defpackage.i9s
    public void a() {
        this.f10187a.setMessage(getString(a.c));
        this.f10187a.show();
    }

    @Override // defpackage.i9s
    public void a(Bundle bundle) {
        MibiLog.d("PartnerPayEntryAct", "handle Success");
        setResult(-1, EntryResultUtils.makeResult(-1, "success", bundle));
        finish();
    }
}
