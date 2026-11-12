package v;

import android.app.AlertDialog;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.SwitchCompat;
import androidx.camera.core.impl.x2;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.fragment.app.Fragment;
import c22.y3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.golf.truswing.ClubSelectionDrawerFragment;
import com.garmin.android.apps.connectmobile.golf.truswing.SwingDetailsActivity;
import com.garmin.android.apps.connectmobile.hydration.presentation.detail.HydrationView;
import com.garmin.android.apps.connectmobile.settings.devices.common.BikeAlarmSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.FindMyWatchActivity;
import com.garmin.android.consent.ui.view.DeviceUploadConsentView;
import com.garmin.android.library.mobileauth.ui.AuthenticationActivity;
import com.garmin.android.library.mobileauth.ui.DeleteAccountActivity;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaTopUpActivity;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaUpdateUserInfoActivity;
import com.google.android.material.snackbar.Snackbar;
import com.yalantis.ucrop.view.GestureCropImageView;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f173679b;

    public /* synthetic */ b0(Object obj, int i14) {
        this.f173678a = i14;
        this.f173679b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, vq2.d] */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r10v3, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r10v6, types: [T, java.lang.Boolean] */
    @Override // java.lang.Runnable
    public final void run() {
        View viewFindFocus;
        switch (this.f173678a) {
            case 0:
                ((a0.d) this.f173679b).f173651i.c();
                return;
            case 1:
                ((b0.l0.j) this.f173679b).clear();
                return;
            case 2:
                c1 c1Var = (c1) this.f173679b;
                synchronized (c1Var.f173719a) {
                    if (c1Var.f173720b.isEmpty()) {
                        return;
                    }
                    try {
                        c1Var.p(c1Var.f173720b);
                        c1Var.f173720b.clear();
                        return;
                    } catch (Throwable th3) {
                        c1Var.f173720b.clear();
                        throw th3;
                    }
                }
            case 3:
                LinkedHashSet<c2> linkedHashSet = (LinkedHashSet) this.f173679b;
                int i14 = e1.a.f173782b;
                for (c2 c2Var : linkedHashSet) {
                    c2Var.g().m(c2Var);
                }
                return;
            case 4:
                ((y1) this.f173679b).f174119a.c();
                return;
            case 5:
                e2 e2Var = (e2) this.f173679b;
                e2Var.q(e2Var);
                return;
            case 6:
                g2.z((g2) this.f173679b);
                return;
            case 7:
                GestureCropImageView gestureCropImageView = (GestureCropImageView) this.f173679b;
                gestureCropImageView.zoomInImage(gestureCropImageView.getMinScale());
                gestureCropImageView.setImageToWrapCropBounds(false);
                return;
            case 8:
                BikeAlarmSettingActivity bikeAlarmSettingActivity = (BikeAlarmSettingActivity) this.f173679b;
                int i15 = BikeAlarmSettingActivity.f42584f;
                com.garmin.android.apps.connectmobile.settings.devices.common.b bVarDa = bikeAlarmSettingActivity.da();
                if (bVarDa != null) {
                    bVarDa.u6("BIKE_ALARM_DISABLE_TAG", false);
                    return;
                }
                return;
            case 9:
                ((FindMyWatchActivity) this.f173679b).P9();
                return;
            case 10:
                FelicaTopUpActivity felicaTopUpActivity = (FelicaTopUpActivity) this.f173679b;
                FelicaTopUpActivity.a aVar = FelicaTopUpActivity.f50969p;
                felicaTopUpActivity.getSupportFragmentManager().c0(-1, 1, null);
                return;
            case 11:
                FelicaUpdateUserInfoActivity felicaUpdateUserInfoActivity = (FelicaUpdateUserInfoActivity) this.f173679b;
                FelicaUpdateUserInfoActivity.a aVar2 = FelicaUpdateUserInfoActivity.f50988j;
                Fragment fragmentG = felicaUpdateUserInfoActivity.getSupportFragmentManager().G("PAY#FN#FelicaEditUserInfoFragment");
                xn2.h hVar = fragmentG instanceof xn2.h ? (xn2.h) fragmentG : null;
                if (hVar != null) {
                    hVar.k0();
                    return;
                }
                return;
            case 12:
                ((wl2.b) this.f173679b).e();
                return;
            case 13:
                HydrationView hydrationView = (HydrationView) this.f173679b;
                int i16 = HydrationView.b.f36687b;
                hydrationView.a((Double) hydrationView.C.remove());
                return;
            case 14:
                ?? r14 = this.f173679b;
                int i17 = vq2.e.f179461z0;
                hn2.c.ba(r14.getF52032a(), Boolean.FALSE, null, null, 14);
                return;
            case 15:
                vn2.k1 k1Var = (vn2.k1) this.f173679b;
                int i18 = vq2.f.A0;
                Snackbar snackbarMake = Snackbar.make(k1Var.W0(), R.string.wallet_suica_message_user_information_has_been_changed, 0);
                snackbarMake.getClass();
                v22.c.a(snackbarMake);
                snackbarMake.show();
                return;
            case 16:
                DeviceUploadConsentView deviceUploadConsentView = (DeviceUploadConsentView) this.f173679b;
                TextView textView = deviceUploadConsentView.f49836b;
                SwitchCompat switchCompat = deviceUploadConsentView.f49838d;
                if (switchCompat != null) {
                    textView.setLabelFor(switchCompat.getId());
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("deviceUploadSwitch");
                    throw null;
                }
            case 17:
                ClubSelectionDrawerFragment clubSelectionDrawerFragment = (ClubSelectionDrawerFragment) this.f173679b;
                if (clubSelectionDrawerFragment.getActivity() != null) {
                    clubSelectionDrawerFragment.f35755c.o(8388613);
                    return;
                }
                return;
            case 18:
                SwingDetailsActivity swingDetailsActivity = (SwingDetailsActivity) this.f173679b;
                int i19 = SwingDetailsActivity.f35774o;
                swingDetailsActivity.checkInternetConnectivity();
                return;
            case 19:
                y3.b(((wn1.a) this.f173679b).f186176b);
                return;
            case 20:
                x0.d dVar = (x0.d) this.f173679b;
                dVar.e();
                x0.e eVar = dVar.f188216d;
                Set<x0.e.a> setKeySet = dVar.f188220h;
                synchronized (eVar.f188223a) {
                    if (setKeySet == null) {
                        try {
                            setKeySet = eVar.f188224b.keySet();
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    for (x0.e.a aVar3 : setKeySet) {
                        if (eVar.f188224b.containsKey(aVar3)) {
                            eVar.k((x0.b) eVar.f188224b.get(aVar3));
                        }
                    }
                    break;
                }
                return;
            case 21:
                x5.n0 n0Var = (x5.n0) this.f173679b;
                x5.s sVar = n0Var.f188889b;
                n0Var.f188901n = null;
                q3.c<x5.n0.a> cVar = n0Var.f188900m;
                View view2 = n0Var.f188888a;
                if (!view2.isFocused() && (viewFindFocus = view2.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    cVar.g();
                    return;
                }
                p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
                p005kotlin.jvm.internal.r0 r0Var2 = new p005kotlin.jvm.internal.r0();
                x5.n0.a[] aVarArr = cVar.f142356a;
                int i24 = cVar.f142358c;
                for (int i25 = 0; i25 < i24; i25++) {
                    x5.n0.a aVar4 = aVarArr[i25];
                    int i26 = x5.n0.b.f188907a[aVar4.ordinal()];
                    if (i26 == 1) {
                        ?? r15 = Boolean.TRUE;
                        r0Var.f105810a = r15;
                        r0Var2.f105810a = r15;
                    } else if (i26 == 2) {
                        ?? r16 = Boolean.FALSE;
                        r0Var.f105810a = r16;
                        r0Var2.f105810a = r16;
                    } else if (i26 != 3 && i26 != 4) {
                        lc.u0.r();
                        return;
                    } else if (!p005kotlin.jvm.internal.s.g(r0Var.f105810a, Boolean.FALSE)) {
                        r0Var2.f105810a = Boolean.valueOf(aVar4 == x5.n0.a.f188904c);
                    }
                }
                cVar.g();
                if (p005kotlin.jvm.internal.s.g(r0Var.f105810a, Boolean.TRUE)) {
                    sVar.b();
                }
                Boolean bool = (Boolean) r0Var2.f105810a;
                if (bool != null) {
                    if (bool.booleanValue()) {
                        sVar.d();
                    } else {
                        sVar.c();
                    }
                }
                if (p005kotlin.jvm.internal.s.g(r0Var.f105810a, Boolean.FALSE)) {
                    sVar.b();
                    return;
                }
                return;
            case 22:
                AuthenticationActivity authenticationActivity = (AuthenticationActivity) this.f173679b;
                AuthenticationActivity.a aVar5 = AuthenticationActivity.f50343v;
                re2.b.f152215a.getClass();
                if (re2.b.v()) {
                    authenticationActivity.setResult(0);
                    authenticationActivity.finish();
                    return;
                } else {
                    authenticationActivity.f50417f = null;
                    authenticationActivity.da();
                    return;
                }
            case 23:
                DeleteAccountActivity deleteAccountActivity = (DeleteAccountActivity) this.f173679b;
                int i27 = DeleteAccountActivity.f50391q;
                deleteAccountActivity.X9().warn("onResume: inoperable webview");
                AlertDialog alertDialog = deleteAccountActivity.f50395p;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                deleteAccountActivity.f50395p = null;
                re2.l0.f152316a.getClass();
                String string = deleteAccountActivity.getString(R.string.mobile_auth_title_unable_to_continue);
                string.getClass();
                String string2 = deleteAccountActivity.getString(R.string.msg_inoperable_webview);
                string2.getClass();
                af2.b bVar = new af2.b(deleteAccountActivity, 5);
                String string3 = deleteAccountActivity.getString(R.string.lbl_cancel);
                string3.getClass();
                deleteAccountActivity.f50395p = xe2.n0.a(deleteAccountActivity, string, string2, bVar, null, string3, null, 64);
                return;
            case 24:
                com.garmin.android.library.mobileauth.ui.e eVar2 = (com.garmin.android.library.mobileauth.ui.e) this.f173679b;
                int i28 = com.garmin.android.library.mobileauth.ui.f.f50452b;
                com.garmin.android.library.mobileauth.ui.e.f50426m.getClass();
                if (com.garmin.android.library.mobileauth.ui.e.f50427n) {
                    return;
                }
                int i29 = com.garmin.android.library.mobileauth.ui.e.f50428o;
                com.garmin.android.library.mobileauth.ui.e.f50428o = i29 + 1;
                if (i29 >= 4) {
                    com.garmin.android.library.mobileauth.ui.e.f50427n = true;
                    ((Logger) eVar2.f50440l.getValue()).warn("Signin fallback mode enabled. To undo, uninstall this app. For GARMIN testing only!");
                    Toast.makeText(eVar2.getContext(), "Signin fallback mode enabled. To undo, uninstall this app. For GARMIN testing only!", 1).show();
                    return;
                }
                return;
            case 25:
                ya1.n nVar = (ya1.n) this.f173679b;
                sa1.j jVar = nVar.f195580e;
                Fragment fragment = nVar.f195579d;
                if (fragment == null) {
                    p005kotlin.jvm.internal.s.m("powerGuideMapFragment");
                    throw null;
                }
                com.garmin.android.apps.connectmobile.courses.model.e eVar3 = nVar.f195581f;
                if (eVar3 == null) {
                    p005kotlin.jvm.internal.s.m("courseDetailDTO");
                    throw null;
                }
                ArrayList arrayList = nVar.f195582g;
                if (arrayList != null) {
                    jVar.f(fragment, eVar3, arrayList);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("splitsColors");
                    throw null;
                }
            case 26:
                ((yc.x0) this.f173679b).n(true);
                return;
            case 27:
                ((rr2.a) this.f173679b).invoke();
                return;
            case 28:
                g1.i iVar = (g1.i) this.f173679b;
                Set<z0.a0.j> set = z0.a0.f200502h0;
                if (e1.a.f61851a.b(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
                    z0.a0.o(iVar);
                    return;
                }
                return;
            default:
                z0.a0.i iVar2 = ((z0.b0) this.f173679b).f200591b;
                if (iVar2.f200576d) {
                    return;
                }
                b0.g1 g1Var = iVar2.f200573a;
                x2 x2Var = iVar2.f200574b;
                z0.a0 a0Var = z0.a0.this;
                Set<z0.a0.j> set2 = z0.a0.f200502h0;
                Objects.toString(a0Var.D);
                z0.m0 m0Var = a0Var.f200512a0;
                m0Var.a();
                l0.j.f(m0Var.f200685j).addListener(new uj2.b(iVar2, 11, g1Var, x2Var), a0Var.f200519e);
                return;
        }
    }
}
