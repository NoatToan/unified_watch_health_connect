package com.huami.pai.lib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.pai.lib.R;
import com.huami.pai.view.PaiDayHeartRateView;

/* JADX INFO: loaded from: classes12.dex */
public final class FragmentDayHeartRateBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final RelativeLayout paiHrParent;

    @NonNull
    public final TextView paiHreatTitleDay;

    @NonNull
    public final TextView paiHreatTitleDayValue;

    @NonNull
    public final PaiDayHeartRateView pvHeartRateChart;

    @NonNull
    public final TextView tvHighPaiValue;

    @NonNull
    public final TextView tvLowPaiValue;

    @NonNull
    public final TextView tvMiddlePaiValue;

    private FragmentDayHeartRateBinding(@NonNull RelativeLayout rootView, @NonNull RelativeLayout paiHrParent, @NonNull TextView paiHreatTitleDay, @NonNull TextView paiHreatTitleDayValue, @NonNull PaiDayHeartRateView pvHeartRateChart, @NonNull TextView tvHighPaiValue, @NonNull TextView tvLowPaiValue, @NonNull TextView tvMiddlePaiValue) {
        this.a = rootView;
        this.paiHrParent = paiHrParent;
        this.paiHreatTitleDay = paiHreatTitleDay;
        this.paiHreatTitleDayValue = paiHreatTitleDayValue;
        this.pvHeartRateChart = pvHeartRateChart;
        this.tvHighPaiValue = tvHighPaiValue;
        this.tvLowPaiValue = tvLowPaiValue;
        this.tvMiddlePaiValue = tvMiddlePaiValue;
    }

    @NonNull
    public static FragmentDayHeartRateBinding bind(@NonNull View rootView) {
        RelativeLayout relativeLayout = (RelativeLayout) rootView;
        int i = R.id.pai_hreat_title_day;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.pai_hreat_title_day_value;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = R.id.pv_heart_rate_chart;
                PaiDayHeartRateView paiDayHeartRateView = (PaiDayHeartRateView) ViewBindings.findChildViewById(rootView, i);
                if (paiDayHeartRateView != null) {
                    i = R.id.tv_high_pai_value;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView3 != null) {
                        i = R.id.tv_low_pai_value;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView4 != null) {
                            i = R.id.tv_middle_pai_value;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView5 != null) {
                                return new FragmentDayHeartRateBinding(relativeLayout, relativeLayout, textView, textView2, paiDayHeartRateView, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentDayHeartRateBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentDayHeartRateBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_day_heart_rate, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
