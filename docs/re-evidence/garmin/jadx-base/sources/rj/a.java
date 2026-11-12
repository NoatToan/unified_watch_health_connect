package rj;

import android.util.Log;
import k7.g;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2889a f152952a = new C2889a();

    /* JADX INFO: renamed from: rj.a$a, reason: collision with other inner class name */
    public class C2889a implements e<Object> {
        @Override // rj.a.e
        public final void a(Object obj) {
        }
    }

    public interface b<T> {
        T b();
    }

    public static final class c<T> implements k7.e<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b<T> f152953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e<T> f152954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k7.e<T> f152955c;

        public c(k7.e<T> eVar, b<T> bVar, e<T> eVar2) {
            this.f152955c = eVar;
            this.f152953a = bVar;
            this.f152954b = eVar2;
        }

        @Override // k7.e
        public final boolean a(T t7) {
            if (t7 instanceof d) {
                ((d) t7).e().f152956a = true;
            }
            this.f152954b.a(t7);
            return this.f152955c.a(t7);
        }

        @Override // k7.e
        public final T acquire() {
            T tAcquire = this.f152955c.acquire();
            if (tAcquire == null) {
                tAcquire = this.f152953a.b();
                if (Log.isLoggable("FactoryPools", 2)) {
                    tAcquire.getClass().toString();
                }
            }
            if (tAcquire instanceof d) {
                ((d) tAcquire).e().f152956a = false;
            }
            return tAcquire;
        }
    }

    public interface d {
        rj.d.b e();
    }

    public interface e<T> {
        void a(T t7);
    }

    private a() {
    }

    public static c a(int i14, b bVar) {
        return new c(new g(i14), bVar, f152952a);
    }
}
