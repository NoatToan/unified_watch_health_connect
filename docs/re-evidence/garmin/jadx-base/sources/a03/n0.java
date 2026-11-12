package a03;

import android.app.Dialog;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.lifecycle.v1;
import ca0.g4;
import ca0.h4;
import ca0.q2;
import ca0.u1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.ui.ElectronicShiftingDataActivity;
import com.garmin.android.apps.connectmobile.charts.mpchart3.legend.CustomLegendView;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.g1;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.WifiSetup;
import com.garmin.realtimesettings.app.baseviews.views.StyledTextView;
import com.google.android.gms.maps.StreetViewPanoramaView;
import com.google.maps.android.compose.streetview.StreetViewKt;
import i3.fe;
import i3.mc;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.l1;
import p3.n1;
import p3.p1;
import r53.p2;
import yc.z0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f139e;

    public /* synthetic */ n0(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f135a = i14;
        this.f136b = obj;
        this.f137c = obj2;
        this.f138d = obj3;
        this.f139e = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) throws IOException {
        Object[] objArr;
        bw2.g gVar;
        Object value;
        int i14;
        Object value2;
        int i15 = this.f135a;
        String strF = "";
        int i16 = 4;
        final int i17 = 2;
        int i18 = 3;
        final int i19 = 0;
        jVar = null;
        jVar = null;
        ca0.j jVar = null;
        final int i24 = 1;
        Object obj2 = this.f138d;
        Object obj3 = this.f139e;
        Object obj4 = this.f137c;
        Object obj5 = this.f136b;
        switch (i15) {
            case 0:
                r0 r0Var = (r0) obj5;
                a aVar = (a) obj2;
                z zVar = (z) obj3;
                g6.m mVar = (g6.m) obj;
                r0Var.getClass();
                Map mapD = r0Var.d();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj6 : (Set) obj4) {
                    Float f14 = (Float) zVar.invoke(obj6, mVar);
                    if (f14 != null) {
                        linkedHashMap.put(obj6, f14);
                    }
                }
                if (!p005kotlin.jvm.internal.s.g(mapD, linkedHashMap)) {
                    Object f182175a = r0Var.f178i.getF182175a();
                    boolean zIsEmpty = r0Var.d().isEmpty();
                    r0Var.f184o.setValue(linkedHashMap);
                    if (zIsEmpty) {
                        Object f182175a2 = r0Var.f177h.getF182175a();
                        objArr = ((Float) r0Var.d().get(f182175a2)) != null;
                        if (objArr != false) {
                            z53.b bVar = r0Var.f174e.f75b;
                            if (bVar.f()) {
                                try {
                                    r0Var.g(f182175a2);
                                    bVar.e(null);
                                } catch (Throwable th3) {
                                    bVar.e(null);
                                    throw th3;
                                }
                            }
                        }
                    } else {
                        objArr = true;
                    }
                    if (((objArr == true && zIsEmpty) ? 0 : 1) != 0 && aVar != null) {
                        aVar.a(f182175a, mapD, linkedHashMap);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                a11.i iVar = (a11.i) obj5;
                double dDoubleValue = ((Double) obj).doubleValue();
                ((l1) obj4).u(dDoubleValue);
                ((n1) obj2).t(a11.q.c(dDoubleValue, iVar));
                ((n1) obj3).t(a11.q.b(dDoubleValue, iVar));
                return Unit.INSTANCE;
            case 2:
                zc0.c cVar = (zc0.c) obj5;
                String str = (String) obj4;
                b.u uVar = (b.u) obj2;
                lc.m0 m0Var = (lc.m0) obj3;
                lc.k0 k0Var = (lc.k0) obj;
                k0Var.getClass();
                z3.e eVar = new z3.e(-286299032, true, new ad0.b(cVar, str, uVar, m0Var));
                p13.k0 k0Var2 = p13.k0.f134949a;
                k0Var2.getClass();
                p13.j0 j0Var = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                nc.n.a(k0Var, t0Var.b(ad0.a.c.class), k0Var2, j0Var, null, null, null, null, eVar);
                nc.n.a(k0Var, t0Var.b(ad0.a.b.class), k0Var2, j0Var, null, null, null, null, new z3.e(1150896721, true, new ad0.b(cVar, str, m0Var, uVar)));
                return Unit.INSTANCE;
            case 3:
                zc.d dVar = (zc.d) obj4;
                e23.l lVar = (e23.l) obj2;
                e23.l lVar2 = (e23.l) obj3;
                e2.f0 f0Var = (e2.f0) obj;
                f0Var.getClass();
                int length = d53.w.i0(((u2.h) obj5).b().f167839c).length();
                if (length == 1) {
                    an0.a.f4456a.getClass();
                    e2.f0.b(f0Var, null, an0.a.f4457b, 3);
                } else if (2 <= length && length <= Integer.MAX_VALUE) {
                    if (dVar.d().f196390f && dVar.b() == 0) {
                        an0.a.f4456a.getClass();
                        e2.f0.b(f0Var, null, an0.a.f4458c, 3);
                    } else {
                        e2.f0.f(f0Var, dVar.b(), null, new z3.e(1121470760, true, new aa2.r(i18, lVar, dVar, lVar2)), 6);
                        if (p005kotlin.jvm.internal.s.g(dVar.d().f196387c, z0.b.f196664b)) {
                            an0.a.f4456a.getClass();
                            e2.f0.b(f0Var, null, an0.a.f4459d, 3);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 4:
                int i25 = aw2.a.f13609c;
                ((aw2.a) obj5).j((dx2.c) obj4, (Map) obj2, (zw2.f) obj3);
                return Unit.INSTANCE;
            case 5:
                ArrayList arrayList = (ArrayList) obj5;
                e2.f0 f0Var2 = (e2.f0) obj;
                f0Var2.getClass();
                f0Var2.a(arrayList.size(), null, new b40.b.C0221b(arrayList), new z3.e(2039820996, true, new b40.b.c(arrayList, (List) obj4, (e23.l) obj2, (r30.a) obj3)));
                return Unit.INSTANCE;
            case 6:
                DateTime dateTime = (DateTime) obj5;
                DateTime dateTime2 = (DateTime) obj4;
                o82.g gVar2 = (o82.g) obj2;
                a71.e eVar2 = (a71.e) obj3;
                FrameLayout frameLayout = (FrameLayout) obj;
                frameLayout.getClass();
                CustomLineChart customLineChart = (CustomLineChart) frameLayout.findViewById(R.id.acute_load_summary_chart);
                if (customLineChart != null) {
                    CustomLegendView customLegendView = (CustomLegendView) frameLayout.findViewById(R.id.view_custom_legend);
                    customLegendView.getClass();
                    customLegendView.setVisibility(0);
                    View viewFindViewById = frameLayout.findViewById(R.id.chart_chronic_option);
                    viewFindViewById.getClass();
                    viewFindViewById.setVisibility(8);
                    Context context = customLineChart.getContext();
                    context.getClass();
                    tz.a aVar2 = new tz.a(customLineChart, new b71.f(context, dateTime, dateTime2, gVar2), new b71.g(customLineChart, dateTime, dateTime2), new k00.m(customLineChart), null, customLegendView, 16, null);
                    aVar2.c();
                    qz.a.b(aVar2, eVar2, frameLayout.getContext().getString(R.string.txt_empty_page_no_data), 4);
                }
                return Unit.INSTANCE;
            case 7:
                e23.l lVar3 = (e23.l) obj5;
                o53.b0 b0Var = (o53.b0) obj4;
                p1 p1Var = (p1) obj2;
                i2.a aVar3 = (i2.a) obj3;
                m4.g0 g0Var = (m4.g0) obj;
                b82.t0 t0Var2 = b82.t0.f16792a;
                g0Var.getClass();
                Object[] objArr2 = !((Boolean) p1Var.getF182175a()).booleanValue() && g0Var.a();
                if (((Boolean) p1Var.getF182175a()).booleanValue() && !g0Var.a()) {
                    i19 = 1;
                }
                if (objArr2 == true) {
                    if (lVar3 != null) {
                        lVar3.invoke(b82.t0.a.ON_FOCUS);
                    }
                    ge1.b.T(b0Var, null, null, new b82.t0.c(aVar3, null), 3);
                } else if (i19 != 0 && lVar3 != null) {
                    lVar3.invoke(b82.t0.a.ON_FOCUS_LOST);
                }
                p1Var.setValue(Boolean.valueOf(g0Var.a()));
                return Unit.INSTANCE;
            case 8:
                Context context2 = (Context) obj4;
                ZipInputStream zipInputStream = (ZipInputStream) obj3;
                String name = ((ZipEntry) obj).getName();
                name.getClass();
                String str2 = (String) p13.h0.m0(d53.w.W(name, new String[]{"/"}));
                bu.f.f21180a.getClass();
                Path pathH = bu.f.h((bu.h) obj5, str2);
                File filesDir = context2.getFilesDir();
                Path parent = pathH.getParent();
                parent.getClass();
                new File(filesDir, parent.toString()).mkdirs();
                FileOutputStream fileOutputStream = new FileOutputStream(new File(context2.getFilesDir(), pathH.toString()));
                try {
                    dh.b.p(zipInputStream, fileOutputStream, 8192);
                    fileOutputStream.close();
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.b(a2Var, "AnnualReportRemoteResourceManager", "Saving " + str2 + " to internal path " + pathH);
                    return str2;
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        jg.b.l(fileOutputStream, th4);
                        throw th5;
                    }
                }
            case 9:
                bv2.l lVar4 = (bv2.l) obj5;
                int i26 = bv2.l.f21526g;
                lVar4.j((dx2.c) obj4, (Map) obj2, null);
                x53.c cVar2 = o53.s0.f129406a;
                ge1.b.T(o53.c0.a(u53.o.f168762a), null, null, new bv2.l.a((zw2.e) obj3, lVar4, null), 3);
                return Unit.INSTANCE;
            case 10:
                bw2.h hVar = (bw2.h) obj5;
                bw2.i iVar2 = (bw2.i) obj4;
                dx2.c cVar3 = (dx2.c) obj2;
                Map<String, ? extends Object> map = (Map) obj3;
                AppCompatImageView appCompatImageView = hVar.f21596c;
                zw2.g.c cVarI4 = cVar3.I4(map);
                com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
                cx2.g.f(appCompatImageView, cVarI4, com.garmin.realtimesettings.app.initialization.b.f52593e, 4);
                StyledTextView styledTextView = hVar.f21597d;
                String strF2 = iVar2.f(cVar3, map);
                if (strF2.length() == 0) {
                    hVar.f21594a.d(null, "Did not find the translation for Row ID: " + map.get(gw2.i.ROW_ID.f79975a));
                    hVar.f21595b.setVisibility(8);
                }
                styledTextView.setText(strF2);
                hVar.j(cVar3, map, null);
                SwitchCompat switchCompat = hVar.f21599f;
                String strA5 = cVar3.a5(map);
                if (strA5.equals("HIDDEN") || strA5.equals("DISABLED")) {
                    switchCompat.setEnabled(false);
                } else {
                    switchCompat.setEnabled(true);
                }
                hVar.k(iVar2, cVar3, map);
                StyledTextView styledTextView2 = hVar.f21598e;
                gw2.j jVar2 = gw2.j.SWITCH;
                jVar2.getClass();
                Object objF = cVar3.f61484a.f(jVar2, map, Integer.parseInt(String.valueOf(map.get(gw2.i.ROW_ID.f79975a))));
                try {
                    if (!(objF instanceof bw2.g)) {
                        objF = null;
                    }
                    gVar = (bw2.g) objF;
                    break;
                } catch (ClassCastException unused) {
                    gVar = null;
                }
                tv2.c cVar4 = gVar != null ? gVar.f21593b : null;
                if (cVar4 != null) {
                    String strB = iVar2.b(cVar4);
                    if (strB.length() > 0) {
                        strF = strB;
                    }
                }
                cx2.g.g(styledTextView2, strF);
                return Unit.INSTANCE;
            case 11:
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                e23.l lVar5 = (e23.l) obj2;
                p1 p1Var2 = (p1) obj3;
                b82.t0.a aVar5 = (b82.t0.a) obj;
                aVar5.getClass();
                int i27 = c51.a.C0354a.f24503a[aVar5.ordinal()];
                if (i27 == 1) {
                    if (p005kotlin.jvm.internal.s.g(str3, str4)) {
                        lVar5.invoke("");
                    }
                    p1Var2.setValue(Boolean.TRUE);
                } else {
                    if (i27 != 2) {
                        lc.u0.r();
                        return null;
                    }
                    if (str3.length() == 0) {
                        lVar5.invoke(str4);
                    }
                    p1Var2.setValue(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            case 12:
                e23.a aVar6 = (e23.a) obj4;
                lc.k0 k0Var3 = (lc.k0) obj;
                k0Var3.getClass();
                z3.e eVar3 = new z3.e(724028908, true, new ca0.a((lc.m0) obj5, aVar6, i19));
                p13.k0 k0Var4 = p13.k0.f134949a;
                k0Var4.getClass();
                p13.j0 j0Var2 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                nc.n.a(k0Var3, t0Var3.b(ca0.d.b.class), k0Var4, j0Var2, null, null, null, null, eVar3);
                nc.n.a(k0Var3, t0Var3.b(ca0.d.c.class), k0Var4, j0Var2, null, null, null, null, new z3.e(504543701, true, new aa2.r(6, (e23.l) obj3, (u1) obj2, aVar6)));
                return Unit.INSTANCE;
            case 13:
                fa0.h hVar2 = (fa0.h) obj5;
                lc.m0 m0Var2 = (lc.m0) obj2;
                c50.f fVar = (c50.f) obj3;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                q92.x xVarValueOf = q92.x.valueOf(((ca0.j.c) obj4).f26293a);
                hVar2.getClass();
                xVarValueOf.getClass();
                p2 p2Var = hVar2.f70132n;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, new fa0.c(false, null, null, null, null, 31, null)));
                List list = (List) hVar2.f70131m.f150540a.getValue();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i19 = -1;
                        } else if (q92.x.valueOf(((ca0.j.c) it.next()).f26293a) != xVarValueOf) {
                            i19++;
                        }
                    }
                    if (i19 != -1 && (i14 = i19 + 1) < list.size()) {
                        jVar = (ca0.j) list.get(i14);
                    }
                }
                if (jVar == null) {
                    fVar.invoke(Boolean.valueOf(hVar2.f70119a), bool);
                } else if (zBooleanValue) {
                    m0Var2.h(zf.b.G(m0Var2), jVar);
                } else {
                    lc.y.l(m0Var2, jVar);
                }
                return Unit.INSTANCE;
            case 14:
                u1 u1Var = (u1) obj5;
                lc.m0 m0Var3 = (lc.m0) obj4;
                ca0.v0 v0Var = (ca0.v0) obj2;
                lc.k0 k0Var5 = (lc.k0) obj;
                k0Var5.getClass();
                q2.Companion.getClass();
                Map mapB = p13.t0.b(new o13.p(p005kotlin.jvm.internal.s0.c(q90.c.class), new ca0.p2(n63.b.f123892d)));
                z3.e eVar4 = new z3.e(285533643, true, new aa2.r(u1Var, 12, m0Var3, v0Var));
                p13.j0 j0Var3 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                nc.n.a(k0Var5, t0Var4.b(q2.b.class), mapB, j0Var3, null, null, null, null, eVar4);
                ca0.i0.Companion.getClass();
                nc.n.a(k0Var5, t0Var4.b(q2.c.class), ca0.i0.m.a(), j0Var3, null, null, null, null, new z3.e(2069214516, true, new a42.d0((Object) v0Var, (Object) m0Var3, (Object) u1Var, (e23.a) obj3, 11)));
                nc.n.a(k0Var5, t0Var4.b(q2.d.class), ca0.i0.m.a(), j0Var3, null, null, null, null, new z3.e(1502302483, true, new a6.c(u1Var, 6)));
                return Unit.INSTANCE;
            case 15:
                u1 u1Var2 = (u1) obj5;
                lc.m0 m0Var4 = (lc.m0) obj4;
                e23.a aVar7 = (e23.a) obj2;
                e23.a aVar8 = (e23.a) obj3;
                lc.k0 k0Var6 = (lc.k0) obj;
                k0Var6.getClass();
                g4.Companion.getClass();
                Map mapB2 = p13.t0.b(new o13.p(p005kotlin.jvm.internal.s0.c(q90.c.class), new h4(n63.b.f123892d)));
                z3.e eVar5 = new z3.e(-1624906485, true, new aa2.r(u1Var2, 14, m0Var4, aVar7));
                p13.j0 j0Var4 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                nc.n.a(k0Var6, t0Var5.b(g4.g.class), mapB2, j0Var4, null, null, null, null, eVar5);
                z3.e eVar6 = new z3.e(-187710732, true, new ca0.q(m0Var4, aVar8, aVar7, 6));
                p13.k0 k0Var7 = p13.k0.f134949a;
                k0Var7.getClass();
                nc.n.a(k0Var6, t0Var5.b(g4.e.class), k0Var7, j0Var4, null, null, null, null, eVar6);
                nc.n.a(k0Var6, t0Var5.b(g4.f.class), k0Var7, j0Var4, null, null, null, null, new z3.e(-305347501, true, new ca0.q(m0Var4, aVar8, aVar7, 7)));
                nc.n.a(k0Var6, t0Var5.b(g4.a.class), k0Var7, j0Var4, null, null, null, null, new z3.e(-422984270, true, new ca0.q(m0Var4, aVar8, aVar7, 8)));
                nc.n.a(k0Var6, t0Var5.b(g4.d.class), k0Var7, j0Var4, null, null, null, null, new z3.e(-540621039, true, new ca0.q(m0Var4, aVar8, aVar7, 9)));
                nc.n.a(k0Var6, t0Var5.b(g4.c.class), k0Var7, j0Var4, null, null, null, null, new z3.e(-658257808, true, new a42.d0((Object) u1Var2, (Object) m0Var4, aVar8, (Object) aVar7, 13)));
                return Unit.INSTANCE;
            case 16:
                lc.m0 m0Var5 = (lc.m0) obj4;
                String str5 = (String) obj2;
                WifiSetup.SecurityType securityType = (WifiSetup.SecurityType) obj3;
                String str6 = (String) obj;
                str6.getClass();
                p2 p2Var2 = ((sa0.n) obj5).f158212c;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, sa0.n.b.a((sa0.n.b) value2, false, false, false, false, null, WifiSetup.StatusType.Unknown, null, 191)));
                lc.y.l(m0Var5, new g4.c(str5, securityType.name(), str6));
                return Unit.INSTANCE;
            case 17:
                return StreetViewKt.StreetViewLifecycle$lambda$23$lambda$22((StreetViewPanoramaView) obj5, (p1) obj4, (androidx.lifecycle.b0) obj2, (Context) obj3, (p3.i0) obj);
            case 18:
                ArrayList arrayList2 = (ArrayList) obj5;
                p1 p1Var3 = (p1) obj3;
                String str7 = (String) obj;
                ElectronicShiftingDataActivity.a aVar9 = ElectronicShiftingDataActivity.f29955b;
                str7.getClass();
                ((p1) obj4).setValue(str7);
                int iIndexOf = ((List) ((p1) obj2).getF182175a()).indexOf(str7);
                if (iIndexOf == 0) {
                    p1Var3.setValue(p13.h0.N0(arrayList2, new cr.p(new cr.j())));
                } else if (iIndexOf == 1) {
                    p1Var3.setValue(p13.h0.N0(arrayList2, new cr.m()));
                } else if (iIndexOf == 2) {
                    p1Var3.setValue(p13.h0.N0(p13.h0.N0(arrayList2, new cr.q(new cr.k())), new cr.o()));
                } else if (iIndexOf == 3) {
                    p1Var3.setValue(p13.h0.N0(p13.h0.N0(arrayList2, new cr.r(new cr.l())), new cr.n()));
                }
                return Unit.INSTANCE;
            case 19:
                zw2.f fVar2 = (zw2.f) obj5;
                dx2.c cVar5 = (dx2.c) obj4;
                Map<String, ? extends Object> map2 = (Map) obj2;
                cw2.a aVar10 = (cw2.a) obj3;
                if (fVar2 != null) {
                    cx2.h hVar3 = cw2.a.f56264c;
                    strF = fVar2.f(cVar5, map2);
                }
                StyledTextView styledTextView3 = aVar10.f56265a;
                String strG = sn.a.g(strF);
                if (strG.length() == 0) {
                    cw2.a.f56264c.d(null, "Did not find the translation for Row ID: " + map2.get(gw2.i.ROW_ID.f79975a));
                    aVar10.f56266b.setVisibility(8);
                }
                styledTextView3.setText(strG);
                aVar10.j(cVar5, map2, null);
                return Unit.INSTANCE;
            case 20:
                c.q qVar = (c.q) obj3;
                String str8 = (String) obj;
                cy1.c cVar6 = cy1.c.f56798a;
                str8.getClass();
                ((p1) obj2).setValue(str8);
                Intent intentD4 = ((ey1.a) obj5).D4((Context) obj4, str8);
                if (intentD4 != null) {
                    qVar.a(intentD4, null);
                }
                return Unit.INSTANCE;
            case 21:
                View view2 = (View) obj;
                view2.getClass();
                new d61.d((LocalDate) obj5, (LocalDate) obj4, (c61.a) obj2, view2, "").c((i53.c) obj3);
                return Unit.INSTANCE;
            case 22:
                final com.garmin.android.apps.connectmobile.settings.devices.wifi.o oVar = (com.garmin.android.apps.connectmobile.settings.devices.wifi.o) obj5;
                View view3 = (View) obj4;
                View view4 = (View) obj2;
                View view5 = (View) obj3;
                final hd0.h hVar4 = (hd0.h) obj;
                com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar11 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                if (hVar4 instanceof hd0.h.c) {
                    WifiSetup.StoredAccessPoint storedAccessPoint = ((hd0.h.c) hVar4).f83353a;
                    oVar.u6(storedAccessPoint.getSsid());
                    view3.setVisibility(storedAccessPoint.getSecurityType() != WifiSetup.SecurityType.OPEN ? 0 : 8);
                    view3.setOnClickListener(new View.OnClickListener() { // from class: di1.y
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view6) {
                            int i28 = i19;
                            hd0.h hVar5 = hVar4;
                            final com.garmin.android.apps.connectmobile.settings.devices.wifi.o oVar2 = oVar;
                            switch (i28) {
                                case 0:
                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar12 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                    final WifiSetup.StoredAccessPoint storedAccessPoint2 = ((hd0.h.c) hVar5).f83353a;
                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.l.a aVar13 = com.garmin.android.apps.connectmobile.settings.devices.wifi.l.f43349p;
                                    String ssid = storedAccessPoint2.getSsid();
                                    WifiSetup.SecurityType securityType2 = storedAccessPoint2.getSecurityType();
                                    String str9 = oVar2.f43389c;
                                    List<? extends WifiSetup.SecurityType> list2 = oVar2.v6().f83312e;
                                    final int i29 = 0;
                                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: di1.x
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i30) {
                                            int i34 = i29;
                                            WifiSetup.StoredAccessPoint storedAccessPoint3 = storedAccessPoint2;
                                            com.garmin.android.apps.connectmobile.settings.devices.wifi.o oVar3 = oVar2;
                                            switch (i34) {
                                                case 0:
                                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar14 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                                    dialogInterface.getClass();
                                                    Dialog dialog = (Dialog) dialogInterface;
                                                    String string = ((EditText) dialog.findViewById(R.id.password)).getText().toString();
                                                    if (i30 == -1) {
                                                        hd0.b bVarV6 = oVar3.v6();
                                                        bVarV6.getClass();
                                                        storedAccessPoint3.getClass();
                                                        string.getClass();
                                                        a2 a2Var2 = a2.DEVICES;
                                                        String str10 = "updateNetworkPassword deviceId[" + bVarV6.f83308a + "] " + storedAccessPoint3;
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2Var2, "WifiNetworksViewModel", str10);
                                                        bVarV6.f83309b.j(hd0.h.a.f83351a);
                                                        ge1.b.T(v1.a(bVarV6), null, null, new hd0.g(storedAccessPoint3, string, bVarV6, null), 3);
                                                    }
                                                    dialog.dismiss();
                                                    break;
                                                case 1:
                                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar15 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                                    hd0.b bVarV7 = oVar3.v6();
                                                    bVarV7.getClass();
                                                    storedAccessPoint3.getClass();
                                                    a2 a2Var3 = a2.DEVICES;
                                                    String str11 = "forgetNetwork deviceId[" + bVarV7.f83308a + "] " + storedAccessPoint3;
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2Var3, "WifiNetworksViewModel", str11);
                                                    bVarV7.f83309b.j(hd0.h.a.f83351a);
                                                    ge1.b.T(v1.a(bVarV7), null, null, new hd0.c(bVarV7, storedAccessPoint3, null), 3);
                                                    dialogInterface.dismiss();
                                                    break;
                                                default:
                                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar16 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                                    oVar3.v6().A4(storedAccessPoint3);
                                                    dialogInterface.dismiss();
                                                    break;
                                            }
                                        }
                                    };
                                    aVar13.getClass();
                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.l.a.a(ssid, securityType2, "", str9, false, list2, onClickListener).show(oVar2.getChildFragmentManager(), (String) null);
                                    break;
                                case 1:
                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar14 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                    final WifiSetup.StoredAccessPoint storedAccessPoint3 = ((hd0.h.c) hVar5).f83353a;
                                    final int i30 = 2;
                                    androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(oVar2.requireContext()).setTitle(oVar2.getString(R.string.wifi_connection_verification_title, storedAccessPoint3.getSsid())).setMessage(oVar2.getString(R.string.wifi_connection_verification_message)).setPositiveButton(oVar2.getString(R.string.lbl_connect), new DialogInterface.OnClickListener() { // from class: di1.x
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i34) {
                                            int i35 = i30;
                                            WifiSetup.StoredAccessPoint storedAccessPoint4 = storedAccessPoint3;
                                            com.garmin.android.apps.connectmobile.settings.devices.wifi.o oVar3 = oVar2;
                                            switch (i35) {
                                                case 0:
                                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar15 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                                    dialogInterface.getClass();
                                                    Dialog dialog = (Dialog) dialogInterface;
                                                    String string = ((EditText) dialog.findViewById(R.id.password)).getText().toString();
                                                    if (i34 == -1) {
                                                        hd0.b bVarV6 = oVar3.v6();
                                                        bVarV6.getClass();
                                                        storedAccessPoint4.getClass();
                                                        string.getClass();
                                                        a2 a2Var2 = a2.DEVICES;
                                                        String str10 = "updateNetworkPassword deviceId[" + bVarV6.f83308a + "] " + storedAccessPoint4;
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2Var2, "WifiNetworksViewModel", str10);
                                                        bVarV6.f83309b.j(hd0.h.a.f83351a);
                                                        ge1.b.T(v1.a(bVarV6), null, null, new hd0.g(storedAccessPoint4, string, bVarV6, null), 3);
                                                    }
                                                    dialog.dismiss();
                                                    break;
                                                case 1:
                                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar16 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                                    hd0.b bVarV7 = oVar3.v6();
                                                    bVarV7.getClass();
                                                    storedAccessPoint4.getClass();
                                                    a2 a2Var3 = a2.DEVICES;
                                                    String str11 = "forgetNetwork deviceId[" + bVarV7.f83308a + "] " + storedAccessPoint4;
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2Var3, "WifiNetworksViewModel", str11);
                                                    bVarV7.f83309b.j(hd0.h.a.f83351a);
                                                    ge1.b.T(v1.a(bVarV7), null, null, new hd0.c(bVarV7, storedAccessPoint4, null), 3);
                                                    dialogInterface.dismiss();
                                                    break;
                                                default:
                                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar17 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                                    oVar3.v6().A4(storedAccessPoint4);
                                                    dialogInterface.dismiss();
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton(oVar2.getString(R.string.orphan_device_not_connected_alert_button_notnow), new com.garmin.android.apps.connectmobile.connectiq.i(11)).create();
                                    eVarCreate.getClass();
                                    eVarCreate.show();
                                    oe2.f.e(eVarCreate, 1.3f);
                                    break;
                                default:
                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar15 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                    final WifiSetup.StoredAccessPoint storedAccessPoint4 = ((hd0.h.c) hVar5).f83353a;
                                    final int i34 = 1;
                                    androidx.appcompat.app.e eVarCreate2 = new androidx.appcompat.app.e.a(oVar2.requireContext()).setMessage(oVar2.getString(R.string.wifi_forget_network_dialog_title, storedAccessPoint4.getSsid())).setPositiveButton(oVar2.getString(R.string.lbl_forget), new DialogInterface.OnClickListener() { // from class: di1.x
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i35) {
                                            int i36 = i34;
                                            WifiSetup.StoredAccessPoint storedAccessPoint5 = storedAccessPoint4;
                                            com.garmin.android.apps.connectmobile.settings.devices.wifi.o oVar3 = oVar2;
                                            switch (i36) {
                                                case 0:
                                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar16 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                                    dialogInterface.getClass();
                                                    Dialog dialog = (Dialog) dialogInterface;
                                                    String string = ((EditText) dialog.findViewById(R.id.password)).getText().toString();
                                                    if (i35 == -1) {
                                                        hd0.b bVarV6 = oVar3.v6();
                                                        bVarV6.getClass();
                                                        storedAccessPoint5.getClass();
                                                        string.getClass();
                                                        a2 a2Var2 = a2.DEVICES;
                                                        String str10 = "updateNetworkPassword deviceId[" + bVarV6.f83308a + "] " + storedAccessPoint5;
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2Var2, "WifiNetworksViewModel", str10);
                                                        bVarV6.f83309b.j(hd0.h.a.f83351a);
                                                        ge1.b.T(v1.a(bVarV6), null, null, new hd0.g(storedAccessPoint5, string, bVarV6, null), 3);
                                                    }
                                                    dialog.dismiss();
                                                    break;
                                                case 1:
                                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar17 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                                    hd0.b bVarV7 = oVar3.v6();
                                                    bVarV7.getClass();
                                                    storedAccessPoint5.getClass();
                                                    a2 a2Var3 = a2.DEVICES;
                                                    String str11 = "forgetNetwork deviceId[" + bVarV7.f83308a + "] " + storedAccessPoint5;
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2Var3, "WifiNetworksViewModel", str11);
                                                    bVarV7.f83309b.j(hd0.h.a.f83351a);
                                                    ge1.b.T(v1.a(bVarV7), null, null, new hd0.c(bVarV7, storedAccessPoint5, null), 3);
                                                    dialogInterface.dismiss();
                                                    break;
                                                default:
                                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar18 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                                    oVar3.v6().A4(storedAccessPoint5);
                                                    dialogInterface.dismiss();
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton(oVar2.getString(R.string.lbl_cancel), new com.garmin.android.apps.connectmobile.connectiq.i(14)).create();
                                    eVarCreate2.getClass();
                                    eVarCreate2.setOnShowListener(new bi2.d(eVarCreate2, oVar2, 1));
                                    eVarCreate2.show();
                                    oe2.f.e(eVarCreate2, 1.3f);
                                    break;
                            }
                        }
                    });
                    view4.setOnClickListener(new View.OnClickListener() { // from class: di1.y
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view6) {
                            int i28 = i24;
                            hd0.h hVar5 = hVar4;
                            final com.garmin.android.apps.connectmobile.settings.devices.wifi.o oVar2 = oVar;
                            switch (i28) {
                                case 0:
                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar12 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                    final WifiSetup.StoredAccessPoint storedAccessPoint2 = ((hd0.h.c) hVar5).f83353a;
                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.l.a aVar13 = com.garmin.android.apps.connectmobile.settings.devices.wifi.l.f43349p;
                                    String ssid = storedAccessPoint2.getSsid();
                                    WifiSetup.SecurityType securityType2 = storedAccessPoint2.getSecurityType();
                                    String str9 = oVar2.f43389c;
                                    List<? extends WifiSetup.SecurityType> list2 = oVar2.v6().f83312e;
                                    final int i29 = 0;
                                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: di1.x
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i35) {
                                            int i36 = i29;
                                            WifiSetup.StoredAccessPoint storedAccessPoint5 = storedAccessPoint2;
                                            com.garmin.android.apps.connectmobile.settings.devices.wifi.o oVar3 = oVar2;
                                            switch (i36) {
                                                case 0:
                                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar16 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                                    dialogInterface.getClass();
                                                    Dialog dialog = (Dialog) dialogInterface;
                                                    String string = ((EditText) dialog.findViewById(R.id.password)).getText().toString();
                                                    if (i35 == -1) {
                                                        hd0.b bVarV6 = oVar3.v6();
                                                        bVarV6.getClass();
                                                        storedAccessPoint5.getClass();
                                                        string.getClass();
                                                        a2 a2Var2 = a2.DEVICES;
                                                        String str10 = "updateNetworkPassword deviceId[" + bVarV6.f83308a + "] " + storedAccessPoint5;
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2Var2, "WifiNetworksViewModel", str10);
                                                        bVarV6.f83309b.j(hd0.h.a.f83351a);
                                                        ge1.b.T(v1.a(bVarV6), null, null, new hd0.g(storedAccessPoint5, string, bVarV6, null), 3);
                                                    }
                                                    dialog.dismiss();
                                                    break;
                                                case 1:
                                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar17 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                                    hd0.b bVarV7 = oVar3.v6();
                                                    bVarV7.getClass();
                                                    storedAccessPoint5.getClass();
                                                    a2 a2Var3 = a2.DEVICES;
                                                    String str11 = "forgetNetwork deviceId[" + bVarV7.f83308a + "] " + storedAccessPoint5;
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2Var3, "WifiNetworksViewModel", str11);
                                                    bVarV7.f83309b.j(hd0.h.a.f83351a);
                                                    ge1.b.T(v1.a(bVarV7), null, null, new hd0.c(bVarV7, storedAccessPoint5, null), 3);
                                                    dialogInterface.dismiss();
                                                    break;
                                                default:
                                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar18 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                                    oVar3.v6().A4(storedAccessPoint5);
                                                    dialogInterface.dismiss();
                                                    break;
                                            }
                                        }
                                    };
                                    aVar13.getClass();
                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.l.a.a(ssid, securityType2, "", str9, false, list2, onClickListener).show(oVar2.getChildFragmentManager(), (String) null);
                                    break;
                                case 1:
                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar14 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                    final WifiSetup.StoredAccessPoint storedAccessPoint3 = ((hd0.h.c) hVar5).f83353a;
                                    final int i30 = 2;
                                    androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(oVar2.requireContext()).setTitle(oVar2.getString(R.string.wifi_connection_verification_title, storedAccessPoint3.getSsid())).setMessage(oVar2.getString(R.string.wifi_connection_verification_message)).setPositiveButton(oVar2.getString(R.string.lbl_connect), new DialogInterface.OnClickListener() { // from class: di1.x
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i35) {
                                            int i36 = i30;
                                            WifiSetup.StoredAccessPoint storedAccessPoint5 = storedAccessPoint3;
                                            com.garmin.android.apps.connectmobile.settings.devices.wifi.o oVar3 = oVar2;
                                            switch (i36) {
                                                case 0:
                                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar16 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                                    dialogInterface.getClass();
                                                    Dialog dialog = (Dialog) dialogInterface;
                                                    String string = ((EditText) dialog.findViewById(R.id.password)).getText().toString();
                                                    if (i35 == -1) {
                                                        hd0.b bVarV6 = oVar3.v6();
                                                        bVarV6.getClass();
                                                        storedAccessPoint5.getClass();
                                                        string.getClass();
                                                        a2 a2Var2 = a2.DEVICES;
                                                        String str10 = "updateNetworkPassword deviceId[" + bVarV6.f83308a + "] " + storedAccessPoint5;
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2Var2, "WifiNetworksViewModel", str10);
                                                        bVarV6.f83309b.j(hd0.h.a.f83351a);
                                                        ge1.b.T(v1.a(bVarV6), null, null, new hd0.g(storedAccessPoint5, string, bVarV6, null), 3);
                                                    }
                                                    dialog.dismiss();
                                                    break;
                                                case 1:
                                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar17 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                                    hd0.b bVarV7 = oVar3.v6();
                                                    bVarV7.getClass();
                                                    storedAccessPoint5.getClass();
                                                    a2 a2Var3 = a2.DEVICES;
                                                    String str11 = "forgetNetwork deviceId[" + bVarV7.f83308a + "] " + storedAccessPoint5;
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2Var3, "WifiNetworksViewModel", str11);
                                                    bVarV7.f83309b.j(hd0.h.a.f83351a);
                                                    ge1.b.T(v1.a(bVarV7), null, null, new hd0.c(bVarV7, storedAccessPoint5, null), 3);
                                                    dialogInterface.dismiss();
                                                    break;
                                                default:
                                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar18 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                                    oVar3.v6().A4(storedAccessPoint5);
                                                    dialogInterface.dismiss();
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton(oVar2.getString(R.string.orphan_device_not_connected_alert_button_notnow), new com.garmin.android.apps.connectmobile.connectiq.i(11)).create();
                                    eVarCreate.getClass();
                                    eVarCreate.show();
                                    oe2.f.e(eVarCreate, 1.3f);
                                    break;
                                default:
                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar15 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                    final WifiSetup.StoredAccessPoint storedAccessPoint4 = ((hd0.h.c) hVar5).f83353a;
                                    final int i34 = 1;
                                    androidx.appcompat.app.e eVarCreate2 = new androidx.appcompat.app.e.a(oVar2.requireContext()).setMessage(oVar2.getString(R.string.wifi_forget_network_dialog_title, storedAccessPoint4.getSsid())).setPositiveButton(oVar2.getString(R.string.lbl_forget), new DialogInterface.OnClickListener() { // from class: di1.x
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i35) {
                                            int i36 = i34;
                                            WifiSetup.StoredAccessPoint storedAccessPoint5 = storedAccessPoint4;
                                            com.garmin.android.apps.connectmobile.settings.devices.wifi.o oVar3 = oVar2;
                                            switch (i36) {
                                                case 0:
                                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar16 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                                    dialogInterface.getClass();
                                                    Dialog dialog = (Dialog) dialogInterface;
                                                    String string = ((EditText) dialog.findViewById(R.id.password)).getText().toString();
                                                    if (i35 == -1) {
                                                        hd0.b bVarV6 = oVar3.v6();
                                                        bVarV6.getClass();
                                                        storedAccessPoint5.getClass();
                                                        string.getClass();
                                                        a2 a2Var2 = a2.DEVICES;
                                                        String str10 = "updateNetworkPassword deviceId[" + bVarV6.f83308a + "] " + storedAccessPoint5;
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2Var2, "WifiNetworksViewModel", str10);
                                                        bVarV6.f83309b.j(hd0.h.a.f83351a);
                                                        ge1.b.T(v1.a(bVarV6), null, null, new hd0.g(storedAccessPoint5, string, bVarV6, null), 3);
                                                    }
                                                    dialog.dismiss();
                                                    break;
                                                case 1:
                                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar17 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                                    hd0.b bVarV7 = oVar3.v6();
                                                    bVarV7.getClass();
                                                    storedAccessPoint5.getClass();
                                                    a2 a2Var3 = a2.DEVICES;
                                                    String str11 = "forgetNetwork deviceId[" + bVarV7.f83308a + "] " + storedAccessPoint5;
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2Var3, "WifiNetworksViewModel", str11);
                                                    bVarV7.f83309b.j(hd0.h.a.f83351a);
                                                    ge1.b.T(v1.a(bVarV7), null, null, new hd0.c(bVarV7, storedAccessPoint5, null), 3);
                                                    dialogInterface.dismiss();
                                                    break;
                                                default:
                                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar18 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                                    oVar3.v6().A4(storedAccessPoint5);
                                                    dialogInterface.dismiss();
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton(oVar2.getString(R.string.lbl_cancel), new com.garmin.android.apps.connectmobile.connectiq.i(14)).create();
                                    eVarCreate2.getClass();
                                    eVarCreate2.setOnShowListener(new bi2.d(eVarCreate2, oVar2, 1));
                                    eVarCreate2.show();
                                    oe2.f.e(eVarCreate2, 1.3f);
                                    break;
                            }
                        }
                    });
                    view5.setOnClickListener(new View.OnClickListener() { // from class: di1.y
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view6) {
                            int i28 = i17;
                            hd0.h hVar5 = hVar4;
                            final com.garmin.android.apps.connectmobile.settings.devices.wifi.o oVar2 = oVar;
                            switch (i28) {
                                case 0:
                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar12 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                    final WifiSetup.StoredAccessPoint storedAccessPoint2 = ((hd0.h.c) hVar5).f83353a;
                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.l.a aVar13 = com.garmin.android.apps.connectmobile.settings.devices.wifi.l.f43349p;
                                    String ssid = storedAccessPoint2.getSsid();
                                    WifiSetup.SecurityType securityType2 = storedAccessPoint2.getSecurityType();
                                    String str9 = oVar2.f43389c;
                                    List<? extends WifiSetup.SecurityType> list2 = oVar2.v6().f83312e;
                                    final int i29 = 0;
                                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: di1.x
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i35) {
                                            int i36 = i29;
                                            WifiSetup.StoredAccessPoint storedAccessPoint5 = storedAccessPoint2;
                                            com.garmin.android.apps.connectmobile.settings.devices.wifi.o oVar3 = oVar2;
                                            switch (i36) {
                                                case 0:
                                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar16 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                                    dialogInterface.getClass();
                                                    Dialog dialog = (Dialog) dialogInterface;
                                                    String string = ((EditText) dialog.findViewById(R.id.password)).getText().toString();
                                                    if (i35 == -1) {
                                                        hd0.b bVarV6 = oVar3.v6();
                                                        bVarV6.getClass();
                                                        storedAccessPoint5.getClass();
                                                        string.getClass();
                                                        a2 a2Var2 = a2.DEVICES;
                                                        String str10 = "updateNetworkPassword deviceId[" + bVarV6.f83308a + "] " + storedAccessPoint5;
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2Var2, "WifiNetworksViewModel", str10);
                                                        bVarV6.f83309b.j(hd0.h.a.f83351a);
                                                        ge1.b.T(v1.a(bVarV6), null, null, new hd0.g(storedAccessPoint5, string, bVarV6, null), 3);
                                                    }
                                                    dialog.dismiss();
                                                    break;
                                                case 1:
                                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar17 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                                    hd0.b bVarV7 = oVar3.v6();
                                                    bVarV7.getClass();
                                                    storedAccessPoint5.getClass();
                                                    a2 a2Var3 = a2.DEVICES;
                                                    String str11 = "forgetNetwork deviceId[" + bVarV7.f83308a + "] " + storedAccessPoint5;
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2Var3, "WifiNetworksViewModel", str11);
                                                    bVarV7.f83309b.j(hd0.h.a.f83351a);
                                                    ge1.b.T(v1.a(bVarV7), null, null, new hd0.c(bVarV7, storedAccessPoint5, null), 3);
                                                    dialogInterface.dismiss();
                                                    break;
                                                default:
                                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar18 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                                    oVar3.v6().A4(storedAccessPoint5);
                                                    dialogInterface.dismiss();
                                                    break;
                                            }
                                        }
                                    };
                                    aVar13.getClass();
                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.l.a.a(ssid, securityType2, "", str9, false, list2, onClickListener).show(oVar2.getChildFragmentManager(), (String) null);
                                    break;
                                case 1:
                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar14 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                    final WifiSetup.StoredAccessPoint storedAccessPoint3 = ((hd0.h.c) hVar5).f83353a;
                                    final int i30 = 2;
                                    androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(oVar2.requireContext()).setTitle(oVar2.getString(R.string.wifi_connection_verification_title, storedAccessPoint3.getSsid())).setMessage(oVar2.getString(R.string.wifi_connection_verification_message)).setPositiveButton(oVar2.getString(R.string.lbl_connect), new DialogInterface.OnClickListener() { // from class: di1.x
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i35) {
                                            int i36 = i30;
                                            WifiSetup.StoredAccessPoint storedAccessPoint5 = storedAccessPoint3;
                                            com.garmin.android.apps.connectmobile.settings.devices.wifi.o oVar3 = oVar2;
                                            switch (i36) {
                                                case 0:
                                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar16 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                                    dialogInterface.getClass();
                                                    Dialog dialog = (Dialog) dialogInterface;
                                                    String string = ((EditText) dialog.findViewById(R.id.password)).getText().toString();
                                                    if (i35 == -1) {
                                                        hd0.b bVarV6 = oVar3.v6();
                                                        bVarV6.getClass();
                                                        storedAccessPoint5.getClass();
                                                        string.getClass();
                                                        a2 a2Var2 = a2.DEVICES;
                                                        String str10 = "updateNetworkPassword deviceId[" + bVarV6.f83308a + "] " + storedAccessPoint5;
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2Var2, "WifiNetworksViewModel", str10);
                                                        bVarV6.f83309b.j(hd0.h.a.f83351a);
                                                        ge1.b.T(v1.a(bVarV6), null, null, new hd0.g(storedAccessPoint5, string, bVarV6, null), 3);
                                                    }
                                                    dialog.dismiss();
                                                    break;
                                                case 1:
                                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar17 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                                    hd0.b bVarV7 = oVar3.v6();
                                                    bVarV7.getClass();
                                                    storedAccessPoint5.getClass();
                                                    a2 a2Var3 = a2.DEVICES;
                                                    String str11 = "forgetNetwork deviceId[" + bVarV7.f83308a + "] " + storedAccessPoint5;
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2Var3, "WifiNetworksViewModel", str11);
                                                    bVarV7.f83309b.j(hd0.h.a.f83351a);
                                                    ge1.b.T(v1.a(bVarV7), null, null, new hd0.c(bVarV7, storedAccessPoint5, null), 3);
                                                    dialogInterface.dismiss();
                                                    break;
                                                default:
                                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar18 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                                    oVar3.v6().A4(storedAccessPoint5);
                                                    dialogInterface.dismiss();
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton(oVar2.getString(R.string.orphan_device_not_connected_alert_button_notnow), new com.garmin.android.apps.connectmobile.connectiq.i(11)).create();
                                    eVarCreate.getClass();
                                    eVarCreate.show();
                                    oe2.f.e(eVarCreate, 1.3f);
                                    break;
                                default:
                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar15 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                    final WifiSetup.StoredAccessPoint storedAccessPoint4 = ((hd0.h.c) hVar5).f83353a;
                                    final int i34 = 1;
                                    androidx.appcompat.app.e eVarCreate2 = new androidx.appcompat.app.e.a(oVar2.requireContext()).setMessage(oVar2.getString(R.string.wifi_forget_network_dialog_title, storedAccessPoint4.getSsid())).setPositiveButton(oVar2.getString(R.string.lbl_forget), new DialogInterface.OnClickListener() { // from class: di1.x
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i35) {
                                            int i36 = i34;
                                            WifiSetup.StoredAccessPoint storedAccessPoint5 = storedAccessPoint4;
                                            com.garmin.android.apps.connectmobile.settings.devices.wifi.o oVar3 = oVar2;
                                            switch (i36) {
                                                case 0:
                                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar16 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                                    dialogInterface.getClass();
                                                    Dialog dialog = (Dialog) dialogInterface;
                                                    String string = ((EditText) dialog.findViewById(R.id.password)).getText().toString();
                                                    if (i35 == -1) {
                                                        hd0.b bVarV6 = oVar3.v6();
                                                        bVarV6.getClass();
                                                        storedAccessPoint5.getClass();
                                                        string.getClass();
                                                        a2 a2Var2 = a2.DEVICES;
                                                        String str10 = "updateNetworkPassword deviceId[" + bVarV6.f83308a + "] " + storedAccessPoint5;
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2Var2, "WifiNetworksViewModel", str10);
                                                        bVarV6.f83309b.j(hd0.h.a.f83351a);
                                                        ge1.b.T(v1.a(bVarV6), null, null, new hd0.g(storedAccessPoint5, string, bVarV6, null), 3);
                                                    }
                                                    dialog.dismiss();
                                                    break;
                                                case 1:
                                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar17 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                                    hd0.b bVarV7 = oVar3.v6();
                                                    bVarV7.getClass();
                                                    storedAccessPoint5.getClass();
                                                    a2 a2Var3 = a2.DEVICES;
                                                    String str11 = "forgetNetwork deviceId[" + bVarV7.f83308a + "] " + storedAccessPoint5;
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2Var3, "WifiNetworksViewModel", str11);
                                                    bVarV7.f83309b.j(hd0.h.a.f83351a);
                                                    ge1.b.T(v1.a(bVarV7), null, null, new hd0.c(bVarV7, storedAccessPoint5, null), 3);
                                                    dialogInterface.dismiss();
                                                    break;
                                                default:
                                                    com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar18 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                                                    oVar3.v6().A4(storedAccessPoint5);
                                                    dialogInterface.dismiss();
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton(oVar2.getString(R.string.lbl_cancel), new com.garmin.android.apps.connectmobile.connectiq.i(14)).create();
                                    eVarCreate2.getClass();
                                    eVarCreate2.setOnShowListener(new bi2.d(eVarCreate2, oVar2, 1));
                                    eVarCreate2.show();
                                    oe2.f.e(eVarCreate2, 1.3f);
                                    break;
                            }
                        }
                    });
                } else if (hVar4 instanceof hd0.h.e) {
                    hd0.h.e eVar7 = (hd0.h.e) hVar4;
                    WifiSetup.StoredAccessPoint storedAccessPoint2 = eVar7.f83356a;
                    int i28 = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.b.f43390a[eVar7.f83357b.ordinal()];
                    String string = i28 != 1 ? i28 != 2 ? oVar.getString(R.string.wifi_connection_verification_error, storedAccessPoint2.getSsid()) : oVar.getString(R.string.wifi_error_invalid_credentials) : oVar.getString(R.string.wifi_connection_verified_successfully, storedAccessPoint2.getSsid());
                    string.getClass();
                    new androidx.appcompat.app.e.a(oVar.requireContext()).setMessage(string).setPositiveButton(oVar.getString(R.string.lbl_ok), new com.garmin.android.apps.connectmobile.connectiq.i(13)).show();
                } else if (hVar4 instanceof hd0.h.g) {
                    hd0.h.g gVar3 = (hd0.h.g) hVar4;
                    if (gVar3.f83361b) {
                        new androidx.appcompat.app.e.a(oVar.requireContext()).setMessage(oVar.getString(R.string.wifi_password_updated_msg, gVar3.f83360a.getSsid())).setPositiveButton(oVar.getString(R.string.lbl_ok), new com.garmin.android.apps.connectmobile.connectiq.i(12)).show();
                    } else {
                        g22.e.c(oVar);
                    }
                } else if (hVar4 instanceof hd0.h.f) {
                    if (((hd0.h.f) hVar4).f83359b) {
                        oVar.v6().y4();
                        oVar.requireActivity().getOnBackPressedDispatcher().d();
                    } else {
                        g22.e.c(oVar);
                    }
                }
                return Unit.INSTANCE;
            case 23:
                Context context3 = (Context) obj5;
                nr.w0.r1 r1Var = (nr.w0.r1) obj4;
                c.q qVar2 = (c.q) obj2;
                qr.t tVar = (qr.t) obj3;
                Uri uri = (Uri) obj;
                String string2 = context3.getString(R.string.lbl_activity_details_share);
                string2.getClass();
                js.c cVar7 = js.c.f100592a;
                String str9 = r1Var.f127525d;
                String str10 = r1Var.f127524c;
                cVar7.getClass();
                uri.getClass();
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("image/*");
                intent.putExtra("android.intent.extra.STREAM", uri);
                if (g22.n.d(str9)) {
                    intent.putExtra("android.intent.extra.TEXT", str9);
                }
                if (g22.n.d(str10)) {
                    intent.putExtra("EXTRA_WEB_LINK", str10);
                }
                intent.setClipData(ClipData.newUri(context3.getContentResolver(), string2, uri));
                intent.addFlags(1);
                qVar2.a(js.c.a(intent, context3, string2), null);
                tVar.J5();
                tVar.M5(r1Var);
                return Unit.INSTANCE;
            case 24:
                qr.t tVar2 = (qr.t) obj5;
                nr.w0.e eVar8 = (nr.w0.e) obj4;
                Context context4 = (Context) obj2;
                fe feVar = (fe) obj3;
                if (((Uri) obj) != null) {
                    x53.c cVar8 = o53.s0.f129406a;
                    ge1.b.T(o53.c0.a(u53.o.f168762a), null, null, new ds.j.e.a(feVar, context4, null), 3);
                    tVar2.M5(eVar8);
                } else {
                    g1.a(context4, new fw.r());
                    tVar2.M5(eVar8);
                }
                return Unit.INSTANCE;
            case 25:
                com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar9 = (com.garmin.android.apps.connectmobile.workouts.presentation.details.e) obj5;
                com.garmin.android.apps.connectmobile.workouts.data.model.h0 h0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.h0) obj4;
                w52.v0 v0Var2 = (w52.v0) obj2;
                com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar3 = (com.garmin.android.apps.connectmobile.workouts.presentation.details.f) obj3;
                e2.f0 f0Var3 = (e2.f0) obj;
                f0Var3.getClass();
                l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVarT = h0Var != null ? h0Var.t() : null;
                if (eVar9 != null && iVarT != null) {
                    new v52.b();
                    o13.p pVarA = v52.b.a(iVarT, eVar9.getF24796s());
                    List list2 = (List) pVarA.f128594a;
                    List list3 = (List) pVarA.f128595b;
                    if (!list2.isEmpty() && !list3.isEmpty()) {
                        e2.f0.b(f0Var3, null, new z3.e(-517754221, true, new a42.a(v0Var2, 21, list2, list3)), 3);
                    }
                    e2.f0.b(f0Var3, null, new z3.e(1824330744, true, new e62.i(v0Var2, i24)), 3);
                    e2.f0.b(f0Var3, null, new z3.e(2061291887, true, new e62.i(v0Var2, i17)), 3);
                    List listC = l52.w.c(iVarT, new e11.w(i16), new e11.w(5), new e11.w(6));
                    f0Var3.a(listC.size(), null, new e62.l.c(e62.l.b.f63222a, listC), new z3.e(802480018, true, new e62.l.d(listC, fVar3, eVar9)));
                }
                return Unit.INSTANCE;
            case 26:
                i53.c cVar9 = (i53.c) obj5;
                l72.j0 j0Var5 = (l72.j0) obj4;
                f82.c cVar10 = (f82.c) obj2;
                e23.p pVar = (e23.p) obj3;
                ((Boolean) obj).getClass();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj7 : cVar9) {
                    if (((l72.j0) obj7).f111075d) {
                        arrayList3.add(obj7);
                    }
                }
                int iIndexOf2 = cVar9.indexOf(j0Var5);
                ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(Integer.valueOf(cVar9.indexOf((l72.j0) it3.next())));
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj8 : arrayList3) {
                    if (((l72.j0) obj8).f111076e) {
                        arrayList5.add(obj8);
                    }
                }
                ArrayList arrayList6 = new ArrayList(p13.y.r(arrayList5, 10));
                Iterator it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(Integer.valueOf(cVar9.indexOf((l72.j0) it4.next())));
                }
                ArrayList arrayListA = cVar10.a(arrayList4, arrayList6, iIndexOf2);
                ArrayList arrayList7 = new ArrayList(p13.y.r(cVar9, 10));
                int i29 = 0;
                for (Object obj9 : cVar9) {
                    int i30 = i29 + 1;
                    if (i29 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    l72.j0 j0Var6 = (l72.j0) obj9;
                    arrayList7.add(l72.j0.a(j0Var6, null, j0Var6.f111075d && arrayListA.contains(Integer.valueOf(i29)), 15));
                    i29 = i30;
                }
                pVar.invoke(arrayList7, Integer.valueOf(iIndexOf2));
                return Unit.INSTANCE;
            case 27:
                i53.c cVar11 = (i53.c) obj5;
                e23.l lVar6 = (e23.l) obj4;
                e23.q qVar3 = (e23.q) obj2;
                e23.l lVar7 = (e23.l) obj3;
                e2.f0 f0Var4 = (e2.f0) obj;
                f0Var4.getClass();
                f0Var4.a(cVar11.size(), lVar6 != null ? new e82.a.g(lVar6, cVar11) : null, new e82.a.h(e82.a.f.f63456a, cVar11), new z3.e(802480018, true, new e82.a.i(cVar11, qVar3, lVar7)));
                return Unit.INSTANCE;
            case 28:
                mc mcVar = (mc) obj4;
                e23.a aVar12 = (e23.a) obj;
                aVar12.getClass();
                aVar12.invoke();
                ge1.b.T((o53.b0) obj5, null, null, new et.k(mcVar, (p1) obj2, null), 3).J(new et.f(mcVar, (p1) obj3, i19));
                return Unit.INSTANCE;
            default:
                Context context5 = (Context) obj5;
                p3.i0 i0Var = (p3.i0) obj;
                eu.c cVar12 = eu.c.f66055a;
                i0Var.getClass();
                eu.d dVar2 = new eu.d((o53.b0) obj4, (e23.a) obj2, (mc) obj3);
                i2.a aVar13 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar13.getClass();
                i2.a.b(a2Var2, "AnnualReportMultipleShareActivity", "register receiver");
                a7.b.registerReceiver(context5, dVar2, new IntentFilter("com.garmin.android.apps.connectmobile.SHARE_FILTER"), 2);
                return new eu.f(i0Var, context5, dVar2);
        }
    }
}
