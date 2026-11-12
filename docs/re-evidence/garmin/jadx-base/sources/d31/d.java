package d31;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v57 d31.d[], still in use, count: 1, list:
  (r0v57 d31.d[]) from 0x0397: CONSTRUCTOR (r0v57 d31.d[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ld31/d;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {
    UNKNOWN(""),
    AB_QUANTUM("ABQuantum"),
    AB_SYNAPSE("ABSynapse"),
    ACTIVATE_LTE_SERVICE("activateLTEService"),
    ALARM("alarm"),
    AUTO_ACTIVITY_START("autoActivityStart"),
    BIKE_ALARM("bikeAlarm"),
    BPM_REMINDERS("bpmReminders"),
    CIQ_APPS("ciqApps"),
    CONNECTIONS("connections"),
    CONTACTS("contacts"),
    CREATE_COURSE("createCourse"),
    DAILY_STATS("dailyStats"),
    DEVICE_DISPLAY_NAME("deviceDisplayName"),
    DEVICE_WELCOME("deviceWelcome"),
    DEZL_APP("dezlApp"),
    ECG("ecg"),
    GARMIN_COACH("garminCoach"),
    GARMIN_DIVE("diveAppInstall"),
    GARMIN_MESSENGER("getMessenger"),
    GARMIN_PAY("garminPay"),
    GARMIN_PILOT("garminPilot"),
    GROUP_OVERHAUL_NO_GROUP("groupOverhaulNoGroup"),
    GROUP_RIDE("groupRide"),
    HEART_RATE_ZONES("hrZones"),
    INCIDENT_DETECTION("incidentDetection"),
    INDEX_SCALE_CONNECTIONS("indexScaleConnections"),
    INTELLIGENT_TRAINING_PLAN("intelligentTrainingPlan"),
    JET_LAG("jetLag"),
    KOMOOT("learnMoreKomoot"),
    LIFESTYLE_LOGGING("lifestyleLogging"),
    LIVE_TRACK("livetrack"),
    LTE("lte"),
    LTE_GENERIC("lteGeneric"),
    MENSTRUAL_CYCLE_TRACKING("menstrualCycleTracking"),
    MORNING_REPORT("morningReport"),
    MUSIC("music"),
    PACE_PRO("pacePro"),
    PARTNER_CHALLENGE_PROMOTE("partnerChallengePromote"),
    POWER_GUIDE("powerGuidePlan"),
    POWER_ZONES("powerZones"),
    PRECISE_LOCATION_ACCESS("locationAccess"),
    PULSE_OX("pulseOx"),
    PULSE_OX_JP("pulseOxJapan"),
    RECORD_ACTIVITIES("recordActivities"),
    SET_GOALS("setGoals"),
    SELECT_ACTIVITY("selectActivity"),
    SMART_WAKE_ALARM("smartWakeAlarm"),
    SOLAR_INTENSITY("solarIntensity"),
    TOPOGRAPHICAL_MAPS("topoActiveMaps"),
    VO2MAX_TEST("vo2MaxTest"),
    VOICE_ASSISTANT("voiceAssistant"),
    VOICE_COMMAND("garminVoiceCommand"),
    WATCH_FACE("watchFace"),
    WIDGETS("widgets"),
    WIFI("wifi"),
    WORKOUTS("workouts");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f57349b = new a(null);

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final /* synthetic */ w13.c f57356e1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57377a;

    static {
        f57356e1 = new w13.c(new d[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1});
    }

    private d(String str) {
        super(str, i);
        this.f57377a = str;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f57354d1.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld31/d$a;", "", "<init>", "()V", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static d a(String str) {
            Object next;
            str.getClass();
            w13.c cVar = d.f57356e1;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
            } while (!s.g(((d) next).f57377a, str));
            d dVar = (d) next;
            return dVar == null ? d.UNKNOWN : dVar;
        }

        private a() {
        }
    }
}
