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
public final class WfItemMyWatchBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final WfItemCommonTitleBinding title;

    @NonNull
    public final RecyclerView watchFaceRecyclerView;

    private WfItemMyWatchBinding(@NonNull LinearLayout rootView, @NonNull WfItemCommonTitleBinding title, @NonNull RecyclerView watchFaceRecyclerView) {
        this.a = rootView;
        this.title = title;
        this.watchFaceRecyclerView = watchFaceRecyclerView;
    }

    @NonNull
    public static WfItemMyWatchBinding bind(@NonNull View rootView) {
        int i = R.id.title;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, i);
        if (viewFindChildViewById != null) {
            WfItemCommonTitleBinding wfItemCommonTitleBindingBind = WfItemCommonTitleBinding.bind(viewFindChildViewById);
            int i2 = R.id.watch_face_recyclerView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, i2);
            if (recyclerView != null) {
                return new WfItemMyWatchBinding((LinearLayout) rootView, wfItemCommonTitleBindingBind, recyclerView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static WfItemMyWatchBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WfItemMyWatchBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_item_my_watch, parent, false);
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
