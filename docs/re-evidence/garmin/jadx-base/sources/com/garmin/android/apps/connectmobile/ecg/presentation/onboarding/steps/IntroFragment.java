package com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps;

import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import androidx.navigation.fragment.NavHostFragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import ge1.b;
import lc.h0;
import lc.y;
import lq.g;
import nf0.o;
import nf0.r;
import nf0.t;
import nf0.z;
import o53.s0;
import oe.j;
import of0.m;
import of0.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import x53.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/onboarding/steps/IntroFragment;", "Lnf0/z;", "<init>", "()V", "a", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IntroFragment extends z {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f34814j = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f34815i;

    static {
        new a(null);
    }

    public static final void G6(IntroFragment introFragment, Location location) {
        introFragment.getClass();
        a2 a2Var = a2.ONBOARDING;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "IntroFragment", "[checkEnabledAtCurrentLocation] check ECG is enabled at current location");
        o oVarZ6 = introFragment.z6();
        location.getClass();
        y0 y0Var = new y0();
        y0Var.j(g3.a.c(g3.f35298f));
        w9.a aVarA = v1.a(oVarZ6);
        c cVar = s0.f129406a;
        b.T(aVarA, x53.b.f189152a, null, new t(oVarZ6, location, y0Var, null), 2);
        y0Var.f(introFragment.getViewLifecycleOwner(), new n(introFragment, location));
    }

    @Override // nf0.z
    public final void C6(LayoutInflater layoutInflater, LinearLayout linearLayout) {
        linearLayout.addView(layoutInflater.inflate(R.layout.container_intro, (ViewGroup) linearLayout, false));
        w6().setText(R.string.smart_scale_label_get_started);
    }

    @Override // nf0.z
    public final void E6() {
        H6();
    }

    public final void H6() {
        a2 a2Var = a2.ONBOARDING;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "IntroFragment", "[checkLocationPermission] checking location permission");
        F6();
        if (!z6().L4()) {
            i2.a.b(a2Var, "IntroFragment", "[checkLocationPermission] no location permissions granted");
            hideProgressOverlay();
            NavHostFragment.f10124e.getClass();
            y yVarA = NavHostFragment.a.a(this);
            h0 h0VarJ = yVarA.f111904b.j();
            if (h0VarJ == null || h0VarJ.f111773b.f144346e != R.id.introFragment) {
                return;
            }
            yVarA.g(R.id.action_request_location_rationale, null);
            return;
        }
        if (!z6().f125822d.a("EcgOnboardingViewModel")) {
            i2.a.b(a2Var, "IntroFragment", "[checkLocationPermission] location not enabled");
            hideProgressOverlay();
            NavHostFragment.f10124e.getClass();
            y yVarA2 = NavHostFragment.a.a(this);
            h0 h0VarJ2 = yVarA2.f111904b.j();
            if (h0VarJ2 == null || h0VarJ2.f111773b.f144346e != R.id.introFragment) {
                return;
            }
            yVarA2.g(R.id.action_request_location_rationale, null);
            return;
        }
        i2.a.b(a2Var, "IntroFragment", "[checkLocationPermission] location enabled + location permissions granted");
        i2.a.b(a2Var, "IntroFragment", "[requestLocation] requesting location");
        hideProgressOverlay();
        w6().setVisibility(8);
        FrameLayout frameLayout = this.f125875f;
        if (frameLayout == null) {
            s.m("setupOverlayContainer");
            throw null;
        }
        frameLayout.setVisibility(0);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(requireContext());
        FrameLayout frameLayout2 = this.f125875f;
        if (frameLayout2 == null) {
            s.m("setupOverlayContainer");
            throw null;
        }
        layoutInflaterFrom.inflate(R.layout.ecg_searching_gps_location_overlay, frameLayout2);
        o oVarZ6 = z6();
        y0 y0Var = new y0();
        w9.a aVarA = v1.a(oVarZ6);
        c cVar = s0.f129406a;
        b.T(aVarA, x53.b.f189152a, null, new r(y0Var, oVarZ6, null), 2);
        m mVar = new m(this, y0Var);
        y0Var.f(getViewLifecycleOwner(), mVar);
        j jVar = new j(2, y0Var, mVar);
        FrameLayout frameLayout3 = this.f125875f;
        if (frameLayout3 != null) {
            ((TextView) frameLayout3.findViewById(R.id.cancel_search)).setOnClickListener(new g(24, jVar, this));
        } else {
            s.m("setupOverlayContainer");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f34815i = arguments != null ? arguments.getBoolean("ARG_CHECK_ENABLED_AT_CURRENT_LOCATION") : false;
    }

    @Override // nf0.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        if (this.f34815i) {
            this.f34815i = false;
            H6();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/onboarding/steps/IntroFragment$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ARG_CHECK_ENABLED_AT_CURRENT_LOCATION", "LEARN_MORE_URL", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
