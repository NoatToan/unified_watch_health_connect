package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import com.huami.devicex.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivitySmallToolSortBinding implements ViewBinding {

    @NonNull
    private final FragmentContainerView a;

    @NonNull
    public final FragmentContainerView fragmentSmallToolSort;

    private ActivitySmallToolSortBinding(@NonNull FragmentContainerView fragmentContainerView, @NonNull FragmentContainerView fragmentContainerView2) {
        this.a = fragmentContainerView;
        this.fragmentSmallToolSort = fragmentContainerView2;
    }

    @NonNull
    public static ActivitySmallToolSortBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        FragmentContainerView fragmentContainerView = (FragmentContainerView) view;
        return new ActivitySmallToolSortBinding(fragmentContainerView, fragmentContainerView);
    }

    @NonNull
    public static ActivitySmallToolSortBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySmallToolSortBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_small_tool_sort, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FragmentContainerView getRoot() {
        return this.a;
    }
}
