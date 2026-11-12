package b21;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.AddBloodPressureActivity;
import com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.BloodPressureRemindersActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;
import com.garmin.customermanagementlib.CustomerManagementException;
import com.garmin.feature.garminpay.providers.felica.exception.server.FNServerIncorrectResponseException;
import com.google.android.gms.stats.CodePackage;
import i3.fe;
import i3.mc;
import java.sql.Date;
import java.util.List;
import java.util.Set;
import lc.m0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a5 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f14499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f14500h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f14501i;

    public /* synthetic */ a5(ba1.d dVar, q91.g gVar, fe feVar, lc.m0 m0Var, Activity activity, Context context, p3.p1 p1Var, c.q qVar) {
        this.f14493a = 12;
        this.f14495c = dVar;
        this.f14496d = gVar;
        this.f14497e = feVar;
        this.f14494b = m0Var;
        this.f14498f = activity;
        this.f14499g = context;
        this.f14500h = p1Var;
        this.f14501i = qVar;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:105:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:107:0x04db  */
    /* JADX WARN: Code duplicated, block: B:108:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:111:0x0503  */
    /* JADX WARN: Code duplicated, block: B:116:0x0511  */
    /* JADX WARN: Code duplicated, block: B:128:0x05a6  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x016a, code lost:
    
        if (p005kotlin.jvm.internal.s.g(r1 != null ? r1.getResultCode() : null, "0033") != false) goto L16;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // e23.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        d11.h hVarY4;
        q4.f fVar;
        Unit unit;
        fj2.a aVar;
        SpinnerDialogView.b bVar;
        com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.c cVar;
        int i14;
        Bundle bundle;
        yw.e eVar;
        int i15 = this.f14493a;
        int i16 = 25;
        int i17 = 10;
        int i18 = 2;
        final byte b14 = 0;
        Object obj2 = this.f14501i;
        Object obj3 = this.f14500h;
        Object obj4 = this.f14499g;
        Object obj5 = this.f14498f;
        Object obj6 = this.f14494b;
        Object obj7 = this.f14497e;
        Object obj8 = this.f14496d;
        Object obj9 = this.f14495c;
        switch (i15) {
            case 0:
                m21.b bVar2 = (m21.b) obj9;
                m21.g gVar = (m21.g) obj8;
                m21.v vVar = (m21.v) obj7;
                l4.m mVar = (l4.m) obj5;
                f11.m mVar2 = (f11.m) obj4;
                i21.d dVar = (i21.d) obj3;
                b63.u uVar = (b63.u) obj2;
                lc.m0 m0Var = (lc.m0) obj6;
                b11.a aVar2 = (b11.a) obj;
                aVar2.getClass();
                if (bVar2 instanceof m21.b.e) {
                    ge1.b.T(androidx.lifecycle.v1.a(gVar), null, null, new m21.h(gVar, aVar2, new ao1.i(19, dVar, uVar), null), 3);
                } else if (bVar2 instanceof m21.b.a) {
                    e5.b(m0Var, p13.w.c(aVar2.H1()));
                    gVar.H4(aVar2);
                } else if (bVar2 instanceof m21.b.C2206b) {
                    vVar.y4(aVar2);
                    gVar.I4(aVar2, mVar.f14930e);
                } else {
                    if (!(bVar2 instanceof m21.b.c)) {
                        lc.u0.r();
                        return null;
                    }
                    if (mVar2 != null && (hVarY4 = f11.m.y4(mVar2, aVar2)) != null) {
                        gVar.K4(hVarY4);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                ca0.t1 t1Var = (ca0.t1) obj9;
                e23.a aVar3 = (e23.a) obj8;
                lc.m0 m0Var2 = (lc.m0) obj6;
                ca0.o1 o1Var = (ca0.o1) obj7;
                ca0.s1 s1Var = (ca0.s1) obj5;
                e23.a aVar4 = (e23.a) obj4;
                lc.k0 k0Var = (lc.k0) obj;
                k0Var.getClass();
                ca0.d2 d2Var = new ca0.d2(16);
                ca0.d2 d2Var2 = new ca0.d2(i17);
                ca0.d2 d2Var3 = new ca0.d2(14);
                ca0.d2 d2Var4 = new ca0.d2(15);
                z3.e eVar2 = new z3.e(1722761370, true, new ca0.w2(t1Var, aVar3, m0Var2, o1Var, s1Var));
                p13.k0 k0Var2 = p13.k0.f134949a;
                k0Var2.getClass();
                p13.j0 j0Var = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                nc.n.a(k0Var, t0Var.b(ca0.c4.j.class), k0Var2, j0Var, d2Var, d2Var2, d2Var3, d2Var4, eVar2);
                nc.n.a(k0Var, t0Var.b(ca0.c4.l.class), k0Var2, j0Var, null, null, null, null, new z3.e(-1301941693, true, new ca0.v2(m0Var2, aVar4, o1Var, aVar3, s1Var, 1)));
                nc.n.a(k0Var, t0Var.b(ca0.c4.k.class), k0Var2, j0Var, null, null, null, null, new z3.e(-1377780254, true, new ca0.e((e23.l) obj3, (e23.a) obj2, m0Var2, aVar4, o1Var, aVar3, s1Var)));
                nc.n.a(k0Var, t0Var.b(ca0.c4.g.class), k0Var2, j0Var, null, null, null, null, new z3.e(-1453618815, true, new ca0.v2(m0Var2, aVar4, o1Var, aVar3, s1Var, 2)));
                ca0.c4.Companion.getClass();
                nc.n.a(k0Var, t0Var.b(ca0.c4.h.class), ca0.c4.f.a(), j0Var, null, null, null, null, new z3.e(-1529457376, true, new ca0.v2(m0Var2, aVar4, o1Var, aVar3, s1Var, 3)));
                nc.n.a(k0Var, t0Var.b(ca0.c4.p.class), ca0.c4.f.a(), j0Var, null, null, null, null, new z3.e(-1605295937, true, new ca0.v2(m0Var2, aVar4, o1Var, aVar3, s1Var, 4)));
                nc.n.a(k0Var, t0Var.b(ca0.c4.e.class), k0Var2, j0Var, null, null, null, null, new z3.e(-1681134498, true, new ca0.v2(m0Var2, aVar4, o1Var, aVar3, s1Var, 5)));
                nc.n.a(k0Var, t0Var.b(ca0.c4.d.class), k0Var2, j0Var, null, null, null, null, new z3.e(-1756973059, true, new ca0.v2(m0Var2, aVar4, o1Var, aVar3, s1Var, 6)));
                ca0.i0.Companion.getClass();
                nc.n.a(k0Var, t0Var.b(ca0.c4.a.class), ca0.i0.m.a(), j0Var, null, null, null, null, new z3.e(-1832811620, true, new ca0.v2(m0Var2, aVar4, o1Var, aVar3, s1Var, 7)));
                nc.n.a(k0Var, t0Var.b(ca0.c4.q.class), ca0.i0.m.a(), j0Var, null, null, null, null, new z3.e(-1908650181, true, new ca0.v2(m0Var2, aVar4, o1Var, aVar3, s1Var, 8)));
                nc.n.a(k0Var, t0Var.b(ca0.c4.o.class), k0Var2, j0Var, null, null, null, null, new z3.e(404426413, true, new ca0.v2(aVar3, m0Var2, aVar4, o1Var, s1Var, 9)));
                nc.n.a(k0Var, t0Var.b(ca0.c4.b.class), k0Var2, j0Var, null, null, null, null, new z3.e(328587852, true, new ca0.v2(aVar3, m0Var2, aVar4, o1Var, s1Var, 10)));
                nc.n.a(k0Var, t0Var.b(ca0.c4.c.class), k0Var2, j0Var, null, null, null, null, new z3.e(252749291, true, new m(m0Var2, 6)));
                nc.n.a(k0Var, t0Var.b(ca0.c4.n.class), k0Var2, j0Var, null, null, null, null, new z3.e(176910730, true, new ca0.v2(aVar3, aVar4, m0Var2, o1Var, s1Var)));
                nc.n.a(k0Var, t0Var.b(ca0.c4.i.class), ca0.c4.f.a(), j0Var, null, null, null, null, new z3.e(101072169, true, new ca0.v2(m0Var2, aVar4, o1Var, aVar3, s1Var, 0)));
                nc.n.a(k0Var, t0Var.b(ca0.c4.m.class), k0Var2, j0Var, new ca0.d2(9), new ca0.d2(11), new ca0.d2(12), new ca0.d2(13), new z3.e(25233608, true, new ca0.w2(t1Var, o1Var, aVar3, s1Var, m0Var2)));
                return Unit.INSTANCE;
            case 2:
                km1.c cVar2 = (km1.c) obj9;
                Context context = (Context) obj8;
                sm1.s sVar = (sm1.s) obj7;
                DateTime dateTime = (DateTime) obj5;
                e23.a aVar5 = (e23.a) obj4;
                o53.b0 b0Var = (o53.b0) obj3;
                p3.p1 p1Var = (p3.p1) obj2;
                mc mcVar = (mc) obj6;
                km1.c0 c0Var = (km1.c0) obj;
                c0Var.getClass();
                if (cVar2 != null && (context instanceof androidx.fragment.app.m)) {
                    if (c0Var == km1.c0.NAPS) {
                        km1.v dailySleep = cVar2.getDailySleep();
                        sVar.f160189i.setValue(dailySleep != null ? km1.v.b(dailySleep, 0L, dateTime.toString("yyyy-MM-dd"), 0, 0L, 0L, null, -5, 8191) : null);
                        aVar5.invoke();
                    } else {
                        p1Var.setValue(c0Var);
                        ge1.b.T(b0Var, null, null, new fn1.c.a(mcVar, null), 3);
                    }
                }
                return Unit.INSTANCE;
            case 3:
                e23.a aVar6 = (e23.a) obj9;
                e23.a aVar7 = (e23.a) obj8;
                x01.e eVar3 = (x01.e) obj7;
                e23.a aVar8 = (e23.a) obj5;
                e23.a aVar9 = (e23.a) obj4;
                e23.p pVar = (e23.p) obj3;
                Context context2 = (Context) obj2;
                x01.a aVar10 = (x01.a) obj6;
                l72.i3 i3Var = (l72.i3) obj;
                i3Var.getClass();
                String str = i3Var.f111063a;
                switch (str.hashCode()) {
                    case -2077709277:
                        if (str.equals("SETTINGS")) {
                            aVar6.invoke();
                        }
                        break;
                    case -777472298:
                        if (str.equals("NUTRITION_SETUP")) {
                            if (eVar3.f188256e) {
                                aVar8.invoke();
                            } else {
                                aVar9.invoke();
                            }
                        }
                        break;
                    case 2213697:
                        if (str.equals("HELP")) {
                            aVar7.invoke();
                        }
                        break;
                    case 113384961:
                        if (str.equals("NUTRITION_PLUS")) {
                            x01.f fVar2 = eVar3.f188255d;
                            x01.f fVar3 = x01.f.ACTIVE;
                            if (fVar2 == fVar3) {
                                pVar.invoke(g22.l.e(b63.u.INSTANCE), null);
                            } else {
                                context2.getClass();
                                gp.f fVar4 = eVar3.f188254c == fVar3 ? new gp.f(12, context2, aVar10) : null;
                                if (fVar4 != null) {
                                    fVar4.invoke();
                                }
                            }
                        }
                        break;
                }
                return Unit.INSTANCE;
            case 4:
                q4.k kVar = (q4.k) obj7;
                p3.x3 x3Var = (p3.x3) obj5;
                p3.x3 x3Var2 = (p3.x3) obj4;
                p3.x3 x3Var3 = (p3.x3) obj3;
                q4.k kVar2 = (q4.k) obj2;
                i3.p1 p1Var2 = (i3.p1) obj6;
                q4.f fVar5 = (q4.f) obj;
                long j8 = ((o4.d0) ((p3.x3) obj9).getF182175a()).f128833a;
                long j14 = ((o4.d0) ((p3.x3) obj8).getF182175a()).f128833a;
                float fS0 = fVar5.s0(i3.s1.f89586c);
                float f14 = kVar.f142562a;
                float f15 = f14 / 2.0f;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar5.b() >> 32));
                if (o4.d0.d(j8, j14)) {
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                    n4.g.a aVar11 = n4.g.f123559b;
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fS0)) << 32) | (((long) Float.floatToRawIntBits(fS0)) & 4294967295L);
                    n4.a.C2318a c2318a = n4.a.f123535b;
                    fVar = fVar5;
                    q4.f.M0(fVar, j8, 0L, jFloatToRawIntBits, jFloatToRawIntBits2, q4.j.f142560a, 0, 226);
                } else {
                    fVar = fVar5;
                    long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f14)) & 4294967295L) | (((long) Float.floatToRawIntBits(f14)) << 32);
                    n4.c.a aVar12 = n4.c.f123541b;
                    float f16 = fIntBitsToFloat - (2 * f14);
                    long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f16)) & 4294967295L);
                    n4.g.a aVar13 = n4.g.f123559b;
                    float fMax = Math.max(0.0f, fS0 - f14);
                    long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                    n4.a.C2318a c2318a2 = n4.a.f123535b;
                    q4.f.M0(fVar, j8, jFloatToRawIntBits3, jFloatToRawIntBits4, jFloatToRawIntBits5, q4.j.f142560a, 0, 224);
                    float f17 = fIntBitsToFloat - f14;
                    float f18 = fS0 - f15;
                    q4.f.M0(fVar, j14, (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L), (((long) Float.floatToRawIntBits(f17)) << 32) | (((long) Float.floatToRawIntBits(f17)) & 4294967295L), (((long) Float.floatToRawIntBits(f18)) << 32) | (((long) Float.floatToRawIntBits(f18)) & 4294967295L), kVar, 0, 224);
                }
                long j15 = ((o4.d0) x3Var.getF182175a()).f128833a;
                float fFloatValue = ((Number) x3Var2.getF182175a()).floatValue();
                float fFloatValue2 = ((Number) x3Var3.getF182175a()).floatValue();
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() >> 32));
                float fJ = gl.b.J(0.4f, 0.5f, fFloatValue2);
                float fJ2 = gl.b.J(0.7f, 0.5f, fFloatValue2);
                float fJ3 = gl.b.J(0.5f, 0.5f, fFloatValue2);
                float fJ4 = gl.b.J(0.3f, 0.5f, fFloatValue2);
                p1Var2.f89257a.rewind();
                o4.f1 f1Var = p1Var2.f89257a;
                f1Var.a(0.2f * fIntBitsToFloat2, fJ3 * fIntBitsToFloat2);
                f1Var.c(fJ * fIntBitsToFloat2, fJ2 * fIntBitsToFloat2);
                f1Var.c(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fJ4);
                o4.i1 i1Var = p1Var2.f89258b;
                i1Var.b(f1Var);
                o4.f1 f1Var2 = p1Var2.f89259c;
                f1Var2.rewind();
                i1Var.a(0.0f, i1Var.getLength() * fFloatValue, f1Var2);
                q4.f.L(fVar, p1Var2.f89259c, j15, 0.0f, kVar2, 52);
                return Unit.INSTANCE;
            case 5:
                o53.b0 b0Var2 = (o53.b0) obj9;
                kl0.d dVar2 = (kl0.d) obj8;
                il0.a aVar14 = (il0.a) obj7;
                p3.p1 p1Var3 = (p3.p1) obj5;
                fe feVar = (fe) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                Context context3 = (Context) obj6;
                if (((Boolean) obj).booleanValue()) {
                    kl0.b.c(dVar2, aVar14, b0Var2, p1Var3, feVar, str2, str3, context3);
                } else {
                    ge1.b.T(b0Var2, null, null, new kl0.b.d(feVar, str3, context3, null), 3);
                }
                return Unit.INSTANCE;
            case 6:
                nj2.a aVar15 = (nj2.a) obj9;
                String str4 = (String) obj8;
                p3.x3 x3Var4 = (p3.x3) obj7;
                lc.y yVar = (lc.y) obj5;
                String str5 = (String) obj4;
                p3.p1 p1Var4 = (p3.p1) obj3;
                p3.p1 p1Var5 = (p3.p1) obj2;
                f4.u uVar2 = (f4.u) obj6;
                nj2.a.c cVar3 = (nj2.a.c) obj;
                if (cVar3 instanceof nj2.a.c.b) {
                    a11.p pVar2 = new a11.p((Object) x3Var4, (Object) aVar15, (Object) yVar, (Object) str5, p1Var4, p1Var5, (Object) uVar2, 3);
                    aVar15.getClass();
                    aVar15.G4().debug("saveAddressChanges");
                    p3.c2 c2Var = aVar15.f126252d;
                    Boolean bool = Boolean.TRUE;
                    c2Var.setValue(bool);
                    gj2.a aVar16 = aVar15.f126254f;
                    gj2.d dVar3 = aVar15.f126255g;
                    if (aVar16 == null || dVar3 == null) {
                        unit = null;
                    } else {
                        if (str4 != null) {
                            aVar15.G4().debug("updateAddressWithPhoneNumber");
                            c2Var.setValue(bool);
                            aVar = (fj2.a) ge1.b.W(t13.h.f161748a, new nj2.s(aVar15, str4, aVar16, dVar3, null));
                            if (aVar == null) {
                                aVar15.G4().debug("addAddressWithPhoneNumber");
                                c2Var.setValue(bool);
                                aVar = (fj2.a) ge1.b.W(t13.h.f161748a, new nj2.b(aVar15, aVar16, dVar3, null));
                            }
                        } else {
                            aVar15.G4().debug("addAddressWithPhoneNumber");
                            c2Var.setValue(bool);
                            aVar = (fj2.a) ge1.b.W(t13.h.f161748a, new nj2.b(aVar15, aVar16, dVar3, null));
                        }
                        cj2.a.f27739a.getClass();
                        cj2.a.f27741c.set(aVar != null ? aVar.getAddressId() : null);
                        pVar2.invoke();
                        unit = Unit.INSTANCE;
                    }
                    if (unit == null) {
                        aVar15.I4(new CustomerManagementException("Could not save address changes", cj2.b.MISSING_DATA));
                    }
                    c2Var.setValue(Boolean.FALSE);
                } else {
                    if (!(cVar3 instanceof nj2.a.c.C2429a)) {
                        lc.u0.r();
                        return null;
                    }
                    p1Var5.setValue(Boolean.TRUE);
                    List<fj2.g> list = ((nj2.a.c.C2429a) cVar3).f126291a;
                    if (list != null) {
                        for (fj2.g gVar2 : list) {
                            nj2.a.b bVarD = gVar2.d();
                            if (bVarD != null) {
                                aVar15.K4(gVar2, new lj2.g(uVar2, bVarD, b14));
                            }
                        }
                    }
                    p3.c2 c2Var2 = aVar15.f126252d;
                    Boolean bool2 = Boolean.FALSE;
                    c2Var2.setValue(bool2);
                    p1Var4.setValue(bool2);
                }
                return Unit.INSTANCE;
            case 7:
                x52.f fVar6 = (x52.f) obj9;
                m52.k kVar3 = (m52.k) obj8;
                p62.r rVar = (p62.r) obj7;
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var2 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) obj5;
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b bVar3 = (com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b) obj4;
                e23.a aVar17 = (e23.a) obj3;
                e23.a aVar18 = (e23.a) obj2;
                e23.l lVar = (e23.l) obj6;
                SpinnerDialogView spinnerDialogView = (SpinnerDialogView) obj;
                spinnerDialogView.getClass();
                if (fVar6 == x52.f.f189079h || fVar6 == x52.f.f189081j) {
                    if (k52.g.e(kVar3) || ((Set) k52.g.f102953b.getValue()).contains(kVar3)) {
                        bVar = null;
                        spinnerDialogView.setSubtitle(null);
                        spinnerDialogView.setEnabled(false);
                    }
                    if (fVar6 == x52.f.f189090t) {
                        spinnerDialogView.setOnSpinnerListRowClickListener(bVar);
                        spinnerDialogView.setOnClickListener(new aq.q1(aVar17, 16));
                    } else if (p13.u.m0(new x52.f[]{x52.f.f189093x, x52.f.f189094y}).contains(fVar6)) {
                        spinnerDialogView.setOnSpinnerListRowClickListener(bVar);
                        spinnerDialogView.setOnClickListener(new aq.q1(aVar18, 17));
                    } else {
                        spinnerDialogView.setOnClickListener(new y52.e(spinnerDialogView, b14));
                        spinnerDialogView.setOnSpinnerListRowClickListener(rVar.c(j0Var2));
                    }
                    spinnerDialogView.setSubtitle(rVar.a(j0Var2));
                    if (bVar3 instanceof com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.c) {
                        cVar = (com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.c) bVar3;
                        if (cVar.f49630f || !cVar.f49631g) {
                            i14 = R.string.msg_pool_units_updated_send_off_time_alert;
                        } else {
                            i14 = R.string.msg_pool_units_updated_send_off_time_and_target_pace_alert;
                        }
                        spinnerDialogView.setDescriptionMessage(spinnerDialogView.getContext().getString(i14));
                        spinnerDialogView.setDescriptionMessageSpinnerIndex(2);
                    }
                    Context context4 = spinnerDialogView.getContext();
                    context4.getClass();
                    spinnerDialogView.setOnSpinnerDialogButtonClickListener(rVar.e(context4, j0Var2));
                    spinnerDialogView.setOnSpinnerValuesChangeListener(new a73.f(rVar, i16, j0Var2, lVar));
                    return Unit.INSTANCE;
                }
                if (k52.g.e(kVar3) || ((Set) k52.g.f102953b.getValue()).contains(kVar3)) {
                    spinnerDialogView.setEnabled(true);
                }
                bVar = null;
                if (fVar6 == x52.f.f189090t) {
                    spinnerDialogView.setOnSpinnerListRowClickListener(bVar);
                    spinnerDialogView.setOnClickListener(new aq.q1(aVar17, 16));
                } else if (p13.u.m0(new x52.f[]{x52.f.f189093x, x52.f.f189094y}).contains(fVar6)) {
                    spinnerDialogView.setOnSpinnerListRowClickListener(bVar);
                    spinnerDialogView.setOnClickListener(new aq.q1(aVar18, 17));
                } else {
                    spinnerDialogView.setOnClickListener(new y52.e(spinnerDialogView, b14));
                    spinnerDialogView.setOnSpinnerListRowClickListener(rVar.c(j0Var2));
                }
                spinnerDialogView.setSubtitle(rVar.a(j0Var2));
                if (bVar3 instanceof com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.c) {
                    cVar = (com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.c) bVar3;
                    if (cVar.f49630f) {
                        i14 = R.string.msg_pool_units_updated_send_off_time_alert;
                    } else {
                        i14 = R.string.msg_pool_units_updated_send_off_time_alert;
                    }
                    spinnerDialogView.setDescriptionMessage(spinnerDialogView.getContext().getString(i14));
                    spinnerDialogView.setDescriptionMessageSpinnerIndex(2);
                }
                Context context5 = spinnerDialogView.getContext();
                context5.getClass();
                spinnerDialogView.setOnSpinnerDialogButtonClickListener(rVar.e(context5, j0Var2));
                spinnerDialogView.setOnSpinnerValuesChangeListener(new a73.f(rVar, i16, j0Var2, lVar));
                return Unit.INSTANCE;
            case 8:
                Context context6 = (Context) obj8;
                c.q qVar = (c.q) obj7;
                o53.b0 b0Var3 = (o53.b0) obj5;
                qw.g gVar3 = (qw.g) obj4;
                o82.g gVar4 = (o82.g) obj3;
                p3.x3 x3Var5 = (p3.x3) obj2;
                mc mcVar2 = (mc) obj6;
                l72.i3 i3Var2 = (l72.i3) obj;
                i3Var2.getClass();
                o82.a aVarB = ((n82.f) obj9).b();
                DateTime dateTimeAtStartOfDay = g22.l.h(aVarB.f130843a).toDateTimeAtStartOfDay();
                DateTime dateTimeAtStartOfDay2 = g22.l.h(aVarB.f130844b).toDateTimeAtStartOfDay();
                String str6 = i3Var2.f111063a;
                switch (str6.hashCode()) {
                    case -1344349317:
                        if (str6.equals("HELP_DAILY")) {
                            if (gVar4 == o82.g.f130850c) {
                                ww.f.a aVar19 = ww.f.f187506i;
                                pw.a aVar20 = (pw.a) p13.h0.d0((i53.c) x3Var5.getF182175a());
                                aVar19.getClass();
                                if (aVar20 != null) {
                                    bundle = new Bundle();
                                    bundle.putInt("KEY_MEASUREMENT_TYPE", 1);
                                    bundle.putParcelable("KEY_MEASUREMENT", aVar20);
                                } else {
                                    bundle = null;
                                }
                                HelpActivity.a aVar21 = HelpActivity.f36653a;
                                ro0.l lVar2 = ro0.l.BLOOD_PRESSURE;
                                aVar21.getClass();
                                HelpActivity.a.d(context6, lVar2, "DEFAULT_ACTION", bundle);
                            } else {
                                dateTimeAtStartOfDay.getClass();
                                dateTimeAtStartOfDay2.getClass();
                                iz1.g gVar5 = new iz1.g(context6, 15);
                                gVar3.getClass();
                                ge1.b.T(androidx.lifecycle.v1.a(gVar3), null, null, new qw.i(gVar3, dateTimeAtStartOfDay, dateTimeAtStartOfDay2, gVar5, null), 3);
                            }
                        }
                        break;
                    case -924344360:
                        if (str6.equals("DELETE_READING")) {
                            if (((i53.c) x3Var5.getF182175a()).size() >= 2) {
                                ge1.b.T(b0Var3, null, null, new qw.f.a(mcVar2, null), 3);
                            } else {
                                gVar3.y4((pw.a) p13.h0.b0((i53.c) x3Var5.getF182175a()));
                            }
                        }
                        break;
                    case -405184991:
                        if (str6.equals(CodePackage.REMINDERS)) {
                            BloodPressureRemindersActivity.f30927d.getClass();
                            context6.getClass();
                            context6.startActivity(new Intent(context6, (Class<?>) BloodPressureRemindersActivity.class));
                        }
                        break;
                    case 193064110:
                        if (str6.equals("ADD_READING")) {
                            AddBloodPressureActivity.f30909d.getClass();
                            context6.getClass();
                            Intent intent = new Intent(context6, (Class<?>) AddBloodPressureActivity.class);
                            if (dateTimeAtStartOfDay != null) {
                                intent.putExtra("extra.date.time", dateTimeAtStartOfDay.getMillis());
                            }
                            qVar.a(intent, null);
                        }
                        break;
                    case 695562695:
                        if (str6.equals("EXPORT_PDF")) {
                            int i19 = qw.f.g.f148244a[gVar4.ordinal()];
                            if (i19 == 1) {
                                eVar = yw.e.Daily;
                            } else if (i19 == 2) {
                                eVar = yw.e.SevenDays;
                            } else if (i19 != 3) {
                                eVar = i19 != 4 ? null : yw.e.Yearly;
                            } else {
                                eVar = yw.e.FourWeeks;
                            }
                            if (eVar != null) {
                                dateTimeAtStartOfDay.getClass();
                                yw.e eVar4 = yw.e.Daily;
                                DateTime dateTime2 = eVar == eVar4 ? null : dateTimeAtStartOfDay2;
                                String string = context6.getString(R.string.lbl_feature_pdf, context6.getString(R.string.lbl_blood_pressure));
                                string.getClass();
                                gVar3.getClass();
                                DateTimeZone dateTimeZone = DateTimeZone.UTC;
                                Date date = new Date(dateTimeAtStartOfDay.withZoneRetainFields(dateTimeZone).getMillis());
                                pa2.a aVarX4 = dateTime2 != null ? qw.g.x4(date, new Date(dateTime2.withZoneRetainFields(dateTimeZone).getMillis()), eVar, string) : qw.g.x4(date, date, eVar4, string);
                                new pa2.b();
                                pa2.b.a(context6, aVarX4);
                            }
                        }
                        break;
                }
                return Unit.INSTANCE;
            case 9:
                zc.d dVar4 = (zc.d) obj9;
                p3.p1 p1Var6 = (p3.p1) obj8;
                c.q qVar2 = (c.q) obj2;
                e23.l lVar3 = (e23.l) obj6;
                e2.f0 f0Var = (e2.f0) obj;
                f0Var.getClass();
                int i24 = 1;
                e2.f0.b(f0Var, "type-dropdown", new z3.e(-393138619, true, new mw0.h(p1Var6, (i53.c) obj7, (rk0.d1) obj5, (e2.i0) obj4, 12)), 2);
                e2.f0.b(f0Var, "type-count-text", new z3.e(-1414546450, true, new o72.b(i16, p1Var6, (rk0.w0) obj3)), 2);
                if (dVar4.d().f196385a instanceof yc.z0.a) {
                    e2.f0.b(f0Var, "error-view", new z3.e(770625098, true, new r22.g(dVar4, i24)), 2);
                } else {
                    e2.f0.f(f0Var, dVar4.b(), new zc.a(new rk0.n(i18), dVar4), new z3.e(1563013112, true, new qw.b(dVar4, p1Var6, qVar2, false, lVar3, 2)), 4);
                }
                return Unit.INSTANCE;
            case 10:
                f2.j0 j0Var3 = (f2.j0) obj;
                j0Var3.getClass();
                List list2 = (List) ((p3.x3) obj9).getF182175a();
                j0Var3.g(list2.size(), new t70.s0.h(new t21.c(b14, 27), list2), new t70.s0.i(new t21.e(i17), list2), new t70.s0.j(list2), new z3.e(-1942245546, true, new t70.s0.k(list2, (t70.x0) obj8, (o53.b0) obj7, (mc) obj5, (i02.m) obj4, (p3.x3) obj3, (p3.x3) obj2, (Context) obj6)));
                return Unit.INSTANCE;
            case 11:
                c83.a0 a0Var = (c83.a0) obj9;
                tn2.r0 r0Var = (tn2.r0) obj8;
                String str7 = (String) obj7;
                String str8 = (String) obj5;
                pn2.p pVar3 = (pn2.p) obj4;
                String str9 = (String) obj3;
                String str10 = (String) obj2;
                e23.l lVar4 = (e23.l) obj6;
                Throwable th3 = (Throwable) obj;
                Logger logger = tn2.r0.f165631n;
                th3.getClass();
                a0Var.getClass();
                tn2.i iVar = new tn2.i(a0Var);
                if (!(th3 instanceof FNServerIncorrectResponseException)) {
                    if (!iVar.e()) {
                        rn2.s sVarA = iVar.a();
                        break;
                    }
                    pn2.n nVar = r0Var.f165637f;
                    String xMfiVersion = pVar3.getHeader().getXMfiVersion();
                    xMfiVersion.getClass();
                    str9.getClass();
                    qn2.v vVarA = nVar.a(str7, str8, xMfiVersion, str9);
                    pn2.o oVar = r0Var.f165638g;
                    String resultConfirmId = ((rn2.d) pVar3.d()).getResultConfirmId();
                    oVar.getClass();
                    resultConfirmId.getClass();
                    pn2.m mVar3 = new pn2.m(vVarA, new rn2.e(resultConfirmId));
                    mn2.b bVar4 = r0Var.f165633b;
                    String strValueOf = String.valueOf(r0Var.f165632a.f165682c);
                    pn2.a.f138690a.getClass();
                    return new z03.j(mn2.j.b(bVar4, strValueOf, str10, pn2.a.e().f138762b, mVar3, lVar4)).d(q03.b.g(th3));
                }
                return q03.b.g(th3);
            default:
                final ba1.d dVar5 = (ba1.d) obj9;
                final fe feVar2 = (fe) obj7;
                final lc.m0 m0Var3 = (lc.m0) obj6;
                Activity activity = (Activity) obj5;
                Context context7 = (Context) obj4;
                p3.x3 x3Var6 = (p3.x3) obj3;
                c.q qVar3 = (c.q) obj2;
                lc.k0 k0Var3 = (lc.k0) obj;
                k0Var3.getClass();
                z3.e eVar5 = new z3.e(289968479, true, new ca0.e(dVar5, (q91.g) obj8, feVar2, m0Var3, activity, context7, x3Var6));
                p13.k0 k0Var4 = p13.k0.f134949a;
                k0Var4.getClass();
                p13.j0 j0Var4 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                nc.n.a(k0Var3, t0Var2.b(w91.y.f.class), k0Var4, j0Var4, null, null, null, null, eVar5);
                nc.n.a(k0Var3, t0Var2.b(w91.y.h.class), k0Var4, j0Var4, null, null, null, null, new z3.e(1243184328, true, new a6.c(dVar5, 18)));
                nc.n.a(k0Var3, t0Var2.b(w91.y.d.class), k0Var4, j0Var4, null, null, null, null, new z3.e(1376771239, true, new qw.b(feVar2, dVar5, m0Var3, x3Var6, 13)));
                e23.r rVar2 = new e23.r() { // from class: w91.g
                    /* JADX WARN: Code duplicated, block: B:13:0x005c  */
                    /* JADX WARN: Code duplicated, block: B:18:0x0077  */
                    /* JADX WARN: Code duplicated, block: B:23:0x009a  */
                    /* JADX WARN: Code duplicated, block: B:28:0x00bf  */
                    /* JADX WARN: Code duplicated, block: B:35:0x0118  */
                    /* JADX WARN: Code duplicated, block: B:40:0x0138  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0041  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.r
                    public final Object invoke(Object obj10, Object obj11, Object obj12, Object obj13) {
                        int i25 = b14;
                        p3.m.a aVar22 = p3.m.f135153a;
                        m0 m0Var4 = m0Var3;
                        ba1.d dVar6 = dVar5;
                        r1.l lVar5 = (r1.l) obj10;
                        switch (i25) {
                            case 0:
                                p3.m mVar4 = (p3.m) obj12;
                                ((Integer) obj13).getClass();
                                lVar5.getClass();
                                ((lc.v) obj11).getClass();
                                x1 x1Var = p3.n.f135158a;
                                aa1.b bVar5 = (aa1.b) s9.c.c(dVar6.f16997y, mVar4).getF182175a();
                                b.u uVar3 = (b.u) mVar4.A(g02.d.f74342a);
                                boolean zR = mVar4.r(uVar3);
                                Object objQ = mVar4.q();
                                if (zR) {
                                    objQ = new n(uVar3);
                                    mVar4.K(objQ);
                                } else {
                                    aVar22.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new n(uVar3);
                                        mVar4.K(objQ);
                                    }
                                }
                                k23.g gVar6 = (k23.g) objQ;
                                boolean zR2 = mVar4.r(dVar6) | mVar4.r(m0Var4);
                                Object objQ2 = mVar4.q();
                                if (zR2) {
                                    objQ2 = new a(dVar6, m0Var4, 2);
                                    mVar4.K(objQ2);
                                } else {
                                    aVar22.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new a(dVar6, m0Var4, 2);
                                        mVar4.K(objQ2);
                                    }
                                }
                                e23.a aVar23 = (e23.a) gVar6;
                                x91.l.a(bVar5, feVar2, (e23.l) objQ2, aVar23, mVar4, 48);
                                break;
                            default:
                                p3.m mVar5 = (p3.m) obj12;
                                ((Integer) obj13).getClass();
                                lVar5.getClass();
                                ((lc.v) obj11).getClass();
                                x1 x1Var2 = p3.n.f135158a;
                                aa1.c cVar4 = (aa1.c) s9.c.c(dVar6.A, mVar5).getF182175a();
                                boolean zR3 = mVar5.r(dVar6);
                                Object objQ3 = mVar5.q();
                                if (zR3) {
                                    objQ3 = new o(dVar6);
                                    mVar5.K(objQ3);
                                } else {
                                    aVar22.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new o(dVar6);
                                        mVar5.K(objQ3);
                                    }
                                }
                                k23.g gVar7 = (k23.g) objQ3;
                                boolean zR4 = mVar5.r(dVar6);
                                Object objQ4 = mVar5.q();
                                if (zR4) {
                                    objQ4 = new p(dVar6);
                                    mVar5.K(objQ4);
                                } else {
                                    aVar22.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new p(dVar6);
                                        mVar5.K(objQ4);
                                    }
                                }
                                k23.g gVar8 = (k23.g) objQ4;
                                boolean zR5 = mVar5.r(dVar6);
                                Object objQ5 = mVar5.q();
                                if (zR5) {
                                    objQ5 = new q(dVar6);
                                    mVar5.K(objQ5);
                                } else {
                                    aVar22.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        objQ5 = new q(dVar6);
                                        mVar5.K(objQ5);
                                    }
                                }
                                k23.g gVar9 = (k23.g) objQ5;
                                b.u uVar4 = (b.u) mVar5.A(g02.d.f74342a);
                                boolean zR6 = mVar5.r(uVar4);
                                Object objQ6 = mVar5.q();
                                if (zR6) {
                                    objQ6 = new r(uVar4);
                                    mVar5.K(objQ6);
                                } else {
                                    aVar22.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        objQ6 = new r(uVar4);
                                        mVar5.K(objQ6);
                                    }
                                }
                                k23.g gVar10 = (k23.g) objQ6;
                                e23.l lVar6 = (e23.l) gVar7;
                                e23.l lVar7 = (e23.l) gVar8;
                                boolean zR7 = mVar5.r(dVar6) | mVar5.r(m0Var4);
                                Object objQ7 = mVar5.q();
                                if (zR7) {
                                    objQ7 = new d(dVar6, m0Var4, 3);
                                    mVar5.K(objQ7);
                                } else {
                                    aVar22.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new d(dVar6, m0Var4, 3);
                                        mVar5.K(objQ7);
                                    }
                                }
                                x91.c.a(cVar4, feVar2, lVar6, lVar7, (e23.a) objQ7, (e23.l) gVar9, (e23.a) gVar10, mVar5, 48);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                final int i25 = 1;
                nc.n.a(k0Var3, t0Var2.b(w91.y.e.class), k0Var4, j0Var4, null, null, null, null, new z3.e(1510358150, true, rVar2));
                nc.n.a(k0Var3, t0Var2.b(w91.y.a.class), k0Var4, j0Var4, null, null, null, null, new z3.e(1643945061, true, new e23.r() { // from class: w91.g
                    /* JADX WARN: Code duplicated, block: B:13:0x005c  */
                    /* JADX WARN: Code duplicated, block: B:18:0x0077  */
                    /* JADX WARN: Code duplicated, block: B:23:0x009a  */
                    /* JADX WARN: Code duplicated, block: B:28:0x00bf  */
                    /* JADX WARN: Code duplicated, block: B:35:0x0118  */
                    /* JADX WARN: Code duplicated, block: B:40:0x0138  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0041  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.r
                    public final Object invoke(Object obj10, Object obj11, Object obj12, Object obj13) {
                        int i26 = i25;
                        p3.m.a aVar22 = p3.m.f135153a;
                        m0 m0Var4 = m0Var3;
                        ba1.d dVar6 = dVar5;
                        r1.l lVar5 = (r1.l) obj10;
                        switch (i26) {
                            case 0:
                                p3.m mVar4 = (p3.m) obj12;
                                ((Integer) obj13).getClass();
                                lVar5.getClass();
                                ((lc.v) obj11).getClass();
                                x1 x1Var = p3.n.f135158a;
                                aa1.b bVar5 = (aa1.b) s9.c.c(dVar6.f16997y, mVar4).getF182175a();
                                b.u uVar3 = (b.u) mVar4.A(g02.d.f74342a);
                                boolean zR = mVar4.r(uVar3);
                                Object objQ = mVar4.q();
                                if (zR) {
                                    objQ = new n(uVar3);
                                    mVar4.K(objQ);
                                } else {
                                    aVar22.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new n(uVar3);
                                        mVar4.K(objQ);
                                    }
                                }
                                k23.g gVar6 = (k23.g) objQ;
                                boolean zR2 = mVar4.r(dVar6) | mVar4.r(m0Var4);
                                Object objQ2 = mVar4.q();
                                if (zR2) {
                                    objQ2 = new a(dVar6, m0Var4, 2);
                                    mVar4.K(objQ2);
                                } else {
                                    aVar22.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new a(dVar6, m0Var4, 2);
                                        mVar4.K(objQ2);
                                    }
                                }
                                e23.a aVar23 = (e23.a) gVar6;
                                x91.l.a(bVar5, feVar2, (e23.l) objQ2, aVar23, mVar4, 48);
                                break;
                            default:
                                p3.m mVar5 = (p3.m) obj12;
                                ((Integer) obj13).getClass();
                                lVar5.getClass();
                                ((lc.v) obj11).getClass();
                                x1 x1Var2 = p3.n.f135158a;
                                aa1.c cVar4 = (aa1.c) s9.c.c(dVar6.A, mVar5).getF182175a();
                                boolean zR3 = mVar5.r(dVar6);
                                Object objQ3 = mVar5.q();
                                if (zR3) {
                                    objQ3 = new o(dVar6);
                                    mVar5.K(objQ3);
                                } else {
                                    aVar22.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new o(dVar6);
                                        mVar5.K(objQ3);
                                    }
                                }
                                k23.g gVar7 = (k23.g) objQ3;
                                boolean zR4 = mVar5.r(dVar6);
                                Object objQ4 = mVar5.q();
                                if (zR4) {
                                    objQ4 = new p(dVar6);
                                    mVar5.K(objQ4);
                                } else {
                                    aVar22.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new p(dVar6);
                                        mVar5.K(objQ4);
                                    }
                                }
                                k23.g gVar8 = (k23.g) objQ4;
                                boolean zR5 = mVar5.r(dVar6);
                                Object objQ5 = mVar5.q();
                                if (zR5) {
                                    objQ5 = new q(dVar6);
                                    mVar5.K(objQ5);
                                } else {
                                    aVar22.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        objQ5 = new q(dVar6);
                                        mVar5.K(objQ5);
                                    }
                                }
                                k23.g gVar9 = (k23.g) objQ5;
                                b.u uVar4 = (b.u) mVar5.A(g02.d.f74342a);
                                boolean zR6 = mVar5.r(uVar4);
                                Object objQ6 = mVar5.q();
                                if (zR6) {
                                    objQ6 = new r(uVar4);
                                    mVar5.K(objQ6);
                                } else {
                                    aVar22.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        objQ6 = new r(uVar4);
                                        mVar5.K(objQ6);
                                    }
                                }
                                k23.g gVar10 = (k23.g) objQ6;
                                e23.l lVar6 = (e23.l) gVar7;
                                e23.l lVar7 = (e23.l) gVar8;
                                boolean zR7 = mVar5.r(dVar6) | mVar5.r(m0Var4);
                                Object objQ7 = mVar5.q();
                                if (zR7) {
                                    objQ7 = new d(dVar6, m0Var4, 3);
                                    mVar5.K(objQ7);
                                } else {
                                    aVar22.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new d(dVar6, m0Var4, 3);
                                        mVar5.K(objQ7);
                                    }
                                }
                                x91.c.a(cVar4, feVar2, lVar6, lVar7, (e23.a) objQ7, (e23.l) gVar9, (e23.a) gVar10, mVar5, 48);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                nc.n.a(k0Var3, t0Var2.b(w91.y.g.class), k0Var4, j0Var4, null, null, null, null, new z3.e(1777531972, true, new aa2.q(dVar5, feVar2, m0Var3, context7, qVar3, activity)));
                nc.n.a(k0Var3, t0Var2.b(w91.y.b.class), k0Var4, j0Var4, null, null, null, null, new z3.e(1911118883, true, new v70.a((androidx.lifecycle.u1) dVar5, (Object) feVar2, (Object) context7, (Object) qVar3, m0Var3, 3)));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a5(ca0.t1 t1Var, e23.a aVar, lc.m0 m0Var, ca0.o1 o1Var, ca0.s1 s1Var, e23.a aVar2, e23.l lVar, e23.a aVar3) {
        this.f14493a = 1;
        this.f14495c = t1Var;
        this.f14496d = aVar;
        this.f14494b = m0Var;
        this.f14497e = o1Var;
        this.f14498f = s1Var;
        this.f14499g = aVar2;
        this.f14500h = lVar;
        this.f14501i = aVar3;
    }

    public /* synthetic */ a5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i14) {
        this.f14493a = i14;
        this.f14495c = obj;
        this.f14496d = obj2;
        this.f14497e = obj3;
        this.f14498f = obj4;
        this.f14499g = obj5;
        this.f14500h = obj6;
        this.f14501i = obj7;
        this.f14494b = obj8;
    }
}
