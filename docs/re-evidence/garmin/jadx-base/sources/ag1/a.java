package ag1;

import am.h;
import android.app.Activity;
import android.content.Context;
import cg1.i;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.segments.SegmentsFilterDTO;
import com.garmin.android.apps.connectmobile.segments.model.SegmentLeaderboardFilterDTO;
import com.garmin.android.apps.connectmobile.segments.model.StravaStatusDTO;
import com.garmin.android.apps.connectmobile.segments.presentation.ExploreSegmentsFilterActivity;
import com.garmin.android.apps.connectmobile.segments.presentation.MySegmentsActivity;
import com.garmin.android.apps.connectmobile.segments.presentation.leaderboard.SegmentLeaderboardFilterActivity;
import d80.b;
import java.util.ArrayList;
import xf1.g;

/* JADX INFO: loaded from: classes9.dex */
public interface a {
    void a(ExploreSegmentsFilterActivity exploreSegmentsFilterActivity, SegmentsFilterDTO segmentsFilterDTO);

    void b(long j8, h hVar, Context context, String str);

    SegmentsFilterDTO c(c cVar);

    ArrayList d();

    SegmentLeaderboardFilterDTO e(c cVar);

    void f(SegmentLeaderboardFilterActivity segmentLeaderboardFilterActivity, SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO);

    void g();

    void h(StravaStatusDTO stravaStatusDTO, i iVar);

    long i();

    void j(Activity activity, String str, String str2, String str3);

    void k(Context context);

    void l(g gVar);

    long m(MySegmentsActivity.b bVar);

    void n(com.garmin.android.apps.connectmobile.activities.newmodel.h hVar, b bVar);

    void o(com.garmin.android.apps.connectmobile.segments.presentation.a aVar, int i14);
}
