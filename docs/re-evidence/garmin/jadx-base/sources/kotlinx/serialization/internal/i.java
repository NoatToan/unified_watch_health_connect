package kotlinx.serialization.internal;

import m63.b2;
import m63.c2;
import m63.p1;
import o13.v;
import o13.w;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/internal/i;", "Li63/c;", "Lo13/w;", "Lm63/p1;", "Lo13/v;", "Lm63/b2;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i extends p1<v, w, b2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f105975c = new i();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private i() {
        super(c2.f116928a);
        v.f128608b.getClass();
    }

    @Override // m63.a
    public final int d(Object obj) {
        byte[] bArr = ((w) obj).f128610a;
        bArr.getClass();
        return bArr.length;
    }

    @Override // m63.s, m63.a
    public final void f(l63.c cVar, int i14, Object obj) {
        b2 b2Var = (b2) obj;
        b2Var.getClass();
        byte bM = cVar.j(this.f117005b, i14).m();
        v.a aVar = v.f128608b;
        b2Var.b(b2Var.getF116958b() + 1);
        byte[] bArr = b2Var.f116921a;
        int i15 = b2Var.f116922b;
        b2Var.f116922b = i15 + 1;
        bArr[i15] = bM;
    }

    @Override // m63.a
    public final Object g(Object obj) {
        byte[] bArr = ((w) obj).f128610a;
        bArr.getClass();
        return new b2(bArr, null);
    }

    @Override // m63.p1
    public final w j() {
        return w.a(new byte[0]);
    }

    @Override // m63.p1
    public final void k(l63.d dVar, w wVar, int i14) {
        byte[] bArr = wVar.f128610a;
        dVar.getClass();
        bArr.getClass();
        for (int i15 = 0; i15 < i14; i15++) {
            l63.f fVarF = dVar.f(this.f117005b, i15);
            byte b14 = bArr[i15];
            v.a aVar = v.f128608b;
            fVarF.w(b14);
        }
    }
}
