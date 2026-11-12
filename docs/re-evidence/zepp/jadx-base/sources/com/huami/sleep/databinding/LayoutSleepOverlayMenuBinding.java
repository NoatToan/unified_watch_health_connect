package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public final class LayoutSleepOverlayMenuBinding implements ViewBinding {

    @NonNull
    private final View a;

    @NonNull
    public final ConstraintLayout closeLayout;

    @NonNull
    public final TextView hr;

    @NonNull
    public final ConstraintLayout hrLayout;

    @NonNull
    public final ImageView ivArrow;

    @NonNull
    public final ImageView ivClose;

    @NonNull
    public final ImageView ivHr;

    @NonNull
    public final ImageView ivMain;

    @NonNull
    public final ImageView ivResp;

    @NonNull
    public final ConstraintLayout main;

    @NonNull
    public final ConstraintLayout respLayout;

    @NonNull
    public final TextView tvClose;

    @NonNull
    public final TextView tvMain;

    @NonNull
    public final TextView tvResp;

    private LayoutSleepOverlayMenuBinding(@NonNull View rootView, @NonNull ConstraintLayout closeLayout, @NonNull TextView hr, @NonNull ConstraintLayout hrLayout, @NonNull ImageView ivArrow, @NonNull ImageView ivClose, @NonNull ImageView ivHr, @NonNull ImageView ivMain, @NonNull ImageView ivResp, @NonNull ConstraintLayout main, @NonNull ConstraintLayout respLayout, @NonNull TextView tvClose, @NonNull TextView tvMain, @NonNull TextView tvResp) {
        this.a = rootView;
        this.closeLayout = closeLayout;
        this.hr = hr;
        this.hrLayout = hrLayout;
        this.ivArrow = ivArrow;
        this.ivClose = ivClose;
        this.ivHr = ivHr;
        this.ivMain = ivMain;
        this.ivResp = ivResp;
        this.main = main;
        this.respLayout = respLayout;
        this.tvClose = tvClose;
        this.tvMain = tvMain;
        this.tvResp = tvResp;
    }

    @NonNull
    public static LayoutSleepOverlayMenuBinding bind(@NonNull View rootView) {
        int i = R.id.close_layout;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
        if (constraintLayout != null) {
            i = R.id.hr;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null) {
                i = R.id.hr_layout;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                if (constraintLayout2 != null) {
                    i = R.id.iv_arrow;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
                    if (imageView != null) {
                        i = R.id.iv_close;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                        if (imageView2 != null) {
                            i = R.id.iv_hr;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                            if (imageView3 != null) {
                                i = R.id.iv_main;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                if (imageView4 != null) {
                                    i = R.id.iv_resp;
                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                    if (imageView5 != null) {
                                        i = R.id.main;
                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                                        if (constraintLayout3 != null) {
                                            i = R.id.resp_layout;
                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                                            if (constraintLayout4 != null) {
                                                i = R.id.tv_close;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                if (textView2 != null) {
                                                    i = R.id.tv_main;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                    if (textView3 != null) {
                                                        i = R.id.tv_resp;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                        if (textView4 != null) {
                                                            return new LayoutSleepOverlayMenuBinding(rootView, constraintLayout, textView, constraintLayout2, imageView, imageView2, imageView3, imageView4, imageView5, constraintLayout3, constraintLayout4, textView2, textView3, textView4);
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
    public static LayoutSleepOverlayMenuBinding inflate(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        Objects.requireNonNull(parent, "parent");
        inflater.inflate(R.layout.layout_sleep_overlay_menu, parent);
        return bind(parent);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
