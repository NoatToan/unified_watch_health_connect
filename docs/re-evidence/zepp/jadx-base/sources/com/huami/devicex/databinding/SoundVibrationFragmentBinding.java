package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;

/* JADX INFO: loaded from: classes7.dex */
public final class SoundVibrationFragmentBinding implements ViewBinding {

    @NonNull
    private final LinearLayoutCompat a;

    @NonNull
    public final AppCompatImageView btnBack;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final ListTile deviceSettingRingtoneReminder;

    @NonNull
    public final ListTile deviceSettingSoundCrownVibration;

    @NonNull
    public final ListTile deviceSettingSoundNotificationVibration;

    @NonNull
    public final ListTile deviceSettingSoundSystemVibration;

    @NonNull
    public final SeekBar deviceSettingVolumeController;

    @NonNull
    public final ConstraintLayout deviceSettingVolumeViewGroup;

    @NonNull
    public final ImageView dsIconVolumeEnd;

    @NonNull
    public final ImageView dsIconVolumeStart;

    @NonNull
    public final TextView dsSettingVolumeTitle;

    @NonNull
    public final View maskView;

    @NonNull
    public final ViewStub soundStrengthVibration;

    @NonNull
    public final Toolbar toolbar;

    @NonNull
    public final TextView toolbarTitle;

    private SoundVibrationFragmentBinding(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull AppCompatImageView appCompatImageView, @NonNull FrameLayout frameLayout, @NonNull ListTile listTile, @NonNull ListTile listTile2, @NonNull ListTile listTile3, @NonNull ListTile listTile4, @NonNull SeekBar seekBar, @NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull View view, @NonNull ViewStub viewStub, @NonNull Toolbar toolbar, @NonNull TextView textView2) {
        this.a = linearLayoutCompat;
        this.btnBack = appCompatImageView;
        this.container = frameLayout;
        this.deviceSettingRingtoneReminder = listTile;
        this.deviceSettingSoundCrownVibration = listTile2;
        this.deviceSettingSoundNotificationVibration = listTile3;
        this.deviceSettingSoundSystemVibration = listTile4;
        this.deviceSettingVolumeController = seekBar;
        this.deviceSettingVolumeViewGroup = constraintLayout;
        this.dsIconVolumeEnd = imageView;
        this.dsIconVolumeStart = imageView2;
        this.dsSettingVolumeTitle = textView;
        this.maskView = view;
        this.soundStrengthVibration = viewStub;
        this.toolbar = toolbar;
        this.toolbarTitle = textView2;
    }

    @NonNull
    public static SoundVibrationFragmentBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.btn_back;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.device_setting_ringtone_reminder;
                ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
                if (listTile != null) {
                    i = R.id.device_setting_sound_crown_vibration;
                    ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                    if (listTile2 != null) {
                        i = R.id.device_setting_sound_notification_vibration;
                        ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(view, i);
                        if (listTile3 != null) {
                            i = R.id.device_setting_sound_system_vibration;
                            ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(view, i);
                            if (listTile4 != null) {
                                i = R.id.device_setting_volume_controller;
                                SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(view, i);
                                if (seekBar != null) {
                                    i = R.id.device_setting_volume_viewGroup;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout != null) {
                                        i = R.id.ds_icon_volume_end;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView != null) {
                                            i = R.id.ds_icon_volume_start;
                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView2 != null) {
                                                i = R.id.ds_setting_volume_title;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.mask_view))) != null) {
                                                    i = R.id.sound_strength_vibration;
                                                    ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, i);
                                                    if (viewStub != null) {
                                                        i = R.id.toolbar;
                                                        Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i);
                                                        if (toolbar != null) {
                                                            i = R.id.toolbar_title;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView2 != null) {
                                                                return new SoundVibrationFragmentBinding((LinearLayoutCompat) view, appCompatImageView, frameLayout, listTile, listTile2, listTile3, listTile4, seekBar, constraintLayout, imageView, imageView2, textView, viewFindChildViewById, viewStub, toolbar, textView2);
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
    public static SoundVibrationFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static SoundVibrationFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.sound_vibration_fragment, viewGroup, false);
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
