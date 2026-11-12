package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.watch.hmwatchmanager.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes20.dex */
public final class SportOpenDeviceTipCommonDialogBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    private SportOpenDeviceTipCommonDialogBinding(@NonNull FrameLayout rootView) {
        this.a = rootView;
    }

    @NonNull
    public static SportOpenDeviceTipCommonDialogBinding bind(@NonNull View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        return new SportOpenDeviceTipCommonDialogBinding((FrameLayout) rootView);
    }

    @NonNull
    public static SportOpenDeviceTipCommonDialogBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static SportOpenDeviceTipCommonDialogBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.sport_open_device_tip_common_dialog, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
