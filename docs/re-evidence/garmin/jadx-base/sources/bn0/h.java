package bn0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.fragment.app.v;
import androidx.lifecycle.i0;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import c62.e2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.device.setup.presentation.inreach.InReachSubscriptionPollingWorker;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.groupride.GroupRideShareActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.u;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.google.android.material.internal.ViewUtils;
import fw.p;
import i3.mc;
import j23.t;
import java.util.ArrayList;
import java.util.List;
import l20.r;
import l3.x0;
import lc.u0;
import nw0.q;
import o4.e0;
import o4.f1;
import o4.u1;
import o4.v0;
import o53.b0;
import o53.f0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.o0;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.r0;
import p13.y;
import p3.x3;
import pc0.n0;
import pj1.s;
import r22.m0;
import r53.p2;
import u53.o;
import zb0.g0;
import zb0.g1;
import zb0.q0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f18995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18998e;

    public /* synthetic */ h(long j8, float[] fArr, p0 p0Var, o0 o0Var) {
        this.f18994a = 8;
        this.f18995b = j8;
        this.f18996c = fArr;
        this.f18997d = p0Var;
        this.f18998e = o0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        Object value;
        ArrayList arrayList;
        r userContactsDTO;
        List<l20.a> listF;
        int i14 = this.f18994a;
        long j8 = this.f18995b;
        int i15 = 1;
        l20.a aVarC = null;
        Object obj2 = this.f18997d;
        Object obj3 = this.f18998e;
        Object obj4 = this.f18996c;
        switch (i14) {
            case 0:
                GroupRideShareActivity groupRideShareActivity = (GroupRideShareActivity) obj4;
                Logger logger = groupRideShareActivity.f36419a;
                String str = (String) obj2;
                String str2 = (String) obj3;
                fw.m mVar = (fw.m) obj;
                String str3 = GroupRideShareActivity.f36418j;
                int i16 = GroupRideShareActivity.b.f36427a[mVar.f73769b.ordinal()];
                if (i16 == 1) {
                    groupRideShareActivity.showProgressOverlay();
                } else if (i16 == 2) {
                    logger.debug(str3 + " - Successfully sent group ride code");
                    groupRideShareActivity.hideProgressOverlay();
                    m0.a aVar = m0.f149759e;
                    String string = groupRideShareActivity.getString(R.string.lbl_ready_to_ride);
                    if (str == null) {
                        str = "";
                    }
                    m0 m0VarB = m0.a.b(aVar, string, groupRideShareActivity.getString(R.string.group_ride_sent_to_device_success_info, str), 256);
                    v supportFragmentManager = groupRideShareActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    m0VarB.showNow(supportFragmentManager, m0VarB.f149763d);
                    i0 i0VarW = f0.w(groupRideShareActivity);
                    x53.c cVar = s0.f129406a;
                    ge1.b.T(i0VarW, o.f168762a, null, new j(m0VarB, null), 2);
                } else {
                    if (i16 != 3) {
                        u0.r();
                        return null;
                    }
                    logger.error(str3 + " - Got error " + mVar.f73771d + " while sending group ride code");
                    groupRideShareActivity.hideProgressOverlay();
                    androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(groupRideShareActivity);
                    aVar2.setTitle(R.string.lbl_group_ride_sent_to_device_error);
                    aVar2.setMessage(R.string.group_ride_sent_to_device_error_info);
                    String string2 = groupRideShareActivity.getString(R.string.lbl_cancel);
                    string2.getClass();
                    aVar2.setNegativeButton(g22.n.g(string2), new ag0.e(15));
                    String string3 = groupRideShareActivity.getString(R.string.lbl_retry);
                    string3.getClass();
                    aVar2.setPositiveButton(g22.n.g(string3), new i(groupRideShareActivity, this.f18995b, str, str2, 0));
                    androidx.appcompat.app.e eVarCreate = aVar2.create();
                    eVarCreate.getClass();
                    eVarCreate.show();
                }
                return Unit.INSTANCE;
            case 1:
                c31.a aVar3 = ((com.garmin.android.apps.connectmobile.onboarding.data.local.a) obj4).f39665c;
                d31.c cVar2 = (d31.c) obj2;
                d31.d dVar = (d31.d) obj3;
                ud.a aVar4 = (ud.a) obj;
                com.garmin.android.apps.connectmobile.onboarding.data.local.a.b bVar = com.garmin.android.apps.connectmobile.onboarding.data.local.a.f39662d;
                aVar4.getClass();
                ud.c cVarM0 = aVar4.M0("UPDATE device_onboarding_items SET status = ? WHERE deviceId = ? AND type = ?");
                try {
                    aVar3.getClass();
                    cVarM0.q3(1, c31.a.e(cVar2));
                    cVarM0.h(2, j8);
                    aVar3.getClass();
                    cVarM0.q3(3, c31.a.f(dVar));
                    cVarM0.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM0.close();
                }
            case 2:
                w0 w0Var = (w0) obj4;
                c62.b bVar2 = (c62.b) obj2;
                com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.f) obj3;
                g3 g3Var = (g3) obj;
                int i17 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                p pVar = g3Var.f35300a;
                String str4 = g3Var.f35302c;
                int i18 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.d.f48617a[pVar.ordinal()];
                if (i18 == 1) {
                    g3.f35298f.getClass();
                    w0Var.j(g3.a.b(bVar2));
                } else if (i18 == 2) {
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar5.getClass();
                    i2.a.b(a2Var, "WorkoutDetailsViewModel", "loadSavedWorkout: Workout sent to device successfully -> Waiting for device sync to finish");
                    ge1.b.T(v1.a(fVar), null, null, new e2(fVar, this.f18995b, w0Var, bVar2, null), 3);
                } else {
                    if (i18 != 3) {
                        u0.r();
                        return null;
                    }
                    String strN = fb1.c.n("loadSavedWorkout: Error sending workout to device: ", str4);
                    i2.a aVar6 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar6.getClass();
                    i2.a.f(a2Var2, "WorkoutDetailsViewModel", strN);
                    g3.a aVar7 = g3.f35298f;
                    if (str4 == null) {
                        str4 = "Error sending workout to device";
                    }
                    w0Var.j(g3.a.a(aVar7, str4, null, null, null, 14));
                }
                return Unit.INSTANCE;
            case 3:
                w0 w0Var2 = (w0) obj4;
                com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar2 = (com.garmin.android.apps.connectmobile.workouts.presentation.details.f) obj3;
                g3 g3Var2 = (g3) obj;
                int i19 = u.a.f48818a[g3Var2.f35300a.ordinal()];
                if (i19 != 1) {
                    if (i19 == 2) {
                        i2.a aVar8 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar8.getClass();
                        i2.a.b(a2Var3, "WorkoutDetailsViewModel", "Workout added to GC's download queue.");
                        fVar2.f48590d.B(j8, "WorkoutDetailsViewModel");
                    } else {
                        if (i19 != 3) {
                            u0.r();
                            return null;
                        }
                        String str5 = g3Var2.f35302c;
                        i2.a aVar9 = i2.f36769a;
                        a2 a2Var4 = a2.GENERAL;
                        aVar9.getClass();
                        i2.a.f(a2Var4, "WorkoutDetailsViewModel", str5);
                    }
                }
                w0Var2.m(g3Var2);
                return Unit.INSTANCE;
            case 4:
                gc0.i iVar = (gc0.i) obj4;
                String str6 = (String) obj2;
                sd2.f fVar3 = (sd2.f) obj3;
                vm2.h hVar = (vm2.h) obj;
                androidx.fragment.app.m mVar2 = iVar.f76870c;
                int i24 = 0;
                boolean z14 = hVar != null && hVar.f178831a;
                mVar2.runOnUiThread(new gc0.g(iVar, i24));
                mVar2.runOnUiThread(new gc0.h(iVar, z14 ? mVar2.getString(R.string.device_action_msg_remove_device_success, str6) : mVar2.getString(R.string.device_action_msg_remove_device_failure, str6), i15));
                ((g0) iVar.f76868a).v6();
                mVar2.runOnUiThread(new gc0.g(iVar, i15));
                if (z14 && km2.a.i(fVar3.getUnitID(), null, SupportedCapability.FIND_MY_WATCH.ordinal()) && zb0.u0.v(fVar3.getProductNumber())) {
                    g1 g1VarA = g1.a(mVar2.getApplicationContext());
                    SharedPreferences.Editor editor = g1.f203519b;
                    g1VarA.getClass();
                    editor.remove(g1.b(j8, "com.garmin.android.apps.connectmobile.devices.KEY_LATITUDE"));
                    g1.f203519b.remove(g1.b(j8, "com.garmin.android.apps.connectmobile.devices.KEY_LONGITUDE"));
                    g1.f203519b.remove(g1.b(j8, "com.garmin.android.apps.connectmobile.devices.KEY_TIME_STAMP"));
                    g1.f203519b.apply();
                    q0 q0VarA = q0.a(mVar2.getApplicationContext());
                    SharedPreferences.Editor editor2 = q0.f203618b;
                    q0VarA.getClass();
                    editor2.remove(q0.b(j8, "com.garmin.android.apps.connectmobile.devices.BIKE_ALARM_ARMED_PREF"));
                    q0.f203618b.remove(q0.b(j8, "com.garmin.android.apps.connectmobile.devices.EDGE_DISCONNECTED_TIMEOUT_PREF"));
                    q0.f203618b.apply();
                }
                return Unit.INSTANCE;
            case 5:
                long j14 = this.f18995b;
                f1 f1Var = (f1) obj3;
                q4.f fVar4 = (q4.f) obj;
                float fInvoke = ((x0) obj4).invoke();
                float fMax = (Math.max(Math.min(1.0f, fInvoke) - 0.4f, 0.0f) * 5) / 3;
                float fD = t.d(Math.abs(fInvoke) - 1.0f, 0.0f, 2.0f);
                float fPow = (((fMax * 0.4f) - 0.25f) + (fD - (((float) Math.pow(fD, 2)) / 4))) * 0.5f;
                float f14 = 360;
                m3.a aVar10 = new m3.a(fPow, fPow * f14, ((fMax * 0.8f) + fPow) * f14, Math.min(1.0f, fMax));
                float fFloatValue = ((Number) ((x3) obj2).getF182175a()).floatValue();
                float f15 = aVar10.f116208a;
                long jI1 = fVar4.i1();
                q4.a.b f142543b = fVar4.getF142543b();
                long jB = f142543b.b();
                f142543b.a().l();
                try {
                    f142543b.f142550a.f(f15, jI1);
                    float fS0 = fVar4.s0(m3.l.f116266b);
                    float f16 = m3.l.f116265a;
                    float fS1 = (fVar4.s0(f16) / 2.0f) + fS0;
                    long jB2 = n4.h.b(fVar4.b());
                    int i25 = (int) (jB2 >> 32);
                    int i26 = (int) (jB2 & 4294967295L);
                    n4.d dVar2 = new n4.d(Float.intBitsToFloat(i25) - fS1, Float.intBitsToFloat(i26) - fS1, Float.intBitsToFloat(i25) + fS1, Float.intBitsToFloat(i26) + fS1);
                    float f17 = aVar10.f116209b;
                    float f18 = aVar10.f116210c - f17;
                    long jI = dVar2.i();
                    long jG = dVar2.g();
                    float fS2 = fVar4.s0(f16);
                    u1.f129010b.getClass();
                    q4.f.Q1(fVar4, j14, f17, f18, jI, jG, fFloatValue, new q4.k(fS2, 0.0f, 0, 0, null, 26, null), ViewUtils.EDGE_TO_EDGE_FLAGS);
                    m3.l.c(fVar4, f1Var, dVar2, j14, fFloatValue, aVar10, f16);
                    return Unit.INSTANCE;
                } finally {
                    tn.k.p(f142543b, jB);
                }
            case 6:
                nw0.r rVar = (nw0.r) obj4;
                b0 b0Var = (b0) obj2;
                mc mcVar = (mc) obj3;
                String str7 = (String) obj;
                str7.getClass();
                rVar.getClass();
                p2 p2Var = rVar.f128107h;
                do {
                    value = p2Var.getValue();
                    List<pv0.d> list = (List) value;
                    arrayList = new ArrayList(y.r(list, 10));
                    for (pv0.d dVarA : list) {
                        if (dVarA.f141358a == j8) {
                            dVarA = pv0.d.a(dVarA, str7, null, 1015);
                        }
                        arrayList.add(dVarA);
                    }
                } while (!p2Var.b(value, arrayList));
                ge1.b.T(b0Var, null, null, new q.i(mcVar, null), 3);
                return Unit.INSTANCE;
            case 7:
                String str8 = (String) obj2;
                s sVar = (s) obj4;
                pj1.l lVar = (pj1.l) obj3;
                int i27 = s.f137969j1;
                tj1.e eVar = (tj1.e) ((g3) obj).f35301b;
                if (eVar != null && (userContactsDTO = eVar.getUserContactsDTO()) != null && (listF = userContactsDTO.f()) != null) {
                    aVarC = com.garmin.android.apps.connectmobile.contacts.b.c(str8, null, listF);
                }
                if (aVarC != null) {
                    w0<g3<yj1.k>> w0Var3 = sVar.E;
                    g3.a aVar11 = g3.f35298f;
                    yj1.k kVar = new yj1.k(aVarC, j8, lVar);
                    aVar11.getClass();
                    w0Var3.j(g3.a.d(kVar));
                }
                return Unit.INSTANCE;
            case 8:
                float[] fArr = (float[]) obj4;
                p0 p0Var = (p0) obj2;
                o0 o0Var = (o0) obj3;
                s5.s sVar2 = (s5.s) obj;
                int i28 = sVar2.f157291b;
                s5.r rVar2 = sVar2.f157290a;
                int iG = sVar2.f157292c;
                int iH = i28 > s5.w0.h(j8) ? sVar2.f157291b : s5.w0.h(j8);
                if (iG >= s5.w0.g(j8)) {
                    iG = s5.w0.g(j8);
                }
                long jL = og.a.l(sVar2.d(iH), sVar2.d(iG));
                rVar2.r(jL, fArr, p0Var.f105807a);
                int iF = (s5.w0.f(jL) * 4) + p0Var.f105807a;
                for (int i29 = p0Var.f105807a; i29 < iF; i29 += 4) {
                    int i30 = i29 + 1;
                    float f19 = fArr[i30];
                    float f22 = o0Var.f105806a;
                    fArr[i30] = f19 + f22;
                    int i34 = i29 + 3;
                    fArr[i34] = fArr[i34] + f22;
                }
                p0Var.f105807a = iF;
                o0Var.f105806a = rVar2.getHeight() + o0Var.f105806a;
                return Unit.INSTANCE;
            case 9:
                sz0.u uVar = (sz0.u) obj4;
                Long l14 = (Long) obj2;
                uz0.l lVar2 = (uz0.l) obj3;
                g3 g3Var3 = (g3) obj;
                int i35 = sz0.u.E;
                p pVar2 = g3Var3.f35300a;
                Integer num = g3Var3.f35304e;
                int i36 = sz0.u.b.f161516a[pVar2.ordinal()];
                if (i36 == 1) {
                    g22.e.f(uVar);
                    if (num != null && num.intValue() == 404) {
                        uVar.e7(j8);
                    } else {
                        g22.e.a(uVar, null);
                        String str9 = "Error getting training plan: planId=" + l14 + " responseCode=" + num + " exception=" + g3Var3.f35303d;
                        i2.a aVar12 = i2.f36769a;
                        a2 a2Var5 = a2.GENERAL;
                        aVar12.getClass();
                        i2.a.f(a2Var5, "NotificationsFragment", str9);
                    }
                } else if (i36 == 2) {
                    g22.e.l(uVar);
                } else {
                    if (i36 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(uVar);
                    long jLongValue = l14.longValue();
                    String str10 = lVar2.f173586a;
                    tz0.a aVarC7 = uVar.c7();
                    Context contextRequireContext = uVar.requireContext();
                    contextRequireContext.getClass();
                    aVarC7.o(contextRequireContext, jLongValue, str10);
                    sn.a.u(uVar, uVar.d7());
                }
                return Unit.INSTANCE;
            case 10:
                n4.d dVar3 = (n4.d) obj4;
                r0 r0Var = (r0) obj2;
                long j15 = this.f18995b;
                e0 e0Var = (e0) obj3;
                q4.c cVar3 = (q4.c) obj;
                cVar3.m1();
                float f24 = dVar3.f123547a;
                float f25 = dVar3.f123548b;
                cVar3.getF142543b().f142550a.h(f24, f25);
                try {
                    q4.f.B0(cVar3, (v0) r0Var.f105810a, 0L, j15, 0L, 0L, 0.0f, null, e0Var, 0, 0, 890);
                    return Unit.INSTANCE;
                } finally {
                    cVar3.getF142543b().f142550a.h(-f24, -f25);
                }
            default:
                r0 r0Var2 = (r0) obj4;
                wa0.c cVar4 = (wa0.c) obj2;
                n0 n0Var = cVar4.f183766c;
                e23.a aVar13 = (e23.a) obj3;
                f.a aVar14 = (f.a) obj;
                aVar14.getClass();
                int i37 = aVar14.f67585a;
                if (i37 == -1) {
                    i2.a aVar15 = i2.f36769a;
                    a2 a2Var6 = a2.DEVICE_SETUP;
                    aVar15.getClass();
                    i2.a.b(a2Var6, "InReachSubscriptionScreen", "User purchased the subscription successfully.");
                    String str11 = (String) r0Var2.f105810a;
                    if (str11 != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        InReachSubscriptionPollingWorker.f33782k.getClass();
                        InReachSubscriptionPollingWorker.a.a(j8, jCurrentTimeMillis, str11);
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        long j16 = cVar4.f183764a;
                        n0Var.e(j16, str11);
                        n0Var.o(j16, jCurrentTimeMillis2);
                        aVar13.invoke();
                    }
                } else if (i37 == 0) {
                    i2.a aVar16 = i2.f36769a;
                    a2 a2Var7 = a2.DEVICE_SETUP;
                    aVar16.getClass();
                    i2.a.b(a2Var7, "InReachSubscriptionScreen", "User canceled their subscription purchase.");
                    n0Var.b(j8);
                } else if (i37 != 9) {
                    i2.a aVar17 = i2.f36769a;
                    a2 a2Var8 = a2.DEVICE_SETUP;
                    aVar17.getClass();
                    i2.a.b(a2Var8, "InReachSubscriptionScreen", "User failed their subscription purchase.");
                    n0Var.b(j8);
                } else {
                    i2.a aVar18 = i2.f36769a;
                    a2 a2Var9 = a2.DEVICE_SETUP;
                    aVar18.getClass();
                    i2.a.b(a2Var9, "InReachSubscriptionScreen", "Purchase failed due to an error in the purchase flow.");
                    n0Var.b(j8);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ h(Object obj, long j8, Object obj2, Object obj3, int i14) {
        this.f18994a = i14;
        this.f18996c = obj;
        this.f18995b = j8;
        this.f18997d = obj2;
        this.f18998e = obj3;
    }

    public /* synthetic */ h(Object obj, Object obj2, long j8, Object obj3, int i14) {
        this.f18994a = i14;
        this.f18996c = obj;
        this.f18997d = obj2;
        this.f18995b = j8;
        this.f18998e = obj3;
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, long j8, int i14) {
        this.f18994a = i14;
        this.f18996c = obj;
        this.f18997d = obj2;
        this.f18998e = obj3;
        this.f18995b = j8;
    }

    public /* synthetic */ h(String str, s sVar, long j8, pj1.l lVar) {
        this.f18994a = 7;
        this.f18997d = str;
        this.f18996c = sVar;
        this.f18995b = j8;
        this.f18998e = lVar;
    }
}
