package jt1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.d3;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.reminders.MenstrualCycleReminders;
import com.garmin.android.apps.connectmobile.personalizedinsights.presentation.consent.PersonalizedInsightsConsentActivity;
import com.garmin.android.apps.connectmobile.personalizedinsights.presentation.language.LanguageSelectionActivity;
import com.garmin.feature.garminpay.ui.developer.DeveloperSettingsActivity;
import com.garmin.proto.generated.GDIAudioPromptsProto;
import e2.f0;
import e23.q;
import f5.c0;
import fw.p;
import i3.fe;
import i3.ij;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import ky0.s0;
import ky0.w0;
import l3.d1;
import l3.z;
import lc.u0;
import m4.g0;
import o4.t0;
import o4.w;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.s;
import p006l2.b2;
import p006l2.b3;
import p006l2.d2;
import p006l2.e2;
import p006l2.j3;
import p006l2.k2;
import p006l2.k3;
import p006l2.y;
import p3.c2;
import p3.n1;
import p3.p1;
import p5.h0;
import p5.k0;
import pt1.x;
import s5.i0;
import s5.o;
import s5.p0;
import s5.q0;
import s5.r0;
import wd2.m1;
import x5.l0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f100820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f100821c;

    public /* synthetic */ d(j3 j3Var, s5.c.d dVar, d2 d2Var) {
        this.f100819a = 26;
        this.f100820b = dVar;
        this.f100821c = d2Var;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x038d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0393  */
    /* JADX WARN: Code duplicated, block: B:139:0x039c  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, o13.l] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        String string;
        Throwable th3;
        Intent intent;
        long j8;
        r0 f157243b;
        r0 f157243b2;
        r0 f157243b3;
        q0 q0Var;
        o4.j jVarK;
        p0 p0Var;
        d1.b bVar;
        int i14 = this.f100819a;
        int i15 = 6;
        int i16 = 0;
        i0 i0VarD = null;
        i0VarD = null;
        Object obj2 = this.f100821c;
        Object obj3 = this.f100820b;
        switch (i14) {
            case 0:
                ((Boolean) obj).getClass();
                ((p1) obj2).setValue((us1.b) obj3);
                return Unit.INSTANCE;
            case 1:
                Context context = (Context) obj2;
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                int i17 = ((x) obj3).f141009f;
                if (i17 > 1) {
                    string = context.getString(R.string.stars_rating_content_description, String.valueOf(i17));
                    string.getClass();
                } else {
                    string = context.getString(R.string.one_star_rating_content_description);
                    string.getClass();
                }
                h0.n(k0Var, string);
                return Unit.INSTANCE;
            case 2:
                x xVar = (x) obj3;
                f0 f0Var = (f0) obj;
                f0Var.getClass();
                f0.f(f0Var, xVar.f141012i.size(), null, new z3.e(-1364691695, true, new ao1.f(24, xVar, (q) obj2)), 6);
                return Unit.INSTANCE;
            case 3:
                ju.a aVar = (ju.a) obj3;
                GDIAudioPromptsProto.AudioSettingsResponse audioSettingsResponse = (GDIAudioPromptsProto.AudioSettingsResponse) obj2;
                Exception exc = (Exception) obj;
                int i18 = ju.a.f100865c;
                if (exc == null) {
                    String str = "Send settings success. deviceUnitID[" + aVar.d() + "], speakLaps[" + (audioSettingsResponse.hasSpeakLaps() ? Boolean.valueOf(audioSettingsResponse.getSpeakLaps()) : "NOT SET") + "] hrIntervaltime[" + (audioSettingsResponse.hasHrIntervalTime() ? Long.valueOf(audioSettingsResponse.getHrIntervalTime()) : "NOT SET") + "] speedIntervaltime[" + (audioSettingsResponse.hasSpeedIntervalTime() ? Long.valueOf(audioSettingsResponse.getSpeedIntervalTime()) : "NOT SET") + "]powerIntervaltime[" + (audioSettingsResponse.hasPowerIntervalTime() ? Long.valueOf(audioSettingsResponse.getPowerIntervalTime()) : "NOT SET") + "]speakNavigation[" + (audioSettingsResponse.hasSpeakNavigation() ? Boolean.valueOf(audioSettingsResponse.getSpeakNavigation()) : "NOT SET") + "] ";
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.b(a2Var, "AudioPromptsProtobufRequestHandler", str);
                } else {
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.g(a2Var2, "AudioPromptsProtobufRequestHandler", exc);
                }
                return Unit.INSTANCE;
            case 4:
                jx0.d dVar = (jx0.d) obj3;
                LocalDate localDate = (LocalDate) obj2;
                cx0.a aVar4 = (cx0.a) obj;
                jx0.d.a aVar5 = jx0.d.f101418j;
                if (aVar4 != null) {
                    if (!aVar4.f56602d && (th3 = aVar4.f56600b) != null) {
                        g22.e.d(dVar, cx0.b.a(th3));
                        aVar4.f56602d = true;
                    }
                    ww0.k kVar = (ww0.k) aVar4.f56599a;
                    ReentrantLock reentrantLock = dVar.f101420b;
                    reentrantLock.lock();
                    try {
                        int iD = dVar.v6().d(localDate);
                        if (iD != -1) {
                            dVar.v6().e(iD, kVar, false);
                            if (kVar != null) {
                                dVar.C6(iD, kVar);
                                dVar.E6(iD, kVar);
                            }
                            dVar.I6(kVar);
                            Unit unit = Unit.INSTANCE;
                        }
                    } finally {
                        reentrantLock.unlock();
                    }
                    break;
                } else {
                    dVar.v6().e(dVar.v6().d(localDate), null, true);
                    dVar.v6().notifyDataSetChanged();
                }
                return Unit.INSTANCE;
            case 5:
                f0 f0Var2 = (f0) obj;
                f0Var2.getClass();
                jy0.f.f101690a.getClass();
                f0.b(f0Var2, null, jy0.f.f101691b, 3);
                List listB1 = p13.h0.b1((Set) obj3);
                f0Var2.a(listB1.size(), new jy0.i0.c(new jy0.b(i15), listB1), new jy0.i0.d(jy0.i0.b.f101717a, listB1), new z3.e(802480018, true, new jy0.i0.e(listB1, (e23.l) obj2)));
                f0.b(f0Var2, null, jy0.f.f101692c, 3);
                return Unit.INSTANCE;
            case 6:
                String str2 = (String) obj;
                str2.getClass();
                ge1.b.T((b0) obj3, null, null, new k11.m.g((fe) obj2, str2, null), 3);
                return Unit.INSTANCE;
            case 7:
                Button button = (Button) obj3;
                Button button2 = (Button) obj2;
                aa0.d dVar2 = (aa0.d) obj;
                com.garmin.android.apps.connectmobile.developer.tutorials.c.a aVar6 = com.garmin.android.apps.connectmobile.developer.tutorials.c.f33727c;
                if (dVar2 != null) {
                    button.setEnabled(true);
                    button2.setEnabled(true);
                }
                return Unit.INSTANCE;
            case 8:
                LanguageSelectionActivity languageSelectionActivity = (LanguageSelectionActivity) obj3;
                h91.b bVar2 = (h91.b) obj2;
                String str3 = (String) obj;
                LanguageSelectionActivity.a aVar7 = LanguageSelectionActivity.f40328b;
                str3.getClass();
                k91.c cVar = (k91.c) languageSelectionActivity.f40329a.getValue();
                cVar.getClass();
                String str4 = (String) ((g3) cVar.f103634f.getValue()).f35301b;
                cVar.f103636h.k(null, cVar.f103631c.b());
                ge1.b.T(v1.a(cVar), null, null, new k91.d(str3, cVar, str4, null), 3);
                if (bVar2 != null) {
                    PersonalizedInsightsConsentActivity.f40319t.getClass();
                    languageSelectionActivity.startActivity(PersonalizedInsightsConsentActivity.a.a(languageSelectionActivity, bVar2));
                    languageSelectionActivity.finish();
                }
                return Unit.INSTANCE;
            case 9:
                ((Boolean) obj).getClass();
                ((e23.l) obj3).invoke(Long.valueOf(((qv.b) obj2).f147905a));
                return Unit.INSTANCE;
            case 10:
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                h0.n(k0Var2, p13.h0.k0(((z80.j) obj3).f203062a, null, null, null, new a51.m((Context) obj2, 21), 31));
                return Unit.INSTANCE;
            case 11:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.a aVar8 = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.a) obj3;
                androidx.fragment.app.m mVar = (androidx.fragment.app.m) obj2;
                List list = (List) obj;
                if (list != null) {
                    kb1.c cVar2 = aVar8.f40900d;
                    if (cVar2 == null) {
                        s.m("adapter");
                        throw null;
                    }
                    ArrayList arrayListZ = p13.h0.Z(list);
                    ArrayList arrayList = cVar2.f103816a;
                    arrayList.clear();
                    arrayList.addAll(p13.h0.N0(arrayListZ, new kb1.d()));
                    kb1.c cVar3 = aVar8.f40900d;
                    if (cVar3 == null) {
                        s.m("adapter");
                        throw null;
                    }
                    cVar3.notifyDataSetChanged();
                    d3 d3Var = aVar8.f40899c;
                    if (d3Var == null) {
                        s.m("mToolbarListener");
                        throw null;
                    }
                    d3Var.updateActionBar(mVar.getString(list.size() > 1 ? R.string.pregnancy_title : R.string.pregnancy_previous_pregnancy), 2);
                } else {
                    com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.a.C0770a c0770a = com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.a.f40895e;
                }
                return Unit.INSTANCE;
            case 12:
                c0 c0Var = (c0) obj;
                c0Var.getClass();
                n4.c.f123541b.getClass();
                ((n1) obj3).t((int) Float.intBitsToFloat((int) (c0Var.W(0L) & 4294967295L)));
                ((p1) obj2).setValue(n4.g.a(g6.n.c(c0Var.a())));
                return Unit.INSTANCE;
            case 13:
                kl0.d dVar3 = (kl0.d) obj3;
                p1 p1Var = (p1) obj2;
                il0.a aVar9 = (il0.a) obj;
                aVar9.getClass();
                if (cl0.e.b()) {
                    p1Var.setValue(Boolean.TRUE);
                } else {
                    dVar3.getClass();
                    ge1.b.T(v1.a(dVar3), null, null, new kl0.e(dVar3, aVar9, null), 3);
                }
                return Unit.INSTANCE;
            case 14:
                kr2.h hVar = (kr2.h) obj2;
                ((Integer) obj).getClass();
                kr2.h.a aVar10 = kr2.h.f106255y;
                Long deviceId = ((on2.a) obj3).getDeviceId();
                if (deviceId != null) {
                    long jLongValue = deviceId.longValue();
                    DeveloperSettingsActivity developerSettingsActivity = hVar.f106257a;
                    if (developerSettingsActivity != null) {
                        new androidx.appcompat.app.e.a(new ContextThemeWrapper(developerSettingsActivity, R.style.AlertDialogTheme)).setTitle("Delete NFC Device").setMessage("Do you want to delete this NFC Device").setPositiveButton(R.string.lbl_ok, new jr2.e(developerSettingsActivity, jLongValue, i16)).setNegativeButton(R.string.lbl_cancel, new jm0.c(3)).show();
                    }
                }
                return Unit.INSTANCE;
            case 15:
                kv0.j jVar = (kv0.j) obj3;
                ev0.b bVar3 = (ev0.b) obj;
                bVar3.getClass();
                Boolean bool = Boolean.TRUE;
                ((p1) obj2).setValue(bool);
                jVar.getClass();
                Boolean bool2 = bVar3.f66146g;
                if (bVar3.f66143d) {
                    if (s.g(bool2, bool)) {
                        jVar.C4(new kv0.i.g(bVar3));
                    } else {
                        jVar.B4(bVar3);
                    }
                } else if (jVar.f106664a.j().e(bVar3.f66140a)) {
                    jVar.C4(new kv0.i.a(bVar3));
                } else if (s.g(bool2, Boolean.FALSE)) {
                    jVar.C4(new kv0.i.h(bVar3));
                } else if (s.g(bool2, bool)) {
                    jVar.C4(new kv0.i.g(bVar3));
                } else {
                    jVar.B4(bVar3);
                }
                return Unit.INSTANCE;
            case 16:
                kv0.j jVar2 = (kv0.j) obj3;
                m1 m1Var = (m1) obj;
                int i19 = kv0.j.f106663m;
                m1Var.getClass();
                m1Var.i(jVar2.f106664a.f().f(), new k62.k(jVar2, 9, m1Var, (ff2.d) obj2));
                return Unit.INSTANCE;
            case 17:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar11 = (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a) obj3;
                androidx.fragment.app.m mVar2 = (androidx.fragment.app.m) obj2;
                fw.m mVar3 = (fw.m) obj;
                Logger logger = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39032u1;
                p pVar = mVar3.f73769b;
                fw.c cVar4 = mVar3.f73771d;
                int i24 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.b.f39077a[pVar.ordinal()];
                if (i24 == 1) {
                    g22.e.l(aVar11);
                } else if (i24 == 2) {
                    logger.debug("showStopCycleTypeAlert: got successful result, setting GCM to INACTIVE ");
                    g22.e.f(aVar11);
                    i52.a aVar12 = i52.a.f91796a;
                    ww0.a aVar13 = ww0.a.INACTIVE;
                    aVar12.getClass();
                    i52.a.t(aVar13);
                    SharedPreferences sharedPreferences = i52.a.f91797b;
                    sharedPreferences.edit().putBoolean(i52.a.c(R.string.key_mct_period_reminder_enabled), false).apply();
                    long millis = DateTime.now().getMillis();
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    aVar12.getClass();
                    editorEdit.putLong(i52.a.c(R.string.key_inactive_report_timestamp), millis).apply();
                    MenstrualCycleReminders.a aVar14 = MenstrualCycleReminders.f39205a;
                    GarminConnectMobileApp.f28685g.getClass();
                    Context contextA = GarminConnectMobileApp.a.a();
                    aVar14.getClass();
                    MenstrualCycleReminders.a.a(contextA);
                    aVar11.startActivity(MenstrualCycleDetailsActivity.a.b(MenstrualCycleDetailsActivity.f38784t, mVar2, false, null, 26));
                } else {
                    if (i24 != 3) {
                        u0.r();
                        return null;
                    }
                    logger.error("showStopCycleTypeAlert: got error response: " + cVar4);
                    g22.e.f(aVar11);
                    g22.e.a(aVar11, cVar4);
                }
                return Unit.INSTANCE;
            case 18:
                b0 b0Var = (b0) obj3;
                w0 w0Var = (w0) obj2;
                f.a aVar15 = (f.a) obj;
                aVar15.getClass();
                if (aVar15.f67585a == -1 && (intent = aVar15.f67586b) != null && intent.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                    ge1.b.T(b0Var, null, null, new s0.m(w0Var, null), 3);
                }
                return Unit.INSTANCE;
            case 19:
                e23.p pVar2 = (e23.p) obj2;
                f0 f0Var3 = (f0) obj;
                f0Var3.getClass();
                Iterator it = ((i53.d) obj3).entrySet().iterator();
                while (it.hasNext()) {
                    f0.b(f0Var3, null, new z3.e(850045042, true, new hv0.d(20, (Map.Entry) it.next(), pVar2)), 3);
                }
                return Unit.INSTANCE;
            case 20:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                ((e23.p) obj3).invoke(((Map.Entry) obj2).getKey(), bool3);
                return Unit.INSTANCE;
            case 21:
                ud.a aVar16 = (ud.a) obj;
                kz0.d.b bVar4 = kz0.d.f107782c;
                aVar16.getClass();
                ((kz0.d) obj3).f107784b.d(aVar16, (lz0.b) obj2);
                return Unit.INSTANCE;
            case 22:
                e23.l lVar = (e23.l) obj2;
                l0 l0Var = (l0) obj;
                if (!s.g((l0) obj3, l0Var)) {
                    lVar.invoke(l0Var);
                }
                return Unit.INSTANCE;
            case 23:
                b2 b2Var = (b2) obj3;
                w wVar = (w) obj2;
                q4.c cVar5 = (q4.c) obj;
                cVar5.m1();
                if (((Boolean) b2Var.f108409s.getF182175a()).booleanValue() || ((Boolean) b2Var.f108410t.getF182175a()).booleanValue()) {
                    q4.f.C0(cVar5, wVar, 0L, 0L, 0.0f, null, 0, 126);
                }
                return Unit.INSTANCE;
            case 24:
                f5.v1.a aVar17 = (f5.v1.a) obj;
                ArrayList arrayListD = y.d((List) obj3, ((e2) obj2).f108451a);
                if (arrayListD != null) {
                    int size = arrayListD.size();
                    while (i16 < size) {
                        o13.p pVar3 = (o13.p) arrayListD.get(i16);
                        f5.v1 v1Var = (f5.v1) pVar3.f128594a;
                        e23.a aVar18 = (e23.a) pVar3.f128595b;
                        if (aVar18 != null) {
                            j8 = ((g6.k) aVar18.invoke()).f76005a;
                        } else {
                            g6.k.f76003b.getClass();
                            j8 = 0;
                        }
                        f5.v1.a.y(aVar17, v1Var, j8);
                        i16++;
                    }
                }
                return Unit.INSTANCE;
            case 25:
                return new b3((p1) obj2, (a2.j) obj3);
            case 26:
                s5.c.d dVar4 = (s5.c.d) obj3;
                p3.a2 a2Var3 = ((d2) obj2).f108443b;
                k2 k2Var = (k2) obj;
                s5.m mVar4 = (s5.m) dVar4.f157149a;
                r0 f157243b4 = mVar4.getF157243b();
                i0 i0Var = f157243b4 != null ? f157243b4.f157286a : null;
                i0 i0VarD2 = ((a2Var3.getIntValue() & 1) == 0 || (f157243b3 = mVar4.getF157243b()) == null) ? null : f157243b3.f157287b;
                if (i0Var != null) {
                    i0VarD2 = i0Var.d(i0VarD2);
                }
                i0 i0VarD3 = ((a2Var3.getIntValue() & 2) == 0 || (f157243b2 = mVar4.getF157243b()) == null) ? null : f157243b2.f157288c;
                if (i0VarD2 != null) {
                    i0VarD3 = i0VarD2.d(i0VarD3);
                }
                if ((a2Var3.getIntValue() & 4) != 0 && (f157243b = mVar4.getF157243b()) != null) {
                    i0VarD = f157243b.f157289d;
                }
                if (i0VarD3 != null) {
                    i0VarD = i0VarD3.d(i0VarD);
                }
                k2Var.getClass();
                k2Var.f108617b = k2Var.f108616a.c(new k62.k(new m0(), 13, dVar4, i0VarD));
                return Unit.INSTANCE;
            case 27:
                j3 j3Var = (j3) obj3;
                s5.c.d dVar5 = (s5.c.d) obj2;
                t0 t0Var = (t0) obj;
                s5.c cVar6 = j3Var.f108588b;
                c2 c2Var = j3Var.f108587a;
                q0 q0Var2 = (q0) c2Var.getF182175a();
                if (s.g(cVar6, (q0Var2 == null || (p0Var = q0Var2.f157280a) == null) ? null : p0Var.f157265a) && (q0Var = (q0) c2Var.getF182175a()) != null) {
                    o oVar = q0Var.f157281b;
                    s5.c.d dVarC = j3.c(dVar5, q0Var);
                    if (dVarC == null) {
                        jVarK = null;
                    } else {
                        int i25 = dVarC.f157151c;
                        int i26 = dVarC.f157150b;
                        jVarK = q0Var.k(i26, i25);
                        n4.d dVarB = q0Var.b(i26);
                        int i27 = i25 - 1;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(dVarB.f123548b)) & 4294967295L) | (((long) Float.floatToRawIntBits(oVar.d(i26) == oVar.d(i27) ? Math.min(q0Var.b(i27).f123547a, dVarB.f123547a) : 0.0f)) << 32);
                        n4.c.a aVar19 = n4.c.f123541b;
                        jVarK.e(jFloatToRawIntBits ^ (-9223372034707292160L));
                    }
                } else {
                    jVarK = null;
                }
                k3 k3Var = jVarK != null ? new k3(jVarK) : null;
                if (k3Var != null) {
                    t0Var.e1(k3Var);
                    t0Var.g(true);
                }
                return Unit.INSTANCE;
            case 28:
                d1 d1Var = (d1) obj3;
                AccessibilityManager accessibilityManager = (AccessibilityManager) obj2;
                if (((androidx.lifecycle.b0.a) obj) == androidx.lifecycle.b0.a.ON_RESUME) {
                    d1Var.getClass();
                    d1Var.f109214c.setValue(Boolean.valueOf(accessibilityManager.isEnabled()));
                    accessibilityManager.addAccessibilityStateChangeListener(d1Var);
                    d1.c cVar7 = d1Var.f109215d;
                    if (cVar7 != null) {
                        cVar7.f109220a.setValue(Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()));
                        accessibilityManager.addTouchExplorationStateChangeListener(cVar7);
                    }
                    if (Build.VERSION.SDK_INT >= 33 && (bVar = d1Var.f109216e) != null) {
                        bVar.f109217a.setValue(Boolean.valueOf(d1.a(accessibilityManager)));
                        bVar.f109218b.setValue(Boolean.valueOf(d1.c(accessibilityManager)));
                        d1.a.a(accessibilityManager, kx0.g.a(bVar));
                    }
                }
                return Unit.INSTANCE;
            default:
                ge1.b.T((b0) obj3, null, null, new z((g0) obj, (ij) obj2, null), 3);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d(int i14, Object obj, Object obj2) {
        this.f100819a = i14;
        this.f100820b = obj;
        this.f100821c = obj2;
    }

    public /* synthetic */ d(p1 p1Var, a2.j jVar) {
        this.f100819a = 25;
        this.f100821c = p1Var;
        this.f100820b = jVar;
    }
}
