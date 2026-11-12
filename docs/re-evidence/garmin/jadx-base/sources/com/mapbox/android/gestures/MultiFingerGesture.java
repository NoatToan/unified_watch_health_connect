package com.mapbox.android.gestures;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import n23.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MultiFingerGesture<L> extends BaseGesture<L> {
    private static final int DEFAULT_REQUIRED_FINGERS_COUNT = 2;
    private static final float PRESSURE_THRESHOLD = 0.67f;
    private DisplayMetrics displayMetrics;
    private final float edgeSlop;
    private PointF focalPoint;
    private final PermittedActionsGuard permittedActionsGuard;
    final List<Integer> pointerIdList;
    final HashMap<PointerDistancePair, MultiFingerDistancesObject> pointersDistanceMap;
    private float spanThreshold;

    public MultiFingerGesture(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
        this.permittedActionsGuard = new PermittedActionsGuard();
        this.pointerIdList = new ArrayList();
        this.pointersDistanceMap = new HashMap<>();
        this.focalPoint = new PointF();
        this.edgeSlop = ViewConfiguration.get(context).getScaledEdgeSlop();
        queryDisplayMetrics();
    }

    private void calculateDistances() {
        this.pointersDistanceMap.clear();
        int i14 = 0;
        while (i14 < this.pointerIdList.size() - 1) {
            int i15 = i14 + 1;
            for (int i16 = i15; i16 < this.pointerIdList.size(); i16++) {
                Integer num = this.pointerIdList.get(i14);
                int iIntValue = num.intValue();
                Integer num2 = this.pointerIdList.get(i16);
                int iIntValue2 = num2.intValue();
                float x14 = getPreviousEvent().getX(getPreviousEvent().findPointerIndex(iIntValue));
                float y14 = getPreviousEvent().getY(getPreviousEvent().findPointerIndex(iIntValue));
                this.pointersDistanceMap.put(new PointerDistancePair(num, num2), new MultiFingerDistancesObject(getPreviousEvent().getX(getPreviousEvent().findPointerIndex(iIntValue2)) - x14, getPreviousEvent().getY(getPreviousEvent().findPointerIndex(iIntValue2)) - y14, getCurrentEvent().getX(getCurrentEvent().findPointerIndex(iIntValue2)) - getCurrentEvent().getX(getCurrentEvent().findPointerIndex(iIntValue)), getCurrentEvent().getY(getCurrentEvent().findPointerIndex(iIntValue2)) - getCurrentEvent().getY(getCurrentEvent().findPointerIndex(iIntValue))));
            }
            i14 = i15;
        }
    }

    private boolean checkSpanBelowThreshold() {
        Iterator<MultiFingerDistancesObject> it = this.pointersDistanceMap.values().iterator();
        while (it.hasNext()) {
            if (it.next().getCurrFingersDiffXY() < this.spanThreshold) {
                return true;
            }
        }
        return false;
    }

    private boolean isMissingPointers(MotionEvent motionEvent) {
        Iterator<Integer> it = this.pointerIdList.iterator();
        while (it.hasNext()) {
            if (motionEvent.findPointerIndex(it.next().intValue()) == -1) {
                return true;
            }
        }
        return false;
    }

    private void queryDisplayMetrics() {
        if (this.windowManager == null) {
            this.displayMetrics = this.context.getResources().getDisplayMetrics();
        } else {
            this.displayMetrics = new DisplayMetrics();
            this.windowManager.getDefaultDisplay().getRealMetrics(this.displayMetrics);
        }
    }

    private void updatePointerList(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5) {
            this.pointerIdList.add(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
        } else if (actionMasked == 1 || actionMasked == 6) {
            this.pointerIdList.remove(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
        }
    }

    private boolean verifyPointers(int i14, int i15) {
        return i14 != i15 && i14 >= 0 && i15 >= 0 && i14 < getPointersCount() && i15 < getPointersCount();
    }

    @Override // com.mapbox.android.gestures.BaseGesture
    public boolean analyzeEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            queryDisplayMetrics();
        }
        boolean z14 = this.permittedActionsGuard.isMissingActions(actionMasked, motionEvent.getPointerCount(), this.pointerIdList.size()) || (actionMasked == 2 && isMissingPointers(motionEvent));
        if (z14) {
            if (this instanceof ProgressiveGesture) {
                ProgressiveGesture progressiveGesture = (ProgressiveGesture) this;
                if (progressiveGesture.isInProgress()) {
                    progressiveGesture.gestureStopped();
                }
            }
            this.pointerIdList.clear();
            this.pointersDistanceMap.clear();
        }
        if (!z14 || actionMasked == 0) {
            updatePointerList(motionEvent);
        }
        this.focalPoint = Utils.determineFocalPoint(motionEvent);
        if (!z14 && actionMasked == 2 && this.pointerIdList.size() >= getRequiredPointersCount() && checkPressure()) {
            calculateDistances();
            if (!isSloppyGesture()) {
                return analyzeMovement();
            }
        }
        return false;
    }

    public boolean analyzeMovement() {
        return false;
    }

    @Override // com.mapbox.android.gestures.BaseGesture
    public boolean canExecute(int i14) {
        return super.canExecute(i14) && !isSloppyGesture();
    }

    public boolean checkPressure() {
        return getCurrentEvent().getPressure() / getPreviousEvent().getPressure() > PRESSURE_THRESHOLD;
    }

    public float getCurrentSpan(int i14, int i15) {
        if (verifyPointers(i14, i15)) {
            return this.pointersDistanceMap.get(new PointerDistancePair(this.pointerIdList.get(i14), this.pointerIdList.get(i15))).getCurrFingersDiffXY();
        }
        j.s("There is no such pair of pointers!");
        return 0.0f;
    }

    public float getCurrentSpanX(int i14, int i15) {
        if (verifyPointers(i14, i15)) {
            return Math.abs(this.pointersDistanceMap.get(new PointerDistancePair(this.pointerIdList.get(i14), this.pointerIdList.get(i15))).getCurrFingersDiffX());
        }
        j.s("There is no such pair of pointers!");
        return 0.0f;
    }

    public float getCurrentSpanY(int i14, int i15) {
        if (verifyPointers(i14, i15)) {
            return Math.abs(this.pointersDistanceMap.get(new PointerDistancePair(this.pointerIdList.get(i14), this.pointerIdList.get(i15))).getCurrFingersDiffY());
        }
        j.s("There is no such pair of pointers!");
        return 0.0f;
    }

    public PointF getFocalPoint() {
        return this.focalPoint;
    }

    public int getPointersCount() {
        return this.pointerIdList.size();
    }

    public float getPreviousSpan(int i14, int i15) {
        if (verifyPointers(i14, i15)) {
            return this.pointersDistanceMap.get(new PointerDistancePair(this.pointerIdList.get(i14), this.pointerIdList.get(i15))).getPrevFingersDiffXY();
        }
        j.s("There is no such pair of pointers!");
        return 0.0f;
    }

    public float getPreviousSpanX(int i14, int i15) {
        if (verifyPointers(i14, i15)) {
            return Math.abs(this.pointersDistanceMap.get(new PointerDistancePair(this.pointerIdList.get(i14), this.pointerIdList.get(i15))).getPrevFingersDiffX());
        }
        j.s("There is no such pair of pointers!");
        return 0.0f;
    }

    public float getPreviousSpanY(int i14, int i15) {
        if (verifyPointers(i14, i15)) {
            return Math.abs(this.pointersDistanceMap.get(new PointerDistancePair(this.pointerIdList.get(i14), this.pointerIdList.get(i15))).getPrevFingersDiffY());
        }
        j.s("There is no such pair of pointers!");
        return 0.0f;
    }

    public int getRequiredPointersCount() {
        return 2;
    }

    public float getSpanThreshold() {
        return this.spanThreshold;
    }

    public boolean isSloppyGesture() {
        DisplayMetrics displayMetrics = this.displayMetrics;
        float f14 = displayMetrics.widthPixels;
        float f15 = this.edgeSlop;
        float f16 = f14 - f15;
        float f17 = displayMetrics.heightPixels - f15;
        Iterator<Integer> it = this.pointerIdList.iterator();
        while (it.hasNext()) {
            int iFindPointerIndex = getCurrentEvent().findPointerIndex(it.next().intValue());
            float rawX = Utils.getRawX(getCurrentEvent(), iFindPointerIndex);
            float rawY = Utils.getRawY(getCurrentEvent(), iFindPointerIndex);
            if (rawX < f15 || rawY < f15 || rawX > f16 || rawY > f17) {
                return true;
            }
        }
        return checkSpanBelowThreshold();
    }

    public void reset() {
    }

    public void setSpanThreshold(float f14) {
        this.spanThreshold = f14;
    }

    public void setSpanThresholdResource(int i14) {
        setSpanThreshold(this.context.getResources().getDimension(i14));
    }
}
