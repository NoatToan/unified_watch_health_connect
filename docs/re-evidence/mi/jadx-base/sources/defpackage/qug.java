package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes.dex */
public class qug implements Lock {
    @Override // java.util.concurrent.locks.Lock
    public void lock() {
    }

    @Override // java.util.concurrent.locks.Lock
    public void lockInterruptibly() {
    }

    @Override // java.util.concurrent.locks.Lock
    public Condition newCondition() {
        throw new UnsupportedOperationException("NoLock`s newCondition method is unsupported");
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock() {
        return true;
    }

    @Override // java.util.concurrent.locks.Lock
    public void unlock() {
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock(long j, TimeUnit timeUnit) {
        return true;
    }
}
