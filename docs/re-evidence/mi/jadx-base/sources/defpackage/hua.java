package defpackage;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.Comparator;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class hua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bua<Object, Object> f20465a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Runnable f20466b = new f();
    public static final vc0 c = new c();
    public static final bg4<Object> d = new d();
    public static final bg4<Throwable> e = new g();
    public static final bg4<Throwable> f = new n();
    public static final vre g = new e();
    public static final i6i<Object> h = new o();
    public static final i6i<Object> i = new h();
    public static final Callable<Object> j = new m();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Comparator<Object> f20467k = new l();
    public static final bg4<joo> l = new k();

    public static final class a<T1, T2, R> implements bua<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final oi2<? super T1, ? super T2, ? extends R> f20468a;

        public a(oi2<? super T1, ? super T2, ? extends R> oi2Var) {
            this.f20468a = oi2Var;
        }

        @Override // defpackage.bua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 2) {
                return this.f20468a.apply(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    public static final class b<T1, T2, T3, R> implements bua<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final cua<T1, T2, T3, R> f20469a;

        public b(cua<T1, T2, T3, R> cuaVar) {
            this.f20469a = cuaVar;
        }

        @Override // defpackage.bua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 3) {
                return this.f20469a.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2]);
            }
            throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
        }
    }

    public static final class c implements vc0 {
        @Override // defpackage.vc0
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    public static final class d implements bg4<Object> {
        @Override // defpackage.bg4
        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    public static final class e implements vre {
    }

    public static final class f implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    public static final class g implements bg4<Throwable> {
        @Override // defpackage.bg4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
            t5l.p(th);
        }
    }

    public static final class h implements i6i<Object> {
        @Override // defpackage.i6i
        public boolean test(Object obj) {
            return false;
        }
    }

    public static final class i implements bua<Object, Object> {
        @Override // defpackage.bua
        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    public static final class j<T, U> implements Callable<U>, bua<T, U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final U f20470a;

        public j(U u) {
            this.f20470a = u;
        }

        @Override // defpackage.bua
        public U apply(T t) throws Exception {
            return this.f20470a;
        }

        @Override // java.util.concurrent.Callable
        public U call() throws Exception {
            return this.f20470a;
        }
    }

    public static final class k implements bg4<joo> {
        @Override // defpackage.bg4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(joo jooVar) throws Exception {
            jooVar.request(Long.MAX_VALUE);
        }
    }

    public static final class l implements Comparator<Object> {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    public static final class m implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public Object call() {
            return null;
        }
    }

    public static final class n implements bg4<Throwable> {
        @Override // defpackage.bg4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
            t5l.p(new OnErrorNotImplementedException(th));
        }
    }

    public static final class o implements i6i<Object> {
        @Override // defpackage.i6i
        public boolean test(Object obj) {
            return true;
        }
    }

    public static <T> bg4<T> a() {
        return (bg4<T>) d;
    }

    public static <T> bua<T, T> b() {
        return (bua<T, T>) f20465a;
    }

    public static <T> Callable<T> c(T t) {
        return new j(t);
    }

    public static <T1, T2, R> bua<Object[], R> d(oi2<? super T1, ? super T2, ? extends R> oi2Var) {
        x3h.d(oi2Var, "f is null");
        return new a(oi2Var);
    }

    public static <T1, T2, T3, R> bua<Object[], R> e(cua<T1, T2, T3, R> cuaVar) {
        x3h.d(cuaVar, "f is null");
        return new b(cuaVar);
    }
}
