package kd0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.badges.redesign.BadgeDetailsActivity;
import com.garmin.android.apps.connectmobile.badges.redesign.BadgesActivity;
import com.garmin.android.apps.connectmobile.badges.redesign.CompareBadgesActivity;
import com.garmin.android.apps.connectmobile.badges.redesign.ConnectionBadgeDetailsActivity;
import com.garmin.android.apps.connectmobile.consent.DataConsentActivity;
import com.garmin.android.apps.connectmobile.dogs.presentation.AllDogsActivity;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersActivity;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.ManageFamilyActivity;
import com.garmin.android.apps.connectmobile.follow.domain.FriendListActivity;
import com.garmin.android.apps.connectmobile.follow.domain.OthersFriendListActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.NewCreateChallengeActivity;
import com.garmin.android.apps.connectmobile.settings.devices.backup.DeviceBackupActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.EventDetailsActivity;
import com.garmin.android.apps.connectmobile.userprofile.presentation.follow.block.FollowBlockedUsersActivity;
import com.garmin.android.apps.connectmobile.userprofile.presentation.follow.mute.FollowMutedUsersActivity;
import com.garmin.android.framework.datamanagement.datasource.CacheDatabase;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/g5;", "Lm12/r;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g5 implements m12.r {
    @Override // m12.r
    public final Intent A(Activity activity, ActivityListItemDTO activityListItemDTO, am.h hVar) {
        hVar.getClass();
        aq.b bVar = new aq.b();
        bVar.f11822a = activityListItemDTO;
        bVar.f11823b = activityListItemDTO.f29250b;
        String str = activityListItemDTO.f29265g.f4358a;
        bVar.f11824c = hVar;
        bVar.f11825d = true;
        bVar.f11827f = str;
        return bVar.a(activity);
    }

    @Override // m12.r
    public final int B(String str) {
        str.getClass();
        com.garmin.android.apps.connectmobile.i.f36758a.getClass();
        return com.garmin.android.apps.connectmobile.i.d(str);
    }

    @Override // m12.r
    public final void C(Context context, Long l14, String str) {
        context.getClass();
        EventDetailsActivity.a.d(EventDetailsActivity.f45692o, context, l14, str);
    }

    @Override // m12.r
    public final Intent D(Context context) {
        DeviceBackupActivity.f42558c.getClass();
        return new Intent(context, (Class<?>) DeviceBackupActivity.class);
    }

    @Override // m12.r
    public final void E(InputStream inputStream, FileOutputStream fileOutputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int i14 = inputStream.read(bArr);
            if (i14 == -1) {
                return;
            } else {
                fileOutputStream.write(bArr, 0, i14);
            }
        }
    }

    @Override // m12.r
    public final Intent F(Context context) {
        return new Intent(context, (Class<?>) AllDogsActivity.class);
    }

    @Override // m12.r
    public final Intent a(Context context) {
        return AuthorizedViewersActivity.a.a(AuthorizedViewersActivity.f34974m, context);
    }

    @Override // m12.r
    public final Object b(v13.c cVar) {
        return ((rg1.a) KoinJavaComponent.get$default(rg1.a.class, null, null, 6, null)).b(cVar);
    }

    @Override // m12.r
    public final void c(Context context) {
        context.getClass();
        ro1.g0.e(context);
    }

    @Override // m12.r
    public final List d(long j8, long j14, long j15, String str) {
        str.getClass();
        List listD = CacheDatabase.i().f().d(j8, j14, j15, str);
        listD.getClass();
        return listD;
    }

    @Override // m12.r
    public final boolean e() {
        com.garmin.android.apps.connectmobile.l.g().getClass();
        return gh2.i.f77458c.a().f77477b.c("barbell_exercise_pr_enabled");
    }

    @Override // m12.r
    public final Intent f(Context context) {
        return new Intent(context, (Class<?>) ManageFamilyActivity.class);
    }

    @Override // m12.r
    public final Intent g(int i14, Context context) {
        BadgeDetailsActivity.f30322l.getClass();
        return BadgeDetailsActivity.a.a(i14, context);
    }

    @Override // m12.r
    public final Intent h(Context context, hi0.a aVar, Boolean bool) {
        context.getClass();
        NewCreateChallengeActivity.f37257f.getClass();
        Intent intent = new Intent(context, (Class<?>) NewCreateChallengeActivity.class);
        if (aVar != null) {
            intent.putExtra("GCM_ad_hoc_challenge_selected_follower", aVar);
            intent.putExtra("GCM_ad_hoc_challenge_selected_follower_wheelchair_mode", p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE));
        }
        return intent;
    }

    @Override // m12.r
    public final void i(ArrayList arrayList) {
        CacheDatabase.i().f().a(arrayList);
    }

    @Override // m12.r
    public final Object j(m12.c.C2202c c2202c) {
        mj1.b bVarA = mj1.b.a.a(mj1.b.f119081b);
        return com.garmin.android.apps.connectmobile.f0.J(bVarA, new mj1.c(bVarA, null), c2202c);
    }

    @Override // m12.r
    public final void k() {
        int i14 = mt0.t1.f120867a;
        Bundle bundleA = h7.c.a(new o13.p("FROM", "UserProfile"));
        ht.a.f85464a.getClass();
        ht.a.a(bundleA, "CreateAdhocChallengeButtonClicked");
    }

    @Override // m12.r
    public final am.x0 l(int i14) {
        com.garmin.android.apps.connectmobile.i.f36758a.getClass();
        return com.garmin.android.apps.connectmobile.i.h(i14);
    }

    @Override // m12.r
    public final String m(Context context, fg0.d dVar) {
        context.getClass();
        lz1.f.f115404a.getClass();
        return lz1.f.a.h(context, dVar);
    }

    @Override // m12.r
    public final String n(Context context, q91.d dVar, double d14) {
        return z91.a.g(context, dVar, d14, false);
    }

    @Override // m12.r
    public final Intent o(Context context, String str, String str2) {
        context.getClass();
        OthersFriendListActivity.a aVar = OthersFriendListActivity.f35271a;
        p003ji0.k kVar = p003ji0.k.FOLLOWERS;
        aVar.getClass();
        return OthersFriendListActivity.a.a(context, kVar, str, str2);
    }

    @Override // m12.r
    public final void p(Context context) {
        FollowMutedUsersActivity.f47085b.getClass();
        context.startActivity(new Intent(context, (Class<?>) FollowMutedUsersActivity.class));
    }

    @Override // m12.r
    public final Intent q(Context context, String str) {
        CompareBadgesActivity.f30346q.getClass();
        Intent intent = new Intent(context, (Class<?>) CompareBadgesActivity.class);
        intent.putExtra("GCM_userDisplayName", str);
        return intent;
    }

    @Override // m12.r
    public final Intent r(Context context, String str, String str2) {
        context.getClass();
        OthersFriendListActivity.a aVar = OthersFriendListActivity.f35271a;
        p003ji0.k kVar = p003ji0.k.FOLLOWING;
        aVar.getClass();
        return OthersFriendListActivity.a.a(context, kVar, str, str2);
    }

    @Override // m12.r
    public final Intent s(Context context, com.garmin.android.apps.connectmobile.userprofile.model.q qVar, boolean z14) {
        BadgesActivity.f30332j.getClass();
        return BadgesActivity.b.a(context, qVar, z14);
    }

    @Override // m12.r
    public final Object t(nj1.e eVar, m12.w wVar) {
        mj1.b bVarA = mj1.b.a.a(mj1.b.f119081b);
        return com.garmin.android.apps.connectmobile.f0.J(bVarA, new mj1.d(bVarA, eVar, null), wVar);
    }

    @Override // m12.r
    public final Intent u(Context context, int i14, String str) {
        ConnectionBadgeDetailsActivity.f30365i.getClass();
        return ConnectionBadgeDetailsActivity.a.a(context, i14, str);
    }

    @Override // m12.r
    public final Intent v() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        return intent;
    }

    @Override // m12.r
    public final Intent w(Context context) {
        context.getClass();
        FriendListActivity.a aVar = FriendListActivity.f35257b;
        p003ji0.k kVar = p003ji0.k.FOLLOWERS;
        aVar.getClass();
        return FriendListActivity.a.a(context, kVar);
    }

    @Override // m12.r
    public final Intent x(Context context) {
        context.getClass();
        FriendListActivity.a aVar = FriendListActivity.f35257b;
        p003ji0.k kVar = p003ji0.k.FOLLOWING;
        aVar.getClass();
        return FriendListActivity.a.a(context, kVar);
    }

    @Override // m12.r
    public final void y(Context context) {
        DataConsentActivity.a.b(DataConsentActivity.f32169h, context);
    }

    @Override // m12.r
    public final void z(Context context) {
        FollowBlockedUsersActivity.f47079b.getClass();
        context.startActivity(new Intent(context, (Class<?>) FollowBlockedUsersActivity.class));
    }
}
