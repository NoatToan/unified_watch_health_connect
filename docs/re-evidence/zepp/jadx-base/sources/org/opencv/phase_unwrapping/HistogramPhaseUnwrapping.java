package org.opencv.phase_unwrapping;

import org.opencv.core.Mat;

/* JADX INFO: loaded from: classes23.dex */
public class HistogramPhaseUnwrapping extends PhaseUnwrapping {
    public HistogramPhaseUnwrapping(long j) {
        super(j);
    }

    public static HistogramPhaseUnwrapping __fromPtr__(long j) {
        return new HistogramPhaseUnwrapping(j);
    }

    public static HistogramPhaseUnwrapping create(HistogramPhaseUnwrapping_Params histogramPhaseUnwrapping_Params) {
        return __fromPtr__(create_0(histogramPhaseUnwrapping_Params.nativeObj));
    }

    private static native long create_0(long j);

    private static native long create_1();

    private static native void delete(long j);

    private static native void getInverseReliabilityMap_0(long j, long j2);

    @Override // org.opencv.phase_unwrapping.PhaseUnwrapping, org.opencv.core.Algorithm
    public void finalize() throws Throwable {
        delete(this.nativeObj);
    }

    public void getInverseReliabilityMap(Mat mat) {
        getInverseReliabilityMap_0(this.nativeObj, mat.nativeObj);
    }

    public static HistogramPhaseUnwrapping create() {
        return __fromPtr__(create_1());
    }
}
