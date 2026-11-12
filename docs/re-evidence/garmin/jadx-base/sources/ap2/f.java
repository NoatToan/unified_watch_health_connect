package ap2;

import android.content.Context;
import android.content.DialogInterface;
import android.icu.text.DecimalFormatSymbols;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.v1;
import aq.j2;
import b82.g1;
import b82.j1;
import c2.b0;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.onboarding.komoot.KomootConsentActivity;
import com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivitiesActivity;
import com.garmin.android.apps.connectmobile.trainingrediness.presentation.TrainingReadinessFeedBackPhraseTest;
import com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutPreCreateActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity;
import ei0.u0;
import h5.e0;
import i3.ff;
import i3.hf;
import i3.i7;
import i3.mh;
import kotlin.o3;
import l72.v2;
import l72.y2;
import p005kotlin.Unit;
import p006l2.h1;
import p3.b4;
import p3.i2;
import p3.l1;
import p3.p0;
import p3.x1;
import p3.y3;
import s5.x0;
import u1.a2;
import v62.e1;
import w51.c0;
import w51.h0;
import z2.h2;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11693c;

    public /* synthetic */ f(Object obj, boolean z14, int i14) {
        this.f11691a = i14;
        this.f11693c = obj;
        this.f11692b = z14;
    }

    /* JADX WARN: Code duplicated, block: B:157:0x050d  */
    /* JADX WARN: Code duplicated, block: B:162:0x0529  */
    /* JADX WARN: Code duplicated, block: B:234:0x0715  */
    /* JADX WARN: Code duplicated, block: B:49:0x018e  */
    /* JADX WARN: Type inference failed for: r3v72, types: [java.lang.Object, o13.l] */
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
        long jB;
        u4.d dVar;
        long jD;
        x0 x0VarE;
        int i14 = this.f11691a;
        p3.m.a aVar = p3.m.f135153a;
        boolean z14 = false;
        int i15 = 1;
        boolean z15 = this.f11692b;
        Object obj3 = this.f11693c;
        switch (i14) {
            case 0:
                FitPayAddCardActivity fitPayAddCardActivity = (FitPayAddCardActivity) obj3;
                ((Integer) obj2).intValue();
                ((DialogInterface) obj).dismiss();
                if (z15) {
                    FitPayAddCardActivity.a.a(FitPayAddCardActivity.f51376x).debug("deleteCardAndNotifyUser: card is deleted, let the try adding card again");
                    fitPayAddCardActivity.onBackPressed();
                } else {
                    FitPayAddCardActivity.a.a(FitPayAddCardActivity.f51376x).error("deleteCardAndNotifyUser: cant delete the card, navigate to wallet view");
                    fitPayAddCardActivity.ea();
                }
                return Unit.INSTANCE;
            case 1:
                l1 l1Var = (l1) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    h4.r rVarF = x2.f(aVar2, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar3 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    z zVarA = c2.y.a(c2.j.f22694d, aVar3, mVar, 48);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarF, mVar);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
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
                    h4.r rVarX = x2.x(x2.z(aVar2, null, 3), null, 3);
                    double doubleValue = l1Var.getDoubleValue();
                    String decimalSeparatorString = DecimalFormatSymbols.getInstance().getDecimalSeparatorString();
                    decimalSeparatorString.getClass();
                    String strQ = gl1.y.Q(mVar, R.string.lbl_kg);
                    String strQ2 = gl1.y.Q(mVar, R.string.lbl_lbs);
                    Object objQ = mVar.q();
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new j2(l1Var, 0);
                        mVar.K(objQ);
                    }
                    r82.u.a(rVarX, this.f11692b, false, strQ, strQ2, null, decimalSeparatorString, doubleValue, 453.5d, 999.5d, 0, 0.0d, (e23.l) objQ, null, null, true, true, mVar, 905969670, 1769856, 27684);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                dh.b.h((y2) obj3, z15, (p3.m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 3:
                g1 g1Var = (g1) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    if (z15) {
                        mVar2.C(-1308481996);
                        d92.b.f58623a.getClass();
                        jB = d92.b.a(mVar2).k().f63527d;
                    } else {
                        mVar2.C(-1308480944);
                        d92.b.f58623a.getClass();
                        jB = d92.b.a(mVar2).k().b();
                    }
                    mVar2.f();
                    long j8 = jB;
                    h4.r.a aVar5 = h4.r.S;
                    boolean zH = mVar2.h(z15) | mVar2.B(g1Var);
                    Object objQ2 = mVar2.q();
                    if (zH) {
                        objQ2 = new j1(z15, g1Var, 0);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new j1(z15, g1Var, 0);
                            mVar2.K(objQ2);
                        }
                    }
                    h4.r rVarC2 = p5.v.c((e23.l) objQ2, aVar5, false);
                    String str = z15 ? g1Var.f16582a : g1Var.f16583b;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarE2 = d92.c.e(j92.f.f97932i);
                    d6.h.f57752b.getClass();
                    mh.c(str, rVarC2, j8, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarE2, mVar2, 0, 0, 130040);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                ck0.k.d((ck0.q) obj3, z15, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                cr.x.e((ep.e) obj3, z15, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                ep.k.e((i53.c) obj3, z15, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                m52.k kVar = (m52.k) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                WorkoutPreCreateActivity.a aVar6 = WorkoutPreCreateActivity.f48888d;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    if (!z15 || (dVar = kVar.f116773i) == null) {
                        dVar = kVar.f116772h;
                    }
                    u4.d dVar2 = dVar;
                    long jB2 = ds.e0.b(d92.b.f58623a, mVar3);
                    h4.r.a aVar7 = h4.r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVar2, null, x2.q(aVar7, j92.b.f97901d.f97905d), jB2, mVar3, 48, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 8:
                g3 g3Var = (g3) obj3;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    hf.a(this.f11692b, null, null, g3Var.f35300a != fw.p.LOADING, d92.c.a(ff.f88115a, mVar4), mVar4, 48, 76);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 9:
                FitPayCardVerificationActivity fitPayCardVerificationActivity = (FitPayCardVerificationActivity) obj3;
                ((Integer) obj2).getClass();
                FitPayCardVerificationActivity.b bVar2 = FitPayCardVerificationActivity.f51449m;
                ((DialogInterface) obj).getClass();
                fitPayCardVerificationActivity.ea(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.ERROR);
                if (z15) {
                    fitPayCardVerificationActivity.da();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                h1.c((h2) obj3, z15, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 11:
                com.garmin.android.apps.connectmobile.courses.model.h hVar = (com.garmin.android.apps.connectmobile.courses.model.h) obj3;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    u4.d dVar3 = hVar.f32966b;
                    long jB3 = ds.e0.b(d92.b.f58623a, mVar5);
                    h4.r.a aVar8 = h4.r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVar3, null, v2.a(x2.q(aVar8, j92.b.f97901d.f97905d), !z15, new ma0.b(9), mVar5, 0), jB3, mVar5, 48, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 12:
                KomootConsentActivity komootConsentActivity = (KomootConsentActivity) obj3;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                KomootConsentActivity.a aVar9 = KomootConsentActivity.f39717c;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    boolean zR = mVar6.r(komootConsentActivity);
                    Object objQ3 = mVar6.q();
                    if (zR) {
                        objQ3 = new q31.d(komootConsentActivity, z14 ? 1 : 0);
                        mVar6.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new q31.d(komootConsentActivity, z14 ? 1 : 0);
                            mVar6.K(objQ3);
                        }
                    }
                    e23.a aVar10 = (e23.a) objQ3;
                    boolean zR2 = mVar6.r(komootConsentActivity);
                    Object objQ4 = mVar6.q();
                    if (zR2) {
                        objQ4 = new q31.d(komootConsentActivity, i15);
                        mVar6.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new q31.d(komootConsentActivity, i15);
                            mVar6.K(objQ4);
                        }
                    }
                    q31.e.a(true, this.f11692b, aVar10, (e23.a) objQ4, mVar6, 6);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 13:
                com.garmin.android.apps.connectmobile.settings.lte.b bVar3 = (com.garmin.android.apps.connectmobile.settings.lte.b) obj3;
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.settings.lte.b.a aVar11 = com.garmin.android.apps.connectmobile.settings.lte.b.f43475i;
                ((DialogInterface) obj).getClass();
                if (!z15 || bVar3.f43482g == 0) {
                    androidx.fragment.app.m activity = bVar3.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                } else {
                    bVar3.u6().F4(bVar3.f43482g);
                }
                return Unit.INSTANCE;
            case 14:
                h82.r rVar = (h82.r) obj3;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i16 = qn0.i.f145805f;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    rVar.t(R.string.no_data_label, mVar7, 0);
                    rVar.q(gl1.y.Q(mVar7, z15 ? R.string.msg_health_status_help_no_data_1_jpn : R.string.msg_health_status_help_no_data_1), mVar7, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                r72.n.e(z15, (r72.m) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                r72.n.d(z15, (r72.m) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 17:
                u0.a.b bVar4 = (u0.a.b) obj3;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    int i17 = rg0.i.a.f152562a[bVar4.ordinal()];
                    if (i17 == 1) {
                        mVar8.C(746218211);
                        String strQ3 = gl1.y.Q(mVar8, R.string.connection_request_sent);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        mh.c(strQ3, null, com.nimbusds.jose.shaded.gson.internal.a.x(mVar8), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97933j, mVar8, 0, 0, 131066);
                        mVar8.f();
                    } else if (i17 != 2) {
                        mVar8.C(746766074);
                        mVar8.f();
                    } else {
                        mVar8.C(746527312);
                        String strQ4 = gl1.y.Q(mVar8, R.string.wifi_added);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        mh.c(strQ4, null, com.nimbusds.jose.shaded.gson.internal.a.x(mVar8), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97933j, mVar8, 0, 0, 131066);
                        mVar8.f();
                    }
                    if (z15) {
                        mVar8.C(746817658);
                        s62.a.f157643a.getClass();
                        i7.a(u4.p.b(e1.a(t62.b.f162798a), mVar8), null, null, fb1.c.g(d92.b.f58623a, mVar8), mVar8, 56, 4);
                        mVar8.f();
                    } else {
                        mVar8.C(747034844);
                        mVar8.f();
                    }
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 18:
                mm1.f fVar = (mm1.f) obj3;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    mm1.e overallStats = fVar != null ? fVar.getOverallStats() : null;
                    if (overallStats != null) {
                        mVar9.C(1093852034);
                        y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                        l72.x0.f111346a.e(null, z3.f.c(2004206952, new h21.m(overallStats, new b10.d((Context) mVar9.A(y3Var)), new b10.b((Context) mVar9.A(y3Var)), this.f11692b, 13), mVar9), mVar9, (l72.x0.f111348c << 6) | 48, 1);
                        mVar9.f();
                    } else {
                        mVar9.C(1095178214);
                        mVar9.f();
                    }
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 19:
                TrainingReadinessFeedBackPhraseTest trainingReadinessFeedBackPhraseTest = (TrainingReadinessFeedBackPhraseTest) obj3;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                int i18 = TrainingReadinessFeedBackPhraseTest.f46487a;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    h4.r rVarB = a2.b(x2.d(h4.r.S, 1.0f), a2.a(mVar10), true);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA2 = c2.y.a(kVar2, h4.d.a.f81536n, mVar10, 0);
                    int iHashCode2 = Long.hashCode(mVar10.getU());
                    i2 i2VarX2 = mVar10.x();
                    h4.r rVarC3 = h4.k.c(rVarB, mVar10);
                    h5.g.V.getClass();
                    e0.a aVar12 = h5.g.a.f81805b;
                    if (mVar10.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar10.z();
                    if (mVar10.getT()) {
                        mVar10.M(aVar12);
                    } else {
                        mVar10.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar10);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar10);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar10.getT() || !p005kotlin.jvm.internal.s.g(mVar10.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar10, iHashCode2, bVar5);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar10);
                    b0 b0Var2 = b0.f22601a;
                    if (z15) {
                        mVar10.C(-992381976);
                        w13.c cVar = oz1.r.f134610c;
                        int f168272d = cVar.getF134973e();
                        for (int i19 = 0; i19 < f168272d; i19++) {
                            oz1.r rVar2 = (oz1.r) cVar.get(i19);
                            trainingReadinessFeedBackPhraseTest.da(rVar2.name(), gl1.y.Q(mVar10, rVar2.f134611a), mVar10, com.garmin.android.apps.connectmobile.d.$stable << 6);
                        }
                        mVar10.f();
                    } else {
                        mVar10.C(-992159737);
                        w13.c cVar2 = oz1.s.f134615g;
                        int f168272d2 = cVar2.getF134973e();
                        for (int i24 = 0; i24 < f168272d2; i24++) {
                            oz1.s sVar = (oz1.s) cVar2.get(i24);
                            trainingReadinessFeedBackPhraseTest.da(sVar.name(), gl1.y.Q(mVar10, sVar.f134618c), mVar10, com.garmin.android.apps.connectmobile.d.$stable << 6);
                        }
                        mVar10.f();
                    }
                    mVar10.y();
                    x1 x1Var11 = p3.n.f135158a;
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 20:
                t82.a aVar13 = (t82.a) obj3;
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    if (z15) {
                        mVar11.C(-1550214747);
                        d92.b.f58623a.getClass();
                        jD = d92.b.a(mVar11).k().b();
                    } else {
                        mVar11.C(-1550213817);
                        d92.b.f58623a.getClass();
                        jD = d92.b.a(mVar11).k().d();
                    }
                    mVar11.f();
                    long j14 = jD;
                    d92.b.f58623a.getClass();
                    if (z15) {
                        d92.b.f58624b.getClass();
                        x0VarE = d92.c.e(j92.f.f97932i);
                    } else {
                        d92.b.f58624b.getClass();
                        x0VarE = j92.f.f97932i;
                    }
                    x0 x0Var = x0VarE;
                    h4.r.a aVar14 = h4.r.S;
                    boolean zB = mVar11.B(aVar13);
                    Object objQ5 = mVar11.q();
                    if (zB) {
                        objQ5 = new s70.b0(aVar13, 22);
                        mVar11.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new s70.b0(aVar13, 22);
                            mVar11.K(objQ5);
                        }
                    }
                    h4.r rVarC4 = p5.v.c((e23.l) objQ5, aVar14, false);
                    String str2 = aVar13.f163158a;
                    d6.h.f57752b.getClass();
                    mh.c(str2, rVarC4, j14, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0Var, mVar11, 0, 0, 130040);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 21:
                l90.k kVar3 = (l90.k) obj3;
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    if (!z15 || kVar3.f111577a == -1) {
                        mVar12.C(-488170418);
                        mVar12.f();
                    } else {
                        mVar12.C(-488627947);
                        String strValueOf = String.valueOf(kVar3.f111577a);
                        h4.r rVarC5 = o3.c(h4.r.S, "device_unit_id");
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarB = d92.c.b(j92.f.f97931h, mVar12);
                        d6.h.f57752b.getClass();
                        mh.c(strValueOf, rVarC5, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar12, 48, 0, 130044);
                        mVar12.f();
                    }
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 22:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.y yVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.y) obj3;
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar15 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                dialogInterface.getClass();
                if (z15) {
                    yVar.E6().D6(null);
                    yVar.E6().G6(ny1.e.TIME);
                } else {
                    yVar.E6().C6(null);
                    yVar.E6().G6(ny1.e.DISTANCE);
                }
                dialogInterface.dismiss();
                return Unit.INSTANCE;
            default:
                PendingActivitiesActivity pendingActivitiesActivity = (PendingActivitiesActivity) obj3;
                String str3 = (String) obj;
                b63.o oVar = (b63.o) obj2;
                PendingActivitiesActivity.a aVar16 = PendingActivitiesActivity.f39793d;
                str3.getClass();
                oVar.getClass();
                if (!z15) {
                    h0 h0Var = (h0) pendingActivitiesActivity.f39794a.getValue();
                    h0Var.getClass();
                    ge1.b.T(v1.a(h0Var), null, null, new c0(h0Var, oVar, str3, null), 3);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f(Object obj, boolean z14, int i14, int i15) {
        this.f11691a = i15;
        this.f11693c = obj;
        this.f11692b = z14;
    }

    public /* synthetic */ f(boolean z14, e23.l lVar, int i14, int i15) {
        this.f11691a = i15;
        this.f11692b = z14;
        this.f11693c = lVar;
    }

    public /* synthetic */ f(boolean z14, Object obj, int i14) {
        this.f11691a = i14;
        this.f11692b = z14;
        this.f11693c = obj;
    }
}
