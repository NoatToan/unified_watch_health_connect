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
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.wheelview.WheelView;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentPersonInfoSettingWeightBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final WheelView settingWeightDecimalWheel;

    @NonNull
    public final WheelView settingWeightIntWheel;

    @NonNull
    public final TextView weightBtnCancel;

    @NonNull
    public final TextView weightBtnSave;

    private FragmentPersonInfoSettingWeightBinding(@NonNull LinearLayout rootView, @NonNull WheelView settingWeightDecimalWheel, @NonNull WheelView settingWeightIntWheel, @NonNull TextView weightBtnCancel, @NonNull TextView weightBtnSave) {
        this.a = rootView;
        this.settingWeightDecimalWheel = settingWeightDecimalWheel;
        this.settingWeightIntWheel = settingWeightIntWheel;
        this.weightBtnCancel = weightBtnCancel;
        this.weightBtnSave = weightBtnSave;
    }

    @NonNull
    public static FragmentPersonInfoSettingWeightBinding bind(@NonNull View rootView) {
        int i = R.id.setting_weight_decimal_wheel;
        WheelView wheelView = (WheelView) ViewBindings.findChildViewById(rootView, R.id.setting_weight_decimal_wheel);
        if (wheelView != null) {
            i = R.id.setting_weight_int_wheel;
            WheelView wheelView2 = (WheelView) ViewBindings.findChildViewById(rootView, R.id.setting_weight_int_wheel);
            if (wheelView2 != null) {
                i = R.id.weight_btn_cancel;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.weight_btn_cancel);
                if (textView != null) {
                    i = R.id.weight_btn_save;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weight_btn_save);
                    if (textView2 != null) {
                        return new FragmentPersonInfoSettingWeightBinding((LinearLayout) rootView, wheelView, wheelView2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentPersonInfoSettingWeightBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentPersonInfoSettingWeightBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_person_info_setting_weight, parent, false);
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
