package com.huami.bloodpressure_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import com.huami.bloodpressure_ui.R;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentAnalyseBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final FlexboxLayout flTitle;

    @NonNull
    public final AppCompatImageView ivResearchDetail;

    @NonNull
    public final View lineAnalyse;

    @NonNull
    public final RecyclerView ryContent;

    @NonNull
    public final TextView tvAnalyseTitle;

    private FragmentAnalyseBinding(@NonNull ConstraintLayout constraintLayout, @NonNull FlexboxLayout flexboxLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.a = constraintLayout;
        this.flTitle = flexboxLayout;
        this.ivResearchDetail = appCompatImageView;
        this.lineAnalyse = view;
        this.ryContent = recyclerView;
        this.tvAnalyseTitle = textView;
    }

    @NonNull
    public static FragmentAnalyseBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.fl_title;
        FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i);
        if (flexboxLayout != null) {
            i = R.id.iv_research_detail;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line_analyse))) != null) {
                i = R.id.ry_content;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = R.id.tv_analyse_title;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        return new FragmentAnalyseBinding((ConstraintLayout) view, flexboxLayout, appCompatImageView, viewFindChildViewById, recyclerView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentAnalyseBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentAnalyseBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_analyse, viewGroup, false);
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
