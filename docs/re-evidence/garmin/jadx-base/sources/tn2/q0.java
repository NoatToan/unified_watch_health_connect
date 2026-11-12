package tn2;

import android.content.Context;
import android.os.Parcelable;
import android.util.Base64;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import gl1.y;
import i3.mh;
import java.util.Locale;
import java.util.Map;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;
import s5.l0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class q0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165621a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f165622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f165623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f165624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f165625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f165626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f165627g;

    public /* synthetic */ q0(aa1.c cVar, p1 p1Var, e23.l lVar, e23.l lVar2, p1 p1Var2, p1 p1Var3) {
        this.f165624d = cVar;
        this.f165625e = p1Var;
        this.f165622b = lVar;
        this.f165623c = lVar2;
        this.f165626f = p1Var2;
        this.f165627g = p1Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) throws IllegalAccessException {
        String iSO3Language;
        int i14 = this.f165621a;
        int i15 = 7;
        final int i16 = 2;
        int i17 = 21;
        final int i18 = 0;
        Object obj2 = this.f165627g;
        Object obj3 = this.f165622b;
        Object obj4 = this.f165626f;
        Object obj5 = this.f165625e;
        Object obj6 = this.f165624d;
        Object obj7 = this.f165623c;
        final int i19 = 1;
        switch (i14) {
            case 0:
                e23.l lVar = (e23.l) obj3;
                r0 r0Var = (r0) obj6;
                pn2.t tVar = (pn2.t) obj5;
                String str = (String) obj4;
                e23.l lVar2 = (e23.l) obj7;
                w.f fVar = (w.f) obj;
                Logger logger = r0.f165631n;
                fVar.getClass();
                lVar.invoke(14);
                f fVar2 = f.f165551a;
                byte[] bArr = fVar.f165719a;
                bArr.getClass();
                fVar2.getClass();
                String strA = f.a(bArr);
                Byte b14 = fVar.f165725g;
                b14.getClass();
                String strA2 = f.a(new byte[]{b14.byteValue()});
                w.a aVar = fVar.f165721c;
                aVar.getClass();
                String strA3 = f.a(aVar.f165684b);
                w.a aVar2 = fVar.f165721c;
                aVar2.getClass();
                String strA4 = f.a(aVar2.f165685c);
                w.a aVar3 = fVar.f165721c;
                aVar3.getClass();
                String strA5 = f.a(aVar3.f165686d);
                byte[] bArr2 = fVar.f165723e;
                bArr2.getClass();
                String strA6 = f.a(bArr2);
                String strB = qn2.u.f145900a.b();
                pn2.n nVar = r0Var.f165637f;
                nVar.getClass();
                qn2.t tVarB = nVar.b(strB, strA2, null);
                pn2.o oVar = r0Var.f165638g;
                w.a.EnumC3112a.f165690c.getClass();
                qn2.b bVar = new qn2.b(pn2.a.EnumC2623a.INSTANCE1.f138701a, strA3, strA4, strA5);
                String lastNameKana = tVar.getLastNameKana();
                String firstNameKana = tVar.getFirstNameKana();
                String birthday = tVar.getBirthday();
                String gender = tVar.getGender();
                String mobilePhoneNumber = tVar.getMobilePhoneNumber();
                byte[] bytes = ((String) obj2).getBytes(d53.c.f57667c);
                bytes.getClass();
                String strEncodeToString = Base64.encodeToString(bytes, 2);
                strEncodeToString.getClass();
                oVar.getClass();
                lastNameKana.getClass();
                kg.f.p(firstNameKana, birthday, gender, mobilePhoneNumber);
                Locale locale = h7.e.a(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getResources().getConfiguration()).f82328a.get(0);
                if (locale == null || (iSO3Language = locale.getISO3Language()) == null) {
                    iSO3Language = Locale.getDefault().getISO3Language();
                }
                pn2.a.f138690a.getClass();
                String str2 = iSO3Language;
                qn2.w wVar = new qn2.w(pn2.a.d().f138742b, pn2.a.d().f138744d, strA);
                str2.getClass();
                pn2.m<qn2.t, qn2.d> mVar = new pn2.m<>(tVarB, new qn2.d(wVar, bVar, str2, pn2.a.e().f138762b, pn2.a.e().f138763c, pn2.a.e().f138764d, new pn2.r(new pn2.b(new pn2.t(lastNameKana, firstNameKana, birthday, gender, mobilePhoneNumber)), new pn2.j(str, new pn2.q(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, strEncodeToString)), null, null, null)));
                mn2.b bVar2 = r0Var.f165633b;
                String strValueOf = String.valueOf(r0Var.f165632a.f165682c);
                String str3 = pn2.a.e().f138762b;
                Logger logger2 = mn2.j.f119822a;
                bVar2.getClass();
                strValueOf.getClass();
                str3.getClass();
                q03.r<c83.a0<pn2.p<rn2.c>>> rVarT = bVar2.t(strValueOf, strA, str3, mVar);
                mn2.e eVar = new mn2.e(new mn2.d(lVar2, bVar2, strValueOf, strA, str3, mVar, 6), 7);
                rVarT.getClass();
                int i24 = w03.b.f181178a;
                return new e13.r(new e13.j(new e13.j(rVarT, eVar), new v(new b82.l0(lVar, r0Var, strA6, strB, strA, strA2, lVar2), 20)), new v(new m(r0Var, 19), 21));
            case 1:
                e23.a aVar4 = (e23.a) obj7;
                c42.b bVar3 = (c42.b) obj6;
                lc.m0 m0Var = (lc.m0) obj5;
                Context context = (Context) obj4;
                c.q qVar = (c.q) obj2;
                lc.k0 k0Var = (lc.k0) obj;
                k0Var.getClass();
                w02.b bVar4 = new w02.b(i15, context, m0Var);
                ky0.w wVar2 = new ky0.w(m0Var, 27);
                aVar4.getClass();
                z3.e eVar2 = new z3.e(-1747459906, true, new qw.b((q71.e) obj3, aVar4, bVar4, wVar2, 10));
                p13.k0 k0Var2 = p13.k0.f134949a;
                k0Var2.getClass();
                w32.e eVar3 = w32.e.f181881a;
                w32.f fVar3 = w32.f.f181882a;
                w32.g gVar = w32.g.f181883a;
                w32.h hVar = w32.h.f181884a;
                p13.j0 j0Var = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                nc.n.a(k0Var, t0Var.b(w32.d.class), k0Var2, j0Var, eVar3, fVar3, gVar, hVar, eVar2);
                int i25 = ro0.m.f153860v;
                k23.p pVarC = p005kotlin.jvm.internal.s0.c(c42.b.class);
                Object obj8 = c42.b.class.getDeclaredField("CREATOR").get(null);
                Parcelable.Creator creator = obj8 instanceof Parcelable.Creator ? (Parcelable.Creator) obj8 : null;
                if (creator == null) {
                    n23.j.A(t0Var.b(c42.b.class).D(), "Could not access CREATOR field in class ");
                    return null;
                }
                Map mapB = p13.t0.b(new o13.p(pVarC, new ro0.m(c42.b.class, creator, "extra_vo2_help_data")));
                HelpActivity.f36653a.getClass();
                lc.b bVar5 = new lc.b((lc.a) k0Var.f111792h.b(lc.a.class), t0Var.b(w32.c.class), p13.u0.h(p13.t0.b(HelpActivity.a.c()), mapB));
                bVar5.f111721i = t0Var.b(HelpActivity.class);
                k0Var.f111797m.add(bVar5.a());
                gl1.b bVar6 = new gl1.b(qVar, context, 4);
                ug2.x xVar = new ug2.x(m0Var, 15);
                m0Var.getClass();
                c42.n.b bVar7 = c42.n.b.INSTANCE;
                k23.p pVarC2 = p005kotlin.jvm.internal.s0.c(c42.b.class);
                Object obj9 = c42.b.class.getDeclaredField("CREATOR").get(null);
                Parcelable.Creator creator2 = obj9 instanceof Parcelable.Creator ? (Parcelable.Creator) obj9 : null;
                if (creator2 != null) {
                    ge1.b.U(k0Var, t0Var.b(c42.n.c.class), bVar7, p13.t0.b(new o13.p(pVarC2, new ro0.m(c42.b.class, creator2, "extraData"))), new am.e1(bVar3, m0Var, aVar4, bVar6, xVar, 3));
                    return Unit.INSTANCE;
                }
                n23.j.A(t0Var.b(c42.b.class).D(), "Could not access CREATOR field in class ");
                return null;
            case 2:
                final aa1.c cVar = (aa1.c) obj6;
                p1 p1Var = (p1) obj5;
                e23.l lVar3 = (e23.l) obj3;
                e23.l lVar4 = (e23.l) obj7;
                p1 p1Var2 = (p1) obj4;
                p1 p1Var3 = (p1) obj2;
                e2.f0 f0Var = (e2.f0) obj;
                f0Var.getClass();
                e2.f0.b(f0Var, null, new z3.e(-1962297580, true, new e23.q() { // from class: x91.a
                    /* JADX WARN: Code duplicated, block: B:14:0x0067  */
                    @Override // e23.q
                    public final Object invoke(Object obj10, Object obj11, Object obj12) {
                        int i26 = i18;
                        aa1.c cVar2 = cVar;
                        switch (i26) {
                            case 0:
                                p3.m mVar2 = (p3.m) obj11;
                                int iIntValue = ((Integer) obj12).intValue();
                                ((e2.d) obj10).getClass();
                                if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    x1 x1Var = p3.n.f135158a;
                                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    h4.r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
                                    String str4 = cVar2.f2236d;
                                    d92.b.f58624b.getClass();
                                    mh.c(str4, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar2), mVar2, 0, 0, 131068);
                                } else {
                                    mVar2.e();
                                }
                                break;
                            case 1:
                                p3.m mVar3 = (p3.m) obj11;
                                int iIntValue2 = ((Integer) obj12).intValue();
                                ((e2.d) obj10).getClass();
                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    x1 x1Var2 = p3.n.f135158a;
                                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    j92.e eVar4 = j92.b.f97899b;
                                    h4.r rVarC = c2.l.C(c2.l.A(rVarF2, eVar4.f97920e, 0.0f, 2), 0.0f, eVar4.f97920e, 0.0f, eVar4.f97917b, 5);
                                    String strP = y.P(R.string.lbl_value_personal_record, new Object[]{cVar2.f2235c}, mVar3);
                                    z5.b.f202439b.getClass();
                                    String strB2 = l0.b(strP, z5.b.a.a());
                                    d92.b.f58624b.getClass();
                                    mh.c(strB2, rVarC, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar3), mVar3, 0, 0, 131068);
                                } else {
                                    mVar3.e();
                                }
                                break;
                            default:
                                p3.m mVar4 = (p3.m) obj11;
                                int iIntValue3 = ((Integer) obj12).intValue();
                                ((e2.d) obj10).getClass();
                                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    x1 x1Var3 = p3.n.f135158a;
                                    h4.r.a aVar5 = h4.r.S;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    j92.e eVar5 = j92.b.f97899b;
                                    h4.r rVarC2 = c2.l.C(c2.l.A(aVar5, eVar5.f97920e, 0.0f, 2), 0.0f, eVar5.f97917b, 0.0f, 0.0f, 13);
                                    boolean zR = mVar4.r(cVar2);
                                    Object objQ = mVar4.q();
                                    if (zR) {
                                        objQ = new vu1.b(cVar2, 29);
                                        mVar4.K(objQ);
                                    } else {
                                        p3.m.f135153a.getClass();
                                        if (objQ == p3.m.a.f135155b) {
                                            objQ = new vu1.b(cVar2, 29);
                                            mVar4.K(objQ);
                                        }
                                    }
                                    h4.r rVarC3 = p5.v.c((e23.l) objQ, rVarC2, false);
                                    String str5 = cVar2.f2247o;
                                    d92.b.f58624b.getClass();
                                    mh.c(str5, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar4), mVar4, 0, 0, 131068);
                                } else {
                                    mVar4.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                e2.f0.b(f0Var, null, new z3.e(-879698741, true, new e23.q() { // from class: x91.a
                    /* JADX WARN: Code duplicated, block: B:14:0x0067  */
                    @Override // e23.q
                    public final Object invoke(Object obj10, Object obj11, Object obj12) {
                        int i26 = i19;
                        aa1.c cVar2 = cVar;
                        switch (i26) {
                            case 0:
                                p3.m mVar2 = (p3.m) obj11;
                                int iIntValue = ((Integer) obj12).intValue();
                                ((e2.d) obj10).getClass();
                                if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    x1 x1Var = p3.n.f135158a;
                                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    h4.r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
                                    String str4 = cVar2.f2236d;
                                    d92.b.f58624b.getClass();
                                    mh.c(str4, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar2), mVar2, 0, 0, 131068);
                                } else {
                                    mVar2.e();
                                }
                                break;
                            case 1:
                                p3.m mVar3 = (p3.m) obj11;
                                int iIntValue2 = ((Integer) obj12).intValue();
                                ((e2.d) obj10).getClass();
                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    x1 x1Var2 = p3.n.f135158a;
                                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    j92.e eVar4 = j92.b.f97899b;
                                    h4.r rVarC = c2.l.C(c2.l.A(rVarF2, eVar4.f97920e, 0.0f, 2), 0.0f, eVar4.f97920e, 0.0f, eVar4.f97917b, 5);
                                    String strP = y.P(R.string.lbl_value_personal_record, new Object[]{cVar2.f2235c}, mVar3);
                                    z5.b.f202439b.getClass();
                                    String strB2 = l0.b(strP, z5.b.a.a());
                                    d92.b.f58624b.getClass();
                                    mh.c(strB2, rVarC, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar3), mVar3, 0, 0, 131068);
                                } else {
                                    mVar3.e();
                                }
                                break;
                            default:
                                p3.m mVar4 = (p3.m) obj11;
                                int iIntValue3 = ((Integer) obj12).intValue();
                                ((e2.d) obj10).getClass();
                                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    x1 x1Var3 = p3.n.f135158a;
                                    h4.r.a aVar5 = h4.r.S;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    j92.e eVar5 = j92.b.f97899b;
                                    h4.r rVarC2 = c2.l.C(c2.l.A(aVar5, eVar5.f97920e, 0.0f, 2), 0.0f, eVar5.f97917b, 0.0f, 0.0f, 13);
                                    boolean zR = mVar4.r(cVar2);
                                    Object objQ = mVar4.q();
                                    if (zR) {
                                        objQ = new vu1.b(cVar2, 29);
                                        mVar4.K(objQ);
                                    } else {
                                        p3.m.f135153a.getClass();
                                        if (objQ == p3.m.a.f135155b) {
                                            objQ = new vu1.b(cVar2, 29);
                                            mVar4.K(objQ);
                                        }
                                    }
                                    h4.r rVarC3 = p5.v.c((e23.l) objQ, rVarC2, false);
                                    String str5 = cVar2.f2247o;
                                    d92.b.f58624b.getClass();
                                    mh.c(str5, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar4), mVar4, 0, 0, 131068);
                                } else {
                                    mVar4.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                e2.f0.b(f0Var, null, new z3.e(-1467161012, true, new vv0.e(i17, cVar, p1Var)), 3);
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    e2.f0.b(f0Var, null, new z3.e(-1253417745, true, new x91.b(lVar3, cVar)), 3);
                }
                e2.f0.b(f0Var, null, new z3.e(-2054623283, true, new vd0.f0((Object) cVar, lVar4, p1Var2, (Object) p1Var3, 5)), 3);
                if (cVar.f2247o.length() > 0) {
                    e2.f0.b(f0Var, null, new z3.e(1748989926, true, new e23.q() { // from class: x91.a
                        /* JADX WARN: Code duplicated, block: B:14:0x0067  */
                        @Override // e23.q
                        public final Object invoke(Object obj10, Object obj11, Object obj12) {
                            int i26 = i16;
                            aa1.c cVar2 = cVar;
                            switch (i26) {
                                case 0:
                                    p3.m mVar2 = (p3.m) obj11;
                                    int iIntValue = ((Integer) obj12).intValue();
                                    ((e2.d) obj10).getClass();
                                    if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        x1 x1Var = p3.n.f135158a;
                                        h4.r rVarF = x2.f(h4.r.S, 1.0f);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        h4.r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
                                        String str4 = cVar2.f2236d;
                                        d92.b.f58624b.getClass();
                                        mh.c(str4, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar2), mVar2, 0, 0, 131068);
                                    } else {
                                        mVar2.e();
                                    }
                                    break;
                                case 1:
                                    p3.m mVar3 = (p3.m) obj11;
                                    int iIntValue2 = ((Integer) obj12).intValue();
                                    ((e2.d) obj10).getClass();
                                    if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        x1 x1Var2 = p3.n.f135158a;
                                        h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        j92.e eVar4 = j92.b.f97899b;
                                        h4.r rVarC = c2.l.C(c2.l.A(rVarF2, eVar4.f97920e, 0.0f, 2), 0.0f, eVar4.f97920e, 0.0f, eVar4.f97917b, 5);
                                        String strP = y.P(R.string.lbl_value_personal_record, new Object[]{cVar2.f2235c}, mVar3);
                                        z5.b.f202439b.getClass();
                                        String strB2 = l0.b(strP, z5.b.a.a());
                                        d92.b.f58624b.getClass();
                                        mh.c(strB2, rVarC, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar3), mVar3, 0, 0, 131068);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                default:
                                    p3.m mVar4 = (p3.m) obj11;
                                    int iIntValue3 = ((Integer) obj12).intValue();
                                    ((e2.d) obj10).getClass();
                                    if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                        x1 x1Var3 = p3.n.f135158a;
                                        h4.r.a aVar5 = h4.r.S;
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        j92.e eVar5 = j92.b.f97899b;
                                        h4.r rVarC2 = c2.l.C(c2.l.A(aVar5, eVar5.f97920e, 0.0f, 2), 0.0f, eVar5.f97917b, 0.0f, 0.0f, 13);
                                        boolean zR = mVar4.r(cVar2);
                                        Object objQ = mVar4.q();
                                        if (zR) {
                                            objQ = new vu1.b(cVar2, 29);
                                            mVar4.K(objQ);
                                        } else {
                                            p3.m.f135153a.getClass();
                                            if (objQ == p3.m.a.f135155b) {
                                                objQ = new vu1.b(cVar2, 29);
                                                mVar4.K(objQ);
                                            }
                                        }
                                        h4.r rVarC3 = p5.v.c((e23.l) objQ, rVarC2, false);
                                        String str5 = cVar2.f2247o;
                                        d92.b.f58624b.getClass();
                                        mh.c(str5, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar4), mVar4, 0, 0, 131068);
                                    } else {
                                        mVar4.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }), 3);
                }
                return Unit.INSTANCE;
            default:
                p1 p1Var4 = (p1) obj7;
                k02.d dVar = (k02.d) obj6;
                hf.j jVar = (hf.j) obj5;
                p1 p1Var5 = (p1) obj4;
                e23.l lVar5 = (e23.l) obj3;
                p1 p1Var6 = (p1) obj2;
                f2.j0 j0Var2 = (f2.j0) obj;
                j0Var2.getClass();
                if (((i53.c) p1Var4.getF182175a()).isEmpty()) {
                    return Unit.INSTANCE;
                }
                i53.c cVar2 = (i53.c) p1Var4.getF182175a();
                j0Var2.g(cVar2.size(), new y22.s.e(new y20.k(10), cVar2), new y22.s.f(new xn.a(18), cVar2), new y22.s.g(cVar2), new z3.e(-1942245546, true, new y22.s.h(cVar2, dVar, jVar, p1Var5, lVar5, p1Var6, p1Var4)));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ q0(e23.l lVar, r0 r0Var, pn2.t tVar, String str, String str2, e23.l lVar2) {
        this.f165622b = lVar;
        this.f165624d = r0Var;
        this.f165625e = tVar;
        this.f165626f = str;
        this.f165627g = str2;
        this.f165623c = lVar2;
    }

    public /* synthetic */ q0(p1 p1Var, k02.d dVar, hf.j jVar, p1 p1Var2, e23.l lVar, p1 p1Var3) {
        this.f165623c = p1Var;
        this.f165624d = dVar;
        this.f165625e = jVar;
        this.f165626f = p1Var2;
        this.f165622b = lVar;
        this.f165627g = p1Var3;
    }

    public /* synthetic */ q0(q71.e eVar, e23.a aVar, c42.b bVar, lc.m0 m0Var, Context context, c.q qVar) {
        this.f165622b = eVar;
        this.f165623c = aVar;
        this.f165624d = bVar;
        this.f165625e = m0Var;
        this.f165626f = context;
        this.f165627g = qVar;
    }
}
