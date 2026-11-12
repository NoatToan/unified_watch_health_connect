package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import defpackage.m62;
import defpackage.rk1;
import defpackage.wlq;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes4.dex */
public final class RawResourceDataSource extends m62 {
    public final Resources e;
    public final String f;
    public Uri g;
    public AssetFileDescriptor h;
    public InputStream i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8402k;

    public static class RawResourceDataSourceException extends IOException {
        public RawResourceDataSourceException(String str) {
            super(str);
        }

        public RawResourceDataSourceException(Throwable th) {
            super(th);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.e = context.getResources();
        this.f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("rawresource:///");
        sb.append(i);
        return Uri.parse(sb.toString());
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long b(b bVar) throws RawResourceDataSourceException {
        int identifier;
        Uri uri = bVar.f8404a;
        this.g = uri;
        if (TextUtils.equals("rawresource", uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && ((String) rk1.e(uri.getLastPathSegment())).matches("\\d+"))) {
            try {
                identifier = Integer.parseInt((String) rk1.e(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException("Resource identifier must be an integer.");
            }
        } else {
            if (!TextUtils.equals("android.resource", uri.getScheme())) {
                throw new RawResourceDataSourceException("URI must either use scheme rawresource or android.resource");
            }
            String strSubstring = (String) rk1.e(uri.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            String host = uri.getHost();
            String strValueOf = String.valueOf(TextUtils.isEmpty(host) ? "" : String.valueOf(host).concat(":"));
            String strValueOf2 = String.valueOf(strSubstring);
            identifier = this.e.getIdentifier(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf), "raw", this.f);
            if (identifier == 0) {
                throw new RawResourceDataSourceException("Resource not found.");
            }
        }
        t(bVar);
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.e.openRawResourceFd(identifier);
            this.h = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                String strValueOf3 = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(strValueOf3.length() + 24);
                sb.append("Resource is compressed: ");
                sb.append(strValueOf3);
                throw new RawResourceDataSourceException(sb.toString());
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.i = fileInputStream;
            if (length != -1) {
                try {
                    if (bVar.g > length) {
                        throw new DataSourceException(0);
                    }
                } catch (IOException e) {
                    throw new RawResourceDataSourceException(e);
                }
            }
            long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
            long jSkip = fileInputStream.skip(bVar.g + startOffset) - startOffset;
            if (jSkip != bVar.g) {
                throw new DataSourceException(0);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.j = -1L;
                } else {
                    long size = channel.size() - channel.position();
                    this.j = size;
                    if (size < 0) {
                        throw new DataSourceException(0);
                    }
                }
            } else {
                long j = length - jSkip;
                this.j = j;
                if (j < 0) {
                    throw new DataSourceException(0);
                }
            }
            long jMin = bVar.h;
            if (jMin != -1) {
                long j2 = this.j;
                if (j2 != -1) {
                    jMin = Math.min(j2, jMin);
                }
                this.j = jMin;
            }
            this.f8402k = true;
            u(bVar);
            long j3 = bVar.h;
            return j3 != -1 ? j3 : this.j;
        } catch (Resources.NotFoundException e2) {
            throw new RawResourceDataSourceException(e2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() throws RawResourceDataSourceException {
        this.g = null;
        try {
            try {
                InputStream inputStream = this.i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.h = null;
                        if (this.f8402k) {
                            this.f8402k = false;
                            s();
                        }
                    } catch (Throwable th) {
                        this.h = null;
                        if (this.f8402k) {
                            this.f8402k = false;
                            s();
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw new RawResourceDataSourceException(e);
                }
            } catch (Throwable th2) {
                this.i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.h = null;
                        if (this.f8402k) {
                            this.f8402k = false;
                            s();
                        }
                        throw th2;
                    } catch (Throwable th3) {
                        this.h = null;
                        if (this.f8402k) {
                            this.f8402k = false;
                            s();
                        }
                        throw th3;
                    }
                } catch (IOException e2) {
                    throw new RawResourceDataSourceException(e2);
                }
            }
        } catch (IOException e3) {
            throw new RawResourceDataSourceException(e3);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri h() {
        return this.g;
    }

    @Override // defpackage.zm5
    public int read(byte[] bArr, int i, int i2) throws RawResourceDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new RawResourceDataSourceException(e);
            }
        }
        int i3 = ((InputStream) wlq.j(this.i)).read(bArr, i, i2);
        if (i3 == -1) {
            if (this.j == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException(new EOFException());
        }
        long j2 = this.j;
        if (j2 != -1) {
            this.j = j2 - ((long) i3);
        }
        r(i3);
        return i3;
    }
}
