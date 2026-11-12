package com.google.android.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import defpackage.a93;
import defpackage.b93;
import defpackage.di4;
import defpackage.ei4;
import defpackage.i93;
import defpackage.j93;
import defpackage.jcm;
import defpackage.k93;
import defpackage.op5;
import defpackage.rk1;
import defpackage.toe;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Cache {
    public static final HashSet<File> l = new HashSet<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f8422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f8423b;
    public final k93 c;
    public final b93 d;
    public final HashMap<String, ArrayList<Cache.a>> e;
    public final Random f;
    public final boolean g;
    public long h;
    public long i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Cache.CacheException f8424k;

    public class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConditionVariable f8425a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ConditionVariable conditionVariable) {
            super(str);
            this.f8425a = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (c.this) {
                this.f8425a.open();
                c.this.p();
                c.this.f8423b.d();
            }
        }
    }

    public c(File file, b bVar, op5 op5Var, byte[] bArr, boolean z, boolean z2) {
        this(file, bVar, new k93(op5Var, file, bArr, z, z2), (op5Var == null || z2) ? null : new b93(op5Var));
    }

    public static void m(File file) throws Cache.CacheException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String strValueOf = String.valueOf(file);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 34);
        sb.append("Failed to create cache directory: ");
        sb.append(strValueOf);
        String string = sb.toString();
        toe.c("SimpleCache", string);
        throw new Cache.CacheException(string);
    }

    public static long n(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        String strValueOf = String.valueOf(Long.toString(jAbs, 16));
        File file2 = new File(file, ".uid".length() != 0 ? strValueOf.concat(".uid") : new String(strValueOf));
        if (file2.createNewFile()) {
            return jAbs;
        }
        String strValueOf2 = String.valueOf(file2);
        StringBuilder sb = new StringBuilder(strValueOf2.length() + 27);
        sb.append("Failed to create UID file: ");
        sb.append(strValueOf2);
        throw new IOException(sb.toString());
    }

    public static long r(File[] fileArr) {
        int length = fileArr.length;
        for (int i = 0; i < length; i++) {
            File file = fileArr[i];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    return w(name);
                } catch (NumberFormatException unused) {
                    String strValueOf = String.valueOf(file);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 20);
                    sb.append("Malformed UID file: ");
                    sb.append(strValueOf);
                    toe.c("SimpleCache", sb.toString());
                    file.delete();
                }
            }
        }
        return -1L;
    }

    public static synchronized boolean s(File file) {
        return l.add(file.getAbsoluteFile());
    }

    public static long w(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized di4 a(String str) {
        rk1.g(!this.j);
        return this.c.j(str);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void b(i93 i93Var) {
        rk1.g(!this.j);
        x(i93Var);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized i93 c(String str, long j, long j2) throws InterruptedException, Cache.CacheException {
        i93 i93VarF;
        rk1.g(!this.j);
        l();
        while (true) {
            i93VarF = f(str, j, j2);
            if (i93VarF == null) {
                wait();
            }
        }
        return i93VarF;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized File d(String str, long j, long j2) throws Cache.CacheException {
        j93 j93VarG;
        File file;
        try {
            rk1.g(!this.j);
            l();
            j93VarG = this.c.g(str);
            rk1.e(j93VarG);
            rk1.g(j93VarG.g(j, j2));
            if (!this.f8422a.exists()) {
                m(this.f8422a);
                y();
            }
            this.f8423b.c(this, str, j, j2);
            file = new File(this.f8422a, Integer.toString(this.f.nextInt(10)));
            if (!file.exists()) {
                m(file);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jcm.l(file, j93VarG.f22545a, j, System.currentTimeMillis());
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void e(i93 i93Var) {
        rk1.g(!this.j);
        j93 j93Var = (j93) rk1.e(this.c.g(i93Var.f20897a));
        j93Var.l(i93Var.f20898b);
        this.c.p(j93Var.f22546b);
        notifyAll();
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized i93 f(String str, long j, long j2) throws Cache.CacheException {
        rk1.g(!this.j);
        l();
        jcm jcmVarO = o(str, j, j2);
        if (jcmVarO.d) {
            return z(str, jcmVarO);
        }
        if (this.c.m(str).i(j, jcmVarO.c)) {
            return jcmVarO;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void g(File file, long j) throws Cache.CacheException {
        rk1.g(!this.j);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            jcm jcmVar = (jcm) rk1.e(jcm.h(file, j, this.c));
            j93 j93Var = (j93) rk1.e(this.c.g(jcmVar.f20897a));
            rk1.g(j93Var.g(jcmVar.f20898b, jcmVar.c));
            long jD = di4.d(j93Var.c());
            if (jD != -1) {
                rk1.g(jcmVar.f20898b + jcmVar.c <= jD);
            }
            if (this.d == null) {
                k(jcmVar);
                this.c.s();
                notifyAll();
                return;
            }
            try {
                this.d.h(file.getName(), jcmVar.c, jcmVar.f);
                k(jcmVar);
                try {
                    this.c.s();
                    notifyAll();
                    return;
                } catch (IOException e) {
                    throw new Cache.CacheException(e);
                }
            } catch (IOException e2) {
                throw new Cache.CacheException(e2);
            }
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void h(String str, ei4 ei4Var) throws Cache.CacheException {
        rk1.g(!this.j);
        l();
        this.c.e(str, ei4Var);
        try {
            this.c.s();
        } catch (IOException e) {
            throw new Cache.CacheException(e);
        }
    }

    public final void k(jcm jcmVar) {
        this.c.m(jcmVar.f20897a).a(jcmVar);
        this.i += jcmVar.c;
        t(jcmVar);
    }

    public synchronized void l() throws Cache.CacheException {
        Cache.CacheException cacheException = this.f8424k;
        if (cacheException != null) {
            throw cacheException;
        }
    }

    public final jcm o(String str, long j, long j2) {
        jcm jcmVarD;
        j93 j93VarG = this.c.g(str);
        if (j93VarG == null) {
            return jcm.i(str, j, j2);
        }
        while (true) {
            jcmVarD = j93VarG.d(j, j2);
            if (!jcmVarD.d || jcmVarD.e.length() == jcmVarD.c) {
                break;
            }
            y();
        }
        return jcmVarD;
    }

    public final void p() {
        if (!this.f8422a.exists()) {
            try {
                m(this.f8422a);
            } catch (Cache.CacheException e) {
                this.f8424k = e;
                return;
            }
        }
        File[] fileArrListFiles = this.f8422a.listFiles();
        if (fileArrListFiles == null) {
            String strValueOf = String.valueOf(this.f8422a);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 38);
            sb.append("Failed to list cache directory files: ");
            sb.append(strValueOf);
            String string = sb.toString();
            toe.c("SimpleCache", string);
            this.f8424k = new Cache.CacheException(string);
            return;
        }
        long jR = r(fileArrListFiles);
        this.h = jR;
        if (jR == -1) {
            try {
                this.h = n(this.f8422a);
            } catch (IOException e2) {
                String strValueOf2 = String.valueOf(this.f8422a);
                StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 28);
                sb2.append("Failed to create cache UID: ");
                sb2.append(strValueOf2);
                String string2 = sb2.toString();
                toe.d("SimpleCache", string2, e2);
                this.f8424k = new Cache.CacheException(string2, e2);
                return;
            }
        }
        try {
            this.c.n(this.h);
            b93 b93Var = this.d;
            if (b93Var != null) {
                b93Var.e(this.h);
                Map<String, a93> mapB = this.d.b();
                q(this.f8422a, true, fileArrListFiles, mapB);
                this.d.g(mapB.keySet());
            } else {
                q(this.f8422a, true, fileArrListFiles, null);
            }
            this.c.r();
            try {
                this.c.s();
            } catch (IOException e3) {
                toe.d("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String strValueOf3 = String.valueOf(this.f8422a);
            StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 36);
            sb3.append("Failed to initialize cache indices: ");
            sb3.append(strValueOf3);
            String string3 = sb3.toString();
            toe.d("SimpleCache", string3, e4);
            this.f8424k = new Cache.CacheException(string3, e4);
        }
    }

    public final void q(File file, boolean z, File[] fileArr, Map<String, a93> map) {
        long j;
        long j2;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                q(file2, false, file2.listFiles(), map);
            } else if (!z || (!k93.o(name) && !name.endsWith(".uid"))) {
                a93 a93VarRemove = map != null ? map.remove(name) : null;
                if (a93VarRemove != null) {
                    j2 = a93VarRemove.f789a;
                    j = a93VarRemove.f790b;
                } else {
                    j = -9223372036854775807L;
                    j2 = -1;
                }
                jcm jcmVarE = jcm.e(file2, j2, j, this.c);
                if (jcmVarE != null) {
                    k(jcmVarE);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final void t(jcm jcmVar) {
        ArrayList<Cache.a> arrayList = this.e.get(jcmVar.f20897a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).e(this, jcmVar);
            }
        }
        this.f8423b.e(this, jcmVar);
    }

    public final void u(i93 i93Var) {
        ArrayList<Cache.a> arrayList = this.e.get(i93Var.f20897a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).f(this, i93Var);
            }
        }
        this.f8423b.f(this, i93Var);
    }

    public final void v(jcm jcmVar, i93 i93Var) {
        ArrayList<Cache.a> arrayList = this.e.get(jcmVar.f20897a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).a(this, jcmVar, i93Var);
            }
        }
        this.f8423b.a(this, jcmVar, i93Var);
    }

    public final void x(i93 i93Var) {
        j93 j93VarG = this.c.g(i93Var.f20897a);
        if (j93VarG == null || !j93VarG.j(i93Var)) {
            return;
        }
        this.i -= i93Var.c;
        if (this.d != null) {
            String name = i93Var.e.getName();
            try {
                this.d.f(name);
            } catch (IOException unused) {
                String strValueOf = String.valueOf(name);
                toe.h("SimpleCache", strValueOf.length() != 0 ? "Failed to remove file index entry for: ".concat(strValueOf) : new String("Failed to remove file index entry for: "));
            }
        }
        this.c.p(j93VarG.f22546b);
        u(i93Var);
    }

    public final void y() {
        ArrayList arrayList = new ArrayList();
        Iterator<j93> it = this.c.h().iterator();
        while (it.hasNext()) {
            for (jcm jcmVar : it.next().e()) {
                if (jcmVar.e.length() != jcmVar.c) {
                    arrayList.add(jcmVar);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            x((i93) arrayList.get(i));
        }
    }

    public final jcm z(String str, jcm jcmVar) {
        boolean z;
        if (!this.g) {
            return jcmVar;
        }
        String name = ((File) rk1.e(jcmVar.e)).getName();
        long j = jcmVar.c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        b93 b93Var = this.d;
        if (b93Var != null) {
            try {
                b93Var.h(name, j, jCurrentTimeMillis);
            } catch (IOException unused) {
                toe.h("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        jcm jcmVarK = this.c.g(str).k(jcmVar, jCurrentTimeMillis, z);
        v(jcmVar, jcmVarK);
        return jcmVarK;
    }

    public c(File file, b bVar, k93 k93Var, b93 b93Var) {
        if (s(file)) {
            this.f8422a = file;
            this.f8423b = bVar;
            this.c = k93Var;
            this.d = b93Var;
            this.e = new HashMap<>();
            this.f = new Random();
            this.g = bVar.b();
            this.h = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new a("ExoPlayer:SimpleCacheInit", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        String strValueOf = String.valueOf(file);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 46);
        sb.append("Another SimpleCache instance uses the folder: ");
        sb.append(strValueOf);
        throw new IllegalStateException(sb.toString());
    }
}
