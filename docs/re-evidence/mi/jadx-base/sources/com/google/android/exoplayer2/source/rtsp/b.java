package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import com.google.android.exoplayer2.upstream.Loader;
import defpackage.f0l;
import defpackage.kl8;
import defpackage.r4i;
import defpackage.rk1;
import defpackage.uzk;
import defpackage.wlq;
import defpackage.xu5;
import defpackage.zm5;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Loader.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0l f8215b;
    public final a c;
    public final kl8 d;
    public final com.google.android.exoplayer2.source.rtsp.a.InterfaceC0196a f;
    public uzk g;
    public volatile boolean h;
    public volatile long j;
    public final Handler e = wlq.x();
    public volatile long i = -9223372036854775807L;

    public interface a {
        void a(String str, com.google.android.exoplayer2.source.rtsp.a aVar);
    }

    public b(int i, f0l f0lVar, a aVar, kl8 kl8Var, com.google.android.exoplayer2.source.rtsp.a.InterfaceC0196a interfaceC0196a) {
        this.f8214a = i;
        this.f8215b = f0lVar;
        this.c = aVar;
        this.d = kl8Var;
        this.f = interfaceC0196a;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void b() {
        this.h = true;
    }

    public final /* synthetic */ void c(String str, com.google.android.exoplayer2.source.rtsp.a aVar) {
        this.c.a(str, aVar);
    }

    public void d() {
        ((uzk) rk1.e(this.g)).e();
    }

    public void e(long j, long j2) {
        this.i = j;
        this.j = j2;
    }

    public void f(int i) {
        if (((uzk) rk1.e(this.g)).d()) {
            return;
        }
        this.g.h(i);
    }

    public void g(long j) {
        if (j == -9223372036854775807L || ((uzk) rk1.e(this.g)).d()) {
            return;
        }
        this.g.i(j);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void load() throws IOException {
        final com.google.android.exoplayer2.source.rtsp.a aVarA = null;
        try {
            aVarA = this.f.a(this.f8214a);
            final String strJ = aVarA.j();
            this.e.post(new Runnable() { // from class: tzk
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35220a.c(strJ, aVarA);
                }
            });
            xu5 xu5Var = new xu5((zm5) rk1.e(aVarA), 0L, -1L);
            uzk uzkVar = new uzk(this.f8215b.f17264a, this.f8214a);
            this.g = uzkVar;
            uzkVar.b(this.d);
            while (!this.h) {
                if (this.i != -9223372036854775807L) {
                    this.g.a(this.j, this.i);
                    this.i = -9223372036854775807L;
                }
                this.g.f(xu5Var, new r4i());
            }
        } finally {
            wlq.n(aVarA);
        }
    }
}
