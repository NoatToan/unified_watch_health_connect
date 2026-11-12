package com.twitter.sdk.android.core.internal;

import android.content.Context;
import android.content.res.Resources;
import com.twitter.sdk.android.core.Twitter;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/* JADX INFO: loaded from: classes18.dex */
public class CommonUtils {
    public static final String a = "com.twitter.sdk.android.TRACE_ENABLED";
    public static final boolean b = false;
    private static Boolean c;

    public static String a(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        return i > 0 ? context.getResources().getResourcePackageName(i) : context.getPackageName();
    }

    public static int b(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, a(context));
    }

    public static boolean c(Context context) {
        if (c == null) {
            c = Boolean.valueOf(getBooleanResourceValue(context, a, false));
        }
        return c.booleanValue();
    }

    public static void closeOrLog(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Twitter.getLogger().e("Twitter", str, e);
            }
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void copyStream(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    public static boolean getBooleanResourceValue(Context context, String str, boolean z) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int iB = b(context, str, "bool");
            if (iB > 0) {
                return resources.getBoolean(iB);
            }
            int iB2 = b(context, str, "string");
            if (iB2 > 0) {
                return Boolean.parseBoolean(context.getString(iB2));
            }
        }
        return z;
    }

    public static String getStringResourceValue(Context context, String str, String str2) {
        Resources resources;
        int iB;
        return (context == null || (resources = context.getResources()) == null || (iB = b(context, str, "string")) <= 0) ? str2 : resources.getString(iB);
    }

    public static void logControlled(Context context, String str) {
        if (c(context)) {
            Twitter.getLogger().d("Twitter", str);
        }
    }

    public static void logControlledError(Context context, String str, Throwable th) {
        if (c(context)) {
            Twitter.getLogger().e("Twitter", str);
        }
    }

    public static void logOrThrowIllegalStateException(String str, String str2) {
        if (Twitter.isDebug()) {
            throw new IllegalStateException(str2);
        }
        Twitter.getLogger().w(str, str2);
    }

    public static String streamToString(InputStream inputStream) throws IOException {
        Scanner scannerUseDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
    }

    public static void logControlled(Context context, int i, String str, String str2) {
        if (c(context)) {
            Twitter.getLogger().log(i, "Twitter", str2);
        }
    }
}
