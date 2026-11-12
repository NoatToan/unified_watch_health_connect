package com.huawei.uikit.hwsubheader.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.uikit.hwrecyclerview.widget.HwLinearLayoutManager;
import com.huawei.uikit.hwrecyclerview.widget.HwOnOverScrollListener;
import com.huawei.uikit.hwrecyclerview.widget.HwRecyclerView;
import com.huawei.uikit.hwsubheader.R;
import defpackage.xgo;

/* JADX INFO: loaded from: classes20.dex */
public class HwSubHeader extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f29730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HwRecyclerView f29731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SubHeaderRecyclerAdapter f29732c;
    private FrameLayout d;
    private Context e;
    private View f;
    private int g;
    private int h;
    private SparseArray<View> i;
    private RecyclerView.LayoutManager j;
    private int k;
    private float l;
    private int m;
    private xgo n;
    private float o;
    private boolean q;
    private HwRecyclerView.DeleteAnimatorCallback r;
    private HwSubHeaderOverScrollListener s;

    public static abstract class SubHeaderRecyclerAdapter extends RecyclerView.Adapter {
        public static final int NO_POSITION = -1;
        public static final int TYPE_HEADER = 1;
        public static final int TYPE_ITEM = 0;

        public abstract View getHeaderViewAsPos(int i, Context context);

        public abstract int getItemType(int i);

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (i < 0 || i >= getItemCount()) {
                return -1;
            }
            return getItemType(i);
        }
    }

    /* JADX INFO: loaded from: classes44.dex */
    class a extends RecyclerView.OnScrollListener {
        private a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int iD;
            int iB;
            super.onScrolled(recyclerView, i, i2);
            if (!HwSubHeader.this.q) {
                Log.w("HwSubHeader", "no use the stick function");
                return;
            }
            if (HwSubHeader.this.j == null || !((HwSubHeader.this.j instanceof LinearLayoutManager) || (HwSubHeader.this.j instanceof HwLinearLayoutManager))) {
                Log.w("HwSubHeader", "The currently bound LayoutManager " + HwSubHeader.this.j);
                return;
            }
            if (HwSubHeader.this.j instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) HwSubHeader.this.j;
                iD = linearLayoutManager.findFirstVisibleItemPosition();
                iB = linearLayoutManager.findLastVisibleItemPosition();
            } else {
                HwLinearLayoutManager hwLinearLayoutManager = (HwLinearLayoutManager) HwSubHeader.this.j;
                iD = hwLinearLayoutManager.d();
                iB = hwLinearLayoutManager.b();
            }
            HwSubHeader.this.g = iD;
            if (HwSubHeader.this.f29732c == null) {
                return;
            }
            while (iD < iB + 1) {
                if (HwSubHeader.this.f29732c.getItemViewType(iD) == 1) {
                    HwSubHeader.this.c();
                    View viewFindViewByPosition = HwSubHeader.this.j.findViewByPosition(iD);
                    HwSubHeader hwSubHeader = HwSubHeader.this;
                    hwSubHeader.h = hwSubHeader.d.getMeasuredHeight();
                    if (viewFindViewByPosition != null) {
                        if (viewFindViewByPosition.getTop() > HwSubHeader.this.h || viewFindViewByPosition.getTop() <= 0) {
                            HwSubHeader hwSubHeader2 = HwSubHeader.this;
                            hwSubHeader2.o = -hwSubHeader2.getTop();
                            HwSubHeader.this.a();
                            return;
                        } else {
                            HwSubHeader hwSubHeader3 = HwSubHeader.this;
                            hwSubHeader3.o = (-(hwSubHeader3.h - viewFindViewByPosition.getTop())) - HwSubHeader.this.getTop();
                            HwSubHeader.this.a();
                            return;
                        }
                    }
                    return;
                }
                iD++;
            }
        }

        /* synthetic */ a(HwSubHeader hwSubHeader, c cVar) {
            this();
        }
    }

    class c implements HwOnOverScrollListener {
        c() {
        }

        @Override // com.huawei.uikit.hwrecyclerview.widget.HwOnOverScrollListener
        public void onOverScrollEnd() {
            HwSubHeader.this.l = 0.0f;
            HwSubHeader.this.a();
            if (HwSubHeader.this.s != null) {
                HwSubHeader.this.s.onTopOverScroll(0.0f);
            }
        }

        @Override // com.huawei.uikit.hwrecyclerview.widget.HwOnOverScrollListener
        public void onOverScrollStart() {
        }

        @Override // com.huawei.uikit.hwrecyclerview.widget.HwOnOverScrollListener
        public void onOverScrolled(float f) {
            HwSubHeader.this.l = f;
            HwSubHeader.this.a();
            if (HwSubHeader.this.s != null) {
                HwSubHeader.this.s.onTopOverScroll(f);
            }
        }
    }

    /* JADX INFO: loaded from: classes44.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int positionByView;
            if (HwSubHeader.this.j != null) {
                if (((HwSubHeader.this.j instanceof LinearLayoutManager) || (HwSubHeader.this.j instanceof HwLinearLayoutManager)) && HwSubHeader.this.r != null) {
                    int childCount = HwSubHeader.this.j.getChildCount();
                    for (int firstVisibleViewIndex = HwSubHeader.this.f29731b.getFirstVisibleViewIndex(); firstVisibleViewIndex < childCount; firstVisibleViewIndex++) {
                        View childAt = HwSubHeader.this.j.getChildAt(firstVisibleViewIndex);
                        if (childAt != null && !childAt.isDirty() && (positionByView = HwSubHeader.this.r.getPositionByView(childAt)) >= 0) {
                            if (firstVisibleViewIndex == 0) {
                                HwSubHeader.this.g = positionByView;
                            }
                            if (HwSubHeader.this.f29732c != null && HwSubHeader.this.f29732c.getItemViewType(positionByView) == 1) {
                                HwSubHeader.this.c();
                                HwSubHeader hwSubHeader = HwSubHeader.this;
                                hwSubHeader.h = hwSubHeader.d.getMeasuredHeight();
                                int top = childAt.getTop();
                                if (top > HwSubHeader.this.h || top <= 0) {
                                    return;
                                }
                                HwSubHeader hwSubHeader2 = HwSubHeader.this;
                                hwSubHeader2.o = (-(hwSubHeader2.h - top)) - HwSubHeader.this.getTop();
                                HwSubHeader.this.a();
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    class e extends RecyclerView.AdapterDataObserver {
        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            if (HwSubHeader.this.i != null) {
                HwSubHeader.this.i.clear();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            if (HwSubHeader.this.i != null) {
                HwSubHeader.this.i.clear();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            if (HwSubHeader.this.i != null) {
                HwSubHeader.this.i.clear();
            }
        }
    }

    public HwSubHeader(Context context) {
        this(context, null);
    }

    public void e() {
        this.i.clear();
        this.d.removeAllViews();
        this.f = null;
        this.f29730a = null;
        this.m = -1;
        this.k = -1;
        this.g = 0;
        c();
    }

    public View getCurrentHeaderView() {
        return this.f29730a;
    }

    public HwSubHeaderOverScrollListener getOverScrollListener() {
        return this.s;
    }

    public HwRecyclerView getRecyclerView() {
        return this.f29731b;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.n.c(windowInsets);
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f29730a;
        if (view != null) {
            c(view);
        }
    }

    public void setAdapter(SubHeaderRecyclerAdapter subHeaderRecyclerAdapter) {
        if (subHeaderRecyclerAdapter == null) {
            Log.w("HwSubHeader", "the adapter is null");
            return;
        }
        this.f29732c = subHeaderRecyclerAdapter;
        this.f29731b.setAdapter(subHeaderRecyclerAdapter);
        e();
        this.f29732c.registerAdapterDataObserver(new e());
    }

    public void setIsStick(boolean z) {
        this.q = z;
        this.d.removeAllViews();
    }

    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager == null) {
            Log.w("HwSubHeader", "the layoutManager is null");
        } else {
            this.j = layoutManager;
            this.f29731b.setLayoutManager(layoutManager);
        }
    }

    public void setOverScrollListener(HwSubHeaderOverScrollListener hwSubHeaderOverScrollListener) {
        this.s = hwSubHeaderOverScrollListener;
    }

    public HwSubHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setViewLayoutDirection(View view) {
        view.setLayoutDirection(getLayoutDirection());
    }

    public HwSubHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = 0;
        this.m = -1;
        this.k = -1;
        this.l = 0.0f;
        this.o = 0.0f;
        this.n = new xgo(this);
        c(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (!this.q) {
            Log.w("HwSubHeader", "no use the stick function");
            return;
        }
        SubHeaderRecyclerAdapter subHeaderRecyclerAdapter = this.f29732c;
        if (subHeaderRecyclerAdapter != null && subHeaderRecyclerAdapter.getItemCount() > 0) {
            View view = this.i.get(this.g);
            this.f29730a = view;
            if (view == null) {
                View headerViewAsPos = this.f29732c.getHeaderViewAsPos(this.g, this.e);
                this.f29730a = headerViewAsPos;
                this.i.put(this.g, headerViewAsPos);
            }
            View view2 = this.f29730a;
            if (view2 == null) {
                Log.w("HwSubHeader", "the mCurrentView is null");
                return;
            }
            if (view2 != this.f) {
                this.d.removeAllViews();
                if (this.f29730a.getParent() == null) {
                    this.d.addView(this.f29730a);
                    this.o = -getTop();
                    a();
                } else {
                    Log.w("HwSubHeader", "the mCurrentView has Parent");
                }
                this.f = this.f29730a;
                return;
            }
            return;
        }
        Log.w("HwSubHeader", "adapter is null or itemCount <= 0 !");
    }

    private void c(Context context, AttributeSet attributeSet) {
        this.e = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwSubHeader);
        this.q = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwSubHeader_hwStick, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(R.layout.hwsubheader_layout, (ViewGroup) this, true);
        this.f29731b = (HwRecyclerView) findViewById(R.id.hwsubheader_recyclerview);
        this.d = (FrameLayout) findViewById(R.id.hwsubheader_header);
        this.f29731b.addOnScrollListener(new a(this, null));
        this.f29731b.setSubHeaderDeleteUpdate(new d());
        this.i = new SparseArray<>(0);
        this.n.d(context, attributeSet);
        this.f29731b.e(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        FrameLayout frameLayout = this.d;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.l + this.o);
        }
    }

    private void c(View view) {
        if (this.k == -1 || this.m == -1) {
            setViewLayoutDirection(view);
            this.m = view.getPaddingLeft();
            this.k = view.getPaddingRight();
        }
        Rect rectE = this.n.e(this, new Rect(this.m, view.getPaddingTop(), this.k, view.getPaddingBottom()));
        if (rectE.left == 0 && rectE.right == 0) {
            return;
        }
        this.n.e(view, new Rect(rectE.left, view.getPaddingTop(), rectE.right, view.getPaddingBottom()), false);
    }
}
