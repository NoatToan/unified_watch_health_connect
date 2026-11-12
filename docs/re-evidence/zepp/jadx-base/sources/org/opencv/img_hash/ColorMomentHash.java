package org.opencv.img_hash;

/* JADX INFO: loaded from: classes23.dex */
public class ColorMomentHash extends ImgHashBase {
    public ColorMomentHash(long j) {
        super(j);
    }

    public static ColorMomentHash __fromPtr__(long j) {
        return new ColorMomentHash(j);
    }

    public static ColorMomentHash create() {
        return __fromPtr__(create_0());
    }

    private static native long create_0();

    private static native void delete(long j);

    @Override // org.opencv.img_hash.ImgHashBase, org.opencv.core.Algorithm
    public void finalize() throws Throwable {
        delete(this.nativeObj);
    }
}
