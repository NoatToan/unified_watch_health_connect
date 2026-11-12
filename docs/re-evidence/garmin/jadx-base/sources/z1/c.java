package z1;

import p005kotlin.Metadata;
import p008y1.o2;
import s1.y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz1/c;", "Lz1/b;", "", "Ls1/n;", "Ls1/y;", "decayAnimationSpec", "<init>", "(Ls1/y;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements b<Float, s1.n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y<Float> f200825a;

    public c(y<Float> yVar) {
        this.f200825a = yVar;
    }

    @Override // z1.b
    public final Object a(o2 o2Var, Float f14, Float f15, e23.l lVar, n nVar) {
        Object objA = s.a(o2Var, f14.floatValue(), s1.v.a(0.0f, f15.floatValue(), 28), this.f200825a, lVar, nVar);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : (a) objA;
    }
}
