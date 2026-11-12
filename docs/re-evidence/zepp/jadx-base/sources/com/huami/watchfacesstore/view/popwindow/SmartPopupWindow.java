package com.huami.watchfacesstore.view.popwindow;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.core.widget.PopupWindowCompat;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.view.popwindow.SmartPopupWindow;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public class SmartPopupWindow extends PopupWindow {
    private int a;
    private int b;
    private float c;
    private Context d;
    private View e;
    private boolean f;
    private int g;
    private boolean h;
    private View i;
    private int j;
    private int k;
    private int l;
    private int m;
    private final ViewTreeObserver.OnGlobalLayoutListener n;

    public static class Builder {
        private SmartPopupWindow a;

        private Builder(Activity activity, View view) {
            SmartPopupWindow smartPopupWindow = new SmartPopupWindow(activity);
            this.a = smartPopupWindow;
            smartPopupWindow.d = activity;
            this.a.e = view;
        }

        public static Builder build(Activity activity, View view) {
            return new Builder(activity, view);
        }

        public SmartPopupWindow createPopupWindow() {
            this.a.init();
            return this.a;
        }

        public Builder setAlpha(float alpha) {
            this.a.c = alpha;
            return this;
        }

        public Builder setAnimationStyle(int animationStyle) {
            this.a.g = animationStyle;
            return this;
        }

        public Builder setOutsideTouchDismiss(boolean dismiss) {
            this.a.f = dismiss;
            return this;
        }

        public Builder setSize(int width, int height) {
            this.a.a = width;
            this.a.b = height;
            return this;
        }
    }

    public class a implements View.OnKeyListener {
        public a() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View v, int keyCode, KeyEvent event) {
            if (keyCode != 4) {
                return false;
            }
            SmartPopupWindow.this.dismiss();
            return true;
        }
    }

    public class b implements View.OnTouchListener {
        public b() {
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View v, MotionEvent event) {
            int x = (int) event.getX();
            int y = (int) event.getY();
            return (event.getAction() == 0 && (x < 0 || x >= SmartPopupWindow.this.a || y < 0 || y >= SmartPopupWindow.this.b)) || event.getAction() == 4;
        }
    }

    public class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String b() {
            return "OnGlobalLayoutListener contentView measuredW: " + SmartPopupWindow.this.a + " measuredH: " + SmartPopupWindow.this.b;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            SmartPopupWindow smartPopupWindow = SmartPopupWindow.this;
            smartPopupWindow.a = smartPopupWindow.getContentView().getWidth();
            SmartPopupWindow smartPopupWindow2 = SmartPopupWindow.this;
            smartPopupWindow2.b = smartPopupWindow2.getContentView().getHeight();
            HMLog.debug("SmartPopupWindow", new Function0() { // from class: com.huami.watchfacesstore.view.popwindow.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.b();
                }
            });
            if (SmartPopupWindow.this.h) {
                SmartPopupWindow.this.w();
            } else {
                SmartPopupWindow.this.w();
            }
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            SmartPopupWindow.this.x(((Float) animation.getAnimatedValue()).floatValue());
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            SmartPopupWindow.this.x(((Float) animation.getAnimatedValue()).floatValue());
        }
    }

    public SmartPopupWindow(Context context) {
        this(context, null);
    }

    private void A(int width, int height, @NonNull View anchor, final int verticalGravity, int horizontalGravity, int x, int y) {
        update(anchor, p(anchor, horizontalGravity, width, x), q(anchor, verticalGravity, height, y), width, height);
    }

    private void o(View contentView) {
        contentView.getViewTreeObserver().addOnGlobalLayoutListener(this.n);
    }

    private int p(View anchor, int horizontalGravity, int measuredW, int x) {
        int width;
        if (horizontalGravity != 0) {
            if (horizontalGravity != 1) {
                if (horizontalGravity == 2) {
                    width = anchor.getWidth();
                } else {
                    if (horizontalGravity != 4) {
                        return x;
                    }
                    measuredW -= anchor.getWidth();
                }
            }
            return x - measuredW;
        }
        width = (anchor.getWidth() / 2) - (measuredW / 2);
        return x + width;
    }

    private int q(View anchor, int verticalGravity, int measuredH, int y) {
        int height;
        if (verticalGravity != 0) {
            if (verticalGravity == 1) {
                measuredH += anchor.getHeight();
            } else if (verticalGravity == 3) {
                height = anchor.getHeight();
            } else if (verticalGravity != 4) {
                return y;
            }
            return y - measuredH;
        }
        height = (anchor.getHeight() / 2) + (measuredH / 2);
        return y - height;
    }

    private void r() {
        float f = this.c;
        if (f >= 1.0f) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new e());
        valueAnimatorOfFloat.setDuration(360L);
        valueAnimatorOfFloat.start();
    }

    private static int s(int measureSpec) {
        return measureSpec == -2 ? 0 : 1073741824;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String t(View view) {
        return "anchorView measuredW: " + view.getMeasuredWidth() + " measuredH: " + view.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String u(int i, int i2) {
        return "contentView measuredW: " + i + " measuredH: " + i2;
    }

    private static int v(int measureSpec) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(measureSpec), s(measureSpec));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (getContentView() != null) {
            getContentView().getViewTreeObserver().removeOnGlobalLayoutListener(this.n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(float alpha) {
        Context context = this.d;
        if (context != null && (context instanceof Activity)) {
            Window window = ((Activity) context).getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.alpha = alpha;
            window.setAttributes(attributes);
        }
    }

    private void y() {
        float f = this.c;
        if (f >= 1.0f) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, f);
        valueAnimatorOfFloat.addUpdateListener(new d());
        valueAnimatorOfFloat.setDuration(360L);
        valueAnimatorOfFloat.start();
    }

    private void z(boolean touchOutsideDismiss) {
        if (touchOutsideDismiss) {
            setFocusable(true);
            setOutsideTouchable(true);
            setBackgroundDrawable(new ColorDrawable(0));
            return;
        }
        setFocusable(true);
        setOutsideTouchable(false);
        setBackgroundDrawable(null);
        getContentView().setFocusable(true);
        getContentView().setFocusableInTouchMode(true);
        getContentView().setOnKeyListener(new a());
        setTouchInterceptor(new b());
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        super.dismiss();
        r();
        w();
    }

    public void init() {
        setContentView(this.e);
        setHeight(this.b);
        setWidth(this.a);
        z(this.f);
        int i = this.g;
        if (i != -1) {
            setAnimationStyle(i);
        }
    }

    public void showAtAnchorView(@NonNull View anchorView, int verticalPos, int horizontalPos) {
        showAtAnchorView(anchorView, verticalPos, horizontalPos, true);
    }

    @Override // android.widget.PopupWindow
    public void showAtLocation(View parent, int gravity, int x, int y) {
        this.h = true;
        this.i = parent;
        this.l = x;
        this.m = y;
        o(getContentView());
        super.showAtLocation(parent, gravity, x, y);
    }

    public SmartPopupWindow(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public void showAtAnchorView(@NonNull View anchorView, int verticalPos, int horizontalPos, boolean fitInScreen) {
        showAtAnchorView(anchorView, verticalPos, horizontalPos, 0, 0, fitInScreen);
    }

    public SmartPopupWindow(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.a = -2;
        this.b = -2;
        this.c = 1.0f;
        this.f = true;
        this.g = -1;
        this.h = true;
        this.j = 2;
        this.k = 1;
        this.n = new c();
        this.d = context;
    }

    public void showAtAnchorView(@NonNull View anchorView, int verticalPos, int horizontalPos, int x, int y) {
        showAtAnchorView(anchorView, verticalPos, horizontalPos, x, y, true);
    }

    public void showAtAnchorView(@NonNull final View anchorView, int verticalPos, int horizontalPos, int x, int y, boolean fitInScreen) {
        this.h = false;
        this.i = anchorView;
        this.l = x;
        this.m = y;
        this.j = verticalPos;
        this.k = horizontalPos;
        y();
        View contentView = getContentView();
        o(contentView);
        setClippingEnabled(fitInScreen);
        contentView.measure(v(getWidth()), v(getHeight()));
        final int measuredWidth = contentView.getMeasuredWidth();
        final int measuredHeight = contentView.getMeasuredHeight();
        HMLog.debug("SmartPopupWindow", new Function0() { // from class: i47
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SmartPopupWindow.t(anchorView);
            }
        });
        HMLog.debug("SmartPopupWindow", new Function0() { // from class: h47
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SmartPopupWindow.u(measuredWidth, measuredHeight);
            }
        });
        if (!fitInScreen) {
            int[] iArr = new int[2];
            anchorView.getLocationInWindow(iArr);
            x += iArr[0];
            y += iArr[1] + anchorView.getHeight();
        }
        int iQ = q(anchorView, verticalPos, measuredHeight, y);
        int iP = p(anchorView, horizontalPos, measuredWidth, x);
        if (fitInScreen) {
            PopupWindowCompat.showAsDropDown(this, anchorView, iP, iQ, 0);
        } else {
            showAtLocation(anchorView, 0, iP, iQ);
        }
    }
}
