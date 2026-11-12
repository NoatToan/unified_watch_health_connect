package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentHeadsetBindHintBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final Button done;

    @NonNull
    public final FrameLayout frameHeadsetImg;

    @NonNull
    public final AppCompatImageView headsetImg;

    @NonNull
    public final LottieAnimationView lottieBtn;

    @NonNull
    public final TextView msg;

    @NonNull
    public final Button negativeBtn;

    @NonNull
    public final Button positiveBtn;

    @NonNull
    public final TextView title;

    private FragmentHeadsetBindHintBinding(@NonNull FrameLayout frameLayout, @NonNull Button button, @NonNull FrameLayout frameLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull LottieAnimationView lottieAnimationView, @NonNull TextView textView, @NonNull Button button2, @NonNull Button button3, @NonNull TextView textView2) {
        this.a = frameLayout;
        this.done = button;
        this.frameHeadsetImg = frameLayout2;
        this.headsetImg = appCompatImageView;
        this.lottieBtn = lottieAnimationView;
        this.msg = textView;
        this.negativeBtn = button2;
        this.positiveBtn = button3;
        this.title = textView2;
    }

    @NonNull
    public static FragmentHeadsetBindHintBinding bind(@NonNull View view) {
        int i = R.id.done;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.frame_headset_img;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.headset_img;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = R.id.lottie_btn;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                    if (lottieAnimationView != null) {
                        i = R.id.msg;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.negative_btn;
                            Button button2 = (Button) ViewBindings.findChildViewById(view, i);
                            if (button2 != null) {
                                i = R.id.positive_btn;
                                Button button3 = (Button) ViewBindings.findChildViewById(view, i);
                                if (button3 != null) {
                                    i = R.id.title;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        return new FragmentHeadsetBindHintBinding((FrameLayout) view, button, frameLayout, appCompatImageView, lottieAnimationView, textView, button2, button3, textView2);
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
    public static FragmentHeadsetBindHintBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentHeadsetBindHintBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_headset_bind_hint, viewGroup, false);
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
