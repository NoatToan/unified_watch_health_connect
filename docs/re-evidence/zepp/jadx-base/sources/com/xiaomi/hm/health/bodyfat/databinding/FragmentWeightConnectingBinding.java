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
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentWeightConnectingBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView btnCancel;

    @NonNull
    public final RelativeLayout deviceBindRl;

    @NonNull
    public final ImageView deviceImg;

    @NonNull
    public final ProgressView loadingView;

    @NonNull
    public final TextView subTitleTv;

    @NonNull
    public final TextView titleTv;

    private FragmentWeightConnectingBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView, @NonNull ProgressView progressView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.a = relativeLayout;
        this.btnCancel = textView;
        this.deviceBindRl = relativeLayout2;
        this.deviceImg = imageView;
        this.loadingView = progressView;
        this.subTitleTv = textView2;
        this.titleTv = textView3;
    }

    @NonNull
    public static FragmentWeightConnectingBinding bind(@NonNull View view) {
        int i = R.id.btn_cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i = R.id.device_img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.loading_view;
                ProgressView progressView = (ProgressView) ViewBindings.findChildViewById(view, i);
                if (progressView != null) {
                    i = R.id.sub_title_tv;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.title_tv;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            return new FragmentWeightConnectingBinding(relativeLayout, textView, relativeLayout, imageView, progressView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentWeightConnectingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentWeightConnectingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_weight_connecting, viewGroup, false);
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
