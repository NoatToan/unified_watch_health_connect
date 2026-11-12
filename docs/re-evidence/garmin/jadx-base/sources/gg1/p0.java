package gg1;

import c2.x2;
import c22.s1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.MedicalDeviceUdiActivity;
import java.util.Iterator;
import java.util.Locale;
import l72.p2;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;
import u1.a2;
import u1.d2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MedicalDeviceUdiActivity f77295b;

    public /* synthetic */ p0(MedicalDeviceUdiActivity medicalDeviceUdiActivity, int i14) {
        this.f77294a = i14;
        this.f77295b = medicalDeviceUdiActivity;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:57:0x0208  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        o4.h0 h0Var;
        Object obj3;
        int iIntValue;
        int i14 = this.f77294a;
        MedicalDeviceUdiActivity medicalDeviceUdiActivity = this.f77295b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i16 = MedicalDeviceUdiActivity.f41570a;
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1561180944, new p0(medicalDeviceUdiActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i17 = MedicalDeviceUdiActivity.f41570a;
                if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    d2 d2VarA = a2.a(mVar2);
                    d92.b.f58623a.getClass();
                    if (d92.b.d(mVar2)) {
                        o4.e0.f128843b.getClass();
                        h0Var = new o4.h0(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}, (p005kotlin.jvm.internal.j) null);
                    } else {
                        h0Var = null;
                    }
                    h4.r rVarB = a2.b(x2.d(h4.r.S, 1.0f), d2VarA, true);
                    float f14 = 16;
                    g6.f.a aVar = g6.f.f75994b;
                    h4.r rVarC = c2.l.C(rVarB, 0.0f, f14, 0.0f, 0.0f, 13);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC2 = h4.k.c(rVarC, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar2);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    c2.b0 b0Var = c2.b0.f22601a;
                    p2.f111205a.h("Garmin International, Inc. UDI", "(01)00860009117709(10)1.1.4", null, null, null, false, false, null, null, null, null, mVar2, 54, 0, 2044);
                    String upperCase = c22.b0.b(null).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    com.garmin.android.apps.connectmobile.settings.f.f43414c.getClass();
                    Iterator<T> it = com.garmin.android.apps.connectmobile.settings.f.f43418g.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (d53.u.q(((com.garmin.android.apps.connectmobile.settings.f) next).f43419a, upperCase, true)) {
                                obj3 = next;
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    com.garmin.android.apps.connectmobile.settings.f fVar = (com.garmin.android.apps.connectmobile.settings.f) obj3;
                    int i18 = R.drawable.garmin_udi_1_1_4_v2;
                    if (fVar != null) {
                        String str = fVar.f43420b;
                        int i19 = MedicalDeviceUdiActivity.a.f41571a[fVar.ordinal()];
                        if (i19 == 1 || i19 == 2) {
                            s1.f23251a.getClass();
                            Locale localeA = hb2.h.a(medicalDeviceUdiActivity);
                            localeA.getClass();
                            boolean zQ = d53.u.q(localeA.getLanguage(), str, true);
                            q0 q0Var = new q0(medicalDeviceUdiActivity);
                            String str2 = zQ ? str : "en";
                            int i24 = r0.f77307a[fVar.ordinal()];
                            if (i24 == 1) {
                                iIntValue = p005kotlin.jvm.internal.s.g(str2, str) ? ((Number) q0Var.invoke(Integer.valueOf(R.drawable.garmin_udi_1_1_4_sa_ar), Integer.valueOf(R.drawable.garmin_udi_1_1_4_sa_ar_v2))).intValue() : ((Number) q0Var.invoke(Integer.valueOf(R.drawable.garmin_udi_1_1_4_sa_en), Integer.valueOf(R.drawable.garmin_udi_1_1_4_sa_en_v2))).intValue();
                            } else {
                                if (i24 != 2) {
                                    lc.u0.r();
                                    return null;
                                }
                                iIntValue = p005kotlin.jvm.internal.s.g(str2, str) ? ((Number) q0Var.invoke(Integer.valueOf(R.drawable.garmin_udi_1_1_4_br_pt), Integer.valueOf(R.drawable.garmin_udi_1_1_4_br_pt_v2))).intValue() : ((Number) q0Var.invoke(Integer.valueOf(R.drawable.garmin_udi_1_1_4_br_en), Integer.valueOf(R.drawable.garmin_udi_1_1_4_v2))).intValue();
                            }
                        } else {
                            com.garmin.android.apps.connectmobile.l.g().getClass();
                            if (!gh2.i.f77458c.a().f77477b.c("unreleased_ecg_udi_regulatory_markings")) {
                                i18 = R.drawable.garmin_udi_1_1_4;
                            }
                            iIntValue = i18;
                        }
                    } else {
                        com.garmin.android.apps.connectmobile.l.g().getClass();
                        if (!gh2.i.f77458c.a().f77477b.c("unreleased_ecg_udi_regulatory_markings")) {
                            i18 = R.drawable.garmin_udi_1_1_4;
                        }
                        iIntValue = i18;
                    }
                    t4.d dVarA = n5.c.a(iIntValue, mVar2, 0);
                    h4.r.a aVar3 = h4.r.S;
                    c2.l.f(x2.h(aVar3, f14), mVar2);
                    f5.k.f68985a.getClass();
                    u1.y0.a(dVarA, null, x2.x(x2.f(aVar3, 1.0f), null, 3), null, f5.k.a.f68990e, 0.0f, h0Var, mVar2, 25008, 40);
                    c2.l.f(x2.h(aVar3, f14), mVar2);
                    p2.f111205a.h("Garmin Corporation UDI", "(01)04719889050032(10)1.1.4", null, null, null, false, false, null, null, null, null, mVar2, 54, 0, 2044);
                    mVar2.y();
                    x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
