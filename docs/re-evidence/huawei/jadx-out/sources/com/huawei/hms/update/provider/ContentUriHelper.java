package com.huawei.hms.update.provider;

import android.content.Context;
import android.net.Uri;
import com.huawei.hms.utils.Checker;
import com.huawei.hwcloudjs.g.a;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
class ContentUriHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f16745c = File.separator + a.f17122c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f16746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f16747b;

    private static File a(File file) {
        if (file == null) {
            return null;
        }
        try {
            return file.getCanonicalFile();
        } catch (IOException unused) {
            return null;
        }
    }

    private static String b(File file) {
        if (file == null) {
            return null;
        }
        try {
            return file.getCanonicalPath();
        } catch (IOException unused) {
            return null;
        }
    }

    public File getLocalFile(String str) {
        String strA;
        if (str == null || str.contains("..") || (strA = a()) == null) {
            return null;
        }
        return a(new File(strA, str));
    }

    public Uri getUriForFile(File file, String str) {
        String strB;
        String strA;
        if (file == null || file.getPath().contains("..") || (strB = b(file)) == null || (strA = a(strB)) == null) {
            return null;
        }
        return new Uri.Builder().scheme("content").authority(str).encodedPath(strA).build();
    }

    public void setContext(Context context) {
        if (this.f16746a == null) {
            Checker.checkNonNull(context, "context must not be null.");
            this.f16746a = context;
        }
    }

    private String a() {
        String str;
        Context context = (Context) Checker.assertNonNull(this.f16746a, "mContext is null, call setContext first.");
        synchronized (this) {
            if (this.f16747b == null) {
                if (context.getExternalCacheDir() != null) {
                    this.f16747b = b(context.getExternalCacheDir());
                } else {
                    this.f16747b = b(context.getFilesDir());
                }
                this.f16747b += f16745c;
            }
            str = this.f16747b;
        }
        return str;
    }

    private String b(String str) {
        int iIndexOf;
        String strB;
        String strA = a();
        if (strA != null && (iIndexOf = str.indexOf(47, 1)) >= 0 && "ContentUriHelper".equals(Uri.decode(str.substring(1, iIndexOf))) && (strB = b(new File(strA, Uri.decode(str.substring(iIndexOf + 1))))) != null && strB.startsWith(strA)) {
            return strB;
        }
        return null;
    }

    private String a(String str) {
        int length;
        String strA = a();
        if (strA == null || !str.startsWith(strA)) {
            return null;
        }
        if (strA.endsWith("/")) {
            length = strA.length();
        } else {
            length = strA.length() + 1;
        }
        return Uri.encode("ContentUriHelper") + '/' + str.substring(length);
    }

    File a(Uri uri) {
        String encodedPath;
        String strB;
        if (uri == null || (encodedPath = uri.getEncodedPath()) == null || (strB = b(encodedPath)) == null) {
            return null;
        }
        return a(new File(strB));
    }

    ContentUriHelper() {
    }
}
