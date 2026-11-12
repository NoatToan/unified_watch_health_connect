package com.unionpay;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
final class j implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UPPayWapActivity f10774a;

    public j(UPPayWapActivity uPPayWapActivity) {
        this.f10774a = uPPayWapActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f10774a.finish();
    }
}
