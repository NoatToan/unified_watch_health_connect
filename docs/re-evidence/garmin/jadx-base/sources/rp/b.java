package rp;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.n0;
import androidx.recyclerview.widget.RecyclerView;
import c80.w;
import c80.w0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.ManageFamilyActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.i2;
import e23.l;
import e23.p;
import e23.q;
import e32.o;
import g22.k;
import gw2.i;
import gw2.j;
import j70.a0;
import j70.z;
import java.io.Serializable;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l72.i3;
import lc.k0;
import lc.m0;
import lc.u0;
import nc.n;
import nr.t;
import o53.b0;
import o72.m1;
import o82.g;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.y;
import p3.n1;
import p3.p1;
import p3.x1;
import p3.x3;
import q03.v;
import r1.q2;
import rk0.a1;
import rr0.m;
import s70.e2;
import s9.h;
import sg0.d0;
import sg0.f0;
import sg0.o0;
import sg0.p0;
import sg0.q0;
import sg0.s0;
import sz0.u;
import t21.v0;
import tn.r;
import x5.l0;
import y70.x;
import yc.z0;
import zd0.g1;
import zd0.i0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f154052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f154053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f154054d;

    public /* synthetic */ b(r rVar, Context context, String str, String str2) {
        this.f154051a = 24;
        this.f154052b = context;
        this.f154053c = str;
        this.f154054d = str2;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:108:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:241:0x0a1f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // e23.l
    public final Object invoke(Object obj) {
        mp.b bVar;
        o oVar;
        g gVar;
        Bundle extras;
        Serializable serializable;
        Bundle extras2;
        Serializable serializable2;
        Bundle extras3;
        Serializable serializable3;
        int iC;
        sv2.d dVar;
        sv2.a aVar;
        byte[] bArrQ;
        int i14 = this.f154051a;
        int i15 = 29;
        int i16 = 6;
        int i17 = -1;
        int i18 = 4;
        int i19 = 2;
        int i24 = 3;
        int i25 = 0;
        int i26 = 1;
        DateTime dateTime = null;
        Number number = null;
        i0 i0VarR = null;
        i0 i0VarR2 = null;
        dateTime = null;
        Object obj2 = this.f154052b;
        Object obj3 = this.f154054d;
        Object obj4 = this.f154053c;
        switch (i14) {
            case 0:
                e23.a aVar2 = (e23.a) obj2;
                np.c cVar = (np.c) obj4;
                p pVar = (p) obj3;
                f.a aVar3 = (f.a) obj;
                aVar3.getClass();
                int i27 = aVar3.f67585a;
                Intent intent = aVar3.f67586b;
                if (i27 != -1) {
                    aVar2.invoke();
                } else {
                    if (intent == null || (extras3 = intent.getExtras()) == null) {
                        bVar = null;
                    } else {
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable3 = extras3.getSerializable("EXTRA_SELECTED_ACTIVITY", mp.b.class);
                        } else {
                            Serializable serializable4 = extras3.getSerializable("EXTRA_SELECTED_ACTIVITY");
                            if (!(serializable4 instanceof mp.b)) {
                                serializable4 = null;
                            }
                            serializable3 = (mp.b) serializable4;
                        }
                        bVar = (mp.b) serializable3;
                    }
                    if (bVar != null) {
                        cVar.y4(bVar);
                    }
                    if (intent == null || (extras2 = intent.getExtras()) == null) {
                        oVar = null;
                    } else {
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable2 = extras2.getSerializable("EXTRA_SUMMARY_TIME_INTERVAL", o.class);
                        } else {
                            Serializable serializable5 = extras2.getSerializable("EXTRA_SUMMARY_TIME_INTERVAL");
                            if (!(serializable5 instanceof o)) {
                                serializable5 = null;
                            }
                            serializable2 = (o) serializable5;
                        }
                        oVar = (o) serializable2;
                    }
                    if (oVar != null) {
                        switch (sp.b.f160498b[oVar.ordinal()]) {
                            case 1:
                                gVar = g.f130850c;
                                break;
                            case 2:
                                gVar = g.f130851d;
                                break;
                            case 3:
                                gVar = g.f130857j;
                                break;
                            case 4:
                                gVar = g.f130853f;
                                break;
                            case 5:
                                gVar = g.f130859l;
                                break;
                            case 6:
                            case 7:
                                gVar = g.f130856i;
                                break;
                            case 8:
                                gVar = g.f130849b;
                                break;
                            case 9:
                                gVar = g.f130854g;
                                break;
                            case 10:
                                gVar = g.f130854g;
                                break;
                            case 11:
                            case 12:
                                gVar = g.f130855h;
                                break;
                            default:
                                u0.r();
                                return null;
                        }
                    } else {
                        gVar = null;
                    }
                    if (intent != null && (extras = intent.getExtras()) != null) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = extras.getSerializable("EXTRA_INITIAL_DATE", DateTime.class);
                        } else {
                            Serializable serializable6 = extras.getSerializable("EXTRA_INITIAL_DATE");
                            serializable = (DateTime) (serializable6 instanceof DateTime ? serializable6 : null);
                        }
                        dateTime = (DateTime) serializable;
                    }
                    if (dateTime != null && gVar != null) {
                        LocalDate localDate = dateTime.toLocalDate();
                        localDate.getClass();
                        pVar.invoke(gVar, k.t(localDate));
                    }
                }
                return Unit.INSTANCE;
            case 1:
                im.k kVar = (im.k) obj2;
                x3 x3Var = (x3) obj3;
                ((RecyclerView) obj).getClass();
                List<List<nr.b>> list = ((rr.k) ((p1) obj4).getF182175a()) == rr.k.TIME ? ((t.a) x3Var.getF182175a()).f127322b : ((t.a) x3Var.getF182175a()).f127323c;
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : list) {
                    if (!((List) obj5).isEmpty()) {
                        arrayList.add(obj5);
                    }
                }
                kVar.t(arrayList);
                return Unit.INSTANCE;
            case 2:
                Integer num = (Integer) obj2;
                Context context = (Context) obj4;
                l lVar = (l) obj3;
                l0 l0Var = (l0) obj;
                l0Var.getClass();
                s5.c cVar2 = l0Var.f188878a;
                if (num != null) {
                    String str = cVar2.f157138b;
                    if (str.length() <= num.intValue() && num.intValue() > 0 && TextUtils.isDigitsOnly(str) && (m.d(context, str) || ((iC = m.c(str)) >= 0 && iC < 10081))) {
                        lVar.invoke(cVar2.f157138b);
                    }
                } else {
                    lVar.invoke(cVar2.f157138b);
                }
                return Unit.INSTANCE;
            case 3:
                rz.a aVar4 = (rz.a) obj2;
                ((CustomBarChart) obj).getClass();
                aVar4.c();
                qz.a.b(aVar4, (List) obj4, ((x00.a) obj3).f188233a.getString(R.string.intensity_lbl_no_im_data), 4);
                return Unit.INSTANCE;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((q) obj2).invoke(bool, (Long) obj4, (String) obj3);
                return Unit.INSTANCE;
            case 5:
                p1 p1Var = (p1) obj4;
                n1 n1Var = (n1) obj3;
                LocalDate localDate2 = (LocalDate) obj;
                localDate2.getClass();
                p1Var.setValue(localDate2);
                Iterator<E> it = ((i53.c) obj2).iterator();
                while (it.hasNext()) {
                    if (((jv1.q) it.next()).f101113a.equals((LocalDate) p1Var.getF182175a())) {
                        i17 = i25;
                        n1Var.t(i17);
                        return Unit.INSTANCE;
                    }
                    i25++;
                }
                n1Var.t(i17);
                return Unit.INSTANCE;
            case 6:
                dx2.c cVar3 = (dx2.c) obj2;
                Map<String, ? extends Object> map = (Map) obj4;
                rv2.a aVar5 = (rv2.a) obj3;
                int i28 = rv2.e.f154771b;
                cx2.b.a aVar6 = cx2.b.f56665a;
                Object obj6 = map.get(i.ROW_ID.f79975a);
                String string = obj6 != null ? obj6.toString() : null;
                aVar6.getClass();
                Object objF = cVar3.f61484a.f(j.WATCH_FACE_GRID, map, cx2.b.a.c(string));
                try {
                    if (!(objF instanceof sv2.d)) {
                        objF = null;
                    }
                    dVar = (sv2.d) objF;
                    break;
                } catch (ClassCastException unused) {
                    dVar = null;
                }
                if (dVar != null) {
                    List<sv2.b> list2 = dVar.f161039a;
                    if (!list2.isEmpty()) {
                        Collection<sv2.a> collection = aVar5.f10698a.f10426f;
                        collection.getClass();
                        ArrayList arrayList2 = new ArrayList(y.r(collection, 10));
                        for (sv2.a aVar7 : collection) {
                            aVar7.getClass();
                            int i29 = aVar7.f161030a;
                            String str2 = aVar7.f161031b;
                            boolean z14 = aVar7.f161032c;
                            str2.getClass();
                            arrayList2.add(new sv2.a(i29, str2, z14));
                        }
                        for (sv2.b bVar2 : list2) {
                            Iterator it3 = arrayList2.iterator();
                            do {
                                if (!it3.hasNext()) {
                                    n23.j.s("Collection contains no element matching the predicate.");
                                    return null;
                                }
                                aVar = (sv2.a) it3.next();
                            } while (aVar.f161030a != bVar2.f161033a);
                            aVar.f161032c = bVar2.f161034b;
                        }
                        po.g gVar2 = new po.g(aVar5, 15);
                        aVar5.getClass();
                        aVar5.f10698a.b((List<T>) h0.N0(arrayList2, new rv2.a.d()), gVar2);
                    }
                }
                return Unit.INSTANCE;
            case 7:
                b0 b0Var = (b0) obj2;
                ly0.r rVar = (ly0.r) obj4;
                ry0.j jVar = (ry0.j) obj3;
                f.a aVar8 = (f.a) obj;
                aVar8.getClass();
                if (aVar8.f67585a == -1) {
                    ge1.b.T(b0Var, null, null, new ry0.i.c(rVar, jVar, null), 3);
                }
                return Unit.INSTANCE;
            case 8:
                r70.q qVar = (r70.q) obj2;
                Context context2 = (Context) obj4;
                x xVar = ((e2) obj3).f157690a;
                a0 a0Var = (a0) obj;
                a0Var.getClass();
                Object obj7 = a0Var.f97489o;
                String str3 = a0Var.f97476b;
                if (a0Var.equals(a0.f.f97500s) || a0Var.equals(a0.g.f97501s) || a0Var.equals(a0.e.f97499s)) {
                    qVar.a(new DashboardRoute.HomeSettings(false, 1, (p005kotlin.jvm.internal.j) null));
                } else if (a0Var.equals(a0.a.f97490s)) {
                    Bundle bundle = new Bundle();
                    List<String> listJ2 = xVar.f194690c.J2();
                    ArrayList arrayList3 = new ArrayList(y.r(listJ2, 10));
                    Iterator<T> it4 = listJ2.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(new j70.y((String) it4.next(), null, 2, null));
                    }
                    bundle.putBoolean("SHOW_RESET_HOME", z.a(arrayList3));
                    bundle.putBoolean("SHOW_SLEEP_COACH", bo1.a.a().c().x0());
                    HelpActivity.a.e(HelpActivity.f36653a, context2, ro0.l.HOME_SETTINGS, null, bundle, 4);
                } else if (a0Var.equals(a0.c.f97491s)) {
                    context2.getClass();
                    if (str3 != null) {
                        g1 g1Var = xVar.f194691d;
                        obj7.getClass();
                        i0VarR = g1Var.r(context2, str3, (w0) obj7);
                    }
                    if (i0VarR != null) {
                        qVar.c(i0VarR, o70.f.WHATS_NEW.a());
                    }
                } else {
                    if (!(a0Var instanceof a0.d)) {
                        u0.r();
                        return null;
                    }
                    context2.getClass();
                    if (str3 != null) {
                        g1 g1Var2 = xVar.f194691d;
                        obj7.getClass();
                        i0VarR2 = g1Var2.r(context2, str3, (w0) obj7);
                    }
                    if (i0VarR2 != null) {
                        qVar.c(i0VarR2, o70.f.WHATS_NEW.a());
                    }
                }
                return Unit.INSTANCE;
            case 9:
                n0 n0Var = (n0) obj2;
                androidx.core.view.q qVar2 = new androidx.core.view.q(8, (androidx.lifecycle.b0.a) obj4, (p1) obj3);
                n0Var.getF158016a().a(qVar2);
                return new s9.d(n0Var, qVar2);
            case 10:
                n0 n0Var2 = (n0) obj2;
                r0 r0Var = new r0();
                androidx.core.view.p pVar2 = new androidx.core.view.p((h) obj4, r0Var, (l) obj3, i19);
                n0Var2.getF158016a().a(pVar2);
                return new s9.e.b(n0Var2, pVar2, r0Var);
            case 11:
                n0 n0Var3 = (n0) obj2;
                r0 r0Var2 = new r0();
                androidx.core.view.p pVar3 = new androidx.core.view.p((s9.g) obj4, r0Var2, (l) obj3, 1);
                n0Var3.getF158016a().a(pVar3);
                return new s9.e.a(n0Var3, pVar3, r0Var2);
            case 12:
                sa2.h hVar = (sa2.h) obj4;
                p<? super Boolean, ? super String, Unit> pVar4 = (p) obj3;
                qa2.d dVar2 = (qa2.d) obj;
                if (dVar2 != null) {
                    String status = dVar2.getProgress().getStatus();
                    if (s.g(status, qa2.k.READY.f143942a)) {
                        sa2.h.f158334i.getClass();
                        hVar.e();
                        pVar4.invoke(Boolean.TRUE, qa2.k.SUCCESS.f143942a);
                    } else if (s.g(status, qa2.k.IN_PROGRESS.f143942a)) {
                        sa2.h.f158334i.getClass();
                        hVar.f(false, pVar4);
                    } else {
                        qa2.k kVar2 = qa2.k.DATA_NOT_FOUND;
                        if (s.g(status, kVar2.f143942a)) {
                            sa2.h.f158334i.getClass();
                            hVar.c();
                            pVar4.invoke(Boolean.FALSE, kVar2.f143942a);
                        } else {
                            sa2.h.f158334i.getClass();
                            hVar.c();
                            pVar4.invoke(Boolean.FALSE, qa2.k.GENERIC_ERROR.f143942a);
                        }
                    }
                } else {
                    sa2.h.f158334i.getClass();
                    hVar.c();
                    pVar4.invoke(Boolean.FALSE, qa2.k.GENERIC_ERROR.f143942a);
                }
                return Unit.INSTANCE;
            case 13:
                q qVar3 = (q) obj4;
                e23.a aVar9 = (e23.a) obj2;
                e23.a aVar10 = (e23.a) obj3;
                ti2.b bVar3 = (ti2.b) obj;
                bVar3.getClass();
                if (bVar3 instanceof ti2.b.C3087b) {
                    ti2.b.C3087b c3087b = (ti2.b.C3087b) bVar3;
                    qVar3.invoke(Long.valueOf(c3087b.f164595b), c3087b.f164596c, c3087b.f164597d);
                } else {
                    if (bVar3.equals(ti2.b.i.f164604a)) {
                        aVar9.invoke();
                        return Unit.INSTANCE;
                    }
                    if (bVar3.equals(ti2.b.e.f164600a)) {
                        aVar10.invoke();
                    }
                }
                return Unit.INSTANCE;
            case 14:
                ManageFamilyActivity manageFamilyActivity = (ManageFamilyActivity) obj4;
                Context context3 = (Context) obj3;
                k0 k0Var = (k0) obj;
                ManageFamilyActivity.a aVar11 = ManageFamilyActivity.f35178j;
                k0Var.getClass();
                final f0 f0VarDa = manageFamilyActivity.da();
                final q0 q0Var = new q0((e23.a) obj2, 1);
                final s0 s0Var = new s0(manageFamilyActivity, context3, i26);
                final s0 s0Var2 = new s0(manageFamilyActivity, context3, i19);
                final o0 o0Var = new o0(manageFamilyActivity, 3);
                final o0 o0Var2 = new o0(manageFamilyActivity, 4);
                final s0 s0Var3 = new s0(manageFamilyActivity, context3, i24);
                final s0 s0Var4 = new s0(manageFamilyActivity, context3, i18);
                final s0 s0Var5 = new s0(manageFamilyActivity, context3, 5);
                final a1 a1Var = new a1(14, manageFamilyActivity, context3);
                final o0 o0Var3 = new o0(manageFamilyActivity, 5);
                final p0 p0Var = new p0(manageFamilyActivity, i19);
                final p0 p0Var2 = new p0(manageFamilyActivity, i24);
                final s0 s0Var6 = new s0(manageFamilyActivity, context3, 0);
                f0VarDa.getClass();
                z3.e eVar = new z3.e(120020809, true, new e23.r() { // from class: sg0.e0
                    @Override // e23.r
                    public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11) {
                        q2.t((Integer) obj11, (r1.l) obj8, (lc.v) obj9);
                        x1 x1Var = p3.n.f135158a;
                        r.b(f0VarDa, s0Var, s0Var2, o0Var, o0Var2, s0Var3, s0Var4, s0Var5, a1Var, o0Var3, p0Var, p0Var2, s0Var6, q0Var, (p3.m) obj10, 0);
                        return Unit.INSTANCE;
                    }
                });
                p13.k0 k0Var2 = p13.k0.f134949a;
                k0Var2.getClass();
                n.a(k0Var, p005kotlin.jvm.internal.s0.f105811a.b(d0.class), k0Var2, j0.f134944a, null, null, null, null, eVar);
                return Unit.INSTANCE;
            case 15:
                gg1.o0 o0Var4 = (gg1.o0) obj2;
                p1 p1Var2 = (p1) obj4;
                p1 p1Var3 = (p1) obj3;
                w wVar = (w) obj;
                wVar.getClass();
                w wVar2 = ((sk0.n0) p1Var2.getF182175a()).f159767f;
                if (wVar != wVar2) {
                    sk0.n0 n0Var4 = (sk0.n0) p1Var2.getF182175a();
                    n0Var4.getClass();
                    o0Var4.getClass();
                    int i30 = sk0.n0.b.f159775a[wVar2.ordinal()];
                    if (i30 == 1) {
                        p1Var2.setValue(sk0.n0.b((sk0.n0) p1Var2.getF182175a(), null, null, null, null, null, wVar, null, null, null, null, false, null, null, 8159));
                    } else if (i30 != 2) {
                        if (i30 != 3) {
                            if (i30 != 4) {
                                u0.r();
                                return null;
                            }
                            if (s.g(n0Var4.f159770i, sk0.p.i())) {
                                p1Var2.setValue(sk0.n0.b((sk0.n0) p1Var2.getF182175a(), null, null, null, null, null, wVar, null, null, null, null, false, null, null, 8159));
                            } else {
                                p1Var3.setValue(wVar);
                            }
                        } else if (n0Var4.f159769h != null) {
                            p1Var3.setValue(wVar);
                        } else {
                            p1Var2.setValue(sk0.n0.b((sk0.n0) p1Var2.getF182175a(), null, null, null, null, null, wVar, null, null, null, null, false, null, null, 8159));
                        }
                    } else if (s.d(n0Var4.f159768g, sk0.p.h(n0Var4.f159762a, o0Var4))) {
                        p1Var2.setValue(sk0.n0.b((sk0.n0) p1Var2.getF182175a(), null, null, null, null, null, wVar, null, null, null, null, false, null, null, 8159));
                    } else {
                        p1Var3.setValue(wVar);
                    }
                }
                return Unit.INSTANCE;
            case 16:
                NumberFormat numberFormat = (NumberFormat) obj2;
                p1 p1Var4 = (p1) obj4;
                p1 p1Var5 = (p1) obj3;
                String str4 = (String) obj;
                str4.getClass();
                if (d53.w.J(str4)) {
                    p1Var4.setValue(sk0.o0.b((sk0.o0) p1Var4.getF182175a(), false, false, false, false, false, 15));
                    p1Var5.setValue(sk0.n0.b((sk0.n0) p1Var5.getF182175a(), null, null, null, null, null, null, null, null, null, null, false, null, null, 8063));
                } else {
                    uk0.i.f171830a.getClass();
                    try {
                        number = numberFormat.parse(str4);
                        break;
                    } catch (ParseException unused2) {
                    }
                    if (number != null) {
                        int iIntValue = number.intValue();
                        p1Var4.setValue(iIntValue >= 999999 ? sk0.o0.b((sk0.o0) p1Var4.getF182175a(), false, false, false, false, true, 15) : sk0.o0.b((sk0.o0) p1Var4.getF182175a(), false, false, false, false, false, 15));
                        e53.c.a aVar12 = e53.c.f63094b;
                        p1Var5.setValue(sk0.n0.b((sk0.n0) p1Var5.getF182175a(), null, null, null, null, null, null, null, Long.valueOf(e53.c.j(e53.e.e(iIntValue, e53.f.HOURS), e53.f.SECONDS)), null, null, false, null, null, 8063));
                    }
                }
                return Unit.INSTANCE;
            case 17:
                n82.f fVar = (n82.f) obj2;
                sm1.s sVar = (sm1.s) obj3;
                fVar.d((g) ((i53.f) obj4).get(((Integer) obj).intValue()));
                if (fVar.f124961b.a() != g.f130850c) {
                    sVar.x4(false);
                }
                return Unit.INSTANCE;
            case 18:
                ((CustomLineChart) obj).getClass();
                qz.a.b((tz.a) obj2, (jq1.g) obj4, (String) obj3, 4);
                return Unit.INSTANCE;
            case 19:
                u uVar = (u) obj2;
                vz0.b bVar4 = (vz0.b) obj4;
                uz0.b bVar5 = (uz0.b) obj3;
                g3 g3Var = (g3) obj;
                int i34 = u.E;
                g3Var.getClass();
                int i35 = u.b.f161516a[g3Var.f35300a.ordinal()];
                if (i35 == 1) {
                    g22.e.f(uVar);
                    g22.e.c(uVar);
                    String strD = com.airbnb.lottie.animation.keyframe.a.d(g3Var.f35303d, "joined group failed, exception: ");
                    i2.a aVar13 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar13.getClass();
                    i2.a.p(a2Var, "NotificationsFragment", strD);
                } else if (i35 == 2) {
                    g22.e.l(uVar);
                } else {
                    if (i35 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(uVar);
                    i2.a aVar14 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar14.getClass();
                    i2.a.b(a2Var2, "NotificationsFragment", "joined group succeeded");
                    if (uVar.isAdded() && bVar4 != null) {
                        sz0.i0 i0VarD7 = uVar.d7();
                        Context contextRequireContext = uVar.requireContext();
                        contextRequireContext.getClass();
                        i0VarD7.A4(contextRequireContext, bVar4, bVar5, false);
                    }
                }
                return Unit.INSTANCE;
            case 20:
                ta0.q0 q0Var2 = (ta0.q0) obj4;
                e23.a aVar15 = (e23.a) obj2;
                c.q qVar4 = (c.q) obj3;
                Map map2 = (Map) obj;
                map2.getClass();
                j22.b.f96736a.getClass();
                j22.f fVarD = j22.b.D(map2);
                ta0.p0.c("onActivityResult: requestLocationPermissionLauncher locationPermissionStatus[" + fVarD + "]");
                int i36 = ta0.p0.a.f163419c[fVarD.ordinal()];
                if (i36 == 1 || i36 == 2) {
                    q0Var2.y4();
                } else if (i36 == 3) {
                    aVar15.invoke();
                } else {
                    if (i36 != 4) {
                        u0.r();
                        return null;
                    }
                    ta0.p0.d(qVar4);
                }
                return Unit.INSTANCE;
            case 21:
                List list3 = (List) obj2;
                e2.f0 f0Var = (e2.f0) obj;
                f0Var.getClass();
                f0Var.a(list3.size(), null, new tg1.o.d(tg1.o.c.f164534a, list3), new z3.e(802480018, true, new tg1.o.e(list3, (l) obj4)));
                e2.f0.b(f0Var, null, new z3.e(-773444858, true, new v0((sg1.d) obj3, i19)), 3);
                return Unit.INSTANCE;
            case 22:
                int i37 = tn.m.f165476e;
                ((i3) obj).getClass();
                ((tn.m) obj2).f165479c.invoke((String) ((p1) obj3).getF182175a());
                ((m0) obj4).n();
                return Unit.INSTANCE;
            case 23:
                p5.k0 k0Var3 = (p5.k0) obj;
                int i38 = r.f165491f;
                k0Var3.getClass();
                ((r) obj2).getClass();
                oi0.b bVar6 = new oi0.b(new l22.a((Context) obj4), (String) obj3);
                bVar6.p();
                bVar6.k();
                bVar6.w();
                p5.h0.n(k0Var3, bVar6.f132238b);
                return Unit.INSTANCE;
            case 24:
                p5.k0 k0Var4 = (p5.k0) obj;
                int i39 = r.f165491f;
                k0Var4.getClass();
                oi0.b bVar7 = new oi0.b(new l22.a((Context) obj2), ((String) obj4) + StringUtils.SPACE + ((String) obj3));
                bVar7.p();
                bVar7.k();
                bVar7.w();
                p5.h0.n(k0Var4, bVar7.f132238b);
                return Unit.INSTANCE;
            case 25:
                zc.d dVar3 = (zc.d) obj2;
                tn.u uVar2 = (tn.u) obj4;
                wn.c cVar4 = (wn.c) obj3;
                e2.f0 f0Var2 = (e2.f0) obj;
                int i44 = tn.u.f165495e;
                f0Var2.getClass();
                if ((dVar3.d().f196385a instanceof z0.c) && dVar3.c().isEmpty()) {
                    e2.f0.b(f0Var2, null, new z3.e(453537662, true, new v0(uVar2, i18)), 3);
                } else {
                    tn.b.f165451a.getClass();
                    e2.f0.b(f0Var2, null, tn.b.f165452b, 3);
                }
                e2.f0.f(f0Var2, dVar3.b(), null, new z3.e(418390998, true, new ao1.f(i15, new z3.e(-1915203913, true, new m1(7, cVar4, uVar2)), dVar3)), 6);
                z0 z0Var = dVar3.d().f196387c;
                z0.b bVar8 = z0.b.f196664b;
                if (s.g(z0Var, bVar8)) {
                    e2.f0.b(f0Var2, null, new z3.e(-1114566399, true, new r22.g(dVar3, i24)), 3);
                }
                if (s.g(dVar3.d().f196385a, bVar8) && dVar3.c().getF134973e() > 20) {
                    tn.b.f165451a.getClass();
                    e2.f0.b(f0Var2, null, tn.b.f165454d, 3);
                }
                return Unit.INSTANCE;
            case 26:
                byte[] bArr = (byte[]) obj;
                Logger logger = tn2.w.f165679d;
                bArr.getClass();
                ((tn2.w) obj2).getClass();
                wq2.a.f186629a.getClass();
                e13.o oVarM = as2.h.m((ul2.c) obj4, wq2.a.a((byte) 0, (byte) -63), "");
                tn2.n nVar = new tn2.n(new tn2.m(i19), i26);
                int i45 = w03.b.f181178a;
                return new e13.o(new e13.o(oVarM, nVar), new tn2.n(new sy.i(16, (tn2.w.e.a) obj3, bArr), i25));
            case 27:
                tn2.w wVar3 = (tn2.w) obj2;
                ul2.c cVar5 = (ul2.c) obj4;
                byte[] bArr2 = (byte[]) obj3;
                Boolean bool2 = (Boolean) obj;
                Logger logger2 = tn2.w.f165679d;
                bool2.getClass();
                if (!bool2.booleanValue()) {
                    return b13.e.f14433a;
                }
                wVar3.getClass();
                pn2.a.f138690a.getClass();
                switch (tn2.w.g.f165730b[pn2.a.e().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        tn2.f.f165551a.getClass();
                        byte[] bArrA = hb2.d.a("1006");
                        bArrA.getClass();
                        byte[] bArrQ2 = p13.s.q(bArrA, bArr2);
                        byte[] bArrA2 = hb2.d.a("018B00018000");
                        bArrA2.getClass();
                        bArrQ = p13.s.q(bArrQ2, bArrA2);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        tn2.f.f165551a.getClass();
                        byte[] bArrA3 = hb2.d.a("1006");
                        bArrA3.getClass();
                        byte[] bArrQ3 = p13.s.q(bArrA3, bArr2);
                        byte[] bArrA4 = hb2.d.a("0117AA018000");
                        bArrA4.getClass();
                        bArrQ = p13.s.q(bArrQ3, bArrA4);
                        break;
                    default:
                        u0.r();
                        return null;
                }
                e13.o oVarM2 = as2.h.m(cVar5, tn2.w.q(bArrQ), "");
                r22.a aVar16 = new r22.a(new t52.c(i15), 26);
                int i46 = w03.b.f181178a;
                v oVar2 = new e13.o(new e13.o(oVarM2, aVar16), new r22.a(new tn2.l(wVar3, i25), 27));
                return oVar2 instanceof x03.a ? ((x03.a) oVar2).a() : new b13.g(oVar2);
            case 28:
                tn2.r0 r0Var3 = (tn2.r0) obj2;
                String str5 = (String) obj4;
                pn2.t tVar = (pn2.t) obj3;
                tn2.w.f fVar2 = (tn2.w.f) obj;
                Logger logger3 = tn2.r0.f165631n;
                fVar2.getClass();
                tn2.f fVar3 = tn2.f.f165551a;
                byte[] bArr3 = fVar2.f165719a;
                bArr3.getClass();
                fVar3.getClass();
                String strA = tn2.f.a(bArr3);
                Byte b14 = fVar2.f165725g;
                b14.getClass();
                String strA2 = tn2.f.a(new byte[]{b14.byteValue()});
                pn2.n nVar2 = r0Var3.f165637f;
                nVar2.getClass();
                qn2.t tVarB = nVar2.b(qn2.u.f145900a.b(), strA2, null);
                pn2.o oVar3 = r0Var3.f165638g;
                String lastNameKana = tVar.getLastNameKana();
                String firstNameKana = tVar.getFirstNameKana();
                String birthday = tVar.getBirthday();
                String gender = tVar.getGender();
                String mobilePhoneNumber = tVar.getMobilePhoneNumber();
                oVar3.getClass();
                str5.getClass();
                lastNameKana.getClass();
                firstNameKana.getClass();
                birthday.getClass();
                gender.getClass();
                mobilePhoneNumber.getClass();
                pn2.m<qn2.t, qn2.e> mVar = new pn2.m<>(tVarB, new qn2.e(str5, new pn2.r(new pn2.b(new pn2.t(lastNameKana, firstNameKana, birthday, gender, mobilePhoneNumber)), null, null, null, null)));
                mn2.b bVar9 = r0Var3.f165633b;
                String strValueOf = String.valueOf(r0Var3.f165632a.f165682c);
                pn2.a.f138690a.getClass();
                String str6 = pn2.a.e().f138762b;
                Logger logger4 = mn2.j.f119822a;
                bVar9.getClass();
                strValueOf.getClass();
                str6.getClass();
                q03.r<c83.a0<pn2.p<pn2.d>>> rVarK = bVar9.k(strValueOf, strA, str6, mVar);
                mn2.e eVar2 = new mn2.e(new mn2.c(bVar9, strValueOf, strA, str6, mVar, 12), 9);
                rVarK.getClass();
                int i47 = w03.b.f181178a;
                return new z03.o(new e13.k(new e13.j(rVarK, eVar2), new tn2.k0(new tn2.m(25), 11)), new tn2.k0(new tn2.h0(r0Var3, str5, i16), 12));
            default:
                com.garmin.device.nfc.h[] hVarArr = (com.garmin.device.nfc.h[]) obj;
                Logger logger5 = tn2.r0.f165631n;
                hVarArr.getClass();
                ((l) obj2).invoke(90);
                com.garmin.device.nfc.h[] hVarArr2 = (com.garmin.device.nfc.h[]) p13.s.t(hVarArr, tn2.r0.p((rn2.i) obj3));
                e13.p pVarB = ks2.e.b(((tn2.r0) obj4).f165632a.f165680a);
                tn2.n nVar3 = new tn2.n(new tn2.t(hVarArr2, i25), 24);
                int i48 = w03.b.f181178a;
                return new e13.k(pVarB, nVar3);
        }
    }

    public /* synthetic */ b(Object obj, e23.a aVar, Object obj2, int i14) {
        this.f154051a = i14;
        this.f154053c = obj;
        this.f154052b = aVar;
        this.f154054d = obj2;
    }

    public /* synthetic */ b(Object obj, int i14, Object obj2, Object obj3) {
        this.f154051a = i14;
        this.f154052b = obj;
        this.f154053c = obj2;
        this.f154054d = obj3;
    }
}
