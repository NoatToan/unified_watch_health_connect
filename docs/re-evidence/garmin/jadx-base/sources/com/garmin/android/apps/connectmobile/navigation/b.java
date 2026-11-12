package com.garmin.android.apps.connectmobile.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import androidx.fragment.app.m;
import c22.s1;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.GCMCommonDeepLinkHandler;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.UserDevicesActivity;
import com.garmin.android.apps.connectmobile.acclimation.reports.presentation.activity.PulseOxAcclimationReportsActivity;
import com.garmin.android.apps.connectmobile.activities.health.presentation.HealthSnapshotActivity;
import com.garmin.android.apps.connectmobile.activities.history.presentation.ActivitiesListActivity;
import com.garmin.android.apps.connectmobile.activities.manual.ActivitiesCreateManualActivity;
import com.garmin.android.apps.connectmobile.blood_pressure.presentation.BloodPressureReportsActivity;
import com.garmin.android.apps.connectmobile.bodybattery.presentation.BodyBatteryReportsActivity;
import com.garmin.android.apps.connectmobile.calendar.presentation.GCMCalendarActivity;
import com.garmin.android.apps.connectmobile.calories.presentation.CaloriesReportsActivity;
import com.garmin.android.apps.connectmobile.connections.groups.GroupsActivity;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQAppStoreActivity;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQDeviceListActivity;
import com.garmin.android.apps.connectmobile.consent.InsightsConsentActivity;
import com.garmin.android.apps.connectmobile.contacts.ContactsMigrationActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity;
import com.garmin.android.apps.connectmobile.criticalswimspeed.summary.CriticalSwimSpeedReportsActivity;
import com.garmin.android.apps.connectmobile.cyclingability.presentation.CyclingAbilityReportsActivity;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute;
import com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgActivity;
import com.garmin.android.apps.connectmobile.fitness_age.presentation.FitnessAgeReportsActivity;
import com.garmin.android.apps.connectmobile.floors.presentation.FloorsActivity;
import com.garmin.android.apps.connectmobile.follow.domain.FriendListActivity;
import com.garmin.android.apps.connectmobile.ftp.reports.presentation.activity.FtpActivity;
import com.garmin.android.apps.connectmobile.garminpayfeature.GarminPayLaunchScreenActivity;
import com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeActivity;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.android.apps.connectmobile.golf.DownloadGolfAppDeepLinkActivity;
import com.garmin.android.apps.connectmobile.golf.courses.presentation.DownloadedGolfCoursesActivity;
import com.garmin.android.apps.connectmobile.golf.truswing.SwingHistoryActivity;
import com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity;
import com.garmin.android.apps.connectmobile.healthstatus.presentation.HealthStatusActivity;
import com.garmin.android.apps.connectmobile.heartrate.presentation.HeartRateReportsActivity;
import com.garmin.android.apps.connectmobile.help.HelpDetailsActivity;
import com.garmin.android.apps.connectmobile.hydration.presentation.summary.HydrationActivity;
import com.garmin.android.apps.connectmobile.instantinput.InstantInputSettingsActivity;
import com.garmin.android.apps.connectmobile.intensityminutes.presentation.IntensityMinutesReportsActivity;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.JetLagActivity;
import com.garmin.android.apps.connectmobile.l;
import com.garmin.android.apps.connectmobile.lactate_threshold.reports.presentation.activity.LactateThresholdSummaryActivity;
import com.garmin.android.apps.connectmobile.leaderboard.LeaderboardActivity;
import com.garmin.android.apps.connectmobile.liveeventsharing.ui.LiveEventSharingActivity;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.LiveTrackActivity;
import com.garmin.android.apps.connectmobile.logging.presentation.LifestyleLoggingActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsActivity;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.list.MultiDayActivitiesListActivity;
import com.garmin.android.apps.connectmobile.navigation.more.MoreActivity;
import com.garmin.android.apps.connectmobile.newsfeed.NewsFeedActivity;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.garmin.android.apps.connectmobile.overnighthrv.OvernightHrvActivity;
import com.garmin.android.apps.connectmobile.pacepro.presentation.activity.PaceProComposeActivity;
import com.garmin.android.apps.connectmobile.performance.stats.StressLevelScoresSummaryActivity;
import com.garmin.android.apps.connectmobile.performance.stats.TrainingEffectSummaryActivity;
import com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusSummaryActivity;
import com.garmin.android.apps.connectmobile.performancescores.endurancescore.presentation.EnduranceScoreActivity;
import com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.HillScoreActivity;
import com.garmin.android.apps.connectmobile.permissions.PermissionsSettingsActivity;
import com.garmin.android.apps.connectmobile.powercurve.view.PowerCurveActivity;
import com.garmin.android.apps.connectmobile.powerguide.PowerGuideListActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyGenesisActivity;
import com.garmin.android.apps.connectmobile.pulseox.presentation.PulseOxActivity;
import com.garmin.android.apps.connectmobile.racepredictor.presentation.activity.RacePredictorTrendsActivity;
import com.garmin.android.apps.connectmobile.respiration.presentation.RespirationReportsActivity;
import com.garmin.android.apps.connectmobile.running_economy.presentation.RunningEconomyReportsActivity;
import com.garmin.android.apps.connectmobile.running_tolerance.presentation.RunningToleranceReportsActivity;
import com.garmin.android.apps.connectmobile.segments.presentation.MySegmentsActivity;
import com.garmin.android.apps.connectmobile.settings.CopyrightActivity;
import com.garmin.android.apps.connectmobile.settings.DeviceSyncAuditViewer;
import com.garmin.android.apps.connectmobile.settings.GCMActivityAppDiagnostics;
import com.garmin.android.apps.connectmobile.settings.GCMActivitySettingsDeveloper;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.GCMUserSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.GarminPayLegalActivity;
import com.garmin.android.apps.connectmobile.settings.MedicalDeviceUdiActivity;
import com.garmin.android.apps.connectmobile.settings.ThemeSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.newsfeed.NewsFeedSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.notifications.NotificationSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.PrimaryDeviceActivity;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.SafetyFeatureSetupWizardActivity;
import com.garmin.android.apps.connectmobile.settings.thirdparty.GCMSettingsThirdPartyAppsActivity;
import com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsActivity;
import com.garmin.android.apps.connectmobile.socialgroupride.presentation.summary.GroupRideSummaryActivity;
import com.garmin.android.apps.connectmobile.startup.WebLinkHandlerActivity;
import com.garmin.android.apps.connectmobile.steps.presentation.StepsActivity;
import com.garmin.android.apps.connectmobile.stress.presentation.view.StressReportsActivity;
import com.garmin.android.apps.connectmobile.trails.presentation.GarminTrailsActivity;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.dashboard.EventDashBoardActivity;
import com.garmin.android.apps.connectmobile.trainingrediness.presentation.TrainingReadinessActivity;
import com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileActivity;
import com.garmin.android.apps.connectmobile.vo2.reports.presentation.activity.VO2MaxReportsActivity;
import com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsActivity;
import com.garmin.android.apps.connectmobile.wheelchair.presentation.PushesActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.list.WorkoutListActivity;
import com.garmin.android.lib.legal.LegalGatewayActivity;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.flexbox.FlexItem;
import en.i;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import o13.p;
import o53.f0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.x0;
import vg1.t;
import y80.p0;
import zb0.n0;
import zb0.u0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/navigation/b;", "", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39357a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f39358b;

    static {
        int i14 = gt2.c.f79010a;
        f39358b = gt2.b.f79005a.h("DrawerNavigationUtils");
    }

    public static final void a(ty0.b bVar, Activity activity, Bundle bundle) {
        a aVar = f39357a;
        aVar.getClass();
        bVar.getClass();
        activity.getClass();
        a.b(aVar, bVar, activity, bundle, 8);
    }

    public static final void b() {
        f39357a.getClass();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/navigation/b$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.navigation.b$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0703a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f39359a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f39360b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ int[] f39361c;

            static {
                int[] iArr = new int[ty0.b.values().length];
                try {
                    iArr[ty0.b.D1.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ty0.b.f166901o.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ty0.b.f166854a1.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ty0.b.J1.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ty0.b.f166894m1.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ty0.b.f166886k1.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ty0.b.G1.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[ty0.b.Q1.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[ty0.b.f166855a2.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[ty0.b.S1.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[ty0.b.f166924w1.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[ty0.b.f166910r.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[ty0.b.L0.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[ty0.b.M0.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[ty0.b.B.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[ty0.b.A.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[ty0.b.X1.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[ty0.b.f166863d1.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[ty0.b.f166904p.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[ty0.b.X.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[ty0.b.Y.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[ty0.b.Z.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[ty0.b.f166858b2.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[ty0.b.Z1.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[ty0.b.Y1.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[ty0.b.I1.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[ty0.b.M1.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[ty0.b.A1.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[ty0.b.f166926x.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[ty0.b.R1.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[ty0.b.f166866e1.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[ty0.b.f166869f1.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[ty0.b.Y0.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[ty0.b.F1.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[ty0.b.f166861c2.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[ty0.b.f166864d2.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[ty0.b.f166867e2.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[ty0.b.f166870f2.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[ty0.b.f166876h2.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[ty0.b.f166879i2.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[ty0.b.f166882j2.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[ty0.b.f166887k2.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[ty0.b.f166891l2.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[ty0.b.f166906p2.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[ty0.b.f166909q2.ordinal()] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[ty0.b.f166912r2.ordinal()] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[ty0.b.f166895m2.ordinal()] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr[ty0.b.f166899n2.ordinal()] = 48;
                } catch (NoSuchFieldError unused48) {
                }
                try {
                    iArr[ty0.b.f166914s2.ordinal()] = 49;
                } catch (NoSuchFieldError unused49) {
                }
                try {
                    iArr[ty0.b.f166917t2.ordinal()] = 50;
                } catch (NoSuchFieldError unused50) {
                }
                try {
                    iArr[ty0.b.f166922v2.ordinal()] = 51;
                } catch (NoSuchFieldError unused51) {
                }
                try {
                    iArr[ty0.b.f166928x2.ordinal()] = 52;
                } catch (NoSuchFieldError unused52) {
                }
                try {
                    iArr[ty0.b.f166931y2.ordinal()] = 53;
                } catch (NoSuchFieldError unused53) {
                }
                try {
                    iArr[ty0.b.f166934z2.ordinal()] = 54;
                } catch (NoSuchFieldError unused54) {
                }
                try {
                    iArr[ty0.b.A2.ordinal()] = 55;
                } catch (NoSuchFieldError unused55) {
                }
                try {
                    iArr[ty0.b.B2.ordinal()] = 56;
                } catch (NoSuchFieldError unused56) {
                }
                try {
                    iArr[ty0.b.C2.ordinal()] = 57;
                } catch (NoSuchFieldError unused57) {
                }
                try {
                    iArr[ty0.b.D2.ordinal()] = 58;
                } catch (NoSuchFieldError unused58) {
                }
                try {
                    iArr[ty0.b.F2.ordinal()] = 59;
                } catch (NoSuchFieldError unused59) {
                }
                try {
                    iArr[ty0.b.G2.ordinal()] = 60;
                } catch (NoSuchFieldError unused60) {
                }
                try {
                    iArr[ty0.b.H2.ordinal()] = 61;
                } catch (NoSuchFieldError unused61) {
                }
                try {
                    iArr[ty0.b.K2.ordinal()] = 62;
                } catch (NoSuchFieldError unused62) {
                }
                try {
                    iArr[ty0.b.L2.ordinal()] = 63;
                } catch (NoSuchFieldError unused63) {
                }
                try {
                    iArr[ty0.b.N2.ordinal()] = 64;
                } catch (NoSuchFieldError unused64) {
                }
                try {
                    iArr[ty0.b.O0.ordinal()] = 65;
                } catch (NoSuchFieldError unused65) {
                }
                try {
                    iArr[ty0.b.P0.ordinal()] = 66;
                } catch (NoSuchFieldError unused66) {
                }
                try {
                    iArr[ty0.b.Q0.ordinal()] = 67;
                } catch (NoSuchFieldError unused67) {
                }
                try {
                    iArr[ty0.b.H0.ordinal()] = 68;
                } catch (NoSuchFieldError unused68) {
                }
                try {
                    iArr[ty0.b.f166890l1.ordinal()] = 69;
                } catch (NoSuchFieldError unused69) {
                }
                try {
                    iArr[ty0.b.f166905p1.ordinal()] = 70;
                } catch (NoSuchFieldError unused70) {
                }
                try {
                    iArr[ty0.b.f166902o1.ordinal()] = 71;
                } catch (NoSuchFieldError unused71) {
                }
                try {
                    iArr[ty0.b.H1.ordinal()] = 72;
                } catch (NoSuchFieldError unused72) {
                }
                try {
                    iArr[ty0.b.O1.ordinal()] = 73;
                } catch (NoSuchFieldError unused73) {
                }
                try {
                    iArr[ty0.b.f166907q.ordinal()] = 74;
                } catch (NoSuchFieldError unused74) {
                }
                try {
                    iArr[ty0.b.I.ordinal()] = 75;
                } catch (NoSuchFieldError unused75) {
                }
                try {
                    iArr[ty0.b.P.ordinal()] = 76;
                } catch (NoSuchFieldError unused76) {
                }
                try {
                    iArr[ty0.b.T.ordinal()] = 77;
                } catch (NoSuchFieldError unused77) {
                }
                try {
                    iArr[ty0.b.E.ordinal()] = 78;
                } catch (NoSuchFieldError unused78) {
                }
                try {
                    iArr[ty0.b.F.ordinal()] = 79;
                } catch (NoSuchFieldError unused79) {
                }
                try {
                    iArr[ty0.b.f166913s1.ordinal()] = 80;
                } catch (NoSuchFieldError unused80) {
                }
                try {
                    iArr[ty0.b.f166916t1.ordinal()] = 81;
                } catch (NoSuchFieldError unused81) {
                }
                try {
                    iArr[ty0.b.f166908q1.ordinal()] = 82;
                } catch (NoSuchFieldError unused82) {
                }
                try {
                    iArr[ty0.b.f166911r1.ordinal()] = 83;
                } catch (NoSuchFieldError unused83) {
                }
                try {
                    iArr[ty0.b.T1.ordinal()] = 84;
                } catch (NoSuchFieldError unused84) {
                }
                try {
                    iArr[ty0.b.U1.ordinal()] = 85;
                } catch (NoSuchFieldError unused85) {
                }
                try {
                    iArr[ty0.b.f166857b1.ordinal()] = 86;
                } catch (NoSuchFieldError unused86) {
                }
                try {
                    iArr[ty0.b.E1.ordinal()] = 87;
                } catch (NoSuchFieldError unused87) {
                }
                try {
                    iArr[ty0.b.N1.ordinal()] = 88;
                } catch (NoSuchFieldError unused88) {
                }
                try {
                    iArr[ty0.b.f166929y.ordinal()] = 89;
                } catch (NoSuchFieldError unused89) {
                }
                try {
                    iArr[ty0.b.f166930y1.ordinal()] = 90;
                } catch (NoSuchFieldError unused90) {
                }
                try {
                    iArr[ty0.b.f166933z1.ordinal()] = 91;
                } catch (NoSuchFieldError unused91) {
                }
                try {
                    iArr[ty0.b.f166860c1.ordinal()] = 92;
                } catch (NoSuchFieldError unused92) {
                }
                try {
                    iArr[ty0.b.V0.ordinal()] = 93;
                } catch (NoSuchFieldError unused93) {
                }
                try {
                    iArr[ty0.b.W0.ordinal()] = 94;
                } catch (NoSuchFieldError unused94) {
                }
                try {
                    iArr[ty0.b.N0.ordinal()] = 95;
                } catch (NoSuchFieldError unused95) {
                }
                try {
                    iArr[ty0.b.X0.ordinal()] = 96;
                } catch (NoSuchFieldError unused96) {
                }
                try {
                    iArr[ty0.b.f166923w.ordinal()] = 97;
                } catch (NoSuchFieldError unused97) {
                }
                try {
                    iArr[ty0.b.f166927x1.ordinal()] = 98;
                } catch (NoSuchFieldError unused98) {
                }
                try {
                    iArr[ty0.b.f166889l.ordinal()] = 99;
                } catch (NoSuchFieldError unused99) {
                }
                try {
                    iArr[ty0.b.S0.ordinal()] = 100;
                } catch (NoSuchFieldError unused100) {
                }
                try {
                    iArr[ty0.b.f166872g1.ordinal()] = 101;
                } catch (NoSuchFieldError unused101) {
                }
                try {
                    iArr[ty0.b.B1.ordinal()] = 102;
                } catch (NoSuchFieldError unused102) {
                }
                try {
                    iArr[ty0.b.f166893m.ordinal()] = 103;
                } catch (NoSuchFieldError unused103) {
                }
                try {
                    iArr[ty0.b.f166897n.ordinal()] = 104;
                } catch (NoSuchFieldError unused104) {
                }
                try {
                    iArr[ty0.b.Z0.ordinal()] = 105;
                } catch (NoSuchFieldError unused105) {
                }
                try {
                    iArr[ty0.b.W1.ordinal()] = 106;
                } catch (NoSuchFieldError unused106) {
                }
                try {
                    iArr[ty0.b.f166885k0.ordinal()] = 107;
                } catch (NoSuchFieldError unused107) {
                }
                try {
                    iArr[ty0.b.f166921v1.ordinal()] = 108;
                } catch (NoSuchFieldError unused108) {
                }
                try {
                    iArr[ty0.b.I0.ordinal()] = 109;
                } catch (NoSuchFieldError unused109) {
                }
                try {
                    iArr[ty0.b.J0.ordinal()] = 110;
                } catch (NoSuchFieldError unused110) {
                }
                try {
                    iArr[ty0.b.K0.ordinal()] = 111;
                } catch (NoSuchFieldError unused111) {
                }
                try {
                    iArr[ty0.b.T0.ordinal()] = 112;
                } catch (NoSuchFieldError unused112) {
                }
                try {
                    iArr[ty0.b.U0.ordinal()] = 113;
                } catch (NoSuchFieldError unused113) {
                }
                try {
                    iArr[ty0.b.f166918u1.ordinal()] = 114;
                } catch (NoSuchFieldError unused114) {
                }
                try {
                    iArr[ty0.b.D.ordinal()] = 115;
                } catch (NoSuchFieldError unused115) {
                }
                try {
                    iArr[ty0.b.C1.ordinal()] = 116;
                } catch (NoSuchFieldError unused116) {
                }
                try {
                    iArr[ty0.b.f166875h1.ordinal()] = 117;
                } catch (NoSuchFieldError unused117) {
                }
                try {
                    iArr[ty0.b.T2.ordinal()] = 118;
                } catch (NoSuchFieldError unused118) {
                }
                try {
                    iArr[ty0.b.f166880i3.ordinal()] = 119;
                } catch (NoSuchFieldError unused119) {
                }
                try {
                    iArr[ty0.b.U2.ordinal()] = 120;
                } catch (NoSuchFieldError unused120) {
                }
                try {
                    iArr[ty0.b.V2.ordinal()] = 121;
                } catch (NoSuchFieldError unused121) {
                }
                try {
                    iArr[ty0.b.W2.ordinal()] = 122;
                } catch (NoSuchFieldError unused122) {
                }
                try {
                    iArr[ty0.b.f166871f3.ordinal()] = 123;
                } catch (NoSuchFieldError unused123) {
                }
                try {
                    iArr[ty0.b.X2.ordinal()] = 124;
                } catch (NoSuchFieldError unused124) {
                }
                try {
                    iArr[ty0.b.Y2.ordinal()] = 125;
                } catch (NoSuchFieldError unused125) {
                }
                try {
                    iArr[ty0.b.f166856a3.ordinal()] = 126;
                } catch (NoSuchFieldError unused126) {
                }
                try {
                    iArr[ty0.b.Z2.ordinal()] = 127;
                } catch (NoSuchFieldError unused127) {
                }
                try {
                    iArr[ty0.b.f166859b3.ordinal()] = 128;
                } catch (NoSuchFieldError unused128) {
                }
                try {
                    iArr[ty0.b.f166862c3.ordinal()] = 129;
                } catch (NoSuchFieldError unused129) {
                }
                try {
                    iArr[ty0.b.f166865d3.ordinal()] = 130;
                } catch (NoSuchFieldError unused130) {
                }
                try {
                    iArr[ty0.b.f166868e3.ordinal()] = 131;
                } catch (NoSuchFieldError unused131) {
                }
                try {
                    iArr[ty0.b.f166874g3.ordinal()] = 132;
                } catch (NoSuchFieldError unused132) {
                }
                try {
                    iArr[ty0.b.f166877h3.ordinal()] = 133;
                } catch (NoSuchFieldError unused133) {
                }
                try {
                    iArr[ty0.b.f166883j3.ordinal()] = 134;
                } catch (NoSuchFieldError unused134) {
                }
                try {
                    iArr[ty0.b.f166888k3.ordinal()] = 135;
                } catch (NoSuchFieldError unused135) {
                }
                try {
                    iArr[ty0.b.f166915t.ordinal()] = 136;
                } catch (NoSuchFieldError unused136) {
                }
                f39359a = iArr;
                int[] iArr2 = new int[wy0.a.values().length];
                try {
                    iArr2[wy0.a.BADGES.ordinal()] = 1;
                } catch (NoSuchFieldError unused137) {
                }
                try {
                    iArr2[wy0.a.PERSONAL_RECORDS.ordinal()] = 2;
                } catch (NoSuchFieldError unused138) {
                }
                try {
                    iArr2[wy0.a.USER_PROFILE.ordinal()] = 3;
                } catch (NoSuchFieldError unused139) {
                }
                f39360b = iArr2;
                int[] iArr3 = new int[f80.b.values().length];
                try {
                    iArr3[f80.b.GCM_COMMON_DEEP_LINK_HANDLER.ordinal()] = 1;
                } catch (NoSuchFieldError unused140) {
                }
                try {
                    iArr3[f80.b.WEB_LINK_HANDLER_ACTIVITY.ordinal()] = 2;
                } catch (NoSuchFieldError unused141) {
                }
                try {
                    iArr3[f80.b.GSM_REDIRECT_ACTIVITY.ordinal()] = 3;
                } catch (NoSuchFieldError unused142) {
                }
                f39361c = iArr3;
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, Class cls, Bundle bundle) {
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) cls);
            intent.putExtra("GCM_extra_top_navigation", true);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            return intent;
        }

        /* JADX WARN: Code duplicated, block: B:163:0x071d  */
        /* JADX WARN: Code duplicated, block: B:173:0x0771  */
        /* JADX WARN: Code duplicated, block: B:175:0x0776  */
        /* JADX WARN: Code duplicated, block: B:177:0x0782  */
        /* JADX WARN: Code duplicated, block: B:180:0x0789 A[RETURN] */
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean b(a aVar, ty0.b bVar, Activity activity, Bundle bundle, int i14) {
            Intent intentA;
            Intent intentA2;
            Intent intentA3;
            Bundle bundle2 = (i14 & 4) != 0 ? null : bundle;
            boolean z14 = (i14 & 8) != 0;
            aVar.getClass();
            bVar.getClass();
            activity.getClass();
            l22.a aVar2 = new l22.a(activity);
            String str = bVar.f166943i;
            if (str != null) {
                b.f39357a.getClass();
                Bundle bundle3 = new Bundle();
                bundle3.putString("Screen", "MainMenu");
                bundle3.putString("Action", str);
                ht.a.f85464a.getClass();
                ht.a.a(bundle3, "UserAction");
                Unit unit = Unit.INSTANCE;
            }
            boolean z15 = z14;
            switch (C0703a.f39359a[bVar.ordinal()]) {
                case 1:
                    LegalGatewayActivity.a aVar3 = LegalGatewayActivity.f49928n;
                    lc2.a aVar4 = lc2.a.ACTIVITY_TRACKING_ACCURACY_DISCLAIMER;
                    boolean zF = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f();
                    Context applicationContext = activity.getApplicationContext();
                    applicationContext.getClass();
                    LegalGatewayActivity.a.b(aVar3, activity, 0, aVar4, zF, false, null, false, bVar.b(new l22.a(applicationContext)), 112);
                    return true;
                case 2:
                    intentA = a(activity, ActivitiesListActivity.class, bundle2);
                    am.g gVar = am.g.f3942f;
                    gVar.getClass();
                    intentA.putExtra("activity_list_mode", (Parcelable) gVar);
                    Unit unit2 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit3 = Unit.INSTANCE;
                    return true;
                case 3:
                    intentA = a(activity, BodyBatteryReportsActivity.class, bundle2);
                    Unit unit4 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit5 = Unit.INSTANCE;
                    return true;
                case 4:
                    intentA = a(activity, GCMCalendarActivity.class, bundle2);
                    Unit unit6 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit7 = Unit.INSTANCE;
                    return true;
                case 5:
                    intentA = a(activity, CaloriesReportsActivity.class, bundle2);
                    Unit unit8 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit9 = Unit.INSTANCE;
                    return true;
                case 6:
                    intentA = a(activity, NutritionActivity.class, bundle2);
                    Unit unit10 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11 = Unit.INSTANCE;
                    return true;
                case 7:
                    intentA = a(activity, LeaderboardActivity.class, bundle2);
                    Unit unit12 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit13 = Unit.INSTANCE;
                    return true;
                case 8:
                    intentA = a(activity, FriendListActivity.class, bundle2);
                    Unit unit14 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit15 = Unit.INSTANCE;
                    return true;
                case 9:
                    l.g().getClass();
                    if (l.i()) {
                        l.g().getClass();
                        if (TextUtils.isEmpty(l.f())) {
                            intentA2 = a(activity, ConnectIQAppStoreActivity.class, bundle2);
                        } else {
                            intentA2 = a(activity, ConnectIQDeviceListActivity.class, bundle2);
                        }
                    } else {
                        intentA2 = a(activity, ConnectIQAppStoreActivity.class, bundle2);
                    }
                    intentA = intentA2;
                    Unit unit16 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit17 = Unit.INSTANCE;
                    return true;
                case 10:
                    p pVarC = cw.j.c(activity);
                    intentA = ContactsMigrationActivity.a.b(ContactsMigrationActivity.f32322j, activity, (Intent) pVarC.f128594a, (Intent[]) pVarC.f128595b, 16);
                    Unit unit18 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit19 = Unit.INSTANCE;
                    return true;
                case 11:
                    intentA = a(activity, CoursesActivity.class, bundle2);
                    Unit unit20 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit110 = Unit.INSTANCE;
                    return true;
                case 12:
                    intentA = a(activity, ActivitiesCreateManualActivity.class, bundle2);
                    Unit unit21 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111 = Unit.INSTANCE;
                    return true;
                case 13:
                    PowerCurveActivity.a aVar5 = PowerCurveActivity.f40339p;
                    ma1.a aVar6 = ma1.a.CYCLING;
                    aVar5.getClass();
                    aVar6.getClass();
                    intentA = new Intent(activity, (Class<?>) PowerCurveActivity.class).putExtra("extra_power_curve_sport_key", aVar6.f117628a);
                    intentA.getClass();
                    Unit unit22 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit112 = Unit.INSTANCE;
                    return true;
                case 14:
                    PowerCurveActivity.a aVar7 = PowerCurveActivity.f40339p;
                    ma1.a aVar8 = ma1.a.ROWING;
                    aVar7.getClass();
                    aVar8.getClass();
                    intentA = new Intent(activity, (Class<?>) PowerCurveActivity.class).putExtra("extra_power_curve_sport_key", aVar8.f117628a);
                    intentA.getClass();
                    Unit unit23 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit113 = Unit.INSTANCE;
                    return true;
                case 15:
                    new en.h(activity).execute();
                    return true;
                case 16:
                    new i(activity).execute();
                    return true;
                case 17:
                    intentA = a(activity, DownloadedGolfCoursesActivity.class, bundle2);
                    Unit unit24 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit114 = Unit.INSTANCE;
                    return true;
                case 18:
                    intentA = a(activity, FitnessAgeReportsActivity.class, bundle2);
                    Unit unit25 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit115 = Unit.INSTANCE;
                    return true;
                case 19:
                    intentA = a(activity, FloorsActivity.class, bundle2);
                    Unit unit26 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit116 = Unit.INSTANCE;
                    return true;
                case 20:
                    intentA = a(activity, FtpActivity.class, bundle2);
                    Unit unit27 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit117 = Unit.INSTANCE;
                    return true;
                case 21:
                    intentA = a(activity, CyclingAbilityReportsActivity.class, bundle2);
                    Unit unit28 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit118 = Unit.INSTANCE;
                    return true;
                case 22:
                    intentA = a(activity, CriticalSwimSpeedReportsActivity.class, bundle2);
                    Unit unit29 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit119 = Unit.INSTANCE;
                    return true;
                case 23:
                    intentA = a(activity, UserDevicesActivity.class, bundle2);
                    intentA.addFlags(67108864);
                    Unit unit30 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1110 = Unit.INSTANCE;
                    return true;
                case 24:
                    new en.g(activity).execute();
                    Unit unit31 = Unit.INSTANCE;
                    intentA = null;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111 = Unit.INSTANCE;
                    return true;
                case 25:
                    intentA3 = a(activity, DownloadGolfAppDeepLinkActivity.class, bundle2);
                    intentA3.putExtra("action", "play.screen");
                    Unit unit32 = Unit.INSTANCE;
                    intentA = intentA3;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1112 = Unit.INSTANCE;
                    return true;
                case 26:
                    GarminPayLaunchScreenActivity.a aVar9 = GarminPayLaunchScreenActivity.f35305d;
                    kj0.a.d dVar = kj0.a.d.f104937a;
                    aVar9.getClass();
                    intentA = GarminPayLaunchScreenActivity.a.a(activity, dVar);
                    Unit unit33 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1113 = Unit.INSTANCE;
                    return true;
                case 27:
                    GearActivity.f35500b.getClass();
                    intentA = GearActivity.a.a(activity);
                    Unit unit34 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1114 = Unit.INSTANCE;
                    return true;
                case 28:
                    intentA = a(activity, GarminTrailsActivity.class, bundle2);
                    Unit unit35 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1115 = Unit.INSTANCE;
                    return true;
                case 29:
                    intentA3 = a(activity, DownloadGolfAppDeepLinkActivity.class, bundle2);
                    intentA3.putExtra("action", "course.stats");
                    Unit unit36 = Unit.INSTANCE;
                    intentA = intentA3;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1116 = Unit.INSTANCE;
                    return true;
                case 30:
                    intentA = a(activity, GroupsActivity.class, bundle2);
                    Unit unit37 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1117 = Unit.INSTANCE;
                    return true;
                case 31:
                    intentA = a(activity, HealthSnapshotActivity.class, bundle2);
                    Unit unit38 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1118 = Unit.INSTANCE;
                    return true;
                case 32:
                    intentA = a(activity, EcgActivity.class, bundle2);
                    Unit unit39 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1119 = Unit.INSTANCE;
                    return true;
                case 33:
                    intentA = a(activity, HeartRateReportsActivity.class, bundle2);
                    Unit unit40 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11110 = Unit.INSTANCE;
                    return true;
                case 34:
                    intentA = a(activity, GCPlusHomeActivity.class, bundle2);
                    Unit unit41 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11111 = Unit.INSTANCE;
                    return true;
                case 35:
                    intentA3 = a(activity, DashboardActivity.class, bundle2);
                    Bundle bundle4 = new Bundle();
                    new ty0.d(n63.b.f123892d).e(bundle4, "StartDestination", new DashboardRoute.HomeSettings(false, 1, (j) null));
                    intentA3.putExtras(bundle4);
                    Unit unit42 = Unit.INSTANCE;
                    intentA = intentA3;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11112 = Unit.INSTANCE;
                    return true;
                case 36:
                    intentA = a(activity, EditProfileActivity.class, bundle2);
                    Unit unit43 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11113 = Unit.INSTANCE;
                    return true;
                case 37:
                    intentA = a(activity, NewsFeedSettingsActivity.class, bundle2);
                    Unit unit44 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11114 = Unit.INSTANCE;
                    return true;
                case 38:
                    intentA = a(activity, GCMUserSettingsActivity.class, bundle2);
                    Unit unit45 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11115 = Unit.INSTANCE;
                    return true;
                case 39:
                    intentA = a(activity, ThemeSettingsActivity.class, bundle2);
                    Unit unit46 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11116 = Unit.INSTANCE;
                    return true;
                case 40:
                    intentA = a(activity, NotificationSettingsActivity.class, bundle2);
                    Unit unit47 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11117 = Unit.INSTANCE;
                    return true;
                case 41:
                    intentA = a(activity, PermissionsSettingsActivity.class, bundle2);
                    Unit unit48 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11118 = Unit.INSTANCE;
                    return true;
                case 42:
                    intentA = a(activity, InstantInputSettingsActivity.class, bundle2);
                    Unit unit49 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11119 = Unit.INSTANCE;
                    return true;
                case 43:
                    intentA = a(activity, GCMSettingsThirdPartyAppsActivity.class, bundle2);
                    Unit unit50 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111110 = Unit.INSTANCE;
                    return true;
                case 44:
                case 45:
                case 46:
                    intentA = a(activity, MoreActivity.class, bundle2);
                    intentA.putExtra("MORE_START_DESTINATION_EXTRA", ty0.b.J2);
                    Unit unit51 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111111 = Unit.INSTANCE;
                    return true;
                case 47:
                    intentA = a(activity, PrimaryDeviceActivity.class, bundle2);
                    intentA.putExtra("extras_is_navigating_from_primary_wearable", true);
                    Unit unit52 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111112 = Unit.INSTANCE;
                    return true;
                case 48:
                    intentA = a(activity, PrimaryDeviceActivity.class, bundle2);
                    intentA.putExtra("extras_is_navigating_from_primary_wearable", false);
                    Unit unit53 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111113 = Unit.INSTANCE;
                    return true;
                case 49:
                    intentA = a(activity, MedicalDeviceUdiActivity.class, bundle2);
                    Unit unit54 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111114 = Unit.INSTANCE;
                    return true;
                case 50:
                    ((o31.a) KoinJavaComponent.get$default(o31.a.class, null, null, 6, null)).K0((m) activity);
                    Unit unit55 = Unit.INSTANCE;
                    intentA = null;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111115 = Unit.INSTANCE;
                    return true;
                case 51:
                    activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aVar2.getString(R.string.china_icp_license_url))));
                    Unit unit56 = Unit.INSTANCE;
                    intentA = null;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111116 = Unit.INSTANCE;
                    return true;
                case 52:
                    d(activity, lc2.a.APP_EULA, bVar.b(aVar2), true);
                    Unit unit57 = Unit.INSTANCE;
                    intentA = null;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111117 = Unit.INSTANCE;
                    return true;
                case 53:
                    d(activity, lc2.a.GARMIN_CONNECT_PRIVACY_POLICY, bVar.b(aVar2), true);
                    Unit unit58 = Unit.INSTANCE;
                    intentA = null;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111118 = Unit.INSTANCE;
                    return true;
                case 54:
                    d(activity, lc2.a.GARMIN_SECURITY_POLICY, bVar.b(aVar2), true);
                    Unit unit59 = Unit.INSTANCE;
                    intentA = null;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111119 = Unit.INSTANCE;
                    return true;
                case 55:
                    d(activity, lc2.a.LIVETRACK_EULA, bVar.b(aVar2), true);
                    Unit unit60 = Unit.INSTANCE;
                    intentA = null;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111110 = Unit.INSTANCE;
                    return true;
                case 56:
                    d(activity, lc2.a.GARMIN_PAY_PRIVACY_POLICY, bVar.b(aVar2), false);
                    Unit unit61 = Unit.INSTANCE;
                    intentA = null;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111111 = Unit.INSTANCE;
                    return true;
                case 57:
                    if (((l) zf.b.r()).n()) {
                        d(activity, lc2.a.GARMIN_PAY_TERMS_AND_CONDITIONS, bVar.b(aVar2), false);
                    } else {
                        ij0.a.EnumC1792a enumC1792a = ij0.a.EnumC1792a.GARMINPAY_TERMS_CONDITION;
                        GarminPayLegalActivity.f41563d.getClass();
                        enumC1792a.getClass();
                        Intent intent = new Intent(activity, (Class<?>) GarminPayLegalActivity.class);
                        intent.putExtra("extra_garminpay_legal_type", enumC1792a);
                        activity.startActivity(intent);
                    }
                    Unit unit62 = Unit.INSTANCE;
                    intentA = null;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111112 = Unit.INSTANCE;
                    return true;
                case 58:
                    intentA = a(activity, CopyrightActivity.class, bundle2);
                    Unit unit63 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111113 = Unit.INSTANCE;
                    return true;
                case 59:
                    intentA = a(activity, GCMActivityAppDiagnostics.class, bundle2);
                    Unit unit64 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111114 = Unit.INSTANCE;
                    return true;
                case 60:
                    intentA = a(activity, DeviceSyncAuditViewer.class, bundle2);
                    Unit unit65 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111115 = Unit.INSTANCE;
                    return true;
                case 61:
                    intentA = a(activity, GCMActivitySettingsDeveloper.class, bundle2);
                    Unit unit66 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111116 = Unit.INSTANCE;
                    return true;
                case 62:
                    Locale locale = Locale.getDefault();
                    String strI = GCMSettingManager.k().i();
                    Map<u0, t> map = n0.f203577a;
                    ge1.b.T(f0.w((androidx.lifecycle.n0) activity), null, null, new c(activity, com.nimbusds.jose.shaded.gson.internal.a.h(strI, "/", s1.b(locale), aVar2.getString(R.string.garmin_connect_html_faq_path)), null), 3);
                    intentA = null;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111117 = Unit.INSTANCE;
                    return true;
                case 63:
                    intentA = a(activity, HelpDetailsActivity.class, bundle2);
                    intentA.putExtra("START_DESTINATION", "DIAGNOSTIC_REPORT");
                    Unit unit67 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111118 = Unit.INSTANCE;
                    return true;
                case 64:
                    intentA = a(activity, HelpDetailsActivity.class, bundle2);
                    intentA.putExtra("START_DESTINATION", "PRODUCT_SUPPORT");
                    Unit unit68 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111119 = Unit.INSTANCE;
                    return true;
                case 65:
                    intentA = a(activity, HillScoreActivity.class, bundle2);
                    Unit unit69 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11111110 = Unit.INSTANCE;
                    return true;
                case 66:
                case 67:
                    intentA = a(activity, EnduranceScoreActivity.class, bundle2);
                    Unit unit70 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11111111 = Unit.INSTANCE;
                    return true;
                case 68:
                    intentA = a(activity, StressLevelScoresSummaryActivity.class, bundle2);
                    Unit unit71 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11111112 = Unit.INSTANCE;
                    return true;
                case 69:
                    intentA = a(activity, HydrationActivity.class, bundle2);
                    Unit unit72 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11111113 = Unit.INSTANCE;
                    return true;
                case 70:
                case 71:
                    intentA = a(activity, SafetyFeatureSetupWizardActivity.class, bundle2);
                    Unit unit73 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11111114 = Unit.INSTANCE;
                    return true;
                case 72:
                    InsightsConsentActivity.f32207t.getClass();
                    Intent intent2 = new Intent(activity, (Class<?>) InsightsConsentActivity.class);
                    intent2.putExtra("extra_insights_redirect", 1);
                    activity.startActivity(intent2);
                    Unit unit74 = Unit.INSTANCE;
                    intentA = null;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11111115 = Unit.INSTANCE;
                    return true;
                case 73:
                    ge1.b.T(f0.w((androidx.lifecycle.n0) activity), null, null, new d(activity, null), 3);
                    intentA = null;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11111116 = Unit.INSTANCE;
                    return true;
                case 74:
                    intentA = a(activity, IntensityMinutesReportsActivity.class, bundle2);
                    Unit unit75 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11111117 = Unit.INSTANCE;
                    return true;
                case 75:
                    LactateThresholdSummaryActivity.a aVar10 = LactateThresholdSummaryActivity.f37141p;
                    xs0.a aVar11 = xs0.a.GENERIC;
                    aVar10.getClass();
                    intentA = LactateThresholdSummaryActivity.a.a(activity, aVar11);
                    Unit unit76 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11111118 = Unit.INSTANCE;
                    return true;
                case 76:
                    LactateThresholdSummaryActivity.a aVar12 = LactateThresholdSummaryActivity.f37141p;
                    xs0.a aVar13 = xs0.a.RUNNING;
                    aVar12.getClass();
                    intentA = LactateThresholdSummaryActivity.a.a(activity, aVar13);
                    Unit unit77 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11111119 = Unit.INSTANCE;
                    return true;
                case 77:
                    LactateThresholdSummaryActivity.a aVar14 = LactateThresholdSummaryActivity.f37141p;
                    xs0.a aVar15 = xs0.a.ROWING;
                    aVar14.getClass();
                    intentA = LactateThresholdSummaryActivity.a.a(activity, aVar15);
                    Unit unit78 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111111110 = Unit.INSTANCE;
                    return true;
                case 78:
                    intentA = a(activity, RunningToleranceReportsActivity.class, bundle2);
                    Unit unit79 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111111111 = Unit.INSTANCE;
                    return true;
                case 79:
                    intentA = a(activity, RunningEconomyReportsActivity.class, bundle2);
                    Unit unit80 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111111112 = Unit.INSTANCE;
                    return true;
                case 80:
                    intentA = a(activity, LiveEventSharingActivity.class, bundle2);
                    Unit unit81 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111111113 = Unit.INSTANCE;
                    return true;
                case 81:
                    intentA = a(activity, GroupRideSummaryActivity.class, bundle2);
                    Unit unit82 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111111114 = Unit.INSTANCE;
                    return true;
                case 82:
                case 83:
                case 84:
                case 85:
                    intentA = a(activity, LiveTrackActivity.class, bundle2);
                    Unit unit83 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111111115 = Unit.INSTANCE;
                    return true;
                case 86:
                    intentA = MenstrualCycleDetailsActivity.a.b(MenstrualCycleDetailsActivity.f38784t, activity, false, null, 24);
                    intentA.putExtra("GCM_extra_top_navigation", true);
                    if (bundle2 != null) {
                        intentA.putExtras(bundle2);
                    }
                    Unit unit84 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111111116 = Unit.INSTANCE;
                    return true;
                case 87:
                    c(activity, null, 335544320);
                    Unit unit85 = Unit.INSTANCE;
                    intentA = null;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111111117 = Unit.INSTANCE;
                    return true;
                case 88:
                    NewsFeedActivity.f39429f.getClass();
                    intentA = new Intent(activity, (Class<?>) NewsFeedActivity.class);
                    intentA.putExtra("GCM_extra_top_navigation", true);
                    if (bundle2 != null) {
                        intentA.putExtras(bundle2);
                    }
                    Unit unit86 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111111118 = Unit.INSTANCE;
                    return true;
                case 89:
                    intentA3 = a(activity, DownloadGolfAppDeepLinkActivity.class, bundle2);
                    intentA3.putExtra("action", "performance.stats");
                    Unit unit87 = Unit.INSTANCE;
                    intentA = intentA3;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111111119 = Unit.INSTANCE;
                    return true;
                case 90:
                    intentA = a(activity, PaceProComposeActivity.class, bundle2);
                    Unit unit88 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111111110 = Unit.INSTANCE;
                    return true;
                case 91:
                    intentA = a(activity, PowerGuideListActivity.class, bundle2);
                    Unit unit89 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111111111 = Unit.INSTANCE;
                    return true;
                case 92:
                    intentA = PregnancyGenesisActivity.a.a(PregnancyGenesisActivity.f40516b, activity, false, true, null, false, false, 120);
                    intentA.putExtra("GCM_extra_top_navigation", true);
                    if (bundle2 != null) {
                        intentA.putExtras(bundle2);
                    }
                    Unit unit90 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111111112 = Unit.INSTANCE;
                    return true;
                case 93:
                    intentA = a(activity, PulseOxActivity.class, bundle2);
                    Unit unit91 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111111113 = Unit.INSTANCE;
                    return true;
                case 94:
                    intentA = a(activity, PulseOxAcclimationReportsActivity.class, bundle2);
                    Unit unit92 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111111114 = Unit.INSTANCE;
                    return true;
                case 95:
                    intentA = a(activity, RacePredictorTrendsActivity.class, bundle2);
                    Unit unit93 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111111115 = Unit.INSTANCE;
                    return true;
                case 96:
                    intentA = a(activity, RespirationReportsActivity.class, bundle2);
                    Unit unit94 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111111116 = Unit.INSTANCE;
                    return true;
                case 97:
                    intentA3 = a(activity, DownloadGolfAppDeepLinkActivity.class, bundle2);
                    intentA3.putExtra("action", "scorecard.list");
                    Unit unit95 = Unit.INSTANCE;
                    intentA = intentA3;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111111117 = Unit.INSTANCE;
                    return true;
                case 98:
                    intentA = a(activity, MySegmentsActivity.class, bundle2);
                    Unit unit96 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111111118 = Unit.INSTANCE;
                    return true;
                case 99:
                    return false;
                case 100:
                    intentA = a(activity, SleepReportsActivity.class, bundle2);
                    Unit unit97 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111111119 = Unit.INSTANCE;
                    return true;
                case 101:
                    intentA = a(activity, LifestyleLoggingActivity.class, bundle2);
                    Unit unit98 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11111111110 = Unit.INSTANCE;
                    return true;
                case 102:
                    intentA = a(activity, JetLagActivity.class, bundle2);
                    Unit unit99 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11111111111 = Unit.INSTANCE;
                    return true;
                case 103:
                    intentA = a(activity, StepsActivity.class, bundle2);
                    Unit unit100 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11111111112 = Unit.INSTANCE;
                    return true;
                case 104:
                    intentA = a(activity, PushesActivity.class, bundle2);
                    Unit unit101 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11111111113 = Unit.INSTANCE;
                    return true;
                case 105:
                    intentA = a(activity, StressReportsActivity.class, bundle2);
                    Unit unit102 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11111111114 = Unit.INSTANCE;
                    return true;
                case 106:
                    intentA = a(activity, SwingHistoryActivity.class, bundle2);
                    Unit unit103 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11111111115 = Unit.INSTANCE;
                    return true;
                case 107:
                    intentA = a(activity, TrainingEffectSummaryActivity.class, bundle2);
                    Unit unit104 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11111111116 = Unit.INSTANCE;
                    return true;
                case 108:
                    intentA = a(activity, ActiveTrainingPlansActivity.class, bundle2);
                    Unit unit105 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11111111117 = Unit.INSTANCE;
                    return true;
                case 109:
                    intentA = a(activity, TrainingStatusSummaryActivity.class, bundle2);
                    Unit unit106 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11111111118 = Unit.INSTANCE;
                    return true;
                case 110:
                    intentA = a(activity, TrainingReadinessActivity.class, bundle2);
                    Unit unit107 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11111111119 = Unit.INSTANCE;
                    return true;
                case 111:
                    intentA = a(activity, OvernightHrvActivity.class, bundle2);
                    Unit unit108 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111111111110 = Unit.INSTANCE;
                    return true;
                case 112:
                    intentA = a(activity, WeightReportsActivity.class, bundle2);
                    Unit unit109 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111111111111 = Unit.INSTANCE;
                    return true;
                case 113:
                    intentA = a(activity, BloodPressureReportsActivity.class, bundle2);
                    Unit unit120 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111111111112 = Unit.INSTANCE;
                    return true;
                case 114:
                    intentA = a(activity, WorkoutListActivity.class, bundle2);
                    Unit unit121 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111111111113 = Unit.INSTANCE;
                    return true;
                case 115:
                    intentA = a(activity, VO2MaxReportsActivity.class, bundle2);
                    Unit unit122 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111111111114 = Unit.INSTANCE;
                    return true;
                case 116:
                    intentA = a(activity, EventDashBoardActivity.class, bundle2);
                    Unit unit123 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111111111115 = Unit.INSTANCE;
                    return true;
                case 117:
                    intentA = a(activity, HealthStatusActivity.class, bundle2);
                    Unit unit124 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111111111116 = Unit.INSTANCE;
                    return true;
                case 118:
                    ge1.b.T(f0.w((androidx.lifecycle.n0) activity), null, null, new e(activity, null), 3);
                    intentA = null;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111111111117 = Unit.INSTANCE;
                    return true;
                case 119:
                    intentA = ((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).b(activity);
                    Unit unit125 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111111111118 = Unit.INSTANCE;
                    return true;
                case 120:
                    intentA = ((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).b(activity);
                    Unit unit126 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit111111111119 = Unit.INSTANCE;
                    return true;
                case 121:
                    intentA = ((ub1.i) KoinJavaComponent.get$default(ub1.i.class, null, null, 6, null)).a(activity);
                    Unit unit127 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111111111110 = Unit.INSTANCE;
                    return true;
                case 122:
                    intentA = ((ub1.i) KoinJavaComponent.get$default(ub1.i.class, null, null, 6, null)).b(activity);
                    Unit unit128 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111111111111 = Unit.INSTANCE;
                    return true;
                case 123:
                    ge1.b.T(f0.w((androidx.lifecycle.n0) activity), null, null, new f(activity, null), 3);
                    intentA = null;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111111111112 = Unit.INSTANCE;
                    return true;
                case 124:
                    ((ak0.a) KoinJavaComponent.get$default(ak0.a.class, null, null, 6, null)).e(activity);
                    Unit unit129 = Unit.INSTANCE;
                    intentA = null;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111111111113 = Unit.INSTANCE;
                    return true;
                case 125:
                    ((ak0.a) KoinJavaComponent.get$default(ak0.a.class, null, null, 6, null)).l(activity);
                    Unit unit130 = Unit.INSTANCE;
                    intentA = null;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111111111114 = Unit.INSTANCE;
                    return true;
                case 126:
                    ((ak0.a) KoinJavaComponent.get$default(ak0.a.class, null, null, 6, null)).o(activity);
                    Unit unit131 = Unit.INSTANCE;
                    intentA = null;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111111111115 = Unit.INSTANCE;
                    return true;
                case 127:
                    ((ak0.a) KoinJavaComponent.get$default(ak0.a.class, null, null, 6, null)).r(activity);
                    Unit unit132 = Unit.INSTANCE;
                    intentA = null;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111111111116 = Unit.INSTANCE;
                    return true;
                case 128:
                    ((ak0.a) KoinJavaComponent.get$default(ak0.a.class, null, null, 6, null)).u(activity);
                    Unit unit133 = Unit.INSTANCE;
                    intentA = null;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111111111117 = Unit.INSTANCE;
                    return true;
                case 129:
                    ((ak0.a) KoinJavaComponent.get$default(ak0.a.class, null, null, 6, null)).f(activity);
                    Unit unit134 = Unit.INSTANCE;
                    intentA = null;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111111111118 = Unit.INSTANCE;
                    return true;
                case 130:
                    ((ak0.a) KoinJavaComponent.get$default(ak0.a.class, null, null, 6, null)).c(activity);
                    Unit unit135 = Unit.INSTANCE;
                    intentA = null;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit1111111111119 = Unit.INSTANCE;
                    return true;
                case 131:
                    ((ak0.a) KoinJavaComponent.get$default(ak0.a.class, null, null, 6, null)).k(activity);
                    Unit unit136 = Unit.INSTANCE;
                    intentA = null;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11111111111110 = Unit.INSTANCE;
                    return true;
                case 132:
                    intentA = null;
                    ak0.a aVar16 = (ak0.a) KoinJavaComponent.get$default(ak0.a.class, null, null, 6, null);
                    if (aVar16.m()) {
                        intentA = ((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).b(activity);
                    } else {
                        aVar16.j(activity);
                    }
                    Unit unit137 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11111111111111 = Unit.INSTANCE;
                    return true;
                case 133:
                    intentA = ((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).b(activity);
                    Unit unit138 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11111111111112 = Unit.INSTANCE;
                    return true;
                case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                    NotificationSettingsActivity.f43568b.getClass();
                    intentA3 = new Intent(activity, (Class<?>) NotificationSettingsActivity.class);
                    intentA3.putExtra("VIEW_PUSH_NOTIFICATION_SETTINGS", true);
                    intentA3.putExtra("EXTRA_SCROLL_TO_ITEM", (Serializable) null);
                    Unit unit139 = Unit.INSTANCE;
                    intentA = intentA3;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11111111111113 = Unit.INSTANCE;
                    return true;
                case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                    intentA = ((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).e(activity, true);
                    Unit unit140 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11111111111114 = Unit.INSTANCE;
                    return true;
                case SyslogConstants.LOG_LOCAL1 /* 136 */:
                    intentA = a(activity, MultiDayActivitiesListActivity.class, bundle2);
                    Unit unit141 = Unit.INSTANCE;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11111111111115 = Unit.INSTANCE;
                    return true;
                default:
                    com.airbnb.lottie.animation.keyframe.a.A("handleItemSelected: Could not identify drawerItem ", bVar.name(), b.f39358b);
                    Unit unit142 = Unit.INSTANCE;
                    intentA = null;
                    if (intentA != null) {
                        return true;
                    }
                    activity.startActivity(intentA);
                    if (z15) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (!(activity instanceof DashboardActivity)) {
                            activity.finish();
                        }
                    }
                    Unit unit11111111111116 = Unit.INSTANCE;
                    return true;
            }
        }

        public static void c(Context context, Bundle bundle, int i14) {
            Intent intent;
            context.getClass();
            p0.f195200a.getClass();
            p0.f195202c = false;
            Intent intent2 = new Intent(context, (Class<?>) DashboardActivity.class);
            if (bundle == null) {
                bundle = new Bundle();
            }
            intent2.putExtras(bundle);
            intent2.addFlags(i14);
            context.startActivity(intent2);
            e80.a aVar = (e80.a) KoinJavaComponent.get$default(e80.a.class, null, null, 6, null);
            f80.a data = aVar.getData();
            if (data != null) {
                GarminConnectMobileApp.f28685g.getClass();
                Context contextA = GarminConnectMobileApp.a.a();
                int i15 = C0703a.f39361c[data.f69943b.ordinal()];
                if (i15 == 1) {
                    intent = new Intent(contextA, (Class<?>) GCMCommonDeepLinkHandler.class);
                } else if (i15 == 2) {
                    intent = new Intent(contextA, (Class<?>) WebLinkHandlerActivity.class);
                } else {
                    if (i15 != 3) {
                        lc.u0.r();
                        return;
                    }
                    intent = new Intent(contextA, (Class<?>) GSMRedirectActivity.class);
                }
                intent.setData(Uri.parse(data.f69942a));
                intent.setAction("android.intent.action.VIEW");
                intent.addFlags(268435456);
                aVar.b();
                Unit unit = Unit.INSTANCE;
                contextA.startActivity(intent);
            }
        }

        public static void d(Activity activity, lc2.a aVar, String str, boolean z14) {
            String strO;
            SpannableString spannableString;
            if (z14) {
                x0 x0Var = x0.f105818a;
                String str2 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(a7.b.getColor(activity, R.color.gcm_text_primary) & FlexItem.MAX_SIZE)}, 1));
                strO = am.j.o(str2, " !important;\n}", p6.b.i("body {\n    color: ", str2, ";\n    background-color: ", String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(16777215 & a7.b.getColor(activity, R.color.gcm_background_hero))}, 1)), ";\n }\np span {\n  color: "));
            } else {
                strO = null;
            }
            LegalGatewayActivity.a aVar2 = LegalGatewayActivity.f49928n;
            boolean zF = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f();
            if (str == null) {
                spannableString = null;
            } else {
                spannableString = new SpannableString(str);
                spannableString.setSpan(new AbsoluteSizeSpan((int) c22.b.b(activity, activity.getResources().getDimensionPixelSize(R.dimen.andfont_body_1), 1.3f)), 0, spannableString.length(), 18);
            }
            String string = spannableString != null ? spannableString.toString() : null;
            aVar2.getClass();
            LegalGatewayActivity.a.a(activity, 0, aVar, zF, false, strO, false, string);
        }

        private a() {
        }
    }
}
