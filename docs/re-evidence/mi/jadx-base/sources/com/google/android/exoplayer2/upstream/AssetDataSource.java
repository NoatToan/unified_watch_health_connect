package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import defpackage.m62;
import defpackage.rk1;
import defpackage.wlq;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class AssetDataSource extends m62 {
    public final AssetManager e;
    public Uri f;
    public InputStream g;
    public long h;
    public boolean i;

    public static final class AssetDataSourceException extends IOException {
        public AssetDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long b(b bVar) throws AssetDataSourceException {
        try {
            Uri uri = bVar.f8404a;
            this.f = uri;
            String strSubstring = (String) rk1.e(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            t(bVar);
            InputStream inputStreamOpen = this.e.open(strSubstring, 1);
            this.g = inputStreamOpen;
            if (inputStreamOpen.skip(bVar.g) < bVar.g) {
                throw new DataSourceException(0);
            }
            long j = bVar.h;
            if (j != -1) {
                this.h = j;
            } else {
                long jAvailable = this.g.available();
                this.h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.h = -1L;
                }
            }
            this.i = true;
            u(bVar);
            return this.h;
        } catch (IOException e) {
            throw new AssetDataSourceException(e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() throws AssetDataSourceException {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.g = null;
                if (this.i) {
                    this.i = false;
                    s();
                }
            } catch (IOException e) {
                throw new AssetDataSourceException(e);
            }
        } catch (Throwable th) {
            this.g = null;
            if (this.i) {
                this.i = false;
                s();
            }
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri h() {
        return this.f;
    }

    @Override // defpackage.zm5
    public int read(byte[] bArr, int i, int i2) throws AssetDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new AssetDataSourceException(e);
            }
        }
        int i3 = ((InputStream) wlq.j(this.g)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        long j2 = this.h;
        if (j2 != -1) {
            this.h = j2 - ((long) i3);
        }
        r(i3);
        return i3;
    }
}
