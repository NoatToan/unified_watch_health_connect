package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.running.calori.view.CalorieListTile;

/* JADX INFO: loaded from: classes20.dex */
public final class FooterSportEnergyViewBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final View cardStatusDividingLine;

    @NonNull
    public final CalorieListTile ltRestCal;

    @NonNull
    public final View restCalLine;

    @NonNull
    public final ConstraintLayout rootRestCal;

    @NonNull
    public final TextView sportEnergyTitle;

    private FooterSportEnergyViewBinding(@NonNull ConstraintLayout rootView, @NonNull View cardStatusDividingLine, @NonNull CalorieListTile ltRestCal, @NonNull View restCalLine, @NonNull ConstraintLayout rootRestCal, @NonNull TextView sportEnergyTitle) {
        this.a = rootView;
        this.cardStatusDividingLine = cardStatusDividingLine;
        this.ltRestCal = ltRestCal;
        this.restCalLine = restCalLine;
        this.rootRestCal = rootRestCal;
        this.sportEnergyTitle = sportEnergyTitle;
    }

    @NonNull
    public static FooterSportEnergyViewBinding bind(@NonNull View rootView) {
        int i = R.id.card_status_dividing_line;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.card_status_dividing_line);
        if (viewFindChildViewById != null) {
            i = R.id.lt_rest_cal;
            CalorieListTile calorieListTile = (CalorieListTile) ViewBindings.findChildViewById(rootView, R.id.lt_rest_cal);
            if (calorieListTile != null) {
                i = R.id.rest_cal_line;
                View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.rest_cal_line);
                if (viewFindChildViewById2 != null) {
                    i = R.id.root_rest_cal;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.root_rest_cal);
                    if (constraintLayout != null) {
                        i = R.id.sport_energy_title;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.sport_energy_title);
                        if (textView != null) {
                            return new FooterSportEnergyViewBinding((ConstraintLayout) rootView, viewFindChildViewById, calorieListTile, viewFindChildViewById2, constraintLayout, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FooterSportEnergyViewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FooterSportEnergyViewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.footer_sport_energy_view, parent, false);
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
