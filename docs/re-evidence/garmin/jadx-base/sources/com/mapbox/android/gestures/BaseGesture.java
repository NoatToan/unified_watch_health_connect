package com.mapbox.android.gestures;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseGesture<L> {
    protected final Context context;
    private MotionEvent currentEvent;
    private long gestureDuration;
    private final AndroidGesturesManager gesturesManager;
    private boolean isEnabled = true;
    protected L listener;
    private MotionEvent previousEvent;
    protected final WindowManager windowManager;

    public BaseGesture(Context context, AndroidGesturesManager androidGesturesManager) {
        this.context = context;
        this.windowManager = (WindowManager) context.getSystemService("window");
        this.gesturesManager = androidGesturesManager;
    }

    private boolean analyze(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        MotionEvent motionEvent2 = this.previousEvent;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
            this.previousEvent = null;
        }
        MotionEvent motionEvent3 = this.currentEvent;
        if (motionEvent3 != null) {
            this.previousEvent = MotionEvent.obtain(motionEvent3);
            this.currentEvent.recycle();
            this.currentEvent = null;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        this.currentEvent = motionEventObtain;
        this.gestureDuration = motionEventObtain.getEventTime() - this.currentEvent.getDownTime();
        return analyzeEvent(motionEvent);
    }

    public abstract boolean analyzeEvent(MotionEvent motionEvent);

    public boolean canExecute(int i14) {
        if (this.listener == null || !this.isEnabled) {
            return false;
        }
        for (Set<Integer> set : this.gesturesManager.getMutuallyExclusiveGestures()) {
            if (set.contains(Integer.valueOf(i14))) {
                for (Integer num : set) {
                    num.intValue();
                    for (BaseGesture baseGesture : this.gesturesManager.getDetectors()) {
                        if (baseGesture instanceof ProgressiveGesture) {
                            ProgressiveGesture progressiveGesture = (ProgressiveGesture) baseGesture;
                            if (progressiveGesture.getHandledTypes().contains(num) && progressiveGesture.isInProgress()) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public MotionEvent getCurrentEvent() {
        return this.currentEvent;
    }

    public long getGestureDuration() {
        return this.gestureDuration;
    }

    public MotionEvent getPreviousEvent() {
        return this.previousEvent;
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return analyze(motionEvent);
    }

    public void removeListener() {
        this.listener = null;
    }

    public void setEnabled(boolean z14) {
        this.isEnabled = z14;
    }

    public void setListener(L l14) {
        this.listener = l14;
    }
}
