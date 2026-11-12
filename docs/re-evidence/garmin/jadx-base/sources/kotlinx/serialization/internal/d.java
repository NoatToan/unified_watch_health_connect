package kotlinx.serialization.internal;

import m63.p1;
import m63.w;
import m63.x;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/internal/d;", "Li63/c;", "", "Lm63/p1;", "", "Lm63/w;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends p1<Double, double[], w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f105970c = new d();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private d() {
        super(x.f117036a);
        p005kotlin.jvm.internal.k.f105801a.getClass();
    }

    @Override // m63.a
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // m63.s, m63.a
    public final void f(l63.c cVar, int i14, Object obj) {
        w wVar = (w) obj;
        wVar.getClass();
        double dT = cVar.t(this.f117005b, i14);
        wVar.b(wVar.getF117030b() + 1);
        double[] dArr = wVar.f117029a;
        int i15 = wVar.f117030b;
        wVar.f117030b = i15 + 1;
        dArr[i15] = dT;
    }

    @Override // m63.a
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return new w(dArr);
    }

    @Override // m63.p1
    public final double[] j() {
        return new double[0];
    }

    @Override // m63.p1
    public final void k(l63.d dVar, double[] dArr, int i14) {
        double[] dArr2 = dArr;
        dVar.getClass();
        dArr2.getClass();
        for (int i15 = 0; i15 < i14; i15++) {
            dVar.B(this.f117005b, i15, dArr2[i15]);
        }
    }
}
