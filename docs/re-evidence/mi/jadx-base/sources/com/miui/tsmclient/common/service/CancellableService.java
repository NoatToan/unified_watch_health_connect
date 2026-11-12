package com.miui.tsmclient.common.service;

import android.app.Service;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CancellableService extends Service {
    private Map<String, WeakReference<Thread>> mTaskMap = new HashMap();
    private final Object mTaskLock = new Object();

    public void addTask(String str) {
        synchronized (this.mTaskLock) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    this.mTaskMap.put(str, new WeakReference<>(Thread.currentThread()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void afterDoTask(String str) {
    }

    public void beforeDoTask(String str) {
        Thread.interrupted();
        addTask(str);
    }

    public void cancelTask(String str) {
        Thread thread;
        synchronized (this.mTaskLock) {
            try {
                WeakReference<Thread> weakReferenceRemove = this.mTaskMap.remove(str);
                if (weakReferenceRemove != null && (thread = weakReferenceRemove.get()) != null) {
                    thread.interrupt();
                    StringBuilder sb = new StringBuilder();
                    sb.append("serviceTask:");
                    sb.append(str);
                    sb.append(" thread:");
                    sb.append(thread);
                    sb.append(" is interrupted");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeTask(String str) {
        synchronized (this.mTaskLock) {
            this.mTaskMap.remove(str);
        }
    }
}
