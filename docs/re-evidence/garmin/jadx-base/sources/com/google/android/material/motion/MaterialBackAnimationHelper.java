package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import b.c;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes14.dex */
public abstract class MaterialBackAnimationHelper<V extends View> {
    private static final int CANCEL_DURATION_DEFAULT = 100;
    private static final int HIDE_DURATION_MAX_DEFAULT = 300;
    private static final int HIDE_DURATION_MIN_DEFAULT = 150;
    private static final String TAG = "MaterialBackHelper";
    private c backEvent;
    protected final int cancelDuration;
    protected final int hideDurationMax;
    protected final int hideDurationMin;
    private final TimeInterpolator progressInterpolator;

    /* JADX INFO: renamed from: view, reason: collision with root package name */
    protected final V f53211view;

    public MaterialBackAnimationHelper(V v14) {
        this.f53211view = v14;
        Context context = v14.getContext();
        this.progressInterpolator = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingStandardDecelerateInterpolator, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
        this.hideDurationMax = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationMedium2, 300);
        this.hideDurationMin = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationShort3, 150);
        this.cancelDuration = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationShort2, 100);
    }

    public float interpolateProgress(float f14) {
        return this.progressInterpolator.getInterpolation(f14);
    }

    public c onCancelBackProgress() {
        c cVar = this.backEvent;
        this.backEvent = null;
        return cVar;
    }

    public c onHandleBackInvoked() {
        c cVar = this.backEvent;
        this.backEvent = null;
        return cVar;
    }

    public void onStartBackProgress(c cVar) {
        this.backEvent = cVar;
    }

    public c onUpdateBackProgress(c cVar) {
        c cVar2 = this.backEvent;
        this.backEvent = cVar;
        return cVar2;
    }
}
