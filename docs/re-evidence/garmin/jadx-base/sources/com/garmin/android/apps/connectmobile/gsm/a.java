package com.garmin.android.apps.connectmobile.gsm;

import android.content.DialogInterface;
import t10.n;

/* JADX INFO: loaded from: classes8.dex */
public class a implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GSMRedirectActivity.r f36504a;

    public a(GSMRedirectActivity.r rVar) {
        this.f36504a = rVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        this.f36504a.e(n.CREATE, null);
    }
}
