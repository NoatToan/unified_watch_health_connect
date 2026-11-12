package com.huami.applet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.applet.R;

/* JADX INFO: loaded from: classes5.dex */
public final class AppletActivitySettingBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final Button btnOpt;

    @NonNull
    public final ConstraintLayout clDefault;

    @NonNull
    public final ImageView ivErrorImage;

    @NonNull
    public final LinearLayout setting;

    @NonNull
    public final TextView tvErrorTip;

    private AppletActivitySettingBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView) {
        this.a = linearLayout;
        this.btnOpt = button;
        this.clDefault = constraintLayout;
        this.ivErrorImage = imageView;
        this.setting = linearLayout2;
        this.tvErrorTip = textView;
    }

    @NonNull
    public static AppletActivitySettingBinding bind(@NonNull View view) {
        int i = R.id.btn_opt;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.cl_default;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.iv_error_image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i = R.id.tv_error_tip;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        return new AppletActivitySettingBinding(linearLayout, button, constraintLayout, imageView, linearLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static AppletActivitySettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static AppletActivitySettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.applet_activity_setting, viewGroup, false);
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
