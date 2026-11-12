package tn2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f165577b;

    public /* synthetic */ i0(r0 r0Var, int i14) {
        this.f165576a = i14;
        this.f165577b = r0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        String iSO3Language;
        int i14 = this.f165576a;
        int i15 = 10;
        r0 r0Var = this.f165577b;
        switch (i14) {
            case 0:
                Boolean bool = (Boolean) obj;
                Logger logger = r0.f165631n;
                bool.getClass();
                if (!bool.booleanValue()) {
                    return z03.f.f200765a;
                }
                e13.j jVarT = r0Var.f165632a.t(new w.d(true, true, false, true, true, true, true, false, false, false, 900, null));
                k0 k0Var = new k0(new i0(r0Var, 2), i15);
                int i16 = w03.b.f181178a;
                return new z03.j(new e13.j(jVarT, k0Var));
            case 1:
                mn2.a aVar = (mn2.a) obj;
                Logger logger2 = r0.f165631n;
                aVar.getClass();
                if (aVar instanceof mn2.a.C2276a) {
                    return q03.r.f(new com.garmin.device.nfc.h[0]);
                }
                if (aVar instanceof mn2.a.b) {
                    ij0.a.f93807a.getClass();
                    return q03.r.f(ij0.a.f93808b);
                }
                if (!(aVar instanceof mn2.a.c)) {
                    lc.u0.r();
                    return null;
                }
                mn2.o oVar = r0Var.f165634c;
                w wVar = r0Var.f165632a;
                long j8 = wVar.f165682c;
                int productNumber = wVar.f165681b.getProductNumber();
                mn2.a.c cVar = (mn2.a.c) aVar;
                int i17 = cVar.f119778a;
                int i18 = cVar.f119779b;
                pn2.a.f138690a.getClass();
                return mn2.t.a(oVar, j8, productNumber, i17, i18, pn2.a.f());
            case 2:
                w.f fVar = (w.f) obj;
                Logger logger3 = r0.f165631n;
                fVar.getClass();
                f fVar2 = f.f165551a;
                byte[] bArr = fVar.f165719a;
                bArr.getClass();
                fVar2.getClass();
                String strA = f.a(bArr);
                Byte b14 = fVar.f165725g;
                b14.getClass();
                String strA2 = f.a(new byte[]{b14.byteValue()});
                byte[] bArr2 = fVar.f165720b;
                bArr2.getClass();
                String strA3 = f.a(bArr2);
                List<w.a> list = fVar.f165722d;
                list.getClass();
                ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                for (w.a aVar2 : list) {
                    int iB = aVar2.f165683a.b();
                    f fVar3 = f.f165551a;
                    byte[] bArr3 = aVar2.f165684b;
                    fVar3.getClass();
                    arrayList.add(new qn2.a(iB, f.a(bArr3), f.a(aVar2.f165685c), f.a(aVar2.f165686d), f.a(aVar2.f165687e)));
                }
                List<w.e> list2 = fVar.f165724f;
                list2.getClass();
                ArrayList arrayList2 = new ArrayList(p13.y.r(list2, 10));
                for (w.e eVar : list2) {
                    int f165718f = eVar.f165704a.getF165718f();
                    f fVar4 = f.f165551a;
                    byte[] bArr4 = eVar.f165705b;
                    fVar4.getClass();
                    arrayList2.add(new qn2.x(f165718f, f.a(bArr4), f.a(eVar.f165706c)));
                }
                f fVar5 = f.f165551a;
                byte[] bArr5 = fVar.f165723e;
                bArr5.getClass();
                fVar5.getClass();
                String strA4 = f.a(bArr5);
                String strB = qn2.u.f145900a.b();
                r0 r0Var2 = this.f165577b;
                pn2.n nVar = r0Var2.f165637f;
                nVar.getClass();
                qn2.t tVarB = nVar.b(strB, strA2, null);
                pn2.o oVar2 = r0Var2.f165638g;
                ArrayList arrayList3 = new ArrayList(arrayList);
                ArrayList arrayList4 = new ArrayList(arrayList2);
                oVar2.getClass();
                pn2.a.f138690a.getClass();
                pn2.m<qn2.t, qn2.c> mVar = new pn2.m<>(tVarB, new qn2.c(new qn2.w(pn2.a.d().f138742b, pn2.a.d().f138744d, strA), new qn2.l(pn2.a.d().f138743c, pn2.a.d().f138745e, "0000000000000000000000"), arrayList3, strA3, arrayList4));
                mn2.b bVar = r0Var2.f165633b;
                String strValueOf = String.valueOf(r0Var2.f165632a.f165682c);
                Logger logger4 = mn2.j.f119822a;
                bVar.getClass();
                strValueOf.getClass();
                q03.r<c83.a0<pn2.p<rn2.e>>> rVarM = bVar.m(strValueOf, strA, mVar);
                mn2.e eVar2 = new mn2.e(new mn2.f(bVar, strValueOf, strA, mVar, 1), 5);
                rVarM.getClass();
                int i19 = w03.b.f181178a;
                return new e13.r(new e13.j(new e13.j(rVarM, eVar2), new p0(new jv0.c(r0Var2, strA4, strB, strA, strA2, 29), 2)), new p0(new n0(r0Var2, 4), 3));
            case 3:
                w.f fVar6 = (w.f) obj;
                Logger logger5 = r0.f165631n;
                fVar6.getClass();
                f fVar7 = f.f165551a;
                byte[] bArr6 = fVar6.f165719a;
                bArr6.getClass();
                fVar7.getClass();
                String strA5 = f.a(bArr6);
                Byte b15 = fVar6.f165725g;
                b15.getClass();
                String strA6 = f.a(new byte[]{b15.byteValue()});
                pn2.n nVar2 = r0Var.f165637f;
                nVar2.getClass();
                qn2.t tVarB2 = nVar2.b(qn2.u.f145900a.b(), strA6, null);
                pn2.o oVar3 = r0Var.f165638g;
                ArrayList arrayList5 = new ArrayList();
                oVar3.getClass();
                Locale locale = h7.e.a(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getResources().getConfiguration()).f82328a.get(0);
                if (locale == null || (iSO3Language = locale.getISO3Language()) == null) {
                    iSO3Language = Locale.getDefault().getISO3Language();
                }
                pn2.a.f138690a.getClass();
                qn2.h hVar = new qn2.h(new qn2.w(pn2.a.d().f138742b, pn2.a.d().f138744d, strA5), arrayList5);
                iSO3Language.getClass();
                pn2.m<qn2.t, qn2.i> mVar2 = new pn2.m<>(tVarB2, new qn2.i(hVar, new qn2.g(iSO3Language), new qn2.g(iSO3Language)));
                mn2.b bVar2 = r0Var.f165633b;
                String strValueOf2 = String.valueOf(r0Var.f165632a.f165682c);
                Logger logger6 = mn2.j.f119822a;
                bVar2.getClass();
                strValueOf2.getClass();
                q03.r<c83.a0<pn2.p<rn2.j>>> rVarC = bVar2.c(strValueOf2, strA5, mVar2);
                mn2.e eVar3 = new mn2.e(new mn2.f(bVar2, strValueOf2, strA5, mVar2, 0), 3);
                rVarC.getClass();
                int i24 = w03.b.f181178a;
                return new e13.r(new e13.o(new e13.j(rVarC, eVar3), new k0(new n0(0), 26)), new k0(new n0(r0Var, 1), 27));
            case 4:
                Throwable th3 = (Throwable) obj;
                Logger logger7 = r0.f165631n;
                th3.getClass();
                r0Var.getClass();
                return r0.r("endDeleteCard()", th3);
            default:
                Throwable th4 = (Throwable) obj;
                Logger logger8 = r0.f165631n;
                th4.getClass();
                r0Var.getClass();
                return r0.r("endDeleteCard()", th4);
        }
    }
}
