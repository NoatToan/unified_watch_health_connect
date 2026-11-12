package ei;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lei/n;", "", "<init>", "()V", "apollo-normalized-cache"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f64137a = new ReentrantReadWriteLock();

    public final <T> T a(e23.a<? extends T> aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f64137a;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i14 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i15 = 0; i15 < readHoldCount; i15++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            T tInvoke = aVar.invoke();
            while (i14 < readHoldCount) {
                lock.lock();
                i14++;
            }
            return tInvoke;
        } finally {
            while (i14 < readHoldCount) {
                lock.lock();
                i14++;
            }
            writeLock.unlock();
        }
    }
}
