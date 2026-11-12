package com.xiaomi.hm.health.jobcenter.manager;

import android.annotation.SuppressLint;
import com.xiaomi.hm.health.jobcenter.interfaces.IThreadPoolManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class ThreadPoolManager implements IThreadPoolManager {
    private static ThreadPoolManager b;

    @SuppressLint({"UseSparseArrays"})
    private final Map<Integer, BaseThreadPool> a = new HashMap();

    public static synchronized ThreadPoolManager getInstance() {
        if (b == null) {
            b = new ThreadPoolManager();
        }
        return b;
    }

    @Override // com.xiaomi.hm.health.jobcenter.interfaces.IThreadPoolManager
    public void addTask(ThreadJobObject task) {
        BaseThreadPool baseThreadPool;
        if (task != null) {
            synchronized (this.a) {
                baseThreadPool = this.a.get(Integer.valueOf(task.a()));
                if (baseThreadPool == null) {
                    baseThreadPool = new BaseThreadPool(a.b(task.a()));
                    this.a.put(Integer.valueOf(task.a()), baseThreadPool);
                }
            }
            baseThreadPool.execute(task);
        }
    }

    @Override // com.xiaomi.hm.health.jobcenter.interfaces.IThreadPoolManager
    public BaseThreadPool getThreadPool(int threadPoolType) {
        BaseThreadPool baseThreadPool;
        synchronized (this.a) {
            baseThreadPool = this.a.get(Integer.valueOf(threadPoolType));
            if (baseThreadPool == null) {
                baseThreadPool = new BaseThreadPool(a.b(threadPoolType));
            }
        }
        return baseThreadPool;
    }

    @Override // com.xiaomi.hm.health.jobcenter.interfaces.IThreadPoolManager
    public boolean removeTask(ThreadJobObject task) {
        BaseThreadPool baseThreadPool = this.a.get(Integer.valueOf(task.a()));
        return baseThreadPool != null && baseThreadPool.remove(task);
    }

    @Override // com.xiaomi.hm.health.jobcenter.interfaces.IThreadPoolManager
    public void stopAllTask() {
        Iterator<Integer> it2 = this.a.keySet().iterator();
        while (it2.hasNext()) {
            BaseThreadPool baseThreadPool = this.a.get(it2.next());
            if (baseThreadPool != null) {
                baseThreadPool.shutdownNow();
            }
        }
        this.a.clear();
    }
}
