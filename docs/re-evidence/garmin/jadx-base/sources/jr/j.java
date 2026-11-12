package jr;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v169 jr.j[], still in use, count: 1, list:
  (r0v169 jr.j[]) from 0x0b0e: CONSTRUCTOR (r0v169 jr.j[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ljr/j;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {
    ALTITUDE("altitude"),
    ASCENT("ascent"),
    ASCENT_DESCENT_ELEVATION("ascentDescentElevation"),
    AVERAGE_STRESS_LEVEL("averageStressLevel"),
    BIKE_FORCE("force"),
    BIKE_LR_BALANCE("bikeLeftRightBalance"),
    BIKE_WORKOUT_INTERVALS("bikeWorkoutIntervals"),
    BODY_BATTERY("bodyBattery"),
    BOTTOM_GAS("bottomGas"),
    BOTTOM_TIME("bottomTime"),
    BREATHWORK_RESPIRATION_RATE("breathworkRespirationRate"),
    CADENCE("cadence"),
    CALORIES("calories"),
    CALORIES_HYDRATION("caloriesOrNutritionAndHydration"),
    CNS("cns"),
    CONNECT_IQ_CHART("ciqChart"),
    CYCLING_CADENCE("cyclingCadence"),
    CTA(""),
    CDTA(""),
    CYCLING_DYNAMICS_TIME_IN_POSITION("cyclingDynamicsTimeInPosition"),
    CYCLING_DYNAMICS_POWER_IN_POSITION("cyclingDynamicsPowerInPosition"),
    CYCLING_DYNAMICS_POWER_PHASE("cyclingDynamicsPowerPhase"),
    CYCLING_PLATFORM_OFFSET("cyclingPlatformOffset"),
    CYCLING_POSITION("cyclingPosition"),
    CYCLING_TIME_IN_POSITION("cyclingTimeInPosition"),
    CYCLING_POWER("bikePower"),
    CYCLING_FORCE("bikeForce"),
    CYCLING_STROKES("cyclingStrokes"),
    CUMULATIVE_HEART_RATE("cumulativeHeartRate"),
    DANCE_METRICS("danceMetrics"),
    DEPTH("depth"),
    DEVICES_AND_APPS("devicesAndApps"),
    DIFFICULTY_LEVEL("difficultyLevel"),
    DILUENT_GAS("diluentGas"),
    DISTANCE("distance"),
    /* JADX INFO: Fake field, exist only in values array */
    OVERVIEW_STAT("distanceMeters"),
    DISTANCE_PER_STROKE("distancePerStroke"),
    DIVE_ADVANCED_DETAILS("diveAdvancedDetails"),
    DIVE_DEPTH("diveDepth"),
    DIVE_DYNAMIC_INTERVALS("diveDynamicIntervals"),
    DIVE_ENVIRONMENT("diveEnvironment"),
    DIVE_GAS("diveGas"),
    DIVE_INTERVALS("diveIntervals"),
    DIVE_LOCATION("diveLocation"),
    DIVE_LOG_SUMMARY("diveLogSummary"),
    DIVE_REST_INTERVALS("diveRestIntervals"),
    DIVE_SESSION("diveSession"),
    DIVE_STATIC_INTERVALS("diveStaticIntervals"),
    DIVE_TANK_SENSORS("diveTankSensors"),
    DIVING_CONSERVATISM("divingConservatism"),
    DRAG_CDA("dragCdA"),
    DRAG_WATTS_PER_CDA("dragWattsPerCdA"),
    E_BIKE_ASSIST_LEVEL_PERCENT("eBikeAssistLevelPercent"),
    E_BIKE_ASSIST_MODE("eBikeAssistMode"),
    E_BIKE_BATTERY_LEVEL("eBikeBatteryLevel"),
    ELEVATION("elevation"),
    EVALUATION("evaluation"),
    EXPOSURE_SUIT("exposureSuit"),
    FLOORS("floors"),
    FLOOR_CLIMBING_SPEED("floorClimbingSpeed"),
    FLOW("flow"),
    FLYING_ALTITUDE("flyingAltitude"),
    FLYING_GROUND_SPEED("flyingGroundSpeed"),
    GAME_INFO("gameInfo"),
    GRADE_ADJUSTED_PACE("gradeAdjustedPace"),
    GRIT("grit"),
    GROUND_CONTACT_TIME("groundContactTime"),
    GROUND_CONTACT_TIME_BALANCE("groundContactTimeBalance"),
    HEART_RATE("heartRate"),
    HEART_RATE_ZONES("heartRateZones"),
    IMPACT_LOAD("impactLoad"),
    INDOOR_CLIMB_ASCENT("indoorClimbAscent"),
    INTENSITY_MINUTES("intensityMinutes"),
    JUMP_ROPE_METRICS("jumpRopeMetrics"),
    JUMP_ROPE_SPEED("jumpRopeSpeed"),
    LAP_AVERAGE_PACE("lapAveragePace"),
    LAP_PACE("lapPace"),
    LAP_RUN_POWER("lapRunPower"),
    LAP_RUN_POWER_PER_KG("lapRunPowerPerKg"),
    LAP_TIME("lapTime"),
    LEFT_PLATFORM_CENTER_OFFSET("leftPlatformCenterOffset"),
    MOUNTAIN_BIKE_METRICS("mtbMetrics"),
    N2("n2"),
    NAUTICAL_SPEED("nauticalSpeed"),
    NAVIGATION("navigation"),
    OPEN_WATER_SWIM_CADENCE("openWaterSwimCadence"),
    OPEN_WATER_SWIM_PACE("openWaterSwimPace"),
    /* JADX INFO: Fake field, exist only in values array */
    OVERVIEW_STAT("overviewStats"),
    PACE("pace"),
    PACK_CALORIES("packCalories"),
    PACK_WEIGHT("packWeight"),
    PEAK_POWER_PHASE_END("peakPowerPhaseEnd"),
    PEAK_POWER_PHASE_START("peakPowerPhaseStart"),
    PERFORMANCE_CONDITION("performanceCondition"),
    PILATES_WORKOUT_DETAILS("pilatesWorkoutDetails"),
    MOBILITY_WORKOUT_DETAILS("mobilityWorkoutDetails"),
    PLATFORM_CENTER_OFFSET("platformCenterOffset"),
    PO2("po2"),
    POOL_SIZE("poolSize"),
    POWER("power"),
    POWER_CURVE_WATTS("powerCurveWatts"),
    POWER_CURVE_WATTS_PER_KG("powerCurveWattsPerKilogram"),
    POWER_PHASE_AND_BALANCE("powerPhaseAndBalance"),
    POWER_PHASE_END("powerPhaseEnd"),
    POWER_PHASE_START("powerPhaseStart"),
    PULSE_OX("pulseOx"),
    PUSHES("pushes"),
    RACE_LOCATION("raceLocation"),
    RESPIRATION_RATE("respirationRate"),
    RIGHT_PLATFORM_CENTER_OFFSET("rightPlatformCenterOffset"),
    ROAD_SURFACE("roadSurface"),
    ROUTES("routes"),
    ROUTE_DIFFICULTY("routeDifficulty"),
    ROUTES_CLIMBED("routesClimbed"),
    ROWING_PACE("rowingPace"),
    ROWING_DISTANCE_PER_STROKE("rowingDistancePerStroke"),
    ROWING_STROKES("rowingStrokes"),
    RUN_DISTANCE("runDistance"),
    RUN_POWER("runPower"),
    RUN_POWER_PER_KG("runPowerPerKg"),
    RUN_WALK("runWalk"),
    RUN_WALK_DETECTION("runWalkDetection"),
    RUN_WORKOUT_INTERVALS("runWorkoutIntervals"),
    RUNNING_CADENCE("runningCadence"),
    RUNNING_DYNAMICS("runningDynamics"),
    SKI_CADENCE("skiCadence"),
    SKI_POWER("skiPower"),
    SPEED("speed"),
    SPLIT_HEART_RATE_AVERAGES("splitHeartRateAverages"),
    SPLIT_PACE_AVERAGES("splitPaceAverages"),
    SPLIT_POWER_AVERAGES("splitPowerAverages"),
    STAMINA("stamina"),
    STAMINA_ZONES("staminaZones"),
    STEP_SPEED_LOSS("stepSpeedLoss"),
    STEP_SPEED_LOSS_PERCENT("stepSpeedLossPercent"),
    STRESS_LEVEL("stressLevel"),
    STRIDE_LENGTH("strideLength"),
    STROKE_RATE("strokeRate"),
    SUMMARY("summary"),
    SURFACE_CONDITION("surfaceCondition"),
    /* JADX INFO: Fake field, exist only in values array */
    SWIM_LENGTHS("swimLengths"),
    SWIM_PACE("swimPace"),
    SWIM_SPEED("swimSpeed"),
    SWIM_STROKES("swimStrokes"),
    SWIM_SWOLF("swimSwolf"),
    SWIMMING_DYNAMICS("swimmingDynamics"),
    TEMPERATURE("temperature"),
    TEMPO("tempo"),
    TIME("time"),
    TIME_IN_HEART_RATE_ZONES("timeInHeartRateZones"),
    TIME_IN_RUN_POWER_ZONES("runningTimeInPowerZones"),
    TIME_IN_POWER_ZONES("timeInPowerZones"),
    TIME_IN_STAMINA_PACE_ZONES("timeInStaminaPaceZones"),
    TIME_IN_STAMINA_POWER_ZONES("timeInStaminaPowerZones"),
    TRAINING_EFFECT("trainingEffect"),
    VERTICAL_OSCILLATION("verticalOscillation"),
    VERTICAL_RATIO("verticalRatio"),
    WALKING_CADENCE("walkingCadence"),
    WALKING_DYNAMICS("walkingDynamics"),
    WATER("water"),
    WATER_TEMPERATURE("waterTemperature"),
    WAVE_DISTANCE("waveDistance"),
    WEIGHT("weight"),
    WHEEL_CHAIR_CADENCE("wheelchairCadence"),
    WIND_SPEED("windSpeed"),
    WORKOUT_DETAILS("workoutDetails"),
    HIIT_WORKOUT_DETAILS("hiitWorkoutDetails"),
    XC_SKI_CADENCE("xcSkiCadence"),
    XC_SKI_STRIDE_LENGTH("xcSkiStrideLength");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f100081b = new a(null);

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final /* synthetic */ w13.c f100116j3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100164a;

    static {
        f100116j3 = new w13.c(new j[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, r1, r0, r2, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1});
    }

    private j(String str) {
        super(str, i);
        this.f100164a = str;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f100112i3.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljr/j$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static j a(String str) {
            Object next;
            w13.c cVar = j.f100116j3;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (p005kotlin.jvm.internal.s.g(((j) next).f100164a, str)) {
                    return (j) next;
                }
            }
            next = null;
            return (j) next;
        }

        private a() {
        }
    }
}
