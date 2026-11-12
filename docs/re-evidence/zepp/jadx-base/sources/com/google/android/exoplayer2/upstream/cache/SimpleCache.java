package com.google.android.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public final class SimpleCache implements Cache {
    private static final String l = "SimpleCache";
    private static final int m = 10;
    private static final String n = ".uid";
    private static final HashSet<File> o = new HashSet<>();
    private final File a;
    private final CacheEvictor b;
    private final d c;

    @Nullable
    private final b d;
    private final HashMap<String, ArrayList<Cache.Listener>> e;
    private final Random f;
    private final boolean g;
    private long h;
    private long i;
    private boolean j;
    private Cache.CacheException k;

    public class a extends Thread {
        public final /* synthetic */ ConditionVariable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String name, final ConditionVariable val$conditionVariable) {
            super(name);
            this.a = val$conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (SimpleCache.this) {
                this.a.open();
                SimpleCache.this.g();
                SimpleCache.this.b.onCacheInitialized();
            }
        }
    }

    @Deprecated
    public SimpleCache(File cacheDir, CacheEvictor evictor) {
        this(cacheDir, evictor, (byte[]) null, false);
    }

    private void c(f span) {
        this.c.o(span.key).a(span);
        this.i += span.length;
        k(span);
    }

    private static void d(File cacheDir) throws Cache.CacheException {
        if (cacheDir.mkdirs() || cacheDir.isDirectory()) {
            return;
        }
        String strValueOf = String.valueOf(cacheDir);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 34);
        sb.append("Failed to create cache directory: ");
        sb.append(strValueOf);
        String string = sb.toString();
        Log.e(l, string);
        throw new Cache.CacheException(string);
    }

    @WorkerThread
    public static void delete(File cacheDir, @Nullable DatabaseProvider databaseProvider) {
        if (cacheDir.exists()) {
            File[] fileArrListFiles = cacheDir.listFiles();
            if (fileArrListFiles == null) {
                cacheDir.delete();
                return;
            }
            if (databaseProvider != null) {
                long jI = i(fileArrListFiles);
                if (jI != -1) {
                    try {
                        b.a(databaseProvider, jI);
                    } catch (DatabaseIOException unused) {
                        StringBuilder sb = new StringBuilder(52);
                        sb.append("Failed to delete file metadata: ");
                        sb.append(jI);
                        Log.w(l, sb.toString());
                    }
                    try {
                        d.g(databaseProvider, jI);
                    } catch (DatabaseIOException unused2) {
                        StringBuilder sb2 = new StringBuilder(52);
                        sb2.append("Failed to delete file metadata: ");
                        sb2.append(jI);
                        Log.w(l, sb2.toString());
                    }
                }
            }
            Util.recursiveDelete(cacheDir);
        }
    }

    private static long e(File directory) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        String strValueOf = String.valueOf(Long.toString(jAbs, 16));
        File file = new File(directory, n.length() != 0 ? strValueOf.concat(n) : new String(strValueOf));
        if (file.createNewFile()) {
            return jAbs;
        }
        String strValueOf2 = String.valueOf(file);
        StringBuilder sb = new StringBuilder(strValueOf2.length() + 27);
        sb.append("Failed to create UID file: ");
        sb.append(strValueOf2);
        throw new IOException(sb.toString());
    }

    private f f(String key, long position, long length) {
        f fVarE;
        c cVarH = this.c.h(key);
        if (cVarH == null) {
            return f.d(key, position, length);
        }
        while (true) {
            fVarE = cVarH.e(position, length);
            if (!fVarE.isCached || fVarE.file.length() == fVarE.length) {
                break;
            }
            p();
        }
        return fVarE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (!this.a.exists()) {
            try {
                d(this.a);
            } catch (Cache.CacheException e) {
                this.k = e;
                return;
            }
        }
        File[] fileArrListFiles = this.a.listFiles();
        if (fileArrListFiles == null) {
            String strValueOf = String.valueOf(this.a);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 38);
            sb.append("Failed to list cache directory files: ");
            sb.append(strValueOf);
            String string = sb.toString();
            Log.e(l, string);
            this.k = new Cache.CacheException(string);
            return;
        }
        long jI = i(fileArrListFiles);
        this.h = jI;
        if (jI == -1) {
            try {
                this.h = e(this.a);
            } catch (IOException e2) {
                String strValueOf2 = String.valueOf(this.a);
                StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 28);
                sb2.append("Failed to create cache UID: ");
                sb2.append(strValueOf2);
                String string2 = sb2.toString();
                Log.e(l, string2, e2);
                this.k = new Cache.CacheException(string2, e2);
                return;
            }
        }
        try {
            this.c.p(this.h);
            b bVar = this.d;
            if (bVar != null) {
                bVar.f(this.h);
                Map<String, com.google.android.exoplayer2.upstream.cache.a> mapC = this.d.c();
                h(this.a, true, fileArrListFiles, mapC);
                this.d.h(mapC.keySet());
            } else {
                h(this.a, true, fileArrListFiles, null);
            }
            this.c.t();
            try {
                this.c.u();
            } catch (IOException e3) {
                Log.e(l, "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String strValueOf3 = String.valueOf(this.a);
            StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 36);
            sb3.append("Failed to initialize cache indices: ");
            sb3.append(strValueOf3);
            String string3 = sb3.toString();
            Log.e(l, string3, e4);
            this.k = new Cache.CacheException(string3, e4);
        }
    }

    private void h(File directory, boolean isRoot, @Nullable File[] files, @Nullable Map<String, com.google.android.exoplayer2.upstream.cache.a> fileMetadata) {
        if (files == null || files.length == 0) {
            if (isRoot) {
                return;
            }
            directory.delete();
            return;
        }
        for (File file : files) {
            String name = file.getName();
            if (isRoot && name.indexOf(46) == -1) {
                h(file, false, file.listFiles(), fileMetadata);
            } else if (!isRoot || (!d.q(name) && !name.endsWith(n))) {
                long j = -1;
                long j2 = C.TIME_UNSET;
                com.google.android.exoplayer2.upstream.cache.a aVarRemove = fileMetadata != null ? fileMetadata.remove(name) : null;
                if (aVarRemove != null) {
                    j = aVarRemove.a;
                    j2 = aVarRemove.b;
                }
                f fVarB = f.b(file, j, j2, this.c);
                if (fVarB != null) {
                    c(fVarB);
                } else {
                    file.delete();
                }
            }
        }
    }

    private static long i(File[] files) {
        int length = files.length;
        for (int i = 0; i < length; i++) {
            File file = files[i];
            String name = file.getName();
            if (name.endsWith(n)) {
                try {
                    return n(name);
                } catch (NumberFormatException unused) {
                    String strValueOf = String.valueOf(file);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 20);
                    sb.append("Malformed UID file: ");
                    sb.append(strValueOf);
                    Log.e(l, sb.toString());
                    file.delete();
                }
            }
        }
        return -1L;
    }

    public static synchronized boolean isCacheFolderLocked(File cacheFolder) {
        return o.contains(cacheFolder.getAbsoluteFile());
    }

    private static synchronized boolean j(File cacheDir) {
        return o.add(cacheDir.getAbsoluteFile());
    }

    private void k(f span) {
        ArrayList<Cache.Listener> arrayList = this.e.get(span.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanAdded(this, span);
            }
        }
        this.b.onSpanAdded(this, span);
    }

    private void l(CacheSpan span) {
        ArrayList<Cache.Listener> arrayList = this.e.get(span.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanRemoved(this, span);
            }
        }
        this.b.onSpanRemoved(this, span);
    }

    private void m(f oldSpan, CacheSpan newSpan) {
        ArrayList<Cache.Listener> arrayList = this.e.get(oldSpan.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanTouched(this, oldSpan, newSpan);
            }
        }
        this.b.onSpanTouched(this, oldSpan, newSpan);
    }

    private static long n(String fileName) {
        return Long.parseLong(fileName.substring(0, fileName.indexOf(46)), 16);
    }

    private void o(CacheSpan span) {
        c cVarH = this.c.h(span.key);
        if (cVarH == null || !cVarH.k(span)) {
            return;
        }
        this.i -= span.length;
        if (this.d != null) {
            String name = span.file.getName();
            try {
                this.d.g(name);
            } catch (IOException unused) {
                String strValueOf = String.valueOf(name);
                Log.w(l, strValueOf.length() != 0 ? "Failed to remove file index entry for: ".concat(strValueOf) : new String("Failed to remove file index entry for: "));
            }
        }
        this.c.r(cVarH.b);
        l(span);
    }

    private void p() {
        ArrayList arrayList = new ArrayList();
        Iterator<c> it2 = this.c.i().iterator();
        while (it2.hasNext()) {
            for (f fVar : it2.next().f()) {
                if (fVar.file.length() != fVar.length) {
                    arrayList.add(fVar);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            o((CacheSpan) arrayList.get(i));
        }
    }

    private f q(String key, f span) {
        if (!this.g) {
            return span;
        }
        String name = ((File) Assertions.checkNotNull(span.file)).getName();
        long j = span.length;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        b bVar = this.d;
        if (bVar != null) {
            try {
                bVar.i(name, j, jCurrentTimeMillis);
            } catch (IOException unused) {
                Log.w(l, "Failed to update index with new touch timestamp.");
            }
        } else {
            z = true;
        }
        f fVarL = this.c.h(key).l(span, jCurrentTimeMillis, z);
        m(span, fVarL);
        return fVarL;
    }

    private static synchronized void r(File cacheDir) {
        o.remove(cacheDir.getAbsoluteFile());
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized NavigableSet<CacheSpan> addListener(String key, Cache.Listener listener) {
        Assertions.checkState(!this.j);
        Assertions.checkNotNull(key);
        Assertions.checkNotNull(listener);
        ArrayList<Cache.Listener> arrayList = this.e.get(key);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.e.put(key, arrayList);
        }
        arrayList.add(listener);
        return getCachedSpans(key);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void applyContentMetadataMutations(String key, ContentMetadataMutations mutations) throws Cache.CacheException {
        Assertions.checkState(!this.j);
        checkInitialization();
        this.c.e(key, mutations);
        try {
            this.c.u();
        } catch (IOException e) {
            throw new Cache.CacheException(e);
        }
    }

    public synchronized void checkInitialization() throws Cache.CacheException {
        Cache.CacheException cacheException = this.k;
        if (cacheException != null) {
            throw cacheException;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void commitFile(File file, long length) throws Cache.CacheException {
        boolean z = true;
        Assertions.checkState(!this.j);
        if (file.exists()) {
            if (length == 0) {
                file.delete();
                return;
            }
            f fVar = (f) Assertions.checkNotNull(f.c(file, length, this.c));
            c cVar = (c) Assertions.checkNotNull(this.c.h(fVar.key));
            Assertions.checkState(cVar.h(fVar.position, fVar.length));
            long jA = e.a(cVar.d());
            if (jA != -1) {
                if (fVar.position + fVar.length > jA) {
                    z = false;
                }
                Assertions.checkState(z);
            }
            if (this.d == null) {
                c(fVar);
                this.c.u();
                notifyAll();
                return;
            }
            try {
                this.d.i(file.getName(), fVar.length, fVar.lastTouchTimestamp);
                c(fVar);
                try {
                    this.c.u();
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
    public synchronized long getCacheSpace() {
        Assertions.checkState(!this.j);
        return this.i;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long getCachedBytes(String key, long position, long length) {
        long j;
        long j2 = length == -1 ? Long.MAX_VALUE : length + position;
        long j3 = j2 >= 0 ? j2 : Long.MAX_VALUE;
        j = 0;
        while (position < j3) {
            long cachedLength = getCachedLength(key, position, j3 - position);
            if (cachedLength > 0) {
                j += cachedLength;
            } else {
                cachedLength = -cachedLength;
            }
            position += cachedLength;
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long getCachedLength(String key, long position, long length) {
        c cVarH;
        Assertions.checkState(!this.j);
        if (length == -1) {
            length = Long.MAX_VALUE;
        }
        cVarH = this.c.h(key);
        return cVarH != null ? cVarH.c(position, length) : -length;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized NavigableSet<CacheSpan> getCachedSpans(String key) {
        c cVarH;
        Assertions.checkState(!this.j);
        cVarH = this.c.h(key);
        return (cVarH == null || cVarH.g()) ? new TreeSet() : new TreeSet((Collection) cVarH.f());
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized ContentMetadata getContentMetadata(String key) {
        Assertions.checkState(!this.j);
        return this.c.k(key);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized Set<String> getKeys() {
        Assertions.checkState(!this.j);
        return new HashSet(this.c.m());
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long getUid() {
        return this.h;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized boolean isCached(String key, long position, long length) {
        c cVarH;
        Assertions.checkState(!this.j);
        cVarH = this.c.h(key);
        return cVarH != null && cVarH.c(position, length) >= length;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void release() {
        if (this.j) {
            return;
        }
        this.e.clear();
        p();
        try {
            try {
                this.c.u();
                r(this.a);
            } catch (IOException e) {
                Log.e(l, "Storing index file failed", e);
                r(this.a);
            }
            this.j = true;
        } catch (Throwable th) {
            r(this.a);
            this.j = true;
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void releaseHoleSpan(CacheSpan holeSpan) {
        Assertions.checkState(!this.j);
        c cVar = (c) Assertions.checkNotNull(this.c.h(holeSpan.key));
        cVar.m(holeSpan.position);
        this.c.r(cVar.b);
        notifyAll();
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void removeListener(String key, Cache.Listener listener) {
        if (this.j) {
            return;
        }
        ArrayList<Cache.Listener> arrayList = this.e.get(key);
        if (arrayList != null) {
            arrayList.remove(listener);
            if (arrayList.isEmpty()) {
                this.e.remove(key);
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void removeResource(String key) {
        Assertions.checkState(!this.j);
        Iterator<CacheSpan> it2 = getCachedSpans(key).iterator();
        while (it2.hasNext()) {
            o(it2.next());
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void removeSpan(CacheSpan span) {
        Assertions.checkState(!this.j);
        o(span);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized File startFile(String key, long position, long length) throws Cache.CacheException {
        c cVarH;
        File file;
        Assertions.checkState(!this.j);
        checkInitialization();
        cVarH = this.c.h(key);
        Assertions.checkNotNull(cVarH);
        Assertions.checkState(cVarH.h(position, length));
        if (!this.a.exists()) {
            d(this.a);
            p();
        }
        this.b.onStartFile(this, key, position, length);
        file = new File(this.a, Integer.toString(this.f.nextInt(10)));
        if (!file.exists()) {
            d(file);
        }
        return f.f(file, cVarH.a, position, System.currentTimeMillis());
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized CacheSpan startReadWrite(String key, long position, long length) throws InterruptedException, Cache.CacheException {
        CacheSpan cacheSpanStartReadWriteNonBlocking;
        Assertions.checkState(!this.j);
        checkInitialization();
        while (true) {
            cacheSpanStartReadWriteNonBlocking = startReadWriteNonBlocking(key, position, length);
            if (cacheSpanStartReadWriteNonBlocking == null) {
                wait();
            }
        }
        return cacheSpanStartReadWriteNonBlocking;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    @Nullable
    public synchronized CacheSpan startReadWriteNonBlocking(String key, long position, long length) throws Cache.CacheException {
        Assertions.checkState(!this.j);
        checkInitialization();
        f fVarF = f(key, position, length);
        if (fVarF.isCached) {
            return q(key, fVarF);
        }
        if (this.c.o(key).j(position, fVarF.length)) {
            return fVarF;
        }
        return null;
    }

    @Deprecated
    public SimpleCache(File cacheDir, CacheEvictor evictor, @Nullable byte[] secretKey) {
        this(cacheDir, evictor, secretKey, secretKey != null);
    }

    @Deprecated
    public SimpleCache(File cacheDir, CacheEvictor evictor, @Nullable byte[] secretKey, boolean encrypt) {
        this(cacheDir, evictor, null, secretKey, encrypt, true);
    }

    public SimpleCache(File cacheDir, CacheEvictor evictor, DatabaseProvider databaseProvider) {
        this(cacheDir, evictor, databaseProvider, null, false, false);
    }

    public SimpleCache(File cacheDir, CacheEvictor evictor, @Nullable DatabaseProvider databaseProvider, @Nullable byte[] legacyIndexSecretKey, boolean legacyIndexEncrypt, boolean preferLegacyIndex) {
        this(cacheDir, evictor, new d(databaseProvider, cacheDir, legacyIndexSecretKey, legacyIndexEncrypt, preferLegacyIndex), (databaseProvider == null || preferLegacyIndex) ? null : new b(databaseProvider));
    }

    public SimpleCache(File cacheDir, CacheEvictor evictor, d contentIndex, @Nullable b fileIndex) {
        if (j(cacheDir)) {
            this.a = cacheDir;
            this.b = evictor;
            this.c = contentIndex;
            this.d = fileIndex;
            this.e = new HashMap<>();
            this.f = new Random();
            this.g = evictor.requiresCacheSpanTouches();
            this.h = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new a("ExoPlayer:SimpleCacheInit", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        String strValueOf = String.valueOf(cacheDir);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 46);
        sb.append("Another SimpleCache instance uses the folder: ");
        sb.append(strValueOf);
        throw new IllegalStateException(sb.toString());
    }
}
