package com.huami.watchfacesstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watchfacesstore.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public final class WfTitleBarBinding implements ViewBinding {

    @NonNull
    private final View a;

    @NonNull
    public final ImageView ivBack;

    @NonNull
    public final TextView tvRight;

    @NonNull
    public final TextView tvTitle;

    private WfTitleBarBinding(@NonNull View rootView, @NonNull ImageView ivBack, @NonNull TextView tvRight, @NonNull TextView tvTitle) {
        this.a = rootView;
        this.ivBack = ivBack;
        this.tvRight = tvRight;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static WfTitleBarBinding bind(@NonNull View rootView) {
        int i = R.id.iv_back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
        if (imageView != null) {
            i = R.id.tv_right;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null) {
                i = R.id.tv_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView2 != null) {
                    return new WfTitleBarBinding(rootView, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static WfTitleBarBinding inflate(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        Objects.requireNonNull(parent, "parent");
        inflater.inflate(R.layout.wf_title_bar, parent);
        return bind(parent);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
