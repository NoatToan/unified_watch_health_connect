package com.google.android.exoplayer2.upstream.cache;

import android.support.v4.media.session.PlaybackStateCompat;
import defpackage.rk1;
import defpackage.toe;
import defpackage.utk;
import defpackage.wlq;
import defpackage.zo5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class CacheDataSink implements zo5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cache f8412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8413b;
    public final int c;
    public com.google.android.exoplayer2.upstream.b d;
    public long e;
    public File f;
    public OutputStream g;
    public long h;
    public long i;
    public utk j;

    public static final class CacheDataSinkException extends Cache.CacheException {
        public CacheDataSinkException(IOException iOException) {
            super(iOException);
        }
    }

    public static final class a implements zo5.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Cache f8414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f8415b = 5242880;
        public int c = 20480;

        @Override // zo5.a
        public zo5 a() {
            return new CacheDataSink((Cache) rk1.e(this.f8414a), this.f8415b, this.c);
        }

        public a b(Cache cache) {
            this.f8414a = cache;
            return this;
        }
    }

    public CacheDataSink(Cache cache, long j, int i) {
        rk1.h(j > 0 || j == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j != -1 && j < PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) {
            toe.h("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.f8412a = (Cache) rk1.e(cache);
        this.f8413b = j == -1 ? Long.MAX_VALUE : j;
        this.c = i;
    }

    public final void a() throws IOException {
        OutputStream outputStream = this.g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            wlq.o(this.g);
            this.g = null;
            File file = (File) wlq.j(this.f);
            this.f = null;
            this.f8412a.g(file, this.h);
        } catch (Throwable th) {
            wlq.o(this.g);
            this.g = null;
            File file2 = (File) wlq.j(this.f);
            this.f = null;
            file2.delete();
            throw th;
        }
    }

    @Override // defpackage.zo5
    public void b(com.google.android.exoplayer2.upstream.b bVar) throws CacheDataSinkException {
        rk1.e(bVar.i);
        if (bVar.h == -1 && bVar.d(2)) {
            this.d = null;
            return;
        }
        this.d = bVar;
        this.e = bVar.d(4) ? this.f8413b : Long.MAX_VALUE;
        this.i = 0L;
        try {
            c(bVar);
        } catch (IOException e) {
            throw new CacheDataSinkException(e);
        }
    }

    public final void c(com.google.android.exoplayer2.upstream.b bVar) throws IOException {
        long j = bVar.h;
        this.f = this.f8412a.d((String) wlq.j(bVar.i), bVar.g + this.i, j != -1 ? Math.min(j - this.i, this.e) : -1L);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f);
        if (this.c > 0) {
            utk utkVar = this.j;
            if (utkVar == null) {
                this.j = new utk(fileOutputStream, this.c);
            } else {
                utkVar.a(fileOutputStream);
            }
            this.g = this.j;
        } else {
            this.g = fileOutputStream;
        }
        this.h = 0L;
    }

    @Override // defpackage.zo5
    public void close() throws CacheDataSinkException {
        if (this.d == null) {
            return;
        }
        try {
            a();
        } catch (IOException e) {
            throw new CacheDataSinkException(e);
        }
    }

    @Override // defpackage.zo5
    public void write(byte[] bArr, int i, int i2) throws CacheDataSinkException {
        com.google.android.exoplayer2.upstream.b bVar = this.d;
        if (bVar == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.h == this.e) {
                    a();
                    c(bVar);
                }
                int iMin = (int) Math.min(i2 - i3, this.e - this.h);
                ((OutputStream) wlq.j(this.g)).write(bArr, i + i3, iMin);
                i3 += iMin;
                long j = iMin;
                this.h += j;
                this.i += j;
            } catch (IOException e) {
                throw new CacheDataSinkException(e);
            }
        }
    }
}
