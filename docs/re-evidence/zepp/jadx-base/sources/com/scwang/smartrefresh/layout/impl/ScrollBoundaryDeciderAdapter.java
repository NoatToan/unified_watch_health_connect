package com.scwang.smartrefresh.layout.impl;

import android.view.MotionEvent;
import android.view.View;
import com.scwang.smartrefresh.layout.api.ScrollBoundaryDecider;
import com.scwang.smartrefresh.layout.util.ScrollBoundaryUtil;

/* JADX INFO: loaded from: classes18.dex */
public class ScrollBoundaryDeciderAdapter implements ScrollBoundaryDecider {
    public ScrollBoundaryDecider boundary;
    public MotionEvent mActionEvent;
    public boolean mEnableLoadmoreWhenContentNotFull;

    public void a(MotionEvent motionEvent) {
        this.mActionEvent = motionEvent;
    }

    public void b(ScrollBoundaryDecider scrollBoundaryDecider) {
        this.boundary = scrollBoundaryDecider;
    }

    @Override // com.scwang.smartrefresh.layout.api.ScrollBoundaryDecider
    public boolean canLoadmore(View view) {
        ScrollBoundaryDecider scrollBoundaryDecider = this.boundary;
        if (scrollBoundaryDecider != null) {
            return scrollBoundaryDecider.canLoadmore(view);
        }
        return this.mEnableLoadmoreWhenContentNotFull ? !ScrollBoundaryUtil.canScrollDown(view, this.mActionEvent) : ScrollBoundaryUtil.canLoadmore(view, this.mActionEvent);
    }

    @Override // com.scwang.smartrefresh.layout.api.ScrollBoundaryDecider
    public boolean canRefresh(View view) {
        ScrollBoundaryDecider scrollBoundaryDecider = this.boundary;
        return scrollBoundaryDecider != null ? scrollBoundaryDecider.canRefresh(view) : ScrollBoundaryUtil.canRefresh(view, this.mActionEvent);
    }

    public void setEnableLoadmoreWhenContentNotFull(boolean z) {
        this.mEnableLoadmoreWhenContentNotFull = z;
    }
}
