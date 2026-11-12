package com.garmin.android.apps.connectmobile.startup;

import android.app.Activity;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.GCMActivityStartup;
import com.garmin.android.apps.connectmobile.activities.history.presentation.ActivitiesListActivity;
import com.garmin.android.apps.connectmobile.badges.redesign.BadgeDetailsActivity;
import com.garmin.android.apps.connectmobile.badges.redesign.BadgesActivity;
import com.garmin.android.apps.connectmobile.connections.groups.challenges.GroupChallengeLeaderboardActivity;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQAppStoreActivity;
import com.garmin.android.apps.connectmobile.contacts.edit.EditContactActivity;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.groupride.GroupRideShareActivity;
import com.garmin.android.apps.connectmobile.leaderboard.LeaderboardActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.AdHocChallengeDetailsActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.BadgeChallengeDetailsActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.ChallengeRulesActivity;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.LiveTrackActivity;
import com.garmin.android.apps.connectmobile.logging.presentation.LifestyleLoggingActivity;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailActivity;
import com.garmin.android.apps.connectmobile.onboarding.komoot.KomootConsentActivity;
import com.garmin.android.apps.connectmobile.settings.notifications.NotificationSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.thirdparty.details.ThirdPartyConnectActivity;
import com.garmin.android.apps.connectmobile.strava.StravaAuthConnectActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.EventDetailsActivity;
import com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import d53.t;
import d53.w;
import g22.n;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p92.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/WebLinkHandlerActivity;", "Landroid/app/Activity;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WebLinkHandlerActivity extends Activity {
    static {
        new a(null);
    }

    public static void a(Uri uri) {
        String queryParameter = uri.getQueryParameter("utm_source");
        String queryParameter2 = uri.getQueryParameter("utm_content");
        String queryParameter3 = uri.getQueryParameter("utm_medium");
        if (queryParameter == null || queryParameter2 == null || queryParameter3 == null) {
            return;
        }
        Bundle bundle = new Bundle(3);
        bundle.putString("Screen", queryParameter2);
        bundle.putString("Source", queryParameter);
        bundle.putString("Medium", queryParameter3);
        ht.a.f85464a.getClass();
        ht.a.a(bundle, "UserEmailEngagement");
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public final void onResume() {
        String str;
        Intent intentA;
        Intent intentA2;
        super.onResume();
        Uri data = getIntent().getData();
        if (!((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).c()) {
            ((e80.a) KoinJavaComponent.get$default(e80.a.class, null, null, 6, null)).a(String.valueOf(data), f80.b.WEB_LINK_HANDLER_ACTIVITY);
            startActivity(new Intent(this, (Class<?>) GCMActivityStartup.class));
            finish();
            return;
        }
        if (data == null) {
            finish();
            return;
        }
        String path = data.getPath();
        if (path == null) {
            com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
            com.garmin.android.apps.connectmobile.navigation.b.a.c(this, null, 268468224);
            finish();
            return;
        }
        if (w.z(path, "/mobile-link/gcm/editContact", false)) {
            String lastPathSegment = data.getLastPathSegment();
            EditContactActivity.f32500n.getClass();
            Intent intent = new Intent(this, (Class<?>) EditContactActivity.class);
            intent.putExtra("USER_ID", lastPathSegment);
            startActivity(intent);
        } else if (w.z(path, "/mobile-link/gcm/livetrack", false)) {
            LiveTrackActivity.f38637g.c(this, null);
        } else if (w.z(path, "/oauthConfirm", false)) {
            String queryParameter = data.getQueryParameter("oauth_token");
            String queryParameter2 = data.getQueryParameter("oauth_callback");
            ThirdPartyConnectActivity.a aVar = ThirdPartyConnectActivity.f43974c;
            hk1.w.a aVar2 = new hk1.w.a(queryParameter, queryParameter2);
            aVar.getClass();
            startActivity(ThirdPartyConnectActivity.a.a(this, aVar2));
        } else if (w.z(path, "/oauth2Confirm", false)) {
            ThirdPartyConnectActivity.a aVar3 = ThirdPartyConnectActivity.f43974c;
            hk1.w.b bVar = new hk1.w.b(data.getQueryParameter("client_id"), data.getQueryParameter(RemoteConfigConstants.ResponseFieldKey.STATE), data.getQueryParameter("code_challenge"), data.getQueryParameter("code_challenge_method"), data.getQueryParameter("redirect_uri"), data.getQueryParameter("response_type"));
            aVar3.getClass();
            startActivity(ThirdPartyConnectActivity.a.a(this, bVar));
        } else if (w.z(path, "/strava-auth", false)) {
            String queryParameter3 = data.getQueryParameter("code");
            if (n.d(queryParameter3)) {
                StravaAuthConnectActivity.f44933b.getClass();
                queryParameter3.getClass();
                Intent intent2 = new Intent(this, (Class<?>) StravaAuthConnectActivity.class);
                intent2.putExtra("arg_auth_code", queryParameter3);
                startActivity(intent2);
            }
        } else if (w.z(path, "/modern/profile", false) || w.z(path, "/app/profile", false)) {
            String lastPathSegment2 = data.getLastPathSegment();
            UserProfileActivity.a aVar4 = UserProfileActivity.f46494x;
            lastPathSegment2.getClass();
            aVar4.getClass();
            UserProfileActivity.a.c(this, lastPathSegment2, null, null);
        } else if (w.z(path, "/modern/activity", false) || w.z(path, "/app/activity", false)) {
            List<String> pathSegments = data.getPathSegments();
            int iIndexOf = pathSegments.indexOf("activity") + 1;
            if (pathSegments.size() > iIndexOf) {
                String str2 = pathSegments.get(iIndexOf);
                str2.getClass();
                str = str2;
            } else {
                str = "";
            }
            if (str.length() > 0) {
                try {
                    aq.b bVar2 = new aq.b();
                    bVar2.f11823b = Long.parseLong(str);
                    am.h hVar = am.h.VIEW_ONLY;
                    if (hVar != null) {
                        bVar2.f11824c = hVar;
                    }
                    startActivity(bVar2.a(this));
                } catch (NumberFormatException unused) {
                    ActivitiesListActivity.a.b(ActivitiesListActivity.f29099d, this, am.g.f3942f, null, 28);
                }
            } else {
                ActivitiesListActivity.a.b(ActivitiesListActivity.f29099d, this, am.g.f3942f, null, 28);
            }
        } else if (w.z(path, "/apps/", false)) {
            String lastPathSegment3 = data.getLastPathSegment();
            Intent intent3 = new Intent(this, (Class<?>) ConnectIQAppStoreActivity.class);
            intent3.putExtra("CONNECT_IQ_APP_ID", lastPathSegment3);
            startActivity(intent3);
        } else if (w.z(path, "/auto-challenge-authenticate/request", false)) {
            LeaderboardActivity.f37145i.getClass();
            startActivity(LeaderboardActivity.a.a(this));
        } else if (w.z(path, "/modern/home/", false) || w.z(path, "/app/home/", false)) {
            if (data.getQueryParameter("web_only") != null) {
                Intent intentMakeMainSelectorActivity = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
                intentMakeMainSelectorActivity.setData(data);
                startActivity(intentMakeMainSelectorActivity);
            } else {
                a(data);
                com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                com.garmin.android.apps.connectmobile.navigation.b.a.c(this, null, 268468224);
            }
        } else if (w.z(path, "/modern/activities", false) || w.z(path, "/app/activities", false)) {
            a(data);
            ActivitiesListActivity.a.b(ActivitiesListActivity.f29099d, this, am.g.f3942f, null, 28);
        } else if (w.z(path, "/modern/settings/emailNotifications", false) || w.z(path, "/app/settings/emailNotifications", false)) {
            a(data);
            NotificationSettingsActivity.f43568b.getClass();
            Intent intent4 = new Intent(this, (Class<?>) NotificationSettingsActivity.class);
            intent4.putExtra("VIEW_EMAIL_SETTINGS", true);
            startActivity(intent4);
        } else if (w.z(path, "/modern/challenge/", false) || w.z(path, "/app/challenge/", false)) {
            String lastPathSegment4 = data.getLastPathSegment();
            if (lastPathSegment4 == null || lastPathSegment4.length() == 0) {
                LeaderboardActivity.f37145i.getClass();
                Intent intentA3 = LeaderboardActivity.a.a(this);
                intentA3.addFlags(268468224);
                startActivity(intentA3);
            } else {
                GroupChallengeLeaderboardActivity.ca(this, lastPathSegment4, true);
            }
        } else if (w.z(path, "/modern/adhoc-challenge/", false) || w.z(path, "/app/adhoc-challenge/", false)) {
            String lastPathSegment5 = data.getLastPathSegment();
            String queryParameter4 = data.getQueryParameter("adHocChallengeInviteId");
            if (lastPathSegment5 == null || lastPathSegment5.length() == 0) {
                LeaderboardActivity.f37145i.getClass();
                intentA = LeaderboardActivity.a.a(this);
            } else {
                intentA = AdHocChallengeDetailsActivity.a.b(AdHocChallengeDetailsActivity.f37168h, this, lastPathSegment5, queryParameter4, 8);
            }
            startActivity(intentA);
        } else if (w.z(path, "/modern/badges/", false) || w.z(path, "/app/badges/", false)) {
            String lastPathSegment6 = data.getLastPathSegment();
            Integer numI = lastPathSegment6 != null ? t.i(lastPathSegment6) : null;
            if (numI == null) {
                BadgesActivity.f30332j.getClass();
                intentA2 = BadgesActivity.b.a(this, null, false);
            } else {
                BadgeDetailsActivity.a aVar5 = BadgeDetailsActivity.f30322l;
                int iIntValue = numI.intValue();
                aVar5.getClass();
                intentA2 = BadgeDetailsActivity.a.a(iIntValue, this);
            }
            intentA2.addFlags(268468224);
            startActivity(intentA2);
        } else if (w.z(path, "/modern/badge-challenge/", false) || w.z(path, "/app/badge-challenge/", false)) {
            String lastPathSegment7 = data.getLastPathSegment();
            if (s.g(lastPathSegment7, "details")) {
                List<String> pathSegments2 = data.getPathSegments();
                pathSegments2.getClass();
                List<String> pathSegments3 = data.getPathSegments();
                pathSegments3.getClass();
                String str3 = (String) h0.e0(pathSegments3.size() - 2, pathSegments2);
                if (str3 == null || str3.length() == 0) {
                    com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                    com.garmin.android.apps.connectmobile.navigation.b.a.c(this, null, 268468224);
                } else {
                    ChallengeRulesActivity.f37225j.getClass();
                    Intent intent5 = new Intent(this, (Class<?>) ChallengeRulesActivity.class);
                    intent5.putExtra("badge_challenge_uuid", str3);
                    intent5.putExtra("from_badge_challenge_web_link", true);
                    startActivity(intent5);
                }
            } else {
                BadgeChallengeDetailsActivity.f37204e.getClass();
                BadgeChallengeDetailsActivity.a.b(this, lastPathSegment7);
            }
        } else if (w.z(path, "/modern/event", false) || w.z(path, "/app/event", false)) {
            String queryParameter5 = data.getQueryParameter("shareableEventUuid");
            if (queryParameter5 == null) {
                queryParameter5 = data.getLastPathSegment();
            }
            if (queryParameter5 == null || queryParameter5.length() <= 30) {
                String strJ = am.j.j(data, "Error occurred while reading shareableUuid from ");
                y.f136664a.getClass();
                y.a.c("WebLinkHandlerActivity", strJ);
            } else {
                EventDetailsActivity.a aVar6 = EventDetailsActivity.f45692o;
                com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                aVar6.getClass();
                TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(this);
                taskStackBuilderCreate.addNextIntent(new Intent(this, (Class<?>) DashboardActivity.class));
                Intent intent6 = new Intent(this, (Class<?>) EventDetailsActivity.class);
                intent6.putExtra("GCM_extra_sharable_event_id", queryParameter5);
                intent6.addFlags(0);
                taskStackBuilderCreate.addNextIntent(intent6);
                taskStackBuilderCreate.startActivities();
            }
        } else if (w.z(path, bn0.k.f19007b, false)) {
            GroupRideShareActivity.f36417i.getClass();
            String queryParameter6 = data.getQueryParameter(TtmlNode.ATTR_ID);
            Intent intent7 = new Intent(this, (Class<?>) GroupRideShareActivity.class);
            intent7.addFlags(67108864);
            intent7.putExtra("EXTRA_GROUP_RIDE_CODE", queryParameter6);
            startActivity(intent7);
        } else if (w.z(path, "/ml/gcm/komoot", false)) {
            KomootConsentActivity.f39717c.getClass();
            KomootConsentActivity.a.a(this, data);
        } else if (w.z(path, "/mobile-link/gcm/lifestyle-logging", false)) {
            startActivity(new Intent(this, (Class<?>) LifestyleLoggingActivity.class));
        } else if (w.z(path, "/epic", false)) {
            String lastPathSegment8 = data.getLastPathSegment();
            if (lastPathSegment8 != null) {
                MultiDayActivitiesDetailActivity.f39233a.getClass();
                MultiDayActivitiesDetailActivity.a.b(this, lastPathSegment8);
            }
        } else {
            com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
            com.garmin.android.apps.connectmobile.navigation.b.a.c(this, null, 268468224);
        }
        finish();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\"\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0006R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0006¨\u0006&"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/WebLinkHandlerActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ACTIVITY", "USER_PROFILE", "USER_PROFILE_APP", "USER_COMMENT", "USER_COMMENT_APP", "CIQ_APP_STORE", "AUTO_CHALLENGE", "HOME", "HOME_APP", "USER_ACTIVITIES", "USER_ACTIVITIES_APP", "SETTINGS_EMAIL", "SETTINGS_EMAIL_APP", "CHALLENGE_DETAILS", "CHALLENGE_DETAILS_APP", "ADHOC_CHALLENGE_DETAILS", "ADHOC_CHALLENGE_DETAILS_APP", "BADGE_DETAILS", "BADGE_DETAILS_APP", "BADGE_CHALLENGE_DETAILS", "BADGE_CHALLENGE_DETAILS_APP", "THIRD_PARTY_OAUTH", "THIRD_PARTY_OAUTH2", "STRAVA_OAUTH", "USER_EVENT", "USER_EVENT_APP", "EPIC_PATH", "EDIT_CONTACT_URI", "LIVE_MAIN_SCREEN_LINK", "KOMOOT", "LIFESTYLE_LOGGING", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
