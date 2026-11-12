package com.huami.widget.wheelview;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.widget.wheelview.adapters.WheelViewAdapter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public class WheelView extends View {
    private static final int[] L = {-15658735, 11184810, 11184810};
    private static final int M = 10;
    private static final int N = 10;
    private static final int O = 5;
    private static final String P = "WheelView";
    private int A;
    private int B;
    private Style C;
    private float D;
    private float E;
    private float F;
    private int[] G;
    private float[] H;
    private boolean I;
    public WheelScroller.ScrollingListener J;
    private DataSetObserver K;
    private int a;
    private int b;
    private int c;
    private Drawable d;
    private Drawable e;
    private Rect f;
    private GradientDrawable g;
    private GradientDrawable h;
    private WheelScroller i;
    private boolean j;
    private int k;
    public boolean l;
    private LinearLayout m;
    private int n;
    private WheelViewAdapter o;
    private WheelRecycle p;
    private List<OnWheelChangedListener> q;
    private List<OnWheelScrollListener> r;
    private List<OnWheelClickedListener> s;
    private int t;
    private Paint u;
    private Paint v;
    private String w;
    private float x;
    private float y;
    private int z;

    public enum Style {
        NORMAL,
        LINE,
        FILL,
        LINE_VARIATION,
        LINE_GRADIENT
    }

    public class a implements OnWheelChangedListener {
        public a() {
        }

        @Override // com.huami.widget.wheelview.OnWheelChangedListener
        public void onChanged(WheelView wheelView, int i, int i2) {
            Log.i(WheelView.P, "newValue=" + i2);
            WheelView.this.invalidateWheel(true);
        }
    }

    public class b implements WheelScroller.ScrollingListener {
        public b() {
        }

        @Override // com.huami.widget.wheelview.WheelScroller.ScrollingListener
        public void onFinished() {
            if (WheelView.this.j) {
                WheelView.this.notifyScrollingListenersAboutEnd();
                WheelView.this.j = false;
            }
            WheelView.this.k = 0;
            WheelView.this.invalidate();
        }

        @Override // com.huami.widget.wheelview.WheelScroller.ScrollingListener
        public void onJustify() {
            if (Math.abs(WheelView.this.k) > 1) {
                WheelView.this.i.scroll(WheelView.this.k, 0);
            }
        }

        @Override // com.huami.widget.wheelview.WheelScroller.ScrollingListener
        public void onScroll(int i) {
            WheelView.this.k(i);
            int height = WheelView.this.getHeight();
            if (WheelView.this.k > height) {
                WheelView.this.k = height;
                WheelView.this.i.stopScrolling();
                return;
            }
            int i2 = -height;
            if (WheelView.this.k < i2) {
                WheelView.this.k = i2;
                WheelView.this.i.stopScrolling();
            }
        }

        @Override // com.huami.widget.wheelview.WheelScroller.ScrollingListener
        public void onStarted() {
            WheelView.this.j = true;
            WheelView.this.notifyScrollingListenersAboutStart();
        }
    }

    public class c extends DataSetObserver {
        public c() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            WheelView.this.invalidateWheel(false);
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            WheelView.this.invalidateWheel(true);
        }
    }

    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Style.values().length];
            a = iArr;
            try {
                iArr[Style.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Style.LINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Style.LINE_VARIATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Style.LINE_GRADIENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public WheelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 0;
        this.b = 5;
        this.c = 0;
        this.l = false;
        this.p = new WheelRecycle(this);
        this.q = new LinkedList();
        this.r = new LinkedList();
        this.s = new LinkedList();
        this.t = R.drawable.wheel_view_select_bg;
        this.w = "";
        this.x = 50.0f;
        this.y = 80.0f;
        this.z = 0;
        this.A = Color.parseColor("#FF5353");
        this.B = -1;
        this.C = Style.NORMAL;
        this.D = 120.0f;
        this.E = 60.0f;
        this.F = 60.0f;
        this.J = new b();
        this.K = new c();
        u(context);
    }

    private static float A(Context context, float f) {
        return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    private void B() {
        if (z()) {
            i(getWidth(), 1073741824);
            y(getWidth(), getHeight());
        }
    }

    private boolean g(int i, boolean z) {
        View viewT = t(i);
        if (viewT == null) {
            return false;
        }
        if (z) {
            this.m.addView(viewT, 0);
            return true;
        }
        this.m.addView(viewT);
        return true;
    }

    private int getItemHeight() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        LinearLayout linearLayout = this.m;
        if (linearLayout == null || linearLayout.getChildAt(0) == null) {
            return getHeight() / this.b;
        }
        int height = this.m.getChildAt(0).getHeight();
        this.c = height;
        return height;
    }

    private ItemsRange getItemsRange() {
        if (getItemHeight() == 0) {
            return null;
        }
        int i = this.a;
        int iAsin = 1;
        while (getItemHeight() * iAsin < getHeight()) {
            i--;
            iAsin += 2;
        }
        int i2 = this.k;
        if (i2 != 0) {
            if (i2 > 0) {
                i--;
            }
            int itemHeight = i2 / getItemHeight();
            i -= itemHeight;
            iAsin = (int) (((double) (iAsin + 1)) + Math.asin(itemHeight));
        }
        return new ItemsRange(i, iAsin);
    }

    private float getSelectBgHeight() {
        return this.F;
    }

    private float getSelectBgLineWidth() {
        return this.D;
    }

    private float getmUnitCenterXoffset() {
        return this.E;
    }

    private void h() {
        LinearLayout linearLayout = this.m;
        if (linearLayout != null) {
            this.p.recycleItems(linearLayout, this.n, new ItemsRange());
        } else {
            j();
        }
        int i = this.b / 2;
        for (int i2 = this.a + i; i2 >= this.a - i; i2--) {
            if (g(i2, true)) {
                this.n = i2;
            }
        }
    }

    private int i(int i, int i2) {
        v();
        this.m.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.m.measure(View.MeasureSpec.makeMeasureSpec(i, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = this.m.getMeasuredWidth();
        if (i2 != 1073741824) {
            int iMax = Math.max(measuredWidth + 20, getSuggestedMinimumWidth());
            if (i2 != Integer.MIN_VALUE || i >= iMax) {
                i = iMax;
            }
        }
        this.m.measure(View.MeasureSpec.makeMeasureSpec(i - 20, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return i;
    }

    private void j() {
        if (this.m == null) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.m = linearLayout;
            linearLayout.setOrientation(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(int i) {
        this.k += i;
        int itemHeight = getItemHeight();
        int i2 = this.k / itemHeight;
        int i3 = this.a - i2;
        int itemsCount = this.o.getItemsCount();
        int i4 = this.k % itemHeight;
        if (Math.abs(i4) <= itemHeight / 2) {
            i4 = 0;
        }
        if (this.l && itemsCount > 0) {
            if (i4 > 0) {
                i3--;
                i2++;
            } else if (i4 < 0) {
                i3++;
                i2--;
            }
            while (i3 < 0) {
                i3 += itemsCount;
            }
            i3 %= itemsCount;
        } else if (i3 < 0) {
            i2 = this.a;
            i3 = 0;
        } else if (i3 >= itemsCount) {
            i2 = (this.a - itemsCount) + 1;
            i3 = itemsCount - 1;
        } else if (i3 > 0 && i4 > 0) {
            i3--;
            i2++;
        } else if (i3 < itemsCount - 1 && i4 < 0) {
            i3++;
            i2--;
        }
        int i5 = this.k;
        if (i3 != this.a) {
            setCurrentItem(i3, false);
        } else {
            invalidate();
        }
        int i6 = i5 - (i2 * itemHeight);
        this.k = i6;
        if (i6 > getHeight()) {
            this.k = (this.k % getHeight()) + getHeight();
        }
    }

    private static float l(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    private void m(Canvas canvas) {
        this.v.setColor(this.z);
        int height = getHeight() / 2;
        int itemHeight = (int) (((double) (getItemHeight() / 2)) * 1.2d);
        canvas.drawRect(0.0f, height - itemHeight, getWidth(), height + itemHeight, this.v);
    }

    private void n(Canvas canvas) {
        int height = getHeight() >> 1;
        int iRound = Math.round(l(getContext(), 52.0f)) >> 1;
        this.d.setBounds(0, height - iRound, getWidth(), height + iRound);
        this.d.draw(canvas);
    }

    private void o(Canvas canvas) {
        canvas.save();
        canvas.translate(10.0f, (-(((this.a - this.n) * getItemHeight()) + ((getItemHeight() - getHeight()) / 2))) + this.k);
        this.m.draw(canvas);
        canvas.restore();
    }

    private void p(Canvas canvas) {
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int i = d.a[this.C.ordinal()];
        if (i == 1) {
            Paint.FontMetrics fontMetrics = this.u.getFontMetrics();
            int iL = (int) l(getContext(), 130.0f);
            int iL2 = (int) l(getContext(), 52.0f);
            Drawable drawable = getContext().getResources().getDrawable(R.drawable.wheel_view_select_bg);
            int i2 = iL / 2;
            int i3 = iL2 / 2;
            drawable.setBounds(width - i2, height - i3, i2 + width, i3 + height);
            drawable.draw(canvas);
            String str = this.w;
            float f = width + (iL / 2.0f) + this.y;
            float f2 = iL2;
            float f3 = f2 - fontMetrics.bottom;
            float f4 = fontMetrics.top;
            canvas.drawText(str, f, ((((f3 + f4) / 2.0f) - f4) + height) - (f2 / 2.0f), this.u);
            return;
        }
        if (i != 2 && i != 3) {
            if (i != 4) {
                return;
            }
            this.v.setStrokeWidth(l(getContext(), 1.0f));
            this.v.setShader(new LinearGradient(0.0f, 2.0f, getMeasuredWidth(), 2.0f, this.G, this.H, Shader.TileMode.CLAMP));
            float f5 = height;
            canvas.drawLine(0.0f, f5 - l(getContext(), getSelectBgHeight() / 2.0f), getWidth(), f5 - l(getContext(), getSelectBgHeight() / 2.0f), this.v);
            canvas.drawLine(0.0f, f5 + l(getContext(), getSelectBgHeight() / 2.0f), getWidth(), f5 + l(getContext(), getSelectBgHeight() / 2.0f), this.v);
            return;
        }
        int color = this.v.getColor();
        this.v.setStrokeWidth(l(getContext(), 1.0f));
        this.v.setColor(this.A);
        if (this.C == Style.LINE_VARIATION) {
            float f6 = height;
            canvas.drawLine(0.0f, f6 - l(getContext(), getSelectBgHeight() / 2.0f), getWidth(), f6 - l(getContext(), getSelectBgHeight() / 2.0f), this.v);
            canvas.drawLine(0.0f, f6 + l(getContext(), getSelectBgHeight() / 2.0f), getWidth(), f6 + l(getContext(), getSelectBgHeight() / 2.0f), this.v);
        } else {
            float f7 = width;
            float f8 = height;
            canvas.drawLine(f7 - l(getContext(), getSelectBgLineWidth() / 2.0f), f8 - l(getContext(), getSelectBgHeight() / 2.0f), f7 + l(getContext(), getSelectBgLineWidth() / 2.0f), f8 - l(getContext(), getSelectBgHeight() / 2.0f), this.v);
            canvas.drawLine(f7 - l(getContext(), getSelectBgLineWidth() / 2.0f), f8 + l(getContext(), getSelectBgHeight() / 2.0f), f7 + l(getContext(), getSelectBgLineWidth() / 2.0f), f8 + l(getContext(), getSelectBgHeight() / 2.0f), this.v);
        }
        this.v.setColor(color);
        this.u.setTextAlign(Paint.Align.RIGHT);
        int i4 = this.B;
        if (i4 != -1) {
            this.u.setColor(i4);
        } else {
            this.u.setColor(-16777216);
        }
        this.u.setFakeBoldText(true);
        Paint.FontMetrics fontMetrics2 = this.u.getFontMetrics();
        float fMeasureText = this.u.measureText(this.w);
        String str2 = this.w;
        float fMin = Math.min(width + l(getContext(), getmUnitCenterXoffset()) + (fMeasureText / 2.0f), getWidth());
        float f9 = 0;
        float f10 = f9 - fontMetrics2.bottom;
        float f11 = fontMetrics2.top;
        canvas.drawText(str2, fMin, ((((f10 + f11) / 2.0f) - f11) + height) - (f9 / 2.0f), this.u);
    }

    private void q(Canvas canvas) {
        int itemHeight = (int) (((double) getItemHeight()) * 1.5d);
        this.g.setBounds(0, 0, getWidth(), itemHeight);
        this.g.draw(canvas);
        this.h.setBounds(0, getHeight() - itemHeight, getWidth(), getHeight());
        this.h.draw(canvas);
    }

    private void r(Canvas canvas) {
        int width = getWidth() >> 1;
        int height = getHeight() >> 1;
        float fMeasureText = this.u.measureText(this.w);
        float f = width;
        canvas.drawText(this.w, w() ? (f - this.y) - fMeasureText : f + this.y + fMeasureText, height - this.x, this.u);
    }

    private int s(LinearLayout linearLayout) {
        if (linearLayout != null && linearLayout.getChildAt(0) != null) {
            this.c = linearLayout.getChildAt(0).getMeasuredHeight();
        }
        int i = this.c;
        return Math.max((this.b * i) - ((i * 10) / 50), getSuggestedMinimumHeight());
    }

    private void setUnitVisibility(boolean z) {
        this.I = z;
    }

    private View t(int i) {
        WheelViewAdapter wheelViewAdapter = this.o;
        if (wheelViewAdapter == null || wheelViewAdapter.getItemsCount() == 0) {
            return null;
        }
        int itemsCount = this.o.getItemsCount();
        if (!x(i)) {
            return this.o.getEmptyItem(this.p.getEmptyItem(), this.m);
        }
        while (i < 0) {
            i += itemsCount;
        }
        return this.o.getItem(i % itemsCount, this.p.getItem(), this.m);
    }

    private void u(Context context) {
        this.i = new WheelScroller(getContext(), this.J);
        this.u = new Paint();
        this.v = new Paint();
        addChangingListener(new a());
    }

    private void v() {
        if (this.d == null) {
            this.d = getContext().getResources().getDrawable(this.t);
        }
        if (this.g == null) {
            this.g = new GradientDrawable();
        }
        if (this.h == null) {
            this.h = new GradientDrawable();
        }
    }

    private boolean w() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    private boolean x(int i) {
        WheelViewAdapter wheelViewAdapter = this.o;
        return wheelViewAdapter != null && wheelViewAdapter.getItemsCount() > 0 && (this.l || (i >= 0 && i < this.o.getItemsCount()));
    }

    private void y(int i, int i2) {
        this.m.layout(0, 0, i - 20, i2);
    }

    private boolean z() {
        boolean z;
        ItemsRange itemsRange = getItemsRange();
        LinearLayout linearLayout = this.m;
        if (linearLayout != null) {
            int iRecycleItems = this.p.recycleItems(linearLayout, this.n, itemsRange);
            z = this.n != iRecycleItems;
            this.n = iRecycleItems;
        } else {
            j();
            z = true;
        }
        if (!z) {
            z = (this.n == itemsRange.getFirst() && this.m.getChildCount() == itemsRange.getCount()) ? false : true;
        }
        if (this.n <= itemsRange.getFirst() || this.n > itemsRange.getLast()) {
            this.n = itemsRange.getFirst();
        } else {
            for (int i = this.n - 1; i >= itemsRange.getFirst() && g(i, true); i--) {
                this.n = i;
            }
        }
        int i2 = this.n;
        for (int childCount = this.m.getChildCount(); childCount < itemsRange.getCount(); childCount++) {
            if (!g(this.n + childCount, false) && this.m.getChildCount() == 0) {
                i2++;
            }
        }
        this.n = i2;
        return z;
    }

    public void addChangingListener(OnWheelChangedListener onWheelChangedListener) {
        this.q.add(onWheelChangedListener);
    }

    public void addClickingListener(OnWheelClickedListener onWheelClickedListener) {
        this.s.add(onWheelClickedListener);
    }

    public void addScrollingListener(OnWheelScrollListener onWheelScrollListener) {
        this.r.add(onWheelScrollListener);
    }

    public int getCurrentItem() {
        WheelViewAdapter wheelViewAdapter = this.o;
        return (wheelViewAdapter == null || !wheelViewAdapter.isNeedLoop()) ? this.a : this.a % this.o.getBASE_BUNDLE();
    }

    public int getRealCurrentItem() {
        return this.a;
    }

    public WheelViewAdapter getViewAdapter() {
        return this.o;
    }

    public int getVisibleItems() {
        return this.b;
    }

    public void invalidateWheel(boolean z) {
        if (z) {
            this.p.clearAll();
            LinearLayout linearLayout = this.m;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            this.k = 0;
        } else {
            LinearLayout linearLayout2 = this.m;
            if (linearLayout2 != null) {
                this.p.recycleItems(linearLayout2, this.n, new ItemsRange());
            }
        }
        Log.i("Height", "invalidateWheel");
        invalidate();
    }

    public boolean isCyclic() {
        return this.l;
    }

    public void notifyChangingListeners(int i, int i2) {
        Iterator<OnWheelChangedListener> it2 = this.q.iterator();
        while (it2.hasNext()) {
            it2.next().onChanged(this, i, i2);
        }
    }

    public void notifyClickListenersAboutClick(int i) {
        Iterator<OnWheelClickedListener> it2 = this.s.iterator();
        while (it2.hasNext()) {
            it2.next().onItemClicked(this, i);
        }
    }

    public void notifyScrollingListenersAboutEnd() {
        Iterator<OnWheelScrollListener> it2 = this.r.iterator();
        while (it2.hasNext()) {
            it2.next().onScrollingFinished(this);
        }
    }

    public void notifyScrollingListenersAboutStart() {
        Iterator<OnWheelScrollListener> it2 = this.r.iterator();
        while (it2.hasNext()) {
            it2.next().onScrollingStarted(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        WheelViewAdapter wheelViewAdapter = this.o;
        if (wheelViewAdapter == null || wheelViewAdapter.getItemsCount() <= 0) {
            return;
        }
        if (this.C != Style.NORMAL) {
            B();
            p(canvas);
            o(canvas);
            return;
        }
        B();
        m(canvas);
        n(canvas);
        o(canvas);
        if (this.I) {
            r(canvas);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        y(i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        Log.i("Height", "onMeasure");
        h();
        int i3 = i(size, mode);
        if (mode2 != 1073741824) {
            int iS = s(this.m);
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(iS, size2) : iS;
        }
        setMeasuredDimension(i3, size2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || getViewAdapter() == null) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2 && getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (!this.j) {
            int y = ((int) motionEvent.getY()) - (getHeight() / 2);
            int itemHeight = (y > 0 ? y + (getItemHeight() / 2) : y - (getItemHeight() / 2)) / getItemHeight();
            if (itemHeight != 0 && x(this.a + itemHeight)) {
                notifyClickListenersAboutClick(this.a + itemHeight);
            }
        }
        return this.i.onTouchEvent(motionEvent);
    }

    public void removeChangingListener(OnWheelChangedListener onWheelChangedListener) {
        this.q.remove(onWheelChangedListener);
    }

    public void removeClickingListener(OnWheelClickedListener onWheelClickedListener) {
        this.s.remove(onWheelClickedListener);
    }

    public void removeScrollingListener(OnWheelScrollListener onWheelScrollListener) {
        this.r.remove(onWheelScrollListener);
    }

    public void scroll(int i, int i2) {
        this.i.scroll((i * getItemHeight()) - this.k, i2);
    }

    public WheelView setCenterBgColor(int i) {
        this.z = i;
        invalidate();
        return this;
    }

    public WheelView setCenterDrawable(int i) {
        this.t = i;
        if (this.d == null) {
            this.d = getContext().getResources().getDrawable(this.t);
        }
        invalidate();
        return this;
    }

    public WheelView setCenterStyle(String str, float f) {
        return setCenterStyle(str, Constant.WHEEL_CENTER_UNIT_TEXT_COLOR, 11, f, -2.0f);
    }

    public WheelView setCenterUnitStr(String str) {
        this.w = str;
        return this;
    }

    public void setCurrentItem(int i, boolean z) {
        int iMin;
        WheelViewAdapter wheelViewAdapter = this.o;
        if (wheelViewAdapter == null || wheelViewAdapter.getItemsCount() == 0) {
            return;
        }
        int itemsCount = this.o.getItemsCount();
        if (i < 0 || i >= itemsCount) {
            if (!this.l) {
                return;
            }
            while (i < 0) {
                i += itemsCount;
            }
            i %= itemsCount;
        }
        int i2 = this.a;
        if (i != i2) {
            if (!z) {
                this.k = 0;
                this.a = i;
                notifyChangingListeners(i2, i);
                invalidate();
                return;
            }
            int i3 = i - i2;
            if (this.l && (iMin = (itemsCount + Math.min(i, i2)) - Math.max(i, this.a)) < Math.abs(i3)) {
                i3 = i3 < 0 ? iMin : -iMin;
            }
            scroll(i3, 0);
        }
    }

    public WheelView setCurrentItemLooped(int i) {
        return setCurrentItemLooped(i, false);
    }

    public void setCyclic(boolean z) {
        this.l = z;
        invalidateWheel(false);
    }

    public void setInterpolator(Interpolator interpolator) {
        this.i.setInterpolator(interpolator);
    }

    public void setLineColor(int i) {
        this.A = i;
    }

    public void setLinearGradient(@NonNull @ColorInt int[] iArr, @Nullable float[] fArr) {
        this.G = iArr;
        this.H = fArr;
    }

    public WheelView setSelectBgHeight(float f) {
        this.F = f;
        return this;
    }

    public WheelView setSelectBgLineWidth(float f) {
        this.D = f;
        return this;
    }

    public WheelView setSelectedBgDrawable(int i, Rect rect) {
        this.e = getContext().getResources().getDrawable(i);
        this.f = rect;
        return this;
    }

    public WheelView setStyle(Style style) {
        this.C = style;
        return this;
    }

    public WheelView setTextBold(boolean z) {
        this.u.setFakeBoldText(z);
        return this;
    }

    public void setUnitTextColor(int i) {
        this.B = i;
    }

    public WheelView setViewAdapter(WheelViewAdapter wheelViewAdapter) {
        WheelViewAdapter wheelViewAdapter2 = this.o;
        if (wheelViewAdapter2 != null) {
            wheelViewAdapter2.unregisterDataSetObserver(this.K);
        }
        this.o = wheelViewAdapter;
        if (wheelViewAdapter != null) {
            wheelViewAdapter.registerDataSetObserver(this.K);
        }
        invalidateWheel(true);
        return this;
    }

    public WheelView setVisibleItems(int i) {
        this.b = i;
        return this;
    }

    public WheelView setmUnitCenterXoffset(float f) {
        this.E = f;
        return this;
    }

    public void stopScrolling() {
        this.i.stopScrolling();
    }

    public WheelView setCenterStyle(String str, int i, float f) {
        return setCenterStyle(str, i, 11, f, -2.0f);
    }

    public WheelView setCurrentItemLooped(int i, boolean z) {
        if (this.o.isNeedLoop()) {
            Log.i(P, "setCurrentItemLooped: " + i);
            i += this.o.getInitLoopBase();
            Log.i(P, ", after add loopbase:" + i);
        }
        setCurrentItem(i, z);
        return this;
    }

    public WheelView setCenterStyle(String str, int i, int i2, float f, float f2) {
        return setCenterStyle(str, i, 0, i2, f, f2);
    }

    public WheelView setCenterStyle(String str, int i, int i2, int i3, float f, float f2) {
        this.z = i2;
        this.w = str;
        this.y = TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
        this.x = TypedValue.applyDimension(1, f2, getResources().getDisplayMetrics());
        this.u.setTextSize(TypedValue.applyDimension(1, i3, getResources().getDisplayMetrics()));
        this.u.setFakeBoldText(false);
        this.u.setAntiAlias(true);
        this.u.setColor(getResources().getColor(i));
        return this;
    }

    public WheelView setCurrentItem(int i) {
        setCurrentItem(i, false);
        return this;
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.b = 5;
        this.c = 0;
        this.l = false;
        this.p = new WheelRecycle(this);
        this.q = new LinkedList();
        this.r = new LinkedList();
        this.s = new LinkedList();
        this.t = R.drawable.wheel_view_select_bg;
        this.w = "";
        this.x = 50.0f;
        this.y = 80.0f;
        this.z = 0;
        this.A = Color.parseColor("#FF5353");
        this.B = -1;
        this.C = Style.NORMAL;
        this.D = 120.0f;
        this.E = 60.0f;
        this.F = 60.0f;
        this.J = new b();
        this.K = new c();
        u(context);
    }

    public WheelView(Context context) {
        super(context);
        this.a = 0;
        this.b = 5;
        this.c = 0;
        this.l = false;
        this.p = new WheelRecycle(this);
        this.q = new LinkedList();
        this.r = new LinkedList();
        this.s = new LinkedList();
        this.t = R.drawable.wheel_view_select_bg;
        this.w = "";
        this.x = 50.0f;
        this.y = 80.0f;
        this.z = 0;
        this.A = Color.parseColor("#FF5353");
        this.B = -1;
        this.C = Style.NORMAL;
        this.D = 120.0f;
        this.E = 60.0f;
        this.F = 60.0f;
        this.J = new b();
        this.K = new c();
        u(context);
    }
}
