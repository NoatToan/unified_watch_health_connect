package com.huami.bloodpressure_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.bloodpressure_ui.R;
import com.huami.lib.rainbow.shapeable.ShapeableConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentBloodPressureResearchBinding implements ViewBinding {

    @NonNull
    private final ShapeableConstraintLayout a;

    @NonNull
    public final AppCompatImageView ivResearch;

    @NonNull
    public final View ivResearchDiv;

    @NonNull
    public final ShapeableConstraintLayout rootResearchContainer;

    @NonNull
    public final AppCompatTextView tvResearchAuthor;

    @NonNull
    public final AppCompatTextView tvResearchDesc;

    @NonNull
    public final AppCompatTextView tvResearchResult;

    @NonNull
    public final AppCompatTextView tvResearchTitle;

    @NonNull
    public final AppCompatTextView tvResearchUseraction;

    private FragmentBloodPressureResearchBinding(@NonNull ShapeableConstraintLayout shapeableConstraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull View view, @NonNull ShapeableConstraintLayout shapeableConstraintLayout2, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatTextView appCompatTextView4, @NonNull AppCompatTextView appCompatTextView5) {
        this.a = shapeableConstraintLayout;
        this.ivResearch = appCompatImageView;
        this.ivResearchDiv = view;
        this.rootResearchContainer = shapeableConstraintLayout2;
        this.tvResearchAuthor = appCompatTextView;
        this.tvResearchDesc = appCompatTextView2;
        this.tvResearchResult = appCompatTextView3;
        this.tvResearchTitle = appCompatTextView4;
        this.tvResearchUseraction = appCompatTextView5;
    }

    @NonNull
    public static FragmentBloodPressureResearchBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.iv_research;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.iv_research_div))) != null) {
            ShapeableConstraintLayout shapeableConstraintLayout = (ShapeableConstraintLayout) view;
            i = R.id.tv_research_author;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = R.id.tv_research_desc;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView2 != null) {
                    i = R.id.tv_research_result;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView3 != null) {
                        i = R.id.tv_research_title;
                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView4 != null) {
                            i = R.id.tv_research_useraction;
                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView5 != null) {
                                return new FragmentBloodPressureResearchBinding(shapeableConstraintLayout, appCompatImageView, viewFindChildViewById, shapeableConstraintLayout, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentBloodPressureResearchBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentBloodPressureResearchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_blood_pressure_research, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ShapeableConstraintLayout getRoot() {
        return this.a;
    }
}
