package kotlinx.serialization.internal;

import m63.m;
import m63.n;
import m63.p1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/internal/c;", "Li63/c;", "", "Lm63/p1;", "", "Lm63/m;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends p1<Character, char[], m> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f105969c = new c();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private c() {
        super(n.f116995a);
        p005kotlin.jvm.internal.f.f105796a.getClass();
    }

    @Override // m63.a
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // m63.s, m63.a
    public final void f(l63.c cVar, int i14, Object obj) {
        m mVar = (m) obj;
        mVar.getClass();
        char cD = cVar.d(this.f117005b, i14);
        mVar.b(mVar.getF117035b() + 1);
        char[] cArr = mVar.f116979a;
        int i15 = mVar.f116980b;
        mVar.f116980b = i15 + 1;
        cArr[i15] = cD;
    }

    @Override // m63.a
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return new m(cArr);
    }

    @Override // m63.p1
    public final char[] j() {
        return new char[0];
    }

    @Override // m63.p1
    public final void k(l63.d dVar, char[] cArr, int i14) {
        char[] cArr2 = cArr;
        dVar.getClass();
        cArr2.getClass();
        for (int i15 = 0; i15 < i14; i15++) {
            dVar.u(this.f117005b, i15, cArr2[i15]);
        }
    }
}
