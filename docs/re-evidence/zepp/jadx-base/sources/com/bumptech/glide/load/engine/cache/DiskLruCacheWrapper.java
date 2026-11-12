package com.bumptech.glide.load.engine.cache;

import android.util.Log;
import com.bumptech.glide.disklrucache.DiskLruCache;
import com.bumptech.glide.load.Key;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class DiskLruCacheWrapper implements DiskCache {
    private static final String f = "DiskLruCacheWrapper";
    private static final int g = 1;
    private static final int h = 1;
    private static DiskLruCacheWrapper i;
    private final File b;
    private final long c;
    private DiskLruCache e;
    private final a d = new a();
    private final SafeKeyGenerator a = new SafeKeyGenerator();

    @Deprecated
    public DiskLruCacheWrapper(File file, long j) {
        this.b = file;
        this.c = j;
    }

    private synchronized DiskLruCache a() throws IOException {
        if (this.e == null) {
            this.e = DiskLruCache.open(this.b, 1, 1, this.c);
        }
        return this.e;
    }

    private synchronized void b() {
        this.e = null;
    }

    public static DiskCache create(File file, long j) {
        return new DiskLruCacheWrapper(file, j);
    }

    @Deprecated
    public static synchronized DiskCache get(File file, long j) {
        if (i == null) {
            i = new DiskLruCacheWrapper(file, j);
        }
        return i;
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public synchronized void clear() {
        try {
            try {
                a().delete();
            } catch (IOException e) {
                if (Log.isLoggable(f, 5)) {
                    Log.w(f, "Unable to clear disk cache or disk cache cleared externally", e);
                }
            }
            b();
        } catch (Throwable th) {
            b();
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public void delete(Key key) {
        try {
            a().remove(this.a.getSafeKey(key));
        } catch (IOException e) {
            if (Log.isLoggable(f, 5)) {
                Log.w(f, "Unable to delete from disk cache", e);
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public void put(Key key, DiskCache.Writer writer) {
        String safeKey = this.a.getSafeKey(key);
        this.d.a(safeKey);
        try {
            if (Log.isLoggable(f, 2)) {
                Log.v(f, "Put: Obtained: " + safeKey + " for for Key: " + key);
            }
            try {
                DiskLruCache diskLruCacheA = a();
                if (diskLruCacheA.get(safeKey) != null) {
                    this.d.b(safeKey);
                    return;
                }
                DiskLruCache.Editor editorEdit = diskLruCacheA.edit(safeKey);
                if (editorEdit == null) {
                    throw new IllegalStateException("Had two simultaneous puts for: " + safeKey);
                }
                try {
                    if (writer.write(editorEdit.getFile(0))) {
                        editorEdit.commit();
                    }
                    editorEdit.abortUnlessCommitted();
                    this.d.b(safeKey);
                } catch (Throwable th) {
                    editorEdit.abortUnlessCommitted();
                    throw th;
                }
            } catch (IOException e) {
                if (Log.isLoggable(f, 5)) {
                    Log.w(f, "Unable to put to disk cache", e);
                }
            }
        } catch (Throwable th2) {
            this.d.b(safeKey);
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public File get(Key key) {
        String safeKey = this.a.getSafeKey(key);
        if (Log.isLoggable(f, 2)) {
            Log.v(f, "Get: Obtained: " + safeKey + " for for Key: " + key);
        }
        try {
            DiskLruCache.Value value = a().get(safeKey);
            if (value != null) {
                return value.getFile(0);
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable(f, 5)) {
                return null;
            }
            Log.w(f, "Unable to get from disk cache", e);
            return null;
        }
    }
}
