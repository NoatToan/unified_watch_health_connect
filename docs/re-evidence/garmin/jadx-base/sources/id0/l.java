package id0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.history.presentation.ActivitiesListActivity;
import com.garmin.android.apps.connectmobile.badges.redesign.BadgeDetailsActivity;
import com.garmin.android.apps.connectmobile.calendar.presentation.detail.details.CalendarDetailsActivity;
import com.garmin.android.apps.connectmobile.connections.groups.challenges.GroupChallengeLeaderboardActivity;
import com.garmin.android.apps.connectmobile.golf.badge.BadgeScorecardsActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.AdHocChallengeDetailsActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.BadgeChallengeDetailsActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.EarnedBadgeChallengesActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.TeamChallengeActivity;
import com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lid0/l;", "Lru/d;", "Lk12/a;", "usersRepo", "Lcl0/b;", "golfDelegate", "<init>", "(Lk12/a;Lcl0/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements ru.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k12.a f92827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cl0.b f92828b;

    public l(k12.a aVar, cl0.b bVar) {
        aVar.getClass();
        bVar.getClass();
        this.f92827a = aVar;
        this.f92828b = bVar;
    }

    @Override // ru.d
    public final void a(Context context, String str, String str2, String str3) {
        if (str != null) {
            UserProfileActivity.f46494x.getClass();
            UserProfileActivity.a.c(context, str, str2, str3);
        }
    }

    @Override // ru.d
    public final void b(androidx.fragment.app.m mVar, String str, int i14) {
        boolean z14 = com.garmin.android.apps.connectmobile.leaderboard.model.g0.GUARDIAN.f38167a == i14;
        TeamChallengeActivity.f37278g.getClass();
        TeamChallengeActivity.a.c(mVar, str, null, z14, true);
    }

    @Override // ru.d
    public final void c(androidx.fragment.app.m mVar, String str, int i14) {
        boolean z14 = com.garmin.android.apps.connectmobile.leaderboard.model.g0.GUARDIAN.f38167a == i14;
        AdHocChallengeDetailsActivity.f37168h.getClass();
        AdHocChallengeDetailsActivity.a.d(mVar, str, null, z14, true);
    }

    @Override // ru.d
    public final void d(androidx.fragment.app.m mVar, String str) {
        BadgeChallengeDetailsActivity.f37204e.getClass();
        mVar.startActivityForResult(BadgeChallengeDetailsActivity.a.a(mVar, str), 7);
    }

    @Override // ru.d
    public final void e(Context context, int i14, int i15, String str) {
        ActivitiesListActivity.a aVar = ActivitiesListActivity.f29099d;
        am.g gVar = am.g.f3944h;
        Integer numValueOf = Integer.valueOf(i14);
        Integer numValueOf2 = Integer.valueOf(i15);
        aVar.getClass();
        gVar.getClass();
        context.startActivity(ActivitiesListActivity.a.a(context, gVar, numValueOf, str, numValueOf2));
    }

    @Override // ru.d
    public final void f(Context context, String str) {
        GroupChallengeLeaderboardActivity.ca(context, str, false);
    }

    @Override // ru.d
    public final void g(BadgeDetailsActivity badgeDetailsActivity, Intent intent, String str, String str2) {
        intent.getClass();
        ro1.g0.f153957a.getClass();
        ro1.g0.f(badgeDetailsActivity, intent);
        ht.a aVar = ht.a.f85464a;
        Bundle bundleA = h7.c.a(new o13.p("badgeKey", str2), new o13.p("target", str));
        aVar.getClass();
        ht.a.a(bundleA, "ShareBadge");
    }

    @Override // ru.d
    public final void h(Context context, long j8, am.h hVar) {
        hVar.getClass();
        aq.b bVar = new aq.b();
        bVar.f11823b = j8;
        bVar.f11824c = hVar;
        context.startActivity(bVar.a(context));
    }

    @Override // ru.d
    public final Object i(String str, uu.z zVar) {
        return this.f92827a.h(str, com.garmin.android.apps.connectmobile.userprofile.model.k.f46891k, zVar);
    }

    @Override // ru.d
    public final void j(androidx.fragment.app.m mVar, String str) {
        i91.c cVar = new i91.c(4, mVar, str);
        cl0.b bVar = this.f92828b;
        if (!bVar.E()) {
            cVar.invoke();
        } else {
            bVar.z();
            new androidx.appcompat.app.e.a(mVar).setTitle(R.string.leaving_garmin_connect_alert_title).setCancelable(false).setMessage(R.string.leaving_garmin_connect_alert_message_golf_scorecard).setPositiveButton(R.string.lbl_common_continue, new ew1.h1(cVar, 19)).setNegativeButton(R.string.lbl_cancel, new f20.i(24)).show();
        }
    }

    @Override // ru.d
    public final void k(androidx.fragment.app.m mVar, DateTime dateTime) {
        CalendarDetailsActivity.f31194p.getClass();
        Intent intent = new Intent(mVar, (Class<?>) CalendarDetailsActivity.class);
        e32.n.a aVar = e32.n.f62802m;
        e32.o oVar = e32.o.f62806i;
        aVar.getClass();
        e32.n.a.a(intent, dateTime, oVar);
        mVar.startActivity(intent);
    }

    @Override // ru.d
    public final void l(androidx.fragment.app.m mVar, int i14) {
        BadgeScorecardsActivity.f35746a.getClass();
        Intent intent = new Intent(mVar, (Class<?>) BadgeScorecardsActivity.class);
        intent.putExtra("GCM_extra_badge_id", i14);
        mVar.startActivity(intent);
    }

    @Override // ru.d
    public final Intent m(Uri uri) {
        uri.getClass();
        ro1.g0.f153957a.getClass();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/*");
        intent.addFlags(268435457);
        intent.putExtra("android.intent.extra.STREAM", uri);
        return intent;
    }

    @Override // ru.d
    public final void n(Context context, String str) {
        context.startActivity(AdHocChallengeDetailsActivity.a.b(AdHocChallengeDetailsActivity.f37168h, context, str, null, 12));
    }

    @Override // ru.d
    public final void o(int i14, Context context) {
        ActivitiesListActivity.a.b(ActivitiesListActivity.f29099d, context, am.g.f3943g, Integer.valueOf(i14), 24);
    }

    @Override // ru.d
    public final void p(Context context, int i14, int i15, com.garmin.android.apps.connectmobile.badges.service.model.a aVar) {
        aVar.getClass();
        EarnedBadgeChallengesActivity.f37255b.getClass();
        Intent intent = new Intent(context, (Class<?>) EarnedBadgeChallengesActivity.class);
        intent.putExtra("GCM_extra_badge_id", i14);
        intent.putExtra("GCM_extra_badge_earned_count", i15);
        intent.putExtra("GCM_extra_badge_associate_type", aVar.f30551a);
        context.startActivity(intent);
    }
}
