package ag0;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Spinner;
import androidx.lifecycle.v1;
import androidx.lifecycle.w1;
import bi2.e0;
import bi2.g0;
import c22.b1;
import c22.l3;
import c22.m3;
import c22.q3;
import c62.p;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQAppDetailsActivity;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQDownloadListActivity;
import com.garmin.android.apps.connectmobile.contacts.ContactActivity;
import com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.views.GCMPregnancyTwoLineButton;
import com.garmin.android.apps.connectmobile.segments.presentation.ExploreSegmentsFilterActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.activityoptions.GCMRunModeAlertsActivity;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.DbTableBrowser;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.SendGroupRideCodeNotification;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.j;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.k;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.m;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.n;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.MultiSportsDetailsActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.x;
import com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutCreateActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.MultiSportCreateEditActivity;
import com.garmin.proto.generated.WifiSetup;
import com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder;
import com.google.android.exoplayer2.ui.TrackSelectionView;
import e23.l;
import fy1.i;
import java.util.ArrayList;
import java.util.List;
import l20.r;
import org.json.JSONException;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import wn1.i0;
import xf1.o;
import y10.n0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3140c;

    public /* synthetic */ d(int i14, Object obj, Object obj2) {
        this.f3138a = i14;
        this.f3140c = obj;
        this.f3139b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x039f  */
    /* JADX WARN: Code duplicated, block: B:148:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:184:0x0432  */
    /* JADX WARN: Code duplicated, block: B:186:0x0436  */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        String str;
        WorkoutDetailsDTO workoutDetailsDTO;
        String string;
        WorkoutDetailsDTO workoutDetailsDTO2;
        WorkoutDetailsDTO workoutDetailsDTO3;
        String string2;
        ca1.d.b bVar;
        int i15 = this.f3138a;
        Object obj = this.f3139b;
        Object obj2 = this.f3140c;
        switch (i15) {
            case 0:
                f fVar = (f) obj2;
                l lVar = (l) obj;
                double dA = b1.a(fVar.f3146c.getValue() + "." + fVar.f3147d.getValue());
                q3 q3Var = fVar.f3145b ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                l3.a aVar = l3.f23124b;
                q3 q3Var2 = q3.METERS_PER_SECOND;
                aVar.getClass();
                lVar.invoke(Double.valueOf(l3.a.w(dA, q3Var, q3Var2)));
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                    return;
                }
                return;
            case 1:
                g gVar = (g) obj2;
                l lVar2 = (l) obj;
                double dA2 = b1.a(gVar.f3151d.getValue() + "." + gVar.f3152e.getValue());
                q3 q3Var3 = gVar.f3149b ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                l3.a aVar2 = l3.f23124b;
                q3 q3Var4 = q3.METERS_PER_SECOND;
                aVar2.getClass();
                lVar2.invoke(Double.valueOf(l3.a.w(dA2, q3Var3, q3Var4)));
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                    return;
                }
                return;
            case 2:
                int i16 = am.b1.f3865i;
                ((am.b1) obj2).a((View) obj);
                return;
            case 3:
                e0 e0Var = (e0) obj2;
                e0Var.f18132b.n(e0Var.f18133c, e0Var.f18134d, Integer.valueOf(((NumberPicker) obj).getValue()));
                return;
            case 4:
                g0 g0Var = (g0) obj2;
                try {
                    str = (String) g0Var.f18161f.keySet().toArray(new String[0])[((NumberPicker) obj).getValue()];
                    break;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    str = "";
                }
                g0Var.f18157b.n(g0Var.f18158c, g0Var.f18159d, g0Var.f18161f.get(str));
                return;
            case 5:
                MultiSportsDetailsActivity multiSportsDetailsActivity = (MultiSportsDetailsActivity) obj2;
                EditText editText = (EditText) obj;
                MultiSportsDetailsActivity.a aVar3 = MultiSportsDetailsActivity.f48440z;
                dialogInterface.getClass();
                multiSportsDetailsActivity.showProgressOverlay();
                WorkoutDetailsDTO workoutDetailsDTO4 = multiSportsDetailsActivity.ea().f48605r;
                WorkoutDetailsDTO workoutDetailsDTO5 = multiSportsDetailsActivity.ea().f48605r;
                if ((workoutDetailsDTO5 != null && workoutDetailsDTO5.H()) || ((workoutDetailsDTO = multiSportsDetailsActivity.ea().f48605r) != null && workoutDetailsDTO.F())) {
                    if (workoutDetailsDTO4 != null) {
                        workoutDetailsDTO4.F = null;
                    }
                    if (workoutDetailsDTO4 != null) {
                        workoutDetailsDTO4.f48062x = null;
                    }
                    if (workoutDetailsDTO4 != null) {
                        workoutDetailsDTO4.B = null;
                    }
                }
                String string3 = editText.getText().toString();
                int length = string3.length() - 1;
                int i17 = 0;
                boolean z14 = false;
                while (i17 <= length) {
                    boolean z15 = s.h(string3.charAt(!z14 ? i17 : length), 32) <= 0;
                    if (z14) {
                        if (!z15) {
                            string = string3.subSequence(i17, length + 1).toString();
                            if (workoutDetailsDTO4 != null) {
                                workoutDetailsDTO4.f48041b = string;
                            }
                            if (workoutDetailsDTO4 != null) {
                                p pVarEa = multiSportsDetailsActivity.ea();
                                string.getClass();
                                ge1.b.T(v1.a(pVarEa), null, null, new x(pVarEa, string, workoutDetailsDTO4, null), 3);
                            }
                            dialogInterface.dismiss();
                            return;
                        }
                        length--;
                    } else if (z15) {
                        i17++;
                    } else {
                        z14 = true;
                    }
                }
                string = string3.subSequence(i17, length + 1).toString();
                if (workoutDetailsDTO4 != null) {
                    workoutDetailsDTO4.f48041b = string;
                }
                if (workoutDetailsDTO4 != null) {
                    p pVarEa2 = multiSportsDetailsActivity.ea();
                    string.getClass();
                    ge1.b.T(v1.a(pVarEa2), null, null, new x(pVarEa2, string, workoutDetailsDTO4, null), 3);
                }
                dialogInterface.dismiss();
                return;
            case 6:
                WorkoutDetailsActivity workoutDetailsActivity = (WorkoutDetailsActivity) obj2;
                EditText editText2 = (EditText) obj;
                WorkoutDetailsActivity.a aVar4 = WorkoutDetailsActivity.f48482f;
                dialogInterface.getClass();
                WorkoutDetailsDTO workoutDetailsDTO6 = workoutDetailsActivity.ea().f48605r;
                if (workoutDetailsDTO6 != null) {
                    workoutDetailsDTO2 = new WorkoutDetailsDTO();
                    try {
                        workoutDetailsDTO2.k(workoutDetailsDTO6.e0());
                    } catch (JSONException e4) {
                        a2 a2Var = a2.WORKOUTS;
                        i2.f36769a.getClass();
                        i2.a.g(a2Var, "WorkoutDetailsDTO", e4);
                    }
                    break;
                } else {
                    workoutDetailsDTO2 = null;
                }
                WorkoutDetailsDTO workoutDetailsDTO7 = workoutDetailsActivity.ea().f48605r;
                if ((workoutDetailsDTO7 != null && workoutDetailsDTO7.H()) || ((workoutDetailsDTO3 = workoutDetailsActivity.ea().f48605r) != null && workoutDetailsDTO3.F())) {
                    if (workoutDetailsDTO2 != null) {
                        workoutDetailsDTO2.F = null;
                    }
                    if (workoutDetailsDTO2 != null) {
                        workoutDetailsDTO2.f48062x = null;
                    }
                    if (workoutDetailsDTO2 != null) {
                        workoutDetailsDTO2.B = null;
                    }
                }
                String string4 = editText2.getText().toString();
                int length2 = string4.length() - 1;
                int i18 = 0;
                boolean z16 = false;
                while (i18 <= length2) {
                    boolean z17 = s.h(string4.charAt(!z16 ? i18 : length2), 32) <= 0;
                    if (z16) {
                        if (!z17) {
                            string2 = string4.subSequence(i18, length2 + 1).toString();
                            if (workoutDetailsDTO2 != null) {
                                workoutDetailsDTO2.f48041b = string2;
                            }
                            if (workoutDetailsDTO2 != null) {
                                com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVarEa = workoutDetailsActivity.ea();
                                string2.getClass();
                                ge1.b.T(v1.a(fVarEa), null, null, new x(fVarEa, string2, workoutDetailsDTO2, null), 3);
                            }
                            dialogInterface.dismiss();
                            return;
                        }
                        length2--;
                    } else if (z17) {
                        i18++;
                    } else {
                        z16 = true;
                    }
                }
                string2 = string4.subSequence(i18, length2 + 1).toString();
                if (workoutDetailsDTO2 != null) {
                    workoutDetailsDTO2.f48041b = string2;
                }
                if (workoutDetailsDTO2 != null) {
                    com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVarEa2 = workoutDetailsActivity.ea();
                    string2.getClass();
                    ge1.b.T(v1.a(fVarEa2), null, null, new x(fVarEa2, string2, workoutDetailsDTO2, null), 3);
                }
                dialogInterface.dismiss();
                return;
            case 7:
                WorkoutDetailsActivity.a aVar5 = WorkoutDetailsActivity.f48482f;
                com.garmin.android.apps.connectmobile.workouts.presentation.details.d.r rVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.d.r) ((com.garmin.android.apps.connectmobile.workouts.presentation.details.d) obj);
                ((WorkoutDetailsActivity) obj2).ea().t(rVar.f48542c, rVar.f48540a, rVar.f48541b);
                return;
            case 8:
                ca1.d dVar = (ca1.d) obj2;
                da1.b bVar2 = (da1.b) obj;
                ca1.d.a aVar6 = ca1.d.f26580m;
                dialogInterface.dismiss();
                dVar.dismiss();
                if (bVar2 != null) {
                    ea1.c reviewStatus = bVar2.getReviewStatus();
                    int i19 = reviewStatus != null ? ca1.d.C0406d.f26593a[reviewStatus.ordinal()] : -1;
                    if ((i19 == 1 || i19 == 2) && (bVar = dVar.f26592l) != null) {
                        bVar.w1();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                int i24 = ExploreSegmentsFilterActivity.f41363q;
                dialogInterface.getClass();
                ((ExploreSegmentsFilterActivity) obj2).ia(((o[]) obj)[i14]);
                dialogInterface.dismiss();
                return;
            case 10:
                int i25 = ExploreSegmentsFilterActivity.f41363q;
                dialogInterface.getClass();
                ((ExploreSegmentsFilterActivity) obj2).ha(((xf1.e[]) obj)[i14]);
                dialogInterface.dismiss();
                return;
            case 11:
                ConnectIQAppDetailsActivity connectIQAppDetailsActivity = (ConnectIQAppDetailsActivity) obj2;
                connectIQAppDetailsActivity.startActivity(s10.b.h(connectIQAppDetailsActivity.f31707c, ((n10.a) obj).f122204a));
                return;
            case 12:
                ConnectIQDownloadListActivity connectIQDownloadListActivity = (ConnectIQDownloadListActivity) obj;
                ConnectIQDownloadListActivity.a aVar7 = ConnectIQDownloadListActivity.f31779o;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                if (((n0.a) ((n0) obj2)).f193956a) {
                    connectIQDownloadListActivity.finish();
                    return;
                }
                return;
            case 13:
                DbTableBrowser.handleClick$lambda$0((CharSequence[]) obj2, (Context) obj, dialogInterface, i14);
                return;
            case 14:
                SendGroupRideCodeNotification.handleClick$lambda$1((Context) obj2, (EditText) obj, dialogInterface, i14);
                return;
            case 15:
                ((TrackSelectionDialogBuilder) obj2).lambda$setUpDialogView$1((TrackSelectionView) obj, dialogInterface, i14);
                return;
            case 16:
                com.garmin.android.apps.connectmobile.settings.devices.wifi.b bVar3 = (com.garmin.android.apps.connectmobile.settings.devices.wifi.b) obj2;
                m.b bVar4 = (m.b) obj;
                com.garmin.android.apps.connectmobile.settings.devices.wifi.b.C0803b c0803b = com.garmin.android.apps.connectmobile.settings.devices.wifi.b.f43259w;
                dialogInterface.getClass();
                Dialog dialog = (Dialog) dialogInterface;
                String string5 = ((EditText) dialog.findViewById(R.id.ssid)).getText().toString();
                Spinner spinner = (Spinner) dialog.findViewById(R.id.security_type);
                k.c cVar = k.c.OPEN;
                Object selectedItem = spinner.getSelectedItem();
                if (selectedItem != null) {
                    cVar = ((com.garmin.android.apps.connectmobile.settings.devices.wifi.p) selectedItem).f43399b;
                }
                k.c cVar2 = cVar;
                String string6 = ((EditText) dialog.findViewById(R.id.password)).getText().toString();
                if (i14 != -1) {
                    bVar3.C6(true);
                    return;
                }
                GCMSettingManager.T(bVar3.f43264e, false);
                bVar3.A6(bVar4);
                if (!bVar3.f43275p) {
                    bVar3.z6(bVar4);
                    k.f43319i.getClass();
                    new k(string5, cVar2, string6, hd0.a.a(string6, k.b.b(cVar2)), 2);
                    return;
                }
                bVar3.f43274o = new com.garmin.android.apps.connectmobile.settings.devices.wifi.c(bVar3, bVar4, string5, false);
                i0 i0VarM = i0.M();
                long j8 = bVar3.f43264e;
                com.garmin.android.apps.connectmobile.settings.devices.wifi.c cVar3 = bVar3.f43274o;
                i0VarM.getClass();
                if (TextUtils.isEmpty(string5) || cVar2 == null) {
                    vb.h.s("Empty SSID and/or null security type");
                    return;
                } else {
                    com.garmin.android.library.backgroundtaskmanagement.c.d(new j(j8, string5, cVar2, string6, i0VarM), cVar3);
                    return;
                }
            case 17:
                n.a aVar8 = n.f43372h;
                ((n) obj2).v6().A4((WifiSetup.StoredAccessPoint) obj);
                dialogInterface.dismiss();
                return;
            case 18:
                n nVar = (n) obj2;
                WifiSetup.ScannedAccessPoint scannedAccessPoint = (WifiSetup.ScannedAccessPoint) obj;
                n.a aVar9 = n.f43372h;
                dialogInterface.getClass();
                String string7 = ((EditText) ((Dialog) dialogInterface).findViewById(R.id.password)).getText().toString();
                if (i14 == -1) {
                    hd0.b bVarV6 = nVar.v6();
                    String ssid = scannedAccessPoint.getSsid();
                    ssid.getClass();
                    WifiSetup.SecurityType securityType = scannedAccessPoint.getSecurityType();
                    securityType.getClass();
                    bVarV6.z4(ssid, securityType, string7);
                    return;
                }
                return;
            case 19:
                ((GSMRedirectActivity.r) obj2).e((t10.n) obj, null);
                return;
            case 20:
                Context context = (Context) obj;
                context.startActivity(((bv.g) obj2).e(context));
                dialogInterface.dismiss();
                return;
            case 21:
                ContactActivity.a aVar10 = ContactActivity.T;
                ((ContactActivity) obj2).ka((Integer) obj);
                return;
            case 22:
                ContactActivity contactActivity = (ContactActivity) obj2;
                f20.o oVar = (f20.o) obj;
                r rVar2 = contactActivity.f32293g;
                List<l20.a> listF = rVar2 != null ? rVar2.f() : null;
                if (listF == null) {
                    listF = j0.f134944a;
                }
                l20.a aVarC = com.garmin.android.apps.connectmobile.contacts.b.c(oVar.f68406b, oVar.f68418n, h0.d1(listF));
                com.garmin.android.apps.connectmobile.contacts.d dVarGa = contactActivity.ga();
                dVarGa.getClass();
                if ((aVarC != null ? aVarC.getContactId() : null) != null) {
                    ge1.b.T(v1.a(dVarGa), null, null, new f20.s(dVarGa, aVarC, null), 3);
                    return;
                }
                return;
            case 23:
                WorkoutCreateActivity workoutCreateActivity = (WorkoutCreateActivity) obj;
                WorkoutCreateActivity.a aVar11 = WorkoutCreateActivity.f48852j;
                workoutCreateActivity.ga().F4(workoutCreateActivity.ea(((EditText) obj2).getText().toString()));
                return;
            case 24:
                NumberPicker numberPicker = (NumberPicker) obj2;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b bVar5 = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b) obj;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar12 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                numberPicker.clearFocus();
                db1.a aVar13 = bVar5.f40467j;
                if (aVar13 == null) {
                    s.m("mBabyMovementDTO");
                    throw null;
                }
                aVar13.h(Integer.valueOf(numberPicker.getValue()));
                GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton = bVar5.f40459b;
                if (gCMPregnancyTwoLineButton == null) {
                    s.m("mMovementTotal");
                    throw null;
                }
                gCMPregnancyTwoLineButton.setButtonValueLabel(String.valueOf(numberPicker.getValue()));
                bVar5.requireActivity().invalidateOptionsMenu();
                return;
            case 25:
                e23.a aVar14 = (e23.a) obj2;
                androidx.fragment.app.m mVar = (androidx.fragment.app.m) obj;
                if (aVar14 != null) {
                    fy1.c.f73884a.getClass();
                    fy1.c.b("GarminCoachCanceledSetupViaExitButton");
                    dialogInterface.dismiss();
                    aVar14.invoke();
                    return;
                }
                i.a aVar15 = i.f73924a;
                fy1.c.f73884a.getClass();
                fy1.c.b("GarminCoachCanceledSetupViaExitButton");
                dialogInterface.dismiss();
                mVar.setResult(2);
                mVar.finish();
                return;
            case 26:
                MultiSportCreateEditActivity.a aVar16 = MultiSportCreateEditActivity.f49083f;
                String string8 = ((EditText) obj2).getText().toString();
                w1 w1Var = ((MultiSportCreateEditActivity) obj).f49084a;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c cVar4 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c) w1Var.getValue();
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c cVar5 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c) w1Var.getValue();
                WorkoutDetailsDTO workoutDetailsDTO8 = cVar5.f49138r;
                m52.k kVar = m52.k.A;
                workoutDetailsDTO8.getClass();
                kVar.getClass();
                workoutDetailsDTO8.f48044e = kVar;
                if (string8 != null) {
                    cVar5.f49138r.f48041b = string8;
                }
                cVar4.F4(cVar5.f49138r);
                return;
            case 27:
                gg1.j0 j0Var = (gg1.j0) obj2;
                String strValueOf = String.valueOf(((NumberPicker) obj).getValue());
                if (strValueOf.isEmpty()) {
                    return;
                }
                try {
                    ((pb1.i) j0Var.f77252a).a(Float.valueOf(strValueOf).floatValue());
                    dialogInterface.dismiss();
                    return;
                } catch (NumberFormatException unused2) {
                    return;
                }
            case 28:
                com.garmin.android.apps.connectmobile.settings.e eVar = (com.garmin.android.apps.connectmobile.settings.e) obj;
                com.garmin.android.apps.connectmobile.settings.e.a aVar17 = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                dialogInterface.getClass();
                String str2 = ((String[]) obj2)[i14];
                str2.getClass();
                eVar.v6(str2);
                f12.l.f68084a.getClass();
                f12.l.a.a().R(str2);
                eVar.f43405d = true;
                dialogInterface.dismiss();
                return;
            default:
                m3[] m3VarArr = GCMRunModeAlertsActivity.f41654i;
                ((GCMRunModeAlertsActivity) obj2).ea((hg1.j) ((ArrayList) obj).get(i14), true);
                dialogInterface.dismiss();
                return;
        }
    }
}
