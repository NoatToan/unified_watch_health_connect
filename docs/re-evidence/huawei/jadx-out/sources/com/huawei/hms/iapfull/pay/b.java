package com.huawei.hms.iapfull.pay;

import android.content.DialogInterface;
import android.content.Intent;
import com.huawei.hms.iapfull.y0;

/* JADX INFO: loaded from: classes10.dex */
class b implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ PayActivity f13732a;

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        y0.b("PayActivity", "user click cancel");
        this.f13732a.m.setErrMsg("Device has been rooted, payment cancelled by user");
        this.f13732a.m.setReturnCode(30000);
        Intent intent = new Intent();
        intent.putExtras(this.f13732a.m.toBundle());
        this.f13732a.setResult(-1, intent);
        this.f13732a.finish();
    }

    b(PayActivity payActivity) {
        this.f13732a = payActivity;
    }
}
