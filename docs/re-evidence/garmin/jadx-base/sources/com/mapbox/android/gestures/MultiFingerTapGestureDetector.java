package com.mapbox.android.gestures;

import android.content.Context;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class MultiFingerTapGestureDetector extends MultiFingerGesture<OnMultiFingerTapGestureListener> {
    private boolean invalidMovement;
    private int lastPointersDownCount;
    private float multiFingerTapMovementThreshold;
    private long multiFingerTapTimeThreshold;
    private boolean pointerLifted;

    public interface OnMultiFingerTapGestureListener {
        boolean onMultiFingerTap(MultiFingerTapGestureDetector multiFingerTapGestureDetector, int i14);
    }

    public MultiFingerTapGestureDetector(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture, com.mapbox.android.gestures.BaseGesture
    public boolean analyzeEvent(MotionEvent motionEvent) {
        super.analyzeEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            boolean zOnMultiFingerTap = canExecute(4) ? ((OnMultiFingerTapGestureListener) this.listener).onMultiFingerTap(this, this.lastPointersDownCount) : false;
            reset();
            return zOnMultiFingerTap;
        }
        if (actionMasked != 2) {
            if (actionMasked == 5) {
                if (this.pointerLifted) {
                    this.invalidMovement = true;
                }
                this.lastPointersDownCount = this.pointerIdList.size();
            } else if (actionMasked == 6) {
                this.pointerLifted = true;
            }
        } else if (!this.invalidMovement) {
            this.invalidMovement = exceededMovementThreshold(this.pointersDistanceMap);
        }
        return false;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture, com.mapbox.android.gestures.BaseGesture
    public boolean canExecute(int i14) {
        return this.lastPointersDownCount > 1 && !this.invalidMovement && getGestureDuration() < this.multiFingerTapTimeThreshold && super.canExecute(i14);
    }

    public boolean exceededMovementThreshold(HashMap<PointerDistancePair, MultiFingerDistancesObject> map) {
        boolean z14;
        Iterator<MultiFingerDistancesObject> it = map.values().iterator();
        do {
            if (!it.hasNext()) {
                return false;
            }
            MultiFingerDistancesObject next = it.next();
            float fAbs = Math.abs(next.getCurrFingersDiffX() - next.getPrevFingersDiffX());
            float fAbs2 = Math.abs(next.getCurrFingersDiffY() - next.getPrevFingersDiffY());
            float f14 = this.multiFingerTapMovementThreshold;
            z14 = fAbs > f14 || fAbs2 > f14;
            this.invalidMovement = z14;
        } while (!z14);
        return true;
    }

    public float getMultiFingerTapMovementThreshold() {
        return this.multiFingerTapMovementThreshold;
    }

    public long getMultiFingerTapTimeThreshold() {
        return this.multiFingerTapTimeThreshold;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public void reset() {
        super.reset();
        this.lastPointersDownCount = 0;
        this.invalidMovement = false;
        this.pointerLifted = false;
    }

    public void setMultiFingerTapMovementThreshold(float f14) {
        this.multiFingerTapMovementThreshold = f14;
    }

    public void setMultiFingerTapMovementThresholdResource(int i14) {
        setMultiFingerTapMovementThreshold(this.context.getResources().getDimension(i14));
    }

    public void setMultiFingerTapTimeThreshold(long j8) {
        this.multiFingerTapTimeThreshold = j8;
    }
}
