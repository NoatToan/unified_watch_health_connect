package kotlinx.serialization.internal;

import m63.d2;
import m63.e2;
import m63.p1;
import o13.x;
import o13.y;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/internal/j;", "Li63/c;", "Lo13/y;", "Lm63/p1;", "Lo13/x;", "Lm63/d2;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j extends p1<x, y, d2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f105976c = new j();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private j() {
        super(e2.f116939a);
        x.f128613b.getClass();
    }

    @Override // m63.a
    public final int d(Object obj) {
        int[] iArr = ((y) obj).f128615a;
        iArr.getClass();
        return iArr.length;
    }

    @Override // m63.s, m63.a
    public final void f(l63.c cVar, int i14, Object obj) {
        d2 d2Var = (d2) obj;
        d2Var.getClass();
        int iU = cVar.j(this.f117005b, i14).u();
        x.a aVar = x.f128613b;
        d2Var.b(d2Var.getF116935b() + 1);
        int[] iArr = d2Var.f116934a;
        int i15 = d2Var.f116935b;
        d2Var.f116935b = i15 + 1;
        iArr[i15] = iU;
    }

    @Override // m63.a
    public final Object g(Object obj) {
        int[] iArr = ((y) obj).f128615a;
        iArr.getClass();
        return new d2(iArr, null);
    }

    @Override // m63.p1
    public final y j() {
        return y.a(new int[0]);
    }

    @Override // m63.p1
    public final void k(l63.d dVar, y yVar, int i14) {
        int[] iArr = yVar.f128615a;
        dVar.getClass();
        iArr.getClass();
        for (int i15 = 0; i15 < i14; i15++) {
            l63.f fVarF = dVar.f(this.f117005b, i15);
            int i16 = iArr[i15];
            x.a aVar = x.f128613b;
            fVarF.o(i16);
        }
    }
}
