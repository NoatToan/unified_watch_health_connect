package com.amap.api.col.p0003sl;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class kq implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Pattern f2962a = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f2963b = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Charset f2964c = Charset.forName("UTF-8");
    static ThreadPoolExecutor d;
    private static final ThreadFactory r;
    private static final OutputStream t;
    private final File e;
    private final File f;
    private final File g;
    private final File h;
    private long j;
    private Writer m;
    private int p;
    private long l = 0;
    private int n = 1000;
    private final LinkedHashMap<String, c> o = new LinkedHashMap<>(0, 0.75f, true);
    private long q = 0;
    private final Callable<Void> s = new Callable<Void>() { // from class: com.amap.api.col.3sl.kq.2
        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (kq.this) {
                if (kq.this.m == null) {
                    return null;
                }
                kq.this.l();
                if (kq.this.j()) {
                    kq.this.i();
                    kq.e(kq.this);
                }
                return null;
            }
        }
    };
    private final int i = 1;
    private final int k = 1;

    static /* synthetic */ int e(kq kqVar) {
        kqVar.p = 0;
        return 0;
    }

    static {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: com.amap.api.col.3sl.kq.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final AtomicInteger f2965a = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "disklrucache#" + this.f2965a.getAndIncrement());
            }
        };
        r = threadFactory;
        d = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        t = new OutputStream() { // from class: com.amap.api.col.3sl.kq.3
            @Override // java.io.OutputStream
            public final void write(int i) throws IOException {
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0004 A[PHI: r0
      0x0004: PHI (r0v2 int) = (r0v0 int), (r0v1 int) binds: [B:3:0x0002, B:6:0x0008] A[DONT_GENERATE, DONT_INLINE]] */
    public final void a(int i) {
        int i2 = 10;
        if (i < 10) {
            i = i2;
        } else {
            i2 = 10000;
            if (i > 10000) {
                i = i2;
            }
        }
        this.n = i;
    }

    public static void a() {
        ThreadPoolExecutor threadPoolExecutor = d;
        if (threadPoolExecutor == null || threadPoolExecutor.isShutdown()) {
            return;
        }
        d.shutdown();
    }

    private static ThreadPoolExecutor f() {
        try {
            ThreadPoolExecutor threadPoolExecutor = d;
            if (threadPoolExecutor == null || threadPoolExecutor.isShutdown()) {
                d = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(256), r);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return d;
    }

    private kq(File file, long j) {
        this.e = file;
        this.f = new File(file, "journal");
        this.g = new File(file, "journal.tmp");
        this.h = new File(file, "journal.bkp");
        this.j = j;
    }

    public static kq a(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                a(file2, file3, false);
            }
        }
        kq kqVar = new kq(file, j);
        if (kqVar.f.exists()) {
            try {
                kqVar.g();
                kqVar.h();
                kqVar.m = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(kqVar.f, true), f2963b));
                return kqVar;
            } catch (Throwable unused) {
                kqVar.d();
            }
        }
        file.mkdirs();
        kq kqVar2 = new kq(file, j);
        kqVar2.i();
        return kqVar2;
    }

    private void g() throws IOException {
        String strSubstring;
        kr krVar = new kr(new FileInputStream(this.f), f2963b);
        try {
            String strA = krVar.a();
            String strA2 = krVar.a();
            String strA3 = krVar.a();
            String strA4 = krVar.a();
            String strA5 = krVar.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Integer.toString(this.i).equals(strA3) || !Integer.toString(this.k).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + "]");
            }
            byte b2 = 0;
            int i = 0;
            while (true) {
                try {
                    String strA6 = krVar.a();
                    int iIndexOf = strA6.indexOf(32);
                    if (iIndexOf == -1) {
                        throw new IOException("unexpected journal line: ".concat(String.valueOf(strA6)));
                    }
                    int i2 = iIndexOf + 1;
                    int iIndexOf2 = strA6.indexOf(32, i2);
                    if (iIndexOf2 == -1) {
                        strSubstring = strA6.substring(i2);
                        if (iIndexOf == 6 && strA6.startsWith("REMOVE")) {
                            this.o.remove(strSubstring);
                        }
                        i++;
                    } else {
                        strSubstring = strA6.substring(i2, iIndexOf2);
                    }
                    c cVar = this.o.get(strSubstring);
                    if (cVar == null) {
                        cVar = new c(this, strSubstring, b2);
                        this.o.put(strSubstring, cVar);
                    }
                    if (iIndexOf2 != -1 && iIndexOf == 5 && strA6.startsWith("CLEAN")) {
                        String[] strArrSplit = strA6.substring(iIndexOf2 + 1).split(" ");
                        c.a(cVar);
                        cVar.e = null;
                        c.a(cVar, strArrSplit);
                    } else if (iIndexOf2 == -1 && iIndexOf == 5 && strA6.startsWith("DIRTY")) {
                        cVar.e = new a(this, cVar, b2);
                    } else if (iIndexOf2 != -1 || iIndexOf != 4 || !strA6.startsWith("READ")) {
                        throw new IOException("unexpected journal line: ".concat(String.valueOf(strA6)));
                    }
                    i++;
                } catch (EOFException unused) {
                    this.p = i - this.o.size();
                    a(krVar);
                    return;
                }
            }
        } catch (Throwable th) {
            a(krVar);
            throw th;
        }
    }

    private void h() throws IOException {
        a(this.g);
        Iterator<c> it = this.o.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            int i = 0;
            if (next.e == null) {
                while (i < this.k) {
                    this.l += next.f2976c[i];
                    i++;
                }
            } else {
                next.e = null;
                while (i < this.k) {
                    a(next.a(i));
                    a(next.b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() throws IOException {
        synchronized (this) {
            try {
                Writer writer = this.m;
                if (writer != null) {
                    writer.close();
                }
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.g), f2963b));
                try {
                    bufferedWriter.write("libcore.io.DiskLruCache");
                    bufferedWriter.write("\n");
                    bufferedWriter.write("1");
                    bufferedWriter.write("\n");
                    bufferedWriter.write(Integer.toString(this.i));
                    bufferedWriter.write("\n");
                    bufferedWriter.write(Integer.toString(this.k));
                    bufferedWriter.write("\n");
                    bufferedWriter.write("\n");
                    for (c cVar : this.o.values()) {
                        if (cVar.e != null) {
                            bufferedWriter.write("DIRTY " + cVar.f2975b + '\n');
                        } else {
                            bufferedWriter.write("CLEAN " + cVar.f2975b + cVar.a() + '\n');
                        }
                    }
                    bufferedWriter.close();
                    if (this.f.exists()) {
                        a(this.f, this.h, true);
                    }
                    a(this.g, this.f, false);
                    this.h.delete();
                    this.m = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f, true), f2963b));
                } catch (Throwable th) {
                    bufferedWriter.close();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void a(File file, File file2, boolean z) throws IOException {
        if (z) {
            a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final b a(String str) throws IOException {
        InputStream inputStream;
        synchronized (this) {
            k();
            e(str);
            c cVar = this.o.get(str);
            if (cVar == null) {
                return null;
            }
            if (!cVar.d) {
                return null;
            }
            InputStream[] inputStreamArr = new InputStream[this.k];
            for (int i = 0; i < this.k; i++) {
                try {
                    inputStreamArr[i] = new FileInputStream(cVar.a(i));
                } catch (FileNotFoundException unused) {
                    for (int i2 = 0; i2 < this.k && (inputStream = inputStreamArr[i2]) != null; i2++) {
                        a(inputStream);
                    }
                    return null;
                }
            }
            this.p++;
            this.m.append((CharSequence) ("READ " + str + '\n'));
            if (j()) {
                f().submit(this.s);
            }
            return new b(this, str, cVar.f, inputStreamArr, cVar.f2976c, (byte) 0);
        }
    }

    public final a b(String str) throws IOException {
        return d(str);
    }

    private a d(String str) throws IOException {
        synchronized (this) {
            k();
            e(str);
            c cVar = this.o.get(str);
            byte b2 = 0;
            if (cVar == null) {
                cVar = new c(this, str, b2);
                this.o.put(str, cVar);
            } else if (cVar.e != null) {
                return null;
            }
            a aVar = new a(this, cVar, b2);
            cVar.e = aVar;
            this.m.write("DIRTY " + str + '\n');
            this.m.flush();
            return aVar;
        }
    }

    public final File b() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a aVar, boolean z) throws IOException {
        synchronized (this) {
            c cVar = aVar.f2968b;
            if (cVar.e != aVar) {
                throw new IllegalStateException();
            }
            if (z && !cVar.d) {
                for (int i = 0; i < this.k; i++) {
                    if (!aVar.f2969c[i]) {
                        aVar.c();
                        throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i)));
                    }
                    if (!cVar.b(i).exists()) {
                        aVar.c();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < this.k; i2++) {
                File fileB = cVar.b(i2);
                if (z) {
                    if (fileB.exists()) {
                        File fileA = cVar.a(i2);
                        fileB.renameTo(fileA);
                        long j = cVar.f2976c[i2];
                        long length = fileA.length();
                        cVar.f2976c[i2] = length;
                        this.l = (this.l - j) + length;
                    }
                } else {
                    a(fileB);
                }
            }
            this.p++;
            cVar.e = null;
            if (cVar.d | z) {
                c.a(cVar);
                this.m.write("CLEAN " + cVar.f2975b + cVar.a() + '\n');
                if (z) {
                    long j2 = this.q;
                    this.q = 1 + j2;
                    cVar.f = j2;
                }
            } else {
                this.o.remove(cVar.f2975b);
                this.m.write("REMOVE " + cVar.f2975b + '\n');
            }
            this.m.flush();
            if (this.l > this.j || j()) {
                f().submit(this.s);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j() {
        int i = this.p;
        return i >= 2000 && i >= this.o.size();
    }

    public final boolean c(String str) throws IOException {
        synchronized (this) {
            k();
            e(str);
            c cVar = this.o.get(str);
            if (cVar != null && cVar.e == null) {
                for (int i = 0; i < this.k; i++) {
                    File fileA = cVar.a(i);
                    if (fileA.exists() && !fileA.delete()) {
                        throw new IOException("failed to delete ".concat(String.valueOf(fileA)));
                    }
                    this.l -= cVar.f2976c[i];
                    cVar.f2976c[i] = 0;
                }
                this.p++;
                this.m.append((CharSequence) ("REMOVE " + str + '\n'));
                this.o.remove(str);
                if (j()) {
                    f().submit(this.s);
                }
                return true;
            }
            return false;
        }
    }

    private void k() {
        if (this.m == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final void c() throws IOException {
        synchronized (this) {
            k();
            l();
            this.m.flush();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this) {
            if (this.m == null) {
                return;
            }
            for (c cVar : new ArrayList(this.o.values())) {
                if (cVar.e != null) {
                    cVar.e.c();
                }
            }
            l();
            this.m.close();
            this.m = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() throws IOException {
        while (true) {
            if (this.l <= this.j && this.o.size() <= this.n) {
                return;
            } else {
                c(this.o.entrySet().iterator().next().getKey());
            }
        }
    }

    public final void d() throws IOException {
        close();
        b(this.e);
    }

    private static void e(String str) {
        if (f2962a.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    public final class b implements Closeable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f2972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f2973c;
        private final InputStream[] d;
        private final long[] e;

        /* synthetic */ b(kq kqVar, String str, long j, InputStream[] inputStreamArr, long[] jArr, byte b2) {
            this(str, j, inputStreamArr, jArr);
        }

        private b(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f2972b = str;
            this.f2973c = j;
            this.d = inputStreamArr;
            this.e = jArr;
        }

        public final InputStream a() {
            return this.d[0];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (InputStream inputStream : this.d) {
                kq.a(inputStream);
            }
        }
    }

    public final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f2968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean[] f2969c;
        private boolean d;
        private boolean e;

        /* synthetic */ a(kq kqVar, c cVar, byte b2) {
            this(cVar);
        }

        static /* synthetic */ boolean c(a aVar) {
            aVar.d = true;
            return true;
        }

        private a(c cVar) {
            this.f2968b = cVar;
            this.f2969c = cVar.d ? null : new boolean[kq.this.k];
        }

        public final OutputStream a() throws IOException {
            FileOutputStream fileOutputStream;
            C0030a c0030a;
            if (kq.this.k <= 0) {
                throw new IllegalArgumentException("Expected index 0 to be greater than 0 and less than the maximum value count of " + kq.this.k);
            }
            synchronized (kq.this) {
                if (this.f2968b.e != this) {
                    throw new IllegalStateException();
                }
                byte b2 = 0;
                if (!this.f2968b.d) {
                    this.f2969c[0] = true;
                }
                File fileB = this.f2968b.b(0);
                try {
                    fileOutputStream = new FileOutputStream(fileB);
                } catch (FileNotFoundException unused) {
                    kq.this.e.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(fileB);
                    } catch (FileNotFoundException unused2) {
                        return kq.t;
                    }
                }
                c0030a = new C0030a(this, fileOutputStream, b2);
            }
            return c0030a;
        }

        public final void b() throws IOException {
            if (this.d) {
                kq.this.a(this, false);
                kq.this.c(this.f2968b.f2975b);
            } else {
                kq.this.a(this, true);
            }
            this.e = true;
        }

        public final void c() throws IOException {
            kq.this.a(this, false);
        }

        /* JADX INFO: renamed from: com.amap.api.col.3sl.kq$a$a, reason: collision with other inner class name */
        final class C0030a extends FilterOutputStream {
            /* synthetic */ C0030a(a aVar, OutputStream outputStream, byte b2) {
                this(outputStream);
            }

            private C0030a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    a.c(a.this);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    a.c(a.this);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    a.c(a.this);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public final void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    a.c(a.this);
                }
            }
        }
    }

    private static void b(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: ".concat(String.valueOf(file)));
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                b(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: ".concat(String.valueOf(file2)));
            }
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f2975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long[] f2976c;
        private boolean d;
        private a e;
        private long f;

        /* synthetic */ c(kq kqVar, String str, byte b2) {
            this(str);
        }

        static /* synthetic */ boolean a(c cVar) {
            cVar.d = true;
            return true;
        }

        private c(String str) {
            this.f2975b = str;
            this.f2976c = new long[kq.this.k];
        }

        public final String a() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.f2976c) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        private static IOException a(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final File a(int i) {
            return new File(kq.this.e, this.f2975b + "." + i);
        }

        public final File b(int i) {
            return new File(kq.this.e, this.f2975b + "." + i + ".tmp");
        }

        static /* synthetic */ void a(c cVar, String[] strArr) throws IOException {
            if (strArr.length != kq.this.k) {
                throw a(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    cVar.f2976c[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw a(strArr);
                }
            }
        }
    }
}
