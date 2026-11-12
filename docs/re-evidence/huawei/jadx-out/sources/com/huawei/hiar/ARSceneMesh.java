package com.huawei.hiar;

import com.huawei.hiar.exceptions.ARDeadlineExceededException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes33.dex */
public class ARSceneMesh {
    private long mNativeHandle;
    private final ARSession mSession;

    private native ByteBuffer nativeGetSceneDepth(long j, long j2);

    private native int nativeGetSceneDepthHeight(long j, long j2);

    private native int nativeGetSceneDepthWidth(long j, long j2);

    private native int[] nativeGetSceneMeshTriangleIndices(long j, long j2);

    private native float[] nativeGetSceneMeshVertexNormals(long j, long j2);

    private native float[] nativeGetSceneMeshVertices(long j, long j2);

    private native void nativeReleaseSceneMesh(long j);

    public void release() {
        long j = this.mNativeHandle;
        if (j != 0) {
            nativeReleaseSceneMesh(j);
        }
        this.mNativeHandle = 0L;
    }

    public FloatBuffer getVertices() {
        long j = this.mNativeHandle;
        if (j != 0) {
            return FloatBuffer.wrap(nativeGetSceneMeshVertices(this.mSession.mNativeHandle, j));
        }
        throw new ARDeadlineExceededException();
    }

    public FloatBuffer getVertexNormals() {
        long j = this.mNativeHandle;
        if (j != 0) {
            return FloatBuffer.wrap(nativeGetSceneMeshVertexNormals(this.mSession.mNativeHandle, j));
        }
        throw new ARDeadlineExceededException();
    }

    public IntBuffer getTriangleIndices() {
        long j = this.mNativeHandle;
        if (j != 0) {
            return IntBuffer.wrap(nativeGetSceneMeshTriangleIndices(this.mSession.mNativeHandle, j));
        }
        throw new ARDeadlineExceededException();
    }

    public int getSceneDepthWidth() {
        return nativeGetSceneDepthWidth(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public int getSceneDepthHeight() {
        return nativeGetSceneDepthHeight(this.mSession.mNativeHandle, this.mNativeHandle);
    }

    public ShortBuffer getSceneDepth() {
        ByteBuffer byteBufferNativeGetSceneDepth = nativeGetSceneDepth(this.mSession.mNativeHandle, this.mNativeHandle);
        if (byteBufferNativeGetSceneDepth == null) {
            return null;
        }
        return byteBufferNativeGetSceneDepth.order(ByteOrder.nativeOrder()).asShortBuffer().asReadOnlyBuffer();
    }

    protected void finalize() throws Throwable {
        long j = this.mNativeHandle;
        if (j != 0) {
            nativeReleaseSceneMesh(j);
        }
        super.finalize();
    }

    ARSceneMesh(ARSession aRSession, long j) {
        this.mSession = aRSession;
        this.mNativeHandle = j;
    }

    protected ARSceneMesh() {
        this.mSession = null;
        this.mNativeHandle = 0L;
    }
}
