package com.mapbox.android.gestures;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ProgressiveGesture<L> extends MultiFingerGesture<L> {
    private final Set<Integer> handledTypes;
    private boolean interrupted;
    private boolean isInProgress;
    VelocityTracker velocityTracker;
    float velocityX;
    float velocityY;

    public ProgressiveGesture(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
        this.handledTypes = provideHandledTypes();
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture, com.mapbox.android.gestures.BaseGesture
    public boolean analyzeEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5 || actionMasked == 6 || actionMasked == 3) {
            reset();
        }
        if (this.interrupted) {
            this.interrupted = false;
            reset();
            gestureStopped();
        }
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.addMovement(getCurrentEvent());
        }
        boolean zAnalyzeEvent = super.analyzeEvent(motionEvent);
        if (actionMasked == 1 || actionMasked == 6) {
            if (this.pointerIdList.size() < getRequiredPointersCount() && this.isInProgress) {
                gestureStopped();
                return true;
            }
        } else if (actionMasked == 3 && this.isInProgress) {
            gestureStopped();
            return true;
        }
        return zAnalyzeEvent;
    }

    public void gestureStarted() {
        this.isInProgress = true;
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
    }

    public void gestureStopped() {
        this.isInProgress = false;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000);
            this.velocityX = this.velocityTracker.getXVelocity();
            this.velocityY = this.velocityTracker.getYVelocity();
            this.velocityTracker.recycle();
            this.velocityTracker = null;
        }
        reset();
    }

    public Set<Integer> getHandledTypes() {
        return this.handledTypes;
    }

    public void interrupt() {
        if (isInProgress()) {
            this.interrupted = true;
        }
    }

    public boolean isInProgress() {
        return this.isInProgress;
    }

    public abstract Set<Integer> provideHandledTypes();

    @Override // com.mapbox.android.gestures.BaseGesture
    public void setEnabled(boolean z14) {
        super.setEnabled(z14);
        if (z14) {
            return;
        }
        interrupt();
    }
}
