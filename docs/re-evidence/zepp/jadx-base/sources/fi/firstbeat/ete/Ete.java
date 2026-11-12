package fi.firstbeat.ete;

import fi.firstbeat.common.FbtException;
import fi.firstbeat.common.FbtParameters;
import fi.firstbeat.common.FbtTargetExercise;

/* JADX INFO: loaded from: classes22.dex */
public class Ete {
    private long mEteInstance = EteNative.createInstance();

    public enum ResetMode {
        FULL,
        LIFESTYLE,
        FITNESS,
        FITNESS_AND_TRAINING_EFFECT
    }

    public static String getVersion() {
        return EteNative.getVersion();
    }

    public void analyze(EteInput eteInput) throws FbtException {
        try {
            EteNative.analyze(eteInput, this.mEteInstance);
        } catch (FbtException e) {
            throw e;
        }
    }

    public void finalize() throws Throwable {
        EteNative.freeInstance(this.mEteInstance);
        this.mEteInstance = 0L;
    }

    public EteResults getResults() throws FbtException {
        try {
            return EteNative.getResults(this.mEteInstance);
        } catch (FbtException e) {
            throw e;
        }
    }

    public void setParameters(FbtParameters fbtParameters, ResetMode resetMode) throws FbtException {
        try {
            EteNative.setParameters(fbtParameters, resetMode, this.mEteInstance);
        } catch (FbtException e) {
            throw e;
        }
    }

    public void setTargetExercise(FbtTargetExercise fbtTargetExercise) throws FbtException {
        try {
            EteNative.setTargetExercise(fbtTargetExercise, this.mEteInstance);
        } catch (FbtException e) {
            throw e;
        }
    }

    public void setWalkingTest(boolean z) throws FbtException {
        try {
            EteNative.setWalkingTest(z, this.mEteInstance);
        } catch (FbtException e) {
            throw e;
        }
    }
}
