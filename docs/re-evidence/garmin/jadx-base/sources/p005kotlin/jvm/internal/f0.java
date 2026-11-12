package p005kotlin.jvm.internal;

import k23.c;
import k23.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f0 extends l0 implements m {
    public f0() {
    }

    @Override // p005kotlin.jvm.internal.e
    public final c computeReflected() {
        return s0.f105811a.g(this);
    }

    @Override // k23.l
    public final m.a getGetter() {
        return ((m) getReflected()).getGetter();
    }

    @Override // e23.a
    public final Object invoke() {
        return get();
    }

    public f0(Object obj) {
        super(obj);
    }

    public f0(Object obj, Class cls, String str, String str2, int i14) {
        super(obj, cls, str, str2, i14);
    }
}
