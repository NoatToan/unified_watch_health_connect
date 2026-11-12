package q83;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends j83.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f143447a = new o();

    public static final class a extends j83.h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f143448a = new AtomicInteger();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PriorityBlockingQueue<b> f143449b = new PriorityBlockingQueue<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final y83.a f143450c = new y83.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicInteger f143451d = new AtomicInteger();

        @Override // j83.h.a
        public final j83.o a(n83.a aVar) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f143450c.e()) {
                return y83.d.f195249a;
            }
            b bVar = new b(aVar, Long.valueOf(jCurrentTimeMillis), this.f143448a.incrementAndGet());
            PriorityBlockingQueue<b> priorityBlockingQueue = this.f143449b;
            priorityBlockingQueue.add(bVar);
            AtomicInteger atomicInteger = this.f143451d;
            if (atomicInteger.getAndIncrement() != 0) {
                n nVar = new n(this, bVar);
                y83.d.a aVar2 = y83.d.f195249a;
                return y83.a.a(nVar);
            }
            do {
                b bVarPoll = priorityBlockingQueue.poll();
                if (bVarPoll != null) {
                    bVarPoll.f143452a.d();
                }
            } while (atomicInteger.decrementAndGet() > 0);
            return y83.d.f195249a;
        }

        @Override // j83.o
        public final boolean e() {
            return this.f143450c.e();
        }

        @Override // j83.o
        public final void f() {
            this.f143450c.f();
        }
    }

    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n83.a f143452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f143453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f143454c;

        public b(n83.a aVar, Long l14, int i14) {
            this.f143452a = aVar;
            this.f143453b = l14;
            this.f143454c = i14;
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            int iCompareTo = this.f143453b.compareTo(bVar2.f143453b);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int i14 = bVar2.f143454c;
            o oVar = o.f143447a;
            int i15 = this.f143454c;
            if (i15 < i14) {
                return -1;
            }
            return i15 == i14 ? 0 : 1;
        }
    }

    private o() {
    }

    @Override // j83.h
    public final j83.h.a createWorker() {
        return new a();
    }
}
