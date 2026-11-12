package com.xiaomi.push.service;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.miui.tsmclient.model.ErrorCode;
import defpackage.egt;
import defpackage.mgt;
import defpackage.qcs;
import defpackage.x9s;
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

/* JADX INFO: loaded from: classes11.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f14239a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f14240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14241b;

        public a(byte[] bArr, int i) {
            this.f14240a = bArr;
            this.f14241b = i;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Bitmap f14242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f14243b;

        public b(Bitmap bitmap, long j) {
            this.f14242a = bitmap;
            this.f14243b = j;
        }
    }

    public static int a(Context context, InputStream inputStream) {
        int i;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            x9s.o("decode dimension failed for bitmap.");
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
    public static Bitmap b(Context context, String str) throws Throwable {
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
                        mgt.b(inputStreamOpenInputStream2);
                        mgt.b(inputStreamOpenInputStream);
                        return bitmapDecodeStream;
                    } catch (IOException e) {
                        e = e;
                        x9s.s(e);
                        mgt.b(inputStreamOpenInputStream2);
                        mgt.b(inputStreamOpenInputStream);
                        return null;
                    }
                } catch (IOException e2) {
                    e = e2;
                    inputStreamOpenInputStream2 = null;
                } catch (Throwable th) {
                    th = th;
                    mgt.b(r0);
                    mgt.b(inputStreamOpenInputStream);
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

    /* JADX WARN: Code duplicated, block: B:51:0x00df A[PHI: r1
      0x00df: PHI (r1v5 java.net.HttpURLConnection) = (r1v4 java.net.HttpURLConnection), (r1v6 java.net.HttpURLConnection) binds: [B:50:0x00dd, B:54:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x00a5: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:33:0x00a5 */
    public static a c(String str, boolean z) throws Throwable {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        Closeable closeable;
        Closeable closeable2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    httpURLConnection.setConnectTimeout(8000);
                    httpURLConnection.setReadTimeout(ErrorCode.ERROR_CODE_INVALID_PARAM);
                    httpURLConnection.setRequestProperty("User-agent", "Mozilla/5.0 (Linux; U;) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/71.0.3578.141 Mobile Safari/537.36 XiaoMi/MiuiBrowser");
                    httpURLConnection.connect();
                    int contentLength = httpURLConnection.getContentLength();
                    if (z && contentLength > 102400) {
                        x9s.o("Bitmap size is too big, max size is 102400  contentLen size is " + contentLength + " from url " + str);
                        mgt.b(null);
                        httpURLConnection.disconnect();
                        return null;
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        x9s.o("Invalid Http Response Code " + responseCode + " received");
                        mgt.b(null);
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
                            x9s.o("length 102400 exhausted.");
                            a aVar = new a(null, 102400);
                            mgt.b(inputStream);
                            httpURLConnection.disconnect();
                            return aVar;
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        a aVar2 = new a(byteArray, byteArray.length);
                        mgt.b(inputStream);
                        httpURLConnection.disconnect();
                        return aVar2;
                    } catch (SocketTimeoutException unused) {
                        x9s.D("Connect timeout to " + str);
                        mgt.b(inputStream);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return null;
                    } catch (IOException e) {
                        e = e;
                        x9s.s(e);
                        mgt.b(inputStream);
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
                    mgt.b(closeable2);
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

    public static b d(Context context, String str, boolean z) throws Throwable {
        ByteArrayInputStream byteArrayInputStream = null;
        b bVar = new b(null, 0L);
        Bitmap bitmapG = g(context, str);
        try {
            if (bitmapG != null) {
                bVar.f14242a = bitmapG;
                return bVar;
            }
            try {
                a aVarC = c(str, z);
                if (aVarC == null) {
                    mgt.b(null);
                    return bVar;
                }
                bVar.f14243b = aVarC.f14241b;
                byte[] bArr = aVarC.f14240a;
                if (bArr != null) {
                    if (z) {
                        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
                        try {
                            int iA = a(context, byteArrayInputStream2);
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inSampleSize = iA;
                            bVar.f14242a = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                            byteArrayInputStream = byteArrayInputStream2;
                        } catch (Exception e) {
                            e = e;
                            byteArrayInputStream = byteArrayInputStream2;
                            x9s.s(e);
                        } catch (Throwable th) {
                            th = th;
                            byteArrayInputStream = byteArrayInputStream2;
                            mgt.b(byteArrayInputStream);
                            throw th;
                        }
                    } else {
                        bVar.f14242a = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    }
                }
                f(context, aVarC.f14240a, str);
                mgt.b(byteArrayInputStream);
                return bVar;
            } catch (Exception e2) {
                e = e2;
            }
            x9s.s(e);
            mgt.b(byteArrayInputStream);
            return bVar;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void e(Context context) {
        File file = new File(context.getCacheDir().getPath() + File.separator + "mipush_icon");
        if (file.exists()) {
            if (f14239a == 0) {
                f14239a = egt.a(file);
            }
            if (f14239a > 15728640) {
                try {
                    File[] fileArrListFiles = file.listFiles();
                    for (int i = 0; i < fileArrListFiles.length; i++) {
                        if (!fileArrListFiles[i].isDirectory() && Math.abs(System.currentTimeMillis() - fileArrListFiles[i].lastModified()) > 1209600) {
                            fileArrListFiles[i].delete();
                        }
                    }
                } catch (Exception e) {
                    x9s.s(e);
                }
                f14239a = 0L;
            }
        }
    }

    public static void f(Context context, byte[] bArr, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        if (bArr == null) {
            x9s.o("cannot save small icon cause bitmap is null");
            return;
        }
        e(context);
        File file = new File(context.getCacheDir().getPath() + File.separator + "mipush_icon");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, qcs.b(str));
        BufferedOutputStream bufferedOutputStream = null;
        try {
            if (!file2.exists()) {
                file2.createNewFile();
            }
            fileOutputStream = new FileOutputStream(file2);
            try {
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                    try {
                        bufferedOutputStream2.write(bArr);
                        bufferedOutputStream2.flush();
                        mgt.b(bufferedOutputStream2);
                    } catch (Exception e) {
                        e = e;
                        bufferedOutputStream = bufferedOutputStream2;
                        x9s.s(e);
                        mgt.b(bufferedOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                        mgt.b(bufferedOutputStream);
                        mgt.b(fileOutputStream);
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
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
        mgt.b(fileOutputStream);
        if (f14239a == 0) {
            f14239a = egt.a(new File(context.getCacheDir().getPath() + File.separator + "mipush_icon")) + file2.length();
        }
    }

    public static Bitmap g(Context context, String str) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        Bitmap bitmap;
        File file = new File(context.getCacheDir().getPath() + File.separator + "mipush_icon", qcs.b(str));
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
                    mgt.b(fileInputStream);
                    return bitmapDecodeStream;
                } catch (Exception e) {
                    e = e;
                    Bitmap bitmap2 = bitmapDecodeStream;
                    fileInputStream2 = fileInputStream;
                    bitmap = bitmap2;
                    x9s.s(e);
                    mgt.b(fileInputStream2);
                    return bitmap;
                } catch (Throwable th2) {
                    th = th2;
                    mgt.b(fileInputStream);
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
