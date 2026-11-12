package w03;

import com.google.common.base.Optional;
import hq2.q;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p13.y;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f181170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f181171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f181172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f181173d;

    /* JADX INFO: renamed from: w03.a$a, reason: collision with other inner class name */
    public static final class C3375a<T1, T2, R> implements u03.f<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u03.b<? super T1, ? super T2, ? extends R> f181174a;

        public C3375a(u03.b<? super T1, ? super T2, ? extends R> bVar) {
            this.f181174a = bVar;
        }

        @Override // u03.f
        /* JADX INFO: renamed from: apply */
        public final Object mo330apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length != 2) {
                sn.a.z(objArr.length, "Array of size 2 expected but got ");
                return null;
            }
            return this.f181174a.apply(objArr[0], objArr[1]);
        }
    }

    public static final class b<T1, T2, T3, R> implements u03.f<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u03.e<T1, T2, T3, R> f181175a;

        public b(u03.e<T1, T2, T3, R> eVar) {
            this.f181175a = eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // u03.f
        /* JADX INFO: renamed from: apply */
        public final Object mo330apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            mq2.c cVarA = null;
            if (objArr.length != 3) {
                sn.a.z(objArr.length, "Array of size 3 expected but got ");
                return null;
            }
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            hc0.c cVar = (hc0.c) this.f181175a;
            lq2.e eVar = (lq2.e) cVar.f83232b;
            is2.b bVar = (is2.b) cVar.f83233c;
            o13.p pVar = (o13.p) obj2;
            jq2.c cVar2 = (jq2.c) obj3;
            Optional optional = (Optional) obj4;
            int i14 = lq2.e.f114359e;
            pVar.getClass();
            cVar2.getClass();
            optional.getClass();
            fs2.a aVar = (fs2.a) pVar.f128594a;
            q qVar = (q) pVar.f128595b;
            eVar.getClass();
            String str = aVar.f73429d;
            String strC = qVar.getPurseId();
            short sShortValue = qVar.a().a().shortValue();
            iq2.c cVarB = qVar.getLastTopUpRecord();
            if (cVarB != null) {
                mq2.c.f120228g.getClass();
                cVarA = mq2.c.a.a(cVarB, cVar2);
            }
            mq2.c cVar3 = cVarA;
            List<iq2.c> listD = qVar.d();
            ArrayList arrayList = new ArrayList(y.r(listD, 10));
            for (iq2.c cVar4 : listD) {
                mq2.c.f120228g.getClass();
                arrayList.add(mq2.c.a.a(cVar4, cVar2));
            }
            return new mq2.b(bVar, str, optional, strC, sShortValue, cVar3, arrayList, qVar.a().c());
        }
    }

    public static final class c implements u03.a {
        @Override // u03.a
        public final void run() {
        }

        public final String toString() {
            return "EmptyAction";
        }
    }

    public static final class d implements u03.d<Object> {
        @Override // u03.d
        public final void accept(Object obj) {
        }

        public final String toString() {
            return "EmptyConsumer";
        }
    }

    public static final class e {
    }

    public static final class f implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }

        public final String toString() {
            return "EmptyRunnable";
        }
    }

    public static final class g implements u03.d<Throwable> {
        @Override // u03.d
        public final void accept(Throwable th3) {
            k13.a.b(th3);
        }
    }

    public static final class h implements u03.g<Object> {
        @Override // u03.g
        public final boolean test(Object obj) {
            return false;
        }
    }

    public static final class i implements u03.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Future<?> f181176a;

        public i(Future<?> future) {
            this.f181176a = future;
        }

        @Override // u03.a
        public final void run() throws ExecutionException, InterruptedException {
            this.f181176a.get();
        }
    }

    public static final class j implements u03.f<Object, Object> {
        @Override // u03.f
        /* JADX INFO: renamed from: apply */
        public final Object mo330apply(Object obj) {
            return obj;
        }

        public final String toString() {
            return "IdentityFunction";
        }
    }

    public static final class k<T, U> implements Callable<U>, u03.f<T, U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final U f181177a;

        public k(U u8) {
            this.f181177a = u8;
        }

        @Override // u03.f
        /* JADX INFO: renamed from: apply */
        public final U mo330apply(T t7) {
            return this.f181177a;
        }

        @Override // java.util.concurrent.Callable
        public final U call() {
            return this.f181177a;
        }
    }

    public static final class l implements u03.d<b83.c> {
        @Override // u03.d
        public final void accept(b83.c cVar) {
            cVar.b(Long.MAX_VALUE);
        }
    }

    public static final class m implements Comparator<Object> {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    public static final class n implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public final Object call() {
            return null;
        }
    }

    public static final class o implements u03.d<Throwable> {
        @Override // u03.d
        public final void accept(Throwable th3) {
            k13.a.b(new OnErrorNotImplementedException(th3));
        }
    }

    public static final class p implements u03.g<Object> {
        @Override // u03.g
        public final boolean test(Object obj) {
            return true;
        }
    }

    static {
        new j();
        f181170a = new f();
        f181171b = new c();
        f181172c = new d();
        new g();
        f181173d = new o();
        new e();
        new p();
        new h();
        new n();
        new m();
        new l();
    }

    private a() {
        throw new IllegalStateException("No instances!");
    }
}
