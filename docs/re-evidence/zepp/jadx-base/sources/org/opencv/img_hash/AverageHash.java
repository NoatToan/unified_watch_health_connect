package org.opencv.img_hash;

/* JADX INFO: loaded from: classes23.dex */
public class AverageHash extends ImgHashBase {
    public AverageHash(long j) {
        super(j);
    }

    public static AverageHash __fromPtr__(long j) {
        return new AverageHash(j);
    }

    public static AverageHash create() {
        return __fromPtr__(create_0());
    }

    private static native long create_0();

    private static native void delete(long j);

    @Override // org.opencv.img_hash.ImgHashBase, org.opencv.core.Algorithm
    public void finalize() throws Throwable {
        delete(this.nativeObj);
    }
}
