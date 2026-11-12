package com.mibi.sdk.channel.alipay;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.BaseMvpActivity;
import com.mibi.sdk.component.EntryResultUtils;
import com.mibi.sdk.component.ErrorCodes;
import com.mibi.sdk.mvp.IPresenter;
import com.mibi.sdk.widget.SimpleProgressDialog;

/* JADX INFO: loaded from: classes5.dex */
public class AlipayChannelActivity extends BaseMvpActivity implements e, DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SimpleProgressDialog f10094a;

    private void b() {
        this.f10094a = new SimpleProgressDialog(this);
        this.f10094a.setMessage(getResources().getString(a.f10097b));
        this.f10094a.setOnCancelListener(this);
    }

    @Override // com.mibi.sdk.channel.alipay.e
    public void a() {
        setResult(-1);
        finish();
    }

    @Override // com.mibi.sdk.component.BaseMvpActivity
    public boolean handleBackPressed() {
        setResult(ErrorCodes.USER_CANCEL_ALIPAY, EntryResultUtils.makeResult(ErrorCodes.USER_CANCEL_ALIPAY, getBaseContext().getResources().getString(a.c)));
        return true;
    }

    @Override // com.mibi.sdk.component.BaseMvpActivity, com.mibi.sdk.mvp.MvpActivity
    public void handleCreate(Bundle bundle) {
        super.handleCreate(bundle);
        b();
    }

    @Override // com.mibi.sdk.mvp.MvpActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        MibiLog.d("AlipayChannelActivity", "user progress dialog cancel");
        onBackPressed();
    }

    @Override // com.mibi.sdk.mvp.IPresenterFactory
    public IPresenter onCreatePresenter() {
        c cVar = new c(e.class);
        cVar.c(this);
        return cVar;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f10094a.dismiss();
    }

    @Override // com.mibi.sdk.component.BaseMvpActivity, com.mibi.sdk.mvp.MvpActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f10094a.show();
    }

    @Override // com.mibi.sdk.channel.alipay.e
    public void b(int i, String str, Throwable th) {
        MibiLog.d("AlipayChannelActivity", "errorCode:" + i + ",errorDesc:" + str);
        setResult(i, EntryResultUtils.makeResult(i, str));
        finish();
    }
}
