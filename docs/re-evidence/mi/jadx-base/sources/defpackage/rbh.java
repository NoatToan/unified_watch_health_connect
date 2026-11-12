package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rbh<T> implements p4h.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ifl f32382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p4h<T> f32383b;
    public final boolean c;

    public static final class a<T> extends xno<T> implements sc0 {
        public final xno<? super T> c;
        public final boolean d;
        public final ifl.a e;
        public p4h<T> f;
        public Thread g;

        /* JADX INFO: renamed from: rbh$a$a, reason: collision with other inner class name */
        public class C1096a implements cbi {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ cbi f32384a;

            /* JADX INFO: renamed from: rbh$a$a$a, reason: collision with other inner class name */
            public class C1097a implements sc0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ long f32386a;

                public C1097a(long j) {
                    this.f32386a = j;
                }

                @Override // defpackage.sc0
                public void call() {
                    C1096a.this.f32384a.request(this.f32386a);
                }
            }

            public C1096a(cbi cbiVar) {
                this.f32384a = cbiVar;
            }

            @Override // defpackage.cbi
            public void request(long j) {
                if (a.this.g != Thread.currentThread()) {
                    a aVar = a.this;
                    if (aVar.d) {
                        aVar.e.a(new C1097a(j));
                        return;
                    }
                }
                this.f32384a.request(j);
            }
        }

        public a(xno<? super T> xnoVar, boolean z, ifl.a aVar, p4h<T> p4hVar) {
            this.c = xnoVar;
            this.d = z;
            this.e = aVar;
            this.f = p4hVar;
        }

        @Override // defpackage.sc0
        public void call() {
            p4h<T> p4hVar = this.f;
            this.f = null;
            this.g = Thread.currentThread();
            p4hVar.B(this);
        }

        @Override // defpackage.a6h
        public void onCompleted() {
            try {
                this.c.onCompleted();
            } finally {
                this.e.unsubscribe();
            }
        }

        @Override // defpackage.a6h
        public void onError(Throwable th) {
            try {
                this.c.onError(th);
            } finally {
                this.e.unsubscribe();
            }
        }

        @Override // defpackage.a6h
        public void onNext(T t) {
            this.c.onNext(t);
        }

        @Override // defpackage.xno
        public void setProducer(cbi cbiVar) {
            this.c.setProducer(new C1096a(cbiVar));
        }
    }

    public rbh(p4h<T> p4hVar, ifl iflVar, boolean z) {
        this.f32382a = iflVar;
        this.f32383b = p4hVar;
        this.c = z;
    }

    @Override // defpackage.tc0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(xno<? super T> xnoVar) {
        ifl.a aVarA = this.f32382a.a();
        a aVar = new a(xnoVar, this.c, aVarA, this.f32383b);
        xnoVar.add(aVar);
        xnoVar.add(aVarA);
        aVarA.a(aVar);
    }
}
