package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;

/* JADX INFO: loaded from: classes7.dex */
public class PathKeyframe extends Keyframe<PointF> {
    private Path path;
    private final Keyframe<PointF> pointKeyFrame;

    public PathKeyframe(LottieComposition lottieComposition, Keyframe<PointF> keyframe) {
        super(lottieComposition, keyframe.startValue, keyframe.endValue, keyframe.interpolator, keyframe.xInterpolator, keyframe.yInterpolator, keyframe.startFrame, keyframe.endFrame);
        this.pointKeyFrame = keyframe;
        createPath();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void createPath() {
        T t7;
        T t14;
        T t15 = this.endValue;
        boolean z14 = (t15 == 0 || (t14 = this.startValue) == 0 || !((PointF) t14).equals(((PointF) t15).x, ((PointF) t15).y)) ? false : true;
        T t16 = this.startValue;
        if (t16 == 0 || (t7 = this.endValue) == 0 || z14) {
            return;
        }
        Keyframe<PointF> keyframe = this.pointKeyFrame;
        this.path = Utils.createPath((PointF) t16, (PointF) t7, keyframe.pathCp1, keyframe.pathCp2);
    }

    public Path getPath() {
        return this.path;
    }
}
