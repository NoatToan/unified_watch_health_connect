package com.mibi.sdk.channel.mipay;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.BaseMvpActivity;
import com.mibi.sdk.component.EntryResultUtils;
import com.mibi.sdk.mvp.IPresenter;
import com.mibi.sdk.widget.SimpleProgressDialog;

/* JADX INFO: loaded from: classes5.dex */
public class MipayChannelActivity extends BaseMvpActivity implements b, DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SimpleProgressDialog f10106a;

    private void a() {
        this.f10106a = new SimpleProgressDialog(this);
        this.f10106a.setMessage(getResources().getString(a.f10108b));
        this.f10106a.setOnCancelListener(this);
    }

    @Override // com.mibi.sdk.channel.mipay.b
    public void b(int i, String str, Throwable th) {
        MibiLog.d("MipayChannelActivity", "errorCode:" + i + ",errorDesc:" + str);
        setResult(i, EntryResultUtils.makeResult(i, str));
        finish();
    }

    @Override // com.mibi.sdk.component.BaseMvpActivity, com.mibi.sdk.mvp.MvpActivity
    public void handleCreate(Bundle bundle) {
        super.handleCreate(bundle);
        a();
    }

    @Override // com.mibi.sdk.mvp.MvpActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        MibiLog.d("MipayChannelActivity", "user progress dialog cancel");
        onBackPressed();
    }

    @Override // com.mibi.sdk.mvp.IPresenterFactory
    public IPresenter onCreatePresenter() {
        c cVar = new c(b.class);
        cVar.c(this);
        return cVar;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f10106a.dismiss();
    }

    @Override // com.mibi.sdk.component.BaseMvpActivity, com.mibi.sdk.mvp.MvpActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f10106a.show();
    }

    @Override // com.mibi.sdk.channel.mipay.b
    public void a(Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtras(bundle);
        setResult(-1, intent);
        finish();
    }
}
