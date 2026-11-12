package o4;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.media.MediaCodecInfo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s {
    public static /* synthetic */ BlendModeColorFilter b(int i14, BlendMode blendMode) {
        return new BlendModeColorFilter(i14, blendMode);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint c() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint d(int i14, int i15, int i16) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i14, i15, i16);
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint e(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* synthetic */ void h() {
    }

    public static /* synthetic */ void w() {
    }
}
