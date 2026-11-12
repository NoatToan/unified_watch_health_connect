package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.view.LaunchAdView;
import java.util.Objects;

/* JADX INFO: loaded from: classes20.dex */
public final class LayoutLaunchAdBinding implements ViewBinding {

    @NonNull
    private final LaunchAdView a;

    private LayoutLaunchAdBinding(@NonNull LaunchAdView rootView) {
        this.a = rootView;
    }

    @NonNull
    public static LayoutLaunchAdBinding bind(@NonNull View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        return new LayoutLaunchAdBinding((LaunchAdView) rootView);
    }

    @NonNull
    public static LayoutLaunchAdBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutLaunchAdBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_launch_ad, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LaunchAdView getRoot() {
        return this.a;
    }
}
