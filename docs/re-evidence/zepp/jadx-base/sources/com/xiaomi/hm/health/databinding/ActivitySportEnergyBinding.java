package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivitySportEnergyBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ViewPager sportEnergyContent;

    @NonNull
    public final RadioButton sportEnergyDay;

    @NonNull
    public final View sportEnergyDivide;

    @NonNull
    public final RadioButton sportEnergyMonth;

    @NonNull
    public final RadioGroup sportEnergyRadio;

    @NonNull
    public final RelativeLayout sportEnergyRadioRl;

    @NonNull
    public final RadioButton sportEnergyWeek;

    private ActivitySportEnergyBinding(@NonNull ConstraintLayout rootView, @NonNull ViewPager sportEnergyContent, @NonNull RadioButton sportEnergyDay, @NonNull View sportEnergyDivide, @NonNull RadioButton sportEnergyMonth, @NonNull RadioGroup sportEnergyRadio, @NonNull RelativeLayout sportEnergyRadioRl, @NonNull RadioButton sportEnergyWeek) {
        this.a = rootView;
        this.sportEnergyContent = sportEnergyContent;
        this.sportEnergyDay = sportEnergyDay;
        this.sportEnergyDivide = sportEnergyDivide;
        this.sportEnergyMonth = sportEnergyMonth;
        this.sportEnergyRadio = sportEnergyRadio;
        this.sportEnergyRadioRl = sportEnergyRadioRl;
        this.sportEnergyWeek = sportEnergyWeek;
    }

    @NonNull
    public static ActivitySportEnergyBinding bind(@NonNull View rootView) {
        int i = R.id.sport_energy_content;
        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.sport_energy_content);
        if (viewPager != null) {
            i = R.id.sport_energy_day;
            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(rootView, R.id.sport_energy_day);
            if (radioButton != null) {
                i = R.id.sport_energy_divide;
                View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.sport_energy_divide);
                if (viewFindChildViewById != null) {
                    i = R.id.sport_energy_month;
                    RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(rootView, R.id.sport_energy_month);
                    if (radioButton2 != null) {
                        i = R.id.sport_energy_radio;
                        RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(rootView, R.id.sport_energy_radio);
                        if (radioGroup != null) {
                            i = R.id.sport_energy_radio_rl;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sport_energy_radio_rl);
                            if (relativeLayout != null) {
                                i = R.id.sport_energy_week;
                                RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(rootView, R.id.sport_energy_week);
                                if (radioButton3 != null) {
                                    return new ActivitySportEnergyBinding((ConstraintLayout) rootView, viewPager, radioButton, viewFindChildViewById, radioButton2, radioGroup, relativeLayout, radioButton3);
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
    public static ActivitySportEnergyBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivitySportEnergyBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_sport_energy, parent, false);
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
