package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.g;
import defpackage.fxp;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f8434a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a.InterfaceC0205a f8435b = new a.InterfaceC0205a() { // from class: o67
        @Override // com.google.android.exoplayer2.upstream.a.InterfaceC0205a
        public final a a() {
            return g.r();
        }
    };

    public static /* synthetic */ g r() {
        return new g();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long b(b bVar) throws IOException {
        throw new IOException("DummyDataSource cannot be opened");
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void f(fxp fxpVar) {
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri h() {
        return null;
    }

    @Override // defpackage.zm5
    public int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
