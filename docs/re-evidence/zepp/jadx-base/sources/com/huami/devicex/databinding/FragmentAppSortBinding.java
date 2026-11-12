package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.view.FixedXRecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentAppSortBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final FixedXRecyclerView contentLayout;

    @NonNull
    public final AppSortToolbarBackTitleRightBtnBinding toolbarLayout;

    private FragmentAppSortBinding(@NonNull ConstraintLayout constraintLayout, @NonNull FixedXRecyclerView fixedXRecyclerView, @NonNull AppSortToolbarBackTitleRightBtnBinding appSortToolbarBackTitleRightBtnBinding) {
        this.a = constraintLayout;
        this.contentLayout = fixedXRecyclerView;
        this.toolbarLayout = appSortToolbarBackTitleRightBtnBinding;
    }

    @NonNull
    public static FragmentAppSortBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.content_layout;
        FixedXRecyclerView fixedXRecyclerView = (FixedXRecyclerView) ViewBindings.findChildViewById(view, i);
        if (fixedXRecyclerView == null || (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.toolbar_layout))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        }
        return new FragmentAppSortBinding((ConstraintLayout) view, fixedXRecyclerView, AppSortToolbarBackTitleRightBtnBinding.bind(viewFindChildViewById));
    }

    @NonNull
    public static FragmentAppSortBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentAppSortBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_app_sort, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
