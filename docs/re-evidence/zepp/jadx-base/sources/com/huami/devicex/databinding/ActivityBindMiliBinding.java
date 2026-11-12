package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.device.earbud.view.EarbudImageView;
import com.xiaomi.hm.health.device.view.HMLoadingView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityBindMiliBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final ImageView acceptImg;

    @NonNull
    public final RelativeLayout bindWeightRl;

    @NonNull
    public final TypefaceTextView bindWeightValue;

    @NonNull
    public final TextView bindWeightValueUnit;

    @NonNull
    public final RelativeLayout blueMonkeyVibrateRl;

    @NonNull
    public final TextView bottomTv;

    @NonNull
    public final TextView cancelTv;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final RelativeLayout deviceBindRl;

    @NonNull
    public final ImageView deviceImg;

    @NonNull
    public final EarbudImageView earbudDeviceImg;

    @NonNull
    public final FrameLayout introduceFragment;

    @NonNull
    public final ImageView leftVibrateImg;

    @NonNull
    public final LinearLayoutCompat llBottom;

    @NonNull
    public final HMLoadingView loadingView;

    @NonNull
    public final ImageView normandyLeftImg;

    @NonNull
    public final ImageView normandyRightImg;

    @NonNull
    public final TextView subTitleTv;

    @NonNull
    public final TextView titleTv;

    @NonNull
    public final TextView tvBottomLeft;

    @NonNull
    public final TextView tvBottomRight;

    @NonNull
    public final ImageView vibrateImg;

    @NonNull
    public final ViewStub viewstubBindHeadset;

    private ActivityBindMiliBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout2, @NonNull TypefaceTextView typefaceTextView, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull FrameLayout frameLayout, @NonNull RelativeLayout relativeLayout4, @NonNull ImageView imageView2, @NonNull EarbudImageView earbudImageView, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView3, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull HMLoadingView hMLoadingView, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull ImageView imageView6, @NonNull ViewStub viewStub) {
        this.a = relativeLayout;
        this.acceptImg = imageView;
        this.bindWeightRl = relativeLayout2;
        this.bindWeightValue = typefaceTextView;
        this.bindWeightValueUnit = textView;
        this.blueMonkeyVibrateRl = relativeLayout3;
        this.bottomTv = textView2;
        this.cancelTv = textView3;
        this.container = frameLayout;
        this.deviceBindRl = relativeLayout4;
        this.deviceImg = imageView2;
        this.earbudDeviceImg = earbudImageView;
        this.introduceFragment = frameLayout2;
        this.leftVibrateImg = imageView3;
        this.llBottom = linearLayoutCompat;
        this.loadingView = hMLoadingView;
        this.normandyLeftImg = imageView4;
        this.normandyRightImg = imageView5;
        this.subTitleTv = textView4;
        this.titleTv = textView5;
        this.tvBottomLeft = textView6;
        this.tvBottomRight = textView7;
        this.vibrateImg = imageView6;
        this.viewstubBindHeadset = viewStub;
    }

    @NonNull
    public static ActivityBindMiliBinding bind(@NonNull View view) {
        int i = R.id.accept_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.bind_weight_rl;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
                i = R.id.bind_weight_value;
                TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                if (typefaceTextView != null) {
                    i = R.id.bind_weight_value_unit;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.blue_monkey_vibrate_rl;
                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout2 != null) {
                            i = R.id.bottom_tv;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = R.id.cancel_tv;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = R.id.container;
                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                    if (frameLayout != null) {
                                        RelativeLayout relativeLayout3 = (RelativeLayout) view;
                                        i = R.id.device_img;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView2 != null) {
                                            i = R.id.earbud_device_img;
                                            EarbudImageView earbudImageView = (EarbudImageView) ViewBindings.findChildViewById(view, i);
                                            if (earbudImageView != null) {
                                                i = R.id.introduce_fragment;
                                                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                if (frameLayout2 != null) {
                                                    i = R.id.left_vibrate_img;
                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                    if (imageView3 != null) {
                                                        i = R.id.ll_bottom;
                                                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                        if (linearLayoutCompat != null) {
                                                            i = R.id.loading_view;
                                                            HMLoadingView hMLoadingView = (HMLoadingView) ViewBindings.findChildViewById(view, i);
                                                            if (hMLoadingView != null) {
                                                                i = R.id.normandy_left_img;
                                                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                if (imageView4 != null) {
                                                                    i = R.id.normandy_right_img;
                                                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                    if (imageView5 != null) {
                                                                        i = R.id.sub_title_tv;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView4 != null) {
                                                                            i = R.id.title_tv;
                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView5 != null) {
                                                                                i = R.id.tv_bottom_left;
                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView6 != null) {
                                                                                    i = R.id.tv_bottom_right;
                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (textView7 != null) {
                                                                                        i = R.id.vibrate_img;
                                                                                        ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                        if (imageView6 != null) {
                                                                                            i = R.id.viewstub_bind_headset;
                                                                                            ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, i);
                                                                                            if (viewStub != null) {
                                                                                                return new ActivityBindMiliBinding(relativeLayout3, imageView, relativeLayout, typefaceTextView, textView, relativeLayout2, textView2, textView3, frameLayout, relativeLayout3, imageView2, earbudImageView, frameLayout2, imageView3, linearLayoutCompat, hMLoadingView, imageView4, imageView5, textView4, textView5, textView6, textView7, imageView6, viewStub);
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
    public static ActivityBindMiliBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityBindMiliBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_bind_mili, viewGroup, false);
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
