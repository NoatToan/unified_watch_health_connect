package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* JADX INFO: loaded from: classes3.dex */
final class y0 extends zabm {
    private final /* synthetic */ Dialog a;
    private final /* synthetic */ z0 b;

    public y0(z0 z0Var, Dialog dialog) {
        this.b = z0Var;
        this.a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.zabm
    public final void zaa() {
        this.b.b.zab();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
