package org.eclipse.californium.scandium.dtls;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes20.dex */
public interface ReadWriteLockConnectionStore extends ResumptionSupportingConnectionStore {
    ReentrantReadWriteLock.ReadLock readLock();

    void setExecutor(ExecutorService executorService);

    void shrink(int i, AtomicBoolean atomicBoolean);

    ReentrantReadWriteLock.WriteLock writeLock();
}
