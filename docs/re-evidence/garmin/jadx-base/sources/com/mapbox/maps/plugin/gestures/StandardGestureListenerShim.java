package com.mapbox.maps.plugin.gestures;

import android.view.MotionEvent;
import com.mapbox.android.gestures.StandardGestureDetector;

/* JADX INFO: loaded from: classes3.dex */
class StandardGestureListenerShim extends StandardGestureDetector.SimpleStandardOnGestureListener {
    @Override // com.mapbox.android.gestures.StandardGestureDetector.SimpleStandardOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        return super.onDoubleTap(motionEvent);
    }

    @Override // com.mapbox.android.gestures.StandardGestureDetector.SimpleStandardOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return super.onDoubleTapEvent(motionEvent);
    }

    @Override // com.mapbox.android.gestures.StandardGestureDetector.SimpleStandardOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        return super.onDown(motionEvent);
    }

    @Override // com.mapbox.android.gestures.StandardGestureDetector.SimpleStandardOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f14, float f15) {
        return super.onFling(motionEvent, motionEvent2, f14, f15);
    }

    @Override // com.mapbox.android.gestures.StandardGestureDetector.SimpleStandardOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        super.onLongPress(motionEvent);
    }

    @Override // com.mapbox.android.gestures.StandardGestureDetector.SimpleStandardOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f14, float f15) {
        return super.onScroll(motionEvent, motionEvent2, f14, f15);
    }

    @Override // com.mapbox.android.gestures.StandardGestureDetector.SimpleStandardOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
        super.onShowPress(motionEvent);
    }

    @Override // com.mapbox.android.gestures.StandardGestureDetector.SimpleStandardOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return super.onSingleTapConfirmed(motionEvent);
    }

    @Override // com.mapbox.android.gestures.StandardGestureDetector.SimpleStandardOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return super.onSingleTapUp(motionEvent);
    }
}
