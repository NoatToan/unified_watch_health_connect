package com.xiaomi.continuity.jni;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class NObject {
    private static final ConcurrentHashMap<Long, WeakReference<NObject>> sNObjMap;
    private long mNDataHandle;

    static {
        System.loadLibrary("micontinuity_sdk");
        setFallbackClassLoader(NObject.class.getClassLoader());
        sNObjMap = new ConcurrentHashMap<>();
    }

    private void attachNData(long j) {
        this.mNDataHandle = j;
        sNObjMap.put(Long.valueOf(j), new WeakReference<>(this));
    }

    private static native void freeNData(long j);

    private long getNDataHandle() {
        return this.mNDataHandle;
    }

    private static NObject getNObject(long j) {
        ConcurrentHashMap<Long, WeakReference<NObject>> concurrentHashMap = sNObjMap;
        WeakReference<NObject> weakReference = concurrentHashMap.get(Long.valueOf(j));
        if (weakReference == null) {
            return null;
        }
        NObject nObject = weakReference.get();
        if (nObject != null) {
            return nObject;
        }
        concurrentHashMap.remove(Long.valueOf(j));
        return null;
    }

    public static native void setClassLoader(ClassLoader classLoader);

    private static native void setFallbackClassLoader(ClassLoader classLoader);

    public void finalize() throws Throwable {
        super.finalize();
        freeNData(this.mNDataHandle);
        sNObjMap.remove(Long.valueOf(this.mNDataHandle));
        this.mNDataHandle = 0L;
    }
}
