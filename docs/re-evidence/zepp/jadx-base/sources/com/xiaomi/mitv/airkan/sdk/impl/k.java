package com.xiaomi.mitv.airkan.sdk.impl;

import android.text.TextUtils;
import com.xiaomi.mitv.airkan.sdk.MiAirKan;
import com.xiaomi.mitv.airkan.sdk.util.JSONBuilder;
import com.xiaomi.mitv.airkan.sdk.util.Logger;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes22.dex */
final class k implements MiAirKan.Voice {
    private static final int f = 6093;
    private com.xiaomi.mitv.airkan.sdk.a.a a;
    private String b;
    private Executor c;
    private final Integer d = 0;
    private MiAirKan.Callback e;

    public k(Executor executor, MiAirKan.Callback callback) {
        this.c = executor;
        this.e = callback;
    }

    private void a() {
        synchronized (this.d) {
            com.xiaomi.mitv.airkan.sdk.a.a aVar = this.a;
            if (aVar != null) {
                long jA = aVar.a(i.e());
                this.a.b();
                b(jA, this.e);
            }
        }
    }

    private static void b(long j, MiAirKan.Callback callback) {
        if (callback == null) {
            return;
        }
        if (j > 0) {
            callback.onResult(1, 0, "");
        } else {
            callback.onResult(1, 15, new JSONBuilder().put("code", j).toString());
        }
    }

    private void c(MiAirKan.Callback callback) {
        synchronized (this.d) {
            if (TextUtils.isEmpty(this.b)) {
                Logger.d("empty ip", new Object[0]);
                callback.onResult(1, 11, "empty ip");
                return;
            }
            com.xiaomi.mitv.airkan.sdk.a.a aVar = this.a;
            if (aVar != null && aVar.c()) {
                Logger.d("has activated tcp client,is equal( %s == %s => %s)", this.a.d(), this.b, Boolean.valueOf(this.a.d().equals(this.b)));
                this.a.b();
            }
            com.xiaomi.mitv.airkan.sdk.a.a aVar2 = new com.xiaomi.mitv.airkan.sdk.a.a(this.b, f);
            this.a = aVar2;
            int iA = aVar2.a();
            if (iA == 0) {
                Logger.d("connect success", new Object[0]);
                b(this.a.a(i.a(), i.c(), i.d()), callback);
            } else {
                Logger.d("connect failed :%d", Integer.valueOf(iA));
                if (callback != null) {
                    callback.onResult(1, 17, "");
                }
            }
        }
    }

    public static /* synthetic */ void d(k kVar) {
        synchronized (kVar.d) {
            com.xiaomi.mitv.airkan.sdk.a.a aVar = kVar.a;
            if (aVar != null) {
                long jA = aVar.a(i.e());
                kVar.a.b();
                b(jA, kVar.e);
            }
        }
    }

    public static /* synthetic */ void e(k kVar, MiAirKan.Callback callback) {
        synchronized (kVar.d) {
            if (TextUtils.isEmpty(kVar.b)) {
                Logger.d("empty ip", new Object[0]);
                callback.onResult(1, 11, "empty ip");
                return;
            }
            com.xiaomi.mitv.airkan.sdk.a.a aVar = kVar.a;
            if (aVar != null && aVar.c()) {
                Logger.d("has activated tcp client,is equal( %s == %s => %s)", kVar.a.d(), kVar.b, Boolean.valueOf(kVar.a.d().equals(kVar.b)));
                kVar.a.b();
            }
            com.xiaomi.mitv.airkan.sdk.a.a aVar2 = new com.xiaomi.mitv.airkan.sdk.a.a(kVar.b, f);
            kVar.a = aVar2;
            int iA = aVar2.a();
            if (iA == 0) {
                Logger.d("connect success", new Object[0]);
                b(kVar.a.a(i.a(), i.c(), i.d()), callback);
            } else {
                Logger.d("connect failed :%d", Integer.valueOf(iA));
                if (callback != null) {
                    callback.onResult(1, 17, "");
                }
            }
        }
    }

    public static /* synthetic */ void f(k kVar, byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        synchronized (kVar.d) {
            com.xiaomi.mitv.airkan.sdk.a.a aVar = kVar.a;
            if (aVar != null) {
                b(aVar.a(i.b(bArr)), kVar.e);
            }
        }
    }

    private void h(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        synchronized (this.d) {
            com.xiaomi.mitv.airkan.sdk.a.a aVar = this.a;
            if (aVar != null) {
                b(aVar.a(i.b(bArr)), this.e);
            }
        }
    }

    public final void g(String str) {
        this.b = str;
    }

    @Override // com.xiaomi.mitv.airkan.sdk.MiAirKan.Voice
    public final void send(byte[] bArr) {
        this.c.execute(new m(this, bArr));
    }

    @Override // com.xiaomi.mitv.airkan.sdk.MiAirKan.Voice
    public final void start(MiAirKan.Callback callback) {
        this.c.execute(new l(this, callback));
    }

    @Override // com.xiaomi.mitv.airkan.sdk.MiAirKan.Voice
    public final void stop() {
        this.c.execute(new n(this));
    }
}
