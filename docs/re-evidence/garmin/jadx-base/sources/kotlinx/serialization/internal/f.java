package kotlinx.serialization.internal;

import m63.l0;
import m63.m0;
import m63.p1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/internal/f;", "Li63/c;", "", "Lm63/p1;", "", "Lm63/l0;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends p1<Integer, int[], l0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f105972c = new f();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private f() {
        super(m0.f116981a);
        r.f105809a.getClass();
    }

    @Override // m63.a
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // m63.s, m63.a
    public final void f(l63.c cVar, int i14, Object obj) {
        l0 l0Var = (l0) obj;
        l0Var.getClass();
        int iA = cVar.A(this.f117005b, i14);
        l0Var.b(l0Var.getF117024b() + 1);
        int[] iArr = l0Var.f116975a;
        int i15 = l0Var.f116976b;
        l0Var.f116976b = i15 + 1;
        iArr[i15] = iA;
    }

    @Override // m63.a
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return new l0(iArr);
    }

    @Override // m63.p1
    public final int[] j() {
        return new int[0];
    }

    @Override // m63.p1
    public final void k(l63.d dVar, int[] iArr, int i14) {
        int[] iArr2 = iArr;
        dVar.getClass();
        iArr2.getClass();
        for (int i15 = 0; i15 < i14; i15++) {
            dVar.v(i15, iArr2[i15], this.f117005b);
        }
    }
}
