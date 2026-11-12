package g8;

import am.x0;
import am.z0;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.data.model.j0;
import d53.u;
import d53.w;
import ds.e0;
import f5.y0;
import g02.w0;
import g22.k;
import i3.mc;
import i3.mh;
import i3.v2;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import k23.p;
import k23.q;
import lc.d0;
import lc.f0;
import lc.m0;
import lc.u0;
import lc.v0;
import n23.f2;
import o13.r;
import o53.b0;
import o53.i0;
import o53.l1;
import o53.m1;
import o53.n1;
import o53.p1;
import o62.s;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p007l6.n;
import p13.h0;
import p13.p0;
import p13.x;
import p13.y;
import p3.l0;
import p3.m;
import p3.o0;
import p3.p2;
import p5.v;
import ps.o1;
import ps.x1;
import t23.j1;
import w2.a0;
import z72.l;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final Integer A(List list) {
        Integer numD;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            kr1.c cVar = (kr1.c) obj;
            if (cVar.getValue() != null && ((numD = cVar.getValue()) == null || numD.intValue() != -1)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer numD2 = ((kr1.c) it.next()).getValue();
            numD2.getClass();
            arrayList2.add(numD2);
        }
        return Integer.valueOf((int) h0.P(arrayList2));
    }

    public static final String B(y0 y0Var) {
        Object objE = y0Var.getF81969t();
        n nVar = objE instanceof n ? (n) objE : null;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    public static final double C(int i14, List list) {
        list.getClass();
        if (i14 < 0 || i14 >= list.size()) {
            return 0.0d;
        }
        Iterator it = list.subList(0, i14 + 1).iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            Double D = ((x1) it.next()).getDistance();
            dDoubleValue += D != null ? D.doubleValue() : 0.0d;
        }
        return dDoubleValue;
    }

    public static final double D(int i14, List list) {
        list.getClass();
        if (i14 < 0 || i14 >= list.size()) {
            return 0.0d;
        }
        Iterator it = list.subList(0, i14 + 1).iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            Double dF = ((x1) it.next()).getDuration();
            dDoubleValue += dF != null ? dF.doubleValue() : 0.0d;
        }
        return dDoubleValue;
    }

    public static final Float E(Integer num) {
        int iIntValue;
        if (num == null) {
            return null;
        }
        if (num.intValue() < 59) {
            iIntValue = 59;
        } else {
            iIntValue = num.intValue() > 100 ? 100 : num.intValue();
        }
        return Float.valueOf((((iIntValue - 59) * 100) / 41) / 100);
    }

    public static final i53.f F(Integer num, m mVar) {
        i53.f fVarA;
        p3.x1 x1Var = p3.n.f135158a;
        float f14 = 0.25f;
        j jVar = null;
        if (num == null) {
            mVar.C(1172917443);
            mVar.f();
            fVarA = null;
        } else {
            mVar.C(1172917444);
            gl.c.f77766a.getClass();
            fVarA = i53.a.a(new l(f14, gl.c.a(mVar).l(), jVar), new l(f14, gl.c.a(mVar).h(), jVar), new l(f14, gl.c.a(mVar).i(), jVar), new l(f14, gl.c.a(mVar).d(), jVar));
            mVar.f();
        }
        if (fVarA == null) {
            mVar.C(-516338489);
            ArrayList arrayList = new ArrayList(4);
            for (int i14 = 0; i14 < 4; i14++) {
                d92.b.f58623a.getClass();
                arrayList.add(new l(f14, d92.b.a(mVar).e().g(), jVar));
            }
            fVarA = i53.a.j(arrayList);
        } else {
            mVar.C(-516353493);
        }
        mVar.f();
        p3.x1 x1Var2 = p3.n.f135158a;
        return fVarA;
    }

    public static final l1 G(t13.g gVar) {
        l1 l1Var = (l1) gVar.get(l1.f129368i0);
        if (l1Var != null) {
            return l1Var;
        }
        e0.t(gVar, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final k23.d H(k23.e eVar) {
        Object obj;
        if (eVar instanceof k23.d) {
            return (k23.d) eVar;
        }
        if (!(eVar instanceof q)) {
            u0.t(eVar, "Cannot calculate JVM erasure for type: ");
            return null;
        }
        List<p> upperBounds = ((q) eVar).getUpperBounds();
        Iterator<T> it = upperBounds.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            k23.e eVarG = ((p) next).getF105782a();
            f2 f2Var = eVarG instanceof f2 ? (f2) eVarG : null;
            if (f2Var != null && f2Var.T() != c33.b.INTERFACE && f2Var.T() != c33.b.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        p pVar = (p) obj;
        if (pVar == null) {
            pVar = (p) h0.d0(upperBounds);
        }
        return pVar != null ? I(pVar) : s0.f105811a.b(Object.class);
    }

    public static final k23.d I(p pVar) {
        pVar.getClass();
        k23.e eVarG = pVar.getF105782a();
        if (eVarG != null) {
            return H(eVarG);
        }
        u0.t(pVar, "Cannot calculate JVM erasure for type: ");
        return null;
    }

    public static final String J(Context context, Integer num, Integer num2) {
        String string;
        if (num == null || num2 == null) {
            string = null;
        } else {
            int iIntValue = num2.intValue();
            int iIntValue2 = num.intValue();
            if (iIntValue2 < 4) {
                string = context.getString(iIntValue == 1 ? R.string.msg_next_phase_1_day : R.string.msg_next_phase_multiple_days, String.valueOf(iIntValue));
            } else if (iIntValue2 == 4) {
                string = iIntValue == 1 ? context.getString(R.string.msg_next_period_1_day) : context.getString(R.string.msg_next_period_multiple_days, String.valueOf(iIntValue));
            } else {
                string = context.getString(R.string.pregnancy_title);
            }
        }
        return string == null ? "" : string;
    }

    public static final s K(j0 j0Var) {
        return j0Var.f48227l != m52.a.f116649e ? s.NumberOfTimes : s.RepeatUntil;
    }

    public static final int L(ud.a aVar) {
        aVar.getClass();
        ud.c cVarM0 = aVar.M0("SELECT changes()");
        try {
            cVarM0.J0();
            int i14 = (int) cVarM0.getLong(0);
            zf.b.h(cVarM0, null);
            return i14;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                zf.b.h(cVarM0, th3);
                throw th4;
            }
        }
    }

    public static final boolean M(String str, List list) {
        list.getClass();
        z0 z0Var = z0.f4390a;
        if (z0.b(x0.O0, str)) {
            if (list.isEmpty()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (h0.R(x.k(qs.x.RWD_WALK.f147220a, qs.x.RWD_STAND.f147220a), ((o1) it.next()).getSplitType())) {
                    return true;
                }
            }
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            String strZ0 = ((o1) it3.next()).getSplitType();
            if (strZ0 != null) {
                arrayList.add(strZ0);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            if (x.k(qs.x.RWD_RUN.f147220a, qs.x.RWD_WALK.f147220a, qs.x.RWD_STAND.f147220a).contains((String) it4.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean N(hz.f fVar, DateTime dateTime, DateTime dateTime2) {
        return k.e(fVar.f86396f, dateTime, dateTime2) || k.e(fVar.f86397g, dateTime, dateTime2) || k.e(fVar.f86398h, dateTime, dateTime2) || k.e(fVar.f86399i, dateTime, dateTime2);
    }

    public static o53.u0 O(l1 l1Var, o53.o1 o1Var) {
        return l1Var instanceof p1 ? ((p1) l1Var).e0(true, o1Var) : l1Var.w(o1Var.i(), true, new n1(o1Var));
    }

    public static final boolean P(t13.g gVar) {
        l1 l1Var = (l1) gVar.get(l1.f129368i0);
        if (l1Var != null) {
            return l1Var.isActive();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object Q(Collection collection, v13.c cVar) {
        o53.e eVar;
        Iterator it;
        if (cVar instanceof o53.e) {
            eVar = (o53.e) cVar;
            int i14 = eVar.f129332c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f129332c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new o53.e(cVar);
            }
        } else {
            eVar = new o53.e(cVar);
        }
        Object obj = eVar.f129331b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f129332c;
        if (i15 == 0) {
            r.b(obj);
            it = collection.iterator();
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = eVar.f129330a;
            r.b(obj);
        }
        while (it.hasNext()) {
            l1 l1Var = (l1) it.next();
            eVar.f129330a = it;
            eVar.f129332c = 1;
            if (l1Var.P(eVar) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:18:0x0051 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:19:0x0052). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object R(o53.l1[] r6, v13.c r7) {
        /*
            boolean r0 = r7 instanceof o53.d
            if (r0 == 0) goto L13
            r0 = r7
            o53.d r0 = (o53.d) r0
            int r1 = r0.f129322e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129322e = r1
            goto L18
        L13:
            o53.d r0 = new o53.d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f129321d
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f129322e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L30
            int r6 = r0.f129320c
            int r2 = r0.f129319b
            java.lang.Object[] r4 = r0.f129318a
            o53.l1[] r4 = (o53.l1[]) r4
            o13.r.b(r7)
            r7 = r4
            goto L52
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r6)
            r6 = 0
            return r6
        L37:
            o13.r.b(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L3f:
            if (r2 >= r6) goto L54
            r4 = r7[r2]
            r0.f129318a = r7
            r0.f129319b = r2
            r0.f129320c = r6
            r0.f129322e = r3
            java.lang.Object r4 = r4.P(r0)
            if (r4 != r1) goto L52
            return r1
        L52:
            int r2 = r2 + r3
            goto L3f
        L54:
            kotlin.Unit r6 = p005kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.i.R(o53.l1[], v13.c):java.lang.Object");
    }

    public static final d0 S(e23.l lVar) {
        f0 f0Var = new f0();
        lVar.invoke(f0Var);
        String str = f0Var.f111765d;
        if (str == null && f0Var.f111766e == null) {
            vb.h.z("The NavDeepLink must have an uri, action, and/or mimeType.");
            return null;
        }
        d0.a aVar = f0Var.f111762a;
        if (str != null) {
            aVar.getClass();
            aVar.f111748a = str;
        }
        String str2 = f0Var.f111766e;
        if (str2 != null) {
            aVar.b(str2);
        }
        return aVar.a();
    }

    public static x33.f T(x33.f fVar, String str, String str2, int i14) {
        char cCharAt;
        char cCharAt2;
        Object next;
        boolean z14 = (i14 & 4) != 0;
        if ((i14 & 8) != 0) {
            str2 = null;
        }
        if (!fVar.f188606b) {
            String strC = fVar.c();
            strC.getClass();
            if (u.y(strC, str, false) && strC.length() != str.length() && ('a' > (cCharAt = strC.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    return x33.f.e(str2.concat(w.O(strC, str)));
                }
                if (!z14) {
                    return fVar;
                }
                String strO = w.O(strC, str);
                if (strO.length() != 0 && w52.u0.s(0, strO)) {
                    if (strO.length() != 1 && w52.u0.s(1, strO)) {
                        Iterator<Integer> it = new j23.l(0, strO.length() - 1).iterator();
                        do {
                            if (!((j23.k) it).f96801c) {
                                next = null;
                                break;
                            }
                            next = ((p0) it).next();
                        } while (w52.u0.s(((Number) next).intValue(), strO));
                        Integer num = (Integer) next;
                        if (num != null) {
                            int iIntValue = num.intValue() - 1;
                            strO = w52.u0.v(strO.substring(0, iIntValue)).concat(strO.substring(iIntValue));
                        } else {
                            strO = w52.u0.v(strO);
                        }
                    } else if (strO.length() != 0 && 'A' <= (cCharAt2 = strO.charAt(0)) && cCharAt2 < '[') {
                        strO = Character.toLowerCase(cCharAt2) + strO.substring(1);
                    }
                }
                if (x33.f.f(strO)) {
                    return x33.f.e(strO);
                }
            }
        }
        return null;
    }

    public static final e U(m mVar) {
        mVar.L(-496803845);
        p3.x1 x1Var = p3.n.f135158a;
        f fVar = f.f76240a;
        g gVar = g.f76241a;
        d4.l lVar = d4.m.f57455a;
        e eVar = (e) d4.a.d(new Object[0], new d4.l(fVar, gVar), null, h.f76242a, mVar, 3072, 4);
        mVar.R();
        return eVar;
    }

    public static final k02.d V(f2.p0 p0Var, e23.p pVar, m mVar) {
        p0Var.getClass();
        pVar.getClass();
        p3.x1 x1Var = p3.n.f135158a;
        Object objQ = mVar.q();
        m.f135153a.getClass();
        Object obj = m.a.f135155b;
        if (objQ == obj) {
            objQ = l0.j(t13.h.f161748a, mVar);
            mVar.K(objQ);
        }
        b0 b0Var = (b0) objQ;
        boolean zB = mVar.B(p0Var);
        Object objQ2 = mVar.q();
        if (zB || objQ2 == obj) {
            objQ2 = new k02.d(p0Var, b0Var, pVar);
            mVar.K(objQ2);
        }
        k02.d dVar = (k02.d) objQ2;
        boolean zR = mVar.r(dVar) | mVar.B(p0Var);
        Object objQ3 = mVar.q();
        if (zR || objQ3 == obj) {
            objQ3 = new k02.g(dVar, p0Var, null);
            mVar.K(objQ3);
        }
        l0.e((e23.p) objQ3, dVar, mVar);
        return dVar;
    }

    public static LinkedHashSet W(x33.f fVar, Collection collection, Collection collection2, t23.e eVar, l43.w wVar, p005kotlin.reflect.jvm.internal.impl.resolve.b bVar, boolean z14) {
        if (fVar == null) {
            a(12);
            throw null;
        }
        if (collection == null) {
            a(13);
            throw null;
        }
        if (collection2 == null) {
            a(14);
            throw null;
        }
        if (eVar == null) {
            a(15);
            throw null;
        }
        if (wVar == null) {
            a(16);
            throw null;
        }
        if (bVar == null) {
            a(17);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        bVar.j(fVar, collection, collection2, eVar, new i33.a(wVar, linkedHashSet, z14));
        return linkedHashSet;
    }

    public static LinkedHashSet X(AbstractCollection abstractCollection, Collection collection, p005kotlin.reflect.jvm.internal.impl.resolve.b bVar, l43.w wVar, t23.e eVar, x33.f fVar) {
        if (fVar == null) {
            a(0);
            throw null;
        }
        if (collection == null) {
            a(2);
            throw null;
        }
        if (eVar == null) {
            a(3);
            throw null;
        }
        if (wVar == null) {
            a(4);
            throw null;
        }
        if (bVar != null) {
            return W(fVar, abstractCollection, collection, eVar, wVar, bVar, false);
        }
        a(5);
        throw null;
    }

    public static LinkedHashSet Y(AbstractCollection abstractCollection, Collection collection, p005kotlin.reflect.jvm.internal.impl.resolve.b bVar, l43.w wVar, t23.e eVar, x33.f fVar) {
        if (fVar == null) {
            a(6);
            throw null;
        }
        if (collection == null) {
            a(7);
            throw null;
        }
        if (eVar == null) {
            a(9);
            throw null;
        }
        if (wVar == null) {
            a(10);
            throw null;
        }
        if (bVar != null) {
            return W(fVar, collection, abstractCollection, eVar, wVar, bVar, true);
        }
        a(11);
        throw null;
    }

    public static final h4.r Z(h4.r rVar) {
        return v.c(new j02.r(4), rVar, false);
    }

    public static /* synthetic */ void a(int i14) {
        String str = i14 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i14 != 18 ? 3 : 2];
        switch (i14) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i14 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i14) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i14 == 18) {
            throw new IllegalStateException(str2);
        }
    }

    public static final o13.p a0(Object obj, Object obj2) {
        return new o13.p(obj, obj2);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    public static final void b(int i14, e23.a aVar, String str, m mVar) {
        String str2;
        aVar.getClass();
        o0 o0VarE = mVar.E(-1390553837);
        int i15 = i14 | 6 | (o0VarE.r(aVar) ? 32 : 16);
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            m0 m0VarI = gl1.y.I(new v0[0], o0VarE);
            boolean zR = o0VarE.r(m0VarI) | ((i15 & 112) == 32);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new jl0.b(m0VarI, aVar, i16);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new jl0.b(m0VarI, aVar, i16);
                    o0VarE.K(objQ);
                }
            }
            e23.l lVar = (e23.l) objQ;
            str2 = "DOWNLOADED_GOLF_COURSES_DESTINATION";
            nc.y.b(m0VarI, "DOWNLOADED_GOLF_COURSES_DESTINATION", null, null, null, null, null, null, lVar, o0VarE, 48, 1020);
        } else {
            o0VarE.e();
            str2 = str;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ao1.g(str2, aVar, i14, 17);
        }
    }

    public static final ArrayList b0(ArrayList arrayList) {
        nr.k kVarValueOf;
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jr.v vVarD = ((jr.u) it.next()).d();
            if (vVarD != null) {
                String upperCase = vVarD.name().toUpperCase(Locale.ROOT);
                upperCase.getClass();
                kVarValueOf = nr.k.valueOf(upperCase);
            } else {
                kVarValueOf = null;
            }
            if (kVarValueOf != null) {
                arrayList2.add(kVarValueOf);
            }
        }
        return arrayList2;
    }

    public static m1 c() {
        return new m1(null);
    }

    public static final ns2.a c0(ns2.a aVar) {
        boolean zIsEmpty;
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : aVar.f127815a) {
            ms2.e eVar = (ms2.e) obj;
            kj0.b.f104940a.getClass();
            s3.f23252a.getClass();
            if (s3.a("ROLE_MBTESTER")) {
                List<qs2.b> listZ3 = eVar.Z3();
                wr2.d dVar = wr2.d.f186837a;
                zIsEmpty = true;
                if (listZ3 == null || !listZ3.isEmpty()) {
                    for (qs2.b bVar : listZ3) {
                        dVar.getClass();
                        bVar.getClass();
                        if (!x.k(qs2.b.UNAPPROVED, qs2.b.REMOTE_CONFIG_DISABLED).contains(bVar)) {
                            zIsEmpty = false;
                            break;
                        }
                    }
                }
            } else {
                zIsEmpty = eVar.Z3().isEmpty();
            }
            if (zIsEmpty) {
                arrayList.add(obj);
            }
        }
        return new ns2.a(arrayList, aVar.f127816b);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    public static final void d(int i14, m mVar, int i15) {
        o0 o0VarE = mVar.E(-1030057226);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new w0(context, i14);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new w0(context, i14);
                    o0VarE.K(objQ);
                }
            }
            l0.a(unit, (e23.l) objQ, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.e(i14, i15, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    public static final void e(Long l14, e23.a aVar, m mVar, int i14) {
        o0 o0Var;
        aVar.getClass();
        o0 o0VarE = mVar.E(480460446);
        int i15 = 2;
        int i16 = (o0VarE.B(l14) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            c.p.f22335a.getClass();
            b.w wVarA = c.p.a(o0VarE);
            b.u onBackPressedDispatcher = wVarA != null ? wVarA.getOnBackPressedDispatcher() : null;
            m0 m0VarI = gl1.y.I(new v0[0], o0VarE);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zR = o0VarE.r(m0VarI) | o0VarE.r(onBackPressedDispatcher);
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (zR) {
                objQ = new ad0.c(m0VarI, onBackPressedDispatcher, i15);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ad0.c(m0VarI, onBackPressedDispatcher, i15);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            Object objQ2 = o0VarE.q();
            aVar2.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p3.p1 p1Var = (p3.p1) objQ2;
            g.h hVar = new g.h();
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new v2(p1Var, 25);
                o0VarE.K(objQ3);
            }
            o0Var = o0VarE;
            z02.b.a(false, null, null, null, false, z3.f.c(-1834106540, new b21.l0(m0VarI, (Object) aVar3, (Object) context, (Object) aVar, (Object) c.w.c(hVar, (e23.l) objQ3, o0VarE, 48), (Object) l14, (Object) p1Var, 15), o0VarE), o0Var, 196608, 31);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k41.e(l14, aVar, i14, 3);
        }
    }

    public static final n4.d f(long j8, long j14) {
        return new n4.d(Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)), Float.intBitsToFloat((int) (j14 >> 32)), Float.intBitsToFloat((int) (j14 & 4294967295L)));
    }

    public static final n4.d g(long j8, long j14) {
        int i14 = (int) (j8 >> 32);
        int i15 = (int) (j8 & 4294967295L);
        return new n4.d(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15), Float.intBitsToFloat((int) (j14 >> 32)) + Float.intBitsToFloat(i14), Float.intBitsToFloat((int) (j14 & 4294967295L)) + Float.intBitsToFloat(i15));
    }

    public static final void h(km1.r rVar, m mVar, int i14) {
        o0 o0Var;
        int i15;
        o0 o0VarE = mVar.E(-845974369);
        int i16 = (o0VarE.k(rVar == null ? -1 : rVar.ordinal()) ? 4 : 2) | i14 | 48;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            String string = null;
            if (rVar != null) {
                o0VarE.C(-1232545749);
                l22.a aVarS = a0.s(o0VarE);
                switch (gn1.g.f78087a[rVar.ordinal()]) {
                    case 1:
                        string = aVarS.getString(R.string.lbl_aligned);
                        break;
                    case 2:
                        string = aVarS.getString(R.string.lbl_ahead);
                        break;
                    case 3:
                        string = aVarS.getString(R.string.lbl_behind);
                        break;
                    case 4:
                        string = aVarS.getString(R.string.lbl_not_aligned);
                        break;
                    case 5:
                        string = aVarS.getString(R.string.lbl_irregular_rhythm);
                        break;
                    case 6:
                        string = aVarS.getString(R.string.lbl_use_for_three_weeks);
                        break;
                    case 7:
                        string = aVarS.getString(R.string.lbl_not_enough_data);
                        break;
                    case 8:
                        string = aVarS.getString(R.string.lbl_no_sleep_data_uppercase);
                        break;
                }
            } else {
                o0VarE.C(445787446);
            }
            o0VarE.g0(false);
            if (string == null) {
                string = "";
            }
            o0VarE.C(-1232541523);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(j92.f.f97928e, o0VarE);
            o0VarE.g0(false);
            o0Var = o0VarE;
            i15 = 1;
            mh.c(string, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0Var, 0, 0, 131070);
        } else {
            o0Var = o0VarE;
            i15 = 1;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fn1.g(rVar, i14, i15);
        }
    }

    public static final void i(mc mcVar, b0 b0Var, m mVar, int i14) {
        int i15;
        mc mcVar2;
        b0 b0Var2;
        b0Var.getClass();
        o0 o0VarE = mVar.E(1395272024);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(mcVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(b0Var) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            ln1.e.f113659a.getClass();
            int i16 = i15 << 3;
            mcVar2 = mcVar;
            b0Var2 = b0Var;
            kn1.e.a(R.string.lbl_restlessness, mcVar2, b0Var2, null, ln1.e.f113660b, o0VarE, (i16 & 112) | 24576 | (i16 & 896), 8);
        } else {
            mcVar2 = mcVar;
            b0Var2 = b0Var;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.a(mcVar2, b0Var2, i14, 27);
        }
    }

    public static final void j(m mVar, int i14) {
        o0 o0VarE = mVar.E(1601886028);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            h81.b.f82406a.getClass();
            h82.e.a(h81.b.f82411f, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h51.a(i14, 13);
        }
    }

    public static final void k(m mVar, int i14) {
        o0 o0VarE = mVar.E(1610662375);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            h81.b.f82406a.getClass();
            h82.e.a(h81.b.f82410e, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h51.a(i14, 12);
        }
    }

    public static final void l(l63.f fVar) {
        fVar.getClass();
        if ((fVar instanceof n63.m ? (n63.m) fVar : null) != null) {
            return;
        }
        vb.h.z(p6.b.h(s0.f105811a, fVar.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ")));
    }

    public static final ArrayList m(ns2.a aVar) {
        aVar.getClass();
        List<T> list = aVar.f127815a;
        w13.c cVar = qs2.e.f147411d;
        ArrayList arrayListK = n23.j.k(cVar);
        p13.c.b bVar = new p13.c.b();
        while (bVar.hasNext()) {
            Object next = bVar.next();
            qs2.e eVar = (qs2.e) next;
            if (aVar.f127816b) {
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (p13.u.z(((ms2.e) it.next()).getF206681b(), eVar)) {
                        }
                    }
                }
            }
            arrayListK.add(next);
        }
        return arrayListK;
    }

    public static final n63.h n(l63.e eVar) {
        eVar.getClass();
        n63.h hVar = eVar instanceof n63.h ? (n63.h) eVar : null;
        if (hVar != null) {
            return hVar;
        }
        vb.h.z(p6.b.h(s0.f105811a, eVar.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ")));
        return null;
    }

    public static final Object o(Collection collection, t13.d dVar) throws Throwable {
        if (collection.isEmpty()) {
            return p13.j0.f134944a;
        }
        o53.c cVar = new o53.c((i0[]) collection.toArray(new i0[0]));
        o53.k kVar = new o53.k(u13.f.b(dVar), 1);
        kVar.q();
        l1[] l1VarArr = cVar.f129312a;
        int length = l1VarArr.length;
        o53.c.a[] aVarArr = new o53.c.a[length];
        for (int i14 = 0; i14 < length; i14++) {
            l1 l1Var = l1VarArr[i14];
            l1Var.start();
            o53.c.a aVar = new o53.c.a(kVar);
            aVar.f129315f = O(l1Var, aVar);
            Unit unit = Unit.INSTANCE;
            aVarArr[i14] = aVar;
        }
        o53.c.b bVar = new o53.c.b(cVar, aVarArr);
        for (int i15 = 0; i15 < length; i15++) {
            o53.c.a aVar2 = aVarArr[i15];
            aVar2.getClass();
            o53.c.a.f129313h.set(aVar2, bVar);
        }
        if (kVar.e()) {
            bVar.b();
        } else {
            kVar.t(bVar);
        }
        Object objP = kVar.p();
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }

    public static final void p(t13.g gVar, CancellationException cancellationException) {
        l1 l1Var = (l1) gVar.get(l1.f129368i0);
        if (l1Var != null) {
            l1Var.c(cancellationException);
        }
    }

    public static void q(String str, l1 l1Var) {
        l1Var.c(gl1.d.a(str, null));
    }

    public static final Object r(l1 l1Var, v13.c cVar) {
        l1Var.c(null);
        Object objP = l1Var.P(cVar);
        return objP == u13.a.COROUTINE_SUSPENDED ? objP : Unit.INSTANCE;
    }

    public static void s(t13.g gVar) {
        c53.j<l1> jVarA;
        l1 l1Var = (l1) gVar.get(l1.f129368i0);
        if (l1Var == null || (jVarA = l1Var.a()) == null) {
            return;
        }
        Iterator<l1> it = jVarA.iterator();
        while (it.hasNext()) {
            it.next().c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:272:0x060b A[PHI: r10 r21
      0x060b: PHI (r10v91 java.lang.Integer) = 
      (r10v89 java.lang.Integer)
      (r10v89 java.lang.Integer)
      (r10v89 java.lang.Integer)
      (r10v90 java.lang.Integer)
      (r10v90 java.lang.Integer)
      (r10v90 java.lang.Integer)
      (r10v94 java.lang.Integer)
     binds: [B:300:0x0670, B:302:0x0676, B:310:0x068f, B:277:0x0620, B:279:0x0626, B:287:0x063f, B:271:0x0608] A[DONT_GENERATE, DONT_INLINE]
      0x060b: PHI (r21v83 int) = (r21v81 int), (r21v81 int), (r21v81 int), (r21v82 int), (r21v82 int), (r21v82 int), (r21v87 int) binds: [B:300:0x0670, B:302:0x0676, B:310:0x068f, B:277:0x0620, B:279:0x0626, B:287:0x063f, B:271:0x0608] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:377:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:379:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:380:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:384:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:386:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:388:0x080c  */
    /* JADX WARN: Code duplicated, block: B:390:0x081e  */
    /* JADX WARN: Code duplicated, block: B:391:0x0822  */
    /* JADX WARN: Code duplicated, block: B:393:0x082b  */
    /* JADX WARN: Code duplicated, block: B:395:0x0837  */
    /* JADX WARN: Code duplicated, block: B:448:0x098a A[PHI: r3 r10 r21 r28 r30 r31
      0x098a: PHI (r3v3 l22.a) = 
      (r3v1 l22.a)
      (r3v1 l22.a)
      (r3v1 l22.a)
      (r3v1 l22.a)
      (r3v1 l22.a)
      (r3v1 l22.a)
      (r3v1 l22.a)
      (r3v1 l22.a)
      (r3v1 l22.a)
      (r3v1 l22.a)
      (r3v1 l22.a)
      (r3v1 l22.a)
      (r3v1 l22.a)
      (r3v1 l22.a)
      (r3v1 l22.a)
      (r3v1 l22.a)
      (r3v1 l22.a)
      (r3v1 l22.a)
      (r3v1 l22.a)
      (r3v1 l22.a)
      (r3v1 l22.a)
      (r3v4 l22.a)
     binds: [B:638:0x0eb8, B:648:0x0eeb, B:649:0x0eed, B:589:0x0c5d, B:591:0x0c63, B:535:0x0b93, B:537:0x0b99, B:510:0x0b09, B:525:0x0b43, B:531:0x0b6b, B:486:0x0a84, B:501:0x0abc, B:507:0x0ae4, B:474:0x0a29, B:475:0x0a2b, B:477:0x0a35, B:483:0x0a63, B:455:0x09ae, B:456:0x09b0, B:458:0x09ba, B:464:0x09e2, B:447:0x0988] A[DONT_GENERATE, DONT_INLINE]
      0x098a: PHI (r10v77 java.lang.Integer) = 
      (r10v36 java.lang.Integer)
      (r10v36 java.lang.Integer)
      (r10v36 java.lang.Integer)
      (r10v70 java.lang.Integer)
      (r10v70 java.lang.Integer)
      (r10v71 java.lang.Integer)
      (r10v71 java.lang.Integer)
      (r10v73 java.lang.Integer)
      (r10v73 java.lang.Integer)
      (r10v73 java.lang.Integer)
      (r10v74 java.lang.Integer)
      (r10v74 java.lang.Integer)
      (r10v74 java.lang.Integer)
      (r10v75 java.lang.Integer)
      (r10v75 java.lang.Integer)
      (r10v75 java.lang.Integer)
      (r10v75 java.lang.Integer)
      (r10v76 java.lang.Integer)
      (r10v76 java.lang.Integer)
      (r10v76 java.lang.Integer)
      (r10v76 java.lang.Integer)
      (r10v78 java.lang.Integer)
     binds: [B:638:0x0eb8, B:648:0x0eeb, B:649:0x0eed, B:589:0x0c5d, B:591:0x0c63, B:535:0x0b93, B:537:0x0b99, B:510:0x0b09, B:525:0x0b43, B:531:0x0b6b, B:486:0x0a84, B:501:0x0abc, B:507:0x0ae4, B:474:0x0a29, B:475:0x0a2b, B:477:0x0a35, B:483:0x0a63, B:455:0x09ae, B:456:0x09b0, B:458:0x09ba, B:464:0x09e2, B:447:0x0988] A[DONT_GENERATE, DONT_INLINE]
      0x098a: PHI (r21v76 int) = 
      (r21v35 int)
      (r21v35 int)
      (r21v35 int)
      (r21v69 int)
      (r21v69 int)
      (r21v70 int)
      (r21v70 int)
      (r21v72 int)
      (r21v72 int)
      (r21v72 int)
      (r21v73 int)
      (r21v73 int)
      (r21v73 int)
      (r21v74 int)
      (r21v74 int)
      (r21v74 int)
      (r21v74 int)
      (r21v75 int)
      (r21v75 int)
      (r21v75 int)
      (r21v75 int)
      (r21v77 int)
     binds: [B:638:0x0eb8, B:648:0x0eeb, B:649:0x0eed, B:589:0x0c5d, B:591:0x0c63, B:535:0x0b93, B:537:0x0b99, B:510:0x0b09, B:525:0x0b43, B:531:0x0b6b, B:486:0x0a84, B:501:0x0abc, B:507:0x0ae4, B:474:0x0a29, B:475:0x0a2b, B:477:0x0a35, B:483:0x0a63, B:455:0x09ae, B:456:0x09b0, B:458:0x09ba, B:464:0x09e2, B:447:0x0988] A[DONT_GENERATE, DONT_INLINE]
      0x098a: PHI (r28v76 java.util.Iterator) = 
      (r28v35 java.util.Iterator)
      (r28v35 java.util.Iterator)
      (r28v35 java.util.Iterator)
      (r28v69 java.util.Iterator)
      (r28v69 java.util.Iterator)
      (r28v70 java.util.Iterator)
      (r28v70 java.util.Iterator)
      (r28v72 java.util.Iterator)
      (r28v72 java.util.Iterator)
      (r28v72 java.util.Iterator)
      (r28v73 java.util.Iterator)
      (r28v73 java.util.Iterator)
      (r28v73 java.util.Iterator)
      (r28v74 java.util.Iterator)
      (r28v74 java.util.Iterator)
      (r28v74 java.util.Iterator)
      (r28v74 java.util.Iterator)
      (r28v75 java.util.Iterator)
      (r28v75 java.util.Iterator)
      (r28v75 java.util.Iterator)
      (r28v75 java.util.Iterator)
      (r28v77 java.util.Iterator)
     binds: [B:638:0x0eb8, B:648:0x0eeb, B:649:0x0eed, B:589:0x0c5d, B:591:0x0c63, B:535:0x0b93, B:537:0x0b99, B:510:0x0b09, B:525:0x0b43, B:531:0x0b6b, B:486:0x0a84, B:501:0x0abc, B:507:0x0ae4, B:474:0x0a29, B:475:0x0a2b, B:477:0x0a35, B:483:0x0a63, B:455:0x09ae, B:456:0x09b0, B:458:0x09ba, B:464:0x09e2, B:447:0x0988] A[DONT_GENERATE, DONT_INLINE]
      0x098a: PHI (r30v76 java.util.ArrayList) = 
      (r30v35 java.util.ArrayList)
      (r30v35 java.util.ArrayList)
      (r30v35 java.util.ArrayList)
      (r30v69 java.util.ArrayList)
      (r30v69 java.util.ArrayList)
      (r30v70 java.util.ArrayList)
      (r30v70 java.util.ArrayList)
      (r30v72 java.util.ArrayList)
      (r30v72 java.util.ArrayList)
      (r30v72 java.util.ArrayList)
      (r30v73 java.util.ArrayList)
      (r30v73 java.util.ArrayList)
      (r30v73 java.util.ArrayList)
      (r30v74 java.util.ArrayList)
      (r30v74 java.util.ArrayList)
      (r30v74 java.util.ArrayList)
      (r30v74 java.util.ArrayList)
      (r30v75 java.util.ArrayList)
      (r30v75 java.util.ArrayList)
      (r30v75 java.util.ArrayList)
      (r30v75 java.util.ArrayList)
      (r30v77 java.util.ArrayList)
     binds: [B:638:0x0eb8, B:648:0x0eeb, B:649:0x0eed, B:589:0x0c5d, B:591:0x0c63, B:535:0x0b93, B:537:0x0b99, B:510:0x0b09, B:525:0x0b43, B:531:0x0b6b, B:486:0x0a84, B:501:0x0abc, B:507:0x0ae4, B:474:0x0a29, B:475:0x0a2b, B:477:0x0a35, B:483:0x0a63, B:455:0x09ae, B:456:0x09b0, B:458:0x09ba, B:464:0x09e2, B:447:0x0988] A[DONT_GENERATE, DONT_INLINE]
      0x098a: PHI (r31v76 int) = 
      (r31v35 int)
      (r31v35 int)
      (r31v35 int)
      (r31v69 int)
      (r31v69 int)
      (r31v70 int)
      (r31v70 int)
      (r31v72 int)
      (r31v72 int)
      (r31v72 int)
      (r31v73 int)
      (r31v73 int)
      (r31v73 int)
      (r31v74 int)
      (r31v74 int)
      (r31v74 int)
      (r31v74 int)
      (r31v75 int)
      (r31v75 int)
      (r31v75 int)
      (r31v75 int)
      (r31v77 int)
     binds: [B:638:0x0eb8, B:648:0x0eeb, B:649:0x0eed, B:589:0x0c5d, B:591:0x0c63, B:535:0x0b93, B:537:0x0b99, B:510:0x0b09, B:525:0x0b43, B:531:0x0b6b, B:486:0x0a84, B:501:0x0abc, B:507:0x0ae4, B:474:0x0a29, B:475:0x0a2b, B:477:0x0a35, B:483:0x0a63, B:455:0x09ae, B:456:0x09b0, B:458:0x09ba, B:464:0x09e2, B:447:0x0988] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:578:0x0c3b A[PHI: r1
      0x0c3b: PHI (r1v93 java.lang.Double) = (r1v85 java.lang.Double), (r1v96 java.lang.Double) binds: [B:585:0x0c51, B:577:0x0c39] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:579:0x0c40  */
    /* JADX WARN: Code duplicated, block: B:581:0x0c44  */
    /* JADX WARN: Code duplicated, block: B:584:0x0c4f  */
    /* JADX WARN: Code duplicated, block: B:587:0x0c54  */
    /* JADX WARN: Code duplicated, block: B:690:0x1119  */
    /* JADX WARN: Code duplicated, block: B:692:0x111d  */
    /* JADX WARN: Code duplicated, block: B:695:0x1126  */
    /* JADX WARN: Code duplicated, block: B:697:0x1136  */
    /* JADX WARN: Code duplicated, block: B:708:0x085c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:755:0x0846 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v126 */
    /* JADX WARN: Type inference failed for: r10v127 */
    /* JADX WARN: Type inference failed for: r1v115 */
    /* JADX WARN: Type inference failed for: r1v155 */
    /* JADX WARN: Type inference failed for: r1v156 */
    /* JADX WARN: Type inference failed for: r1v157 */
    /* JADX WARN: Type inference failed for: r1v159 */
    /* JADX WARN: Type inference failed for: r1v160, types: [lm.c] */
    /* JADX WARN: Type inference failed for: r1v161 */
    /* JADX WARN: Type inference failed for: r1v162, types: [lm.c] */
    /* JADX WARN: Type inference failed for: r1v178, types: [im.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v182 */
    /* JADX WARN: Type inference failed for: r1v183 */
    /* JADX WARN: Type inference failed for: r1v184 */
    /* JADX WARN: Type inference failed for: r1v185 */
    /* JADX WARN: Type inference failed for: r1v186 */
    /* JADX WARN: Type inference failed for: r1v187 */
    /* JADX WARN: Type inference failed for: r1v188 */
    /* JADX WARN: Type inference failed for: r1v189 */
    /* JADX WARN: Type inference failed for: r1v190 */
    /* JADX WARN: Type inference failed for: r1v191 */
    /* JADX WARN: Type inference failed for: r1v192 */
    /* JADX WARN: Type inference failed for: r1v193 */
    /* JADX WARN: Type inference failed for: r1v194 */
    /* JADX WARN: Type inference failed for: r1v195 */
    /* JADX WARN: Type inference failed for: r1v196 */
    /* JADX WARN: Type inference failed for: r1v197 */
    /* JADX WARN: Type inference failed for: r1v198 */
    /* JADX WARN: Type inference failed for: r1v199 */
    /* JADX WARN: Type inference failed for: r1v200 */
    /* JADX WARN: Type inference failed for: r1v201 */
    /* JADX WARN: Type inference failed for: r1v202 */
    /* JADX WARN: Type inference failed for: r1v203 */
    /* JADX WARN: Type inference failed for: r1v204 */
    /* JADX WARN: Type inference failed for: r1v205 */
    /* JADX WARN: Type inference failed for: r1v206 */
    /* JADX WARN: Type inference failed for: r1v207 */
    /* JADX WARN: Type inference failed for: r1v208 */
    /* JADX WARN: Type inference failed for: r1v209 */
    /* JADX WARN: Type inference failed for: r1v210 */
    /* JADX WARN: Type inference failed for: r1v211 */
    /* JADX WARN: Type inference failed for: r1v212 */
    /* JADX WARN: Type inference failed for: r1v213 */
    /* JADX WARN: Type inference failed for: r1v214 */
    /* JADX WARN: Type inference failed for: r1v215 */
    /* JADX WARN: Type inference failed for: r1v216 */
    /* JADX WARN: Type inference failed for: r1v217 */
    /* JADX WARN: Type inference failed for: r1v218 */
    /* JADX WARN: Type inference failed for: r1v219 */
    /* JADX WARN: Type inference failed for: r1v220 */
    /* JADX WARN: Type inference failed for: r1v221 */
    /* JADX WARN: Type inference failed for: r1v222 */
    /* JADX WARN: Type inference failed for: r1v223 */
    /* JADX WARN: Type inference failed for: r1v224 */
    /* JADX WARN: Type inference failed for: r1v225 */
    /* JADX WARN: Type inference failed for: r1v226 */
    /* JADX WARN: Type inference failed for: r1v227 */
    /* JADX WARN: Type inference failed for: r1v228 */
    /* JADX WARN: Type inference failed for: r1v229 */
    /* JADX WARN: Type inference failed for: r1v230 */
    /* JADX WARN: Type inference failed for: r1v231 */
    /* JADX WARN: Type inference failed for: r1v232 */
    /* JADX WARN: Type inference failed for: r1v233 */
    /* JADX WARN: Type inference failed for: r1v234 */
    /* JADX WARN: Type inference failed for: r1v235 */
    /* JADX WARN: Type inference failed for: r1v236 */
    /* JADX WARN: Type inference failed for: r1v237 */
    /* JADX WARN: Type inference failed for: r1v238 */
    /* JADX WARN: Type inference failed for: r1v239 */
    /* JADX WARN: Type inference failed for: r1v240 */
    /* JADX WARN: Type inference failed for: r1v241 */
    /* JADX WARN: Type inference failed for: r1v242 */
    /* JADX WARN: Type inference failed for: r1v243 */
    /* JADX WARN: Type inference failed for: r1v244 */
    /* JADX WARN: Type inference failed for: r1v245 */
    /* JADX WARN: Type inference failed for: r1v246 */
    /* JADX WARN: Type inference failed for: r1v247 */
    /* JADX WARN: Type inference failed for: r1v248 */
    /* JADX WARN: Type inference failed for: r1v249 */
    /* JADX WARN: Type inference failed for: r1v250 */
    /* JADX WARN: Type inference failed for: r1v251 */
    /* JADX WARN: Type inference failed for: r1v252 */
    /* JADX WARN: Type inference failed for: r1v253 */
    /* JADX WARN: Type inference failed for: r1v254 */
    /* JADX WARN: Type inference failed for: r1v255 */
    /* JADX WARN: Type inference failed for: r1v256 */
    /* JADX WARN: Type inference failed for: r1v257 */
    /* JADX WARN: Type inference failed for: r1v258 */
    /* JADX WARN: Type inference failed for: r1v259 */
    /* JADX WARN: Type inference failed for: r1v260 */
    /* JADX WARN: Type inference failed for: r1v261 */
    /* JADX WARN: Type inference failed for: r1v262 */
    /* JADX WARN: Type inference failed for: r1v263 */
    /* JADX WARN: Type inference failed for: r1v264 */
    /* JADX WARN: Type inference failed for: r1v265 */
    /* JADX WARN: Type inference failed for: r1v266 */
    /* JADX WARN: Type inference failed for: r1v267 */
    /* JADX WARN: Type inference failed for: r1v268 */
    /* JADX WARN: Type inference failed for: r1v269 */
    /* JADX WARN: Type inference failed for: r1v270 */
    /* JADX WARN: Type inference failed for: r1v271 */
    /* JADX WARN: Type inference failed for: r1v272 */
    /* JADX WARN: Type inference failed for: r1v273 */
    /* JADX WARN: Type inference failed for: r1v88 */
    /* JADX WARN: Type inference failed for: r2v14, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r45v0, types: [java.lang.Object, rr.a] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v17 java.lang.Object, still in use, count: 2, list:
          (r4v17 java.lang.Object) from 0x0c31: PHI (r4 I:??) = (r4v14 java.lang.Object), (r4v17 java.lang.Object) binds: [B:573:0x0c2f, B:764:0x0c31] A[DONT_GENERATE, DONT_INLINE]
          (r4v17 java.lang.Object) from 0x0c1e: CHECK_CAST (ps.o1) (r4v17 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static final java.util.ArrayList t(rr.a r45, java.util.ArrayList r46) {
        /*
            Method dump skipped, instruction units count: 4656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.i.t(rr.a, java.util.ArrayList):java.util.ArrayList");
    }

    public static final m0 u(Context context) {
        m0 m0Var = new m0(context);
        qc.h hVar = m0Var.f111904b;
        lc.w0 w0Var = hVar.f144333t;
        lc.w0 w0Var2 = hVar.f144333t;
        w0Var.a(new nc.d(w0Var2));
        w0Var2.a(new nc.e());
        w0Var2.a(new nc.k());
        return m0Var;
    }

    public static final void v(t13.g gVar) {
        l1 l1Var = (l1) gVar.get(l1.f129368i0);
        if (l1Var != null && !l1Var.isActive()) {
            throw l1Var.Q();
        }
    }

    public static final Activity w(Context context) {
        context.getClass();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        baseContext.getClass();
        return w(baseContext);
    }

    public static final int x(int i14, CharSequence charSequence) {
        int length = charSequence.length();
        while (i14 < length) {
            if (charSequence.charAt(i14) == '\n') {
                return i14;
            }
            i14++;
        }
        return charSequence.length();
    }

    public static final int y(int i14, CharSequence charSequence) {
        while (i14 > 0) {
            if (charSequence.charAt(i14 - 1) == '\n') {
                return i14;
            }
            i14--;
        }
        return 0;
    }

    public static j1 z(x33.f fVar, t23.e eVar) {
        if (fVar == null) {
            a(19);
            throw null;
        }
        if (eVar == null) {
            a(20);
            throw null;
        }
        Collection<t23.d> collectionN = eVar.n();
        if (collectionN.size() != 1) {
            return null;
        }
        for (j1 j1Var : collectionN.iterator().next().f()) {
            if (j1Var.getName().equals(fVar)) {
                return j1Var;
            }
        }
        return null;
    }
}
