package com.android.billingclient.api;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class zzap {
    private String a;

    private zzap() {
    }

    public /* synthetic */ zzap(n nVar) {
    }

    public final zzap zza(String str) {
        this.a = str;
        return this;
    }

    public final zzaq zzb() {
        if (TextUtils.isEmpty(this.a)) {
            throw new IllegalArgumentException("SKU must be set.");
        }
        return new zzaq(this.a, null, null);
    }
}
