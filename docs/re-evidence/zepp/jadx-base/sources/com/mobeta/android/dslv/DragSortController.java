package com.mobeta.android.dslv;

import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes18.dex */
public class DragSortController extends SimpleFloatViewManager implements View.OnTouchListener, GestureDetector.OnGestureListener {
    public static final int CLICK_REMOVE = 0;
    public static final int FLING_REMOVE = 1;
    public static final int MISS = -1;
    public static final int ON_DOWN = 0;
    public static final int ON_DRAG = 1;
    public static final int ON_LONG_PRESS = 2;
    private DragSortListView A;
    private int B;
    private GestureDetector.OnGestureListener C;
    private int e;
    private boolean f;
    private int g;
    private boolean h;
    private boolean i;
    private GestureDetector j;
    private GestureDetector k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int[] p;
    private int q;
    private int r;
    private int s;
    private int t;
    private boolean u;
    private float v;
    private int w;
    private int x;
    private int y;
    private boolean z;

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (DragSortController.this.h && DragSortController.this.i) {
                int width = DragSortController.this.A.getWidth() / 5;
                if (f > DragSortController.this.v) {
                    if (DragSortController.this.B > (-width)) {
                        DragSortController.this.A.stopDragWithVelocity(true, f);
                    }
                } else if (f < (-DragSortController.this.v) && DragSortController.this.B < width) {
                    DragSortController.this.A.stopDragWithVelocity(true, f);
                }
                DragSortController.this.i = false;
            }
            return false;
        }
    }

    public DragSortController(DragSortListView dragSortListView) {
        this(dragSortListView, 0, 0, 1);
    }

    public int dragHandleHitPosition(MotionEvent motionEvent) {
        return viewIdHitPosition(motionEvent, this.w);
    }

    public int flingHandleHitPosition(MotionEvent motionEvent) {
        return viewIdHitPosition(motionEvent, this.y);
    }

    public int getDragInitMode() {
        return this.e;
    }

    public int getRemoveMode() {
        return this.g;
    }

    public boolean isRemoveEnabled() {
        return this.h;
    }

    public boolean isSortEnabled() {
        return this.f;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (this.h && this.g == 0) {
            this.o = viewIdHitPosition(motionEvent, this.x);
        }
        int iStartDragPosition = startDragPosition(motionEvent);
        this.m = iStartDragPosition;
        if (iStartDragPosition != -1 && this.e == 0) {
            startDrag(iStartDragPosition, ((int) motionEvent.getX()) - this.q, ((int) motionEvent.getY()) - this.r);
        }
        this.i = false;
        this.z = true;
        this.B = 0;
        this.n = startFlingPosition(motionEvent);
        return true;
    }

    @Override // com.mobeta.android.dslv.SimpleFloatViewManager, com.mobeta.android.dslv.DragSortListView.FloatViewManager
    public void onDragFloatView(View view, Point point, Point point2) {
        if (this.h && this.i) {
            this.B = point.x;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        if (this.m == -1 || this.e != 2) {
            return;
        }
        this.A.performHapticFeedback(0);
        startDrag(this.m, this.s - this.q, this.t - this.r);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        if (motionEvent != null && motionEvent2 != null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int x2 = (int) motionEvent2.getX();
            int y2 = (int) motionEvent2.getY();
            int i2 = x2 - this.q;
            int i3 = y2 - this.r;
            if (this.z && !this.u && ((i = this.m) != -1 || this.n != -1)) {
                if (i != -1) {
                    if (this.e == 1 && Math.abs(y2 - y) > this.l && this.f) {
                        startDrag(this.m, i2, i3);
                    } else if (this.e != 0 && Math.abs(x2 - x) > this.l && this.h) {
                        this.i = true;
                        startDrag(this.n, i2, i3);
                    }
                } else if (this.n != -1) {
                    if (Math.abs(x2 - x) > this.l && this.h) {
                        this.i = true;
                        startDrag(this.n, i2, i3);
                    } else if (Math.abs(y2 - y) > this.l) {
                        this.z = false;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        int i;
        if (!this.h || this.g != 0 || (i = this.o) == -1) {
            return true;
        }
        DragSortListView dragSortListView = this.A;
        dragSortListView.removeItem(i - dragSortListView.getHeaderViewsCount());
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.A.isDragEnabled() && !this.A.listViewIntercepted()) {
            this.j.onTouchEvent(motionEvent);
            if (this.h && this.u && this.g == 1) {
                this.k.onTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction() & 255;
            if (action != 0) {
                if (action != 1) {
                    if (action == 3) {
                    }
                } else if (this.h && this.i) {
                    int i = this.B;
                    if (i < 0) {
                        i = -i;
                    }
                    if (i > this.A.getWidth() / 2) {
                        this.A.stopDragWithVelocity(true, 0.0f);
                    }
                }
                this.i = false;
                this.u = false;
            } else {
                this.s = (int) motionEvent.getX();
                this.t = (int) motionEvent.getY();
            }
        }
        return false;
    }

    public void setClickRemoveId(int i) {
        this.x = i;
    }

    public void setDragHandleId(int i) {
        this.w = i;
    }

    public void setDragInitMode(int i) {
        this.e = i;
    }

    public void setFlingHandleId(int i) {
        this.y = i;
    }

    public void setRemoveEnabled(boolean z) {
        this.h = z;
    }

    public void setRemoveMode(int i) {
        this.g = i;
    }

    public void setSortEnabled(boolean z) {
        this.f = z;
    }

    public boolean startDrag(int i, int i2, int i3) {
        int i4 = (!this.f || this.i) ? 0 : 12;
        if (this.h && this.i) {
            i4 = i4 | 1 | 2;
        }
        DragSortListView dragSortListView = this.A;
        boolean zStartDrag = dragSortListView.startDrag(i - dragSortListView.getHeaderViewsCount(), i4, i2, i3);
        this.u = zStartDrag;
        return zStartDrag;
    }

    public int startDragPosition(MotionEvent motionEvent) {
        return dragHandleHitPosition(motionEvent);
    }

    public int startFlingPosition(MotionEvent motionEvent) {
        if (this.g == 1) {
            return flingHandleHitPosition(motionEvent);
        }
        return -1;
    }

    public int viewIdHitPosition(MotionEvent motionEvent, int i) {
        int iPointToPosition = this.A.pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        int headerViewsCount = this.A.getHeaderViewsCount();
        int footerViewsCount = this.A.getFooterViewsCount();
        int count = this.A.getCount();
        if (iPointToPosition != -1 && iPointToPosition >= headerViewsCount && iPointToPosition < count - footerViewsCount) {
            DragSortListView dragSortListView = this.A;
            View childAt = dragSortListView.getChildAt(iPointToPosition - dragSortListView.getFirstVisiblePosition());
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            View viewFindViewById = i == 0 ? childAt : childAt.findViewById(i);
            if (viewFindViewById != null) {
                viewFindViewById.getLocationOnScreen(this.p);
                int[] iArr = this.p;
                if (rawX > iArr[0] && rawY > iArr[1] && rawX < iArr[0] + viewFindViewById.getWidth() && rawY < this.p[1] + viewFindViewById.getHeight()) {
                    this.q = childAt.getLeft();
                    this.r = childAt.getTop();
                    return iPointToPosition;
                }
            }
        }
        return -1;
    }

    public DragSortController(DragSortListView dragSortListView, int i, int i2, int i3) {
        this(dragSortListView, i, i2, i3, 0);
    }

    public DragSortController(DragSortListView dragSortListView, int i, int i2, int i3, int i4) {
        this(dragSortListView, i, i2, i3, i4, 0);
    }

    public DragSortController(DragSortListView dragSortListView, int i, int i2, int i3, int i4, int i5) {
        super(dragSortListView);
        this.e = 0;
        this.f = true;
        this.h = false;
        this.i = false;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = new int[2];
        this.u = false;
        this.v = 500.0f;
        this.C = new a();
        this.A = dragSortListView;
        this.j = new GestureDetector(dragSortListView.getContext(), this);
        GestureDetector gestureDetector = new GestureDetector(dragSortListView.getContext(), this.C);
        this.k = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.l = ViewConfiguration.get(dragSortListView.getContext()).getScaledTouchSlop();
        this.w = i;
        this.x = i4;
        this.y = i5;
        setRemoveMode(i3);
        setDragInitMode(i2);
    }
}
