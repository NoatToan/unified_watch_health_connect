package jr;

import ch.qos.logback.core.joran.action.Action;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v54 jr.k[], still in use, count: 1, list:
  (r0v54 jr.k[]) from 0x0364: CONSTRUCTOR (r0v54 jr.k[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ljr/k;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k {
    ACTIVITY_LEGS("activityLegs"),
    BADGES("badges"),
    BANNER("banner"),
    CHART("chart"),
    CLIMBS("climbs"),
    CONNECT_IQ("connectIq"),
    CONNECT_IQ_APP_PROMO("connectIqPromo"),
    CONNECT_IQ_STAT("ciq"),
    CONNECTED_APP("connectedApp"),
    DEVICE("device"),
    DIVE_APP_PROMO("divePromo"),
    DIVE_BUDDY("diveBuddy"),
    DIVE_EQUIPMENT("diveEquipment"),
    DIVING_DEPTH("diveGraph"),
    DOGS("dogs"),
    E_BIKE("eBike"),
    ELECTRONIC_SHIFTING_DATA("electronicShiftingData"),
    /* JADX INFO: Fake field, exist only in values array */
    EMPTY(""),
    EXECUTION_SCORE("executionScore"),
    EXERCISES_TABLE("exercisesTable"),
    GROUP("group"),
    LINKED_EVENT("linkedEvent"),
    LINK_TRAIL_BANNER("linkATrailBanner"),
    LOCATION(FirebaseAnalytics.Param.LOCATION),
    MEDIA("media"),
    METADATA(TtmlNode.TAG_METADATA),
    MOBILITY_MOVES_TABLE("mobilityMovesTable"),
    MOVES_TABLE("movesTable"),
    MUSCLE_MAP("muscleMap"),
    PERSONAL_RECORDS("personalRecords"),
    PHYSIO_METRICS_INFO("physioMetricsInfo"),
    POSES_TABLE("posesTable"),
    PRIMARY_BENEFIT("primaryBenefit"),
    PRIMARY_STATS("primaryStats"),
    RATING("activityRating"),
    REPORTS("reports"),
    ROUNDS_TABLE("roundsTable"),
    SECONDARY_STATS("secondaryStats"),
    SEGMENTS("segments"),
    SELF_EVALUATION("selfEvaluation"),
    SENSORS("sensors"),
    SHOTVIEW_APP_PROMO("shotViewPromo"),
    SOCIAL_ENGAGEMENT("socialEngagement"),
    SOCIAL_GROUP_RIDE("socialGroupRide"),
    SOLAR_RIDE_TIME_GAINED("solarRideTimeGained"),
    STAT_SECTION("section"),
    TAGS("tags"),
    TIMING_GATES("timingGates"),
    TITLE_AND_NOTES("titleNotes"),
    TRAILS("trails"),
    VIEW_ALL("viewAllCategoryType"),
    WORKOUT_BENEFIT("workoutBenefit"),
    IRON("iron"),
    EPIC("multiDayActivities");


    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final /* synthetic */ w13.c f100165a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f100166b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100190a;

    static {
        f100165a1 = new w13.c(new k[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0});
    }

    private k(String str) {
        super(str, i);
        this.f100190a = str;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) Z0.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljr/k$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
