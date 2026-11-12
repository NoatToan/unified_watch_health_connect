package com.huami.watchfacesstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.view.banner.Banner;

/* JADX INFO: loaded from: classes17.dex */
public final class WfHomeItemBannerBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final Banner homeBanner;

    private WfHomeItemBannerBinding(@NonNull LinearLayout rootView, @NonNull Banner homeBanner) {
        this.a = rootView;
        this.homeBanner = homeBanner;
    }

    @NonNull
    public static WfHomeItemBannerBinding bind(@NonNull View rootView) {
        int i = R.id.home_banner;
        Banner banner = (Banner) ViewBindings.findChildViewById(rootView, i);
        if (banner != null) {
            return new WfHomeItemBannerBinding((LinearLayout) rootView, banner);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static WfHomeItemBannerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WfHomeItemBannerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_home_item_banner, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
