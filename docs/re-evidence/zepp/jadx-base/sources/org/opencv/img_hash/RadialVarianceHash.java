package org.opencv.img_hash;

/* JADX INFO: loaded from: classes23.dex */
public class RadialVarianceHash extends ImgHashBase {
    public RadialVarianceHash(long j) {
        super(j);
    }

    public static RadialVarianceHash __fromPtr__(long j) {
        return new RadialVarianceHash(j);
    }

    public static RadialVarianceHash create(double d, int i) {
        return __fromPtr__(create_0(d, i));
    }

    private static native long create_0(double d, int i);

    private static native long create_1(double d);

    private static native long create_2();

    private static native void delete(long j);

    private static native int getNumOfAngleLine_0(long j);

    private static native double getSigma_0(long j);

    private static native void setNumOfAngleLine_0(long j, int i);

    private static native void setSigma_0(long j, double d);

    @Override // org.opencv.img_hash.ImgHashBase, org.opencv.core.Algorithm
    public void finalize() throws Throwable {
        delete(this.nativeObj);
    }

    public int getNumOfAngleLine() {
        return getNumOfAngleLine_0(this.nativeObj);
    }

    public double getSigma() {
        return getSigma_0(this.nativeObj);
    }

    public void setNumOfAngleLine(int i) {
        setNumOfAngleLine_0(this.nativeObj, i);
    }

    public void setSigma(double d) {
        setSigma_0(this.nativeObj, d);
    }

    public static RadialVarianceHash create(double d) {
        return __fromPtr__(create_1(d));
    }

    public static RadialVarianceHash create() {
        return __fromPtr__(create_2());
    }
}
