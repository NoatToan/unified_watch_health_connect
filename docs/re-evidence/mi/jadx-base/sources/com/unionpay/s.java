package com.unionpay;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes6.dex */
final class s implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UPPayWapActivity f10783a;

    public s(UPPayWapActivity uPPayWapActivity) {
        this.f10783a = uPPayWapActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10783a.d.dismiss();
    }
}
