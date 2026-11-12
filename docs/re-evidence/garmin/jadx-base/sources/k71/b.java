package k71;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import f02.e0;
import f72.id;
import h4.r;
import ht.s;
import i71.w;
import i71.y;
import java.util.ArrayList;
import java.util.List;
import n23.j;
import o4.d0;
import o70.t;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p13.h0;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import yz1.z;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:102:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:82:0x017a  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a3  */
    public static final void a(r rVar, w wVar, final p<? super Context, ? super Boolean, Unit> pVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        i53.c cVarB;
        long jH;
        final int i16;
        final int i17;
        rVar.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(-1817420933);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(wVar) : o0VarE.r(wVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(pVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            final Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            com.garmin.android.apps.connectmobile.performance.model.b bVar = wVar != null ? wVar.f92007b : com.garmin.android.apps.connectmobile.performance.model.b.NO_DATA;
            i53.c<y> cVar = wVar != null ? wVar.f92009d : null;
            if (cVar == null) {
                o0VarE.C(-428935945);
                o0VarE.g0(false);
                cVarB = null;
            } else {
                o0VarE.C(1510184010);
                cVarB = b(cVar, o0VarE);
                o0VarE.g0(false);
            }
            DateTime dateTimeK = j0.K(wVar != null ? wVar.f92008c : null, "yyyy-MM-dd");
            String strB = dateTimeK != null ? j0.b(dateTimeK, "MMM d", null) : null;
            String strB2 = dateTimeK != null ? j0.b(dateTimeK, "MMMM d", null) : null;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_training_status);
            String strQ2 = gl1.y.Q(o0VarE, R.string.no_data_label);
            o0VarE.C(1510201879);
            List listK = ((wVar != null ? wVar.f92007b : null) == null || strB2 == null) ? null : x.k(gl1.y.Q(o0VarE, bVar.f39938e), gl1.y.P(R.string.lbl_updated_date, new Object[]{strB2}, o0VarE));
            o0VarE.g0(false);
            if (listK != null) {
                strQ2 = h0.k0(listK, ". ", null, null, null, 62);
            }
            yz1.d dVar = wVar != null ? wVar.f92006a : null;
            s62.a.f157643a.getClass();
            u4.d dVarA = id.a(t62.c.f162799a);
            d0 d0VarE = t.K0.e(null, o0VarE, 1);
            if (d0VarE == null) {
                o0VarE.C(1510219266);
                jH = fb1.c.h(d92.b.f58623a, o0VarE, false);
            } else {
                o0VarE.C(1510217158);
                o0VarE.g0(false);
                jH = d0VarE.f128833a;
            }
            d0 d0VarA = d0.a(jH);
            z3.e eVarC = f.c(237427671, new jj2.c(strQ2, wVar, strB, bVar), o0VarE);
            z3.e eVarC2 = f.c(-247517578, new b82.p(cVarB, 10), o0VarE);
            int i18 = i15 & 896;
            boolean zR = o0VarE.r(context) | (i18 == 256);
            Object objQ = o0VarE.q();
            m.a aVar = m.f135153a;
            if (zR) {
                i16 = 0;
                objQ = new e23.a() { // from class: k71.a
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                s sVar = s.f85508a;
                                lt.e.k kVar = new lt.e.k(lt.e.a.TappedTop, t.K0);
                                sVar.getClass();
                                s.a(kVar);
                                pVar.invoke(context, Boolean.FALSE);
                                break;
                            case 1:
                                s sVar2 = s.f85508a;
                                lt.e.k kVar2 = new lt.e.k(lt.e.a.TappedBottom, t.K0);
                                sVar2.getClass();
                                s.a(kVar2);
                                pVar.invoke(context, Boolean.TRUE);
                                break;
                            default:
                                s sVar3 = s.f85508a;
                                lt.e.k kVar3 = new lt.e.k(lt.e.a.TappedTop, t.K0);
                                sVar3.getClass();
                                s.a(kVar3);
                                pVar.invoke(context, Boolean.FALSE);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    i16 = 0;
                    objQ = new e23.a() { // from class: k71.a
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i16) {
                                case 0:
                                    s sVar = s.f85508a;
                                    lt.e.k kVar = new lt.e.k(lt.e.a.TappedTop, t.K0);
                                    sVar.getClass();
                                    s.a(kVar);
                                    pVar.invoke(context, Boolean.FALSE);
                                    break;
                                case 1:
                                    s sVar2 = s.f85508a;
                                    lt.e.k kVar2 = new lt.e.k(lt.e.a.TappedBottom, t.K0);
                                    sVar2.getClass();
                                    s.a(kVar2);
                                    pVar.invoke(context, Boolean.TRUE);
                                    break;
                                default:
                                    s sVar3 = s.f85508a;
                                    lt.e.k kVar3 = new lt.e.k(lt.e.a.TappedTop, t.K0);
                                    sVar3.getClass();
                                    s.a(kVar3);
                                    pVar.invoke(context, Boolean.FALSE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ);
                } else {
                    i16 = 0;
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            int i19 = (i18 == 256 ? 1 : i16) | (o0VarE.r(context) ? 1 : 0);
            Object objQ2 = o0VarE.q();
            if (i19 == 0) {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    i17 = 1;
                    objQ2 = new e23.a() { // from class: k71.a
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i17) {
                                case 0:
                                    s sVar = s.f85508a;
                                    lt.e.k kVar = new lt.e.k(lt.e.a.TappedTop, t.K0);
                                    sVar.getClass();
                                    s.a(kVar);
                                    pVar.invoke(context, Boolean.FALSE);
                                    break;
                                case 1:
                                    s sVar2 = s.f85508a;
                                    lt.e.k kVar2 = new lt.e.k(lt.e.a.TappedBottom, t.K0);
                                    sVar2.getClass();
                                    s.a(kVar2);
                                    pVar.invoke(context, Boolean.TRUE);
                                    break;
                                default:
                                    s sVar3 = s.f85508a;
                                    lt.e.k kVar3 = new lt.e.k(lt.e.a.TappedTop, t.K0);
                                    sVar3.getClass();
                                    s.a(kVar3);
                                    pVar.invoke(context, Boolean.FALSE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ2);
                } else {
                    i17 = 1;
                }
            } else {
                i17 = 1;
                objQ2 = new e23.a() { // from class: k71.a
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i17) {
                            case 0:
                                s sVar = s.f85508a;
                                lt.e.k kVar = new lt.e.k(lt.e.a.TappedTop, t.K0);
                                sVar.getClass();
                                s.a(kVar);
                                pVar.invoke(context, Boolean.FALSE);
                                break;
                            case 1:
                                s sVar2 = s.f85508a;
                                lt.e.k kVar2 = new lt.e.k(lt.e.a.TappedBottom, t.K0);
                                sVar2.getClass();
                                s.a(kVar2);
                                pVar.invoke(context, Boolean.TRUE);
                                break;
                            default:
                                s sVar3 = s.f85508a;
                                lt.e.k kVar3 = new lt.e.k(lt.e.a.TappedTop, t.K0);
                                sVar3.getClass();
                                s.a(kVar3);
                                pVar.invoke(context, Boolean.FALSE);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ2);
            }
            e23.a aVar3 = (e23.a) objQ2;
            if (i18 != 256) {
                i17 = i16;
            }
            int i24 = (o0VarE.r(context) ? 1 : 0) | i17;
            Object objQ3 = o0VarE.q();
            if (i24 == 0) {
                aVar.getClass();
                if (objQ3 == m.a.f135155b) {
                    final int i25 = 2;
                    objQ3 = new e23.a() { // from class: k71.a
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i25) {
                                case 0:
                                    s sVar = s.f85508a;
                                    lt.e.k kVar = new lt.e.k(lt.e.a.TappedTop, t.K0);
                                    sVar.getClass();
                                    s.a(kVar);
                                    pVar.invoke(context, Boolean.FALSE);
                                    break;
                                case 1:
                                    s sVar2 = s.f85508a;
                                    lt.e.k kVar2 = new lt.e.k(lt.e.a.TappedBottom, t.K0);
                                    sVar2.getClass();
                                    s.a(kVar2);
                                    pVar.invoke(context, Boolean.TRUE);
                                    break;
                                default:
                                    s sVar3 = s.f85508a;
                                    lt.e.k kVar3 = new lt.e.k(lt.e.a.TappedTop, t.K0);
                                    sVar3.getClass();
                                    s.a(kVar3);
                                    pVar.invoke(context, Boolean.FALSE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ3);
                }
            } else {
                final int i26 = 2;
                objQ3 = new e23.a() { // from class: k71.a
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i26) {
                            case 0:
                                s sVar = s.f85508a;
                                lt.e.k kVar = new lt.e.k(lt.e.a.TappedTop, t.K0);
                                sVar.getClass();
                                s.a(kVar);
                                pVar.invoke(context, Boolean.FALSE);
                                break;
                            case 1:
                                s sVar2 = s.f85508a;
                                lt.e.k kVar2 = new lt.e.k(lt.e.a.TappedBottom, t.K0);
                                sVar2.getClass();
                                s.a(kVar2);
                                pVar.invoke(context, Boolean.TRUE);
                                break;
                            default:
                                s sVar3 = s.f85508a;
                                lt.e.k kVar3 = new lt.e.k(lt.e.a.TappedTop, t.K0);
                                sVar3.getClass();
                                s.a(kVar3);
                                pVar.invoke(context, Boolean.FALSE);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ3);
            }
            e23.a aVar4 = (e23.a) objQ3;
            z zVar = (wVar != null && wVar.f92010e) ? z.VALID_DATA : z.EMPTY;
            o0Var = o0VarE;
            yz1.y.d(rVar, dVar, strQ, null, dVarA, d0VarA, 0.0f, 0, null, 0.0f, null, null, false, 0L, null, eVarC, eVarC2, aVar2, aVar3, aVar4, zVar, gl1.y.Q(o0VarE, R.string.training_status_card_no_data_state_message), null, null, o0Var, i15 & 14, 1769472, 0, 12615624);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h82.p(rVar, wVar, pVar, i14, 27);
        }
    }

    public static final i53.c b(i53.c cVar, m mVar) {
        long j8;
        x1 x1Var = n.f135158a;
        mVar.C(487106882);
        ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
        int i14 = 0;
        for (Object obj : cVar) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            y yVar = (y) obj;
            m92.h0.e.a aVar = new m92.h0.e.a(i14, 100.0f);
            com.garmin.android.apps.connectmobile.performance.model.b.a aVar2 = com.garmin.android.apps.connectmobile.performance.model.b.f39921h;
            com.garmin.android.apps.connectmobile.performance.model.b bVar = yVar.f92027b;
            aVar2.getClass();
            x1 x1Var2 = n.f135158a;
            switch (com.garmin.android.apps.connectmobile.performance.model.b.a.C0735a.f39941a[bVar.ordinal()]) {
                case 1:
                    mVar.C(1959405419);
                    e0.f67731a.getClass();
                    gl.c.f77766a.getClass();
                    j8 = gl.c.a(mVar).j();
                    mVar.f();
                    break;
                case 2:
                    mVar.C(1959407566);
                    e0.f67731a.getClass();
                    gl.c.f77766a.getClass();
                    j8 = gl.c.a(mVar).d();
                    mVar.f();
                    break;
                case 3:
                    mVar.C(1959409839);
                    e0.f67731a.getClass();
                    gl.c.f77766a.getClass();
                    j8 = gl.c.a(mVar).r();
                    mVar.f();
                    break;
                case 4:
                    mVar.C(1959412044);
                    e0.f67731a.getClass();
                    gl.c.f77766a.getClass();
                    j8 = gl.c.a(mVar).b();
                    mVar.f();
                    break;
                case 5:
                    mVar.C(1959414288);
                    e0.f67731a.getClass();
                    gl.c.f77766a.getClass();
                    j8 = gl.c.a(mVar).h();
                    mVar.f();
                    break;
                case 6:
                    mVar.C(1959416590);
                    e0.f67731a.getClass();
                    gl.c.f77766a.getClass();
                    j8 = gl.c.a(mVar).g();
                    mVar.f();
                    break;
                case 7:
                    mVar.C(1959418896);
                    e0.f67731a.getClass();
                    gl.c.f77766a.getClass();
                    j8 = gl.c.a(mVar).l();
                    mVar.f();
                    break;
                case 8:
                    mVar.C(1959421034);
                    e0.f67731a.getClass();
                    j8 = e0.a(mVar);
                    mVar.f();
                    break;
                case 9:
                    mVar.C(1959423084);
                    e0.f67731a.getClass();
                    gl.c.f77766a.getClass();
                    j8 = gl.c.a(mVar).p();
                    mVar.f();
                    break;
                case 10:
                    mVar.C(1959425162);
                    mVar.f();
                    e0.f67731a.getClass();
                    gl.c.f77766a.getClass();
                    j8 = gl.c.f77767b.f77787j;
                    break;
                case 11:
                    mVar.C(1959427178);
                    mVar.f();
                    e0.f67731a.getClass();
                    gl.c.f77766a.getClass();
                    j8 = gl.c.f77767b.f77787j;
                    break;
                default:
                    throw j.m(mVar, 1959404097);
            }
            arrayList.add(new m92.h0.e.c(aVar, j8, Float.valueOf(yVar.f92026a), null));
            i14 = i15;
        }
        mVar.f();
        i53.c cVarE = i53.a.e(arrayList);
        x1 x1Var3 = n.f135158a;
        return cVarE;
    }
}
