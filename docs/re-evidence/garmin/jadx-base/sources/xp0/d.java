package xp0;

import am.j;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.fragment.app.m;
import c22.s1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.consent.ProductImprovementConsentActivity;
import com.garmin.android.apps.connectmobile.contacts.ContactActivity;
import com.garmin.android.apps.connectmobile.devices.DeviceDetailsActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.CaloriesLinkAccountsActivity;
import com.garmin.android.apps.connectmobile.promotions.PromoCodeView;
import com.garmin.android.apps.connectmobile.view.StyledInlineTextFieldViewDark;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import e23.l;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import jd1.f;
import nr.g;
import nr.w0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import q92.y;
import qr.t;
import sa1.x;
import xr.p;
import xz0.o;
import ya1.i;
import ya1.n;
import ya1.w;
import z10.j2;
import zb0.n0;
import zb0.u0;
import zo0.a0;
import zo0.u;
import zo0.v;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f191837b;

    public /* synthetic */ d(Object obj, int i14) {
        this.f191836a = i14;
        this.f191837b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, o13.l] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        ArrayList arrayList;
        int i14 = this.f191836a;
        int i15 = 1;
        Object obj = this.f191837b;
        switch (i14) {
            case 0:
                ((c) obj).invoke();
                return;
            case 1:
                ((c) obj).invoke();
                return;
            case 2:
                int i16 = xr.c.f191947e;
                t tVarU6 = ((xr.c) obj).u6();
                tVarU6.f146565v2 = true;
                tVarU6.E4(w0.x0.f127570a);
                return;
            case 3:
                int i17 = p.f192009g;
                l<Integer, Unit> lVar = ((g.w) obj).f127178n;
                if (lVar != null) {
                    lVar.invoke(0);
                    return;
                }
                return;
            case 4:
                com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.a.C0494a c0494a = com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.a.f30928x;
                f.b bVar = ((com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.a) obj).f98425e;
                if (bVar != null) {
                    bVar.b0();
                    return;
                }
                return;
            case 5:
                com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.b bVar2 = (com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.b) obj;
                com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.b.a aVar = com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.b.f30933m;
                td1.b.InterfaceC3083b interfaceC3083b = bVar2.f163886b;
                if (interfaceC3083b != null) {
                    interfaceC3083b.m3(bVar2.E6());
                    return;
                }
                return;
            case 6:
                ((o) obj).f192802a.z();
                return;
            case 7:
                y52.b bVar3 = (y52.b) obj;
                v22.e.j(bVar3.f194526b);
                StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = bVar3.f194525a;
                v22.e.q(styledInlineTextFieldViewDark);
                bVar3.b();
                styledInlineTextFieldViewDark.callOnClick();
                return;
            case 8:
                ya1.c cVar = (ya1.c) obj;
                boolean z14 = j.z(f12.l.f68084a);
                Context context = cVar.f195539b;
                context.getClass();
                new ya1.b(context, cVar.f195541d, z14, new xa2.g(cVar, 20)).show();
                return;
            case 9:
                HelpActivity.a.e(HelpActivity.f36653a, ((ya1.d) obj).f195543b, ro0.l.POWER_GUIDE_HELP, "ABOUT_POWER_GUIDE_ACTION", null, 8);
                return;
            case 10:
                i iVar = (i) obj;
                Context context2 = iVar.f195564b;
                context2.getClass();
                x.a(iVar.f195566d, context2, new xa2.g(iVar, 21)).show();
                return;
            case 11:
                n nVar = (n) obj;
                com.garmin.android.apps.connectmobile.courses.model.e eVar = nVar.f195581f;
                if (eVar == null || (arrayList = nVar.f195582g) == null) {
                    return;
                }
                nVar.f195577b.invoke(eVar, arrayList);
                return;
            case 12:
                ya1.t tVar = (ya1.t) obj;
                boolean z15 = j.z(f12.l.f68084a);
                Context context3 = tVar.f195612b;
                context3.getClass();
                new j42.b(context3, (j42.b.InterfaceC1852b) new xw.b(tVar, i15), tVar.f195614d, z15, false, 0, 0, 0, 0, 480, (p005kotlin.jvm.internal.j) null);
                return;
            case 13:
                w wVar = (w) obj;
                Context context4 = wVar.f195629b;
                View viewInflate = LayoutInflater.from(context4).inflate(R.layout.gcm_dialog_text_editor, (ViewGroup) null);
                EditText editText = (EditText) viewInflate.findViewById(R.id.dialog_edit_text);
                if (wVar.f195631d.length() > 0) {
                    editText.setText(wVar.f195631d);
                    editText.setSelection(wVar.f195631d.length());
                }
                androidx.appcompat.app.e eVarShow = new androidx.appcompat.app.e.a(context4, R.style.GCMEntityNameDialogStyle).setView(viewInflate).setTitle(R.string.lbl_name).setPositiveButton(R.string.lbl_done, new wq.c(9, wVar, editText)).show();
                editText.addTextChangedListener(new w.a(eVarShow));
                Window window = eVarShow.getWindow();
                if (window != null) {
                    window.setSoftInputMode(4);
                }
                eVarShow.show();
                return;
            case 14:
                PromoCodeView.a aVar2 = ((PromoCodeView) obj).copyClickListener;
                if (aVar2 != null) {
                    aVar2.E();
                    return;
                }
                return;
            case 15:
                m mVar = ((yo0.c) obj).f198339b;
                Map<u0, vg1.t> map = n0.f203577a;
                Uri uri = Uri.parse(String.format("https://support.garmin.com/%1$s/?faq=MUAAW8EQWv0vbQHFMP29x7", s1.b(Locale.getDefault())));
                uri.getClass();
                g22.a.c(mVar, uri);
                return;
            case 16:
                com.garmin.realtimesettings.app.presentationlayer.c.a aVar3 = com.garmin.realtimesettings.app.presentationlayer.c.f52641v;
                ((com.garmin.realtimesettings.app.presentationlayer.c) obj).y6(view2.getId());
                return;
            case 17:
                j2 j2Var = (j2) obj;
                ArrayList<d20.b> arrayList2 = j2Var.f201071c;
                if (arrayList2.isEmpty()) {
                    return;
                }
                int size = arrayList2.size();
                Spinner spinner = j2Var.f201072d;
                if (spinner == null) {
                    s.m("spinner");
                    throw null;
                }
                if (size > spinner.getSelectedItemPosition()) {
                    Spinner spinner2 = j2Var.f201072d;
                    if (spinner2 == null) {
                        s.m("spinner");
                        throw null;
                    }
                    String twoCharacterCode = arrayList2.get(spinner2.getSelectedItemPosition()).getTwoCharacterCode();
                    if (twoCharacterCode == null) {
                        twoCharacterCode = "";
                    }
                    Spinner spinner3 = j2Var.f201072d;
                    if (spinner3 == null) {
                        s.m("spinner");
                        throw null;
                    }
                    String friendlyName = arrayList2.get(spinner3.getSelectedItemPosition()).getFriendlyName();
                    ((com.garmin.android.apps.connectmobile.startup.e) j2Var.f201070b.getValue()).z4(twoCharacterCode, friendlyName != null ? friendlyName : "");
                    return;
                }
                return;
            case 18:
                ProductImprovementConsentActivity productImprovementConsentActivity = (ProductImprovementConsentActivity) obj;
                GCMComplexOneLineButton gCMComplexOneLineButton = productImprovementConsentActivity.f32232b;
                if (gCMComplexOneLineButton != null) {
                    productImprovementConsentActivity.da(gCMComplexOneLineButton.f47771k.isChecked() ? y.OPT_IN : y.OPT_OUT);
                    return;
                } else {
                    s.m("consentToggle");
                    throw null;
                }
            case 19:
                CaloriesLinkAccountsActivity.a aVar4 = CaloriesLinkAccountsActivity.f39595i;
                ((CaloriesLinkAccountsActivity) obj).da();
                return;
            case 20:
                DeviceDetailsActivity deviceDetailsActivity = (DeviceDetailsActivity) obj;
                sd2.f fVar = deviceDetailsActivity.f33808h;
                if (fVar != null) {
                    long unitID = fVar.getUnitID();
                    if (km2.a.e(new int[]{SupportedCapability.HOST_INITIATED_SYNC_REQUESTS.ordinal(), SupportedCapability.SYNC_2.ordinal()}, unitID) && hk0.p.m(deviceDetailsActivity.f33808h) && !hk0.p.j(unitID)) {
                        deviceDetailsActivity.f33805e.clearAnimation();
                        deviceDetailsActivity.f33805e.startAnimation(deviceDetailsActivity.f33806f);
                        yr1.e.e(null, deviceDetailsActivity.f33808h.getUnitID(), "DeviceDetailsActivity");
                        return;
                    }
                    return;
                }
                return;
            case 21:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.a aVar5 = (com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.a) obj;
                aVar5.f43868b.a(ContactActivity.a.a(ContactActivity.T, aVar5.getActivity(), true, 1, null, 3, false, ((pj1.s) aVar5.f43867a.getValue()).f137981q, 40), null);
                return;
            case 22:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f fVar2 = (com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f) obj;
                fVar2.f43929g.a(ContactActivity.a.a(ContactActivity.T, fVar2.getActivity(), true, 1, null, 3, false, fVar2.w6().f137981q, 40), null);
                return;
            case 23:
                int i18 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.a.f29309p;
                ((com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.a) obj).I6();
                return;
            case 24:
                int i19 = zo0.d.f206108j;
                ht.a aVar6 = ht.a.f85464a;
                Bundle bundleA = h7.c.a(new o13.p("FeatureType", ((d31.d) obj).name()));
                aVar6.getClass();
                ht.a.a(bundleA, "OnboardingNotNowClicked");
                return;
            case 25:
                ((zo0.s) obj).f206195a.t3();
                return;
            case 26:
                int i24 = u.f206196c;
                a2 a2Var = a2.TRAINING_INITIATIVE;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "OnboardingRaceEventSearchDialogHandler", "showRaceEventSearchDialog: positive button clicked, starting Training Initiative Event Search");
                ((u) obj).f206197a.m0();
                return;
            case 27:
                int i25 = v.f206199b;
                a2 a2Var2 = a2.SAFETY_FEATURES;
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "OnboardingSafetyFeaturesDialogHandler", "showSafetyFeaturesDayOneDialog: positive button clicked, starting SafetyFeaturesActivity");
                ((v) obj).f206200a.I5();
                return;
            case 28:
                int i26 = a0.f206082d;
                ((ak0.a) KoinJavaComponent.get$default(ak0.a.class, null, null, 6, null)).p(((a0) obj).f206083a.getContext());
                return;
            default:
                ((zs0.d) obj).f206830a.I8(it0.a.f94971a);
                return;
        }
    }
}
