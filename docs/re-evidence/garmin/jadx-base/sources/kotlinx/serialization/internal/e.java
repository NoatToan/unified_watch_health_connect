package kotlinx.serialization.internal;

import m63.c0;
import m63.d0;
import m63.p1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/internal/e;", "Li63/c;", "", "Lm63/p1;", "", "Lm63/c0;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends p1<Float, float[], c0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f105971c = new e();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private e() {
        super(d0.f116930a);
        m.f105803a.getClass();
    }

    @Override // m63.a
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // m63.s, m63.a
    public final void f(l63.c cVar, int i14, Object obj) {
        c0 c0Var = (c0) obj;
        c0Var.getClass();
        float fN = cVar.n(this.f117005b, i14);
        c0Var.b(c0Var.getF116924b() + 1);
        float[] fArr = c0Var.f116923a;
        int i15 = c0Var.f116924b;
        c0Var.f116924b = i15 + 1;
        fArr[i15] = fN;
    }

    @Override // m63.a
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return new c0(fArr);
    }

    @Override // m63.p1
    public final float[] j() {
        return new float[0];
    }

    @Override // m63.p1
    public final void k(l63.d dVar, float[] fArr, int i14) {
        float[] fArr2 = fArr;
        dVar.getClass();
        fArr2.getClass();
        for (int i15 = 0; i15 < i14; i15++) {
            dVar.x(this.f117005b, i15, fArr2[i15]);
        }
    }
}
