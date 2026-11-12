package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ViewStubVibrationBinding implements ViewBinding {

    @NonNull
    private final RadioGroup a;

    @NonNull
    public final RadioGroup soundStrengthRadioGroup;

    @NonNull
    public final RadioButton soundStrengthStandard;

    private ViewStubVibrationBinding(@NonNull RadioGroup radioGroup, @NonNull RadioGroup radioGroup2, @NonNull RadioButton radioButton) {
        this.a = radioGroup;
        this.soundStrengthRadioGroup = radioGroup2;
        this.soundStrengthStandard = radioButton;
    }

    @NonNull
    public static ViewStubVibrationBinding bind(@NonNull View view) {
        RadioGroup radioGroup = (RadioGroup) view;
        int i = R.id.sound_strength_standard;
        RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i);
        if (radioButton != null) {
            return new ViewStubVibrationBinding(radioGroup, radioGroup, radioButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ViewStubVibrationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewStubVibrationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_stub_vibration, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RadioGroup getRoot() {
        return this.a;
    }
}
