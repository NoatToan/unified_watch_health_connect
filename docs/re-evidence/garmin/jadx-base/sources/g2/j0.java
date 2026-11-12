package g2;

import f5.l2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg2/j0;", "Lf5/l2;", "Lg2/h0;", "factory", "<init>", "(Lg2/h0;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j0 implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f75141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1.p0<Object> f75142b = p1.z0.a();

    public j0(h0 h0Var) {
        this.f75141a = h0Var;
    }

    @Override // f5.l2
    public final void a(l2.a aVar) {
        p1.p0<Object> p0Var = this.f75142b;
        p0Var.c();
        p1.r0<Object> r0Var = aVar.f69005a;
        Object[] objArr = r0Var.f134684b;
        long[] jArr = r0Var.f134685c;
        int i14 = r0Var.f134687e;
        while (i14 != Integer.MAX_VALUE) {
            int i15 = (int) ((jArr[i14] >> 31) & 2147483647L);
            Object obj = objArr[i14];
            Object objB = this.f75141a.b(obj);
            int iA = p0Var.a(objB);
            int i16 = iA >= 0 ? p0Var.f134875c[iA] : 0;
            if (i16 == 7) {
                aVar.remove(obj);
            } else {
                p0Var.h(objB, i16 + 1);
            }
            i14 = i15;
        }
    }

    @Override // f5.l2
    public final boolean b(Object obj, Object obj2) {
        h0 h0Var = this.f75141a;
        return p005kotlin.jvm.internal.s.g(h0Var.b(obj), h0Var.b(obj2));
    }
}
