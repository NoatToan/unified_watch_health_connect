package org.opencv.img_hash;

/* JADX INFO: loaded from: classes23.dex */
public class PHash extends ImgHashBase {
    public PHash(long j) {
        super(j);
    }

    public static PHash __fromPtr__(long j) {
        return new PHash(j);
    }

    public static PHash create() {
        return __fromPtr__(create_0());
    }

    private static native long create_0();

    private static native void delete(long j);

    @Override // org.opencv.img_hash.ImgHashBase, org.opencv.core.Algorithm
    public void finalize() throws Throwable {
        delete(this.nativeObj);
    }
}
