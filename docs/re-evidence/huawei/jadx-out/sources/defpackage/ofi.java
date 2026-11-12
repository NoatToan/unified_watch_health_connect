package defpackage;

import health.compact.a.LogUtil;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class ofi implements Closeable, Flushable {
    static final Pattern e = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final File f44275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f44276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f44277c;
    BufferedSink d;
    final ofk f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    private final int l;
    int n;
    private final File o;
    private final Executor p;
    private final File r;
    private final long s;
    private final File x;
    private long q = 0;
    final LinkedHashMap<String, c> m = new LinkedHashMap<>(0, 0.75f, true);
    private long t = 0;
    private final Runnable k = new a();

    ofi(ofk ofkVar, File file, int i, int i2, long j, Executor executor) {
        this.r = new File(file, "health-journal");
        this.f = ofkVar;
        this.x = new File(file, "health-journal.tmp");
        this.f44275a = file;
        this.o = new File(file, "health-journal.bkp");
        this.l = i;
        this.f44277c = i2;
        this.s = j;
        this.p = executor;
    }

    public static ofi c(ofk ofkVar, File file, int i, int i2, long j) {
        if (j <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0 or valueCount <= 0");
        }
        return new ofi(ofkVar, file, i, i2, j, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: ofh
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return ofi.b(runnable);
            }
        }));
    }

    static /* synthetic */ Thread b(Runnable runnable) {
        Thread thread = new Thread(runnable, "HealthDiskLruCache");
        thread.setDaemon(true);
        return thread;
    }

    private BufferedSink g() throws FileNotFoundException {
        return Okio.buffer(new off(a(this.r)) { // from class: ofi.1
            @Override // defpackage.off
            protected void b(IOException iOException) {
                ofi.this.j = true;
            }
        });
    }

    private void f() throws IOException {
        this.f.b(this.x);
        Iterator<c> it = this.m.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            int i = 0;
            if (next.f44280b == null) {
                while (i < this.f44277c) {
                    this.q += next.f44281c[i];
                    i++;
                }
            } else {
                next.f44280b = null;
                while (i < this.f44277c) {
                    this.f.b(next.d[i]);
                    this.f.b(next.f44279a[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    public e b(String str) throws IOException {
        synchronized (this) {
            i();
            j();
            d(str);
            c cVar = this.m.get(str);
            if (cVar != null && cVar.i) {
                e eVarE = cVar.e();
                if (eVarE == null) {
                    return null;
                }
                this.n++;
                this.d.writeUtf8("READ").writeByte(32).writeUtf8(str).writeByte(10);
                if (a()) {
                    this.p.execute(this.k);
                }
                return eVarE;
            }
            return null;
        }
    }

    public d a(String str) throws IOException {
        return c(str, -1L);
    }

    void d() throws IOException {
        synchronized (this) {
            BufferedSink bufferedSink = this.d;
            if (bufferedSink != null) {
                bufferedSink.close();
            }
            BufferedSink bufferedSinkBuffer = Okio.buffer(this.f.d(this.x));
            try {
                bufferedSinkBuffer.writeUtf8("libcore.io.HealthDiskLruCache").writeByte(10);
                bufferedSinkBuffer.writeUtf8("1").writeByte(10);
                bufferedSinkBuffer.writeDecimalLong(this.l).writeByte(10);
                bufferedSinkBuffer.writeDecimalLong(this.f44277c).writeByte(10);
                bufferedSinkBuffer.writeByte(10);
                for (c cVar : this.m.values()) {
                    if (cVar.f44280b != null) {
                        bufferedSinkBuffer.writeUtf8("DIRTY").writeByte(32);
                        bufferedSinkBuffer.writeUtf8(cVar.e);
                        bufferedSinkBuffer.writeByte(10);
                    } else {
                        bufferedSinkBuffer.writeUtf8("CLEAN").writeByte(32);
                        bufferedSinkBuffer.writeUtf8(cVar.e);
                        cVar.b(bufferedSinkBuffer);
                        bufferedSinkBuffer.writeByte(10);
                    }
                }
                if (bufferedSinkBuffer != null) {
                    bufferedSinkBuffer.close();
                }
                if (this.r.exists()) {
                    this.f.e(this.r, this.o);
                }
                this.f.e(this.x, this.r);
                this.f.b(this.o);
                this.d = g();
                this.j = false;
                this.i = false;
            } catch (Throwable th) {
                if (bufferedSinkBuffer != null) {
                    try {
                        bufferedSinkBuffer.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    d c(String str, long j) throws IOException {
        synchronized (this) {
            i();
            j();
            d(str);
            c cVar = this.m.get(str);
            if (j != -1 && (cVar == null || cVar.g != j)) {
                return null;
            }
            if (cVar != null && cVar.f44280b != null) {
                return null;
            }
            if (!this.g && !this.i) {
                this.d.writeUtf8("DIRTY").writeByte(32).writeUtf8(str).writeByte(10);
                this.d.flush();
                if (this.j) {
                    return null;
                }
                if (cVar == null) {
                    cVar = new c(str);
                    this.m.put(str, cVar);
                }
                d dVar = new d(cVar);
                cVar.f44280b = dVar;
                return dVar;
            }
            this.p.execute(this.k);
            return null;
        }
    }

    void e(d dVar, boolean z) throws IOException {
        synchronized (this) {
            c cVar = dVar.d;
            if (cVar.f44280b != dVar) {
                throw new IllegalStateException();
            }
            if (z && !cVar.i) {
                for (int i = 0; i < this.f44277c; i++) {
                    if (!dVar.f44283c[i]) {
                        dVar.e();
                        throw new IllegalStateException("Newly created innerEntry didn't create value for index " + i);
                    }
                    if (!cVar.f44279a[i].exists()) {
                        dVar.e();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < this.f44277c; i2++) {
                File file = cVar.f44279a[i2];
                if (z) {
                    if (file.exists()) {
                        File file2 = cVar.d[i2];
                        this.f.e(file, file2);
                        long j = cVar.f44281c[i2];
                        long length = file2.length();
                        cVar.f44281c[i2] = length;
                        this.q = (this.q - j) + length;
                    }
                } else {
                    this.f.b(file);
                }
            }
            this.n++;
            cVar.f44280b = null;
            if (cVar.i | z) {
                cVar.i = true;
                this.d.writeUtf8("CLEAN").writeByte(32);
                this.d.writeUtf8(cVar.e);
                cVar.b(this.d);
                this.d.writeByte(10);
                if (z) {
                    long j2 = this.t;
                    this.t = 1 + j2;
                    cVar.g = j2;
                }
            } else {
                this.m.remove(cVar.e);
                this.d.writeUtf8("REMOVE").writeByte(32);
                this.d.writeUtf8(cVar.e);
                this.d.writeByte(10);
            }
            this.d.flush();
            if (this.q > this.s || a()) {
                this.p.execute(this.k);
            }
        }
    }

    boolean a() {
        int i = this.n;
        return i >= 2000 && i >= this.m.size();
    }

    public boolean c(String str) throws IOException {
        synchronized (this) {
            i();
            j();
            d(str);
            c cVar = this.m.get(str);
            if (cVar == null) {
                return false;
            }
            boolean zA = a(cVar);
            if (zA && this.q <= this.s) {
                this.g = false;
            }
            return zA;
        }
    }

    boolean a(c cVar) throws IOException {
        if (cVar.f44280b != null) {
            cVar.f44280b.b();
        }
        for (int i = 0; i < this.f44277c; i++) {
            this.f.b(cVar.d[i]);
            this.q -= cVar.f44281c[i];
            cVar.f44281c[i] = 0;
        }
        this.n++;
        this.d.writeUtf8("REMOVE").writeByte(32).writeUtf8(cVar.e).writeByte(10);
        this.m.remove(cVar.e);
        if (a()) {
            this.p.execute(this.k);
        }
        return true;
    }

    private void j() {
        synchronized (this) {
            if (this.f44276b) {
                throw new IllegalStateException("cache is closed");
            }
        }
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        synchronized (this) {
            if (this.h) {
                j();
                b();
                this.d.flush();
            }
        }
    }

    public boolean c() {
        boolean z;
        synchronized (this) {
            z = this.f44276b;
        }
        return z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this) {
            if (this.h && !this.f44276b) {
                for (c cVar : (c[]) this.m.values().toArray(new c[this.m.size()])) {
                    if (cVar.f44280b != null) {
                        cVar.f44280b.e();
                    }
                }
                b();
                this.d.close();
                this.d = null;
                this.f44276b = true;
                return;
            }
            this.f44276b = true;
        }
    }

    void b() throws IOException {
        while (this.q > this.s) {
            a(this.m.values().iterator().next());
        }
        this.g = false;
    }

    public void e() throws IOException {
        close();
        this.f.e(this.f44275a);
    }

    private void i() throws IOException {
        synchronized (this) {
            if (this.h) {
                return;
            }
            if (this.o.exists()) {
                if (this.r.exists()) {
                    this.f.b(this.o);
                } else {
                    this.f.e(this.o, this.r);
                }
            }
            if (this.r.exists()) {
                try {
                    h();
                    f();
                    this.h = true;
                    return;
                } catch (IOException e2) {
                    LogUtil.e("HealthDiskLruCache", "initialize failed, e: " + e2);
                    try {
                        e();
                        this.f44276b = false;
                        d();
                        this.h = true;
                    } catch (Throwable th) {
                        this.f44276b = false;
                        throw th;
                    }
                }
            }
            d();
            this.h = true;
        }
    }

    private void d(String str) {
        if (e.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    private void h() throws IOException {
        BufferedSource bufferedSourceBuffer = Okio.buffer(this.f.a(this.r));
        try {
            String utf8LineStrict = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict2 = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict3 = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict4 = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict5 = bufferedSourceBuffer.readUtf8LineStrict();
            if (!"libcore.io.HealthDiskLruCache".equals(utf8LineStrict) || !"1".equals(utf8LineStrict2) || !Integer.toString(this.l).equals(utf8LineStrict3) || !Integer.toString(this.f44277c).equals(utf8LineStrict4) || !"".equals(utf8LineStrict5)) {
                throw new IOException("wrong journal header: [" + utf8LineStrict + ", " + utf8LineStrict2 + ", " + utf8LineStrict4 + ", " + utf8LineStrict5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    e(bufferedSourceBuffer.readUtf8LineStrict());
                    i++;
                } catch (EOFException unused) {
                    this.n = i - this.m.size();
                    if (!bufferedSourceBuffer.exhausted()) {
                        d();
                    } else {
                        this.d = g();
                    }
                    if (bufferedSourceBuffer != null) {
                        bufferedSourceBuffer.close();
                        return;
                    }
                    return;
                }
            }
        } catch (Throwable th) {
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: loaded from: classes12.dex */
    public final class e implements Closeable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f44286b;
        private final Source[] e;

        e(String str, long j, Source[] sourceArr, long[] jArr) {
            this.e = sourceArr;
            this.f44286b = jArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (Source source : this.e) {
                ofi.e(source);
            }
        }

        public Source e(int i) {
            return this.e[i];
        }
    }

    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f44282a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean[] f44283c;
        final c d;

        d(c cVar) {
            this.d = cVar;
            this.f44283c = cVar.i ? null : new boolean[ofi.this.f44277c];
        }

        void b() {
            if (this.d.f44280b == this) {
                for (int i = 0; i < ofi.this.f44277c; i++) {
                    try {
                        ofi.this.f.b(this.d.f44279a[i]);
                    } catch (IOException e) {
                        LogUtil.d("HealthDiskLruCache", "detach IOException ", e.getMessage());
                    }
                }
                this.d.f44280b = null;
            }
        }

        public void c() throws IOException {
            synchronized (ofi.this) {
                if (this.f44282a) {
                    throw new IllegalStateException();
                }
                if (this.d.f44280b == this) {
                    ofi.this.e(this, true);
                }
                this.f44282a = true;
            }
        }

        public void e() throws IOException {
            synchronized (ofi.this) {
                if (this.f44282a) {
                    throw new IllegalStateException();
                }
                if (this.d.f44280b == this) {
                    ofi.this.e(this, false);
                }
                this.f44282a = true;
            }
        }

        public Sink c(int i) {
            synchronized (ofi.this) {
                if (this.f44282a) {
                    throw new IllegalStateException();
                }
                if (this.d.f44280b != this) {
                    return Okio.blackhole();
                }
                if (!this.d.i) {
                    this.f44283c[i] = true;
                }
                try {
                    return new off(ofi.this.f.d(this.d.f44279a[i])) { // from class: ofi.d.1
                        @Override // defpackage.off
                        protected void b(IOException iOException) {
                            synchronized (ofi.this) {
                                d.this.b();
                            }
                        }
                    };
                } catch (FileNotFoundException unused) {
                    return Okio.blackhole();
                }
            }
        }
    }

    private void e(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            LogUtil.d("HealthDiskLruCache", "readJournalInLine failed, no space in line ");
            throw new IOException("unexpected journal line: " + str);
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        if (iIndexOf2 == -1) {
            LogUtil.b("HealthDiskLruCache", "only one key found");
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.m.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        c cVar = this.m.get(strSubstring);
        if (cVar == null) {
            cVar = new c(strSubstring);
            this.m.put(strSubstring, cVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            cVar.i = true;
            cVar.f44280b = null;
            cVar.d(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            cVar.f44280b = new d(cVar);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            LogUtil.b("HealthDiskLruCache", "");
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final File[] f44279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d f44280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long[] f44281c;
        final File[] d;
        final String e;
        long g;
        boolean i;

        c(String str) {
            this.e = str;
            this.f44281c = new long[ofi.this.f44277c];
            this.d = new File[ofi.this.f44277c];
            this.f44279a = new File[ofi.this.f44277c];
            StringBuilder sb = new StringBuilder(str);
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            int length = sb.length();
            for (int i = 0; i < ofi.this.f44277c; i++) {
                sb.append(i);
                this.d[i] = new File(ofi.this.f44275a, sb.toString());
                sb.append(".tmp");
                this.f44279a[i] = new File(ofi.this.f44275a, sb.toString());
                sb.setLength(length);
            }
        }

        void b(BufferedSink bufferedSink) throws IOException {
            for (long j : this.f44281c) {
                bufferedSink.writeByte(32).writeDecimalLong(j);
            }
        }

        private IOException c(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        e e() {
            Source source;
            if (!Thread.holdsLock(ofi.this)) {
                throw new AssertionError();
            }
            Source[] sourceArr = new Source[ofi.this.f44277c];
            long[] jArr = (long[]) this.f44281c.clone();
            for (int i = 0; i < ofi.this.f44277c; i++) {
                try {
                    sourceArr[i] = ofi.this.f.a(this.d[i]);
                } catch (FileNotFoundException unused) {
                    for (int i2 = 0; i2 < ofi.this.f44277c && (source = sourceArr[i2]) != null; i2++) {
                        ofi.e(source);
                    }
                    try {
                        ofi.this.a(this);
                        return null;
                    } catch (IOException e) {
                        LogUtil.d("HealthDiskLruCache", "snapshot() failed, e:" + e);
                        return null;
                    }
                }
            }
            return ofi.this.new e(this.e, this.g, sourceArr, jArr);
        }

        void d(String[] strArr) throws IOException {
            if (strArr.length != ofi.this.f44277c) {
                LogUtil.d("HealthDiskLruCache", "count not equals");
                throw c(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.f44281c[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    LogUtil.d("HealthDiskLruCache", "NumberFormatException, s:" + strArr);
                    throw c(strArr);
                }
            }
        }
    }

    static void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception e3) {
                LogUtil.d("HealthDiskLruCache", "close Exception", e3.getMessage());
            }
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ofi.this) {
                if ((!ofi.this.h) || ofi.this.f44276b) {
                    return;
                }
                try {
                    ofi.this.b();
                } catch (IOException unused) {
                    ofi.this.g = true;
                }
                try {
                    if (ofi.this.a()) {
                        ofi.this.d();
                        ofi.this.n = 0;
                    }
                } catch (IOException unused2) {
                    ofi.this.i = true;
                    ofi.this.d = Okio.buffer(Okio.blackhole());
                }
            }
        }
    }

    Sink a(File file) throws FileNotFoundException {
        try {
            return Okio.appendingSink(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return Okio.appendingSink(file);
        }
    }
}
