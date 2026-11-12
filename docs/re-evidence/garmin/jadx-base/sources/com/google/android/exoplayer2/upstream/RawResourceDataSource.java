package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes14.dex */
public final class RawResourceDataSource extends BaseDataSource {
    public static final String RAW_RESOURCE_SCHEME = "rawresource";
    private AssetFileDescriptor assetFileDescriptor;
    private long bytesRemaining;
    private InputStream inputStream;
    private boolean opened;
    private final String packageName;
    private final Resources resources;
    private Uri uri;

    public RawResourceDataSource(Context context) {
        super(false);
        this.resources = context.getResources();
        this.packageName = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i14) {
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("rawresource:///");
        sb3.append(i14);
        return Uri.parse(sb3.toString());
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // com.google.android.exoplayer2.upstream.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void close() {
        this.uri = null;
        try {
            InputStream inputStream = this.inputStream;
            if (inputStream != null) {
                inputStream.close();
            }
            this.inputStream = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor = this.assetFileDescriptor;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    this.assetFileDescriptor = null;
                    if (this.opened) {
                        this.opened = false;
                        transferEnded();
                    }
                } catch (IOException e4) {
                    throw new RawResourceDataSourceException(null, e4, 2000);
                }
            } catch (Throwable th3) {
                this.assetFileDescriptor = null;
                if (this.opened) {
                    this.opened = false;
                    transferEnded();
                }
                throw th3;
            }
        } catch (IOException e14) {
            throw new RawResourceDataSourceException(null, e14, 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Uri getUri() {
        return this.uri;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws RawResourceDataSourceException {
        int identifier;
        Uri uri = dataSpec.uri;
        this.uri = uri;
        if (TextUtils.equals(RAW_RESOURCE_SCHEME, uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && ((String) Assertions.checkNotNull(uri.getLastPathSegment())).matches("\\d+"))) {
            try {
                identifier = Integer.parseInt((String) Assertions.checkNotNull(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uri.getScheme())) {
                throw new RawResourceDataSourceException("URI must either use scheme rawresource or android.resource", null, 1004);
            }
            String strSubstring = (String) Assertions.checkNotNull(uri.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            String host = uri.getHost();
            String strConcat = TextUtils.isEmpty(host) ? "" : String.valueOf(host).concat(":");
            identifier = this.resources.getIdentifier(strSubstring.length() != 0 ? strConcat.concat(strSubstring) : new String(strConcat), "raw", this.packageName);
            if (identifier == 0) {
                throw new RawResourceDataSourceException("Resource not found.", null, 2005);
            }
        }
        transferInitializing(dataSpec);
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.resources.openRawResourceFd(identifier);
            this.assetFileDescriptor = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                String strValueOf = String.valueOf(uri);
                StringBuilder sb3 = new StringBuilder(strValueOf.length() + 24);
                sb3.append("Resource is compressed: ");
                sb3.append(strValueOf);
                throw new RawResourceDataSourceException(sb3.toString(), null, 2000);
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.inputStream = fileInputStream;
            if (length != -1) {
                try {
                    if (dataSpec.position > length) {
                        throw new RawResourceDataSourceException(null, null, 2008);
                    }
                } catch (RawResourceDataSourceException e4) {
                    throw e4;
                } catch (IOException e14) {
                    throw new RawResourceDataSourceException(null, e14, 2000);
                }
            }
            long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
            long jSkip = fileInputStream.skip(dataSpec.position + startOffset) - startOffset;
            if (jSkip != dataSpec.position) {
                throw new RawResourceDataSourceException(null, null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.bytesRemaining = -1L;
                } else {
                    long size = channel.size() - channel.position();
                    this.bytesRemaining = size;
                    if (size < 0) {
                        throw new RawResourceDataSourceException(null, null, 2008);
                    }
                }
            } else {
                long j8 = length - jSkip;
                this.bytesRemaining = j8;
                if (j8 < 0) {
                    throw new DataSourceException(2008);
                }
            }
            long jMin = dataSpec.length;
            if (jMin != -1) {
                long j14 = this.bytesRemaining;
                if (j14 != -1) {
                    jMin = Math.min(j14, jMin);
                }
                this.bytesRemaining = jMin;
            }
            this.opened = true;
            transferStarted(dataSpec);
            long j15 = dataSpec.length;
            return j15 != -1 ? j15 : this.bytesRemaining;
        } catch (Resources.NotFoundException e15) {
            throw new RawResourceDataSourceException(null, e15, 2005);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i14, int i15) throws RawResourceDataSourceException {
        if (i15 == 0) {
            return 0;
        }
        long j8 = this.bytesRemaining;
        if (j8 == 0) {
            return -1;
        }
        if (j8 != -1) {
            try {
                i15 = (int) Math.min(j8, i15);
            } catch (IOException e4) {
                throw new RawResourceDataSourceException(null, e4, 2000);
            }
        }
        int i16 = ((InputStream) Util.castNonNull(this.inputStream)).read(bArr, i14, i15);
        long j14 = this.bytesRemaining;
        if (i16 == -1) {
            if (j14 == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        if (j14 != -1) {
            this.bytesRemaining = j14 - ((long) i16);
        }
        bytesTransferred(i16);
        return i16;
    }

    public static class RawResourceDataSourceException extends DataSourceException {
        @Deprecated
        public RawResourceDataSourceException(String str) {
            super(str, null, 2000);
        }

        @Deprecated
        public RawResourceDataSourceException(Throwable th3) {
            super(th3, 2000);
        }

        public RawResourceDataSourceException(String str, Throwable th3, int i14) {
            super(str, th3, i14);
        }
    }
}
