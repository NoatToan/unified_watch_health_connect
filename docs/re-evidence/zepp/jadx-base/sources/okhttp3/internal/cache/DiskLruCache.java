package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;
import okio.Source;

/* JADX INFO: loaded from: classes23.dex */
public final class DiskLruCache implements Closeable, Flushable {
    public static final Pattern A = Pattern.compile("[a-z0-9_-]{1,120}");
    private static final String B = "CLEAN";
    private static final String C = "DIRTY";
    private static final String D = "REMOVE";
    private static final String E = "READ";
    public static final /* synthetic */ boolean F = false;
    public static final String u = "journal";
    public static final String v = "journal.tmp";
    public static final String w = "journal.bkp";
    public static final String x = "libcore.io.DiskLruCache";
    public static final String y = "1";
    public static final long z = -1;
    public final FileSystem a;
    public final File b;
    private final File c;
    private final File d;
    private final File e;
    private final int f;
    private long g;
    public final int h;
    public BufferedSink j;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    private final Executor s;
    private long i = 0;
    public final LinkedHashMap<String, d> k = new LinkedHashMap<>(0, 0.75f, true);
    private long r = 0;
    private final Runnable t = new a();

    public final class Editor {
        public final d a;
        public final boolean[] b;
        private boolean c;

        public class a extends okhttp3.internal.cache.a {
            public a(Sink sink) {
                super(sink);
            }

            @Override // okhttp3.internal.cache.a
            public void onException(IOException iOException) {
                synchronized (DiskLruCache.this) {
                    Editor.this.a();
                }
            }
        }

        public Editor(d dVar) {
            this.a = dVar;
            this.b = dVar.e ? null : new boolean[DiskLruCache.this.h];
        }

        public void a() {
            if (this.a.f != this) {
                return;
            }
            int i = 0;
            while (true) {
                DiskLruCache diskLruCache = DiskLruCache.this;
                if (i >= diskLruCache.h) {
                    this.a.f = null;
                    return;
                } else {
                    try {
                        diskLruCache.a.delete(this.a.d[i]);
                    } catch (IOException unused) {
                    }
                    i++;
                }
            }
        }

        public void abort() throws IOException {
            synchronized (DiskLruCache.this) {
                if (this.c) {
                    throw new IllegalStateException();
                }
                if (this.a.f == this) {
                    DiskLruCache.this.b(this, false);
                }
                this.c = true;
            }
        }

