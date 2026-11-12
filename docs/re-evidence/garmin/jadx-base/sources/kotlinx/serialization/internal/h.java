package kotlinx.serialization.internal;

import m63.p1;
import m63.w1;
import m63.x1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.v0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/internal/h;", "Li63/c;", "", "Lm63/p1;", "", "Lm63/w1;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h extends p1<Short, short[], w1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f105974c = new h();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private h() {
        super(x1.f117042a);
        v0.f105815a.getClass();
    }

    @Override // m63.a
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // m63.s, m63.a
    public final void f(l63.c cVar, int i14, Object obj) {
        w1 w1Var = (w1) obj;
        w1Var.getClass();
        short sB = cVar.B(this.f117005b, i14);
        w1Var.b(w1Var.getF117035b() + 1);
        short[] sArr = w1Var.f117034a;
        int i15 = w1Var.f117035b;
        w1Var.f117035b = i15 + 1;
        sArr[i15] = sB;
    }

    @Override // m63.a
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return new w1(sArr);
    }

    @Override // m63.p1
    public final short[] j() {
        return new short[0];
    }

    @Override // m63.p1
    public final void k(l63.d dVar, short[] sArr, int i14) {
        short[] sArr2 = sArr;
        dVar.getClass();
        sArr2.getClass();
        for (int i15 = 0; i15 < i14; i15++) {
            dVar.r(this.f117005b, i15, sArr2[i15]);
        }
    }
}
