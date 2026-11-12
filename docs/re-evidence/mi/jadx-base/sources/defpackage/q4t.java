package defpackage;

import com.xiaomi.fitness.sleep.disklrucache.AudioDiskLruCache;
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
public final class q4t implements Closeable {
    public static final Pattern o = Pattern.compile(AudioDiskLruCache.STRING_KEY_PATTERN);
    public static final Charset p = Charset.forName("US-ASCII");
    public static final Charset q = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ThreadFactory f31109r;
    public static ThreadPoolExecutor s;
    public static final OutputStream t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f31110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f31111b;
    public final File c;
    public final File d;
    public long f;
    public Writer i;
    public int l;
    public long h = 0;
    public int j = 1000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap<String, f> f31112k = new LinkedHashMap<>(0, 0.75f, true);
    public long m = 0;
    public final Callable<Void> n = new b();
    public final int e = 1;
    public final int g = 1;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f31113a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "disklrucache#" + this.f31113a.getAndIncrement());
        }
    }

    public class b implements Callable<Void> {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void call() throws Exception {
            synchronized (q4t.this) {
                try {
                    if (q4t.this.i == null) {
                        return null;
                    }
                    q4t.this.m0();
                    if (q4t.this.g0()) {
                        q4t.this.f0();
                        q4t.R(q4t.this);
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public class c extends OutputStream {
        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
        }
    }

    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f31115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f31116b;
        public boolean c;
        public boolean d;

        public class a extends FilterOutputStream {
            public /* synthetic */ a(d dVar, OutputStream outputStream, byte b2) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    d.f(d.this);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public final void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    d.f(d.this);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(int i) {
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (IOException unused) {
                    d.f(d.this);
                }
            }

            public a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                } catch (IOException unused) {
                    d.f(d.this);
                }
            }
        }

        public /* synthetic */ d(q4t q4tVar, f fVar, byte b2) {
            this(fVar);
        }

        public static /* synthetic */ boolean f(d dVar) {
            dVar.c = true;
            return true;
        }

        public final OutputStream a() throws IOException {
            FileOutputStream fileOutputStream;
            a aVar;
            if (q4t.this.g <= 0) {
                throw new IllegalArgumentException("Expected index 0 to be greater than 0 and less than the maximum value count of " + q4t.this.g);
            }
            synchronized (q4t.this) {
                try {
                    if (this.f31115a.d != this) {
                        throw new IllegalStateException();
                    }
                    byte b2 = 0;
                    if (!this.f31115a.c) {
                        this.f31116b[0] = true;
                    }
                    File fileH = this.f31115a.h(0);
                    try {
                        fileOutputStream = new FileOutputStream(fileH);
                    } catch (FileNotFoundException unused) {
                        q4t.this.f31110a.mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(fileH);
                        } catch (FileNotFoundException unused2) {
                            return q4t.t;
                        }
                    }
                    aVar = new a(this, fileOutputStream, b2);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return aVar;
        }

        public final void c() throws IOException {
            if (this.c) {
                q4t.this.p(this, false);
                q4t.this.M(this.f31115a.f31120a);
            } else {
                q4t.this.p(this, true);
            }
            this.d = true;
        }

        public final void e() throws IOException {
            q4t.this.p(this, false);
        }

        public d(f fVar) {
            this.f31115a = fVar;
            this.f31116b = fVar.c ? null : new boolean[q4t.this.g];
        }
    }

    public final class e implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f31118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f31119b;
        public final InputStream[] c;
        public final long[] d;

        public /* synthetic */ e(q4t q4tVar, String str, long j, InputStream[] inputStreamArr, long[] jArr, byte b2) {
            this(str, j, inputStreamArr, jArr);
        }

        public final InputStream a() {
            return this.c[0];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (InputStream inputStream : this.c) {
                q4t.m(inputStream);
            }
        }

        public e(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f31118a = str;
            this.f31119b = j;
            this.c = inputStreamArr;
            this.d = jArr;
        }
    }

    public final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f31120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f31121b;
        public boolean c;
        public d d;
        public long e;

        public /* synthetic */ f(q4t q4tVar, String str, byte b2) {
            this(str);
        }

        public static IOException c(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public static /* synthetic */ void f(f fVar, String[] strArr) throws IOException {
            if (strArr.length != q4t.this.g) {
                throw c(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    fVar.f31121b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw c(strArr);
                }
            }
        }

        public static /* synthetic */ boolean g(f fVar) {
            fVar.c = true;
            return true;
        }

        public final File b(int i) {
            return new File(q4t.this.f31110a, this.f31120a + "." + i);
        }

        public final String d() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.f31121b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        public final File h(int i) {
            return new File(q4t.this.f31110a, this.f31120a + "." + i + ".tmp");
        }

        public f(String str) {
            this.f31120a = str;
            this.f31121b = new long[q4t.this.g];
        }
    }

    static {
        a aVar = new a();
        f31109r = aVar;
        s = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), aVar);
        t = new c();
    }

    public q4t(File file, long j) {
        this.f31110a = file;
        this.f31111b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.d = new File(file, "journal.bkp");
        this.f = j;
    }

    public static void E(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: ".concat(String.valueOf(file)));
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                E(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: ".concat(String.valueOf(file2)));
            }
        }
    }

    public static /* synthetic */ int R(q4t q4tVar) {
        q4tVar.l = 0;
        return 0;
    }

    public static void T(String str) {
        if (o.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    public static ThreadPoolExecutor Z() {
        try {
            ThreadPoolExecutor threadPoolExecutor = s;
            if (threadPoolExecutor == null || threadPoolExecutor.isShutdown()) {
                s = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(256), f31109r);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return s;
    }

    public static q4t c(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                o(file2, file3, false);
            }
        }
        q4t q4tVar = new q4t(file, j);
        if (q4tVar.f31111b.exists()) {
            try {
                q4tVar.c0();
                q4tVar.d0();
                q4tVar.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(q4tVar.f31111b, true), p));
                return q4tVar;
            } catch (Throwable unused) {
                q4tVar.P();
            }
        }
        file.mkdirs();
        q4t q4tVar2 = new q4t(file, j);
        q4tVar2.f0();
        return q4tVar2;
    }

    public static void d() {
        ThreadPoolExecutor threadPoolExecutor = s;
        if (threadPoolExecutor == null || threadPoolExecutor.isShutdown()) {
            return;
        }
        s.shutdown();
    }

    public static void m(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void n(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void o(File file, File file2, boolean z) throws IOException {
        if (z) {
            n(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final d D(String str) throws IOException {
        return O(str);
    }

    public final synchronized void K() throws IOException {
        i0();
        m0();
        this.i.flush();
    }

    public final synchronized boolean M(String str) throws IOException {
        try {
            i0();
            T(str);
            f fVar = this.f31112k.get(str);
            if (fVar != null && fVar.d == null) {
                for (int i = 0; i < this.g; i++) {
                    File fileB = fVar.b(i);
                    if (fileB.exists() && !fileB.delete()) {
                        throw new IOException("failed to delete ".concat(String.valueOf(fileB)));
                    }
                    this.h -= fVar.f31121b[i];
                    fVar.f31121b[i] = 0;
                }
                this.l++;
                this.i.append((CharSequence) ("REMOVE " + str + '\n'));
                this.f31112k.remove(str);
                if (g0()) {
                    Z().submit(this.n);
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized d O(String str) throws IOException {
        try {
            i0();
            T(str);
            f fVar = this.f31112k.get(str);
            byte b2 = 0;
            if (fVar == null) {
                fVar = new f(this, str, b2);
                this.f31112k.put(str, fVar);
            } else if (fVar.d != null) {
                return null;
            }
            d dVar = new d(this, fVar, b2);
            fVar.d = dVar;
            this.i.write("DIRTY " + str + '\n');
            this.i.flush();
            return dVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void P() throws IOException {
        close();
        E(this.f31110a);
    }

    public final synchronized e b(String str) throws IOException {
        InputStream inputStream;
        i0();
        T(str);
        f fVar = this.f31112k.get(str);
        if (fVar == null) {
            return null;
        }
        if (!fVar.c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.g];
        for (int i = 0; i < this.g; i++) {
            try {
                inputStreamArr[i] = new FileInputStream(fVar.b(i));
            } catch (FileNotFoundException unused) {
                for (int i2 = 0; i2 < this.g && (inputStream = inputStreamArr[i2]) != null; i2++) {
                    m(inputStream);
                }
                return null;
            }
        }
        this.l++;
        this.i.append((CharSequence) ("READ " + str + '\n'));
        if (g0()) {
            Z().submit(this.n);
        }
        return new e(this, str, fVar.e, inputStreamArr, fVar.f31121b, (byte) 0);
    }

    public final void c0() throws IOException {
        String strSubstring;
        r4t r4tVar = new r4t(new FileInputStream(this.f31111b), p);
        try {
            String strA = r4tVar.a();
            String strA2 = r4tVar.a();
            String strA3 = r4tVar.a();
            String strA4 = r4tVar.a();
            String strA5 = r4tVar.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Integer.toString(this.e).equals(strA3) || !Integer.toString(this.g).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + "]");
            }
            byte b2 = 0;
            int i = 0;
            while (true) {
                try {
                    String strA6 = r4tVar.a();
                    int iIndexOf = strA6.indexOf(32);
                    if (iIndexOf == -1) {
                        throw new IOException("unexpected journal line: ".concat(strA6));
                    }
                    int i2 = iIndexOf + 1;
                    int iIndexOf2 = strA6.indexOf(32, i2);
                    if (iIndexOf2 == -1) {
                        strSubstring = strA6.substring(i2);
                        if (iIndexOf == 6 && strA6.startsWith("REMOVE")) {
                            this.f31112k.remove(strSubstring);
                        }
                        i++;
                    } else {
                        strSubstring = strA6.substring(i2, iIndexOf2);
                    }
                    f fVar = this.f31112k.get(strSubstring);
                    if (fVar == null) {
                        fVar = new f(this, strSubstring, b2);
                        this.f31112k.put(strSubstring, fVar);
                    }
                    if (iIndexOf2 != -1 && iIndexOf == 5 && strA6.startsWith("CLEAN")) {
                        String[] strArrSplit = strA6.substring(iIndexOf2 + 1).split(" ");
                        f.g(fVar);
                        fVar.d = null;
                        f.f(fVar, strArrSplit);
                    } else if (iIndexOf2 == -1 && iIndexOf == 5 && strA6.startsWith("DIRTY")) {
                        fVar.d = new d(this, fVar, b2);
                    } else if (iIndexOf2 != -1 || iIndexOf != 4 || !strA6.startsWith("READ")) {
                        throw new IOException("unexpected journal line: ".concat(strA6));
                    }
                    i++;
                } catch (EOFException unused) {
                    this.l = i - this.f31112k.size();
                    m(r4tVar);
                    return;
                }
            }
        } catch (Throwable th) {
            m(r4tVar);
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        try {
            if (this.i == null) {
                return;
            }
            for (f fVar : new ArrayList(this.f31112k.values())) {
                if (fVar.d != null) {
                    fVar.d.e();
                }
            }
            m0();
            this.i.close();
            this.i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d0() throws IOException {
        n(this.c);
        Iterator<f> it = this.f31112k.values().iterator();
        while (it.hasNext()) {
            f next = it.next();
            int i = 0;
            if (next.d == null) {
                while (i < this.g) {
                    this.h += next.f31121b[i];
                    i++;
                }
            } else {
                next.d = null;
                while (i < this.g) {
                    n(next.b(i));
                    n(next.h(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final synchronized void f0() throws IOException {
        try {
            Writer writer = this.i;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), p));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.e));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.g));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (f fVar : this.f31112k.values()) {
                    if (fVar.d != null) {
                        bufferedWriter.write("DIRTY " + fVar.f31120a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + fVar.f31120a + fVar.d() + '\n');
                    }
                }
                bufferedWriter.close();
                if (this.f31111b.exists()) {
                    o(this.f31111b, this.d, true);
                }
                o(this.c, this.f31111b, false);
                this.d.delete();
                this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f31111b, true), p));
            } catch (Throwable th) {
                bufferedWriter.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean g0() {
        int i = this.l;
        return i >= 2000 && i >= this.f31112k.size();
    }

    public final void i0() {
        if (this.i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0004 A[PHI: r0
      0x0004: PHI (r0v2 int) = (r0v0 int), (r0v1 int) binds: [B:3:0x0002, B:6:0x0008] A[DONT_GENERATE, DONT_INLINE]] */
    public final void l(int i) {
        int i2 = 10;
        if (i < 10) {
            i = i2;
        } else {
            i2 = 10000;
            if (i > 10000) {
                i = i2;
            }
        }
        this.j = i;
    }

    public final void m0() throws IOException {
        while (true) {
            if (this.h <= this.f && this.f31112k.size() <= this.j) {
                return;
            } else {
                M(this.f31112k.entrySet().iterator().next().getKey());
            }
        }
    }

    public final synchronized void p(d dVar, boolean z) throws IOException {
        f fVar = dVar.f31115a;
        if (fVar.d != dVar) {
            throw new IllegalStateException();
        }
        if (z && !fVar.c) {
            for (int i = 0; i < this.g; i++) {
                if (!dVar.f31116b[i]) {
                    dVar.e();
                    throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i)));
                }
                if (!fVar.h(i).exists()) {
                    dVar.e();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.g; i2++) {
            File fileH = fVar.h(i2);
            if (!z) {
                n(fileH);
            } else if (fileH.exists()) {
                File fileB = fVar.b(i2);
                fileH.renameTo(fileB);
                long j = fVar.f31121b[i2];
                long length = fileB.length();
                fVar.f31121b[i2] = length;
                this.h = (this.h - j) + length;
            }
        }
        this.l++;
        fVar.d = null;
        if (fVar.c || z) {
            f.g(fVar);
            this.i.write("CLEAN " + fVar.f31120a + fVar.d() + '\n');
            if (z) {
                long j2 = this.m;
                this.m = 1 + j2;
                fVar.e = j2;
            }
        } else {
            this.f31112k.remove(fVar.f31120a);
            this.i.write("REMOVE " + fVar.f31120a + '\n');
        }
        this.i.flush();
        if (this.h > this.f || g0()) {
            Z().submit(this.n);
        }
    }

    public final File y() {
        return this.f31110a;
    }
}
