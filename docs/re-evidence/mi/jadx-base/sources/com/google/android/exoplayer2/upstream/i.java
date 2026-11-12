package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import defpackage.dp5;
import defpackage.jdo;
import defpackage.mie;
import defpackage.rk1;
import defpackage.wlq;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class i<T> implements Loader.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f8439b;
    public final int c;
    public final jdo d;
    public final a<? extends T> e;
    public volatile T f;

    public interface a<T> {
        T a(Uri uri, InputStream inputStream) throws IOException;
    }

    public i(com.google.android.exoplayer2.upstream.a aVar, Uri uri, int i, a<? extends T> aVar2) {
        this(aVar, new b.C0206b().i(uri).b(1).a(), i, aVar2);
    }

    public long a() {
        return this.d.r();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void b() {
    }

    public Map<String, List<String>> c() {
        return this.d.t();
    }

    public final T d() {
        return this.f;
    }

    public Uri e() {
        return this.d.s();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void load() throws IOException {
        this.d.u();
        dp5 dp5Var = new dp5(this.d, this.f8439b);
        try {
            dp5Var.b();
            this.f = this.e.a((Uri) rk1.e(this.d.h()), dp5Var);
        } finally {
            wlq.o(dp5Var);
        }
    }

    public i(com.google.android.exoplayer2.upstream.a aVar, b bVar, int i, a<? extends T> aVar2) {
        this.d = new jdo(aVar);
        this.f8439b = bVar;
        this.c = i;
        this.e = aVar2;
        this.f8438a = mie.a();
    }
}
