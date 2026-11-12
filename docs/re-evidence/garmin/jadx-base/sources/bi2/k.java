package bi2;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.NumberPicker;
import androidx.fragment.app.Fragment;
import c22.l3;
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.connections.groups.details.GroupSettingsActivity;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.forceupdate.MinVersionSupportService;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.navigation.more.MoreActivity;
import com.garmin.android.apps.connectmobile.powerguide.create.CreatePowerGuideStrategyActivity;
import com.garmin.android.apps.connectmobile.powerguide.create.ScheduledEventsActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.views.GCMPregnancyTwoLineButton;
import com.garmin.android.apps.connectmobile.segments.data.model.SegmentLeaderboardRowDTO;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.LifestyleLoggingOnboardingReset;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.MapProviderSetting;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.MinSupportedVersion;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.SetAsNewLivetrackUser;
import com.garmin.android.apps.connectmobile.settings.devices.VivosmartHRDeviceSettingsDisplay;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.b.c;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.view.privacy.PrivacySelectionActivity;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.feature.garminpay.ui.developer.DeveloperSettingsActivity;
import ew1.b3;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import r22.h1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class k implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18185d;

    public /* synthetic */ k(e23.l lVar, lj1.c cVar, Context context, androidx.appcompat.app.e.a aVar) {
        this.f18182a = 16;
        this.f18185d = lVar;
        this.f18183b = cVar;
        this.f18184c = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) throws ParseException {
        int value;
        int value2;
        double dDoubleValue;
        double value3;
        int value4;
        double d14;
        int i15 = this.f18182a;
        int i16 = 0;
        Object obj = this.f18184c;
        Object obj2 = this.f18183b;
        Object obj3 = this.f18185d;
        switch (i15) {
            case 0:
                m mVar = (m) obj3;
                mVar.f18209b.n(mVar.f18210c, mVar.f18211d, p13.x.k(Integer.valueOf(((NumberPicker) obj2).getValue()), Integer.valueOf(((NumberPicker) obj).getValue())));
                return;
            case 1:
                v vVar = (v) obj3;
                vVar.f18268b.n(vVar.f18269c, vVar.f18270d, p13.x.k(Integer.valueOf(((NumberPicker) obj2).getValue()), Integer.valueOf(((NumberPicker) obj).getValue())));
                return;
            case 2:
                x xVar = (x) obj3;
                EditText editText = (EditText) obj;
                NumberPicker numberPicker = (NumberPicker) obj2;
                String[] strArr = xVar.f18284f;
                if (strArr != null) {
                    xVar.f18280b.n(xVar.f18281c, xVar.f18282d, p13.x.k(editText.getText().toString(), strArr[numberPicker.getValue()]));
                    return;
                }
                return;
            case 3:
                p0 p0Var = (p0) obj3;
                p0Var.f18243b.n(p0Var.f18244c, p0Var.f18245d, p13.x.k(Integer.valueOf(((NumberPicker) obj2).getValue()), Integer.valueOf(((NumberPicker) obj).getValue())));
                return;
            case 4:
                ((LifestyleLoggingOnboardingReset) obj3).resetOnboarding((View) obj2, (e23.l) obj);
                return;
            case 5:
                MapProviderSetting.handleClick$lambda$3((ArrayList) obj3, (e23.a) obj2, (mg1.a) obj, dialogInterface, i14);
                return;
            case 6:
                MinSupportedVersion.handleClick$lambda$0((MinVersionSupportService.a[]) obj3, (mg1.a) obj2, (e23.a) obj, dialogInterface, i14);
                return;
            case 7:
                SetAsNewLivetrackUser.handleClick$lambda$1((mg1.a) obj3, (e23.a) obj2, (Context) obj, dialogInterface, i14);
                return;
            case 8:
                com.garmin.android.apps.connectmobile.settings.devices.wifi.b bVar = (com.garmin.android.apps.connectmobile.settings.devices.wifi.b) obj3;
                com.garmin.android.apps.connectmobile.settings.devices.wifi.m.b bVar2 = (com.garmin.android.apps.connectmobile.settings.devices.wifi.m.b) obj2;
                com.garmin.android.apps.connectmobile.settings.devices.wifi.k kVar = (com.garmin.android.apps.connectmobile.settings.devices.wifi.k) obj;
                com.garmin.android.apps.connectmobile.settings.devices.wifi.b.C0803b c0803b = com.garmin.android.apps.connectmobile.settings.devices.wifi.b.f43259w;
                dialogInterface.getClass();
                String string = ((EditText) ((Dialog) dialogInterface).findViewById(R.id.password)).getText().toString();
                if (i14 != -1) {
                    bVar.C6(true);
                    return;
                }
                GCMSettingManager.T(bVar.f43264e, false);
                bVar.A6(bVar2);
                if (!bVar.f43275p) {
                    boolean zB = hd0.a.b(string);
                    kVar.f43323d = string;
                    kVar.f43324e = zB;
                    bVar.f43262c.getClass();
                    bVar.z6(bVar2);
                    return;
                }
                bVar.f43272m = bVar.new c(bVar2, kVar);
                wn1.i0 i0VarM = wn1.i0.M();
                long j8 = bVar.f43264e;
                String str = kVar.f43320a;
                str.getClass();
                com.garmin.android.apps.connectmobile.settings.devices.wifi.k.c cVar = kVar.f43321b;
                cVar.getClass();
                com.garmin.android.apps.connectmobile.settings.devices.wifi.b.c cVar2 = bVar.f43272m;
                i0VarM.getClass();
                if (TextUtils.isEmpty(str)) {
                    vb.h.s("Empty SSID and/or null security type");
                    return;
                } else {
                    com.garmin.android.library.backgroundtaskmanagement.c.d(new com.garmin.android.apps.connectmobile.settings.devices.wifi.j(j8, str, cVar, string, i0VarM), cVar2);
                    return;
                }
            case 9:
                ((GSMRedirectActivity.r) obj3).e((t10.n) obj2, ((WorkoutDetailsDTO) ((g3) obj).f35301b).f48044e);
                return;
            case 10:
                Activity activity = (Activity) obj3;
                eg1.j jVar = eg1.j.f64004a;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                eg1.j.f64004a.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(R.string.segment_privacy_only_me));
                arrayList.add(Integer.valueOf(R.string.segment_privacy_my_connections));
                arrayList.add(Integer.valueOf(R.string.segment_privacy_groups));
                arrayList.add(Integer.valueOf(R.string.segment_privacy_everyone));
                PrivacySelectionActivity.a aVar = PrivacySelectionActivity.f47684c;
                String string2 = activity.getString(R.string.edit_activity_privacy);
                string2.getClass();
                activity.startActivityForResult(PrivacySelectionActivity.a.b(aVar, activity, string2, (PrivacyType) obj2, arrayList, ((SegmentLeaderboardRowDTO) obj).f41236l), 12);
                return;
            case 11:
                b3.a aVar2 = b3.f66335d;
                dialogInterface.dismiss();
                ((b3) obj3).E6((fg0.k) obj2, (fw1.a) obj);
                return;
            case 12:
                com.garmin.android.apps.connectmobile.contacts.details.c cVar3 = (com.garmin.android.apps.connectmobile.contacts.details.c) obj3;
                String str2 = (String) obj2;
                com.garmin.android.apps.connectmobile.contacts.details.c.a aVar3 = com.garmin.android.apps.connectmobile.contacts.details.c.f32482m;
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("smsto:" + str2));
                String string3 = cVar3.getString(R.string.contacts_validation_live_event_sharing_msg, (String) obj);
                string3.getClass();
                intent.putExtra("sms_body", string3);
                try {
                    cVar3.f32486h = str2;
                    cVar3.f32490l.a(intent, null);
                    break;
                } catch (ActivityNotFoundException e4) {
                    String strN = fb1.c.n("Unable to start default SMS Package! ActivityNotFoundException message follows: ", e4.getMessage());
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.f(a2Var, "LiveTrackLiveEventShareContactDetailsFragment", strN);
                }
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                    return;
                }
                return;
            case 13:
                g40.f fVar = (g40.f) obj3;
                EditText editText2 = (EditText) obj2;
                Double d15 = (Double) obj;
                q3 q3Var = fVar.f75779b ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                g40.e eVar = fVar.f75778a;
                if (eVar != null) {
                    String string4 = editText2.getText().toString();
                    if (d15 != null) {
                        if (TextUtils.isEmpty(string4)) {
                            l3.a aVar5 = l3.f23124b;
                            double dDoubleValue2 = d15.doubleValue();
                            q3 q3Var2 = q3.METERS_PER_SECOND;
                            aVar5.getClass();
                            eVar.a(l3.a.w(dDoubleValue2, q3Var, q3Var2));
                        } else {
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
                            decimalFormatSymbols.setDecimalSeparator('.');
                            DecimalFormat decimalFormat = new DecimalFormat();
                            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
                            Number number = decimalFormat.parse(string4);
                            double dDoubleValue3 = number != null ? number.doubleValue() : d15.doubleValue();
                            if (dDoubleValue3 < d15.doubleValue()) {
                                l3.a aVar6 = l3.f23124b;
                                double dDoubleValue4 = d15.doubleValue();
                                q3 q3Var3 = q3.METERS_PER_SECOND;
                                aVar6.getClass();
                                eVar.a(l3.a.w(dDoubleValue4, q3Var, q3Var3));
                            } else {
                                l3.a aVar7 = l3.f23124b;
                                q3 q3Var4 = q3.METERS_PER_SECOND;
                                aVar7.getClass();
                                eVar.a(l3.a.T1(l3.a.w(dDoubleValue3, q3Var, q3Var4), 2));
                            }
                        }
                    }
                }
                fVar.dismiss();
                return;
            case 14:
                hc0.k kVar2 = (hc0.k) obj3;
                gj1.c cVar4 = (gj1.c) obj2;
                sd2.f fVar2 = (sd2.f) obj;
                if (cVar4 != null) {
                    kVar2.J0.z4(cVar4).f(kVar2, new hc0.f(i16, kVar2, fVar2));
                    return;
                } else {
                    kVar2.T6(fVar2, null);
                    return;
                }
            case 15:
                hg1.m mVar2 = (hg1.m) obj3;
                NumberPicker numberPicker2 = (NumberPicker) obj2;
                NumberPicker numberPicker3 = (NumberPicker) obj;
                if (mVar2.f83716b == hg1.j.ALERT_TYPE_VIRTUAL_PACER) {
                    value = numberPicker2.getValue() * 60;
                    value2 = numberPicker3.getValue();
                } else {
                    value = numberPicker2.getValue() * 60;
                    value2 = numberPicker3.getValue();
                }
                mVar2.f83715a.b((value2 * 30) + value);
                dialogInterface.dismiss();
                return;
            case 16:
                lj1.c cVar5 = (lj1.c) obj2;
                Context context = (Context) obj;
                dialogInterface.dismiss();
                ((e23.l) obj3).invoke(Boolean.FALSE);
                try {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("MORE_START_DESTINATION_EXTRA", ty0.b.J2);
                    if (cVar5 != null) {
                        bundle.putParcelable("MORE_REMOVED_DEVICE_EXTRA", cVar5);
                    }
                    Intent intent2 = new Intent(context, (Class<?>) MoreActivity.class);
                    intent2.putExtras(bundle);
                    context.startActivity(intent2);
                    return;
                } catch (ActivityNotFoundException e14) {
                    a2 a2Var2 = a2.GENERAL;
                    i2.f36769a.getClass();
                    i2.a.g(a2Var2, "showDeviceRemovedAlert", e14);
                    return;
                }
            case 17:
                hv2.f fVar3 = (hv2.f) obj3;
                NumberPicker numberPicker4 = (NumberPicker) obj2;
                NumberPicker numberPicker5 = (NumberPicker) obj;
                cx2.i.a aVar8 = cx2.i.f56681a;
                Fragment fragment = fVar3.f85909a;
                aVar8.getClass();
                if (cx2.i.a.a(fragment)) {
                    fVar3.f85910b.h(fVar3.f85911c, fVar3.f85912d, new Integer[]{Integer.valueOf(numberPicker4.getValue()), Integer.valueOf(numberPicker5.getValue())});
                    return;
                }
                return;
            case 18:
                View view2 = (View) obj;
                int i17 = GroupSettingsActivity.f31420z;
                ((DialogInterface.OnClickListener) obj2).onClick(dialogInterface, i14);
                InputMethodManager inputMethodManager = (InputMethodManager) ((GroupSettingsActivity) obj3).getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(view2.getWindowToken(), 0);
                    return;
                }
                return;
            case 19:
                NumberPicker numberPicker6 = (NumberPicker) obj2;
                NumberPicker numberPicker7 = (NumberPicker) obj;
                j42.b bVar3 = (j42.b) obj3;
                int i18 = j42.b.f97028k;
                numberPicker6.clearFocus();
                numberPicker7.clearFocus();
                if (bVar3.f97032d) {
                    Double dValueOf = Double.valueOf(numberPicker6.getValue() + "." + numberPicker7.getValue());
                    dValueOf.getClass();
                    dDoubleValue = dValueOf.doubleValue();
                } else {
                    l3.a aVar9 = l3.f23124b;
                    Double dValueOf2 = Double.valueOf(numberPicker6.getValue() + "." + numberPicker7.getValue());
                    dValueOf2.getClass();
                    double dDoubleValue5 = dValueOf2.doubleValue();
                    aVar9.getClass();
                    dDoubleValue = dDoubleValue5 / 2.20462d;
                }
                if (bVar3.f97033e) {
                    f12.l.f68084a.getClass();
                    f12.l.a.a().K1(dDoubleValue);
                }
                bVar3.f97030b.j(dDoubleValue);
                dialogInterface.dismiss();
                return;
            case 20:
                List list = (List) obj3;
                String str3 = DeveloperSettingsActivity.f51946n;
                wr2.p pVar = wr2.p.f186870a;
                String strD = kg.f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.felica_device_name_overwrite);
                String str4 = ((jr2.g) list.get(i14)).f100566b;
                pVar.getClass();
                wr2.p.f("general_app", strD, str4);
                ((kr2.g) obj2).invoke(((jr2.g) list.get(i14)).f100566b);
                wn2.a aVar10 = ((DeveloperSettingsActivity) obj).f51958j;
                if (aVar10 != null) {
                    kr2.h.a aVar11 = kr2.h.f106255y;
                    kr2.h.c cVar6 = kr2.h.c.SET_DEVICE_NAME_OVERWRITE;
                    aVar11.getClass();
                    int iA = kr2.h.a.a(cVar6);
                    jr2.m mVar3 = aVar10.f186347a;
                    if (mVar3 == null) {
                        p005kotlin.jvm.internal.s.m("settingsItemAdapter");
                        throw null;
                    }
                    mVar3.notifyItemChanged(iA);
                }
                dialogInterface.dismiss();
                return;
            case 21:
                ((kd0.g) obj3).b((Context) obj2, (Intent) obj);
                dialogInterface.dismiss();
                return;
            case 22:
                lo.t tVar = (lo.t) obj3;
                String str5 = (String) obj;
                String string5 = ((EditText) ((View) obj2).findViewById(R.id.dialog_edit_text)).getText().toString();
                tVar.f113949a.c1(str5, TextUtils.isEmpty(string5) ? null : string5);
                tVar.w6();
                dialogInterface.dismiss();
                return;
            case 23:
                lo.t tVar2 = (lo.t) obj3;
                NumberPicker numberPicker8 = (NumberPicker) obj2;
                numberPicker8.clearFocus();
                tVar2.f113949a.e1(false, (String) obj, numberPicker8.getValue());
                tVar2.w6();
                return;
            case 24:
                VivosmartHRDeviceSettingsDisplay vivosmartHRDeviceSettingsDisplay = ((VivosmartHRDeviceSettingsDisplay.e) obj3).f42451a;
                vivosmartHRDeviceSettingsDisplay.f42444n.C1((DeviceSettingsDTO.g) ((ArrayList) obj2).get(i14));
                vivosmartHRDeviceSettingsDisplay.f42443m.setButtonBottomLeftLabel(((CharSequence[]) obj)[i14].toString());
                dialogInterface.dismiss();
                return;
            case 25:
                pb1.l lVar = (pb1.l) obj3;
                p005kotlin.jvm.internal.p0 p0Var2 = (p005kotlin.jvm.internal.p0) obj2;
                UserSettingsDTO userSettingsDTO = (UserSettingsDTO) obj;
                pb1.l.a aVar12 = pb1.l.f136861l;
                gg1.h0[] h0VarArrValues = gg1.h0.values();
                dialogInterface.getClass();
                gg1.h0 h0Var = h0VarArrValues[((androidx.appcompat.app.e) dialogInterface).f4658a.f4596g.getCheckedItemPosition()];
                i52.a aVar13 = i52.a.f91796a;
                h0Var.getClass();
                SharedPreferences.Editor editorEdit = i52.a.f91797b.edit();
                i52.a.f91796a.getClass();
                editorEdit.putString(i52.a.c(R.string.key_user_glucose_measurement_unit), h0Var.f77242a).apply();
                GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton = lVar.f136872j;
                if (gCMPregnancyTwoLineButton == null) {
                    p005kotlin.jvm.internal.s.m("mGlucoseMeasurementButton");
                    throw null;
                }
                gCMPregnancyTwoLineButton.setButtonValueLabel(lVar.getString(h0Var.f77243b));
                GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton2 = lVar.f136872j;
                if (gCMPregnancyTwoLineButton2 == null) {
                    p005kotlin.jvm.internal.s.m("mGlucoseMeasurementButton");
                    throw null;
                }
                String string6 = lVar.getString(h0Var.f77244c);
                string6.getClass();
                gCMPregnancyTwoLineButton2.setValueContentDescription(string6);
                p0Var2.f105807a = h0Var.ordinal();
                userSettingsDTO.Q0(h0Var);
                return;
            case 26:
                NumberPicker numberPicker9 = (NumberPicker) obj2;
                NumberPicker numberPicker10 = (NumberPicker) obj;
                h1 h1Var = (h1) obj3;
                h1.a aVar14 = h1Var.f149668a;
                numberPicker9.clearFocus();
                numberPicker10.clearFocus();
                if (numberPicker9.getValue() != 0 || h1Var.f149672e.isEmpty()) {
                    int i19 = (int) h1Var.f149670c;
                    if (i19 == 1) {
                        value3 = numberPicker9.getValue();
                        value4 = numberPicker10.getValue();
                    } else if (i19 != 2) {
                        value3 = numberPicker9.getValue() - 1;
                        value4 = numberPicker10.getValue();
                    } else {
                        value3 = numberPicker9.getValue() + 1;
                        value4 = numberPicker10.getValue();
                    }
                    d14 = (((double) value4) / 10.0d) + value3;
                } else {
                    d14 = 0.0d;
                }
                if (d14 == 0.0d) {
                    if (aVar14 != null) {
                        ((lo.m) aVar14).b(Double.valueOf(d14), "po2MaxValue");
                    }
                    if (aVar14 != null) {
                        ((lo.m) aVar14).b(Double.valueOf(d14), "po2MinValue");
                    }
                } else if (aVar14 != null) {
                    ((lo.m) aVar14).b(Double.valueOf(d14), h1Var.f149669b);
                }
                dialogInterface.dismiss();
                return;
            case 27:
                ScheduledEventsActivity scheduledEventsActivity = (ScheduledEventsActivity) obj3;
                ab1.m mVar4 = (ab1.m) obj;
                ScheduledEventsActivity.a aVar15 = ScheduledEventsActivity.f40379d;
                CreatePowerGuideStrategyActivity.a aVar16 = CreatePowerGuideStrategyActivity.f40374b;
                Double dValueOf3 = Double.valueOf(mVar4.f2607b);
                String str6 = mVar4.f2606a;
                aVar16.getClass();
                CreatePowerGuideStrategyActivity.a.a(scheduledEventsActivity, (String) obj2, dValueOf3, str6);
                scheduledEventsActivity.finish();
                return;
            case 28:
                vn2.b0 b0Var = (vn2.b0) obj3;
                Logger logger = vn2.b0.f178864c;
                dialogInterface.dismiss();
                b0Var.getView().U5(R.string.wallet_deleting_card);
                b0Var.getView().h();
                b0Var.getView().j();
                ((q03.b) ((e23.a) obj2).invoke()).k(l13.a.f108327b).h(r03.a.a()).i(new vn2.y(new vn2.t(b0Var, 27), 11), new com.mapbox.maps.m((e23.a) obj, 5));
                return;
            default:
                String[] strArr2 = (String[]) obj2;
                com.garmin.android.library.mobileauth.ui.c.a.InterfaceC1004a interfaceC1004a = (com.garmin.android.library.mobileauth.ui.c.a.InterfaceC1004a) obj;
                if (p005kotlin.jvm.internal.s.g(((ve2.e) obj3).name(), strArr2[i14])) {
                    return;
                }
                String str7 = strArr2[i14];
                str7.getClass();
                interfaceC1004a.d(ve2.e.valueOf(str7));
                return;
        }
    }

    public /* synthetic */ k(x xVar, EditText editText, NumberPicker numberPicker) {
        this.f18182a = 2;
        this.f18185d = xVar;
        this.f18184c = editText;
        this.f18183b = numberPicker;
    }

    public /* synthetic */ k(int i14, NumberPicker numberPicker, NumberPicker numberPicker2, Object obj) {
        this.f18182a = i14;
        this.f18183b = numberPicker;
        this.f18184c = numberPicker2;
        this.f18185d = obj;
    }

    public /* synthetic */ k(Object obj, int i14, Object obj2, Object obj3) {
        this.f18182a = i14;
        this.f18185d = obj;
        this.f18183b = obj2;
        this.f18184c = obj3;
    }
}
