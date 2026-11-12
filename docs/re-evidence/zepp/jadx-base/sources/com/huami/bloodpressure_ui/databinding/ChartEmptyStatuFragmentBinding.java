package com.huami.bloodpressure_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.bloodpressure_ui.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ChartEmptyStatuFragmentBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final Barrier barrier;

    @NonNull
    public final ConstraintLayout containerData;

    @NonNull
    public final AppCompatImageView ivResearchDetail;

    @NonNull
    public final Guideline lineMid;

    @NonNull
    public final AppCompatTextView tvDbp;

    @NonNull
    public final AppCompatTextView tvDbpUnit;

    @NonNull
    public final AppCompatTextView tvDbpValue;

    @NonNull
    public final AppCompatTextView tvSbp;

    @NonNull
    public final AppCompatTextView tvSbpUnit;

    @NonNull
    public final AppCompatTextView tvSbpValue;

    @NonNull
    public final AppCompatTextView tvStatusDetail;

    @NonNull
    public final AppCompatTextView tvStatusTime;

    private ChartEmptyStatuFragmentBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull Guideline guideline, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatTextView appCompatTextView4, @NonNull AppCompatTextView appCompatTextView5, @NonNull AppCompatTextView appCompatTextView6, @NonNull AppCompatTextView appCompatTextView7, @NonNull AppCompatTextView appCompatTextView8) {
        this.a = constraintLayout;
        this.barrier = barrier;
        this.containerData = constraintLayout2;
        this.ivResearchDetail = appCompatImageView;
        this.lineMid = guideline;
        this.tvDbp = appCompatTextView;
        this.tvDbpUnit = appCompatTextView2;
        this.tvDbpValue = appCompatTextView3;
        this.tvSbp = appCompatTextView4;
        this.tvSbpUnit = appCompatTextView5;
        this.tvSbpValue = appCompatTextView6;
        this.tvStatusDetail = appCompatTextView7;
        this.tvStatusTime = appCompatTextView8;
    }

    @NonNull
    public static ChartEmptyStatuFragmentBinding bind(@NonNull View view) {
        int i = R.id.barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = R.id.container_data;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.iv_research_detail;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = R.id.line_mid;
                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                    if (guideline != null) {
                        i = R.id.tv_dbp;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView != null) {
                            i = R.id.tv_dbp_unit;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView2 != null) {
                                i = R.id.tv_dbp_value;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView3 != null) {
                                    i = R.id.tv_sbp;
                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView4 != null) {
                                        i = R.id.tv_sbp_unit;
                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView5 != null) {
                                            i = R.id.tv_sbp_value;
                                            AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView6 != null) {
                                                i = R.id.tv_status_detail;
                                                AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView7 != null) {
                                                    i = R.id.tv_status_time;
                                                    AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatTextView8 != null) {
                                                        return new ChartEmptyStatuFragmentBinding((ConstraintLayout) view, barrier, constraintLayout, appCompatImageView, guideline, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ChartEmptyStatuFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ChartEmptyStatuFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.chart_empty_statu_fragment, viewGroup, false);
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
