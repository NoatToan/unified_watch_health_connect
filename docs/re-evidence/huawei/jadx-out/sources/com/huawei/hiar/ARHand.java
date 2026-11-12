package com.huawei.hiar;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes33.dex */
public class ARHand extends ARTrackableBase {
    static final String TAG = "ARHand";

    private native int[] nativeGetGestureAction(long j, long j2);

    private native float[] nativeGetGestureCenter(long j, long j2);

    private native int nativeGetGestureCoordinateSystem(long j, long j2);

    private native float[] nativeGetGestureHandBox(long j, long j2);

    private native float[] nativeGetGestureOrientation(long j, long j2);

    private native int nativeGetGestureType(long j, long j2);

    private native int nativeGetHandId(long j, long j2);

    private native float[] nativeGetHandSkeletonArray(long j, long j2);

    private native int[] nativeGetHandSkeletonConnection(long j, long j2);

    private native int[] nativeGetHandSkeletonType(long j, long j2);

    private native int nativeGetHandType(long j, long j2);

    private native int nativeGetSkeletonCoordinateSystem(long j, long j2);

    @Override // com.huawei.hiar.ARTrackableBase
    public String toString() {
        Locale locale = Locale.ENGLISH;
        int keyValues = getGestureCoordinateSystem().getKeyValues();
        int keyValues2 = getHandtype().getKeyValues();
        int gestureType = getGestureType();
        return String.format(locale, "ARHand{ coordinate: %d, handType: %d,gestureType:%d, handBox:%s , center:%s, action:%s, eulerAngle:%s} %n", Integer.valueOf(keyValues), Integer.valueOf(keyValues2), Integer.valueOf(gestureType), Arrays.toString(getGestureHandBox()), Arrays.toString(getGestureCenter()), Arrays.toString(getGestureAction()), Arrays.toString(getGestureOrientation()));
    }

    @Override // com.huawei.hiar.ARTrackableBase
    public int hashCode() {
        return super.hashCode();
    }

    public ARCoordinateSystemType getSkeletonCoordinateSystem() {
        return ARCoordinateSystemType.forNumber(nativeGetSkeletonCoordinateSystem(this.mSession.mNativeHandle, this.mNativeHandle));
    }

    public ARHandType getHandtype() {
        return ARHandType.forNumber(nativeGetHandType(this.mSession.mNativeHandle, this.mNativeHandle));
    }

    public ARHandSkeletonType[] getHandskeletonTypes() {
        int[] iArrNativeGetHandSkeletonType = nativeGetHandSkeletonType(this.mSession.mNativeHandle, this.mNativeHandle);
        if (iArrNativeGetHandSkeletonType == null) {
            return new ARHandSkeletonType[0];
        }
        ARHandSkeletonType[] aRHandSkeletonTypeArr = new ARHandSkeletonType[iArrNativeGetHandSkeletonType.length];
        for (int i = 0; i < iArrNativeGetHandSkeletonType.length; i++) {
            aRHandSkeletonTypeArr[i] = ARHandSkeletonType.forNumber(iArrNativeGetHandSkeletonType[i]);
        }
        return aRHandSkeletonTypeArr;
    }

    public float[] getHandskeletonArray() {
        return nativeGetHandSkeletonArray(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public int[] getHandSkeletonConnection() {
        return nativeGetHandSkeletonConnection(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    @Deprecated
    public int getHandID() {
        return nativeGetHandId(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public int getGestureType() {
        return nativeGetGestureType(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public float[] getGestureOrientation() {
        return nativeGetGestureOrientation(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public float[] getGestureHandBox() {
        return nativeGetGestureHandBox(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public enum ARHandType {
        AR_HAND_UNKNOWN(-1),
        AR_HAND_RIGHT(0),
        AR_HAND_LEFT(1);

        final int nativeCode;

        public int getKeyValues() {
            return this.nativeCode;
        }

        static ARHandType forNumber(int i) {
            for (ARHandType aRHandType : values()) {
                if (aRHandType.nativeCode == i) {
                    return aRHandType;
                }
            }
            return AR_HAND_UNKNOWN;
        }

        ARHandType(int i) {
            this.nativeCode = i;
        }
    }

    public ARCoordinateSystemType getGestureCoordinateSystem() {
        return ARCoordinateSystemType.forNumber(nativeGetGestureCoordinateSystem(this.mSession.mNativeHandle, this.mNativeHandle));
    }

    public float[] getGestureCenter() {
        return nativeGetGestureCenter(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public int[] getGestureAction() {
        return nativeGetGestureAction(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public enum ARHandSkeletonType {
        HANDSKELETON_UNKNOWN(-1),
        HANDSKELETON_ROOT(0),
        HANDSKELETON_PINKY_1(1),
        HANDSKELETON_PINKY_2(2),
        HANDSKELETON_PINKY_3(3),
        HANDSKELETON_PINKY_4(4),
        HANDSKELETON_RING_1(5),
        HANDSKELETON_RING_2(6),
        HANDSKELETON_RING_3(7),
        HANDSKELETON_RING_4(8),
        HANDSKELETON_MIDDLE_1(9),
        HANDSKELETON_MIDDLE_2(10),
        HANDSKELETON_MIDDLE_3(11),
        HANDSKELETON_MIDDLE_4(12),
        HANDSKELETON_INDEX_1(13),
        HANDSKELETON_INDEX_2(14),
        HANDSKELETON_INDEX_3(15),
        HANDSKELETON_INDEX_4(16),
        HANDSKELETON_THUMB_1(17),
        HANDSKELETON_THUMB_2(18),
        HANDSKELETON_THUMB_3(19),
        HANDSKELETON_THUMB_4(20),
        HANDSKELETON_LENGTH(21);

        final int nativeCode;

        static ARHandSkeletonType forNumber(int i) {
            for (ARHandSkeletonType aRHandSkeletonType : values()) {
                if (aRHandSkeletonType.nativeCode == i) {
                    return aRHandSkeletonType;
                }
            }
            return HANDSKELETON_UNKNOWN;
        }

        ARHandSkeletonType(int i) {
            this.nativeCode = i;
        }
    }

    @Override // com.huawei.hiar.ARTrackableBase
    protected void finalize() {
        super.finalize();
    }

    @Override // com.huawei.hiar.ARTrackableBase
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    ARHand(long j, ARSession aRSession) {
        super(j, aRSession);
    }
}
