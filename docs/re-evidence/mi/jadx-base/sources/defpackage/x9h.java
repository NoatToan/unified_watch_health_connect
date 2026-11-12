package defpackage;

import java.util.Arrays;
import rx.exceptions.CompositeException;

/* JADX INFO: loaded from: classes3.dex */
public class x9h<T> implements p4h.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a6h<? super T> f38889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p4h<T> f38890b;

    public static final class a<T> extends xno<T> {
        public final xno<? super T> c;
        public final a6h<? super T> d;
        public boolean e;

        public a(xno<? super T> xnoVar, a6h<? super T> a6hVar) {
            super(xnoVar);
            this.c = xnoVar;
            this.d = a6hVar;
        }

        @Override // defpackage.a6h
        public void onCompleted() {
            if (this.e) {
                return;
            }
            try {
                this.d.onCompleted();
                this.e = true;
                this.c.onCompleted();
            } catch (Throwable th) {
                pf8.e(th, this);
            }
        }

        @Override // defpackage.a6h
        public void onError(Throwable th) {
            if (this.e) {
                p5l.f(th);
                return;
            }
            this.e = true;
            try {
                this.d.onError(th);
                this.c.onError(th);
            } catch (Throwable th2) {
                pf8.d(th2);
                this.c.onError(new CompositeException(Arrays.asList(th, th2)));
            }
        }

        @Override // defpackage.a6h
        public void onNext(T t) {
            if (this.e) {
                return;
            }
            try {
                this.d.onNext(t);
                this.c.onNext(t);
            } catch (Throwable th) {
                pf8.f(th, this, t);
            }
        }
    }

    public x9h(p4h<T> p4hVar, a6h<? super T> a6hVar) {
        this.f38890b = p4hVar;
        this.f38889a = a6hVar;
    }

    @Override // defpackage.tc0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(xno<? super T> xnoVar) {
        this.f38890b.B(new a(xnoVar, this.f38889a));
    }
}
