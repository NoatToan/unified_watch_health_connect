package com.huami.bloodpressure_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.bloodpressure_ui.R;
import com.huami.lib.rainbow.widget.SwitchCompat;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentChartIntroLongBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final Barrier barrierLong;

    @NonNull
    public final ConstraintLayout containerChartInfoLong;

    @NonNull
    public final Guideline guidelineInfoLong;

    @NonNull
    public final ImageView ivInfoLongItem;

    @NonNull
    public final ImageView ivInfoLongItem2;

    @NonNull
    public final SwitchCompat switchAvgLineLong;

    @NonNull
    public final TextView tvAvgLineLong;

    @NonNull
    public final TextView tvInfoLongItem1;

    @NonNull
    public final TextView tvInfoLongItem2;

    private FragmentChartIntroLongBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull ConstraintLayout constraintLayout2, @NonNull Guideline guideline, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull SwitchCompat switchCompat, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.a = constraintLayout;
        this.barrierLong = barrier;
        this.containerChartInfoLong = constraintLayout2;
        this.guidelineInfoLong = guideline;
        this.ivInfoLongItem = imageView;
        this.ivInfoLongItem2 = imageView2;
        this.switchAvgLineLong = switchCompat;
        this.tvAvgLineLong = textView;
        this.tvInfoLongItem1 = textView2;
        this.tvInfoLongItem2 = textView3;
    }

    @NonNull
    public static FragmentChartIntroLongBinding bind(@NonNull View view) {
        int i = R.id.barrier_long;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = R.id.container_chart_info_long;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.guideline_info_long;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline != null) {
                    i = R.id.iv_info_long_item;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.iv_info_long_item2;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.switch_avg_line_long;
                            SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(view, i);
                            if (switchCompat != null) {
                                i = R.id.tv_avg_line_long;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = R.id.tv_info_long_item1;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = R.id.tv_info_long_item2;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            return new FragmentChartIntroLongBinding((ConstraintLayout) view, barrier, constraintLayout, guideline, imageView, imageView2, switchCompat, textView, textView2, textView3);
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
    public static FragmentChartIntroLongBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentChartIntroLongBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_chart_intro_long, viewGroup, false);
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
