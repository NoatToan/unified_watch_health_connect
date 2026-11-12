package tr2;

import android.content.ClipData;
import android.content.DialogInterface;
import androidx.lifecycle.i0;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.annual_report.developer_option.MultipleImagesShareSampleActivity;
import com.garmin.android.library.geolocationrestapi.CountrySettingActivity;
import com.garmin.feature.garminpay.ui.userwallet.PaymentCardDetailsFragment;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import f5.z0;
import h5.e0;
import i3.ff;
import i3.hf;
import i3.i7;
import i3.mh;
import java.text.Collator;
import java.util.Locale;
import kotlin.m1;
import kotlin.n1;
import l72.g3;
import nr.q0;
import o53.f0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import s5.x0;
import v2.h2;
import v2.w1;
import vd0.t0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f166162b;

    public /* synthetic */ o(Object obj, int i14) {
        this.f166161a = i14;
        this.f166162b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String string;
        e0.a aVar;
        h5.g.a.e eVar;
        h5.g.a.b bVar;
        h5.g.a.f fVar;
        p3.m mVar;
        String strQ;
        int i14 = this.f166161a;
        int i15 = 2;
        Object obj3 = this.f166162b;
        switch (i14) {
            case 0:
                PaymentCardDetailsFragment paymentCardDetailsFragment = (PaymentCardDetailsFragment) obj3;
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                Logger logger = PaymentCardDetailsFragment.f52189m;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                yq2.a aVar2 = paymentCardDetailsFragment.f52197h;
                if (aVar2 == null) {
                    p005kotlin.jvm.internal.s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    throw null;
                }
                aVar2.x(true);
                i0 i0VarW = f0.w(paymentCardDetailsFragment);
                x53.c cVar = s0.f129406a;
                ge1.b.T(i0VarW, u53.o.f168762a, null, new q(paymentCardDetailsFragment, null), 2);
                return Unit.INSTANCE;
            case 1:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.x xVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.x) obj3;
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                dialogInterface2.getClass();
                dialogInterface2.dismiss();
                ActivityListItemDTO activityListItemDTO = xVar.f46327q;
                if (activityListItemDTO != null) {
                    xVar.u6().B5(activityListItemDTO.f29250b, false);
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                u70.g.e((u70.b.C3169b) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                u70.g.f((u70.b.c) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                l90.b bVar2 = (l90.b) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    String str = bVar2.f111526k.f130962a;
                    h4.r.a aVar4 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    da0.f.a(0, x2.q(aVar4, j92.b.f97901d.f97905d), str, mVar2);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 5:
                uc.i iVar = (uc.i) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    iVar.f169932b.a(mVar3, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 6:
                CountrySettingActivity countrySettingActivity = (CountrySettingActivity) obj3;
                String str2 = (String) obj;
                String str3 = (String) obj2;
                Collator collator = Collator.getInstance(Locale.getDefault());
                collator.setStrength(0);
                str2.getClass();
                String strO9 = CountrySettingActivity.O9(countrySettingActivity, str2);
                str3.getClass();
                return Integer.valueOf(collator.compare(strO9, CountrySettingActivity.O9(countrySettingActivity, str3)));
            case 7:
                ((Integer) obj2).getClass();
                int i16 = uj1.i0.f171523j;
                ((uj1.i0) obj3).g((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 8:
                ur.a aVar5 = (ur.a) obj3;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    ur.b.a((qr.t) aVar5.f172312a.getValue(), mVar4, 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 9:
                com.garmin.android.apps.connectmobile.badges.redesign.c cVar2 = (com.garmin.android.apps.connectmobile.badges.redesign.c) obj3;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.badges.redesign.c.a aVar6 = com.garmin.android.apps.connectmobile.badges.redesign.c.f30427b;
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    r22.i.a((uu.q) cVar2.f30428a.getValue(), mVar5, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                ux1.j.i((dy1.m) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                ux1.j.b((dy1.f) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                ux1.j.j((dy1.t) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 13:
                w1 w1Var = (w1) obj3;
                m1 m1Var = (m1) obj;
                n1 n1Var = (n1) obj2;
                w1Var.Y1();
                w1Var.f175194e.i();
                ClipData clipData = m1Var.f91340a;
                int itemCount = clipData.getItemCount();
                boolean z14 = false;
                for (int i17 = 0; i17 < itemCount; i17++) {
                    z14 = z14 || clipData.getItemAt(i17).getText() != null;
                }
                if (z14) {
                    StringBuilder sb3 = new StringBuilder();
                    int itemCount2 = clipData.getItemCount();
                    boolean z15 = false;
                    for (int i18 = 0; i18 < itemCount2; i18++) {
                        CharSequence text = clipData.getItemAt(i18).getText();
                        if (text != null) {
                            if (z15) {
                                sb3.append("\n");
                            }
                            sb3.append(text);
                            z15 = true;
                        }
                    }
                    string = sb3.toString();
                } else {
                    string = null;
                }
                w1.a aVarA = w1.b.a(w1Var);
                if (aVarA == null) {
                    if (string != null) {
                        h2.h(w1Var.f175192c, string, null, false, 14);
                    }
                    return Boolean.TRUE;
                }
                v1.d.a.f174661b.getClass();
                new v1.d(m1Var, n1Var, v1.d.a.f174662c, null, 8, null);
                aVarA.a();
                throw null;
            case 14:
                k30.k kVar = (k30.k) obj3;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    h4.r.a aVar7 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar2, h4.d.a.f81536n, mVar6, 0);
                    int iHashCode = Long.hashCode(mVar6.getU());
                    i2 i2VarX = mVar6.x();
                    h4.r rVarC = h4.k.c(aVar7, mVar6);
                    h5.g.V.getClass();
                    e0.a aVar8 = h5.g.a.f81805b;
                    if (mVar6.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar8);
                    } else {
                        mVar6.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar6);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar6);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar6.getT() || !p005kotlin.jvm.internal.s.g(mVar6.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar6, iHashCode, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar6);
                    b0 b0Var = b0.f22601a;
                    String strT = gl1.d.T(kVar.f102563b, mVar6, 0);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strT, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar6), mVar6, 0, 0, 131070);
                    mh.c(gl1.d.T(kVar.f102564c, mVar6, 0), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar6), mVar6, 0, 0, 131070);
                    mVar6.y();
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 15:
                uc.c cVar3 = (uc.c) obj3;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    cVar3.getF169935e().invoke(mVar7, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 16:
                uc.b bVar4 = (uc.b) obj3;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    bVar4.getF169935e().invoke(mVar8, 0);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 17:
                DialogInterface dialogInterface3 = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                Logger logger2 = vc0.j.f176990h;
                dialogInterface3.getClass();
                xt2.a aVarT = vc0.j.t(((vc0.j) obj3).f176991c);
                if (aVarT != null) {
                    aVarT.c(new vc0.l());
                }
                dialogInterface3.cancel();
                return Unit.INSTANCE;
            case 18:
                DialogInterface dialogInterface4 = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                Logger logger3 = vc0.q.f177002e;
                dialogInterface4.getClass();
                ((di2.a) obj3).e(mh2.j.DEFAULT);
                dialogInterface4.cancel();
                return Unit.INSTANCE;
            case 19:
                DialogInterface dialogInterface5 = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                Logger logger4 = vc0.s.f177006e;
                dialogInterface5.getClass();
                ((fi2.x) obj3).invoke(Boolean.FALSE);
                dialogInterface5.cancel();
                return Unit.INSTANCE;
            case 20:
                DialogInterface dialogInterface6 = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                Logger logger5 = vc0.s.f177006e;
                dialogInterface6.getClass();
                ((fi2.y) obj3).invoke(Boolean.FALSE);
                dialogInterface6.cancel();
                return Unit.INSTANCE;
            case 21:
                pe0.h hVar = (pe0.h) obj3;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    h4.r.a aVar9 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar3 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA2 = c2.y.a(kVar3, h4.d.a.f81536n, mVar9, 0);
                    int iHashCode2 = Long.hashCode(mVar9.getU());
                    i2 i2VarX2 = mVar9.x();
                    h4.r rVarC2 = h4.k.c(aVar9, mVar9);
                    h5.g.V.getClass();
                    e0.a aVar10 = h5.g.a.f81805b;
                    if (mVar9.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar9.z();
                    if (mVar9.getT()) {
                        mVar9.M(aVar10);
                    } else {
                        mVar9.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, zVarA2, mVar9);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX2, mVar9);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar9.getT() || !p005kotlin.jvm.internal.s.g(mVar9.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar9, iHashCode2, bVar5);
                    }
                    h5.g.a.f fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC2, mVar9);
                    b0 b0Var2 = b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    h4.r rVarF = x2.f(c2.l.y(aVar9, eVar3.f97920e), 1.0f);
                    s2 s2VarA = q2.a(c2.j.f22698h, h4.d.a.f81534l, mVar9, 54);
                    int iHashCode3 = Long.hashCode(mVar9.getU());
                    i2 i2VarX3 = mVar9.x();
                    h4.r rVarC3 = h4.k.c(rVarF, mVar9);
                    if (mVar9.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar9.z();
                    if (mVar9.getT()) {
                        mVar9.M(aVar10);
                    } else {
                        mVar9.c();
                    }
                    b4.c(eVar2, s2VarA, mVar9);
                    b4.c(c1623g, i2VarX3, mVar9);
                    if (mVar9.getT() || !p005kotlin.jvm.internal.s.g(mVar9.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar9, iHashCode3, bVar5);
                    }
                    b4.c(fVar2, rVarC3, mVar9);
                    u2 u2Var = u2.f22900a;
                    if (g22.n.d(hVar.f137447f)) {
                        mVar9.C(-2034586403);
                        String str4 = hVar.f137447f;
                        String strQ2 = gl1.y.Q(mVar9, R.string.lbl_profile_picture);
                        h4.r rVarB = l4.k.b(x2.q(aVar9, j92.b.f97901d.f97906e), k2.i.f102406a);
                        f5.k.f68985a.getClass();
                        aVar = aVar10;
                        jf.r.a(str4, strQ2, rVarB, null, null, f5.k.a.f68987b, null, mVar9, 1572864, 1976);
                        mVar9.f();
                        fVar = fVar2;
                        mVar = mVar9;
                        eVar = eVar2;
                        bVar = bVar5;
                    } else {
                        aVar = aVar10;
                        mVar9.C(-2034106585);
                        j92.c cVar4 = j92.b.f97901d;
                        h4.r rVarB2 = l4.k.b(x2.q(aVar9, cVar4.f97906e), k2.i.f102406a);
                        gl.c.f77766a.getClass();
                        gl.e eVar4 = gl.c.f77767b;
                        h4.r rVarE = u1.n.e(rVarB2, eVar4.f77781g, o4.m1.f128891a);
                        z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
                        int iHashCode4 = Long.hashCode(mVar9.getU());
                        i2 i2VarX4 = mVar9.x();
                        h4.r rVarC4 = h4.k.c(rVarE, mVar9);
                        if (mVar9.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar9.z();
                        if (mVar9.getT()) {
                            mVar9.M(aVar);
                        } else {
                            mVar9.c();
                        }
                        b4.c(eVar2, z0VarD, mVar9);
                        b4.c(c1623g, i2VarX4, mVar9);
                        if (mVar9.getT() || !p005kotlin.jvm.internal.s.g(mVar9.q(), Integer.valueOf(iHashCode4))) {
                            v.h.z(iHashCode4, mVar9, iHashCode4, bVar5);
                        }
                        b4.c(fVar2, rVarC4, mVar9);
                        c2.u uVar = c2.u.f22885a;
                        eVar = eVar2;
                        bVar = bVar5;
                        fVar = fVar2;
                        i7.a(n5.c.a(R.drawable.ic_dog_profile_placeholder, mVar9, 0), gl1.y.Q(mVar9, R.string.lbl_profile_picture), x2.q(aVar9, cVar4.f97905d), eVar4.f77787j, mVar9, 0, 0);
                        mVar = mVar9;
                        mVar.y();
                        mVar.f();
                    }
                    h4.r rVarC5 = c2.l.C(aVar9, eVar3.f97918c, 0.0f, 0.0f, 0.0f, 14);
                    String str5 = hVar.f137443b;
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97932i;
                    mh.c(str5, rVarC5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(x0Var), mVar, 0, 0, 131068);
                    h4.r rVarF2 = x2.f(aVar9, 1.0f);
                    String strP = gl1.y.P(R.string.num_activities, new Object[]{Integer.valueOf(hVar.f137445d)}, mVar);
                    d6.h.f57752b.getClass();
                    mh.c(strP, rVarF2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57754d), 0L, 0, false, 0, 0, null, x0Var, mVar, 48, 0, 130044);
                    p3.m mVar10 = mVar;
                    mVar10.y();
                    if (hVar.f137444c == je0.j.RETIRED) {
                        mVar10.C(-1504716974);
                        float f14 = eVar3.f97920e;
                        h4.r rVarC6 = c2.l.C(aVar9, f14, 0.0f, 0.0f, f14, 6);
                        s2 s2VarA2 = q2.a(c2.j.f22692b, h4.d.a.f81533k, mVar10, 0);
                        int iHashCode5 = Long.hashCode(mVar10.getU());
                        i2 i2VarX5 = mVar10.x();
                        h4.r rVarC7 = h4.k.c(rVarC6, mVar10);
                        if (mVar10.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar10.z();
                        if (mVar10.getT()) {
                            mVar10.M(aVar);
                        } else {
                            mVar10.c();
                        }
                        b4.c(eVar, s2VarA2, mVar10);
                        b4.c(c1623g, i2VarX5, mVar10);
                        if (mVar10.getT() || !p005kotlin.jvm.internal.s.g(mVar10.q(), Integer.valueOf(iHashCode5))) {
                            v.h.z(iHashCode5, mVar10, iHashCode5, bVar);
                        }
                        b4.c(fVar, rVarC7, mVar10);
                        g3.a(0, 2, null, gl1.y.Q(mVar10, R.string.lbl_gear_retired), mVar10);
                        mVar10.y();
                        mVar10.f();
                    } else {
                        mVar10.C(-1504438284);
                        mVar10.f();
                    }
                    mVar10.y();
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 22:
                je0.j jVar = (je0.j) obj3;
                p3.m mVar11 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                    Integer numValueOf = jVar != null ? Integer.valueOf(jVar.f98545b) : null;
                    if (numValueOf == null) {
                        mVar11.C(458256190);
                        mVar11.f();
                        strQ = null;
                    } else {
                        mVar11.C(458256191);
                        strQ = gl1.y.Q(mVar11, numValueOf.intValue());
                        mVar11.f();
                    }
                    if (strQ == null) {
                        strQ = sn.a.h(mVar11, 1400256748, R.string.common_all, mVar11);
                    } else {
                        mVar11.C(1400255415);
                        mVar11.f();
                    }
                    String str6 = strQ;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97932i, mVar11);
                    d6.h.f57752b.getClass();
                    mh.c(str6, rVarF3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57757g), 0L, 0, false, 0, 0, null, x0VarB, mVar11, 48, 0, 130044);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                t0.a((pe0.e.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 24:
                pe0.j jVar2 = (pe0.j) obj3;
                p3.m mVar12 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    hf.a(jVar2.f137459i, null, null, false, d92.c.a(ff.f88115a, mVar12), mVar12, 48, 92);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                vr.g.c((q0) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 26:
                MultipleImagesShareSampleActivity multipleImagesShareSampleActivity = (MultipleImagesShareSampleActivity) obj3;
                p3.m mVar13 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                int i19 = MultipleImagesShareSampleActivity.f30169a;
                if (mVar13.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    Object objQ = mVar13.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = p0.n(Boolean.TRUE);
                        mVar13.K(objQ);
                    }
                    z02.b.a(false, null, null, null, false, z3.f.c(1941623372, new vq0.a(i15, multipleImagesShareSampleActivity, (p1) objQ), mVar13), mVar13, 196608, 31);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 27:
                vt0.a aVar11 = (vt0.a) obj3;
                p3.m mVar14 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar14.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    String strQ3 = gl1.y.Q(mVar14, aVar11.f180049b);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar14), mVar14, 0, 0, 131070);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                int i24 = vx1.d.f180657g;
                ((vx1.d) obj3).g((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int i25 = vx1.e.f180659j;
                ((vx1.e) obj3).h((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ o(Object obj, int i14, int i15) {
        this.f166161a = i15;
        this.f166162b = obj;
    }
}
