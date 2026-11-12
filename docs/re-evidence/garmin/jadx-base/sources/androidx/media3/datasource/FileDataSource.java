package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fa.z;
import ha.a;
import ha.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import p6.b;

/* JADX INFO: loaded from: classes.dex */
public final class FileDataSource extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RandomAccessFile f8610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f8611f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f8612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8613h;

    public FileDataSource() {
        super(false);
    }

    @Override // ha.d
    public final long b(g gVar) throws FileDataSourceException {
        Uri uri = gVar.f82555a;
        long j8 = gVar.f82560f;
        this.f8611f = uri;
        e(gVar);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
            this.f8610e = randomAccessFile;
            try {
                randomAccessFile.seek(j8);
                long length = gVar.f82561g;
                if (length == -1) {
                    length = this.f8610e.length() - j8;
                }
                this.f8612g = length;
                if (length < 0) {
                    throw new FileDataSourceException(null, null, 2008);
                }
                this.f8613h = true;
                f(gVar);
                return this.f8612g;
            } catch (IOException e4) {
                throw new FileDataSourceException(e4, 2000);
            }
        } catch (FileNotFoundException e14) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e14, ((e14.getCause() instanceof ErrnoException) && ((ErrnoException) e14.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbI = b.i("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbI.append(fragment);
            throw new FileDataSourceException(sbI.toString(), e14, 1004);
        } catch (SecurityException e15) {
            throw new FileDataSourceException(e15, 2006);
        } catch (RuntimeException e16) {
            throw new FileDataSourceException(e16, 2000);
        }
    }

    @Override // ha.d
    public final void close() {
        this.f8611f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f8610e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f8610e = null;
                if (this.f8613h) {
                    this.f8613h = false;
                    d();
                }
            } catch (IOException e4) {
                throw new FileDataSourceException(e4, 2000);
            }
        } catch (Throwable th3) {
            this.f8610e = null;
            if (this.f8613h) {
                this.f8613h = false;
                d();
            }
            throw th3;
        }
    }

    @Override // ha.d
    public final Uri getUri() {
        return this.f8611f;
    }

    @Override // androidx.media3.common.j
    public final int read(byte[] bArr, int i14, int i15) throws FileDataSourceException {
        if (i15 == 0) {
            return 0;
        }
        long j8 = this.f8612g;
        if (j8 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f8610e;
            int i16 = z.f70071a;
            int i17 = randomAccessFile.read(bArr, i14, (int) Math.min(j8, i15));
            if (i17 > 0) {
                this.f8612g -= (long) i17;
                c(i17);
            }
            return i17;
        } catch (IOException e4) {
            throw new FileDataSourceException(e4, 2000);
        }
    }

    public static class FileDataSourceException extends DataSourceException {
        @Deprecated
        public FileDataSourceException(Exception exc) {
            super(exc, 2000);
        }

        @Deprecated
        public FileDataSourceException(String str, IOException iOException) {
            super(str, iOException, 2000);
        }

        public FileDataSourceException(Throwable th3, int i14) {
            super(th3, i14);
        }

        public FileDataSourceException(String str, Throwable th3, int i14) {
            super(str, th3, i14);
        }
    }
}
