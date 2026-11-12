package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h5h<T, U> extends h10<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bua<? super T, ? extends U> f19716b;

    public static final class a<T, U> extends kg2<T, U> {
        public final bua<? super T, ? extends U> f;

        public a(z5h<? super U> z5hVar, bua<? super T, ? extends U> buaVar) {
            super(z5hVar);
            this.f = buaVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.z5h
        public void onNext(T t) {
            if (this.d) {
                return;
            }
            if (this.e != 0) {
                this.f23814a.onNext(null);
                return;
            }
            try {
                this.f23814a.onNext((Object) x3h.d(this.f.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                c(th);
            }
        }

        @Override // defpackage.jdm
        public U poll() throws Exception {
            T tPoll = this.c.poll();
            if (tPoll != null) {
                return (U) x3h.d(this.f.apply(tPoll), "The mapper function returned a null value.");
            }
            return null;
        }

        @Override // defpackage.dgi
        public int requestFusion(int i) {
            return d(i);
        }
    }

    public h5h(o5h<T> o5hVar, bua<? super T, ? extends U> buaVar) {
        super(o5hVar);
        this.f19716b = buaVar;
    }

    @Override // defpackage.o4h
    public void R(z5h<? super U> z5hVar) {
        this.f19561a.a(new a(z5hVar, this.f19716b));
    }
}
