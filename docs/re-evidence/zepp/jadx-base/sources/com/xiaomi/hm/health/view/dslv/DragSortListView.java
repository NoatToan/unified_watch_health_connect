package com.xiaomi.hm.health.view.dslv;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.Checkable;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.huami.devicex.R;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes22.dex */
public class DragSortListView extends ListView {
    private static final int A0 = 1;
    private static final int B0 = 2;
    private static final int C0 = 3;
    private static final int D0 = 4;
    public static final int DRAG_NEG_X = 2;
    public static final int DRAG_NEG_Y = 8;
    public static final int DRAG_POS_X = 1;
    public static final int DRAG_POS_Y = 4;
    private static final int E0 = 0;
    private static final int F0 = 1;
    private static final int G0 = 2;
    private static final int H0 = 3;
    private static final String I0 = DragSortListView.class.getSimpleName();
    private static final int z0 = 0;
    private View[] A;
    private d B;
    private float C;
    private float D;
    private int E;
    private int F;
    private float G;
    private float H;
    private float I;
    private float J;
    private float K;
    private DragScrollProfile L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private boolean S;
    private boolean T;
    private FloatViewManager U;
    private MotionEvent V;
    private int W;
    private View a;
    private Point b;
    private Point c;
    private int d;
    private boolean e;
    private DataSetObserver f;
    private float g;
    private float h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private int m;
    private float m0;
    private int n;
    private float n0;
    private int o;
    private c o0;
    private int p;
    private boolean p0;
    private int q;
    private boolean q0;
    private DragListener r;
    private f r0;
    private DropListener s;
    private h s0;
    private RemoveListener t;
    private g t0;
    private boolean u;
    private e u0;
    private int v;
    private boolean v0;
    private int w;
    private float w0;
    private int x;
    private boolean x0;
    private int y;
    private boolean y0;
    private int z;

    public interface DragListener {
        void drag(int i, int i2);
    }

    public interface DragScrollProfile {
        float getSpeed(float f, long j);
    }

    public interface DragSortListener extends DropListener, DragListener, RemoveListener {
    }

    public interface DropListener {
        void drop(int i, int i2);
    }

    public interface FloatViewManager {
        View onCreateFloatView(int i);

        void onDestroyFloatView(View view);

        void onDragFloatView(View view, Point point, Point point2);
    }

    public interface RemoveListener {
        void remove(int i);
    }

    public class a implements DragScrollProfile {
        public a() {
        }

        @Override // com.xiaomi.hm.health.view.dslv.DragSortListView.DragScrollProfile
        public float getSpeed(float f, long j) {
            return DragSortListView.this.K * f;
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        private void a() {
            if (DragSortListView.this.v == 4) {
                DragSortListView.this.cancelDrag();
            }
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a();
        }
    }

    public class c extends BaseAdapter {
        private ListAdapter a;

        public class a extends DataSetObserver {
            public final /* synthetic */ DragSortListView a;

            public a(DragSortListView dragSortListView) {
                this.a = dragSortListView;
            }

            @Override // android.database.DataSetObserver
            public void onChanged() {
                c.this.notifyDataSetChanged();
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
                c.this.notifyDataSetInvalidated();
            }
        }

        public c(ListAdapter listAdapter) {
            this.a = listAdapter;
            listAdapter.registerDataSetObserver(new a(DragSortListView.this));
        }

        public ListAdapter a() {
            return this.a;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return this.a.areAllItemsEnabled();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.a.getCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.a.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return this.a.getItemId(i);
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            return this.a.getItemViewType(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            DragSortItemView dragSortItemView;
            if (view != null) {
                dragSortItemView = (DragSortItemView) view;
                View childAt = dragSortItemView.getChildAt(0);
                View view2 = this.a.getView(i, childAt, DragSortListView.this);
                if (view2 != childAt) {
                    if (childAt != null) {
                        dragSortItemView.removeViewAt(0);
                    }
                    dragSortItemView.addView(view2);
                }
            } else {
                View view3 = this.a.getView(i, null, DragSortListView.this);
                DragSortItemView dragSortItemViewCheckable = view3 instanceof Checkable ? new DragSortItemViewCheckable(DragSortListView.this.getContext()) : new DragSortItemView(DragSortListView.this.getContext());
                dragSortItemViewCheckable.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
                dragSortItemViewCheckable.addView(view3);
                dragSortItemView = dragSortItemViewCheckable;
            }
            DragSortListView dragSortListView = DragSortListView.this;
            dragSortListView.H(i + dragSortListView.getHeaderViewsCount(), dragSortItemView, true);
            return dragSortItemView;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return this.a.getViewTypeCount();
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return this.a.hasStableIds();
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i) {
            return this.a.isEnabled(i);
        }
    }

    public class d implements Runnable {
        public static final int m = -1;
        public static final int n = 0;
        public static final int o = 1;
        private boolean a;
        private long b;
        private long c;
        private int d;
        private float e;
        private long f;
        private int g;
        private float h;
        private boolean i = false;
        private int j;
        private int k;

        public d() {
        }

        public int a() {
            if (this.i) {
                return this.g;
            }
            return -1;
        }

        public boolean b() {
            return this.i;
        }

        public void c(int i) {
            if (this.i) {
                return;
            }
            this.a = false;
            this.i = true;
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.f = jUptimeMillis;
            this.b = jUptimeMillis;
            this.g = i;
            DragSortListView.this.post(this);
        }

