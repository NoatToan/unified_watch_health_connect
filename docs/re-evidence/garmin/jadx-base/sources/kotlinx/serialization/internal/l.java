package kotlinx.serialization.internal;

import m63.h2;
import m63.i2;
import m63.p1;
import o13.c0;
import o13.d0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/internal/l;", "Li63/c;", "Lo13/d0;", "Lm63/p1;", "Lo13/c0;", "Lm63/h2;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends p1<c0, d0, h2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f105978c = new l();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private l() {
        super(i2.f116962a);
        c0.f128567b.getClass();
    }

    @Override // m63.a
    public final int d(Object obj) {
        short[] sArr = ((d0) obj).f128573a;
        sArr.getClass();
        return sArr.length;
    }

    @Override // m63.s, m63.a
    public final void f(l63.c cVar, int i14, Object obj) {
        h2 h2Var = (h2) obj;
        h2Var.getClass();
        short sP = cVar.j(this.f117005b, i14).p();
        c0.a aVar = c0.f128567b;
        h2Var.b(h2Var.getF116958b() + 1);
        short[] sArr = h2Var.f116957a;
        int i15 = h2Var.f116958b;
        h2Var.f116958b = i15 + 1;
        sArr[i15] = sP;
    }

    @Override // m63.a
    public final Object g(Object obj) {
        short[] sArr = ((d0) obj).f128573a;
        sArr.getClass();
        return new h2(sArr, null);
    }

    @Override // m63.p1
    public final d0 j() {
        return d0.a(new short[0]);
    }

    @Override // m63.p1
    public final void k(l63.d dVar, d0 d0Var, int i14) {
        short[] sArr = d0Var.f128573a;
        dVar.getClass();
        sArr.getClass();
        for (int i15 = 0; i15 < i14; i15++) {
            l63.f fVarF = dVar.f(this.f117005b, i15);
            short s8 = sArr[i15];
            c0.a aVar = c0.f128567b;
            fVarF.h(s8);
        }
    }
}
