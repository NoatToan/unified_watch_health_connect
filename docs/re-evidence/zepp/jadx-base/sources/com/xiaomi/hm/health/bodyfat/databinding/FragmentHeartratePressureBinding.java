package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentHeartratePressureBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImageView iconHeartRate;

    @NonNull
    public final ImageView iconPressure;

    @NonNull
    public final ImageView ivRightArrow;

    @NonNull
    public final ImageView ivRightArrow1;

    @NonNull
    public final TextView textHeartRate;

    @NonNull
    public final TextView textPressure;

    @NonNull
    public final RelativeLayout viewHeartRate;

    @NonNull
    public final RelativeLayout viewPressure;

    private FragmentHeartratePressureBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull TextView textView, @NonNull TextView textView2, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2) {
        this.a = linearLayout;
        this.iconHeartRate = imageView;
        this.iconPressure = imageView2;
        this.ivRightArrow = imageView3;
        this.ivRightArrow1 = imageView4;
        this.textHeartRate = textView;
        this.textPressure = textView2;
        this.viewHeartRate = relativeLayout;
        this.viewPressure = relativeLayout2;
    }

    @NonNull
    public static FragmentHeartratePressureBinding bind(@NonNull View view) {
        int i = R.id.icon_heart_rate;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.icon_pressure;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.iv_right_arrow;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView3 != null) {
                    i = R.id.iv_right_arrow_1;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView4 != null) {
                        i = R.id.text_heart_rate;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.text_pressure;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = R.id.view_heart_rate;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                if (relativeLayout != null) {
                                    i = R.id.view_pressure;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                    if (relativeLayout2 != null) {
                                        return new FragmentHeartratePressureBinding((LinearLayout) view, imageView, imageView2, imageView3, imageView4, textView, textView2, relativeLayout, relativeLayout2);
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
    public static FragmentHeartratePressureBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentHeartratePressureBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_heartrate_pressure, viewGroup, false);
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
