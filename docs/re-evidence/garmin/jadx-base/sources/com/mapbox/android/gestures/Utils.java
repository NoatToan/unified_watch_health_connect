package com.mapbox.android.gestures;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.util.TypedValue;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public class Utils {
    public static PointF determineFocalPoint(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        float x14 = 0.0f;
        float y14 = 0.0f;
        for (int i14 = 0; i14 < pointerCount; i14++) {
            x14 += motionEvent.getX(i14);
            y14 += motionEvent.getY(i14);
        }
        float f14 = pointerCount;
        return new PointF(x14 / f14, y14 / f14);
    }

    public static float dpToPx(float f14) {
        return f14 * Resources.getSystem().getDisplayMetrics().density;
    }

    public static float getRawX(MotionEvent motionEvent, int i14) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        if (i14 < motionEvent.getPointerCount()) {
            return motionEvent.getX(i14) + rawX;
        }
        return 0.0f;
    }

    public static float getRawY(MotionEvent motionEvent, int i14) {
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        if (i14 < motionEvent.getPointerCount()) {
            return motionEvent.getY(i14) + rawY;
        }
        return 0.0f;
    }

    public static float pxToDp(float f14) {
        return f14 / Resources.getSystem().getDisplayMetrics().density;
    }

    public static float pxToMm(float f14, Context context) {
        return f14 / TypedValue.applyDimension(5, 1.0f, context.getResources().getDisplayMetrics());
    }
}
