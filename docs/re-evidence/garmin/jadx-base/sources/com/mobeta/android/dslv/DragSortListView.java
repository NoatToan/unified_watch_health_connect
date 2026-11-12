package com.mobeta.android.dslv;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import j20.x;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import r22.j1;

/* JADX INFO: loaded from: classes3.dex */
public class DragSortListView extends ListView {

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final /* synthetic */ int f54625f1 = 0;
    public View[] A;
    public final f B;
    public float C;
    public float D;
    public int E;
    public int F;
    public float H0;
    public float I;
    public e I0;
    public int J0;
    public int K0;
    public int L0;
    public int M0;
    public boolean N0;
    public boolean O0;
    public float P;
    public k P0;
    public final MotionEvent Q0;
    public int R0;
    public final float S0;
    public float T;
    public float T0;
    public c U0;
    public final boolean V0;
    public final h W0;
    public boolean X0;
    public boolean Y0;
    public final l Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f54626a;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final m f54627a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Point f54628b;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final i f54629b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Point f54630c;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public boolean f54631c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f54632d;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public float f54633d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f54634e;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public boolean f54635e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f54636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f54637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f54638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f54639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f54640j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f54641k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public float f54642k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f54643l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f54644m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f54645n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f54646o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d f54647p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public j f54648q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public n f54649r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f54650t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f54651v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f54652w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f54653x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f54654y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f54655z;

    public class a implements e {
        public a() {
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            DragSortListView dragSortListView = DragSortListView.this;
            if (dragSortListView.f54651v == 4) {
                dragSortListView.f();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            DragSortListView dragSortListView = DragSortListView.this;
            if (dragSortListView.f54651v == 4) {
                dragSortListView.f();
            }
        }
    }

    public class c extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ListAdapter f54658a;

        public class a extends DataSetObserver {
            public a(DragSortListView dragSortListView) {
            }

            @Override // android.database.DataSetObserver
            public final void onChanged() {
                c.this.notifyDataSetChanged();
            }

            @Override // android.database.DataSetObserver
            public final void onInvalidated() {
                c.this.notifyDataSetInvalidated();
            }
        }

