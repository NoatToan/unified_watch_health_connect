package gw1;

import am.x0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.lifecycle.v1;
import b63.o;
import b63.v;
import c.q;
import c2.h2;
import c2.l2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.reports.ActivityReportsActivity;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.s2;
import e2.f0;
import e23.l;
import e23.p;
import e23.r;
import g2.m1;
import hl1.n;
import ho0.m;
import i3.cf;
import i3.df;
import i3.mc;
import i3.na;
import i3.w4;
import ib0.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jy0.i0;
import l3.t1;
import l72.i3;
import lc.k0;
import lc.m0;
import lc.u0;
import o4.c0;
import o53.b0;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.o0;
import p005kotlin.jvm.internal.q0;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.u;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f79838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f79839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f79840d;

    public /* synthetic */ d(q qVar, Object obj, Object obj2, int i14) {
        this.f79837a = i14;
        this.f79840d = qVar;
        this.f79838b = obj;
        this.f79839c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:198:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:202:0x0724  */
    /* JADX WARN: Code duplicated, block: B:208:0x0741 A[LOOP:5: B:206:0x073b->B:208:0x0741, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:268:0x0733 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x071e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Iterable, java.lang.Object] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        com.garmin.android.apps.connectmobile.training.fbtap.workouts.a aVar;
        h82.c.b bVar;
        ArrayList<h82.c.b> arrayList;
        Object value;
        Object value2;
        Bundle extras;
        int i14 = this.f79837a;
        int i15 = 6;
        boolean z14 = false;
        z14 = false;
        z14 = false;
        final int i16 = 1;
        Object obj2 = null;
        Object obj3 = this.f79840d;
        Object obj4 = this.f79839c;
        Object obj5 = this.f79838b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.training.fbtap.workouts.a aVar2 = (com.garmin.android.apps.connectmobile.training.fbtap.workouts.a) obj5;
                pi0.e eVar = (pi0.e) obj4;
                q qVar = (q) obj3;
                f0 f0Var = (f0) obj;
                com.garmin.android.apps.connectmobile.training.fbtap.workouts.a.C0878a c0878a = com.garmin.android.apps.connectmobile.training.fbtap.workouts.a.f45566c;
                f0Var.getClass();
                ?? r14 = aVar2.f45567a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj6 : r14) {
                    DateTime dateTime = ((iw1.a) obj6).f95330q;
                    String strA = dateTime != null ? eVar.a(dateTime, qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY_WEEKDAY) : "";
                    Object arrayList2 = linkedHashMap.get(strA);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(strA, arrayList2);
                    }
                    ((List) arrayList2).add(obj6);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    if (list != null && list.isEmpty()) {
                        aVar = aVar2;
                    }
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            aVar = aVar2;
                        }
                        if (!((iw1.a) it.next()).X) {
                            aVar = aVar2;
                            f0.b(f0Var, null, new z3.e(965929848, true, new fb0.b(str, list, aVar, qVar, 6)), 3);
                        }
                        break;
                        break;
                    }
                    break;
                    aVar2 = aVar;
                }
                return Unit.INSTANCE;
            case 1:
                i21.d dVar = (i21.d) obj5;
                n82.f fVar = (n82.f) obj3;
                b11.i iVar = (b11.i) obj;
                iVar.getClass();
                boolean z15 = ((x01.e) obj4).f188255d == x01.f.ACTIVE;
                o oVar = fVar.b().f130843a;
                i53.f fVarA = i53.a.a(iVar);
                dVar.getClass();
                oVar.getClass();
                fVarA.getClass();
                ge1.b.T(v1.a(dVar), null, null, new i21.e(dVar, oVar, fVarA, z15, null), 3);
                return Unit.INSTANCE;
            case 2:
                v vVar = (v) obj;
                vVar.getClass();
                ((p) obj5).invoke(b63.q.a(((o82.a) obj4).f130843a, vVar), Boolean.valueOf(((g21.g) obj3).f75423c));
                return Unit.INSTANCE;
            case 3:
                i50.j jVar = (i50.j) obj5;
                f0 f0Var2 = (f0) obj;
                f0Var2.getClass();
                i53.c<i50.f> cVar = jVar.f91779a;
                f0Var2.a(cVar.size(), new h50.j.e(new h02.a(12), cVar), new h50.j.f(h50.j.d.f82056a, cVar), new z3.e(802480018, true, new h50.j.g(cVar, jVar, (l) obj4, (i50.i) obj3)));
                return Unit.INSTANCE;
            case 4:
                h82.c cVar2 = (h82.c) obj4;
                m0 m0Var = (m0) obj3;
                k0 k0Var = (k0) obj;
                h82.c.a aVar3 = h82.c.f82428d;
                k0Var.getClass();
                int i17 = h82.c.e.f82439a[((i82.a) obj5).ordinal()];
                if (i17 == 1) {
                    for (final h82.c.b bVar2 : cVar2.f82431b) {
                        String str2 = bVar2.f82433a;
                        final int i18 = z14 ? 1 : 0;
                        l82.a.a(k0Var, str2, new z3.e(-1262363156, true, new r() { // from class: h82.b
                            @Override // e23.r
                            public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                                int i19 = i18;
                                c.b bVar3 = bVar2;
                                r1.l lVar = (r1.l) obj7;
                                lc.v vVar2 = (lc.v) obj8;
                                p3.m mVar = (p3.m) obj9;
                                ((Integer) obj10).getClass();
                                c.a aVar4 = c.f82428d;
                                switch (i19) {
                                    case 0:
                                        lVar.getClass();
                                        vVar2.getClass();
                                        x1 x1Var = p3.n.f135158a;
                                        bVar3.f82436d.invoke(bVar3.f82433a, mVar, 0);
                                        break;
                                    default:
                                        lVar.getClass();
                                        vVar2.getClass();
                                        x1 x1Var2 = p3.n.f135158a;
                                        bVar3.f82436d.invoke(null, mVar, 6);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }));
                    }
                    cVar2.f82430a = new h82.c.C1631c(m0Var);
                } else {
                    if (i17 != 2) {
                        u0.r();
                        return null;
                    }
                    for (Object obj7 : cVar2.f82431b) {
                        if (s.g(((h82.c.b) obj7).f82433a, "DEFAULT_ACTION")) {
                            obj2 = obj7;
                            bVar = (h82.c.b) obj2;
                            if (bVar != null) {
                                l82.a.a(k0Var, bVar.f82433a, new z3.e(-1445632825, true, new ao1.f(14, cVar2, bVar)));
                            }
                            List<h82.c.b> list2 = cVar2.f82431b;
                            arrayList = new ArrayList();
                            for (Object obj8 : list2) {
                                if (!s.g(((h82.c.b) obj8).f82433a, "DEFAULT_ACTION")) {
                                    arrayList.add(obj8);
                                }
                            }
                            for (final h82.c.b bVar3 : arrayList) {
                                l82.a.a(k0Var, fb1.c.n("DEFAULT_ACTION/", bVar3.f82433a), new z3.e(715968341, true, new r() { // from class: h82.b
                                    @Override // e23.r
                                    public final Object invoke(Object obj9, Object obj10, Object obj11, Object obj12) {
                                        int i19 = i16;
                                        c.b bVar4 = bVar3;
                                        r1.l lVar = (r1.l) obj9;
                                        lc.v vVar2 = (lc.v) obj10;
                                        p3.m mVar = (p3.m) obj11;
                                        ((Integer) obj12).getClass();
                                        c.a aVar4 = c.f82428d;
                                        switch (i19) {
                                            case 0:
                                                lVar.getClass();
                                                vVar2.getClass();
                                                x1 x1Var = p3.n.f135158a;
                                                bVar4.f82436d.invoke(bVar4.f82433a, mVar, 0);
                                                break;
                                            default:
                                                lVar.getClass();
                                                vVar2.getClass();
                                                x1 x1Var2 = p3.n.f135158a;
                                                bVar4.f82436d.invoke(null, mVar, 6);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }));
                            }
                        }
                    }
                    bVar = (h82.c.b) obj2;
                    if (bVar != null) {
                        l82.a.a(k0Var, bVar.f82433a, new z3.e(-1445632825, true, new ao1.f(14, cVar2, bVar)));
                    }
                    List<h82.c.b> list3 = cVar2.f82431b;
                    arrayList = new ArrayList();
                    while (r2.hasNext()) {
                        if (!s.g(((h82.c.b) obj8).f82433a, "DEFAULT_ACTION")) {
                            arrayList.add(obj8);
                        }
                    }
                    while (r2.hasNext()) {
                        l82.a.a(k0Var, fb1.c.n("DEFAULT_ACTION/", bVar3.f82433a), new z3.e(715968341, true, new r() { // from class: h82.b
                            @Override // e23.r
                            public final Object invoke(Object obj9, Object obj10, Object obj11, Object obj12) {
                                int i19 = i16;
                                c.b bVar4 = bVar3;
                                r1.l lVar = (r1.l) obj9;
                                lc.v vVar2 = (lc.v) obj10;
                                p3.m mVar = (p3.m) obj11;
                                ((Integer) obj12).getClass();
                                c.a aVar4 = c.f82428d;
                                switch (i19) {
                                    case 0:
                                        lVar.getClass();
                                        vVar2.getClass();
                                        x1 x1Var = p3.n.f135158a;
                                        bVar4.f82436d.invoke(bVar4.f82433a, mVar, 0);
                                        break;
                                    default:
                                        lVar.getClass();
                                        vVar2.getClass();
                                        x1 x1Var2 = p3.n.f135158a;
                                        bVar4.f82436d.invoke(null, mVar, 6);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }));
                    }
                }
                return Unit.INSTANCE;
            case 5:
                x3 x3Var = (x3) obj5;
                e23.s sVar = (e23.s) obj4;
                hl1.c cVar3 = (hl1.c) obj3;
                ((f.a) obj).getClass();
                zf2.d dVar2 = ((hl1.b) x3Var.getF182175a()).f84360d;
                if (dVar2 != null) {
                    sVar.invoke(dVar2, Boolean.TRUE, Boolean.valueOf(((hl1.b) x3Var.getF182175a()).f84359c.contains(dVar2)), Boolean.valueOf(((hl1.b) x3Var.getF182175a()).f84361e), Boolean.valueOf(((hl1.b) x3Var.getF182175a()).f84362f));
                    cVar3.x4(null);
                }
                return Unit.INSTANCE;
            case 6:
                x3 x3Var2 = (x3) obj5;
                e23.s sVar2 = (e23.s) obj4;
                n nVar = (n) obj3;
                ((f.a) obj).getClass();
                zf2.d dVar3 = ((hl1.f) x3Var2.getF182175a()).f84390g;
                if (dVar3 != null) {
                    sVar2.invoke(dVar3, Boolean.TRUE, Boolean.valueOf(((hl1.f) x3Var2.getF182175a()).f84389f.contains(dVar3)), Boolean.valueOf(((hl1.f) x3Var2.getF182175a()).f84391h), Boolean.valueOf(((hl1.f) x3Var2.getF182175a()).f84392i));
                    nVar.z4(null);
                }
                return Unit.INSTANCE;
            case 7:
                gs1.d.b bVar4 = (gs1.d.b) obj;
                bVar4.getClass();
                ge1.b.T((b0) obj5, null, null, new m.e((mc) obj3, null), 3);
                ((qo0.a) obj4).x4(bVar4);
                return Unit.INSTANCE;
            case 8:
                n82.f fVar2 = (n82.f) obj5;
                qo0.a aVar4 = (qo0.a) obj3;
                fVar2.d((o82.g) ((i53.f) obj4).get(((Integer) obj).intValue()));
                o82.g gVarA = fVar2.f124961b.a();
                aVar4.getClass();
                gVarA.getClass();
                p2 p2Var = aVar4.f145920e;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, qo0.d.a((qo0.d) value, false, false, false, false, null, gVarA, null, false, 223)));
                return Unit.INSTANCE;
            case 9:
                hq2.g gVar = (hq2.g) obj5;
                ul2.c cVar4 = (ul2.c) obj4;
                String str3 = (String) obj3;
                byte[] bArr = (byte[]) obj;
                int i19 = hq2.g.f85248g;
                bArr.getClass();
                short s8 = hq2.r.s(bArr);
                iq2.c cVarA = new iq2.a().a(u.W(hq2.r.v(bArr).f85277b, new j23.l(32, 47)));
                cVar4.getClass();
                gVar.getClass();
                hq2.a.f85231a.getClass();
                e13.o oVarM = as2.h.m(cVar4, hq2.a.f85235e, "Failed to getTransactionRecords1");
                gw.j jVar2 = new gw.j(new m1(24, gVar, cVar4), 25);
                int i24 = w03.b.f181178a;
                return new e13.o(new e13.j(oVarM, jVar2), new gw.j(new hq2.e(str3, s8, cVarA, gVar, 0), 13));
            case 10:
                hq2.n nVar2 = (hq2.n) obj5;
                ul2.c cVar5 = (ul2.c) obj4;
                String str4 = (String) obj3;
                byte[] bArr2 = (byte[]) obj;
                int i25 = hq2.n.f85263g;
                bArr2.getClass();
                short s14 = hq2.r.s(bArr2);
                iq2.c cVarA2 = new iq2.b().a(u.W(hq2.r.v(bArr2).f85277b, new j23.l(32, 47)));
                cVar5.getClass();
                nVar2.getClass();
                hq2.j.f85251a.getClass();
                e13.o oVarM2 = as2.h.m(cVar5, hq2.j.f85256f, "Failed to getTransactionRecords1");
                gw.j jVar3 = new gw.j(new m1(24, nVar2, cVar5), 25);
                int i26 = w03.b.f181178a;
                return new e13.o(new e13.j(oVarM2, jVar3), new gw.j(new hq2.e(str4, s14, cVarA2, nVar2, 1), 20));
            case 11:
                q0 q0Var = (q0) obj5;
                o0 o0Var = (o0) obj4;
                i02.p pVar = (i02.p) obj3;
                long jLongValue = ((Long) obj).longValue();
                long j8 = q0Var.f105808a;
                if (j8 == 0) {
                    q0Var.f105808a = jLongValue;
                } else {
                    o0Var.f105806a = pVar.b(pVar.f86886b, jLongValue - j8);
                }
                return Unit.INSTANCE;
            case 12:
                Long l14 = (Long) obj5;
                Long l15 = (Long) obj4;
                p pVar2 = (p) obj3;
                Long l16 = (Long) obj;
                long jLongValue2 = l16.longValue();
                l2 l2Var = w4.f90071a;
                if (!(l14 == null && l15 == null) && ((l14 == null || l15 == null) && l14 != null && jLongValue2 >= l14.longValue())) {
                    pVar2.invoke(l14, l16);
                } else {
                    pVar2.invoke(l16, null);
                }
                return Unit.INSTANCE;
            case 13:
                h2 h2Var = (h2) obj4;
                h4.d.b bVar5 = (h4.d.b) obj3;
                q4.c cVar6 = (q4.c) obj;
                long j14 = ((n4.g) ((t1) obj5).invoke()).f123561a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j14 >> 32));
                if (fIntBitsToFloat > 0.0f) {
                    float fS0 = cVar6.s0(na.f89071a);
                    float fS1 = cVar6.s0(h2Var.b(cVar6.getLayoutDirection()));
                    float fA = bVar5.a(MathKt.c(fIntBitsToFloat), MathKt.c((Float.intBitsToFloat((int) (cVar6.b() >> 32)) - fS1) - cVar6.s0(h2Var.c(cVar6.getLayoutDirection()))), cVar6.getLayoutDirection()) + fS1;
                    float f14 = 2;
                    float f15 = fIntBitsToFloat / f14;
                    float f16 = fA + f15;
                    float f17 = (f16 - f15) - fS0;
                    float f18 = f17 < 0.0f ? 0.0f : f17;
                    float f19 = f16 + f15 + fS0;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cVar6.b() >> 32));
                    float f22 = f19 > fIntBitsToFloat2 ? fIntBitsToFloat2 : f19;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j14 & 4294967295L));
                    float f24 = (-fIntBitsToFloat3) / f14;
                    float f25 = fIntBitsToFloat3 / f14;
                    c0.f128819b.getClass();
                    q4.a.b f142543b = cVar6.getF142543b();
                    long jB = f142543b.b();
                    f142543b.a().l();
                    try {
                        f142543b.f142550a.a(f18, f24, f22, f25, 0);
                        cVar6.m1();
                    } finally {
                        tn.k.p(f142543b, jB);
                    }
                } else {
                    cVar6.m1();
                }
                return Unit.INSTANCE;
            case 14:
                return new cf((df) obj, (g6.c) obj5, (l) obj4, (l) obj3);
            case 15:
                q qVar2 = (q) obj3;
                q qVar3 = (q) obj5;
                o13.l lVar = (o13.l) obj4;
                jb0.b bVar6 = (jb0.b) obj;
                bVar6.getClass();
                int i27 = w.a.f92512a[bVar6.ordinal()];
                if (i27 == 1) {
                    Uri uri = (Uri) lVar.getValue();
                    uri.getClass();
                    qVar2.a(uri, null);
                } else if (i27 == 2) {
                    qVar3.a("image/*", null);
                }
                return Unit.INSTANCE;
            case 16:
                q qVar4 = (q) obj3;
                l lVar2 = (l) obj5;
                Uri uri2 = (Uri) obj4;
                if (((Boolean) obj).booleanValue()) {
                    qVar4.a(lVar2.invoke(uri2), null);
                }
                return Unit.INSTANCE;
            case 17:
                l lVar3 = (l) obj5;
                jb0.a aVar5 = (jb0.a) obj4;
                l lVar4 = (l) obj3;
                Map map = (Map) obj;
                map.getClass();
                if (map.isEmpty()) {
                    lVar3.invoke(((jb0.a.C1877a) aVar5).f98100a);
                } else {
                    Iterator it3 = map.entrySet().iterator();
                    while (it3.hasNext()) {
                        if (!((Boolean) ((Map.Entry) it3.next()).getValue()).booleanValue()) {
                            lVar4.invoke(((jb0.a.C1877a) aVar5).f98100a);
                        }
                    }
                    lVar3.invoke(((jb0.a.C1877a) aVar5).f98100a);
                }
                return Unit.INSTANCE;
            case 18:
                e23.a aVar6 = (e23.a) obj5;
                Activity activity = (Activity) obj4;
                View view2 = (View) obj3;
                if (((Boolean) obj).booleanValue()) {
                    aVar6.invoke();
                } else if (activity != null) {
                    r22.q0.b bVar7 = r22.q0.f149800b;
                    j22.b bVar8 = j22.b.f96736a;
                    j22.a aVar7 = j22.a.f96717f;
                    bVar8.getClass();
                    String strG = j22.b.g(aVar7);
                    String strG2 = j22.b.g(aVar7);
                    bVar7.getClass();
                    r22.q0 q0VarB = r22.q0.b.b(view2, strG, strG2, 1);
                    q0VarB.b(R.string.lbl_settings, new ii0.j(activity, z14 ? 1 : 0));
                    q0VarB.show();
                }
                return Unit.INSTANCE;
            case 19:
                zc.d dVar4 = (zc.d) obj5;
                f0 f0Var3 = (f0) obj;
                f0Var3.getClass();
                f0.f(f0Var3, dVar4.b(), new zc.a(new ig2.d(9), dVar4), new z3.e(384983126, true, new i91.e(dVar4, i15, (li0.f) obj4, (String) obj3)), 4);
                return Unit.INSTANCE;
            case 20:
                n82.f fVar3 = (n82.f) obj5;
                ix.j jVar4 = (ix.j) obj3;
                fVar3.d((o82.g) ((i53.f) obj4).get(((Integer) obj).intValue()));
                if (fVar3.f124961b.a() != o82.g.f130850c) {
                    p2 p2Var2 = jVar4.f95627g;
                    do {
                        value2 = p2Var2.getValue();
                    } while (!p2Var2.b(value2, ix.l.a((ix.l) value2, false, null, null, true, false, false, false, false, null, 503)));
                }
                return Unit.INSTANCE;
            case 21:
                Context context = (Context) obj5;
                ix.j jVar5 = (ix.j) obj4;
                p1 p1Var = (p1) obj3;
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                if (s.g(i3Var.f111063a, "HELP")) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("EXTRA_IS_FROM_SUMMARY", ((ix.l) p1Var.getF182175a()).f95664d);
                    bx.a aVar8 = (bx.a) jVar5.f95631k.getF182175a();
                    bundle.putParcelable("EXTRA_TIMELINE_DTO", aVar8 != null ? aVar8.f21603b : null);
                    Double d14 = jVar5.f95632l;
                    bundle.putDouble("EXTRA_BODY_BATTERY_VERSION", d14 != null ? d14.doubleValue() : 1.0d);
                    bundle.putBoolean("EXTRA_SHOW_BODY_BATTERY_TRUE_UP", jVar5.f95633m);
                    HelpActivity.a aVar9 = HelpActivity.f36653a;
                    ro0.l lVar5 = ro0.l.BODY_BATTERY;
                    aVar9.getClass();
                    HelpActivity.a.d(context, lVar5, null, bundle);
                }
                return Unit.INSTANCE;
            case 22:
                tz.a aVar10 = (tz.a) obj5;
                ((CustomLineChart) obj).getClass();
                ((f00.c) aVar10.f167286c.getF173486i()).d();
                aVar10.c();
                qz.a.b(aVar10, (sy0.l) obj4, ((Context) obj3).getString(R.string.no_data_label), 4);
                return Unit.INSTANCE;
            case 23:
                j02.s sVar3 = (j02.s) obj5;
                l lVar6 = (l) obj3;
                j02.g gVar2 = (j02.g) obj;
                int i28 = j02.s.f96125v;
                gVar2.getClass();
                long jD = gVar2.d();
                g6.k.a aVar11 = g6.k.f76003b;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (jD >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jD & 4294967295L))) & 4294967295L);
                n4.c.a aVar12 = n4.c.f123541b;
                if (sVar3.f96134i.invoke((n4.d) obj4, g8.i.g(jFloatToRawIntBits, g6.n.c(gVar2.a()))).booleanValue() && sVar3.f96143r.contains(gVar2.getKey()) && ((Boolean) lVar6.invoke(gVar2)).booleanValue()) {
                    z14 = true;
                }
                return Boolean.valueOf(z14);
            case 24:
                lg0.c cVar7 = (lg0.c) obj5;
                r70.q qVar5 = (r70.q) obj4;
                Context context2 = (Context) obj3;
                f.a aVar13 = (f.a) obj;
                aVar13.getClass();
                Intent intent = aVar13.f67586b;
                if (intent != null && (extras = intent.getExtras()) != null) {
                    Object[] objArr = extras.containsKey("extra_event_unsubscribed") || extras.containsKey("GCM_extra_event_deleted");
                    boolean zContainsKey = extras.containsKey("extra_linked_training_plan_deleted");
                    boolean z16 = extras.getBoolean("GCM_extra_event_updated", false);
                    if (zContainsKey && cVar7 != null) {
                        e23.a<Unit> aVar14 = cVar7.f112170g;
                        if (aVar14 != null) {
                            aVar14.invoke();
                        }
                    } else if (z16 && cVar7 != null) {
                        e23.a<Unit> aVar15 = cVar7.f112172i;
                        if (aVar15 != null) {
                            aVar15.invoke();
                        }
                    } else if (objArr != false) {
                        if (cVar7 != null) {
                            e23.a<Unit> aVar16 = cVar7.f112171h;
                            if (aVar16 != null) {
                                aVar16.invoke();
                            }
                        } else {
                            String string = extras.getString("GCM_extra_event_name");
                            if (string != null) {
                                String string2 = context2.getString(R.string.event_removed_from_calendar, string);
                                string2.getClass();
                                r70.q.d(qVar5, string2, null, 30);
                                Unit unit = Unit.INSTANCE;
                                ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).T3(true);
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            case 25:
                f5.v1.a aVar17 = (f5.v1.a) obj;
                aVar17.getClass();
                f5.v1.a.B(aVar17, (f5.v1) obj5, 0, 0);
                f5.v1.a.B(aVar17, (f5.v1) obj4, 0, ((p003ji0.a) obj3).f98765a.getIntValue());
                return Unit.INSTANCE;
            case 26:
                x0 x0Var = (x0) obj;
                ActivityReportsActivity.a aVar18 = ActivityReportsActivity.f29758a;
                x0Var.getClass();
                Context applicationContext = ((ActivityReportsActivity) obj3).getApplicationContext();
                applicationContext.getClass();
                ((f.c) obj5).a(((am.d) obj4).v(applicationContext, x0Var, null), null);
                return Unit.INSTANCE;
            case 27:
                com.garmin.android.apps.connectmobile.topoactivemaps.a aVar19 = (com.garmin.android.apps.connectmobile.topoactivemaps.a) obj5;
                iz1.f fVar4 = (iz1.f) obj4;
                com.garmin.android.apps.connectmobile.devices.model.l lVar7 = (com.garmin.android.apps.connectmobile.devices.model.l) obj3;
                g3 g3Var = (g3) obj;
                com.garmin.android.apps.connectmobile.topoactivemaps.a.C0862a c0862a = com.garmin.android.apps.connectmobile.topoactivemaps.a.f45072e;
                int i29 = com.garmin.android.apps.connectmobile.topoactivemaps.a.b.f45076a[g3Var.f35300a.ordinal()];
                if (i29 == 1) {
                    g22.e.f(aVar19);
                    hv.b bVar9 = (hv.b) g3Var.f35301b;
                    if (bVar9 != null) {
                        fVar4.invoke(bVar9);
                        ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).a(lVar7.o(), e31.a.HAS_TOPO_ACTIVE_MAPS_SUPPORT);
                    } else {
                        Toast.makeText(aVar19.getContext(), R.string.txt_error_occurred, 0).show();
                    }
                } else if (i29 == 2) {
                    g22.e.f(aVar19);
                    Toast.makeText(aVar19.getContext(), R.string.txt_error_occurred, 0).show();
                } else {
                    if (i29 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.l(aVar19);
                    String string3 = aVar19.getString(R.string.lbl_loading);
                    androidx.fragment.app.m activity2 = aVar19.getActivity();
                    s2 s2Var = activity2 instanceof s2 ? (s2) activity2 : null;
                    if (s2Var != null) {
                        s2Var.requestProgressOverlayFocus(string3);
                    }
                }
                return Unit.INSTANCE;
            case 28:
                f0 f0Var4 = (f0) obj;
                f0Var4.getClass();
                i53.f fVar5 = ((sy0.b) obj5).f161205e;
                f0Var4.a(fVar5.size(), new i0.i(new jy0.b(7), fVar5), new i0.j(i0.h.f101732a, fVar5), new z3.e(802480018, true, new i0.k(fVar5, (i53.e) obj4, (l) obj3)));
                return Unit.INSTANCE;
            default:
                ((l) obj4).invoke(((l11.a.b) obj5).f108076b.get(((Integer) obj).intValue()));
                ((p1) obj3).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d(Object obj, int i14, Object obj2, Object obj3) {
        this.f79837a = i14;
        this.f79838b = obj;
        this.f79839c = obj2;
        this.f79840d = obj3;
    }
}
