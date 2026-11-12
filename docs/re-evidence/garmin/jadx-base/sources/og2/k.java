package og2;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.s1;
import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.samd.repository.UnexpectedResponseCodeException;
import i3.e5;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import l72.c1;
import o4.t1;
import o4.u1;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.n2;
import p3.p1;
import p3.p2;
import p3.x1;
import p43.a2;
import p43.g2;
import p43.n1;
import p43.o1;
import p43.v1;
import p43.w1;
import r1.q2;
import t23.d1;
import t23.y0;
import t70.a1;
import v2.h1;
import v62.h6;
import w23.w0;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List f132050a;

    public static final float A(float f14, float f15, float f16, float f17, float f18) {
        if (f16 == f15) {
            return f17;
        }
        return (((f18 - f17) * (f14 - f15)) / (f16 - f15)) + f17;
    }

    public static final void B(u2.d dVar) {
        h1 h1Var = dVar.f167831b;
        int length = h1Var.length();
        int length2 = h1Var.length() + 1;
        if (length < 0 || length >= length2) {
            b2.e.a("Expected " + length + " to be in [0, " + length2 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        dVar.f167833d = og.a.l(length, length);
    }

    public static final ArrayList C(List list, List list2, p3.m mVar, int i14) {
        List list3;
        p3.m mVar2;
        ArrayList arrayList;
        x1 x1Var = p3.n.f135158a;
        Object objQ = mVar.q();
        p3.m.f135153a.getClass();
        p3.m.a.C2565a c2565a = p3.m.a.f135155b;
        if (objQ == c2565a) {
            objQ = new LinkedHashSet();
            mVar.K(objQ);
        }
        Set set = (Set) objQ;
        Object objQ2 = mVar.q();
        if (objQ2 == c2565a) {
            objQ2 = new LinkedHashSet();
            mVar.K(objQ2);
        }
        Set set2 = (Set) objQ2;
        mVar.C(110758886);
        if (list instanceof RandomAccess) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            int i15 = 0;
            while (i15 < size) {
                List list4 = list2;
                arrayList.add(q((sc.h) list.get(i15), list4, set, set2, mVar, i14 & 112));
                i15++;
                list2 = list4;
            }
            list3 = list2;
            mVar2 = mVar;
        } else {
            list3 = list2;
            mVar2 = mVar;
            arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(q((sc.h) it.next(), list3, set, set2, mVar2, i14 & 112));
            }
        }
        ArrayList arrayList2 = arrayList;
        mVar2.f();
        k(arrayList2, list3, set, set2, mVar2, i14 & 112);
        x1 x1Var2 = p3.n.f135158a;
        return arrayList2;
    }

    public static final t23.e D(t23.c0 c0Var, x33.c cVar, b33.b bVar) {
        i43.l lVarB0;
        c0Var.getClass();
        cVar.getClass();
        bVar.getClass();
        x33.d dVar = cVar.f188596a;
        if (!dVar.c()) {
            t23.h hVarF = ((i43.a) c0Var.d0(cVar.b()).i()).f(dVar.g(), bVar);
            t23.e eVar = hVarF instanceof t23.e ? (t23.e) hVarF : null;
            if (eVar != null) {
                return eVar;
            }
            t23.e eVarD = D(c0Var, cVar.b(), bVar);
            t23.h hVarF2 = (eVarD == null || (lVarB0 = eVarD.b0()) == null) ? null : lVarB0.f(dVar.g(), bVar);
            if (hVarF2 instanceof t23.e) {
                return (t23.e) hVarF2;
            }
        }
        return null;
    }

    public static final void E(u2.d dVar, int i14, int i15) {
        dVar.f(og.a.l(j23.t.e(i14, 0, dVar.f167831b.length()), j23.t.e(i15, 0, dVar.f167831b.length())));
    }

    public static final void F(int i14, Context context, Drawable drawable) {
        context.getClass();
        if (drawable != null) {
            drawable.mutate().setTint(a7.b.getColor(context, i14));
        }
    }

    public static final void G(Toolbar toolbar, String str) {
        str.getClass();
        int childCount = toolbar.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            if (toolbar.getChildAt(i14) instanceof TextView) {
                View childAt = toolbar.getChildAt(i14);
                childAt.getClass();
                ((TextView) childAt).setText(str);
            } else {
                toolbar.setTitle(str);
            }
        }
    }

    public static a2 H(List list, w1 w1Var, t23.l lVar, ArrayList arrayList) {
        if (w1Var == null) {
            a(1);
            throw null;
        }
        if (lVar == null) {
            a(2);
            throw null;
        }
        if (arrayList == null) {
            a(3);
            throw null;
        }
        a2 a2VarI = I(list, w1Var, lVar, arrayList, null);
        if (a2VarI != null) {
            return a2VarI;
        }
        vb.h.q("Substitution failed");
        return null;
    }

    public static a2 I(List list, w1 w1Var, t23.l lVar, List list2, boolean[] zArr) {
        if (w1Var == null) {
            a(6);
            throw null;
        }
        if (lVar == null) {
            a(7);
            throw null;
        }
        if (list2 == null) {
            a(8);
            throw null;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            d1 d1Var = (d1) it.next();
            w0 w0VarG0 = w0.G0(lVar, d1Var.getAnnotations(), d1Var.r(), d1Var.m(), d1Var.getName(), i14, y0.f162076a, d1Var.o0());
            map.put(d1Var.h(), new v1(w0VarG0.p()));
            map2.put(d1Var, w0VarG0);
            list2.add(w0VarG0);
            i14++;
        }
        o1.f135897b.getClass();
        n1 n1Var = new n1(map, false);
        a2 a2VarF = a2.f(w1Var, n1Var);
        a2 a2VarF2 = a2.f(new p43.x1(w1Var), n1Var);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            d1 d1Var2 = (d1) it3.next();
            w0 w0Var = (w0) map2.get(d1Var2);
            for (p43.n0 n0Var : d1Var2.getUpperBounds()) {
                t23.h hVarT = n0Var.F0().t();
                p43.n0 n0VarJ = (((hVarT instanceof d1) && o72.t.Q((d1) hVarT, null, null)) ? a2VarF : a2VarF2).j(g2.OUT_VARIANCE, n0Var);
                if (n0VarJ == null) {
                    return null;
                }
                if (n0VarJ != n0Var && zArr != null) {
                    zArr[0] = true;
                }
                if (w0Var.f181722m) {
                    vb.h.z("Type parameter descriptor is already initialized: ".concat(w0Var.I0()));
                    return null;
                }
                if (!o72.t.R(n0VarJ)) {
                    w0Var.f181721l.add(n0VarJ);
                }
            }
            if (w0Var.f181722m) {
                vb.h.z("Type parameter descriptor is already initialized: ".concat(w0Var.I0()));
                return null;
            }
            w0Var.f181722m = true;
        }
        return a2VarF;
    }

    public static final long J(long j8, long j14, long j15, String str) {
        String property;
        int i14 = u53.y.f168775a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j8;
        }
        Long lJ = d53.t.j(property);
        if (lJ == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + CoreConstants.SINGLE_QUOTE_CHAR).toString());
        }
        long jLongValue = lJ.longValue();
        if (j14 <= jLongValue && jLongValue <= j15) {
            return jLongValue;
        }
        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(j14, "System property '", str, "' should be in range ");
        j20.x.j(j15, CallerDataConverter.DEFAULT_RANGE_DELIMITER, ", but is '", sbJ);
        sbJ.append(jLongValue);
        sbJ.append(CoreConstants.SINGLE_QUOTE_CHAR);
        throw new IllegalStateException(sbJ.toString().toString());
    }

    public static int K(int i14, int i15, String str) {
        return (int) J(i14, 1, (i15 & 8) != 0 ? Integer.MAX_VALUE : 2097150, str);
    }

    public static final uk0.a L(jk0.s sVar) {
        sVar.getClass();
        String str = sVar.f99322a;
        c80.u uVar = sVar.f99324c;
        String str2 = sVar.f99328g;
        String str3 = sVar.f99329h;
        if (str3 == null) {
            str3 = "";
        }
        return new uk0.a(str, uVar, str2, str3, sVar.f99330i);
    }

    public static final uk0.a M(jk0.x xVar) {
        String strC = xVar.f99356f;
        if (strC == null) {
            strC = kg.f.c();
        }
        c80.u uVar = xVar.f99351a;
        String str = xVar.f99358h;
        String str2 = xVar.f99359i;
        if (str2 == null) {
            str2 = "";
        }
        return new uk0.a(strC, uVar, str, str2, xVar.f99360j);
    }

    public static final uk0.g N(jk0.s sVar) {
        sVar.getClass();
        String str = sVar.f99322a;
        c80.u uVar = sVar.f99324c;
        String str2 = sVar.f99328g;
        String str3 = sVar.f99329h;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = sVar.f99330i;
        Integer num = sVar.f99334m;
        return new uk0.g(str, uVar, str2, str3, str4, num != null ? num.intValue() : 0, sVar.f99325d, sVar.f99326e, sVar.f99331j, sVar.f99332k, sVar.f99333l, sVar.f99335n, sVar.f99336o, sVar.f99327f == jk0.p.Retired, sVar.f99334m, sVar.f99337p);
    }

    public static final jk0.x O(com.garmin.android.apps.connectmobile.gear.presentation.navigation.b bVar) {
        ArrayList arrayList;
        bVar.getClass();
        c80.u uVar = bVar.f35695a;
        b63.o oVar = bVar.f35696b;
        c80.w wVar = bVar.f35697c;
        List<jk0.g> list = bVar.f35698d;
        jk0.p pVar = bVar.f35699e;
        String str = bVar.f35700f;
        Long l14 = bVar.f35701g;
        String str2 = bVar.f35702h;
        String str3 = bVar.f35703i;
        String str4 = bVar.f35704j;
        String str5 = bVar.f35705k;
        b63.o oVar2 = bVar.f35706l;
        b63.o oVar3 = bVar.f35707m;
        Double d14 = bVar.f35708n;
        Long l15 = bVar.f35709o;
        Integer num = bVar.f35710p;
        Long l16 = bVar.f35711q;
        Double d15 = bVar.f35712r;
        Long l17 = bVar.f35713t;
        List<jk0.e> list2 = bVar.f35714v;
        List<com.garmin.android.apps.connectmobile.gear.presentation.navigation.a> list3 = bVar.f35715w;
        if (list3 != null) {
            arrayList = new ArrayList(p13.y.r(list3, 10));
            for (Iterator it = list3.iterator(); it.hasNext(); it = it) {
                com.garmin.android.apps.connectmobile.gear.presentation.navigation.a aVar = (com.garmin.android.apps.connectmobile.gear.presentation.navigation.a) it.next();
                aVar.getClass();
                arrayList.add(new jk0.n(aVar.f35687a, aVar.f35688b, aVar.f35689c, aVar.f35690d, aVar.f35691e, aVar.f35692f));
            }
        } else {
            arrayList = null;
        }
        return new jk0.x(uVar, oVar, wVar, list, pVar, str, l14, str2, str3, str4, str5, oVar2, oVar3, d14, l15, num, l16, d15, l17, list2, arrayList, bVar.f35716x, bVar.f35717y);
    }

    public static final g01.x P(q01.e eVar) {
        eVar.getClass();
        Long l14 = eVar.f141994b;
        String str = eVar.f141995c;
        int i14 = eVar.f141993a;
        Integer num = eVar.f142001i;
        b63.v vVar = eVar.f141999g;
        b63.v vVar2 = eVar.f142000h;
        boolean z14 = eVar.f141997e;
        boolean z15 = eVar.f141996d;
        boolean z16 = eVar.f141998f;
        v21.f fVar = v21.f.f175333a;
        k01.d dVar = eVar.f142002j;
        fVar.getClass();
        return new g01.x(l14, Integer.valueOf(i14), str, num, vVar, vVar2, v21.f.z(dVar), Boolean.valueOf(z14), Boolean.valueOf(z15), Boolean.valueOf(z16), eVar.f142004l, (b63.o) null, 2048, (p005kotlin.jvm.internal.j) null);
    }

    public static final q90.e Q(l90.b bVar) {
        bVar.getClass();
        String str = bVar.f111516a;
        boolean z14 = bVar.f111517b;
        boolean z15 = bVar.f111518c;
        List<String> list = bVar.f111519d;
        String str2 = bVar.f111521f;
        String str3 = bVar.f111522g;
        String str4 = bVar.f111523h;
        String str5 = bVar.f111524i;
        String str6 = bVar.f111526k.f130962a;
        if (str6 == null) {
            str6 = "";
        }
        return new q90.e(0L, str, z14, z15, list, str2, str3, str4, str5, str6, bVar.f111525j, 1, null);
    }

    public static final Map R(List list) {
        String str;
        if (list == null) {
            p13.k0 k0Var = p13.k0.f134949a;
            k0Var.getClass();
            return k0Var;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g01.x xVar = (g01.x) it.next();
            String str2 = xVar.f74284k;
            o13.p pVar = null;
            if (str2 != null && (str = xVar.f74276c) != null) {
                Boolean bool = xVar.f74283j;
                pVar = new o13.p(str2, new q01.j(str, bool != null ? bool.booleanValue() : false));
            }
            if (pVar != null) {
                arrayList.add(pVar);
            }
        }
        return p13.u0.l(arrayList);
    }

    public static /* synthetic */ void a(int i14) {
        String str = i14 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i14 != 4 ? 3 : 2];
        switch (i14) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i14 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i14 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i14 == 4) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d2  */
    public static final void b(e23.a aVar, e23.a aVar2, e23.a aVar3, p3.m mVar, int i14) {
        int i15;
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        p3.o0 o0VarE = mVar.E(-1475416929);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar3) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            c1 c1Var = c1.f110940a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_stp_benchmarking_week_dialog_title);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_stp_benchmarking_week_dialog_message);
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_stp_benchmarking_week_dialog_add_week_option);
            String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_stp_benchmarking_week_dialog_leave_plan_option);
            String strQ5 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
            int i16 = i15 & 896;
            boolean z14 = ((i15 & 14) == 4) | (i16 == 256);
            Object objQ = o0VarE.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (z14) {
                objQ = new at1.e(aVar, aVar3, 9);
                o0VarE.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new at1.e(aVar, aVar3, 9);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar5 = (e23.a) objQ;
            boolean z15 = ((i15 & 112) == 32) | (i16 == 256);
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new at1.e(aVar2, aVar3, 10);
                o0VarE.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new at1.e(aVar2, aVar3, 10);
                    o0VarE.K(objQ2);
                }
            }
            c1Var.b(false, strQ, strQ2, strQ3, strQ4, strQ5, false, aVar5, (e23.a) objQ2, aVar3, aVar3, o0VarE, 0, ((i15 << 3) & 7168) | ((i15 << 6) & 57344), 1817);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s70.n(aVar, aVar2, aVar3, i14, 25);
        }
    }

    public static final void c(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(753199705);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            t11.a.f161712a.getClass();
            h82.e.a(t11.a.f161713b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sv0.b(i14, 22);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    public static final void d(ta0.x xVar, e23.a aVar, p3.m mVar, int i14) {
        xVar.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-1022731891);
        int i15 = i14 | (o0VarE.r(xVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16);
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            c1 c1Var = c1.f110940a;
            String strQ = gl1.y.Q(o0VarE, R.string.pairing_list_download_failed);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_try_again);
            boolean zR = o0VarE.r(xVar);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new ta0.c(xVar, i16);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ta0.c(xVar, i16);
                    o0VarE.K(objQ);
                }
            }
            c1Var.a(false, null, strQ, null, null, strQ2, false, false, (e23.a) objQ, gl1.y.Q(o0VarE, R.string.lbl_cancel), aVar, o0VarE, 6, (i15 >> 3) & 14, 218);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sg0.m(xVar, aVar, i14, 14);
        }
    }

    public static final void e(e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        p3.o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, -163893726);
        int i15 = i14 | (o0VarP.r(aVar) ? 4 : 2) | (o0VarP.r(aVar2) ? 32 : 16);
        if (o0VarP.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            c1.f110940a.a(false, gl1.y.Q(o0VarP, R.string.lbl_remove_personal_record_dialog_title), gl1.y.Q(o0VarP, R.string.lbl_remove_personal_record_dialog_content), null, null, gl1.y.Q(o0VarP, R.string.lbl_remove), true, false, aVar, gl1.y.Q(o0VarP, R.string.lbl_cancel), aVar2, o0VarP, ((i15 << 24) & 234881024) | 1572870, (i15 >> 3) & 14, SyslogConstants.LOG_LOCAL3);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new nw0.l(aVar, aVar2, i14, 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d5  */
    public static final void f(Long l14, e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        p3.o0 o0Var;
        String str;
        p3.o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, -1610375854);
        int i15 = i14 | (o0VarP.B(l14) ? 4 : 2) | (o0VarP.r(aVar) ? 32 : 16) | (o0VarP.r(aVar2) ? 256 : 128);
        if (o0VarP.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarP.A(AndroidCompositionLocals_androidKt.f6042b);
            new yw.b(context);
            c1 c1Var = c1.f110940a;
            context.getClass();
            if (l14 == null || l14.longValue() <= 0) {
                str = "";
            } else {
                str = DateFormat.getTimeFormat(context).format(new Date(l14.longValue()));
                str.getClass();
            }
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            String strP = gl1.y.P(R.string.lbl_delete_specific_reading, new Object[]{upperCase}, o0VarP);
            String strQ = gl1.y.Q(o0VarP, R.string.lbl_delete);
            String strQ2 = gl1.y.Q(o0VarP, R.string.common_cancel);
            boolean z14 = (i15 & 896) == 256;
            Object objQ = o0VarP.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (z14) {
                objQ = new a1(aVar2, 22);
                o0VarP.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a1(aVar2, 22);
                    o0VarP.K(objQ);
                }
            }
            e23.a<Unit> aVar4 = (e23.a) objQ;
            boolean z15 = (i15 & 112) == 32;
            Object objQ2 = o0VarP.q();
            if (z15) {
                objQ2 = new a1(aVar, 23);
                o0VarP.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new a1(aVar, 23);
                    o0VarP.K(objQ2);
                }
            }
            o0Var = o0VarP;
            c1Var.a(false, null, strP, null, null, strQ, false, false, aVar4, strQ2, (e23.a) objQ2, o0Var, 6, 0, 218);
        } else {
            o0Var = o0VarP;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t42.c(l14, aVar, aVar2, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:69:0x010e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0119  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    public static final void g(String str, e23.a aVar, e23.a aVar2, boolean z14, e23.p pVar, z3.e eVar, p3.m mVar, int i14, int i15) {
        int i16;
        boolean z15;
        int i17;
        e23.p pVar2;
        int i18;
        boolean z16;
        boolean z17;
        e23.p pVar3;
        p2 p2VarI0;
        boolean z18;
        e23.p pVar4;
        Object objQ;
        int i19;
        str.getClass();
        aVar.getClass();
        aVar2.getClass();
        p3.o0 o0VarE = mVar.E(-739136242);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(aVar2) ? 256 : 128;
        }
        int i24 = i15 & 8;
        if (i24 == 0) {
            if ((i14 & 3072) == 0) {
                z15 = z14;
                i16 |= o0VarE.h(z15) ? 2048 : 1024;
            }
            i17 = i15 & 16;
            if (i17 != 0) {
                if ((i14 & 24576) == 0) {
                    pVar2 = pVar;
                    if (o0VarE.r(pVar2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i16 |= i18;
                }
                if ((196608 & i14) == 0) {
                    if (o0VarE.r(eVar)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i16 |= i19;
                }
                if ((74899 & i16) != 74898) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i16 & 1, z16)) {
                    if (i24 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i17 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar2;
                    }
                    x1 x1Var = p3.n.f135158a;
                    Object[] objArr = new Object[0];
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new qr.n(25);
                        o0VarE.K(objQ);
                    }
                    p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
                    z02.d.a(z18, z3.f.c(39299305, new pp.g(str, 10, aVar2, p1Var), o0VarE), pVar4, null, null, z3.f.c(-2081748891, new pp.g(eVar, 11, aVar, p1Var), o0VarE), o0VarE, ((i16 >> 9) & 14) | 196656 | ((i16 >> 6) & 896), 24);
                    z17 = z18;
                    pVar3 = pVar4;
                } else {
                    o0VarE.e();
                    z17 = z15;
                    pVar3 = pVar2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new d62.o(str, aVar, aVar2, z17, pVar3, eVar, i14, i15);
                }
            }
            i16 |= 24576;
            pVar2 = pVar;
            if ((196608 & i14) == 0) {
                if (o0VarE.r(eVar)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i16 |= i19;
            }
            if ((74899 & i16) != 74898) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i24 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i17 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar2;
                }
                x1 x1Var2 = p3.n.f135158a;
                Object[] objArr2 = new Object[0];
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new qr.n(25);
                    o0VarE.K(objQ);
                }
                p1 p1Var2 = (p1) d4.a.e(objArr2, (e23.a) objQ, o0VarE, 48);
                z02.d.a(z18, z3.f.c(39299305, new pp.g(str, 10, aVar2, p1Var2), o0VarE), pVar4, null, null, z3.f.c(-2081748891, new pp.g(eVar, 11, aVar, p1Var2), o0VarE), o0VarE, ((i16 >> 9) & 14) | 196656 | ((i16 >> 6) & 896), 24);
                z17 = z18;
                pVar3 = pVar4;
            } else {
                o0VarE.e();
                z17 = z15;
                pVar3 = pVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new d62.o(str, aVar, aVar2, z17, pVar3, eVar, i14, i15);
            }
        }
        i16 |= 3072;
        z15 = z14;
        i17 = i15 & 16;
        if (i17 != 0) {
            if ((i14 & 24576) == 0) {
                pVar2 = pVar;
                if (o0VarE.r(pVar2)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i16 |= i18;
            }
            if ((196608 & i14) == 0) {
                if (o0VarE.r(eVar)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i16 |= i19;
            }
            if ((74899 & i16) != 74898) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i24 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i17 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar2;
                }
                x1 x1Var3 = p3.n.f135158a;
                Object[] objArr3 = new Object[0];
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new qr.n(25);
                    o0VarE.K(objQ);
                }
                p1 p1Var3 = (p1) d4.a.e(objArr3, (e23.a) objQ, o0VarE, 48);
                z02.d.a(z18, z3.f.c(39299305, new pp.g(str, 10, aVar2, p1Var3), o0VarE), pVar4, null, null, z3.f.c(-2081748891, new pp.g(eVar, 11, aVar, p1Var3), o0VarE), o0VarE, ((i16 >> 9) & 14) | 196656 | ((i16 >> 6) & 896), 24);
                z17 = z18;
                pVar3 = pVar4;
            } else {
                o0VarE.e();
                z17 = z15;
                pVar3 = pVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new d62.o(str, aVar, aVar2, z17, pVar3, eVar, i14, i15);
            }
        }
        i16 |= 24576;
        pVar2 = pVar;
        if ((196608 & i14) == 0) {
            if (o0VarE.r(eVar)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i16 |= i19;
        }
        if ((74899 & i16) != 74898) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            if (i24 != 0) {
                z18 = false;
            } else {
                z18 = z15;
            }
            if (i17 != 0) {
                pVar4 = null;
            } else {
                pVar4 = pVar2;
            }
            x1 x1Var4 = p3.n.f135158a;
            Object[] objArr4 = new Object[0];
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new qr.n(25);
                o0VarE.K(objQ);
            }
            p1 p1Var4 = (p1) d4.a.e(objArr4, (e23.a) objQ, o0VarE, 48);
            z02.d.a(z18, z3.f.c(39299305, new pp.g(str, 10, aVar2, p1Var4), o0VarE), pVar4, null, null, z3.f.c(-2081748891, new pp.g(eVar, 11, aVar, p1Var4), o0VarE), o0VarE, ((i16 >> 9) & 14) | 196656 | ((i16 >> 6) & 896), 24);
            z17 = z18;
            pVar3 = pVar4;
        } else {
            o0VarE.e();
            z17 = z15;
            pVar3 = pVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d62.o(str, aVar, aVar2, z17, pVar3, eVar, i14, i15);
        }
    }

    public static final void h(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(622929614);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            pf1.b.f137561a.getClass();
            h82.e.a(pf1.b.f137565e, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new pa0.a(i14, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    public static final void i(sg0.p0 p0Var, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-457233399);
        int i15 = (o0VarE.r(p0Var) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            c1 c1Var = c1.f110940a;
            re2.l0.f152316a.getClass();
            context.getClass();
            String string = context.getString(R.string.mobile_auth_title_unable_to_continue);
            string.getClass();
            String string2 = context.getString(R.string.msg_inoperable_webview);
            string2.getClass();
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_ok);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new ro0.g(p0Var, 27);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ro0.g(p0Var, 27);
                    o0VarE.K(objQ);
                }
            }
            c1Var.a(false, string, string2, null, null, strQ, false, false, (e23.a) objQ, null, null, o0VarE, 6, 0, 1752);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s5.a(p0Var, i14, 11);
        }
    }

    public static final void j(boolean z14, d92.a aVar, d92.a aVar2, z3.e eVar, p3.m mVar, int i14) {
        z3.e eVar2;
        d92.a aVar3;
        d92.a aVar4;
        d92.a aVarA;
        d92.a aVarB;
        int i15;
        p3.o0 o0VarE = mVar.E(1061680187);
        int i16 = i14 | (o0VarE.h(z14) ? 4 : 2) | SyslogConstants.LOG_LOCAL2;
        int i17 = 1;
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                aVarA = j92.a.a();
                aVarB = j92.a.b();
                i15 = i16 & (-1009);
            } else {
                o0VarE.e();
                i15 = i16 & (-1009);
                aVarA = aVar;
                aVarB = aVar2;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            d92.a aVar5 = z14 ? aVarA : aVarB;
            gl.a aVarA2 = z14 ? gl.d.a() : gl.d.b();
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = d92.a.a(aVar5, null, 2047);
                o0VarE.K(objQ);
            }
            d92.a aVar6 = (d92.a) objQ;
            jg.b.S(aVar6, aVar5);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = gl.a.a(aVarA2);
                o0VarE.K(objQ2);
            }
            gl.a aVar7 = (gl.a) objQ2;
            gl.b.T(aVar7, aVarA2);
            boolean zEquals = aVar5.equals(aVarA);
            Activity activity = (Activity) o0VarE.A(c.n.f22332a);
            boolean zR = o0VarE.r(activity) | ((((i15 & 14) ^ 6) > 4 && o0VarE.h(z14)) || (i15 & 6) == 4);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new b50.o(activity, z14, 13);
                o0VarE.K(objQ3);
            }
            p3.l0.i((e23.a) objQ3, o0VarE);
            n2[] n2VarArr = {gl.d.f77768a.c(aVar7), d92.c.f58627a.c(aVar6), d92.c.f58628b.c(Boolean.valueOf(zEquals))};
            eVar2 = eVar;
            p3.v.b(n2VarArr, z3.f.c(556730619, new d92.e(z14, eVar2, i17), o0VarE), o0VarE, 56);
            aVar3 = aVarA;
            aVar4 = aVarB;
        } else {
            eVar2 = eVar;
            o0VarE.e();
            aVar3 = aVar;
            aVar4 = aVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new li0.y(z14, aVar3, aVar4, eVar2, i14, 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
    public static final void k(ArrayList arrayList, List list, Set set, Set set2, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-720826424);
        int i15 = (i14 & 6) == 0 ? (o0VarE.r(arrayList) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(list) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(set) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(set2) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarQ = p3.p0.q(arrayList, o0VarE);
            p1 p1VarQ2 = p3.p0.q(list, o0VarE);
            int size = arrayList.size();
            for (int i16 = 0; i16 < size; i16++) {
                Object obj = ((sc.h) arrayList.get(i16)).f158452b;
                set.add(obj);
                List listB1 = p13.h0.b1(arrayList);
                boolean zB = o0VarE.B(p1VarQ) | o0VarE.r(obj) | o0VarE.r(set) | o0VarE.r(set2) | o0VarE.B(p1VarQ2);
                Object objQ = o0VarE.q();
                if (zB) {
                    jv0.c cVar = new jv0.c(obj, set, set2, p1VarQ, p1VarQ2, 23);
                    o0VarE.K(cVar);
                    objQ = cVar;
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        jv0.c cVar2 = new jv0.c(obj, set, set2, p1VarQ, p1VarQ2, 23);
                        o0VarE.K(cVar2);
                        objQ = cVar2;
                    }
                }
                p3.l0.b(obj, listB1, (e23.l) objQ, o0VarE);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ot1.i(arrayList, list, set, set2, i14, 18);
        }
    }

    public static final rg0.h0 l(ue0.d dVar, com.garmin.android.apps.connectmobile.userprofile.model.l lVar) {
        String strA1;
        com.garmin.android.apps.connectmobile.userprofile.model.j jVarD;
        Long userId = dVar.getUserId();
        long jLongValue = userId != null ? userId.longValue() : -1L;
        String name = dVar.getName();
        if (name == null) {
            name = "";
        }
        if (lVar == null || (jVarD = lVar.getProfileImageUrls()) == null || (strA1 = jVarD.f46879h) == null) {
            strA1 = dVar.A1();
        }
        String str = strA1;
        Long lJ = dVar.getUserLevel();
        return new rg0.h0(jLongValue, name, new b12.b(str, null, f12.u.a(lJ != null ? (int) lJ.longValue() : 0), null, null, 26, null));
    }

    public static final long m(int i14, int i15, int i16, long j8) {
        int i17;
        int iH = s5.w0.h(j8);
        int iG = s5.w0.g(j8);
        if (iG < i14) {
            return j8;
        }
        if (iH <= i14 && i15 <= iG) {
            i17 = i16 - (i15 - i14);
            if (iH == iG) {
            }
            i14 = iG + i17;
            return og.a.l(iH, i14);
        }
        if (iH > i14 && iG < i15) {
            i14 += i16;
            iH = i14;
        } else if (iH >= i15) {
            i17 = i16 - (i15 - i14);
        } else if (i14 < iH) {
            iH = i14 + i16;
            i14 = (i16 - (i15 - i14)) + iG;
        }
        return og.a.l(iH, i14);
        iH += i17;
        i14 = iG + i17;
        return og.a.l(iH, i14);
    }

    public static String n(Context context, String str) {
        context.getClass();
        String string = context.getString(R.string.cross_sell_shop_now_analytics_path, "GCM", str, "inPlaceCrossSell");
        string.getClass();
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object o(gx2.a aVar, v13.c cVar) throws UnexpectedResponseCodeException {
        ux2.a aVar2;
        if (cVar instanceof ux2.a) {
            aVar2 = (ux2.a) cVar;
            int i14 = aVar2.f173073b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar2.f173073b = i14 - Integer.MIN_VALUE;
            } else {
                aVar2 = new ux2.a(cVar);
            }
        } else {
            aVar2 = new ux2.a(cVar);
        }
        ux2.a aVar3 = aVar2;
        Object objD = aVar3.f173072a;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar3.f173073b;
        if (i15 == 0) {
            o13.r.b(objD);
            aVar3.f173073b = 1;
            objD = sx2.b.d("/identity/registration/v1/account/authCode", aVar, null, null, null, null, aVar3, 124);
            if (objD == aVar4) {
                return aVar4;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objD);
        }
        qx2.c cVar2 = (qx2.c) objD;
        int i16 = cVar2.f148454c;
        String str = cVar2.f148456e;
        if (i16 == 200) {
            sx2.b.c().debug(o72.t.u(cVar2));
            return new nx2.d(str);
        }
        sx2.b.c().error(cVar2.toString());
        throw new UnexpectedResponseCodeException(cVar2.f148454c, str, null, 4, null);
    }

    public static final String p(qi2.c cVar, String str) {
        String str2;
        cVar.getClass();
        String strConcat = "?applicationId=".concat(cVar.f144949b);
        String strConcat2 = "&locale=".concat(str);
        String strConcat3 = (!(cVar instanceof qi2.b) || (str2 = ((qi2.b) cVar).f144947e) == null || str2.length() == 0) ? null : "&request=".concat(str2);
        if (strConcat3 == null) {
            strConcat3 = "";
        }
        return e5.g(cVar.f144948a.f171429a, cVar.f144950c.f144955a, e5.g(strConcat, strConcat2, strConcat3));
    }

    public static final sc.h q(sc.h hVar, List list, Set set, Set set2, p3.m mVar, int i14) {
        mVar.C(-1239021605);
        x1 x1Var = p3.n.f135158a;
        p1 p1VarQ = p3.p0.q(list, mVar);
        Object obj = hVar.f158452b;
        mVar.N(-993800456, obj);
        sc.h hVar2 = new sc.h(hVar, z3.f.c(-1349345695, new ak0.h(set2, obj, set, p1VarQ, list, hVar, 22), mVar));
        mVar.Q();
        mVar.f();
        return hVar2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object r(String str, String str2, String str3, v13.c cVar, boolean z14) {
        ot2.h hVar;
        String strG;
        if (cVar instanceof ot2.h) {
            hVar = (ot2.h) cVar;
            int i14 = hVar.f133876c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f133876c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new ot2.h(cVar);
            }
        } else {
            hVar = new ot2.h(cVar);
        }
        Object objB = hVar.f133875b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f133876c;
        if (i15 == 0) {
            o13.r.b(objB);
            if (z14) {
                kt2.f.f106534a.getClass();
                kt2.e.f106460a.getClass();
                hVar.f133874a = str3;
                hVar.f133876c = 1;
                objB = o73.v.b((o73.u) kt2.e.L.getValue(), new Object[]{str, str2}, hVar);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                strG = e5.g(str, "-", str2);
            }
            if (str3 != null) {
                return e5.g(strG, StringUtils.SPACE, str3);
            }
            return strG;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str3 = hVar.f133874a;
        o13.r.b(objB);
        strG = (String) objB;
        if (str3 != null) {
            return e5.g(strG, StringUtils.SPACE, str3);
        }
        return strG;
    }

    public static final List s(h6 h6Var) {
        h6Var.getClass();
        List list = f132050a;
        if (list != null) {
            return list;
        }
        u4.d dVarA = a72.c.a(h6Var);
        u4.d dVarC = a72.b.f1809a;
        p005kotlin.jvm.internal.j jVar = null;
        if (dVarC == null) {
            float f14 = (float) 24.0d;
            g6.f.a aVar = g6.f.f75994b;
            u4.d.a aVar2 = new u4.d.a("MicOff", f14, f14, 24.0f, 24.0f, 0L, 0, false, 96, null);
            t1 t1Var = new t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            u4.e eVarK = b71.i.k(o4.h1.f128863b, 9.2047f, 11.6459f);
            eVarK.d(9.2047f, 11.8967f, 9.2388f, 12.1398f, 9.3026f, 12.3708f);
            eVarK.i(14.7874f, 7.5977f);
            eVarK.o(4.7581f);
            eVarK.d(14.7874f, 3.2374f, 13.5351f, 2.0f, 11.9961f, 2.0f);
            eVarK.d(10.4571f, 2.0f, 9.2047f, 3.2374f, 9.2047f, 4.7581f);
            eVarK.o(11.6459f);
            eVarK.c();
            u4.d.a.b(aVar2, eVarK.f168407a, 0, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
            t1 t1Var2 = new t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL = com.nimbusds.jose.shaded.gson.internal.a.l(7.6732f, 12.0634f);
            eVarL.d(7.6732f, 12.587f, 7.7691f, 13.0889f, 7.9443f, 13.5529f);
            eVarL.i(6.626f, 14.7001f);
            eVarL.d(6.2244f, 13.9064f, 5.9984f, 13.0111f, 5.9984f, 12.0634f);
            u62.z.v(eVarL, 9.9985f, 7.6732f, 12.0634f);
            u4.d.a.b(aVar2, eVarL.f168407a, 0, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
            t1 t1Var3 = new t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarM = com.nimbusds.jose.shaded.gson.internal.a.m(8.1578f, 16.6085f, 2.7945f, 21.2759f);
            eVarM.i(1.9922f, 20.3532f);
            eVarM.i(21.1899f, 3.6468f);
            eVarM.i(21.9922f, 4.5694f);
            eVarM.i(14.7874f, 10.8392f);
            eVarM.o(11.6459f);
            eVarM.d(14.7874f, 13.1666f, 13.5351f, 14.404f, 11.9961f, 14.404f);
            eVarM.d(11.6191f, 14.404f, 11.2593f, 14.3298f, 10.9309f, 14.1953f);
            eVarM.i(9.4315f, 15.5001f);
            eVarM.d(12.1631f, 17.4953f, 16.3189f, 15.56f, 16.3189f, 12.0634f);
            u62.z.o(eVarM, 9.9985f, 17.9937f, 12.0634f);
            eVarM.d(17.9937f, 15.0451f, 15.7456f, 17.5199f, 12.8335f, 17.9225f);
            u62.z.y(eVarM, 20.0693f, 16.0398f, 22.0f, 7.9524f);
            u62.z.o(eVarM, 20.0693f, 11.1587f, 17.9225f);
            eVarM.d(10.0272f, 17.7661f, 8.9959f, 17.2979f, 8.1578f, 16.6085f);
            eVarM.c();
            u4.d.a.b(aVar2, eVarM.f168407a, 0, t1Var3, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC = aVar2.c();
            a72.b.f1809a = dVarC;
        }
        u4.d dVarC2 = a72.e.f1812a;
        if (dVarC2 == null) {
            float f15 = (float) 24.0d;
            g6.f.a aVar3 = g6.f.f75994b;
            u4.d.a aVar4 = new u4.d.a("Phone", f15, f15, 24.0f, 24.0f, 0L, 0, true, 96, null);
            t1 t1Var4 = new t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            o4.h1.f128863b.getClass();
            int i14 = o4.h1.f128864c;
            u4.e eVarL2 = com.nimbusds.jose.shaded.gson.internal.a.l(17.4463f, 15.6117f);
            eVarL2.d(17.4016f, 15.5862f, 17.3377f, 15.5798f, 17.2675f, 15.5734f);
            eVarL2.d(17.2611f, 15.5734f, 17.2547f, 15.567f, 17.2483f, 15.567f);
            eVarL2.d(17.2355f, 15.567f, 17.2292f, 15.5734f, 17.2164f, 15.5734f);
            eVarL2.d(17.1717f, 15.5734f, 17.1334f, 15.5798f, 17.095f, 15.5925f);
            eVarL2.d(17.0759f, 15.5989f, 17.0567f, 15.5989f, 17.0439f, 15.6053f);
            eVarL2.d(16.9865f, 15.6245f, 16.9354f, 15.6436f, 16.9034f, 15.6756f);
            eVarL2.d(16.5458f, 16.0013f, 15.7283f, 16.5442f, 15.2812f, 16.921f);
            eVarL2.d(15.1982f, 16.9848f, 15.1152f, 17.0359f, 15.0385f, 17.087f);
            eVarL2.d(15.013f, 17.0998f, 14.9874f, 17.1126f, 14.9683f, 17.1253f);
            eVarL2.d(14.9172f, 17.1509f, 14.8725f, 17.1764f, 14.8214f, 17.1956f);
            eVarL2.d(14.7958f, 17.2084f, 14.7703f, 17.2148f, 14.7447f, 17.2211f);
            eVarL2.d(14.7064f, 17.2339f, 14.6617f, 17.2467f, 14.6234f, 17.2595f);
            eVarL2.d(14.5978f, 17.2658f, 14.5723f, 17.2722f, 14.5468f, 17.2722f);
            eVarL2.d(14.5084f, 17.2786f, 14.4765f, 17.2786f, 14.4382f, 17.285f);
            eVarL2.d(14.419f, 17.285f, 14.3999f, 17.285f, 14.3743f, 17.285f);
            eVarL2.d(14.2913f, 17.285f, 14.2019f, 17.2722f, 14.1188f, 17.2467f);
            eVarL2.d(14.1061f, 17.2403f, 14.0933f, 17.2403f, 14.0805f, 17.2339f);
            eVarL2.d(13.9975f, 17.2084f, 13.9081f, 17.1764f, 13.8187f, 17.1445f);
            eVarL2.d(13.6143f, 17.0679f, 13.0267f, 16.8635f, 12.8287f, 16.7677f);
            eVarL2.d(9.7504f, 15.2604f, 7.9238f, 12.7249f, 6.87f, 9.5444f);
            eVarL2.d(6.7678f, 9.2314f, 6.8572f, 8.9759f, 7.1063f, 8.7588f);
            eVarL2.d(7.5917f, 8.3373f, 8.0579f, 7.8966f, 8.5561f, 7.4879f);
            eVarL2.d(8.8562f, 7.2388f, 8.9009f, 7.0089f, 8.7221f, 6.664f);
            eVarL2.d(7.8918f, 5.0737f, 7.0233f, 3.5089f, 5.8928f, 2.1039f);
            eVarL2.g(5.714f);
            eVarL2.d(4.3089f, 3.3876f, 2.1566f, 5.9678f, 2.0544f, 6.2425f);
            eVarL2.d(1.9969f, 6.4021f, 1.9906f, 6.6193f, 2.0097f, 7.0919f);
            eVarL2.d(2.3099f, 8.5736f, 2.8017f, 9.7423f, 3.5553f, 11.0516f);
            eVarL2.d(5.912f, 15.1582f, 9.0798f, 18.4665f, 13.2503f, 20.7594f);
            eVarL2.d(14.2977f, 21.3342f, 15.7091f, 21.6535f, 16.8779f, 21.8643f);
            eVarL2.d(16.9098f, 21.8706f, 16.9609f, 21.877f, 17.0248f, 21.8834f);
            eVarL2.d(17.0439f, 21.8834f, 17.0631f, 21.8834f, 17.0823f, 21.8898f);
            eVarL2.d(17.1334f, 21.8962f, 17.1844f, 21.8962f, 17.2355f, 21.8962f);
            eVarL2.d(17.2419f, 21.8962f, 17.2483f, 21.8962f, 17.2611f, 21.8962f);
            eVarL2.d(17.2994f, 21.8962f, 17.3377f, 21.8898f, 17.376f, 21.8898f);
            eVarL2.d(17.4016f, 21.8898f, 17.4271f, 21.8898f, 17.4527f, 21.8834f);
            eVarL2.d(17.5229f, 21.8706f, 17.5932f, 21.8515f, 17.6507f, 21.8259f);
            eVarL2.d(18.928f, 21.0851f, 19.688f, 20.3187f, 20.8121f, 19.4245f);
            eVarL2.d(21.0484f, 19.2329f, 21.7829f, 18.6837f, 22.0f, 18.4729f);
            eVarL2.o(18.3835f);
            eVarL2.d(20.4608f, 17.2211f, 19.0813f, 16.3909f, 17.4463f, 15.6117f);
            eVarL2.c();
            u4.d.a.b(aVar4, eVarL2.f168407a, i14, t1Var4, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC2 = aVar4.c();
            a72.e.f1812a = dVarC2;
        }
        u4.d dVarA2 = a72.d.a(h6Var);
        u4.d dVarA3 = a72.f.a(h6Var);
        u4.d dVarC3 = a72.a.f1808a;
        if (dVarC3 == null) {
            float f16 = (float) 24.0d;
            g6.f.a aVar5 = g6.f.f75994b;
            u4.d.a aVar6 = new u4.d.a("InCall", f16, f16, 24.0f, 24.0f, 0L, 0, true, 96, null);
            t1 t1Var5 = new t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            u4.e eVarK2 = b71.i.k(o4.h1.f128863b, 16.9014f, 2.0f);
            eVarK2.d(17.0319f, 2.0002f, 17.1396f, 2.1104f, 17.1396f, 2.2441f);
            u62.z.s(eVarK2, 4.3965f, 17.126f, 4.3828f, 9.3613f);
            q2.x(eVarK2, 15.4756f, 3.5039f, 6.6641f, 20.5039f);
            q2.x(eVarK2, 15.4756f, 14.6465f, 17.126f, 19.625f);
            eVarK2.i(17.1396f, 19.6113f);
            eVarK2.o(21.7598f);
            eVarK2.d(17.1396f, 21.8935f, 17.0319f, 22.0037f, 16.9014f, 22.0039f);
            eVarK2.g(5.2383f);
            eVarK2.d(5.1076f, 22.0039f, 5.0f, 21.8936f, 5.0f, 21.7598f);
            eVarK2.o(2.2441f);
            eVarK2.d(5.0f, 2.1103f, 5.1076f, 2.0f, 5.2383f, 2.0f);
            eVarK2.g(16.9014f);
            eVarK2.c();
            u4.d.a.b(aVar6, eVarK2.f168407a, 0, t1Var5, 1.0f, null, 0.0f, 0, 4.0f);
            t1 t1Var6 = new t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL3 = u62.z.l(13.9854f, 10.8613f, 19.9854f, 13.1465f, 13.9854f);
            eVarL3.o(16.0039f);
            eVarL3.i(9.9853f, 12.0039f);
            sn.a.w(eVarL3, 13.9854f, 8.0039f, 10.8613f);
            u4.d.a.b(aVar6, eVarL3.f168407a, 0, t1Var6, 1.0f, null, 0.0f, 0, 4.0f);
            t1 t1Var7 = new t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL4 = u62.z.l(12.8701f, 5.2305f, 9.0703f, 4.499f, 12.8701f);
            eVarL4.o(5.2305f);
            eVarL4.c();
            u4.d.a.b(aVar6, eVarL4.f168407a, 0, t1Var7, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC3 = aVar6.c();
            a72.a.f1808a = dVarC3;
        }
        List listK = p13.x.k(dVarA, dVarC, dVarC2, dVarA2, dVarA3, dVarC3);
        f132050a = listK;
        listK.getClass();
        return listK;
    }

    public static final String t(p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        of1.a aVar = new of1.a((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b));
        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
        Resources resources = aVar.f131712b;
        if (zY) {
            String string = resources.getString(R.string.kilometers);
            string.getClass();
            String lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            return lowerCase;
        }
        String string2 = resources.getString(R.string.miles);
        string2.getClass();
        String lowerCase2 = string2.toLowerCase(Locale.ROOT);
        lowerCase2.getClass();
        return lowerCase2;
    }

    public static final String u(p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        of1.a aVar = new of1.a((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b));
        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
        Resources resources = aVar.f131712b;
        if (zY) {
            String string = resources.getString(R.string.lbl_kilometer_singular);
            string.getClass();
            String lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            return lowerCase;
        }
        String string2 = resources.getString(R.string.common_mile);
        string2.getClass();
        String lowerCase2 = string2.toLowerCase(Locale.ROOT);
        lowerCase2.getClass();
        return lowerCase2;
    }

    public static final so1.b v(Context context, ps.q qVar) {
        context.getClass();
        qVar.getClass();
        double dS1 = qVar.getStartLatitude();
        double dT1 = qVar.getStartLongitude();
        String strV1 = qVar.getStartTimeLocal();
        DateTime dateTimeN = strV1 != null ? c22.j0.N(strV1, false) : null;
        DateTime dateTimeNow = DateTime.now();
        String strB = c22.b0.b(null);
        Double dValueOf = !Double.isNaN(dS1) ? Double.valueOf(dS1) : null;
        Double dValueOf2 = Double.isNaN(dT1) ? null : Double.valueOf(dT1);
        Long lValueOf = Long.valueOf(qVar.getActivityTypeId());
        s1.f23251a.getClass();
        return new so1.b(dateTimeN, dateTimeNow, strB, dValueOf, dValueOf2, lValueOf, s1.e(context));
    }

    public static final t23.h w(t23.l lVar) {
        t23.l lVarD = lVar.d();
        if (lVarD == null || (lVar instanceof t23.h0)) {
            return null;
        }
        if (!(lVarD.d() instanceof t23.h0)) {
            return w(lVarD);
        }
        if (lVarD instanceof t23.h) {
            return (t23.h) lVarD;
        }
        return null;
    }

    public static final boolean x(vv1.a aVar, int i14) {
        aVar.getClass();
        Map<Long, yw1.i> map = aVar.f180492d;
        return map != null && map.containsKey(Long.valueOf((long) i14));
    }

    public static final boolean y(pv0.b bVar) {
        return bVar == pv0.b.CUSTOM || bVar == pv0.b.CUSTOM_SLEEP_RELATED;
    }

    public static final void z(Context context, e23.l lVar, String str) {
        context.getClass();
        boolean z14 = str != null ? d53.w.z(str, "/composed/", false) : false;
        zp0.c cVar = new zp0.c(context);
        if (!z14) {
            cVar.a("circle_mask");
        }
        cVar.f206565e = str;
        cVar.f206570j = R.drawable.avatar_default;
        cVar.d(new s00.k(lVar, 0));
    }
}
