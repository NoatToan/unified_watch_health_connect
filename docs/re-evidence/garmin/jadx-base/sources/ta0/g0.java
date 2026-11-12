package ta0;

import android.content.Context;
import android.net.Uri;
import android.text.format.DateFormat;
import android.widget.Toast;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import c2.c3;
import c2.k3;
import c2.n3;
import c2.p3;
import c2.q2;
import c2.q3;
import c2.s2;
import c2.u2;
import c2.x2;
import c22.l3;
import c22.o2;
import ca0.t1;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.google.firebase.perf.util.Constants;
import i3.i7;
import i3.mc;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.m3;
import l72.p2;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.d2;
import u1.a2;
import v62.m6;
import v62.w3;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f163327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f163328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f163329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f163330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f163331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f163332g;

    public /* synthetic */ g0(Context context, xy0.c cVar, e23.l lVar, p1 p1Var, p1 p1Var2, p1 p1Var3) {
        this.f163326a = 17;
        this.f163330e = context;
        this.f163327b = cVar;
        this.f163328c = lVar;
        this.f163331f = p1Var;
        this.f163332g = p1Var2;
        this.f163329d = p1Var3;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:25:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:31:0x010c  */
    /* JADX WARN: Code duplicated, block: B:35:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:37:0x01de  */
    /* JADX WARN: Code duplicated, block: B:38:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:40:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:42:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:44:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:50:0x023b  */
    /* JADX WARN: Code duplicated, block: B:51:0x023d  */
    /* JADX WARN: Code duplicated, block: B:56:0x026d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0283  */
    /* JADX WARN: Code duplicated, block: B:61:0x0293  */
    /* JADX WARN: Code duplicated, block: B:63:0x0297  */
    /* JADX WARN: Code duplicated, block: B:66:0x029e  */
    /* JADX WARN: Code duplicated, block: B:67:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:71:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:74:0x02b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:76:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:79:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:80:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:83:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:86:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:87:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:91:0x0323  */
    /* JADX WARN: Code duplicated, block: B:92:0x0368  */
    /* JADX WARN: Code duplicated, block: B:94:0x0377  */
    private final Object a(Object obj, Object obj2) {
        e23.a aVar;
        h5.g.a.f fVar;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        float f14;
        int i14;
        String strQ;
        Iterator<dy1.d> it;
        float f15;
        dy1.d next;
        boolean z14;
        Double d14;
        dy1.b bVar;
        dy1.b bVar2;
        dy1.b bVar3;
        Double d15;
        String str;
        String strB;
        boolean z15;
        mx1.a aVar2;
        int i15;
        z3.e eVar;
        boolean z16;
        boolean zK;
        Object objQ;
        Object dVar;
        float f16;
        int i16;
        Double d16;
        dy1.c cVar = (dy1.c) this.f163330e;
        e23.a aVar3 = (e23.a) this.f163329d;
        Context context = (Context) this.f163327b;
        p1 p1Var = (p1) this.f163331f;
        p1 p1Var2 = (p1) this.f163332g;
        p1 p1Var3 = (p1) this.f163328c;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar4 = h4.r.S;
            h4.r rVarD = x2.d(aVar4, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA2 = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode2 = Long.hashCode(mVar.getU());
            i2 i2VarX2 = mVar.x();
            h4.r rVarC2 = h4.k.c(rVarD, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar5);
            } else {
                mVar.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA2, mVar);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX2, mVar);
            h5.g.a.b bVar4 = h5.g.a.f81813j;
            if (mVar.getT()) {
                aVar = aVar3;
            } else {
                aVar = aVar3;
                if (!p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, mVar);
                h4.r rVarB = a2.b(c2.b0.f22601a.a(aVar4, 1.0f, true), a2.a(mVar), true);
                zVarA = c2.y.a(kVar, h4.d.a.f81537o, mVar, 48);
                iHashCode = Long.hashCode(mVar.getU());
                i2VarX = mVar.x();
                rVarC = h4.k.c(rVarB, mVar);
                if (mVar.F() != null) {
                    p3.p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar5);
                } else {
                    mVar.c();
                }
                b4.c(eVar2, zVarA, mVar);
                b4.c(c1623g, i2VarX, mVar);
                if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar, iHashCode, bVar4);
                }
                b4.c(fVar, rVarC, mVar);
                String strQ2 = gl1.y.Q(mVar, R.string.lbl_confirm_benchmarks);
                h4.r rVarF = x2.f(aVar4, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                j92.e eVar3 = j92.b.f97899b;
                f14 = 0.0f;
                h4.r rVarA = c2.l.A(rVarF, eVar3.f97920e, 0.0f, 2);
                float f17 = eVar3.f97920e;
                h4.r rVarC3 = c2.l.C(rVarA, 0.0f, f17, 0.0f, f17, 5);
                d6.h.f57752b.getClass();
                int i17 = d6.h.f57755e;
                d6.h hVarA = d6.h.a(i17);
                d92.b.f58624b.getClass();
                mh.c(strQ2, rVarC3, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 0, 0, 130044);
                i14 = 2;
                mh.c(gl1.y.Q(mVar, R.string.lbl_estimated_one_rep_max_description), c2.l.C(c2.l.A(x2.f(aVar4, 1.0f), eVar3.f97920e, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar3.f97921f, 7), 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 0, 0, 130044);
                strQ = gl1.y.Q(mVar, R.string.activities_value_not_set);
                mVar.C(1081807966);
                it = cVar.f61536b.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    z14 = next.f61541b;
                    d14 = next.f61545f;
                    bVar = next.f61543d;
                    bVar2 = next.f61542c;
                    Double d17 = next.f61546g;
                    if (z14) {
                        bVar3 = bVar2;
                    } else {
                        bVar3 = bVar;
                    }
                    if (bVar3 != null) {
                        d15 = bVar3.f61533f;
                    } else {
                        d15 = null;
                    }
                    str = strQ;
                    if (bVar3 != null) {
                        boolean z17 = bVar3.f61531d;
                        if (!zf.b.D(d14) && zf.b.D(d17)) {
                            mVar.C(-823185066);
                            String strP = gl1.y.P(R.string.string_space_bullet_string_pattern, new Object[]{gl1.y.P(R.string.lbl_previous_record, new Object[]{ux1.d.b(d14.doubleValue(), context, z17)}, mVar), gl1.y.P(R.string.lbl_new_pending_record, new Object[]{ux1.d.b(d17.doubleValue(), context, z17)}, mVar)}, mVar);
                            mVar.f();
                            strB = strP;
                        } else if (bVar3 == null && zf.b.D(d17)) {
                            mVar.C(-822582457);
                            String strP2 = gl1.y.P(R.string.lbl_new_pending_record, new Object[]{ux1.d.b(d17.doubleValue(), context, bVar3.f61531d)}, mVar);
                            mVar.f();
                            strB = strP2;
                        } else {
                            it = it;
                            z14 = z14;
                            if (zf.b.D(d15)) {
                                mVar.C(-822306929);
                                mVar.f();
                                strB = ux1.d.b(d15.doubleValue(), context, bVar3.f61531d);
                            } else {
                                mVar.C(-822159803);
                                mVar.f();
                                strB = str;
                            }
                            z15 = false;
                        }
                        z15 = true;
                    } else {
                        if (bVar3 == null) {
                        }
                        it = it;
                        z14 = z14;
                        if (zf.b.D(d15)) {
                            mVar.C(-822306929);
                            mVar.f();
                            strB = ux1.d.b(d15.doubleValue(), context, bVar3.f61531d);
                        } else {
                            mVar.C(-822159803);
                            mVar.f();
                            strB = str;
                        }
                        z15 = false;
                    }
                    aVar2 = next.f61540a;
                    if (z14) {
                        i15 = aVar2.f121352b;
                    } else {
                        i15 = aVar2.f121353c;
                    }
                    p2 p2Var = p2.f111205a;
                    if (z15) {
                        ux1.a.f173041a.getClass();
                        eVar = ux1.a.f173042b;
                    } else {
                        eVar = null;
                    }
                    String strQ3 = gl1.y.Q(mVar, i15);
                    if (!z14) {
                        bVar2 = bVar;
                    }
                    if (next.f61544e != null) {
                        z16 = true;
                    } else {
                        if (bVar2 != null) {
                            d16 = bVar2.f61533f;
                        } else {
                            d16 = null;
                        }
                        if (d16 != null) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                    }
                    zK = mVar.k(aVar2.ordinal()) | mVar.B(next);
                    objQ = mVar.q();
                    if (zK) {
                        f16 = 0.0f;
                        i16 = 2;
                        dVar = new p50.d(aVar2, p1Var, next, p1Var2, p1Var3);
                        mVar.K(dVar);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            f16 = 0.0f;
                            i16 = 2;
                            dVar = new p50.d(aVar2, p1Var, next, p1Var2, p1Var3);
                            mVar.K(dVar);
                        } else {
                            dVar = objQ;
                            f16 = 0.0f;
                            i16 = 2;
                        }
                    }
                    i14 = i16;
                    p2Var.h(strQ3, strB, null, null, null, z16, false, eVar, null, null, (e23.a) dVar, mVar, 0, 0, 860);
                    it = it;
                    f14 = f16;
                    strQ = str;
                }
                f15 = f14;
                mVar.f();
                mVar.y();
                if (cVar.f61538d) {
                    mVar.C(941866998);
                    l72.f0 f0Var = l72.f0.f110999a;
                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    f0Var.d(0, 9, aVar, c2.l.C(c2.l.A(rVarF2, eVar4.f97920e, f15, i14), 0.0f, eVar4.f97920e, 0.0f, eVar4.f97921f, 5), gl1.y.Q(mVar, R.string.lbl_stp_confirm_benchmarks), mVar, null, false);
                    mVar = mVar;
                    mVar.f();
                } else {
                    mVar.C(942406553);
                    mVar.f();
                }
                mVar.y();
                x1 x1Var2 = p3.n.f135158a;
            }
            v.h.z(iHashCode2, mVar, iHashCode2, bVar4);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, mVar);
            h4.r rVarB2 = a2.b(c2.b0.f22601a.a(aVar4, 1.0f, true), a2.a(mVar), true);
            zVarA = c2.y.a(kVar, h4.d.a.f81537o, mVar, 48);
            iHashCode = Long.hashCode(mVar.getU());
            i2VarX = mVar.x();
            rVarC = h4.k.c(rVarB2, mVar);
            if (mVar.F() != null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar5);
            } else {
                mVar.c();
            }
            b4.c(eVar2, zVarA, mVar);
            b4.c(c1623g, i2VarX, mVar);
            if (mVar.getT()) {
                v.h.z(iHashCode, mVar, iHashCode, bVar4);
            } else {
                v.h.z(iHashCode, mVar, iHashCode, bVar4);
            }
            b4.c(fVar, rVarC, mVar);
            String strQ4 = gl1.y.Q(mVar, R.string.lbl_confirm_benchmarks);
            h4.r rVarF3 = x2.f(aVar4, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar5 = j92.b.f97899b;
            f14 = 0.0f;
            h4.r rVarA2 = c2.l.A(rVarF3, eVar5.f97920e, 0.0f, 2);
            float f18 = eVar5.f97920e;
            h4.r rVarC4 = c2.l.C(rVarA2, 0.0f, f18, 0.0f, f18, 5);
            d6.h.f57752b.getClass();
            int i18 = d6.h.f57755e;
            d6.h hVarA2 = d6.h.a(i18);
            d92.b.f58624b.getClass();
            mh.c(strQ4, rVarC4, 0L, null, 0L, null, 0L, hVarA2, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 0, 0, 130044);
            i14 = 2;
            mh.c(gl1.y.Q(mVar, R.string.lbl_estimated_one_rep_max_description), c2.l.C(c2.l.A(x2.f(aVar4, 1.0f), eVar5.f97920e, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar5.f97921f, 7), 0L, null, 0L, null, 0L, d6.h.a(i18), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 0, 0, 130044);
            strQ = gl1.y.Q(mVar, R.string.activities_value_not_set);
            mVar.C(1081807966);
            it = cVar.f61536b.iterator();
            while (it.hasNext()) {
                next = it.next();
                z14 = next.f61541b;
                d14 = next.f61545f;
                bVar = next.f61543d;
                bVar2 = next.f61542c;
                Double d18 = next.f61546g;
                if (z14) {
                    bVar3 = bVar2;
                } else {
                    bVar3 = bVar;
                }
                if (bVar3 != null) {
                    d15 = bVar3.f61533f;
                } else {
                    d15 = null;
                }
                str = strQ;
                if (bVar3 != null) {
                    boolean z18 = bVar3.f61531d;
                    if (!zf.b.D(d14)) {
                        if (bVar3 == null) {
                        }
                        it = it;
                        z14 = z14;
                        if (zf.b.D(d15)) {
                            mVar.C(-822306929);
                            mVar.f();
                            strB = ux1.d.b(d15.doubleValue(), context, bVar3.f61531d);
                        } else {
                            mVar.C(-822159803);
                            mVar.f();
                            strB = str;
                        }
                        z15 = false;
                    } else {
                        if (bVar3 == null) {
                        }
                        it = it;
                        z14 = z14;
                        if (zf.b.D(d15)) {
                            mVar.C(-822306929);
                            mVar.f();
                            strB = ux1.d.b(d15.doubleValue(), context, bVar3.f61531d);
                        } else {
                            mVar.C(-822159803);
                            mVar.f();
                            strB = str;
                        }
                        z15 = false;
                    }
                } else {
                    if (bVar3 == null) {
                    }
                    it = it;
                    z14 = z14;
                    if (zf.b.D(d15)) {
                        mVar.C(-822306929);
                        mVar.f();
                        strB = ux1.d.b(d15.doubleValue(), context, bVar3.f61531d);
                    } else {
                        mVar.C(-822159803);
                        mVar.f();
                        strB = str;
                    }
                    z15 = false;
                }
                aVar2 = next.f61540a;
                if (z14) {
                    i15 = aVar2.f121352b;
                } else {
                    i15 = aVar2.f121353c;
                }
                p2 p2Var2 = p2.f111205a;
                if (z15) {
                    ux1.a.f173041a.getClass();
                    eVar = ux1.a.f173042b;
                } else {
                    eVar = null;
                }
                String strQ5 = gl1.y.Q(mVar, i15);
                if (!z14) {
                    bVar2 = bVar;
                }
                if (next.f61544e != null) {
                    z16 = true;
                } else {
                    if (bVar2 != null) {
                        d16 = bVar2.f61533f;
                    } else {
                        d16 = null;
                    }
                    if (d16 != null) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                }
                zK = mVar.k(aVar2.ordinal()) | mVar.B(next);
                objQ = mVar.q();
                if (zK) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        f16 = 0.0f;
                        i16 = 2;
                        dVar = new p50.d(aVar2, p1Var, next, p1Var2, p1Var3);
                        mVar.K(dVar);
                    } else {
                        dVar = objQ;
                        f16 = 0.0f;
                        i16 = 2;
                    }
                } else {
                    f16 = 0.0f;
                    i16 = 2;
                    dVar = new p50.d(aVar2, p1Var, next, p1Var2, p1Var3);
                    mVar.K(dVar);
                }
                i14 = i16;
                p2Var2.h(strQ5, strB, null, null, null, z16, false, eVar, null, null, (e23.a) dVar, mVar, 0, 0, 860);
                it = it;
                f14 = f16;
                strQ = str;
            }
            f15 = f14;
            mVar.f();
            mVar.y();
            if (cVar.f61538d) {
                mVar.C(941866998);
                l72.f0 f0Var2 = l72.f0.f110999a;
                h4.r rVarF4 = x2.f(h4.r.S, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                j92.e eVar6 = j92.b.f97899b;
                f0Var2.d(0, 9, aVar, c2.l.C(c2.l.A(rVarF4, eVar6.f97920e, f15, i14), 0.0f, eVar6.f97920e, 0.0f, eVar6.f97921f, 5), gl1.y.Q(mVar, R.string.lbl_stp_confirm_benchmarks), mVar, null, false);
                mVar = mVar;
                mVar.f();
            } else {
                mVar.C(942406553);
                mVar.f();
            }
            mVar.y();
            x1 x1Var3 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object b(Object obj, Object obj2) {
        h5.g.a.C1623g c1623g;
        h4.r.a aVar;
        j92.e eVar;
        m1.a aVar2;
        c2.j.k kVar;
        h4.g.a aVar3;
        m1.a aVar4;
        h5.e0.a aVar5;
        h5.g.a.b bVar;
        h5.g.a.e eVar2;
        vd0.x0 x0Var = (vd0.x0) this.f163330e;
        Uri uri = (Uri) this.f163331f;
        String str = (String) this.f163327b;
        p1 p1Var = (p1) this.f163332g;
        ug2.k kVar2 = (ug2.k) this.f163328c;
        e23.a aVar6 = (e23.a) this.f163329d;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        float f14 = vd0.c1.f177181a;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar7 = h4.r.S;
            h4.r rVarC = x2.c(x2.f(aVar7, 1.0f), 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar3 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar8 = h4.d.a.f81536n;
            c2.z zVarA = c2.y.a(kVar3, aVar8, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC2 = h4.k.c(rVarC, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar9 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar9);
            } else {
                mVar.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, zVarA, mVar);
            h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
            b4.c(c1623g2, i2VarX, mVar);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r rVarF = x2.f(aVar7, 1.0f);
            long jE = vb.h.e(d92.b.f58623a, mVar);
            m1.a aVar10 = m1.f128891a;
            g6.f.a aVar11 = g6.f.f75994b;
            h4.r rVarH = x2.h(u1.n.e(rVarF, jE, aVar10), 328);
            d92.b.f58625c.getClass();
            j92.e eVar4 = j92.b.f97899b;
            String str2 = str;
            h4.r rVarD = c2.l.D(c2.l.A(rVarH, eVar4.f97921f, 0.0f, 2));
            h4.g gVar = h4.d.a.f81528f;
            f5.z0 z0VarD = c2.q.d(gVar, false);
            int iHashCode2 = Long.hashCode(mVar.getU());
            i2 i2VarX2 = mVar.x();
            h4.r rVarC3 = h4.k.c(rVarD, mVar);
            if (mVar.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar9);
            } else {
                mVar.c();
            }
            b4.c(eVar3, z0VarD, mVar);
            b4.c(c1623g2, i2VarX2, mVar);
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                v.h.z(iHashCode2, mVar, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC3, mVar);
            c2.u uVar = c2.u.f22885a;
            if (((Uri) p1Var.getF182175a()) != null) {
                mVar.C(300826573);
                Uri uri2 = (Uri) p1Var.getF182175a();
                uri2.getClass();
                c1623g = c1623g2;
                vd0.a1.a(uri2, f14, x2.q(aVar7, 280), x0Var, mVar, 432);
                mVar.f();
                aVar3 = aVar8;
                fVar = fVar;
                aVar = aVar7;
                bVar = bVar2;
                eVar = eVar4;
                aVar5 = aVar9;
                aVar4 = aVar10;
                kVar = kVar3;
                eVar2 = eVar3;
            } else {
                c1623g = c1623g2;
                if (uri != null) {
                    mVar.C(301138991);
                    String strQ = gl1.y.Q(mVar, R.string.lbl_profile_picture);
                    h4.r rVarB = l4.k.b(x2.q(aVar7, f14), k2.i.f102406a);
                    f5.k.f68985a.getClass();
                    aVar2 = aVar10;
                    aVar = aVar7;
                    eVar = eVar4;
                    jf.r.a(uri, strQ, rVarB, null, null, f5.k.a.f68987b, null, mVar, 1572864, 1976);
                    mVar = mVar;
                    mVar.f();
                    aVar3 = aVar8;
                    aVar5 = aVar9;
                    bVar = bVar2;
                    eVar2 = eVar3;
                    kVar = kVar3;
                } else {
                    aVar = aVar7;
                    eVar = eVar4;
                    aVar2 = aVar10;
                    kVar = kVar3;
                    if (str2 == null || str2.length() == 0) {
                        aVar3 = aVar8;
                        mVar.C(302037216);
                        h4.r rVarB2 = l4.k.b(x2.q(aVar, SyslogConstants.LOG_LOCAL4), k2.i.f102406a);
                        gl.c.f77766a.getClass();
                        gl.e eVar5 = gl.c.f77767b;
                        aVar4 = aVar2;
                        h4.r rVarE = u1.n.e(rVarB2, eVar5.f77781g, aVar4);
                        f5.z0 z0VarD2 = c2.q.d(gVar, false);
                        int iHashCode3 = Long.hashCode(mVar.getU());
                        i2 i2VarX3 = mVar.x();
                        h4.r rVarC4 = h4.k.c(rVarE, mVar);
                        if (mVar.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar9);
                        } else {
                            mVar.c();
                        }
                        b4.c(eVar3, z0VarD2, mVar);
                        b4.c(c1623g, i2VarX3, mVar);
                        if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                            v.h.z(iHashCode3, mVar, iHashCode3, bVar2);
                        }
                        b4.c(fVar, rVarC4, mVar);
                        aVar5 = aVar9;
                        fVar = fVar;
                        str2 = str2;
                        bVar = bVar2;
                        eVar2 = eVar3;
                        i7.a(n5.c.a(R.drawable.ic_dog_profile_placeholder, mVar, 0), gl1.y.Q(mVar, R.string.lbl_profile_picture), x2.q(aVar, 80), eVar5.f77787j, mVar, 384, 0);
                        mVar = mVar;
                        mVar.y();
                        mVar.f();
                    } else {
                        mVar.C(301602503);
                        aVar5 = aVar9;
                        String strQ2 = gl1.y.Q(mVar, R.string.lbl_profile_picture);
                        h4.r rVarB3 = l4.k.b(x2.q(aVar, f14), k2.i.f102406a);
                        f5.k.f68985a.getClass();
                        aVar3 = aVar8;
                        jf.r.a(str2, strQ2, rVarB3, null, null, f5.k.a.f68987b, null, mVar, 1572864, 1976);
                        mVar = mVar;
                        mVar.f();
                        bVar = bVar2;
                        str2 = str2;
                        eVar2 = eVar3;
                    }
                }
                aVar4 = aVar2;
            }
            mVar.y();
            h4.r rVarC5 = c2.l.C(u1.n.e(x2.c(x2.f(aVar, 1.0f), 1.0f), d92.b.a(mVar).c().b(), aVar4), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            c2.z zVarA2 = c2.y.a(kVar, aVar3, mVar, 54);
            int iHashCode4 = Long.hashCode(mVar.getU());
            i2 i2VarX4 = mVar.x();
            h4.r rVarC6 = h4.k.c(rVarC5, mVar);
            if (mVar.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar5);
            } else {
                mVar.c();
            }
            b4.c(eVar2, zVarA2, mVar);
            b4.c(c1623g, i2VarX4, mVar);
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode4))) {
                v.h.z(iHashCode4, mVar, iHashCode4, bVar);
            }
            h5.g.a.f fVar2 = fVar;
            b4.c(fVar2, rVarC6, mVar);
            h4.r rVarZ = x2.z(aVar, null, 3);
            s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, mVar, 0);
            int iHashCode5 = Long.hashCode(mVar.getU());
            i2 i2VarX5 = mVar.x();
            h4.r rVarC7 = h4.k.c(rVarZ, mVar);
            if (mVar.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar5);
            } else {
                mVar.c();
            }
            b4.c(eVar2, s2VarA, mVar);
            b4.c(c1623g, i2VarX5, mVar);
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode5))) {
                v.h.z(iHashCode5, mVar, iHashCode5, bVar);
            }
            b4.c(fVar2, rVarC7, mVar);
            u2 u2Var = u2.f22900a;
            s62.a.f157643a.getClass();
            t62.b bVar3 = t62.b.f162798a;
            u4.d dVarA = m6.a(bVar3);
            String strQ3 = gl1.y.Q(mVar, R.string.take_photo);
            float f15 = vd0.c1.f177182b;
            vd0.c1.c(dVarA, strQ3, kVar2, x2.q(aVar, f15), mVar, 3072);
            vd0.c1.c(w3.a(bVar3), gl1.y.Q(mVar, R.string.lbl_add_photo), aVar6, x2.q(aVar, f15), mVar, 3072);
            if (str2 == null || str2.length() == 0) {
                mVar.C(-182158974);
                mVar.f();
            } else {
                mVar.C(-182388653);
                vd0.c1.b(48, x2.q(aVar, f15), str2, mVar);
                mVar.f();
            }
            mVar.y();
            mVar.y();
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        wx1.a.a((i53.c) this.f163330e, (mx1.c) this.f163327b, (e23.l) this.f163328c, (e23.a) this.f163329d, (e23.a) this.f163331f, (e23.a) this.f163332g, (p3.m) obj, p3.p0.t(1));
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        x70.d.b((c2.a0) this.f163330e, (u70.a) this.f163327b, (List) this.f163331f, (j70.r) this.f163332g, (j70.r) this.f163329d, (e23.l) this.f163328c, (p3.m) obj, p3.p0.t(7));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00fa  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object e(Object obj, Object obj2) {
        boolean z14;
        float f14;
        i53.f fVar = (i53.f) this.f163330e;
        n82.f fVar2 = (n82.f) this.f163327b;
        xh0.h hVar = (xh0.h) this.f163331f;
        yd1.a aVar = (yd1.a) this.f163332g;
        p1 p1Var = (p1) this.f163329d;
        p1 p1Var2 = (p1) this.f163328c;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarE = u1.n.e(x2.d(aVar2, 1.0f), vb.h.e(d92.b.f58623a, mVar), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarE, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar3);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            if (((xh0.g) p1Var.getF182175a()).f191003d) {
                mVar.C(1743435225);
                i53.c cVarE = i53.a.e(o2.b(fVar, mVar));
                int iIndexOf = fVar.indexOf(fVar2.f124961b.a());
                h4.r rVarB = b0Var.b(aVar2, h4.d.a.f81537o);
                boolean zB = mVar.B(fVar2) | mVar.r(hVar);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new wn2.f(fVar2, 10, fVar, hVar);
                    mVar.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new wn2.f(fVar2, 10, fVar, hVar);
                        mVar.K(objQ);
                    }
                }
                z14 = true;
                f14 = 1.0f;
                t82.c.a(cVarE, rVarB, iIndexOf, 0.0f, (e23.l) objQ, mVar, 0, 24);
                q82.a.a(x2.f(aVar2, 1.0f), new n82.n(fVar2, aVar), null, mVar, 6, 4);
                mVar = mVar;
                mVar.f();
            } else {
                z14 = true;
                f14 = 1.0f;
                mVar.C(1744190571);
                mVar.f();
            }
            n82.c.a(b0Var.a(aVar2, f14, z14), fVar2, 3, (((xh0.g) p1Var.getF182175a()).f191003d || ((Boolean) p1Var2.getF182175a()).booleanValue()) ? z14 : false, z3.f.c(-262083239, new qw.b(hVar, fVar2, p1Var2, p1Var, 15), mVar), mVar, 24960, 0);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object f(Object obj, Object obj2) {
        jq1.i iVar = (jq1.i) this.f163330e;
        LocalDate localDate = (LocalDate) this.f163327b;
        LocalDate localDate2 = (LocalDate) this.f163331f;
        p1 p1Var = (p1) this.f163332g;
        p1 p1Var2 = (p1) this.f163329d;
        p1 p1Var3 = (p1) this.f163328c;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i14 = 1;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            g6.f.a aVar = g6.f.f75994b;
            h4.r rVarH = x2.h(x2.f(h4.r.S, 1.0f), 290);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarA = c2.l.A(rVarH, j92.b.f97899b.f97920e, 0.0f, 2);
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new xq1.c(p1Var, i14);
                mVar.K(objQ);
            }
            e23.l lVar = (e23.l) objQ;
            boolean zR = mVar.r(iVar) | mVar.r(localDate) | mVar.r(localDate2);
            Object objQ2 = mVar.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new ug2.q(iVar, localDate, localDate2, p1Var2, p1Var3, 13);
                mVar.K(objQ2);
            }
            p002j6.c.b(lVar, rVarA, (e23.l) objQ2, mVar, 6, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:33:0x013e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0162  */
    /* JADX WARN: Code duplicated, block: B:47:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x01ea  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object g(Object obj, Object obj2) {
        Context context = (Context) this.f163330e;
        xy0.c cVar = (xy0.c) this.f163327b;
        e23.l lVar = (e23.l) this.f163328c;
        p1 p1Var = (p1) this.f163331f;
        x3 x3Var = (x3) this.f163332g;
        x3 x3Var2 = (x3) this.f163329d;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i14 = 1;
        int i15 = 2;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarB = a2.b(x2.d(h4.r.S, 1.0f), a2.a(mVar), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarB, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            List<com.garmin.android.apps.connectmobile.navigation.more.b> list = ((xy0.c.C3603c) p1Var.getF182175a()).f192679b;
            boolean zBooleanValue = ((Boolean) x3Var.getF182175a()).booleanValue();
            boolean zR = mVar.r(cVar) | mVar.r(context) | mVar.B(lVar);
            Object objQ = mVar.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new wn2.f(cVar, 12, context, lVar);
                mVar.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new wn2.f(cVar, 12, context, lVar);
                    mVar.K(objQ);
                }
            }
            com.garmin.android.apps.connectmobile.navigation.more.a.a(b0Var, list, zBooleanValue, (e23.l) objQ, mVar, 6);
            mVar.y();
            if (((Number) x3Var2.getF182175a()).intValue() == 10) {
                Toast.makeText(context, "Device Sync Audit Detailed Logging Enabled", 0).show();
            }
            if (((xy0.c.C3603c) p1Var.getF182175a()).f192682e) {
                mVar.C(1321302516);
                l72.c1 c1Var = l72.c1.f110940a;
                String strQ = gl1.y.Q(mVar, R.string.sign_out_prompt_message_1);
                String strQ2 = gl1.y.Q(mVar, R.string.lbl_signout);
                boolean zR2 = mVar.r(cVar);
                Object objQ2 = mVar.q();
                if (zR2) {
                    objQ2 = new xy0.a(cVar, i14);
                    mVar.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new xy0.a(cVar, i14);
                        mVar.K(objQ2);
                    }
                }
                e23.a<Unit> aVar3 = (e23.a) objQ2;
                String strQ3 = gl1.y.Q(mVar, R.string.lbl_cancel);
                boolean zR3 = mVar.r(cVar);
                Object objQ3 = mVar.q();
                if (zR3) {
                    objQ3 = new xy0.a(cVar, i15);
                    mVar.K(objQ3);
                } else {
                    aVar2.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new xy0.a(cVar, i15);
                        mVar.K(objQ3);
                    }
                }
                c1Var.a(false, null, strQ, null, null, strQ2, false, false, aVar3, strQ3, (e23.a) objQ3, mVar, 0, 0, 219);
                mVar = mVar;
                mVar.f();
            } else {
                mVar.C(1321822417);
                mVar.f();
            }
            if (((xy0.c.C3603c) p1Var.getF182175a()).f192683f) {
                mVar.C(1321899111);
                l72.c1 c1Var2 = l72.c1.f110940a;
                String strQ4 = gl1.y.Q(mVar, R.string.live_track_config_bttn_label_extend_sharing);
                String strQ5 = gl1.y.Q(mVar, R.string.live_track_in_progress_confirm_extend_sharing);
                String strQ6 = gl1.y.Q(mVar, R.string.lbl_yes);
                boolean zR4 = mVar.r(cVar);
                Object objQ4 = mVar.q();
                if (zR4) {
                    objQ4 = new xy0.a(cVar, 3);
                    mVar.K(objQ4);
                } else {
                    aVar2.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new xy0.a(cVar, 3);
                        mVar.K(objQ4);
                    }
                }
                e23.a<Unit> aVar4 = (e23.a) objQ4;
                String strQ7 = gl1.y.Q(mVar, R.string.lbl_no);
                boolean zR5 = mVar.r(cVar);
                Object objQ5 = mVar.q();
                if (zR5) {
                    objQ5 = new xy0.a(cVar, 4);
                    mVar.K(objQ5);
                } else {
                    aVar2.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new xy0.a(cVar, 4);
                        mVar.K(objQ5);
                    }
                }
                p3.m mVar2 = mVar;
                c1Var2.a(false, strQ4, strQ5, null, null, strQ6, false, false, aVar4, strQ7, (e23.a) objQ5, mVar2, 0, 0, 217);
                mVar2.f();
            } else {
                mVar.C(1322677521);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:22:0x0109  */
    /* JADX WARN: Code duplicated, block: B:33:0x017a  */
    /* JADX WARN: Code duplicated, block: B:38:0x019b  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object h(Object obj, Object obj2) {
        int i14;
        h2.b bVar = (h2.b) this.f163330e;
        p1 p1Var = (p1) this.f163327b;
        hf.j jVar = (hf.j) this.f163331f;
        p1 p1Var2 = (p1) this.f163332g;
        y22.j jVar2 = (y22.j) this.f163329d;
        p1 p1Var3 = (p1) this.f163328c;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarD = x2.d(h4.r.S, 1.0f);
            int i15 = k3.f22728a;
            c3 c3VarB = q3.b(mVar);
            p3.f22815b.getClass();
            h2.u.a(bVar, rVarD, n3.c(n3.d(c3VarB, p3.f22826m | p3.f22823j), mVar), h2.j.a.f80923a, 0, 0.0f, null, null, false, null, null, null, null, z3.f.c(830873790, new o72.m1(23, p1Var, jVar), mVar), mVar, 3120, 24576, 16368);
            y22.w wVar = (y22.w) p1Var2.getF182175a();
            p3.m.a aVar = p3.m.f135153a;
            if (wVar == null) {
                mVar.C(-1312758178);
                mVar.f();
                i14 = 1;
            } else {
                mVar.C(-1312758177);
                l72.c1 c1Var = l72.c1.f110940a;
                String strQ = gl1.y.Q(mVar, R.string.lbl_delete_photo);
                String strQ2 = gl1.y.Q(mVar, R.string.lbl_are_you_sure);
                String strQ3 = gl1.y.Q(mVar, R.string.lbl_delete);
                String strQ4 = gl1.y.Q(mVar, R.string.lbl_cancel);
                boolean zR = mVar.r(jVar2) | mVar.r(wVar) | mVar.B(p1Var2);
                Object objQ = mVar.q();
                if (zR) {
                    i14 = 1;
                    objQ = new y22.o(jVar2, wVar, p1Var2, 1);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        i14 = 1;
                        objQ = new y22.o(jVar2, wVar, p1Var2, 1);
                        mVar.K(objQ);
                    } else {
                        i14 = 1;
                    }
                }
                e23.a<Unit> aVar2 = (e23.a) objQ;
                boolean zB = mVar.B(p1Var2);
                Object objQ2 = mVar.q();
                if (zB) {
                    objQ2 = new x91.d(p1Var2, 21);
                    mVar.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new x91.d(p1Var2, 21);
                        mVar.K(objQ2);
                    }
                }
                c1Var.a(false, strQ, strQ2, null, null, strQ3, true, false, aVar2, strQ4, (e23.a) objQ2, mVar, 1572864, 0, 153);
                mVar.f();
            }
            y22.i iVar = ((y22.v) p1Var3.getF182175a()).f194321c;
            if (iVar == null) {
                mVar.C(-1312142673);
                mVar.f();
            } else {
                mVar.C(-1312142672);
                if (iVar instanceof y22.i.a) {
                    mVar.C(-1314699589);
                    l72.c1 c1Var2 = l72.c1.f110940a;
                    String strQ5 = gl1.y.Q(mVar, R.string.technical_challenge_message);
                    String strQ6 = gl1.y.Q(mVar, R.string.lbl_try_again);
                    boolean zR2 = mVar.r(jVar2) | mVar.r(iVar);
                    Object objQ3 = mVar.q();
                    if (zR2) {
                        objQ3 = new y22.n(jVar2, iVar, i14);
                        mVar.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new y22.n(jVar2, iVar, i14);
                            mVar.K(objQ3);
                        }
                    }
                    e23.a<Unit> aVar3 = (e23.a) objQ3;
                    String strQ7 = gl1.y.Q(mVar, R.string.lbl_cancel);
                    boolean zR3 = mVar.r(jVar2);
                    Object objQ4 = mVar.q();
                    if (zR3) {
                        objQ4 = new y22.m(jVar2, 3);
                        mVar.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new y22.m(jVar2, 3);
                            mVar.K(objQ4);
                        }
                    }
                    c1Var2.a(false, null, strQ5, null, null, strQ6, false, false, aVar3, strQ7, (e23.a) objQ4, mVar, 0, 0, 219);
                    mVar.f();
                } else {
                    mVar.C(-1314181610);
                    mVar.f();
                }
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object i(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        y40.m.a((a50.d) this.f163330e, (n50.g) this.f163327b, (n50.d) this.f163331f, (d2) this.f163332g, (e23.l) this.f163328c, (e23.l) this.f163329d, (p3.m) obj, p3.p0.t(196609));
        return Unit.INSTANCE;
    }

    private final Object j(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        ya0.c0.b((q90.d.b) this.f163330e, (ya0.d) this.f163327b, (e23.l) this.f163328c, (e23.l) this.f163331f, (ca0.o0) this.f163332g, (e23.l) this.f163329d, (p3.m) obj, p3.p0.t(1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005a  */
    private final Object k(Object obj, Object obj2) {
        e23.a aVar = (e23.a) this.f163329d;
        i53.f fVar = (i53.f) this.f163330e;
        i53.f fVar2 = (i53.f) this.f163327b;
        e23.l lVar = (e23.l) this.f163328c;
        yq0.b bVar = (yq0.b) this.f163331f;
        Context context = (Context) this.f163332g;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = gl1.y.Q(mVar, R.string.title_insights);
            boolean zB = mVar.B(lVar) | mVar.r(bVar) | mVar.r(context);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new wn2.f(lVar, 18, bVar, context);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new wn2.f(lVar, 18, bVar, context);
                    mVar.K(objQ);
                }
            }
            z02.f.d(strQ, null, null, aVar, fVar, fVar2, (e23.l) objQ, mVar, 2359296, 22);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object l(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        yr.x.a((mc) this.f163330e, (o53.b0) this.f163331f, (nr.x) this.f163332g, (String) this.f163327b, (String) this.f163329d, (e23.p) this.f163328c, (p3.m) obj, p3.p0.t(1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0070  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object n(Object obj, Object obj2) {
        AddTIEventViewModel addTIEventViewModel = (AddTIEventViewModel) this.f163330e;
        e23.l lVar = (e23.l) this.f163328c;
        p1 p1Var = (p1) this.f163327b;
        p1 p1Var2 = (p1) this.f163331f;
        p1 p1Var3 = (p1) this.f163332g;
        p1 p1Var4 = (p1) this.f163329d;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            l72.f0 f0Var = l72.f0.f110999a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            String strQ = gl1.y.Q(mVar, R.string.lbl_next);
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            boolean zR = mVar.r(addTIEventViewModel) | mVar.B(lVar);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new yy1.j(addTIEventViewModel, lVar, p1Var2, p1Var3, p1Var4, 1);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new yy1.j(addTIEventViewModel, lVar, p1Var2, p1Var3, p1Var4, 1);
                    mVar.K(objQ);
                }
            }
            f0Var.d(384, 1, (e23.a) objQ, rVarF, strQ, mVar, null, zBooleanValue);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object o(Object obj, Object obj2) {
        String strD1;
        e23.p pVar = (e23.p) this.f163330e;
        Context context = (Context) this.f163327b;
        p1 p1Var = (p1) this.f163331f;
        p1 p1Var2 = (p1) this.f163332g;
        p1 p1Var3 = (p1) this.f163329d;
        p1 p1Var4 = (p1) this.f163328c;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        p1Var.setValue(Boolean.FALSE);
        p1Var2.setValue(DateTime.now().withHourOfDay(iIntValue).withMinuteOfHour(iIntValue2));
        pVar.invoke((DateTime) p1Var2.getF182175a(), (my1.g) p1Var3.getF182175a());
        lz1.f.f115404a.getClass();
        context.getClass();
        if (DateFormat.is24HourFormat(context)) {
            l3.f23124b.getClass();
            strD1 = l3.a.d1((iIntValue * 60) + iIntValue2);
            if (strD1 == null) {
                strD1 = "";
            }
        } else {
            strD1 = c22.j0.u((iIntValue * 60) + iIntValue2);
        }
        p1Var4.setValue(strD1);
        return Unit.INSTANCE;
    }

    private final Object q(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        z01.b.b((h4.r) this.f163330e, (String) this.f163327b, (String) this.f163331f, (z3.e) this.f163332g, (z01.a) this.f163329d, (b92.a) this.f163328c, (p3.m) obj, p3.p0.t(3073));
        return Unit.INSTANCE;
    }

    private final Object r(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        z41.o.a((o51.f) this.f163330e, (h4.r) this.f163327b, (e23.l) this.f163328c, (e23.l) this.f163331f, (e23.l) this.f163332g, (e23.l) this.f163329d, (p3.m) obj, p3.p0.t(1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:229:0x076a  */
    /* JADX WARN: Code duplicated, block: B:230:0x0774  */
    /* JADX WARN: Code duplicated, block: B:232:0x077e  */
    /* JADX WARN: Code duplicated, block: B:233:0x0782  */
    /* JADX WARN: Code duplicated, block: B:236:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:238:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:239:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:244:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:246:0x083e  */
    /* JADX WARN: Code duplicated, block: B:291:0x0a0c  */
    /* JADX WARN: Code duplicated, block: B:298:0x0a72  */
    /* JADX WARN: Code duplicated, block: B:303:0x0ac5  */
    /* JADX WARN: Code duplicated, block: B:308:0x0aee  */
    /* JADX WARN: Code duplicated, block: B:31:0x0127  */
    /* JADX WARN: Code duplicated, block: B:337:0x0cce  */
    /* JADX WARN: Code duplicated, block: B:41:0x018b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        z3.e eVar;
        float f14;
        String str;
        h5.g.a.f fVar;
        int i14;
        float f15;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        List<ue0.l> listC;
        z3.e eVar2;
        int i15 = this.f163326a;
        int i16 = 13;
        int i17 = 16;
        p3.m.a aVar = p3.m.f135153a;
        int i18 = 2;
        Object obj3 = this.f163328c;
        Object obj4 = this.f163329d;
        Object obj5 = this.f163332g;
        Object obj6 = this.f163331f;
        Object obj7 = this.f163327b;
        Object obj8 = this.f163330e;
        switch (i15) {
            case 0:
                ((Integer) obj2).getClass();
                h0.a((x) obj8, (String) obj7, (l90.k) obj6, (t1) obj5, (e23.a) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 1:
                o90.a aVar2 = (o90.a) obj8;
                String str2 = (String) obj7;
                ArrayList arrayList = (ArrayList) obj6;
                e23.l lVar = (e23.l) obj3;
                String str3 = (String) obj5;
                e23.a aVar3 = (e23.a) obj4;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar4 = h4.r.S;
                    h4.r rVarD = x2.d(aVar4, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    h4.r rVarA = c2.l.A(rVarD, eVar3.f97920e, 0.0f, 2);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA2 = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode2 = Long.hashCode(mVar.getU());
                    i2 i2VarX2 = mVar.x();
                    h4.r rVarC2 = h4.k.c(rVarA, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar5);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar, iHashCode2, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar);
                    c2.b0 b0Var = c2.b0.f22601a;
                    h4.r rVarQ = x2.q(aVar4, j92.b.f97901d.f97908g);
                    h4.g.a aVar6 = h4.d.a.f81537o;
                    da0.f.e(aVar2, b0Var.b(rVarQ, aVar6), mVar, 0);
                    String strQ = gl1.y.Q(mVar, R.string.lbl_pairing_your_device);
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar);
                    d6.h.f57752b.getClass();
                    int i19 = d6.h.f57755e;
                    mh.c(strQ, b0Var.b(c2.l.C(aVar4, 0.0f, eVar3.f97921f, 0.0f, 0.0f, 13), aVar6), 0L, null, 0L, null, 0L, d6.h.a(i19), 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130044);
                    mh.c(g22.n.g(str2), b0Var.b(c2.l.C(x2.f(aVar4, 1.0f), 0.0f, eVar3.f97916a, 0.0f, 0.0f, 13), aVar6), 0L, null, 0L, null, 0L, d6.h.a(i19), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97927d, mVar), mVar, 0, 0, 130044);
                    mh.c(gl1.y.Q(mVar, R.string.golf_lbl_searching), c2.l.A(x2.f(c2.l.C(aVar4, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13), 1.0f), eVar3.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, d6.h.a(i19), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar), mVar, 0, 0, 130044);
                    h4.r rVarC3 = c2.l.C(aVar4, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13);
                    o4.d0.f128823b.getClass();
                    long j8 = o4.d0.f128831j;
                    j92.d dVar = j92.b.f97900c;
                    h4.r rVarB = l4.k.b(u1.n.e(rVarC3, j8, k2.i.a(dVar.f97911c)), k2.i.a(dVar.f97911c));
                    boolean zR = mVar.r(arrayList) | mVar.B(lVar);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new gr2.a(arrayList, lVar, 3);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new gr2.a(arrayList, lVar, 3);
                            mVar.K(objQ);
                        }
                    }
                    e2.c.b(rVarB, null, null, null, null, null, false, null, (e23.l) objQ, mVar, 0, 510);
                    c2.l.f(b0Var.a(aVar4, 1.0f, true), mVar);
                    da0.b.a(c2.l.C(x2.f(aVar4, 1.0f), 0.0f, 0.0f, 0.0f, eVar3.f97920e, 7), str3, aVar3, false, null, null, false, null, null, false, mVar, 0, 1016);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                String str4 = (String) obj7;
                zb0.l lVar2 = (zb0.l) obj8;
                e23.l lVar3 = (e23.l) obj3;
                List list = (List) obj6;
                e23.l lVar4 = (e23.l) obj5;
                e23.a aVar7 = (e23.a) obj4;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar8 = h4.r.S;
                    h4.r rVarD2 = x2.d(aVar8, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    h4.r rVarC4 = c2.l.C(c2.l.A(rVarD2, eVar4.f97920e, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar4.f97920e, 7);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA3 = c2.y.a(kVar2, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode3 = Long.hashCode(mVar2.getU());
                    i2 i2VarX3 = mVar2.x();
                    h4.r rVarC5 = h4.k.c(rVarC4, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar9 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar9);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar2, iHashCode3, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC5, mVar2);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    if (d53.w.J(str4)) {
                        mVar2.C(1095572199);
                        String strQ2 = gl1.y.Q(mVar2, lVar2 == zb0.l.ALL ? R.string.startup_compatible_devices : lVar2.f203556b);
                        h4.r rVarC6 = c2.l.C(x2.f(aVar8, 1.0f), 0.0f, 0.0f, 0.0f, eVar4.f97920e, 7);
                        d92.b.f58624b.getClass();
                        mh.c(strQ2, rVarC6, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97927d), mVar2), mVar2, 0, 0, 131068);
                        mVar2.f();
                    } else {
                        mVar2.C(1095983507);
                        mVar2.f();
                    }
                    if (lVar2 == zb0.l.ALL) {
                        mVar2.C(1096089527);
                        h4.r rVarB2 = l4.k.b(aVar8, k2.i.a(j92.b.f97900c.f97911c));
                        String strQ3 = gl1.y.Q(mVar2, R.string.lbl_search);
                        if (d53.w.J(str4)) {
                            mVar2.C(1097069375);
                            mVar2.f();
                            eVar = null;
                        } else {
                            mVar2.C(1096658191);
                            z3.e eVarC = z3.f.c(1110368449, new b71.n(lVar3, 19, (byte) 0), mVar2);
                            mVar2.f();
                            eVar = eVarC;
                        }
                        h.f163340a.getClass();
                        z3.e eVar5 = h.f163341b;
                        boolean zB = mVar2.B(lVar3);
                        Object objQ2 = mVar2.q();
                        if (zB) {
                            objQ2 = new j(lVar3, 6);
                            mVar2.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new j(lVar3, 6);
                                mVar2.K(objQ2);
                            }
                        }
                        l72.p1.a(str4, rVarB2, strQ3, null, false, false, null, 0L, null, eVar, eVar5, null, null, (e23.l) objQ2, mVar2, 0, 6, 14840);
                        mVar2.f();
                    } else {
                        mVar2.C(1097237395);
                        mVar2.f();
                    }
                    m4.q qVar = (m4.q) mVar2.A(kotlin.t1.f91491i);
                    m3 m3Var = (m3) mVar2.A(kotlin.t1.f91499q);
                    e2.i0 i0VarA = e2.k0.a(0, 0, 3, mVar2);
                    boolean zB2 = mVar2.B(str4) | mVar2.B(i0VarA);
                    Object objQ3 = mVar2.q();
                    if (zB2) {
                        objQ3 = new h1.a(str4, i0VarA, null);
                        mVar2.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new h1.a(str4, i0VarA, null);
                            mVar2.K(objQ3);
                        }
                    }
                    p3.l0.e((e23.p) objQ3, str4, mVar2);
                    h4.r rVarC7 = c2.l.C(aVar8, 0.0f, eVar4.f97920e, 0.0f, 0.0f, 13);
                    long jC = com.nimbusds.jose.shaded.gson.internal.a.c(mVar2);
                    j92.d dVar2 = j92.b.f97900c;
                    h4.r rVarB3 = l4.k.b(u1.n.e(rVarC7, jC, k2.i.a(dVar2.f97911c)), k2.i.a(dVar2.f97911c));
                    Unit unit = Unit.INSTANCE;
                    boolean zR2 = mVar2.r(qVar) | mVar2.B(m3Var);
                    Object objQ4 = mVar2.q();
                    if (zR2) {
                        objQ4 = new h1.b(qVar, m3Var);
                        mVar2.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new h1.b(qVar, m3Var);
                            mVar2.K(objQ4);
                        }
                    }
                    h4.r rVarB4 = b5.s0.b(rVarB3, unit, (PointerInputEventHandler) objQ4);
                    boolean zR3 = mVar2.r(list) | mVar2.B(lVar4) | mVar2.B(aVar7);
                    Object objQ5 = mVar2.q();
                    if (zR3) {
                        objQ5 = new fs.i(list, lVar4, aVar7, 1);
                        mVar2.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new fs.i(list, lVar4, aVar7, 1);
                            mVar2.K(objQ5);
                        }
                    }
                    e2.c.b(rVarB4, i0VarA, null, null, null, null, false, null, (e23.l) objQ5, mVar2, 0, 508);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                tb0.l.c((ub0.l) obj8, (tb0.x) obj6, (String) obj7, (e23.a) obj4, (e23.l) obj3, (e23.l) obj5, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 4:
                e23.p pVar = (e23.p) obj8;
                String str5 = (String) obj7;
                String str6 = (String) obj6;
                String str7 = (String) obj5;
                String str8 = (String) obj4;
                String str9 = (String) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar10 = h4.r.S;
                    float f16 = 16;
                    g6.f.a aVar11 = g6.f.f75994b;
                    h4.r rVarY = c2.l.y(aVar10, f16);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar3 = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22692b, bVar3, mVar3, 48);
                    int iHashCode4 = Long.hashCode(mVar3.getU());
                    i2 i2VarX4 = mVar3.x();
                    h4.r rVarC8 = h4.k.c(rVarY, mVar3);
                    h5.g.V.getClass();
                    h5.e0.a aVar12 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar12);
                    } else {
                        mVar3.c();
                    }
                    h5.g.a.e eVar6 = h5.g.a.f81810g;
                    b4.c(eVar6, s2VarA, mVar3);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX4, mVar3);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar3.getT()) {
                        f14 = f16;
                        str = str6;
                    } else {
                        f14 = f16;
                        str = str6;
                        if (!p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode4))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC8, mVar3);
                        u2 u2Var = u2.f22900a;
                        if (pVar == null) {
                            mVar3.C(-372641210);
                            mVar3.f();
                        } else {
                            v.h.D(mVar3, -843304677, pVar, mVar3, 0);
                            Unit unit2 = Unit.INSTANCE;
                        }
                        if (pVar != null) {
                            f15 = f14;
                            i14 = 0;
                        } else {
                            i14 = 0;
                            f15 = 0;
                        }
                        h4.r rVarC9 = c2.l.C(u2Var.a(aVar10, 1.0f, true), f15, 0.0f, i14, 0.0f, 10);
                        zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar3, i14);
                        iHashCode = Long.hashCode(mVar3.getU());
                        i2VarX = mVar3.x();
                        rVarC = h4.k.c(rVarC9, mVar3);
                        if (mVar3.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar12);
                        } else {
                            mVar3.c();
                        }
                        b4.c(eVar6, zVarA, mVar3);
                        b4.c(c1623g, i2VarX, mVar3);
                        if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar3, iHashCode, bVar4);
                        }
                        b4.c(fVar, rVarC, mVar3);
                        c2.b0 b0Var3 = c2.b0.f22601a;
                        c2.j.c cVar = c2.j.f22696f;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        c2.t0.a(null, c2.j.i(j92.b.f97899b.f97918c), cVar, null, 0, 0, z3.f.c(-1438176424, new f21.v(str7, str8, str9, 2), mVar3), mVar3, 1573248, 57);
                        mVar3.C(-165151744);
                        ub1.f.c(str5, str, mVar3, 0);
                        mVar3.f();
                        mVar3.y();
                        mVar3.C(-370435994);
                        mVar3.f();
                        mVar3.y();
                    }
                    v.h.z(iHashCode4, mVar3, iHashCode4, bVar4);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC8, mVar3);
                    u2 u2Var2 = u2.f22900a;
                    if (pVar == null) {
                        mVar3.C(-372641210);
                        mVar3.f();
                    } else {
                        v.h.D(mVar3, -843304677, pVar, mVar3, 0);
                        Unit unit3 = Unit.INSTANCE;
                    }
                    if (pVar != null) {
                        f15 = f14;
                        i14 = 0;
                    } else {
                        i14 = 0;
                        f15 = 0;
                    }
                    h4.r rVarC10 = c2.l.C(u2Var2.a(aVar10, 1.0f, true), f15, 0.0f, i14, 0.0f, 10);
                    zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar3, i14);
                    iHashCode = Long.hashCode(mVar3.getU());
                    i2VarX = mVar3.x();
                    rVarC = h4.k.c(rVarC10, mVar3);
                    if (mVar3.F() != null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar12);
                    } else {
                        mVar3.c();
                    }
                    b4.c(eVar6, zVarA, mVar3);
                    b4.c(c1623g, i2VarX, mVar3);
                    if (mVar3.getT()) {
                        v.h.z(iHashCode, mVar3, iHashCode, bVar4);
                    } else {
                        v.h.z(iHashCode, mVar3, iHashCode, bVar4);
                    }
                    b4.c(fVar, rVarC, mVar3);
                    c2.b0 b0Var4 = c2.b0.f22601a;
                    c2.j.c cVar2 = c2.j.f22696f;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.t0.a(null, c2.j.i(j92.b.f97899b.f97918c), cVar2, null, 0, 0, z3.f.c(-1438176424, new f21.v(str7, str8, str9, 2), mVar3), mVar3, 1573248, 57);
                    mVar3.C(-165151744);
                    ub1.f.c(str5, str, mVar3, 0);
                    mVar3.f();
                    mVar3.y();
                    mVar3.C(-370435994);
                    mVar3.f();
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 5:
                x3 x3Var = (x3) obj8;
                e23.a aVar13 = (e23.a) obj4;
                lc.y yVar = (lc.y) obj7;
                uc1.f fVar2 = (uc1.f) obj6;
                fg0.k kVar3 = (fg0.k) obj5;
                e23.a aVar14 = (e23.a) obj3;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    z02.d.a(((uc1.e) x3Var.getF182175a()).f169980a.getF182175a().booleanValue(), z3.f.c(-490954643, new ih0.q(i18, aVar13, yVar), mVar4), null, null, null, z3.f.c(-1862489879, new tb0.h(fVar2, i16, kVar3, aVar14), mVar4), mVar4, 196656, 28);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 6:
                o53.b0 b0Var5 = (o53.b0) obj8;
                mc mcVar = (mc) obj7;
                e23.a aVar15 = (e23.a) obj4;
                e23.a aVar16 = (e23.a) obj6;
                p1 p1Var = (p1) obj5;
                p1 p1Var2 = (p1) obj3;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarB5 = a2.b(c2.l.C(rVarF, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), a2.a(mVar5), true);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar4 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA4 = c2.y.a(kVar4, h4.d.a.f81536n, mVar5, 0);
                    int iHashCode5 = Long.hashCode(mVar5.getU());
                    i2 i2VarX5 = mVar5.x();
                    h4.r rVarC11 = h4.k.c(rVarB5, mVar5);
                    h5.g.V.getClass();
                    h5.e0.a aVar17 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar17);
                    } else {
                        mVar5.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA4, mVar5);
                    b4.c(h5.g.a.f81809f, i2VarX5, mVar5);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar5, iHashCode5, bVar5);
                    }
                    b4.c(h5.g.a.f81807d, rVarC11, mVar5);
                    c2.b0 b0Var6 = c2.b0.f22601a;
                    ue0.k kVar5 = (ue0.k) p1Var.getF182175a();
                    List<ue0.l> listC2 = kVar5 != null ? kVar5.c() : null;
                    if (listC2 == null || listC2.isEmpty()) {
                        mVar5.C(479298829);
                        mVar5.f();
                    } else {
                        mVar5.C(478750098);
                        String strQ4 = gl1.y.Q(mVar5, R.string.lbl_child_accounts);
                        ue0.k kVar6 = (ue0.k) p1Var.getF182175a();
                        List listN0 = (kVar6 == null || (listC = kVar6.c()) == null) ? null : p13.h0.N0(listC, new ug0.k());
                        if (listN0 == null) {
                            listN0 = p13.j0.f134944a;
                        }
                        i53.c cVarE = i53.a.e(listN0);
                        Object objQ6 = mVar5.q();
                        aVar.getClass();
                        p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                        if (objQ6 == c2565a) {
                            objQ6 = new sk0.n(p1Var2, 20);
                            mVar5.K(objQ6);
                        }
                        e23.l lVar5 = (e23.l) objQ6;
                        boolean zR4 = mVar5.r(b0Var5) | mVar5.B(mcVar) | mVar5.B(aVar15);
                        Object objQ7 = mVar5.q();
                        if (zR4 || objQ7 == c2565a) {
                            objQ7 = new eu.b(b0Var5, aVar15, mcVar, i16);
                            mVar5.K(objQ7);
                        }
                        ug0.l.a(strQ4, cVarE, lVar5, (e23.a) objQ7, mVar5, (ue0.l.f170195n << 3) | 384);
                        mVar5.f();
                    }
                    ue0.k kVar7 = (ue0.k) p1Var.getF182175a();
                    List<ue0.l> listB = kVar7 != null ? kVar7.b() : null;
                    if (listB == null || listB.isEmpty()) {
                        mVar5.C(479906925);
                        mVar5.f();
                    } else {
                        mVar5.C(479392790);
                        String strQ5 = gl1.y.Q(mVar5, R.string.authorized_viewers);
                        ue0.k kVar8 = (ue0.k) p1Var.getF182175a();
                        List<ue0.l> listB2 = kVar8 != null ? kVar8.b() : null;
                        if (listB2 == null) {
                            listB2 = p13.j0.f134944a;
                        }
                        i53.c cVarE2 = i53.a.e(listB2);
                        Object objQ8 = mVar5.q();
                        aVar.getClass();
                        p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                        if (objQ8 == c2565a2) {
                            objQ8 = new sk0.n(p1Var2, 21);
                            mVar5.K(objQ8);
                        }
                        e23.l lVar6 = (e23.l) objQ8;
                        boolean zR5 = mVar5.r(b0Var5) | mVar5.B(mcVar) | mVar5.B(aVar16);
                        Object objQ9 = mVar5.q();
                        if (zR5 || objQ9 == c2565a2) {
                            objQ9 = new eu.b(b0Var5, aVar16, mcVar, 14);
                            mVar5.K(objQ9);
                        }
                        ug0.l.a(strQ5, cVarE2, lVar6, (e23.a) objQ9, mVar5, (ue0.l.f170195n << 3) | 384);
                        mVar5.f();
                    }
                    mVar5.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 7:
                return a(obj, obj2);
            case 8:
                return b(obj, obj2);
            case 9:
                ((Integer) obj2).getClass();
                w51.o0.j((w51.q0) obj8, (e23.a) obj4, (e23.q) obj7, (e23.p) obj6, (e23.a) obj5, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                w51.b1.a((String) obj7, (b63.u) obj8, (b63.u) obj6, (b63.u) obj5, (e23.a) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(24577));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                wb1.j.a((h4.r) obj8, (Map) obj7, (List) obj6, (Map) obj5, (e23.l) obj3, (e23.l) obj4, (p3.m) obj, p3.p0.t(24577));
                return Unit.INSTANCE;
            case 12:
                n82.f fVar3 = (n82.f) obj8;
                yd1.a aVar18 = (yd1.a) obj7;
                wn0.l lVar7 = (wn0.l) obj6;
                nk0.l lVar8 = (nk0.l) obj5;
                nk0.l lVar9 = (nk0.l) obj4;
                nk0.l lVar10 = (nk0.l) obj3;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    h4.r.a aVar19 = h4.r.S;
                    h4.r rVarE = u1.n.e(x2.d(aVar19, 1.0f), vb.h.e(d92.b.f58623a, mVar6), m1.f128891a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar9 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA5 = c2.y.a(kVar9, h4.d.a.f81536n, mVar6, 0);
                    int iHashCode6 = Long.hashCode(mVar6.getU());
                    i2 i2VarX6 = mVar6.x();
                    h4.r rVarC12 = h4.k.c(rVarE, mVar6);
                    h5.g.V.getClass();
                    h5.e0.a aVar20 = h5.g.a.f81805b;
                    if (mVar6.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar20);
                    } else {
                        mVar6.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA5, mVar6);
                    b4.c(h5.g.a.f81809f, i2VarX6, mVar6);
                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                    if (mVar6.getT() || !p005kotlin.jvm.internal.s.g(mVar6.q(), Integer.valueOf(iHashCode6))) {
                        v.h.z(iHashCode6, mVar6, iHashCode6, bVar6);
                    }
                    b4.c(h5.g.a.f81807d, rVarC12, mVar6);
                    c2.b0 b0Var7 = c2.b0.f22601a;
                    q82.a.a(x2.f(aVar19, 1.0f), new n82.n(fVar3, aVar18), null, mVar6, 6, 4);
                    n82.c.a(b0Var7.a(aVar19, 1.0f, true), fVar3, 3, false, z3.f.c(1170282218, new qw.b(lVar7, lVar8, lVar9, lVar10, 14), mVar6), mVar6, 24960, 8);
                    mVar6.y();
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 13:
                return c(obj, obj2);
            case 14:
                return d(obj, obj2);
            case 15:
                return e(obj, obj2);
            case 16:
                return f(obj, obj2);
            case 17:
                return g(obj, obj2);
            case 18:
                return h(obj, obj2);
            case 19:
                return i(obj, obj2);
            case 20:
                return j(obj, obj2);
            case 21:
                return k(obj, obj2);
            case 22:
                return l(obj, obj2);
            case 23:
                return n(obj, obj2);
            case 24:
                return o(obj, obj2);
            case 25:
                return q(obj, obj2);
            case 26:
                return r(obj, obj2);
            default:
                p1 p1Var3 = (p1) obj8;
                p1 p1Var4 = (p1) obj7;
                p1 p1Var5 = (p1) obj6;
                p1 p1Var6 = (p1) obj5;
                p1 p1Var7 = (p1) obj4;
                n02.g gVar = (n02.g) obj3;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    h4.r rVarD3 = x2.d(h4.r.S, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar21 = h4.d.a.f81537o;
                    c2.j jVar = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f17 = j92.b.f97899b.f97917b;
                    jVar.getClass();
                    c2.z zVarA6 = c2.y.a(c2.j.i(f17), aVar21, mVar7, 48);
                    int iHashCode7 = Long.hashCode(mVar7.getU());
                    i2 i2VarX7 = mVar7.x();
                    h4.r rVarC13 = h4.k.c(rVarD3, mVar7);
                    h5.g.V.getClass();
                    h5.e0.a aVar22 = h5.g.a.f81805b;
                    if (mVar7.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar22);
                    } else {
                        mVar7.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA6, mVar7);
                    b4.c(h5.g.a.f81809f, i2VarX7, mVar7);
                    h5.g.a.b bVar7 = h5.g.a.f81813j;
                    if (mVar7.getT() || !p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode7))) {
                        v.h.z(iHashCode7, mVar7, iHashCode7, bVar7);
                    }
                    b4.c(h5.g.a.f81807d, rVarC13, mVar7);
                    c2.b0 b0Var8 = c2.b0.f22601a;
                    mVar7.C(2030901978);
                    for (t41.f fVar4 : t41.f.f162289j) {
                        String str10 = (String) p1Var5.getF182175a();
                        String strName = fVar4.name();
                        int i24 = fVar4.f162290a;
                        boolean zG = p005kotlin.jvm.internal.s.g(str10, strName);
                        if (zG && fVar4 == t41.f.OTHER) {
                            mVar7.C(-1756767664);
                            p2 p2Var = p2.f111205a;
                            String strQ6 = gl1.y.Q(mVar7, i24);
                            String str11 = (String) p1Var7.getF182175a();
                            z41.c.f202336a.getClass();
                            z3.e eVar7 = z41.c.f202338c;
                            boolean zB3 = mVar7.B(p1Var6);
                            Object objQ10 = mVar7.q();
                            if (zB3) {
                                objQ10 = new yg2.l0(p1Var6, 24);
                                mVar7.K(objQ10);
                            } else {
                                aVar.getClass();
                                if (objQ10 == p3.m.a.f135155b) {
                                    objQ10 = new yg2.l0(p1Var6, 24);
                                    mVar7.K(objQ10);
                                }
                            }
                            p2Var.h(strQ6, str11, null, null, null, false, true, null, eVar7, null, (e23.a) objQ10, mVar7, 102236160, 0, Constants.FROZEN_FRAME_TIME);
                            mVar7.f();
                        } else {
                            mVar7.C(-1755944521);
                            p2 p2Var2 = p2.f111205a;
                            String strQ7 = gl1.y.Q(mVar7, i24);
                            if (zG) {
                                z41.c.f202336a.getClass();
                                eVar2 = z41.c.f202339d;
                            } else {
                                eVar2 = null;
                            }
                            boolean zK = mVar7.k(fVar4.ordinal()) | mVar7.B(p1Var6) | mVar7.B(p1Var5);
                            Object objQ11 = mVar7.q();
                            if (zK) {
                                objQ11 = new x72.k(fVar4, 12, p1Var6, p1Var5);
                                mVar7.K(objQ11);
                            } else {
                                aVar.getClass();
                                if (objQ11 == p3.m.a.f135155b) {
                                    objQ11 = new x72.k(fVar4, 12, p1Var6, p1Var5);
                                    mVar7.K(objQ11);
                                }
                            }
                            p2Var2.g(strQ7, null, null, null, eVar2, false, zG, (e23.a) objQ11, mVar7, 0, 174);
                            mVar7.f();
                        }
                    }
                    mVar7.f();
                    mVar7.y();
                    if (((Boolean) p1Var6.getF182175a()).booleanValue()) {
                        mVar7.C(2044601779);
                        Object objQ12 = mVar7.q();
                        aVar.getClass();
                        p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
                        if (objQ12 == c2565a3) {
                            n02.g gVar2 = n02.g.KILOMETERS;
                            t41.c.f162274a.getClass();
                            objQ12 = new n02.f(gVar, ((Number) p1Var3.getF182175a()).doubleValue(), i53.a.b(new o13.p(gVar2, t41.c.f162275b), new o13.p(n02.g.MILES, t41.c.f162276c)), 0, false, 24, null);
                            mVar7.K(objQ12);
                        }
                        n02.f.f122169f.getClass();
                        p1 p1VarA = n02.f.a.a((n02.f) objQ12, mVar7);
                        n02.f fVar5 = (n02.f) p1VarA.getF182175a();
                        boolean zB4 = mVar7.B(p1VarA);
                        Object objQ13 = mVar7.q();
                        if (zB4 || objQ13 == c2565a3) {
                            objQ13 = new xq1.c(p1VarA, i17);
                            mVar7.K(objQ13);
                        }
                        e23.l lVar11 = (e23.l) objQ13;
                        boolean zB5 = mVar7.B(p1Var3) | mVar7.B(p1VarA) | mVar7.B(p1Var4) | mVar7.B(p1Var5) | mVar7.B(p1Var6);
                        Object objQ14 = mVar7.q();
                        if (zB5 || objQ14 == c2565a3) {
                            objQ14 = new p50.d(p1VarA, (Object) p1Var3, (Object) p1Var4, p1Var5, p1Var6, 20);
                            mVar7.K(objQ14);
                        }
                        e23.a aVar23 = (e23.a) objQ14;
                        boolean zB6 = mVar7.B(p1Var6);
                        Object objQ15 = mVar7.q();
                        if (zB6 || objQ15 == c2565a3) {
                            objQ15 = new yg2.l0(p1Var6, 25);
                            mVar7.K(objQ15);
                        }
                        n02.b.a(fVar5, lVar11, false, aVar23, (e23.a) objQ15, mVar7, 0);
                        mVar7.f();
                    } else {
                        mVar7.C(2045692514);
                        mVar7.f();
                    }
                    x1 x1Var8 = p3.n.f135158a;
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g0(int i14, e23.a aVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f163326a = i14;
        this.f163330e = obj;
        this.f163329d = aVar;
        this.f163327b = obj2;
        this.f163331f = obj3;
        this.f163332g = obj4;
        this.f163328c = obj5;
    }

    public /* synthetic */ g0(AddTIEventViewModel addTIEventViewModel, e23.l lVar, p1 p1Var, p1 p1Var2, p1 p1Var3, p1 p1Var4) {
        this.f163326a = 23;
        this.f163330e = addTIEventViewModel;
        this.f163328c = lVar;
        this.f163327b = p1Var;
        this.f163331f = p1Var2;
        this.f163332g = p1Var3;
        this.f163329d = p1Var4;
    }

    public /* synthetic */ g0(e23.a aVar, i53.f fVar, i53.f fVar2, e23.l lVar, yq0.b bVar, Context context) {
        this.f163326a = 21;
        this.f163329d = aVar;
        this.f163330e = fVar;
        this.f163327b = fVar2;
        this.f163328c = lVar;
        this.f163331f = bVar;
        this.f163332g = context;
    }

    public /* synthetic */ g0(mc mcVar, o53.b0 b0Var, nr.x xVar, String str, String str2, e23.p pVar, int i14) {
        this.f163326a = 22;
        this.f163330e = mcVar;
        this.f163331f = b0Var;
        this.f163332g = xVar;
        this.f163327b = str;
        this.f163329d = str2;
        this.f163328c = pVar;
    }

    public /* synthetic */ g0(i53.c cVar, mx1.c cVar2, e23.l lVar, e23.a aVar, e23.a aVar2, e23.a aVar3, int i14) {
        this.f163326a = 13;
        this.f163330e = cVar;
        this.f163327b = cVar2;
        this.f163328c = lVar;
        this.f163329d = aVar;
        this.f163331f = aVar2;
        this.f163332g = aVar3;
    }

    public /* synthetic */ g0(Object obj, Object obj2, e23.l lVar, e23.l lVar2, o13.h hVar, e23.l lVar3, int i14, int i15) {
        this.f163326a = i15;
        this.f163330e = obj;
        this.f163327b = obj2;
        this.f163328c = lVar;
        this.f163331f = lVar2;
        this.f163332g = hVar;
        this.f163329d = lVar3;
    }

    public /* synthetic */ g0(Object obj, Object obj2, Object obj3, Object obj4, e23.l lVar, e23.l lVar2, int i14, int i15) {
        this.f163326a = i15;
        this.f163330e = obj;
        this.f163327b = obj2;
        this.f163331f = obj3;
        this.f163332g = obj4;
        this.f163328c = lVar;
        this.f163329d = lVar2;
    }

    public /* synthetic */ g0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i14) {
        this.f163326a = i14;
        this.f163330e = obj;
        this.f163327b = obj2;
        this.f163331f = obj3;
        this.f163332g = obj4;
        this.f163329d = obj5;
        this.f163328c = obj6;
    }

    public /* synthetic */ g0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i14, int i15) {
        this.f163326a = i15;
        this.f163330e = obj;
        this.f163327b = obj2;
        this.f163331f = obj3;
        this.f163332g = obj4;
        this.f163329d = obj5;
        this.f163328c = obj6;
    }

    public /* synthetic */ g0(String str, b63.u uVar, b63.u uVar2, b63.u uVar3, e23.a aVar, e23.l lVar, int i14) {
        this.f163326a = 10;
        this.f163327b = str;
        this.f163330e = uVar;
        this.f163331f = uVar2;
        this.f163332g = uVar3;
        this.f163329d = aVar;
        this.f163328c = lVar;
    }

    public /* synthetic */ g0(String str, zb0.l lVar, e23.l lVar2, List list, e23.l lVar3, e23.a aVar) {
        this.f163326a = 2;
        this.f163327b = str;
        this.f163330e = lVar;
        this.f163328c = lVar2;
        this.f163331f = list;
        this.f163332g = lVar3;
        this.f163329d = aVar;
    }

    public /* synthetic */ g0(o53.b0 b0Var, mc mcVar, e23.a aVar, e23.a aVar2, p1 p1Var, p1 p1Var2) {
        this.f163326a = 6;
        this.f163330e = b0Var;
        this.f163327b = mcVar;
        this.f163329d = aVar;
        this.f163331f = aVar2;
        this.f163332g = p1Var;
        this.f163328c = p1Var2;
    }

    public /* synthetic */ g0(o90.a aVar, String str, ArrayList arrayList, e23.l lVar, String str2, e23.a aVar2) {
        this.f163326a = 1;
        this.f163330e = aVar;
        this.f163327b = str;
        this.f163331f = arrayList;
        this.f163328c = lVar;
        this.f163332g = str2;
        this.f163329d = aVar2;
    }

    public /* synthetic */ g0(ub0.l lVar, tb0.x xVar, String str, e23.a aVar, e23.l lVar2, e23.l lVar3, int i14) {
        this.f163326a = 3;
        this.f163330e = lVar;
        this.f163331f = xVar;
        this.f163327b = str;
        this.f163329d = aVar;
        this.f163328c = lVar2;
        this.f163332g = lVar3;
    }

    public /* synthetic */ g0(vd0.x0 x0Var, Uri uri, String str, p1 p1Var, ug2.k kVar, e23.a aVar) {
        this.f163326a = 8;
        this.f163330e = x0Var;
        this.f163331f = uri;
        this.f163327b = str;
        this.f163332g = p1Var;
        this.f163328c = kVar;
        this.f163329d = aVar;
    }

    public /* synthetic */ g0(w51.q0 q0Var, e23.a aVar, e23.q qVar, e23.p pVar, e23.a aVar2, e23.a aVar3, int i14) {
        this.f163326a = 9;
        this.f163330e = q0Var;
        this.f163329d = aVar;
        this.f163327b = qVar;
        this.f163331f = pVar;
        this.f163332g = aVar2;
        this.f163328c = aVar3;
    }
}
