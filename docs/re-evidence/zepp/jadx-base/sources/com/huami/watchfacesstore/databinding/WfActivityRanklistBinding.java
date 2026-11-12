package com.huami.watchfacesstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.view.CommonTitleBar;
import com.huami.watchfacesstore.view.banner.Banner;
import com.huami.watchfacesstore.view.recycleview.LoadMoreRecyclerView;

/* JADX INFO: loaded from: classes17.dex */
public final class WfActivityRanklistBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final CommonTitleBar commonTitleBar;

    @NonNull
    public final LinearLayout errorContainer;

    @NonNull
    public final TextView errorTipsTv;

    @NonNull
    public final Banner rankBanner;

    @NonNull
    public final TextView refreshTv;

    @NonNull
    public final LoadMoreRecyclerView rlOtherList;

    @NonNull
    public final NestedScrollView scrollView;

    private WfActivityRanklistBinding(@NonNull FrameLayout rootView, @NonNull CommonTitleBar commonTitleBar, @NonNull LinearLayout errorContainer, @NonNull TextView errorTipsTv, @NonNull Banner rankBanner, @NonNull TextView refreshTv, @NonNull LoadMoreRecyclerView rlOtherList, @NonNull NestedScrollView scrollView) {
        this.a = rootView;
        this.commonTitleBar = commonTitleBar;
        this.errorContainer = errorContainer;
        this.errorTipsTv = errorTipsTv;
        this.rankBanner = rankBanner;
        this.refreshTv = refreshTv;
        this.rlOtherList = rlOtherList;
        this.scrollView = scrollView;
    }

    @NonNull
    public static WfActivityRanklistBinding bind(@NonNull View rootView) {
        int i = R.id.common_title_bar;
        CommonTitleBar commonTitleBar = (CommonTitleBar) ViewBindings.findChildViewById(rootView, i);
        if (commonTitleBar != null) {
            i = R.id.error_container;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
            if (linearLayout != null) {
                i = R.id.error_tips_tv;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView != null) {
                    i = R.id.rank_banner;
                    Banner banner = (Banner) ViewBindings.findChildViewById(rootView, i);
                    if (banner != null) {
                        i = R.id.refresh_tv;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            i = R.id.rl_other_list;
                            LoadMoreRecyclerView loadMoreRecyclerView = (LoadMoreRecyclerView) ViewBindings.findChildViewById(rootView, i);
                            if (loadMoreRecyclerView != null) {
                                i = R.id.scroll_view;
                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, i);
                                if (nestedScrollView != null) {
                                    return new WfActivityRanklistBinding((FrameLayout) rootView, commonTitleBar, linearLayout, textView, banner, textView2, loadMoreRecyclerView, nestedScrollView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static WfActivityRanklistBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WfActivityRanklistBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_activity_ranklist, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
