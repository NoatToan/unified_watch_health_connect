package defpackage;

import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class jie<T> implements m4h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableLiveData<b<T>> f22831a = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("mObservers")
    public final Map<m4h.a<? super T>, a<T>> f22832b = new HashMap();

    public static final class a<T> implements Observer<b<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f22833a = new AtomicBoolean(true);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m4h.a<? super T> f22834b;
        public final Executor c;

        public a(Executor executor, m4h.a<? super T> aVar) {
            this.c = executor;
            this.f22834b = aVar;
        }

        public void b() {
            this.f22833a.set(false);
        }

        public final /* synthetic */ void c(b bVar) {
            if (this.f22833a.get()) {
                if (bVar.a()) {
                    this.f22834b.a((Object) bVar.d());
                } else {
                    g6i.g(bVar.c());
                    this.f22834b.onError(bVar.c());
                }
            }
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onChanged(final b<T> bVar) {
            this.c.execute(new Runnable() { // from class: iie
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21172a.c(bVar);
                }
            });
        }
    }

    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f22835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f22836b;

        public b(T t, Throwable th) {
            this.f22835a = t;
            this.f22836b = th;
        }

        public static <T> b<T> b(T t) {
            return new b<>(t, null);
        }

        public boolean a() {
            return this.f22836b == null;
        }

        public Throwable c() {
            return this.f22836b;
        }

        public T d() {
            if (a()) {
                return this.f22835a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[Result: <");
            if (a()) {
                str = "Value: " + this.f22835a;
            } else {
                str = "Error: " + this.f22836b;
            }
            sb.append(str);
            sb.append(">]");
            return sb.toString();
        }
    }

    @Override // defpackage.m4h
    public void a(m4h.a<? super T> aVar) {
        synchronized (this.f22832b) {
            try {
                final a<T> aVarRemove = this.f22832b.remove(aVar);
                if (aVarRemove != null) {
                    aVarRemove.b();
                    li3.d().execute(new Runnable() { // from class: gie
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f19027a.f(aVarRemove);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.m4h
    public void b(Executor executor, m4h.a<? super T> aVar) {
        synchronized (this.f22832b) {
            try {
                final a<T> aVar2 = this.f22832b.get(aVar);
                if (aVar2 != null) {
                    aVar2.b();
                }
                final a<T> aVar3 = new a<>(executor, aVar);
                this.f22832b.put(aVar, aVar3);
                li3.d().execute(new Runnable() { // from class: hie
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20098a.e(aVar2, aVar3);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void e(a aVar, a aVar2) {
        if (aVar != null) {
            this.f22831a.removeObserver(aVar);
        }
        this.f22831a.observeForever(aVar2);
    }

    public final /* synthetic */ void f(a aVar) {
        this.f22831a.removeObserver(aVar);
    }

    public void g(T t) {
        this.f22831a.postValue(b.b(t));
    }
}
