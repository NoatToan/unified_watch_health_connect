package defpackage;

import android.annotation.TargetApi;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class my6 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f27331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f27332b;
    public final File c;
    public final File d;
    public final int e;
    public long f;
    public final int g;
    public Writer i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27333k;
    public long h = 0;
    public final LinkedHashMap<String, d> j = new LinkedHashMap<>(0, 0.75f, true);
    public long l = 0;
    public final ThreadPoolExecutor m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));
    public final Callable<Void> n = new a();

    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (my6.this) {
                try {
                    if (my6.this.i == null) {
                        return null;
                    }
                    my6.this.b0();
                    if (my6.this.O()) {
                        my6.this.T();
                        my6.this.f27333k = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class b implements ThreadFactory {
        public b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f27335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f27336b;
        public boolean c;

        public /* synthetic */ c(my6 my6Var, d dVar, a aVar) {
            this(dVar);
        }

        public void a() throws IOException {
            my6.this.y(this, false);
        }

        public void b() {
            if (this.c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() throws IOException {
            my6.this.y(this, true);
            this.c = true;
        }

        public File f(int i) throws IOException {
            File fileK;
            synchronized (my6.this) {
                try {
                    if (this.f27335a.f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f27335a.e) {
                        this.f27336b[i] = true;
                    }
                    fileK = this.f27335a.k(i);
                    my6.this.f27331a.mkdirs();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return fileK;
        }

        public c(d dVar) {
            this.f27335a = dVar;
            this.f27336b = dVar.e ? null : new boolean[my6.this.g];
        }
    }

    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f27337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f27338b;
        public File[] c;
        public File[] d;
        public boolean e;
        public c f;
        public long g;

        public /* synthetic */ d(my6 my6Var, String str, a aVar) {
            this(str);
        }

        public File j(int i) {
            return this.c[i];
        }

        public File k(int i) {
            return this.d[i];
        }

        public String l() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.f27338b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        public final IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final void n(String[] strArr) throws IOException {
            if (strArr.length != my6.this.g) {
                throw m(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.f27338b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public d(String str) {
            this.f27337a = str;
            this.f27338b = new long[my6.this.g];
            this.c = new File[my6.this.g];
            this.d = new File[my6.this.g];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < my6.this.g; i++) {
                sb.append(i);
                this.c[i] = new File(my6.this.f27331a, sb.toString());
                sb.append(".tmp");
                this.d[i] = new File(my6.this.f27331a, sb.toString());
                sb.setLength(length);
            }
        }
    }

    public final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f27339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f27340b;
        public final long[] c;
        public final File[] d;

        public /* synthetic */ e(my6 my6Var, String str, long j, File[] fileArr, long[] jArr, a aVar) {
            this(str, j, fileArr, jArr);
        }

        public File a(int i) {
            return this.d[i];
        }

        public e(String str, long j, File[] fileArr, long[] jArr) {
            this.f27339a = str;
            this.f27340b = j;
            this.d = fileArr;
            this.c = jArr;
        }
    }

    public my6(File file, int i, int i2, long j) {
        this.f27331a = file;
        this.e = i;
        this.f27332b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.d = new File(file, "journal.bkp");
        this.g = i2;
        this.f = j;
    }

    public static void E(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void M(Writer writer) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static my6 P(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                Z(file2, file3, false);
            }
        }
        my6 my6Var = new my6(file, i, i2, j);
        if (my6Var.f27332b.exists()) {
            try {
                my6Var.R();
                my6Var.Q();
                return my6Var;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                my6Var.D();
            }
        }
        file.mkdirs();
        my6 my6Var2 = new my6(file, i, i2, j);
        my6Var2.T();
        return my6Var2;
    }

    public static void Z(File file, File file2, boolean z) throws IOException {
        if (z) {
            E(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void s(Writer writer) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void D() throws IOException {
        close();
        bmq.b(this.f27331a);
    }

    public c J(String str) throws IOException {
        return K(str, -1L);
    }

    public final synchronized c K(String str, long j) throws IOException {
        p();
        d dVar = this.j.get(str);
        a aVar = null;
        if (j != -1 && (dVar == null || dVar.g != j)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.j.put(str, dVar);
        } else if (dVar.f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f = cVar;
        this.i.append((CharSequence) "DIRTY");
        this.i.append(' ');
        this.i.append((CharSequence) str);
        this.i.append('\n');
        M(this.i);
        return cVar;
    }

    public synchronized e N(String str) throws IOException {
        p();
        d dVar = this.j.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.e) {
            return null;
        }
        for (File file : dVar.c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f27333k++;
        this.i.append((CharSequence) "READ");
        this.i.append(' ');
        this.i.append((CharSequence) str);
        this.i.append('\n');
        if (O()) {
            this.m.submit(this.n);
        }
        return new e(this, str, dVar.g, dVar.c, dVar.f27338b, null);
    }

    public final boolean O() {
        int i = this.f27333k;
        return i >= 2000 && i >= this.j.size();
    }

    public final void Q() throws IOException {
        E(this.c);
        Iterator<d> it = this.j.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i = 0;
            if (next.f == null) {
                while (i < this.g) {
                    this.h += next.f27338b[i];
                    i++;
                }
            } else {
                next.f = null;
                while (i < this.g) {
                    E(next.j(i));
                    E(next.k(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void R() throws IOException {
        dlo dloVar = new dlo(new FileInputStream(this.f27332b), bmq.f4375a);
        try {
            String strD = dloVar.d();
            String strD2 = dloVar.d();
            String strD3 = dloVar.d();
            String strD4 = dloVar.d();
            String strD5 = dloVar.d();
            if (!"libcore.io.DiskLruCache".equals(strD) || !"1".equals(strD2) || !Integer.toString(this.e).equals(strD3) || !Integer.toString(this.g).equals(strD4) || !"".equals(strD5)) {
                throw new IOException("unexpected journal header: [" + strD + ", " + strD2 + ", " + strD4 + ", " + strD5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    S(dloVar.d());
                    i++;
                } catch (EOFException unused) {
                    this.f27333k = i - this.j.size();
                    if (dloVar.c()) {
                        T();
                    } else {
                        this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f27332b, true), bmq.f4375a));
                    }
                    bmq.a(dloVar);
                    return;
                }
            }
        } catch (Throwable th) {
            bmq.a(dloVar);
            throw th;
        }
    }

    public final void S(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.j.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        d dVar = this.j.get(strSubstring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, aVar);
            this.j.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.e = true;
            dVar.f = null;
            dVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f = new c(this, dVar, aVar);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public final synchronized void T() throws IOException {
        try {
            Writer writer = this.i;
            if (writer != null) {
                s(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), bmq.f4375a));
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
                for (d dVar : this.j.values()) {
                    if (dVar.f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f27337a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f27337a + dVar.l() + '\n');
                    }
                }
                s(bufferedWriter);
                if (this.f27332b.exists()) {
                    Z(this.f27332b, this.d, true);
                }
                Z(this.c, this.f27332b, false);
                this.d.delete();
                this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f27332b, true), bmq.f4375a));
            } catch (Throwable th) {
                s(bufferedWriter);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean U(String str) throws IOException {
        try {
            p();
            d dVar = this.j.get(str);
            if (dVar != null && dVar.f == null) {
                for (int i = 0; i < this.g; i++) {
                    File fileJ = dVar.j(i);
                    if (fileJ.exists() && !fileJ.delete()) {
                        throw new IOException("failed to delete " + fileJ);
                    }
                    this.h -= dVar.f27338b[i];
                    dVar.f27338b[i] = 0;
                }
                this.f27333k++;
                this.i.append((CharSequence) "REMOVE");
                this.i.append(' ');
                this.i.append((CharSequence) str);
                this.i.append('\n');
                this.j.remove(str);
                if (O()) {
                    this.m.submit(this.n);
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b0() throws IOException {
        while (this.h > this.f) {
            U(this.j.entrySet().iterator().next().getKey());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.i == null) {
                return;
            }
            for (d dVar : new ArrayList(this.j.values())) {
                if (dVar.f != null) {
                    dVar.f.a();
                }
            }
            b0();
            s(this.i);
            this.i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void p() {
        if (this.i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void y(c cVar, boolean z) throws IOException {
        d dVar = cVar.f27335a;
        if (dVar.f != cVar) {
            throw new IllegalStateException();
        }
        if (z && !dVar.e) {
            for (int i = 0; i < this.g; i++) {
                if (!cVar.f27336b[i]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!dVar.k(i).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.g; i2++) {
            File fileK = dVar.k(i2);
            if (!z) {
                E(fileK);
            } else if (fileK.exists()) {
                File fileJ = dVar.j(i2);
                fileK.renameTo(fileJ);
                long j = dVar.f27338b[i2];
                long length = fileJ.length();
                dVar.f27338b[i2] = length;
                this.h = (this.h - j) + length;
            }
        }
        this.f27333k++;
        dVar.f = null;
        if (dVar.e || z) {
            dVar.e = true;
            this.i.append((CharSequence) "CLEAN");
            this.i.append(' ');
            this.i.append((CharSequence) dVar.f27337a);
            this.i.append((CharSequence) dVar.l());
            this.i.append('\n');
            if (z) {
                long j2 = this.l;
                this.l = 1 + j2;
                dVar.g = j2;
            }
        } else {
            this.j.remove(dVar.f27337a);
            this.i.append((CharSequence) "REMOVE");
            this.i.append(' ');
            this.i.append((CharSequence) dVar.f27337a);
            this.i.append('\n');
        }
        M(this.i);
        if (this.h > this.f || O()) {
            this.m.submit(this.n);
        }
    }
}
