package com.sensetime.senseid.sdk.liveness.silent;

import android.graphics.Rect;
import com.sensetime.senseid.sdk.liveness.silent.common.type.ResultCode;
import com.sensetime.senseid.sdk.liveness.silent.common.util.MainThreadExecutor;
import com.sensetime.senseid.sdk.liveness.silent.type.FaceOcclusion;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class OnLivenessListenerWarp implements OnLivenessListener {
    private OnLivenessListener mListener;

    public OnLivenessListenerWarp(OnLivenessListener onLivenessListener) {
        this.mListener = onLivenessListener;
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.OnLivenessListener
    public void onDetectOver(final ResultCode resultCode, final byte[] bArr, final List<byte[]> list, final Rect rect) {
        if (this.mListener != null) {
            MainThreadExecutor.getInstance().execute(new Runnable() { // from class: com.sensetime.senseid.sdk.liveness.silent.OnLivenessListenerWarp.4
                @Override // java.lang.Runnable
                public void run() {
                    if (OnLivenessListenerWarp.this.mListener != null) {
                        OnLivenessListenerWarp.this.mListener.onDetectOver(resultCode, bArr, list, rect);
                    }
                }
            });
        }
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.OnLivenessListener
    public void onError(final ResultCode resultCode) {
        if (this.mListener != null) {
            MainThreadExecutor.getInstance().execute(new Runnable() { // from class: com.sensetime.senseid.sdk.liveness.silent.OnLivenessListenerWarp.3
                @Override // java.lang.Runnable
                public void run() {
                    if (OnLivenessListenerWarp.this.mListener != null) {
                        OnLivenessListenerWarp.this.mListener.onError(resultCode);
                    }
                }
            });
        }
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.OnLivenessListener
    public void onInitialized() {
        if (this.mListener != null) {
            MainThreadExecutor.getInstance().execute(new Runnable() { // from class: com.sensetime.senseid.sdk.liveness.silent.OnLivenessListenerWarp.1
                @Override // java.lang.Runnable
                public void run() {
                    if (OnLivenessListenerWarp.this.mListener != null) {
                        OnLivenessListenerWarp.this.mListener.onInitialized();
                    }
                }
            });
        }
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.OnLivenessListener
    public void onStatusUpdate(final int i, final FaceOcclusion faceOcclusion, final int i2) {
        if (this.mListener != null) {
            MainThreadExecutor.getInstance().execute(new Runnable() { // from class: com.sensetime.senseid.sdk.liveness.silent.OnLivenessListenerWarp.2
                @Override // java.lang.Runnable
                public void run() {
                    if (OnLivenessListenerWarp.this.mListener != null) {
                        OnLivenessListenerWarp.this.mListener.onStatusUpdate(i, faceOcclusion, i2);
                    }
                }
            });
        }
    }

    public void setListener(OnLivenessListener onLivenessListener) {
        this.mListener = onLivenessListener;
    }
}
