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
public final class LayoutWeightDetailBottomBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImageView deleteIv;

    @NonNull
    public final RelativeLayout deleteLl;

    @NonNull
    public final TextView deleteTv;

    @NonNull
    public final ImageView holdbabyIv;

    @NonNull
    public final TextView holdbabyTv;

    @NonNull
    public final RelativeLayout holdbabyWeightLl;

    @NonNull
    public final RelativeLayout manualWeightLl;

    @NonNull
    public final ImageView recordIv;

    @NonNull
    public final TextView recordTv;

    @NonNull
    public final ImageView statisticIv;

    @NonNull
    public final RelativeLayout statisticLl;

    @NonNull
    public final TextView statisticTv;

    private LayoutWeightDetailBottomBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull TextView textView2, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull ImageView imageView3, @NonNull TextView textView3, @NonNull ImageView imageView4, @NonNull RelativeLayout relativeLayout4, @NonNull TextView textView4) {
        this.a = linearLayout;
        this.deleteIv = imageView;
        this.deleteLl = relativeLayout;
        this.deleteTv = textView;
        this.holdbabyIv = imageView2;
        this.holdbabyTv = textView2;
        this.holdbabyWeightLl = relativeLayout2;
        this.manualWeightLl = relativeLayout3;
        this.recordIv = imageView3;
        this.recordTv = textView3;
        this.statisticIv = imageView4;
        this.statisticLl = relativeLayout4;
        this.statisticTv = textView4;
    }

    @NonNull
    public static LayoutWeightDetailBottomBinding bind(@NonNull View view) {
        int i = R.id.delete_iv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.delete_ll;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
                i = R.id.delete_tv;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.holdbaby_iv;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.holdbaby_tv;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.holdbaby_weight_ll;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                            if (relativeLayout2 != null) {
                                i = R.id.manual_weight_ll;
                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                if (relativeLayout3 != null) {
                                    i = R.id.record_iv;
                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView3 != null) {
                                        i = R.id.record_tv;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            i = R.id.statistic_iv;
                                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView4 != null) {
                                                i = R.id.statistic_ll;
                                                RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                if (relativeLayout4 != null) {
                                                    i = R.id.statistic_tv;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView4 != null) {
                                                        return new LayoutWeightDetailBottomBinding((LinearLayout) view, imageView, relativeLayout, textView, imageView2, textView2, relativeLayout2, relativeLayout3, imageView3, textView3, imageView4, relativeLayout4, textView4);
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
    public static LayoutWeightDetailBottomBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutWeightDetailBottomBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_weight_detail_bottom, viewGroup, false);
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
