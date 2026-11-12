package com.xiaomi.hm.health.databinding;

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
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class LayoutDetailDateTabSelectorBinding implements ViewBinding {

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

    private LayoutDetailDateTabSelectorBinding(@NonNull ConstraintLayout rootView, @NonNull RadioButton tabDay, @NonNull RadioGroup tabGroup, @NonNull RadioButton tabMonth, @NonNull RadioButton tabWeek, @NonNull RadioButton tabYear) {
        this.a = rootView;
        this.tabDay = tabDay;
        this.tabGroup = tabGroup;
        this.tabMonth = tabMonth;
        this.tabWeek = tabWeek;
        this.tabYear = tabYear;
    }

    @NonNull
    public static LayoutDetailDateTabSelectorBinding bind(@NonNull View rootView) {
        int i = R.id.tab_day;
        RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(rootView, R.id.tab_day);
        if (radioButton != null) {
            i = R.id.tab_group;
            RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(rootView, R.id.tab_group);
            if (radioGroup != null) {
                i = R.id.tab_month;
                RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(rootView, R.id.tab_month);
                if (radioButton2 != null) {
                    i = R.id.tab_week;
                    RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(rootView, R.id.tab_week);
                    if (radioButton3 != null) {
                        i = R.id.tab_year;
                        RadioButton radioButton4 = (RadioButton) ViewBindings.findChildViewById(rootView, R.id.tab_year);
                        if (radioButton4 != null) {
                            return new LayoutDetailDateTabSelectorBinding((ConstraintLayout) rootView, radioButton, radioGroup, radioButton2, radioButton3, radioButton4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutDetailDateTabSelectorBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutDetailDateTabSelectorBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_detail_date_tab_selector, parent, false);
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
