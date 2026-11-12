package p005kotlin.jvm.internal;

import k23.c;
import k23.j;
import k23.n;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a0 extends c0 implements j {
    public a0() {
    }

    @Override // p005kotlin.jvm.internal.e
    public final c computeReflected() {
        return s0.f105811a.f(this);
    }

    @Override // k23.n
    public final Object getDelegate(Object obj) {
        return ((j) getReflected()).getDelegate(obj);
    }

    @Override // k23.l
    public final n.a getGetter() {
        return ((j) getReflected()).getGetter();
    }

    @Override // k23.h
    public final j.a getSetter() {
        return ((j) getReflected()).getSetter();
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        return get(obj);
    }

    public a0(Object obj) {
        super(obj);
    }

    public a0(Object obj, Class cls, String str, String str2, int i14) {
        super(obj, cls, str, str2, i14);
    }
}
