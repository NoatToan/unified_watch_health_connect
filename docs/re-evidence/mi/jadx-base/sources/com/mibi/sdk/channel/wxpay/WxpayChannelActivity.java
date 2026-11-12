package com.mibi.sdk.channel.wxpay;

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
public class WxpayChannelActivity extends BaseMvpActivity implements b, DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SimpleProgressDialog f10119a;

    private void b() {
        this.f10119a = new SimpleProgressDialog(this);
        this.f10119a.setMessage(getResources().getString(a.d));
        this.f10119a.setOnCancelListener(this);
    }

    @Override // com.mibi.sdk.channel.wxpay.b
    public void a() {
        setResult(-1);
        finish();
    }

    @Override // com.mibi.sdk.component.BaseMvpActivity
    public boolean handleBackPressed() {
        setResult(ErrorCodes.USER_CANCEL_WXPAY, EntryResultUtils.makeResult(ErrorCodes.USER_CANCEL_WXPAY, getBaseContext().getResources().getString(a.f10121b)));
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
        MibiLog.d("WxpayChannelActivity", "onActivityResult req : " + i + " ; res : " + i2);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        MibiLog.d("WxpayChannelActivity", "user progress dialog cancel");
        onBackPressed();
    }

    @Override // com.mibi.sdk.mvp.IPresenterFactory
    public IPresenter onCreatePresenter() {
        f fVar = new f(b.class);
        fVar.c(this);
        return fVar;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        a(false);
    }

    @Override // com.mibi.sdk.component.BaseMvpActivity, com.mibi.sdk.mvp.MvpActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.mibi.sdk.channel.wxpay.b
    public void a(boolean z) {
        if (z) {
            this.f10119a.show();
        } else {
            this.f10119a.dismiss();
        }
    }

    @Override // com.mibi.sdk.channel.wxpay.b
    public void b(int i, String str, Throwable th) {
        MibiLog.d("WxpayChannelActivity", "errorCode:" + i + ",errorDesc:" + str);
        setResult(i, EntryResultUtils.makeResult(i, str));
        finish();
    }
}
