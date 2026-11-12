package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.view.HMLoadingView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityStopDeviceBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView btCancelTv;

    @NonNull
    public final RelativeLayout btDisableRl;

    @NonNull
    public final TextView btEnableTv;

    @NonNull
    public final View centerView;

    @NonNull
    public final FrameLayout chooseContainer;

    @NonNull
    public final ImageView deviceImg;

    @NonNull
    public final AppCompatImageView deviceSuccessImg;

    @NonNull
    public final Guideline guideline;

    @NonNull
    public final HMLoadingView loadingView;

    @NonNull
    public final ConstraintLayout startSuccessRl;

    @NonNull
    public final TextView stopAndUseTv;

    @NonNull
    public final TextView stopDeviceSubTitleTv;

    @NonNull
    public final TextView switchConfirm;

    @NonNull
    public final TextView titleTv;

    @NonNull
    public final AppCompatImageView useSuccessImg;

    @NonNull
    public final RelativeLayout workRl;

    private ActivityStopDeviceBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView2, @NonNull View view, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull AppCompatImageView appCompatImageView, @NonNull Guideline guideline, @NonNull HMLoadingView hMLoadingView, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull AppCompatImageView appCompatImageView2, @NonNull RelativeLayout relativeLayout3) {
        this.a = relativeLayout;
        this.btCancelTv = textView;
        this.btDisableRl = relativeLayout2;
        this.btEnableTv = textView2;
        this.centerView = view;
        this.chooseContainer = frameLayout;
        this.deviceImg = imageView;
        this.deviceSuccessImg = appCompatImageView;
        this.guideline = guideline;
        this.loadingView = hMLoadingView;
        this.startSuccessRl = constraintLayout;
        this.stopAndUseTv = textView3;
        this.stopDeviceSubTitleTv = textView4;
        this.switchConfirm = textView5;
        this.titleTv = textView6;
        this.useSuccessImg = appCompatImageView2;
        this.workRl = relativeLayout3;
    }

    @NonNull
    public static ActivityStopDeviceBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.bt_cancel_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.bt_disable_rl;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
                i = R.id.bt_enable_tv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.center_view))) != null) {
                    i = R.id.choose_container;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout != null) {
                        i = R.id.device_img;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = R.id.device_success_img;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                            if (appCompatImageView != null) {
                                i = R.id.guideline;
                                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                if (guideline != null) {
                                    i = R.id.loading_view;
                                    HMLoadingView hMLoadingView = (HMLoadingView) ViewBindings.findChildViewById(view, i);
                                    if (hMLoadingView != null) {
                                        i = R.id.start_success_rl;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout != null) {
                                            i = R.id.stop_and_use_tv;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView3 != null) {
                                                i = R.id.stop_device_sub_title_tv;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView4 != null) {
                                                    i = R.id.switch_confirm;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView5 != null) {
                                                        i = R.id.title_tv;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView6 != null) {
                                                            i = R.id.use_success_img;
                                                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                            if (appCompatImageView2 != null) {
                                                                i = R.id.work_rl;
                                                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                                if (relativeLayout2 != null) {
                                                                    return new ActivityStopDeviceBinding((RelativeLayout) view, textView, relativeLayout, textView2, viewFindChildViewById, frameLayout, imageView, appCompatImageView, guideline, hMLoadingView, constraintLayout, textView3, textView4, textView5, textView6, appCompatImageView2, relativeLayout2);
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
    public static ActivityStopDeviceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityStopDeviceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_stop_device, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
