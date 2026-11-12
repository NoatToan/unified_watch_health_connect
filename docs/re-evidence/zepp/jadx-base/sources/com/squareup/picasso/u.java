package com.squareup.picasso;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.util.Log;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes18.dex */
final class u {
    public static final String A = "removed";
    public static final String B = "delivered";
    public static final String C = "replaying";
    public static final String D = "completed";
    public static final String E = "errored";
    public static final String F = "paused";
    public static final String G = "resumed";
    private static final int H = 12;
    private static final String I = "RIFF";
    private static final String J = "WEBP";
    public static final String a = "Picasso-";
    public static final String b = "Picasso-Idle";
    public static final int c = 20000;
    public static final int d = 20000;
    public static final int e = 15000;
    private static final String f = "picasso-cache";
    private static final int g = 50;
    private static final int h = 5242880;
    private static final int i = 52428800;
    public static final int j = 1000;
    public static final char k = '\n';
    public static final StringBuilder l = new StringBuilder();
    public static final String m = "Main";
    public static final String n = "Dispatcher";
    public static final String o = "Hunter";
    public static final String p = "created";
    public static final String q = "changed";
    public static final String r = "ignored";
    public static final String s = "enqueued";
    public static final String t = "canceled";
    public static final String u = "batched";
    public static final String v = "retrying";
    public static final String w = "executing";
    public static final String x = "decoded";
    public static final String y = "transformed";
    public static final String z = "joined";

    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000L);
        }
    }

    @TargetApi(11)
    public static class b {
        private b() {
        }

        public static int a(ActivityManager activityManager) {
            return activityManager.getLargeMemoryClass();
        }
    }

    @TargetApi(12)
    public static class c {
        private c() {
        }

        public static int a(Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    }

    public static class d {
        private d() {
        }

        public static Downloader a(Context context) {
            return new OkHttpDownloader(context);
        }
    }

    public static class e extends Thread {
        public e(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    public static class f implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new e(runnable);
        }
    }

    private u() {
    }

    public static long a(File file) {
        long blockCount;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            blockCount = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 50;
        } catch (IllegalArgumentException unused) {
            blockCount = 5242880;
        }
        return Math.max(Math.min(blockCount, 52428800L), CacheDataSink.DEFAULT_FRAGMENT_SIZE);
    }

    public static int b(Context context) {
        ActivityManager activityManager = (ActivityManager) q(context, "activity");
        boolean z2 = (context.getApplicationInfo().flags & 1048576) != 0;
        int memoryClass = activityManager.getMemoryClass();
        if (z2 && Build.VERSION.SDK_INT >= 11) {
            memoryClass = b.a(activityManager);
        }
        return (memoryClass * 1048576) / 7;
    }

    public static void c() {
        if (!t()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    public static void d() {
        if (t()) {
            throw new IllegalStateException("Method call should not happen from the main thread.");
        }
    }

    public static <T> T e(T t2, String str) {
        Objects.requireNonNull(t2, str);
        return t2;
    }

    public static void f(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
    }

    public static File g(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), f);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static Downloader h(Context context) {
        try {
            Class.forName("com.squareup.okhttp.OkHttpClient");
            return d.a(context);
        } catch (ClassNotFoundException unused) {
            return new UrlConnectionDownloader(context);
        }
    }

    public static String i(Request request) {
        StringBuilder sb = l;
        String strJ = j(request, sb);
        sb.setLength(0);
        return strJ;
    }

    public static String j(Request request, StringBuilder sb) {
        String str = request.stableKey;
        if (str != null) {
            sb.ensureCapacity(str.length() + 50);
            sb.append(request.stableKey);
        } else {
            Uri uri = request.uri;
            if (uri != null) {
                String string = uri.toString();
                sb.ensureCapacity(string.length() + 50);
                sb.append(string);
            } else {
                sb.ensureCapacity(50);
                sb.append(request.resourceId);
            }
        }
        sb.append('\n');
        if (request.rotationDegrees != 0.0f) {
            sb.append("rotation:");
            sb.append(request.rotationDegrees);
            if (request.hasRotationPivot) {
                sb.append('@');
                sb.append(request.rotationPivotX);
                sb.append('x');
                sb.append(request.rotationPivotY);
            }
            sb.append('\n');
        }
        if (request.hasSize()) {
            sb.append("resize:");
            sb.append(request.targetWidth);
            sb.append('x');
            sb.append(request.targetHeight);
            sb.append('\n');
        }
        if (request.centerCrop) {
            sb.append("centerCrop");
            sb.append('\n');
        } else if (request.centerInside) {
            sb.append("centerInside");
            sb.append('\n');
        }
        List<Transformation> list = request.transformations;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append(request.transformations.get(i2).key());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    public static void k(Looper looper) {
        a aVar = new a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000L);
    }

    public static int l(Bitmap bitmap) {
        int iA = Build.VERSION.SDK_INT >= 12 ? c.a(bitmap) : bitmap.getRowBytes() * bitmap.getHeight();
        if (iA >= 0) {
            return iA;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    public static String m(com.squareup.picasso.c cVar) {
        return n(cVar, "");
    }

    public static String n(com.squareup.picasso.c cVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        com.squareup.picasso.a aVarH = cVar.h();
        if (aVarH != null) {
            sb.append(aVarH.b.c());
        }
        List<com.squareup.picasso.a> listI = cVar.i();
        if (listI != null) {
            int size = listI.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 > 0 || aVarH != null) {
                    sb.append(", ");
                }
                sb.append(listI.get(i2).b.c());
            }
        }
        return sb.toString();
    }

    public static int o(Resources resources, Request request) throws FileNotFoundException {
        Uri uri;
        int i2 = request.resourceId;
        if (i2 != 0 || (uri = request.uri) == null) {
            return i2;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + request.uri);
        }
        List<String> pathSegments = request.uri.getPathSegments();
        if (pathSegments == null || pathSegments.isEmpty()) {
            throw new FileNotFoundException("No path segments: " + request.uri);
        }
        if (pathSegments.size() == 1) {
            try {
                return Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new FileNotFoundException("Last path segment is not a resource ID: " + request.uri);
            }
        }
        if (pathSegments.size() == 2) {
            return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        }
        throw new FileNotFoundException("More than two path segments: " + request.uri);
    }

    public static Resources p(Context context, Request request) throws FileNotFoundException {
        Uri uri;
        if (request.resourceId != 0 || (uri = request.uri) == null) {
            return context.getResources();
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + request.uri);
        }
        try {
            return context.getPackageManager().getResourcesForApplication(authority);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new FileNotFoundException("Unable to obtain resources for package: " + request.uri);
        }
    }

    public static <T> T q(Context context, String str) {
        return (T) context.getSystemService(str);
    }

    public static boolean r(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static boolean s(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    public static boolean t() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static boolean u(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[12];
        return inputStream.read(bArr, 0, 12) == 12 && I.equals(new String(bArr, 0, 4, "US-ASCII")) && J.equals(new String(bArr, 8, 4, "US-ASCII"));
    }

    public static void v(String str, String str2, String str3) {
        w(str, str2, str3, "");
    }

    public static void w(String str, String str2, String str3, String str4) {
        Log.d(Picasso.p, String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }

    public static boolean x(String str) {
        if (str == null) {
            return false;
        }
        String[] strArrSplit = str.split(" ", 2);
        if ("CACHE".equals(strArrSplit[0])) {
            return true;
        }
        if (strArrSplit.length == 1) {
            return false;
        }
        try {
            return "CONDITIONAL_CACHE".equals(strArrSplit[0]) && Integer.parseInt(strArrSplit[1]) == 304;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static byte[] y(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (-1 == i2) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }
}
