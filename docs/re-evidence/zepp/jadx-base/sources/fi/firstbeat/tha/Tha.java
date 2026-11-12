package fi.firstbeat.tha;

import fi.firstbeat.common.FbtException;
import fi.firstbeat.common.FbtParameters;

/* JADX INFO: loaded from: classes22.dex */
public class Tha {
    private static Tha instance = new Tha();

    public enum TrainingProgram {
        MAINTAIN,
        IMPROVE,
        IMPROVE_FAST
    }

    private Tha() {
    }

    public static native long getDatetimeId(int i, int i2, int i3, int i4, int i5);

    public static Tha getInstance() {
        return instance;
    }

    public static native String getVersion();

    public native void addExercise(ThaExercise thaExercise) throws FbtException;

    public native ThaWorkout[] getNextWorkoutRecommendation(int i, TrainingProgram trainingProgram) throws FbtException;

    public native int getPotentialMaxmet(int i) throws FbtException;

    public native ThaResults getResults() throws FbtException;

    public native void setParameters(FbtParameters fbtParameters, long j) throws FbtException;
}
