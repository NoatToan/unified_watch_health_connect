package com.scwang.smartrefresh.layout.util;

import android.graphics.PointF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;

/* JADX INFO: loaded from: classes18.dex */
public class ScrollBoundaryUtil {
    public static boolean canLoadmore(View view, MotionEvent motionEvent) {
        if (!canScrollDown(view) && canScrollUp(view) && view.getVisibility() == 0) {
            return true;
        }
        if ((view instanceof ViewGroup) && motionEvent != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            PointF pointF = new PointF();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (isTransformedTouchPointInView(viewGroup, childAt, motionEvent.getX(), motionEvent.getY(), pointF)) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(pointF.x, pointF.y);
                    return canLoadmore(childAt, motionEventObtain);
                }
            }
        }
        return false;
    }

    public static boolean canRefresh(View view, MotionEvent motionEvent) {
        if (canScrollUp(view) && view.getVisibility() == 0) {
            return false;
        }
        if (!(view instanceof ViewGroup) || motionEvent == null) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        PointF pointF = new PointF();
        for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount - 1);
            if (isTransformedTouchPointInView(viewGroup, childAt, motionEvent.getX(), motionEvent.getY(), pointF)) {
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(pointF.x, pointF.y);
                return canRefresh(childAt, motionEventObtain);
            }
        }
        return true;
    }

    public static boolean canScrollDown(View view, MotionEvent motionEvent) {
        if (canScrollDown(view) && view.getVisibility() == 0) {
            return true;
        }
        if ((view instanceof ViewGroup) && motionEvent != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            PointF pointF = new PointF();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (isTransformedTouchPointInView(viewGroup, childAt, motionEvent.getX(), motionEvent.getY(), pointF)) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(pointF.x, pointF.y);
                    return canScrollDown(childAt, motionEventObtain);
                }
            }
        }
        return false;
    }

    public static boolean canScrollUp(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            return view.canScrollVertically(-1);
        }
        if (!(view instanceof AbsListView)) {
            return view.getScrollY() > 0;
        }
        AbsListView absListView = (AbsListView) view;
        return absListView.getChildCount() > 0 && (absListView.getFirstVisiblePosition() > 0 || absListView.getChildAt(0).getTop() < absListView.getPaddingTop());
    }

    public static boolean isTransformedTouchPointInView(ViewGroup viewGroup, View view, float f, float f2, PointF pointF) {
        if (view.getVisibility() != 0) {
            return false;
        }
        float[] fArr = {f, f2};
        transformPointToViewLocal(viewGroup, view, fArr);
        boolean zPointInView = pointInView(view, fArr[0], fArr[1], 0.0f);
        if (zPointInView && pointF != null) {
            pointF.set(fArr[0] - f, fArr[1] - f2);
        }
        return zPointInView;
    }

    public static boolean pointInView(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) view.getWidth()) + f3 && f2 < ((float) view.getHeight()) + f3;
    }

    public static void transformPointToViewLocal(ViewGroup viewGroup, View view, float[] fArr) {
        fArr[0] = fArr[0] + (viewGroup.getScrollX() - view.getLeft());
        fArr[1] = fArr[1] + (viewGroup.getScrollY() - view.getTop());
    }

    public static boolean canScrollDown(View view) {
        if (Build.VERSION.SDK_INT < 14) {
            if (!(view instanceof AbsListView)) {
                return view.getScrollY() < 0;
            }
            AbsListView absListView = (AbsListView) view;
            return absListView.getChildCount() > 0 && (absListView.getLastVisiblePosition() < absListView.getChildCount() - 1 || absListView.getChildAt(absListView.getChildCount() - 1).getBottom() > absListView.getPaddingBottom());
        }
        return view.canScrollVertically(1);
    }
}
