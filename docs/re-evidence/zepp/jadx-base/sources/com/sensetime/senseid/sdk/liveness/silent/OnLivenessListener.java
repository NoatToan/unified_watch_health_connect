package com.sensetime.senseid.sdk.liveness.silent;

import android.graphics.Rect;
import com.sensetime.senseid.sdk.liveness.silent.common.type.ResultCode;
import com.sensetime.senseid.sdk.liveness.silent.type.FaceDistance;
import com.sensetime.senseid.sdk.liveness.silent.type.FaceOcclusion;
import com.sensetime.senseid.sdk.liveness.silent.type.FaceState;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public interface OnLivenessListener {
    void onDetectOver(ResultCode resultCode, byte[] bArr, List<byte[]> list, Rect rect);

    void onError(ResultCode resultCode);

    void onInitialized();

    void onStatusUpdate(@FaceState int i, FaceOcclusion faceOcclusion, @FaceDistance int i2);
}
