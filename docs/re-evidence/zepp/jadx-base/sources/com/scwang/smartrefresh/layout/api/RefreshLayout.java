package com.scwang.smartrefresh.layout.api;

import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.annotation.ColorRes;
import androidx.annotation.Nullable;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.listener.OnLoadmoreListener;
import com.scwang.smartrefresh.layout.listener.OnMultiPurposeListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadmoreListener;

/* JADX INFO: loaded from: classes18.dex */
public interface RefreshLayout {
    boolean autoLoadmore();

    boolean autoLoadmore(int i);

    boolean autoLoadmore(int i, float f);

    boolean autoRefresh();

    boolean autoRefresh(int i);

    boolean autoRefresh(int i, float f);

    RefreshLayout finishLoadmore();

    RefreshLayout finishLoadmore(int i);

    RefreshLayout finishLoadmore(int i, boolean z);

    RefreshLayout finishLoadmore(boolean z);

    RefreshLayout finishRefresh();

    RefreshLayout finishRefresh(int i);

    RefreshLayout finishRefresh(int i, boolean z);

    RefreshLayout finishRefresh(boolean z);

    ViewGroup getLayout();

    @Nullable
    RefreshFooter getRefreshFooter();

    @Nullable
    RefreshHeader getRefreshHeader();

    RefreshState getState();

    boolean isEnableAutoLoadmore();

    boolean isEnableLoadmore();

    boolean isEnableOverScrollBounce();

    boolean isEnablePureScrollMode();

    boolean isEnableRefresh();

    boolean isEnableScrollContentWhenLoaded();

    boolean isLoading();

    boolean isLoadmoreFinished();

    boolean isRefreshing();

    RefreshLayout setDisableContentWhenLoading(boolean z);

    RefreshLayout setDisableContentWhenRefresh(boolean z);

    RefreshLayout setDragRate(float f);

    RefreshLayout setEnableAutoLoadmore(boolean z);

    RefreshLayout setEnableFooterTranslationContent(boolean z);

    RefreshLayout setEnableHeaderTranslationContent(boolean z);

    RefreshLayout setEnableLoadmore(boolean z);

    RefreshLayout setEnableLoadmoreWhenContentNotFull(boolean z);

    RefreshLayout setEnableNestedScroll(boolean z);

    RefreshLayout setEnableOverScrollBounce(boolean z);

    RefreshLayout setEnablePureScrollMode(boolean z);

    RefreshLayout setEnableRefresh(boolean z);

    RefreshLayout setEnableScrollContentWhenLoaded(boolean z);

    RefreshLayout setFooterHeight(float f);

    RefreshLayout setFooterHeightPx(int i);

    RefreshLayout setFooterMaxDragRate(float f);

    RefreshLayout setHeaderHeight(float f);

    RefreshLayout setHeaderHeightPx(int i);

    RefreshLayout setHeaderMaxDragRate(float f);

    RefreshLayout setLoadmoreFinished(boolean z);

    RefreshLayout setOnLoadmoreListener(OnLoadmoreListener onLoadmoreListener);

    RefreshLayout setOnMultiPurposeListener(OnMultiPurposeListener onMultiPurposeListener);

    RefreshLayout setOnRefreshListener(OnRefreshListener onRefreshListener);

    RefreshLayout setOnRefreshLoadmoreListener(OnRefreshLoadmoreListener onRefreshLoadmoreListener);

    RefreshLayout setPrimaryColors(int... iArr);

    RefreshLayout setPrimaryColorsId(@ColorRes int... iArr);

    RefreshLayout setReboundDuration(int i);

    RefreshLayout setReboundInterpolator(Interpolator interpolator);

    RefreshLayout setRefreshFooter(RefreshFooter refreshFooter);

    RefreshLayout setRefreshFooter(RefreshFooter refreshFooter, int i, int i2);

    RefreshLayout setRefreshHeader(RefreshHeader refreshHeader);

    RefreshLayout setRefreshHeader(RefreshHeader refreshHeader, int i, int i2);

    RefreshLayout setScrollBoundaryDecider(ScrollBoundaryDecider scrollBoundaryDecider);
}
