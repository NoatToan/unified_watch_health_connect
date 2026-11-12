package fi.firstbeat.common;

/* JADX INFO: loaded from: classes22.dex */
public class FbtException extends Exception {
    private ErrorType type;

    public enum ErrorType {
        NONE,
        UNINITIALIZED,
        INVALID_ACTIVITY_CLASS,
        INVALID_TRAINING_EFFECT,
        INVALID_AGE,
        INVALID_HEIGHT,
        INVALID_WEIGHT,
        INVALID_GENDER,
        INVALID_NOW_DATE,
        INVALID_MAXIMAL_MET,
        INVALID_MINIMAL_HR,
        INVALID_MAXIMAL_HR,
        INVALID_MEAN_MAD,
        INVALID_ANAEROBIC_THRESHOLD_HR,
        INVALID_ANAEROBIC_THRESHOLD_SPEED,
        INVALID_ANAEROBIC_THRESHOLD_POWER,
        INVALID_RECOVERY_TIME,
        INVALID_MONTHLY_LOAD,
        INVALID_MAXIMAL_BODY_STATUS,
        INVALID_MAXIMAL_SLEEP_QUALITY,
        INVALID_STRESS_BALANCE,
        INVALID_DATE_TIME,
        INVALID_DISTANCE,
        INVALID_COOL_TIME,
        INVALID_REPEATS,
        INVALID_REST_TIME,
        INVALID_WARMUP_TIME,
        INVALID_WORK_TIME,
        INVALID_TRAINING_LOAD_PEAK,
        INVALID_POINTER_PARAMETER,
        INVALID_RRI,
        INVALID_HR,
        INVALID_HR_QUALITY,
        INVALID_ALTITUDE_SOURCE,
        INVALID_USER_STATE,
        INVALID_SPEED,
        INVALID_TEMPERATURE,
        INVALID_HUMIDITY,
        INVALID_ALTITUDE,
        INVALID_POWER,
        INVALID_STEPS,
        INVALID_SAMPLING_RATE,
        INVALID_ACCELERATION,
        ACCLIMATIZATION_ALTITUDE_FINALIZED,
        ACCLIMATIZATION_HEAT_FINALIZED,
        INVALID_EXERCISE_DATE,
        INVALID_EXERCISE_TYPE,
        NO_MAXMETS_IN_HISTORY,
        INVALID_DAYS,
        INVALID_TRAINING_PROGRAM,
        INVALID_DURATION,
        INVALID_MAXIMAL_MET_PERCENTAGE,
        INVALID_ESTIMATE_INPUT
    }

    public FbtException() {
        this.type = null;
    }

    public ErrorType getErrorType() {
        return this.type;
    }

    public FbtException(String str) {
        super(str);
        this.type = null;
    }

    public FbtException(ErrorType errorType, String str) {
        super(str);
        this.type = null;
        this.type = errorType;
    }
}
