package o53;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo53/t1;", "Lo53/z;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class t1 extends z {
    public abstract t1 H();

    @Override // o53.z
    public z limitedParallelism(int i14, String str) {
        oe2.f.i(i14);
        return str != null ? new u53.q(this, str) : this;
    }

    @Override // o53.z
    /* JADX INFO: renamed from: toString */
    public String getF168767c() {
        t1 t1VarH;
        String str;
        x53.c cVar = s0.f129406a;
        t1 t1Var = u53.o.f168762a;
        if (this == t1Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                t1VarH = t1Var.H();
            } catch (UnsupportedOperationException unused) {
                t1VarH = null;
            }
            str = this == t1VarH ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + f0.u(this);
    }
}
