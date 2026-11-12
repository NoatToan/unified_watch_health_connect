package com.huami.android.design.dialog.pager;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class ViewPagerLayoutManager extends LinearLayoutManager {
    private final PagerSnapHelper a;
    private OnViewPagerListener b;
    private int c;
    private final RecyclerView.OnChildAttachStateChangeListener d;

    public interface OnViewPagerListener {
        void onInitComplete();

        void onPageRelease(boolean z, int i);

        void onPageSelected(int i);
    }

    public class a implements RecyclerView.OnChildAttachStateChangeListener {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewAttachedToWindow(@NonNull View view) {
            if (ViewPagerLayoutManager.this.b == null || ViewPagerLayoutManager.this.getChildCount() != 1) {
                return;
            }
            ViewPagerLayoutManager.this.b.onInitComplete();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewDetachedFromWindow(@NonNull View view) {
            if (ViewPagerLayoutManager.this.b != null) {
                ViewPagerLayoutManager.this.b.onPageRelease(ViewPagerLayoutManager.this.c >= 0, ViewPagerLayoutManager.this.getPosition(view));
            }
        }
    }

    public ViewPagerLayoutManager(Context context) {
        super(context, 0, false);
        this.d = new a();
        this.a = new PagerSnapHelper();
    }

    public int findSnapPosition() {
        View viewFindSnapView = this.a.findSnapView(this);
        if (viewFindSnapView != null) {
            return getPosition(viewFindSnapView);
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.a.attachToRecyclerView(recyclerView);
        recyclerView.addOnChildAttachStateChangeListener(this.d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i) {
        View viewFindSnapView;
        if (i != 0 || (viewFindSnapView = this.a.findSnapView(this)) == null) {
            return;
        }
        int position = getPosition(viewFindSnapView);
        if (this.b == null || getChildCount() > 2) {
            return;
        }
        this.b.onPageSelected(position);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        this.c = i;
        return super.scrollHorizontallyBy(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        this.c = i;
        return super.scrollVerticallyBy(i, recycler, state);
    }

    public void setOnViewPagerListener(OnViewPagerListener onViewPagerListener) {
        this.b = onViewPagerListener;
    }
}
