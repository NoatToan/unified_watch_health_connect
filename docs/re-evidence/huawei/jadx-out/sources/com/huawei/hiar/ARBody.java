package com.huawei.hiar;

import android.util.Size;
import com.huawei.hiar.exceptions.ARDeadlineExceededException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes33.dex */
public class ARBody extends ARTrackableBase {
    private native int nativeGetBodyAction(long j, long j2);

    private native int nativeGetBodyId(long j, long j2);

    private native int nativeGetCoordinateSystemType(long j, long j2);

    private native ByteBuffer nativeGetMaskConfidence(long j, long j2, int i);

    private native ByteBuffer nativeGetMaskDepth(long j, long j2, int i);

    private native int[] nativeGetSkeletonConnection(long j, long j2);

    private native float[] nativeGetSkeletonPoint2D(long j, long j2);

    private native float[] nativeGetSkeletonPoint3D(long j, long j2);

    private native int[] nativeGetSkeletonPointIsExist2D(long j, long j2);

    private native int[] nativeGetSkeletonPointIsExist3D(long j, long j2);

    private native int[] nativeGetSkeletonType(long j, long j2);

    private native float[] nativeSkeletonConfidence(long j, long j2);

    @Override // com.huawei.hiar.ARTrackableBase
    public String toString() {
        return String.format(Locale.ENGLISH, "HiARBody{skeletonPointExist2D: %s skeletonPointExist3D:%s, bodySkeletonConnection: %s, bodyAction: %d}" + System.getProperty("line.separator"), Arrays.toString(getSkeletonPoint2D()), Arrays.toString(getSkeletonPoint3D()), Arrays.toString(getBodySkeletonConnection()), Integer.valueOf(getBodyAction()));
    }

    public int[] getSkeletonPointIsExist3D() {
        return nativeGetSkeletonPointIsExist3D(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public int[] getSkeletonPointIsExist2D() {
        return nativeGetSkeletonPointIsExist2D(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public float[] getSkeletonPoint3D() {
        return nativeGetSkeletonPoint3D(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public float[] getSkeletonPoint2D() {
        return nativeGetSkeletonPoint2D(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public float[] getSkeletonConfidence() {
        return nativeSkeletonConfidence(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public ShortBuffer getMaskDepth() {
        Size textureDimensions = this.mSession.getCameraConfig().getTextureDimensions();
        return nativeGetMaskDepth(this.mSession.mNativeHandle, this.mNativeHandle, textureDimensions.getWidth() * textureDimensions.getHeight()).order(ByteOrder.nativeOrder()).asShortBuffer().asReadOnlyBuffer();
    }

    public FloatBuffer getMaskConfidence() {
        Size textureDimensions = this.mSession.getCameraConfig().getTextureDimensions();
        return nativeGetMaskConfidence(this.mSession.mNativeHandle, this.mNativeHandle, textureDimensions.getWidth() * textureDimensions.getHeight()).order(ByteOrder.nativeOrder()).asFloatBuffer().asReadOnlyBuffer();
    }

    public ARCoordinateSystemType getCoordinateSystemType() {
        return ARCoordinateSystemType.forNumber(nativeGetCoordinateSystemType(this.mSession.mNativeHandle, this.mNativeHandle));
    }

    public ARBodySkeletonType[] getBodySkeletonType() {
        long j = this.mNativeHandle;
        if (j == 0) {
            throw new ARDeadlineExceededException();
        }
        int[] iArrNativeGetSkeletonType = nativeGetSkeletonType(this.mSession.mNativeHandle, j);
        if (iArrNativeGetSkeletonType == null) {
            return new ARBodySkeletonType[0];
        }
        ARBodySkeletonType[] aRBodySkeletonTypeArr = new ARBodySkeletonType[iArrNativeGetSkeletonType.length];
        for (int i = 0; i < iArrNativeGetSkeletonType.length; i++) {
            aRBodySkeletonTypeArr[i] = ARBodySkeletonType.forNumber(iArrNativeGetSkeletonType[i]);
        }
        return aRBodySkeletonTypeArr;
    }

    public int[] getBodySkeletonConnection() {
        return nativeGetSkeletonConnection(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public enum ARBodySkeletonType {
        BodySkeleton_Unknown(-1),
        BodySkeleton_Head(0),
        BodySkeleton_Neck(1),
        BodySkeleton_r_Sho(2),
        BodySkeleton_r_Elbow(3),
        BodySkeleton_r_Wrist(4),
        BodySkeleton_l_Sho(5),
        BodySkeleton_l_Elbow(6),
        BodySkeleton_l_Wrist(7),
        BodySkeleton_r_Hip(8),
        BodySkeleton_r_Knee(9),
        BodySkeleton_r_Ankle(10),
        BodySkeleton_l_Hip(11),
        BodySkeleton_l_Knee(12),
        BodySkeleton_l_Ankle(13),
        BodySkeleton_Hip_mid(14),
        BodySkeleton_r_ear(15),
        BodySkeleton_r_eye(16),
        BodySkeleton_nose(17),
        BodySkeleton_l_eye(18),
        BodySkeleton_l_ear(19),
        BodySkeleton_spine(20),
        BodySkeleton_r_toe(21),
        BodySkeleton_l_toe(22),
        BodySkeleton_Length(23);

        final int nativeCode;

        static ARBodySkeletonType forNumber(int i) {
            for (ARBodySkeletonType aRBodySkeletonType : values()) {
                if (aRBodySkeletonType.nativeCode == i) {
                    return aRBodySkeletonType;
                }
            }
            return BodySkeleton_Unknown;
        }

        ARBodySkeletonType(int i) {
            this.nativeCode = i;
        }
    }

    @Deprecated
    public int getBodyId() {
        return nativeGetBodyId(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public int getBodyAction() {
        return nativeGetBodyAction(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    ARBody(long j, ARSession aRSession) {
        super(j, aRSession);
    }

    private ARBody() {
        super(0L, null);
    }
}
