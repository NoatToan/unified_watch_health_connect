package com.mapbox.android.gestures;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class MoveGestureDetector extends ProgressiveGesture<OnMoveGestureListener> {
    private static final int MOVE_REQUIRED_POINTERS_COUNT = 1;
    private static final Set<Integer> handledTypes;
    float lastDistanceX;
    float lastDistanceY;
    private final Map<Integer, MoveDistancesObject> moveDistancesObjectMap;
    private float moveThreshold;
    private RectF moveThresholdRect;
    private PointF previousFocalPoint;
    private boolean resetFocal;

    public interface OnMoveGestureListener {
        boolean onMove(MoveGestureDetector moveGestureDetector, float f14, float f15);

        boolean onMoveBegin(MoveGestureDetector moveGestureDetector);

        void onMoveEnd(MoveGestureDetector moveGestureDetector, float f14, float f15);
    }

    public static class SimpleOnMoveGestureListener implements OnMoveGestureListener {
        @Override // com.mapbox.android.gestures.MoveGestureDetector.OnMoveGestureListener
        public boolean onMove(MoveGestureDetector moveGestureDetector, float f14, float f15) {
            return false;
        }

        @Override // com.mapbox.android.gestures.MoveGestureDetector.OnMoveGestureListener
        public boolean onMoveBegin(MoveGestureDetector moveGestureDetector) {
            return true;
        }

        @Override // com.mapbox.android.gestures.MoveGestureDetector.OnMoveGestureListener
        public void onMoveEnd(MoveGestureDetector moveGestureDetector, float f14, float f15) {
        }
    }

    static {
        HashSet hashSet = new HashSet();
        handledTypes = hashSet;
        hashSet.add(13);
    }

    public MoveGestureDetector(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
        this.moveDistancesObjectMap = new HashMap();
    }

    private void updateMoveDistancesObjects() {
        for (Integer num : this.pointerIdList) {
            int iIntValue = num.intValue();
            this.moveDistancesObjectMap.get(num).addNewPosition(getCurrentEvent().getX(getCurrentEvent().findPointerIndex(iIntValue)), getCurrentEvent().getY(getCurrentEvent().findPointerIndex(iIntValue)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    @Override // com.mapbox.android.gestures.ProgressiveGesture, com.mapbox.android.gestures.MultiFingerGesture, com.mapbox.android.gestures.BaseGesture
    public boolean analyzeEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.resetFocal = true;
            this.moveDistancesObjectMap.put(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())), new MoveDistancesObject(motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex())));
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.moveDistancesObjectMap.clear();
        } else if (actionMasked == 5) {
            this.resetFocal = true;
            this.moveDistancesObjectMap.put(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())), new MoveDistancesObject(motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex())));
        } else if (actionMasked == 6) {
            this.resetFocal = true;
            this.moveDistancesObjectMap.remove(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
        }
        return super.analyzeEvent(motionEvent);
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public boolean analyzeMovement() {
        super.analyzeMovement();
        updateMoveDistancesObjects();
        if (!isInProgress()) {
            if (!canExecute(13) || !((OnMoveGestureListener) this.listener).onMoveBegin(this)) {
                return false;
            }
            gestureStarted();
            this.previousFocalPoint = getFocalPoint();
            this.resetFocal = false;
            return true;
        }
        PointF focalPoint = getFocalPoint();
        PointF pointF = this.previousFocalPoint;
        float f14 = pointF.x - focalPoint.x;
        this.lastDistanceX = f14;
        float f15 = pointF.y - focalPoint.y;
        this.lastDistanceY = f15;
        this.previousFocalPoint = focalPoint;
        if (!this.resetFocal) {
            return ((OnMoveGestureListener) this.listener).onMove(this, f14, f15);
        }
        this.resetFocal = false;
        return ((OnMoveGestureListener) this.listener).onMove(this, 0.0f, 0.0f);
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture, com.mapbox.android.gestures.BaseGesture
    public boolean canExecute(int i14) {
        return super.canExecute(i14) && checkAnyMoveAboveThreshold();
    }

    public boolean checkAnyMoveAboveThreshold() {
        Iterator<MoveDistancesObject> it = this.moveDistancesObjectMap.values().iterator();
        if (it.hasNext()) {
            MoveDistancesObject next = it.next();
            boolean z14 = Math.abs(next.getDistanceXSinceStart()) >= this.moveThreshold || Math.abs(next.getDistanceYSinceStart()) >= this.moveThreshold;
            RectF rectF = this.moveThresholdRect;
            if ((rectF == null || !rectF.contains(getFocalPoint().x, getFocalPoint().y)) && z14) {
                return true;
            }
        }
        return false;
    }

    @Override // com.mapbox.android.gestures.ProgressiveGesture
    public void gestureStopped() {
        super.gestureStopped();
        ((OnMoveGestureListener) this.listener).onMoveEnd(this, this.velocityX, this.velocityY);
    }

    public float getLastDistanceX() {
        return this.lastDistanceX;
    }

    public float getLastDistanceY() {
        return this.lastDistanceY;
    }

    public MoveDistancesObject getMoveObject(int i14) {
        if (!isInProgress() || i14 < 0 || i14 >= getPointersCount()) {
            return null;
        }
        return this.moveDistancesObjectMap.get(this.pointerIdList.get(i14));
    }

    public float getMoveThreshold() {
        return this.moveThreshold;
    }

    public RectF getMoveThresholdRect() {
        return this.moveThresholdRect;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public int getRequiredPointersCount() {
        return 1;
    }

    @Override // com.mapbox.android.gestures.ProgressiveGesture
    public Set<Integer> provideHandledTypes() {
        return handledTypes;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public void reset() {
        super.reset();
    }

    public void setMoveThreshold(float f14) {
        this.moveThreshold = f14;
    }

    public void setMoveThresholdRect(RectF rectF) {
        this.moveThresholdRect = rectF;
    }

    public void setMoveThresholdResource(int i14) {
        setMoveThreshold(this.context.getResources().getDimension(i14));
    }
}
