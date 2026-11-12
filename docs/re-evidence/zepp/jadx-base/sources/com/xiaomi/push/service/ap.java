package com.xiaomi.push.service;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.xiaomi.push.ad;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes22.dex */
public class ap {
    private static long a;

    public static class a {
        public byte[] a;
        public int b;

        public a(byte[] bArr, int i) {
            this.a = bArr;
            this.b = i;
        }
    }

    public static class b {
        public long a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public Bitmap f204a;

        public b(Bitmap bitmap, long j) {
            this.f204a = bitmap;
            this.a = j;
        }
    }

    private static int a(Context context, InputStream inputStream) {
        int i;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("decode dimension failed for bitmap.");
            return 1;
        }
        int iRound = Math.round((context.getResources().getDisplayMetrics().densityDpi / 160.0f) * 48.0f);
        int i2 = options.outWidth;
        if (i2 <= iRound || (i = options.outHeight) <= iRound) {
            return 1;
        }
        return Math.min(i2 / iRound, i / iRound);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public static Bitmap a(Context context, String str) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStreamOpenInputStream2;
        Uri uri = Uri.parse(str);
        ?? r0 = 0;
        r0 = 0;
        try {
            try {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                try {
                    int iA = a(context, inputStreamOpenInputStream);
                    inputStreamOpenInputStream2 = context.getContentResolver().openInputStream(uri);
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inSampleSize = iA;
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options);
                        com.xiaomi.push.h.a(inputStreamOpenInputStream2);
                        com.xiaomi.push.h.a(inputStreamOpenInputStream);
                        return bitmapDecodeStream;
                    } catch (IOException e) {
                        e = e;
                        com.xiaomi.channel.commonutils.logger.b.a(e);
                        com.xiaomi.push.h.a(inputStreamOpenInputStream2);
                        com.xiaomi.push.h.a(inputStreamOpenInputStream);
                        return null;
                    }
                } catch (IOException e2) {
                    e = e2;
                    inputStreamOpenInputStream2 = null;
                } catch (Throwable th) {
                    th = th;
                    com.xiaomi.push.h.a((Closeable) r0);
                    com.xiaomi.push.h.a(inputStreamOpenInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                r0 = context;
            }
        } catch (IOException e3) {
            e = e3;
            inputStreamOpenInputStream2 = null;
            inputStreamOpenInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpenInputStream = null;
        }
    }

    public static b a(Context context, String str, boolean z) throws Throwable {
        ByteArrayInputStream byteArrayInputStream = null;
        b bVar = new b(null, 0L);
        Bitmap bitmapE = e(context, str);
        try {
            if (bitmapE != null) {
                bVar.f204a = bitmapE;
                return bVar;
            }
            try {
                a aVarB = b(str, z);
                if (aVarB == null) {
                    com.xiaomi.push.h.a((Closeable) null);
                    return bVar;
                }
                bVar.a = aVarB.b;
                byte[] bArr = aVarB.a;
                if (bArr != null) {
                    if (z) {
                        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
                        try {
                            int iA = a(context, byteArrayInputStream2);
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inSampleSize = iA;
                            bVar.f204a = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                            byteArrayInputStream = byteArrayInputStream2;
                        } catch (Exception e) {
                            e = e;
                            byteArrayInputStream = byteArrayInputStream2;
                            com.xiaomi.channel.commonutils.logger.b.a(e);
                        } catch (Throwable th) {
                            th = th;
                            byteArrayInputStream = byteArrayInputStream2;
                            com.xiaomi.push.h.a(byteArrayInputStream);
                            throw th;
                        }
                    } else {
                        bVar.f204a = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    }
                }
                d(context, aVarB.a, str);
                com.xiaomi.push.h.a(byteArrayInputStream);
                return bVar;
            } catch (Exception e2) {
                e = e2;
            }
            com.xiaomi.channel.commonutils.logger.b.a(e);
            com.xiaomi.push.h.a(byteArrayInputStream);
            return bVar;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00dd A[PHI: r1
      0x00dd: PHI (r1v5 java.net.HttpURLConnection) = (r1v4 java.net.HttpURLConnection), (r1v6 java.net.HttpURLConnection) binds: [B:47:0x00db, B:52:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x00ff: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:56:0x00ff */
    private static a b(String str, boolean z) throws Throwable {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        Closeable closeable;
        Closeable closeable2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
                try {
                    httpURLConnection.setConnectTimeout(8000);
                    httpURLConnection.setReadTimeout(20000);
                    httpURLConnection.setRequestProperty("User-agent", "Mozilla/5.0 (Linux; U;) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/71.0.3578.141 Mobile Safari/537.36 XiaoMi/MiuiBrowser");
                    httpURLConnection.connect();
                    int contentLength = httpURLConnection.getContentLength();
                    if (z && contentLength > 102400) {
                        com.xiaomi.channel.commonutils.logger.b.m3434a("Bitmap size is too big, max size is 102400  contentLen size is " + contentLength + " from url " + str);
                        com.xiaomi.push.h.a((Closeable) null);
                        httpURLConnection.disconnect();
                        return null;
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        com.xiaomi.channel.commonutils.logger.b.m3434a("Invalid Http Response Code " + responseCode + " received");
                        com.xiaomi.push.h.a((Closeable) null);
                        httpURLConnection.disconnect();
                        return null;
                    }
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        int i = z ? 102400 : 2048000;
                        byte[] bArr = new byte[1024];
                        while (i > 0) {
                            int i2 = inputStream.read(bArr, 0, 1024);
                            if (i2 == -1) {
                                break;
                            }
                            i -= i2;
                            byteArrayOutputStream.write(bArr, 0, i2);
                        }
                        if (i <= 0) {
                            com.xiaomi.channel.commonutils.logger.b.m3434a("length 102400 exhausted.");
                            a aVar = new a(null, 102400);
                            com.xiaomi.push.h.a(inputStream);
                            httpURLConnection.disconnect();
                            return aVar;
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        a aVar2 = new a(byteArray, byteArray.length);
                        com.xiaomi.push.h.a(inputStream);
                        httpURLConnection.disconnect();
                        return aVar2;
                    } catch (SocketTimeoutException unused) {
                        com.xiaomi.channel.commonutils.logger.b.d("Connect timeout to " + str);
                        com.xiaomi.push.h.a(inputStream);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return null;
                    } catch (IOException e) {
                        e = e;
                        com.xiaomi.channel.commonutils.logger.b.a(e);
                        com.xiaomi.push.h.a(inputStream);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return null;
                    }
                } catch (SocketTimeoutException unused2) {
                    inputStream = null;
                } catch (IOException e2) {
                    e = e2;
                    inputStream = null;
                } catch (Throwable th) {
                    th = th;
                    com.xiaomi.push.h.a(closeable2);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                closeable2 = closeable;
            }
        } catch (SocketTimeoutException unused3) {
            httpURLConnection = null;
            inputStream = null;
        } catch (IOException e3) {
            e = e3;
            httpURLConnection = null;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
    }

    private static void c(Context context) {
        File file = new File(context.getCacheDir().getPath() + File.separator + "mipush_icon");
        if (file.exists()) {
            if (a == 0) {
                a = com.xiaomi.push.g.a(file);
            }
            if (a > 15728640) {
                try {
                    File[] fileArrListFiles = file.listFiles();
                    for (int i = 0; i < fileArrListFiles.length; i++) {
                        if (!fileArrListFiles[i].isDirectory() && Math.abs(System.currentTimeMillis() - fileArrListFiles[i].lastModified()) > 1209600) {
                            fileArrListFiles[i].delete();
                        }
                    }
                } catch (Exception e) {
                    com.xiaomi.channel.commonutils.logger.b.a(e);
                }
                a = 0L;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    private static void d(Context context, byte[] bArr, String str) throws Throwable {
        ?? r0;
        if (bArr == null) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("cannot save small icon cause bitmap is null");
            return;
        }
        c(context);
        ?? file = new File(context.getCacheDir().getPath() + File.separator + "mipush_icon");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File((File) file, ad.a(str));
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                file = new FileOutputStream(file2);
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(file);
                    try {
                        bufferedOutputStream2.write(bArr);
                        bufferedOutputStream2.flush();
                        com.xiaomi.push.h.a(bufferedOutputStream2);
                        r0 = file;
                    } catch (Exception e) {
                        e = e;
                        bufferedOutputStream = bufferedOutputStream2;
                        com.xiaomi.channel.commonutils.logger.b.a(e);
                        com.xiaomi.push.h.a(bufferedOutputStream);
                        r0 = file;
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                        com.xiaomi.push.h.a(bufferedOutputStream);
                        com.xiaomi.push.h.a((Closeable) file);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
            file = 0;
        } catch (Throwable th3) {
            th = th3;
            file = 0;
        }
        com.xiaomi.push.h.a((Closeable) r0);
        file = (a > 0L ? 1 : (a == 0L ? 0 : -1));
        if (file == 0) {
            a = com.xiaomi.push.g.a(new File(context.getCacheDir().getPath() + File.separator + "mipush_icon")) + file2.length();
        }
    }

    private static Bitmap e(Context context, String str) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        Bitmap bitmap;
        File file = new File(context.getCacheDir().getPath() + File.separator + "mipush_icon", ad.a(str));
        FileInputStream fileInputStream2 = null;
        Bitmap bitmapDecodeStream = null;
        fileInputStream2 = null;
        if (!file.exists()) {
            return null;
        }
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream);
                    file.setLastModified(System.currentTimeMillis());
                    com.xiaomi.push.h.a(fileInputStream);
                    return bitmapDecodeStream;
                } catch (Exception e) {
                    e = e;
                    Bitmap bitmap2 = bitmapDecodeStream;
                    fileInputStream2 = fileInputStream;
                    bitmap = bitmap2;
                    com.xiaomi.channel.commonutils.logger.b.a(e);
                    com.xiaomi.push.h.a(fileInputStream2);
                    return bitmap;
                } catch (Throwable th2) {
                    th = th2;
                    com.xiaomi.push.h.a(fileInputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                bitmap = null;
            }
        } catch (Throwable th3) {
            FileInputStream fileInputStream3 = fileInputStream2;
            th = th3;
            fileInputStream = fileInputStream3;
        }
    }
}
