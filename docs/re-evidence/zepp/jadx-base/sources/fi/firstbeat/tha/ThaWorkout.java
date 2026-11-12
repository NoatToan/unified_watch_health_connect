package fi.firstbeat.tha;

import fi.firstbeat.common.FbtTargetExercise;

/* JADX INFO: loaded from: classes22.dex */
public class ThaWorkout {
    public int distance;
    public int duration;
    public int trainingEffect;
    public FbtTargetExercise targetExercise = new FbtTargetExercise();
    public Phrase phrase = Phrase.REST_OR_LIGHT;
    public ThaWorkoutLimits intensity = new ThaWorkoutLimits();
    public ThaWorkoutLimits heartRate = new ThaWorkoutLimits();
    public ThaWorkoutLimits runningSpeed = new ThaWorkoutLimits();

    public enum Phrase {
        REST_OR_LIGHT,
        MAINTAINING,
        IMPROVING
    }
}
