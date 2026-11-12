package p90;

import am.x0;
import am.z0;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.textclassifier.TextClassification;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.lifecycle.v1;
import ca0.o1;
import ca0.r;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.auth.PostUserAuthenticationActivity;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.MultiDayActivitiesEditActivity;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.google.android.gms.maps.model.LatLng;
import d53.w;
import e2.f0;
import e23.p;
import i3.mc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import jy0.d0;
import l72.i3;
import lc.k0;
import lc.v;
import nr.w0;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.o0;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p1.z;
import p13.h0;
import p13.u0;
import p3.i0;
import p3.m;
import p3.n;
import p3.n1;
import p3.p1;
import p3.x1;
import p3.x3;
import po2.x;
import pu.j0;
import q2.u;
import q42.y;
import q53.t;
import qn0.a0;
import r1.l;
import r53.p2;
import rk0.c1;
import rk0.d1;
import y80.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f136513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f136514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f136515d;

    public /* synthetic */ h(Object obj, int i14, Object obj2, Object obj3) {
        this.f136512a = i14;
        this.f136513b = obj;
        this.f136514c = obj2;
        this.f136515d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, o13.l] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        String string;
        Object value;
        Object value2;
        List listB1;
        List<String> listB2;
        List<String> listB3;
        Object value3;
        c1 c1Var;
        Object value4;
        mm1.a overallStats;
        mm1.a overallStats2;
        List<mm1.c> listB;
        int i14 = this.f136512a;
        int i15 = 11;
        int i16 = 8;
        int i17 = 7;
        int i18 = 14;
        int i19 = 10;
        final int i24 = 2;
        final int i25 = 4;
        final int i26 = 3;
        final int i27 = 1;
        final int i28 = 0;
        l90.d dVarA = null;
        ArrayList arrayList = null;
        LinkedHashMap linkedHashMap = null;
        dVarA = null;
        Object obj2 = this.f136515d;
        Object obj3 = this.f136514c;
        Object obj4 = this.f136513b;
        switch (i14) {
            case 0:
                o0 o0Var = (o0) obj4;
                e.a(o0Var, (t) obj3, (l90.b) obj2, o0Var.f105806a, ((Boolean) obj).booleanValue(), 80);
                return Unit.INSTANCE;
            case 1:
                androidx.navigation.fragment.a aVar = (androidx.navigation.fragment.a) obj4;
                Fragment fragment = (Fragment) obj3;
                v vVar = (v) obj2;
                n0 n0Var = (n0) obj;
                ArrayList arrayList2 = aVar.f10134g;
                if (arrayList2 == null || !arrayList2.isEmpty()) {
                    Iterator it = arrayList2.iterator();
                    do {
                        if (!it.hasNext()) {
                            i27 = 0;
                        }
                    } while (!s.g(((o13.p) it.next()).f128594a, fragment.getTag()));
                } else {
                    i27 = 0;
                }
                if (n0Var != null && i27 == 0) {
                    b0 f158017a = fragment.getViewLifecycleOwner().getF158016a();
                    if (f158017a.getF7973d().a(b0.b.CREATED)) {
                        f158017a.a((m0) aVar.f10136i.invoke(vVar));
                    }
                }
                return Unit.INSTANCE;
            case 2:
                androidx.appcompat.app.e.a aVar2 = (androidx.appcompat.app.e.a) obj;
                aVar2.getClass();
                aVar2.setTitle(R.string.wallet_remove_card);
                aVar2.setMessage(aVar2.getContext().getString(R.string.wallet_remove_card_hint, (String) obj4));
                aVar2.setPositiveButton(R.string.lbl_remove, new ng1.c1((x) obj3, 10));
                aVar2.setNegativeButton(R.string.lbl_cancel, new ng1.c1((po2.o) obj2, i15));
                aVar2.setCancelable(false);
                return Unit.INSTANCE;
            case 3:
                String str = (String) obj4;
                e23.l lVar = (e23.l) obj3;
                com.garmin.feature.garminpay.providers.gpay.snowball.ui.b bVar = (com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) obj2;
                androidx.appcompat.app.e.a aVar3 = (androidx.appcompat.app.e.a) obj;
                aVar3.getClass();
                aVar3.setTitle(R.string.wallet_title_recharge_failed);
                aVar3.setMessage(aVar3.getContext().getString(R.string.wallet_error_message_recharge_failed_with_error_code, str != null ? am.j.m(" (", str, ")") : ""));
                aVar3.setCancelable(false);
                aVar3.setPositiveButton(R.string.wallet_call, new pk1.t(i26, lVar, bVar));
                aVar3.setNegativeButton(R.string.lbl_cancel, new com.garmin.android.apps.connectmobile.gfdi.protobuf.e(lVar, 15));
                return Unit.INSTANCE;
            case 4:
                fo2.q qVar = (fo2.q) obj4;
                String str2 = (String) obj3;
                x xVar = (x) obj2;
                androidx.appcompat.app.e.a aVar4 = (androidx.appcompat.app.e.a) obj;
                aVar4.getClass();
                int i29 = qVar == null ? -1 : com.garmin.feature.garminpay.providers.gpay.snowball.ui.e.a.f51323a[qVar.ordinal()];
                if (i29 == 1) {
                    string = aVar4.getContext().getString(R.string.wallet_add_card_in_progress);
                } else if (i29 == 2) {
                    string = aVar4.getContext().getString(R.string.wallet_recharge_in_progress);
                } else if (i29 == 3) {
                    string = aVar4.getContext().getString(R.string.wallet_transfer_out_card_in_progress);
                } else if (i29 != 4) {
                    string = i29 != 5 ? aVar4.getContext().getString(R.string.wallet_message_processing_request, str2) : aVar4.getContext().getString(R.string.wallet_delete_card_in_progress);
                } else {
                    string = aVar4.getContext().getString(R.string.wallet_transfer_in_card_in_progress);
                }
                string.getClass();
                aVar4.setTitle(R.string.wallet_processing_request);
                aVar4.setMessage(string);
                aVar4.setCancelable(false);
                aVar4.setPositiveButton(R.string.lbl_ok, new ng1.c1(xVar, i17));
                return Unit.INSTANCE;
            case 5:
                n82.f fVar = (n82.f) obj4;
                yq1.e eVar = (yq1.e) obj2;
                fVar.d((o82.g) ((i53.f) obj3).get(((Integer) obj).intValue()));
                if (fVar.f124961b.a() != o82.g.f130850c) {
                    eVar.x4(false);
                }
                return Unit.INSTANCE;
            case 6:
                ps2.n nVar = (ps2.n) obj4;
                js2.d dVar = (js2.d) obj3;
                nVar.f140504g.error("Owner data not set but passcode is set, create owner data failed", (Throwable) obj);
                nVar.f140513p = dVar;
                ((e13.a.C1312a) obj2).c(dVar);
                return Unit.INSTANCE;
            case 7:
                PostUserAuthenticationActivity postUserAuthenticationActivity = (PostUserAuthenticationActivity) obj4;
                UserSettingsDTO userSettingsDTO = (UserSettingsDTO) obj3;
                com.garmin.android.apps.connectmobile.userprofile.model.m mVar = (com.garmin.android.apps.connectmobile.userprofile.model.m) obj2;
                com.garmin.android.apps.connectmobile.startup.j jVar = (com.garmin.android.apps.connectmobile.startup.j) obj;
                PostUserAuthenticationActivity.a aVar5 = PostUserAuthenticationActivity.f30291i;
                if (jVar != null) {
                    View viewFindViewById = postUserAuthenticationActivity.findViewById(R.id.toolbar_container);
                    int i30 = PostUserAuthenticationActivity.b.f30297a[jVar.f44874a.ordinal()];
                    if (i30 == 1) {
                        postUserAuthenticationActivity.showProgressOverlay();
                    } else if (i30 == 2) {
                        postUserAuthenticationActivity.hideProgressOverlay();
                    } else if (i30 == 3) {
                        viewFindViewById.setVisibility(8);
                        postUserAuthenticationActivity.hideProgressOverlay();
                    } else if (i30 == 4) {
                        viewFindViewById.setVisibility(0);
                    } else if (i30 != 5) {
                        postUserAuthenticationActivity.hideProgressOverlay();
                    } else {
                        j0 j0Var = (j0) postUserAuthenticationActivity.f30292d.getValue();
                        j0Var.getClass();
                        o1 o1Var = j0Var.f141094a == re2.b.d.IT_WEB_CREATE_ACCT ? o1.CREATE_ACCOUNT : o1.SIGN_IN;
                        p0.f195200a.getClass();
                        Logger logger = p0.f195201b;
                        logger.debug("getDeviceQRCoreDeepLink");
                        AtomicReference<String> atomicReference = p0.f195203d;
                        String str3 = atomicReference.get();
                        if (str3 != null) {
                            logger.debug("getDeviceQRCoreDeepLink: handling cached setup wizard deep link");
                            if (w.z(str3, "/mobile-link/gcm/pair-device", false)) {
                                logger.debug("getDeviceQRCoreDeepLink: removing setup wizard deep link data");
                                atomicReference.set(null);
                                Uri uri = Uri.parse(str3);
                                uri.getClass();
                                dVarA = p0.a(uri);
                            }
                        } else {
                            logger.debug("getDeviceQRCoreDeepLink: There is no deep link data cached");
                        }
                        p2 p2Var = j0Var.f141099f;
                        if (dVarA != null) {
                            do {
                                value2 = p2Var.getValue();
                                i2.a aVar6 = i2.f36769a;
                                a2 a2Var = a2.GENERAL;
                                aVar6.getClass();
                                i2.a.b(a2Var, "PostUserAuthenticationViewModel", "Navigate to device setup with device QR code " + dVarA + ".");
                            } while (!p2Var.b(value2, new j0.b.f(o1Var, dVarA, userSettingsDTO, mVar)));
                        } else {
                            do {
                                value = p2Var.getValue();
                                i2.a aVar7 = i2.f36769a;
                                a2 a2Var2 = a2.GENERAL;
                                aVar7.getClass();
                                i2.a.b(a2Var2, "PostUserAuthenticationViewModel", "Navigate to device setup.");
                            } while (!p2Var.b(value, new j0.b.c(o1Var, userSettingsDTO, mVar)));
                        }
                    }
                }
                return Unit.INSTANCE;
            case 8:
                List list = (List) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                pv1.b bVar2 = (pv1.b) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i34 = pv1.b.f141488i1;
                if (zBooleanValue) {
                    ArrayList arrayList4 = list != null ? new ArrayList(list) : null;
                    if (arrayList4 != null) {
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj5 : arrayList3) {
                            if (!arrayList4.contains((String) obj5)) {
                                arrayList5.add(obj5);
                            }
                        }
                        arrayList4.addAll(arrayList5);
                    }
                    wt1.q.a aVar8 = wt1.q.f187120f;
                    if (arrayList4 == null || (listB1 = h0.b1(arrayList4)) == null) {
                        listB1 = p13.j0.f134944a;
                    }
                    aVar8.getClass();
                    List listF = wt1.q.a.f(listB1);
                    if (bVar2.p5()) {
                        bVar2.z5(h0.b1(listF));
                    } else {
                        bVar2.w5(h0.b1(listF));
                    }
                    bVar2.b5();
                }
                return Unit.INSTANCE;
            case 9:
                List list2 = (List) obj4;
                List list3 = (List) obj3;
                pv1.b bVar3 = (pv1.b) obj2;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                int i35 = pv1.b.f141488i1;
                if (zBooleanValue2) {
                    ArrayList arrayList6 = list2 != null ? new ArrayList(list2) : null;
                    if (arrayList6 != null) {
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj6 : list3) {
                            if (!arrayList6.contains((String) obj6)) {
                                arrayList7.add(obj6);
                            }
                        }
                        arrayList6.addAll(arrayList7);
                    }
                    if (bVar3.p5()) {
                        if (arrayList6 == null || (listB3 = h0.b1(arrayList6)) == null) {
                            listB3 = p13.j0.f134944a;
                        }
                        bVar3.z5(listB3);
                    } else {
                        if (arrayList6 == null || (listB2 = h0.b1(arrayList6)) == null) {
                            listB2 = p13.j0.f134944a;
                        }
                        bVar3.w5(listB2);
                    }
                    bVar3.b5();
                }
                return Unit.INSTANCE;
            case 10:
                Context context = (Context) obj3;
                o2.h hVar = (o2.h) obj2;
                x1.i iVar = (x1.i) obj;
                List<o2.b> list4 = ((o2.d) obj4).f128625a;
                int size = list4.size();
                for (int i36 = 0; i36 < size; i36++) {
                    o2.b bVar4 = list4.get(i36);
                    if (bVar4 instanceof o2.e) {
                        o2.e eVar2 = (o2.e) bVar4;
                        x1.i.b(iVar, new ov1.q(eVar2, 13), eVar2.f128627c == 0 ? null : new z3.e(-1930700965, true, new q2.j.a(bVar4)), new p40.o0(19, eVar2, hVar), 6);
                    } else if (bVar4 instanceof o2.i) {
                        o2.i iVar2 = (o2.i) bVar4;
                        u.f142195a.getClass();
                        if (context != null) {
                            int i37 = iVar2.f128637c;
                            TextClassification textClassification = iVar2.f128636b;
                            if (i37 < 0) {
                                ov1.q qVar2 = new ov1.q(textClassification, i18);
                                Drawable icon = textClassification.getIcon();
                                x1.i.b(iVar, qVar2, icon != null ? new z3.e(-1123224187, true, new q2.s(icon)) : null, new p40.o0(20, context, textClassification), 6);
                            } else {
                                RemoteAction remoteAction = textClassification.getActions().get(i37);
                                x1.i.b(iVar, new ov1.q(remoteAction, 15), ((i37 == 0) == true || remoteAction.shouldShowIcon()) ? new z3.e(-1261173016, true, new q2.t(remoteAction)) : null, new ov1.u(remoteAction, 29), 6);
                            }
                        }
                    } else if (bVar4 instanceof o2.g) {
                        f4.s<e23.q<x1.e, p3.m, Integer, Unit>> sVar = iVar.f188347b;
                        x1.a.f188327a.getClass();
                        sVar.add(x1.a.f188329c);
                    }
                }
                return Unit.INSTANCE;
            case 11:
                l42.c cVar = (l42.c) obj;
                cVar.getClass();
                ge1.b.T((o53.b0) obj4, null, null, new q42.x.g((mc) obj2, null), 3);
                ((y) obj3).A4(cVar);
                return Unit.INSTANCE;
            case 12:
                z zVar = (z) obj4;
                f0 f0Var = (f0) obj;
                q80.b bVar5 = q80.b.f143300a;
                f0Var.getClass();
                f0.f(f0Var, zVar.h(), null, new z3.e(1586585523, true, new i91.e(zVar, 23, (e23.l) obj3, (Context) obj2)), 6);
                return Unit.INSTANCE;
            case 13:
                e23.a aVar9 = (e23.a) obj3;
                lc.m0 m0Var = (lc.m0) obj2;
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                nk0.l lVar2 = new nk0.l(m0Var, i16);
                nk0.l lVar3 = new nk0.l(m0Var, 9);
                nk0.l lVar4 = new nk0.l(m0Var, 10);
                nk0.l lVar5 = new nk0.l(m0Var, i15);
                nk0.l lVar6 = new nk0.l(m0Var, 12);
                aVar9.getClass();
                z3.e eVar3 = new z3.e(1272652076, true, new ca0.e((b63.o) obj4, lVar2, lVar4, lVar3, aVar9, lVar5, lVar6));
                p13.k0 k0Var2 = p13.k0.f134949a;
                k0Var2.getClass();
                qn0.t tVar = qn0.t.f145817a;
                qn0.u uVar = qn0.u.f145818a;
                qn0.v vVar2 = qn0.v.f145819a;
                qn0.w wVar = qn0.w.f145820a;
                p13.j0 j0Var2 = p13.j0.f134944a;
                t0 t0Var = s0.f105811a;
                nc.n.a(k0Var, t0Var.b(qn0.l.class), k0Var2, j0Var2, tVar, uVar, vVar2, wVar, eVar3);
                HelpActivity.f36653a.getClass();
                lc.b bVar6 = new lc.b((lc.a) k0Var.f111792h.b(lc.a.class), t0Var.b(qn0.k.class), u0.h(p13.t0.b(HelpActivity.a.c()), k0Var2));
                bVar6.f111721i = t0Var.b(HelpActivity.class);
                k0Var.f111797m.add(bVar6.a());
                nc.n.a(k0Var, t0Var.b(qn0.n.class), k0Var2, j0Var2, qn0.y.f145822a, qn0.z.f145823a, a0.f145786a, qn0.b0.f145789a, new z3.e(-969555411, true, new r(aVar9, 5)));
                nc.n.a(k0Var, t0Var.b(qn0.j.class), k0Var2, j0Var2, qn0.o.f145812a, qn0.p.f145813a, qn0.q.f145814a, qn0.r.f145815a, new z3.e(-799241671, true, new a6.c(new nk0.l(m0Var, 13), 16)));
                return Unit.INSTANCE;
            case 14:
                qr.t tVar2 = (qr.t) obj3;
                w0.g1 g1Var = (w0.g1) obj2;
                Integer num = (Integer) obj;
                num.getClass();
                int i38 = qr.t.A2;
                Long l14 = ((ms1.d) obj4).f120487e;
                if (l14 != null) {
                    tVar2.E4(w0.g1.a(g1Var, l14, null, 55));
                } else {
                    tVar2.E4(w0.g1.a(g1Var, null, num, 47));
                }
                return Unit.INSTANCE;
            case 15:
                qt1.a aVar10 = (qt1.a) obj4;
                e23.l lVar7 = (e23.l) obj3;
                pt1.t tVar3 = (pt1.t) obj2;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue3 = bool.booleanValue();
                p2 p2Var2 = aVar10.f147498k;
                p2 p2Var3 = aVar10.f147496i;
                while (true) {
                    Object value5 = p2Var2.getValue();
                    Iterable<pt1.t> iterable = (Iterable) p2Var2.getValue();
                    ArrayList arrayList8 = new ArrayList(p13.y.r(iterable, i19));
                    for (pt1.t tVarA : iterable) {
                        p2 p2Var4 = p2Var3;
                        if (tVarA.f140967a == tVar3.f140967a) {
                            tVarA = pt1.t.a(tVarA, null, zBooleanValue3, 516095);
                        }
                        arrayList8.add(tVarA);
                        p2Var3 = p2Var4;
                    }
                    p2 p2Var5 = p2Var3;
                    if (p2Var2.b(value5, i53.a.e(arrayList8))) {
                        while (true) {
                            Object value6 = p2Var5.getValue();
                            Iterable<qs1.d> iterable2 = (Iterable) p2Var5.getValue();
                            ArrayList arrayList9 = new ArrayList(p13.y.r(iterable2, 10));
                            for (qs1.d dVarB : iterable2) {
                                Long curatedCourseId = dVarB.getCuratedCourseId();
                                long j8 = tVar3.f140967a;
                                if (curatedCourseId != null && curatedCourseId.longValue() == j8) {
                                    dVarB = qs1.d.b(dVarB, bool);
                                }
                                arrayList9.add(dVarB);
                            }
                            p2 p2Var6 = p2Var5;
                            if (p2Var6.b(value6, i53.a.e(arrayList9))) {
                                aVar10.H4();
                                if (lVar7 != null) {
                                    lVar7.invoke(bool);
                                }
                                return Unit.INSTANCE;
                            }
                            p2Var5 = p2Var6;
                        }
                    } else {
                        p2Var3 = p2Var5;
                        i19 = 10;
                    }
                }
                break;
            case 16:
                int i39 = qv2.a.f148169f;
                ((qv2.a) obj4).j((dx2.c) obj3, (Map) obj2, null);
                return Unit.INSTANCE;
            case 17:
                pw.a aVar11 = (pw.a) obj;
                aVar11.getClass();
                ge1.b.T((o53.b0) obj4, null, null, new qw.f.e((mc) obj2, null), 3);
                ((qw.g) obj3).y4(aVar11);
                return Unit.INSTANCE;
            case 18:
                e23.l lVar8 = (e23.l) obj3;
                p1 p1Var = (p1) obj2;
                qw0.m mVar2 = (qw0.m) h0.e0(((Integer) obj).intValue(), (List) obj4);
                if (mVar2 != null) {
                    com.garmin.android.library.mapsdkadapter.i.d dVar2 = mVar2.f148324a;
                    p1Var.setValue(dVar2);
                    lVar8.invoke(dVar2);
                }
                return Unit.INSTANCE;
            case 19:
                e23.l lVar9 = (e23.l) obj3;
                n1 n1Var = (n1) obj2;
                o13.p pVar = (o13.p) h0.e0(((Integer) obj).intValue(), (List) obj4);
                if (pVar != null) {
                    A a14 = pVar.f128594a;
                    n1Var.t(((Number) a14).intValue());
                    lVar9.invoke(a14);
                }
                return Unit.INSTANCE;
            case 20:
                final MultiDayActivitiesEditActivity multiDayActivitiesEditActivity = (MultiDayActivitiesEditActivity) obj4;
                final lc.m0 m0Var2 = (lc.m0) obj3;
                k0 k0Var3 = (k0) obj;
                MultiDayActivitiesEditActivity.a aVar12 = MultiDayActivitiesEditActivity.f39291b;
                k0Var3.getClass();
                z3.e eVar4 = new z3.e(1103979060, true, new i91.e(multiDayActivitiesEditActivity, 25, m0Var2, (cy0.k) obj2));
                p13.k0 k0Var4 = p13.k0.f134949a;
                k0Var4.getClass();
                p13.j0 j0Var3 = p13.j0.f134944a;
                t0 t0Var2 = s0.f105811a;
                nc.n.a(k0Var3, t0Var2.b(com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.a.e.class), k0Var4, j0Var3, null, null, null, null, eVar4);
                nc.n.a(k0Var3, t0Var2.b(com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.a.c.class), k0Var4, j0Var3, null, null, null, null, new z3.e(195400811, true, new e23.r() { // from class: qy0.h
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.r
                    public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                        int i44 = i28;
                        final int i45 = 0;
                        final MultiDayActivitiesEditActivity multiDayActivitiesEditActivity2 = multiDayActivitiesEditActivity;
                        lc.m0 m0Var3 = m0Var2;
                        l lVar10 = (l) obj7;
                        switch (i44) {
                            case 0:
                                m mVar3 = (m) obj9;
                                ((Integer) obj10).getClass();
                                MultiDayActivitiesEditActivity.a aVar13 = MultiDayActivitiesEditActivity.f39291b;
                                lVar10.getClass();
                                ((v) obj8).getClass();
                                x1 x1Var = n.f135158a;
                                z02.d.a(false, z3.f.c(1542959750, new b21.j0(m0Var3, 28), mVar3), null, null, null, z3.f.c(-79608062, new pp.g(p3.p0.c(multiDayActivitiesEditActivity2.ca().f101749h, mVar3, 0), 12, multiDayActivitiesEditActivity2, s9.c.c(multiDayActivitiesEditActivity2.ca().f101756o, mVar3)), mVar3), mVar3, 196656, 29);
                                break;
                            case 1:
                                m mVar4 = (m) obj9;
                                ((Integer) obj10).getClass();
                                MultiDayActivitiesEditActivity.a aVar14 = MultiDayActivitiesEditActivity.f39291b;
                                lVar10.getClass();
                                ((v) obj8).getClass();
                                x1 x1Var2 = n.f135158a;
                                final p1 p1VarC = s9.c.c(multiDayActivitiesEditActivity2.ca().f101755n, mVar4);
                                z02.d.a(false, z3.f.c(-1529404921, new b21.j0(m0Var3, 26), mVar4), null, null, null, z3.f.c(1142994563, new p() { // from class: qy0.e
                                    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
                                    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
                                    /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
                                    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
                                    @Override // e23.p
                                    public final Object invoke(Object obj11, Object obj12) {
                                        int i46 = i45;
                                        m.a aVar15 = m.f135153a;
                                        x3 x3Var = p1VarC;
                                        MultiDayActivitiesEditActivity multiDayActivitiesEditActivity3 = multiDayActivitiesEditActivity2;
                                        switch (i46) {
                                            case 0:
                                                m mVar5 = (m) obj11;
                                                int iIntValue = ((Integer) obj12).intValue();
                                                MultiDayActivitiesEditActivity.a aVar16 = MultiDayActivitiesEditActivity.f39291b;
                                                if (mVar5.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                    x1 x1Var3 = n.f135158a;
                                                    k30.n nVar2 = (k30.n) x3Var.getF182175a();
                                                    boolean zR = mVar5.r(multiDayActivitiesEditActivity3);
                                                    Object objQ = mVar5.q();
                                                    if (zR) {
                                                        objQ = new f(multiDayActivitiesEditActivity3, 7);
                                                        mVar5.K(objQ);
                                                    } else {
                                                        aVar15.getClass();
                                                        if (objQ == m.a.f135155b) {
                                                            objQ = new f(multiDayActivitiesEditActivity3, 7);
                                                            mVar5.K(objQ);
                                                        }
                                                    }
                                                    e23.l lVar11 = (e23.l) objQ;
                                                    boolean zR2 = mVar5.r(multiDayActivitiesEditActivity3);
                                                    Object objQ2 = mVar5.q();
                                                    if (zR2) {
                                                        objQ2 = new f(multiDayActivitiesEditActivity3, 8);
                                                        mVar5.K(objQ2);
                                                    } else {
                                                        aVar15.getClass();
                                                        if (objQ2 == m.a.f135155b) {
                                                            objQ2 = new f(multiDayActivitiesEditActivity3, 8);
                                                            mVar5.K(objQ2);
                                                        }
                                                    }
                                                    jy0.k.a(nVar2, lVar11, (e23.l) objQ2, mVar5, 0);
                                                } else {
                                                    mVar5.e();
                                                }
                                                break;
                                            default:
                                                m mVar6 = (m) obj11;
                                                int iIntValue2 = ((Integer) obj12).intValue();
                                                MultiDayActivitiesEditActivity.a aVar17 = MultiDayActivitiesEditActivity.f39291b;
                                                if (mVar6.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    x1 x1Var4 = n.f135158a;
                                                    i53.c<x0> cVar2 = ((sy0.b) x3Var.getF182175a()).f161202b;
                                                    i53.e<x0> eVar5 = ((sy0.b) x3Var.getF182175a()).f161203c;
                                                    boolean zR3 = mVar6.r(multiDayActivitiesEditActivity3);
                                                    Object objQ3 = mVar6.q();
                                                    if (zR3) {
                                                        objQ3 = new g(multiDayActivitiesEditActivity3, 2);
                                                        mVar6.K(objQ3);
                                                    } else {
                                                        aVar15.getClass();
                                                        if (objQ3 == m.a.f135155b) {
                                                            objQ3 = new g(multiDayActivitiesEditActivity3, 2);
                                                            mVar6.K(objQ3);
                                                        }
                                                    }
                                                    e23.a aVar18 = (e23.a) objQ3;
                                                    boolean zR4 = mVar6.r(multiDayActivitiesEditActivity3);
                                                    Object objQ4 = mVar6.q();
                                                    if (zR4) {
                                                        objQ4 = new f(multiDayActivitiesEditActivity3, 4);
                                                        mVar6.K(objQ4);
                                                    } else {
                                                        aVar15.getClass();
                                                        if (objQ4 == m.a.f135155b) {
                                                            objQ4 = new f(multiDayActivitiesEditActivity3, 4);
                                                            mVar6.K(objQ4);
                                                        }
                                                    }
                                                    d0.b(cVar2, eVar5, aVar18, (e23.l) objQ4, mVar6, 0);
                                                } else {
                                                    mVar6.e();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar4), mVar4, 196656, 29);
                                break;
                            case 2:
                                m mVar5 = (m) obj9;
                                ((Integer) obj10).getClass();
                                MultiDayActivitiesEditActivity.a aVar15 = MultiDayActivitiesEditActivity.f39291b;
                                lVar10.getClass();
                                ((v) obj8).getClass();
                                x1 x1Var3 = n.f135158a;
                                MultiDayActivitiesEditActivity multiDayActivitiesEditActivity3 = multiDayActivitiesEditActivity;
                                sy0.j jVar2 = (sy0.j) p3.p0.c(multiDayActivitiesEditActivity3.ca().f101749h, mVar5, 0).getF182175a();
                                p1 p1VarC2 = s9.c.c(multiDayActivitiesEditActivity3.ca().f101751j, mVar5);
                                Object objQ = mVar5.q();
                                m.f135153a.getClass();
                                m.a.C2565a c2565a = m.a.f135155b;
                                if (objQ == c2565a) {
                                    objQ = p3.p0.n(Boolean.FALSE);
                                    mVar5.K(objQ);
                                }
                                p1 p1Var2 = (p1) objQ;
                                Object objQ2 = mVar5.q();
                                if (objQ2 == c2565a) {
                                    objQ2 = new pp.b(p1Var2, 8);
                                    mVar5.K(objQ2);
                                }
                                z02.d.a(((Boolean) p1Var2.getF182175a()).booleanValue(), z3.f.c(-306802296, new b21.j0(m0Var3, 24), mVar5), null, null, null, z3.f.c(-1929370108, new d(p1VarC2, multiDayActivitiesEditActivity3, jVar2, (e23.l) objQ2, 0), mVar5), mVar5, 196656, 28);
                                break;
                            case 3:
                                m mVar6 = (m) obj9;
                                ((Integer) obj10).getClass();
                                MultiDayActivitiesEditActivity.a aVar16 = MultiDayActivitiesEditActivity.f39291b;
                                lVar10.getClass();
                                ((v) obj8).getClass();
                                x1 x1Var4 = n.f135158a;
                                final p1 p1VarC3 = s9.c.c(multiDayActivitiesEditActivity2.ca().f101751j, mVar6);
                                final int i46 = 1;
                                z02.d.a(false, z3.f.c(915800329, new b21.j0(m0Var3, 27), mVar6), null, null, null, z3.f.c(-706767483, new p() { // from class: qy0.e
                                    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
                                    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
                                    /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
                                    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
                                    @Override // e23.p
                                    public final Object invoke(Object obj11, Object obj12) {
                                        int i47 = i46;
                                        m.a aVar17 = m.f135153a;
                                        x3 x3Var = p1VarC3;
                                        MultiDayActivitiesEditActivity multiDayActivitiesEditActivity4 = multiDayActivitiesEditActivity2;
                                        switch (i47) {
                                            case 0:
                                                m mVar7 = (m) obj11;
                                                int iIntValue = ((Integer) obj12).intValue();
                                                MultiDayActivitiesEditActivity.a aVar18 = MultiDayActivitiesEditActivity.f39291b;
                                                if (mVar7.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                    x1 x1Var5 = n.f135158a;
                                                    k30.n nVar2 = (k30.n) x3Var.getF182175a();
                                                    boolean zR = mVar7.r(multiDayActivitiesEditActivity4);
                                                    Object objQ3 = mVar7.q();
                                                    if (zR) {
                                                        objQ3 = new f(multiDayActivitiesEditActivity4, 7);
                                                        mVar7.K(objQ3);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ3 == m.a.f135155b) {
                                                            objQ3 = new f(multiDayActivitiesEditActivity4, 7);
                                                            mVar7.K(objQ3);
                                                        }
                                                    }
                                                    e23.l lVar11 = (e23.l) objQ3;
                                                    boolean zR2 = mVar7.r(multiDayActivitiesEditActivity4);
                                                    Object objQ4 = mVar7.q();
                                                    if (zR2) {
                                                        objQ4 = new f(multiDayActivitiesEditActivity4, 8);
                                                        mVar7.K(objQ4);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ4 == m.a.f135155b) {
                                                            objQ4 = new f(multiDayActivitiesEditActivity4, 8);
                                                            mVar7.K(objQ4);
                                                        }
                                                    }
                                                    jy0.k.a(nVar2, lVar11, (e23.l) objQ4, mVar7, 0);
                                                } else {
                                                    mVar7.e();
                                                }
                                                break;
                                            default:
                                                m mVar8 = (m) obj11;
                                                int iIntValue2 = ((Integer) obj12).intValue();
                                                MultiDayActivitiesEditActivity.a aVar19 = MultiDayActivitiesEditActivity.f39291b;
                                                if (mVar8.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    x1 x1Var6 = n.f135158a;
                                                    i53.c<x0> cVar2 = ((sy0.b) x3Var.getF182175a()).f161202b;
                                                    i53.e<x0> eVar5 = ((sy0.b) x3Var.getF182175a()).f161203c;
                                                    boolean zR3 = mVar8.r(multiDayActivitiesEditActivity4);
                                                    Object objQ5 = mVar8.q();
                                                    if (zR3) {
                                                        objQ5 = new g(multiDayActivitiesEditActivity4, 2);
                                                        mVar8.K(objQ5);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ5 == m.a.f135155b) {
                                                            objQ5 = new g(multiDayActivitiesEditActivity4, 2);
                                                            mVar8.K(objQ5);
                                                        }
                                                    }
                                                    e23.a aVar110 = (e23.a) objQ5;
                                                    boolean zR4 = mVar8.r(multiDayActivitiesEditActivity4);
                                                    Object objQ6 = mVar8.q();
                                                    if (zR4) {
                                                        objQ6 = new f(multiDayActivitiesEditActivity4, 4);
                                                        mVar8.K(objQ6);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ6 == m.a.f135155b) {
                                                            objQ6 = new f(multiDayActivitiesEditActivity4, 4);
                                                            mVar8.K(objQ6);
                                                        }
                                                    }
                                                    d0.b(cVar2, eVar5, aVar110, (e23.l) objQ6, mVar8, 0);
                                                } else {
                                                    mVar8.e();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar6), mVar6, 196656, 29);
                                break;
                            default:
                                m mVar7 = (m) obj9;
                                ((Integer) obj10).getClass();
                                MultiDayActivitiesEditActivity.a aVar17 = MultiDayActivitiesEditActivity.f39291b;
                                lVar10.getClass();
                                ((v) obj8).getClass();
                                x1 x1Var5 = n.f135158a;
                                z02.d.a(false, z3.f.c(2138402954, new b21.j0(m0Var3, 25), mVar7), null, null, null, z3.f.c(515835142, new q72.f(11, (sy0.j) p3.p0.c(multiDayActivitiesEditActivity2.ca().f101749h, mVar7, 0).getF182175a(), multiDayActivitiesEditActivity2), mVar7), mVar7, 196656, 29);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                nc.n.a(k0Var3, t0Var2.b(com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.a.d.class), k0Var4, j0Var3, null, null, null, null, new z3.e(1418003436, true, new e23.r() { // from class: qy0.h
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.r
                    public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                        int i44 = i27;
                        final int i45 = 0;
                        final MultiDayActivitiesEditActivity multiDayActivitiesEditActivity2 = multiDayActivitiesEditActivity;
                        lc.m0 m0Var3 = m0Var2;
                        l lVar10 = (l) obj7;
                        switch (i44) {
                            case 0:
                                m mVar3 = (m) obj9;
                                ((Integer) obj10).getClass();
                                MultiDayActivitiesEditActivity.a aVar13 = MultiDayActivitiesEditActivity.f39291b;
                                lVar10.getClass();
                                ((v) obj8).getClass();
                                x1 x1Var = n.f135158a;
                                z02.d.a(false, z3.f.c(1542959750, new b21.j0(m0Var3, 28), mVar3), null, null, null, z3.f.c(-79608062, new pp.g(p3.p0.c(multiDayActivitiesEditActivity2.ca().f101749h, mVar3, 0), 12, multiDayActivitiesEditActivity2, s9.c.c(multiDayActivitiesEditActivity2.ca().f101756o, mVar3)), mVar3), mVar3, 196656, 29);
                                break;
                            case 1:
                                m mVar4 = (m) obj9;
                                ((Integer) obj10).getClass();
                                MultiDayActivitiesEditActivity.a aVar14 = MultiDayActivitiesEditActivity.f39291b;
                                lVar10.getClass();
                                ((v) obj8).getClass();
                                x1 x1Var2 = n.f135158a;
                                final p1 p1VarC = s9.c.c(multiDayActivitiesEditActivity2.ca().f101755n, mVar4);
                                z02.d.a(false, z3.f.c(-1529404921, new b21.j0(m0Var3, 26), mVar4), null, null, null, z3.f.c(1142994563, new p() { // from class: qy0.e
                                    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
                                    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
                                    /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
                                    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
                                    @Override // e23.p
                                    public final Object invoke(Object obj11, Object obj12) {
                                        int i47 = i45;
                                        m.a aVar17 = m.f135153a;
                                        x3 x3Var = p1VarC;
                                        MultiDayActivitiesEditActivity multiDayActivitiesEditActivity4 = multiDayActivitiesEditActivity2;
                                        switch (i47) {
                                            case 0:
                                                m mVar7 = (m) obj11;
                                                int iIntValue = ((Integer) obj12).intValue();
                                                MultiDayActivitiesEditActivity.a aVar18 = MultiDayActivitiesEditActivity.f39291b;
                                                if (mVar7.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                    x1 x1Var5 = n.f135158a;
                                                    k30.n nVar2 = (k30.n) x3Var.getF182175a();
                                                    boolean zR = mVar7.r(multiDayActivitiesEditActivity4);
                                                    Object objQ3 = mVar7.q();
                                                    if (zR) {
                                                        objQ3 = new f(multiDayActivitiesEditActivity4, 7);
                                                        mVar7.K(objQ3);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ3 == m.a.f135155b) {
                                                            objQ3 = new f(multiDayActivitiesEditActivity4, 7);
                                                            mVar7.K(objQ3);
                                                        }
                                                    }
                                                    e23.l lVar11 = (e23.l) objQ3;
                                                    boolean zR2 = mVar7.r(multiDayActivitiesEditActivity4);
                                                    Object objQ4 = mVar7.q();
                                                    if (zR2) {
                                                        objQ4 = new f(multiDayActivitiesEditActivity4, 8);
                                                        mVar7.K(objQ4);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ4 == m.a.f135155b) {
                                                            objQ4 = new f(multiDayActivitiesEditActivity4, 8);
                                                            mVar7.K(objQ4);
                                                        }
                                                    }
                                                    jy0.k.a(nVar2, lVar11, (e23.l) objQ4, mVar7, 0);
                                                } else {
                                                    mVar7.e();
                                                }
                                                break;
                                            default:
                                                m mVar8 = (m) obj11;
                                                int iIntValue2 = ((Integer) obj12).intValue();
                                                MultiDayActivitiesEditActivity.a aVar19 = MultiDayActivitiesEditActivity.f39291b;
                                                if (mVar8.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    x1 x1Var6 = n.f135158a;
                                                    i53.c<x0> cVar2 = ((sy0.b) x3Var.getF182175a()).f161202b;
                                                    i53.e<x0> eVar5 = ((sy0.b) x3Var.getF182175a()).f161203c;
                                                    boolean zR3 = mVar8.r(multiDayActivitiesEditActivity4);
                                                    Object objQ5 = mVar8.q();
                                                    if (zR3) {
                                                        objQ5 = new g(multiDayActivitiesEditActivity4, 2);
                                                        mVar8.K(objQ5);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ5 == m.a.f135155b) {
                                                            objQ5 = new g(multiDayActivitiesEditActivity4, 2);
                                                            mVar8.K(objQ5);
                                                        }
                                                    }
                                                    e23.a aVar110 = (e23.a) objQ5;
                                                    boolean zR4 = mVar8.r(multiDayActivitiesEditActivity4);
                                                    Object objQ6 = mVar8.q();
                                                    if (zR4) {
                                                        objQ6 = new f(multiDayActivitiesEditActivity4, 4);
                                                        mVar8.K(objQ6);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ6 == m.a.f135155b) {
                                                            objQ6 = new f(multiDayActivitiesEditActivity4, 4);
                                                            mVar8.K(objQ6);
                                                        }
                                                    }
                                                    d0.b(cVar2, eVar5, aVar110, (e23.l) objQ6, mVar8, 0);
                                                } else {
                                                    mVar8.e();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar4), mVar4, 196656, 29);
                                break;
                            case 2:
                                m mVar5 = (m) obj9;
                                ((Integer) obj10).getClass();
                                MultiDayActivitiesEditActivity.a aVar15 = MultiDayActivitiesEditActivity.f39291b;
                                lVar10.getClass();
                                ((v) obj8).getClass();
                                x1 x1Var3 = n.f135158a;
                                MultiDayActivitiesEditActivity multiDayActivitiesEditActivity3 = multiDayActivitiesEditActivity;
                                sy0.j jVar2 = (sy0.j) p3.p0.c(multiDayActivitiesEditActivity3.ca().f101749h, mVar5, 0).getF182175a();
                                p1 p1VarC2 = s9.c.c(multiDayActivitiesEditActivity3.ca().f101751j, mVar5);
                                Object objQ = mVar5.q();
                                m.f135153a.getClass();
                                m.a.C2565a c2565a = m.a.f135155b;
                                if (objQ == c2565a) {
                                    objQ = p3.p0.n(Boolean.FALSE);
                                    mVar5.K(objQ);
                                }
                                p1 p1Var2 = (p1) objQ;
                                Object objQ2 = mVar5.q();
                                if (objQ2 == c2565a) {
                                    objQ2 = new pp.b(p1Var2, 8);
                                    mVar5.K(objQ2);
                                }
                                z02.d.a(((Boolean) p1Var2.getF182175a()).booleanValue(), z3.f.c(-306802296, new b21.j0(m0Var3, 24), mVar5), null, null, null, z3.f.c(-1929370108, new d(p1VarC2, multiDayActivitiesEditActivity3, jVar2, (e23.l) objQ2, 0), mVar5), mVar5, 196656, 28);
                                break;
                            case 3:
                                m mVar6 = (m) obj9;
                                ((Integer) obj10).getClass();
                                MultiDayActivitiesEditActivity.a aVar16 = MultiDayActivitiesEditActivity.f39291b;
                                lVar10.getClass();
                                ((v) obj8).getClass();
                                x1 x1Var4 = n.f135158a;
                                final p1 p1VarC3 = s9.c.c(multiDayActivitiesEditActivity2.ca().f101751j, mVar6);
                                final int i46 = 1;
                                z02.d.a(false, z3.f.c(915800329, new b21.j0(m0Var3, 27), mVar6), null, null, null, z3.f.c(-706767483, new p() { // from class: qy0.e
                                    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
                                    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
                                    /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
                                    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
                                    @Override // e23.p
                                    public final Object invoke(Object obj11, Object obj12) {
                                        int i47 = i46;
                                        m.a aVar17 = m.f135153a;
                                        x3 x3Var = p1VarC3;
                                        MultiDayActivitiesEditActivity multiDayActivitiesEditActivity4 = multiDayActivitiesEditActivity2;
                                        switch (i47) {
                                            case 0:
                                                m mVar7 = (m) obj11;
                                                int iIntValue = ((Integer) obj12).intValue();
                                                MultiDayActivitiesEditActivity.a aVar18 = MultiDayActivitiesEditActivity.f39291b;
                                                if (mVar7.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                    x1 x1Var5 = n.f135158a;
                                                    k30.n nVar2 = (k30.n) x3Var.getF182175a();
                                                    boolean zR = mVar7.r(multiDayActivitiesEditActivity4);
                                                    Object objQ3 = mVar7.q();
                                                    if (zR) {
                                                        objQ3 = new f(multiDayActivitiesEditActivity4, 7);
                                                        mVar7.K(objQ3);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ3 == m.a.f135155b) {
                                                            objQ3 = new f(multiDayActivitiesEditActivity4, 7);
                                                            mVar7.K(objQ3);
                                                        }
                                                    }
                                                    e23.l lVar11 = (e23.l) objQ3;
                                                    boolean zR2 = mVar7.r(multiDayActivitiesEditActivity4);
                                                    Object objQ4 = mVar7.q();
                                                    if (zR2) {
                                                        objQ4 = new f(multiDayActivitiesEditActivity4, 8);
                                                        mVar7.K(objQ4);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ4 == m.a.f135155b) {
                                                            objQ4 = new f(multiDayActivitiesEditActivity4, 8);
                                                            mVar7.K(objQ4);
                                                        }
                                                    }
                                                    jy0.k.a(nVar2, lVar11, (e23.l) objQ4, mVar7, 0);
                                                } else {
                                                    mVar7.e();
                                                }
                                                break;
                                            default:
                                                m mVar8 = (m) obj11;
                                                int iIntValue2 = ((Integer) obj12).intValue();
                                                MultiDayActivitiesEditActivity.a aVar19 = MultiDayActivitiesEditActivity.f39291b;
                                                if (mVar8.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    x1 x1Var6 = n.f135158a;
                                                    i53.c<x0> cVar2 = ((sy0.b) x3Var.getF182175a()).f161202b;
                                                    i53.e<x0> eVar5 = ((sy0.b) x3Var.getF182175a()).f161203c;
                                                    boolean zR3 = mVar8.r(multiDayActivitiesEditActivity4);
                                                    Object objQ5 = mVar8.q();
                                                    if (zR3) {
                                                        objQ5 = new g(multiDayActivitiesEditActivity4, 2);
                                                        mVar8.K(objQ5);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ5 == m.a.f135155b) {
                                                            objQ5 = new g(multiDayActivitiesEditActivity4, 2);
                                                            mVar8.K(objQ5);
                                                        }
                                                    }
                                                    e23.a aVar110 = (e23.a) objQ5;
                                                    boolean zR4 = mVar8.r(multiDayActivitiesEditActivity4);
                                                    Object objQ6 = mVar8.q();
                                                    if (zR4) {
                                                        objQ6 = new f(multiDayActivitiesEditActivity4, 4);
                                                        mVar8.K(objQ6);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ6 == m.a.f135155b) {
                                                            objQ6 = new f(multiDayActivitiesEditActivity4, 4);
                                                            mVar8.K(objQ6);
                                                        }
                                                    }
                                                    d0.b(cVar2, eVar5, aVar110, (e23.l) objQ6, mVar8, 0);
                                                } else {
                                                    mVar8.e();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar6), mVar6, 196656, 29);
                                break;
                            default:
                                m mVar7 = (m) obj9;
                                ((Integer) obj10).getClass();
                                MultiDayActivitiesEditActivity.a aVar17 = MultiDayActivitiesEditActivity.f39291b;
                                lVar10.getClass();
                                ((v) obj8).getClass();
                                x1 x1Var5 = n.f135158a;
                                z02.d.a(false, z3.f.c(2138402954, new b21.j0(m0Var3, 25), mVar7), null, null, null, z3.f.c(515835142, new q72.f(11, (sy0.j) p3.p0.c(multiDayActivitiesEditActivity2.ca().f101749h, mVar7, 0).getF182175a(), multiDayActivitiesEditActivity2), mVar7), mVar7, 196656, 29);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                nc.n.a(k0Var3, t0Var2.b(com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.a.C0701a.class), k0Var4, j0Var3, null, null, null, null, new z3.e(-1654361235, true, new e23.r() { // from class: qy0.h
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.r
                    public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                        int i44 = i24;
                        final int i45 = 0;
                        final MultiDayActivitiesEditActivity multiDayActivitiesEditActivity2 = multiDayActivitiesEditActivity;
                        lc.m0 m0Var3 = m0Var2;
                        l lVar10 = (l) obj7;
                        switch (i44) {
                            case 0:
                                m mVar3 = (m) obj9;
                                ((Integer) obj10).getClass();
                                MultiDayActivitiesEditActivity.a aVar13 = MultiDayActivitiesEditActivity.f39291b;
                                lVar10.getClass();
                                ((v) obj8).getClass();
                                x1 x1Var = n.f135158a;
                                z02.d.a(false, z3.f.c(1542959750, new b21.j0(m0Var3, 28), mVar3), null, null, null, z3.f.c(-79608062, new pp.g(p3.p0.c(multiDayActivitiesEditActivity2.ca().f101749h, mVar3, 0), 12, multiDayActivitiesEditActivity2, s9.c.c(multiDayActivitiesEditActivity2.ca().f101756o, mVar3)), mVar3), mVar3, 196656, 29);
                                break;
                            case 1:
                                m mVar4 = (m) obj9;
                                ((Integer) obj10).getClass();
                                MultiDayActivitiesEditActivity.a aVar14 = MultiDayActivitiesEditActivity.f39291b;
                                lVar10.getClass();
                                ((v) obj8).getClass();
                                x1 x1Var2 = n.f135158a;
                                final p1 p1VarC = s9.c.c(multiDayActivitiesEditActivity2.ca().f101755n, mVar4);
                                z02.d.a(false, z3.f.c(-1529404921, new b21.j0(m0Var3, 26), mVar4), null, null, null, z3.f.c(1142994563, new p() { // from class: qy0.e
                                    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
                                    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
                                    /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
                                    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
                                    @Override // e23.p
                                    public final Object invoke(Object obj11, Object obj12) {
                                        int i47 = i45;
                                        m.a aVar17 = m.f135153a;
                                        x3 x3Var = p1VarC;
                                        MultiDayActivitiesEditActivity multiDayActivitiesEditActivity4 = multiDayActivitiesEditActivity2;
                                        switch (i47) {
                                            case 0:
                                                m mVar7 = (m) obj11;
                                                int iIntValue = ((Integer) obj12).intValue();
                                                MultiDayActivitiesEditActivity.a aVar18 = MultiDayActivitiesEditActivity.f39291b;
                                                if (mVar7.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                    x1 x1Var5 = n.f135158a;
                                                    k30.n nVar2 = (k30.n) x3Var.getF182175a();
                                                    boolean zR = mVar7.r(multiDayActivitiesEditActivity4);
                                                    Object objQ3 = mVar7.q();
                                                    if (zR) {
                                                        objQ3 = new f(multiDayActivitiesEditActivity4, 7);
                                                        mVar7.K(objQ3);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ3 == m.a.f135155b) {
                                                            objQ3 = new f(multiDayActivitiesEditActivity4, 7);
                                                            mVar7.K(objQ3);
                                                        }
                                                    }
                                                    e23.l lVar11 = (e23.l) objQ3;
                                                    boolean zR2 = mVar7.r(multiDayActivitiesEditActivity4);
                                                    Object objQ4 = mVar7.q();
                                                    if (zR2) {
                                                        objQ4 = new f(multiDayActivitiesEditActivity4, 8);
                                                        mVar7.K(objQ4);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ4 == m.a.f135155b) {
                                                            objQ4 = new f(multiDayActivitiesEditActivity4, 8);
                                                            mVar7.K(objQ4);
                                                        }
                                                    }
                                                    jy0.k.a(nVar2, lVar11, (e23.l) objQ4, mVar7, 0);
                                                } else {
                                                    mVar7.e();
                                                }
                                                break;
                                            default:
                                                m mVar8 = (m) obj11;
                                                int iIntValue2 = ((Integer) obj12).intValue();
                                                MultiDayActivitiesEditActivity.a aVar19 = MultiDayActivitiesEditActivity.f39291b;
                                                if (mVar8.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    x1 x1Var6 = n.f135158a;
                                                    i53.c<x0> cVar2 = ((sy0.b) x3Var.getF182175a()).f161202b;
                                                    i53.e<x0> eVar5 = ((sy0.b) x3Var.getF182175a()).f161203c;
                                                    boolean zR3 = mVar8.r(multiDayActivitiesEditActivity4);
                                                    Object objQ5 = mVar8.q();
                                                    if (zR3) {
                                                        objQ5 = new g(multiDayActivitiesEditActivity4, 2);
                                                        mVar8.K(objQ5);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ5 == m.a.f135155b) {
                                                            objQ5 = new g(multiDayActivitiesEditActivity4, 2);
                                                            mVar8.K(objQ5);
                                                        }
                                                    }
                                                    e23.a aVar110 = (e23.a) objQ5;
                                                    boolean zR4 = mVar8.r(multiDayActivitiesEditActivity4);
                                                    Object objQ6 = mVar8.q();
                                                    if (zR4) {
                                                        objQ6 = new f(multiDayActivitiesEditActivity4, 4);
                                                        mVar8.K(objQ6);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ6 == m.a.f135155b) {
                                                            objQ6 = new f(multiDayActivitiesEditActivity4, 4);
                                                            mVar8.K(objQ6);
                                                        }
                                                    }
                                                    d0.b(cVar2, eVar5, aVar110, (e23.l) objQ6, mVar8, 0);
                                                } else {
                                                    mVar8.e();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar4), mVar4, 196656, 29);
                                break;
                            case 2:
                                m mVar5 = (m) obj9;
                                ((Integer) obj10).getClass();
                                MultiDayActivitiesEditActivity.a aVar15 = MultiDayActivitiesEditActivity.f39291b;
                                lVar10.getClass();
                                ((v) obj8).getClass();
                                x1 x1Var3 = n.f135158a;
                                MultiDayActivitiesEditActivity multiDayActivitiesEditActivity3 = multiDayActivitiesEditActivity;
                                sy0.j jVar2 = (sy0.j) p3.p0.c(multiDayActivitiesEditActivity3.ca().f101749h, mVar5, 0).getF182175a();
                                p1 p1VarC2 = s9.c.c(multiDayActivitiesEditActivity3.ca().f101751j, mVar5);
                                Object objQ = mVar5.q();
                                m.f135153a.getClass();
                                m.a.C2565a c2565a = m.a.f135155b;
                                if (objQ == c2565a) {
                                    objQ = p3.p0.n(Boolean.FALSE);
                                    mVar5.K(objQ);
                                }
                                p1 p1Var2 = (p1) objQ;
                                Object objQ2 = mVar5.q();
                                if (objQ2 == c2565a) {
                                    objQ2 = new pp.b(p1Var2, 8);
                                    mVar5.K(objQ2);
                                }
                                z02.d.a(((Boolean) p1Var2.getF182175a()).booleanValue(), z3.f.c(-306802296, new b21.j0(m0Var3, 24), mVar5), null, null, null, z3.f.c(-1929370108, new d(p1VarC2, multiDayActivitiesEditActivity3, jVar2, (e23.l) objQ2, 0), mVar5), mVar5, 196656, 28);
                                break;
                            case 3:
                                m mVar6 = (m) obj9;
                                ((Integer) obj10).getClass();
                                MultiDayActivitiesEditActivity.a aVar16 = MultiDayActivitiesEditActivity.f39291b;
                                lVar10.getClass();
                                ((v) obj8).getClass();
                                x1 x1Var4 = n.f135158a;
                                final p1 p1VarC3 = s9.c.c(multiDayActivitiesEditActivity2.ca().f101751j, mVar6);
                                final int i46 = 1;
                                z02.d.a(false, z3.f.c(915800329, new b21.j0(m0Var3, 27), mVar6), null, null, null, z3.f.c(-706767483, new p() { // from class: qy0.e
                                    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
                                    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
                                    /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
                                    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
                                    @Override // e23.p
                                    public final Object invoke(Object obj11, Object obj12) {
                                        int i47 = i46;
                                        m.a aVar17 = m.f135153a;
                                        x3 x3Var = p1VarC3;
                                        MultiDayActivitiesEditActivity multiDayActivitiesEditActivity4 = multiDayActivitiesEditActivity2;
                                        switch (i47) {
                                            case 0:
                                                m mVar7 = (m) obj11;
                                                int iIntValue = ((Integer) obj12).intValue();
                                                MultiDayActivitiesEditActivity.a aVar18 = MultiDayActivitiesEditActivity.f39291b;
                                                if (mVar7.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                    x1 x1Var5 = n.f135158a;
                                                    k30.n nVar2 = (k30.n) x3Var.getF182175a();
                                                    boolean zR = mVar7.r(multiDayActivitiesEditActivity4);
                                                    Object objQ3 = mVar7.q();
                                                    if (zR) {
                                                        objQ3 = new f(multiDayActivitiesEditActivity4, 7);
                                                        mVar7.K(objQ3);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ3 == m.a.f135155b) {
                                                            objQ3 = new f(multiDayActivitiesEditActivity4, 7);
                                                            mVar7.K(objQ3);
                                                        }
                                                    }
                                                    e23.l lVar11 = (e23.l) objQ3;
                                                    boolean zR2 = mVar7.r(multiDayActivitiesEditActivity4);
                                                    Object objQ4 = mVar7.q();
                                                    if (zR2) {
                                                        objQ4 = new f(multiDayActivitiesEditActivity4, 8);
                                                        mVar7.K(objQ4);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ4 == m.a.f135155b) {
                                                            objQ4 = new f(multiDayActivitiesEditActivity4, 8);
                                                            mVar7.K(objQ4);
                                                        }
                                                    }
                                                    jy0.k.a(nVar2, lVar11, (e23.l) objQ4, mVar7, 0);
                                                } else {
                                                    mVar7.e();
                                                }
                                                break;
                                            default:
                                                m mVar8 = (m) obj11;
                                                int iIntValue2 = ((Integer) obj12).intValue();
                                                MultiDayActivitiesEditActivity.a aVar19 = MultiDayActivitiesEditActivity.f39291b;
                                                if (mVar8.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    x1 x1Var6 = n.f135158a;
                                                    i53.c<x0> cVar2 = ((sy0.b) x3Var.getF182175a()).f161202b;
                                                    i53.e<x0> eVar5 = ((sy0.b) x3Var.getF182175a()).f161203c;
                                                    boolean zR3 = mVar8.r(multiDayActivitiesEditActivity4);
                                                    Object objQ5 = mVar8.q();
                                                    if (zR3) {
                                                        objQ5 = new g(multiDayActivitiesEditActivity4, 2);
                                                        mVar8.K(objQ5);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ5 == m.a.f135155b) {
                                                            objQ5 = new g(multiDayActivitiesEditActivity4, 2);
                                                            mVar8.K(objQ5);
                                                        }
                                                    }
                                                    e23.a aVar110 = (e23.a) objQ5;
                                                    boolean zR4 = mVar8.r(multiDayActivitiesEditActivity4);
                                                    Object objQ6 = mVar8.q();
                                                    if (zR4) {
                                                        objQ6 = new f(multiDayActivitiesEditActivity4, 4);
                                                        mVar8.K(objQ6);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ6 == m.a.f135155b) {
                                                            objQ6 = new f(multiDayActivitiesEditActivity4, 4);
                                                            mVar8.K(objQ6);
                                                        }
                                                    }
                                                    d0.b(cVar2, eVar5, aVar110, (e23.l) objQ6, mVar8, 0);
                                                } else {
                                                    mVar8.e();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar6), mVar6, 196656, 29);
                                break;
                            default:
                                m mVar7 = (m) obj9;
                                ((Integer) obj10).getClass();
                                MultiDayActivitiesEditActivity.a aVar17 = MultiDayActivitiesEditActivity.f39291b;
                                lVar10.getClass();
                                ((v) obj8).getClass();
                                x1 x1Var5 = n.f135158a;
                                z02.d.a(false, z3.f.c(2138402954, new b21.j0(m0Var3, 25), mVar7), null, null, null, z3.f.c(515835142, new q72.f(11, (sy0.j) p3.p0.c(multiDayActivitiesEditActivity2.ca().f101749h, mVar7, 0).getF182175a(), multiDayActivitiesEditActivity2), mVar7), mVar7, 196656, 29);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                nc.n.a(k0Var3, t0Var2.b(com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.a.b.class), k0Var4, j0Var3, null, null, null, null, new z3.e(-431758610, true, new e23.r() { // from class: qy0.h
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.r
                    public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                        int i44 = i26;
                        final int i45 = 0;
                        final MultiDayActivitiesEditActivity multiDayActivitiesEditActivity2 = multiDayActivitiesEditActivity;
                        lc.m0 m0Var3 = m0Var2;
                        l lVar10 = (l) obj7;
                        switch (i44) {
                            case 0:
                                m mVar3 = (m) obj9;
                                ((Integer) obj10).getClass();
                                MultiDayActivitiesEditActivity.a aVar13 = MultiDayActivitiesEditActivity.f39291b;
                                lVar10.getClass();
                                ((v) obj8).getClass();
                                x1 x1Var = n.f135158a;
                                z02.d.a(false, z3.f.c(1542959750, new b21.j0(m0Var3, 28), mVar3), null, null, null, z3.f.c(-79608062, new pp.g(p3.p0.c(multiDayActivitiesEditActivity2.ca().f101749h, mVar3, 0), 12, multiDayActivitiesEditActivity2, s9.c.c(multiDayActivitiesEditActivity2.ca().f101756o, mVar3)), mVar3), mVar3, 196656, 29);
                                break;
                            case 1:
                                m mVar4 = (m) obj9;
                                ((Integer) obj10).getClass();
                                MultiDayActivitiesEditActivity.a aVar14 = MultiDayActivitiesEditActivity.f39291b;
                                lVar10.getClass();
                                ((v) obj8).getClass();
                                x1 x1Var2 = n.f135158a;
                                final p1 p1VarC = s9.c.c(multiDayActivitiesEditActivity2.ca().f101755n, mVar4);
                                z02.d.a(false, z3.f.c(-1529404921, new b21.j0(m0Var3, 26), mVar4), null, null, null, z3.f.c(1142994563, new p() { // from class: qy0.e
                                    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
                                    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
                                    /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
                                    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
                                    @Override // e23.p
                                    public final Object invoke(Object obj11, Object obj12) {
                                        int i47 = i45;
                                        m.a aVar17 = m.f135153a;
                                        x3 x3Var = p1VarC;
                                        MultiDayActivitiesEditActivity multiDayActivitiesEditActivity4 = multiDayActivitiesEditActivity2;
                                        switch (i47) {
                                            case 0:
                                                m mVar7 = (m) obj11;
                                                int iIntValue = ((Integer) obj12).intValue();
                                                MultiDayActivitiesEditActivity.a aVar18 = MultiDayActivitiesEditActivity.f39291b;
                                                if (mVar7.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                    x1 x1Var5 = n.f135158a;
                                                    k30.n nVar2 = (k30.n) x3Var.getF182175a();
                                                    boolean zR = mVar7.r(multiDayActivitiesEditActivity4);
                                                    Object objQ3 = mVar7.q();
                                                    if (zR) {
                                                        objQ3 = new f(multiDayActivitiesEditActivity4, 7);
                                                        mVar7.K(objQ3);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ3 == m.a.f135155b) {
                                                            objQ3 = new f(multiDayActivitiesEditActivity4, 7);
                                                            mVar7.K(objQ3);
                                                        }
                                                    }
                                                    e23.l lVar11 = (e23.l) objQ3;
                                                    boolean zR2 = mVar7.r(multiDayActivitiesEditActivity4);
                                                    Object objQ4 = mVar7.q();
                                                    if (zR2) {
                                                        objQ4 = new f(multiDayActivitiesEditActivity4, 8);
                                                        mVar7.K(objQ4);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ4 == m.a.f135155b) {
                                                            objQ4 = new f(multiDayActivitiesEditActivity4, 8);
                                                            mVar7.K(objQ4);
                                                        }
                                                    }
                                                    jy0.k.a(nVar2, lVar11, (e23.l) objQ4, mVar7, 0);
                                                } else {
                                                    mVar7.e();
                                                }
                                                break;
                                            default:
                                                m mVar8 = (m) obj11;
                                                int iIntValue2 = ((Integer) obj12).intValue();
                                                MultiDayActivitiesEditActivity.a aVar19 = MultiDayActivitiesEditActivity.f39291b;
                                                if (mVar8.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    x1 x1Var6 = n.f135158a;
                                                    i53.c<x0> cVar2 = ((sy0.b) x3Var.getF182175a()).f161202b;
                                                    i53.e<x0> eVar5 = ((sy0.b) x3Var.getF182175a()).f161203c;
                                                    boolean zR3 = mVar8.r(multiDayActivitiesEditActivity4);
                                                    Object objQ5 = mVar8.q();
                                                    if (zR3) {
                                                        objQ5 = new g(multiDayActivitiesEditActivity4, 2);
                                                        mVar8.K(objQ5);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ5 == m.a.f135155b) {
                                                            objQ5 = new g(multiDayActivitiesEditActivity4, 2);
                                                            mVar8.K(objQ5);
                                                        }
                                                    }
                                                    e23.a aVar110 = (e23.a) objQ5;
                                                    boolean zR4 = mVar8.r(multiDayActivitiesEditActivity4);
                                                    Object objQ6 = mVar8.q();
                                                    if (zR4) {
                                                        objQ6 = new f(multiDayActivitiesEditActivity4, 4);
                                                        mVar8.K(objQ6);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ6 == m.a.f135155b) {
                                                            objQ6 = new f(multiDayActivitiesEditActivity4, 4);
                                                            mVar8.K(objQ6);
                                                        }
                                                    }
                                                    d0.b(cVar2, eVar5, aVar110, (e23.l) objQ6, mVar8, 0);
                                                } else {
                                                    mVar8.e();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar4), mVar4, 196656, 29);
                                break;
                            case 2:
                                m mVar5 = (m) obj9;
                                ((Integer) obj10).getClass();
                                MultiDayActivitiesEditActivity.a aVar15 = MultiDayActivitiesEditActivity.f39291b;
                                lVar10.getClass();
                                ((v) obj8).getClass();
                                x1 x1Var3 = n.f135158a;
                                MultiDayActivitiesEditActivity multiDayActivitiesEditActivity3 = multiDayActivitiesEditActivity;
                                sy0.j jVar2 = (sy0.j) p3.p0.c(multiDayActivitiesEditActivity3.ca().f101749h, mVar5, 0).getF182175a();
                                p1 p1VarC2 = s9.c.c(multiDayActivitiesEditActivity3.ca().f101751j, mVar5);
                                Object objQ = mVar5.q();
                                m.f135153a.getClass();
                                m.a.C2565a c2565a = m.a.f135155b;
                                if (objQ == c2565a) {
                                    objQ = p3.p0.n(Boolean.FALSE);
                                    mVar5.K(objQ);
                                }
                                p1 p1Var2 = (p1) objQ;
                                Object objQ2 = mVar5.q();
                                if (objQ2 == c2565a) {
                                    objQ2 = new pp.b(p1Var2, 8);
                                    mVar5.K(objQ2);
                                }
                                z02.d.a(((Boolean) p1Var2.getF182175a()).booleanValue(), z3.f.c(-306802296, new b21.j0(m0Var3, 24), mVar5), null, null, null, z3.f.c(-1929370108, new d(p1VarC2, multiDayActivitiesEditActivity3, jVar2, (e23.l) objQ2, 0), mVar5), mVar5, 196656, 28);
                                break;
                            case 3:
                                m mVar6 = (m) obj9;
                                ((Integer) obj10).getClass();
                                MultiDayActivitiesEditActivity.a aVar16 = MultiDayActivitiesEditActivity.f39291b;
                                lVar10.getClass();
                                ((v) obj8).getClass();
                                x1 x1Var4 = n.f135158a;
                                final p1 p1VarC3 = s9.c.c(multiDayActivitiesEditActivity2.ca().f101751j, mVar6);
                                final int i46 = 1;
                                z02.d.a(false, z3.f.c(915800329, new b21.j0(m0Var3, 27), mVar6), null, null, null, z3.f.c(-706767483, new p() { // from class: qy0.e
                                    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
                                    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
                                    /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
                                    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
                                    @Override // e23.p
                                    public final Object invoke(Object obj11, Object obj12) {
                                        int i47 = i46;
                                        m.a aVar17 = m.f135153a;
                                        x3 x3Var = p1VarC3;
                                        MultiDayActivitiesEditActivity multiDayActivitiesEditActivity4 = multiDayActivitiesEditActivity2;
                                        switch (i47) {
                                            case 0:
                                                m mVar7 = (m) obj11;
                                                int iIntValue = ((Integer) obj12).intValue();
                                                MultiDayActivitiesEditActivity.a aVar18 = MultiDayActivitiesEditActivity.f39291b;
                                                if (mVar7.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                    x1 x1Var5 = n.f135158a;
                                                    k30.n nVar2 = (k30.n) x3Var.getF182175a();
                                                    boolean zR = mVar7.r(multiDayActivitiesEditActivity4);
                                                    Object objQ3 = mVar7.q();
                                                    if (zR) {
                                                        objQ3 = new f(multiDayActivitiesEditActivity4, 7);
                                                        mVar7.K(objQ3);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ3 == m.a.f135155b) {
                                                            objQ3 = new f(multiDayActivitiesEditActivity4, 7);
                                                            mVar7.K(objQ3);
                                                        }
                                                    }
                                                    e23.l lVar11 = (e23.l) objQ3;
                                                    boolean zR2 = mVar7.r(multiDayActivitiesEditActivity4);
                                                    Object objQ4 = mVar7.q();
                                                    if (zR2) {
                                                        objQ4 = new f(multiDayActivitiesEditActivity4, 8);
                                                        mVar7.K(objQ4);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ4 == m.a.f135155b) {
                                                            objQ4 = new f(multiDayActivitiesEditActivity4, 8);
                                                            mVar7.K(objQ4);
                                                        }
                                                    }
                                                    jy0.k.a(nVar2, lVar11, (e23.l) objQ4, mVar7, 0);
                                                } else {
                                                    mVar7.e();
                                                }
                                                break;
                                            default:
                                                m mVar8 = (m) obj11;
                                                int iIntValue2 = ((Integer) obj12).intValue();
                                                MultiDayActivitiesEditActivity.a aVar19 = MultiDayActivitiesEditActivity.f39291b;
                                                if (mVar8.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    x1 x1Var6 = n.f135158a;
                                                    i53.c<x0> cVar2 = ((sy0.b) x3Var.getF182175a()).f161202b;
                                                    i53.e<x0> eVar5 = ((sy0.b) x3Var.getF182175a()).f161203c;
                                                    boolean zR3 = mVar8.r(multiDayActivitiesEditActivity4);
                                                    Object objQ5 = mVar8.q();
                                                    if (zR3) {
                                                        objQ5 = new g(multiDayActivitiesEditActivity4, 2);
                                                        mVar8.K(objQ5);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ5 == m.a.f135155b) {
                                                            objQ5 = new g(multiDayActivitiesEditActivity4, 2);
                                                            mVar8.K(objQ5);
                                                        }
                                                    }
                                                    e23.a aVar110 = (e23.a) objQ5;
                                                    boolean zR4 = mVar8.r(multiDayActivitiesEditActivity4);
                                                    Object objQ6 = mVar8.q();
                                                    if (zR4) {
                                                        objQ6 = new f(multiDayActivitiesEditActivity4, 4);
                                                        mVar8.K(objQ6);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ6 == m.a.f135155b) {
                                                            objQ6 = new f(multiDayActivitiesEditActivity4, 4);
                                                            mVar8.K(objQ6);
                                                        }
                                                    }
                                                    d0.b(cVar2, eVar5, aVar110, (e23.l) objQ6, mVar8, 0);
                                                } else {
                                                    mVar8.e();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar6), mVar6, 196656, 29);
                                break;
                            default:
                                m mVar7 = (m) obj9;
                                ((Integer) obj10).getClass();
                                MultiDayActivitiesEditActivity.a aVar17 = MultiDayActivitiesEditActivity.f39291b;
                                lVar10.getClass();
                                ((v) obj8).getClass();
                                x1 x1Var5 = n.f135158a;
                                z02.d.a(false, z3.f.c(2138402954, new b21.j0(m0Var3, 25), mVar7), null, null, null, z3.f.c(515835142, new q72.f(11, (sy0.j) p3.p0.c(multiDayActivitiesEditActivity2.ca().f101749h, mVar7, 0).getF182175a(), multiDayActivitiesEditActivity2), mVar7), mVar7, 196656, 29);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                nc.n.a(k0Var3, t0Var2.b(com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.a.f.class), k0Var4, j0Var3, null, null, null, null, new z3.e(790844015, true, new e23.r() { // from class: qy0.h
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.r
                    public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                        int i44 = i25;
                        final int i45 = 0;
                        final MultiDayActivitiesEditActivity multiDayActivitiesEditActivity2 = multiDayActivitiesEditActivity;
                        lc.m0 m0Var3 = m0Var2;
                        l lVar10 = (l) obj7;
                        switch (i44) {
                            case 0:
                                m mVar3 = (m) obj9;
                                ((Integer) obj10).getClass();
                                MultiDayActivitiesEditActivity.a aVar13 = MultiDayActivitiesEditActivity.f39291b;
                                lVar10.getClass();
                                ((v) obj8).getClass();
                                x1 x1Var = n.f135158a;
                                z02.d.a(false, z3.f.c(1542959750, new b21.j0(m0Var3, 28), mVar3), null, null, null, z3.f.c(-79608062, new pp.g(p3.p0.c(multiDayActivitiesEditActivity2.ca().f101749h, mVar3, 0), 12, multiDayActivitiesEditActivity2, s9.c.c(multiDayActivitiesEditActivity2.ca().f101756o, mVar3)), mVar3), mVar3, 196656, 29);
                                break;
                            case 1:
                                m mVar4 = (m) obj9;
                                ((Integer) obj10).getClass();
                                MultiDayActivitiesEditActivity.a aVar14 = MultiDayActivitiesEditActivity.f39291b;
                                lVar10.getClass();
                                ((v) obj8).getClass();
                                x1 x1Var2 = n.f135158a;
                                final p1 p1VarC = s9.c.c(multiDayActivitiesEditActivity2.ca().f101755n, mVar4);
                                z02.d.a(false, z3.f.c(-1529404921, new b21.j0(m0Var3, 26), mVar4), null, null, null, z3.f.c(1142994563, new p() { // from class: qy0.e
                                    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
                                    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
                                    /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
                                    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
                                    @Override // e23.p
                                    public final Object invoke(Object obj11, Object obj12) {
                                        int i47 = i45;
                                        m.a aVar17 = m.f135153a;
                                        x3 x3Var = p1VarC;
                                        MultiDayActivitiesEditActivity multiDayActivitiesEditActivity4 = multiDayActivitiesEditActivity2;
                                        switch (i47) {
                                            case 0:
                                                m mVar7 = (m) obj11;
                                                int iIntValue = ((Integer) obj12).intValue();
                                                MultiDayActivitiesEditActivity.a aVar18 = MultiDayActivitiesEditActivity.f39291b;
                                                if (mVar7.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                    x1 x1Var5 = n.f135158a;
                                                    k30.n nVar2 = (k30.n) x3Var.getF182175a();
                                                    boolean zR = mVar7.r(multiDayActivitiesEditActivity4);
                                                    Object objQ3 = mVar7.q();
                                                    if (zR) {
                                                        objQ3 = new f(multiDayActivitiesEditActivity4, 7);
                                                        mVar7.K(objQ3);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ3 == m.a.f135155b) {
                                                            objQ3 = new f(multiDayActivitiesEditActivity4, 7);
                                                            mVar7.K(objQ3);
                                                        }
                                                    }
                                                    e23.l lVar11 = (e23.l) objQ3;
                                                    boolean zR2 = mVar7.r(multiDayActivitiesEditActivity4);
                                                    Object objQ4 = mVar7.q();
                                                    if (zR2) {
                                                        objQ4 = new f(multiDayActivitiesEditActivity4, 8);
                                                        mVar7.K(objQ4);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ4 == m.a.f135155b) {
                                                            objQ4 = new f(multiDayActivitiesEditActivity4, 8);
                                                            mVar7.K(objQ4);
                                                        }
                                                    }
                                                    jy0.k.a(nVar2, lVar11, (e23.l) objQ4, mVar7, 0);
                                                } else {
                                                    mVar7.e();
                                                }
                                                break;
                                            default:
                                                m mVar8 = (m) obj11;
                                                int iIntValue2 = ((Integer) obj12).intValue();
                                                MultiDayActivitiesEditActivity.a aVar19 = MultiDayActivitiesEditActivity.f39291b;
                                                if (mVar8.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    x1 x1Var6 = n.f135158a;
                                                    i53.c<x0> cVar2 = ((sy0.b) x3Var.getF182175a()).f161202b;
                                                    i53.e<x0> eVar5 = ((sy0.b) x3Var.getF182175a()).f161203c;
                                                    boolean zR3 = mVar8.r(multiDayActivitiesEditActivity4);
                                                    Object objQ5 = mVar8.q();
                                                    if (zR3) {
                                                        objQ5 = new g(multiDayActivitiesEditActivity4, 2);
                                                        mVar8.K(objQ5);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ5 == m.a.f135155b) {
                                                            objQ5 = new g(multiDayActivitiesEditActivity4, 2);
                                                            mVar8.K(objQ5);
                                                        }
                                                    }
                                                    e23.a aVar110 = (e23.a) objQ5;
                                                    boolean zR4 = mVar8.r(multiDayActivitiesEditActivity4);
                                                    Object objQ6 = mVar8.q();
                                                    if (zR4) {
                                                        objQ6 = new f(multiDayActivitiesEditActivity4, 4);
                                                        mVar8.K(objQ6);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ6 == m.a.f135155b) {
                                                            objQ6 = new f(multiDayActivitiesEditActivity4, 4);
                                                            mVar8.K(objQ6);
                                                        }
                                                    }
                                                    d0.b(cVar2, eVar5, aVar110, (e23.l) objQ6, mVar8, 0);
                                                } else {
                                                    mVar8.e();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar4), mVar4, 196656, 29);
                                break;
                            case 2:
                                m mVar5 = (m) obj9;
                                ((Integer) obj10).getClass();
                                MultiDayActivitiesEditActivity.a aVar15 = MultiDayActivitiesEditActivity.f39291b;
                                lVar10.getClass();
                                ((v) obj8).getClass();
                                x1 x1Var3 = n.f135158a;
                                MultiDayActivitiesEditActivity multiDayActivitiesEditActivity3 = multiDayActivitiesEditActivity;
                                sy0.j jVar2 = (sy0.j) p3.p0.c(multiDayActivitiesEditActivity3.ca().f101749h, mVar5, 0).getF182175a();
                                p1 p1VarC2 = s9.c.c(multiDayActivitiesEditActivity3.ca().f101751j, mVar5);
                                Object objQ = mVar5.q();
                                m.f135153a.getClass();
                                m.a.C2565a c2565a = m.a.f135155b;
                                if (objQ == c2565a) {
                                    objQ = p3.p0.n(Boolean.FALSE);
                                    mVar5.K(objQ);
                                }
                                p1 p1Var2 = (p1) objQ;
                                Object objQ2 = mVar5.q();
                                if (objQ2 == c2565a) {
                                    objQ2 = new pp.b(p1Var2, 8);
                                    mVar5.K(objQ2);
                                }
                                z02.d.a(((Boolean) p1Var2.getF182175a()).booleanValue(), z3.f.c(-306802296, new b21.j0(m0Var3, 24), mVar5), null, null, null, z3.f.c(-1929370108, new d(p1VarC2, multiDayActivitiesEditActivity3, jVar2, (e23.l) objQ2, 0), mVar5), mVar5, 196656, 28);
                                break;
                            case 3:
                                m mVar6 = (m) obj9;
                                ((Integer) obj10).getClass();
                                MultiDayActivitiesEditActivity.a aVar16 = MultiDayActivitiesEditActivity.f39291b;
                                lVar10.getClass();
                                ((v) obj8).getClass();
                                x1 x1Var4 = n.f135158a;
                                final p1 p1VarC3 = s9.c.c(multiDayActivitiesEditActivity2.ca().f101751j, mVar6);
                                final int i46 = 1;
                                z02.d.a(false, z3.f.c(915800329, new b21.j0(m0Var3, 27), mVar6), null, null, null, z3.f.c(-706767483, new p() { // from class: qy0.e
                                    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
                                    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
                                    /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
                                    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
                                    @Override // e23.p
                                    public final Object invoke(Object obj11, Object obj12) {
                                        int i47 = i46;
                                        m.a aVar17 = m.f135153a;
                                        x3 x3Var = p1VarC3;
                                        MultiDayActivitiesEditActivity multiDayActivitiesEditActivity4 = multiDayActivitiesEditActivity2;
                                        switch (i47) {
                                            case 0:
                                                m mVar7 = (m) obj11;
                                                int iIntValue = ((Integer) obj12).intValue();
                                                MultiDayActivitiesEditActivity.a aVar18 = MultiDayActivitiesEditActivity.f39291b;
                                                if (mVar7.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                    x1 x1Var5 = n.f135158a;
                                                    k30.n nVar2 = (k30.n) x3Var.getF182175a();
                                                    boolean zR = mVar7.r(multiDayActivitiesEditActivity4);
                                                    Object objQ3 = mVar7.q();
                                                    if (zR) {
                                                        objQ3 = new f(multiDayActivitiesEditActivity4, 7);
                                                        mVar7.K(objQ3);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ3 == m.a.f135155b) {
                                                            objQ3 = new f(multiDayActivitiesEditActivity4, 7);
                                                            mVar7.K(objQ3);
                                                        }
                                                    }
                                                    e23.l lVar11 = (e23.l) objQ3;
                                                    boolean zR2 = mVar7.r(multiDayActivitiesEditActivity4);
                                                    Object objQ4 = mVar7.q();
                                                    if (zR2) {
                                                        objQ4 = new f(multiDayActivitiesEditActivity4, 8);
                                                        mVar7.K(objQ4);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ4 == m.a.f135155b) {
                                                            objQ4 = new f(multiDayActivitiesEditActivity4, 8);
                                                            mVar7.K(objQ4);
                                                        }
                                                    }
                                                    jy0.k.a(nVar2, lVar11, (e23.l) objQ4, mVar7, 0);
                                                } else {
                                                    mVar7.e();
                                                }
                                                break;
                                            default:
                                                m mVar8 = (m) obj11;
                                                int iIntValue2 = ((Integer) obj12).intValue();
                                                MultiDayActivitiesEditActivity.a aVar19 = MultiDayActivitiesEditActivity.f39291b;
                                                if (mVar8.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    x1 x1Var6 = n.f135158a;
                                                    i53.c<x0> cVar2 = ((sy0.b) x3Var.getF182175a()).f161202b;
                                                    i53.e<x0> eVar5 = ((sy0.b) x3Var.getF182175a()).f161203c;
                                                    boolean zR3 = mVar8.r(multiDayActivitiesEditActivity4);
                                                    Object objQ5 = mVar8.q();
                                                    if (zR3) {
                                                        objQ5 = new g(multiDayActivitiesEditActivity4, 2);
                                                        mVar8.K(objQ5);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ5 == m.a.f135155b) {
                                                            objQ5 = new g(multiDayActivitiesEditActivity4, 2);
                                                            mVar8.K(objQ5);
                                                        }
                                                    }
                                                    e23.a aVar110 = (e23.a) objQ5;
                                                    boolean zR4 = mVar8.r(multiDayActivitiesEditActivity4);
                                                    Object objQ6 = mVar8.q();
                                                    if (zR4) {
                                                        objQ6 = new f(multiDayActivitiesEditActivity4, 4);
                                                        mVar8.K(objQ6);
                                                    } else {
                                                        aVar17.getClass();
                                                        if (objQ6 == m.a.f135155b) {
                                                            objQ6 = new f(multiDayActivitiesEditActivity4, 4);
                                                            mVar8.K(objQ6);
                                                        }
                                                    }
                                                    d0.b(cVar2, eVar5, aVar110, (e23.l) objQ6, mVar8, 0);
                                                } else {
                                                    mVar8.e();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar6), mVar6, 196656, 29);
                                break;
                            default:
                                m mVar7 = (m) obj9;
                                ((Integer) obj10).getClass();
                                MultiDayActivitiesEditActivity.a aVar17 = MultiDayActivitiesEditActivity.f39291b;
                                lVar10.getClass();
                                ((v) obj8).getClass();
                                x1 x1Var5 = n.f135158a;
                                z02.d.a(false, z3.f.c(2138402954, new b21.j0(m0Var3, 25), mVar7), null, null, null, z3.f.c(515835142, new q72.f(11, (sy0.j) p3.p0.c(multiDayActivitiesEditActivity2.ca().f101749h, mVar7, 0).getF182175a(), multiDayActivitiesEditActivity2), mVar7), mVar7, 196656, 29);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                return Unit.INSTANCE;
            case 21:
                n0 n0Var2 = (n0) obj4;
                ((i0) obj).getClass();
                androidx.core.view.q qVar3 = new androidx.core.view.q(i17, (List) obj3, (com.garmin.android.apps.connectmobile.onboarding.presentation.a) obj2);
                n0Var2.getF158016a().a(qVar3);
                return new com.garmin.android.apps.connectmobile.onboarding.presentation.a.C0717a(n0Var2, qVar3);
            case 22:
                CoursePointListActivity coursePointListActivity = (CoursePointListActivity) obj4;
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                GeoPointDTO geoPointDTO = (GeoPointDTO) obj;
                CoursePointListActivity.a aVar13 = CoursePointListActivity.f33079c;
                geoPointDTO.getClass();
                coursePointListActivity.da().x4();
                coursePointListActivity.da().z4();
                r50.g gVarDa = coursePointListActivity.da();
                Double d14 = geoPointDTO.latitude;
                double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                Double d15 = geoPointDTO.longitude;
                LatLng latLng = new LatLng(dDoubleValue, d15 != null ? d15.doubleValue() : 0.0d);
                Double d16 = geoPointDTO.distance;
                gVarDa.getClass();
                str4.getClass();
                gVarDa.y4(new t50.c.a(str4, latLng, str5, true, d16));
                return Unit.INSTANCE;
            case 23:
                ((CustomLineChart) obj).getClass();
                qz.a.b((tz.a) obj4, (n60.b) obj3, (String) obj2, 4);
                return Unit.INSTANCE;
            case 24:
                final r0 r0Var = (r0) obj3;
                final e23.l lVar10 = (e23.l) obj2;
                f0 f0Var2 = (f0) obj;
                f0Var2.getClass();
                f0.b(f0Var2, null, new z3.e(-274773900, true, new ng2.i((r72.i) obj4, i18, r0Var, lVar10)), 3);
                f0.b(f0Var2, null, new z3.e(955241259, true, new e23.q() { // from class: r72.l
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.q
                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                        int i44 = i28;
                        e23.l lVar11 = lVar10;
                        r0 r0Var2 = r0Var;
                        e2.d dVar3 = (e2.d) obj7;
                        p3.m mVar3 = (p3.m) obj8;
                        int iIntValue = ((Integer) obj9).intValue();
                        switch (i44) {
                            case 0:
                                dVar3.getClass();
                                if (mVar3.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    x1 x1Var = p3.n.f135158a;
                                    n.d(((i) r0Var2.f105810a).f151179b, new m(r0Var2, lVar11, 1), mVar3, 0);
                                } else {
                                    mVar3.e();
                                }
                                break;
                            case 1:
                                dVar3.getClass();
                                if (mVar3.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    x1 x1Var2 = p3.n.f135158a;
                                    n.e(((i) r0Var2.f105810a).f151180c, new m(r0Var2, lVar11, 2), mVar3, 0);
                                } else {
                                    mVar3.e();
                                }
                                break;
                            default:
                                dVar3.getClass();
                                if (mVar3.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    x1 x1Var3 = p3.n.f135158a;
                                    n.a((i) r0Var2.f105810a, new m(r0Var2, lVar11, 3), mVar3, 0);
                                } else {
                                    mVar3.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                f0.b(f0Var2, null, new z3.e(-804118612, true, new e23.q() { // from class: r72.l
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.q
                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                        int i44 = i27;
                        e23.l lVar11 = lVar10;
                        r0 r0Var2 = r0Var;
                        e2.d dVar3 = (e2.d) obj7;
                        p3.m mVar3 = (p3.m) obj8;
                        int iIntValue = ((Integer) obj9).intValue();
                        switch (i44) {
                            case 0:
                                dVar3.getClass();
                                if (mVar3.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    x1 x1Var = p3.n.f135158a;
                                    n.d(((i) r0Var2.f105810a).f151179b, new m(r0Var2, lVar11, 1), mVar3, 0);
                                } else {
                                    mVar3.e();
                                }
                                break;
                            case 1:
                                dVar3.getClass();
                                if (mVar3.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    x1 x1Var2 = p3.n.f135158a;
                                    n.e(((i) r0Var2.f105810a).f151180c, new m(r0Var2, lVar11, 2), mVar3, 0);
                                } else {
                                    mVar3.e();
                                }
                                break;
                            default:
                                dVar3.getClass();
                                if (mVar3.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    x1 x1Var3 = p3.n.f135158a;
                                    n.a((i) r0Var2.f105810a, new m(r0Var2, lVar11, 3), mVar3, 0);
                                } else {
                                    mVar3.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                f0.b(f0Var2, null, new z3.e(1731488813, true, new e23.q() { // from class: r72.l
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.q
                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                        int i44 = i24;
                        e23.l lVar11 = lVar10;
                        r0 r0Var2 = r0Var;
                        e2.d dVar3 = (e2.d) obj7;
                        p3.m mVar3 = (p3.m) obj8;
                        int iIntValue = ((Integer) obj9).intValue();
                        switch (i44) {
                            case 0:
                                dVar3.getClass();
                                if (mVar3.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    x1 x1Var = p3.n.f135158a;
                                    n.d(((i) r0Var2.f105810a).f151179b, new m(r0Var2, lVar11, 1), mVar3, 0);
                                } else {
                                    mVar3.e();
                                }
                                break;
                            case 1:
                                dVar3.getClass();
                                if (mVar3.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    x1 x1Var2 = p3.n.f135158a;
                                    n.e(((i) r0Var2.f105810a).f151180c, new m(r0Var2, lVar11, 2), mVar3, 0);
                                } else {
                                    mVar3.e();
                                }
                                break;
                            default:
                                dVar3.getClass();
                                if (mVar3.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    x1 x1Var3 = p3.n.f135158a;
                                    n.a((i) r0Var2.f105810a, new m(r0Var2, lVar11, 3), mVar3, 0);
                                } else {
                                    mVar3.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                r72.b.f151165a.getClass();
                f0.b(f0Var2, null, r72.b.f151166b, 3);
                return Unit.INSTANCE;
            case 25:
                rk0.j jVar2 = (rk0.j) obj4;
                e23.l lVar11 = (e23.l) obj3;
                p1 p1Var2 = (p1) obj2;
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                String str6 = i3Var.f111063a;
                if (s.g(str6, "MENU_ITEM_EDIT")) {
                    jk0.j jVar3 = jVar2.f153165a;
                    if (jVar3 != null) {
                        lVar11.invoke(jVar3);
                    }
                } else if (s.g(str6, "MENU_ITEM_DELETE")) {
                    p1Var2.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 26:
                rk0.f0 f0Var3 = (rk0.f0) obj4;
                e23.p pVar2 = (e23.p) obj3;
                String str7 = (String) obj2;
                x0 x0Var = (x0) obj;
                x0Var.getClass();
                i53.d<x0, Integer> dVar3 = f0Var3.f153120v;
                if (dVar3 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<x0, Integer> entry : dVar3.entrySet()) {
                        if (z0.d(entry.getKey(), entry.getKey()) == x0Var) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                if (linkedHashMap != null && (!linkedHashMap.isEmpty())) {
                    pVar2.invoke(f0Var3.f153101a, new rk0.w0(str7, linkedHashMap));
                }
                return Unit.INSTANCE;
            case 27:
                d1 d1Var = (d1) obj3;
                e2.i0 i0Var = (e2.i0) obj2;
                x0 x0Var2 = (x0) obj;
                if (x0Var2 != ((c1) ((p1) obj4).getF182175a()).f153084d) {
                    p2 p2Var7 = d1Var.f153090b;
                    do {
                        value3 = p2Var7.getValue();
                        c1Var = (c1) value3;
                    } while (!p2Var7.b(value3, new c1(c1Var.f153081a, c1Var.f153082b, c1Var.f153083c, x0Var2, c1Var.f153085e)));
                    p2 p2Var8 = d1Var.f153092d;
                    do {
                        value4 = p2Var8.getValue();
                    } while (!p2Var8.b(value4, d1Var.x4()));
                    e2.i0.a aVar14 = e2.i0.f62432x;
                    i0Var.k(0, 0);
                }
                return Unit.INSTANCE;
            case 28:
                mm1.b bVar7 = (mm1.b) obj4;
                tz.a aVar15 = (tz.a) obj3;
                String str8 = (String) obj2;
                ((CustomLineChart) obj).getClass();
                xm1.c cVar2 = new xm1.c((bVar7 == null || (listB = bVar7.b()) == null) ? null : vm1.a.f(listB), (bVar7 == null || (overallStats2 = bVar7.getOverallStats()) == null) ? null : overallStats2.getAverageLocalSleepEndTime(), (bVar7 == null || (overallStats = bVar7.getOverallStats()) == null) ? null : overallStats.getAverageLocalSleepStartTime());
                List<xm1.e> list5 = cVar2.f191497a;
                if (list5 != null) {
                    arrayList = new ArrayList();
                    for (Object obj7 : list5) {
                        if (w5.r.s((xm1.e) obj7)) {
                            arrayList.add(obj7);
                        }
                    }
                }
                qz.a.b(aVar15, new xm1.c(arrayList, cVar2.f191498b, cVar2.f191499c), str8, 4);
                return Unit.INSTANCE;
            default:
                ro0.q qVar4 = (ro0.q) obj4;
                Context context2 = (Context) obj3;
                p1 p1Var3 = (p1) obj2;
                if (((Boolean) obj).booleanValue()) {
                    String str9 = (String) p1Var3.getF182175a();
                    context2.getClass();
                    str9.getClass();
                    ge1.b.T(v1.a(qVar4), null, null, new ro0.r(context2, qVar4, str9, null), 3);
                } else {
                    j22.b bVar8 = j22.b.f96736a;
                    j22.a aVar16 = j22.a.f96722k;
                    bVar8.getClass();
                    Toast.makeText(context2, j22.b.f(aVar16), 0).show();
                }
                return Unit.INSTANCE;
        }
    }
}
