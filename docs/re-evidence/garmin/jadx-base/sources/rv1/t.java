package rv1;

import android.app.Activity;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.e3;
import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusReportDTO;
import h5.e0;
import i3.mh;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import lc.u0;
import o4.m1;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.a2;
import yw1.u;

/* JADX INFO: loaded from: classes10.dex */
public final class t {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f154751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f154752b;

        static {
            int[] iArr = new int[uv1.d.values().length];
            try {
                iArr[uv1.d.f172952p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[uv1.d.f172940d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[uv1.d.f172944h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[uv1.d.f172941e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[uv1.d.f172949m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[uv1.d.f172945i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[uv1.d.f172946j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[uv1.d.f172951o.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[uv1.d.f172948l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[uv1.d.f172950n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[uv1.d.f172942f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[uv1.d.f172943g.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[uv1.d.f172953q.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[uv1.d.f172954r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            f154751a = iArr;
            int[] iArr2 = new int[uv1.c.values().length];
            try {
                iArr2[uv1.c.EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[uv1.c.OPEN_LOOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            f154752b = iArr2;
        }
    }

    public static final void a(String str, String str2, p3.m mVar, int i14) {
        String str3;
        o0 o0Var;
        int i15;
        o0 o0VarE = mVar.E(2108595802);
        int i16 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarF = x2.f(c2.l.A(aVar, eVar.f97920e, 0.0f, 2), 1.0f);
            c2.j.f22691a.getClass();
            c2.j.c cVar = c2.j.f22696f;
            h4.d.f81522a.getClass();
            z zVarA = y.a(cVar, h4.d.a.f81537o, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            d6.h.f57752b.getClass();
            int i17 = d6.h.f57755e;
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
            bVar.getClass();
            mh.c(str, c2.l.C(aVar, 0.0f, 0.0f, 0.0f, str2 == null ? eVar.f97921f : eVar.f97918c, 7), 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, i16 & 14, 0, 130044);
            if (str2 == null) {
                o0VarE.C(2079148433);
                o0VarE.g0(false);
                i15 = 0;
                o0Var = o0VarE;
                str3 = str2;
            } else {
                o0VarE.C(2079148434);
                fVar.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarE);
                bVar.getClass();
                str3 = str2;
                mh.c(str3, c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97921f, 7), 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 130044);
                o0Var = o0VarE;
                i15 = 0;
                o0Var.g0(false);
            }
            o0Var.g0(true);
        } else {
            str3 = str2;
            o0Var = o0VarE;
            i15 = 0;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s(str, str3, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:111:0x0307  */
    /* JADX WARN: Code duplicated, block: B:112:0x0317  */
    /* JADX WARN: Code duplicated, block: B:115:0x0327  */
    /* JADX WARN: Code duplicated, block: B:117:0x033b  */
    /* JADX WARN: Code duplicated, block: B:119:0x0353  */
    /* JADX WARN: Code duplicated, block: B:121:0x035e  */
    /* JADX WARN: Code duplicated, block: B:122:0x036b  */
    /* JADX WARN: Code duplicated, block: B:169:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:171:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:172:0x0405  */
    /* JADX WARN: Code duplicated, block: B:177:0x041c  */
    /* JADX WARN: Code duplicated, block: B:183:0x0431  */
    /* JADX WARN: Code duplicated, block: B:186:0x0446  */
    /* JADX WARN: Code duplicated, block: B:190:0x0470  */
    /* JADX WARN: Code duplicated, block: B:192:0x047e  */
    /* JADX WARN: Code duplicated, block: B:194:0x049b  */
    /* JADX WARN: Code duplicated, block: B:195:0x049d  */
    /* JADX WARN: Code duplicated, block: B:199:0x04be  */
    /* JADX WARN: Code duplicated, block: B:201:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:202:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:206:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:208:0x0508  */
    /* JADX WARN: Code duplicated, block: B:209:0x0512  */
    /* JADX WARN: Code duplicated, block: B:211:0x052d  */
    /* JADX WARN: Code duplicated, block: B:213:0x053d  */
    /* JADX WARN: Code duplicated, block: B:215:0x0547  */
    /* JADX WARN: Code duplicated, block: B:217:0x0554  */
    /* JADX WARN: Code duplicated, block: B:219:0x056a  */
    /* JADX WARN: Code duplicated, block: B:220:0x056c  */
    /* JADX WARN: Code duplicated, block: B:223:0x057e  */
    /* JADX WARN: Code duplicated, block: B:225:0x0590  */
    /* JADX WARN: Code duplicated, block: B:227:0x059a  */
    /* JADX WARN: Code duplicated, block: B:229:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:231:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:232:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:234:0x05da  */
    /* JADX WARN: Code duplicated, block: B:236:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:237:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:239:0x060e  */
    /* JADX WARN: Code duplicated, block: B:241:0x0620  */
    /* JADX WARN: Code duplicated, block: B:242:0x0622  */
    /* JADX WARN: Code duplicated, block: B:244:0x0634  */
    /* JADX WARN: Code duplicated, block: B:246:0x0646  */
    /* JADX WARN: Code duplicated, block: B:248:0x0650  */
    /* JADX WARN: Code duplicated, block: B:250:0x065e  */
    /* JADX WARN: Code duplicated, block: B:252:0x066e  */
    /* JADX WARN: Code duplicated, block: B:254:0x0678  */
    /* JADX WARN: Code duplicated, block: B:256:0x0690  */
    /* JADX WARN: Code duplicated, block: B:258:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:259:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:261:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:262:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:265:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:270:0x0705  */
    /* JADX WARN: Code duplicated, block: B:276:0x072c  */
    /* JADX WARN: Code duplicated, block: B:278:0x073c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:279:0x073e  */
    /* JADX WARN: Code duplicated, block: B:280:0x0742  */
    /* JADX WARN: Code duplicated, block: B:282:0x0746  */
    /* JADX WARN: Code duplicated, block: B:284:0x0771  */
    /* JADX WARN: Code duplicated, block: B:286:0x0782  */
    /* JADX WARN: Code duplicated, block: B:295:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0125  */
    /* JADX WARN: Code duplicated, block: B:41:0x012c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0130  */
    /* JADX WARN: Code duplicated, block: B:47:0x014b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0155  */
    /* JADX WARN: Code duplicated, block: B:52:0x015f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0169  */
    /* JADX WARN: Code duplicated, block: B:61:0x017a  */
    /* JADX WARN: Code duplicated, block: B:62:0x017f  */
    /* JADX WARN: Code duplicated, block: B:89:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:93:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:97:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:99:0x02d2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v36, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57 */
    public static final void b(Activity activity, vv1.c cVar, uv1.c cVar2, e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0Var;
        uv1.b bVar;
        h5.g.a.f fVar;
        j61.d dVar;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        boolean z14;
        boolean z15;
        List<uv1.d> list;
        Iterator<T> it;
        o0 o0Var2;
        int i15;
        boolean z16;
        boolean z17;
        Map<pu1.c, Integer> map;
        fg0.k kVar;
        vv1.e eVar;
        uv1.b bVar2;
        vv1.d dVar2;
        boolean z18;
        List<yw1.b> list2;
        List<yw1.b> list3;
        List<yw1.m> list4;
        boolean z19;
        u uVar;
        j61.i iVar;
        k61.b bVar3;
        ir0.e eVar2;
        LocalDate localDate;
        DateTime dateTimeO;
        LocalDate localDate2;
        DateTime dateTimeB;
        o13.p pVar;
        boolean z24;
        o0 o0Var3;
        o0 o0Var4;
        DateTime dateTimeAtStartOfDay;
        DateTime dateTimeAtStartOfDay2;
        o0 o0Var5;
        o0 o0Var6;
        vv1.a aVar2;
        boolean z25;
        Map<Long, yw1.i> map2;
        o0 o0Var7;
        o0 o0Var8;
        int i16;
        int i17;
        List<yw1.p> list5;
        Double d14;
        boolean z26;
        ?? r14;
        String strV;
        boolean z27;
        int i18;
        String lowerCase;
        boolean z28;
        String strV2;
        Iterator<T> it3;
        Object next;
        yw1.p pVar2;
        e23.a<Unit> aVar3 = aVar;
        Map<pu1.c, Integer> map3 = cVar.f180520m;
        uv1.b bVar4 = cVar.f180514g;
        j61.d dVar3 = cVar.A;
        List<uv1.a> list6 = cVar.f180519l;
        String str = cVar.f180513f;
        String str2 = cVar.f180510c;
        cVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-996991678);
        p3.c<?> cVar3 = o0VarE.f135177b;
        int i19 = i14 | (o0VarE.r(activity) ? 4 : 2) | (o0VarE.r(cVar) ? 32 : 16) | (o0VarE.k(cVar2.ordinal()) ? 256 : 128) | (o0VarE.r(aVar3) ? 2048 : 1024);
        if (o0VarE.n(i19 & 1, (i19 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar4 = h4.r.S;
            h4.r rVarE = u1.n.e(x2.f(aVar4, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA2 = y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
            Map<pu1.c, Integer> map4 = map3;
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (cVar3 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, zVarA2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar5 = h5.g.a.f81813j;
            if (o0VarE.T) {
                bVar = bVar4;
            } else {
                bVar = bVar4;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                b0 b0Var = b0.f22601a;
                h4.r rVarB = a2.b(x2.f(aVar4, 1.0f), a2.a(o0VarE), true);
                d92.b.f58625c.getClass();
                dVar = dVar3;
                h4.r rVarA = b0Var.a(c2.l.A(rVarB, 0.0f, j92.b.f97899b.f97921f, 1), 1.0f, true);
                zVarA = y.a(kVar2, h4.d.a.f81537o, o0VarE, 54);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarA, o0VarE);
                if (cVar3 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar3, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar5);
                }
                b4.c(fVar, rVarC, o0VarE);
                if (cVar.E) {
                    o0VarE.C(709113489);
                    list5 = cVar.f180526s;
                    if (list5 != null) {
                        it3 = list5.iterator();
                        do {
                            if (it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                        } while (!(((yw1.p) next) instanceof yw1.r));
                        pVar2 = (yw1.p) next;
                        if (pVar2 != null) {
                            d14 = ((yw1.r) pVar2).f199968b;
                        } else {
                            d14 = null;
                        }
                    } else {
                        d14 = null;
                    }
                    o0VarE.C(438524136);
                    if (str != null || d14 == null) {
                        z26 = false;
                    } else {
                        double dDoubleValue = d14.doubleValue();
                        x1 x1Var2 = p3.n.f135158a;
                        vt1.n nVar = vt1.n.FIVE_K;
                        if (dDoubleValue < nVar.f180173c) {
                            o0VarE.C(-1511359924);
                            z27 = false;
                            o0VarE.g0(false);
                            i18 = 0;
                            lowerCase = null;
                        } else {
                            z27 = false;
                            vt1.n nVar2 = vt1.n.TEN_K;
                            if (dDoubleValue < nVar2.f180173c) {
                                o0VarE.C(-1157129526);
                                lowerCase = gl1.y.Q(o0VarE, nVar.f180171a);
                                o0VarE.g0(false);
                                i18 = 0;
                            } else {
                                vt1.n nVar3 = vt1.n.HALF_MARATHON;
                                if (dDoubleValue < nVar3.f180173c) {
                                    o0VarE.C(-1157124951);
                                    lowerCase = gl1.y.Q(o0VarE, nVar2.f180171a);
                                    o0VarE.g0(false);
                                } else {
                                    vt1.n nVar4 = vt1.n.MARATHON;
                                    if (dDoubleValue < nVar4.f180173c) {
                                        o0VarE.C(-1157118532);
                                        lowerCase = gl1.y.Q(o0VarE, nVar3.f180171a).toLowerCase(Locale.ROOT);
                                        lowerCase.getClass();
                                        o0VarE.g0(false);
                                    } else {
                                        o0VarE.C(-1510898054);
                                        int i24 = (int) (dDoubleValue / ((double) nVar4.f180173c));
                                        String lowerCase2 = gl1.y.Q(o0VarE, nVar4.f180171a).toLowerCase(Locale.ROOT);
                                        lowerCase2.getClass();
                                        z27 = false;
                                        o0VarE.g0(false);
                                        i18 = i24;
                                        lowerCase = lowerCase2;
                                    }
                                }
                                i18 = 0;
                                z27 = false;
                            }
                        }
                        if (lowerCase == null) {
                            o0VarE.C(-1510437240);
                            o0VarE.g0(z27);
                            z26 = z27;
                        } else {
                            o0VarE.C(-1510437239);
                            if (i18 == 1) {
                                o0VarE.C(-883214237);
                                o0VarE.g0(z27);
                                strV2 = i18 + StringUtils.SPACE + lowerCase;
                                z28 = false;
                            } else if (i18 > 1) {
                                o0VarE.C(-883212215);
                                c22.x0.f23314a.getClass();
                                strV2 = gl1.d.V(c22.x0.Pb, new Object[]{String.valueOf(i18)});
                                z28 = false;
                                o0VarE.g0(false);
                            } else {
                                z28 = false;
                                o0VarE.C(-883209407);
                                c22.x0.f23314a.getClass();
                                strV2 = gl1.d.V(c22.x0.Ub, new Object[]{lowerCase});
                                o0VarE.g0(false);
                            }
                            c22.x0.f23314a.getClass();
                            strV = gl1.d.V(c22.x0.Xb, new Object[]{str, strV2, gl1.d.W(c22.x0.Ob)});
                            o0VarE.g0(z28);
                            r14 = z28;
                        }
                        o0VarE.g0(r14);
                        if (str2 != null || str2.length() == 0) {
                            o0VarE.C(709717524);
                            o0VarE.g0(r14);
                        } else {
                            o0VarE.C(709619502);
                            a(str2, strV, o0VarE, r14);
                            o0VarE.g0(r14);
                        }
                        o0VarE.g0(r14);
                        z15 = r14;
                    }
                    strV = null;
                    r14 = z26;
                    o0VarE.g0(r14);
                    if (str2 != null) {
                        o0VarE.C(709717524);
                        o0VarE.g0(r14);
                    } else {
                        o0VarE.C(709717524);
                        o0VarE.g0(r14);
                    }
                    o0VarE.g0(r14);
                    z15 = r14;
                } else {
                    o0VarE.C(709744587);
                    if (str2 != null || str2.length() <= 0 || str == null || str.length() <= 0) {
                        z14 = false;
                        o0VarE.C(709954612);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(709850824);
                        z14 = false;
                        a(str2, str, o0VarE, 0);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(z14);
                    z15 = z14;
                }
                list = cVar.f180518k;
                if (list == null) {
                    o0VarE.C(710400887);
                    o0VarE.g0(z15);
                    i15 = 2;
                    z16 = true;
                    z17 = z15;
                    o0Var7 = o0VarE;
                } else {
                    o0VarE.C(710400888);
                    it = list.iterator();
                    o0Var2 = o0VarE;
                    while (it.hasNext()) {
                        switch (a.f154751a[((uv1.d) it.next()).ordinal()]) {
                            case 1:
                                dVar = dVar;
                                o0Var2.C(1682252878);
                                if (map4 != null || map4.isEmpty()) {
                                    map = map4;
                                    o0Var2.C(1682437669);
                                    o0Var2.g0(false);
                                } else {
                                    o0Var2.C(1682325232);
                                    map = map4;
                                    r.b(map, o0Var2, 0);
                                    o0Var2.g0(false);
                                }
                                o0Var2.g0(false);
                                Unit unit = Unit.INSTANCE;
                                break;
                            case 2:
                                dVar = dVar;
                                o0Var2.C(1682581261);
                                kVar = cVar.f180530w;
                                if (kVar == null) {
                                    o0Var2.C(1682581260);
                                    o0Var2.g0(false);
                                } else {
                                    o0Var2.C(1682581261);
                                    if (kVar.k0()) {
                                        o0Var2.C(-2041774948);
                                        c(activity, kVar, o0Var2, (i19 & 14) | (fg0.k.X << 3));
                                        o0Var2.g0(false);
                                    } else {
                                        o0Var2.C(-2041682692);
                                        o0Var2.g0(false);
                                    }
                                    Unit unit2 = Unit.INSTANCE;
                                    o0Var2.g0(false);
                                }
                                o0Var2.g0(false);
                                map = map4;
                                break;
                            case 3:
                                dVar = dVar;
                                o0Var2.C(1682870522);
                                eVar = cVar.f180521n;
                                if (eVar == null) {
                                    o0Var2.C(1682870521);
                                } else {
                                    o0Var2.C(1682870522);
                                    k.a(eVar.f180542a, eVar.f180543b, eVar.f180544c, o0Var2, TrainingStatusReportDTO.f39909g << 6);
                                    Unit unit3 = Unit.INSTANCE;
                                }
                                o0Var2.g0(false);
                                o0Var2.g0(false);
                                map = map4;
                                break;
                            case 4:
                                bVar2 = bVar;
                                o0Var2.C(1683066938);
                                dVar2 = cVar.f180531x;
                                if (dVar2 == null) {
                                    o0Var2.C(1683066937);
                                } else {
                                    o0Var2.C(1683066938);
                                    m.a(dVar2, o0Var2, 0);
                                    Unit unit4 = Unit.INSTANCE;
                                }
                                o0Var2.g0(false);
                                o0Var2.g0(false);
                                bVar = bVar2;
                                map = map4;
                                break;
                            case 5:
                                bVar2 = bVar;
                                o0Var2.C(1683192612);
                                if (bVar2 == uv1.b.COMPLETED) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                p.a(z18, cVar.f180522o, cVar.f180523p, cVar.f180524q, o0Var2, 0);
                                o0Var2.g0(false);
                                Unit unit5 = Unit.INSTANCE;
                                bVar = bVar2;
                                map = map4;
                                break;
                            case 6:
                                bVar2 = bVar;
                                o0Var2.C(1683631417);
                                list2 = cVar.f180522o;
                                if (list2 == null) {
                                    o0Var2.C(1683631416);
                                    o0Var2.g0(false);
                                } else {
                                    o0Var2.C(1683631417);
                                    b.c(gl1.y.Q(o0Var2, uv1.d.f172945i.f172956a), list2, o0Var2, 0);
                                    Unit unit6 = Unit.INSTANCE;
                                    o0Var2.g0(false);
                                }
                                o0Var2.g0(false);
                                bVar = bVar2;
                                map = map4;
                                break;
                            case 7:
                                bVar2 = bVar;
                                o0Var2.C(1683927033);
                                list3 = cVar.f180523p;
                                if (list3 == null) {
                                    o0Var2.C(1683927032);
                                    o0Var2.g0(false);
                                } else {
                                    o0Var2.C(1683927033);
                                    b.c(gl1.y.Q(o0Var2, uv1.d.f172946j.f172956a), list3, o0Var2, 0);
                                    Unit unit7 = Unit.INSTANCE;
                                    o0Var2.g0(false);
                                }
                                o0Var2.g0(false);
                                bVar = bVar2;
                                map = map4;
                                break;
                            case 8:
                                bVar2 = bVar;
                                o0Var2.C(1684217565);
                                list4 = cVar.f180525r;
                                if (list4 == null) {
                                    o0Var2.C(1684217564);
                                } else {
                                    o0Var2.C(1684217565);
                                    d.a(list4, o0Var2, 0);
                                    Unit unit8 = Unit.INSTANCE;
                                }
                                o0Var2.g0(false);
                                o0Var2.g0(false);
                                bVar = bVar2;
                                map = map4;
                                break;
                            case 9:
                                o0Var2.C(1684337101);
                                Integer num = cVar.D;
                                List<yw1.p> list7 = cVar.f180526s;
                                bVar2 = bVar;
                                if (bVar2 == uv1.b.COMPLETED) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                g.a(num, list7, z19, cVar.f180509b, o0Var2, 0);
                                o0Var2.g0(false);
                                Unit unit9 = Unit.INSTANCE;
                                bVar = bVar2;
                                map = map4;
                                break;
                            case 10:
                                dVar = dVar;
                                o0Var2.C(1684836604);
                                uVar = cVar.f180527t;
                                if (uVar == null) {
                                    o0Var2.C(1684836603);
                                } else {
                                    o0Var2.C(1684836604);
                                    n.a(uVar, o0Var2, 0);
                                    Unit unit10 = Unit.INSTANCE;
                                }
                                o0Var2.g0(false);
                                o0Var2.g0(false);
                                map = map4;
                                break;
                            case 11:
                                dVar = dVar;
                                o0Var2.C(1684974926);
                                iVar = cVar.f180532y;
                                if (iVar == null) {
                                    o0Var2.C(1684974925);
                                    o0Var2.g0(false);
                                } else {
                                    o0Var2.C(1684974926);
                                    e3 e3Var = (e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null);
                                    j61.i.Companion companion = j61.i.INSTANCE;
                                    e3Var.j(iVar, dVar, o0Var2, j61.d.f97317e << 3);
                                    Unit unit11 = Unit.INSTANCE;
                                    o0Var2.g0(false);
                                }
                                o0Var2.g0(false);
                                map = map4;
                                break;
                            case 12:
                                o0Var2.C(1685244967);
                                bVar3 = cVar.f180533z;
                                if (bVar3 == null) {
                                    o0Var2.C(1685244966);
                                    o0Var2.g0(false);
                                    dVar = dVar;
                                } else {
                                    o0Var2.C(1685244967);
                                    dVar = dVar;
                                    ((e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null)).V(bVar3, dVar, o0Var2, j61.d.f97317e << 3);
                                    Unit unit12 = Unit.INSTANCE;
                                    o0Var2.g0(false);
                                }
                                o0Var2.g0(false);
                                map = map4;
                                break;
                            case 13:
                                o0Var2.C(1685544830);
                                eVar2 = cVar.B;
                                if (eVar2 == null) {
                                    o0Var2.C(1685544829);
                                    o0Var2.g0(false);
                                    o0Var5 = o0Var2;
                                } else {
                                    o0Var2.C(1685544830);
                                    localDate = cVar.f180511d;
                                    if (localDate != null || (dateTimeAtStartOfDay2 = localDate.toDateTimeAtStartOfDay()) == null) {
                                        dateTimeO = null;
                                    } else {
                                        dateTimeO = g22.k.o(gg1.m.MONDAY.f77271c, dateTimeAtStartOfDay2);
                                    }
                                    localDate2 = cVar.f180512e;
                                    if (localDate2 != null || (dateTimeAtStartOfDay = localDate2.toDateTimeAtStartOfDay()) == null) {
                                        dateTimeB = null;
                                    } else {
                                        dateTimeB = g22.k.b(gg1.m.MONDAY.f77271c, dateTimeAtStartOfDay);
                                    }
                                    pVar = new o13.p(gl1.y.Q(o0Var2, R.string.plan_start), null);
                                    if (cVar.C) {
                                        o0Var2.C(1478121003);
                                        if (dateTimeO != null || dateTimeB == null) {
                                            o0Var2.C(1478408497);
                                            o0Var2.g0(false);
                                            o0Var4 = o0Var2;
                                        } else {
                                            o0Var2.C(1478189389);
                                            o0 o0Var9 = o0Var2;
                                            e3.a.b(eVar2, gl1.y.Q(o0Var2, R.string.title_intensity_minutes_abbr), dateTimeO, dateTimeB, pVar, (e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null), o0Var9, ir0.e.f94792c);
                                            o0 o0Var10 = o0Var9;
                                            o0Var10.g0(false);
                                            o0Var4 = o0Var10;
                                        }
                                        o0Var4.g0(false);
                                        o0Var3 = o0Var4;
                                    } else {
                                        o0Var2.C(1478453788);
                                        if (Math.ceil(((double) Days.daysBetween(dateTimeO, dateTimeB).getDays()) / 7.0d) >= 4.0d) {
                                            z24 = true;
                                        } else {
                                            z24 = false;
                                        }
                                        o0 o0Var11 = o0Var2;
                                        e3.a.a(eVar2, gl1.y.Q(o0Var2, R.string.title_intensity_minutes_abbr), z24, pVar, (e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null), o0Var11, ir0.e.f94792c);
                                        o0 o0Var12 = o0Var11;
                                        o0Var12.g0(false);
                                        o0Var3 = o0Var12;
                                    }
                                    Unit unit13 = Unit.INSTANCE;
                                    o0Var3.g0(false);
                                    o0Var5 = o0Var3;
                                }
                                o0Var5.g0(false);
                                o0Var6 = o0Var5;
                                o0Var2 = o0Var6;
                                map = map4;
                                dVar = dVar;
                                break;
                            case 14:
                                o0Var2.C(1687060916);
                                aVar2 = cVar.f180528u;
                                if (aVar2 == null) {
                                    o0Var2.C(1687060915);
                                    o0Var2.g0(false);
                                    z25 = false;
                                } else {
                                    o0Var2.C(1687060916);
                                    if (list6 == null && (!list6.isEmpty()) && (aVar2.f180489a != null || aVar2.f180490b != null || aVar2.f180491c != null || (((map2 = aVar2.f180492d) != null && (!map2.isEmpty())) || aVar2.f180493e != null || aVar2.f180494f != null || aVar2.f180495g != null || aVar2.f180496h != null || aVar2.f180501m != null || aVar2.f180498j != null || aVar2.f180499k != null || aVar2.f180500l != null || aVar2.f180502n != null || aVar2.f180503o != null || aVar2.f180504p != null || aVar2.f180505q != null))) {
                                        o0Var2.C(-975686608);
                                        z25 = false;
                                        i.c(cVar.f180517j, list6, aVar2, o0Var2, 0);
                                        o0Var2.g0(false);
                                    } else {
                                        z25 = false;
                                        o0Var2.C(-975553029);
                                        o0Var2.g0(false);
                                    }
                                    Unit unit14 = Unit.INSTANCE;
                                    o0Var2.g0(z25);
                                }
                                o0Var2.g0(z25);
                                o0Var6 = o0Var2;
                                o0Var2 = o0Var6;
                                map = map4;
                                dVar = dVar;
                                break;
                            default:
                                o0Var2.C(-1885231903);
                                o0Var2.g0(false);
                                Unit unit15 = Unit.INSTANCE;
                                o0Var2 = o0Var2;
                                map = map4;
                                dVar = dVar;
                                break;
                        }
                        map4 = map;
                        dVar = dVar;
                        o0Var2 = o0Var2;
                    }
                    i15 = 2;
                    z16 = true;
                    z17 = false;
                    o0Var2.g0(false);
                    Unit unit16 = Unit.INSTANCE;
                    o0Var7 = o0Var2;
                }
                o0Var7.g0(z16);
                if (cVar.f180529v) {
                    o0Var7.C(1404910399);
                    i16 = a.f154752b[cVar2.ordinal()];
                    if (i16 != z16) {
                        i17 = R.string.itp_find_a_plan;
                    } else {
                        if (i16 == i15) {
                            u0.r();
                            return;
                        }
                        i17 = R.string.lbl_repeat_plan;
                    }
                    aVar3 = aVar;
                    o0 o0Var13 = o0Var7;
                    b82.c.b(null, null, z3.f.c(58919912, new ao1.g(gl1.y.Q(o0Var7, i17), aVar3, 25), o0Var7), null, 0L, o0Var13, 384, 27);
                    o0 o0Var14 = o0Var13;
                    o0Var14.g0(z17);
                    o0Var8 = o0Var14;
                } else {
                    aVar3 = aVar;
                    o0Var7.C(1405505258);
                    o0Var7.g0(z17);
                    o0Var8 = o0Var7;
                }
                o0Var8.g0(z16);
                x1 x1Var3 = p3.n.f135158a;
                o0Var = o0Var8;
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar5);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var2 = b0.f22601a;
            h4.r rVarB2 = a2.b(x2.f(aVar4, 1.0f), a2.a(o0VarE), true);
            d92.b.f58625c.getClass();
            dVar = dVar3;
            h4.r rVarA2 = b0Var2.a(c2.l.A(rVarB2, 0.0f, j92.b.f97899b.f97921f, 1), 1.0f, true);
            zVarA = y.a(kVar2, h4.d.a.f81537o, o0VarE, 54);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarA2, o0VarE);
            if (cVar3 != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(eVar3, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar5);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar5);
            }
            b4.c(fVar, rVarC, o0VarE);
            if (cVar.E) {
                o0VarE.C(709113489);
                list5 = cVar.f180526s;
                if (list5 != null) {
                    it3 = list5.iterator();
                    do {
                        if (it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                    } while (!(((yw1.p) next) instanceof yw1.r));
                    pVar2 = (yw1.p) next;
                    if (pVar2 != null) {
                        d14 = ((yw1.r) pVar2).f199968b;
                    } else {
                        d14 = null;
                    }
                } else {
                    d14 = null;
                }
                o0VarE.C(438524136);
                if (str != null) {
                    z26 = false;
                    strV = null;
                    r14 = z26;
                } else {
                    z26 = false;
                    strV = null;
                    r14 = z26;
                }
                o0VarE.g0(r14);
                if (str2 != null) {
                    o0VarE.C(709717524);
                    o0VarE.g0(r14);
                } else {
                    o0VarE.C(709717524);
                    o0VarE.g0(r14);
                }
                o0VarE.g0(r14);
                z15 = r14;
            } else {
                o0VarE.C(709744587);
                if (str2 != null) {
                    z14 = false;
                    o0VarE.C(709954612);
                    o0VarE.g0(false);
                } else {
                    z14 = false;
                    o0VarE.C(709954612);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z14);
                z15 = z14;
            }
            list = cVar.f180518k;
            if (list == null) {
                o0VarE.C(710400887);
                o0VarE.g0(z15);
                i15 = 2;
                z16 = true;
                z17 = z15;
                o0Var7 = o0VarE;
            } else {
                o0VarE.C(710400888);
                it = list.iterator();
                o0Var2 = o0VarE;
                while (it.hasNext()) {
                    switch (a.f154751a[((uv1.d) it.next()).ordinal()]) {
                        case 1:
                            dVar = dVar;
                            o0Var2.C(1682252878);
                            if (map4 != null) {
                                map = map4;
                                o0Var2.C(1682437669);
                                o0Var2.g0(false);
                            } else {
                                map = map4;
                                o0Var2.C(1682437669);
                                o0Var2.g0(false);
                            }
                            o0Var2.g0(false);
                            Unit unit17 = Unit.INSTANCE;
                            break;
                        case 2:
                            dVar = dVar;
                            o0Var2.C(1682581261);
                            kVar = cVar.f180530w;
                            if (kVar == null) {
                                o0Var2.C(1682581260);
                                o0Var2.g0(false);
                            } else {
                                o0Var2.C(1682581261);
                                if (kVar.k0()) {
                                    o0Var2.C(-2041774948);
                                    c(activity, kVar, o0Var2, (i19 & 14) | (fg0.k.X << 3));
                                    o0Var2.g0(false);
                                } else {
                                    o0Var2.C(-2041682692);
                                    o0Var2.g0(false);
                                }
                                Unit unit18 = Unit.INSTANCE;
                                o0Var2.g0(false);
                            }
                            o0Var2.g0(false);
                            map = map4;
                            break;
                        case 3:
                            dVar = dVar;
                            o0Var2.C(1682870522);
                            eVar = cVar.f180521n;
                            if (eVar == null) {
                                o0Var2.C(1682870521);
                            } else {
                                o0Var2.C(1682870522);
                                k.a(eVar.f180542a, eVar.f180543b, eVar.f180544c, o0Var2, TrainingStatusReportDTO.f39909g << 6);
                                Unit unit19 = Unit.INSTANCE;
                            }
                            o0Var2.g0(false);
                            o0Var2.g0(false);
                            map = map4;
                            break;
                        case 4:
                            bVar2 = bVar;
                            o0Var2.C(1683066938);
                            dVar2 = cVar.f180531x;
                            if (dVar2 == null) {
                                o0Var2.C(1683066937);
                            } else {
                                o0Var2.C(1683066938);
                                m.a(dVar2, o0Var2, 0);
                                Unit unit20 = Unit.INSTANCE;
                            }
                            o0Var2.g0(false);
                            o0Var2.g0(false);
                            bVar = bVar2;
                            map = map4;
                            break;
                        case 5:
                            bVar2 = bVar;
                            o0Var2.C(1683192612);
                            if (bVar2 == uv1.b.COMPLETED) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            p.a(z18, cVar.f180522o, cVar.f180523p, cVar.f180524q, o0Var2, 0);
                            o0Var2.g0(false);
                            Unit unit21 = Unit.INSTANCE;
                            bVar = bVar2;
                            map = map4;
                            break;
                        case 6:
                            bVar2 = bVar;
                            o0Var2.C(1683631417);
                            list2 = cVar.f180522o;
                            if (list2 == null) {
                                o0Var2.C(1683631416);
                                o0Var2.g0(false);
                            } else {
                                o0Var2.C(1683631417);
                                b.c(gl1.y.Q(o0Var2, uv1.d.f172945i.f172956a), list2, o0Var2, 0);
                                Unit unit22 = Unit.INSTANCE;
                                o0Var2.g0(false);
                            }
                            o0Var2.g0(false);
                            bVar = bVar2;
                            map = map4;
                            break;
                        case 7:
                            bVar2 = bVar;
                            o0Var2.C(1683927033);
                            list3 = cVar.f180523p;
                            if (list3 == null) {
                                o0Var2.C(1683927032);
                                o0Var2.g0(false);
                            } else {
                                o0Var2.C(1683927033);
                                b.c(gl1.y.Q(o0Var2, uv1.d.f172946j.f172956a), list3, o0Var2, 0);
                                Unit unit23 = Unit.INSTANCE;
                                o0Var2.g0(false);
                            }
                            o0Var2.g0(false);
                            bVar = bVar2;
                            map = map4;
                            break;
                        case 8:
                            bVar2 = bVar;
                            o0Var2.C(1684217565);
                            list4 = cVar.f180525r;
                            if (list4 == null) {
                                o0Var2.C(1684217564);
                            } else {
                                o0Var2.C(1684217565);
                                d.a(list4, o0Var2, 0);
                                Unit unit24 = Unit.INSTANCE;
                            }
                            o0Var2.g0(false);
                            o0Var2.g0(false);
                            bVar = bVar2;
                            map = map4;
                            break;
                        case 9:
                            o0Var2.C(1684337101);
                            Integer num2 = cVar.D;
                            List<yw1.p> list8 = cVar.f180526s;
                            bVar2 = bVar;
                            if (bVar2 == uv1.b.COMPLETED) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            g.a(num2, list8, z19, cVar.f180509b, o0Var2, 0);
                            o0Var2.g0(false);
                            Unit unit25 = Unit.INSTANCE;
                            bVar = bVar2;
                            map = map4;
                            break;
                        case 10:
                            dVar = dVar;
                            o0Var2.C(1684836604);
                            uVar = cVar.f180527t;
                            if (uVar == null) {
                                o0Var2.C(1684836603);
                            } else {
                                o0Var2.C(1684836604);
                                n.a(uVar, o0Var2, 0);
                                Unit unit110 = Unit.INSTANCE;
                            }
                            o0Var2.g0(false);
                            o0Var2.g0(false);
                            map = map4;
                            break;
                        case 11:
                            dVar = dVar;
                            o0Var2.C(1684974926);
                            iVar = cVar.f180532y;
                            if (iVar == null) {
                                o0Var2.C(1684974925);
                                o0Var2.g0(false);
                            } else {
                                o0Var2.C(1684974926);
                                e3 e3Var2 = (e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null);
                                j61.i.Companion companion2 = j61.i.INSTANCE;
                                e3Var2.j(iVar, dVar, o0Var2, j61.d.f97317e << 3);
                                Unit unit111 = Unit.INSTANCE;
                                o0Var2.g0(false);
                            }
                            o0Var2.g0(false);
                            map = map4;
                            break;
                        case 12:
                            o0Var2.C(1685244967);
                            bVar3 = cVar.f180533z;
                            if (bVar3 == null) {
                                o0Var2.C(1685244966);
                                o0Var2.g0(false);
                                dVar = dVar;
                            } else {
                                o0Var2.C(1685244967);
                                dVar = dVar;
                                ((e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null)).V(bVar3, dVar, o0Var2, j61.d.f97317e << 3);
                                Unit unit112 = Unit.INSTANCE;
                                o0Var2.g0(false);
                            }
                            o0Var2.g0(false);
                            map = map4;
                            break;
                        case 13:
                            o0Var2.C(1685544830);
                            eVar2 = cVar.B;
                            if (eVar2 == null) {
                                o0Var2.C(1685544829);
                                o0Var2.g0(false);
                                o0Var5 = o0Var2;
                            } else {
                                o0Var2.C(1685544830);
                                localDate = cVar.f180511d;
                                if (localDate != null) {
                                    dateTimeO = null;
                                } else {
                                    dateTimeO = null;
                                }
                                localDate2 = cVar.f180512e;
                                if (localDate2 != null) {
                                    dateTimeB = null;
                                } else {
                                    dateTimeB = null;
                                }
                                pVar = new o13.p(gl1.y.Q(o0Var2, R.string.plan_start), null);
                                if (cVar.C) {
                                    o0Var2.C(1478121003);
                                    if (dateTimeO != null) {
                                        o0Var2.C(1478408497);
                                        o0Var2.g0(false);
                                        o0Var4 = o0Var2;
                                    } else {
                                        o0Var2.C(1478408497);
                                        o0Var2.g0(false);
                                        o0Var4 = o0Var2;
                                    }
                                    o0Var4.g0(false);
                                    o0Var3 = o0Var4;
                                } else {
                                    o0Var2.C(1478453788);
                                    if (Math.ceil(((double) Days.daysBetween(dateTimeO, dateTimeB).getDays()) / 7.0d) >= 4.0d) {
                                        z24 = true;
                                    } else {
                                        z24 = false;
                                    }
                                    o0 o0Var15 = o0Var2;
                                    e3.a.a(eVar2, gl1.y.Q(o0Var2, R.string.title_intensity_minutes_abbr), z24, pVar, (e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null), o0Var15, ir0.e.f94792c);
                                    o0 o0Var16 = o0Var15;
                                    o0Var16.g0(false);
                                    o0Var3 = o0Var16;
                                }
                                Unit unit113 = Unit.INSTANCE;
                                o0Var3.g0(false);
                                o0Var5 = o0Var3;
                            }
                            o0Var5.g0(false);
                            o0Var6 = o0Var5;
                            o0Var2 = o0Var6;
                            map = map4;
                            dVar = dVar;
                            break;
                        case 14:
                            o0Var2.C(1687060916);
                            aVar2 = cVar.f180528u;
                            if (aVar2 == null) {
                                o0Var2.C(1687060915);
                                o0Var2.g0(false);
                                z25 = false;
                            } else {
                                o0Var2.C(1687060916);
                                if (list6 == null) {
                                    break;
                                }
                                z25 = false;
                                o0Var2.C(-975553029);
                                o0Var2.g0(false);
                                Unit unit114 = Unit.INSTANCE;
                                o0Var2.g0(z25);
                            }
                            o0Var2.g0(z25);
                            o0Var6 = o0Var2;
                            o0Var2 = o0Var6;
                            map = map4;
                            dVar = dVar;
                            break;
                        default:
                            o0Var2.C(-1885231903);
                            o0Var2.g0(false);
                            Unit unit115 = Unit.INSTANCE;
                            o0Var2 = o0Var2;
                            map = map4;
                            dVar = dVar;
                            break;
                    }
                    map4 = map;
                    dVar = dVar;
                    o0Var2 = o0Var2;
                }
                i15 = 2;
                z16 = true;
                z17 = false;
                o0Var2.g0(false);
                Unit unit116 = Unit.INSTANCE;
                o0Var7 = o0Var2;
            }
            o0Var7.g0(z16);
            if (cVar.f180529v) {
                o0Var7.C(1404910399);
                i16 = a.f154752b[cVar2.ordinal()];
                if (i16 != z16) {
                    i17 = R.string.itp_find_a_plan;
                } else {
                    if (i16 == i15) {
                        u0.r();
                        return;
                    }
                    i17 = R.string.lbl_repeat_plan;
                }
                aVar3 = aVar;
                o0 o0Var17 = o0Var7;
                b82.c.b(null, null, z3.f.c(58919912, new ao1.g(gl1.y.Q(o0Var7, i17), aVar3, 25), o0Var7), null, 0L, o0Var17, 384, 27);
                o0 o0Var18 = o0Var17;
                o0Var18.g0(z17);
                o0Var8 = o0Var18;
            } else {
                aVar3 = aVar;
                o0Var7.C(1405505258);
                o0Var7.g0(z17);
                o0Var8 = o0Var7;
            }
            o0Var8.g0(z16);
            x1 x1Var4 = p3.n.f135158a;
            o0Var = o0Var8;
        } else {
            o0VarE.e();
            o0Var = o0VarE;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new qy0.d(activity, cVar, cVar2, aVar3, i14, 15);
        }
    }

    public static final void c(Activity activity, fg0.k kVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(-86617756);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(activity) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(kVar) : o0VarE.r(kVar) ? 32 : 16;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(aVar, eVar.f97920e);
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81536n;
            z zVarA = y.a(kVar2, aVar2, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, uv1.d.f172940d.f172956a);
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
            h4.r rVarB = b0Var.b(aVar, aVar2);
            bVar.getClass();
            mh.c(strQ, c2.l.C(rVarB, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            ((e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null)).L((androidx.fragment.app.m) activity, kVar, o0Var, (i16 & 14) | (fg0.k.X << 3) | (i16 & 112));
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mg2.o(activity, kVar, i14, 24);
        }
    }
}