        public void abortUnlessCommitted() {
            synchronized (DiskLruCache.this) {
                if (!this.c && this.a.f == this) {
                    try {
                        DiskLruCache.this.b(this, false);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        public void commit() throws IOException {
            synchronized (DiskLruCache.this) {
                if (this.c) {
                    throw new IllegalStateException();
                }
                if (this.a.f == this) {
                    DiskLruCache.this.b(this, true);
                }
                this.c = true;
            }
        }

        public Sink newSink(int i) {
            synchronized (DiskLruCache.this) {
                if (this.c) {
                    throw new IllegalStateException();
                }
                d dVar = this.a;
                if (dVar.f != this) {
                    return Okio.blackhole();
                }
                if (!dVar.e) {
                    this.b[i] = true;
                }
                try {
                    return new a(DiskLruCache.this.a.sink(dVar.d[i]));
                } catch (FileNotFoundException unused) {
                    return Okio.blackhole();
                }
            }
        }

        public Source newSource(int i) {
            synchronized (DiskLruCache.this) {
                if (this.c) {
                    throw new IllegalStateException();
                }
                d dVar = this.a;
                if (!dVar.e || dVar.f != this) {
                    return null;
                }
                try {
                    return DiskLruCache.this.a.source(dVar.c[i]);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
        }
    }

    public final class Snapshot implements Closeable {
        private final String a;
        private final long b;
        private final Source[] c;
        private final long[] d;

        public Snapshot(String str, long j, Source[] sourceArr, long[] jArr) {
            this.a = str;
            this.b = j;
            this.c = sourceArr;
            this.d = jArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (Source source : this.c) {
                Util.closeQuietly(source);
            }
        }

        @Nullable
        public Editor edit() throws IOException {
            return DiskLruCache.this.c(this.a, this.b);
        }

        public long getLength(int i) {
            return this.d[i];
        }

        public Source getSource(int i) {
            return this.c[i];
        }

        public String key() {
            return this.a;
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (DiskLruCache.this) {
                DiskLruCache diskLruCache = DiskLruCache.this;
                if ((!diskLruCache.n) || diskLruCache.o) {
                    return;
                }
                try {
                    diskLruCache.k();
                } catch (IOException unused) {
                    DiskLruCache.this.p = true;
                }
                try {
                    if (DiskLruCache.this.d()) {
                        DiskLruCache.this.i();
                        DiskLruCache.this.l = 0;
                    }
                } catch (IOException unused2) {
                    DiskLruCache diskLruCache2 = DiskLruCache.this;
                    diskLruCache2.q = true;
                    diskLruCache2.j = Okio.buffer(Okio.blackhole());
                }
            }
        }
    }

    public class b extends okhttp3.internal.cache.a {
        public static final /* synthetic */ boolean c = false;

        public b(Sink sink) {
            super(sink);
        }

        @Override // okhttp3.internal.cache.a
        public void onException(IOException iOException) {
            DiskLruCache.this.m = true;
        }
    }

    public class c implements Iterator<Snapshot> {
        public final Iterator<d> a;
        public Snapshot b;
        public Snapshot c;

        public c() {
            this.a = new ArrayList(DiskLruCache.this.k.values()).iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Snapshot next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Snapshot snapshot = this.b;
            this.c = snapshot;
            this.b = null;
            return snapshot;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Snapshot snapshotC;
            if (this.b != null) {
                return true;
            }
            synchronized (DiskLruCache.this) {
                if (DiskLruCache.this.o) {
                    return false;
                }
                while (this.a.hasNext()) {
                    d next = this.a.next();
                    if (next.e && (snapshotC = next.c()) != null) {
                        this.b = snapshotC;
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            Snapshot snapshot = this.c;
            if (snapshot == null) {
                throw new IllegalStateException("remove() before next()");
            }
            try {
                DiskLruCache.this.remove(snapshot.a);
            } catch (IOException unused) {
            } finally {
                this.c = null;
            }
        }
    }

    public final class d {
        public final String a;
        public final long[] b;
        public final File[] c;
        public final File[] d;
        public boolean e;
        public Editor f;
        public long g;

        public d(String str) {
            this.a = str;
            int i = DiskLruCache.this.h;
            this.b = new long[i];
            this.c = new File[i];
            this.d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < DiskLruCache.this.h; i2++) {
                sb.append(i2);
                this.c[i2] = new File(DiskLruCache.this.b, sb.toString());
                sb.append(".tmp");
                this.d[i2] = new File(DiskLruCache.this.b, sb.toString());
                sb.setLength(length);
            }
        }

        private IOException a(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public void b(String[] strArr) throws IOException {
            if (strArr.length != DiskLruCache.this.h) {
                throw a(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw a(strArr);
                }
            }
        }

        public Snapshot c() {
            DiskLruCache diskLruCache;
            if (!Thread.holdsLock(DiskLruCache.this)) {
                throw new AssertionError();
            }
            Source[] sourceArr = new Source[DiskLruCache.this.h];
            long[] jArr = (long[]) this.b.clone();
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    DiskLruCache diskLruCache2 = DiskLruCache.this;
                    if (i2 >= diskLruCache2.h) {
                        return diskLruCache2.new Snapshot(this.a, this.g, sourceArr, jArr);
                    }
                    sourceArr[i2] = diskLruCache2.a.source(this.c[i2]);
                    i2++;
                } catch (FileNotFoundException unused) {
                    while (true) {
                        diskLruCache = DiskLruCache.this;
                        if (i >= diskLruCache.h || sourceArr[i] == null) {
                            break;
                        }
                        Util.closeQuietly(sourceArr[i]);
                        i++;
                    }
                    try {
                        diskLruCache.j(this);
                        return null;
                    } catch (IOException unused2) {
                        return null;
                    }
                }
            }
        }

        public void d(BufferedSink bufferedSink) throws IOException {
            for (long j : this.b) {
                bufferedSink.writeByte(32).writeDecimalLong(j);
            }
        }
    }

    public DiskLruCache(FileSystem fileSystem, File file, int i, int i2, long j, Executor executor) {
        this.a = fileSystem;
        this.b = file;
        this.f = i;
        this.c = new File(file, "journal");
        this.d = new File(file, "journal.tmp");
        this.e = new File(file, "journal.bkp");
        this.h = i2;
        this.g = j;
        this.s = executor;
    }

    private synchronized void a() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public static DiskLruCache create(FileSystem fileSystem, File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 > 0) {
            return new DiskLruCache(fileSystem, file, i, i2, j, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory("OkHttp DiskLruCache", true)));
        }
        throw new IllegalArgumentException("valueCount <= 0");
    }

    private BufferedSink e() throws FileNotFoundException {
        return Okio.buffer(new b(this.a.appendingSink(this.c)));
    }

    private void f() throws IOException {
        this.a.delete(this.d);
        Iterator<d> it2 = this.k.values().iterator();
        while (it2.hasNext()) {
            d next = it2.next();
            int i = 0;
            if (next.f == null) {
                while (i < this.h) {
                    this.i += next.b[i];
                    i++;
                }
            } else {
                next.f = null;
                while (i < this.h) {
                    this.a.delete(next.c[i]);
                    this.a.delete(next.d[i]);
                    i++;
                }
                it2.remove();
            }
        }
    }

    private void g() throws IOException {
        BufferedSource bufferedSourceBuffer = Okio.buffer(this.a.source(this.c));
        try {
            String utf8LineStrict = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict2 = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict3 = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict4 = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict5 = bufferedSourceBuffer.readUtf8LineStrict();
            if (!"libcore.io.DiskLruCache".equals(utf8LineStrict) || !"1".equals(utf8LineStrict2) || !Integer.toString(this.f).equals(utf8LineStrict3) || !Integer.toString(this.h).equals(utf8LineStrict4) || !"".equals(utf8LineStrict5)) {
                throw new IOException("unexpected journal header: [" + utf8LineStrict + ", " + utf8LineStrict2 + ", " + utf8LineStrict4 + ", " + utf8LineStrict5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    h(bufferedSourceBuffer.readUtf8LineStrict());
                    i++;
                } catch (EOFException unused) {
                    this.l = i - this.k.size();
                    if (bufferedSourceBuffer.exhausted()) {
                        this.j = e();
                    } else {
                        i();
                    }
                    Util.closeQuietly(bufferedSourceBuffer);
                    return;
                }
            }
        } catch (Throwable th) {
            Util.closeQuietly(bufferedSourceBuffer);
            throw th;
        }
    }

    private void h(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith(D)) {
                this.k.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        d dVar = this.k.get(strSubstring);
        if (dVar == null) {
            dVar = new d(strSubstring);
            this.k.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith(B)) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.e = true;
            dVar.f = null;
            dVar.b(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith(C)) {
            dVar.f = new Editor(dVar);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith(E)) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private void l(String str) {
        if (A.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    public synchronized void b(Editor editor, boolean z2) throws IOException {
        d dVar = editor.a;
        if (dVar.f != editor) {
            throw new IllegalStateException();
        }
        if (z2 && !dVar.e) {
            for (int i = 0; i < this.h; i++) {
                if (!editor.b[i]) {
                    editor.abort();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!this.a.exists(dVar.d[i])) {
                    editor.abort();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.h; i2++) {
            File file = dVar.d[i2];
            if (!z2) {
                this.a.delete(file);
            } else if (this.a.exists(file)) {
                File file2 = dVar.c[i2];
                this.a.rename(file, file2);
                long j = dVar.b[i2];
                long size = this.a.size(file2);
                dVar.b[i2] = size;
                this.i = (this.i - j) + size;
            }
        }
        this.l++;
        dVar.f = null;
        if (dVar.e || z2) {
            dVar.e = true;
            this.j.writeUtf8(B).writeByte(32);
            this.j.writeUtf8(dVar.a);
            dVar.d(this.j);
            this.j.writeByte(10);
            if (z2) {
                long j2 = this.r;
                this.r = 1 + j2;
                dVar.g = j2;
            }
        } else {
            this.k.remove(dVar.a);
            this.j.writeUtf8(D).writeByte(32);
            this.j.writeUtf8(dVar.a);
            this.j.writeByte(10);
        }
        this.j.flush();
        if (this.i > this.g || d()) {
            this.s.execute(this.t);
        }
    }

    public synchronized Editor c(String str, long j) throws IOException {
        initialize();
        a();
        l(str);
        d dVar = this.k.get(str);
        if (j != -1 && (dVar == null || dVar.g != j)) {
            return null;
        }
        if (dVar != null && dVar.f != null) {
            return null;
        }
        if (!this.p && !this.q) {
            this.j.writeUtf8(C).writeByte(32).writeUtf8(str).writeByte(10);
            this.j.flush();
            if (this.m) {
                return null;
            }
            if (dVar == null) {
                dVar = new d(str);
                this.k.put(str, dVar);
            }
            Editor editor = new Editor(dVar);
            dVar.f = editor;
            return editor;
        }
        this.s.execute(this.t);
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.n && !this.o) {
            for (d dVar : (d[]) this.k.values().toArray(new d[this.k.size()])) {
                Editor editor = dVar.f;
                if (editor != null) {
                    editor.abort();
                }
            }
            k();
            this.j.close();
            this.j = null;
            this.o = true;
            return;
        }
        this.o = true;
    }

    public boolean d() {
        int i = this.l;
        return i >= 2000 && i >= this.k.size();
    }

    public void delete() throws IOException {
        close();
        this.a.deleteContents(this.b);
    }

    @Nullable
    public Editor edit(String str) throws IOException {
        return c(str, -1L);
    }

    public synchronized void evictAll() throws IOException {
        initialize();
        for (d dVar : (d[]) this.k.values().toArray(new d[this.k.size()])) {
            j(dVar);
        }
        this.p = false;
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.n) {
            a();
            k();
            this.j.flush();
        }
    }

    public synchronized Snapshot get(String str) throws IOException {
        initialize();
        a();
        l(str);
        d dVar = this.k.get(str);
        if (dVar != null && dVar.e) {
            Snapshot snapshotC = dVar.c();
            if (snapshotC == null) {
                return null;
            }
            this.l++;
            this.j.writeUtf8(E).writeByte(32).writeUtf8(str).writeByte(10);
            if (d()) {
                this.s.execute(this.t);
            }
            return snapshotC;
        }
        return null;
    }

    public File getDirectory() {
        return this.b;
    }

    public synchronized long getMaxSize() {
        return this.g;
    }

    public synchronized void i() throws IOException {
        try {
            BufferedSink bufferedSink = this.j;
            if (bufferedSink != null) {
                bufferedSink.close();
            }
            BufferedSink bufferedSinkBuffer = Okio.buffer(this.a.sink(this.d));
            try {
                bufferedSinkBuffer.writeUtf8("libcore.io.DiskLruCache").writeByte(10);
                bufferedSinkBuffer.writeUtf8("1").writeByte(10);
                bufferedSinkBuffer.writeDecimalLong(this.f).writeByte(10);
                bufferedSinkBuffer.writeDecimalLong(this.h).writeByte(10);
                bufferedSinkBuffer.writeByte(10);
                for (d dVar : this.k.values()) {
                    if (dVar.f != null) {
                        bufferedSinkBuffer.writeUtf8(C).writeByte(32);
                        bufferedSinkBuffer.writeUtf8(dVar.a);
                        bufferedSinkBuffer.writeByte(10);
                    } else {
                        bufferedSinkBuffer.writeUtf8(B).writeByte(32);
                        bufferedSinkBuffer.writeUtf8(dVar.a);
                        dVar.d(bufferedSinkBuffer);
                        bufferedSinkBuffer.writeByte(10);
                    }
                }
                bufferedSinkBuffer.close();
                if (this.a.exists(this.c)) {
                    this.a.rename(this.c, this.e);
                }
                this.a.rename(this.d, this.c);
                this.a.delete(this.e);
                this.j = e();
                this.m = false;
                this.q = false;
            } catch (Throwable th) {
                bufferedSinkBuffer.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void initialize() throws IOException {
        if (this.n) {
            return;
        }
        if (this.a.exists(this.e)) {
            if (this.a.exists(this.c)) {
                this.a.delete(this.e);
            } else {
                this.a.rename(this.e, this.c);
            }
        }
        if (this.a.exists(this.c)) {
            try {
                g();
                f();
                this.n = true;
                return;
            } catch (IOException e) {
                Platform.get().log(5, "DiskLruCache " + this.b + " is corrupt: " + e.getMessage() + ", removing", e);
                try {
                    delete();
                    this.o = false;
                    i();
                    this.n = true;
                } catch (Throwable th) {
                    this.o = false;
                    throw th;
                }
            }
        }
        i();
        this.n = true;
    }

    public synchronized boolean isClosed() {
        return this.o;
    }

    public boolean j(d dVar) throws IOException {
        Editor editor = dVar.f;
        if (editor != null) {
            editor.a();
        }
        for (int i = 0; i < this.h; i++) {
            this.a.delete(dVar.c[i]);
            long j = this.i;
            long[] jArr = dVar.b;
            this.i = j - jArr[i];
            jArr[i] = 0;
        }
        this.l++;
        this.j.writeUtf8(D).writeByte(32).writeUtf8(dVar.a).writeByte(10);
        this.k.remove(dVar.a);
        if (d()) {
            this.s.execute(this.t);
        }
        return true;
    }

    public void k() throws IOException {
        while (this.i > this.g) {
            j(this.k.values().iterator().next());
        }
        this.p = false;
    }

    public synchronized boolean remove(String str) throws IOException {
        initialize();
        a();
        l(str);
        d dVar = this.k.get(str);
        if (dVar == null) {
            return false;
        }
        boolean zJ = j(dVar);
        if (zJ && this.i <= this.g) {
            this.p = false;
        }
        return zJ;
    }

    public synchronized void setMaxSize(long j) {
        this.g = j;
        if (this.n) {
            this.s.execute(this.t);
        }
    }

    public synchronized long size() throws IOException {
        initialize();
        return this.i;
    }

    public synchronized Iterator<Snapshot> snapshots() throws IOException {
        initialize();
        return new c();
    }
}
