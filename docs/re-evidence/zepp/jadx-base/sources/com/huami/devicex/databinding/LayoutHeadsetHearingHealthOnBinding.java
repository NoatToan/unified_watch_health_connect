package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.headset.ui.MarqueeView;

/* JADX INFO: loaded from: classes7.dex */
public final class LayoutHeadsetHearingHealthOnBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final FrameLayout headsetHearingHealthOn;

    @NonNull
    public final ConstraintLayout headsetHearingHealthOnConstraintLayout;

    @NonNull
    public final ImageView headsetRefreshButton;

    @NonNull
    public final ImageView iconLeftEar;

    @NonNull
    public final ImageView iconRightEar;

    @NonNull
    public final TextView leftEarUserTime;

    @NonNull
    public final MarqueeView marqueeView;

    @NonNull
    public final View maskView;

    @NonNull
    public final ProgressBar progressBarLeft;

    @NonNull
    public final ProgressBar progressBarRight;

    @NonNull
    public final TextView rightEarUserTime;

    @NonNull
    public final TextView suggestionUseTime;

    @NonNull
    public final ImageView suggestionUseTimeCaveat;

    @NonNull
    public final TextView titleLeftEar;

    @NonNull
    public final TextView titleRightEar;

    @NonNull
    public final TextView userTimeHint;

    @NonNull
    public final TextView volumeDecibelDescription;

    @NonNull
    public final TextView volumeDecibelUnit;

    @NonNull
    public final TextView volumeDecibelValue;

    private LayoutHeadsetHearingHealthOnBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView, @NonNull MarqueeView marqueeView, @NonNull View view, @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ImageView imageView4, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9) {
        this.a = frameLayout;
        this.headsetHearingHealthOn = frameLayout2;
        this.headsetHearingHealthOnConstraintLayout = constraintLayout;
        this.headsetRefreshButton = imageView;
        this.iconLeftEar = imageView2;
        this.iconRightEar = imageView3;
        this.leftEarUserTime = textView;
        this.marqueeView = marqueeView;
        this.maskView = view;
        this.progressBarLeft = progressBar;
        this.progressBarRight = progressBar2;
        this.rightEarUserTime = textView2;
        this.suggestionUseTime = textView3;
        this.suggestionUseTimeCaveat = imageView4;
        this.titleLeftEar = textView4;
        this.titleRightEar = textView5;
        this.userTimeHint = textView6;
        this.volumeDecibelDescription = textView7;
        this.volumeDecibelUnit = textView8;
        this.volumeDecibelValue = textView9;
    }

    @NonNull
    public static LayoutHeadsetHearingHealthOnBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        FrameLayout frameLayout = (FrameLayout) view;
        int i = R.id.headset_hearing_health_on_constraintLayout;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.headset_refresh_button;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.icon_left_ear;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = R.id.icon_right_ear;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView3 != null) {
                        i = R.id.left_ear_user_time;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.marqueeView;
                            MarqueeView marqueeView = (MarqueeView) ViewBindings.findChildViewById(view, i);
                            if (marqueeView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.mask_view))) != null) {
                                i = R.id.progress_bar_left;
                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                                if (progressBar != null) {
                                    i = R.id.progress_bar_right;
                                    ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, i);
                                    if (progressBar2 != null) {
                                        i = R.id.right_ear_user_time;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            i = R.id.suggestion_use_time;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView3 != null) {
                                                i = R.id.suggestion_use_time_caveat;
                                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                if (imageView4 != null) {
                                                    i = R.id.title_left_ear;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView4 != null) {
                                                        i = R.id.title_right_ear;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView5 != null) {
                                                            i = R.id.user_time_hint;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView6 != null) {
                                                                i = R.id.volume_decibel_description;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView7 != null) {
                                                                    i = R.id.volume_decibel_unit;
                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView8 != null) {
                                                                        i = R.id.volume_decibel_value;
                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView9 != null) {
                                                                            return new LayoutHeadsetHearingHealthOnBinding(frameLayout, frameLayout, constraintLayout, imageView, imageView2, imageView3, textView, marqueeView, viewFindChildViewById, progressBar, progressBar2, textView2, textView3, imageView4, textView4, textView5, textView6, textView7, textView8, textView9);
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
    public static LayoutHeadsetHearingHealthOnBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutHeadsetHearingHealthOnBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_headset_hearing_health_on, viewGroup, false);
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
