package of0;

import android.view.View;
import android.widget.LinearLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.FirstTimeUseFragment;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.samd.data.model.DeviceAppLaunchFailureException;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"Lof0/i;", "Le32/e;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends e32.e<g3<? extends Unit>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirstTimeUseFragment f131682a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f131683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f131684b;

        static {
            int[] iArr = new int[rf1.a.values().length];
            try {
                iArr[rf1.a.DEVICE_NOT_CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rf1.a.DEVICE_BATTERY_LOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rf1.a.DEVICE_BUSY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f131683a = iArr;
            int[] iArr2 = new int[fw.p.values().length];
            try {
                iArr2[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[fw.p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[fw.p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f131684b = iArr2;
        }
    }

    public i(FirstTimeUseFragment firstTimeUseFragment) {
        this.f131682a = firstTimeUseFragment;
    }

    @Override // e32.e
    public final void a(g3<? extends Unit> g3Var) {
        g3<? extends Unit> g3Var2 = g3Var;
        int i14 = a.f131684b[g3Var2.f35300a.ordinal()];
        FirstTimeUseFragment firstTimeUseFragment = this.f131682a;
        if (i14 == 1) {
            a2 a2Var = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "FirstTimeUseFragment", "[launchEcgAppOnDevice] ECG app launched successfully on device");
            int i15 = FirstTimeUseFragment.f34793m;
            firstTimeUseFragment.hideProgressOverlay();
            LinearLayout linearLayout = firstTimeUseFragment.f34794i;
            if (linearLayout == null) {
                p005kotlin.jvm.internal.s.m("rootContainer");
                throw null;
            }
            View viewFindViewById = linearLayout.findViewById(R.id.ecg_first_time_use_container);
            LinearLayout linearLayout2 = firstTimeUseFragment.f34794i;
            if (linearLayout2 == null) {
                p005kotlin.jvm.internal.s.m("rootContainer");
                throw null;
            }
            View viewFindViewById2 = linearLayout2.findViewById(R.id.ecg_first_time_recording_container);
            viewFindViewById.getClass();
            viewFindViewById.setVisibility(8);
            firstTimeUseFragment.w6().setVisibility(8);
            viewFindViewById2.getClass();
            viewFindViewById2.setVisibility(0);
            return;
        }
        if (i14 != 2) {
            if (i14 != 3) {
                u0.r();
                return;
            } else {
                int i16 = FirstTimeUseFragment.f34793m;
                firstTimeUseFragment.F6();
                return;
            }
        }
        a2 a2Var2 = a2.ONBOARDING;
        String strN = fb1.c.n("[launchEcgAppOnDevice] error: ", g3Var2.f35302c);
        i2.f36769a.getClass();
        i2.a.f(a2Var2, "FirstTimeUseFragment", strN);
        int i17 = FirstTimeUseFragment.f34793m;
        firstTimeUseFragment.hideProgressOverlay();
        Exception exc = g3Var2.f35303d;
        if (!(exc instanceof DeviceAppLaunchFailureException)) {
            FirstTimeUseFragment.G6(firstTimeUseFragment);
            return;
        }
        int i18 = a.f131683a[((DeviceAppLaunchFailureException) exc).getStatus().ordinal()];
        if (i18 == 1) {
            firstTimeUseFragment.I6(new h(firstTimeUseFragment, 2));
            return;
        }
        if (i18 == 2) {
            firstTimeUseFragment.I6(new h(firstTimeUseFragment, 1));
        } else if (i18 == 3) {
            firstTimeUseFragment.I6(new h(firstTimeUseFragment, 0));
        } else {
            u0.r();
        }
    }
}
