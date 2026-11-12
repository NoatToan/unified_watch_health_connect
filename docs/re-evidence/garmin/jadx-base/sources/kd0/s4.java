package kd0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.consent.CoachConsentActivity;
import com.garmin.android.apps.connectmobile.consent.ConsentActivity;
import com.garmin.android.apps.connectmobile.consent.DataConsentActivity;
import com.garmin.android.apps.connectmobile.consent.InsightsConsentActivity;
import com.garmin.android.apps.connectmobile.consent.PrivacyPolicyConsentActivity;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersActivity;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.LiveTrackActivity;
import com.garmin.android.apps.connectmobile.smartscale.ScaleInvitationDeclineActivity;
import com.garmin.android.apps.connectmobile.smartscale.ScaleInvitationGetStartedActivity;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTDashBoardActivity;
import com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.EventDetailsActivity;
import com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity;
import com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.ActivitiesPrivacySelectionActivity;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/s4;", "Ltz0/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s4 implements tz0.a {
    @Override // tz0.a
    public final Intent a(Context context) {
        return AuthorizedViewersActivity.a.a(AuthorizedViewersActivity.f34974m, context);
    }

    @Override // tz0.a
    public final void b() {
        ht.a aVar = ht.a.f85464a;
        Bundle bundle = new Bundle(1);
        bundle.putString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, "5.30.1");
        Unit unit = Unit.INSTANCE;
        aVar.getClass();
        ht.a.a(bundle, "PageViewNotification");
    }

    @Override // tz0.a
    public final void c(Context context) {
        androidx.room.a0.r(context, LiveTrackActivity.class);
    }

    @Override // tz0.a
    public final void d(Context context, long j8, boolean z14) {
        FBTProgressReportActivity.f45512b.getClass();
        FBTProgressReportActivity.a.a(context, j8, z14);
    }

    @Override // tz0.a
    public final void e(Context context) {
        ActivitiesPrivacySelectionActivity.a aVar = ActivitiesPrivacySelectionActivity.f47091b;
        hl.a.c cVar = hl.a.c.f84256b;
        aVar.getClass();
        cVar.getClass();
        Intent intent = new Intent(context, (Class<?>) ActivitiesPrivacySelectionActivity.class);
        intent.putExtra("GCM_extra_update_past_activities", true);
        intent.putExtra("GCM_extra_screen_access_role", cVar);
        context.startActivity(intent);
    }

    @Override // tz0.a
    public final void f(Context context, hl.a.b bVar) {
        context.startActivity(CoachConsentActivity.a.a(CoachConsentActivity.f32153p, context, bVar, 4));
    }

    @Override // tz0.a
    public final Intent g(Context context, String str, String str2) {
        UserProfileActivity.f46494x.getClass();
        return UserProfileActivity.a.b(context, str, str2, null);
    }

    @Override // tz0.a
    public final void h(Context context) {
        Intent intent = new Intent(context, (Class<?>) InsightsConsentActivity.class);
        intent.putExtra("extra_insights_redirect", 1);
        context.startActivity(intent);
    }

    @Override // tz0.a
    public final void i(com.garmin.android.apps.connectmobile.c cVar, Bundle bundle) {
        Intent intentPutExtras = new Intent(cVar, (Class<?>) ScaleInvitationDeclineActivity.class).putExtras(bundle);
        intentPutExtras.getClass();
        cVar.startActivity(intentPutExtras);
    }

    @Override // tz0.a
    public final void j(Context context, hl.a.b bVar, q92.x xVar) {
        xVar.getClass();
        PrivacyPolicyConsentActivity.f32218d.getClass();
        context.startActivity(PrivacyPolicyConsentActivity.a.a(context, bVar, xVar, false));
    }

    @Override // tz0.a
    public final void k(Context context, com.garmin.android.apps.connectmobile.smartscale.model.b bVar) {
        Intent intentPutExtras = new Intent(context, (Class<?>) ScaleInvitationDeclineActivity.class).putExtras(h7.c.a(new o13.p("GCM_extra_device_invite", bVar)));
        intentPutExtras.getClass();
        context.startActivity(intentPutExtras);
    }

    @Override // tz0.a
    public final void l(Context context, hl.a.b bVar) {
        LiveTrackActivity.a aVar = LiveTrackActivity.f38637g;
        bv0.a.q qVar = bv0.a.q.INSTANCE;
        aVar.getClass();
        context.startActivity(LiveTrackActivity.a.a(context, qVar, bVar));
    }

    @Override // tz0.a
    public final sz0.h0 m() {
        return new sz0.h0((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null));
    }

    @Override // tz0.a
    public final void n(Context context, hl.a.b bVar, q92.x xVar) {
        Context context2;
        Intent intentB;
        xVar.getClass();
        if (xVar == q92.x.DI_CONNECT_ADAPTIVE_TRAINING_PLAN) {
            intentB = CoachConsentActivity.a.a(CoachConsentActivity.f32153p, context, bVar, 4);
            context2 = context;
        } else {
            context2 = context;
            intentB = ConsentActivity.a.b(ConsentActivity.f32155r, context2, xVar, false, bVar, 8);
        }
        context2.startActivity(intentB);
    }

    @Override // tz0.a
    public final void o(Context context, long j8, String str) {
        str.getClass();
        FBTDashBoardActivity.f45458n.getClass();
        FBTDashBoardActivity.a.b(context, j8, str);
    }

    @Override // tz0.a
    public final void p(Context context, String str) {
        GearActivity.a aVar = GearActivity.f35500b;
        rk0.f0 f0Var = new rk0.f0(str, (i53.c) null, (c80.u) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (b63.o) null, (b63.o) null, (c80.w) null, (i53.c) null, (b63.o) null, (Double) null, (Long) null, (Long) null, (Double) null, (Integer) null, (Long) null, (i53.d) null, (i53.c) null, 2097150, (p005kotlin.jvm.internal.j) null);
        aVar.getClass();
        Intent intent = new Intent(context, (Class<?>) GearActivity.class);
        intent.putExtra("StartDestinationKey", new GearRoute.i(f0Var, null));
        context.startActivity(intent);
    }

    @Override // tz0.a
    public final void q(Context context, String str) {
        EventDetailsActivity.a.d(EventDetailsActivity.f45692o, context, null, str);
    }

    @Override // tz0.a
    public final void r(com.garmin.android.apps.connectmobile.c cVar, Bundle bundle) {
        Intent intentPutExtras = new Intent(cVar, (Class<?>) ScaleInvitationGetStartedActivity.class).putExtras(bundle);
        intentPutExtras.getClass();
        cVar.startActivity(intentPutExtras);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tz0.a
    public final void s(Context context, com.garmin.android.apps.connectmobile.smartscale.model.b bVar) {
        String invitorName = bVar.getInvitorName();
        if (invitorName == null || invitorName.length() == 0) {
            invitorName = bVar.getInvitorDisplayName();
        }
        if (invitorName == null || invitorName.length() == 0) {
            context.getString(R.string.no_value);
        }
        Bundle bundleA = h7.c.a(new o13.p("GCM_extra_device_invite", bVar));
        sz0.j jVar = context instanceof sz0.j ? (sz0.j) context : null;
        if (jVar != null) {
            jVar.n4(bundleA);
        }
    }

    @Override // tz0.a
    public final void t(Context context) {
        androidx.room.a0.r(context, ActiveTrainingPlansActivity.class);
    }

    @Override // tz0.a
    public final void u(Context context, hl.a aVar) {
        aVar.getClass();
        DataConsentActivity.f32169h.getClass();
        context.startActivity(DataConsentActivity.a.a(context, aVar));
    }
}
