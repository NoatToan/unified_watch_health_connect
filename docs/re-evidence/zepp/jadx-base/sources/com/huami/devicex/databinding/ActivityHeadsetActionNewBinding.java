package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityHeadsetActionNewBinding implements ViewBinding {

    @NonNull
    private final LinearLayoutCompat a;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final Button headsetActionDefaultBt;

    @NonNull
    public final LinearLayout headsetLeftLl;

    @NonNull
    public final ListTile headsetLeftLongPress;

    @NonNull
    public final CheckBox headsetLeftNoiseControlModeClose;

    @NonNull
    public final CheckBox headsetLeftNoiseControlModePenetrate;

    @NonNull
    public final CheckBox headsetLeftNoiseControlModeReduction;

    @NonNull
    public final ListTile headsetLeftShortPress;

    @NonNull
    public final ListTile headsetLeftShortPressThreeTimes;

    @NonNull
    public final ListTile headsetLeftShortPressTwice;

    @NonNull
    public final LinearLayout headsetRightLl;

    @NonNull
    public final ListTile headsetRightLongPress;

    @NonNull
    public final CheckBox headsetRightNoiseControlModeClose;

    @NonNull
    public final CheckBox headsetRightNoiseControlModePenetrate;

    @NonNull
    public final CheckBox headsetRightNoiseControlModeReduction;

    @NonNull
    public final ListTile headsetRightShortPress;

    @NonNull
    public final ListTile headsetRightShortPressThreeTimes;

    @NonNull
    public final ListTile headsetRightShortPressTwice;

    @NonNull
    public final LinearLayout leftEarSetting;

    @NonNull
    public final RainbowTitleBar rainbowTitleBar;

    @NonNull
    public final LinearLayout rightEarSetting;

    @NonNull
    public final FrameLayout tabcontent;

    @NonNull
    public final TabHost tabhost;

    @NonNull
    public final TabWidget tabs;

    private ActivityHeadsetActionNewBinding(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull FrameLayout frameLayout, @NonNull Button button, @NonNull LinearLayout linearLayout, @NonNull ListTile listTile, @NonNull CheckBox checkBox, @NonNull CheckBox checkBox2, @NonNull CheckBox checkBox3, @NonNull ListTile listTile2, @NonNull ListTile listTile3, @NonNull ListTile listTile4, @NonNull LinearLayout linearLayout2, @NonNull ListTile listTile5, @NonNull CheckBox checkBox4, @NonNull CheckBox checkBox5, @NonNull CheckBox checkBox6, @NonNull ListTile listTile6, @NonNull ListTile listTile7, @NonNull ListTile listTile8, @NonNull LinearLayout linearLayout3, @NonNull RainbowTitleBar rainbowTitleBar, @NonNull LinearLayout linearLayout4, @NonNull FrameLayout frameLayout2, @NonNull TabHost tabHost, @NonNull TabWidget tabWidget) {
        this.a = linearLayoutCompat;
        this.container = frameLayout;
        this.headsetActionDefaultBt = button;
        this.headsetLeftLl = linearLayout;
        this.headsetLeftLongPress = listTile;
        this.headsetLeftNoiseControlModeClose = checkBox;
        this.headsetLeftNoiseControlModePenetrate = checkBox2;
        this.headsetLeftNoiseControlModeReduction = checkBox3;
        this.headsetLeftShortPress = listTile2;
        this.headsetLeftShortPressThreeTimes = listTile3;
        this.headsetLeftShortPressTwice = listTile4;
        this.headsetRightLl = linearLayout2;
        this.headsetRightLongPress = listTile5;
        this.headsetRightNoiseControlModeClose = checkBox4;
        this.headsetRightNoiseControlModePenetrate = checkBox5;
        this.headsetRightNoiseControlModeReduction = checkBox6;
        this.headsetRightShortPress = listTile6;
        this.headsetRightShortPressThreeTimes = listTile7;
        this.headsetRightShortPressTwice = listTile8;
        this.leftEarSetting = linearLayout3;
        this.rainbowTitleBar = rainbowTitleBar;
        this.rightEarSetting = linearLayout4;
        this.tabcontent = frameLayout2;
        this.tabhost = tabHost;
        this.tabs = tabWidget;
    }

    @NonNull
    public static ActivityHeadsetActionNewBinding bind(@NonNull View view) {
        int i = R.id.container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.headset_action_default_bt;
            Button button = (Button) ViewBindings.findChildViewById(view, i);
            if (button != null) {
                i = R.id.headset_left_ll;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.headset_left_long_press;
                    ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
                    if (listTile != null) {
                        i = R.id.headset_left_noise_control_mode_close;
                        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i);
                        if (checkBox != null) {
                            i = R.id.headset_left_noise_control_mode_penetrate;
                            CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(view, i);
                            if (checkBox2 != null) {
                                i = R.id.headset_left_noise_control_mode_reduction;
                                CheckBox checkBox3 = (CheckBox) ViewBindings.findChildViewById(view, i);
                                if (checkBox3 != null) {
                                    i = R.id.headset_left_short_press;
                                    ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                                    if (listTile2 != null) {
                                        i = R.id.headset_left_short_press_three_times;
                                        ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(view, i);
                                        if (listTile3 != null) {
                                            i = R.id.headset_left_short_press_twice;
                                            ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(view, i);
                                            if (listTile4 != null) {
                                                i = R.id.headset_right_ll;
                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout2 != null) {
                                                    i = R.id.headset_right_long_press;
                                                    ListTile listTile5 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                    if (listTile5 != null) {
                                                        i = R.id.headset_right_noise_control_mode_close;
                                                        CheckBox checkBox4 = (CheckBox) ViewBindings.findChildViewById(view, i);
                                                        if (checkBox4 != null) {
                                                            i = R.id.headset_right_noise_control_mode_penetrate;
                                                            CheckBox checkBox5 = (CheckBox) ViewBindings.findChildViewById(view, i);
                                                            if (checkBox5 != null) {
                                                                i = R.id.headset_right_noise_control_mode_reduction;
                                                                CheckBox checkBox6 = (CheckBox) ViewBindings.findChildViewById(view, i);
                                                                if (checkBox6 != null) {
                                                                    i = R.id.headset_right_short_press;
                                                                    ListTile listTile6 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                    if (listTile6 != null) {
                                                                        i = R.id.headset_right_short_press_three_times;
                                                                        ListTile listTile7 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                        if (listTile7 != null) {
                                                                            i = R.id.headset_right_short_press_twice;
                                                                            ListTile listTile8 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                                            if (listTile8 != null) {
                                                                                i = R.id.left_ear_setting;
                                                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                if (linearLayout3 != null) {
                                                                                    i = R.id.rainbowTitleBar;
                                                                                    RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                                                                                    if (rainbowTitleBar != null) {
                                                                                        i = R.id.right_ear_setting;
                                                                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                        if (linearLayout4 != null) {
                                                                                            i = android.R.id.tabcontent;
                                                                                            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, android.R.id.tabcontent);
                                                                                            if (frameLayout2 != null) {
                                                                                                i = android.R.id.tabhost;
                                                                                                TabHost tabHost = (TabHost) ViewBindings.findChildViewById(view, android.R.id.tabhost);
                                                                                                if (tabHost != null) {
                                                                                                    i = android.R.id.tabs;
                                                                                                    TabWidget tabWidget = (TabWidget) ViewBindings.findChildViewById(view, android.R.id.tabs);
                                                                                                    if (tabWidget != null) {
                                                                                                        return new ActivityHeadsetActionNewBinding((LinearLayoutCompat) view, frameLayout, button, linearLayout, listTile, checkBox, checkBox2, checkBox3, listTile2, listTile3, listTile4, linearLayout2, listTile5, checkBox4, checkBox5, checkBox6, listTile6, listTile7, listTile8, linearLayout3, rainbowTitleBar, linearLayout4, frameLayout2, tabHost, tabWidget);
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
    public static ActivityHeadsetActionNewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityHeadsetActionNewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_headset_action_new, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.a;
    }
}
