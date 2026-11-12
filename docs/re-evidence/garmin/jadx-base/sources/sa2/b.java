package sa2;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;
import c22.j0;
import com.garmin.android.apps.connectmobile.connectiq.requests.oauth.ConnectIQOAuthActivity;
import com.garmin.android.apps.connectmobile.device.setup.DeviceSetupActivity;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusSummaryActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.BikeAlarmResetPassCodeActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.DevicePhoneNotificationsActivityVivoActive3LTE;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceUserSettingActivityDefault;
import com.garmin.android.apps.connectmobile.settings.devices.lumen.LumenAppearanceActivity;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.smartscale.ScaleInvitationGetStartedActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.EventDetailsActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.TrainingInitiativeEventActivity;
import com.garmin.android.apps.connectmobile.view.StyledInlineTextFieldViewDark;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaUpdateUserInfoActivity;
import d53.u;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import p005kotlin.jvm.internal.x0;
import p13.h0;
import pj1.s;
import vg1.f0;
import vn2.b0;
import vn2.j1;
import w61.x;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f158324b;

    public /* synthetic */ b(Object obj, int i14) {
        this.f158323a = i14;
        this.f158324b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0304  */
    /* JADX WARN: Code duplicated, block: B:146:0x0308  */
    /* JADX WARN: Code duplicated, block: B:148:0x030e  */
    /* JADX WARN: Code duplicated, block: B:150:0x0316  */
    /* JADX WARN: Code duplicated, block: B:152:0x0320  */
    /* JADX WARN: Code duplicated, block: B:153:0x0324  */
    /* JADX WARN: Code duplicated, block: B:155:0x0328  */
    /* JADX WARN: Code duplicated, block: B:157:0x0330  */
    /* JADX WARN: Code duplicated, block: B:159:0x0334  */
    /* JADX WARN: Code duplicated, block: B:161:0x033a  */
    /* JADX WARN: Code duplicated, block: B:163:0x0342  */
    /* JADX WARN: Code duplicated, block: B:165:0x034c  */
    /* JADX WARN: Code duplicated, block: B:166:0x0350  */
    /* JADX WARN: Code duplicated, block: B:168:0x0354  */
    /* JADX WARN: Code duplicated, block: B:172:0x035c  */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark;
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark2;
        s sVarW6;
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark3;
        s sVarW7;
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark4;
        String string;
        int i15 = this.f158323a;
        Object obj = this.f158324b;
        switch (i15) {
            case 0:
                wa2.b bVar = c.f158325a;
                dialogInterface.getClass();
                ((pg2.d) obj).invoke(Boolean.TRUE);
                return;
            case 1:
                sf0.g gVar = (sf0.g) obj;
                int i16 = sf0.n.f158870v0;
                ((sf0.j) gVar.f158843q.getValue()).y4(gVar.K4()).m(null);
                return;
            case 2:
                LumenAppearanceActivity lumenAppearanceActivity = (LumenAppearanceActivity) obj;
                lumenAppearanceActivity.setResult(0);
                lumenAppearanceActivity.finish();
                return;
            case 3:
                tm0.i.a aVar = tm0.i.f165371j;
                ((tm0.i) obj).requireActivity().onBackPressed();
                return;
            case 4:
                EventDetailsActivity.a aVar2 = EventDetailsActivity.f45692o;
                dialogInterface.dismiss();
                ((EventDetailsActivity) obj).finish();
                return;
            case 5:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a aVar3 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.a) obj;
                fg0.k kVar = aVar3.K0;
                if (kVar != null) {
                    TrainingInitiativeEventActivity.a aVar4 = TrainingInitiativeEventActivity.f45718o;
                    androidx.fragment.app.m mVarRequireActivity = aVar3.requireActivity();
                    mVarRequireActivity.getClass();
                    com.garmin.android.apps.connectmobile.courses.model.e eVar = aVar3.L0;
                    aVar4.getClass();
                    Bundle bundle = new Bundle();
                    Intent intent = new Intent(mVarRequireActivity, (Class<?>) TrainingInitiativeEventActivity.class);
                    intent.putExtra("GCM_extra_sharable_event_dto", kVar);
                    bundle.putParcelable("GCM_extra_sharable_course_dto", eVar);
                    intent.putExtra("GCM_extra_is_duplicate_event", true);
                    intent.putExtra("GCM_extra_is_sharable_event", true);
                    com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, bundle);
                    mVarRequireActivity.startActivityForResult(intent, 100);
                }
                dialogInterface.dismiss();
                return;
            case 6:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.i iVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.i) obj;
                iVar.f46070d.f(false);
                dialogInterface.dismiss();
                iVar.requireActivity().onBackPressed();
                return;
            case 7:
                ConnectIQOAuthActivity connectIQOAuthActivity = (ConnectIQOAuthActivity) obj;
                int i17 = ConnectIQOAuthActivity.f31981g;
                dialogInterface.getClass();
                EditText editText = connectIQOAuthActivity.f31982a;
                if (editText == null) {
                    p005kotlin.jvm.internal.s.m("addressBar");
                    throw null;
                }
                editText.setVisibility(0);
                WebView webView = connectIQOAuthActivity.f31983b;
                if (webView == null) {
                    p005kotlin.jvm.internal.s.m("oAuthView");
                    throw null;
                }
                webView.setVisibility(0);
                connectIQOAuthActivity.f31986e = false;
                connectIQOAuthActivity.invalidateOptionsMenu();
                connectIQOAuthActivity.ea();
                dialogInterface.dismiss();
                return;
            case 8:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d dVar = (com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d) obj;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar5 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                dialogInterface.getClass();
                StyledInlineTextFieldViewDark styledInlineTextFieldViewDark5 = dVar.f43754m;
                if (styledInlineTextFieldViewDark5 == null) {
                    p005kotlin.jvm.internal.s.m("primaryPhoneNumber");
                    throw null;
                }
                if (styledInlineTextFieldViewDark5.getHasError()) {
                    StyledInlineTextFieldViewDark styledInlineTextFieldViewDark6 = dVar.f43755n;
                    if (styledInlineTextFieldViewDark6 == null) {
                        p005kotlin.jvm.internal.s.m("secondaryPhoneNumber");
                        throw null;
                    }
                    if (styledInlineTextFieldViewDark6.getHasError()) {
                        s sVarW8 = dVar.w6();
                        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark7 = dVar.f43754m;
                        if (styledInlineTextFieldViewDark7 == null) {
                            p005kotlin.jvm.internal.s.m("primaryPhoneNumber");
                            throw null;
                        }
                        boolean hasError = styledInlineTextFieldViewDark7.getHasError();
                        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark8 = dVar.f43755n;
                        if (styledInlineTextFieldViewDark8 == null) {
                            p005kotlin.jvm.internal.s.m("secondaryPhoneNumber");
                            throw null;
                        }
                        if (sVarW8.K4(hasError, styledInlineTextFieldViewDark8.getHasError())) {
                            dVar.z6(false);
                            dVar.A6(false);
                        }
                    } else {
                        styledInlineTextFieldViewDark = dVar.f43754m;
                        if (styledInlineTextFieldViewDark != null) {
                            p005kotlin.jvm.internal.s.m("primaryPhoneNumber");
                            throw null;
                        }
                        if (styledInlineTextFieldViewDark.getHasError()) {
                            sVarW7 = dVar.w6();
                            styledInlineTextFieldViewDark4 = dVar.f43754m;
                            if (styledInlineTextFieldViewDark4 != null) {
                                p005kotlin.jvm.internal.s.m("primaryPhoneNumber");
                                throw null;
                            }
                            if (sVarW7.K4(styledInlineTextFieldViewDark4.getHasError(), false)) {
                                dVar.z6(false);
                            }
                        } else if (g22.n.d(dVar.f43763x)) {
                            styledInlineTextFieldViewDark2 = dVar.f43755n;
                            if (styledInlineTextFieldViewDark2 != null) {
                                p005kotlin.jvm.internal.s.m("secondaryPhoneNumber");
                                throw null;
                            }
                            if (styledInlineTextFieldViewDark2.getHasError()) {
                                sVarW6 = dVar.w6();
                                styledInlineTextFieldViewDark3 = dVar.f43755n;
                                if (styledInlineTextFieldViewDark3 != null) {
                                    p005kotlin.jvm.internal.s.m("secondaryPhoneNumber");
                                    throw null;
                                }
                                if (sVarW6.K4(false, styledInlineTextFieldViewDark3.getHasError())) {
                                    dVar.A6(false);
                                }
                            }
                        }
                    }
                } else {
                    styledInlineTextFieldViewDark = dVar.f43754m;
                    if (styledInlineTextFieldViewDark != null) {
                        p005kotlin.jvm.internal.s.m("primaryPhoneNumber");
                        throw null;
                    }
                    if (styledInlineTextFieldViewDark.getHasError()) {
                        sVarW7 = dVar.w6();
                        styledInlineTextFieldViewDark4 = dVar.f43754m;
                        if (styledInlineTextFieldViewDark4 != null) {
                            p005kotlin.jvm.internal.s.m("primaryPhoneNumber");
                            throw null;
                        }
                        if (sVarW7.K4(styledInlineTextFieldViewDark4.getHasError(), false)) {
                            dVar.z6(false);
                        }
                    } else if (g22.n.d(dVar.f43763x)) {
                        styledInlineTextFieldViewDark2 = dVar.f43755n;
                        if (styledInlineTextFieldViewDark2 != null) {
                            p005kotlin.jvm.internal.s.m("secondaryPhoneNumber");
                            throw null;
                        }
                        if (styledInlineTextFieldViewDark2.getHasError()) {
                            sVarW6 = dVar.w6();
                            styledInlineTextFieldViewDark3 = dVar.f43755n;
                            if (styledInlineTextFieldViewDark3 != null) {
                                p005kotlin.jvm.internal.s.m("secondaryPhoneNumber");
                                throw null;
                            }
                            if (sVarW6.K4(false, styledInlineTextFieldViewDark3.getHasError())) {
                                dVar.A6(false);
                            }
                        }
                    }
                }
                dialogInterface.dismiss();
                return;
            case 9:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.a aVar6 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.f43777g;
                ((com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e) obj).v6().L4();
                return;
            case 10:
                ur0.a aVar7 = (ur0.a) obj;
                ur0.a.C3218a c3218a = ur0.a.f172319e;
                dialogInterface.getClass();
                int iU6 = aVar7.u6();
                xg1.i<Double> iVar2 = aVar7.f172323d;
                if (iVar2 != null && iU6 > 0) {
                    iVar2.a(Double.valueOf(iU6));
                }
                dialogInterface.dismiss();
                return;
            case 11:
                com.garmin.android.apps.connectmobile.badges.redesign.b.a aVar8 = com.garmin.android.apps.connectmobile.badges.redesign.b.X;
                j22.b bVar2 = j22.b.f96736a;
                j22.a[] aVarArr = {j22.a.f96722k};
                bVar2.getClass();
                j22.b.z((com.garmin.android.apps.connectmobile.badges.redesign.b) obj, 3, aVarArr);
                return;
            case 12:
                v92.h.a aVar9 = v92.h.f176379f;
                ((v92.h) obj).u6().f176473h.m(v92.a.e.f176299a);
                return;
            case 13:
                BikeAlarmResetPassCodeActivity.a aVar10 = BikeAlarmResetPassCodeActivity.f42565o;
                ((BikeAlarmResetPassCodeActivity) obj).finish();
                return;
            case 14:
                DevicePhoneNotificationsActivityVivoActive3LTE devicePhoneNotificationsActivityVivoActive3LTE = ((DevicePhoneNotificationsActivityVivoActive3LTE.a) obj).f42691a;
                if (devicePhoneNotificationsActivityVivoActive3LTE.f42688g.Q0()) {
                    if (i14 == 0) {
                        devicePhoneNotificationsActivityVivoActive3LTE.f42688g.f33863b1.i0("SHOW_ALL");
                    } else if (i14 == 1) {
                        devicePhoneNotificationsActivityVivoActive3LTE.f42688g.f33863b1.i0("SHOW_CALLS_ONLY");
                    } else if (i14 == 2) {
                        devicePhoneNotificationsActivityVivoActive3LTE.f42688g.f33863b1.i0("SHOW_CALLS_AND_TEXTS");
                    }
                    wi1.c cVar = devicePhoneNotificationsActivityVivoActive3LTE.f42688g.f33863b1;
                    devicePhoneNotificationsActivityVivoActive3LTE.f42686e = cVar.f185502a;
                    devicePhoneNotificationsActivityVivoActive3LTE.f42684c.setButtonBottomLeftLabel(cVar.F(devicePhoneNotificationsActivityVivoActive3LTE));
                }
                dialogInterface.dismiss();
                return;
            case 15:
                DevicePhoneNotificationsActivityVivoActive3LTE devicePhoneNotificationsActivityVivoActive3LTE2 = ((DevicePhoneNotificationsActivityVivoActive3LTE.b) obj).f42692a;
                if (devicePhoneNotificationsActivityVivoActive3LTE2.f42688g.S0()) {
                    if (i14 == 0) {
                        devicePhoneNotificationsActivityVivoActive3LTE2.f42688g.f33865c1.i0("SHOW_ALL");
                    } else if (i14 == 1) {
                        devicePhoneNotificationsActivityVivoActive3LTE2.f42688g.f33865c1.i0("SHOW_CALLS_ONLY");
                    } else if (i14 == 2) {
                        devicePhoneNotificationsActivityVivoActive3LTE2.f42688g.f33865c1.i0("SHOW_CALLS_AND_TEXTS");
                    }
                    wi1.f fVar = devicePhoneNotificationsActivityVivoActive3LTE2.f42688g.f33865c1;
                    devicePhoneNotificationsActivityVivoActive3LTE2.f42687f = fVar.f185502a;
                    devicePhoneNotificationsActivityVivoActive3LTE2.f42685d.setButtonBottomLeftLabel(fVar.F(devicePhoneNotificationsActivityVivoActive3LTE2));
                }
                dialogInterface.dismiss();
                return;
            case 16:
                int i18 = DeviceUserSettingActivityDefault.K0;
                ((DeviceUserSettingActivityDefault) obj).finish();
                return;
            case 17:
                DeviceUserSettingActivityDefault deviceUserSettingActivityDefault = DeviceUserSettingActivityDefault.this;
                deviceUserSettingActivityDefault.f42749c.P0(UserSettingsDTO.c.values()[i14]);
                deviceUserSettingActivityDefault.ea();
                dialogInterface.dismiss();
                return;
            case 18:
                DeviceUserSettingActivityDefault deviceUserSettingActivityDefault2 = DeviceUserSettingActivityDefault.this;
                deviceUserSettingActivityDefault2.f42749c.R0(UserSettingsDTO.d.values()[i14]);
                UserSettingsDTO userSettingsDTO = deviceUserSettingActivityDefault2.f42749c;
                if (userSettingsDTO != null) {
                    deviceUserSettingActivityDefault2.f42763p.setButtonBottomLeftLabel(deviceUserSettingActivityDefault2.getString(userSettingsDTO.H().f43545b));
                }
                dialogInterface.dismiss();
                return;
            case 19:
                int i19 = f0.f178101h;
                ((f0) obj).finish();
                return;
            case 20:
                Logger logger = vn2.m.f178912c;
                ((vn2.m) obj).getView().c();
                return;
            case 21:
                Logger logger2 = b0.f178864c;
                com.garmin.feature.garminpay.providers.felica.ui.b view2 = ((b0) obj).getView();
                x0 x0Var = x0.f105818a;
                tn2.g.f165559a.getClass();
                view2.T8(String.format("https://www.garmin.com/%s/account/", Arrays.copyOf(new Object[]{u.v(hb2.h.b(), "_", "-", false)}, 1)));
                return;
            case 22:
                FelicaUpdateUserInfoActivity.a aVar11 = FelicaUpdateUserInfoActivity.f50988j;
                j1 j1Var = ((FelicaUpdateUserInfoActivity) obj).f50991h;
                if (j1Var == null) {
                    p005kotlin.jvm.internal.s.m("presenter");
                    throw null;
                }
                j1Var.v();
                dialogInterface.dismiss();
                return;
            case 23:
                vy1.e.a aVar12 = vy1.e.T;
                j22.b bVar3 = j22.b.f96736a;
                androidx.fragment.app.m mVarRequireActivity2 = ((vy1.e) obj).requireActivity();
                mVarRequireActivity2.getClass();
                bVar3.getClass();
                j22.b.r(mVarRequireActivity2);
                dialogInterface.dismiss();
                return;
            case 24:
                x xVar = ((TrainingStatusSummaryActivity) obj).f40070o;
                if (xVar == null) {
                    p005kotlin.jvm.internal.s.m("viewModel");
                    throw null;
                }
                xVar.K4(j0.b(DateTime.now(), "yyyy-MM-dd", null));
                dialogInterface.dismiss();
                return;
            case 25:
                com.garmin.android.apps.connectmobile.golf.truswing.a.b bVar4 = (com.garmin.android.apps.connectmobile.golf.truswing.a.b) obj;
                com.garmin.android.apps.connectmobile.golf.truswing.a.b.InterfaceC0624a interfaceC0624a = bVar4.f35808c;
                if (interfaceC0624a != null) {
                    String string2 = bVar4.f35807b.getText().toString();
                    com.garmin.android.apps.connectmobile.golf.truswing.a aVar13 = ((wl0.b) interfaceC0624a).f185896a;
                    String strTrim = string2.trim();
                    if (!strTrim.equals(aVar13.f35804z.f35887f)) {
                        aVar13.f35804z.f35887f = strTrim;
                        aVar13.h7();
                    }
                }
                ((InputMethodManager) bVar4.getContext().getSystemService("input_method")).hideSoftInputFromWindow(bVar4.f35807b.getWindowToken(), 0);
                bVar4.dismiss();
                return;
            case 26:
                com.garmin.android.apps.connectmobile.golf.truswing.a.d dVar2 = (com.garmin.android.apps.connectmobile.golf.truswing.a.d) obj;
                dVar2.f35809a = i14;
                com.garmin.android.apps.connectmobile.golf.truswing.a.d.InterfaceC0625a interfaceC0625a = dVar2.f35810b;
                if (interfaceC0625a != null) {
                    com.garmin.android.apps.connectmobile.golf.truswing.a aVar14 = ((wl0.b) interfaceC0625a).f185896a;
                    aVar14.B = i14;
                    aVar14.g7();
                }
                dialogInterface.dismiss();
                return;
            case 27:
                int i24 = ScaleInvitationGetStartedActivity.f44387f;
                ((ScaleInvitationGetStartedActivity) obj).finish();
                return;
            case 28:
                DeviceSetupActivity.a aVar15 = DeviceSetupActivity.f33758b;
                ((DeviceSetupActivity) obj).da(com.garmin.android.apps.connectmobile.device.setup.a.d.INSTANCE);
                return;
            default:
                xg1.d dVar3 = (xg1.d) obj;
                NumberPicker numberPicker = dVar3.f190885f;
                if (numberPicker == null) {
                    p005kotlin.jvm.internal.s.m("integerValuePicker");
                    throw null;
                }
                NumberPicker numberPicker2 = dVar3.f190886g;
                if (numberPicker2 == null) {
                    p005kotlin.jvm.internal.s.m("decimalValuePicker");
                    throw null;
                }
                NumberPicker numberPicker3 = dVar3.f190887h;
                if (numberPicker3 == null) {
                    p005kotlin.jvm.internal.s.m("unitPicker");
                    throw null;
                }
                Iterator it = p13.x.k(numberPicker, numberPicker2, numberPicker3).iterator();
                while (it.hasNext()) {
                    ((NumberPicker) it.next()).clearFocus();
                }
                if (dVar3.f190889j) {
                    TextView textView = dVar3.f190888i;
                    if (textView == null) {
                        p005kotlin.jvm.internal.s.m("unit");
                        throw null;
                    }
                    string = textView.getText().toString();
                } else {
                    Set<String> setKeySet = dVar3.f190883d.keySet();
                    NumberPicker numberPicker4 = dVar3.f190887h;
                    if (numberPicker4 == null) {
                        p005kotlin.jvm.internal.s.m("unitPicker");
                        throw null;
                    }
                    string = (String) h0.W(setKeySet, numberPicker4.getValue());
                }
                NumberPicker numberPicker5 = dVar3.f190885f;
                if (numberPicker5 == null) {
                    p005kotlin.jvm.internal.s.m("integerValuePicker");
                    throw null;
                }
                double value = numberPicker5.getValue();
                NumberPicker numberPicker6 = dVar3.f190886g;
                if (numberPicker6 == null) {
                    p005kotlin.jvm.internal.s.m("decimalValuePicker");
                    throw null;
                }
                dVar3.f190884e.invoke(Double.valueOf((((double) numberPicker6.getValue()) / ((double) 10)) + value), string);
                dialogInterface.dismiss();
                return;
        }
    }
}
