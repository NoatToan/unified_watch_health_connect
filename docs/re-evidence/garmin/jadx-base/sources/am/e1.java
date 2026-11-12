package am;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.Fragment;
import c22.c3;
import c22.l3;
import ca0.k2;
import ca0.u2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import i3.i5;
import i3.z3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3922f;

    public /* synthetic */ e1(e23.l lVar, c.q qVar, Context context, String str, String str2) {
        this.f3917a = 9;
        this.f3918b = lVar;
        this.f3919c = qVar;
        this.f3921e = context;
        this.f3920d = str;
        this.f3922f = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        gz1.a aVarH6;
        gz1.a aVarA;
        double d14;
        ArrayList arrayList;
        List<z42.e> list;
        List<z42.j> list2;
        int i14 = this.f3917a;
        int i15 = 13;
        int i16 = 26;
        int i17 = 0;
        int i18 = 2;
        int i19 = 3;
        ArrayList arrayList2 = null;
        int i24 = 1;
        Object obj2 = this.f3922f;
        Object obj3 = this.f3921e;
        Object obj4 = this.f3920d;
        Object obj5 = this.f3919c;
        Object obj6 = this.f3918b;
        switch (i14) {
            case 0:
                List list3 = (List) obj6;
                e2.f0 f0Var = (e2.f0) obj;
                f0Var.getClass();
                e2.f0.f(f0Var, list3.size(), new a81.m(i16), new z3.e(1128566722, true, new a42.c0(list3, (y0) obj5, (String) obj4, (gr.a) obj3, (gr.b) obj2, 1)), 4);
                return Unit.INSTANCE;
            case 1:
                bv2.k kVar = (bv2.k) obj6;
                Map<String, ? extends Object> map = (Map) obj5;
                Fragment fragment = (Fragment) obj2;
                cx2.h hVar = kVar.f21509b;
                Objects.toString(map.get(gw2.i.TITLE.f79975a));
                hVar.getClass();
                kVar.j((dx2.c) obj4, map, null);
                Drawable drawable = a7.b.getDrawable(kVar.getContext(), R.drawable.rts_icon_settings_device_default);
                zw2.g gVarK = ((zw2.d) obj3).k();
                if (gVarK != null) {
                    zw2.g.b bVar = (zw2.g.b) gVarK;
                    kVar.k(fragment, bVar.f207288a, bVar.f207291d, bVar.f207290c, bVar.f207292e, new ak0.m(kVar, 15, bVar, drawable), bVar.f207293f);
                } else if (gVarK instanceof zw2.g.a) {
                    com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
                    u53.d dVar = com.garmin.realtimesettings.app.initialization.b.f52593e;
                    x53.c cVar = o53.s0.f129406a;
                    ge1.b.T(dVar, u53.o.f168762a.H(), null, new bv2.k.a(gVarK, drawable, kVar, fragment, null), 2);
                } else {
                    kVar.f21512e.setText(kVar.getContext().getString(R.string.setting_device));
                    kVar.f21513f.setImageDrawable(drawable);
                    kVar.f21510c.setText(kVar.getContext().getString(R.string.device_not_connected));
                }
                return Unit.INSTANCE;
            case 2:
                c.a aVar = (c.a) obj6;
                aVar.f22300a = ((f.e) obj5).d((String) obj4, (g.a) obj3, new a61.i((p3.p1) obj2, 8));
                return new c.b(aVar);
            case 3:
                lc.y yVar = (lc.y) obj5;
                e23.a aVar2 = (e23.a) obj4;
                lc.k0 k0Var = (lc.k0) obj;
                k0Var.getClass();
                z3.e eVar = new z3.e(-1832075754, true, new a42.c0(obj6, (Object) new c42.o(yVar, i17), (Object) new c42.p(yVar, i17), aVar2, (Object) yVar, 2));
                p13.k0 k0Var2 = p13.k0.f134949a;
                k0Var2.getClass();
                c42.q qVar = c42.q.f24427a;
                c42.r rVar = c42.r.f24428a;
                c42.s sVar = c42.s.f24429a;
                c42.t tVar = c42.t.f24430a;
                p13.j0 j0Var = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                nc.n.a(k0Var, t0Var.b(c42.n.b.class), k0Var2, j0Var, qVar, rVar, sVar, tVar, eVar);
                nc.n.a(k0Var, t0Var.b(c42.n.d.class), k0Var2, j0Var, c42.y.f24435a, c42.z.f24436a, c42.a0.f24350a, c42.b0.f24354a, new z3.e(-1776010871, true, new aa2.r(new c42.p(yVar, i24), 4, aVar2, yVar)));
                nc.n.a(k0Var, t0Var.b(c42.n.a.class), k0Var2, j0Var, c42.u.f24431a, c42.v.f24432a, c42.w.f24433a, c42.x.f24434a, new z3.e(2028006388, true, new a42.d0(obj3, (Object) aVar2, obj2, (Object) yVar, 3)));
                return Unit.INSTANCE;
            case 4:
                e23.l lVar = (e23.l) obj5;
                e23.p pVar = (e23.p) obj4;
                com.garmin.android.apps.connectmobile.courses.model.g gVar = (com.garmin.android.apps.connectmobile.courses.model.g) obj3;
                e23.l lVar2 = (e23.l) obj2;
                q40.b bVar2 = (q40.b) obj;
                bVar2.getClass();
                String str = bVar2.f142581h;
                ((c60.b) obj6).invoke();
                int i25 = c60.e.a.f24622a[bVar2.f142580g.ordinal()];
                if (i25 != 1) {
                    if (i25 != 2) {
                        com.garmin.android.apps.connectmobile.courses.model.g gVar2 = new com.garmin.android.apps.connectmobile.courses.model.g(gVar);
                        s20.b.f156004a.getClass();
                        s20.b.a(gVar2, bVar2);
                        lVar2.invoke(gVar2);
                    } else if (pVar != null) {
                        pVar.invoke(str, bVar2.f142583j);
                    }
                } else if (lVar != null) {
                    lVar.invoke(str);
                }
                return Unit.INSTANCE;
            case 5:
                e23.l lVar3 = (e23.l) obj5;
                e23.p pVar2 = (e23.p) obj4;
                com.garmin.android.apps.connectmobile.courses.model.g gVar3 = (com.garmin.android.apps.connectmobile.courses.model.g) obj3;
                e23.l lVar4 = (e23.l) obj2;
                q40.b bVar3 = (q40.b) obj;
                bVar3.getClass();
                String str2 = bVar3.f142581h;
                ((c60.a) obj6).invoke();
                int i26 = c60.e.a.f24622a[bVar3.f142580g.ordinal()];
                if (i26 != 1) {
                    if (i26 != 2) {
                        com.garmin.android.apps.connectmobile.courses.model.g gVar4 = new com.garmin.android.apps.connectmobile.courses.model.g(gVar3);
                        s20.b.f156004a.getClass();
                        s20.b.a(gVar4, bVar3);
                        lVar4.invoke(gVar4);
                    } else if (pVar2 != null) {
                        pVar2.invoke(str2, bVar3.f142583j);
                    }
                } else if (lVar3 != null) {
                    lVar3.invoke(str2);
                }
                return Unit.INSTANCE;
            case 6:
                ca0.o0 o0Var = (ca0.o0) obj6;
                lc.m0 m0Var = (lc.m0) obj4;
                e23.l lVar5 = (e23.l) obj3;
                ca0.s1 s1Var = (ca0.s1) obj2;
                lc.k0 k0Var3 = (lc.k0) obj;
                k0Var3.getClass();
                ca0.n1.Companion.getClass();
                Map mapA = ca0.n1.a.a();
                z3.e eVar2 = new z3.e(-1879275502, true, new a42.c0((Object) o0Var, obj5, (Object) m0Var, lVar5, (o13.h) s1Var, 5));
                p13.j0 j0Var2 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                nc.n.a(k0Var3, t0Var2.b(ca0.n1.d.class), mapA, j0Var2, null, null, null, null, eVar2);
                nc.n.a(k0Var3, t0Var2.b(ca0.n1.e.class), ca0.n1.a.a(), j0Var2, null, null, null, null, new z3.e(-825179909, true, new ca0.k1(o0Var, m0Var, lVar5, s1Var)));
                return Unit.INSTANCE;
            case 7:
                lc.m0 m0Var2 = (lc.m0) obj6;
                ca0.u1 u1Var = (ca0.u1) obj5;
                e23.l lVar6 = (e23.l) obj4;
                e23.a aVar3 = (e23.a) obj2;
                lc.k0 k0Var4 = (lc.k0) obj;
                k0Var4.getClass();
                z3.e eVar3 = new z3.e(930884016, true, new a42.c0(7, (e23.a) obj3, lVar6, m0Var2, u1Var, aVar3));
                p13.k0 k0Var5 = p13.k0.f134949a;
                k0Var5.getClass();
                p13.j0 j0Var3 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                nc.n.a(k0Var4, t0Var3.b(k2.i.class), k0Var5, j0Var3, null, null, null, null, eVar3);
                nc.n.a(k0Var4, t0Var3.b(k2.g.class), k0Var5, j0Var3, null, null, null, null, new z3.e(-786942759, true, new ca0.e2(u1Var, m0Var2, lVar6, aVar3, 0)));
                nc.n.a(k0Var4, t0Var3.b(k2.h.class), k0Var5, j0Var3, null, null, null, null, new z3.e(-536841480, true, new ca0.e2(u1Var, lVar6, aVar3, m0Var2, 1)));
                nc.n.a(k0Var4, t0Var3.b(k2.f.class), k0Var5, j0Var3, null, null, null, null, new z3.e(-286740201, true, new ca0.e2(u1Var, m0Var2, lVar6, aVar3, 2)));
                nc.n.a(k0Var4, t0Var3.b(k2.c.class), k0Var5, j0Var3, null, null, null, null, new z3.e(-36638922, true, new ca0.e2(u1Var, m0Var2, lVar6, aVar3, 3)));
                nc.n.a(k0Var4, t0Var3.b(k2.e.class), k0Var5, j0Var3, null, null, null, null, new z3.e(213462357, true, new ca0.e2(u1Var, aVar3, m0Var2, lVar6)));
                nc.n.a(k0Var4, t0Var3.b(k2.d.class), k0Var5, j0Var3, null, null, null, null, new z3.e(463563636, true, new ca0.e2(u1Var, lVar6, aVar3, m0Var2, 5)));
                nc.n.a(k0Var4, t0Var3.b(k2.b.class), k0Var5, j0Var3, null, null, null, null, new z3.e(713664915, true, new ca0.e2(m0Var2, u1Var, lVar6, aVar3)));
                return Unit.INSTANCE;
            case 8:
                final lc.m0 m0Var3 = (lc.m0) obj6;
                ca0.u1 u1Var2 = (ca0.u1) obj5;
                final e23.a aVar4 = (e23.a) obj4;
                final e23.a aVar5 = (e23.a) obj3;
                final lc.k0 k0Var6 = (lc.k0) obj2;
                lc.k0 k0Var7 = (lc.k0) obj;
                k0Var7.getClass();
                z3.e eVar4 = new z3.e(-82815517, true, new aa2.r(m0Var3, i15, u1Var2, aVar4));
                p13.k0 k0Var8 = p13.k0.f134949a;
                k0Var8.getClass();
                p13.j0 j0Var4 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                nc.n.a(k0Var7, t0Var4.b(u2.h.class), k0Var8, j0Var4, null, null, null, null, eVar4);
                final int i27 = 0;
                nc.n.a(k0Var7, t0Var4.b(u2.e.class), k0Var8, j0Var4, null, null, null, null, new z3.e(-395892724, true, new e23.r() { // from class: ca0.r2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.r
                    public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                        int i28 = i27;
                        p3.m.a aVar6 = p3.m.f135153a;
                        lc.k0 k0Var9 = k0Var6;
                        lc.m0 m0Var4 = m0Var3;
                        e23.a aVar7 = aVar4;
                        r1.l lVar7 = (r1.l) obj7;
                        lc.v vVar = (lc.v) obj8;
                        switch (i28) {
                            case 0:
                                p3.m mVar = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var = p3.n.f135158a;
                                za0.i iVarA = t2.a(vVar, aVar7, m0Var4, mVar);
                                za0.t.a(iVarA, ((za0.i.b) s9.c.c(iVarA.f203251f, mVar).getF182175a()).f203254a, new a4.a(iVarA, r90.a.f151345c, k0Var9, m0Var4), aVar5, mVar, 0);
                                break;
                            case 1:
                                p3.m mVar2 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var2 = p3.n.f135158a;
                                za0.i iVarA2 = t2.a(vVar, aVar7, m0Var4, mVar2);
                                boolean z14 = ((za0.i.b) s9.c.c(iVarA2.f203251f, mVar2).getF182175a()).f203254a;
                                Object objQ = mVar2.q();
                                aVar6.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new d2(5);
                                    mVar2.K(objQ);
                                }
                                za0.n.a(z14, (e23.l) objQ, new a4.a(iVarA2, r90.a.f151346d, k0Var9, m0Var4), aVar5, (iVarA2.f203249d.f143503k ? za0.o.SCREENLESS : za0.o.DEFAULT).f203270a, mVar2, 48);
                                break;
                            case 2:
                                p3.m mVar3 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var3 = p3.n.f135158a;
                                za0.i iVarA3 = t2.a(vVar, aVar7, m0Var4, mVar3);
                                boolean z15 = ((za0.i.b) s9.c.c(iVarA3.f203251f, mVar3).getF182175a()).f203254a;
                                Object objQ2 = mVar3.q();
                                aVar6.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new d2(7);
                                    mVar3.K(objQ2);
                                }
                                za0.e.a(z15, (e23.l) objQ2, new a4.a(iVarA3, r90.a.f151347e, k0Var9, m0Var4), aVar5, mVar3, 48);
                                break;
                            case 3:
                                p3.m mVar4 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var4 = p3.n.f135158a;
                                za0.i iVarA4 = t2.a(vVar, aVar7, m0Var4, mVar4);
                                boolean z16 = ((za0.i.b) s9.c.c(iVarA4.f203251f, mVar4).getF182175a()).f203254a;
                                Object objQ3 = mVar4.q();
                                aVar6.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    objQ3 = new d2(6);
                                    mVar4.K(objQ3);
                                }
                                za0.f.a(z16, (e23.l) objQ3, new a4.a(iVarA4, r90.a.f151348f, k0Var9, m0Var4), aVar5, mVar4, 48);
                                break;
                            case 4:
                                p3.m mVar5 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var5 = p3.n.f135158a;
                                za0.i iVarA5 = t2.a(vVar, aVar7, m0Var4, mVar5);
                                boolean z17 = ((za0.i.b) s9.c.c(iVarA5.f203251f, mVar5).getF182175a()).f203254a;
                                Object objQ4 = mVar5.q();
                                aVar6.getClass();
                                if (objQ4 == p3.m.a.f135155b) {
                                    objQ4 = new d2(2);
                                    mVar5.K(objQ4);
                                }
                                za0.u.a(iVarA5, z17, (e23.l) objQ4, new a4.a(iVarA5, r90.a.f151349g, k0Var9, m0Var4), aVar5, mVar5, 384);
                                break;
                            default:
                                p3.m mVar6 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var6 = p3.n.f135158a;
                                za0.i iVarA6 = t2.a(vVar, aVar7, m0Var4, mVar6);
                                boolean z18 = ((za0.i.b) s9.c.c(iVarA6.f203251f, mVar6).getF182175a()).f203254a;
                                Object objQ5 = mVar6.q();
                                aVar6.getClass();
                                if (objQ5 == p3.m.a.f135155b) {
                                    objQ5 = new d2(4);
                                    mVar6.K(objQ5);
                                }
                                za0.v.a(z18, (e23.l) objQ5, new a4.a(iVarA6, r90.a.f151350h, k0Var9, m0Var4), aVar5, mVar6, 48);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                final int i28 = 1;
                nc.n.a(k0Var7, t0Var4.b(u2.c.class), k0Var8, j0Var4, null, null, null, null, new z3.e(377149227, true, new e23.r() { // from class: ca0.r2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.r
                    public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                        int i29 = i28;
                        p3.m.a aVar6 = p3.m.f135153a;
                        lc.k0 k0Var9 = k0Var6;
                        lc.m0 m0Var4 = m0Var3;
                        e23.a aVar7 = aVar4;
                        r1.l lVar7 = (r1.l) obj7;
                        lc.v vVar = (lc.v) obj8;
                        switch (i29) {
                            case 0:
                                p3.m mVar = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var = p3.n.f135158a;
                                za0.i iVarA = t2.a(vVar, aVar7, m0Var4, mVar);
                                za0.t.a(iVarA, ((za0.i.b) s9.c.c(iVarA.f203251f, mVar).getF182175a()).f203254a, new a4.a(iVarA, r90.a.f151345c, k0Var9, m0Var4), aVar5, mVar, 0);
                                break;
                            case 1:
                                p3.m mVar2 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var2 = p3.n.f135158a;
                                za0.i iVarA2 = t2.a(vVar, aVar7, m0Var4, mVar2);
                                boolean z14 = ((za0.i.b) s9.c.c(iVarA2.f203251f, mVar2).getF182175a()).f203254a;
                                Object objQ = mVar2.q();
                                aVar6.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new d2(5);
                                    mVar2.K(objQ);
                                }
                                za0.n.a(z14, (e23.l) objQ, new a4.a(iVarA2, r90.a.f151346d, k0Var9, m0Var4), aVar5, (iVarA2.f203249d.f143503k ? za0.o.SCREENLESS : za0.o.DEFAULT).f203270a, mVar2, 48);
                                break;
                            case 2:
                                p3.m mVar3 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var3 = p3.n.f135158a;
                                za0.i iVarA3 = t2.a(vVar, aVar7, m0Var4, mVar3);
                                boolean z15 = ((za0.i.b) s9.c.c(iVarA3.f203251f, mVar3).getF182175a()).f203254a;
                                Object objQ2 = mVar3.q();
                                aVar6.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new d2(7);
                                    mVar3.K(objQ2);
                                }
                                za0.e.a(z15, (e23.l) objQ2, new a4.a(iVarA3, r90.a.f151347e, k0Var9, m0Var4), aVar5, mVar3, 48);
                                break;
                            case 3:
                                p3.m mVar4 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var4 = p3.n.f135158a;
                                za0.i iVarA4 = t2.a(vVar, aVar7, m0Var4, mVar4);
                                boolean z16 = ((za0.i.b) s9.c.c(iVarA4.f203251f, mVar4).getF182175a()).f203254a;
                                Object objQ3 = mVar4.q();
                                aVar6.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    objQ3 = new d2(6);
                                    mVar4.K(objQ3);
                                }
                                za0.f.a(z16, (e23.l) objQ3, new a4.a(iVarA4, r90.a.f151348f, k0Var9, m0Var4), aVar5, mVar4, 48);
                                break;
                            case 4:
                                p3.m mVar5 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var5 = p3.n.f135158a;
                                za0.i iVarA5 = t2.a(vVar, aVar7, m0Var4, mVar5);
                                boolean z17 = ((za0.i.b) s9.c.c(iVarA5.f203251f, mVar5).getF182175a()).f203254a;
                                Object objQ4 = mVar5.q();
                                aVar6.getClass();
                                if (objQ4 == p3.m.a.f135155b) {
                                    objQ4 = new d2(2);
                                    mVar5.K(objQ4);
                                }
                                za0.u.a(iVarA5, z17, (e23.l) objQ4, new a4.a(iVarA5, r90.a.f151349g, k0Var9, m0Var4), aVar5, mVar5, 384);
                                break;
                            default:
                                p3.m mVar6 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var6 = p3.n.f135158a;
                                za0.i iVarA6 = t2.a(vVar, aVar7, m0Var4, mVar6);
                                boolean z18 = ((za0.i.b) s9.c.c(iVarA6.f203251f, mVar6).getF182175a()).f203254a;
                                Object objQ5 = mVar6.q();
                                aVar6.getClass();
                                if (objQ5 == p3.m.a.f135155b) {
                                    objQ5 = new d2(4);
                                    mVar6.K(objQ5);
                                }
                                za0.v.a(z18, (e23.l) objQ5, new a4.a(iVarA6, r90.a.f151350h, k0Var9, m0Var4), aVar5, mVar6, 48);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                final int i29 = 2;
                nc.n.a(k0Var7, t0Var4.b(u2.a.class), k0Var8, j0Var4, null, null, null, null, new z3.e(1150191178, true, new e23.r() { // from class: ca0.r2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.r
                    public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                        int i210 = i29;
                        p3.m.a aVar6 = p3.m.f135153a;
                        lc.k0 k0Var9 = k0Var6;
                        lc.m0 m0Var4 = m0Var3;
                        e23.a aVar7 = aVar4;
                        r1.l lVar7 = (r1.l) obj7;
                        lc.v vVar = (lc.v) obj8;
                        switch (i210) {
                            case 0:
                                p3.m mVar = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var = p3.n.f135158a;
                                za0.i iVarA = t2.a(vVar, aVar7, m0Var4, mVar);
                                za0.t.a(iVarA, ((za0.i.b) s9.c.c(iVarA.f203251f, mVar).getF182175a()).f203254a, new a4.a(iVarA, r90.a.f151345c, k0Var9, m0Var4), aVar5, mVar, 0);
                                break;
                            case 1:
                                p3.m mVar2 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var2 = p3.n.f135158a;
                                za0.i iVarA2 = t2.a(vVar, aVar7, m0Var4, mVar2);
                                boolean z14 = ((za0.i.b) s9.c.c(iVarA2.f203251f, mVar2).getF182175a()).f203254a;
                                Object objQ = mVar2.q();
                                aVar6.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new d2(5);
                                    mVar2.K(objQ);
                                }
                                za0.n.a(z14, (e23.l) objQ, new a4.a(iVarA2, r90.a.f151346d, k0Var9, m0Var4), aVar5, (iVarA2.f203249d.f143503k ? za0.o.SCREENLESS : za0.o.DEFAULT).f203270a, mVar2, 48);
                                break;
                            case 2:
                                p3.m mVar3 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var3 = p3.n.f135158a;
                                za0.i iVarA3 = t2.a(vVar, aVar7, m0Var4, mVar3);
                                boolean z15 = ((za0.i.b) s9.c.c(iVarA3.f203251f, mVar3).getF182175a()).f203254a;
                                Object objQ2 = mVar3.q();
                                aVar6.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new d2(7);
                                    mVar3.K(objQ2);
                                }
                                za0.e.a(z15, (e23.l) objQ2, new a4.a(iVarA3, r90.a.f151347e, k0Var9, m0Var4), aVar5, mVar3, 48);
                                break;
                            case 3:
                                p3.m mVar4 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var4 = p3.n.f135158a;
                                za0.i iVarA4 = t2.a(vVar, aVar7, m0Var4, mVar4);
                                boolean z16 = ((za0.i.b) s9.c.c(iVarA4.f203251f, mVar4).getF182175a()).f203254a;
                                Object objQ3 = mVar4.q();
                                aVar6.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    objQ3 = new d2(6);
                                    mVar4.K(objQ3);
                                }
                                za0.f.a(z16, (e23.l) objQ3, new a4.a(iVarA4, r90.a.f151348f, k0Var9, m0Var4), aVar5, mVar4, 48);
                                break;
                            case 4:
                                p3.m mVar5 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var5 = p3.n.f135158a;
                                za0.i iVarA5 = t2.a(vVar, aVar7, m0Var4, mVar5);
                                boolean z17 = ((za0.i.b) s9.c.c(iVarA5.f203251f, mVar5).getF182175a()).f203254a;
                                Object objQ4 = mVar5.q();
                                aVar6.getClass();
                                if (objQ4 == p3.m.a.f135155b) {
                                    objQ4 = new d2(2);
                                    mVar5.K(objQ4);
                                }
                                za0.u.a(iVarA5, z17, (e23.l) objQ4, new a4.a(iVarA5, r90.a.f151349g, k0Var9, m0Var4), aVar5, mVar5, 384);
                                break;
                            default:
                                p3.m mVar6 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var6 = p3.n.f135158a;
                                za0.i iVarA6 = t2.a(vVar, aVar7, m0Var4, mVar6);
                                boolean z18 = ((za0.i.b) s9.c.c(iVarA6.f203251f, mVar6).getF182175a()).f203254a;
                                Object objQ5 = mVar6.q();
                                aVar6.getClass();
                                if (objQ5 == p3.m.a.f135155b) {
                                    objQ5 = new d2(4);
                                    mVar6.K(objQ5);
                                }
                                za0.v.a(z18, (e23.l) objQ5, new a4.a(iVarA6, r90.a.f151350h, k0Var9, m0Var4), aVar5, mVar6, 48);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                final int i30 = 3;
                nc.n.a(k0Var7, t0Var4.b(u2.b.class), k0Var8, j0Var4, null, null, null, null, new z3.e(1923233129, true, new e23.r() { // from class: ca0.r2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.r
                    public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                        int i210 = i30;
                        p3.m.a aVar6 = p3.m.f135153a;
                        lc.k0 k0Var9 = k0Var6;
                        lc.m0 m0Var4 = m0Var3;
                        e23.a aVar7 = aVar4;
                        r1.l lVar7 = (r1.l) obj7;
                        lc.v vVar = (lc.v) obj8;
                        switch (i210) {
                            case 0:
                                p3.m mVar = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var = p3.n.f135158a;
                                za0.i iVarA = t2.a(vVar, aVar7, m0Var4, mVar);
                                za0.t.a(iVarA, ((za0.i.b) s9.c.c(iVarA.f203251f, mVar).getF182175a()).f203254a, new a4.a(iVarA, r90.a.f151345c, k0Var9, m0Var4), aVar5, mVar, 0);
                                break;
                            case 1:
                                p3.m mVar2 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var2 = p3.n.f135158a;
                                za0.i iVarA2 = t2.a(vVar, aVar7, m0Var4, mVar2);
                                boolean z14 = ((za0.i.b) s9.c.c(iVarA2.f203251f, mVar2).getF182175a()).f203254a;
                                Object objQ = mVar2.q();
                                aVar6.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new d2(5);
                                    mVar2.K(objQ);
                                }
                                za0.n.a(z14, (e23.l) objQ, new a4.a(iVarA2, r90.a.f151346d, k0Var9, m0Var4), aVar5, (iVarA2.f203249d.f143503k ? za0.o.SCREENLESS : za0.o.DEFAULT).f203270a, mVar2, 48);
                                break;
                            case 2:
                                p3.m mVar3 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var3 = p3.n.f135158a;
                                za0.i iVarA3 = t2.a(vVar, aVar7, m0Var4, mVar3);
                                boolean z15 = ((za0.i.b) s9.c.c(iVarA3.f203251f, mVar3).getF182175a()).f203254a;
                                Object objQ2 = mVar3.q();
                                aVar6.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new d2(7);
                                    mVar3.K(objQ2);
                                }
                                za0.e.a(z15, (e23.l) objQ2, new a4.a(iVarA3, r90.a.f151347e, k0Var9, m0Var4), aVar5, mVar3, 48);
                                break;
                            case 3:
                                p3.m mVar4 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var4 = p3.n.f135158a;
                                za0.i iVarA4 = t2.a(vVar, aVar7, m0Var4, mVar4);
                                boolean z16 = ((za0.i.b) s9.c.c(iVarA4.f203251f, mVar4).getF182175a()).f203254a;
                                Object objQ3 = mVar4.q();
                                aVar6.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    objQ3 = new d2(6);
                                    mVar4.K(objQ3);
                                }
                                za0.f.a(z16, (e23.l) objQ3, new a4.a(iVarA4, r90.a.f151348f, k0Var9, m0Var4), aVar5, mVar4, 48);
                                break;
                            case 4:
                                p3.m mVar5 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var5 = p3.n.f135158a;
                                za0.i iVarA5 = t2.a(vVar, aVar7, m0Var4, mVar5);
                                boolean z17 = ((za0.i.b) s9.c.c(iVarA5.f203251f, mVar5).getF182175a()).f203254a;
                                Object objQ4 = mVar5.q();
                                aVar6.getClass();
                                if (objQ4 == p3.m.a.f135155b) {
                                    objQ4 = new d2(2);
                                    mVar5.K(objQ4);
                                }
                                za0.u.a(iVarA5, z17, (e23.l) objQ4, new a4.a(iVarA5, r90.a.f151349g, k0Var9, m0Var4), aVar5, mVar5, 384);
                                break;
                            default:
                                p3.m mVar6 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var6 = p3.n.f135158a;
                                za0.i iVarA6 = t2.a(vVar, aVar7, m0Var4, mVar6);
                                boolean z18 = ((za0.i.b) s9.c.c(iVarA6.f203251f, mVar6).getF182175a()).f203254a;
                                Object objQ5 = mVar6.q();
                                aVar6.getClass();
                                if (objQ5 == p3.m.a.f135155b) {
                                    objQ5 = new d2(4);
                                    mVar6.K(objQ5);
                                }
                                za0.v.a(z18, (e23.l) objQ5, new a4.a(iVarA6, r90.a.f151350h, k0Var9, m0Var4), aVar5, mVar6, 48);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                final int i34 = 4;
                nc.n.a(k0Var7, t0Var4.b(u2.f.class), k0Var8, j0Var4, null, null, null, null, new z3.e(-1598692216, true, new e23.r() { // from class: ca0.r2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.r
                    public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                        int i210 = i34;
                        p3.m.a aVar6 = p3.m.f135153a;
                        lc.k0 k0Var9 = k0Var6;
                        lc.m0 m0Var4 = m0Var3;
                        e23.a aVar7 = aVar4;
                        r1.l lVar7 = (r1.l) obj7;
                        lc.v vVar = (lc.v) obj8;
                        switch (i210) {
                            case 0:
                                p3.m mVar = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var = p3.n.f135158a;
                                za0.i iVarA = t2.a(vVar, aVar7, m0Var4, mVar);
                                za0.t.a(iVarA, ((za0.i.b) s9.c.c(iVarA.f203251f, mVar).getF182175a()).f203254a, new a4.a(iVarA, r90.a.f151345c, k0Var9, m0Var4), aVar5, mVar, 0);
                                break;
                            case 1:
                                p3.m mVar2 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var2 = p3.n.f135158a;
                                za0.i iVarA2 = t2.a(vVar, aVar7, m0Var4, mVar2);
                                boolean z14 = ((za0.i.b) s9.c.c(iVarA2.f203251f, mVar2).getF182175a()).f203254a;
                                Object objQ = mVar2.q();
                                aVar6.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new d2(5);
                                    mVar2.K(objQ);
                                }
                                za0.n.a(z14, (e23.l) objQ, new a4.a(iVarA2, r90.a.f151346d, k0Var9, m0Var4), aVar5, (iVarA2.f203249d.f143503k ? za0.o.SCREENLESS : za0.o.DEFAULT).f203270a, mVar2, 48);
                                break;
                            case 2:
                                p3.m mVar3 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var3 = p3.n.f135158a;
                                za0.i iVarA3 = t2.a(vVar, aVar7, m0Var4, mVar3);
                                boolean z15 = ((za0.i.b) s9.c.c(iVarA3.f203251f, mVar3).getF182175a()).f203254a;
                                Object objQ2 = mVar3.q();
                                aVar6.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new d2(7);
                                    mVar3.K(objQ2);
                                }
                                za0.e.a(z15, (e23.l) objQ2, new a4.a(iVarA3, r90.a.f151347e, k0Var9, m0Var4), aVar5, mVar3, 48);
                                break;
                            case 3:
                                p3.m mVar4 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var4 = p3.n.f135158a;
                                za0.i iVarA4 = t2.a(vVar, aVar7, m0Var4, mVar4);
                                boolean z16 = ((za0.i.b) s9.c.c(iVarA4.f203251f, mVar4).getF182175a()).f203254a;
                                Object objQ3 = mVar4.q();
                                aVar6.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    objQ3 = new d2(6);
                                    mVar4.K(objQ3);
                                }
                                za0.f.a(z16, (e23.l) objQ3, new a4.a(iVarA4, r90.a.f151348f, k0Var9, m0Var4), aVar5, mVar4, 48);
                                break;
                            case 4:
                                p3.m mVar5 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var5 = p3.n.f135158a;
                                za0.i iVarA5 = t2.a(vVar, aVar7, m0Var4, mVar5);
                                boolean z17 = ((za0.i.b) s9.c.c(iVarA5.f203251f, mVar5).getF182175a()).f203254a;
                                Object objQ4 = mVar5.q();
                                aVar6.getClass();
                                if (objQ4 == p3.m.a.f135155b) {
                                    objQ4 = new d2(2);
                                    mVar5.K(objQ4);
                                }
                                za0.u.a(iVarA5, z17, (e23.l) objQ4, new a4.a(iVarA5, r90.a.f151349g, k0Var9, m0Var4), aVar5, mVar5, 384);
                                break;
                            default:
                                p3.m mVar6 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var6 = p3.n.f135158a;
                                za0.i iVarA6 = t2.a(vVar, aVar7, m0Var4, mVar6);
                                boolean z18 = ((za0.i.b) s9.c.c(iVarA6.f203251f, mVar6).getF182175a()).f203254a;
                                Object objQ5 = mVar6.q();
                                aVar6.getClass();
                                if (objQ5 == p3.m.a.f135155b) {
                                    objQ5 = new d2(4);
                                    mVar6.K(objQ5);
                                }
                                za0.v.a(z18, (e23.l) objQ5, new a4.a(iVarA6, r90.a.f151350h, k0Var9, m0Var4), aVar5, mVar6, 48);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                final int i35 = 5;
                nc.n.a(k0Var7, t0Var4.b(u2.g.class), k0Var8, j0Var4, null, null, null, null, new z3.e(-825650265, true, new e23.r() { // from class: ca0.r2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.r
                    public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                        int i210 = i35;
                        p3.m.a aVar6 = p3.m.f135153a;
                        lc.k0 k0Var9 = k0Var6;
                        lc.m0 m0Var4 = m0Var3;
                        e23.a aVar7 = aVar4;
                        r1.l lVar7 = (r1.l) obj7;
                        lc.v vVar = (lc.v) obj8;
                        switch (i210) {
                            case 0:
                                p3.m mVar = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var = p3.n.f135158a;
                                za0.i iVarA = t2.a(vVar, aVar7, m0Var4, mVar);
                                za0.t.a(iVarA, ((za0.i.b) s9.c.c(iVarA.f203251f, mVar).getF182175a()).f203254a, new a4.a(iVarA, r90.a.f151345c, k0Var9, m0Var4), aVar5, mVar, 0);
                                break;
                            case 1:
                                p3.m mVar2 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var2 = p3.n.f135158a;
                                za0.i iVarA2 = t2.a(vVar, aVar7, m0Var4, mVar2);
                                boolean z14 = ((za0.i.b) s9.c.c(iVarA2.f203251f, mVar2).getF182175a()).f203254a;
                                Object objQ = mVar2.q();
                                aVar6.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new d2(5);
                                    mVar2.K(objQ);
                                }
                                za0.n.a(z14, (e23.l) objQ, new a4.a(iVarA2, r90.a.f151346d, k0Var9, m0Var4), aVar5, (iVarA2.f203249d.f143503k ? za0.o.SCREENLESS : za0.o.DEFAULT).f203270a, mVar2, 48);
                                break;
                            case 2:
                                p3.m mVar3 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var3 = p3.n.f135158a;
                                za0.i iVarA3 = t2.a(vVar, aVar7, m0Var4, mVar3);
                                boolean z15 = ((za0.i.b) s9.c.c(iVarA3.f203251f, mVar3).getF182175a()).f203254a;
                                Object objQ2 = mVar3.q();
                                aVar6.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new d2(7);
                                    mVar3.K(objQ2);
                                }
                                za0.e.a(z15, (e23.l) objQ2, new a4.a(iVarA3, r90.a.f151347e, k0Var9, m0Var4), aVar5, mVar3, 48);
                                break;
                            case 3:
                                p3.m mVar4 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var4 = p3.n.f135158a;
                                za0.i iVarA4 = t2.a(vVar, aVar7, m0Var4, mVar4);
                                boolean z16 = ((za0.i.b) s9.c.c(iVarA4.f203251f, mVar4).getF182175a()).f203254a;
                                Object objQ3 = mVar4.q();
                                aVar6.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    objQ3 = new d2(6);
                                    mVar4.K(objQ3);
                                }
                                za0.f.a(z16, (e23.l) objQ3, new a4.a(iVarA4, r90.a.f151348f, k0Var9, m0Var4), aVar5, mVar4, 48);
                                break;
                            case 4:
                                p3.m mVar5 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var5 = p3.n.f135158a;
                                za0.i iVarA5 = t2.a(vVar, aVar7, m0Var4, mVar5);
                                boolean z17 = ((za0.i.b) s9.c.c(iVarA5.f203251f, mVar5).getF182175a()).f203254a;
                                Object objQ4 = mVar5.q();
                                aVar6.getClass();
                                if (objQ4 == p3.m.a.f135155b) {
                                    objQ4 = new d2(2);
                                    mVar5.K(objQ4);
                                }
                                za0.u.a(iVarA5, z17, (e23.l) objQ4, new a4.a(iVarA5, r90.a.f151349g, k0Var9, m0Var4), aVar5, mVar5, 384);
                                break;
                            default:
                                p3.m mVar6 = (p3.m) obj9;
                                r1.q2.t((Integer) obj10, lVar7, vVar);
                                p3.x1 x1Var6 = p3.n.f135158a;
                                za0.i iVarA6 = t2.a(vVar, aVar7, m0Var4, mVar6);
                                boolean z18 = ((za0.i.b) s9.c.c(iVarA6.f203251f, mVar6).getF182175a()).f203254a;
                                Object objQ5 = mVar6.q();
                                aVar6.getClass();
                                if (objQ5 == p3.m.a.f135155b) {
                                    objQ5 = new d2(4);
                                    mVar6.K(objQ5);
                                }
                                za0.v.a(z18, (e23.l) objQ5, new a4.a(iVarA6, r90.a.f151350h, k0Var9, m0Var4), aVar5, mVar6, 48);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                nc.n.a(k0Var7, t0Var4.b(u2.d.class), k0Var8, j0Var4, null, null, null, null, new z3.e(-52608314, true, new a42.d0((Object) u1Var2, (Object) aVar5, (Object) aVar4, (Object) m0Var3, 12)));
                return Unit.INSTANCE;
            case 9:
                e23.l lVar7 = (e23.l) obj6;
                c.q qVar2 = (c.q) obj5;
                Context context = (Context) obj3;
                String str3 = (String) obj4;
                String str4 = (String) obj2;
                ((Integer) obj).getClass();
                if (lVar7 != null) {
                    lVar7.invoke(Boolean.TRUE);
                }
                d dVar2 = (d) KoinJavaComponent.get$default(d.class, null, null, 6, null);
                if (str3 == null) {
                    str3 = "";
                }
                qVar2.a(dVar2.d(context, str3, str4, null), null);
                return Unit.INSTANCE;
            case 10:
                List list4 = (List) obj6;
                e2.f0 f0Var2 = (e2.f0) obj;
                f0Var2.getClass();
                e2.f0.f(f0Var2, list4.size(), null, new z3.e(287444521, true, new a42.c0(list4, (m00.a) obj5, (yo1.f) obj4, (p3.n1) obj3, (p3.p1) obj2, 8)), 6);
                return Unit.INSTANCE;
            case 11:
                o53.b0 b0Var = (o53.b0) obj5;
                h2.j0 j0Var5 = (h2.j0) obj4;
                g6.c cVar2 = (g6.c) obj3;
                e23.l lVar8 = (e23.l) obj2;
                e2.f0 f0Var3 = (e2.f0) obj;
                f0Var3.getClass();
                Iterator<c3> it = ((g81.c) obj6).f76286d.iterator();
                while (true) {
                    int i36 = i17;
                    if (!it.hasNext()) {
                        return Unit.INSTANCE;
                    }
                    c3 next = it.next();
                    i17 = i36 + 1;
                    if (i36 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    e2.f0.b(f0Var3, null, new z3.e(-2133855036, true, new d81.e(b0Var, j0Var5, i36, next, cVar2, lVar8, 0)), 3);
                }
                break;
            case 12:
                zs.c cVar3 = (zs.c) obj6;
                lc.m0 m0Var4 = (lc.m0) obj5;
                e23.a aVar6 = (e23.a) obj4;
                e23.l lVar9 = (e23.l) obj3;
                Context context2 = (Context) obj2;
                lc.k0 k0Var9 = (lc.k0) obj;
                k0Var9.getClass();
                z3.e eVar5 = new z3.e(-615444840, true, new a42.c0(cVar3, m0Var4, aVar6, lVar9, context2));
                p13.k0 k0Var10 = p13.k0.f134949a;
                k0Var10.getClass();
                p13.j0 j0Var6 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                nc.n.a(k0Var9, t0Var5.b(dt.h.class), k0Var10, j0Var6, null, null, null, null, eVar5);
                nc.n.a(k0Var9, t0Var5.b(dt.g.class), k0Var10, j0Var6, null, null, null, null, new z3.e(-1155912625, true, new a42.d0(cVar3, m0Var4, lVar9, context2, 15)));
                nc.n.a(k0Var9, t0Var5.b(dt.a.class), k0Var10, j0Var6, null, null, null, null, new z3.e(-1550316464, true, new aa2.r(cVar3, 16, m0Var4, aVar6)));
                return Unit.INSTANCE;
            case 13:
                pt1.p pVar3 = (pt1.p) obj6;
                e23.l lVar10 = (e23.l) obj5;
                e23.l lVar11 = (e23.l) obj4;
                e23.l lVar12 = (e23.l) obj3;
                e23.a aVar7 = (e23.a) obj2;
                Integer num = (Integer) obj;
                num.intValue();
                if (pVar3 == null || !pVar3.f140952x) {
                    lVar11.invoke(num);
                    lVar12.invoke(pt1.n.f.f140900a);
                    aVar7.invoke();
                } else {
                    lVar10.invoke(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 14:
                e2.f0 f0Var4 = (e2.f0) obj;
                f0Var4.getClass();
                e2.f0.b(f0Var4, null, new z3.e(-446322220, true, new et1.j1((pt1.a) obj6, (e23.l) obj5, (je2.b) obj4, (e23.l) obj3, (e23.l) obj2, 1)), 3);
                return Unit.INSTANCE;
            case 15:
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.l lVar13 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.l) obj6;
                f4.s sVar2 = (f4.s) obj5;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.p pVar4 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.p) obj4;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar3 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) obj3;
                x3 x3Var = (x3) obj2;
                w02.p pVar5 = (w02.p) obj;
                pVar5.getClass();
                List<e23.a<r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>>> list5 = lVar13.f49034b;
                int i37 = 10;
                ArrayList<r52.b> arrayList3 = new ArrayList(p13.y.r(list5, 10));
                Iterator<T> it3 = list5.iterator();
                while (it3.hasNext()) {
                    arrayList3.add((r52.b) ((e23.a) it3.next()).invoke());
                }
                ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList3, 10));
                for (r52.b bVar4 : arrayList3) {
                    arrayList4.add(new f62.h(bVar4.getClass(), bVar4));
                }
                pVar5.a(arrayList4.size(), new com.garmin.android.apps.connectmobile.workouts.presentation.edit.l.g(new f21.g0(i37), arrayList4), new com.garmin.android.apps.connectmobile.workouts.presentation.edit.l.h(com.garmin.android.apps.connectmobile.workouts.presentation.edit.l.f.f49051a, arrayList4), new z3.e(802480018, true, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.l.i(arrayList4, pVar4, qVar3)));
                pVar5.i(sVar2.size(), new com.garmin.android.apps.connectmobile.workouts.presentation.edit.l.o(new f21.g0(11), sVar2), new com.garmin.android.apps.connectmobile.workouts.presentation.edit.l.p(com.garmin.android.apps.connectmobile.workouts.presentation.edit.l.n.f49067a, sVar2), new z3.e(-430548225, true, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.l.q(sVar2, qVar3, x3Var, pVar4)));
                List<e23.a<r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, com.garmin.android.apps.connectmobile.workouts.presentation.edit.p>>> list6 = lVar13.f49035c;
                ArrayList<r52.b> arrayList5 = new ArrayList(p13.y.r(list6, 10));
                Iterator<T> it4 = list6.iterator();
                while (it4.hasNext()) {
                    arrayList5.add((r52.b) ((e23.a) it4.next()).invoke());
                }
                ArrayList arrayList6 = new ArrayList(p13.y.r(arrayList5, 10));
                for (r52.b bVar5 : arrayList5) {
                    arrayList6.add(new f62.h(bVar5.getClass(), bVar5));
                }
                pVar5.a(arrayList6.size(), new com.garmin.android.apps.connectmobile.workouts.presentation.edit.l.k(new f21.g0(12), arrayList6), new com.garmin.android.apps.connectmobile.workouts.presentation.edit.l.C0960l(com.garmin.android.apps.connectmobile.workouts.presentation.edit.l.j.f49059a, arrayList6), new z3.e(802480018, true, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.l.m(arrayList6, pVar4, qVar3)));
                return Unit.INSTANCE;
            case 16:
                p5.k0 k0Var11 = (p5.k0) obj;
                k0Var11.getClass();
                p5.h0.n(k0Var11, oi0.c.A((Context) obj6, new fh0.b(19), (String) obj4) + ", " + ((String) obj5) + ", " + ((p005kotlin.jvm.internal.r0) obj3).f105810a + ", " + ((String) obj2));
                return Unit.INSTANCE;
            case 17:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b bVar6 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b) obj6;
                Context context3 = (Context) obj5;
                gz1.a aVar8 = (gz1.a) obj4;
                p3.p1 p1Var = (p3.p1) obj2;
                double dDoubleValue = ((Double) obj).doubleValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.a aVar9 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.f45995d;
                Boolean bool = Boolean.FALSE;
                ((p3.p1) obj3).setValue(bool);
                boolean z14 = bVar6.f45997b;
                Boolean bool2 = aVar8.f80408a;
                Double d15 = aVar8.f80417j;
                Double d16 = aVar8.f80415h;
                Boolean bool3 = Boolean.TRUE;
                if (p005kotlin.jvm.internal.s.g(bool2, bool3)) {
                    if (dDoubleValue > 0.0d) {
                        double dDoubleValue2 = (d16 != null ? d16.doubleValue() : 0.0d) * dDoubleValue;
                        if (z14) {
                            l3.f23124b.getClass();
                            d14 = 1000.0d;
                        } else {
                            l3.f23124b.getClass();
                            d14 = 1609.344d;
                        }
                        double d17 = dDoubleValue2 / d14;
                        if (com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.G6(d17, z14)) {
                            bVar6.F6();
                            aVarA = gz1.a.a(aVar8, null, null, null, null, bVar6.J6(d17, dDoubleValue2), fz1.k.I4(context3, d16 != null ? d16.doubleValue() : 0.0d, dDoubleValue2), null, null, 0L, Double.valueOf(dDoubleValue2), null, dDoubleValue, 0L, 5583);
                            p1Var.setValue(bool3);
                            Unit unit = Unit.INSTANCE;
                        } else {
                            aVarH6 = bVar6.I6(context3, aVar8);
                            p1Var.setValue(bool);
                            Unit unit2 = Unit.INSTANCE;
                        }
                    } else {
                        aVarH6 = bVar6.I6(context3, aVar8);
                        p1Var.setValue(bool);
                        Unit unit3 = Unit.INSTANCE;
                    }
                    aVarA = aVarH6;
                } else {
                    if (dDoubleValue > 0.0d) {
                        long jDoubleValue = (long) ((d15 != null ? d15.doubleValue() : 0.0d) / dDoubleValue);
                        l3.f23124b.getClass();
                        if (((int) jDoubleValue) / DateTimeConstants.SECONDS_PER_HOUR <= 48) {
                            bVar6.F6();
                            double d18 = jDoubleValue;
                            aVarA = gz1.a.a(aVar8, null, null, null, l3.a.e1(jDoubleValue), null, fz1.k.I4(context3, d18, d15 != null ? d15.doubleValue() : 0.0d), null, Double.valueOf(d18), 0L, null, null, dDoubleValue, 0L, 5975);
                        } else {
                            aVarH6 = bVar6.H6(context3, aVar8);
                            p1Var.setValue(bool);
                            Unit unit4 = Unit.INSTANCE;
                        }
                    } else {
                        aVarH6 = bVar6.H6(context3, aVar8);
                        p1Var.setValue(bool);
                        Unit unit5 = Unit.INSTANCE;
                    }
                    aVarA = aVarH6;
                }
                bVar6.F6().E.k(null, aVarA);
                return Unit.INSTANCE;
            case 18:
                rz.a aVar10 = (rz.a) obj6;
                LocalDate localDate = (LocalDate) obj5;
                LocalDate localDate2 = (LocalDate) obj4;
                z42.d dVar3 = (z42.d) obj3;
                Context context4 = (Context) obj2;
                ((CustomBarChart) obj).getClass();
                if (dVar3 == null || (list = dVar3.f202384a) == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList7 = new ArrayList();
                    for (z42.e eVar6 : list) {
                        LocalDate localDateB = eVar6.b();
                        z42.e.b values = eVar6.getValues();
                        Integer totalPushes = values != null ? values.getTotalPushes() : null;
                        z42.e.b values2 = eVar6.getValues();
                        arrayList7.add(new f52.a(localDateB, totalPushes, values2 != null ? values2.getPushGoal() : null));
                    }
                    arrayList = arrayList7;
                }
                qz.a.b(aVar10, new h52.e(localDate, localDate2, arrayList, null, 8, null), context4.getString(R.string.common_no_certain_data, context4.getString(R.string.lbl_pushes)), 4);
                return Unit.INSTANCE;
            case 19:
                rz.a aVar11 = (rz.a) obj6;
                LocalDate localDate3 = (LocalDate) obj5;
                LocalDate localDate4 = (LocalDate) obj4;
                z42.i iVar = (z42.i) obj3;
                Context context5 = (Context) obj2;
                ((CustomBarChart) obj).getClass();
                if (iVar != null && (list2 = iVar.f202404a) != null) {
                    ArrayList arrayList8 = new ArrayList();
                    for (z42.j jVar : list2) {
                        LocalDate localDateB2 = jVar.b();
                        z42.l values3 = jVar.getValues();
                        arrayList8.add(new f52.a(localDateB2, values3 != null ? values3.getTotalPushes() : null, null, 4, null));
                    }
                    arrayList2 = arrayList8;
                }
                qz.a.b(aVar11, new h52.e(localDate3, localDate4, arrayList2, null, 8, null), context5.getString(R.string.common_no_certain_data, context5.getString(R.string.lbl_pushes)), 4);
                return Unit.INSTANCE;
            case 20:
                gk1.e eVar7 = (gk1.e) obj6;
                e23.a aVar12 = (e23.a) obj5;
                com.garmin.android.apps.connectmobile.googlehealthconnect.a aVar13 = (com.garmin.android.apps.connectmobile.googlehealthconnect.a) obj4;
                p3.o1 o1Var = (p3.o1) obj3;
                p3.p1 p1Var2 = (p3.p1) obj2;
                Set set = (Set) obj;
                set.getClass();
                ge1.b.T(androidx.lifecycle.v1.a(eVar7), null, null, new gk1.d(eVar7, null), 3);
                if (!set.isEmpty()) {
                    aVar12.invoke();
                    aVar13.k(com.garmin.android.apps.connectmobile.googlehealthconnect.b.c.ON_PERMISSIONS_CHANGE, false);
                } else if (DateTime.now().getMillis() - o1Var.j() < 300) {
                    p1Var2.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 21:
                lc.y yVar2 = (lc.y) obj6;
                e23.a aVar14 = (e23.a) obj2;
                lc.k0 k0Var12 = (lc.k0) obj;
                k0Var12.getClass();
                z3.e eVar8 = new z3.e(1417072473, true, new aa2.r(new gk1.b(yVar2, i24), 25, (ak0.i) obj5, yVar2));
                p13.k0 k0Var13 = p13.k0.f134949a;
                k0Var13.getClass();
                p13.j0 j0Var7 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                nc.n.a(k0Var12, t0Var6.b(gl1.r.class), k0Var13, j0Var7, null, null, null, null, eVar8);
                nc.n.a(k0Var12, t0Var6.b(gl1.t.class), k0Var13, j0Var7, gl1.u.f77867a, gl1.v.f77868a, gl1.w.f77869a, gl1.x.f77870a, new z3.e(-332736444, true, new a42.d0(obj4, obj3, aVar14, (Object) yVar2, 19)));
                return Unit.INSTANCE;
            case 22:
                e2.f0 f0Var5 = (e2.f0) obj;
                f0Var5.getClass();
                i53.c<o51.c> cVar4 = ((o51.d) obj6).f129226d;
                f0Var5.a(cVar4.size(), new h51.d.f(new h02.a(i15), cVar4), new h51.d.g(h51.d.e.f82090a, cVar4), new z3.e(802480018, true, new h51.d.h(cVar4, (p3.o1) obj5, (p3.p1) obj4, (e23.l) obj3, (e23.l) obj2)));
                return Unit.INSTANCE;
            case 23:
                List list7 = (List) obj6;
                List list8 = (List) obj5;
                e23.l lVar14 = (e23.l) obj3;
                Map map2 = (Map) obj2;
                e2.f0 f0Var6 = (e2.f0) obj;
                f0Var6.getClass();
                e2.f0.b(f0Var6, null, new z3.e(1280940990, true, new gt1.l((e23.l) obj4, i24)), 3);
                if (list7.isEmpty()) {
                    if (!list8.isEmpty()) {
                        ha0.c.f82622a.getClass();
                        e2.f0.b(f0Var6, null, ha0.c.f82624c, 3);
                        e2.f0.b(f0Var6, null, new z3.e(1156162059, true, new c82.e(list8, lVar14, i18)), 3);
                        e2.f0.b(f0Var6, null, ha0.c.f82625d, 3);
                    }
                    e2.f0.b(f0Var6, null, new z3.e(-466384995, true, new e11.c0(i16, map2, lVar14)), 3);
                } else {
                    ha0.c.f82622a.getClass();
                    e2.f0.b(f0Var6, null, ha0.c.f82623b, 3);
                    e2.f0.b(f0Var6, null, new z3.e(-457525713, true, new c82.e(list7, lVar14, i24)), 3);
                }
                ha0.c.f82622a.getClass();
                e2.f0.b(f0Var6, null, ha0.c.f82626e, 3);
                return Unit.INSTANCE;
            case 24:
                e23.p pVar6 = (e23.p) obj6;
                p3.p1 p1Var3 = (p3.p1) obj5;
                p3.p1 p1Var4 = (p3.p1) obj4;
                p3.p1 p1Var5 = (p3.p1) obj3;
                p3.p1 p1Var6 = (p3.p1) obj2;
                Long l14 = (Long) obj;
                if (l14 != null) {
                    long jLongValue = l14.longValue();
                    if (((eo.e) p1Var3.getF182175a()) == eo.e.MINIMUM) {
                        eo.d.f64761d.getClass();
                        p1Var4.setValue(eo.d.a.a(jLongValue));
                    } else {
                        eo.d.f64761d.getClass();
                        p1Var5.setValue(eo.d.a.a(jLongValue));
                    }
                    pVar6.invoke((eo.d) p1Var4.getF182175a(), (eo.d) p1Var5.getF182175a());
                }
                p1Var6.setValue(Boolean.FALSE);
                p1Var3.setValue(null);
                return Unit.INSTANCE;
            case 25:
                p3.p1 p1Var7 = (p3.p1) obj5;
                int iIntValue = ((Integer) obj).intValue();
                float f14 = i3.x3.f90191a;
                p1Var7.setValue(Boolean.valueOf(!((Boolean) p1Var7.getF182175a()).booleanValue()));
                ge1.b.T((o53.b0) obj6, null, null, new z3((e2.i0) obj4, iIntValue, (j23.l) obj3, (l3.h0) obj2, null), 3);
                return Unit.INSTANCE;
            case 26:
                li0.f fVar = (li0.f) obj4;
                e2.f0 f0Var7 = (e2.f0) obj;
                f0Var7.getClass();
                p003ji0.o.a(f0Var7, (zc.d) obj6, ((Boolean) ((p3.p1) obj3).getF182175a()).booleanValue(), (u2.h) obj5, fVar, null, new i5((x3) obj2, i19));
                return Unit.INSTANCE;
            case 27:
                o53.b0 b0Var2 = (o53.b0) obj6;
                gv0.d dVar4 = (gv0.d) obj5;
                Activity activity = (Activity) obj4;
                c.q qVar4 = (c.q) obj3;
                uu0.c cVar5 = (uu0.c) obj2;
                pu0.b bVar7 = (pu0.b) obj;
                bVar7.getClass();
                String str5 = bVar7.f141183a;
                if (str5 != null) {
                    ge1.b.T(b0Var2, null, null, new iv0.y.c(dVar4, str5, activity, qVar4, cVar5, null), 3);
                }
                return Unit.INSTANCE;
            case 28:
                ((p3.p1) obj5).setValue(Boolean.TRUE);
                a2.a.b bVar8 = new a2.a.b();
                ge1.b.T((o53.b0) obj4, null, null, new j02.e.a((a2.j) obj3, bVar8, null), 3);
                ((p3.p1) obj2).setValue(bVar8);
                ((e23.l) obj6).invoke((n4.c) obj);
                return Unit.INSTANCE;
            default:
                ge1.b.T((o53.b0) obj6, null, null, new j02.l((j02.m) obj4, (p3.p1) obj3, (p3.p1) obj2, null), 3);
                ((j02.k) obj5).invoke((n4.c) obj);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i14) {
        this.f3917a = i14;
        this.f3918b = obj;
        this.f3919c = obj2;
        this.f3920d = obj3;
        this.f3921e = obj4;
        this.f3922f = obj5;
    }

    public /* synthetic */ e1(String str, Context context, String str2, p005kotlin.jvm.internal.r0 r0Var, String str3) {
        this.f3917a = 16;
        this.f3920d = str;
        this.f3918b = context;
        this.f3919c = str2;
        this.f3921e = r0Var;
        this.f3922f = str3;
    }
}