        public void d(boolean z) {
            if (!z) {
                this.a = true;
            } else {
                DragSortListView.this.removeCallbacks(this);
                this.i = false;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a) {
                this.i = false;
                return;
            }
            int firstVisiblePosition = DragSortListView.this.getFirstVisiblePosition();
            int lastVisiblePosition = DragSortListView.this.getLastVisiblePosition();
            int count = DragSortListView.this.getCount();
            int paddingTop = DragSortListView.this.getPaddingTop();
            int height = (DragSortListView.this.getHeight() - paddingTop) - DragSortListView.this.getPaddingBottom();
            int iMin = Math.min(DragSortListView.this.N, DragSortListView.this.d + DragSortListView.this.y);
            int iMax = Math.max(DragSortListView.this.N, DragSortListView.this.d - DragSortListView.this.y);
            if (this.g == 0) {
                View childAt = DragSortListView.this.getChildAt(0);
                if (childAt == null) {
                    this.i = false;
                    return;
                } else {
                    if (firstVisiblePosition == 0 && childAt.getTop() == paddingTop) {
                        this.i = false;
                        return;
                    }
                    this.h = DragSortListView.this.L.getSpeed((DragSortListView.this.H - iMax) / DragSortListView.this.I, this.b);
                }
            } else {
                View childAt2 = DragSortListView.this.getChildAt(lastVisiblePosition - firstVisiblePosition);
                if (childAt2 == null) {
                    this.i = false;
                    return;
                } else {
                    if (lastVisiblePosition == count - 1 && childAt2.getBottom() <= height + paddingTop) {
                        this.i = false;
                        return;
                    }
                    this.h = -DragSortListView.this.L.getSpeed((iMin - DragSortListView.this.G) / DragSortListView.this.J, this.b);
                }
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.c = jUptimeMillis;
            float f = jUptimeMillis - this.b;
            this.e = f;
            int iRound = Math.round(this.h * f);
            this.d = iRound;
            if (iRound >= 0) {
                this.d = Math.min(height, iRound);
                lastVisiblePosition = firstVisiblePosition;
            } else {
                this.d = Math.max(-height, iRound);
            }
            View childAt3 = DragSortListView.this.getChildAt(lastVisiblePosition - firstVisiblePosition);
            int top = childAt3.getTop() + this.d;
            if (lastVisiblePosition == 0 && top > paddingTop) {
                top = paddingTop;
            }
            DragSortListView.this.p0 = true;
            DragSortListView.this.setSelectionFromTop(lastVisiblePosition, top - paddingTop);
            DragSortListView.this.layoutChildren();
            DragSortListView.this.invalidate();
            DragSortListView.this.p0 = false;
            DragSortListView.this.R(lastVisiblePosition, childAt3, false);
            this.b = this.c;
            DragSortListView.this.post(this);
        }
    }

    public class e extends i {
        private int j;
        private int k;
        private float l;
        private float m;

        public e(float f, int i) {
            super(f, i);
        }

        private int e() {
            int bottom;
            int firstVisiblePosition = DragSortListView.this.getFirstVisiblePosition();
            int dividerHeight = (DragSortListView.this.w + DragSortListView.this.getDividerHeight()) / 2;
            View childAt = DragSortListView.this.getChildAt(this.j - firstVisiblePosition);
            if (childAt == null) {
                cancel();
                return -1;
            }
            int i = this.j;
            int i2 = this.k;
            if (i == i2) {
                return childAt.getTop();
            }
            if (i < i2) {
                bottom = childAt.getTop();
            } else {
                bottom = childAt.getBottom() + dividerHeight;
                dividerHeight = DragSortListView.this.x;
            }
            return bottom - dividerHeight;
        }

        @Override // com.xiaomi.hm.health.view.dslv.DragSortListView.i
        public void a() {
            this.j = DragSortListView.this.i;
            this.k = DragSortListView.this.m;
            DragSortListView.this.v = 2;
            this.l = DragSortListView.this.b.y - e();
            this.m = DragSortListView.this.b.x - DragSortListView.this.getPaddingLeft();
        }

        @Override // com.xiaomi.hm.health.view.dslv.DragSortListView.i
        public void b() {
            DragSortListView.this.W();
        }

        @Override // com.xiaomi.hm.health.view.dslv.DragSortListView.i
        public void c(float f, float f2) {
            int iE = e();
            int paddingLeft = DragSortListView.this.getPaddingLeft();
            float f3 = DragSortListView.this.b.y - iE;
            float f4 = DragSortListView.this.b.x - paddingLeft;
            float f5 = 1.0f - f2;
            if (f5 < Math.abs(f3 / this.l) || f5 < Math.abs(f4 / this.m)) {
                DragSortListView.this.b.y = iE + ((int) (this.l * f5));
                DragSortListView.this.b.x = DragSortListView.this.getPaddingLeft() + ((int) (this.m * f5));
                DragSortListView.this.S(true);
            }
        }
    }

    public class f {
        private SparseIntArray a;
        private ArrayList<Integer> b;
        private int c;

        public f(int i) {
            this.a = new SparseIntArray(i);
            this.b = new ArrayList<>(i);
            this.c = i;
        }

        public void a(int i, int i2) {
            int i3 = this.a.get(i, -1);
            if (i3 != i2) {
                if (i3 != -1) {
                    this.b.remove(Integer.valueOf(i));
                } else if (this.a.size() == this.c) {
                    this.a.delete(this.b.remove(0).intValue());
                }
                this.a.put(i, i2);
                this.b.add(Integer.valueOf(i));
            }
        }

        public void b() {
            this.a.clear();
            this.b.clear();
        }

        public int c(int i) {
            return this.a.get(i, -1);
        }
    }

    public class g extends i {
        private float j;
        private float k;

        public g(float f, int i) {
            super(f, i);
        }

        @Override // com.xiaomi.hm.health.view.dslv.DragSortListView.i
        public void a() {
            this.j = DragSortListView.this.o;
            this.k = DragSortListView.this.y;
        }

        @Override // com.xiaomi.hm.health.view.dslv.DragSortListView.i
        public void c(float f, float f2) {
            if (DragSortListView.this.v != 4) {
                cancel();
                return;
            }
            DragSortListView.this.o = (int) ((this.k * f2) + ((1.0f - f2) * this.j));
            DragSortListView.this.b.y = DragSortListView.this.N - DragSortListView.this.o;
            DragSortListView.this.S(true);
        }
    }

    public class h extends i {
        private float j;
        private float k;
        private float l;
        private int m;
        private int n;
        private int o;
        private int p;
        private int q;

        public h(float f, int i) {
            super(f, i);
            this.m = -1;
            this.n = -1;
        }

        @Override // com.xiaomi.hm.health.view.dslv.DragSortListView.i
        public void a() {
            this.m = -1;
            this.n = -1;
            this.o = DragSortListView.this.j;
            this.p = DragSortListView.this.k;
            this.q = DragSortListView.this.m;
            DragSortListView.this.v = 1;
            this.j = DragSortListView.this.b.x;
            if (!DragSortListView.this.v0) {
                DragSortListView.this.P();
                return;
            }
            float width = DragSortListView.this.getWidth() * 2.0f;
            if (DragSortListView.this.w0 == 0.0f) {
                DragSortListView.this.w0 = (this.j >= 0.0f ? 1 : -1) * width;
                return;
            }
            float f = width * 2.0f;
            if (DragSortListView.this.w0 < 0.0f) {
                float f2 = -f;
                if (DragSortListView.this.w0 > f2) {
                    DragSortListView.this.w0 = f2;
                    return;
                }
            }
            if (DragSortListView.this.w0 <= 0.0f || DragSortListView.this.w0 >= f) {
                return;
            }
            DragSortListView.this.w0 = f;
        }

