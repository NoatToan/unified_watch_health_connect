package com.garmin.android.apps.connectmobile.gsm;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes8.dex */
public class b implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GSMRedirectActivity.r f36505a;

    public b(GSMRedirectActivity.r rVar) {
        this.f36505a = rVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        GSMRedirectActivity.this.finish();
    }
}
