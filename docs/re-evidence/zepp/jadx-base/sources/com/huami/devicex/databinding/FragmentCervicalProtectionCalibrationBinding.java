package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentCervicalProtectionCalibrationBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final Button cervicalProtectionCalibrationBtn;

    @NonNull
    public final BindHeadsetSearchHintBinding cervicalProtectionCalibrationIng;

    @NonNull
    public final TextView cervicalProtectionHint;

    @NonNull
    public final ImageView cervicalProtectionImg;

    @NonNull
    public final TextView title;

    private FragmentCervicalProtectionCalibrationBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull BindHeadsetSearchHintBinding bindHeadsetSearchHintBinding, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2) {
        this.a = constraintLayout;
        this.cervicalProtectionCalibrationBtn = button;
        this.cervicalProtectionCalibrationIng = bindHeadsetSearchHintBinding;
        this.cervicalProtectionHint = textView;
        this.cervicalProtectionImg = imageView;
        this.title = textView2;
    }

    @NonNull
    public static FragmentCervicalProtectionCalibrationBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.cervical_protection_calibration_btn;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.cervical_protection_calibration_ing))) != null) {
            BindHeadsetSearchHintBinding bindHeadsetSearchHintBindingBind = BindHeadsetSearchHintBinding.bind(viewFindChildViewById);
            i = R.id.cervical_protection_hint;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.cervical_protection_img;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new FragmentCervicalProtectionCalibrationBinding((ConstraintLayout) view, button, bindHeadsetSearchHintBindingBind, textView, imageView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentCervicalProtectionCalibrationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentCervicalProtectionCalibrationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_cervical_protection_calibration, viewGroup, false);
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
