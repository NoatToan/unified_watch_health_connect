package m92;

import android.content.DialogInterface;
import android.net.Uri;
import androidx.lifecycle.w1;
import b82.d1;
import c2.q1;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.group.details.about.member.GroupDetailMemberListFragment;
import com.garmin.android.apps.connectmobile.group.details.about.member.GroupTransferOwnershipActivity;
import com.garmin.android.apps.connectmobile.intensityminutes.presentation.IntensityMinutesReportsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.index.InviteByEmailActivity;
import com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.common.NewFitPayWebNavigationActivity;
import com.google.android.exoplayer2.C;
import com.google.maps.android.compose.MarkerKt;
import com.google.maps.android.compose.MarkerState;
import com.mapbox.maps.InteractionContext;
import com.mapbox.maps.interactions.FeaturesetFeature;
import f72.d2;
import f72.fe;
import i3.ff;
import i3.hf;
import i3.i7;
import i3.mh;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l72.c3;
import lc.u0;
import o72.i3;
import okhttp3.internal.Util;
import p005kotlin.Unit;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.m1;
import p3.p1;
import p3.x1;
import s5.x0;
import u1.a2;
import u62.a3;
import u62.f3;
import u62.n5;
import u62.z2;
import v62.a6;
import v62.n8;
import v62.o4;
import v62.q5;
import v62.t7;
import v62.v7;
import v62.w7;
import yc.z0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f117300b;

    public /* synthetic */ f(Object obj, int i14) {
        this.f117299a = i14;
        this.f117300b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0214  */
    private final Object a(Object obj, Object obj2) {
        i53.c cVarE;
        ArrayList arrayList;
        List<String> list;
        List<String> list2;
        List<String> list3;
        i53.c cVarE2;
        List<String> list4;
        List<String> list5;
        ov1.f fVar = (ov1.f) this.f117300b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ov1.f.a aVar = ov1.f.f134159c;
        boolean z14 = true;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            pv1.b bVarV6 = fVar.v6();
            String strQ = gl1.y.Q(mVar, R.string.lbl_rest_day);
            strQ.getClass();
            i53.c cVarE3 = null;
            if (bVarV6.p5()) {
                mv1.b bVar = (mv1.b) bVarV6.R0.getValue();
                if (bVar == null || (list5 = bVar.f121173b) == null) {
                    cVarE2 = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(p13.y.r(list5, 10));
                    Iterator<T> it = list5.iterator();
                    while (it.hasNext()) {
                        wr.g.z(wt1.q.f187120f, (String) it.next(), arrayList2);
                    }
                    cVarE2 = i53.a.e(arrayList2);
                }
                if (bVar != null && (list4 = bVar.f121172a) != null) {
                    ArrayList arrayList3 = new ArrayList(p13.y.r(list4, 10));
                    Iterator<T> it3 = list4.iterator();
                    while (it3.hasNext()) {
                        wr.g.z(wt1.q.f187120f, (String) it3.next(), arrayList3);
                    }
                    cVarE3 = i53.a.e(arrayList3);
                }
                w13.c<wt1.q> cVar = wt1.q.f187129o;
                ArrayList arrayList4 = new ArrayList(p13.y.r(cVar, 10));
                for (wt1.q qVar : cVar) {
                    boolean z15 = (cVarE3 == null || !cVarE3.contains(qVar)) ? z14 : false;
                    boolean zContains = cVarE2 != null ? cVarE2.contains(qVar) : false;
                    String str = z15 ? strQ : "";
                    String str2 = bVarV6.f141496h1;
                    arrayList4.add(new mv1.f(qVar, str, zContains, str2 == null || str2.length() == 0 || !z15));
                    z14 = true;
                }
                arrayList = new ArrayList(arrayList4);
            } else if (bVarV6.n5()) {
                mv1.c cVar2 = (mv1.c) bVarV6.Y0.getValue();
                if (cVar2 != null && (list3 = cVar2.f121181a) != null) {
                    ArrayList arrayList5 = new ArrayList(p13.y.r(list3, 10));
                    Iterator<T> it4 = list3.iterator();
                    while (it4.hasNext()) {
                        wr.g.z(wt1.q.f187120f, (String) it4.next(), arrayList5);
                    }
                    cVarE3 = i53.a.e(arrayList5);
                }
                w13.c<wt1.q> cVar3 = wt1.q.f187129o;
                ArrayList arrayList6 = new ArrayList(p13.y.r(cVar3, 10));
                for (wt1.q qVar2 : cVar3) {
                    arrayList6.add(new mv1.f(qVar2, "", cVarE3 != null ? cVarE3.contains(qVar2) : false, true));
                }
                arrayList = new ArrayList(arrayList6);
            } else {
                mv1.a aVar2 = (mv1.a) bVarV6.N0.getValue();
                if (aVar2 == null || (list2 = aVar2.f121167e) == null) {
                    cVarE = null;
                } else {
                    ArrayList arrayList7 = new ArrayList(p13.y.r(list2, 10));
                    Iterator<T> it5 = list2.iterator();
                    while (it5.hasNext()) {
                        wr.g.z(wt1.q.f187120f, (String) it5.next(), arrayList7);
                    }
                    cVarE = i53.a.e(arrayList7);
                }
                if (aVar2 != null && (list = aVar2.f121166d) != null) {
                    ArrayList arrayList8 = new ArrayList(p13.y.r(list, 10));
                    Iterator<T> it6 = list.iterator();
                    while (it6.hasNext()) {
                        wr.g.z(wt1.q.f187120f, (String) it6.next(), arrayList8);
                    }
                    cVarE3 = i53.a.e(arrayList8);
                }
                w13.c<wt1.q> cVar4 = wt1.q.f187129o;
                ArrayList arrayList9 = new ArrayList(p13.y.r(cVar4, 10));
                for (wt1.q qVar3 : cVar4) {
                    boolean z16 = cVarE3 == null || !cVarE3.contains(qVar3);
                    arrayList9.add(new mv1.f(qVar3, z16 ? strQ : "", cVarE != null ? cVarE.contains(qVar3) : false, bVarV6.f141496h1 == null || !z16));
                }
                arrayList = new ArrayList(arrayList9);
            }
            boolean zR = mVar.r(fVar);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new ov1.e(fVar, 1);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ov1.e(fVar, 1);
                    mVar.K(objQ);
                }
            }
            fVar.u6(arrayList, (e23.a) objQ, mVar, 432);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object b(Object obj, Object obj2) {
        String lowerCase;
        List<? extends jv1.c> listImmutableListOf;
        ov1.m mVar = (ov1.m) this.f117300b;
        w1 w1Var = mVar.f134193a;
        p3.m mVar2 = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ov1.m.a aVar = ov1.m.f134192b;
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = p3.p0.c(((pv1.b) w1Var.getValue()).O0, mVar2, 0);
            Object objQ = mVar2.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                mv1.a aVar2 = (mv1.a) p1VarC.getF182175a();
                objQ = p3.p0.n(aVar2 != null ? aVar2.f121168f : null);
                mVar2.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            if (((pv1.b) w1Var.getValue()).l5()) {
                mVar2.C(1408137127);
                lowerCase = gl1.y.Q(mVar2, jv1.c.POWER.f101019a).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                mVar2.f();
            } else {
                mVar2.C(1408248200);
                lowerCase = gl1.y.Q(mVar2, jv1.c.PACE.f101019a).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                mVar2.f();
            }
            jv1.c cVar = jv1.c.HEART_RATE;
            String lowerCase2 = gl1.y.Q(mVar2, cVar.f101019a).toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            String strQ = gl1.y.Q(mVar2, ((pv1.b) w1Var.getValue()).l5() ? R.string.cycling_workout_target_preference : R.string.running_workout_target_preference);
            String strP = gl1.y.P(R.string.workouts_change_between_target_types, new Object[]{lowerCase, lowerCase2}, mVar2);
            jv1.c cVar2 = (jv1.c) p1Var.getF182175a();
            if (((pv1.b) w1Var.getValue()).l5()) {
                jv1.c.f101012b.getClass();
                listImmutableListOf = Util.immutableListOf(jv1.c.AUTO, jv1.c.POWER, cVar);
            } else {
                jv1.c.f101012b.getClass();
                listImmutableListOf = Util.immutableListOf(jv1.c.AUTO, jv1.c.PACE, cVar);
            }
            List<? extends jv1.c> list = listImmutableListOf;
            boolean z14 = ((jv1.c) p1Var.getF182175a()) != null;
            Object objQ2 = mVar2.q();
            if (objQ2 == c2565a) {
                objQ2 = new i3(p1Var, 9);
                mVar2.K(objQ2);
            }
            e23.l<? super jv1.c, Unit> lVar = (e23.l) objQ2;
            boolean zR = mVar2.r(mVar);
            Object objQ3 = mVar2.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new oe.j(18, p1Var, mVar);
                mVar2.K(objQ3);
            }
            mVar.u6(strQ, strP, cVar2, list, z14, lVar, (e23.a) objQ3, mVar2, 196608);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    /* JADX WARN: Code duplicated, block: B:316:0x09dd  */
    /* JADX WARN: Code duplicated, block: B:318:0x09e6  */
    /* JADX WARN: Code duplicated, block: B:319:0x09ea  */
    /* JADX WARN: Code duplicated, block: B:322:0x09f9  */
    /* JADX WARN: Code duplicated, block: B:324:0x0a07  */
    /* JADX WARN: Code duplicated, block: B:328:0x0a25  */
    /* JADX WARN: Code duplicated, block: B:330:0x0a31  */
    /* JADX WARN: Code duplicated, block: B:332:0x0a4a  */
    /* JADX WARN: Code duplicated, block: B:335:0x0a63  */
    /* JADX WARN: Code duplicated, block: B:336:0x0a6f  */
    /* JADX WARN: Code duplicated, block: B:339:0x0a87  */
    /* JADX WARN: Code duplicated, block: B:340:0x0a94  */
    /* JADX WARN: Code duplicated, block: B:341:0x0aa1  */
    /* JADX WARN: Code duplicated, block: B:342:0x0aae  */
    /* JADX WARN: Code duplicated, block: B:343:0x0abb  */
    /* JADX WARN: Code duplicated, block: B:344:0x0ac8  */
    /* JADX WARN: Code duplicated, block: B:347:0x0adb  */
    /* JADX WARN: Code duplicated, block: B:349:0x0ae0  */
    /* JADX WARN: Code duplicated, block: B:350:0x0ae2  */
    /* JADX WARN: Code duplicated, block: B:352:0x0aec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:360:0x0b21  */
    /* JADX WARN: Code duplicated, block: B:361:0x0b23  */
    /* JADX WARN: Code duplicated, block: B:363:0x0b28  */
    /* JADX WARN: Code duplicated, block: B:365:0x0b44  */
    /* JADX WARN: Code duplicated, block: B:369:0x0b85  */
    /* JADX WARN: Code duplicated, block: B:371:0x0b8c  */
    /* JADX WARN: Code duplicated, block: B:373:0x0bad  */
    /* JADX WARN: Code duplicated, block: B:389:0x0a82 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x0180  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d3  */
    /* JADX WARN: Type inference failed for: r2v132, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) throws UnsupportedEncodingException {
        u4.d dVarA;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        boolean zB;
        Object objQ;
        Integer num;
        String strP;
        ug2.b bVar;
        x0 x0Var;
        x0 x0VarB;
        ug2.c cVar;
        int i14;
        Object obj3;
        List<String> list;
        fg0.k kVar;
        j61.f courseProfileDTO;
        String hillType;
        int i15 = this.f117299a;
        int i16 = 17;
        int i17 = 24;
        p3.m.a aVar = p3.m.f135153a;
        i53.c cVarE = null;
        eVarA = null;
        eVarA = null;
        eVarA = null;
        hv1.e eVarA = null;
        cVarE = null;
        int i18 = 1;
        Object obj4 = this.f117300b;
        switch (i15) {
            case 0:
                b5.a0 a0Var = (b5.a0) obj;
                a0Var.getClass();
                ((ky0.k) obj4).invoke(n4.c.a(a0Var.f15750c));
                return Unit.INSTANCE;
            case 1:
                mg2.f fVar = (mg2.f) obj4;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    h4.r rVarF = x2.f(aVar2, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.C0343j c0343j = c2.j.f22692b;
                    h4.d.f81522a.getClass();
                    h4.g.b bVar2 = h4.d.a.f81533k;
                    s2 s2VarA = q2.a(c0343j, bVar2, mVar, 0);
                    int iHashCode2 = Long.hashCode(mVar.getU());
                    i2 i2VarX2 = mVar.x();
                    h4.r rVarC2 = h4.k.c(rVarF, mVar);
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
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, s2VarA, mVar);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX2, mVar);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar, iHashCode2, bVar3);
                    }
                    h5.g.a.f fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC2, mVar);
                    u2 u2Var = u2.f22900a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    h4.r rVarA = u2Var.a(c2.l.C(c2.l.A(aVar2, 0.0f, eVar2.f97920e, 1), eVar2.f97920e, 0.0f, 0.0f, 0.0f, 14), 1.0f, true);
                    s2 s2VarA2 = q2.a(c2.j.i(eVar2.f97920e), bVar2, mVar, 0);
                    int iHashCode3 = Long.hashCode(mVar.getU());
                    i2 i2VarX3 = mVar.x();
                    h4.r rVarC3 = h4.k.c(rVarA, mVar);
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
                    b4.c(eVar, s2VarA2, mVar);
                    b4.c(c1623g, i2VarX3, mVar);
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar, iHashCode3, bVar3);
                    }
                    b4.c(fVar2, rVarC3, mVar);
                    d1 d1Var = d1.f16531a;
                    j92.c cVar2 = j92.b.f97901d;
                    float f14 = cVar2.f97906e;
                    switch (ug2.d.a.f170750a[fVar.getF118388a().f170766a.ordinal()]) {
                        case 1:
                            s62.a.f157643a.getClass();
                            dVarA = a6.a(t62.b.f162798a);
                            d1Var.b(f14, dVarA, cVar2.f97905d, u0.f(mVar), d92.b.a(mVar).e().c(), mVar, 0);
                            h4.r rVarA2 = u2Var.a(aVar2, 1.0f, true);
                            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarA2, mVar);
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
                            b4.c(eVar, zVarA, mVar);
                            b4.c(c1623g, i2VarX, mVar);
                            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            }
                            b4.c(fVar2, rVarC, mVar);
                            c2.b0 b0Var = c2.b0.f22601a;
                            mVar.C(-160505130);
                            for (ug2.a aVar4 : fVar.getF118388a().f170767b) {
                                num = aVar4.f170674a;
                                strP = aVar4.f170675b;
                                if (num != null) {
                                    mVar.C(324968552);
                                    strP = gl1.y.P(aVar4.f170674a.intValue(), new Object[]{strP}, mVar);
                                    mVar.f();
                                } else {
                                    mVar.C(325116701);
                                    mVar.f();
                                }
                                String str = strP;
                                d6.h.f57752b.getClass();
                                d6.h hVarA = d6.h.a(d6.h.f57757g);
                                bVar = aVar4.f170676c;
                                if (bVar == null) {
                                    mVar.C(325326539);
                                    mVar.f();
                                    x0VarB = null;
                                } else {
                                    mVar.C(1673062390);
                                    x1 x1Var2 = p3.n.f135158a;
                                    switch (ug2.b.a.f170696a[bVar.ordinal()]) {
                                        case 1:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 2:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 3:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97931h;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 4:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 5:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 6:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        default:
                                            u0.r();
                                            return null;
                                    }
                                }
                                if (x0VarB != null) {
                                    cVar = aVar4.f170677d;
                                    if (cVar == null) {
                                        i14 = -1;
                                    } else {
                                        i14 = ug2.g.f170773b[cVar.ordinal()];
                                    }
                                    if (i14 == -1 && i14 != 1) {
                                        if (i14 == 2) {
                                            x0VarB = d92.c.e(x0VarB);
                                        } else {
                                            if (i14 != 3) {
                                                u0.r();
                                                return null;
                                            }
                                            w5.f0.f182097b.getClass();
                                            x0VarB = x0.a(x0VarB, 0L, 0L, w5.f0.f182105j, null, 0L, null, null, 0, 0L, null, null, 16777211);
                                        }
                                    }
                                } else {
                                    x0VarB = null;
                                }
                                if (x0VarB == null) {
                                    mVar.C(1673064471);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    x0VarB = d92.c.b(j92.f.f97931h, mVar);
                                } else {
                                    mVar.C(1673061867);
                                }
                                mVar.f();
                                mh.c(str, null, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130046);
                            }
                            mVar.f();
                            mVar.y();
                            mVar.y();
                            l72.o0 o0Var = l72.o0.SMALL;
                            zB = mVar.B(fVar);
                            objQ = mVar.q();
                            if (zB) {
                                objQ = new mg2.q(fVar);
                                mVar.K(objQ);
                            } else {
                                aVar.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new mg2.q(fVar);
                                    mVar.K(objQ);
                                }
                            }
                            l72.u0.a(null, o0Var, null, null, (e23.a) ((k23.g) objQ), mVar, 48, 13);
                            mVar.y();
                            x1 x1Var3 = p3.n.f135158a;
                            break;
                            break;
                        case 2:
                            s62.a.f157643a.getClass();
                            dVarA = v62.s2.a(t62.b.f162798a);
                            d1Var.b(f14, dVarA, cVar2.f97905d, u0.f(mVar), d92.b.a(mVar).e().c(), mVar, 0);
                            h4.r rVarA3 = u2Var.a(aVar2, 1.0f, true);
                            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarA3, mVar);
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
                            b4.c(eVar, zVarA, mVar);
                            b4.c(c1623g, i2VarX, mVar);
                            if (mVar.getT()) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            } else {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            }
                            b4.c(fVar2, rVarC, mVar);
                            c2.b0 b0Var2 = c2.b0.f22601a;
                            mVar.C(-160505130);
                            while (r1.hasNext()) {
                                num = aVar4.f170674a;
                                strP = aVar4.f170675b;
                                if (num != null) {
                                    mVar.C(324968552);
                                    strP = gl1.y.P(aVar4.f170674a.intValue(), new Object[]{strP}, mVar);
                                    mVar.f();
                                } else {
                                    mVar.C(325116701);
                                    mVar.f();
                                }
                                String str2 = strP;
                                d6.h.f57752b.getClass();
                                d6.h hVarA2 = d6.h.a(d6.h.f57757g);
                                bVar = aVar4.f170676c;
                                if (bVar == null) {
                                    mVar.C(325326539);
                                    mVar.f();
                                    x0VarB = null;
                                } else {
                                    mVar.C(1673062390);
                                    x1 x1Var4 = p3.n.f135158a;
                                    switch (ug2.b.a.f170696a[bVar.ordinal()]) {
                                        case 1:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 2:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 3:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97931h;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 4:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 5:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 6:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        default:
                                            u0.r();
                                            return null;
                                    }
                                }
                                if (x0VarB != null) {
                                    cVar = aVar4.f170677d;
                                    if (cVar == null) {
                                        i14 = -1;
                                    } else {
                                        i14 = ug2.g.f170773b[cVar.ordinal()];
                                    }
                                    if (i14 == -1) {
                                    }
                                } else {
                                    x0VarB = null;
                                }
                                if (x0VarB == null) {
                                    mVar.C(1673064471);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    x0VarB = d92.c.b(j92.f.f97931h, mVar);
                                } else {
                                    mVar.C(1673061867);
                                }
                                mVar.f();
                                mh.c(str2, null, 0L, null, 0L, null, 0L, hVarA2, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130046);
                            }
                            mVar.f();
                            mVar.y();
                            mVar.y();
                            l72.o0 o0Var2 = l72.o0.SMALL;
                            zB = mVar.B(fVar);
                            objQ = mVar.q();
                            if (zB) {
                                aVar.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new mg2.q(fVar);
                                    mVar.K(objQ);
                                }
                            } else {
                                objQ = new mg2.q(fVar);
                                mVar.K(objQ);
                            }
                            l72.u0.a(null, o0Var2, null, null, (e23.a) ((k23.g) objQ), mVar, 48, 13);
                            mVar.y();
                            x1 x1Var5 = p3.n.f135158a;
                            break;
                            break;
                        case 3:
                            s62.a.f157643a.getClass();
                            dVarA = f3.a(t62.a.f162797a);
                            d1Var.b(f14, dVarA, cVar2.f97905d, u0.f(mVar), d92.b.a(mVar).e().c(), mVar, 0);
                            h4.r rVarA4 = u2Var.a(aVar2, 1.0f, true);
                            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarA4, mVar);
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
                            b4.c(eVar, zVarA, mVar);
                            b4.c(c1623g, i2VarX, mVar);
                            if (mVar.getT()) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            } else {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            }
                            b4.c(fVar2, rVarC, mVar);
                            c2.b0 b0Var3 = c2.b0.f22601a;
                            mVar.C(-160505130);
                            while (r1.hasNext()) {
                                num = aVar4.f170674a;
                                strP = aVar4.f170675b;
                                if (num != null) {
                                    mVar.C(324968552);
                                    strP = gl1.y.P(aVar4.f170674a.intValue(), new Object[]{strP}, mVar);
                                    mVar.f();
                                } else {
                                    mVar.C(325116701);
                                    mVar.f();
                                }
                                String str3 = strP;
                                d6.h.f57752b.getClass();
                                d6.h hVarA3 = d6.h.a(d6.h.f57757g);
                                bVar = aVar4.f170676c;
                                if (bVar == null) {
                                    mVar.C(325326539);
                                    mVar.f();
                                    x0VarB = null;
                                } else {
                                    mVar.C(1673062390);
                                    x1 x1Var6 = p3.n.f135158a;
                                    switch (ug2.b.a.f170696a[bVar.ordinal()]) {
                                        case 1:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 2:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 3:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97931h;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 4:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 5:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 6:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        default:
                                            u0.r();
                                            return null;
                                    }
                                }
                                if (x0VarB != null) {
                                    cVar = aVar4.f170677d;
                                    if (cVar == null) {
                                        i14 = -1;
                                    } else {
                                        i14 = ug2.g.f170773b[cVar.ordinal()];
                                    }
                                    if (i14 == -1) {
                                    }
                                } else {
                                    x0VarB = null;
                                }
                                if (x0VarB == null) {
                                    mVar.C(1673064471);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    x0VarB = d92.c.b(j92.f.f97931h, mVar);
                                } else {
                                    mVar.C(1673061867);
                                }
                                mVar.f();
                                mh.c(str3, null, 0L, null, 0L, null, 0L, hVarA3, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130046);
                            }
                            mVar.f();
                            mVar.y();
                            mVar.y();
                            l72.o0 o0Var3 = l72.o0.SMALL;
                            zB = mVar.B(fVar);
                            objQ = mVar.q();
                            if (zB) {
                                aVar.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new mg2.q(fVar);
                                    mVar.K(objQ);
                                }
                            } else {
                                objQ = new mg2.q(fVar);
                                mVar.K(objQ);
                            }
                            l72.u0.a(null, o0Var3, null, null, (e23.a) ((k23.g) objQ), mVar, 48, 13);
                            mVar.y();
                            x1 x1Var7 = p3.n.f135158a;
                            break;
                            break;
                        case 4:
                            s62.a.f157643a.getClass();
                            dVarA = n5.a(t62.a.f162797a);
                            d1Var.b(f14, dVarA, cVar2.f97905d, u0.f(mVar), d92.b.a(mVar).e().c(), mVar, 0);
                            h4.r rVarA5 = u2Var.a(aVar2, 1.0f, true);
                            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarA5, mVar);
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
                            b4.c(eVar, zVarA, mVar);
                            b4.c(c1623g, i2VarX, mVar);
                            if (mVar.getT()) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            } else {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            }
                            b4.c(fVar2, rVarC, mVar);
                            c2.b0 b0Var4 = c2.b0.f22601a;
                            mVar.C(-160505130);
                            while (r1.hasNext()) {
                                num = aVar4.f170674a;
                                strP = aVar4.f170675b;
                                if (num != null) {
                                    mVar.C(324968552);
                                    strP = gl1.y.P(aVar4.f170674a.intValue(), new Object[]{strP}, mVar);
                                    mVar.f();
                                } else {
                                    mVar.C(325116701);
                                    mVar.f();
                                }
                                String str4 = strP;
                                d6.h.f57752b.getClass();
                                d6.h hVarA4 = d6.h.a(d6.h.f57757g);
                                bVar = aVar4.f170676c;
                                if (bVar == null) {
                                    mVar.C(325326539);
                                    mVar.f();
                                    x0VarB = null;
                                } else {
                                    mVar.C(1673062390);
                                    x1 x1Var8 = p3.n.f135158a;
                                    switch (ug2.b.a.f170696a[bVar.ordinal()]) {
                                        case 1:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 2:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 3:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97931h;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 4:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 5:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 6:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        default:
                                            u0.r();
                                            return null;
                                    }
                                }
                                if (x0VarB != null) {
                                    cVar = aVar4.f170677d;
                                    if (cVar == null) {
                                        i14 = -1;
                                    } else {
                                        i14 = ug2.g.f170773b[cVar.ordinal()];
                                    }
                                    if (i14 == -1) {
                                    }
                                } else {
                                    x0VarB = null;
                                }
                                if (x0VarB == null) {
                                    mVar.C(1673064471);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    x0VarB = d92.c.b(j92.f.f97931h, mVar);
                                } else {
                                    mVar.C(1673061867);
                                }
                                mVar.f();
                                mh.c(str4, null, 0L, null, 0L, null, 0L, hVarA4, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130046);
                            }
                            mVar.f();
                            mVar.y();
                            mVar.y();
                            l72.o0 o0Var4 = l72.o0.SMALL;
                            zB = mVar.B(fVar);
                            objQ = mVar.q();
                            if (zB) {
                                aVar.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new mg2.q(fVar);
                                    mVar.K(objQ);
                                }
                            } else {
                                objQ = new mg2.q(fVar);
                                mVar.K(objQ);
                            }
                            l72.u0.a(null, o0Var4, null, null, (e23.a) ((k23.g) objQ), mVar, 48, 13);
                            mVar.y();
                            x1 x1Var9 = p3.n.f135158a;
                            break;
                            break;
                        case 5:
                            s62.a.f157643a.getClass();
                            dVarA = v7.a(t62.b.f162798a);
                            d1Var.b(f14, dVarA, cVar2.f97905d, u0.f(mVar), d92.b.a(mVar).e().c(), mVar, 0);
                            h4.r rVarA6 = u2Var.a(aVar2, 1.0f, true);
                            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarA6, mVar);
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
                            b4.c(eVar, zVarA, mVar);
                            b4.c(c1623g, i2VarX, mVar);
                            if (mVar.getT()) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            } else {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            }
                            b4.c(fVar2, rVarC, mVar);
                            c2.b0 b0Var5 = c2.b0.f22601a;
                            mVar.C(-160505130);
                            while (r1.hasNext()) {
                                num = aVar4.f170674a;
                                strP = aVar4.f170675b;
                                if (num != null) {
                                    mVar.C(324968552);
                                    strP = gl1.y.P(aVar4.f170674a.intValue(), new Object[]{strP}, mVar);
                                    mVar.f();
                                } else {
                                    mVar.C(325116701);
                                    mVar.f();
                                }
                                String str5 = strP;
                                d6.h.f57752b.getClass();
                                d6.h hVarA5 = d6.h.a(d6.h.f57757g);
                                bVar = aVar4.f170676c;
                                if (bVar == null) {
                                    mVar.C(325326539);
                                    mVar.f();
                                    x0VarB = null;
                                } else {
                                    mVar.C(1673062390);
                                    x1 x1Var10 = p3.n.f135158a;
                                    switch (ug2.b.a.f170696a[bVar.ordinal()]) {
                                        case 1:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 2:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 3:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97931h;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 4:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 5:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 6:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        default:
                                            u0.r();
                                            return null;
                                    }
                                }
                                if (x0VarB != null) {
                                    cVar = aVar4.f170677d;
                                    if (cVar == null) {
                                        i14 = -1;
                                    } else {
                                        i14 = ug2.g.f170773b[cVar.ordinal()];
                                    }
                                    if (i14 == -1) {
                                    }
                                } else {
                                    x0VarB = null;
                                }
                                if (x0VarB == null) {
                                    mVar.C(1673064471);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    x0VarB = d92.c.b(j92.f.f97931h, mVar);
                                } else {
                                    mVar.C(1673061867);
                                }
                                mVar.f();
                                mh.c(str5, null, 0L, null, 0L, null, 0L, hVarA5, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130046);
                            }
                            mVar.f();
                            mVar.y();
                            mVar.y();
                            l72.o0 o0Var5 = l72.o0.SMALL;
                            zB = mVar.B(fVar);
                            objQ = mVar.q();
                            if (zB) {
                                aVar.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new mg2.q(fVar);
                                    mVar.K(objQ);
                                }
                            } else {
                                objQ = new mg2.q(fVar);
                                mVar.K(objQ);
                            }
                            l72.u0.a(null, o0Var5, null, null, (e23.a) ((k23.g) objQ), mVar, 48, 13);
                            mVar.y();
                            x1 x1Var11 = p3.n.f135158a;
                            break;
                            break;
                        case 6:
                            s62.a.f157643a.getClass();
                            dVarA = w7.a(t62.b.f162798a);
                            d1Var.b(f14, dVarA, cVar2.f97905d, u0.f(mVar), d92.b.a(mVar).e().c(), mVar, 0);
                            h4.r rVarA7 = u2Var.a(aVar2, 1.0f, true);
                            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarA7, mVar);
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
                            b4.c(eVar, zVarA, mVar);
                            b4.c(c1623g, i2VarX, mVar);
                            if (mVar.getT()) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            } else {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            }
                            b4.c(fVar2, rVarC, mVar);
                            c2.b0 b0Var6 = c2.b0.f22601a;
                            mVar.C(-160505130);
                            while (r1.hasNext()) {
                                num = aVar4.f170674a;
                                strP = aVar4.f170675b;
                                if (num != null) {
                                    mVar.C(324968552);
                                    strP = gl1.y.P(aVar4.f170674a.intValue(), new Object[]{strP}, mVar);
                                    mVar.f();
                                } else {
                                    mVar.C(325116701);
                                    mVar.f();
                                }
                                String str6 = strP;
                                d6.h.f57752b.getClass();
                                d6.h hVarA6 = d6.h.a(d6.h.f57757g);
                                bVar = aVar4.f170676c;
                                if (bVar == null) {
                                    mVar.C(325326539);
                                    mVar.f();
                                    x0VarB = null;
                                } else {
                                    mVar.C(1673062390);
                                    x1 x1Var12 = p3.n.f135158a;
                                    switch (ug2.b.a.f170696a[bVar.ordinal()]) {
                                        case 1:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 2:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 3:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97931h;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 4:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 5:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 6:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        default:
                                            u0.r();
                                            return null;
                                    }
                                }
                                if (x0VarB != null) {
                                    cVar = aVar4.f170677d;
                                    if (cVar == null) {
                                        i14 = -1;
                                    } else {
                                        i14 = ug2.g.f170773b[cVar.ordinal()];
                                    }
                                    if (i14 == -1) {
                                    }
                                } else {
                                    x0VarB = null;
                                }
                                if (x0VarB == null) {
                                    mVar.C(1673064471);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    x0VarB = d92.c.b(j92.f.f97931h, mVar);
                                } else {
                                    mVar.C(1673061867);
                                }
                                mVar.f();
                                mh.c(str6, null, 0L, null, 0L, null, 0L, hVarA6, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130046);
                            }
                            mVar.f();
                            mVar.y();
                            mVar.y();
                            l72.o0 o0Var6 = l72.o0.SMALL;
                            zB = mVar.B(fVar);
                            objQ = mVar.q();
                            if (zB) {
                                aVar.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new mg2.q(fVar);
                                    mVar.K(objQ);
                                }
                            } else {
                                objQ = new mg2.q(fVar);
                                mVar.K(objQ);
                            }
                            l72.u0.a(null, o0Var6, null, null, (e23.a) ((k23.g) objQ), mVar, 48, 13);
                            mVar.y();
                            x1 x1Var13 = p3.n.f135158a;
                            break;
                            break;
                        case 7:
                            s62.a.f157643a.getClass();
                            dVarA = t7.a(t62.b.f162798a);
                            d1Var.b(f14, dVarA, cVar2.f97905d, u0.f(mVar), d92.b.a(mVar).e().c(), mVar, 0);
                            h4.r rVarA8 = u2Var.a(aVar2, 1.0f, true);
                            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarA8, mVar);
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
                            b4.c(eVar, zVarA, mVar);
                            b4.c(c1623g, i2VarX, mVar);
                            if (mVar.getT()) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            } else {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            }
                            b4.c(fVar2, rVarC, mVar);
                            c2.b0 b0Var7 = c2.b0.f22601a;
                            mVar.C(-160505130);
                            while (r1.hasNext()) {
                                num = aVar4.f170674a;
                                strP = aVar4.f170675b;
                                if (num != null) {
                                    mVar.C(324968552);
                                    strP = gl1.y.P(aVar4.f170674a.intValue(), new Object[]{strP}, mVar);
                                    mVar.f();
                                } else {
                                    mVar.C(325116701);
                                    mVar.f();
                                }
                                String str7 = strP;
                                d6.h.f57752b.getClass();
                                d6.h hVarA7 = d6.h.a(d6.h.f57757g);
                                bVar = aVar4.f170676c;
                                if (bVar == null) {
                                    mVar.C(325326539);
                                    mVar.f();
                                    x0VarB = null;
                                } else {
                                    mVar.C(1673062390);
                                    x1 x1Var14 = p3.n.f135158a;
                                    switch (ug2.b.a.f170696a[bVar.ordinal()]) {
                                        case 1:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 2:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 3:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97931h;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 4:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 5:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 6:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        default:
                                            u0.r();
                                            return null;
                                    }
                                }
                                if (x0VarB != null) {
                                    cVar = aVar4.f170677d;
                                    if (cVar == null) {
                                        i14 = -1;
                                    } else {
                                        i14 = ug2.g.f170773b[cVar.ordinal()];
                                    }
                                    if (i14 == -1) {
                                    }
                                } else {
                                    x0VarB = null;
                                }
                                if (x0VarB == null) {
                                    mVar.C(1673064471);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    x0VarB = d92.c.b(j92.f.f97931h, mVar);
                                } else {
                                    mVar.C(1673061867);
                                }
                                mVar.f();
                                mh.c(str7, null, 0L, null, 0L, null, 0L, hVarA7, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130046);
                            }
                            mVar.f();
                            mVar.y();
                            mVar.y();
                            l72.o0 o0Var7 = l72.o0.SMALL;
                            zB = mVar.B(fVar);
                            objQ = mVar.q();
                            if (zB) {
                                aVar.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new mg2.q(fVar);
                                    mVar.K(objQ);
                                }
                            } else {
                                objQ = new mg2.q(fVar);
                                mVar.K(objQ);
                            }
                            l72.u0.a(null, o0Var7, null, null, (e23.a) ((k23.g) objQ), mVar, 48, 13);
                            mVar.y();
                            x1 x1Var15 = p3.n.f135158a;
                            break;
                            break;
                        case 8:
                            s62.a.f157643a.getClass();
                            dVarA = d2.a(t62.c.f162799a);
                            d1Var.b(f14, dVarA, cVar2.f97905d, u0.f(mVar), d92.b.a(mVar).e().c(), mVar, 0);
                            h4.r rVarA9 = u2Var.a(aVar2, 1.0f, true);
                            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarA9, mVar);
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
                            b4.c(eVar, zVarA, mVar);
                            b4.c(c1623g, i2VarX, mVar);
                            if (mVar.getT()) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            } else {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            }
                            b4.c(fVar2, rVarC, mVar);
                            c2.b0 b0Var8 = c2.b0.f22601a;
                            mVar.C(-160505130);
                            while (r1.hasNext()) {
                                num = aVar4.f170674a;
                                strP = aVar4.f170675b;
                                if (num != null) {
                                    mVar.C(324968552);
                                    strP = gl1.y.P(aVar4.f170674a.intValue(), new Object[]{strP}, mVar);
                                    mVar.f();
                                } else {
                                    mVar.C(325116701);
                                    mVar.f();
                                }
                                String str8 = strP;
                                d6.h.f57752b.getClass();
                                d6.h hVarA8 = d6.h.a(d6.h.f57757g);
                                bVar = aVar4.f170676c;
                                if (bVar == null) {
                                    mVar.C(325326539);
                                    mVar.f();
                                    x0VarB = null;
                                } else {
                                    mVar.C(1673062390);
                                    x1 x1Var16 = p3.n.f135158a;
                                    switch (ug2.b.a.f170696a[bVar.ordinal()]) {
                                        case 1:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 2:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 3:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97931h;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 4:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 5:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 6:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        default:
                                            u0.r();
                                            return null;
                                    }
                                }
                                if (x0VarB != null) {
                                    cVar = aVar4.f170677d;
                                    if (cVar == null) {
                                        i14 = -1;
                                    } else {
                                        i14 = ug2.g.f170773b[cVar.ordinal()];
                                    }
                                    if (i14 == -1) {
                                    }
                                } else {
                                    x0VarB = null;
                                }
                                if (x0VarB == null) {
                                    mVar.C(1673064471);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    x0VarB = d92.c.b(j92.f.f97931h, mVar);
                                } else {
                                    mVar.C(1673061867);
                                }
                                mVar.f();
                                mh.c(str8, null, 0L, null, 0L, null, 0L, hVarA8, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130046);
                            }
                            mVar.f();
                            mVar.y();
                            mVar.y();
                            l72.o0 o0Var8 = l72.o0.SMALL;
                            zB = mVar.B(fVar);
                            objQ = mVar.q();
                            if (zB) {
                                aVar.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new mg2.q(fVar);
                                    mVar.K(objQ);
                                }
                            } else {
                                objQ = new mg2.q(fVar);
                                mVar.K(objQ);
                            }
                            l72.u0.a(null, o0Var8, null, null, (e23.a) ((k23.g) objQ), mVar, 48, 13);
                            mVar.y();
                            x1 x1Var17 = p3.n.f135158a;
                            break;
                            break;
                        case 9:
                            s62.a.f157643a.getClass();
                            dVarA = f72.m.a(t62.c.f162799a);
                            d1Var.b(f14, dVarA, cVar2.f97905d, u0.f(mVar), d92.b.a(mVar).e().c(), mVar, 0);
                            h4.r rVarA10 = u2Var.a(aVar2, 1.0f, true);
                            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarA10, mVar);
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
                            b4.c(eVar, zVarA, mVar);
                            b4.c(c1623g, i2VarX, mVar);
                            if (mVar.getT()) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            } else {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            }
                            b4.c(fVar2, rVarC, mVar);
                            c2.b0 b0Var9 = c2.b0.f22601a;
                            mVar.C(-160505130);
                            while (r1.hasNext()) {
                                num = aVar4.f170674a;
                                strP = aVar4.f170675b;
                                if (num != null) {
                                    mVar.C(324968552);
                                    strP = gl1.y.P(aVar4.f170674a.intValue(), new Object[]{strP}, mVar);
                                    mVar.f();
                                } else {
                                    mVar.C(325116701);
                                    mVar.f();
                                }
                                String str9 = strP;
                                d6.h.f57752b.getClass();
                                d6.h hVarA9 = d6.h.a(d6.h.f57757g);
                                bVar = aVar4.f170676c;
                                if (bVar == null) {
                                    mVar.C(325326539);
                                    mVar.f();
                                    x0VarB = null;
                                } else {
                                    mVar.C(1673062390);
                                    x1 x1Var18 = p3.n.f135158a;
                                    switch (ug2.b.a.f170696a[bVar.ordinal()]) {
                                        case 1:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 2:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 3:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97931h;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 4:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 5:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 6:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        default:
                                            u0.r();
                                            return null;
                                    }
                                }
                                if (x0VarB != null) {
                                    cVar = aVar4.f170677d;
                                    if (cVar == null) {
                                        i14 = -1;
                                    } else {
                                        i14 = ug2.g.f170773b[cVar.ordinal()];
                                    }
                                    if (i14 == -1) {
                                    }
                                } else {
                                    x0VarB = null;
                                }
                                if (x0VarB == null) {
                                    mVar.C(1673064471);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    x0VarB = d92.c.b(j92.f.f97931h, mVar);
                                } else {
                                    mVar.C(1673061867);
                                }
                                mVar.f();
                                mh.c(str9, null, 0L, null, 0L, null, 0L, hVarA9, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130046);
                            }
                            mVar.f();
                            mVar.y();
                            mVar.y();
                            l72.o0 o0Var9 = l72.o0.SMALL;
                            zB = mVar.B(fVar);
                            objQ = mVar.q();
                            if (zB) {
                                aVar.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new mg2.q(fVar);
                                    mVar.K(objQ);
                                }
                            } else {
                                objQ = new mg2.q(fVar);
                                mVar.K(objQ);
                            }
                            l72.u0.a(null, o0Var9, null, null, (e23.a) ((k23.g) objQ), mVar, 48, 13);
                            mVar.y();
                            x1 x1Var19 = p3.n.f135158a;
                            break;
                            break;
                        case 10:
                            s62.a.f157643a.getClass();
                            dVarA = u62.l.a(t62.a.f162797a);
                            d1Var.b(f14, dVarA, cVar2.f97905d, u0.f(mVar), d92.b.a(mVar).e().c(), mVar, 0);
                            h4.r rVarA11 = u2Var.a(aVar2, 1.0f, true);
                            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarA11, mVar);
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
                            b4.c(eVar, zVarA, mVar);
                            b4.c(c1623g, i2VarX, mVar);
                            if (mVar.getT()) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            } else {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            }
                            b4.c(fVar2, rVarC, mVar);
                            c2.b0 b0Var10 = c2.b0.f22601a;
                            mVar.C(-160505130);
                            while (r1.hasNext()) {
                                num = aVar4.f170674a;
                                strP = aVar4.f170675b;
                                if (num != null) {
                                    mVar.C(324968552);
                                    strP = gl1.y.P(aVar4.f170674a.intValue(), new Object[]{strP}, mVar);
                                    mVar.f();
                                } else {
                                    mVar.C(325116701);
                                    mVar.f();
                                }
                                String str10 = strP;
                                d6.h.f57752b.getClass();
                                d6.h hVarA10 = d6.h.a(d6.h.f57757g);
                                bVar = aVar4.f170676c;
                                if (bVar == null) {
                                    mVar.C(325326539);
                                    mVar.f();
                                    x0VarB = null;
                                } else {
                                    mVar.C(1673062390);
                                    x1 x1Var110 = p3.n.f135158a;
                                    switch (ug2.b.a.f170696a[bVar.ordinal()]) {
                                        case 1:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 2:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 3:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97931h;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 4:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 5:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 6:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        default:
                                            u0.r();
                                            return null;
                                    }
                                }
                                if (x0VarB != null) {
                                    cVar = aVar4.f170677d;
                                    if (cVar == null) {
                                        i14 = -1;
                                    } else {
                                        i14 = ug2.g.f170773b[cVar.ordinal()];
                                    }
                                    if (i14 == -1) {
                                    }
                                } else {
                                    x0VarB = null;
                                }
                                if (x0VarB == null) {
                                    mVar.C(1673064471);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    x0VarB = d92.c.b(j92.f.f97931h, mVar);
                                } else {
                                    mVar.C(1673061867);
                                }
                                mVar.f();
                                mh.c(str10, null, 0L, null, 0L, null, 0L, hVarA10, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130046);
                            }
                            mVar.f();
                            mVar.y();
                            mVar.y();
                            l72.o0 o0Var10 = l72.o0.SMALL;
                            zB = mVar.B(fVar);
                            objQ = mVar.q();
                            if (zB) {
                                aVar.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new mg2.q(fVar);
                                    mVar.K(objQ);
                                }
                            } else {
                                objQ = new mg2.q(fVar);
                                mVar.K(objQ);
                            }
                            l72.u0.a(null, o0Var10, null, null, (e23.a) ((k23.g) objQ), mVar, 48, 13);
                            mVar.y();
                            x1 x1Var111 = p3.n.f135158a;
                            break;
                            break;
                        case 11:
                            s62.a.f157643a.getClass();
                            dVarA = v62.p0.a(t62.b.f162798a);
                            d1Var.b(f14, dVarA, cVar2.f97905d, u0.f(mVar), d92.b.a(mVar).e().c(), mVar, 0);
                            h4.r rVarA12 = u2Var.a(aVar2, 1.0f, true);
                            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarA12, mVar);
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
                            b4.c(eVar, zVarA, mVar);
                            b4.c(c1623g, i2VarX, mVar);
                            if (mVar.getT()) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            } else {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            }
                            b4.c(fVar2, rVarC, mVar);
                            c2.b0 b0Var11 = c2.b0.f22601a;
                            mVar.C(-160505130);
                            while (r1.hasNext()) {
                                num = aVar4.f170674a;
                                strP = aVar4.f170675b;
                                if (num != null) {
                                    mVar.C(324968552);
                                    strP = gl1.y.P(aVar4.f170674a.intValue(), new Object[]{strP}, mVar);
                                    mVar.f();
                                } else {
                                    mVar.C(325116701);
                                    mVar.f();
                                }
                                String str11 = strP;
                                d6.h.f57752b.getClass();
                                d6.h hVarA11 = d6.h.a(d6.h.f57757g);
                                bVar = aVar4.f170676c;
                                if (bVar == null) {
                                    mVar.C(325326539);
                                    mVar.f();
                                    x0VarB = null;
                                } else {
                                    mVar.C(1673062390);
                                    x1 x1Var112 = p3.n.f135158a;
                                    switch (ug2.b.a.f170696a[bVar.ordinal()]) {
                                        case 1:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 2:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 3:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97931h;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 4:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 5:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 6:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        default:
                                            u0.r();
                                            return null;
                                    }
                                }
                                if (x0VarB != null) {
                                    cVar = aVar4.f170677d;
                                    if (cVar == null) {
                                        i14 = -1;
                                    } else {
                                        i14 = ug2.g.f170773b[cVar.ordinal()];
                                    }
                                    if (i14 == -1) {
                                    }
                                } else {
                                    x0VarB = null;
                                }
                                if (x0VarB == null) {
                                    mVar.C(1673064471);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    x0VarB = d92.c.b(j92.f.f97931h, mVar);
                                } else {
                                    mVar.C(1673061867);
                                }
                                mVar.f();
                                mh.c(str11, null, 0L, null, 0L, null, 0L, hVarA11, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130046);
                            }
                            mVar.f();
                            mVar.y();
                            mVar.y();
                            l72.o0 o0Var11 = l72.o0.SMALL;
                            zB = mVar.B(fVar);
                            objQ = mVar.q();
                            if (zB) {
                                aVar.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new mg2.q(fVar);
                                    mVar.K(objQ);
                                }
                            } else {
                                objQ = new mg2.q(fVar);
                                mVar.K(objQ);
                            }
                            l72.u0.a(null, o0Var11, null, null, (e23.a) ((k23.g) objQ), mVar, 48, 13);
                            mVar.y();
                            x1 x1Var113 = p3.n.f135158a;
                            break;
                            break;
                        case 12:
                            s62.a.f157643a.getClass();
                            dVarA = v62.o0.a(t62.b.f162798a);
                            d1Var.b(f14, dVarA, cVar2.f97905d, u0.f(mVar), d92.b.a(mVar).e().c(), mVar, 0);
                            h4.r rVarA13 = u2Var.a(aVar2, 1.0f, true);
                            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarA13, mVar);
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
                            b4.c(eVar, zVarA, mVar);
                            b4.c(c1623g, i2VarX, mVar);
                            if (mVar.getT()) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            } else {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            }
                            b4.c(fVar2, rVarC, mVar);
                            c2.b0 b0Var12 = c2.b0.f22601a;
                            mVar.C(-160505130);
                            while (r1.hasNext()) {
                                num = aVar4.f170674a;
                                strP = aVar4.f170675b;
                                if (num != null) {
                                    mVar.C(324968552);
                                    strP = gl1.y.P(aVar4.f170674a.intValue(), new Object[]{strP}, mVar);
                                    mVar.f();
                                } else {
                                    mVar.C(325116701);
                                    mVar.f();
                                }
                                String str12 = strP;
                                d6.h.f57752b.getClass();
                                d6.h hVarA12 = d6.h.a(d6.h.f57757g);
                                bVar = aVar4.f170676c;
                                if (bVar == null) {
                                    mVar.C(325326539);
                                    mVar.f();
                                    x0VarB = null;
                                } else {
                                    mVar.C(1673062390);
                                    x1 x1Var114 = p3.n.f135158a;
                                    switch (ug2.b.a.f170696a[bVar.ordinal()]) {
                                        case 1:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 2:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 3:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97931h;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 4:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 5:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 6:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        default:
                                            u0.r();
                                            return null;
                                    }
                                }
                                if (x0VarB != null) {
                                    cVar = aVar4.f170677d;
                                    if (cVar == null) {
                                        i14 = -1;
                                    } else {
                                        i14 = ug2.g.f170773b[cVar.ordinal()];
                                    }
                                    if (i14 == -1) {
                                    }
                                } else {
                                    x0VarB = null;
                                }
                                if (x0VarB == null) {
                                    mVar.C(1673064471);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    x0VarB = d92.c.b(j92.f.f97931h, mVar);
                                } else {
                                    mVar.C(1673061867);
                                }
                                mVar.f();
                                mh.c(str12, null, 0L, null, 0L, null, 0L, hVarA12, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130046);
                            }
                            mVar.f();
                            mVar.y();
                            mVar.y();
                            l72.o0 o0Var12 = l72.o0.SMALL;
                            zB = mVar.B(fVar);
                            objQ = mVar.q();
                            if (zB) {
                                aVar.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new mg2.q(fVar);
                                    mVar.K(objQ);
                                }
                            } else {
                                objQ = new mg2.q(fVar);
                                mVar.K(objQ);
                            }
                            l72.u0.a(null, o0Var12, null, null, (e23.a) ((k23.g) objQ), mVar, 48, 13);
                            mVar.y();
                            x1 x1Var115 = p3.n.f135158a;
                            break;
                            break;
                        case 13:
                            s62.a.f157643a.getClass();
                            dVarA = n8.a(t62.b.f162798a);
                            d1Var.b(f14, dVarA, cVar2.f97905d, u0.f(mVar), d92.b.a(mVar).e().c(), mVar, 0);
                            h4.r rVarA14 = u2Var.a(aVar2, 1.0f, true);
                            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarA14, mVar);
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
                            b4.c(eVar, zVarA, mVar);
                            b4.c(c1623g, i2VarX, mVar);
                            if (mVar.getT()) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            } else {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            }
                            b4.c(fVar2, rVarC, mVar);
                            c2.b0 b0Var13 = c2.b0.f22601a;
                            mVar.C(-160505130);
                            while (r1.hasNext()) {
                                num = aVar4.f170674a;
                                strP = aVar4.f170675b;
                                if (num != null) {
                                    mVar.C(324968552);
                                    strP = gl1.y.P(aVar4.f170674a.intValue(), new Object[]{strP}, mVar);
                                    mVar.f();
                                } else {
                                    mVar.C(325116701);
                                    mVar.f();
                                }
                                String str13 = strP;
                                d6.h.f57752b.getClass();
                                d6.h hVarA13 = d6.h.a(d6.h.f57757g);
                                bVar = aVar4.f170676c;
                                if (bVar == null) {
                                    mVar.C(325326539);
                                    mVar.f();
                                    x0VarB = null;
                                } else {
                                    mVar.C(1673062390);
                                    x1 x1Var116 = p3.n.f135158a;
                                    switch (ug2.b.a.f170696a[bVar.ordinal()]) {
                                        case 1:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 2:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 3:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97931h;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 4:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 5:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 6:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        default:
                                            u0.r();
                                            return null;
                                    }
                                }
                                if (x0VarB != null) {
                                    cVar = aVar4.f170677d;
                                    if (cVar == null) {
                                        i14 = -1;
                                    } else {
                                        i14 = ug2.g.f170773b[cVar.ordinal()];
                                    }
                                    if (i14 == -1) {
                                    }
                                } else {
                                    x0VarB = null;
                                }
                                if (x0VarB == null) {
                                    mVar.C(1673064471);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    x0VarB = d92.c.b(j92.f.f97931h, mVar);
                                } else {
                                    mVar.C(1673061867);
                                }
                                mVar.f();
                                mh.c(str13, null, 0L, null, 0L, null, 0L, hVarA13, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130046);
                            }
                            mVar.f();
                            mVar.y();
                            mVar.y();
                            l72.o0 o0Var13 = l72.o0.SMALL;
                            zB = mVar.B(fVar);
                            objQ = mVar.q();
                            if (zB) {
                                aVar.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new mg2.q(fVar);
                                    mVar.K(objQ);
                                }
                            } else {
                                objQ = new mg2.q(fVar);
                                mVar.K(objQ);
                            }
                            l72.u0.a(null, o0Var13, null, null, (e23.a) ((k23.g) objQ), mVar, 48, 13);
                            mVar.y();
                            x1 x1Var117 = p3.n.f135158a;
                            break;
                            break;
                        case 14:
                            s62.a.f157643a.getClass();
                            dVarA = o4.a(t62.b.f162798a);
                            d1Var.b(f14, dVarA, cVar2.f97905d, u0.f(mVar), d92.b.a(mVar).e().c(), mVar, 0);
                            h4.r rVarA15 = u2Var.a(aVar2, 1.0f, true);
                            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarA15, mVar);
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
                            b4.c(eVar, zVarA, mVar);
                            b4.c(c1623g, i2VarX, mVar);
                            if (mVar.getT()) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            } else {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            }
                            b4.c(fVar2, rVarC, mVar);
                            c2.b0 b0Var14 = c2.b0.f22601a;
                            mVar.C(-160505130);
                            while (r1.hasNext()) {
                                num = aVar4.f170674a;
                                strP = aVar4.f170675b;
                                if (num != null) {
                                    mVar.C(324968552);
                                    strP = gl1.y.P(aVar4.f170674a.intValue(), new Object[]{strP}, mVar);
                                    mVar.f();
                                } else {
                                    mVar.C(325116701);
                                    mVar.f();
                                }
                                String str14 = strP;
                                d6.h.f57752b.getClass();
                                d6.h hVarA14 = d6.h.a(d6.h.f57757g);
                                bVar = aVar4.f170676c;
                                if (bVar == null) {
                                    mVar.C(325326539);
                                    mVar.f();
                                    x0VarB = null;
                                } else {
                                    mVar.C(1673062390);
                                    x1 x1Var118 = p3.n.f135158a;
                                    switch (ug2.b.a.f170696a[bVar.ordinal()]) {
                                        case 1:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 2:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 3:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97931h;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 4:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 5:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 6:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        default:
                                            u0.r();
                                            return null;
                                    }
                                }
                                if (x0VarB != null) {
                                    cVar = aVar4.f170677d;
                                    if (cVar == null) {
                                        i14 = -1;
                                    } else {
                                        i14 = ug2.g.f170773b[cVar.ordinal()];
                                    }
                                    if (i14 == -1) {
                                    }
                                } else {
                                    x0VarB = null;
                                }
                                if (x0VarB == null) {
                                    mVar.C(1673064471);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    x0VarB = d92.c.b(j92.f.f97931h, mVar);
                                } else {
                                    mVar.C(1673061867);
                                }
                                mVar.f();
                                mh.c(str14, null, 0L, null, 0L, null, 0L, hVarA14, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130046);
                            }
                            mVar.f();
                            mVar.y();
                            mVar.y();
                            l72.o0 o0Var14 = l72.o0.SMALL;
                            zB = mVar.B(fVar);
                            objQ = mVar.q();
                            if (zB) {
                                aVar.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new mg2.q(fVar);
                                    mVar.K(objQ);
                                }
                            } else {
                                objQ = new mg2.q(fVar);
                                mVar.K(objQ);
                            }
                            l72.u0.a(null, o0Var14, null, null, (e23.a) ((k23.g) objQ), mVar, 48, 13);
                            mVar.y();
                            x1 x1Var119 = p3.n.f135158a;
                            break;
                            break;
                        case 15:
                            s62.a.f157643a.getClass();
                            t62.c.f162799a.getClass();
                            dVarA = k72.k.a(fe.f69560a);
                            d1Var.b(f14, dVarA, cVar2.f97905d, u0.f(mVar), d92.b.a(mVar).e().c(), mVar, 0);
                            h4.r rVarA16 = u2Var.a(aVar2, 1.0f, true);
                            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarA16, mVar);
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
                            b4.c(eVar, zVarA, mVar);
                            b4.c(c1623g, i2VarX, mVar);
                            if (mVar.getT()) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            } else {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            }
                            b4.c(fVar2, rVarC, mVar);
                            c2.b0 b0Var15 = c2.b0.f22601a;
                            mVar.C(-160505130);
                            while (r1.hasNext()) {
                                num = aVar4.f170674a;
                                strP = aVar4.f170675b;
                                if (num != null) {
                                    mVar.C(324968552);
                                    strP = gl1.y.P(aVar4.f170674a.intValue(), new Object[]{strP}, mVar);
                                    mVar.f();
                                } else {
                                    mVar.C(325116701);
                                    mVar.f();
                                }
                                String str15 = strP;
                                d6.h.f57752b.getClass();
                                d6.h hVarA15 = d6.h.a(d6.h.f57757g);
                                bVar = aVar4.f170676c;
                                if (bVar == null) {
                                    mVar.C(325326539);
                                    mVar.f();
                                    x0VarB = null;
                                } else {
                                    mVar.C(1673062390);
                                    x1 x1Var1110 = p3.n.f135158a;
                                    switch (ug2.b.a.f170696a[bVar.ordinal()]) {
                                        case 1:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 2:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 3:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97931h;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 4:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 5:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 6:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        default:
                                            u0.r();
                                            return null;
                                    }
                                }
                                if (x0VarB != null) {
                                    cVar = aVar4.f170677d;
                                    if (cVar == null) {
                                        i14 = -1;
                                    } else {
                                        i14 = ug2.g.f170773b[cVar.ordinal()];
                                    }
                                    if (i14 == -1) {
                                    }
                                } else {
                                    x0VarB = null;
                                }
                                if (x0VarB == null) {
                                    mVar.C(1673064471);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    x0VarB = d92.c.b(j92.f.f97931h, mVar);
                                } else {
                                    mVar.C(1673061867);
                                }
                                mVar.f();
                                mh.c(str15, null, 0L, null, 0L, null, 0L, hVarA15, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130046);
                            }
                            mVar.f();
                            mVar.y();
                            mVar.y();
                            l72.o0 o0Var15 = l72.o0.SMALL;
                            zB = mVar.B(fVar);
                            objQ = mVar.q();
                            if (zB) {
                                aVar.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new mg2.q(fVar);
                                    mVar.K(objQ);
                                }
                            } else {
                                objQ = new mg2.q(fVar);
                                mVar.K(objQ);
                            }
                            l72.u0.a(null, o0Var15, null, null, (e23.a) ((k23.g) objQ), mVar, 48, 13);
                            mVar.y();
                            x1 x1Var1111 = p3.n.f135158a;
                            break;
                            break;
                        case 16:
                            s62.a.f157643a.getClass();
                            dVarA = z2.a(t62.a.f162797a);
                            d1Var.b(f14, dVarA, cVar2.f97905d, u0.f(mVar), d92.b.a(mVar).e().c(), mVar, 0);
                            h4.r rVarA17 = u2Var.a(aVar2, 1.0f, true);
                            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarA17, mVar);
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
                            b4.c(eVar, zVarA, mVar);
                            b4.c(c1623g, i2VarX, mVar);
                            if (mVar.getT()) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            } else {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            }
                            b4.c(fVar2, rVarC, mVar);
                            c2.b0 b0Var16 = c2.b0.f22601a;
                            mVar.C(-160505130);
                            while (r1.hasNext()) {
                                num = aVar4.f170674a;
                                strP = aVar4.f170675b;
                                if (num != null) {
                                    mVar.C(324968552);
                                    strP = gl1.y.P(aVar4.f170674a.intValue(), new Object[]{strP}, mVar);
                                    mVar.f();
                                } else {
                                    mVar.C(325116701);
                                    mVar.f();
                                }
                                String str16 = strP;
                                d6.h.f57752b.getClass();
                                d6.h hVarA16 = d6.h.a(d6.h.f57757g);
                                bVar = aVar4.f170676c;
                                if (bVar == null) {
                                    mVar.C(325326539);
                                    mVar.f();
                                    x0VarB = null;
                                } else {
                                    mVar.C(1673062390);
                                    x1 x1Var1112 = p3.n.f135158a;
                                    switch (ug2.b.a.f170696a[bVar.ordinal()]) {
                                        case 1:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 2:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 3:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97931h;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 4:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 5:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 6:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        default:
                                            u0.r();
                                            return null;
                                    }
                                }
                                if (x0VarB != null) {
                                    cVar = aVar4.f170677d;
                                    if (cVar == null) {
                                        i14 = -1;
                                    } else {
                                        i14 = ug2.g.f170773b[cVar.ordinal()];
                                    }
                                    if (i14 == -1) {
                                    }
                                } else {
                                    x0VarB = null;
                                }
                                if (x0VarB == null) {
                                    mVar.C(1673064471);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    x0VarB = d92.c.b(j92.f.f97931h, mVar);
                                } else {
                                    mVar.C(1673061867);
                                }
                                mVar.f();
                                mh.c(str16, null, 0L, null, 0L, null, 0L, hVarA16, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130046);
                            }
                            mVar.f();
                            mVar.y();
                            mVar.y();
                            l72.o0 o0Var16 = l72.o0.SMALL;
                            zB = mVar.B(fVar);
                            objQ = mVar.q();
                            if (zB) {
                                aVar.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new mg2.q(fVar);
                                    mVar.K(objQ);
                                }
                            } else {
                                objQ = new mg2.q(fVar);
                                mVar.K(objQ);
                            }
                            l72.u0.a(null, o0Var16, null, null, (e23.a) ((k23.g) objQ), mVar, 48, 13);
                            mVar.y();
                            x1 x1Var1113 = p3.n.f135158a;
                            break;
                            break;
                        case 17:
                            s62.a.f157643a.getClass();
                            dVarA = a3.a(t62.a.f162797a);
                            d1Var.b(f14, dVarA, cVar2.f97905d, u0.f(mVar), d92.b.a(mVar).e().c(), mVar, 0);
                            h4.r rVarA18 = u2Var.a(aVar2, 1.0f, true);
                            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarA18, mVar);
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
                            b4.c(eVar, zVarA, mVar);
                            b4.c(c1623g, i2VarX, mVar);
                            if (mVar.getT()) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            } else {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            }
                            b4.c(fVar2, rVarC, mVar);
                            c2.b0 b0Var17 = c2.b0.f22601a;
                            mVar.C(-160505130);
                            while (r1.hasNext()) {
                                num = aVar4.f170674a;
                                strP = aVar4.f170675b;
                                if (num != null) {
                                    mVar.C(324968552);
                                    strP = gl1.y.P(aVar4.f170674a.intValue(), new Object[]{strP}, mVar);
                                    mVar.f();
                                } else {
                                    mVar.C(325116701);
                                    mVar.f();
                                }
                                String str17 = strP;
                                d6.h.f57752b.getClass();
                                d6.h hVarA17 = d6.h.a(d6.h.f57757g);
                                bVar = aVar4.f170676c;
                                if (bVar == null) {
                                    mVar.C(325326539);
                                    mVar.f();
                                    x0VarB = null;
                                } else {
                                    mVar.C(1673062390);
                                    x1 x1Var1114 = p3.n.f135158a;
                                    switch (ug2.b.a.f170696a[bVar.ordinal()]) {
                                        case 1:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 2:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 3:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97931h;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 4:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 5:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 6:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        default:
                                            u0.r();
                                            return null;
                                    }
                                }
                                if (x0VarB != null) {
                                    cVar = aVar4.f170677d;
                                    if (cVar == null) {
                                        i14 = -1;
                                    } else {
                                        i14 = ug2.g.f170773b[cVar.ordinal()];
                                    }
                                    if (i14 == -1) {
                                    }
                                } else {
                                    x0VarB = null;
                                }
                                if (x0VarB == null) {
                                    mVar.C(1673064471);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    x0VarB = d92.c.b(j92.f.f97931h, mVar);
                                } else {
                                    mVar.C(1673061867);
                                }
                                mVar.f();
                                mh.c(str17, null, 0L, null, 0L, null, 0L, hVarA17, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130046);
                            }
                            mVar.f();
                            mVar.y();
                            mVar.y();
                            l72.o0 o0Var17 = l72.o0.SMALL;
                            zB = mVar.B(fVar);
                            objQ = mVar.q();
                            if (zB) {
                                aVar.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new mg2.q(fVar);
                                    mVar.K(objQ);
                                }
                            } else {
                                objQ = new mg2.q(fVar);
                                mVar.K(objQ);
                            }
                            l72.u0.a(null, o0Var17, null, null, (e23.a) ((k23.g) objQ), mVar, 48, 13);
                            mVar.y();
                            x1 x1Var1115 = p3.n.f135158a;
                            break;
                            break;
                        case 18:
                            s62.a.f157643a.getClass();
                            dVarA = q5.a(t62.b.f162798a);
                            d1Var.b(f14, dVarA, cVar2.f97905d, u0.f(mVar), d92.b.a(mVar).e().c(), mVar, 0);
                            h4.r rVarA19 = u2Var.a(aVar2, 1.0f, true);
                            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarA19, mVar);
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
                            b4.c(eVar, zVarA, mVar);
                            b4.c(c1623g, i2VarX, mVar);
                            if (mVar.getT()) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            } else {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            }
                            b4.c(fVar2, rVarC, mVar);
                            c2.b0 b0Var18 = c2.b0.f22601a;
                            mVar.C(-160505130);
                            while (r1.hasNext()) {
                                num = aVar4.f170674a;
                                strP = aVar4.f170675b;
                                if (num != null) {
                                    mVar.C(324968552);
                                    strP = gl1.y.P(aVar4.f170674a.intValue(), new Object[]{strP}, mVar);
                                    mVar.f();
                                } else {
                                    mVar.C(325116701);
                                    mVar.f();
                                }
                                String str18 = strP;
                                d6.h.f57752b.getClass();
                                d6.h hVarA18 = d6.h.a(d6.h.f57757g);
                                bVar = aVar4.f170676c;
                                if (bVar == null) {
                                    mVar.C(325326539);
                                    mVar.f();
                                    x0VarB = null;
                                } else {
                                    mVar.C(1673062390);
                                    x1 x1Var1116 = p3.n.f135158a;
                                    switch (ug2.b.a.f170696a[bVar.ordinal()]) {
                                        case 1:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 2:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 3:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97931h;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 4:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 5:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 6:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        default:
                                            u0.r();
                                            return null;
                                    }
                                }
                                if (x0VarB != null) {
                                    cVar = aVar4.f170677d;
                                    if (cVar == null) {
                                        i14 = -1;
                                    } else {
                                        i14 = ug2.g.f170773b[cVar.ordinal()];
                                    }
                                    if (i14 == -1) {
                                    }
                                } else {
                                    x0VarB = null;
                                }
                                if (x0VarB == null) {
                                    mVar.C(1673064471);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    x0VarB = d92.c.b(j92.f.f97931h, mVar);
                                } else {
                                    mVar.C(1673061867);
                                }
                                mVar.f();
                                mh.c(str18, null, 0L, null, 0L, null, 0L, hVarA18, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130046);
                            }
                            mVar.f();
                            mVar.y();
                            mVar.y();
                            l72.o0 o0Var18 = l72.o0.SMALL;
                            zB = mVar.B(fVar);
                            objQ = mVar.q();
                            if (zB) {
                                aVar.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new mg2.q(fVar);
                                    mVar.K(objQ);
                                }
                            } else {
                                objQ = new mg2.q(fVar);
                                mVar.K(objQ);
                            }
                            l72.u0.a(null, o0Var18, null, null, (e23.a) ((k23.g) objQ), mVar, 48, 13);
                            mVar.y();
                            x1 x1Var1117 = p3.n.f135158a;
                            break;
                            break;
                        case 19:
                            s62.a.f157643a.getClass();
                            dVarA = a6.a(t62.b.f162798a);
                            d1Var.b(f14, dVarA, cVar2.f97905d, u0.f(mVar), d92.b.a(mVar).e().c(), mVar, 0);
                            h4.r rVarA110 = u2Var.a(aVar2, 1.0f, true);
                            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarA110, mVar);
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
                            b4.c(eVar, zVarA, mVar);
                            b4.c(c1623g, i2VarX, mVar);
                            if (mVar.getT()) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            } else {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            }
                            b4.c(fVar2, rVarC, mVar);
                            c2.b0 b0Var19 = c2.b0.f22601a;
                            mVar.C(-160505130);
                            while (r1.hasNext()) {
                                num = aVar4.f170674a;
                                strP = aVar4.f170675b;
                                if (num != null) {
                                    mVar.C(324968552);
                                    strP = gl1.y.P(aVar4.f170674a.intValue(), new Object[]{strP}, mVar);
                                    mVar.f();
                                } else {
                                    mVar.C(325116701);
                                    mVar.f();
                                }
                                String str19 = strP;
                                d6.h.f57752b.getClass();
                                d6.h hVarA19 = d6.h.a(d6.h.f57757g);
                                bVar = aVar4.f170676c;
                                if (bVar == null) {
                                    mVar.C(325326539);
                                    mVar.f();
                                    x0VarB = null;
                                } else {
                                    mVar.C(1673062390);
                                    x1 x1Var1118 = p3.n.f135158a;
                                    switch (ug2.b.a.f170696a[bVar.ordinal()]) {
                                        case 1:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 2:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97932i;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 3:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97931h;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 4:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 5:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        case 6:
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            x0Var = j92.f.f97930g;
                                            mVar.f();
                                            x0VarB = x0Var;
                                            break;
                                        default:
                                            u0.r();
                                            return null;
                                    }
                                }
                                if (x0VarB != null) {
                                    cVar = aVar4.f170677d;
                                    if (cVar == null) {
                                        i14 = -1;
                                    } else {
                                        i14 = ug2.g.f170773b[cVar.ordinal()];
                                    }
                                    if (i14 == -1) {
                                    }
                                } else {
                                    x0VarB = null;
                                }
                                if (x0VarB == null) {
                                    mVar.C(1673064471);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58624b.getClass();
                                    x0VarB = d92.c.b(j92.f.f97931h, mVar);
                                } else {
                                    mVar.C(1673061867);
                                }
                                mVar.f();
                                mh.c(str19, null, 0L, null, 0L, null, 0L, hVarA19, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130046);
                            }
                            mVar.f();
                            mVar.y();
                            mVar.y();
                            l72.o0 o0Var19 = l72.o0.SMALL;
                            zB = mVar.B(fVar);
                            objQ = mVar.q();
                            if (zB) {
                                aVar.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new mg2.q(fVar);
                                    mVar.K(objQ);
                                }
                            } else {
                                objQ = new mg2.q(fVar);
                                mVar.K(objQ);
                            }
                            l72.u0.a(null, o0Var19, null, null, (e23.a) ((k23.g) objQ), mVar, 48, 13);
                            mVar.y();
                            x1 x1Var1119 = p3.n.f135158a;
                            break;
                            break;
                        default:
                            u0.r();
                            return null;
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                InviteByEmailActivity.a aVar5 = InviteByEmailActivity.f43034c;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                ((InviteByEmailActivity) obj4).finish();
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                mk1.f.b((hk1.u) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                ml0.h.d((ml0.k) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ak0.i iVar = (ak0.i) obj4;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var20 = p3.n.f135158a;
                    z02.f.c(0, 54, null, iVar, null, gl1.y.Q(mVar2, R.string.lbl_activity_recording), mVar2, null);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 6:
                mo.i iVar2 = (mo.i) obj4;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var21 = p3.n.f135158a;
                    hf.a(iVar2.f119863b, null, null, false, d92.c.a(ff.f88115a, mVar3), mVar3, 48, 92);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 7:
                lw1.g gVar = (lw1.g) obj4;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var22 = p3.n.f135158a;
                    h4.r.a aVar6 = h4.r.S;
                    h4.r rVarO = c2.l.o(x2.f(aVar6, 1.0f), q1.Max);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA2 = c2.y.a(kVar2, h4.d.a.f81536n, mVar4, 0);
                    int iHashCode4 = Long.hashCode(mVar4.getU());
                    i2 i2VarX4 = mVar4.x();
                    h4.r rVarC4 = h4.k.c(rVarO, mVar4);
                    h5.g.V.getClass();
                    h5.e0.a aVar7 = h5.g.a.f81805b;
                    if (mVar4.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar7);
                    } else {
                        mVar4.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                    b4.c(h5.g.a.f81809f, i2VarX4, mVar4);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar4, iHashCode4, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC4, mVar4);
                    c2.b0 b0Var20 = c2.b0.f22601a;
                    mw1.c.c(0, null, Integer.valueOf(gVar.f115119a.f106977a), mVar4);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    h4.r rVarC5 = x2.c(c2.l.z(aVar6, eVar3.f97920e, eVar3.f97919d), 1.0f);
                    kw1.h hVar = gVar.f115119a;
                    mw1.c.a(rVarC5, hVar.f106978b, gl1.y.Q(mVar4, hVar.f106979c), mVar4, 0);
                    mVar4.y();
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 8:
                com.garmin.android.apps.connectmobile.courses.model.c cVar3 = (com.garmin.android.apps.connectmobile.courses.model.c) obj4;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var23 = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar5, cVar3.f32838b);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar5), mVar5, 0, 0, 131070);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 9:
                n40.m mVar6 = (n40.m) obj4;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                i53.c cVar4 = (i53.c) obj2;
                n40.m.a aVar8 = n40.m.f123595m;
                cVar4.getClass();
                mVar6.f123599k = zBooleanValue;
                mVar6.f123600l = cVar4;
                mVar6.w6();
                return Unit.INSTANCE;
            case 10:
                n72.r rVar = (n72.r) obj4;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var24 = p3.n.f135158a;
                    h4.r rVarD = c2.l.D(a2.b(h4.r.S, a2.a(mVar7), true));
                    c2.j.f22691a.getClass();
                    c2.j.k kVar3 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA3 = c2.y.a(kVar3, h4.d.a.f81536n, mVar7, 0);
                    int iHashCode5 = Long.hashCode(mVar7.getU());
                    i2 i2VarX5 = mVar7.x();
                    h4.r rVarC6 = h4.k.c(rVarD, mVar7);
                    h5.g.V.getClass();
                    h5.e0.a aVar9 = h5.g.a.f81805b;
                    if (mVar7.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar9);
                    } else {
                        mVar7.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar7);
                    b4.c(h5.g.a.f81809f, i2VarX5, mVar7);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar7.getT() || !p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar7, iHashCode5, bVar5);
                    }
                    b4.c(h5.g.a.f81807d, rVarC6, mVar7);
                    c2.b0 b0Var21 = c2.b0.f22601a;
                    v.h.B(rVar.f124916e, mVar7, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                nc.j.a((nc.k) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 12:
                ne2.d0 d0Var = (ne2.d0) obj4;
                int i19 = ne2.d0.f125576h;
                ((FeaturesetFeature) obj).getClass();
                ((InteractionContext) obj2).getClass();
                com.garmin.android.library.mapsdkadapter.i.n nVar = d0Var.f125583g;
                if (nVar != null) {
                    nVar.T0(d0Var);
                }
                return Boolean.TRUE;
            case 13:
                mg0.a aVar10 = (mg0.a) obj4;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ng0.b bVar6 = ng0.b.f125905a;
                if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var25 = p3.n.f135158a;
                    t4.d dVarA2 = n5.c.a(aVar10.f118367d, mVar8, 0);
                    h4.r.a aVar11 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    i7.a(dVarA2, null, x2.u(x2.h(aVar11, eVar4.f97921f), eVar4.f97921f), 0L, mVar8, 48, 8);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 14:
                EditProfileActivity editProfileActivity = (EditProfileActivity) obj4;
                String str20 = (String) obj;
                String str21 = (String) obj2;
                EditProfileActivity.a aVar12 = EditProfileActivity.f46981h;
                str20.getClass();
                if (str21 == null) {
                    g22.a.c(editProfileActivity, Uri.parse(str20));
                } else {
                    g22.a.e(editProfileActivity, str21, str20);
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                int i24 = o62.l.f129705g;
                ((o62.l) obj4).g((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 16:
                o82.g gVar2 = (o82.g) obj4;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var26 = p3.n.f135158a;
                    mh.c(gVar2.name(), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar9, 0, 0, 262142);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 17:
                MarkerState markerState = (MarkerState) obj4;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var27 = p3.n.f135158a;
                    MarkerKt.m114Markerqld6geY(markerState, null, 0.0f, 0L, false, false, null, 0L, 0.0f, "Marker in Singapore", null, "Singapore", false, 0.0f, null, null, null, null, mVar10, MarkerState.$stable | C.ENCODING_PCM_32BIT, 48, 259582);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 18:
                m1 m1Var = (m1) obj4;
                p3.m mVar11 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var28 = p3.n.f135158a;
                    c3 c3Var = c3.f110949a;
                    float floatValue = m1Var.getFloatValue();
                    j23.e eVar5 = new j23.e(0.0f, 100.0f);
                    g6.f.a aVar13 = g6.f.f75994b;
                    h4.r rVarA20 = c2.l.A(h4.r.S, 24, 0.0f, 2);
                    Object objQ2 = mVar11.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ2 == c2565a) {
                        objQ2 = new ca0.q1(m1Var, 7);
                        mVar11.K(objQ2);
                    }
                    e23.l<? super Float, Unit> lVar = (e23.l) objQ2;
                    Object objQ3 = mVar11.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new o72.i2(17);
                        mVar11.K(objQ3);
                    }
                    c3Var.a(floatValue, lVar, rVarA20, false, eVar5, 0, null, (e23.a) objQ3, mVar11, 12583344, 104);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 19:
                o81.f fVar3 = (o81.f) obj;
                u81.a aVar14 = (u81.a) obj2;
                com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.a.C0753a c0753a = com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.a.f40269y;
                fVar3.getClass();
                aVar14.getClass();
                new o81.g(fVar3, aVar14).show(((com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.a) obj4).getChildFragmentManager(), "");
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                og2.c.b((qg2.c) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 21:
                GroupDetailMemberListFragment groupDetailMemberListFragment = (GroupDetailMemberListFragment) obj4;
                p3.m mVar12 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var29 = p3.n.f135158a;
                    zc.d dVarA3 = zc.g.a(((nm0.f) groupDetailMemberListFragment.f36181b.getValue()).f126583h, mVar12);
                    Object objQ4 = mVar12.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ4 == c2565a2) {
                        obj3 = objQ4;
                        c2 c2VarN = p3.p0.n(Boolean.FALSE);
                        mVar12.K(c2VarN);
                        obj3 = c2VarN;
                    }
                    obj3 = objQ4;
                    p1 p1Var = (p1) obj3;
                    z0 z0Var = dVarA3.d().f196385a;
                    boolean zR = mVar12.r(dVarA3) | mVar12.r(groupDetailMemberListFragment);
                    Object objQ5 = mVar12.q();
                    Object obj5 = objQ5;
                    if (zR || objQ5 == c2565a2) {
                        om0.b bVar7 = new om0.b(dVarA3, groupDetailMemberListFragment, p1Var, null);
                        mVar12.K(bVar7);
                        obj5 = bVar7;
                    }
                    p3.l0.e((e23.p) obj5, z0Var, mVar12);
                    z02.b.a(false, null, null, null, false, z3.f.c(305242486, new mw1.b(dVarA3, i16, groupDetailMemberListFragment, p1Var), mVar12), mVar12, 196608, 31);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 22:
                com.garmin.android.apps.connectmobile.group.details.about.member.a aVar15 = (com.garmin.android.apps.connectmobile.group.details.about.member.a) obj4;
                p3.m mVar13 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                GroupTransferOwnershipActivity.a aVar16 = GroupTransferOwnershipActivity.f36209d;
                if (mVar13.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var30 = p3.n.f135158a;
                    h4.r.a aVar17 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    b12.k.b(aVar17, null, j92.b.f97901d.f97906e, ((com.garmin.android.apps.connectmobile.group.details.about.member.a.b) aVar15).f36221a.f31628p, mVar13, (b12.b.f14385f << 9) | 6, 18);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 23:
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                NewFitPayWebNavigationActivity.a aVar18 = NewFitPayWebNavigationActivity.f51549w;
                dialogInterface2.getClass();
                dialogInterface2.dismiss();
                ((NewFitPayWebNavigationActivity) obj4).finish();
                return Unit.INSTANCE;
            case 24:
                IntensityMinutesReportsActivity intensityMinutesReportsActivity = (IntensityMinutesReportsActivity) obj4;
                p3.m mVar14 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                IntensityMinutesReportsActivity.a aVar19 = IntensityMinutesReportsActivity.f36935b;
                if (mVar14.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var31 = p3.n.f135158a;
                    or0.m mVar15 = (or0.m) intensityMinutesReportsActivity.f36936a.getValue();
                    boolean zR2 = mVar14.r(intensityMinutesReportsActivity);
                    Object objQ6 = mVar14.q();
                    if (zR2) {
                        objQ6 = new n82.i(intensityMinutesReportsActivity, i17);
                        mVar14.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new n82.i(intensityMinutesReportsActivity, i17);
                            mVar14.K(objQ6);
                        }
                    }
                    or0.l.a(intensityMinutesReportsActivity, mVar15, (e23.a) objQ6, mVar14, 0);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 25:
                ov1.c cVar5 = (ov1.c) obj4;
                p3.m mVar16 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                ov1.c.a aVar20 = ov1.c.f134143b;
                if (mVar16.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var32 = p3.n.f135158a;
                    mv1.d dVar = (mv1.d) ((pv1.b) cVar5.f134144a.getValue()).V0.getValue();
                    if (dVar != null && (list = dVar.f121182a) != null) {
                        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            wr.g.z(wt1.q.f187120f, (String) it.next(), arrayList);
                        }
                        cVarE = i53.a.e(arrayList);
                    }
                    w13.c<wt1.q> cVar6 = wt1.q.f187129o;
                    ArrayList arrayList2 = new ArrayList(p13.y.r(cVar6, 10));
                    for (wt1.q qVar : cVar6) {
                        arrayList2.add(new mv1.f(qVar, "", cVarE != null ? cVarE.contains(qVar) : false, true));
                    }
                    boolean zR3 = mVar16.r(cVar5);
                    Object objQ7 = mVar16.q();
                    if (zR3) {
                        objQ7 = new n82.i(cVar5, 27);
                        mVar16.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new n82.i(cVar5, 27);
                            mVar16.K(objQ7);
                        }
                    }
                    cVar5.u6(arrayList2, (e23.a) objQ7, mVar16, 432);
                    x1 x1Var33 = p3.n.f135158a;
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 26:
                ov1.d dVar2 = (ov1.d) obj4;
                p3.m mVar17 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                ov1.d.a aVar21 = ov1.d.f134149c;
                if (mVar17.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var34 = p3.n.f135158a;
                    mv1.a aVar22 = (mv1.a) ((pv1.b) dVar2.f134150a.getValue()).N0.getValue();
                    if (aVar22 != null && (kVar = aVar22.f121169g) != null && (courseProfileDTO = kVar.getCourseProfileDTO()) != null && (hillType = courseProfileDTO.getHillType()) != null) {
                        hv1.e.f85844c.getClass();
                        eVarA = hv1.e.a.a(hillType);
                    }
                    hv1.e eVar6 = eVarA;
                    boolean zR4 = mVar17.r(dVar2);
                    Object objQ8 = mVar17.q();
                    if (zR4) {
                        objQ8 = new nw0.f(dVar2, 20);
                        mVar17.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new nw0.f(dVar2, 20);
                            mVar17.K(objQ8);
                        }
                    }
                    cw1.o0.a(eVar6, true, (e23.l) objQ8, false, 0, 0, mVar17, 48, 56);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 27:
                return a(obj, obj2);
            case 28:
                return b(obj, obj2);
            default:
                ov1.p pVar = (ov1.p) obj4;
                p3.m mVar18 = (p3.m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                ov1.p.a aVar23 = ov1.p.f134204c;
                if (mVar18.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var35 = p3.n.f135158a;
                    boolean zR5 = mVar18.r(pVar);
                    Object objQ9 = mVar18.q();
                    if (zR5) {
                        objQ9 = new ov1.n(pVar, i18);
                        mVar18.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new ov1.n(pVar, i18);
                            mVar18.K(objQ9);
                        }
                    }
                    pVar.u6((e23.a) objQ9, mVar18, 0);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f(Object obj, int i14, int i15) {
        this.f117299a = i15;
        this.f117300b = obj;
    }
}
