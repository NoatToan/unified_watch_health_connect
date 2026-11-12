package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes14.dex */
public class WindowUtils {
    private static final String TAG = "WindowUtils";

    public static class Api14Impl {
        private Api14Impl() {
        }

        public static Rect getCurrentWindowBounds(WindowManager windowManager) {
            int i14;
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point realSizeForDisplay = getRealSizeForDisplay(defaultDisplay);
            Rect rect = new Rect();
            int i15 = realSizeForDisplay.x;
            if (i15 == 0 || (i14 = realSizeForDisplay.y) == 0) {
                defaultDisplay.getRectSize(rect);
                return rect;
            }
            rect.right = i15;
            rect.bottom = i14;
            return rect;
        }

        private static Point getRealSizeForDisplay(Display display) {
            Point point = new Point();
            try {
                Method declaredMethod = Display.class.getDeclaredMethod("getRealSize", Point.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(display, point);
                return point;
            } catch (IllegalAccessException unused) {
                String unused2 = WindowUtils.TAG;
                return point;
            } catch (NoSuchMethodException unused3) {
                String unused4 = WindowUtils.TAG;
                return point;
            } catch (InvocationTargetException unused5) {
                String unused6 = WindowUtils.TAG;
                return point;
            }
        }
    }

    public static class Api17Impl {
        private Api17Impl() {
        }

        public static Rect getCurrentWindowBounds(WindowManager windowManager) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Rect rect = new Rect();
            rect.right = point.x;
            rect.bottom = point.y;
            return rect;
        }
    }

    public static class Api30Impl {
        private Api30Impl() {
        }

        public static Rect getCurrentWindowBounds(WindowManager windowManager) {
            return windowManager.getCurrentWindowMetrics().getBounds();
        }
    }

    private WindowUtils() {
    }

    public static Rect getCurrentWindowBounds(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        return Build.VERSION.SDK_INT >= 30 ? Api30Impl.getCurrentWindowBounds(windowManager) : Api17Impl.getCurrentWindowBounds(windowManager);
    }
}
