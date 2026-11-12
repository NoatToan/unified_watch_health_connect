package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.widget.typeface.TypefaceTextView;
import com.huami.widget.wheelview.WheelView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivitySetAlarmNewBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final LinearLayout alarmTime;

    @NonNull
    public final WheelView ampmWheel;

    @NonNull
    public final WheelView hourWheel;

    @NonNull
    public final ConstraintLayout lazyModeLayout;

    @NonNull
    public final SwitchCompat lazyModeSwitch;

    @NonNull
    public final WheelView minWheel;

    @NonNull
    public final RainbowTitleBar rainbowTitleBar;

    @NonNull
    public final ConstraintLayout repeatModeLayout;

    @NonNull
    public final ConstraintLayout smartModeLayout;

    @NonNull
    public final SwitchCompat smartModeSwitch;

    @NonNull
    public final TextView tvLazyModeDesc;

    @NonNull
    public final TypefaceTextView tvLazyModeTitle;

    @NonNull
    public final TextView tvRepeatModeContent;

    @NonNull
    public final TypefaceTextView tvRepeatModeTitle;

    @NonNull
    public final TextView tvSmartModeDesc;

    @NonNull
    public final TypefaceTextView tvSmartModeTitle;

    private ActivitySetAlarmNewBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull WheelView wheelView, @NonNull WheelView wheelView2, @NonNull ConstraintLayout constraintLayout, @NonNull SwitchCompat switchCompat, @NonNull WheelView wheelView3, @NonNull RainbowTitleBar rainbowTitleBar, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull SwitchCompat switchCompat2, @NonNull TextView textView, @NonNull TypefaceTextView typefaceTextView, @NonNull TextView textView2, @NonNull TypefaceTextView typefaceTextView2, @NonNull TextView textView3, @NonNull TypefaceTextView typefaceTextView3) {
        this.a = linearLayout;
        this.alarmTime = linearLayout2;
        this.ampmWheel = wheelView;
        this.hourWheel = wheelView2;
        this.lazyModeLayout = constraintLayout;
        this.lazyModeSwitch = switchCompat;
        this.minWheel = wheelView3;
        this.rainbowTitleBar = rainbowTitleBar;
        this.repeatModeLayout = constraintLayout2;
        this.smartModeLayout = constraintLayout3;
        this.smartModeSwitch = switchCompat2;
        this.tvLazyModeDesc = textView;
        this.tvLazyModeTitle = typefaceTextView;
        this.tvRepeatModeContent = textView2;
        this.tvRepeatModeTitle = typefaceTextView2;
        this.tvSmartModeDesc = textView3;
        this.tvSmartModeTitle = typefaceTextView3;
    }

    @NonNull
    public static ActivitySetAlarmNewBinding bind(@NonNull View view) {
        int i = R.id.alarm_time;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.ampm_wheel;
            WheelView wheelView = (WheelView) ViewBindings.findChildViewById(view, i);
            if (wheelView != null) {
                i = R.id.hour_wheel;
                WheelView wheelView2 = (WheelView) ViewBindings.findChildViewById(view, i);
                if (wheelView2 != null) {
                    i = R.id.lazy_mode_layout;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = R.id.lazy_mode_switch;
                        SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(view, i);
                        if (switchCompat != null) {
                            i = R.id.min_wheel;
                            WheelView wheelView3 = (WheelView) ViewBindings.findChildViewById(view, i);
                            if (wheelView3 != null) {
                                i = R.id.rainbowTitleBar;
                                RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                                if (rainbowTitleBar != null) {
                                    i = R.id.repeat_mode_layout;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout2 != null) {
                                        i = R.id.smart_mode_layout;
                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout3 != null) {
                                            i = R.id.smart_mode_switch;
                                            SwitchCompat switchCompat2 = (SwitchCompat) ViewBindings.findChildViewById(view, i);
                                            if (switchCompat2 != null) {
                                                i = R.id.tv_lazy_mode_desc;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView != null) {
                                                    i = R.id.tv_lazy_mode_title;
                                                    TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                    if (typefaceTextView != null) {
                                                        i = R.id.tv_repeat_mode_content;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView2 != null) {
                                                            i = R.id.tv_repeat_mode_title;
                                                            TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                            if (typefaceTextView2 != null) {
                                                                i = R.id.tv_smart_mode_desc;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView3 != null) {
                                                                    i = R.id.tv_smart_mode_title;
                                                                    TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (typefaceTextView3 != null) {
                                                                        return new ActivitySetAlarmNewBinding((LinearLayout) view, linearLayout, wheelView, wheelView2, constraintLayout, switchCompat, wheelView3, rainbowTitleBar, constraintLayout2, constraintLayout3, switchCompat2, textView, typefaceTextView, textView2, typefaceTextView2, textView3, typefaceTextView3);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
    public static ActivitySetAlarmNewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySetAlarmNewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_set_alarm_new, viewGroup, false);
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
