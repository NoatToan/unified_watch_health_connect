package p3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp3/r1;", "", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1.t0<Object, Object> f135260a = q3.b.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1.t0<Object, Object> f135261b = q3.b.c();

    public final void a(j1 j1Var) {
        Object objD = this.f135261b.d(j1Var);
        if (objD != null) {
            boolean z14 = objD instanceof p1.q0;
            p1.t0<Object, Object> t0Var = this.f135260a;
            if (!z14) {
                q3.b.e(t0Var, (h1) objD, new q1(j1Var, 0));
                return;
            }
            p1.a1 a1Var = (p1.a1) objD;
            Object[] objArr = a1Var.f134667a;
            int i14 = a1Var.f134668b;
            for (int i15 = 0; i15 < i14; i15++) {
                Object obj = objArr[i15];
                obj.getClass();
                q3.b.e(t0Var, (h1) obj, new q1(j1Var, 0));
            }
        }
    }
}
