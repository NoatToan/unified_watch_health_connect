package d13;

/* JADX INFO: loaded from: classes3.dex */
public final class p<T> extends d13.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q03.q f57202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f57203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f57204d;

    public static final class a<T> extends y03.b<T> implements q03.p<T>, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.p<? super T> f57205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q03.q.b f57206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f57207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f57208d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public x03.h<T> f57209e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public s03.b f57210f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Throwable f57211g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f57212h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f57213i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f57214j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f57215k;

        public a(q03.p<? super T> pVar, q03.q.b bVar, boolean z14, int i14) {
            this.f57205a = pVar;
            this.f57206b = bVar;
            this.f57207c = z14;
            this.f57208d = i14;
        }

        @Override // q03.p
        public final void a(s03.b bVar) {
            if (v03.c.g(this.f57210f, bVar)) {
                this.f57210f = bVar;
                if (bVar instanceof x03.c) {
                    x03.c cVar = (x03.c) bVar;
                    int iE = cVar.e();
                    if (iE == 1) {
                        this.f57214j = iE;
                        this.f57209e = cVar;
                        this.f57212h = true;
                        this.f57205a.a(this);
                        if (getAndIncrement() == 0) {
                            this.f57206b.d(this);
                            return;
                        }
                        return;
                    }
                    if (iE == 2) {
                        this.f57214j = iE;
                        this.f57209e = cVar;
                        this.f57205a.a(this);
                        return;
                    }
                }
                this.f57209e = new f13.b(this.f57208d);
                this.f57205a.a(this);
            }
        }

        @Override // s03.b
        public final boolean b() {
            return this.f57213i;
        }

        @Override // q03.p
        public final void c(T t7) {
            if (this.f57212h) {
                return;
            }
            if (this.f57214j != 2) {
                this.f57209e.offer(t7);
            }
            if (getAndIncrement() == 0) {
                this.f57206b.d(this);
            }
        }

        @Override // x03.h
        public final void clear() {
            this.f57209e.clear();
        }

        public final boolean d(boolean z14, boolean z15, q03.p<? super T> pVar) {
            if (this.f57213i) {
                this.f57209e.clear();
                return true;
            }
            if (!z14) {
                return false;
            }
            Throwable th3 = this.f57211g;
            if (this.f57207c) {
                if (!z15) {
                    return false;
                }
                this.f57213i = true;
                if (th3 != null) {
                    pVar.onError(th3);
                } else {
                    pVar.onComplete();
                }
                this.f57206b.dispose();
                return true;
            }
            if (th3 != null) {
                this.f57213i = true;
                this.f57209e.clear();
                pVar.onError(th3);
                this.f57206b.dispose();
                return true;
            }
            if (!z15) {
                return false;
            }
            this.f57213i = true;
            pVar.onComplete();
            this.f57206b.dispose();
            return true;
        }

        @Override // s03.b
        public final void dispose() {
            if (this.f57213i) {
                return;
            }
            this.f57213i = true;
            this.f57210f.dispose();
            this.f57206b.dispose();
            if (this.f57215k || getAndIncrement() != 0) {
                return;
            }
            this.f57209e.clear();
        }

        @Override // x03.d
        public final int e() {
            this.f57215k = true;
            return 2;
        }

        @Override // x03.h
        public final boolean isEmpty() {
            return this.f57209e.isEmpty();
        }

        @Override // q03.p
        public final void onComplete() {
            if (this.f57212h) {
                return;
            }
            this.f57212h = true;
            if (getAndIncrement() == 0) {
                this.f57206b.d(this);
            }
        }

        @Override // q03.p
        public final void onError(Throwable th3) {
            if (this.f57212h) {
                k13.a.b(th3);
                return;
            }
            this.f57211g = th3;
            this.f57212h = true;
            if (getAndIncrement() == 0) {
                this.f57206b.d(this);
            }
        }

        @Override // x03.h
        public final T poll() {
            return this.f57209e.poll();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!this.f57215k) {
                x03.h<T> hVar = this.f57209e;
                q03.p<? super T> pVar = this.f57205a;
                int iAddAndGet = 1;
                while (!d(this.f57212h, hVar.isEmpty(), pVar)) {
                    while (true) {
                        boolean z14 = this.f57212h;
                        try {
                            T tPoll = hVar.poll();
                            boolean z15 = tPoll == null;
                            if (d(z14, z15, pVar)) {
                                return;
                            }
                            if (z15) {
                                break;
                            } else {
                                pVar.c(tPoll);
                            }
                        } catch (Throwable th3) {
                            t03.a.a(th3);
                            this.f57213i = true;
                            this.f57210f.dispose();
                            hVar.clear();
                            pVar.onError(th3);
                            this.f57206b.dispose();
                            return;
                        }
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                return;
            }
            int iAddAndGet2 = 1;
            while (!this.f57213i) {
                boolean z16 = this.f57212h;
                Throwable th4 = this.f57211g;
                if (!this.f57207c && z16 && th4 != null) {
                    this.f57213i = true;
                    this.f57205a.onError(this.f57211g);
                    this.f57206b.dispose();
                    return;
                }
                this.f57205a.c(null);
                if (z16) {
                    this.f57213i = true;
                    Throwable th5 = this.f57211g;
                    q03.p<? super T> pVar2 = this.f57205a;
                    if (th5 != null) {
                        pVar2.onError(th5);
                    } else {
                        pVar2.onComplete();
                    }
                    this.f57206b.dispose();
                    return;
                }
                iAddAndGet2 = addAndGet(-iAddAndGet2);
                if (iAddAndGet2 == 0) {
                    return;
                }
            }
        }
    }

    public p(q03.o<T> oVar, q03.q qVar, boolean z14, int i14) {
        super(oVar);
        this.f57202b = qVar;
        this.f57203c = z14;
        this.f57204d = i14;
    }

    @Override // q03.l
    public final void f(q03.p<? super T> pVar) {
        q03.q qVar = this.f57202b;
        boolean z14 = qVar instanceof g13.k;
        q03.o<T> oVar = this.f57107a;
        if (z14) {
            oVar.b(pVar);
        } else {
            oVar.b(new a(pVar, qVar.a(), this.f57203c, this.f57204d));
        }
    }
}
