package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.devicex.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class LayoutSelectDeviceFooterBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    private LayoutSelectDeviceFooterBinding(@NonNull FrameLayout frameLayout) {
        this.a = frameLayout;
    }

    @NonNull
    public static LayoutSelectDeviceFooterBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new LayoutSelectDeviceFooterBinding((FrameLayout) view);
    }

    @NonNull
    public static LayoutSelectDeviceFooterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutSelectDeviceFooterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_select_device_footer, viewGroup, false);
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
