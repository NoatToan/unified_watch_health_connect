package js0;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import androidx.media3.common.g0;
import c22.l2;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.stats.intervals.IntervalsExpandableListView;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQDownloadListActivity;
import com.garmin.android.apps.connectmobile.connectiq.l;
import com.garmin.android.apps.connectmobile.follow.domain.InviteFriendsActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.TripFlightFragment;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.TripReviewFragment;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.AdHocChallengePlayersActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.k;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO;
import com.garmin.android.apps.connectmobile.onboarding.education.OnboardingEducationalActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fr945.FR945AppearanceActivity;
import com.garmin.android.apps.connectmobile.settings.devices.index.ManagePeopleActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.schedule.ScheduleWorkoutTypeActivity;
import com.garmin.android.lib.legal.LegalGatewayActivity;
import com.garmin.android.lib.legal.LegalLocalesFragment;
import fe2.z;
import hb2.i;
import java.util.ArrayList;
import lo.t;
import lo.u;
import ls0.c0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import z10.i3;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f100620b;

    public /* synthetic */ d(Object obj, int i14) {
        this.f100619a = i14;
        this.f100620b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f100619a;
        int i15 = 0;
        Object obj = this.f100620b;
        switch (i14) {
            case 0:
                ((e) obj).f100624d.invoke();
                return;
            case 1:
                LinearLayout linearLayout = ((k20.d) obj).f102436f;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                    return;
                } else {
                    s.m("bannerLayout");
                    throw null;
                }
            case 2:
                ((tr2.g) obj).invoke();
                return;
            case 3:
                ((z) obj).invoke();
                return;
            case 4:
                androidx.media3.ui.c cVar = (androidx.media3.ui.c) obj;
                cVar.k(!cVar.f10052h1);
                return;
            case 5:
                androidx.media3.ui.c cVar2 = androidx.media3.ui.c.this;
                androidx.media3.common.z zVar = cVar2.f10048f1;
                if (zVar == null || !zVar.isCommandAvailable(29)) {
                    return;
                }
                g0 trackSelectionParameters = cVar2.f10048f1.getTrackSelectionParameters();
                androidx.media3.common.z zVar2 = cVar2.f10048f1;
                int i16 = fa.z.f70071a;
                zVar2.c(trackSelectionParameters.a().b(1).j(1).a());
                cVar2.f10047f.f10095b[1] = cVar2.getResources().getString(R.string.exo_track_selection_auto);
                cVar2.f10057k.dismiss();
                return;
            case 6:
                androidx.media3.ui.c.g gVar = (androidx.media3.ui.c.g) obj;
                androidx.media3.ui.c cVar3 = androidx.media3.ui.c.this;
                int bindingAdapterPosition = gVar.getBindingAdapterPosition();
                View view3 = cVar3.B;
                if (bindingAdapterPosition == 0) {
                    androidx.media3.ui.c.e eVar = cVar3.f10049g;
                    view3.getClass();
                    cVar3.d(eVar, view3);
                    return;
                } else {
                    if (bindingAdapterPosition != 1) {
                        cVar3.f10057k.dismiss();
                        return;
                    }
                    androidx.media3.ui.c.b bVar = cVar3.f10053i;
                    view3.getClass();
                    cVar3.d(bVar, view3);
                    return;
                }
            case 7:
                androidx.media3.ui.c cVar4 = androidx.media3.ui.c.this;
                androidx.media3.common.z zVar3 = cVar4.f10048f1;
                if (zVar3 == null || !zVar3.isCommandAvailable(29)) {
                    return;
                }
                cVar4.f10048f1.c(cVar4.f10048f1.getTrackSelectionParameters().a().b(3).e().g().i().a());
                cVar4.f10057k.dismiss();
                return;
            case 8:
                kc.f fVar = (kc.f) obj;
                fVar.g();
                if (view2.getId() == R.id.exo_overflow_show) {
                    fVar.f103869q.start();
                    return;
                } else {
                    if (view2.getId() == R.id.exo_overflow_hide) {
                        fVar.f103870r.start();
                        return;
                    }
                    return;
                }
            case 9:
                FR945AppearanceActivity fR945AppearanceActivity = (FR945AppearanceActivity) obj;
                int i17 = FR945AppearanceActivity.f43019d;
                if (fR945AppearanceActivity.ca()) {
                    ConnectIQDownloadListActivity.a aVar = ConnectIQDownloadListActivity.f31779o;
                    long j8 = fR945AppearanceActivity.f32112b;
                    l lVar = l.WATCH_FACES;
                    aVar.getClass();
                    ConnectIQDownloadListActivity.a.a(fR945AppearanceActivity, j8, lVar);
                    return;
                }
                return;
            case 10:
                ((kp2.b) obj).f106016d.c(kp2.b.c.a.f106025a);
                return;
            case 11:
                OnboardingEducationalActivity onboardingEducationalActivity = (OnboardingEducationalActivity) obj;
                com.garmin.android.apps.connectmobile.onboarding.education.a.c cVar5 = onboardingEducationalActivity.f39691b;
                onboardingEducationalActivity.x4(cVar5 != null ? cVar5.f39704c : null);
                return;
            case 12:
                LegalGatewayActivity legalGatewayActivity = (LegalGatewayActivity) obj;
                View view4 = legalGatewayActivity.f49929a;
                if (view4 == null) {
                    s.m("legalLocaleContainer");
                    throw null;
                }
                view4.setVisibility(8);
                v supportFragmentManager = legalGatewayActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                LegalLocalesFragment.f49949b.getClass();
                aVar2.l(R.id.legal_frag_container, new LegalLocalesFragment(), "LegalLocalesFragment");
                aVar2.s(true, true);
                legalGatewayActivity.f49938j = "LegalLocalesFragment";
                return;
            case 13:
                Object tag = view2.getTag();
                tag.getClass();
                com.garmin.android.lib.legal.d dVar = (com.garmin.android.lib.legal.d) tag;
                LegalLocalesFragment.b bVar2 = ((com.garmin.android.lib.legal.e) obj).f50056a;
                if (bVar2 != null) {
                    bVar2.t1(dVar);
                    return;
                }
                return;
            case 14:
                t tVar = (t) obj;
                LegalGatewayActivity.a aVar3 = LegalGatewayActivity.f49928n;
                m mVarRequireActivity = tVar.requireActivity();
                lc2.a aVar4 = lc2.a.GARMIN_CONNECT_PRIVACY_POLICY;
                boolean zF = ((f12.b) KoinJavaComponent.get(f12.b.class)).f();
                String string = tVar.getString(R.string.txt_privacy_policy);
                aVar3.getClass();
                LegalGatewayActivity.a.a(mVarRequireActivity, 100, aVar4, zF, false, null, false, string);
                return;
            case 15:
                u uVar = (u) obj;
                int i18 = u.f113960f;
                u.a aVar5 = (u.a) view2.getTag();
                int i19 = uVar.f113963c;
                int i24 = aVar5.f113971f;
                uVar.f113963c = i19 != i24 ? i24 : -1;
                uVar.notifyDataSetChanged();
                return;
            case 16:
                lq.e eVar2 = (lq.e) obj;
                ViewSwitcher viewSwitcher = eVar2.f114290h;
                if (viewSwitcher == null) {
                    s.m("mExpandCollapseBtn");
                    throw null;
                }
                int displayedChild = viewSwitcher.getDisplayedChild();
                IntervalsExpandableListView intervalsExpandableListView = eVar2.f114284b;
                if (displayedChild == 1) {
                    int groupCount = intervalsExpandableListView.getExpandableListAdapter().getGroupCount();
                    while (i15 < groupCount) {
                        intervalsExpandableListView.expandGroup(i15);
                        i15++;
                    }
                    return;
                }
                int groupCount2 = intervalsExpandableListView.getExpandableListAdapter().getGroupCount();
                while (i15 < groupCount2) {
                    intervalsExpandableListView.collapseGroup(i15);
                    i15++;
                }
                return;
            case 17:
                com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.a.C0664a c0664a = com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.a.f37094a;
                ((com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.a) obj).dismiss();
                return;
            case 18:
                int i25 = TripFlightFragment.f37039n;
                ((ll0.a) obj).invoke();
                return;
            case 19:
                TripReviewFragment tripReviewFragment = (TripReviewFragment) obj;
                TripReviewFragment.v6(tripReviewFragment, null, 1);
                com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e eVarU6 = tripReviewFragment.u6();
                w9.a aVarA = v1.a(eVarU6);
                x53.c cVar6 = s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new c0(eVarU6, null), 2);
                return;
            case 20:
                lv.d dVar2 = (lv.d) obj;
                StringBuilder sb3 = new StringBuilder();
                for (EditText editText : dVar2.f115035f) {
                    if (TextUtils.isEmpty(editText.getText())) {
                        sb3 = new StringBuilder("invalid");
                    } else {
                        sb3.append(editText.getText().toString().trim());
                    }
                }
                try {
                    long j14 = Long.parseLong(sb3.toString());
                    if (j14 <= 0 || j14 > 1048575) {
                        dVar2.w6();
                        return;
                    } else if (j14 != dVar2.f115034e) {
                        dVar2.f115031b.T7(j14);
                        return;
                    } else {
                        new androidx.appcompat.app.e.a(dVar2.getContext()).setMessage(dVar2.getString(R.string.msg_add_right_pedal_id)).setTitle(dVar2.getString(R.string.lbl_enter_right_pedal_id)).setCancelable(true).setPositiveButton(dVar2.getString(android.R.string.ok), new jm0.c(20)).create().show();
                        return;
                    }
                } catch (NumberFormatException unused) {
                    dVar2.w6();
                    return;
                }
            case 21:
                m40.g.a aVar6 = m40.g.f116591h;
                ((as2.d) obj).invoke(Boolean.TRUE);
                return;
            case 22:
                ScheduleWorkoutTypeActivity scheduleWorkoutTypeActivity = (ScheduleWorkoutTypeActivity) obj;
                int i26 = ScheduleWorkoutTypeActivity.f49542g;
                scheduleWorkoutTypeActivity.invalidateOptionsMenu();
                scheduleWorkoutTypeActivity.f49547e.toggle();
                if (scheduleWorkoutTypeActivity.f49547e.isChecked()) {
                    m62.g gVar2 = scheduleWorkoutTypeActivity.f49546d;
                    gVar2.f116908c = -1;
                    gVar2.notifyDataSetChanged();
                    return;
                }
                return;
            case 23:
                ManagePeopleActivity managePeopleActivity = (ManagePeopleActivity) obj;
                ManagePeopleActivity.a aVar7 = ManagePeopleActivity.f43042n;
                if (i.a(managePeopleActivity)) {
                    if (!s3.b()) {
                        com.garmin.android.apps.connectmobile.settings.devices.index.b bVar3 = managePeopleActivity.f43048f;
                        if (bVar3 == null) {
                            s.m("connectedUsersAdapter");
                            throw null;
                        }
                        bVar3.f43069e = false;
                        bVar3.notifyItemRangeChanged(0, bVar3.f43066b.size(), Boolean.FALSE);
                        InviteFriendsActivity.a aVar8 = InviteFriendsActivity.f35263d;
                        long j15 = managePeopleActivity.f43045c;
                        String str = managePeopleActivity.f43046d;
                        aVar8.getClass();
                        Intent intent = new Intent(managePeopleActivity, (Class<?>) InviteFriendsActivity.class);
                        intent.putExtra("GCM_deviceUnitID", j15);
                        intent.putExtra("GCM_deviceDisplayName", str);
                        managePeopleActivity.startActivity(intent);
                        return;
                    }
                    if (!managePeopleActivity.da().f186249h) {
                        new androidx.appcompat.app.e.a(managePeopleActivity).setTitle(managePeopleActivity.getString(R.string.lbl_unable_to_invite_more_people)).setMessage(managePeopleActivity.getString(R.string.msg_unable_to_invite_more_people)).setPositiveButton(R.string.lbl_ok, new jm0.c(25)).setCancelable(false).create().show();
                        return;
                    }
                    com.garmin.android.apps.connectmobile.settings.devices.index.b bVar4 = managePeopleActivity.f43048f;
                    if (bVar4 == null) {
                        s.m("connectedUsersAdapter");
                        throw null;
                    }
                    bVar4.f43069e = false;
                    bVar4.notifyItemRangeChanged(0, bVar4.f43066b.size(), Boolean.FALSE);
                    InviteFriendsActivity.a aVar9 = InviteFriendsActivity.f35263d;
                    long j16 = managePeopleActivity.f43045c;
                    String str2 = managePeopleActivity.f43046d;
                    aVar9.getClass();
                    Intent intent2 = new Intent(managePeopleActivity, (Class<?>) InviteFriendsActivity.class);
                    intent2.putExtra("GCM_deviceUnitID", j16);
                    intent2.putExtra("GCM_deviceDisplayName", str2);
                    managePeopleActivity.startActivity(intent2);
                    return;
                }
                return;
            case 24:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.d dVar3 = (com.garmin.android.apps.connectmobile.leaderboard.challenges.d) obj;
                com.garmin.android.apps.connectmobile.leaderboard.model.u uVar2 = dVar3.f37404c;
                if (uVar2 != null) {
                    zt0.a aVar10 = (zt0.a) dVar3.f37402a.getValue();
                    boolean z14 = dVar3.f37405d;
                    if (uVar2 == com.garmin.android.apps.connectmobile.leaderboard.model.u.UNKNOWN) {
                        return;
                    }
                    aVar10.f206936g = uVar2;
                    AdHocChallengeDTO adHocChallengeDTO = aVar10.f206931b;
                    adHocChallengeDTO.f37994h = null;
                    adHocChallengeDTO.f37995i = null;
                    if (uVar2 == com.garmin.android.apps.connectmobile.leaderboard.model.u.MONTH) {
                        aVar10.f206942m.j(new zt0.a.b(z14, true));
                        return;
                    } else {
                        aVar10.f206935f = null;
                        aVar10.f206938i.j(new zt0.a.b(z14, true));
                        return;
                    }
                }
                return;
            case 25:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.e eVar3 = (com.garmin.android.apps.connectmobile.leaderboard.challenges.e) obj;
                int i27 = com.garmin.android.apps.connectmobile.leaderboard.challenges.e.f37435g;
                AdHocChallengePlayersActivity.a aVar11 = AdHocChallengePlayersActivity.f37175a;
                Context context = eVar3.getContext();
                AdHocChallengeDTO adHocChallengeDTO2 = eVar3.f37436a;
                AdHocChallengePlayersActivity.b bVar5 = AdHocChallengePlayersActivity.b.FULL_LEADERBOARD;
                aVar11.getClass();
                bVar5.getClass();
                if (context != null) {
                    context.startActivity(AdHocChallengePlayersActivity.a.a(context, adHocChallengeDTO2, bVar5));
                    return;
                }
                return;
            case 26:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.f fVar2 = (com.garmin.android.apps.connectmobile.leaderboard.challenges.f) obj;
                if (!fVar2.P0.c()) {
                    new com.garmin.android.apps.connectmobile.leaderboard.challenges.f.b(fVar2).c(new Void[0]);
                }
                fVar2.S6();
                View view5 = fVar2.J0;
                if (view5 != null) {
                    view5.setEnabled(false);
                    return;
                } else {
                    s.m("mSyncNowButton");
                    throw null;
                }
            case 27:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.g gVar3 = (com.garmin.android.apps.connectmobile.leaderboard.challenges.g) obj;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.g.a aVar12 = com.garmin.android.apps.connectmobile.leaderboard.challenges.g.f37528r;
                zt0.a aVarV6 = gVar3.v6();
                ArrayList arrayListU6 = gVar3.u6();
                boolean z15 = gVar3.f37536h;
                aVarV6.y4(arrayListU6);
                if (!z15) {
                    aVarV6.f206939j.j(Boolean.FALSE);
                    return;
                }
                i2.a aVar13 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar13.getClass();
                i2.a.a(a2Var, "isFromConfirmPage");
                l2<Unit> l2Var = aVarV6.f206941l;
                l2Var.getClass();
                l2Var.m(Unit.INSTANCE);
                return;
            case 28:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.i.b bVar6 = com.garmin.android.apps.connectmobile.leaderboard.challenges.i.f37586j;
                ((com.garmin.android.apps.connectmobile.leaderboard.challenges.i) obj).v6();
                return;
            default:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.b bVar7 = ((k) obj).M0;
                if (bVar7 != null) {
                    i3 i3Var = (i3) bVar7.f37323a.getValue();
                    Context contextRequireContext = bVar7.requireContext();
                    contextRequireContext.getClass();
                    i3Var.x4(contextRequireContext, false, new mh1.i(bVar7, 5));
                    return;
                }
                return;
        }
    }
}
