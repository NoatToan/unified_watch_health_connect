package com.huami.watchfacesstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.view.CommonTitleBar;
import com.huami.watchfacesstore.view.recycleview.LoadMoreRecyclerView;

/* JADX INFO: loaded from: classes17.dex */
public final class WfActivityCommonListBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final CommonTitleBar commonTitleBar;

    @NonNull
    public final LinearLayout llDelete;

    @NonNull
    public final LinearLayout llLocalWatchTip;

    @NonNull
    public final LoadMoreRecyclerView rlList;

    @NonNull
    public final TextView tvAllChoose;

    @NonNull
    public final TextView tvDelete;

    @NonNull
    public final TextView tvTip;

    private WfActivityCommonListBinding(@NonNull LinearLayout rootView, @NonNull CommonTitleBar commonTitleBar, @NonNull LinearLayout llDelete, @NonNull LinearLayout llLocalWatchTip, @NonNull LoadMoreRecyclerView rlList, @NonNull TextView tvAllChoose, @NonNull TextView tvDelete, @NonNull TextView tvTip) {
        this.a = rootView;
        this.commonTitleBar = commonTitleBar;
        this.llDelete = llDelete;
        this.llLocalWatchTip = llLocalWatchTip;
        this.rlList = rlList;
        this.tvAllChoose = tvAllChoose;
        this.tvDelete = tvDelete;
        this.tvTip = tvTip;
    }

    @NonNull
    public static WfActivityCommonListBinding bind(@NonNull View rootView) {
        int i = R.id.common_title_bar;
        CommonTitleBar commonTitleBar = (CommonTitleBar) ViewBindings.findChildViewById(rootView, i);
        if (commonTitleBar != null) {
            i = R.id.ll_delete;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
            if (linearLayout != null) {
                i = R.id.ll_local_watch_tip;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                if (linearLayout2 != null) {
                    i = R.id.rl_list;
                    LoadMoreRecyclerView loadMoreRecyclerView = (LoadMoreRecyclerView) ViewBindings.findChildViewById(rootView, i);
                    if (loadMoreRecyclerView != null) {
                        i = R.id.tv_all_choose;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView != null) {
                            i = R.id.tv_delete;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView2 != null) {
                                i = R.id.tv_tip;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                if (textView3 != null) {
                                    return new WfActivityCommonListBinding((LinearLayout) rootView, commonTitleBar, linearLayout, linearLayout2, loadMoreRecyclerView, textView, textView2, textView3);
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
    public static WfActivityCommonListBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WfActivityCommonListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_activity_common_list, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
