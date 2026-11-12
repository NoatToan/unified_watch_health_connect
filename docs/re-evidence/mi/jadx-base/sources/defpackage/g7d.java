package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class g7d<T> implements tpo<cp5<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<tpo<cp5<T>>> f18677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18678b;

    public class a extends j00<T> {
        public ArrayList<cp5<T>> g;
        public int h;
        public int i;
        public AtomicInteger j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Throwable f18679k;

        /* JADX INFO: renamed from: g7d$a$a, reason: collision with other inner class name */
        public class C0940a implements mp5<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f18680a;

            public C0940a(int i) {
                this.f18680a = i;
            }

            @Override // defpackage.mp5
            public void onCancellation(cp5<T> cp5Var) {
            }

            @Override // defpackage.mp5
            public void onFailure(cp5<T> cp5Var) {
                a.this.A(this.f18680a, cp5Var);
            }

            @Override // defpackage.mp5
            public void onNewResult(cp5<T> cp5Var) {
                if (cp5Var.hasResult()) {
                    a.this.B(this.f18680a, cp5Var);
                } else if (cp5Var.a()) {
                    a.this.A(this.f18680a, cp5Var);
                }
            }

            @Override // defpackage.mp5
            public void onProgressUpdate(cp5<T> cp5Var) {
                if (this.f18680a == 0) {
                    a.this.m(cp5Var.getProgress());
                }
            }
        }

        public a() {
            if (g7d.this.f18678b) {
                return;
            }
            u();
        }

        private void t(cp5<T> cp5Var) {
            if (cp5Var != null) {
                cp5Var.close();
            }
        }

        private synchronized cp5<T> x() {
            return w(this.h);
        }

        public final void A(int i, cp5<T> cp5Var) {
            t(C(i, cp5Var));
            if (i == 0) {
                this.f18679k = cp5Var.b();
            }
            y();
        }

        public final void B(int i, cp5<T> cp5Var) {
            z(i, cp5Var, cp5Var.a());
            if (cp5Var == x()) {
                o(null, i == 0 && cp5Var.a());
            }
            y();
        }

        public final synchronized cp5<T> C(int i, cp5<T> cp5Var) {
            if (cp5Var == x()) {
                return null;
            }
            if (cp5Var != w(i)) {
                return cp5Var;
            }
            return v(i);
        }

        @Override // defpackage.j00, defpackage.cp5
        public boolean close() {
            if (g7d.this.f18678b) {
                u();
            }
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    ArrayList<cp5<T>> arrayList = this.g;
                    this.g = null;
                    if (arrayList == null) {
                        return true;
                    }
                    for (int i = 0; i < arrayList.size(); i++) {
                        t(arrayList.get(i));
                    }
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // defpackage.j00, defpackage.cp5
        public synchronized T getResult() {
            cp5<T> cp5VarX;
            try {
                if (g7d.this.f18678b) {
                    u();
                }
                cp5VarX = x();
            } catch (Throwable th) {
                throw th;
            }
            return cp5VarX != null ? cp5VarX.getResult() : null;
        }

        @Override // defpackage.j00, defpackage.cp5
        public synchronized boolean hasResult() {
            cp5<T> cp5VarX;
            try {
                if (g7d.this.f18678b) {
                    u();
                }
                cp5VarX = x();
            } catch (Throwable th) {
                throw th;
            }
            return cp5VarX != null && cp5VarX.hasResult();
        }

        public final void u() {
            if (this.j != null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.j == null) {
                        this.j = new AtomicInteger(0);
                        int size = g7d.this.f18677a.size();
                        this.i = size;
                        this.h = size;
                        this.g = new ArrayList<>(size);
                        for (int i = 0; i < size; i++) {
                            cp5<T> cp5Var = (cp5) ((tpo) g7d.this.f18677a.get(i)).get();
                            this.g.add(cp5Var);
                            cp5Var.c(new C0940a(i), fb3.a());
                            if (cp5Var.hasResult()) {
                                break;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final synchronized cp5<T> v(int i) {
            cp5<T> cp5Var;
            ArrayList<cp5<T>> arrayList = this.g;
            cp5Var = null;
            if (arrayList != null && i < arrayList.size()) {
                cp5Var = this.g.set(i, null);
            }
            return cp5Var;
        }

        public final synchronized cp5<T> w(int i) {
            ArrayList<cp5<T>> arrayList;
            arrayList = this.g;
            return (arrayList == null || i >= arrayList.size()) ? null : this.g.get(i);
        }

        public final void y() {
            Throwable th;
            if (this.j.incrementAndGet() != this.i || (th = this.f18679k) == null) {
                return;
            }
            k(th);
        }

        public final void z(int i, cp5<T> cp5Var, boolean z) {
            synchronized (this) {
                try {
                    int i2 = this.h;
                    if (cp5Var == w(i) && i != this.h) {
                        if (x() == null || (z && i < this.h)) {
                            this.h = i;
                        } else {
                            i = i2;
                        }
                        while (i2 > i) {
                            t(v(i2));
                            i2--;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public g7d(List<tpo<cp5<T>>> list, boolean z) {
        b6i.c(!list.isEmpty(), "List of suppliers is empty!");
        this.f18677a = list;
        this.f18678b = z;
    }

    public static <T> g7d<T> c(List<tpo<cp5<T>>> list, boolean z) {
        return new g7d<>(list, z);
    }

    @Override // defpackage.tpo
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public cp5<T> get() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g7d) {
            return i4h.a(this.f18677a, ((g7d) obj).f18677a);
        }
        return false;
    }

    public int hashCode() {
        return this.f18677a.hashCode();
    }

    public String toString() {
        return i4h.d(this).b("list", this.f18677a).toString();
    }
}
