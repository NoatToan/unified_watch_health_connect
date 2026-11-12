package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;

/* JADX INFO: loaded from: classes13.dex */
public final class LayoutRadioGroupBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final RadioGroup sleepTabGroup;

    @NonNull
    public final RadioButton tabDay;

    @NonNull
    public final RadioButton tabMonth;

    @NonNull
    public final RadioButton tabWeek;

    @NonNull
    public final RadioButton tabYear;

    private LayoutRadioGroupBinding(@NonNull LinearLayout rootView, @NonNull RadioGroup sleepTabGroup, @NonNull RadioButton tabDay, @NonNull RadioButton tabMonth, @NonNull RadioButton tabWeek, @NonNull RadioButton tabYear) {
        this.a = rootView;
        this.sleepTabGroup = sleepTabGroup;
        this.tabDay = tabDay;
        this.tabMonth = tabMonth;
        this.tabWeek = tabWeek;
        this.tabYear = tabYear;
    }

    @NonNull
    public static LayoutRadioGroupBinding bind(@NonNull View rootView) {
        int i = R.id.sleepTabGroup;
        RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(rootView, i);
        if (radioGroup != null) {
            i = R.id.tabDay;
            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(rootView, i);
            if (radioButton != null) {
                i = R.id.tabMonth;
                RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(rootView, i);
                if (radioButton2 != null) {
                    i = R.id.tabWeek;
                    RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(rootView, i);
                    if (radioButton3 != null) {
                        i = R.id.tabYear;
                        RadioButton radioButton4 = (RadioButton) ViewBindings.findChildViewById(rootView, i);
                        if (radioButton4 != null) {
                            return new LayoutRadioGroupBinding((LinearLayout) rootView, radioGroup, radioButton, radioButton2, radioButton3, radioButton4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutRadioGroupBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutRadioGroupBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_radio_group, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
