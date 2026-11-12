package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class ecd<K, V> implements gpf<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gpf<K, V> f16483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ipf f16484b;

    public ecd(gpf<K, V> gpfVar, ipf ipfVar) {
        this.f16483a = gpfVar;
        this.f16484b = ipfVar;
    }

    @Override // defpackage.gpf
    public w14<V> a(K k2, w14<V> w14Var) {
        this.f16484b.c();
        return this.f16483a.a(k2, w14Var);
    }

    @Override // defpackage.gpf
    public boolean b(j6i<K> j6iVar) {
        return this.f16483a.b(j6iVar);
    }

    @Override // defpackage.gpf
    public int c(j6i<K> j6iVar) {
        return this.f16483a.c(j6iVar);
    }

    @Override // defpackage.gpf
    public w14<V> get(K k2) {
        w14<V> w14Var = this.f16483a.get(k2);
        if (w14Var == null) {
            this.f16484b.b();
        } else {
            this.f16484b.a(k2);
        }
        return w14Var;
    }
}
