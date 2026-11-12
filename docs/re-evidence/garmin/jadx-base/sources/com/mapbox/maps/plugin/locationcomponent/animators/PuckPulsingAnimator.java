package com.mapbox.maps.plugin.locationcomponent.animators;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer;
import j23.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0002H\u0016R\u001a\u0010\u0006\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/animators/PuckPulsingAnimator;", "Lcom/mapbox/maps/plugin/locationcomponent/animators/PuckAnimator;", "", "pixelRatio", "", "(F)V", "maxRadius", "getMaxRadius", "()D", "setMaxRadius", "(D)V", "pulseFadeEnabled", "", "pulsingColor", "", "getPulsingColor", "()I", "setPulsingColor", "(I)V", "animateInfinite", "", "updateLayer", "fraction", "value", "Companion", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PuckPulsingAnimator extends PuckAnimator<Double> {
    public static final double DEFAULT_RADIUS_DP = 10.0d;
    public static final long PULSING_DEFAULT_DURATION = 3000;
    private double maxRadius;
    private final float pixelRatio;
    private boolean pulseFadeEnabled;
    private int pulsingColor;
    private static final Interpolator PULSING_DEFAULT_INTERPOLATOR = new PathInterpolator(0.0f, 0.0f, 0.25f, 1.0f);

    public PuckPulsingAnimator(float f14) {
        super(Evaluators.INSTANCE.getDOUBLE());
        this.pixelRatio = f14;
        this.maxRadius = ((double) f14) * 10.0d;
        this.pulsingColor = -16776961;
        this.pulseFadeEnabled = true;
        setDuration(3000L);
        setRepeatMode(1);
        setRepeatCount(-1);
        setInterpolator(PULSING_DEFAULT_INTERPOLATOR);
    }

    public final void animateInfinite() {
        if (this.maxRadius <= 0.0d) {
            this.maxRadius = ((double) this.pixelRatio) * 10.0d;
        }
        if (!isRunning()) {
            PuckAnimator.animate$default(this, new Double[]{Double.valueOf(0.0d), Double.valueOf(this.maxRadius)}, null, 2, null);
        }
        addListener(new AnimatorListenerAdapter() { // from class: com.mapbox.maps.plugin.locationcomponent.animators.PuckPulsingAnimator.animateInfinite.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
                animation.getClass();
                super.onAnimationRepeat(animation);
                PuckPulsingAnimator.this.setObjectValues(Double.valueOf(0.0d), Double.valueOf(PuckPulsingAnimator.this.getMaxRadius()));
            }
        });
    }

    public final double getMaxRadius() {
        return this.maxRadius;
    }

    public final int getPulsingColor() {
        return this.pulsingColor;
    }

    public final void setMaxRadius(double d14) {
        this.maxRadius = d14;
    }

    public final void setPulsingColor(int i14) {
        this.pulsingColor = i14;
    }

    public void updateLayer(float fraction, double value) {
        float fD = this.pulseFadeEnabled ? t.d(1.0f - ((float) (value / this.maxRadius)), 0.0f, 1.0f) : 1.0f;
        LocationLayerRenderer locationRenderer = getLocationRenderer();
        if (locationRenderer != null) {
            locationRenderer.updatePulsingUi(this.pulsingColor, (float) value, Float.valueOf(fraction > 0.1f ? fD : 0.0f));
        }
    }

    public /* synthetic */ PuckPulsingAnimator(float f14, int i14, j jVar) {
        this((i14 & 1) != 0 ? 1.0f : f14);
    }

    public PuckPulsingAnimator() {
        this(0.0f, 1, null);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.animators.PuckAnimator
    public /* bridge */ /* synthetic */ void updateLayer(float f14, Double d14) {
        updateLayer(f14, d14.doubleValue());
    }
}
