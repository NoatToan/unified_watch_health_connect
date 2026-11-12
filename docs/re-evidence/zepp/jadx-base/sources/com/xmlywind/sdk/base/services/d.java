package com.xmlywind.sdk.base.services;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes22.dex */
public class d implements j.a {
    public c a;
    public k b = k.STOP;

    public d() {
        if (this.a == null) {
            this.a = new c();
        }
    }

    public void a(Context context) {
        context.registerReceiver(this.a, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
    }

    public void b(Context context) {
        context.unregisterReceiver(this.a);
    }

    @Override // com.xmlywind.sdk.base.services.j.a
    public boolean b() {
        a(com.xmlywind.sdk.common.a.n().af());
        this.b = k.RUNNING;
        return false;
    }

    @Override // com.xmlywind.sdk.base.services.j.a
    public void c() {
        b(com.xmlywind.sdk.common.a.n().af());
        this.b = k.STOP;
    }
}
