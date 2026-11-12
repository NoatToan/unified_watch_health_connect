package qj;

import p1.k1;

/* JADX INFO: loaded from: classes7.dex */
public final class b<K, V> extends p1.a<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f144962g;

    @Override // p1.k1, java.util.Map
    public final void clear() {
        this.f144962g = 0;
        super.clear();
    }

    @Override // p1.k1
    public final void h(k1<? extends K, ? extends V> k1Var) {
        this.f144962g = 0;
        super.h(k1Var);
    }

    @Override // p1.k1, java.util.Map
    public final int hashCode() {
        if (this.f144962g == 0) {
            this.f144962g = super.hashCode();
        }
        return this.f144962g;
    }

    @Override // p1.k1
    public final V i(int i14) {
        this.f144962g = 0;
        return (V) super.i(i14);
    }

    @Override // p1.k1
    public final V j(int i14, V v14) {
        this.f144962g = 0;
        return (V) super.j(i14, v14);
    }

    @Override // p1.k1, java.util.Map
    public final V put(K k14, V v14) {
        this.f144962g = 0;
        return (V) super.put(k14, v14);
    }
}
