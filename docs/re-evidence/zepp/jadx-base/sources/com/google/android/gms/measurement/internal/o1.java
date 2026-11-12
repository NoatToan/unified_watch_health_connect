package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
final class o1 implements c4 {
    public final /* synthetic */ zzia a;

    public o1(zzia zziaVar) {
        this.a = zziaVar;
    }

    @Override // com.google.android.gms.measurement.internal.c4
    public final void a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.a.zzD("auto", "_err", bundle);
        } else {
            this.a.zzF("auto", "_err", bundle, str);
        }
    }
}
