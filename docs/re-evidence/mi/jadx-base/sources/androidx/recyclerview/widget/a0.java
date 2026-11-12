package androidx.recyclerview.widget;

import androidx.annotation.VisibleForTesting;
import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;

/* JADX INFO: loaded from: classes.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    public final SimpleArrayMap<RecyclerView.d0, a> f2853a = new SimpleArrayMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    public final LongSparseArray<RecyclerView.d0> f2854b = new LongSparseArray<>();

    public static class a {
        public static Pools.Pool<a> d = new Pools.SimplePool(20);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.l.c f2856b;
        public RecyclerView.l.c c;

        public static void a() {
            while (d.acquire() != null) {
            }
        }

        public static a b() {
            a aVarAcquire = d.acquire();
            return aVarAcquire == null ? new a() : aVarAcquire;
        }

        public static void c(a aVar) {
            aVar.f2855a = 0;
            aVar.f2856b = null;
            aVar.c = null;
            d.release(aVar);
        }
    }

    public interface b {
        void a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void b(RecyclerView.d0 d0Var);

        void c(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void d(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);
    }

    public void a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVarB = this.f2853a.get(d0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f2853a.put(d0Var, aVarB);
        }
        aVarB.f2855a |= 2;
        aVarB.f2856b = cVar;
    }

    public void b(RecyclerView.d0 d0Var) {
        a aVarB = this.f2853a.get(d0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f2853a.put(d0Var, aVarB);
        }
        aVarB.f2855a |= 1;
    }

    public void c(long j, RecyclerView.d0 d0Var) {
        this.f2854b.put(j, d0Var);
    }

    public void d(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVarB = this.f2853a.get(d0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f2853a.put(d0Var, aVarB);
        }
        aVarB.c = cVar;
        aVarB.f2855a |= 8;
    }

    public void e(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVarB = this.f2853a.get(d0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f2853a.put(d0Var, aVarB);
        }
        aVarB.f2856b = cVar;
        aVarB.f2855a |= 4;
    }

    public void f() {
        this.f2853a.clear();
        this.f2854b.clear();
    }

    public RecyclerView.d0 g(long j) {
        return this.f2854b.get(j);
    }

    public boolean h(RecyclerView.d0 d0Var) {
        a aVar = this.f2853a.get(d0Var);
        return (aVar == null || (aVar.f2855a & 1) == 0) ? false : true;
    }

    public boolean i(RecyclerView.d0 d0Var) {
        a aVar = this.f2853a.get(d0Var);
        return (aVar == null || (aVar.f2855a & 4) == 0) ? false : true;
    }

    public void j() {
        a.a();
    }

    public void k(RecyclerView.d0 d0Var) {
        p(d0Var);
    }

    public final RecyclerView.l.c l(RecyclerView.d0 d0Var, int i) {
        a aVarValueAt;
        RecyclerView.l.c cVar;
        int iIndexOfKey = this.f2853a.indexOfKey(d0Var);
        if (iIndexOfKey >= 0 && (aVarValueAt = this.f2853a.valueAt(iIndexOfKey)) != null) {
            int i2 = aVarValueAt.f2855a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                aVarValueAt.f2855a = i3;
                if (i == 4) {
                    cVar = aVarValueAt.f2856b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVarValueAt.c;
                }
                if ((i3 & 12) == 0) {
                    this.f2853a.removeAt(iIndexOfKey);
                    a.c(aVarValueAt);
                }
                return cVar;
            }
        }
        return null;
    }

    public RecyclerView.l.c m(RecyclerView.d0 d0Var) {
        return l(d0Var, 8);
    }

    public RecyclerView.l.c n(RecyclerView.d0 d0Var) {
        return l(d0Var, 4);
    }

    public void o(b bVar) {
        for (int size = this.f2853a.getSize() - 1; size >= 0; size--) {
            RecyclerView.d0 d0VarKeyAt = this.f2853a.keyAt(size);
            a aVarRemoveAt = this.f2853a.removeAt(size);
            int i = aVarRemoveAt.f2855a;
            if ((i & 3) == 3) {
                bVar.b(d0VarKeyAt);
            } else if ((i & 1) != 0) {
                RecyclerView.l.c cVar = aVarRemoveAt.f2856b;
                if (cVar == null) {
                    bVar.b(d0VarKeyAt);
                } else {
                    bVar.c(d0VarKeyAt, cVar, aVarRemoveAt.c);
                }
            } else if ((i & 14) == 14) {
                bVar.a(d0VarKeyAt, aVarRemoveAt.f2856b, aVarRemoveAt.c);
            } else if ((i & 12) == 12) {
                bVar.d(d0VarKeyAt, aVarRemoveAt.f2856b, aVarRemoveAt.c);
            } else if ((i & 4) != 0) {
                bVar.c(d0VarKeyAt, aVarRemoveAt.f2856b, null);
            } else if ((i & 8) != 0) {
                bVar.a(d0VarKeyAt, aVarRemoveAt.f2856b, aVarRemoveAt.c);
            }
            a.c(aVarRemoveAt);
        }
    }

    public void p(RecyclerView.d0 d0Var) {
        a aVar = this.f2853a.get(d0Var);
        if (aVar == null) {
            return;
        }
        aVar.f2855a &= -2;
    }

    public void q(RecyclerView.d0 d0Var) {
        for (int size = this.f2854b.size() - 1; size >= 0; size--) {
            if (d0Var == this.f2854b.valueAt(size)) {
                this.f2854b.removeAt(size);
                break;
            }
        }
        a aVarRemove = this.f2853a.remove(d0Var);
        if (aVarRemove != null) {
            a.c(aVarRemove);
        }
    }
}
