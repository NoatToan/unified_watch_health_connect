package com.bumptech.glide.disklrucache;

import io.netty.util.internal.StringUtil;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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

/* JADX INFO: loaded from: classes2.dex */
public final class DiskLruCache implements Closeable {
    public static final String o = "journal";
    public static final String p = "journal.tmp";
    public static final String q = "journal.bkp";
    public static final String r = "libcore.io.DiskLruCache";
    public static final String s = "1";
    public static final long t = -1;
    private static final String u = "CLEAN";
    private static final String v = "DIRTY";
    private static final String w = "REMOVE";
    private static final String x = "READ";
    private final File a;
    private final File b;
    private final File c;
    private final File d;
    private final int e;
    private long f;
    private final int g;
    private Writer i;
    private int k;
    private long h = 0;
    private final LinkedHashMap<String, c> j = new LinkedHashMap<>(0, 0.75f, true);
    private long l = 0;
    public final ThreadPoolExecutor m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));
    private final Callable<Void> n = new a();

    public final class Editor {
        private final c a;
        private final boolean[] b;
        private boolean c;

        public /* synthetic */ Editor(DiskLruCache diskLruCache, c cVar, a aVar) {
            this(cVar);
        }

        private InputStream c(int i) throws IOException {
            synchronized (DiskLruCache.this) {
                if (this.a.f != this) {
                    throw new IllegalStateException();
                }
                if (!this.a.e) {
                    return null;
                }
                try {
                    return new FileInputStream(this.a.j(i));
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
        }

        public void abort() throws IOException {
            DiskLruCache.this.l(this, false);
        }

        public void abortUnlessCommitted() {
            if (this.c) {
                return;
            }
            try {
                abort();
            } catch (IOException unused) {
            }
        }

        public void commit() throws IOException {
            DiskLruCache.this.l(this, true);
            this.c = true;
        }

        public File getFile(int i) throws IOException {
            File fileK;
            synchronized (DiskLruCache.this) {
                if (this.a.f != this) {
                    throw new IllegalStateException();
                }
                if (!this.a.e) {
                    this.b[i] = true;
                }
                fileK = this.a.k(i);
                if (!DiskLruCache.this.a.exists()) {
                    DiskLruCache.this.a.mkdirs();
                }
            }
            return fileK;
        }

        public String getString(int i) throws IOException {
            InputStream inputStreamC = c(i);
            if (inputStreamC != null) {
                return DiskLruCache.o(inputStreamC);
            }
            return null;
        }

        public void set(int i, String str) throws Throwable {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(getFile(i)), com.bumptech.glide.disklrucache.b.b);
                try {
                    outputStreamWriter2.write(str);
                    com.bumptech.glide.disklrucache.b.a(outputStreamWriter2);
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter = outputStreamWriter2;
                    com.bumptech.glide.disklrucache.b.a(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        private Editor(c cVar) {
            this.a = cVar;
            this.b = cVar.e ? null : new boolean[DiskLruCache.this.g];
        }
    }

    public final class Value {
        private final String a;
        private final long b;
        private final long[] c;
        private final File[] d;

        public /* synthetic */ Value(DiskLruCache diskLruCache, String str, long j, File[] fileArr, long[] jArr, a aVar) {
            this(str, j, fileArr, jArr);
        }

        public Editor edit() throws IOException {
            return DiskLruCache.this.n(this.a, this.b);
        }

        public File getFile(int i) {
            return this.d[i];
        }

        public long getLength(int i) {
            return this.c[i];
        }

        public String getString(int i) throws IOException {
            return DiskLruCache.o(new FileInputStream(this.d[i]));
        }

        private Value(String str, long j, File[] fileArr, long[] jArr) {
            this.a = str;
            this.b = j;
            this.d = fileArr;
            this.c = jArr;
        }
    }

    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (DiskLruCache.this) {
                if (DiskLruCache.this.i == null) {
                    return null;
                }
                DiskLruCache.this.v();
                if (DiskLruCache.this.p()) {
                    DiskLruCache.this.t();
                    DiskLruCache.this.k = 0;
                }
                return null;
            }
        }
    }

    public static final class b implements ThreadFactory {
        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public final class c {
        private final String a;
        private final long[] b;
        public File[] c;
        public File[] d;
        private boolean e;
        private Editor f;
        private long g;

        public /* synthetic */ c(DiskLruCache diskLruCache, String str, a aVar) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length != DiskLruCache.this.g) {
                throw m(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public File j(int i) {
            return this.c[i];
        }

        public File k(int i) {
            return this.d[i];
        }

        public String l() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.b) {
                sb.append(StringUtil.SPACE);
                sb.append(j);
            }
            return sb.toString();
        }

        private c(String str) {
            this.a = str;
            this.b = new long[DiskLruCache.this.g];
            this.c = new File[DiskLruCache.this.g];
            this.d = new File[DiskLruCache.this.g];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < DiskLruCache.this.g; i++) {
                sb.append(i);
                this.c[i] = new File(DiskLruCache.this.a, sb.toString());
                sb.append(".tmp");
                this.d[i] = new File(DiskLruCache.this.a, sb.toString());
                sb.setLength(length);
            }
        }
    }

    private DiskLruCache(File file, int i, int i2, long j) {
        this.a = file;
        this.e = i;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.d = new File(file, "journal.bkp");
        this.g = i2;
        this.f = j;
    }

    private void k() {
        if (this.i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void l(Editor editor, boolean z) throws IOException {
        c cVar = editor.a;
        if (cVar.f != editor) {
            throw new IllegalStateException();
        }
        if (z && !cVar.e) {
            for (int i = 0; i < this.g; i++) {
                if (!editor.b[i]) {
                    editor.abort();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!cVar.k(i).exists()) {
                    editor.abort();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.g; i2++) {
            File fileK = cVar.k(i2);
            if (!z) {
                m(fileK);
            } else if (fileK.exists()) {
                File fileJ = cVar.j(i2);
                fileK.renameTo(fileJ);
                long j = cVar.b[i2];
                long length = fileJ.length();
                cVar.b[i2] = length;
                this.h = (this.h - j) + length;
            }
        }
        this.k++;
        cVar.f = null;
        if (cVar.e || z) {
            cVar.e = true;
            this.i.append((CharSequence) u);
            this.i.append(StringUtil.SPACE);
            this.i.append((CharSequence) cVar.a);
            this.i.append((CharSequence) cVar.l());
            this.i.append('\n');
            if (z) {
                long j2 = this.l;
                this.l = 1 + j2;
                cVar.g = j2;
            }
        } else {
            this.j.remove(cVar.a);
            this.i.append((CharSequence) w);
            this.i.append(StringUtil.SPACE);
            this.i.append((CharSequence) cVar.a);
            this.i.append('\n');
        }
        this.i.flush();
        if (this.h > this.f || p()) {
            this.m.submit(this.n);
        }
    }

    private static void m(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized Editor n(String str, long j) throws IOException {
        k();
        c cVar = this.j.get(str);
        a aVar = null;
        if (j != -1 && (cVar == null || cVar.g != j)) {
            return null;
        }
        if (cVar == null) {
            cVar = new c(this, str, aVar);
            this.j.put(str, cVar);
        } else if (cVar.f != null) {
            return null;
        }
        Editor editor = new Editor(this, cVar, aVar);
        cVar.f = editor;
        this.i.append((CharSequence) v);
        this.i.append(StringUtil.SPACE);
        this.i.append((CharSequence) str);
        this.i.append('\n');
        this.i.flush();
        return editor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String o(InputStream inputStream) throws IOException {
        return com.bumptech.glide.disklrucache.b.c(new InputStreamReader(inputStream, com.bumptech.glide.disklrucache.b.b));
    }

    public static DiskLruCache open(File file, int i, int i2, long j) throws IOException {
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
                u(file2, file3, false);
            }
        }
        DiskLruCache diskLruCache = new DiskLruCache(file, i, i2, j);
        if (diskLruCache.b.exists()) {
            try {
                diskLruCache.r();
                diskLruCache.q();
                return diskLruCache;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                diskLruCache.delete();
            }
        }
        file.mkdirs();
        DiskLruCache diskLruCache2 = new DiskLruCache(file, i, i2, j);
        diskLruCache2.t();
        return diskLruCache2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        int i = this.k;
        return i >= 2000 && i >= this.j.size();
    }

    private void q() throws IOException {
        m(this.c);
        Iterator<c> it2 = this.j.values().iterator();
        while (it2.hasNext()) {
            c next = it2.next();
            int i = 0;
            if (next.f == null) {
                while (i < this.g) {
                    this.h += next.b[i];
                    i++;
                }
            } else {
                next.f = null;
                while (i < this.g) {
                    m(next.j(i));
                    m(next.k(i));
                    i++;
                }
                it2.remove();
            }
        }
    }

    private void r() throws IOException {
        com.bumptech.glide.disklrucache.a aVar = new com.bumptech.glide.disklrucache.a(new FileInputStream(this.b), com.bumptech.glide.disklrucache.b.a);
        try {
            String strD = aVar.d();
            String strD2 = aVar.d();
            String strD3 = aVar.d();
            String strD4 = aVar.d();
            String strD5 = aVar.d();
            if (!"libcore.io.DiskLruCache".equals(strD) || !"1".equals(strD2) || !Integer.toString(this.e).equals(strD3) || !Integer.toString(this.g).equals(strD4) || !"".equals(strD5)) {
                throw new IOException("unexpected journal header: [" + strD + ", " + strD2 + ", " + strD4 + ", " + strD5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    s(aVar.d());
                    i++;
                } catch (EOFException unused) {
                    this.k = i - this.j.size();
                    if (aVar.c()) {
                        t();
                    } else {
                        this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), com.bumptech.glide.disklrucache.b.a));
                    }
                    com.bumptech.glide.disklrucache.b.a(aVar);
                    return;
                }
            }
        } catch (Throwable th) {
            com.bumptech.glide.disklrucache.b.a(aVar);
            throw th;
        }
    }

    private void s(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith(w)) {
                this.j.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        c cVar = this.j.get(strSubstring);
        a aVar = null;
        if (cVar == null) {
            cVar = new c(this, strSubstring, aVar);
            this.j.put(strSubstring, cVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith(u)) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            cVar.e = true;
            cVar.f = null;
            cVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith(v)) {
            cVar.f = new Editor(this, cVar, aVar);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith(x)) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void t() throws IOException {
        Writer writer = this.i;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), com.bumptech.glide.disklrucache.b.a));
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
            for (c cVar : this.j.values()) {
                if (cVar.f != null) {
                    bufferedWriter.write("DIRTY " + cVar.a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + cVar.a + cVar.l() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.b.exists()) {
                u(this.b, this.d, true);
            }
            u(this.c, this.b, false);
            this.d.delete();
            this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), com.bumptech.glide.disklrucache.b.a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    private static void u(File file, File file2, boolean z) throws IOException {
        if (z) {
            m(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() throws IOException {
        while (this.h > this.f) {
            remove(this.j.entrySet().iterator().next().getKey());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.i == null) {
            return;
        }
        for (c cVar : new ArrayList(this.j.values())) {
            if (cVar.f != null) {
                cVar.f.abort();
            }
        }
        v();
        this.i.close();
        this.i = null;
    }

    public void delete() throws IOException {
        close();
        com.bumptech.glide.disklrucache.b.b(this.a);
    }

    public Editor edit(String str) throws IOException {
        return n(str, -1L);
    }

    public synchronized void flush() throws IOException {
        k();
        v();
        this.i.flush();
    }

    public synchronized Value get(String str) throws IOException {
        k();
        c cVar = this.j.get(str);
        if (cVar == null) {
            return null;
        }
        if (!cVar.e) {
            return null;
        }
        for (File file : cVar.c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.k++;
        this.i.append((CharSequence) x);
        this.i.append(StringUtil.SPACE);
        this.i.append((CharSequence) str);
        this.i.append('\n');
        if (p()) {
            this.m.submit(this.n);
        }
        return new Value(this, str, cVar.g, cVar.c, cVar.b, null);
    }

    public File getDirectory() {
        return this.a;
    }

    public synchronized long getMaxSize() {
        return this.f;
    }

    public synchronized boolean isClosed() {
        return this.i == null;
    }

    public synchronized boolean remove(String str) throws IOException {
        k();
        c cVar = this.j.get(str);
        if (cVar != null && cVar.f == null) {
            for (int i = 0; i < this.g; i++) {
                File fileJ = cVar.j(i);
                if (fileJ.exists() && !fileJ.delete()) {
                    throw new IOException("failed to delete " + fileJ);
                }
                this.h -= cVar.b[i];
                cVar.b[i] = 0;
            }
            this.k++;
            this.i.append((CharSequence) w);
            this.i.append(StringUtil.SPACE);
            this.i.append((CharSequence) str);
            this.i.append('\n');
            this.j.remove(str);
            if (p()) {
                this.m.submit(this.n);
            }
            return true;
        }
        return false;
    }

    public synchronized void setMaxSize(long j) {
        this.f = j;
        this.m.submit(this.n);
    }

    public synchronized long size() {
        return this.h;
    }
}
