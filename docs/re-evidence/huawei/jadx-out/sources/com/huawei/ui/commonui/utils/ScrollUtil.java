package com.huawei.ui.commonui.utils;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.core.util.Consumer;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.floatview.HealthFloatingView;
import defpackage.njy;
import defpackage.qkz;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class ScrollUtil {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f23964b = "ScrollUtil";
    private static int e;

    /* JADX INFO: loaded from: classes43.dex */
    public interface ScrollStateListener {
        void stopScroll();

        void swipDown();

        void swipUp();
    }

    public static int b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point.x;
    }

    public static boolean b(View view, View view2) {
        if (view == null || view2 == null) {
            LogUtil.j(f23964b, "isScrollChildViewVisible view ", view, " childView ", view2);
            return false;
        }
        Rect rect = new Rect();
        view.getHitRect(rect);
        return view2.getLocalVisibleRect(rect);
    }

    public static boolean e(View view, View view2, int i) {
        if (view == null || view2 == null) {
            LogUtil.j(f23964b, "isScrollChildViewVisible view ", view, " childView ", view2, " pixel ", Integer.valueOf(i));
            return false;
        }
        Rect rect = new Rect();
        view.getHitRect(rect);
        return view2.getLocalVisibleRect(rect) && rect.bottom >= i;
    }

    public static void d(View view, final View view2, final int i, final Consumer<Boolean> consumer) {
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.huawei.ui.commonui.utils.ScrollUtil.3
            private float d;
            private boolean e = false;
            private float i;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view3, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.d = motionEvent.getRawX();
                    this.i = motionEvent.getRawY();
                    this.e = true;
                    Consumer consumer2 = consumer;
                    if (consumer2 != null) {
                        consumer2.accept(true);
                    }
                } else if (action == 1) {
                    view3.performClick();
                    this.e = false;
                    float rawX = motionEvent.getRawX() - this.d;
                    float rawY = motionEvent.getRawY() - this.i;
                    LogUtil.a(ScrollUtil.f23964b, "MotionEvent.ACTION_UP, offsetX: ", Float.valueOf(rawX), " offsetY: ", Float.valueOf(rawY));
                    if (Math.abs(rawX) / 2.0f < Math.abs(rawY)) {
                        ScrollUtil.b(rawY, view2, i);
                    }
                    Consumer consumer3 = consumer;
                    if (consumer3 != null) {
                        consumer3.accept(false);
                    }
                } else if (action == 2) {
                    if (!this.e) {
                        this.d = motionEvent.getRawX();
                        this.i = motionEvent.getRawY();
                        this.e = true;
                    }
                    Consumer consumer4 = consumer;
                    if (consumer4 != null) {
                        consumer4.accept(true);
                    }
                }
                return false;
            }
        });
    }

    public static void a(View view, View view2, int i) {
        d(view, view2, i, null);
    }

    public static void b(View view, final ScrollStateListener scrollStateListener) {
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.huawei.ui.commonui.utils.ScrollUtil.4

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f23968a = false;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private float f23970c;
            private float e;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.e = motionEvent.getRawX();
                    this.f23970c = motionEvent.getRawY();
                    this.f23968a = true;
                } else if (action != 1) {
                    if (action == 2 && !this.f23968a) {
                        this.e = motionEvent.getRawX();
                        this.f23970c = motionEvent.getRawY();
                        this.f23968a = true;
                    }
                } else {
                    view2.performClick();
                    this.f23968a = false;
                    float rawX = motionEvent.getRawX() - this.e;
                    float rawY = motionEvent.getRawY() - this.f23970c;
                    LogUtil.a(ScrollUtil.f23964b, "MotionEvent.ACTION_UP, offsetX: ", Float.valueOf(rawX), " offsetY: ", Float.valueOf(rawY));
                    if (Math.abs(rawX) / 2.0f < Math.abs(rawY)) {
                        ScrollUtil.c(rawY, scrollStateListener);
                    }
                }
                return false;
            }
        });
    }

    private static void e(View view, int i) {
        String str = f23964b;
        LogUtil.a(str, "swipeDown");
        int i2 = e;
        if (i2 == 0 || i2 == 1) {
            e = -1;
            LogUtil.d(str, "setScreenTouchListening Fling swipeDown!");
            if (view == null) {
                return;
            }
            LogUtil.a(str, "floatintView show positionId: ", Integer.valueOf(i));
            HealthFloatingView healthFloatingViewC = c(view, i);
            if (healthFloatingViewC != null) {
                LogUtil.a(str, "floatintView show exist.");
                healthFloatingViewC.h();
            } else {
                LogUtil.a(str, "floatintView show didn't exist.");
            }
        }
    }

    private static void a(View view, int i) {
        int i2 = e;
        if (i2 == 0 || i2 == -1) {
            e = 1;
            String str = f23964b;
            LogUtil.d(str, "setScreenTouchListening Fling swipeUp!");
            if (view == null) {
                return;
            }
            LogUtil.a(str, "floatintView show positionId: ", Integer.valueOf(i));
            HealthFloatingView healthFloatingViewC = c(view, i);
            if (healthFloatingViewC != null) {
                LogUtil.a(str, "floatintView hide exist.");
                healthFloatingViewC.c();
            } else {
                LogUtil.a(str, "floatintView hide didn't exist.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(float f, View view, int i) {
        String str = f23964b;
        LogUtil.a(str, "setSwipeUP, positionId: ", Integer.valueOf(i), " offsetY: ", Float.valueOf(f));
        if (f < -5.0f) {
            a(view, i);
        } else if (f > 5.0f) {
            e(view, i);
        } else {
            LogUtil.d(str, "setScreenTouchListening no branch!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(float f, ScrollStateListener scrollStateListener) {
        if (f < -5.0f) {
            scrollStateListener.swipUp();
        } else if (f > 5.0f) {
            scrollStateListener.swipDown();
        } else {
            LogUtil.d(f23964b, "setScreenTouchListening no branch!");
        }
    }

    public static HealthFloatingView c(View view, int i) {
        List<Integer> listB = qkz.b();
        if (!njy.e(listB) && listB.contains(Integer.valueOf(i))) {
            View viewFindViewById = view.findViewById(3044);
            if (viewFindViewById instanceof HealthFloatingView) {
                return (HealthFloatingView) viewFindViewById;
            }
        }
        View viewFindViewById2 = view.findViewById(i);
        if (viewFindViewById2 instanceof HealthFloatingView) {
            return (HealthFloatingView) viewFindViewById2;
        }
        return null;
    }
}
