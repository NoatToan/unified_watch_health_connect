package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.R;
import com.huami.widget.wheelview.WheelView;

/* JADX INFO: loaded from: classes11.dex */
public final class FragmentSegmentSettingWeightBinding implements ViewBinding {

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

    private FragmentSegmentSettingWeightBinding(@NonNull LinearLayout linearLayout, @NonNull WheelView wheelView, @NonNull WheelView wheelView2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.a = linearLayout;
        this.settingWeightDecimalWheel = wheelView;
        this.settingWeightIntWheel = wheelView2;
        this.weightBtnCancel = textView;
        this.weightBtnSave = textView2;
    }

    @NonNull
    public static FragmentSegmentSettingWeightBinding bind(@NonNull View view) {
        int i = R.id.setting_weight_decimal_wheel;
        WheelView wheelView = (WheelView) ViewBindings.findChildViewById(view, i);
        if (wheelView != null) {
            i = R.id.setting_weight_int_wheel;
            WheelView wheelView2 = (WheelView) ViewBindings.findChildViewById(view, i);
            if (wheelView2 != null) {
                i = R.id.weight_btn_cancel;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.weight_btn_save;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new FragmentSegmentSettingWeightBinding((LinearLayout) view, wheelView, wheelView2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSegmentSettingWeightBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSegmentSettingWeightBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_segment_setting_weight, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
