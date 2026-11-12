package com.huami.healthlabel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.healthlabel.R;

/* JADX INFO: loaded from: classes9.dex */
public final class ActivityHealthLabelManagerBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ConstraintLayout healthLabelContainer;

    @NonNull
    public final ConstraintLayout healthLabelManagerAddLayout;

    @NonNull
    public final View healthLabelManagerAddView;

    @NonNull
    public final AppCompatImageView healthLabelManagerBack;

    @NonNull
    public final AppCompatTextView healthLabelManagerCancel;

    @NonNull
    public final AppCompatTextView healthLabelManagerDone;

    @NonNull
    public final AppCompatTextView healthLabelManagerEdit;

    @NonNull
    public final RecyclerView healthLabelManagerRecyclerView;

    @NonNull
    public final AppCompatTextView healthLabelManagerTitle;

    @NonNull
    public final LayoutLabelManagerShowModeBinding layoutHealthLabelManager;

    @NonNull
    public final View view1;

    private ActivityHealthLabelManagerBinding(@NonNull ConstraintLayout rootView, @NonNull ConstraintLayout healthLabelContainer, @NonNull ConstraintLayout healthLabelManagerAddLayout, @NonNull View healthLabelManagerAddView, @NonNull AppCompatImageView healthLabelManagerBack, @NonNull AppCompatTextView healthLabelManagerCancel, @NonNull AppCompatTextView healthLabelManagerDone, @NonNull AppCompatTextView healthLabelManagerEdit, @NonNull RecyclerView healthLabelManagerRecyclerView, @NonNull AppCompatTextView healthLabelManagerTitle, @NonNull LayoutLabelManagerShowModeBinding layoutHealthLabelManager, @NonNull View view1) {
        this.a = rootView;
        this.healthLabelContainer = healthLabelContainer;
        this.healthLabelManagerAddLayout = healthLabelManagerAddLayout;
        this.healthLabelManagerAddView = healthLabelManagerAddView;
        this.healthLabelManagerBack = healthLabelManagerBack;
        this.healthLabelManagerCancel = healthLabelManagerCancel;
        this.healthLabelManagerDone = healthLabelManagerDone;
        this.healthLabelManagerEdit = healthLabelManagerEdit;
        this.healthLabelManagerRecyclerView = healthLabelManagerRecyclerView;
        this.healthLabelManagerTitle = healthLabelManagerTitle;
        this.layoutHealthLabelManager = layoutHealthLabelManager;
        this.view1 = view1;
    }

    @NonNull
    public static ActivityHealthLabelManagerBinding bind(@NonNull View rootView) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
        int i = R.id.health_label_manager_add_layout;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
        if (constraintLayout2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.health_label_manager_add_view))) != null) {
            i = R.id.health_label_manager_back;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, i);
            if (appCompatImageView != null) {
                i = R.id.health_label_manager_cancel;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
                if (appCompatTextView != null) {
                    i = R.id.health_label_manager_done;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
                    if (appCompatTextView2 != null) {
                        i = R.id.health_label_manager_edit;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
                        if (appCompatTextView3 != null) {
                            i = R.id.health_label_manager_recycler_view;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, i);
                            if (recyclerView != null) {
                                i = R.id.health_label_manager_title;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
                                if (appCompatTextView4 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, (i = R.id.layout_health_label_manager))) != null) {
                                    LayoutLabelManagerShowModeBinding layoutLabelManagerShowModeBindingBind = LayoutLabelManagerShowModeBinding.bind(viewFindChildViewById2);
                                    i = R.id.view1;
                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, i);
                                    if (viewFindChildViewById3 != null) {
                                        return new ActivityHealthLabelManagerBinding(constraintLayout, constraintLayout, constraintLayout2, viewFindChildViewById, appCompatImageView, appCompatTextView, appCompatTextView2, appCompatTextView3, recyclerView, appCompatTextView4, layoutLabelManagerShowModeBindingBind, viewFindChildViewById3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityHealthLabelManagerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityHealthLabelManagerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_health_label_manager, parent, false);
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
