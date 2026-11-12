package org.opencv.phase_unwrapping;

/* JADX INFO: loaded from: classes23.dex */
public class HistogramPhaseUnwrapping_Params {
    public final long nativeObj;

    public HistogramPhaseUnwrapping_Params(long j) {
        this.nativeObj = j;
    }

    private static native long HistogramPhaseUnwrapping_Params_0();

    public static HistogramPhaseUnwrapping_Params __fromPtr__(long j) {
        return new HistogramPhaseUnwrapping_Params(j);
    }

    private static native void delete(long j);

    private static native int get_height_0(long j);

    private static native float get_histThresh_0(long j);

    private static native int get_nbrOfLargeBins_0(long j);

    private static native int get_nbrOfSmallBins_0(long j);

    private static native int get_width_0(long j);

    private static native void set_height_0(long j, int i);

    private static native void set_histThresh_0(long j, float f);

    private static native void set_nbrOfLargeBins_0(long j, int i);

    private static native void set_nbrOfSmallBins_0(long j, int i);

    private static native void set_width_0(long j, int i);

    public void finalize() throws Throwable {
        delete(this.nativeObj);
    }

    public long getNativeObjAddr() {
        return this.nativeObj;
    }

    public int get_height() {
        return get_height_0(this.nativeObj);
    }

    public float get_histThresh() {
        return get_histThresh_0(this.nativeObj);
    }

    public int get_nbrOfLargeBins() {
        return get_nbrOfLargeBins_0(this.nativeObj);
    }

    public int get_nbrOfSmallBins() {
        return get_nbrOfSmallBins_0(this.nativeObj);
    }

    public int get_width() {
        return get_width_0(this.nativeObj);
    }

    public void set_height(int i) {
        set_height_0(this.nativeObj, i);
    }

    public void set_histThresh(float f) {
        set_histThresh_0(this.nativeObj, f);
    }

    public void set_nbrOfLargeBins(int i) {
        set_nbrOfLargeBins_0(this.nativeObj, i);
    }

    public void set_nbrOfSmallBins(int i) {
        set_nbrOfSmallBins_0(this.nativeObj, i);
    }

    public void set_width(int i) {
        set_width_0(this.nativeObj, i);
    }

    public HistogramPhaseUnwrapping_Params() {
        this.nativeObj = HistogramPhaseUnwrapping_Params_0();
    }
}
