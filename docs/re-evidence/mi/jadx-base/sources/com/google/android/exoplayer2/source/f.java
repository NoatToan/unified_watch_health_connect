package com.google.android.exoplayer2.source;

import android.net.Uri;
import defpackage.fxp;
import defpackage.okh;
import defpackage.rk1;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements com.google.android.exoplayer2.upstream.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a f8131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8132b;
    public final a c;
    public final byte[] d;
    public int e;

    public interface a {
        void a(okh okhVar);
    }

    public f(com.google.android.exoplayer2.upstream.a aVar, int i, a aVar2) {
        rk1.a(i > 0);
        this.f8131a = aVar;
        this.f8132b = i;
        this.c = aVar2;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long b(com.google.android.exoplayer2.upstream.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Map<String, List<String>> d() {
        return this.f8131a.d();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void f(fxp fxpVar) {
        rk1.e(fxpVar);
        this.f8131a.f(fxpVar);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri h() {
        return this.f8131a.h();
    }

    public final boolean r() throws IOException {
        if (this.f8131a.read(this.d, 0, 1) == -1) {
            return false;
        }
        int i = (this.d[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int i4 = this.f8131a.read(bArr, i3, i2);
            if (i4 == -1) {
                return false;
            }
            i3 += i4;
            i2 -= i4;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.c.a(new okh(bArr, i));
        }
        return true;
    }

    @Override // defpackage.zm5
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.e == 0) {
            if (!r()) {
                return -1;
            }
            this.e = this.f8132b;
        }
        int i3 = this.f8131a.read(bArr, i, Math.min(this.e, i2));
        if (i3 != -1) {
            this.e -= i3;
        }
        return i3;
    }
}
