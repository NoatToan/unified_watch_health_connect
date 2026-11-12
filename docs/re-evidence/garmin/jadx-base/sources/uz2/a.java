package uz2;

import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.mobeta.android.dslv.DragSortListView;

/* JADX INFO: loaded from: classes3.dex */
public class a extends com.mobeta.android.dslv.a implements View.OnTouchListener, GestureDetector.OnGestureListener {
    public final int A;
    public boolean B;
    public final DragSortListView C;
    public int D;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f173604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f173605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f173606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f173607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f173608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final GestureDetector f173609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final GestureDetector f173610k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f173611l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f173612m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f173613n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f173614o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int[] f173615p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f173616q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f173617r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f173618t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f173619v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f173620w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f173621x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f173622y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f173623z;

    /* JADX INFO: renamed from: uz2.a$a, reason: collision with other inner class name */
    public class C3244a extends GestureDetector.SimpleOnGestureListener {
        public C3244a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f14, float f15) {
            a aVar = a.this;
            boolean z14 = aVar.f173607h;
            DragSortListView dragSortListView = aVar.C;
            if (z14 && aVar.f173608i) {
                int width = dragSortListView.getWidth() / 5;
                float f16 = aVar.f173621x;
                if (f14 > f16) {
                    if (aVar.D > (-width)) {
                        dragSortListView.f54631c1 = true;
                        dragSortListView.x(f14, true);
                    }
                } else if (f14 < (-f16) && aVar.D < width) {
                    dragSortListView.f54631c1 = true;
                    dragSortListView.x(f14, true);
                }
                aVar.f173608i = false;
            }
            return false;
        }
    }

    public a(DragSortListView dragSortListView, int i14, int i15, int i16, int i17, int i18) {
        super(dragSortListView);
        this.f173604e = 0;
        this.f173605f = true;
        this.f173607h = false;
        this.f173608i = false;
        this.f173612m = -1;
        this.f173613n = -1;
        this.f173614o = -1;
        this.f173615p = new int[2];
        this.f173620w = false;
        this.f173621x = 500.0f;
        C3244a c3244a = new C3244a();
        this.C = dragSortListView;
        this.f173609j = new GestureDetector(dragSortListView.getContext(), this);
        GestureDetector gestureDetector = new GestureDetector(dragSortListView.getContext(), c3244a);
        this.f173610k = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f173611l = ViewConfiguration.get(dragSortListView.getContext()).getScaledTouchSlop();
        this.f173622y = i14;
        this.f173623z = i17;
        this.A = i18;
        this.f173606g = i16;
        this.f173604e = i15;
    }

    @Override // com.mobeta.android.dslv.a, com.mobeta.android.dslv.DragSortListView.k
    public final void a(Point point) {
        if (this.f173607h && this.f173608i) {
            this.D = point.x;
        }
    }

    public final void b(int i14, int i15, int i16) {
        int i17 = (!this.f173605f || this.f173608i) ? 0 : 12;
        if (this.f173607h && this.f173608i) {
            i17 |= 3;
        }
        DragSortListView dragSortListView = this.C;
        this.f173620w = dragSortListView.w(i14 - dragSortListView.getHeaderViewsCount(), i17, i15, i16);
    }

    public final int c(MotionEvent motionEvent, int i14) {
        int x14 = (int) motionEvent.getX();
        int y14 = (int) motionEvent.getY();
        DragSortListView dragSortListView = this.C;
        int iPointToPosition = dragSortListView.pointToPosition(x14, y14);
        int headerViewsCount = dragSortListView.getHeaderViewsCount();
        int footerViewsCount = dragSortListView.getFooterViewsCount();
        int count = dragSortListView.getCount();
        if (iPointToPosition != -1 && iPointToPosition >= headerViewsCount && iPointToPosition < count - footerViewsCount) {
            View childAt = dragSortListView.getChildAt(iPointToPosition - dragSortListView.getFirstVisiblePosition());
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            View viewFindViewById = i14 == 0 ? childAt : childAt.findViewById(i14);
            if (viewFindViewById != null) {
                int[] iArr = this.f173615p;
                viewFindViewById.getLocationOnScreen(iArr);
                int i15 = iArr[0];
                if (rawX > i15 && rawY > iArr[1] && rawX < viewFindViewById.getWidth() + i15) {
                    if (rawY < viewFindViewById.getHeight() + iArr[1]) {
                        this.f173616q = childAt.getLeft();
                        this.f173617r = childAt.getTop();
                        return iPointToPosition;
                    }
                }
            }
        }
        return -1;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (this.f173607h && this.f173606g == 0) {
            this.f173614o = c(motionEvent, this.f173623z);
        }
        int iC = c(motionEvent, this.f173622y);
        this.f173612m = iC;
        if (iC != -1 && this.f173604e == 0) {
            b(iC, ((int) motionEvent.getX()) - this.f173616q, ((int) motionEvent.getY()) - this.f173617r);
        }
        this.f173608i = false;
        this.B = true;
        this.D = 0;
        this.f173613n = this.f173606g == 1 ? c(motionEvent, this.A) : -1;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f14, float f15) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        if (this.f173612m == -1 || this.f173604e != 2) {
            return;
        }
        this.C.performHapticFeedback(0);
        b(this.f173612m, this.f173618t - this.f173616q, this.f173619v - this.f173617r);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f14, float f15) {
        int i14;
        if (motionEvent != null && motionEvent2 != null) {
            int x14 = (int) motionEvent.getX();
            int y14 = (int) motionEvent.getY();
            int x15 = (int) motionEvent2.getX();
            int y15 = (int) motionEvent2.getY();
            int i15 = x15 - this.f173616q;
            int i16 = y15 - this.f173617r;
            if (this.B && !this.f173620w && ((i14 = this.f173612m) != -1 || this.f173613n != -1)) {
                int i17 = this.f173611l;
                if (i14 != -1) {
                    if (this.f173604e == 1 && Math.abs(y15 - y14) > i17 && this.f173605f) {
                        b(this.f173612m, i15, i16);
                        return false;
                    }
                    if (this.f173604e != 0 && Math.abs(x15 - x14) > i17 && this.f173607h) {
                        this.f173608i = true;
                        b(this.f173613n, i15, i16);
                        return false;
                    }
                } else if (this.f173613n != -1) {
                    if (Math.abs(x15 - x14) > i17 && this.f173607h) {
                        this.f173608i = true;
                        b(this.f173613n, i15, i16);
                        return false;
                    }
                    if (Math.abs(y15 - y14) > i17) {
                        this.B = false;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        int i14;
        if (!this.f173607h || this.f173606g != 0 || (i14 = this.f173614o) == -1) {
            return true;
        }
        DragSortListView dragSortListView = this.C;
        int headerViewsCount = i14 - dragSortListView.getHeaderViewsCount();
        dragSortListView.f54631c1 = false;
        dragSortListView.t(0.0f, headerViewsCount);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        if (r0 != 3) goto L34;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view2, MotionEvent motionEvent) {
        DragSortListView dragSortListView = this.C;
        if (dragSortListView.f54650t && !dragSortListView.f54635e1) {
            this.f173609j.onTouchEvent(motionEvent);
            if (this.f173607h && this.f173620w && this.f173606g == 1) {
                this.f173610k.onTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction() & 255;
            if (action != 0) {
                if (action == 1) {
                    if (this.f173607h && this.f173608i) {
                        int i14 = this.D;
                        if (i14 < 0) {
                            i14 = -i14;
                        }
                        if (i14 > dragSortListView.getWidth() / 2) {
                            dragSortListView.f54631c1 = true;
                            dragSortListView.x(0.0f, true);
                        }
                    }
                }
                this.f173608i = false;
                this.f173620w = false;
                return false;
            }
            this.f173618t = (int) motionEvent.getX();
            this.f173619v = (int) motionEvent.getY();
        }
        return false;
    }

    public a(DragSortListView dragSortListView, int i14, int i15, int i16) {
        this(dragSortListView, i14, i15, i16, 0);
    }

    public a(DragSortListView dragSortListView, int i14, int i15, int i16, int i17) {
        this(dragSortListView, i14, i15, i16, i17, 0);
    }

    public a(DragSortListView dragSortListView) {
        this(dragSortListView, 0, 0, 1);
    }
}
