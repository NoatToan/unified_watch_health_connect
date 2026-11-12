package io0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import gl1.y;
import h4.r;
import hl1.j;
import java.util.ArrayList;
import java.util.Iterator;
import o4.d0;
import o70.t;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import w2.a0;
import yz1.z;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:80:0x0277  */
    public static final void a(r rVar, go0.e.b bVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        String str;
        String str2;
        ArrayList arrayList;
        Long l14;
        i53.c<Float> cVar;
        int i16;
        Context context;
        String str3;
        String str4;
        long jL;
        String strP;
        String strP2;
        r rVar2 = rVar;
        i53.c<Float> cVar2 = bVar.f78202d;
        Long l15 = bVar.f78201c;
        o0 o0VarE = mVar.E(1733128193);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar2) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 32 : 16;
        }
        int i17 = i15;
        final int i18 = 1;
        final int i19 = 0;
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            final l22.a aVarS = a0.s(o0VarE);
            Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = y.Q(o0VarE, R.string.lbl_heart_rate_cap);
            String strQ2 = y.Q(o0VarE, R.string.lbl_resting_heart_rate);
            String strQ3 = y.Q(o0VarE, R.string.no_value);
            String strQ4 = y.Q(o0VarE, R.string.no_data_label);
            boolean zR = o0VarE.r(aVarS);
            Object objQ = o0VarE.q();
            m.a aVar = m.f135153a;
            if (zR) {
                objQ = new l() { // from class: io0.c
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        Long l16 = (Long) obj;
                        switch (i19) {
                            case 0:
                                return new w00.b(aVarS).d((int) l16.longValue(), false);
                            default:
                                return new w00.b(aVarS).d((int) l16.longValue(), true);
                        }
                    }
                };
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new l() { // from class: io0.c
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            Long l16 = (Long) obj;
                            switch (i19) {
                                case 0:
                                    return new w00.b(aVarS).d((int) l16.longValue(), false);
                                default:
                                    return new w00.b(aVarS).d((int) l16.longValue(), true);
                            }
                        }
                    };
                    o0VarE.K(objQ);
                }
            }
            l lVar = (l) objQ;
            boolean zR2 = o0VarE.r(aVarS);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new l() { // from class: io0.c
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        Long l16 = (Long) obj;
                        switch (i18) {
                            case 0:
                                return new w00.b(aVarS).d((int) l16.longValue(), false);
                            default:
                                return new w00.b(aVarS).d((int) l16.longValue(), true);
                        }
                    }
                };
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new l() { // from class: io0.c
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            Long l16 = (Long) obj;
                            switch (i18) {
                                case 0:
                                    return new w00.b(aVarS).d((int) l16.longValue(), false);
                                default:
                                    return new w00.b(aVarS).d((int) l16.longValue(), true);
                            }
                        }
                    };
                    o0VarE.K(objQ2);
                }
            }
            l lVar2 = (l) objQ2;
            Long l16 = bVar.f78200b;
            if (l16 == null || (str = (String) lVar.invoke(Long.valueOf(l16.longValue()))) == null) {
                str = strQ3;
            }
            if (l15 == null || (str2 = (String) lVar2.invoke(Long.valueOf(l15.longValue()))) == null) {
                str2 = strQ3;
            }
            if (cVar2 == null) {
                o0VarE.C(1821199809);
                o0VarE.g0(false);
                l14 = l15;
                cVar = cVar2;
                i16 = i17;
                context = context2;
                str3 = strQ;
                str4 = strQ4;
                arrayList = null;
            } else {
                o0VarE.C(1821199810);
                arrayList = new ArrayList(p13.y.r(cVar2, 10));
                Iterator<Float> it = cVar2.iterator();
                int i24 = 0;
                while (it.hasNext()) {
                    Float next = it.next();
                    int i25 = i24 + 1;
                    if (i24 < 0) {
                        x.q();
                        throw null;
                    }
                    Long l17 = l15;
                    float fFloatValue = next.floatValue();
                    i53.c<Float> cVar3 = cVar2;
                    x1 x1Var2 = n.f135158a;
                    gl.c.f77766a.getClass();
                    int i26 = i17;
                    String str5 = strQ;
                    String str6 = strQ4;
                    Iterator<Float> it3 = it;
                    Context context3 = context2;
                    d0 d0Var = (d0) h0.e0(i24, x.k(d0.a(gl.c.a(o0VarE).g()), d0.a(gl.c.a(o0VarE).c()), d0.a(gl.c.a(o0VarE).d()), d0.a(gl.c.a(o0VarE).h()), d0.a(gl.c.a(o0VarE).l())));
                    if (d0Var == null) {
                        o0VarE.C(-980728453);
                        jL = gl.c.a(o0VarE).l();
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-980730313);
                        o0VarE.g0(false);
                        jL = d0Var.f128833a;
                    }
                    arrayList.add(new z72.l(fFloatValue, jL, null));
                    cVar2 = cVar3;
                    i24 = i25;
                    l15 = l17;
                    i17 = i26;
                    strQ = str5;
                    strQ4 = str6;
                    it = it3;
                    context2 = context3;
                }
                l14 = l15;
                cVar = cVar2;
                i16 = i17;
                context = context2;
                str3 = strQ;
                str4 = strQ4;
                o0VarE.g0(false);
            }
            i53.c cVarE = arrayList != null ? i53.a.e(arrayList) : null;
            if (l14 != null) {
                oi0.b bVar2 = new oi0.b(aVarS, str2);
                bVar2.b();
                strP = oi0.c.P(x.k(strQ2, bVar2.f132238b));
            } else {
                strP = null;
            }
            if (s.g(str, strQ3)) {
                strP2 = strP == null ? str4 : strP;
            } else {
                oi0.b bVar3 = new oi0.b(aVarS, str);
                bVar3.b();
                String str7 = bVar3.f132238b;
                if (strP == null) {
                    strP = "";
                }
                strP2 = oi0.c.P(x.k(str7, strP));
            }
            yz1.d dVar = bVar.f78199a;
            t.a aVar2 = t.f130062f;
            t tVar = t.f130077v;
            String str8 = tVar.f130082a;
            aVar2.getClass();
            u4.d dVarC = t.a.c(str8);
            d0 d0VarE = tVar.e(null, o0VarE, 1);
            r.a aVar3 = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar4 = d92.b.f58625c;
            bVar4.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarA = c2.l.A(aVar3, 0.0f, eVar.f97920e, 1);
            bVar4.getClass();
            r rVarA2 = c2.l.A(aVar3, eVar.f97920e, 0.0f, 2);
            z3.e eVarC = f.c(-22045250, new j(strP2, str2, strQ2, cVarE, bVar, str, 6), o0VarE);
            Context context4 = context;
            boolean zR3 = o0VarE.r(context4);
            Object objQ3 = o0VarE.q();
            if (zR3) {
                objQ3 = new ho0.a(context4, 7);
                o0VarE.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new ho0.a(context4, 7);
                    o0VarE.K(objQ3);
                }
            }
            e23.a aVar4 = (e23.a) objQ3;
            z zVar = (cVar != null || bVar.f78204f) ? z.VALID_DATA : z.EMPTY;
            o0Var = o0VarE;
            rVar2 = rVar;
            yz1.y.c(rVar2, dVar, str3, null, dVarC, d0VarE, 0.0f, 0, null, 0.0f, null, rVarA, rVarA2, null, eVarC, aVar4, zVar, y.Q(o0VarE, R.string.heart_rate_no_data_state_message), null, null, o0Var, i16 & 14, 24576, 796616);
            x1 x1Var3 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.a(rVar2, bVar, i14, 3);
        }
    }
}
