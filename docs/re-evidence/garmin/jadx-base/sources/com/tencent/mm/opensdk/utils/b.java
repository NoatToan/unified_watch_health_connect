package com.tencent.mm.opensdk.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f54844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f54845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f54846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f54847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static ThreadPoolExecutor f54848e;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f54845b = iAvailableProcessors;
        int i14 = iAvailableProcessors + 1;
        f54846c = i14;
        int i15 = (iAvailableProcessors * 2) + 1;
        f54847d = i15;
        f54848e = new ThreadPoolExecutor(i14, i15, 1L, TimeUnit.SECONDS, new LinkedBlockingDeque());
    }

    public static int a(ContentResolver contentResolver, Uri uri) {
        Log.i("MicroMsg.SDK.Util", "getFileSize with content url");
        if (contentResolver == null || uri == null) {
            Log.w("MicroMsg.SDK.Util", "getFileSize fail, resolver or uri is null");
            return 0;
        }
        InputStream inputStream = null;
        try {
            try {
                InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                if (inputStreamOpenInputStream == null) {
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    return 0;
                }
                int iAvailable = inputStreamOpenInputStream.available();
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException unused2) {
                }
                return iAvailable;
            } catch (Throwable th3) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th3;
            }
        } catch (Exception e4) {
            Log.w("MicroMsg.SDK.Util", "getFileSize fail, " + e4.getMessage());
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            return 0;
        }
    }

    public static boolean b(String str) {
        return str == null || str.length() <= 0;
    }

    public static int a(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        File file = new File(str);
        if (file.exists()) {
            return (int) file.length();
        }
        if (f54844a != null && str.startsWith(FirebaseAnalytics.Param.CONTENT)) {
            try {
                return a(f54844a.getContentResolver(), Uri.parse(str));
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static int a(String str, int i14) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    return Integer.parseInt(str);
                }
            } catch (Exception unused) {
            }
        }
        return i14;
    }

    public static boolean a(int i14) {
        return i14 == 36 || i14 == 46;
    }
}
