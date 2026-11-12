package kotlinx.serialization.internal;

import m63.p1;
import m63.u0;
import m63.v0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/internal/g;", "Li63/c;", "", "Lm63/p1;", "", "Lm63/u0;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends p1<Long, long[], u0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f105973c = new g();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private g() {
        super(v0.f117027a);
        x.f105817a.getClass();
    }

    @Override // m63.a
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // m63.s, m63.a
    public final void f(l63.c cVar, int i14, Object obj) {
        u0 u0Var = (u0) obj;
        u0Var.getClass();
        long jW = cVar.w(this.f117005b, i14);
        u0Var.b(u0Var.getF117024b() + 1);
        long[] jArr = u0Var.f117023a;
        int i15 = u0Var.f117024b;
        u0Var.f117024b = i15 + 1;
        jArr[i15] = jW;
    }

    @Override // m63.a
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return new u0(jArr);
    }

    @Override // m63.p1
    public final long[] j() {
        return new long[0];
    }

    @Override // m63.p1
    public final void k(l63.d dVar, long[] jArr, int i14) {
        long[] jArr2 = jArr;
        dVar.getClass();
        jArr2.getClass();
        for (int i15 = 0; i15 < i14; i15++) {
            dVar.z(this.f117005b, i15, jArr2[i15]);
        }
    }
}
