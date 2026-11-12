package com.huami.healthlabel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.healthlabel.R;

/* JADX INFO: loaded from: classes9.dex */
public final class LayoutLabelManagerShowModeBinding implements ViewBinding {

    @NonNull
    private final NestedScrollView a;

    @NonNull
    public final AppCompatTextView healthLabelManagerNotShow;

    @NonNull
    public final RecyclerView healthLabelManagerNotShowRecycler;

    @NonNull
    public final AppCompatTextView healthLabelManagerShow;

    @NonNull
    public final RecyclerView healthLabelManagerShowRecycler;

    private LayoutLabelManagerShowModeBinding(@NonNull NestedScrollView rootView, @NonNull AppCompatTextView healthLabelManagerNotShow, @NonNull RecyclerView healthLabelManagerNotShowRecycler, @NonNull AppCompatTextView healthLabelManagerShow, @NonNull RecyclerView healthLabelManagerShowRecycler) {
        this.a = rootView;
        this.healthLabelManagerNotShow = healthLabelManagerNotShow;
        this.healthLabelManagerNotShowRecycler = healthLabelManagerNotShowRecycler;
        this.healthLabelManagerShow = healthLabelManagerShow;
        this.healthLabelManagerShowRecycler = healthLabelManagerShowRecycler;
    }

    @NonNull
    public static LayoutLabelManagerShowModeBinding bind(@NonNull View rootView) {
        int i = R.id.health_label_manager_not_show;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
        if (appCompatTextView != null) {
            i = R.id.health_label_manager_not_show_recycler;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, i);
            if (recyclerView != null) {
                i = R.id.health_label_manager_show;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
                if (appCompatTextView2 != null) {
                    i = R.id.health_label_manager_show_recycler;
                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, i);
                    if (recyclerView2 != null) {
                        return new LayoutLabelManagerShowModeBinding((NestedScrollView) rootView, appCompatTextView, recyclerView, appCompatTextView2, recyclerView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutLabelManagerShowModeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutLabelManagerShowModeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_label_manager_show_mode, parent, false);
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
