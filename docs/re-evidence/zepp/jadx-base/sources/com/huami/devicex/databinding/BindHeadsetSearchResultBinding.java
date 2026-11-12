package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class BindHeadsetSearchResultBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final ImageButton bindHeadsetDeviceCancel;

    @NonNull
    public final ImageView bindHeadsetDeviceSearchImage;

    @NonNull
    public final Button bindHeadsetDeviceSure;

    @NonNull
    public final TextView bindHeadsetSearchDeviceName;

    private BindHeadsetSearchResultBinding(@NonNull FrameLayout frameLayout, @NonNull ImageButton imageButton, @NonNull ImageView imageView, @NonNull Button button, @NonNull TextView textView) {
        this.a = frameLayout;
        this.bindHeadsetDeviceCancel = imageButton;
        this.bindHeadsetDeviceSearchImage = imageView;
        this.bindHeadsetDeviceSure = button;
        this.bindHeadsetSearchDeviceName = textView;
    }

    @NonNull
    public static BindHeadsetSearchResultBinding bind(@NonNull View view) {
        int i = R.id.bind_headset_device_cancel;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            i = R.id.bind_headset_device_search_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.bind_headset_device_sure;
                Button button = (Button) ViewBindings.findChildViewById(view, i);
                if (button != null) {
                    i = R.id.bind_headset_search_device_name;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        return new BindHeadsetSearchResultBinding((FrameLayout) view, imageButton, imageView, button, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static BindHeadsetSearchResultBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static BindHeadsetSearchResultBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.bind_headset_search_result, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
