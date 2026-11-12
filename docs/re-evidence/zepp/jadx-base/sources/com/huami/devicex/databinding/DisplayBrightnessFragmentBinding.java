package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;

/* JADX INFO: loaded from: classes7.dex */
public final class DisplayBrightnessFragmentBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final AppCompatImageView btnBack;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final TextView dSettingBrightness;

    @NonNull
    public final ConstraintLayout dSettingBrightnessViewGroup;

    @NonNull
    public final ListTile deviceSettingAutoScreen;

    @NonNull
    public final ListTile deviceSettingAutomaticBrightness;

    @NonNull
    public final SeekBar deviceSettingLightController;

    @NonNull
    public final TextView displayBrightnessTitle;

    @NonNull
    public final ListTile dsInterestScreenDisplay;

    @NonNull
    public final View maskView;

    @NonNull
    public final ListTile miliSettingGesScreenLl;

    @NonNull
    public final ImageView tdIconBrightnessEnd;

    @NonNull
    public final ImageView tdIconBrightnessStart;

    @NonNull
    public final Toolbar toolbar;

    private DisplayBrightnessFragmentBinding(@NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull FrameLayout frameLayout2, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout, @NonNull ListTile listTile, @NonNull ListTile listTile2, @NonNull SeekBar seekBar, @NonNull TextView textView2, @NonNull ListTile listTile3, @NonNull View view, @NonNull ListTile listTile4, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull Toolbar toolbar) {
        this.a = frameLayout;
        this.btnBack = appCompatImageView;
        this.container = frameLayout2;
        this.dSettingBrightness = textView;
        this.dSettingBrightnessViewGroup = constraintLayout;
        this.deviceSettingAutoScreen = listTile;
        this.deviceSettingAutomaticBrightness = listTile2;
        this.deviceSettingLightController = seekBar;
        this.displayBrightnessTitle = textView2;
        this.dsInterestScreenDisplay = listTile3;
        this.maskView = view;
        this.miliSettingGesScreenLl = listTile4;
        this.tdIconBrightnessEnd = imageView;
        this.tdIconBrightnessStart = imageView2;
        this.toolbar = toolbar;
    }

    @NonNull
    public static DisplayBrightnessFragmentBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.btn_back;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.d_setting_brightness;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.d_setting_brightness_ViewGroup;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = R.id.device_setting_auto_screen;
                        ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
                        if (listTile != null) {
                            i = R.id.device_setting_automatic_brightness;
                            ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                            if (listTile2 != null) {
                                i = R.id.device_setting_light_controller;
                                SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(view, i);
                                if (seekBar != null) {
                                    i = R.id.display_brightness_title;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = R.id.ds_interest_screen_display;
                                        ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(view, i);
                                        if (listTile3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.mask_view))) != null) {
                                            i = R.id.mili_setting_ges_screen_ll;
                                            ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(view, i);
                                            if (listTile4 != null) {
                                                i = R.id.td_icon_brightness_end;
                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                                if (imageView != null) {
                                                    i = R.id.td_icon_brightness_start;
                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                    if (imageView2 != null) {
                                                        i = R.id.toolbar;
                                                        Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i);
                                                        if (toolbar != null) {
                                                            return new DisplayBrightnessFragmentBinding((FrameLayout) view, appCompatImageView, frameLayout, textView, constraintLayout, listTile, listTile2, seekBar, textView2, listTile3, viewFindChildViewById, listTile4, imageView, imageView2, toolbar);
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
    public static DisplayBrightnessFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DisplayBrightnessFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.display_brightness_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
