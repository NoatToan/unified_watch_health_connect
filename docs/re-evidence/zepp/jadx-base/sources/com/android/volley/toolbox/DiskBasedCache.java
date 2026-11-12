package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.Cache;
import com.android.volley.VolleyLog;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class DiskBasedCache implements Cache {
    private static final int e = 5242880;
    private static final float f = 0.9f;
    private static final int g = 538247942;
    private final Map<String, b> a;
    private long b;
    private final File c;
    private final int d;

    public static class b {
        public long a;
        public String b;
        public String c;
        public long d;
        public long e;
        public long f;
        public long g;
        public Map<String, String> h;

        private b() {
        }

        public static b a(InputStream inputStream) throws IOException {
            b bVar = new b();
            if (DiskBasedCache.e(inputStream) != DiskBasedCache.g) {
                throw new IOException();
            }
            bVar.b = DiskBasedCache.g(inputStream);
            String strG = DiskBasedCache.g(inputStream);
            bVar.c = strG;
            if (strG.equals("")) {
                bVar.c = null;
            }
            bVar.d = DiskBasedCache.f(inputStream);
            bVar.e = DiskBasedCache.f(inputStream);
            bVar.f = DiskBasedCache.f(inputStream);
            bVar.g = DiskBasedCache.f(inputStream);
            bVar.h = DiskBasedCache.h(inputStream);
            return bVar;
        }

        public Cache.Entry b(byte[] bArr) {
            Cache.Entry entry = new Cache.Entry();
            entry.data = bArr;
            entry.etag = this.c;
            entry.serverDate = this.d;
            entry.lastModified = this.e;
            entry.ttl = this.f;
            entry.softTtl = this.g;
            entry.responseHeaders = this.h;
            return entry;
        }

        public boolean c(OutputStream outputStream) {
            try {
                DiskBasedCache.k(outputStream, DiskBasedCache.g);
                DiskBasedCache.m(outputStream, this.b);
                String str = this.c;
                if (str == null) {
                    str = "";
                }
                DiskBasedCache.m(outputStream, str);
                DiskBasedCache.l(outputStream, this.d);
                DiskBasedCache.l(outputStream, this.e);
                DiskBasedCache.l(outputStream, this.f);
                DiskBasedCache.l(outputStream, this.g);
                DiskBasedCache.n(this.h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e) {
                VolleyLog.d("%s", e.toString());
                return false;
            }
        }

        public b(String str, Cache.Entry entry) {
            this.b = str;
            this.a = entry.data.length;
            this.c = entry.etag;
            this.d = entry.serverDate;
            this.e = entry.lastModified;
            this.f = entry.ttl;
            this.g = entry.softTtl;
            this.h = entry.responseHeaders;
        }
    }

    public static class c extends FilterInputStream {
        private int a;

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i = super.read();
            if (i != -1) {
                this.a++;
            }
            return i;
        }

        private c(InputStream inputStream) {
            super(inputStream);
            this.a = 0;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = super.read(bArr, i, i2);
            if (i3 != -1) {
                this.a += i3;
            }
            return i3;
        }
    }

    public DiskBasedCache(File file, int i) {
        this.a = new LinkedHashMap(16, 0.75f, true);
        this.b = 0L;
        this.c = file;
        this.d = i;
    }

    private String a(String str) {
        int length = str.length() / 2;
        return String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode());
    }

    private void b(int i) {
        long j = i;
        if (this.b + j < this.d) {
            return;
        }
        if (VolleyLog.DEBUG) {
            VolleyLog.v("Pruning old cache entries.", new Object[0]);
        }
        long j2 = this.b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator<Map.Entry<String, b>> it2 = this.a.entrySet().iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            b value = it2.next().getValue();
            if (getFileForKey(value.b).delete()) {
                this.b -= value.a;
            } else {
                String str = value.b;
                VolleyLog.d("Could not delete cache entry for key=%s, filename=%s", str, a(str));
            }
            it2.remove();
            i2++;
            if (this.b + j < this.d * 0.9f) {
                break;
            } else {
                j = j;
            }
        }
        if (VolleyLog.DEBUG) {
            VolleyLog.v("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.b - j2), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
    }

    private void c(String str, b bVar) {
        if (this.a.containsKey(str)) {
            this.b += bVar.a - this.a.get(str).a;
        } else {
            this.b += bVar.a;
        }
        this.a.put(str, bVar);
    }

    private static int d(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException();
    }

    public static int e(InputStream inputStream) throws IOException {
        return (d(inputStream) << 24) | (d(inputStream) << 0) | 0 | (d(inputStream) << 8) | (d(inputStream) << 16);
    }

    public static long f(InputStream inputStream) throws IOException {
        return ((((long) d(inputStream)) & 255) << 0) | 0 | ((((long) d(inputStream)) & 255) << 8) | ((((long) d(inputStream)) & 255) << 16) | ((((long) d(inputStream)) & 255) << 24) | ((((long) d(inputStream)) & 255) << 32) | ((((long) d(inputStream)) & 255) << 40) | ((((long) d(inputStream)) & 255) << 48) | ((255 & ((long) d(inputStream))) << 56);
    }

    public static String g(InputStream inputStream) throws IOException {
        return new String(j(inputStream, (int) f(inputStream)), "UTF-8");
    }

    public static Map<String, String> h(InputStream inputStream) throws IOException {
        int iE = e(inputStream);
        Map<String, String> mapEmptyMap = iE == 0 ? Collections.emptyMap() : new HashMap<>(iE);
        for (int i = 0; i < iE; i++) {
            mapEmptyMap.put(g(inputStream).intern(), g(inputStream).intern());
        }
        return mapEmptyMap;
    }

    private void i(String str) {
        b bVar = this.a.get(str);
        if (bVar != null) {
            this.b -= bVar.a;
            this.a.remove(str);
        }
    }

    private static byte[] j(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                break;
            }
            i2 += i3;
        }
        if (i2 == i) {
            return bArr;
        }
        throw new IOException("Expected " + i + " bytes, read " + i2 + " bytes");
    }

    public static void k(OutputStream outputStream, int i) throws IOException {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    public static void l(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) (j >>> 0));
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    public static void m(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        l(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    public static void n(Map<String, String> map, OutputStream outputStream) throws IOException {
        if (map == null) {
            k(outputStream, 0);
            return;
        }
        k(outputStream, map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            m(outputStream, entry.getKey());
            m(outputStream, entry.getValue());
        }
    }

    @Override // com.android.volley.Cache
    public synchronized void clear() {
        File[] fileArrListFiles = this.c.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                file.delete();
            }
        }
        this.a.clear();
        this.b = 0L;
        VolleyLog.d("Cache cleared.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.volley.Cache
    public synchronized Cache.Entry get(String str) {
        c cVar;
        b bVar = this.a.get(str);
        FilterInputStream filterInputStream = null;
        Object[] objArr = 0;
        if (bVar == null) {
            return null;
        }
        try {
            File fileForKey = getFileForKey(str);
            try {
                cVar = new c(new BufferedInputStream(new FileInputStream(fileForKey)));
                try {
                    b.a(cVar);
                    Cache.Entry entryB = bVar.b(j(cVar, (int) (fileForKey.length() - ((long) cVar.a))));
                    try {
                        cVar.close();
                        return entryB;
                    } catch (IOException unused) {
                        return null;
                    }
                } catch (IOException e2) {
                    e = e2;
                    VolleyLog.d("%s: %s", fileForKey.getAbsolutePath(), e.toString());
                    remove(str);
                    if (cVar != null) {
                        try {
                            cVar.close();
                        } catch (IOException unused2) {
                            return null;
                        }
                    }
                    return null;
                }
            } catch (IOException e3) {
                e = e3;
                cVar = null;
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    try {
                        filterInputStream.close();
                    } catch (IOException unused3) {
                        return null;
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public File getFileForKey(String str) {
        return new File(this.c, a(str));
    }

    @Override // com.android.volley.Cache
    public synchronized void initialize() {
        if (!this.c.exists()) {
            if (!this.c.mkdirs()) {
                VolleyLog.e("Unable to create cache dir %s", this.c.getAbsolutePath());
            }
            return;
        }
        File[] fileArrListFiles = this.c.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            BufferedInputStream bufferedInputStream = null;
            try {
                try {
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                    try {
                        b bVarA = b.a(bufferedInputStream2);
                        bVarA.a = file.length();
                        c(bVarA.b, bVarA);
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException unused) {
                        }
                    } catch (IOException unused2) {
                        bufferedInputStream = bufferedInputStream2;
                        if (file != null) {
                            file.delete();
                        }
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused4) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // com.android.volley.Cache
    public synchronized void invalidate(String str, boolean z) {
        Cache.Entry entry = get(str);
        if (entry != null) {
            entry.softTtl = 0L;
            if (z) {
                entry.ttl = 0L;
            }
            put(str, entry);
        }
    }

    @Override // com.android.volley.Cache
    public synchronized void put(String str, Cache.Entry entry) {
        b(entry.data.length);
        File fileForKey = getFileForKey(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileForKey));
            b bVar = new b(str, entry);
            if (!bVar.c(bufferedOutputStream)) {
                bufferedOutputStream.close();
                VolleyLog.d("Failed to write header for %s", fileForKey.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(entry.data);
            bufferedOutputStream.close();
            c(str, bVar);
        } catch (IOException unused) {
            if (fileForKey.delete()) {
                return;
            }
            VolleyLog.d("Could not clean up file %s", fileForKey.getAbsolutePath());
        }
    }

    @Override // com.android.volley.Cache
    public synchronized void remove(String str) {
        boolean zDelete = getFileForKey(str).delete();
        i(str);
        if (!zDelete) {
            VolleyLog.d("Could not delete cache entry for key=%s, filename=%s", str, a(str));
        }
    }

    public DiskBasedCache(File file) {
        this(file, 5242880);
    }
}
