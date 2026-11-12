package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes4.dex */
public final class whe<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f14 f37976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final skb f37977b;
    public final b<T> c;
    public final CopyOnWriteArraySet<c<T>> d;
    public final ArrayDeque<Runnable> e;
    public final ArrayDeque<Runnable> f;
    public boolean g;

    public interface a<T> {
        void invoke(T t);
    }

    public interface b<T> {
        void a(T t, nh8 nh8Var);
    }

    public static final class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f37978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public nh8.b f37979b = new nh8.b();
        public boolean c;
        public boolean d;

        public c(T t) {
            this.f37978a = t;
        }

        public void a(int i, a<T> aVar) {
            if (this.d) {
                return;
            }
            if (i != -1) {
                this.f37979b.a(i);
            }
            this.c = true;
            aVar.invoke(this.f37978a);
        }

        public void b(b<T> bVar) {
            if (this.d || !this.c) {
                return;
            }
            nh8 nh8VarE = this.f37979b.e();
            this.f37979b = new nh8.b();
            this.c = false;
            bVar.a(this.f37978a, nh8VarE);
        }

        public void c(b<T> bVar) {
            this.d = true;
            if (this.c) {
                bVar.a(this.f37978a, this.f37979b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f37978a.equals(((c) obj).f37978a);
        }

        public int hashCode() {
            return this.f37978a.hashCode();
        }
    }

    public whe(Looper looper, f14 f14Var, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, f14Var, bVar);
    }

    public static /* synthetic */ void g(CopyOnWriteArraySet copyOnWriteArraySet, int i, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i, aVar);
        }
    }

    public void c(T t) {
        if (this.g) {
            return;
        }
        rk1.e(t);
        this.d.add(new c<>(t));
    }

    @CheckResult
    public whe<T> d(Looper looper, b<T> bVar) {
        return new whe<>(this.d, looper, this.f37976a, bVar);
    }

    public void e() {
        if (this.f.isEmpty()) {
            return;
        }
        if (!this.f37977b.b(0)) {
            this.f37977b.a(0).a();
        }
        boolean z = !this.e.isEmpty();
        this.e.addAll(this.f);
        this.f.clear();
        if (z) {
            return;
        }
        while (!this.e.isEmpty()) {
            this.e.peekFirst().run();
            this.e.removeFirst();
        }
    }

    public final boolean f(Message message) {
        int i = message.what;
        if (i == 0) {
            Iterator<c<T>> it = this.d.iterator();
            while (it.hasNext()) {
                it.next().b(this.c);
                if (this.f37977b.b(0)) {
                    break;
                }
            }
        } else if (i == 1) {
            l(message.arg1, (a) message.obj);
            j();
        }
        return true;
    }

    public void h(int i, a<T> aVar) {
        this.f37977b.g(1, i, 0, aVar).a();
    }

    public void i(final int i, final a<T> aVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.d);
        this.f.add(new Runnable() { // from class: uhe
            @Override // java.lang.Runnable
            public final void run() {
                whe.g(copyOnWriteArraySet, i, aVar);
            }
        });
    }

    public void j() {
        Iterator<c<T>> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().c(this.c);
        }
        this.d.clear();
        this.g = true;
    }

    public void k(T t) {
        for (c<T> cVar : this.d) {
            if (cVar.f37978a.equals(t)) {
                cVar.c(this.c);
                this.d.remove(cVar);
            }
        }
    }

    public void l(int i, a<T> aVar) {
        i(i, aVar);
        e();
    }

    public whe(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, f14 f14Var, b<T> bVar) {
        this.f37976a = f14Var;
        this.d = copyOnWriteArraySet;
        this.c = bVar;
        this.e = new ArrayDeque<>();
        this.f = new ArrayDeque<>();
        this.f37977b = f14Var.c(looper, new Handler.Callback() { // from class: vhe
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f36899a.f(message);
            }
        });
    }
}
