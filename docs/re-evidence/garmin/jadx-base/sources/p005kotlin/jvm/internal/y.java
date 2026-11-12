package p005kotlin.jvm.internal;

import k23.c;
import k23.i;
import k23.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y extends c0 implements i {
    public y() {
    }

    @Override // p005kotlin.jvm.internal.e
    public c computeReflected() {
        return s0.f105811a.e(this);
    }

    @Override // k23.m
    public Object getDelegate() {
        return ((i) getReflected()).getDelegate();
    }

    @Override // k23.l
    public m.a getGetter() {
        return ((i) getReflected()).getGetter();
    }

    @Override // k23.h
    public i.a getSetter() {
        return ((i) getReflected()).getSetter();
    }

    @Override // e23.a
    public Object invoke() {
        return get();
    }

    public y(Object obj) {
        super(obj);
    }

    public y(Object obj, Class cls, String str, String str2, int i14) {
        super(obj, cls, str, str2, i14);
    }
}
