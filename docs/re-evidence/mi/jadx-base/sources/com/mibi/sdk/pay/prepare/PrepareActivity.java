package com.mibi.sdk.pay.prepare;

import android.R;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.mi.fitness.netproxy.NetProxyComponentKt;
import com.mibi.sdk.basic.auth.PaymentCheckPasswordActivity;
import com.mibi.sdk.basic.sms.PaymentVerifySMSCodeActivity;
import com.mibi.sdk.common.Client;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.exception.QueryPaymentException;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.BaseMvpActivity;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.EntryResultUtils;
import com.mibi.sdk.component.ErrorCodes;
import com.mibi.sdk.component.recharge.RechargeType;
import com.mibi.sdk.mvp.IPresenter;
import com.mibi.sdk.pay.task.RxAccountGetRechargeTypeTask;
import com.mibi.sdk.pay.task.RxStartAccountPaymentTask;
import com.mibi.sdk.widget.AlertDialog;
import com.mibi.sdk.widget.SimpleProgressDialog;
import defpackage.b3s;
import defpackage.qes;
import defpackage.u9s;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class PrepareActivity extends BaseMvpActivity implements u9s, DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SimpleProgressDialog f10198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10199b = false;

    public class a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f10200a;

        public a(String str) {
            this.f10200a = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            PrepareActivity.this.f10199b = false;
            PrepareActivity.this.c();
            dialogInterface.dismiss();
            String accountBaseUrl = CommonConstants.getAccountBaseUrl("/upgradeUser");
            if (!TextUtils.isEmpty(this.f10200a)) {
                accountBaseUrl = this.f10200a;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(accountBaseUrl));
            intent.addFlags(67108864);
            intent.addFlags(NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY);
            PrepareActivity.this.startActivity(intent);
            PrepareActivity.this.finish();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            PrepareActivity.this.f10199b = false;
            PrepareActivity.this.c();
            dialogInterface.dismiss();
            PrepareActivity.this.finish();
        }
    }

    private void b() {
        this.f10198a = new SimpleProgressDialog(this);
        this.f10198a.setMessage(getResources().getString(com.mibi.sdk.pay.a.f10195b));
        this.f10198a.setOnCancelListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        setResult(ErrorCodes.NEED_BIND_PHONE, EntryResultUtils.makeResult(ErrorCodes.NEED_BIND_PHONE, "user need bind phone"));
    }

    @Override // defpackage.u9s
    public void a() {
        this.f10198a.setMessage(getResources().getString(com.mibi.sdk.pay.a.g));
    }

    @Override // defpackage.u9s
    public void h(int i, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append("handleError arguments is null ? ");
        sb.append(bundle == null);
        MibiLog.d("PrepareActivity", sb.toString());
        if (bundle != null) {
            Intent intent = new Intent();
            intent.putExtras(bundle);
            setResult(i, intent);
        } else {
            setResult(i);
        }
        finish();
    }

    @Override // com.mibi.sdk.component.BaseMvpActivity, com.mibi.sdk.mvp.MvpActivity
    public void handleCreate(Bundle bundle) {
        super.handleCreate(bundle);
        b();
    }

    @Override // defpackage.u9s
    public void i(RxStartAccountPaymentTask.Result result, RxAccountGetRechargeTypeTask.Result result2) {
        MibiLog.d("PrepareActivity", "go to account ui");
        Intent intent = new Intent("com.mibi.sdk.action.ORDER_UI");
        intent.setPackage(getPackageName());
        intent.putExtra(CommonConstants.KEY_PROCESS_ID, ((b3s) getPresenter()).a());
        intent.putExtra(Constants.KEY_PAY_TYPE_RESULT, result);
        intent.putExtra(Constants.KEY_RECHARGE_TYPE_RESULT, result2);
        startActivityForResult(intent, 203);
    }

    @Override // defpackage.u9s
    public void n(Intent intent) {
        MibiLog.d("PrepareActivity", "onChannelAcquired");
        intent.setPackage(Client.getAppInfo().getPackage());
        startActivityForResult(intent, 100);
    }

    @Override // com.mibi.sdk.model.auth.OnCheckAuthErrorListener
    public void onAccountFrozen() {
        MibiLog.d("PrepareActivity", "account frozen");
        Toast.makeText(this, getResources().getString(com.mibi.sdk.pay.a.c), 0).show();
        setResult(ErrorCodes.ACCOUNT_FROZEN, EntryResultUtils.makeResult(ErrorCodes.ACCOUNT_FROZEN, "account frozen"));
        finish();
    }

    @Override // com.mibi.sdk.model.auth.OnCheckAuthErrorListener
    public void onBindPhoneCheck(Bundle bundle) {
        MibiLog.d("PrepareActivity", "onBindPhoneCheck");
        this.f10198a.dismiss();
        String string = bundle == null ? null : bundle.getString("bindPhoneUrl");
        AlertDialog alertDialogCreate = new AlertDialog.Builder(this).setTitle(getResources().getString(com.mibi.sdk.pay.a.i)).setMessage(getResources().getString(com.mibi.sdk.pay.a.h)).setClickable(true).setNegativeButton(R.string.cancel, new b()).setPositiveButton(com.mibi.sdk.pay.a.f10194a, new a(string)).create();
        alertDialogCreate.setCancelable(false);
        alertDialogCreate.show();
        this.f10199b = true;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        MibiLog.d("PrepareActivity", "user progress dialog cancel");
        onBackPressed();
    }

    @Override // com.mibi.sdk.mvp.IPresenterFactory
    public IPresenter onCreatePresenter() {
        return new qes();
    }

    @Override // com.mibi.sdk.model.auth.OnCheckAuthErrorListener
    public void onPasswordCheck() {
        Intent intent = new Intent(this, (Class<?>) PaymentCheckPasswordActivity.class);
        intent.putExtra(CommonConstants.KEY_PROCESS_ID, ((b3s) getPresenter()).a());
        startActivityForResult(intent, 201);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f10198a.dismiss();
    }

    @Override // com.mibi.sdk.component.BaseMvpActivity, com.mibi.sdk.mvp.MvpActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f10199b) {
            return;
        }
        this.f10198a.show();
    }

    @Override // com.mibi.sdk.model.auth.OnCheckAuthErrorListener
    public void onSMSCodeCheck(Bundle bundle) {
        Intent intent = new Intent(this, (Class<?>) PaymentVerifySMSCodeActivity.class);
        intent.putExtra(CommonConstants.KEY_PROCESS_ID, ((b3s) getPresenter()).a());
        intent.putExtras(bundle);
        startActivityForResult(intent, 202);
    }

    @Override // defpackage.u9s
    public void a(ArrayList<RechargeType> arrayList) {
        MibiLog.d("PrepareActivity", "goToNaUi");
        Intent intent = new Intent("com.mibi.sdk.action.PAYTYPES");
        intent.setPackage(getPackageName());
        intent.putExtra(Constants.KEY_RECHARGE_TYPES, arrayList);
        startActivityForResult(intent, 204);
    }

    @Override // defpackage.u9s
    public void b(int i, String str, Throwable th) {
        MibiLog.d("PrepareActivity", "handle error code : " + i + " ; desc : " + str);
        setResult(i, EntryResultUtils.makeResult(i, str, th instanceof QueryPaymentException ? ((QueryPaymentException) th).getArguments() : null));
        finish();
    }

    @Override // defpackage.u9s
    public void a(Bundle bundle) {
        MibiLog.d("PrepareActivity", "success");
        setResult(-1, EntryResultUtils.makeResult(-1, "success", bundle));
        finish();
    }
}
