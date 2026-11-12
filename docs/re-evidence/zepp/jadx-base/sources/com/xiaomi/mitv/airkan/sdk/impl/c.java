package com.xiaomi.mitv.airkan.sdk.impl;

import android.os.Handler;
import com.xiaomi.mitv.airkan.sdk.MiAirKan;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes22.dex */
final class c implements MiAirKan {
    private static final String h = "http://%s:6095/request?action=isAlive&t=%d";
    private String c;
    private MiAirKan.Callback f;
    private Executor a = Executors.newCachedThreadPool();
    private Handler b = new Handler();
    private MiAirKan.Callback g = new e(this);
    private a d = new a(this.a, this.g);
    private k e = new k(this.a, this.g);

    private void b(MiAirKan.Callback callback) {
        this.a.execute(new d(this, callback));
    }

    @Override // com.xiaomi.mitv.airkan.sdk.MiAirKan
    public final void close() {
        this.b.removeCallbacksAndMessages(null);
        this.c = null;
    }

    @Override // com.xiaomi.mitv.airkan.sdk.MiAirKan
    public final void connect(MiAirKan.Callback callback) {
        this.a.execute(new d(this, callback));
    }

    @Override // com.xiaomi.mitv.airkan.sdk.MiAirKan
    public final MiAirKan.Key key() {
        return this.d;
    }

    @Override // com.xiaomi.mitv.airkan.sdk.MiAirKan
    public final void setCallback(MiAirKan.Callback callback) {
        this.f = callback;
    }

    @Override // com.xiaomi.mitv.airkan.sdk.MiAirKan
    public final void setIp(String str) {
        this.c = str;
        this.d.c(str);
        this.e.g(str);
    }

    @Override // com.xiaomi.mitv.airkan.sdk.MiAirKan
    public final MiAirKan.Voice voice() {
        return this.e;
    }
}
