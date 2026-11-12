package gq1;

import android.content.Context;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import f72.s9;
import fq1.c;
import fq1.g;
import fq1.h;
import fq1.k;
import fq1.l;
import fq1.n;
import fq1.r;
import gl1.y;
import go1.j;
import gs.t;
import gv0.j0;
import gw0.g0;
import i3.i7;
import k23.d;
import m20.a0;
import m20.z;
import nr.p0;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.w;
import p13.x;
import p3.m;
import p3.x1;
import pu0.i;
import re0.o;
import v62.m9;
import zd0.e;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78506a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f78506a;
        m.a aVar = m.f135153a;
        f12.b bVar = null;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                b bVar2 = b.f78507a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new l(bVar, i16, null == true ? 1 : 0);
            case 1:
                b bVar3 = b.f78507a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new fq1.m();
            case 2:
                Scope scope = (Scope) obj;
                b bVar4 = b.f78507a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                Context contextAndroidContext = ModuleExtKt.androidContext(scope);
                t0 t0Var = s0.f105811a;
                return new n(contextAndroidContext, (pu.a) scope.get((d<?>) t0Var.b(pu.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope.get((d<?>) t0Var.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (vf1.a) scope.get((d<?>) t0Var.b(vf1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 3:
                b bVar5 = b.f78507a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new c();
            case 4:
                b bVar6 = b.f78507a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new r();
            case 5:
                Scope scope2 = (Scope) obj;
                b bVar7 = b.f78507a;
                scope2.getClass();
                ((ParametersHolder) obj2).getClass();
                return new g((f12.b) scope2.get((d<?>) s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 6:
                b bVar8 = b.f78507a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new fq1.a();
            case 7:
                b bVar9 = b.f78507a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new fq1.p();
            case 8:
                b bVar10 = b.f78507a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new fq1.d();
            case 9:
                Scope scope3 = (Scope) obj;
                b bVar11 = b.f78507a;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                return new h((f12.b) scope3.get((d<?>) s0.f105811a.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 10:
                b bVar12 = b.f78507a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new k();
            case 11:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                gs.d dVar = gs.d.f78592a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    for (p0 p0Var : ds.a.f60867a) {
                        if (p0Var.f127286e.equals(p0.a.C2447a.f127287a)) {
                            Object objQ = mVar.q();
                            aVar.getClass();
                            m.a.C2565a c2565a = m.a.f135155b;
                            if (objQ == c2565a) {
                                objQ = new j(i15);
                                mVar.K(objQ);
                            }
                            e23.a aVar2 = (e23.a) objQ;
                            Object objQ2 = mVar.q();
                            if (objQ2 == c2565a) {
                                objQ2 = new j(3);
                                mVar.K(objQ2);
                            }
                            t.a(null, p0Var, false, 1.0f, null, aVar2, (e23.a) objQ2, mVar, 1772928, 17);
                            x1 x1Var2 = p3.n.f135158a;
                        }
                    }
                    n23.j.s("Collection contains no element matching the predicate.");
                    return null;
                }
                mVar.e();
                return Unit.INSTANCE;
            case 12:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                gt1.a aVar3 = gt1.a.f78938a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    i7.a(n5.c.a(R.drawable.close_circle, mVar2, 0), y.Q(mVar2, R.string.lbl_close), null, com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar2), mVar2, 0, 4);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 13:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                gv0.a aVar4 = gv0.a.f79152a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = s9.a(t62.c.f162799a);
                    h4.r.a aVar5 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarQ = x2.q(aVar5, j92.b.f97901d.f97905d);
                    gl.c.f77766a.getClass();
                    i7.b(dVarA, null, rVarQ, gl.c.f77767b.P, mVar3, 48, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 14:
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                gv0.a aVar6 = gv0.a.f79152a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = s9.a(t62.c.f162799a);
                    h4.r.a aVar7 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarQ2 = x2.q(aVar7, j92.b.f97901d.f97905d);
                    gl.c.f77766a.getClass();
                    i7.b(dVarA2, null, rVarQ2, gl.c.f77767b.P, mVar4, 48, 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 15:
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                gv0.a aVar8 = gv0.a.f79152a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    gv0.y yVar = gv0.y.Both;
                    hl.a.c cVar = hl.a.c.f84256b;
                    pu0.b bVar13 = new pu0.b("123", "TestFirst", "TestLast", null, false, pu0.d.a.f141212a, null, null, w.c(new i(123L, "122457842123", null, null, null, 0, null, null, null, null, null, null, null, null, null, null, 65532, null)), null, null, null, null, null, null, null, 65240, null);
                    Object objQ3 = mVar5.q();
                    aVar.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new a(false ? (byte) 1 : (byte) 0, 18);
                        mVar5.K(objQ3);
                    }
                    j0.b(yVar, bVar13, cVar, (p) objQ3, mVar5, (hl.a.c.f84257c << 6) | 3078);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 16:
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                gv0.a aVar9 = gv0.a.f79152a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    gv0.y yVar2 = gv0.y.Sender;
                    hl.a.c cVar2 = hl.a.c.f84256b;
                    pu0.b bVar14 = new pu0.b("123", "TestFirst", "TestLast", null, false, pu0.d.a.f141212a, null, null, w.c(new i(123L, "122457842123", null, null, null, 0, null, null, null, null, null, null, null, null, null, null, 65532, null)), null, null, null, null, null, null, null, 65240, null);
                    Object objQ4 = mVar6.q();
                    aVar.getClass();
                    if (objQ4 == m.a.f135155b) {
                        objQ4 = new a(false ? (byte) 1 : (byte) 0, 20);
                        mVar6.K(objQ4);
                    }
                    j0.b(yVar2, bVar14, cVar2, (p) objQ4, mVar6, (hl.a.c.f84257c << 6) | 3078);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 17:
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                gv0.a aVar10 = gv0.a.f79152a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    gv0.y yVar3 = gv0.y.Receiver;
                    hl.a.c cVar3 = hl.a.c.f84256b;
                    pu0.b bVar15 = new pu0.b("123", "TestFirst", "TestLast", null, false, pu0.d.a.f141212a, null, null, w.c(new i(123L, "122457842123", null, null, null, 0, null, null, null, null, null, null, null, null, null, null, 65532, null)), null, null, null, null, null, null, null, 65240, null);
                    Object objQ5 = mVar7.q();
                    aVar.getClass();
                    if (objQ5 == m.a.f135155b) {
                        objQ5 = new a(false ? (byte) 1 : (byte) 0, 19);
                        mVar7.K(objQ5);
                    }
                    j0.b(yVar3, bVar15, cVar3, (p) objQ5, mVar7, (hl.a.c.f84257c << 6) | 3078);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 18:
                gv0.a aVar11 = gv0.a.f79152a;
                ((gv0.y) obj2).getClass();
                return Unit.INSTANCE;
            case 19:
                gv0.a aVar12 = gv0.a.f79152a;
                ((gv0.y) obj2).getClass();
                return Unit.INSTANCE;
            case 20:
                gv0.a aVar13 = gv0.a.f79152a;
                ((gv0.y) obj2).getClass();
                return Unit.INSTANCE;
            case 21:
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                gv0.b bVar16 = gv0.b.f79166a;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    e.c(0.0f, 0, 15, 0L, null, mVar8);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 22:
                return ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).w((t13.d) obj2);
            case 23:
                ((Integer) obj2).getClass();
                g0.d((m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 24:
                m mVar9 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                h10.a aVar14 = h10.a.f80739a;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    h4.r.a aVar15 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarX = x2.x(aVar15, h4.d.a.f81533k, 2);
                    s62.a.f157643a.getClass();
                    b82.n.c(m9.a(t62.b.f162798a), y.Q(mVar9, R.string.lbl_groups_not_supported), y.Q(mVar9, R.string.msg_groups_not_supported), rVarX, null, mVar9, 3072, 16);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 25:
                m mVar10 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                h10.a aVar16 = h10.a.f80739a;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, h10.a.f80740b, mVar10, 196608, 31);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 26:
                h2.b bVar17 = (h2.b) obj2;
                h2.b.a aVar17 = h2.b.M;
                return x.k(Integer.valueOf(bVar17.l()), Float.valueOf(j23.t.d(bVar17.m(), -0.5f, 0.5f)), Integer.valueOf(bVar17.o()));
            case 27:
                Scope scope4 = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                h20.b bVar18 = h20.b.f81029a;
                scope4.getClass();
                parametersHolder.getClass();
                hl.a aVar18 = (hl.a) parametersHolder.get(0);
                if (aVar18 == null) {
                    aVar18 = hl.a.c.f84256b;
                }
                t0 t0Var2 = s0.f105811a;
                return new com.garmin.android.apps.connectmobile.contacts.d((z) scope4.get((d<?>) t0Var2.b(z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (o) scope4.get((d<?>) t0Var2.b(o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), aVar18);
            case 28:
                Scope scope5 = (Scope) obj;
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                h20.b bVar19 = h20.b.f81029a;
                scope5.getClass();
                parametersHolder2.getClass();
                hl.a aVar19 = (hl.a) parametersHolder2.get(0);
                if (aVar19 == null) {
                    aVar19 = hl.a.c.f84256b;
                }
                t0 t0Var3 = s0.f105811a;
                return new i20.t((z) scope5.get((d<?>) t0Var3.b(z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (o) scope5.get((d<?>) t0Var3.b(o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), aVar19);
            default:
                h20.b bVar20 = h20.b.f81029a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (m20.g) ez0.b.a(ez0.b.f67468a, ez0.c.GC, com.garmin.android.apps.connectmobile.contacts.b.e() ? a0.class : m20.g.class, new c83.h.a[0], null, null, null, 120);
        }
    }

    public /* synthetic */ a(byte b14, int i14) {
        this.f78506a = i14;
    }
}
