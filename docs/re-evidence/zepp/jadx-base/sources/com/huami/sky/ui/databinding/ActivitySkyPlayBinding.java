package com.huami.sky.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.sky.ui.R;
import com.huami.sky.ui.view.SevenDayIcon;

/* JADX INFO: loaded from: classes13.dex */
public final class ActivitySkyPlayBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final SkyLayoutDeviceNotConnectedBinding skyDeviceNotConnected;

    @NonNull
    public final Group skyDeviceNotConnectedGroup;

    @NonNull
    public final AppCompatImageView skyDeviceStatusClose;

    @NonNull
    public final Group skyDeviceStatusGroup;

    @NonNull
    public final FrameLayout skyDeviceStatusLayout;

    @NonNull
    public final AppCompatTextView skyDeviceStatusTip;

    @NonNull
    public final AppCompatImageView skyDeviceTriangle;

    @NonNull
    public final Group skyFuncButtonGroup;

    @NonNull
    public final LottieAnimationView skyMusicLike;

    @NonNull
    public final AppCompatImageView skyMusicPreference;

    @NonNull
    public final LottieAnimationView skyMusicSkip;

    @NonNull
    public final TextView skyNetworkTip;

    @NonNull
    public final LottieAnimationView skyPlay;

    @NonNull
    public final LottieAnimationView skyPlayAnim;

    @NonNull
    public final AppCompatImageView skyPlayBk;

    @NonNull
    public final LottieAnimationView skyPlayBkAnim;

    @NonNull
    public final FrameLayout skyPlayLayout;

    @NonNull
    public final TextView skyPlayRetry;

    @NonNull
    public final AppCompatTextView skyPlayTitle;

    @NonNull
    public final AppCompatImageView skyRealtime;

    @NonNull
    public final AppCompatImageView skySetting;

    @NonNull
    public final SevenDayIcon skySevenDayIcon;

    @NonNull
    public final AppCompatImageView skyStop;

    @NonNull
    public final RainbowTitleBar titleBar;

    @NonNull
    public final FrameLayout weekPlanProgress;

    private ActivitySkyPlayBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SkyLayoutDeviceNotConnectedBinding skyLayoutDeviceNotConnectedBinding, @NonNull Group group, @NonNull AppCompatImageView appCompatImageView, @NonNull Group group2, @NonNull FrameLayout frameLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatImageView appCompatImageView2, @NonNull Group group3, @NonNull LottieAnimationView lottieAnimationView, @NonNull AppCompatImageView appCompatImageView3, @NonNull LottieAnimationView lottieAnimationView2, @NonNull TextView textView, @NonNull LottieAnimationView lottieAnimationView3, @NonNull LottieAnimationView lottieAnimationView4, @NonNull AppCompatImageView appCompatImageView4, @NonNull LottieAnimationView lottieAnimationView5, @NonNull FrameLayout frameLayout2, @NonNull TextView textView2, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatImageView appCompatImageView5, @NonNull AppCompatImageView appCompatImageView6, @NonNull SevenDayIcon sevenDayIcon, @NonNull AppCompatImageView appCompatImageView7, @NonNull RainbowTitleBar rainbowTitleBar, @NonNull FrameLayout frameLayout3) {
        this.a = constraintLayout;
        this.skyDeviceNotConnected = skyLayoutDeviceNotConnectedBinding;
        this.skyDeviceNotConnectedGroup = group;
        this.skyDeviceStatusClose = appCompatImageView;
        this.skyDeviceStatusGroup = group2;
        this.skyDeviceStatusLayout = frameLayout;
        this.skyDeviceStatusTip = appCompatTextView;
        this.skyDeviceTriangle = appCompatImageView2;
        this.skyFuncButtonGroup = group3;
        this.skyMusicLike = lottieAnimationView;
        this.skyMusicPreference = appCompatImageView3;
        this.skyMusicSkip = lottieAnimationView2;
        this.skyNetworkTip = textView;
        this.skyPlay = lottieAnimationView3;
        this.skyPlayAnim = lottieAnimationView4;
        this.skyPlayBk = appCompatImageView4;
        this.skyPlayBkAnim = lottieAnimationView5;
        this.skyPlayLayout = frameLayout2;
        this.skyPlayRetry = textView2;
        this.skyPlayTitle = appCompatTextView2;
        this.skyRealtime = appCompatImageView5;
        this.skySetting = appCompatImageView6;
        this.skySevenDayIcon = sevenDayIcon;
        this.skyStop = appCompatImageView7;
        this.titleBar = rainbowTitleBar;
        this.weekPlanProgress = frameLayout3;
    }

    @NonNull
    public static ActivitySkyPlayBinding bind(@NonNull View view) {
        int i = R.id.sky_device_not_connected;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            SkyLayoutDeviceNotConnectedBinding skyLayoutDeviceNotConnectedBindingBind = SkyLayoutDeviceNotConnectedBinding.bind(viewFindChildViewById);
            i = R.id.sky_device_not_connected_group;
            Group group = (Group) ViewBindings.findChildViewById(view, i);
            if (group != null) {
                i = R.id.sky_device_status_close;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = R.id.sky_device_status_group;
                    Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                    if (group2 != null) {
                        i = R.id.sky_device_status_layout;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout != null) {
                            i = R.id.sky_device_status_tip;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView != null) {
                                i = R.id.sky_device_triangle;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                if (appCompatImageView2 != null) {
                                    i = R.id.sky_func_button_group;
                                    Group group3 = (Group) ViewBindings.findChildViewById(view, i);
                                    if (group3 != null) {
                                        i = R.id.sky_music_like;
                                        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                                        if (lottieAnimationView != null) {
                                            i = R.id.sky_music_preference;
                                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatImageView3 != null) {
                                                i = R.id.sky_music_skip;
                                                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                                                if (lottieAnimationView2 != null) {
                                                    i = R.id.sky_network_tip;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView != null) {
                                                        i = R.id.sky_play;
                                                        LottieAnimationView lottieAnimationView3 = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                                                        if (lottieAnimationView3 != null) {
                                                            i = R.id.sky_play_anim;
                                                            LottieAnimationView lottieAnimationView4 = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                                                            if (lottieAnimationView4 != null) {
                                                                i = R.id.sky_play_bk;
                                                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                                if (appCompatImageView4 != null) {
                                                                    i = R.id.sky_play_bk_anim;
                                                                    LottieAnimationView lottieAnimationView5 = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                                                                    if (lottieAnimationView5 != null) {
                                                                        i = R.id.sky_play_layout;
                                                                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                                        if (frameLayout2 != null) {
                                                                            i = R.id.sky_play_retry;
                                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView2 != null) {
                                                                                i = R.id.sky_play_title;
                                                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (appCompatTextView2 != null) {
                                                                                    i = R.id.sky_realtime;
                                                                                    AppCompatImageView appCompatImageView5 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                                                    if (appCompatImageView5 != null) {
                                                                                        i = R.id.sky_setting;
                                                                                        AppCompatImageView appCompatImageView6 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                                                        if (appCompatImageView6 != null) {
                                                                                            i = R.id.sky_seven_day_icon;
                                                                                            SevenDayIcon sevenDayIcon = (SevenDayIcon) ViewBindings.findChildViewById(view, i);
                                                                                            if (sevenDayIcon != null) {
                                                                                                i = R.id.sky_stop;
                                                                                                AppCompatImageView appCompatImageView7 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                                                                if (appCompatImageView7 != null) {
                                                                                                    i = R.id.title_bar;
                                                                                                    RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                                                                                                    if (rainbowTitleBar != null) {
                                                                                                        i = R.id.week_plan_progress;
                                                                                                        FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                                                                        if (frameLayout3 != null) {
                                                                                                            return new ActivitySkyPlayBinding((ConstraintLayout) view, skyLayoutDeviceNotConnectedBindingBind, group, appCompatImageView, group2, frameLayout, appCompatTextView, appCompatImageView2, group3, lottieAnimationView, appCompatImageView3, lottieAnimationView2, textView, lottieAnimationView3, lottieAnimationView4, appCompatImageView4, lottieAnimationView5, frameLayout2, textView2, appCompatTextView2, appCompatImageView5, appCompatImageView6, sevenDayIcon, appCompatImageView7, rainbowTitleBar, frameLayout3);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySkyPlayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySkyPlayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_sky_play, viewGroup, false);
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
