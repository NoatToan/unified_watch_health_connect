package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.view.progress.ProgressView;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class MemberSetWeightLayoutBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final ImageView iconImage;

    @NonNull
    public final TextView tipsTv;

    @NonNull
    public final TextView titleTv;

    @NonNull
    public final TextView unitTv;

    @NonNull
    public final ProgressView weightChart;

    @NonNull
    public final TypefaceTextView weightValue;

    @NonNull
    public final TextView writeWeightTv;

    private MemberSetWeightLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ProgressView progressView, @NonNull TypefaceTextView typefaceTextView, @NonNull TextView textView4) {
        this.a = relativeLayout;
        this.iconImage = imageView;
        this.tipsTv = textView;
        this.titleTv = textView2;
        this.unitTv = textView3;
        this.weightChart = progressView;
        this.weightValue = typefaceTextView;
        this.writeWeightTv = textView4;
    }

    @NonNull
    public static MemberSetWeightLayoutBinding bind(@NonNull View view) {
        int i = R.id.iconImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.tips_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.title_tv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.unit_tv;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.weight_chart;
                        ProgressView progressView = (ProgressView) ViewBindings.findChildViewById(view, i);
                        if (progressView != null) {
                            i = R.id.weight_value;
                            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                            if (typefaceTextView != null) {
                                i = R.id.write_weight_tv;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    return new MemberSetWeightLayoutBinding((RelativeLayout) view, imageView, textView, textView2, textView3, progressView, typefaceTextView, textView4);
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
    public static MemberSetWeightLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MemberSetWeightLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.member_set_weight_layout, viewGroup, false);
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
