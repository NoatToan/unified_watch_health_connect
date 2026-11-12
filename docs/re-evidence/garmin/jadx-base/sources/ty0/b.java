package ty0;

import c22.g2;
import c22.x0;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mapbox.maps.MapboxMap;
import d53.u;
import f72.a3;
import f72.ae;
import f72.ba;
import f72.bd;
import f72.d1;
import f72.e1;
import f72.q;
import f72.r2;
import f72.s;
import f72.t;
import f72.w2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o4.d0;
import org.slf4j.Marker;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p13.w;
import p13.x;
import p3.x1;
import v62.a8;
import v62.d2;
import v62.e4;
import v62.h4;
import v62.k7;
import v62.l9;
import v62.m2;
import v62.m9;
import v62.n7;
import v62.o8;
import v62.r0;
import v62.s5;
import v62.w0;
import v62.x3;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'v' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0015B\u007f\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0003\u0010\f\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lty0/b;", "Lty0/j;", "", "", Action.KEY_ATTRIBUTE, "", "externalRedirect", "", "labelRes", "labelContentDescriptionResId", "Lc22/g2;", "onDemandLabelRes", "descriptionRes", "", MapboxMap.QFE_CHILDREN, "bottomNavBarItem", "analyticsEventAction", "", "relatedLabelRes", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZIILjava/lang/String;I[Lty0/b;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements j {
    public static final b A;
    public static final b A1;
    public static final b A2;
    public static final b B;
    public static final b B1;
    public static final b B2;
    public static final b C;
    public static final b C1;
    public static final b C2;
    public static final b D;
    public static final b D1;
    public static final b D2;
    public static final b E;
    public static final b E1;
    public static final b E2;
    public static final b F;
    public static final b F1;
    public static final b F2;
    public static final b G1;
    public static final b G2;
    public static final b H0;
    public static final b H1;
    public static final b H2;
    public static final b I;
    public static final b I0;
    public static final b I1;
    public static final b I2;
    public static final b J0;
    public static final b J1;
    public static final b J2;
    public static final b K0;
    public static final b K1;
    public static final b K2;
    public static final b L0;
    public static final b L1;
    public static final b L2;
    public static final b M0;
    public static final b M1;
    public static final b M2;
    public static final b N0;
    public static final b N1;
    public static final b N2;
    public static final b O0;
    public static final b O1;
    public static final b O2;
    public static final b P;
    public static final b P0;
    public static final b P1;
    public static final b P2;
    public static final b Q0;
    public static final b Q1;
    public static final b Q2;
    public static final b R0;
    public static final b R1;
    public static final b R2;
    public static final b S0;
    public static final b S1;
    public static final b S2;
    public static final b T;
    public static final b T0;
    public static final b T1;
    public static final b T2;
    public static final b U0;
    public static final b U1;
    public static final b U2;
    public static final b V0;
    public static final b V1;
    public static final b V2;
    public static final b W0;
    public static final b W1;
    public static final b W2;
    public static final b X;
    public static final b X0;
    public static final b X1;
    public static final b X2;
    public static final b Y;
    public static final b Y0;
    public static final b Y1;
    public static final b Y2;
    public static final b Z;
    public static final b Z0;
    public static final b Z1;
    public static final b Z2;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final b f166854a1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public static final b f166855a2;

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public static final b f166856a3;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final b f166857b1;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public static final b f166858b2;

    /* JADX INFO: renamed from: b3, reason: collision with root package name */
    public static final b f166859b3;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final b f166860c1;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public static final b f166861c2;

    /* JADX INFO: renamed from: c3, reason: collision with root package name */
    public static final b f166862c3;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final b f166863d1;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public static final b f166864d2;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final b f166865d3;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final b f166866e1;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public static final b f166867e2;

    /* JADX INFO: renamed from: e3, reason: collision with root package name */
    public static final b f166868e3;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final b f166869f1;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public static final b f166870f2;

    /* JADX INFO: renamed from: f3, reason: collision with root package name */
    public static final b f166871f3;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final b f166872g1;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public static final b f166873g2;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final b f166874g3;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final b f166875h1;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public static final b f166876h2;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final b f166877h3;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final b f166878i1;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public static final b f166879i2;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final b f166880i3;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final b f166881j1;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public static final b f166882j2;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final b f166883j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f166884k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final b f166885k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final b f166886k1;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public static final b f166887k2;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final b f166888k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f166889l;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final b f166890l1;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public static final b f166891l2;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public static final b f166892l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f166893m;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final b f166894m1;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public static final b f166895m2;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public static final /* synthetic */ b[] f166896m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f166897n;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final b f166898n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public static final b f166899n2;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public static final /* synthetic */ w13.c f166900n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f166901o;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final b f166902o1;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public static final b f166903o2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f166904p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final b f166905p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final b f166906p2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f166907q;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final b f166908q1;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public static final b f166909q2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f166910r;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final b f166911r1;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public static final b f166912r2;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final b f166913s1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public static final b f166914s2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f166915t;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final b f166916t1;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public static final b f166917t2;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final b f166918u1;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public static final b f166919u2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f166920v;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final b f166921v1;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public static final b f166922v2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f166923w;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final b f166924w1;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public static final b f166925w2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f166926x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final b f166927x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final b f166928x2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f166929y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final b f166930y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final b f166931y2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final b f166932z;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final b f166933z1;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public static final b f166934z2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f166937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f166938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f166939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f166940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b[] f166941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f166942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f166943i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<Integer> f166944j;

    /* JADX INFO: renamed from: ty0.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C3139b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f166945a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f166910r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f166928x2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.A2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f166945a = iArr;
        }
    }

    static {
        b bVar = new b("SEPARATOR", 0, "SEPARATOR", false, 0, 0, null, 0, null, null, null, null, 1022, null);
        f166889l = bVar;
        b bVar2 = new b("STEPS", 1, "STEPS", false, R.string.concept_steps, 0, null, 0, null, null, "MenuItemOpenedSteps", null, 762, null);
        f166893m = bVar2;
        b bVar3 = new b("WHEELCHAIR_PUSHES", 2, "WHEELCHAIR_PUSHES", false, R.string.lbl_pushes, 0, null, 0, null, null, "MenuItemOpenedWheelchairPushes", null, 762, null);
        f166897n = bVar3;
        b bVar4 = new b("ALL_ACTIVITIES", 3, "ALL_ACTIVITIES", false, R.string.lbl_all_activities, 0, null, 0, null, null, "MenuItemOpenedAllActivities", null, 762, null);
        f166901o = bVar4;
        b bVar5 = new b("FLOORS", 4, "FLOORS", false, R.string.floors_title, 0, null, 0, null, null, "MenuItemOpenedFloors", null, 762, null);
        f166904p = bVar5;
        b bVar6 = new b("INTENSITY_MINUTES", 5, "INTENSITY_MINUTES", false, R.string.title_intensity_minutes, 0, null, 0, null, null, "MenuItemOpenedIntensityMinutes", null, 762, null);
        f166907q = bVar6;
        b bVar7 = new b("CREATE_MANUAL_ACTIVITIES", 6, "CREATE_MANUAL_ACTIVITIES", false, R.string.lbl_create_manual_activities, 0, null, 0, null, null, "MenuItemOpenedCreateManualActivities", null, 762, null);
        f166910r = bVar7;
        x0.f23314a.getClass();
        b bVar8 = new b("MULTI_DAY_ACTIVITIES", 7, "MULTI_DAY_ACTIVITIES", false, 0, 0, x0.f23492ka, 0, null, null, "MenuItemOpenedAllMultiDayActivities", null, 750, null);
        f166915t = bVar8;
        b bVar9 = new b("ACTIVITIES", 8, "ACTIVITIES", false, R.string.concept_activities, 0, null, 0, new b[]{bVar4, bVar, bVar7, bVar, bVar8, bVar, bVar3, bVar2, bVar5, bVar6}, null, "MenuItemOpenedActivities", null, 698, null);
        f166920v = bVar9;
        b bVar10 = new b("SCORECARDS", 9, "SCORECARDS", true, R.string.golf_scorecards_component_title, 0, null, 0, null, "GOLF_SCORECARD", "MenuItemOpenedScorecards", null, 632, null);
        f166923w = bVar10;
        b bVar11 = new b("GOLF_COURSE_STATS", 10, "GOLF_COURSE_STATS", true, R.string.golf_courses_stats_component_title, 0, null, 0, null, "GOLF_COURSES", "MenuItemOpenedGolfCourseStats", null, 632, null);
        f166926x = bVar11;
        b bVar12 = new b("OVERALL_STATS", 11, "OVERALL_STATS", true, R.string.golf_overall_stats_component_title, 0, null, 0, null, "GOLF_STATS", "MenuItemOpenedOverallStats", null, 632, null);
        f166929y = bVar12;
        b bVar13 = new b("GOLF", 12, "GOLF", false, R.string.lbl_golf, 0, null, 0, new b[]{bVar10, bVar11, bVar12}, null, "MenuItemOpenedGolf", null, 698, null);
        f166932z = bVar13;
        b bVar14 = new b("DIVE_LOG", 13, "DIVE_LOG", true, R.string.lbl_dive_log_item, 0, null, 0, null, "DIVE_LOG", "MenuItemOpenedDiveLog", null, 632, null);
        A = bVar14;
        b bVar15 = new b("DIVE_GEAR", 14, "DIVE_GEAR", true, R.string.lbl_dive_gear_item, 0, null, 0, null, "DIVE_GEAR", "MenuItemOpenedDiveGear", null, 632, null);
        B = bVar15;
        b bVar16 = new b("DIVE_REDIRECT", 15, "DIVE_REDIRECT", false, R.string.lbl_dive_section, 0, null, 0, new b[]{bVar14, bVar15}, null, "MenuItemOpenedGarminDiveApp", null, 698, null);
        C = bVar16;
        b bVar17 = new b("VO2", 16, "VO2", false, R.string.lbl_vo2_max, 0, null, 0, null, null, "MenuItemOpenedVO2", null, 762, null);
        D = bVar17;
        b bVar18 = new b("RUNNING_TOLERANCE", 17, "RUNNING_TOLERANCE", false, R.string.running_tolerance, 0, null, 0, null, null, "MenuItemOpenedRunningTolerance", null, 762, null);
        E = bVar18;
        b bVar19 = new b("RUNNING_ECONOMY", 18, "RUNNING_ECONOMY", false, R.string.running_economy, 0, null, 0, null, null, "MenuItemOpenedRunningEconomy", null, 762, null);
        F = bVar19;
        b bVar20 = new b("LACTATE_THRESHOLD", 19, "LACTATE_THRESHOLD", false, R.string.lbl_lactate_threshold, 0, null, 0, null, null, "MenuItemOpenedLactateThreshold", null, 762, null);
        I = bVar20;
        b bVar21 = new b("RUNNING_LACTATE_THRESHOLD", 20, "RUNNING_LACTATE_THRESHOLD", false, R.string.lbl_running_lactate_threshold, 0, null, 0, null, null, "MenuItemOpenedLactateThreshold", null, 762, null);
        P = bVar21;
        b bVar22 = new b("ROWING_LACTATE_THRESHOLD", 21, "ROWING_LACTATE_THRESHOLD", false, R.string.lbl_rowing_lactate_threshold, 0, null, 0, null, null, "MenuItemOpenedLactateThreshold", null, 762, null);
        T = bVar22;
        b bVar23 = new b("FUNCTIONAL_THRESHOLD_POWER", 22, "FUNCTIONAL_THRESHOLD_POWER", false, R.string.lbl_functional_threshold_power_short, 0, null, 0, null, null, "MenuItemOpenedFunctionalThresholdPower", null, 762, null);
        X = bVar23;
        b bVar24 = new b("CYCLING_ABILITY", 23, "CYCLING_ABILITY", false, R.string.lbl_cycling_ability, 0, null, 0, null, null, "MenuItemOpenedCyclingAbility", null, 762, null);
        Y = bVar24;
        b bVar25 = new b("CRITICAL_SWIM_SPEED", 24, "CRITICAL_SWIM_SPEED", false, R.string.lbl_css, 0, null, 0, null, null, "MenuItemOpenedCriticalSwimSpeed", null, 762, null);
        Z = bVar25;
        b bVar26 = new b("TRAINING_EFFECT", 25, "TRAINING_EFFECT", false, R.string.activity_details_training_effect, 0, null, 0, null, null, "MenuItemOpenedTrainingEffect", null, 762, null);
        f166885k0 = bVar26;
        b bVar27 = new b("HRV_STRESS", 26, "HRV_STRESS", false, R.string.lbl_hrv_stress, 0, null, 0, null, null, "MenuItemOpenedHRVStress", null, 762, null);
        H0 = bVar27;
        b bVar28 = new b("TRAINING_STATUS", 27, "TRAINING_STATUS", false, R.string.lbl_training_status, 0, null, 0, null, null, "MenuItemOpenedTrainingStatus", null, 762, null);
        I0 = bVar28;
        b bVar29 = new b("TRAINING_READINESS", 28, "TRAINING_READINESS", false, R.string.training_readiness, 0, null, 0, null, null, "MenuItemOpenedTrainingReadiness", null, 762, null);
        J0 = bVar29;
        b bVar30 = new b("HRV_STATUS", 29, "HRV_STATUS", false, R.string.ohrv_status, 0, null, 0, null, null, "MenuItemOpenedHRVStatus", null, 762, null);
        K0 = bVar30;
        b bVar31 = new b("CYCLING_POWER_CURVE", 30, "CYCLING_POWER_CURVE", false, R.string.cycling_power_curve_label, 0, null, 0, null, null, "MenuItemOpenedCyclingPowerCurve", null, 762, null);
        L0 = bVar31;
        b bVar32 = new b("ROWING_POWER_CURVE", 31, "ROWING_POWER_CURVE", false, R.string.rowing_power_curve_label, 0, null, 0, null, null, "MenuItemOpenedRowingPowerCurve", null, 762, null);
        M0 = bVar32;
        b bVar33 = new b("RACE_PREDICTOR_TRENDS", 32, "RACE_PREDICTOR_TRENDS", false, R.string.lbl_race_predictor, 0, null, 0, null, null, "MenuItemOpenedRacePredictorTrends", null, 762, null);
        N0 = bVar33;
        b bVar34 = new b("HILL_SCORE", 33, "HILL_SCORE", false, R.string.lbl_hill_score, 0, null, 0, null, null, "MenuItemOpenedHillScore", null, 762, null);
        O0 = bVar34;
        b bVar35 = new b("ENDURANCE_SCORE", 34, "ENDURANCE_SCORE", false, R.string.lbl_endurance_score, 0, null, 0, null, null, "MenuItemOpenedEnduranceScore", null, 762, null);
        P0 = bVar35;
        b bVar36 = new b("ENDURANCE_AND_STAMINA", 35, "ENDURANCE_AND_STAMINA", false, R.string.lbl_endurance_stamina_title, 0, null, 0, null, null, "MenuItemOpenedEnduranceScore", null, 762, null);
        Q0 = bVar36;
        b bVar37 = new b("PERFORMANCE_STATS", 36, "PERFORMANCE_STATS", false, R.string.lbl_performance_stats, 0, null, 0, new b[]{bVar, bVar28, bVar29, bVar30, bVar33, bVar17, bVar19, bVar26, bVar31, bVar32, bVar23, bVar24, bVar25, bVar18, bVar21, bVar22, bVar20, bVar35, bVar36, bVar34, bVar27, bVar}, "PERFORMANCE", "MenuItemOpenedPerformanceStats", null, 570, null);
        R0 = bVar37;
        b bVar38 = new b("SLEEP", 37, "SLEEP", false, R.string.concept_sleep, 0, null, 0, null, null, "MenuItemOpenedSleep", null, 762, null);
        S0 = bVar38;
        b bVar39 = new b("WEIGHT", 38, "WEIGHT", false, R.string.card_weight_title, 0, null, 0, null, null, "MenuItemOpenedWeight", null, 762, null);
        T0 = bVar39;
        b bVar40 = new b("BLOOD_PRESSURE", 39, "BLOOD_PRESSURE", false, R.string.lbl_blood_pressure, 0, null, 0, null, null, "MenuItemOpenedBloodPressure", null, 762, null);
        U0 = bVar40;
        b bVar41 = new b("PULSE_OX", 40, "PULSE_OX", false, R.string.device_settings_pulse_ox, 0, null, 0, null, null, "MenuItemOpenedPulseOx", null, 762, null);
        V0 = bVar41;
        b bVar42 = new b("PULSE_OX_ACCLIMATION", 41, "PULSE_OX_ACCLIMATION", false, R.string.pulse_ox_lbl_acclimation, 0, null, 0, null, null, "MenuItemOpenedPulseOxAcclimation", null, 762, null);
        W0 = bVar42;
        b bVar43 = new b("RESPIRATION", 42, "RESPIRATION", false, R.string.activities_respiration_title, 0, null, 0, null, null, "MenuItemOpenedRespiration", null, 762, null);
        X0 = bVar43;
        b bVar44 = new b("HEART_RATE", 43, "HEART_RATE", false, R.string.lbl_heart_rate_cap, 0, null, 0, null, null, "MenuItemOpenedHeartRate", null, 762, null);
        Y0 = bVar44;
        b bVar45 = new b("STRESS", 44, "STRESS", false, R.string.title_stress, 0, null, 0, null, null, "MenuItemOpenedStress", null, 762, null);
        Z0 = bVar45;
        b bVar46 = new b("BODY_BATTERY", 45, "BODY_BATTERY", false, R.string.gcm_body_battery_lbl_body_battery, 0, null, 0, null, null, "MenuItemOpenedBodyBattery", null, 762, null);
        f166854a1 = bVar46;
        b bVar47 = new b("MENSTRUAL_CYCLE", 46, "MENSTRUAL_CYCLE", false, R.string.mct_menstrual_cycle, 0, null, 0, null, "MENSTRUAL_CYCLE", "MenuItemOpenedMenstrualCycle", null, 634, null);
        f166857b1 = bVar47;
        b bVar48 = new b("PREGNANCY", 47, "PREGNANCY", false, R.string.pregnancy_title, 0, null, 0, null, "PREGNANCY", "MenuItemOpenedPregnancy", null, 634, null);
        f166860c1 = bVar48;
        b bVar49 = new b("FITNESS_AGE", 48, "FITNESS_AGE", false, R.string.lbl_fitness_age, 0, null, 0, null, null, "MenuItemOpenedFitnessAge", null, 762, null);
        f166863d1 = bVar49;
        b bVar50 = new b("HEALTH_SNAPSHOT", 49, "HEALTH_SNAPSHOT", false, R.string.lbl_health_snapshot, 0, null, 0, null, null, "MenuItemOpenedHealthSnapshot", null, 762, null);
        f166866e1 = bVar50;
        b bVar51 = new b("ECG", 50, "ECG", false, R.string.lbl_ecg, 0, null, 0, null, null, "MenuItemOpenedHealthSnapshot", null, 762, null);
        f166869f1 = bVar51;
        b bVar52 = new b("LIFESTYLE_LOGGING", 51, "LIFESTYLE_LOGGING", false, R.string.lbl_lifestyle_logging, 0, null, 0, null, "LIFESTYLE_LOGGING", "MenuItemOpenedLifestyleLoggingEventSharing", null, 634, null);
        f166872g1 = bVar52;
        b bVar53 = new b("HEALTH_STATUS", 52, "HEALTH_STATUS", false, R.string.lbl_health_status, 0, null, 0, null, null, "MenuItemOpenedHealthStatus", null, 762, null);
        f166875h1 = bVar53;
        b bVar54 = new b("HEALTH_STATS", 53, "HEALTH_STATS", false, R.string.lbl_health_stats, 0, null, 0, new b[]{bVar, bVar38, bVar53, bVar52, bVar39, bVar41, bVar42, bVar43, bVar44, bVar40, bVar45, bVar46, bVar17, bVar47, bVar48, bVar49, bVar51, bVar50, bVar}, "HEALTH", "MenuItemOpenedHealthStats", null, 570, null);
        f166878i1 = bVar54;
        b bVar55 = new b("HEALTH_STATS_AND_PERFORMANCE", 54, "HEALTH_STATS_AND_PERFORMANCE", false, R.string.lbl_health_and_performance, 0, null, 0, bVar54.f166941g, "HEALTH", "MenuItemOpenedHealthStats", null, 570, null);
        f166881j1 = bVar55;
        b bVar56 = new b("NUTRITION", 55, "NUTRITION", false, R.string.lbl_nutrition, 0, null, 0, null, "NUTRITION", "MenuItemOpenedNutrition", null, 634, null);
        f166886k1 = bVar56;
        b bVar57 = new b("HYDRATION", 56, "HYDRATION", false, R.string.lbl_hydration_title, 0, null, 0, null, null, "MenuItemOpenedHydration", null, 762, null);
        f166890l1 = bVar57;
        b bVar58 = new b("CALORIES_BURNED", 57, "CALORIES_BURNED", false, R.string.lbl_calories_burned, 0, null, 0, null, null, "MenuItemOpenedCalories", null, 762, null);
        f166894m1 = bVar58;
        b bVar59 = new b("NUTRITION_MENU", 58, "NUTRITION_MENU", false, R.string.lbl_nutrition, 0, null, 0, new b[]{bVar, bVar56, bVar57, bVar58, bVar}, null, "MenuItemOpenedNutritionMenu", null, 698, null);
        f166898n1 = bVar59;
        b bVar60 = new b("INCIDENT_DETECTION_AND_ASSISTANCE", 59, "INCIDENT_DETECTION_AND_ASSISTANCE", false, R.string.device_settings_safety_features, 0, null, 0, null, null, "MenuItemOpenedIncidentDetection", null, 762, null);
        f166902o1 = bVar60;
        b bVar61 = new b("INCIDENT_DETECTION", 60, "INCIDENT_DETECTION", false, R.string.device_settings_safety_features, 0, null, 0, null, null, "MenuItemOpenedIncidentDetection", null, 762, null);
        f166905p1 = bVar61;
        b bVar62 = new b("LIVETRACK", 61, "LIVETRACK", false, R.string.title_live_track, 0, null, 0, null, null, "MenuItemOpenedLivetrack", null, 762, null);
        f166908q1 = bVar62;
        b bVar63 = new b("LIVETRACK_IN_PROGRESS", 62, "LIVETRACK_IN_PROGRESS", false, R.string.live_track_in_progress, 0, null, 0, null, null, "MenuItemOpenedLivetrack", null, 762, null);
        f166911r1 = bVar63;
        b bVar64 = new b("LIVE_EVENT_SHARING", 63, "LIVE_EVENT_SHARING", false, R.string.live_event_sharing_title, 0, null, 0, null, null, "MenuItemOpenedLiveEventSharing", null, 762, null);
        f166913s1 = bVar64;
        b bVar65 = new b("GROUP_RIDE", 64, "GROUP_RIDE", false, R.string.lbl_group_ride, 0, null, 0, null, null, "MenuItemOpenedGroupRide", null, 762, null);
        f166916t1 = bVar65;
        b bVar66 = new b("WORKOUTS", 65, "WORKOUTS", false, R.string.concept_workouts, 0, null, 0, null, "WORKOUTS", "MenuItemOpenedWorkouts", null, 634, null);
        f166918u1 = bVar66;
        b bVar67 = new b("TRAINING_PLANS", 66, "TRAINING_PLANS", false, R.string.atp_lbl_plans_section_title, 0, null, 0, null, "GARMIN_COACH", "MenuItemOpenedTrainingPlans", null, 634, null);
        f166921v1 = bVar67;
        b bVar68 = new b("COURSES", 67, "COURSES", false, R.string.concept_courses, 0, null, 0, null, "COURSES", "MenuItemOpenedCourses", null, 634, null);
        f166924w1 = bVar68;
        b bVar69 = new b("SEGMENTS", 68, "SEGMENTS", false, R.string.card_segments_title, 0, null, 0, null, "SEGMENTS", "MenuItemOpenedSegments", null, 634, null);
        f166927x1 = bVar69;
        b bVar70 = new b("PACE_PRO", 69, "PACE_PRO", false, R.string.pacepro_extended_title, 0, null, 0, null, "PACEPRO", "MenuItemOpenedPacepro", null, 634, null);
        f166930y1 = bVar70;
        b bVar71 = new b("POWER_GUIDE", 70, "POWER_GUIDE", false, R.string.power_guide_title, 0, null, 0, null, "POWER_GUIDE", "MenuItemOpenedPowerGuide", null, 634, null);
        f166933z1 = bVar71;
        b bVar72 = new b("GARMIN_TRAILS", 71, "GARMIN_TRAILS", false, R.string.lbl_garmin_trails, 0, null, 0, null, null, "MenuItemOpenedGarminTrails", null, 762, null);
        A1 = bVar72;
        b bVar73 = new b("JET_LAG", 72, "JET_LAG", false, R.string.lbl_jet_lag_advisor, 0, null, 0, null, null, "MenuItemOpenedJetLag", null, 762, null);
        B1 = bVar73;
        b bVar74 = new b("EVENTS", 73, "EVENTS", false, R.string.races_and_events, 0, null, 0, null, null, "MenuItemOpenedEvents", null, 762, null);
        C1 = bVar74;
        b bVar75 = new b("ACTIVITY_TRACKING_ACCURACY", 74, "ACTIVITY_TRACKING_ACCURACY", false, R.string.legal_disclaimer_tracking_accuracy_abbrev, 0, null, 0, null, null, "MenuItemOpenedActivityTrackingAccuracy", null, 762, null);
        D1 = bVar75;
        E1 = new b("HOME", 75, "HOME", false, R.string.lbl_home, 0, null, 0, null, null, null, null, 1018, null);
        b bVar76 = new b("GARMIN_CONNECT_PLUS", 76, "GARMIN_CONNECT_PLUS", false, R.string.lbl_garmin_connect_plus, 0, null, 0, null, null, "MenuItemOpenedGarminConnectPlus", null, 762, null);
        F1 = bVar76;
        b bVar77 = new b("CHALLENGES", 77, "CHALLENGES", false, R.string.concept_challenges, 0, null, 0, null, "CHALLENGES", "MenuItemOpenedChallenges", null, 634, null);
        G1 = bVar77;
        b bVar78 = new b("INSIGHTS", 78, "INSIGHTS", false, R.string.title_insights, 0, null, 0, null, "INSIGHTS", "MenuItemOpenedInsights", null, 634, null);
        H1 = bVar78;
        b bVar79 = new b("GARMIN_PAY", 79, "GARMIN_PAY", false, 0, 0, null, 0, null, "GARMINPAY", "MenuItemOpenedGarminPay", null, 634, null);
        I1 = bVar79;
        b bVar80 = new b("CALENDAR", 80, "CALENDAR", false, R.string.lbl_calendar, 0, null, 0, null, "CALENDAR", "MenuItemOpenedCalendar", null, 634, null);
        J1 = bVar80;
        b bVar81 = new b("ACTIVITY_STATS", 81, "ACTIVITY_STATS", false, R.string.concept_activities, 0, null, 0, new b[]{bVar9, bVar13, bVar16, bVar}, "ACTIVITIES", "MenuItemOpenedActivityStats", null, 570, null);
        K1 = bVar81;
        b bVar82 = new b("TRAINING_AND_PLANNING", 82, "TRAINING_AND_PLANNING", false, R.string.lbl_training_and_planning, 0, null, 0, new b[]{bVar, bVar66, bVar67, bVar74, bVar, bVar68, bVar70, bVar71, bVar69, bVar, bVar72, bVar, bVar73}, "TRAINING_AND_PLANNING", "MenuItemOpenedStrengthTrainingAndPlanning", null, 570, null);
        L1 = bVar82;
        b bVar83 = new b("GEAR", 83, "GEAR", false, R.string.concept_gear, 0, null, 0, null, null, "MenuItemOpenedGear", null, 762, null);
        M1 = bVar83;
        b bVar84 = new b("NEWS_FEED", 84, "NEWS_FEED", false, R.string.concept_news_feed, 0, null, 0, null, "NEWS_FEED", "MenuItemOpenedNewsFeed", null, 634, null);
        N1 = bVar84;
        b bVar85 = new b("PERFORMANCE_DASHBOARD", 85, "PERFORMANCE_DASHBOARD", true, R.string.performance_dashboard, 0, null, 0, null, null, "MenuItemOpenedPerformanceDashboard", null, 760, null);
        O1 = bVar85;
        P1 = new b("CONNECTIONS", 86, "CONNECTIONS", false, R.string.concept_my_connections, 0, null, 0, null, null, "MenuItemOpenedConnections", null, 762, null);
        b bVar86 = new b("FRIENDS", 87, "FRIENDS", false, R.string.concept_my_friends, 0, null, 0, null, null, "MenuItemOpenedConnections", null, 762, null);
        Q1 = bVar86;
        b bVar87 = new b("GROUPS", 88, "GROUPS", false, R.string.lbl_groups, 0, null, 0, null, null, "MenuItemOpenedGroups", null, 762, null);
        R1 = bVar87;
        b bVar88 = new b("CONTACTS", 89, "CONTACTS", false, R.string.contact_management_title_contacts, 0, null, 0, null, null, "MenuItemOpenedContacts", null, 762, null);
        S1 = bVar88;
        b bVar89 = new b("LIVETRACK_MAIN", 90, "LIVETRACK_MAIN", false, R.string.title_live_track, 0, null, 0, null, null, "MenuItemOpenedLivetrack", null, 762, null);
        T1 = bVar89;
        b bVar90 = new b("LIVETRACK_MAIN_IN_PROGRESS", 91, "LIVETRACK_MAIN_IN_PROGRESS", false, R.string.live_track_in_progress, 0, null, 0, null, null, "MenuItemOpenedLivetrack", null, 762, null);
        U1 = bVar90;
        b bVar91 = new b("SAFETY_AND_TRACKING", 92, "SAFETY_AND_TRACKING", false, R.string.incident_safety_and_tracking, 0, null, 0, new b[]{bVar, bVar60, bVar61, bVar62, bVar63, bVar64, bVar65, bVar}, null, "MenuItemOpenedSafetyAndTracking", null, 698, null);
        V1 = bVar91;
        b bVar92 = new b("SWING_ANALYSIS", 93, "SWING_ANALYSIS", false, R.string.golf_swing_analysis_component_title, 0, null, 0, null, null, "MenuItemOpenedSwingAnalysis", null, 762, null);
        W1 = bVar92;
        b bVar93 = new b("DOWNLOADED_GOLF_COURSES", 94, "DOWNLOADED_GOLF_COURSES", false, R.string.lbl_download_golf_courses_abbr, 0, null, 0, null, null, "MenuItemOpenedDownloadedGolfCourses", null, 762, null);
        X1 = bVar93;
        b bVar94 = new b("GARMIN_GOLF_APP", 95, "GARMIN_GOLF_APP", true, R.string.lbl_garmin_golf_app, 0, null, 0, null, "GARMIN_GOLF", "MenuItemOpenedGarminGolfApp", null, 632, null);
        Y1 = bVar94;
        b bVar95 = new b("GARMIN_DIVE_APP", 96, "GARMIN_DIVE_APP", true, R.string.diving_app_title, 0, null, 0, null, "GARMIN_DIVE", "MenuItemOpenedGarminDiveApp", null, 632, null);
        Z1 = bVar95;
        b bVar96 = new b("CONNECT_IQ_STORE", 97, "CONNECT_IQ_STORE", true, R.string.connect_iq_store_title, 0, null, 0, null, "CIQ_STORE", "MenuItemOpenedConnectIQStore", x.k(Integer.valueOf(R.string.device_setting_watch_face), Integer.valueOf(R.string.connect_iq_data_field), Integer.valueOf(R.string.help_app), Integer.valueOf(R.string.lbl_ciq_abbrev)), 120, null);
        f166855a2 = bVar96;
        b bVar97 = new b("GARMIN_DEVICES", 98, "GARMIN_DEVICES", false, R.string.concept_garmin_devices, 0, null, 0, null, "GarminDevicesMenuClicked", "MenuItemOpenedGarminDevices", null, 634, null);
        f166858b2 = bVar97;
        b bVar98 = new b("HOME_SETTINGS", 99, "HOME_SETTINGS", false, R.string.lbl_home_settings, 0, null, 0, null, null, "MenuItemOpenedHomeSettings", null, 762, null);
        f166861c2 = bVar98;
        b bVar99 = new b("PROFILE_AND_PRIVACY", 100, "PROFILE_AND_PRIVACY", false, R.string.concept_profile_privacy, 0, null, 0, null, null, "MenuItemOpenedProfileAndPrivacy", null, 762, null);
        f166864d2 = bVar99;
        b bVar100 = new b("NEWS_FEED_SOCIAL_IMAGE_SHARING", 101, "NEWS_FEED_SOCIAL_IMAGE_SHARING", false, R.string.concept_news_feed, 0, null, 0, null, null, "MenuItemOpenedProfileAndPrivacy", null, 762, null);
        f166867e2 = bVar100;
        b bVar101 = new b("USER_SETTINGS", 102, "USER_SETTINGS", false, R.string.devices_settings_user_settings, 0, null, 0, null, null, "MenuItemOpenedUserSettings", null, 762, null);
        f166870f2 = bVar101;
        b bVar102 = new b("TAB_BAR", 103, "TAB_BAR", false, R.string.lbl_tab_bar, 0, null, 0, null, null, "MenuItemOpenedSettingsTabBar", null, 762, null);
        f166873g2 = bVar102;
        b bVar103 = new b("THEME", 104, "THEME", false, R.string.lbl_theme, 0, null, 0, null, null, "MenuItemOpenedTheme", null, 762, null);
        f166876h2 = bVar103;
        b bVar104 = new b("NOTIFICATIONS", 105, "NOTIFICATIONS", false, R.string.concept_notifications, 0, null, 0, null, null, "MenuItemOpenedNotifications", null, 762, null);
        f166879i2 = bVar104;
        b bVar105 = new b("PHONE_PERMISSIONS", 106, "PHONE_PERMISSIONS", false, R.string.lbl_phone_permissions, 0, null, 0, null, null, "MenuItemOpenedPhonePermissions", null, 762, null);
        f166882j2 = bVar105;
        b bVar106 = new b("INSTANT_KEYBOARD", 107, "INSTANT_KEYBOARD", false, R.string.lbl_instant_keyboard, 0, null, 0, null, null, "MenuItemOpenedInstantKeyboard", null, 762, null);
        f166887k2 = bVar106;
        b bVar107 = new b("CONNECTED_APPS", 108, "CONNECTED_APPS", false, R.string.lbl_connected_apps, 0, null, 0, null, null, "MenuItemOpenedConnectedApps", null, 762, null);
        f166891l2 = bVar107;
        b bVar108 = new b("PRIMARY_WEARABLE", 109, "PRIMARY_WEARABLE", false, R.string.primary_wearable, 0, null, 0, null, null, "MenuItemOpenedPrimaryWearable", null, 762, null);
        f166895m2 = bVar108;
        b bVar109 = new b("PRIMARY_TRAINING_DEVICE", 110, "PRIMARY_TRAINING_DEVICE", false, R.string.primary_training_device, 0, null, 0, null, null, "MenuItemOpenedPrimaryTrainingDevice", null, 762, null);
        f166899n2 = bVar109;
        b bVar110 = new b("DEVICE_PRIORITY", 111, "DEVICE_PRIORITY", false, R.string.device_priority, 0, null, R.string.primary_device_settings_description, new b[]{bVar108, bVar109}, null, null, null, 922, null);
        f166903o2 = bVar110;
        b bVar111 = new b("SIGN_OUT", 112, "SIGN_OUT", false, R.string.lbl_signout, 0, null, 0, null, null, "MenuItemOpenedSignOut", null, 762, null);
        f166906p2 = bVar111;
        b bVar112 = new b("BUILD_NUMBER", 113, "BUILD_NUMBER", false, R.string.pref_build_number, 0, null, 0, null, null, null, null, 1018, null);
        f166909q2 = bVar112;
        b bVar113 = new b("VERSION", 114, "VERSION", false, R.string.lbl_app_version, 0, null, 0, null, null, null, null, 1018, null);
        f166912r2 = bVar113;
        b bVar114 = new b("UDI_MEDICAL_DEVICE_SOFTWARE", 115, "UDI_MEDICAL_DEVICE_SOFTWARE", false, R.string.lbl_udi_for_medical_device_software, 0, null, 0, null, null, "MenuItemOpenedUdiMedicalDevice", null, 762, null);
        f166914s2 = bVar114;
        b bVar115 = new b("CHECK_FOR_UPDATES", 116, "CHECK_FOR_UPDATES", false, R.string.lbl_check_update, 0, null, 0, null, null, "MenuItemOpenedCheckForUpdates", null, 762, null);
        f166917t2 = bVar115;
        b bVar116 = new b("CHINA_ACCOUNT_REGION", 117, "CHINA_ACCOUNT_REGION", false, R.string.china_account_region_title, 0, null, R.string.china_account_region_content, null, null, null, null, 986, null);
        f166919u2 = bVar116;
        b bVar117 = new b("CHINA_ICP", 118, "CHINA_ICP", false, R.string.china_icp_license_title, 0, null, R.string.china_icp_license_content, null, null, "MenuItemOpenedChinaIcpLicense", null, 730, null);
        f166922v2 = bVar117;
        b bVar118 = new b("APP_INFO", 119, "APP_INFO", false, R.string.lbl_app_info, 0, null, 0, new b[]{bVar112, bVar113, bVar114, bVar115, bVar116, bVar117}, null, null, null, 954, null);
        f166925w2 = bVar118;
        b bVar119 = new b("GARMIN_CONNECT_MOBILE_EULA", 120, "GARMIN_CONNECT_MOBILE_EULA", false, R.string.pref_app_eula, R.string.pref_app_eula, null, 0, null, null, "MenuItemOpenedGarminConnectMobileEula", null, 754, null);
        f166928x2 = bVar119;
        b bVar120 = new b("PRIVACY_POLICY", 121, "PRIVACY_POLICY", false, R.string.txt_privacy_policy, 0, null, 0, null, null, "MenuItemOpenedPrivacyPolicy", null, 762, null);
        f166931y2 = bVar120;
        b bVar121 = new b("SECURITY_POLICY", 122, "SECURITY_POLICY", false, R.string.setup_security_policy_list_item, 0, null, 0, null, null, "MenuItemOpenedSecurityPolicy", null, 762, null);
        f166934z2 = bVar121;
        b bVar122 = new b("LIVETRACK_EULA", 123, "LIVETRACK_EULA", false, R.string.pref_livetrack_eula, R.string.pref_livetrack_eula, null, 0, null, null, "MenuItemOpenedLivetrackEula", null, 754, null);
        A2 = bVar122;
        b bVar123 = new b("GARMIN_PAY_PRIVACY_POLICY", 124, "GARMIN_PAY_PRIVACY_POLICY", false, R.string.garmin_pay_privacy, 0, null, 0, null, null, "MenuItemOpenedGarminPayPrivacyPolicy", null, 762, null);
        B2 = bVar123;
        b bVar124 = new b("GARMIN_PAY_TERMS_AND_CONDITIONS", 125, "GARMIN_PAY_TERMS_AND_CONDITIONS", false, R.string.garmin_pay_terms, 0, null, 0, null, null, "MenuItemOpenedGarminPayTermsAndConditions", null, 762, null);
        C2 = bVar124;
        b bVar125 = new b("COPYRIGHT", 126, "COPYRIGHT", false, R.string.setting_copyright, 0, null, 0, null, null, "MenuItemOpenedCopyright", null, 762, null);
        D2 = bVar125;
        b bVar126 = new b("LEGAL", 127, "LEGAL", false, R.string.lbl_legal, 0, null, 0, new b[]{bVar119, bVar120, bVar121, bVar122, bVar123, bVar124, bVar125}, null, null, null, 954, null);
        E2 = bVar126;
        b bVar127 = new b("APP_DIAGNOSTICS", 128, "APP_DIAGNOSTICS", false, R.string.pref_app_diagnostics_title, 0, null, 0, null, null, "MenuItemOpenedAppDiagnostics", null, 762, null);
        F2 = bVar127;
        b bVar128 = new b("DEVICE_SYNC_AUDIT", 129, "DEVICE_SYNC_AUDIT", false, R.string.pref_device_sync_audit_title, 0, null, 0, null, null, "MenuItemOpenedDeviceSyncAudit", null, 762, null);
        G2 = bVar128;
        b bVar129 = new b("GCM_DEVELOPER", 130, "GCM_DEVELOPER", false, R.string.gcm_developer, 0, null, 0, null, null, "MenuItemOpenedGcmDeveloper", null, 762, null);
        H2 = bVar129;
        b bVar130 = new b("TECH_DETAILS", 131, "TECH_DETAILS", false, R.string.lbl_tech_details, 0, null, 0, new b[]{bVar127, bVar128, bVar129}, null, null, null, 954, null);
        I2 = bVar130;
        b bVar131 = new b("SETTINGS", 132, "SETTINGS", false, R.string.action_settings, 0, null, 0, new b[]{bVar, bVar98, bVar99, bVar100, bVar101, bVar, bVar102, bVar103, bVar104, bVar105, bVar106, bVar107, bVar110, bVar, bVar111, bVar118, bVar126, bVar130}, null, "MenuItemOpenedSettings", null, 698, null);
        J2 = bVar131;
        b bVar132 = new b("GARMIN_CONNECT_SUPPORT", 133, "GARMIN_CONNECT_SUPPORT", true, R.string.product_support_connect_support, 0, null, 0, null, null, "MenuItemOpenedGarminConnectSupport", null, 760, null);
        K2 = bVar132;
        b bVar133 = new b("DIAGNOSTIC_REPORT", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, "DIAGNOSTIC_REPORT", false, R.string.feedback_diagnostic_report, 0, null, 0, null, null, "MenuItemOpenedDiagnosticReport", null, 762, null);
        L2 = bVar133;
        b bVar134 = new b("APP_HELP", TsExtractor.TS_STREAM_TYPE_E_AC3, "APP_HELP", false, R.string.lbl_app_help, 0, null, 0, new b[]{bVar132, bVar133}, null, "MenuItemOpenedAppHelp", null, 698, null);
        M2 = bVar134;
        b bVar135 = new b("PRODUCT_SUPPORT", SyslogConstants.LOG_LOCAL1, "PRODUCT_SUPPORT", false, R.string.help_product_support, 0, null, 0, null, null, "MenuItemOpenedProductSupport", null, 762, null);
        N2 = bVar135;
        b bVar136 = new b("DEVICE_HELP", 137, "DEVICE_HELP", false, R.string.help_device_help, 0, null, 0, new b[]{bVar135}, null, "MenuItemOpenedDeviceHelp", null, 698, null);
        O2 = bVar136;
        b bVar137 = new b("HELP", TsExtractor.TS_STREAM_TYPE_DTS, "HELP", false, R.string.lbl_customer_support_center, 0, null, 0, new b[]{bVar134, bVar136}, "MenuItemOpenedHelp", "MenuItemOpenedHelp", null, 570, null);
        P2 = bVar137;
        Q2 = new b("GARMIN_COACH", 139, "GARMIN_COACH", false, R.string.lbl_adaptive_training_plan, 0, null, 0, null, "GARMIN_COACH", "MenuItemOpenedGarminCoach", null, 634, null);
        b bVar138 = new b("ACCOUNT_ADMINISTRATOR", 140, "ACCOUNT_ADMINISTRATOR", false, 0, 0, null, 0, null, null, null, null, 1022, null);
        R2 = bVar138;
        b bVar139 = new b("EDIT_TAB_BAR", 141, "EDIT_TAB_BAR", false, R.string.lbl_edit_tab_bar, 0, null, R.string.lbl_edit_tab_bar_info, null, null, "MenuItemOpenedEditTabBar", null, 730, null);
        S2 = bVar139;
        T2 = new b("MANAGE_SUBSCRIPTION", 142, "MANAGE_SUBSCRIPTION", true, R.string.manage_subscription, 0, null, 0, null, null, null, null, 1016, null);
        U2 = new b("HOME_SCREEN_INSIGHTS", 143, "HOME_SCREEN_INSIGHTS", false, R.string.home_screen_insights, 0, null, 0, null, null, null, null, 1018, null);
        V2 = new b("ACTIVE_INTELLIGENCE_LANGUAGE", SyslogConstants.LOG_LOCAL2, "ACTIVE_INTELLIGENCE_LANGUAGE", false, R.string.device_setting_language, 0, null, 0, null, null, null, null, 1018, null);
        W2 = new b("ACTIVE_INTELLIGENCE_DATA_AND_PRIVACY", 145, "DATA_AND_PRIVACY", false, R.string.lbl_data_privacy, 0, null, 0, null, null, null, null, 1018, null);
        X2 = new b("NUTRITION_PLAN", 146, "NUTRITION_PLAN", false, R.string.nutrition_plan, 0, null, 0, null, null, null, null, 1018, null);
        Y2 = new b("LEGACY_MEAL_CALORIE_GOALS", 147, "LEGACY_MEAL_CALORIE_GOALS", false, R.string.meal_calorie_goals, 0, null, 0, null, null, null, null, 1018, null);
        Z2 = new b("MEAL_CALORIE_GOALS", 148, "MEAL_CALORIE_GOALS", false, R.string.meal_calorie_goals, 0, null, 0, null, null, null, null, 1018, null);
        f166856a3 = new b("MEAL_WINDOWS", 149, "MEAL_WINDOWS", false, R.string.meal_windows, 0, null, 0, null, null, null, null, 1018, null);
        f166859b3 = new b("MEAL_SETTINGS", 150, "MEAL_SETTINGS", false, 0, 0, x0.f23479je, 0, null, null, null, null, 1006, null);
        f166862c3 = new b("NUTRITION_REMINDERS", 151, "NUTRITION_REMINDERS", false, R.string.mct_reminders, 0, null, 0, null, null, null, null, 1018, null);
        f166865d3 = new b("AUTO_ADJUST_CALORIE_GOAL", SyslogConstants.LOG_LOCAL3, "AUTO_ADJUST_CALORIE_GOAL", false, R.string.auto_adjust_calorie_goal_settings, 0, null, 0, null, null, null, null, 1018, null);
        f166868e3 = new b("REGION_AND_LANGUAGE", 153, "REGION_AND_LANGUAGE", false, R.string.lbl_region_and_language, 0, null, 0, null, null, null, null, 1018, null);
        f166871f3 = new b("NUTRITION_SETTINGS", 154, "NUTRITION_SETTINGS", false, R.string.nutrition_settings, 0, null, 0, null, null, null, null, 1018, null);
        f166874g3 = new b("LIVETRACK_SETTINGS", ModuleDescriptor.MODULE_VERSION, "LIVETRACK_SETTINGS", false, R.string.live_track_config_title, 0, null, 0, null, null, null, null, 1018, null);
        f166877h3 = new b("GLOBAL_BADGES", 156, "GLOBAL_BADGES", false, R.string.global_badges, 0, null, 0, null, null, null, null, 1018, null);
        f166880i3 = new b("GC_PLUS_FEATURE_SETTINGS", 157, "FEATURE_SETTINGS", false, R.string.feature_settings, 0, null, 0, null, null, null, null, 1018, null);
        f166883j3 = new b("NOTIFICATIONS_GC_PLUS", 158, "NOTIFICATIONS", false, R.string.concept_notifications, 0, null, 0, null, null, null, null, 1018, null);
        f166888k3 = new b("GC_PLUS_PROVIDE_FEEDBACK", 159, "PROVIDE_FEEDBACK", false, R.string.help_provide_feedback, 0, null, 0, null, null, null, null, 1018, null);
        f166892l3 = new b("MORE_MENU", SyslogConstants.LOG_LOCAL4, "MORE_MENU", false, R.string.tabbar_more, 0, null, 0, new b[]{bVar, bVar138, bVar, bVar76, bVar, bVar77, bVar80, bVar84, bVar, bVar81, bVar54, bVar55, bVar59, bVar37, bVar82, bVar83, bVar78, bVar85, bVar, bVar86, bVar87, bVar88, bVar89, bVar90, bVar91, bVar, bVar92, bVar93, bVar94, bVar, bVar95, bVar, bVar96, bVar79, bVar, bVar97, bVar131, bVar137, bVar75, bVar, bVar139, bVar}, "MORE", null, null, 826, null);
        b[] bVarArrA = a();
        f166896m3 = bVarArrA;
        f166900n3 = w13.b.g(bVarArrA);
        f166884k = new a(null);
    }

    public b(String str, int i14, String str2, boolean z14, int i15, int i16, String str3, int i17, b[] bVarArr, String str4, String str5, List list, int i18, p005kotlin.jvm.internal.j jVar) {
        this(str, i14, str2, (i18 & 2) != 0 ? false : z14, (i18 & 4) != 0 ? 0 : i15, (i18 & 8) != 0 ? 0 : i16, (i18 & 16) != 0 ? null : str3, (i18 & 32) != 0 ? 0 : i17, (i18 & 64) != 0 ? null : bVarArr, (i18 & 128) != 0 ? null : str4, (i18 & 256) != 0 ? null : str5, (i18 & 512) != 0 ? j0.f134944a : list);
    }

    public static final /* synthetic */ b[] a() {
        return new b[]{f166889l, f166893m, f166897n, f166901o, f166904p, f166907q, f166910r, f166915t, f166920v, f166923w, f166926x, f166929y, f166932z, A, B, C, D, E, F, I, P, T, X, Y, Z, f166885k0, H0, I0, J0, K0, L0, M0, N0, O0, P0, Q0, R0, S0, T0, U0, V0, W0, X0, Y0, Z0, f166854a1, f166857b1, f166860c1, f166863d1, f166866e1, f166869f1, f166872g1, f166875h1, f166878i1, f166881j1, f166886k1, f166890l1, f166894m1, f166898n1, f166902o1, f166905p1, f166908q1, f166911r1, f166913s1, f166916t1, f166918u1, f166921v1, f166924w1, f166927x1, f166930y1, f166933z1, A1, B1, C1, D1, E1, F1, G1, H1, I1, J1, K1, L1, M1, N1, O1, P1, Q1, R1, S1, T1, U1, V1, W1, X1, Y1, Z1, f166855a2, f166858b2, f166861c2, f166864d2, f166867e2, f166870f2, f166873g2, f166876h2, f166879i2, f166882j2, f166887k2, f166891l2, f166895m2, f166899n2, f166903o2, f166906p2, f166909q2, f166912r2, f166914s2, f166917t2, f166919u2, f166922v2, f166925w2, f166928x2, f166931y2, f166934z2, A2, B2, C2, D2, E2, F2, G2, H2, I2, J2, K2, L2, M2, N2, O2, P2, Q2, R2, S2, T2, U2, V2, W2, X2, Y2, Z2, f166856a3, f166859b3, f166862c3, f166865d3, f166868e3, f166871f3, f166874g3, f166877h3, f166880i3, f166883j3, f166888k3, f166892l3};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f166896m3.clone();
    }

    @Override // ty0.j
    public final String b(l22.b bVar) {
        bVar.getClass();
        int i14 = this.f166937c;
        if (i14 != 0) {
            return bVar.getString(i14);
        }
        String str = this.f166939e;
        if (str != null) {
            return bVar.b(g2.b(str));
        }
        if (this == I1) {
            return bVar.a(R.string.common_conjunct_ampersand_2, bVar.getString(R.string.wallet_concept), bVar.getString(R.string.wallet_garmin_pay));
        }
        i2.f36769a.getClass();
        i2.a.o(a2.GENERAL, "FeatureNavigationItem.label: No label resource found for " + this);
        return "";
    }

    @Override // ty0.j
    public final String d(l22.a aVar) {
        int i14 = this.f166938d;
        if (i14 == 0) {
            return null;
        }
        int i15 = C3139b.f166945a[ordinal()];
        if (i15 == 2) {
            oi0.b bVar = new oi0.b(aVar, aVar.getString(i14));
            bVar.e();
            Unit unit = Unit.INSTANCE;
            return bVar.f132238b;
        }
        if (i15 != 3) {
            return null;
        }
        oi0.b bVar2 = new oi0.b(aVar, aVar.getString(i14));
        bVar2.v();
        bVar2.e();
        Unit unit2 = Unit.INSTANCE;
        return bVar2.f132238b;
    }

    @Override // ty0.j
    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getF166936b() {
        return this.f166936b;
    }

    @Override // ty0.j
    public final String g(l22.b bVar) {
        int i14 = this.f166940f;
        if (i14 != 0) {
            return bVar.getString(i14);
        }
        return null;
    }

    @Override // ty0.j
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getF188047a() {
        return this.f166935a;
    }

    @Override // ty0.j
    public final long i(p3.m mVar) {
        long jB;
        mVar.C(-377168454);
        x1 x1Var = p3.n.f135158a;
        if (C3139b.f166945a[ordinal()] == 1) {
            mVar.C(-1681627872);
            d92.b.f58623a.getClass();
            jB = d92.b.a(mVar).k().a();
            mVar.f();
        } else {
            mVar.C(-1681626495);
            d92.b.f58623a.getClass();
            jB = d92.b.a(mVar).k().b();
            mVar.f();
        }
        mVar.f();
        return jB;
    }

    @Override // ty0.j
    public final u4.d k(boolean z14) {
        switch (c.a.f166946a[ordinal()]) {
            case 1:
                if (z14) {
                    s62.a.f157643a.getClass();
                    return u62.b.a(t62.a.f162797a);
                }
                s62.a.f157643a.getClass();
                return u62.a.a(t62.a.f162797a);
            case 2:
                s62.a.f157643a.getClass();
                return v62.a.a(t62.b.f162798a);
            case 3:
                s62.a.f157643a.getClass();
                return r0.a(t62.b.f162798a);
            case 4:
                s62.a.f157643a.getClass();
                return w0.a(t62.b.f162798a);
            case 5:
                s62.a.f157643a.getClass();
                return l9.a(t62.b.f162798a);
            case 6:
                s62.a.f157643a.getClass();
                return w2.a(t62.c.f162799a);
            case 7:
                s62.a.f157643a.getClass();
                return d2.a(t62.b.f162798a);
            case 8:
                s62.a.f157643a.getClass();
                return n7.a(t62.b.f162798a);
            case 9:
                s62.a.f157643a.getClass();
                return s.a(t62.c.f162799a);
            case 10:
                s62.a.f157643a.getClass();
                return t.a(t62.c.f162799a);
            case 11:
                s62.a.f157643a.getClass();
                return m2.a(t62.b.f162798a);
            case 12:
                s62.a.f157643a.getClass();
                return d1.a(t62.c.f162799a);
            case 13:
                s62.a.f157643a.getClass();
                return e1.a(t62.c.f162799a);
            case 14:
                s62.a.f157643a.getClass();
                return ae.a(t62.c.f162799a);
            case 15:
                s62.a.f157643a.getClass();
                return x3.a(t62.b.f162798a);
            case 16:
                s62.a.f157643a.getClass();
                return m9.a(t62.b.f162798a);
            case 17:
            case 18:
                s62.a.f157643a.getClass();
                return f72.j0.a(t62.c.f162799a);
            case 19:
                s62.a.f157643a.getClass();
                return ba.a(t62.c.f162799a);
            case 20:
                s62.a.f157643a.getClass();
                return e4.a(t62.b.f162798a);
            case 21:
                s62.a.f157643a.getClass();
                return h4.a(t62.b.f162798a);
            case 22:
                s62.a.f157643a.getClass();
                return r2.a(t62.c.f162799a);
            case 23:
                s62.a.f157643a.getClass();
                return a3.a(t62.c.f162799a);
            case 24:
                s62.a.f157643a.getClass();
                return a3.a(t62.c.f162799a);
            case 25:
                s62.a.f157643a.getClass();
                return s5.a(t62.b.f162798a);
            case 26:
                s62.a.f157643a.getClass();
                return v62.d1.a(t62.b.f162798a);
            case 27:
                s62.a.f157643a.getClass();
                return k7.a(t62.b.f162798a);
            case 28:
                s62.a.f157643a.getClass();
                return a8.a(t62.b.f162798a);
            case 29:
                s62.a.f157643a.getClass();
                return bd.a(t62.c.f162799a);
            case 30:
                s62.a.f157643a.getClass();
                return o8.a(t62.b.f162798a);
            case 31:
                s62.a.f157643a.getClass();
                return q.a(t62.c.f162799a);
            default:
                return null;
        }
    }

    @Override // ty0.j
    public final List<String> m(l22.b bVar) {
        if (this == F1) {
            return w.c(u.v(b(bVar), Marker.ANY_NON_NULL_MARKER, "plus", false));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.f166944j.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            String string = iIntValue != 0 ? bVar.getString(iIntValue) : null;
            if (string != null) {
                arrayList.add(string);
            }
        }
        return arrayList;
    }

    @Override // ty0.j
    public final d0 o(p3.m mVar) {
        d0 d0VarA;
        mVar.C(-1965211079);
        x1 x1Var = p3.n.f135158a;
        switch (c.a.f166946a[ordinal()]) {
            case 1:
                mVar.C(1172067247);
                d92.b.f58623a.getClass();
                long jA = d92.b.a(mVar).f().a();
                mVar.f();
                d0VarA = d0.a(jA);
                break;
            case 2:
                mVar.C(1172069906);
                d92.b.f58623a.getClass();
                long jD = d92.b.a(mVar).f().d();
                mVar.f();
                d0VarA = d0.a(jD);
                break;
            case 3:
                mVar.C(1172072079);
                d92.b.f58623a.getClass();
                long jA2 = d92.b.a(mVar).f().a();
                mVar.f();
                d0VarA = d0.a(jA2);
                break;
            case 4:
                mVar.C(1172074223);
                d92.b.f58623a.getClass();
                long jA3 = d92.b.a(mVar).f().a();
                mVar.f();
                d0VarA = d0.a(jA3);
                break;
            case 5:
                mVar.C(1172076307);
                f02.l.f67740a.getClass();
                gl.c.f77766a.getClass();
                long j8 = gl.c.f77767b.N;
                mVar.f();
                d0VarA = d0.a(j8);
                break;
            case 6:
                mVar.C(1172078767);
                d92.b.f58623a.getClass();
                long jA4 = d92.b.a(mVar).f().a();
                mVar.f();
                d0VarA = d0.a(jA4);
                break;
            case 7:
                mVar.C(1172081011);
                f02.g.f67734a.getClass();
                long jA5 = f02.g.a();
                mVar.f();
                d0VarA = d0.a(jA5);
                break;
            case 8:
                mVar.C(1172083635);
                mVar.f();
                f02.m.f67741a.getClass();
                d0VarA = d0.a(f02.m.a());
                break;
            case 9:
                mVar.C(1172085967);
                d92.b.f58623a.getClass();
                long jA6 = d92.b.a(mVar).f().a();
                mVar.f();
                d0VarA = d0.a(jA6);
                break;
            case 10:
                mVar.C(1172088563);
                f02.f.f67732a.getClass();
                gl.c.f77766a.getClass();
                long j14 = gl.c.f77767b.f77820z0;
                mVar.f();
                d0VarA = d0.a(j14);
                break;
            case 11:
                mVar.C(1172090962);
                d92.b.f58623a.getClass();
                long jD2 = d92.b.a(mVar).f().d();
                mVar.f();
                d0VarA = d0.a(jD2);
                break;
            case 12:
                mVar.C(1172093395);
                mVar.f();
                f02.i.f67737a.getClass();
                gl.c.f77766a.getClass();
                d0VarA = d0.a(gl.c.f77767b.f77784h0);
                break;
            case 13:
                mVar.C(1172095763);
                mVar.f();
                f02.m.f67741a.getClass();
                d0VarA = d0.a(f02.m.a());
                break;
            case 14:
                mVar.C(1172098031);
                d92.b.f58623a.getClass();
                long jA7 = d92.b.a(mVar).f().a();
                mVar.f();
                d0VarA = d0.a(jA7);
                break;
            case 15:
                mVar.C(1172099983);
                d92.b.f58623a.getClass();
                long jA8 = d92.b.a(mVar).f().a();
                mVar.f();
                d0VarA = d0.a(jA8);
                break;
            case 16:
                mVar.C(1172102163);
                f02.g.f67734a.getClass();
                long jA9 = f02.g.a();
                mVar.f();
                d0VarA = d0.a(jA9);
                break;
            case 17:
            case 18:
                mVar.C(1172106703);
                d92.b.f58623a.getClass();
                long jA10 = d92.b.a(mVar).f().a();
                mVar.f();
                d0VarA = d0.a(jA10);
                break;
            case 19:
                mVar.C(1172108975);
                d92.b.f58623a.getClass();
                long jA11 = d92.b.a(mVar).f().a();
                mVar.f();
                d0VarA = d0.a(jA11);
                break;
            case 20:
                mVar.C(1172110930);
                d92.b.f58623a.getClass();
                long jD3 = d92.b.a(mVar).f().d();
                mVar.f();
                d0VarA = d0.a(jD3);
                break;
            case 21:
                mVar.C(1172112976);
                d92.b.f58623a.getClass();
                long jB = d92.b.a(mVar).f().b();
                mVar.f();
                d0VarA = d0.a(jB);
                break;
            case 22:
                mVar.C(1172115087);
                d92.b.f58623a.getClass();
                long jA12 = d92.b.a(mVar).f().a();
                mVar.f();
                d0VarA = d0.a(jA12);
                break;
            case 23:
                mVar.C(1172117523);
                f02.g.f67734a.getClass();
                long jA13 = f02.g.a();
                mVar.f();
                d0VarA = d0.a(jA13);
                break;
            case 24:
                mVar.C(1172120467);
                f02.g.f67734a.getClass();
                long jA14 = f02.g.a();
                mVar.f();
                d0VarA = d0.a(jA14);
                break;
            case 25:
                mVar.C(1172122703);
                d92.b.f58623a.getClass();
                long jA15 = d92.b.a(mVar).f().a();
                mVar.f();
                d0VarA = d0.a(jA15);
                break;
            case 26:
                mVar.C(1172125199);
                d92.b.f58623a.getClass();
                long jA16 = d92.b.a(mVar).f().a();
                mVar.f();
                d0VarA = d0.a(jA16);
                break;
            case 27:
                mVar.C(1172127795);
                f02.g.f67734a.getClass();
                long jA17 = f02.g.a();
                mVar.f();
                d0VarA = d0.a(jA17);
                break;
            case 28:
                mVar.C(1172130002);
                d92.b.f58623a.getClass();
                long jD4 = d92.b.a(mVar).f().d();
                mVar.f();
                d0VarA = d0.a(jD4);
                break;
            case 29:
                mVar.C(1172132307);
                mVar.f();
                f02.m.f67741a.getClass();
                d0VarA = d0.a(f02.m.a());
                break;
            case 30:
                mVar.C(1172134927);
                d92.b.f58623a.getClass();
                long jA18 = d92.b.a(mVar).f().a();
                mVar.f();
                d0VarA = d0.a(jA18);
                break;
            case 31:
                mVar.C(1172137295);
                d92.b.f58623a.getClass();
                long jA19 = d92.b.a(mVar).f().a();
                mVar.f();
                d0VarA = d0.a(jA19);
                break;
            default:
                mVar.C(1976540532);
                mVar.f();
                d0VarA = null;
                break;
        }
        mVar.f();
        return d0VarA;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lty0/b$a;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    private b(String str, int i14, String str2, boolean z14, int i15, int i16, String str3, int i17, b[] bVarArr, String str4, String str5, List list) {
        super(str, i14);
        this.f166935a = str2;
        this.f166936b = z14;
        this.f166937c = i15;
        this.f166938d = i16;
        this.f166939e = str3;
        this.f166940f = i17;
        this.f166941g = bVarArr;
        this.f166942h = str4;
        this.f166943i = str5;
        this.f166944j = list;
    }
}
