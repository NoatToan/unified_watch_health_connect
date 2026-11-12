package com.scwang.smartrefresh.layout.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes18.dex */
public interface RefreshKernel {
    RefreshKernel animSpinner(int i);

    RefreshKernel animSpinnerBounce(int i);

    @NonNull
    RefreshContent getRefreshContent();

    @NonNull
    RefreshLayout getRefreshLayout();

    int getSpinner();

    RefreshKernel moveSpinner(int i, boolean z);

    RefreshKernel moveSpinnerInfinitely(float f);

    RefreshKernel overSpinner();

    RefreshKernel requestDrawBackgoundForFooter(int i);

    RefreshKernel requestDrawBackgoundForHeader(int i);

    RefreshKernel requestFooterNeedTouchEventWhenLoading(boolean z);

    RefreshKernel requestHeaderNeedTouchEventWhenRefreshing(boolean z);

    RefreshKernel requestRemeasureHeightForFooter();

    RefreshKernel requestRemeasureHeightForHeader();

    RefreshKernel resetStatus();

    RefreshKernel setStateLoding();

    RefreshKernel setStateLodingFinish();

    RefreshKernel setStatePullDownCanceled();

    RefreshKernel setStatePullDownToRefresh();

    RefreshKernel setStatePullUpCanceled();

    RefreshKernel setStatePullUpToLoad();

    RefreshKernel setStateRefresing();

    RefreshKernel setStateRefresingFinish();

    RefreshKernel setStateReleaseToLoad();

    RefreshKernel setStateReleaseToRefresh();
}
