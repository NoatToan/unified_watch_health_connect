package com.huawei.hiar;

import com.huawei.hiar.exceptions.ARDeadlineExceededException;
import com.huawei.hiar.exceptions.ARFatalException;
import java.nio.FloatBuffer;
import java.util.HashMap;

/* JADX INFO: loaded from: classes33.dex */
public class ARFaceBlendShapes {
    private static final int DEFAULT_ARRAY_SIZE = 64;
    private long mNativeHandle;
    private final ARSession mSession;

    private native int nativeGetBlendShapeCount(long j, long j2);

    private native float[] nativeGetBlendShapeData(long j, long j2);

    private native int[] nativeGetBlendShapeType(long j, long j2);

    private native void nativeReleaseFaceBlendShapes(long j);

    public void release() {
        nativeReleaseFaceBlendShapes(this.mNativeHandle);
        this.mNativeHandle = 0L;
    }

    public String[] getBlendShapeType() {
        long j = this.mNativeHandle;
        if (j != 0) {
            return convertNativeARBlendShapeTypeToString(nativeGetBlendShapeType(this.mSession.mNativeHandle, j));
        }
        throw new ARDeadlineExceededException();
    }

    @Deprecated
    public HashMap<ARBlendShapeType, Float> getBlendShapeDateMapKeyEnmu() {
        return getBlendShapeDataMapKeyEnum();
    }

    public HashMap<String, Float> getBlendShapeDataMapKeyString() {
        if (this.mNativeHandle == 0) {
            throw new ARDeadlineExceededException();
        }
        HashMap<String, Float> map = new HashMap<>(64);
        int[] iArrNativeGetBlendShapeType = nativeGetBlendShapeType(this.mSession.mNativeHandle, this.mNativeHandle);
        float[] fArrNativeGetBlendShapeData = nativeGetBlendShapeData(this.mSession.mNativeHandle, this.mNativeHandle);
        if (iArrNativeGetBlendShapeType.length != fArrNativeGetBlendShapeData.length) {
            throw new ARFatalException("Unexpected array length!");
        }
        for (int i = 0; i < iArrNativeGetBlendShapeType.length; i++) {
            map.put(ARBlendShapeType.forNumber(iArrNativeGetBlendShapeType[i]).name(), Float.valueOf(fArrNativeGetBlendShapeData[i]));
        }
        return map;
    }

    public HashMap<ARBlendShapeType, Float> getBlendShapeDataMapKeyEnum() {
        if (this.mNativeHandle == 0) {
            throw new ARDeadlineExceededException();
        }
        HashMap<ARBlendShapeType, Float> map = new HashMap<>(64);
        int[] iArrNativeGetBlendShapeType = nativeGetBlendShapeType(this.mSession.mNativeHandle, this.mNativeHandle);
        float[] fArrNativeGetBlendShapeData = nativeGetBlendShapeData(this.mSession.mNativeHandle, this.mNativeHandle);
        if (iArrNativeGetBlendShapeType.length != fArrNativeGetBlendShapeData.length) {
            throw new ARFatalException("Unexpected array length!");
        }
        for (int i = 0; i < iArrNativeGetBlendShapeType.length; i++) {
            map.put(ARBlendShapeType.forNumber(iArrNativeGetBlendShapeType[i]), Float.valueOf(fArrNativeGetBlendShapeData[i]));
        }
        return map;
    }

    public FloatBuffer getBlendShapeData() {
        long j = this.mNativeHandle;
        if (j != 0) {
            return FloatBuffer.wrap(nativeGetBlendShapeData(this.mSession.mNativeHandle, j));
        }
        throw new ARDeadlineExceededException();
    }

    public int getBlendShapeCount() {
        long j = this.mNativeHandle;
        if (j != 0) {
            return nativeGetBlendShapeCount(this.mSession.mNativeHandle, j);
        }
        throw new ARDeadlineExceededException();
    }

