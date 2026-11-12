package com.sensetime.senseid.sdk.liveness.silent;

import android.content.Context;
import android.graphics.Rect;
import com.sensetime.senseid.sdk.liveness.silent.common.network.HttpResult;
import com.sensetime.senseid.sdk.liveness.silent.common.type.AbstractContentType;
import com.sensetime.senseid.sdk.liveness.silent.common.type.ResultCode;
import com.sensetime.senseid.sdk.liveness.silent.type.FaceDistance;
import com.sensetime.senseid.sdk.liveness.silent.type.FaceOcclusion;
import com.sensetime.senseid.sdk.liveness.silent.type.FaceState;

/* JADX INFO: loaded from: classes18.dex */
class OfflineSilentLivenessLibrary extends AbstractSilentLivenessLibrary {
    private OnLivenessListener mLivenessListener = null;

    @Override // com.sensetime.senseid.sdk.liveness.silent.AbstractLivenessLibrary
    public void cancel() {
        releaseReferences();
        release();
    }

    public boolean init(Context context, String str, String str2, OnLivenessListener onLivenessListener) {
        if (onLivenessListener == null) {
            return false;
        }
        this.mLivenessListener = onLivenessListener;
        ResultCode resultCodeInit = init(context, str, (String) null, str2);
        if (resultCodeInit == ResultCode.OK) {
            onLivenessListener.onInitialized();
            return true;
        }
        onLivenessListener.onError(resultCodeInit);
        return false;
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.AbstractSilentLivenessLibrary
    public void notifyError(ResultCode resultCode) {
        OnLivenessListener onLivenessListener = this.mLivenessListener;
        if (onLivenessListener == null) {
            return;
        }
        onLivenessListener.onError(resultCode);
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.common.AbstractFinanceLibrary
    public void onNetworkFinished(HttpResult httpResult, AbstractContentType abstractContentType) {
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.AbstractSilentLivenessLibrary
    public void onStatusUpdate(@FaceState int i, FaceOcclusion faceOcclusion, @FaceDistance int i2) {
        OnLivenessListener onLivenessListener = this.mLivenessListener;
        if (onLivenessListener == null) {
            return;
        }
        onLivenessListener.onStatusUpdate(i, faceOcclusion, i2);
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.AbstractSilentLivenessLibrary
    public void processDetectResult(DetectResult detectResult, long j, Rect rect) {
        OnLivenessListener onLivenessListener = this.mLivenessListener;
        if (onLivenessListener != null) {
            long j2 = this.mDetectTimeout;
            if (j <= j2 || j2 <= 0) {
                onLivenessListener.onDetectOver(ResultCode.OK, detectResult.protobuf, detectResult.images, rect);
            } else {
                onLivenessListener.onDetectOver(ResultCode.STID_E_DETECT_FAIL, detectResult.protobuf, detectResult.images, rect);
            }
        }
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.common.AbstractFinanceLibrary
    public void releaseReferences() {
        this.mLivenessListener = null;
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.AbstractLivenessLibrary
    public void setDetectTimeout(long j) {
        if (j < 0) {
            notifyError(ResultCode.STID_E_INVALID_ARGUMENTS);
        }
        this.mDetectTimeout = j;
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.AbstractLivenessLibrary
    public boolean setFaceDistanceRate(float f, float f2) {
        boolean faceDistanceRate = super.setFaceDistanceRate(f, f2);
        if (!faceDistanceRate) {
            release();
            notifyError(ResultCode.STID_E_INVALID_ARGUMENTS);
        }
        return faceDistanceRate;
    }
}
