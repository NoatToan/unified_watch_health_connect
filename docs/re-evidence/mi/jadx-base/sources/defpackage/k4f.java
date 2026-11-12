package defpackage;

import com.google.common.base.Equivalence;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes5.dex */
public final class k4f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f23420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23421b = -1;
    public int c = -1;
    public l4f.p d;
    public l4f.p e;
    public Equivalence<Object> f;

    public k4f a(int i) {
        int i2 = this.c;
        c6i.v(i2 == -1, "concurrency level was already set to %s", i2);
        c6i.d(i > 0);
        this.c = i;
        return this;
    }

    public int b() {
        int i = this.c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    public int c() {
        int i = this.f23421b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    public Equivalence<Object> d() {
        return (Equivalence) d8g.a(this.f, e().b());
    }

    public l4f.p e() {
        return (l4f.p) d8g.a(this.d, l4f.p.f24652a);
    }

    public l4f.p f() {
        return (l4f.p) d8g.a(this.e, l4f.p.f24652a);
    }

    public k4f g(int i) {
        int i2 = this.f23421b;
        c6i.v(i2 == -1, "initial capacity was already set to %s", i2);
        c6i.d(i >= 0);
        this.f23421b = i;
        return this;
    }

    public k4f h(Equivalence<Object> equivalence) {
        Equivalence<Object> equivalence2 = this.f;
        c6i.w(equivalence2 == null, "key equivalence was already set to %s", equivalence2);
        this.f = (Equivalence) c6i.o(equivalence);
        this.f23420a = true;
        return this;
    }

    public <K, V> ConcurrentMap<K, V> i() {
        return !this.f23420a ? new ConcurrentHashMap(c(), 0.75f, b()) : l4f.b(this);
    }

    public k4f j(l4f.p pVar) {
        l4f.p pVar2 = this.d;
        c6i.w(pVar2 == null, "Key strength was already set to %s", pVar2);
        this.d = (l4f.p) c6i.o(pVar);
        if (pVar != l4f.p.f24652a) {
            this.f23420a = true;
        }
        return this;
    }

    public k4f k(l4f.p pVar) {
        l4f.p pVar2 = this.e;
        c6i.w(pVar2 == null, "Value strength was already set to %s", pVar2);
        this.e = (l4f.p) c6i.o(pVar);
        if (pVar != l4f.p.f24652a) {
            this.f23420a = true;
        }
        return this;
    }

    public k4f l() {
        return j(l4f.p.f24653b);
    }

    public String toString() {
        d8g.b bVarB = d8g.b(this);
        int i = this.f23421b;
        if (i != -1) {
            bVarB.b("initialCapacity", i);
        }
        int i2 = this.c;
        if (i2 != -1) {
            bVarB.b("concurrencyLevel", i2);
        }
        l4f.p pVar = this.d;
        if (pVar != null) {
            bVarB.d("keyStrength", fk1.e(pVar.toString()));
        }
        l4f.p pVar2 = this.e;
        if (pVar2 != null) {
            bVarB.d("valueStrength", fk1.e(pVar2.toString()));
        }
        if (this.f != null) {
            bVarB.j("keyEquivalence");
        }
        return bVarB.toString();
    }
}
