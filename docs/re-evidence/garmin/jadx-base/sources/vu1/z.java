package vu1;

import androidx.media3.exoplayer.ExoPlayer;
import com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTTrainingGuidancePlayerActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvu1/z;", "Landroidx/media3/common/z$d;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z implements androidx.media3.common.z.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FBTTrainingGuidancePlayerActivity f180395a;

    public z(FBTTrainingGuidancePlayerActivity fBTTrainingGuidancePlayerActivity) {
        this.f180395a = fBTTrainingGuidancePlayerActivity;
    }

    @Override // androidx.media3.common.z.d
    public final void onPlayWhenReadyChanged(boolean z14, int i14) {
        FBTTrainingGuidancePlayerActivity fBTTrainingGuidancePlayerActivity = this.f180395a;
        if (i14 == 1) {
            ExoPlayer exoPlayer = fBTTrainingGuidancePlayerActivity.f45484a;
            if ((exoPlayer != null ? Boolean.valueOf(exoPlayer.isPlaying()) : null) == null) {
                fBTTrainingGuidancePlayerActivity.showProgressOverlay();
                return;
            }
        }
        fBTTrainingGuidancePlayerActivity.hideProgressOverlay();
    }

    @Override // androidx.media3.common.z.d
    public final void onPlaybackStateChanged(int i14) {
        if (i14 == 3) {
            this.f180395a.hideProgressOverlay();
        }
    }
}
