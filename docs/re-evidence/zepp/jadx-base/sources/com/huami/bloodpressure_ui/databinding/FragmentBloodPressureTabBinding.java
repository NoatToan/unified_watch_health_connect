package com.huami.bloodpressure_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.bloodpressure_ui.R;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentBloodPressureTabBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final RadioButton tabDay;

    @NonNull
    public final RadioGroup tabGroup;

    @NonNull
    public final RadioButton tabMonth;

    @NonNull
    public final RadioButton tabWeek;

    @NonNull
    public final RadioButton tabYear;

    private FragmentBloodPressureTabBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RadioButton radioButton, @NonNull RadioGroup radioGroup, @NonNull RadioButton radioButton2, @NonNull RadioButton radioButton3, @NonNull RadioButton radioButton4) {
        this.a = constraintLayout;
        this.tabDay = radioButton;
        this.tabGroup = radioGroup;
        this.tabMonth = radioButton2;
        this.tabWeek = radioButton3;
        this.tabYear = radioButton4;
    }

    @NonNull
    public static FragmentBloodPressureTabBinding bind(@NonNull View view) {
        int i = R.id.tab_day;
        RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i);
        if (radioButton != null) {
            i = R.id.tab_group;
            RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
            if (radioGroup != null) {
                i = R.id.tab_month;
                RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i);
                if (radioButton2 != null) {
                    i = R.id.tab_week;
                    RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, i);
                    if (radioButton3 != null) {
                        i = R.id.tab_year;
                        RadioButton radioButton4 = (RadioButton) ViewBindings.findChildViewById(view, i);
                        if (radioButton4 != null) {
                            return new FragmentBloodPressureTabBinding((ConstraintLayout) view, radioButton, radioGroup, radioButton2, radioButton3, radioButton4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentBloodPressureTabBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentBloodPressureTabBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_blood_pressure_tab, viewGroup, false);
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
