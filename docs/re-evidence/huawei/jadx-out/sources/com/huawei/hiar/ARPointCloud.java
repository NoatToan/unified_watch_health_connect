package com.huawei.hiar;

import com.huawei.hiar.exceptions.ARDeadlineExceededException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Locale;

/* JADX INFO: loaded from: classes33.dex */
public class ARPointCloud {
    static final String TAG = "ARPointCloud";
    long mNativeHandle;
    private final ARSession mSession;

    private native ByteBuffer nativeGetData(long j, long j2);

    private native long nativeGetTimestamp(long j, long j2);

    private native void nativeReleasePointCloud(long j);

    public String toString() {
        return String.format(Locale.ENGLISH, "ARPointcloud:{handle=0x%x, timestamp= %d}", Long.valueOf(this.mNativeHandle), Long.valueOf(getTimestampNs()));
    }

    public void release() {
        nativeReleasePointCloud(this.mNativeHandle);
        this.mNativeHandle = 0L;
    }

    public long getTimestampNs() {
        long j = this.mNativeHandle;
        if (j != 0) {
            return nativeGetTimestamp(this.mSession.mNativeHandle, j);
        }
        throw new ARDeadlineExceededException();
    }

    public FloatBuffer getPoints() {
        long j = this.mNativeHandle;
        if (j == 0) {
            throw new ARDeadlineExceededException();
        }
        ByteBuffer byteBufferNativeGetData = nativeGetData(this.mSession.mNativeHandle, j);
        if (byteBufferNativeGetData == null) {
            byteBufferNativeGetData = ByteBuffer.allocateDirect(0);
        }
        return byteBufferNativeGetData.order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    protected void finalize() throws Throwable {
        long j = this.mNativeHandle;
        if (j != 0) {
            nativeReleasePointCloud(j);
        }
        super.finalize();
    }

    ARPointCloud(long j, ARSession aRSession) {
        this.mNativeHandle = j;
        this.mSession = aRSession;
    }

    protected ARPointCloud() {
        this.mSession = null;
        this.mNativeHandle = 0L;
    }
}