    public enum ARBlendShapeType {
        Animoji_Unknow_Type(-1),
        Animoji_Eye_Blink_Left(0),
        Animoji_Eye_Look_Down_Left(1),
        Animoji_Eye_Look_In_Left(2),
        Animoji_Eye_Look_Out_Left(3),
        Animoji_Eye_Look_Up_Left(4),
        Animoji_Eye_Squint_Left(5),
        Animoji_Eye_Wide_Left(6),
        Animoji_Eye_Blink_Right(7),
        Animoji_Eye_Look_Down_Right(8),
        Animoji_Eye_Look_In_Right(9),
        Animoji_Eye_Look_Out_Right(10),
        Animoji_Eye_Look_Up_Right(11),
        Animoji_Eye_Squint_Right(12),
        Animoji_Eye_Wide_Right(13),
        Animoji_Jaw_Forward(14),
        Animoji_Jaw_Left(15),
        Animoji_Jaw_Right(16),
        Animoji_Jaw_Open(17),
        Animoji_Mouth_Funnel(18),
        Animoji_Mouth_Pucker(19),
        Animoji_Mouth_Left(20),
        Animoji_Mouth_Right(21),
        Animoji_Mouth_Smile_Left(22),
        Animoji_Mouth_Smile_Right(23),
        Animoji_Mouth_Frown_Left(24),
        Animoji_Mouth_Frown_Right(25),
        Animoji_Mouth_Dimple_Left(26),
        Animoji_Mouth_Dimple_Right(27),
        Animoji_Mouth_Stretch_Left(28),
        Animoji_Mouth_Stretch_Right(29),
        Animoji_Mouth_Roll_Lower(30),
        Animoji_Mouth_Roll_Upper(31),
        Animoji_Mouth_Shrug_Lower(32),
        Animoji_Mouth_Shrug_Upper(33),
        Animoji_Mouth_Upper_Up(34),
        Animoji_Mouth_Lower_Down(35),
        Animoji_Mouth_Lower_Out(36),
        Animoji_Brow_Down_Left(37),
        Animoji_Brow_Down_Right(38),
        Animoji_Brow_Inner_Up(39),
        Animoji_Brow_Outer_Up_Left(40),
        Animoji_Brow_Outer_Up_Right(41),
        Animoji_Cheek_Puff(42),
        Animoji_Cheek_Squint_Left(43),
        Animoji_Cheek_Squint_Right(44),
        Animoji_Frown_Nose_Mouth_Up(45),
        Animoji_Tongue_In(46),
        Animoji_Tongue_Out_Slight(47),
        Animoji_Tongue_Left(48),
        Animoji_Tongue_Right(49),
        Animoji_Tongue_Up(50),
        Animoji_Tongue_Down(51),
        Animoji_Tongue_Left_Up(52),
        Animoji_Tongue_Left_Down(53),
        Animoji_Tongue_Right_Up(54),
        Animoji_Tongue_Right_Down(55),
        Animoji_Left_Eyeball_Left(56),
        Animoji_Left_Eyeball_Right(57),
        Animoji_Left_Eyeball_Up(58),
        Animoji_Left_Eyeball_Down(59),
        Animoji_Right_Eyeball_Left(60),
        Animoji_Right_Eyeball_Right(61),
        Animoji_Right_Eyeball_Up(62),
        Animoji_Right_Eyeball_Down(63),
        Animoji_BLENDSHAPE_LENGTH(64);

        final int nativeCode;

        static ARBlendShapeType forNumber(int i) {
            for (ARBlendShapeType aRBlendShapeType : values()) {
                if (aRBlendShapeType.nativeCode == i) {
                    return aRBlendShapeType;
                }
            }
            return Animoji_Unknow_Type;
        }

        ARBlendShapeType(int i) {
            this.nativeCode = i;
        }
    }

    protected void finalize() throws Throwable {
        long j = this.mNativeHandle;
        if (j != 0) {
            nativeReleaseFaceBlendShapes(j);
        }
        super.finalize();
    }

    private String[] convertNativeARBlendShapeTypeToString(int[] iArr) {
        String[] strArr = new String[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            strArr[i] = ARBlendShapeType.forNumber(iArr[i]).name();
        }
        return strArr;
    }

    ARFaceBlendShapes(ARSession aRSession, long j) {
        this.mSession = aRSession;
        this.mNativeHandle = j;
    }

    private ARFaceBlendShapes() {
        this.mSession = null;
        this.mNativeHandle = 0L;
    }
}
