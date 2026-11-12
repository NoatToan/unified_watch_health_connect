package af1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import h5.e0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.t1;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.x;
import p13.y;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.y3;
import s5.s0;
import s5.x0;
import u1.a2;
import w5.q;

/* JADX INFO: loaded from: classes9.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f3112a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((e) t7).f3084c), Integer.valueOf(((e) t14).f3084c));
        }
    }

    static {
        g6.f.a aVar = g6.f.f75994b;
        f3112a = 300;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01da  */
    /* JADX WARN: Code duplicated, block: B:105:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:111:0x020a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0214  */
    /* JADX WARN: Code duplicated, block: B:117:0x0224  */
    /* JADX WARN: Code duplicated, block: B:119:0x022c  */
    /* JADX WARN: Code duplicated, block: B:124:0x026f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0287  */
    /* JADX WARN: Code duplicated, block: B:130:0x028a  */
    /* JADX WARN: Code duplicated, block: B:132:0x02a9 A[LOOP:5: B:131:0x02a7->B:132:0x02a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:137:0x02ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:142:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:143:0x02de  */
    /* JADX WARN: Code duplicated, block: B:146:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:148:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:149:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:151:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:154:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:156:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:158:0x0421  */
    /* JADX WARN: Code duplicated, block: B:161:0x045c  */
    /* JADX WARN: Code duplicated, block: B:163:0x0463  */
    /* JADX WARN: Code duplicated, block: B:164:0x0467  */
    /* JADX WARN: Code duplicated, block: B:167:0x047a  */
    /* JADX WARN: Code duplicated, block: B:169:0x0488  */
    /* JADX WARN: Code duplicated, block: B:172:0x049d  */
    /* JADX WARN: Code duplicated, block: B:173:0x049f  */
    /* JADX WARN: Code duplicated, block: B:176:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:177:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:180:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:183:0x0500  */
    /* JADX WARN: Code duplicated, block: B:186:0x0508  */
    /* JADX WARN: Code duplicated, block: B:187:0x055b  */
    /* JADX WARN: Code duplicated, block: B:190:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:194:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:196:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:197:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:200:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:204:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:206:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:225:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x027a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x015d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0187  */
    /* JADX WARN: Code duplicated, block: B:90:0x018f  */
    /* JADX WARN: Code duplicated, block: B:93:0x019a  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [n92.p] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r9v7 */
    public static final void a(u82.f<List<qe1.k>> fVar, o82.g gVar, b63.o oVar, b63.o oVar2, p3.m mVar, int i14) {
        b63.o oVar3;
        boolean z14;
        ?? arrayList;
        List listN0;
        Throwable th3;
        boolean z15;
        int i15;
        int i16;
        float f14;
        float fMin;
        int i17;
        ?? r26;
        float f15;
        float f16;
        y3 y3Var;
        y3 y3Var2;
        y3 y3Var3;
        j92.f fVar2;
        x0 x0Var;
        n92.m mVar2;
        float f17;
        List list;
        float fIntValue;
        float fIntValue2;
        r.a aVar;
        float f18;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        n92.n nVar;
        e0.a aVar2;
        float fIntValue3;
        h5.g.a.b bVar;
        o82.g gVar2;
        boolean z16;
        float fIntValue4;
        boolean z17;
        ?? r14;
        float f19;
        boolean z18;
        boolean z19;
        float fIntValue5;
        float f22;
        List<qe1.k> listA;
        List<qe1.k> listA2;
        Iterator it;
        int i18;
        int i19;
        ?? r15;
        Object next;
        int i24;
        int i25;
        int iC;
        int i26;
        int i27;
        qe1.k kVar;
        int i28;
        List<qe1.k> listA3;
        boolean z24;
        o82.g gVar3 = gVar;
        fVar.getClass();
        gVar3.getClass();
        oVar.getClass();
        oVar2.getClass();
        o0 o0VarE = mVar.E(1351508591);
        int i29 = (i14 & 6) == 0 ? ((i14 & 8) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i29 |= o0VarE.k(gVar3.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            oVar3 = oVar;
            i29 |= o0VarE.r(oVar3) ? 256 : 128;
        } else {
            oVar3 = oVar;
        }
        if ((i14 & 3072) == 0) {
            i29 |= o0VarE.r(oVar2) ? 2048 : 1024;
        }
        if (o0VarE.n(i29 & 1, (i29 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            bf1.a aVar3 = new bf1.a(context);
            List<qe1.k> listA4 = fVar.a();
            float size = listA4 != null ? listA4.size() : 0.0f;
            List<qe1.k> listA5 = fVar.a();
            if (listA5 != null) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : listA5) {
                    qe1.k kVar2 = (qe1.k) obj;
                    o oVar4 = o.f3110a;
                    Integer num = kVar2.f144560c;
                    oVar4.getClass();
                    if ((o.c(num) == 0 || o.b(kVar2.f144561d).equals("")) ? false : true) {
                        arrayList4.add(obj);
                    }
                }
                z14 = true;
                arrayList = new ArrayList(y.r(arrayList4, 10));
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    Integer num2 = ((qe1.k) it3.next()).f144560c;
                    num2.getClass();
                    arrayList.add(num2);
                }
            } else {
                z14 = true;
                arrayList = j0.f134944a;
            }
            List<qe1.k> listA6 = fVar.a();
            if (listA6 != null) {
                ArrayList arrayList5 = new ArrayList();
                Iterator it4 = listA6.iterator();
                while (it4.hasNext()) {
                    String str = ((qe1.k) it4.next()).f144561d;
                    e eVarValueOf = str != null ? e.valueOf(str) : null;
                    if (eVarValueOf != null) {
                        arrayList5.add(eVarValueOf);
                    }
                }
                List listB1 = h0.b1(h0.f1(arrayList5));
                if (listB1 != null) {
                    listN0 = h0.N0(listB1, new a());
                } else {
                    listN0 = null;
                }
            } else {
                listN0 = null;
            }
            o.f3110a.getClass();
            ArrayList arrayListD = o.d(arrayList);
            List<qe1.k> listA7 = fVar.a();
            if (listA7 != null) {
                th3 = null;
                z15 = (listA7.isEmpty() ^ true) == z14;
                if (z15) {
                    listA = fVar.a();
                    if (listA != null) {
                        i26 = 0;
                        for (Object obj2 : listA) {
                            i27 = i26 + 1;
                            if (i26 >= 0) {
                                x.q();
                                throw th3;
                            }
                            kVar = (qe1.k) obj2;
                            if (i26 == 0) {
                                c22.j0 j0Var = c22.j0.f23099a;
                                i28 = i29;
                                DateTime dateTimeAtStartOfDay = new LocalDate(kVar.f144558a).toDateTimeAtStartOfDay();
                                j0Var.getClass();
                                arrayList3.add(c22.j0.k(dateTimeAtStartOfDay, 'S'));
                            } else {
                                i28 = i29;
                                listA3 = fVar.a();
                                if (listA3 == null && i26 == listA3.size() - 1) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                if (z24) {
                                    c22.j0 j0Var2 = c22.j0.f23099a;
                                    DateTime dateTimeAtStartOfDay2 = new LocalDate(kVar.f144559b).toDateTimeAtStartOfDay();
                                    j0Var2.getClass();
                                    arrayList3.add(c22.j0.k(dateTimeAtStartOfDay2, 'S'));
                                } else {
                                    arrayList3.add("");
                                }
                            }
                            i26 = i27;
                            i29 = i28;
                        }
                        i15 = i29;
                        Unit unit = Unit.INSTANCE;
                    } else {
                        i15 = i29;
                    }
                    listA2 = fVar.a();
                    if (listA2 != null) {
                        it = listA2.iterator();
                        f14 = 0.0f;
                        fMin = 999999.9f;
                        i18 = 0;
                        i19 = 0;
                        r15 = arrayList;
                        while (it.hasNext()) {
                            next = it.next();
                            i24 = i19 + 1;
                            if (i19 >= 0) {
                                x.q();
                                throw th3;
                            }
                            Iterator it5 = it;
                            qe1.k kVar3 = (qe1.k) next;
                            o oVar5 = o.f3110a;
                            i25 = i18;
                            Integer num3 = kVar3.f144560c;
                            oVar5.getClass();
                            iC = o.c(num3);
                            String strB = o.b(kVar3.f144561d);
                            if (iC != 0 || strB.equals("")) {
                                i18 = i25;
                            } else {
                                float f24 = iC;
                                f14 += f24;
                                fMin = Math.min(fMin, f24);
                                arrayList2.add(new ve1.a(new m92.h0.e.a(i19, f24), e.valueOf(strB)));
                                i18 = i25 + 1;
                            }
                            i19 = i24;
                            it = it5;
                            r15 = r15;
                        }
                        r26 = r15;
                        Unit unit2 = Unit.INSTANCE;
                        i17 = i18;
                    }
                    if (f14 > 0.0f || i17 <= 0) {
                        f15 = 0.0f;
                    } else {
                        f15 = f14 / i17;
                    }
                    if (fMin < 999999.9f) {
                        f16 = fMin;
                    } else {
                        f16 = 0.0f;
                    }
                    y3Var = t1.f91493k;
                    q.b bVar2 = (q.b) o0VarE.A(y3Var);
                    y3Var2 = t1.f91490h;
                    float f25 = f16;
                    g6.d dVar = new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f);
                    y3Var3 = t1.f91496n;
                    s0 s0Var = new s0(bVar2, dVar, (g6.o) o0VarE.A(y3Var3), 0, 8, null);
                    d92.b.f58623a.getClass();
                    fVar2 = d92.b.f58624b;
                    fVar2.getClass();
                    x0Var = j92.f.f97935l;
                    n92.d dVar2 = new n92.d(arrayList3, s0Var, d92.c.f(x0Var, o0VarE), null, null, 24, null);
                    DateTime dateTimeAtStartOfDay3 = new LocalDate().minusMonths(12).toDateTimeAtStartOfDay();
                    dateTimeAtStartOfDay3.getClass();
                    DateTime dateTimeAtStartOfDay4 = new LocalDate().toDateTimeAtStartOfDay();
                    dateTimeAtStartOfDay4.getClass();
                    DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("  MMM");
                    dateTimeFormatterForPattern.getClass();
                    ArrayList arrayList6 = new ArrayList(c02.a.e(dateTimeAtStartOfDay3, dateTimeAtStartOfDay4, dateTimeFormatterForPattern));
                    f17 = size;
                    list = listN0;
                    s0 s0Var2 = new s0((q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f), (g6.o) o0VarE.A(y3Var3), 0, 8, null);
                    fVar2.getClass();
                    mVar2 = new n92.m(arrayList6, s0Var2, d92.c.f(x0Var, o0VarE));
                    fIntValue = ((Number) h0.s0(arrayListD)).intValue();
                    fIntValue2 = ((Number) h0.x0(arrayListD)).intValue();
                    if (!((Collection) r26).isEmpty()) {
                        Iterable iterable = (Iterable) r26;
                        fIntValue5 = ((Number) h0.s0(iterable)).intValue() - ((Number) h0.x0(iterable)).intValue();
                        if (fIntValue5 <= 1.0f) {
                            f22 = 1.0f;
                        } else {
                            f22 = 5.0f;
                            if (1.0f < fIntValue5 || fIntValue5 > 5.0f) {
                                f22 = 10.0f;
                                if (5.0f < fIntValue5) {
                                    int i30 = (fIntValue5 > 10.0f ? 1 : (fIntValue5 == 10.0f ? 0 : -1));
                                }
                            }
                        }
                        float f26 = f22 * 2;
                        float fIntValue6 = ((Number) h0.s0(iterable)).intValue() + f26;
                        fIntValue2 = ((Number) h0.x0(iterable)).intValue() - f26;
                        fIntValue = fIntValue6;
                    }
                    aVar = r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar4 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    f18 = fIntValue;
                    zVarA = c2.y.a(kVar4, h4.d.a.f81536n, o0VarE, 0);
                    x1 x1Var2 = p3.n.f135158a;
                    float f27 = fIntValue2;
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(aVar, o0VarE);
                    h5.g.V.getClass();
                    nVar = dVar2;
                    aVar2 = h5.g.a.f81805b;
                    fIntValue3 = f27;
                    if (o0VarE.f135177b != null) {
                        p0.l();
                        throw th3;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    b0 b0Var = b0.f22601a;
                    String strQ = gl1.y.Q(o0VarE, R.string.lbl_weekly_averages);
                    gVar2 = o82.g.f130856i;
                    if (gVar3 != gVar2) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    d02.c cVar = new d02.c();
                    if (gVar3 != gVar2) {
                        fIntValue4 = f18;
                    } else {
                        fIntValue4 = ((Number) h0.s0(arrayListD)).intValue();
                    }
                    if (gVar3 == gVar2) {
                        fIntValue3 = ((Number) h0.x0(arrayListD)).intValue();
                    }
                    boolean z25 = z16;
                    n92.j jVar = new n92.j(cVar, Float.valueOf(fIntValue3), Float.valueOf(fIntValue4), 5);
                    r rVarF = x2.f(x2.h(aVar, f3112a), 1.0f);
                    d92.b.f58625c.getClass();
                    r rVarB = a2.b(c2.l.A(rVarF, j92.b.f97899b.f97920e, 0.0f, 2), a2.a(o0VarE), true);
                    if (gVar3 == gVar2) {
                        nVar = mVar2;
                    }
                    if (arrayList2.isEmpty()) {
                        z17 = false;
                        o0VarE.C(806313829);
                        o0VarE.g0(false);
                        r14 = th3;
                    } else {
                        o0VarE.C(805897902);
                        s0 s0Var3 = new s0((q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f), (g6.o) o0VarE.A(y3Var3), 0, 8, null);
                        fVar2.getClass();
                        n92.g gVar4 = new n92.g(sn.a.c(o0VarE), s0Var3, d92.c.f(x0Var, o0VarE), null, 8, null);
                        z17 = false;
                        o0VarE.g0(false);
                        r14 = gVar4;
                    }
                    f19 = f15;
                    z18 = z17;
                    xe1.c.a(rVarB, strQ, gVar3, z25, arrayList2, Float.valueOf(f17), gl1.y.Q(o0VarE, R.string.msg_no_data_available), jVar, r14, nVar, z3.f.c(100169832, new i(aVar3, fVar, 1), o0VarE), o0VarE, ((i15 << 3) & 896) | 134242304, 0);
                    gVar3 = gVar3;
                    if (list != null || list.isEmpty()) {
                        z19 = true;
                    } else {
                        z19 = z18 ? 1 : 0;
                    }
                    if (z19) {
                        o0VarE.C(806963465);
                        o0VarE.g0(z18);
                    } else {
                        o0VarE.C(806891390);
                        xe1.g.c(list, gVar3, o0VarE, i15 & 112);
                        o0VarE.g0(z18);
                    }
                    if (f19 > 0.0f || f25 <= 0.0f) {
                        o0VarE.C(807301737);
                        o0VarE.g0(z18);
                    } else {
                        o0VarE.C(807026891);
                        xe1.e.a(f19, f25, o0VarE, z18 ? 1 : 0);
                        o0VarE.g0(z18);
                    }
                    o0VarE.g0(true);
                } else {
                    i15 = i29;
                    c22.j0 j0Var3 = c22.j0.f23099a;
                    DateTime dateTimeAtStartOfDay5 = g22.l.h(oVar3).toDateTimeAtStartOfDay();
                    j0Var3.getClass();
                    arrayList3.add(c22.j0.k(dateTimeAtStartOfDay5, 'S'));
                    for (i16 = 0; i16 < 10; i16++) {
                        arrayList3.add("");
                    }
                    c22.j0 j0Var4 = c22.j0.f23099a;
                    DateTime dateTimeAtStartOfDay6 = g22.l.h(oVar2).toDateTimeAtStartOfDay();
                    j0Var4.getClass();
                    arrayList3.add(c22.j0.k(dateTimeAtStartOfDay6, 'S'));
                }
                f14 = 0.0f;
                fMin = 999999.9f;
                i17 = 0;
                r26 = arrayList;
                if (f14 > 0.0f) {
                    f15 = 0.0f;
                } else {
                    f15 = 0.0f;
                }
                if (fMin < 999999.9f) {
                    f16 = fMin;
                } else {
                    f16 = 0.0f;
                }
                y3Var = t1.f91493k;
                q.b bVar3 = (q.b) o0VarE.A(y3Var);
                y3Var2 = t1.f91490h;
                float f28 = f16;
                g6.d dVar3 = new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f);
                y3Var3 = t1.f91496n;
                s0 s0Var4 = new s0(bVar3, dVar3, (g6.o) o0VarE.A(y3Var3), 0, 8, null);
                d92.b.f58623a.getClass();
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0Var = j92.f.f97935l;
                n92.d dVar4 = new n92.d(arrayList3, s0Var4, d92.c.f(x0Var, o0VarE), null, null, 24, null);
                DateTime dateTimeAtStartOfDay7 = new LocalDate().minusMonths(12).toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay7.getClass();
                DateTime dateTimeAtStartOfDay8 = new LocalDate().toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay8.getClass();
                DateTimeFormatter dateTimeFormatterForPattern2 = DateTimeFormat.forPattern("  MMM");
                dateTimeFormatterForPattern2.getClass();
                ArrayList arrayList7 = new ArrayList(c02.a.e(dateTimeAtStartOfDay7, dateTimeAtStartOfDay8, dateTimeFormatterForPattern2));
                f17 = size;
                list = listN0;
                s0 s0Var5 = new s0((q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f), (g6.o) o0VarE.A(y3Var3), 0, 8, null);
                fVar2.getClass();
                mVar2 = new n92.m(arrayList7, s0Var5, d92.c.f(x0Var, o0VarE));
                fIntValue = ((Number) h0.s0(arrayListD)).intValue();
                fIntValue2 = ((Number) h0.x0(arrayListD)).intValue();
                if (!((Collection) r26).isEmpty()) {
                    Iterable iterable2 = (Iterable) r26;
                    fIntValue5 = ((Number) h0.s0(iterable2)).intValue() - ((Number) h0.x0(iterable2)).intValue();
                    if (fIntValue5 <= 1.0f) {
                        f22 = 1.0f;
                    } else {
                        f22 = 5.0f;
                        if (1.0f < fIntValue5) {
                            f22 = 10.0f;
                            if (5.0f < fIntValue5) {
                                int i34 = (fIntValue5 > 10.0f ? 1 : (fIntValue5 == 10.0f ? 0 : -1));
                            }
                        } else {
                            f22 = 10.0f;
                            if (5.0f < fIntValue5) {
                                int i35 = (fIntValue5 > 10.0f ? 1 : (fIntValue5 == 10.0f ? 0 : -1));
                            }
                        }
                    }
                    float f29 = f22 * 2;
                    float fIntValue7 = ((Number) h0.s0(iterable2)).intValue() + f29;
                    fIntValue2 = ((Number) h0.x0(iterable2)).intValue() - f29;
                    fIntValue = fIntValue7;
                }
                aVar = r.S;
                c2.j.f22691a.getClass();
                c2.j.k kVar5 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                f18 = fIntValue;
                zVarA = c2.y.a(kVar5, h4.d.a.f81536n, o0VarE, 0);
                x1 x1Var3 = p3.n.f135158a;
                float f210 = fIntValue2;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(aVar, o0VarE);
                h5.g.V.getClass();
                nVar = dVar4;
                aVar2 = h5.g.a.f81805b;
                fIntValue3 = f210;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw th3;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var2 = b0.f22601a;
                String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_weekly_averages);
                gVar2 = o82.g.f130856i;
                if (gVar3 != gVar2) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                d02.c cVar2 = new d02.c();
                if (gVar3 != gVar2) {
                    fIntValue4 = f18;
                } else {
                    fIntValue4 = ((Number) h0.s0(arrayListD)).intValue();
                }
                if (gVar3 == gVar2) {
                    fIntValue3 = ((Number) h0.x0(arrayListD)).intValue();
                }
                boolean z26 = z16;
                n92.j jVar2 = new n92.j(cVar2, Float.valueOf(fIntValue3), Float.valueOf(fIntValue4), 5);
                r rVarF2 = x2.f(x2.h(aVar, f3112a), 1.0f);
                d92.b.f58625c.getClass();
                r rVarB2 = a2.b(c2.l.A(rVarF2, j92.b.f97899b.f97920e, 0.0f, 2), a2.a(o0VarE), true);
                if (gVar3 == gVar2) {
                    nVar = mVar2;
                }
                if (arrayList2.isEmpty()) {
                    o0VarE.C(805897902);
                    s0 s0Var6 = new s0((q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f), (g6.o) o0VarE.A(y3Var3), 0, 8, null);
                    fVar2.getClass();
                    n92.g gVar5 = new n92.g(sn.a.c(o0VarE), s0Var6, d92.c.f(x0Var, o0VarE), null, 8, null);
                    z17 = false;
                    o0VarE.g0(false);
                    r14 = gVar5;
                } else {
                    z17 = false;
                    o0VarE.C(806313829);
                    o0VarE.g0(false);
                    r14 = th3;
                }
                f19 = f15;
                z18 = z17;
                xe1.c.a(rVarB2, strQ2, gVar3, z26, arrayList2, Float.valueOf(f17), gl1.y.Q(o0VarE, R.string.msg_no_data_available), jVar2, r14, nVar, z3.f.c(100169832, new i(aVar3, fVar, 1), o0VarE), o0VarE, ((i15 << 3) & 896) | 134242304, 0);
                gVar3 = gVar3;
                if (list != null) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (z19) {
                    o0VarE.C(806891390);
                    xe1.g.c(list, gVar3, o0VarE, i15 & 112);
                    o0VarE.g0(z18);
                } else {
                    o0VarE.C(806963465);
                    o0VarE.g0(z18);
                }
                if (f19 > 0.0f) {
                    o0VarE.C(807301737);
                    o0VarE.g0(z18);
                } else {
                    o0VarE.C(807301737);
                    o0VarE.g0(z18);
                }
                o0VarE.g0(true);
            } else {
                th3 = null;
            }
            if (z15) {
                listA = fVar.a();
                if (listA != null) {
                    i26 = 0;
                    while (r10.hasNext()) {
                        i27 = i26 + 1;
                        if (i26 >= 0) {
                            x.q();
                            throw th3;
                        }
                        kVar = (qe1.k) obj2;
                        if (i26 == 0) {
                            c22.j0 j0Var5 = c22.j0.f23099a;
                            i28 = i29;
                            DateTime dateTimeAtStartOfDay9 = new LocalDate(kVar.f144558a).toDateTimeAtStartOfDay();
                            j0Var5.getClass();
                            arrayList3.add(c22.j0.k(dateTimeAtStartOfDay9, 'S'));
                        } else {
                            i28 = i29;
                            listA3 = fVar.a();
                            if (listA3 == null) {
                                z24 = false;
                            } else {
                                z24 = false;
                            }
                            if (z24) {
                                c22.j0 j0Var6 = c22.j0.f23099a;
                                DateTime dateTimeAtStartOfDay10 = new LocalDate(kVar.f144559b).toDateTimeAtStartOfDay();
                                j0Var6.getClass();
                                arrayList3.add(c22.j0.k(dateTimeAtStartOfDay10, 'S'));
                            } else {
                                arrayList3.add("");
                            }
                        }
                        i26 = i27;
                        i29 = i28;
                    }
                    i15 = i29;
                    Unit unit3 = Unit.INSTANCE;
                } else {
                    i15 = i29;
                }
                listA2 = fVar.a();
                if (listA2 != null) {
                    it = listA2.iterator();
                    f14 = 0.0f;
                    fMin = 999999.9f;
                    i18 = 0;
                    i19 = 0;
                    r15 = arrayList;
                    while (it.hasNext()) {
                        next = it.next();
                        i24 = i19 + 1;
                        if (i19 >= 0) {
                            x.q();
                            throw th3;
                        }
                        Iterator it6 = it;
                        qe1.k kVar6 = (qe1.k) next;
                        o oVar6 = o.f3110a;
                        i25 = i18;
                        Integer num4 = kVar6.f144560c;
                        oVar6.getClass();
                        iC = o.c(num4);
                        String strB2 = o.b(kVar6.f144561d);
                        if (iC != 0) {
                            i18 = i25;
                        } else {
                            i18 = i25;
                        }
                        i19 = i24;
                        it = it6;
                        r15 = r15;
                    }
                    r26 = r15;
                    Unit unit4 = Unit.INSTANCE;
                    i17 = i18;
                }
                if (f14 > 0.0f) {
                    f15 = 0.0f;
                } else {
                    f15 = 0.0f;
                }
                if (fMin < 999999.9f) {
                    f16 = fMin;
                } else {
                    f16 = 0.0f;
                }
                y3Var = t1.f91493k;
                q.b bVar4 = (q.b) o0VarE.A(y3Var);
                y3Var2 = t1.f91490h;
                float f211 = f16;
                g6.d dVar5 = new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f);
                y3Var3 = t1.f91496n;
                s0 s0Var7 = new s0(bVar4, dVar5, (g6.o) o0VarE.A(y3Var3), 0, 8, null);
                d92.b.f58623a.getClass();
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0Var = j92.f.f97935l;
                n92.d dVar6 = new n92.d(arrayList3, s0Var7, d92.c.f(x0Var, o0VarE), null, null, 24, null);
                DateTime dateTimeAtStartOfDay11 = new LocalDate().minusMonths(12).toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay11.getClass();
                DateTime dateTimeAtStartOfDay12 = new LocalDate().toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay12.getClass();
                DateTimeFormatter dateTimeFormatterForPattern3 = DateTimeFormat.forPattern("  MMM");
                dateTimeFormatterForPattern3.getClass();
                ArrayList arrayList8 = new ArrayList(c02.a.e(dateTimeAtStartOfDay11, dateTimeAtStartOfDay12, dateTimeFormatterForPattern3));
                f17 = size;
                list = listN0;
                s0 s0Var8 = new s0((q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f), (g6.o) o0VarE.A(y3Var3), 0, 8, null);
                fVar2.getClass();
                mVar2 = new n92.m(arrayList8, s0Var8, d92.c.f(x0Var, o0VarE));
                fIntValue = ((Number) h0.s0(arrayListD)).intValue();
                fIntValue2 = ((Number) h0.x0(arrayListD)).intValue();
                if (!((Collection) r26).isEmpty()) {
                    Iterable iterable3 = (Iterable) r26;
                    fIntValue5 = ((Number) h0.s0(iterable3)).intValue() - ((Number) h0.x0(iterable3)).intValue();
                    if (fIntValue5 <= 1.0f) {
                        f22 = 1.0f;
                    } else {
                        f22 = 5.0f;
                        if (1.0f < fIntValue5) {
                            f22 = 10.0f;
                            if (5.0f < fIntValue5) {
                                int i36 = (fIntValue5 > 10.0f ? 1 : (fIntValue5 == 10.0f ? 0 : -1));
                            }
                        } else {
                            f22 = 10.0f;
                            if (5.0f < fIntValue5) {
                                int i37 = (fIntValue5 > 10.0f ? 1 : (fIntValue5 == 10.0f ? 0 : -1));
                            }
                        }
                    }
                    float f212 = f22 * 2;
                    float fIntValue8 = ((Number) h0.s0(iterable3)).intValue() + f212;
                    fIntValue2 = ((Number) h0.x0(iterable3)).intValue() - f212;
                    fIntValue = fIntValue8;
                }
                aVar = r.S;
                c2.j.f22691a.getClass();
                c2.j.k kVar7 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                f18 = fIntValue;
                zVarA = c2.y.a(kVar7, h4.d.a.f81536n, o0VarE, 0);
                x1 x1Var4 = p3.n.f135158a;
                float f213 = fIntValue2;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(aVar, o0VarE);
                h5.g.V.getClass();
                nVar = dVar6;
                aVar2 = h5.g.a.f81805b;
                fIntValue3 = f213;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw th3;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var3 = b0.f22601a;
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_weekly_averages);
                gVar2 = o82.g.f130856i;
                if (gVar3 != gVar2) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                d02.c cVar3 = new d02.c();
                if (gVar3 != gVar2) {
                    fIntValue4 = f18;
                } else {
                    fIntValue4 = ((Number) h0.s0(arrayListD)).intValue();
                }
                if (gVar3 == gVar2) {
                    fIntValue3 = ((Number) h0.x0(arrayListD)).intValue();
                }
                boolean z27 = z16;
                n92.j jVar3 = new n92.j(cVar3, Float.valueOf(fIntValue3), Float.valueOf(fIntValue4), 5);
                r rVarF3 = x2.f(x2.h(aVar, f3112a), 1.0f);
                d92.b.f58625c.getClass();
                r rVarB3 = a2.b(c2.l.A(rVarF3, j92.b.f97899b.f97920e, 0.0f, 2), a2.a(o0VarE), true);
                if (gVar3 == gVar2) {
                    nVar = mVar2;
                }
                if (arrayList2.isEmpty()) {
                    o0VarE.C(805897902);
                    s0 s0Var9 = new s0((q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f), (g6.o) o0VarE.A(y3Var3), 0, 8, null);
                    fVar2.getClass();
                    n92.g gVar6 = new n92.g(sn.a.c(o0VarE), s0Var9, d92.c.f(x0Var, o0VarE), null, 8, null);
                    z17 = false;
                    o0VarE.g0(false);
                    r14 = gVar6;
                } else {
                    z17 = false;
                    o0VarE.C(806313829);
                    o0VarE.g0(false);
                    r14 = th3;
                }
                f19 = f15;
                z18 = z17;
                xe1.c.a(rVarB3, strQ3, gVar3, z27, arrayList2, Float.valueOf(f17), gl1.y.Q(o0VarE, R.string.msg_no_data_available), jVar3, r14, nVar, z3.f.c(100169832, new i(aVar3, fVar, 1), o0VarE), o0VarE, ((i15 << 3) & 896) | 134242304, 0);
                gVar3 = gVar3;
                if (list != null) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (z19) {
                    o0VarE.C(806891390);
                    xe1.g.c(list, gVar3, o0VarE, i15 & 112);
                    o0VarE.g0(z18);
                } else {
                    o0VarE.C(806963465);
                    o0VarE.g0(z18);
                }
                if (f19 > 0.0f) {
                    o0VarE.C(807301737);
                    o0VarE.g0(z18);
                } else {
                    o0VarE.C(807301737);
                    o0VarE.g0(z18);
                }
                o0VarE.g0(true);
            } else {
                i15 = i29;
                c22.j0 j0Var7 = c22.j0.f23099a;
                DateTime dateTimeAtStartOfDay13 = g22.l.h(oVar3).toDateTimeAtStartOfDay();
                j0Var7.getClass();
                arrayList3.add(c22.j0.k(dateTimeAtStartOfDay13, 'S'));
                while (i16 < 10) {
                    arrayList3.add("");
                }
                c22.j0 j0Var8 = c22.j0.f23099a;
                DateTime dateTimeAtStartOfDay14 = g22.l.h(oVar2).toDateTimeAtStartOfDay();
                j0Var8.getClass();
                arrayList3.add(c22.j0.k(dateTimeAtStartOfDay14, 'S'));
            }
            f14 = 0.0f;
            fMin = 999999.9f;
            i17 = 0;
            r26 = arrayList;
            if (f14 > 0.0f) {
                f15 = 0.0f;
            } else {
                f15 = 0.0f;
            }
            if (fMin < 999999.9f) {
                f16 = fMin;
            } else {
                f16 = 0.0f;
            }
            y3Var = t1.f91493k;
            q.b bVar5 = (q.b) o0VarE.A(y3Var);
            y3Var2 = t1.f91490h;
            float f214 = f16;
            g6.d dVar7 = new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f);
            y3Var3 = t1.f91496n;
            s0 s0Var10 = new s0(bVar5, dVar7, (g6.o) o0VarE.A(y3Var3), 0, 8, null);
            d92.b.f58623a.getClass();
            fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0Var = j92.f.f97935l;
            n92.d dVar8 = new n92.d(arrayList3, s0Var10, d92.c.f(x0Var, o0VarE), null, null, 24, null);
            DateTime dateTimeAtStartOfDay15 = new LocalDate().minusMonths(12).toDateTimeAtStartOfDay();
            dateTimeAtStartOfDay15.getClass();
            DateTime dateTimeAtStartOfDay16 = new LocalDate().toDateTimeAtStartOfDay();
            dateTimeAtStartOfDay16.getClass();
            DateTimeFormatter dateTimeFormatterForPattern4 = DateTimeFormat.forPattern("  MMM");
            dateTimeFormatterForPattern4.getClass();
            ArrayList arrayList9 = new ArrayList(c02.a.e(dateTimeAtStartOfDay15, dateTimeAtStartOfDay16, dateTimeFormatterForPattern4));
            f17 = size;
            list = listN0;
            s0 s0Var11 = new s0((q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f), (g6.o) o0VarE.A(y3Var3), 0, 8, null);
            fVar2.getClass();
            mVar2 = new n92.m(arrayList9, s0Var11, d92.c.f(x0Var, o0VarE));
            fIntValue = ((Number) h0.s0(arrayListD)).intValue();
            fIntValue2 = ((Number) h0.x0(arrayListD)).intValue();
            if (!((Collection) r26).isEmpty()) {
                Iterable iterable4 = (Iterable) r26;
                fIntValue5 = ((Number) h0.s0(iterable4)).intValue() - ((Number) h0.x0(iterable4)).intValue();
                if (fIntValue5 <= 1.0f) {
                    f22 = 1.0f;
                } else {
                    f22 = 5.0f;
                    if (1.0f < fIntValue5) {
                        f22 = 10.0f;
                        if (5.0f < fIntValue5) {
                            int i38 = (fIntValue5 > 10.0f ? 1 : (fIntValue5 == 10.0f ? 0 : -1));
                        }
                    } else {
                        f22 = 10.0f;
                        if (5.0f < fIntValue5) {
                            int i39 = (fIntValue5 > 10.0f ? 1 : (fIntValue5 == 10.0f ? 0 : -1));
                        }
                    }
                }
                float f215 = f22 * 2;
                float fIntValue9 = ((Number) h0.s0(iterable4)).intValue() + f215;
                fIntValue2 = ((Number) h0.x0(iterable4)).intValue() - f215;
                fIntValue = fIntValue9;
            }
            aVar = r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar8 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            f18 = fIntValue;
            zVarA = c2.y.a(kVar8, h4.d.a.f81536n, o0VarE, 0);
            x1 x1Var5 = p3.n.f135158a;
            float f216 = fIntValue2;
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            nVar = dVar8;
            aVar2 = h5.g.a.f81805b;
            fIntValue3 = f216;
            if (o0VarE.f135177b != null) {
                p0.l();
                throw th3;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var4 = b0.f22601a;
            String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_weekly_averages);
            gVar2 = o82.g.f130856i;
            if (gVar3 != gVar2) {
                z16 = true;
            } else {
                z16 = false;
            }
            d02.c cVar4 = new d02.c();
            if (gVar3 != gVar2) {
                fIntValue4 = f18;
            } else {
                fIntValue4 = ((Number) h0.s0(arrayListD)).intValue();
            }
            if (gVar3 == gVar2) {
                fIntValue3 = ((Number) h0.x0(arrayListD)).intValue();
            }
            boolean z28 = z16;
            n92.j jVar4 = new n92.j(cVar4, Float.valueOf(fIntValue3), Float.valueOf(fIntValue4), 5);
            r rVarF4 = x2.f(x2.h(aVar, f3112a), 1.0f);
            d92.b.f58625c.getClass();
            r rVarB4 = a2.b(c2.l.A(rVarF4, j92.b.f97899b.f97920e, 0.0f, 2), a2.a(o0VarE), true);
            if (gVar3 == gVar2) {
                nVar = mVar2;
            }
            if (arrayList2.isEmpty()) {
                o0VarE.C(805897902);
                s0 s0Var12 = new s0((q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f), (g6.o) o0VarE.A(y3Var3), 0, 8, null);
                fVar2.getClass();
                n92.g gVar7 = new n92.g(sn.a.c(o0VarE), s0Var12, d92.c.f(x0Var, o0VarE), null, 8, null);
                z17 = false;
                o0VarE.g0(false);
                r14 = gVar7;
            } else {
                z17 = false;
                o0VarE.C(806313829);
                o0VarE.g0(false);
                r14 = th3;
            }
            f19 = f15;
            z18 = z17;
            xe1.c.a(rVarB4, strQ4, gVar3, z28, arrayList2, Float.valueOf(f17), gl1.y.Q(o0VarE, R.string.msg_no_data_available), jVar4, r14, nVar, z3.f.c(100169832, new i(aVar3, fVar, 1), o0VarE), o0VarE, ((i15 << 3) & 896) | 134242304, 0);
            gVar3 = gVar3;
            if (list != null) {
                z19 = true;
            } else {
                z19 = true;
            }
            if (z19) {
                o0VarE.C(806891390);
                xe1.g.c(list, gVar3, o0VarE, i15 & 112);
                o0VarE.g0(z18);
            } else {
                o0VarE.C(806963465);
                o0VarE.g0(z18);
            }
            if (f19 > 0.0f) {
                o0VarE.C(807301737);
                o0VarE.g0(z18);
            } else {
                o0VarE.C(807301737);
                o0VarE.g0(z18);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j(fVar, gVar3, oVar, oVar2, i14, 1);
        }
    }
}
