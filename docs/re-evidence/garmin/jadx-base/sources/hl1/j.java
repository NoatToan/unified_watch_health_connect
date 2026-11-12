package hl1;

import android.content.Context;
import androidx.lifecycle.u1;
import b21.j0;
import b82.a1;
import b82.k0;
import c2.b0;
import c2.k3;
import c2.q2;
import c2.q3;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import c22.o2;
import ca0.u0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.reports.ActivityReportsActivity;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.personalizedinsights.presentation.language.LanguageSelectionActivity;
import com.google.android.exoplayer2.audio.WavUtil;
import d91.t;
import gl1.y;
import h5.e0;
import i3.ba;
import i3.d6;
import i3.eh;
import i3.fe;
import i3.kb;
import i3.mc;
import i3.mh;
import i3.sg;
import i3.z0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import k11.a0;
import ki1.w;
import l72.h3;
import l72.i3;
import l72.p2;
import l72.r1;
import l72.v2;
import l72.w1;
import o4.d0;
import o4.m1;
import o4.q1;
import o53.s0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p006l2.z1;
import p13.h0;
import p13.t0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import q92.x;
import s5.i0;
import s5.r0;
import s5.x0;
import u1.a2;
import u53.o;
import v62.f4;
import w5.c0;
import x5.f0;
import z10.d1;
import zd0.j1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f84403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f84404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f84405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f84406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f84407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f84408g;

    public /* synthetic */ j(b11.i.b bVar, l11.s sVar, e23.l lVar, e23.a aVar, e23.a aVar2, p1 p1Var) {
        this.f84402a = 13;
        this.f84406e = bVar;
        this.f84407f = sVar;
        this.f84408g = lVar;
        this.f84403b = aVar;
        this.f84404c = aVar2;
        this.f84405d = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x029a  */
    /* JADX WARN: Code duplicated, block: B:61:0x02bb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48, types: [e23.a, java.lang.Object, org.koin.core.qualifier.Qualifier] */
    /* JADX WARN: Type inference failed for: r1v53 */
    private final Object a(Object obj, Object obj2) {
        Unit unit;
        ?? r14;
        int i14;
        Class cls;
        final d91.t tVar = (d91.t) this.f84403b;
        final e23.q qVar = (e23.q) this.f84405d;
        j1 j1Var = (j1) this.f84406e;
        g3 g3Var = (g3) this.f84407f;
        fe feVar = (fe) this.f84408g;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        final int i15 = 1;
        final int i16 = 0;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Unit unit2 = null;
            if (tVar instanceof d91.t.e) {
                mVar.C(-483957325);
                d91.s sVar = ((d91.t.e) tVar).f58595b;
                if (sVar == null) {
                    mVar.C(-483943686);
                    mVar.f();
                    cls = c91.b.class;
                    i14 = 0;
                    r14 = 0;
                } else {
                    mVar.C(-483943685);
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r14 = 0;
                    i14 = 0;
                    cls = c91.b.class;
                    i91.h.c(c2.l.A(aVar, 0.0f, j92.b.f97899b.f97918c, 1), sVar, (c91.b) KoinJavaComponent.get$default(c91.b.class, null, null, 6, null), null, null, null, mVar, 0, 56);
                    mVar.f();
                    unit2 = Unit.INSTANCE;
                }
                if (unit2 == null) {
                    mVar.C(-483629624);
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i91.h.e(c2.l.A(aVar2, 0.0f, j92.b.f97899b.f97918c, 1), (c91.b) KoinJavaComponent.get$default(cls, r14, r14, 6, r14), mVar, i14, i14);
                    mVar.f();
                } else {
                    mVar.C(1785503791);
                    mVar.f();
                }
                mVar.f();
            } else {
                boolean z14 = tVar instanceof d91.t.g;
                p3.m.a aVar3 = p3.m.f135153a;
                if (z14) {
                    mVar.C(-483261096);
                    String strQ = y.Q(mVar, R.string.lbl_thank_you_for_sharing);
                    h4.r.a aVar4 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA = c2.l.A(aVar4, 0.0f, j92.b.f97899b.f97918c, 1);
                    d91.s sVar2 = ((d91.t.g) tVar).f58597b;
                    c91.b bVar = (c91.b) KoinJavaComponent.get$default(c91.b.class, null, null, 6, null);
                    Object objQ = mVar.q();
                    aVar3.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new j02.r(18);
                        mVar.K(objQ);
                    }
                    e23.l lVar = (e23.l) objQ;
                    boolean zB = mVar.B(strQ);
                    Object objQ2 = mVar.q();
                    if (zB || objQ2 == c2565a) {
                        objQ2 = new ao1.f(21, feVar, strQ);
                        mVar.K(objQ2);
                    }
                    i91.h.c(rVarA, sVar2, bVar, null, lVar, (e23.r) objQ2, mVar, 24576, 8);
                    mVar.f();
                } else if (tVar instanceof d91.t.f) {
                    mVar.C(-482297523);
                    h4.r.a aVar5 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA2 = c2.l.A(aVar5, 0.0f, j92.b.f97899b.f97918c, 1);
                    d91.s sVar3 = ((d91.t.f) tVar).f58596b;
                    c91.b bVar2 = (c91.b) KoinJavaComponent.get$default(c91.b.class, null, null, 6, null);
                    Object objQ3 = mVar.q();
                    aVar3.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new j02.r(19);
                        mVar.K(objQ3);
                    }
                    i91.h.c(rVarA2, sVar3, bVar2, null, (e23.l) objQ3, null, mVar, 24576, 40);
                    mVar.f();
                } else if (tVar instanceof d91.t.c) {
                    mVar.C(-481876078);
                    h4.r.a aVar6 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC = c2.l.C(aVar6, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                    d91.s sVar4 = ((d91.t.c) tVar).f58593b;
                    Object objQ4 = mVar.q();
                    aVar3.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new j02.r(17);
                        mVar.K(objQ4);
                    }
                    i91.h.b(rVarC, sVar4, (e23.l) objQ4, mVar, 384, 0);
                    mVar.f();
                } else if (tVar instanceof d91.t.b) {
                    mVar.C(-481488640);
                    d91.s sVar5 = ((d91.t.b) tVar).f58592b;
                    if (sVar5 == null) {
                        mVar.C(-481478721);
                        mVar.f();
                        unit = null;
                    } else {
                        mVar.C(-481478720);
                        h4.r.a aVar7 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        i91.h.c(c2.l.C(aVar7, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13), sVar5, (c91.b) KoinJavaComponent.get$default(c91.b.class, null, null, 6, null), null, null, null, mVar, 0, 56);
                        mVar.f();
                        unit = Unit.INSTANCE;
                    }
                    if (unit == null) {
                        mVar.C(-481165744);
                        h4.r.a aVar8 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        i91.h.a(0, 2, c2.l.C(aVar8, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), y.Q(mVar, R.string.loading_error_sentence_case), y.Q(mVar, R.string.msg_ai_error), mVar, null);
                        mVar = mVar;
                        mVar.f();
                    } else {
                        mVar.C(1785583426);
                        mVar.f();
                    }
                    mVar.f();
                } else if (tVar instanceof d91.t.h) {
                    mVar.C(-480678920);
                    String str = ((d91.t.h) tVar).f58598b;
                    boolean zB2 = mVar.B(qVar) | mVar.B(tVar);
                    Object objQ5 = mVar.q();
                    if (zB2) {
                        objQ5 = new e23.a() { // from class: j91.c
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i16) {
                                    case 0:
                                        t.h hVar = (t.h) tVar;
                                        qVar.invoke(hVar.f58598b, hVar.f58599c, Boolean.TRUE);
                                        break;
                                    default:
                                        t.h hVar2 = (t.h) tVar;
                                        qVar.invoke(hVar2.f58598b, hVar2.f58599c, Boolean.FALSE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ5);
                    } else {
                        aVar3.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new e23.a() { // from class: j91.c
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i16) {
                                        case 0:
                                            t.h hVar = (t.h) tVar;
                                            qVar.invoke(hVar.f58598b, hVar.f58599c, Boolean.TRUE);
                                            break;
                                        default:
                                            t.h hVar2 = (t.h) tVar;
                                            qVar.invoke(hVar2.f58598b, hVar2.f58599c, Boolean.FALSE);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ5);
                        }
                    }
                    e23.a aVar9 = (e23.a) objQ5;
                    boolean zB3 = mVar.B(qVar) | mVar.B(tVar);
                    Object objQ6 = mVar.q();
                    if (zB3) {
                        objQ6 = new e23.a() { // from class: j91.c
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i15) {
                                    case 0:
                                        t.h hVar = (t.h) tVar;
                                        qVar.invoke(hVar.f58598b, hVar.f58599c, Boolean.TRUE);
                                        break;
                                    default:
                                        t.h hVar2 = (t.h) tVar;
                                        qVar.invoke(hVar2.f58598b, hVar2.f58599c, Boolean.FALSE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ6);
                    } else {
                        aVar3.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new e23.a() { // from class: j91.c
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            t.h hVar = (t.h) tVar;
                                            qVar.invoke(hVar.f58598b, hVar.f58599c, Boolean.TRUE);
                                            break;
                                        default:
                                            t.h hVar2 = (t.h) tVar;
                                            qVar.invoke(hVar2.f58598b, hVar2.f58599c, Boolean.FALSE);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ6);
                        }
                    }
                    i91.h.f(null, str, aVar9, (e23.a) objQ6, mVar, 0, 1);
                    mVar.f();
                } else {
                    if (!p005kotlin.jvm.internal.s.g(tVar, d91.t.d.f58594b)) {
                        throw n23.j.m(mVar, 1785504700);
                    }
                    mVar.C(-480071289);
                    Object objQ7 = mVar.q();
                    aVar3.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ7 == c2565a2) {
                        objQ7 = p0.n(Boolean.FALSE);
                        mVar.K(objQ7);
                    }
                    p1 p1Var = (p1) objQ7;
                    Unit unit3 = Unit.INSTANCE;
                    boolean zR = mVar.r(j1Var);
                    Object objQ8 = mVar.q();
                    if (zR || objQ8 == c2565a2) {
                        objQ8 = new j91.e.d(j1Var, p1Var, null);
                        mVar.K(objQ8);
                    }
                    l0.e((e23.p) objQ8, unit3, mVar);
                    h4.r.a aVar10 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA3 = c2.l.A(aVar10, 0.0f, j92.b.f97899b.f97918c, 1);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = f4.a(t62.b.f162798a);
                    String strQ2 = y.Q(mVar, R.string.lbl_insights_hidden);
                    Boolean bool = (Boolean) p1Var.getF182175a();
                    bool.getClass();
                    i91.h.a(0, 0, rVarA3, strQ2, y.P(R.string.msg_insights_hidden, new Object[]{bool, Boolean.valueOf(d1.h(x.DI_CONNECT_AI, false)), g3Var}, mVar), mVar, dVarA);
                    mVar.f();
                }
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:36:0x0122  */
    /* JADX WARN: Code duplicated, block: B:42:0x014c  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object b(Object obj, Object obj2) {
        k62.d dVar = (k62.d) this.f84403b;
        List list = (List) this.f84404c;
        d6 d6Var = (d6) this.f84406e;
        k62.k kVar = (k62.k) this.f84407f;
        fv0.d dVar2 = (fv0.d) this.f84408g;
        p1 p1Var = (p1) this.f84405d;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarB = a2.b(u1.n.e(x2.f(aVar, 1.0f), tn.k.a(d92.b.f58623a, mVar), m1.f128891a), a2.a(mVar), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar2, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarB, mVar);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
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
            b0 b0Var = b0.f22601a;
            boolean z14 = ((k62.c) p1Var.getF182175a()).f103174b;
            p3.m.a aVar3 = p3.m.f135153a;
            if (z14) {
                mVar.C(39537166);
                boolean zR = mVar.r(dVar);
                Object objQ = mVar.q();
                if (zR) {
                    objQ = new jx0.e(dVar, 9);
                    mVar.K(objQ);
                } else {
                    aVar3.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new jx0.e(dVar, 9);
                        mVar.K(objQ);
                    }
                }
                k62.b.c((e23.a) objQ, mVar, 0);
                mVar.f();
            } else {
                mVar.C(1225747504);
                if (list != null) {
                    mVar.C(1225789230);
                    if (list.isEmpty()) {
                        mVar.C(39543789);
                        boolean zB = mVar.B(d6Var);
                        Object objQ2 = mVar.q();
                        if (zB) {
                            objQ2 = new jx0.e(d6Var, 10);
                            mVar.K(objQ2);
                        } else {
                            aVar3.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new jx0.e(d6Var, 10);
                                mVar.K(objQ2);
                            }
                        }
                        k62.b.b((e23.a) objQ2, mVar, 0);
                        mVar.f();
                    } else {
                        mVar.C(39546934);
                        boolean zB2 = mVar.B(dVar2);
                        Object objQ3 = mVar.q();
                        if (zB2) {
                            objQ3 = new jx0.e(dVar2, 11);
                            mVar.K(objQ3);
                        } else {
                            aVar3.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new jx0.e(dVar2, 11);
                                mVar.K(objQ3);
                            }
                        }
                        k62.b.a(list, kVar, (e23.a) objQ3, mVar, 0);
                        mVar.f();
                    }
                    mVar.f();
                } else {
                    mVar.C(1226278379);
                    mVar.f();
                }
                mVar.f();
            }
            c2.l.f(b0Var.a(aVar, 1.0f, true), mVar);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0073  */
    /* JADX WARN: Code duplicated, block: B:51:0x0124  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object c(Object obj, Object obj2) {
        i53.g gVarC;
        g3 g3Var = (g3) this.f84403b;
        g3 g3Var2 = (g3) this.f84404c;
        String str = (String) this.f84405d;
        LanguageSelectionActivity languageSelectionActivity = (LanguageSelectionActivity) this.f84406e;
        h91.b bVar = (h91.b) this.f84407f;
        fe feVar = (fe) this.f84408g;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        LanguageSelectionActivity.a aVar = LanguageSelectionActivity.f40328b;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            fw.p pVar = g3Var.f35300a;
            fw.p pVar2 = fw.p.ERROR;
            p3.m.a aVar2 = p3.m.f135153a;
            if (pVar == pVar2 || g3Var2.f35300a == pVar2) {
                mVar.C(-1784084892);
                String strQ = y.Q(mVar, R.string.txt_error_occurred);
                Unit unit = Unit.INSTANCE;
                boolean zB = mVar.B(strQ);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new LanguageSelectionActivity.b(feVar, strQ, null);
                    mVar.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new LanguageSelectionActivity.b(feVar, strQ, null);
                        mVar.K(objQ);
                    }
                }
                l0.e((e23.p) objQ, unit, mVar);
                mVar.f();
            } else {
                mVar.C(-1783811968);
                mVar.f();
            }
            i53.c cVar = (i53.c) g3Var.f35301b;
            if (cVar != null) {
                int iA = t0.a(p13.y.r(cVar, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (Object obj3 : cVar) {
                    Locale localeForLanguageTag = Locale.forLanguageTag(d53.u.v((String) obj3, "_", "-", false));
                    String displayName = localeForLanguageTag.getDisplayName(localeForLanguageTag);
                    displayName.getClass();
                    if (displayName.length() > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        char cCharAt = displayName.charAt(0);
                        sb3.append((Object) (Character.isLowerCase(cCharAt) ? d53.a.c(cCharAt, localeForLanguageTag) : String.valueOf(cCharAt)));
                        sb3.append(displayName.substring(1));
                        displayName = sb3.toString();
                    }
                    linkedHashMap.put(obj3, displayName);
                }
                gVarC = i53.a.k(linkedHashMap);
            } else {
                gVarC = i53.a.c();
            }
            i53.g gVar = gVarC;
            String str2 = (String) g3Var2.f35301b;
            String str3 = str2 == null ? str : str2;
            boolean zR = mVar.r(languageSelectionActivity) | mVar.k(bVar == null ? -1 : bVar.ordinal());
            Object objQ2 = mVar.q();
            if (zR) {
                objQ2 = new jt1.d(8, languageSelectionActivity, bVar);
                mVar.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new jt1.d(8, languageSelectionActivity, bVar);
                    mVar.K(objQ2);
                }
            }
            k91.b.a(null, gVar, str3, str, (e23.l) objQ2, mVar, 0);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0063  */
    /* JADX WARN: Code duplicated, block: B:19:0x007f  */
    /* JADX WARN: Code duplicated, block: B:24:0x009b  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object d(Object obj, Object obj2) {
        ki1.l lVar = (ki1.l) this.f84403b;
        e23.l lVar2 = (e23.l) this.f84404c;
        p1 p1Var = (p1) this.f84405d;
        x3 x3Var = (x3) this.f84406e;
        p1 p1Var2 = (p1) this.f84407f;
        p1 p1Var3 = (p1) this.f84408g;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i14 = 1;
        int i15 = 2;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            mi1.a aVar = ((w) p1Var.getF182175a()).f104914b;
            if (aVar.equals(mi1.a.C2266a.f118986a)) {
                mVar.C(-411406478);
                ki1.b bVar = (ki1.b) x3Var.getF182175a();
                boolean zR = mVar.r(lVar);
                Object objQ = mVar.q();
                p3.m.a aVar2 = p3.m.f135153a;
                if (zR) {
                    objQ = new ki1.e(lVar, i14);
                    mVar.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ki1.e(lVar, i14);
                        mVar.K(objQ);
                    }
                }
                e23.a aVar3 = (e23.a) objQ;
                boolean zR2 = mVar.r(lVar);
                Object objQ2 = mVar.q();
                if (zR2) {
                    objQ2 = new ki1.e(lVar, i15);
                    mVar.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new ki1.e(lVar, i15);
                        mVar.K(objQ2);
                    }
                }
                e23.a aVar4 = (e23.a) objQ2;
                boolean zR3 = mVar.r(lVar);
                Object objQ3 = mVar.q();
                if (zR3) {
                    objQ3 = new ki1.e(lVar, 3);
                    mVar.K(objQ3);
                } else {
                    aVar2.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new ki1.e(lVar, 3);
                        mVar.K(objQ3);
                    }
                }
                ki1.k.b(bVar, aVar3, aVar4, (e23.a) objQ3, mVar, 0);
                mVar.f();
            } else {
                if (!aVar.equals(mi1.a.b.f118987a)) {
                    throw n23.j.m(mVar, 818010657);
                }
                mVar.C(-411009678);
                ki1.k.e((fi1.d) p1Var2.getF182175a(), (fi1.c) p1Var3.getF182175a(), ((w) p1Var.getF182175a()).f104913a.equals(w.a.b.f104916a), lVar2, mVar, 0);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0058  */
    private final Object e(Object obj, Object obj2) {
        String str = (String) this.f84403b;
        nj2.a aVar = (nj2.a) this.f84404c;
        lc.y yVar = (lc.y) this.f84405d;
        String str2 = (String) this.f84406e;
        i3 i3Var = (i3) this.f84407f;
        e23.l lVar = (e23.l) this.f84408g;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            u4.d dVarA = v62.o.a(t62.b.f162798a);
            boolean zR = mVar.r(aVar) | mVar.r(yVar) | mVar.B(str2);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new lj2.d(aVar, yVar, str2, 1);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new lj2.d(aVar, yVar, str2, 1);
                    mVar.K(objQ);
                }
            }
            h3.f(dVarA, str, null, null, (e23.a) objQ, i53.a.a(i3Var), null, lVar, null, mVar, 262528, 328);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object f(Object obj, Object obj2) {
        lc.y yVar = (lc.y) this.f84403b;
        nj2.a aVar = (nj2.a) this.f84404c;
        x3 x3Var = (x3) this.f84406e;
        e23.l lVar = (e23.l) this.f84407f;
        p1 p1Var = (p1) this.f84405d;
        p1 p1Var2 = (p1) this.f84408g;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i14 = 2;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            kb.a(null, z3.f.c(1399077451, new c42.p(yVar, i14), mVar), null, null, null, 0, 0L, 0L, null, z3.f.c(-943722400, new ak0.h(aVar, x3Var, yVar, lVar, p1Var, p1Var2, 17), mVar), mVar, 805306416, 509);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object g(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        ll1.c.a((ll1.e) this.f84404c, (u0) this.f84405d, (gl1.a) this.f84406e, (gl1.b) this.f84407f, (j0) this.f84408g, (e23.a) this.f84403b, (p3.m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0074  */
    /* JADX WARN: Code duplicated, block: B:17:0x009e  */
    private final Object h(Object obj, Object obj2) {
        h4.r rVar = (h4.r) this.f84403b;
        CustomCombinedChart customCombinedChart = (CustomCombinedChart) this.f84404c;
        sz.a aVar = (sz.a) this.f84405d;
        x3 x3Var = (x3) this.f84406e;
        ge1.a aVar2 = (ge1.a) this.f84407f;
        Context context = (Context) this.f84408g;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            g6.f.a aVar3 = g6.f.f75994b;
            h4.r rVarH = x2.h(x2.f(h4.r.S, 1.0f), 350);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarThen = c2.l.A(rVarH, j92.b.f97899b.f97917b, 0.0f, 2).then(rVar);
            boolean zR = mVar.r(customCombinedChart);
            Object objQ = mVar.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (zR) {
                objQ = new hn1.j(customCombinedChart, 2);
                mVar.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new hn1.j(customCombinedChart, 2);
                    mVar.K(objQ);
                }
            }
            e23.l lVar = (e23.l) objQ;
            boolean zR2 = mVar.r(aVar) | mVar.B(x3Var) | mVar.r(aVar2) | mVar.r(context);
            Object objQ2 = mVar.q();
            if (zR2) {
                ev2.f fVar = new ev2.f(aVar, aVar2, context, x3Var, 27);
                mVar.K(fVar);
                objQ2 = fVar;
            } else {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    ev2.f fVar2 = new ev2.f(aVar, aVar2, context, x3Var, 27);
                    mVar.K(fVar2);
                    objQ2 = fVar2;
                }
            }
            p002j6.c.b(lVar, rVarThen, (e23.l) objQ2, mVar, 0, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object i(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        na0.h.b((na0.q) this.f84405d, (na0.j) this.f84406e, (e23.l) this.f84407f, (e23.a) this.f84403b, (e23.a) this.f84404c, (e23.p) this.f84408g, (p3.m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    private final Object j(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        na0.m.b((na0.q) this.f84405d, (e23.p) this.f84406e, (e23.a) this.f84403b, (e23.a) this.f84404c, (e23.a) this.f84407f, (e23.a) this.f84408g, (p3.m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0092  */
    private final Object k(Object obj, Object obj2) {
        m4.b0 b0Var = (m4.b0) this.f84405d;
        m4.q qVar = (m4.q) this.f84406e;
        String str = (String) this.f84407f;
        e23.l lVar = (e23.l) this.f84408g;
        e23.a aVar = (e23.a) this.f84403b;
        e23.a aVar2 = (e23.a) this.f84404c;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97931h, mVar);
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            int i14 = k3.f22728a;
            h4.r rVarA = m4.e.a(c2.l.G(rVarF, q3.c(mVar)), b0Var);
            x5.v.f188954b.getClass();
            int i15 = x5.v.f188955c;
            x5.p.f188918b.getClass();
            p006l2.a2 a2Var = new p006l2.a2(0, (Boolean) null, i15, x5.p.f188922f, (f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
            boolean zR = mVar.r(qVar);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new k0(qVar, 10);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new k0(qVar, 10);
                    mVar.K(objQ);
                }
            }
            z1 z1Var = new z1(null, null, null, null, (e23.l) objQ, null, 47, null);
            ba baVar = ba.f87580a;
            d0.f128823b.getClass();
            long j8 = d0.f128831j;
            long jA = d92.b.a(mVar).k().a();
            baVar.getClass();
            sg sgVarC = ba.c(0L, 0L, 0L, 0L, 0L, jA, null, j8, j8, 0L, 0L, j8, j8, 0L, 0L, 0L, 0L, mVar, 2147378943);
            nw0.c.f128001a.getClass();
            eh.a(str, lVar, rVarA, false, x0VarB, nw0.c.f128002b, z3.f.c(199128569, new ll1.g(aVar, 21), mVar), z3.f.c(-1180656744, new ao1.g(str, aVar2, 21), mVar), null, a2Var, z1Var, true, 0, 0, null, null, sgVarC, mVar, 918552576, 12779520, 3963992);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object l(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.e((m52.a) this.f84403b, (m52.k) this.f84404c, (m52.d) this.f84405d, (com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b) this.f84406e, (e23.l) this.f84407f, (e23.l) this.f84408g, (p3.m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b5  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object n(Object obj, Object obj2) {
        int i14;
        int i15;
        boolean z14;
        qo0.a aVar = (qo0.a) this.f84403b;
        gs1.t tVar = (gs1.t) this.f84404c;
        p1 p1Var = (p1) this.f84405d;
        CustomLineChart customLineChart = (CustomLineChart) this.f84406e;
        tz.a aVar2 = (tz.a) this.f84407f;
        String str = (String) this.f84408g;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            long j8 = (((long) (-248)) << 32) | (((long) 60) & 4294967295L);
            g6.k.a aVar3 = g6.k.f76003b;
            if (((qo0.d) p1Var.getF182175a()).f145950d) {
                i14 = -1962978338;
                i15 = R.string.msg_press_hold_chart_for_more;
            } else {
                i14 = -1962980573;
                i15 = R.string.msg_double_tap_to_enable_functions;
            }
            String strH = sn.a.h(mVar, i14, i15, mVar);
            w1 w1Var = w1.TopEnd;
            l72.x1 x1Var2 = l72.x1.EndMedium;
            aVar.getClass();
            if (tVar == null || !tVar.y()) {
                z14 = false;
            } else {
                z14 = ((qo0.d) p1Var.getF182175a()).f145950d ? ((qo0.d) p1Var.getF182175a()).f145948b : ((qo0.d) p1Var.getF182175a()).f145949c;
            }
            boolean zR = mVar.r(aVar);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new ho0.l(aVar, 1);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ho0.l(aVar, 1);
                    mVar.K(objQ);
                }
            }
            a1.a(strH, w1Var, x1Var2, 220, j8, z14, (e23.a) objQ, z3.f.c(770839966, new ku1.l((Object) aVar, (Object) customLineChart, (Object) aVar2, (Object) tVar, str, 9), mVar), mVar, 100691328, 2);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x027f  */
    /* JADX WARN: Code duplicated, block: B:134:0x033d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0389  */
    /* JADX WARN: Code duplicated, block: B:146:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:151:0x044e  */
    /* JADX WARN: Code duplicated, block: B:177:0x052c  */
    /* JADX WARN: Code duplicated, block: B:178:0x0536  */
    /* JADX WARN: Code duplicated, block: B:180:0x0540  */
    /* JADX WARN: Code duplicated, block: B:181:0x0544  */
    /* JADX WARN: Code duplicated, block: B:183:0x054c  */
    /* JADX WARN: Code duplicated, block: B:185:0x0552  */
    /* JADX WARN: Code duplicated, block: B:188:0x0584  */
    /* JADX WARN: Code duplicated, block: B:190:0x058d  */
    /* JADX WARN: Code duplicated, block: B:191:0x0591  */
    /* JADX WARN: Code duplicated, block: B:196:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:199:0x0614  */
    /* JADX WARN: Code duplicated, block: B:200:0x061e  */
    /* JADX WARN: Code duplicated, block: B:202:0x062a  */
    /* JADX WARN: Code duplicated, block: B:222:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:23:0x0099  */
    /* JADX WARN: Code duplicated, block: B:339:0x0bc3  */
    /* JADX WARN: Code duplicated, block: B:352:0x0c9e  */
    /* JADX WARN: Code duplicated, block: B:86:0x021c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0241  */
    /* JADX WARN: Code duplicated, block: B:96:0x0264  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        s5.c cVarK;
        p3.m mVar;
        float f14;
        h5.g.a.f fVar;
        int i14;
        float f15;
        float f16;
        z zVarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        Object obj3;
        Object obj4;
        LocalDate localDate;
        int i15 = this.f84402a;
        int i16 = 19;
        int i17 = 8;
        p3.m.a aVar = p3.m.f135153a;
        z = false;
        boolean z14 = false;
        final int i18 = 1;
        Object obj5 = this.f84408g;
        Object obj6 = this.f84407f;
        Object obj7 = this.f84405d;
        Object obj8 = this.f84406e;
        Object obj9 = this.f84404c;
        Object obj10 = this.f84403b;
        switch (i15) {
            case 0:
                e23.a aVar2 = (e23.a) obj10;
                e23.a<Unit> aVar3 = (e23.a) obj9;
                final p1 p1Var = (p1) obj7;
                g2.m1 m1Var = (g2.m1) obj8;
                final kl1.a aVar4 = (kl1.a) obj6;
                final n nVar = (n) obj5;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar5 = h4.r.S;
                    h4.r rVarB = a2.b(aVar5, a2.a(mVar2), true);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA2 = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC2 = h4.k.c(rVarB, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar6);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    b0 b0Var = b0.f22601a;
                    if (((f) p1Var.getF182175a()).f84385b) {
                        mVar2.C(-838909623);
                        s5.c.b bVar2 = new s5.c.b(0, 1, null);
                        bVar2.b(y.Q(mVar2, R.string.msg_select_activities_to_record_for_band));
                        mVar2.C(1912606186);
                        d92.b.f58623a.getClass();
                        r0 r0Var = new r0(new i0(d92.b.a(mVar2).k().a(), 0L, (w5.f0) null, (w5.b0) null, (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null), null, null, null, 14, null);
                        boolean zB = mVar2.B(p1Var) | mVar2.B(m1Var);
                        Object objQ = mVar2.q();
                        if (zB) {
                            objQ = new k(0, p1Var, m1Var);
                            mVar2.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new k(0, p1Var, m1Var);
                                mVar2.K(objQ);
                            }
                        }
                        int iG = bVar2.g(new s5.m.a("", r0Var, (s5.n) objQ));
                        try {
                            bVar2.b(StringUtils.SPACE);
                            bVar2.b(y.Q(mVar2, R.string.lbl_edit_settings));
                            Unit unit = Unit.INSTANCE;
                            bVar2.f(iG);
                            mVar2.f();
                            cVarK = bVar2.k();
                            mVar2.f();
                        } catch (Throwable th3) {
                            bVar2.f(iG);
                            throw th3;
                        }
                    } else {
                        mVar2.C(-838028603);
                        s5.c.b bVar3 = new s5.c.b(0, 1, null);
                        bVar3.b(y.Q(mVar2, R.string.msg_select_activities_to_record));
                        cVarK = bVar3.k();
                        mVar2.f();
                    }
                    s5.c cVar = cVarK;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97932i, mVar2);
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    mh.d(cVar, c2.l.C(c2.l.A(aVar5, eVar.f97920e, 0.0f, 2), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0VarB, mVar2, 0, 0, 262140);
                    String strQ = y.Q(mVar2, R.string.lbl_favorites);
                    Locale locale = Locale.ROOT;
                    String upperCase = strQ.toUpperCase(locale);
                    upperCase.getClass();
                    String upperCase2 = y.Q(mVar2, R.string.lbl_edit).toUpperCase(locale);
                    upperCase2.getClass();
                    boolean zB2 = mVar2.B(aVar2);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        objQ2 = new gt1.s(aVar2, 8);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new gt1.s(aVar2, 8);
                            mVar2.K(objQ2);
                        }
                    }
                    final int i19 = 0;
                    r1.c(upperCase, upperCase2, (e23.a) objQ2, false, null, z3.f.c(-1596235855, new e23.p() { // from class: hl1.h
                        /* JADX WARN: Code duplicated, block: B:28:0x00da  */
                        /* JADX WARN: Code duplicated, block: B:60:0x01d6  */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.p
                        public final Object invoke(Object obj11, Object obj12) {
                            int i24 = i19;
                            p3.m.a aVar7 = p3.m.f135153a;
                            final n nVar2 = nVar;
                            kl1.a aVar8 = aVar4;
                            p1 p1Var2 = p1Var;
                            final int i25 = 1;
                            final int i26 = 0;
                            switch (i24) {
                                case 0:
                                    p3.m mVar3 = (p3.m) obj11;
                                    int iIntValue2 = ((Integer) obj12).intValue();
                                    if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        x1 x1Var2 = p3.n.f135158a;
                                        h4.r.a aVar9 = h4.r.S;
                                        c2.j.f22691a.getClass();
                                        c2.j.k kVar2 = c2.j.f22694d;
                                        h4.d.f81522a.getClass();
                                        z zVarA3 = c2.y.a(kVar2, h4.d.a.f81536n, mVar3, 0);
                                        int iHashCode3 = Long.hashCode(mVar3.getU());
                                        i2 i2VarX3 = mVar3.x();
                                        h4.r rVarC3 = h4.k.c(aVar9, mVar3);
                                        h5.g.V.getClass();
                                        e0.a aVar10 = h5.g.a.f81805b;
                                        if (mVar3.F() == null) {
                                            p0.l();
                                            throw null;
                                        }
                                        mVar3.z();
                                        if (mVar3.getT()) {
                                            mVar3.M(aVar10);
                                        } else {
                                            mVar3.c();
                                        }
                                        b4.c(h5.g.a.f81810g, zVarA3, mVar3);
                                        b4.c(h5.g.a.f81809f, i2VarX3, mVar3);
                                        h5.g.a.b bVar4 = h5.g.a.f81813j;
                                        if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode3))) {
                                            v.h.z(iHashCode3, mVar3, iHashCode3, bVar4);
                                        }
                                        b4.c(h5.g.a.f81807d, rVarC3, mVar3);
                                        b0 b0Var2 = b0.f22601a;
                                        mVar3.C(978953825);
                                        for (final zf2.d dVar : ((f) p1Var2.getF182175a()).f84387d) {
                                            String strA = aVar8.a(dVar);
                                            u4.d dVarC = aVar8.c(dVar);
                                            boolean zR = mVar3.r(nVar2) | mVar3.k(dVar.ordinal());
                                            Object objQ3 = mVar3.q();
                                            if (zR) {
                                                objQ3 = new e23.a() { // from class: hl1.g
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        switch (i25) {
                                                            case 0:
                                                                nVar2.z4(dVar);
                                                                break;
                                                            default:
                                                                nVar2.z4(dVar);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar3.K(objQ3);
                                            } else {
                                                aVar7.getClass();
                                                if (objQ3 == p3.m.a.f135155b) {
                                                    objQ3 = new e23.a() { // from class: hl1.g
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i25) {
                                                                case 0:
                                                                    nVar2.z4(dVar);
                                                                    break;
                                                                default:
                                                                    nVar2.z4(dVar);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar3.K(objQ3);
                                                }
                                            }
                                            il1.e.a(null, strA, dVarC, false, false, (e23.a) objQ3, null, null, null, null, mVar3, 0, 985);
                                        }
                                        mVar3.f();
                                        mVar3.y();
                                        x1 x1Var3 = p3.n.f135158a;
                                    } else {
                                        mVar3.e();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    p3.m mVar4 = (p3.m) obj11;
                                    int iIntValue3 = ((Integer) obj12).intValue();
                                    if (mVar4.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var4 = p3.n.f135158a;
                                        h4.r.a aVar11 = h4.r.S;
                                        c2.j.f22691a.getClass();
                                        c2.j.k kVar3 = c2.j.f22694d;
                                        h4.d.f81522a.getClass();
                                        z zVarA4 = c2.y.a(kVar3, h4.d.a.f81536n, mVar4, 0);
                                        int iHashCode4 = Long.hashCode(mVar4.getU());
                                        i2 i2VarX4 = mVar4.x();
                                        h4.r rVarC4 = h4.k.c(aVar11, mVar4);
                                        h5.g.V.getClass();
                                        e0.a aVar12 = h5.g.a.f81805b;
                                        if (mVar4.F() == null) {
                                            p0.l();
                                            throw null;
                                        }
                                        mVar4.z();
                                        if (mVar4.getT()) {
                                            mVar4.M(aVar12);
                                        } else {
                                            mVar4.c();
                                        }
                                        b4.c(h5.g.a.f81810g, zVarA4, mVar4);
                                        b4.c(h5.g.a.f81809f, i2VarX4, mVar4);
                                        h5.g.a.b bVar5 = h5.g.a.f81813j;
                                        if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode4))) {
                                            v.h.z(iHashCode4, mVar4, iHashCode4, bVar5);
                                        }
                                        b4.c(h5.g.a.f81807d, rVarC4, mVar4);
                                        b0 b0Var3 = b0.f22601a;
                                        mVar4.C(583941570);
                                        for (final zf2.d dVar2 : ((f) p1Var2.getF182175a()).f84388e) {
                                            String strA2 = aVar8.a(dVar2);
                                            u4.d dVarC2 = aVar8.c(dVar2);
                                            boolean zR2 = mVar4.r(nVar2) | mVar4.k(dVar2.ordinal());
                                            Object objQ4 = mVar4.q();
                                            if (zR2) {
                                                objQ4 = new e23.a() { // from class: hl1.g
                                                    @Override // e23.a
                                                    public final Object invoke() {
                                                        switch (i26) {
                                                            case 0:
                                                                nVar2.z4(dVar2);
                                                                break;
                                                            default:
                                                                nVar2.z4(dVar2);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                mVar4.K(objQ4);
                                            } else {
                                                aVar7.getClass();
                                                if (objQ4 == p3.m.a.f135155b) {
                                                    objQ4 = new e23.a() { // from class: hl1.g
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i26) {
                                                                case 0:
                                                                    nVar2.z4(dVar2);
                                                                    break;
                                                                default:
                                                                    nVar2.z4(dVar2);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar4.K(objQ4);
                                                }
                                            }
                                            il1.f.a(strA2, dVarC2, null, null, (e23.a) objQ4, null, null, null, null, mVar4, 0, 492);
                                        }
                                        mVar4.f();
                                        mVar4.y();
                                        x1 x1Var5 = p3.n.f135158a;
                                    } else {
                                        mVar4.e();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, mVar2), mVar2, 196608, 24);
                    if (((f) p1Var.getF182175a()).f84388e.isEmpty()) {
                        mVar2.C(-835876366);
                        mVar2.f();
                    } else {
                        mVar2.C(-836602882);
                        final int i24 = 1;
                        r1.b(y.Q(mVar2, R.string.lbl_recent_activities), z3.f.c(-493766278, new e23.p() { // from class: hl1.h
                            /* JADX WARN: Code duplicated, block: B:28:0x00da  */
                            /* JADX WARN: Code duplicated, block: B:60:0x01d6  */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.p
                            public final Object invoke(Object obj11, Object obj12) {
                                int i25 = i24;
                                p3.m.a aVar7 = p3.m.f135153a;
                                final n nVar2 = nVar;
                                kl1.a aVar8 = aVar4;
                                p1 p1Var2 = p1Var;
                                final int i26 = 1;
                                final int i27 = 0;
                                switch (i25) {
                                    case 0:
                                        p3.m mVar3 = (p3.m) obj11;
                                        int iIntValue2 = ((Integer) obj12).intValue();
                                        if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            x1 x1Var2 = p3.n.f135158a;
                                            h4.r.a aVar9 = h4.r.S;
                                            c2.j.f22691a.getClass();
                                            c2.j.k kVar2 = c2.j.f22694d;
                                            h4.d.f81522a.getClass();
                                            z zVarA3 = c2.y.a(kVar2, h4.d.a.f81536n, mVar3, 0);
                                            int iHashCode3 = Long.hashCode(mVar3.getU());
                                            i2 i2VarX3 = mVar3.x();
                                            h4.r rVarC3 = h4.k.c(aVar9, mVar3);
                                            h5.g.V.getClass();
                                            e0.a aVar10 = h5.g.a.f81805b;
                                            if (mVar3.F() == null) {
                                                p0.l();
                                                throw null;
                                            }
                                            mVar3.z();
                                            if (mVar3.getT()) {
                                                mVar3.M(aVar10);
                                            } else {
                                                mVar3.c();
                                            }
                                            b4.c(h5.g.a.f81810g, zVarA3, mVar3);
                                            b4.c(h5.g.a.f81809f, i2VarX3, mVar3);
                                            h5.g.a.b bVar4 = h5.g.a.f81813j;
                                            if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode3))) {
                                                v.h.z(iHashCode3, mVar3, iHashCode3, bVar4);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC3, mVar3);
                                            b0 b0Var2 = b0.f22601a;
                                            mVar3.C(978953825);
                                            for (final zf2.d dVar : ((f) p1Var2.getF182175a()).f84387d) {
                                                String strA = aVar8.a(dVar);
                                                u4.d dVarC = aVar8.c(dVar);
                                                boolean zR = mVar3.r(nVar2) | mVar3.k(dVar.ordinal());
                                                Object objQ3 = mVar3.q();
                                                if (zR) {
                                                    objQ3 = new e23.a() { // from class: hl1.g
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i26) {
                                                                case 0:
                                                                    nVar2.z4(dVar);
                                                                    break;
                                                                default:
                                                                    nVar2.z4(dVar);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar3.K(objQ3);
                                                } else {
                                                    aVar7.getClass();
                                                    if (objQ3 == p3.m.a.f135155b) {
                                                        objQ3 = new e23.a() { // from class: hl1.g
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i26) {
                                                                    case 0:
                                                                        nVar2.z4(dVar);
                                                                        break;
                                                                    default:
                                                                        nVar2.z4(dVar);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar3.K(objQ3);
                                                    }
                                                }
                                                il1.e.a(null, strA, dVarC, false, false, (e23.a) objQ3, null, null, null, null, mVar3, 0, 985);
                                            }
                                            mVar3.f();
                                            mVar3.y();
                                            x1 x1Var3 = p3.n.f135158a;
                                        } else {
                                            mVar3.e();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        p3.m mVar4 = (p3.m) obj11;
                                        int iIntValue3 = ((Integer) obj12).intValue();
                                        if (mVar4.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var4 = p3.n.f135158a;
                                            h4.r.a aVar11 = h4.r.S;
                                            c2.j.f22691a.getClass();
                                            c2.j.k kVar3 = c2.j.f22694d;
                                            h4.d.f81522a.getClass();
                                            z zVarA4 = c2.y.a(kVar3, h4.d.a.f81536n, mVar4, 0);
                                            int iHashCode4 = Long.hashCode(mVar4.getU());
                                            i2 i2VarX4 = mVar4.x();
                                            h4.r rVarC4 = h4.k.c(aVar11, mVar4);
                                            h5.g.V.getClass();
                                            e0.a aVar12 = h5.g.a.f81805b;
                                            if (mVar4.F() == null) {
                                                p0.l();
                                                throw null;
                                            }
                                            mVar4.z();
                                            if (mVar4.getT()) {
                                                mVar4.M(aVar12);
                                            } else {
                                                mVar4.c();
                                            }
                                            b4.c(h5.g.a.f81810g, zVarA4, mVar4);
                                            b4.c(h5.g.a.f81809f, i2VarX4, mVar4);
                                            h5.g.a.b bVar5 = h5.g.a.f81813j;
                                            if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode4))) {
                                                v.h.z(iHashCode4, mVar4, iHashCode4, bVar5);
                                            }
                                            b4.c(h5.g.a.f81807d, rVarC4, mVar4);
                                            b0 b0Var3 = b0.f22601a;
                                            mVar4.C(583941570);
                                            for (final zf2.d dVar2 : ((f) p1Var2.getF182175a()).f84388e) {
                                                String strA2 = aVar8.a(dVar2);
                                                u4.d dVarC2 = aVar8.c(dVar2);
                                                boolean zR2 = mVar4.r(nVar2) | mVar4.k(dVar2.ordinal());
                                                Object objQ4 = mVar4.q();
                                                if (zR2) {
                                                    objQ4 = new e23.a() { // from class: hl1.g
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i27) {
                                                                case 0:
                                                                    nVar2.z4(dVar2);
                                                                    break;
                                                                default:
                                                                    nVar2.z4(dVar2);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar4.K(objQ4);
                                                } else {
                                                    aVar7.getClass();
                                                    if (objQ4 == p3.m.a.f135155b) {
                                                        objQ4 = new e23.a() { // from class: hl1.g
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i27) {
                                                                    case 0:
                                                                        nVar2.z4(dVar2);
                                                                        break;
                                                                    default:
                                                                        nVar2.z4(dVar2);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar4.K(objQ4);
                                                    }
                                                }
                                                il1.f.a(strA2, dVarC2, null, null, (e23.a) objQ4, null, null, null, null, mVar4, 0, 492);
                                            }
                                            mVar4.f();
                                            mVar4.y();
                                            x1 x1Var5 = p3.n.f135158a;
                                        } else {
                                            mVar4.e();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        }, mVar2), mVar2, 48, 0);
                        mVar2.f();
                    }
                    l72.f0.f110999a.k(y.Q(mVar2, R.string.lbl_all_activities), c2.l.C(b0Var.b(aVar5, h4.d.a.f81537o), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), false, aVar3, mVar2, 0, 4);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ho.e0.c((h4.r) obj10, (Integer) obj9, (Integer) obj7, (jo.a) obj8, (jo.a) obj6, (e23.q) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                ho0.m.a((qo0.a) obj7, (yb0.a) obj8, (e23.l) obj6, (e23.a) obj10, (e23.a) obj9, (e23.l) obj5, (p3.m) obj, p0.t(65));
                return Unit.INSTANCE;
            case 3:
                n82.f fVar2 = (n82.f) obj10;
                qo0.a aVar7 = (qo0.a) obj9;
                Context context = (Context) obj7;
                x3 x3Var = (x3) obj8;
                x3 x3Var2 = (x3) obj6;
                e23.l lVar = (e23.l) obj5;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar8 = h4.r.S;
                    h4.r rVarL = c2.l.l(u1.n.e(x2.d(aVar8, 1.0f), vb.h.e(d92.b.f58623a, mVar3), m1.f128891a));
                    h4.d.f81522a.getClass();
                    h4.g.a aVar9 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    z zVarA3 = c2.y.a(c2.j.f22694d, aVar9, mVar3, 48);
                    int iHashCode3 = Long.hashCode(mVar3.getU());
                    i2 i2VarX3 = mVar3.x();
                    h4.r rVarC3 = h4.k.c(rVarL, mVar3);
                    h5.g.V.getClass();
                    e0.a aVar10 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar10);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar3);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar3, iHashCode3, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar3);
                    b0 b0Var2 = b0.f22601a;
                    Object objQ3 = mVar3.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = new yd1.a(context);
                        mVar3.K(objQ3);
                    }
                    yd1.a aVar11 = (yd1.a) objQ3;
                    Object objQ4 = mVar3.q();
                    if (objQ4 == c2565a) {
                        objQ4 = i53.a.a(o82.g.f130850c, o82.g.f130851d, o82.g.f130853f, o82.g.f130856i);
                        mVar3.K(objQ4);
                    }
                    i53.f fVar3 = (i53.f) objQ4;
                    if (((qo0.d) x3Var.getF182175a()).f145950d) {
                        mVar3.C(-1896440485);
                        i53.c cVarE = i53.a.e(o2.b(fVar3, mVar3));
                        int iIndexOf = fVar3.indexOf(fVar2.f124961b.a());
                        boolean zB3 = mVar3.B(fVar2) | mVar3.r(aVar7);
                        Object objQ5 = mVar3.q();
                        if (zB3 || objQ5 == c2565a) {
                            objQ5 = new gw1.d(fVar2, i17, fVar3, aVar7);
                            mVar3.K(objQ5);
                        }
                        t82.c.a(cVarE, null, iIndexOf, 0.0f, (e23.l) objQ5, mVar3, 3072, 18);
                        mVar = mVar3;
                        q82.a.a(x2.f(aVar8, 1.0f), new n82.n(fVar2, aVar11), null, mVar, 6, 4);
                        mVar.f();
                    } else {
                        mVar = mVar3;
                        mVar.C(-1895762019);
                        mVar.f();
                    }
                    n82.c.a(b0Var2.a(aVar8, 1.0f, true), fVar2, 3, ((qo0.d) x3Var.getF182175a()).f145950d || ((Boolean) x3Var2.getF182175a()).booleanValue(), z3.f.c(-1616107421, new aa2.r(aVar7, 29, fVar2, lVar), mVar), mVar, 24960, 0);
                    mVar.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                ht1.w.f((h4.r) obj10, (String) obj9, (String) obj7, (i53.c) obj8, (i53.c) obj6, (e23.l) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                z0.b((e23.p) obj9, (z3.e) obj7, (z3.e) obj8, (z3.e) obj6, (e23.a) obj10, (mc) obj5, (p3.m) obj, p0.t(3505));
                return Unit.INSTANCE;
            case 6:
                String str = (String) obj10;
                String str2 = (String) obj9;
                String str3 = (String) obj7;
                i53.c cVar2 = (i53.c) obj8;
                go0.e.b bVar5 = (go0.e.b) obj6;
                String str4 = (String) obj5;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar12 = h4.r.S;
                    h4.r rVarD = x2.d(aVar12, 1.0f);
                    boolean zB4 = mVar4.B(str);
                    Object objQ6 = mVar4.q();
                    if (zB4) {
                        objQ6 = new i11.g(str, 23);
                        mVar4.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new i11.g(str, 23);
                            mVar4.K(objQ6);
                        }
                    }
                    h4.r rVarC4 = p5.v.c((e23.l) objQ6, rVarD, false);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA4 = c2.y.a(kVar2, h4.d.a.f81536n, mVar4, 0);
                    int iHashCode4 = Long.hashCode(mVar4.getU());
                    i2 i2VarX4 = mVar4.x();
                    h4.r rVarC5 = h4.k.c(rVarC4, mVar4);
                    h5.g.V.getClass();
                    e0.a aVar13 = h5.g.a.f81805b;
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar13);
                    } else {
                        mVar4.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, zVarA4, mVar4);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX4, mVar4);
                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar4, iHashCode4, bVar6);
                    }
                    h5.g.a.f fVar4 = h5.g.a.f81807d;
                    b4.c(fVar4, rVarC5, mVar4);
                    h4.r rVarA = b0.f22601a.a(x2.f(aVar12, 1.0f), 1.0f, true);
                    f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode5 = Long.hashCode(mVar4.getU());
                    i2 i2VarX5 = mVar4.x();
                    h4.r rVarC6 = h4.k.c(rVarA, mVar4);
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar13);
                    } else {
                        mVar4.c();
                    }
                    b4.c(eVar2, z0VarD, mVar4);
                    b4.c(c1623g, i2VarX5, mVar4);
                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar4, iHashCode5, bVar6);
                    }
                    b4.c(fVar4, rVarC6, mVar4);
                    c2.u uVar = c2.u.f22885a;
                    if (cVar2 == null) {
                        mVar4.C(1191510948);
                        mVar4.f();
                    } else {
                        mVar4.C(1191510949);
                        h4.r rVarH = x2.h(aVar12, yz1.y.k(mVar4));
                        Float f17 = bVar5.f78203e;
                        z72.k.a(rVarH, cVar2, f17, p005kotlin.jvm.internal.s.e(f17, 1.0f) ? d0.a(((z72.l) h0.m0(cVar2)).f202961b) : null, null, yz1.y.g(mVar4), 3.0f, false, false, z3.f.c(584168457, new as.s(str4, 27), mVar4), mVar4, 806879232, 400);
                        mVar4.f();
                    }
                    mVar4.y();
                    h4.r rVarX = x2.x(aVar12, null, 3);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    h4.r rVarA2 = c2.l.A(rVarX, eVar3.f97920e, 0.0f, 2);
                    d92.b.f58624b.getClass();
                    g02.c.a(str2, rVarA2, 0L, null, 0, false, 0, d92.c.b(j92.f.f97930g, mVar4), 0.0d, mVar4, 0, 380);
                    g02.c.a(str3, c2.l.A(x2.x(x2.f(aVar12, 1.0f), null, 3), eVar3.f97920e, 0.0f, 2), 0L, null, 0, false, 0, d92.c.f(j92.f.f97933j, mVar4), 0.0d, mVar4, 0, 380);
                    mVar4.y();
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                iv0.y.b((gv0.d) obj7, (e23.a) obj10, (e23.l) obj8, (e23.p) obj6, (e23.l) obj5, (e23.a) obj9, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 8:
                e23.p pVar = (e23.p) obj10;
                e23.p pVar2 = (e23.p) obj9;
                String str5 = (String) obj7;
                String str6 = (String) obj8;
                String str7 = (String) obj6;
                String str8 = (String) obj5;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    h4.r.a aVar14 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f18 = j92.b.f97899b.f97920e;
                    h4.r rVarY = c2.l.y(aVar14, f18);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar7 = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22692b, bVar7, mVar5, 48);
                    int iHashCode6 = Long.hashCode(mVar5.getU());
                    i2 i2VarX6 = mVar5.x();
                    h4.r rVarC7 = h4.k.c(rVarY, mVar5);
                    h5.g.V.getClass();
                    e0.a aVar15 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar15);
                    } else {
                        mVar5.c();
                    }
                    h5.g.a.e eVar4 = h5.g.a.f81810g;
                    b4.c(eVar4, s2VarA, mVar5);
                    h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                    b4.c(c1623g2, i2VarX6, mVar5);
                    h5.g.a.b bVar8 = h5.g.a.f81813j;
                    if (mVar5.getT()) {
                        f14 = f18;
                    } else {
                        f14 = f18;
                        if (!p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode6))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC7, mVar5);
                        u2 u2Var = u2.f22900a;
                        if (pVar == null) {
                            mVar5.C(-462909393);
                            mVar5.f();
                        } else {
                            v.h.D(mVar5, -984763886, pVar, mVar5, 0);
                            Unit unit2 = Unit.INSTANCE;
                        }
                        if (pVar != null) {
                            f15 = f14;
                            i14 = 0;
                        } else {
                            i14 = 0;
                            g6.f.a aVar16 = g6.f.f75994b;
                            f15 = 0;
                        }
                        if (pVar2 != null) {
                            f16 = f14;
                        } else {
                            g6.f.a aVar17 = g6.f.f75994b;
                            f16 = i14;
                        }
                        h4.r rVarC8 = c2.l.C(u2Var.a(aVar14, 1.0f, true), f15, 0.0f, f16, 0.0f, 10);
                        zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar5, i14);
                        iHashCode = Long.hashCode(mVar5.getU());
                        i2VarX = mVar5.x();
                        rVarC = h4.k.c(rVarC8, mVar5);
                        if (mVar5.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar5.z();
                        if (mVar5.getT()) {
                            mVar5.M(aVar15);
                        } else {
                            mVar5.c();
                        }
                        b4.c(eVar4, zVarA, mVar5);
                        b4.c(c1623g2, i2VarX, mVar5);
                        if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar5, iHashCode, bVar8);
                        }
                        b4.c(fVar, rVarC, mVar5);
                        b0 b0Var3 = b0.f22601a;
                        d92.b.f58624b.getClass();
                        x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar5);
                        h4.r rVarB2 = v2.b(v2.a(aVar14, false, new ih0.a(23), mVar5, 6), str5, new b82.i(10), mVar5, 0);
                        d6.p.f57793b.getClass();
                        mh.c(str6, rVarB2, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 2, 0, null, x0VarB2, mVar5, 0, 24960, 110588);
                        mVar5.C(-255891003);
                        j21.d.b(str7, str8, mVar5, 0);
                        mVar5.f();
                        mVar5.y();
                        if (pVar2 == null) {
                            mVar5.C(-461133713);
                            mVar5.f();
                        } else {
                            v.h.D(mVar5, -984706606, pVar2, mVar5, 0);
                            Unit unit3 = Unit.INSTANCE;
                        }
                        mVar5.y();
                    }
                    v.h.z(iHashCode6, mVar5, iHashCode6, bVar8);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC7, mVar5);
                    u2 u2Var2 = u2.f22900a;
                    if (pVar == null) {
                        mVar5.C(-462909393);
                        mVar5.f();
                    } else {
                        v.h.D(mVar5, -984763886, pVar, mVar5, 0);
                        Unit unit4 = Unit.INSTANCE;
                    }
                    if (pVar != null) {
                        f15 = f14;
                        i14 = 0;
                    } else {
                        i14 = 0;
                        g6.f.a aVar18 = g6.f.f75994b;
                        f15 = 0;
                    }
                    if (pVar2 != null) {
                        f16 = f14;
                    } else {
                        g6.f.a aVar19 = g6.f.f75994b;
                        f16 = i14;
                    }
                    h4.r rVarC9 = c2.l.C(u2Var2.a(aVar14, 1.0f, true), f15, 0.0f, f16, 0.0f, 10);
                    zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar5, i14);
                    iHashCode = Long.hashCode(mVar5.getU());
                    i2VarX = mVar5.x();
                    rVarC = h4.k.c(rVarC9, mVar5);
                    if (mVar5.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar15);
                    } else {
                        mVar5.c();
                    }
                    b4.c(eVar4, zVarA, mVar5);
                    b4.c(c1623g2, i2VarX, mVar5);
                    if (mVar5.getT()) {
                        v.h.z(iHashCode, mVar5, iHashCode, bVar8);
                    } else {
                        v.h.z(iHashCode, mVar5, iHashCode, bVar8);
                    }
                    b4.c(fVar, rVarC, mVar5);
                    b0 b0Var4 = b0.f22601a;
                    d92.b.f58624b.getClass();
                    x0 x0VarB3 = d92.c.b(j92.f.f97931h, mVar5);
                    h4.r rVarB3 = v2.b(v2.a(aVar14, false, new ih0.a(23), mVar5, 6), str5, new b82.i(10), mVar5, 0);
                    d6.p.f57793b.getClass();
                    mh.c(str6, rVarB3, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 2, 0, null, x0VarB3, mVar5, 0, 24960, 110588);
                    mVar5.C(-255891003);
                    j21.d.b(str7, str8, mVar5, 0);
                    mVar5.f();
                    mVar5.y();
                    if (pVar2 == null) {
                        mVar5.C(-461133713);
                        mVar5.f();
                    } else {
                        v.h.D(mVar5, -984706606, pVar2, mVar5, 0);
                        Unit unit5 = Unit.INSTANCE;
                    }
                    mVar5.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 9:
                g3 g3Var = (g3) obj7;
                e23.l lVar2 = (e23.l) obj8;
                final e23.a aVar20 = (e23.a) obj10;
                final e23.a aVar21 = (e23.a) obj9;
                final e23.a aVar22 = (e23.a) obj6;
                final fe feVar = (fe) obj5;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    Boolean bool = (Boolean) g3Var.f35301b;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    p2 p2Var = p2.f111205a;
                    String strQ2 = y.Q(mVar6, R.string.home_screen_insights);
                    z3.e eVarC = z3.f.c(-1913540711, new ap2.f(g3Var, zBooleanValue, i17), mVar6);
                    boolean zB5 = mVar6.B(lVar2) | mVar6.h(zBooleanValue);
                    Object objQ7 = mVar6.q();
                    if (zB5) {
                        obj3 = objQ7;
                        ad0.e eVar5 = new ad0.e(lVar2, zBooleanValue, 9);
                        mVar6.K(eVar5);
                        obj3 = eVar5;
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            obj3 = objQ7;
                            ad0.e eVar6 = new ad0.e(lVar2, zBooleanValue, 9);
                            mVar6.K(eVar6);
                            obj3 = eVar6;
                        }
                    }
                    obj3 = objQ7;
                    p2Var.g(strQ2, null, null, null, eVarC, false, false, (e23.a) obj3, mVar6, 24576, 238);
                    final String strQ3 = y.Q(mVar6, R.string.ai_features_consent_revoked);
                    String strQ4 = y.Q(mVar6, R.string.revoke_active_intelligence_consent);
                    boolean zB6 = mVar6.B(aVar20) | mVar6.B(aVar21) | mVar6.B(strQ3);
                    Object objQ8 = mVar6.q();
                    if (zB6) {
                        final int i25 = 0;
                        objQ8 = new e23.a() { // from class: j91.d
                            @Override // e23.a
                            public final Object invoke() {
                                int i26 = i25;
                                String str9 = strQ3;
                                fe feVar2 = feVar;
                                e23.a aVar23 = aVar21;
                                e23.a aVar24 = aVar20;
                                switch (i26) {
                                    case 0:
                                        aVar24.invoke();
                                        x53.c cVar3 = s0.f129406a;
                                        ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new e.a(aVar23, feVar2, str9, null), 3);
                                        break;
                                    default:
                                        aVar24.invoke();
                                        aVar23.invoke();
                                        x53.c cVar4 = s0.f129406a;
                                        ge1.b.T(o53.c0.a(o.f168762a), null, null, new e.b(feVar2, str9, null), 3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar6.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            final int i26 = 0;
                            objQ8 = new e23.a() { // from class: j91.d
                                @Override // e23.a
                                public final Object invoke() {
                                    int i27 = i26;
                                    String str9 = strQ3;
                                    fe feVar2 = feVar;
                                    e23.a aVar23 = aVar21;
                                    e23.a aVar24 = aVar20;
                                    switch (i27) {
                                        case 0:
                                            aVar24.invoke();
                                            x53.c cVar3 = s0.f129406a;
                                            ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new e.a(aVar23, feVar2, str9, null), 3);
                                            break;
                                        default:
                                            aVar24.invoke();
                                            aVar23.invoke();
                                            x53.c cVar4 = s0.f129406a;
                                            ge1.b.T(o53.c0.a(o.f168762a), null, null, new e.b(feVar2, str9, null), 3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar6.K(objQ8);
                        }
                    }
                    p2Var.g(strQ4, null, null, null, null, false, false, (e23.a) objQ8, mVar6, 0, 254);
                    final String strQ5 = y.Q(mVar6, R.string.ai_language_cache_cleared);
                    String strQ6 = y.Q(mVar6, R.string.reset_ai_language_cache);
                    String strQ7 = y.Q(mVar6, R.string.msg_reset_ai_language_cache);
                    boolean zB7 = mVar6.B(aVar22) | mVar6.B(aVar21) | mVar6.B(strQ5);
                    Object objQ9 = mVar6.q();
                    if (zB7) {
                        final int i27 = 1;
                        objQ9 = new e23.a() { // from class: j91.d
                            @Override // e23.a
                            public final Object invoke() {
                                int i28 = i27;
                                String str9 = strQ5;
                                fe feVar2 = feVar;
                                e23.a aVar23 = aVar21;
                                e23.a aVar24 = aVar22;
                                switch (i28) {
                                    case 0:
                                        aVar24.invoke();
                                        x53.c cVar3 = s0.f129406a;
                                        ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new e.a(aVar23, feVar2, str9, null), 3);
                                        break;
                                    default:
                                        aVar24.invoke();
                                        aVar23.invoke();
                                        x53.c cVar4 = s0.f129406a;
                                        ge1.b.T(o53.c0.a(o.f168762a), null, null, new e.b(feVar2, str9, null), 3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar6.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            final int i28 = 1;
                            objQ9 = new e23.a() { // from class: j91.d
                                @Override // e23.a
                                public final Object invoke() {
                                    int i29 = i28;
                                    String str9 = strQ5;
                                    fe feVar2 = feVar;
                                    e23.a aVar23 = aVar21;
                                    e23.a aVar24 = aVar22;
                                    switch (i29) {
                                        case 0:
                                            aVar24.invoke();
                                            x53.c cVar3 = s0.f129406a;
                                            ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new e.a(aVar23, feVar2, str9, null), 3);
                                            break;
                                        default:
                                            aVar24.invoke();
                                            aVar23.invoke();
                                            x53.c cVar4 = s0.f129406a;
                                            ge1.b.T(o53.c0.a(o.f168762a), null, null, new e.b(feVar2, str9, null), 3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar6.K(objQ9);
                        }
                    }
                    p2Var.h(strQ6, strQ7, null, null, null, false, false, null, null, null, (e23.a) objQ9, mVar6, 0, 0, 1020);
                    String strQ8 = y.Q(mVar6, R.string.home_insight_reloaded);
                    String strQ9 = y.Q(mVar6, R.string.reload_home_insight);
                    String strQ10 = y.Q(mVar6, R.string.msg_fetches_home_insight_immediately);
                    boolean zB8 = mVar6.B(aVar21) | mVar6.B(strQ8);
                    Object objQ10 = mVar6.q();
                    if (zB8) {
                        obj4 = objQ10;
                        d6 d6Var = new d6(aVar21, strQ8, i16, feVar);
                        mVar6.K(d6Var);
                        obj4 = d6Var;
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            obj4 = objQ10;
                            d6 d6Var2 = new d6(aVar21, strQ8, i16, feVar);
                            mVar6.K(d6Var2);
                            obj4 = d6Var2;
                        }
                    }
                    obj4 = objQ10;
                    p2Var.h(strQ9, strQ10, null, null, null, false, false, null, null, null, (e23.a) obj4, mVar6, 0, 0, 1020);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 10:
                return a(obj, obj2);
            case 11:
                mm1.b bVar9 = (mm1.b) obj10;
                DateTime dateTime = (DateTime) obj9;
                DateTime dateTime2 = (DateTime) obj7;
                rl1.i iVar = (rl1.i) obj8;
                List list = (i53.c) obj6;
                e23.l lVar3 = (e23.l) obj5;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    if (list == null) {
                        list = p13.j0.f134944a;
                    }
                    rn1.l.a(bVar9, dateTime, dateTime2, iVar, list, lVar3, mVar7, 8);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 12:
                o82.g gVar = (o82.g) obj10;
                DateTime dateTime3 = (DateTime) obj9;
                np.c cVar3 = (np.c) obj7;
                final ActivityReportsActivity activityReportsActivity = (ActivityReportsActivity) obj8;
                f.c cVar4 = (f.c) obj6;
                am.d dVar = (am.d) obj5;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ActivityReportsActivity.a aVar23 = ActivityReportsActivity.f29758a;
                if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    rp.a aVar24 = rp.a.INSTANCE;
                    b63.o oVarT = (dateTime3 == null || (localDate = dateTime3.toLocalDate()) == null) ? null : g22.k.t(localDate);
                    boolean zR = mVar8.r(activityReportsActivity);
                    Object objQ11 = mVar8.q();
                    if (zR) {
                        final int i29 = false ? 1 : 0;
                        objQ11 = new e23.a() { // from class: jp.b
                            @Override // e23.a
                            public final Object invoke() {
                                int i30 = i29;
                                ActivityReportsActivity activityReportsActivity2 = activityReportsActivity;
                                switch (i30) {
                                    case 0:
                                        ActivityReportsActivity.a aVar25 = ActivityReportsActivity.f29758a;
                                        activityReportsActivity2.finish();
                                        break;
                                    default:
                                        ActivityReportsActivity.a aVar26 = ActivityReportsActivity.f29758a;
                                        activityReportsActivity2.onBackPressed();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar8.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            final int i210 = false ? 1 : 0;
                            objQ11 = new e23.a() { // from class: jp.b
                                @Override // e23.a
                                public final Object invoke() {
                                    int i30 = i210;
                                    ActivityReportsActivity activityReportsActivity2 = activityReportsActivity;
                                    switch (i30) {
                                        case 0:
                                            ActivityReportsActivity.a aVar25 = ActivityReportsActivity.f29758a;
                                            activityReportsActivity2.finish();
                                            break;
                                        default:
                                            ActivityReportsActivity.a aVar26 = ActivityReportsActivity.f29758a;
                                            activityReportsActivity2.onBackPressed();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar8.K(objQ11);
                        }
                    }
                    e23.a aVar25 = (e23.a) objQ11;
                    boolean zR2 = mVar8.r(cVar4) | mVar8.r(dVar) | mVar8.r(activityReportsActivity);
                    Object objQ12 = mVar8.q();
                    if (zR2) {
                        objQ12 = new gw1.d(cVar4, 26, dVar, activityReportsActivity);
                        mVar8.K(objQ12);
                    } else {
                        aVar.getClass();
                        if (objQ12 == p3.m.a.f135155b) {
                            objQ12 = new gw1.d(cVar4, 26, dVar, activityReportsActivity);
                            mVar8.K(objQ12);
                        }
                    }
                    e23.l lVar4 = (e23.l) objQ12;
                    boolean zR3 = mVar8.r(cVar4) | mVar8.r(activityReportsActivity);
                    Object objQ13 = mVar8.q();
                    if (zR3) {
                        objQ13 = new i20.b(i16, cVar4, activityReportsActivity);
                        mVar8.K(objQ13);
                    } else {
                        aVar.getClass();
                        if (objQ13 == p3.m.a.f135155b) {
                            objQ13 = new i20.b(i16, cVar4, activityReportsActivity);
                            mVar8.K(objQ13);
                        }
                    }
                    e23.p pVar3 = (e23.p) objQ13;
                    boolean zR4 = mVar8.r(activityReportsActivity);
                    Object objQ14 = mVar8.q();
                    if (zR4) {
                        objQ14 = new e23.a() { // from class: jp.b
                            @Override // e23.a
                            public final Object invoke() {
                                int i30 = i18;
                                ActivityReportsActivity activityReportsActivity2 = activityReportsActivity;
                                switch (i30) {
                                    case 0:
                                        ActivityReportsActivity.a aVar26 = ActivityReportsActivity.f29758a;
                                        activityReportsActivity2.finish();
                                        break;
                                    default:
                                        ActivityReportsActivity.a aVar27 = ActivityReportsActivity.f29758a;
                                        activityReportsActivity2.onBackPressed();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar8.K(objQ14);
                    } else {
                        aVar.getClass();
                        if (objQ14 == p3.m.a.f135155b) {
                            objQ14 = new e23.a() { // from class: jp.b
                                @Override // e23.a
                                public final Object invoke() {
                                    int i30 = i18;
                                    ActivityReportsActivity activityReportsActivity2 = activityReportsActivity;
                                    switch (i30) {
                                        case 0:
                                            ActivityReportsActivity.a aVar26 = ActivityReportsActivity.f29758a;
                                            activityReportsActivity2.finish();
                                            break;
                                        default:
                                            ActivityReportsActivity.a aVar27 = ActivityReportsActivity.f29758a;
                                            activityReportsActivity2.onBackPressed();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar8.K(objQ14);
                        }
                    }
                    rp.d.a(aVar24, gVar, oVarT, cVar3, aVar25, lVar4, pVar3, (e23.a) objQ14, mVar8, 6);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 13:
                b11.i.b bVar10 = (b11.i.b) obj8;
                l11.s sVar = (l11.s) obj6;
                e23.l lVar5 = (e23.l) obj5;
                e23.a aVar26 = (e23.a) obj10;
                e23.a aVar27 = (e23.a) obj9;
                p1 p1Var2 = (p1) obj7;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    boolean z15 = sVar.f108247k;
                    boolean z16 = sVar.f108248l;
                    boolean z17 = sVar.f108249m;
                    Object objQ15 = mVar9.q();
                    aVar.getClass();
                    if (objQ15 == p3.m.a.f135155b) {
                        objQ15 = new i3.v2(p1Var2, 22);
                        mVar9.K(objQ15);
                    }
                    a0.d(bVar10, z15, z16, z17, lVar5, aVar26, (e23.l) objQ15, aVar27, mVar9, 1572864);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 14:
                return b(obj, obj2);
            case 15:
                return c(obj, obj2);
            case 16:
                return d(obj, obj2);
            case 17:
                ((Integer) obj2).getClass();
                ki1.k.c((ki1.l) obj7, (e23.l) obj8, (e23.a) obj10, (e23.a) obj9, (e23.a) obj6, (e23.a) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                kj2.h.a((h4.r) obj10, (List) obj9, (String) obj7, (o13.p) obj8, (nj2.a.b) obj6, (e23.l) obj5, (p3.m) obj, p0.t(24583));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                ky0.r.a((mc) obj10, (o53.b0) obj9, (ky0.f) obj7, (String) obj8, (String) obj6, (e23.p) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 20:
                return e(obj, obj2);
            case 21:
                return f(obj, obj2);
            case 22:
                return g(obj, obj2);
            case 23:
                return h(obj, obj2);
            case 24:
                return i(obj, obj2);
            case 25:
                return j(obj, obj2);
            case 26:
                return k(obj, obj2);
            case 27:
                return l(obj, obj2);
            case 28:
                return n(obj, obj2);
            default:
                String str9 = (String) obj10;
                gs1.t tVar = (gs1.t) obj9;
                ix.j jVar = (ix.j) obj8;
                p1 p1Var3 = (p1) obj7;
                jx.a aVar28 = (jx.a) obj6;
                gt.a aVar29 = (gt.a) obj5;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    w1 w1Var = w1.TopCenter;
                    l72.x1 x1Var10 = l72.x1.EndMedium;
                    long j8 = (((long) (-18)) << 32) | (((long) 60) & 4294967295L);
                    g6.k.a aVar30 = g6.k.f76003b;
                    if (tVar != null && tVar.u()) {
                        z14 = ((ix.l) p1Var3.getF182175a()).f95667g ? ((ix.l) p1Var3.getF182175a()).f95665e : ((ix.l) p1Var3.getF182175a()).f95666f;
                    }
                    boolean z18 = z14;
                    boolean zR5 = mVar10.r(jVar);
                    Object objQ16 = mVar10.q();
                    if (zR5) {
                        objQ16 = new ov1.u(jVar, 1);
                        mVar10.K(objQ16);
                    } else {
                        aVar.getClass();
                        if (objQ16 == p3.m.a.f135155b) {
                            objQ16 = new ov1.u(jVar, 1);
                            mVar10.K(objQ16);
                        }
                    }
                    a1.a(str9, w1Var, x1Var10, null, j8, z18, (e23.a) objQ16, z3.f.c(461127364, new ng2.i(aVar28, 7, aVar29, jVar), mVar10), mVar10, 100863360, 18);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ j(g3 g3Var, e23.l lVar, e23.a aVar, e23.a aVar2, e23.a aVar3, fe feVar) {
        this.f84402a = 9;
        this.f84405d = g3Var;
        this.f84406e = lVar;
        this.f84403b = aVar;
        this.f84404c = aVar2;
        this.f84407f = aVar3;
        this.f84408g = feVar;
    }

    public /* synthetic */ j(e23.p pVar, z3.e eVar, z3.e eVar2, z3.e eVar3, e23.a aVar, mc mcVar, int i14) {
        this.f84402a = 5;
        this.f84404c = pVar;
        this.f84405d = eVar;
        this.f84406e = eVar2;
        this.f84407f = eVar3;
        this.f84403b = aVar;
        this.f84408g = mcVar;
    }

    public /* synthetic */ j(gv0.d dVar, e23.a aVar, e23.l lVar, e23.p pVar, e23.l lVar2, e23.a aVar2, int i14) {
        this.f84402a = 7;
        this.f84405d = dVar;
        this.f84403b = aVar;
        this.f84406e = lVar;
        this.f84407f = pVar;
        this.f84408g = lVar2;
        this.f84404c = aVar2;
    }

    public /* synthetic */ j(Object obj, u1 u1Var, e23.l lVar, e23.a aVar, e23.a aVar2, o13.h hVar, int i14, int i15) {
        this.f84402a = i15;
        this.f84405d = obj;
        this.f84406e = u1Var;
        this.f84407f = lVar;
        this.f84403b = aVar;
        this.f84404c = aVar2;
        this.f84408g = hVar;
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i14) {
        this.f84402a = i14;
        this.f84403b = obj;
        this.f84404c = obj2;
        this.f84405d = obj3;
        this.f84406e = obj4;
        this.f84407f = obj5;
        this.f84408g = obj6;
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, o13.h hVar, int i14, int i15) {
        this.f84402a = i15;
        this.f84403b = obj;
        this.f84404c = obj2;
        this.f84405d = obj3;
        this.f84406e = obj4;
        this.f84407f = obj5;
        this.f84408g = hVar;
    }

    public /* synthetic */ j(Object obj, o13.h hVar, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, int i14, int i15) {
        this.f84402a = i15;
        this.f84405d = obj;
        this.f84406e = hVar;
        this.f84403b = aVar;
        this.f84404c = aVar2;
        this.f84407f = aVar3;
        this.f84408g = aVar4;
    }

    public /* synthetic */ j(String str, gs1.t tVar, ix.j jVar, p1 p1Var, jx.a aVar, gt.a aVar2) {
        this.f84402a = 29;
        this.f84403b = str;
        this.f84404c = tVar;
        this.f84406e = jVar;
        this.f84405d = p1Var;
        this.f84407f = aVar;
        this.f84408g = aVar2;
    }

    public /* synthetic */ j(k62.d dVar, List list, d6 d6Var, k62.k kVar, fv0.d dVar2, p1 p1Var) {
        this.f84402a = 14;
        this.f84403b = dVar;
        this.f84404c = list;
        this.f84406e = d6Var;
        this.f84407f = kVar;
        this.f84408g = dVar2;
        this.f84405d = p1Var;
    }

    public /* synthetic */ j(lc.y yVar, nj2.a aVar, p1 p1Var, e23.l lVar, p1 p1Var2, p1 p1Var3) {
        this.f84402a = 21;
        this.f84403b = yVar;
        this.f84404c = aVar;
        this.f84406e = p1Var;
        this.f84407f = lVar;
        this.f84405d = p1Var2;
        this.f84408g = p1Var3;
    }

    public /* synthetic */ j(ll1.e eVar, u0 u0Var, gl1.a aVar, gl1.b bVar, j0 j0Var, e23.a aVar2, int i14) {
        this.f84402a = 22;
        this.f84404c = eVar;
        this.f84405d = u0Var;
        this.f84406e = aVar;
        this.f84407f = bVar;
        this.f84408g = j0Var;
        this.f84403b = aVar2;
    }

    public /* synthetic */ j(m4.b0 b0Var, m4.q qVar, String str, e23.l lVar, e23.a aVar, e23.a aVar2) {
        this.f84402a = 26;
        this.f84405d = b0Var;
        this.f84406e = qVar;
        this.f84407f = str;
        this.f84408g = lVar;
        this.f84403b = aVar;
        this.f84404c = aVar2;
    }
}
