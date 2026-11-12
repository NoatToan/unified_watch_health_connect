package com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public interface VectorAnimation {
    int getDuration();

    default long getStartDelay() {
        return 0L;
    }

    default List<b> getTranslateXKeyFrames() {
        return Collections.EMPTY_LIST;
    }

    default List<b> getTranslateYKeyFrames() {
        return Collections.EMPTY_LIST;
    }

    default List<b> getScaleKeyFrames() {
        return Collections.EMPTY_LIST;
    }

    default List<b> getRotateKeyFrame() {
        return Collections.EMPTY_LIST;
    }

    default Interpolator getInterpolator() {
        return new PathInterpolator(0.3f, 0.0f, 0.3f, 1.0f);
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f5165c;
        private final float e;

        public b(float f, float f2) {
            this.e = f;
            this.f5165c = f2;
        }

        public float d() {
            return this.e;
        }

        public float c() {
            return this.f5165c;
        }
    }
}
