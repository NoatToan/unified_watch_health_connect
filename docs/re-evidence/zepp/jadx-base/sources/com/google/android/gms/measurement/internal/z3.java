package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
final class z3 implements c4 {
    public final /* synthetic */ zzks a;

    public z3(zzks zzksVar) {
        this.a = zzksVar;
    }

    @Override // com.google.android.gms.measurement.internal.c4
    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.a.zzaz().zzp(new y3(this, str, "_err", bundle));
        } else if (this.a.l != null) {
            this.a.l.zzay().zzd().zzb("AppId not known when logging event", "_err");
        }
    }
}
