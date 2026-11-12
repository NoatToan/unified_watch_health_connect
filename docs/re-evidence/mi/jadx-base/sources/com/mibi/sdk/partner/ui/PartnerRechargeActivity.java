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
import com.mibi.sdk.component.recharge.RechargeType;
import com.mibi.sdk.mvp.IPresenter;
import com.mibi.sdk.partner.a;
import com.mibi.sdk.widget.SimpleProgressDialog;
import defpackage.ges;
import defpackage.k9s;
import defpackage.uis;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class PartnerRechargeActivity extends BaseMvpActivity implements uis, DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SimpleProgressDialog f10190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10191b;

    @Override // defpackage.uis
    public void a(boolean z) {
        MibiLog.d("PartnerRechargeAct", "show progress : " + z);
        if (!z) {
            if (this.f10190a.isShowing()) {
                this.f10190a.dismiss();
            }
        } else {
            if (this.f10190a.isShowing()) {
                return;
            }
            this.f10190a.setMessage(getString(a.f10183b));
            this.f10190a.show();
        }
    }

    public final void b() {
        SimpleProgressDialog simpleProgressDialog = new SimpleProgressDialog(this);
        this.f10190a = simpleProgressDialog;
        simpleProgressDialog.setOnCancelListener(this);
    }

    @Override // defpackage.uis
    public void c(int i, String str, Bundle bundle) {
        MibiLog.d("PartnerRechargeAct", "return code : " + i + " ; msg : " + str);
        setResult(i, EntryResultUtils.makeResultWithOriginalArgs(i, str, bundle));
        finish();
    }

    @Override // com.mibi.sdk.component.BaseMvpActivity, com.mibi.sdk.mvp.MvpActivity
    public void handleCreate(Bundle bundle) {
        super.handleCreate(bundle);
        if (bundle != null) {
            this.f10191b = bundle.getBoolean("needShowDialog", true);
        }
        b();
    }

    @Override // defpackage.uis
    public void j(Recharge recharge) {
        MibiLog.d("PartnerRechargeAct", "do channel pay : " + recharge.getChannel());
        Intent entryIntent = recharge.getEntryIntent(true);
        entryIntent.putExtra(CommonConstants.KEY_PROCESS_ID, ((ges) getPresenter()).a());
        entryIntent.setPackage(Client.getAppInfo().getPackage());
        startActivityForResult(entryIntent, 50);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        MibiLog.d("PartnerRechargeAct", "process dialog cancel");
        onBackPressed();
    }

    @Override // com.mibi.sdk.mvp.IPresenterFactory
    public IPresenter onCreatePresenter() {
        return new k9s();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f10191b = this.f10190a.isShowing();
        a(false);
    }

    @Override // com.mibi.sdk.component.BaseMvpActivity, com.mibi.sdk.mvp.MvpActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f10191b) {
            this.f10190a.show();
        }
    }

    @Override // com.mibi.sdk.component.BaseMvpActivity, com.mibi.sdk.mvp.MvpActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("needShowDialog", this.f10191b);
    }

    @Override // defpackage.uis
    public void a() {
        this.f10190a.setMessage(getString(a.c));
        this.f10190a.show();
    }

    @Override // defpackage.uis
    public void a(Bundle bundle) {
        MibiLog.d("PartnerRechargeAct", "handle Success");
        setResult(-1, EntryResultUtils.makeResult(-1, "success", bundle));
        finish();
    }

    @Override // defpackage.uis
    public void a(ArrayList<RechargeType> arrayList) {
        MibiLog.d("PartnerRechargeAct", "go to select channel");
        Intent intent = new Intent("com.mibi.sdk.action.PAYTYPES");
        intent.setPackage(getPackageName());
        intent.putExtra(Constants.KEY_RECHARGE_TYPES, arrayList);
        startActivityForResult(intent, 51);
    }
}
