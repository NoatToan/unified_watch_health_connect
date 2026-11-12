package i3;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Parcelable;
import android.view.View;
import ch.qos.logback.classic.spi.CallerData;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.reports.ActivityReportsActivity;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.ManageTripsActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.msn.MSNWorkoutListActivity;
import java.io.File;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d6 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f87827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f87828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f87829d;

    public /* synthetic */ d6(Object obj, int i14, Object obj2, Object obj3) {
        this.f87826a = i14;
        this.f87827b = obj;
        this.f87828c = obj2;
        this.f87829d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:83:0x0264  */
    /* JADX WARN: Code duplicated, block: B:96:0x0285  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r23v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r23v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r3v77 */
    /* JADX WARN: Type inference failed for: r3v81 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v24 */
    @Override // e23.a
    public final Object invoke() {
        gt2.d dVar;
        gt2.d dVar2;
        ?? r14;
        String str;
        String str2;
        String str3;
        String strG;
        ?? r15;
        ?? r16;
        ?? r17;
        jz1.b bVar;
        int i14 = 2;
        boolean z14 = true;
        int i15 = 0;
        String strR = null;
        switch (this.f87826a) {
            case 0:
                an0.d dVar3 = (an0.d) this.f87827b;
                String str4 = (String) this.f87828c;
                kotlin.m3 m3Var = (kotlin.m3) this.f87829d;
                dVar3.invoke();
                y5.f90403b.getClass();
                if (p005kotlin.jvm.internal.s.g(str4, y5.f90405d) && m3Var != null) {
                    m3Var.show();
                }
                return Boolean.TRUE;
            case 1:
                mc mcVar = (mc) this.f87827b;
                o53.b0 b0Var = (o53.b0) this.f87828c;
                mc mcVar2 = (mc) this.f87829d;
                if (mcVar.f88996e.f109322d.invoke(pc.Expanded).booleanValue()) {
                    ge1.b.T(b0Var, null, null, new a9(mcVar2, null), 3);
                }
                return Boolean.TRUE;
            case 2:
                p pVar = (p) this.f87827b;
                g6.c cVar = (g6.c) this.f87828c;
                p3.p1 p1Var = (p3.p1) this.f87829d;
                long jV = bi.v(pVar);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(cVar.s0(g6.g.b(jV)))) << 32) | (((long) Float.floatToRawIntBits(cVar.s0(g6.g.c(jV)))) & 4294967295L);
                n4.c.a aVar = n4.c.f123541b;
                return Boolean.valueOf(((n4.d) p1Var.getF182175a()).a(jFloatToRawIntBits));
            case 3:
                t41.f fVar = (t41.f) this.f87827b;
                e23.l lVar = (e23.l) this.f87828c;
                p3.p1 p1Var2 = (p3.p1) this.f87829d;
                if (fVar == t41.f.OTHER) {
                    p1Var2.setValue(Boolean.TRUE);
                } else {
                    lVar.invoke(fVar);
                }
                return Unit.INSTANCE;
            case 4:
                ArrayList arrayList = (ArrayList) this.f87827b;
                ArrayList arrayList2 = (ArrayList) this.f87828c;
                View view2 = (View) this.f87829d;
                int i16 = i80.a.f92217a;
                int i17 = gt2.c.f79010a;
                synchronized (gt2.b.f79005a) {
                    dVar = gt2.b.f79007c;
                    if (dVar == null) {
                        p005kotlin.jvm.internal.s.m("config");
                        throw null;
                    }
                }
                Iterator it = dVar.f79014c.iterator();
                while (it.hasNext()) {
                    arrayList.remove(((gt2.a) it.next()).f79002a);
                }
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(new i80.a.b(false, (String) it3.next()));
                    }
                }
                view2.post(new h0.r0(14, view2, p13.h0.N0(arrayList2, new i80.a.d())));
                return Unit.INSTANCE;
            case 5:
                ArrayList arrayList3 = (ArrayList) this.f87827b;
                i80.e eVar = (i80.e) this.f87828c;
                View view3 = (View) this.f87829d;
                String[] strArr = i80.e.f92229f;
                String str5 = CallerData.NA;
                int i18 = gt2.c.f79010a;
                synchronized (gt2.b.f79005a) {
                    dVar2 = gt2.b.f79007c;
                    if (dVar2 == null) {
                        p005kotlin.jvm.internal.s.m("config");
                        throw null;
                    }
                }
                Iterator it4 = dVar2.f79014c.iterator();
                while (it4.hasNext()) {
                    gt2.a aVar2 = (gt2.a) it4.next();
                    String str6 = aVar2.f79003b;
                    String str7 = eVar.f92230a;
                    if (str7 == null) {
                        ?? r24 = strR;
                        p005kotlin.jvm.internal.s.m("publicDocsDirAbsolutePath");
                        throw r24;
                    }
                    if (d53.u.y(str6, str7, z14)) {
                        eVar.f92234e = (short) (eVar.f92234e + (z14 ? 1 : 0));
                        r14 = z14 ? 1 : 0;
                    } else {
                        eVar.f92233d = (short) (eVar.f92233d + (z14 ? 1 : 0));
                        r14 = i15;
                    }
                    File file = new File(tn.k.g(aVar2.f79003b, aVar2.f79004c));
                    if (file.exists()) {
                        String absolutePath = file.getAbsolutePath();
                        absolutePath.getClass();
                        long length = file.length();
                        String[] strArr2 = i80.e.f92229f;
                        if (length <= 0) {
                            strG = fb1.c.n("0 ", strArr2[i15]);
                        } else {
                            double d14 = length;
                            int iLog10 = (int) (Math.log10(d14) / Math.log10(1024.0d));
                            strG = e5.g(new DecimalFormat("#,##0.#").format(d14 / Math.pow(1024.0d, iLog10)), StringUtils.SPACE, strArr2[iLog10]);
                        }
                        DateFormat dateFormat = eVar.f92231b;
                        if (dateFormat == null) {
                            p005kotlin.jvm.internal.s.m("timestampFormatter");
                            throw strR;
                        }
                        String str8 = dateFormat.format(Long.valueOf(file.lastModified()));
                        str8.getClass();
                        str3 = str8;
                        str = absolutePath;
                        str2 = strG;
                    } else {
                        z14 = z14 ? 1 : 0;
                        i15 = i15;
                        strR = strR;
                        view3 = view3;
                        str5 = str5;
                        it4 = it4;
                        str = str5;
                        str2 = str;
                        str3 = str2;
                    }
                    arrayList3.add(new i80.f(r14, aVar2.f79002a, str, str2, str3));
                    str5 = str5;
                    i15 = i15;
                    z14 = z14;
                    it4 = it4;
                    strR = strR;
                    view3 = view3;
                    i14 = 2;
                }
                ?? r25 = z14 ? 1 : 0;
                ?? r26 = strR;
                View view4 = view3;
                e23.l[] lVarArr = new e23.l[i14];
                lVarArr[i15] = new p005kotlin.jvm.internal.i0() { // from class: i80.e.b
                    @Override // p005kotlin.jvm.internal.i0, k23.n
                    public final Object get(Object obj) {
                        return ((f) obj).f92238b;
                    }
                };
                lVarArr[r25 == true ? 1 : 0] = new p005kotlin.jvm.internal.i0() { // from class: i80.e.c
                    @Override // p005kotlin.jvm.internal.i0, k23.n
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((f) obj).f92237a);
                    }
                };
                List listN0 = p13.h0.N0(arrayList3, r13.a.a(lVarArr));
                Handler handler = eVar.f92232c;
                if (handler != null) {
                    handler.post(new fh2.a(eVar, 7, view4, listN0));
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("uiHandler");
                throw r26;
            case 6:
                e23.l lVar2 = (e23.l) this.f87827b;
                String str9 = (String) this.f87828c;
                e23.a aVar3 = (e23.a) this.f87829d;
                lVar2.invoke(new jb0.c.a(str9));
                aVar3.invoke();
                return Unit.INSTANCE;
            case 7:
                ib0.g gVar = (ib0.g) this.f87827b;
                ge1.b.T(androidx.lifecycle.v1.a(gVar), null, null, new ib0.h(gVar, new i91.c(z14 ? 1 : 0, (c.q) this.f87828c, (o13.l) this.f87829d), null), 3);
                return Unit.INSTANCE;
            case 8:
                c.q qVar = (c.q) this.f87827b;
                i53.c cVar2 = (i53.c) this.f87828c;
                e23.a aVar4 = (e23.a) this.f87829d;
                ArrayList arrayList4 = new ArrayList(p13.y.r(cVar2, 10));
                Iterator it5 = cVar2.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(((j22.a) it5.next()).f96735b);
                }
                qVar.a(arrayList4.toArray(new String[0]), null);
                aVar4.invoke();
                return Unit.INSTANCE;
            case 9:
                ic0.c cVar3 = (ic0.c) this.f87828c;
                ic0.c.a.C1770a c1770a = (ic0.c.a.C1770a) this.f87829d;
                com.garmin.android.apps.connectmobile.i2.a aVar5 = com.garmin.android.apps.connectmobile.i2.f36769a;
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                aVar5.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "DeviceBatteryStatusRepository", "Closing device connection callback");
                cVar3.f92565d.f58886a.i(c1770a);
                return Unit.INSTANCE;
            case 10:
                p3.p1 p1Var3 = (p3.p1) this.f87827b;
                ic1.e eVar2 = (ic1.e) this.f87828c;
                Context context = (Context) this.f87829d;
                ic1.i.a aVar6 = ic1.i.f92620g;
                hc1.b bVar2 = (hc1.b) p1Var3.getF182175a();
                if (bVar2 != null) {
                    eVar2.b(context, bVar2.f83274a, bVar2.f83276c, bVar2.f83275b);
                }
                return Unit.INSTANCE;
            case 11:
                zc.d dVar4 = (zc.d) this.f87827b;
                mi0.a aVar7 = (mi0.a) this.f87828c;
                ((p3.p1) this.f87829d).setValue(Boolean.TRUE);
                dVar4.e();
                aVar7.getClass();
                ge1.b.T(androidx.lifecycle.v1.a(aVar7), null, null, new mi0.b(aVar7, null), 3);
                return Unit.INSTANCE;
            case 12:
                ge1.b.T((o53.b0) this.f87827b, null, null, new ii0.t((h2.j0) this.f87828c, (List) this.f87829d, null), 3);
                return Unit.INSTANCE;
            case 13:
                ((c.q) this.f87827b).a(((gi0.a) this.f87828c).f((Context) this.f87829d), null);
                return Unit.INSTANCE;
            case 14:
                zc.d dVar5 = (zc.d) this.f87827b;
                zc.d dVar6 = (zc.d) this.f87828c;
                ((p3.p1) this.f87829d).setValue(Boolean.TRUE);
                dVar5.e();
                dVar6.e();
                return Unit.INSTANCE;
            case 15:
                e23.a aVar8 = (e23.a) this.f87827b;
                zc.d dVar7 = (zc.d) this.f87828c;
                ((p3.p1) this.f87829d).setValue(Boolean.TRUE);
                aVar8.invoke();
                dVar7.e();
                return Unit.INSTANCE;
            case 16:
                ManageTripsActivity manageTripsActivity = (ManageTripsActivity) this.f87827b;
                js0.g gVar2 = (js0.g) this.f87828c;
                yr0.o oVar = (yr0.o) this.f87829d;
                ManageTripsActivity.a aVar9 = ManageTripsActivity.f36985h;
                is0.i iVar = (is0.i) manageTripsActivity.f36986a.getValue();
                Long l14 = oVar != null ? oVar.f199036a : null;
                gVar2.getClass();
                if (l14 != null) {
                    w9.a aVarA = androidx.lifecycle.v1.a(iVar);
                    x53.c cVar4 = o53.s0.f129406a;
                    ge1.b.T(aVarA, x53.b.f189152a, null, new is0.g(iVar, l14, gVar2, null), 2);
                }
                ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).T3(true);
                return Unit.INSTANCE;
            case 17:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b bVar3 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b) this.f87827b;
                jz1.b bVar4 = (jz1.b) this.f87828c;
                p3.p1 p1Var4 = (p3.p1) this.f87829d;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b.a aVar10 = com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b.f46192e;
                ht.a.f85464a.getClass();
                ht.a.a(null, "EventPrioritySelectedFromEventFlow");
                if (bVar3.v6().f95876k0) {
                    bVar3.v6().I0 = new jz1.a((dg0.a) p1Var4.getF182175a(), bVar4.f101908e);
                    iz1.i iVarV6 = bVar3.v6();
                    com.garmin.android.apps.connectmobile.g3 g3Var = (com.garmin.android.apps.connectmobile.g3) iVarV6.M0.d();
                    ww1.g gVar3 = (g3Var == null || (bVar = (jz1.b) g3Var.f35301b) == null) ? null : bVar.f101909f;
                    boolean z15 = gVar3 != null ? gVar3.f187763a : false;
                    fg0.j jVar = iVarV6.P;
                    if (jVar != null ? p005kotlin.jvm.internal.s.g(jVar.getIsPrimaryEvent(), Boolean.TRUE) : false) {
                        jz1.a aVar11 = iVarV6.I0;
                        if ((aVar11 != null ? aVar11.f101902a : null) == dg0.a.NO_PRIORITY) {
                            r15 = true;
                        } else {
                            r15 = false;
                        }
                    } else {
                        r15 = false;
                    }
                    fg0.j jVar2 = iVarV6.P;
                    if (jVar2 != null ? p005kotlin.jvm.internal.s.g(jVar2.getIsPrimaryEvent(), Boolean.TRUE) : false) {
                        jz1.a aVar12 = iVarV6.I0;
                        if ((aVar12 != null ? aVar12.f101902a : null) != dg0.a.PRIMARY_EVENT) {
                            r16 = true;
                        } else {
                            r16 = false;
                        }
                    } else {
                        r16 = false;
                    }
                    fg0.j jVar3 = iVarV6.P;
                    if (jVar3 != null ? p005kotlin.jvm.internal.s.g(jVar3.getIsPrimaryEvent(), Boolean.FALSE) : false) {
                        jz1.a aVar13 = iVarV6.I0;
                        r17 = (aVar13 != null ? aVar13.f101902a : null) != dg0.a.PRIMARY_EVENT ? 0 : 1;
                    }
                    if (z15 && (r16 == true || r17 != 0)) {
                        fg0.k kVar = bVar4.f101908e;
                        if (kVar != null) {
                            Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
                            strR = kVar.r(false);
                        }
                        if (strR != null) {
                            Context contextRequireContext = bVar3.requireContext();
                            contextRequireContext.getClass();
                            String string = bVar3.getString(R.string.quit_current_plan_question);
                            string.getClass();
                            lz1.e.f(contextRequireContext, string, bVar3.getString(R.string.update_training_priority_message, strR), R.string.lbl_common_continue, new iz1.f(bVar3, i15));
                        }
                        Unit unit = Unit.INSTANCE;
                    } else if (r15 == true) {
                        ge1.b.T(androidx.lifecycle.v1.a(iVarV6), null, null, new zf0.v0(iVarV6, null), 3);
                    } else {
                        ge1.b.T(androidx.lifecycle.v1.a(iVarV6), null, null, new iz1.k(iVarV6, null), 3);
                    }
                } else if (bVar3.v6().I0 != null) {
                    jz1.a aVar14 = bVar3.v6().I0;
                    if (aVar14 != null) {
                        bVar3.f46194b = true;
                        iz1.i iVarV7 = bVar3.v6();
                        dg0.a aVar15 = aVar14.f101902a;
                        fg0.k kVar2 = aVar14.f101903b;
                        fg0.j jVar4 = iVarV7.P;
                        if ((jVar4 != null ? p005kotlin.jvm.internal.s.g(jVar4.getIsPrimaryEvent(), Boolean.TRUE) : false) && aVar15 == dg0.a.NO_PRIORITY) {
                            ge1.b.T(androidx.lifecycle.v1.a(iVarV7), null, null, new zf0.v0(iVarV7, null), 3);
                        } else {
                            fg0.k kVar3 = iVarV7.I;
                            if (kVar3 != null) {
                                if (kVar3.getEventCustomization() == null) {
                                    kVar3.E0(new fg0.j(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null));
                                }
                                fg0.j eventCustomization = kVar3.getEventCustomization();
                                if (eventCustomization != null) {
                                    int i19 = iz1.i.b.f95877a[aVar15.ordinal()];
                                    if (i19 == 1) {
                                        Boolean bool = Boolean.TRUE;
                                        eventCustomization.G(bool);
                                        eventCustomization.H(bool);
                                    } else if (i19 != 2) {
                                        Boolean bool2 = Boolean.FALSE;
                                        eventCustomization.G(bool2);
                                        eventCustomization.H(bool2);
                                    } else {
                                        eventCustomization.G(Boolean.FALSE);
                                        eventCustomization.H(Boolean.TRUE);
                                    }
                                    if (kVar2 != null) {
                                        fg0.j eventCustomization2 = kVar2.getEventCustomization();
                                        if (eventCustomization2 != null) {
                                            eventCustomization2.G(Boolean.TRUE);
                                        }
                                        fg0.j eventCustomization3 = kVar2.getEventCustomization();
                                        if (eventCustomization3 != null) {
                                            eventCustomization3.H(Boolean.TRUE);
                                        }
                                        iVarV7.W4(kVar3, kVar2);
                                    } else {
                                        iVarV7.W4(kVar3, null);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    bVar3.w6();
                }
                return Unit.INSTANCE;
            case 18:
                w4.a aVar16 = (w4.a) this.f87827b;
                e23.a aVar17 = (e23.a) this.f87828c;
                p3.p1 p1Var5 = (p3.p1) this.f87829d;
                if (!((Boolean) p1Var5.getF182175a()).booleanValue()) {
                    w4.b.f181904b.getClass();
                    w4.d.f181907a.getClass();
                    aVar16.a(w4.d.f181908b);
                    aVar17.invoke();
                    p1Var5.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 19:
                e23.a aVar18 = (e23.a) this.f87827b;
                fe feVar = (fe) this.f87829d;
                String str10 = (String) this.f87828c;
                aVar18.invoke();
                x53.c cVar5 = o53.s0.f129406a;
                ge1.b.T(o53.c0.a(u53.o.f168762a), null, null, new j91.e.c(feVar, str10, null), 3);
                return Unit.INSTANCE;
            case 20:
                u2.h hVar = (u2.h) this.f87827b;
                m4.q qVar2 = (m4.q) this.f87828c;
                kotlin.m3 m3Var2 = (kotlin.m3) this.f87829d;
                u2.i.b(hVar);
                qVar2.y(false);
                if (m3Var2 != null) {
                    m3Var2.hide();
                }
                return Unit.INSTANCE;
            case 21:
                hk1.r rVar = (hk1.r) this.f87827b;
                jk1.f fVar2 = (jk1.f) this.f87829d;
                String str11 = (String) this.f87828c;
                String consumerKey = rVar.getConsumerKey();
                String str12 = consumerKey == null ? "" : consumerKey;
                String consentTypeId = rVar.getConsentTypeId();
                String str13 = consentTypeId == null ? "" : consentTypeId;
                fVar2.getClass();
                ge1.b.T(androidx.lifecycle.v1.a(fVar2), null, null, new jk1.h(fVar2, str11, str12, str13, null), 3);
                return Unit.INSTANCE;
            case 22:
                am.x0 x0Var = (am.x0) this.f87827b;
                am.x0 x0Var2 = (am.x0) this.f87828c;
                o82.g gVar4 = (o82.g) this.f87829d;
                ActivityReportsActivity.a aVar19 = ActivityReportsActivity.f29758a;
                return ParametersHolderKt.parametersOf(x0Var, x0Var2, gVar4);
            case 23:
                gv0.d dVar8 = (gv0.d) this.f87827b;
                p3.x3 x3Var = (p3.x3) this.f87828c;
                p3.p1 p1Var6 = (p3.p1) this.f87829d;
                if (((az0.c.a) x3Var.getF182175a()) != az0.c.a.Available) {
                    p1Var6.setValue(Boolean.TRUE);
                } else if (((com.garmin.android.apps.connectmobile.g3) dVar8.f79200q.getValue()).f35300a != fw.p.LOADING) {
                    ge1.b.T(androidx.lifecycle.v1.a(dVar8), null, null, new gv0.h(dVar8, null), 3);
                }
                return Unit.INSTANCE;
            case 24:
                sy0.j jVar5 = (sy0.j) this.f87827b;
                c12.h hVar2 = (c12.h) this.f87828c;
                jy0.h hVar3 = (jy0.h) this.f87829d;
                String str14 = jVar5.f161226a;
                if (str14 != null) {
                    hVar3.e2(d53.w.i0(str14).toString());
                }
                hVar2.b(jy0.v.e.f101830b);
                return Unit.INSTANCE;
            case 25:
                p3.p1 p1Var7 = (p3.p1) this.f87827b;
                l11.k kVar4 = (l11.k) this.f87828c;
                e23.a aVar20 = (e23.a) this.f87829d;
                p1Var7.setValue(Boolean.FALSE);
                kVar4.f108177b.k(null, new l11.i(null, null, null, false, false, false, false, 127, null));
                aVar20.invoke();
                return Unit.INSTANCE;
            case 26:
                c.q qVar3 = (c.q) this.f87827b;
                Context context2 = (Context) this.f87828c;
                Long l15 = (Long) this.f87829d;
                context2.getClass();
                MSNWorkoutListActivity.f49457a.getClass();
                Intent intent = new Intent(context2, (Class<?>) MSNWorkoutListActivity.class);
                if (l15 != null) {
                    intent.putExtra("GCM_preselected_device_id", l15.longValue());
                }
                qVar3.a(intent, null);
                return Unit.INSTANCE;
            case 27:
                com.garmin.android.apps.connectmobile.developer.tutorials.a aVar21 = (com.garmin.android.apps.connectmobile.developer.tutorials.a) this.f87827b;
                o90.a aVar22 = (o90.a) this.f87828c;
                d90.i iVar2 = (d90.i) this.f87829d;
                com.garmin.android.apps.connectmobile.developer.tutorials.a.C0558a c0558a = com.garmin.android.apps.connectmobile.developer.tutorials.a.f33708e;
                return ParametersHolderKt.parametersOf((String) aVar21.f33710b.getValue(), aVar21.y6(), (String) aVar21.f33712d.getValue(), aVar22, iVar2);
            case 28:
                Long l16 = (Long) this.f87827b;
                com.garmin.android.apps.connectmobile.developer.tutorials.a aVar23 = (com.garmin.android.apps.connectmobile.developer.tutorials.a) this.f87828c;
                d90.h hVar4 = (d90.h) this.f87829d;
                com.garmin.android.apps.connectmobile.developer.tutorials.a.C0558a c0558a2 = com.garmin.android.apps.connectmobile.developer.tutorials.a.f33708e;
                return ParametersHolderKt.parametersOf(l16, (String) aVar23.f33710b.getValue(), aVar23.y6(), (String) aVar23.f33712d.getValue(), hVar4);
            default:
                fj2.f fVar3 = (fj2.f) this.f87827b;
                p3.p1 p1Var8 = (p3.p1) this.f87828c;
                e23.p pVar2 = (e23.p) this.f87829d;
                String str15 = (String) p1Var8.getF182175a();
                String str16 = fVar3.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                if (str15 != null && str16 != null && pVar2 != null) {
                    pVar2.invoke(str15, str16);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d6(Object obj, String str, int i14, Object obj2) {
        this.f87826a = i14;
        this.f87827b = obj;
        this.f87829d = obj2;
        this.f87828c = str;
    }
}
