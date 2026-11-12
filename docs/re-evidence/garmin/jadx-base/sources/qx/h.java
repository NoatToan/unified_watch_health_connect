package qx;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import gs1.i;
import gs1.t;
import h4.k;
import h4.r;
import h5.e0;
import i3.e5;
import i3.mh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import o4.m1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;
import u1.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            hx.b event = ((bx.b) t14).getEvent();
            String eventStartTimeGmt = event != null ? event.getEventStartTimeGmt() : null;
            hx.b event2 = ((bx.b) t7).getEvent();
            return r13.a.b(eventStartTimeGmt, event2 != null ? event2.getEventStartTimeGmt() : null);
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f148400a;

        static {
            int[] iArr = new int[hx.c.values().length];
            try {
                iArr[hx.c.ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hx.c.STRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[hx.c.RECOVERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[hx.c.NAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[hx.c.SLEEP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f148400a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0302  */
    /* JADX WARN: Code duplicated, block: B:85:0x0224  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r28v0 */
    public static final void a(bx.a aVar, l<? super bx.b, Unit> lVar, m mVar, int i14) {
        ?? arrayList;
        Integer num;
        Integer numValueOf;
        i currentDayDailySleepDTO;
        i.b payload;
        Integer sleepTimeSeconds;
        List<bx.b> list;
        lVar.getClass();
        o0 o0VarE = mVar.E(1752139157);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            rx.a aVar2 = new rx.a(context);
            if (aVar == null || (list = aVar.f21604c) == null) {
                arrayList = j0.f134944a;
            } else {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    hx.b event = ((bx.b) obj).getEvent();
                    if ((event != null ? event.b() : null) != null) {
                        arrayList.add(obj);
                    }
                }
            }
            ?? r28 = arrayList;
            boolean zIsEmpty = ((Collection) r28).isEmpty();
            t tVar = aVar != null ? aVar.f21603b : null;
            oi0.h hVar = new oi0.h(context);
            if (zIsEmpty) {
                o0VarE.C(1242836653);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1240637885);
                r.a aVar3 = r.S;
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                r rVarE = u1.n.e(c2.l.C(aVar3, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), d92.b.a(o0VarE).c().b(), m1.f128891a);
                bVar.getClass();
                r rVarA = c2.l.A(rVarE, eVar.f97920e, 0.0f, 2);
                j.f22691a.getClass();
                j.k kVar = j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                x1 x1Var2 = n.f135158a;
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                r rVarC = k.c(rVarA, o0VarE);
                h5.g.V.getClass();
                e0.a aVar4 = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                String strQ = gl1.y.Q(o0VarE, R.string.tr_factors);
                d92.b.f58624b.getClass();
                x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
                bVar.getClass();
                float f14 = eVar.f97918c;
                bVar.getClass();
                oi0.h hVar2 = hVar;
                rx.a aVar5 = aVar2;
                mh.c(strQ, c2.l.C(aVar3, 0.0f, f14, 0.0f, eVar.f97920e, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.C(-694255767);
                for (bx.b bVar3 : h0.N0((Iterable) r28, new a())) {
                    hx.b event2 = bVar3.getEvent();
                    Integer bodyBatteryImpact = event2 != null ? event2.getBodyBatteryImpact() : null;
                    hx.b event3 = bVar3.getEvent();
                    Integer numF = event3 != null ? event3.f() : null;
                    hx.c cVarB = event3 != null ? event3.b() : null;
                    if ((cVarB == null ? -1 : b.f148400a[cVarB.ordinal()]) != 5 || tVar == null || (currentDayDailySleepDTO = tVar.getCurrentDayDailySleepDTO()) == null || (payload = currentDayDailySleepDTO.getPayload()) == null || (sleepTimeSeconds = payload.getSleepTimeSeconds()) == null) {
                        num = numF;
                    } else {
                        if (!(sleepTimeSeconds.intValue() > 0)) {
                            sleepTimeSeconds = null;
                        }
                        if (sleepTimeSeconds == null) {
                            num = numF;
                        } else {
                            num = sleepTimeSeconds;
                        }
                    }
                    hx.b event4 = bVar3.getEvent();
                    boolean zO = event4 != null ? event4.o() : false;
                    hx.b event5 = bVar3.getEvent();
                    Integer bodyBatteryImpact2 = event5 != null ? event5.getBodyBatteryImpact() : null;
                    hx.b event6 = bVar3.getEvent();
                    hx.c cVarB2 = event6 != null ? event6.b() : null;
                    String strD = (((bodyBatteryImpact2 == null || bodyBatteryImpact2.intValue() <= 0) && (cVarB2 == hx.c.NAP || cVarB2 == hx.c.RECOVERY)) || ((bodyBatteryImpact2 == null || bodyBatteryImpact2.intValue() >= 0) && (cVarB2 == hx.c.STRESS))) ? null : aVar5.d(bodyBatteryImpact2);
                    if (strD == null || bodyBatteryImpact == null) {
                        numValueOf = null;
                    } else {
                        int iIntValue = bodyBatteryImpact.intValue();
                        numValueOf = Integer.valueOf(iIntValue > 0 ? 2131232769 : iIntValue < 0 ? 2131232767 : 2131232768);
                    }
                    rx.a aVar6 = aVar5;
                    oi0.h hVar3 = hVar2;
                    z3.e eVarC = z3.f.c(1168551435, new d62.f(aVar6, bVar3, num, zO, hVar3), o0VarE);
                    z3.e eVarC2 = z3.f.c(-1034886324, new g(numValueOf, 0, strD), o0VarE);
                    r.a aVar7 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarF = x2.f(c2.l.C(aVar7, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97918c, 7), 1.0f);
                    boolean zR = o0VarE.r(bVar3) | ((i15 & 112) == 32);
                    Object objQ = o0VarE.q();
                    if (zR) {
                        objQ = new qn0.f(12, lVar, bVar3);
                        o0VarE.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new qn0.f(12, lVar, bVar3);
                            o0VarE.K(objQ);
                        }
                    }
                    l72.l.c(eVarC, eVarC2, rVarF, null, false, (e23.a) objQ, o0VarE, 54, 24);
                    hVar2 = hVar3;
                    aVar5 = aVar6;
                }
                e5.u(o0VarE, false, true, false);
            }
            x1 x1Var3 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q72.f(aVar, lVar, i14, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public static final void b(int i14, Integer num, String str, m mVar) {
        o0 o0Var;
        ?? r14;
        boolean z14;
        o0 o0Var2;
        o0 o0Var3;
        o0 o0VarE = mVar.E(926083568);
        int i15 = i14 | (o0VarE.B(num) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            r.a aVar = r.S;
            r rVarF = x2.f(aVar, 1.0f);
            j.f22691a.getClass();
            s2 s2VarA = q2.a(j.f22693c, bVar, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            if (str == null) {
                o0VarE.C(-1923384357);
                o0VarE.g0(false);
                r14 = 0;
                z14 = true;
            } else {
                o0VarE.C(-1923384356);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarC2 = c2.l.C(aVar, 0.0f, 0.0f, j92.b.f97899b.f97920e, 0.0f, 11);
                d92.b.f58624b.getClass();
                r14 = 0;
                z14 = true;
                mh.c(str, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131068);
                o0Var2.g0(false);
            }
            if (num == null) {
                o0Var2 = o0VarE;
                o0Var3 = o0Var2;
                o0Var3 = o0VarE;
                o0Var3.C(-1923142402);
                o0Var3.g0(r14);
            } else {
                o0Var2 = o0VarE;
                o0Var3 = o0Var2;
                o0Var3 = o0VarE;
                o0Var3.C(-1923142401);
                t4.d dVarA = n5.c.a(num.intValue(), o0Var3, r14);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                y0.a(dVarA, null, c2.l.C(aVar, 0.0f, 0.0f, j92.b.f97899b.f97920e, 0.0f, 11), null, null, 0.0f, null, o0Var3, 48, 120);
                o0Var3.g0(r14);
            }
            o0Var3.g0(z14);
            o0Var = o0Var3;
        } else {
            o0VarE.e();
            o0Var = o0VarE;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q72.f(num, str, i14, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:47:0x0118  */
    /* JADX WARN: Code duplicated, block: B:50:0x0195  */
    /* JADX WARN: Code duplicated, block: B:52:0x01be  */
    /* JADX WARN: Code duplicated, block: B:55:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:56:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:59:0x0203  */
    /* JADX WARN: Code duplicated, block: B:60:0x0205  */
    /* JADX WARN: Code duplicated, block: B:63:0x020d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0217  */
    /* JADX WARN: Code duplicated, block: B:67:0x021a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0258  */
    public static final void c(int i14, b92.a aVar, String str, String str2, m mVar, boolean z14) {
        p3.c<?> cVar;
        h5.g.a.f fVar;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objQ;
        String str3;
        o0 o0VarE = mVar.E(350561476);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.B(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            j.f22691a.getClass();
            j.f fVar2 = j.f22699i;
            r.a aVar2 = r.S;
            r rVarA = c2.l.A(aVar2, 0.0f, f14, 1);
            h4.d.f81522a.getClass();
            z zVarA = y.a(fVar2, h4.d.a.f81536n, o0VarE, 6);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                b0 b0Var = b0.f22601a;
                h4.g.b bVar3 = h4.d.a.f81534l;
                r rVarF = x2.f(aVar2, 1.0f);
                s2VarA = q2.a(j.f22692b, bVar3, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarF, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                u2 u2Var = u2.f22900a;
                j92.f fVar3 = d92.b.f58624b;
                fVar3.getClass();
                x0 x0VarE = d92.c.e(d92.c.b(j92.f.f97932i, o0VarE));
                r rVarA2 = u2Var.a(aVar2, 1.0f, false);
                bVar.getClass();
                float f15 = eVar.f97920e;
                bVar.getClass();
                mh.c(str, c2.l.C(rVarA2, f15, 0.0f, eVar.f97918c, 0.0f, 10), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE, o0VarE, i15 & 14, 0, 131068);
                if (z14) {
                    o0VarE.C(812677485);
                    t4.d dVarA = n5.c.a(R.drawable.ic_round_info, o0VarE, 0);
                    bVar.getClass();
                    y0.a(dVarA, null, x2.q(aVar2, j92.b.f97901d.f97903b), null, null, 0.0f, null, o0VarE, 48, 120);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(812903320);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                fVar3.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
                bVar.getClass();
                r rVarC3 = c2.l.C(aVar2, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13);
                bVar.getClass();
                r rVarA3 = c2.l.A(rVarC3, eVar.f97920e, 0.0f, 2);
                if ((i15 & 7168) != 2048) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                if ((i15 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z16 | z15;
                objQ = o0VarE.q();
                if (z17) {
                    str3 = str2;
                    objQ = new i70.a(aVar, str3, 9);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        str3 = str2;
                        objQ = new i70.a(aVar, str3, 9);
                        o0VarE.K(objQ);
                    } else {
                        str3 = str2;
                    }
                }
                mh.c(str3, v.c((l) objQ, rVarA3, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, (i15 >> 3) & 14, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(true);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var2 = b0.f22601a;
            h4.g.b bVar4 = h4.d.a.f81534l;
            r rVarF2 = x2.f(aVar2, 1.0f);
            s2VarA = q2.a(j.f22692b, bVar4, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarF2, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var2 = u2.f22900a;
            j92.f fVar4 = d92.b.f58624b;
            fVar4.getClass();
            x0 x0VarE2 = d92.c.e(d92.c.b(j92.f.f97932i, o0VarE));
            r rVarA4 = u2Var2.a(aVar2, 1.0f, false);
            bVar.getClass();
            float f16 = eVar.f97920e;
            bVar.getClass();
            mh.c(str, c2.l.C(rVarA4, f16, 0.0f, eVar.f97918c, 0.0f, 10), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE2, o0VarE, i15 & 14, 0, 131068);
            if (z14) {
                o0VarE.C(812677485);
                t4.d dVarA2 = n5.c.a(R.drawable.ic_round_info, o0VarE, 0);
                bVar.getClass();
                y0.a(dVarA2, null, x2.q(aVar2, j92.b.f97901d.f97903b), null, null, 0.0f, null, o0VarE, 48, 120);
                o0VarE.g0(false);
            } else {
                o0VarE.C(812903320);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            fVar4.getClass();
            x0 x0VarF2 = d92.c.f(j92.f.f97933j, o0VarE);
            bVar.getClass();
            r rVarC4 = c2.l.C(aVar2, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13);
            bVar.getClass();
            r rVarA5 = c2.l.A(rVarC4, eVar.f97920e, 0.0f, 2);
            if ((i15 & 7168) != 2048) {
                z15 = false;
            } else {
                z15 = true;
            }
            if ((i15 & 112) == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = z16 | z15;
            objQ = o0VarE.q();
            if (z17) {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    str3 = str2;
                    objQ = new i70.a(aVar, str3, 9);
                    o0VarE.K(objQ);
                } else {
                    str3 = str2;
                }
            } else {
                str3 = str2;
                objQ = new i70.a(aVar, str3, 9);
                o0VarE.K(objQ);
            }
            mh.c(str3, v.c((l) objQ, rVarA5, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, o0VarE, (i15 >> 3) & 14, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l72.a(str, str2, z14, aVar, i14);
        }
    }
}
