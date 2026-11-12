package com.huami.watchfacesstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watchfacesstore.R;

/* JADX INFO: loaded from: classes17.dex */
public final class WfHomeItemCommonBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final RecyclerView homeItemRecyclerView;

    @NonNull
    public final WfItemCommonTitleBinding title;

    private WfHomeItemCommonBinding(@NonNull LinearLayout rootView, @NonNull RecyclerView homeItemRecyclerView, @NonNull WfItemCommonTitleBinding title) {
        this.a = rootView;
        this.homeItemRecyclerView = homeItemRecyclerView;
        this.title = title;
    }

    @NonNull
    public static WfHomeItemCommonBinding bind(@NonNull View rootView) {
        View viewFindChildViewById;
        int i = R.id.home_item_recyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, i);
        if (recyclerView == null || (viewFindChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.title))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
        }
        return new WfHomeItemCommonBinding((LinearLayout) rootView, recyclerView, WfItemCommonTitleBinding.bind(viewFindChildViewById));
    }

    @NonNull
    public static WfHomeItemCommonBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WfHomeItemCommonBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_home_item_common, parent, false);
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
