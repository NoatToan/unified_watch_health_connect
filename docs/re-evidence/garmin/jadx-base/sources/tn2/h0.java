package tn2;

import okhttp3.ResponseBody;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f165569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f165570c;

    public /* synthetic */ h0(r0 r0Var, String str, int i14) {
        this.f165568a = i14;
        this.f165569b = r0Var;
        this.f165570c = str;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f165568a;
        final int i15 = 2;
        final int i16 = 1;
        final int i17 = 0;
        final String str = this.f165570c;
        final r0 r0Var = this.f165569b;
        switch (i14) {
            case 0:
                Throwable th3 = (Throwable) obj;
                Logger logger = r0.f165631n;
                th3.getClass();
                r0Var.f165642k.b(str, qs2.f.ERROR);
                return r0.r("getCardUsageHistory()", th3);
            case 1:
                Boolean bool = (Boolean) obj;
                Logger logger2 = r0.f165631n;
                bool.getClass();
                if (!bool.booleanValue()) {
                    return z03.f.f200765a;
                }
                e13.k kVarE = r0Var.e();
                w wVar = r0Var.f165632a;
                wVar.getClass();
                str.getClass();
                com.google.firebase.remoteconfig.b bVar = new com.google.firebase.remoteconfig.b(5, wVar, str);
                int i18 = w03.b.f181178a;
                return kVarE.d(new z03.d(bVar)).d(wVar.o());
            case 2:
                Logger logger3 = r0.f165631n;
                ((rn2.r) obj).getClass();
                u03.a aVar = new u03.a() { // from class: tn2.m0
                    @Override // u03.a
                    public final void run() {
                        switch (i16) {
                            case 0:
                                j jVar = r0Var.f165642k;
                                jVar.getClass();
                                String str2 = str;
                                str2.getClass();
                                jVar.f165578a.n(str2);
                                break;
                            case 1:
                                j jVar2 = r0Var.f165642k;
                                jVar2.getClass();
                                String str3 = str;
                                str3.getClass();
                                jVar2.f165578a.n(str3);
                                break;
                            default:
                                j jVar3 = r0Var.f165642k;
                                jVar3.getClass();
                                String str4 = str;
                                str4.getClass();
                                jVar3.f165578a.n(str4);
                                break;
                        }
                    }
                };
                int i19 = w03.b.f181178a;
                return new z03.h(aVar);
            case 3:
                Logger logger4 = r0.f165631n;
                ((rn2.r) obj).getClass();
                u03.a aVar2 = new u03.a() { // from class: tn2.m0
                    @Override // u03.a
                    public final void run() {
                        switch (i15) {
                            case 0:
                                j jVar = r0Var.f165642k;
                                jVar.getClass();
                                String str2 = str;
                                str2.getClass();
                                jVar.f165578a.n(str2);
                                break;
                            case 1:
                                j jVar2 = r0Var.f165642k;
                                jVar2.getClass();
                                String str3 = str;
                                str3.getClass();
                                jVar2.f165578a.n(str3);
                                break;
                            default:
                                j jVar3 = r0Var.f165642k;
                                jVar3.getClass();
                                String str4 = str;
                                str4.getClass();
                                jVar3.f165578a.n(str4);
                                break;
                        }
                    }
                };
                int i24 = w03.b.f181178a;
                return new z03.h(aVar2);
            case 4:
                Throwable th4 = (Throwable) obj;
                Logger logger5 = r0.f165631n;
                th4.getClass();
                r0Var.f165642k.b(str, qs2.f.ERROR);
                return r0.r("beginAccessCard()", th4);
            case 5:
                w.f fVar = (w.f) obj;
                Logger logger6 = r0.f165631n;
                fVar.getClass();
                f fVar2 = f.f165551a;
                byte[] bArr = fVar.f165719a;
                bArr.getClass();
                fVar2.getClass();
                String strA = f.a(bArr);
                Byte b14 = fVar.f165725g;
                b14.getClass();
                String strA2 = f.a(new byte[]{b14.byteValue()});
                pn2.n nVar = r0Var.f165637f;
                nVar.getClass();
                qn2.t tVarB = nVar.b(qn2.u.f145900a.b(), strA2, null);
                r0Var.f165638g.getClass();
                str.getClass();
                pn2.m<qn2.t, qn2.f> mVar = new pn2.m<>(tVarB, new qn2.f(str));
                mn2.b bVar2 = r0Var.f165633b;
                String strValueOf = String.valueOf(r0Var.f165632a.f165682c);
                pn2.a.f138690a.getClass();
                String str2 = pn2.a.e().f138762b;
                Logger logger7 = mn2.j.f119822a;
                bVar2.getClass();
                strValueOf.getClass();
                str2.getClass();
                q03.r<c83.a0<pn2.p<rn2.m>>> rVarJ = bVar2.j(strValueOf, strA, str2, mVar);
                mn2.e eVar = new mn2.e(new mn2.c(bVar2, strValueOf, strA, str2, mVar, 3), 2);
                rVarJ.getClass();
                int i25 = w03.b.f181178a;
                return new e13.r(new e13.j(new e13.j(rVarJ, eVar), new v(new m(15), 16)), new v(new h0(r0Var, str, i17), 17));
            case 6:
                Throwable th5 = (Throwable) obj;
                Logger logger8 = r0.f165631n;
                th5.getClass();
                r0Var.f165642k.b(str, qs2.f.ERROR);
                o0 o0Var = new o0(0, "updateCardInfo()", th5);
                int i26 = w03.b.f181178a;
                return new z03.d(o0Var);
            case 7:
                Throwable th6 = (Throwable) obj;
                Logger logger9 = r0.f165631n;
                th6.getClass();
                r0Var.f165642k.b(str, qs2.f.ERROR);
                return r0.r("beginDeleteCard()", th6);
            case 8:
                w.f fVar3 = (w.f) obj;
                Logger logger10 = r0.f165631n;
                fVar3.getClass();
                f fVar4 = f.f165551a;
                byte[] bArr2 = fVar3.f165719a;
                bArr2.getClass();
                fVar4.getClass();
                String strA3 = f.a(bArr2);
                Byte b15 = fVar3.f165725g;
                b15.getClass();
                String strA4 = f.a(new byte[]{b15.byteValue()});
                pn2.n nVar2 = r0Var.f165637f;
                nVar2.getClass();
                qn2.t tVarB2 = nVar2.b(qn2.u.f145900a.b(), strA4, null);
                r0Var.f165638g.getClass();
                pn2.m<qn2.t, qn2.f> mVar2 = new pn2.m<>(tVarB2, new qn2.f(str));
                mn2.b bVar3 = r0Var.f165633b;
                String strValueOf2 = String.valueOf(r0Var.f165632a.f165682c);
                pn2.a.f138690a.getClass();
                q03.r<c83.a0<ResponseBody>> rVarD = bVar3.d(strValueOf2, strA3, pn2.a.e().f138762b, mVar2);
                k0 k0Var = new k0(new m(r0Var, 27), 25);
                rVarD.getClass();
                int i27 = w03.b.f181178a;
                return new e13.j(rVarD, k0Var);
            case 9:
                Throwable th7 = (Throwable) obj;
                Logger logger11 = r0.f165631n;
                th7.getClass();
                r0Var.f165642k.b(str, qs2.f.ERROR);
                return r0.r("beginPermanentDeleteCard()", th7);
            case 10:
                Throwable th8 = (Throwable) obj;
                Logger logger12 = r0.f165631n;
                th8.getClass();
                r0Var.f165642k.b(str, qs2.f.ERROR);
                return r0.r("beginDeleteCard()", th8);
            default:
                Logger logger13 = r0.f165631n;
                ((rn2.q) obj).getClass();
                u03.a aVar3 = new u03.a() { // from class: tn2.m0
                    @Override // u03.a
                    public final void run() {
                        switch (i17) {
                            case 0:
                                j jVar = r0Var.f165642k;
                                jVar.getClass();
                                String str3 = str;
                                str3.getClass();
                                jVar.f165578a.n(str3);
                                break;
                            case 1:
                                j jVar2 = r0Var.f165642k;
                                jVar2.getClass();
                                String str4 = str;
                                str4.getClass();
                                jVar2.f165578a.n(str4);
                                break;
                            default:
                                j jVar3 = r0Var.f165642k;
                                jVar3.getClass();
                                String str5 = str;
                                str5.getClass();
                                jVar3.f165578a.n(str5);
                                break;
                        }
                    }
                };
                int i28 = w03.b.f181178a;
                return new z03.h(aVar3);
        }
    }
}
