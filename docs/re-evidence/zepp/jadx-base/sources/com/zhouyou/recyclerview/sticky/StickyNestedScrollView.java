package com.zhouyou.recyclerview.sticky;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class StickyNestedScrollView extends NestedScrollView {
    public static final String FLAG_HASTRANSPARENCY = "-hastransparency";
    public static final String FLAG_NONCONSTANT = "-nonconstant";
    public static final String STICKY_TAG = "sticky";
    private static final int o = 10;
    private ArrayList<View> a;
    private View b;
    private float c;
    private final Runnable d;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private Drawable j;
    private boolean k;
    private List<OnViewStickyListener> l;
    private int m;
    private int n;

    public interface OnViewStickyListener {
        void onSticky(View view);

        void onUnSticky(View view);
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (StickyNestedScrollView.this.b != null) {
                StickyNestedScrollView stickyNestedScrollView = StickyNestedScrollView.this;
                int iJ = stickyNestedScrollView.j(stickyNestedScrollView.b);
                StickyNestedScrollView stickyNestedScrollView2 = StickyNestedScrollView.this;
                int i = stickyNestedScrollView2.i(stickyNestedScrollView2.b);
                StickyNestedScrollView stickyNestedScrollView3 = StickyNestedScrollView.this;
                StickyNestedScrollView.this.invalidate(iJ, i, stickyNestedScrollView3.k(stickyNestedScrollView3.b), (int) (StickyNestedScrollView.this.getScrollY() + StickyNestedScrollView.this.b.getHeight() + StickyNestedScrollView.this.c));
            }
            StickyNestedScrollView.this.postDelayed(this, 16L);
        }
    }

    public StickyNestedScrollView(Context context) {
        this(context, null);
    }

    private boolean f(View view) {
        if (!l(view).contains("sticky")) {
            return false;
        }
        this.a.add(view);
        return true;
    }

    private void g() {
        float fMin;
        Iterator<View> it2 = this.a.iterator();
        View view = null;
        View view2 = null;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            View next = it2.next();
            int iM = (m(next) - getScrollY()) + (this.g ? 0 : getPaddingTop());
            if (iM <= 0) {
                if (view != null) {
                    if (iM > (m(view) - getScrollY()) + (this.g ? 0 : getPaddingTop())) {
                    }
                }
                view = next;
            } else {
                if (view2 != null) {
                    if (iM < (m(view2) - getScrollY()) + (this.g ? 0 : getPaddingTop())) {
                    }
                }
                view2 = next;
            }
        }
        if (view == null) {
            if (this.b != null) {
                List<OnViewStickyListener> list = this.l;
                if (list != null) {
                    Iterator<OnViewStickyListener> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onUnSticky(this.b);
                    }
                }
                r();
                return;
            }
            return;
        }
        if (view2 == null) {
            fMin = 0.0f;
        } else {
            fMin = Math.min(0, ((m(view2) - getScrollY()) + (this.g ? 0 : getPaddingTop())) - view.getHeight());
        }
        this.c = fMin;
        View view3 = this.b;
        if (view != view3) {
            if (view3 != null) {
                List<OnViewStickyListener> list2 = this.l;
                if (list2 != null) {
                    Iterator<OnViewStickyListener> it4 = list2.iterator();
                    while (it4.hasNext()) {
                        it4.next().onUnSticky(this.b);
                    }
                }
                r();
            }
            this.e = j(view);
            q(view);
            List<OnViewStickyListener> list3 = this.l;
            if (list3 != null) {
                Iterator<OnViewStickyListener> it5 = list3.iterator();
                while (it5.hasNext()) {
                    it5.next().onSticky(this.b);
                }
            }
        }
    }

    private void h(View view) {
        if (f(view) || !(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            h(viewGroup.getChildAt(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int i(View view) {
        int bottom = view.getBottom();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            bottom += view.getBottom();
        }
        return bottom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int j(View view) {
        int left = view.getLeft();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            left += view.getLeft();
        }
        return left;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int k(View view) {
        int right = view.getRight();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            right += view.getRight();
        }
        return right;
    }

    private String l(View view) {
        return String.valueOf(view.getTag());
    }

    private int m(View view) {
        int top = view.getTop();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            top += view.getTop();
        }
        return top;
    }

    private void n(View view) {
        view.setAlpha(0.0f);
    }

    private void o() {
        if (this.b != null) {
            r();
        }
        this.a.clear();
        h(getChildAt(0));
        g();
        invalidate();
    }

    private void p(View view) {
        view.setAlpha(1.0f);
    }

    private void q(View view) {
        this.b = view;
        if (view != null) {
            if (l(view).contains(FLAG_HASTRANSPARENCY)) {
                n(this.b);
            }
            if (l(this.b).contains(FLAG_NONCONSTANT)) {
                post(this.d);
            }
        }
    }

    private void r() {
        if (l(this.b).contains(FLAG_HASTRANSPARENCY)) {
            p(this.b);
        }
        this.b = null;
        removeCallbacks(this.d);
    }

    public void addOnViewStickyListener(OnViewStickyListener onViewStickyListener) {
        if (this.l == null) {
            this.l = new ArrayList();
        }
        this.l.add(onViewStickyListener);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
        h(view);
    }

    public void clearOnViewStickyListener() {
        List<OnViewStickyListener> list = this.l;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.b != null) {
            canvas.save();
            canvas.translate(getPaddingLeft() + this.e, getScrollY() + this.c + (this.g ? getPaddingTop() : 0));
            canvas.clipRect(0.0f, this.g ? -this.c : 0.0f, getWidth() - this.e, this.b.getHeight() + this.i + 1);
            if (this.j != null) {
                this.j.setBounds(0, this.b.getHeight(), this.b.getWidth(), this.b.getHeight() + this.i);
                this.j.draw(canvas);
            }
            canvas.clipRect(0.0f, this.g ? -this.c : 0.0f, getWidth(), this.b.getHeight());
            if (l(this.b).contains(FLAG_HASTRANSPARENCY)) {
                p(this.b);
                this.b.draw(canvas);
                n(this.b);
            } else {
                this.b.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f = true;
        }
        if (this.f) {
            boolean z = this.b != null;
            this.f = z;
            if (z) {
                this.f = motionEvent.getY() <= ((float) this.b.getHeight()) + this.c && motionEvent.getX() >= ((float) j(this.b)) && motionEvent.getX() <= ((float) k(this.b));
            }
        } else if (this.b == null) {
            this.f = false;
        }
        if (this.f) {
            motionEvent.offsetLocation(0.0f, ((getScrollY() + this.c) - m(this.b)) * (-1.0f));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void notifyStickyAttributeChanged() {
        o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.d);
        super.onDetachedFromWindow();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.m = (int) motionEvent.getRawY();
        } else if (action == 2 && Math.abs(((int) motionEvent.getRawY()) - this.m) > this.n) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.h) {
            this.g = true;
        }
        o();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        g();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f) {
            motionEvent.offsetLocation(0.0f, (getScrollY() + this.c) - m(this.b));
        }
        if (motionEvent.getAction() == 0) {
            this.k = false;
        }
        if (this.k) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(0);
            super.onTouchEvent(motionEventObtain);
            this.k = false;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.k = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void removeOnViewStickyListener(OnViewStickyListener onViewStickyListener) {
        List<OnViewStickyListener> list = this.l;
        if (list != null) {
            list.remove(onViewStickyListener);
        }
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        super.setClipToPadding(z);
        this.g = z;
        this.h = true;
    }

    public void setShadowDrawable(Drawable drawable) {
        this.j = drawable;
    }

    public void setShadowHeight(int i) {
        this.i = i;
    }

    public void setup() {
        this.a = new ArrayList<>();
    }

    public StickyNestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.scrollViewStyle);
    }

    public StickyNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new a();
        this.i = 10;
        this.k = true;
        this.n = ViewConfiguration.get(context).getScaledTouchSlop();
        setup();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        super.addView(view, i);
        h(view);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        h(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
        super.addView(view, i, i2);
        h(view);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        h(view);
    }
}
