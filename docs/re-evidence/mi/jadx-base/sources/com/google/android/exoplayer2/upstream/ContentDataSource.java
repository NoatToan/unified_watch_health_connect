package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import defpackage.m62;
import defpackage.wlq;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes4.dex */
public final class ContentDataSource extends m62 {
    public final ContentResolver e;
    public Uri f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean j;

    public static class ContentDataSourceException extends IOException {
        public ContentDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.e = context.getContentResolver();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long b(b bVar) throws ContentDataSourceException {
        try {
            Uri uri = bVar.f8404a;
            this.f = uri;
            t(bVar);
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.e.openAssetFileDescriptor(uri, "r");
            this.g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                String strValueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 36);
                sb.append("Could not open file descriptor for: ");
                sb.append(strValueOf);
                throw new FileNotFoundException(sb.toString());
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.h = fileInputStream;
            if (length != -1 && bVar.g > length) {
                throw new DataSourceException(0);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(bVar.g + startOffset) - startOffset;
            if (jSkip != bVar.g) {
                throw new DataSourceException(0);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.i = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.i = jPosition;
                    if (jPosition < 0) {
                        throw new DataSourceException(0);
                    }
                }
            } else {
                long j = length - jSkip;
                this.i = j;
                if (j < 0) {
                    throw new DataSourceException(0);
                }
            }
            long jMin = bVar.h;
            if (jMin != -1) {
                long j2 = this.i;
                if (j2 != -1) {
                    jMin = Math.min(j2, jMin);
                }
                this.i = jMin;
            }
            this.j = true;
            u(bVar);
            long j3 = bVar.h;
            return j3 != -1 ? j3 : this.i;
        } catch (IOException e) {
            throw new ContentDataSourceException(e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() throws ContentDataSourceException {
        this.f = null;
        try {
            try {
                FileInputStream fileInputStream = this.h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            s();
                        }
                    } catch (Throwable th) {
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            s();
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw new ContentDataSourceException(e);
                }
            } catch (Throwable th2) {
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            s();
                        }
                        throw th2;
                    } catch (Throwable th3) {
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            s();
                        }
                        throw th3;
                    }
                } catch (IOException e2) {
                    throw new ContentDataSourceException(e2);
                }
            }
        } catch (IOException e3) {
            throw new ContentDataSourceException(e3);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri h() {
        return this.f;
    }

    @Override // defpackage.zm5
    public int read(byte[] bArr, int i, int i2) throws ContentDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new ContentDataSourceException(e);
            }
        }
        int i3 = ((FileInputStream) wlq.j(this.h)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        long j2 = this.i;
        if (j2 != -1) {
            this.i = j2 - ((long) i3);
        }
        r(i3);
        return i3;
    }
}
