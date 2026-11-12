package androidx.appcompat.widget;

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
import com.garmin.android.apps.connectmobile.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class d0 extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f5073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f5079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5080h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f5081i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5082j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p7.d f5083k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f5084l;

    public static class a {
        private a() {
        }

        public static void a(View view2, float f14, float f15) {
            view2.drawableHotspotChanged(f14, f15);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Method f5085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f5086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Method f5087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final boolean f5088d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f5085a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f5086b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f5087c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f5088d = true;
            } catch (NoSuchMethodException e4) {
                e4.printStackTrace();
            }
        }

        private b() {
        }
    }

    public static class c {
        private c() {
        }

        public static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void b(AbsListView absListView, boolean z14) {
            absListView.setSelectedChildViewEnabled(z14);
        }
    }

    public static class d extends k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f5089a;

        public d(Drawable drawable) {
            super(drawable);
            this.f5089a = true;
        }

        @Override // k.a, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.f5089a) {
                super.draw(canvas);
            }
        }

        @Override // k.a, android.graphics.drawable.Drawable
        public final void setHotspot(float f14, float f15) {
            if (this.f5089a) {
                super.setHotspot(f14, f15);
            }
        }

        @Override // k.a, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i14, int i15, int i16, int i17) {
            if (this.f5089a) {
                super.setHotspotBounds(i14, i15, i16, i17);
            }
        }

        @Override // k.a, android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.f5089a) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // k.a, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z14, boolean z15) {
            if (this.f5089a) {
                return super.setVisible(z14, z15);
            }
            return false;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Field f5090a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                e4.printStackTrace();
            }
            f5090a = declaredField;
        }

        private e() {
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d0 d0Var = d0.this;
            d0Var.f5084l = null;
            d0Var.drawableStateChanged();
        }
    }

    public d0(Context context, boolean z14) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f5073a = new Rect();
        this.f5074b = 0;
        this.f5075c = 0;
        this.f5076d = 0;
        this.f5077e = 0;
        this.f5081i = z14;
        setCacheColorHint(0);
    }

    private void setSelectorEnabled(boolean z14) {
        d dVar = this.f5079g;
        if (dVar != null) {
            dVar.f5089a = z14;
        }
    }

    public final int a(int i14, int i15) {
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
        int i16 = 0;
        View view2 = null;
        for (int i17 = 0; i17 < count; i17++) {
            int itemViewType = adapter.getItemViewType(i17);
            if (itemViewType != i16) {
                view2 = null;
                i16 = itemViewType;
            }
            view2 = adapter.getView(i17, view2, this);
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view2.setLayoutParams(layoutParams);
            }
            int i18 = layoutParams.height;
            view2.measure(i14, i18 > 0 ? View.MeasureSpec.makeMeasureSpec(i18, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view2.forceLayout();
            if (i17 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view2.getMeasuredHeight();
            if (measuredHeight >= i15) {
                return i15;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0147  */
    /* JADX WARN: Code duplicated, block: B:80:0x015c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0163 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0165  */
    /* JADX WARN: Code duplicated, block: B:86:0x0177  */
    /* JADX WARN: Code duplicated, block: B:87:0x0179  */
    /* JADX WARN: Code duplicated, block: B:89:0x017d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    public final boolean b(MotionEvent motionEvent, int i14) {
        boolean z14;
        boolean zA;
        View childAt;
        View childAt2;
        p7.d dVar;
        int actionMasked = motionEvent.getActionMasked();
        boolean z15 = true;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z14 = true;
            } else if (actionMasked != 3) {
                z14 = true;
                z15 = false;
            } else {
                z14 = false;
                z15 = false;
            }
            if (z14 || z15) {
                this.f5082j = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f5078f - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            dVar = this.f5083k;
            if (z14) {
                if (dVar == null) {
                    this.f5083k = new p7.d(this);
                }
                p7.d dVar2 = this.f5083k;
                boolean z16 = dVar2.f136281p;
                dVar2.f136281p = true;
                dVar2.onTouch(this, motionEvent);
            } else if (dVar != null) {
                if (dVar.f136281p) {
                    dVar.e();
                }
                dVar.f136281p = false;
            }
            return z14;
        }
        z14 = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i14);
        if (iFindPointerIndex < 0) {
            z14 = false;
            z15 = false;
        } else {
            int x14 = (int) motionEvent.getX(iFindPointerIndex);
            int y14 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x14, y14);
            if (iPointToPosition != -1) {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f14 = x14;
                float f15 = y14;
                this.f5082j = true;
                a.a(this, f14, f15);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i15 = this.f5078f;
                if (i15 != -1 && (childAt = getChildAt(i15 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f5078f = iPointToPosition;
                a.a(childAt3, f14 - childAt3.getLeft(), f15 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z17 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z17) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f5073a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f5074b;
                rect.top -= this.f5075c;
                rect.right += this.f5076d;
                rect.bottom += this.f5077e;
                if (Build.VERSION.SDK_INT >= 33) {
                    zA = c.a(this);
                } else {
                    Field field = e.f5090a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e4) {
                            e4.printStackTrace();
                            zA = false;
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z18 = !zA;
                    if (Build.VERSION.SDK_INT >= 33) {
                        c.b(this, z18);
                    } else {
                        Field field2 = e.f5090a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z18));
                            } catch (IllegalAccessException e14) {
                                e14.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z17) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f14, f15);
                }
                setSelectorEnabled(false);
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z15 = false;
                z14 = true;
            }
        }
        if (z14) {
            this.f5082j = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f5078f - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f5082j = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f5078f - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        dVar = this.f5083k;
        if (z14) {
            if (dVar == null) {
                this.f5083k = new p7.d(this);
            }
            p7.d dVar3 = this.f5083k;
            boolean z19 = dVar3.f136281p;
            dVar3.f136281p = true;
            dVar3.onTouch(this, motionEvent);
        } else if (dVar != null) {
            if (dVar.f136281p) {
                dVar.e();
            }
            dVar.f136281p = false;
        }
        return z14;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f5073a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f5084l != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        Drawable selector = getSelector();
        if (selector != null && this.f5082j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f5081i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f5081i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f5081i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f5081i && this.f5080h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f5084l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f5084l == null) {
            f fVar = new f();
            this.f5084l = fVar;
            d0.this.post(fVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (Build.VERSION.SDK_INT < 30 || !b.f5088d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        b.f5085a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        b.f5086b.invoke(this, Integer.valueOf(iPointToPosition));
                        b.f5087c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e4) {
                        e4.printStackTrace();
                    } catch (InvocationTargetException e14) {
                        e14.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f5082j && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f5078f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f5084l;
        if (fVar != null) {
            d0 d0Var = d0.this;
            d0Var.f5084l = null;
            d0Var.removeCallbacks(fVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z14) {
        this.f5080h = z14;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f5079g = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f5074b = rect.left;
        this.f5075c = rect.top;
        this.f5076d = rect.right;
        this.f5077e = rect.bottom;
    }
}
