package rx.schedulers;

import j83.h;
import j83.o;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import y83.d;

/* JADX INFO: loaded from: classes11.dex */
public class TestScheduler extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f154932c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PriorityQueue f154933a = new PriorityQueue(11, new a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f154934b;

    public static final class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            c cVar3 = cVar;
            c cVar4 = cVar2;
            long j8 = cVar3.f154939a;
            long j14 = cVar4.f154939a;
            if (j8 != j14) {
                if (j8 < j14) {
                    return -1;
                }
                return j8 > j14 ? 1 : 0;
            }
            long j15 = cVar3.f154942d;
            long j16 = cVar4.f154942d;
            if (j15 < j16) {
                return -1;
            }
            return j15 > j16 ? 1 : 0;
        }
    }

    public final class b extends h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y83.a f154935a = new y83.a();

        public class a implements n83.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f154937a;

            public a(c cVar) {
                this.f154937a = cVar;
            }

            @Override // n83.a
            public final void d() {
                TestScheduler.this.f154933a.remove(this.f154937a);
            }
        }

        public b() {
        }

        @Override // j83.h.a
        public final o a(n83.a aVar) {
            c cVar = new c(this, 0L, aVar);
            TestScheduler.this.f154933a.add(cVar);
            a aVar2 = new a(cVar);
            d.a aVar3 = d.f195249a;
            return y83.a.a(aVar2);
        }

        @Override // j83.o
        public final boolean e() {
            return this.f154935a.e();
        }

        @Override // j83.o
        public final void f() {
            this.f154935a.f();
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f154939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n83.a f154940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h.a f154941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f154942d;

        public c(h.a aVar, long j8, n83.a aVar2) {
            long j14 = TestScheduler.f154932c;
            TestScheduler.f154932c = 1 + j14;
            this.f154942d = j14;
            this.f154939a = j8;
            this.f154940b = aVar2;
            this.f154941c = aVar;
        }

        public final String toString() {
            return String.format("TimedAction(time = %d, action = %s)", Long.valueOf(this.f154939a), this.f154940b.toString());
        }
    }

    public final void a(long j8) {
        while (true) {
            PriorityQueue priorityQueue = this.f154933a;
            if (priorityQueue.isEmpty()) {
                break;
            }
            c cVar = (c) priorityQueue.peek();
            long j14 = cVar.f154939a;
            if (j14 > j8) {
                break;
            }
            if (j14 == 0) {
                j14 = this.f154934b;
            }
            this.f154934b = j14;
            priorityQueue.remove();
            if (!cVar.f154941c.e()) {
                cVar.f154940b.d();
            }
        }
        this.f154934b = j8;
    }

    public void advanceTimeBy(long j8, TimeUnit timeUnit) {
        advanceTimeTo(timeUnit.toNanos(j8) + this.f154934b, TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long j8, TimeUnit timeUnit) {
        a(timeUnit.toNanos(j8));
    }

    @Override // j83.h
    public h.a createWorker() {
        return new b();
    }

    @Override // j83.h
    public long now() {
        return this.f154934b / 1000000;
    }

    public void triggerActions() {
        a(this.f154934b);
    }
}
