package androidx.media3.datasource;

import am.j;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import fa.z;
import ha.a;
import ha.g;
import i3.e5;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RawResourceDataSource extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f8614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f8615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f8616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FileInputStream f8617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f8618i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8619j;

    public RawResourceDataSource(Context context) {
        super(false);
        this.f8614e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i14) {
        return Uri.parse("rawresource:///" + i14);
    }

    @Override // ha.d
    public final long b(g gVar) throws RawResourceDataSourceException {
        Resources resourcesForApplication;
        int identifier;
        int i14;
        Resources resources;
        this.f8615f = gVar;
        e(gVar);
        Uri uri = gVar.f82555a;
        long j8 = gVar.f82561g;
        long j14 = gVar.f82560f;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        boolean zEquals = TextUtils.equals(com.google.android.exoplayer2.upstream.RawResourceDataSource.RAW_RESOURCE_SCHEME, uriNormalizeScheme.getScheme());
        Context context = this.f8614e;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new RawResourceDataSourceException("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            try {
                i14 = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new RawResourceDataSourceException("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e4) {
                    throw new RawResourceDataSourceException("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e4, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(e5.g(packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new RawResourceDataSourceException("Resource not found.", null, 2005);
                }
            }
            i14 = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i14);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new RawResourceDataSourceException(j.j(uriNormalizeScheme, "Resource is compressed: "), null, 2000);
            }
            this.f8616g = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f8616g.getFileDescriptor());
            this.f8617h = fileInputStream;
            try {
                if (length != -1 && j14 > length) {
                    throw new RawResourceDataSourceException(null, null, 2008);
                }
                long startOffset = this.f8616g.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j14) - startOffset;
                if (jSkip != j14) {
                    throw new RawResourceDataSourceException(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f8618i = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f8618i = size;
                        if (size < 0) {
                            throw new RawResourceDataSourceException(null, null, 2008);
                        }
                    }
                } else {
                    long j15 = length - jSkip;
                    this.f8618i = j15;
                    if (j15 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
                if (j8 != -1) {
                    long j16 = this.f8618i;
                    this.f8618i = j16 == -1 ? j8 : Math.min(j16, j8);
                }
                this.f8619j = true;
                f(gVar);
                return j8 != -1 ? j8 : this.f8618i;
            } catch (RawResourceDataSourceException e14) {
                throw e14;
            } catch (IOException e15) {
                throw new RawResourceDataSourceException(null, e15, 2000);
            }
        } catch (Resources.NotFoundException e16) {
            throw new RawResourceDataSourceException(null, e16, 2005);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // ha.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        this.f8615f = null;
        try {
            FileInputStream fileInputStream = this.f8617h;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f8617h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor = this.f8616g;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    this.f8616g = null;
                    if (this.f8619j) {
                        this.f8619j = false;
                        d();
                    }
                } catch (IOException e4) {
                    throw new RawResourceDataSourceException(null, e4, 2000);
                }
            } catch (Throwable th3) {
                this.f8616g = null;
                if (this.f8619j) {
                    this.f8619j = false;
                    d();
                }
                throw th3;
            }
        } catch (IOException e14) {
            throw new RawResourceDataSourceException(null, e14, 2000);
        }
    }

    @Override // ha.d
    public final Uri getUri() {
        g gVar = this.f8615f;
        if (gVar != null) {
            return gVar.f82555a;
        }
        return null;
    }

    @Override // androidx.media3.common.j
    public final int read(byte[] bArr, int i14, int i15) throws RawResourceDataSourceException {
        if (i15 == 0) {
            return 0;
        }
        long j8 = this.f8618i;
        if (j8 != 0) {
            if (j8 != -1) {
                try {
                    i15 = (int) Math.min(j8, i15);
                } catch (IOException e4) {
                    throw new RawResourceDataSourceException(null, e4, 2000);
                }
            }
            FileInputStream fileInputStream = this.f8617h;
            int i16 = z.f70071a;
            int i17 = fileInputStream.read(bArr, i14, i15);
            long j14 = this.f8618i;
            if (i17 != -1) {
                if (j14 != -1) {
                    this.f8618i = j14 - ((long) i17);
                }
                c(i17);
                return i17;
            }
            if (j14 != -1) {
                throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
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
