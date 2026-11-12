package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
public final class ky6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, a> f24409a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f24410b = new b();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Lock f24411a = new ReentrantLock();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24412b;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Queue<a> f24413a = new ArrayDeque();

        public a a() {
            a aVarPoll;
            synchronized (this.f24413a) {
                aVarPoll = this.f24413a.poll();
            }
            return aVarPoll == null ? new a() : aVarPoll;
        }

        public void b(a aVar) {
            synchronized (this.f24413a) {
                try {
                    if (this.f24413a.size() < 10) {
                        this.f24413a.offer(aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void a(String str) {
        a aVarA;
        synchronized (this) {
            try {
                aVarA = this.f24409a.get(str);
                if (aVarA == null) {
                    aVarA = this.f24410b.a();
                    this.f24409a.put(str, aVarA);
                }
                aVarA.f24412b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        aVarA.f24411a.lock();
    }

    public void b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) a6i.d(this.f24409a.get(str));
                int i = aVar.f24412b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f24412b);
                }
                int i2 = i - 1;
                aVar.f24412b = i2;
                if (i2 == 0) {
                    a aVarRemove = this.f24409a.remove(str);
                    if (!aVarRemove.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVarRemove + ", safeKey: " + str);
                    }
                    this.f24410b.b(aVarRemove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.f24411a.unlock();
    }
}
