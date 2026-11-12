package hy;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import b5.a0;
import c2.j0;
import c2.k3;
import c2.l2;
import c2.n0;
import c2.n3;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.connections.groups.details.GroupSettingsActivitiesActivity;
import com.garmin.android.apps.connectmobile.fitness_age.presentation.FitnessAgeReportsActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.JetLagSummaryActivity;
import com.garmin.android.apps.connectmobile.running_tolerance.presentation.RunningToleranceReportsActivity;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import e2.f0;
import f4.w;
import i3.b3;
import i3.bi;
import i3.cb;
import i3.cc;
import i3.e9;
import i3.j6;
import i3.l7;
import i3.mc;
import i3.ph;
import i3.w4;
import i3.x3;
import i3.xa;
import ib0.v;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l3.h1;
import l72.i3;
import lc.k0;
import lc.u0;
import lc.w0;
import n3.s0;
import o4.d0;
import o4.f1;
import o4.l1;
import o4.t0;
import o4.t1;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p13.h0;
import p3.i0;
import p3.p1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f86334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f86335c;

    public /* synthetic */ h(int i14, Object obj, Object obj2) {
        this.f86333a = i14;
        this.f86334b = obj;
        this.f86335c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        long j8;
        Intent intent;
        Object next;
        Serializable serializable;
        Serializable serializable2;
        int i14 = this.f86333a;
        int i15 = 7;
        int i16 = 12;
        byte b14 = 0;
        int i17 = 1;
        DateTime dateTime = null;
        Object obj2 = this.f86335c;
        Object obj3 = this.f86334b;
        switch (i14) {
            case 0:
                e32.l lVar = (e32.l) obj3;
                DateTime dateTime2 = ((i) obj2).f86337b;
                CalendarItemDTO calendarItemDTO = (CalendarItemDTO) obj;
                calendarItemDTO.getClass();
                CalendarItemDTO.b bVar = calendarItemDTO.f30973d;
                switch (bVar != null ? i.a.f86339a[bVar.ordinal()] : -1) {
                    case 1:
                        lVar.I8(new p(new gs1.f(Long.valueOf(calendarItemDTO.T0), Long.valueOf(calendarItemDTO.U0), calendarItemDTO.f30979g, calendarItemDTO.V0, calendarItemDTO.W0, Double.valueOf(calendarItemDTO.f30981h), calendarItemDTO.R0, calendarItemDTO.S0, calendarItemDTO.X0, calendarItemDTO.Y0, Integer.valueOf(calendarItemDTO.C1), Integer.valueOf(calendarItemDTO.D1))));
                        break;
                    case 2:
                        lVar.I8(new a(ly.a.a(calendarItemDTO)));
                        break;
                    case 3:
                    case 4:
                        lVar.I8(new m(calendarItemDTO));
                        break;
                    case 5:
                        lVar.I8(new o(calendarItemDTO.f30999p1, dateTime2));
                        break;
                    case 6:
                    case 7:
                        lVar.I8(new t(calendarItemDTO));
                        break;
                    case 8:
                        lVar.I8(new j(calendarItemDTO));
                        break;
                    case 9:
                        long j14 = calendarItemDTO.L1;
                        lVar.I8(new n(j14 > 0 ? Long.valueOf(j14) : null, calendarItemDTO.D().toLocalDate()));
                        break;
                    default:
                        if (dateTime2 != null && bVar != null) {
                            lVar.I8(new l(bVar, dateTime2));
                        }
                        break;
                }
                return Unit.INSTANCE;
            case 1:
                cc ccVar = (cc) obj3;
                q4.c cVar = (q4.c) obj;
                long j15 = ((b3) obj2).f87558v;
                l2 l2Var = w4.f90071a;
                float f14 = x3.f90191a;
                float fS0 = cVar.s0(f14);
                float fS1 = cVar.s0(f14);
                n3.n.f123126a.getClass();
                float fS2 = cVar.s0(n3.n.f123137l);
                float f15 = 2;
                float f16 = (fS1 - fS2) / f15;
                float f17 = 7;
                float fC = hb.a.c(f17, fS0, Float.intBitsToFloat((int) (cVar.b() >> 32)), f17);
                long j16 = ccVar.f87760a;
                g6.k.a aVar = g6.k.f76003b;
                int i18 = (int) (j16 >> 32);
                int i19 = (int) (j16 & 4294967295L);
                long j17 = ccVar.f87761b;
                int i24 = (int) (j17 >> 32);
                int i25 = (int) (j17 & 4294967295L);
                float f18 = fS0 + fC;
                float f19 = fC / f15;
                float fIntBitsToFloat = (i18 * f18) + (ccVar.f87762c ? fS0 / f15 : 0.0f) + f19;
                float f22 = (i19 * fS1) + f16;
                float f24 = i24 * f18;
                if (ccVar.f87763d) {
                    fS0 /= f15;
                }
                float fIntBitsToFloat2 = f24 + fS0 + f19;
                float f25 = (i25 * fS1) + f16;
                b14 = cVar.getLayoutDirection() == g6.o.Rtl ? (byte) 1 : (byte) 0;
                if (b14 != 0) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (cVar.b() >> 32)) - fIntBitsToFloat;
                    fIntBitsToFloat2 = Float.intBitsToFloat((int) (cVar.b() >> 32)) - fIntBitsToFloat2;
                }
                byte b15 = b14;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f22)) & 4294967295L);
                n4.c.a aVar2 = n4.c.f123541b;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i19 == i25 ? fIntBitsToFloat2 - fIntBitsToFloat : b15 != 0 ? -fIntBitsToFloat : Float.intBitsToFloat((int) (cVar.b() >> 32)) - fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fS2)) & 4294967295L);
                n4.g.a aVar3 = n4.g.f123559b;
                q4.f.A0(cVar, j15, jFloatToRawIntBits, jFloatToRawIntBits2, 0.0f, null, null, 120);
                if (i19 != i25) {
                    for (int i26 = (i25 - i19) - 1; i26 > 0; i26--) {
                        q4.f.A0(cVar, j15, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((i26 * fS1) + f22)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cVar.b() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fS2)) & 4294967295L), 0.0f, null, null, 120);
                    }
                    long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(cVar.getLayoutDirection() == g6.o.Ltr ? 0.0f : Float.intBitsToFloat((int) (cVar.b() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(f25)) & 4294967295L);
                    if (b15 != 0) {
                        fIntBitsToFloat2 -= Float.intBitsToFloat((int) (cVar.b() >> 32));
                    }
                    q4.f.A0(cVar, j15, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fS2)) & 4294967295L), 0.0f, null, null, 120);
                }
                cVar.m1();
                return Unit.INSTANCE;
            case 2:
                return new j6.b(new j6.a((View) obj3, (e23.a) obj2));
            case 3:
                q4.c cVar2 = (q4.c) obj;
                cVar2.m1();
                s1.b<d0, s1.q> bVar2 = ((l7) obj2).f88843k;
                bVar2.getClass();
                q4.f.C1(cVar2, (f1) obj3, new t1(bVar2.e().f128833a, null), 0.0f, null, 60);
                return Unit.INSTANCE;
            case 4:
                s1.b bVar3 = (s1.b) obj2;
                t0 t0Var = (t0) obj;
                float floatValue = ((mc) obj3).f88996e.f109328j.getFloatValue();
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (4294967295L & t0Var.getF128919r()));
                if (!Float.isNaN(floatValue) && !Float.isNaN(fIntBitsToFloat3) && fIntBitsToFloat3 != 0.0f) {
                    float fFloatValue = ((Number) bVar3.e()).floatValue();
                    t0Var.v(e9.d(t0Var, fFloatValue));
                    t0Var.w(e9.e(t0Var, fFloatValue));
                    t0Var.T0(l1.b(0.5f, (floatValue + fIntBitsToFloat3) / fIntBitsToFloat3));
                }
                return Unit.INSTANCE;
            case 5:
                p3.x3 x3Var = (p3.x3) obj3;
                p3.x3 x3Var2 = (p3.x3) obj2;
                q4.f fVar = (q4.f) obj;
                float fS3 = fVar.s0(xa.f90305c);
                long j18 = ((d0) x3Var.getF182175a()).f128833a;
                s0.f123251a.getClass();
                float f26 = 2;
                float f27 = s0.f123254d / f26;
                g6.f.a aVar4 = g6.f.f75994b;
                float f28 = fS3 / f26;
                q4.f.o0(fVar, j18, fVar.s0(f27) - f28, 0L, new q4.k(fS3, 0.0f, 0, 0, null, 30, null), 0, 108);
                if (g6.f.b(((g6.f) x3Var2.getF182175a()).f75997a, 0) > 0) {
                    q4.f.o0(fVar, ((d0) x3Var.getF182175a()).f128833a, fVar.s0(((g6.f) x3Var2.getF182175a()).f75997a) - f28, 0L, q4.j.f142560a, 0, 108);
                }
                return Unit.INSTANCE;
            case 6:
                n0 n0Var = n3.f22788a;
                ((h1) obj3).f109266b.setValue(new j0((k3) obj2, (k3) obj));
                return Unit.INSTANCE;
            case 7:
                cb cbVar = (cb) obj3;
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (b5.r.f((a0) obj, false) >> 32));
                boolean z14 = ((m0) obj2).f105804a;
                if (((Boolean) cbVar.f87755p.getF182175a()).booleanValue()) {
                    fIntBitsToFloat4 = -fIntBitsToFloat4;
                }
                cbVar.e(fIntBitsToFloat4, z14);
                return Unit.INSTANCE;
            case 8:
                i3.p pVar = (i3.p) obj3;
                ph phVar = (ph) obj2;
                q4.c cVar3 = (q4.c) obj;
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(cVar3.s0(g6.g.b(bi.v(pVar))))) << 32) | (((long) Float.floatToRawIntBits(cVar3.s0(g6.g.c(bi.v(pVar))))) & 4294967295L);
                n4.c.a aVar5 = n4.c.f123541b;
                n3.f1.f122826a.getClass();
                float fS4 = ((cVar3.s0(n3.f1.f122833h) / 2.0f) * cVar3.f0(pVar.i())) / cVar3.f0(n3.f1.f122828c);
                long j19 = phVar.f89332b;
                d0.f128823b.getClass();
                long j24 = d0.f128824c;
                o4.q.f128930b.getClass();
                q4.f.o0(cVar3, j24, fS4, jFloatToRawIntBits4, null, 0, 56);
                cVar3.m1();
                q4.f.o0(cVar3, j19, fS4, jFloatToRawIntBits4, null, o4.q.f128941m, 56);
                q4.f.G1(cVar3, j19, n4.h.b(cVar3.b()), n4.c.i(jFloatToRawIntBits4, (4294967295L & ((long) Float.floatToRawIntBits(((float) Math.sin(pVar.f89252f.e().floatValue())) * fS4))) | (((long) Float.floatToRawIntBits(fS4 * ((float) Math.cos(pVar.f89252f.e().floatValue())))) << 32)), cVar3.s0(n3.f1.f122834i), 0, null, o4.q.f128933e, PsExtractor.VIDEO_STREAM_MASK);
                q4.f.o0(cVar3, j19, cVar3.s0(n3.f1.f122831f) / 2, n4.h.b(cVar3.b()), null, 0, 120);
                q4.f.o0(cVar3, phVar.f89335e, fS4, jFloatToRawIntBits4, null, o4.q.f128934f, 56);
                return Unit.INSTANCE;
            case 9:
                ud.a aVar6 = (ud.a) obj;
                com.garmin.android.apps.connectmobile.webtranslation.b.c cVar4 = com.garmin.android.apps.connectmobile.webtranslation.b.f47973e;
                aVar6.getClass();
                ((com.garmin.android.apps.connectmobile.webtranslation.b) obj3).f47975b.c(aVar6, (ArrayList) obj2);
                return Unit.INSTANCE;
            case 10:
                i42.d dVar = (i42.d) obj2;
                ud.a aVar7 = (ud.a) obj;
                com.garmin.android.apps.connectmobile.webtranslation.b.c cVar5 = com.garmin.android.apps.connectmobile.webtranslation.b.f47973e;
                aVar7.getClass();
                com.garmin.android.apps.connectmobile.webtranslation.b.C0936b c0936b = ((com.garmin.android.apps.connectmobile.webtranslation.b) obj3).f47976c;
                c0936b.getClass();
                ud.c cVarM0 = aVar7.M0("INSERT OR ABORT INTO `installation_record` (`id`,`locale`,`version_name`,`tag`) VALUES (nullif(?, 0),?,?,?)");
                try {
                    c0936b.a(cVarM0, dVar);
                    cVarM0.J0();
                    zf.b.h(cVarM0, null);
                    if (g8.i.L(aVar7) == 0) {
                        j8 = -1;
                    } else {
                        ud.c cVarM1 = aVar7.M0("SELECT last_insert_rowid()");
                        try {
                            cVarM1.J0();
                            long j25 = cVarM1.getLong(0);
                            zf.b.h(cVarM1, null);
                            j8 = j25;
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                zf.b.h(cVarM1, th3);
                                throw th4;
                            }
                        }
                    }
                    return Long.valueOf(j8);
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        zf.b.h(cVarM0, th5);
                        throw th6;
                    }
                }
            case 11:
                d91.b bVar4 = (d91.b) obj3;
                p1 p1Var = (p1) obj2;
                p1Var.setValue(((Boolean) obj).booleanValue() ? h0.y0((List) p1Var.getF182175a(), bVar4) : h0.D0((List) p1Var.getF182175a(), bVar4));
                return Unit.INSTANCE;
            case 12:
                androidx.lifecycle.n0 n0Var2 = (androidx.lifecycle.n0) obj3;
                ((i0) obj).getClass();
                androidx.lifecycle.a0 a0Var = new androidx.lifecycle.a0((ib0.g) obj2, 5);
                n0Var2.getF158016a().a(a0Var);
                return new v(n0Var2, a0Var);
            case 13:
                c.q qVar = (c.q) obj3;
                e23.l lVar2 = (e23.l) obj2;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    qVar.a(lVar2.invoke(uri), null);
                }
                return Unit.INSTANCE;
            case 14:
                FitnessAgeReportsActivity fitnessAgeReportsActivity = (FitnessAgeReportsActivity) obj3;
                k0 k0Var = (k0) obj;
                FitnessAgeReportsActivity.a aVar8 = FitnessAgeReportsActivity.f35216c;
                k0Var.getClass();
                nc.n.b(k0Var, com.garmin.android.apps.connectmobile.fitness_age.presentation.b.d.f35228b.f35224a, null, null, null, null, null, null, new z3.e(1359397611, true, new ao1.f(16, fitnessAgeReportsActivity, (lc.m0) obj2)), 254);
                String str = com.garmin.android.apps.connectmobile.fitness_age.presentation.b.C0606b.f35226b.f35224a;
                str.getClass();
                w0 w0Var = k0Var.f111792h;
                lc.a.b bVar5 = new lc.a.b(w0Var);
                HelpActivity.a aVar9 = HelpActivity.f36653a;
                ro0.l lVar3 = ro0.l.FITNESS_AGE;
                bVar5.f111717g = HelpActivity.a.b(aVar9, fitnessAgeReportsActivity, lVar3, null, 12);
                bVar5.l(str);
                ArrayList arrayList = k0Var.f111797m;
                arrayList.add(bVar5);
                String str2 = com.garmin.android.apps.connectmobile.fitness_age.presentation.b.c.f35227b.f35224a;
                str2.getClass();
                lc.a.b bVar6 = new lc.a.b(w0Var);
                bVar6.f111717g = HelpActivity.a.b(aVar9, fitnessAgeReportsActivity, lVar3, null, 8);
                bVar6.l(str2);
                arrayList.add(bVar6);
                String str3 = com.garmin.android.apps.connectmobile.fitness_age.presentation.b.a.f35225b.f35224a;
                str3.getClass();
                lc.a.b bVar7 = new lc.a.b(w0Var);
                bVar7.f111717g = fitnessAgeReportsActivity.f35218b.g(fitnessAgeReportsActivity);
                bVar7.l(str3);
                arrayList.add(bVar7);
                return Unit.INSTANCE;
            case 15:
                zc.d dVar2 = (zc.d) obj3;
                f0 f0Var = (f0) obj;
                f0Var.getClass();
                ii0.a.f93546a.getClass();
                f0.b(f0Var, null, ii0.a.f93547b, 3);
                f0.f(f0Var, dVar2.b(), null, new z3.e(1200953365, true, new ao1.f(18, dVar2, (mi0.a) obj2)), 6);
                return Unit.INSTANCE;
            case 16:
                List list = (List) obj3;
                li0.f fVar2 = (li0.f) obj2;
                f0 f0Var2 = (f0) obj;
                f0Var2.getClass();
                if (list.isEmpty()) {
                    ii0.b.f93557a.getClass();
                    f0.b(f0Var2, null, ii0.b.f93558b, 3);
                } else {
                    f0.f(f0Var2, list.size(), new aq1.d0(list, i16), new z3.e(-1223344429, true, new ao1.f(19, list, fVar2)), 4);
                }
                return Unit.INSTANCE;
            case 17:
                gi0.a aVar10 = (gi0.a) obj3;
                Context context = (Context) obj2;
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                String str4 = i3Var.f111063a;
                if (p005kotlin.jvm.internal.s.g(str4, "MENU_ITEM_SHARE")) {
                    aVar10.c(context);
                } else if (p005kotlin.jvm.internal.s.g(str4, "MENU_ITEM_DISCOVER")) {
                    context.startActivity(aVar10.d(context));
                }
                return Unit.INSTANCE;
            case 18:
                zc.d dVar3 = (zc.d) obj3;
                e23.a aVar11 = (e23.a) obj2;
                f.a aVar12 = (f.a) obj;
                aVar12.getClass();
                if (aVar12.f67585a == -1 && (intent = aVar12.f67586b) != null) {
                    boolean booleanExtra = intent.getBooleanExtra("HAS_REQUEST_ACCEPTED", true);
                    boolean booleanExtra2 = intent.getBooleanExtra("HAS_REQUEST_DECLINED", true);
                    if (booleanExtra) {
                        dVar3.e();
                        aVar11.invoke();
                    } else if (booleanExtra2) {
                        aVar11.invoke();
                    }
                }
                return Unit.INSTANCE;
            case 19:
                e23.q qVar2 = (e23.q) obj3;
                hk1.r rVar = (hk1.r) obj2;
                hk1.i.a aVar13 = (hk1.i.a) obj;
                aVar13.getClass();
                hk1.n nVar = aVar13.f84155b ? hk1.n.ADD : hk1.n.REMOVE;
                String consumerKey = rVar.getConsumerKey();
                if (consumerKey == null) {
                    consumerKey = "";
                }
                qVar2.invoke(consumerKey, aVar13.f84154a, nVar);
                return Unit.INSTANCE;
            case 20:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                hk1.d dVar4 = ((hk1.i.a) obj2).f84154a;
                dVar4.getClass();
                ((e23.l) obj3).invoke(new hk1.i.a(dVar4, zBooleanValue));
                return Unit.INSTANCE;
            case 21:
                RecyclerView.f0 f0Var3 = (RecyclerView.f0) obj3;
                List list2 = (List) obj2;
                zm.p pVar2 = (zm.p) obj;
                im.k.a aVar14 = im.k.f94150e;
                Integer numValueOf = pVar2 != null ? Integer.valueOf(pVar2.getB1()) : null;
                bq.c cVar6 = ((im.q) f0Var3).f94177p;
                com.garmin.android.apps.connectmobile.activities.charts.b bVar8 = (com.garmin.android.apps.connectmobile.activities.charts.b) f0Var3;
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        int iG1 = ((nr.b) next).f126986d.getB1();
                        if (numValueOf != null && iG1 == numValueOf.intValue()) {
                        }
                    } else {
                        next = null;
                    }
                }
                nr.b bVar9 = (nr.b) next;
                List<r22.p> list3 = bVar9 != null ? bVar9.f126985c : null;
                if (list3 == null) {
                    list3 = p13.j0.f134944a;
                }
                cVar6.getClass();
                list3.getClass();
                if (list3.isEmpty()) {
                    bVar8.j(false);
                } else {
                    r22.p pVar3 = list3.get(0);
                    bVar8.h(true);
                    String str5 = pVar3.f149774a;
                    String str6 = pVar3.f149775b;
                    bVar8.e(str5, pVar3.f149776c, str6, pVar3.f149780g);
                    if (list3.size() >= 2) {
                        r22.p pVar4 = list3.get(1);
                        bVar8.i(true);
                        bVar8.g(pVar4.f149774a, pVar4.f149776c, str6, null);
                    } else {
                        bVar8.i(false);
                    }
                }
                return Unit.INSTANCE;
            case 22:
                sm1.s sVar = (sm1.s) obj3;
                String str7 = (String) obj;
                str7.getClass();
                km1.v vVar = (km1.v) ((p1) obj2).getF182175a();
                sVar.I4(str7, vVar != null ? km1.v.r(vVar) : null);
                return Unit.INSTANCE;
            case 23:
                double dLongValue = ((Long) obj).longValue();
                l3.f23124b.getClass();
                return l3.a.k0((l22.a) obj3, dLongValue, true, (String) obj2);
            case 24:
                ud.a aVar15 = (ud.a) obj;
                com.garmin.android.apps.connectmobile.activities.stats.exercises.database.a.b bVar10 = com.garmin.android.apps.connectmobile.activities.stats.exercises.database.a.f29923c;
                aVar15.getClass();
                ((com.garmin.android.apps.connectmobile.activities.stats.exercises.database.a) obj3).f29925b.d(aVar15, (iq.c) obj2);
                return Unit.INSTANCE;
            case 25:
                Bundle bundle = (Bundle) obj3;
                JetLagSummaryActivity jetLagSummaryActivity = (JetLagSummaryActivity) obj2;
                List list4 = (List) obj;
                JetLagSummaryActivity.a aVar16 = JetLagSummaryActivity.f36977o;
                if (list4 != null && (!list4.isEmpty())) {
                    if (bundle != null) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable2 = bundle.getSerializable("EXTRA_INITIAL_DATE", DateTime.class);
                        } else {
                            Serializable serializable3 = bundle.getSerializable("EXTRA_INITIAL_DATE");
                            serializable2 = (DateTime) (serializable3 instanceof DateTime ? serializable3 : null);
                        }
                        dateTime = (DateTime) serializable2;
                    } else {
                        Bundle extras = jetLagSummaryActivity.getIntent().getExtras();
                        if (extras != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = extras.getSerializable("EXTRA_INITIAL_DATE", DateTime.class);
                            } else {
                                Serializable serializable4 = extras.getSerializable("EXTRA_INITIAL_DATE");
                                serializable = (DateTime) (serializable4 instanceof DateTime ? serializable4 : null);
                            }
                            dateTime = (DateTime) serializable;
                        }
                    }
                    jetLagSummaryActivity.qa().setAdapter(jetLagSummaryActivity.sa(dateTime));
                }
                return Unit.INSTANCE;
            case 26:
                e23.l lVar4 = (e23.l) obj2;
                ((Integer) obj).getClass();
                qu0.f fVar3 = ((qu0.e) obj3).f147891e;
                if (fVar3 != null) {
                    lVar4.invoke(fVar3);
                }
                return Unit.INSTANCE;
            case 27:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b bVar11 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b) obj3;
                View view2 = (View) obj2;
                g3 g3Var = (g3) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b.a aVar17 = com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b.f46192e;
                int i27 = com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b.C0895b.f46197a[g3Var.f35300a.ordinal()];
                if (i27 == 1) {
                    g22.e.l(bVar11);
                } else if (i27 == 2) {
                    jz1.b bVar12 = (jz1.b) g3Var.f35301b;
                    if (bVar12 != null) {
                        g22.e.f(bVar11);
                        ((ComposeView) view2.findViewById(R.id.composable_container)).setContent(new z3.e(964217892, true, new iz1.e(bVar11, bVar12, i17, b14)));
                    }
                } else {
                    if (i27 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(bVar11);
                }
                return Unit.INSTANCE;
            case 28:
                w wVar = (w) obj3;
                p1 p1Var2 = (p1) obj2;
                GroupSettingsActivitiesActivity.a aVar18 = GroupSettingsActivitiesActivity.f31417b;
                p1Var2.setValue((String) obj);
                String str8 = (String) p1Var2.getF182175a();
                if (str8 == null || d53.w.J(str8)) {
                    wVar.remove(com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_OTHER);
                } else {
                    wVar.add(com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_OTHER);
                }
                return Unit.INSTANCE;
            default:
                RunningToleranceReportsActivity runningToleranceReportsActivity = (RunningToleranceReportsActivity) obj3;
                lc.m0 m0Var = (lc.m0) obj2;
                k0 k0Var2 = (k0) obj;
                RunningToleranceReportsActivity.a aVar19 = RunningToleranceReportsActivity.f41161b;
                k0Var2.getClass();
                nc.n.b(k0Var2, com.garmin.android.apps.connectmobile.running_tolerance.presentation.c.C0781c.f41171b.f41168a, null, null, null, null, null, null, new z3.e(-603594756, true, new ao1.f(22, runningToleranceReportsActivity, m0Var)), 254);
                String str9 = com.garmin.android.apps.connectmobile.running_tolerance.presentation.c.b.f41170b.f41168a;
                str9.getClass();
                lc.a.b bVar13 = new lc.a.b(k0Var2.f111792h);
                bVar13.f111717g = HelpActivity.a.b(HelpActivity.f36653a, runningToleranceReportsActivity, ro0.l.RUNNING_TOLERANCE, null, 12);
                bVar13.l(str9);
                k0Var2.f111797m.add(bVar13);
                nc.n.b(k0Var2, com.garmin.android.apps.connectmobile.running_tolerance.presentation.c.a.f41169b.f41168a, null, null, null, null, null, null, new z3.e(-863568333, true, new b21.m(m0Var, i15)), 254);
                return Unit.INSTANCE;
        }
    }
}
