package ag2;

import am.j;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lag2/c;", "", "", "_itemType", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("itemType")
    private final String _itemType;

    public c(String str) {
        str.getClass();
        this._itemType = str;
    }

    public final a a() {
        Object next;
        a.C0054a c0054a = a.f3171c;
        String str = this._itemType;
        c0054a.getClass();
        str.getClass();
        Iterator<T> it = a.f3217z1.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (s.g(((a) next).f3218a, str)) {
                return (a) next;
            }
        }
        next = null;
        return (a) next;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && s.g(this._itemType, ((c) obj)._itemType);
    }

    public final int hashCode() {
        return this._itemType.hashCode();
    }

    public final String toString() {
        return j.m("Item(_itemType=", this._itemType, ")");
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v68 ag2.c$a[], still in use, count: 1, list:
      (r0v68 ag2.c$a[]) from 0x05cd: CONSTRUCTOR (r0v68 ag2.c$a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lag2/c$a;", "", "", Action.KEY_ATTRIBUTE, "", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        DISTANCE("distance", R.string.lbl_distance),
        STEP_DISTANCE("stepDistance", R.string.lbl_step_distance),
        TIMER("timer", R.string.run_options_timer),
        SET_TIMER("setTimer", R.string.set_timer),
        WORKING_TIME("workingTime", R.string.lbl_working_time),
        REST_TIME("restTime", R.string.strength_training_rest_time_label),
        REST_TIMER("restTimer", R.string.lbl_rest_timer),
        REST_DURATION("restDuration", R.string.rest_duration),
        AVG_PACE("avgPace", R.string.lbl_avg_pace),
        AVG_SPEED("avgSpeed", R.string.lbl_avg_speed),
        REPS("reps", R.string.workout_reps),
        SETS("sets", R.string.strength_training_sets),
        ROUNDS("rounds", R.string.lbl_rounds),
        AVG_HEART_RATE("avgHeartRate", R.string.activity_details_average_heart_rate),
        CALORIES("calories", R.string.concept_calories),
        TOTAL_CALORIES("totalCalories", R.string.calories_total_label),
        STEP_CALORIES("stepCalories", R.string.steps_steps_calories),
        ACTIVE_CALORIES("activeCalories", R.string.lbl_active_calories),
        POWER("power", R.string.activity_details_power),
        AVG_POWER("avgPower", R.string.activity_details_average_power),
        POWER_ZONE("powerZone", R.string.workout_power_zone),
        STROKE_RATE("strokeRate", R.string.activity_details_stroke_rate),
        TOTAL_STROKES("totalStrokes", R.string.activity_details_total_strokes),
        RESPIRATION_RATE("respirationRate", R.string.activities_respiration_rate),
        POSES("poses", R.string.lbl_pose_plural),
        MOVES("moves", R.string.lbl_common_moves),
        HEART_RATE("heartRate", R.string.activity_details_heart_rate),
        HEART_RATE_ZONE("heartRateZone", R.string.workout_heart_rate_zone),
        SPEED("speed", R.string.lbl_speed),
        PACE("pace", R.string.lbl_pace),
        GRADE_ADJUSTED_PACE("gradeAdjustedPace", R.string.grade_adjusted_pace),
        STEP_DURATION("stepDuration", R.string.workout_duration),
        STEP_TARGET("stepTarget", R.string.workout_target),
        ANIMATED_WORKOUT("animatedWorkout", R.string.lbl_workout),
        PRIMARY_TARGET("primaryTarget", R.string.workout_primary_target),
        SECONDARY_TARGET("secondaryTarget", R.string.workout_secondary_target),
        MUSCLE_MAP("muscleMap", R.string.lbl_detailed_muscle_view),
        DISTANCE_METERS("distanceMeters", R.string.lbl_distance),
        LAP_DISTANCE("lapDistance", R.string.run_options_distance_lap),
        LAP_TIMER("lapTimer", R.string.lap_timer),
        LAP_PACE("lapPace", R.string.run_options_pace_lap),
        LAP_AVG_HEART_RATE("lapAvgHeartRate", R.string.lap_avg_heart_rate),
        LAP_AVG_POWER("lapAvgPower", R.string.lap_avg_power),
        LAP_POWER("lapPower", R.string.audio_prompts_power_alert_type_lap),
        LAP_COUNT("lapCount", R.string.lbl_laps),
        STEP_TIMER("stepTimer", R.string.step_timer),
        BIKE_CADENCE("bikeCadence", R.string.activity_details_cadence),
        RUN_CADENCE("runCadence", R.string.activity_details_cadence),
        CIRCUITS("circuits", R.string.circuits),
        ROUND("round", R.string.golf_lbl_round),
        INTERVALS("intervals", R.string.interval),
        STRESS("stress", R.string.title_stress),
        MAX_STRESS("maxStress", R.string.max_stress),
        AVG_STRESS("avgStress", R.string.avg_stress),
        MAX_HEART_RATE("maxHeartRate", R.string.activity_details_max_heart_rate),
        ELEVATION("elevation", R.string.elevation),
        SONG_COUNT("songCount", R.string.song_count),
        TOTAL_ASCENT("totalAscent", R.string.total_ascent),
        TOTAL_DESCENT("totalDescent", R.string.total_descent),
        JUMP_ROPE_ACTIVE_TIME("jumpRopeActiveTime", R.string.active_time),
        JUMP_ROPE_AVG_SPEED("jumpRopeAvgSpeed", R.string.lbl_avg_speed),
        JUMP_ROPE_REPS("jumpRopeCount", R.string.reps_title_case),
        JUMP_ROPE_ROUNDS("jumpRopeNumRounds", R.string.lbl_rounds),
        AVG_TEMPO("avgTempo", R.string.avg_tempo),
        STEPS("steps", R.string.steps),
        TOTAL_ROUTES("totalRoutes", R.string.total_routes),
        JUMP_ROPE_LAST_ROUND_REPS("jumpRopeLastRoundReps", R.string.last_round_reps),
        FLOORS_CLIMBED("floorsClimbed", R.string.floors_climbed),
        FLOOR_CLIMB_RATE("floorClimbRate", R.string.lbl_avg_speed),
        ROW_PACE("rowPace", R.string.lbl_pace),
        AVG_ROW_PACE_500M("avgPace500m", R.string.lbl_avg_pace),
        AVG_STROKE_RATE("avgStrokeRate", R.string.avg_stroke_rate),
        BREATHWORK("breathwork", R.string.lbl_pace),
        MEDITATION_CARD("meditation", R.string.lbl_pace),
        MEDITATION_TIMER("meditationTimer", R.string.lbl_time_remaining),
        WORKOUT_CURRENT_REPEAT_TIME_REMAINING("workoutCurrentRepeatTimeRemaining", R.string.lbl_time_remaining),
        BREATHWORK_PHASE("phase", R.string.lbl_phase);


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0054a f3171c = new C0054a(null);

        /* JADX INFO: renamed from: z1, reason: collision with root package name */
        public static final /* synthetic */ w13.c f3217z1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f3219b;

        public static final /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3220a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.DISTANCE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.STEP_DISTANCE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.AVG_SPEED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.REPS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.SETS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ROUNDS.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.AVG_HEART_RATE.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[a.CALORIES.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[a.TOTAL_CALORIES.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[a.STEP_CALORIES.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[a.ACTIVE_CALORIES.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[a.POWER.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[a.AVG_POWER.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[a.POWER_ZONE.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[a.STROKE_RATE.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[a.TOTAL_STROKES.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[a.RESPIRATION_RATE.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[a.POSES.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[a.MOVES.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[a.HEART_RATE.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[a.HEART_RATE_ZONE.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[a.SPEED.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[a.STEP_TARGET.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[a.ANIMATED_WORKOUT.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[a.PRIMARY_TARGET.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[a.SECONDARY_TARGET.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[a.MUSCLE_MAP.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[a.DISTANCE_METERS.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[a.LAP_DISTANCE.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[a.LAP_AVG_HEART_RATE.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[a.LAP_AVG_POWER.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[a.LAP_POWER.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[a.LAP_COUNT.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[a.BIKE_CADENCE.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[a.RUN_CADENCE.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[a.CIRCUITS.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[a.ROUND.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[a.INTERVALS.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[a.STRESS.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[a.MAX_STRESS.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[a.AVG_STRESS.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[a.MAX_HEART_RATE.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[a.ELEVATION.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[a.SONG_COUNT.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[a.TOTAL_ASCENT.ordinal()] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[a.TOTAL_DESCENT.ordinal()] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[a.JUMP_ROPE_AVG_SPEED.ordinal()] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr[a.JUMP_ROPE_REPS.ordinal()] = 48;
                } catch (NoSuchFieldError unused48) {
                }
                try {
                    iArr[a.JUMP_ROPE_ROUNDS.ordinal()] = 49;
                } catch (NoSuchFieldError unused49) {
                }
                try {
                    iArr[a.AVG_TEMPO.ordinal()] = 50;
                } catch (NoSuchFieldError unused50) {
                }
                try {
                    iArr[a.STEPS.ordinal()] = 51;
                } catch (NoSuchFieldError unused51) {
                }
                try {
                    iArr[a.TOTAL_ROUTES.ordinal()] = 52;
                } catch (NoSuchFieldError unused52) {
                }
                try {
                    iArr[a.JUMP_ROPE_LAST_ROUND_REPS.ordinal()] = 53;
                } catch (NoSuchFieldError unused53) {
                }
                try {
                    iArr[a.FLOORS_CLIMBED.ordinal()] = 54;
                } catch (NoSuchFieldError unused54) {
                }
                try {
                    iArr[a.FLOOR_CLIMB_RATE.ordinal()] = 55;
                } catch (NoSuchFieldError unused55) {
                }
                try {
                    iArr[a.AVG_STROKE_RATE.ordinal()] = 56;
                } catch (NoSuchFieldError unused56) {
                }
                try {
                    iArr[a.BREATHWORK.ordinal()] = 57;
                } catch (NoSuchFieldError unused57) {
                }
                try {
                    iArr[a.MEDITATION_CARD.ordinal()] = 58;
                } catch (NoSuchFieldError unused58) {
                }
                try {
                    iArr[a.BREATHWORK_PHASE.ordinal()] = 59;
                } catch (NoSuchFieldError unused59) {
                }
                try {
                    iArr[a.TIMER.ordinal()] = 60;
                } catch (NoSuchFieldError unused60) {
                }
                try {
                    iArr[a.SET_TIMER.ordinal()] = 61;
                } catch (NoSuchFieldError unused61) {
                }
                try {
                    iArr[a.WORKING_TIME.ordinal()] = 62;
                } catch (NoSuchFieldError unused62) {
                }
                try {
                    iArr[a.REST_TIME.ordinal()] = 63;
                } catch (NoSuchFieldError unused63) {
                }
                try {
                    iArr[a.REST_TIMER.ordinal()] = 64;
                } catch (NoSuchFieldError unused64) {
                }
                try {
                    iArr[a.REST_DURATION.ordinal()] = 65;
                } catch (NoSuchFieldError unused65) {
                }
                try {
                    iArr[a.AVG_PACE.ordinal()] = 66;
                } catch (NoSuchFieldError unused66) {
                }
                try {
                    iArr[a.PACE.ordinal()] = 67;
                } catch (NoSuchFieldError unused67) {
                }
                try {
                    iArr[a.GRADE_ADJUSTED_PACE.ordinal()] = 68;
                } catch (NoSuchFieldError unused68) {
                }
                try {
                    iArr[a.STEP_DURATION.ordinal()] = 69;
                } catch (NoSuchFieldError unused69) {
                }
                try {
                    iArr[a.LAP_TIMER.ordinal()] = 70;
                } catch (NoSuchFieldError unused70) {
                }
                try {
                    iArr[a.LAP_PACE.ordinal()] = 71;
                } catch (NoSuchFieldError unused71) {
                }
                try {
                    iArr[a.STEP_TIMER.ordinal()] = 72;
                } catch (NoSuchFieldError unused72) {
                }
                try {
                    iArr[a.JUMP_ROPE_ACTIVE_TIME.ordinal()] = 73;
                } catch (NoSuchFieldError unused73) {
                }
                try {
                    iArr[a.ROW_PACE.ordinal()] = 74;
                } catch (NoSuchFieldError unused74) {
                }
                try {
                    iArr[a.AVG_ROW_PACE_500M.ordinal()] = 75;
                } catch (NoSuchFieldError unused75) {
                }
                try {
                    iArr[a.MEDITATION_TIMER.ordinal()] = 76;
                } catch (NoSuchFieldError unused76) {
                }
                try {
                    iArr[a.WORKOUT_CURRENT_REPEAT_TIME_REMAINING.ordinal()] = 77;
                } catch (NoSuchFieldError unused77) {
                }
                f3220a = iArr;
            }
        }

        static {
            f3217z1 = new w13.c(new a[]{r1, r2, r3, r0, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r2, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r2, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r2, r0, r1, r0});
        }

        private a(String str, int i14) {
            super(str, i);
            this.f3218a = str;
            this.f3219b = i14;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f3215y1.clone();
        }

        /* JADX INFO: renamed from: ag2.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lag2/c$a$a;", "", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0054a {
            public /* synthetic */ C0054a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C0054a() {
            }
        }
    }
}
