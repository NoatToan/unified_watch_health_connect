package com.huawei.hms.iapfull.pay;

import android.content.DialogInterface;
import com.huawei.hms.iapfull.y0;

/* JADX INFO: loaded from: classes10.dex */
class a implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ PayActivity f13731a;

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        y0.b("PayActivity", "user click continue");
        this.f13731a.c();
    }

    a(PayActivity payActivity) {
        this.f13731a = payActivity;
    }
}
