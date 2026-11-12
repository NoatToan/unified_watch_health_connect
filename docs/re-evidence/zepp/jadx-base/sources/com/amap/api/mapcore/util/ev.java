package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.xiaomi.infra.galaxy.fds.android.FDSClientConfiguration;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ev {
    private static final Bitmap.CompressFormat a = Bitmap.CompressFormat.PNG;
    private ih b;
    private ed<String, Bitmap> c;
    private a d;
    private final Object e = new Object();
    private boolean f = true;
    private HashMap<String, WeakReference<Bitmap>> g;

    private ev(a aVar) {
        this.d = aVar;
        if (aVar.f) {
            if (Build.VERSION.SDK_INT >= 11) {
                this.g = new HashMap<>(64);
            }
            this.c = new ed<String, Bitmap>(this.d.a) { // from class: com.amap.api.mapcore.util.ev.1
                @Override // com.amap.api.mapcore.util.ed
                public final /* synthetic */ int b(Bitmap bitmap) {
                    int iA = ev.a(bitmap);
                    if (iA == 0) {
                        return 1;
                    }
                    return iA;
                }

                @Override // com.amap.api.mapcore.util.ed
                public final /* synthetic */ void b(String str, Bitmap bitmap) {
                    String str2 = str;
                    Bitmap bitmap2 = bitmap;
                    if (!er.d() || ev.this.g == null || bitmap2 == null || bitmap2.isRecycled()) {
                        return;
                    }
                    ev.this.g.put(str2, new WeakReference(bitmap2));
                }
            };
        }
        if (aVar.h) {
            a();
        }
    }

    private static boolean e() {
        if (er.c()) {
            return Environment.isExternalStorageRemovable();
        }
        return true;
    }

    public final Bitmap b(String str) {
        Bitmap bitmap;
        InputStream inputStreamA;
        Bitmap bitmap2;
        String strC = c(str);
        synchronized (this.e) {
            while (this.f) {
                this.e.wait();
            }
            ih ihVar = this.b;
            bitmap = null;
            bitmap = null;
            bitmap = null;
            bitmap = null;
            Bitmap bitmapA = null;
            InputStream inputStream = null;
            if (ihVar != null) {
                try {
                    ih.b bVarA = ihVar.a(strC);
                    if (bVarA != null) {
                        inputStreamA = bVarA.a();
                        if (inputStreamA != null) {
                            try {
                                bitmapA = et.a(((FileInputStream) inputStreamA).getFD());
                            } catch (Throwable unused) {
                                if (inputStreamA != null) {
                                    try {
                                        inputStreamA.close();
                                    } catch (Throwable unused2) {
                                    }
                                }
                            }
                        }
                        Bitmap bitmap3 = bitmapA;
                        inputStream = inputStreamA;
                        bitmap2 = bitmap3;
                    } else {
                        bitmap2 = null;
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    bitmap = bitmap2;
                } catch (Throwable unused4) {
                    inputStreamA = null;
                }
            }
        }
        return bitmap;
    }

    public final void c() {
        synchronized (this.e) {
            ih ihVar = this.b;
            if (ihVar != null) {
                try {
                    ihVar.d();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static ev a(a aVar) {
        return new ev(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045 A[Catch: all -> 0x004f, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0007, B:23:0x0045, B:24:0x004d, B:8:0x000d, B:17:0x002d, B:22:0x0040, B:20:0x0039), top: B:35:0x0003, inners: #0 }] */
    public final void a() {
        synchronized (this.e) {
            ih ihVar = this.b;
            if (ihVar == null || ihVar.c()) {
                a aVar = this.d;
                File file = aVar.c;
                if (aVar.g && file != null) {
                    try {
                        if (file.exists()) {
                            if (this.d.i) {
                                a(file);
                                file.mkdir();
                            }
                        } else {
                            file.mkdirs();
                        }
                    } catch (Throwable unused) {
                    }
                    long jB = b(file);
                    long j = this.d.b;
                    if (jB > j) {
                        try {
                            this.b = ih.a(file, j);
                        } catch (Throwable unused2) {
                            this.d.c = null;
                        }
                        this.f = false;
                        this.e.notifyAll();
                    } else {
                        this.f = false;
                        this.e.notifyAll();
                    }
                } else {
                    this.f = false;
                    this.e.notifyAll();
                }
            } else {
                this.f = false;
                this.e.notifyAll();
            }
            throw th;
        }
    }

    private static String c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes("utf-8"));
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Throwable unused) {
            return String.valueOf(str.hashCode());
        }
    }

    public static class a {
        public File c;
        public String j;
        public int a = FDSClientConfiguration.DEFAULT_UPLOAD_PART_SIZE;
        public long b = 10485760;
        public Bitmap.CompressFormat d = ev.a;
        public int e = 100;
        public boolean f = true;
        public boolean g = true;
        public boolean h = false;
        public boolean i = true;

        public a(Context context, String str) {
            this.j = null;
            this.j = str;
            this.c = ev.a(context, str, null);
        }

        public a(Context context, String str, String str2) {
            this.j = null;
            this.j = str;
            this.c = ev.a(context, str, str2);
        }
    }

    public final void b() {
        HashMap<String, WeakReference<Bitmap>> map;
        if (er.d() && (map = this.g) != null) {
            map.clear();
        }
        ed<String, Bitmap> edVar = this.c;
        if (edVar != null) {
            edVar.a();
        }
        synchronized (this.e) {
            this.f = true;
            ih ihVar = this.b;
            if (ihVar != null && !ihVar.c()) {
                try {
                    this.b.close();
                    a(a(t.a, this.d.j, null));
                } catch (Throwable unused) {
                }
                this.b = null;
                a();
            }
        }
    }

    private void a(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    a(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: ".concat(String.valueOf(file2)));
                }
            }
            return;
        }
        throw new IOException("not a readable directory: ".concat(String.valueOf(file)));
    }

    public final void a(String str, Bitmap bitmap) {
        if (str == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        ed<String, Bitmap> edVar = this.c;
        if (edVar != null) {
            edVar.a(str, bitmap);
        }
        synchronized (this.e) {
            if (this.b != null) {
                String strC = c(str);
                OutputStream outputStreamA = null;
                try {
                    ih.b bVarA = this.b.a(strC);
                    if (bVarA == null) {
                        ih.a aVarB = this.b.b(strC);
                        if (aVarB != null) {
                            outputStreamA = aVarB.a();
                            a aVar = this.d;
                            bitmap.compress(aVar.d, aVar.e, outputStreamA);
                            aVarB.b();
                            outputStreamA.close();
                        }
                    } else {
                        bVarA.a().close();
                    }
                    if (outputStreamA != null) {
                        try {
                            outputStreamA.close();
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                    if (0 != 0) {
                    }
                }
            }
        }
    }

    private static long b(File file) {
        if (er.c()) {
            return file.getUsableSpace();
        }
        StatFs statFs = new StatFs(file.getPath());
        return ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
    }

    public final Bitmap a(String str) {
        Bitmap bitmapA;
        ed<String, Bitmap> edVar;
        HashMap<String, WeakReference<Bitmap>> map;
        WeakReference<Bitmap> weakReference;
        if (!er.d() || (map = this.g) == null || (weakReference = map.get(str)) == null) {
            bitmapA = null;
        } else {
            bitmapA = weakReference.get();
            if (bitmapA == null || bitmapA.isRecycled()) {
                bitmapA = null;
            }
            this.g.remove(str);
        }
        if (bitmapA == null && (edVar = this.c) != null) {
            bitmapA = edVar.a(str);
        }
        if (bitmapA == null || bitmapA.isRecycled()) {
            return null;
        }
        return bitmapA;
    }

    public final void a(boolean z) {
        HashMap<String, WeakReference<Bitmap>> map;
        if (er.d() && (map = this.g) != null) {
            map.clear();
        }
        ed<String, Bitmap> edVar = this.c;
        if (edVar != null) {
            edVar.a();
        }
        synchronized (this.e) {
            ih ihVar = this.b;
            if (ihVar != null) {
                try {
                    if (!ihVar.c()) {
                        if (z) {
                            this.b.e();
                        } else {
                            this.b.close();
                        }
                        this.b = null;
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static File a(Context context, String str, String str2) {
        String path;
        File fileA = a(context);
        if (("mounted".equals(Environment.getExternalStorageState()) || !e()) && fileA != null) {
            path = fileA.getPath();
        } else {
            path = context.getCacheDir().getPath();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(path);
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str);
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str3);
            sb.append(str2);
        }
        return new File(sb.toString());
    }

    public static int a(Bitmap bitmap) {
        if (er.e()) {
            return bitmap.getByteCount();
        }
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    private static File a(Context context) {
        try {
            if (er.b()) {
                return context.getExternalCacheDir();
            }
            return new File(Environment.getExternalStorageDirectory().getPath() + ("/Android/data/" + context.getPackageName() + "/cache/"));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
