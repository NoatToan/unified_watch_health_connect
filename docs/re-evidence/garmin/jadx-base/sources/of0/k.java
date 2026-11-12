package of0;

import androidx.lifecycle.v1;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.k0;
import androidx.media3.common.z;
import androidx.media3.ui.PlayerView;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.FirstTimeUseFragment;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lof0/k;", "Landroidx/media3/common/z$d;", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements z.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirstTimeUseFragment f131687a;

    public k(FirstTimeUseFragment firstTimeUseFragment) {
        this.f131687a = firstTimeUseFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.common.z.d
    public final void g1(PlaybackException playbackException) {
        playbackException.getClass();
        a2 a2Var = a2.ONBOARDING;
        String strN = fb1.c.n("Error trying to play back video: ", playbackException.getErrorCodeName());
        i2.f36769a.getClass();
        i2.a.f(a2Var, "FirstTimeUseFragment", strN);
        int i14 = FirstTimeUseFragment.f34793m;
        FirstTimeUseFragment firstTimeUseFragment = this.f131687a;
        Integer num = (Integer) firstTimeUseFragment.z6().f125834p.d();
        if ((num != null ? num.intValue() : 0) <= 1) {
            nf0.o oVarZ6 = firstTimeUseFragment.z6();
            ge1.b.T(v1.a(oVarZ6), null, null, new nf0.v(oVarZ6, null), 3);
        } else {
            firstTimeUseFragment.S6();
            firstTimeUseFragment.hideProgressOverlay();
            firstTimeUseFragment.M6();
        }
    }

    @Override // androidx.media3.common.z.d
    public final void k(k0 k0Var) {
        k0Var.getClass();
        double d14 = ((double) k0Var.f8335a) / ((double) k0Var.f8336b);
        FirstTimeUseFragment firstTimeUseFragment = this.f131687a;
        PlayerView playerView = firstTimeUseFragment.f34795j;
        if (playerView == null) {
            p005kotlin.jvm.internal.s.m("videoView");
            throw null;
        }
        double width = ((double) playerView.getWidth()) / d14;
        PlayerView playerView2 = firstTimeUseFragment.f34795j;
        if (playerView2 == null) {
            p005kotlin.jvm.internal.s.m("videoView");
            throw null;
        }
        playerView2.getLayoutParams().height = (int) width;
        PlayerView playerView3 = firstTimeUseFragment.f34795j;
        if (playerView3 != null) {
            playerView3.requestLayout();
        } else {
            p005kotlin.jvm.internal.s.m("videoView");
            throw null;
        }
    }

    @Override // androidx.media3.common.z.d
    public final void onPlaybackStateChanged(int i14) {
        FirstTimeUseFragment firstTimeUseFragment = this.f131687a;
        if (i14 == 2) {
            int i15 = FirstTimeUseFragment.f34793m;
            firstTimeUseFragment.F6();
        } else {
            if (i14 != 3) {
                return;
            }
            int i16 = FirstTimeUseFragment.f34793m;
            firstTimeUseFragment.hideProgressOverlay();
        }
    }
}
