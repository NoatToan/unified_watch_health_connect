package com.huami.watch.companion.xiaomiai.alexa;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes16.dex */
public class CacheFileManager {
    private static CacheFileManager sInstance;
    private ConcurrentHashMap<String, FileCache> mFileCaches = new ConcurrentHashMap<>();

    private CacheFileManager() {
    }

    public static CacheFileManager getInstance() {
        if (sInstance == null) {
            synchronized (CacheFileManager.class) {
                sInstance = new CacheFileManager();
            }
        }
        return sInstance;
    }

    public void addFileCache(String str, FileCache fileCache) {
        this.mFileCaches.put(str, fileCache);
    }

    public FileCache getFileCache(String str) {
        return this.mFileCaches.get(str);
    }

    public FileCache removeFileCache(String str) {
        return this.mFileCaches.remove(str);
    }
}
