package com.xiaomi.smarthome.library.common.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes2.dex */
public class ListCache<T> {
    private static final int DEFAULT_MAX_SIZE = 16;
    private final ArrayList<T> mBackend;
    private int mCurrentWritePos;
    private ReentrantReadWriteLock mLock;
    private int mMaxSize;
    private ReentrantReadWriteLock.ReadLock mReadLock;
    private ReentrantReadWriteLock.WriteLock mWriteLock;

    public ListCache(int i) {
        this.mMaxSize = 16;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mLock = reentrantReadWriteLock;
        this.mWriteLock = reentrantReadWriteLock.writeLock();
        this.mReadLock = this.mLock.readLock();
        this.mCurrentWritePos = 0;
        i = i <= 4 ? 4 : i;
        this.mMaxSize = i;
        this.mBackend = new ArrayList<>(Collections.nCopies(i, null));
    }

    public boolean add(T t) {
        this.mWriteLock.lock();
        try {
            try {
                int i = this.mCurrentWritePos % this.mMaxSize;
                this.mBackend.set(i, t);
                this.mCurrentWritePos = (i + 1) % this.mMaxSize;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return false;
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void clear() {
        this.mWriteLock.lock();
        try {
            try {
                this.mBackend.clear();
                this.mCurrentWritePos = 0;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public boolean contains(Object obj) {
        return this.mBackend.contains(obj);
    }

    public T get(int i) {
        this.mReadLock.lock();
        try {
            try {
                this.mBackend.get(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        } finally {
            this.mReadLock.unlock();
        }
    }

    public boolean isEmpty() {
        return this.mBackend.isEmpty();
    }

    public int maxSize() {
        return this.mMaxSize;
    }

    public int size() {
        return this.mBackend.size();
    }

    public List<T> toList() {
        ArrayList arrayList = new ArrayList();
        this.mReadLock.lock();
        int i = 0;
        while (true) {
            try {
                try {
                    int i2 = this.mMaxSize;
                    if (i >= i2) {
                        break;
                    }
                    T t = this.mBackend.get((this.mCurrentWritePos + i) % i2);
                    if (t != null) {
                        arrayList.add(t);
                    }
                    i++;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                this.mReadLock.unlock();
                throw th;
            }
        }
        this.mReadLock.unlock();
        return arrayList;
    }
}
