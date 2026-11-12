package com.huami.devicex.databinding;

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
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.earbud.view.EarbudImageView;
import com.xiaomi.hm.health.device.view.HMLoadingView;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentEarbudNotConnectBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView disMsg;

    @NonNull
    public final TextView disTitle;

    @NonNull
    public final EarbudImageView earbudDeviceImg;

    @NonNull
    public final HMLoadingView loadingView;

    @NonNull
    public final LinearLayout noBle;

    @NonNull
    public final TextView openBle;

    @NonNull
    public final ImageView setBtn;

    @NonNull
    public final RelativeLayout titleContent;

    @NonNull
    public final ImageView updateRedDot;

    private FragmentEarbudNotConnectBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull EarbudImageView earbudImageView, @NonNull HMLoadingView hMLoadingView, @NonNull LinearLayout linearLayout, @NonNull TextView textView3, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView2) {
        this.a = relativeLayout;
        this.disMsg = textView;
        this.disTitle = textView2;
        this.earbudDeviceImg = earbudImageView;
        this.loadingView = hMLoadingView;
        this.noBle = linearLayout;
        this.openBle = textView3;
        this.setBtn = imageView;
        this.titleContent = relativeLayout2;
        this.updateRedDot = imageView2;
    }

    @NonNull
    public static FragmentEarbudNotConnectBinding bind(@NonNull View view) {
        int i = R.id.dis_msg;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.dis_title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.earbud_device_img;
                EarbudImageView earbudImageView = (EarbudImageView) ViewBindings.findChildViewById(view, i);
                if (earbudImageView != null) {
                    i = R.id.loading_view;
                    HMLoadingView hMLoadingView = (HMLoadingView) ViewBindings.findChildViewById(view, i);
                    if (hMLoadingView != null) {
                        i = R.id.no_ble;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = R.id.open_ble;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = R.id.set_btn;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView != null) {
                                    i = R.id.title_content;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                    if (relativeLayout != null) {
                                        i = R.id.update_red_dot;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView2 != null) {
                                            return new FragmentEarbudNotConnectBinding((RelativeLayout) view, textView, textView2, earbudImageView, hMLoadingView, linearLayout, textView3, imageView, relativeLayout, imageView2);
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
    public static FragmentEarbudNotConnectBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentEarbudNotConnectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_earbud_not_connect, viewGroup, false);
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
