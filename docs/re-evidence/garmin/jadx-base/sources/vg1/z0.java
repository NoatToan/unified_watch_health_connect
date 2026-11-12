package vg1;

import am.a2;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.lifecycle.v1;
import androidx.media3.exoplayer.ExoPlayer;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.consent.DataStorageConsentActivity;
import com.garmin.android.apps.connectmobile.golf.truswing.ClubSelectionDrawerFragment;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.view.ExpandableTextView;
import com.garmin.android.apps.connectmobile.performance.stats.TrainingStatusDeviceActivity;
import com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusSummaryActivity;
import com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.TransferSensorsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.swim.css.CriticalSwimSpeedEditActivity;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.emergencycalling.steps.EmergencyCallingContactFragment;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.emergencycalling.steps.EmergencyCallingServicesFragment;
import com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTTrainingGuidancePlayerActivity;
import com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag;
import com.garmin.androiddynamicsettings.app.features.wifi.presenter.EnterPasswordActivity;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaCardDetailActivity;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaTopUpActivity;
import com.google.android.material.textfield.TextInputLayout;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class z0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f178244b;

    public /* synthetic */ z0(Object obj, int i14) {
        this.f178243a = i14;
        this.f178244b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        androidx.media3.common.y playbackParameters;
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        com.garmin.android.apps.connectmobile.courses.model.e eVar2;
        Date date;
        int i14 = this.f178243a;
        int i15 = 8;
        int i16 = 12;
        int i17 = 0;
        Object obj = this.f178244b;
        switch (i14) {
            case 0:
                TransferSensorsActivity transferSensorsActivity = (TransferSensorsActivity) obj;
                TransferSensorsActivity.a aVar = TransferSensorsActivity.f42801h;
                ht.a aVar2 = ht.a.f85464a;
                Bundle bundle = new Bundle(2);
                bundle.putString("Screen", "Settings");
                bundle.putString("Action", "Confirmed");
                Unit unit = Unit.INSTANCE;
                aVar2.getClass();
                ht.a.a(bundle, "TransferSensors");
                d1 d1Var = transferSensorsActivity.f42808g;
                if (d1Var != null) {
                    xy2.b.K(d1Var, new c1(d1Var, transferSensorsActivity.f42806e, null)).f(transferSensorsActivity, new TransferSensorsActivity.c(new a1(transferSensorsActivity, i17)));
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("viewModel");
                    throw null;
                }
            case 1:
                FelicaCardDetailActivity felicaCardDetailActivity = (FelicaCardDetailActivity) obj;
                FelicaCardDetailActivity.a aVar3 = FelicaCardDetailActivity.f50960l;
                felicaCardDetailActivity.b().A(felicaCardDetailActivity);
                return;
            case 2:
                FelicaTopUpActivity felicaTopUpActivity = (FelicaTopUpActivity) obj;
                FelicaTopUpActivity.a aVar4 = FelicaTopUpActivity.f50969p;
                vn2.d1 d1Var2 = felicaTopUpActivity.f50972h;
                if (d1Var2 == null) {
                    p005kotlin.jvm.internal.s.m("presenter");
                    throw null;
                }
                TextInputLayout textInputLayout = felicaTopUpActivity.f50976l;
                if (textInputLayout == null) {
                    p005kotlin.jvm.internal.s.m("topUpAmountView");
                    throw null;
                }
                EditText editText = textInputLayout.getEditText();
                editText.getClass();
                d1Var2.m(editText.getText().toString());
                return;
            case 3:
                FBTTrainingGuidancePlayerActivity fBTTrainingGuidancePlayerActivity = (FBTTrainingGuidancePlayerActivity) obj;
                FBTTrainingGuidancePlayerActivity.a aVar5 = FBTTrainingGuidancePlayerActivity.f45483c;
                String string = fBTTrainingGuidancePlayerActivity.getString(R.string.lbl_normal);
                string.getClass();
                String[] strArr = {"0.25x", "0.5x", "0.75x", string, "1.25x", "1.5x", "2x"};
                float[] fArr = {0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
                ExoPlayer exoPlayer = fBTTrainingGuidancePlayerActivity.f45484a;
                float f14 = (exoPlayer == null || (playbackParameters = exoPlayer.getPlaybackParameters()) == null) ? 1.0f : playbackParameters.f8584a;
                while (true) {
                    if (i17 >= 7) {
                        i17 = -1;
                    } else if (fArr[i17] != f14) {
                        i17++;
                    }
                }
                Integer numValueOf = Integer.valueOf(i17);
                if (i17 < 0) {
                    numValueOf = null;
                }
                new androidx.appcompat.app.e.a(fBTTrainingGuidancePlayerActivity).setTitle(fBTTrainingGuidancePlayerActivity.getString(R.string.lbl_speed)).setSingleChoiceItems(strArr, numValueOf != null ? numValueOf.intValue() : 1, new pk1.t(28, fBTTrainingGuidancePlayerActivity, fArr)).setNegativeButton(fBTTrainingGuidancePlayerActivity.getString(R.string.lbl_cancel), (DialogInterface.OnClickListener) null).show();
                return;
            case 4:
                vv.g.u((vv.g) obj);
                return;
            case 5:
                ExpandableTextView expandableTextView = (ExpandableTextView) obj;
                if (expandableTextView.f39204f) {
                    return;
                }
                expandableTextView.f39204f = true;
                expandableTextView.setText(expandableTextView.f39202d);
                ObjectAnimator.ofInt(expandableTextView, "maxLines", expandableTextView.getLineCount()).setDuration(((long) 70) * ((long) (expandableTextView.getLineCount() - expandableTextView.getMaxLines()))).start();
                return;
            case 6:
                vy1.a.C3368a c3368a = vy1.a.f180785g;
                ((vy1.a) obj).u6().w6();
                return;
            case 7:
                w52.d dVar = (w52.d) obj;
                o62.b0 b0Var = dVar.f182493f;
                if (b0Var != null) {
                    b0Var.d(new vc0.v(dVar, 24));
                    return;
                }
                return;
            case 8:
                com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) obj;
                List<com.garmin.android.apps.connectmobile.performance.model.a> arrayList = bVar.f40117b;
                com.garmin.android.apps.connectmobile.performance.model.a aVar6 = bVar.f40118c;
                String str = aVar6 != null ? aVar6.f39917a : null;
                int i18 = TrainingStatusDeviceActivity.f40027a;
                Intent intent = new Intent(bVar.getContext(), (Class<?>) TrainingStatusDeviceActivity.class);
                Bundle bundle2 = new Bundle();
                if (!arrayList.isEmpty() && !(arrayList instanceof ArrayList)) {
                    arrayList = new ArrayList(arrayList);
                }
                a2.a("extra_device_list", bundle2, arrayList);
                bundle2.putString("extra_device_id", str);
                intent.putExtras(bundle2);
                bVar.startActivityForResult(intent, 111);
                return;
            case 9:
                RelativeLayout relativeLayout = ((TrainingStatusSummaryActivity) obj).f40075v;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(8);
                    return;
                }
                return;
            case 10:
                j22.b bVar2 = j22.b.f96736a;
                androidx.fragment.app.m mVarRequireActivity = ((w81.b) obj).requireActivity();
                mVarRequireActivity.getClass();
                bVar2.getClass();
                j22.b.r(mVarRequireActivity);
                return;
            case 11:
                wa1.a aVar7 = (wa1.a) obj;
                boolean z14 = am.j.z(f12.l.f68084a);
                Context context = aVar7.f183785c;
                context.getClass();
                new ya1.b(context, aVar7.f183788f, z14, new vu1.b(aVar7, i16)).show();
                return;
            case 12:
                wa1.c cVar = (wa1.c) obj;
                Context context2 = cVar.f183796b;
                context2.getClass();
                new j42.b(context2, 0.0d, false, false, 0, 0, 0, 0, (j42.b.InterfaceC1852b) new vn2.t0(cVar, 14), 254, (p005kotlin.jvm.internal.j) null);
                return;
            case 13:
                ClubSelectionDrawerFragment.c cVar2 = ((ClubSelectionDrawerFragment) obj).f35753a;
                if (cVar2 != null) {
                    cVar2.i4();
                    return;
                }
                return;
            case 14:
                vu1.w wVar = ((wu1.k) obj).f187323b;
                if (wVar != null) {
                    wVar.U0();
                    return;
                }
                return;
            case 15:
                EditPowerGuideStrategyActivity editPowerGuideStrategyActivity = (EditPowerGuideStrategyActivity) obj;
                ab1.f fVar = editPowerGuideStrategyActivity.f40390f;
                if (fVar == null || (eVar = fVar.f2564b) == null) {
                    return;
                }
                boolean zG = p005kotlin.jvm.internal.s.g(String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()), eVar.userProfilePk);
                boolean zF0 = eVar.f0();
                if (p005kotlin.jvm.internal.s.g(eVar.getHasShareableEvent(), Boolean.TRUE) || (zG && !zF0)) {
                    editPowerGuideStrategyActivity.ga();
                    return;
                }
                ab1.f fVar2 = editPowerGuideStrategyActivity.f40390f;
                if (fVar2 == null || (eVar2 = fVar2.f2564b) == null) {
                    return;
                }
                xa1.k kVar = editPowerGuideStrategyActivity.f40389e;
                if (kVar == null) {
                    p005kotlin.jvm.internal.s.m("viewModel");
                    throw null;
                }
                androidx.lifecycle.y0 y0Var = new androidx.lifecycle.y0();
                String str2 = eVar2.courseId;
                String string2 = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c().getString(R.string.workout_duplicate_default_format, eVar2.courseName);
                string2.getClass();
                ge1.b.T(v1.a(kVar), null, null, new xa1.m(y0Var, kVar, str2, string2, null), 3);
                y0Var.f(editPowerGuideStrategyActivity, new EditPowerGuideStrategyActivity.c(new xa1.b(editPowerGuideStrategyActivity, i15)));
                return;
            case 16:
                xa2.d dVar2 = (xa2.d) obj;
                sa2.n nVar = dVar2.f189844a;
                if (nVar == null) {
                    p005kotlin.jvm.internal.s.m("reportsSelectedEndDatesPresenter");
                    throw null;
                }
                qa2.e eVar3 = nVar.f158383a;
                Date date2 = eVar3.f143901a;
                if (date2 == null || (date = eVar3.f143902b) == null || date2.getTime() > date.getTime()) {
                    Toast.makeText(dVar2.requireContext(), dVar2.getString(R.string.dates_invalid), 0).show();
                    return;
                }
                ua2.a aVar8 = dVar2.f189847d;
                if (aVar8 != null) {
                    aVar8.h3();
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("reportsCoordinatorDelegate");
                    throw null;
                }
            case 17:
                ua2.a aVar9 = ((xa2.e) obj).f189855e;
                if (aVar9 != null) {
                    aVar9.l6();
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("reportsCoordinatorDelegate");
                    throw null;
                }
            case 18:
                ((xb0.a.C3532a) obj).f189866c.invoke();
                return;
            case 19:
                xe2.z zVar = (xe2.z) obj;
                view2.setVisibility(4);
                com.garmin.android.library.mobileauth.ui.b fragListener$mobile_auth_release = zVar.getFragListener$mobile_auth_release();
                Bundle arguments = zVar.getArguments();
                fragListener$mobile_auth_release.o1(arguments != null ? arguments.getBoolean(af2.a.ARG_PARENTAL_CONSENT_REQUIRED, false) : false);
                return;
            case 20:
                ((MobileAuthBgBlurCapableFrag) obj).onToolbarBackPressed$mobile_auth_release();
                return;
            case 21:
                CriticalSwimSpeedEditActivity criticalSwimSpeedEditActivity = (CriticalSwimSpeedEditActivity) obj;
                CriticalSwimSpeedEditActivity.a aVar10 = CriticalSwimSpeedEditActivity.f43146g;
                if (z10.d1.f()) {
                    z10.d1.o(criticalSwimSpeedEditActivity, new xk1.v(12));
                    return;
                } else if (z10.d1.h(q92.x.DI_CONNECT_UPLOAD, true)) {
                    criticalSwimSpeedEditActivity.fa();
                    return;
                } else {
                    DataStorageConsentActivity.a.d(DataStorageConsentActivity.f32194t, criticalSwimSpeedEditActivity, 101);
                    return;
                }
            case 22:
                EnterPasswordActivity enterPasswordActivity = (EnterPasswordActivity) obj;
                int i19 = EnterPasswordActivity.f50664o;
                enterPasswordActivity.f50665l = !enterPasswordActivity.f50665l;
                enterPasswordActivity.T9();
                return;
            case 23:
                ((EmergencyCallingContactFragment) obj).u6();
                return;
            case 24:
                int i24 = EmergencyCallingServicesFragment.f43825f;
                ((EmergencyCallingServicesFragment) obj).u6();
                return;
            case 25:
                com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.b.a aVar11 = com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.b.J0;
                HelpActivity.a aVar12 = HelpActivity.f36653a;
                androidx.fragment.app.m activity = ((com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.b) obj).getActivity();
                ro0.l lVar = ro0.l.HEART_RATE_ZONES;
                aVar12.getClass();
                HelpActivity.a.d(activity, lVar, "DEFAULT_ACTION", null);
                return;
            case 26:
                com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.c cVar3 = (com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.c) obj;
                com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.c.a aVar13 = com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.c.I;
                if (cVar3.getActivity() != null) {
                    zb0.d0 d0Var = (zb0.d0) KoinJavaComponent.get$default(zb0.d0.class, null, null, 6, null);
                    androidx.fragment.app.m mVarRequireActivity2 = cVar3.requireActivity();
                    mVarRequireActivity2.getClass();
                    d0Var.p(mVarRequireActivity2);
                    return;
                }
                return;
            case 27:
                com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.d dVar3 = (com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.d) obj;
                com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.d.a aVar14 = com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.d.N0;
                if (dVar3.getActivity() != null) {
                    zb0.d0 d0Var2 = (zb0.d0) KoinJavaComponent.get$default(zb0.d0.class, null, null, 6, null);
                    androidx.fragment.app.m mVarRequireActivity3 = dVar3.requireActivity();
                    mVarRequireActivity3.getClass();
                    d0Var2.p(mVarRequireActivity3);
                    return;
                }
                return;
            case 28:
                xn2.s sVar = (xn2.s) obj;
                xn2.s.a aVar15 = xn2.s.f191732b;
                sVar.b().p(sVar.u6());
                return;
            default:
                xn2.u uVar = (xn2.u) obj;
                xn2.u.a aVar16 = xn2.u.f191736k;
                xn2.j0 j0Var = (xn2.j0) uVar.b();
                TextInputLayout textInputLayout2 = uVar.f191695b;
                if (textInputLayout2 == null) {
                    p005kotlin.jvm.internal.s.m("lastName");
                    throw null;
                }
                EditText editText2 = textInputLayout2.getEditText();
                Editable text = editText2 != null ? editText2.getText() : null;
                TextInputLayout textInputLayout3 = uVar.f191696c;
                if (textInputLayout3 == null) {
                    p005kotlin.jvm.internal.s.m("firstName");
                    throw null;
                }
                EditText editText3 = textInputLayout3.getEditText();
                Editable text2 = editText3 != null ? editText3.getText() : null;
                DateTime dateTime = uVar.f191701h;
                pn2.u uVar2 = uVar.f191700g;
                TextInputLayout textInputLayout4 = uVar.f191699f;
                if (textInputLayout4 == null) {
                    p005kotlin.jvm.internal.s.m("phoneNumber");
                    throw null;
                }
                EditText editText4 = textInputLayout4.getEditText();
                j0Var.J(text, text2, dateTime, uVar2, editText4 != null ? editText4.getText() : null);
                return;
        }
    }
}
