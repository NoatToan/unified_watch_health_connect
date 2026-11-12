package ew1;

import android.app.Dialog;
import android.content.DialogInterface;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import androidx.fragment.app.Fragment;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.intensityintervalsediting.ActivitiesEditIntervalsActivity;
import com.garmin.android.apps.connectmobile.bic.device.TellUsMoreActivity;
import com.garmin.android.apps.connectmobile.contacts.ContactActivity;
import com.garmin.android.apps.connectmobile.contacts.details.ContactDetailsActivity;
import com.garmin.android.apps.connectmobile.devices.dashboard.version2.RegisteredUnPairedDeviceActivity;
import com.garmin.android.apps.connectmobile.liveeventsharing.recipients.LiveEventRecipientsActivity;
import com.garmin.android.apps.connectmobile.settings.GCMActivityAppDiagnostics;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.GCMUserSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.IndexSmartScaleUserSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.activityoptions.GCMRunModeAlertsActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.imagemultipicker.ImageMultiPickerActivity;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.garmin.feature.garminpay.ui.developer.DeveloperSettingsActivity;
import i3.e5;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h1 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f66499b;

    public /* synthetic */ h1(Object obj, int i14) {
        this.f66498a = i14;
        this.f66499b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15;
        double dG;
        int value;
        int i16 = this.f66498a;
        Object obj = this.f66499b;
        switch (i16) {
            case 0:
                i1.a aVar = i1.f66514e;
                dw1.a aVarH5 = ((i1) obj).y6().H5();
                aVarH5.f61435a.setValue(aVarH5.f61442h);
                return;
            case 1:
                ContactActivity.a aVar2 = ContactActivity.T;
                ((ContactActivity) obj).ca();
                return;
            case 2:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h hVar = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h) obj;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.a aVar3 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.B;
                gg1.h0 h0VarA6 = hVar.A6();
                gg1.h0 h0Var = gg1.h0.MILLI_GRAMS_PER_DECILITER;
                boolean z14 = hVar.f40648p;
                if (h0VarA6 == h0Var) {
                    if (z14) {
                        db1.t tVar = hVar.f40645m;
                        if (tVar == null) {
                            p005kotlin.jvm.internal.s.m("mUserGlucoseInputDTO");
                            throw null;
                        }
                        Double value2 = tVar.getValue();
                        if (value2 == null) {
                            hVar.G6();
                            return;
                        }
                        double dDoubleValue = value2.doubleValue();
                        MultiLineImeEditText multiLineImeEditText = hVar.f40635c;
                        if (multiLineImeEditText != null) {
                            multiLineImeEditText.setText(Editable.Factory.getInstance().newEditable(String.valueOf((long) dDoubleValue)));
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mBloodGlucoseValueText");
                            throw null;
                        }
                    }
                    db1.r rVar = hVar.f40643k;
                    if (rVar == null) {
                        p005kotlin.jvm.internal.s.m("mUserGlucoseDTO");
                        throw null;
                    }
                    Double value3 = rVar.getValue();
                    if (value3 == null) {
                        hVar.G6();
                        return;
                    }
                    double dDoubleValue2 = value3.doubleValue();
                    MultiLineImeEditText multiLineImeEditText2 = hVar.f40635c;
                    if (multiLineImeEditText2 != null) {
                        multiLineImeEditText2.setText(Editable.Factory.getInstance().newEditable(String.valueOf((long) dDoubleValue2)));
                        return;
                    } else {
                        p005kotlin.jvm.internal.s.m("mBloodGlucoseValueText");
                        throw null;
                    }
                }
                if (z14) {
                    db1.t tVar2 = hVar.f40645m;
                    if (tVar2 == null) {
                        p005kotlin.jvm.internal.s.m("mUserGlucoseInputDTO");
                        throw null;
                    }
                    Double value4 = tVar2.getValue();
                    if (value4 == null) {
                        hVar.G6();
                        return;
                    }
                    double dDoubleValue3 = value4.doubleValue();
                    MultiLineImeEditText multiLineImeEditText3 = hVar.f40635c;
                    if (multiLineImeEditText3 == null) {
                        p005kotlin.jvm.internal.s.m("mBloodGlucoseValueText");
                        throw null;
                    }
                    Editable.Factory factory = Editable.Factory.getInstance();
                    l3.f23124b.getClass();
                    multiLineImeEditText3.setText(factory.newEditable(String.valueOf(l3.a.T1(dDoubleValue3, 1))));
                    return;
                }
                db1.r rVar2 = hVar.f40643k;
                if (rVar2 == null) {
                    p005kotlin.jvm.internal.s.m("mUserGlucoseDTO");
                    throw null;
                }
                Double value5 = rVar2.getValue();
                if (value5 == null) {
                    hVar.G6();
                    return;
                }
                double dDoubleValue4 = value5.doubleValue();
                MultiLineImeEditText multiLineImeEditText4 = hVar.f40635c;
                if (multiLineImeEditText4 == null) {
                    p005kotlin.jvm.internal.s.m("mBloodGlucoseValueText");
                    throw null;
                }
                Editable.Factory factory2 = Editable.Factory.getInstance();
                l3.f23124b.getClass();
                multiLineImeEditText4.setText(factory2.newEditable(String.valueOf(l3.a.T1(dDoubleValue4, 1))));
                return;
            case 3:
                fb2.u uVar = (fb2.u) obj;
                T t7 = uVar.f70376c[i14];
                uVar.f70375b = t7;
                if (t7 != 0) {
                    i15 = 0;
                    while (true) {
                        Object[] objArr = uVar.f70376c;
                        if (i15 >= objArr.length) {
                            i15 = -1;
                        } else if (!t7.equals(objArr[i15])) {
                            i15++;
                        }
                    }
                } else {
                    i15 = -1;
                }
                GCMComplexTwoLineButton gCMComplexTwoLineButton = uVar.f70380g;
                if (gCMComplexTwoLineButton != null && i15 != -1) {
                    gCMComplexTwoLineButton.setButtonBottomLeftLabel(uVar.f70378e[i15].toString());
                }
                dialogInterface.dismiss();
                com.garmin.android.apps.connectmobile.i2.l("SingleSelectionViewDecorator", "onCheckedChanged(): notifyListener with selectedFieldValue=" + uVar.f70375b);
                uVar.f(uVar.f70375b);
                return;
            case 4:
                com.garmin.android.apps.connectmobile.devices.targetedselection.a aVar4 = (com.garmin.android.apps.connectmobile.devices.targetedselection.a) obj;
                aVar4.z6().B4(aVar4.w6(), aVar4.f34576c);
                return;
            case 5:
                ContactDetailsActivity.a aVar5 = ContactDetailsActivity.f32429g;
                ((ContactDetailsActivity) obj).finish();
                return;
            case 6:
                com.garmin.android.apps.connectmobile.contacts.details.c.a aVar6 = com.garmin.android.apps.connectmobile.contacts.details.c.f32482m;
                ((com.garmin.android.apps.connectmobile.contacts.details.c) obj).v6().z4();
                return;
            case 7:
                GCMActivityAppDiagnostics.shareReportPreCheck$lambda$0((GCMActivityAppDiagnostics) obj, dialogInterface, i14);
                return;
            case 8:
                int i17 = GCMUserSettingsActivity.f41539t;
                ((GCMUserSettingsActivity) obj).finish();
                return;
            case 9:
                IndexSmartScaleUserSettingsActivity.a aVar7 = IndexSmartScaleUserSettingsActivity.f41569a;
                ((IndexSmartScaleUserSettingsActivity) obj).finish();
                return;
            case 10:
                com.garmin.android.apps.connectmobile.settings.e eVar = (com.garmin.android.apps.connectmobile.settings.e) obj;
                com.garmin.android.apps.connectmobile.settings.e.a aVar8 = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                dialogInterface.getClass();
                eVar.f43405d = true;
                View viewFindViewById = ((Dialog) dialogInterface).findViewById(R.id.field_value);
                viewFindViewById.getClass();
                String string = ((EditText) viewFindViewById).getText().toString();
                wn1.h hVar2 = eVar.f43402a;
                if (hVar2 == null) {
                    p005kotlin.jvm.internal.s.m("dtoAssembler");
                    throw null;
                }
                int iB = hVar2.f186235c.b(zb0.u0.n(hVar2.f186234b, zb0.u0.S5) ? 5 : 4, string);
                if (iB == 0) {
                    k32.l lVar = eVar.f43406e;
                    if (lVar == null) {
                        p005kotlin.jvm.internal.s.m("userShortNameItem");
                        throw null;
                    }
                    lVar.h(string);
                    GCMSettingManager.C(eVar.f43403b, GCMSettingManager.f41535a.getString(R.string.key_user_short_names), string);
                    return;
                }
                wn1.h hVar3 = eVar.f43402a;
                if (hVar3 == null) {
                    p005kotlin.jvm.internal.s.m("dtoAssembler");
                    throw null;
                }
                int iA = hVar3.f186235c.a(iB);
                if (iA == 4) {
                    eVar.u6(string, eVar.getString(iA));
                    return;
                } else {
                    eVar.u6(null, eVar.getString(iA));
                    return;
                }
            case 11:
                gv2.h hVar4 = (gv2.h) obj;
                cx2.i.a aVar9 = cx2.i.f56681a;
                Fragment fragment = hVar4.f79468a;
                aVar9.getClass();
                if (!cx2.i.a.a(fragment)) {
                    hVar4.f79472e.getClass();
                    return;
                }
                String[] strArr = hVar4.f79478k;
                NumberPicker numberPicker = hVar4.f79476i;
                if (numberPicker == null) {
                    p005kotlin.jvm.internal.s.m("decimalPicker");
                    throw null;
                }
                String strValueOf = strArr[numberPicker.getValue()];
                if (strValueOf == null) {
                    NumberPicker numberPicker2 = hVar4.f79476i;
                    if (numberPicker2 == null) {
                        p005kotlin.jvm.internal.s.m("decimalPicker");
                        throw null;
                    }
                    strValueOf = String.valueOf(numberPicker2.getValue());
                }
                String[] strArr2 = hVar4.f79479l;
                NumberPicker numberPicker3 = hVar4.f79474g;
                if (numberPicker3 != null) {
                    hVar4.f79469b.h(hVar4.f79470c, hVar4.f79471d, e5.g(strArr2[numberPicker3.getValue()], ".", strValueOf));
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("numberPicker");
                    throw null;
                }
            case 12:
                int i18 = ha1.a.f82658l;
                ((ha1.a) obj).fa();
                return;
            case 13:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.C0766a c0766a = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.f40578o;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                ((com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a) obj).onResume();
                return;
            case 14:
                RegisteredUnPairedDeviceActivity registeredUnPairedDeviceActivity = (RegisteredUnPairedDeviceActivity) obj;
                int i19 = RegisteredUnPairedDeviceActivity.f33842j;
                registeredUnPairedDeviceActivity.getClass();
                new c22.n1(registeredUnPairedDeviceActivity, hb2.g.a.GARMIN_CONNECT_MOBILE).a();
                return;
            case 15:
                GCMRunModeAlertsActivity gCMRunModeAlertsActivity = (GCMRunModeAlertsActivity) obj;
                m3 m3Var = GCMRunModeAlertsActivity.f41654i[i14];
                gCMRunModeAlertsActivity.f41659e.setButtonRightLabel(gCMRunModeAlertsActivity.getString(m3Var.f23164e));
                try {
                    double dDoubleValue5 = NumberFormat.getInstance(Locale.getDefault()).parse(gCMRunModeAlertsActivity.f41658d.getButtonRightLabel()).doubleValue();
                    l3.f23124b.getClass();
                    dG = l3.a.g(dDoubleValue5, m3Var, m3.METER);
                    break;
                } catch (ParseException e4) {
                    com.garmin.android.apps.connectmobile.i2.f(com.garmin.android.apps.connectmobile.a2.SETTINGS, "GCMRunModeAlertsActivity", e4.getMessage());
                    dG = 0.0d;
                }
                gCMRunModeAlertsActivity.f41662h.S1(m3Var);
                gCMRunModeAlertsActivity.f41662h.M1(dG);
                gCMRunModeAlertsActivity.f41662h.y1("distanceAlertEnabled", Boolean.TRUE);
                dialogInterface.dismiss();
                return;
            case 16:
                TellUsMoreActivity.a aVar10 = TellUsMoreActivity.f30729i;
                ((TellUsMoreActivity) obj).finish();
                return;
            case 17:
                com.garmin.android.apps.connectmobile.e1 e1Var = ((com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h) obj).f38949a;
                if (e1Var != null) {
                    e1Var.onFragmentFinished((2 & 1) != 0 ? null : -1, null);
                    return;
                }
                return;
            case 18:
                ImageMultiPickerActivity.a aVar11 = ImageMultiPickerActivity.f46078j;
                ((ImageMultiPickerActivity) obj).finish();
                return;
            case 19:
                dialogInterface.getClass();
                ((i91.c) obj).invoke();
                dialogInterface.dismiss();
                return;
            case 20:
                ((mm0.t) obj).invoke();
                return;
            case 21:
                ((mm0.t) obj).invoke();
                return;
            case 22:
                ((vm0.h) obj).invoke();
                return;
            case 23:
                dialogInterface.dismiss();
                ((vm0.h) obj).invoke();
                return;
            case 24:
                if (((DeveloperSettingsActivity) obj).f51955g == null) {
                    p005kotlin.jvm.internal.s.m("viewModel");
                    throw null;
                }
                pn2.a.h hVar5 = pn2.a.h.values()[i14];
                hVar5.getClass();
                wr2.p pVar = wr2.p.f186870a;
                String strName = hVar5.name();
                pVar.getClass();
                wr2.p.f("felicaPrefCache", "felica.refund.policy.pref.key", strName);
                dialogInterface.dismiss();
                return;
            case 25:
                String str = DeveloperSettingsActivity.f51946n;
                ((ho.d0) obj).invoke();
                return;
            case 26:
                jv2.f fVar = (jv2.f) obj;
                cx2.i.a aVar12 = cx2.i.f56681a;
                Fragment fragment2 = fVar.f101204a;
                ArrayList arrayList = fVar.f101210g;
                aVar12.getClass();
                if (!cx2.i.a.a(fragment2)) {
                    fVar.f101208e.getClass();
                    return;
                }
                int size = arrayList.size();
                NumberPicker numberPicker4 = fVar.f101213j;
                if (size > 0) {
                    if (numberPicker4 == null) {
                        p005kotlin.jvm.internal.s.m("numberPicker");
                        throw null;
                    }
                    value = ((Number) arrayList.get(numberPicker4.getValue())).intValue();
                } else {
                    if (numberPicker4 == null) {
                        p005kotlin.jvm.internal.s.m("numberPicker");
                        throw null;
                    }
                    value = numberPicker4.getValue();
                }
                fVar.f101205b.h(fVar.f101206c, fVar.f101207d, Integer.valueOf(value));
                return;
            case 27:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b.a aVar13 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b.f40906o;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                ((com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b) obj).onResume();
                return;
            case 28:
                int i24 = ActivitiesEditIntervalsActivity.f29107m;
                ((ActivitiesEditIntervalsActivity) obj).finish();
                return;
            default:
                LiveEventRecipientsActivity.ca((LiveEventRecipientsActivity) obj);
                return;
        }
    }
}
