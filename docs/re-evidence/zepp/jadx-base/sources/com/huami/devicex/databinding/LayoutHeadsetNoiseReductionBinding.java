package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;

/* JADX INFO: loaded from: classes7.dex */
public final class LayoutHeadsetNoiseReductionBinding implements ViewBinding {

    @NonNull
    private final CardView a;

    @NonNull
    public final ConstraintLayout constraintNoiseControl;

    @NonNull
    public final View divider;

    @NonNull
    public final TextView itemHeadsetSettingsNoiseControlTitle;

    @NonNull
    public final ListTile itemHeadsetSettingsNoiseReduction;

    @NonNull
    public final RadioButton noiseControlClose;

    @NonNull
    public final RadioButton noiseControlPenetrate;

    @NonNull
    public final RadioButton noiseControlReduction;

    @NonNull
    public final RadioGroup noiseControlType;

    @NonNull
    public final Group noiseReductionGroup;

    @NonNull
    public final CardView viewgroupHeadsetNoise;

    private LayoutHeadsetNoiseReductionBinding(@NonNull CardView cardView, @NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull TextView textView, @NonNull ListTile listTile, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull RadioButton radioButton3, @NonNull RadioGroup radioGroup, @NonNull Group group, @NonNull CardView cardView2) {
        this.a = cardView;
        this.constraintNoiseControl = constraintLayout;
        this.divider = view;
        this.itemHeadsetSettingsNoiseControlTitle = textView;
        this.itemHeadsetSettingsNoiseReduction = listTile;
        this.noiseControlClose = radioButton;
        this.noiseControlPenetrate = radioButton2;
        this.noiseControlReduction = radioButton3;
        this.noiseControlType = radioGroup;
        this.noiseReductionGroup = group;
        this.viewgroupHeadsetNoise = cardView2;
    }

    @NonNull
    public static LayoutHeadsetNoiseReductionBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.constraint_noise_control;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.divider))) != null) {
            i = R.id.item_headset_settings_noise_control_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.item_headset_settings_noise_reduction;
                ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
                if (listTile != null) {
                    i = R.id.noise_control_close;
                    RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i);
                    if (radioButton != null) {
                        i = R.id.noise_control_penetrate;
                        RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i);
                        if (radioButton2 != null) {
                            i = R.id.noise_control_reduction;
                            RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, i);
                            if (radioButton3 != null) {
                                i = R.id.noise_control_type;
                                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                                if (radioGroup != null) {
                                    i = R.id.noise_reduction_group;
                                    Group group = (Group) ViewBindings.findChildViewById(view, i);
                                    if (group != null) {
                                        CardView cardView = (CardView) view;
                                        return new LayoutHeadsetNoiseReductionBinding(cardView, constraintLayout, viewFindChildViewById, textView, listTile, radioButton, radioButton2, radioButton3, radioGroup, group, cardView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutHeadsetNoiseReductionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutHeadsetNoiseReductionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_headset_noise_reduction, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.a;
    }
}
