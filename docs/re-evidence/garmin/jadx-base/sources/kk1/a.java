package kk1;

import am.x0;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.i0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.f0;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.h0;
import com.garmin.android.apps.connectmobile.leaderboard.model.s;
import com.garmin.android.apps.connectmobile.settings.developersettings.TestGoogleAgeSignalsActivity;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.maps.android.compose.CameraPositionState;
import e23.l;
import e23.p;
import e23.q;
import hk1.a0;
import i3.fe;
import i3.ij;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l3.u;
import l30.z;
import ly0.o;
import mt0.b1;
import mt0.m3;
import n40.m;
import nw0.e0;
import nw0.r;
import o53.b0;
import o53.d0;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;
import org.koin.core.parameter.ParametersHolderKt;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p006l2.j0;
import p006l2.k0;
import p13.y;
import p3.n1;
import p3.o1;
import p3.p0;
import p3.p1;
import p3.x3;
import r22.q0;
import r53.p2;
import w2.n;
import z2.h2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f105132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f105133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f105134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f105135d;

    public /* synthetic */ a(p1 p1Var, p1 p1Var2, p1 p1Var3) {
        this.f105132a = 10;
        this.f105135d = p1Var;
        this.f105133b = p1Var2;
        this.f105134c = p1Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        Object value;
        String message;
        nt2.e eVar;
        int i14 = this.f105132a;
        Object obj = this.f105135d;
        Object obj2 = this.f105134c;
        Object obj3 = this.f105133b;
        switch (i14) {
            case 0:
                g gVar = (g) obj3;
                ((p1) obj).setValue(Boolean.FALSE);
                String strQ = ((a0) obj2).q();
                strQ.getClass();
                p2 p2Var = gVar.f105154h;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, j.a((j) value, true, false, null, false, 62)));
                ge1.b.T(v1.a(gVar), null, null, new e(gVar, strQ, null), 3);
                return Unit.INSTANCE;
            case 1:
                ((p) obj3).invoke((mn1.b) obj2, (km1.c) obj);
                return Unit.INSTANCE;
            case 2:
                e23.a aVar = (e23.a) obj2;
                e23.a aVar2 = (e23.a) obj;
                if (((String) obj3) != null) {
                    aVar.invoke();
                } else {
                    aVar2.invoke();
                }
                return Unit.INSTANCE;
            case 3:
                ge1.b.T((b0) obj3, null, d0.UNDISPATCHED, new j0((p1) obj, (h2) obj2, null), 1);
                return Unit.INSTANCE;
            case 4:
                ge1.b.T((b0) obj3, null, d0.UNDISPATCHED, new k0((p1) obj, (n) obj2, null), 1);
                return Unit.INSTANCE;
            case 5:
                ((p1) obj).setValue(Boolean.FALSE);
                ((l) obj3).invoke((f01.j) obj2);
                return Unit.INSTANCE;
            case 6:
                ij ijVar = (ij) obj3;
                b0 b0Var = (b0) obj2;
                p1 p1Var = (p1) obj;
                if (ijVar.isVisible()) {
                    ge1.b.T(b0Var, null, null, new u(ijVar, null), 3);
                    p1Var.setValue(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            case 7:
                ((z) obj3).z4(new n30.c.C2315c((com.garmin.android.apps.connectmobile.courses.model.f) obj2, (com.garmin.android.library.mapsdkadapter.f) obj));
                return Unit.INSTANCE;
            case 8:
                l62.g gVar2 = (l62.g) obj3;
                q qVar = (q) obj2;
                o1 o1Var = (o1) obj;
                if (gVar2 != null) {
                    qVar.invoke(Long.valueOf(gVar2.f110556d), Long.valueOf(gVar2.f110555c), Long.valueOf(o1Var.j()));
                }
                return Unit.INSTANCE;
            case 9:
                TestGoogleAgeSignalsActivity testGoogleAgeSignalsActivity = (TestGoogleAgeSignalsActivity) obj3;
                b0 b0Var2 = (b0) obj2;
                fe feVar = (fe) obj;
                int i15 = TestGoogleAgeSignalsActivity.f41746b;
                try {
                    new ue2.e().a();
                    message = "googleAgeSignalsClearAllTestData: success";
                    break;
                } catch (Throwable th3) {
                    ((Logger) testGoogleAgeSignalsActivity.f41747a.getValue()).error("googleAgeSignalsClearAllTestData", th3);
                    message = th3.getMessage();
                    if (message == null) {
                        message = "googleAgeSignalsClearAllTestData: error, check logcat";
                    }
                }
                ge1.b.T(b0Var2, null, null, new TestGoogleAgeSignalsActivity.a(feVar, message, null), 3);
                return Unit.INSTANCE;
            case 10:
                int i16 = TestGoogleAgeSignalsActivity.f41746b;
                ue2.e eVar2 = new ue2.e();
                int iIndexOf = ((List) ((p1) obj).getF182175a()).indexOf((String) ((p1) obj3).getF182175a());
                eVar2.f170269a.warn("setTestAccessStatus: ".concat(ue2.e.m(iIndexOf)));
                eVar2.i().edit().putInt("testAccessStatus", iIndexOf).commit();
                ((p1) obj2).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 11:
                p1 p1Var2 = (p1) obj;
                p1 p1Var3 = (p1) obj2;
                String addressId = ((fj2.a) obj3).getAddressId();
                if (addressId != null) {
                    p1Var2.setValue(addressId);
                    p1Var3.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 12:
                ll0.f fVar = (ll0.f) obj3;
                ge1.b.T(v1.a(fVar), null, null, new ll0.e(fVar, ((il0.a) obj2).getGlobalLayoutId(), null), 3);
                ((p1) obj).setValue(null);
                return Unit.INSTANCE;
            case 13:
                lo.f fVar2 = (lo.f) obj3;
                JSONObject jSONObject = (JSONObject) obj;
                g22.e.l(fVar2);
                am.b bVarM = am.b.M();
                long j8 = ((com.garmin.android.apps.connectmobile.activities.newmodel.h) obj2).f29448a;
                i0 i0Var = fVar2.f113735h.f29460m;
                bVarM.N(j8, i0Var != null ? i0Var.f29492c : 0L, jSONObject.toString(), fVar2.A);
                return null;
            case 14:
                o oVar = (o) obj3;
                p1 p1Var4 = (p1) obj;
                if (((com.garmin.android.library.mapsdkadapter.i.d) ((x3) obj2).getF182175a()) == com.garmin.android.library.mapsdkadapter.i.d.GOOGLE) {
                    oVar.z4(!((Boolean) p1Var4.getF182175a()).booleanValue());
                    oVar.A4(com.garmin.android.library.mapsdkadapter.i.d.MAPBOX, ((Boolean) p1Var4.getF182175a()).booleanValue());
                } else {
                    oVar.z4(!((Boolean) p1Var4.getF182175a()).booleanValue());
                }
                return Unit.INSTANCE;
            case 15:
                ((p1) obj).setValue(Boolean.FALSE);
                ((l) obj3).invoke((n11.a) obj2);
                return Unit.INSTANCE;
            case 16:
                m21.g gVar3 = (m21.g) obj3;
                String str = (String) obj2;
                f01.j jVar = (f01.j) obj;
                int i17 = m21.g.f116107v;
                m01.g gVar4 = gVar3.f116111d;
                String country = gVar3.f116117j;
                if (country == null) {
                    country = Locale.US.getCountry();
                }
                String str2 = country;
                str2.getClass();
                String language = gVar3.f116118k;
                if (language == null) {
                    language = Locale.ENGLISH.getLanguage();
                }
                String str3 = language;
                str3.getClass();
                return new n01.h(gVar4, str, jVar, str2, str3, gVar3.f116108a);
            case 17:
                m40.g gVar5 = (m40.g) obj3;
                p1 p1Var5 = (p1) obj;
                p1 p1Var6 = (p1) obj2;
                m40.g.a aVar3 = m40.g.f116591h;
                boolean zBooleanValue = ((Boolean) p1Var5.getF182175a()).booleanValue();
                List list = (List) p1Var6.getF182175a();
                j10.q qVar2 = new j10.q(gVar5, p1Var5, p1Var6);
                m.f123595m.getClass();
                list.getClass();
                m mVar = new m();
                Bundle bundle = new Bundle();
                bundle.putBoolean("isPointsOfInterestChecked", zBooleanValue);
                ArrayList arrayList = new ArrayList(y.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.garmin.android.apps.connectmobile.courses.model.h) it.next()).f32965a);
                }
                bundle.putStringArrayList("selectedPointsOfInterestTypes", new ArrayList<>(arrayList));
                mVar.setArguments(bundle);
                mVar.f123596h = new hc0.c(27, qVar2, gVar5);
                mVar.show(gVar5.getParentFragmentManager(), m.class.getSimpleName());
                return Unit.INSTANCE;
            case 18:
                CameraUpdate cameraUpdateNewLatLngBounds = CameraUpdateFactory.newLatLngBounds(me2.z.i((List) obj2), 100);
                cameraUpdateNewLatLngBounds.getClass();
                ((CameraPositionState) obj3).move(cameraUpdateNewLatLngBounds);
                ((p1) obj).setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 19:
                ((b1) obj3).f((yc.h2.c) obj2, (yc.h2.b) obj);
                return Unit.INSTANCE;
            case 20:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.q qVar3 = (com.garmin.android.apps.connectmobile.leaderboard.challenges.q) obj3;
                q0.b bVar = q0.f149800b;
                View viewRequireView = qVar3.requireView();
                viewRequireView.getClass();
                q0 q0VarC = q0.b.c(bVar, viewRequireView, (String) obj2, null, 12);
                q0VarC.b(R.string.common_undo, new lq.g(8, qVar3, (pt0.p.b) obj));
                q0VarC.show();
                return Unit.INSTANCE;
            case 21:
                int i18 = f0.f.f37483i;
                ((f0) obj3).f37467c.A2((Context) obj2, (com.garmin.android.apps.connectmobile.leaderboard.model.a0) obj);
                return Unit.INSTANCE;
            case 22:
                h0 h0Var = (h0) obj3;
                h0.a aVar4 = h0.f37562o;
                String string = h0Var.getString(R.string.social_challenge_joined_msg, (String) obj2);
                string.getClass();
                q0.b bVar2 = q0.f149800b;
                View viewRequireView2 = h0Var.requireView();
                viewRequireView2.getClass();
                q0 q0VarC2 = q0.b.c(bVar2, viewRequireView2, string, null, 12);
                q0VarC2.b(R.string.common_undo, new mt0.h0((g3) obj, 4));
                q0VarC2.setAnchorView(h0Var.requireActivity().findViewById(R.id.bottom_navigation_bar)).show();
                return Unit.INSTANCE;
            case 23:
                s sVar = (s) obj3;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.i0.a aVar5 = com.garmin.android.apps.connectmobile.leaderboard.challenges.i0.f37604i;
                ((p1) obj).setValue(sVar);
                ((com.garmin.android.apps.connectmobile.leaderboard.challenges.i0) obj2).f37611g.a(sVar);
                return Unit.INSTANCE;
            case 24:
                ((m3) obj3).d((yc.h2.d) obj2, (yc.h2.a) obj);
                return Unit.INSTANCE;
            case 25:
                ((m3) obj3).f((yc.h2.c) obj2, (yc.h2.b) obj);
                return Unit.INSTANCE;
            case 26:
                String str4 = (String) obj2;
                String strD = new oi0.h((Context) obj3).d(((n1) obj).getIntValue(), true);
                if (str4 == null) {
                    str4 = "";
                }
                return p0.n(strD + StringUtils.SPACE + str4);
            case 27:
                p pVar = (p) obj2;
                bg2.h hVar = (bg2.h) obj;
                yg2.i0 i0Var2 = ((yg2.h0) obj3).f197040g;
                if (i0Var2 != null && (eVar = i0Var2.f197054b) != null) {
                    pVar.invoke(eVar.f127844a, hVar);
                }
                return Unit.INSTANCE;
            case 28:
                GearActivity.a aVar6 = GearActivity.f35500b;
                return ParametersHolderKt.parametersOf(((GearRoute.s) obj3).f35683a, (x0) obj2, (i53.c) obj);
            default:
                l lVar = (l) obj3;
                r rVar = (r) obj2;
                p1 p1Var7 = (p1) obj;
                if ((((nw0.d) p1Var7.getF182175a()).f128010a instanceof e0.a) || (((nw0.d) p1Var7.getF182175a()).f128011b instanceof nw0.h0.a)) {
                    lVar.invoke(Boolean.FALSE);
                } else {
                    rVar.getClass();
                    ge1.b.T(v1.a(rVar), null, null, new nw0.u(rVar, null), 3);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(Object obj, p1 p1Var, Object obj2, int i14) {
        this.f105132a = i14;
        this.f105133b = obj;
        this.f105135d = p1Var;
        this.f105134c = obj2;
    }

    public /* synthetic */ a(Object obj, int i14, Object obj2, Object obj3) {
        this.f105132a = i14;
        this.f105133b = obj;
        this.f105134c = obj2;
        this.f105135d = obj3;
    }
}
