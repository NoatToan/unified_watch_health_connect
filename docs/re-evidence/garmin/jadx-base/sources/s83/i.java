package s83;

import j83.n;
import j83.o;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.lang3.BooleanUtils;
import rx.exceptions.OnErrorThrowable;
import v83.s;

/* JADX INFO: loaded from: classes11.dex */
public final class i<T> extends j83.e<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f157966c = Boolean.valueOf(System.getProperty("rx.just.strong-mode", BooleanUtils.FALSE)).booleanValue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f157967b;

    public static final class a<T> implements j83.e.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f157968a;

        public a(T t7) {
            this.f157968a = t7;
        }

        @Override // n83.b
        public final void call(Object obj) {
            n nVar = (n) obj;
            boolean z14 = i.f157966c;
            T t7 = this.f157968a;
            nVar.i(z14 ? new p83.b(nVar, t7) : new d(nVar, t7));
        }
    }

    public static final class b<T> implements j83.e.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f157969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n83.d<n83.a, o> f157970b;

        public b(T t7, n83.d<n83.a, o> dVar) {
            this.f157969a = t7;
            this.f157970b = dVar;
        }

        @Override // n83.b
        public final void call(Object obj) {
            n nVar = (n) obj;
            nVar.i(new c(nVar, this.f157969a, this.f157970b));
        }
    }

    public static final class c<T> extends AtomicBoolean implements j83.g, n83.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n<? super T> f157971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f157972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n83.d<n83.a, o> f157973c;

        public c(n<? super T> nVar, T t7, n83.d<n83.a, o> dVar) {
            this.f157971a = nVar;
            this.f157972b = t7;
            this.f157973c = dVar;
        }

        @Override // j83.g
        public final void b(long j8) {
            if (j8 < 0) {
                vb.h.s(org.apache.commons.lang3.e.e(j8, "n >= 0 required but it was "));
            } else {
                if (j8 == 0 || !compareAndSet(false, true)) {
                    return;
                }
                this.f157971a.b(this.f157973c.call(this));
            }
        }

        @Override // n83.a
        public final void d() {
            n<? super T> nVar = this.f157971a;
            if (nVar.f97758a.f157986b) {
                return;
            }
            T t7 = this.f157972b;
            try {
                nVar.c(t7);
                if (nVar.f97758a.f157986b) {
                    return;
                }
                nVar.a();
            } catch (Throwable th3) {
                m83.a.b(th3);
                nVar.onError(OnErrorThrowable.addValueAsLastCause(th3, t7));
            }
        }

        @Override // java.util.concurrent.atomic.AtomicBoolean
        public final String toString() {
            return "ScalarAsyncProducer[" + this.f157972b + ", " + get() + "]";
        }
    }

    public static final class d<T> implements j83.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n<? super T> f157974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f157975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f157976c;

        public d(n<? super T> nVar, T t7) {
            this.f157974a = nVar;
            this.f157975b = t7;
        }

        @Override // j83.g
        public final void b(long j8) {
            if (this.f157976c) {
                return;
            }
            if (j8 < 0) {
                vb.h.z(org.apache.commons.lang3.e.e(j8, "n >= required but it was "));
                return;
            }
            if (j8 == 0) {
                return;
            }
            this.f157976c = true;
            n<? super T> nVar = this.f157974a;
            if (nVar.f97758a.f157986b) {
                return;
            }
            T t7 = this.f157975b;
            try {
                nVar.c(t7);
                if (nVar.f97758a.f157986b) {
                    return;
                }
                nVar.a();
            } catch (Throwable th3) {
                m83.a.b(th3);
                nVar.onError(OnErrorThrowable.addValueAsLastCause(th3, t7));
            }
        }
    }

    public i(T t7) {
        j83.e.a aVar = new a(t7);
        v83.g gVar = s.f176257b;
        super(gVar != null ? (j83.e.a) gVar.call(aVar) : aVar);
        this.f157967b = t7;
    }
}