        @Override // com.xiaomi.hm.health.view.dslv.DragSortListView.i
        public void b() {
            DragSortListView.this.T();
        }

        @Override // com.xiaomi.hm.health.view.dslv.DragSortListView.i
        public void c(float f, float f2) {
            View childAt;
            float f3 = 1.0f - f2;
            int firstVisiblePosition = DragSortListView.this.getFirstVisiblePosition();
            View childAt2 = DragSortListView.this.getChildAt(this.o - firstVisiblePosition);
            if (DragSortListView.this.v0) {
                float fUptimeMillis = (SystemClock.uptimeMillis() - this.a) / 1000.0f;
                if (fUptimeMillis == 0.0f) {
                    return;
                }
                float f4 = DragSortListView.this.w0 * fUptimeMillis;
                int width = DragSortListView.this.getWidth();
                DragSortListView dragSortListView = DragSortListView.this;
                float f5 = dragSortListView.w0;
                float f6 = (DragSortListView.this.w0 > 0.0f ? 1 : -1) * fUptimeMillis;
                float f7 = width;
                dragSortListView.w0 = f5 + (f6 * f7);
                this.j += f4;
                Point point = DragSortListView.this.b;
                float f8 = this.j;
                point.x = (int) f8;
                if (f8 < f7 && f8 > (-width)) {
                    this.a = SystemClock.uptimeMillis();
                    DragSortListView.this.S(true);
                    return;
                }
            }
            if (childAt2 != null) {
                if (this.m == -1) {
                    this.m = DragSortListView.this.Z(this.o, childAt2, false);
                    this.k = childAt2.getHeight() - this.m;
                }
                int iMax = Math.max((int) (this.k * f3), 1);
                ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                layoutParams.height = this.m + iMax;
                childAt2.setLayoutParams(layoutParams);
            }
            int i = this.p;
            if (i == this.o || (childAt = DragSortListView.this.getChildAt(i - firstVisiblePosition)) == null) {
                return;
            }
            if (this.n == -1) {
                this.n = DragSortListView.this.Z(this.p, childAt, false);
                this.l = childAt.getHeight() - this.n;
            }
            int iMax2 = Math.max((int) (f3 * this.l), 1);
            ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
            layoutParams2.height = this.n + iMax2;
            childAt.setLayoutParams(layoutParams2);
        }
    }

    public class i implements Runnable {
        public long a;
        private float b;
        private float c;
        private float d;
        private float e;
        private float f;
        private float g;
        private boolean h;

        public i(float f, int i) {
            this.c = f;
            this.b = i;
            float f2 = 1.0f / ((f * 2.0f) * (1.0f - f));
            this.g = f2;
            this.d = f2;
            this.e = f / ((f - 1.0f) * 2.0f);
            this.f = 1.0f / (1.0f - f);
        }

        public void a() {
        }

        public void b() {
        }

        public void c(float f, float f2) {
        }

        public void cancel() {
            this.h = true;
        }

        public float d(float f) {
            float f2 = this.c;
            if (f < f2) {
                return this.d * f * f;
            }
            if (f < 1.0f - f2) {
                return this.e + (this.f * f);
            }
            float f3 = f - 1.0f;
            return 1.0f - ((this.g * f3) * f3);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.h) {
                return;
            }
            float fUptimeMillis = (SystemClock.uptimeMillis() - this.a) / this.b;
            if (fUptimeMillis >= 1.0f) {
                c(1.0f, 1.0f);
                b();
            } else {
                c(fUptimeMillis, d(fUptimeMillis));
                DragSortListView.this.post(this);
            }
        }

        public void start() {
            this.a = SystemClock.uptimeMillis();
            this.h = false;
            a();
            DragSortListView.this.post(this);
        }
    }

