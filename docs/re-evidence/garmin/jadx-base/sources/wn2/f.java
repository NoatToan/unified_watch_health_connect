package wn2;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import c83.a0;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.load.engine.GlideException;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.apps.connectmobile.consent.ConsentActivity;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.realtimesettings.app.baseviews.reorderable.ReorderableListView;
import com.google.android.gms.maps.model.LatLng;
import e2.f0;
import f5.c0;
import f5.d0;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import l72.i3;
import lc.u0;
import o53.l1;
import o53.s0;
import okhttp3.Response;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p006l2.j2;
import p008y1.a1;
import p008y1.e0;
import p008y1.h3;
import p008y1.p0;
import p008y1.y1;
import p13.h0;
import p13.j0;
import p13.t0;
import p13.w;
import p13.x;
import p13.y;
import p3.i0;
import p3.m1;
import p3.p1;
import p3.x3;
import p5.k0;
import ps.d1;
import r53.p2;
import wq0.z;
import x40.l0;
import xn.t;
import yg2.q0;
import z2.h2;
import z2.m2;
import z2.n2;
import z2.o2;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f186362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f186363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f186364d;

    public /* synthetic */ f(wq1.b bVar, String str, p1 p1Var) {
        this.f186361a = 11;
        this.f186363c = bVar;
        this.f186362b = str;
        this.f186364d = p1Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [e23.a] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v16 */
    @Override // e23.l
    public final Object invoke(Object obj) {
        List<pn2.f> listB;
        rn2.s header;
        Iterable iterableC;
        o13.p pVar;
        List list;
        String str;
        Object value;
        Long l14;
        int i14 = this.f186361a;
        int i15 = 9;
        int i16 = 10;
        boolean z14 = false;
        int i17 = 7;
        ?? D = 0;
        ty0.b bVar = null;
        int i18 = 1;
        Object obj2 = this.f186364d;
        Object obj3 = this.f186363c;
        Object obj4 = this.f186362b;
        switch (i14) {
            case 0:
                String str2 = (String) obj4;
                com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVar = (com.garmin.feature.garminpay.providers.felica.ui.account.developer.a) obj2;
                String str3 = (String) obj3;
                a0 a0Var = (a0) obj;
                Response response = a0Var.f25745a;
                Object obj5 = a0Var.f25746b;
                if (response.isSuccessful()) {
                    pn2.p pVar2 = (pn2.p) obj5;
                    StringBuilder sb3 = new StringBuilder(e5.g(str2, ": ", (pVar2 == null || (header = pVar2.getHeader()) == null) ? null : header.getResultCode()));
                    D = pVar2 != null ? pVar2.d() : 0;
                    if (D instanceof rn2.r) {
                        sb3.append("/" + ((rn2.r) D).getResultCode());
                    } else if (D instanceof rn2.q) {
                        sb3.append("/" + ((rn2.q) D).getResultCode());
                    } else if (D instanceof rn2.p) {
                        sb3.append("/" + ((rn2.p) D).getResultCode());
                    } else if (D instanceof rn2.j) {
                        rn2.i iVar = (rn2.i) h0.d0(((rn2.j) D).b());
                        if (iVar != null) {
                            sb3.append('\n');
                            sb3.append("cardStatus:" + iVar.getCardStatuses().getCardStatus());
                            sb3.append('\n');
                            sb3.append("blacklist:" + iVar.getCardStatuses().getSubStatus().getBlacklist());
                            sb3.append('\n');
                            sb3.append("recovery:" + iVar.getCardStatuses().getSubStatus().getRecovery());
                            sb3.append('\n');
                            sb3.append("forceReissue:" + iVar.getCardStatuses().getSubStatus().getForceReissue());
                            sb3.append('\n');
                            sb3.append("spCardStatus:" + iVar.getCardStatuses().getSpCardStatus());
                            sb3.append('\n');
                        }
                    } else if (D instanceof rn2.m) {
                        pn2.e historyInfo = ((rn2.m) D).getSpAdditionalInfo().getHistoryInfo();
                        if (historyInfo == null || (listB = historyInfo.b()) == null) {
                            sb3.append("Empty history\n");
                        } else {
                            for (pn2.f fVar : listB) {
                                sb3.append('\n');
                                sb3.append(fVar.toString());
                                sb3.append('\n');
                            }
                        }
                    }
                    if (str3 != null) {
                        sb3.append(", ".concat(str3));
                    }
                    aVar.f51039m.j(sb3.toString());
                } else {
                    aVar.f51039m.j(str2 + ": Failed - http status code " + a0Var.f25745a.code());
                }
                return Unit.INSTANCE;
            case 1:
                List list2 = (List) obj4;
                f0 f0Var = (f0) obj;
                f0Var.getClass();
                f0Var.a(list2.size(), new wq0.h(new wp.b(i17), list2), new wq0.i(wq0.g.f186599a, list2), new z3.e(802480018, true, new wq0.j(list2, (j02.h0) obj3, (wq0.l) obj2)));
                return Unit.INSTANCE;
            case 2:
                Context context = (Context) obj4;
                wq0.l lVar = (wq0.l) obj2;
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                wq0.a0.b bVar2 = (wq0.a0.b) ((wq0.a0) obj3);
                context.getClass();
                bVar2.getClass();
                lVar.getClass();
                p2 p2Var = lVar.f186610d;
                int iIndexOf = ((z) p2Var.getValue()).f186617b.indexOf(bVar2);
                int size = ((z) p2Var.getValue()).f186617b.size();
                if (iIndexOf == -1 || size == 1) {
                    iterableC = j0.f134944a;
                } else if (iIndexOf == 0) {
                    iterableC = w.c(wq0.a.MOVE_DOWN);
                } else {
                    iterableC = iIndexOf == size - 1 ? w.c(wq0.a.MOVE_UP) : x.k(wq0.a.MOVE_UP, wq0.a.MOVE_DOWN);
                }
                ArrayList arrayList = new ArrayList(y.r(iterableC, 10));
                Iterator it = iterableC.iterator();
                while (it.hasNext()) {
                    int i19 = wq0.c.f186587a[((wq0.a) it.next()).ordinal()];
                    if (i19 == 1) {
                        pVar = new o13.p(Integer.valueOf(R.string.move_up), new wq0.b(lVar, bVar2, z14 ? 1 : 0));
                    } else {
                        if (i19 != 2) {
                            u0.r();
                            return null;
                        }
                        pVar = new o13.p(Integer.valueOf(R.string.move_down), new wq0.b(lVar, bVar2, i18));
                    }
                    int iIntValue = ((Number) pVar.f128594a).intValue();
                    e23.a aVar2 = (e23.a) pVar.f128595b;
                    String string = context.getString(iIntValue);
                    string.getClass();
                    wq0.l lVar2 = lVar;
                    wq0.a0.b bVar3 = bVar2;
                    arrayList.add(new p5.g(string, new ug2.k(aVar2, context, bVar3, lVar2, 13)));
                    bVar2 = bVar3;
                    lVar = lVar2;
                }
                p5.h0.p(k0Var, arrayList);
                return Unit.INSTANCE;
            case 3:
                ReorderableListView reorderableListView = (ReorderableListView) obj4;
                dx2.c cVar = (dx2.c) obj3;
                Map<String, ? extends Object> map = (Map) obj2;
                cx2.h hVar = ReorderableListView.f52542c;
                reorderableListView.j(cVar, map, null);
                cx2.b.a aVar3 = cx2.b.f56665a;
                Object obj6 = map.get(gw2.i.ROW_ID.f79975a);
                String string2 = obj6 != null ? obj6.toString() : null;
                aVar3.getClass();
                Object objF = cVar.f61484a.f(gw2.j.REORDERABLE_LIST, map, cx2.b.a.c(string2));
                try {
                    if (!(objF instanceof List)) {
                        objF = null;
                    }
                    list = (List) objF;
                    break;
                } catch (ClassCastException unused) {
                    list = null;
                }
                if (list != null) {
                    com.garmin.realtimesettings.app.baseviews.reorderable.b bVar4 = reorderableListView.f52543a;
                    bVar4.getClass();
                    int iA = t0.a(y.r(list, 10));
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iA >= 16 ? iA : 16);
                    for (Object obj7 : list) {
                        linkedHashMap.put(Integer.valueOf(((xv2.d) obj7).f192281a), obj7);
                    }
                    Iterator it3 = bVar4.f52548a.iterator();
                    while (it3.hasNext()) {
                        xv2.d dVar = ((wv2.a) it3.next()).f187464d;
                        xv2.d dVar2 = (xv2.d) linkedHashMap.get(Integer.valueOf(dVar.f192281a));
                        if (dVar2 == null || (str = dVar2.f192282b) == null) {
                            str = "VISIBLE";
                        }
                        dVar.f192282b = str;
                    }
                    bVar4.notifyDataSetChanged();
                } else {
                    ReorderableListView.f52542c.d(null, "Did not find the reorderable item options for Row ID: " + map.get(gw2.i.ROW_ID.f79975a));
                }
                return Unit.INSTANCE;
            case 4:
                CreateCustomCourseActivity createCustomCourseActivity = (CreateCustomCourseActivity) obj2;
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                GeoPointDTO geoPointDTO = (GeoPointDTO) obj;
                CreateCustomCourseActivity.a aVar4 = CreateCustomCourseActivity.f33013f;
                geoPointDTO.getClass();
                createCustomCourseActivity.fa().C4();
                createCustomCourseActivity.fa().A4();
                l0 l0VarFa = createCustomCourseActivity.fa();
                Double d14 = geoPointDTO.latitude;
                double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                Double d15 = geoPointDTO.longitude;
                LatLng latLng = new LatLng(dDoubleValue, d15 != null ? d15.doubleValue() : 0.0d);
                Double d16 = geoPointDTO.distance;
                l0VarFa.getClass();
                str4.getClass();
                l0VarFa.D4(new a50.e.a(str4, latLng, str5, true, d16));
                return Unit.INSTANCE;
            case 5:
                e23.l lVar3 = (e23.l) obj4;
                x3 x3Var = (x3) obj3;
                m1 m1Var = (m1) obj2;
                c0 c0Var = (c0) obj;
                c0Var.getClass();
                if (((b0.b) x3Var.getF182175a()) == b0.b.STARTED) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (d0.e(c0Var) & 4294967295L)) + (((int) (c0Var.a() & 4294967295L)) / 2);
                    if (fIntBitsToFloat != m1Var.getFloatValue()) {
                        m1Var.i(fIntBitsToFloat);
                        lVar3.invoke(Float.valueOf(fIntBitsToFloat));
                    }
                } else if (((b0.b) x3Var.getF182175a()) == b0.b.RESUMED && Float.isNaN(m1Var.getFloatValue())) {
                    m1Var.i(Float.intBitsToFloat((int) (d0.e(c0Var) & 4294967295L)) + (((int) (c0Var.a() & 4294967295L)) / 2));
                    lVar3.invoke(Float.valueOf(m1Var.getFloatValue()));
                }
                return Unit.INSTANCE;
            case 6:
                aa1.h hVar2 = (aa1.h) obj4;
                h2.j0 j0Var = (h2.j0) obj3;
                e23.l lVar4 = (e23.l) obj2;
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var.f111063a, "menu_item_edit")) {
                    q91.g gVar = (q91.g) h0.e0(j0Var.l(), hVar2.f2294f);
                    if (gVar != null) {
                        lVar4.invoke(gVar);
                    }
                }
                return Unit.INSTANCE;
            case 7:
                ab1.f fVar2 = (ab1.f) obj4;
                xa1.k kVar = (xa1.k) obj3;
                com.garmin.android.apps.connectmobile.courses.model.e eVar = (com.garmin.android.apps.connectmobile.courses.model.e) obj;
                int i24 = xa1.k.f189751k;
                eVar.getClass();
                fVar2.f2564b = eVar;
                w9.a aVarA = v1.a(kVar);
                x53.c cVar2 = s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new xa1.n(kVar, eVar, fVar2, (y0) obj2, null), 2);
                return Unit.INSTANCE;
            case 8:
                xc.e eVar2 = (xc.e) obj4;
                xc.a aVar5 = (xc.a) obj3;
                wc.c cVar3 = (wc.c) obj2;
                if (eVar2.f189895e != null) {
                    androidx.core.view.j.z(eVar2, "' is already registered with a NavigationEventHandler '", aVar5, "'.", "NavigationEventState '");
                    return null;
                }
                eVar2.f189895e = aVar5;
                wc.c.a(cVar3, aVar5);
                return new xc.d(aVar5, eVar2);
            case 9:
                xg0.a aVar6 = (xg0.a) obj3;
                wg0.a aVar7 = (wg0.a) obj2;
                ((View) obj).getClass();
                if (((wg0.m) obj4).f185109b == 0) {
                    return Unit.INSTANCE;
                }
                aVar6.J0(aVar7);
                return Unit.INSTANCE;
            case 10:
                n82.f fVar3 = (n82.f) obj4;
                xh0.h hVar3 = (xh0.h) obj2;
                fVar3.d((o82.g) ((i53.f) obj3).get(((Integer) obj).intValue()));
                if (fVar3.f124961b.a() != o82.g.f130850c) {
                    hVar3.x4(false);
                }
                return Unit.INSTANCE;
            case 11:
                ((CustomBarChart) obj).getClass();
                qz.a.b((rz.a) ((p1) obj2).getF182175a(), (wq1.b) obj3, (String) obj4, 4);
                return Unit.INSTANCE;
            case 12:
                xy0.c cVar4 = (xy0.c) obj4;
                Context context2 = (Context) obj3;
                e23.l lVar5 = (e23.l) obj2;
                com.garmin.android.apps.connectmobile.navigation.more.b bVar5 = (com.garmin.android.apps.connectmobile.navigation.more.b) obj;
                bVar5.getClass();
                if (bVar5 instanceof com.garmin.android.apps.connectmobile.navigation.more.b.l) {
                    bVar = ((com.garmin.android.apps.connectmobile.navigation.more.b.l) bVar5).f39421c;
                } else if (bVar5 instanceof com.garmin.android.apps.connectmobile.navigation.more.b.e) {
                    bVar = ((com.garmin.android.apps.connectmobile.navigation.more.b.e) bVar5).f39406d;
                }
                int i25 = bVar != null ? xy0.b.a.f192657a[bVar.ordinal()] : -1;
                if (i25 == 1) {
                    cVar4.y4(true);
                } else if (i25 != 2) {
                    if (i25 == 3 || i25 == 4) {
                        cVar4.f192665h = true;
                        lVar5.invoke(bVar5);
                    } else {
                        lVar5.invoke(bVar5);
                    }
                } else if (!c22.b.f(context2)) {
                    p2 p2Var2 = cVar4.f192668k;
                    int iIntValue2 = ((Number) p2Var2.getValue()).intValue() + 1;
                    do {
                        value = p2Var2.getValue();
                        ((Number) value).intValue();
                    } while (!p2Var2.b(value, Integer.valueOf(iIntValue2)));
                    if (iIntValue2 == 10) {
                        com.nimbusds.jose.shaded.gson.internal.a.o(GCMSettingManager.f41535a, R.string.key_sync_audit_http_logging, GCMSettingManager.f41536b.edit(), true);
                    }
                }
                return Unit.INSTANCE;
            case 13:
                p008y1.z zVar = (p008y1.z) obj4;
                l1 l1Var = (l1) obj3;
                y1 y1Var = (y1) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                float f14 = zVar.f193732c ? 1.0f : -1.0f;
                h3 h3Var = zVar.f193731b;
                long jG = h3Var.g(h3Var.j(f14 * fFloatValue));
                a5.j.f1233b.getClass();
                float fI = h3Var.i(h3Var.g(y1Var.b(a5.j.f1234c, jG))) * f14;
                if (Math.abs(fI) < Math.abs(fFloatValue)) {
                    g8.i.q("Scroll animation cancelled because scroll was not consumed (" + fI + " < " + fFloatValue + CoreConstants.RIGHT_PARENTHESIS_CHAR, l1Var);
                }
                return Unit.INSTANCE;
            case 14:
                c5.e eVar3 = (c5.e) obj4;
                n4.c.f123541b.getClass();
                c5.f.a(eVar3, (b5.a0) obj, 0L);
                float fH = ((b5.h0) obj3).getViewConfiguration().h();
                long jA = eVar3.a(xy2.b.h(fH, fH));
                c5.b bVar6 = eVar3.f24464a;
                c5.d dVar3 = bVar6.f24447a;
                c5.a[] aVarArr = dVar3.f24455d;
                p13.s.m(0, aVarArr.length, null, aVarArr);
                dVar3.f24456e = 0;
                c5.d dVar4 = bVar6.f24448b;
                c5.a[] aVarArr2 = dVar4.f24455d;
                p13.s.m(0, aVarArr2.length, null, aVarArr2);
                dVar4.f24456e = 0;
                bVar6.f24449c = 0L;
                q53.b bVar7 = ((p0) obj2).f193520g;
                if (bVar7 != null) {
                    q53.m.a(bVar7.i(new e0.d(a1.b(jA), false, null)));
                }
                return Unit.INSTANCE;
            case 15:
                e23.l lVar6 = (e23.l) obj3;
                lc.y yVar = (lc.y) obj2;
                f0 f0Var2 = (f0) obj;
                f0Var2.getClass();
                for (Map.Entry entry : ((TreeMap) obj4).entrySet()) {
                    f0.b(f0Var2, null, new z3.e(1472476342, true, new t(entry, i17)), 3);
                    Iterator it4 = ((List) entry.getValue()).iterator();
                    while (it4.hasNext()) {
                        f0.b(f0Var2, null, new z3.e(1063937496, true, new vd0.s0((vf2.e) it4.next(), lVar6, yVar)), 3);
                    }
                }
                return Unit.INSTANCE;
            case 16:
                q0.h((yg2.o) obj4, ((Integer) obj).intValue(), (bg2.j) obj3, (lc.y) obj2);
                return Unit.INSTANCE;
            case 17:
                List list3 = (List) obj2;
                int iIntValue3 = ((Integer) obj).intValue();
                ((e23.l) obj4).invoke(tq0.l.a((tq0.l) obj3, 0, ((tq0.k) list3.get(iIntValue3)).f166096a, ((tq0.k) list3.get(iIntValue3)).f166097b, 3));
                return Unit.INSTANCE;
            case 18:
                e23.l lVar7 = (e23.l) obj4;
                yq0.b bVar8 = (yq0.b) obj3;
                Context context3 = (Context) obj2;
                i3 i3Var2 = (i3) obj;
                i3Var2.getClass();
                String str6 = i3Var2.f111063a;
                int iHashCode = str6.hashCode();
                if (iHashCode != 1021133491) {
                    if (iHashCode != 1288934634) {
                        if (iHashCode == 1289063310 && str6.equals("MENU_INFO")) {
                            lVar7.invoke(zq0.a.INSTANCE);
                        }
                    } else if (str6.equals("MENU_EDIT")) {
                        lVar7.invoke(new zq0.b(bVar8.f198737e, bVar8.f198733a.f166047a));
                    }
                } else if (str6.equals("MENU_DATA_PRIVACY")) {
                    ConsentActivity.a aVar8 = ConsentActivity.f32155r;
                    q92.x xVar = q92.x.DI_CONNECT_INSIGHTS;
                    hl.a.c cVar5 = hl.a.c.f84256b;
                    aVar8.getClass();
                    ConsentActivity.a.c(context3, cVar5, xVar, true);
                }
                return Unit.INSTANCE;
            case 19:
                yq0.b bVar9 = (yq0.b) obj3;
                e23.l lVar8 = (e23.l) obj2;
                f0 f0Var3 = (f0) obj;
                f0Var3.getClass();
                Iterator it5 = ((Map) obj4).entrySet().iterator();
                while (it5.hasNext()) {
                    f0.b(f0Var3, null, new z3.e(51160021, true, new vd0.s0((yq0.e) ((Map.Entry) it5.next()).getValue(), 20, bVar9, lVar8)), 3);
                }
                return Unit.INSTANCE;
            case 20:
                f0 f0Var4 = (f0) obj;
                f0Var4.getClass();
                f0.b(f0Var4, null, new z3.e(-1529329534, true, new yr.t((nr.x) obj4, (p1) obj3, (p1) obj2, i18)), 3);
                return Unit.INSTANCE;
            case 21:
                zw1.g gVar2 = (zw1.g) obj;
                gVar2.getClass();
                w2.a0.n(gVar2.f207267a, (List) obj4, (List) obj3, gVar2.f207269c, gVar2.f207270d, gVar2.f207271e, gVar2.f207268b);
                v22.e.n(gVar2, new xa2.g((nr.g.n) obj2, 28));
                return Unit.INSTANCE;
            case 22:
                x53.c cVar6 = s0.f129406a;
                ge1.b.T(o53.c0.a(u53.o.f168762a), null, null, new yr2.i((String) obj4, (ImageView) obj3, (GlideException) obj, (dj.f[]) obj2, null), 3);
                return Unit.INSTANCE;
            case 23:
                ArrayList arrayList2 = (ArrayList) obj4;
                f0 f0Var5 = (f0) obj;
                f0Var5.getClass();
                f0Var5.a(arrayList2.size(), null, new yy1.l(arrayList2), new z3.e(2039820996, true, new yy1.m(arrayList2, arrayList2, (e23.l) obj3, (ArrayList) obj2)));
                return Unit.INSTANCE;
            case 24:
                m0 m0Var = (m0) obj2;
                b5.a0 a0Var2 = (b5.a0) obj;
                if (((z2.l) obj4).d(a0Var2.f15750c, (z2.d0) obj3)) {
                    a0Var2.a();
                    m0Var.f105804a = true;
                }
                return Unit.INSTANCE;
            case 25:
                h2 h2Var = (h2) obj3;
                x1.k kVar2 = (x1.k) obj2;
                x1.i iVar2 = (x1.i) obj;
                int i26 = ((j2) ((x3) obj4).getF182175a()).f108586a;
                m2.b(iVar2, kVar2, p006l2.m2.f108656d, (i26 & 4) == 4, new z2.j2(h2Var, 5));
                m2.b(iVar2, kVar2, p006l2.m2.f108657e, (i26 & 1) == 1, new z2.j2(h2Var, 6));
                m2.b(iVar2, kVar2, p006l2.m2.f108658f, (i26 & 2) == 2, new z2.j2(h2Var, i17));
                m2.b(iVar2, kVar2, p006l2.m2.f108659g, (i26 & 8) == 8, new z2.j2(h2Var, 8));
                m2.b(iVar2, kVar2, p006l2.m2.f108660h, (i26 & 16) == 16, new z2.j2(h2Var, i15));
                return Unit.INSTANCE;
            case 26:
                h2 h2Var2 = (h2) obj4;
                o53.b0 b0Var = (o53.b0) obj3;
                Context context4 = (Context) obj2;
                n2.a aVar9 = (n2.a) obj;
                aVar9.a();
                p1.q0<o2.b> q0Var = aVar9.f122353a;
                p006l2.m2 m2Var = p006l2.m2.f108656d;
                boolean zG = h2Var2.g();
                w2.c0 c0Var2 = new w2.c0(b0Var, new n2(h2Var2, null), i18);
                Resources resources = context4.getResources();
                d52.m mVar = new d52.m(c0Var2, D, i17);
                if (zG) {
                    q0Var.g(new o2.e(m2Var.f108662a, resources.getString(m2Var.f108663b), m2Var.f108664c, mVar));
                }
                p006l2.m2 m2Var2 = p006l2.m2.f108657e;
                boolean zF = h2Var2.f();
                w2.c0 c0Var3 = new w2.c0(b0Var, new o2(h2Var2, null), i18);
                Resources resources2 = context4.getResources();
                d52.m mVar2 = new d52.m(c0Var3, D, i17);
                if (zF) {
                    q0Var.g(new o2.e(m2Var2.f108662a, resources2.getString(m2Var2.f108663b), m2Var2.f108664c, mVar2));
                }
                p006l2.m2 m2Var3 = p006l2.m2.f108658f;
                boolean zH = h2Var2.h();
                w2.c0 c0Var4 = new w2.c0(b0Var, new z2.p2(h2Var2, null), i18);
                Resources resources3 = context4.getResources();
                d52.m mVar3 = new d52.m(c0Var4, D, i17);
                if (zH) {
                    q0Var.g(new o2.e(m2Var3.f108662a, resources3.getString(m2Var3.f108663b), m2Var3.f108664c, mVar3));
                }
                p006l2.m2 m2Var4 = p006l2.m2.f108659g;
                boolean zI = h2Var2.i();
                z2.j2 j2Var = new z2.j2(h2Var2, i16);
                z2.j2 j2Var2 = new z2.j2(h2Var2, 11);
                Resources resources4 = context4.getResources();
                d52.m mVar4 = new d52.m(j2Var2, j2Var, i17);
                if (zI) {
                    q0Var.g(new o2.e(m2Var4.f108662a, resources4.getString(m2Var4.f108663b), m2Var4.f108664c, mVar4));
                }
                p006l2.m2 m2Var5 = p006l2.m2.f108660h;
                boolean zE = h2Var2.e();
                z2.j2 j2Var3 = new z2.j2(h2Var2, 12);
                Resources resources5 = context4.getResources();
                d52.m mVar5 = new d52.m(j2Var3, D, i17);
                if (zE) {
                    q0Var.g(new o2.e(m2Var5.f108662a, resources5.getString(m2Var5.f108663b), m2Var5.f108664c, mVar5));
                }
                aVar9.a();
                return Unit.INSTANCE;
            case 27:
                o51.f fVar4 = (o51.f) obj4;
                e23.l lVar9 = (e23.l) obj3;
                p1 p1Var = (p1) obj2;
                i3 i3Var3 = (i3) obj;
                i3Var3.getClass();
                String str7 = i3Var3.f111063a;
                switch (str7.hashCode()) {
                    case -1335458389:
                        if (str7.equals("delete")) {
                            p1Var.setValue(Boolean.TRUE);
                        }
                        break;
                    case 985586851:
                        if (str7.equals("send_to_device") && (l14 = fVar4.f129236a) != null) {
                            lVar9.invoke(new w41.a.m(new w41.b.f(l14.longValue())));
                        }
                        break;
                    case 1201687819:
                        if (str7.equals("duplicate")) {
                            lVar9.invoke(w41.a.e.f181951a);
                        }
                        break;
                    case 1572302832:
                        if (str7.equals("edit_course")) {
                            lVar9.invoke(w41.a.f.f181952a);
                        }
                        break;
                }
                return Unit.INSTANCE;
            case 28:
                n0 n0Var = (n0) obj4;
                ((i0) obj).getClass();
                androidx.core.view.q qVar = new androidx.core.view.q(i15, (za0.i) obj3, (Context) obj2);
                n0Var.getF158016a().a(qVar);
                return new za0.s(n0Var, qVar);
            default:
                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.a aVar10 = (com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.a) obj4;
                ConstraintLayout constraintLayout = (ConstraintLayout) obj3;
                View view2 = (View) obj2;
                List list4 = (List) obj;
                int i27 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.a.f29309p;
                if (list4 == null) {
                    return Unit.INSTANCE;
                }
                if (list4.isEmpty()) {
                    g22.e.a(aVar10, new fw.g());
                    aVar10.requireActivity().setResult(-1);
                    aVar10.requireActivity().finish();
                } else {
                    g22.e.f(aVar10);
                    constraintLayout.setVisibility(0);
                    aVar10.M6(view2, (d1) h0.e0(aVar10.f29324k, list4));
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f(Object obj, int i14, Object obj2, Object obj3) {
        this.f186361a = i14;
        this.f186362b = obj;
        this.f186363c = obj2;
        this.f186364d = obj3;
    }

    public /* synthetic */ f(String str, com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVar, String str2) {
        this.f186361a = 0;
        this.f186362b = str;
        this.f186364d = aVar;
        this.f186363c = str2;
    }

    public /* synthetic */ f(CreateCustomCourseActivity createCustomCourseActivity, String str, String str2) {
        this.f186361a = 4;
        this.f186364d = createCustomCourseActivity;
        this.f186362b = str;
        this.f186363c = str2;
    }

    public /* synthetic */ f(p008y1.z zVar, p008y1.x3 x3Var, l1 l1Var, y1 y1Var) {
        this.f186361a = 13;
        this.f186362b = zVar;
        this.f186363c = l1Var;
        this.f186364d = y1Var;
    }
}
