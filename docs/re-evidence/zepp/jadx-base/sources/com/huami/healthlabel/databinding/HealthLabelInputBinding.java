package com.huami.healthlabel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.healthlabel.R;
import com.huami.healthlabel.ui.custom.InputSelectView;
import com.huami.healthlabel.ui.custom.KeyEditView;

/* JADX INFO: loaded from: classes9.dex */
public final class HealthLabelInputBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final InputSelectView healthLabelColorRg;

    @NonNull
    public final KeyEditView healthLabelInputEdit;

    @NonNull
    public final ConstraintLayout healthLabelItem;

    @NonNull
    public final TextView healthLabelLimitTipsTv;

    @NonNull
    public final TextView healthLabelSelectColorTv;

    private HealthLabelInputBinding(@NonNull LinearLayout rootView, @NonNull InputSelectView healthLabelColorRg, @NonNull KeyEditView healthLabelInputEdit, @NonNull ConstraintLayout healthLabelItem, @NonNull TextView healthLabelLimitTipsTv, @NonNull TextView healthLabelSelectColorTv) {
        this.a = rootView;
        this.healthLabelColorRg = healthLabelColorRg;
        this.healthLabelInputEdit = healthLabelInputEdit;
        this.healthLabelItem = healthLabelItem;
        this.healthLabelLimitTipsTv = healthLabelLimitTipsTv;
        this.healthLabelSelectColorTv = healthLabelSelectColorTv;
    }

    @NonNull
    public static HealthLabelInputBinding bind(@NonNull View rootView) {
        int i = R.id.health_label_color_rg;
        InputSelectView inputSelectView = (InputSelectView) ViewBindings.findChildViewById(rootView, i);
        if (inputSelectView != null) {
            i = R.id.health_label_input_edit;
            KeyEditView keyEditView = (KeyEditView) ViewBindings.findChildViewById(rootView, i);
            if (keyEditView != null) {
                i = R.id.health_label_item;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                if (constraintLayout != null) {
                    i = R.id.health_label_limit_tips_tv;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView != null) {
                        i = R.id.health_label_select_color_tv;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            return new HealthLabelInputBinding((LinearLayout) rootView, inputSelectView, keyEditView, constraintLayout, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HealthLabelInputBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HealthLabelInputBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.health_label_input, parent, false);
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
