package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.widget.wheelview.WheelView;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentEarbudModeSettingBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView settingOneTitle;

    @NonNull
    public final TextView settingTwoTitle;

    @NonNull
    public final TextView startBtn;

    @NonNull
    public final WheelView timeSetOneWheel;

    @NonNull
    public final RelativeLayout timeSetTwo;

    @NonNull
    public final WheelView timeSetTwoWheel;

    private FragmentEarbudModeSettingBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull WheelView wheelView, @NonNull RelativeLayout relativeLayout, @NonNull WheelView wheelView2) {
        this.a = linearLayout;
        this.settingOneTitle = textView;
        this.settingTwoTitle = textView2;
        this.startBtn = textView3;
        this.timeSetOneWheel = wheelView;
        this.timeSetTwo = relativeLayout;
        this.timeSetTwoWheel = wheelView2;
    }

    @NonNull
    public static FragmentEarbudModeSettingBinding bind(@NonNull View view) {
        int i = R.id.setting_one_title;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.setting_two_title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.start_btn;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = R.id.time_set_one_wheel;
                    WheelView wheelView = (WheelView) ViewBindings.findChildViewById(view, i);
                    if (wheelView != null) {
                        i = R.id.time_set_two;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout != null) {
                            i = R.id.time_set_two_wheel;
                            WheelView wheelView2 = (WheelView) ViewBindings.findChildViewById(view, i);
                            if (wheelView2 != null) {
                                return new FragmentEarbudModeSettingBinding((LinearLayout) view, textView, textView2, textView3, wheelView, relativeLayout, wheelView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentEarbudModeSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentEarbudModeSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_earbud_mode_setting, viewGroup, false);
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
