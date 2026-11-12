package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityDataDetailBaseNewBinding implements ViewBinding {

    @NonNull
    private final NestedScrollView a;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final LayoutDetailDateTabSelectorBinding dateTab;

    private ActivityDataDetailBaseNewBinding(@NonNull NestedScrollView rootView, @NonNull FrameLayout container, @NonNull LayoutDetailDateTabSelectorBinding dateTab) {
        this.a = rootView;
        this.container = container;
        this.dateTab = dateTab;
    }

    @NonNull
    public static ActivityDataDetailBaseNewBinding bind(@NonNull View rootView) {
        int i = R.id.container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.container);
        if (frameLayout != null) {
            i = R.id.date_tab;
            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.date_tab);
            if (viewFindChildViewById != null) {
                return new ActivityDataDetailBaseNewBinding((NestedScrollView) rootView, frameLayout, LayoutDetailDateTabSelectorBinding.bind(viewFindChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityDataDetailBaseNewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityDataDetailBaseNewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_data_detail_base_new, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.a;
    }
}
