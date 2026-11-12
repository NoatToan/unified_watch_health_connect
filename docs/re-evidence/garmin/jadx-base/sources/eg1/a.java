package eg1;

import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.segments.presentation.leaderboard.SegmentLeaderboardActivity;
import p005kotlin.Metadata;
import r22.q0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leg1/a;", "Ld80/b;", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SegmentLeaderboardActivity f63973a;

    public a(SegmentLeaderboardActivity segmentLeaderboardActivity) {
        this.f63973a = segmentLeaderboardActivity;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        SegmentLeaderboardActivity segmentLeaderboardActivity = this.f63973a;
        segmentLeaderboardActivity.hideProgressOverlay();
        i2.a.j(i2.f36769a, "SegmentLeaderboardActivity", "Error updating activity privacy: " + (bVar != null ? bVar.f112957a.name() : null) + " Error code: " + (bVar != null ? Integer.valueOf(bVar.f112958b) : null));
        SegmentLeaderboardActivity.a aVar = SegmentLeaderboardActivity.f41454p;
        segmentLeaderboardActivity.displayFailedMessage();
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        aVar.getClass();
        SegmentLeaderboardActivity segmentLeaderboardActivity = this.f63973a;
        segmentLeaderboardActivity.hideProgressOverlay();
        q0.b bVar = q0.f149800b;
        View viewFindViewById = segmentLeaderboardActivity.findViewById(R.id.content_frame);
        viewFindViewById.getClass();
        bVar.getClass();
        q0.b.a(viewFindViewById, R.string.msg_segments_privacy_updated, 1).show();
    }
}
