package ho;

import am.x0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.widget.EditText;
import android.widget.Toast;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.consent.DataStorageConsentActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.nutrition.NutritionHydrationActivity;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.TripFlightFragment;
import com.garmin.android.apps.connectmobile.settings.developersettings.TestGoogleAgeSignalsActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.StyledInlineTextFieldViewDark;
import com.garmin.feature.garminpay.ui.developer.DeveloperSettingsActivity;
import i3.a1;
import i3.cf;
import i3.df;
import i3.m8;
import i3.mc;
import i3.p8;
import i3.pc;
import i3.q8;
import i3.r8;
import java.util.Calendar;
import java.util.List;
import ky0.s0;
import ky0.w0;
import lc.m0;
import o72.r1;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p13.h0;
import p3.l1;
import p3.n1;
import p3.p1;
import p3.x3;
import r53.p2;
import z10.d1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f84602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f84603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f84604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f84605e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d0(DeveloperSettingsActivity developerSettingsActivity, e23.p pVar, String str, kr2.h hVar) {
        this.f84601a = 12;
        this.f84602b = developerSettingsActivity;
        this.f84603c = hVar;
        this.f84604d = (p005kotlin.jvm.internal.q) pVar;
        this.f84605e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13, types: [e23.p, kotlin.jvm.internal.q] */
    @Override // e23.a
    public final Object invoke() {
        Object value;
        int i14 = this.f84601a;
        int i15 = 0;
        Object obj = this.f84605e;
        Object obj2 = this.f84603c;
        Object obj3 = this.f84604d;
        Object obj4 = this.f84602b;
        switch (i14) {
            case 0:
                e23.a aVar = (e23.a) obj2;
                n1 n1Var = (n1) obj3;
                ((e23.p) obj4).invoke(Integer.valueOf(n1Var.getIntValue() == p13.x.j(e0.f84615b) ? e0.f84614a.indexOf(0) : ((n1) obj).getIntValue()), Integer.valueOf(n1Var.getIntValue()));
                aVar.invoke();
                return Unit.INSTANCE;
            case 1:
                Context context = (Context) obj2;
                o53.b0 b0Var = (o53.b0) obj3;
                a1 a1Var = (a1) obj;
                yb0.a aVar2 = ((ho0.h) obj4).f84714f;
                p1.z<sd2.f> zVar = aVar2 != null ? aVar2.f195679b : null;
                int iH = zVar != null ? zVar.h() : 0;
                if (iH == 1) {
                    sd2.f fVarI = zVar != null ? zVar.i(0) : null;
                    fo0.a aVar3 = (fo0.a) KoinJavaComponent.get$default(fo0.a.class, null, null, 6, null);
                    if (fVarI != null) {
                        aVar3.d(context, fVarI);
                    }
                } else if (iH > 1) {
                    ge1.b.T(b0Var, null, null, new ho0.h.b(a1Var, null), 3);
                }
                return Unit.INSTANCE;
            case 2:
                pt1.g gVar = (pt1.g) obj2;
                String str = (String) ((p1) obj3).getF182175a();
                boolean zBooleanValue = ((Boolean) ((p1) obj).getF182175a()).booleanValue();
                long j8 = gVar.f140845a;
                String str2 = gVar.f140846b;
                us1.d dVar = gVar.f140848d;
                str2.getClass();
                str.getClass();
                ((e23.l) obj4).invoke(new pt1.g(j8, str2, str, dVar, zBooleanValue));
                return Unit.INSTANCE;
            case 3:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a.w6((com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a) obj4, (LocalDate) obj2, (LocalDate) obj3, (LocalDate) obj, 8);
                return Unit.INSTANCE;
            case 4:
                mc mcVar = (mc) obj4;
                o53.b0 b0Var2 = (o53.b0) obj3;
                s1.b bVar = (s1.b) obj;
                e23.a aVar4 = (e23.a) obj2;
                if (mcVar.c() == pc.Expanded && mcVar.f88996e.e().d(pc.PartiallyExpanded)) {
                    ge1.b.T(b0Var2, null, null, new p8(bVar, null), 3);
                    ge1.b.T(b0Var2, null, null, new q8(mcVar, null), 3);
                } else {
                    ge1.b.T(b0Var2, null, null, new r8(mcVar, null), 3).J(new m8(aVar4, i15));
                }
                return Unit.INSTANCE;
            case 5:
                return new cf((df) obj4, (g6.c) obj2, (e23.l) obj3, (e23.l) obj);
            case 6:
                ib0.g gVar2 = (ib0.g) obj3;
                e23.l lVar = (e23.l) obj;
                e23.a aVar5 = (e23.a) obj2;
                jb0.c cVar = ((ib0.f) ((p1) obj4).getF182175a()).f92459c;
                if (cVar != null) {
                    ge1.b.T(v1.a(gVar2), null, null, new ib0.j(cVar, gVar2, null), 3);
                    lVar.invoke(cVar.b());
                    Unit unit = Unit.INSTANCE;
                }
                aVar5.invoke();
                return Unit.INSTANCE;
            case 7:
                Boolean bool = Boolean.TRUE;
                ((p1) obj3).setValue(bool);
                ((zc.d) obj4).e();
                ((e23.a) obj2).invoke();
                ((p1) obj).setValue(bool);
                return Unit.INSTANCE;
            case 8:
                ((p1) obj).setValue(Boolean.TRUE);
                ((zc.d) obj4).e();
                ((zc.d) obj3).e();
                ((e23.a) obj2).invoke();
                return Unit.INSTANCE;
            case 9:
                Context context2 = (Context) obj4;
                e23.l lVar2 = (e23.l) obj3;
                e23.a aVar6 = (e23.a) obj2;
                c.q qVar = (c.q) obj;
                if (d1.f()) {
                    d1.o(context2, new xk1.v(12));
                } else if (d1.h(q92.x.DI_CONNECT_UPLOAD, true)) {
                    lVar2.invoke(aVar6.invoke());
                } else {
                    qVar.a(DataStorageConsentActivity.a.a(DataStorageConsentActivity.f32194t, context2, null, 60), null);
                }
                return Unit.INSTANCE;
            case 10:
                e23.p pVar = (e23.p) obj4;
                p1 p1Var = (p1) obj3;
                p1 p1Var2 = (p1) obj;
                ((p1) obj2).setValue(Boolean.FALSE);
                if (((pu0.b) p1Var.getF182175a()) != null && ((pu0.b) p1Var2.getF182175a()) != null) {
                    pu0.b bVar2 = (pu0.b) p1Var.getF182175a();
                    bVar2.getClass();
                    pVar.invoke(bVar2, (pu0.b) p1Var2.getF182175a());
                }
                return Unit.INSTANCE;
            case 11:
                Context context3 = (Context) obj3;
                c.q qVar2 = (c.q) obj;
                long activityId = ((ps.q) obj4).getActivityId();
                String str3 = ((x0) obj2).f4358a;
                aq.b bVar3 = new aq.b();
                bVar3.f11823b = activityId;
                am.h hVar = am.h.VIEW_EDIT;
                if (hVar != null) {
                    bVar3.f11824c = hVar;
                }
                bVar3.f11827f = str3;
                bVar3.f11825d = true;
                qVar2.a(bVar3.a(context3), null);
                return Unit.INSTANCE;
            case 12:
                DeveloperSettingsActivity developerSettingsActivity = (DeveloperSettingsActivity) obj4;
                String str4 = DeveloperSettingsActivity.f51946n;
                ev2.f fVar = new ev2.f(developerSettingsActivity, (p005kotlin.jvm.internal.q) obj3, (String) obj, (kr2.h) obj2);
                kr2.h hVar2 = developerSettingsActivity.f51955g;
                if (hVar2 != null) {
                    ge1.b.T(v1.a(hVar2), null, null, new jr2.l(hVar2, developerSettingsActivity, fVar, null), 3);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("viewModel");
                throw null;
            case 13:
                e23.l lVar3 = (e23.l) obj4;
                pt1.x xVar = (pt1.x) obj2;
                e23.l lVar4 = (e23.l) obj3;
                p1 p1Var3 = (p1) obj;
                if (lVar3 != null) {
                    lVar3.invoke(Long.valueOf(xVar.f141004a));
                } else {
                    lVar4.invoke(xVar.f141022s);
                }
                p1Var3.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 14:
                p1 p1Var4 = (p1) obj4;
                pt1.x xVar2 = (pt1.x) obj2;
                e23.l lVar5 = (e23.l) obj3;
                p1 p1Var5 = (p1) obj;
                if (p1Var4.getF182175a() != 0) {
                    p1Var4.setValue(null);
                } else {
                    String str5 = xVar2.f141017n;
                    if (str5 == null || !g22.n.d(str5)) {
                        lVar5.invoke(Long.valueOf(xVar2.f141004a));
                    } else {
                        p1Var4.setValue(xVar2.f141017n);
                    }
                }
                p1Var5.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 15:
                e23.l lVar6 = (e23.l) obj4;
                o13.p pVar2 = (o13.p) obj2;
                p1 p1Var6 = (p1) obj3;
                p1 p1Var7 = (p1) obj;
                if (lVar6 != null) {
                    lVar6.invoke(pVar2.f128594a);
                }
                p1Var6.setValue((String) pVar2.f128595b);
                p1Var7.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 16:
                w0 w0Var = (w0) obj4;
                ((p1) obj).setValue(Boolean.FALSE);
                w0Var.S4();
                ge1.b.T((o53.b0) obj3, null, null, new s0.j(w0Var, (e23.a) obj2, null), 3);
                return Unit.INSTANCE;
            case 17:
                p1 p1Var8 = (p1) obj3;
                p1 p1Var9 = (p1) obj;
                int i16 = TestGoogleAgeSignalsActivity.f41746b;
                Integer numI = d53.t.i((String) ((p1) obj4).getF182175a());
                Integer numI2 = d53.t.i((String) ((p1) obj2).getF182175a());
                if ((numI == null && numI2 == null) || numI == null || numI2 == null) {
                    new ue2.e().l(numI, numI2);
                    p1Var8.setValue(Boolean.FALSE);
                } else if (numI.intValue() > numI2.intValue()) {
                    p1Var9.setValue("Age Min cannot be greater than Age Max");
                } else if (numI.equals(numI2)) {
                    p1Var9.setValue("Not a valid range");
                } else {
                    new ue2.e().l(numI, numI2);
                    p1Var8.setValue(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            case 18:
                e23.a aVar7 = (e23.a) obj2;
                li0.f fVar2 = (li0.f) obj4;
                Context context4 = (Context) obj3;
                li0.d0 d0Var = (li0.d0) obj;
                if (aVar7 == null) {
                    String str6 = d0Var.f112650c;
                    String str7 = d0Var.f112651d;
                    b12.b bVar4 = d0Var.f112648a;
                    String str8 = bVar4 != null ? bVar4.f14387a : null;
                    fVar2.getClass();
                    context4.getClass();
                    if (str6 != null) {
                        fVar2.f112663d.a(context4, str6, str7, str8);
                    }
                } else {
                    aVar7.invoke();
                }
                return Unit.INSTANCE;
            case 19:
                km0.e eVar = (km0.e) obj4;
                Activity activity = (Activity) obj2;
                c.q qVar3 = (c.q) obj3;
                Context context5 = (Context) obj;
                boolean z14 = eVar instanceof km0.e.b;
                km0.e.b bVar5 = z14 ? (km0.e.b) eVar : null;
                Uri uri = bVar5 != null ? bVar5.f105319a : null;
                km0.e.b bVar6 = z14 ? (km0.e.b) eVar : null;
                Rect rect = bVar6 != null ? bVar6.f105321c : null;
                km0.e.b bVar7 = z14 ? (km0.e.b) eVar : null;
                Float fValueOf = bVar7 != null ? Float.valueOf(bVar7.f105322d) : null;
                if (activity == null || uri == null || fValueOf == null) {
                    Toast.makeText(context5, R.string.lbl_error_occurred, 0).show();
                } else {
                    qVar3.a(((jm0.b) KoinJavaComponent.get$default(jm0.b.class, null, null, 6, null)).b(activity, uri, rect, fValueOf.floatValue()), null);
                }
                return Unit.INSTANCE;
            case 20:
                TripFlightFragment tripFlightFragment = (TripFlightFragment) obj4;
                ls0.d dVar2 = (ls0.d) obj2;
                ms0.e eVar2 = (ms0.e) obj3;
                com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.d dVar3 = (com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.d) obj;
                int i17 = TripFlightFragment.f37039n;
                tripFlightFragment.w6().f114749f.k(dVar2);
                StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = eVar2.f120466b;
                styledInlineTextFieldViewDark.getClass();
                EditText editText = styledInlineTextFieldViewDark.editText;
                editText.getClass();
                editText.removeTextChangedListener(dVar3);
                Unit unit2 = Unit.INSTANCE;
                tripFlightFragment.w6().f114749f.f(tripFlightFragment.getViewLifecycleOwner(), dVar2);
                StyledInlineTextFieldViewDark styledInlineTextFieldViewDark2 = eVar2.f120466b;
                styledInlineTextFieldViewDark2.getClass();
                EditText editText2 = styledInlineTextFieldViewDark2.editText;
                editText2.getClass();
                editText2.addTextChangedListener(dVar3);
                return Unit.INSTANCE;
            case 21:
                TripFlightFragment tripFlightFragment2 = (TripFlightFragment) obj4;
                ls0.d dVar4 = (ls0.d) obj2;
                ms0.e eVar3 = (ms0.e) obj3;
                com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.c cVar2 = (com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.c) obj;
                int i18 = TripFlightFragment.f37039n;
                tripFlightFragment2.w6().f114749f.k(dVar4);
                StyledInlineTextFieldViewDark styledInlineTextFieldViewDark3 = eVar3.f120466b;
                styledInlineTextFieldViewDark3.getClass();
                EditText editText3 = styledInlineTextFieldViewDark3.editText;
                editText3.getClass();
                editText3.removeTextChangedListener(cVar2);
                Unit unit3 = Unit.INSTANCE;
                tripFlightFragment2.w6().f114749f.f(tripFlightFragment2.getViewLifecycleOwner(), dVar4);
                StyledInlineTextFieldViewDark styledInlineTextFieldViewDark4 = eVar3.f120466b;
                styledInlineTextFieldViewDark4.getClass();
                EditText editText4 = styledInlineTextFieldViewDark4.editText;
                editText4.getClass();
                editText4.addTextChangedListener(cVar2);
                return Unit.INSTANCE;
            case 22:
                e23.l lVar7 = (e23.l) obj2;
                qt1.a aVar8 = (qt1.a) obj3;
                x3 x3Var = (x3) obj;
                if (!((m0) obj4).n()) {
                    Boolean bool2 = (Boolean) x3Var.getF182175a();
                    bool2.booleanValue();
                    lVar7.invoke(bool2);
                    p2 p2Var = aVar8.f147493f.f179871a;
                    do {
                        value = p2Var.getValue();
                        ((Boolean) value).getClass();
                    } while (!p2Var.b(value, Boolean.FALSE));
                }
                return Unit.INSTANCE;
            case 23:
                com.garmin.android.apps.connectmobile.courses.model.h hVar3 = (com.garmin.android.apps.connectmobile.courses.model.h) obj2;
                e23.p pVar3 = (e23.p) obj4;
                p1 p1Var10 = (p1) obj3;
                p1 p1Var11 = (p1) obj;
                p1Var10.setValue(((List) p1Var10.getF182175a()).contains(hVar3) ? h0.y0((List) p1Var10.getF182175a(), hVar3) : h0.D0((List) p1Var10.getF182175a(), hVar3));
                Boolean bool3 = (Boolean) p1Var11.getF182175a();
                bool3.booleanValue();
                pVar3.invoke(bool3, i53.a.e((List) p1Var10.getF182175a()));
                return Unit.INSTANCE;
            case 24:
                GearActivity.a aVar9 = GearActivity.f35500b;
                lc.y.l((m0) obj4, new GearRoute.p(((GearRoute.c) obj2).f35628a, (String) ((p1) obj3).getF182175a(), (String) ((p1) obj).getF182175a(), true));
                return Unit.INSTANCE;
            case 25:
                ((p1) obj2).setValue(Boolean.FALSE);
                ge1.b.T((o53.b0) obj4, null, null, new ny0.d((e23.l) obj3, (p1) obj, null), 3);
                return Unit.INSTANCE;
            case 26:
                w01.c cVar3 = (w01.c) obj4;
                w01.e eVar4 = (w01.e) obj2;
                p1 p1Var12 = (p1) obj;
                NutritionHydrationActivity.a aVar10 = NutritionHydrationActivity.f33067b;
                eVar4.getClass();
                cVar3.f181029b = eVar4;
                Intent intent = new Intent();
                intent.putExtra("GCM_extra_nutrition_hydration_details", cVar3);
                ((NutritionHydrationActivity) obj3).setResult(-1, intent);
                w01.f fVarFa = NutritionHydrationActivity.fa(cVar3);
                if (fVarFa != null) {
                    p1Var12.setValue(fVarFa);
                }
                return Unit.INSTANCE;
            case 27:
                w01.c cVar4 = (w01.c) obj4;
                q22.b bVar8 = (q22.b) obj2;
                p1 p1Var13 = (p1) obj;
                NutritionHydrationActivity.a aVar11 = NutritionHydrationActivity.f33067b;
                bVar8.getClass();
                cVar4.f181030c = bVar8;
                Intent intent2 = new Intent();
                intent2.putExtra("GCM_extra_nutrition_hydration_details", cVar4);
                ((NutritionHydrationActivity) obj3).setResult(-1, intent2);
                w01.a aVarEa = NutritionHydrationActivity.ea(cVar4);
                if (aVarEa != null) {
                    p1Var13.setValue(aVarEa);
                }
                return Unit.INSTANCE;
            case 28:
                p1 p1Var14 = (p1) obj3;
                r1.c((Context) obj4, "Action1 - " + ((Calendar) p1Var14.getF182175a()).get(1) + StringUtils.SPACE + ((List) obj2).get(((Calendar) p1Var14.getF182175a()).get(2)) + StringUtils.SPACE + ((Calendar) p1Var14.getF182175a()).get(5));
                ((p1) obj).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            default:
                r1.c((Context) obj4, "Action1 " + ((n1) obj3).getIntValue() + StringUtils.SPACE + ((l1) obj2).getDoubleValue());
                ((p1) obj).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, e23.a aVar, int i14) {
        this.f84601a = i14;
        this.f84602b = obj;
        this.f84604d = obj2;
        this.f84605e = obj3;
        this.f84603c = aVar;
    }

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f84601a = i14;
        this.f84602b = obj;
        this.f84603c = obj2;
        this.f84604d = obj3;
        this.f84605e = obj4;
    }

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, Object obj4, int i14, byte b14) {
        this.f84601a = i14;
        this.f84603c = obj;
        this.f84602b = obj2;
        this.f84604d = obj3;
        this.f84605e = obj4;
    }

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, boolean z14, Object obj4, int i14) {
        this.f84601a = i14;
        this.f84602b = obj;
        this.f84604d = obj2;
        this.f84603c = obj3;
        this.f84605e = obj4;
    }
}
