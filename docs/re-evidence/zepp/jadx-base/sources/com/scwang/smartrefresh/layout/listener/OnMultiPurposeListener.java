package com.scwang.smartrefresh.layout.listener;

import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshHeader;

/* JADX INFO: loaded from: classes18.dex */
public interface OnMultiPurposeListener extends OnRefreshLoadmoreListener, OnStateChangedListener {
    void onFooterFinish(RefreshFooter refreshFooter, boolean z);

    void onFooterPulling(RefreshFooter refreshFooter, float f, int i, int i2, int i3);

    void onFooterReleasing(RefreshFooter refreshFooter, float f, int i, int i2, int i3);

    void onFooterStartAnimator(RefreshFooter refreshFooter, int i, int i2);

    void onHeaderFinish(RefreshHeader refreshHeader, boolean z);

    void onHeaderPulling(RefreshHeader refreshHeader, float f, int i, int i2, int i3);

    void onHeaderReleasing(RefreshHeader refreshHeader, float f, int i, int i2, int i3);

    void onHeaderStartAnimator(RefreshHeader refreshHeader, int i, int i2);
}
