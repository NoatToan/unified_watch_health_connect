package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class b67 extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f3849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3850b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Field g;
    public c h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3851k;
    public lwq l;
    public jhe m;
    public d n;

    @RequiresApi(21)
    public static class a {
        public static void a(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    @RequiresApi(30)
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Method f3852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Method f3853b;
        public static Method c;
        public static boolean d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f3852a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f3853b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                d = true;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        public static boolean a() {
            return d;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public static void b(b67 b67Var, int i, View view) {
            try {
                f3852a.invoke(b67Var, Integer.valueOf(i), view, Boolean.FALSE, -1, -1);
                f3853b.invoke(b67Var, Integer.valueOf(i));
                c.invoke(b67Var, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static class c extends d57 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f3854b;

        public c(Drawable drawable) {
            super(drawable);
            this.f3854b = true;
        }

        public void b(boolean z) {
            this.f3854b = z;
        }

        @Override // defpackage.d57, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f3854b) {
                super.draw(canvas);
            }
        }

        @Override // defpackage.d57, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f3854b) {
                super.setHotspot(f, f2);
            }
        }

        @Override // defpackage.d57, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f3854b) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // defpackage.d57, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f3854b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // defpackage.d57, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f3854b) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    public class d implements Runnable {
        public d() {
        }

        public void a() {
            b67 b67Var = b67.this;
            b67Var.n = null;
            b67Var.removeCallbacks(this);
        }

        public void b() {
            b67.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            b67 b67Var = b67.this;
            b67Var.n = null;
            b67Var.drawableStateChanged();
        }
    }

    public b67(Context context, boolean z) {
        super(context, null, qii.D);
        this.f3849a = new Rect();
        this.f3850b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.j = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z) {
        c cVar = this.h;
        if (cVar != null) {
            cVar.b(z);
        }
    }

    public final void a() {
        this.f3851k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        lwq lwqVar = this.l;
        if (lwqVar != null) {
            lwqVar.c();
            this.l = null;
        }
    }

    public final void b(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    public final void c(Canvas canvas) {
        Drawable selector;
        if (this.f3849a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f3849a);
        selector.draw(canvas);
    }

    public int d(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        View view = null;
        while (i6 < count) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i9 = layoutParams.height;
            view.measure(i, i9 > 0 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i6 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i4) {
                return (i5 < 0 || i6 <= i5 || i8 <= 0 || measuredHeight == i4) ? i4 : i8;
            }
            if (i5 >= 0 && i6 >= i5) {
                i8 = measuredHeight;
            }
            i6++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.n != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        k();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    public boolean e(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        jhe jheVar;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z = true;
                    z2 = false;
                } else {
                    z2 = false;
                    z = false;
                }
                if (z || z2) {
                    a();
                }
                if (z) {
                    if (this.m == null) {
                        this.m = new jhe(this);
                    }
                    this.m.m(true);
                    this.m.onTouch(this, motionEvent);
                } else {
                    jheVar = this.m;
                    if (jheVar != null) {
                        jheVar.m(false);
                    }
                }
                return z;
            }
            z = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z2 = false;
            z = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition == -1) {
                z2 = true;
            } else {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                i(childAt, iPointToPosition, x, y);
                if (actionMasked == 1) {
                    b(childAt, iPointToPosition);
                }
                z = true;
                z2 = false;
            }
        }
        if (z) {
            a();
        } else {
            a();
        }
        if (z) {
            if (this.m == null) {
                this.m = new jhe(this);
            }
            this.m.m(true);
            this.m.onTouch(this, motionEvent);
        } else {
            jheVar = this.m;
            if (jheVar != null) {
                jheVar.m(false);
            }
        }
        return z;
    }

    public final void f(int i, View view) {
        Rect rect = this.f3849a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f3850b;
        rect.top -= this.c;
        rect.right += this.d;
        rect.bottom += this.e;
        try {
            boolean z = this.g.getBoolean(this);
            if (view.isEnabled() != z) {
                this.g.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public final void g(int i, View view) {
        Drawable selector = getSelector();
        boolean z = (selector == null || i == -1) ? false : true;
        if (z) {
            selector.setVisible(false, false);
        }
        f(i, view);
        if (z) {
            Rect rect = this.f3849a;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            k47.k(selector, fExactCenterX, fExactCenterY);
        }
    }

    public final void h(int i, View view, float f, float f2) {
        g(i, view);
        Drawable selector = getSelector();
        if (selector == null || i == -1) {
            return;
        }
        k47.k(selector, f, f2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.j || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.j || super.hasWindowFocus();
    }

    public final void i(View view, int i, float f, float f2) {
        View childAt;
        this.f3851k = true;
        a.a(this, f, f2);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f;
        if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f = i;
        a.a(view, f - view.getLeft(), f2 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.j || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.j && this.i) || super.isInTouchMode();
    }

    public final boolean j() {
        return this.f3851k;
    }

    public final void k() {
        Drawable selector = getSelector();
        if (selector != null && j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.n = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.n == null) {
            d dVar = new d();
            this.n = dVar;
            dVar.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !b.a()) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        b.b(this, iPointToPosition, childAt);
                    }
                }
                k();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        d dVar = this.n;
        if (dVar != null) {
            dVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.i = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        c cVar = drawable != null ? new c(drawable) : null;
        this.h = cVar;
        super.setSelector(cVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f3850b = rect.left;
        this.c = rect.top;
        this.d = rect.right;
        this.e = rect.bottom;
    }
}
