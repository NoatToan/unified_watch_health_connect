package com.tencent.mm.opensdk.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f30978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ThreadPoolExecutor f30979b = new ThreadPoolExecutor(5, 9, 1, TimeUnit.SECONDS, new LinkedBlockingDeque());

    public static boolean a(int i) {
        return i == 36 || i == 46;
    }

    public static boolean b(String str) {
        return str == null || str.length() <= 0;
    }

    public static int a(String str, int i) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    return Integer.parseInt(str);
                }
            } catch (Exception unused) {
            }
        }
        return i;
    }

    public static int a(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        File file = new File(str);
        if (file.exists()) {
            return (int) file.length();
        }
        if (f30978a != null && str.startsWith("content")) {
            try {
                return a(f30978a.getContentResolver(), Uri.parse(str));
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
                            return 0;
                        } catch (IOException e) {
                            Log.e("MicroMsg.SDK.Util", "getFileSize exception: " + e.getMessage());
                        }
                    }
                    return 0;
                }
                int iAvailable = inputStreamOpenInputStream.available();
                try {
                    inputStreamOpenInputStream.close();
                    return iAvailable;
                } catch (IOException e2) {
                    Log.e("MicroMsg.SDK.Util", "getFileSize exception: " + e2.getMessage());
                    return iAvailable;
                }
            } catch (Exception e3) {
                Log.w("MicroMsg.SDK.Util", "getFileSize fail, " + e3.getMessage());
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        Log.e("MicroMsg.SDK.Util", "getFileSize exception: " + e4.getMessage());
                    }
                }
                return 0;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e5) {
                    Log.e("MicroMsg.SDK.Util", "getFileSize exception: " + e5.getMessage());
                }
            }
            throw th;
        }
        if (0 != 0) {
            inputStream.close();
        }
        throw th;
    }
}
