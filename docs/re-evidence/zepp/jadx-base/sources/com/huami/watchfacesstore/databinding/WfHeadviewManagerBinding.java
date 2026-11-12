package com.huami.watchfacesstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watchfacesstore.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public final class WfHeadviewManagerBinding implements ViewBinding {

    @NonNull
    private final View a;

    @NonNull
    public final FrameLayout flImage;

    @NonNull
    public final ImageView ivDeviceBg;

    @NonNull
    public final ImageView ivDevicePreview;

    @NonNull
    public final ImageView ivDeviceTransparent;

    @NonNull
    public final TextView tvHeaderWatchName;

    @NonNull
    public final TextView tvStatus;

    private WfHeadviewManagerBinding(@NonNull View rootView, @NonNull FrameLayout flImage, @NonNull ImageView ivDeviceBg, @NonNull ImageView ivDevicePreview, @NonNull ImageView ivDeviceTransparent, @NonNull TextView tvHeaderWatchName, @NonNull TextView tvStatus) {
        this.a = rootView;
        this.flImage = flImage;
        this.ivDeviceBg = ivDeviceBg;
        this.ivDevicePreview = ivDevicePreview;
        this.ivDeviceTransparent = ivDeviceTransparent;
        this.tvHeaderWatchName = tvHeaderWatchName;
        this.tvStatus = tvStatus;
    }

    @NonNull
    public static WfHeadviewManagerBinding bind(@NonNull View rootView) {
        int i = R.id.fl_image;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
        if (frameLayout != null) {
            i = R.id.iv_device_bg;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
            if (imageView != null) {
                i = R.id.iv_device_preview;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                if (imageView2 != null) {
                    i = R.id.iv_device_transparent;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                    if (imageView3 != null) {
                        i = R.id.tv_header_watch_name;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView != null) {
                            i = R.id.tv_status;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView2 != null) {
                                return new WfHeadviewManagerBinding(rootView, frameLayout, imageView, imageView2, imageView3, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static WfHeadviewManagerBinding inflate(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        Objects.requireNonNull(parent, "parent");
        inflater.inflate(R.layout.wf_headview_manager, parent);
        return bind(parent);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
