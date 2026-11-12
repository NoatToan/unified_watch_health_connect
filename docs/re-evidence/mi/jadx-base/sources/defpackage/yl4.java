package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.facebook.common.memory.MemoryTrimType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class yl4<K, V> implements gpf<K, V>, rpf {
    public static final long i = TimeUnit.MINUTES.toMillis(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xl4<K, d<K, V>> f40285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xl4<K, d<K, V>> f40286b;
    public final nnq<V> d;
    public final c e;
    public final tpo<hpf> f;
    public hpf g;
    public final Map<Bitmap, Object> c = new WeakHashMap();
    public long h = SystemClock.uptimeMillis();

    public class a implements nnq<d<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nnq f40287a;

        public a(nnq nnqVar) {
            this.f40287a = nnqVar;
        }

        @Override // defpackage.nnq
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(d<K, V> dVar) {
            return this.f40287a.a(dVar.f40292b.n());
        }
    }

    public class b implements frk<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f40289a;

        public b(d dVar) {
            this.f40289a = dVar;
        }

        @Override // defpackage.frk
        public void release(V v) {
            yl4.this.w(this.f40289a);
        }
    }

    public interface c {
        double a(MemoryTrimType memoryTrimType);
    }

    public static class d<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f40291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w14<V> f40292b;
        public int c = 0;
        public boolean d = false;

        public d(K k2, w14<V> w14Var, e<K> eVar) {
            this.f40291a = (K) b6i.g(k2);
            this.f40292b = (w14) b6i.g(w14.d(w14Var));
        }

        public static <K, V> d<K, V> a(K k2, w14<V> w14Var, e<K> eVar) {
            return new d<>(k2, w14Var, eVar);
        }
    }

    public interface e<K> {
    }

    public yl4(nnq<V> nnqVar, c cVar, tpo<hpf> tpoVar) {
        this.d = nnqVar;
        this.f40285a = new xl4<>(y(nnqVar));
        this.f40286b = new xl4<>(y(nnqVar));
        this.e = cVar;
        this.f = tpoVar;
        this.g = tpoVar.get();
    }

    public static <K, V> void q(d<K, V> dVar) {
    }

    public static <K, V> void r(d<K, V> dVar) {
    }

    @Override // defpackage.gpf
    public w14<V> a(K k2, w14<V> w14Var) {
        return f(k2, w14Var, null);
    }

    @Override // defpackage.gpf
    public synchronized boolean b(j6i<K> j6iVar) {
        return !this.f40286b.d(j6iVar).isEmpty();
    }

    @Override // defpackage.gpf
    public int c(j6i<K> j6iVar) {
        ArrayList<d<K, V>> arrayListI;
        ArrayList<d<K, V>> arrayListI2;
        synchronized (this) {
            arrayListI = this.f40285a.i(j6iVar);
            arrayListI2 = this.f40286b.i(j6iVar);
            m(arrayListI2);
        }
        o(arrayListI2);
        s(arrayListI);
        t();
        p();
        return arrayListI2.size();
    }

    @Override // defpackage.rpf
    public void d(MemoryTrimType memoryTrimType) {
        ArrayList<d<K, V>> arrayListX;
        double dA = this.e.a(memoryTrimType);
        synchronized (this) {
            arrayListX = x(Integer.MAX_VALUE, Math.max(0, ((int) (((double) this.f40286b.e()) * (1.0d - dA))) - j()));
            m(arrayListX);
        }
        o(arrayListX);
        s(arrayListX);
        t();
        p();
    }

    public w14<V> f(K k2, w14<V> w14Var, e<K> eVar) {
        d<K, V> dVarH;
        w14<V> w14VarU;
        w14<V> w14VarV;
        b6i.g(k2);
        b6i.g(w14Var);
        t();
        synchronized (this) {
            try {
                dVarH = this.f40285a.h(k2);
                d<K, V> dVarH2 = this.f40286b.h(k2);
                w14VarU = null;
                if (dVarH2 != null) {
                    l(dVarH2);
                    w14VarV = v(dVarH2);
                } else {
                    w14VarV = null;
                }
                if (g(w14Var.n())) {
                    d<K, V> dVarA = d.a(k2, w14Var, eVar);
                    this.f40286b.g(k2, dVarA);
                    w14VarU = u(dVarA);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        w14.l(w14VarV);
        r(dVarH);
        p();
        return w14VarU;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    public final synchronized boolean g(V v) {
        boolean z;
        int iA = this.d.a(v);
        if (iA <= this.g.e) {
            z = i() <= this.g.f20314b - 1 && j() <= this.g.f20313a - iA;
        }
        return z;
    }

    @Override // defpackage.gpf
    public w14<V> get(K k2) {
        d<K, V> dVarH;
        w14<V> w14VarU;
        b6i.g(k2);
        synchronized (this) {
            try {
                dVarH = this.f40285a.h(k2);
                d<K, V> dVarA = this.f40286b.a(k2);
                w14VarU = dVarA != null ? u(dVarA) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        r(dVarH);
        t();
        p();
        return w14VarU;
    }

    public final synchronized void h(d<K, V> dVar) {
        b6i.g(dVar);
        b6i.i(dVar.c > 0);
        dVar.c--;
    }

    public synchronized int i() {
        return this.f40286b.b() - this.f40285a.b();
    }

    public synchronized int j() {
        return this.f40286b.e() - this.f40285a.e();
    }

    public final synchronized void k(d<K, V> dVar) {
        b6i.g(dVar);
        b6i.i(!dVar.d);
        dVar.c++;
    }

    public final synchronized void l(d<K, V> dVar) {
        b6i.g(dVar);
        b6i.i(!dVar.d);
        dVar.d = true;
    }

    public final synchronized void m(ArrayList<d<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<d<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                l(it.next());
            }
        }
    }

    public final synchronized boolean n(d<K, V> dVar) {
        if (dVar.d || dVar.c != 0) {
            return false;
        }
        this.f40285a.g(dVar.f40291a, dVar);
        return true;
    }

    public final void o(ArrayList<d<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<d<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                w14.l(v(it.next()));
            }
        }
    }

    public final void p() {
        ArrayList<d<K, V>> arrayListX;
        synchronized (this) {
            hpf hpfVar = this.g;
            int iMin = Math.min(hpfVar.d, hpfVar.f20314b - i());
            hpf hpfVar2 = this.g;
            arrayListX = x(iMin, Math.min(hpfVar2.c, hpfVar2.f20313a - j()));
            m(arrayListX);
        }
        o(arrayListX);
        s(arrayListX);
    }

    public final void s(ArrayList<d<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<d<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                r(it.next());
            }
        }
    }

    public final synchronized void t() {
        if (this.h + i > SystemClock.uptimeMillis()) {
            return;
        }
        this.h = SystemClock.uptimeMillis();
        this.g = this.f.get();
    }

    public final synchronized w14<V> u(d<K, V> dVar) {
        k(dVar);
        return w14.K(dVar.f40292b.n(), new b(dVar));
    }

    public final synchronized w14<V> v(d<K, V> dVar) {
        b6i.g(dVar);
        return (dVar.d && dVar.c == 0) ? dVar.f40292b : null;
    }

    public final void w(d<K, V> dVar) {
        boolean zN;
        w14<V> w14VarV;
        b6i.g(dVar);
        synchronized (this) {
            h(dVar);
            zN = n(dVar);
            w14VarV = v(dVar);
        }
        w14.l(w14VarV);
        if (!zN) {
            dVar = null;
        }
        q(dVar);
        t();
        p();
    }

    public final synchronized ArrayList<d<K, V>> x(int i2, int i3) {
        int iMax = Math.max(i2, 0);
        int iMax2 = Math.max(i3, 0);
        if (this.f40285a.b() <= iMax && this.f40285a.e() <= iMax2) {
            return null;
        }
        ArrayList<d<K, V>> arrayList = new ArrayList<>();
        while (true) {
            if (this.f40285a.b() <= iMax && this.f40285a.e() <= iMax2) {
                return arrayList;
            }
            K kC = this.f40285a.c();
            this.f40285a.h(kC);
            arrayList.add(this.f40286b.h(kC));
        }
    }

    public final nnq<d<K, V>> y(nnq<V> nnqVar) {
        return new a(nnqVar);
    }
}
