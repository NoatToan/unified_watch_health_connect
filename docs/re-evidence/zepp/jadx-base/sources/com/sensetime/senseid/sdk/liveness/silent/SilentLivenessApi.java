package com.sensetime.senseid.sdk.liveness.silent;

import android.content.Context;
import android.graphics.Rect;
import com.sensetime.senseid.sdk.liveness.silent.common.type.PixelFormat;
import com.sensetime.senseid.sdk.liveness.silent.common.type.Size;

/* JADX INFO: loaded from: classes18.dex */
public final class SilentLivenessApi {
    private static OfflineSilentLivenessService sService;

    private SilentLivenessApi() {
    }

    public static void cancel() {
        sService.cancel();
        sService = null;
    }

    public static String getVersion() {
        return BuildConfig.VERSION_NAME;
    }

    public static void init(Context context, String str, String str2, int i, int i2, OnLivenessListener onLivenessListener) {
        if (sService == null) {
            sService = new OfflineSilentLivenessService();
        }
        sService.start();
        sService.setPassDurationAndFrames(i, i2);
        sService.init(context, str, str2, onLivenessListener);
    }

    public static void init(Context context, String str, String str2, OnLivenessListener onLivenessListener) {
        if (sService == null) {
            sService = new OfflineSilentLivenessService();
        }
        sService.start();
        sService.init(context, str, str2, onLivenessListener);
    }

    public static void inputData(byte[] bArr, PixelFormat pixelFormat, Size size, Rect rect, boolean z, int i) {
        sService.inputData(bArr, pixelFormat, size, rect, z, i);
    }

    public static void setBrowOcclusion(boolean z) {
        sService.setBrowOcclusion(z);
    }

    public static void setDetectTimeout(long j) {
        sService.setDetectTimeout(j);
    }

    public static void setFaceDistanceRate(float f, float f2) {
        sService.setFaceDistanceRate(f, f2);
    }
}
