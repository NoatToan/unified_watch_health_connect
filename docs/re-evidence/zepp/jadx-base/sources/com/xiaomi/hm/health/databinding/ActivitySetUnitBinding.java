package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.android.design.dialog.choice.ChoiceView;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivitySetUnitBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ChoiceView lengthUnit;

    @NonNull
    public final TextView temperatureTitle;

    @NonNull
    public final ChoiceView temperatureUnit;

    @NonNull
    public final TextView unitTip;

    @NonNull
    public final TextView weightTitle;

    @NonNull
    public final ChoiceView weightUnit;

    private ActivitySetUnitBinding(@NonNull LinearLayout rootView, @NonNull ChoiceView lengthUnit, @NonNull TextView temperatureTitle, @NonNull ChoiceView temperatureUnit, @NonNull TextView unitTip, @NonNull TextView weightTitle, @NonNull ChoiceView weightUnit) {
        this.a = rootView;
        this.lengthUnit = lengthUnit;
        this.temperatureTitle = temperatureTitle;
        this.temperatureUnit = temperatureUnit;
        this.unitTip = unitTip;
        this.weightTitle = weightTitle;
        this.weightUnit = weightUnit;
    }

    @NonNull
    public static ActivitySetUnitBinding bind(@NonNull View rootView) {
        int i = R.id.length_unit;
        ChoiceView choiceView = (ChoiceView) ViewBindings.findChildViewById(rootView, R.id.length_unit);
        if (choiceView != null) {
            i = R.id.temperature_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.temperature_title);
            if (textView != null) {
                i = R.id.temperature_unit;
                ChoiceView choiceView2 = (ChoiceView) ViewBindings.findChildViewById(rootView, R.id.temperature_unit);
                if (choiceView2 != null) {
                    i = R.id.unit_tip;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.unit_tip);
                    if (textView2 != null) {
                        i = R.id.weight_title;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weight_title);
                        if (textView3 != null) {
                            i = R.id.weight_unit;
                            ChoiceView choiceView3 = (ChoiceView) ViewBindings.findChildViewById(rootView, R.id.weight_unit);
                            if (choiceView3 != null) {
                                return new ActivitySetUnitBinding((LinearLayout) rootView, choiceView, textView, choiceView2, textView2, textView3, choiceView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySetUnitBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivitySetUnitBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_set_unit, parent, false);
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
