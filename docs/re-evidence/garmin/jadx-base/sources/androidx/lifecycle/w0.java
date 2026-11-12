package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class w0<T> extends y0<T> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o.b<s0<?>, a<?>> f8061l;

    public static class a<V> implements z0<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s0<V> f8062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final z0<? super V> f8063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8064c = -1;

        public a(s0<V> s0Var, z0<? super V> z0Var) {
            this.f8062a = s0Var;
            this.f8063b = z0Var;
        }

        @Override // androidx.lifecycle.z0
        public final void onChanged(V v14) {
            int i14 = this.f8064c;
            int i15 = this.f8062a.f8016g;
            if (i14 != i15) {
                this.f8064c = i15;
                this.f8063b.onChanged(v14);
            }
        }
    }

    public w0() {
        this.f8061l = new o.b<>();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.lifecycle.s0
    public void h() {
        Iterator<Map.Entry<s0<?>, a<?>>> it = this.f8061l.iterator();
        while (true) {
            o.b.e eVar = (o.b.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            a aVar = (a) ((Map.Entry) eVar.next()).getValue();
            aVar.f8062a.g(aVar);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.lifecycle.s0
    public void i() {
        Iterator<Map.Entry<s0<?>, a<?>>> it = this.f8061l.iterator();
        while (true) {
            o.b.e eVar = (o.b.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            a aVar = (a) ((Map.Entry) eVar.next()).getValue();
            aVar.f8062a.k(aVar);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public <S> void n(s0<S> s0Var, z0<? super S> z0Var) {
        a<?> aVar;
        if (s0Var == null) {
            j20.x.l("source cannot be null");
            return;
        }
        a aVar2 = new a(s0Var, z0Var);
        o.b<s0<?>, a<?>> bVar = this.f8061l;
        o.b.c<s0<?>, a<?>> cVarA = bVar.a(s0Var);
        if (cVarA != null) {
            aVar = cVarA.f128472b;
        } else {
            o.b.c<K, V> cVar = new o.b.c<>(s0Var, aVar2);
            bVar.f128470d++;
            o.b.c<K, V> cVar2 = bVar.f128468b;
            if (cVar2 == 0) {
                bVar.f128467a = cVar;
                bVar.f128468b = cVar;
            } else {
                cVar2.f128473c = cVar;
                cVar.f128474d = cVar2;
                bVar.f128468b = cVar;
            }
            aVar = null;
        }
        a<?> aVar3 = aVar;
        if (aVar3 != null && aVar3.f8063b != z0Var) {
            vb.h.s("This source was already added with the different observer");
        } else if (aVar3 == null && e()) {
            aVar2.f8062a.g(aVar2);
        }
    }

    public final <S> void o(s0<S> s0Var) {
        a<?> aVarB = this.f8061l.b(s0Var);
        if (aVarB != null) {
            aVarB.f8062a.k(aVarB);
        }
    }

    public w0(T t7) {
        super(t7);
        this.f8061l = new o.b<>();
    }
}
