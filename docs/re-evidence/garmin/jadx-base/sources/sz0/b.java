package sz0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.strava.StravaConfigActivity;
import com.garmin.android.apps.connectmobile.strava.StravaLiveSufferScoreActivity;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes9.dex */
public class b {

    public enum a {
        VIVOFIT_VIDEO,
        /* JADX INFO: Fake field, exist only in values array */
        CALORIES_TRACKING,
        CONNECT_IQ,
        CONNECT_IQ_OAUTH_REQUEST,
        CONNECT_IQ_OPEN_WEBPAGE_REQUEST,
        STRAVA_PROMO,
        STRAVA_LIVE_SUFFER_SCORE,
        SNAPSHOTS,
        ACHIEVEMENTS,
        CALENDAR,
        LEADERBOARD,
        /* JADX INFO: Fake field, exist only in values array */
        INTENSITY_MINUTES,
        GEAR,
        GOLF,
        /* JADX INFO: Fake field, exist only in values array */
        INDEX_INVITATION,
        INSIGHTS,
        WEIGHT,
        MY_COMMUNITY_SNAPSHOT,
        SOCIAL_SEARCH,
        TRUEUP,
        CHALLENGES,
        LIVETRACK_AUTOSTART,
        STRAVA_BEACON,
        CATCH_UP_FEATURES,
        MICROSOFT_OFFICE_365_SYNC
    }

    public static sz0.a a(a aVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context context = GarminConnectMobileApp.f28688j;
        if (context == null) {
            return null;
        }
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(GCMSettingManager.k().k() + context.getString(R.string.vivofit_video_url_path)));
            return new sz0.a(jCurrentTimeMillis, a.VIVOFIT_VIDEO, false, context.getString(R.string.lbl_watch_vivofit_tutorial), 2131232007, intent);
        }
        if (iOrdinal == 5) {
            if (((f12.b) KoinJavaComponent.get(f12.b.class)).f()) {
                return null;
            }
            return new sz0.a(jCurrentTimeMillis, a.STRAVA_PROMO, false, context.getString(R.string.lbl_strava_notification_title), 2131232006, new Intent(context, (Class<?>) StravaConfigActivity.class));
        }
        if (iOrdinal != 6 || ((f12.b) KoinJavaComponent.get(f12.b.class)).f()) {
            return null;
        }
        return new sz0.a(jCurrentTimeMillis, a.STRAVA_LIVE_SUFFER_SCORE, false, context.getString(R.string.strava_live_suffer_score_notification_txt), 2131232006, new Intent(context, (Class<?>) StravaLiveSufferScoreActivity.class));
    }
}
