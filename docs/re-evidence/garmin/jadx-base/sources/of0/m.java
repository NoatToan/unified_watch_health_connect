package of0;

import android.location.Location;
import android.widget.FrameLayout;
import androidx.lifecycle.s0;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.IntroFragment;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Lof0/m;", "Landroidx/lifecycle/z0;", "Landroid/location/Location;", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m implements z0<Location> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IntroFragment f131690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0<Location> f131691b;

    public m(IntroFragment introFragment, s0<Location> s0Var) {
        this.f131690a = introFragment;
        this.f131691b = s0Var;
    }

    @Override // androidx.lifecycle.z0
    public final void onChanged(Location location) {
        Location location2 = location;
        int i14 = IntroFragment.f34814j;
        IntroFragment introFragment = this.f131690a;
        introFragment.w6().setVisibility(0);
        FrameLayout frameLayout = introFragment.f125875f;
        if (frameLayout == null) {
            p005kotlin.jvm.internal.s.m("setupOverlayContainer");
            throw null;
        }
        frameLayout.setVisibility(8);
        if (location2 != null) {
            i2.f36769a.getClass();
            i2.a.b(a2.ONBOARDING, "IntroFragment", "[requestLocation] location=" + location2);
            IntroFragment.G6(introFragment, location2);
        } else {
            a2 a2Var = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "IntroFragment", "[requestLocation] no location");
            g22.e.a(introFragment, new fw.g());
        }
        this.f131691b.k(this);
    }
}
