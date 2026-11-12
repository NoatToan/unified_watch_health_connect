package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.util.Preconditions;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
final class a {
    private final Map<String, C0121a> a = new HashMap();
    private final b b = new b();

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.cache.a$a, reason: collision with other inner class name */
    public static class C0121a {
        public final Lock a = new ReentrantLock();
        public int b;
    }

    public static class b {
        private static final int b = 10;
        private final Queue<C0121a> a = new ArrayDeque();

        public C0121a a() {
            C0121a c0121aPoll;
            synchronized (this.a) {
                c0121aPoll = this.a.poll();
            }
            return c0121aPoll == null ? new C0121a() : c0121aPoll;
        }

        public void b(C0121a c0121a) {
            synchronized (this.a) {
                if (this.a.size() < 10) {
                    this.a.offer(c0121a);
                }
            }
        }
    }

    public void a(String str) {
        C0121a c0121aA;
        synchronized (this) {
            c0121aA = this.a.get(str);
            if (c0121aA == null) {
                c0121aA = this.b.a();
                this.a.put(str, c0121aA);
            }
            c0121aA.b++;
        }
        c0121aA.a.lock();
    }

    public void b(String str) {
        C0121a c0121a;
        synchronized (this) {
            c0121a = (C0121a) Preconditions.checkNotNull(this.a.get(str));
            int i = c0121a.b;
            if (i < 1) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c0121a.b);
            }
            int i2 = i - 1;
            c0121a.b = i2;
            if (i2 == 0) {
                C0121a c0121aRemove = this.a.remove(str);
                if (!c0121aRemove.equals(c0121a)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c0121a + ", but actually removed: " + c0121aRemove + ", safeKey: " + str);
                }
                this.b.b(c0121aRemove);
            }
        }
        c0121a.a.unlock();
    }
}
