package com.xiaomi.mitv.airkan.sdk.impl;

import com.xiaomi.mitv.airkan.sdk.MiAirKan;
import com.xiaomi.mitv.airkan.sdk.util.Logger;

/* JADX INFO: loaded from: classes22.dex */
final class e implements MiAirKan.Callback {
    public final /* synthetic */ c a;

    public e(c cVar) {
        this.a = cVar;
    }

    @Override // com.xiaomi.mitv.airkan.sdk.MiAirKan.Callback
    public final void onResult(int i, int i2, String str) {
        Logger.d("onResult code : %d,message : %s", Integer.valueOf(i2), str);
        if (this.a.f == null) {
            return;
        }
        this.a.b.post(new f(this, i, i2, str));
    }
}
