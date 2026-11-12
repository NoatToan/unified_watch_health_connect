package com.sensetime.senseid.sdk.liveness.silent;

import android.content.Context;
import android.graphics.Rect;
import com.sensetime.senseid.sdk.liveness.silent.common.type.PixelFormat;
import com.sensetime.senseid.sdk.liveness.silent.common.type.ResultCode;
import com.sensetime.senseid.sdk.liveness.silent.common.type.Size;
import com.sensetime.senseid.sdk.liveness.silent.common.util.SyncTaskService;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes18.dex */
class OfflineSilentLivenessService extends SyncTaskService {
    private static final int TASK_ID_CANCEL = 7;
    private static final int TASK_ID_INIT = 1;
    private static final int TASK_ID_INPUT = 2;
    private static final int TASK_ID_SET_BROW_OCCLUSILON = 6;
    private static final int TASK_ID_SET_FACE_DISTANCE_RATE = 5;
    private static final int TASK_ID_SET_PASS_DURATION_AND_FRAMES = 4;
    private static final int TASK_ID_SET_TIMEOUT = 3;
    private ByteBuffer mFrameBuffer;
    private OfflineSilentLivenessLibrary mLibrary;
    private OnLivenessListenerWarp mOnLivenessListenerWarp;

    public void cancel() {
        OnLivenessListenerWarp onLivenessListenerWarp = this.mOnLivenessListenerWarp;
        if (onLivenessListenerWarp != null) {
            onLivenessListenerWarp.setListener(null);
            this.mOnLivenessListenerWarp = null;
        }
        this.mLibrary.releaseReferences();
        execute(7, new Runnable() { // from class: com.sensetime.senseid.sdk.liveness.silent.OfflineSilentLivenessService.7
            @Override // java.lang.Runnable
            public void run() {
                OfflineSilentLivenessService.this.mLibrary.cancel();
            }
        });
    }

    public void init(final Context context, final String str, final String str2, final OnLivenessListener onLivenessListener) {
        if (onLivenessListener == null) {
            throw new IllegalArgumentException("Listener can not be null, please set valid listener for initialization");
        }
        execute(1, new Runnable() { // from class: com.sensetime.senseid.sdk.liveness.silent.OfflineSilentLivenessService.1
            @Override // java.lang.Runnable
            public void run() {
                ResultCode resultCodePrepare;
                OfflineSilentLivenessService.this.mOnLivenessListenerWarp = new OnLivenessListenerWarp(onLivenessListener);
                if (!OfflineSilentLivenessService.this.mLibrary.init(context, str, str2, OfflineSilentLivenessService.this.mOnLivenessListenerWarp) || (resultCodePrepare = OfflineSilentLivenessService.this.mLibrary.prepare(1)) == ResultCode.OK) {
                    return;
                }
                OfflineSilentLivenessService.this.mOnLivenessListenerWarp.onError(resultCodePrepare);
            }
        });
    }

    public void inputData(byte[] bArr, final PixelFormat pixelFormat, final Size size, final Rect rect, final boolean z, final int i) {
        ByteBuffer byteBuffer = this.mFrameBuffer;
        if (byteBuffer == null) {
            this.mFrameBuffer = ByteBuffer.wrap(new byte[bArr.length]);
        } else {
            System.arraycopy(bArr, 0, byteBuffer.array(), 0, bArr.length);
        }
        if (hasTasks(2)) {
            return;
        }
        execute(2, new Runnable() { // from class: com.sensetime.senseid.sdk.liveness.silent.OfflineSilentLivenessService.2
            @Override // java.lang.Runnable
            public void run() {
                OfflineSilentLivenessService.this.mLibrary.inputData(OfflineSilentLivenessService.this.mFrameBuffer.array(), pixelFormat, size, rect, z, i, null);
            }
        });
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.common.util.SyncTaskService
    public void onPostExecute(int i) {
        super.onPostExecute(i);
        if (i == 7) {
            shutdown();
        }
    }

    public void setBrowOcclusion(final boolean z) {
        execute(6, new Runnable() { // from class: com.sensetime.senseid.sdk.liveness.silent.OfflineSilentLivenessService.6
            @Override // java.lang.Runnable
            public void run() {
                OfflineSilentLivenessService.this.mLibrary.setBrowOcclusion(z);
            }
        });
    }

    public void setDetectTimeout(final long j) {
        execute(3, new Runnable() { // from class: com.sensetime.senseid.sdk.liveness.silent.OfflineSilentLivenessService.3
            @Override // java.lang.Runnable
            public void run() {
                OfflineSilentLivenessService.this.mLibrary.setDetectTimeout(j);
            }
        });
    }

    public void setFaceDistanceRate(final float f, final float f2) {
        execute(5, new Runnable() { // from class: com.sensetime.senseid.sdk.liveness.silent.OfflineSilentLivenessService.5
            @Override // java.lang.Runnable
            public void run() {
                OfflineSilentLivenessService.this.mLibrary.setFaceDistanceRate(f, f2);
            }
        });
    }

    public void setPassDurationAndFrames(final int i, final int i2) {
        execute(4, new Runnable() { // from class: com.sensetime.senseid.sdk.liveness.silent.OfflineSilentLivenessService.4
            @Override // java.lang.Runnable
            public void run() {
                OfflineSilentLivenessService.this.mLibrary.setPassDurationAndFrames(i, i2);
            }
        });
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.common.util.SyncTaskService
    public void start() {
        this.mLibrary = new OfflineSilentLivenessLibrary();
        super.start();
    }
}
