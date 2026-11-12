package yi;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import qj.l;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f197287a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f197288b = new b();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReentrantLock f197289a = new ReentrantLock();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f197290b;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayDeque f197291a = new ArrayDeque();
    }

    public final void a(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) this.f197287a.get(str);
                l.c(aVar, "Argument must not be null");
                int i14 = aVar.f197290b;
                if (i14 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f197290b);
                }
                int i15 = i14 - 1;
                aVar.f197290b = i15;
                if (i15 == 0) {
                    a aVar2 = (a) this.f197287a.remove(str);
                    if (!aVar2.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                    b bVar = this.f197288b;
                    synchronized (bVar.f197291a) {
                        try {
                            if (bVar.f197291a.size() < 10) {
                                bVar.f197291a.offer(aVar2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        aVar.f197289a.unlock();
    }
}
