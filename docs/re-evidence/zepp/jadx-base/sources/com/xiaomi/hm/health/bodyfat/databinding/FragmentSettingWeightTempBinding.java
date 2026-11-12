package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.widget.wheelview.WheelView;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentSettingWeightTempBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final WheelView infoWeightDecimalWheel;

    @NonNull
    public final WheelView infoWeightIntWheel;

    @NonNull
    public final TextView titleTv;

    @NonNull
    public final TextView weightBtnCancel;

    @NonNull
    public final TextView weightBtnSave;

    private FragmentSettingWeightTempBinding(@NonNull LinearLayout linearLayout, @NonNull WheelView wheelView, @NonNull WheelView wheelView2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.a = linearLayout;
        this.infoWeightDecimalWheel = wheelView;
        this.infoWeightIntWheel = wheelView2;
        this.titleTv = textView;
        this.weightBtnCancel = textView2;
        this.weightBtnSave = textView3;
    }

    @NonNull
    public static FragmentSettingWeightTempBinding bind(@NonNull View view) {
        int i = R.id.info_weight_decimal_wheel;
        WheelView wheelView = (WheelView) ViewBindings.findChildViewById(view, i);
        if (wheelView != null) {
            i = R.id.info_weight_int_wheel;
            WheelView wheelView2 = (WheelView) ViewBindings.findChildViewById(view, i);
            if (wheelView2 != null) {
                i = R.id.titleTv;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.weight_btn_cancel;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.weight_btn_save;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            return new FragmentSettingWeightTempBinding((LinearLayout) view, wheelView, wheelView2, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSettingWeightTempBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSettingWeightTempBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_setting_weight_temp, viewGroup, false);
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
