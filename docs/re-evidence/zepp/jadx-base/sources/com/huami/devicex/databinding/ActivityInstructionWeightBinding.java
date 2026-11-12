package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.huami.devicex.R;
import com.xiaomi.hm.health.view.RippleBackground;
import com.xiaomi.hm.health.view.indicator.CirclePageIndicator;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityInstructionWeightBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final RippleBackground content;

    @NonNull
    public final RelativeLayout inWeightPage1PhoneAndDot;

    @NonNull
    public final CirclePageIndicator indicator;

    @NonNull
    public final RelativeLayout instructionWeightBg34;

    @NonNull
    public final ImageView instructionWeightBigWeight;

    @NonNull
    public final ImageView instructionWeightFlatwise;

    @NonNull
    public final ImageView instructionWeightFoot;

    @NonNull
    public final ImageView instructionWeightImgPhone;

    @NonNull
    public final ImageView instructionWeightImgPhone1;

    @NonNull
    public final ImageView instructionWeightImgPhoneBack1;

    @NonNull
    public final ImageView instructionWeightImgPhoneBack2;

    @NonNull
    public final ImageView instructionWeightImgSwipe;

    @NonNull
    public final ImageView instructionWeightImgWeight;

    @NonNull
    public final LinearLayout instructionWeightImgWeightMagnify;

    @NonNull
    public final ImageView instructionWeightImgWeightOverturn;

    @NonNull
    public final LinearLayout instructionWeightLine;

    @NonNull
    public final ImageView instructionWeightLow;

    @NonNull
    public final ImageView instructionWeightOverMax;

    @NonNull
    public final RelativeLayout instructionWeightPage6;

    @NonNull
    public final LinearLayout instructionWeightPage6Tips1;

    @NonNull
    public final RelativeLayout instructionWeightPage6Tips2;

    @NonNull
    public final LinearLayout instructionWeightPage6Tips3;

    @NonNull
    public final RelativeLayout instructionWeightPhones;

    @NonNull
    public final ViewPager viewPager;

    @NonNull
    public final ImageView weightLeftArrow;

    @NonNull
    public final ImageView weightRightArrow;

    private ActivityInstructionWeightBinding(@NonNull LinearLayout linearLayout, @NonNull RippleBackground rippleBackground, @NonNull RelativeLayout relativeLayout, @NonNull CirclePageIndicator circlePageIndicator, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull ImageView imageView7, @NonNull ImageView imageView8, @NonNull ImageView imageView9, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView10, @NonNull LinearLayout linearLayout3, @NonNull ImageView imageView11, @NonNull ImageView imageView12, @NonNull RelativeLayout relativeLayout3, @NonNull LinearLayout linearLayout4, @NonNull RelativeLayout relativeLayout4, @NonNull LinearLayout linearLayout5, @NonNull RelativeLayout relativeLayout5, @NonNull ViewPager viewPager, @NonNull ImageView imageView13, @NonNull ImageView imageView14) {
        this.a = linearLayout;
        this.content = rippleBackground;
        this.inWeightPage1PhoneAndDot = relativeLayout;
        this.indicator = circlePageIndicator;
        this.instructionWeightBg34 = relativeLayout2;
        this.instructionWeightBigWeight = imageView;
        this.instructionWeightFlatwise = imageView2;
        this.instructionWeightFoot = imageView3;
        this.instructionWeightImgPhone = imageView4;
        this.instructionWeightImgPhone1 = imageView5;
        this.instructionWeightImgPhoneBack1 = imageView6;
        this.instructionWeightImgPhoneBack2 = imageView7;
        this.instructionWeightImgSwipe = imageView8;
        this.instructionWeightImgWeight = imageView9;
        this.instructionWeightImgWeightMagnify = linearLayout2;
        this.instructionWeightImgWeightOverturn = imageView10;
        this.instructionWeightLine = linearLayout3;
        this.instructionWeightLow = imageView11;
        this.instructionWeightOverMax = imageView12;
        this.instructionWeightPage6 = relativeLayout3;
        this.instructionWeightPage6Tips1 = linearLayout4;
        this.instructionWeightPage6Tips2 = relativeLayout4;
        this.instructionWeightPage6Tips3 = linearLayout5;
        this.instructionWeightPhones = relativeLayout5;
        this.viewPager = viewPager;
        this.weightLeftArrow = imageView13;
        this.weightRightArrow = imageView14;
    }

    @NonNull
    public static ActivityInstructionWeightBinding bind(@NonNull View view) {
        int i = R.id.content;
        RippleBackground rippleBackground = (RippleBackground) ViewBindings.findChildViewById(view, i);
        if (rippleBackground != null) {
            i = R.id.in_weight_page1_phone_and_dot;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
                i = R.id.indicator;
                CirclePageIndicator circlePageIndicator = (CirclePageIndicator) ViewBindings.findChildViewById(view, i);
                if (circlePageIndicator != null) {
                    i = R.id.instruction_weight_bg_34;
                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout2 != null) {
                        i = R.id.instruction_weight_big_weight;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = R.id.instruction_weight_flatwise;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = R.id.instruction_weight_foot;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView3 != null) {
                                    i = R.id.instruction_weight_img_phone;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView4 != null) {
                                        i = R.id.instruction_weight_img_phone1;
                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView5 != null) {
                                            i = R.id.instruction_weight_img_phone_back1;
                                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView6 != null) {
                                                i = R.id.instruction_weight_img_phone_back2;
                                                ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                if (imageView7 != null) {
                                                    i = R.id.instruction_weight_img_swipe;
                                                    ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                    if (imageView8 != null) {
                                                        i = R.id.instruction_weight_img_weight;
                                                        ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                        if (imageView9 != null) {
                                                            i = R.id.instruction_weight_img_weight_magnify;
                                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                            if (linearLayout != null) {
                                                                i = R.id.instruction_weight_img_weight_overturn;
                                                                ImageView imageView10 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                if (imageView10 != null) {
                                                                    i = R.id.instruction_weight_line;
                                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (linearLayout2 != null) {
                                                                        i = R.id.instruction_weight_low;
                                                                        ImageView imageView11 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                        if (imageView11 != null) {
                                                                            i = R.id.instruction_weight_overMax;
                                                                            ImageView imageView12 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                            if (imageView12 != null) {
                                                                                i = R.id.instruction_weight_page_6;
                                                                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                                                if (relativeLayout3 != null) {
                                                                                    i = R.id.instruction_weight_page6_tips1;
                                                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                    if (linearLayout3 != null) {
                                                                                        i = R.id.instruction_weight_page6_tips2;
                                                                                        RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                                                        if (relativeLayout4 != null) {
                                                                                            i = R.id.instruction_weight_page6_tips3;
                                                                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                            if (linearLayout4 != null) {
                                                                                                i = R.id.instruction_weight_phones;
                                                                                                RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                                                                if (relativeLayout5 != null) {
                                                                                                    i = R.id.view_pager;
                                                                                                    ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i);
                                                                                                    if (viewPager != null) {
                                                                                                        i = R.id.weight_left_arrow;
                                                                                                        ImageView imageView13 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (imageView13 != null) {
                                                                                                            i = R.id.weight_right_arrow;
                                                                                                            ImageView imageView14 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (imageView14 != null) {
                                                                                                                return new ActivityInstructionWeightBinding((LinearLayout) view, rippleBackground, relativeLayout, circlePageIndicator, relativeLayout2, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, linearLayout, imageView10, linearLayout2, imageView11, imageView12, relativeLayout3, linearLayout3, relativeLayout4, linearLayout4, relativeLayout5, viewPager, imageView13, imageView14);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityInstructionWeightBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityInstructionWeightBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_instruction_weight, viewGroup, false);
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
