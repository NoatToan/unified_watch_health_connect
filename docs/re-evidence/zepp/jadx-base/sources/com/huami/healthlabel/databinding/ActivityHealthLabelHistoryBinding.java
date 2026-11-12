package com.huami.healthlabel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
public final class ActivityHealthLabelHistoryBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatImageView healthLabelHistoryBack;

    @NonNull
    public final AppCompatTextView healthLabelHistoryDate;

    @NonNull
    public final AppCompatImageView healthLabelHistoryDateImage;

    @NonNull
    public final ConstraintLayout healthLabelHistoryDateLayout;

    @NonNull
    public final ImageView healthLabelHistoryDeleteIv;

    @NonNull
    public final LinearLayout healthLabelHistoryDeleteLl;

    @NonNull
    public final RecyclerView healthLabelHistoryRecyclerView;

    @NonNull
    public final AppCompatImageView healthLabelHistoryRing;

    @NonNull
    public final AppCompatTextView healthLabelHistoryTitle;

    @NonNull
    public final AppCompatTextView healthLabelHistoryYear;

    @NonNull
    public final View view3;

    private ActivityHealthLabelHistoryBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatImageView healthLabelHistoryBack, @NonNull AppCompatTextView healthLabelHistoryDate, @NonNull AppCompatImageView healthLabelHistoryDateImage, @NonNull ConstraintLayout healthLabelHistoryDateLayout, @NonNull ImageView healthLabelHistoryDeleteIv, @NonNull LinearLayout healthLabelHistoryDeleteLl, @NonNull RecyclerView healthLabelHistoryRecyclerView, @NonNull AppCompatImageView healthLabelHistoryRing, @NonNull AppCompatTextView healthLabelHistoryTitle, @NonNull AppCompatTextView healthLabelHistoryYear, @NonNull View view3) {
        this.a = rootView;
        this.healthLabelHistoryBack = healthLabelHistoryBack;
        this.healthLabelHistoryDate = healthLabelHistoryDate;
        this.healthLabelHistoryDateImage = healthLabelHistoryDateImage;
        this.healthLabelHistoryDateLayout = healthLabelHistoryDateLayout;
        this.healthLabelHistoryDeleteIv = healthLabelHistoryDeleteIv;
        this.healthLabelHistoryDeleteLl = healthLabelHistoryDeleteLl;
        this.healthLabelHistoryRecyclerView = healthLabelHistoryRecyclerView;
        this.healthLabelHistoryRing = healthLabelHistoryRing;
        this.healthLabelHistoryTitle = healthLabelHistoryTitle;
        this.healthLabelHistoryYear = healthLabelHistoryYear;
        this.view3 = view3;
    }

    @NonNull
    public static ActivityHealthLabelHistoryBinding bind(@NonNull View rootView) {
        View viewFindChildViewById;
        int i = R.id.health_label_history_back;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, i);
        if (appCompatImageView != null) {
            i = R.id.health_label_history_date;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
            if (appCompatTextView != null) {
                i = R.id.health_label_history_date_image;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, i);
                if (appCompatImageView2 != null) {
                    i = R.id.health_label_history_date_layout;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                    if (constraintLayout != null) {
                        i = R.id.health_label_history_delete_iv;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
                        if (imageView != null) {
                            i = R.id.health_label_history_delete_ll;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                            if (linearLayout != null) {
                                i = R.id.health_label_history_recycler_view;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, i);
                                if (recyclerView != null) {
                                    i = R.id.health_label_history_ring;
                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, i);
                                    if (appCompatImageView3 != null) {
                                        i = R.id.health_label_history_title;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
                                        if (appCompatTextView2 != null) {
                                            i = R.id.health_label_history_year;
                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
                                            if (appCompatTextView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.view_3))) != null) {
                                                return new ActivityHealthLabelHistoryBinding((ConstraintLayout) rootView, appCompatImageView, appCompatTextView, appCompatImageView2, constraintLayout, imageView, linearLayout, recyclerView, appCompatImageView3, appCompatTextView2, appCompatTextView3, viewFindChildViewById);
                                            }
                                        }
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
    public static ActivityHealthLabelHistoryBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityHealthLabelHistoryBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_health_label_history, parent, false);
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
