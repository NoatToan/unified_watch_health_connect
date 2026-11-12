package defpackage;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import rx.exceptions.MissingBackpressureException;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class pbh<T> implements p4h.b<T, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ifl f30204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f30205b;
    public final int c;

    public static final class a<T> extends xno<T> implements sc0 {
        public final xno<? super T> c;
        public final ifl.a d;
        public final boolean e;
        public final Queue<Object> f;
        public final int g;
        public volatile boolean h;
        public final AtomicLong i = new AtomicLong();
        public final AtomicLong j = new AtomicLong();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Throwable f30206k;
        public long l;

        /* JADX INFO: renamed from: pbh$a$a, reason: collision with other inner class name */
        public class C1073a implements cbi {
            public C1073a() {
            }

            @Override // defpackage.cbi
            public void request(long j) {
                if (j > 0) {
                    hx1.b(a.this.i, j);
                    a.this.c();
                }
            }
        }

        public a(ifl iflVar, xno<? super T> xnoVar, boolean z, int i) {
            this.c = xnoVar;
            this.d = iflVar.a();
            this.e = z;
            i = i <= 0 ? x5l.d : i;
            this.g = i - (i >> 2);
            if (UnsafeAccess.isUnsafeAvailable()) {
                this.f = new SpscArrayQueue(i);
            } else {
                this.f = new b8o(i);
            }
            request(i);
        }

        public boolean a(boolean z, boolean z2, xno<? super T> xnoVar, Queue<Object> queue) {
            if (xnoVar.isUnsubscribed()) {
                queue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.e) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.f30206k;
                try {
                    if (th != null) {
                        xnoVar.onError(th);
                    } else {
                        xnoVar.onCompleted();
                    }
                    this.d.unsubscribe();
                    return false;
                } catch (Throwable th2) {
                    this.d.unsubscribe();
                    throw th2;
                }
            }
            Throwable th3 = this.f30206k;
            if (th3 != null) {
                queue.clear();
                try {
                    xnoVar.onError(th3);
                    return true;
                } finally {
                    this.d.unsubscribe();
                }
            }
            if (!z2) {
                return false;
            }
            try {
                xnoVar.onCompleted();
                return true;
            } finally {
                this.d.unsubscribe();
            }
        }

        public void b() {
            xno<? super T> xnoVar = this.c;
            xnoVar.setProducer(new C1073a());
            xnoVar.add(this.d);
            xnoVar.add(this);
        }

        public void c() {
            if (this.j.getAndIncrement() == 0) {
                this.d.a(this);
            }
        }

        @Override // defpackage.sc0
        public void call() {
            long j = this.l;
            Queue<Object> queue = this.f;
            xno<? super T> xnoVar = this.c;
            long jAddAndGet = 1;
            do {
                long jC = this.i.get();
                while (jC != j) {
                    boolean z = this.h;
                    Object objPoll = queue.poll();
                    boolean z2 = objPoll == null;
                    if (a(z, z2, xnoVar, queue)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    xnoVar.onNext((Object) bxg.d(objPoll));
                    j++;
                    if (j == this.g) {
                        jC = hx1.c(this.i, j);
                        request(j);
                        j = 0;
                    }
                }
                if (jC == j && a(this.h, queue.isEmpty(), xnoVar, queue)) {
                    return;
                }
                this.l = j;
                jAddAndGet = this.j.addAndGet(-jAddAndGet);
            } while (jAddAndGet != 0);
        }

        @Override // defpackage.a6h
        public void onCompleted() {
            if (isUnsubscribed() || this.h) {
                return;
            }
            this.h = true;
            c();
        }

        @Override // defpackage.a6h
        public void onError(Throwable th) {
            if (isUnsubscribed() || this.h) {
                p5l.f(th);
                return;
            }
            this.f30206k = th;
            this.h = true;
            c();
        }

        @Override // defpackage.a6h
        public void onNext(T t) {
            if (isUnsubscribed() || this.h) {
                return;
            }
            if (this.f.offer(bxg.g(t))) {
                c();
            } else {
                onError(new MissingBackpressureException());
            }
        }
    }

    public pbh(ifl iflVar, boolean z, int i) {
        this.f30204a = iflVar;
        this.f30205b = z;
        this.c = i <= 0 ? x5l.d : i;
    }

    @Override // defpackage.zta
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public xno<? super T> call(xno<? super T> xnoVar) {
        a aVar = new a(this.f30204a, xnoVar, this.f30205b, this.c);
        aVar.b();
        return aVar;
    }
}
