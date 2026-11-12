package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class inq<K, A> extends o82<K, A> {
    public final A i;

    public inq(yte<A> yteVar) {
        this(yteVar, null);
    }

    @Override // defpackage.o82
    public float c() {
        return 1.0f;
    }

    @Override // defpackage.o82
    public A h() {
        yte<A> yteVar = this.e;
        A a2 = this.i;
        return yteVar.b(0.0f, 0.0f, a2, a2, f(), f(), f());
    }

    @Override // defpackage.o82
    public A i(e1e<K> e1eVar, float f) {
        return h();
    }

    @Override // defpackage.o82
    public void k() {
        if (this.e != null) {
            super.k();
        }
    }

    @Override // defpackage.o82
    public void m(float f) {
        this.d = f;
    }

    public inq(yte<A> yteVar, A a2) {
        super(Collections.emptyList());
        n(yteVar);
        this.i = a2;
    }
}
