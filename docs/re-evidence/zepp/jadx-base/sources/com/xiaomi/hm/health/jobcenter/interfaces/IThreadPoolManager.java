package com.xiaomi.hm.health.jobcenter.interfaces;

import com.xiaomi.hm.health.jobcenter.manager.BaseThreadPool;
import com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject;

/* JADX INFO: loaded from: classes21.dex */
public interface IThreadPoolManager {
    void addTask(ThreadJobObject task);

    BaseThreadPool getThreadPool(int threadPoolType);

    boolean removeTask(ThreadJobObject task);

    void stopAllTask();
}
