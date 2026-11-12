package kd0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.badges.redesign.BadgeDetailsActivity;
import com.garmin.android.apps.connectmobile.connections.groups.challenges.GroupChallengeLeaderboardActivity;
import com.garmin.android.apps.connectmobile.connections.groups.challenges.GroupChallengeRulesActivity;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengeDTO;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.device.setup.DeviceSetupActivity;
import com.garmin.android.apps.connectmobile.follow.domain.FriendListActivity;
import com.garmin.android.apps.connectmobile.leaderboard.LeaderboardActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/e0;", "Lkt0/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0 implements kt0.a {
    @Override // kt0.a
    public final void a(Context context, String str, String str2, String str3) {
        context.getClass();
        if (str != null) {
            UserProfileActivity.f46494x.getClass();
            UserProfileActivity.a.c(context, str, str2, str3);
        }
    }

    @Override // kt0.a
    public final boolean b(long j8) {
        return hk0.p.k(j8);
    }

    @Override // kt0.a
    public final boolean c() {
        hk0.p pVar = hk0.p.f84079d;
        if (pVar == null || !pVar.n()) {
            return false;
        }
        try {
            return hk0.p.f84079d.f84080a.A();
        } catch (RemoteException e4) {
            com.garmin.android.apps.connectmobile.i2.g(e4, "TMP#GFDIService");
            return false;
        }
    }

    @Override // kt0.a
    public final int d() {
        return GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_challenge_last_type_id), 4);
    }

    @Override // kt0.a
    public final void e(androidx.fragment.app.m mVar) {
        DeviceSetupActivity.f33758b.b(mVar, ca0.o1.ADD_DEVICE, 0);
    }

    @Override // kt0.a
    public final com.garmin.android.apps.connectmobile.q1 f(Context context, sd2.f fVar) {
        String string;
        fVar.getClass();
        boolean zN = zb0.u0.n(fVar.getProductNumber(), zb0.u0.I1);
        int i14 = R.string.devices_help_how_to_sync_title;
        if (zN) {
            string = context.getResources().getString(R.string.devices_vivomove_help_connect_device, context.getString(R.string.os_name_android));
            string.getClass();
        } else if (zb0.u0.n(fVar.getProductNumber(), zb0.u0.H1)) {
            string = context.getResources().getString(R.string.device_settings_vivofit4_help_how_to_sync);
            string.getClass();
        } else if (zb0.n0.j(fVar.getProductNumber())) {
            string = context.getResources().getString(R.string.devices_vivofit_help_how_to_sync_vivofit);
            string.getClass();
        } else {
            boolean zQ = zb0.u0.q(fVar.getProductNumber());
            i14 = R.string.devices_help_how_to_connect_title;
            if (zQ) {
                String productDisplayName = fVar.getProductDisplayName();
                productDisplayName.getClass();
                string = context.getResources().getString(R.string.msg_wear_device_chest_enable_bluetooth, productDisplayName, context.getString(R.string.os_name_android));
                string.getClass();
            } else if (zb0.u0.s(fVar.getProductNumber())) {
                String productDisplayName2 = fVar.getProductDisplayName();
                productDisplayName2.getClass();
                string = context.getResources().getString(R.string.devices_generic_help_connect_device, productDisplayName2, context.getString(R.string.os_name_android));
                string.getClass();
            } else {
                String productDisplayName3 = fVar.getProductDisplayName();
                productDisplayName3.getClass();
                string = context.getResources().getString(R.string.devices_generic_help_connect_device, productDisplayName3, context.getString(R.string.os_name_android));
                string.getClass();
            }
        }
        com.garmin.android.apps.connectmobile.q1.f41066b.getClass();
        return com.garmin.android.apps.connectmobile.q1.b.a(i14, string, R.string.lbl_close, 0, null);
    }

    @Override // kt0.a
    public final void g(String str) {
        GCMSettingManager.f41536b.edit().putString(lg1.d.DEVICE_SOFTWARE_UPDATE_MODE.f112244a, str).apply();
    }

    @Override // kt0.a
    public final void h(com.garmin.android.apps.connectmobile.leaderboard.model.p pVar) {
        pVar.getClass();
        String uuid = pVar.getUuid();
        if (uuid == null) {
            uuid = "";
        }
        Long badgeId = pVar.getBadgeId();
        long jLongValue = badgeId != null ? badgeId.longValue() : 0L;
        String badgeKey = pVar.getBadgeKey();
        com.garmin.android.apps.connectmobile.badges.service.model.u uVar = new com.garmin.android.apps.connectmobile.badges.service.model.u(uuid, jLongValue, badgeKey != null ? badgeKey : "", c22.j0.f23102d.print(pVar.getCreateDate()), null, true, 16, null);
        av.g gVar = (av.g) KoinJavaComponent.get$default(av.g.class, null, null, 6, null);
        gVar.getClass();
        gVar.f13085b.d(uVar);
    }

    @Override // kt0.a
    public final void i(androidx.fragment.app.m mVar) {
        FriendListActivity.a aVar = FriendListActivity.f35257b;
        p003ji0.k kVar = p003ji0.k.SUGGESTED;
        aVar.getClass();
        mVar.startActivityForResult(FriendListActivity.a.a(mVar, kVar), 1);
    }

    @Override // kt0.a
    public final void j(androidx.fragment.app.m mVar, com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var) {
        a0Var.getClass();
        GroupChallengeDTO groupChallengeDTO = new GroupChallengeDTO();
        groupChallengeDTO.f31516e = a0Var.getName();
        groupChallengeDTO.f31514c = a0Var.d();
        groupChallengeDTO.f31520i = String.valueOf(a0Var.getStartDate());
        groupChallengeDTO.f31521j = String.valueOf(a0Var.getEndDate());
        groupChallengeDTO.f31513b = GroupChallengeDTO.b.UPCOMING;
        GroupChallengeRulesActivity.ca(mVar, groupChallengeDTO, 1);
    }

    @Override // kt0.a
    public final void k(Activity activity, String str) {
        GroupChallengeLeaderboardActivity.ca(activity, str, false);
    }

    @Override // kt0.a
    public final void l(int i14) {
        com.airbnb.lottie.animation.keyframe.a.p(GCMSettingManager.f41535a, R.string.key_challenge_last_type_id, GCMSettingManager.f41536b.edit(), i14);
    }

    @Override // kt0.a
    public final Intent m(LeaderboardActivity leaderboardActivity) {
        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
        return new Intent(leaderboardActivity, (Class<?>) DashboardActivity.class);
    }

    @Override // kt0.a
    public final void n(androidx.fragment.app.m mVar, int i14) {
        BadgeDetailsActivity.f30322l.getClass();
        Intent intent = new Intent(mVar, (Class<?>) BadgeDetailsActivity.class);
        intent.putExtra("GCM_extra_badge_id", i14);
        intent.putExtra("GCM_extra_badge_navigation_from_activity", true);
        mVar.startActivity(intent);
    }

    @Override // kt0.a
    public final Object o(String str, String str2, v13.c cVar) {
        return ((xu.c) KoinJavaComponent.get$default(xu.c.class, null, null, 6, null)).a(str, str2, cVar);
    }

    @Override // kt0.a
    public final void p() {
        yr1.e.b("AdHocChallengeLeaderboardFragment");
    }

    @Override // kt0.a
    public final void q(Fragment fragment) {
        String string = fragment.getResources().getString(R.string.garmin_connect_shop_health_and_fitness_url_path);
        string.getClass();
        Uri uri = Uri.parse(("https://" + GCMSettingManager.k().f77350p).concat(string));
        uri.getClass();
        g22.e.i(fragment, uri);
    }

    @Override // kt0.a
    public final Object r(wt0.h.b bVar) {
        Object objA = new n70.a7((l70.c) KoinJavaComponent.get$default(l70.c.class, null, null, 6, null)).a(o70.f.CHALLENGES, bVar);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }

    @Override // kt0.a
    public final boolean s(String str) {
        return zb0.u0.g(str);
    }
}
