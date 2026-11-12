package com.unionpay;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
final class q implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UPPayWapActivity f10781a;

    public q(UPPayWapActivity uPPayWapActivity) {
        this.f10781a = uPPayWapActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UPPayWapActivity.d(this.f10781a);
    }
}
