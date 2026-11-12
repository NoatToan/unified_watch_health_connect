package com.huawei.hiar;

import com.huawei.hiar.exceptions.ARDeadlineExceededException;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes33.dex */
public class ARFaceGeometry {
    private long mNativeHandle;
    private final ARSession mSession;

    private native float[] nativeGetTextureCoordinates(long j, long j2);

    private native int nativeGetTriangleCount(long j, long j2);

    private native int[] nativeGetTriangleIndices(long j, long j2);

    private native int[] nativeGetTriangleLabels(long j, long j2);

    private native float[] nativeGetVertices(long j, long j2);

    private native void nativeReleaseFaceGeometry(long j);

    public void release() {
        nativeReleaseFaceGeometry(this.mNativeHandle);
        this.mNativeHandle = 0L;
    }

    public FloatBuffer getVertices() {
        long j = this.mNativeHandle;
        if (j != 0) {
            return FloatBuffer.wrap(nativeGetVertices(this.mSession.mNativeHandle, j));
        }
        throw new ARDeadlineExceededException();
    }

    public IntBuffer getTriangleLabels() {
        long j = this.mNativeHandle;
        if (j != 0) {
            return IntBuffer.wrap(nativeGetTriangleLabels(this.mSession.mNativeHandle, j));
        }
        throw new ARDeadlineExceededException();
    }

    public IntBuffer getTriangleIndices() {
        long j = this.mNativeHandle;
        if (j != 0) {
            return IntBuffer.wrap(nativeGetTriangleIndices(this.mSession.mNativeHandle, j));
        }
        throw new ARDeadlineExceededException();
    }

    public int getTriangleCount() {
        long j = this.mNativeHandle;
        if (j != 0) {
            return nativeGetTriangleCount(this.mSession.mNativeHandle, j);
        }
        throw new ARDeadlineExceededException();
    }

    public enum TriangleLabel {
        TRIANGLE_LABEL_NON_FACE(-1),
        TRIANGLE_LABEL_FACE_OTHER(0),
        TRIANGLE_LABEL_LOWER_LIP(1),
        TRIANGLE_LABEL_UPPER_LIP(2),
        TRIANGLE_LABEL_LEFT_EYE(3),
        TRIANGLE_LABEL_RIGHT_EYE(4),
        TRIANGLE_LABEL_LEFT_BROW(5),
        TRIANGLE_LABEL_RIGHT_BROW(6),
        TRIANGLE_LABEL_BROW_CENTER(7),
        TRIANGLE_LABEL_NOSE(8);

        final int mNativeCode;

        static TriangleLabel forNumber(int i) {
            for (TriangleLabel triangleLabel : values()) {
                if (triangleLabel.mNativeCode == i) {
                    return triangleLabel;
                }
            }
            return TRIANGLE_LABEL_NON_FACE;
        }

        TriangleLabel(int i) {
            this.mNativeCode = i;
        }
    }

    public FloatBuffer getTextureCoordinates() {
        long j = this.mNativeHandle;
        if (j != 0) {
            return FloatBuffer.wrap(nativeGetTextureCoordinates(this.mSession.mNativeHandle, j));
        }
        throw new ARDeadlineExceededException();
    }

    protected void finalize() throws Throwable {
        long j = this.mNativeHandle;
        if (j != 0) {
            nativeReleaseFaceGeometry(j);
        }
        super.finalize();
    }

    ARFaceGeometry(ARSession aRSession, long j) {
        this.mSession = aRSession;
        this.mNativeHandle = j;
    }

    protected ARFaceGeometry() {
        this.mSession = null;
        this.mNativeHandle = 0L;
    }
}
