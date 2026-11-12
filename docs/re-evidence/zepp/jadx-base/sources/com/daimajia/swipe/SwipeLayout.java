package com.daimajia.swipe;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class SwipeLayout extends FrameLayout {
    private static final int A = 2;
    private static final int B = 4;
    private static final int C = 8;
    private static final DragEdge D = DragEdge.Right;

    @Deprecated
    public static final int EMPTY_LAYOUT = -1;
    private static final int z = 1;
    private int a;
    private DragEdge b;
    private ViewDragHelper c;
    private int d;
    private LinkedHashMap<DragEdge, View> e;
    private ShowMode f;
    private float[] g;
    private List<SwipeListener> h;
    private List<SwipeDenier> i;
    private Map<View, ArrayList<OnRevealListener>> j;
    private Map<View, Boolean> k;
    private DoubleClickListener l;
    private boolean m;
    private boolean[] n;
    private boolean o;
    private ViewDragHelper.Callback p;
    private int q;
    private List<OnLayout> r;
    private boolean s;
    private float t;
    private float u;
    public View.OnClickListener v;
    public View.OnLongClickListener w;
    private Rect x;
    private GestureDetector y;

    public interface DoubleClickListener {
        void onDoubleClick(SwipeLayout swipeLayout, boolean z);
    }

    public enum DragEdge {
        Left,
        Top,
        Right,
        Bottom
    }

    public interface OnLayout {
        void onLayout(SwipeLayout swipeLayout);
    }

    public interface OnRevealListener {
        void onReveal(View view, DragEdge dragEdge, float f, int i);
    }

    public enum ShowMode {
        LayDown,
        PullOut
    }

    public enum Status {
        Middle,
        Open,
        Close
    }

    public interface SwipeDenier {
        boolean shouldDenySwipe(MotionEvent motionEvent);
    }

    public interface SwipeListener {
        void onClose(SwipeLayout swipeLayout);

        void onHandRelease(SwipeLayout swipeLayout, float f, float f2);

        void onOpen(SwipeLayout swipeLayout);

        void onStartClose(SwipeLayout swipeLayout);

        void onStartOpen(SwipeLayout swipeLayout);

        void onUpdate(SwipeLayout swipeLayout, int i, int i2);
    }

    public class a extends ViewDragHelper.Callback {
        public boolean a = true;

        public a() {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            if (view == SwipeLayout.this.getSurfaceView()) {
                int i3 = d.a[SwipeLayout.this.b.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    return SwipeLayout.this.getPaddingLeft();
                }
                if (i3 != 3) {
                    if (i3 == 4) {
                        if (i > SwipeLayout.this.getPaddingLeft()) {
                            return SwipeLayout.this.getPaddingLeft();
                        }
                        if (i < SwipeLayout.this.getPaddingLeft() - SwipeLayout.this.d) {
                            return SwipeLayout.this.getPaddingLeft() - SwipeLayout.this.d;
                        }
                    }
                } else {
                    if (i < SwipeLayout.this.getPaddingLeft()) {
                        return SwipeLayout.this.getPaddingLeft();
                    }
                    if (i > SwipeLayout.this.getPaddingLeft() + SwipeLayout.this.d) {
                        return SwipeLayout.this.getPaddingLeft() + SwipeLayout.this.d;
                    }
                }
            } else if (SwipeLayout.this.getCurrentBottomView() == view) {
                int i4 = d.a[SwipeLayout.this.b.ordinal()];
                if (i4 == 1 || i4 == 2) {
                    return SwipeLayout.this.getPaddingLeft();
                }
                if (i4 != 3) {
                    if (i4 == 4 && SwipeLayout.this.f == ShowMode.PullOut && i < SwipeLayout.this.getMeasuredWidth() - SwipeLayout.this.d) {
                        return SwipeLayout.this.getMeasuredWidth() - SwipeLayout.this.d;
                    }
                } else if (SwipeLayout.this.f == ShowMode.PullOut && i > SwipeLayout.this.getPaddingLeft()) {
                    return SwipeLayout.this.getPaddingLeft();
                }
            }
            return i;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i, int i2) {
            if (view == SwipeLayout.this.getSurfaceView()) {
                int i3 = d.a[SwipeLayout.this.b.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3 || i3 == 4) {
                            return SwipeLayout.this.getPaddingTop();
                        }
                    } else {
                        if (i < SwipeLayout.this.getPaddingTop() - SwipeLayout.this.d) {
                            return SwipeLayout.this.getPaddingTop() - SwipeLayout.this.d;
                        }
                        if (i > SwipeLayout.this.getPaddingTop()) {
                            return SwipeLayout.this.getPaddingTop();
                        }
                    }
                } else {
                    if (i < SwipeLayout.this.getPaddingTop()) {
                        return SwipeLayout.this.getPaddingTop();
                    }
                    if (i > SwipeLayout.this.getPaddingTop() + SwipeLayout.this.d) {
                        return SwipeLayout.this.getPaddingTop() + SwipeLayout.this.d;
                    }
                }
            } else {
                View surfaceView = SwipeLayout.this.getSurfaceView();
                int top = surfaceView == null ? 0 : surfaceView.getTop();
                int i4 = d.a[SwipeLayout.this.b.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 == 3 || i4 == 4) {
                            return SwipeLayout.this.getPaddingTop();
                        }
                    } else if (SwipeLayout.this.f != ShowMode.PullOut) {
                        int i5 = top + i2;
                        if (i5 >= SwipeLayout.this.getPaddingTop()) {
                            return SwipeLayout.this.getPaddingTop();
                        }
                        if (i5 <= SwipeLayout.this.getPaddingTop() - SwipeLayout.this.d) {
                            return SwipeLayout.this.getPaddingTop() - SwipeLayout.this.d;
                        }
                    } else if (i < SwipeLayout.this.getMeasuredHeight() - SwipeLayout.this.d) {
                        return SwipeLayout.this.getMeasuredHeight() - SwipeLayout.this.d;
                    }
                } else if (SwipeLayout.this.f != ShowMode.PullOut) {
                    int i6 = top + i2;
                    if (i6 < SwipeLayout.this.getPaddingTop()) {
                        return SwipeLayout.this.getPaddingTop();
                    }
                    if (i6 > SwipeLayout.this.getPaddingTop() + SwipeLayout.this.d) {
                        return SwipeLayout.this.getPaddingTop() + SwipeLayout.this.d;
                    }
                } else if (i > SwipeLayout.this.getPaddingTop()) {
                    return SwipeLayout.this.getPaddingTop();
                }
            }
            return i;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(View view) {
            return SwipeLayout.this.d;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewVerticalDragRange(View view) {
            return SwipeLayout.this.d;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            View surfaceView = SwipeLayout.this.getSurfaceView();
            if (surfaceView == null) {
                return;
            }
            View currentBottomView = SwipeLayout.this.getCurrentBottomView();
            int left = surfaceView.getLeft();
            int right = surfaceView.getRight();
            int top = surfaceView.getTop();
            int bottom = surfaceView.getBottom();
            if (view == surfaceView) {
                if (SwipeLayout.this.f == ShowMode.PullOut && currentBottomView != null) {
                    if (SwipeLayout.this.b == DragEdge.Left || SwipeLayout.this.b == DragEdge.Right) {
                        currentBottomView.offsetLeftAndRight(i3);
                    } else {
                        currentBottomView.offsetTopAndBottom(i4);
                    }
                }
            } else if (SwipeLayout.this.getBottomViews().contains(view)) {
                if (SwipeLayout.this.f == ShowMode.PullOut) {
                    surfaceView.offsetLeftAndRight(i3);
                    surfaceView.offsetTopAndBottom(i4);
                } else {
                    SwipeLayout swipeLayout = SwipeLayout.this;
                    Rect rectL = swipeLayout.l(swipeLayout.b);
                    if (currentBottomView != null) {
                        currentBottomView.layout(rectL.left, rectL.top, rectL.right, rectL.bottom);
                    }
                    int left2 = surfaceView.getLeft() + i3;
                    int top2 = surfaceView.getTop() + i4;
                    if (SwipeLayout.this.b == DragEdge.Left && left2 < SwipeLayout.this.getPaddingLeft()) {
                        left2 = SwipeLayout.this.getPaddingLeft();
                    } else if (SwipeLayout.this.b == DragEdge.Right && left2 > SwipeLayout.this.getPaddingLeft()) {
                        left2 = SwipeLayout.this.getPaddingLeft();
                    } else if (SwipeLayout.this.b == DragEdge.Top && top2 < SwipeLayout.this.getPaddingTop()) {
                        top2 = SwipeLayout.this.getPaddingTop();
                    } else if (SwipeLayout.this.b == DragEdge.Bottom && top2 > SwipeLayout.this.getPaddingTop()) {
                        top2 = SwipeLayout.this.getPaddingTop();
                    }
                    surfaceView.layout(left2, top2, SwipeLayout.this.getMeasuredWidth() + left2, SwipeLayout.this.getMeasuredHeight() + top2);
                }
            }
            SwipeLayout.this.dispatchRevealEvent(left, top, right, bottom);
            SwipeLayout.this.dispatchSwipeEvent(left, top, i3, i4);
            SwipeLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(View view, float f, float f2) {
            super.onViewReleased(view, f, f2);
            Iterator it2 = SwipeLayout.this.h.iterator();
            while (it2.hasNext()) {
                ((SwipeListener) it2.next()).onHandRelease(SwipeLayout.this, f, f2);
            }
            SwipeLayout.this.processHandRelease(f, f2, this.a);
            SwipeLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i) {
            boolean z = view == SwipeLayout.this.getSurfaceView() || SwipeLayout.this.getBottomViews().contains(view);
            if (z) {
                this.a = SwipeLayout.this.getOpenStatus() == Status.Close;
            }
            return z;
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SwipeLayout.this.t();
        }
    }

    public class c implements View.OnLongClickListener {
        public c() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            SwipeLayout.this.u();
            return true;
        }
    }

    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DragEdge.values().length];
            a = iArr;
            try {
                iArr[DragEdge.Top.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[DragEdge.Bottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[DragEdge.Left.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[DragEdge.Right.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class e extends GestureDetector.SimpleOnGestureListener {
        public e() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (SwipeLayout.this.l != null) {
                View currentBottomView = SwipeLayout.this.getCurrentBottomView();
                View surfaceView = SwipeLayout.this.getSurfaceView();
                if (currentBottomView == null || motionEvent.getX() <= currentBottomView.getLeft() || motionEvent.getX() >= currentBottomView.getRight() || motionEvent.getY() <= currentBottomView.getTop() || motionEvent.getY() >= currentBottomView.getBottom()) {
                    currentBottomView = surfaceView;
                }
                SwipeLayout.this.l.onDoubleClick(SwipeLayout.this, currentBottomView == surfaceView);
            }
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (SwipeLayout.this.o && SwipeLayout.this.q(motionEvent)) {
                SwipeLayout.this.close();
            }
            return super.onSingleTapUp(motionEvent);
        }
    }

    public SwipeLayout(Context context) {
        this(context, null);
    }

    private AdapterView getAdapterView() {
        ViewParent parent = getParent();
        if (parent instanceof AdapterView) {
            return (AdapterView) parent;
        }
        return null;
    }

    private float getCurrentOffset() {
        DragEdge dragEdge = this.b;
        if (dragEdge == null) {
            return 0.0f;
        }
        return this.g[dragEdge.ordinal()];
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00ac  */
    private void k(MotionEvent motionEvent) {
        boolean z2;
        DragEdge dragEdge;
        if (this.s) {
            return;
        }
        Status openStatus = getOpenStatus();
        Status status = Status.Middle;
        if (openStatus == status) {
            this.s = true;
            return;
        }
        Status openStatus2 = getOpenStatus();
        float rawX = motionEvent.getRawX() - this.t;
        float rawY = motionEvent.getRawY() - this.u;
        float degrees = (float) Math.toDegrees(Math.atan(Math.abs(rawY / rawX)));
        Status openStatus3 = getOpenStatus();
        Status status2 = Status.Close;
        if (openStatus3 == status2) {
            if (degrees < 45.0f) {
                if (rawX > 0.0f && isLeftSwipeEnabled()) {
                    dragEdge = DragEdge.Left;
                } else if (rawX >= 0.0f || !isRightSwipeEnabled()) {
                    return;
                } else {
                    dragEdge = DragEdge.Right;
                }
            } else if (rawY > 0.0f && isTopSwipeEnabled()) {
                dragEdge = DragEdge.Top;
            } else if (rawY >= 0.0f || !isBottomSwipeEnabled()) {
                return;
            } else {
                dragEdge = DragEdge.Bottom;
            }
            setCurrentDragEdge(dragEdge);
        }
        DragEdge dragEdge2 = this.b;
        if (dragEdge2 != DragEdge.Right) {
            z2 = false;
        } else {
            boolean z3 = ((openStatus2 == Status.Open && (rawX > ((float) this.a) ? 1 : (rawX == ((float) this.a) ? 0 : -1)) > 0) || (openStatus2 == status2 && (rawX > ((float) (-this.a)) ? 1 : (rawX == ((float) (-this.a)) ? 0 : -1)) < 0)) || openStatus2 == status;
            if (degrees > 30.0f || !z3) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (dragEdge2 == DragEdge.Left) {
            boolean z4 = ((openStatus2 == Status.Open && (rawX > ((float) (-this.a)) ? 1 : (rawX == ((float) (-this.a)) ? 0 : -1)) < 0) || (openStatus2 == status2 && (rawX > ((float) this.a) ? 1 : (rawX == ((float) this.a) ? 0 : -1)) > 0)) || openStatus2 == status;
            if (degrees > 30.0f || !z4) {
                z2 = true;
            }
        }
        if (dragEdge2 == DragEdge.Top) {
            boolean z5 = ((openStatus2 == Status.Open && (rawY > ((float) (-this.a)) ? 1 : (rawY == ((float) (-this.a)) ? 0 : -1)) < 0) || (openStatus2 == status2 && (rawY > ((float) this.a) ? 1 : (rawY == ((float) this.a) ? 0 : -1)) > 0)) || openStatus2 == status;
            if (degrees < 60.0f || !z5) {
                z2 = true;
            }
        }
        if (dragEdge2 == DragEdge.Bottom) {
            boolean z6 = ((openStatus2 == Status.Open && (rawY > ((float) this.a) ? 1 : (rawY == ((float) this.a) ? 0 : -1)) > 0) || (openStatus2 == status2 && (rawY > ((float) (-this.a)) ? 1 : (rawY == ((float) (-this.a)) ? 0 : -1)) < 0)) || openStatus2 == status;
            if (degrees < 60.0f || !z6) {
                z2 = true;
            }
        }
        this.s = !z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect l(DragEdge dragEdge) {
        int measuredWidth;
        int measuredHeight;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        DragEdge dragEdge2 = DragEdge.Right;
        if (dragEdge == dragEdge2) {
            paddingLeft = getMeasuredWidth() - this.d;
        } else if (dragEdge == DragEdge.Bottom) {
            paddingTop = getMeasuredHeight() - this.d;
        }
        if (dragEdge == DragEdge.Left || dragEdge == dragEdge2) {
            measuredWidth = this.d + paddingLeft;
            measuredHeight = getMeasuredHeight();
        } else {
            measuredWidth = getMeasuredWidth() + paddingLeft;
            measuredHeight = this.d;
        }
        return new Rect(paddingLeft, paddingTop, measuredWidth, measuredHeight + paddingTop);
    }

    private Rect m(ShowMode showMode, Rect rect) {
        View currentBottomView = getCurrentBottomView();
        int i = rect.left;
        int i2 = rect.top;
        int measuredWidth = rect.right;
        int measuredHeight = rect.bottom;
        if (showMode == ShowMode.PullOut) {
            DragEdge dragEdge = this.b;
            DragEdge dragEdge2 = DragEdge.Left;
            if (dragEdge == dragEdge2) {
                i -= this.d;
            } else if (dragEdge == DragEdge.Right) {
                i = measuredWidth;
            } else {
                i2 = dragEdge == DragEdge.Top ? i2 - this.d : measuredHeight;
            }
            if (dragEdge == dragEdge2 || dragEdge == DragEdge.Right) {
                measuredWidth = (currentBottomView != null ? currentBottomView.getMeasuredWidth() : 0) + i;
            } else {
                measuredHeight = i2 + (currentBottomView != null ? currentBottomView.getMeasuredHeight() : 0);
                measuredWidth = rect.right;
            }
        } else if (showMode == ShowMode.LayDown) {
            DragEdge dragEdge3 = this.b;
            if (dragEdge3 == DragEdge.Left) {
                measuredWidth = i + this.d;
            } else if (dragEdge3 == DragEdge.Right) {
                i = measuredWidth - this.d;
            } else if (dragEdge3 == DragEdge.Top) {
                measuredHeight = i2 + this.d;
            } else {
                i2 = measuredHeight - this.d;
            }
        }
        return new Rect(i, i2, measuredWidth, measuredHeight);
    }

    private Rect n(boolean z2) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        if (z2) {
            DragEdge dragEdge = this.b;
            if (dragEdge == DragEdge.Left) {
                paddingLeft = this.d + getPaddingLeft();
            } else if (dragEdge == DragEdge.Right) {
                paddingLeft = getPaddingLeft() - this.d;
            } else if (dragEdge == DragEdge.Top) {
                paddingTop = this.d + getPaddingTop();
            } else {
                paddingTop = getPaddingTop() - this.d;
            }
        }
        return new Rect(paddingLeft, paddingTop, getMeasuredWidth() + paddingLeft, getMeasuredHeight() + paddingTop);
    }

    private int o(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    private boolean p() {
        return getAdapterView() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q(MotionEvent motionEvent) {
        View surfaceView = getSurfaceView();
        if (surfaceView == null) {
            return false;
        }
        if (this.x == null) {
            this.x = new Rect();
        }
        surfaceView.getHitRect(this.x);
        return this.x.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    private void setCurrentDragEdge(DragEdge dragEdge) {
        if (this.b != dragEdge) {
            this.b = dragEdge;
            w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        AdapterView adapterView;
        int positionForView;
        if (getOpenStatus() != Status.Close) {
            return;
        }
        ViewParent parent = getParent();
        if (!(parent instanceof AdapterView) || (positionForView = (adapterView = (AdapterView) parent).getPositionForView(this)) == -1) {
            return;
        }
        adapterView.performItemClick(adapterView.getChildAt(positionForView - adapterView.getFirstVisiblePosition()), positionForView, adapterView.getAdapter().getItemId(positionForView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        r0 = (android.widget.AdapterView) r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean u() {
        AdapterView<?> adapterView;
        int positionForView;
        if (getOpenStatus() != Status.Close) {
            return false;
        }
        ViewParent parent = getParent();
        if (!(parent instanceof AdapterView) || (positionForView = adapterView.getPositionForView(this)) == -1) {
            return false;
        }
        long itemIdAtPosition = adapterView.getItemIdAtPosition(positionForView);
        try {
            Method declaredMethod = AbsListView.class.getDeclaredMethod("performLongPress", View.class, Integer.TYPE, Long.TYPE);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(adapterView, this, Integer.valueOf(positionForView), Long.valueOf(itemIdAtPosition))).booleanValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            boolean zOnItemLongClick = adapterView.getOnItemLongClickListener() != null ? adapterView.getOnItemLongClickListener().onItemLongClick(adapterView, this, positionForView, itemIdAtPosition) : false;
            if (zOnItemLongClick) {
                adapterView.performHapticFeedback(0);
            }
            return zOnItemLongClick;
        }
    }

    private void v() {
        Status openStatus = getOpenStatus();
        List<View> bottomViews = getBottomViews();
        if (openStatus != Status.Close) {
            View currentBottomView = getCurrentBottomView();
            if (currentBottomView == null || currentBottomView.getVisibility() == 0) {
                return;
            }
            currentBottomView.setVisibility(0);
            return;
        }
        for (View view : bottomViews) {
            if (view != null && view.getVisibility() != 4) {
                view.setVisibility(4);
            }
        }
    }

    private void w() {
        View currentBottomView = getCurrentBottomView();
        if (currentBottomView != null) {
            DragEdge dragEdge = this.b;
            if (dragEdge == DragEdge.Left || dragEdge == DragEdge.Right) {
                this.d = currentBottomView.getMeasuredWidth() - o(getCurrentOffset());
            } else {
                this.d = currentBottomView.getMeasuredHeight() - o(getCurrentOffset());
            }
        }
        ShowMode showMode = this.f;
        if (showMode == ShowMode.PullOut) {
            s();
        } else if (showMode == ShowMode.LayDown) {
            r();
        }
        v();
    }

    public void addDrag(DragEdge dragEdge, View view) {
        addDrag(dragEdge, view, null);
    }

    public void addOnLayoutListener(OnLayout onLayout) {
        if (this.r == null) {
            this.r = new ArrayList();
        }
        this.r.add(onLayout);
    }

    public void addRevealListener(int i, OnRevealListener onRevealListener) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            throw new IllegalArgumentException("Child does not belong to SwipeListener.");
        }
        if (!this.k.containsKey(viewFindViewById)) {
            this.k.put(viewFindViewById, Boolean.FALSE);
        }
        if (this.j.get(viewFindViewById) == null) {
            this.j.put(viewFindViewById, new ArrayList<>());
        }
        this.j.get(viewFindViewById).add(onRevealListener);
    }

    public void addSwipeDenier(SwipeDenier swipeDenier) {
        this.i.add(swipeDenier);
    }

    public void addSwipeListener(SwipeListener swipeListener) {
        this.h.add(swipeListener);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int iIntValue;
        try {
            iIntValue = ((Integer) layoutParams.getClass().getField("gravity").get(layoutParams)).intValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            iIntValue = 0;
        }
        if (iIntValue <= 0) {
            for (Map.Entry<DragEdge, View> entry : this.e.entrySet()) {
                if (entry.getValue() == null) {
                    this.e.put(entry.getKey(), view);
                    break;
                }
            }
        } else {
            int absoluteGravity = GravityCompat.getAbsoluteGravity(iIntValue, ViewCompat.getLayoutDirection(this));
            if ((absoluteGravity & 3) == 3) {
                this.e.put(DragEdge.Left, view);
            }
            if ((absoluteGravity & 5) == 5) {
                this.e.put(DragEdge.Right, view);
            }
            if ((absoluteGravity & 48) == 48) {
                this.e.put(DragEdge.Top, view);
            }
            if ((absoluteGravity & 80) == 80) {
                this.e.put(DragEdge.Bottom, view);
            }
        }
        if (view == null || view.getParent() == this) {
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public void close() {
        close(true, true);
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.c.continueSettling(true)) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void dispatchRevealEvent(int i, int i2, int i3, int i4) {
        float f;
        int height;
        if (this.j.isEmpty()) {
            return;
        }
        for (Map.Entry<View, ArrayList<OnRevealListener>> entry : this.j.entrySet()) {
            View key = entry.getKey();
            Rect relativePosition = getRelativePosition(key);
            if (isViewShowing(key, relativePosition, this.b, i, i2, i3, i4)) {
                this.k.put(key, Boolean.FALSE);
                int paddingTop = 0;
                float f2 = 0.0f;
                if (getShowMode() == ShowMode.LayDown) {
                    int i5 = d.a[this.b.ordinal()];
                    if (i5 == 1) {
                        paddingTop = relativePosition.top - i2;
                        f = paddingTop;
                        height = key.getHeight();
                    } else if (i5 == 2) {
                        paddingTop = relativePosition.bottom - i4;
                        f = paddingTop;
                        height = key.getHeight();
                    } else if (i5 == 3) {
                        paddingTop = relativePosition.left - i;
                        f = paddingTop;
                        height = key.getWidth();
                    } else if (i5 == 4) {
                        paddingTop = relativePosition.right - i3;
                        f = paddingTop;
                        height = key.getWidth();
                    }
                    f2 = f / height;
                } else if (getShowMode() == ShowMode.PullOut) {
                    int i6 = d.a[this.b.ordinal()];
                    if (i6 == 1) {
                        paddingTop = relativePosition.bottom - getPaddingTop();
                        f = paddingTop;
                        height = key.getHeight();
                    } else if (i6 == 2) {
                        paddingTop = relativePosition.top - getHeight();
                        f = paddingTop;
                        height = key.getHeight();
                    } else if (i6 == 3) {
                        paddingTop = relativePosition.right - getPaddingLeft();
                        f = paddingTop;
                        height = key.getWidth();
                    } else if (i6 == 4) {
                        paddingTop = relativePosition.left - getWidth();
                        f = paddingTop;
                        height = key.getWidth();
                    }
                    f2 = f / height;
                }
                Iterator<OnRevealListener> it2 = entry.getValue().iterator();
                while (it2.hasNext()) {
                    it2.next().onReveal(key, this.b, Math.abs(f2), paddingTop);
                    if (Math.abs(f2) == 1.0f) {
                        this.k.put(key, Boolean.TRUE);
                    }
                }
            }
            if (isViewTotallyFirstShowed(key, relativePosition, this.b, i, i2, i3, i4)) {
                this.k.put(key, Boolean.TRUE);
                for (OnRevealListener onRevealListener : entry.getValue()) {
                    DragEdge dragEdge = this.b;
                    if (dragEdge == DragEdge.Left || dragEdge == DragEdge.Right) {
                        onRevealListener.onReveal(key, dragEdge, 1.0f, key.getWidth());
                    } else {
                        onRevealListener.onReveal(key, dragEdge, 1.0f, key.getHeight());
                    }
                }
            }
        }
    }

    public void dispatchSwipeEvent(int i, int i2, int i3, int i4) {
        DragEdge dragEdge = getDragEdge();
        boolean z2 = false;
        if (dragEdge != DragEdge.Left ? dragEdge != DragEdge.Right ? dragEdge != DragEdge.Top ? dragEdge != DragEdge.Bottom || i4 <= 0 : i4 >= 0 : i3 <= 0 : i3 >= 0) {
            z2 = true;
        }
        dispatchSwipeEvent(i, i2, z2);
    }

    public List<View> getBottomViews() {
        ArrayList arrayList = new ArrayList();
        for (DragEdge dragEdge : DragEdge.values()) {
            arrayList.add(this.e.get(dragEdge));
        }
        return arrayList;
    }

    @Nullable
    public View getCurrentBottomView() {
        List<View> bottomViews = getBottomViews();
        if (this.b.ordinal() < bottomViews.size()) {
            return bottomViews.get(this.b.ordinal());
        }
        return null;
    }

    public int getDragDistance() {
        return this.d;
    }

    public DragEdge getDragEdge() {
        return this.b;
    }

    public Map<DragEdge, View> getDragEdgeMap() {
        return this.e;
    }

    @Deprecated
    public List<DragEdge> getDragEdges() {
        return new ArrayList(this.e.keySet());
    }

    public Status getOpenStatus() {
        View surfaceView = getSurfaceView();
        if (surfaceView == null) {
            return Status.Close;
        }
        int left = surfaceView.getLeft();
        int top = surfaceView.getTop();
        if (left == getPaddingLeft() && top == getPaddingTop()) {
            return Status.Close;
        }
        return (left == getPaddingLeft() - this.d || left == getPaddingLeft() + this.d || top == getPaddingTop() - this.d || top == getPaddingTop() + this.d) ? Status.Open : Status.Middle;
    }

    public Rect getRelativePosition(View view) {
        Rect rect = new Rect(view.getLeft(), view.getTop(), 0, 0);
        View view2 = view;
        while (view2.getParent() != null && view2 != getRootView() && (view2 = (View) view2.getParent()) != this) {
            rect.left += view2.getLeft();
            rect.top += view2.getTop();
        }
        rect.right = rect.left + view.getMeasuredWidth();
        rect.bottom = rect.top + view.getMeasuredHeight();
        return rect;
    }

    public ShowMode getShowMode() {
        return this.f;
    }

    public View getSurfaceView() {
        if (getChildCount() == 0) {
            return null;
        }
        return getChildAt(getChildCount() - 1);
    }

    public boolean isBottomSwipeEnabled() {
        LinkedHashMap<DragEdge, View> linkedHashMap = this.e;
        DragEdge dragEdge = DragEdge.Bottom;
        View view = linkedHashMap.get(dragEdge);
        return view != null && view.getParent() == this && view != getSurfaceView() && this.n[dragEdge.ordinal()];
    }

    public boolean isClickToClose() {
        return this.o;
    }

    public boolean isLeftSwipeEnabled() {
        LinkedHashMap<DragEdge, View> linkedHashMap = this.e;
        DragEdge dragEdge = DragEdge.Left;
        View view = linkedHashMap.get(dragEdge);
        return view != null && view.getParent() == this && view != getSurfaceView() && this.n[dragEdge.ordinal()];
    }

    public boolean isRightSwipeEnabled() {
        LinkedHashMap<DragEdge, View> linkedHashMap = this.e;
        DragEdge dragEdge = DragEdge.Right;
        View view = linkedHashMap.get(dragEdge);
        return view != null && view.getParent() == this && view != getSurfaceView() && this.n[dragEdge.ordinal()];
    }

    public boolean isSwipeEnabled() {
        return this.m;
    }

    public boolean isTopSwipeEnabled() {
        LinkedHashMap<DragEdge, View> linkedHashMap = this.e;
        DragEdge dragEdge = DragEdge.Top;
        View view = linkedHashMap.get(dragEdge);
        return view != null && view.getParent() == this && view != getSurfaceView() && this.n[dragEdge.ordinal()];
    }

    public boolean isViewShowing(View view, Rect rect, DragEdge dragEdge, int i, int i2, int i3, int i4) {
        int i5 = rect.left;
        int i6 = rect.right;
        int i7 = rect.top;
        int i8 = rect.bottom;
        if (getShowMode() == ShowMode.LayDown) {
            int i9 = d.a[dragEdge.ordinal()];
            if (i9 == 1) {
                return i2 >= i7 && i2 < i8;
            }
            if (i9 == 2) {
                return i4 > i7 && i4 <= i8;
            }
            if (i9 != 3) {
                return i9 == 4 && i3 > i5 && i3 <= i6;
            }
            return i < i6 && i >= i5;
        }
        if (getShowMode() != ShowMode.PullOut) {
            return false;
        }
        int i10 = d.a[dragEdge.ordinal()];
        if (i10 == 1) {
            return i7 < getPaddingTop() && i8 >= getPaddingTop();
        }
        if (i10 == 2) {
            return i7 < getHeight() && i7 >= getPaddingTop();
        }
        if (i10 != 3) {
            return i10 == 4 && i5 <= getWidth() && i6 > getWidth();
        }
        return i6 >= getPaddingLeft() && i5 < getPaddingLeft();
    }

    public boolean isViewTotallyFirstShowed(View view, Rect rect, DragEdge dragEdge, int i, int i2, int i3, int i4) {
        if (this.k.get(view).booleanValue()) {
            return false;
        }
        int i5 = rect.left;
        int i6 = rect.right;
        int i7 = rect.top;
        int i8 = rect.bottom;
        if (getShowMode() == ShowMode.LayDown) {
            if ((dragEdge != DragEdge.Right || i3 > i5) && ((dragEdge != DragEdge.Left || i < i6) && ((dragEdge != DragEdge.Top || i2 < i8) && (dragEdge != DragEdge.Bottom || i4 > i7)))) {
                return false;
            }
        } else {
            if (getShowMode() != ShowMode.PullOut) {
                return false;
            }
            if ((dragEdge != DragEdge.Right || i6 > getWidth()) && ((dragEdge != DragEdge.Left || i5 < getPaddingLeft()) && ((dragEdge != DragEdge.Top || i7 < getPaddingTop()) && (dragEdge != DragEdge.Bottom || i8 > getHeight())))) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (p()) {
            if (this.v == null) {
                setOnClickListener(new b());
            }
            if (this.w == null) {
                setOnLongClickListener(new c());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (!isSwipeEnabled()) {
            return false;
        }
        if (this.o && getOpenStatus() == Status.Open && q(motionEvent)) {
            return true;
        }
        for (SwipeDenier swipeDenier : this.i) {
            if (swipeDenier != null && swipeDenier.shouldDenySwipe(motionEvent)) {
                return false;
            }
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.c.processTouchEvent(motionEvent);
            this.s = false;
            this.t = motionEvent.getRawX();
            this.u = motionEvent.getRawY();
            if (getOpenStatus() == Status.Middle) {
                this.s = true;
            }
        } else if (action == 1) {
            this.s = false;
            this.c.processTouchEvent(motionEvent);
        } else if (action == 2) {
            boolean z2 = this.s;
            k(motionEvent);
            if (this.s && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!z2 && this.s) {
                return false;
            }
        } else if (action != 3) {
            this.c.processTouchEvent(motionEvent);
        } else {
            this.s = false;
            this.c.processTouchEvent(motionEvent);
        }
        return this.s;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        w();
        if (this.r != null) {
            for (int i5 = 0; i5 < this.r.size(); i5++) {
                this.r.get(i5).onLayout(this);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isSwipeEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        this.y.onTouchEvent(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.s = false;
                this.c.processTouchEvent(motionEvent);
            } else if (actionMasked != 2) {
                if (actionMasked != 3) {
                    this.c.processTouchEvent(motionEvent);
                } else {
                    this.s = false;
                    this.c.processTouchEvent(motionEvent);
                }
            }
            return !super.onTouchEvent(motionEvent) || this.s || actionMasked == 0;
        }
        this.c.processTouchEvent(motionEvent);
        this.t = motionEvent.getRawX();
        this.u = motionEvent.getRawY();
        k(motionEvent);
        if (this.s) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.c.processTouchEvent(motionEvent);
        }
        if (super.onTouchEvent(motionEvent)) {
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        for (Map.Entry entry : new HashMap(this.e).entrySet()) {
            if (entry.getValue() == view) {
                this.e.remove(entry.getKey());
            }
        }
    }

    public void open() {
        open(true, true);
    }

    public void processHandRelease(float f, float f2, boolean z2) {
        float minVelocity = this.c.getMinVelocity();
        View surfaceView = getSurfaceView();
        DragEdge dragEdge = this.b;
        if (dragEdge == null || surfaceView == null) {
            return;
        }
        float f3 = z2 ? 0.25f : 0.75f;
        if (dragEdge == DragEdge.Left) {
            if (f > minVelocity) {
                open();
                return;
            }
            if (f < (-minVelocity)) {
                close();
                return;
            } else if ((getSurfaceView().getLeft() * 1.0f) / this.d > f3) {
                open();
                return;
            } else {
                close();
                return;
            }
        }
        if (dragEdge == DragEdge.Right) {
            if (f > minVelocity) {
                close();
                return;
            }
            if (f < (-minVelocity)) {
                open();
                return;
            } else if (((-getSurfaceView().getLeft()) * 1.0f) / this.d > f3) {
                open();
                return;
            } else {
                close();
                return;
            }
        }
        if (dragEdge == DragEdge.Top) {
            if (f2 > minVelocity) {
                open();
                return;
            }
            if (f2 < (-minVelocity)) {
                close();
                return;
            } else if ((getSurfaceView().getTop() * 1.0f) / this.d > f3) {
                open();
                return;
            } else {
                close();
                return;
            }
        }
        if (dragEdge == DragEdge.Bottom) {
            if (f2 > minVelocity) {
                close();
                return;
            }
            if (f2 < (-minVelocity)) {
                open();
            } else if (((-getSurfaceView().getTop()) * 1.0f) / this.d > f3) {
                open();
            } else {
                close();
            }
        }
    }

    public void r() {
        Rect rectN = n(false);
        View surfaceView = getSurfaceView();
        if (surfaceView != null) {
            surfaceView.layout(rectN.left, rectN.top, rectN.right, rectN.bottom);
            bringChildToFront(surfaceView);
        }
        Rect rectM = m(ShowMode.LayDown, rectN);
        View currentBottomView = getCurrentBottomView();
        if (currentBottomView != null) {
            currentBottomView.layout(rectM.left, rectM.top, rectM.right, rectM.bottom);
        }
    }

    public void removeAllRevealListeners(int i) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById != null) {
            this.j.remove(viewFindViewById);
            this.k.remove(viewFindViewById);
        }
    }

    public void removeAllSwipeDeniers() {
        this.i.clear();
    }

    public void removeOnLayoutListener(OnLayout onLayout) {
        List<OnLayout> list = this.r;
        if (list != null) {
            list.remove(onLayout);
        }
    }

    public void removeRevealListener(int i, OnRevealListener onRevealListener) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            return;
        }
        this.k.remove(viewFindViewById);
        if (this.j.containsKey(viewFindViewById)) {
            this.j.get(viewFindViewById).remove(onRevealListener);
        }
    }

    public void removeSwipeDenier(SwipeDenier swipeDenier) {
        this.i.remove(swipeDenier);
    }

    public void removeSwipeListener(SwipeListener swipeListener) {
        this.h.remove(swipeListener);
    }

    public void s() {
        Rect rectN = n(false);
        View surfaceView = getSurfaceView();
        if (surfaceView != null) {
            surfaceView.layout(rectN.left, rectN.top, rectN.right, rectN.bottom);
            bringChildToFront(surfaceView);
        }
        Rect rectM = m(ShowMode.PullOut, rectN);
        View currentBottomView = getCurrentBottomView();
        if (currentBottomView != null) {
            currentBottomView.layout(rectM.left, rectM.top, rectM.right, rectM.bottom);
        }
    }

    public void setBottomSwipeEnabled(boolean z2) {
        this.n[DragEdge.Bottom.ordinal()] = z2;
    }

    @Deprecated
    public void setBottomViewIds(int i, int i2, int i3, int i4) {
        addDrag(DragEdge.Left, findViewById(i));
        addDrag(DragEdge.Right, findViewById(i2));
        addDrag(DragEdge.Top, findViewById(i3));
        addDrag(DragEdge.Bottom, findViewById(i4));
    }

    public void setClickToClose(boolean z2) {
        this.o = z2;
    }

    public void setDragDistance(int i) {
        if (i < 0) {
            i = 0;
        }
        this.d = o(i);
        requestLayout();
    }

    @Deprecated
    public void setDragEdge(DragEdge dragEdge) {
        if (getChildCount() >= 2) {
            this.e.put(dragEdge, getChildAt(getChildCount() - 2));
        }
        setCurrentDragEdge(dragEdge);
    }

    @Deprecated
    public void setDragEdges(List<DragEdge> list) {
        int iMin = Math.min(list.size(), getChildCount() - 1);
        for (int i = 0; i < iMin; i++) {
            this.e.put(list.get(i), getChildAt(i));
        }
        if (list.size() == 0 || list.contains(D)) {
            setCurrentDragEdge(D);
        } else {
            setCurrentDragEdge(list.get(0));
        }
    }

    public void setLeftSwipeEnabled(boolean z2) {
        this.n[DragEdge.Left.ordinal()] = z2;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.v = onClickListener;
    }

    public void setOnDoubleClickListener(DoubleClickListener doubleClickListener) {
        this.l = doubleClickListener;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        this.w = onLongClickListener;
    }

    public void setRightSwipeEnabled(boolean z2) {
        this.n[DragEdge.Right.ordinal()] = z2;
    }

    public void setShowMode(ShowMode showMode) {
        this.f = showMode;
        requestLayout();
    }

    public void setSwipeEnabled(boolean z2) {
        this.m = z2;
    }

    public void setTopSwipeEnabled(boolean z2) {
        this.n[DragEdge.Top.ordinal()] = z2;
    }

    public void toggle() {
        toggle(true);
    }

    public SwipeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void addDrag(DragEdge dragEdge, View view, ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        int i = -1;
        int i2 = d.a[dragEdge.ordinal()];
        if (i2 == 1) {
            i = 48;
        } else if (i2 == 2) {
            i = 80;
        } else if (i2 == 3) {
            i = 3;
        } else if (i2 == 4) {
            i = 5;
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = i;
        }
        addView(view, 0, layoutParams);
    }

    public void close(boolean z2) {
        close(z2, true);
    }

    public void open(boolean z2) {
        open(z2, true);
    }

    public void toggle(boolean z2) {
        if (getOpenStatus() == Status.Open) {
            close(z2);
        } else if (getOpenStatus() == Status.Close) {
            open(z2);
        }
    }

    public SwipeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = D;
        this.d = 0;
        this.e = new LinkedHashMap<>();
        this.g = new float[4];
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new HashMap();
        this.k = new HashMap();
        this.m = true;
        this.n = new boolean[]{true, true, true, true};
        this.o = false;
        this.p = new a();
        this.q = 0;
        this.t = -1.0f;
        this.u = -1.0f;
        this.y = new GestureDetector(getContext(), new e());
        this.c = ViewDragHelper.create(this, this.p);
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SwipeLayout);
        int i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.SwipeLayout_drag_edge, 2);
        float[] fArr = this.g;
        DragEdge dragEdge = DragEdge.Left;
        fArr[dragEdge.ordinal()] = typedArrayObtainStyledAttributes.getDimension(R.styleable.SwipeLayout_leftEdgeSwipeOffset, 0.0f);
        float[] fArr2 = this.g;
        DragEdge dragEdge2 = DragEdge.Right;
        fArr2[dragEdge2.ordinal()] = typedArrayObtainStyledAttributes.getDimension(R.styleable.SwipeLayout_rightEdgeSwipeOffset, 0.0f);
        float[] fArr3 = this.g;
        DragEdge dragEdge3 = DragEdge.Top;
        fArr3[dragEdge3.ordinal()] = typedArrayObtainStyledAttributes.getDimension(R.styleable.SwipeLayout_topEdgeSwipeOffset, 0.0f);
        float[] fArr4 = this.g;
        DragEdge dragEdge4 = DragEdge.Bottom;
        fArr4[dragEdge4.ordinal()] = typedArrayObtainStyledAttributes.getDimension(R.styleable.SwipeLayout_bottomEdgeSwipeOffset, 0.0f);
        setClickToClose(typedArrayObtainStyledAttributes.getBoolean(R.styleable.SwipeLayout_clickToClose, this.o));
        if ((i2 & 1) == 1) {
            this.e.put(dragEdge, null);
        }
        if ((i2 & 4) == 4) {
            this.e.put(dragEdge3, null);
        }
        if ((i2 & 2) == 2) {
            this.e.put(dragEdge2, null);
        }
        if ((i2 & 8) == 8) {
            this.e.put(dragEdge4, null);
        }
        this.f = ShowMode.values()[typedArrayObtainStyledAttributes.getInt(R.styleable.SwipeLayout_show_mode, ShowMode.PullOut.ordinal())];
        typedArrayObtainStyledAttributes.recycle();
    }

    public void close(boolean z2, boolean z3) {
        View surfaceView = getSurfaceView();
        if (surfaceView == null) {
            return;
        }
        if (z2) {
            this.c.smoothSlideViewTo(getSurfaceView(), getPaddingLeft(), getPaddingTop());
        } else {
            Rect rectN = n(false);
            int left = rectN.left - surfaceView.getLeft();
            int top = rectN.top - surfaceView.getTop();
            surfaceView.layout(rectN.left, rectN.top, rectN.right, rectN.bottom);
            if (z3) {
                dispatchRevealEvent(rectN.left, rectN.top, rectN.right, rectN.bottom);
                dispatchSwipeEvent(rectN.left, rectN.top, left, top);
            } else {
                v();
            }
        }
        invalidate();
    }

    public void open(boolean z2, boolean z3) {
        View surfaceView = getSurfaceView();
        View currentBottomView = getCurrentBottomView();
        if (surfaceView == null) {
            return;
        }
        Rect rectN = n(true);
        if (z2) {
            this.c.smoothSlideViewTo(surfaceView, rectN.left, rectN.top);
        } else {
            int left = rectN.left - surfaceView.getLeft();
            int top = rectN.top - surfaceView.getTop();
            surfaceView.layout(rectN.left, rectN.top, rectN.right, rectN.bottom);
            ShowMode showMode = getShowMode();
            ShowMode showMode2 = ShowMode.PullOut;
            if (showMode == showMode2) {
                Rect rectM = m(showMode2, rectN);
                if (currentBottomView != null) {
                    currentBottomView.layout(rectM.left, rectM.top, rectM.right, rectM.bottom);
                }
            }
            if (z3) {
                dispatchRevealEvent(rectN.left, rectN.top, rectN.right, rectN.bottom);
                dispatchSwipeEvent(rectN.left, rectN.top, left, top);
            } else {
                v();
            }
        }
        invalidate();
    }

    public void dispatchSwipeEvent(int i, int i2, boolean z2) {
        v();
        Status openStatus = getOpenStatus();
        if (this.h.isEmpty()) {
            return;
        }
        this.q++;
        for (SwipeListener swipeListener : this.h) {
            if (this.q == 1) {
                if (z2) {
                    swipeListener.onStartOpen(this);
                } else {
                    swipeListener.onStartClose(this);
                }
            }
            swipeListener.onUpdate(this, i - getPaddingLeft(), i2 - getPaddingTop());
        }
        if (openStatus == Status.Close) {
            Iterator<SwipeListener> it2 = this.h.iterator();
            while (it2.hasNext()) {
                it2.next().onClose(this);
            }
            this.q = 0;
        }
        if (openStatus == Status.Open) {
            View currentBottomView = getCurrentBottomView();
            if (currentBottomView != null) {
                currentBottomView.setEnabled(true);
            }
            Iterator<SwipeListener> it3 = this.h.iterator();
            while (it3.hasNext()) {
                it3.next().onOpen(this);
            }
            this.q = 0;
        }
    }

    @Deprecated
    public void setDragEdges(DragEdge... dragEdgeArr) {
        setDragEdges(Arrays.asList(dragEdgeArr));
    }

    public void addRevealListener(int[] iArr, OnRevealListener onRevealListener) {
        for (int i : iArr) {
            addRevealListener(i, onRevealListener);
        }
    }

    public void open(DragEdge dragEdge) {
        setCurrentDragEdge(dragEdge);
        open(true, true);
    }

    public void open(boolean z2, DragEdge dragEdge) {
        setCurrentDragEdge(dragEdge);
        open(z2, true);
    }

    public void open(boolean z2, boolean z3, DragEdge dragEdge) {
        setCurrentDragEdge(dragEdge);
        open(z2, z3);
    }
}
