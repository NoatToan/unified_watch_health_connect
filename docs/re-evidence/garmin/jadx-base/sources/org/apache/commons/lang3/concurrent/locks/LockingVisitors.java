package org.apache.commons.lang3.concurrent.locks;

import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.StampedLock;
import java.util.function.Supplier;
import org.apache.commons.lang3.function.Failable;
import org.apache.commons.lang3.function.FailableConsumer;
import org.apache.commons.lang3.function.FailableFunction;

/* JADX INFO: loaded from: classes3.dex */
public class LockingVisitors {

    public static class LockVisitor<O, L> {
        private final L lock;
        private final O object;
        private final Supplier<Lock> readLockSupplier;
        private final Supplier<Lock> writeLockSupplier;

        public LockVisitor(O o7, L l14, Supplier<Lock> supplier, Supplier<Lock> supplier2) {
            Objects.requireNonNull(o7, "object");
            this.object = o7;
            Objects.requireNonNull(l14, "lock");
            this.lock = l14;
            Objects.requireNonNull(supplier, "readLockSupplier");
            this.readLockSupplier = supplier;
            Objects.requireNonNull(supplier2, "writeLockSupplier");
            this.writeLockSupplier = supplier2;
        }

        public void acceptReadLocked(FailableConsumer<O, ?> failableConsumer) {
            lockAcceptUnlock(this.readLockSupplier, failableConsumer);
        }

        public void acceptWriteLocked(FailableConsumer<O, ?> failableConsumer) {
            lockAcceptUnlock(this.writeLockSupplier, failableConsumer);
        }

        public <T> T applyReadLocked(FailableFunction<O, T, ?> failableFunction) {
            return (T) lockApplyUnlock(this.readLockSupplier, failableFunction);
        }

        public <T> T applyWriteLocked(FailableFunction<O, T, ?> failableFunction) {
            return (T) lockApplyUnlock(this.writeLockSupplier, failableFunction);
        }

        public L getLock() {
            return this.lock;
        }

        public O getObject() {
            return this.object;
        }

        public void lockAcceptUnlock(Supplier<Lock> supplier, FailableConsumer<O, ?> failableConsumer) {
            Lock lock = supplier.get();
            lock.lock();
            try {
                failableConsumer.accept(this.object);
                lock.unlock();
            } catch (Throwable th3) {
                try {
                    throw Failable.rethrow(th3);
                } catch (Throwable th4) {
                    lock.unlock();
                    throw th4;
                }
            }
        }

        public <T> T lockApplyUnlock(Supplier<Lock> supplier, FailableFunction<O, T, ?> failableFunction) {
            Lock lock = supplier.get();
            lock.lock();
            try {
                T tApply = failableFunction.apply(this.object);
                lock.unlock();
                return tApply;
            } catch (Throwable th3) {
                try {
                    throw Failable.rethrow(th3);
                } catch (Throwable th4) {
                    lock.unlock();
                    throw th4;
                }
            }
        }
    }

    public static class ReadWriteLockVisitor<O> extends LockVisitor<O, ReadWriteLock> {
        /* JADX WARN: Illegal instructions before constructor call */
        public ReadWriteLockVisitor(O o7, final ReadWriteLock readWriteLock) {
            readWriteLock.getClass();
            final int i14 = 0;
            final int i15 = 1;
            super(o7, readWriteLock, new Supplier() { // from class: z63.a
                @Override // java.util.function.Supplier
                public final Object get() {
                    switch (i14) {
                        case 0:
                            return readWriteLock.readLock();
                        default:
                            return readWriteLock.writeLock();
                    }
                }
            }, new Supplier() { // from class: z63.a
                @Override // java.util.function.Supplier
                public final Object get() {
                    switch (i15) {
                        case 0:
                            return readWriteLock.readLock();
                        default:
                            return readWriteLock.writeLock();
                    }
                }
            });
        }
    }

    public static class StampedLockVisitor<O> extends LockVisitor<O, StampedLock> {
        /* JADX WARN: Illegal instructions before constructor call */
        public StampedLockVisitor(O o7, final StampedLock stampedLock) {
            stampedLock.getClass();
            final int i14 = 0;
            final int i15 = 1;
            super(o7, stampedLock, new Supplier() { // from class: z63.b
                @Override // java.util.function.Supplier
                public final Object get() {
                    switch (i14) {
                        case 0:
                            return stampedLock.asReadLock();
                        default:
                            return stampedLock.asWriteLock();
                    }
                }
            }, new Supplier() { // from class: z63.b
                @Override // java.util.function.Supplier
                public final Object get() {
                    switch (i15) {
                        case 0:
                            return stampedLock.asReadLock();
                        default:
                            return stampedLock.asWriteLock();
                    }
                }
            });
        }
    }

    public static <O> ReadWriteLockVisitor<O> reentrantReadWriteLockVisitor(O o7) {
        return new ReadWriteLockVisitor<>(o7, new ReentrantReadWriteLock());
    }

    public static <O> StampedLockVisitor<O> stampedLockVisitor(O o7) {
        return new StampedLockVisitor<>(o7, new StampedLock());
    }
}
