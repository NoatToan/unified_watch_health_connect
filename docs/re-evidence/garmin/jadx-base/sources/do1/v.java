package do1;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.i0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.social.VideoPlayerActivity;
import o53.f0;
import o53.s0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldo1/v;", "Landroidx/core/view/s;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v implements androidx.core.view.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VideoPlayerActivity f60628a;

    public v(VideoPlayerActivity videoPlayerActivity) {
        this.f60628a = videoPlayerActivity;
    }

    @Override // androidx.core.view.s
    public final void Y3(Menu menu, MenuInflater menuInflater) {
        zl.a.f(menu, menuInflater, R.menu.video_player_menu, menu);
    }

    @Override // androidx.core.view.s
    public final boolean w5(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.delete) {
            return true;
        }
        VideoPlayerActivity.a aVar = VideoPlayerActivity.f44499a;
        VideoPlayerActivity videoPlayerActivity = this.f60628a;
        videoPlayerActivity.showProgressOverlay();
        i0 i0VarW = f0.w(videoPlayerActivity);
        x53.c cVar = s0.f129406a;
        ge1.b.T(i0VarW, x53.b.f189152a, null, new u(videoPlayerActivity, null), 2);
        return true;
    }
}
