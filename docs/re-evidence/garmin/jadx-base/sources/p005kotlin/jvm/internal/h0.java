package p005kotlin.jvm.internal;

import k23.c;
import k23.n;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h0 extends l0 implements n {
    public h0() {
    }

    @Override // p005kotlin.jvm.internal.e
    public c computeReflected() {
        return s0.f105811a.h(this);
    }

    @Override // k23.n
    public Object getDelegate(Object obj) {
        return ((n) getReflected()).getDelegate(obj);
    }

    @Override // k23.l
    public n.a getGetter() {
        return ((n) getReflected()).getGetter();
    }

    @Override // e23.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    public h0(Object obj) {
        super(obj);
    }

    public h0(Object obj, Class cls, String str, String str2, int i14) {
        super(obj, cls, str, str2, i14);
    }
}
