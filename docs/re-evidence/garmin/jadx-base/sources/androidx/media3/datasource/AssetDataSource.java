package androidx.media3.datasource;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import fa.z;
import ha.a;
import ha.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class AssetDataSource extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AssetManager f8599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f8600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InputStream f8601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8603i;

    public AssetDataSource(Context context) {
        super(false);
        this.f8599e = context.getAssets();
    }

    @Override // ha.d
    public final long b(g gVar) throws AssetDataSourceException {
        try {
            Uri uri = gVar.f82555a;
            long j8 = gVar.f82560f;
            this.f8600f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            e(gVar);
            InputStream inputStreamOpen = this.f8599e.open(path, 1);
            this.f8601g = inputStreamOpen;
            if (inputStreamOpen.skip(j8) < j8) {
                throw new AssetDataSourceException(null, 2008);
            }
            long j14 = gVar.f82561g;
            if (j14 != -1) {
                this.f8602h = j14;
            } else {
                long jAvailable = this.f8601g.available();
                this.f8602h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f8602h = -1L;
                }
            }
            this.f8603i = true;
            f(gVar);
            return this.f8602h;
        } catch (AssetDataSourceException e4) {
            throw e4;
        } catch (IOException e14) {
            throw new AssetDataSourceException(e14, e14 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // ha.d
    public final void close() {
        this.f8600f = null;
        try {
            try {
                InputStream inputStream = this.f8601g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f8601g = null;
                if (this.f8603i) {
                    this.f8603i = false;
                    d();
                }
            } catch (IOException e4) {
                throw new AssetDataSourceException(e4, 2000);
            }
        } catch (Throwable th3) {
            this.f8601g = null;
            if (this.f8603i) {
                this.f8603i = false;
                d();
            }
            throw th3;
        }
    }

    @Override // ha.d
    public final Uri getUri() {
        return this.f8600f;
    }

    @Override // androidx.media3.common.j
    public final int read(byte[] bArr, int i14, int i15) throws AssetDataSourceException {
        if (i15 == 0) {
            return 0;
        }
        long j8 = this.f8602h;
        if (j8 == 0) {
            return -1;
        }
        if (j8 != -1) {
            try {
                i15 = (int) Math.min(j8, i15);
            } catch (IOException e4) {
                throw new AssetDataSourceException(e4, 2000);
            }
        }
        InputStream inputStream = this.f8601g;
        int i16 = z.f70071a;
        int i17 = inputStream.read(bArr, i14, i15);
        if (i17 == -1) {
            return -1;
        }
        long j14 = this.f8602h;
        if (j14 != -1) {
            this.f8602h = j14 - ((long) i17);
        }
        c(i17);
        return i17;
    }

    public static final class AssetDataSourceException extends DataSourceException {
        @Deprecated
        public AssetDataSourceException(IOException iOException) {
            super(iOException, 2000);
        }

        public AssetDataSourceException(Throwable th3, int i14) {
            super(th3, i14);
        }
    }
}
