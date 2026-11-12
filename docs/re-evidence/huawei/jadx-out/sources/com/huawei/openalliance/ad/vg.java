package com.huawei.openalliance.ad;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes12.dex */
public class vg implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.huawei.openalliance.ad.views.interfaces.k f20714a;

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        this.f20714a.n();
    }

    public vg(com.huawei.openalliance.ad.views.interfaces.k kVar) {
        this.f20714a = kVar;
    }
}
