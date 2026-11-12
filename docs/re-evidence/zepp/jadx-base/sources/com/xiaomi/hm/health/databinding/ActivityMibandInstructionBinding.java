package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.view.indicator.CirclePageIndicator;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityMibandInstructionBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final ImageView bandHrImg;

    @NonNull
    public final ImageView handImg;

    @NonNull
    public final ImageView imgMiband2;

    @NonNull
    public final CirclePageIndicator indicator;

    @NonNull
    public final FrameLayout installBandContainer;

    @NonNull
    public final ImageView installDone;

    @NonNull
    public final ImageView installMiband2;

    @NonNull
    public final ImageView liftWrist;

    @NonNull
    public final FrameLayout measureHrAnimationContainer;

    @NonNull
    public final ImageView measureHrFail;

    @NonNull
    public final ImageView measureHrSuccess;

    @NonNull
    public final ImageView measuring;

    @NonNull
    public final ImageView mibandInner;

    @NonNull
    public final ImageView miliPro;

    @NonNull
    public final ImageView redHeart;

    @NonNull
    public final FrameLayout remindAnimationContainer;

    @NonNull
    public final ImageView remindImg;

    @NonNull
    public final ViewPager viewPager;

    private ActivityMibandInstructionBinding(@NonNull RelativeLayout rootView, @NonNull ImageView bandHrImg, @NonNull ImageView handImg, @NonNull ImageView imgMiband2, @NonNull CirclePageIndicator indicator, @NonNull FrameLayout installBandContainer, @NonNull ImageView installDone, @NonNull ImageView installMiband2, @NonNull ImageView liftWrist, @NonNull FrameLayout measureHrAnimationContainer, @NonNull ImageView measureHrFail, @NonNull ImageView measureHrSuccess, @NonNull ImageView measuring, @NonNull ImageView mibandInner, @NonNull ImageView miliPro, @NonNull ImageView redHeart, @NonNull FrameLayout remindAnimationContainer, @NonNull ImageView remindImg, @NonNull ViewPager viewPager) {
        this.a = rootView;
        this.bandHrImg = bandHrImg;
        this.handImg = handImg;
        this.imgMiband2 = imgMiband2;
        this.indicator = indicator;
        this.installBandContainer = installBandContainer;
        this.installDone = installDone;
        this.installMiband2 = installMiband2;
        this.liftWrist = liftWrist;
        this.measureHrAnimationContainer = measureHrAnimationContainer;
        this.measureHrFail = measureHrFail;
        this.measureHrSuccess = measureHrSuccess;
        this.measuring = measuring;
        this.mibandInner = mibandInner;
        this.miliPro = miliPro;
        this.redHeart = redHeart;
        this.remindAnimationContainer = remindAnimationContainer;
        this.remindImg = remindImg;
        this.viewPager = viewPager;
    }

    @NonNull
    public static ActivityMibandInstructionBinding bind(@NonNull View rootView) {
        int i = R.id.band_hr_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.band_hr_img);
        if (imageView != null) {
            i = R.id.hand_img;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.hand_img);
            if (imageView2 != null) {
                i = R.id.img_miband2;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_miband2);
                if (imageView3 != null) {
                    i = R.id.indicator;
                    CirclePageIndicator circlePageIndicator = (CirclePageIndicator) ViewBindings.findChildViewById(rootView, R.id.indicator);
                    if (circlePageIndicator != null) {
                        i = R.id.install_band_container;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.install_band_container);
                        if (frameLayout != null) {
                            i = R.id.install_done;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.install_done);
                            if (imageView4 != null) {
                                i = R.id.install_miband2;
                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.install_miband2);
                                if (imageView5 != null) {
                                    i = R.id.lift_wrist;
                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.lift_wrist);
                                    if (imageView6 != null) {
                                        i = R.id.measure_hr_animation_container;
                                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.measure_hr_animation_container);
                                        if (frameLayout2 != null) {
                                            i = R.id.measure_hr_fail;
                                            ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.measure_hr_fail);
                                            if (imageView7 != null) {
                                                i = R.id.measure_hr_success;
                                                ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.measure_hr_success);
                                                if (imageView8 != null) {
                                                    i = R.id.measuring;
                                                    ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.measuring);
                                                    if (imageView9 != null) {
                                                        i = R.id.miband_inner;
                                                        ImageView imageView10 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.miband_inner);
                                                        if (imageView10 != null) {
                                                            i = R.id.mili_pro;
                                                            ImageView imageView11 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.mili_pro);
                                                            if (imageView11 != null) {
                                                                i = R.id.red_heart;
                                                                ImageView imageView12 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.red_heart);
                                                                if (imageView12 != null) {
                                                                    i = R.id.remind_animation_container;
                                                                    FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.remind_animation_container);
                                                                    if (frameLayout3 != null) {
                                                                        i = R.id.remind_img;
                                                                        ImageView imageView13 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.remind_img);
                                                                        if (imageView13 != null) {
                                                                            i = R.id.view_pager;
                                                                            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.view_pager);
                                                                            if (viewPager != null) {
                                                                                return new ActivityMibandInstructionBinding((RelativeLayout) rootView, imageView, imageView2, imageView3, circlePageIndicator, frameLayout, imageView4, imageView5, imageView6, frameLayout2, imageView7, imageView8, imageView9, imageView10, imageView11, imageView12, frameLayout3, imageView13, viewPager);
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
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityMibandInstructionBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityMibandInstructionBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_miband_instruction, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
