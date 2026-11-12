package com.huami.bloodpressure_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import com.huami.bloodpressure_ui.R;
import com.huami.lib.rainbow.widget.SwitchCompat;

/* JADX INFO: loaded from: classes6.dex */
public final class ChartIntroFragmentBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ConstraintLayout containerChartInfoShort;

    @NonNull
    public final FlexboxLayout flexChartIntro;

    @NonNull
    public final SwitchCompat switchAvgLine;

    @NonNull
    public final TextView tvAvgLine;

    @NonNull
    public final TextView tvInfoShortItem;

    @NonNull
    public final TextView tvInfoShortItem2;

    private ChartIntroFragmentBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull FlexboxLayout flexboxLayout, @NonNull SwitchCompat switchCompat, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.a = constraintLayout;
        this.containerChartInfoShort = constraintLayout2;
        this.flexChartIntro = flexboxLayout;
        this.switchAvgLine = switchCompat;
        this.tvAvgLine = textView;
        this.tvInfoShortItem = textView2;
        this.tvInfoShortItem2 = textView3;
    }

    @NonNull
    public static ChartIntroFragmentBinding bind(@NonNull View view) {
        int i = R.id.container_chart_info_short;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.flex_chart_intro;
            FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i);
            if (flexboxLayout != null) {
                i = R.id.switch_avg_line;
                SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(view, i);
                if (switchCompat != null) {
                    i = R.id.tv_avg_line;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.tv_info_short_item;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.tv_info_short_item2;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                return new ChartIntroFragmentBinding((ConstraintLayout) view, constraintLayout, flexboxLayout, switchCompat, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ChartIntroFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ChartIntroFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.chart_intro_fragment, viewGroup, false);
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