        public c(ListAdapter listAdapter) {
            this.f54658a = listAdapter;
            listAdapter.registerDataSetObserver(new a(DragSortListView.this));
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            return this.f54658a.areAllItemsEnabled();
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return this.f54658a.getCount();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i14) {
            return this.f54658a.getItem(i14);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i14) {
            return this.f54658a.getItemId(i14);
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getItemViewType(int i14) {
            return this.f54658a.getItemViewType(i14);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.widget.Adapter
        public final View getView(int i14, View view2, ViewGroup viewGroup) {
            uz2.b bVar;
            ListAdapter listAdapter = this.f54658a;
            DragSortListView dragSortListView = DragSortListView.this;
            if (view2 != null) {
                bVar = (uz2.b) view2;
                View childAt = bVar.getChildAt(0);
                View view3 = listAdapter.getView(i14, childAt, dragSortListView);
                if (view3 != childAt) {
                    if (childAt != null) {
                        bVar.removeViewAt(0);
                    }
                    bVar.addView(view3);
                }
            } else {
                View view4 = listAdapter.getView(i14, null, dragSortListView);
                uz2.b cVar = view4 instanceof Checkable ? new uz2.c(dragSortListView.getContext()) : new uz2.b(dragSortListView.getContext());
                cVar.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
                cVar.addView(view4);
                bVar = cVar;
            }
            int headerViewsCount = dragSortListView.getHeaderViewsCount() + i14;
            int i15 = DragSortListView.f54625f1;
            dragSortListView.b(bVar, headerViewsCount, true);
            return bVar;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getViewTypeCount() {
            return this.f54658a.getViewTypeCount();
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return this.f54658a.hasStableIds();
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean isEmpty() {
            return this.f54658a.isEmpty();
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean isEnabled(int i14) {
            return this.f54658a.isEnabled(i14);
        }
    }

    public interface d {
        void a(int i14, int i15);
    }

    public interface e {
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f54661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f54662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f54663c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f54664d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f54665e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f54666f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f54667g = false;

        public f() {
        }

        public final void a() {
            DragSortListView.this.removeCallbacks(this);
            this.f54667g = false;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f54661a) {
                this.f54667g = false;
                return;
            }
            DragSortListView dragSortListView = DragSortListView.this;
            int firstVisiblePosition = dragSortListView.getFirstVisiblePosition();
            int lastVisiblePosition = dragSortListView.getLastVisiblePosition();
            int count = dragSortListView.getCount();
            int paddingTop = dragSortListView.getPaddingTop();
            int height = (dragSortListView.getHeight() - paddingTop) - dragSortListView.getPaddingBottom();
            int iMin = Math.min(dragSortListView.K0, dragSortListView.f54632d + dragSortListView.f54654y);
            int iMax = Math.max(dragSortListView.K0, dragSortListView.f54632d - dragSortListView.f54654y);
            if (this.f54665e == 0) {
                View childAt = dragSortListView.getChildAt(0);
                if (childAt == null) {
                    this.f54667g = false;
                    return;
                } else if (firstVisiblePosition == 0 && childAt.getTop() == paddingTop) {
                    this.f54667g = false;
                    return;
                } else {
                    this.f54666f = DragSortListView.this.H0 * ((dragSortListView.P - iMax) / dragSortListView.T);
                }
            } else {
                View childAt2 = dragSortListView.getChildAt(lastVisiblePosition - firstVisiblePosition);
                if (childAt2 == null) {
                    this.f54667g = false;
                    return;
                } else if (lastVisiblePosition == count - 1 && childAt2.getBottom() <= height + paddingTop) {
                    this.f54667g = false;
                    return;
                } else {
                    this.f54666f = -(DragSortListView.this.H0 * ((iMin - dragSortListView.I) / dragSortListView.f54642k0));
                }
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.f54663c = jUptimeMillis;
            int iRound = Math.round(this.f54666f * (jUptimeMillis - this.f54662b));
            this.f54664d = iRound;
            if (iRound >= 0) {
                this.f54664d = Math.min(height, iRound);
                lastVisiblePosition = firstVisiblePosition;
            } else {
                this.f54664d = Math.max(-height, iRound);
            }
            View childAt3 = dragSortListView.getChildAt(lastVisiblePosition - firstVisiblePosition);
            int top = childAt3.getTop() + this.f54664d;
            if (lastVisiblePosition == 0 && top > paddingTop) {
                top = paddingTop;
            }
            dragSortListView.X0 = true;
            dragSortListView.setSelectionFromTop(lastVisiblePosition, top - paddingTop);
            dragSortListView.layoutChildren();
            dragSortListView.invalidate();
            dragSortListView.X0 = false;
            dragSortListView.j(childAt3, lastVisiblePosition, false);
            this.f54662b = this.f54663c;
            dragSortListView.post(this);
        }
    }

    public interface g extends j, d, n {
    }

    public class h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final File f54670b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StringBuilder f54669a = new StringBuilder();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f54671c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f54672d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f54673e = false;

        public h() {
            File file = new File(DragSortListView.this.getContext().getExternalFilesDir(null), "dslv_state.txt");
            this.f54670b = file;
            if (file.exists()) {
                return;
            }
            try {
                file.createNewFile();
            } catch (IOException e4) {
                e4.getMessage();
            }
        }

        public final void a() {
            StringBuilder sb3 = this.f54669a;
            if (this.f54673e) {
                try {
                    FileWriter fileWriter = new FileWriter(this.f54670b, this.f54672d != 0);
                    try {
                        fileWriter.write(sb3.toString());
                        sb3.delete(0, sb3.length());
                        fileWriter.flush();
                        fileWriter.close();
                        this.f54672d++;
                    } catch (Throwable th3) {
                        try {
                            fileWriter.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    public class i extends o {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f54675j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f54676k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f54677l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f54678m;

        public i(float f14, int i14) {
            super(f14, i14);
        }

        @Override // com.mobeta.android.dslv.DragSortListView.o
        public final void a() {
            int i14 = DragSortListView.f54625f1;
            DragSortListView.this.m();
        }

        @Override // com.mobeta.android.dslv.DragSortListView.o
        public final void b(float f14) {
            int iC = c();
            DragSortListView dragSortListView = DragSortListView.this;
            int paddingLeft = dragSortListView.getPaddingLeft();
            Point point = dragSortListView.f54628b;
            float f15 = point.y - iC;
            float f16 = point.x - paddingLeft;
            float f17 = 1.0f - f14;
            if (f17 < Math.abs(f15 / this.f54677l) || f17 < Math.abs(f16 / this.f54678m)) {
                point.y = iC + ((int) (this.f54677l * f17));
                point.x = dragSortListView.getPaddingLeft() + ((int) (this.f54678m * f17));
                dragSortListView.i();
            }
        }

        public final int c() {
            DragSortListView dragSortListView = DragSortListView.this;
            int firstVisiblePosition = dragSortListView.getFirstVisiblePosition();
            int dividerHeight = (dragSortListView.getDividerHeight() + dragSortListView.f54652w) / 2;
            View childAt = dragSortListView.getChildAt(this.f54675j - firstVisiblePosition);
            if (childAt == null) {
                this.f54698h = true;
                return -1;
            }
            int i14 = this.f54675j;
            int i15 = this.f54676k;
            if (i14 == i15) {
                return childAt.getTop();
            }
            return i14 < i15 ? childAt.getTop() - dividerHeight : (childAt.getBottom() + dividerHeight) - dragSortListView.f54653x;
        }
    }

    public interface j {
        void b(int i14, int i15);
    }

    public interface k {
        void a(Point point);
    }

    public class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseIntArray f54680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<Integer> f54681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f54682c;

        public l(DragSortListView dragSortListView, int i14) {
            this.f54680a = new SparseIntArray(i14);
            this.f54681b = new ArrayList<>(i14);
            this.f54682c = i14;
        }
    }

    public class m extends o {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f54683j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f54684k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f54685l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f54686m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f54687n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f54688o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f54689p;

        public m(float f14, int i14) {
            super(f14, i14);
            this.f54686m = -1;
            this.f54687n = -1;
        }

        @Override // com.mobeta.android.dslv.DragSortListView.o
        public final void a() {
            DragSortListView dragSortListView = DragSortListView.this;
            dragSortListView.k(dragSortListView.f54644m - dragSortListView.getHeaderViewsCount());
        }

        @Override // com.mobeta.android.dslv.DragSortListView.o
        public final void b(float f14) {
            View childAt;
            float f15 = 1.0f - f14;
            DragSortListView dragSortListView = DragSortListView.this;
            int firstVisiblePosition = dragSortListView.getFirstVisiblePosition();
            View childAt2 = dragSortListView.getChildAt(this.f54688o - firstVisiblePosition);
            if (dragSortListView.f54631c1) {
                float fUptimeMillis = (SystemClock.uptimeMillis() - this.f54691a) / 1000.0f;
                if (fUptimeMillis == 0.0f) {
                    return;
                }
                float f16 = dragSortListView.f54633d1 * fUptimeMillis;
                int width = dragSortListView.getWidth();
                float f17 = dragSortListView.f54633d1;
                float f18 = (f17 > 0.0f ? 1 : -1) * fUptimeMillis;
                float f19 = width;
                dragSortListView.f54633d1 = (f18 * f19) + f17;
                float f22 = this.f54683j + f16;
                this.f54683j = f22;
                dragSortListView.f54628b.x = (int) f22;
                if (f22 < f19 && f22 > (-width)) {
                    this.f54691a = SystemClock.uptimeMillis();
                    dragSortListView.i();
                    return;
                }
            }
            if (childAt2 != null) {
                if (this.f54686m == -1) {
                    this.f54686m = dragSortListView.o(childAt2, this.f54688o, false);
                    this.f54684k = childAt2.getHeight() - this.f54686m;
                }
                int iMax = Math.max((int) (this.f54684k * f15), 1);
                ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                layoutParams.height = this.f54686m + iMax;
                childAt2.setLayoutParams(layoutParams);
            }
            int i14 = this.f54689p;
            if (i14 == this.f54688o || (childAt = dragSortListView.getChildAt(i14 - firstVisiblePosition)) == null) {
                return;
            }
            if (this.f54687n == -1) {
                this.f54687n = dragSortListView.o(childAt, this.f54689p, false);
                this.f54685l = childAt.getHeight() - this.f54687n;
            }
            int iMax2 = Math.max((int) (f15 * this.f54685l), 1);
            ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
            layoutParams2.height = this.f54687n + iMax2;
            childAt.setLayoutParams(layoutParams2);
        }
    }

    public interface n {
        void remove(int i14);
    }

    public class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f54691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f54692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f54693c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f54694d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f54695e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f54696f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f54697g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f54698h;

        public o(float f14, int i14) {
            this.f54693c = f14;
            this.f54692b = i14;
            float f15 = 1.0f / ((1.0f - f14) * (f14 * 2.0f));
            this.f54697g = f15;
            this.f54694d = f15;
            this.f54695e = f14 / ((f14 - 1.0f) * 2.0f);
            this.f54696f = 1.0f / (1.0f - f14);
        }

        public void a() {
        }

        public void b(float f14) {
        }

        @Override // java.lang.Runnable
        public final void run() {
            float f14;
            if (this.f54698h) {
                return;
            }
            float fUptimeMillis = (SystemClock.uptimeMillis() - this.f54691a) / this.f54692b;
            if (fUptimeMillis >= 1.0f) {
                b(1.0f);
                a();
                return;
            }
            float f15 = this.f54693c;
            if (fUptimeMillis < f15) {
                f14 = this.f54694d * fUptimeMillis * fUptimeMillis;
            } else if (fUptimeMillis < 1.0f - f15) {
                f14 = (this.f54696f * fUptimeMillis) + this.f54695e;
            } else {
                float f16 = fUptimeMillis - 1.0f;
                f14 = 1.0f - ((this.f54697g * f16) * f16);
            }
            b(f14);
            DragSortListView.this.post(this);
        }
    }

    public DragSortListView(Context context, AttributeSet attributeSet) {
        int i14;
        super(context, attributeSet);
        this.f54628b = new Point();
        this.f54630c = new Point();
        this.f54634e = false;
        this.f54637g = 1.0f;
        this.f54638h = 1.0f;
        this.f54643l = false;
        this.f54650t = true;
        this.f54651v = 0;
        this.f54652w = 1;
        this.f54655z = 0;
        this.A = new View[1];
        this.C = 0.33333334f;
        this.D = 0.33333334f;
        this.H0 = 0.5f;
        this.I0 = new a();
        this.M0 = 0;
        this.N0 = false;
        this.O0 = false;
        this.P0 = null;
        this.R0 = 0;
        this.S0 = 0.25f;
        this.T0 = 0.0f;
        this.V0 = false;
        this.X0 = false;
        this.Y0 = false;
        this.Z0 = new l(this, 3);
        this.f54633d1 = 0.0f;
        this.f54635e1 = false;
        int i15 = 150;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j1.f149701c, 0, 0);
            this.f54652w = Math.max(1, typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 1));
            boolean z14 = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.V0 = z14;
            if (z14) {
                this.W0 = new h();
            }
            float f14 = typedArrayObtainStyledAttributes.getFloat(8, 1.0f);
            this.f54637g = f14;
            this.f54638h = f14;
            this.f54650t = typedArrayObtainStyledAttributes.getBoolean(2, this.f54650t);
            float fMax = Math.max(0.0f, Math.min(1.0f, 1.0f - typedArrayObtainStyledAttributes.getFloat(14, 0.75f)));
            this.S0 = fMax;
            this.f54643l = fMax > 0.0f;
            setDragScrollStart(typedArrayObtainStyledAttributes.getFloat(4, this.C));
            this.H0 = typedArrayObtainStyledAttributes.getFloat(10, this.H0);
            int i16 = typedArrayObtainStyledAttributes.getInt(11, 150);
            i14 = typedArrayObtainStyledAttributes.getInt(6, 150);
            if (typedArrayObtainStyledAttributes.getBoolean(17, true)) {
                boolean z15 = typedArrayObtainStyledAttributes.getBoolean(12, false);
                int i17 = typedArrayObtainStyledAttributes.getInt(13, 1);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(15, true);
                int i18 = typedArrayObtainStyledAttributes.getInt(5, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(7, 0);
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                int color = typedArrayObtainStyledAttributes.getColor(9, -16777216);
                uz2.a aVar = new uz2.a(this, resourceId, i18, i17, resourceId3, resourceId2);
                aVar.f173607h = z15;
                aVar.f173605f = z16;
                aVar.f54702c = color;
                this.P0 = aVar;
                setOnTouchListener(aVar);
            }
            typedArrayObtainStyledAttributes.recycle();
            i15 = i16;
        } else {
            i14 = 150;
        }
        this.B = new f();
        if (i15 > 0) {
            this.f54627a1 = new m(0.5f, i15);
        }
        if (i14 > 0) {
            this.f54629b1 = new i(0.5f, i14);
        }
        this.Q0 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        this.f54636f = new b();
    }

    public static int d(SparseBooleanArray sparseBooleanArray, int i14, int i15, int[] iArr, int[] iArr2) {
        int iKeyAt;
        int size = sparseBooleanArray.size();
        int size2 = sparseBooleanArray.size();
        int i16 = 0;
        while (size2 - i16 > 0) {
            int i17 = (i16 + size2) >> 1;
            if (sparseBooleanArray.keyAt(i17) < i14) {
                i16 = i17 + 1;
            } else {
                size2 = i17;
            }
        }
        while (i16 < size && sparseBooleanArray.keyAt(i16) < i15 && !sparseBooleanArray.valueAt(i16)) {
            i16++;
        }
        if (i16 == size || sparseBooleanArray.keyAt(i16) >= i15) {
            i16 = -1;
        }
        if (i16 == -1) {
            return 0;
        }
        int iKeyAt2 = sparseBooleanArray.keyAt(i16);
        int i18 = iKeyAt2 + 1;
        int i19 = 0;
        for (int i24 = i16 + 1; i24 < sparseBooleanArray.size() && (iKeyAt = sparseBooleanArray.keyAt(i24)) < i15; i24++) {
            if (sparseBooleanArray.valueAt(i24)) {
                if (iKeyAt == i18) {
                    i18++;
                } else {
                    iArr[i19] = iKeyAt2;
                    iArr2[i19] = i18;
                    i19++;
                    i18 = iKeyAt + 1;
                    iKeyAt2 = iKeyAt;
                }
            }
        }
        if (i18 == i15) {
            i18 = i14;
        }
        iArr[i19] = iKeyAt2;
        iArr2[i19] = i18;
        int i25 = i19 + 1;
        if (i25 <= 1 || iArr[0] != i14 || i18 != i14) {
            return i25;
        }
        iArr[0] = iArr[i19];
        return i19;
    }

    public static int u(int i14, int i15, int i16) {
        int i17 = i16 - i15;
        int i18 = i14 - 1;
        if (i18 < i15) {
            return i18 + i17;
        }
        return i18 >= i16 ? i18 - i17 : i18;
    }

    public final void a() {
        int firstVisiblePosition = getFirstVisiblePosition();
        int lastVisiblePosition = getLastVisiblePosition();
        int iMin = Math.min(lastVisiblePosition - firstVisiblePosition, ((getCount() - 1) - getFooterViewsCount()) - firstVisiblePosition);
        for (int iMax = Math.max(0, getHeaderViewsCount() - firstVisiblePosition); iMax <= iMin; iMax++) {
            View childAt = getChildAt(iMax);
            if (childAt != null) {
                b(childAt, firstVisiblePosition + iMax, false);
            }
        }
    }

    public final void b(View view2, int i14, boolean z14) {
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        int iE = (i14 == this.f54644m || i14 == this.f54640j || i14 == this.f54641k) ? e(i14, o(view2, i14, z14)) : -2;
        if (iE != layoutParams.height) {
            layoutParams.height = iE;
            view2.setLayoutParams(layoutParams);
        }
        if (i14 == this.f54640j || i14 == this.f54641k) {
            int i15 = this.f54644m;
            if (i14 < i15) {
                ((uz2.b) view2).setGravity(80);
            } else if (i14 > i15) {
                ((uz2.b) view2).setGravity(48);
            }
        }
        int visibility = view2.getVisibility();
        int i16 = (i14 != this.f54644m || this.f54626a == null) ? 0 : 4;
        if (i16 != visibility) {
            view2.setVisibility(i16);
        }
    }

    public final void c() {
        int firstVisiblePosition = getFirstVisiblePosition();
        if (this.f54644m < firstVisiblePosition) {
            View childAt = getChildAt(0);
            setSelectionFromTop(firstVisiblePosition - 1, (childAt != null ? childAt.getTop() : 0) - getPaddingTop());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f14;
        super.dispatchDraw(canvas);
        if (this.f54651v != 0) {
            int i14 = this.f54640j;
            if (i14 != this.f54644m) {
                l(canvas, i14);
            }
            int i15 = this.f54641k;
            if (i15 != this.f54640j && i15 != this.f54644m) {
                l(canvas, i15);
            }
        }
        ImageView imageView = this.f54626a;
        if (imageView != null) {
            int width = imageView.getWidth();
            int height = this.f54626a.getHeight();
            Point point = this.f54628b;
            int i16 = point.x;
            int width2 = getWidth();
            if (i16 < 0) {
                i16 = -i16;
            }
            if (i16 < width2) {
                float f15 = (width2 - i16) / width2;
                f14 = f15 * f15;
            } else {
                f14 = 0.0f;
            }
            int i17 = (int) (this.f54638h * 255.0f * f14);
            canvas.save();
            canvas.translate(point.x, point.y);
            canvas.clipRect(0, 0, width, height);
            canvas.saveLayerAlpha(0.0f, 0.0f, width, height, i17, 31);
            this.f54626a.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    public final int e(int i14, int i15) {
        getDividerHeight();
        boolean z14 = this.f54643l && this.f54640j != this.f54641k;
        int i16 = this.f54653x;
        int i17 = this.f54652w;
        int i18 = i16 - i17;
        int i19 = (int) (this.T0 * i18);
        int i24 = this.f54644m;
        int i25 = this.f54640j;
        if (i14 == i24) {
            if (i24 == i25) {
                return z14 ? i19 + i17 : i16;
            }
            return i24 == this.f54641k ? i16 - i19 : i17;
        }
        if (i14 == i25) {
            return z14 ? i15 + i19 : i15 + i18;
        }
        return i14 == this.f54641k ? (i15 + i18) - i19 : i15;
    }

    public final void f() {
        if (this.f54651v == 4) {
            this.B.a();
            g();
            this.f54644m = -1;
            this.f54640j = -1;
            this.f54641k = -1;
            this.f54639i = -1;
            a();
            if (this.O0) {
                this.f54651v = 3;
            } else {
                this.f54651v = 0;
            }
        }
    }

    public final void g() {
        ImageView imageView = this.f54626a;
        if (imageView != null) {
            imageView.setVisibility(8);
            k kVar = this.P0;
            if (kVar != null) {
                com.mobeta.android.dslv.a aVar = (com.mobeta.android.dslv.a) kVar;
                this.f54626a.setImageDrawable(null);
                aVar.f54700a.recycle();
                aVar.f54700a = null;
            }
            this.f54626a = null;
            invalidate();
        }
    }

    public float getFloatAlpha() {
        return this.f54638h;
    }

    public ListAdapter getInputAdapter() {
        c cVar = this.U0;
        if (cVar == null) {
            return null;
        }
        return cVar.f54658a;
    }

    public int getSourcePosition() {
        return this.f54644m;
    }

    public final void h() {
        this.R0 = 0;
        this.O0 = false;
        if (this.f54651v == 3) {
            this.f54651v = 0;
        }
        this.f54638h = this.f54637g;
        this.f54635e1 = false;
        l lVar = this.Z0;
        lVar.f54680a.clear();
        lVar.f54681b.clear();
    }

    public final void i() {
        int childCount = (getChildCount() / 2) + getFirstVisiblePosition();
        View childAt = getChildAt(getChildCount() / 2);
        if (childAt == null) {
            return;
        }
        j(childAt, childCount, true);
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0218  */
    public final void j(View view2, int i14, boolean z14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        boolean z15 = true;
        this.X0 = true;
        k kVar = this.P0;
        Point point = this.f54628b;
        if (kVar != null) {
            this.f54630c.set(this.J0, this.K0);
            this.P0.a(point);
        }
        int i25 = point.x;
        int i26 = point.y;
        int paddingLeft = getPaddingLeft();
        int i27 = this.M0;
        if ((i27 & 1) == 0 && i25 > paddingLeft) {
            point.x = paddingLeft;
        } else if ((i27 & 2) == 0 && i25 < paddingLeft) {
            point.x = paddingLeft;
        }
        int headerViewsCount = getHeaderViewsCount();
        int footerViewsCount = getFooterViewsCount();
        int firstVisiblePosition = getFirstVisiblePosition();
        int lastVisiblePosition = getLastVisiblePosition();
        int paddingTop = getPaddingTop();
        if (firstVisiblePosition < headerViewsCount) {
            paddingTop = getChildAt((headerViewsCount - firstVisiblePosition) - 1).getBottom();
        }
        if ((this.M0 & 8) == 0 && firstVisiblePosition <= (i24 = this.f54644m)) {
            paddingTop = Math.max(getChildAt(i24 - firstVisiblePosition).getTop(), paddingTop);
        }
        int height = getHeight() - getPaddingBottom();
        if (lastVisiblePosition >= (getCount() - footerViewsCount) - 1) {
            height = getChildAt(((getCount() - footerViewsCount) - 1) - firstVisiblePosition).getBottom();
        }
        if ((this.M0 & 4) == 0 && lastVisiblePosition >= (i19 = this.f54644m)) {
            height = Math.min(getChildAt(i19 - firstVisiblePosition).getBottom(), height);
        }
        if (i26 < paddingTop) {
            point.y = paddingTop;
        } else {
            int i28 = this.f54653x;
            if (i26 + i28 > height) {
                point.y = height - i28;
            }
        }
        this.f54632d = point.y + this.f54654y;
        int i29 = this.f54640j;
        int i30 = this.f54641k;
        int firstVisiblePosition2 = getFirstVisiblePosition();
        int count = this.f54640j;
        View childAt = getChildAt(count - firstVisiblePosition2);
        if (childAt == null) {
            count = (getChildCount() / 2) + firstVisiblePosition2;
            childAt = getChildAt(count - firstVisiblePosition2);
        }
        int top = childAt.getTop();
        int height2 = childAt.getHeight();
        int iQ = q(count, top);
        int dividerHeight = getDividerHeight();
        if (this.f54632d >= iQ) {
            int count2 = getCount();
            while (true) {
                if (count >= count2) {
                    i16 = iQ;
                    break;
                }
                if (count == count2 - 1) {
                    i15 = top + dividerHeight + height2;
                    int i34 = iQ;
                    iQ = i15;
                    i16 = i34;
                    break;
                }
                top += height2 + dividerHeight;
                int i35 = count + 1;
                int iP = p(i35);
                int iQ2 = q(i35, top);
                if (this.f54632d < iQ2) {
                    i16 = iQ;
                    iQ = iQ2;
                    break;
                } else {
                    count = i35;
                    height2 = iP;
                    iQ = iQ2;
                }
            }
        } else {
            while (true) {
                if (count < 0) {
                    i16 = iQ;
                    break;
                }
                count--;
                int iP2 = p(count);
                if (count == 0) {
                    i15 = (top - dividerHeight) - iP2;
                    int i36 = iQ;
                    iQ = i15;
                    i16 = i36;
                    break;
                }
                top -= iP2 + dividerHeight;
                int iQ3 = q(count, top);
                if (this.f54632d >= iQ3) {
                    i16 = iQ;
                    iQ = iQ3;
                    break;
                }
                iQ = iQ3;
            }
        }
        int headerViewsCount2 = getHeaderViewsCount();
        int footerViewsCount2 = getFooterViewsCount();
        int i37 = this.f54640j;
        int i38 = this.f54641k;
        float f14 = this.T0;
        if (this.f54643l) {
            int iAbs = Math.abs(iQ - i16);
            int i39 = this.f54632d;
            if (i39 < iQ) {
                int i44 = iQ;
                iQ = i16;
                i16 = i44;
            }
            int i45 = (int) (this.S0 * 0.5f * iAbs);
            float f15 = i45;
            int i46 = iQ + i45;
            int i47 = i16 - i45;
            if (i39 < i46) {
                this.f54640j = count - 1;
                this.f54641k = count;
                this.T0 = ((i46 - i39) * 0.5f) / f15;
            } else if (i39 < i47) {
                this.f54640j = count;
                this.f54641k = count;
            } else {
                this.f54640j = count;
                this.f54641k = count + 1;
                this.T0 = (((i16 - i39) / f15) + 1.0f) * 0.5f;
            }
        } else {
            this.f54640j = count;
            this.f54641k = count;
        }
        if (this.f54640j < headerViewsCount2) {
            this.f54640j = headerViewsCount2;
            this.f54641k = headerViewsCount2;
            count = headerViewsCount2;
        } else if (this.f54641k >= getCount() - footerViewsCount2) {
            count = (getCount() - footerViewsCount2) - 1;
            this.f54640j = count;
            this.f54641k = count;
        }
        boolean z16 = (this.f54640j == i37 && this.f54641k == i38 && this.T0 == f14) ? false : true;
        int i48 = this.f54639i;
        if (count != i48) {
            d dVar = this.f54647p;
            if (dVar != null) {
                dVar.a(i48 - headerViewsCount2, count - headerViewsCount2);
            }
            this.f54639i = count;
        } else {
            z15 = z16;
        }
        if (z15) {
            a();
            int iN = n(i14);
            int height3 = view2.getHeight();
            int iE = e(i14, iN);
            int i49 = this.f54644m;
            if (i14 != i49) {
                i17 = height3 - iN;
                i18 = iE - iN;
            } else {
                i17 = height3;
                i18 = iE;
            }
            int i54 = this.f54653x;
            int i55 = this.f54640j;
            if (i49 != i55 && i49 != this.f54641k) {
                i54 -= this.f54652w;
            }
            if (i14 <= i29) {
                if (i14 > i55) {
                    i17 = i54 - i18;
                } else {
                    i17 = 0;
                }
            } else if (i14 == i30) {
                if (i14 <= i55) {
                    i17 -= i54;
                } else if (i14 == this.f54641k) {
                    i17 = height3 - iE;
                }
            } else if (i14 <= i55) {
                i17 = 0 - i54;
            } else if (i14 == this.f54641k) {
                i17 = 0 - i18;
            } else {
                i17 = 0;
            }
            setSelectionFromTop(i14, (view2.getTop() + i17) - getPaddingTop());
            layoutChildren();
        }
        if (z15 || z14) {
            invalidate();
        }
        this.X0 = false;
    }

    public final void k(int i14) {
        this.f54651v = 1;
        n nVar = this.f54649r;
        if (nVar != null) {
            nVar.remove(i14);
        }
        g();
        c();
        this.f54644m = -1;
        this.f54640j = -1;
        this.f54641k = -1;
        this.f54639i = -1;
        if (this.O0) {
            this.f54651v = 3;
        } else {
            this.f54651v = 0;
        }
    }

    public final void l(Canvas canvas, int i14) {
        ViewGroup viewGroup;
        int i15;
        int top;
        Drawable divider = getDivider();
        int dividerHeight = getDividerHeight();
        if (divider == null || dividerHeight == 0 || (viewGroup = (ViewGroup) getChildAt(i14 - getFirstVisiblePosition())) == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int height = viewGroup.getChildAt(0).getHeight();
        if (i14 > this.f54644m) {
            top = viewGroup.getTop() + height;
            i15 = dividerHeight + top;
        } else {
            int bottom = viewGroup.getBottom() - height;
            int i16 = bottom - dividerHeight;
            i15 = bottom;
            top = i16;
        }
        canvas.save();
        canvas.clipRect(paddingLeft, top, width, i15);
        divider.setBounds(paddingLeft, top, width, i15);
        divider.draw(canvas);
        canvas.restore();
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public final void layoutChildren() {
        super.layoutChildren();
        ImageView imageView = this.f54626a;
        if (imageView != null) {
            if (imageView.isLayoutRequested() && !this.f54634e) {
                r();
            }
            ImageView imageView2 = this.f54626a;
            imageView2.layout(0, 0, imageView2.getMeasuredWidth(), this.f54626a.getMeasuredHeight());
            this.f54634e = false;
        }
    }

    public final void m() {
        int i14;
        this.f54651v = 2;
        if (this.f54648q != null && (i14 = this.f54639i) >= 0 && i14 < getCount()) {
            int headerViewsCount = getHeaderViewsCount();
            this.f54648q.b(this.f54644m - headerViewsCount, this.f54639i - headerViewsCount);
        }
        g();
        c();
        this.f54644m = -1;
        this.f54640j = -1;
        this.f54641k = -1;
        this.f54639i = -1;
        a();
        if (this.O0) {
            this.f54651v = 3;
        } else {
            this.f54651v = 0;
        }
    }

    public final int n(int i14) {
        View view2;
        if (i14 == this.f54644m) {
            return 0;
        }
        View childAt = getChildAt(i14 - getFirstVisiblePosition());
        if (childAt != null) {
            return o(childAt, i14, false);
        }
        l lVar = this.Z0;
        int i15 = lVar.f54680a.get(i14, -1);
        if (i15 != -1) {
            return i15;
        }
        ListAdapter adapter = getAdapter();
        int itemViewType = adapter.getItemViewType(i14);
        int viewTypeCount = adapter.getViewTypeCount();
        if (viewTypeCount != this.A.length) {
            this.A = new View[viewTypeCount];
        }
        if (itemViewType >= 0) {
            View view3 = this.A[itemViewType];
            if (view3 == null) {
                view2 = adapter.getView(i14, null, this);
                this.A[itemViewType] = view2;
            } else {
                view2 = adapter.getView(i14, view3, this);
            }
        } else {
            view2 = adapter.getView(i14, null, this);
        }
        int iO = o(view2, i14, true);
        ArrayList<Integer> arrayList = lVar.f54681b;
        SparseIntArray sparseIntArray = lVar.f54680a;
        int i16 = sparseIntArray.get(i14, -1);
        if (i16 != iO) {
            if (i16 != -1) {
                arrayList.remove(Integer.valueOf(i14));
            } else if (sparseIntArray.size() == lVar.f54682c) {
                sparseIntArray.delete(arrayList.remove(0).intValue());
            }
            sparseIntArray.put(i14, iO);
            arrayList.add(Integer.valueOf(i14));
        }
        return iO;
    }

    public final int o(View view2, int i14, boolean z14) {
        int i15;
        if (i14 == this.f54644m) {
            return 0;
        }
        if (i14 >= getHeaderViewsCount() && i14 < getCount() - getFooterViewsCount()) {
            view2 = ((ViewGroup) view2).getChildAt(0);
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null && (i15 = layoutParams.height) > 0) {
            return i15;
        }
        int height = view2.getHeight();
        if (height != 0 && !z14) {
            return height;
        }
        s(view2);
        return view2.getMeasuredHeight();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.V0) {
            h hVar = this.W0;
            DragSortListView dragSortListView = DragSortListView.this;
            StringBuilder sb3 = hVar.f54669a;
            if (hVar.f54673e) {
                sb3.append("<DSLVState>\n");
                int childCount = dragSortListView.getChildCount();
                int firstVisiblePosition = dragSortListView.getFirstVisiblePosition();
                sb3.append("    <Positions>");
                for (int i14 = 0; i14 < childCount; i14++) {
                    sb3.append(firstVisiblePosition + i14);
                    sb3.append(",");
                }
                sb3.append("</Positions>\n");
                sb3.append("    <Tops>");
                for (int i15 = 0; i15 < childCount; i15++) {
                    sb3.append(dragSortListView.getChildAt(i15).getTop());
                    sb3.append(",");
                }
                sb3.append("</Tops>\n");
                sb3.append("    <Bottoms>");
                for (int i16 = 0; i16 < childCount; i16++) {
                    sb3.append(dragSortListView.getChildAt(i16).getBottom());
                    sb3.append(",");
                }
                sb3.append("</Bottoms>\n");
                sb3.append("    <FirstExpPos>");
                sb3.append(dragSortListView.f54640j);
                sb3.append("</FirstExpPos>\n");
                sb3.append("    <FirstExpBlankHeight>");
                sb3.append(dragSortListView.p(dragSortListView.f54640j) - dragSortListView.n(dragSortListView.f54640j));
                sb3.append("</FirstExpBlankHeight>\n");
                sb3.append("    <SecondExpPos>");
                sb3.append(dragSortListView.f54641k);
                sb3.append("</SecondExpPos>\n");
                sb3.append("    <SecondExpBlankHeight>");
                sb3.append(dragSortListView.p(dragSortListView.f54641k) - dragSortListView.n(dragSortListView.f54641k));
                sb3.append("</SecondExpBlankHeight>\n");
                sb3.append("    <SrcPos>");
                sb3.append(dragSortListView.f54644m);
                sb3.append("</SrcPos>\n");
                sb3.append("    <SrcHeight>");
                sb3.append(dragSortListView.getDividerHeight() + dragSortListView.f54653x);
                sb3.append("</SrcHeight>\n");
                sb3.append("    <ViewHeight>");
                sb3.append(dragSortListView.getHeight());
                sb3.append("</ViewHeight>\n");
                sb3.append("    <LastY>");
                sb3.append(dragSortListView.L0);
                sb3.append("</LastY>\n");
                sb3.append("    <FloatY>");
                sb3.append(dragSortListView.f54632d);
                sb3.append("</FloatY>\n");
                sb3.append("    <ShuffleEdges>");
                for (int i17 = 0; i17 < childCount; i17++) {
                    sb3.append(dragSortListView.q(firstVisiblePosition + i17, dragSortListView.getChildAt(i17).getTop()));
                    sb3.append(",");
                }
                sb3.append("</ShuffleEdges>\n");
                sb3.append("</DSLVState>\n");
                int i18 = hVar.f54671c + 1;
                hVar.f54671c = i18;
                if (i18 > 1000) {
                    hVar.a();
                    hVar.f54671c = 0;
                }
            }
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z14;
        if (!this.f54650t) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        v(motionEvent);
        this.N0 = true;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            if (this.f54651v != 0) {
                this.Y0 = true;
                return true;
            }
            this.O0 = true;
        }
        if (this.f54626a != null) {
            z14 = true;
        } else {
            if (super.onInterceptTouchEvent(motionEvent)) {
                this.f54635e1 = true;
                z14 = true;
            } else {
                z14 = false;
            }
            if (action == 1 || action == 3) {
                h();
            } else if (z14) {
                this.R0 = 1;
            } else {
                this.R0 = 2;
            }
        }
        if (action != 1 && action != 3) {
            return z14;
        }
        this.O0 = false;
        return z14;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i14, int i15) {
        super.onMeasure(i14, i15);
        ImageView imageView = this.f54626a;
        if (imageView != null) {
            if (imageView.isLayoutRequested()) {
                r();
            }
            this.f54634e = true;
        }
        this.f54655z = i14;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onSizeChanged(int i14, int i15, int i16, int i17) {
        super.onSizeChanged(i14, i15, i16, i17);
        y();
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z14 = false;
        if (this.Y0) {
            this.Y0 = false;
            return false;
        }
        if (!this.f54650t) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z15 = this.N0;
        this.N0 = false;
        if (!z15) {
            v(motionEvent);
        }
        int i14 = this.f54651v;
        if (i14 != 4) {
            if (i14 == 0 && super.onTouchEvent(motionEvent)) {
                z14 = true;
            }
            int action = motionEvent.getAction() & 255;
            if (action == 1 || action == 3) {
                h();
                return z14;
            }
            if (z14) {
                this.R0 = 1;
            }
            return z14;
        }
        motionEvent.getAction();
        int action2 = motionEvent.getAction() & 255;
        if (action2 == 1) {
            if (this.f54651v == 4) {
                this.f54631c1 = false;
                x(0.0f, false);
            }
            h();
            return true;
        }
        if (action2 == 2) {
            int x14 = (int) motionEvent.getX();
            int y14 = (int) motionEvent.getY();
            int i15 = x14 - this.f54645n;
            Point point = this.f54628b;
            point.x = i15;
            point.y = y14 - this.f54646o;
            i();
            int iMin = Math.min(y14, this.f54632d + this.f54654y);
            int iMax = Math.max(y14, this.f54632d - this.f54654y);
            f fVar = this.B;
            boolean z16 = fVar.f54667g;
            DragSortListView dragSortListView = DragSortListView.this;
            int i16 = z16 ? fVar.f54665e : -1;
            int i17 = this.L0;
            if (iMin > i17 && iMin > this.F && i16 != 1) {
                if (i16 != -1) {
                    fVar.a();
                }
                if (!fVar.f54667g) {
                    fVar.f54661a = false;
                    fVar.f54667g = true;
                    fVar.f54662b = SystemClock.uptimeMillis();
                    fVar.f54665e = 1;
                    dragSortListView.post(fVar);
                    return true;
                }
            } else if (iMax < i17 && iMax < this.E && i16 != 0) {
                if (i16 != -1) {
                    fVar.a();
                }
                if (!fVar.f54667g) {
                    fVar.f54661a = false;
                    fVar.f54667g = true;
                    fVar.f54662b = SystemClock.uptimeMillis();
                    fVar.f54665e = 0;
                    dragSortListView.post(fVar);
                    return true;
                }
            } else if (iMax >= this.E && iMin <= this.F && z16) {
                fVar.a();
            }
        } else if (action2 == 3) {
            if (this.f54651v == 4) {
                f();
            }
            h();
            return true;
        }
        return true;
    }

    public final int p(int i14) {
        View childAt = getChildAt(i14 - getFirstVisiblePosition());
        return childAt != null ? childAt.getHeight() : e(i14, n(i14));
    }

    public final int q(int i14, int i15) {
        int headerViewsCount = getHeaderViewsCount();
        int footerViewsCount = getFooterViewsCount();
        if (i14 <= headerViewsCount || i14 >= getCount() - footerViewsCount) {
            return i15;
        }
        int dividerHeight = getDividerHeight();
        int i16 = this.f54653x - this.f54652w;
        int iN = n(i14);
        int iP = p(i14);
        int i17 = this.f54641k;
        int i18 = this.f54644m;
        if (i17 <= i18) {
            if (i14 != i17 || this.f54640j == i17) {
                if (i14 > i17 && i14 <= i18) {
                    i15 -= i16;
                }
            } else if (i14 == i18) {
                i15 += iP;
                i16 = this.f54653x;
                i15 -= i16;
            } else {
                i15 = ((iP - iN) + i15) - i16;
            }
        } else if (i14 > i18 && i14 <= this.f54640j) {
            i15 += i16;
        } else if (i14 == i17 && this.f54640j != i17) {
            i15 += iP - iN;
        }
        int i19 = this.f54653x;
        return i14 <= i18 ? (((i19 - dividerHeight) - n(i14 - 1)) / 2) + i15 : (((iN - dividerHeight) - i19) / 2) + i15;
    }

    public final void r() {
        ImageView imageView = this.f54626a;
        if (imageView != null) {
            s(imageView);
            int measuredHeight = this.f54626a.getMeasuredHeight();
            this.f54653x = measuredHeight;
            this.f54654y = measuredHeight / 2;
        }
    }

    @Override // android.widget.AbsListView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.X0) {
            return;
        }
        super.requestLayout();
    }

    public final void s(View view2) {
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new AbsListView.LayoutParams(-1, -1);
            view2.setLayoutParams(layoutParams);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f54655z, getListPaddingRight() + getListPaddingLeft(), layoutParams.width);
        int i14 = layoutParams.height;
        view2.measure(childMeasureSpec, i14 > 0 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        if (listAdapter != null) {
            this.U0 = new c(listAdapter);
            listAdapter.registerDataSetObserver(this.f54636f);
            if (listAdapter instanceof j) {
                setDropListener((j) listAdapter);
            }
            if (listAdapter instanceof d) {
                setDragListener((d) listAdapter);
            }
            if (listAdapter instanceof n) {
                setRemoveListener((n) listAdapter);
            }
        } else {
            this.U0 = null;
        }
        super.setAdapter((ListAdapter) this.U0);
    }

    public void setDragEnabled(boolean z14) {
        this.f54650t = z14;
    }

    public void setDragListener(d dVar) {
        this.f54647p = dVar;
    }

    public void setDragScrollProfile(e eVar) {
        if (eVar != null) {
            this.I0 = eVar;
        }
    }

    public void setDragScrollStart(float f14) {
        if (f14 > 0.5f) {
            this.D = 0.5f;
        } else {
            this.D = f14;
        }
        if (f14 > 0.5f) {
            this.C = 0.5f;
        } else {
            this.C = f14;
        }
        if (getHeight() != 0) {
            y();
        }
    }

    public void setDragSortListener(g gVar) {
        setDropListener(gVar);
        setDragListener(gVar);
        setRemoveListener(gVar);
    }

    public void setDropListener(j jVar) {
        this.f54648q = jVar;
    }

    public void setFloatAlpha(float f14) {
        this.f54638h = f14;
    }

    public void setFloatViewManager(k kVar) {
        this.P0 = kVar;
    }

    public void setMaxScrollSpeed(float f14) {
        this.H0 = f14;
    }

    public void setRemoveListener(n nVar) {
        this.f54649r = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    public final void t(float f14, int i14) {
        int i15 = this.f54651v;
        if (i15 == 0 || i15 == 4) {
            if (i15 == 0) {
                int headerViewsCount = getHeaderViewsCount() + i14;
                this.f54644m = headerViewsCount;
                this.f54640j = headerViewsCount;
                this.f54641k = headerViewsCount;
                this.f54639i = headerViewsCount;
                View childAt = getChildAt(headerViewsCount - getFirstVisiblePosition());
                if (childAt != null) {
                    childAt.setVisibility(4);
                }
            }
            this.f54651v = 1;
            this.f54633d1 = f14;
            if (this.O0) {
                int i16 = this.R0;
                MotionEvent motionEvent = this.Q0;
                if (i16 == 1) {
                    super.onTouchEvent(motionEvent);
                } else if (i16 == 2) {
                    super.onInterceptTouchEvent(motionEvent);
                }
            }
            m mVar = this.f54627a1;
            if (mVar == null) {
                k(i14);
                return;
            }
            mVar.f54691a = SystemClock.uptimeMillis();
            mVar.f54698h = false;
            mVar.f54686m = -1;
            mVar.f54687n = -1;
            DragSortListView dragSortListView = DragSortListView.this;
            mVar.f54688o = dragSortListView.f54640j;
            mVar.f54689p = dragSortListView.f54641k;
            dragSortListView.f54651v = 1;
            mVar.f54683j = dragSortListView.f54628b.x;
            if (dragSortListView.f54631c1) {
                float width = dragSortListView.getWidth() * 2.0f;
                float f15 = dragSortListView.f54633d1;
                if (f15 == 0.0f) {
                    dragSortListView.f54633d1 = (mVar.f54683j >= 0.0f ? 1 : -1) * width;
                } else {
                    float f16 = width * 2.0f;
                    if (f15 < 0.0f) {
                        float f17 = -f16;
                        if (f15 > f17) {
                            dragSortListView.f54633d1 = f17;
                        } else if (f15 > 0.0f && f15 < f16) {
                            dragSortListView.f54633d1 = f16;
                        }
                    } else if (f15 > 0.0f) {
                        dragSortListView.f54633d1 = f16;
                    }
                }
            } else {
                dragSortListView.g();
            }
            DragSortListView.this.post(mVar);
        }
    }

    public final void v(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            this.L0 = this.K0;
        }
        this.J0 = (int) motionEvent.getX();
        int y14 = (int) motionEvent.getY();
        this.K0 = y14;
        if (action == 0) {
            this.L0 = y14;
        }
        motionEvent.getRawX();
        motionEvent.getRawY();
    }

    public final boolean w(int i14, int i15, int i16, int i17) {
        k kVar;
        ImageView imageView;
        if (this.O0 && (kVar = this.P0) != null) {
            com.mobeta.android.dslv.a aVar = (com.mobeta.android.dslv.a) kVar;
            ListView listView = aVar.f54703d;
            View childAt = listView.getChildAt((listView.getHeaderViewsCount() + i14) - listView.getFirstVisiblePosition());
            if (childAt == null) {
                imageView = null;
            } else {
                childAt.setPressed(false);
                childAt.setDrawingCacheEnabled(true);
                aVar.f54700a = Bitmap.createBitmap(childAt.getDrawingCache());
                childAt.setDrawingCacheEnabled(false);
                if (aVar.f54701b == null) {
                    aVar.f54701b = new ImageView(listView.getContext());
                }
                aVar.f54701b.setBackgroundColor(aVar.f54702c);
                aVar.f54701b.setPadding(0, 0, 0, 0);
                aVar.f54701b.setImageBitmap(aVar.f54700a);
                aVar.f54701b.setLayoutParams(new ViewGroup.LayoutParams(childAt.getWidth(), childAt.getHeight()));
                imageView = aVar.f54701b;
            }
            if (imageView != null && this.f54651v == 0 && this.O0 && this.f54626a == null && this.f54650t) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                int headerViewsCount = getHeaderViewsCount() + i14;
                this.f54640j = headerViewsCount;
                this.f54641k = headerViewsCount;
                this.f54644m = headerViewsCount;
                this.f54639i = headerViewsCount;
                this.f54651v = 4;
                this.M0 = i15;
                this.f54626a = imageView;
                r();
                this.f54645n = i16;
                this.f54646o = i17;
                int i18 = this.K0;
                int i19 = this.J0 - i16;
                Point point = this.f54628b;
                point.x = i19;
                point.y = i18 - i17;
                View childAt2 = getChildAt(this.f54644m - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setVisibility(4);
                }
                if (this.V0) {
                    h hVar = this.W0;
                    hVar.f54669a.append("<DSLVStates>\n");
                    hVar.f54672d = 0;
                    hVar.f54673e = true;
                }
                int i24 = this.R0;
                MotionEvent motionEvent = this.Q0;
                if (i24 == 1) {
                    super.onTouchEvent(motionEvent);
                } else if (i24 == 2) {
                    super.onInterceptTouchEvent(motionEvent);
                }
                requestLayout();
                return true;
            }
        }
        return false;
    }

    public final boolean x(float f14, boolean z14) {
        if (this.f54626a == null) {
            return false;
        }
        this.B.a();
        if (z14) {
            t(f14, this.f54644m - getHeaderViewsCount());
        } else {
            i iVar = this.f54629b1;
            if (iVar != null) {
                iVar.f54691a = SystemClock.uptimeMillis();
                iVar.f54698h = false;
                DragSortListView dragSortListView = DragSortListView.this;
                iVar.f54675j = dragSortListView.f54639i;
                iVar.f54676k = dragSortListView.f54644m;
                dragSortListView.f54651v = 2;
                iVar.f54677l = dragSortListView.f54628b.y - iVar.c();
                iVar.f54678m = dragSortListView.f54628b.x - dragSortListView.getPaddingLeft();
                DragSortListView.this.post(iVar);
            } else {
                m();
            }
        }
        if (this.V0) {
            h hVar = this.W0;
            if (hVar.f54673e) {
                hVar.f54669a.append("</DSLVStates>\n");
                hVar.a();
                hVar.f54673e = false;
            }
        }
        return true;
    }

    public final void y() {
        int paddingTop = getPaddingTop();
        int height = (getHeight() - paddingTop) - getPaddingBottom();
        float f14 = height;
        float f15 = paddingTop;
        float f16 = (this.C * f14) + f15;
        this.P = f16;
        float fA = x.a(1.0f, this.D, f14, f15);
        this.I = fA;
        this.E = (int) f16;
        this.F = (int) fA;
        this.T = f16 - f15;
        this.f54642k0 = (paddingTop + height) - fA;
    }
}
