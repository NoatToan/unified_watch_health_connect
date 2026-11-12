package kotlinx.serialization.internal;

import m63.f2;
import m63.g2;
import m63.p1;
import o13.a0;
import o13.z;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/internal/k;", "Li63/c;", "Lo13/a0;", "Lm63/p1;", "Lo13/z;", "Lm63/f2;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k extends p1<z, a0, f2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f105977c = new k();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private k() {
        super(g2.f116952a);
        z.f128618b.getClass();
    }

    @Override // m63.a
    public final int d(Object obj) {
        long[] jArr = ((a0) obj).f128562a;
        jArr.getClass();
        return jArr.length;
    }

    @Override // m63.s, m63.a
    public final void f(l63.c cVar, int i14, Object obj) {
        f2 f2Var = (f2) obj;
        f2Var.getClass();
        long jO = cVar.j(this.f117005b, i14).o();
        z.a aVar = z.f128618b;
        f2Var.b(f2Var.getF116947b() + 1);
        long[] jArr = f2Var.f116946a;
        int i15 = f2Var.f116947b;
        f2Var.f116947b = i15 + 1;
        jArr[i15] = jO;
    }

    @Override // m63.a
    public final Object g(Object obj) {
        long[] jArr = ((a0) obj).f128562a;
        jArr.getClass();
        return new f2(jArr, null);
    }

    @Override // m63.p1
    public final a0 j() {
        return a0.a(new long[0]);
    }

    @Override // m63.p1
    public final void k(l63.d dVar, a0 a0Var, int i14) {
        long[] jArr = a0Var.f128562a;
        dVar.getClass();
        jArr.getClass();
        for (int i15 = 0; i15 < i14; i15++) {
            l63.f fVarF = dVar.f(this.f117005b, i15);
            long j8 = jArr[i15];
            z.a aVar = z.f128618b;
            fVarF.s(j8);
        }
    }
}
