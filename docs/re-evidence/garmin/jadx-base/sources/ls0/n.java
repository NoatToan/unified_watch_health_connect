package ls0;

import android.location.Location;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.TripFlightFragment;
import lc.u0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001¨\u0006\u0004"}, d2 = {"Lls0/n;", "Landroidx/lifecycle/z0;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n implements z0<g3<? extends Unit>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TripFlightFragment f114737a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f114738a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f114738a = iArr;
        }
    }

    public n(TripFlightFragment tripFlightFragment) {
        this.f114737a = tripFlightFragment;
    }

    @Override // androidx.lifecycle.z0
    public final void onChanged(g3<? extends Unit> g3Var) {
        fw.p pVar;
        g3<? extends Unit> g3Var2 = g3Var;
        if (g3Var2 == null || (pVar = g3Var2.f35300a) == null) {
            return;
        }
        int i14 = a.f114738a[pVar.ordinal()];
        int i15 = 1;
        TripFlightFragment tripFlightFragment = this.f114737a;
        if (i14 == 1) {
            g22.e.l(tripFlightFragment);
            return;
        }
        if (i14 != 2) {
            if (i14 != 3) {
                u0.r();
                return;
            }
            int i16 = TripFlightFragment.f37039n;
            tripFlightFragment.y6().f37113k.k(this);
            g22.e.f(tripFlightFragment);
            g22.e.c(tripFlightFragment);
            return;
        }
        int i17 = TripFlightFragment.f37039n;
        tripFlightFragment.y6().f37113k.k(this);
        Location location = tripFlightFragment.y6().f37110h;
        if (location != null) {
            q qVarW6 = tripFlightFragment.w6();
            y0 y0Var = new y0();
            y0Var.j(g3.a.c(g3.f35298f));
            w9.a aVarA = v1.a(qVarW6);
            x53.c cVar = s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new r(qVarW6, location, y0Var, null), 2);
            y0Var.f(tripFlightFragment.getViewLifecycleOwner(), new TripFlightFragment.d(new l(tripFlightFragment, i15)));
        }
    }
}
