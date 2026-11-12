package com.huawei.phoneservice.feedback.media.impl.wiget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes41.dex */
public class LoadMoreRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f21647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21649c;
    private int d;
    private int e;
    private b g;
    private a i;

    public interface a {
        void a();
    }

    public interface b {
        void a();

        void b();
    }

    public void setReachBottomRow(int i) {
        if (i < 1) {
            i = 1;
        }
        this.d = i;
    }

    public void setOnRecyclerViewScrollStateListener(b bVar) {
        this.g = bVar;
    }

    public void setOnRecyclerViewPreloadListener(a aVar) {
        this.i = aVar;
    }

    public void setEnabledLoadMore(boolean z) {
        this.f21649c = z;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r4 == 0) goto L22;
     */
    @Override // androidx.recyclerview.widget.RecyclerView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onScrolled(int i, int i2) {
        boolean z;
        super.onScrolled(i, i2);
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        setLayoutManagerPosition(layoutManager);
        if (this.i != null && this.f21649c) {
            RecyclerView.Adapter adapter = getAdapter();
            if (adapter == null) {
                return;
            }
            if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                if (gridLayoutManager.findLastVisibleItemPosition() / gridLayoutManager.getSpanCount() < (adapter.getItemCount() / gridLayoutManager.getSpanCount()) - this.d) {
                    z = false;
                    this.f21647a = z;
                } else if (!this.f21647a) {
                    this.i.a();
                    if (i2 > 0) {
                        z = true;
                        this.f21647a = z;
                    }
                }
            } else {
                z = false;
                this.f21647a = z;
            }
        }
        if (this.g != null) {
            if (Math.abs(i2) < 150) {
                this.g.a();
            } else {
                this.g.b();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        b bVar;
        super.onScrollStateChanged(i);
        if (i == 0 || i == 1) {
            setLayoutManagerPosition(getLayoutManager());
        }
        if (i != 0 || (bVar = this.g) == null) {
            return;
        }
        bVar.a();
    }

    public int getLastVisiblePosition() {
        return this.f21648b;
    }

    public int getFirstVisiblePosition() {
        return this.e;
    }

    private void setLayoutManagerPosition(RecyclerView.LayoutManager layoutManager) {
        int iFindLastVisibleItemPosition;
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            this.e = gridLayoutManager.findFirstVisibleItemPosition();
            iFindLastVisibleItemPosition = gridLayoutManager.findLastVisibleItemPosition();
        } else {
            if (!(layoutManager instanceof LinearLayoutManager)) {
                return;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            this.e = linearLayoutManager.findFirstVisibleItemPosition();
            iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        }
        this.f21648b = iFindLastVisibleItemPosition;
    }

    public LoadMoreRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21647a = false;
        this.f21649c = false;
        this.d = 1;
    }

    public LoadMoreRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21647a = false;
        this.f21649c = false;
        this.d = 1;
    }

    public LoadMoreRecyclerView(Context context) {
        super(context);
        this.f21647a = false;
        this.f21649c = false;
        this.d = 1;
    }
}
