package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchSkinLinearItemMyBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final CheckBox skinCb;

    @NonNull
    public final AppCompatImageView skinIv;

    @NonNull
    public final AppCompatImageView skinIvMask;

    @NonNull
    public final TextView skinTvName;

    @NonNull
    public final TextView skinTvPrice;

    private WatchSkinLinearItemMyBinding(@NonNull LinearLayout linearLayout, @NonNull CheckBox checkBox, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.a = linearLayout;
        this.skinCb = checkBox;
        this.skinIv = appCompatImageView;
        this.skinIvMask = appCompatImageView2;
        this.skinTvName = textView;
        this.skinTvPrice = textView2;
    }

    @NonNull
    public static WatchSkinLinearItemMyBinding bind(@NonNull View view) {
        int i = R.id.skin_cb;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i);
        if (checkBox != null) {
            i = R.id.skin_iv;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = R.id.skin_iv_mask;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView2 != null) {
                    i = R.id.skin_tv_name;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.skin_tv_price;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            return new WatchSkinLinearItemMyBinding((LinearLayout) view, checkBox, appCompatImageView, appCompatImageView2, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static WatchSkinLinearItemMyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static WatchSkinLinearItemMyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.watch_skin_linear_item_my, viewGroup, false);
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