    public DragSortListView(Context context, AttributeSet attributeSet) {
        int i2;
        super(context, attributeSet);
        this.b = new Point();
        this.c = new Point();
        this.e = false;
        this.g = 1.0f;
        this.h = 1.0f;
        this.l = false;
        this.u = true;
        this.v = 0;
        this.w = 1;
        this.z = 0;
        this.A = new View[1];
        this.C = 0.33333334f;
        this.D = 0.33333334f;
        this.K = 0.5f;
        this.L = new a();
        this.R = 0;
        this.S = false;
        this.T = false;
        this.U = null;
        this.W = 0;
        this.m0 = 0.25f;
        this.n0 = 0.0f;
        this.p0 = false;
        this.q0 = false;
        this.r0 = new f(3);
        this.w0 = 0.0f;
        this.x0 = false;
        this.y0 = false;
        int i3 = 150;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.DragSortListView, 0, 0);
            this.w = Math.max(1, typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.DragSortListView_collapsed_height, 1));
            float f2 = typedArrayObtainStyledAttributes.getFloat(R.styleable.DragSortListView_float_alpha, this.g);
            this.g = f2;
            this.h = f2;
            this.u = typedArrayObtainStyledAttributes.getBoolean(R.styleable.DragSortListView_drag_enabled, this.u);
            float fMax = Math.max(0.0f, Math.min(1.0f, 1.0f - typedArrayObtainStyledAttributes.getFloat(R.styleable.DragSortListView_slide_shuffle_speed, 0.75f)));
            this.m0 = fMax;
            this.l = fMax > 0.0f;
            setDragScrollStart(typedArrayObtainStyledAttributes.getFloat(R.styleable.DragSortListView_drag_scroll_start, this.C));
            this.K = typedArrayObtainStyledAttributes.getFloat(R.styleable.DragSortListView_max_drag_scroll_speed, this.K);
            int i4 = typedArrayObtainStyledAttributes.getInt(R.styleable.DragSortListView_remove_animation_duration, 150);
            i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.DragSortListView_drop_animation_duration, 150);
            if (typedArrayObtainStyledAttributes.getBoolean(R.styleable.DragSortListView_use_default_controller, true)) {
                boolean z = typedArrayObtainStyledAttributes.getBoolean(R.styleable.DragSortListView_remove_enabled, false);
                int i5 = typedArrayObtainStyledAttributes.getInt(R.styleable.DragSortListView_remove_mode, 1);
                boolean z2 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.DragSortListView_sort_enabled, true);
                int i6 = typedArrayObtainStyledAttributes.getInt(R.styleable.DragSortListView_drag_start_mode, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.DragSortListView_drag_handle_id, 0);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.DragSortListView_fling_handle_id, 0);
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.DragSortListView_click_remove_id, 0);
                int color = typedArrayObtainStyledAttributes.getColor(R.styleable.DragSortListView_float_background_color, -1);
                DragSortController dragSortController = new DragSortController(this, resourceId, i6, i5, resourceId3, resourceId2);
                dragSortController.setRemoveEnabled(z);
                dragSortController.setSortEnabled(z2);
                dragSortController.setBackgroundColor(color);
                this.U = dragSortController;
                setOnTouchListener(dragSortController);
            }
            typedArrayObtainStyledAttributes.recycle();
            i3 = i4;
        } else {
            i2 = 150;
        }
        this.B = new d();
        if (i3 > 0) {
            this.s0 = new h(0.5f, i3);
        }
        if (i2 > 0) {
            this.u0 = new e(0.5f, i2);
        }
        this.V = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        this.f = new b();
    }

    private void F() {
        int firstVisiblePosition = getFirstVisiblePosition();
        int lastVisiblePosition = getLastVisiblePosition();
        int iMin = Math.min(lastVisiblePosition - firstVisiblePosition, ((getCount() - 1) - getFooterViewsCount()) - firstVisiblePosition);
        for (int iMax = Math.max(0, getHeaderViewsCount() - firstVisiblePosition); iMax <= iMin; iMax++) {
            View childAt = getChildAt(iMax);
            if (childAt != null) {
                H(firstVisiblePosition + iMax, childAt, false);
            }
        }
    }

    private void G(int i2) {
        View childAt = getChildAt(i2 - getFirstVisiblePosition());
        if (childAt != null) {
            H(i2, childAt, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(int i2, View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iM = (i2 == this.m || i2 == this.j || i2 == this.k) ? M(i2, view, z) : -2;
        if (iM != layoutParams.height) {
            layoutParams.height = iM;
            view.setLayoutParams(layoutParams);
        }
        if (i2 == this.j || i2 == this.k) {
            int i3 = this.m;
            if (i2 < i3) {
                ((DragSortItemView) view).setGravity(80);
            } else if (i2 > i3) {
                ((DragSortItemView) view).setGravity(48);
            }
        }
        int visibility = view.getVisibility();
        int i4 = 0;
        if (i2 == this.m && this.a != null) {
            i4 = 4;
        }
        if (i4 != visibility) {
            view.setVisibility(i4);
        }
    }

    private void I() {
        int firstVisiblePosition = getFirstVisiblePosition();
        if (this.m < firstVisiblePosition) {
            View childAt = getChildAt(0);
            setSelectionFromTop(firstVisiblePosition - 1, (childAt != null ? childAt.getTop() : 0) - getPaddingTop());
        }
    }

    private int J(int i2, View view, int i3, int i4) {
        int i5;
        int i6;
        int iY = Y(i2);
        int height = view.getHeight();
        int iL = L(i2, iY);
        int i7 = this.m;
        if (i2 != i7) {
            i5 = height - iY;
            i6 = iL - iY;
        } else {
            i5 = height;
            i6 = iL;
        }
        int i8 = this.x;
        int i9 = this.j;
        if (i7 != i9 && i7 != this.k) {
            i8 -= this.w;
        }
        if (i2 <= i3) {
            if (i2 > i9) {
                return 0 + (i8 - i6);
            }
            return 0;
        }
        if (i2 == i4) {
            if (i2 <= i9) {
                i5 -= i8;
            } else if (i2 == this.k) {
                return 0 + (height - iL);
            }
            return 0 + i5;
        }
        if (i2 <= i9) {
            return 0 - i8;
        }
        if (i2 == this.k) {
            return 0 - i6;
        }
        return 0;
    }

    private static int K(SparseBooleanArray sparseBooleanArray, int i2, int i3, int[] iArr, int[] iArr2) {
        int iKeyAt;
        int iX = X(sparseBooleanArray, i2, i3);
        if (iX == -1) {
            return 0;
        }
        int iKeyAt2 = sparseBooleanArray.keyAt(iX);
        int i4 = iKeyAt2 + 1;
        int i5 = 0;
        for (int i6 = iX + 1; i6 < sparseBooleanArray.size() && (iKeyAt = sparseBooleanArray.keyAt(i6)) < i3; i6++) {
            if (sparseBooleanArray.valueAt(i6)) {
                if (iKeyAt == i4) {
                    i4++;
                } else {
                    iArr[i5] = iKeyAt2;
                    iArr2[i5] = i4;
                    i5++;
                    i4 = iKeyAt + 1;
                    iKeyAt2 = iKeyAt;
                }
            }
        }
        if (i4 == i3) {
            i4 = i2;
        }
        iArr[i5] = iKeyAt2;
        iArr2[i5] = i4;
        int i7 = i5 + 1;
        if (i7 <= 1 || iArr[0] != i2) {
            return i7;
        }
        int i8 = i7 - 1;
        if (iArr2[i8] != i2) {
            return i7;
        }
        iArr[0] = iArr[i8];
        return i7 - 1;
    }

    private int L(int i2, int i3) {
        getDividerHeight();
        boolean z = this.l && this.j != this.k;
        int i4 = this.x;
        int i5 = this.w;
        int i6 = i4 - i5;
        int i7 = (int) (this.n0 * i6);
        int i8 = this.m;
        if (i2 == i8) {
            if (i8 == this.j) {
                return z ? i7 + i5 : i4;
            }
            return i8 == this.k ? i4 - i7 : i5;
        }
        if (i2 == this.j) {
            return z ? i3 + i7 : i3 + i6;
        }
        return i2 == this.k ? (i3 + i6) - i7 : i3;
    }

    private int M(int i2, View view, boolean z) {
        return L(i2, Z(i2, view, z));
    }

    private void N() {
        this.m = -1;
        this.j = -1;
        this.k = -1;
        this.i = -1;
    }

    private void O(int i2, int i3) {
        Point point = this.b;
        point.x = i2 - this.n;
        point.y = i3 - this.o;
        S(true);
        int iMin = Math.min(i3, this.d + this.y);
        int iMax = Math.max(i3, this.d - this.y);
        int iA = this.B.a();
        int i4 = this.P;
        if (iMin > i4 && iMin > this.F && iA != 1) {
            if (iA != -1) {
                this.B.d(true);
            }
            this.B.c(1);
        } else if (iMax < i4 && iMax < this.E && iA != 0) {
            if (iA != -1) {
                this.B.d(true);
            }
            this.B.c(0);
        } else {
            if (iMax < this.E || iMin > this.F || !this.B.b()) {
                return;
            }
            this.B.d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        View view = this.a;
        if (view != null) {
            view.setVisibility(8);
            FloatViewManager floatViewManager = this.U;
            if (floatViewManager != null) {
                floatViewManager.onDestroyFloatView(this.a);
            }
            this.a = null;
            invalidate();
        }
    }

    private void Q() {
        this.W = 0;
        this.T = false;
        if (this.v == 3) {
            this.v = 0;
        }
        this.h = this.g;
        this.x0 = false;
        this.r0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(int i2, View view, boolean z) {
        this.p0 = true;
        j0();
        int i3 = this.j;
        int i4 = this.k;
        boolean zK0 = k0();
        if (zK0) {
            F();
            setSelectionFromTop(i2, (view.getTop() + J(i2, view, i3, i4)) - getPaddingTop());
            layoutChildren();
        }
        if (zK0 || z) {
            invalidate();
        }
        this.p0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(boolean z) {
        int firstVisiblePosition = getFirstVisiblePosition() + (getChildCount() / 2);
        View childAt = getChildAt(getChildCount() / 2);
        if (childAt == null) {
            return;
        }
        R(firstVisiblePosition, childAt, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        U(this.m - getHeaderViewsCount());
    }

    private void U(int i2) {
        this.v = 1;
        RemoveListener removeListener = this.t;
        if (removeListener != null) {
            removeListener.remove(i2);
        }
        P();
        I();
        N();
        if (this.T) {
            this.v = 3;
        } else {
            this.v = 0;
        }
    }

    private void V(int i2, Canvas canvas) {
        ViewGroup viewGroup;
        int i3;
        int top;
        Drawable divider = getDivider();
        int dividerHeight = getDividerHeight();
        if (divider == null || dividerHeight == 0 || (viewGroup = (ViewGroup) getChildAt(i2 - getFirstVisiblePosition())) == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int height = viewGroup.getChildAt(0).getHeight();
        if (i2 > this.m) {
            top = viewGroup.getTop() + height;
            i3 = dividerHeight + top;
        } else {
            int bottom = viewGroup.getBottom() - height;
            int i4 = bottom - dividerHeight;
            i3 = bottom;
            top = i4;
        }
        canvas.save();
        canvas.clipRect(paddingLeft, top, width, i3);
        divider.setBounds(paddingLeft, top, width, i3);
        divider.draw(canvas);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        int i2;
        HMLog.d(I0, "dropFloatView... " + this.i + " getCount " + getCount(), new Object[0]);
        this.v = 2;
        if (this.s != null && (i2 = this.i) >= 0 && i2 < getCount()) {
            int headerViewsCount = getHeaderViewsCount();
            this.s.drop(this.m - headerViewsCount, this.i - headerViewsCount);
        }
        P();
        I();
        N();
        F();
        if (this.T) {
            this.v = 3;
        } else {
            this.v = 0;
        }
    }

    private static int X(SparseBooleanArray sparseBooleanArray, int i2, int i3) {
        int size = sparseBooleanArray.size();
        int iC0 = c0(sparseBooleanArray, i2);
        while (iC0 < size && sparseBooleanArray.keyAt(iC0) < i3 && !sparseBooleanArray.valueAt(iC0)) {
            iC0++;
        }
        if (iC0 == size || sparseBooleanArray.keyAt(iC0) >= i3) {
            return -1;
        }
        return iC0;
    }

    private int Y(int i2) {
        View view;
        if (i2 == this.m) {
            return 0;
        }
        View childAt = getChildAt(i2 - getFirstVisiblePosition());
        if (childAt != null) {
            return Z(i2, childAt, false);
        }
        int iC = this.r0.c(i2);
        if (iC != -1) {
            return iC;
        }
        ListAdapter adapter = getAdapter();
        int itemViewType = adapter.getItemViewType(i2);
        int viewTypeCount = adapter.getViewTypeCount();
        if (viewTypeCount != this.A.length) {
            this.A = new View[viewTypeCount];
        }
        if (itemViewType >= 0) {
            View[] viewArr = this.A;
            if (viewArr[itemViewType] == null) {
                view = adapter.getView(i2, null, this);
                this.A[itemViewType] = view;
            } else {
                view = adapter.getView(i2, viewArr[itemViewType], this);
            }
        } else {
            view = adapter.getView(i2, null, this);
        }
        int iZ = Z(i2, view, true);
        this.r0.a(i2, iZ);
        return iZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int Z(int i2, View view, boolean z) {
        int i3;
        if (i2 == this.m) {
            return 0;
        }
        if (i2 >= getHeaderViewsCount() && i2 < getCount() - getFooterViewsCount()) {
            view = ((ViewGroup) view).getChildAt(0);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && (i3 = layoutParams.height) > 0) {
            return i3;
        }
        int height = view.getHeight();
        if (height != 0 && !z) {
            return height;
        }
        f0(view);
        return view.getMeasuredHeight();
    }

    private int a0(int i2) {
        View childAt = getChildAt(i2 - getFirstVisiblePosition());
        return childAt != null ? childAt.getHeight() : L(i2, Y(i2));
    }

    private int b0(int i2, int i3) {
        int headerViewsCount = getHeaderViewsCount();
        int footerViewsCount = getFooterViewsCount();
        if (i2 <= headerViewsCount || i2 >= getCount() - footerViewsCount) {
            return i3;
        }
        int dividerHeight = getDividerHeight();
        int i4 = this.x - this.w;
        int iY = Y(i2);
        int iA0 = a0(i2);
        int i5 = this.k;
        int i6 = this.m;
        if (i5 <= i6) {
            if (i2 != i5 || this.j == i5) {
                if (i2 > i5 && i2 <= i6) {
                }
            } else if (i2 == i6) {
                i3 += iA0;
                i4 = this.x;
            } else {
                i3 += iA0 - iY;
            }
            i3 -= i4;
        } else if (i2 > i6 && i2 <= this.j) {
            i3 += i4;
        } else if (i2 == i5 && this.j != i5) {
            i3 += iA0 - iY;
        }
        return i2 <= i6 ? i3 + (((this.x - dividerHeight) - Y(i2 - 1)) / 2) : i3 + (((iY - dividerHeight) - this.x) / 2);
    }

    private static int c0(SparseBooleanArray sparseBooleanArray, int i2) {
        int size = sparseBooleanArray.size();
        int i3 = 0;
        while (size - i3 > 0) {
            int i4 = (i3 + size) >> 1;
            if (sparseBooleanArray.keyAt(i4) < i2) {
                i3 = i4 + 1;
            } else {
                size = i4;
            }
        }
        return i3;
    }

    private void d0() {
        this.y0 = true;
    }

    private void e0() {
        View view = this.a;
        if (view != null) {
            f0(view);
            int measuredHeight = this.a.getMeasuredHeight();
            this.x = measuredHeight;
            this.y = measuredHeight / 2;
        }
    }

    private void f0(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new AbsListView.LayoutParams(-1, -2);
            view.setLayoutParams(layoutParams);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(this.z, getListPaddingLeft() + getListPaddingRight(), layoutParams.width);
        int i2 = layoutParams.height;
        view.measure(childMeasureSpec, i2 > 0 ? View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    private void g0() {
        Log.d("mobeta", "mSrcPos=" + this.m + " mFirstExpPos=" + this.j + " mSecondExpPos=" + this.k);
    }

    private static int h0(int i2, int i3, int i4, int i5) {
        int i6 = i5 - i4;
        int i7 = i2 + i3;
        if (i7 < i4) {
            return i7 + i6;
        }
        return i7 >= i5 ? i7 - i6 : i7;
    }

    private void i0(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            this.O = this.M;
            this.P = this.N;
        }
        this.M = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        this.N = y;
        if (action == 0) {
            this.O = this.M;
            this.P = y;
        }
        this.p = ((int) motionEvent.getRawX()) - this.M;
        this.q = ((int) motionEvent.getRawY()) - this.N;
    }

    private void j0() {
        int i2;
        int i3;
        if (this.U != null) {
            this.c.set(this.M, this.N);
            this.U.onDragFloatView(this.a, this.b, this.c);
        }
        Point point = this.b;
        int i4 = point.x;
        int i5 = point.y;
        int paddingLeft = getPaddingLeft();
        int i6 = this.R;
        if ((i6 & 1) == 0 && i4 > paddingLeft) {
            this.b.x = paddingLeft;
        } else if ((i6 & 2) == 0 && i4 < paddingLeft) {
            this.b.x = paddingLeft;
        }
        int headerViewsCount = getHeaderViewsCount();
        int footerViewsCount = getFooterViewsCount();
        int firstVisiblePosition = getFirstVisiblePosition();
        int lastVisiblePosition = getLastVisiblePosition();
        int paddingTop = getPaddingTop();
        if (firstVisiblePosition < headerViewsCount) {
            paddingTop = getChildAt((headerViewsCount - firstVisiblePosition) - 1).getBottom();
        }
        if ((this.R & 8) == 0 && firstVisiblePosition <= (i3 = this.m)) {
            paddingTop = Math.max(getChildAt(i3 - firstVisiblePosition).getTop(), paddingTop);
        }
        int height = getHeight() - getPaddingBottom();
        if (lastVisiblePosition >= (getCount() - footerViewsCount) - 1) {
            height = getChildAt(((getCount() - footerViewsCount) - 1) - firstVisiblePosition).getBottom();
        }
        if ((this.R & 4) == 0 && lastVisiblePosition >= (i2 = this.m)) {
            height = Math.min(getChildAt(i2 - firstVisiblePosition).getBottom(), height);
        }
        if (i5 < paddingTop) {
            this.b.y = paddingTop;
        } else {
            int i7 = this.x;
            if (i5 + i7 > height) {
                this.b.y = height - i7;
            }
        }
        this.d = this.b.y + this.y;
    }

    private boolean k0() {
        int i2;
        int i3;
        int firstVisiblePosition = getFirstVisiblePosition();
        int count = this.j;
        View childAt = getChildAt(count - firstVisiblePosition);
        if (childAt == null) {
            count = (getChildCount() / 2) + firstVisiblePosition;
            childAt = getChildAt(count - firstVisiblePosition);
        }
        int top = childAt.getTop();
        int height = childAt.getHeight();
        int iB0 = b0(count, top);
        int dividerHeight = getDividerHeight();
        if (this.d >= iB0) {
            int count2 = getCount();
            while (true) {
                if (count >= count2) {
                    i3 = iB0;
                    break;
                }
                if (count == count2 - 1) {
                    i2 = top + dividerHeight + height;
                    int i4 = iB0;
                    iB0 = i2;
                    i3 = i4;
                    break;
                }
                top += height + dividerHeight;
                int i5 = count + 1;
                int iA0 = a0(i5);
                int iB1 = b0(i5, top);
                if (this.d < iB1) {
                    i3 = iB0;
                    iB0 = iB1;
                    break;
                }
                count = i5;
                height = iA0;
                iB0 = iB1;
            }
        } else {
            while (true) {
                if (count < 0) {
                    i3 = iB0;
                    break;
                }
                count--;
                int iA1 = a0(count);
                if (count == 0) {
                    i2 = (top - dividerHeight) - iA1;
                    int i6 = iB0;
                    iB0 = i2;
                    i3 = i6;
                    break;
                }
                top -= iA1 + dividerHeight;
                int iB2 = b0(count, top);
                if (this.d >= iB2) {
                    i3 = iB0;
                    iB0 = iB2;
                    break;
                }
                iB0 = iB2;
            }
        }
        int headerViewsCount = getHeaderViewsCount();
        int footerViewsCount = getFooterViewsCount();
        int i7 = this.j;
        int i8 = this.k;
        float f2 = this.n0;
        if (this.l) {
            int iAbs = Math.abs(iB0 - i3);
            int i9 = this.d;
            if (i9 < iB0) {
                int i10 = iB0;
                iB0 = i3;
                i3 = i10;
            }
            int i11 = (int) (this.m0 * 0.5f * iAbs);
            float f3 = i11;
            int i12 = iB0 + i11;
            int i13 = i3 - i11;
            if (i9 < i12) {
                this.j = count - 1;
                this.k = count;
                this.n0 = ((i12 - i9) * 0.5f) / f3;
            } else if (i9 < i13) {
                this.j = count;
                this.k = count;
            } else {
                this.j = count;
                this.k = count + 1;
                this.n0 = (((i3 - i9) / f3) + 1.0f) * 0.5f;
            }
        } else {
            this.j = count;
            this.k = count;
        }
        if (this.j < headerViewsCount) {
            this.j = headerViewsCount;
            this.k = headerViewsCount;
            count = headerViewsCount;
        } else if (this.k >= getCount() - footerViewsCount) {
            count = (getCount() - footerViewsCount) - 1;
            this.j = count;
            this.k = count;
        }
        boolean z = (this.j == i7 && this.k == i8 && this.n0 == f2) ? false : true;
        int i14 = this.i;
        if (count == i14) {
            return z;
        }
        DragListener dragListener = this.r;
        if (dragListener != null) {
            dragListener.drag(i14 - headerViewsCount, count - headerViewsCount);
        }
        this.i = count;
        return true;
    }

    private void l0() {
        int paddingTop = getPaddingTop();
        int height = (getHeight() - paddingTop) - getPaddingBottom();
        float f2 = height;
        float f3 = paddingTop;
        float f4 = (this.C * f2) + f3;
        this.H = f4;
        float f5 = ((1.0f - this.D) * f2) + f3;
        this.G = f5;
        this.E = (int) f4;
        this.F = (int) f5;
        this.I = f4 - f3;
        this.J = (paddingTop + height) - f5;
    }

    public void cancelDrag() {
        if (this.v == 4) {
            this.B.d(true);
            P();
            N();
            F();
            if (this.T) {
                this.v = 3;
            } else {
                this.v = 0;
            }
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f2;
        super.dispatchDraw(canvas);
        if (this.v != 0) {
            int i2 = this.j;
            if (i2 != this.m) {
                V(i2, canvas);
            }
            int i3 = this.k;
            if (i3 != this.j && i3 != this.m) {
                V(i3, canvas);
            }
        }
        View view = this.a;
        if (view != null) {
            int width = view.getWidth();
            int height = this.a.getHeight();
            int i4 = this.b.x;
            int width2 = getWidth();
            if (i4 < 0) {
                i4 = -i4;
            }
            if (i4 < width2) {
                float f3 = (width2 - i4) / width2;
                f2 = f3 * f3;
            } else {
                f2 = 0.0f;
            }
            int i5 = (int) (this.h * 255.0f * f2);
            canvas.save();
            Point point = this.b;
            canvas.translate(point.x, point.y);
            canvas.clipRect(0, 0, width, height);
            canvas.saveLayerAlpha(0.0f, 0.0f, width, height, i5, 31);
            this.a.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    public float getFloatAlpha() {
        return this.h;
    }

    public ListAdapter getInputAdapter() {
        c cVar = this.o0;
        if (cVar == null) {
            return null;
        }
        return cVar.a();
    }

    public boolean isDragEnabled() {
        return this.u;
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public void layoutChildren() {
        super.layoutChildren();
        View view = this.a;
        if (view != null) {
            if (view.isLayoutRequested() && !this.e) {
                e0();
            }
            View view2 = this.a;
            view2.layout(0, 0, view2.getMeasuredWidth(), this.a.getMeasuredHeight());
            this.e = false;
        }
    }

    public boolean listViewIntercepted() {
        return this.x0;
    }

    public void moveCheckState(int i2, int i3) {
        int i4;
        int i5;
        SparseBooleanArray checkedItemPositions = getCheckedItemPositions();
        if (i3 < i2) {
            i5 = i2;
            i4 = i3;
        } else {
            i4 = i2;
            i5 = i3;
        }
        int i6 = i5 + 1;
        int[] iArr = new int[checkedItemPositions.size()];
        int[] iArr2 = new int[checkedItemPositions.size()];
        int iK = K(checkedItemPositions, i4, i6, iArr, iArr2);
        if (iK == 1 && iArr[0] == iArr2[0]) {
            return;
        }
        if (i2 < i3) {
            for (int i7 = 0; i7 != iK; i7++) {
                setItemChecked(h0(iArr[i7], -1, i4, i6), true);
                setItemChecked(h0(iArr2[i7], -1, i4, i6), false);
            }
            return;
        }
        for (int i8 = 0; i8 != iK; i8++) {
            setItemChecked(iArr[i8], false);
            setItemChecked(iArr2[i8], true);
        }
    }

    public void moveItem(int i2, int i3) {
        if (this.s != null) {
            int count = getInputAdapter().getCount();
            if (i2 < 0 || i2 >= count || i3 < 0 || i3 >= count) {
                return;
            }
            this.s.drop(i2, i3);
        }
    }

    public boolean onDragTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        int action = motionEvent.getAction() & 255;
        if (action == 1) {
            if (this.v == 4) {
                stopDrag(false);
            }
            Q();
        } else if (action == 2) {
            O((int) motionEvent.getX(), (int) motionEvent.getY());
        } else if (action == 3) {
            if (this.v == 4) {
                cancelDrag();
            }
            Q();
        }
        return true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.u) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        i0(motionEvent);
        this.S = true;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            if (this.v != 0) {
                this.q0 = true;
                return true;
            }
            this.T = true;
        }
        if (this.a != null) {
            z = true;
        } else {
            if (super.onInterceptTouchEvent(motionEvent)) {
                this.x0 = true;
                z = true;
            } else {
                z = false;
            }
            if (action == 1 || action == 3) {
                Q();
            } else if (z) {
                this.W = 1;
            } else {
                this.W = 2;
            }
        }
        if (action == 1 || action == 3) {
            this.T = false;
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        View view = this.a;
        if (view != null) {
            if (view.isLayoutRequested()) {
                e0();
            }
            this.e = true;
        }
        this.z = i2;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        l0();
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.q0) {
            this.q0 = false;
            return false;
        }
        if (!this.u) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z2 = this.S;
        this.S = false;
        if (!z2) {
            i0(motionEvent);
        }
        int i2 = this.v;
        if (i2 == 4) {
            onDragTouchEvent(motionEvent);
            return true;
        }
        if (i2 == 0 && super.onTouchEvent(motionEvent)) {
            z = true;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            Q();
        } else if (z) {
            this.W = 1;
        }
        return z;
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public void removeCheckState(int i2) {
        SparseBooleanArray checkedItemPositions = getCheckedItemPositions();
        if (checkedItemPositions.size() == 0) {
            return;
        }
        int[] iArr = new int[checkedItemPositions.size()];
        int[] iArr2 = new int[checkedItemPositions.size()];
        int iKeyAt = checkedItemPositions.keyAt(checkedItemPositions.size() - 1) + 1;
        int iK = K(checkedItemPositions, i2, iKeyAt, iArr, iArr2);
        for (int i3 = 0; i3 != iK; i3++) {
            if (iArr[i3] != i2 && (iArr2[i3] >= iArr[i3] || iArr2[i3] <= i2)) {
                setItemChecked(h0(iArr[i3], -1, i2, iKeyAt), true);
            }
            setItemChecked(h0(iArr2[i3], -1, i2, iKeyAt), false);
        }
    }

    public void removeItem(int i2) {
        this.v0 = false;
        removeItem(i2, 0.0f);
    }

    @Override // android.widget.AbsListView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.p0) {
            return;
        }
        super.requestLayout();
    }

    public void setDragEnabled(boolean z) {
        this.u = z;
    }

    public void setDragListener(DragListener dragListener) {
        this.r = dragListener;
    }

    public void setDragScrollProfile(DragScrollProfile dragScrollProfile) {
        if (dragScrollProfile != null) {
            this.L = dragScrollProfile;
        }
    }

    public void setDragScrollStart(float f2) {
        setDragScrollStarts(f2, f2);
    }

    public void setDragScrollStarts(float f2, float f3) {
        if (f3 > 0.5f) {
            this.D = 0.5f;
        } else {
            this.D = f3;
        }
        if (f2 > 0.5f) {
            this.C = 0.5f;
        } else {
            this.C = f2;
        }
        if (getHeight() != 0) {
            l0();
        }
    }

    public void setDragSortListener(DragSortListener dragSortListener) {
        setDropListener(dragSortListener);
        setDragListener(dragSortListener);
        setRemoveListener(dragSortListener);
    }

    public void setDropListener(DropListener dropListener) {
        this.s = dropListener;
    }

    public void setFloatAlpha(float f2) {
        this.h = f2;
    }

    public void setFloatViewManager(FloatViewManager floatViewManager) {
        this.U = floatViewManager;
    }

    public void setMaxScrollSpeed(float f2) {
        this.K = f2;
    }

    public void setRemoveListener(RemoveListener removeListener) {
        this.t = removeListener;
    }

    public boolean startDrag(int i2, int i3, int i4, int i5) {
        FloatViewManager floatViewManager;
        View viewOnCreateFloatView;
        if (!this.T || (floatViewManager = this.U) == null || (viewOnCreateFloatView = floatViewManager.onCreateFloatView(i2)) == null) {
            return false;
        }
        return startDrag(i2, viewOnCreateFloatView, i3, i4, i5);
    }

    public boolean stopDrag(boolean z) {
        this.v0 = false;
        return stopDrag(z, 0.0f);
    }

    public boolean stopDragWithVelocity(boolean z, float f2) {
        this.v0 = true;
        return stopDrag(z, f2);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        if (listAdapter != null) {
            this.o0 = new c(listAdapter);
            listAdapter.registerDataSetObserver(this.f);
            if (listAdapter instanceof DropListener) {
                setDropListener((DropListener) listAdapter);
            }
            if (listAdapter instanceof DragListener) {
                setDragListener((DragListener) listAdapter);
            }
            if (listAdapter instanceof RemoveListener) {
                setRemoveListener((RemoveListener) listAdapter);
            }
        } else {
            this.o0 = null;
        }
        super.setAdapter((ListAdapter) this.o0);
    }

    public void removeItem(int i2, float f2) {
        int i3 = this.v;
        if (i3 == 0 || i3 == 4) {
            if (i3 == 0) {
                int headerViewsCount = getHeaderViewsCount() + i2;
                this.m = headerViewsCount;
                this.j = headerViewsCount;
                this.k = headerViewsCount;
                this.i = headerViewsCount;
                View childAt = getChildAt(headerViewsCount - getFirstVisiblePosition());
                if (childAt != null) {
                    childAt.setVisibility(4);
                }
            }
            this.v = 1;
            this.w0 = f2;
            if (this.T) {
                int i4 = this.W;
                if (i4 == 1) {
                    super.onTouchEvent(this.V);
                } else if (i4 == 2) {
                    super.onInterceptTouchEvent(this.V);
                }
            }
            h hVar = this.s0;
            if (hVar != null) {
                hVar.start();
            } else {
                U(i2);
            }
        }
    }

    public boolean stopDrag(boolean z, float f2) {
        if (this.a == null) {
            return false;
        }
        this.B.d(true);
        if (z) {
            removeItem(this.m - getHeaderViewsCount(), f2);
        } else {
            e eVar = this.u0;
            if (eVar != null) {
                eVar.start();
            } else {
                W();
            }
        }
        return true;
    }

    public boolean startDrag(int i2, View view, int i3, int i4, int i5) {
        if (this.v != 0 || !this.T || this.a != null || view == null || !this.u) {
            return false;
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int headerViewsCount = i2 + getHeaderViewsCount();
        this.j = headerViewsCount;
        this.k = headerViewsCount;
        this.m = headerViewsCount;
        this.i = headerViewsCount;
        this.v = 4;
        this.R = 0;
        this.R = i3 | 0;
        this.a = view;
        e0();
        this.n = i4;
        this.o = i5;
        int i6 = this.N;
        this.Q = i6;
        Point point = this.b;
        point.x = this.M - i4;
        point.y = i6 - i5;
        View childAt = getChildAt(this.m - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setVisibility(4);
        }
        int i7 = this.W;
        if (i7 == 1) {
            super.onTouchEvent(this.V);
        } else if (i7 == 2) {
            super.onInterceptTouchEvent(this.V);
        }
        requestLayout();
        g gVar = this.t0;
        if (gVar != null) {
            gVar.start();
        }
        return true;
    }
}
