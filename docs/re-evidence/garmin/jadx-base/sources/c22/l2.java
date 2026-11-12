package c22;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lc22/l2;", "T", "Landroidx/lifecycle/y0;", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l2<T> extends androidx.lifecycle.y0<T> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f23121l = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lc22/l2$a;", "Landroidx/lifecycle/z0;", "observer", "<init>", "(Lc22/l2;Landroidx/lifecycle/z0;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a implements androidx.lifecycle.z0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashSet f23122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f23123b;

        public a(l2 l2Var, androidx.lifecycle.z0<T> z0Var) {
            z0Var.getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            this.f23122a = linkedHashSet;
            this.f23123b = new AtomicBoolean(false);
            linkedHashSet.add(z0Var);
        }

        @Override // androidx.lifecycle.z0
        public final void onChanged(T t7) {
            if (this.f23123b.compareAndSet(true, false)) {
                Iterator<T> it = this.f23122a.iterator();
                while (it.hasNext()) {
                    ((androidx.lifecycle.z0) it.next()).onChanged(t7);
                }
            }
        }
    }

    @Override // androidx.lifecycle.s0
    public final void f(androidx.lifecycle.n0 n0Var, androidx.lifecycle.z0<? super T> z0Var) {
        n0Var.getClass();
        z0Var.getClass();
        LinkedHashMap linkedHashMap = this.f23121l;
        a aVar = (a) linkedHashMap.get(n0Var);
        if (aVar != null) {
            aVar.f23122a.add(z0Var);
            return;
        }
        a aVar2 = new a(this, z0Var);
        super.f(n0Var, aVar2);
        linkedHashMap.put(n0Var, aVar2);
    }

    @Override // androidx.lifecycle.s0
    public final void g(androidx.lifecycle.z0<? super T> z0Var) {
        z0Var.getClass();
        androidx.lifecycle.e1.f7874i.getClass();
        androidx.lifecycle.e1 e1Var = androidx.lifecycle.e1.f7875j;
        LinkedHashMap linkedHashMap = this.f23121l;
        a aVar = (a) linkedHashMap.get(e1Var);
        if (aVar != null) {
            aVar.f23122a.add(z0Var);
            return;
        }
        a aVar2 = new a(this, z0Var);
        super.g(aVar2);
        linkedHashMap.put(e1Var, aVar2);
    }

    @Override // androidx.lifecycle.s0
    public final void j(T t7) {
        Iterator it = this.f23121l.entrySet().iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).f23123b.set(true);
        }
        super.j(t7);
    }

    @Override // androidx.lifecycle.s0
    public final void k(androidx.lifecycle.z0<? super T> z0Var) {
        z0Var.getClass();
        Iterator it = this.f23121l.entrySet().iterator();
        while (it.hasNext()) {
            a aVar = (a) ((Map.Entry) it.next()).getValue();
            aVar.getClass();
            aVar.f23122a.remove(z0Var);
        }
        super.k(z0Var);
    }

    @Override // androidx.lifecycle.s0
    public final void l(androidx.lifecycle.n0 n0Var) {
        n0Var.getClass();
        this.f23121l.remove(n0Var);
        super.l(n0Var);
    }

    @Override // androidx.lifecycle.s0
    public final void m(T t7) {
        Iterator it = this.f23121l.entrySet().iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).f23123b.set(true);
        }
        super.m(t7);
    }
}
