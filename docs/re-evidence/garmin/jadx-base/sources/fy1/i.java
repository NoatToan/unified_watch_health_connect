package fy1;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import c22.l3;
import c22.q3;
import c22.s1;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import fb1.d0;
import fg0.k;
import gl1.y;
import i3.e5;
import java.text.DecimalFormat;
import java.util.Locale;
import lc.u0;
import o13.m;
import o13.p;
import o13.t;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.u;
import p3.n;
import p3.x1;
import vt1.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lfy1/i;", "", "<init>", "()V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f73924a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Locale f73925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f73926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f73927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f73928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t f73929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t f73930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t f73931h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t f73932i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final t f73933j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final t f73934k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final t f73935l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final t f73936m;

    static {
        Locale locale = Locale.US;
        locale.getClass();
        f73925b = locale;
        f73926c = new String[]{"ar", "cs", "da", "de", "el", "en", "es", "fi", "fr", "he", "hr", "hu", "in", "it", "ja", "ko", "ms", "nb", "nl", "pl", "pt", "pt_BR", "ro", "ru", "sk", "sl", "sv", "th", "tr", "vi", "zh_CN", "zh_TW"};
        f73927d = m.b(new d0(28));
        f73928e = m.b(new d0(29));
        f73929f = m.b(new h(0));
        f73930g = m.b(new h(1));
        f73931h = m.b(new h(2));
        f73932i = m.b(new h(3));
        f73933j = m.b(new h(4));
        f73934k = m.b(new h(5));
        f73935l = m.b(new h(6));
        f73936m = m.b(new h(7));
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0014\u0010\u0013\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\tR\u0014\u0010\u0015\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\tR\u0014\u0010\u0016\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\tR\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\tR\u0014\u0010\u001f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\tR\u0014\u0010 \u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0019R\u0014\u0010!\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u0014\u0010\"\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u0014\u0010#\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u0014\u0010$\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u0014\u0010%\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u0014\u0010&\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u0014\u0010'\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u0014\u0010(\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u0014\u0010)\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u0014\u0010*\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u0014\u0010+\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u0014\u0010,\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\u0019R\u0014\u0010-\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\u0019R\u0014\u0010.\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\u0019R\u0014\u0010/\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010\u0019R\u0014\u00100\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\u0019R\u0014\u00101\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010\u0019R\u0014\u00102\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u0019R\u0014\u00103\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010\u0019R\u0014\u00104\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010\u0019R\u0014\u00105\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u0010\u0019R\u0014\u00107\u001a\u0002068\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u0002068\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010:\u001a\u0002068\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u00108R\u0014\u0010;\u001a\u0002068\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u00108R\u0014\u0010<\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010\u0019R\u0014\u0010=\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010\u0019R\u0014\u0010>\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010\u0019R\u0014\u0010?\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010\tR\u0014\u0010A\u001a\u00020@8\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020@8\u0002X\u0082T¢\u0006\u0006\n\u0004\bC\u0010BR\u0014\u0010D\u001a\u00020@8\u0006X\u0086T¢\u0006\u0006\n\u0004\bD\u0010BR\u0014\u0010F\u001a\u00020E8\u0006X\u0086T¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\bH\u0010\u0019R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00170I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lfy1/i$a;", "", "<init>", "()V", "Ljava/util/Locale;", "ATP_DEFAULT_LOCALE", "Ljava/util/Locale;", "", "WORKOUT_REQUEST_CODE", "I", "LAUNCH_EVENT_LOCATION_CODE", "LAUNCH_FBT_WIZARD_CODE", "LAUNCH_STP_WIZARD_CODE", "LAUNCH_DSW_TRIATHLON_EVENT_SELECTION_CODE", "LAUNCH_DSW_TRIATHLON_GOAL_SELECTION_CODE", "LAUNCH_DSW_TRIATHLON_LEG_GOAL_REVIEW_CODE", "LAUNCH_DSW_TRIATHLON_OVERALL_TIME_GOAL_CODE", "LAUNCH_DSW_TRIATHLON_EDIT_LEG_GOAL_CODE", "EXTRA_PLAN_REMOVED_RESULT_CODE", "PLAN_UPDATED_ON_WORKOUT_SCHEDULE_RESULT_CODE", "WORKOUT_DETAILS_REQUEST_CODE", "EVENT_DETAILS_PLAN_DASHBOARD_REQUEST_CODE", "EXIT_FBT_WIZARD_RESULT_CODE", "", "EXTRA_FBT_LOCATION_TIME_DTO", "Ljava/lang/String;", "EXTRA_FBT_LOCATION_HEADER", "EXTRA_FBT_TRIATHLON_LEG_TARGETS", "EXTRA_ACTIVE_PLAN_INFO_DTO", "EXTRA_CONTINUE_WITH_GOAL_SETUP", "MAX_DISTANCE_IN_KILOMETERS", "MAX_DISTANCE_IN_MILES", "METRIC_TE", "METRIC_WORKOUT_ID", "METRIC_START_LOCAL", "METRIC_DISTANCE", "METRIC_NAME", "METRIC_DURATION", "METRIC_WORKOUT_TYPE", "METRIC_AVG_SPEED", "METRIC_ADAPTIVE_COACHING_WORKOUT_STATUS", "METRIC_AEROBIC_TRAINING_EFFECT", "METRIC_PARENT_ID", "METRIC_WORKOUT_GROUP_ENUMERATOR", "METRIC_VIGOROUS_INTENSITY_MINUTES", "METRIC_MODERATE_INTENSITY_MINUTES", "METRIC_CALORIES", "METRIC_MOVING_DURATION", "METRIC_TOTAL_SETS", "METRIC_AVG_POWER", "METRIC_ACTIVITY_TYPE", "METRIC_CALENDAR_EVENT_ID", "METRIC_CALENDAR_EVENT_UUID", "METRIC_STEPS", "", "STANDARDIZED_UNITS", "Z", "GROUP_BY_PARENT_ACTIVITY_TYPE", "GROUP_BY_PARENT_ACTIVITY_TYPE_TRUE", "GROUP_BY_ACTIVITY_TYPE", "AGGREGATION", "DAILY_AGGREGATION", "DEFAULT_TIME", "MIN_WALK_STREAK", "", "NON_FBT_MIN_CYCLING_DISTANCE_MILES", "D", "NON_FBT_MIN_CYCLING_DISTANCE_KILOMETERS", "DEFAULT_MIN_DISTANCE", "", "CREATE_QUIT_TRAINING_PLAN_HOME_REFRESH_DELAY_MS", "J", "ADAPTIVE_COACHING", "", "ATP_SUPPORTED_LANGUAGES", "[Ljava/lang/String;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: fy1.i$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1501a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f73937a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f73938b;

            static {
                int[] iArr = new int[o.values().length];
                try {
                    iArr[o.f180176g.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f73937a = iArr;
                int[] iArr2 = new int[bg0.a.b.values().length];
                try {
                    iArr2[bg0.a.b.KILOMETER.ordinal()] = 1;
                } catch (NoSuchFieldError unused2) {
                }
                f73938b = iArr2;
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public static String a(Context context, String str, String str2, String str3) {
            context.getClass();
            str2.getClass();
            String strJ = u0.j(context.getString(R.string.lbl_weeks, str));
            String string = context.getString(R.string.days_per_week_abbreviation, str2);
            string.getClass();
            if (str3 == null) {
                return e5.g(strJ, " • ", string);
            }
            String string2 = context.getString(R.string.hours_per_week_abbreviation, str3);
            string2.getClass();
            return strJ + " • " + string + " • " + string2;
        }

        public static /* synthetic */ String b(a aVar, Context context, String str, String str2) {
            aVar.getClass();
            return a(context, str, str2, null);
        }

        public static f c(Context context, double d14, double d15, boolean z14, boolean z15, boolean z16, String str, String str2, boolean z17) {
            f fVar;
            String strG;
            String strQ;
            l22.a aVar = new l22.a(context);
            int i14 = R.string.lbl_per_mile;
            if (z15) {
                double d16 = d14 / d15;
                q3 q3Var = z16 ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                l3.f23124b.getClass();
                String strM0 = l3.a.M0(context, d16, q3Var, l3.f23130h, z17);
                if (z17) {
                    oi0.b bVar = new oi0.b(aVar, strM0);
                    if (z16) {
                        bVar.t();
                        strG = bVar.f132238b;
                    } else {
                        bVar.C();
                        strG = bVar.f132238b;
                    }
                } else {
                    if (z16) {
                        i14 = R.string.lbl_per_kilometer;
                    }
                    strG = e5.g(strM0, StringUtils.SPACE, context.getString(i14));
                }
                if (z14) {
                    og0.a.f131967a.getClass();
                    strQ = og0.a.q(context);
                } else {
                    strQ = null;
                }
                fVar = new f(str, str2, strQ, strM0, strG, z17 ? null : context.getString(q3Var.f23223e));
            } else {
                og0.a.f131967a.getClass();
                String strB = og0.a.b(d15, d14);
                l3.f23124b.getClass();
                String string = context.getString(l3.a.N1(z16));
                string.getClass();
                if (z17) {
                    strB = e5.g(strB, StringUtils.SPACE, string);
                }
                String strR1 = l3.a.r1(aVar, MathKt.b(og0.a.d(d15, d14)));
                if (z16) {
                    i14 = R.string.lbl_per_kilometer;
                }
                fVar = new f(str, str2, z14 ? og0.a.q(context) : null, strB, e5.g(strR1, StringUtils.SPACE, context.getString(i14)), string);
            }
            return fVar;
        }

        public static String d(double d14, Context context, boolean z14) {
            double d15;
            context.getClass();
            if (z14) {
                l3.f23124b.getClass();
                d15 = 1000.0d;
            } else {
                l3.f23124b.getClass();
                d15 = 1609.344d;
            }
            double d16 = d14 / d15;
            l3.f23124b.getClass();
            double dT1 = l3.a.T1(d16, 2);
            og0.a.f131967a.getClass();
            return dT1 + StringUtils.SPACE + og0.a.q(context);
        }

        public static String e() {
            Locale locale = Locale.getDefault();
            s1 s1Var = s1.f23251a;
            locale.getClass();
            s1Var.getClass();
            return s1.a(locale);
        }

        public static String f() {
            String str;
            String str2;
            Locale locale = Locale.getDefault();
            String language = locale.getLanguage();
            String strG = (!s.g(locale.getLanguage(), Locale.CHINESE.getLanguage()) || u.m0(new String[]{Locale.CHINA.getCountry(), Locale.TAIWAN.getCountry(), "HK", "MO", "SG"}).contains(locale.getCountry())) ? e5.g(language, "_", locale.getCountry()) : s.g(locale.getScript(), "Hans") ? "zh_CN" : "zh_TW";
            String[] strArr = i.f73926c;
            int length = strArr.length;
            int i14 = 0;
            while (true) {
                str = null;
                if (i14 >= length) {
                    str2 = null;
                    break;
                }
                str2 = strArr[i14];
                if (s.g(str2, strG)) {
                    break;
                }
                i14++;
            }
            if (str2 != null) {
                return str2;
            }
            for (String str3 : i.f73926c) {
                if (s.g(str3, language)) {
                    str = str3;
                    break;
                }
            }
            if (str != null) {
                return str;
            }
            String language2 = i.f73925b.getLanguage();
            language2.getClass();
            return language2;
        }

        public static String g(androidx.fragment.app.m mVar, int i14) {
            if (i14 == 1) {
                String string = mVar.getString(R.string.coach_amy_parkerson_mitchell_description);
                string.getClass();
                return string;
            }
            if (i14 == 2) {
                String string2 = mVar.getString(R.string.coach_jeff_galloway_description);
                string2.getClass();
                return string2;
            }
            if (i14 != 3) {
                return "";
            }
            String string3 = mVar.getString(R.string.coach_greg_mcmillan_description);
            string3.getClass();
            return string3;
        }

        public static p h(boolean z14, p3.m mVar) {
            p pVar;
            p pVar2;
            x1 x1Var = n.f135158a;
            if (z14) {
                mVar.C(962824716);
                if (mg0.b.c()) {
                    mVar.C(-217188382);
                    pVar2 = new p(y.Q(mVar, R.string.f28710m), y.Q(mVar, R.string.meters));
                    mVar.f();
                } else {
                    mVar.C(-217089554);
                    pVar2 = new p(y.Q(mVar, R.string.lbl_yard), y.Q(mVar, R.string.common_yards_string));
                    mVar.f();
                }
                mVar.f();
                return pVar2;
            }
            mVar.C(962832861);
            if (mg0.b.c()) {
                mVar.C(-216935267);
                pVar = new p(y.Q(mVar, R.string.f28709km), y.Q(mVar, R.string.kilometers));
                mVar.f();
            } else {
                mVar.C(-216832254);
                pVar = new p(y.Q(mVar, R.string.f28711mi), y.Q(mVar, R.string.miles));
                mVar.f();
            }
            mVar.f();
            return pVar;
        }

        public static String i(Context context, double d14, double d15, boolean z14, boolean z15, boolean z16) {
            String strE1;
            String strQ;
            context.getClass();
            boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
            l3.f23124b.getClass();
            double d16 = d14 / (zY ? 1000.0d : 1609.344d);
            if (!z15) {
                if (z16) {
                    l3.f23124b.getClass();
                    strE1 = l3.a.k1(new l22.a(context), true, (int) d15);
                } else {
                    l3.f23124b.getClass();
                    strE1 = l3.a.e1((long) d15);
                }
                return z14 ? com.nimbusds.jose.shaded.gson.internal.a.h(strE1, " (", l(context, d14, d15, zY, z16), ")") : e5.g(strE1, StringUtils.SPACE, k(context, d14, d15, zY, z16));
            }
            if (z16) {
                og0.a.f131967a.getClass();
                strQ = og0.a.r(context);
            } else {
                og0.a.f131967a.getClass();
                strQ = og0.a.q(context);
            }
            l3.f23124b.getClass();
            String str = l3.a.T1(d16, 2) + StringUtils.SPACE + strQ;
            return z14 ? com.nimbusds.jose.shaded.gson.internal.a.h(str, " (", l(context, d14, d15, zY, z16), ")") : e5.g(str, StringUtils.SPACE, k(context, d14, d15, zY, z16));
        }

        public static String j(Context context, DateTime dateTime, DateTime dateTime2) {
            context.getClass();
            pi0.e eVar = new pi0.e(context);
            return dateTime.equals(dateTime2) ? eVar.a(dateTime, qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY) : eVar.l(dateTime, dateTime2, pi0.f.SHORT_MONTH_NO_WEEKDAY);
        }

        public static String k(Context context, double d14, double d15, boolean z14, boolean z15) {
            String strB;
            int iN1;
            if (z15) {
                og0.a.f131967a.getClass();
                context.getClass();
                l3.a aVar = l3.f23124b;
                l22.a aVar2 = new l22.a(context);
                int iD = (int) og0.a.d(d15, d14);
                aVar.getClass();
                strB = l3.a.k1(aVar2, true, iD);
            } else {
                og0.a.f131967a.getClass();
                strB = og0.a.b(d15, d14);
            }
            if (z15) {
                iN1 = z14 ? R.string.lbl_per_kilometer : R.string.lbl_per_mile;
            } else {
                l3.f23124b.getClass();
                iN1 = l3.a.N1(z14);
            }
            String string = context.getString(iN1);
            return am.j.o(hb.a.i(p6.b.d(context, R.string.lbl_pace, string)), ")", p6.b.i("(", strB, StringUtils.SPACE, string, StringUtils.SPACE));
        }

        public static String l(Context context, double d14, double d15, boolean z14, boolean z15) {
            double d16 = d14 / d15;
            q3 q3Var = z14 ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
            l3.f23124b.getClass();
            String strM0 = l3.a.M0(context, d16, q3Var, l3.f23130h, true);
            if (!z15) {
                return strM0;
            }
            oi0.b bVar = new oi0.b(new l22.a(context), strM0);
            if (z14) {
                bVar.t();
                return bVar.f132238b;
            }
            bVar.C();
            return bVar.f132238b;
        }

        public static f m(Context context, double d14, double d15, boolean z14, boolean z15, boolean z16) {
            context.getClass();
            boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
            if (!z15) {
                l3.f23124b.getClass();
                String strE1 = l3.a.e1((long) d15);
                if (strE1 == null) {
                    strE1 = "0";
                }
                return c(context, d14, d15, false, z14, zY, strE1, l3.a.k1(new l22.a(context), true, MathKt.b(d15)), z16);
            }
            l3.f23124b.getClass();
            double d16 = d14 / (zY ? 1000.0d : 1609.344d);
            l3.f23124b.getClass();
            String strG = new DecimalFormat("0.00").format(l3.a.T1(d16, 2));
            strG.getClass();
            if (z16) {
                og0.a.f131967a.getClass();
                strG = e5.g(strG, StringUtils.SPACE, og0.a.q(context));
            }
            String str = strG;
            double dT1 = l3.a.T1(d16, 2);
            og0.a.f131967a.getClass();
            return c(context, d14, d15, true, z14, zY, str, dT1 + StringUtils.SPACE + og0.a.r(context), z16);
        }

        public static f n(Context context, k kVar, boolean z14) {
            fg0.d customGoal;
            Double value;
            fg0.d customGoal2;
            Double value2;
            context.getClass();
            kVar.getClass();
            fg0.j eventCustomization = kVar.getEventCustomization();
            if ((eventCustomization != null ? eventCustomization.getCustomGoal() : null) != null) {
                fg0.d completionTarget = kVar.getCompletionTarget();
                boolean z15 = false;
                double dDoubleValue = 0.0d;
                if ((completionTarget != null ? completionTarget.getUnitType() : null) == gg0.h.TIME) {
                    fg0.j eventCustomization2 = kVar.getEventCustomization();
                    if (eventCustomization2 != null && (customGoal2 = eventCustomization2.getCustomGoal()) != null) {
                        Double dB = customGoal2.b();
                        double dDoubleValue2 = dB != null ? dB.doubleValue() : 0.0d;
                        fg0.d completionTarget2 = kVar.getCompletionTarget();
                        if (completionTarget2 != null && (value2 = completionTarget2.getValue()) != null) {
                            dDoubleValue = value2.doubleValue();
                        }
                        double d14 = dDoubleValue;
                        a aVar = i.f73924a;
                        gg0.f eventType = kVar.getEventType();
                        boolean z16 = eventType != null && eventType.e();
                        aVar.getClass();
                        return m(context, dDoubleValue2, d14, z16, true, z14);
                    }
                } else {
                    fg0.d completionTarget3 = kVar.getCompletionTarget();
                    if (completionTarget3 != null) {
                        Double dB2 = completionTarget3.b();
                        double dDoubleValue3 = dB2 != null ? dB2.doubleValue() : 0.0d;
                        fg0.j eventCustomization3 = kVar.getEventCustomization();
                        if (eventCustomization3 != null && (customGoal = eventCustomization3.getCustomGoal()) != null && (value = customGoal.getValue()) != null) {
                            dDoubleValue = value.doubleValue();
                        }
                        a aVar2 = i.f73924a;
                        gg0.f eventType2 = kVar.getEventType();
                        if (eventType2 != null && eventType2.e()) {
                            z15 = true;
                        }
                        aVar2.getClass();
                        return m(context, dDoubleValue3, dDoubleValue, z15, false, z14);
                    }
                }
            }
            return null;
        }

        public static boolean o() {
            return ((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).A() && bo1.a.a().c().h();
        }

        public static boolean p() {
            if (o() && ((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).x() && bo1.a.a().c().w() && bo1.a.a().c().h0() && bo1.a.a().c().g()) {
                return true;
            }
            kg1.a.f104701a.getClass();
            return kg1.a.C2003a.a().J();
        }

        public static boolean q() {
            rt1.m mVar = (rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null);
            return mVar.A() && mVar.m() && bo1.a.a().c().i();
        }

        public static boolean r() {
            e12.e eVarC = bo1.a.a().c();
            return ((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).A() && eVarC.i0() && eVarC.c0() && eVarC.h() && eVarC.k();
        }

        public static void s(long j8) {
            l lVar = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);
            if (j8 > 0) {
                new Handler(Looper.getMainLooper()).postDelayed(new eh2.b(lVar, 7), j8);
            } else {
                lVar.T3(true);
            }
        }

        public static /* synthetic */ void t(a aVar) {
            aVar.getClass();
            s(0L);
        }

        public static void u(androidx.fragment.app.m mVar, e23.a aVar) {
            new androidx.appcompat.app.e.a(mVar).setTitle(R.string.lbl_exit_setup_question).setMessage(R.string.exit_training_plan_setup_question).setPositiveButton(R.string.lbl_exit, new ag0.d(25, aVar, mVar)).setNegativeButton(R.string.confirm_cancellation_dialog, new f20.i(5)).create().show();
        }

        public static void v(Context context) {
            context.getClass();
            new androidx.appcompat.app.e.a(context).setTitle(R.string.lbl_no_plan_details).setMessage(R.string.msg_view_training_plan_details).setPositiveButton(R.string.lbl_ok, new f20.i(6)).create().show();
        }

        private a() {
        }
    }
}
