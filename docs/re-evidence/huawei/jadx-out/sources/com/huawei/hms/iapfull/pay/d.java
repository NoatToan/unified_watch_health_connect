package com.huawei.hms.iapfull.pay;

import android.content.DialogInterface;
import android.content.Intent;
import com.huawei.hms.iapfull.y0;

/* JADX INFO: loaded from: classes10.dex */
class d implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ PayActivity f13734a;

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        y0.b("PayActivity", "cancel by user");
        this.f13734a.m.setErrMsg("payment cancelled by user");
        this.f13734a.m.setReturnCode(30000);
        Intent intent = new Intent();
        intent.putExtras(this.f13734a.m.toBundle());
        this.f13734a.setResult(-1, intent);
        this.f13734a.finish();
    }

    d(PayActivity payActivity) {
        this.f13734a = payActivity;
    }
}
