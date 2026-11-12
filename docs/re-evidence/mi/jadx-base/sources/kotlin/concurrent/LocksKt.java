package kotlin.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@JvmName(name = "LocksKt")
@SourceDebugExtension({"SMAP\nLocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Locks.kt\nkotlin/concurrent/LocksKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
public final class LocksKt {
    @InlineOnly
    private static final <T> T read(ReentrantReadWriteLock reentrantReadWriteLock, Function0<? extends T> action) {
        Intrinsics.checkNotNullParameter(reentrantReadWriteLock, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            return action.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            lock.unlock();
            InlineMarker.finallyEnd(1);
        }
    }

    @InlineOnly
    private static final <T> T withLock(Lock lock, Function0<? extends T> action) {
        Intrinsics.checkNotNullParameter(lock, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        lock.lock();
        try {
            return action.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            lock.unlock();
            InlineMarker.finallyEnd(1);
        }
    }

    @InlineOnly
    private static final <T> T write(ReentrantReadWriteLock reentrantReadWriteLock, Function0<? extends T> action) {
        Intrinsics.checkNotNullParameter(reentrantReadWriteLock, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            return action.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            InlineMarker.finallyEnd(1);
        }
    }
}
