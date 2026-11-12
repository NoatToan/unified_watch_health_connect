package o83;

import j20.x;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.exceptions.MissingBackpressureException;

/* JADX INFO: loaded from: classes11.dex */
public class m<T> implements j83.e.b<T, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f130929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n83.a f130930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j83.a.d f130931c;

    public static final class a<T> extends j83.n<T> implements s83.a.InterfaceC2983a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final AtomicLong f130933f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final j83.n<? super T> f130934g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final s83.a f130936i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final n83.a f130937j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final j83.a.d f130938k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ConcurrentLinkedQueue<Object> f130932e = new ConcurrentLinkedQueue<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AtomicBoolean f130935h = new AtomicBoolean(false);

        public a(j83.n<? super T> nVar, Long l14, n83.a aVar, j83.a.d dVar) {
            this.f130934g = nVar;
            this.f130933f = l14 != null ? new AtomicLong(l14.longValue()) : null;
            this.f130937j = aVar;
            this.f130936i = new s83.a(this);
            this.f130938k = dVar;
        }

        @Override // j83.f
        public final void a() throws Throwable {
            if (this.f130935h.get()) {
                return;
            }
            s83.a aVar = this.f130936i;
            aVar.f157951b = true;
            aVar.a();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // j83.f
        public final void c(T t7) throws Throwable {
            Object obj;
            long j8;
            s83.a aVar = this.f130936i;
            AtomicLong atomicLong = this.f130933f;
            if (atomicLong != null) {
                do {
                    j8 = atomicLong.get();
                    if (j8 <= 0) {
                        boolean z14 = false;
                        try {
                            if (this.f130938k.a()) {
                                Object objPoll = this.f130932e.poll();
                                AtomicLong atomicLong2 = this.f130933f;
                                if (atomicLong2 != null && objPoll != null) {
                                    atomicLong2.incrementAndGet();
                                }
                                if (objPoll != null) {
                                    z14 = true;
                                }
                            }
                        } catch (MissingBackpressureException e4) {
                            if (this.f130935h.compareAndSet(false, true)) {
                                f();
                                this.f130934g.onError(e4);
                            }
                        }
                        n83.a aVar2 = this.f130937j;
                        if (aVar2 != null) {
                            try {
                                aVar2.d();
                            } catch (Throwable th3) {
                                m83.a.b(th3);
                                if (aVar.f157951b) {
                                    return;
                                }
                                aVar.f157952c = th3;
                                aVar.f157951b = true;
                                aVar.a();
                                return;
                            }
                        }
                        if (!z14) {
                            return;
                        }
                    }
                } while (!atomicLong.compareAndSet(j8, j8 - 1));
            }
            ConcurrentLinkedQueue<Object> concurrentLinkedQueue = this.f130932e;
            if (t7 == null) {
                obj = e.f130874b;
            } else {
                e.a aVar3 = e.f130873a;
                obj = t7;
            }
            concurrentLinkedQueue.offer(obj);
            aVar.a();
        }

        @Override // j83.n
        public final void g() {
            h(Long.MAX_VALUE);
        }

        @Override // j83.f
        public final void onError(Throwable th3) throws Throwable {
            if (this.f130935h.get()) {
                return;
            }
            s83.a aVar = this.f130936i;
            if (aVar.f157951b) {
                return;
            }
            aVar.f157952c = th3;
            aVar.f157951b = true;
            aVar.a();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m<?> f130939a = new m<>();
    }

    public m(long j8, n83.a aVar, j83.a.d dVar) {
        if (j8 <= 0) {
            vb.h.s("Buffer capacity must be > 0");
            throw null;
        }
        if (dVar == null) {
            x.l("The BackpressureOverflow strategy must not be null");
            throw null;
        }
        this.f130929a = Long.valueOf(j8);
        this.f130930b = aVar;
        this.f130931c = dVar;
    }

    @Override // n83.d
    public final Object call(Object obj) {
        j83.n nVar = (j83.n) obj;
        a aVar = new a(nVar, this.f130929a, this.f130930b, this.f130931c);
        nVar.b(aVar);
        nVar.i(aVar.f130936i);
        return aVar;
    }

    public m(long j8) {
        this(j8, null, j83.a.f97740a);
    }

    public m(long j8, n83.a aVar) {
        this(j8, aVar, j83.a.f97740a);
    }

    public m() {
        this.f130929a = null;
        this.f130930b = null;
        this.f130931c = j83.a.f97740a;
    }
}
