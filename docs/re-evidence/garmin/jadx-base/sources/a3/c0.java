package a3;

import p005kotlin.Metadata;
import p3.x1;
import p3.y3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La3/c0;", "La3/j0;", "<init>", "()V", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f630a = new c0();

    private c0() {
    }

    @Override // a3.j0
    public final long a(long j8, float f14, p3.m mVar, int i14) {
        mVar.C(-1687113661);
        x1 x1Var = p3.n.f135158a;
        o0.f762a.getClass();
        t tVarA = o0.a(mVar);
        if (g6.f.b(f14, 0) <= 0 || tVarA.c()) {
            mVar.C(-1095489470);
            mVar.f();
        } else {
            mVar.C(-1095627978);
            y3 y3Var = k0.f707a;
            j8 = o4.f0.g(o4.d0.c(((((float) Math.log(f14 + 1)) * 4.5f) + 2.0f) / 100.0f, u.a(j8, mVar), 14), j8);
            mVar.f();
        }
        mVar.f();
        return j8;
    }
}
