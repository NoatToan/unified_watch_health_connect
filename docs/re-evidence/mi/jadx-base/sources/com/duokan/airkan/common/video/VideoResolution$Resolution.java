package com.duokan.airkan.common.video;

/* JADX INFO: loaded from: classes4.dex */
public enum VideoResolution$Resolution {
    STANDARD_DEFINITION,
    HIGH_DEFINITION,
    SUPER_HIGH_DEFINITION,
    AUTO_SELECT;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static VideoResolution$Resolution[] valuesCustom() {
        VideoResolution$Resolution[] videoResolution$ResolutionArrValuesCustom = values();
        int length = videoResolution$ResolutionArrValuesCustom.length;
        VideoResolution$Resolution[] videoResolution$ResolutionArr = new VideoResolution$Resolution[length];
        System.arraycopy(videoResolution$ResolutionArrValuesCustom, 0, videoResolution$ResolutionArr, 0, length);
        return videoResolution$ResolutionArr;
    }
}
