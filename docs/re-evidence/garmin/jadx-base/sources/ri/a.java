package ri;

import android.annotation.TargetApi;
import android.os.StrictMode;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.StringUtils;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f152765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f152766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f152767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f152768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f152769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f152770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f152771g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BufferedWriter f152773i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f152775k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f152772h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap<String, d> f152774j = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f152776l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ThreadPoolExecutor f152777m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CallableC2884a f152778n = new CallableC2884a();

    /* JADX INFO: renamed from: ri.a$a, reason: collision with other inner class name */
    public class CallableC2884a implements Callable<Void> {
        public CallableC2884a() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() {
            synchronized (a.this) {
                try {
                    a aVar = a.this;
                    if (aVar.f152773i == null) {
                        return null;
                    }
                    aVar.z();
                    if (a.this.l()) {
                        a.this.w();
                        a.this.f152775k = 0;
                    }
                    return null;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    private a(File file, int i14, int i15, long j8) {
        this.f152765a = file;
        this.f152769e = i14;
        this.f152766b = new File(file, "journal");
        this.f152767c = new File(file, "journal.tmp");
        this.f152768d = new File(file, "journal.bkp");
        this.f152771g = i15;
        this.f152770f = j8;
    }

    public static void a(a aVar, c cVar, boolean z14) {
        synchronized (aVar) {
            d dVar = cVar.f152780a;
            if (dVar.f152789f != cVar) {
                throw new IllegalStateException();
            }
            if (z14 && !dVar.f152788e) {
                for (int i14 = 0; i14 < aVar.f152771g; i14++) {
                    if (!cVar.f152781b[i14]) {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i14);
                    }
                    if (!dVar.f152787d[i14].exists()) {
                        cVar.a();
                        return;
                    }
                }
            }
            for (int i15 = 0; i15 < aVar.f152771g; i15++) {
                File file = dVar.f152787d[i15];
                if (!z14) {
                    e(file);
                } else if (file.exists()) {
                    File file2 = dVar.f152786c[i15];
                    file.renameTo(file2);
                    long j8 = dVar.f152785b[i15];
                    long length = file2.length();
                    dVar.f152785b[i15] = length;
                    aVar.f152772h = (aVar.f152772h - j8) + length;
                }
            }
            aVar.f152775k++;
            dVar.f152789f = null;
            if (dVar.f152788e || z14) {
                dVar.f152788e = true;
                aVar.f152773i.append((CharSequence) "CLEAN");
                aVar.f152773i.append(' ');
                aVar.f152773i.append((CharSequence) dVar.f152784a);
                aVar.f152773i.append((CharSequence) dVar.a());
                aVar.f152773i.append('\n');
                if (z14) {
                    long j14 = aVar.f152776l;
                    aVar.f152776l = 1 + j14;
                    dVar.f152790g = j14;
                }
            } else {
                aVar.f152774j.remove(dVar.f152784a);
                aVar.f152773i.append((CharSequence) "REMOVE");
                aVar.f152773i.append(' ');
                aVar.f152773i.append((CharSequence) dVar.f152784a);
                aVar.f152773i.append('\n');
            }
            j(aVar.f152773i);
            if (aVar.f152772h > aVar.f152770f || aVar.l()) {
                aVar.f152777m.submit(aVar.f152778n);
            }
        }
    }

    @TargetApi(26)
    public static void c(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void e(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void j(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static a n(File file, long j8) throws IOException {
        if (j8 <= 0) {
            h.s("maxSize <= 0");
            return null;
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                x(file2, file3, false);
            }
        }
        a aVar = new a(file, 1, 1, j8);
        if (aVar.f152766b.exists()) {
            try {
                aVar.s();
                aVar.p();
                return aVar;
            } catch (IOException e4) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e4.getMessage() + ", removing");
                aVar.close();
                ri.c.a(aVar.f152765a);
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, 1, 1, j8);
        aVar2.w();
        return aVar2;
    }

    public static void x(File file, File file2, boolean z14) throws IOException {
        if (z14) {
            e(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f152773i == null) {
                return;
            }
            Iterator it = new ArrayList(this.f152774j.values()).iterator();
            while (it.hasNext()) {
                c cVar = ((d) it.next()).f152789f;
                if (cVar != null) {
                    cVar.a();
                }
            }
            z();
            c(this.f152773i);
            this.f152773i = null;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final c f(String str) {
        synchronized (this) {
            try {
                if (this.f152773i == null) {
                    throw new IllegalStateException("cache is closed");
                }
                d dVar = this.f152774j.get(str);
                CallableC2884a callableC2884a = null;
                if (dVar == null) {
                    dVar = new d(this, str, callableC2884a);
                    this.f152774j.put(str, dVar);
                } else if (dVar.f152789f != null) {
                    return null;
                }
                c cVar = new c(this, dVar, callableC2884a);
                dVar.f152789f = cVar;
                this.f152773i.append((CharSequence) "DIRTY");
                this.f152773i.append(' ');
                this.f152773i.append((CharSequence) str);
                this.f152773i.append('\n');
                j(this.f152773i);
                return cVar;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final synchronized e k(String str) throws Throwable {
        Throwable th3;
        try {
            try {
                if (this.f152773i == null) {
                    throw new IllegalStateException("cache is closed");
                }
                d dVar = this.f152774j.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.f152788e) {
                    return null;
                }
                for (File file : dVar.f152786c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th4) {
                        th3 = th4;
                    }
                }
                this.f152775k++;
                this.f152773i.append((CharSequence) "READ");
                this.f152773i.append(' ');
                this.f152773i.append((CharSequence) str);
                this.f152773i.append('\n');
                if (l()) {
                    this.f152777m.submit(this.f152778n);
                }
                return new e(this, str, dVar.f152790g, dVar.f152786c, dVar.f152785b, null);
            } catch (Throwable th5) {
                th = th5;
                th3 = th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
        throw th3;
    }

    public final boolean l() {
        int i14 = this.f152775k;
        return i14 >= 2000 && i14 >= this.f152774j.size();
    }

    public final void p() throws IOException {
        e(this.f152767c);
        Iterator<d> it = this.f152774j.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            c cVar = next.f152789f;
            int i14 = this.f152771g;
            int i15 = 0;
            if (cVar == null) {
                while (i15 < i14) {
                    this.f152772h += next.f152785b[i15];
                    i15++;
                }
            } else {
                next.f152789f = null;
                while (i15 < i14) {
                    e(next.f152786c[i15]);
                    e(next.f152787d[i15]);
                    i15++;
                }
                it.remove();
            }
        }
    }

    public final void s() {
        File file = this.f152766b;
        ri.b bVar = new ri.b(new FileInputStream(file), ri.c.f152799a);
        try {
            String strA = bVar.a();
            String strA2 = bVar.a();
            String strA3 = bVar.a();
            String strA4 = bVar.a();
            String strA5 = bVar.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(strA2) || !Integer.toString(this.f152769e).equals(strA3) || !Integer.toString(this.f152771g).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + "]");
            }
            int i14 = 0;
            while (true) {
                try {
                    v(bVar.a());
                    i14++;
                } catch (EOFException unused) {
                    this.f152775k = i14 - this.f152774j.size();
                    if (bVar.f152797e == -1) {
                        w();
                    } else {
                        this.f152773i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), ri.c.f152799a));
                    }
                    try {
                        bVar.close();
                        return;
                    } catch (RuntimeException e4) {
                        throw e4;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th3) {
            try {
                bVar.close();
            } catch (RuntimeException e14) {
                throw e14;
            } catch (Exception unused3) {
            }
            throw th3;
        }
    }

    public final void v(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            h.C("unexpected journal line: ".concat(str));
            return;
        }
        int i14 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i14);
        LinkedHashMap<String, d> linkedHashMap = this.f152774j;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i14);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i14, iIndexOf2);
        }
        d dVar = linkedHashMap.get(strSubstring);
        CallableC2884a callableC2884a = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, callableC2884a);
            linkedHashMap.put(strSubstring, dVar);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f152789f = new c(this, dVar, callableC2884a);
                return;
            } else {
                if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
                    return;
                }
                h.C("unexpected journal line: ".concat(str));
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(StringUtils.SPACE);
        dVar.f152788e = true;
        dVar.f152789f = null;
        if (strArrSplit.length != a.this.f152771g) {
            o2.c.u(Arrays.toString(strArrSplit), "unexpected journal line: ");
            return;
        }
        for (int i15 = 0; i15 < strArrSplit.length; i15++) {
            try {
                dVar.f152785b[i15] = Long.parseLong(strArrSplit[i15]);
            } catch (NumberFormatException unused) {
                o2.c.u(Arrays.toString(strArrSplit), "unexpected journal line: ");
                return;
            }
        }
    }

    public final synchronized void w() {
        try {
            BufferedWriter bufferedWriter = this.f152773i;
            if (bufferedWriter != null) {
                c(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f152767c), ri.c.f152799a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f152769e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f152771g));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (d dVar : this.f152774j.values()) {
                    if (dVar.f152789f != null) {
                        bufferedWriter2.write("DIRTY " + dVar.f152784a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + dVar.f152784a + dVar.a() + '\n');
                    }
                }
                c(bufferedWriter2);
                if (this.f152766b.exists()) {
                    x(this.f152766b, this.f152768d, true);
                }
                x(this.f152767c, this.f152766b, false);
                this.f152768d.delete();
                this.f152773i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f152766b, true), ri.c.f152799a));
            } catch (Throwable th3) {
                c(bufferedWriter2);
                throw th3;
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public final void z() {
        while (this.f152772h > this.f152770f) {
            String key = this.f152774j.entrySet().iterator().next().getKey();
            synchronized (this) {
                try {
                    if (this.f152773i == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    d dVar = this.f152774j.get(key);
                    if (dVar != null && dVar.f152789f == null) {
                        for (int i14 = 0; i14 < this.f152771g; i14++) {
                            File file = dVar.f152786c[i14];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j8 = this.f152772h;
                            long[] jArr = dVar.f152785b;
                            this.f152772h = j8 - jArr[i14];
                            jArr[i14] = 0;
                        }
                        this.f152775k++;
                        this.f152773i.append((CharSequence) "REMOVE");
                        this.f152773i.append(' ');
                        this.f152773i.append((CharSequence) key);
                        this.f152773i.append('\n');
                        this.f152774j.remove(key);
                        if (l()) {
                            this.f152777m.submit(this.f152778n);
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public static final class b implements ThreadFactory {
        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        public /* synthetic */ b(CallableC2884a callableC2884a) {
            this();
        }
    }

    public final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File[] f152792a;

        private e(a aVar, String str, long j8, File[] fileArr, long[] jArr) {
            this.f152792a = fileArr;
        }

        public /* synthetic */ e(a aVar, String str, long j8, File[] fileArr, long[] jArr, CallableC2884a callableC2884a) {
            this(aVar, str, j8, fileArr, jArr);
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f152780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f152781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f152782c;

        private c(d dVar) {
            this.f152780a = dVar;
            this.f152781b = dVar.f152788e ? null : new boolean[a.this.f152771g];
        }

        public final void a() {
            a.a(a.this, this, false);
        }

        public final File b() {
            File file;
            synchronized (a.this) {
                try {
                    d dVar = this.f152780a;
                    if (dVar.f152789f != this) {
                        throw new IllegalStateException();
                    }
                    if (!dVar.f152788e) {
                        this.f152781b[0] = true;
                    }
                    file = dVar.f152787d[0];
                    a.this.f152765a.mkdirs();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return file;
        }

        public /* synthetic */ c(a aVar, d dVar, CallableC2884a callableC2884a) {
            this(dVar);
        }
    }

    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f152784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f152785b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final File[] f152786c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final File[] f152787d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f152788e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public c f152789f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f152790g;

        private d(String str) {
            this.f152784a = str;
            int i14 = a.this.f152771g;
            File file = a.this.f152765a;
            this.f152785b = new long[i14];
            this.f152786c = new File[i14];
            this.f152787d = new File[i14];
            StringBuilder sb3 = new StringBuilder(str);
            sb3.append('.');
            int length = sb3.length();
            for (int i15 = 0; i15 < a.this.f152771g; i15++) {
                sb3.append(i15);
                this.f152786c[i15] = new File(file, sb3.toString());
                sb3.append(".tmp");
                this.f152787d[i15] = new File(file, sb3.toString());
                sb3.setLength(length);
            }
        }

        public final String a() {
            StringBuilder sb3 = new StringBuilder();
            for (long j8 : this.f152785b) {
                sb3.append(' ');
                sb3.append(j8);
            }
            return sb3.toString();
        }

        public /* synthetic */ d(a aVar, String str, CallableC2884a callableC2884a) {
            this(str);
        }
    }
}
