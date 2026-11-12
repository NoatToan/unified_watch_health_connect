package com.garmin.android.apps.connectmobile;

import android.app.PendingIntent;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.activities.history.presentation.ActivitiesListActivity;
import com.garmin.android.apps.connectmobile.activities.manual.ActivitiesCreateManualActivity;
import com.garmin.android.apps.connectmobile.badges.redesign.BadgeDetailsActivity;
import com.garmin.android.apps.connectmobile.badges.redesign.BadgesActivity;
import com.garmin.android.apps.connectmobile.bodybattery.presentation.BodyBatteryReportsActivity;
import com.garmin.android.apps.connectmobile.calendar.presentation.GCMCalendarActivity;
import com.garmin.android.apps.connectmobile.connectiq.requests.oauth.browser.ExternalBrowserAuthResponseActivity;
import com.garmin.android.apps.connectmobile.consent.CoachConsentActivity;
import com.garmin.android.apps.connectmobile.consent.ConsentActivity;
import com.garmin.android.apps.connectmobile.consent.DataStorageConsentActivity;
import com.garmin.android.apps.connectmobile.consent.ProductImprovementConsentActivity;
import com.garmin.android.apps.connectmobile.courses.create.CourseTypeActivity;
import com.garmin.android.apps.connectmobile.device.setup.DeviceSetupActivity;
import com.garmin.android.apps.connectmobile.devices.DeviceDetailsActivity;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.ManageFamilyActivity;
import com.garmin.android.apps.connectmobile.floors.presentation.FloorsActivity;
import com.garmin.android.apps.connectmobile.follow.domain.FollowRequestActivity;
import com.garmin.android.apps.connectmobile.follow.domain.FriendListActivity;
import com.garmin.android.apps.connectmobile.follow.domain.OthersFriendListActivity;
import com.garmin.android.apps.connectmobile.garminpayfeature.GarminPayLaunchScreenActivity;
import com.garmin.android.apps.connectmobile.gncs.GNCSOptOutSettingsActivity;
import com.garmin.android.apps.connectmobile.healthstatus.presentation.HealthStatusActivity;
import com.garmin.android.apps.connectmobile.intensityminutes.presentation.IntensityMinutesReportsActivity;
import com.garmin.android.apps.connectmobile.leaderboard.LeaderboardActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.AdHocChallengeDetailsActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.BadgeChallengeDetailsActivity;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.LiveTrackActivity;
import com.garmin.android.apps.connectmobile.onboarding.komoot.KomootConsentActivity;
import com.garmin.android.apps.connectmobile.overnighthrv.OvernightHrvActivity;
import com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusSummaryActivity;
import com.garmin.android.apps.connectmobile.performance.trainingload.TrainingLoadActivity;
import com.garmin.android.apps.connectmobile.settings.GCMDumpAppLogActivity;
import com.garmin.android.apps.connectmobile.settings.devices.backup.DeviceBackupActivity;
import com.garmin.android.apps.connectmobile.settings.notifications.NotificationSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.PrimaryDeviceActivity;
import com.garmin.android.apps.connectmobile.settings.thirdparty.GCMSettingsThirdPartyAppsActivity;
import com.garmin.android.apps.connectmobile.settings.thirdparty.details.ThirdPartyConnectActivity;
import com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsActivity;
import com.garmin.android.apps.connectmobile.steps.presentation.StepsActivity;
import com.garmin.android.apps.connectmobile.strava.StravaConfigActivity;
import com.garmin.android.apps.connectmobile.stress.presentation.view.StressReportsActivity;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.TrainingInitiativeEventActivity;
import com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity;
import com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsActivity;
import com.garmin.android.apps.connectmobile.wheelchair.presentation.PushesActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutCreateActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutPreCreateActivity;
import com.garmin.android.livesessionview.LiveActivityActivity;
import com.garmin.subscriptions.ui.InAppPurchaseTwaActivity;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/GCMCommonDeepLinkHandler;", "Li/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GCMCommonDeepLinkHandler extends i.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f28664a = 0;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28665a;

        static {
            int[] iArr = new int[t10.n.values().length];
            try {
                iArr[t10.n.CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t10.n.EDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t10.n.VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t10.n.FIND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f28665a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.GCMCommonDeepLinkHandler$navigateToChildAccountConsent$1", f = "GCMCommonDeepLinkHandler.kt", l = {989}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f28666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f28667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28668c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Uri f28669d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ GCMCommonDeepLinkHandler f28670e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Uri uri, GCMCommonDeepLinkHandler gCMCommonDeepLinkHandler, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f28669d = uri;
            this.f28670e = gCMCommonDeepLinkHandler;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f28669d, this.f28670e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            String lastPathSegment;
            String str;
            String strA1;
            com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f28668c;
            GCMCommonDeepLinkHandler gCMCommonDeepLinkHandler = this.f28670e;
            if (i14 == 0) {
                o13.r.b(obj);
                Uri uri = this.f28669d;
                lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment == null) {
                    lastPathSegment = "";
                }
                String queryParameter = uri.getQueryParameter("consentType");
                this.f28666a = lastPathSegment;
                this.f28667b = queryParameter;
                this.f28668c = 1;
                int i15 = GCMCommonDeepLinkHandler.f28664a;
                gCMCommonDeepLinkHandler.getClass();
                x53.c cVar = o53.s0.f129406a;
                Object objE0 = ge1.b.e0(x53.b.f189152a, new j1(lastPathSegment, null), this);
                if (objE0 == aVar) {
                    return aVar;
                }
                str = queryParameter;
                obj = objE0;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = this.f28667b;
                lastPathSegment = this.f28666a;
                o13.r.b(obj);
            }
            ue0.l lVar = (ue0.l) obj;
            if (lVar == null) {
                int i16 = GCMCommonDeepLinkHandler.f28664a;
                gCMCommonDeepLinkHandler.W9();
                gCMCommonDeepLinkHandler.finish();
                return Unit.INSTANCE;
            }
            long j8 = Long.parseLong(lastPathSegment);
            String name = lVar.getName();
            com.garmin.android.apps.connectmobile.userprofile.model.l lVar2 = lVar.f170208m;
            if (lVar2 == null || (profileImageUrls = lVar2.getProfileImageUrls()) == null || (strA1 = profileImageUrls.f46879h) == null) {
                strA1 = lVar.A1();
            }
            hl.a.b bVar = new hl.a.b(j8, name, strA1, null, 8, null);
            if (str != null) {
                switch (str.hashCode()) {
                    case -1709024396:
                        if (str.equals("DI_CONNECT_ADAPTIVE_TRAINING_PLAN")) {
                            CoachConsentActivity.f32153p.getClass();
                            gCMCommonDeepLinkHandler.getClass();
                            Intent intent = new Intent(gCMCommonDeepLinkHandler, (Class<?>) CoachConsentActivity.class);
                            intent.putExtra("GCM_extra_screen_access_role", bVar);
                            intent.putExtra("extra_creation_consent_flow", false);
                            gCMCommonDeepLinkHandler.startActivity(intent);
                        }
                        break;
                    case -1139160752:
                        if (str.equals("DI_CONNECT_LIVETRACK")) {
                            ConsentActivity.a aVar2 = ConsentActivity.f32155r;
                            q92.x xVar = q92.x.DI_CONNECT_LIVETRACK;
                            aVar2.getClass();
                            ConsentActivity.a.c(gCMCommonDeepLinkHandler, bVar, xVar, false);
                        }
                        break;
                    case 1617521748:
                        if (str.equals("DI_CONNECT_PRODUCT_IMPROVEMENT_DATA_USAGE")) {
                            ProductImprovementConsentActivity.f32230h.getClass();
                            gCMCommonDeepLinkHandler.getClass();
                            Intent intent2 = new Intent(gCMCommonDeepLinkHandler, (Class<?>) ProductImprovementConsentActivity.class);
                            intent2.putExtra("GCM_extra_screen_access_role", bVar);
                            gCMCommonDeepLinkHandler.startActivity(intent2);
                        }
                        break;
                    case 1722149930:
                        if (str.equals("DI_CONNECT_INSIGHTS")) {
                            ConsentActivity.a aVar3 = ConsentActivity.f32155r;
                            q92.x xVar2 = q92.x.DI_CONNECT_INSIGHTS;
                            aVar3.getClass();
                            ConsentActivity.a.c(gCMCommonDeepLinkHandler, bVar, xVar2, false);
                        }
                        break;
                    case 2014023184:
                        if (str.equals("DI_CONNECT_UPLOAD")) {
                            DataStorageConsentActivity.f32194t.getClass();
                            DataStorageConsentActivity.a.b(gCMCommonDeepLinkHandler, false, false, bVar);
                        }
                        break;
                }
            }
            gCMCommonDeepLinkHandler.finish();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.GCMCommonDeepLinkHandler$onCreate$2", f = "GCMCommonDeepLinkHandler.kt", l = {249}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f28671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f28672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Uri f28673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ GCMCommonDeepLinkHandler f28674d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Uri uri, GCMCommonDeepLinkHandler gCMCommonDeepLinkHandler, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f28673c = uri;
            this.f28674d = gCMCommonDeepLinkHandler;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = new d(this.f28673c, this.f28674d, dVar);
            dVar2.f28672b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            o53.b0 b0Var = (o53.b0) this.f28672b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f28671a;
            Uri uri = this.f28673c;
            if (i14 == 0) {
                o13.r.b(obj);
                xx2.d dVar = xx2.d.f192590a;
                this.f28672b = b0Var;
                this.f28671a = 1;
                dVar.getClass();
                obj = ge1.b.e0(o53.s0.f129406a, new xx2.c(uri, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                String strJ = am.j.j(uri, "Handle incoming URI in MPF. ");
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "GCMDeepLinkHandler", strJ);
                xx2.d.f192590a.getClass();
                if (xx2.d.f192594e.get()) {
                    GCMCommonDeepLinkHandler gCMCommonDeepLinkHandler = this.f28674d;
                    gCMCommonDeepLinkHandler.getClass();
                    InAppPurchaseTwaActivity.f52748r.getClass();
                    Intent intent = new Intent(gCMCommonDeepLinkHandler, (Class<?>) InAppPurchaseTwaActivity.class);
                    intent.setData(uri);
                    intent.addFlags(603979776);
                    gCMCommonDeepLinkHandler.startActivity(intent);
                } else {
                    ((cy2.i) KoinJavaComponent.get$default(cy2.i.class, null, null, 6, null)).m3(uri);
                }
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public final void O9(String str) {
        String strDecode;
        Intent intentA;
        eo2.d.f64794a.getClass();
        try {
            strDecode = URLDecoder.decode(str, "UTF-8");
            strDecode.getClass();
        } catch (UnsupportedEncodingException e4) {
            com.airbnb.lottie.animation.keyframe.a.A("getDecodedUri: ", e4.getLocalizedMessage(), eo2.d.f64795b);
            strDecode = str;
        }
        eo2.d.f64794a.getClass();
        eo2.d.a();
        if (S9()) {
            eo2.d.f64798e.set(strDecode);
            W9();
            return;
        }
        eo2.d.d(strDecode, str);
        if (d53.w.z(str, "/payment/missingPaymentInfo", false)) {
            GarminPayLaunchScreenActivity.a aVar = GarminPayLaunchScreenActivity.f35305d;
            kj0.a.f fVar = kj0.a.f.f104939a;
            aVar.getClass();
            intentA = GarminPayLaunchScreenActivity.a.a(this, fVar);
        } else {
            GarminPayLaunchScreenActivity.a aVar2 = GarminPayLaunchScreenActivity.f35305d;
            kj0.a.b bVar = kj0.a.b.f104932a;
            aVar2.getClass();
            intentA = GarminPayLaunchScreenActivity.a.a(this, bVar);
        }
        startActivity(intentA);
    }

    public final void P9(Uri uri) {
        c80.q qVarA;
        zk.a aVar = new zk.a("DEEP_LINK", p13.w.c(new zk.e("deepLinkEvent", p13.t0.b(new o13.p("url", uri.toString())))), false, 0L, 12, null);
        zk.c cVar = zk.c.f205034a;
        List listC = p13.w.c("GCS");
        cVar.getClass();
        new zk.d(cVar, null, listC).a(aVar);
        if (S9()) {
            W9();
            return;
        }
        try {
            String queryParameter = uri.getQueryParameter("promotedFeature");
            if (queryParameter != null) {
                c80.q.f25532b.getClass();
                qVarA = c80.q.a.a(queryParameter);
            } else {
                qVarA = null;
            }
        } catch (Exception e4) {
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "Error when parsing promotedFeature for initGCPHomeActivity(): ");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "GCMDeepLinkHandler", strD);
        }
        startActivity(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(this, qVarA, true));
    }

    public final void Q9(String str) {
        if (S9()) {
            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51201l.set(str);
            W9();
        } else {
            GarminPayLaunchScreenActivity.a aVar = GarminPayLaunchScreenActivity.f35305d;
            io2.d.f94618i.getClass();
            kj0.a.e eVar = new kj0.a.e(h7.c.a(new o13.p("extra.deep.link.data", io2.d.a.a(str))));
            aVar.getClass();
            startActivity(GarminPayLaunchScreenActivity.a.a(this, eVar));
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    public final boolean R9(Uri uri) {
        String string;
        String strJ = am.j.j(uri, "isAllowedForCourseCreation: ");
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "GCMDeepLinkHandler", strJ);
        Cursor cursorQuery = getContentResolver().query(uri, null, null, null, null);
        try {
            Cursor cursor = cursorQuery;
            if (cursor == null || !cursor.moveToFirst()) {
                string = null;
            } else {
                int columnIndex = cursor.getColumnIndex("_display_name");
                Integer numValueOf = Integer.valueOf(columnIndex);
                if (columnIndex == -1) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    string = cursor.getString(numValueOf.intValue());
                } else {
                    string = null;
                }
            }
            jg.b.l(cursorQuery, null);
            i2.a.b(a2Var, "GCMDeepLinkHandler", "getContentDisplayName: " + string);
            if (string == null) {
                string = uri.toString();
                string.getClass();
            }
            return new d53.k(".*\\.(gpx|fit)", d53.l.IGNORE_CASE).d(string);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                jg.b.l(cursorQuery, th3);
                throw th4;
            }
        }
    }

    public final boolean S9() {
        return (getIntent().getFlags() & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 1048576;
    }

    public final void T9(String str) {
        if (!k1.f37122a.O()) {
            com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
            com.garmin.android.apps.connectmobile.navigation.b.a.c(this, null, 268468224);
        } else {
            ManageFamilyActivity.f35178j.getClass();
            Intent intent = new Intent(this, (Class<?>) ManageFamilyActivity.class);
            intent.putExtra("extraRequestId", str);
            startActivity(intent);
        }
    }

    public final void U9(Uri uri) {
        if (!k1.f37122a.r()) {
            W9();
            finish();
        } else {
            setContentView(R.layout.gcm3_content_frame);
            findViewById(R.id.content_frame_progress_overlay).setVisibility(0);
            x53.c cVar = o53.s0.f129406a;
            ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new c(uri, this, null), 3);
        }
    }

    public final void V9(Intent intent) {
        Intent intent2 = new Intent(intent);
        intent2.setClass(this, CourseTypeActivity.class);
        intent2.setAction(null);
        z6.h0 h0VarE = z6.h0.e(this);
        h0VarE.d(CourseTypeActivity.class);
        h0VarE.a(intent2);
        PendingIntent pendingIntentF = h0VarE.f();
        if (pendingIntentF != null) {
            try {
                pendingIntentF.send();
            } catch (PendingIntent.CanceledException unused) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "GCMDeepLinkHandler", "Unknown launch URI");
            }
        }
    }

    public final void W9() {
        Intent intent = new Intent(this, (Class<?>) GCMActivityStartup.class);
        intent.setFlags(268468224);
        startActivity(intent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:173:0x0497  */
    /* JADX WARN: Code duplicated, block: B:193:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:272:0x0668  */
    /* JADX WARN: Code duplicated, block: B:504:0x0b15  */
    /* JADX WARN: Code duplicated, block: B:61:0x01fe  */
    @Override // androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intentA;
        Intent intentA2;
        p003ji0.k kVar;
        Intent intentA3;
        String queryParameter;
        Intent intent;
        sd2.f fVarI;
        o82.g gVar;
        Intent intentA4;
        Object serializable;
        o82.g gVar2;
        Intent intentA5;
        Object serializable2;
        Intent intentZ;
        Object serializable3;
        o82.g gVar3;
        Object serializable4;
        o82.g gVar4;
        Object serializable5;
        o82.g gVar5;
        Object serializable6;
        Intent intentB;
        Object serializable7;
        Intent intentB2;
        Object serializable8;
        o82.g gVar6;
        Intent intentA6;
        Object serializable9;
        int i14;
        String str;
        String string;
        GCMCommonDeepLinkHandler gCMCommonDeepLinkHandler = this;
        super.onCreate(bundle);
        Uri data = gCMCommonDeepLinkHandler.getIntent().getData();
        if (data != null) {
            String string2 = data.toString();
            string2.getClass();
            com.garmin.android.apps.connectmobile.sleep.presentation.c cVar = null;
            if (!((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).c()) {
                ((e80.a) KoinJavaComponent.get$default(e80.a.class, null, null, 6, null)).a(string2, f80.b.GCM_COMMON_DEEP_LINK_HANDLER);
                gCMCommonDeepLinkHandler.W9();
                gCMCommonDeepLinkHandler.finish();
                return;
            }
            if (d53.w.z(string2, "/app/intensity-minutes", false)) {
                DateTime dateTimeW = zf.b.w(data);
                o82.g gVarI = xy2.b.i(data);
                u2 u2Var = new u2();
                u2Var.f46492a = dateTimeW;
                u2Var.b(gVarI);
                gCMCommonDeepLinkHandler.startActivity(u2Var.a(gCMCommonDeepLinkHandler, IntensityMinutesReportsActivity.class));
                Unit unit = Unit.INSTANCE;
            } else if (d53.w.z(string2, "/app/stress", false)) {
                DateTime dateTimeW2 = zf.b.w(data);
                o82.g gVarI2 = xy2.b.i(data);
                u2 u2Var2 = new u2();
                u2Var2.f46492a = dateTimeW2;
                u2Var2.b(gVarI2);
                gCMCommonDeepLinkHandler.startActivity(u2Var2.a(gCMCommonDeepLinkHandler, StressReportsActivity.class));
                Unit unit2 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "/app/body-battery", false)) {
                DateTime dateTimeW3 = zf.b.w(data);
                o82.g gVarI3 = xy2.b.i(data);
                u2 u2Var3 = new u2();
                u2Var3.f46492a = dateTimeW3;
                u2Var3.b(gVarI3);
                gCMCommonDeepLinkHandler.startActivity(u2Var3.a(gCMCommonDeepLinkHandler, BodyBatteryReportsActivity.class));
                Unit unit3 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "/app/hrv-status", false)) {
                OvernightHrvActivity.a aVar = OvernightHrvActivity.f39738n;
                DateTime dateTimeW4 = zf.b.w(data);
                e32.o oVarC = c22.o2.c(xy2.b.i(data));
                aVar.getClass();
                gCMCommonDeepLinkHandler.startActivity(OvernightHrvActivity.a.a(gCMCommonDeepLinkHandler, dateTimeW4, oVarC));
                Unit unit4 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "/app/floors", false)) {
                DateTime dateTimeW5 = zf.b.w(data);
                o82.g gVarI4 = xy2.b.i(data);
                u2 u2Var4 = new u2();
                u2Var4.f46492a = dateTimeW5;
                u2Var4.b(gVarI4);
                gCMCommonDeepLinkHandler.startActivity(u2Var4.a(gCMCommonDeepLinkHandler, FloorsActivity.class));
                Unit unit5 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "/app/health-status", false)) {
                Intent intent2 = new Intent(gCMCommonDeepLinkHandler, (Class<?>) HealthStatusActivity.class);
                DateTime dateTimeW6 = zf.b.w(data);
                if (dateTimeW6 != null) {
                    zd1.b bVar = zd1.b.f204223a;
                    b63.o oVarS = g22.k.s(dateTimeW6);
                    bVar.getClass();
                    intent2.putExtra("EXTRA_INITIAL_DATE", oVarS.f16206a.toEpochDay());
                    Unit unit6 = Unit.INSTANCE;
                }
                gCMCommonDeepLinkHandler.startActivity(intent2);
                Unit unit7 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "/app/sleep", false)) {
                Bundle extras = gCMCommonDeepLinkHandler.getIntent().getExtras();
                if (extras != null && (string = extras.getString("GCM_extra_sleep_page_scroll_target")) != null && string.equals("SLEEP_PAGE_SLEEP_NEED_SCROLL_TARGET")) {
                    cVar = com.garmin.android.apps.connectmobile.sleep.presentation.c.SLEEP_NEED;
                }
                Intent intentB3 = SleepReportsActivity.a.b(SleepReportsActivity.f44239b, gCMCommonDeepLinkHandler, zf.b.w(data), null, false, null, cVar, 28);
                intentB3.putExtra("EXTRA_SELECTED_INTERVAL_TYPE", xy2.b.i(data));
                gCMCommonDeepLinkHandler.startActivity(intentB3);
                Unit unit8 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "/app/report/-1/all/current/acuteload", false)) {
                TrainingStatusSummaryActivity.f40068w.getClass();
                gCMCommonDeepLinkHandler.startActivity(TrainingStatusSummaryActivity.a.a(gCMCommonDeepLinkHandler, "TRAINING_LOAD_DEST"));
                Unit unit9 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "/app/report/-1/all/current/loadfocus", false)) {
                TrainingLoadActivity.f40177b.getClass();
                Intent intent3 = new Intent(gCMCommonDeepLinkHandler, (Class<?>) TrainingLoadActivity.class);
                intent3.putExtra("EXTRA_SHOW_ADVANCED_TRAINING_LOAD_VIEW", bo1.a.a().c().e() || bo1.a.a().c().S());
                intent3.putExtra("EXTRA_NAVIGATION_DESTINATION", "LOAD_FOCUS_DEST");
                gCMCommonDeepLinkHandler.startActivity(intent3);
                Unit unit10 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "/app/report/-1/all", false)) {
                Intent intent4 = new Intent(gCMCommonDeepLinkHandler, (Class<?>) TrainingStatusSummaryActivity.class);
                String lastPathSegment = data.getLastPathSegment();
                if (lastPathSegment != null) {
                    switch (lastPathSegment.hashCode()) {
                        case -1341438993:
                            if (!lastPathSegment.equals("last_four_weeks")) {
                                i14 = 0;
                            } else {
                                i14 = 1;
                            }
                            break;
                        case 3142969:
                            if (!lastPathSegment.equals("last_six_months")) {
                                i14 = 0;
                            } else {
                                i14 = 3;
                            }
                            break;
                        case 1126940025:
                            str = "current";
                            lastPathSegment.equals(str);
                            i14 = 0;
                            break;
                        case 2013453382:
                            str = "last_year";
                            lastPathSegment.equals(str);
                            i14 = 0;
                            break;
                        default:
                            i14 = 0;
                            break;
                    }
                } else {
                    i14 = 0;
                }
                intent4.putExtra("initialTab", gCMCommonDeepLinkHandler.getIntent().getIntExtra("initialTab", i14));
                gCMCommonDeepLinkHandler.startActivity(intent4);
                Unit unit11 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "/app/steps", false)) {
                StepsActivity.a aVar2 = StepsActivity.f44915d;
                DateTime dateTimeW7 = zf.b.w(data);
                o82.g gVarI5 = xy2.b.i(data);
                Bundle extras2 = gCMCommonDeepLinkHandler.getIntent().getExtras();
                Integer numValueOf = extras2 != null ? Integer.valueOf(extras2.getInt("initialTab")) : null;
                aVar2.getClass();
                gCMCommonDeepLinkHandler.startActivity(StepsActivity.a.a(gCMCommonDeepLinkHandler, gVarI5, dateTimeW7, numValueOf));
                Unit unit12 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "/app/pushes", false)) {
                PushesActivity.a aVar3 = PushesActivity.f48030d;
                DateTime dateTimeW8 = zf.b.w(data);
                o82.g gVarI6 = xy2.b.i(data);
                Bundle extras3 = gCMCommonDeepLinkHandler.getIntent().getExtras();
                Integer numValueOf2 = extras3 != null ? Integer.valueOf(extras3.getInt("initialTab")) : null;
                aVar3.getClass();
                gCMCommonDeepLinkHandler.startActivity(PushesActivity.a.a(gCMCommonDeepLinkHandler, gVarI6, dateTimeW8, numValueOf2));
                Unit unit13 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "/app/weight", false)) {
                DateTime dateTimeW9 = zf.b.w(data);
                o82.g gVarI7 = xy2.b.i(data);
                u2 u2Var5 = new u2();
                u2Var5.f46492a = dateTimeW9;
                u2Var5.b(gVarI7);
                Intent intentA7 = u2Var5.a(gCMCommonDeepLinkHandler, WeightReportsActivity.class);
                intentA7.putExtra("EXTRA_SHOW_EDIT_WEIGHT_GOAL", intentA7.getBooleanExtra("EXTRA_SHOW_EDIT_WEIGHT_GOAL", false));
                gCMCommonDeepLinkHandler.startActivity(intentA7);
                Unit unit14 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "/purchaseReturn", false)) {
                ge1.b.T(o53.f0.w(gCMCommonDeepLinkHandler), null, null, new d(data, gCMCommonDeepLinkHandler, null), 3);
            } else if (d53.w.z(string2, "/komoot", false)) {
                KomootConsentActivity.f39717c.getClass();
                KomootConsentActivity.a.a(gCMCommonDeepLinkHandler, data);
                Unit unit15 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "connect://myfitnesspal", false) || d53.w.z(string2, "https://connect.garmin.com/mfp", false) || d53.w.z(string2, "/mfp", false)) {
                Intent intent5 = new Intent(gCMCommonDeepLinkHandler, (Class<?>) GCMSettingsThirdPartyAppsActivity.class);
                intent5.setAction("connect://myfitnesspal");
                gCMCommonDeepLinkHandler.startActivity(intent5);
                Unit unit16 = Unit.INSTANCE;
            } else if (string2.equals("connect://strava-auth")) {
                Intent intent6 = new Intent(gCMCommonDeepLinkHandler, (Class<?>) StravaConfigActivity.class);
                intent6.setFlags(67108864);
                gCMCommonDeepLinkHandler.startActivity(intent6);
                Unit unit17 = Unit.INSTANCE;
            } else if (string2.equals("connect://strava/livetrack")) {
                LiveTrackActivity.f38637g.c(gCMCommonDeepLinkHandler, null);
                Unit unit18 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "connect://strava", false)) {
                Intent intent7 = new Intent(gCMCommonDeepLinkHandler, (Class<?>) GCMSettingsThirdPartyAppsActivity.class);
                intent7.setAction("connect://strava");
                gCMCommonDeepLinkHandler.startActivity(intent7);
                Unit unit19 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "connect://manual_activity", false)) {
                com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                gCMCommonDeepLinkHandler.startActivity(com.garmin.android.apps.connectmobile.navigation.b.a.a(gCMCommonDeepLinkHandler, ActivitiesCreateManualActivity.class, null));
                Unit unit20 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "/payment/push/android/mc", false) || d53.w.z(string2, "/payment/push-to-wallet/paymentcard", false)) {
                gCMCommonDeepLinkHandler.Q9(string2);
                Unit unit21 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "/payment/add", false) || d53.w.z(string2, "/payment/missingPaymentInfo", false)) {
                gCMCommonDeepLinkHandler.O9(string2);
                Unit unit22 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "/payment/wallet", false)) {
                GarminPayLaunchScreenActivity.a aVar4 = GarminPayLaunchScreenActivity.f35305d;
                kj0.a.f fVar = kj0.a.f.f104939a;
                aVar4.getClass();
                gCMCommonDeepLinkHandler.startActivity(GarminPayLaunchScreenActivity.a.a(gCMCommonDeepLinkHandler, fVar));
                Unit unit23 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "/mobile-link/gcm", false) && d53.w.z(string2, "/boxqr", false)) {
                gCMCommonDeepLinkHandler.W9();
                Unit unit24 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "connect://dump/app-diagnostics", false)) {
                Intent intent8 = new Intent(gCMCommonDeepLinkHandler, (Class<?>) GCMDumpAppLogActivity.class);
                intent8.setData(data);
                gCMCommonDeepLinkHandler.startActivity(intent8);
                Unit unit25 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "connect://training_status", false)) {
                Intent intent9 = new Intent(gCMCommonDeepLinkHandler, (Class<?>) TrainingStatusSummaryActivity.class);
                intent9.putExtra("initialTab", gCMCommonDeepLinkHandler.getIntent().getIntExtra("initialTab", 0));
                gCMCommonDeepLinkHandler.startActivity(intent9);
                Unit unit26 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "connect://intensity_minutes", false)) {
                Bundle extras4 = gCMCommonDeepLinkHandler.getIntent().getExtras();
                if (extras4 != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializable9 = extras4.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE", o82.g.class);
                    } else {
                        Object serializable10 = extras4.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE");
                        if (!(serializable10 instanceof o82.g)) {
                            serializable10 = null;
                        }
                        serializable9 = (o82.g) serializable10;
                    }
                    gVar6 = (o82.g) serializable9;
                } else {
                    gVar6 = null;
                }
                if (gVar6 != null) {
                    u2 u2Var6 = new u2();
                    u2Var6.f46492a = null;
                    u2Var6.f46493b = gVar6;
                    intentA6 = u2Var6.a(gCMCommonDeepLinkHandler, IntensityMinutesReportsActivity.class);
                } else {
                    intentA6 = null;
                }
                gCMCommonDeepLinkHandler.startActivity(intentA6);
                Unit unit27 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "connect://sleep_need", false)) {
                Bundle extras5 = gCMCommonDeepLinkHandler.getIntent().getExtras();
                if (extras5 == null) {
                    gCMCommonDeepLinkHandler = this;
                    intentB2 = SleepReportsActivity.a.b(SleepReportsActivity.f44239b, gCMCommonDeepLinkHandler, null, null, false, null, com.garmin.android.apps.connectmobile.sleep.presentation.c.SLEEP_NEED, 30);
                } else {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializable8 = extras5.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE", o82.g.class);
                    } else {
                        Object serializable11 = extras5.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE");
                        serializable8 = (o82.g) (!(serializable11 instanceof o82.g) ? null : serializable11);
                    }
                    o82.g gVar7 = (o82.g) serializable8;
                    if (gVar7 == null || (intentB2 = SleepReportsActivity.a.b(SleepReportsActivity.f44239b, gCMCommonDeepLinkHandler, null, null, false, null, com.garmin.android.apps.connectmobile.sleep.presentation.c.SLEEP_NEED, 30).putExtra("EXTRA_SELECTED_INTERVAL_TYPE", gVar7)) == null) {
                        gCMCommonDeepLinkHandler = this;
                        intentB2 = SleepReportsActivity.a.b(SleepReportsActivity.f44239b, gCMCommonDeepLinkHandler, null, null, false, null, com.garmin.android.apps.connectmobile.sleep.presentation.c.SLEEP_NEED, 30);
                    } else {
                        gCMCommonDeepLinkHandler = this;
                    }
                }
                gCMCommonDeepLinkHandler.startActivity(intentB2);
                Unit unit28 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "connect://sleep_score", false)) {
                Bundle extras6 = gCMCommonDeepLinkHandler.getIntent().getExtras();
                if (extras6 == null) {
                    gCMCommonDeepLinkHandler = this;
                    intentB = SleepReportsActivity.a.b(SleepReportsActivity.f44239b, gCMCommonDeepLinkHandler, null, null, false, null, null, 62);
                } else {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializable7 = extras6.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE", o82.g.class);
                    } else {
                        Object serializable12 = extras6.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE");
                        serializable7 = (o82.g) (!(serializable12 instanceof o82.g) ? null : serializable12);
                    }
                    o82.g gVar8 = (o82.g) serializable7;
                    if (gVar8 == null || (intentB = SleepReportsActivity.a.b(SleepReportsActivity.f44239b, gCMCommonDeepLinkHandler, null, null, false, null, null, 62).putExtra("EXTRA_SELECTED_INTERVAL_TYPE", gVar8)) == null) {
                        gCMCommonDeepLinkHandler = this;
                        intentB = SleepReportsActivity.a.b(SleepReportsActivity.f44239b, gCMCommonDeepLinkHandler, null, null, false, null, null, 62);
                    } else {
                        gCMCommonDeepLinkHandler = this;
                    }
                }
                gCMCommonDeepLinkHandler.startActivity(intentB);
                Unit unit29 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "connect://load_focus", false)) {
                TrainingLoadActivity.f40177b.getClass();
                Intent intent10 = new Intent(gCMCommonDeepLinkHandler, (Class<?>) TrainingLoadActivity.class);
                intent10.putExtra("EXTRA_SHOW_ADVANCED_TRAINING_LOAD_VIEW", bo1.a.a().c().e() || bo1.a.a().c().S());
                intent10.putExtra("EXTRA_NAVIGATION_DESTINATION", "LOAD_FOCUS_DEST");
                gCMCommonDeepLinkHandler.startActivity(intent10);
                Unit unit30 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "connect://hrv_status", false)) {
                Bundle extras7 = gCMCommonDeepLinkHandler.getIntent().getExtras();
                if (extras7 != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializable6 = extras7.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE", o82.g.class);
                    } else {
                        Object serializable13 = extras7.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE");
                        if (!(serializable13 instanceof o82.g)) {
                            serializable13 = null;
                        }
                        serializable6 = (o82.g) serializable13;
                    }
                    gVar5 = (o82.g) serializable6;
                } else {
                    gVar5 = null;
                }
                e32.o oVarC2 = gVar5 != null ? c22.o2.c(gVar5) : null;
                OvernightHrvActivity.f39738n.getClass();
                gCMCommonDeepLinkHandler.startActivity(OvernightHrvActivity.a.a(gCMCommonDeepLinkHandler, null, oVarC2));
                Unit unit31 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "connect://steps", false)) {
                StepsActivity.a aVar5 = StepsActivity.f44915d;
                Bundle extras8 = gCMCommonDeepLinkHandler.getIntent().getExtras();
                if (extras8 != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializable5 = extras8.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE", o82.g.class);
                    } else {
                        Object serializable14 = extras8.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE");
                        if (!(serializable14 instanceof o82.g)) {
                            serializable14 = null;
                        }
                        serializable5 = (o82.g) serializable14;
                    }
                    gVar4 = (o82.g) serializable5;
                } else {
                    gVar4 = null;
                }
                Bundle extras9 = gCMCommonDeepLinkHandler.getIntent().getExtras();
                Integer numValueOf3 = extras9 != null ? Integer.valueOf(extras9.getInt("initialTab")) : null;
                aVar5.getClass();
                gCMCommonDeepLinkHandler.startActivity(StepsActivity.a.a(gCMCommonDeepLinkHandler, gVar4, null, numValueOf3));
                Unit unit32 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "connect://pushes", false)) {
                PushesActivity.a aVar6 = PushesActivity.f48030d;
                Bundle extras10 = gCMCommonDeepLinkHandler.getIntent().getExtras();
                if (extras10 != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializable4 = extras10.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE", o82.g.class);
                    } else {
                        Object serializable15 = extras10.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE");
                        if (!(serializable15 instanceof o82.g)) {
                            serializable15 = null;
                        }
                        serializable4 = (o82.g) serializable15;
                    }
                    gVar3 = (o82.g) serializable4;
                } else {
                    gVar3 = null;
                }
                Bundle extras11 = gCMCommonDeepLinkHandler.getIntent().getExtras();
                Integer numValueOf4 = extras11 != null ? Integer.valueOf(extras11.getInt("initialTab")) : null;
                aVar6.getClass();
                gCMCommonDeepLinkHandler.startActivity(PushesActivity.a.a(gCMCommonDeepLinkHandler, gVar3, null, numValueOf4));
                Unit unit33 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "connect://floors", false)) {
                Bundle extras12 = gCMCommonDeepLinkHandler.getIntent().getExtras();
                if (extras12 == null) {
                    intentZ = dh.b.z(FloorsActivity.class, gCMCommonDeepLinkHandler, null, false);
                } else {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializable3 = extras12.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE", o82.g.class);
                    } else {
                        Object serializable16 = extras12.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE");
                        if (!(serializable16 instanceof o82.g)) {
                            serializable16 = null;
                        }
                        serializable3 = (o82.g) serializable16;
                    }
                    o82.g gVar9 = (o82.g) serializable3;
                    if (gVar9 != null) {
                        u2 u2Var7 = new u2();
                        u2Var7.f46492a = null;
                        u2Var7.f46493b = gVar9;
                        intentZ = u2Var7.a(gCMCommonDeepLinkHandler, FloorsActivity.class);
                    } else {
                        intentZ = dh.b.z(FloorsActivity.class, gCMCommonDeepLinkHandler, null, false);
                    }
                }
                gCMCommonDeepLinkHandler.startActivity(intentZ);
                Unit unit34 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "connect://stress", false)) {
                Bundle extras13 = gCMCommonDeepLinkHandler.getIntent().getExtras();
                if (extras13 != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializable2 = extras13.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE", o82.g.class);
                    } else {
                        Object serializable17 = extras13.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE");
                        if (!(serializable17 instanceof o82.g)) {
                            serializable17 = null;
                        }
                        serializable2 = (o82.g) serializable17;
                    }
                    gVar2 = (o82.g) serializable2;
                } else {
                    gVar2 = null;
                }
                if (gVar2 != null) {
                    u2 u2Var8 = new u2();
                    u2Var8.f46492a = null;
                    u2Var8.f46493b = gVar2;
                    intentA5 = u2Var8.a(gCMCommonDeepLinkHandler, StressReportsActivity.class);
                } else {
                    intentA5 = null;
                }
                gCMCommonDeepLinkHandler.startActivity(intentA5);
                Unit unit35 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "connect://body_battery", false)) {
                Bundle extras14 = gCMCommonDeepLinkHandler.getIntent().getExtras();
                if (extras14 != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializable = extras14.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE", o82.g.class);
                    } else {
                        Object serializable18 = extras14.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE");
                        if (!(serializable18 instanceof o82.g)) {
                            serializable18 = null;
                        }
                        serializable = (o82.g) serializable18;
                    }
                    gVar = (o82.g) serializable;
                } else {
                    gVar = null;
                }
                if (gVar != null) {
                    u2 u2Var9 = new u2();
                    u2Var9.f46492a = null;
                    u2Var9.f46493b = gVar;
                    intentA4 = u2Var9.a(gCMCommonDeepLinkHandler, BodyBatteryReportsActivity.class);
                } else {
                    intentA4 = null;
                }
                gCMCommonDeepLinkHandler.startActivity(intentA4);
                Unit unit36 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "connect://weight_edit", false)) {
                Intent intent11 = new Intent(gCMCommonDeepLinkHandler, (Class<?>) WeightReportsActivity.class);
                intent11.putExtra("EXTRA_SHOW_EDIT_WEIGHT_GOAL", gCMCommonDeepLinkHandler.getIntent().getBooleanExtra("EXTRA_SHOW_EDIT_WEIGHT_GOAL", false));
                gCMCommonDeepLinkHandler.startActivity(intent11);
                Unit unit37 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "connect://acute_load", false)) {
                TrainingStatusSummaryActivity.f40068w.getClass();
                gCMCommonDeepLinkHandler.startActivity(TrainingStatusSummaryActivity.a.a(gCMCommonDeepLinkHandler, "TRAINING_LOAD_DEST"));
                Unit unit38 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "connect://health_status", false)) {
                gCMCommonDeepLinkHandler.startActivity(new Intent(gCMCommonDeepLinkHandler, (Class<?>) HealthStatusActivity.class));
                Unit unit39 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "/mobile-link/gcm/pair-device", false)) {
                y80.p0 p0Var = y80.p0.f195200a;
                Uri uri = Uri.parse(string2);
                p0Var.getClass();
                Long l14 = y80.p0.a(uri).f111537a;
                if (l14 != null) {
                    long jLongValue = l14.longValue();
                    rd2.f.a().f152045a.getClass();
                    fVarI = rd2.j.i(jLongValue, null);
                } else {
                    fVarI = null;
                }
                if (fVarI != null && fVarI.isPaired()) {
                    i2.a aVar7 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar7.getClass();
                    i2.a.p(a2Var, "GCMDeepLinkHandler", "Device is already paired, launching device settings instead");
                    if (gCMCommonDeepLinkHandler.S9()) {
                        gCMCommonDeepLinkHandler.W9();
                    } else {
                        String queryParameter2 = Uri.parse(string2).getQueryParameter("deviceId");
                        Long lJ = (queryParameter2 == null || queryParameter2.length() == 0) ? null : d53.t.j(queryParameter2);
                        if (lJ != null) {
                            DeviceDetailsActivity.na(gCMCommonDeepLinkHandler, lJ.longValue());
                        }
                    }
                } else if (gCMCommonDeepLinkHandler.S9()) {
                    p0Var.getClass();
                    y80.p0.f195203d.set(string2);
                    gCMCommonDeepLinkHandler.W9();
                } else {
                    DeviceSetupActivity.a aVar8 = DeviceSetupActivity.f33758b;
                    ca0.o1 o1Var = ca0.o1.ADD_DEVICE;
                    Uri uri2 = Uri.parse(string2);
                    p0Var.getClass();
                    aVar8.c(gCMCommonDeepLinkHandler, o1Var, y80.p0.a(uri2), 0);
                }
                Unit unit40 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "connect://device-backups", false)) {
                if (gCMCommonDeepLinkHandler.S9()) {
                    gCMCommonDeepLinkHandler.W9();
                } else {
                    String queryParameter3 = Uri.parse(string2).getQueryParameter("deviceId");
                    Long lJ2 = (queryParameter3 == null || queryParameter3.length() == 0) ? null : d53.t.j(queryParameter3);
                    if (lJ2 != null) {
                        DeviceBackupActivity.a aVar9 = DeviceBackupActivity.f42558c;
                        long jLongValue2 = lJ2.longValue();
                        aVar9.getClass();
                        gCMCommonDeepLinkHandler.startActivity(DeviceBackupActivity.a.a(gCMCommonDeepLinkHandler, jLongValue2));
                    }
                }
                Unit unit41 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "/mobile-link/gcm/activity", false)) {
                if (gCMCommonDeepLinkHandler.S9()) {
                    gCMCommonDeepLinkHandler.W9();
                } else {
                    String queryParameter4 = data.getQueryParameter("activityId");
                    if (queryParameter4 == null || queryParameter4.length() == 0) {
                        i2.a aVar10 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar10.getClass();
                        i2.a.b(a2Var2, "GCMDeepLinkHandler", "activityId is not found for initMobileLinkActivityFlow()");
                    } else {
                        try {
                            aq.b bVar2 = new aq.b();
                            bVar2.f11823b = Long.parseLong(queryParameter4);
                            am.h hVar = am.h.VIEW_ONLY;
                            if (hVar != null) {
                                bVar2.f11824c = hVar;
                            }
                            gCMCommonDeepLinkHandler.startActivity(bVar2.a(gCMCommonDeepLinkHandler));
                        } catch (NumberFormatException unused) {
                            i2.a aVar11 = i2.f36769a;
                            a2 a2Var3 = a2.GENERAL;
                            aVar11.getClass();
                            i2.a.b(a2Var3, "GCMDeepLinkHandler", "NumberFormatException when parsing activityId for initMobileLinkActivityFlow()");
                        }
                    }
                }
                Unit unit42 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "/mobile-link/gcm/find-an-event", false)) {
                String queryParameter5 = data.getQueryParameter("eventType");
                TrainingInitiativeEventActivity.a aVar12 = TrainingInitiativeEventActivity.f45718o;
                DateTime dateTimeNow = DateTime.now();
                Boolean bool = Boolean.TRUE;
                aVar12.getClass();
                TrainingInitiativeEventActivity.a.c(gCMCommonDeepLinkHandler, dateTimeNow, queryParameter5, bool);
                Unit unit43 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "/mobile-link/gcm/workout", false)) {
                if (gCMCommonDeepLinkHandler.S9()) {
                    gCMCommonDeepLinkHandler.W9();
                } else {
                    t10.n nVarA = t10.n.VIEW;
                    try {
                        t10.n.a aVar13 = t10.n.f161700e;
                        String queryParameter6 = data.getQueryParameter("action");
                        aVar13.getClass();
                        nVarA = t10.n.a.a(queryParameter6);
                    } catch (Exception e4) {
                        String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "Error when parsing action for initMobileLinkWorkoutFlow(): ");
                        i2.a aVar14 = i2.f36769a;
                        a2 a2Var4 = a2.GENERAL;
                        aVar14.getClass();
                        i2.a.b(a2Var4, "GCMDeepLinkHandler", strD);
                    }
                    int i15 = b.f28665a[nVarA.ordinal()];
                    if (i15 == 1) {
                        try {
                            queryParameter = data.getQueryParameter("sportType");
                        } catch (Exception e14) {
                            String strD2 = com.airbnb.lottie.animation.keyframe.a.d(e14, "Error when parsing sportType for initMobileLinkWorkoutFlow(): ");
                            i2.a aVar15 = i2.f36769a;
                            a2 a2Var5 = a2.GENERAL;
                            aVar15.getClass();
                            i2.a.b(a2Var5, "GCMDeepLinkHandler", strD2);
                            queryParameter = null;
                        }
                        if (queryParameter == null || queryParameter.length() == 0) {
                            intent = new Intent(gCMCommonDeepLinkHandler, (Class<?>) WorkoutPreCreateActivity.class);
                        } else {
                            m52.k.f116753m.getClass();
                            m52.k kVarC = m52.k.a.c(queryParameter);
                            WorkoutCreateActivity.a aVar16 = WorkoutCreateActivity.f48852j;
                            kVarC.getClass();
                            ArrayList arrayList = new ArrayList();
                            aVar16.getClass();
                            intent = WorkoutCreateActivity.a.a(gCMCommonDeepLinkHandler, kVarC, arrayList, -1L);
                        }
                        gCMCommonDeepLinkHandler.startActivity(intent);
                    } else if (i15 == 2 || i15 == 3) {
                        try {
                            String queryParameter7 = data.getQueryParameter("workoutId");
                            if (queryParameter7 == null || queryParameter7.length() == 0) {
                                i2.a aVar17 = i2.f36769a;
                                a2 a2Var6 = a2.GENERAL;
                                aVar17.getClass();
                                i2.a.b(a2Var6, "GCMDeepLinkHandler", "workoutId is not found for initMobileLinkWorkoutFlow()");
                            } else {
                                long j8 = Long.parseLong(queryParameter7);
                                int i16 = nVarA == t10.n.EDIT ? 211 : 210;
                                WorkoutDetailsActivity.f48482f.getClass();
                                WorkoutDetailsActivity.a.c(gCMCommonDeepLinkHandler, j8, i16);
                            }
                        } catch (Exception e15) {
                            String strD3 = com.airbnb.lottie.animation.keyframe.a.d(e15, "Error when parsing workoutId for initMobileLinkWorkoutFlow(): ");
                            i2.a aVar18 = i2.f36769a;
                            a2 a2Var7 = a2.GENERAL;
                            aVar18.getClass();
                            i2.a.b(a2Var7, "GCMDeepLinkHandler", strD3);
                        }
                    } else if (i15 != 4) {
                        lc.u0.r();
                    }
                }
                Unit unit44 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "/mobile-link/gcm/ciqApp/oauth", false)) {
                Intent intent12 = new Intent(gCMCommonDeepLinkHandler, (Class<?>) ExternalBrowserAuthResponseActivity.class);
                intent12.setFlags(335544320);
                intent12.setData(data);
                gCMCommonDeepLinkHandler.startActivity(intent12);
                Unit unit45 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "/garminCoach", false) || d53.w.z(string2, "/mobile-link/gcm/garminCoach", false)) {
                gCMCommonDeepLinkHandler.startActivity(ActiveTrainingPlansActivity.a.b(ActiveTrainingPlansActivity.f45098w, gCMCommonDeepLinkHandler, false));
                Unit unit46 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "/mobile-link/gcm/calendar", false)) {
                GCMCalendarActivity.F.getClass();
                Intent intent13 = new Intent(gCMCommonDeepLinkHandler, (Class<?>) GCMCalendarActivity.class);
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("extra.bottom.nav.bar.visibility", true);
                intent13.putExtras(bundle2);
                gCMCommonDeepLinkHandler.startActivity(intent13);
                Unit unit47 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "live-activity/start", false)) {
                if (gCMCommonDeepLinkHandler.S9()) {
                    gCMCommonDeepLinkHandler.W9();
                } else {
                    bv.b.f21239a.getClass();
                    ((kd0.m) bv.b.a()).a(gCMCommonDeepLinkHandler, null, 67108864);
                    gCMCommonDeepLinkHandler.startActivity(new Intent(gCMCommonDeepLinkHandler, (Class<?>) LiveActivityActivity.class));
                }
                Unit unit48 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "subscription", false) || d53.w.z(string2, "/modern/subscription", false) || d53.w.z(string2, "/z8ben/", false) || d53.w.z(string2, "/modern/z8ben/", false) || d53.w.z(string2, "/modern/settings/subscription", false)) {
                gCMCommonDeepLinkHandler.P9(data);
                Unit unit49 = Unit.INSTANCE;
            } else if (d53.w.z(string2, "exclusiveoffers", false)) {
                if (gCMCommonDeepLinkHandler.S9()) {
                    gCMCommonDeepLinkHandler.W9();
                } else {
                    gCMCommonDeepLinkHandler.startActivity(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).d(gCMCommonDeepLinkHandler));
                }
                Unit unit50 = Unit.INSTANCE;
            } else {
                int i17 = 28;
                if (d53.w.z(string2, "nutrition", false)) {
                    new t10.h(gCMCommonDeepLinkHandler).a(data, true, new b41.a(gCMCommonDeepLinkHandler, i17), new i1(0));
                    Unit unit51 = Unit.INSTANCE;
                } else if (d53.w.z(string2, "/mobile-link/gcm/uac", false)) {
                    Unit unit52 = Unit.INSTANCE;
                } else if (d53.w.z(string2, "/modern/user/managed-account/approval", false) || d53.w.z(string2, "/app/user/managed-account/approval", false)) {
                    gCMCommonDeepLinkHandler.T9(data.getQueryParameter("request"));
                    Unit unit53 = Unit.INSTANCE;
                } else if (d53.w.z(string2, "/mobile-link/child-acct-signin", false)) {
                    gCMCommonDeepLinkHandler.W9();
                    Unit unit54 = Unit.INSTANCE;
                } else {
                    if (d53.w.z(string2, "modern/manage-child-account", false) || d53.w.z(string2, "app/manage-child-account", false)) {
                        gCMCommonDeepLinkHandler.U9(data);
                        return;
                    }
                    if (d53.w.z(string2, "/mobile-link/gcm", false) || d53.w.z(string2, "/ml/gcm", false)) {
                        gCMCommonDeepLinkHandler.W9();
                        Unit unit55 = Unit.INSTANCE;
                    } else if (d53.w.z(string2, "friends", false)) {
                        Uri uri3 = Uri.parse(string2);
                        String queryParameter8 = uri3.getQueryParameter("tab");
                        if (queryParameter8 == null) {
                            kVar = p003ji0.k.FOLLOWERS;
                        } else {
                            int iHashCode = queryParameter8.hashCode();
                            if (iHashCode != 765912085) {
                                if (iHashCode == 765915793 && queryParameter8.equals("following")) {
                                    kVar = p003ji0.k.FOLLOWING;
                                } else {
                                    kVar = p003ji0.k.FOLLOWERS;
                                }
                            } else if (queryParameter8.equals("followers")) {
                                kVar = p003ji0.k.FOLLOWERS;
                            } else {
                                kVar = p003ji0.k.FOLLOWERS;
                            }
                        }
                        String queryParameter9 = uri3.getQueryParameter("displayName");
                        if (queryParameter9 != null) {
                            if (queryParameter9.equals(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName())) {
                                FriendListActivity.f35257b.getClass();
                                intentA3 = FriendListActivity.a.a(gCMCommonDeepLinkHandler, kVar);
                            } else {
                                OthersFriendListActivity.f35271a.getClass();
                                intentA3 = OthersFriendListActivity.a.a(gCMCommonDeepLinkHandler, kVar, queryParameter9, null);
                            }
                            gCMCommonDeepLinkHandler.startActivity(intentA3);
                            Unit unit56 = Unit.INSTANCE;
                        }
                    } else if (d53.w.z(string2, "follow-request", false)) {
                        String queryParameter10 = Uri.parse(string2).getQueryParameter("userId");
                        if (queryParameter10 != null) {
                            FollowRequestActivity.f35245b.getClass();
                            Intent intent14 = new Intent(gCMCommonDeepLinkHandler, (Class<?>) FollowRequestActivity.class);
                            intent14.putExtra("extra_profile_pk", queryParameter10);
                            gCMCommonDeepLinkHandler.startActivity(intent14);
                            Unit unit57 = Unit.INSTANCE;
                        }
                    } else if (d53.w.z(string2, "/modern/home", false)) {
                        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                        com.garmin.android.apps.connectmobile.navigation.b.a.c(gCMCommonDeepLinkHandler, null, 268468224);
                        Unit unit58 = Unit.INSTANCE;
                    } else if (d53.w.z(string2, "/auto-challenge-authenticate/request", false)) {
                        LeaderboardActivity.f37145i.getClass();
                        gCMCommonDeepLinkHandler.startActivity(LeaderboardActivity.a.a(gCMCommonDeepLinkHandler));
                        Unit unit59 = Unit.INSTANCE;
                    } else if (d53.w.z(string2, "/app_notifications", false)) {
                        gCMCommonDeepLinkHandler.startActivity(new Intent(gCMCommonDeepLinkHandler, (Class<?>) GNCSOptOutSettingsActivity.class));
                        Unit unit60 = Unit.INSTANCE;
                    } else if (d53.w.z(string2, "/modern/activities", false)) {
                        ActivitiesListActivity.a.b(ActivitiesListActivity.f29099d, gCMCommonDeepLinkHandler, am.g.f3942f, null, 28);
                        Unit unit61 = Unit.INSTANCE;
                    } else if (d53.w.z(string2, "/modern/adhoc-challenge/", false)) {
                        String lastPathSegment2 = data.getLastPathSegment();
                        String queryParameter11 = data.getQueryParameter("adHocChallengeInviteId");
                        if (lastPathSegment2 == null || lastPathSegment2.length() == 0) {
                            LeaderboardActivity.f37145i.getClass();
                            intentA2 = LeaderboardActivity.a.a(gCMCommonDeepLinkHandler);
                        } else {
                            intentA2 = AdHocChallengeDetailsActivity.a.b(AdHocChallengeDetailsActivity.f37168h, gCMCommonDeepLinkHandler, lastPathSegment2, queryParameter11, 8);
                        }
                        gCMCommonDeepLinkHandler.startActivity(intentA2);
                        Unit unit62 = Unit.INSTANCE;
                    } else if (d53.w.z(string2, "/modern/badge-challenge/", false)) {
                        String lastPathSegment3 = data.getLastPathSegment();
                        BadgeChallengeDetailsActivity.f37204e.getClass();
                        BadgeChallengeDetailsActivity.a.b(gCMCommonDeepLinkHandler, lastPathSegment3);
                        Unit unit63 = Unit.INSTANCE;
                    } else if (d53.w.z(string2, "/modern/profile/", false)) {
                        String lastPathSegment4 = data.getLastPathSegment();
                        if (lastPathSegment4 == null) {
                            lastPathSegment4 = "";
                        }
                        UserProfileActivity.f46494x.getClass();
                        UserProfileActivity.a.c(gCMCommonDeepLinkHandler, lastPathSegment4, null, null);
                        Unit unit64 = Unit.INSTANCE;
                    } else if (d53.w.z(string2, "/modern/settings/emailNotifications", false)) {
                        NotificationSettingsActivity.f43568b.getClass();
                        Intent intent15 = new Intent(gCMCommonDeepLinkHandler, (Class<?>) NotificationSettingsActivity.class);
                        intent15.putExtra("VIEW_EMAIL_SETTINGS", true);
                        gCMCommonDeepLinkHandler.startActivity(intent15);
                        Unit unit65 = Unit.INSTANCE;
                    } else if (d53.w.z(string2, "/oauthConfirm", false)) {
                        String queryParameter12 = data.getQueryParameter("oauth_token");
                        String queryParameter13 = data.getQueryParameter("oauth_callback");
                        ThirdPartyConnectActivity.a aVar19 = ThirdPartyConnectActivity.f43974c;
                        hk1.w.a aVar20 = new hk1.w.a(queryParameter12, queryParameter13);
                        aVar19.getClass();
                        gCMCommonDeepLinkHandler.startActivity(ThirdPartyConnectActivity.a.a(gCMCommonDeepLinkHandler, aVar20));
                        Unit unit66 = Unit.INSTANCE;
                    } else if (d53.w.z(string2, "/oauth2Confirm", false)) {
                        ThirdPartyConnectActivity.a aVar21 = ThirdPartyConnectActivity.f43974c;
                        hk1.w.b bVar3 = new hk1.w.b(data.getQueryParameter("client_id"), data.getQueryParameter(RemoteConfigConstants.ResponseFieldKey.STATE), data.getQueryParameter("code_challenge"), data.getQueryParameter("code_challenge_method"), data.getQueryParameter("redirect_uri"), data.getQueryParameter("response_type"));
                        aVar21.getClass();
                        gCMCommonDeepLinkHandler.startActivity(ThirdPartyConnectActivity.a.a(gCMCommonDeepLinkHandler, bVar3));
                        Unit unit67 = Unit.INSTANCE;
                    } else if (d53.w.z(string2, "/modern/badges", false)) {
                        String lastPathSegment5 = data.getLastPathSegment();
                        Integer numI = lastPathSegment5 != null ? d53.t.i(lastPathSegment5) : null;
                        if (numI == null) {
                            BadgesActivity.f30332j.getClass();
                            intentA = BadgesActivity.b.a(gCMCommonDeepLinkHandler, null, false);
                        } else {
                            BadgeDetailsActivity.a aVar22 = BadgeDetailsActivity.f30322l;
                            int iIntValue = numI.intValue();
                            aVar22.getClass();
                            intentA = BadgeDetailsActivity.a.a(iIntValue, gCMCommonDeepLinkHandler);
                        }
                        intentA.addFlags(268468224);
                        gCMCommonDeepLinkHandler.startActivity(intentA);
                        Unit unit68 = Unit.INSTANCE;
                    } else if (d53.w.z(string2, "/app/settings/devicePriority", false)) {
                        PrimaryDeviceActivity.f43662f.getClass();
                        gCMCommonDeepLinkHandler.startActivity(PrimaryDeviceActivity.a.a(gCMCommonDeepLinkHandler, true, null));
                        Unit unit69 = Unit.INSTANCE;
                    } else if (gCMCommonDeepLinkHandler.getIntent().getAction() != null && p005kotlin.jvm.internal.s.g(gCMCommonDeepLinkHandler.getIntent().getAction(), "android.intent.action.VIEW") && gCMCommonDeepLinkHandler.R9(data)) {
                        Intent intent16 = gCMCommonDeepLinkHandler.getIntent();
                        intent16.getClass();
                        gCMCommonDeepLinkHandler.V9(intent16);
                        Unit unit70 = Unit.INSTANCE;
                    } else {
                        String strConcat = "Unknown launch URI ".concat(string2);
                        i2.a aVar23 = i2.f36769a;
                        a2 a2Var8 = a2.GENERAL;
                        aVar23.getClass();
                        i2.a.b(a2Var8, "GCMDeepLinkHandler", strConcat);
                        Unit unit71 = Unit.INSTANCE;
                    }
                }
            }
        }
        gCMCommonDeepLinkHandler.finish();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/GCMCommonDeepLinkHandler$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "DEEP_LINK", "DEEP_LINK_PARAMETER_TITLE", "DEEP_LINK_URL", "INITIAL_TAB_KEY", "FILE_PATTERN_ALLOWED_TO_IMPORT_AS_COURSE", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
