package fi.firstbeat.ete;

import fi.firstbeat.common.FbtException;
import fi.firstbeat.common.FbtParameters;
import fi.firstbeat.common.FbtTargetExercise;

/* JADX INFO: loaded from: classes22.dex */
public class EteNative {
    public static native void analyze(EteInput eteInput, long j) throws FbtException;

    public static native long createInstance();

    public static native void freeInstance(long j);

    public static native EteResults getResults(long j) throws FbtException;

    public static native String getVersion();

    public static native void setParameters(FbtParameters fbtParameters, Ete.ResetMode resetMode, long j) throws FbtException;

    public static native void setTargetExercise(FbtTargetExercise fbtTargetExercise, long j) throws FbtException;

    public static native void setWalkingTest(boolean z, long j) throws FbtException;
}
