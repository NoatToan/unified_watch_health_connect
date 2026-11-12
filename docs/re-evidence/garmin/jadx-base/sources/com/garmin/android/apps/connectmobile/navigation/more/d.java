package com.garmin.android.apps.connectmobile.navigation.more;

import am.x0;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.room.a0;
import c22.s3;
import com.garmin.android.apps.connectmobile.activities.reports.ActivityReportsActivity;
import com.garmin.android.apps.connectmobile.badges.redesign.BadgesActivity;
import com.garmin.android.apps.connectmobile.consent.DataConsentActivity;
import com.garmin.android.apps.connectmobile.consent.e;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute;
import com.garmin.android.apps.connectmobile.dogs.presentation.AllDogsActivity;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersActivity;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.ManageFamilyActivity;
import com.garmin.android.apps.connectmobile.follow.domain.FriendDiscoverActivity;
import com.garmin.android.apps.connectmobile.follow.domain.FriendListActivity;
import com.garmin.android.apps.connectmobile.gncs.GNCSOptOutSettingsActivity;
import com.garmin.android.apps.connectmobile.hydration.presentation.settings.HydrationSettingsActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MenstrualCycleSettingsActivity;
import com.garmin.android.apps.connectmobile.personalrecords.presentation.activity.PersonalRecordsActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.GCMUserSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.backup.DeviceBackupActivity;
import com.garmin.android.apps.connectmobile.settings.notifications.NotificationSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.usersettings.accessibility.WheelchairModeActivity;
import com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity;
import com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileActivity;
import com.garmin.android.apps.connectmobile.userprofile.presentation.follow.block.FollowBlockedUsersActivity;
import com.garmin.android.apps.connectmobile.userprofile.presentation.follow.mute.FollowMutedUsersActivity;
import com.garmin.android.apps.connectmobile.weather.defaultlocation.WeatherLocationPreferenceActivity;
import e23.l;
import java.io.Serializable;
import java.util.List;
import lc.m0;
import lc.u0;
import lc.y;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import q92.x;
import ty0.f;
import ty0.g;
import ty0.h;
import ty0.k;
import ty0.n;
import ty0.o;
import ty0.p;
import vy0.t;
import xk1.v;
import z10.d1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/navigation/more/d;", "Lvy0/t;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f39426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l<ty0.b, Unit> f39427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f39428c;

    /* JADX WARN: Multi-variable type inference failed */
    public d(m0 m0Var, l<? super ty0.b, Unit> lVar, Context context) {
        this.f39426a = m0Var;
        this.f39427b = lVar;
        this.f39428c = context;
    }

    @Override // vy0.t
    public final void a(b bVar, e23.a<Unit> aVar) {
        Intent intentA;
        o oVar;
        com.garmin.android.apps.connectmobile.consent.d dVar;
        bVar.getClass();
        boolean z14 = bVar instanceof b.l;
        m0 m0Var = this.f39426a;
        l<ty0.b, Unit> lVar = this.f39427b;
        if (z14) {
            ty0.b bVar2 = ((b.l) bVar).f39421c;
            ty0.b[] bVarArr = bVar2.f166941g;
            if (bVarArr != null) {
                if (!(bVarArr.length == 0)) {
                    aVar.invoke();
                    MoreNavigationRoute.INSTANCE.getClass();
                    y.l(m0Var, MoreNavigationRoute.Companion.a(bVar2));
                    return;
                }
            }
            lVar.invoke(bVar2);
            return;
        }
        if (bVar instanceof b.e) {
            ty0.b bVar3 = ((b.e) bVar).f39406d;
            ty0.b[] bVarArr2 = bVar3.f166941g;
            if (bVarArr2 != null) {
                if (!(bVarArr2.length == 0)) {
                    aVar.invoke();
                    y.l(m0Var, new MoreNavigationRoute.BaseFeatureScreen(bVar3.f166935a));
                    return;
                }
            }
            lVar.invoke(bVar3);
            return;
        }
        boolean z15 = bVar instanceof b.a;
        Context context = this.f39428c;
        if (z15) {
            com.garmin.android.apps.connectmobile.navigation.b.a aVar2 = com.garmin.android.apps.connectmobile.navigation.b.f39357a;
            x0 x0Var = ((b.a) bVar).f39398c;
            aVar2.getClass();
            x0Var.getClass();
            context.getClass();
            Intent intentA2 = com.garmin.android.apps.connectmobile.navigation.b.a.a(context, ActivityReportsActivity.class, null);
            intentA2.putExtra("GCM_extra_activity_type", (Parcelable) x0Var);
            context.startActivity(intentA2);
            return;
        }
        if (bVar instanceof b.k) {
            return;
        }
        if (bVar instanceof b.f) {
            lVar.invoke(((b.f) bVar).f39409c);
            return;
        }
        if (bVar instanceof b.j) {
            com.garmin.android.apps.connectmobile.navigation.b.a aVar3 = com.garmin.android.apps.connectmobile.navigation.b.f39357a;
            wy0.a aVar4 = ((b.j) bVar).f39417c;
            aVar3.getClass();
            aVar4.getClass();
            context.getClass();
            int i14 = com.garmin.android.apps.connectmobile.navigation.b.a.C0703a.f39360b[aVar4.ordinal()];
            if (i14 == 1) {
                BadgesActivity.f30332j.getClass();
                context.startActivity(BadgesActivity.b.a(context, null, false));
                return;
            } else if (i14 == 2) {
                context.startActivity(PersonalRecordsActivity.a.b(PersonalRecordsActivity.f40337b, context, null, null, null, 14));
                return;
            } else if (i14 != 3) {
                u0.r();
                return;
            } else {
                UserProfileActivity.f46494x.getClass();
                context.startActivity(UserProfileActivity.a.a(context));
                return;
            }
        }
        if (bVar instanceof b.d) {
            h.a aVar5 = h.f166975a;
            g gVar = ((b.d) bVar).f39404d;
            aVar5.getClass();
            context.getClass();
            gVar.getClass();
            switch (h.a.C3140a.f166976a[gVar.ordinal()]) {
                case 1:
                    h.a.a(context, DashboardRoute.EditEssentials.INSTANCE);
                    break;
                case 2:
                    h.a.a(context, DashboardRoute.EditInFocus.INSTANCE);
                    break;
                case 3:
                    h.a.a(context, DashboardRoute.EditSecondaryStats.INSTANCE);
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    h.a.a(context, new DashboardRoute.HomeSettings(false, 1, (j) null));
                    break;
                case 12:
                    context.startActivity(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).b(context));
                    break;
                default:
                    u0.r();
                    break;
            }
            return;
        }
        if (bVar instanceof b.i) {
            n.a aVar6 = n.f167033a;
            m12.t tVar = ((b.i) bVar).f39416d;
            aVar6.getClass();
            context.getClass();
            tVar.getClass();
            String str = tVar.f115884a;
            int i15 = n.a.C3142a.f167034a[tVar.ordinal()];
            if (i15 == 1 || i15 == 2 || i15 == 3 || i15 == 4) {
                context.startActivity(EditProfileActivity.a.a(EditProfileActivity.f46981h, context, s3.b() ? null : str));
                return;
            }
            if (i15 == 5 || i15 == 6) {
                context.startActivity(EditProfileActivity.a.a(EditProfileActivity.f46981h, context, str));
                return;
            }
            if (i15 == 7) {
                context.startActivity(EditProfileActivity.a.a(EditProfileActivity.f46981h, context, str));
                return;
            }
            if (i15 == 8) {
                a0.r(context, ManageFamilyActivity.class);
                return;
            }
            if (i15 == 9) {
                a0.r(context, AllDogsActivity.class);
                return;
            }
            if (i15 == 10) {
                context.startActivity(AuthorizedViewersActivity.a.a(AuthorizedViewersActivity.f34974m, context));
                return;
            }
            if (i15 == 11) {
                a0.r(context, FollowMutedUsersActivity.class);
                return;
            }
            if (i15 == 12) {
                a0.r(context, FollowBlockedUsersActivity.class);
                return;
            }
            if (i15 != 13 && !m12.t.X.f115890g.contains(tVar)) {
                if (i15 == 14) {
                    DeviceBackupActivity.f42558c.getClass();
                    context.startActivity(new Intent(context, (Class<?>) DeviceBackupActivity.class));
                    return;
                } else {
                    EditProfileActivity.f46981h.getClass();
                    Intent intent = new Intent(context, (Class<?>) EditProfileActivity.class);
                    intent.putExtra("EXTRA_FOCUS", false);
                    context.startActivity(intent);
                    return;
                }
            }
            List<x> list = e.f32282a;
            switch (e.a.f32283a[tVar.ordinal()]) {
                case 1:
                    dVar = com.garmin.android.apps.connectmobile.consent.d.f32265g;
                    break;
                case 2:
                    dVar = com.garmin.android.apps.connectmobile.consent.d.f32266h;
                    break;
                case 3:
                    dVar = com.garmin.android.apps.connectmobile.consent.d.f32267i;
                    break;
                case 4:
                    dVar = com.garmin.android.apps.connectmobile.consent.d.f32268j;
                    break;
                case 5:
                    dVar = com.garmin.android.apps.connectmobile.consent.d.f32269k;
                    break;
                case 6:
                    dVar = com.garmin.android.apps.connectmobile.consent.d.f32270l;
                    break;
                case 7:
                    dVar = com.garmin.android.apps.connectmobile.consent.d.f32271m;
                    break;
                case 8:
                    dVar = com.garmin.android.apps.connectmobile.consent.d.f32272n;
                    break;
                case 9:
                    dVar = com.garmin.android.apps.connectmobile.consent.d.f32273o;
                    break;
                case 10:
                    dVar = com.garmin.android.apps.connectmobile.consent.d.f32274p;
                    break;
                default:
                    dVar = null;
                    break;
            }
            String str2 = dVar != null ? dVar.f32277a : null;
            DataConsentActivity.a aVar7 = DataConsentActivity.f32169h;
            hl.a.c cVar = hl.a.c.f84256b;
            aVar7.getClass();
            cVar.getClass();
            Intent intent2 = new Intent(context, (Class<?>) DataConsentActivity.class);
            intent2.putExtra("GCM_extra_screen_access_role", cVar);
            intent2.putExtra("extra_direct_consent_type", str2);
            context.startActivity(intent2);
            return;
        }
        if (bVar instanceof b.m) {
            p.a aVar8 = p.f167060a;
            o oVar2 = ((b.m) bVar).f39423d;
            aVar8.getClass();
            context.getClass();
            oVar2.getClass();
            if (oVar2 == o.f167035e) {
                WheelchairModeActivity.f44027a.getClass();
                context.startActivity(new Intent(context, (Class<?>) WheelchairModeActivity.class));
                return;
            }
            if (o.A.f167058d.contains(oVar2)) {
                WeatherLocationPreferenceActivity.f47895d.getClass();
                context.startActivity(new Intent(context, (Class<?>) WeatherLocationPreferenceActivity.class));
                return;
            }
            o oVar3 = o.f167040j;
            if (oVar2 == oVar3 || oVar3.f167057c.contains(oVar2)) {
                boolean z16 = oVar2 == o.f167036f;
                HydrationSettingsActivity.f36708c.getClass();
                Intent intent3 = new Intent(context, (Class<?>) HydrationSettingsActivity.class);
                intent3.putExtra("NAVIGATE_TO_GOAL", z16);
                context.startActivity(intent3);
                return;
            }
            o oVar4 = o.f167045o;
            if (oVar2 == oVar4 || oVar4.f167057c.contains(oVar2) || oVar2 == (oVar = o.f167046p) || oVar.f167057c.contains(oVar2)) {
                context.startActivity(MenstrualCycleSettingsActivity.a.a(MenstrualCycleSettingsActivity.f39030c, context, GCMSettingManager.s(), false, oVar2 == o.f167041k, oVar2 == o.f167042l, 8));
                return;
            }
            if (oVar2 == o.f167050v || oVar2 == o.f167051w) {
                p.a.a(context, "HomeSettingsScreen");
                return;
            }
            if (oVar2 == o.f167047q) {
                p.a.a(context, "WALKING");
                return;
            }
            if (oVar2 == o.f167048r) {
                p.a.a(context, "RUNNING");
                return;
            }
            if (oVar2 == o.f167049t) {
                p.a.a(context, "WHEELCHAIR_PUSHING");
                return;
            }
            int i16 = GCMUserSettingsActivity.f41539t;
            if (d1.f()) {
                d1.o(context, new v(12));
                return;
            } else {
                a0.r(context, GCMUserSettingsActivity.class);
                return;
            }
        }
        if (bVar instanceof b.g) {
            k.a aVar9 = k.f166978a;
            ty0.l lVar2 = ((b.g) bVar).f39412d;
            aVar9.getClass();
            context.getClass();
            lVar2.getClass();
            switch (k.a.C3141a.f166979a[lVar2.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                    NotificationSettingsActivity.f43568b.getClass();
                    Intent intent4 = new Intent(context, (Class<?>) NotificationSettingsActivity.class);
                    intent4.putExtra("VIEW_EMAIL_SETTINGS", true);
                    context.startActivity(intent4);
                    break;
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                    NotificationSettingsActivity.f43568b.getClass();
                    Intent intent5 = new Intent(context, (Class<?>) NotificationSettingsActivity.class);
                    intent5.putExtra("VIEW_PUSH_NOTIFICATION_SETTINGS", true);
                    intent5.putExtra("EXTRA_SCROLL_TO_ITEM", (Serializable) null);
                    context.startActivity(intent5);
                    break;
                case 62:
                    GNCSOptOutSettingsActivity.f35738a.getClass();
                    context.startActivity(new Intent(context, (Class<?>) GNCSOptOutSettingsActivity.class));
                    break;
            }
            return;
        }
        if (bVar instanceof b.C0704b) {
            k.f166978a.getClass();
            context.getClass();
            NotificationSettingsActivity.f43568b.getClass();
            Intent intent6 = new Intent(context, (Class<?>) NotificationSettingsActivity.class);
            intent6.putExtra("VIEW_PUSH_NOTIFICATION_SETTINGS", true);
            intent6.putExtra("EXTRA_SCROLL_TO_ITEM", (Serializable) null);
            context.startActivity(intent6);
            return;
        }
        if (bVar instanceof b.h) {
            lVar.invoke(ty0.b.f166882j2);
            return;
        }
        if (!(bVar instanceof b.c)) {
            u0.r();
            return;
        }
        f fVar = f.f166956a;
        ty0.e eVar = ((b.c) bVar).f39402d;
        fVar.getClass();
        context.getClass();
        eVar.getClass();
        int i17 = f.a.f166957a[eVar.ordinal()];
        if (i17 == 1) {
            FriendListActivity.a aVar10 = FriendListActivity.f35257b;
            p003ji0.k kVar = p003ji0.k.FOLLOWERS;
            aVar10.getClass();
            intentA = FriendListActivity.a.a(context, kVar);
        } else if (i17 == 2) {
            FriendListActivity.a aVar11 = FriendListActivity.f35257b;
            p003ji0.k kVar2 = p003ji0.k.FOLLOWING;
            aVar11.getClass();
            intentA = FriendListActivity.a.a(context, kVar2);
        } else if (i17 == 3) {
            FriendListActivity.a aVar12 = FriendListActivity.f35257b;
            p003ji0.k kVar3 = p003ji0.k.SUGGESTED;
            aVar12.getClass();
            intentA = FriendListActivity.a.a(context, kVar3);
        } else {
            if (i17 != 4) {
                u0.r();
                return;
            }
            FriendDiscoverActivity.a aVar13 = FriendDiscoverActivity.f35251b;
            p003ji0.j jVar = p003ji0.j.SEARCH;
            Boolean bool = Boolean.TRUE;
            aVar13.getClass();
            intentA = new Intent(context, (Class<?>) FriendDiscoverActivity.class);
            if (jVar != null) {
                intentA.putExtra("extra_initial_tab", jVar.ordinal());
                intentA.putExtra("extra_open_keyboard", bool);
            }
        }
        context.startActivity(intentA);
    }
}
