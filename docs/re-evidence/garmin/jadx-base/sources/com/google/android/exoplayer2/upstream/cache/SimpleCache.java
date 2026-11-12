package com.google.android.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
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

/* JADX INFO: loaded from: classes14.dex */
public final class SimpleCache implements Cache {
    private static final int SUBDIRECTORY_COUNT = 10;
    private static final String TAG = "SimpleCache";
    private static final String UID_FILE_SUFFIX = ".uid";
    private static final HashSet<File> lockedCacheDirs = new HashSet<>();
    private final File cacheDir;
    private final CachedContentIndex contentIndex;
    private final CacheEvictor evictor;
    private final CacheFileMetadataIndex fileIndex;
    private Cache.CacheException initializationException;
    private final HashMap<String, ArrayList<Cache.Listener>> listeners;
    private final Random random;
    private boolean released;
    private long totalSpace;
    private final boolean touchCacheSpans;
    private long uid;

    public SimpleCache(File file, CacheEvictor cacheEvictor, CachedContentIndex cachedContentIndex, CacheFileMetadataIndex cacheFileMetadataIndex) {
        if (!lockFolder(file)) {
            String strValueOf = String.valueOf(file);
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 46);
            sb3.append("Another SimpleCache instance uses the folder: ");
            sb3.append(strValueOf);
            throw new IllegalStateException(sb3.toString());
        }
        this.cacheDir = file;
        this.evictor = cacheEvictor;
        this.contentIndex = cachedContentIndex;
        this.fileIndex = cacheFileMetadataIndex;
        this.listeners = new HashMap<>();
        this.random = new Random();
        this.touchCacheSpans = cacheEvictor.requiresCacheSpanTouches();
        this.uid = -1L;
        final ConditionVariable conditionVariable = new ConditionVariable();
        new Thread("ExoPlayer:SimpleCacheInit") { // from class: com.google.android.exoplayer2.upstream.cache.SimpleCache.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                synchronized (SimpleCache.this) {
                    conditionVariable.open();
                    SimpleCache.this.initialize();
                    SimpleCache.this.evictor.onCacheInitialized();
                }
            }
        }.start();
        conditionVariable.block();
    }

    private void addSpan(SimpleCacheSpan simpleCacheSpan) {
        this.contentIndex.getOrAdd(simpleCacheSpan.key).addSpan(simpleCacheSpan);
        this.totalSpace += simpleCacheSpan.length;
        notifySpanAdded(simpleCacheSpan);
    }

    private static void createCacheDirectories(File file) throws Cache.CacheException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String strValueOf = String.valueOf(file);
        StringBuilder sb3 = new StringBuilder(strValueOf.length() + 34);
        sb3.append("Failed to create cache directory: ");
        sb3.append(strValueOf);
        String string = sb3.toString();
        Log.e(TAG, string);
        throw new Cache.CacheException(string);
    }

    private static long createUid(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        String strValueOf = String.valueOf(Long.toString(jAbs, 16));
        File file2 = new File(file, UID_FILE_SUFFIX.length() != 0 ? strValueOf.concat(UID_FILE_SUFFIX) : new String(strValueOf));
        if (file2.createNewFile()) {
            return jAbs;
        }
        String strValueOf2 = String.valueOf(file2);
        StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 27);
        sb3.append("Failed to create UID file: ");
        sb3.append(strValueOf2);
        throw new IOException(sb3.toString());
    }

    public static void delete(File file, DatabaseProvider databaseProvider) {
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                file.delete();
                return;
            }
            if (databaseProvider != null) {
                long jLoadUid = loadUid(fileArrListFiles);
                if (jLoadUid != -1) {
                    try {
                        CacheFileMetadataIndex.delete(databaseProvider, jLoadUid);
                    } catch (DatabaseIOException unused) {
                        StringBuilder sb3 = new StringBuilder(52);
                        sb3.append("Failed to delete file metadata: ");
                        sb3.append(jLoadUid);
                        Log.w(TAG, sb3.toString());
                    }
                    try {
                        CachedContentIndex.delete(databaseProvider, jLoadUid);
                    } catch (DatabaseIOException unused2) {
                        StringBuilder sb4 = new StringBuilder(52);
                        sb4.append("Failed to delete file metadata: ");
                        sb4.append(jLoadUid);
                        Log.w(TAG, sb4.toString());
                    }
                }
            }
            Util.recursiveDelete(file);
        }
    }

    private SimpleCacheSpan getSpan(String str, long j8, long j14) {
        SimpleCacheSpan span;
        CachedContent cachedContent = this.contentIndex.get(str);
        if (cachedContent == null) {
            return SimpleCacheSpan.createHole(str, j8, j14);
        }
        while (true) {
            span = cachedContent.getSpan(j8, j14);
            if (!span.isCached || span.file.length() == span.length) {
                break;
            }
            removeStaleSpans();
        }
        return span;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initialize() {
        if (!this.cacheDir.exists()) {
            try {
                createCacheDirectories(this.cacheDir);
            } catch (Cache.CacheException e4) {
                this.initializationException = e4;
                return;
            }
        }
        File[] fileArrListFiles = this.cacheDir.listFiles();
        if (fileArrListFiles == null) {
            String strValueOf = String.valueOf(this.cacheDir);
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 38);
            sb3.append("Failed to list cache directory files: ");
            sb3.append(strValueOf);
            String string = sb3.toString();
            Log.e(TAG, string);
            this.initializationException = new Cache.CacheException(string);
            return;
        }
        long jLoadUid = loadUid(fileArrListFiles);
        this.uid = jLoadUid;
        if (jLoadUid == -1) {
            try {
                this.uid = createUid(this.cacheDir);
            } catch (IOException e14) {
                String strValueOf2 = String.valueOf(this.cacheDir);
                StringBuilder sb4 = new StringBuilder(strValueOf2.length() + 28);
                sb4.append("Failed to create cache UID: ");
                sb4.append(strValueOf2);
                String string2 = sb4.toString();
                Log.e(TAG, string2, e14);
                this.initializationException = new Cache.CacheException(string2, e14);
                return;
            }
        }
        try {
            this.contentIndex.initialize(this.uid);
            CacheFileMetadataIndex cacheFileMetadataIndex = this.fileIndex;
            if (cacheFileMetadataIndex != null) {
                cacheFileMetadataIndex.initialize(this.uid);
                Map<String, CacheFileMetadata> all = this.fileIndex.getAll();
                loadDirectory(this.cacheDir, true, fileArrListFiles, all);
                this.fileIndex.removeAll(all.keySet());
            } else {
                loadDirectory(this.cacheDir, true, fileArrListFiles, null);
            }
            this.contentIndex.removeEmpty();
            try {
                this.contentIndex.store();
            } catch (IOException e15) {
                Log.e(TAG, "Storing index file failed", e15);
            }
        } catch (IOException e16) {
            String strValueOf3 = String.valueOf(this.cacheDir);
            StringBuilder sb5 = new StringBuilder(strValueOf3.length() + 36);
            sb5.append("Failed to initialize cache indices: ");
            sb5.append(strValueOf3);
            String string3 = sb5.toString();
            Log.e(TAG, string3, e16);
            this.initializationException = new Cache.CacheException(string3, e16);
        }
    }

    public static synchronized boolean isCacheFolderLocked(File file) {
        return lockedCacheDirs.contains(file.getAbsoluteFile());
    }

    private void loadDirectory(File file, boolean z14, File[] fileArr, Map<String, CacheFileMetadata> map) {
        long j8;
        long j14;
        if (fileArr == null || fileArr.length == 0) {
            if (z14) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z14 && name.indexOf(46) == -1) {
                loadDirectory(file2, false, file2.listFiles(), map);
            } else if (!z14 || (!CachedContentIndex.isIndexFile(name) && !name.endsWith(UID_FILE_SUFFIX))) {
                CacheFileMetadata cacheFileMetadataRemove = map != null ? map.remove(name) : null;
                if (cacheFileMetadataRemove != null) {
                    j8 = cacheFileMetadataRemove.length;
                    j14 = cacheFileMetadataRemove.lastTouchTimestamp;
                } else {
                    j8 = -1;
                    j14 = C.TIME_UNSET;
                }
                SimpleCacheSpan simpleCacheSpanCreateCacheEntry = SimpleCacheSpan.createCacheEntry(file2, j8, j14, this.contentIndex);
                if (simpleCacheSpanCreateCacheEntry != null) {
                    addSpan(simpleCacheSpanCreateCacheEntry);
                } else {
                    file2.delete();
                }
            }
        }
    }

    private static long loadUid(File[] fileArr) {
        int length = fileArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            File file = fileArr[i14];
            String name = file.getName();
            if (name.endsWith(UID_FILE_SUFFIX)) {
                try {
                    return parseUid(name);
                } catch (NumberFormatException unused) {
                    String strValueOf = String.valueOf(file);
                    StringBuilder sb3 = new StringBuilder(strValueOf.length() + 20);
                    sb3.append("Malformed UID file: ");
                    sb3.append(strValueOf);
                    Log.e(TAG, sb3.toString());
                    file.delete();
                }
            }
        }
        return -1L;
    }

    private static synchronized boolean lockFolder(File file) {
        return lockedCacheDirs.add(file.getAbsoluteFile());
    }

    private void notifySpanAdded(SimpleCacheSpan simpleCacheSpan) {
        ArrayList<Cache.Listener> arrayList = this.listeners.get(simpleCacheSpan.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanAdded(this, simpleCacheSpan);
            }
        }
        this.evictor.onSpanAdded(this, simpleCacheSpan);
    }

    private void notifySpanRemoved(CacheSpan cacheSpan) {
        ArrayList<Cache.Listener> arrayList = this.listeners.get(cacheSpan.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanRemoved(this, cacheSpan);
            }
        }
        this.evictor.onSpanRemoved(this, cacheSpan);
    }

    private void notifySpanTouched(SimpleCacheSpan simpleCacheSpan, CacheSpan cacheSpan) {
        ArrayList<Cache.Listener> arrayList = this.listeners.get(simpleCacheSpan.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanTouched(this, simpleCacheSpan, cacheSpan);
            }
        }
        this.evictor.onSpanTouched(this, simpleCacheSpan, cacheSpan);
    }

    private static long parseUid(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    private void removeSpanInternal(CacheSpan cacheSpan) {
        CachedContent cachedContent = this.contentIndex.get(cacheSpan.key);
        if (cachedContent == null || !cachedContent.removeSpan(cacheSpan)) {
            return;
        }
        this.totalSpace -= cacheSpan.length;
        if (this.fileIndex != null) {
            String name = cacheSpan.file.getName();
            try {
                this.fileIndex.remove(name);
            } catch (IOException unused) {
                String strValueOf = String.valueOf(name);
                Log.w(TAG, strValueOf.length() != 0 ? "Failed to remove file index entry for: ".concat(strValueOf) : new String("Failed to remove file index entry for: "));
            }
        }
        this.contentIndex.maybeRemove(cachedContent.key);
        notifySpanRemoved(cacheSpan);
    }

    private void removeStaleSpans() {
        ArrayList arrayList = new ArrayList();
        Iterator<CachedContent> it = this.contentIndex.getAll().iterator();
        while (it.hasNext()) {
            for (SimpleCacheSpan simpleCacheSpan : it.next().getSpans()) {
                if (simpleCacheSpan.file.length() != simpleCacheSpan.length) {
                    arrayList.add(simpleCacheSpan);
                }
            }
        }
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            removeSpanInternal((CacheSpan) arrayList.get(i14));
        }
    }

    private SimpleCacheSpan touchSpan(String str, SimpleCacheSpan simpleCacheSpan) {
        boolean z14;
        if (!this.touchCacheSpans) {
            return simpleCacheSpan;
        }
        String name = ((File) Assertions.checkNotNull(simpleCacheSpan.file)).getName();
        long j8 = simpleCacheSpan.length;
        long jCurrentTimeMillis = System.currentTimeMillis();
        CacheFileMetadataIndex cacheFileMetadataIndex = this.fileIndex;
        if (cacheFileMetadataIndex != null) {
            try {
                cacheFileMetadataIndex.set(name, j8, jCurrentTimeMillis);
            } catch (IOException unused) {
                Log.w(TAG, "Failed to update index with new touch timestamp.");
            }
            z14 = false;
        } else {
            z14 = true;
        }
        SimpleCacheSpan lastTouchTimestamp = this.contentIndex.get(str).setLastTouchTimestamp(simpleCacheSpan, jCurrentTimeMillis, z14);
        notifySpanTouched(simpleCacheSpan, lastTouchTimestamp);
        return lastTouchTimestamp;
    }

    private static synchronized void unlockFolder(File file) {
        lockedCacheDirs.remove(file.getAbsoluteFile());
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized NavigableSet<CacheSpan> addListener(String str, Cache.Listener listener) {
        try {
            Assertions.checkState(!this.released);
            Assertions.checkNotNull(str);
            Assertions.checkNotNull(listener);
            ArrayList<Cache.Listener> arrayList = this.listeners.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.listeners.put(str, arrayList);
            }
            arrayList.add(listener);
        } catch (Throwable th3) {
            throw th3;
        }
        return getCachedSpans(str);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void applyContentMetadataMutations(String str, ContentMetadataMutations contentMetadataMutations) {
        Assertions.checkState(!this.released);
        checkInitialization();
        this.contentIndex.applyContentMetadataMutations(str, contentMetadataMutations);
        try {
            this.contentIndex.store();
        } catch (IOException e4) {
            throw new Cache.CacheException(e4);
        }
    }

    public synchronized void checkInitialization() {
        Cache.CacheException cacheException = this.initializationException;
        if (cacheException != null) {
            throw cacheException;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void commitFile(File file, long j8) {
        boolean z14 = true;
        Assertions.checkState(!this.released);
        if (file.exists()) {
            if (j8 == 0) {
                file.delete();
                return;
            }
            SimpleCacheSpan simpleCacheSpan = (SimpleCacheSpan) Assertions.checkNotNull(SimpleCacheSpan.createCacheEntry(file, j8, this.contentIndex));
            CachedContent cachedContent = (CachedContent) Assertions.checkNotNull(this.contentIndex.get(simpleCacheSpan.key));
            Assertions.checkState(cachedContent.isFullyLocked(simpleCacheSpan.position, simpleCacheSpan.length));
            long contentLength = ContentMetadata.getContentLength(cachedContent.getMetadata());
            if (contentLength != -1) {
                if (simpleCacheSpan.position + simpleCacheSpan.length > contentLength) {
                    z14 = false;
                }
                Assertions.checkState(z14);
            }
            if (this.fileIndex == null) {
                addSpan(simpleCacheSpan);
                this.contentIndex.store();
                notifyAll();
                return;
            }
            try {
                this.fileIndex.set(file.getName(), simpleCacheSpan.length, simpleCacheSpan.lastTouchTimestamp);
                addSpan(simpleCacheSpan);
                try {
                    this.contentIndex.store();
                    notifyAll();
                    return;
                } catch (IOException e4) {
                    throw new Cache.CacheException(e4);
                }
            } catch (IOException e14) {
                throw new Cache.CacheException(e14);
            }
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long getCacheSpace() {
        Assertions.checkState(!this.released);
        return this.totalSpace;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long getCachedBytes(String str, long j8, long j14) {
        long j15;
        long j16 = j14 == -1 ? Long.MAX_VALUE : j8 + j14;
        long j17 = j16 >= 0 ? j16 : Long.MAX_VALUE;
        long j18 = j8;
        j15 = 0;
        while (j18 < j17) {
            long cachedLength = getCachedLength(str, j18, j17 - j18);
            if (cachedLength > 0) {
                j15 += cachedLength;
            } else {
                cachedLength = -cachedLength;
            }
            j18 += cachedLength;
        }
        return j15;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long getCachedLength(String str, long j8, long j14) {
        CachedContent cachedContent;
        Assertions.checkState(!this.released);
        if (j14 == -1) {
            j14 = Long.MAX_VALUE;
        }
        cachedContent = this.contentIndex.get(str);
        return cachedContent != null ? cachedContent.getCachedBytesLength(j8, j14) : -j14;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized NavigableSet<CacheSpan> getCachedSpans(String str) {
        CachedContent cachedContent;
        try {
            Assertions.checkState(!this.released);
            cachedContent = this.contentIndex.get(str);
        } catch (Throwable th3) {
            throw th3;
        }
        return (cachedContent == null || cachedContent.isEmpty()) ? new TreeSet() : new TreeSet((Collection) cachedContent.getSpans());
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized ContentMetadata getContentMetadata(String str) {
        Assertions.checkState(!this.released);
        return this.contentIndex.getContentMetadata(str);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized Set<String> getKeys() {
        Assertions.checkState(!this.released);
        return new HashSet(this.contentIndex.getKeys());
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long getUid() {
        return this.uid;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized boolean isCached(String str, long j8, long j14) {
        CachedContent cachedContent;
        Assertions.checkState(!this.released);
        cachedContent = this.contentIndex.get(str);
        return cachedContent != null && cachedContent.getCachedBytesLength(j8, j14) >= j14;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void release() {
        File file;
        if (this.released) {
            return;
        }
        this.listeners.clear();
        removeStaleSpans();
        try {
            try {
                this.contentIndex.store();
                file = this.cacheDir;
            } catch (IOException e4) {
                Log.e(TAG, "Storing index file failed", e4);
                file = this.cacheDir;
            }
            unlockFolder(file);
            this.released = true;
        } catch (Throwable th3) {
            unlockFolder(this.cacheDir);
            this.released = true;
            throw th3;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void releaseHoleSpan(CacheSpan cacheSpan) {
        Assertions.checkState(!this.released);
        CachedContent cachedContent = (CachedContent) Assertions.checkNotNull(this.contentIndex.get(cacheSpan.key));
        cachedContent.unlockRange(cacheSpan.position);
        this.contentIndex.maybeRemove(cachedContent.key);
        notifyAll();
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void removeListener(String str, Cache.Listener listener) {
        if (this.released) {
            return;
        }
        ArrayList<Cache.Listener> arrayList = this.listeners.get(str);
        if (arrayList != null) {
            arrayList.remove(listener);
            if (arrayList.isEmpty()) {
                this.listeners.remove(str);
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void removeResource(String str) {
        Assertions.checkState(!this.released);
        Iterator<CacheSpan> it = getCachedSpans(str).iterator();
        while (it.hasNext()) {
            removeSpanInternal(it.next());
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void removeSpan(CacheSpan cacheSpan) {
        Assertions.checkState(!this.released);
        removeSpanInternal(cacheSpan);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized File startFile(String str, long j8, long j14) throws Throwable {
        Throwable th3;
        try {
            try {
                Assertions.checkState(!this.released);
                checkInitialization();
                CachedContent cachedContent = this.contentIndex.get(str);
                Assertions.checkNotNull(cachedContent);
                Assertions.checkState(cachedContent.isFullyLocked(j8, j14));
                if (!this.cacheDir.exists()) {
                    try {
                        createCacheDirectories(this.cacheDir);
                        removeStaleSpans();
                    } catch (Throwable th4) {
                        th3 = th4;
                        throw th3;
                    }
                }
                this.evictor.onStartFile(this, str, j8, j14);
                File file = new File(this.cacheDir, Integer.toString(this.random.nextInt(10)));
                if (!file.exists()) {
                    createCacheDirectories(file);
                }
                return SimpleCacheSpan.getCacheFile(file, cachedContent.f53131id, j8, System.currentTimeMillis());
            } catch (Throwable th5) {
                th = th5;
                th3 = th;
                throw th3;
            }
        } catch (Throwable th6) {
            th = th6;
            th3 = th;
            throw th3;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:? -> B:10:0x001e). Please report as a decompilation issue!!! */
    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized CacheSpan startReadWrite(String str, long j8, long j14) throws Throwable {
        try {
            Assertions.checkState(!this.released);
            checkInitialization();
            while (true) {
                CacheSpan cacheSpanStartReadWriteNonBlocking = startReadWriteNonBlocking(str, j8, j14);
                long j15 = j14;
                long j16 = j8;
                String str2 = str;
                if (cacheSpanStartReadWriteNonBlocking != null) {
                    return cacheSpanStartReadWriteNonBlocking;
                }
                try {
                    wait();
                    str = str2;
                    j8 = j16;
                    j14 = j15;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized CacheSpan startReadWriteNonBlocking(String str, long j8, long j14) throws Throwable {
        try {
            try {
                Assertions.checkState(!this.released);
                checkInitialization();
                SimpleCacheSpan span = getSpan(str, j8, j14);
                if (span.isCached) {
                    return touchSpan(str, span);
                }
                if (this.contentIndex.getOrAdd(str).lockRange(j8, span.length)) {
                    return span;
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Deprecated
    public SimpleCache(File file, CacheEvictor cacheEvictor, byte[] bArr) {
        this(file, cacheEvictor, bArr, bArr != null);
    }

    @Deprecated
    public SimpleCache(File file, CacheEvictor cacheEvictor, byte[] bArr, boolean z14) {
        this(file, cacheEvictor, null, bArr, z14, true);
    }

    public SimpleCache(File file, CacheEvictor cacheEvictor, DatabaseProvider databaseProvider) {
        this(file, cacheEvictor, databaseProvider, null, false, false);
    }

    public SimpleCache(File file, CacheEvictor cacheEvictor, DatabaseProvider databaseProvider, byte[] bArr, boolean z14, boolean z15) {
        this(file, cacheEvictor, new CachedContentIndex(databaseProvider, file, bArr, z14, z15), (databaseProvider == null || z15) ? null : new CacheFileMetadataIndex(databaseProvider));
    }

    @Deprecated
    public SimpleCache(File file, CacheEvictor cacheEvictor) {
        this(file, cacheEvictor, (byte[]) null, false);
    }
}
