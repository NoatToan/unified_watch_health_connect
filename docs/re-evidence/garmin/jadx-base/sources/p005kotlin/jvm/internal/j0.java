package p005kotlin.jvm.internal;

import k23.c;
import k23.o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j0 extends l0 implements o {
    public j0(Class cls, String str, String str2, int i14) {
        super(e.NO_RECEIVER, cls, str, str2, i14);
    }

    @Override // p005kotlin.jvm.internal.e
    public final c computeReflected() {
        return s0.f105811a.i(this);
    }

    @Override // k23.l
    public final o.a getGetter() {
        return ((o) getReflected()).getGetter();
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) this).getGetter().call(obj, obj2);
    }

    public j0() {
    }
}
