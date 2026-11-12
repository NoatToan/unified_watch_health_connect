package fi.firstbeat.tha;

/* JADX INFO: loaded from: classes22.dex */
public class ThaExercise {
    public long datetimeId;
    public ExerciseType exerciseType;
    public int maximalMet;
    public int resourceRecovery;
    public int trainingLoadPeak;

    public enum ExerciseType {
        RUNNING,
        CYCLING
    }

    public ThaExercise() {
        this.exerciseType = ExerciseType.RUNNING;
    }

    public ThaExercise(long j, int i, int i2, int i3, ExerciseType exerciseType) {
        this.exerciseType = ExerciseType.RUNNING;
        this.datetimeId = j;
        this.resourceRecovery = i;
        this.maximalMet = i2;
        this.trainingLoadPeak = i3;
        this.exerciseType = exerciseType;
    }
}
