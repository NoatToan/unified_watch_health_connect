package y20;

import android.bluetooth.le.ScanResult;
import c2.x2;
import c30.e0;
import c30.n;
import c30.n0;
import c30.w;
import c30.z;
import com.garmin.android.apps.connectmobile.R;
import e2.i0;
import e23.p;
import gl1.y;
import i3.i7;
import i3.mh;
import i3.ve;
import o53.b0;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p008y1.y0;
import p3.l0;
import p3.m;
import p3.x1;
import r1.q2;
import s5.x0;
import v62.o1;
import v62.o7;
import ya0.d0;
import yg2.t;
import z20.r;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f194221a;

    public /* synthetic */ k(int i14) {
        this.f194221a = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f194221a;
        int i15 = 23;
        int i16 = 22;
        int i17 = 21;
        m.a aVar = m.f135153a;
        int i18 = 1;
        boolean z14 = false;
        switch (i14) {
            case 0:
                l lVar = l.f194222a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new z20.l();
            case 1:
                l lVar2 = l.f194222a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new w();
            case 2:
                l lVar3 = l.f194222a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new c30.f();
            case 3:
                l lVar4 = l.f194222a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new n0();
            case 4:
                Scope scope = (Scope) obj;
                l lVar5 = l.f194222a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var = s0.f105811a;
                return new c30.h((z) scope.get((k23.d<?>) t0Var.b(z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (e0) scope.get((k23.d<?>) t0Var.b(e0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z20.l) scope.get((k23.d<?>) t0Var.b(z20.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r) scope.get((k23.d<?>) t0Var.b(r.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c30.g) scope.get((k23.d<?>) t0Var.b(c30.g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 5:
                Scope scope2 = (Scope) obj;
                l lVar6 = l.f194222a;
                scope2.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var2 = s0.f105811a;
                return new n((e0) scope2.get((k23.d<?>) t0Var2.b(e0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z20.l) scope2.get((k23.d<?>) t0Var2.b(z20.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (r) scope2.get((k23.d<?>) t0Var2.b(r.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c30.g) scope2.get((k23.d<?>) t0Var2.b(c30.g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 6:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                y22.g gVar = y22.g.f194254a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = o1.a(t62.b.f162798a);
                    String strQ = y.Q(mVar, R.string.lbl_delete_photo);
                    long jB = ds.e0.b(d92.b.f58623a, mVar);
                    h4.r rVarE = u1.n.e(h4.r.S, d92.b.a(mVar).e().d(), k2.i.f102406a);
                    d92.b.f58625c.getClass();
                    i7.b(dVarA, strQ, c2.l.y(rVarE, j92.b.f97899b.f97917b), jB, mVar, 0, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 7:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                y22.g gVar2 = y22.g.f194254a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String strQ2 = y.Q(mVar2, R.string.lbl_add_photo);
                    j53.j jVarB = j53.l.b();
                    Object objQ = mVar2.q();
                    aVar.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new y0(14);
                        mVar2.K(objQ);
                    }
                    e23.l lVar7 = (e23.l) objQ;
                    Object objQ2 = mVar2.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new k(8);
                        mVar2.K(objQ2);
                    }
                    p pVar = (p) objQ2;
                    Object objQ3 = mVar2.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new y0(15);
                        mVar2.K(objQ3);
                    }
                    y22.d.a(strQ2, jVarB, 5, lVar7, pVar, (e23.l) objQ3, mVar2, 224688);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj).intValue();
                ((Integer) obj2).intValue();
                y22.g gVar3 = y22.g.f194254a;
                return Unit.INSTANCE;
            case 9:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                y22.h hVar = y22.h.f194256a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = o1.a(t62.b.f162798a);
                    String strQ3 = y.Q(mVar3, R.string.lbl_delete_photo);
                    long jB2 = ds.e0.b(d92.b.f58623a, mVar3);
                    h4.r rVarE2 = u1.n.e(h4.r.S, d92.b.a(mVar3).e().d(), k2.i.f102406a);
                    d92.b.f58625c.getClass();
                    i7.b(dVarA2, strQ3, c2.l.y(rVarE2, j92.b.f97899b.f97917b), jB2, mVar3, 0, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj).intValue();
                y22.w wVar = (y22.w) obj2;
                wVar.getClass();
                String str = wVar.f194325b;
                if (str != null) {
                    return str;
                }
                String string = wVar.f194324a.toString();
                string.getClass();
                return string;
            case 11:
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                y40.d dVar = y40.d.f194398a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    i7.a(n5.c.a(R.drawable.icon_back_arrow, mVar4, 0), y.Q(mVar4, R.string.common_button_back), null, 0L, mVar4, 0, 12);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 12:
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                y40.e eVar = y40.e.f194400a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    i7.a(n5.c.a(R.drawable.revert, mVar5, 0), y.Q(mVar5, R.string.common_undo), null, 0L, mVar5, 0, 12);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 13:
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                y40.e eVar2 = y40.e.f194400a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    i7.a(n5.c.a(R.drawable.courses_pin, mVar6, 0), y.Q(mVar6, R.string.lbl_add_new_point_to_course), null, 0L, mVar6, 0, 12);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 14:
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                y40.e eVar3 = y40.e.f194400a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    i7.a(n5.c.a(R.drawable.overflow, mVar7, 0), y.Q(mVar7, R.string.lbl_course_options_menu), null, 0L, mVar7, 0, 12);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 15:
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                y41.a aVar2 = y41.a.f194468a;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar3, j92.b.f97899b.f97922g), mVar8);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 16:
                int i19 = y80.f.f195116c;
                ((ek2.a) obj2).getClass();
                gm2.b bVar = gm2.b.f78015a;
                bVar.getClass();
                dk2.d.a aVar4 = dk2.d.f60235m;
                gm2.a aVar5 = new gm2.a(bVar);
                aVar4.getClass();
                return dk2.d.a.a((ScanResult) obj, aVar5);
            case 17:
                boolean z15 = false;
                m mVar9 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ya0.i iVar = ya0.i.f195444a;
                if ((iIntValue9 & 3) != 2) {
                    z15 = true;
                }
                if (mVar9.n(iIntValue9 & 1, z15)) {
                    x1 x1Var9 = p3.n.f135158a;
                    o90.a aVar6 = new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null);
                    Object objQ4 = mVar9.q();
                    aVar.getClass();
                    m.a.C2565a c2565a2 = m.a.f135155b;
                    if (objQ4 == c2565a2) {
                        objQ4 = new y0(i17);
                        mVar9.K(objQ4);
                    }
                    e23.l lVar8 = (e23.l) objQ4;
                    Object objQ5 = mVar9.q();
                    if (objQ5 == c2565a2) {
                        objQ5 = new y0(i16);
                        mVar9.K(objQ5);
                    }
                    d0.b("Venu 4", aVar6, lVar8, (e23.l) objQ5, mVar9, 3462);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 18:
                m mVar10 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                ya0.i iVar2 = ya0.i.f195444a;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    ve.a(x2.d(h4.r.S, 1.0f), null, tn.k.a(d92.b.f58623a, mVar10), 0L, 0.0f, 0.0f, null, ya0.i.f195446c, mVar10, 12582918, 122);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 19:
                m mVar11 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                ya0.k kVar = ya0.k.f195481a;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    o90.a aVar7 = new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null);
                    String strQ4 = y.Q(mVar11, R.string.lbl_next);
                    Object objQ6 = mVar11.q();
                    aVar.getClass();
                    m.a.C2565a c2565a3 = m.a.f135155b;
                    if (objQ6 == c2565a3) {
                        objQ6 = new ya0.j(z14 ? 1 : 0);
                        mVar11.K(objQ6);
                    }
                    e23.a aVar8 = (e23.a) objQ6;
                    Object objQ7 = mVar11.q();
                    if (objQ7 == c2565a3) {
                        objQ7 = new ya0.j(i18);
                        mVar11.K(objQ7);
                    }
                    e23.a aVar9 = (e23.a) objQ7;
                    Object objQ8 = mVar11.q();
                    if (objQ8 == c2565a3) {
                        objQ8 = new y0(i15);
                        mVar11.K(objQ8);
                    }
                    ya0.e0.b("Venu 4", aVar7, strQ4, aVar8, true, aVar9, false, (e23.l) objQ8, mVar11, 14380038);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 20:
                m mVar12 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                ya0.k kVar2 = ya0.k.f195481a;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    ve.a(x2.d(h4.r.S, 1.0f), null, tn.k.a(d92.b.f58623a, mVar12), 0L, 0.0f, 0.0f, null, ya0.k.f195483c, mVar12, 12582918, 122);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 21:
                Scope scope3 = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                ye0.a aVar10 = ye0.a.f196813a;
                scope3.getClass();
                parametersHolder.getClass();
                t0 t0Var3 = s0.f105811a;
                return new af0.h((we0.d) parametersHolder.elementAt(0, t0Var3.b(we0.d.class)), (ze0.b) scope3.get((k23.d<?>) t0Var3.b(ze0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope3.get((k23.d<?>) t0Var3.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (fj1.b) scope3.get((k23.d<?>) t0Var3.b(fj1.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 22:
                ye0.a aVar11 = ye0.a.f196813a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new ze0.a();
            case 23:
                Scope scope4 = (Scope) obj;
                ye0.a aVar12 = ye0.a.f196813a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                return new ze0.b((f12.l) scope4.get((k23.d<?>) s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 24:
                m mVar13 = (m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                yg2.b bVar2 = yg2.b.f196952a;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    i7.b(o7.a(t62.b.f162798a), null, null, fb1.c.g(d92.b.f58623a, mVar13), mVar13, 48, 4);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 25:
                m mVar14 = (m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                yg2.d dVar2 = yg2.d.f196958a;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    String strQ5 = y.Q(mVar14, R.string.start_now);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ5, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar14), mVar14, 0, 0, 131070);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 26:
                m mVar15 = (m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                yg2.d dVar3 = yg2.d.f196958a;
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    String strQ6 = y.Q(mVar15, R.string.lbl_skip_button);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ6, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar15), mVar15, 0, 0, 131070);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 27:
                m mVar16 = (m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                yg2.d dVar4 = yg2.d.f196958a;
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = p3.n.f135158a;
                    String strQ7 = y.Q(mVar16, R.string.add_to_workout);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ7, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar16), mVar16, 0, 0, 131070);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 28:
                m mVar17 = (m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                yg2.d dVar5 = yg2.d.f196958a;
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var17 = p3.n.f135158a;
                    String strQ8 = y.Q(mVar17, R.string.lbl_delete);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97931h, mVar17);
                    gl.c.f77766a.getClass();
                    mh.c(strQ8, null, gl.c.a(mVar17).l(), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar17, 0, 0, 131066);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar18 = (m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                yg2.d dVar6 = yg2.d.f196958a;
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var18 = p3.n.f135158a;
                    long jE = q2.e(d92.b.f58623a, mVar18);
                    nt2.e eVar4 = new nt2.e("Test Title", "Test Title");
                    i53.f fVarA = i53.a.a(new nt2.e("Test Subtitle", "Test Subtitle"));
                    i0 i0Var = new i0(0, 0);
                    Object objQ9 = mVar18.q();
                    aVar.getClass();
                    m.a.C2565a c2565a4 = m.a.f135155b;
                    if (objQ9 == c2565a4) {
                        objQ9 = l0.j(t13.h.f161748a, mVar18);
                        mVar18.K(objQ9);
                    }
                    b0 b0Var = (b0) objQ9;
                    Object objQ10 = mVar18.q();
                    if (objQ10 == c2565a4) {
                        objQ10 = new ya1.h(i17);
                        mVar18.K(objQ10);
                    }
                    e23.l lVar9 = (e23.l) objQ10;
                    Object objQ11 = mVar18.q();
                    if (objQ11 == c2565a4) {
                        objQ11 = new ya1.h(i16);
                        mVar18.K(objQ11);
                    }
                    e23.l lVar10 = (e23.l) objQ11;
                    Object objQ12 = mVar18.q();
                    if (objQ12 == c2565a4) {
                        objQ12 = new ya1.h(i15);
                        mVar18.K(objQ12);
                    }
                    e23.l lVar11 = (e23.l) objQ12;
                    Object objQ13 = mVar18.q();
                    if (objQ13 == c2565a4) {
                        objQ13 = new ya1.h(9);
                        mVar18.K(objQ13);
                    }
                    e23.l lVar12 = (e23.l) objQ13;
                    Object objQ14 = mVar18.q();
                    if (objQ14 == c2565a4) {
                        objQ14 = new ya1.h(10);
                        mVar18.K(objQ14);
                    }
                    t.a(jE, "Test Overline", eVar4, fVarA, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", null, false, false, false, 0, i0Var, b0Var, 0, lVar9, true, lVar10, lVar11, lVar12, (e23.l) objQ14, true, mVar18, 805306416, 920350080, 480);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
        }
    }
}
