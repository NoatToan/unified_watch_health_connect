package tb0;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import b82.u0;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f163628a;

        static {
            int[] iArr = new int[d90.j.values().length];
            try {
                iArr[d90.j.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d90.j.LOTTIE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f163628a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v16, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r2v17, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r2v25, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    public static final void a(d90.h hVar, q90.c cVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.l<? super Float, Unit> lVar, e23.a<Unit> aVar3, p3.m mVar, int i14, int i15) {
        e23.a<Unit> aVar4;
        int i16;
        e23.a<Unit> aVar5;
        ?? r14;
        Object cVar2;
        ?? r15;
        String str;
        e23.a<Unit> aVar6;
        ?? r16;
        String str2;
        o90.a aVar7;
        d90.h hVar2 = hVar;
        cVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        ?? E = mVar.E(1632035283);
        int i17 = (E.B(hVar2) ? 4 : 2) | i14 | (E.r(cVar) ? 32 : 16) | (E.r(aVar) ? 256 : 128);
        if ((i14 & 3072) == 0) {
            i17 |= E.r(aVar2) ? 2048 : 1024;
        }
        int i18 = i17 | (E.r(lVar) ? 16384 : 8192);
        int i19 = i15 & 32;
        if (i19 != 0) {
            i16 = i18 | 196608;
            aVar4 = aVar3;
        } else {
            aVar4 = aVar3;
            i16 = i18 | (E.r(aVar4) ? 131072 : 65536);
        }
        int i24 = i16;
        if (E.n(i24 & 1, (74899 & i24) != 74898)) {
            e23.a<Unit> aVar8 = i19 != 0 ? null : aVar4;
            x1 x1Var = p3.n.f135158a;
            long j8 = cVar.f143493a;
            l90.b bVar = cVar.f143495c;
            String str3 = bVar.f111522g;
            String str4 = bVar.f111521f;
            String str5 = bVar.f111516a;
            o90.a aVar9 = bVar.f111526k;
            int i25 = a.f163628a[hVar2.f58467a.ordinal()];
            p3.m.a aVar10 = p3.m.f135153a;
            if (i25 == 1) {
                e23.a<Unit> aVar11 = aVar8;
                E.C(933968044);
                boolean zL = E.l(j8) | E.B(str3) | E.B(str4) | E.B(str5) | ((i24 & 14) == 4);
                Object objQ = E.q();
                if (zL) {
                    r15 = 0;
                    cVar2 = new c42.c(j8, str3, str4, str5, hVar2);
                    str = str4;
                    hVar2 = hVar2;
                    E.K(cVar2);
                } else {
                    aVar10.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        r15 = 0;
                        cVar2 = new c42.c(j8, str3, str4, str5, hVar2);
                        str = str4;
                        hVar2 = hVar2;
                        E.K(cVar2);
                    } else {
                        str = str4;
                        cVar2 = objQ;
                        r15 = 0;
                    }
                }
                e23.a aVar12 = (e23.a) cVar2;
                E.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(E);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(n.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(E, r15), aVar12);
                E.g0(r15);
                c.b((n) u1VarResolveViewModel, str, aVar9, hVar2.f58469c, aVar, aVar2, lVar, aVar11, E, (i24 << 6) & 33546240, 0);
                aVar6 = aVar11;
                ?? r17 = E;
                r17.g0(r15);
                r16 = r17;
            } else {
                if (i25 != 2) {
                    throw kg.f.h(E, 722863457, false);
                }
                E.C(934699303);
                StringQualifier stringQualifierNamed = QualifierKt.named("GestureTutorial");
                boolean zB = E.B(str3) | E.B(str4) | E.B(str5) | E.r(aVar9);
                Object objQ2 = E.q();
                if (zB) {
                    str2 = str4;
                    objQ2 = new ok0.d(str3, str2, str5, aVar9, 25);
                    aVar7 = aVar9;
                    E.K(objQ2);
                } else {
                    aVar10.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        str2 = str4;
                        objQ2 = new ok0.d(str3, str2, str5, aVar9, 25);
                        aVar7 = aVar9;
                        E.K(objQ2);
                    } else {
                        aVar7 = aVar9;
                        str2 = str4;
                    }
                }
                e23.a aVar13 = (e23.a) objQ2;
                E.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(E);
                if (viewModelStoreOwnerA2 == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(s0.f105811a.b(q.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), stringQualifierNamed, KoinApplicationKt.currentKoinScope(E, 0), aVar13);
                E.g0(false);
                q qVar = (q) u1VarResolveViewModel2;
                int i26 = i24 << 3;
                aVar6 = aVar8;
                e.a(qVar, str2, aVar7, aVar, aVar, lVar, aVar6, E, (i26 & 7168) | (57344 & (i24 << 6)) | (458752 & i26) | (i26 & 3670016), 0);
                E.g0(false);
                r16 = E;
            }
            aVar5 = aVar6;
            r14 = r16;
        } else {
            ?? r18 = E;
            r18.e();
            aVar5 = aVar4;
            r14 = r18;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u0(hVar2, cVar, aVar, aVar2, lVar, aVar5, i14, i15, 13);
        }
    }
}
