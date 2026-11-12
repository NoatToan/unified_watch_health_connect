package tn2;

import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class j0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f165583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f165584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f165585d;

    public /* synthetic */ j0(r0 r0Var, String str, e23.l lVar, int i14) {
        this.f165582a = i14;
        this.f165583b = r0Var;
        this.f165584c = str;
        this.f165585d = lVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f165582a) {
            case 0:
                w.f fVar = (w.f) obj;
                Logger logger = r0.f165631n;
                fVar.getClass();
                f fVar2 = f.f165551a;
                byte[] bArr = fVar.f165719a;
                bArr.getClass();
                fVar2.getClass();
                String strA = f.a(bArr);
                Byte b14 = fVar.f165725g;
                b14.getClass();
                String strA2 = f.a(new byte[]{b14.byteValue()});
                byte[] bArr2 = fVar.f165723e;
                bArr2.getClass();
                String strA3 = f.a(bArr2);
                String strB = qn2.u.f145900a.b();
                r0 r0Var = this.f165583b;
                pn2.n nVar = r0Var.f165637f;
                nVar.getClass();
                qn2.t tVarB = nVar.b(strB, strA2, null);
                r0Var.f165638g.getClass();
                String str = this.f165584c;
                str.getClass();
                pn2.m mVar = new pn2.m(tVarB, new qn2.f(str));
                mn2.b bVar = r0Var.f165633b;
                String strValueOf = String.valueOf(r0Var.f165632a.f165682c);
                pn2.a.f138690a.getClass();
                String str2 = pn2.a.e().f138762b;
                e23.l lVar = this.f165585d;
                e13.j jVarA = mn2.j.a(bVar, strValueOf, strA, str2, mVar, lVar);
                k0 k0Var = new k0(new l0(r0Var, strA3, strB, strA, strA2, lVar, 1), 17);
                int i14 = w03.b.f181178a;
                return new e13.r(new e13.j(jVarA, k0Var), new k0(new h0(r0Var, str, 7), 18));
            default:
                w.f fVar3 = (w.f) obj;
                Logger logger2 = r0.f165631n;
                fVar3.getClass();
                f fVar4 = f.f165551a;
                byte[] bArr3 = fVar3.f165719a;
                bArr3.getClass();
                fVar4.getClass();
                String strA4 = f.a(bArr3);
                Byte b15 = fVar3.f165725g;
                b15.getClass();
                String strA5 = f.a(new byte[]{b15.byteValue()});
                byte[] bArr4 = fVar3.f165723e;
                bArr4.getClass();
                String strA6 = f.a(bArr4);
                String strB2 = qn2.u.f145900a.b();
                r0 r0Var2 = this.f165583b;
                pn2.n nVar2 = r0Var2.f165637f;
                nVar2.getClass();
                qn2.t tVarB2 = nVar2.b(strB2, strA5, null);
                r0Var2.f165638g.getClass();
                String str3 = this.f165584c;
                str3.getClass();
                pn2.m<qn2.t, qn2.f> mVar2 = new pn2.m<>(tVarB2, new qn2.f(str3));
                mn2.b bVar2 = r0Var2.f165633b;
                String strValueOf2 = String.valueOf(r0Var2.f165632a.f165682c);
                pn2.a.f138690a.getClass();
                String str4 = pn2.a.e().f138762b;
                Logger logger3 = mn2.j.f119822a;
                bVar2.getClass();
                strValueOf2.getClass();
                str4.getClass();
                e23.l lVar2 = this.f165585d;
                lVar2.getClass();
                q03.r<c83.a0<pn2.p<rn2.d>>> rVarQ = bVar2.q(strValueOf2, strA4, str4, mVar2);
                lp2.h hVar = new lp2.h(new mn2.d(lVar2, bVar2, strValueOf2, strA4, str4, mVar2, 11), 26);
                rVarQ.getClass();
                int i15 = w03.b.f181178a;
                return new e13.r(new e13.j(new e13.j(rVarQ, hVar), new k0(new b82.l0(r0Var2, strA6, strB2, strA4, strA5, lVar2, str3), 15)), new k0(new m(r0Var2, 26), 16));
        }
    }
}
