package a4;

import a81.m;
import aa2.r;
import am.x0;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.j;
import androidx.lifecycle.j1;
import androidx.lifecycle.k;
import androidx.lifecycle.n0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t1;
import androidx.lifecycle.w0;
import ap.d;
import aq.f2;
import b11.v;
import b21.c6;
import b21.d6;
import b21.e6;
import b21.f6;
import b21.f8;
import b21.g6;
import b21.g8;
import b21.h6;
import b21.h8;
import b21.i6;
import b21.i8;
import b21.j6;
import b21.j8;
import b21.k6;
import b21.k8;
import b21.l4;
import b21.l6;
import b21.l8;
import b21.m6;
import b21.m8;
import b21.n6;
import b21.n8;
import b21.o6;
import b21.o8;
import b21.p0;
import b21.p6;
import b21.p8;
import b21.q0;
import b21.q6;
import b21.r6;
import b21.s6;
import b21.t6;
import b21.v6;
import b63.u;
import c62.a1;
import ca0.c1;
import ca0.d2;
import ca0.f1;
import ca0.i0;
import ca0.u1;
import ca0.u2;
import ca0.x1;
import ca0.z1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.newmodel.h;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.garmin.android.apps.connectmobile.performance.trainingload.e;
import com.garmin.android.apps.connectmobile.settings.notifications.NotificationSettingsActivity;
import e2.f0;
import e23.l;
import f11.g;
import g01.z;
import i3.fe;
import is.o;
import j23.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jr.q;
import jr.s;
import l52.w;
import lc.k0;
import lc.m0;
import lc.u0;
import lc.y;
import nc.n;
import o13.p;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p13.d0;
import p13.h0;
import p13.j0;
import p13.t0;
import p3.p1;
import ps.d1;
import r53.p2;
import s21.a0;
import w61.x;
import x5.l0;
import za0.i;
import zw2.f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f944d;

    public /* synthetic */ a(bv2.a aVar, dx2.c cVar, Map map, f fVar) {
        this.f941a = 20;
        this.f942b = aVar;
        this.f943c = cVar;
        this.f944d = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, androidx.lifecycle.s0] */
    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        boolean z14;
        w0 w0Var;
        h hVar;
        String strK0;
        Object next;
        Long l14;
        p pVar;
        p pVar2;
        j1 j1VarA;
        Object value;
        Object value2;
        i.b bVarB;
        i53.c<String> cVar;
        int i14 = this.f941a;
        int i15 = 6;
        int i16 = 9;
        int i17 = 7;
        int i18 = 8;
        int i19 = 3;
        final int i24 = 0;
        final int i25 = 2;
        final int i26 = 1;
        Object obj2 = this.f944d;
        Object obj3 = this.f943c;
        Object obj4 = this.f942b;
        switch (i14) {
            case 0:
                s0 s0Var = (s0) obj4;
                b bVar = new b((p1) obj2, i24);
                s0Var.f((n0) obj3, bVar);
                return new c(s0Var, bVar);
            case 1:
                e eVar = (e) obj4;
                b bVar2 = eVar.f40235r;
                DateTime dateTime = (DateTime) obj3;
                DateTime dateTime2 = (DateTime) obj2;
                e.a aVar = e.f40217t;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                x xVar = eVar.f40220c;
                if (zBooleanValue) {
                    if (xVar != null) {
                        w61.i.a(xVar.f183282q, xVar.F4(5, dateTime, dateTime2, false), xVar.f183281p, new vd0.s0(xVar, i17, dateTime, dateTime2)).f(eVar.getViewLifecycleOwner(), bVar2);
                    }
                    eVar.u6(true);
                } else {
                    if (xVar != null) {
                        z14 = false;
                        w61.i.a(xVar.f183282q, xVar.F4(5, dateTime, dateTime2, false), xVar.f183281p, new vd0.s0(xVar, i17, dateTime, dateTime2)).f(eVar.getViewLifecycleOwner(), bVar2);
                    } else {
                        z14 = false;
                    }
                    eVar.u6(z14);
                }
                return Unit.INSTANCE;
            case 2:
                return NotificationSettingsActivity.ca((Intent) obj4, (com.garmin.android.apps.connectmobile.settings.notifications.model.a) obj3, (NotificationSettingsActivity) obj2, ((Boolean) obj).booleanValue());
            case 3:
                List list = (List) obj4;
                f0 f0Var = (f0) obj;
                f0Var.getClass();
                f0.f(f0Var, list.size(), new m(26), new z3.e(-422508129, true, new r(list, i25, (x0) obj3, (l) obj2)), 4);
                return Unit.INSTANCE;
            case 4:
                r0 r0Var = (r0) obj3;
                w0 w0Var2 = (w0) obj2;
                ?? r14 = (s0) ((l) obj4).invoke(obj);
                T t7 = r0Var.f105810a;
                if (t7 != r14) {
                    if (t7 != 0) {
                        w0Var2.o((s0) t7);
                    }
                    r0Var.f105810a = r14;
                    if (r14 != 0) {
                        w0Var2.n(r14, new t1.a(new k(w0Var2, 1)));
                    }
                }
                return Unit.INSTANCE;
            case 5:
                w0 w0Var3 = (w0) obj4;
                d dVar = (d) obj3;
                List list2 = (List) obj2;
                List<d1> list3 = (List) obj;
                int i27 = d.f11588o;
                ArrayList arrayListL = j.l(list3);
                for (d1 d1Var : list3) {
                    sr.b bVar3 = dVar.f11592d;
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                Long l15 = d1Var.f139785a;
                                w0Var = w0Var3;
                                long j8 = ((h) next).f29448a;
                                if (l15 == null || l15.longValue() != j8) {
                                    w0Var3 = w0Var;
                                }
                            } else {
                                w0Var = w0Var3;
                                next = null;
                            }
                        }
                        hVar = (h) next;
                    } else {
                        w0Var = w0Var3;
                        hVar = null;
                    }
                    if (hVar != null) {
                        kr.a aVar2 = dVar.f11591c;
                        x0 x0VarC = hVar.C();
                        x0VarC.getClass();
                        jr.b bVarA = aVar2.a(x0VarC);
                        if (bVarA.a() == null) {
                            d1Var = null;
                        } else {
                            List<q> listA = bVarA.a();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj5 : listA) {
                                if (((q) obj5).d() == s.Home) {
                                    arrayList.add(obj5);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                ArrayList arrayListA = o.a(((q) it3.next()).g(), fr.a.e(hVar));
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it4 = arrayListA.iterator();
                                while (it4.hasNext()) {
                                    ls.e eVarA = is.m.a((jr.p) it4.next());
                                    Object objK = ss.k.k(eVarA, fr.a.e(hVar));
                                    bVar3.getClass();
                                    String strB = ss.k.b(eVarA, bVar3.f160541b, objK, 9);
                                    if (strB != null) {
                                        arrayList3.add(strB);
                                    }
                                }
                                d0.v(arrayList2, arrayList3);
                            }
                            if (!arrayList2.isEmpty()) {
                                d1Var.f139794j = (String) arrayList2.get(0);
                                List listL0 = h0.L0(arrayList2, t.o(1, arrayList2.size()));
                                if (listL0 != null) {
                                    strK0 = h0.k0(listL0, bVar3.f160541b.getString(R.string.bullet_point), null, null, null, 62);
                                } else {
                                    bVar3.getClass();
                                    strK0 = null;
                                }
                                d1Var.f139795k = strK0;
                            }
                        }
                    }
                    if (d1Var != null) {
                        arrayListL.add(d1Var);
                    }
                    w0Var3 = w0Var;
                }
                w0Var3.j(arrayListL);
                return Unit.INSTANCE;
            case 6:
                f2.g gVar = (f2.g) obj4;
                f2 f2Var = (f2) obj2;
                Long l16 = (Long) obj;
                int i28 = f2.f11937h;
                TextView textView = gVar.f11956e;
                EditText editText = gVar.f11957f;
                textView.setText(editText.getText());
                v22.e.q(textView);
                v22.e.l(editText);
                if (!p005kotlin.jvm.internal.s.g((Long) obj3, l16)) {
                    f2Var.f11940c.d4(gVar.getBindingAdapterPosition(), l16 != null ? l16.longValue() : -2L);
                }
                return Unit.INSTANCE;
            case 7:
                f2 f2Var2 = (f2) obj3;
                f2.g gVar2 = (f2.g) obj2;
                int iIntValue = ((Integer) obj).intValue();
                if (p005kotlin.jvm.internal.s.c((Double) obj4, iIntValue)) {
                    int i29 = f2.f11937h;
                } else {
                    f2Var2.f11940c.J4(gVar2.getBindingAdapterPosition(), iIntValue);
                }
                return Unit.INSTANCE;
            case 8:
                e23.a aVar3 = (e23.a) obj3;
                gv0.d dVar2 = (gv0.d) obj2;
                f.a aVar4 = (f.a) obj;
                aVar4.getClass();
                i2.a aVar5 = i2.f36769a;
                aVar5.getClass();
                i2.a.a(a2.LIVETRACK, "inviteToMessenger from launcher result: " + aVar4);
                pu0.i iVar = (pu0.i) h0.d0(((pu0.b) obj4).f141191i);
                if (iVar != null && (l14 = iVar.f141260a) != null) {
                    dVar2.L4(l14.longValue());
                }
                aVar3.invoke();
                return Unit.INSTANCE;
            case 9:
                az1.h hVar2 = (az1.h) obj4;
                fg0.k kVar = (fg0.k) obj3;
                List<fg0.k> list4 = (List) obj2;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                az1.h.a aVar6 = az1.h.f13755m;
                if (zBooleanValue2) {
                    zy1.d dVarU6 = hVar2.u6();
                    dVarU6.P = kVar;
                    dVarU6.T = list4;
                    dVarU6.a5().m("EventChangePriorityConfirmationFragment");
                }
                return Unit.INSTANCE;
            case 10:
                l4.f fVar = (l4.f) obj3;
                d11.f fVar2 = (d11.f) obj;
                fVar2.getClass();
                ((f11.f) obj4).f67926k = fVar2;
                v vVar = fVar2.f57067a;
                fVar.getClass();
                y.l((m0) obj2, v21.a.a(vVar, i01.i.REGULAR_LOG, j11.c.RECIPE, u.Companion.a(u.INSTANCE, fVar.f14876c), fVar.f14877d));
                return Unit.INSTANCE;
            case 11:
                g.b bVar4 = (g.b) obj4;
                m0 m0Var = (m0) obj3;
                NutritionActivity.g gVar3 = (NutritionActivity.g) obj2;
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                if (bVar4 instanceof g.b.a) {
                    pVar = new p("customConsumableCreatedResultKey", b11.b.MEAL);
                } else {
                    if (!(bVar4 instanceof g.b.C1412b)) {
                        u0.r();
                        return null;
                    }
                    pVar = new p("foodUpdatedResult", Boolean.TRUE);
                }
                b21.d1.b(m0Var, true, zBooleanValue3, (String) pVar.f128594a, pVar.f128595b, gVar3);
                return Unit.INSTANCE;
            case 12:
                f11.a.b bVar5 = (f11.a.b) obj4;
                m0 m0Var2 = (m0) obj3;
                NutritionActivity.g gVar4 = (NutritionActivity.g) obj2;
                if (((Boolean) obj).booleanValue()) {
                    if (bVar5 instanceof f11.a.b.C1410a) {
                        pVar2 = new p("customConsumableCreatedResultKey", b11.b.FOOD);
                    } else {
                        if (!(bVar5 instanceof f11.a.b.C1411b)) {
                            u0.r();
                            return null;
                        }
                        pVar2 = new p("foodUpdatedResult", Boolean.TRUE);
                    }
                    String str = (String) pVar2.f128594a;
                    lc.v vVarF = m0Var2.f();
                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                        j1VarA.f(pVar2.f128595b, str);
                    }
                }
                gVar4.invoke();
                return Unit.INSTANCE;
            case 13:
                l4.q qVar = (l4.q) obj4;
                x11.l lVar = (x11.l) obj3;
                m0 m0Var3 = (m0) obj2;
                v11.b.e eVar2 = (v11.b.e) obj;
                eVar2.getClass();
                if (qVar.f14953e) {
                    ht.a.f85464a.getClass();
                    ht.a.a(null, "NutritionVoiceLoggingLogFoodTapped");
                }
                lVar.f188439f = eVar2;
                y.l(m0Var3, v21.a.a(eVar2.f174676a, i01.i.IMAGE_RECOGNITION, j11.c.PHOTO_RESULT, u.Companion.a(u.INSTANCE, qVar.f14951c), qVar.f14952d));
                return Unit.INSTANCE;
            case 14:
                m0 m0Var4 = (m0) obj4;
                NutritionActivity.g gVar5 = (NutritionActivity.g) obj3;
                v21.e eVar3 = (v21.e) obj2;
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                k23.p pVarC = p005kotlin.jvm.internal.s0.c(b11.m.class);
                n63.b.a aVar7 = n63.b.f123892d;
                Map mapB = t0.b(new p(pVarC, new o6(aVar7)));
                z3.e eVar4 = new z3.e(-459151613, true, new p0(m0Var4, gVar5, i16));
                f6 f6Var = f6.f14661a;
                g6 g6Var = g6.f14689a;
                h6 h6Var = h6.f14718a;
                i6 i6Var = i6.f14747a;
                j0 j0Var = j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                n.a(k0Var, t0Var.b(l4.o.class), mapB, j0Var, f6Var, g6Var, h6Var, i6Var, eVar4);
                n.a(k0Var, t0Var.b(l4.z0.class), t0.b(new p(p005kotlin.jvm.internal.s0.c(b11.m.class), new p6(aVar7))), j0Var, j6.f14772a, k6.f14799a, l6.f15014a, m6.f15044a, new z3.e(-2073341652, true, new p0(m0Var4, gVar5, 10)));
                n.a(k0Var, t0Var.b(l4.q.class), t0.b(new p(p005kotlin.jvm.internal.s0.c(b11.m.class), new q6(aVar7))), j0Var, null, null, null, null, new z3.e(276175864, true, new q0(m0Var4, eVar3, gVar5, i25)));
                n.a(k0Var, t0Var.b(l4.p.class), t0.b(new p(p005kotlin.jvm.internal.s0.c(b11.m.class), new r6(aVar7))), j0Var, null, null, null, null, new z3.e(201727201, true, new q0(m0Var4, eVar3, gVar5, i19)));
                n.a(k0Var, t0Var.b(l4.m.class), p13.u0.e(new p(p005kotlin.jvm.internal.s0.b(b11.k.class), new s6(aVar7)), new p(p005kotlin.jvm.internal.s0.c(m21.b.class), new t6(aVar7))), j0Var, n6.f15066a, c6.f14576a, d6.f14610a, e6.f14641a, new z3.e(-872200309, true, new p0(m0Var4, gVar5, 11)));
                return Unit.INSTANCE;
            case 15:
                final m0 m0Var5 = (m0) obj4;
                final x01.b bVar6 = (x01.b) obj3;
                v21.e eVar5 = (v21.e) obj2;
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                k23.p pVarC2 = p005kotlin.jvm.internal.s0.c(l4.class);
                n63.b.a aVar8 = n63.b.f123892d;
                Map mapB2 = t0.b(new p(pVarC2, new n8(aVar8)));
                z3.e eVar6 = new z3.e(-1372820642, true, new e23.r() { // from class: b21.j7
                    /* JADX WARN: Code duplicated, block: B:8:0x002f  */
                    @Override // e23.r
                    public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                        int i30 = i24;
                        final int i34 = 0;
                        final x01.b bVar7 = bVar6;
                        final lc.m0 m0Var6 = m0Var5;
                        r1.l lVar2 = (r1.l) obj6;
                        final lc.v vVar2 = (lc.v) obj7;
                        p3.m mVar = (p3.m) obj8;
                        Integer num = (Integer) obj9;
                        switch (i30) {
                            case 0:
                                int iB = androidx.room.a0.b(num, lVar2, vVar2);
                                p3.x1 x1Var = p3.n.f135158a;
                                final int i35 = 1;
                                q8.a(vVar2, m0Var6, z3.f.c(-678297786, new e23.s() { // from class: b21.y6
                                    /* JADX WARN: Code duplicated, block: B:15:0x00c9  */
                                    /* JADX WARN: Code duplicated, block: B:20:0x0105  */
                                    /* JADX WARN: Code duplicated, block: B:33:0x0144  */
                                    /* JADX WARN: Code duplicated, block: B:38:0x0170  */
                                    /* JADX WARN: Code duplicated, block: B:43:0x0190  */
                                    /* JADX WARN: Code duplicated, block: B:48:0x01ac  */
                                    /* JADX WARN: Code duplicated, block: B:53:0x01c8  */
                                    /* JADX WARN: Code duplicated, block: B:58:0x01e3  */
                                    /* JADX WARN: Code duplicated, block: B:63:0x0206  */
                                    /* JADX WARN: Code duplicated, block: B:68:0x0222  */
                                    /* JADX WARN: Code duplicated, block: B:73:0x0240  */
                                    /* JADX WARN: Code duplicated, block: B:78:0x025d  */
                                    /* JADX WARN: Code duplicated, block: B:8:0x0062  */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // e23.s
                                    public final Object invoke(Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
                                        int i36 = i35;
                                        p3.m.a aVar9 = p3.m.f135153a;
                                        switch (i36) {
                                            case 0:
                                                final q21.r rVar = (q21.r) obj10;
                                                q21.q qVar2 = (q21.q) obj11;
                                                fe feVar = (fe) obj12;
                                                p3.m mVar2 = (p3.m) obj13;
                                                int iIntValue2 = ((Integer) obj14).intValue();
                                                rVar.getClass();
                                                qVar2.getClass();
                                                feVar.getClass();
                                                p3.x1 x1Var2 = p3.n.f135158a;
                                                lc.v vVar3 = vVar2;
                                                androidx.lifecycle.j1 j1VarA2 = vVar3.a();
                                                p3.p1 p1VarC = s9.c.c(j1VarA2.d(null, "editSetupUpdate"), mVar2);
                                                String str2 = (String) p1VarC.getF182175a();
                                                boolean zB = mVar2.B(p1VarC) | mVar2.r(rVar) | mVar2.r(j1VarA2);
                                                Object objQ = mVar2.q();
                                                if (zB) {
                                                    objQ = new m7(p1VarC, rVar, j1VarA2, null);
                                                    mVar2.K(objQ);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ == p3.m.a.f135155b) {
                                                        objQ = new m7(p1VarC, rVar, j1VarA2, null);
                                                        mVar2.K(objQ);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ, str2, mVar2);
                                                p3.p1 p1VarG = o53.f0.G(vVar3.a().b("regionAndLanguageResult"), mVar2);
                                                o13.p pVar3 = (o13.p) p1VarG.getF182175a();
                                                boolean zB2 = mVar2.B(p1VarG) | mVar2.r(rVar) | mVar2.r(vVar3);
                                                Object objQ2 = mVar2.q();
                                                if (zB2) {
                                                    objQ2 = new n7(p1VarG, rVar, vVar3, null);
                                                    mVar2.K(objQ2);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ2 == p3.m.a.f135155b) {
                                                        objQ2 = new n7(p1VarG, rVar, vVar3, null);
                                                        mVar2.K(objQ2);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ2, pVar3, mVar2);
                                                l4 l4Var = qVar2.f142286i;
                                                final int i37 = 1;
                                                final int i38 = 0;
                                                boolean z15 = (((iIntValue2 & 112) ^ 48) > 32 && mVar2.B(qVar2)) || (iIntValue2 & 48) == 32;
                                                final lc.m0 m0Var7 = m0Var6;
                                                boolean zR = z15 | mVar2.r(m0Var7) | mVar2.r(rVar);
                                                Object objQ3 = mVar2.q();
                                                if (zR) {
                                                    objQ3 = new o7(qVar2, m0Var7, rVar, null);
                                                    mVar2.K(objQ3);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ3 == p3.m.a.f135155b) {
                                                        objQ3 = new o7(qVar2, m0Var7, rVar, null);
                                                        mVar2.K(objQ3);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ3, l4Var, mVar2);
                                                boolean zR2 = mVar2.r(m0Var7) | mVar2.r(rVar);
                                                x01.b bVar8 = bVar7;
                                                boolean zB3 = zR2 | mVar2.B(bVar8);
                                                Object objQ4 = mVar2.q();
                                                int i39 = 10;
                                                if (zB3) {
                                                    objQ4 = new ak0.m(m0Var7, i39, rVar, bVar8);
                                                    mVar2.K(objQ4);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ4 == p3.m.a.f135155b) {
                                                        objQ4 = new ak0.m(m0Var7, i39, rVar, bVar8);
                                                        mVar2.K(objQ4);
                                                    }
                                                }
                                                e23.a aVar10 = (e23.a) objQ4;
                                                boolean zR3 = mVar2.r(m0Var7) | mVar2.r(rVar);
                                                Object objQ5 = mVar2.q();
                                                if (zR3) {
                                                    objQ5 = new e23.a() { // from class: b21.g7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i38) {
                                                                case 0:
                                                                    lc.y.l(m0Var7, new l4.e0(rVar.f142293f));
                                                                    break;
                                                                default:
                                                                    lc.y.l(m0Var7, new l4.o0(true, rVar.f142293f));
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ5);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ5 == p3.m.a.f135155b) {
                                                        objQ5 = new e23.a() { // from class: b21.g7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i38) {
                                                                    case 0:
                                                                        lc.y.l(m0Var7, new l4.e0(rVar.f142293f));
                                                                        break;
                                                                    default:
                                                                        lc.y.l(m0Var7, new l4.o0(true, rVar.f142293f));
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ5);
                                                    }
                                                }
                                                e23.a aVar11 = (e23.a) objQ5;
                                                boolean zR4 = mVar2.r(rVar);
                                                Object objQ6 = mVar2.q();
                                                if (zR4) {
                                                    objQ6 = new e23.a() { // from class: b21.h7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            Object value3;
                                                            Object value4;
                                                            switch (i38) {
                                                                case 0:
                                                                    q21.r rVar2 = rVar;
                                                                    l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                    r53.p2 p2Var = rVar2.f142295h;
                                                                    do {
                                                                        value3 = p2Var.getValue();
                                                                    } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                    break;
                                                                case 1:
                                                                    q21.r rVar3 = rVar;
                                                                    l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                    r53.p2 p2Var2 = rVar3.f142295h;
                                                                    do {
                                                                        value4 = p2Var2.getValue();
                                                                    } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                    break;
                                                                default:
                                                                    q21.r rVar4 = rVar;
                                                                    rVar4.getClass();
                                                                    ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ6);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ6 == p3.m.a.f135155b) {
                                                        objQ6 = new e23.a() { // from class: b21.h7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                Object value3;
                                                                Object value4;
                                                                switch (i38) {
                                                                    case 0:
                                                                        q21.r rVar2 = rVar;
                                                                        l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                        r53.p2 p2Var = rVar2.f142295h;
                                                                        do {
                                                                            value3 = p2Var.getValue();
                                                                        } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                        break;
                                                                    case 1:
                                                                        q21.r rVar3 = rVar;
                                                                        l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                        r53.p2 p2Var2 = rVar3.f142295h;
                                                                        do {
                                                                            value4 = p2Var2.getValue();
                                                                        } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                        break;
                                                                    default:
                                                                        q21.r rVar4 = rVar;
                                                                        rVar4.getClass();
                                                                        ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ6);
                                                    }
                                                }
                                                e23.a aVar12 = (e23.a) objQ6;
                                                boolean zR5 = mVar2.r(rVar);
                                                Object objQ7 = mVar2.q();
                                                if (zR5) {
                                                    objQ7 = new e23.a() { // from class: b21.h7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            Object value3;
                                                            Object value4;
                                                            switch (i37) {
                                                                case 0:
                                                                    q21.r rVar2 = rVar;
                                                                    l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                    r53.p2 p2Var = rVar2.f142295h;
                                                                    do {
                                                                        value3 = p2Var.getValue();
                                                                    } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                    break;
                                                                case 1:
                                                                    q21.r rVar3 = rVar;
                                                                    l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                    r53.p2 p2Var2 = rVar3.f142295h;
                                                                    do {
                                                                        value4 = p2Var2.getValue();
                                                                    } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                    break;
                                                                default:
                                                                    q21.r rVar4 = rVar;
                                                                    rVar4.getClass();
                                                                    ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ7);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ7 == p3.m.a.f135155b) {
                                                        objQ7 = new e23.a() { // from class: b21.h7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                Object value3;
                                                                Object value4;
                                                                switch (i37) {
                                                                    case 0:
                                                                        q21.r rVar2 = rVar;
                                                                        l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                        r53.p2 p2Var = rVar2.f142295h;
                                                                        do {
                                                                            value3 = p2Var.getValue();
                                                                        } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                        break;
                                                                    case 1:
                                                                        q21.r rVar3 = rVar;
                                                                        l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                        r53.p2 p2Var2 = rVar3.f142295h;
                                                                        do {
                                                                            value4 = p2Var2.getValue();
                                                                        } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                        break;
                                                                    default:
                                                                        q21.r rVar4 = rVar;
                                                                        rVar4.getClass();
                                                                        ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ7);
                                                    }
                                                }
                                                e23.a aVar13 = (e23.a) objQ7;
                                                boolean zR6 = mVar2.r(m0Var7);
                                                Object objQ8 = mVar2.q();
                                                if (zR6) {
                                                    objQ8 = new aa2.m(m0Var7, 9);
                                                    mVar2.K(objQ8);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ8 == p3.m.a.f135155b) {
                                                        objQ8 = new aa2.m(m0Var7, 9);
                                                        mVar2.K(objQ8);
                                                    }
                                                }
                                                e23.a aVar14 = (e23.a) objQ8;
                                                boolean zR7 = mVar2.r(m0Var7) | mVar2.r(rVar);
                                                Object objQ9 = mVar2.q();
                                                if (zR7) {
                                                    objQ9 = new e23.a() { // from class: b21.g7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i37) {
                                                                case 0:
                                                                    lc.y.l(m0Var7, new l4.e0(rVar.f142293f));
                                                                    break;
                                                                default:
                                                                    lc.y.l(m0Var7, new l4.o0(true, rVar.f142293f));
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ9);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ9 == p3.m.a.f135155b) {
                                                        objQ9 = new e23.a() { // from class: b21.g7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i37) {
                                                                    case 0:
                                                                        lc.y.l(m0Var7, new l4.e0(rVar.f142293f));
                                                                        break;
                                                                    default:
                                                                        lc.y.l(m0Var7, new l4.o0(true, rVar.f142293f));
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ9);
                                                    }
                                                }
                                                e23.a aVar15 = (e23.a) objQ9;
                                                boolean zR8 = mVar2.r(m0Var7);
                                                Object objQ10 = mVar2.q();
                                                if (zR8) {
                                                    objQ10 = new aa2.m(m0Var7, 10);
                                                    mVar2.K(objQ10);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ10 == p3.m.a.f135155b) {
                                                        objQ10 = new aa2.m(m0Var7, 10);
                                                        mVar2.K(objQ10);
                                                    }
                                                }
                                                e23.a aVar16 = (e23.a) objQ10;
                                                boolean zR9 = mVar2.r(rVar);
                                                Object objQ11 = mVar2.q();
                                                if (zR9) {
                                                    objQ11 = new a03.f(rVar, 24);
                                                    mVar2.K(objQ11);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ11 == p3.m.a.f135155b) {
                                                        objQ11 = new a03.f(rVar, 24);
                                                        mVar2.K(objQ11);
                                                    }
                                                }
                                                e23.l lVar3 = (e23.l) objQ11;
                                                boolean zR10 = mVar2.r(rVar);
                                                Object objQ12 = mVar2.q();
                                                if (zR10) {
                                                    final int i44 = 2;
                                                    objQ12 = new e23.a() { // from class: b21.h7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            Object value3;
                                                            Object value4;
                                                            switch (i44) {
                                                                case 0:
                                                                    q21.r rVar2 = rVar;
                                                                    l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                    r53.p2 p2Var = rVar2.f142295h;
                                                                    do {
                                                                        value3 = p2Var.getValue();
                                                                    } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                    break;
                                                                case 1:
                                                                    q21.r rVar3 = rVar;
                                                                    l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                    r53.p2 p2Var2 = rVar3.f142295h;
                                                                    do {
                                                                        value4 = p2Var2.getValue();
                                                                    } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                    break;
                                                                default:
                                                                    q21.r rVar4 = rVar;
                                                                    rVar4.getClass();
                                                                    ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ12);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ12 == p3.m.a.f135155b) {
                                                        final int i45 = 2;
                                                        objQ12 = new e23.a() { // from class: b21.h7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                Object value3;
                                                                Object value4;
                                                                switch (i45) {
                                                                    case 0:
                                                                        q21.r rVar2 = rVar;
                                                                        l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                        r53.p2 p2Var = rVar2.f142295h;
                                                                        do {
                                                                            value3 = p2Var.getValue();
                                                                        } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                        break;
                                                                    case 1:
                                                                        q21.r rVar3 = rVar;
                                                                        l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                        r53.p2 p2Var2 = rVar3.f142295h;
                                                                        do {
                                                                            value4 = p2Var2.getValue();
                                                                        } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                        break;
                                                                    default:
                                                                        q21.r rVar4 = rVar;
                                                                        rVar4.getClass();
                                                                        ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ12);
                                                    }
                                                }
                                                p21.l.a(qVar2, feVar, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, lVar3, (e23.a) objQ12, mVar2, (iIntValue2 >> 3) & 126);
                                                break;
                                            default:
                                                q21.r rVar2 = (q21.r) obj10;
                                                p3.m mVar3 = (p3.m) obj13;
                                                rVar2.getClass();
                                                ((q21.q) obj11).getClass();
                                                ((fe) obj12).getClass();
                                                p3.x1 x1Var3 = p3.n.f135158a;
                                                p3.p1 p1VarC2 = s9.c.c(rVar2.f142292e, mVar3);
                                                Boolean bool = (Boolean) p1VarC2.getF182175a();
                                                bool.booleanValue();
                                                boolean zB4 = mVar3.B(p1VarC2);
                                                lc.v vVar4 = vVar2;
                                                boolean zR11 = zB4 | mVar3.r(vVar4);
                                                lc.m0 m0Var8 = m0Var6;
                                                boolean zR12 = zR11 | mVar3.r(m0Var8) | mVar3.r(rVar2);
                                                x01.b bVar9 = bVar7;
                                                boolean zB5 = zR12 | mVar3.B(bVar9);
                                                Object objQ13 = mVar3.q();
                                                if (zB5) {
                                                    l7 l7Var = new l7(vVar4, m0Var8, rVar2, bVar9, p1VarC2, null);
                                                    mVar3.K(l7Var);
                                                    objQ13 = l7Var;
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ13 == p3.m.a.f135155b) {
                                                        l7 l7Var2 = new l7(vVar4, m0Var8, rVar2, bVar9, p1VarC2, null);
                                                        mVar3.K(l7Var2);
                                                        objQ13 = l7Var2;
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ13, bool, mVar3);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar), mVar, ((iB >> 3) & 14) | 384);
                                break;
                            case 1:
                                int iB2 = androidx.room.a0.b(num, lVar2, vVar2);
                                p3.x1 x1Var2 = p3.n.f135158a;
                                q8.a(vVar2, m0Var6, z3.f.c(-1971187843, new e23.s() { // from class: b21.y6
                                    /* JADX WARN: Code duplicated, block: B:15:0x00c9  */
                                    /* JADX WARN: Code duplicated, block: B:20:0x0105  */
                                    /* JADX WARN: Code duplicated, block: B:33:0x0144  */
                                    /* JADX WARN: Code duplicated, block: B:38:0x0170  */
                                    /* JADX WARN: Code duplicated, block: B:43:0x0190  */
                                    /* JADX WARN: Code duplicated, block: B:48:0x01ac  */
                                    /* JADX WARN: Code duplicated, block: B:53:0x01c8  */
                                    /* JADX WARN: Code duplicated, block: B:58:0x01e3  */
                                    /* JADX WARN: Code duplicated, block: B:63:0x0206  */
                                    /* JADX WARN: Code duplicated, block: B:68:0x0222  */
                                    /* JADX WARN: Code duplicated, block: B:73:0x0240  */
                                    /* JADX WARN: Code duplicated, block: B:78:0x025d  */
                                    /* JADX WARN: Code duplicated, block: B:8:0x0062  */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // e23.s
                                    public final Object invoke(Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
                                        int i36 = i34;
                                        p3.m.a aVar9 = p3.m.f135153a;
                                        switch (i36) {
                                            case 0:
                                                final q21.r rVar = (q21.r) obj10;
                                                q21.q qVar2 = (q21.q) obj11;
                                                fe feVar = (fe) obj12;
                                                p3.m mVar2 = (p3.m) obj13;
                                                int iIntValue2 = ((Integer) obj14).intValue();
                                                rVar.getClass();
                                                qVar2.getClass();
                                                feVar.getClass();
                                                p3.x1 x1Var3 = p3.n.f135158a;
                                                lc.v vVar3 = vVar2;
                                                androidx.lifecycle.j1 j1VarA2 = vVar3.a();
                                                p3.p1 p1VarC = s9.c.c(j1VarA2.d(null, "editSetupUpdate"), mVar2);
                                                String str2 = (String) p1VarC.getF182175a();
                                                boolean zB = mVar2.B(p1VarC) | mVar2.r(rVar) | mVar2.r(j1VarA2);
                                                Object objQ = mVar2.q();
                                                if (zB) {
                                                    objQ = new m7(p1VarC, rVar, j1VarA2, null);
                                                    mVar2.K(objQ);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ == p3.m.a.f135155b) {
                                                        objQ = new m7(p1VarC, rVar, j1VarA2, null);
                                                        mVar2.K(objQ);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ, str2, mVar2);
                                                p3.p1 p1VarG = o53.f0.G(vVar3.a().b("regionAndLanguageResult"), mVar2);
                                                o13.p pVar3 = (o13.p) p1VarG.getF182175a();
                                                boolean zB2 = mVar2.B(p1VarG) | mVar2.r(rVar) | mVar2.r(vVar3);
                                                Object objQ2 = mVar2.q();
                                                if (zB2) {
                                                    objQ2 = new n7(p1VarG, rVar, vVar3, null);
                                                    mVar2.K(objQ2);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ2 == p3.m.a.f135155b) {
                                                        objQ2 = new n7(p1VarG, rVar, vVar3, null);
                                                        mVar2.K(objQ2);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ2, pVar3, mVar2);
                                                l4 l4Var = qVar2.f142286i;
                                                final int i37 = 1;
                                                final int i38 = 0;
                                                boolean z15 = (((iIntValue2 & 112) ^ 48) > 32 && mVar2.B(qVar2)) || (iIntValue2 & 48) == 32;
                                                final lc.m0 m0Var7 = m0Var6;
                                                boolean zR = z15 | mVar2.r(m0Var7) | mVar2.r(rVar);
                                                Object objQ3 = mVar2.q();
                                                if (zR) {
                                                    objQ3 = new o7(qVar2, m0Var7, rVar, null);
                                                    mVar2.K(objQ3);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ3 == p3.m.a.f135155b) {
                                                        objQ3 = new o7(qVar2, m0Var7, rVar, null);
                                                        mVar2.K(objQ3);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ3, l4Var, mVar2);
                                                boolean zR2 = mVar2.r(m0Var7) | mVar2.r(rVar);
                                                x01.b bVar8 = bVar7;
                                                boolean zB3 = zR2 | mVar2.B(bVar8);
                                                Object objQ4 = mVar2.q();
                                                int i39 = 10;
                                                if (zB3) {
                                                    objQ4 = new ak0.m(m0Var7, i39, rVar, bVar8);
                                                    mVar2.K(objQ4);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ4 == p3.m.a.f135155b) {
                                                        objQ4 = new ak0.m(m0Var7, i39, rVar, bVar8);
                                                        mVar2.K(objQ4);
                                                    }
                                                }
                                                e23.a aVar10 = (e23.a) objQ4;
                                                boolean zR3 = mVar2.r(m0Var7) | mVar2.r(rVar);
                                                Object objQ5 = mVar2.q();
                                                if (zR3) {
                                                    objQ5 = new e23.a() { // from class: b21.g7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i38) {
                                                                case 0:
                                                                    lc.y.l(m0Var7, new l4.e0(rVar.f142293f));
                                                                    break;
                                                                default:
                                                                    lc.y.l(m0Var7, new l4.o0(true, rVar.f142293f));
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ5);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ5 == p3.m.a.f135155b) {
                                                        objQ5 = new e23.a() { // from class: b21.g7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i38) {
                                                                    case 0:
                                                                        lc.y.l(m0Var7, new l4.e0(rVar.f142293f));
                                                                        break;
                                                                    default:
                                                                        lc.y.l(m0Var7, new l4.o0(true, rVar.f142293f));
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ5);
                                                    }
                                                }
                                                e23.a aVar11 = (e23.a) objQ5;
                                                boolean zR4 = mVar2.r(rVar);
                                                Object objQ6 = mVar2.q();
                                                if (zR4) {
                                                    objQ6 = new e23.a() { // from class: b21.h7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            Object value3;
                                                            Object value4;
                                                            switch (i38) {
                                                                case 0:
                                                                    q21.r rVar2 = rVar;
                                                                    l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                    r53.p2 p2Var = rVar2.f142295h;
                                                                    do {
                                                                        value3 = p2Var.getValue();
                                                                    } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                    break;
                                                                case 1:
                                                                    q21.r rVar3 = rVar;
                                                                    l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                    r53.p2 p2Var2 = rVar3.f142295h;
                                                                    do {
                                                                        value4 = p2Var2.getValue();
                                                                    } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                    break;
                                                                default:
                                                                    q21.r rVar4 = rVar;
                                                                    rVar4.getClass();
                                                                    ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ6);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ6 == p3.m.a.f135155b) {
                                                        objQ6 = new e23.a() { // from class: b21.h7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                Object value3;
                                                                Object value4;
                                                                switch (i38) {
                                                                    case 0:
                                                                        q21.r rVar2 = rVar;
                                                                        l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                        r53.p2 p2Var = rVar2.f142295h;
                                                                        do {
                                                                            value3 = p2Var.getValue();
                                                                        } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                        break;
                                                                    case 1:
                                                                        q21.r rVar3 = rVar;
                                                                        l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                        r53.p2 p2Var2 = rVar3.f142295h;
                                                                        do {
                                                                            value4 = p2Var2.getValue();
                                                                        } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                        break;
                                                                    default:
                                                                        q21.r rVar4 = rVar;
                                                                        rVar4.getClass();
                                                                        ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ6);
                                                    }
                                                }
                                                e23.a aVar12 = (e23.a) objQ6;
                                                boolean zR5 = mVar2.r(rVar);
                                                Object objQ7 = mVar2.q();
                                                if (zR5) {
                                                    objQ7 = new e23.a() { // from class: b21.h7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            Object value3;
                                                            Object value4;
                                                            switch (i37) {
                                                                case 0:
                                                                    q21.r rVar2 = rVar;
                                                                    l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                    r53.p2 p2Var = rVar2.f142295h;
                                                                    do {
                                                                        value3 = p2Var.getValue();
                                                                    } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                    break;
                                                                case 1:
                                                                    q21.r rVar3 = rVar;
                                                                    l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                    r53.p2 p2Var2 = rVar3.f142295h;
                                                                    do {
                                                                        value4 = p2Var2.getValue();
                                                                    } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                    break;
                                                                default:
                                                                    q21.r rVar4 = rVar;
                                                                    rVar4.getClass();
                                                                    ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ7);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ7 == p3.m.a.f135155b) {
                                                        objQ7 = new e23.a() { // from class: b21.h7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                Object value3;
                                                                Object value4;
                                                                switch (i37) {
                                                                    case 0:
                                                                        q21.r rVar2 = rVar;
                                                                        l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                        r53.p2 p2Var = rVar2.f142295h;
                                                                        do {
                                                                            value3 = p2Var.getValue();
                                                                        } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                        break;
                                                                    case 1:
                                                                        q21.r rVar3 = rVar;
                                                                        l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                        r53.p2 p2Var2 = rVar3.f142295h;
                                                                        do {
                                                                            value4 = p2Var2.getValue();
                                                                        } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                        break;
                                                                    default:
                                                                        q21.r rVar4 = rVar;
                                                                        rVar4.getClass();
                                                                        ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ7);
                                                    }
                                                }
                                                e23.a aVar13 = (e23.a) objQ7;
                                                boolean zR6 = mVar2.r(m0Var7);
                                                Object objQ8 = mVar2.q();
                                                if (zR6) {
                                                    objQ8 = new aa2.m(m0Var7, 9);
                                                    mVar2.K(objQ8);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ8 == p3.m.a.f135155b) {
                                                        objQ8 = new aa2.m(m0Var7, 9);
                                                        mVar2.K(objQ8);
                                                    }
                                                }
                                                e23.a aVar14 = (e23.a) objQ8;
                                                boolean zR7 = mVar2.r(m0Var7) | mVar2.r(rVar);
                                                Object objQ9 = mVar2.q();
                                                if (zR7) {
                                                    objQ9 = new e23.a() { // from class: b21.g7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i37) {
                                                                case 0:
                                                                    lc.y.l(m0Var7, new l4.e0(rVar.f142293f));
                                                                    break;
                                                                default:
                                                                    lc.y.l(m0Var7, new l4.o0(true, rVar.f142293f));
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ9);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ9 == p3.m.a.f135155b) {
                                                        objQ9 = new e23.a() { // from class: b21.g7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i37) {
                                                                    case 0:
                                                                        lc.y.l(m0Var7, new l4.e0(rVar.f142293f));
                                                                        break;
                                                                    default:
                                                                        lc.y.l(m0Var7, new l4.o0(true, rVar.f142293f));
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ9);
                                                    }
                                                }
                                                e23.a aVar15 = (e23.a) objQ9;
                                                boolean zR8 = mVar2.r(m0Var7);
                                                Object objQ10 = mVar2.q();
                                                if (zR8) {
                                                    objQ10 = new aa2.m(m0Var7, 10);
                                                    mVar2.K(objQ10);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ10 == p3.m.a.f135155b) {
                                                        objQ10 = new aa2.m(m0Var7, 10);
                                                        mVar2.K(objQ10);
                                                    }
                                                }
                                                e23.a aVar16 = (e23.a) objQ10;
                                                boolean zR9 = mVar2.r(rVar);
                                                Object objQ11 = mVar2.q();
                                                if (zR9) {
                                                    objQ11 = new a03.f(rVar, 24);
                                                    mVar2.K(objQ11);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ11 == p3.m.a.f135155b) {
                                                        objQ11 = new a03.f(rVar, 24);
                                                        mVar2.K(objQ11);
                                                    }
                                                }
                                                e23.l lVar3 = (e23.l) objQ11;
                                                boolean zR10 = mVar2.r(rVar);
                                                Object objQ12 = mVar2.q();
                                                if (zR10) {
                                                    final int i45 = 2;
                                                    objQ12 = new e23.a() { // from class: b21.h7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            Object value3;
                                                            Object value4;
                                                            switch (i45) {
                                                                case 0:
                                                                    q21.r rVar2 = rVar;
                                                                    l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                    r53.p2 p2Var = rVar2.f142295h;
                                                                    do {
                                                                        value3 = p2Var.getValue();
                                                                    } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                    break;
                                                                case 1:
                                                                    q21.r rVar3 = rVar;
                                                                    l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                    r53.p2 p2Var2 = rVar3.f142295h;
                                                                    do {
                                                                        value4 = p2Var2.getValue();
                                                                    } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                    break;
                                                                default:
                                                                    q21.r rVar4 = rVar;
                                                                    rVar4.getClass();
                                                                    ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ12);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ12 == p3.m.a.f135155b) {
                                                        final int i46 = 2;
                                                        objQ12 = new e23.a() { // from class: b21.h7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                Object value3;
                                                                Object value4;
                                                                switch (i46) {
                                                                    case 0:
                                                                        q21.r rVar2 = rVar;
                                                                        l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                        r53.p2 p2Var = rVar2.f142295h;
                                                                        do {
                                                                            value3 = p2Var.getValue();
                                                                        } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                        break;
                                                                    case 1:
                                                                        q21.r rVar3 = rVar;
                                                                        l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                        r53.p2 p2Var2 = rVar3.f142295h;
                                                                        do {
                                                                            value4 = p2Var2.getValue();
                                                                        } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                        break;
                                                                    default:
                                                                        q21.r rVar4 = rVar;
                                                                        rVar4.getClass();
                                                                        ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ12);
                                                    }
                                                }
                                                p21.l.a(qVar2, feVar, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, lVar3, (e23.a) objQ12, mVar2, (iIntValue2 >> 3) & 126);
                                                break;
                                            default:
                                                q21.r rVar2 = (q21.r) obj10;
                                                p3.m mVar3 = (p3.m) obj13;
                                                rVar2.getClass();
                                                ((q21.q) obj11).getClass();
                                                ((fe) obj12).getClass();
                                                p3.x1 x1Var4 = p3.n.f135158a;
                                                p3.p1 p1VarC2 = s9.c.c(rVar2.f142292e, mVar3);
                                                Boolean bool = (Boolean) p1VarC2.getF182175a();
                                                bool.booleanValue();
                                                boolean zB4 = mVar3.B(p1VarC2);
                                                lc.v vVar4 = vVar2;
                                                boolean zR11 = zB4 | mVar3.r(vVar4);
                                                lc.m0 m0Var8 = m0Var6;
                                                boolean zR12 = zR11 | mVar3.r(m0Var8) | mVar3.r(rVar2);
                                                x01.b bVar9 = bVar7;
                                                boolean zB5 = zR12 | mVar3.B(bVar9);
                                                Object objQ13 = mVar3.q();
                                                if (zB5) {
                                                    l7 l7Var2 = new l7(vVar4, m0Var8, rVar2, bVar9, p1VarC2, null);
                                                    mVar3.K(l7Var2);
                                                    objQ13 = l7Var2;
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ13 == p3.m.a.f135155b) {
                                                        l7 l7Var3 = new l7(vVar4, m0Var8, rVar2, bVar9, p1VarC2, null);
                                                        mVar3.K(l7Var3);
                                                        objQ13 = l7Var3;
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ13, bool, mVar3);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar), mVar, ((iB2 >> 3) & 14) | 384);
                                break;
                            default:
                                r1.q2.t(num, lVar2, vVar2);
                                p3.x1 x1Var3 = p3.n.f135158a;
                                boolean zR = mVar.r(m0Var6) | mVar.B(bVar7);
                                Object objQ = mVar.q();
                                if (zR) {
                                    objQ = new ao1.i(20, m0Var6, bVar7);
                                    mVar.K(objQ);
                                } else {
                                    p3.m.f135153a.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new ao1.i(20, m0Var6, bVar7);
                                        mVar.K(objQ);
                                    }
                                }
                                d21.i.a(null, (e23.a) objQ, mVar, 0);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                j0 j0Var2 = j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                n.a(k0Var2, t0Var2.b(l4.h0.class), mapB2, j0Var2, null, null, null, null, eVar6);
                z3.e eVar7 = new z3.e(607245717, true, new e23.r() { // from class: b21.j7
                    /* JADX WARN: Code duplicated, block: B:8:0x002f  */
                    @Override // e23.r
                    public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                        int i30 = i26;
                        final int i34 = 0;
                        final x01.b bVar7 = bVar6;
                        final lc.m0 m0Var6 = m0Var5;
                        r1.l lVar2 = (r1.l) obj6;
                        final lc.v vVar2 = (lc.v) obj7;
                        p3.m mVar = (p3.m) obj8;
                        Integer num = (Integer) obj9;
                        switch (i30) {
                            case 0:
                                int iB = androidx.room.a0.b(num, lVar2, vVar2);
                                p3.x1 x1Var = p3.n.f135158a;
                                final int i35 = 1;
                                q8.a(vVar2, m0Var6, z3.f.c(-678297786, new e23.s() { // from class: b21.y6
                                    /* JADX WARN: Code duplicated, block: B:15:0x00c9  */
                                    /* JADX WARN: Code duplicated, block: B:20:0x0105  */
                                    /* JADX WARN: Code duplicated, block: B:33:0x0144  */
                                    /* JADX WARN: Code duplicated, block: B:38:0x0170  */
                                    /* JADX WARN: Code duplicated, block: B:43:0x0190  */
                                    /* JADX WARN: Code duplicated, block: B:48:0x01ac  */
                                    /* JADX WARN: Code duplicated, block: B:53:0x01c8  */
                                    /* JADX WARN: Code duplicated, block: B:58:0x01e3  */
                                    /* JADX WARN: Code duplicated, block: B:63:0x0206  */
                                    /* JADX WARN: Code duplicated, block: B:68:0x0222  */
                                    /* JADX WARN: Code duplicated, block: B:73:0x0240  */
                                    /* JADX WARN: Code duplicated, block: B:78:0x025d  */
                                    /* JADX WARN: Code duplicated, block: B:8:0x0062  */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // e23.s
                                    public final Object invoke(Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
                                        int i36 = i35;
                                        p3.m.a aVar9 = p3.m.f135153a;
                                        switch (i36) {
                                            case 0:
                                                final q21.r rVar = (q21.r) obj10;
                                                q21.q qVar2 = (q21.q) obj11;
                                                fe feVar = (fe) obj12;
                                                p3.m mVar2 = (p3.m) obj13;
                                                int iIntValue2 = ((Integer) obj14).intValue();
                                                rVar.getClass();
                                                qVar2.getClass();
                                                feVar.getClass();
                                                p3.x1 x1Var3 = p3.n.f135158a;
                                                lc.v vVar3 = vVar2;
                                                androidx.lifecycle.j1 j1VarA2 = vVar3.a();
                                                p3.p1 p1VarC = s9.c.c(j1VarA2.d(null, "editSetupUpdate"), mVar2);
                                                String str2 = (String) p1VarC.getF182175a();
                                                boolean zB = mVar2.B(p1VarC) | mVar2.r(rVar) | mVar2.r(j1VarA2);
                                                Object objQ = mVar2.q();
                                                if (zB) {
                                                    objQ = new m7(p1VarC, rVar, j1VarA2, null);
                                                    mVar2.K(objQ);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ == p3.m.a.f135155b) {
                                                        objQ = new m7(p1VarC, rVar, j1VarA2, null);
                                                        mVar2.K(objQ);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ, str2, mVar2);
                                                p3.p1 p1VarG = o53.f0.G(vVar3.a().b("regionAndLanguageResult"), mVar2);
                                                o13.p pVar3 = (o13.p) p1VarG.getF182175a();
                                                boolean zB2 = mVar2.B(p1VarG) | mVar2.r(rVar) | mVar2.r(vVar3);
                                                Object objQ2 = mVar2.q();
                                                if (zB2) {
                                                    objQ2 = new n7(p1VarG, rVar, vVar3, null);
                                                    mVar2.K(objQ2);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ2 == p3.m.a.f135155b) {
                                                        objQ2 = new n7(p1VarG, rVar, vVar3, null);
                                                        mVar2.K(objQ2);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ2, pVar3, mVar2);
                                                l4 l4Var = qVar2.f142286i;
                                                final int i37 = 1;
                                                final int i38 = 0;
                                                boolean z15 = (((iIntValue2 & 112) ^ 48) > 32 && mVar2.B(qVar2)) || (iIntValue2 & 48) == 32;
                                                final lc.m0 m0Var7 = m0Var6;
                                                boolean zR = z15 | mVar2.r(m0Var7) | mVar2.r(rVar);
                                                Object objQ3 = mVar2.q();
                                                if (zR) {
                                                    objQ3 = new o7(qVar2, m0Var7, rVar, null);
                                                    mVar2.K(objQ3);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ3 == p3.m.a.f135155b) {
                                                        objQ3 = new o7(qVar2, m0Var7, rVar, null);
                                                        mVar2.K(objQ3);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ3, l4Var, mVar2);
                                                boolean zR2 = mVar2.r(m0Var7) | mVar2.r(rVar);
                                                x01.b bVar8 = bVar7;
                                                boolean zB3 = zR2 | mVar2.B(bVar8);
                                                Object objQ4 = mVar2.q();
                                                int i39 = 10;
                                                if (zB3) {
                                                    objQ4 = new ak0.m(m0Var7, i39, rVar, bVar8);
                                                    mVar2.K(objQ4);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ4 == p3.m.a.f135155b) {
                                                        objQ4 = new ak0.m(m0Var7, i39, rVar, bVar8);
                                                        mVar2.K(objQ4);
                                                    }
                                                }
                                                e23.a aVar10 = (e23.a) objQ4;
                                                boolean zR3 = mVar2.r(m0Var7) | mVar2.r(rVar);
                                                Object objQ5 = mVar2.q();
                                                if (zR3) {
                                                    objQ5 = new e23.a() { // from class: b21.g7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i38) {
                                                                case 0:
                                                                    lc.y.l(m0Var7, new l4.e0(rVar.f142293f));
                                                                    break;
                                                                default:
                                                                    lc.y.l(m0Var7, new l4.o0(true, rVar.f142293f));
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ5);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ5 == p3.m.a.f135155b) {
                                                        objQ5 = new e23.a() { // from class: b21.g7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i38) {
                                                                    case 0:
                                                                        lc.y.l(m0Var7, new l4.e0(rVar.f142293f));
                                                                        break;
                                                                    default:
                                                                        lc.y.l(m0Var7, new l4.o0(true, rVar.f142293f));
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ5);
                                                    }
                                                }
                                                e23.a aVar11 = (e23.a) objQ5;
                                                boolean zR4 = mVar2.r(rVar);
                                                Object objQ6 = mVar2.q();
                                                if (zR4) {
                                                    objQ6 = new e23.a() { // from class: b21.h7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            Object value3;
                                                            Object value4;
                                                            switch (i38) {
                                                                case 0:
                                                                    q21.r rVar2 = rVar;
                                                                    l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                    r53.p2 p2Var = rVar2.f142295h;
                                                                    do {
                                                                        value3 = p2Var.getValue();
                                                                    } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                    break;
                                                                case 1:
                                                                    q21.r rVar3 = rVar;
                                                                    l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                    r53.p2 p2Var2 = rVar3.f142295h;
                                                                    do {
                                                                        value4 = p2Var2.getValue();
                                                                    } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                    break;
                                                                default:
                                                                    q21.r rVar4 = rVar;
                                                                    rVar4.getClass();
                                                                    ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ6);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ6 == p3.m.a.f135155b) {
                                                        objQ6 = new e23.a() { // from class: b21.h7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                Object value3;
                                                                Object value4;
                                                                switch (i38) {
                                                                    case 0:
                                                                        q21.r rVar2 = rVar;
                                                                        l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                        r53.p2 p2Var = rVar2.f142295h;
                                                                        do {
                                                                            value3 = p2Var.getValue();
                                                                        } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                        break;
                                                                    case 1:
                                                                        q21.r rVar3 = rVar;
                                                                        l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                        r53.p2 p2Var2 = rVar3.f142295h;
                                                                        do {
                                                                            value4 = p2Var2.getValue();
                                                                        } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                        break;
                                                                    default:
                                                                        q21.r rVar4 = rVar;
                                                                        rVar4.getClass();
                                                                        ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ6);
                                                    }
                                                }
                                                e23.a aVar12 = (e23.a) objQ6;
                                                boolean zR5 = mVar2.r(rVar);
                                                Object objQ7 = mVar2.q();
                                                if (zR5) {
                                                    objQ7 = new e23.a() { // from class: b21.h7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            Object value3;
                                                            Object value4;
                                                            switch (i37) {
                                                                case 0:
                                                                    q21.r rVar2 = rVar;
                                                                    l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                    r53.p2 p2Var = rVar2.f142295h;
                                                                    do {
                                                                        value3 = p2Var.getValue();
                                                                    } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                    break;
                                                                case 1:
                                                                    q21.r rVar3 = rVar;
                                                                    l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                    r53.p2 p2Var2 = rVar3.f142295h;
                                                                    do {
                                                                        value4 = p2Var2.getValue();
                                                                    } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                    break;
                                                                default:
                                                                    q21.r rVar4 = rVar;
                                                                    rVar4.getClass();
                                                                    ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ7);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ7 == p3.m.a.f135155b) {
                                                        objQ7 = new e23.a() { // from class: b21.h7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                Object value3;
                                                                Object value4;
                                                                switch (i37) {
                                                                    case 0:
                                                                        q21.r rVar2 = rVar;
                                                                        l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                        r53.p2 p2Var = rVar2.f142295h;
                                                                        do {
                                                                            value3 = p2Var.getValue();
                                                                        } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                        break;
                                                                    case 1:
                                                                        q21.r rVar3 = rVar;
                                                                        l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                        r53.p2 p2Var2 = rVar3.f142295h;
                                                                        do {
                                                                            value4 = p2Var2.getValue();
                                                                        } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                        break;
                                                                    default:
                                                                        q21.r rVar4 = rVar;
                                                                        rVar4.getClass();
                                                                        ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ7);
                                                    }
                                                }
                                                e23.a aVar13 = (e23.a) objQ7;
                                                boolean zR6 = mVar2.r(m0Var7);
                                                Object objQ8 = mVar2.q();
                                                if (zR6) {
                                                    objQ8 = new aa2.m(m0Var7, 9);
                                                    mVar2.K(objQ8);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ8 == p3.m.a.f135155b) {
                                                        objQ8 = new aa2.m(m0Var7, 9);
                                                        mVar2.K(objQ8);
                                                    }
                                                }
                                                e23.a aVar14 = (e23.a) objQ8;
                                                boolean zR7 = mVar2.r(m0Var7) | mVar2.r(rVar);
                                                Object objQ9 = mVar2.q();
                                                if (zR7) {
                                                    objQ9 = new e23.a() { // from class: b21.g7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i37) {
                                                                case 0:
                                                                    lc.y.l(m0Var7, new l4.e0(rVar.f142293f));
                                                                    break;
                                                                default:
                                                                    lc.y.l(m0Var7, new l4.o0(true, rVar.f142293f));
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ9);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ9 == p3.m.a.f135155b) {
                                                        objQ9 = new e23.a() { // from class: b21.g7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i37) {
                                                                    case 0:
                                                                        lc.y.l(m0Var7, new l4.e0(rVar.f142293f));
                                                                        break;
                                                                    default:
                                                                        lc.y.l(m0Var7, new l4.o0(true, rVar.f142293f));
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ9);
                                                    }
                                                }
                                                e23.a aVar15 = (e23.a) objQ9;
                                                boolean zR8 = mVar2.r(m0Var7);
                                                Object objQ10 = mVar2.q();
                                                if (zR8) {
                                                    objQ10 = new aa2.m(m0Var7, 10);
                                                    mVar2.K(objQ10);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ10 == p3.m.a.f135155b) {
                                                        objQ10 = new aa2.m(m0Var7, 10);
                                                        mVar2.K(objQ10);
                                                    }
                                                }
                                                e23.a aVar16 = (e23.a) objQ10;
                                                boolean zR9 = mVar2.r(rVar);
                                                Object objQ11 = mVar2.q();
                                                if (zR9) {
                                                    objQ11 = new a03.f(rVar, 24);
                                                    mVar2.K(objQ11);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ11 == p3.m.a.f135155b) {
                                                        objQ11 = new a03.f(rVar, 24);
                                                        mVar2.K(objQ11);
                                                    }
                                                }
                                                e23.l lVar3 = (e23.l) objQ11;
                                                boolean zR10 = mVar2.r(rVar);
                                                Object objQ12 = mVar2.q();
                                                if (zR10) {
                                                    final int i46 = 2;
                                                    objQ12 = new e23.a() { // from class: b21.h7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            Object value3;
                                                            Object value4;
                                                            switch (i46) {
                                                                case 0:
                                                                    q21.r rVar2 = rVar;
                                                                    l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                    r53.p2 p2Var = rVar2.f142295h;
                                                                    do {
                                                                        value3 = p2Var.getValue();
                                                                    } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                    break;
                                                                case 1:
                                                                    q21.r rVar3 = rVar;
                                                                    l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                    r53.p2 p2Var2 = rVar3.f142295h;
                                                                    do {
                                                                        value4 = p2Var2.getValue();
                                                                    } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                    break;
                                                                default:
                                                                    q21.r rVar4 = rVar;
                                                                    rVar4.getClass();
                                                                    ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ12);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ12 == p3.m.a.f135155b) {
                                                        final int i47 = 2;
                                                        objQ12 = new e23.a() { // from class: b21.h7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                Object value3;
                                                                Object value4;
                                                                switch (i47) {
                                                                    case 0:
                                                                        q21.r rVar2 = rVar;
                                                                        l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                        r53.p2 p2Var = rVar2.f142295h;
                                                                        do {
                                                                            value3 = p2Var.getValue();
                                                                        } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                        break;
                                                                    case 1:
                                                                        q21.r rVar3 = rVar;
                                                                        l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                        r53.p2 p2Var2 = rVar3.f142295h;
                                                                        do {
                                                                            value4 = p2Var2.getValue();
                                                                        } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                        break;
                                                                    default:
                                                                        q21.r rVar4 = rVar;
                                                                        rVar4.getClass();
                                                                        ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ12);
                                                    }
                                                }
                                                p21.l.a(qVar2, feVar, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, lVar3, (e23.a) objQ12, mVar2, (iIntValue2 >> 3) & 126);
                                                break;
                                            default:
                                                q21.r rVar2 = (q21.r) obj10;
                                                p3.m mVar3 = (p3.m) obj13;
                                                rVar2.getClass();
                                                ((q21.q) obj11).getClass();
                                                ((fe) obj12).getClass();
                                                p3.x1 x1Var4 = p3.n.f135158a;
                                                p3.p1 p1VarC2 = s9.c.c(rVar2.f142292e, mVar3);
                                                Boolean bool = (Boolean) p1VarC2.getF182175a();
                                                bool.booleanValue();
                                                boolean zB4 = mVar3.B(p1VarC2);
                                                lc.v vVar4 = vVar2;
                                                boolean zR11 = zB4 | mVar3.r(vVar4);
                                                lc.m0 m0Var8 = m0Var6;
                                                boolean zR12 = zR11 | mVar3.r(m0Var8) | mVar3.r(rVar2);
                                                x01.b bVar9 = bVar7;
                                                boolean zB5 = zR12 | mVar3.B(bVar9);
                                                Object objQ13 = mVar3.q();
                                                if (zB5) {
                                                    l7 l7Var3 = new l7(vVar4, m0Var8, rVar2, bVar9, p1VarC2, null);
                                                    mVar3.K(l7Var3);
                                                    objQ13 = l7Var3;
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ13 == p3.m.a.f135155b) {
                                                        l7 l7Var4 = new l7(vVar4, m0Var8, rVar2, bVar9, p1VarC2, null);
                                                        mVar3.K(l7Var4);
                                                        objQ13 = l7Var4;
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ13, bool, mVar3);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar), mVar, ((iB >> 3) & 14) | 384);
                                break;
                            case 1:
                                int iB2 = androidx.room.a0.b(num, lVar2, vVar2);
                                p3.x1 x1Var2 = p3.n.f135158a;
                                q8.a(vVar2, m0Var6, z3.f.c(-1971187843, new e23.s() { // from class: b21.y6
                                    /* JADX WARN: Code duplicated, block: B:15:0x00c9  */
                                    /* JADX WARN: Code duplicated, block: B:20:0x0105  */
                                    /* JADX WARN: Code duplicated, block: B:33:0x0144  */
                                    /* JADX WARN: Code duplicated, block: B:38:0x0170  */
                                    /* JADX WARN: Code duplicated, block: B:43:0x0190  */
                                    /* JADX WARN: Code duplicated, block: B:48:0x01ac  */
                                    /* JADX WARN: Code duplicated, block: B:53:0x01c8  */
                                    /* JADX WARN: Code duplicated, block: B:58:0x01e3  */
                                    /* JADX WARN: Code duplicated, block: B:63:0x0206  */
                                    /* JADX WARN: Code duplicated, block: B:68:0x0222  */
                                    /* JADX WARN: Code duplicated, block: B:73:0x0240  */
                                    /* JADX WARN: Code duplicated, block: B:78:0x025d  */
                                    /* JADX WARN: Code duplicated, block: B:8:0x0062  */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // e23.s
                                    public final Object invoke(Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
                                        int i36 = i34;
                                        p3.m.a aVar9 = p3.m.f135153a;
                                        switch (i36) {
                                            case 0:
                                                final q21.r rVar = (q21.r) obj10;
                                                q21.q qVar2 = (q21.q) obj11;
                                                fe feVar = (fe) obj12;
                                                p3.m mVar2 = (p3.m) obj13;
                                                int iIntValue2 = ((Integer) obj14).intValue();
                                                rVar.getClass();
                                                qVar2.getClass();
                                                feVar.getClass();
                                                p3.x1 x1Var3 = p3.n.f135158a;
                                                lc.v vVar3 = vVar2;
                                                androidx.lifecycle.j1 j1VarA2 = vVar3.a();
                                                p3.p1 p1VarC = s9.c.c(j1VarA2.d(null, "editSetupUpdate"), mVar2);
                                                String str2 = (String) p1VarC.getF182175a();
                                                boolean zB = mVar2.B(p1VarC) | mVar2.r(rVar) | mVar2.r(j1VarA2);
                                                Object objQ = mVar2.q();
                                                if (zB) {
                                                    objQ = new m7(p1VarC, rVar, j1VarA2, null);
                                                    mVar2.K(objQ);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ == p3.m.a.f135155b) {
                                                        objQ = new m7(p1VarC, rVar, j1VarA2, null);
                                                        mVar2.K(objQ);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ, str2, mVar2);
                                                p3.p1 p1VarG = o53.f0.G(vVar3.a().b("regionAndLanguageResult"), mVar2);
                                                o13.p pVar3 = (o13.p) p1VarG.getF182175a();
                                                boolean zB2 = mVar2.B(p1VarG) | mVar2.r(rVar) | mVar2.r(vVar3);
                                                Object objQ2 = mVar2.q();
                                                if (zB2) {
                                                    objQ2 = new n7(p1VarG, rVar, vVar3, null);
                                                    mVar2.K(objQ2);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ2 == p3.m.a.f135155b) {
                                                        objQ2 = new n7(p1VarG, rVar, vVar3, null);
                                                        mVar2.K(objQ2);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ2, pVar3, mVar2);
                                                l4 l4Var = qVar2.f142286i;
                                                final int i37 = 1;
                                                final int i38 = 0;
                                                boolean z15 = (((iIntValue2 & 112) ^ 48) > 32 && mVar2.B(qVar2)) || (iIntValue2 & 48) == 32;
                                                final lc.m0 m0Var7 = m0Var6;
                                                boolean zR = z15 | mVar2.r(m0Var7) | mVar2.r(rVar);
                                                Object objQ3 = mVar2.q();
                                                if (zR) {
                                                    objQ3 = new o7(qVar2, m0Var7, rVar, null);
                                                    mVar2.K(objQ3);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ3 == p3.m.a.f135155b) {
                                                        objQ3 = new o7(qVar2, m0Var7, rVar, null);
                                                        mVar2.K(objQ3);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ3, l4Var, mVar2);
                                                boolean zR2 = mVar2.r(m0Var7) | mVar2.r(rVar);
                                                x01.b bVar8 = bVar7;
                                                boolean zB3 = zR2 | mVar2.B(bVar8);
                                                Object objQ4 = mVar2.q();
                                                int i39 = 10;
                                                if (zB3) {
                                                    objQ4 = new ak0.m(m0Var7, i39, rVar, bVar8);
                                                    mVar2.K(objQ4);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ4 == p3.m.a.f135155b) {
                                                        objQ4 = new ak0.m(m0Var7, i39, rVar, bVar8);
                                                        mVar2.K(objQ4);
                                                    }
                                                }
                                                e23.a aVar10 = (e23.a) objQ4;
                                                boolean zR3 = mVar2.r(m0Var7) | mVar2.r(rVar);
                                                Object objQ5 = mVar2.q();
                                                if (zR3) {
                                                    objQ5 = new e23.a() { // from class: b21.g7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i38) {
                                                                case 0:
                                                                    lc.y.l(m0Var7, new l4.e0(rVar.f142293f));
                                                                    break;
                                                                default:
                                                                    lc.y.l(m0Var7, new l4.o0(true, rVar.f142293f));
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ5);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ5 == p3.m.a.f135155b) {
                                                        objQ5 = new e23.a() { // from class: b21.g7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i38) {
                                                                    case 0:
                                                                        lc.y.l(m0Var7, new l4.e0(rVar.f142293f));
                                                                        break;
                                                                    default:
                                                                        lc.y.l(m0Var7, new l4.o0(true, rVar.f142293f));
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ5);
                                                    }
                                                }
                                                e23.a aVar11 = (e23.a) objQ5;
                                                boolean zR4 = mVar2.r(rVar);
                                                Object objQ6 = mVar2.q();
                                                if (zR4) {
                                                    objQ6 = new e23.a() { // from class: b21.h7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            Object value3;
                                                            Object value4;
                                                            switch (i38) {
                                                                case 0:
                                                                    q21.r rVar2 = rVar;
                                                                    l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                    r53.p2 p2Var = rVar2.f142295h;
                                                                    do {
                                                                        value3 = p2Var.getValue();
                                                                    } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                    break;
                                                                case 1:
                                                                    q21.r rVar3 = rVar;
                                                                    l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                    r53.p2 p2Var2 = rVar3.f142295h;
                                                                    do {
                                                                        value4 = p2Var2.getValue();
                                                                    } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                    break;
                                                                default:
                                                                    q21.r rVar4 = rVar;
                                                                    rVar4.getClass();
                                                                    ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ6);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ6 == p3.m.a.f135155b) {
                                                        objQ6 = new e23.a() { // from class: b21.h7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                Object value3;
                                                                Object value4;
                                                                switch (i38) {
                                                                    case 0:
                                                                        q21.r rVar2 = rVar;
                                                                        l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                        r53.p2 p2Var = rVar2.f142295h;
                                                                        do {
                                                                            value3 = p2Var.getValue();
                                                                        } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                        break;
                                                                    case 1:
                                                                        q21.r rVar3 = rVar;
                                                                        l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                        r53.p2 p2Var2 = rVar3.f142295h;
                                                                        do {
                                                                            value4 = p2Var2.getValue();
                                                                        } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                        break;
                                                                    default:
                                                                        q21.r rVar4 = rVar;
                                                                        rVar4.getClass();
                                                                        ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ6);
                                                    }
                                                }
                                                e23.a aVar12 = (e23.a) objQ6;
                                                boolean zR5 = mVar2.r(rVar);
                                                Object objQ7 = mVar2.q();
                                                if (zR5) {
                                                    objQ7 = new e23.a() { // from class: b21.h7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            Object value3;
                                                            Object value4;
                                                            switch (i37) {
                                                                case 0:
                                                                    q21.r rVar2 = rVar;
                                                                    l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                    r53.p2 p2Var = rVar2.f142295h;
                                                                    do {
                                                                        value3 = p2Var.getValue();
                                                                    } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                    break;
                                                                case 1:
                                                                    q21.r rVar3 = rVar;
                                                                    l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                    r53.p2 p2Var2 = rVar3.f142295h;
                                                                    do {
                                                                        value4 = p2Var2.getValue();
                                                                    } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                    break;
                                                                default:
                                                                    q21.r rVar4 = rVar;
                                                                    rVar4.getClass();
                                                                    ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ7);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ7 == p3.m.a.f135155b) {
                                                        objQ7 = new e23.a() { // from class: b21.h7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                Object value3;
                                                                Object value4;
                                                                switch (i37) {
                                                                    case 0:
                                                                        q21.r rVar2 = rVar;
                                                                        l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                        r53.p2 p2Var = rVar2.f142295h;
                                                                        do {
                                                                            value3 = p2Var.getValue();
                                                                        } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                        break;
                                                                    case 1:
                                                                        q21.r rVar3 = rVar;
                                                                        l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                        r53.p2 p2Var2 = rVar3.f142295h;
                                                                        do {
                                                                            value4 = p2Var2.getValue();
                                                                        } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                        break;
                                                                    default:
                                                                        q21.r rVar4 = rVar;
                                                                        rVar4.getClass();
                                                                        ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ7);
                                                    }
                                                }
                                                e23.a aVar13 = (e23.a) objQ7;
                                                boolean zR6 = mVar2.r(m0Var7);
                                                Object objQ8 = mVar2.q();
                                                if (zR6) {
                                                    objQ8 = new aa2.m(m0Var7, 9);
                                                    mVar2.K(objQ8);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ8 == p3.m.a.f135155b) {
                                                        objQ8 = new aa2.m(m0Var7, 9);
                                                        mVar2.K(objQ8);
                                                    }
                                                }
                                                e23.a aVar14 = (e23.a) objQ8;
                                                boolean zR7 = mVar2.r(m0Var7) | mVar2.r(rVar);
                                                Object objQ9 = mVar2.q();
                                                if (zR7) {
                                                    objQ9 = new e23.a() { // from class: b21.g7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i37) {
                                                                case 0:
                                                                    lc.y.l(m0Var7, new l4.e0(rVar.f142293f));
                                                                    break;
                                                                default:
                                                                    lc.y.l(m0Var7, new l4.o0(true, rVar.f142293f));
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ9);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ9 == p3.m.a.f135155b) {
                                                        objQ9 = new e23.a() { // from class: b21.g7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i37) {
                                                                    case 0:
                                                                        lc.y.l(m0Var7, new l4.e0(rVar.f142293f));
                                                                        break;
                                                                    default:
                                                                        lc.y.l(m0Var7, new l4.o0(true, rVar.f142293f));
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ9);
                                                    }
                                                }
                                                e23.a aVar15 = (e23.a) objQ9;
                                                boolean zR8 = mVar2.r(m0Var7);
                                                Object objQ10 = mVar2.q();
                                                if (zR8) {
                                                    objQ10 = new aa2.m(m0Var7, 10);
                                                    mVar2.K(objQ10);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ10 == p3.m.a.f135155b) {
                                                        objQ10 = new aa2.m(m0Var7, 10);
                                                        mVar2.K(objQ10);
                                                    }
                                                }
                                                e23.a aVar16 = (e23.a) objQ10;
                                                boolean zR9 = mVar2.r(rVar);
                                                Object objQ11 = mVar2.q();
                                                if (zR9) {
                                                    objQ11 = new a03.f(rVar, 24);
                                                    mVar2.K(objQ11);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ11 == p3.m.a.f135155b) {
                                                        objQ11 = new a03.f(rVar, 24);
                                                        mVar2.K(objQ11);
                                                    }
                                                }
                                                e23.l lVar3 = (e23.l) objQ11;
                                                boolean zR10 = mVar2.r(rVar);
                                                Object objQ12 = mVar2.q();
                                                if (zR10) {
                                                    final int i47 = 2;
                                                    objQ12 = new e23.a() { // from class: b21.h7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            Object value3;
                                                            Object value4;
                                                            switch (i47) {
                                                                case 0:
                                                                    q21.r rVar2 = rVar;
                                                                    l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                    r53.p2 p2Var = rVar2.f142295h;
                                                                    do {
                                                                        value3 = p2Var.getValue();
                                                                    } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                    break;
                                                                case 1:
                                                                    q21.r rVar3 = rVar;
                                                                    l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                    r53.p2 p2Var2 = rVar3.f142295h;
                                                                    do {
                                                                        value4 = p2Var2.getValue();
                                                                    } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                    break;
                                                                default:
                                                                    q21.r rVar4 = rVar;
                                                                    rVar4.getClass();
                                                                    ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ12);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ12 == p3.m.a.f135155b) {
                                                        final int i48 = 2;
                                                        objQ12 = new e23.a() { // from class: b21.h7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                Object value3;
                                                                Object value4;
                                                                switch (i48) {
                                                                    case 0:
                                                                        q21.r rVar2 = rVar;
                                                                        l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                        r53.p2 p2Var = rVar2.f142295h;
                                                                        do {
                                                                            value3 = p2Var.getValue();
                                                                        } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                        break;
                                                                    case 1:
                                                                        q21.r rVar3 = rVar;
                                                                        l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                        r53.p2 p2Var2 = rVar3.f142295h;
                                                                        do {
                                                                            value4 = p2Var2.getValue();
                                                                        } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                        break;
                                                                    default:
                                                                        q21.r rVar4 = rVar;
                                                                        rVar4.getClass();
                                                                        ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ12);
                                                    }
                                                }
                                                p21.l.a(qVar2, feVar, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, lVar3, (e23.a) objQ12, mVar2, (iIntValue2 >> 3) & 126);
                                                break;
                                            default:
                                                q21.r rVar2 = (q21.r) obj10;
                                                p3.m mVar3 = (p3.m) obj13;
                                                rVar2.getClass();
                                                ((q21.q) obj11).getClass();
                                                ((fe) obj12).getClass();
                                                p3.x1 x1Var4 = p3.n.f135158a;
                                                p3.p1 p1VarC2 = s9.c.c(rVar2.f142292e, mVar3);
                                                Boolean bool = (Boolean) p1VarC2.getF182175a();
                                                bool.booleanValue();
                                                boolean zB4 = mVar3.B(p1VarC2);
                                                lc.v vVar4 = vVar2;
                                                boolean zR11 = zB4 | mVar3.r(vVar4);
                                                lc.m0 m0Var8 = m0Var6;
                                                boolean zR12 = zR11 | mVar3.r(m0Var8) | mVar3.r(rVar2);
                                                x01.b bVar9 = bVar7;
                                                boolean zB5 = zR12 | mVar3.B(bVar9);
                                                Object objQ13 = mVar3.q();
                                                if (zB5) {
                                                    l7 l7Var4 = new l7(vVar4, m0Var8, rVar2, bVar9, p1VarC2, null);
                                                    mVar3.K(l7Var4);
                                                    objQ13 = l7Var4;
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ13 == p3.m.a.f135155b) {
                                                        l7 l7Var5 = new l7(vVar4, m0Var8, rVar2, bVar9, p1VarC2, null);
                                                        mVar3.K(l7Var5);
                                                        objQ13 = l7Var5;
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ13, bool, mVar3);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar), mVar, ((iB2 >> 3) & 14) | 384);
                                break;
                            default:
                                r1.q2.t(num, lVar2, vVar2);
                                p3.x1 x1Var3 = p3.n.f135158a;
                                boolean zR = mVar.r(m0Var6) | mVar.B(bVar7);
                                Object objQ = mVar.q();
                                if (zR) {
                                    objQ = new ao1.i(20, m0Var6, bVar7);
                                    mVar.K(objQ);
                                } else {
                                    p3.m.f135153a.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new ao1.i(20, m0Var6, bVar7);
                                        mVar.K(objQ);
                                    }
                                }
                                d21.i.a(null, (e23.a) objQ, mVar, 0);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                p13.k0 k0Var3 = p13.k0.f134949a;
                k0Var3.getClass();
                n.a(k0Var2, t0Var2.b(l4.g0.class), k0Var3, j0Var2, null, null, null, null, eVar7);
                n.a(k0Var2, t0Var2.b(l4.f0.class), k0Var3, j0Var2, null, null, null, null, new z3.e(-624046826, true, new e23.r() { // from class: b21.j7
                    /* JADX WARN: Code duplicated, block: B:8:0x002f  */
                    @Override // e23.r
                    public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                        int i30 = i25;
                        final int i34 = 0;
                        final x01.b bVar7 = bVar6;
                        final lc.m0 m0Var6 = m0Var5;
                        r1.l lVar2 = (r1.l) obj6;
                        final lc.v vVar2 = (lc.v) obj7;
                        p3.m mVar = (p3.m) obj8;
                        Integer num = (Integer) obj9;
                        switch (i30) {
                            case 0:
                                int iB = androidx.room.a0.b(num, lVar2, vVar2);
                                p3.x1 x1Var = p3.n.f135158a;
                                final int i35 = 1;
                                q8.a(vVar2, m0Var6, z3.f.c(-678297786, new e23.s() { // from class: b21.y6
                                    /* JADX WARN: Code duplicated, block: B:15:0x00c9  */
                                    /* JADX WARN: Code duplicated, block: B:20:0x0105  */
                                    /* JADX WARN: Code duplicated, block: B:33:0x0144  */
                                    /* JADX WARN: Code duplicated, block: B:38:0x0170  */
                                    /* JADX WARN: Code duplicated, block: B:43:0x0190  */
                                    /* JADX WARN: Code duplicated, block: B:48:0x01ac  */
                                    /* JADX WARN: Code duplicated, block: B:53:0x01c8  */
                                    /* JADX WARN: Code duplicated, block: B:58:0x01e3  */
                                    /* JADX WARN: Code duplicated, block: B:63:0x0206  */
                                    /* JADX WARN: Code duplicated, block: B:68:0x0222  */
                                    /* JADX WARN: Code duplicated, block: B:73:0x0240  */
                                    /* JADX WARN: Code duplicated, block: B:78:0x025d  */
                                    /* JADX WARN: Code duplicated, block: B:8:0x0062  */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // e23.s
                                    public final Object invoke(Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
                                        int i36 = i35;
                                        p3.m.a aVar9 = p3.m.f135153a;
                                        switch (i36) {
                                            case 0:
                                                final q21.r rVar = (q21.r) obj10;
                                                q21.q qVar2 = (q21.q) obj11;
                                                fe feVar = (fe) obj12;
                                                p3.m mVar2 = (p3.m) obj13;
                                                int iIntValue2 = ((Integer) obj14).intValue();
                                                rVar.getClass();
                                                qVar2.getClass();
                                                feVar.getClass();
                                                p3.x1 x1Var3 = p3.n.f135158a;
                                                lc.v vVar3 = vVar2;
                                                androidx.lifecycle.j1 j1VarA2 = vVar3.a();
                                                p3.p1 p1VarC = s9.c.c(j1VarA2.d(null, "editSetupUpdate"), mVar2);
                                                String str2 = (String) p1VarC.getF182175a();
                                                boolean zB = mVar2.B(p1VarC) | mVar2.r(rVar) | mVar2.r(j1VarA2);
                                                Object objQ = mVar2.q();
                                                if (zB) {
                                                    objQ = new m7(p1VarC, rVar, j1VarA2, null);
                                                    mVar2.K(objQ);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ == p3.m.a.f135155b) {
                                                        objQ = new m7(p1VarC, rVar, j1VarA2, null);
                                                        mVar2.K(objQ);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ, str2, mVar2);
                                                p3.p1 p1VarG = o53.f0.G(vVar3.a().b("regionAndLanguageResult"), mVar2);
                                                o13.p pVar3 = (o13.p) p1VarG.getF182175a();
                                                boolean zB2 = mVar2.B(p1VarG) | mVar2.r(rVar) | mVar2.r(vVar3);
                                                Object objQ2 = mVar2.q();
                                                if (zB2) {
                                                    objQ2 = new n7(p1VarG, rVar, vVar3, null);
                                                    mVar2.K(objQ2);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ2 == p3.m.a.f135155b) {
                                                        objQ2 = new n7(p1VarG, rVar, vVar3, null);
                                                        mVar2.K(objQ2);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ2, pVar3, mVar2);
                                                l4 l4Var = qVar2.f142286i;
                                                final int i37 = 1;
                                                final int i38 = 0;
                                                boolean z15 = (((iIntValue2 & 112) ^ 48) > 32 && mVar2.B(qVar2)) || (iIntValue2 & 48) == 32;
                                                final lc.m0 m0Var7 = m0Var6;
                                                boolean zR = z15 | mVar2.r(m0Var7) | mVar2.r(rVar);
                                                Object objQ3 = mVar2.q();
                                                if (zR) {
                                                    objQ3 = new o7(qVar2, m0Var7, rVar, null);
                                                    mVar2.K(objQ3);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ3 == p3.m.a.f135155b) {
                                                        objQ3 = new o7(qVar2, m0Var7, rVar, null);
                                                        mVar2.K(objQ3);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ3, l4Var, mVar2);
                                                boolean zR2 = mVar2.r(m0Var7) | mVar2.r(rVar);
                                                x01.b bVar8 = bVar7;
                                                boolean zB3 = zR2 | mVar2.B(bVar8);
                                                Object objQ4 = mVar2.q();
                                                int i39 = 10;
                                                if (zB3) {
                                                    objQ4 = new ak0.m(m0Var7, i39, rVar, bVar8);
                                                    mVar2.K(objQ4);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ4 == p3.m.a.f135155b) {
                                                        objQ4 = new ak0.m(m0Var7, i39, rVar, bVar8);
                                                        mVar2.K(objQ4);
                                                    }
                                                }
                                                e23.a aVar10 = (e23.a) objQ4;
                                                boolean zR3 = mVar2.r(m0Var7) | mVar2.r(rVar);
                                                Object objQ5 = mVar2.q();
                                                if (zR3) {
                                                    objQ5 = new e23.a() { // from class: b21.g7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i38) {
                                                                case 0:
                                                                    lc.y.l(m0Var7, new l4.e0(rVar.f142293f));
                                                                    break;
                                                                default:
                                                                    lc.y.l(m0Var7, new l4.o0(true, rVar.f142293f));
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ5);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ5 == p3.m.a.f135155b) {
                                                        objQ5 = new e23.a() { // from class: b21.g7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i38) {
                                                                    case 0:
                                                                        lc.y.l(m0Var7, new l4.e0(rVar.f142293f));
                                                                        break;
                                                                    default:
                                                                        lc.y.l(m0Var7, new l4.o0(true, rVar.f142293f));
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ5);
                                                    }
                                                }
                                                e23.a aVar11 = (e23.a) objQ5;
                                                boolean zR4 = mVar2.r(rVar);
                                                Object objQ6 = mVar2.q();
                                                if (zR4) {
                                                    objQ6 = new e23.a() { // from class: b21.h7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            Object value3;
                                                            Object value4;
                                                            switch (i38) {
                                                                case 0:
                                                                    q21.r rVar2 = rVar;
                                                                    l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                    r53.p2 p2Var = rVar2.f142295h;
                                                                    do {
                                                                        value3 = p2Var.getValue();
                                                                    } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                    break;
                                                                case 1:
                                                                    q21.r rVar3 = rVar;
                                                                    l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                    r53.p2 p2Var2 = rVar3.f142295h;
                                                                    do {
                                                                        value4 = p2Var2.getValue();
                                                                    } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                    break;
                                                                default:
                                                                    q21.r rVar4 = rVar;
                                                                    rVar4.getClass();
                                                                    ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ6);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ6 == p3.m.a.f135155b) {
                                                        objQ6 = new e23.a() { // from class: b21.h7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                Object value3;
                                                                Object value4;
                                                                switch (i38) {
                                                                    case 0:
                                                                        q21.r rVar2 = rVar;
                                                                        l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                        r53.p2 p2Var = rVar2.f142295h;
                                                                        do {
                                                                            value3 = p2Var.getValue();
                                                                        } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                        break;
                                                                    case 1:
                                                                        q21.r rVar3 = rVar;
                                                                        l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                        r53.p2 p2Var2 = rVar3.f142295h;
                                                                        do {
                                                                            value4 = p2Var2.getValue();
                                                                        } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                        break;
                                                                    default:
                                                                        q21.r rVar4 = rVar;
                                                                        rVar4.getClass();
                                                                        ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ6);
                                                    }
                                                }
                                                e23.a aVar12 = (e23.a) objQ6;
                                                boolean zR5 = mVar2.r(rVar);
                                                Object objQ7 = mVar2.q();
                                                if (zR5) {
                                                    objQ7 = new e23.a() { // from class: b21.h7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            Object value3;
                                                            Object value4;
                                                            switch (i37) {
                                                                case 0:
                                                                    q21.r rVar2 = rVar;
                                                                    l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                    r53.p2 p2Var = rVar2.f142295h;
                                                                    do {
                                                                        value3 = p2Var.getValue();
                                                                    } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                    break;
                                                                case 1:
                                                                    q21.r rVar3 = rVar;
                                                                    l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                    r53.p2 p2Var2 = rVar3.f142295h;
                                                                    do {
                                                                        value4 = p2Var2.getValue();
                                                                    } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                    break;
                                                                default:
                                                                    q21.r rVar4 = rVar;
                                                                    rVar4.getClass();
                                                                    ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ7);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ7 == p3.m.a.f135155b) {
                                                        objQ7 = new e23.a() { // from class: b21.h7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                Object value3;
                                                                Object value4;
                                                                switch (i37) {
                                                                    case 0:
                                                                        q21.r rVar2 = rVar;
                                                                        l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                        r53.p2 p2Var = rVar2.f142295h;
                                                                        do {
                                                                            value3 = p2Var.getValue();
                                                                        } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                        break;
                                                                    case 1:
                                                                        q21.r rVar3 = rVar;
                                                                        l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                        r53.p2 p2Var2 = rVar3.f142295h;
                                                                        do {
                                                                            value4 = p2Var2.getValue();
                                                                        } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                        break;
                                                                    default:
                                                                        q21.r rVar4 = rVar;
                                                                        rVar4.getClass();
                                                                        ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ7);
                                                    }
                                                }
                                                e23.a aVar13 = (e23.a) objQ7;
                                                boolean zR6 = mVar2.r(m0Var7);
                                                Object objQ8 = mVar2.q();
                                                if (zR6) {
                                                    objQ8 = new aa2.m(m0Var7, 9);
                                                    mVar2.K(objQ8);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ8 == p3.m.a.f135155b) {
                                                        objQ8 = new aa2.m(m0Var7, 9);
                                                        mVar2.K(objQ8);
                                                    }
                                                }
                                                e23.a aVar14 = (e23.a) objQ8;
                                                boolean zR7 = mVar2.r(m0Var7) | mVar2.r(rVar);
                                                Object objQ9 = mVar2.q();
                                                if (zR7) {
                                                    objQ9 = new e23.a() { // from class: b21.g7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i37) {
                                                                case 0:
                                                                    lc.y.l(m0Var7, new l4.e0(rVar.f142293f));
                                                                    break;
                                                                default:
                                                                    lc.y.l(m0Var7, new l4.o0(true, rVar.f142293f));
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ9);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ9 == p3.m.a.f135155b) {
                                                        objQ9 = new e23.a() { // from class: b21.g7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i37) {
                                                                    case 0:
                                                                        lc.y.l(m0Var7, new l4.e0(rVar.f142293f));
                                                                        break;
                                                                    default:
                                                                        lc.y.l(m0Var7, new l4.o0(true, rVar.f142293f));
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ9);
                                                    }
                                                }
                                                e23.a aVar15 = (e23.a) objQ9;
                                                boolean zR8 = mVar2.r(m0Var7);
                                                Object objQ10 = mVar2.q();
                                                if (zR8) {
                                                    objQ10 = new aa2.m(m0Var7, 10);
                                                    mVar2.K(objQ10);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ10 == p3.m.a.f135155b) {
                                                        objQ10 = new aa2.m(m0Var7, 10);
                                                        mVar2.K(objQ10);
                                                    }
                                                }
                                                e23.a aVar16 = (e23.a) objQ10;
                                                boolean zR9 = mVar2.r(rVar);
                                                Object objQ11 = mVar2.q();
                                                if (zR9) {
                                                    objQ11 = new a03.f(rVar, 24);
                                                    mVar2.K(objQ11);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ11 == p3.m.a.f135155b) {
                                                        objQ11 = new a03.f(rVar, 24);
                                                        mVar2.K(objQ11);
                                                    }
                                                }
                                                e23.l lVar3 = (e23.l) objQ11;
                                                boolean zR10 = mVar2.r(rVar);
                                                Object objQ12 = mVar2.q();
                                                if (zR10) {
                                                    final int i48 = 2;
                                                    objQ12 = new e23.a() { // from class: b21.h7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            Object value3;
                                                            Object value4;
                                                            switch (i48) {
                                                                case 0:
                                                                    q21.r rVar2 = rVar;
                                                                    l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                    r53.p2 p2Var = rVar2.f142295h;
                                                                    do {
                                                                        value3 = p2Var.getValue();
                                                                    } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                    break;
                                                                case 1:
                                                                    q21.r rVar3 = rVar;
                                                                    l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                    r53.p2 p2Var2 = rVar3.f142295h;
                                                                    do {
                                                                        value4 = p2Var2.getValue();
                                                                    } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                    break;
                                                                default:
                                                                    q21.r rVar4 = rVar;
                                                                    rVar4.getClass();
                                                                    ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ12);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ12 == p3.m.a.f135155b) {
                                                        final int i49 = 2;
                                                        objQ12 = new e23.a() { // from class: b21.h7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                Object value3;
                                                                Object value4;
                                                                switch (i49) {
                                                                    case 0:
                                                                        q21.r rVar2 = rVar;
                                                                        l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                        r53.p2 p2Var = rVar2.f142295h;
                                                                        do {
                                                                            value3 = p2Var.getValue();
                                                                        } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                        break;
                                                                    case 1:
                                                                        q21.r rVar3 = rVar;
                                                                        l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                        r53.p2 p2Var2 = rVar3.f142295h;
                                                                        do {
                                                                            value4 = p2Var2.getValue();
                                                                        } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                        break;
                                                                    default:
                                                                        q21.r rVar4 = rVar;
                                                                        rVar4.getClass();
                                                                        ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ12);
                                                    }
                                                }
                                                p21.l.a(qVar2, feVar, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, lVar3, (e23.a) objQ12, mVar2, (iIntValue2 >> 3) & 126);
                                                break;
                                            default:
                                                q21.r rVar2 = (q21.r) obj10;
                                                p3.m mVar3 = (p3.m) obj13;
                                                rVar2.getClass();
                                                ((q21.q) obj11).getClass();
                                                ((fe) obj12).getClass();
                                                p3.x1 x1Var4 = p3.n.f135158a;
                                                p3.p1 p1VarC2 = s9.c.c(rVar2.f142292e, mVar3);
                                                Boolean bool = (Boolean) p1VarC2.getF182175a();
                                                bool.booleanValue();
                                                boolean zB4 = mVar3.B(p1VarC2);
                                                lc.v vVar4 = vVar2;
                                                boolean zR11 = zB4 | mVar3.r(vVar4);
                                                lc.m0 m0Var8 = m0Var6;
                                                boolean zR12 = zR11 | mVar3.r(m0Var8) | mVar3.r(rVar2);
                                                x01.b bVar9 = bVar7;
                                                boolean zB5 = zR12 | mVar3.B(bVar9);
                                                Object objQ13 = mVar3.q();
                                                if (zB5) {
                                                    l7 l7Var5 = new l7(vVar4, m0Var8, rVar2, bVar9, p1VarC2, null);
                                                    mVar3.K(l7Var5);
                                                    objQ13 = l7Var5;
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ13 == p3.m.a.f135155b) {
                                                        l7 l7Var6 = new l7(vVar4, m0Var8, rVar2, bVar9, p1VarC2, null);
                                                        mVar3.K(l7Var6);
                                                        objQ13 = l7Var6;
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ13, bool, mVar3);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar), mVar, ((iB >> 3) & 14) | 384);
                                break;
                            case 1:
                                int iB2 = androidx.room.a0.b(num, lVar2, vVar2);
                                p3.x1 x1Var2 = p3.n.f135158a;
                                q8.a(vVar2, m0Var6, z3.f.c(-1971187843, new e23.s() { // from class: b21.y6
                                    /* JADX WARN: Code duplicated, block: B:15:0x00c9  */
                                    /* JADX WARN: Code duplicated, block: B:20:0x0105  */
                                    /* JADX WARN: Code duplicated, block: B:33:0x0144  */
                                    /* JADX WARN: Code duplicated, block: B:38:0x0170  */
                                    /* JADX WARN: Code duplicated, block: B:43:0x0190  */
                                    /* JADX WARN: Code duplicated, block: B:48:0x01ac  */
                                    /* JADX WARN: Code duplicated, block: B:53:0x01c8  */
                                    /* JADX WARN: Code duplicated, block: B:58:0x01e3  */
                                    /* JADX WARN: Code duplicated, block: B:63:0x0206  */
                                    /* JADX WARN: Code duplicated, block: B:68:0x0222  */
                                    /* JADX WARN: Code duplicated, block: B:73:0x0240  */
                                    /* JADX WARN: Code duplicated, block: B:78:0x025d  */
                                    /* JADX WARN: Code duplicated, block: B:8:0x0062  */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // e23.s
                                    public final Object invoke(Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
                                        int i36 = i34;
                                        p3.m.a aVar9 = p3.m.f135153a;
                                        switch (i36) {
                                            case 0:
                                                final q21.r rVar = (q21.r) obj10;
                                                q21.q qVar2 = (q21.q) obj11;
                                                fe feVar = (fe) obj12;
                                                p3.m mVar2 = (p3.m) obj13;
                                                int iIntValue2 = ((Integer) obj14).intValue();
                                                rVar.getClass();
                                                qVar2.getClass();
                                                feVar.getClass();
                                                p3.x1 x1Var3 = p3.n.f135158a;
                                                lc.v vVar3 = vVar2;
                                                androidx.lifecycle.j1 j1VarA2 = vVar3.a();
                                                p3.p1 p1VarC = s9.c.c(j1VarA2.d(null, "editSetupUpdate"), mVar2);
                                                String str2 = (String) p1VarC.getF182175a();
                                                boolean zB = mVar2.B(p1VarC) | mVar2.r(rVar) | mVar2.r(j1VarA2);
                                                Object objQ = mVar2.q();
                                                if (zB) {
                                                    objQ = new m7(p1VarC, rVar, j1VarA2, null);
                                                    mVar2.K(objQ);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ == p3.m.a.f135155b) {
                                                        objQ = new m7(p1VarC, rVar, j1VarA2, null);
                                                        mVar2.K(objQ);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ, str2, mVar2);
                                                p3.p1 p1VarG = o53.f0.G(vVar3.a().b("regionAndLanguageResult"), mVar2);
                                                o13.p pVar3 = (o13.p) p1VarG.getF182175a();
                                                boolean zB2 = mVar2.B(p1VarG) | mVar2.r(rVar) | mVar2.r(vVar3);
                                                Object objQ2 = mVar2.q();
                                                if (zB2) {
                                                    objQ2 = new n7(p1VarG, rVar, vVar3, null);
                                                    mVar2.K(objQ2);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ2 == p3.m.a.f135155b) {
                                                        objQ2 = new n7(p1VarG, rVar, vVar3, null);
                                                        mVar2.K(objQ2);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ2, pVar3, mVar2);
                                                l4 l4Var = qVar2.f142286i;
                                                final int i37 = 1;
                                                final int i38 = 0;
                                                boolean z15 = (((iIntValue2 & 112) ^ 48) > 32 && mVar2.B(qVar2)) || (iIntValue2 & 48) == 32;
                                                final lc.m0 m0Var7 = m0Var6;
                                                boolean zR = z15 | mVar2.r(m0Var7) | mVar2.r(rVar);
                                                Object objQ3 = mVar2.q();
                                                if (zR) {
                                                    objQ3 = new o7(qVar2, m0Var7, rVar, null);
                                                    mVar2.K(objQ3);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ3 == p3.m.a.f135155b) {
                                                        objQ3 = new o7(qVar2, m0Var7, rVar, null);
                                                        mVar2.K(objQ3);
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ3, l4Var, mVar2);
                                                boolean zR2 = mVar2.r(m0Var7) | mVar2.r(rVar);
                                                x01.b bVar8 = bVar7;
                                                boolean zB3 = zR2 | mVar2.B(bVar8);
                                                Object objQ4 = mVar2.q();
                                                int i39 = 10;
                                                if (zB3) {
                                                    objQ4 = new ak0.m(m0Var7, i39, rVar, bVar8);
                                                    mVar2.K(objQ4);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ4 == p3.m.a.f135155b) {
                                                        objQ4 = new ak0.m(m0Var7, i39, rVar, bVar8);
                                                        mVar2.K(objQ4);
                                                    }
                                                }
                                                e23.a aVar10 = (e23.a) objQ4;
                                                boolean zR3 = mVar2.r(m0Var7) | mVar2.r(rVar);
                                                Object objQ5 = mVar2.q();
                                                if (zR3) {
                                                    objQ5 = new e23.a() { // from class: b21.g7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i38) {
                                                                case 0:
                                                                    lc.y.l(m0Var7, new l4.e0(rVar.f142293f));
                                                                    break;
                                                                default:
                                                                    lc.y.l(m0Var7, new l4.o0(true, rVar.f142293f));
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ5);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ5 == p3.m.a.f135155b) {
                                                        objQ5 = new e23.a() { // from class: b21.g7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i38) {
                                                                    case 0:
                                                                        lc.y.l(m0Var7, new l4.e0(rVar.f142293f));
                                                                        break;
                                                                    default:
                                                                        lc.y.l(m0Var7, new l4.o0(true, rVar.f142293f));
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ5);
                                                    }
                                                }
                                                e23.a aVar11 = (e23.a) objQ5;
                                                boolean zR4 = mVar2.r(rVar);
                                                Object objQ6 = mVar2.q();
                                                if (zR4) {
                                                    objQ6 = new e23.a() { // from class: b21.h7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            Object value3;
                                                            Object value4;
                                                            switch (i38) {
                                                                case 0:
                                                                    q21.r rVar2 = rVar;
                                                                    l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                    r53.p2 p2Var = rVar2.f142295h;
                                                                    do {
                                                                        value3 = p2Var.getValue();
                                                                    } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                    break;
                                                                case 1:
                                                                    q21.r rVar3 = rVar;
                                                                    l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                    r53.p2 p2Var2 = rVar3.f142295h;
                                                                    do {
                                                                        value4 = p2Var2.getValue();
                                                                    } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                    break;
                                                                default:
                                                                    q21.r rVar4 = rVar;
                                                                    rVar4.getClass();
                                                                    ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ6);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ6 == p3.m.a.f135155b) {
                                                        objQ6 = new e23.a() { // from class: b21.h7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                Object value3;
                                                                Object value4;
                                                                switch (i38) {
                                                                    case 0:
                                                                        q21.r rVar2 = rVar;
                                                                        l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                        r53.p2 p2Var = rVar2.f142295h;
                                                                        do {
                                                                            value3 = p2Var.getValue();
                                                                        } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                        break;
                                                                    case 1:
                                                                        q21.r rVar3 = rVar;
                                                                        l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                        r53.p2 p2Var2 = rVar3.f142295h;
                                                                        do {
                                                                            value4 = p2Var2.getValue();
                                                                        } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                        break;
                                                                    default:
                                                                        q21.r rVar4 = rVar;
                                                                        rVar4.getClass();
                                                                        ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ6);
                                                    }
                                                }
                                                e23.a aVar12 = (e23.a) objQ6;
                                                boolean zR5 = mVar2.r(rVar);
                                                Object objQ7 = mVar2.q();
                                                if (zR5) {
                                                    objQ7 = new e23.a() { // from class: b21.h7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            Object value3;
                                                            Object value4;
                                                            switch (i37) {
                                                                case 0:
                                                                    q21.r rVar2 = rVar;
                                                                    l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                    r53.p2 p2Var = rVar2.f142295h;
                                                                    do {
                                                                        value3 = p2Var.getValue();
                                                                    } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                    break;
                                                                case 1:
                                                                    q21.r rVar3 = rVar;
                                                                    l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                    r53.p2 p2Var2 = rVar3.f142295h;
                                                                    do {
                                                                        value4 = p2Var2.getValue();
                                                                    } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                    break;
                                                                default:
                                                                    q21.r rVar4 = rVar;
                                                                    rVar4.getClass();
                                                                    ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ7);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ7 == p3.m.a.f135155b) {
                                                        objQ7 = new e23.a() { // from class: b21.h7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                Object value3;
                                                                Object value4;
                                                                switch (i37) {
                                                                    case 0:
                                                                        q21.r rVar2 = rVar;
                                                                        l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                        r53.p2 p2Var = rVar2.f142295h;
                                                                        do {
                                                                            value3 = p2Var.getValue();
                                                                        } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                        break;
                                                                    case 1:
                                                                        q21.r rVar3 = rVar;
                                                                        l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                        r53.p2 p2Var2 = rVar3.f142295h;
                                                                        do {
                                                                            value4 = p2Var2.getValue();
                                                                        } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                        break;
                                                                    default:
                                                                        q21.r rVar4 = rVar;
                                                                        rVar4.getClass();
                                                                        ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ7);
                                                    }
                                                }
                                                e23.a aVar13 = (e23.a) objQ7;
                                                boolean zR6 = mVar2.r(m0Var7);
                                                Object objQ8 = mVar2.q();
                                                if (zR6) {
                                                    objQ8 = new aa2.m(m0Var7, 9);
                                                    mVar2.K(objQ8);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ8 == p3.m.a.f135155b) {
                                                        objQ8 = new aa2.m(m0Var7, 9);
                                                        mVar2.K(objQ8);
                                                    }
                                                }
                                                e23.a aVar14 = (e23.a) objQ8;
                                                boolean zR7 = mVar2.r(m0Var7) | mVar2.r(rVar);
                                                Object objQ9 = mVar2.q();
                                                if (zR7) {
                                                    objQ9 = new e23.a() { // from class: b21.g7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            switch (i37) {
                                                                case 0:
                                                                    lc.y.l(m0Var7, new l4.e0(rVar.f142293f));
                                                                    break;
                                                                default:
                                                                    lc.y.l(m0Var7, new l4.o0(true, rVar.f142293f));
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ9);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ9 == p3.m.a.f135155b) {
                                                        objQ9 = new e23.a() { // from class: b21.g7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                switch (i37) {
                                                                    case 0:
                                                                        lc.y.l(m0Var7, new l4.e0(rVar.f142293f));
                                                                        break;
                                                                    default:
                                                                        lc.y.l(m0Var7, new l4.o0(true, rVar.f142293f));
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ9);
                                                    }
                                                }
                                                e23.a aVar15 = (e23.a) objQ9;
                                                boolean zR8 = mVar2.r(m0Var7);
                                                Object objQ10 = mVar2.q();
                                                if (zR8) {
                                                    objQ10 = new aa2.m(m0Var7, 10);
                                                    mVar2.K(objQ10);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ10 == p3.m.a.f135155b) {
                                                        objQ10 = new aa2.m(m0Var7, 10);
                                                        mVar2.K(objQ10);
                                                    }
                                                }
                                                e23.a aVar16 = (e23.a) objQ10;
                                                boolean zR9 = mVar2.r(rVar);
                                                Object objQ11 = mVar2.q();
                                                if (zR9) {
                                                    objQ11 = new a03.f(rVar, 24);
                                                    mVar2.K(objQ11);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ11 == p3.m.a.f135155b) {
                                                        objQ11 = new a03.f(rVar, 24);
                                                        mVar2.K(objQ11);
                                                    }
                                                }
                                                e23.l lVar3 = (e23.l) objQ11;
                                                boolean zR10 = mVar2.r(rVar);
                                                Object objQ12 = mVar2.q();
                                                if (zR10) {
                                                    final int i49 = 2;
                                                    objQ12 = new e23.a() { // from class: b21.h7
                                                        @Override // e23.a
                                                        public final Object invoke() {
                                                            Object value3;
                                                            Object value4;
                                                            switch (i49) {
                                                                case 0:
                                                                    q21.r rVar2 = rVar;
                                                                    l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                    r53.p2 p2Var = rVar2.f142295h;
                                                                    do {
                                                                        value3 = p2Var.getValue();
                                                                    } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                    break;
                                                                case 1:
                                                                    q21.r rVar3 = rVar;
                                                                    l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                    r53.p2 p2Var2 = rVar3.f142295h;
                                                                    do {
                                                                        value4 = p2Var2.getValue();
                                                                    } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                    break;
                                                                default:
                                                                    q21.r rVar4 = rVar;
                                                                    rVar4.getClass();
                                                                    ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    mVar2.K(objQ12);
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ12 == p3.m.a.f135155b) {
                                                        final int i410 = 2;
                                                        objQ12 = new e23.a() { // from class: b21.h7
                                                            @Override // e23.a
                                                            public final Object invoke() {
                                                                Object value3;
                                                                Object value4;
                                                                switch (i410) {
                                                                    case 0:
                                                                        q21.r rVar2 = rVar;
                                                                        l4 l4Var2 = rVar2.f142290c.e() ? l4.w.INSTANCE : l4.v.INSTANCE;
                                                                        r53.p2 p2Var = rVar2.f142295h;
                                                                        do {
                                                                            value3 = p2Var.getValue();
                                                                        } while (!p2Var.b(value3, q21.q.a((q21.q) value3, false, false, null, null, false, null, false, false, l4Var2, 255)));
                                                                        break;
                                                                    case 1:
                                                                        q21.r rVar3 = rVar;
                                                                        l4 l4Var3 = rVar3.f142290c.e() ? l4.x.INSTANCE : l4.t.INSTANCE;
                                                                        r53.p2 p2Var2 = rVar3.f142295h;
                                                                        do {
                                                                            value4 = p2Var2.getValue();
                                                                        } while (!p2Var2.b(value4, q21.q.a((q21.q) value4, false, false, null, null, false, null, false, false, l4Var3, 255)));
                                                                        break;
                                                                    default:
                                                                        q21.r rVar4 = rVar;
                                                                        rVar4.getClass();
                                                                        ge1.b.T(androidx.lifecycle.v1.a(rVar4), null, null, new q21.s(rVar4, null), 3);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        mVar2.K(objQ12);
                                                    }
                                                }
                                                p21.l.a(qVar2, feVar, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, lVar3, (e23.a) objQ12, mVar2, (iIntValue2 >> 3) & 126);
                                                break;
                                            default:
                                                q21.r rVar2 = (q21.r) obj10;
                                                p3.m mVar3 = (p3.m) obj13;
                                                rVar2.getClass();
                                                ((q21.q) obj11).getClass();
                                                ((fe) obj12).getClass();
                                                p3.x1 x1Var4 = p3.n.f135158a;
                                                p3.p1 p1VarC2 = s9.c.c(rVar2.f142292e, mVar3);
                                                Boolean bool = (Boolean) p1VarC2.getF182175a();
                                                bool.booleanValue();
                                                boolean zB4 = mVar3.B(p1VarC2);
                                                lc.v vVar4 = vVar2;
                                                boolean zR11 = zB4 | mVar3.r(vVar4);
                                                lc.m0 m0Var8 = m0Var6;
                                                boolean zR12 = zR11 | mVar3.r(m0Var8) | mVar3.r(rVar2);
                                                x01.b bVar9 = bVar7;
                                                boolean zB5 = zR12 | mVar3.B(bVar9);
                                                Object objQ13 = mVar3.q();
                                                if (zB5) {
                                                    l7 l7Var6 = new l7(vVar4, m0Var8, rVar2, bVar9, p1VarC2, null);
                                                    mVar3.K(l7Var6);
                                                    objQ13 = l7Var6;
                                                } else {
                                                    aVar9.getClass();
                                                    if (objQ13 == p3.m.a.f135155b) {
                                                        l7 l7Var7 = new l7(vVar4, m0Var8, rVar2, bVar9, p1VarC2, null);
                                                        mVar3.K(l7Var7);
                                                        objQ13 = l7Var7;
                                                    }
                                                }
                                                p3.l0.e((e23.p) objQ13, bool, mVar3);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar), mVar, ((iB2 >> 3) & 14) | 384);
                                break;
                            default:
                                r1.q2.t(num, lVar2, vVar2);
                                p3.x1 x1Var3 = p3.n.f135158a;
                                boolean zR = mVar.r(m0Var6) | mVar.B(bVar7);
                                Object objQ = mVar.q();
                                if (zR) {
                                    objQ = new ao1.i(20, m0Var6, bVar7);
                                    mVar.K(objQ);
                                } else {
                                    p3.m.f135153a.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new ao1.i(20, m0Var6, bVar7);
                                        mVar.K(objQ);
                                    }
                                }
                                d21.i.a(null, (e23.a) objQ, mVar, 0);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                n.a(k0Var2, t0Var2.b(l4.v.class), k0Var3, j0Var2, null, null, null, null, new z3.e(-1855339369, true, new v6(m0Var5, eVar5, bVar6, i24)));
                p pVar3 = new p(p005kotlin.jvm.internal.s0.b(z.class), new o8(aVar8));
                k23.r.a aVar9 = k23.r.f102461c;
                k23.p pVarC3 = p005kotlin.jvm.internal.s0.c(Integer.TYPE);
                aVar9.getClass();
                n.a(k0Var2, t0Var2.b(l4.u.class), p13.u0.e(pVar3, new p(p005kotlin.jvm.internal.s0.d(List.class, k23.r.a.a(pVarC3)), new p8(aVar8))), j0Var2, null, null, null, null, new z3.e(1208335384, true, new v6(m0Var5, eVar5, bVar6, i26)));
                n.a(k0Var2, t0Var2.b(l4.t.class), k0Var3, j0Var2, null, null, null, null, new z3.e(-22957159, true, new v6(m0Var5, bVar6, eVar5, i25)));
                n.a(k0Var2, t0Var2.b(l4.s.class), k0Var3, j0Var2, null, null, null, null, new z3.e(-1254249702, true, new b21.e(m0Var5, eVar5, i19)));
                n.a(k0Var2, t0Var2.b(l4.x.class), k0Var3, j0Var2, f8.f14664a, g8.f14693a, h8.f14721a, i8.f14750a, new z3.e(13847475, true, new v6(m0Var5, bVar6, eVar5, i19)));
                n.a(k0Var2, t0Var2.b(l4.w.class), k0Var3, j0Var2, j8.f14776a, k8.f14806a, l8.f15020a, m8.f15048a, new z3.e(1755444394, true, new v6(m0Var5, bVar6, eVar5, 4)));
                return Unit.INSTANCE;
            case 16:
                u21.u0 u0Var = (u21.u0) obj4;
                a0 a0Var = (a0) obj3;
                m0 m0Var6 = (m0) obj2;
                s21.z zVar = (s21.z) obj;
                zVar.getClass();
                boolean z15 = zVar.ordinal() < s21.z.Recommendation.ordinal();
                p2 p2Var = u0Var.f168164o;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, a0.a((a0) value, null, null, z15, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, 0, -9, 3)));
                boolean zG = p005kotlin.jvm.internal.s.g(a0Var.f156037b, Boolean.TRUE);
                l4 l4Var = zVar.f156223a;
                if (zG) {
                    m0Var6.h(new androidx.room.w0(24), l4Var);
                } else {
                    y.q(m0Var6, l4Var);
                }
                return Unit.INSTANCE;
            case 17:
                m0 m0Var7 = (m0) obj3;
                e23.a aVar10 = (e23.a) obj2;
                s21.z zVar2 = (s21.z) obj;
                zVar2.getClass();
                p2 p2Var2 = ((u21.u0) obj4).f168160k;
                i53.c cVar2 = (i53.c) p2Var2.getValue();
                s21.z zVar3 = (s21.z) h0.e0(cVar2.indexOf(zVar2) + 1, cVar2);
                s21.z zVar4 = s21.z.StorageAndProcessing;
                if (zVar2 == zVar4) {
                    p2Var2.setValue(i53.a.j(h0.y0((Iterable) p2Var2.getValue(), zVar4)));
                }
                if (zVar3 != null) {
                    m0Var7.h(new a03.f(zVar2, 26), zVar3.f156223a);
                } else {
                    aVar10.invoke();
                }
                return Unit.INSTANCE;
            case 18:
                tz.a aVar11 = (tz.a) obj3;
                r30.a aVar12 = (r30.a) obj;
                ((l) obj4).invoke(aVar12);
                aVar11.f167285b.s(aVar12);
                qz.a.b(aVar11, ((e50.f) obj2).f63003a, null, 6);
                return Unit.INSTANCE;
            case 19:
                l lVar2 = (l) obj3;
                l0 l0Var = (l0) obj;
                b82.t0 t0Var3 = b82.t0.f16792a;
                l0Var.getClass();
                ((p1) obj2).setValue(l0Var);
                s5.c cVar3 = l0Var.f188878a;
                if (!p005kotlin.jvm.internal.s.g(cVar3.f157138b, (String) obj4)) {
                    lVar2.invoke(cVar3.f157138b);
                }
                return Unit.INSTANCE;
            case 20:
                bv2.a aVar13 = (bv2.a) obj4;
                dx2.c cVar4 = (dx2.c) obj3;
                Map<String, ? extends Object> map = (Map) obj2;
                int i30 = bv2.a.f21461b;
                aVar13.j(cVar4, map, null);
                AppCompatImageView appCompatImageView = aVar13.f21462a;
                zw2.g.c cVarI4 = cVar4.I4(map);
                com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
                cx2.g.f(appCompatImageView, cVarI4, com.garmin.realtimesettings.app.initialization.b.f52593e, 8);
                return Unit.INSTANCE;
            case 21:
                int i34 = bv2.m.f21539j;
                ((bv2.m) obj4).j((dx2.c) obj3, (Map) obj2, null);
                return Unit.INSTANCE;
            case 22:
                c31.a aVar14 = ((com.garmin.android.apps.connectmobile.onboarding.data.local.b) obj4).f39670c;
                d31.c cVar5 = (d31.c) obj3;
                d31.d dVar3 = (d31.d) obj2;
                ud.a aVar15 = (ud.a) obj;
                com.garmin.android.apps.connectmobile.onboarding.data.local.b.C0713b c0713b = com.garmin.android.apps.connectmobile.onboarding.data.local.b.f39667d;
                aVar15.getClass();
                ud.c cVarM0 = aVar15.M0("UPDATE prompt_onboarding_items SET status = ? WHERE type = ?");
                try {
                    aVar14.getClass();
                    cVarM0.q3(1, c31.a.e(cVar5));
                    aVar14.getClass();
                    cVarM0.q3(2, c31.a.f(dVar3));
                    cVarM0.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM0.close();
                }
            case 23:
                c31.a aVar16 = ((com.garmin.android.apps.connectmobile.onboarding.data.local.b) obj4).f39670c;
                u uVar = (u) obj3;
                d31.d dVar4 = (d31.d) obj2;
                ud.a aVar17 = (ud.a) obj;
                com.garmin.android.apps.connectmobile.onboarding.data.local.b.C0713b c0713b2 = com.garmin.android.apps.connectmobile.onboarding.data.local.b.f39667d;
                aVar17.getClass();
                ud.c cVarM1 = aVar17.M0("UPDATE prompt_onboarding_items SET reminderDate = ? WHERE type = ?");
                try {
                    aVar16.getClass();
                    String string = uVar != null ? uVar.toString() : null;
                    if (string == null) {
                        cVarM1.u(1);
                    } else {
                        cVarM1.q3(1, string);
                    }
                    aVar16.getClass();
                    cVarM1.q3(2, c31.a.f(dVar4));
                    cVarM1.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM1.close();
                }
            case 24:
                final a1 a1Var = (a1) obj4;
                com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar8 = (com.garmin.android.apps.connectmobile.workouts.presentation.details.e) obj3;
                c62.t tVar = (c62.t) obj2;
                f0 f0Var2 = (f0) obj;
                f0Var2.getClass();
                f0.b(f0Var2, null, new z3.e(-1865677276, true, new a42.a(a1Var, 12, tVar, eVar8)), 3);
                List<e23.a<r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.details.e, c62.t>>> list5 = a1Var.f24657b;
                ArrayList arrayList4 = new ArrayList(p13.y.r(list5, 10));
                Iterator<T> it5 = list5.iterator();
                while (it5.hasNext()) {
                    arrayList4.add((r52.b) ((e23.a) it5.next()).invoke());
                }
                f0Var2.a(arrayList4.size(), null, new a1.d(a1.c.f24667a, arrayList4), new z3.e(802480018, true, new a1.e(arrayList4, tVar, eVar8)));
                List listC = w.c(eVar8.p(), new e23.p() { // from class: c62.z0
                    @Override // e23.p
                    public final Object invoke(Object obj6, Object obj7) {
                        List list6 = (List) obj6;
                        l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar18 = (l52.i.a) obj7;
                        switch (i24) {
                            case 0:
                                list6.getClass();
                                aVar18.getClass();
                                list6.add(a1Var.f24659d.invoke(aVar18));
                                break;
                            case 1:
                                list6.getClass();
                                aVar18.getClass();
                                list6.add(a1Var.f24660e.invoke(aVar18));
                                break;
                            default:
                                list6.getClass();
                                aVar18.getClass();
                                list6.add(a1Var.f24661f.invoke(aVar18));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, new e23.p() { // from class: c62.z0
                    @Override // e23.p
                    public final Object invoke(Object obj6, Object obj7) {
                        List list6 = (List) obj6;
                        l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar18 = (l52.i.a) obj7;
                        switch (i26) {
                            case 0:
                                list6.getClass();
                                aVar18.getClass();
                                list6.add(a1Var.f24659d.invoke(aVar18));
                                break;
                            case 1:
                                list6.getClass();
                                aVar18.getClass();
                                list6.add(a1Var.f24660e.invoke(aVar18));
                                break;
                            default:
                                list6.getClass();
                                aVar18.getClass();
                                list6.add(a1Var.f24661f.invoke(aVar18));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, new e23.p() { // from class: c62.z0
                    @Override // e23.p
                    public final Object invoke(Object obj6, Object obj7) {
                        List list6 = (List) obj6;
                        l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar18 = (l52.i.a) obj7;
                        switch (i25) {
                            case 0:
                                list6.getClass();
                                aVar18.getClass();
                                list6.add(a1Var.f24659d.invoke(aVar18));
                                break;
                            case 1:
                                list6.getClass();
                                aVar18.getClass();
                                list6.add(a1Var.f24660e.invoke(aVar18));
                                break;
                            default:
                                list6.getClass();
                                aVar18.getClass();
                                list6.add(a1Var.f24661f.invoke(aVar18));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                f0Var2.a(listC.size(), null, new a1.g(a1.f.f24673a, listC), new z3.e(802480018, true, new a1.h(listC, tVar, eVar8)));
                List<e23.a<r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.details.e, c62.t>>> list6 = a1Var.f24658c;
                ArrayList arrayList5 = new ArrayList(p13.y.r(list6, 10));
                Iterator<T> it6 = list6.iterator();
                while (it6.hasNext()) {
                    arrayList5.add((r52.b) ((e23.a) it6.next()).invoke());
                }
                f0Var2.a(arrayList5.size(), null, new a1.a(a1.i.f24679a, arrayList5), new z3.e(802480018, true, new a1.b(arrayList5, tVar, eVar8)));
                return Unit.INSTANCE;
            case 25:
                m0 m0Var8 = (m0) obj4;
                e23.a aVar18 = (e23.a) obj3;
                e23.a aVar19 = (e23.a) obj2;
                k0 k0Var4 = (k0) obj;
                k0Var4.getClass();
                ca0.k kVar2 = new ca0.k(i15);
                ca0.k kVar3 = new ca0.k(i17);
                ca0.k kVar4 = new ca0.k(i18);
                ca0.k kVar5 = new ca0.k(i16);
                z3.e eVar9 = new z3.e(1049784801, true, new ca0.a(m0Var8, aVar18, i26));
                p13.k0 k0Var5 = p13.k0.f134949a;
                k0Var5.getClass();
                j0 j0Var3 = j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                n.a(k0Var4, t0Var4.b(i0.c.class), k0Var5, j0Var3, kVar2, kVar3, kVar4, kVar5, eVar9);
                n.a(k0Var4, t0Var4.b(i0.j.class), k0Var5, j0Var3, null, null, null, null, new z3.e(197251338, true, new ca0.q(m0Var8, aVar19, aVar18, i25)));
                n.a(k0Var4, t0Var4.b(i0.k.class), k0Var5, j0Var3, null, null, null, null, new z3.e(1618041641, true, new ca0.r(aVar19, i24)));
                n.a(k0Var4, t0Var4.b(i0.d.class), k0Var5, j0Var3, null, null, null, null, new z3.e(-1256135352, true, new ca0.q(m0Var8, aVar19, aVar18, i19)));
                n.a(k0Var4, t0Var4.b(i0.e.class), k0Var5, j0Var3, null, null, null, null, new z3.e(164654951, true, new ca0.q(m0Var8, aVar19, aVar18, 4)));
                n.a(k0Var4, t0Var4.b(i0.l.class), k0Var5, j0Var3, null, null, null, null, new z3.e(1585445254, true, new ca0.q(m0Var8, aVar19, aVar18, 5)));
                n.a(k0Var4, t0Var4.b(i0.u.class), k0Var5, j0Var3, null, null, null, null, new z3.e(-1288731739, true, new ca0.q(m0Var8, aVar19, aVar18, i24)));
                n.a(k0Var4, t0Var4.b(i0.v.class), k0Var5, j0Var3, null, null, null, null, new z3.e(132058564, true, new ca0.q(m0Var8, aVar19, aVar18, i26)));
                return Unit.INSTANCE;
            case 26:
                m0 m0Var9 = (m0) obj4;
                u1 u1Var = (u1) obj3;
                e23.a aVar20 = (e23.a) obj2;
                k0 k0Var6 = (k0) obj;
                k0Var6.getClass();
                ca0.k kVar6 = new ca0.k(17);
                ca0.k kVar7 = new ca0.k(18);
                ca0.k kVar8 = new ca0.k(19);
                ca0.k kVar9 = new ca0.k(20);
                z3.e eVar10 = new z3.e(-1419432033, true, new c1(m0Var9, u1Var, aVar20));
                p13.k0 k0Var7 = p13.k0.f134949a;
                k0Var7.getClass();
                j0 j0Var4 = j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                n.a(k0Var6, t0Var5.b(f1.c.class), k0Var7, j0Var4, kVar6, kVar7, kVar8, kVar9, eVar10);
                n.a(k0Var6, t0Var5.b(f1.d.class), k0Var7, j0Var4, null, null, null, null, new z3.e(1041184584, true, new c1(aVar20, m0Var9, u1Var)));
                n.a(k0Var6, t0Var5.b(f1.a.class), k0Var7, j0Var4, null, null, null, null, new z3.e(-338600729, true, new ca0.a(m0Var9, aVar20, i25)));
                return Unit.INSTANCE;
            case 27:
                m0 m0Var10 = (m0) obj4;
                e23.p pVar4 = (e23.p) obj3;
                e23.a aVar21 = (e23.a) obj2;
                n90.b bVar7 = (n90.b) obj;
                bVar7.getClass();
                if (x1.d.f26533b[bVar7.ordinal()] == 1) {
                    y.l(m0Var10, z1.n.INSTANCE);
                } else {
                    pVar4.invoke(bVar7, aVar21.invoke());
                }
                return Unit.INSTANCE;
            case 28:
                i iVar2 = (i) obj4;
                r90.a aVar22 = (r90.a) obj3;
                m0 m0Var11 = (m0) obj2;
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                aVar22.getClass();
                p2 p2Var3 = iVar2.f203250e;
                List<r90.a> list7 = ((i.b) p2Var3.getValue()).f203255b;
                r90.a aVar23 = (r90.a) h0.e0(list7.indexOf(aVar22) + 1, list7);
                if (zBooleanValue4) {
                    i2.f36769a.getClass();
                    i2.a.b(a2.DEVICE_SETUP, "PermissionsAccessViewModel", iVar2 + " Permission granted: " + aVar22);
                    do {
                        value2 = p2Var3.getValue();
                        ArrayList arrayList6 = new ArrayList(list7);
                        arrayList6.remove(aVar22);
                        Unit unit = Unit.INSTANCE;
                        bVarB = i.b.b((i.b) value2, arrayList6);
                        iVar2.f203246a.f(bVarB, "permissions_state");
                    } while (!p2Var3.b(value2, bVarB));
                }
                a2 a2Var = a2.DEVICE_SETUP;
                String str2 = iVar2 + " Next permission: " + aVar23 + ", remaining permissions: " + p2Var3.getValue();
                i2.f36769a.getClass();
                i2.a.b(a2Var, "PermissionsAccessViewModel", str2);
                u2 u2VarX4 = aVar23 != null ? i.x4(aVar23) : null;
                if (u2VarX4 == null) {
                    m0Var11.h(new d2(8), u2.d.INSTANCE);
                } else if (zBooleanValue4) {
                    m0Var11.h(zf.b.G(m0Var11), u2VarX4);
                } else {
                    y.l(m0Var11, u2VarX4);
                }
                return Unit.INSTANCE;
            default:
                ArrayList arrayList7 = (ArrayList) obj4;
                fd1.e eVar11 = (fd1.e) obj2;
                q4.f fVar3 = (q4.f) obj;
                fVar3.getClass();
                return m92.w.c(fVar3, arrayList7, null, ((ad1.b) obj3).f2766c, Float.valueOf(0.0f), (eVar11 == null || (cVar = eVar11.f70493d) == null) ? null : Float.valueOf(cVar.size() - 1), eVar11 != null ? Float.valueOf(eVar11.f70494e) : null, eVar11 != null ? Float.valueOf(eVar11.f70495f) : null, 26);
        }
    }

    public /* synthetic */ a(Object obj, int i14, Object obj2, Object obj3) {
        this.f941a = i14;
        this.f942b = obj;
        this.f943c = obj2;
        this.f944d = obj3;
    }

    public /* synthetic */ a(i iVar, r90.a aVar, k0 k0Var, m0 m0Var) {
        this.f941a = 28;
        this.f942b = iVar;
        this.f943c = aVar;
        this.f944d = m0Var;
    }
}
