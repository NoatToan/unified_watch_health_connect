package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.view.weightfigure.WeightFigureView;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentBalanceRankBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final WeightFigureView balanceFigureView;

    @NonNull
    public final TextView txScoreLevel;

    private FragmentBalanceRankBinding(@NonNull LinearLayout linearLayout, @NonNull WeightFigureView weightFigureView, @NonNull TextView textView) {
        this.a = linearLayout;
        this.balanceFigureView = weightFigureView;
        this.txScoreLevel = textView;
    }

    @NonNull
    public static FragmentBalanceRankBinding bind(@NonNull View view) {
        int i = R.id.balance_figure_view;
        WeightFigureView weightFigureView = (WeightFigureView) ViewBindings.findChildViewById(view, i);
        if (weightFigureView != null) {
            i = R.id.tx_score_level;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new FragmentBalanceRankBinding((LinearLayout) view, weightFigureView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentBalanceRankBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentBalanceRankBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_balance_rank, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
