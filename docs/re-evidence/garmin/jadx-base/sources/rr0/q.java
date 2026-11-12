package rr0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c42.e0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart.wrapper.BaseLineChart;
import cw1.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l72.x0;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p13.g0;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class q {
    /* JADX WARN: Code duplicated, block: B:54:0x015b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r14v0, types: [p3.m, p3.o0] */
    public static final void a(List<ir0.f> list, e23.l<? super DateTime, Unit> lVar, p3.m mVar, int i14) {
        List<ir0.f> list2;
        e0 e0Var;
        p2 p2VarI0;
        boolean z14;
        int i15;
        Object obj;
        ?? E = mVar.E(-497748718);
        int i16 = 32;
        int i17 = (E.r(list) ? 4 : 2) | i14 | (E.r(lVar) ? 32 : 16);
        boolean z15 = false;
        int i18 = 1;
        if (E.n(i17 & 1, (i17 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            if (list == null || list.isEmpty()) {
                p2VarI0 = E.i0();
                if (p2VarI0 == null) {
                    return;
                } else {
                    e0Var = new e0(lVar, i14, 19, list);
                }
            } else {
                x00.a aVar = new x00.a((Context) E.A(AndroidCompositionLocals_androidKt.f6042b));
                h4.r rVarE = u1.n.e(h4.r.S, vb.h.f(d92.b.f58623a, E), m1.f128891a);
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                float f15 = eVar.f97920e;
                bVar.getClass();
                float f16 = eVar.f97918c;
                bVar.getClass();
                bVar.getClass();
                h4.r rVarB = c2.l.B(rVarE, f14, f16, f15, f15);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, E, 0);
                int iHashCode = Long.hashCode(E.U);
                i2 i2VarA0 = E.a0();
                h4.r rVarC = h4.k.c(rVarB, E);
                h5.g.V.getClass();
                h5.e0.a aVar2 = h5.g.a.f81805b;
                if (E.f135177b == null) {
                    p0.l();
                    throw null;
                }
                E.z();
                if (E.T) {
                    E.M(aVar2);
                } else {
                    E.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, E);
                b4.c(h5.g.a.f81809f, i2VarA0, E);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (E.T || !p005kotlin.jvm.internal.s.g(E.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, E, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, E);
                b0 b0Var = b0.f22601a;
                E.C(2044051010);
                for (ir0.f fVar : list) {
                    LocalDate localDateB = fVar.b();
                    DateTime dateTimeAtStartOfDay = localDateB != null ? localDateB.toDateTimeAtStartOfDay() : null;
                    if (dateTimeAtStartOfDay != null) {
                        E.C(-751239897);
                        qi0.a aVar3 = qi0.a.WEEKDAY;
                        pi0.e eVar2 = aVar.f188234b;
                        String strA = eVar2.a(dateTimeAtStartOfDay, aVar3);
                        String strA2 = eVar2.a(dateTimeAtStartOfDay, qi0.a.RELATIVE_YEAR_MONTH_DAY);
                        Integer numF = fVar.f();
                        String strD = (numF == null || numF.intValue() < 0) ? aVar.d() : aVar.b(numF);
                        h4.r.a aVar4 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarA = c2.l.A(aVar4, 0.0f, j92.b.f97899b.f97918c, i18);
                        int i19 = ((i17 & 112) == i16 ? i18 : z15) | (E.r(dateTimeAtStartOfDay) ? 1 : 0);
                        Object objQ = E.q();
                        if (i19 == 0) {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                obj = objQ;
                                ci0.e eVar3 = new ci0.e(lVar, dateTimeAtStartOfDay, 7);
                                E.K(eVar3);
                                obj = eVar3;
                            }
                        } else {
                            obj = objQ;
                            ci0.e eVar4 = new ci0.e(lVar, dateTimeAtStartOfDay, 7);
                            E.K(eVar4);
                            obj = eVar4;
                        }
                        obj = objQ;
                        i15 = i18;
                        z14 = z15;
                        l72.l.e(strA, strA2, strD, null, null, null, rVarA, null, false, (e23.a) obj, E, 0, 440);
                        E.g0(z14);
                    } else {
                        z14 = z15;
                        i15 = i18;
                        E.C(-750837238);
                        E.g0(z14);
                    }
                    i18 = i15;
                    z15 = z14;
                    i16 = i16;
                    aVar = aVar;
                    i17 = i17;
                }
                E.g0(z15);
                E.g0(i18);
                x1 x1Var2 = p3.n.f135158a;
                list2 = list;
            }
            p2VarI0.f135219d = e0Var;
        }
        list2 = list;
        E.e();
        p2VarI0 = E.i0();
        if (p2VarI0 != null) {
            e0Var = new e0(lVar, i14, 20, list2);
            p2VarI0.f135219d = e0Var;
        }
    }

    public static final void b(Integer num, Integer num2, Integer num3, boolean z14, boolean z15, p3.m mVar, final int i14, final int i15) {
        final Integer num4;
        int i16;
        Integer num5;
        int i17;
        Integer num6;
        int i18;
        boolean z16;
        int i19;
        boolean z17;
        int i24;
        final Integer num7;
        final Integer num8;
        final boolean z18;
        o0 o0VarE = mVar.E(2032631116);
        int iA = o0VarE.a();
        int i25 = i15 & 1;
        if (i25 != 0) {
            i16 = i14 | 6;
            num4 = num;
        } else {
            num4 = num;
            i16 = i14 | (o0VarE.B(num4) ? 4 : 2);
        }
        int i26 = i15 & 2;
        if (i26 != 0) {
            i17 = i16 | 48;
            num5 = num2;
        } else {
            num5 = num2;
            i17 = i16 | (o0VarE.B(num5) ? 32 : 16);
        }
        int i27 = i15 & 4;
        if (i27 != 0) {
            i18 = i17 | 384;
            num6 = num3;
        } else {
            num6 = num3;
            i18 = i17 | (o0VarE.B(num6) ? 256 : 128);
        }
        int i28 = i15 & 8;
        if (i28 != 0) {
            i19 = i18 | 3072;
            z16 = z14;
        } else {
            z16 = z14;
            i19 = i18 | (o0VarE.h(z16) ? 2048 : 1024);
        }
        int i29 = i15 & 16;
        if (i29 != 0) {
            i24 = i19 | 24576;
            z17 = z15;
        } else {
            z17 = z15;
            i24 = i19 | (o0VarE.h(z17) ? 16384 : 8192);
        }
        if (o0VarE.n(i24 & 1, (i24 & 9363) != 9362)) {
            Integer num9 = i25 != 0 ? null : num4;
            Integer num10 = i26 != 0 ? null : num5;
            if (i27 != 0) {
                num6 = null;
            }
            if (i28 != 0) {
                z16 = false;
            }
            boolean z19 = i29 != 0 ? false : z17;
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarE = u1.n.e(aVar, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            o0VarE.C(1163944147);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            x00.a aVar3 = new x00.a(context);
            String strE = aVar3.e();
            x0 x0Var = x0.f111346a;
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC2 = c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
            final Integer num11 = num9;
            final Integer num12 = num10;
            final boolean z24 = z19;
            z3.e eVarC = z3.f.c(-1740324451, new l72.b(z24, aVar3, num11, strE, context, num12), o0VarE);
            int i30 = (x0.f111348c << 6) | 48;
            x0Var.e(rVarC2, eVarC, o0VarE, i30, 0);
            if (z16) {
                o0VarE.w(iA);
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    final int i34 = 0;
                    final Integer num13 = num6;
                    final boolean z25 = z16;
                    p2VarI0.f135219d = new e23.p(num11, num12, num13, z25, z24, i14, i15, i34) { // from class: rr0.p

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f154234a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ Integer f154235b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ Integer f154236c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ Integer f154237d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ boolean f154238e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ boolean f154239f;

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ int f154240g;

                        {
                            this.f154234a = i34;
                            this.f154240g = i15;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.f154234a) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iT = p0.t(1);
                                    q.b(this.f154235b, this.f154236c, this.f154237d, this.f154238e, this.f154239f, (p3.m) obj, iT, this.f154240g);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iT2 = p0.t(1);
                                    q.b(this.f154235b, this.f154236c, this.f154237d, this.f154238e, this.f154239f, (p3.m) obj, iT2, this.f154240g);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            Integer num14 = num6;
            bVar2.getClass();
            x0Var.e(c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7), z3.f.c(-1622378938, new i(aVar3, num14, strE, context, 1), o0VarE), o0VarE, i30, 0);
            o0VarE.g0(false);
            o0VarE.g0(true);
            num4 = num11;
            num7 = num12;
            num8 = num14;
            z18 = z24;
        } else {
            o0VarE.e();
            num7 = num5;
            num8 = num6;
            z18 = z17;
        }
        final boolean z26 = z16;
        p2 p2VarI1 = o0VarE.i0();
        if (p2VarI1 != null) {
            final int i35 = 1;
            p2VarI1.f135219d = new e23.p(num4, num7, num8, z26, z18, i14, i15, i35) { // from class: rr0.p

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f154234a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Integer f154235b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Integer f154236c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Integer f154237d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f154238e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f154239f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ int f154240g;

                {
                    this.f154234a = i35;
                    this.f154240g = i15;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f154234a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iT = p0.t(1);
                            q.b(this.f154235b, this.f154236c, this.f154237d, this.f154238e, this.f154239f, (p3.m) obj, iT, this.f154240g);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iT2 = p0.t(1);
                            q.b(this.f154235b, this.f154236c, this.f154237d, this.f154238e, this.f154239f, (p3.m) obj, iT2, this.f154240g);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0185  */
    /* JADX WARN: Code duplicated, block: B:112:0x0197  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:118:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:122:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:123:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:129:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:140:0x0206  */
    /* JADX WARN: Code duplicated, block: B:141:0x0209  */
    /* JADX WARN: Code duplicated, block: B:145:0x022f  */
    /* JADX WARN: Code duplicated, block: B:146:0x023b  */
    /* JADX WARN: Code duplicated, block: B:148:0x027a  */
    /* JADX WARN: Code duplicated, block: B:151:0x0287  */
    /* JADX WARN: Code duplicated, block: B:155:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x018b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0084  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x010e  */
    /* JADX WARN: Code duplicated, block: B:88:0x011b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0124  */
    /* JADX WARN: Code duplicated, block: B:92:0x012b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0150  */
    /* JADX WARN: Code duplicated, block: B:99:0x0167  */
    public static final void c(ir0.e eVar, String str, boolean z14, boolean z15, o13.p<String, String> pVar, p3.m mVar, int i14, int i15) {
        String str2;
        int i16;
        boolean z16;
        int i17;
        int i18;
        boolean z17;
        int i19;
        int i24;
        o13.p<String, String> pVar2;
        int i25;
        boolean z18;
        String str3;
        boolean z19;
        boolean z24;
        o13.p<String, String> pVar3;
        p2 p2VarI0;
        boolean z25;
        o13.p<String, String> pVar4;
        Context context;
        Object objQ;
        p3.m.a.C2565a c2565a;
        Object objQ2;
        ArrayList arrayList;
        String strJ;
        List<ir0.f> list;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList2;
        ArrayList arrayList3;
        List<ir0.f> list2;
        hz.d dVar;
        float f14;
        Iterator it;
        Object next;
        ir0.f fVar;
        int i26;
        float f15;
        Integer numD;
        int iIntValue;
        Integer numG;
        int iIntValue2;
        float fY;
        LocalDate localDateB;
        DateTime dateTimeAtStartOfDay;
        LocalDate localDateB2;
        Integer numValueOf;
        Object arrayList4;
        o0 o0VarE = mVar.E(1758570929);
        int i27 = (i14 & 6) == 0 ? ((i14 & 8) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 4 : 2) | i14 : i14;
        int i28 = i15 & 2;
        if (i28 == 0) {
            if ((i14 & 48) == 0) {
                str2 = str;
                i27 |= o0VarE.B(str2) ? 32 : 16;
            }
            i16 = i15 & 4;
            if (i16 != 0) {
                if ((i14 & 384) == 0) {
                    z16 = z14;
                    if (o0VarE.h(z16)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i27 |= i17;
                }
                i18 = i15 & 8;
                if (i18 != 0) {
                    if ((i14 & 3072) == 0) {
                        z17 = z15;
                        if (o0VarE.h(z17)) {
                            i19 = 2048;
                        } else {
                            i19 = 1024;
                        }
                        i27 |= i19;
                    }
                    i24 = i15 & 16;
                    if (i24 != 0) {
                        if ((i14 & 24576) == 0) {
                            pVar2 = pVar;
                            if (o0VarE.B(pVar2)) {
                                i25 = 16384;
                            } else {
                                i25 = 8192;
                            }
                            i27 |= i25;
                        }
                        if ((i27 & 9363) != 9362) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (o0VarE.n(i27 & 1, z18)) {
                            if (i28 != 0) {
                                str2 = null;
                            }
                            if (i16 != 0) {
                                z16 = false;
                            }
                            if (i18 != 0) {
                                z25 = false;
                            } else {
                                z25 = z17;
                            }
                            if (i24 != 0) {
                                pVar4 = null;
                            } else {
                                pVar4 = pVar2;
                            }
                            x1 x1Var = p3.n.f135158a;
                            context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            c2565a = p3.m.a.f135155b;
                            if (objQ == c2565a) {
                                objQ = new BaseLineChart(context);
                                o0VarE.K(objQ);
                            }
                            BaseLineChart baseLineChart = (BaseLineChart) objQ;
                            objQ2 = o0VarE.q();
                            if (objQ2 == c2565a) {
                                objQ2 = new pr0.f(context);
                                o0VarE.K(objQ2);
                            }
                            pr0.f fVar2 = (pr0.f) objQ2;
                            or0.p.a(eVar);
                            arrayList = new ArrayList();
                            if (eVar != null && (list = eVar.f94793a) != null) {
                                g0 g0Var = new g0(list);
                                linkedHashMap = new LinkedHashMap();
                                for (Object obj : g0Var.f134939a) {
                                    localDateB2 = ((ir0.f) obj).b();
                                    if (localDateB2 != null) {
                                        numValueOf = Integer.valueOf(localDateB2.getWeekOfWeekyear());
                                    } else {
                                        numValueOf = null;
                                    }
                                    arrayList4 = linkedHashMap.get(numValueOf);
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                        linkedHashMap.put(numValueOf, arrayList4);
                                    }
                                    ((List) arrayList4).add(obj);
                                }
                                arrayList2 = new ArrayList(linkedHashMap.size());
                                for (Map.Entry entry : linkedHashMap.entrySet()) {
                                    arrayList3 = new ArrayList();
                                    list2 = (List) entry.getValue();
                                    if (!list2.isEmpty() && !list2.isEmpty()) {
                                        for (ir0.f fVar3 : list2) {
                                            if (fVar3.d() == null || fVar3.g() != null) {
                                                f15 = 0.0f;
                                                for (ir0.f fVar4 : list2) {
                                                    numD = fVar4.d();
                                                    if (numD != null) {
                                                        iIntValue = numD.intValue();
                                                    } else {
                                                        iIntValue = 0;
                                                    }
                                                    Integer numValueOf2 = Integer.valueOf(iIntValue);
                                                    numG = fVar4.g();
                                                    if (numG != null) {
                                                        iIntValue2 = numG.intValue();
                                                    } else {
                                                        iIntValue2 = 0;
                                                    }
                                                    fY = f15 + oe2.f.y(numValueOf2, Integer.valueOf(iIntValue2));
                                                    localDateB = fVar4.b();
                                                    if (localDateB != null) {
                                                        dateTimeAtStartOfDay = localDateB.toDateTimeAtStartOfDay();
                                                    } else {
                                                        dateTimeAtStartOfDay = null;
                                                    }
                                                    if (dateTimeAtStartOfDay != null) {
                                                        arrayList3.add(new hz.d(dateTimeAtStartOfDay, fY));
                                                    }
                                                    f15 = fY;
                                                }
                                                break;
                                            }
                                        }
                                    }
                                    dVar = (hz.d) h0.n0(arrayList3);
                                    if (dVar != null) {
                                        f14 = dVar.f86389b;
                                    } else {
                                        f14 = 0.0f;
                                    }
                                    it = list2.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                    } while (((ir0.f) next).f94797b <= 0);
                                    fVar = (ir0.f) next;
                                    if (fVar != null) {
                                        i26 = fVar.f94797b;
                                    } else {
                                        i26 = 150;
                                    }
                                    arrayList2.add(Boolean.valueOf(arrayList.add(new pr0.d(h0.N0(arrayList3, new or0.o()), 0.0f, f14, i26))));
                                }
                            }
                            hz.a aVarA = or0.p.a(eVar);
                            if (str2 == null) {
                                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 2064534017, R.string.common_lbl_daily_totals, o0VarE, false);
                            } else {
                                o0VarE.C(2064533738);
                                o0VarE.g0(false);
                                strJ = str2;
                            }
                            m92.o.a(null, strJ, null, null, z3.f.c(839619889, new oy0.b(baseLineChart, fVar2, context, pVar4, arrayList, aVarA, 15), o0VarE), null, z3.f.c(440113459, new a11.u(eVar, z25, z16, 6), o0VarE), o0VarE, 1597440, 45);
                            x1 x1Var2 = p3.n.f135158a;
                            z24 = z25;
                            str3 = str2;
                            z19 = z16;
                            pVar3 = pVar4;
                        } else {
                            o0VarE.e();
                            str3 = str2;
                            z19 = z16;
                            z24 = z17;
                            pVar3 = pVar2;
                        }
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new v0(eVar, str3, z19, z24, pVar3, i14, i15);
                        }
                    }
                    i27 |= 24576;
                    pVar2 = pVar;
                    if ((i27 & 9363) != 9362) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (o0VarE.n(i27 & 1, z18)) {
                        if (i28 != 0) {
                            str2 = null;
                        }
                        if (i16 != 0) {
                            z16 = false;
                        }
                        if (i18 != 0) {
                            z25 = false;
                        } else {
                            z25 = z17;
                        }
                        if (i24 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar2;
                        }
                        x1 x1Var3 = p3.n.f135158a;
                        context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = new BaseLineChart(context);
                            o0VarE.K(objQ);
                        }
                        BaseLineChart baseLineChart2 = (BaseLineChart) objQ;
                        objQ2 = o0VarE.q();
                        if (objQ2 == c2565a) {
                            objQ2 = new pr0.f(context);
                            o0VarE.K(objQ2);
                        }
                        pr0.f fVar5 = (pr0.f) objQ2;
                        or0.p.a(eVar);
                        arrayList = new ArrayList();
                        if (eVar != null) {
                            g0 g0Var2 = new g0(list);
                            linkedHashMap = new LinkedHashMap();
                            while (r9.hasNext()) {
                                localDateB2 = ((ir0.f) obj).b();
                                if (localDateB2 != null) {
                                    numValueOf = Integer.valueOf(localDateB2.getWeekOfWeekyear());
                                } else {
                                    numValueOf = null;
                                }
                                arrayList4 = linkedHashMap.get(numValueOf);
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                    linkedHashMap.put(numValueOf, arrayList4);
                                }
                                ((List) arrayList4).add(obj);
                            }
                            arrayList2 = new ArrayList(linkedHashMap.size());
                            while (r8.hasNext()) {
                                arrayList3 = new ArrayList();
                                list2 = (List) entry.getValue();
                                if (!list2.isEmpty()) {
                                    while (true) {
                                        if (fVar3.d() == null) {
                                        }
                                        f15 = 0.0f;
                                        while (r12.hasNext()) {
                                            numD = fVar4.d();
                                            if (numD != null) {
                                                iIntValue = numD.intValue();
                                            } else {
                                                iIntValue = 0;
                                            }
                                            Integer numValueOf3 = Integer.valueOf(iIntValue);
                                            numG = fVar4.g();
                                            if (numG != null) {
                                                iIntValue2 = numG.intValue();
                                            } else {
                                                iIntValue2 = 0;
                                            }
                                            fY = f15 + oe2.f.y(numValueOf3, Integer.valueOf(iIntValue2));
                                            localDateB = fVar4.b();
                                            if (localDateB != null) {
                                                dateTimeAtStartOfDay = localDateB.toDateTimeAtStartOfDay();
                                            } else {
                                                dateTimeAtStartOfDay = null;
                                            }
                                            if (dateTimeAtStartOfDay != null) {
                                                arrayList3.add(new hz.d(dateTimeAtStartOfDay, fY));
                                            }
                                            f15 = fY;
                                        }
                                        break;
                                    }
                                }
                                dVar = (hz.d) h0.n0(arrayList3);
                                if (dVar != null) {
                                    f14 = dVar.f86389b;
                                } else {
                                    f14 = 0.0f;
                                }
                                it = list2.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (((ir0.f) next).f94797b <= 0);
                                fVar = (ir0.f) next;
                                if (fVar != null) {
                                    i26 = fVar.f94797b;
                                } else {
                                    i26 = 150;
                                }
                                arrayList2.add(Boolean.valueOf(arrayList.add(new pr0.d(h0.N0(arrayList3, new or0.o()), 0.0f, f14, i26))));
                            }
                        }
                        hz.a aVarA2 = or0.p.a(eVar);
                        if (str2 == null) {
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 2064534017, R.string.common_lbl_daily_totals, o0VarE, false);
                        } else {
                            o0VarE.C(2064533738);
                            o0VarE.g0(false);
                            strJ = str2;
                        }
                        m92.o.a(null, strJ, null, null, z3.f.c(839619889, new oy0.b(baseLineChart2, fVar5, context, pVar4, arrayList, aVarA2, 15), o0VarE), null, z3.f.c(440113459, new a11.u(eVar, z25, z16, 6), o0VarE), o0VarE, 1597440, 45);
                        x1 x1Var4 = p3.n.f135158a;
                        z24 = z25;
                        str3 = str2;
                        z19 = z16;
                        pVar3 = pVar4;
                    } else {
                        o0VarE.e();
                        str3 = str2;
                        z19 = z16;
                        z24 = z17;
                        pVar3 = pVar2;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new v0(eVar, str3, z19, z24, pVar3, i14, i15);
                    }
                }
                i27 |= 3072;
                z17 = z15;
                i24 = i15 & 16;
                if (i24 != 0) {
                    if ((i14 & 24576) == 0) {
                        pVar2 = pVar;
                        if (o0VarE.B(pVar2)) {
                            i25 = 16384;
                        } else {
                            i25 = 8192;
                        }
                        i27 |= i25;
                    }
                    if ((i27 & 9363) != 9362) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (o0VarE.n(i27 & 1, z18)) {
                        if (i28 != 0) {
                            str2 = null;
                        }
                        if (i16 != 0) {
                            z16 = false;
                        }
                        if (i18 != 0) {
                            z25 = false;
                        } else {
                            z25 = z17;
                        }
                        if (i24 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar2;
                        }
                        x1 x1Var5 = p3.n.f135158a;
                        context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = new BaseLineChart(context);
                            o0VarE.K(objQ);
                        }
                        BaseLineChart baseLineChart3 = (BaseLineChart) objQ;
                        objQ2 = o0VarE.q();
                        if (objQ2 == c2565a) {
                            objQ2 = new pr0.f(context);
                            o0VarE.K(objQ2);
                        }
                        pr0.f fVar6 = (pr0.f) objQ2;
                        or0.p.a(eVar);
                        arrayList = new ArrayList();
                        if (eVar != null) {
                            g0 g0Var3 = new g0(list);
                            linkedHashMap = new LinkedHashMap();
                            while (r9.hasNext()) {
                                localDateB2 = ((ir0.f) obj).b();
                                if (localDateB2 != null) {
                                    numValueOf = Integer.valueOf(localDateB2.getWeekOfWeekyear());
                                } else {
                                    numValueOf = null;
                                }
                                arrayList4 = linkedHashMap.get(numValueOf);
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                    linkedHashMap.put(numValueOf, arrayList4);
                                }
                                ((List) arrayList4).add(obj);
                            }
                            arrayList2 = new ArrayList(linkedHashMap.size());
                            while (r8.hasNext()) {
                                arrayList3 = new ArrayList();
                                list2 = (List) entry.getValue();
                                if (!list2.isEmpty()) {
                                    while (true) {
                                        if (fVar3.d() == null) {
                                        }
                                        f15 = 0.0f;
                                        while (r12.hasNext()) {
                                            numD = fVar4.d();
                                            if (numD != null) {
                                                iIntValue = numD.intValue();
                                            } else {
                                                iIntValue = 0;
                                            }
                                            Integer numValueOf4 = Integer.valueOf(iIntValue);
                                            numG = fVar4.g();
                                            if (numG != null) {
                                                iIntValue2 = numG.intValue();
                                            } else {
                                                iIntValue2 = 0;
                                            }
                                            fY = f15 + oe2.f.y(numValueOf4, Integer.valueOf(iIntValue2));
                                            localDateB = fVar4.b();
                                            if (localDateB != null) {
                                                dateTimeAtStartOfDay = localDateB.toDateTimeAtStartOfDay();
                                            } else {
                                                dateTimeAtStartOfDay = null;
                                            }
                                            if (dateTimeAtStartOfDay != null) {
                                                arrayList3.add(new hz.d(dateTimeAtStartOfDay, fY));
                                            }
                                            f15 = fY;
                                        }
                                        break;
                                    }
                                }
                                dVar = (hz.d) h0.n0(arrayList3);
                                if (dVar != null) {
                                    f14 = dVar.f86389b;
                                } else {
                                    f14 = 0.0f;
                                }
                                it = list2.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (((ir0.f) next).f94797b <= 0);
                                fVar = (ir0.f) next;
                                if (fVar != null) {
                                    i26 = fVar.f94797b;
                                } else {
                                    i26 = 150;
                                }
                                arrayList2.add(Boolean.valueOf(arrayList.add(new pr0.d(h0.N0(arrayList3, new or0.o()), 0.0f, f14, i26))));
                            }
                        }
                        hz.a aVarA3 = or0.p.a(eVar);
                        if (str2 == null) {
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 2064534017, R.string.common_lbl_daily_totals, o0VarE, false);
                        } else {
                            o0VarE.C(2064533738);
                            o0VarE.g0(false);
                            strJ = str2;
                        }
                        m92.o.a(null, strJ, null, null, z3.f.c(839619889, new oy0.b(baseLineChart3, fVar6, context, pVar4, arrayList, aVarA3, 15), o0VarE), null, z3.f.c(440113459, new a11.u(eVar, z25, z16, 6), o0VarE), o0VarE, 1597440, 45);
                        x1 x1Var6 = p3.n.f135158a;
                        z24 = z25;
                        str3 = str2;
                        z19 = z16;
                        pVar3 = pVar4;
                    } else {
                        o0VarE.e();
                        str3 = str2;
                        z19 = z16;
                        z24 = z17;
                        pVar3 = pVar2;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new v0(eVar, str3, z19, z24, pVar3, i14, i15);
                    }
                }
                i27 |= 24576;
                pVar2 = pVar;
                if ((i27 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i27 & 1, z18)) {
                    if (i28 != 0) {
                        str2 = null;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    }
                    if (i18 != 0) {
                        z25 = false;
                    } else {
                        z25 = z17;
                    }
                    if (i24 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar2;
                    }
                    x1 x1Var7 = p3.n.f135158a;
                    context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new BaseLineChart(context);
                        o0VarE.K(objQ);
                    }
                    BaseLineChart baseLineChart4 = (BaseLineChart) objQ;
                    objQ2 = o0VarE.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new pr0.f(context);
                        o0VarE.K(objQ2);
                    }
                    pr0.f fVar7 = (pr0.f) objQ2;
                    or0.p.a(eVar);
                    arrayList = new ArrayList();
                    if (eVar != null) {
                        g0 g0Var4 = new g0(list);
                        linkedHashMap = new LinkedHashMap();
                        while (r9.hasNext()) {
                            localDateB2 = ((ir0.f) obj).b();
                            if (localDateB2 != null) {
                                numValueOf = Integer.valueOf(localDateB2.getWeekOfWeekyear());
                            } else {
                                numValueOf = null;
                            }
                            arrayList4 = linkedHashMap.get(numValueOf);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                linkedHashMap.put(numValueOf, arrayList4);
                            }
                            ((List) arrayList4).add(obj);
                        }
                        arrayList2 = new ArrayList(linkedHashMap.size());
                        while (r8.hasNext()) {
                            arrayList3 = new ArrayList();
                            list2 = (List) entry.getValue();
                            if (!list2.isEmpty()) {
                                while (true) {
                                    if (fVar3.d() == null) {
                                    }
                                    f15 = 0.0f;
                                    while (r12.hasNext()) {
                                        numD = fVar4.d();
                                        if (numD != null) {
                                            iIntValue = numD.intValue();
                                        } else {
                                            iIntValue = 0;
                                        }
                                        Integer numValueOf5 = Integer.valueOf(iIntValue);
                                        numG = fVar4.g();
                                        if (numG != null) {
                                            iIntValue2 = numG.intValue();
                                        } else {
                                            iIntValue2 = 0;
                                        }
                                        fY = f15 + oe2.f.y(numValueOf5, Integer.valueOf(iIntValue2));
                                        localDateB = fVar4.b();
                                        if (localDateB != null) {
                                            dateTimeAtStartOfDay = localDateB.toDateTimeAtStartOfDay();
                                        } else {
                                            dateTimeAtStartOfDay = null;
                                        }
                                        if (dateTimeAtStartOfDay != null) {
                                            arrayList3.add(new hz.d(dateTimeAtStartOfDay, fY));
                                        }
                                        f15 = fY;
                                    }
                                    break;
                                }
                            }
                            dVar = (hz.d) h0.n0(arrayList3);
                            if (dVar != null) {
                                f14 = dVar.f86389b;
                            } else {
                                f14 = 0.0f;
                            }
                            it = list2.iterator();
                            do {
                                if (it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (((ir0.f) next).f94797b <= 0);
                            fVar = (ir0.f) next;
                            if (fVar != null) {
                                i26 = fVar.f94797b;
                            } else {
                                i26 = 150;
                            }
                            arrayList2.add(Boolean.valueOf(arrayList.add(new pr0.d(h0.N0(arrayList3, new or0.o()), 0.0f, f14, i26))));
                        }
                    }
                    hz.a aVarA4 = or0.p.a(eVar);
                    if (str2 == null) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 2064534017, R.string.common_lbl_daily_totals, o0VarE, false);
                    } else {
                        o0VarE.C(2064533738);
                        o0VarE.g0(false);
                        strJ = str2;
                    }
                    m92.o.a(null, strJ, null, null, z3.f.c(839619889, new oy0.b(baseLineChart4, fVar7, context, pVar4, arrayList, aVarA4, 15), o0VarE), null, z3.f.c(440113459, new a11.u(eVar, z25, z16, 6), o0VarE), o0VarE, 1597440, 45);
                    x1 x1Var8 = p3.n.f135158a;
                    z24 = z25;
                    str3 = str2;
                    z19 = z16;
                    pVar3 = pVar4;
                } else {
                    o0VarE.e();
                    str3 = str2;
                    z19 = z16;
                    z24 = z17;
                    pVar3 = pVar2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new v0(eVar, str3, z19, z24, pVar3, i14, i15);
                }
            }
            i27 |= 384;
            z16 = z14;
            i18 = i15 & 8;
            if (i18 != 0) {
                if ((i14 & 3072) == 0) {
                    z17 = z15;
                    if (o0VarE.h(z17)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i27 |= i19;
                }
                i24 = i15 & 16;
                if (i24 != 0) {
                    if ((i14 & 24576) == 0) {
                        pVar2 = pVar;
                        if (o0VarE.B(pVar2)) {
                            i25 = 16384;
                        } else {
                            i25 = 8192;
                        }
                        i27 |= i25;
                    }
                    if ((i27 & 9363) != 9362) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (o0VarE.n(i27 & 1, z18)) {
                        if (i28 != 0) {
                            str2 = null;
                        }
                        if (i16 != 0) {
                            z16 = false;
                        }
                        if (i18 != 0) {
                            z25 = false;
                        } else {
                            z25 = z17;
                        }
                        if (i24 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar2;
                        }
                        x1 x1Var9 = p3.n.f135158a;
                        context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = new BaseLineChart(context);
                            o0VarE.K(objQ);
                        }
                        BaseLineChart baseLineChart5 = (BaseLineChart) objQ;
                        objQ2 = o0VarE.q();
                        if (objQ2 == c2565a) {
                            objQ2 = new pr0.f(context);
                            o0VarE.K(objQ2);
                        }
                        pr0.f fVar8 = (pr0.f) objQ2;
                        or0.p.a(eVar);
                        arrayList = new ArrayList();
                        if (eVar != null) {
                            g0 g0Var5 = new g0(list);
                            linkedHashMap = new LinkedHashMap();
                            while (r9.hasNext()) {
                                localDateB2 = ((ir0.f) obj).b();
                                if (localDateB2 != null) {
                                    numValueOf = Integer.valueOf(localDateB2.getWeekOfWeekyear());
                                } else {
                                    numValueOf = null;
                                }
                                arrayList4 = linkedHashMap.get(numValueOf);
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                    linkedHashMap.put(numValueOf, arrayList4);
                                }
                                ((List) arrayList4).add(obj);
                            }
                            arrayList2 = new ArrayList(linkedHashMap.size());
                            while (r8.hasNext()) {
                                arrayList3 = new ArrayList();
                                list2 = (List) entry.getValue();
                                if (!list2.isEmpty()) {
                                    while (true) {
                                        if (fVar3.d() == null) {
                                        }
                                        f15 = 0.0f;
                                        while (r12.hasNext()) {
                                            numD = fVar4.d();
                                            if (numD != null) {
                                                iIntValue = numD.intValue();
                                            } else {
                                                iIntValue = 0;
                                            }
                                            Integer numValueOf6 = Integer.valueOf(iIntValue);
                                            numG = fVar4.g();
                                            if (numG != null) {
                                                iIntValue2 = numG.intValue();
                                            } else {
                                                iIntValue2 = 0;
                                            }
                                            fY = f15 + oe2.f.y(numValueOf6, Integer.valueOf(iIntValue2));
                                            localDateB = fVar4.b();
                                            if (localDateB != null) {
                                                dateTimeAtStartOfDay = localDateB.toDateTimeAtStartOfDay();
                                            } else {
                                                dateTimeAtStartOfDay = null;
                                            }
                                            if (dateTimeAtStartOfDay != null) {
                                                arrayList3.add(new hz.d(dateTimeAtStartOfDay, fY));
                                            }
                                            f15 = fY;
                                        }
                                        break;
                                    }
                                }
                                dVar = (hz.d) h0.n0(arrayList3);
                                if (dVar != null) {
                                    f14 = dVar.f86389b;
                                } else {
                                    f14 = 0.0f;
                                }
                                it = list2.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (((ir0.f) next).f94797b <= 0);
                                fVar = (ir0.f) next;
                                if (fVar != null) {
                                    i26 = fVar.f94797b;
                                } else {
                                    i26 = 150;
                                }
                                arrayList2.add(Boolean.valueOf(arrayList.add(new pr0.d(h0.N0(arrayList3, new or0.o()), 0.0f, f14, i26))));
                            }
                        }
                        hz.a aVarA5 = or0.p.a(eVar);
                        if (str2 == null) {
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 2064534017, R.string.common_lbl_daily_totals, o0VarE, false);
                        } else {
                            o0VarE.C(2064533738);
                            o0VarE.g0(false);
                            strJ = str2;
                        }
                        m92.o.a(null, strJ, null, null, z3.f.c(839619889, new oy0.b(baseLineChart5, fVar8, context, pVar4, arrayList, aVarA5, 15), o0VarE), null, z3.f.c(440113459, new a11.u(eVar, z25, z16, 6), o0VarE), o0VarE, 1597440, 45);
                        x1 x1Var10 = p3.n.f135158a;
                        z24 = z25;
                        str3 = str2;
                        z19 = z16;
                        pVar3 = pVar4;
                    } else {
                        o0VarE.e();
                        str3 = str2;
                        z19 = z16;
                        z24 = z17;
                        pVar3 = pVar2;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new v0(eVar, str3, z19, z24, pVar3, i14, i15);
                    }
                }
                i27 |= 24576;
                pVar2 = pVar;
                if ((i27 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i27 & 1, z18)) {
                    if (i28 != 0) {
                        str2 = null;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    }
                    if (i18 != 0) {
                        z25 = false;
                    } else {
                        z25 = z17;
                    }
                    if (i24 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar2;
                    }
                    x1 x1Var11 = p3.n.f135158a;
                    context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new BaseLineChart(context);
                        o0VarE.K(objQ);
                    }
                    BaseLineChart baseLineChart6 = (BaseLineChart) objQ;
                    objQ2 = o0VarE.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new pr0.f(context);
                        o0VarE.K(objQ2);
                    }
                    pr0.f fVar9 = (pr0.f) objQ2;
                    or0.p.a(eVar);
                    arrayList = new ArrayList();
                    if (eVar != null) {
                        g0 g0Var6 = new g0(list);
                        linkedHashMap = new LinkedHashMap();
                        while (r9.hasNext()) {
                            localDateB2 = ((ir0.f) obj).b();
                            if (localDateB2 != null) {
                                numValueOf = Integer.valueOf(localDateB2.getWeekOfWeekyear());
                            } else {
                                numValueOf = null;
                            }
                            arrayList4 = linkedHashMap.get(numValueOf);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                linkedHashMap.put(numValueOf, arrayList4);
                            }
                            ((List) arrayList4).add(obj);
                        }
                        arrayList2 = new ArrayList(linkedHashMap.size());
                        while (r8.hasNext()) {
                            arrayList3 = new ArrayList();
                            list2 = (List) entry.getValue();
                            if (!list2.isEmpty()) {
                                while (true) {
                                    if (fVar3.d() == null) {
                                    }
                                    f15 = 0.0f;
                                    while (r12.hasNext()) {
                                        numD = fVar4.d();
                                        if (numD != null) {
                                            iIntValue = numD.intValue();
                                        } else {
                                            iIntValue = 0;
                                        }
                                        Integer numValueOf7 = Integer.valueOf(iIntValue);
                                        numG = fVar4.g();
                                        if (numG != null) {
                                            iIntValue2 = numG.intValue();
                                        } else {
                                            iIntValue2 = 0;
                                        }
                                        fY = f15 + oe2.f.y(numValueOf7, Integer.valueOf(iIntValue2));
                                        localDateB = fVar4.b();
                                        if (localDateB != null) {
                                            dateTimeAtStartOfDay = localDateB.toDateTimeAtStartOfDay();
                                        } else {
                                            dateTimeAtStartOfDay = null;
                                        }
                                        if (dateTimeAtStartOfDay != null) {
                                            arrayList3.add(new hz.d(dateTimeAtStartOfDay, fY));
                                        }
                                        f15 = fY;
                                    }
                                    break;
                                }
                            }
                            dVar = (hz.d) h0.n0(arrayList3);
                            if (dVar != null) {
                                f14 = dVar.f86389b;
                            } else {
                                f14 = 0.0f;
                            }
                            it = list2.iterator();
                            do {
                                if (it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (((ir0.f) next).f94797b <= 0);
                            fVar = (ir0.f) next;
                            if (fVar != null) {
                                i26 = fVar.f94797b;
                            } else {
                                i26 = 150;
                            }
                            arrayList2.add(Boolean.valueOf(arrayList.add(new pr0.d(h0.N0(arrayList3, new or0.o()), 0.0f, f14, i26))));
                        }
                    }
                    hz.a aVarA6 = or0.p.a(eVar);
                    if (str2 == null) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 2064534017, R.string.common_lbl_daily_totals, o0VarE, false);
                    } else {
                        o0VarE.C(2064533738);
                        o0VarE.g0(false);
                        strJ = str2;
                    }
                    m92.o.a(null, strJ, null, null, z3.f.c(839619889, new oy0.b(baseLineChart6, fVar9, context, pVar4, arrayList, aVarA6, 15), o0VarE), null, z3.f.c(440113459, new a11.u(eVar, z25, z16, 6), o0VarE), o0VarE, 1597440, 45);
                    x1 x1Var12 = p3.n.f135158a;
                    z24 = z25;
                    str3 = str2;
                    z19 = z16;
                    pVar3 = pVar4;
                } else {
                    o0VarE.e();
                    str3 = str2;
                    z19 = z16;
                    z24 = z17;
                    pVar3 = pVar2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new v0(eVar, str3, z19, z24, pVar3, i14, i15);
                }
            }
            i27 |= 3072;
            z17 = z15;
            i24 = i15 & 16;
            if (i24 != 0) {
                if ((i14 & 24576) == 0) {
                    pVar2 = pVar;
                    if (o0VarE.B(pVar2)) {
                        i25 = 16384;
                    } else {
                        i25 = 8192;
                    }
                    i27 |= i25;
                }
                if ((i27 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i27 & 1, z18)) {
                    if (i28 != 0) {
                        str2 = null;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    }
                    if (i18 != 0) {
                        z25 = false;
                    } else {
                        z25 = z17;
                    }
                    if (i24 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar2;
                    }
                    x1 x1Var13 = p3.n.f135158a;
                    context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new BaseLineChart(context);
                        o0VarE.K(objQ);
                    }
                    BaseLineChart baseLineChart7 = (BaseLineChart) objQ;
                    objQ2 = o0VarE.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new pr0.f(context);
                        o0VarE.K(objQ2);
                    }
                    pr0.f fVar10 = (pr0.f) objQ2;
                    or0.p.a(eVar);
                    arrayList = new ArrayList();
                    if (eVar != null) {
                        g0 g0Var7 = new g0(list);
                        linkedHashMap = new LinkedHashMap();
                        while (r9.hasNext()) {
                            localDateB2 = ((ir0.f) obj).b();
                            if (localDateB2 != null) {
                                numValueOf = Integer.valueOf(localDateB2.getWeekOfWeekyear());
                            } else {
                                numValueOf = null;
                            }
                            arrayList4 = linkedHashMap.get(numValueOf);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                linkedHashMap.put(numValueOf, arrayList4);
                            }
                            ((List) arrayList4).add(obj);
                        }
                        arrayList2 = new ArrayList(linkedHashMap.size());
                        while (r8.hasNext()) {
                            arrayList3 = new ArrayList();
                            list2 = (List) entry.getValue();
                            if (!list2.isEmpty()) {
                                while (true) {
                                    if (fVar3.d() == null) {
                                    }
                                    f15 = 0.0f;
                                    while (r12.hasNext()) {
                                        numD = fVar4.d();
                                        if (numD != null) {
                                            iIntValue = numD.intValue();
                                        } else {
                                            iIntValue = 0;
                                        }
                                        Integer numValueOf8 = Integer.valueOf(iIntValue);
                                        numG = fVar4.g();
                                        if (numG != null) {
                                            iIntValue2 = numG.intValue();
                                        } else {
                                            iIntValue2 = 0;
                                        }
                                        fY = f15 + oe2.f.y(numValueOf8, Integer.valueOf(iIntValue2));
                                        localDateB = fVar4.b();
                                        if (localDateB != null) {
                                            dateTimeAtStartOfDay = localDateB.toDateTimeAtStartOfDay();
                                        } else {
                                            dateTimeAtStartOfDay = null;
                                        }
                                        if (dateTimeAtStartOfDay != null) {
                                            arrayList3.add(new hz.d(dateTimeAtStartOfDay, fY));
                                        }
                                        f15 = fY;
                                    }
                                    break;
                                }
                            }
                            dVar = (hz.d) h0.n0(arrayList3);
                            if (dVar != null) {
                                f14 = dVar.f86389b;
                            } else {
                                f14 = 0.0f;
                            }
                            it = list2.iterator();
                            do {
                                if (it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (((ir0.f) next).f94797b <= 0);
                            fVar = (ir0.f) next;
                            if (fVar != null) {
                                i26 = fVar.f94797b;
                            } else {
                                i26 = 150;
                            }
                            arrayList2.add(Boolean.valueOf(arrayList.add(new pr0.d(h0.N0(arrayList3, new or0.o()), 0.0f, f14, i26))));
                        }
                    }
                    hz.a aVarA7 = or0.p.a(eVar);
                    if (str2 == null) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 2064534017, R.string.common_lbl_daily_totals, o0VarE, false);
                    } else {
                        o0VarE.C(2064533738);
                        o0VarE.g0(false);
                        strJ = str2;
                    }
                    m92.o.a(null, strJ, null, null, z3.f.c(839619889, new oy0.b(baseLineChart7, fVar10, context, pVar4, arrayList, aVarA7, 15), o0VarE), null, z3.f.c(440113459, new a11.u(eVar, z25, z16, 6), o0VarE), o0VarE, 1597440, 45);
                    x1 x1Var14 = p3.n.f135158a;
                    z24 = z25;
                    str3 = str2;
                    z19 = z16;
                    pVar3 = pVar4;
                } else {
                    o0VarE.e();
                    str3 = str2;
                    z19 = z16;
                    z24 = z17;
                    pVar3 = pVar2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new v0(eVar, str3, z19, z24, pVar3, i14, i15);
                }
            }
            i27 |= 24576;
            pVar2 = pVar;
            if ((i27 & 9363) != 9362) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i27 & 1, z18)) {
                if (i28 != 0) {
                    str2 = null;
                }
                if (i16 != 0) {
                    z16 = false;
                }
                if (i18 != 0) {
                    z25 = false;
                } else {
                    z25 = z17;
                }
                if (i24 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar2;
                }
                x1 x1Var15 = p3.n.f135158a;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new BaseLineChart(context);
                    o0VarE.K(objQ);
                }
                BaseLineChart baseLineChart8 = (BaseLineChart) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new pr0.f(context);
                    o0VarE.K(objQ2);
                }
                pr0.f fVar11 = (pr0.f) objQ2;
                or0.p.a(eVar);
                arrayList = new ArrayList();
                if (eVar != null) {
                    g0 g0Var8 = new g0(list);
                    linkedHashMap = new LinkedHashMap();
                    while (r9.hasNext()) {
                        localDateB2 = ((ir0.f) obj).b();
                        if (localDateB2 != null) {
                            numValueOf = Integer.valueOf(localDateB2.getWeekOfWeekyear());
                        } else {
                            numValueOf = null;
                        }
                        arrayList4 = linkedHashMap.get(numValueOf);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            linkedHashMap.put(numValueOf, arrayList4);
                        }
                        ((List) arrayList4).add(obj);
                    }
                    arrayList2 = new ArrayList(linkedHashMap.size());
                    while (r8.hasNext()) {
                        arrayList3 = new ArrayList();
                        list2 = (List) entry.getValue();
                        if (!list2.isEmpty()) {
                            while (true) {
                                if (fVar3.d() == null) {
                                }
                                f15 = 0.0f;
                                while (r12.hasNext()) {
                                    numD = fVar4.d();
                                    if (numD != null) {
                                        iIntValue = numD.intValue();
                                    } else {
                                        iIntValue = 0;
                                    }
                                    Integer numValueOf9 = Integer.valueOf(iIntValue);
                                    numG = fVar4.g();
                                    if (numG != null) {
                                        iIntValue2 = numG.intValue();
                                    } else {
                                        iIntValue2 = 0;
                                    }
                                    fY = f15 + oe2.f.y(numValueOf9, Integer.valueOf(iIntValue2));
                                    localDateB = fVar4.b();
                                    if (localDateB != null) {
                                        dateTimeAtStartOfDay = localDateB.toDateTimeAtStartOfDay();
                                    } else {
                                        dateTimeAtStartOfDay = null;
                                    }
                                    if (dateTimeAtStartOfDay != null) {
                                        arrayList3.add(new hz.d(dateTimeAtStartOfDay, fY));
                                    }
                                    f15 = fY;
                                }
                                break;
                            }
                        }
                        dVar = (hz.d) h0.n0(arrayList3);
                        if (dVar != null) {
                            f14 = dVar.f86389b;
                        } else {
                            f14 = 0.0f;
                        }
                        it = list2.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((ir0.f) next).f94797b <= 0);
                        fVar = (ir0.f) next;
                        if (fVar != null) {
                            i26 = fVar.f94797b;
                        } else {
                            i26 = 150;
                        }
                        arrayList2.add(Boolean.valueOf(arrayList.add(new pr0.d(h0.N0(arrayList3, new or0.o()), 0.0f, f14, i26))));
                    }
                }
                hz.a aVarA8 = or0.p.a(eVar);
                if (str2 == null) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 2064534017, R.string.common_lbl_daily_totals, o0VarE, false);
                } else {
                    o0VarE.C(2064533738);
                    o0VarE.g0(false);
                    strJ = str2;
                }
                m92.o.a(null, strJ, null, null, z3.f.c(839619889, new oy0.b(baseLineChart8, fVar11, context, pVar4, arrayList, aVarA8, 15), o0VarE), null, z3.f.c(440113459, new a11.u(eVar, z25, z16, 6), o0VarE), o0VarE, 1597440, 45);
                x1 x1Var16 = p3.n.f135158a;
                z24 = z25;
                str3 = str2;
                z19 = z16;
                pVar3 = pVar4;
            } else {
                o0VarE.e();
                str3 = str2;
                z19 = z16;
                z24 = z17;
                pVar3 = pVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new v0(eVar, str3, z19, z24, pVar3, i14, i15);
            }
        }
        i27 |= 48;
        str2 = str;
        i16 = i15 & 4;
        if (i16 != 0) {
            if ((i14 & 384) == 0) {
                z16 = z14;
                if (o0VarE.h(z16)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i27 |= i17;
            }
            i18 = i15 & 8;
            if (i18 != 0) {
                if ((i14 & 3072) == 0) {
                    z17 = z15;
                    if (o0VarE.h(z17)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i27 |= i19;
                }
                i24 = i15 & 16;
                if (i24 != 0) {
                    if ((i14 & 24576) == 0) {
                        pVar2 = pVar;
                        if (o0VarE.B(pVar2)) {
                            i25 = 16384;
                        } else {
                            i25 = 8192;
                        }
                        i27 |= i25;
                    }
                    if ((i27 & 9363) != 9362) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (o0VarE.n(i27 & 1, z18)) {
                        if (i28 != 0) {
                            str2 = null;
                        }
                        if (i16 != 0) {
                            z16 = false;
                        }
                        if (i18 != 0) {
                            z25 = false;
                        } else {
                            z25 = z17;
                        }
                        if (i24 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar2;
                        }
                        x1 x1Var17 = p3.n.f135158a;
                        context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = new BaseLineChart(context);
                            o0VarE.K(objQ);
                        }
                        BaseLineChart baseLineChart9 = (BaseLineChart) objQ;
                        objQ2 = o0VarE.q();
                        if (objQ2 == c2565a) {
                            objQ2 = new pr0.f(context);
                            o0VarE.K(objQ2);
                        }
                        pr0.f fVar12 = (pr0.f) objQ2;
                        or0.p.a(eVar);
                        arrayList = new ArrayList();
                        if (eVar != null) {
                            g0 g0Var9 = new g0(list);
                            linkedHashMap = new LinkedHashMap();
                            while (r9.hasNext()) {
                                localDateB2 = ((ir0.f) obj).b();
                                if (localDateB2 != null) {
                                    numValueOf = Integer.valueOf(localDateB2.getWeekOfWeekyear());
                                } else {
                                    numValueOf = null;
                                }
                                arrayList4 = linkedHashMap.get(numValueOf);
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                    linkedHashMap.put(numValueOf, arrayList4);
                                }
                                ((List) arrayList4).add(obj);
                            }
                            arrayList2 = new ArrayList(linkedHashMap.size());
                            while (r8.hasNext()) {
                                arrayList3 = new ArrayList();
                                list2 = (List) entry.getValue();
                                if (!list2.isEmpty()) {
                                    while (true) {
                                        if (fVar3.d() == null) {
                                        }
                                        f15 = 0.0f;
                                        while (r12.hasNext()) {
                                            numD = fVar4.d();
                                            if (numD != null) {
                                                iIntValue = numD.intValue();
                                            } else {
                                                iIntValue = 0;
                                            }
                                            Integer numValueOf10 = Integer.valueOf(iIntValue);
                                            numG = fVar4.g();
                                            if (numG != null) {
                                                iIntValue2 = numG.intValue();
                                            } else {
                                                iIntValue2 = 0;
                                            }
                                            fY = f15 + oe2.f.y(numValueOf10, Integer.valueOf(iIntValue2));
                                            localDateB = fVar4.b();
                                            if (localDateB != null) {
                                                dateTimeAtStartOfDay = localDateB.toDateTimeAtStartOfDay();
                                            } else {
                                                dateTimeAtStartOfDay = null;
                                            }
                                            if (dateTimeAtStartOfDay != null) {
                                                arrayList3.add(new hz.d(dateTimeAtStartOfDay, fY));
                                            }
                                            f15 = fY;
                                        }
                                        break;
                                    }
                                }
                                dVar = (hz.d) h0.n0(arrayList3);
                                if (dVar != null) {
                                    f14 = dVar.f86389b;
                                } else {
                                    f14 = 0.0f;
                                }
                                it = list2.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (((ir0.f) next).f94797b <= 0);
                                fVar = (ir0.f) next;
                                if (fVar != null) {
                                    i26 = fVar.f94797b;
                                } else {
                                    i26 = 150;
                                }
                                arrayList2.add(Boolean.valueOf(arrayList.add(new pr0.d(h0.N0(arrayList3, new or0.o()), 0.0f, f14, i26))));
                            }
                        }
                        hz.a aVarA9 = or0.p.a(eVar);
                        if (str2 == null) {
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 2064534017, R.string.common_lbl_daily_totals, o0VarE, false);
                        } else {
                            o0VarE.C(2064533738);
                            o0VarE.g0(false);
                            strJ = str2;
                        }
                        m92.o.a(null, strJ, null, null, z3.f.c(839619889, new oy0.b(baseLineChart9, fVar12, context, pVar4, arrayList, aVarA9, 15), o0VarE), null, z3.f.c(440113459, new a11.u(eVar, z25, z16, 6), o0VarE), o0VarE, 1597440, 45);
                        x1 x1Var18 = p3.n.f135158a;
                        z24 = z25;
                        str3 = str2;
                        z19 = z16;
                        pVar3 = pVar4;
                    } else {
                        o0VarE.e();
                        str3 = str2;
                        z19 = z16;
                        z24 = z17;
                        pVar3 = pVar2;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new v0(eVar, str3, z19, z24, pVar3, i14, i15);
                    }
                }
                i27 |= 24576;
                pVar2 = pVar;
                if ((i27 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i27 & 1, z18)) {
                    if (i28 != 0) {
                        str2 = null;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    }
                    if (i18 != 0) {
                        z25 = false;
                    } else {
                        z25 = z17;
                    }
                    if (i24 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar2;
                    }
                    x1 x1Var19 = p3.n.f135158a;
                    context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new BaseLineChart(context);
                        o0VarE.K(objQ);
                    }
                    BaseLineChart baseLineChart10 = (BaseLineChart) objQ;
                    objQ2 = o0VarE.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new pr0.f(context);
                        o0VarE.K(objQ2);
                    }
                    pr0.f fVar13 = (pr0.f) objQ2;
                    or0.p.a(eVar);
                    arrayList = new ArrayList();
                    if (eVar != null) {
                        g0 g0Var10 = new g0(list);
                        linkedHashMap = new LinkedHashMap();
                        while (r9.hasNext()) {
                            localDateB2 = ((ir0.f) obj).b();
                            if (localDateB2 != null) {
                                numValueOf = Integer.valueOf(localDateB2.getWeekOfWeekyear());
                            } else {
                                numValueOf = null;
                            }
                            arrayList4 = linkedHashMap.get(numValueOf);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                linkedHashMap.put(numValueOf, arrayList4);
                            }
                            ((List) arrayList4).add(obj);
                        }
                        arrayList2 = new ArrayList(linkedHashMap.size());
                        while (r8.hasNext()) {
                            arrayList3 = new ArrayList();
                            list2 = (List) entry.getValue();
                            if (!list2.isEmpty()) {
                                while (true) {
                                    if (fVar3.d() == null) {
                                    }
                                    f15 = 0.0f;
                                    while (r12.hasNext()) {
                                        numD = fVar4.d();
                                        if (numD != null) {
                                            iIntValue = numD.intValue();
                                        } else {
                                            iIntValue = 0;
                                        }
                                        Integer numValueOf11 = Integer.valueOf(iIntValue);
                                        numG = fVar4.g();
                                        if (numG != null) {
                                            iIntValue2 = numG.intValue();
                                        } else {
                                            iIntValue2 = 0;
                                        }
                                        fY = f15 + oe2.f.y(numValueOf11, Integer.valueOf(iIntValue2));
                                        localDateB = fVar4.b();
                                        if (localDateB != null) {
                                            dateTimeAtStartOfDay = localDateB.toDateTimeAtStartOfDay();
                                        } else {
                                            dateTimeAtStartOfDay = null;
                                        }
                                        if (dateTimeAtStartOfDay != null) {
                                            arrayList3.add(new hz.d(dateTimeAtStartOfDay, fY));
                                        }
                                        f15 = fY;
                                    }
                                    break;
                                }
                            }
                            dVar = (hz.d) h0.n0(arrayList3);
                            if (dVar != null) {
                                f14 = dVar.f86389b;
                            } else {
                                f14 = 0.0f;
                            }
                            it = list2.iterator();
                            do {
                                if (it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (((ir0.f) next).f94797b <= 0);
                            fVar = (ir0.f) next;
                            if (fVar != null) {
                                i26 = fVar.f94797b;
                            } else {
                                i26 = 150;
                            }
                            arrayList2.add(Boolean.valueOf(arrayList.add(new pr0.d(h0.N0(arrayList3, new or0.o()), 0.0f, f14, i26))));
                        }
                    }
                    hz.a aVarA10 = or0.p.a(eVar);
                    if (str2 == null) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 2064534017, R.string.common_lbl_daily_totals, o0VarE, false);
                    } else {
                        o0VarE.C(2064533738);
                        o0VarE.g0(false);
                        strJ = str2;
                    }
                    m92.o.a(null, strJ, null, null, z3.f.c(839619889, new oy0.b(baseLineChart10, fVar13, context, pVar4, arrayList, aVarA10, 15), o0VarE), null, z3.f.c(440113459, new a11.u(eVar, z25, z16, 6), o0VarE), o0VarE, 1597440, 45);
                    x1 x1Var110 = p3.n.f135158a;
                    z24 = z25;
                    str3 = str2;
                    z19 = z16;
                    pVar3 = pVar4;
                } else {
                    o0VarE.e();
                    str3 = str2;
                    z19 = z16;
                    z24 = z17;
                    pVar3 = pVar2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new v0(eVar, str3, z19, z24, pVar3, i14, i15);
                }
            }
            i27 |= 3072;
            z17 = z15;
            i24 = i15 & 16;
            if (i24 != 0) {
                if ((i14 & 24576) == 0) {
                    pVar2 = pVar;
                    if (o0VarE.B(pVar2)) {
                        i25 = 16384;
                    } else {
                        i25 = 8192;
                    }
                    i27 |= i25;
                }
                if ((i27 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i27 & 1, z18)) {
                    if (i28 != 0) {
                        str2 = null;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    }
                    if (i18 != 0) {
                        z25 = false;
                    } else {
                        z25 = z17;
                    }
                    if (i24 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar2;
                    }
                    x1 x1Var111 = p3.n.f135158a;
                    context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new BaseLineChart(context);
                        o0VarE.K(objQ);
                    }
                    BaseLineChart baseLineChart11 = (BaseLineChart) objQ;
                    objQ2 = o0VarE.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new pr0.f(context);
                        o0VarE.K(objQ2);
                    }
                    pr0.f fVar14 = (pr0.f) objQ2;
                    or0.p.a(eVar);
                    arrayList = new ArrayList();
                    if (eVar != null) {
                        g0 g0Var11 = new g0(list);
                        linkedHashMap = new LinkedHashMap();
                        while (r9.hasNext()) {
                            localDateB2 = ((ir0.f) obj).b();
                            if (localDateB2 != null) {
                                numValueOf = Integer.valueOf(localDateB2.getWeekOfWeekyear());
                            } else {
                                numValueOf = null;
                            }
                            arrayList4 = linkedHashMap.get(numValueOf);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                linkedHashMap.put(numValueOf, arrayList4);
                            }
                            ((List) arrayList4).add(obj);
                        }
                        arrayList2 = new ArrayList(linkedHashMap.size());
                        while (r8.hasNext()) {
                            arrayList3 = new ArrayList();
                            list2 = (List) entry.getValue();
                            if (!list2.isEmpty()) {
                                while (true) {
                                    if (fVar3.d() == null) {
                                    }
                                    f15 = 0.0f;
                                    while (r12.hasNext()) {
                                        numD = fVar4.d();
                                        if (numD != null) {
                                            iIntValue = numD.intValue();
                                        } else {
                                            iIntValue = 0;
                                        }
                                        Integer numValueOf12 = Integer.valueOf(iIntValue);
                                        numG = fVar4.g();
                                        if (numG != null) {
                                            iIntValue2 = numG.intValue();
                                        } else {
                                            iIntValue2 = 0;
                                        }
                                        fY = f15 + oe2.f.y(numValueOf12, Integer.valueOf(iIntValue2));
                                        localDateB = fVar4.b();
                                        if (localDateB != null) {
                                            dateTimeAtStartOfDay = localDateB.toDateTimeAtStartOfDay();
                                        } else {
                                            dateTimeAtStartOfDay = null;
                                        }
                                        if (dateTimeAtStartOfDay != null) {
                                            arrayList3.add(new hz.d(dateTimeAtStartOfDay, fY));
                                        }
                                        f15 = fY;
                                    }
                                    break;
                                }
                            }
                            dVar = (hz.d) h0.n0(arrayList3);
                            if (dVar != null) {
                                f14 = dVar.f86389b;
                            } else {
                                f14 = 0.0f;
                            }
                            it = list2.iterator();
                            do {
                                if (it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (((ir0.f) next).f94797b <= 0);
                            fVar = (ir0.f) next;
                            if (fVar != null) {
                                i26 = fVar.f94797b;
                            } else {
                                i26 = 150;
                            }
                            arrayList2.add(Boolean.valueOf(arrayList.add(new pr0.d(h0.N0(arrayList3, new or0.o()), 0.0f, f14, i26))));
                        }
                    }
                    hz.a aVarA11 = or0.p.a(eVar);
                    if (str2 == null) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 2064534017, R.string.common_lbl_daily_totals, o0VarE, false);
                    } else {
                        o0VarE.C(2064533738);
                        o0VarE.g0(false);
                        strJ = str2;
                    }
                    m92.o.a(null, strJ, null, null, z3.f.c(839619889, new oy0.b(baseLineChart11, fVar14, context, pVar4, arrayList, aVarA11, 15), o0VarE), null, z3.f.c(440113459, new a11.u(eVar, z25, z16, 6), o0VarE), o0VarE, 1597440, 45);
                    x1 x1Var112 = p3.n.f135158a;
                    z24 = z25;
                    str3 = str2;
                    z19 = z16;
                    pVar3 = pVar4;
                } else {
                    o0VarE.e();
                    str3 = str2;
                    z19 = z16;
                    z24 = z17;
                    pVar3 = pVar2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new v0(eVar, str3, z19, z24, pVar3, i14, i15);
                }
            }
            i27 |= 24576;
            pVar2 = pVar;
            if ((i27 & 9363) != 9362) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i27 & 1, z18)) {
                if (i28 != 0) {
                    str2 = null;
                }
                if (i16 != 0) {
                    z16 = false;
                }
                if (i18 != 0) {
                    z25 = false;
                } else {
                    z25 = z17;
                }
                if (i24 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar2;
                }
                x1 x1Var113 = p3.n.f135158a;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new BaseLineChart(context);
                    o0VarE.K(objQ);
                }
                BaseLineChart baseLineChart12 = (BaseLineChart) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new pr0.f(context);
                    o0VarE.K(objQ2);
                }
                pr0.f fVar15 = (pr0.f) objQ2;
                or0.p.a(eVar);
                arrayList = new ArrayList();
                if (eVar != null) {
                    g0 g0Var12 = new g0(list);
                    linkedHashMap = new LinkedHashMap();
                    while (r9.hasNext()) {
                        localDateB2 = ((ir0.f) obj).b();
                        if (localDateB2 != null) {
                            numValueOf = Integer.valueOf(localDateB2.getWeekOfWeekyear());
                        } else {
                            numValueOf = null;
                        }
                        arrayList4 = linkedHashMap.get(numValueOf);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            linkedHashMap.put(numValueOf, arrayList4);
                        }
                        ((List) arrayList4).add(obj);
                    }
                    arrayList2 = new ArrayList(linkedHashMap.size());
                    while (r8.hasNext()) {
                        arrayList3 = new ArrayList();
                        list2 = (List) entry.getValue();
                        if (!list2.isEmpty()) {
                            while (true) {
                                if (fVar3.d() == null) {
                                }
                                f15 = 0.0f;
                                while (r12.hasNext()) {
                                    numD = fVar4.d();
                                    if (numD != null) {
                                        iIntValue = numD.intValue();
                                    } else {
                                        iIntValue = 0;
                                    }
                                    Integer numValueOf13 = Integer.valueOf(iIntValue);
                                    numG = fVar4.g();
                                    if (numG != null) {
                                        iIntValue2 = numG.intValue();
                                    } else {
                                        iIntValue2 = 0;
                                    }
                                    fY = f15 + oe2.f.y(numValueOf13, Integer.valueOf(iIntValue2));
                                    localDateB = fVar4.b();
                                    if (localDateB != null) {
                                        dateTimeAtStartOfDay = localDateB.toDateTimeAtStartOfDay();
                                    } else {
                                        dateTimeAtStartOfDay = null;
                                    }
                                    if (dateTimeAtStartOfDay != null) {
                                        arrayList3.add(new hz.d(dateTimeAtStartOfDay, fY));
                                    }
                                    f15 = fY;
                                }
                                break;
                            }
                        }
                        dVar = (hz.d) h0.n0(arrayList3);
                        if (dVar != null) {
                            f14 = dVar.f86389b;
                        } else {
                            f14 = 0.0f;
                        }
                        it = list2.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((ir0.f) next).f94797b <= 0);
                        fVar = (ir0.f) next;
                        if (fVar != null) {
                            i26 = fVar.f94797b;
                        } else {
                            i26 = 150;
                        }
                        arrayList2.add(Boolean.valueOf(arrayList.add(new pr0.d(h0.N0(arrayList3, new or0.o()), 0.0f, f14, i26))));
                    }
                }
                hz.a aVarA12 = or0.p.a(eVar);
                if (str2 == null) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 2064534017, R.string.common_lbl_daily_totals, o0VarE, false);
                } else {
                    o0VarE.C(2064533738);
                    o0VarE.g0(false);
                    strJ = str2;
                }
                m92.o.a(null, strJ, null, null, z3.f.c(839619889, new oy0.b(baseLineChart12, fVar15, context, pVar4, arrayList, aVarA12, 15), o0VarE), null, z3.f.c(440113459, new a11.u(eVar, z25, z16, 6), o0VarE), o0VarE, 1597440, 45);
                x1 x1Var114 = p3.n.f135158a;
                z24 = z25;
                str3 = str2;
                z19 = z16;
                pVar3 = pVar4;
            } else {
                o0VarE.e();
                str3 = str2;
                z19 = z16;
                z24 = z17;
                pVar3 = pVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new v0(eVar, str3, z19, z24, pVar3, i14, i15);
            }
        }
        i27 |= 384;
        z16 = z14;
        i18 = i15 & 8;
        if (i18 != 0) {
            if ((i14 & 3072) == 0) {
                z17 = z15;
                if (o0VarE.h(z17)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i27 |= i19;
            }
            i24 = i15 & 16;
            if (i24 != 0) {
                if ((i14 & 24576) == 0) {
                    pVar2 = pVar;
                    if (o0VarE.B(pVar2)) {
                        i25 = 16384;
                    } else {
                        i25 = 8192;
                    }
                    i27 |= i25;
                }
                if ((i27 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i27 & 1, z18)) {
                    if (i28 != 0) {
                        str2 = null;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    }
                    if (i18 != 0) {
                        z25 = false;
                    } else {
                        z25 = z17;
                    }
                    if (i24 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar2;
                    }
                    x1 x1Var115 = p3.n.f135158a;
                    context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new BaseLineChart(context);
                        o0VarE.K(objQ);
                    }
                    BaseLineChart baseLineChart13 = (BaseLineChart) objQ;
                    objQ2 = o0VarE.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new pr0.f(context);
                        o0VarE.K(objQ2);
                    }
                    pr0.f fVar16 = (pr0.f) objQ2;
                    or0.p.a(eVar);
                    arrayList = new ArrayList();
                    if (eVar != null) {
                        g0 g0Var13 = new g0(list);
                        linkedHashMap = new LinkedHashMap();
                        while (r9.hasNext()) {
                            localDateB2 = ((ir0.f) obj).b();
                            if (localDateB2 != null) {
                                numValueOf = Integer.valueOf(localDateB2.getWeekOfWeekyear());
                            } else {
                                numValueOf = null;
                            }
                            arrayList4 = linkedHashMap.get(numValueOf);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                linkedHashMap.put(numValueOf, arrayList4);
                            }
                            ((List) arrayList4).add(obj);
                        }
                        arrayList2 = new ArrayList(linkedHashMap.size());
                        while (r8.hasNext()) {
                            arrayList3 = new ArrayList();
                            list2 = (List) entry.getValue();
                            if (!list2.isEmpty()) {
                                while (true) {
                                    if (fVar3.d() == null) {
                                    }
                                    f15 = 0.0f;
                                    while (r12.hasNext()) {
                                        numD = fVar4.d();
                                        if (numD != null) {
                                            iIntValue = numD.intValue();
                                        } else {
                                            iIntValue = 0;
                                        }
                                        Integer numValueOf14 = Integer.valueOf(iIntValue);
                                        numG = fVar4.g();
                                        if (numG != null) {
                                            iIntValue2 = numG.intValue();
                                        } else {
                                            iIntValue2 = 0;
                                        }
                                        fY = f15 + oe2.f.y(numValueOf14, Integer.valueOf(iIntValue2));
                                        localDateB = fVar4.b();
                                        if (localDateB != null) {
                                            dateTimeAtStartOfDay = localDateB.toDateTimeAtStartOfDay();
                                        } else {
                                            dateTimeAtStartOfDay = null;
                                        }
                                        if (dateTimeAtStartOfDay != null) {
                                            arrayList3.add(new hz.d(dateTimeAtStartOfDay, fY));
                                        }
                                        f15 = fY;
                                    }
                                    break;
                                }
                            }
                            dVar = (hz.d) h0.n0(arrayList3);
                            if (dVar != null) {
                                f14 = dVar.f86389b;
                            } else {
                                f14 = 0.0f;
                            }
                            it = list2.iterator();
                            do {
                                if (it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (((ir0.f) next).f94797b <= 0);
                            fVar = (ir0.f) next;
                            if (fVar != null) {
                                i26 = fVar.f94797b;
                            } else {
                                i26 = 150;
                            }
                            arrayList2.add(Boolean.valueOf(arrayList.add(new pr0.d(h0.N0(arrayList3, new or0.o()), 0.0f, f14, i26))));
                        }
                    }
                    hz.a aVarA13 = or0.p.a(eVar);
                    if (str2 == null) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 2064534017, R.string.common_lbl_daily_totals, o0VarE, false);
                    } else {
                        o0VarE.C(2064533738);
                        o0VarE.g0(false);
                        strJ = str2;
                    }
                    m92.o.a(null, strJ, null, null, z3.f.c(839619889, new oy0.b(baseLineChart13, fVar16, context, pVar4, arrayList, aVarA13, 15), o0VarE), null, z3.f.c(440113459, new a11.u(eVar, z25, z16, 6), o0VarE), o0VarE, 1597440, 45);
                    x1 x1Var116 = p3.n.f135158a;
                    z24 = z25;
                    str3 = str2;
                    z19 = z16;
                    pVar3 = pVar4;
                } else {
                    o0VarE.e();
                    str3 = str2;
                    z19 = z16;
                    z24 = z17;
                    pVar3 = pVar2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new v0(eVar, str3, z19, z24, pVar3, i14, i15);
                }
            }
            i27 |= 24576;
            pVar2 = pVar;
            if ((i27 & 9363) != 9362) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i27 & 1, z18)) {
                if (i28 != 0) {
                    str2 = null;
                }
                if (i16 != 0) {
                    z16 = false;
                }
                if (i18 != 0) {
                    z25 = false;
                } else {
                    z25 = z17;
                }
                if (i24 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar2;
                }
                x1 x1Var117 = p3.n.f135158a;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new BaseLineChart(context);
                    o0VarE.K(objQ);
                }
                BaseLineChart baseLineChart14 = (BaseLineChart) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new pr0.f(context);
                    o0VarE.K(objQ2);
                }
                pr0.f fVar17 = (pr0.f) objQ2;
                or0.p.a(eVar);
                arrayList = new ArrayList();
                if (eVar != null) {
                    g0 g0Var14 = new g0(list);
                    linkedHashMap = new LinkedHashMap();
                    while (r9.hasNext()) {
                        localDateB2 = ((ir0.f) obj).b();
                        if (localDateB2 != null) {
                            numValueOf = Integer.valueOf(localDateB2.getWeekOfWeekyear());
                        } else {
                            numValueOf = null;
                        }
                        arrayList4 = linkedHashMap.get(numValueOf);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            linkedHashMap.put(numValueOf, arrayList4);
                        }
                        ((List) arrayList4).add(obj);
                    }
                    arrayList2 = new ArrayList(linkedHashMap.size());
                    while (r8.hasNext()) {
                        arrayList3 = new ArrayList();
                        list2 = (List) entry.getValue();
                        if (!list2.isEmpty()) {
                            while (true) {
                                if (fVar3.d() == null) {
                                }
                                f15 = 0.0f;
                                while (r12.hasNext()) {
                                    numD = fVar4.d();
                                    if (numD != null) {
                                        iIntValue = numD.intValue();
                                    } else {
                                        iIntValue = 0;
                                    }
                                    Integer numValueOf15 = Integer.valueOf(iIntValue);
                                    numG = fVar4.g();
                                    if (numG != null) {
                                        iIntValue2 = numG.intValue();
                                    } else {
                                        iIntValue2 = 0;
                                    }
                                    fY = f15 + oe2.f.y(numValueOf15, Integer.valueOf(iIntValue2));
                                    localDateB = fVar4.b();
                                    if (localDateB != null) {
                                        dateTimeAtStartOfDay = localDateB.toDateTimeAtStartOfDay();
                                    } else {
                                        dateTimeAtStartOfDay = null;
                                    }
                                    if (dateTimeAtStartOfDay != null) {
                                        arrayList3.add(new hz.d(dateTimeAtStartOfDay, fY));
                                    }
                                    f15 = fY;
                                }
                                break;
                            }
                        }
                        dVar = (hz.d) h0.n0(arrayList3);
                        if (dVar != null) {
                            f14 = dVar.f86389b;
                        } else {
                            f14 = 0.0f;
                        }
                        it = list2.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((ir0.f) next).f94797b <= 0);
                        fVar = (ir0.f) next;
                        if (fVar != null) {
                            i26 = fVar.f94797b;
                        } else {
                            i26 = 150;
                        }
                        arrayList2.add(Boolean.valueOf(arrayList.add(new pr0.d(h0.N0(arrayList3, new or0.o()), 0.0f, f14, i26))));
                    }
                }
                hz.a aVarA14 = or0.p.a(eVar);
                if (str2 == null) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 2064534017, R.string.common_lbl_daily_totals, o0VarE, false);
                } else {
                    o0VarE.C(2064533738);
                    o0VarE.g0(false);
                    strJ = str2;
                }
                m92.o.a(null, strJ, null, null, z3.f.c(839619889, new oy0.b(baseLineChart14, fVar17, context, pVar4, arrayList, aVarA14, 15), o0VarE), null, z3.f.c(440113459, new a11.u(eVar, z25, z16, 6), o0VarE), o0VarE, 1597440, 45);
                x1 x1Var118 = p3.n.f135158a;
                z24 = z25;
                str3 = str2;
                z19 = z16;
                pVar3 = pVar4;
            } else {
                o0VarE.e();
                str3 = str2;
                z19 = z16;
                z24 = z17;
                pVar3 = pVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new v0(eVar, str3, z19, z24, pVar3, i14, i15);
            }
        }
        i27 |= 3072;
        z17 = z15;
        i24 = i15 & 16;
        if (i24 != 0) {
            if ((i14 & 24576) == 0) {
                pVar2 = pVar;
                if (o0VarE.B(pVar2)) {
                    i25 = 16384;
                } else {
                    i25 = 8192;
                }
                i27 |= i25;
            }
            if ((i27 & 9363) != 9362) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i27 & 1, z18)) {
                if (i28 != 0) {
                    str2 = null;
                }
                if (i16 != 0) {
                    z16 = false;
                }
                if (i18 != 0) {
                    z25 = false;
                } else {
                    z25 = z17;
                }
                if (i24 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar2;
                }
                x1 x1Var119 = p3.n.f135158a;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new BaseLineChart(context);
                    o0VarE.K(objQ);
                }
                BaseLineChart baseLineChart15 = (BaseLineChart) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new pr0.f(context);
                    o0VarE.K(objQ2);
                }
                pr0.f fVar18 = (pr0.f) objQ2;
                or0.p.a(eVar);
                arrayList = new ArrayList();
                if (eVar != null) {
                    g0 g0Var15 = new g0(list);
                    linkedHashMap = new LinkedHashMap();
                    while (r9.hasNext()) {
                        localDateB2 = ((ir0.f) obj).b();
                        if (localDateB2 != null) {
                            numValueOf = Integer.valueOf(localDateB2.getWeekOfWeekyear());
                        } else {
                            numValueOf = null;
                        }
                        arrayList4 = linkedHashMap.get(numValueOf);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            linkedHashMap.put(numValueOf, arrayList4);
                        }
                        ((List) arrayList4).add(obj);
                    }
                    arrayList2 = new ArrayList(linkedHashMap.size());
                    while (r8.hasNext()) {
                        arrayList3 = new ArrayList();
                        list2 = (List) entry.getValue();
                        if (!list2.isEmpty()) {
                            while (true) {
                                if (fVar3.d() == null) {
                                }
                                f15 = 0.0f;
                                while (r12.hasNext()) {
                                    numD = fVar4.d();
                                    if (numD != null) {
                                        iIntValue = numD.intValue();
                                    } else {
                                        iIntValue = 0;
                                    }
                                    Integer numValueOf16 = Integer.valueOf(iIntValue);
                                    numG = fVar4.g();
                                    if (numG != null) {
                                        iIntValue2 = numG.intValue();
                                    } else {
                                        iIntValue2 = 0;
                                    }
                                    fY = f15 + oe2.f.y(numValueOf16, Integer.valueOf(iIntValue2));
                                    localDateB = fVar4.b();
                                    if (localDateB != null) {
                                        dateTimeAtStartOfDay = localDateB.toDateTimeAtStartOfDay();
                                    } else {
                                        dateTimeAtStartOfDay = null;
                                    }
                                    if (dateTimeAtStartOfDay != null) {
                                        arrayList3.add(new hz.d(dateTimeAtStartOfDay, fY));
                                    }
                                    f15 = fY;
                                }
                                break;
                            }
                        }
                        dVar = (hz.d) h0.n0(arrayList3);
                        if (dVar != null) {
                            f14 = dVar.f86389b;
                        } else {
                            f14 = 0.0f;
                        }
                        it = list2.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((ir0.f) next).f94797b <= 0);
                        fVar = (ir0.f) next;
                        if (fVar != null) {
                            i26 = fVar.f94797b;
                        } else {
                            i26 = 150;
                        }
                        arrayList2.add(Boolean.valueOf(arrayList.add(new pr0.d(h0.N0(arrayList3, new or0.o()), 0.0f, f14, i26))));
                    }
                }
                hz.a aVarA15 = or0.p.a(eVar);
                if (str2 == null) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 2064534017, R.string.common_lbl_daily_totals, o0VarE, false);
                } else {
                    o0VarE.C(2064533738);
                    o0VarE.g0(false);
                    strJ = str2;
                }
                m92.o.a(null, strJ, null, null, z3.f.c(839619889, new oy0.b(baseLineChart15, fVar18, context, pVar4, arrayList, aVarA15, 15), o0VarE), null, z3.f.c(440113459, new a11.u(eVar, z25, z16, 6), o0VarE), o0VarE, 1597440, 45);
                x1 x1Var1110 = p3.n.f135158a;
                z24 = z25;
                str3 = str2;
                z19 = z16;
                pVar3 = pVar4;
            } else {
                o0VarE.e();
                str3 = str2;
                z19 = z16;
                z24 = z17;
                pVar3 = pVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new v0(eVar, str3, z19, z24, pVar3, i14, i15);
            }
        }
        i27 |= 24576;
        pVar2 = pVar;
        if ((i27 & 9363) != 9362) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (o0VarE.n(i27 & 1, z18)) {
            if (i28 != 0) {
                str2 = null;
            }
            if (i16 != 0) {
                z16 = false;
            }
            if (i18 != 0) {
                z25 = false;
            } else {
                z25 = z17;
            }
            if (i24 != 0) {
                pVar4 = null;
            } else {
                pVar4 = pVar2;
            }
            x1 x1Var1111 = p3.n.f135158a;
            context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new BaseLineChart(context);
                o0VarE.K(objQ);
            }
            BaseLineChart baseLineChart16 = (BaseLineChart) objQ;
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new pr0.f(context);
                o0VarE.K(objQ2);
            }
            pr0.f fVar19 = (pr0.f) objQ2;
            or0.p.a(eVar);
            arrayList = new ArrayList();
            if (eVar != null) {
                g0 g0Var16 = new g0(list);
                linkedHashMap = new LinkedHashMap();
                while (r9.hasNext()) {
                    localDateB2 = ((ir0.f) obj).b();
                    if (localDateB2 != null) {
                        numValueOf = Integer.valueOf(localDateB2.getWeekOfWeekyear());
                    } else {
                        numValueOf = null;
                    }
                    arrayList4 = linkedHashMap.get(numValueOf);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                        linkedHashMap.put(numValueOf, arrayList4);
                    }
                    ((List) arrayList4).add(obj);
                }
                arrayList2 = new ArrayList(linkedHashMap.size());
                while (r8.hasNext()) {
                    arrayList3 = new ArrayList();
                    list2 = (List) entry.getValue();
                    if (!list2.isEmpty()) {
                        while (true) {
                            if (fVar3.d() == null) {
                            }
                            f15 = 0.0f;
                            while (r12.hasNext()) {
                                numD = fVar4.d();
                                if (numD != null) {
                                    iIntValue = numD.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                Integer numValueOf17 = Integer.valueOf(iIntValue);
                                numG = fVar4.g();
                                if (numG != null) {
                                    iIntValue2 = numG.intValue();
                                } else {
                                    iIntValue2 = 0;
                                }
                                fY = f15 + oe2.f.y(numValueOf17, Integer.valueOf(iIntValue2));
                                localDateB = fVar4.b();
                                if (localDateB != null) {
                                    dateTimeAtStartOfDay = localDateB.toDateTimeAtStartOfDay();
                                } else {
                                    dateTimeAtStartOfDay = null;
                                }
                                if (dateTimeAtStartOfDay != null) {
                                    arrayList3.add(new hz.d(dateTimeAtStartOfDay, fY));
                                }
                                f15 = fY;
                            }
                            break;
                        }
                    }
                    dVar = (hz.d) h0.n0(arrayList3);
                    if (dVar != null) {
                        f14 = dVar.f86389b;
                    } else {
                        f14 = 0.0f;
                    }
                    it = list2.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((ir0.f) next).f94797b <= 0);
                    fVar = (ir0.f) next;
                    if (fVar != null) {
                        i26 = fVar.f94797b;
                    } else {
                        i26 = 150;
                    }
                    arrayList2.add(Boolean.valueOf(arrayList.add(new pr0.d(h0.N0(arrayList3, new or0.o()), 0.0f, f14, i26))));
                }
            }
            hz.a aVarA16 = or0.p.a(eVar);
            if (str2 == null) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 2064534017, R.string.common_lbl_daily_totals, o0VarE, false);
            } else {
                o0VarE.C(2064533738);
                o0VarE.g0(false);
                strJ = str2;
            }
            m92.o.a(null, strJ, null, null, z3.f.c(839619889, new oy0.b(baseLineChart16, fVar19, context, pVar4, arrayList, aVarA16, 15), o0VarE), null, z3.f.c(440113459, new a11.u(eVar, z25, z16, 6), o0VarE), o0VarE, 1597440, 45);
            x1 x1Var1112 = p3.n.f135158a;
            z24 = z25;
            str3 = str2;
            z19 = z16;
            pVar3 = pVar4;
        } else {
            o0VarE.e();
            str3 = str2;
            z19 = z16;
            z24 = z17;
            pVar3 = pVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v0(eVar, str3, z19, z24, pVar3, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e5  */
    public static final void d(ir0.e eVar, e23.l<? super DateTime, Unit> lVar, p3.m mVar, int i14) {
        lVar.getClass();
        o0 o0VarE = mVar.E(1769752611);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            c(eVar, null, false, false, null, o0VarE, ir0.e.f94792c | (i15 & 14), 30);
            if (eVar == null || !eVar.m()) {
                o0VarE.C(1846492585);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1846307112);
                List<ir0.f> list = eVar.f94793a;
                List listG0 = list != null ? h0.G0(list) : null;
                boolean z14 = (i15 & 112) == 32;
                Object objQ = o0VarE.q();
                if (z14) {
                    objQ = new qe2.c(lVar, 13);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new qe2.c(lVar, 13);
                        o0VarE.K(objQ);
                    }
                }
                a(listG0, (e23.l) objQ, o0VarE, 0);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(eVar, lVar, i14, 0);
        }
    }

    public static final void e(ir0.e eVar, String str, boolean z14, o13.p pVar, p3.m mVar, int i14) {
        int i15;
        boolean z15;
        o13.p pVar2;
        o0 o0VarE = mVar.E(-1016597379);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            z15 = z14;
            i15 |= o0VarE.h(z15) ? 256 : 128;
        } else {
            z15 = z14;
        }
        if ((i14 & 3072) == 0) {
            pVar2 = pVar;
            i15 |= o0VarE.B(pVar2) ? 2048 : 1024;
        } else {
            pVar2 = pVar;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC = c2.l.C(aVar, j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            int i16 = ir0.e.f94792c | 384 | (i15 & 14) | (i15 & 112);
            int i17 = i15 << 3;
            c(eVar, str, true, z15, pVar2, o0VarE, i16 | (i17 & 7168) | (i17 & 57344), 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.i(eVar, str, z14, pVar, i14, 13);
        }
    }
}
