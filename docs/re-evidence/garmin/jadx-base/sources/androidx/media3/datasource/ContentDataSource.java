package androidx.media3.datasource;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fa.z;
import ha.a;
import ha.g;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
public final class ContentDataSource extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ContentResolver f8604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f8605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f8606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FileInputStream f8607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f8608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8609j;

    public ContentDataSource(Context context) {
        super(false);
        this.f8604e = context.getContentResolver();
    }

    @Override // ha.d
    public final long b(g gVar) throws ContentDataSourceException {
        int i14;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uri = gVar.f82555a;
                long j8 = gVar.f82561g;
                long j14 = gVar.f82560f;
                Uri uriNormalizeScheme = uri.normalizeScheme();
                this.f8605f = uriNormalizeScheme;
                e(gVar);
                boolean zEquals = FirebaseAnalytics.Param.CONTENT.equals(uriNormalizeScheme.getScheme());
                ContentResolver contentResolver = this.f8604e;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
                }
                this.f8606g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i14 = 2000;
                    try {
                        throw new ContentDataSourceException(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
                    } catch (IOException e4) {
                        e = e4;
                        if (e instanceof FileNotFoundException) {
                            i14 = 2005;
                        }
                        throw new ContentDataSourceException(e, i14);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f8607h = fileInputStream;
                if (length != -1 && j14 > length) {
                    throw new ContentDataSourceException(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j14) - startOffset;
                if (jSkip != j14) {
                    throw new ContentDataSourceException(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f8608i = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.f8608i = jPosition;
                        if (jPosition < 0) {
                            throw new ContentDataSourceException(null, 2008);
                        }
                    }
                } else {
                    long j15 = length - jSkip;
                    this.f8608i = j15;
                    if (j15 < 0) {
                        throw new ContentDataSourceException(null, 2008);
                    }
                }
                if (j8 != -1) {
                    long j16 = this.f8608i;
                    this.f8608i = j16 == -1 ? j8 : Math.min(j16, j8);
                }
                this.f8609j = true;
                f(gVar);
                return j8 != -1 ? j8 : this.f8608i;
            } catch (IOException e14) {
                e = e14;
                i14 = 2000;
            }
        } catch (ContentDataSourceException e15) {
            throw e15;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // ha.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        this.f8605f = null;
        try {
            FileInputStream fileInputStream = this.f8607h;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f8607h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor = this.f8606g;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    this.f8606g = null;
                    if (this.f8609j) {
                        this.f8609j = false;
                        d();
                    }
                } catch (IOException e4) {
                    throw new ContentDataSourceException(e4, 2000);
                }
            } catch (Throwable th3) {
                this.f8606g = null;
                if (this.f8609j) {
                    this.f8609j = false;
                    d();
                }
                throw th3;
            }
        } catch (IOException e14) {
            throw new ContentDataSourceException(e14, 2000);
        }
    }

    @Override // ha.d
    public final Uri getUri() {
        return this.f8605f;
    }

    @Override // androidx.media3.common.j
    public final int read(byte[] bArr, int i14, int i15) throws ContentDataSourceException {
        if (i15 == 0) {
            return 0;
        }
        long j8 = this.f8608i;
        if (j8 == 0) {
            return -1;
        }
        if (j8 != -1) {
            try {
                i15 = (int) Math.min(j8, i15);
            } catch (IOException e4) {
                throw new ContentDataSourceException(e4, 2000);
            }
        }
        FileInputStream fileInputStream = this.f8607h;
        int i16 = z.f70071a;
        int i17 = fileInputStream.read(bArr, i14, i15);
        if (i17 == -1) {
            return -1;
        }
        long j14 = this.f8608i;
        if (j14 != -1) {
            this.f8608i = j14 - ((long) i17);
        }
        c(i17);
        return i17;
    }

    public static class ContentDataSourceException extends DataSourceException {
        @Deprecated
        public ContentDataSourceException(IOException iOException) {
            this(iOException, 2000);
        }

        public ContentDataSourceException(IOException iOException, int i14) {
            super(iOException, i14);
        }
    }
}
