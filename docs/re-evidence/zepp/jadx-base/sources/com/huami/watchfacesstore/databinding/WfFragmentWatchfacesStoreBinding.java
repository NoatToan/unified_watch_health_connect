package com.huami.watchfacesstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.view.recycleview.LoadMoreRecyclerView;

/* JADX INFO: loaded from: classes17.dex */
public final class WfFragmentWatchfacesStoreBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final LoadMoreRecyclerView homeRecyclerView;

    private WfFragmentWatchfacesStoreBinding(@NonNull LinearLayout rootView, @NonNull LoadMoreRecyclerView homeRecyclerView) {
        this.a = rootView;
        this.homeRecyclerView = homeRecyclerView;
    }

    @NonNull
    public static WfFragmentWatchfacesStoreBinding bind(@NonNull View rootView) {
        int i = R.id.home_recyclerView;
        LoadMoreRecyclerView loadMoreRecyclerView = (LoadMoreRecyclerView) ViewBindings.findChildViewById(rootView, i);
        if (loadMoreRecyclerView != null) {
            return new WfFragmentWatchfacesStoreBinding((LinearLayout) rootView, loadMoreRecyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static WfFragmentWatchfacesStoreBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WfFragmentWatchfacesStoreBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_fragment_watchfaces_store, parent, false);
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
