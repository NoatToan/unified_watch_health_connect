package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentMyToolBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatImageView ivSort;

    @NonNull
    public final RecyclerView recyclerView;

    @NonNull
    public final TypefaceTextView tvTitle;

    private FragmentMyToolBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatImageView ivSort, @NonNull RecyclerView recyclerView, @NonNull TypefaceTextView tvTitle) {
        this.a = rootView;
        this.ivSort = ivSort;
        this.recyclerView = recyclerView;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static FragmentMyToolBinding bind(@NonNull View rootView) {
        int i = R.id.iv_sort;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_sort);
        if (appCompatImageView != null) {
            i = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recycler_view);
            if (recyclerView != null) {
                i = R.id.tv_title;
                TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.tv_title);
                if (typefaceTextView != null) {
                    return new FragmentMyToolBinding((ConstraintLayout) rootView, appCompatImageView, recyclerView, typefaceTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMyToolBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentMyToolBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_my_tool, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
