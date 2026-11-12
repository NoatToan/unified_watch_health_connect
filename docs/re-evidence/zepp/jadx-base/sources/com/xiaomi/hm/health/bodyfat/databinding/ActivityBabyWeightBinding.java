package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityBabyWeightBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView babyWeightContent;

    @NonNull
    public final ImageView babyWeightImgBody;

    @NonNull
    public final RelativeLayout babyWeightImgLayout;

    @NonNull
    public final TextView babyWeightTitle;

    @NonNull
    public final TypefaceTextView babyWeightValue;

    @NonNull
    public final LinearLayout babyWeightValueArea;

    @NonNull
    public final TextView babyWeightValueUnit;

    @NonNull
    public final FrameLayout familyContainer;

    @NonNull
    public final TextView tipsTv;

    private ActivityBabyWeightBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView2, @NonNull TypefaceTextView typefaceTextView, @NonNull LinearLayout linearLayout, @NonNull TextView textView3, @NonNull FrameLayout frameLayout, @NonNull TextView textView4) {
        this.a = relativeLayout;
        this.babyWeightContent = textView;
        this.babyWeightImgBody = imageView;
        this.babyWeightImgLayout = relativeLayout2;
        this.babyWeightTitle = textView2;
        this.babyWeightValue = typefaceTextView;
        this.babyWeightValueArea = linearLayout;
        this.babyWeightValueUnit = textView3;
        this.familyContainer = frameLayout;
        this.tipsTv = textView4;
    }

    @NonNull
    public static ActivityBabyWeightBinding bind(@NonNull View view) {
        int i = R.id.baby_weight_content;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.baby_weight_img_body;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.baby_weight_img_layout;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout != null) {
                    i = R.id.baby_weight_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.baby_weight_value;
                        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                        if (typefaceTextView != null) {
                            i = R.id.baby_weight_value_area;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = R.id.baby_weight_value_unit;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = R.id.family_container;
                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                    if (frameLayout != null) {
                                        i = R.id.tips_tv;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            return new ActivityBabyWeightBinding((RelativeLayout) view, textView, imageView, relativeLayout, textView2, typefaceTextView, linearLayout, textView3, frameLayout, textView4);
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
    public static ActivityBabyWeightBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityBabyWeightBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_baby_weight, viewGroup, false);
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
