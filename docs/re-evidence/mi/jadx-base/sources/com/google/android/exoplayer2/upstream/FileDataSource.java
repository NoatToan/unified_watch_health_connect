package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.text.TextUtils;
import defpackage.fxp;
import defpackage.m62;
import defpackage.rk1;
import defpackage.wlq;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes4.dex */
public final class FileDataSource extends m62 {
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean h;

    public static class FileDataSourceException extends IOException {
        public FileDataSourceException(IOException iOException) {
            super(iOException);
        }

        public FileDataSourceException(String str, IOException iOException) {
            super(str, iOException);
        }
    }

    public static final class a implements com.google.android.exoplayer2.upstream.a.InterfaceC0205a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public fxp f8391a;

        @Override // com.google.android.exoplayer2.upstream.a.InterfaceC0205a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FileDataSource a() {
            FileDataSource fileDataSource = new FileDataSource();
            fxp fxpVar = this.f8391a;
            if (fxpVar != null) {
                fileDataSource.f(fxpVar);
            }
            return fileDataSource;
        }
    }

    public FileDataSource() {
        super(false);
    }

    public static RandomAccessFile v(Uri uri) throws FileDataSourceException {
        try {
            return new RandomAccessFile((String) rk1.e(uri.getPath()), "r");
        } catch (FileNotFoundException e) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e);
            }
            throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long b(b bVar) throws FileDataSourceException {
        try {
            Uri uri = bVar.f8404a;
            this.f = uri;
            t(bVar);
            RandomAccessFile randomAccessFileV = v(uri);
            this.e = randomAccessFileV;
            randomAccessFileV.seek(bVar.g);
            long length = bVar.h;
            if (length == -1) {
                length = this.e.length() - bVar.g;
            }
            this.g = length;
            if (length < 0) {
                throw new DataSourceException(0);
            }
            this.h = true;
            u(bVar);
            return this.g;
        } catch (IOException e) {
            throw new FileDataSourceException(e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() throws FileDataSourceException {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.e = null;
                if (this.h) {
                    this.h = false;
                    s();
                }
            } catch (IOException e) {
                throw new FileDataSourceException(e);
            }
        } catch (Throwable th) {
            this.e = null;
            if (this.h) {
                this.h = false;
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
    public int read(byte[] bArr, int i, int i2) throws FileDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        if (this.g == 0) {
            return -1;
        }
        try {
            int i3 = ((RandomAccessFile) wlq.j(this.e)).read(bArr, i, (int) Math.min(this.g, i2));
            if (i3 > 0) {
                this.g -= (long) i3;
                r(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new FileDataSourceException(e);
        }
    }
}
