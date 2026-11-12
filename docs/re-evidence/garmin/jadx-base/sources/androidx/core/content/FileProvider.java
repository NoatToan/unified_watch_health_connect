package androidx.core.content;

import am.j;
import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fb1.c;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.xmlpull.v1.XmlPullParserException;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f6382e = {"_display_name", "_size"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final File f6383f = new File("/");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap<String, a> f6384g = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f6387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f6388d;

    public interface a {
        Uri a(File file);

        File b(Uri uri);
    }

    public static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap<String, File> f6390b = new HashMap<>();

        public b(String str) {
            this.f6389a = str;
        }

        @Override // androidx.core.content.FileProvider.a
        public final Uri a(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f6390b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (FileProvider.a(canonicalPath).startsWith(FileProvider.a(path).concat("/")) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    h.s(c.n("Failed to find configured root that contains ", canonicalPath));
                    return null;
                }
                String path2 = entry.getValue().getPath();
                return new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(this.f6389a).encodedPath(Uri.encode(entry.getKey()) + IOUtils.DIR_SEPARATOR_UNIX + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            } catch (IOException unused) {
                h.s(v.h.v(file, "Failed to resolve canonical path for "));
                return null;
            }
        }

        @Override // androidx.core.content.FileProvider.a
        public final File b(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int iIndexOf = encodedPath.indexOf(47, 1);
            if (iIndexOf == -1) {
                h.s(j.j(uri, "Unable to find path from root: "));
                return null;
            }
            String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
            String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
            File file = this.f6390b.get(strDecode);
            if (file == null) {
                h.s(j.j(uri, "Unable to find configured root for "));
                return null;
            }
            File file2 = new File(file, strDecode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (FileProvider.a(canonicalFile.getPath()).startsWith(FileProvider.a(file.getPath()).concat("/"))) {
                    return canonicalFile;
                }
                com.garmin.proto.generated.a.h("Resolved path jumped beyond configured root");
                return null;
            } catch (IOException unused) {
                h.s(v.h.v(file2, "Failed to resolve canonical path for "));
                return null;
            }
        }
    }

    public FileProvider(int i14) {
        this.f6385a = new Object();
        this.f6386b = i14;
    }

    public static String a(String str) {
        return (str.length() <= 0 || str.charAt(str.length() - 1) != '/') ? str : c.m(1, 0, str);
    }

    public static a c(Context context, int i14, String str) {
        a aVarE;
        HashMap<String, a> map = f6384g;
        synchronized (map) {
            try {
                aVarE = map.get(str);
                if (aVarE == null) {
                    try {
                        try {
                            aVarE = e(context, i14, str);
                            map.put(str, aVarE);
                        } catch (IOException e4) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e4);
                        }
                    } catch (XmlPullParserException e14) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e14);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return aVarE;
    }

    public static Uri d(Context context, String str, File file) {
        return c(context, 0, str).a(file);
    }

    public static b e(Context context, int i14, String str) throws XmlPullParserException, IOException {
        b bVar = new b(str);
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (providerInfoResolveContentProvider == null) {
            h.s(c.n("Couldn't find meta-data for provider with authority ", str));
            return null;
        }
        if (providerInfoResolveContentProvider.metaData == null && i14 != 0) {
            Bundle bundle = new Bundle(1);
            providerInfoResolveContentProvider.metaData = bundle;
            bundle.putInt("android.support.FILE_PROVIDER_PATHS", i14);
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (xmlResourceParserLoadXmlMetaData == null) {
            h.s("Missing android.support.FILE_PROVIDER_PATHS meta-data");
            return null;
        }
        while (true) {
            int next = xmlResourceParserLoadXmlMetaData.next();
            if (next == 1) {
                return bVar;
            }
            if (next == 2) {
                String name = xmlResourceParserLoadXmlMetaData.getName();
                File externalStorageDirectory = null;
                String attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "name");
                String attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    externalStorageDirectory = f6383f;
                } else if ("files-path".equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] externalFilesDirs = a7.b.getExternalFilesDirs(context, null);
                    if (externalFilesDirs.length > 0) {
                        externalStorageDirectory = externalFilesDirs[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] externalCacheDirs = a7.b.getExternalCacheDirs(context);
                    if (externalCacheDirs.length > 0) {
                        externalStorageDirectory = externalCacheDirs[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] externalMediaDirs = context.getExternalMediaDirs();
                    if (externalMediaDirs.length > 0) {
                        externalStorageDirectory = externalMediaDirs[0];
                    }
                }
                if (externalStorageDirectory == null) {
                    continue;
                } else {
                    String str2 = new String[]{attributeValue2}[0];
                    if (str2 != null) {
                        externalStorageDirectory = new File(externalStorageDirectory, str2);
                    }
                    if (TextUtils.isEmpty(attributeValue)) {
                        h.s("Name must not be empty");
                        return null;
                    }
                    try {
                        bVar.f6390b.put(attributeValue, externalStorageDirectory.getCanonicalFile());
                    } catch (IOException e4) {
                        n23.j.w(v.h.v(externalStorageDirectory, "Failed to resolve canonical path for "), e4);
                        return null;
                    }
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            com.garmin.proto.generated.a.h("Provider must not be exported");
            return;
        }
        if (!providerInfo.grantUriPermissions) {
            com.garmin.proto.generated.a.h("Provider must grant uri permissions");
            return;
        }
        String str = providerInfo.authority;
        if (str == null || str.trim().isEmpty()) {
            com.garmin.proto.generated.a.h("Provider must have a non-empty authority");
            return;
        }
        String str2 = providerInfo.authority.split(";")[0];
        synchronized (this.f6385a) {
            this.f6387c = str2;
        }
        HashMap<String, a> map = f6384g;
        synchronized (map) {
            map.remove(str2);
        }
    }

    public final a b() {
        a aVar;
        synchronized (this.f6385a) {
            try {
                if (this.f6387c == null) {
                    throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                }
                if (this.f6388d == null) {
                    this.f6388d = c(getContext(), this.f6386b, this.f6387c);
                }
                aVar = this.f6388d;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return aVar;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return b().b(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        File fileB = b().b(uri);
        int iLastIndexOf = fileB.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileB.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i14;
        File fileB = b().b(uri);
        if (JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR.equals(str)) {
            i14 = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i14 = 738197504;
        } else if ("wa".equals(str)) {
            i14 = 704643072;
        } else if ("rw".equals(str)) {
            i14 = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                h.s(c.n("Invalid mode: ", str));
                return null;
            }
            i14 = 1006632960;
        }
        return ParcelFileDescriptor.open(fileB, i14);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i14;
        File fileB = b().b(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f6382e;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i15 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i15] = "_display_name";
                i14 = i15 + 1;
                objArr[i15] = queryParameter == null ? fileB.getName() : queryParameter;
            } else {
                if ("_size".equals(str3)) {
                    strArr3[i15] = "_size";
                    i14 = i15 + 1;
                    objArr[i15] = Long.valueOf(fileB.length());
                }
            }
            i15 = i14;
        }
        String[] strArr4 = new String[i15];
        System.arraycopy(strArr3, 0, strArr4, 0, i15);
        Object[] objArr2 = new Object[i15];
        System.arraycopy(objArr, 0, objArr2, 0, i15);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public FileProvider() {
        this(0);
    }
}
